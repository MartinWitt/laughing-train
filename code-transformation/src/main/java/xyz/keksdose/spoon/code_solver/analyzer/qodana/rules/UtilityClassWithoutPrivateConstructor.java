package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtComment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UtilityClassWithoutPrivateConstructor extends AbstractRefactoring {

    private static final String MESSAGE = "Utility classes should not have a public or default constructor.";

    private static final BadSmell BAD_SMELL = new BadSmell() {
        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromRaw(MESSAGE);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("UtilityClassWithoutPrivateConstructor");
        }
    };

    public UtilityClassWithoutPrivateConstructor(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (!isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        var constructors = type.getElements(new TypeFilter<>(CtConstructor.class));
        for (var constructor : constructors) {
            if (constructor.isImplicit() && type instanceof CtClass<?> clazz) {
                clazz.addConstructor(createConstructor(constructor, clazz));
                String message = "Added private constructor to utility class %s.".formatted(clazz.getQualifiedName());
                String messageMarkdown =
                        "Added private constructor to utility class `%s`.".formatted(clazz.getQualifiedName());
                listener.setChanged(
                        type,
                        new Change(BAD_SMELL, MarkdownString.fromMarkdown(message, messageMarkdown), type, result));
            }
        }
    }

    private <T> CtConstructor<T> createConstructor(CtConstructor<?> constructor, CtClass<?> clazz) {
        Factory factory = constructor.getFactory();
        CtConstructor<T> newConstructor =
                factory.createConstructor(clazz, Set.of(ModifierKind.PRIVATE), new ArrayList<>(), new HashSet<>());
        CtBlock<?> body = factory.createBlock();
        CtComment comment = createBodyComment(factory);
        body.addStatement(comment);
        newConstructor.setBody(body);
        return newConstructor;
    }

    private <T> CtComment createBodyComment(Factory factory) {
        return factory.createInlineComment("UtilityClass");
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(BAD_SMELL);
    }
}
