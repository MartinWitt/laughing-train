package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import com.google.common.flogger.FluentLogger;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtTargetedExpression;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;

public class ComparatorCombinators extends AbstractRefactoring {
    private static final String COMPARATOR_COMPARING = "Comparator.comparing";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public ComparatorCombinators(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        String kind = StringUtils.substringBetween(result.message(), "'");
        switch (kind) {
            case COMPARATOR_COMPARING -> refactorComparatorCombinators(listener, type);
            default -> logger.atWarning().log("Unknown kind of ComparatorCombinators: %s", kind);
        }
    }

    private void refactorComparatorCombinators(ChangeListener listener, CtType<?> type) {
        var position = result.position();
        PositionScanner scanner = new PositionScanner(position);
        type.accept(scanner);
        var element = scanner.getResult().stream()
                .filter(CtLambda.class::isInstance)
                .map(v -> (CtLambda<?>) v)
                .toList();
        if (element.size() == 1) {
            var lambda = element.get(0);
            var body = lambda.getExpression();
            if (body != null && lambda.getParameters().size() == 2) {
                String parameter1 = lambda.getParameters().get(0).getSimpleName();
                String parameter2 = lambda.getParameters().get(1).getSimpleName();
                convertToFunction(body, parameter1, parameter2).ifPresent(v -> {
                    addComparatorImport(type, v);
                    lambda.replace(v);
                    Change change = new Change(COMPARATOR_COMPARING, COMPARATOR_COMPARING, type);
                    listener.setChanged(type, change);
                });
            }
        }
    }

    private void addComparatorImport(CtType<?> type, CtCodeSnippetExpression<?> v) {
        ImportHelper.addImport(
                v.getFactory().createImport(v.getFactory().createReference("java.util.Comparator")),
                type.getPosition().getCompilationUnit());
    }

    private Optional<CtCodeSnippetExpression<?>> convertToFunction(
            CtExpression<?> body, String parameterName1, String parameterName2) {
        var function = body.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable().getSimpleName().equals("compareTo"))
                .map(CtTargetedExpression::getTarget)
                .findFirst();
        String parameterName = function.map(v -> (v.toString().contains(parameterName1 + " ")
                                || v.toString().contains(parameterName1 + ".")
                        ? parameterName1
                        : parameterName2))
                .orElse("");
        if (parameterName.isEmpty()) {
            return Optional.empty();
        }
        return function.map(v -> body.getFactory()
                .createCodeSnippetExpression("Comparator.comparing(%s -> %s)".formatted(parameterName, v.toString())));
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return null;
    }
}
