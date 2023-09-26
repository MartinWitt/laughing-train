package io.github.martinwitt.laughing_train.data.result;

import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.Serializable;
import java.util.List;

public sealed interface CodeAnalyzerResult extends Serializable
    permits CodeAnalyzerResult.Success, CodeAnalyzerResult.Failure {

  record Success(List<AnalyzerResult> results, Project project) implements CodeAnalyzerResult {}

  record Failure(String message) implements CodeAnalyzerResult {}
}
