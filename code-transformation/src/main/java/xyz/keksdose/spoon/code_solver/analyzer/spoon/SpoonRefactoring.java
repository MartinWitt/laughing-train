package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.value.Position;
import spoon.reflect.cu.SourcePosition;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.api.SpoonRuleAnalyzer;

public abstract class SpoonRefactoring extends AbstractRefactoring implements SpoonRuleAnalyzer {

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
