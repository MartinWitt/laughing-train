package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.converter.ProjectDaoConverter;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

@Transactional
@ApplicationScoped
public class SqlProjectRepository implements ProjectRepository, PanacheRepository<ProjectDao> {

  private static final ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();
  private SqlAnalyzerRunRepository sqlAnalyzerRunRepository;

  public SqlProjectRepository(SqlAnalyzerRunRepository sqlAnalyzerRunRepository) {
    this.sqlAnalyzerRunRepository = sqlAnalyzerRunRepository;
  }

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
  public RemoteProject create(RemoteProject project) {
    var list = findByProjectUrl(project.getProjectUrl());
    if (list.isEmpty()) {
      persist(projectDaoConverter.convertToDao(project));
      return project;
    } else {
      return list.getFirst();
    }
  }

  @Override
  public RemoteProject save(RemoteProject project) {
    ProjectDao projectDao = projectDaoConverter.convertToDao(project);
    if (find("projectUrl", projectDao.getProjectUrl()).stream().findFirst().isEmpty()) {
      ProjectDao dao = projectDaoConverter.convertToDao(project);
      sqlAnalyzerRunRepository.persist(dao.getCommits());
      persist(dao);
    } else {
      var dao = projectDaoConverter.convertToDao(project);
      ProjectDao databaseEntry = find("projectUrl", dao.getProjectUrl()).stream().findFirst().get();
      databaseEntry.setProjectName(dao.getProjectName());
      databaseEntry.setProjectUrl(dao.getProjectUrl());
      databaseEntry.setCommits(dao.getCommits());
      databaseEntry.setCommits(dao.getCommits());
      sqlAnalyzerRunRepository.persist(databaseEntry.getCommits());
      persist(databaseEntry);
    }
    return project;
  }

  @Override
  public List<RemoteProject> getRecent(int size) {
    return findAll(Sort.by("latestRun").descending()).page(0, size).stream()
        .map(projectDaoConverter::convertToEntity)
        .toList();
  }
}
