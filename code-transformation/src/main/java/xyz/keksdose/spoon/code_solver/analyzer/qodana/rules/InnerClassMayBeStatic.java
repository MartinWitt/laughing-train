package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class InnerClassMayBeStatic extends AbstractRefactoring {

    private static final BadSmell badSmell = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromMarkdown("InnerClassMayBeStatic");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromMarkdown(
                    """
        Inner classes that do not reference their enclosing instances can be made static.
        This prevents a common cause of memory leaks and uses less memory per instance of the class.
        """);
        }
    };

    public InnerClassMayBeStatic(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (!isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtType<?> ctType : filterMatches(PositionScanner.findLineOnly(type, result.position()))) {
            var modifiers = new HashSet<>(ctType.getModifiers());
            modifiers.add(ModifierKind.STATIC);
            ctType.setModifiers(modifiers);
            String format = "Add to inner class %s modifier static";
            String markdown = String.format(format, "`" + ctType.getSimpleName() + "`");
            String text = String.format(format, ctType.getQualifiedName());
            MarkdownString markdownString = MarkdownString.fromMarkdown(text, markdown);
            Change change = new Change(badSmell, markdownString, getMostOuterType(type), result);
            listener.setChanged(getMostOuterType(type), change);
        }
    }

    private Iterable<? extends CtType<?>> filterMatches(List<CtElement> findLineOnly) {
        return findLineOnly.stream()
                .filter(v -> v instanceof CtType<?>)
                .map(v -> (CtType<?>) v)
                .filter(v -> !v.isTopLevel())
                .filter(v -> !v.getModifiers().contains(ModifierKind.STATIC))
                .toList();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }

    private CtType<?> getMostOuterType(CtType<?> inner) {
        if (inner.getDeclaringType() == null) {
            return inner;
        } else {
            return getMostOuterType(inner.getDeclaringType());
        }
    }
}
