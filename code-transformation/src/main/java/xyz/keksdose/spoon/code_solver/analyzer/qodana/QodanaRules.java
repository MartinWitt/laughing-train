package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.List;
import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.analyzer.AnalyzerRule;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.InnerClassMayBeStatic;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.MethodMayBeStatic;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.NonProtectedConstructorInAbstractClass;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.NonStrictComparisonCanBeEquality;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ParameterNameDiffersFromOverriddenParameter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.PointlessBooleanExpression;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ProtectedMemberInFinalClass;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.SizeReplaceableByIsEmpty;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ToArrayCallWithZeroLengthArrayArgument;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryInterfaceModifier;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryLocalVariable;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryModifier;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryReturn;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryToStringCall;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedImport;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedLabel;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public enum QodanaRules implements AnalyzerRule {
    METHOD_MAY_BE_STATIC("MethodMayBeStatic", MethodMayBeStatic::new),
    NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS(
            "NonProtectedConstructorInAbstractClass", NonProtectedConstructorInAbstractClass::new),
    NON_STRICT_COMPARISON_CAN_BE_EQUALITY("NonStrictComparisonCanBeEquality", NonStrictComparisonCanBeEquality::new),
    PARAMETER_NAME_DIFFERS_FROM_OVERRIDDEN_PARAMETER(
            "ParameterNameDiffersFromOverriddenParameter", ParameterNameDiffersFromOverriddenParameter::new),
    SIZE_REPLACEABLE_BY_IS_EMPTY("SizeReplaceableByIsEmpty", SizeReplaceableByIsEmpty::new),
    UNNECESSARY_INTERFACE_MODIFIER("UnnecessaryInterfaceModifier", UnnecessaryInterfaceModifier::new),
    UNNECESSARY_LOCAL_VARIABLE("UnnecessaryLocalVariable", UnnecessaryLocalVariable::new),
    UNNECESSARY_RETURN("UnnecessaryReturn", UnnecessaryReturn::new),
    UNNECESSARY_TO_STRING_CALL("UnnecessaryToStringCall", UnnecessaryToStringCall::new),
    UNUSED_IMPORT("UnusedImport", UnusedImport::new),
    PROTECTED_MEMBER_IN_FINAL_CLASS("ProtectedMemberInFinalClass", ProtectedMemberInFinalClass::new),
    UNNECESSARY_MODIFIER("UnnecessaryModifier", UnnecessaryModifier::new),
    POINTLESS_BOOLEAN_EXPRESSION("PointlessBooleanExpression", PointlessBooleanExpression::new),
    INNER_CLASS_MAY_BE_STATIC("InnerClassMayBeStatic", InnerClassMayBeStatic::new),
    TO_ARRAY_CALL_WITH_ZERO_LENGTH_ARRAY_ARGUMENT(
            "ToArrayCallWithZeroLengthArrayArgument", ToArrayCallWithZeroLengthArrayArgument::new),
    UNUSED_LABEL("UnusedLabel", UnusedLabel::new),
    ;

    private final RuleId ruleId;
    private final Function<AnalyzerResult, AbstractRefactoring> refactoring;

    QodanaRules(String ruleId, Function<AnalyzerResult, AbstractRefactoring> refactoring) {
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
