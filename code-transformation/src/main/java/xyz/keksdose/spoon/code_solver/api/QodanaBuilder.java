package xyz.keksdose.spoon.code_solver.api;

import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public class QodanaBuilder {

    private List<UnaryOperator<QodanaRefactor.Builder>> qodanaCreator;
    private Supplier<QodanaRefactor.Builder> qodanaCreatorSupplier;

    public QodanaBuilder(ChangeListener listener) {
        qodanaCreatorSupplier = () -> new QodanaRefactor.Builder(listener);
        qodanaCreator = new ArrayList<>();
    }

    public QodanaBuilder() {
        this(new ChangeListener());
    }

    public QodanaBuilder withUnnecessaryReturn() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryReturn);
        return this;
    }

    public QodanaBuilder withUnnecessaryToStringCall() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryToStringCall);
        return this;
    }

    public QodanaBuilder withNonProtectedConstructorInAbstractClass() {
        qodanaCreator.add(QodanaRefactor.Builder::withNonProtectedConstructorInAbstractClass);
        return this;
    }

    public QodanaBuilder withUnnecessaryInterfaceModifier() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryInterfaceModifier);
        return this;
    }

    public QodanaBuilder withParameterNameDiffersFromOverriddenParameter() {
        qodanaCreator.add(QodanaRefactor.Builder::withParameterNameDiffersFromOverriddenParameter);
        return this;
    }

    public QodanaBuilder withMethodMayBeStatic() {
        qodanaCreator.add(QodanaRefactor.Builder::withMethodMayBeStatic);
        return this;
    }

    public QodanaBuilder withUnnecessaryLocalVariable() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryLocalVariable);
        return this;
    }

    public QodanaBuilder withNonStrictComparisonCanBeEquality() {
        qodanaCreator.add(QodanaRefactor.Builder::withNonStrictComparisonCanBeEquality);
        return this;
    }

    public QodanaBuilder withSizeReplaceableByIsEmpty() {
        qodanaCreator.add(QodanaRefactor.Builder::withSizeReplaceableByIsEmpty);
        return this;
    }

    public QodanaBuilder withUnusedImport() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnusedImport);
        return this;
    }

    public QodanaBuilder withResultFolder(String resultFolder) {
        qodanaCreator.add(v -> v.withResultFolder(resultFolder));
        return this;
    }

    public QodanaBuilder withCacheFolder(String cacheFolder) {
        qodanaCreator.add(v -> v.withCacheFolder(cacheFolder));
        return this;
    }

    public QodanaBuilder withQodanaImageName(String qodanaImageName) {
        qodanaCreator.add(v -> v.withQodanaImageName(qodanaImageName));
        return this;
    }

    public QodanaBuilder withRemoveResultDir(boolean removeResultDir) {
        qodanaCreator.add(v -> v.withRemoveResultDir(removeResultDir));
        return this;
    }

    public QodanaBuilder withSourceFileRoot(String sourceFileRoot) {
        qodanaCreator.add(v -> v.withSourceFileRoot(sourceFileRoot));
        return this;
    }

    public QodanaRefactor build() {
        @Var var builder = qodanaCreatorSupplier.get();
        for (UnaryOperator<QodanaRefactor.Builder> function : qodanaCreator) {
            builder = function.apply(builder);
        }
        return builder.build();
    }
}
