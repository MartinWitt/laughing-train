package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.*;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ProjectRepositoryImplTest {
    @Inject
    ProjectRepository projectRepository;

    private Faker faker = new Faker();

    @Test
    void testCreate() {
        Project project = createMockProject();
        assertThat(projectRepository.create(project)).isEqualTo(project);
    }

    @Test
    void testDeleteByProjectUrl() {
        assertThat(projectRepository.getAll()).isEmpty();
        Project project = createMockProject();
        projectRepository.create(project);
        assertThat(projectRepository.getAll()).isNotEmpty();
        assertThat(projectRepository.deleteByProjectUrl(project.getProjectUrl()))
                .isEqualTo(1);

        assertThat(projectRepository.findByProjectUrl(project.getProjectUrl())).isEmpty();
    }

    @Test
    void testFindByProjectUrl() {
        Project project = createMockProject();
        projectRepository.create(project);

        assertThat(projectRepository.findByProjectUrl(project.getProjectUrl()))
                .hasSize(1)
                .allMatch(v -> v.getProjectUrl().equals(project.getProjectUrl()));
    }

    private Project createMockProject() {
        return new Project(faker.name().name(), faker.internet().url());
    }

    @Test
    void addCommitHashTest() {
        Project project = createMockProject();
        assertThat(projectRepository.create(project)).isEqualTo(project);
        ;
        project.addCommitHash(faker.lorem().characters(10));
        projectRepository.save(project);

        assertThat(projectRepository.findByProjectUrl(project.getProjectUrl()))
                .hasSize(1)
                .allMatch(v ->
                        v.getCommitHashes().contains(project.getCommitHashes().get(0)));
    }

    @BeforeEach
    @AfterEach
    void setUp() {
        projectRepository.getAll().forEach(project -> projectRepository.deleteByProjectUrl(project.getProjectUrl()));
        assertThat(projectRepository.getAll()).isEmpty();
    }
}
