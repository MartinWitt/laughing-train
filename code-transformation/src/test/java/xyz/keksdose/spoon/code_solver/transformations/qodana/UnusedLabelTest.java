package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedLabel;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class UnusedLabelTest {
    @Test
    void unusedLabelErrorProne(@TempDir File dir) throws IOException {
        Position position = new Position(90, 0, 10, 0, 62, 8);
        AnalyzerResult result = new TestAnalyzerResult("ClassNewInstance.java", position);
        String resourcePath = "projects/refactorings/UnusedLabel/ClassNewInstance.java";
        var copy = TransformationTestUtils.transform(new UnusedLabel(result), resourcePath, dir);
        TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
    }
}
