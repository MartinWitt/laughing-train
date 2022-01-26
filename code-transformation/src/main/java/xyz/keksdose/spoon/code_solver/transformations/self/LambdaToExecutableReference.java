
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;

import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExecutableReferenceExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class LambdaToExecutableReference extends TransformationProcessor<CtLambda<?>> {

	private static final BadSmell lambdaInsteadOfExecutableReference = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("LambdaInsteadOfExecutableReference");
		}

		@Override
		public MarkdownString getDescription() {
			return MarkdownString.fromRaw("Lambda is used instead of executable reference");
		}

		@Override
		public List<Link> getLinks() {
			return List.of(new Link("https://rules.sonarsource.com/java/RSPEC-1612"));
		}
	};
	public LambdaToExecutableReference(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtLambda<?> lambda) {
		if (lambda.getBody() == null) {
			CtExpression<?> expression = lambda.getExpression();
			if (expression instanceof CtInvocation) {
				//TODO: handle this
			}
			if (expression instanceof CtConstructorCall) {
				refactorConstructorCall(lambda, expression);
			}
		}
	}

	private void refactorConstructorCall(CtLambda<?> lambda, CtExpression<?> expression) {
		CtConstructorCall<?> invocation = (CtConstructorCall<?>) expression;
		if (invocation.getArguments().isEmpty()) {
			CtExecutableReferenceExpression<?, CtTypeAccess<?>> exec = getFactory().Core()
					.createExecutableReferenceExpression();
			exec.setExecutable((CtExecutableReference) invocation.getExecutable());
			exec.setType(getType(invocation));
			exec.setTarget(getFactory().createTypeAccess(invocation.getType()));
			lambda.replace(exec);
			String raw = String.format("Replaced lambda %s with executable ref %s", lambda, exec);
			String markdown = String.format("Replaced lambda `%s` with executable ref `%s`", lambda, exec);
			CtType<Object> topLevelType = lambda.getParent(CtType.class).getTopLevelType();
			setChanged(topLevelType, new Change(lambdaInsteadOfExecutableReference,
				MarkdownString.fromMarkdown(raw, markdown), topLevelType));
		}
	}

	@SuppressWarnings("unchecked")
	private <T> CtTypeReference<T> getType(CtTypedElement<?> typedElement) {
		return (CtTypeReference<T>) typedElement.getType();
	}

	@Override

	public List<BadSmell> getHandledBadSmells() {
		return List.of(lambdaInsteadOfExecutableReference);
	}
}
