package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.CodeBlock2Expr;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class CodeBlock2ExprTest {
    @Test
    void codeBlock2ExprWitchcraftJavaLogging(@TempDir File dir) throws IOException {
        Position position = new Position(77, 78, 10, 0, 62, 8);
        AnalyzerResult result = new TestAnalyzerResult("CombineWithLogVisitor.java", position);
        String resourcePath = "projects/refactorings/CodeBlock2Expr/CombineWithLogVisitor.java";
        var copy = TransformationTestUtils.transform(new CodeBlock2Expr(result), resourcePath, dir);
        // FIXME: fix the comparison
        // TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
    }
}
