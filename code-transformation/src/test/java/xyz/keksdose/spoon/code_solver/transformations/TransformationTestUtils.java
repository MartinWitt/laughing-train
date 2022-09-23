package xyz.keksdose.spoon.code_solver.transformations;

import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.TestHelper;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

/**
 * This class provides some helper methods for testing transformations.
 */
public class TransformationTestUtils {

    private TransformationTestUtils() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * Transforms the given resource with the given refactoring. The result is written to a temporary file
     * @param refactoring  the refactoring to apply to the resource
     * @param resourcePath  the path to the resource to transform
     * @param tempRoot  the root directory for the temporary file
     * @return  the path to the transformed resource
     * @throws IOException if the resource cannot be read or the temporary file cannot be written
     */
    public static File transform(AbstractRefactoring refactoring, String resourcePath, File tempRoot)
            throws IOException {
        ChangeListener listener = new ChangeListener();
        Function<ChangeListener, TransformationProcessor<?>> processor = convertToFunction(refactoring);
        TransformationEngine engine = new TransformationEngine(List.of(processor));
        engine.setChangeListener(listener);
        File copy = TestHelper.createCopy(
                tempRoot, resourcePath, Path.of(resourcePath).getFileName().toString());
        engine.applyToGivenPath(copy.getAbsolutePath());
        return copy;
    }

    private static Function<ChangeListener, TransformationProcessor<?>> convertToFunction(
            AbstractRefactoring refactoring) {
        return v -> new TransformationProcessor<CtType<?>>(v) {

            @Override
            public void process(CtType<?> element) {
                refactoring.refactor(v, element);
            }
        };
    }
    /**
     * compares the content of the given file with the content of the resource.".correct" is appended to the resource path.
     * @param actual the file to compare with the resource
     * @param pathToExpected  the path to the resource
     */
    public static void compareContent(File actual, String pathToExpected) {
        assertThat(actual).hasSameTextualContentAs(TestHelper.getResources(Path.of(pathToExpected + ".correct")));
    }
}
