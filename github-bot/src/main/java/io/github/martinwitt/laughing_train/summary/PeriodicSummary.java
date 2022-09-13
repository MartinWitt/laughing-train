package io.github.martinwitt.laughing_train.summary;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.FindIssueRequest;
import io.github.martinwitt.laughing_train.data.FindIssueResult;
import io.github.martinwitt.laughing_train.data.FindPrResult;
import io.github.martinwitt.laughing_train.services.ServiceAdresses;
import io.quarkus.scheduler.Scheduled;
import io.vertx.mutiny.core.eventbus.EventBus;
import java.io.IOException;
import java.util.Collections;
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
        eventBus.<FindIssueResult>request(ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, "message")
                .subscribe()
                .with(
                        v -> {
                            if (v.body() instanceof FindIssueResult.SingleResult summary) {
                                updateContent(summary.issue());
                            }
                        },
                        e -> {
                            try {
                                updateContent(createIssue());
                            } catch (Exception e2) {
                                logger.atSevere().withCause(e2).log("Error while creating summary");
                            }
                        });
    }

    private GHIssue createIssue() throws IOException {
        GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
        return github.getRepository("martinwitt/laughing-train")
                .createIssue("laughing-train-summary")
                .create();
    }

    private void updateContent(GHIssue issue) {
        eventBus.<FindPrResult>request(
                        ServiceAdresses.FIND_ISSUE_REQUEST, new FindIssueRequest.WithUserName("MartinWitt"))
                .subscribe()
                .with(result -> {
                    if (result.body() instanceof FindPrResult.Success success) {
                        try {
                            var prsByGHRepo = success.pullRequest().stream()
                                    .collect(Collectors.groupingBy(GHIssue::getRepository));
                            var sb = new StringBuilder();
                            sb.append("# Summary\n");
                            for (var entry : prsByGHRepo.entrySet()) {
                                sb.append("## %s%n".formatted(entry.getKey().getName()));
                                sb.append("| Rule | PR | State | %n");
                                sb.append("|------|------|------| %n");
                                var prs = entry.getValue();
                                Collections.sort(prs, (a, b) -> a.getState().compareTo(b.getState()));
                                for (var pr : prs) {
                                    sb.append("| %s | %s | %s | %n"
                                            .formatted(findRuleID(pr.getBody()), pr.getHtmlUrl(), pr.getState()));
                                }
                            }
                            issue.setBody(sb.toString());
                        } catch (Exception e) {
                            logger.atSevere().withCause(e).log("Error while creating summary");
                        }
                    }
                });
    }

    private String findRuleID(String body) {
        return StringUtils.substringBetween(body, "ruleID:", "\n");
    }
}
