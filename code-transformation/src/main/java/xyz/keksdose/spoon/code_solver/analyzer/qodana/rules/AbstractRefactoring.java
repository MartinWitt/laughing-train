package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

/**
 * This defines a refactoring of a reported {@link AnalyzerResult}.
 * With the help of this class, the refactoring can be applied to the source code.
 * The refactoring is applied by calling the {@link #apply(CtType)} method.
 */
public abstract class AbstractRefactoring {

    protected AnalyzerResult result;

    /**
     * Creates a new refactoring with a given result.
     * @param result  the result of an analysis run.
     */
    protected AbstractRefactoring(AnalyzerResult result) {
        this.result = result;
    }

    /**
     * Applies the refactoring to the given {@link CtType}.
     * @param listener  The listener which is used to report the changes.
     * @param compilationUnit  The type which contains the reported bad smell.
     */
    public abstract void refactor(ChangeListener listener, CtType<?> type);

    /**
     * Returns a list of all {@link BadSmell}s which are refactored by this refactoring.
     * @return  A list of all {@link BadSmell}s which are refactored by this refactoring. Never null.
     */
    public abstract List<BadSmell> getHandledBadSmells();

    /**
     * Checks if the given {@link CtType} is the type which contains the reported bad smell.
     * @param type  The type which should be checked.
     * @param resultPath  The path of the file which contains the reported bad smell.
     * @return  True if the given {@link CtType} is the type which contains the reported bad smell.
     */
    protected boolean isSameType(CtType<?> type, Path resultPath) {
        return type.getPosition().isValidPosition()
                && !(type instanceof CtTypeParameter)
                && type.getPosition()
                        .getCompilationUnit()
                        .getFile()
                        .toPath()
                        .toString()
                        .endsWith(resultPath.toString());
    }
}
