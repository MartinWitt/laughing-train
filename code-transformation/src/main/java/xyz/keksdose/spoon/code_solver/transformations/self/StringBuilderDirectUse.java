
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.util.Nullsafe;

public class StringBuilderDirectUse extends TransformationProcessor<CtInvocation<?>> {

	private static final BadSmell directStringBuilderUse = new BadSmell() {
		@Override
		public MarkdownString getName() {
			String name = "StringBuilderDirectUse";
			return MarkdownString.fromRaw(name);
		}

		@Override
		public MarkdownString getDescription() {
			String description = "StringBuilder offers a lot of methods directly and toString is not everytime needed";
			String markdownDescription = "`StringBuilder` offers a lot of methods directly and `toString` is not everytime needed";
			return MarkdownString.fromMarkdown(description, markdownDescription);
		}
	};
	public StringBuilderDirectUse(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> element) {
		if (targetIsStringType(element) && element.getTarget() instanceof CtInvocation) {
			CtInvocation<?> invocation = (CtInvocation<?>) element.getTarget();
			if (targetIsStringBuilder(invocation) && stringBuilderHasMethod(element)) {
				element.setTarget(invocation.getTarget());
				notifyChangeListener(element);
			}
		}
	}

	private void notifyChangeListener(CtInvocation<?> element) {
		CtType<?> parent = element.getParent(CtType.class).getTopLevelType();
		String rawText = String.format("%s can be replaced by direct stringbuilder method", element);
		String markdownText = String.format("`%s` can be replaced by direct stringbuilder method", element);
		Change change = new Change(directStringBuilderUse, MarkdownString.fromMarkdown(rawText, markdownText), parent);
		setChanged(parent, change);
	}

	private boolean targetIsStringType(CtInvocation<?> element) {
		return Nullsafe.get(() -> element.getTarget().getType().equals(element.getFactory().Type().stringType()),
			false);
	}

	private boolean targetIsStringBuilder(CtInvocation<?> element) {
		return Nullsafe.get(() -> element.getTarget().getType().getSimpleName().equals("StringBuilder"), false);
	}

	private boolean stringBuilderHasMethod(CtInvocation<?> element) {
		String methodName = element.getExecutable().getSimpleName();
		List<CtTypeReference<?>> parameter = element.getExecutable().getParameters();
		CtClass<?> stringBuilder = getFactory().Class().get(StringBuilder.class);
		return stringBuilder.getMethodsByName(methodName)
				.stream()
				.anyMatch(method -> method.getParameters().size() == parameter.size());
	}
}
