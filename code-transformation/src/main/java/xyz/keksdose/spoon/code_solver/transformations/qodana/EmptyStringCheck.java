
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.ArrayList;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class EmptyStringCheck extends TransformationProcessor<CtInvocation<?>> {

	public EmptyStringCheck(ChangeListener listener) {
		super(listener);

	}

	public boolean isApplicable(CtInvocation<?> element) {
		if (element.getTarget() != null && element.getTarget().getType().equals(getFactory().Type().stringType())) {
			if (element.getExecutable().getSimpleName().equals("equals")) {
				if (element.getArguments().size() == 1 && element.getArguments().get(0).toString().equals("\"\"")) {
					return true;
				}
			}
		}
		return false;
	}

	public void process(CtInvocation<?> element) {
		if (isApplicable(element)) {
			CtExecutableReference<Boolean> ref = getFactory().createExecutableReference();
			ref.setSimpleName("isEmpty");
			ref.setType(getFactory().Type().booleanType());
			ref.setDeclaringType(getFactory().createCtTypeReference(String.class));
			setChanged(element.getParent(CtType.class),
				new Change("Empty String check was written as String.equals(\"\") and refactored to String.isEmpty()",
					"EmptyStringCheck", element.getParent(CtType.class)));
			element.replace(
				getFactory().Code().createInvocation(element.getTarget(), ref, new ArrayList<CtExpression<?>>()));
		}
	}

	@Override
	public SmellKind getKind() {
		return SmellKind.QODANA;
	}
}
