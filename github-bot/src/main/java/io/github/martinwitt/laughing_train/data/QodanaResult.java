package io.github.martinwitt.laughing_train.data;

import java.io.Serializable;
import java.util.List;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

public sealed interface QodanaResult extends Serializable {
    record Success(List<AnalyzerResult> result, Project project) implements QodanaResult {}

    record Failure(String message) implements QodanaResult {}
}
