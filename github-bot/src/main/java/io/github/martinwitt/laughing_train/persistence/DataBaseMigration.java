package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.result.DeleteResult;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.impl.MongoBadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.impl.MongoProjectRepository;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.bson.BsonDocument;

/** This class is used to migrate the database to the latest version. */
@ApplicationScoped
public class DataBaseMigration {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  public static final int DELAY_BETWEEN = 60;

  ProjectConfigRepository projectConfigRepository;
  ProjectRepository projectRepository;
  BadSmellRepository badSmellRepository;
  // we use this for faster mongodb access
  MongoBadSmellRepository badSmellRepositoryImpl;
  MongoProjectRepository projectRepositoryImpl;
  Vertx vertx;

  @Inject
  public DataBaseMigration(
      ProjectConfigRepository projectConfigRepository,
      ProjectRepository projectRepository,
      BadSmellRepository badSmellRepository,
      MongoBadSmellRepository badSmellRepositoryImpl,
      MongoProjectRepository projectRepositoryImpl,
      Vertx vertx) {
    this.projectConfigRepository = projectConfigRepository;
    this.projectRepository = projectRepository;
    this.badSmellRepository = badSmellRepository;
    this.badSmellRepositoryImpl = badSmellRepositoryImpl;
    this.projectRepositoryImpl = projectRepositoryImpl;
    this.vertx = vertx;
  }

  /** This method is called by the quarkus framework to migrate the database. */
  public void onStart(@Observes StartupEvent event) {
    checkPeriodic();
  }

  public void checkPeriodic() {
    vertx.setPeriodic(
        getInitialDelay(),
        getDelay(),
        unused ->
            vertx
                .executeBlocking(this::migrateDataBase)
                .onFailure(
                    v -> logger.atSevere().withCause(v).log("Error while migrating database"))
                .onSuccess(v -> logger.atInfo().log("Finished migrating database")));
  }

  private static long getDelay() {
    return TimeUnit.MINUTES.toMillis(DELAY_BETWEEN);
  }

  private static long getInitialDelay() {
    return TimeUnit.MINUTES.toMillis(2);
  }

  private boolean migrateDataBase() {
    logger.atInfo().log("Migrating database");
    createIndexes();
    createConfigsIfMissing();
    removeProjectHashesWithoutResults();
    removeProjectsWithOutHashes();
    removeDuplicatedProjects();
    removeRuleIdsWithSpaces();
    removeBadSmellsWithWrongFolder();
    deleteBadSmellWithManyFalsePositives();
    return true;
  }

  public void createIndexes() {
    try {
      badSmellRepositoryImpl
          .mongoCollection()
          .createIndex(
              BsonDocument.parse("{commitHash: 1}"), new IndexOptions().name("commitHash_idx"));
      badSmellRepositoryImpl
          .mongoCollection()
          .createIndex(BsonDocument.parse("{ruleID: 1}"), new IndexOptions().name("ruleID_idx"));
      badSmellRepositoryImpl
          .mongoCollection()
          .createIndex(
              BsonDocument.parse("{commitHash: 1, ruleID: 1}"),
              new IndexOptions().name("commitHash_ruleID_idx"));
      badSmellRepositoryImpl
          .mongoCollection()
          .createIndex(
              BsonDocument.parse("{identifier: 1}"), new IndexOptions().name("identifier_idx"));
    } catch (Exception e) {

      logger.atSevere().withCause(e).log("Error while creating indexes");
    }
  }

  private void removeProjectsWithOutHashes() {
    logger.atInfo().log("Removing projects without commit hashes");
    long value =
        projectRepository.getAll().stream()
            .filter(project -> project.getCommitHashes().isEmpty())
            .map(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()))
            .count();
    logger.atInfo().log("Removed %d projects without commit hashes", value);
  }

  private void createConfigsIfMissing() {
    long value =
        projectRepository.getAll().stream()
            .map(RemoteProject::getProjectUrl)
            .filter(projectUrl -> projectConfigRepository.findByProjectUrl(projectUrl).isEmpty())
            .map(v -> projectConfigRepository.create(ProjectConfig.ofProjectUrl(v)))
            .count();
    logger.atInfo().log("Created %d project configs", value);
  }

  private void removeProjectHashesWithoutResults() {
    logger.atInfo().log("Removing project hashes without results");
    for (RemoteProject project : projectRepository.getAll()) {
      Iterable<String> commitHashes = new ArrayList<>(project.getCommitHashes());
      for (String commitHash : commitHashes) {
        if (badSmellRepositoryImpl
                .mongoCollection()
                .find((Filters.eq("commitHash", commitHash)))
                .first()
            == null) {
          project.removeCommitHash(commitHash);
        }
      }
      projectRepository.deleteByProjectUrl(project.getProjectUrl());
      projectRepository.save(project);
    }
    logger.atInfo().log("Finished removing project hashes without results");
  }

  private void removeDuplicatedProjects() {
    logger.atInfo().log("Removing duplicated projects");
    projectRepository.getAll().stream()
        .collect(Collectors.groupingBy(RemoteProject::getProjectUrl))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue().size() > 1)
        .peek(
            entry ->
                logger.atInfo().log(
                    "Found %d projects with url %s", entry.getValue().size(), entry.getKey()))
        .map(Map.Entry::getValue)
        .flatMap(Collection::stream)
        .forEach(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()));
    logger.atInfo().log("Finished removing duplicated projects");
  }

  private void removeRuleIdsWithSpaces() {
    DeleteResult deleteMany =
        badSmellRepositoryImpl
            .mongoCollection()
            .deleteMany(
                Filters.and(Filters.regex("ruleID", ".* .*"), Filters.eq("analyzer", "Spoon")));
    logger.atInfo().log(
        "Removed %d bad smells with ruleId containing spaces", deleteMany.getDeletedCount());
  }

  private void removeBadSmellsWithWrongFolder() {
    DeleteResult deleteMany =
        badSmellRepositoryImpl
            .mongoCollection()
            .deleteMany(
                Filters.and(
                    Filters.regex("filePath", ".*/tmp/.*"), Filters.eq("analyzer", "Spoon")));
    logger.atInfo().log(
        "Removed %d bad smells with ruleId containing spaces", deleteMany.getDeletedCount());
  }

  private void deleteBadSmellWithManyFalsePositives() {
    DeleteResult deleteMany =
        badSmellRepositoryImpl
            .mongoCollection()
            .deleteMany(
                Filters.and(
                    Filters.eq("ruleID", "InnerClassMayBeStatic"),
                    Filters.eq("analyzer", "Spoon")));
    logger.atInfo().log(
        "Removed %d bad smells for rule InnerClassMayBeStatic", deleteMany.getDeletedCount());
  }
}
