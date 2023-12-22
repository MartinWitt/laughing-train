package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import com.google.errorprone.annotations.Var;
import io.github.martinwitt.laughing_train.ChangelogPrinter;
import io.github.martinwitt.laughing_train.commons.GitHubConnector;
import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.commons.GitRepoHandler;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.github.martinwitt.laughing_train.github.BranchNameSupplier;
import io.github.martinwitt.laughing_train.github.GitHubUtils;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRef;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.api.CodeRefactoring;
import xyz.keksdose.spoon.code_solver.diffs.DiffCleaner;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.Changelog;

@ApplicationScoped
public class RefactorService {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final String LABEL_NAME = "laughing-train-repair";
  final BranchNameSupplier branchNameSupplier;
  final ChangelogPrinter changelogPrinter;
  final DiffCleaner diffCleaner;

  public RefactorService(BranchNameSupplier branchNameSupplier, ChangelogPrinter changelogPrinter) {
    diffCleaner = new DiffCleaner();
    this.branchNameSupplier = branchNameSupplier;
    this.changelogPrinter = changelogPrinter;
  }

  public String refactor(Collection<? extends BadSmell> badSmells) {
    logger.atInfo().log("Refactoring %d bad smells", badSmells.size());
    var badSmellByAnalyzer =
        badSmells.stream().collect(Collectors.groupingBy(BadSmell::getAnalyzer));
    String url = "";
    for (var entry : badSmellByAnalyzer.entrySet()) {
      var analyzer = entry.getKey();
      var badSmellList = entry.getValue();
      switch (analyzer) {
        case "Qodana" -> refactorQodana(badSmellList);
        case "Spoon" -> url = refactorSpoon(badSmellList);
        default -> logger.atWarning().log("Unknown analyzer %s", analyzer);
      }
      logger.atInfo().log("Refactoring");
    }
    return url;
  }

  private String refactorSpoon(List<? extends BadSmell> badSmells) {
    String projectUrl = badSmells.get(0).getProjectUrl();

    Result<GitProject> project = GitRepoHandler.cloneGitProject(projectUrl);
    if (project.isOk()) {
      File folder = project.get().folder();
      try {
        CodeRefactoring codeRefactoring = new CodeRefactoring();
        Changelog log = codeRefactoring.refactorBadSmells(folder.toPath(), badSmells);
        Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
        if (githubConnectionResult.isError()) {
          throw new RuntimeException(githubConnectionResult.getError());
        }
        GitHub github = githubConnectionResult.get();
        GHRepository repository = createForkIfMissing(project.get(), github);
        GitHubUtils.createLabelIfMissing(repository);
        return createSinglePullRequest(repository, folder.toPath(), log.getChanges(), badSmells);
      } catch (Exception e) {
        logger.atSevere().withCause(e).log("Failed to create pull request");
        FileUtils.deleteQuietly(folder);
      }
    }
    return "Error";
  }

  private void refactorQodana(List<? extends BadSmell> badSmells) {
    String projectUrl = badSmells.get(0).getProjectUrl();
    Result<GitProject> projectResult = GitRepoHandler.cloneGitProject(projectUrl);
    createPullRequest(projectResult, badSmells);
  }

  private String createPullRequest(Result<GitProject> project, List<? extends BadSmell> badSmells) {
    if (project.isError()) {
      logger.atSevere().log("Failed to get project %s", project.getError().getMessage());
      return project.getError().getMessage();
    }

    File folder = project.get().folder();
    try {
      CodeRefactoring codeRefactoring = new CodeRefactoring();
      Changelog log = codeRefactoring.refactorBadSmells(folder.toPath(), badSmells);
      Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
      if (githubConnectionResult.isError()) {
        throw new RuntimeException(githubConnectionResult.getError());
      }
      GitHub github = githubConnectionResult.get();
      GHRepository repository = createForkIfMissing(project.get(), github);
      GitHubUtils.createLabelIfMissing(repository);
      String pullRequestTitle =
          createSinglePullRequest(repository, folder.toPath(), log.getChanges(), badSmells);
      FileUtils.deleteQuietly(folder);
      return pullRequestTitle;
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Failed to create pull request");
      FileUtils.deleteQuietly(folder);
    }

    return "Error";
  }

