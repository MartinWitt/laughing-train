package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDaoConverter;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@ApplicationScoped
public class SqlProjectRepository implements ProjectRepository, PanacheRepository<ProjectDao> {

  private static final ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();

  public SqlProjectRepository() {}

  @Override
  public List<RemoteProject> getAll() {
    return findAll().stream().map(projectDaoConverter::convertToEntity).toList();
  }

  @Override
  public List<RemoteProject> findByProjectName(String projectName) {
    return find("projectName", projectName).stream()
        .map(projectDaoConverter::convertToEntity)
        .toList();
  }

  @Override
  public boolean existsByProjectName(String projectName) {
    return find("projectName", projectName).count() > 0;
  }

  @Override
  public long deleteByProjectName(String projectName) {
    return delete("projectName", projectName);
  }

  @Override
  public List<RemoteProject> findByProjectUrl(String projectUrl) {
    return find("projectUrl", projectUrl).stream()
        .map(projectDaoConverter::convertToEntity)
        .toList();
  }

  @Override
  public boolean existsByProjectUrl(String projectUrl) {
    return find("projectUrl", projectUrl).count() > 0;
  }

  @Override
  public long deleteByProjectUrl(String projectUrl) {
    return delete("projectUrl", projectUrl);
  }

  @Override
  public RemoteProject save(RemoteProject project) {
    ProjectDao projectDao = projectDaoConverter.convertToDao(project);
    Optional<ProjectDao> existingProjectDao =
        find("projectUrl", projectDao.getProjectUrl()).singleResultOptional();

    if (existingProjectDao.isEmpty()) {
      persist(projectDao);
    } else {
      ProjectDao daoToUpdate = existingProjectDao.get();
      daoToUpdate.setProjectName(projectDao.getProjectName());
      daoToUpdate.setProjectUrl(projectDao.getProjectUrl());
      daoToUpdate.setCommits(projectDao.getCommits());
      persist(daoToUpdate);
    }

    return project;
  }
}
