package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.List;
import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.AccessStaticViaInstance;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.IndexOfReplaceableByContains;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.UnnecessaryImplements;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.UnnecessaryToString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

/** Enum for all spoon based rules. */
public enum SpoonRules implements AnalyzerRule {
  ACCESS_STATIC_VIA_INSTANCE("AccessStaticViaInstance", AccessStaticViaInstance::new),
  UNNECESSARY_TO_STRING("UnnecessaryToString", UnnecessaryToString::new),
  UNNECESSARY_IMPLEMENTS("UnnecessaryImplements", UnnecessaryImplements::new),
  INDEX_OF_REPLACEABLE_BY_CONTAINS(
      "IndexOfReplaceableByContains", IndexOfReplaceableByContains::new),
  ;
  private final RuleId ruleId;
  private final Function<AnalyzerResult, AbstractRefactoring> refactoring;

  SpoonRules(String ruleId, Function<AnalyzerResult, AbstractRefactoring> refactoring) {
    this.ruleId = new RuleId(ruleId);
    this.refactoring = refactoring;
  }

  @Override
  public RuleId getRuleId() {
    return ruleId;
  }

  Function<AnalyzerResult, AbstractRefactoring> getRefactoring() {
    return refactoring;
  }

  List<BadSmell> getDescription() {
    return getRefactoring().apply(null).getHandledBadSmells();
  }
}
