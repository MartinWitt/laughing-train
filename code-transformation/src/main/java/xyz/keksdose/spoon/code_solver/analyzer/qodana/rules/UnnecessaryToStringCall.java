package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.Launcher;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.filter.InvocationFilter;
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
            return MarkdownString.fromMarkdown(
                    "The toString() method is not needed in cases the underlying method handles the conversion.",
                    "The `toString()` method is not needed in cases the underlying method handles the conversion.");
        }
    };
    private static final CtMethod<?> toStringMethod = getToStringMethod(new Launcher().getFactory());

    public UnnecessaryToStringCall(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtInvocation<?> toStringInvocations : type.getElements(new InvocationFilter(toStringMethod))) {
            if (isAlmostMatch(toStringInvocations)) {
                String oldInvocation = "" + toStringInvocations.toString();
                toStringInvocations.replace(toStringInvocations.getTarget());
                toStringInvocations
                        .getParent()
                        .replace(toStringInvocations.getParent().clone());
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                UNNECESSARY_TO_STRING_CALL,
                                MarkdownString.fromMarkdown(
                                        "Removed unnecessary toString() call in " + oldInvocation,
                                        "Removed unnecessary `toString()` call in `" + oldInvocation + "`"),
                                type.getTopLevelType(),
                                result));
            }
        }
    }

    private boolean isAlmostMatch(CtInvocation<?> toStringInvocations) {
        return Math.abs(toStringInvocations.getPosition().getSourceStart()
                        - (result.position().charOffset() - result.position().charLength()))
                <= 5;
    }

    private static CtMethod<?> getToStringMethod(Factory factory) {
        return factory.Type().createReference(Object.class).getTypeDeclaration().getAllMethods().stream()
                .filter(method -> method.getSimpleName().equals("toString"))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNNECESSARY_TO_STRING_CALL);
    }
}
