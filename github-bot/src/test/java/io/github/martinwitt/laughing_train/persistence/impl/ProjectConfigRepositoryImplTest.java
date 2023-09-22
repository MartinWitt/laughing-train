package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.*;

import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ProjectConfigRepositoryImplTest {
  @Inject ProjectConfigRepository projectConfigRepository;

  @Test
  void testCreate() {
    ProjectConfig config = createMockProjectConfig();
    assertThat(projectConfigRepository.create(config)).isEqualTo(config);
  }

  @Test
  void testDeleteByProjectUrl() {
    ProjectConfig config = createMockProjectConfig();
    projectConfigRepository.create(config);
    assertThat(projectConfigRepository.deleteByProjectUrl(config.getProjectUrl())).isEqualTo(1);
  }

  @Test
  void insertKeepsDataUnique() {
    ProjectConfig config = createMockProjectConfig();
    projectConfigRepository.create(config);

    projectConfigRepository.create(config);

    projectConfigRepository.findByProjectUrl(config.getProjectUrl());
    assertThat(projectConfigRepository.findByProjectUrl(config.getProjectUrl())).hasSize(1);
  }

  private ProjectConfig createMockProjectConfig() {
    return Instancio.create(ProjectConfig.class);
  }
}
