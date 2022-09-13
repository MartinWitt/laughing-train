package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPrResult;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import java.io.IOException;
import javax.enterprise.context.ApplicationScoped;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class IssueRequestService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @ConsumeEvent(value = ServiceAdresses.FIND_ISSUE_REQUEST, blocking = true)
    public Uni<FindPrResult> findPullRequests(FindIssueRequest request) {
        if (request instanceof FindIssueRequest.WithUserName userName) {
            return getOpenIssuesWithFixes(userName);
        }
        return Uni.createFrom().item(() -> new FindPrResult.Error("Unknown request type %s".formatted(request)));
    }

    private Uni<FindPrResult> getOpenIssuesWithFixes(FindIssueRequest.WithUserName userName) {
        return Uni.createFrom()
                .item(Unchecked.supplier(
                        () -> new FindPrResult.Success(GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                                .searchIssues()
                                .q("is:pr")
                                .q("author:" + userName.userName())
                                .q("-label:" + Constants.LABEL_NAME)
                                .q("ruleID in:body")
                                .list()
                                .toList())));
    }

    @ConsumeEvent(value = ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, blocking = true)
    public Uni<FindIssueResult> getSummaryIssue(String ignored) {
        logger.atInfo().log("Finding summary issue");
        return Uni.createFrom().item(Unchecked.supplier(() -> new FindIssueResult.SingleResult(findSummaryIssue())));
    }

    private GHIssue findSummaryIssue() throws IOException {
        GHRepository repo =
                GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN")).getRepository("MartinWitt/laughing-train");
        logger.atInfo().log("Found repo %s", repo);
        return repo.queryIssues()
                .pageSize(1)
                .label("laughing-train-summary")
                .state(GHIssueState.OPEN)
                .list()
                .toList()
                .get(0);
    }
}
