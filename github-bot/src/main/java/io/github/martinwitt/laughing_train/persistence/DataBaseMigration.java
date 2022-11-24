package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.google.errorprone.annotations.Var;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.vertx.core.Vertx;
import java.util.ArrayList;
import java.util.Map;
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
        removeProjectHashesWithoutResults();
        removeBadSmellsWithoutIdentifier();
        removeBadSmellsWithWrongIdentifier();
        setDefaultSourceFolders();
        removeBadSmellsWithMissingProject();
        logger.atInfo().log("Finished migrating database");
    }

    private void removeBadSmellsWithMissingProject() {
        for (Project project : Project.<Project>listAll()) {
            if (project.commitHashes == null || project.commitHashes.isEmpty() || project.projectUrl.endsWith(".git")) {
                project.delete();
                BadSmell.mongoCollection().deleteMany(Filters.eq("projectName", project.projectName));
            }
        }
    }

    private void removeDuplicatedBadSmells() {
        var project =
                Project.<Project>mongoCollection().find(Aggregates.sample(1)).first();
        if (BadSmell.findByProjectUrl(project.getProjectUrl()).isEmpty()) {
            logger.atInfo().log("No bad smells found for project %s", project.getProjectUrl());
        }
        BadSmell.findByProjectUrl(project.getProjectUrl()).stream()
                .collect(Collectors.groupingBy(BadSmell::getIdentifier))
                .forEach((k, v) -> {
                    if (v.size() > 1) {
                        logger.atInfo().log("Found duplicated bad smells for identifier %s", k);
                        v.stream().skip(1).forEach(x -> BadSmell.deleteById(x.id));
                    }
                });
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
        Project.<Project>streamAll().forEach(project -> projectConfigRepository
                .existsByProjectUrl(project.projectUrl)
                .invoke(exists -> {
                    if (!exists) {
                        projectConfigRepository
                                .create(new ProjectConfig(project.getProjectUrl()))
                                .subscribe()
                                .with(v ->
                                        logger.atFine().log("Created project config for %s", project.getProjectUrl()));
                    }
                }));
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
        for (Project project : Project.<Project>listAll()) {
            @Var boolean changed = false;
            for (String hash : new ArrayList<>(project.commitHashes)) {
                if (BadSmell.findByCommitHash(hash) == null
                        || BadSmell.findByCommitHash(hash).isEmpty()) {
                    project.commitHashes.remove(hash);
                    changed = true;
                }
            }
            if (changed) {
                project.update();
            }
        }
    }

    private void removeBadSmellsWithoutPosition() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("position")))
                .forEach(PanacheMongoEntityBase::delete);
        ;
    }
}
