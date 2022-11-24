package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest.WithProject;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.health.api.AsyncHealthCheck;
import io.smallrye.mutiny.Uni;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class QodanaService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    Config config;

    @Inject
    ThreadPoolManager threadPoolManager;

    @Inject
    EventBus eventBus;

    @Inject
    Vertx vertx;

    @Inject
    ProjectConfigService projectConfigService;

    public List<AnalyzerResult> runQodana(String gitUrl) throws IOException {
        Path file = Files.createTempDirectory(Constants.TEMP_FOLDER_PREFIX);
        try (Closeable closeable = () -> FileUtils.deleteDirectory(file.toFile())) {
            logger.atInfo().log("Cloning %s to %s", gitUrl, file);
            return runQodana(gitUrl, file);
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while running qodana");
        }
        return List.of();
    }

    public List<AnalyzerResult> runQodana(String gitUrl, Path dir) throws GitAPIException {
        try (Git git =
                Git.cloneRepository().setURI(gitUrl).setDirectory(dir.toFile()).call()) {
            QodanaAnalyzer analyzer = new QodanaAnalyzer.Builder()
                    .withSourceFileRoot(config.getSrcFolder())
                    // .withCacheVolume("lauging-train.qodana-cache")
                    .withResultFolder(dir.toAbsolutePath().toString())
                    .build();
            logger.atInfo().log("Running qodana %s to %s with srcfolder %s", gitUrl, dir, config.getSrcFolder());
            return analyzer.runQodana(dir);
        }
    }

    public List<AnalyzerResult> runQodana(Path dir) throws GitAPIException {
        QodanaAnalyzer analyzer = new QodanaAnalyzer.Builder()
                .withSourceFileRoot(config.getSrcFolder())
                .withResultFolder(dir.toAbsolutePath().toString())
                .build();
        return analyzer.runQodana(dir);
    }

    @ConsumeEvent(value = ServiceAdresses.QODANA_ANALYZER_REQUEST, blocking = true)
    public QodanaResult analyze(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s", request);
        try {
            if (request instanceof AnalyzerRequest.WithProject project) {
                return runQodanaWithConfig(project);
            } else {
                return new QodanaResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new QodanaResult.Failure(e.getMessage());
        }
    }

    private QodanaResult runQodanaWithConfig(AnalyzerRequest.WithProject project) {
        var projectConfig = getProjectConfig(project);
        if (projectConfig instanceof FindProjectConfigResult.SingleResult found) {
            var qodanaResult = invokeQodana(project, found.projectConfig());
            if (qodanaResult instanceof QodanaResult.Success success) {
                publishResults(success);
            }
            return qodanaResult;
        } else {
            return new QodanaResult.Failure("No config found");
        }
    }

    private FindProjectConfigResult getProjectConfig(WithProject item) {
        return new FindProjectConfigResult.MultipleResults(projectConfigService
                .getConfig(
                        new FindProjectConfigRequest.ByProjectUrl(item.project().url()))
                .await()
                .indefinitely());
    }

    private void publishResults(QodanaResult result) {
        eventBus.publish(ServiceAdresses.QODANA_ANALYZER_RESPONSE, result);
    }

    private QodanaResult invokeQodana(AnalyzerRequest.WithProject project, ProjectConfig projectConfig) {
        try {
            return threadPoolManager
                    .getService()
                    .submit(() -> new QodanaResult.Success(
                            runQodana(project.project().folder().toPath(), projectConfig.getSourceFolder()),
                            project.project()))
                    .get();
        } catch (Exception e) {
            return new QodanaResult.Failure(e.getMessage());
        }
    }

    private List<AnalyzerResult> runQodana(Path path, String sourceFolder) {
        QodanaAnalyzer analyzer = new QodanaAnalyzer.Builder()
                .withSourceFileRoot(sourceFolder)
                .withResultFolder(path.toAbsolutePath().toString())
                .build();
        return analyzer.runQodana(path);
    }

    @ApplicationScoped
    static class ThreadPoolManager {
        ExecutorService service;

        @PostConstruct
        void setup() {
            service = Executors.newFixedThreadPool(1);
        }

        @PreDestroy
        void close() {
            service.shutdown();
        }

        public ExecutorService getService() {
            return service;
        }
    }

    @Readiness
    @ApplicationScoped
    private static class HealthCheck implements AsyncHealthCheck {

        @Override
        public Uni<HealthCheckResponse> call() {
            return Uni.createFrom()
                    .item(HealthCheckResponse.named("Qodana Analyzer").up().build());
        }
    }
}
