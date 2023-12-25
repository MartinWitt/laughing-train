package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@QuarkusTest
@Disabled
public class ProjectRepositoryImplTest {
  @Inject ProjectRepository projectRepository;

  @Test
  void testCreate() {
    RemoteProject project = createMockProject();
    assertThat(projectRepository.save(project)).isEqualTo(project);
  }

  @Test
  void testDeleteByProjectUrl() {
    assertThat(projectRepository.getAll()).isEmpty();
    RemoteProject project = createMockProject();
    projectRepository.save(project);
    assertThat(projectRepository.getAll()).isNotEmpty();
    assertThat(projectRepository.deleteByProjectUrl(project.getProjectUrl())).isEqualTo(1);

    assertThat(projectRepository.findByProjectUrl(project.getProjectUrl())).isEmpty();
  }

  @Test
  void testFindByProjectUrl() {
    RemoteProject project = createMockProject();
    projectRepository.save(project);

    assertThat(projectRepository.findByProjectUrl(project.getProjectUrl()))
        .hasSize(1)
        .allMatch(v -> v.getProjectUrl().equals(project.getProjectUrl()));
  }

  private RemoteProject createMockProject() {
    return Instancio.create(RemoteProject.class);
  }

  @BeforeEach
  @AfterEach
  void setUp() {
    projectRepository
        .getAll()
        .forEach(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()));
    assertThat(projectRepository.getAll()).isEmpty();
  }
}
