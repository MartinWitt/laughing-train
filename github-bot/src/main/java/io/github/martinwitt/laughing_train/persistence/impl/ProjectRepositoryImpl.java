package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectRepositoryImpl implements ProjectRepository, ReactivePanacheMongoRepository<Project> {

    public Uni<List<Project>> findByProjectName(String projectName) {
        return list("projectName", projectName);
    }

    @Override
    public Uni<Boolean> existsByProjectName(String projectName) {
        return findByProjectName(projectName).map(projects -> !projects.isEmpty());
    }

    @Override
    public Uni<Boolean> existsByProjectUrl(String projectUrl) {
        return findByProjectUrl(projectUrl).map(projects -> !projects.isEmpty());
    }

    @Override
    public Uni<Project> create(Project project) {
        return findByProjectUrl(project.getProjectUrl()).log().<Project>flatMap(list -> {
            if (list.isEmpty()) {
                return persist(project);
            } else {
                return Uni.createFrom().item(list.get(0));
            }
        });
    }

    @Override
    public Uni<Project> update(Project project) {
        return update(project);
    }

    @Override
    public Uni<Long> deleteByProjectName(String projectName) {
        return delete("projectName", projectName);
    }

    @Override
    public Uni<Long> deleteByProjectUrl(String projectUrl) {
        return delete("projectUrl", projectUrl);
    }

    @Override
    public Uni<List<Project>> findByProjectUrl(String projectUrl) {
        return list("projectUrl", projectUrl);
    }
}
