package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Filter;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class AccessStaticViaInstance extends SpoonRefactoring {

  private static final BadSmell BAD_SMELL =
      new BadSmell(
          MarkdownString.fromRaw("AccessStaticViaInstance"),
          MarkdownString.fromRaw(
              "Accessing static methods should be done via the class name, not via an instance."));

  public AccessStaticViaInstance(AnalyzerResult result) {
    super(result);
  }

  @Override
  public void refactor(ChangeListener listener, CtType<?> type) {
    if (!isSameType(type, Path.of(result.filePath()))) {
      return;
    }
    Position position = result.position();
    List<CtInvocation<?>> elements = type.getElements(new StaticInvocationFilter());
    for (CtInvocation<?> element : elements) {
      if (toPosition(element.getPosition()).equals(position)) {
        CtInvocation<?> cloned = element.clone();
        CtTypeReference<?> target = element.getTarget().getType();
        CtTypeAccess<?> typeAccess = type.getFactory().Code().createTypeAccess(target);
        typeAccess.getAccessedType().setSimplyQualified(true);
        element.setTarget(typeAccess);
        Change change =
            new Change(
                BAD_SMELL,
                MarkdownString.fromMarkdown(
                    "Converted `%s` to static invocation `%s`".formatted(cloned, element)),
                type,
                result);
        listener.setChanged(type, change);
      }
    }
  }

  @Override
  public List<BadSmell> getHandledBadSmells() {
    return List.of(BAD_SMELL);
  }

  @Override
  public List<SpoonAnalyzerResult> analyze(String sourceRoot, CtType<?> ctType) {
    List<CtInvocation<?>> elements = ctType.getElements(new StaticInvocationFilter());
    List<SpoonAnalyzerResult> results = new ArrayList<>();
    for (CtInvocation<?> element : elements) {
      SpoonAnalyzerResult.createResult(
          BAD_SMELL.getName().asText(),
          ctType,
          "The invocation %s is static but is called via an instance. This should be done via the class name."
              .formatted(element),
          "The invocation `%s` is static but is called via an instance. This should be done via the class name."
              .formatted(element),
          element,
          sourceRoot);
    }
    return results;
  }

  private static final class StaticInvocationFilter implements Filter<CtInvocation<?>> {

    @Override
    public boolean matches(CtInvocation<?> element) {
      if (!Optional.ofNullable(element.getExecutable())
          .map(CtExecutableReference::getExecutableDeclaration)
          .filter(v -> v instanceof CtMethod)
          .map(v -> (CtMethod<?>) v)
          .map(CtModifiable::isStatic)
          .orElse(false)) {
        return false;
      }
      return element.getTarget() != null && !(element.getTarget() instanceof CtTypeAccess);
    }
  }
}
