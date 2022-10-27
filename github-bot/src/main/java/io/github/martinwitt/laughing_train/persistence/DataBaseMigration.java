package io.github.martinwitt.laughing_train.persistence;

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
        removeBadSmellsWithoutPosition();
        removeProjectHashesWithoutResults();
        removeBadSmellsWithoutIdentifier();
        removeBadSmellsWithWrongIdentifier();
        createConfigsIfMissing();
        setDefaultSourceFolders();
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
                    var list = ProjectConfig.findByProjectUrl(v);
                    if (list.size() == 1) {
                        var config = list.get(0);
                        config.setSourceFolder(k);
                        config.update();
                    }
                });
    }

    private void createConfigsIfMissing() {
        Project.<Project>streamAll().forEach(project -> {
            if (ProjectConfig.findByProjectUrl(project.getProjectUrl()).isEmpty()) {
                ProjectConfig.ofProjectUrl(project.getProjectUrl()).persist();
            }
        });
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
