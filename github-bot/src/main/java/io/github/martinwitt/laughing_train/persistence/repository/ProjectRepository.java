package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface ProjectRepository {

    Uni<List<Project>> getAll();

    Uni<List<Project>> findByProjectName(String projectName);

    Uni<Boolean> existsByProjectName(String projectName);

    Uni<Long> deleteByProjectName(String projectName);

    Uni<List<Project>> findByProjectUrl(String projectUrl);

    Uni<Boolean> existsByProjectUrl(String projectUrl);

    Uni<Long> deleteByProjectUrl(String projectUrl);

    Uni<Project> create(Project project);

    Uni<Project> save(Project project);
}
