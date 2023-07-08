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
        return new ProjectConfig(dao.getSourceFolder(), dao.getProjectUrl());
    }
}
