package io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class AccessStaticViaInstanceAnalyzerTest {

    @Test
    public void testAnalyzeInnerSimpleClass() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code =
                """
          public class SimpleClass {
              void bar() {
                int a = new SimpleClass().foo();
                System.out.println(new SimpleClass().foo());
                System.out.println(3);
                String f = bar2();
            }

            static int foo() {
              return 1;
            }
            String bar2() {
              return "bar";
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
        LocalAnalyzer analyzer = new AccessStaticViaInstanceAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(2, badSmells.size());
        assertEquals("AccessStaticViaInstance", badSmells.get(0).getName());
        badSmells.get(0).fix();
        assertTrue(simpleClass.toString().contains("SimpleClass.foo()"));
    }
}
