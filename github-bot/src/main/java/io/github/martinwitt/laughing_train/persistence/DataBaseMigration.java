package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Filters;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.vertx.core.Vertx;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;

/**
 * This class is used to migrate the database to the latest version.
 */
@ApplicationScoped
public class DataBaseMigration {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    ProjectConfigRepository projectConfigRepository;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    Vertx vertx;
    /**
     * This method is called by the quarkus framework to migrate the database.
     */
    public void onStart(@Observes StartupEvent event) {
        checkPeriodic();
    }

    public void checkPeriodic() {
        vertx.setPeriodic(TimeUnit.MINUTES.toMillis(30), id -> vertx.executeBlocking(v -> migrateDataBase()));
        vertx.setPeriodic(TimeUnit.MINUTES.toMillis(5), id -> vertx.executeBlocking(v -> removeDuplicatedBadSmells()));
    }

    private void migrateDataBase() {
        logger.atInfo().log("Migrating database");
        createConfigsIfMissing();
        removeBadSmellsWithoutPosition();
        removeBadSmellsWithoutIdentifier();
        removeBadSmellsWithWrongIdentifier();
        setDefaultSourceFolders();
        removeBadSmellsWithMissingProject();
        removeProjectHashesWithoutResults();

        logger.atInfo().log("Finished migrating database");
    }

    private void removeBadSmellsWithMissingProject() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .filter(project -> project.getCommitHashes().isEmpty()
                        || project.getProjectUrl().endsWith(".git"))
                .subscribe()
                .with(project -> {
                    logger.atInfo().log("Removing project %s", project.getProjectUrl());
                    projectRepository.deleteByProjectUrl(project.getProjectUrl());
                });
    }

    private void removeDuplicatedBadSmells() {
        projectRepository
                .getAll()
                .<Project>map(list -> list.get(new Random().nextInt(list.size())))
                .map(project -> BadSmell.findByProjectUrl(project.getProjectUrl()))
                .map(badSmells -> badSmells.stream().collect(Collectors.groupingBy(BadSmell::getIdentifier)))
                .onItem()
                .transformToMulti(badSmells -> Multi.createFrom().iterable(badSmells.entrySet()))
                .select()
                .where(entry -> entry.getValue().size() > 1)
                .invoke(v -> logger.atInfo().log("Found duplicated bad smells for %s", v.getKey()))
                .invoke(v -> v.getValue().stream().skip(1).forEach(BadSmell::delete))
                .subscribe()
                .with(v -> logger.atInfo().log(
                        "Removed %d bad smells for %s", v.getValue().size() - 1, v.getKey()));
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
                .invoke(v -> projectConfigRepository
                        .findByProjectUrl(v.getKey())
                        .map(list -> list.get(0))
                        .invoke(projectConfig -> {
                            projectConfig.setSourceFolder(v.getValue());
                            projectConfigRepository.save(projectConfig);
                        })
                        .subscribe()
                        .with(item -> logger.atInfo().log("Updated project config for %s", item.getProjectUrl())))
                .subscribe()
                .with(v -> logger.atFinest().log("Updated project config"));
    }

    private void createConfigsIfMissing() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .invoke(project -> projectConfigRepository
                        .findByProjectUrl(project.getProjectUrl())
                        .invoke(projectConfig -> {
                            if (projectConfig.isEmpty()) {
                                projectConfigRepository.save(new ProjectConfig(project.getProjectUrl()));
                            }
                        })
                        .subscribe()
                        .with(item -> logger.atInfo().log("Updated project config for %s", project.getProjectName())))
                .subscribe()
                .with(v -> logger.atFinest().log("Updated project config"));
    }

    private void removeBadSmellsWithWrongIdentifier() {
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> v.identifier.contains("--"))
                .map(v -> {
                    v.identifier = v.identifier.replace("--", "-");
                    return v;
                })
                .forEach(v -> v.update());
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> {
                    String hashPart = StringUtils.substringAfterLast(v.identifier, "-");
                    if (hashPart == null) {
                        return true;
                    }
                    return hashPart.equals(v.commitHash);
                })
                .forEach(PanacheMongoEntityBase::delete);
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> v.getIdentifier().contains("["))
                .forEach(PanacheMongoEntityBase::delete);
    }

    private void removeBadSmellsWithoutIdentifier() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("identifier")))
                .forEach(PanacheMongoEntityBase::delete);
    }

    private void removeProjectHashesWithoutResults() {
        projectRepository
                .getAll()
                .onItem()
                .transformToMulti(Multi.createFrom()::iterable)
                .map(project -> findEmptyCommitHashes(project).invoke(hash -> removeCommitHash(project, hash)))
                .subscribe()
                .with(v -> logger.atFinest().log("Updated project config"));
    }

    private Multi<String> findEmptyCommitHashes(Project project) {
        return Multi.createFrom()
                .iterable(project.getCommitHashes().stream()
                        .filter(hash -> !BadSmell.findByCommitHash(hash).isEmpty())
                        .collect(Collectors.toList()));
    }

    private void removeCommitHash(Project project, String hash) {
        project.removeCommitHash(hash);
    }

    private void removeBadSmellsWithoutPosition() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("position")))
                .forEach(PanacheMongoEntityBase::delete);
        ;
    }
}
