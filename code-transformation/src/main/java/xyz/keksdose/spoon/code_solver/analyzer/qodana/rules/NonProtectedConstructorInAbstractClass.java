package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.lang.annotation.Annotation;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class NonProtectedConstructorInAbstractClass extends AbstractRefactoring {

    private static final BadSmell NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("Non-Protected-Constructor-in-Abstract-Class");
        }

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(
                    "A non-protected constructor in an abstract class is not needed because only subclasses can be instantiated");
        }
    };

    public NonProtectedConstructorInAbstractClass(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        // here we know any constructor has the bad smell. Removing public modifier is allowed
        for (CtConstructor<?> constructor : type.getElements(new TypeFilter<>(CtConstructor.class))) {
            if (constructor.getModifiers().contains(ModifierKind.PUBLIC)) {
                if (!constructor.getDeclaringType().isAbstract()) {
                    continue;
                }
                Set<CtExtendedModifier> modifiers = new HashSet<>(constructor.getExtendedModifiers());
                modifiers.removeIf(v -> v.getKind() == ModifierKind.PUBLIC);
                CtExtendedModifier protectedModifier = CtExtendedModifier.explicit(ModifierKind.PROTECTED);
                modifiers.add(protectedModifier);
                constructor.setExtendedModifiers(modifiers);
                List<CtAnnotation<? extends Annotation>> annotations = constructor.getAnnotations().stream()
                        .map(CtAnnotation::clone)
                        .collect(Collectors.toList());
                // annotations.add(new NewLineAnnotation<>());
                constructor.setAnnotations(annotations);
                if (!constructor.getDocComment().isBlank()) {
                    constructor.setDocComment(constructor.getDocComment());
                }
                String message = "Constructor " + constructor.getSignature() + " is now protected instead of public";
                String markdown = "Constructor `" + constructor.getSignature() + "` is now protected instead of public";
                listener.setChanged(
                        type.getTopLevelType(),
                        new Change(
                                NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS,
                                MarkdownString.fromMarkdown(message, markdown),
                                type.getTopLevelType(),
                                result));
            }
        }
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS);
    }
}
