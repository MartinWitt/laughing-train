package io.github.martinwitt.laughing_train.persistence.converter;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectConfigDao;

public class ProjectConfigConverter implements DaoConverter<ProjectConfig, ProjectConfigDao> {

    @Override
    public ProjectConfigDao convertToDao(ProjectConfig entity) {
        ProjectConfigDao dao = new ProjectConfigDao();
        dao.setProjectUrl(entity.getProjectUrl());
        dao.setSourceFolder(entity.getSourceFolder());
        return dao;
    }

    @Override
    public ProjectConfig convertToEntity(ProjectConfigDao dao) {
        ProjectConfig entity = new ProjectConfig();
        entity.setProjectUrl(dao.getProjectUrl());
        entity.setSourceFolder(dao.getSourceFolder());
        return entity;
    }
}
