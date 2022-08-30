package xyz.keksdose.spoon.code_solver.transformations.qodana;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class BooleanExpression extends TransformationProcessor<CtBinaryOperator<?>> {

    public BooleanExpression(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtBinaryOperator<?> element) {
        if (element.getKind().equals(BinaryOperatorKind.EQ)) {
            if (element.getRightHandOperand().toString().equals("true")) {
                element.replace(element.getLeftHandOperand());
                setChanged(
                        element.getParent(CtType.class),
                        new Change("BooleanExpression", "BooleanExpression", element.getParent(CtType.class)));
                return;
            }
            if (element.getRightHandOperand().toString().equals("false")) {
                CtUnaryOperator<Boolean> op = getFactory().createUnaryOperator();
                op.setOperand((CtExpression<Boolean>) element.getLeftHandOperand());
                op.setKind(UnaryOperatorKind.NOT);
                element.replace(op);
                setChanged(
                        element.getParent(CtType.class),
                        new Change("BooleanExpression", "BooleanExpression", element.getParent(CtType.class)));
            }
        }
    }
}
