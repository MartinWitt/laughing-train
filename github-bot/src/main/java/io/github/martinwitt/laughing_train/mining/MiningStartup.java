package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.quarkus.logging.Log;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class MiningStartup {

    public static final String SERVICE_NAME = "miningStartup";

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

    @Inject
    MiningEventConsumer miningEventConsumer;

    void startup(@Observes StartupEvent event) {
        DeploymentOptions options = new DeploymentOptions().setWorker(true);
        Future.join(
                        vertx.deployVerticle(qodanaPeriodicMiner, options),
                        vertx.deployVerticle(spoonPeriodicMiner, options),
                        vertx.deployVerticle(persistence, options),
                        vertx.deployVerticle(projectSupplier, options),
                        vertx.deployVerticle(miningEventConsumer, options))
                .onFailure(Throwable::printStackTrace)
                .onComplete(v -> System.out.println("All verticles deployed"))
                .onSuccess(v -> Log.info("Starting periodic mining"));
        vertx.eventBus().addInboundInterceptor(v -> {
            System.out.println("Received message: " + v.toString());
            v.next();
        });
    }

    @ApplicationScoped
    private static class MiningEventConsumer extends AbstractVerticle {

        private Map<String, Long> timerIDByAnalyzerName = new HashMap<>();

        @Override
        public void start() throws Exception {
            vertx.eventBus().<String>consumer(SERVICE_NAME, v -> startMiningAgain(v.body()));
            timerIDByAnalyzerName.put(
                    QodanaPeriodicMiner.ANALYZER_NAME,
                    vertx.setPeriodic(TimeUnit.MINUTES.toMillis(3), TimeUnit.MINUTES.toMillis(25), v -> vertx.eventBus()
                            .publish("miner", new MineNextProject(QodanaPeriodicMiner.ANALYZER_NAME))));
            timerIDByAnalyzerName.put(
                    SpoonPeriodicMiner.ANALYZER_NAME,
                    vertx.setPeriodic(TimeUnit.MINUTES.toMillis(2), TimeUnit.MINUTES.toMillis(15), v -> vertx.eventBus()
                            .publish("miner", new MineNextProject(SpoonPeriodicMiner.ANALYZER_NAME))));
        }

        void startMiningAgain(String analyzerName) {
            if (vertx.cancelTimer(timerIDByAnalyzerName.get(analyzerName))) {
                timerIDByAnalyzerName.put(
                        analyzerName,
                        vertx.setPeriodic(
                                TimeUnit.MINUTES.toMillis(3), TimeUnit.MINUTES.toMillis(25), v -> vertx.eventBus()
                                        .publish("miner", new MineNextProject(analyzerName))));
                vertx.eventBus().publish("miner", new MineNextProject(analyzerName));
            }
        }
    }
}
