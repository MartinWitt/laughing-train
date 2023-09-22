package io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class UnnecessaryImplementsAnalyzerTest {

  @Test
  public void testAnalyze() {
    String code =
        """
                import java.util.List;
                import java.util.Collection;

                public class Foo implements List, Collection {
                }
                """;
    // Create a Spoon launcher and set the input source directory
    Launcher launcher = new Launcher();
    launcher.addInputResource(new VirtualFile(code));

    // Build the Spoon model
    CtModel model = launcher.buildModel();

    // Get the factory and the class to analyze
    CtType<?> clazz = model.getAllTypes().stream().findFirst().get();

    // Create the analyzer and run the analysis
    UnnecessaryImplementsAnalyzer analyzer = new UnnecessaryImplementsAnalyzer();
    List<BadSmell> badSmells = analyzer.analyze(clazz);

    // Check that the analysis found the expected number of bad smells
    assertEquals(1, badSmells.size());

    // Check that the bad smell has the expected properties
    UnnecessaryImplements badSmell = (UnnecessaryImplements) badSmells.get(0);
    assertEquals("java.util.List", badSmell.getLowerType().getQualifiedName());
    assertEquals("java.util.Collection", badSmell.getNotNeededImplements().getQualifiedName());
  }

  @Test
  public void testAnalyze_multipleBadSmells() {
    String code =
        """
                import java.util.List;
                import java.util.Collection;
                import java.util.Set;

                public class Foo implements List, Collection, Set {
                }
                """;
    // Create a Spoon launcher and set the input source directory
    Launcher launcher = new Launcher();
    launcher.addInputResource(new VirtualFile(code));

    // Build the Spoon model
    CtModel model = launcher.buildModel();

    // Get the factory and the class to analyze
    CtType<?> clazz = model.getAllTypes().stream().findFirst().get();

    // Create the analyzer and run the analysis
    UnnecessaryImplementsAnalyzer analyzer = new UnnecessaryImplementsAnalyzer();
    List<BadSmell> badSmells = analyzer.analyze(clazz);

    // Check that the analysis found the expected number of bad smells
    assertEquals(2, badSmells.size());

    // Check that the bad smells have the expected properties
    UnnecessaryImplements badSmell1 = (UnnecessaryImplements) badSmells.get(0);
    assertEquals("java.util.List", badSmell1.getLowerType().getQualifiedName());
    assertEquals("java.util.Collection", badSmell1.getNotNeededImplements().getQualifiedName());

    UnnecessaryImplements badSmell2 = (UnnecessaryImplements) badSmells.get(1);
    assertEquals("java.util.Set", badSmell2.getLowerType().getQualifiedName());
    assertEquals("java.util.Collection", badSmell2.getNotNeededImplements().getQualifiedName());
  }
}
