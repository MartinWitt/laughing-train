
package xyz.keksdose.spoon.code_solver;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.flogger.FluentLogger;

import spoon.Launcher;
import spoon.compiler.Environment;
import spoon.processing.ProcessingManager;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.printing.ChangedTypePrinting;
import xyz.keksdose.spoon.code_solver.printing.EnvironmentOptions;
import xyz.keksdose.spoon.code_solver.printing.IPrinting;
import xyz.keksdose.spoon.code_solver.printing.PrinterCreation;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertThatTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.TestAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.TempoaryFolderAsParameter;
import xyz.keksdose.spoon.code_solver.transformations.qodana.ArraysToString;
import xyz.keksdose.spoon.code_solver.transformations.qodana.EmptyStringCheck;
import xyz.keksdose.spoon.code_solver.transformations.qodana.StaticAccess;
import xyz.keksdose.spoon.code_solver.transformations.self.LambdaToExecutableReference;
import xyz.keksdose.spoon.code_solver.transformations.self.StringBuilderDirectUse;
import xyz.keksdose.spoon.code_solver.transformations.self.ThreadLocalWithInitial;

public class TransformationEngine {

	private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();
	private List<Function<ChangeListener, TransformationProcessor<?>>> processors;
	private IPrinting printing;
	public TransformationEngine(List<Function<ChangeListener, TransformationProcessor<?>>> processors) {
		this.processors = processors;
	}

	public TransformationEngine() {
		this.processors = List.of(StringBuilderDirectUse::new, ThreadLocalWithInitial::new,
			TempoaryFolderAsParameter::new, EmptyStringCheck::new, ArraysToString::new,
			Junit4AnnotationsTransformation::new, TestAnnotation::new, AssertionsTransformation::new,
			AssertThatTransformation::new, ExpectedExceptionRemoval::new, StaticAccess::new);
	}

	public TransformationEngine setPrinting(IPrinting printing) {
		this.printing = printing;
		return this;
	}

	public Changelog applyToGivenPath(String path) {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = EnvironmentOptions.setEnvironmentOptions(launcher);
		addInput(path, launcher);
		CtModel model = launcher.buildModel();
		if (printing == null) {
			printing = new ChangedTypePrinting(environment.createPrettyPrinter());
		}
		PrinterCreation.setPrettyPrinter(environment, model);
		ChangeListener listener = new ChangeListener();
		ProcessingManager pm = new RepeatingProcessingManager(launcher.getFactory(), listener);
		addProcessors(pm, listener);
		pm.process(model.getAllTypes());
		Collection<CtType<?>> newTypes = model.getAllTypes();
		printing.printChangedTypes(listener, newTypes);
		return listener.getChangelog();
	}

	protected void addInput(String path, Launcher launcher) {
		launcher.addInputResource(path);
	}

	private void addProcessors(ProcessingManager pm, ChangeListener listener) {
		processors.forEach(p -> pm.addProcessor(p.apply(listener)));
	}

	public Changelog applyToGivenPath(String path, String typeName) {
		LOGGER.atInfo().log("Applying transformations to %s", path);
		Launcher launcher = new Launcher();
		Environment environment = EnvironmentOptions.setEnvironmentOptions(launcher);
		addInput(path, launcher);
		CtModel model = launcher.buildModel();
		PrinterCreation.setPrettyPrinter(environment, model);
		if (printing == null) {
			printing = new ChangedTypePrinting(environment.createPrettyPrinter());
		}
		ChangeListener listener = new ChangeListener();
		ProcessingManager pm = new RepeatingProcessingManager(launcher.getFactory(), listener);
		Collection<CtType<?>> newTypes = getTypesWithName(typeName, model);
		addProcessors(pm, listener);
		pm.process(newTypes);
		printing.printChangedTypes(listener, newTypes);
		return listener.getChangelog();
	}

	private static List<CtType<?>> getTypesWithName(String typeName, CtModel model) {
		return model.getAllTypes()
				.stream()
				.filter(v -> v.getSimpleName().equals(typeName))
				.collect(Collectors.toList());
	}

}
