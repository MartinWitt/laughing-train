
package xyz.keksdose.spoon.code_solver.transformations.junit;

import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.createBeforeEachAnnotation;

import java.util.Optional;

import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class Junit4AnnotationsTransformation extends TransformationProcessor<CtMethod<?>> {

	/**
	 *
	 */
	private static final String PROCESSOR_NAME = "Junit4AnnotationsTransformation";
	private static final String JUNIT5_BEFORE_EACH = "org.junit.jupiter.api.BeforeEach";
	private static final String JUNIT4_BEFORE = "org.junit.Before";
	private static final String JUNIT5_BEFORE_ALL = "org.junit.jupiter.api.BeforeAll";
	private static final String JUNIT4_BEFORE_CLASS = "org.junit.BeforeClass";

	public Junit4AnnotationsTransformation(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> method) {
		refactorBeforeClass(method);
		refactorBefore(method);
		refactorAfter(method);
		refactorAfterClass(method);
		refactorIgnore(method);
	}

	private void refactorBeforeClass(CtMethod<?> method) {
		Optional<CtAnnotation<?>> beforeClassAnnotation = JunitHelper.getJunit4BeforeClassAnnotation(method);
		if (beforeClassAnnotation.isPresent()) {
			adjustImportsBeforeClass(method);
			replaceBeforeClassAnnotation(method, beforeClassAnnotation.get());
			notifyChangeListenerBeforeClass(method);
		}
	}

	private void replaceBeforeClassAnnotation(CtMethod<?> method, CtAnnotation<?> beforeClassAnnotation) {
		method.removeAnnotation(beforeClassAnnotation);
		method.addAnnotation(JunitHelper.createBeforeAllAnnotation(getFactory()));
	}

	private void adjustImportsBeforeClass(CtMethod<?> method) {
		ImportHelper.removeImport(JUNIT4_BEFORE_CLASS, false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport(JUNIT5_BEFORE_ALL, false, method.getPosition().getCompilationUnit());
	}

	private void notifyChangeListenerBeforeClass(CtMethod<?> method) {
		CtType<?> declaringType = method.getParent(CtType.class);
		String changeText = String.format("Replaced `@BeforeClass` annotation with `@BeforeAll` from method `%s`",
			method.getSimpleName());
		setChanged(declaringType, new Change(

			MarkdownString.fromMarkdown(removeMarkdownBackticks(changeText), changeText), PROCESSOR_NAME,
			declaringType));
	}

	private void refactorBefore(CtMethod<?> method) {
		Optional<CtAnnotation<?>> beforeAnnotation = JunitHelper.getJunit4BeforeAnnotation(method);
		if (beforeAnnotation.isPresent()) {
			CtCompilationUnit compilationUnit = method.getPosition().getCompilationUnit();
			adjustImportsBefore(compilationUnit);
			replaceBeforeAnnotation(method, beforeAnnotation.get());
			notifyChangeListenerBefore(method);
		}
	}

	private void adjustImportsBefore(CtCompilationUnit compilationUnit) {
		ImportHelper.removeImport(JUNIT4_BEFORE, false, compilationUnit);
		ImportHelper.addImport(JUNIT5_BEFORE_EACH, false, compilationUnit);
	}

	private void replaceBeforeAnnotation(CtMethod<?> method, CtAnnotation<?> beforeAnnotation) {
		method.removeAnnotation(beforeAnnotation);
		method.addAnnotation(createBeforeEachAnnotation(getFactory()));
	}

	private void notifyChangeListenerBefore(CtMethod<?> method) {
		CtType<?> declaringType = method.getParent(CtType.class);
		String changeText = String.format("Replaced `@Before` annotation with @BeforeEach from method `%s`",
			method.getSimpleName());
		setChanged(declaringType,
			new Change(MarkdownString.fromMarkdown(removeMarkdownBackticks(changeText), changeText), PROCESSOR_NAME,
				declaringType));
	}

	private void refactorAfter(CtMethod<?> method) {
		Optional<CtAnnotation<?>> afterAnnotation = JunitHelper.getJunit4AfterAnnotation(method);
		if (afterAnnotation.isPresent()) {
			adjustImportsAfter(method);
			replaceAfterAnnotation(method, afterAnnotation.get());
			notifyChangeListenerAfter(method);
		}
	}

	private void replaceAfterAnnotation(CtMethod<?> method, CtAnnotation<?> afterAnnotation) {
		method.removeAnnotation(afterAnnotation);
		method.addAnnotation(JunitHelper.createAfterEachAnnotation(getFactory()));
	}

	private void notifyChangeListenerAfter(CtMethod<?> method) {
		CtType<?> declaringType = method.getParent(CtType.class);
		String changeText = String.format("Replaced `@After` annotation with `@AfterEach` from method `%s`",
			method.getSimpleName());

		setChanged(declaringType,
			new Change(MarkdownString.fromMarkdown(removeMarkdownBackticks(changeText), changeText), PROCESSOR_NAME,
				declaringType));
	}

	private void adjustImportsAfter(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.After", true, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.AfterEach", false, method.getPosition().getCompilationUnit());
	}

	private void refactorAfterClass(CtMethod<?> method) {
		Optional<CtAnnotation<?>> afterAnnotation = JunitHelper.getJunit4AfterClassAnnotation(method);
		if (afterAnnotation.isPresent()) {
			adjustImportsAfterClass(method);
			replaceAfterClassAnnotation(method, afterAnnotation.get());
			notifyChangeListenerAfterClass(method);
		}
	}

	private void replaceAfterClassAnnotation(CtMethod<?> method, CtAnnotation<?> afterAnnotation) {
		method.removeAnnotation(afterAnnotation);
		method.addAnnotation(JunitHelper.createAfterAllAnnotation(getFactory()));
	}

	private void notifyChangeListenerAfterClass(CtMethod<?> method) {
		CtType<?> declaringType = method.getParent(CtType.class);
		String changeText = String.format("Replaced `@AfterClass` annotation with `@AfterAll` from method `%s`",
			method.getSimpleName());
		setChanged(declaringType,
			new Change(MarkdownString.fromMarkdown(removeMarkdownBackticks(changeText), changeText), PROCESSOR_NAME,
				declaringType));
	}

	private void adjustImportsAfterClass(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.AfterClass", false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.AfterAll", false, method.getPosition().getCompilationUnit());
	}

	private void refactorIgnore(CtMethod<?> method) {
		Optional<CtAnnotation<?>> ignoreAnnotation = JunitHelper.getIgnoreAnnotation(method);
		if (ignoreAnnotation.isPresent()) {
			adjustImportsIgnore(method);
			replaceIgnoreAnnotation(method, ignoreAnnotation.get());
			notifyChangeListenerIgnore(method);
		}
	}

	private void replaceIgnoreAnnotation(CtMethod<?> method, CtAnnotation<?> ignoreAnnotation) {
		method.removeAnnotation(ignoreAnnotation);
		method.addAnnotation(JunitHelper.createDisableAnnotation(getFactory()));
	}

	private void notifyChangeListenerIgnore(CtMethod<?> method) {
		String changeText = String.format("Replaced `@Ignore` annotation with `@Disabled` from method `%s`",
			method.getSimpleName());
		CtType<?> declaringType = method.getParent(CtType.class);
		setChanged(declaringType,
			new Change(MarkdownString.fromMarkdown(removeMarkdownBackticks(changeText), changeText), PROCESSOR_NAME,
				declaringType));
	}

	private void adjustImportsIgnore(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.Ignore", false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.Disabled", false, method.getPosition().getCompilationUnit());
	}

	private String removeMarkdownBackticks(String text) {
		return text.replace("`", "");
	}
}
