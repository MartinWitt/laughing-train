
package xyz.keksdose.spoon.code_solver.transformations.junit;

import java.util.ArrayList;
import java.util.List;
import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.CtAbstractImportVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertionsTransformation extends TransformationProcessor<CtMethod<?>> {

	public AssertionsTransformation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> method) {
		if (JunitHelper.isJunit5TestMethod(method)) {
			var junit4Asserts = method.getElements(new TypeFilter<>(CtInvocation.class)).stream().filter(
				v -> v.getTarget() != null).filter(v -> v.getTarget().getType() != null).filter(
					v -> CtTypeAccess.class.isInstance(v.getTarget())).filter(
						v -> ((CtTypeAccess<?>) v.getTarget()).getAccessedType() != null).filter(
							v -> ((CtTypeAccess<?>) v.getTarget()).getAccessedType().getQualifiedName().equals(
								"org.junit.Assert")).toList();
			if (!junit4Asserts.isEmpty()) {
				junit4Asserts.forEach(v -> v.getExecutable().setDeclaringType(
					getFactory().Type().createReference("org.junit.jupiter.api.Assertions")));
				CtTypeAccess<?> access = getFactory().createTypeAccess(
					getFactory().Type().createReference("org.junit.jupiter.api.Assertions"));
				for (CtInvocation<?> junit4Assert : junit4Asserts) {
					junit4Assert.setTarget(null);
				}
				List<CtImport> imports = new ArrayList<>();
				List<CtImport> newImports = new ArrayList<>();
				method.getPosition().getCompilationUnit().getImports().forEach(
					v -> v.accept(new CtAbstractImportVisitor() {

						@Override
						public <T> void visitUnresolvedImport(CtUnresolvedImport ctUnresolvedImport) {
							if (ctUnresolvedImport.getUnresolvedReference().startsWith("org.junit.Assert.")) {
								imports.add(ctUnresolvedImport);
								newImports.add(getFactory().createUnresolvedImport(
									ctUnresolvedImport.getUnresolvedReference().replace("org.junit.Assert.",
										"org.junit.jupiter.api.Assertions."),
									true));
							}
						}
					}));
				imports.forEach(CtElement::delete);
				newImports.stream().filter(
					v -> !method.getPosition().getCompilationUnit().getImports().contains(v)).forEach(
						method.getPosition().getCompilationUnit().getImports()::add);

				setChanged(method.getDeclaringType(),
					new Change(
						String.format("Transformed junit4 assert to junt 5 assertion in %s", method.getSimpleName()),
						"AssertionsTransformation", method.getDeclaringType()));
			}

		}
	}
}
