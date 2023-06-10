package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.util.List;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;

public sealed interface SpoonPatternAnalyzerResult extends Serializable {
    record Success(List<SpoonAnalyzerResult> result, Project project) implements SpoonPatternAnalyzerResult {}

    record Failure(String message) implements SpoonPatternAnalyzerResult {}
}
