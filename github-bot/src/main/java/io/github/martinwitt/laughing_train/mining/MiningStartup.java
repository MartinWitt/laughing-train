package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class MiningStartup {

    public static final String SERVICE_NAME = "miningStartup";

    final Vertx vertx;
    final AnalyzerResultsPersistence persistence;
    final ProjectSupplier projectSupplier;
    final QodanaPeriodicMiner qodanaPeriodicMiner;
    final SpoonPeriodicMiner spoonPeriodicMiner;

    @Inject
    public MiningStartup(
            Vertx vertx,
            AnalyzerResultsPersistence persistence,
            ProjectSupplier projectSupplier,
            QodanaPeriodicMiner qodanaPeriodicMiner,
            SpoonPeriodicMiner spoonPeriodicMiner) {
        this.vertx = vertx;
        this.persistence = persistence;
        this.projectSupplier = projectSupplier;
        this.qodanaPeriodicMiner = qodanaPeriodicMiner;
        this.spoonPeriodicMiner = spoonPeriodicMiner;
    }

    void startup(@Observes StartupEvent event) {
        DeploymentOptions options = new DeploymentOptions().setWorker(true);
        Future.join(
                        vertx.deployVerticle(qodanaPeriodicMiner, options),
                        vertx.deployVerticle(spoonPeriodicMiner, options),
                        vertx.deployVerticle(persistence, options),
                        vertx.deployVerticle(projectSupplier, options))
                .onFailure(Throwable::printStackTrace)
                .onComplete(v -> System.out.println("All verticles deployed"))
                .onSuccess(v -> startMining());
        vertx.eventBus().addInboundInterceptor(v -> {
            System.out.println("Received message: " + v.toString());
            v.next();
        });
    }

    private void startMining() {
        vertx.setTimer(TimeUnit.MINUTES.toMillis(3), v -> vertx.eventBus()
                .publish("miner", new MineNextProject(QodanaPeriodicMiner.ANALYZER_NAME)));
        vertx.setTimer(TimeUnit.MINUTES.toMillis(2), v -> vertx.eventBus()
                .publish("miner", new MineNextProject(SpoonPeriodicMiner.ANALYZER_NAME)));
    }
}
