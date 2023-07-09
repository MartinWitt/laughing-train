package io.github.martinwitt.spoon_analyzer.badsmells.size_is_replaceable_by_is_empty;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty.SizeReplaceableByIsEmptyAnalyzer;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.support.compiler.VirtualFile;

public class SizeReplaceableByIsEmptyAnalyzerTest {
    @Test
    void simpleSizeIsZero() {
        String code =
                """
        class A {
          public void a() {
            List<String> list = new ArrayList<>();
            if (list.size() == 0) {
              System.out.println("Hello World");
            }
          }
        }
        """;
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile(code));
        SizeReplaceableByIsEmptyAnalyzer analyzer = new SizeReplaceableByIsEmptyAnalyzer();
        List<BadSmell> analyze =
                analyzer.analyze(launcher.buildModel().getAllTypes().iterator().next());
        Assertions.assertEquals(1, analyze.size());
    }
}
