package xyz.keksdose.spoon.code_solver;

import com.google.common.flogger.FluentLogger;
import java.util.Collection;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

/**
 * This class is responsible for applying the transformations to the given elements, till no more changes are detected.
 * The transformations are applied in the order they are added to the TransformationEngine.
 * Use {@link #process(Collection)} to apply the transformations to the given elements.
 */
public class RepeatingProcessingManager extends QueueProcessingManager {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private final ChangeListener listener;
    private int iteration = 0;

    public RepeatingProcessingManager(Factory factory, ChangeListener listener) {
        super(factory);
        this.listener = listener;
    }

    @Override
    public void process(Collection<? extends CtElement> elements) {
        do {
            listener.reset();
            logger.atInfo().log("Starting iteration %d", iteration++);
            super.process(elements);
            logger.atInfo().log("Finished iteration %d", iteration);
        } while (listener.isChanged());
    }
}
