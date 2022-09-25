package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryToStringCall;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class UnnecessaryToStringCallTest {

    @Test
    void spoonPatternBuilderHelper(@TempDir File dir) throws IOException {
        Position position = new Position(122, 0, 127, 0, 4526, 0);
        AnalyzerResult result = new TestAnalyzerResult("PatternBuilderHelper.java", position);
        String resourcePath = "projects/refactorings/UnnecessaryToStringCall/PatternBuilderHelper.java";
        var copy = TransformationTestUtils.transform(new UnnecessaryToStringCall(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }
}
