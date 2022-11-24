package io.github.martinwitt.laughing_train.persistence.impl;

import static org.assertj.core.api.Assertions.*;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ProjectConfigRepositoryImplTest {
    @Inject
    ProjectConfigRepository projectConfigRepository;

    private Faker faker = new Faker();

    @Test
    void testCreate() {
        ProjectConfig config = createMockProjectConfig();
        UniAssertSubscriber<ProjectConfig> subscriber = UniAssertSubscriber.create();
        projectConfigRepository.create(config).subscribe().withSubscriber(subscriber);
        subscriber.awaitItem().assertItem(config);
    }

    @Test
    void testDeleteByProjectUrl() {
        ProjectConfig config = createMockProjectConfig();
        UniAssertSubscriber<ProjectConfig> subscriber = UniAssertSubscriber.create();
        projectConfigRepository.create(config).subscribe().withSubscriber(subscriber);
        subscriber.awaitItem().assertItem(config);
        UniAssertSubscriber<Long> subscriber2 = UniAssertSubscriber.create();
        projectConfigRepository
                .deleteByProjectUrl(config.getProjectUrl())
                .subscribe()
                .withSubscriber(subscriber2);
        subscriber2.awaitItem().assertItem(1L);
    }

    @Test
    void insertKeepsDataUnique() {
        ProjectConfig config = createMockProjectConfig();
        projectConfigRepository
                .create(config)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(config);
        projectConfigRepository
                .create(config)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertItem(config);
        projectConfigRepository
                .findByProjectUrl(config.getProjectUrl())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        assertThat(projectConfigRepository
                        .findByProjectUrl(config.getProjectUrl())
                        .await()
                        .indefinitely())
                .hasSize(1);
    }

    private ProjectConfig createMockProjectConfig() {
        String projectUrl = faker.internet().url();
        String folder = faker.file().fileName();
        ProjectConfig config = new ProjectConfig(folder, projectUrl);
        return config;
    }
}
