package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class SqlProjectRepositoryTest {

  @Inject SqlProjectRepository sqlProjectRepository;

  @Test
  @TestTransaction
  void insertProject() {
    RemoteProject remoteProject = Instancio.create(RemoteProject.class);
    sqlProjectRepository.save(remoteProject);
    assertThat(sqlProjectRepository.findByProjectName(remoteProject.getProjectName())).isNotEmpty();
    List<RemoteProject> byProjectName =
        sqlProjectRepository.findByProjectName(remoteProject.getProjectName());
    assertThat(byProjectName).isNotEmpty();
  }
}
