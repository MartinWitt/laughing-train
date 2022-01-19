
package xyz.keksdose.spoon.code_solver;

import java.nio.file.Files;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
import xyz.keksdose.spoon.code_solver.formatting.ImportGrouper;
import xyz.keksdose.spoon.code_solver.formatting.NewLineImportGroups;
import xyz.keksdose.spoon.code_solver.formatting.SpoonStyle;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.spoon.FragmentAwareChangeCollector;
import xyz.keksdose.spoon.code_solver.spoon.ImportAwareSniperPrinter;
import xyz.keksdose.spoon.code_solver.spoon.ImportCleaner;
import xyz.keksdose.spoon.code_solver.spoon.ImportComparator;
import xyz.keksdose.spoon.code_solver.spoon.SelectiveForceImport;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertThatTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.TestAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.TempoaryFolderAsParameter;
import xyz.keksdose.spoon.code_solver.transformations.qodana.ArraysToString;
import xyz.keksdose.spoon.code_solver.transformations.qodana.EmptyStringCheck;
import xyz.keksdose.spoon.code_solver.transformations.self.StringBuilderDirectUse;

public class TransformationEngine {

	private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

	public Changelog applyToGivenPath(String path, RunMode runState) {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = setEnvironmentOptions(launcher);
		addInput(path, launcher);
		CtModel model = launcher.buildModel();
		setPrettyPrinter(environment, model);
		ProcessingManager pm = new QueueProcessingManager(launcher.getFactory());
		ChangeListener listener = new ChangeListener();
		do {
			listener.reset();
			addProcessors(pm, listener);
			pm.process(model.getAllTypes());
		} while (listener.isChanged());
		Collection<CtType<?>> newTypes = model.getAllTypes();
		if (runState != RunMode.DRY_RUN) {
			printChangedTypes(environment.createPrettyPrinter(), listener, newTypes);
		}
		return listener.getChangelog();
	}

	protected void addInput(String path, Launcher launcher) {
		launcher.addInputResource(path);
	}

	protected void addProcessors(ProcessingManager pm, ChangeListener listener) {
		pm.addProcessor(new ExpectedExceptionRemoval(listener));
		pm.addProcessor(new Junit4AnnotationsTransformation(listener));
		pm.addProcessor(new TestAnnotation(listener));
		pm.addProcessor(new AssertThatTransformation(listener));
		pm.addProcessor(new AssertionsTransformation(listener));
		pm.addProcessor(new TempoaryFolderAsParameter(listener));
		pm.addProcessor(new ArraysToString(listener));
		pm.addProcessor(new EmptyStringCheck(listener));
		pm.addProcessor(new StringBuilderDirectUse(listener));
		// pm.addProcessor(new AssertTrueEqualsCheck(listener));
		// pm.addProcessor(new AssertFalseEqualsCheck(listener));
		// pm.addProcessor(new AssertNullTransformation(listener));
		// pm.addProcessor(new AssertNotNullTransformation(listener));
		// pm.addProcessor(new AssertTrueSameCheck(listener));
		// pm.addProcessor(new AssertFalseSameCheck(listener));
		// pm.addProcessor(new UnusedAssignment(listener));
		// pm.addProcessor(new UnusedLocalVariable(listener));

	}

	public Changelog applyToGivenPath(String path, String typeName, RunMode runState) {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = setEnvironmentOptions(launcher);
		addInput(path, launcher);
		CtModel model = launcher.buildModel();
		setPrettyPrinter(environment, model);
		ProcessingManager pm = new QueueProcessingManager(launcher.getFactory());
		ChangeListener listener = new ChangeListener();
		Collection<CtType<?>> newTypes = getTypesWithName(typeName, model);

		do {
			listener.reset();
			addProcessors(pm, listener);
			pm.process(newTypes);
		} while (listener.isChanged());
		if (runState != RunMode.DRY_RUN) {
			printChangedTypes(environment.createPrettyPrinter(), listener, newTypes);
		}
		return listener.getChangelog();
	}

	private static List<CtType<?>> getTypesWithName(String typeName, CtModel model) {
		return model.getAllTypes()
				.stream()
				.filter(v -> v.getSimpleName().equals(typeName))
				.collect(Collectors.toList());
	}

	protected void printChangedTypes(PrettyPrinter prettyPrinter, ChangeListener listener,
			Iterable<CtType<?>> newTypes) {
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
		new FragmentAwareChangeCollector().attachTo(env);
		Supplier<? extends DefaultJavaPrettyPrinter> basePrinterCreator = createSniperPrinter(env);
		Supplier<PrettyPrinter> configuredPrinterCreator = applyCommonPrinterOptions(basePrinterCreator, model);
		env.setPrettyPrinterCreator(configuredPrinterCreator);
	}

	private static Supplier<PrettyPrinter> applyCommonPrinterOptions(
			Supplier<? extends DefaultJavaPrettyPrinter> prettyPrinterCreator, CtModel model) {
		Collection<CtTypeReference<?>> existingReferences = model.getElements(e -> true);
		List<Processor<CtElement>> preprocessors = List.of(//new ImportCleaning()
			new SelectiveForceImport(existingReferences), new ImportConflictDetector(),
			new ImportCleaner().setImportComparator(new ImportComparator())
					.setCanAddImports(false)
					.setCanRemoveImports(false),
			new ImportGrouper(new SpoonStyle())
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
