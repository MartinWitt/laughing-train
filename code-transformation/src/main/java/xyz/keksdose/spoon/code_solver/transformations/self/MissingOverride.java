
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.support.reflect.CtExtendedModifier;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.SmellKind;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class MissingOverride extends TransformationProcessor<CtMethod<?>> {

	public MissingOverride(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> element) {
		if (element.getTopDefinitions().size() == 1) {
			if (element.getAnnotations().stream().noneMatch(v -> v.getName().equals("Override"))) {
				if (element.getTopDefinitions()
						.stream()
						.filter(v -> v.getBody() != null)
						.anyMatch(v -> !v.getBody().getStatements().isEmpty() || !v.isAbstract())) {
					CtAnnotation<?> overrideAnnotation = getFactory()
							.createAnnotation(getFactory().Type().createReference(Override.class));
					overrideAnnotation.setComments(element.getComments());
					overrideAnnotation.setDocComment(element.getDocComment());
					element.setComments(List.of());
					element.addAnnotation(overrideAnnotation);
					element.getExtendedModifiers().forEach(MissingOverride::markElementForSniperPrinting);

					setChanged(element.getDeclaringType(),
						new Change(
							String.format("Added missing override annotation to method %s at %s",
								element.getSimpleName(), element.getPosition()),
							"MissingOverride", element.getDeclaringType()));
					markElementForSniperPrinting(element);
				}
			}
		}
	}

	/**
	 * Modify an element such that the sniper printer detects it as modified, without changing its final content. This
	 * forces it to be sniper-printed "as-is".
	 */
	private static void markElementForSniperPrinting(CtExtendedModifier element) {
		SourcePosition pos = element.getPosition();
		element.setPosition(SourcePosition.NOPOSITION);
		element.setPosition(pos);
	}

	/**
	 * Modify an element such that the sniper printer detects it as modified, without changing its final content. This
	 * forces it to be sniper-printed "as-is".
	 */
	private static void markElementForSniperPrinting(CtElement element) {
		SourcePosition pos = element.getPosition();
		element.setPosition(SourcePosition.NOPOSITION);
		element.setPosition(pos);
	}

	@Override
	public SmellKind getKind() {
		return SmellKind.MISC;
	}
}
