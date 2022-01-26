
package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.List;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtField;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class RedundantFieldInitialization extends TransformationProcessor<CtField<?>> {

	private static final BadSmell REDUNDANT_FIELD_INITIALIZATION = new BadSmell() {

		@Override
		public MarkdownString getDescription() {

			return MarkdownString
					.fromRaw("Primitive types have default values and setting them to the same value is redundant.");
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("RedundantFieldInitialization");
		}

	};
	public RedundantFieldInitialization(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtField<?> element) {
		List<CtField<?>> variables = element.getElements(new TypeFilter<>(CtField.class));
		for (CtField<?> ctField : variables) {
			if (ctField.getType().isPrimitive()) {
				checkInt(ctField);
				checkBoolean(ctField);
			}
			else {
				checkObject(ctField);
			}
		}
	}

	private void checkObject(CtField<?> ctField) {
		if (ctField.getDefaultExpression() != null && hasDefaultExpression(ctField, "null")) {
			setChanged(ctField.getDeclaringType(), createChange(ctField, ctField.getDefaultExpression()));
			ctField.setDefaultExpression(null);
		}
	}

	private void checkBoolean(CtField<?> ctField) {
		if (isPrimtiveType(ctField.getType(), getFactory().Type().booleanPrimitiveType())
				&& hasDefaultExpression(ctField, "false")) {
			setChanged(ctField.getDeclaringType(), createChange(ctField, ctField.getDefaultExpression()));
			ctField.setDefaultExpression(null);
		}
	}

	private void checkInt(CtField<?> ctField) {
		if (isPrimtiveType(ctField.getType(), getFactory().Type().integerPrimitiveType())
				&& hasDefaultExpression(ctField, "0")) {
			setChanged(ctField.getDeclaringType(), createChange(ctField, ctField.getDefaultExpression()));
			ctField.setDefaultExpression(null);
		}
	}

	private boolean hasDefaultExpression(CtField<?> ctField, String defaultExpression) {
		return ctField.getDefaultExpression() != null
				&& ctField.getDefaultExpression().toString().equals(defaultExpression);
	}

	public boolean isPrimtiveType(CtTypeReference<?> ctField, CtTypeReference<?> primitive) {
		return ctField.equals(primitive);
	}

	private Change createChange(CtField<?> field, CtExpression<?> defaultExpression) {
		String raw = "Field Initializer  %s for field %s in type %s was redundant and was removed.";
		String markdown = "Field Initializer  `%s` for field `%s` in type `%s` was redundant and was removed.";
		MarkdownString changelog = MarkdownString.fromMarkdown(
			String.format(raw, defaultExpression, field.getSimpleName(), field.getDeclaringType().getQualifiedName()),
			String.format(markdown, defaultExpression, field.getSimpleName(),
				field.getDeclaringType().getQualifiedName()));
		return new Change(REDUNDANT_FIELD_INITIALIZATION, changelog, field.getDeclaringType().getTopLevelType());
	}
}
