package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class SqlProjectRepositoryTest {

  @Inject SqlProjectRepository sqlProjectRepository;

  @Inject SqlAnalyzerRunRepository sqlAnalyzerRunRepository;

  @Test
  void insertProject() {
    RemoteProject remoteProject = Instancio.create(RemoteProject.class);
    sqlProjectRepository.save(remoteProject);
    assertThat(sqlProjectRepository.findByProjectName(remoteProject.getProjectName())).isNotEmpty();
    List<RemoteProject> byProjectName =
        sqlProjectRepository.findByProjectName(remoteProject.getProjectName());
    assertThat(byProjectName).isNotEmpty();
    Integer expectedSize =
        remoteProject.getCommits().stream()
            .map(v -> v.getAnalyzerStatuses())
            .collect(Collectors.summingInt(v -> v.size()));
    assertThat(sqlAnalyzerRunRepository.findRecent(expectedSize)).hasSize(expectedSize);
  }

  @Test
  void getRecent() {
    RemoteProject remoteProject = Instancio.create(RemoteProject.class);
    sqlProjectRepository.save(remoteProject);
    assertThat(sqlProjectRepository.getRecent(1)).isNotEmpty();
    List<RemoteProject> recent = sqlProjectRepository.getRecent(1);
    assertThat(recent).isNotEmpty();
  }
}
