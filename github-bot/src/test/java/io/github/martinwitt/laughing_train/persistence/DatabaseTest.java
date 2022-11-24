package io.github.martinwitt.laughing_train.persistence;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.persistence.repository.BadSmellRepository;
import io.github.martinwitt.laughing_train.utils.Contract;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
public class DatabaseTest {

    @Inject
    BadSmellRepository badSmellRepository;

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
    @Contract("Multple BadSmells can be inserted into the database")
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

    /**
     * Cleans the databse before each test.
     */
    private void cleanDB() {
        badSmellRepository
                .getAll()
                .map(badSmell -> badSmellRepository.deleteByIdentifier(badSmell.getIdentifier()))
                .toUni()
                .subscribe()
                .withSubscriber(UniAssertSubscriber.create())
                .awaitItem();
    }

    private BadSmell createWithMessage(String ruleID) {
        TestAnalyzerResult testAnalyzerResult = new TestAnalyzerResult(
                new RuleId(ruleID), faker.file().fileName(), new Position(0, 0, 0, 0, 0, 0), "test");
        return new BadSmell(testAnalyzerResult, "test", "test", "test");
    }
}
