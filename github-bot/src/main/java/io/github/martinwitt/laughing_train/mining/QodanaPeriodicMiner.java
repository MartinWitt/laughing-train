package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.mining.requests.GetProject;
import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.quarkus.arc.Unremovable;
import io.quarkus.vertx.ConsumeEvent;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

@Unremovable
@ApplicationScoped
public class QodanaPeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();
    public static final String ANALYZER_NAME = "Qodana";

    final Vertx vertx;
    final ProjectRepository projectRepository;
    final QodanaService qodanaService;

    public QodanaPeriodicMiner(Vertx vertx, ProjectRepository projectRepository, QodanaService qodanaService) {
        this.vertx = vertx;
        this.projectRepository = projectRepository;
        this.qodanaService = qodanaService;
    }

    private QodanaResult analyzeProject(ProjectResult.Success message) {
        return qodanaService.analyze(new AnalyzerRequest.WithProject(message.project()));
    }

    private void tryDeleteProject(ProjectResult.Success project) {
        try {
            FileUtils.deleteDirectory(project.project().folder());
        } catch (IOException e) {
            logger.atWarning().log(
                    "Failed to delete project " + project.project().folder());
        }
    }

    @ConsumeEvent(value = "miner", blocking = true)
    void mineWithQodana(MineNextProject event) {
        if (!event.analyzerName().equals(ANALYZER_NAME)) {
            return;
        }
        logger.atInfo().log("Start mining with qodana");
        Future<Message<ProjectResult>> request =
                vertx.eventBus().request(ProjectSupplier.SERVICE_NAME, new GetProject(ANALYZER_NAME));
        request.onSuccess(v -> {
            if (v.body() instanceof ProjectResult.Success success) {
                var qodanaResult = analyzeProject(success);
                if (qodanaResult instanceof QodanaResult.Success qodanaSuccess) {
                    storeSuccess(success, qodanaSuccess);
                } else {
                    if (qodanaResult instanceof QodanaResult.Failure error) {
                        storeFailure(success, error);
                    }
                }
            }
        });
        request.onFailure(v -> {
            logger.atWarning().withCause(v).log("Failed to get project");
        });
    }

    private void storeFailure(ProjectResult.Success success, QodanaResult.Failure error) {
        logger.atWarning().log("Failed to analyze project with qodana %s", error.message());
        tryDeleteProject(success);
        StoreResults storeResults =
                new StoreResults(success.project(), new CodeAnalyzerResult.Failure(error.message()), ANALYZER_NAME);
        vertx.eventBus().send(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
    }

    private void storeSuccess(ProjectResult.Success success, QodanaResult.Success qodanaSuccess) {
        logger.atInfo().log("Successfully analyzed project %s with qodana", success.project());
        StoreResults storeResults = new StoreResults(
                success.project(),
                new CodeAnalyzerResult.Success(qodanaSuccess.result(), success.project()),
                ANALYZER_NAME);
        vertx.eventBus().send(AnalyzerResultsPersistence.SERVICE_NAME, storeResults);
    }
}
