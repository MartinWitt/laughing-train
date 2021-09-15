
package xyz.keksdose.spoon.code_solver;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import com.google.common.flogger.FluentLogger;
import spoon.Launcher;
import spoon.compiler.Environment;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.ImportConflictDetector;
import spoon.reflect.visitor.PrettyPrinter;
import spoon.support.QueueProcessingManager;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.spoon.ImportAwareSniperPrinter;
import xyz.keksdose.spoon.code_solver.spoon.ImportCleaner;
import xyz.keksdose.spoon.code_solver.spoon.ImportComparator;
import xyz.keksdose.spoon.code_solver.spoon.ImportGrouper;
import xyz.keksdose.spoon.code_solver.spoon.SelectiveForceImport;
import xyz.keksdose.spoon.code_solver.transformations.junit.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.TestAnnotation;

public class TransformationEngine {

	private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

	private TransformationEngine() {

	}

	public static Changelog applyToGivenPath(String path) throws IOException {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = setEnvironmentOptions(launcher);
		launcher.addInputResource(path);
		CtModel model = launcher.buildModel();
		setPrettyPrinter(environment, model);
		ProcessingManager pm = new QueueProcessingManager(launcher.getFactory());
		ChangeListener listener = new ChangeListener();
		do {
			listener.reset();
			pm.addProcessor(new TestAnnotation(listener));
			pm.addProcessor(new ExpectedExceptionRemoval(listener));
			pm.addProcessor(new AssertionsTransformation(listener));
			pm.process(model.getAllTypes());
		} while (listener.isChanged());
		Collection<CtType<?>> newTypes = model.getAllTypes();
		printChangedTypes(environment.createPrettyPrinter(), listener, newTypes);
		return listener.getChangelog();
	}

	public static Changelog applyToGivenPath(String path, String typeName) throws IOException {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = setEnvironmentOptions(launcher);
		launcher.addInputResource(path);
		CtModel model = launcher.buildModel();
		setPrettyPrinter(environment, model);
		ProcessingManager pm = new QueueProcessingManager(launcher.getFactory());
		ChangeListener listener = new ChangeListener();
		do {
			listener.reset();
			pm.addProcessor(new TestAnnotation(listener));
			pm.addProcessor(new ExpectedExceptionRemoval(listener));
			pm.addProcessor(new AssertionsTransformation(listener));
			pm.addProcessor(new Junit4AnnotationsTransformation(listener));
			pm.process(model.getAllTypes());
		} while (listener.isChanged());
		Collection<CtType<?>> newTypes = getTypesWithName(typeName, model);

		printChangedTypes(environment.createPrettyPrinter(), listener, newTypes);
		return listener.getChangelog();
	}

	private static List<CtType<?>> getTypesWithName(String typeName, CtModel model) {
		return model.getAllTypes().stream().filter(v -> v.getSimpleName().equals(typeName)).toList();
	}

	private static void printChangedTypes(PrettyPrinter prettyPrinter, ChangeListener listener,
			Collection<CtType<?>> newTypes) {
		for (CtType<?> type : newTypes) {
			if (type.getPosition().getFile() == null || !listener.isChanged(type)) {
				continue;
			}
			try {
				Files.writeString(type.getPosition().getFile().toPath(), prettyPrinter.printTypes(type));
			}
			catch (Throwable e) {
				LOGGER.atSevere().withCause(e).log("Could not write file %s", type.getQualifiedName());
			}
		}
	}

	private static Environment setEnvironmentOptions(Launcher launcher) {
		Environment environment = launcher.getEnvironment();
		environment.setNoClasspath(true);
		environment.setIgnoreDuplicateDeclarations(true);
		environment.setIgnoreSyntaxErrors(true);
		environment.setPrettyPrinterCreator(() -> new ImportAwareSniperPrinter(environment));
		return environment;
	}

	private static void setPrettyPrinter(Environment env, CtModel model) {
		Supplier<? extends DefaultJavaPrettyPrinter> basePrinterCreator = createSniperPrinter(env);
		Supplier<PrettyPrinter> configuredPrinterCreator = applyCommonPrinterOptions(basePrinterCreator, model);
		env.setPrettyPrinterCreator(configuredPrinterCreator);
	}

	private static Supplier<PrettyPrinter> applyCommonPrinterOptions(
			Supplier<? extends DefaultJavaPrettyPrinter> prettyPrinterCreator, CtModel model) {
		Collection<CtTypeReference<?>> existingReferences = model.getElements(e -> true);
		List<Processor<CtElement>> preprocessors = List.of(//new ImportCleaning()
			new SelectiveForceImport(existingReferences), new ImportConflictDetector(),
			new ImportCleaner().setImportComparator(new ImportComparator()), new ImportGrouper()
		// )
		);
		return () -> {
			DefaultJavaPrettyPrinter printer = prettyPrinterCreator.get();
			printer.setIgnoreImplicit(false);
			printer.setPreprocessors(preprocessors);
			return printer;
		};
	}

	private static Supplier<? extends DefaultJavaPrettyPrinter> createSniperPrinter(Environment env) {
		env.setCommentEnabled(true);
		env.useTabulations(true);
		env.setTabulationSize(4);
		env.setPreserveLineNumbers(false);
		return () -> new ImportAwareSniperPrinter(env);
	}
}
