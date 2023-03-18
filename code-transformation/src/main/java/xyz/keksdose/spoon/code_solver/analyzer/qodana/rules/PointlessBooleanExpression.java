package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import com.google.common.base.Splitter;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class PointlessBooleanExpression extends AbstractRefactoring {

    private static final BadSmell POINTLESS_BOOLEAN_EXPRESSION = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw("Boolean expressions shouldn't be overcomplex. ");
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("PointlessBooleanExpression");
        }
    };

    public PointlessBooleanExpression(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        Position position = result.position();
        for (CtExpression<?> ctExpression : type.getElements(new TypeFilter<>(CtExpression.class))) {
            if (isBooleanType(ctExpression)
                    && hasSameStartLine(position, ctExpression)
                    && hasSameColumn(position, ctExpression)) {
                var splitted = Splitter.on("'").omitEmptyStrings().splitToList(result.message());
                if (splitted.size() == 3) {
                    String oldExpression = splitted.get(0);
                    String newExpression = splitted.get(2);
                    if (isAlreadyFixed(listener)) {
                        // allready fixed the issue
                        return;
                    }

                    ctExpression.replace(
                            createNewExpression(ctExpression, newExpression).clone());
                    ctExpression.setParent(null);
                    MarkdownString md = MarkdownString.fromMarkdown(
                            "Replaced %s with %s".formatted(oldExpression, newExpression),
                            "Replaced `%s` with `%s`".formatted(oldExpression, newExpression));
                    Change change = new Change(POINTLESS_BOOLEAN_EXPRESSION, md, type.getTopLevelType(), result);
                    listener.setChanged(type.getTopLevelType(), change);
                }
            }
        }
    }

    private boolean isAlreadyFixed(ChangeListener listener) {
        return listener.getChangelog().getChanges().stream()
                .anyMatch(v -> v.getAnalyzerResult().equals(result));
    }

    private CtExpression<Object> createNewExpression(CtExpression<?> ctExpression, String newExpression) {
        return ctExpression.getFactory().createCodeSnippetExpression(newExpression);
    }

    private boolean hasSameColumn(Position position, CtExpression<?> ctExpression) {
        return ctExpression.getPosition().getColumn() == position.startColumn();
    }

    private boolean hasSameStartLine(Position position, CtExpression<?> ctExpression) {
        return ctExpression.getPosition().getLine() == position.startLine();
    }

    private boolean isBooleanType(CtExpression<?> ctExpression) {
        return ctExpression.getType() != null
                && (ctExpression
                                .getType()
                                .equals(ctExpression.getFactory().Type().booleanType())
                        || ctExpression
                                .getType()
                                .equals(ctExpression.getFactory().Type().booleanPrimitiveType()));
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(POINTLESS_BOOLEAN_EXPRESSION);
    }
}
