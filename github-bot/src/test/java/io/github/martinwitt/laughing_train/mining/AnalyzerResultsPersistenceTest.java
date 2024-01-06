package io.github.martinwitt.laughing_train.mining;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AnalyzerResultsPersistenceTest {

  @Inject AnalyzerResultsPersistence analyzerResultsPersistence;
  @Inject AnalyzerRunRepository analyzerRunRepository;

  @Test
  @TestTransaction
  void persistResults() {
    StoreResults storeResults =
        new StoreResults(
            Instancio.create(GitProject.class),
            Instancio.create(CodeAnalyzerResult.Success.class),
            "test");
    analyzerResultsPersistence.persistResults(storeResults);
    assertThat(analyzerRunRepository.findRecent(1)).isNotEmpty();
  }
}
