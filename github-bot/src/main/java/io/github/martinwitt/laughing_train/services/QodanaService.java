package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.quarkus.vertx.ConsumeEvent;
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
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class QodanaService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    Config config;

    @Inject
    ThreadPoolManager threadPoolManager;

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
                    .withCacheVolume("lauging-train.qodana-cache")
                    .withResultFolder(dir.toAbsolutePath().toString())
                    .build();
            logger.atInfo().log("Running qodana %s to %s with srcfolder %s", gitUrl, dir, config.getSrcFolder());
            return analyzer.runQodana(dir);
        }
    }

    @ConsumeEvent(value = "qodana.analyzer.request", blocking = true)
    public QodanaResult analyze(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s", request);
        try {
            if (request instanceof AnalyzerRequest.UrlOnly urlOnly) {
                return threadPoolManager
                        .getService()
                        .submit(() -> new QodanaResult.Success(runQodana(urlOnly.gitUrl())))
                        .get();
            } else if (request instanceof AnalyzerRequest.WithFolder urlAndPath) {
                return threadPoolManager
                        .getService()
                        .submit(() -> new QodanaResult.Success(runQodana(urlAndPath.gitUrl(), urlAndPath.folder())))
                        .get();
            } else {
                return new QodanaResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new QodanaResult.Failure(e.getMessage());
        }
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
