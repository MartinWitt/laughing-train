
package xyz.keksdose.spoon.code_solver.transformations.junit.simplification;

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
import xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper;

public class AssertFalseSameCheck extends TransformationProcessor<CtInvocation<?>> {

	public AssertFalseSameCheck(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> invocation) {
		if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
			CtInvocation<?> junit5AssertTrue = invocation;
			CtExpression<?> expression = invocation.getArguments().iterator().next();
			if (expression instanceof CtBinaryOperator) {
				CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
				if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
					CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(binaryOperator.getLeftHandOperand(),
							binaryOperator.getRightHandOperand());
					junit5AssertNotNull.setComments(invocation.getComments());
					junit5AssertTrue.replace(junit5AssertNotNull);
					if (invocation.getArguments().size() == 3) {
						// readd the String if it fails argument
						junit5AssertNotNull.addArgument(invocation.getArguments().get(2).clone());
					}
					adjustImports(invocation);
					notifyChangeListener(junit5AssertTrue);
				}
			}
		}
	}

	private void adjustImports(CtInvocation<?> element) {
		CtType<?> parent = element.getParent(CtType.class);
		CtCompilationUnit compilationUnit = element.getPosition().getCompilationUnit();

		if (parent != null && !hasJunit5AssertTrueLeft(parent)) {
			ImportHelper.removeImport("org.junit.jupiter.api.Assertions.assertTrue", true, compilationUnit);
		}
		ImportHelper.addImport("org.junit.jupiter.api.Assertions.assertNotSame", true, compilationUnit);

	}

	private boolean hasJunit5AssertTrueLeft(CtType<?> parent) {
		return parent.getElements(new TypeFilter<>(CtInvocation.class))
				.stream()
				.filter(v -> v.getExecutable() != null)
				.anyMatch(v -> JunitHelper.isJunit5AssertTrue(v.getExecutable()));
	}

	private CtInvocation<?> createJunit5AssertSame(CtExpression<?> firstArgument, CtExpression<?> secondArgument) {
		CtTypeReference<?> typeRef = getFactory().Type().createReference("org.junit.jupiter.api.Assertions");
		CtTypeReference<?> voidType = getFactory().Type().voidPrimitiveType();
		CtTypeReference<Object> objectType = getFactory().Type().objectType();
		CtExecutableReference<?> assertEquals = getFactory().Executable()
				.createReference(typeRef, voidType, "assertNotSame", List.of(objectType, objectType));
		return getFactory().createInvocation(null, assertEquals, List.of(firstArgument, secondArgument));
	}

	private void notifyChangeListener(CtInvocation<?> newAssert) {
		CtType<?> parent = newAssert.getParent(CtType.class);
		setChanged(parent, new Change(String.format("Replaced assertFalse checking not same with assertNotSame"),
				"assertFalse with not equals instead of assertNotSame", parent));
	}

}
