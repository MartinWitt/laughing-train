package io.github.martinwitt.laughing_train.persistence;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.impl.BadSmellRepositoryImpl;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.utils.Contract;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import java.util.Random;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
class DatabaseTest {

    @Inject
    BadSmellRepository badSmellRepository;

    @Inject
    BadSmellRepositoryImpl badSmellRepositoryImpl;

    private static Faker faker = new Faker();

    @Test
    @Contract("A database can be queried for a ruleID")
    void createASingleBadSmell() {
        cleanDB();
        badSmellRepository
                .save(createWithMessage("PointLessBoolean"))
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        assertThat(badSmellRepository
                        .getAll()
                        .collect()
                        .with(Collectors.counting())
                        .await()
                        .indefinitely())
                .isEqualTo(1);
        // assertThat(badSmell.id).isNotNull();)
        var list = badSmellRepository
                .findByRuleID(new RuleId("PointLessBoolean"))
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .getItem();
        assertEquals(1, list.size());
    }

    @Test
    @Contract("Multiple BadSmells can be inserted into the database")
    void insertMultipleBadSmell() {
        cleanDB();
        badSmellRepository
                .save(createWithMessage("PointLessBoolean"))
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        badSmellRepository
                .save(createWithMessage("PointLessBoolean"))
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        var list = badSmellRepository
                .findByRuleID(new RuleId("PointLessBoolean"))
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem()
                .getItem();
        assertEquals(2, list.size());
    }

    @Test
    @Contract("A bad smell can be deleted from the database")
    void insertAndDeleteBadSmell() {
        cleanDB();
        var badSmell = createWithMessage("PointLessBoolean");
        badSmellRepository
                .save(badSmell)
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        badSmellRepository
                .deleteByIdentifier(badSmell.getIdentifier())
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
        assertThat(badSmellRepository
                        .findByIdentifier(badSmell.getIdentifier())
                        .subscribe()
                        .withSubscriber(UniAssertSubscriber.create())
                        .awaitItem()
                        .getItem())
                .isEmpty();
    }
    /**
     * Cleans the database before each test.
     */
    private void cleanDB() {
        badSmellRepositoryImpl.deleteAll().await().indefinitely();
    }

    private BadSmell createWithMessage(String ruleID) {
        Random random = new Random();
        TestAnalyzerResult testAnalyzerResult = new TestAnalyzerResult(
                new RuleId(ruleID),
                faker.file().fileName(),
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
