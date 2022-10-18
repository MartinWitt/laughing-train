package io.github.martinwitt.laughing_train.persistence;

import com.mongodb.client.model.Filters;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
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
        BadSmell.mongoCollection()
                .find(Filters.not(Filters.exists("position")))
                .forEach(PanacheMongoEntityBase::delete);
    }
}
