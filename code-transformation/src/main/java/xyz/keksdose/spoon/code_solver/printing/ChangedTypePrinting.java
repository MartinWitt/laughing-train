package xyz.keksdose.spoon.code_solver.printing;

import com.google.common.flogger.FluentLogger;
import java.nio.file.Files;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.PrettyPrinter;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public class ChangedTypePrinting implements IPrinting {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private PrettyPrinter prettyPrinter;

    public ChangedTypePrinting(PrettyPrinter prettyPrinter) {
        this.prettyPrinter = prettyPrinter;
    }

    public void printChangedTypes(ChangeListener listener, Iterable<CtType<?>> newTypes) {
        for (CtType<?> type : newTypes) {
            if (type.getPosition().getFile() == null || !listener.isChanged(type)) {
                continue;
            }
            try {
                Files.writeString(type.getPosition().getFile().toPath(), prettyPrinter.printTypes(type));
            } catch (Throwable e) {
                logger.atSevere().withCause(e).log("Could not write file %s", type.getQualifiedName());
            }
        }
    }
}
