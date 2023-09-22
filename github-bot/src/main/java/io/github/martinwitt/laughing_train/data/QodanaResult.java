package io.github.martinwitt.laughing_train.data;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.Serializable;
import java.util.List;

public sealed interface QodanaResult extends Serializable {
  record Success(List<AnalyzerResult> result, Project project) implements QodanaResult {}

  record Failure(String message) implements QodanaResult {}
}
