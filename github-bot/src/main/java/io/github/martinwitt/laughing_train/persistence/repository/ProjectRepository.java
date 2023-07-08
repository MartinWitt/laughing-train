package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import java.util.List;

public interface ProjectRepository {

    List<Project> getAll();

    List<Project> findByProjectName(String projectName);

    boolean existsByProjectName(String projectName);

    long deleteByProjectName(String projectName);

    List<Project> findByProjectUrl(String projectUrl);

    boolean existsByProjectUrl(String projectUrl);

    long deleteByProjectUrl(String projectUrl);

    Project create(Project project);

    Project save(Project project);
}
