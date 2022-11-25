package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.*;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ProjectRepositoryImplTest {
    @Inject
    ProjectRepository projectRepository;

    private Faker faker = new Faker();

    @Test
    void testCreate() {
        Project project = createMockProject();
        projectRepository
                .create(project)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(project);
    }

    @Test
    void testDeleteByProjectUrl() {
        Project project = createMockProject();
        projectRepository
                .create(project)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(project);
        projectRepository
                .deleteByProjectUrl(project.getProjectUrl())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(1L);
        assertThat(projectRepository.getAll().await().indefinitely()).isEmpty();
    }

    @Test
    void testFindByProjectUrl() {
        Project project = createMockProject();
        projectRepository
                .create(project)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(project);
        assertThat(projectRepository
                        .findByProjectUrl(project.getProjectUrl())
                        .subscribe()
                        .withSubscriber(UniAssertSubscriber.create())
                        .awaitItem()
                        .getItem())
                .hasSize(1)
                .allMatch(v -> v.getProjectUrl().equals(project.getProjectUrl()));
    }

    private Project createMockProject() {
        return new Project(faker.name().name(), faker.internet().url());
    }
}
