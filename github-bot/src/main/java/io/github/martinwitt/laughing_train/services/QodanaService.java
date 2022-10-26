package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.FindProjectConfigResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.vertx.ConsumeEvent;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
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
                return vertx.<QodanaResult>executeBlocking(promise -> {
                            String projectUrl = project.project().url();
                            eventBus.<FindProjectConfigResult>request(
                                    ServiceAdresses.PROJECT_CONFIG_REQUEST,
                                    new FindProjectConfigRequest.ByProjectUrl(projectUrl),
                                    new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(30)),
                                    handler -> {
                                        if (handler.succeeded()) {
                                            FindProjectConfigResult result =
                                                    handler.result().body();
                                            if (result instanceof FindProjectConfigResult.SingleResult found) {
                                                ProjectConfig projectConfig = found.projectConfig();
                                                logger.atInfo().log("Found config %s", projectConfig);
                                                try {
                                                    QodanaResult results = invokeQodana(project, projectConfig);
                                                    if (results instanceof QodanaResult.Success success) {
                                                        promise.complete(new QodanaResult.Success(
                                                                success.result(), project.project()));
                                                        publishResults(success);
                                                    } else {
                                                        promise.fail("Qodana failed");
                                                    }
                                                } catch (Exception e) {
                                                    logger.atSevere().withCause(e).log("Error while running qodana");
                                                    promise.complete(new QodanaResult.Failure(e.getMessage()));
                                                }
                                            } else {
                                                logger.atSevere().log("No config found for %s", projectUrl);
                                                promise.complete(new QodanaResult.Failure("No config found"));
                                            }
                                        }
                                    });
                        })
                        .result();
            } else {
                return new QodanaResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new QodanaResult.Failure(e.getMessage());
        }
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

    private Future<ProjectConfig> transformToProjectResult(
            String projectUrl, AsyncResult<Message<FindProjectConfigResult>> v) {
        if (v.failed()) {
            logger.atSevere().withCause(v.cause()).log("Error while getting project config");
            return Future.failedFuture("Error while getting project config");
        } else {
            FindProjectConfigResult result = v.result().body();
            if (result instanceof FindProjectConfigResult.SingleResult found) {
                logger.atInfo().log("Found project config %s", found.projectConfig());
                return Future.succeededFuture(found.projectConfig());
            } else {
                logger.atSevere().log("Could not find project config for %s", projectUrl);
                return Future.failedFuture("Could not find project config for " + projectUrl);
            }
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
}
