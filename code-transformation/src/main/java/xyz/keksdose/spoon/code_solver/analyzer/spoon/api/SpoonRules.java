package xyz.keksdose.spoon.code_solver.analyzer.spoon.api;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.AccessStaticViaInstance;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.IndexOfReplaceableByContains;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.UnnecessaryImplements;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.UnnecessaryToString;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

/** Enum for all spoon based rules. */
public enum SpoonRules implements AnalyzerRule {
  ACCESS_STATIC_VIA_INSTANCE("AccessStaticViaInstance", new AccessStaticViaInstance()),
  UNNECESSARY_TO_STRING("UnnecessaryToString", new UnnecessaryToString()),
  UNNECESSARY_IMPLEMENTS("UnnecessaryImplements", new UnnecessaryImplements()),
  INDEX_OF_REPLACEABLE_BY_CONTAINS(
      "IndexOfReplaceableByContains", new IndexOfReplaceableByContains()),
  ;
  private final RuleId ruleId;
  private final SpoonRefactoring refactoring;
  private CodeIssue description;

  SpoonRules(String ruleId, SpoonRefactoring refactoring) {
    this.ruleId = new RuleId(ruleId);
    this.refactoring = refactoring;
  }

  @Override
  public RuleId ruleId() {
    return ruleId;
  }

  public SpoonRefactoring getRefactoring() {
    return refactoring;
  }

  public CodeIssue description() {
    return refactoring.getHandledBadSmells();
  }
}
