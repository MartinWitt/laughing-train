package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.quarkiverse.githubapp.event.Issue;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRef;
import org.kohsuke.github.GHRepository;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class App {

    private static final ObjectMapper MAPPER =
            new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String RESET_CONFIG_BUTTON = "- [x] <!-- reset -->";
    private static final String CREATE_FIXES_BUTTON = "- [x] <!-- createPRs -->";
    private static final String DISABLE_ALL_RULES_BUTTON = "- [x] <!-- disableAllRules -->";
    private static final String LABEL_NAME = "laughing-train-repair";

    @Inject
    BranchNameSupplier branchNameSupplier;

    @Inject
    ChangelogPrinter changelogPrinter;

    @Inject
    MarkdownPrinter markdownPrinter;

    @Inject
    Config config;

    @Inject
    UserWhitelist userWhitelist;

    @Inject
    QodanaService qodanaService;

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
        System.out.println("onEditConfig");
        if (isNotConfigIssue(issueComment)
                || !userWhitelist.isWhitelisted(GitHubUtils.getLogin(issueComment))
                || GitHubUtils.isClosed(issueComment)) {
            logger.atInfo().log("Ignoring config edit because it is not a config issue or it is from self");
            return;
        }
        if (containsFlag(issueComment.getIssue(), RESET_CONFIG_BUTTON)) {
            issueComment.getIssue().setBody(config.regenerateConfig());
        }
        refreshConfig(issueComment);
        if (containsFlag(issueComment.getIssue(), CREATE_FIXES_BUTTON)) {
            issueComment.getIssue().setBody(refreshFlag(issueComment.getIssue().getBody(), CREATE_FIXES_BUTTON));
            createFixes(issueComment);
            logger.atInfo().log("Fixes created");
        }
        if (containsFlag(issueComment.getIssue(), DISABLE_ALL_RULES_BUTTON)) {
            issueComment.getIssue().setBody(refreshFlag(issueComment.getIssue().getBody(), DISABLE_ALL_RULES_BUTTON));
            disableAllRules();
            issueComment.getIssue().setBody(config.regenerateConfig());
        }
    }

    private void createFixes(GHEventPayload.Issue issueComment) throws IOException {
        Path dir = Files.createTempDirectory(Constants.TEMP_FOLDER_PREFIX);
        try (Closeable closeable = () -> FileUtils.deleteDirectory(dir.toFile())) {
            Map<CtType<?>, List<Change>> changesByType =
                    groupChangesByType(refactorRepo(issueComment.getRepository().getHttpTransportUrl(), dir));
            GHRepository repo = issueComment.getRepository();
            GitHubUtils.createLabelIfMissing(repo);
            createPullRequestForAffectedType(repo, dir, changesByType);
        }
    }

    private void refreshConfig(GHEventPayload.Issue issueComment) throws JsonProcessingException {
        String body = issueComment.getIssue().getBody();
        String newConfig = body.substring(body.indexOf("<!-- config-start -->"), body.indexOf("<!-- config-end -->"));
        newConfig = newConfig.replace("```yaml", "").replace("```", "");
        newConfig = newConfig.replace("<!-- config-start -->", "").replace("<!-- config-end -->", "");
        config.fromConfig(MAPPER.readValue(newConfig, Config.class));
        logger.atInfo().log("Refreshed config");
        logger.atInfo().log(config.toString());
    }

    private void disableAllRules() {
        config.getRules().entrySet().forEach(entry -> entry.setValue(false));
    }

    private boolean containsFlag(GHIssue issue, String flag) {
        return issue.getBody().contains(flag);
    }

    private String refreshFlag(String body, String flag) {
        return body.replace(flag, flag.replace("[x]", "[ ]"));
    }

    private boolean isNotConfigIssue(GHEventPayload.Issue issueComment) {
        return !issueComment.getIssue().getTitle().equals(Constants.CONFIG_ISSUE_NAME);
    }

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log(
                "Found changes for %s types", changesByType.entrySet().size());
        if (changesByType.entrySet().size() > config.getMaximumNumberOfPrs()) {
            logger.atInfo().log(
                    "Too many changes, skipping, %s", changesByType.entrySet().size());
            return;
        }
        for (var entry : changesByType.entrySet()) {
            String branchName = branchNameSupplier.createBranchName();
            GHRef ref = repo.createRef(
                    "refs/heads/" + branchName, mainRef.getObject().getSha());
            StringBuilder body = new StringBuilder();
            body.append(changelogPrinter.printRepairedIssues(entry.getValue()));
            createCommit(repo, dir, entry.getKey(), ref);
            body.append(changelogPrinter.printChangeLog(entry.getValue()));
            createPullRequest(repo, entry.getKey().getQualifiedName(), branchName, body.toString());
        }
    }

    private ChangeListener refactorRepo(String repoUrl, Path dir) {
        ChangeListener changeListener = new ChangeListener();
        try {
            var results = qodanaService.runQodana(repoUrl, dir);
            System.out.println(config.getActiveRules());
            Function<ChangeListener, TransformationProcessor<?>> function =
                    (v -> new QodanaRefactor(config.getActiveRules(), v, results));
            TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
            transformationEngine.setChangeListener(changeListener);
            System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
            transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Failed to refactor repo");
        }
        return changeListener;
    }

    private Map<CtType<?>, List<Change>> groupChangesByType(ChangeListener changeListener) {
        return changeListener.getChangelog().getChanges().stream()
                .collect(Collectors.groupingBy(Change::getAffectedType));
    }

    private void createPullRequest(GHRepository repo, String typeName, String branchName, String body)
            throws IOException {
        repo.createPullRequest("fix Bad Smells in " + typeName, branchName, repo.getDefaultBranch(), body)
                .addLabels(LABEL_NAME);
    }

    private void createCommit(GHRepository repo, Path dir, CtType<?> entry, GHRef ref) throws IOException {
        var tree = repo.createTree()
                .baseTree(ref.getObject().getSha())
                .add(
                        relativize(dir, getFileForType(entry)),
                        Files.readString(getFileForType(entry)).replace("\r\n", "\n"),
                        false)
                .create();

        var commit = repo.createCommit()
                .message("fix Bad Smells in " + entry.getQualifiedName())
                .author("MartinWitt", "wittlinger.martin@gmail.com", Date.from(Instant.now()))
                .tree(tree.getSha())
                .parent(ref.getObject().getSha())
                .create();
        logger.atInfo().log("Created commit %s", commit.getHtmlUrl());
        /*
        .content(new String(Files.readAllBytes(dir.resolve(entry.getPosition().getFile().getPath()))))
        .path(entry.getPosition().getFile().getPath())
        .branch(branchName)
        .message("fix Bad Smells in " + entry.getQualifiedName())
        .commit();

        repo.createContent()
        .branch(branchName)
        .message("Repair code style issues in " + entry.getQualifiedName())
        .path(relativize(dir, getFileForType(entry)))
        .content(Files.readString(getFileForType(entry)).replace("\r\n", "\n"))
        .sha(repo.getFileContent(relativize(dir, getFileForType(entry))).getSha())
        .commit();
                        */
    }

    private Path getFileForType(CtType<?> type) {
        return type.getPosition().getFile().toPath();
    }

    private String relativize(Path root, Path child) {
        try {
            Path relative =
                    root.toRealPath(LinkOption.NOFOLLOW_LINKS).relativize(child.toRealPath(LinkOption.NOFOLLOW_LINKS));
            return relative.toString().replace('\\', '/');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
