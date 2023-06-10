package io.github.martinwitt.laughing_train.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;

public class SpoonPatternAnalyzerResultTest {

    @Test
    public void testSuccessRecord() {
        Project project = new Project("test-owner", "test-name", null, "test-url", "#9999");
        SpoonAnalyzerResult result1 = Instancio.create(SpoonAnalyzerResult.class);
        SpoonAnalyzerResult result2 = Instancio.create(SpoonAnalyzerResult.class);
        List<SpoonAnalyzerResult> results = List.of(result1, result2);
        SpoonPatternAnalyzerResult.Success success = new SpoonPatternAnalyzerResult.Success(results, project);
        assertEquals(results, success.result());
        assertEquals(project, success.project());
    }

    @Test
    public void testFailureRecord() {
        String message = "test-message";
        SpoonPatternAnalyzerResult.Failure failure = new SpoonPatternAnalyzerResult.Failure(message);
        assertEquals(message, failure.message());
    }
}
