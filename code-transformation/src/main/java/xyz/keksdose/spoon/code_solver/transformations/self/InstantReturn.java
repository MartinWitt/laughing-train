
package xyz.keksdose.spoon.code_solver.transformations.self;

import java.util.List;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class InstantReturn extends TransformationProcessor<CtMethod<?>> {

	public InstantReturn(ChangeListener listener) {
		super(listener);
	}

	@Override
	public void process(CtMethod<?> element) {
		CtBlock<?> body = element.getBody();
		List<CtReturn<?>> returnStatements = body.getElements(new TypeFilter<>(CtReturn.class));
		for (CtReturn<?> ctReturn : returnStatements) {
			int index = body.getStatements().indexOf(ctReturn);
			if (index != -1) {
				CtStatement statement = body.getStatement(index);
				if (statement instanceof CtAssignment) {
					CtAssignment<?, ?> assignment = (CtAssignment<?, ?>) statement;
					if (assignment.getAssigned().equals(ctReturn.getReturnedExpression())) {
						ctReturn.setReturnedExpression((CtExpression) assignment.getAssignment());
						//setChanged(element, new Change("Removed return", "InstantReturn", element));
					}
				}
			}
		}

		if (element.getBody().getLastStatement() instanceof CtReturn) {
			CtReturn<?> returnStatement = (CtReturn<?>) element.getBody().getLastStatement();
			int size = body.getStatements().size();
			CtStatement statement = body.getStatement(size - 2);
			if (statement instanceof CtIf) {
				CtIf ifStatement = (CtIf) statement;
				CtStatement thenStatement = ifStatement.getThenStatement();
				if (thenStatement instanceof CtBlock) {
					CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
					if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
						CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);

					}
				}
				//if(ifStatement.getThenStatement() instance.getStatements().size()==1 && ifStatement.getBody().getStatement(0) instanceof CTReturn) {

			}
		}
		//setChanged(element, new Change("Added return statement", "InstantReturn", element));
	}
	//setChanged(element.getDeclaringType(), new Change("Removed return statement", "InstantReturn", element.getDeclaringType()));
}
