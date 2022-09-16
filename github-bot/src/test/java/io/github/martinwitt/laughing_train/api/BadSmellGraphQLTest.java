package io.github.martinwitt.laughing_train.api;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
public class BadSmellGraphQLTest {
    @Test
    public void testGetAllBadSmells() {
        createWithMessage("PointLessBoolean").persist().await().indefinitely();
        createWithMessage("PointLessBoolean").persist().await().indefinitely();
    }

    private BadSmell createWithMessage(String ruleID) {
        return new BadSmell(
                ruleID, "filePath", new Position(0, 0, 0, 0, 0, 0), "message", "messageMarkdown", "snippet");
    }
}
