
package xyz.keksdose.spoon.code_solver.printing;

import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public class NoOpPrinter implements IPrinting {

	@Override
	public void printChangedTypes(ChangeListener listener, Iterable<CtType<?>> newTypes) {
		// do nothing        
	}

}
