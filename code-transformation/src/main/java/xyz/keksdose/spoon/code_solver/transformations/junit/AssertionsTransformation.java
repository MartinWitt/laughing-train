
package xyz.keksdose.spoon.code_solver.transformations.junit;

import java.util.ArrayList;
import java.util.List;

import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.visitor.CtAbstractImportVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.util.ModelList;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertionsTransformation extends TransformationProcessor<CtMethod<?>> {

	/**
	 *
	 */
	private static final String TRANSFORMATION_NAME = "AssertionsTransformation";

	public AssertionsTransformation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> method) {
		if (JunitHelper.isJunit5TestMethod(method)) {
			List<CtInvocation<?>> junit4Asserts = getJunit4Asserts(method);
			if (!junit4Asserts.isEmpty()) {
				convertToJunit5(junit4Asserts);
				adjustImports(method);
				notifyChangeListener(method);
			}
		}
	}

	private void notifyChangeListener(CtMethod<?> method) {
		CtType<?> declaringType = method.getDeclaringType();
		setChanged(declaringType, new Change(createChangeHistory(method), TRANSFORMATION_NAME, declaringType));
	}

	private String createChangeHistory(CtMethod<?> method) {
		return String.format("Transformed junit4 assert to junt 5 assertion in %s", method.getSimpleName());
	}

	private void convertToJunit5(List<CtInvocation<?>> junit4Asserts) {
		for (CtInvocation<?> junit4Assert : junit4Asserts) {
			junit4Assert.setTarget(null);
			junit4Assert.getExecutable()
					.setDeclaringType(getFactory().Type().createReference("org.junit.jupiter.api.Assertions"));
			List<CtExpression<?>> parameters = junit4Assert.getArguments();
			if (parameters.size() == 3) {
				if (parameters.get(0).getType().getSimpleName().equals("String")) {
					List<CtExpression<?>> newParameters = new ArrayList<>();
					newParameters.add(parameters.get(1));
					newParameters.add(parameters.get(2));
					newParameters.add(parameters.get(0));
					junit4Assert.setArguments(newParameters);
				}
			}
			if (parameters.size() == 2 && junit4Assert.getExecutable().getSimpleName().equals("assertTrue")) {
				if (parameters.get(0).getType().getSimpleName().equals("String")) {
					List<CtExpression<?>> newParameters = new ArrayList<>();
					newParameters.add(parameters.get(1));
					newParameters.add(parameters.get(0));
					junit4Assert.setArguments(newParameters);
				}
			}
		}
	}

	private List<CtInvocation<?>> getJunit4Asserts(CtMethod<?> method) {
		return method.getElements(new TypeFilter<CtInvocation<?>>(CtInvocation.class))
				.stream()
				.filter(v -> v.getTarget() instanceof CtTypeAccess)
				.filter(v -> v.getTarget().getType() != null)
				.filter(v -> ((CtTypeAccess<?>) v.getTarget()).getAccessedType() != null)
				.filter(v -> ((CtTypeAccess<?>) v.getTarget()).getAccessedType()
						.getQualifiedName()
						.equals("org.junit.Assert"))
				.filter(v -> !v.getExecutable().getSimpleName().equals("assertThat"))
				.toList();
	}

	private void adjustImports(CtMethod<?> method) {
		List<CtImport> imports = new ArrayList<>(getImports(method));
		List<CtImport> newImports = new ArrayList<>();
		List<CtReference> references = new ArrayList<>();

		getImports(method).forEach(v -> v.accept(new CtAbstractImportVisitor() {
			@Override
			public <T> void visitUnresolvedImport(CtUnresolvedImport ctUnresolvedImport) {
				if (ctUnresolvedImport.getUnresolvedReference().startsWith("org.junit.Assert.")) {
					imports.add(ctUnresolvedImport);
					if (!ctUnresolvedImport.getUnresolvedReference().endsWith("assertThat")) {
						newImports.add(getFactory().createUnresolvedImport(ctUnresolvedImport.getUnresolvedReference()
								.replace("org.junit.Assert.", "org.junit.jupiter.api.Assertions."),
							true));
					}
				}
			}

			@Override
			public <T> void visitMethodImport(CtExecutableReference<T> executableReference) {
				if (executableReference.getDeclaringType().getQualifiedName().equals("org.junit.Assert")) {
					references.add(executableReference);
					if (!executableReference.getSimpleName().equals("assertThat")) {
						newImports.add(getFactory().createUnresolvedImport(
							"org.junit.jupiter.api.Assertions." + executableReference.getSimpleName(), true));
					}
				}
			}
		}));
		getImports(method).stream()
				.filter(v -> references.contains(v.getReference()))
				.toList()
				.forEach(getImports(method)::remove);
		newImports.stream().filter(v -> !getImports(method).contains(v)).forEach(getImports(method)::add);
		var filteredImports = new ArrayList<>(getImports(method));
		getImports(method).clear();
		getImports(method).set(filteredImports);
	}

	private ModelList<CtImport> getImports(CtMethod<?> method) {
		return method.getPosition().getCompilationUnit().getImports();
	}
}
