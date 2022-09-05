package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.BranchNameSupplier;
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
import org.kohsuke.github.GHRef;
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
    BranchNameSupplier branchNameSupplier;

    void mining(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
        if (!whitelist.isWhitelisted(issueComment.getComment().getUser().getLogin())) {
            System.out.println("not whitelisted");
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
                config.setSrcFolder(repos);
                for (String url : repoUrls) {
                    config.setSrcFolder(".");
                    logger.atInfo().log("Mining %s", url);
                    List<AnalyzerResult> results = qodanaService.runQodana(url);
                    results.removeIf(v -> v.ruleID().equals("MethodMayBeStatic"));
                    results.removeIf(v -> v.ruleID().equals("ParameterNameDiffersFromOverriddenParameter"));
                    StringBuilder builder = new StringBuilder();
                    String repoName = StringUtils.substringAfterLast(url, "/");
                    builder.append("## ").append(repoName);
                    var resultsById = results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID));
                    for (var analyzerResult : resultsById.entrySet()) {
                        builder.append("### ")
                                .append(analyzerResult.getKey())
                                .append(" (")
                                .append(analyzerResult.getValue().size())
                                .append(")\n");
                        for (AnalyzerResult singleResult : analyzerResult.getValue()) {
                            builder.append(singleResult.position())
                                    .append("\n")
                                    .append(singleResult.message())
                                    .append("\n");
                        }
                    }
                    String branchName = branchNameSupplier.createBranchName();
                    GHRepository repo = issueComment.getRepository();
                    GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
                    repo.createContent()
                            .content(builder.toString())
                            .path("mining/" + repoName)
                            .message("mining " + repoName)
                            .sha(repo.getFileContent("mining/" + repoName).getSha())
                            .commit();
                    repo.createRef(
                            "refs/heads/" + branchName, mainRef.getObject().getSha());
                    repo.createPullRequest("Mining results", branchName, repo.getDefaultBranch(), builder.toString());
                }
            } catch (Exception e) {
                FileUtils.deleteDirectory(folder.toFile());
                e.printStackTrace();
            }
        }
    }
}
