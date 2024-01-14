package io.github.martinwitt.laughing_train.data.result;

import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.Serializable;
import java.util.List;

public sealed interface CodeAnalyzerResult extends Serializable
    permits CodeAnalyzerResult.Success, CodeAnalyzerResult.Failure {

  record Success(List<? extends AnalyzerResult> results, GitProject gitProject)
      implements CodeAnalyzerResult {}

  record Failure(String message) implements CodeAnalyzerResult {}
}
