package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import static xyz.keksdose.spoon.code_solver.history.MarkdownString.fromMarkdown;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryToStringCall extends AbstractRefactoring {

    private static final BadSmell UNNECESSARY_TO_STRING_CALL = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("UnnecessaryToStringCall");
        }

        @Override
        public MarkdownString getDescription() {
            return fromMarkdown(
                    "The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.");
        }
    };

    public UnnecessaryToStringCall(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtInvocation<?> toStringInvocation :
                filterMatches(PositionScanner.findLineOnly(type, result.position()))) {
            CtInvocation<?> oldInvocation = toStringInvocation.clone().setParent(null);
            toStringInvocation.replace(toStringInvocation.getTarget().clone());
            listener.setChanged(
                    type.getTopLevelType(),
                    new Change(
                            UNNECESSARY_TO_STRING_CALL,
                            fromMarkdown("Remove redudant `toString()` call in `%s`".formatted(oldInvocation)),
                            type.getTopLevelType(),
                            result));
        }
    }
    /**
     * Removes all matches that are no toString invocations.
     * @param <T>  the type of the elements in the list
     * @param matches  the list of matches
     * @return  the list of matches
     */
    private <T> List<CtInvocation<T>> filterMatches(List<CtElement> matches) {
        return matches.stream()
                .filter(CtInvocation.class::isInstance)
                .map(v -> (CtInvocation<T>) v)
                .filter(v -> v.getExecutable() != null)
                .filter(v -> v.getExecutable().getSimpleName().equalsIgnoreCase("toString"))
                .toList();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNNECESSARY_TO_STRING_CALL);
    }
}
