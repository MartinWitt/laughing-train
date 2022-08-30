package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.MethodMayBeStatic;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.NonProtectedConstructorInAbstractClass;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.NonStrictComparisonCanBeEquality;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ParameterNameDiffersFromOverriddenParameter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.SizeReplaceableByIsEmpty;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryInterfaceModifier;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryLocalVariable;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryReturn;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryToStringCall;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedImport;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

/**
 * This aggreates all qodana refactorings and wraps them in a single processor.
 * Use {@link run(Path, ChangeListener)} to analyse the source code.
 * <b> Note: </b> This requires a running docker host and can take some minutes.
 */
public class QodanaRefactor extends TransformationProcessor<CtType<?>> {

    private Map<String, Function<AnalyzerResult, AbstractRefactoring>> ruleParser;
    private List<AbstractRefactoring> refactorings;
    private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
    private List<AnalyzerResult> results;

    private QodanaRefactor(Builder builder) {
        super(builder.listener);
        refactorings = new ArrayList<>();
        this.listener = builder.listener;
        this.ruleParser = builder.ruleParser;
        this.settings.addAll(builder.settings);
    }

    public QodanaRefactor(List<QodanaRules> qodanaRules, ChangeListener listener, List<AnalyzerResult> results) {
        super(listener);
        refactorings = new ArrayList<>();
        ruleParser = new HashMap<>();
        for (QodanaRules qodanaRule : qodanaRules) {
            ruleParser.put(qodanaRule.getRuleId(), qodanaRule.getRefactoring());
        }
        splitResults(results);
    }

    @Deprecated
    public QodanaRefactor(ChangeListener listener) {
        super(listener);
        this.listener = listener;
        refactorings = new ArrayList<>();
        ruleParser = new HashMap<>();
        // ruleParser.put("UnnecessaryReturn", UnnecessaryReturn::new);
        ruleParser.put("UnnecessaryToStringCall", UnnecessaryToStringCall::new);
        ruleParser.put("NonProtectedConstructorInAbstractClass", NonProtectedConstructorInAbstractClass::new);
        ruleParser.put("UnnecessaryInterfaceModifier", UnnecessaryInterfaceModifier::new);
        // ruleParser.put("ParameterNameDiffersFromOverriddenParameter",
        // ParameterNameDiffersFromOverriddenParameter::new);
        // ruleParser.put("MethodMayBeStatic", MethodMayBeStatic::new);
        ruleParser.put("NonStrictComparisonCanBeEquality", NonStrictComparisonCanBeEquality::new);
        ruleParser.put("SizeReplaceableByIsEmpty", SizeReplaceableByIsEmpty::new);
        ruleParser.put("UnnecessaryLocalVariable", UnnecessaryLocalVariable::new);
        ruleParser.put("UnusedImport", UnusedImport::new);
    }

    /**
     * Analyses the source code in the given source root
     * @param projectRoot  The root of the project which should be analysed.
     */
    @Deprecated
    public void analyze(Path projectRoot) {
        var runnerBuilder = new QodanaAnalyzer.Builder();
        settings.forEach(s -> s.accept(runnerBuilder));
        QodanaAnalyzer runner = runnerBuilder.build();
        results = runner.runQodana(projectRoot);
        splitResults(results);
    }

    @Deprecated
    // TODO: privat machen
    public void splitResults(List<AnalyzerResult> results) {
        for (AnalyzerResult result : results) {
            Optional.ofNullable(ruleParser.get(result.ruleID())).ifPresent(v -> refactorings.add(v.apply(result)));
        }
    }

    @Override
    public void process(CtType<?> type) {
        for (AbstractRefactoring refactoring : refactorings) {
            refactoring.refactor(listener, type);
        }
    }

    @Deprecated
    public static class Builder {

        private ChangeListener listener;
        private Map<String, Function<AnalyzerResult, AbstractRefactoring>> ruleParser = new HashMap<>();
        private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();

        public Builder(ChangeListener listener) {
            this.listener = listener;
        }

        public Builder withUnnecessaryReturn() {
            ruleParser.put("UnnecessaryReturn", UnnecessaryReturn::new);
            return this;
        }

        public Builder withUnnecessaryToStringCall() {
            ruleParser.put("UnnecessaryToStringCall", UnnecessaryToStringCall::new);
            return this;
        }

        public Builder withNonProtectedConstructorInAbstractClass() {
            ruleParser.put("NonProtectedConstructorInAbstractClass", NonProtectedConstructorInAbstractClass::new);
            return this;
        }

        public Builder withUnnecessaryInterfaceModifier() {
            ruleParser.put("UnnecessaryInterfaceModifier", UnnecessaryInterfaceModifier::new);
            return this;
        }

        public Builder withParameterNameDiffersFromOverriddenParameter() {
            ruleParser.put(
                    "ParameterNameDiffersFromOverriddenParameter", ParameterNameDiffersFromOverriddenParameter::new);
            return this;
        }

        public Builder withMethodMayBeStatic() {
            ruleParser.put("MethodMayBeStatic", MethodMayBeStatic::new);
            return this;
        }

        public Builder withUnnecessaryLocalVariable() {
            ruleParser.put("UnnecessaryLocalVariable", UnnecessaryLocalVariable::new);
            return this;
        }

        public Builder withUnusedImport() {
            ruleParser.put("UNUSED_IMPORT", UnusedImport::new);
            return this;
        }

        public Builder withNonStrictComparisonCanBeEquality() {
            ruleParser.put("NonStrictComparisonCanBeEquality", NonStrictComparisonCanBeEquality::new);
            return this;
        }

        public Builder withSizeReplaceableByIsEmpty() {
            ruleParser.put("SizeReplaceableByIsEmpty", SizeReplaceableByIsEmpty::new);
            return this;
        }

        public Builder withResultFolder(String resultFolder) {
            settings.add(builder -> builder.withResultFolder(resultFolder));
            return this;
        }

        public Builder withCacheFolder(String cacheFolder) {
            settings.add(builder -> builder.withCacheFolder(cacheFolder));
            return this;
        }

        public Builder withQodanaImageName(String qodanaImageName) {
            settings.add(builder -> builder.withQodanaImageName(qodanaImageName));
            return this;
        }

        public Builder withRemoveResultDir(boolean removeResultDir) {
            settings.add(builder -> builder.withRemoveResultDir(removeResultDir));
            return this;
        }

        public Builder withSourceFileRoot(String sourceFileRoot) {
            settings.add(builder -> builder.withSourceFileRoot(sourceFileRoot));
            return this;
        }

        public QodanaRefactor build() {
            return new QodanaRefactor(this);
        }
    }
}
