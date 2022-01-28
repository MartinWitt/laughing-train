
package xyz.keksdose.spoon.code_solver.transformations.junit.migration;

import java.util.List;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertThatTransformation extends TransformationProcessor<CtInvocation<?>> {

	private static final String ORG_HAMCREST_MATCHER_ASSERT = "org.hamcrest.MatcherAssert";
	private static final BadSmell ASSERT_THAT_BAD_SMELL = new BadSmell() {

		@Override
		public MarkdownString getDescription() {
			String rawText = "AssertThat in Junit 4 is deprecated. Use AssertThat in Hamcrest instead.";
			String markdownText = "`AssertThat` in Junit 4 is deprecated. Use `AssertThat` in Hamcrest instead.";
			return MarkdownString.fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("JUnit4-AssertThat");
		}

	};

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
			new Change(ASSERT_THAT_BAD_SMELL,
				MarkdownString.fromMarkdown(
					String.format("Replaced Assert.assertThat with MatcherAssert.assertThat in %s",
						invocation.getParent(CtExecutable.class).getSimpleName()),
					String.format("Replaced `Assert.assertThat` with `MatcherAssert.assertThat` in `%s`",
						invocation.getParent(CtExecutable.class).getSimpleName())),
				parentType));
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

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of(ASSERT_THAT_BAD_SMELL);
	}
}
