package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.quarkus.runtime.StartupEvent;
import io.vertx.mutiny.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

@ApplicationScoped
public class MiningStartup {

    @Inject
    Vertx vertx;

    void startup(@Observes StartupEvent event) {
        vertx.eventBus().send("miner", new MineNextProject(QodanaPeriodicMiner.ANALYZER_NAME));
        vertx.eventBus().send("miner", new MineNextProject(SpoonPeriodicMiner.ANALYZER_NAME));
    }
}
