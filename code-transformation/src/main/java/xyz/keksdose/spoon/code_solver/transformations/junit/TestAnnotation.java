
package xyz.keksdose.spoon.code_solver.transformations.junit;

import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.hasExpectedValue;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.isJunit4TestAnnotation;

import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
			adjustImports(annotation);
			annotation.setType(getFactory().createReference("org.junit.jupiter.api.Test"));
			annotation.setAnnotationType(getFactory().createReference("org.junit.jupiter.api.Test"));
			annotation.getAnnotationType().setSimplyQualified(true);
			annotation.getType().setSimplyQualified(true);
			CtType<?> type = annotation.getParent(CtType.class);
			type.getReferencedTypes();
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
			timeout.addValue("value", Long.valueOf(annotation.getValue("timeout").toString().replace("L", "")));
			timeout.addValue("unit", TimeUnit.MILLISECONDS);
			element.addAnnotation(timeout);
			removeExpectedValue(annotation);
			ImportHelper.addImport("org.junit.jupiter.api.Timeout", false, element.getPosition().getCompilationUnit());
			ImportHelper.addImport("java.util.concurrent.TimeUnit", false, element.getPosition().getCompilationUnit());
		}
	}

	private void removeExpectedValue(CtAnnotation<?> testAnnotation) {
		testAnnotation.setValues(testAnnotation.getValues()
				.entrySet()
				.stream()
				.filter(v -> !v.getKey().equals("timeout"))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue)));
	}

	private void adjustImports(CtElement element) {
		ImportHelper.removeImport("org.junit.Test", false, element.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.Test", false, element.getPosition().getCompilationUnit());
	}

}
