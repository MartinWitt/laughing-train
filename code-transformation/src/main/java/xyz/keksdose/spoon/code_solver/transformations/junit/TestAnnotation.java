
package xyz.keksdose.spoon.code_solver.transformations.junit;

import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.hasExpectedValue;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.isJunit4TestAnnotation;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TestAnnotation extends TransformationProcessor<CtAnnotation<?>> {

	public TestAnnotation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtAnnotation<?> annotation) {
		if (isJunit4TestAnnotation(annotation) && !hasExpectedValue(annotation)) {
			CtElement element = annotation.getAnnotatedElement();
			refactorTimeoutAnnotation(annotation, element);
			adjustImports(annotation, element);
			annotation.setAnnotationType(getFactory().createReference("org.junit.jupiter.api.Test"));
			CtType<?> type = annotation.getParent(CtType.class);
			setChanged(type,
				new Change(
					String.format("Replaced junit 4 test annotation with junit 5 test annotation in %s",
						((CtMethod<?>) annotation.getAnnotatedElement()).getSimpleName()),
					"Junit4 TestAnnotation", type));
		}

	}

	private void refactorTimeoutAnnotation(CtAnnotation<?> annotation, CtElement element) {
		if (JunitHelper.hasTimeoutValue(annotation)) {
			CtAnnotation<?> timeout = JunitHelper.createTimeoutAnnotation(getFactory());
			timeout.addValue("value", annotation.getValue("timeout").toString());
			timeout.addValue("unit", "MILLISECONDS");
			element.addAnnotation(timeout);
		}
	}

	private void adjustImports(CtAnnotation<?> annotation, CtElement element) {
		ImportHelper.removeImport("org.junit.Test", false, element.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.Test", false, element.getPosition().getCompilationUnit());
	}

}
