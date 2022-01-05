
package xyz.keksdose.spoon.code_solver.transformations;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public abstract class TransformationProcessor<T extends CtElement> extends AbstractProcessor<T> {

	private ChangeListener listener;
	protected void setChanged(CtType<?> changedType, Change change) {
		listener.setChanged(changedType, change);
	}

	protected TransformationProcessor(ChangeListener listener) {
		this.listener = listener;
	}

	public abstract SmellKind getKind();
}
