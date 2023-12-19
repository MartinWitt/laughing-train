package io.github.martinwitt.laughing_train.data;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.gitprojects.GitProject;
import java.io.Serializable;
import java.util.List;

public sealed interface QodanaResult extends Serializable {
  record Success(List<AnalyzerResult> result, GitProject gitProject) implements QodanaResult {}

  record Failure(String message) implements QodanaResult {}
}
