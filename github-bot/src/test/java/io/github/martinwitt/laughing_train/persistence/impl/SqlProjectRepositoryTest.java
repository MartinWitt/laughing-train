package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.List;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class SqlProjectRepositoryTest {

  @Inject SqlProjectRepository sqlProjectRepository;

  @Inject AnalyzerRunRepository sqlAnalyzerRunRepository;

  @Test
  void insertProject() {
    RemoteProject remoteProject = Instancio.create(RemoteProject.class);
    sqlProjectRepository.save(remoteProject);
    assertThat(sqlProjectRepository.findByProjectName(remoteProject.getProjectName())).isNotEmpty();
    List<RemoteProject> byProjectName =
        sqlProjectRepository.findByProjectName(remoteProject.getProjectName());
    assertThat(byProjectName).isNotEmpty();
  }
}
