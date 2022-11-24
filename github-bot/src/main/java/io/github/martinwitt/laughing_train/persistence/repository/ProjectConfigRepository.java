package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface ProjectConfigRepository {

    Uni<List<ProjectConfig>> findByProjectUrl(String projectUrl);

    Uni<Boolean> existsByProjectUrl(String projectUrl);

    Uni<Long> deleteByProjectUrl(String projectUrl);

    Uni<ProjectConfig> create(ProjectConfig projectConfig);

    Uni<ProjectConfig> save(ProjectConfig projectConfig);
}
