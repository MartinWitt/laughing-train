package io.github.martinwitt.laughing_train.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.laughing_train.domain.value.RuleId;
import io.github.martinwitt.laughing_train.utils.Contract;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
public class DatabaseTest {

    @Test
    @Contract("A database can be queried for a ruleID")
    void createASingleBadSmell() {
        cleanDB();
        createWithMessage("PointLessBoolean").persist();
        // assertThat(badSmell.id).isNotNull();)
        assertEquals(1, BadSmell.findByRuleID(new RuleId("PointLessBoolean")).size());
    }

    @Test
    @Contract("Multple BadSmells can be inserted into the database")
    void insertMultipleBadSmell() {
        cleanDB();
        createWithMessage("PointLessBoolean").persist();
        createWithMessage("PointLessBoolean").persist();
        assertEquals(2, BadSmell.findByRuleID(new RuleId("PointLessBoolean")).size());
    }

    /**
     * Cleans the databse before each test.
     */
    private void cleanDB() {
        BadSmell.deleteAll();
    }

    private BadSmell createWithMessage(String ruleID) {

        TestAnalyzerResult testAnalyzerResult =
                new TestAnalyzerResult(new RuleId(ruleID), "filePath", new Position(0, 0, 0, 0, 0, 0), "test");
        return new BadSmell(testAnalyzerResult, "test", "test", "test");
    }
}
