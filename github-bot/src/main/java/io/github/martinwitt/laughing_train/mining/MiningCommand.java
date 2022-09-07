package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.ChangelogPrinter;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.GitHubUtils;
import io.github.martinwitt.laughing_train.UserWhitelist;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.quarkiverse.githubapp.event.IssueComment;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHRepository;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

public class MiningCommand {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    UserWhitelist whitelist;

    @Inject
    Config config;

    @Inject
    QodanaService qodanaService;

    @Inject
    ChangelogPrinter changelogPrinter;

    @Inject
    EventBus eventBus;

    void mining(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
        if (!whitelist.isWhitelisted(issueComment.getComment().getUser().getLogin())) {
            logger.atInfo().log(
                    "User %s is not whitelisted",
                    issueComment.getComment().getUser().getLogin());
            return;
        }
        if (issueComment.getComment().getBody().contains("@laughing-train mining")) {
            config.setSrcFolder(".");
            Path folder = Files.createTempDirectory("laughing-wiki");
            try (Git git = Git.cloneRepository()
                    .setURI("https://github.com/MartinWitt/laughing-train.wiki.git")
                    .setDirectory(folder.toFile())
                    .call()) {
                Path miningFile = folder.resolve("Mining.md");
                String repos = StringUtils.substringBetween(
                        Files.readString(miningFile), "<!-- repoStart -->", "<!-- reposEnd -->");
                List<String> repoUrls = repos.lines().map(String::trim).collect(Collectors.toList());
                repoUrls.removeIf(String::isEmpty);
                logger.atInfo().log("Mining %d repos", repoUrls.size());
                logger.atInfo().log("Mining %s", repoUrls);
                for (String url : repoUrls) {
                    String repoName = StringUtils.substringAfterLast(url, "/");
                    GHRepository repo = issueComment.getRepository();
                    eventBus.<QodanaResult>request(
                            "qodana.analyzer.request",
                            new AnalyzerRequest.UrlOnly(GitHubUtils.getTransportUrl(issueComment)),
                            new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(30)),
                            new MiningCommandResultHandler(repo, repoName));
                }
            } catch (Exception e) {
                FileUtils.deleteDirectory(folder.toFile());
                logger.atSevere().withCause(e).log("Error while mining");
            }
        }
    }

    private final class MiningCommandResultHandler implements Handler<AsyncResult<Message<QodanaResult>>> {
        private final GHRepository repo;
        private final String repoName;

        private MiningCommandResultHandler(GHRepository repo, String repoName) {
            this.repo = repo;
            this.repoName = repoName;
        }

        private void updateOrCreateContent(GHRepository repo, String repoName, List<AnalyzerResult> results) {
            try {
                repo.getFileContent(
                                "mining/" + repoName + ".md",
                                "gh-mining")
                        .update(changelogPrinter.printResults(results), "Update mining results for " + repoName);
            } catch (Exception ignore) {
                logger.atSevere().withCause(ignore).log("Error while updating mining results");
                try {
                    repo.createContent()
                            .content(changelogPrinter.printResults(results))
                            .path("mining/" + repoName + ".md")
                            .message("mining " + repoName)
                            .branch("gh-mining")
                            .commit();
                } catch (Exception e) {
                    logger.atSevere().withCause(e).log("Error while creating mining file");
                }
            }
        }

        @Override
        public void handle(AsyncResult<Message<QodanaResult>> v) {
            logger.atInfo().log("mining command handler result %s", v);
            try {
                if (v.succeeded()) {
                    if (v.result().body() instanceof QodanaResult.Success success) {
                        var results = success.result();
                        results.removeIf(list -> list.ruleID().equals("MethodMayBeStatic"));
                        results.removeIf(list -> list.ruleID().equals("ParameterNameDiffersFromOverriddenParameter"));
                        updateOrCreateContent(repo, repoName, results);
                    } else if (v.result().body() instanceof QodanaResult.Failure error) {
                        logger.atSevere().log("Error while mining %s", error.message());
                    } else {
                        logger.atSevere().withCause(v.cause()).log("error while analyzing");
                    }
                }
                if (v.failed()) {
                    logger.atSevere().withCause(v.cause()).log("error while analyzing");
                }
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("error while handling ming command");
            }
        }
    }
}
