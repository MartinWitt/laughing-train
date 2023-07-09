package io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class InnerClassMayBeStaticAnalyzerTest {

    @Test
    public void testAnalyzeSimpleClass() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code = """
          public class SimpleClass {

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
        LocalAnalyzer analyzer = new InnerClassMayBeStaticAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<? super BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(0, badSmells.size());
    }

    @Test
    public void testAnalyzeInnerSimpleClass() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code =
                """
          public class SimpleClass {
            class Foo {
              void bar {

              }
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
        LocalAnalyzer analyzer = new InnerClassMayBeStaticAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<? super BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(1, badSmells.size());
    }

    @Test
    public void testAnalyzeInnerDeepClass() {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        String code =
                """
public class OuterClass {
    private static int staticField;

    public static class InnerClass1 {
        private int field1;

        public class InnerClass2 {
            private int field2;

            public class InnerClass3 {
                private int field3;

                public class InnerClass4 {
                    private int field4;

                    public class InnerClass5 {
                        private int field5;

                        public void method() {
                            System.out.println(staticField + field1 + field2 + field3 + field4 + field5);
                        }
                    }
                }
            }
        }
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
        LocalAnalyzer analyzer = new InnerClassMayBeStaticAnalyzer();

        // Analyze the SimpleClass class for bad smells
        List<? super BadSmell> badSmells = analyzer.analyze(simpleClass);

        // Check that no bad smells were found
        assertEquals(0, badSmells.size());
    }
}
