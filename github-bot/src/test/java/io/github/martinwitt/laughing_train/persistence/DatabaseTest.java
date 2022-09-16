package io.github.martinwitt.laughing_train.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.martinwitt.laughing_train.utils.Contract;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.helpers.test.UniAssertSubscriber;
import java.util.List;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
public class DatabaseTest {

    @Test
    @Contract("A database can be queried for a ruleID")
    void createASingleBadSmell() {
        cleanDB();
        createWithMessage("PointLessBoolean").persist().await().indefinitely();
        // assertThat(badSmell.id).isNotNull();)
        UniAssertSubscriber<List<BadSmell>> subscriber =
                BadSmell.findByRuleID("PointLessBoolean").subscribe().withSubscriber(UniAssertSubscriber.create());
        assertEquals(1, subscriber.awaitItem().assertCompleted().getItem().size());
    }

    @Test
    @Contract("Multple BadSmells can be inserted into the database")
    void insertMultipleBadSmell() {
        cleanDB();
        createWithMessage("PointLessBoolean").persist().await().indefinitely();
        createWithMessage("PointLessBoolean").persist().await().indefinitely();
        assertEquals(
                2,
                BadSmell.findByRuleID("PointLessBoolean").await().indefinitely().size());
    }

    /**
     * Cleans the databse before each test.
     */
    private void cleanDB() {
        BadSmell.deleteAll().await().indefinitely();
    }

    private BadSmell createWithMessage(String ruleID) {
        return new BadSmell(
                ruleID, "filePath", new Position(0, 0, 0, 0, 0, 0), "message", "messageMarkdown", "snippet");
    }
}
