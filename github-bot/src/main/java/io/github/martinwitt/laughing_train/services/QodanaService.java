package io.github.martinwitt.laughing_train.services;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest.WithProject;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.smallrye.health.api.AsyncHealthCheck;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;

@ApplicationScoped
public class QodanaService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    final Config config;
    final ThreadPoolManager threadPoolManager;
    final ProjectConfigService projectConfigService;
    final AnalyzerResultPersistenceService analyzerResultPersistenceService;

    QodanaService(
            Config config,
            ThreadPoolManager threadPoolManager,
            ProjectConfigService projectConfigService,
            AnalyzerResultPersistenceService analyzerResultPersistenceService) {
        this.config = config;
        this.threadPoolManager = threadPoolManager;
        this.projectConfigService = projectConfigService;
        this.analyzerResultPersistenceService = analyzerResultPersistenceService;
    }

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

    public QodanaResult analyze(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s", request);
        try {
            if (request instanceof AnalyzerRequest.WithProject project) {
                return runQodanaWithConfig(project).await().indefinitely();
            } else {
                return new QodanaResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new QodanaResult.Failure(Strings.nullToEmpty(e.getMessage()));
        }
    }

    public Uni<QodanaResult> analyzeUni(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s", request);
        try {
            if (request instanceof AnalyzerRequest.WithProject project) {
                return runQodanaWithConfig(project);
            } else {
                return Uni.createFrom().item(new QodanaResult.Failure("Unknown request type"));
            }
        } catch (Exception e) {
            return Uni.createFrom().item(new QodanaResult.Failure(Strings.nullToEmpty(e.getMessage())));
        }
    }

    private Uni<QodanaResult> runQodanaWithConfig(AnalyzerRequest.WithProject project) {
        return getProjectConfig(project)
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return Uni.createFrom().failure(new RuntimeException("No config found"));
                    } else {
                        return Uni.createFrom().item(list.get(0));
                    }
                })
                .emitOn(Infrastructure.getDefaultExecutor())
                .map(config -> invokeQodana(project, config))
                .invoke(this::persistResults)
                .onFailure()
                .recoverWithItem(e -> new QodanaResult.Failure(Strings.nullToEmpty(e.getMessage())));
    }

    private Uni<List<ProjectConfig>> getProjectConfig(WithProject item) {
        return projectConfigService.getConfig(
                new FindProjectConfigRequest.ByProjectUrl(item.project().url()));
    }

    private void persistResults(QodanaResult result) {
        analyzerResultPersistenceService.persistResults(result);
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
            return new QodanaResult.Failure(Strings.nullToEmpty(e.getMessage()));
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
        @SuppressWarnings("NullAway")
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
