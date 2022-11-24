package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface ProjectConfigRepository {

    public Uni<List<ProjectConfig>> findByProjectUrl(String projectUrl);

    public Uni<Boolean> existsByProjectUrl(String projectUrl);

    public Uni<Long> deleteByProjectUrl(String projectUrl);

    public Uni<ProjectConfig> create(ProjectConfig projectConfig);

    public Uni<ProjectConfig> update(ProjectConfig projectConfig);
}
