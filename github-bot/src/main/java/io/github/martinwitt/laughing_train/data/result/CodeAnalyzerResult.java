package io.github.martinwitt.laughing_train.data.result;

import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.Serializable;
import java.util.List;

public interface CodeAnalyzerResult extends Serializable {

  record Success(List<AnalyzerResult> results, Project project) implements CodeAnalyzerResult {}

  record Failure(String message) implements CodeAnalyzerResult {}
}
