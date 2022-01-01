
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class CollectionEmptyCheck extends TransformationProcessor<CtBinaryOperator<?>> {

	public CollectionEmptyCheck(ChangeListener listener) {
		super(listener);

	}

	public boolean isApplicable(CtBinaryOperator<?> element) {
		return leftHandIsSizeCheck(element) && element.getKind().equals(BinaryOperatorKind.EQ)
				&& element.getRightHandOperand().toString().equals("0");
	}

	private boolean leftHandIsSizeCheck(CtBinaryOperator<?> element) {
		CtExpression<?> leftHand = element.getLeftHandOperand();
		List<CtInvocation<?>> innvocation = leftHand.getElements(new TypeFilter<>(CtInvocation.class));
		innvocation.stream()
				.filter(outer -> innvocation.stream().anyMatch(inner -> outer.hasParent(inner)))
				.toList()
				.forEach(innvocation::remove);
		if (innvocation.isEmpty()) {
			return false;
		}
		CtInvocation<?> invocation = innvocation.get(innvocation.size() - 1);
		if (invocation.getTarget() != null && invocation.getTarget()
				.getType()
				.isSubtypeOf(getFactory().Type().createReference(Collection.class))) {
			if (invocation.getExecutable().getSimpleName().equals("size")) {
				if (invocation.getArguments().isEmpty()) {
					return true;
				}
			}
		}
		return false;
	}

	public void process(CtBinaryOperator<?> element) {
		if (isApplicable(element)) {
			CtExecutableReference<Boolean> ref = getFactory().createExecutableReference();
			ref.setSimpleName("isEmpty");
			ref.setType(getFactory().Type().booleanType());
			ref.setDeclaringType(getFactory().createCtTypeReference(Collection.class));
			setChanged(element.getParent(CtType.class),
				new Change("EmptyCollectionCheck", "EmptyCollectionCheck", element.getParent(CtType.class)));
			CtInvocation<Boolean> innvocation = getFactory().Code()
					.createInvocation(element.getElements(new TypeFilter<>(CtInvocation.class)).get(0).getTarget(), ref,
						new ArrayList<CtExpression<?>>());
			element.replace(innvocation);
		}
	}
}
