package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtComment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.spoon.NewLineAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UtilityClassWithoutPrivateConstructor extends AbstractRefactoring {

  private static final String MESSAGE =
      "Utility classes should not have a public or default constructor.";

  private static final BadSmell BAD_SMELL =
      new BadSmell() {
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
    List<CtConstructor<?>> constructors = getConstructors(type);
    if (type instanceof CtClass<?> clazz) {
      if (allConstructorsAreImplicit(constructors)) {
        createConstructor(clazz);
        String message =
            "Added private constructor to utility class %s.".formatted(clazz.getQualifiedName());
        String messageMarkdown =
            "Added private constructor to utility class `%s`.".formatted(clazz.getQualifiedName());
        listener.setChanged(
            type,
            new Change(
                BAD_SMELL, MarkdownString.fromMarkdown(message, messageMarkdown), type, result));
      } else {
        if (singlePublicEmptyConstructor(type)) {
          CtConstructor<?> constructor = constructors.get(0);
          type.removeTypeMember(constructor);
          createConstructor(clazz);
          String message =
              "Added private constructor to utility class %s.".formatted(clazz.getQualifiedName());
          String messageMarkdown =
              "Added private constructor to utility class `%s`."
                  .formatted(clazz.getQualifiedName());
          listener.setChanged(
              type,
              new Change(
                  BAD_SMELL, MarkdownString.fromMarkdown(message, messageMarkdown), type, result));
        }
      }
    }
  }

  /**
   * Returns all constructors of a type, but only if they are declared in the type itself and not in
   * an inner type.
   *
   * @param type the type to get the constructors from.
   * @return a list of constructors never null.
   */
  private List<CtConstructor<?>> getConstructors(CtType<?> type) {
    List<CtConstructor<?>> constructors = type.getElements(new TypeFilter<>(CtConstructor.class));
    constructors.removeIf(constructor -> !constructor.getDeclaringType().equals(type));
    return constructors;
  }

  private boolean singlePublicEmptyConstructor(CtType<?> type) {
    List<CtConstructor<?>> constructors = type.getElements(new TypeFilter<>(CtConstructor.class));
    return constructors.size() == 1
        && constructors.get(0).getParameters().isEmpty()
        && constructors.get(0).getModifiers().contains(ModifierKind.PUBLIC)
        && constructors.get(0).getBody() != null
        && constructors.get(0).getBody().getStatements().stream().allMatch(CtElement::isImplicit);
  }

  private boolean allConstructorsAreImplicit(List<? extends CtConstructor<?>> constructors) {
    return constructors.stream().allMatch(CtConstructor::isImplicit);
  }

  private <T> CtConstructor<T> createConstructor(CtClass<?> clazz) {
    Factory factory = clazz.getFactory();
    CtConstructor<T> newConstructor =
        factory.createConstructor(
            clazz, Set.of(ModifierKind.PRIVATE), new ArrayList<>(), new HashSet<>());
    CtBlock<?> body = factory.createBlock();
    CtComment comment = createBodyComment(factory);
    body.addStatement(comment);
    newConstructor.setBody(body);
    moveToTheTop(clazz);
    return newConstructor;
  }

  private void moveToTheTop(CtClass<?> clazz) {
    var insertedConstructor = clazz.getTypeMembers().get(clazz.getTypeMembers().size() - 1);
    clazz.removeTypeMember(insertedConstructor);
    clazz.addTypeMemberAt(0, insertedConstructor);
    insertedConstructor.addAnnotation(new NewLineAnnotation<>());
  }

  private CtComment createBodyComment(Factory factory) {
    return factory.createInlineComment("UtilityClass");
  }

  @Override
  public List<BadSmell> getHandledBadSmells() {
    return List.of(BAD_SMELL);
  }
}
