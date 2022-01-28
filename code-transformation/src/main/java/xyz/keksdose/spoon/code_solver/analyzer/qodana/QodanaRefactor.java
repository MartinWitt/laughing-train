
package xyz.keksdose.spoon.code_solver.analyzer.qodana;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryReturn;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

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

	public void run(Path sourceFiles) {
		List<Result> results = new QodanaRunner().runQodana(sourceFiles);
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
