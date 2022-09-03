package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class NonStrictComparisonCanBeEquality extends AbstractRefactoring {
    private static final BadSmell NON_STRICT_COMPARISON_CAN_BE_EQUALITY = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Non-Strict-Comparison-Can-Be-Equality");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "Inequality conditions that, according to data flow analysis, can be satisfied only for a single operand value. Such conditions could be replaced with equality conditions to make the code clearer.");
        }
    };

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        int column = result.position().startColumn();
        int line = result.position().startLine();
        var operators = type.getElements(new TypeFilter<>(CtBinaryOperator.class));
        for (CtBinaryOperator<?> ctBinaryOperator : operators) {
            if (ctBinaryOperator.getPosition().getLine() == line
                    && containsColumn(ctBinaryOperator, column)
                    && (ctBinaryOperator.getKind() == BinaryOperatorKind.LE
                            || ctBinaryOperator.getKind() == BinaryOperatorKind.GE)) {
                ctBinaryOperator.setKind(BinaryOperatorKind.EQ);
                listener.setChanged(
                        type,
                        new Change(
                                NON_STRICT_COMPARISON_CAN_BE_EQUALITY,
                                MarkdownString.fromRaw("Replaced inequality with simpler equality"),
                                type,
                                result));
            }
        }
    }

    private boolean containsColumn(CtBinaryOperator<?> binaryOperator, int column) {
        return binaryOperator.getPosition().getColumn() <= column
                && binaryOperator.getPosition().getEndColumn() >= column;
    }

    public NonStrictComparisonCanBeEquality(AnalyzerResult result) {
        super(result);
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(NON_STRICT_COMPARISON_CAN_BE_EQUALITY);
    }
}
