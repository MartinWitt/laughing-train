package io.github.martinwitt.laughing_train.persistence.impl;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectRepositoryImpl implements ProjectRepository, PanacheMongoRepository<ProjectDao> {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();

    public List<Project> findByProjectName(String projectName) {
        return find("projectName", projectName).stream()
                .map(projectDaoConverter::convertToEntity)
                .toList();
    }

    @Override
    public boolean existsByProjectName(String projectName) {
        return findByProjectName(projectName).isEmpty();
    }

    @Override
    public boolean existsByProjectUrl(String projectUrl) {
        return findByProjectUrl(projectUrl).isEmpty();
    }

    @Override
    public Project create(Project project) {
        var list = findByProjectUrl(project.getProjectUrl());
        if (list.isEmpty()) {
            persist(projectDaoConverter.convertToDao(project));
            return project;
        } else {
            return list.get(0);
        }
    }

    @Override
    public Project save(Project project) {
        var list = find("projectUrl", project.getProjectUrl()).list();
        if (list.isEmpty()) {
            persist(projectDaoConverter.convertToDao(project));
            return project;
        } else {
            logger.atInfo().log("Project already exists, updating %s", project);
            var dao = projectDaoConverter.convertToDao(project);
            dao.id = list.get(0).id;
            update(dao);
            logger.atInfo().log(
                    "Project updated %s",
                    find("projectUrl", project.getProjectUrl()).firstResult());
            return project;
        }
    }

    @Override
    public long deleteByProjectName(String projectName) {
        return delete("projectName", projectName);
    }

    @Override
    public long deleteByProjectUrl(String projectUrl) {
        return delete("projectUrl", projectUrl);
    }

    @Override
    public List<Project> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream()
                .map(projectDaoConverter::convertToEntity)
                .toList();
    }

    @Override
    public List<Project> getAll() {
        return streamAll().map(projectDaoConverter::convertToEntity).toList();
    }
}
