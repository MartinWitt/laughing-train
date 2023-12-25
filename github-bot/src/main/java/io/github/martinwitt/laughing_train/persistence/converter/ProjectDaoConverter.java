package io.github.martinwitt.laughing_train.persistence.converter;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.AnalyzerRunConverter;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunDao;
import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProjectDaoConverter implements DaoConverter<RemoteProject, ProjectDao> {

  private static final AnalyzerRunConverter analyzerRunConverter = new AnalyzerRunConverter();

  @Override
  public ProjectDao convertToDao(RemoteProject entity) {
    ProjectDao dao = new ProjectDao();
    dao.setProjectName(entity.getProjectName());
    dao.setProjectUrl(entity.getProjectUrl());
    List<AnalyzerRunDao> list =
        entity.getCommits().stream()
            .map(analyzerRunConverter::convertToDao)
            .flatMap(List::stream)
            .toList();
    dao.setCommits(list);
    list.stream()
        .reduce(
            (first, second) -> first.localDateTime.isAfter(second.localDateTime) ? first : second)
        .map(v -> v.localDateTime)
        .ifPresent(dao::setLatestRun);
    return dao;
  }

  @Override
  public RemoteProject convertToEntity(ProjectDao dao) {
    var project = new RemoteProject(dao.getProjectName(), dao.getProjectUrl());
    Map<String, List<AnalyzerRunDao>> runsByCommitHash =
        dao.getCommits().stream().collect(Collectors.groupingBy(v -> v.commitHash));
    for (List<AnalyzerRunDao> stringListEntry : runsByCommitHash.values()) {
      project.addCommitHash(analyzerRunConverter.convertToEntity(stringListEntry));
    }
    return project;
  }
}
