package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.ProjectResult.Success;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.mining.requests.GetProject;
import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.services.SpoonAnalyzerService;
import io.quarkus.arc.Unremovable;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

@Unremovable
@ApplicationScoped
public class SpoonPeriodicMiner extends AbstractVerticle {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();
    public static final String ANALYZER_NAME = "spoon-analyzer";
    final Vertx vertx;
    final SpoonAnalyzerService spoonAnalyzerService;

    public SpoonPeriodicMiner(Vertx vertx, SpoonAnalyzerService spoonAnalyzerService) {
        this.vertx = vertx;
        this.spoonAnalyzerService = spoonAnalyzerService;
    }

    private CodeAnalyzerResult analyzeProjectWithSpoon(Success success) {
        logger.atInfo().log("Analyzing project %s with spoon", success.project());
        CodeAnalyzerResult analyze = spoonAnalyzerService.analyze(new AnalyzerRequest.WithProject(success.project()));
        logger.atInfo().log("Successfully analyzed project %s with spoon", success.project());
        return analyze;
    }

    private void tryDeleteProject(ProjectResult.Success project) {
        try {
            FileUtils.deleteDirectory(project.project().folder());
        } catch (IOException e) {
            logger.atWarning().log(
                    "Failed to delete project " + project.project().folder());
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
        Future<Message<ProjectResult>> request = vertx.eventBus()
                .request(
                        ProjectSupplier.SERVICE_NAME,
                        new GetProject(ANALYZER_NAME),
                        new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(5)));
        request.onSuccess(v -> {
            if (v.body() instanceof ProjectResult.Success success) {
                var spoonResult = analyzeProjectWithSpoon(success);
                if (spoonResult instanceof CodeAnalyzerResult.Success spoonSuccess) {
                    storeSuccess(success, spoonSuccess);
                } else {
                    if (spoonResult instanceof CodeAnalyzerResult.Failure error) {
                        storeFailure(success, error);
                    }
                }
            }
        });
        request.onFailure(v -> {
            logger.atWarning().withCause(v).log("Failed to get project");
        });
    }

    private void storeFailure(ProjectResult.Success success, CodeAnalyzerResult.Failure error) {
        logger.atWarning().log("Failed to analyze project with spoon %s", error.message());
        tryDeleteProject(success);
        StoreResults storeResults =
                new StoreResults(success.project(), new CodeAnalyzerResult.Failure(error.message()), ANALYZER_NAME);
        vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
    }

    private void storeSuccess(ProjectResult.Success success, CodeAnalyzerResult.Success spoonSuccess) {
        logger.atInfo().log("Successfully analyzed project %s with spoon", success.project());
        tryDeleteProject(success);
        StoreResults storeResults = new StoreResults(
                success.project(),
                new CodeAnalyzerResult.Success(spoonSuccess.results(), success.project()),
                ANALYZER_NAME);
        vertx.eventBus().publish(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
    }
}
