package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.List;
import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.MethodMayBeStatic;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

/**
 * Enum for all spoon based rules.
 */
public enum SpoonRules implements AnalyzerRule {
    METHOD_MAY_BE_STATIC("MethodMayBeStatic", MethodMayBeStatic::new);

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
