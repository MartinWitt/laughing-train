package io.github.martinwitt.laughing_train.services;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.SpoonPatternAnalyzerResult;
import io.smallrye.health.api.AsyncHealthCheck;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzer;

@ApplicationScoped
public class SpoonPatternAnalyzer {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    final Config config;
    final ProjectConfigService projectConfigService;
    final AnalyzerResultPersistenceService analyzerResultPersistenceService;

    SpoonPatternAnalyzer(
            Config config,
            ProjectConfigService projectConfigService,
            AnalyzerResultPersistenceService analyzerResultPersistenceService) {
        this.config = config;
        this.projectConfigService = projectConfigService;
        this.analyzerResultPersistenceService = analyzerResultPersistenceService;
    }

    public SpoonPatternAnalyzerResult analyze(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s for SpoonPatternAnalyzer", request);
        try {
            if (request instanceof AnalyzerRequest.WithProject project) {
                SpoonAnalyzer analyzer = new SpoonAnalyzer();

                return new SpoonPatternAnalyzerResult.Success(
                        analyzer.analyze(project.project().folder().toPath()), project.project());
            } else {
                return new SpoonPatternAnalyzerResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new SpoonPatternAnalyzerResult.Failure(Strings.nullToEmpty(e.getMessage()));
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
