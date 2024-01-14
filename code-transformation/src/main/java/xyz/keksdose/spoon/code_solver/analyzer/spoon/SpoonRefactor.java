package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.*;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.api.SpoonRules;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

/**
 * Entry point for spoon based refactoring. This class is used to apply all refactors which are
 * reported by spoon.
 */
public class SpoonRefactor extends TransformationProcessor<CtType<?>> {

  private final Map<RuleId, AbstractRefactoring> ruleParser;
  private final List<RefactorInput> refactors;

  public SpoonRefactor(ChangeListener listener, Iterable<? extends AnalyzerResult> badSmells) {
    super(listener);
    ruleParser = new HashMap<>();
    refactors = new ArrayList<>();
    Arrays.stream(SpoonRules.values())
        .forEach(rule -> ruleParser.put(rule.ruleId(), rule.getRefactoring()));
    for (AnalyzerResult result : badSmells) {
      Optional.ofNullable(ruleParser.get(result.ruleID()))
          .ifPresent(v -> refactors.add(new RefactorInput(v, result)));
    }
  }

  @Override
  public void process(CtType<?> element) {
    for (RefactorInput refactoring : refactors) {
      refactoring.refactoring().refactor(listener, element, refactoring.result);
    }
  }

  private record RefactorInput(AbstractRefactoring refactoring, AnalyzerResult result) {}
}
