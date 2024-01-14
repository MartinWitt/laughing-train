package io.github.martinwitt.laughing_train.api.graphql.dto;

import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;

public class AnalyzerRuleDto {

  private final String ruleId;
  private final String description;

  public AnalyzerRuleDto(AnalyzerRule rule) {
    ruleId = rule.ruleId().id();
    description = rule.description().getDescription().asText();
  }

  public String getDescription() {
    return description;
  }

  public String getRuleId() {
    return ruleId;
  }

  @Override
  public String toString() {
    return "AnalyzerRuleDto{"
        + "ruleId='"
        + ruleId
        + '\''
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
