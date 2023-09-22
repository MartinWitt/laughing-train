package io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class NonProtectedConstructorInAbstractClassAnalyzerTest {

  @Test
  public void testNonAbstractClass() {
    // Create a Spoon launcher
    Launcher launcher = new Launcher();
    String code = """
            public  class SimpleClass {
            }
            """;
    // Add the source directory to the classpath
    launcher.addInputResource(new VirtualFile(code));

    // Build the Spoon model
    launcher.buildModel();
    CtModel model = launcher.getModel();

    // Get the CtClass object for the SimpleClass class
    CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();

    // Create an instance of the InnerClassMayBeStaticAnalyzer class
    LocalAnalyzer analyzer = new NonProtectedConstructorInAbstractClassAnalyzer();

    // Analyze the SimpleClass class for bad smells
    List<BadSmell> badSmells = analyzer.analyze(simpleClass);

    // Check that no bad smells were found
    assertEquals(0, badSmells.size());
  }

  @Test
  public void testAbstractClass() {
    // Create a Spoon launcher
    Launcher launcher = new Launcher();
    String code =
        """
                public abstract class SimpleClass {

                  public SimpleClass() {
                  }
          }
          """;
    // Add the source directory to the classpath
    launcher.addInputResource(new VirtualFile(code));

    // Build the Spoon model
    launcher.buildModel();
    CtModel model = launcher.getModel();

    // Get the CtClass object for the SimpleClass class
    CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();

    // Create an instance of the InnerClassMayBeStaticAnalyzer class
    LocalAnalyzer analyzer = new NonProtectedConstructorInAbstractClassAnalyzer();

    // Analyze the SimpleClass class for bad smells
    List<BadSmell> badSmells = analyzer.analyze(simpleClass);

    // Check that no bad smells were found
    assertEquals(1, badSmells.size());
  }
}
