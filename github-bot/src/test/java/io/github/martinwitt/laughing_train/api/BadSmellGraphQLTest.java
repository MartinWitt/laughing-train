package io.github.martinwitt.laughing_train.api;

import static io.smallrye.graphql.client.core.Document.document;
import static io.smallrye.graphql.client.core.Field.field;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.utils.TestAnalyzerResult;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.graphql.client.Response;
import io.smallrye.graphql.client.core.Argument;
import io.smallrye.graphql.client.core.Document;
import io.smallrye.graphql.client.core.Operation;
import io.smallrye.graphql.client.core.OperationType;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClientBuilder;
import java.util.regex.Pattern;
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
        TestAnalyzerResult testAnalyzerResult =
                new TestAnalyzerResult(ruleID, "filePath", new Position(0, 0, 0, 0, 0, 0), "test");
        return new BadSmell(testAnalyzerResult, "test", "test", "test");
    }

    @Test
    // @Disabled("Only for local testing")
    void getBadSmellFromLive() throws Exception {
        client = DynamicGraphQLClientBuilder.newBuilder()
                .url("https://laughing-train.keksdose.xyz/graphql")
                // .url("http://localhost:8081/graphql")
                .build();
        Document document = document(Operation.operation(
                OperationType.QUERY,
                field(
                        "byRuleID",
                        Argument.args(Argument.arg("ruleID", "InnerClassMayBeStatic")),
                        field("ruleID"),
                        field("message"),
                        field("projectName"),
                        field("filePath"),
                        field("position", field("startLine")))));
        Response response = client.executeSync(document);
        System.out.println(response.getData().toString().replaceAll(Pattern.quote("},{"), "\n"));
    }

    @Test
    void queryInsertedProject() throws Exception {
        client = DynamicGraphQLClientBuilder.newBuilder()
                // .url("http://www.keksdose.xyz:8080/graphql")
                .url("http://localhost:8081/graphql")
                .build();
        Project project = new Project("aaa", "bbb");
        project.persistOrUpdate();
        project.addCommitHash("aaaa");
        project.persistOrUpdate();
        Project.<Project>listAll().forEach(v -> System.out.println(v.getCommitHashes()));
        assertTrue(client.executeSync(
                        """
                        query getProjects {
                            getProjects {
                                projectName
                                projectUrl
                                commitHashes
                            }
                        }
                         """)
                .getData()
                .toString()
                .contains("aaa"));
    }
}
