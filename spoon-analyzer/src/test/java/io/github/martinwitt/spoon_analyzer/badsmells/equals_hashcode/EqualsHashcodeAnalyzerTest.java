package io.github.martinwitt.spoon_analyzer.badsmells.equals_hashcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class EqualsHashcodeAnalyzerTest {

    @Test
    void noEqualsNoHashcode() {
        String code = "public class A { }";

        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        EqualsHashcodeAnalyzer analyzer = new EqualsHashcodeAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);
        assertEquals(0, result.size());
    }

    @Test
    void UpperClassEqualsNoHashcode() {
        String code =
                """
            class A {

            @Override
            public boolean equals(Object obj) {
              return super.equals(obj);
            }
          }

          class B extends A {

          }
        """;

        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        var model = launcher.buildModel();
        EqualsHashcodeAnalyzer analyzer = new EqualsHashcodeAnalyzer();
        CtType<?> simpleClass = model.getAllTypes().stream().findFirst().get();
        var result = analyzer.analyze(simpleClass);

        assertEquals(1, result.size());
    }
}
