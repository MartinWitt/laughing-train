package io.github.martinwitt.laughing_train.api;

import static io.smallrye.graphql.client.core.Document.document;
import static io.smallrye.graphql.client.core.Field.field;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.graphql.client.Response;
import io.smallrye.graphql.client.core.Argument;
import io.smallrye.graphql.client.core.Document;
import io.smallrye.graphql.client.core.Operation;
import io.smallrye.graphql.client.core.OperationType;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClientBuilder;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;

@QuarkusTest
public class BadSmellGraphQLTest {

    DynamicGraphQLClient client;

    @Test
    void testGetAllBadSmells() throws Exception {
        client = DynamicGraphQLClientBuilder.newBuilder()
                // .url("http://89.58.49.108:8080/graphql")
                .url("http://localhost:8081/graphql")
                .build();
        createWithMessage("UnnecessaryLocalVariable").persist();
        createWithMessage("UnnecessaryLocalVariable").persist();
        Document document = document(Operation.operation(
                OperationType.QUERY,
                field("byRuleID", Argument.args(Argument.arg("ruleID", "UnnecessaryLocalVariable")), field("ruleID"))));
        Response response = client.executeSync(document);
        assertTrue(response.getData().toString().contains("UnnecessaryLocalVariable"));
    }

    private BadSmell createWithMessage(String ruleID) {
        return new BadSmell(
                ruleID, "filePath", new Position(0, 0, 0, 0, 0, 0), "message", "messageMarkdown", "snippet");
    }
}
