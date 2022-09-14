package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.Constants;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPullRequestResult;
import io.github.martinwitt.laughing_train.data.GitHubState;
import io.github.martinwitt.laughing_train.data.Issue;
import io.github.martinwitt.laughing_train.data.PullRequest;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class IssueRequestService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @ConsumeEvent(value = ServiceAdresses.FIND_ISSUE_REQUEST, blocking = true)
    public Uni<FindPullRequestResult> findPullRequests(FindIssueRequest request) {
        logger.atInfo().log("Got request %s", request);
        if (request instanceof FindIssueRequest.WithUserName userName) {
            logger.atInfo().log("Got user name %s", userName);
            return getOpenIssuesWithFixes(userName).log("openIssuesWithFixes");
        }
        throw new IllegalArgumentException("Unknown request type %s".formatted(request));
    }

    private Uni<FindPullRequestResult> getOpenIssuesWithFixes(FindIssueRequest.WithUserName userName) {
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
                .transform(v -> new FindPullRequestResult.MultipleResults(
                        v.stream().map(this::toPullRequest).collect(Collectors.toList())));
    }

    private PullRequest toPullRequest(GHIssue issue) {
        return new PullRequest(
                toPullRequestState(issue.getState()),
                issue.getTitle(),
                issue.getBody(),
                issue.getRepository().getOwnerName(),
                issue.getRepository().getName(),
                issue.getNumber(),
                issue.getHtmlUrl().toString());
    }

    private GitHubState toPullRequestState(GHIssueState state) {
        return Enum.valueOf(GitHubState.class, state.name());
    }

    @ConsumeEvent(value = ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, blocking = true)
    public Uni<FindIssueResult> getSummaryIssue(String ignored) {
        logger.atInfo().log("Finding summary issue");
        return findSummaryIssue();
    }

    private Uni<FindIssueResult> findSummaryIssue() {
        return Uni.createFrom()
                .item(Unchecked.supplier(() -> GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                        .getRepository("MartinWitt/laughing-train")
                        .queryIssues()
                        .pageSize(1)
                        .label("laughing-train-summary")
                        .state(GHIssueState.OPEN)
                        .list()
                        .toList()))
                .onItem()
                .transform(v -> {
                    if (v.isEmpty()) {
                        throw new IllegalStateException("No summary issue found");
                    }
                    return (toIssue(v.get(0)));
                })
                .onFailure()
                .call(v -> Uni.createFrom().item(new FindIssueResult.NoResult()))
                .onItem()
                .transform(FindIssueResult.SingleResult::new);
    }

    private Issue toIssue(GHIssue issue) {
        return new Issue(
                toPullRequestState(issue.getState()),
                issue.getTitle(),
                issue.getBody(),
                issue.getRepository().getOwnerName(),
                issue.getRepository().getName(),
                issue.getNumber(),
                issue.getHtmlUrl().toString());
    }
}
