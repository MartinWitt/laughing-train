package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

@ApplicationScoped
public class MiningStartup {

    @Inject
    Vertx vertx;

    @Inject
    AnalyzerResultsPersistence persistence;

    @Inject
    ProjectSupplier projectSupplier;

    @Inject
    QodanaPeriodicMiner qodanaPeriodicMiner;

    @Inject
    SpoonPeriodicMiner spoonPeriodicMiner;

    void startup(@Observes StartupEvent event) {
        DeploymentOptions options = new DeploymentOptions().setWorker(true);
        vertx.deployVerticle(qodanaPeriodicMiner, options);
        vertx.deployVerticle(spoonPeriodicMiner, options);
        vertx.deployVerticle(persistence, options);
        vertx.deployVerticle(projectSupplier, options);
        vertx.eventBus().send("miner", new MineNextProject(QodanaPeriodicMiner.ANALYZER_NAME));
        vertx.eventBus().send("miner", new MineNextProject(SpoonPeriodicMiner.ANALYZER_NAME));
    }
}
