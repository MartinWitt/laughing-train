package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectConfigConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectConfigDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectConfigRepositoryImpl implements ProjectConfigRepository, PanacheMongoRepository<ProjectConfigDao> {

    private static ProjectConfigConverter projectConfigConverter = new ProjectConfigConverter();

    public List<ProjectConfig> findByProjectUrl(String projectUrl) {
        return find("projectUrl", projectUrl).stream()
                .map(projectConfigConverter::convertToEntity)
                .toList();
    }

    @Override
    public boolean existsByProjectUrl(String projectUrl) {
        return findByProjectUrl(projectUrl).isEmpty();
    }

    @Override
    public long deleteByProjectUrl(String projectUrl) {
        return delete("projectUrl", projectUrl);
    }

    @Override
    public ProjectConfig create(ProjectConfig projectConfig) {

        var list = findByProjectUrl(projectConfig.getProjectUrl());
        if (list.isEmpty()) {
            persist(projectConfigConverter.convertToDao(projectConfig));
            return projectConfig;
        } else {
            return list.get(0);
        }
    }

    @Override
    public ProjectConfig save(ProjectConfig projectConfig) {
        var list = find("projectUrl", projectConfig.getProjectUrl()).list();
        if (list.isEmpty()) {
            persist(projectConfigConverter.convertToDao(projectConfig));
            return projectConfig;
        } else {
            var dao = projectConfigConverter.convertToDao(projectConfig);
            dao.id = list.get(0).id;
            update(dao);
            return projectConfig;
        }
    }
}
