package io.github.martinwitt.laughing_train.persistence;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Filters;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
    Vertx vertx;
    /**
     * This method is called by the quarkus framework to migrate the database.
     */
    public void onStart(@Observes StartupEvent event) {
        migrateDataBase();
        checkPeroidic();
    }

    public void checkPeroidic() {
        vertx.setPeriodic(TimeUnit.MINUTES.toMillis(30), id -> migrateDataBase());
    }

    private void migrateDataBase() {
        logger.atInfo().log("Migrating database");
        deleteOldConfigs();
        createConfigsIfMissing();
        removeBadSmellsWithoutPosition();
        removeProjectHashesWithoutResults();
        removeBadSmellsWithoutIdentifier();
        removeBadSmellsWithWrongIdentifier();
        setDefaultSourceFolders();
        logger.atInfo().log("Finished migrating database");
    }

    private void deleteOldConfigs() {
        logger.atInfo().log("Deleting old configs");
        ProjectConfig.deleteAll();
    }

    private void setDefaultSourceFolders() {
        Map.of(
                        "https://github.com/google/guava",
                        "guava",
                        "https://github.com/INRIA/spoon",
                        "src/main/java",
                        "https://github.com/assertj/assertj",
                        "assertj-core")
                .forEach((k, v) -> {
                    var list = ProjectConfig.findByProjectUrl(k);
                    if (list.size() == 1) {
                        var config = list.get(0);
                        config.setSourceFolder(v);
                        config.update();
                        logger.atInfo().log("Set source folder for %s to %s", k, v);
                    }
                });
    }

    private void createConfigsIfMissing() {
        Project.<Project>streamAll().forEach(project -> {
            if (ProjectConfig.findByProjectUrl(project.getProjectUrl()).isEmpty()) {
                var config = new ProjectConfig(project.getProjectUrl());
                config.persist();
                logger.atInfo().log("Created config %s", ProjectConfig.findByProjectUrl(project.getProjectUrl()));
            }
        });
        logger.atInfo().log("Created missing configs for %d projects", ProjectConfig.count());
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
    }

    private void removeBadSmellsWithoutIdentifier() {
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("identifier")))
                .forEach(PanacheMongoEntityBase::delete);
        ;
    }

    private void removeProjectHashesWithoutResults() {
        for (Project project : Project.<Project>listAll()) {
            boolean changed = false;
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
