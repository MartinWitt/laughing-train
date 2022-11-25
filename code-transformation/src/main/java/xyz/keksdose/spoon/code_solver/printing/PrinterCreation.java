package xyz.keksdose.spoon.code_solver.printing;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import spoon.compiler.Environment;
import spoon.processing.Processor;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.ImportConflictDetector;
import spoon.reflect.visitor.PrettyPrinter;
import xyz.keksdose.spoon.code_solver.spoon.FragmentAwareChangeCollector;
import xyz.keksdose.spoon.code_solver.spoon.ImportAwareSniperPrinter;
import xyz.keksdose.spoon.code_solver.spoon.SelectiveForceImport;

public class PrinterCreation {
    public static void setPrettyPrinter(Environment env, CtModel model) {
        new FragmentAwareChangeCollector().attachTo(env);
        Supplier<? extends DefaultJavaPrettyPrinter> basePrinterCreator = createSniperPrinter(env);
        Supplier<PrettyPrinter> configuredPrinterCreator = applyCommonPrinterOptions(basePrinterCreator, model);
        env.setPrettyPrinterCreator(configuredPrinterCreator);
    }

    private static Supplier<PrettyPrinter> applyCommonPrinterOptions(
            Supplier<? extends DefaultJavaPrettyPrinter> prettyPrinterCreator, CtModel model) {
        Collection<CtTypeReference<?>> existingReferences = model.getElements(e -> true);
        List<Processor<CtElement>> preprocessors = List.of( // new ImportCleaning()
                new SelectiveForceImport(existingReferences), new ImportConflictDetector()
                // new ImportGrouper(new SpoonStyle())
                // )
                );
        return () -> {
            DefaultJavaPrettyPrinter printer = prettyPrinterCreator.get();
            printer.setIgnoreImplicit(false);
            printer.setPreprocessors(preprocessors);
            return printer;
        };
    }

    private static Supplier<? extends DefaultJavaPrettyPrinter> createSniperPrinter(Environment env) {
        env.setCommentEnabled(true);
        env.useTabulations(true);
        env.setTabulationSize(4);
        env.setPreserveLineNumbers(false);
        return () -> new ImportAwareSniperPrinter(env);
    }

    private PrinterCreation() {
        // UtilityClass
    }
}
