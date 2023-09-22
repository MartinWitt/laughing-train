package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;

public record SpoonAnalyzerResult(
    RuleId ruleID,
    String filePath,
    Position position,
    String message,
    String messageMarkdown,
    String snippet)
    implements AnalyzerResult {

  @Override
  public String getAnalyzer() {
    return "Spoon";
  }
}
