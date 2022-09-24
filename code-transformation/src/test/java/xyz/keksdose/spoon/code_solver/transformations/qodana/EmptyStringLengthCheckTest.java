package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.SizeReplaceableByIsEmpty;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class EmptyStringLengthCheckTest {
    @Test
    void simpleIsEmptyCheck(@TempDir File dir) throws IOException {
        Position position = new Position(5, 0, 10, 0, 62, 8);
        AnalyzerResult result = new TestAnalyzerResult("Foo.java", position);
        String resourcePath = "projects/refactorings/EmptyStringLengthCheck/Foo.java";
        var copy = TransformationTestUtils.transform(new SizeReplaceableByIsEmpty(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }
}
