package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import static xyz.keksdose.spoon.code_solver.history.MarkdownString.fromMarkdown;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.diffs.DiffCleanModes;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryToStringCall extends AbstractRefactoring {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
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
            logger.atFinest().log("skipping %s", type.getQualifiedName());
            return;
        }
        for (CtInvocation<?> toStringInvocation :
                filterMatches(PositionScanner.findLineOnly(type, result.position()))) {
            logger.atInfo().log("found %s", toStringInvocation);
            CtInvocation<?> oldInvocation = toStringInvocation.clone().setParent(null);
            toStringInvocation.replace(toStringInvocation.getTarget().clone());
            listener.setChanged(
                    type.getTopLevelType(),
                    new Change(
                            UNNECESSARY_TO_STRING_CALL,
                            fromMarkdown("Remove redundant `toString()` call in `%s`".formatted(oldInvocation)),
                            type.getTopLevelType(),
                            result,
                            List.of(DiffCleanModes.NO_WHITESPACE_ADD)));
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
