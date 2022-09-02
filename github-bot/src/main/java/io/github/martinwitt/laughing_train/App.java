package io.github.martinwitt.laughing_train;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import com.google.common.flogger.FluentLogger;
import io.quarkiverse.githubapp.event.Issue;
import io.quarkiverse.githubapp.event.IssueComment;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRef;
import org.kohsuke.github.GHRepository;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class App {

    private static final ObjectMapper MAPPER =
            new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));

    private static final String CONFIG_ISSUE_NAME = "[Config] Laughing-train";

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private static final String BOT_NAME = "laughing-train[bot]";

    private static final String TEMP_FOLDER_PREFIX = "laughing-train";

    private static final String RESET_CONFIG_BUTTON = "- [x] <!-- reset --> Force refresh config";

    private static final String CREATE_FIXES_BUTTON = "- [x] <!-- createPRs --> Create fixes with given config";

    private static final String DISABLE_ALL_RULES_BUTTON = "- [x] <!-- disableAllRules --> Disables all rules";

    /**
     *
     */
    private static final String LABEL_NAME = "laughing-train-repair";

    @Inject
    private BranchNameSupplier branchNameSupplier;

    @Inject
    private ChangelogPrinter changelogPrinter;

    @Inject
    private MarkdownPrinter markdownPrinter;

    @Inject
    private Config config;

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
        System.out.println("onEditConfig");
        if (isNotConfigIssue(issueComment) || isFromSelf(issueComment) || isClosed(issueComment)) {
            logger.atInfo().log("Ignoring config edit because it is not a config issue or it is from self");
            return;
        }
        if (containsFlag(issueComment.getIssue(), RESET_CONFIG_BUTTON)) {
            issueComment.getIssue().setBody(regenerateConfig());
            return;
        }

        refreshConfig(issueComment);

        if (containsFlag(issueComment.getIssue(), CREATE_FIXES_BUTTON)) {
            issueComment.getIssue().setBody(refreshFlag(issueComment.getIssue().getBody(), CREATE_FIXES_BUTTON));
            createFixes(issueComment);
            return;
        }
        if (containsFlag(issueComment.getIssue(), DISABLE_ALL_RULES_BUTTON)) {
            issueComment.getIssue().setBody(refreshFlag(issueComment.getIssue().getBody(), DISABLE_ALL_RULES_BUTTON));
            disableAllRules();
            issueComment.getIssue().setBody(regenerateConfig());
            return;
        }
    }

    private void createFixes(GHEventPayload.Issue issueComment) throws IOException {
        Path dir = Files.createTempDirectory(TEMP_FOLDER_PREFIX);
        try (Closeable closeable = () -> FileUtils.deleteDirectory(dir.toFile())) {
            Map<CtType<?>, List<Change>> changesByType =
                    groupChangesByType(refactorRepo(issueComment.getRepository().getHttpTransportUrl(), dir));
            GHRepository repo = issueComment.getRepository();
            createLabelIfMissing(repo);
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

    private boolean isClosed(GHEventPayload.Issue issueComment) {
        return issueComment.getIssue().getState() != GHIssueState.OPEN;
    }

    private boolean isFromSelf(GHEventPayload.Issue issueComment) {
        return issueComment.getSender().getLogin().equals(BOT_NAME);
    }

    private boolean isNotConfigIssue(GHEventPayload.Issue issueComment) {
        return !issueComment.getIssue().getTitle().equals(CONFIG_ISSUE_NAME);
    }

    void mentionList(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
        if (isSelf(issueComment) || isNotMartin(issueComment)) {
            return;
        }
        String comment = issueComment.getComment().getBody();
        System.out.println(comment);
        if (comment.contains("@laughing-train config")) {
            var issues = issueComment.getRepository().queryIssues().creator(BOT_NAME).list().toList().stream()
                    .filter(v -> v.getTitle().contains(CONFIG_ISSUE_NAME))
                    .filter(v -> !v.isLocked())
                    .collect(Collectors.toList());
            System.out.println(issues);
            if (issues.isEmpty()) {
                createConfigIssue(issueComment.getRepository());
                return;
            } else {
                var issue = issues.get(0);
                issue.getComments().get(0).update(regenerateConfig());
            }
        }
        if (comment.contains("@laughing-train list")) {
            issueComment
                    .getIssue()
                    .comment(printResults(runQodana(issueComment.getRepository().getHttpTransportUrl())));
            return;
        }
        if (comment.contains("@laughing-train close")) {
            closePullRequestsWithLabelName(getOpenPullRequests(issueComment), LABEL_NAME);
            return;
        }
    }

    private void createConfigIssue(GHRepository repository) throws IOException {

        repository.createIssue(CONFIG_ISSUE_NAME).body(regenerateConfig()).create();
    }

    private String regenerateConfig() {
        String options = "";
        try {
            options = markdownPrinter.toYamlMarkdown(MAPPER.writeValueAsString(config));
            System.out.println(options);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String configString =
                """
                ## Configure your repository
                ---
                ### Config
                <!-- config-start -->
                %s
                <!-- config-end -->
                ---
                ### Action Buttons
                 - [ ] <!-- reset --> Force refresh config
                 - [ ] <!-- createPRs --> Create fixes with given config
                 - [ ] <!-- disableAllRules --> Disables all rules
                """;
        return "Hi, In this issue you can configure laughing-train. The config uses yaml syntax. \n"
                + String.format(configString, options);
    }

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        if (changesByType.size() > 10) {
            System.out.println("Too many changes, not creating PRs");
            return;
        }
        for (var entry : changesByType.entrySet()) {
            String branchName = branchNameSupplier.createBranchName();
            repo.createRef("refs/heads/" + branchName, mainRef.getObject().getSha());
            StringBuilder body = new StringBuilder();
            body.append(changelogPrinter.printRepairedIssues(entry.getValue()));
            createCommit(repo, dir, entry.getKey(), branchName);
            body.append(changelogPrinter.printChangeLog(entry.getValue()));
            createPullRequest(repo, entry.getKey().getQualifiedName(), branchName, body.toString());
        }
    }

    private ChangeListener refactorRepo(String repoUrl, Path dir) {
        System.setProperty("line.separator", "\n");
        var results = runQodana(repoUrl, dir);
        System.out.println(config.getActiveRules());
        ChangeListener changeListener = new ChangeListener();
        Function<ChangeListener, TransformationProcessor<?>> function =
                (v -> new QodanaRefactor(config.getActiveRules(), v, results));
        TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
        transformationEngine.setChangeListener(changeListener);
        System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
        transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
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

    private void createCommit(GHRepository repo, Path dir, CtType<?> entry, String branchName) throws IOException {
        repo.createContent()
                .branch(branchName)
                .message("Repair code style issues in " + entry.getQualifiedName())
                .path(relativize(dir, getFileForType(entry)))
                .content(Files.readString(getFileForType(entry)).replace("\r\n", "\n"))
                .sha(repo.getFileContent(relativize(dir, getFileForType(entry))).getSha())
                .commit();
    }

    private Path getFileForType(CtType<?> type) {
        return type.getPosition().getFile().toPath();
    }

    private void createLabelIfMissing(GHRepository repo) throws IOException {
        try {
            repo.getLabel(LABEL_NAME);
        } catch (Exception e) {
            repo.createLabel(LABEL_NAME, "8ef76c");
        }
    }

    private List<GHPullRequest> getOpenPullRequests(GHEventPayload.IssueComment issueComment) throws IOException {
        return issueComment.getRepository().getPullRequests(GHIssueState.OPEN);
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

    private boolean isNotMartin(org.kohsuke.github.GHEventPayload.IssueComment issueComment) {
        return !issueComment.getSender().getLogin().equals("MartinWitt");
    }

    private boolean isSelf(GHEventPayload.IssueComment issueComment) {
        return issueComment.getSender().getLogin().equals(BOT_NAME);
    }

    private List<AnalyzerResult> runQodana(String gitUrl) throws IOException {
        Path tempDir = Files.createTempDirectory(TEMP_FOLDER_PREFIX);
        try {
            logger.atInfo().log("Cloning %s to %s", gitUrl, tempDir);
            return runQodana(gitUrl, tempDir);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // FileUtils.deleteDirectory(tempDir.toFile());
        }
        return List.of();
    }

    private List<AnalyzerResult> runQodana(String gitUrl, Path dir) {
        try (Git git =
                Git.cloneRepository().setURI(gitUrl).setDirectory(dir.toFile()).call()) {
            Path file = Files.createTempDirectory("laughing-qodana");
            QodanaAnalyzer analyzer = new QodanaAnalyzer.Builder()
                    .withResultFolder(file.toAbsolutePath().toString())
                    .withRemoveResultDir(false)
                    .build();
            logger.atInfo().log("Running qodana %s to %s", gitUrl, dir);
            logger.atInfo().log("Content of temp clone Folder");
            Files.walk(dir).forEach(System.out::println);
            return analyzer.runQodana(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }

    private String printResults(List<AnalyzerResult> results) {
        Set<String> ruleIds =
                config.getActiveRules().stream().map(QodanaRules::getRuleId).collect(Collectors.toSet());
        List<AnalyzerResult> activeRuleResults =
                results.stream().filter(v -> ruleIds.contains(v.ruleID())).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        sb.append("# Bad smells\n");
        sb.append(String.format("I found %s bad smells:", activeRuleResults.size()))
                .append("\n");
        for (AnalyzerResult result : activeRuleResults) {

            sb.append("## " + result.ruleID())
                    .append("\n")
                    .append(result.messageMarkdown())
                    .append("\n")
                    .append("in ")
                    .append(markdownPrinter.toMarkdown(result.filePath()))
                    .append("\n")
                    .append("### Snippet")
                    .append("\n")
                    .append(markdownPrinter.toJavaMarkdownBlock(result.snippet()));
        }
        return sb.toString();
    }
}
