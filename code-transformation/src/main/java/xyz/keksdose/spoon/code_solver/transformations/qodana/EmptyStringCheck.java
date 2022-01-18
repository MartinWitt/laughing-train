
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.ArrayList;
import java.util.List;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class EmptyStringCheck extends TransformationProcessor<CtInvocation<?>> {

	private static final BadSmell badSmell = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("EmptyStringCheck");
		}

		@Override
		public MarkdownString getDescription() {
			String rawText = "Checking if a string is empty should be done by String#isEmpty instead of String.equals(\"\")";
			String markdown = "Checking if a string is empty should be done by `String#isEmpty` instead of `String.equals(\"\")`";
			return MarkdownString.fromMarkdown(rawText, markdown);
		}
	};

	public EmptyStringCheck(ChangeListener listener) {
		super(listener);

	}

	public boolean isApplicable(CtInvocation<?> element) {
		if (element.getTarget() != null && isStringType(element.getTarget()) && isEqualsMethod(element)) {
			if (isEmptyStringArgument(element)) {
				return true;
			}
			else {
				List<CtLiteral<?>> literals = element.getTarget().getElements(new TypeFilter<>(CtLiteral.class));
				if (isSingleArgumentAndEmptyString(literals)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isSingleArgumentAndEmptyString(List<CtLiteral<?>> literals) {
		return literals.size() == 1 && literals.get(0).getValue().equals("");
	}

	private boolean isEmptyStringArgument(CtInvocation<?> element) {
		return element.getArguments().get(0).toString().equals("\"\"");
	}

	private boolean isEqualsMethod(CtInvocation<?> element) {
		return element.getExecutable().getSimpleName().equals("equals") && element.getArguments().size() == 1;
	}

	public void process(CtInvocation<?> invocation) {
		if (isApplicable(invocation)) {
			CtExpression<?> target = findTarget(invocation);
			CtExecutableReference<Boolean> ref = createIsEmptyMethod();
			notifyChangeListener(invocation, target);
			invocation.replace(createNewInvocation(target, ref));
		}
	}

	private CtInvocation<Boolean> createNewInvocation(CtExpression<?> target, CtExecutableReference<Boolean> ref) {
		return getFactory().Code().createInvocation(target, ref, new ArrayList<CtExpression<?>>());
	}

	private CtExecutableReference<Boolean> createIsEmptyMethod() {
		CtExecutableReference<Boolean> ref = getFactory().createExecutableReference();
		ref.setSimpleName("isEmpty");
		ref.setType(getFactory().Type().booleanType());
		ref.setDeclaringType(getFactory().createCtTypeReference(String.class));
		return ref;
	}

	private void notifyChangeListener(CtInvocation<?> invocation, CtExpression<?> target) {
		String rawText = String.format(
			"Empty String check was written as %s.equals(\"\") and refactored to %s.isEmpty()", target, target);
		String markdown = String.format(
			"Empty String check was written as `%s.equals(\"\")` and refactored to `%s.isEmpty()`", target, target);
		setChanged(invocation.getParent(CtType.class), createChange(invocation, rawText, markdown));
	}

	private Change createChange(CtInvocation<?> invocation, String rawText, String markdown) {
		return new Change(badSmell, MarkdownString.fromMarkdown(rawText, markdown), invocation.getParent(CtType.class));
	}

	private CtExpression<?> findTarget(CtInvocation<?> invocation) {
		CtExpression<?> target = invocation.getTarget();
		if (isStringType(target)) {
			List<CtLiteral<?>> literals = target.getElements(new TypeFilter<>(CtLiteral.class));
			if (literals.size() == 1 && isEmptyStringArgument(literals)) {
				return invocation.getArguments().get(0);
			}
		}
		return target;
	}

	private boolean isEmptyStringArgument(List<CtLiteral<?>> literals) {
		return literals.get(0).getValue().equals("");
	}

	private boolean isStringType(CtExpression<?> target) {
		return target.getType().equals(getFactory().Type().stringType());
	}
}
