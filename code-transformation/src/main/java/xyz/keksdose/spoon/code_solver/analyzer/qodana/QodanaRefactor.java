
package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryReturn;
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

	public QodanaRefactor(ChangeListener listener) {
		super(listener);
		this.listener = listener;
		refactorings = new ArrayList<>();
		ruleParser = new HashMap<>();
		ruleParser.put("UnnecessaryReturn", UnnecessaryReturn::new);
	}

	/**
	 * Analyses the source code in the given source root 
	 * @param projectRoot  The root of the project which should be analysed.
	 */
	public void run(Path projectRoot) {
		List<Result> results = new QodanaRunner().runQodana(projectRoot);
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

}
