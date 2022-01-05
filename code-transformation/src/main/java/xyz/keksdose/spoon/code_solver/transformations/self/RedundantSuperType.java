
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.Collections;

import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class RedundantSuperType extends TransformationProcessor<CtType<?>> {

	public RedundantSuperType(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtType<?> element) {
		CtTypeReference<?> superClass = element.getSuperclass();
		if (superClass == null || superClass.getTypeDeclaration() == null || element.getSuperInterfaces().isEmpty()) {
			return;
		}
		var oldImports = element.getPosition().getCompilationUnit().getImports();
		for (CtTypeReference<?> superInterface : Collections.unmodifiableSet(element.getSuperInterfaces())) {
			if (superInterface.getTypeDeclaration() != null
					&& superClass.getTypeDeclaration().isSubtypeOf(superInterface)) {
				element.removeSuperInterface(superInterface);
				setChanged(element,
					new Change(
						String.format("Removed interface %s from type %s, because it's redundant",
							superInterface.getQualifiedName(), element.getQualifiedName()),
						"RedundantInterface", element));
			}

		}

	}

	@Override
	public SmellKind getKind() {
		return SmellKind.MISC;
	}
}
