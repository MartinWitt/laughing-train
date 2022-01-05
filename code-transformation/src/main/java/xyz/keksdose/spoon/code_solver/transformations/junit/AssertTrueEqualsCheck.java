
package xyz.keksdose.spoon.code_solver.transformations.junit;

import java.util.List;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertTrueEqualsCheck extends TransformationProcessor<CtInvocation<?>> {

	public AssertTrueEqualsCheck(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> invocation) {
		if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
			CtInvocation<?> junit5AssertTrue = invocation;
			CtExpression<?> expression = invocation.getArguments().iterator().next();
			if (expression instanceof CtInvocation) {
				CtInvocation<?> equalsInvocation = (CtInvocation<?>) expression;
				if (equalsInvocation.getExecutable().getSimpleName().equals("equals")) {
					CtExpression<?> firstArgument = equalsInvocation.getTarget();
					CtExpression<?> secondArgument = equalsInvocation.getArguments().iterator().next();
					CtInvocation<?> junit5AssertEquals = createJunit5AssertEquals(firstArgument, secondArgument);
					junit5AssertEquals.setComments(invocation.getComments());
					junit5AssertTrue.replace(junit5AssertEquals);
					if (invocation.getArguments().size() == 2) {
						// readd the String if it fails argument
						junit5AssertEquals.addArgument(invocation.getArguments().get(1));
					}
					adjustImports(invocation);
					notifyChangeListener(invocation, junit5AssertTrue);
				}
			}
		}
	}

	private void adjustImports(CtInvocation<?> element) {
		CtType<?> parent = element.getParent(CtType.class);
		CtCompilationUnit compilationUnit = element.getPosition().getCompilationUnit();

		if (parent != null && !hasJunit5AsserTrueLeft(parent)) {
			ImportHelper.removeImport("org.junit.jupiter.api.Assertions.assertTrue", true, compilationUnit);
		}
		ImportHelper.addImport("org.junit.jupiter.api.Assertions.assertEquals", true, compilationUnit);

	}

	private boolean hasJunit5AsserTrueLeft(CtType<?> parent) {
		return parent.getElements(new TypeFilter<>(CtInvocation.class))
				.stream()
				.filter(v -> v.getExecutable() != null)
				.anyMatch(v -> JunitHelper.isJunit5AssertTrue(v.getExecutable()));
	}

	private boolean isNullType(CtExpression<?> left) {
		return left.getType() != null && left.getType().equals(getFactory().Type().nullType());
	}

	private CtInvocation<?> createJunit5AssertEquals(CtExpression<?> firstArgument, CtExpression<?> secondArgument) {
		CtTypeReference<?> typeRef = getFactory().Type().createReference("org.junit.jupiter.api.Assertions");
		CtTypeReference<?> voidType = getFactory().Type().voidPrimitiveType();
		CtTypeReference<Object> objectType = getFactory().Type().objectType();
		CtExecutableReference<?> assertEquals = getFactory().Executable()
				.createReference(typeRef, voidType, "assertEquals", List.of(objectType, objectType));
		return getFactory().createInvocation(null, assertEquals, List.of(firstArgument, secondArgument));
	}

	private void notifyChangeListener(CtInvocation<?> oldAssert, CtInvocation<?> newAssert) {
		CtType<?> parent = newAssert.getParent(CtType.class);
		setChanged(parent, new Change(String.format("Replaced %s with %s", oldAssert, newAssert),
			"AssertTrue with equals instead of AssertEquals", parent));
	}

}
