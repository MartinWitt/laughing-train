package xyz.keksdose.spoon.code_solver.transformations.qodana;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UtilityClassWithoutPrivateConstructor;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class UtilityClassWithoutPrivateConstructorTest {
  @Test
  void utilityClassWithoutPrivateConstructorLaughingTrain(@TempDir File dir) throws IOException {
    Position position = new Position(90, 0, 10, 0, 62, 8);
    AnalyzerResult result = new TestAnalyzerResult("PullRequest.java", position);
    String resourcePath =
        "projects/refactorings/UtilityClassWithoutPrivateConstructor/PullRequest.java";
    var copy =
        TransformationTestUtils.transform(
            new UtilityClassWithoutPrivateConstructor(result), resourcePath, dir);
    TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
  }

  @Test
  void utilityClassWithoutPrivateConstructorLaughingTrain2(@TempDir File dir) throws IOException {
    Position position = new Position(90, 0, 10, 0, 62, 8);
    AnalyzerResult result = new TestAnalyzerResult("CommitBuilder.java", position);
    String resourcePath =
        "projects/refactorings/UtilityClassWithoutPrivateConstructor/CommitBuilder.java";
    var copy =
        TransformationTestUtils.transform(
            new UtilityClassWithoutPrivateConstructor(result), resourcePath, dir);
    TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
  }

  @Test
  void utilityClassWithoutPrivateConstructorLaughingTrain3(@TempDir File dir) throws IOException {
    Position position = new Position(12, 0, 14, 0, 419, 12);
    AnalyzerResult result = new TestAnalyzerResult("ImportHelper.java", position);
    String resourcePath =
        "projects/refactorings/UtilityClassWithoutPrivateConstructor/ImportHelper.java";
    var copy =
        TransformationTestUtils.transform(
            new UtilityClassWithoutPrivateConstructor(result), resourcePath, dir);
    TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
  }
}
