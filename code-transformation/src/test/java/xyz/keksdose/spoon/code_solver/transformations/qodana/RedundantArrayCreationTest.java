package xyz.keksdose.spoon.code_solver.transformations.qodana;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.RedundantArrayCreation;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class RedundantArrayCreationTest {
  @Test
  @Disabled("TODO: Fix this test")
  void spoonAnnotationFactory(@TempDir File dir) throws IOException {
    Position position = new Position(114, 0, 90, 0, 3698, 12);
    AnalyzerResult result = new TestAnalyzerResult("AnnotationFactory.java", position);
    String resourcePath = "projects/refactorings/RedundantArrayCreation/AnnotationFactory.java";
    var copy =
        TransformationTestUtils.transform(new RedundantArrayCreation(result), resourcePath, dir);
    TransformationTestUtils.compareContent(copy, resourcePath);
  }
}
