package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.Filter;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.CommonTypes;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

public class UnnecessaryToString extends SpoonRefactoring {

  private static final CodeIssue BAD_SMELL =
      new CodeIssue(
          MarkdownString.fromRaw("UnnecessaryToString"),
          MarkdownString.fromRaw("Calling to String on a String object is unnecessary."));

  @Override
  public void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result) {
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
  public CodeIssue getHandledBadSmells() {
    return BAD_SMELL;
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
          && element.getTarget().getType().equals(CommonTypes.STRING.getClazz())
          && element.getExecutable().getSimpleName().equals("toString");
    }
  }
}
