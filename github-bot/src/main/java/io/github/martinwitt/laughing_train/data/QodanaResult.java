package io.github.martinwitt.laughing_train.data;

import java.util.List;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

public sealed interface QodanaResult {
    record Success(List<AnalyzerResult> result) implements QodanaResult {}

    record Failure(String message) implements QodanaResult {}
}
