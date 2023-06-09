package io.github.martinwitt.laughing_train.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SpoonPatternAnalyzerResultTest {

    @Test
    public void testSuccessRecord() {
        Project project = new Project("test-owner", "test-name", null, "test-url", "#9999");
        AnalyzerResult result1 = new TestAnalyzerResult("test-rule-1", new Position(0, 0, 0, 0, 0, 0));
        AnalyzerResult result2 = new TestAnalyzerResult("test-rule-2", new Position(0, 0, 0, 0, 0, 0));
        List<AnalyzerResult> results = List.of(result1, result2);
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
