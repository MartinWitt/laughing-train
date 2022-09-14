package io.github.martinwitt.laughing_train.summary;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.PullRequest;
import io.github.martinwitt.laughing_train.services.ServiceAdresses;
import io.quarkus.scheduler.Scheduled;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import io.vertx.mutiny.core.eventbus.EventBus;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GitHub;

public class PeriodicSummary {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    EventBus eventBus;

    @Scheduled(every = "2h")
    public void createSummary() {
        eventBus.addOutboundInterceptor(event -> {
            logger.atInfo().log("Sending event %s", event);
            event.next();
        });
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

    private Uni<GHIssue> createIssue() throws IOException {
        GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
        return Uni.createFrom().item(Unchecked.supplier(() -> github.getRepository("martinwitt/laughing-train")
                .createIssue("laughing-train-summary")
                .create()));
    }

    private void updateContent(Uni<GHIssue> issue) {
        logger.atInfo().log("Updating summary issue");
        eventBus.<List<PullRequest>>request(
                        ServiceAdresses.FIND_ISSUE_REQUEST, new FindIssueRequest.WithUserName("MartinWitt"))
                .log()
                .subscribe()
                .with(
                        result -> {
                            logger.atInfo().log("Result %s", result);
                            try {
                                var prsByGHRepo =
                                        result.body().stream().collect(Collectors.groupingBy(PullRequest::repo));
                                var sb = new StringBuilder();
                                sb.append("# Summary\n");
                                for (var entry : prsByGHRepo.entrySet()) {
                                    sb.append("## %s%n".formatted(entry.getKey()));
                                    sb.append("| Rule | PR | State | %n");
                                    sb.append("|------|------|------| %n");
                                    var prs = entry.getValue();
                                    Collections.sort(prs, (a, b) -> a.state().compareTo(b.state()));
                                    for (var pr : prs) {
                                        sb.append("| %s | %s | %s | %n"
                                                .formatted(findRuleID(pr.body()), pr.url(), pr.state()));
                                    }
                                }
                                issue.subscribe().with(Unchecked.consumer(v -> v.setBody(sb.toString())));
                            } catch (Exception e) {
                                logger.atSevere().withCause(e).log("Error while creating summary");
                            }
                        },
                        e -> logger.atSevere().withCause(e).log("Error while finding PRs"));
    }

    private String findRuleID(String body) {
        return StringUtils.substringBetween(body, "ruleID:", "\n");
    }
}
