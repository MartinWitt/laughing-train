package xyz.keksdose.spoon.code_solver.github;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import xyz.keksdose.spoon.code_solver.config.ConfigStore;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CommitBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
            Git git = new Git(repository);
            git.checkout().setName(config.getGitDefaultBranchName()).call();
            git.checkout()
                    .setForced(true)
                    .setCreateBranch(true)
                    .setName(config.getGitBranchPrefix() + file)
                    .call();
            Changelog changelog = transformation.apply(sourceFiles, file);
            git.commit()
                    .setAll(true)
                    .setAuthor(config.getGitAuthor(), config.getGitEmail())
                    .setMessage("refactor(" + file + "): \n " + getRelevantChangeLog(file, changelog))
                    .call();
            git.close();
            if (config.getPrintMarkdown()) {
                createMarkdown(changelog, Path.of(config.getMarkdownChangeLogFile()));
            }
        } catch (IOException | GitAPIException e) {
            logger.atSevere().withCause(e).log("Could not refactor repo");
        }
    }

    private static void createMarkdown(Changelog changelog, Path path) {
        Map<String, List<Change>> changesByType =
                changelog.getChanges().stream().collect(Collectors.groupingBy(Change::getIssue));
        StringBuilder sb = new StringBuilder();
        sb.append("# Change Log\n");
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

    private static void appendBadSmells(Changelog changelog, StringBuilder sb) {
        sb.append("The following bad smells are refactored:\n");
        List<BadSmell> badSmells = changelog.getChanges().stream()
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

    private CommitBuilder() {
        // UtilityClass
    }
}
