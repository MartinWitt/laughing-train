package xyz.keksdose.spoon.code_solver.transformations.qodana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnnecessaryStringEscape;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class UnnecessaryStringEscapeTest {
  @Test
  void spoonTokenPrinterEvent(@TempDir File dir) throws IOException {
    Position position = new Position(72, 0, 27, 0, 1927, 2);
    AnalyzerResult result =
        new TestAnalyzerResult(
            "UnnecessaryStringEscape",
            "TokenPrinterEvent.java",
            position,
            "`\'` is unnecessarily escaped");
    String resourcePath = "projects/refactorings/UnnecessaryStringEscape/TokenPrinterEvent.java";
    var copy =
        TransformationTestUtils.transform(new UnnecessaryStringEscape(result), resourcePath, dir);
    TransformationTestUtils.compareContentWithoutWhiteSpaces(copy, resourcePath);
  }

  @Test
  public void testRefactor() {
    String code =
        "public class Test {\n"
            + "    public String test() {\n"
            + "        String s = \"test\\'\";\n"
            + "        return s;\n"
            + "    }\n"
            + "}";
    Launcher launcher = new Launcher();
    launcher.addInputResource(new VirtualFile(code, "Test"));
    CtModel model = launcher.buildModel();
    CtType<?> testClass =
        model.getAllTypes().stream()
            .filter(type -> type.getSimpleName().equals("Test"))
            .findFirst()
            .orElseThrow();
    CtMethod<?> testMethod = testClass.getMethodsByName("test").get(0);
    AnalyzerResult result =
        new TestAnalyzerResult(
            "UnnecessaryStringEscape",
            testClass.getPosition().getFile().toString(),
            new Position(2, 16, 2, 19, 0, 0),
            "`\\'` is unnecessarily escaped");
    UnnecessaryStringEscape analyzer = new UnnecessaryStringEscape(result);
    ChangeListener listener = new ChangeListener();
    analyzer.refactor(listener, testClass);
    assertEquals(
        "java.lang.String s = \"test'\"", testMethod.getBody().getStatements().get(0).toString());
    launcher.prettyprint();
  }
}
