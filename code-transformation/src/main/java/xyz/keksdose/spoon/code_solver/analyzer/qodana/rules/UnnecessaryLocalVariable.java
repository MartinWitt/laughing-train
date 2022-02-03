
package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.contrastsecurity.sarif.Result;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtVariableRead;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryLocalVariable extends AbstractRefactoring {

	public UnnecessaryLocalVariable(Result result) {
		super(result);
	}

	@Override
	public void refactor(ChangeListener listener, CtType<?> type) {
		if (type.isAnonymous() || !isSameType(type,
			Path.of(result.getLocations().get(0).getPhysicalLocation().getArtifactLocation().getUri()))) {
			return;
		}
		int startLocation = result.getLocations().get(0).getPhysicalLocation().getRegion().getStartLine();
		for (CtBlock<?> block : type.getElements(new TypeFilter<>(CtBlock.class))) {
			for (CtStatement statement : new ArrayList<>(block.getStatements())) {
				if (statement.getPosition().isValidPosition() && statement.getPosition().getLine() == startLocation) {
					int index = block.getStatements().indexOf(statement);
					if (block.getStatements().size() > index + 1
							&& block.getStatements().get(index + 1) instanceof CtReturn) {
						CtReturn<?> ctReturn = (CtReturn<?>) block.getStatements().get(index + 1);
						if (ctReturn.getReturnedExpression() instanceof CtVariableRead) {
							ctReturn.setReturnedExpression(
								(CtExpression) ((CtLocalVariable<?>) statement).getDefaultExpression());
							block.getStatements().remove(index);
							listener.setChanged(type.getTopLevelType(),
								new Change("null", "null", type.getTopLevelType()));
						}
					}
				}
			}
		}
	}

	@Override
	public List<BadSmell> getHandledBadSmells() {
		return List.of();
	}

}
