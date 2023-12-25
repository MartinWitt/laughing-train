package io.github.martinwitt.laughing_train.persistence.repository;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import java.util.List;

public interface ProjectRepository {

  List<RemoteProject> getAll();

  List<RemoteProject> getRecent(int size);

  List<RemoteProject> findByProjectName(String projectName);

  boolean existsByProjectName(String projectName);

  long deleteByProjectName(String projectName);

  List<RemoteProject> findByProjectUrl(String projectUrl);

  boolean existsByProjectUrl(String projectUrl);

  long deleteByProjectUrl(String projectUrl);

  RemoteProject save(RemoteProject project);
}
