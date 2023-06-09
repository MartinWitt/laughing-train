package xyz.keksdose.spoon.code_solver.analyzer.spoon.rules;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;

public class UnnecessaryToStringCallAnalyzerTest {

    @Test
    public void testUnnecessaryToStringCallAnalyzer() throws IOException {
        String sourceCode =
                """
            public class Test {
                public void test() {
                    String s = "test";
                    System.out.println(s.toString());
                }
            }
            """;
        VirtualFile file = new VirtualFile(sourceCode, "Test.java");
        Launcher launcher = new Launcher();
        launcher.addInputResource(file);
        CtModel model = launcher.buildModel();
        CtType<?> type = model.getAllTypes().stream()
                .filter(t -> t.getSimpleName().equals("Test"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Test class not found"));
        UnnecessaryToStringCall analyzer = new UnnecessaryToStringCall();
        List<SpoonAnalyzerResult> results = analyzer.analyze(type);
        assertEquals(1, results.size());
        SpoonAnalyzerResult result = results.get(0);
        assertEquals("UnnecessaryToStringCall", result.ruleID().id());
        assertEquals("s.toString()", result.snippet());
    }

    @Test
    public void testUnnecessaryToStringCallAnalyzer_noIssues() throws IOException {
        String sourceCode =
                """
            public class Test {
                public void test() {
                    String s = "test";
                    System.out.println(s);
                }
            }
            """;
        VirtualFile file = new VirtualFile(sourceCode, "Test.java");
        Launcher launcher = new Launcher();
        launcher.addInputResource(file);
        CtModel model = launcher.buildModel();
        CtType<?> type = model.getAllTypes().stream()
                .filter(t -> t.getSimpleName().equals("Test"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Test class not found"));
        UnnecessaryToStringCall analyzer = new UnnecessaryToStringCall();
        List<SpoonAnalyzerResult> results = analyzer.analyze(type);
        assertEquals(0, results.size());
    }

    @Test
    public void testUnnecessaryToStringCallAnalyzer_multipleIssues() throws IOException {
        String sourceCode =
                """
            public class Test {
                public void test() {
                    String s1 = "test1";
                    String s2 = "test2";
                    System.out.println(s1.toString() + s2.toString());
                }
            }
            """;
        VirtualFile file = new VirtualFile(sourceCode, "Test.java");
        Launcher launcher = new Launcher();
        launcher.addInputResource(file);
        CtModel model = launcher.buildModel();
        CtType<?> type = model.getAllTypes().stream()
                .filter(t -> t.getSimpleName().equals("Test"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Test class not found"));
        UnnecessaryToStringCall analyzer = new UnnecessaryToStringCall();
        List<SpoonAnalyzerResult> results = analyzer.analyze(type);
        assertEquals(2, results.size());
        SpoonAnalyzerResult result1 = results.get(0);
        assertEquals("UnnecessaryToStringCall", result1.ruleID().id());
        assertEquals("s1.toString()", result1.snippet());
        SpoonAnalyzerResult result2 = results.get(1);
        assertEquals("UnnecessaryToStringCall", result2.ruleID().id());
        assertEquals("s2.toString()", result2.snippet());
    }

    @Test
    public void testUnnecessaryToStringCallAnalyzer_nestedMethodCall() throws IOException {
        String sourceCode =
                """
            public class Test {
                public void test() {
                    String s = "test";
                    System.out.println(getValue(s).toString());
                }
                private String getValue(String s) {
                    return s;
                }
            }
            """;
        VirtualFile file = new VirtualFile(sourceCode, "Test.java");
        Launcher launcher = new Launcher();
        launcher.addInputResource(file);
        CtModel model = launcher.buildModel();
        CtType<?> type = model.getAllTypes().stream()
                .filter(t -> t.getSimpleName().equals("Test"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Test class not found"));
        UnnecessaryToStringCall analyzer = new UnnecessaryToStringCall();
        List<SpoonAnalyzerResult> results = analyzer.analyze(type);
        assertEquals(1, results.size());
        SpoonAnalyzerResult result = results.get(0);
        assertEquals("UnnecessaryToStringCall", result.ruleID().id());
        assertEquals("getValue(s).toString()", result.snippet());
    }
}