  private GHRepository createForkIfMissing(GitProject gitProject, GitHub github)
      throws IOException {
    logger.atInfo().log("Creating fork for %s", gitProject.getOwnerRepoName());
    @Var GHRepository repository = github.getRepository(gitProject.getOwnerRepoName());
    if (github.getMyself().getRepository(gitProject.name()) == null) {
      logger.atInfo().log("Forking %s", gitProject.getOwnerRepoName());
      repository = repository.fork();
    } else {
      logger.atInfo().log("Found fork %s", gitProject.name());
      repository = github.getMyself().getRepository(gitProject.name());
    }
    return repository;
  }

  private String createSinglePullRequest(
      GHRepository repo,
      Path dir,
      List<? extends Change> changes,
      List<? extends BadSmell> badSmells)
      throws IOException {
    GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
    logger.atInfo().log("Found changes for %s types", changes.size());
    String branchName = branchNameSupplier.createBranchName();
    GHRef ref = repo.createRef("refs/heads/" + branchName, mainRef.getObject().getSha());
    StringBuilder body = new StringBuilder();
    body.append(changelogPrinter.printRepairedIssues(changes));
    body.append(changelogPrinter.printBadSmellFingerPrints(badSmells));
    createCommit(repo, dir, changes, ref);
    body.append(changelogPrinter.printChangeLogShort(changes));
    return createPullRequest(repo, branchName, body.toString(), createPullRequestTitle(changes));
  }

  private String createPullRequestTitle(List<? extends Change> changes) {
    String title = "refactor: refactor bad smell %s";
    if (changes.stream().map(Change::getBadSmell).distinct().count() == 1) {
      return String.format(title, changes.get(0).getBadSmell().getName().asText());
    } else {
      return String.format(
          title,
          changes.stream()
              .map(v -> v.getBadSmell().getName().asText())
              .distinct()
              .collect(Collectors.joining(", ")));
    }
  }

  private void createCommit(GHRepository repo, Path dir, List<? extends Change> changes, GHRef ref)
      throws IOException {
    List<CtType<?>> types =
        changes.stream().map(Change::getAffectedType).collect(Collectors.toList());
    var treeBuilder = repo.createTree().baseTree(ref.getObject().getSha());
    for (CtType<?> ctType : types) {
      treeBuilder.add(
          relativize(dir, getFileForType(ctType)),
          Files.readString(getFileForType(ctType)).replace("\r\n", "\n"),
          false);
    }
    var tree = treeBuilder.create();
    String commitMessage = createCommitMessage(changes);
    var commit =
        repo.createCommit()
            .message(commitMessage)
            .author("MartinWitt", "wittlinger.martin@gmail.com", Date.from(Instant.now()))
            .tree(tree.getSha())
            .parent(ref.getObject().getSha())
            .create();
    ref.updateTo(commit.getSHA1());
    logger.atInfo().log("Created commit %s", commit.getHtmlUrl());
  }

  private String createCommitMessage(List<? extends Change> changes) {
    StringBuilder message = new StringBuilder();
    if (changes.stream().map(Change::getBadSmell).distinct().count() == 1) {
      message
          .append("Refactor bad smell ")
          .append(changes.get(0).getBadSmell().getName().asText())
          .append("\n\n")
          .append(changes.get(0).getBadSmell().getDescription().asText());

    } else {
      message
          .append("Refactor bad smells ")
          .append(
              changes.stream()
                  .map(v -> v.getBadSmell().getName().asText())
                  .distinct()
                  .collect(Collectors.joining(", ")))
          .append("\n");
    }
    return message.toString();
  }

  private Path getFileForType(CtType<?> type) {
    return type.getPosition().getFile().toPath();
  }

  private String relativize(Path root, Path child) {
    try {
      Path relative =
          root.toRealPath(LinkOption.NOFOLLOW_LINKS)
              .relativize(child.toRealPath(LinkOption.NOFOLLOW_LINKS));
      return relative.toString().replace('\\', '/');
    } catch (IOException e) {
      logger.atSevere().withCause(e).log("Failed to relativize %s", child);
    }
    return "";
  }

  private String createPullRequest(
      GHRepository repo, String branchName, String body, String commitNameTitle)
      throws IOException {
    GHPullRequest pullRequest =
        repo.createPullRequest(commitNameTitle, branchName, repo.getDefaultBranch(), body);
    pullRequest.addLabels(LABEL_NAME);
    return pullRequest.getHtmlUrl().toString();
  }
}
