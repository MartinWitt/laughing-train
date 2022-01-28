
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import static java.lang.String.format;

import java.util.List;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.util.Nullsafe;

public class StaticAccess extends TransformationProcessor<CtInvocation<?>> {

	private static final String RAW_CHANGE_LOG = "Method %s was accessed via the instance variable %s.";
	private static final String MARKDOWN_CHANGE_LOG = "Method `%s` was accessed via the instance variable `%s`.";
	private static final BadSmell NON_STATIC_ACCESS = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("NonStaticAccess");
		}

		@Override
		public MarkdownString getDescription() {
			String rawText = "Static methods should be access via the class name, not the instance variable.";
			return MarkdownString.fromRaw(rawText);
		}
	};
	public StaticAccess(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> invocation) {
		if (invocation.getTarget() == null) {
			return;
		}
		if (isStaticInvocation(invocation) && !isTypeAccess(invocation)) {
			notifyChangeListener(invocation);
			replaceTarget(invocation);
		}
	}

	private void replaceTarget(CtInvocation<?> invocation) {
		CtTypeAccess<?> typeAccess = getFactory().createTypeAccess(invocation.getExecutable().getDeclaringType());
		typeAccess.getAccessedType().setSimplyQualified(true);
		invocation.setTarget(typeAccess);
	}

	private void notifyChangeListener(CtInvocation<?> invocation) {
		String raw = format(RAW_CHANGE_LOG, invocation.getExecutable().getSimpleName(), invocation.getTarget());
		String markdown = format(MARKDOWN_CHANGE_LOG, invocation.getExecutable().getSimpleName(),
			invocation.getTarget());
		CtType<?> parent = invocation.getParent(CtType.class).getTopLevelType();
		setChanged(parent, new Change(NON_STATIC_ACCESS, MarkdownString.fromMarkdown(raw, markdown), parent));
	}

	private boolean isTypeAccess(CtInvocation<?> invocation) {
		return invocation.getTarget() instanceof CtTypeAccess;
	}

	private boolean isStaticInvocation(CtInvocation<?> invocation) {
		return Nullsafe.get(() -> invocation.getExecutable().isStatic(), false);
	}

	@Override

	public List<BadSmell> getHandledBadSmells() {
		return List.of(NON_STATIC_ACCESS);
	}
}
