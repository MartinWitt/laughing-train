package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.List;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.rules.UnnecessaryToStringCall;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public enum SpoonAnalyzerRules implements AbstractSpoonRuleAnalyzer, AnalyzerRule {
    UNNECESSARY_TOSTRING_CALL("UnnecessaryTostringCall", new UnnecessaryToStringCall());

    private final RuleId ruleId;
    private final AbstractSpoonRuleAnalyzer analyzer;

    SpoonAnalyzerRules(String ruleId, AbstractSpoonRuleAnalyzer analyzer) {
        this.ruleId = new RuleId(ruleId);
        this.analyzer = analyzer;
    }

    @Override
    public RuleId getRuleId() {
        return ruleId;
    }

    List<BadSmell> getDescription() {
        return analyzer.getHandledBadSmells();
    }

    @Override
    public List<SpoonAnalyzerResult> analyze(CtType<?> type) {

        return analyzer.analyze(type);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result) {
        analyzer.refactor(listener, type, result);
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return analyzer.getHandledBadSmells();
    }
}
