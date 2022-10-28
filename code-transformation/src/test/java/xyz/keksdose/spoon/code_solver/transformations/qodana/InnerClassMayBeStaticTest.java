package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.InnerClassMayBeStatic;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class InnerClassMayBeStaticTest {

    @Test
    void landLordInnerClassMabyBeStatic(@TempDir File dir) throws IOException {
        Position position = new Position(296, 0, 0, 0, 0, 80);
        AnalyzerResult result = new TestAnalyzerResult("Landlordbase.java", position);
        String resourcePath = "projects/refactorings/InnerClassMayBeStatic/Landlordbase.java";
        var copy = TransformationTestUtils.transform(new InnerClassMayBeStatic(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }
}
