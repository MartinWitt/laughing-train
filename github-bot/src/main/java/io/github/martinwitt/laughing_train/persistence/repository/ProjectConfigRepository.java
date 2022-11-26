package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import java.util.List;

public interface ProjectConfigRepository {

    List<ProjectConfig> findByProjectUrl(String projectUrl);

    boolean existsByProjectUrl(String projectUrl);

    long deleteByProjectUrl(String projectUrl);

    ProjectConfig create(ProjectConfig projectConfig);

    ProjectConfig save(ProjectConfig projectConfig);
}
