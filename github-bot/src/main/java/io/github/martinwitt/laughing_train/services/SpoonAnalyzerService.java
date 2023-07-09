package io.github.martinwitt.laughing_train.services;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.File;
import java.util.List;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonBasedAnalyzer;

@ApplicationScoped
public class SpoonAnalyzerService {

    final AnalyzerResultPersistenceService analyzerResultPersistenceService;
    final ProjectConfigService projectConfigService;
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    SpoonAnalyzerService(
            AnalyzerResultPersistenceService analyzerResultPersistenceService,
            ProjectConfigService projectConfigService) {
        this.analyzerResultPersistenceService = analyzerResultPersistenceService;
        this.projectConfigService = projectConfigService;
    }

    public CodeAnalyzerResult analyze(AnalyzerRequest request) {
        logger.atInfo().log("Received request %s", request);
        try {
            if (request instanceof AnalyzerRequest.WithProject project) {
                File folder = project.project().folder();
                SpoonBasedAnalyzer analyzer = new SpoonBasedAnalyzer();
                List<AnalyzerResult> analyze = analyzer.analyze(folder.toPath());
                CodeAnalyzerResult.Success success = new CodeAnalyzerResult.Success(analyze, project.project());
                analyzerResultPersistenceService.persistResults(success);
                return success;
            } else {
                return new CodeAnalyzerResult.Failure("Unknown request type");
            }
        } catch (Exception e) {
            return new CodeAnalyzerResult.Failure(Strings.nullToEmpty(e.getMessage()));
        }
    }
}
