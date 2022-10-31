package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryModifier extends AbstractRefactoring {

    public UnnecessaryModifier(AnalyzerResult result) {
        super(result);
    }

    private static final BadSmell UNNECESSARY_MODIFIER = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Unnecessary-Modifier");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "Some modifiers are not needed, because they are already the default and implicit. These modifiers can be removed.");
        }
    };

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        String modifier = result.messageMarkdown().split("`")[1];
        if (modifier == null || modifier.isEmpty()) {
            return;
        }
        for (CtElement match : PositionScanner.findLineOnly(type, result.position())) {
            if (match instanceof CtModifiable ctModifierHandler) {
                if (!hasModifier(ctModifierHandler, modifier)) {
                    continue;
                }
                var modifiers = new HashSet<>(ctModifierHandler.getExtendedModifiers());
                modifiers.removeIf(v -> v.getKind().toString().equalsIgnoreCase(modifier));
                ctModifierHandler.setExtendedModifiers(modifiers);
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                UNNECESSARY_MODIFIER,
                                MarkdownString.fromMarkdown(
                                        "Unnecessary modifier " + modifier + " removed",
                                        "Unnecessary modifier `" + modifier + "` removed"),
                                type.getTopLevelType(),
                                result));
            }
        }
    }

    private boolean hasModifier(CtModifiable ctModifierHandler, String modifier) {
        return ctModifierHandler.getModifiers().stream()
                .anyMatch(v -> v.toString().equalsIgnoreCase(modifier));
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNNECESSARY_MODIFIER);
    }
}
