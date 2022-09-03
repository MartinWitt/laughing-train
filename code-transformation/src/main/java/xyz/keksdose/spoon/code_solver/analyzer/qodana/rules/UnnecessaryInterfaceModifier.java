package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryInterfaceModifier extends AbstractRefactoring {

    private static final BadSmell UNNECESSARY_INTERFACE_MODIFIER = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Unnecessary-Interface-Modifier");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "An public modifier on methods is not needed, because all methods in interfaces are already public");
        }
    };

    public UnnecessaryInterfaceModifier(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtTypeMember member : type.getTypeMembers()) {
            if (member.getPosition().getSourceStart() == result.position().charOffset() && member.isPublic()) {
                Set<CtExtendedModifier> modifiers = new HashSet<>(member.getExtendedModifiers());
                modifiers.removeIf(v -> v.getKind() == ModifierKind.PUBLIC);
                member.setExtendedModifiers(modifiers);
                SourcePosition position = member.getPosition();
                member.setPosition(SourcePosition.NOPOSITION);
                member.setPosition(position);
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                UNNECESSARY_INTERFACE_MODIFIER,
                                MarkdownString.fromMarkdown(result.message(), result.messageMarkdown()),
                                type.getTopLevelType(),
                                result));
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(UNNECESSARY_INTERFACE_MODIFIER);
    }
}
