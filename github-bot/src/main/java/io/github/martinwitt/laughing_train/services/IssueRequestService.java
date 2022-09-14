package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPrResult;
import io.github.martinwitt.laughing_train.data.PullRequest;
import io.github.martinwitt.laughing_train.data.PullRequest.PullRequestState;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class IssueRequestService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @ConsumeEvent(value = ServiceAdresses.FIND_ISSUE_REQUEST, blocking = true, local = true)
    public Uni<FindPrResult> findPullRequests(FindIssueRequest request) {
        logger.atInfo().log("Got request %s", request);
        if (request instanceof FindIssueRequest.WithUserName userName) {
            logger.atInfo().log("Got user name %s", userName);
            return getOpenIssuesWithFixes(userName);
        }
        return Uni.createFrom().item(() -> new FindPrResult.Error("Unknown request type %s".formatted(request)));
    }

    private Uni<FindPrResult> getOpenIssuesWithFixes(FindIssueRequest.WithUserName userName) {
        return Uni.createFrom()
                .item(Unchecked.supplier(() -> GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                        .searchIssues()
                        .q("is:pr")
                        .q("author:" + userName.userName())
                        .q("-label:" + Constants.LABEL_NAME)
                        .q("ruleID in:body")
                        .list()
                        .toList()))
                .onItem()
                .transform(v -> new FindPrResult.Success(
                        v.stream().map(this::toPullRequest).collect(Collectors.toList())));
    }

    private PullRequest toPullRequest(GHIssue issue) {
        String title = issue.getTitle();
        String body = issue.getBody();
        String owner = issue.getRepository().getOwnerName();
        String repo = issue.getRepository().getName();
        int number = issue.getNumber();
        String url = issue.getHtmlUrl().toString();
        PullRequest.PullRequestState state = toPullRequestState(issue.getState());
        return new PullRequest(state, title, body, owner, repo, number, url);
    }

    private PullRequestState toPullRequestState(GHIssueState state) {
        return Enum.valueOf(PullRequest.PullRequestState.class, state.name());
    }

    @ConsumeEvent(value = ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, blocking = true)
    public Uni<FindIssueResult> getSummaryIssue(String ignored) {
        logger.atInfo().log("Finding summary issue");
        return Uni.createFrom().item(this::toResult);
    }

    private Optional<GHIssue> findSummaryIssue() throws IOException {
        GHRepository repo =
                GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN")).getRepository("MartinWitt/laughing-train");
        logger.atInfo().log("Found repo %s", repo);
        var foo = repo.queryIssues()
                .pageSize(1)
                .label("laughing-train-summary")
                .state(GHIssueState.OPEN)
                .list()
                .toList();
        if (foo.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(foo.get(0));
    }

    private FindIssueResult toResult() {
        try {
            var result = findSummaryIssue();
            logger.atInfo().log("Found summary issue %s", result);
            if (result.isPresent()) {
                return new FindIssueResult.SingleResult(result.get());
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error finding summary issue");
        }
        return new FindIssueResult.NoResult();
    }
}
