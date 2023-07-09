package io.github.martinwitt.spoon_analyzer.badsmells.Index_off_replaceable_by_contains;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class IndexOfReplaceableByContainsAnalyzerTest {

    @Test
    public void testAnalyzeInnerSimpleClass() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code =
                """
        public class SimpleClass {
            void bar {
              String foo = "foo";
              var bar = foo.indexOf("f") != -1;
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
        LocalAnalyzer analyzer = new IndexOfReplaceableByContainsAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(1, badSmells.size());
        assertEquals("IndexOfReplaceableByContains", badSmells.get(0).getName());
    }

    @Test
    public void testAnalyzeInnerSimpleClassRefactor() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code =
                """
        public class SimpleClass {
            void bar() {
              String foo = "foo";
              var bar = foo.indexOf("f") != -1;
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
        LocalAnalyzer analyzer = new IndexOfReplaceableByContainsAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(1, badSmells.size());
        badSmells.get(0).fix();
        assertEquals("IndexOfReplaceableByContains", badSmells.get(0).getName());
        Assertions.assertThat(simpleClass.toString()).contains("!foo.contains(\"f\");");
    }
}
