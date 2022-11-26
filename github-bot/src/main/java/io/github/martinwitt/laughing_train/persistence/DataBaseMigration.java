package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Filters;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.impl.BadSmellRepositoryImpl;
import io.github.martinwitt.laughing_train.persistence.impl.ProjectRepositoryImpl;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import io.vertx.core.Vertx;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * This class is used to migrate the database to the latest version.
 */
@ApplicationScoped
public class DataBaseMigration {

    private static final Random RANDOM = new Random();

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    ProjectConfigRepository projectConfigRepository;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    BadSmellRepository badSmellRepository;
    // we use this for faster mongodb access
    @Inject
    BadSmellRepositoryImpl badSmellRepositoryImpl;

    @Inject
    ProjectRepositoryImpl projectRepositoryImpl;

    @Inject
    Vertx vertx;
    /**
     * This method is called by the quarkus framework to migrate the database.
     */
    public void onStart(@Observes StartupEvent event) {
        checkPeriodic();
    }

    public void checkPeriodic() {
        vertx.setPeriodic(
                TimeUnit.MINUTES.toMillis(2),
                TimeUnit.MINUTES.toMillis(10),
                id -> vertx.executeBlocking(v -> migrateDataBase()));
        vertx.setPeriodic(TimeUnit.MINUTES.toMillis(5), id -> vertx.executeBlocking(v -> removeDuplicatedBadSmells()));
    }

    private void migrateDataBase() {
        logger.atInfo().log("Migrating database");
        createConfigsIfMissing();
        setDefaultSourceFolders();
        removeBadSmellsWithMissingProject();
        removeProjectHashesWithoutResults();
        removeProjectsWithOutHashes();
        removeBadSmellsWithWrongIdentifier();
        removeDuplicatedProjects();
        removeBadSmellsWithoutProjectHash();
        logger.atInfo().log("Finished migrating database");
    }

    private void removeBadSmellsWithMissingProject() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .filter(project -> project.getCommitHashes().isEmpty()
                        || project.getProjectUrl().endsWith(".git"))
                .map(project -> projectRepository
                        .deleteByProjectUrl(project.getProjectUrl())
                        .subscribe()
                        .with(v -> logger.atInfo().log("Deleted project %s", project.getProjectUrl())))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(project -> logger.atInfo().log("Removing projects %s", project));
    }

    private void removeDuplicatedBadSmells() {
        projectRepository
                .getAll()
                .emitOn(Infrastructure.getDefaultExecutor())
                .map(list -> list.get(RANDOM.nextInt(list.size())))
                .invoke(project ->
                        logger.atInfo().log("Removing duplicated bad smells for project %s", project.getProjectUrl()))
                .flatMap(project -> badSmellRepository.findByProjectUrl(project.getProjectUrl()))
                .map(badSmells -> badSmells.stream().collect(Collectors.groupingBy(BadSmell::getIdentifier)))
                .onItem()
                .transformToMulti(badSmells -> Multi.createFrom().iterable(badSmells.entrySet()))
                .select()
                .where(entry -> entry.getValue().size() > 1)
                .map(v -> v.getValue().stream().skip(1).toList())
                .<BadSmell>flatMap(badSmells -> Multi.createFrom().iterable(badSmells))
                .onItem()
                .transformToUniAndConcatenate(
                        badSmell -> badSmellRepository.deleteByIdentifier(badSmell.getIdentifier()))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %d bad smells", v));
    }

    private void setDefaultSourceFolders() {
        Multi.createFrom()
                .iterable(Map.of(
                                "https://github.com/google/guava",
                                "guava",
                                "https://github.com/INRIA/spoon",
                                "src/main/java",
                                "https://github.com/assertj/assertj",
                                "assertj-core")
                        .entrySet())
                .map(v -> projectConfigRepository
                        .findByProjectUrl(v.getKey())
                        .map(list -> list.get(0))
                        .invoke(projectConfig -> {
                            projectConfig.setSourceFolder(v.getValue());
                            projectConfigRepository.save(projectConfig);
                        }))
                .collect()
                .with(Collectors.toList())
                .subscribe()
                .with(v -> logger.atInfo().log("Updated %s project configs", v.size()));
    }

    private void createConfigsIfMissing() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .select()
                .when(project -> projectConfigRepository
                        .findByProjectUrl(project.getProjectUrl())
                        .map(List::isEmpty))
                .map(v -> projectConfigRepository.create(ProjectConfig.ofProjectUrl(v.getProjectUrl())))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Updated project configs %s", v));
    }

    private void removeProjectHashesWithoutResults() {
        projectRepository
                .getAll()
                .onItem()
                .<Project>transformToMulti(Multi.createFrom()::iterable)
                .invoke(this::removeEmptyCommitHashes)
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %s empty commit hashes", v));
    }

    private void removeEmptyCommitHashes(Project project) {
        Multi.createFrom()
                .iterable(project.getCommitHashes())
                .select()
                .when(hash -> badSmellRepository.findByCommitHash(hash).map(List::isEmpty))
                .invoke(project::removeCommitHash)
                .subscribe()
                .with(hash ->
                        logger.atInfo().log("Removing commit hash %s from project %s", hash, project.getProjectUrl()));
    }

    private void removeProjectsWithOutHashes() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .filter(project -> project.getCommitHashes().isEmpty())
                .invoke(project -> logger.atInfo().log("Removing project %s", project.getProjectUrl()))
                .invoke(project -> projectRepository.deleteByProjectName(project.getProjectName()))
                .map(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %s projects without hashes", v));
    }

    private void removeBadSmellsWithWrongIdentifier() {
        Pattern pattern = Pattern.compile("--\\d+$");
        badSmellRepositoryImpl
                .mongoCollection()
                .find(Filters.regex("identifier", pattern))
                .map(v -> badSmellRepositoryImpl.deleteByIdentifier(v.getIdentifier()))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %s bad smells with wrong identifier", v));
    }

    private void removeDuplicatedProjects() {
        projectRepository
                .getAll()
                .toMulti()
                .collect()
                .with(Collectors.flatMapping(v -> v.stream(), Collectors.toList()))
                .map(v -> v.stream().collect(Collectors.groupingBy(Project::getProjectUrl)))
                .invoke(v -> v.entrySet().removeIf(list -> list.getValue().size() == 1))
                .map(list -> list.keySet().stream()
                        .map(project -> projectRepository.deleteByProjectUrl(project))
                        .toList())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %s duplicated projects", v));
    }

    private void removeBadSmellsWithoutProjectHash() {
        badSmellRepository
                .getAll()
                .emitOn(Infrastructure.getDefaultExecutor())
                .select()
                .when(v -> projectRepositoryImpl
                        .mongoCollection()
                        .find(Filters.in("commitHashes", v.getCommitHash()))
                        .collect()
                        .asList()
                        .map(List::isEmpty))
                .map(v -> badSmellRepository.deleteByIdentifier(v.getIdentifier()))
                .collect()
                .with(Collectors.counting())
                .subscribe()
                .with(v -> logger.atInfo().log("Removed %s bad smells without project hash", v));
    }
}
