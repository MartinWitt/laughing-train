package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.Filter;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryToString extends SpoonRefactoring {

  private static final BadSmell BAD_SMELL =
      new BadSmell(
          MarkdownString.fromRaw("UnnecessaryToString"),
          MarkdownString.fromRaw("Unnecessary toString() call on String object."));

  /**
   * Creates a new refactoring with a given result.
   *
   * @param result the result of an analysis run.
   */
  public UnnecessaryToString(AnalyzerResult result) {
    super(result);
  }

  @Override
  public void refactor(ChangeListener listener, CtType<?> type) {
    if (!isSameType(type, Path.of(result.filePath()))) {
      return;
    }
    List<CtInvocation<?>> elements = type.getElements(new UnnecessaryToStringFilter());
    for (CtInvocation<?> invocation : elements) {
      if (toPosition(invocation.getPosition()).equals(result.position())) {
        invocation.delete();
        listener.setChanged(
            type,
            new Change(
                BAD_SMELL,
                MarkdownString.fromMarkdown(
                    "Deleted unnecessary toString call `%s`".formatted(invocation)),
                type,
                result));
      }
    }
  }

  @Override
  public List<BadSmell> getHandledBadSmells() {
    return List.of(BAD_SMELL);
  }

  @Override
  public List<SpoonAnalyzerResult> analyze(String sourceRoot, CtType<?> ctType) {
    List<SpoonAnalyzerResult> results = new ArrayList<>();
    List<CtInvocation<?>> elements = ctType.getElements(new UnnecessaryToStringFilter());
    for (CtInvocation<?> invocation : elements) {
      results.add(
          SpoonAnalyzerResult.createResult(
              BAD_SMELL.getName().asText(),
              ctType,
              "The toString call %s is unnecessary.".formatted(invocation),
              "The toString call `%s` is unnecessary.".formatted(invocation),
              invocation,
              sourceRoot));
    }
    return results;
  }

  private static final class UnnecessaryToStringFilter implements Filter<CtInvocation<?>> {

    @Override
    public boolean matches(CtInvocation element) {
      return element.getTarget() != null
          && element.getTarget().getType() != null
          && element.getTarget().getType().getSimpleName().equals("String")
          && element.getExecutable().getSimpleName().equals("toString");
    }
  }
}
