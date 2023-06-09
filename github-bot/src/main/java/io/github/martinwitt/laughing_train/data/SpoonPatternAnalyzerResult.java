package io.github.martinwitt.laughing_train.data;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.Serializable;
import java.util.List;

public sealed interface SpoonPatternAnalyzerResult extends Serializable {
    record Success(List<AnalyzerResult> result, Project project) implements SpoonPatternAnalyzerResult {}

    record Failure(String message) implements SpoonPatternAnalyzerResult {}
}
