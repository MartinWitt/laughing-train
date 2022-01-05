
package xyz.keksdose.spoon.code_solver.transformations.junit;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class PublicModifierRemoval extends TransformationProcessor<CtMethod<?>> {

	public PublicModifierRemoval(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> element) {
		if (element.isPublic() && JunitHelper.isJunit5TestMethod(element)) {
			element.removeModifier(ModifierKind.PUBLIC);
			setChanged(element.getParent(CtType.class),
				new Change(String.format("Removed public modifier from test method %s", element.getSimpleName()),
					"PublicModifierRemoval", element.getParent(CtType.class)));
		}
	}

	@Override
	public SmellKind getKind() {
		return SmellKind.JUNIT;
	}

}
