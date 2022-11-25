package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CodeBlock2Expr extends AbstractRefactoring {

    private static final BadSmell BAD_SMELL = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("CodeBlock2Expr");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    """
              Single line lambda expressions can be written without curly braces. This improves readability.
            The follwing code:
            ```java
            return logFunc.apply(first, log).flatMap(t -> {
                return logFunc.apply(second, log).map(u -> combiner.apply(t, u));
                });
            ```
            can be written as:
            ```java
            return logFunc.apply(first, log).flatMap(t -> logFunc.apply(second, log).map(u -> combiner.apply(t, u)));
            ```
              """);
        }
    };

    public CodeBlock2Expr(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (!isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtLambda lambda : findMatchingElements(type)) {
            if (lambda.getBody() != null
                    && lambda.getBody().getStatements().size() == 1
                    && lambda.getExpression() == null) {
                CtExpression<?> statement = ((CtReturn) lambda.getBody().getStatement(0)).getReturnedExpression();
                lambda.setBody(null);
                lambda.setExpression(statement);
                String message =
                        "Lambda expression in %s was rewritten as statement".formatted(type.getQualifiedName());
                String messageMarkdown =
                        "Lambda expression in `%s` was rewritten as statement".formatted(type.getQualifiedName());
                listener.setChanged(
                        type,
                        new Change(BAD_SMELL, MarkdownString.fromMarkdown(message, messageMarkdown), type, result));
            }
        }
    }

    private List<CtLambda> findMatchingElements(CtType<?> type) {
        return PositionScanner.findLineOnly(type, toStartLinePosition(result.position())).stream()
                .filter(v -> v instanceof CtLambda<?>)
                .map(CtLambda.class::cast)
                .toList();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(BAD_SMELL);
    }

    private Position toStartLinePosition(Position position) {
        return new Position(position.startLine() - 1, position.startLine() + 1, 0, 0, 0, 0);
    }
}
