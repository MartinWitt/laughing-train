
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public abstract class AbstractRefactoring {

	protected Result result;

	public AbstractRefactoring(Result result) {
		this.result = result;
	}

	public abstract void refactor(ChangeListener listener, CtType<?> compilationUnit);

}
