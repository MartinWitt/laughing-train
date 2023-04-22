package io.github.martinwitt.laughing_train.github_miner.persistence.impl;

import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.instancio.Instancio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MongoGitHubProjectRepositoryTest {

    @Inject
    MongoGitHubProjectRepository repository;

    @BeforeEach
    void setUp() {
        clearDB();
    }

    @Test
    void insertSimpleProject() {
        GitHubProject project = Instancio.create(GitHubProject.class);
        UniAssertSubscriber<Boolean> subscriber =
                repository.insertProject(project).subscribe().withSubscriber(UniAssertSubscriber.create());
        subscriber.awaitItem().assertCompleted().assertItem(true);
    }

    @Test
    void findOnEmptyReturnsNull() {
        GitHubProject project = Instancio.create(GitHubProject.class);
        UniAssertSubscriber<GitHubProject> findAssert = repository
                .findProject(project.getRepositoryName(), project.getRepositoryOwner())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create());
        var item = findAssert.awaitItem().assertCompleted().getItem();
        Assertions.assertThat(item).isNull();
    }

    @Test
    void insertDuplicateProject() {
        GitHubProject project = Instancio.create(GitHubProject.class);
        UniAssertSubscriber<Boolean> subscriber =
                repository.insertProject(project).subscribe().withSubscriber(UniAssertSubscriber.create());
        subscriber.awaitItem().assertCompleted().assertItem(true);
        subscriber = repository.insertProject(project).subscribe().withSubscriber(UniAssertSubscriber.create());
        subscriber.awaitItem().assertCompleted().assertItem(false);
    }

    @Test
    void insertSimpleProjectAndFind() {

        GitHubProject project = Instancio.create(GitHubProject.class);
        UniAssertSubscriber<Boolean> subscriber =
                repository.insertProject(project).subscribe().withSubscriber(UniAssertSubscriber.create());
        subscriber.awaitItem().assertCompleted().assertItem(true);

        repository
                .count()
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertCompleted()
                .assertItem(1L);

        UniAssertSubscriber<GitHubProject> findAssert = repository
                .findProject(project.getRepositoryName(), project.getRepositoryOwner())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create());
        var item = findAssert.awaitItem().assertCompleted().getItem();
        System.out.println("Project from db is:" + item);
        Assertions.assertThat(item).isNotNull();
        Assertions.assertThat(item.getRepositoryName()).isEqualTo(project.getRepositoryName());
    }

    private void clearDB() {
        repository
                .deleteAll()
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .assertCompleted();
    }
}
