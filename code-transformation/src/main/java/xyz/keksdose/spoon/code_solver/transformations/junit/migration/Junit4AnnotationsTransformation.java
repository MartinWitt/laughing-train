
package xyz.keksdose.spoon.code_solver.transformations.junit.migration;

import static xyz.keksdose.spoon.code_solver.history.MarkdownString.fromMarkdown;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.createAfterAllAnnotation;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.createBeforeAllAnnotation;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.createBeforeEachAnnotation;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.createDisableAnnotation;
import static xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper.getJunit4AfterClassAnnotation;

import java.util.Optional;

import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper;

public class Junit4AnnotationsTransformation extends TransformationProcessor<CtMethod<?>> {

	private static final String PROCESSOR_NAME = "Junit4AnnotationsTransformation";
	private static final String JUNIT5_BEFORE_EACH = "org.junit.jupiter.api.BeforeEach";
	private static final String JUNIT4_BEFORE = "org.junit.Before";
	private static final String JUNIT5_BEFORE_ALL = "org.junit.jupiter.api.BeforeAll";
	private static final String JUNIT4_BEFORE_CLASS = "org.junit.BeforeClass";
	private static final BadSmell JUNIT4_BEFORE_CLASS_BADSMELL = new BeforeClassBadSmell();
	private static final BadSmell JUNIT4_BEFORE_BADSMELL = new BeforeBadSmell();
	private static final BadSmell JUNIT4_AFTER_BADSMELL = new AfterBadSmell();
	private static final BadSmell JUNIT4_AFTER_CLASS_BADSMELL = new AfterClassBadSmell();
	private static final BadSmell JUNIT4_IGNORE_BADSMELL = new IgnoreBadSmell();

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
			replaceAnnotation(method, beforeClassAnnotation.get(), createBeforeAllAnnotation(getFactory()));
			String changeText = String.format("Replaced @BeforeClass annotation with @BeforeAll at method %s",
				method.getSimpleName());
			String markdownText = String.format("Replaced `@BeforeClass` annotation with `@BeforeAll` at method `%s`",
				method.getSimpleName());
			notifyChangeListener(method.getTopLevelType(), fromMarkdown(changeText, markdownText),
				JUNIT4_BEFORE_CLASS_BADSMELL);
		}
	}

	private void replaceAnnotation(CtMethod<?> method, CtAnnotation<?> oldAnnotation, CtAnnotation<?> newAnnotation) {
		method.removeAnnotation(oldAnnotation);
		method.addAnnotation(newAnnotation);
	}

	private void adjustImportsBeforeClass(CtMethod<?> method) {
		ImportHelper.removeImport(JUNIT4_BEFORE_CLASS, false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport(JUNIT5_BEFORE_ALL, false, method.getPosition().getCompilationUnit());
	}

	private void notifyChangeListener(CtType<?> declaringType, MarkdownString description, BadSmell badSmell) {
		setChanged(declaringType, new Change(badSmell, description, declaringType));
	}

	private void refactorBefore(CtMethod<?> method) {
		Optional<CtAnnotation<?>> beforeAnnotation = JunitHelper.getJunit4BeforeAnnotation(method);
		if (beforeAnnotation.isPresent()) {
			CtCompilationUnit compilationUnit = method.getPosition().getCompilationUnit();
			adjustImportsBefore(compilationUnit);
			replaceAnnotation(method, beforeAnnotation.get(), createBeforeEachAnnotation(getFactory()));
			String changeText = String.format("Replaced @Before annotation with @BeforeEach at method %s",
				method.getSimpleName());
			String markdownText = String.format("Replaced `@Before` annotation with `@BeforeEach` at method `%s`",
				method.getSimpleName());
			notifyChangeListener(method.getTopLevelType(), fromMarkdown(changeText, markdownText),
				JUNIT4_BEFORE_BADSMELL);
		}
	}

	private void adjustImportsBefore(CtCompilationUnit compilationUnit) {
		ImportHelper.removeImport(JUNIT4_BEFORE, false, compilationUnit);
		ImportHelper.addImport(JUNIT5_BEFORE_EACH, false, compilationUnit);
	}

	private void refactorAfter(CtMethod<?> method) {
		Optional<CtAnnotation<?>> afterAnnotation = JunitHelper.getJunit4AfterAnnotation(method);
		if (afterAnnotation.isPresent()) {
			adjustImportsAfter(method);
			replaceAnnotation(method, afterAnnotation.get(), JunitHelper.createAfterEachAnnotation(getFactory()));
			String changeText = String.format("Replaced @After annotation with @AfterEach at method %s",
				method.getSimpleName());
			String markdownText = String.format("Replaced `@After` annotation with `@AfterEach` at method `%s`",
				method.getSimpleName());
			notifyChangeListener(method.getTopLevelType(), fromMarkdown(changeText, markdownText),
				JUNIT4_AFTER_BADSMELL);
		}
	}

	private void adjustImportsAfter(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.After", true, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.AfterEach", false, method.getPosition().getCompilationUnit());
	}

	private void refactorAfterClass(CtMethod<?> method) {
		Optional<CtAnnotation<?>> afterClassAnnotation = getJunit4AfterClassAnnotation(method);
		if (afterClassAnnotation.isPresent()) {
			adjustImportsAfterClass(method);
			replaceAnnotation(method, afterClassAnnotation.get(), createAfterAllAnnotation(getFactory()));
			String changeText = String.format("Replaced @After annotation with @AfterEach at method %s",
				method.getSimpleName());
			String markdownText = String.format("Replaced `@After` annotation with `@AfterEach` at method `%s`",
				method.getSimpleName());
			notifyChangeListener(method.getTopLevelType(), fromMarkdown(changeText, markdownText),
				JUNIT4_AFTER_CLASS_BADSMELL);
		}
	}

	private void adjustImportsAfterClass(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.AfterClass", false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.AfterAll", false, method.getPosition().getCompilationUnit());
	}

	private void refactorIgnore(CtMethod<?> method) {
		Optional<CtAnnotation<?>> ignoreAnnotation = JunitHelper.getIgnoreAnnotation(method);
		if (ignoreAnnotation.isPresent()) {
			adjustImportsIgnore(method);
			CtAnnotation<?> disableAnnotation = createDisableAnnotation(getFactory());
			disableAnnotation.setValues(ignoreAnnotation.get().getValues());
			replaceAnnotation(method, ignoreAnnotation.get(), disableAnnotation);
			String changeText = String.format("Replaced @Ignore annotation with @Disabled at method %s",
				method.getSimpleName());
			String markdownText = String.format("Replaced `@Ignore` annotation with `@Disabled` at method `%s`",
				method.getSimpleName());
			notifyChangeListener(method.getTopLevelType(), fromMarkdown(changeText, markdownText),
				JUNIT4_IGNORE_BADSMELL);
		}
	}

	private void adjustImportsIgnore(CtMethod<?> method) {
		ImportHelper.removeImport("org.junit.Ignore", false, method.getPosition().getCompilationUnit());
		ImportHelper.addImport("org.junit.jupiter.api.Disabled", false, method.getPosition().getCompilationUnit());
	}

	private static final class BeforeClassBadSmell extends BadSmell {
		@Override
		public MarkdownString getDescription() {
			String rawText = "The JUnit 4 @BeforeClass annotation should be replaced JUnit junit 5 BeforeAll annotation.";
			String markdownText = "The JUnit 4 `@BeforeClass` annotation should be replaced with JUnit 5 `@BeforeAll` annotation.";
			return fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Junit4-@BeforeClass");
		}
	}

	private static final class BeforeBadSmell extends BadSmell {
		@Override
		public MarkdownString getDescription() {
			String rawText = "The JUnit 4 @Before annotation should be replaced JUnit junit 5 BeforeEach annotation.";
			String markdownText = "The JUnit 4 `@Before` annotation should be replaced with JUnit 5 `@BeforeEach` annotation.";
			return fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Junit4-@Before");
		}
	}

	private static final class AfterBadSmell extends BadSmell {
		@Override
		public MarkdownString getDescription() {
			String rawText = "The JUnit 4 @After annotation should be replaced JUnit 5 @AfterEach annotation.";
			String markdownText = "The JUnit 4 `@After` annotation should be replaced with JUnit 5 `@AfterEach` annotation.";
			return fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Junit4-@After");
		}
	}

	private static final class AfterClassBadSmell extends BadSmell {
		@Override
		public MarkdownString getDescription() {
			String rawText = "The JUnit 4 @AfterClass annotation should be replaced JUnit 5 @AfterAll annotation.";
			String markdownText = "The JUnit 4 `@AfterClass` annotation should be replaced with JUnit 5 `@AfterAll` annotation.";
			return fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Junit4-@AfterClass");
		}
	}

	private static final class IgnoreBadSmell extends BadSmell {

		@Override
		public MarkdownString getDescription() {
			String rawText = "The JUnit 4 @Ignore annotation should be replaced with JUnit 5 @Disabled annotation.";
			String markdownText = "The JUnit 4 `@Ignore` annotation should be replaced with JUnit 5 `@Disabled` annotation.";
			return fromMarkdown(rawText, markdownText);
		}

		@Override
		public MarkdownString getName() {
			return MarkdownString.fromRaw("Junit4-@Ignore");
		}

	}
}
