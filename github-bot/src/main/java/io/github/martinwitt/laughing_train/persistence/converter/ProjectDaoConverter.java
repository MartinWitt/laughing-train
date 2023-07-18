package io.github.martinwitt.laughing_train.persistence.converter;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;

public class ProjectDaoConverter implements DaoConverter<RemoteProject, ProjectDao> {

    @Override
    public ProjectDao convertToDao(RemoteProject entity) {
        ProjectDao dao = new ProjectDao();
        dao.setProjectName(entity.getProjectName());
        dao.setProjectUrl(entity.getProjectUrl());
        dao.setCommitHashes(entity.getCommitHashes());
        return dao;
    }

    @Override
    public RemoteProject convertToEntity(ProjectDao dao) {
        var project = new RemoteProject(dao.getProjectName(), dao.getProjectUrl());
        dao.getCommitHashes().forEach(project::addCommitHash);
        return project;
    }
}
