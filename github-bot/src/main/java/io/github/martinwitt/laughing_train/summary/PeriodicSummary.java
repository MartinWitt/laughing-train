package io.github.martinwitt.laughing_train.summary;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPullRequestResult;
import io.github.martinwitt.laughing_train.data.GitHubState;
import io.github.martinwitt.laughing_train.data.Issue;
import io.github.martinwitt.laughing_train.data.PullRequest;
import io.github.martinwitt.laughing_train.services.ServiceAdresses;
import io.quarkus.scheduler.Scheduled;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import io.vertx.mutiny.core.eventbus.EventBus;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GitHub;

public class PeriodicSummary {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    EventBus eventBus;

    @Scheduled(every = "2h")
    public void createSummary() {
        eventBus.<FindIssueResult>request(ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, "message")
                .subscribe()
                .with(
                        v -> {
                            logger.atInfo().log("Got result %s", v);
                            if (v.body() instanceof FindIssueResult.SingleResult summary) {
                                updateContent(Uni.createFrom().item(summary.issue()));
                            } else if (v.body() instanceof FindIssueResult.NoResult noResult) {
                                logger.atInfo().log("No summary issue found, creating one");
                                createNewSummary();
                            } else {
                                logger.atWarning().log("No summary issue found %s", v);
                            }
                        },
                        e -> logger.atWarning().withCause(e).log("Error while finding summary issue"));
    }

    private void createNewSummary() {
        try {
            updateContent(createIssue());
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Failed to create summary issue");
        }
    }

    private Uni<Issue> createIssue() {
        return Uni.createFrom()
                .item(Unchecked.supplier(this::createNewIssue))
                .onItem()
                .transform(this::toIssue);
    }

    private GHIssue createNewIssue() throws IOException {
        return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                .getRepository("martinwitt/laughing-train")
                .createIssue("laughing-train-summary")
                .create();
    }

    private void updateContent(Uni<Issue> issue) {
        logger.atInfo().log("Updating summary issue");
        eventBus.<FindPullRequestResult>request(
                        ServiceAdresses.FIND_ISSUE_REQUEST, new FindIssueRequest.WithUserName("MartinWitt"))
                .subscribe()
                .with(
                        result -> {
                            logger.atInfo().log("Result %s", result);
                            if (result.body() instanceof FindPullRequestResult.MultipleResults multipleResults) {
                                updateBody(issue, multipleResults);
                            } else {
                                logger.atWarning().log("No pull requests found %s", result);
                            }
                        },
                        e -> logger.atSevere().withCause(e).log("Error while finding PRs"));
    }

    private void updateBody(Uni<Issue> issue, FindPullRequestResult.MultipleResults multipleResults) {
        try {
            issue.subscribe().with(Unchecked.consumer(v -> GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                    .getRepository("martinwitt/laughing-train")
                    .getIssue(v.number())
                    .setBody(createSummaryBody(multipleResults.pullRequests().stream()
                            .collect(Collectors.groupingBy(PullRequest::repo))))));
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while creating summary");
        }
    }

    private String createSummaryBody(Map<String, List<PullRequest>> prsByGHRepo) {
        var sb = new StringBuilder();
        sb.append("# Summary\n");
        for (var entry : prsByGHRepo.entrySet()) {
            sb.append("## %s%n".formatted(entry.getKey()));
            sb.append("| Rule | PR | State | \n");
            sb.append("|------|------|------| \n");
            var prs = entry.getValue();

            Collections.sort(prs, Comparator.comparing(PullRequest::state));
            for (var pr : prs) {
                sb.append("| %s | %s | %s | %n".formatted(findRuleID(pr.body()), pr.url(), pr.state()));
            }
        }
        return sb.toString();
    }

    private String findRuleID(String body) {
        return StringUtils.substringBetween(body, "ruleID:", "\n")
                .replace("\n", "")
                .replace("\"", "")
                .trim();
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

    private GitHubState toPullRequestState(GHIssueState state) {
        return Enum.valueOf(GitHubState.class, state.name());
    }
}
