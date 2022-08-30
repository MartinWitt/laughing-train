package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.declaration.ModifierKind;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class ProtectedMemberInFinalType extends TransformationProcessor<CtType<?>> {

    private static final BadSmell badSmell = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "A protected member is used in a final class. Final classes are not allowed to be extended.");
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Protected-In-Final-Class");
        }
    };

    public ProtectedMemberInFinalType(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtType<?> type) {
        if (type.isFinal()) {
            List<CtTypeMember> protectedMethods = type.getTypeMembers().stream()
                    .filter(CtModifiable::isProtected)
                    .collect(Collectors.toList());
            for (CtTypeMember ctMethod : protectedMethods) {
                ctMethod.removeModifier(ModifierKind.PROTECTED);
                String message =
                        "Removed protected modifier from " + ctMethod.getSimpleName() + " in " + type.getSimpleName();
                String markdown = "Removed protected modifier from `" + ctMethod.getSimpleName() + "` in `"
                        + type.getSimpleName() + "`";
                setChanged(type, new Change(badSmell, MarkdownString.fromMarkdown(message, markdown), type));
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }
}
