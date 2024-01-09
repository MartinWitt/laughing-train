package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class AnalyzerResultsPersistenceTest {

  @Inject AnalyzerResultsPersistence analyzerResultsPersistence;
  @Inject AnalyzerRunRepository analyzerRunRepository;
  @Inject ProjectRepository projectRepository;

  @Test
  @TestTransaction
  void persistResults() {
    StoreResults storeResults =
        new StoreResults(
            Instancio.create(GitProject.class),
            Instancio.create(CodeAnalyzerResult.Success.class),
            "test");
    RemoteProject savedProject =
        new RemoteProject(storeResults.gitProject().name(), storeResults.gitProject().url());
    projectRepository.save(savedProject);
    analyzerResultsPersistence.persistResults(storeResults);
    assertThat(analyzerRunRepository.findRecent(1)).isNotEmpty();
    assertThat(
            projectRepository
                .findByProjectUrl(storeResults.gitProject().url())
                .getFirst()
                .getCommits())
        .isNotEmpty();
  }
}
