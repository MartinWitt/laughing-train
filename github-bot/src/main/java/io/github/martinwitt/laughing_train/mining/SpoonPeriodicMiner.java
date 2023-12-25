package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.SpoonAnalyzerService;
import io.quarkus.arc.Unremovable;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.commons.io.FileUtils;

@Unremovable
@ApplicationScoped
public class SpoonPeriodicMiner extends AbstractVerticle {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  public static final String ANALYZER_NAME = "spoon-analyzer";
  private final Vertx vertx;
  private final SpoonAnalyzerService spoonAnalyzerService;
  private final ProjectSupplier projectSupplier;

  public SpoonPeriodicMiner(
      Vertx vertx,
      SpoonAnalyzerService spoonAnalyzerService,
      ProjectSupplier projectSupplier,
      ProjectRepository projectRepository) {
    this.vertx = vertx;
    this.spoonAnalyzerService = spoonAnalyzerService;
    this.projectSupplier = projectSupplier;
  }

  private CodeAnalyzerResult analyzeProjectWithSpoon(GitProject gitProject) {
    logger.atInfo().log("Analyzing project %s with spoon", gitProject);
    CodeAnalyzerResult analyze =
        spoonAnalyzerService.analyze(new AnalyzerRequest.WithProject(gitProject));
    logger.atInfo().log("Successfully analyzed project %s with spoon", gitProject);
    return analyze;
  }

  @Override
  public void start() {
    vertx.eventBus().<MineNextProject>consumer("miner", v -> mineWithSpoon(v.body()));
  }

  private void mineWithSpoon(MineNextProject event) {
    if (!event.analyzerName().equals(ANALYZER_NAME)) {
      return;
    }
    logger.atInfo().log("Start mining with spoon");
    handleProjectResult();
    mineNextProject();
  }

  private void handleProjectResult() {
    Result<GitProject> projectResult = projectSupplier.supplyProject();
    if (projectResult.isError()) {
      logger.atWarning().log("Failed to get project %s", projectResult.getError().getMessage());
    } else {
      processProject(projectResult.get());
      FileUtils.deleteQuietly(projectResult.get().folder());
    }
  }

  private void processProject(GitProject gitProject) {
    CodeAnalyzerResult analyzerResult = analyzeProjectWithSpoon(gitProject);
    switch (analyzerResult) {
      case CodeAnalyzerResult.Success spoonSuccess -> storeSuccess(gitProject, spoonSuccess);
      case CodeAnalyzerResult.Failure error -> storeFailure(gitProject, error);
    }
  }

  private void mineNextProject() {
    vertx.eventBus().publish("miner", new MineNextProject(ANALYZER_NAME));
  }

  private void storeFailure(GitProject gitProject, CodeAnalyzerResult.Failure error) {
    logger.atWarning().log("Failed to analyze project with spoon %s", error.message());
    StoreResults storeResults =
        new StoreResults(
            gitProject, new CodeAnalyzerResult.Failure(error.message()), ANALYZER_NAME);
    vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
  }

  private void storeSuccess(GitProject gitProject, CodeAnalyzerResult.Success spoonSuccess) {
    logger.atInfo().log("Successfully analyzed project %s with spoon", gitProject);
    StoreResults storeResults =
        new StoreResults(
            gitProject,
            new CodeAnalyzerResult.Success(spoonSuccess.results(), gitProject),
            ANALYZER_NAME);
    vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
  }
}
