package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.impl.MongoBadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.impl.MongoProjectRepository;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.bson.BsonString;

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
    BadSmellRepository badSmellRepository;
    // we use this for faster mongodb access
    @Inject
    MongoBadSmellRepository badSmellRepositoryImpl;

    @Inject
    MongoProjectRepository projectRepositoryImpl;

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
                TimeUnit.MINUTES.toMillis(60),
                id -> vertx.executeBlocking(promise -> migrateDataBase(promise)));
    }

    private void migrateDataBase(Promise<Object> promise) {
        logger.atInfo().log("Migrating database");
        createConfigsIfMissing();
        updateBadSmellsWithWrongProjectUrl();
        removeProjectHashesWithoutResults();
        removeProjectsWithOutHashes();
        removeDuplicatedProjects();
        // removeBadSmellsWithoutProjectHash();
        logger.atInfo().log("Finished migrating database");
        promise.complete();
    }

    private void removeProjectsWithOutHashes() {
        logger.atInfo().log("Removing projects without commit hashes");
        long value = projectRepository.getAll().stream()
                .filter(project -> project.getCommitHashes().isEmpty())
                .map(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()))
                .count();
        logger.atInfo().log("Removed %d projects without commit hashes", value);
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
        logger.atInfo().log("Removing project hashes without results");
        for (Project project : projectRepository.getAll()) {
            List<String> commitHashes = project.getCommitHashes();
            for (String commitHash : commitHashes) {
                if (badSmellRepository.findByCommitHash(commitHash).isEmpty()) {
                    project.removeCommitHash(commitHash);
                }
            }
            projectRepository.deleteByProjectUrl(project.getProjectUrl());
            projectRepository.save(project);
        }
        logger.atInfo().log("Finished removing project hashes without results");
    }

    private void removeBadSmellsWithWrongIdentifier() {
        Pattern pattern = Pattern.compile("--\\d+$");
        var result = badSmellRepositoryImpl.mongoCollection().deleteMany(Filters.regex("identifier", pattern));
        logger.atInfo().log("Removed %d bad smells with wrong identifier", result.getDeletedCount());
    }

    private void removeDuplicatedProjects() {
        logger.atInfo().log("Removing duplicated projects");
        projectRepository.getAll().stream().collect(Collectors.groupingBy(Project::getProjectUrl)).entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .peek(entry -> logger.atInfo().log(
                        "Found %d projects with url %s", entry.getValue().size(), entry.getKey()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .forEach(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()));
        logger.atInfo().log("Finished removing duplicated projects");
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

    /**
     * Fixes some fuckup with the project urls.
     */
    private void updateBadSmellsWithWrongProjectUrl() {
        logger.atInfo().log("Updating bad smells with wrong project url");
        // mongodb bson filter get a field value as string
        // so we need to use a regex to match the end of the string

        // badSmellRepositoryImpl
        //         .mongoCollection()
        //         .updateMany(
        //                 Filters.regex("projectUrl", Pattern.compile(".git$")),
        //                 Updates.set("projectUrl", new BsonString("$projectUrl.substring(0, $projectUrl.length() -
        // 4")));
        logger.atInfo().log("Finished updating bad smells with wrong project url");
        projectRepositoryImpl
                .mongoCollection()
                .updateMany(
                        Filters.regex("projectUrl", Pattern.compile(".git$")),
                        Updates.set(
                                "projectUrl", new BsonString("$projectUrl.substring(0, $projectUrl.length() - 4)")));
        logger.atInfo().log("Finished updating projects with wrong project url");
    }
}
