
package xyz.keksdose.spoon.code_solver;

import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public interface TransformationCreator extends Function<ChangeListener, TransformationProcessor<?>> {

}
