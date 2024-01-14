package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeInformation;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

public class UnnecessaryImplements extends SpoonRefactoring {

  private static final CodeIssue BAD_SMELL =
      new CodeIssue(
          MarkdownString.fromRaw("UnnecessaryImplements"),
          MarkdownString.fromRaw(
              "This class has 1 or more interfaces which are already implemented."));

  @Override
  public void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result) {
    // TODO: Check if the equals real works here
    for (CtTypeReference<?> unnecessaryImplement : getUnnecessaryImplements(type)) {
      if (toPosition(unnecessaryImplement.getPosition()).equals(result.position())) {
        type.removeSuperInterface(unnecessaryImplement);
        listener.setChanged(
            type,
            new Change(
                BAD_SMELL,
                MarkdownString.fromMarkdown(
                    "Deleted unnecessary implement `%s`".formatted(unnecessaryImplement)),
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
    for (CtTypeReference<?> ctTypeReference : getUnnecessaryImplements(ctType)) {
      results.add(
          SpoonAnalyzerResult.createResult(
              BAD_SMELL.getName().asText(),
              ctType,
              "The implement declaration %s is unnecessary.".formatted(ctTypeReference),
              "The implement declaration `%s` is unnecessary.".formatted(ctTypeReference),
              ctTypeReference,
              sourceRoot));
    }
    return results;
  }

  private Set<CtTypeReference<?>> getUnnecessaryImplements(CtTypeInformation ctType) {
    Set<CtTypeReference<?>> result = new HashSet<>();
    Set<CtTypeReference<?>> superInterfaces = ctType.getSuperInterfaces();
    for (CtTypeReference<?> ctTypeReference : superInterfaces) {
      for (CtTypeReference<?> needed : superInterfaces) {
        if (ctTypeReference.equals(needed)) {
          continue;
        }
        if (ctTypeReference.isSubtypeOf(needed)) {
          result.add(ctTypeReference);
        }
      }
    }
    return result;
  }
}
