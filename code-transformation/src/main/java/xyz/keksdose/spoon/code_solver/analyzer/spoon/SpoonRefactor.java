package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.util.*;
import java.util.function.Function;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

/**
 * Entry point for spoon based refactoring. This class is used to apply all refactors which are
 * reported by spoon.
 */
public class SpoonRefactor extends TransformationProcessor<CtType<?>> {

  private Map<RuleId, Function<AnalyzerResult, AbstractRefactoring>> ruleParser;
  private List<AbstractRefactoring> refactors;

  public SpoonRefactor(
      ChangeListener changeListener, Iterable<? extends AnalyzerResult> badSmells) {
    super(changeListener);
    ruleParser = new HashMap<>();
    refactors = new ArrayList<>();
    Arrays.stream(SpoonRules.values())
        .forEach(rule -> ruleParser.put(rule.getRuleId(), rule.getRefactoring()));
    for (AnalyzerResult result : badSmells) {
      Optional.ofNullable(ruleParser.get(result.ruleID()))
          .ifPresent(v -> refactors.add(v.apply(result)));
    }
  }

  @Override
  public void process(CtType<?> element) {
    for (AbstractRefactoring refactoring : refactors) {
      refactoring.refactor(listener, element);
    }
  }
}
