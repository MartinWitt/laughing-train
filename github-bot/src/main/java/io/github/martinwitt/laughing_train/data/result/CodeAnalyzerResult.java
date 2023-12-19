package io.github.martinwitt.laughing_train.data.result;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.gitprojects.GitProject;
import java.io.Serializable;
import java.util.List;

public sealed interface CodeAnalyzerResult extends Serializable
    permits CodeAnalyzerResult.Success, CodeAnalyzerResult.Failure {

  record Success(List<AnalyzerResult> results, GitProject gitProject)
      implements CodeAnalyzerResult {}

  record Failure(String message) implements CodeAnalyzerResult {}
}
