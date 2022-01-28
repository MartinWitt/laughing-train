
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.List;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public class UnnecessaryReturn extends AbstractRefactoring {

	public UnnecessaryReturn(Result result) {
		super(result);
	}

	@Override
	public void refactor(ChangeListener listener, CtType<?> type) {
		List<CtReturn<?>> returns = type.getElements(new TypeFilter<>(CtReturn.class));
		if (type.isAnonymous()) {
			return;
		}
		if (!type.getPosition()
				.getCompilationUnit()
				.getFile()
				.toPath()
				.endsWith(Path.of(result.getLocations().get(0).getPhysicalLocation().getArtifactLocation().getUri()))) {
			return;
		}
		for (CtReturn<?> returnStatement : returns) {
			if (returnStatement.getPosition().getSourceStart() == result.getLocations()
					.get(0)
					.getPhysicalLocation()
					.getRegion()
					.getCharOffset()) {
				returnStatement.delete();
				listener.setChanged(type, new Change(result.getRuleId(), result.getMessage().getText(), type));
			}
		}
	}
}
