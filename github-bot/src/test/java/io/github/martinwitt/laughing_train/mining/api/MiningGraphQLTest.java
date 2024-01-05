package io.github.martinwitt.laughing_train.mining.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.laughing_train.mining.AnalyzerRun;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

@QuarkusTest
class MiningGraphQLTest {

  @Inject AnalyzerRunRepository analyzerRunRepository;

  @Test
  @TestTransaction
  void testRecentRuns() {
    AnalyzerRun analyzerRun = Instancio.create(AnalyzerRun.class);
    analyzerRunRepository.save(analyzerRun);
    assertEquals(analyzerRunRepository.findRecent(1).getFirst(), analyzerRun);
  }
}
