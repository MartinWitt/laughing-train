package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectRepositoryImpl implements ProjectRepository, ReactivePanacheMongoRepository<ProjectDao> {

    private ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();

    public Uni<List<Project>> findByProjectName(String projectName) {
        return find("projectName", projectName).stream()
                .map(projectDaoConverter::convertToEntity)
                .collect()
                .asList();
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
        return findByProjectUrl(project.getProjectUrl()).<Project>flatMap(list -> {
            if (list.isEmpty()) {
                return persist(projectDaoConverter.convertToDao(project)).map(projectDaoConverter::convertToEntity);
            } else {
                return Uni.createFrom().item(list.get(0));
            }
        });
    }

    @Override
    public Uni<Project> save(Project project) {
        return find("projectUrl", project.getProjectUrl()).list().flatMap(list -> {
            if (list.isEmpty()) {
                System.out.println("Creating project " + project.getProjectUrl());
                return persist(projectDaoConverter.convertToDao(project)).map(projectDaoConverter::convertToEntity);
            } else {
                var dao = projectDaoConverter.convertToDao(project);
                dao.id = list.get(0).id;
                System.out.println("Updating project " + dao.id);
                return update(dao).map(projectDaoConverter::convertToEntity);
            }
        });
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
        return find("projectUrl", projectUrl).stream()
                .map(projectDaoConverter::convertToEntity)
                .collect()
                .asList();
    }

    @Override
    public Uni<List<Project>> getAll() {
        return streamAll().map(projectDaoConverter::convertToEntity).collect().asList();
    }
}
