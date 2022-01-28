
package xyz.keksdose.spoon.code_solver.analyzer.qodana.refactor;

import spoon.reflect.code.CtReturn;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class UnnecessaryReturnRefactor extends TransformationProcessor<CtReturn<?>> {

	protected UnnecessaryReturnRefactor(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtReturn<?> ctReturn) {

		// TODO Auto-generated method stub

	}

}
