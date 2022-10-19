package io.github.martinwitt.laughing_train.persistence;

import com.mongodb.client.model.Filters;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.runtime.StartupEvent;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.apache.commons.lang3.StringUtils;

/**
 * This class is used to migrate the database to the latest version.
 */
@ApplicationScoped
public class DataBaseMigration {
    /**
     * This method is called by the quarkus framework to migrate the database.
     */
    public void onStart(@Observes StartupEvent event) {
        removeBadSmellsWithoutPosition();
        removeProjectHashesWithoutResults();
        removeBadSmellsWithoutIdentifier();
        removeBadSmellsWithWrongIdentifier();
    }

    private void removeBadSmellsWithWrongIdentifier() {
        BadSmell.<BadSmell>findAll().stream()
                .filter(v -> {
                    String hashPart = StringUtils.substringAfterLast(v.identifier, "/");
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
