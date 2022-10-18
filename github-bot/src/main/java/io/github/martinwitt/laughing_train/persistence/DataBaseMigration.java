package io.github.martinwitt.laughing_train.persistence;

import com.mongodb.client.model.Filters;
import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

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
    }

    private void removeProjectHashesWithoutResults() {
        for (Project project : Project.<Project>listAll()) {
            boolean changed = false;
            for (String hash : project.commitHashes) {
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
        BadSmell.mongoCollection().find(Filters.not(Filters.exists("position")));
    }
}
