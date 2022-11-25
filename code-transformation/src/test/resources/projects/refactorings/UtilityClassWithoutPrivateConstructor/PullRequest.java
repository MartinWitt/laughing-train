package xyz.keksdose.spoon.code_solver.github;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.transport.sshd.SshdSessionFactory;
import org.eclipse.jgit.transport.sshd.SshdSessionFactoryBuilder;
import org.eclipse.jgit.util.FS;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.config.ConfigStore;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class PullRequest {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public static void refactorRepoQodana(
            String repoName, String repoUrl, String gitHubRepoName, String sourceDirectory) {
        try {
            ConfigStore config = new ConfigStore();
            File tempRepoFolder = Files.createTempDirectory(repoName).toFile();
            Git.cloneRepository().setURI(repoUrl).setDirectory(tempRepoFolder).call();
            try (Repository repository = Git.open(tempRepoFolder).checkout().getRepository()) {
                Git git = new Git(repository);
                switchToCleanBranch(config, git);
                Changelog changelog = refactorFixPoint(sourceDirectory, tempRepoFolder);
                // Function<ChangeListener, TransformationProcessor<?>> qodanaRefactorFunction = setUpQodana(
                // 	sourceDirectory, tempRepoFolder, changeListener);
                // Changelog changelog = refactorFolderWithQodana(tempRepoFolder, changeListener,
                // qodanaRefactorFunction,
                // 		sourceDirectory);

                Optional<Change> optionalChange = getAnyChange(changelog);
                if (optionalChange.isPresent()) {
                    Change change = optionalChange.get();
                    Set<Change> changes = new HashSet<>();
                    changes.add(change);
                    changelog.getChanges().stream()
                            .filter(v -> v.getAffectedType().equals(change.getAffectedType()))
                            .forEach(changes::add);
                    addFileToGit(tempRepoFolder, git, change);
                    createCommit(config, git, changes);
                    printChangeLogMarkDown(config, changes);
                    setUpSshSession();
                    git.push().setRemote(gitHubRepoName).call();
                }
                git.close();
                PrintStream foo = new PrintStream(new File(tempRepoFolder, "changelog.md"));
                StringBuilder sb = new StringBuilder();
                foo.print(sb);
            } catch (IOException | GitAPIException e) {
                logger.atSevere().withCause(e).log("Could not refactor repo");
            }
        } catch (IOException | GitAPIException e) {
            logger.atSevere().withCause(e).log("Could not create temp directory");
        }
    }

    public static Changelog refactorFixPoint(String sourceDirectory, File tempRepoFolder) {
        Changelog startPoint = applyQodana(sourceDirectory, tempRepoFolder, true);
        System.out.println(startPoint.getChanges().size());
        do {
            Changelog iterativeResult = applyQodana(sourceDirectory, tempRepoFolder, true);
            var newChanges = iterativeResult.getChanges();
            newChanges.removeAll(startPoint.getChanges());
            if (newChanges.isEmpty()) {
                break;
            }
            startPoint.getChanges().addAll(newChanges);
            System.out.println("New changes");
            for (Change change : newChanges) {
                System.out.println(change.getChangeText().asText());
            }
        } while (!startPoint.getChanges().isEmpty());
        return startPoint;
    }

    private static Changelog applyQodana(String sourceDirectory, File tempRepoFolder, boolean keepCache) {
        var builder = new QodanaAnalyzer.Builder();
        if (keepCache) {
            builder.withRemoveResultDir(false);
        }
        ChangeListener listener = new ChangeListener();
        TransformationEngine transformationEngine = new TransformationEngine(List.of(v -> {
            QodanaAnalyzer qodanaAnalyzer = new QodanaAnalyzer.Builder().build();
            return new QodanaRefactor(
                    Arrays.asList(QodanaRules.values()), v, qodanaAnalyzer.runQodana(tempRepoFolder.toPath()));
        }));
        transformationEngine.setChangeListener(listener);
        return transformationEngine.applyToGivenPath(tempRepoFolder.getAbsolutePath() + sourceDirectory);
    }

    private static void setUpSshSession() {
        File sshDir = new File(FS.DETECTED.userHome(), "/.ssh");
        SshdSessionFactory sshSessionFactory = new SshdSessionFactoryBuilder()
                .setPreferredAuthentications("publickey")
                .setHomeDirectory(FS.DETECTED.userHome())
                .setSshDirectory(sshDir)
                .build(null);
        SshSessionFactory.setInstance(sshSessionFactory);
    }

    private static void printChangeLogMarkDown(ConfigStore config, Collection<Change> changes) {
        if (config.getPrintMarkdown()) {
            createMarkdown(changes, Path.of(config.getMarkdownChangeLogFile()));
        }
    }

    private static void createCommit(ConfigStore config, Git git, Change change) throws GitAPIException {
        git.commit()
                .setAuthor(config.getGitAuthor(), config.getGitEmail())
                .setMessage("refactor: \n " + getFixedIssues(change))
                .setSign(false)
                .call();
    }

    private static void createCommit(ConfigStore config, Git git, Collection<Change> changes) throws GitAPIException {
        git.commit()
                .setAuthor(config.getGitAuthor(), config.getGitEmail())
                .setMessage("refactor: style issues \n " + getFixedIssues(changes))
                .setSign(false)
                .call();
    }

    private static void addFileToGit(File tempRepoFolder, Git git, Change change) throws IOException, GitAPIException {
        File changedFile = change.getAffectedType().getPosition().getFile();
        Path changedFilePath = Files.find(
                        tempRepoFolder.toPath(),
                        Integer.MAX_VALUE,
                        (path, attributes) ->
                                path.getName(path.getNameCount() - 1).toString().equals(changedFile.getName()),
                        FileVisitOption.FOLLOW_LINKS)
                .findFirst()
                .get();
        String changedFileName =
                tempRepoFolder.toPath().relativize(changedFilePath).toString().replace("\\", "/");
        git.add().addFilepattern(changedFileName).call();
    }

    private static Optional<Change> getAnyChange(Changelog changelog) {
        Collections.shuffle(changelog.getChanges());
        return changelog.getChanges().stream().findAny();
    }

    private static void switchToCleanBranch(ConfigStore config, Git git) throws GitAPIException {
        git.checkout().setName(getDefaultBranchName(git)).call();
        git.checkout()
                .setForced(true)
                .setCreateBranch(true)
                .setName(config.getGitBranchPrefix() + LocalDateTime.now().getNano())
                .call();
    }

    private static String getDefaultBranchName(Git git) throws GitAPIException {
        return git.lsRemote().callAsMap().get("HEAD").getTarget().getName();
    }

    private static String getFixedIssues(Change change) {
        return Stream.of(change)
                .map(Change::getBadSmell)
                .filter(Objects::nonNull)
                .map(BadSmell::getName)
                .map(MarkdownString::asText)
                .distinct()
                .collect(Collectors.joining("\n"));
    }

    private static String getFixedIssues(Collection<Change> change) {
        return change.stream()
                .map(Change::getBadSmell)
                .filter(Objects::nonNull)
                .map(BadSmell::getName)
                .map(MarkdownString::asText)
                .distinct()
                .collect(Collectors.joining("\n"));
    }

    private static void createMarkdown(Change changelog, Path path) {
        Map<String, List<Change>> changesByType = new HashMap<>();
        changesByType.put(changelog.getIssue(), List.of(changelog));
        StringBuilder sb = new StringBuilder();
        sb.append("# Changelog\n");
        appendBadSmells(changelog, sb);
        sb.append("## The following has changed in the code:\n");
        appendChanges(changesByType, sb);
        try {
            Files.writeString(path, sb);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write markdown changelog" + path);
        }
    }

    private static void createMarkdown(Collection<Change> changelog, Path path) {
        Map<String, List<Change>> changesByType = new HashMap<>();
        changelog.forEach(v -> {
            if (changesByType.containsKey(v.getIssue())) {
                changesByType.get(v.getIssue()).add(v);
            } else {
                changesByType.put(v.getIssue(), new ArrayList<>(List.of(v)));
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append("# Changelog\n");
        appendBadSmells(changelog, sb);
        sb.append("## The following has changed in the code:\n");
        appendChanges(changesByType, sb);
        try {
            Files.writeString(path, sb);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write markdown changelog" + path);
        }
    }

    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
                    .collect(Collectors.joining("\n")));
            sb.append("\n");
        }
    }

    private static void appendBadSmells(Change changelog, StringBuilder sb) {
        sb.append("The following bad smells are refactored:\n");
        List<BadSmell> badSmells = Stream.of(changelog)
                .map(Change::getBadSmell)
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
        sb.append("\n");
    }

    private static void appendBadSmells(Collection<Change> changelog, StringBuilder sb) {
        sb.append("The following bad smells are refactored:\n");
        List<BadSmell> badSmells = changelog.stream()
                .map(Change::getBadSmell)
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
        sb.append("\n");
    }

    private static String getRelevantChangeLog(String name, Changelog log) {
        StringBuilder sb = new StringBuilder();
        sb.append("The following has changed in the code:\n");
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
        return sb.toString();
    }

}