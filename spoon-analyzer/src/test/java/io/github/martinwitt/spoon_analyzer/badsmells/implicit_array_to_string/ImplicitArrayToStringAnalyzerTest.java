package io.github.martinwitt.spoon_analyzer.badsmells.implicit_array_to_string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class ImplicitArrayToStringAnalyzerTest {

    @Test
    void UpperClassEqualsNoHashcode() {
        String code =
                """
            class A {
            public void print(Object[] obj) {
              System.out.println(obj);
            }
          }
        """;

        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        ImplicitArrayToStringAnalyzer analyzer = new ImplicitArrayToStringAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);

        assertEquals(1, result.size());
    }
}
