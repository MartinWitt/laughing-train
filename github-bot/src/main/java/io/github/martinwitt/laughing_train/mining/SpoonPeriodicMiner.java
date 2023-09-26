package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.ProjectResult.Success;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.services.SpoonAnalyzerService;
import io.quarkus.arc.Unremovable;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import org.apache.commons.io.FileUtils;

@Unremovable
@ApplicationScoped
public class SpoonPeriodicMiner extends AbstractVerticle {

  static final FluentLogger logger = FluentLogger.forEnclosingClass();
  public static final String ANALYZER_NAME = "spoon-analyzer";
  final Vertx vertx;
  final SpoonAnalyzerService spoonAnalyzerService;
  final ProjectSupplier projectSupplier;

  public SpoonPeriodicMiner(
      Vertx vertx, SpoonAnalyzerService spoonAnalyzerService, ProjectSupplier projectSupplier) {
    this.vertx = vertx;
    this.spoonAnalyzerService = spoonAnalyzerService;
    this.projectSupplier = projectSupplier;
  }

  private CodeAnalyzerResult analyzeProjectWithSpoon(Success success) {
    logger.atInfo().log("Analyzing project %s with spoon", success.project());
    CodeAnalyzerResult analyze =
        spoonAnalyzerService.analyze(new AnalyzerRequest.WithProject(success.project()));
    logger.atInfo().log("Successfully analyzed project %s with spoon", success.project());
    return analyze;
  }

  private void tryDeleteProject(ProjectResult.Success project) {
    try {
      FileUtils.deleteDirectory(project.project().folder());
    } catch (IOException e) {
      logger.atWarning().log("Failed to delete project " + project.project().folder());
    }
  }

  @Override
  public void start() throws Exception {
    vertx.eventBus().<MineNextProject>consumer("miner", v -> mineWithSpoon(v.body()));
  }

  void mineWithSpoon(MineNextProject event) {
    if (!event.analyzerName().equals(ANALYZER_NAME)) {
      return;
    }
    logger.atInfo().log("Start mining with spoon");
    ProjectResult projectResult = projectSupplier.supplyProject();
    switch (projectResult) {
      case Success success -> {
        CodeAnalyzerResult analyzerResult = analyzeProjectWithSpoon(success);
        switch (analyzerResult) {
          case CodeAnalyzerResult.Success spoonSuccess -> storeSuccess(success, spoonSuccess);
          case CodeAnalyzerResult.Failure error -> storeFailure(success, error);
        }
        try (var dirStream = Files.walk(success.project().folder().toPath())) {
          dirStream.map(Path::toFile).sorted(Comparator.reverseOrder()).forEach(File::delete);
        } catch (IOException e) {
          logger.atWarning().log("Failed to delete project " + success.project().folder());
        }
        FileUtils.deleteQuietly(success.project().folder());
      }
      case ProjectResult.Error error -> {
        logger.atWarning().log("Failed to get project %s", error.message());
      }
    }
    vertx.eventBus().publish("miner", new MineNextProject(ANALYZER_NAME));
  }

  private void storeFailure(ProjectResult.Success success, CodeAnalyzerResult.Failure error) {
    logger.atWarning().log("Failed to analyze project with spoon %s", error.message());
    tryDeleteProject(success);
    StoreResults storeResults =
        new StoreResults(
            success.project(), new CodeAnalyzerResult.Failure(error.message()), ANALYZER_NAME);
    vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
  }

  private void storeSuccess(
      ProjectResult.Success success, CodeAnalyzerResult.Success spoonSuccess) {
    logger.atInfo().log("Successfully analyzed project %s with spoon", success.project());
    tryDeleteProject(success);
    StoreResults storeResults =
        new StoreResults(
            success.project(),
            new CodeAnalyzerResult.Success(spoonSuccess.results(), success.project()),
            ANALYZER_NAME);
    vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
  }
}
