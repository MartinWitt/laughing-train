package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ToArrayCallWithZeroLengthArrayArgument;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class ToArrayCallWithZeroLengthArrayArgumentTest {

    @Test
    void spoonTreeBuilderCompiler(@TempDir File dir) throws IOException {
        Position position = new Position(136, 0, 136, 0, 4526, 0);
        AnalyzerResult result = new TestAnalyzerResult("TreeBuilderCompiler.java", position);
        String resourcePath = "projects/refactorings/ToArrayCallWithZeroLengthArrayArgument/TreeBuilderCompiler.java";
        var copy = TransformationTestUtils.transform(
                new ToArrayCallWithZeroLengthArrayArgument(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }
}
