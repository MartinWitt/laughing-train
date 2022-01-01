
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class RedundantInterface extends TransformationProcessor<CtType<?>> {
	public RedundantInterface(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtType<?> element) {
		if (element.getSuperInterfaces().isEmpty()) {
			return;
		}
		Set<CtTypeReference<?>> superClass = element.getSuperInterfaces();
		superClass.stream()
				.filter(intrface -> superClass.stream().filter(inner -> inner.isSubtypeOf(intrface)).count() > 1)
				.forEach(intrface -> {
					element.removeSuperInterface(intrface);
					setChanged(element,
						new Change(
							String.format("Removed interface %s from type %s, because it's redundant",
								intrface.getQualifiedName(), element.getQualifiedName()),
							"RedundantInterface", element));
				});
	}
}
