
package xyz.keksdose.spoon.code_solver.transformations.junit;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertThatTransformation extends TransformationProcessor<CtInvocation<?>> {

	private static final String ORG_HAMCREST_MATCHER_ASSERT = "org.hamcrest.MatcherAssert";

	public AssertThatTransformation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> invocation) {
		CtExecutableReference<?> exec = invocation.getExecutable();
		if (exec != null && isInJunit4Assert(exec) && isAssertThat(exec)) {
			exec.setDeclaringType(getFactory().createReference(ORG_HAMCREST_MATCHER_ASSERT));
			adjustImports(invocation);
			notifyChangeListener(invocation);
		}
	}

	private void notifyChangeListener(CtInvocation<?> invocation) {
		CtType<?> parentType = invocation.getParent(CtType.class);
		setChanged(parentType,
			new Change(String.format("Replaced `Assert.assertThat` with `MatcherAssert.assertThat` in `%s`",
				invocation.getParent(CtExecutable.class).getSimpleName()), "assertThat", parentType));
	}

	private void adjustImports(CtInvocation<?> invocation) {
		ImportHelper.removeImport("org.junit.Assert.assertThat", true, invocation.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.hamcrest.MatcherAssert.assertThat", true,
			invocation.getPosition().getCompilationUnit());
	}

	private boolean isInJunit4Assert(CtExecutableReference<?> exec) {
		return exec.getDeclaringType() != null && exec.getDeclaringType().getQualifiedName().equals("org.junit.Assert");
	}

	private boolean isAssertThat(CtExecutableReference<?> exec) {
		return exec.getSimpleName().equals("assertThat");
	}
}
