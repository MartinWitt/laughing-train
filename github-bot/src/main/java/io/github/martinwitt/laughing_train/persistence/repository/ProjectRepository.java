package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.persistence.Project;
import io.smallrye.mutiny.Uni;
import java.util.List;

public interface ProjectRepository {

    public Uni<List<Project>> findByProjectName(String projectName);

    public Uni<Boolean> existsByProjectName(String projectName);

    public Uni<Long> deleteByProjectName(String projectName);

    public Uni<List<Project>> findByProjectUrl(String projectUrl);

    public Uni<Boolean> existsByProjectUrl(String projectUrl);

    public Uni<Long> deleteByProjectUrl(String projectUrl);

    public Uni<Project> create(Project project);

    public Uni<Project> update(Project project);
}
