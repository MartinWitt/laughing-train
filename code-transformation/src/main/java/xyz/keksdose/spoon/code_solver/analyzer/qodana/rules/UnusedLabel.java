package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnusedLabel extends AbstractRefactoring {
    private static final BadSmell badSmell = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    """
          A label is a named statement that can be used to jump to it from other parts of the code. If a label is not used, it is better to remove it.
          """);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("UnusedLabel");
        }
    };

    public UnusedLabel(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (!isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtStatement statementsWithLabel :
                filterMatches(PositionScanner.findLineOnly(type, toStartLinePosition(result.position())))) {
            statementsWithLabel.setLabel(null);
            String message = "Removed unused label %s".formatted(statementsWithLabel.getLabel());
            String markdown = "Removed unused label `%s`".formatted(statementsWithLabel.getLabel());
            Change change = new Change(badSmell, MarkdownString.fromMarkdown(message, markdown), type, result);
            listener.setChanged(type, change);
        }
    }

    private List<CtStatement> filterMatches(List<CtElement> findLineOnly) {
        return findLineOnly.stream()
                .filter(CtStatement.class::isInstance)
                .map(CtStatement.class::cast)
                .filter(v -> v.getLabel() != null)
                .toList();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }

    private Position toStartLinePosition(Position position) {
        return new Position(position.startLine(), 0, 0, 0, 0, 0);
    }
}
