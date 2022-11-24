package io.github.martinwitt.laughing_train.data;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import java.io.Serializable;
import java.util.List;

public sealed interface FindProjectConfigResult extends Serializable {
    record SingleResult(ProjectConfig projectConfig) implements FindProjectConfigResult {}

    record MultipleResults(List<ProjectConfig> projectConfigs) implements FindProjectConfigResult {}

    record NotFound() implements FindProjectConfigResult {}
}
