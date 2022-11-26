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
import io.vertx.core.Vertx;
import java.util.Collection;
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
        vertx.setPeriodic(TimeUnit.SECONDS.toMillis(30), id -> vertx.executeBlocking(v -> removeDuplicatedBadSmells()));
    }

    private void migrateDataBase() {
        logger.atInfo().log("Migrating database");
        createConfigsIfMissing();
        removeProjectHashesWithoutResults();
        removeProjectsWithOutHashes();
        removeBadSmellsWithWrongIdentifier();
        removeDuplicatedProjects();
        removeBadSmellsWithoutProjectHash();
        logger.atInfo().log("Finished migrating database");
    }

    private void removeProjectsWithOutHashes() {
        long value = projectRepository.getAll().stream()
                .filter(project -> project.getCommitHashes().isEmpty()
                        || project.getProjectUrl().endsWith(".git"))
                .map(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()))
                .count();
        logger.atInfo().log("Removed %d projects without commit hashes", value);
    }

    private void removeDuplicatedBadSmells() {
        badSmellRepository.getAll().collect(Collectors.groupingBy(BadSmell::getIdentifier)).entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .peek(entry -> logger.atInfo().log(
                        "Found %d bad smells with identifier %s",
                        entry.getValue().size(), entry.getKey()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .forEach(badSmell -> badSmellRepository.deleteByIdentifier(badSmell.getIdentifier()));
    }

    private void createConfigsIfMissing() {
        long value = projectRepository.getAll().stream()
                .map(Project::getProjectUrl)
                .filter(projectUrl ->
                        projectConfigRepository.findByProjectUrl(projectUrl).isEmpty())
                .map(v -> projectConfigRepository.create(ProjectConfig.ofProjectUrl(v)))
                .count();
        logger.atInfo().log("Created %d project configs", value);
    }

    private void removeProjectHashesWithoutResults() {
        for (Project project : projectRepository.getAll()) {
            List<String> commitHashes = project.getCommitHashes();
            for (String commitHash : commitHashes) {
                if (badSmellRepository.findByCommitHash(commitHash).isEmpty()) {
                    project.removeCommitHash(commitHash);
                }
            }
            projectRepository.save(project);
        }
    }

    private void removeBadSmellsWithWrongIdentifier() {
        Pattern pattern = Pattern.compile("--\\d+$");
        var result = badSmellRepositoryImpl.mongoCollection().deleteMany(Filters.regex("identifier", pattern));
        logger.atInfo().log("Removed %d bad smells with wrong identifier", result.getDeletedCount());
    }

    private void removeDuplicatedProjects() {
        projectRepository.getAll().stream().collect(Collectors.groupingBy(Project::getProjectUrl)).entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .peek(entry -> logger.atInfo().log(
                        "Found %d projects with url %s", entry.getValue().size(), entry.getKey()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .forEach(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()));
    }

    private void removeBadSmellsWithoutProjectHash() {
        badSmellRepository
                .getAll()
                .filter(v -> !projectRepositoryImpl
                        .mongoCollection()
                        .find(Filters.in("commitHashes", v.getCommitHash()))
                        .iterator()
                        .hasNext())
                .map(BadSmell::getIdentifier)
                .forEach(badSmellRepository::deleteByIdentifier);
    }
}
