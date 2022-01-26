
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.List;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class PrimitiveToString extends TransformationProcessor<CtBinaryOperator<?>> {

	private static final BadSmell STRING_VALUE_OF = new BadSmell() {
		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("String-ValueOf-Primitive");
		}

		@Override
		public MarkdownString getDescription() {
			String raw = "Primitive types are converted to String using concationation with `\"\"`"
					+ "String.valueOf(primitive) is the preferred way to convert a primitive to a String.";
			String markdown = "Primitive types are converted to String using concationation with `\"\"`"
					+ "`String.valueOf(primitive)` is the preferred way to convert a primitive to a String.";
			return MarkdownString.fromMarkdown(raw, markdown);
		}
	};
	public PrimitiveToString(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtBinaryOperator<?> op) {
		if (op.getKind().equals(BinaryOperatorKind.PLUS)) {
			if (isEmptyString(op.getLeftHandOperand()) && isPrimitive(op.getRightHandOperand())) {
				refactor(op, op.getRightHandOperand());
			}
			if (isPrimitive(op.getLeftHandOperand()) && isEmptyString(op.getRightHandOperand())) {
				refactor(op, op.getLeftHandOperand());
			}
		}
	}

	private boolean isEmptyString(CtExpression<?> exp) {
		return exp.toString().equals("\"\"");
	}

	private boolean isPrimitive(CtExpression<?> exp) {
		return exp.getType() != null && exp.getType().isPrimitive();
	}

	private void refactor(CtBinaryOperator<?> op, CtExpression<?> primitive) {
		CtTypeReference<Object> stringType = getFactory().Type().createSimplyQualifiedReference("java.lang.String");
		CtExecutableReference<?> valueOf = getFactory().Executable()
				.createReference(stringType, stringType, "valueOf", primitive.getType());
		CtInvocation<?> valueOfInvocation = getFactory().Code()
				.createInvocation(getFactory().createTypeAccess(stringType), valueOf, primitive);
		notifyChangeListener(op, valueOfInvocation);
		op.replace(valueOfInvocation);
	}

	private void notifyChangeListener(CtBinaryOperator<?> op, CtExpression<?> primitive) {
		String raw = "Replaced " + op + " with String.valueOf(" + primitive + ")";
		String markdown = "Replaced `" + op + "` with `String.valueOf(" + primitive + ")`";
		CtType<?> parent = op.getParent(CtType.class).getTopLevelType();
		setChanged(parent, new Change(STRING_VALUE_OF, MarkdownString.fromMarkdown(raw, markdown), parent));
	}

	@Override

	public List<BadSmell> getHandledBadSmells() {
		return List.of(STRING_VALUE_OF);
	}
}
