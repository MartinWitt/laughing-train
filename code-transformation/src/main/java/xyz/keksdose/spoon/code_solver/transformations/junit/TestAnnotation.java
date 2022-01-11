
package xyz.keksdose.spoon.code_solver.transformations.junit;

import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.getJunit5TestReference;
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
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TestAnnotation extends TransformationProcessor<CtAnnotation<?>> {

	private static final String CHANGE_TEXT_MARKDOWN = "Replaced junit 4 test annotation with junit 5 test annotation in `%s`";
	private static final String CHANGE_TEXT_RAW = "Replaced junit 4 test annotation with junit 5 test annotation in %s";
	private static final String RULE_NAME = "Junit4 @Test Annotation";
	private static final String JUNIT4_TEST = "org.junit.Test";
	private static final String JUNIT5_TEST = "org.junit.jupiter.api.Test";
	private static final String JUNIT5_TIMEOUT = "org.junit.jupiter.api.Timeout";
	private static final String JAVA_UTIL_CONCURRENT_TIME_UNIT = "java.util.concurrent.TimeUnit";

	public TestAnnotation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtAnnotation<?> annotation) {
		if (isJunit4TestAnnotation(annotation) && !hasExpectedValue(annotation)) {
			refactorTimeoutAnnotation(annotation, annotation.getAnnotatedElement());
			adjustImports(annotation);
			adjustAnnotationType(annotation);
			notifiyChangeListener(annotation, annotation.getParent(CtType.class));
		}
	}

	private void adjustAnnotationType(CtAnnotation<?> annotation) {
		annotation.setType(getJunit5TestReference(getFactory()));
		annotation.setAnnotationType(getJunit5TestReference(getFactory()));
		annotation.getAnnotationType().setSimplyQualified(true);
		annotation.getType().setSimplyQualified(true);
	}

	private void notifiyChangeListener(CtAnnotation<?> annotation, CtType<?> type) {
		setChanged(type,
			new Change(MarkdownString.fromMarkdown(String.format(CHANGE_TEXT_RAW, getNameOfAnnotatedMethod(annotation)),
				String.format(CHANGE_TEXT_MARKDOWN, ((CtMethod<?>) annotation.getAnnotatedElement()).getSimpleName())),
				RULE_NAME, type));
	}

	private String getNameOfAnnotatedMethod(CtAnnotation<?> annotation) {
		return ((CtMethod<?>) annotation.getAnnotatedElement()).getSimpleName();
	}

	private void refactorTimeoutAnnotation(CtAnnotation<?> annotation, CtElement element) {
		if (JunitHelper.hasTimeoutValue(annotation)) {
			CtAnnotation<?> timeout = JunitHelper.createTimeoutAnnotation(getFactory());
			timeout.addValue("value", Long.valueOf(annotation.getValue("timeout").toString().replace("L", "")));
			timeout.addValue("unit", TimeUnit.MILLISECONDS);
			element.addAnnotation(timeout);
			removeTimeoutValue(annotation);
			ImportHelper.addImport(JUNIT5_TIMEOUT, false, element.getPosition().getCompilationUnit());
			ImportHelper.addImport(JAVA_UTIL_CONCURRENT_TIME_UNIT, false, element.getPosition().getCompilationUnit());
		}
	}

	private void removeTimeoutValue(CtAnnotation<?> testAnnotation) {
		testAnnotation.setValues(testAnnotation.getValues()
				.entrySet()
				.stream()
				.filter(v -> !v.getKey().equals("timeout"))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue)));
	}

	private void adjustImports(CtElement element) {
		ImportHelper.removeImport(JUNIT4_TEST, false, element.getPosition().getCompilationUnit());
		ImportHelper.addImport(JUNIT5_TEST, false, element.getPosition().getCompilationUnit());
	}

}
