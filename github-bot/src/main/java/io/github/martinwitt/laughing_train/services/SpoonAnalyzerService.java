package io.github.martinwitt.laughing_train.services;

import com.google.common.base.Strings;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonBasedAnalyzer;

@ApplicationScoped
public class SpoonAnalyzerService {

  final AnalyzerResultPersistenceService analyzerResultPersistenceService;
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  SpoonAnalyzerService(AnalyzerResultPersistenceService analyzerResultPersistenceService) {
    this.analyzerResultPersistenceService = analyzerResultPersistenceService;
  }

  public CodeAnalyzerResult analyze(AnalyzerRequest request) {
    logger.atInfo().log("Received request %s", request);
    try {
      switch (request) {
        case AnalyzerRequest.WithProject project -> {
          File folder = project.gitProject().folder();
          SpoonBasedAnalyzer analyzer = new SpoonBasedAnalyzer();
          List<AnalyzerResult> analyze = analyzer.analyze(folder.toPath());
          logger.atFine().log(
              "Spoon found %s results with the following rules: %s",
              analyze.size(),
              analyze.stream()
                  .map(v -> v.ruleID().toString())
                  .distinct()
                  .collect(Collectors.joining(",")));
          CodeAnalyzerResult.Success success =
              new CodeAnalyzerResult.Success(analyze, project.gitProject());
          analyzerResultPersistenceService.persistResults(success);
          return success;
        }
        default -> {
          return new CodeAnalyzerResult.Failure("Unknown request type");
        }
      }
    } catch (Throwable e) {
      logger.atSevere().log("Error while analyzing code analyzer %s", e.getMessage());
      return new CodeAnalyzerResult.Failure(Strings.nullToEmpty(e.getMessage()));
    }
  }
}
