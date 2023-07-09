package io.github.martinwitt.spoon_analyzer.badsmells.private_final_method;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;

public class PrivateFinalMethodAnalyzerTest {

    @Test
    void simplePrivateFinalMethodTest() {
        String code = "class A { private final void foo() {} }";
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        CtModel model = launcher.buildModel();
        PrivateFinalMethodAnalyzer analyzer = new PrivateFinalMethodAnalyzer();
        CtType<?> type = model.getAllTypes().iterator().next();
        List<BadSmell> analyze = analyzer.analyze(type);
        Assertions.assertEquals(1, analyze.size());
        Assertions.assertEquals("PrivateFinalMethod", analyze.get(0).getName());
    }
}
