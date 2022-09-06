package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.ChangelogPrinter;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.QodanaService;
import io.github.martinwitt.laughing_train.UserWhitelist;
import io.quarkiverse.githubapp.event.IssueComment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
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

    void mining(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
        if (!whitelist.isWhitelisted(issueComment.getComment().getUser().getLogin())) {
            logger.atInfo().log(
                    "User %s is not whitelisted",
                    issueComment.getComment().getUser().getLogin());
            return;
        }
        if (issueComment.getComment().getBody().contains("@laughing-train mining")) {
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
                    logger.atInfo().log("Mining %s", url);
                    List<AnalyzerResult> results = qodanaService.runQodana(url);
                    results.removeIf(v -> v.ruleID().equals("MethodMayBeStatic"));
                    results.removeIf(v -> v.ruleID().equals("ParameterNameDiffersFromOverriddenParameter"));
                    GHRepository repo = issueComment.getRepository();
                    String repoName = StringUtils.substringAfterLast("/", url);
                    repo.createContent()
                            .content(changelogPrinter.printResults(results))
                            .path("mining/" + repoName +".md")
                            .message("mining " + repoName)
                            .commit();
                }
            } catch (Exception e) {
                FileUtils.deleteDirectory(folder.toFile());
                logger.atSevere().withCause(e).log("Error while mining");
            }
        }
    }
}
