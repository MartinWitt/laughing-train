package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import spoon.reflect.cu.SourcePosition;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;

public abstract class SpoonRefactoring extends AbstractRefactoring implements SpoonRuleAnalyzer {
  /**
   * Creates a new refactoring with a given result.
   *
   * @param result the result of an analysis run.
   */
  protected SpoonRefactoring(AnalyzerResult result) {
    super(result);
  }

  protected Position toPosition(SourcePosition position) {
    return new Position(
        position.getLine(),
        position.getEndLine(),
        position.getColumn(),
        position.getEndColumn(),
        position.getSourceStart(),
        position.getSourceEnd() - position.getSourceStart());
  }
}
