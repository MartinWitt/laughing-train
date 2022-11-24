package io.github.martinwitt.laughing_train.persistence.converter;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;

public class ProjectDaoConverter implements DaoConverter<Project, ProjectDao> {

    @Override
    public ProjectDao convertToDao(Project entity) {
        ProjectDao dao = new ProjectDao();
        dao.setProjectName(entity.getProjectName());
        dao.setProjectUrl(entity.getProjectUrl());
        dao.setCommitHashes(entity.getCommitHashes());
        return dao;
    }

    @Override
    public Project convertToEntity(ProjectDao dao) {
        var project = new Project(dao.getProjectName(), dao.getProjectUrl());
        dao.getCommitHashes().forEach(project::addCommitHash);
        return project;
    }
}
