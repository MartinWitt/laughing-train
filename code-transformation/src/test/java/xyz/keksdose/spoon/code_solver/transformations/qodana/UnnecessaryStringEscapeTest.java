package xyz.keksdose.spoon.code_solver.transformations.qodana;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryStringEscape;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class UnnecessaryStringEscapeTest {
    @Test
    void spoonTokenPrinterEvent(@TempDir File dir) throws IOException {
        Position position = new Position(72, 0, 27, 0, 1927, 2);
        AnalyzerResult result = new TestAnalyzerResult(
                "UnnecessaryStringEscape", "TokenPrinterEvent.java", position, "`\'` is unnecessarily escaped");
        String resourcePath = "projects/refactorings/UnnecessaryStringEscape/TokenPrinterEvent.java";
        var copy = TransformationTestUtils.transform(new UnnecessaryStringEscape(result), resourcePath, dir);
        TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
    }
}
