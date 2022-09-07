package io.github.martinwitt.laughing_train;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.quarkiverse.githubapp.event.IssueComment;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRepository;

public class MentionCommands {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    UserWhitelist whitelist;

    @Inject
    Config config;

    @Inject
    ChangelogPrinter changelogPrinter;

    @Inject
    QodanaService qodanaService;

    @Inject
    EventBus eventBus;

    void mentionCommands(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
        if (!whitelist.isWhitelisted(issueComment.getComment().getUser().getLogin())) {
            return;
        }
        String comment = issueComment.getComment().getBody();
        logger.atInfo().log("comment: %s", comment);
        if (comment.contains("@laughing-train config")) {
            var issues = findConfigIssue(issueComment);
            if (issues.isEmpty()) {
                createConfigIssue(issueComment.getRepository());
                return;
            } else {
                var issue = issues.get(0);
                issue.getComments().get(0).update(config.regenerateConfig());
            }
        }
        if (comment.contains("@laughing-train list")) {
            eventBus.<QodanaResult>request(
                            "qodana.analyzer", new AnalyzerRequest.UrlOnly(GitHubUtils.getTransportUrl(issueComment)))
                    .onComplete(new ListCommandHandler(issueComment));
            return;
        }
        if (comment.contains("@laughing-train close")) {
            closePullRequestsWithLabelName(GitHubUtils.getOpenPullRequests(issueComment), Constants.LABEL_NAME);
            return;
        }
    }

    private List<GHIssue> findConfigIssue(GHEventPayload.IssueComment issueComment) throws IOException {
        return issueComment.getRepository().queryIssues().creator(Constants.BOT_NAME).list().toList().stream()
                .filter(v -> v.getTitle().contains(Constants.CONFIG_ISSUE_NAME))
                .filter(v -> !v.isLocked())
                .collect(Collectors.toList());
    }

    private void closePullRequestsWithLabelName(List<GHPullRequest> pr, String name) {
        for (GHPullRequest ghPullRequest : pr) {
            ghPullRequest.getLabels().forEach(v -> {
                if (v.getName().equals(name)) {
                    try {
                        ghPullRequest.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void createConfigIssue(GHRepository repository) throws IOException {
        repository
                .createIssue(Constants.CONFIG_ISSUE_NAME)
                .body(config.regenerateConfig())
                .create();
    }

    private final class ListCommandHandler implements Handler<AsyncResult<Message<QodanaResult>>> {
        private final GHEventPayload.IssueComment issueComment;

        private ListCommandHandler(GHEventPayload.IssueComment issueComment) {
            this.issueComment = issueComment;
        }

        @Override
        public void handle(AsyncResult<Message<QodanaResult>> v) {
            try {
                if (v.succeeded()) {
                    if (v.result().body() instanceof QodanaResult.Success success) {
                        issueComment.getIssue().comment(changelogPrinter.printResults(success.result()));
                    } else if (v.result().body() instanceof QodanaResult.Failure error) {
                        issueComment.getIssue().comment(error.message());
                    } else {
                        logger.atSevere().withCause(v.cause()).log("error while analyzing");
                    }
                }
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("error while handling list command");
            }
        }
    }
}
