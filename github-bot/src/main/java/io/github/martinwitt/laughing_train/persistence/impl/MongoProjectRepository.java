package io.github.martinwitt.laughing_train.persistence.impl;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class MongoProjectRepository implements ProjectRepository, PanacheMongoRepository<ProjectDao> {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();

    public List<RemoteProject> findByProjectName(String projectName) {
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
    public RemoteProject create(RemoteProject project) {
        var list = findByProjectUrl(project.getProjectUrl());
        if (list.isEmpty()) {
            persist(projectDaoConverter.convertToDao(project));
            return project;
        } else {
            return list.get(0);
        }
    }

    @Override
    public RemoteProject save(RemoteProject project) {
        var list = find("projectUrl", project.getProjectUrl()).list();
        if (list.isEmpty()) {
            persist(projectDaoConverter.convertToDao(project));
        } else {
            var dao = projectDaoConverter.convertToDao(project);
            dao.id = list.get(0).id;
            update(dao);
        }
        return project;
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
    public List<RemoteProject> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream()
                .map(projectDaoConverter::convertToEntity)
                .toList();
    }

    @Override
    public List<RemoteProject> getAll() {
        return streamAll().map(projectDaoConverter::convertToEntity).toList();
    }
}
