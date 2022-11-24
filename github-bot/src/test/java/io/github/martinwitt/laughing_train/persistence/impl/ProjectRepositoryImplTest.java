package io.github.martinwitt.laughing_train.persistence.impl;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import java.util.List;
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
        projectRepository
                .findByProjectUrl(project.getProjectUrl())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(List.of(project));
    }

    private Project createMockProject() {
        return new Project(faker.name().name(), faker.internet().url());
    }
}
