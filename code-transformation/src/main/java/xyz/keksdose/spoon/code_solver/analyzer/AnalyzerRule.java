package xyz.keksdose.spoon.code_solver.analyzer;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

public interface AnalyzerRule {

  RuleId ruleId();

  CodeIssue description();
}
