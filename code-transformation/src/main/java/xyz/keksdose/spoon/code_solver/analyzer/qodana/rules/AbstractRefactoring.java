
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.util.List;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

/**
 * This defines a refactoring of a reported {@link Result}.
 * With the help of this class, the refactoring can be applied to the source code.
 * The refactoring is applied by calling the {@link #apply(CtType)} method.
 */
public abstract class AbstractRefactoring {

	protected Result result;

	/**
	 * Creates a new refactoring with a given result.
	 * @param result  the result of an analysis run.
	 */
	public AbstractRefactoring(Result result) {
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
}
