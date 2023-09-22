package io.github.martinwitt.laughing_train.persistence;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mongodb.client.model.Filters;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.impl.MongoBadSmellRepository;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.utils.Contract;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.Random;
import org.junit.jupiter.api.Test;

@QuarkusTest
class DatabaseTest {

  @Inject BadSmellRepository badSmellRepository;

  @Inject MongoBadSmellRepository badSmellRepositoryImpl;

  @Test
  @Contract("A database can be queried for a ruleID")
  void createASingleBadSmell() {
    cleanDB();
    badSmellRepository.save(createWithMessage("PointLessBoolean"));
    assertThat(badSmellRepository.getAll().toList()).hasSize(1);
    // assertThat(badSmell.id).isNotNull();)
    assertEquals(1, badSmellRepository.findByRuleID(new RuleId("PointLessBoolean")).size());
  }

  @Test
  @Contract("Multiple BadSmells can be inserted into the database")
  void insertMultipleBadSmell() {
    cleanDB();
    badSmellRepository.save(createWithMessage("PointLessBoolean"));
    badSmellRepository.save(createWithMessage("PointLessBoolean"));
    assertEquals(2, badSmellRepository.findByRuleID(new RuleId("PointLessBoolean")).size());
  }

  @Test
  @Contract("A bad smell can be deleted from the database")
  void insertAndDeleteBadSmell() {
    cleanDB();
    var badSmell = createWithMessage("PointLessBoolean");
    badSmellRepository.save(badSmell);
    badSmellRepository.deleteByIdentifier(badSmell.getIdentifier());

    assertThat(badSmellRepository.findByIdentifier(badSmell.getIdentifier())).isEmpty();
  }

  @Test
  void filterForAnyContains() {
    cleanDB();
    var badSmell = createWithMessage("PointLessBoolean");

    badSmellRepository.save(badSmell);
    assertThat(
            badSmellRepositoryImpl
                .mongoCollection()
                .find((Filters.eq("commitHash", badSmell.getCommitHash())))
                .first())
        .isNotNull();
  }

  @Test
  void testMultiSearchQuery() {
    cleanDB();
    var badSmell = createWithMessage("PointLessBoolean");
    badSmellRepository.save(badSmell);
    var badSmell2 = createWithMessage("PointLessBoolean");
    badSmellRepository.save(badSmell2);
    assertThat(badSmellRepository.findByCommitHash("test", "JUNIT")).size().isEqualTo(2);
  }

  /** Cleans the database before each test. */
  private void cleanDB() {
    badSmellRepositoryImpl.deleteAll();
  }

  private BadSmell createWithMessage(String ruleID) {
    Random random = new Random();
    TestAnalyzerResult testAnalyzerResult =
        new TestAnalyzerResult(
            new RuleId(ruleID),
            "test",
            new Position(
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt()),
            "test");
    return new BadSmell(testAnalyzerResult, "test", "test", "test");
  }
}
