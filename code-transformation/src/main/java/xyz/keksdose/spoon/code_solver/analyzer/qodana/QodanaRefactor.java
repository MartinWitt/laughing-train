
package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.MethodMayBeStatic;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.NonProtectedConstructorInAbstractClass;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ParameterNameDiffersFromOverriddenParameter;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryInterfaceModifier;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryLocalVariable;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryReturn;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryToStringCall;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedImport;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

/**
 * This aggreates all qodana refactorings and wraps them in a single processor.
 * Use {@link run(Path, ChangeListener)} to analyse the source code.
 * <b> Note: </b> This requires a running docker host and can take some minutes.
 */
public class QodanaRefactor extends TransformationProcessor<CtType<?>> {

	private ChangeListener listener;
	private Map<String, Function<Result, AbstractRefactoring>> ruleParser;
	private List<AbstractRefactoring> refactorings;
	private List<Consumer<QodanaRunner.Builder>> settings = new ArrayList<>();

	private QodanaRefactor(Builder builder) {
		super(builder.listener);
		refactorings = new ArrayList<>();
		this.listener = builder.listener;
		this.ruleParser = builder.ruleParser;
		this.settings.addAll(builder.settings);
	}

	public QodanaRefactor(ChangeListener listener) {
		super(listener);
		this.listener = listener;
		refactorings = new ArrayList<>();
		ruleParser = new HashMap<>();
		ruleParser.put("UnnecessaryReturn", UnnecessaryReturn::new);
		ruleParser.put("UnnecessaryToStringCall", UnnecessaryToStringCall::new);
		ruleParser.put("NonProtectedConstructorInAbstractClass", NonProtectedConstructorInAbstractClass::new);
		ruleParser.put("UnnecessaryInterfaceModifier", UnnecessaryInterfaceModifier::new);
		ruleParser.put("ParameterNameDiffersFromOverriddenParameter", ParameterNameDiffersFromOverriddenParameter::new);
		ruleParser.put("MethodMayBeStatic", MethodMayBeStatic::new);

	}

	/**
	 * Analyses the source code in the given source root 
	 * @param projectRoot  The root of the project which should be analysed.
	 */
	public void run(Path projectRoot) {
		var runnerBuilder = new QodanaRunner.Builder();
		settings.forEach(s -> s.accept(runnerBuilder));
		QodanaRunner runner = runnerBuilder.build();
		List<Result> results = runner.runQodana(projectRoot);
		for (Result result : results) {
			var parser = ruleParser.get(result.getRuleId());
			if (parser != null) {
				refactorings.add(parser.apply(result));
			}
		}
	}

	/**
	* Analyses the source code in the given source root 
	* @param projectRoot  The root of the project which should be analysed.
	*/
	public void run(Path projectRoot, String srcPath) {
		QodanaRunner runner = new QodanaRunner.Builder().withSourceFileRoot(srcPath).build();
		List<Result> results = runner.runQodana(projectRoot);
		for (Result result : results) {
			var parser = ruleParser.get(result.getRuleId());
			if (parser != null) {
				refactorings.add(parser.apply(result));
			}
		}
	}

	@Override
	public void process(CtType<?> type) {
		for (AbstractRefactoring refactoring : refactorings) {
			refactoring.refactor(listener, type);
		}
	}

	public static class Builder {

		private ChangeListener listener;
		private Map<String, Function<Result, AbstractRefactoring>> ruleParser = new HashMap<>();
		private List<Consumer<QodanaRunner.Builder>> settings = new ArrayList<>();
		public Builder(ChangeListener listener) {
			this.listener = listener;
		}

		public Builder withUnnecessaryReturn() {
			ruleParser.put("UnnecessaryReturn", UnnecessaryReturn::new);
			return this;
		}

		public Builder withUnnecessaryToStringCall() {
			ruleParser.put("UnnecessaryToStringCall", UnnecessaryToStringCall::new);
			return this;
		}

		public Builder withNonProtectedConstructorInAbstractClass() {
			ruleParser.put("NonProtectedConstructorInAbstractClass", NonProtectedConstructorInAbstractClass::new);
			return this;
		}

		public Builder withUnnecessaryInterfaceModifier() {
			ruleParser.put("UnnecessaryInterfaceModifier", UnnecessaryInterfaceModifier::new);
			return this;
		}

		public Builder withParameterNameDiffersFromOverriddenParameter() {
			ruleParser.put("ParameterNameDiffersFromOverriddenParameter",
				ParameterNameDiffersFromOverriddenParameter::new);
			return this;
		}

		public Builder withMethodMayBeStatic() {
			ruleParser.put("MethodMayBeStatic", MethodMayBeStatic::new);
			return this;
		}

		public Builder withUnnecessaryLocalVariable() {
			ruleParser.put("UnnecessaryLocalVariable", UnnecessaryLocalVariable::new);
			return this;
		}

		public Builder withUnusedImport() {
			ruleParser.put("UNUSED_IMPORT", UnusedImport::new);
			return this;
		}

		public Builder withResultFolder(String resultFolder) {
			settings.add(builder -> builder.withResultFolder(resultFolder));
			return this;
		}

		public Builder withCacheFolder(String cacheFolder) {
			settings.add(builder -> builder.withCacheFolder(cacheFolder));
			return this;
		}

		public Builder withQodanaImageName(String qodanaImageName) {
			settings.add(builder -> builder.withQodanaImageName(qodanaImageName));
			return this;
		}

		public Builder withRemoveResultDir(boolean removeResultDir) {
			settings.add(builder -> builder.withRemoveResultDir(removeResultDir));
			return this;
		}

		public Builder withSourceFileRoot(String sourceFileRoot) {
			settings.add(builder -> builder.withSourceFileRoot(sourceFileRoot));
			return this;
		}

		public QodanaRefactor build() {
			return new QodanaRefactor(this);
		}

	}

}
