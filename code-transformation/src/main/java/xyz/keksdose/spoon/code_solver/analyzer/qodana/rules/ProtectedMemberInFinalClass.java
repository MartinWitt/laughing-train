package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.spoon.EmptyModifier;
import xyz.keksdose.spoon.code_solver.spoon.NewLineAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class ProtectedMemberInFinalClass extends AbstractRefactoring {

    private static BadSmell badSmell = new BadSmell() {

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("ProtectedMemberInFinalClass");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "Since final classes cannot be inherited, marking a member as protected may be confusing. It is better to declare such members as private or package-visible instead.");
        }
    };

    public ProtectedMemberInFinalClass(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        for (CtTypeMember member : new ArrayList<>(type.getTypeMembers())) {
            if (member.isProtected() && member.getDeclaringType().isFinal()) {
                LinkedHashSet<CtExtendedModifier> modifiers = new LinkedHashSet<>(member.getExtendedModifiers());
                modifiers.removeIf(v -> v.getKind() == ModifierKind.PROTECTED);
                modifiers.add(EmptyModifier.empty());
                member.addAnnotation(new NewLineAnnotation<>());
                member.setExtendedModifiers(modifiers);
                String raw = "Removed protected modifier from member " + member.getSimpleName() + " in final class "
                        + type.getSimpleName();
                String markdown = "Removed protected modifier from member `" + member.getSimpleName()
                        + "` in final class `" + type.getSimpleName() + "`";
                Change change = new Change(badSmell, MarkdownString.fromMarkdown(raw, markdown), type, result);
                listener.setChanged(type.getTopLevelType(), change);
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }

    /**
     * Modify an element such that the sniper printer detects it as modified, without changing its final content. This
     * forces it to be sniper-printed "as-is".
     */
    private static void markElementForSniperPrinting(CtElement element) {
        SourcePosition pos = element.getPosition();
        element.setPosition(SourcePosition.NOPOSITION);
        element.setPosition(pos);
    }
}
