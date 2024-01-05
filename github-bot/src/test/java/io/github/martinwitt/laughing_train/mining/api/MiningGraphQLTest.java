package io.github.martinwitt.laughing_train.mining.api;

import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MiningGraphQLTest {

  @Inject MiningGraphQL miningGraphQL;
  @Inject ProjectRepository projectRepository;

  @Test
  @TestTransaction
  public void testRecentRuns() {
    RemoteProject projectDao = Instancio.create(RemoteProject.class);
    projectDao.getCommits().clear();
    GitHubCommit commit = new GitHubCommit();
    commit.setCommitHash("123");
    projectDao.addCommitHash(commit);
    projectRepository.save(projectDao);
    assertEquals(projectRepository.getAll().getFirst(), projectDao);
    assertEquals(1, miningGraphQL.recentRuns(1).size());
  }
}
