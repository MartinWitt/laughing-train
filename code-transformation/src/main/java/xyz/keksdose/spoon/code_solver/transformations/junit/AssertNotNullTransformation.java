
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

public class AssertNotNullTransformation extends TransformationProcessor<CtInvocation<?>> {

	public AssertNotNullTransformation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtInvocation<?> element) {
		if (element.getExecutable() != null && JunitHelper.isJunit5AssertTrue(element.getExecutable())) {
			CtInvocation<?> junit5AssertTrue = element;
			CtExpression<?> expression = element.getArguments().iterator().next();
			if (expression instanceof CtBinaryOperator) {
				CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
				if (binaryOperator.getKind().equals(BinaryOperatorKind.NE)) {
					CtExpression<?> check = findTestingExpression(binaryOperator);
					if (check != null) {
						CtInvocation<?> junit5AssertNotNull = createJunit5AssertNotNull(check);
						junit5AssertNotNull.setComments(element.getComments());
						junit5AssertTrue.replace(junit5AssertNotNull);
						if (element.getArguments().size() == 2) {
							// readd the String if it fails argument
							junit5AssertNotNull.addArgument(element.getArguments().get(1));
						}
						adjustImports(element);
						notifyChangeListener(element, junit5AssertTrue);
					}
				}
			}
		}
	}

	private CtExpression<?> findTestingExpression(CtBinaryOperator<?> binaryOperator) {
		CtExpression<?> left = binaryOperator.getLeftHandOperand();
		CtExpression<?> right = binaryOperator.getRightHandOperand();
		CtExpression<?> check = null;
		if (isNullType(left)) {
			check = right;
		}
		if (isNullType(right)) {
			check = left;
		}
		return check;
	}

	private void adjustImports(CtInvocation<?> element) {
		CtType<?> parent = element.getParent(CtType.class);
		CtCompilationUnit compilationUnit = element.getPosition().getCompilationUnit();

		if (parent != null && !hasJunit5AsserTrueLeft(parent)) {
			ImportHelper.removeImport("org.junit.jupiter.api.Assertions.assertTrue", true, compilationUnit);
		}
		ImportHelper.addImport("org.junit.jupiter.api.Assertions.assertNotNull", true, compilationUnit);

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

	private CtInvocation<?> createJunit5AssertNotNull(CtExpression<?> check) {
		CtTypeReference<?> typeRef = getFactory().Type().createReference("org.junit.jupiter.api.Assertions");
		CtTypeReference<?> voidType = getFactory().Type().voidPrimitiveType();
		CtExecutableReference<?> assertNotNull = getFactory().Executable()
				.createReference(typeRef, voidType, "assertNotNull", List.of(getFactory().Type().objectType()));
		return getFactory().createInvocation(null, assertNotNull, List.of(check));
	}

	private void notifyChangeListener(CtInvocation<?> oldAssert, CtInvocation<?> newAssert) {
		CtType<?> parent = newAssert.getParent(CtType.class);
		setChanged(parent, new Change(String.format("Replaced %s with %s", oldAssert, newAssert),
			"AssertTrue instead of AssertNotNull", parent));
	}

}
