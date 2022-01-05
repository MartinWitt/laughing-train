
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.List;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.visitor.filter.VariableAccessFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class UnusedLocalVariable extends TransformationProcessor<CtType<?>> {

	public UnusedLocalVariable(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtType<?> element) {
		List<CtLocalVariable<?>> localVariables = element.getElements(new TypeFilter<>(CtLocalVariable.class));
		for (CtLocalVariable<?> localVariable : localVariables) {
			CtBlock<?> scope = localVariable.getParent(CtBlock.class);
			if (scope != null) {
				if (localVariable.getDefaultExpression() != null) {
					List<CtVariableAccess<?>> variableAccesses = scope
							.getElements(new VariableAccessFilter<>(localVariable.getReference()));
					if (variableAccesses.isEmpty()) {
						localVariable.replace(localVariable.getDefaultExpression());
						setChanged(element,
							new Change(
								String.format("Removed unused local variable: %s", localVariable.getSimpleName()),
								"UnusedAssignment", element));
					}
				}
			}
		}
	}

	@Override
	public SmellKind getKind() {
		return SmellKind.QODANA;
	}
}
