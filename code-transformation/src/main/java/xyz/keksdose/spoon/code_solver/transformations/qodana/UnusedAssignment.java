
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.List;

import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtVariableWrite;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.visitor.filter.VariableAccessFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class UnusedAssignment extends TransformationProcessor<CtType<?>> {

	public UnusedAssignment(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtType<?> element) {
		List<CtAssignment<?, ?>> assignments = element.getElements(new TypeFilter<>(CtAssignment.class));
		for (CtAssignment<?, ?> ctAssignment : assignments) {
			var assigned = ctAssignment.getAssigned();
			if (assigned instanceof CtVariableWrite) {
				CtVariableWrite<?> localVariable = (CtVariableWrite<?>) assigned;
				if (element.getElements(new VariableAccessFilter<>(localVariable.getVariable())).isEmpty()) {
					ctAssignment.replace(ctAssignment.getAssignment());
					setChanged(element, new Change("Removed assignment", "UnusedAssignment", element));
				}
			}
		}
	}

	@Override
	public SmellKind getKind() {
		return SmellKind.QODANA;
	}
}
