package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.quarkus.logging.Log;
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

  private final Vertx vertx;
  private final AnalyzerResultsPersistence persistence;
  private final ProjectSupplier projectSupplier;
  private final SpoonPeriodicMiner spoonPeriodicMiner;

  @Inject
  public MiningStartup(
      Vertx vertx,
      AnalyzerResultsPersistence persistence,
      ProjectSupplier projectSupplier,
      SpoonPeriodicMiner spoonPeriodicMiner) {
    this.vertx = vertx;
    this.persistence = persistence;
    this.projectSupplier = projectSupplier;
    this.spoonPeriodicMiner = spoonPeriodicMiner;
  }

  void startup(@Observes StartupEvent event) {
    DeploymentOptions options = new DeploymentOptions().setWorker(true);
    Future.join(
            vertx.deployVerticle(spoonPeriodicMiner, options),
            vertx.deployVerticle(persistence, options),
            vertx.deployVerticle(projectSupplier, options))
        .onFailure(Throwable::printStackTrace)
        .onComplete(v -> Log.info("All verticles deployed"))
        .onSuccess(v -> startMining());
    vertx.exceptionHandler(v -> Log.error("Exception in vertx", v));
  }

  private void startMining() {
    vertx.setTimer(
        TimeUnit.MINUTES.toMillis(2),
        v ->
            vertx
                .eventBus()
                .publish("miner", new MineNextProject(SpoonPeriodicMiner.ANALYZER_NAME)));
  }
}
