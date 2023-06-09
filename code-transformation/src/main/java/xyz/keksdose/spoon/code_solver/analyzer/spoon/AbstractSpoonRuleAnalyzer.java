package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.List;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public interface AbstractSpoonRuleAnalyzer {

    abstract List<SpoonAnalyzerResult> analyze(CtType<?> type);

    /**
     * Applies the refactoring to the given {@link CtType}.
     * @param listener  The listener which is used to report the changes.
     * @param compilationUnit  The type which contains the reported bad smell.
     * @param result  the result of an analysis run.
     */
    abstract void refactor(ChangeListener listener, CtType<?> type, AnalyzerResult result);

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
    default boolean isSameType(CtType<?> type, Path resultPath) {
        return type.getPosition().isValidPosition()
                && !(type instanceof CtTypeParameter)
                && type.getPosition()
                        .getCompilationUnit()
                        .getFile()
                        .toPath()
                        .toString()
                        .endsWith(resultPath.normalize().toString());
    }
}
