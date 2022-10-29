package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class ToArrayCallWithZeroLengthArrayArgument extends AbstractRefactoring {

    private static BadSmell badSmell = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromMarkdown(
                    """
        The performance of the empty array version is the same, and sometimes even better, compared
        to the pre-sized version. Also, passing a pre-sized array is dangerous for a concurrent or
        synchronized collection as a data race is possible between the <code>size</code> and <code>toArray</code>
        calls. This may result in extra <code>null</code>s at the end of the array if the collection was concurrently
        shrunk during the operation.</p>
        See https://shipilev.net/blog/2016/arrays-wisdom-ancients/ for more details.
        """);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromMarkdown("ToArrayCallWithZeroLengthArrayArgument");
        }
    };

    public ToArrayCallWithZeroLengthArrayArgument(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (!isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtNewArray<?> toArrayCall : filterMatches(PositionScanner.findLineOnly(type, result.position()))) {
            var dimensionExpression = toArrayCall.getDimensionExpressions().get(0);
            var zeroExpression = dimensionExpression.getFactory().createLiteral(0);
            dimensionExpression.replace(zeroExpression);
            String message = "Replaced " + toMarkdown(dimensionExpression) + " with " + zeroExpression;
            String markdown = "Replaced " + toMarkdown(dimensionExpression) + " with " + zeroExpression;
            Change change = new Change(badSmell, MarkdownString.fromMarkdown(message, markdown), type, result);
            listener.setChanged(type, change);
        }
    }

    @SuppressWarnings("rawtypes")
    private List<CtNewArray> filterMatches(List<CtElement> findLineOnly) {
        return findLineOnly.stream()
                .filter(CtNewArray.class::isInstance)
                .map(CtNewArray.class::cast)
                .filter(ctNewArray -> ctNewArray.getDimensionExpressions().size() == 1)
                .filter(ctNewArray ->
                        !ctNewArray.getDimensionExpressions().get(0).toString().equals("0"))
                .toList();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }

    private String toMarkdown(Object input) {
        return "`" + input + "`";
    }
}
