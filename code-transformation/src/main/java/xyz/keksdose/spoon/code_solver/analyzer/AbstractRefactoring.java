package xyz.keksdose.spoon.code_solver.analyzer;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import spoon.reflect.cu.SourcePositionHolder;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

public abstract class AbstractRefactoring {

  /**
   * Applies the refactoring to the given {@link CtType}.
   *
   * @param listener The listener which is used to report the changes.
   * @param type The type which contains the reported bad smell.
   */
  public abstract void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result);

  /**
   * Returns the handled bad smells by the implementing class.
   *
   * @return the handled bad smells
   */
  public abstract CodeIssue getHandledBadSmells();

  /**
   * Checks if the given {@link CtType} is the type which contains the reported bad smell.
   *
   * @param positionHolder The type which should be checked.
   * @param resultPath The path of the file which contains the reported bad smell.
   * @return True if the given {@link CtType} is the type which contains the reported bad smell.
   */
  protected boolean isSameType(SourcePositionHolder positionHolder, Path resultPath) {
    return positionHolder.getPosition().isValidPosition()
        && !(positionHolder instanceof CtTypeParameter)
        && positionHolder
            .getPosition()
            .getCompilationUnit()
            .getFile()
            .toPath()
            .toString()
            .endsWith(resultPath.normalize().toString());
  }
}
