package io.github.martinwitt.laughing_train.refactor;

import com.google.common.flogger.FluentLogger;
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
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.*;
import spoon.reflect.cu.SourcePositionHolder;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.api.CodeRefactoring;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.Changelog;

/**
 * This class provides the functionality to refactor bad smells in a codebase and create a pull
 * request with the refactored changes.
 */
@ApplicationScoped
public class RefactorService {

  private static final String SPOON_ANALYZER = "Spoon";
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final String LABEL_NAME = "laughing-train-repair";
  private final BranchNameSupplier branchNameSupplier;
  private final ChangelogPrinter changelogPrinter;

  public RefactorService(BranchNameSupplier branchNameSupplier, ChangelogPrinter changelogPrinter) {
    this.branchNameSupplier = branchNameSupplier;
    this.changelogPrinter = changelogPrinter;
  }

  /**
   * Fixes bad smells in a collection of BadSmell objects.
   *
   * @param badSmells The collection of BadSmell objects representing the bad smells to be fixed.
   * @return The URL string representing the result of the fixing process.
   */
  public String fixBadSmells(Collection<? extends BadSmell> badSmells) {
    var badSmellByAnalyzer =
        badSmells.stream().collect(Collectors.groupingBy(BadSmell::getAnalyzer));
    String url = "";
    for (Map.Entry<String, ? extends List<? extends BadSmell>> entry :
        badSmellByAnalyzer.entrySet()) {
      url = handleAnalyzerAndReturnUrl(entry, url);
    }
    return url;
  }

  /**
   * Handles the analyzer and returns the URL.
   *
   * @param entry The entry containing the analyzer and the list of bad smells
   * @param url The URL string
   * @return The updated URL string after handling the analyzer
   */
  private String handleAnalyzerAndReturnUrl(
      Map.Entry<String, ? extends List<? extends BadSmell>> entry, String url) {
    var analyzer = entry.getKey();
    var badSmellList = entry.getValue();

    switch (analyzer) {
      case SPOON_ANALYZER:
        url = refactorSpoon(badSmellList);
        break;
      default:
        logger.atWarning().log("Unknown analyzer %s", analyzer);
    }

    return url;
  }

  /**
   * Refactors bad smells in the given list of BadSmell objects.
   *
   * @param badSmells The list of BadSmell objects representing the bad smells to be refactored.
   * @return The result of the refactoring process, which is either a success message or an error
   *     message.
   */
  private String refactorSpoon(List<? extends BadSmell> badSmells) {
    String projectUrl = badSmells.getFirst().getProjectUrl();
    Result<GitProject> projectResult = GitRepoHandler.cloneGitProject(projectUrl);
    if (projectResult.isError()) {
      logger.atSevere().log("Failed to get project %s", projectResult.getError().getMessage());
      return "Error";
    }
    GitProject project = projectResult.get();
    File folder = project.folder();
    Path folderPath = folder.toPath(); // Extracted folder path for repeated use
    try {
      CodeRefactoring codeRefactoring = new CodeRefactoring();
      Changelog log = codeRefactoring.refactorBadSmells(folderPath, badSmells);
      Result<GitHub> githubConnectionResult = GitHubConnector.connectOAuth();
      if (githubConnectionResult.isError()) {
        throw new RuntimeException(githubConnectionResult.getError());
      }
      GitHub github = githubConnectionResult.get();
      GHRepository repository = getOrCreateFork(project, github);
      GitHubUtils.createLabelIfMissing(repository);
      return createSinglePullRequest(repository, folderPath, log.getChanges(), badSmells);
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Failed to create pull request.");
      FileUtils.deleteQuietly(folder);
      return "Error";
    }
  }

  /**
   * Retrieves or creates a fork for the given GitProject.
   *
   * @param gitProject The GitProject for which to get or create a fork.
   * @param github The GitHub instance used for the operation.
   * @return The forked GHRepository if it exists, otherwise the created GHRepository.
   * @throws IOException if an I/O error occurs.
   */
  private GHRepository getOrCreateFork(GitProject gitProject, GitHub github) throws IOException {
    logger.atInfo().log("Creating fork for %s", gitProject.getOwnerRepoName());
    if (isRepositoryNotFound(gitProject, github)) {
      GHRepository originalRepository = github.getRepository(gitProject.getOwnerRepoName());
      logger.atInfo().log("Forking %s", gitProject.getOwnerRepoName());
      return originalRepository.fork();
    } else {
      logger.atInfo().log("Found fork %s", gitProject.name());
      return github.getMyself().getRepository(gitProject.name());
    }
  }

  /**
   * Checks if the repository for a given GitProject is not found in the provided GitHub instance.
   *
   * @param gitProject The GitProject object representing the project to check.
   * @param github The GitHub instance to check against.
   * @return {@code true} if the repository is not found, {@code false} otherwise.
   * @throws IOException if an I/O exception occurs during the operation.
   */
  private static boolean isRepositoryNotFound(GitProject gitProject, GitHub github)
      throws IOException {
    return github.getMyself().getRepository(gitProject.name()) == null;
  }

  /**
   * Creates a single pull request for the given repository, directory, changes, and bad smells.
   *
   * @param repo The GHRepository object representing the repository.
   * @param dir The directory path where the changes are located.
   * @param changes The list of changes to be included in the pull request.
   * @param badSmells The list of bad smells associated with the changes.
   * @return The URL of the created pull request.
   * @throws IOException if an I/O error occurs.
   */
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

  /**
   * Creates the title for a pull request based on the list of changes.
   *
   * @param changes The list of changes
   * @return The pull request title
   */
  private String createPullRequestTitle(List<? extends Change> changes) {
    String title = "refactor: refactor bad smell %s";
    if (changes.stream().map(Change::getBadSmell).distinct().count() == 1) {
      return String.format(title, changes.getFirst().getBadSmell().getName().asText());
    } else {
      return String.format(
          title,
          changes.stream()
              .map(v -> v.getBadSmell().getName().asText())
              .distinct()
              .collect(Collectors.joining(", ")));
    }
  }

  /**
   * Creates a new commit for the given repository.
   *
   * @param repo the GitHub repository
   * @param dir the directory containing the changes
   * @param changes the list of changes to be committed
   * @param ref the reference to commit to
   * @throws IOException if an I/O error occurs during the commit creation process
   */
  private void createCommit(GHRepository repo, Path dir, List<? extends Change> changes, GHRef ref)
      throws IOException {
    List<CtType<?>> types =
        changes.stream().map(Change::getAffectedType).collect(Collectors.toList());
    GHTree tree = createTreeForCommit(repo, dir, ref, types);
    var commit = createNewCommit(repo, tree, changes, ref);
    logger.atInfo().log("Created commit %s", commit.getHtmlUrl());
  }

  /**
   * Creates a tree for the commit.
   *
   * @param repo the repository
   * @param dir the directory
   * @param ref the reference
   * @param types the list of types
   * @return the created tree
   * @throws IOException if an I/O error occurs
   */
  private GHTree createTreeForCommit(
      GHRepository repo, Path dir, GHRef ref, List<? extends CtType<?>> types) throws IOException {
    var treeBuilder = repo.createTree().baseTree(ref.getObject().getSha());
    for (CtType<?> ctType : types) {
      treeBuilder.add(
          relativize(dir, getFileForType(ctType)),
          Files.readString(getFileForType(ctType)).replace("\r\n", "\n"),
          false);
    }
    return treeBuilder.create();
  }

  /**
   * Creates a new commit in a given repository.
   *
   * @param repo The GitHub repository.
   * @param tree The tree object representing the changes.
   * @param changes The list of changes to be included in the commit.
   * @param ref The reference object for the commit.
   * @return The newly created commit.
   * @throws IOException If an I/O error occurs while creating the commit.
   */
  private GHCommit createNewCommit(
      GHRepository repo, GHTree tree, List<? extends Change> changes, GHRef ref)
      throws IOException {
    String commitMessage = createCommitMessage(changes);
    var commit =
        repo.createCommit()
            .message(commitMessage)
            .author("MartinWitt", "wittlinger.martin@gmail.com", Date.from(Instant.now()))
            .tree(tree.getSha())
            .parent(ref.getObject().getSha())
            .create();
    ref.updateTo(commit.getSHA1());
    return commit;
  }

  /**
   * Creates the commit message based on a list of changes.
   *
   * @param changes The list of changes to be included in the commit message
   * @return The commit message string
   */
  private String createCommitMessage(List<? extends Change> changes) {
    if (allChangesHaveSameBadSmell(changes)) {
      var refactorBadSmell = changes.getFirst().getBadSmell();
      return "Refactor bad smell %s\n%s"
          .formatted(
              refactorBadSmell.getName().asText(), refactorBadSmell.getDescription().asText());
    } else {
      return "Refactor bad smells %s\n"
          .formatted(
              changes.stream()
                  .map(v -> v.getBadSmell().getName().asText())
                  .distinct()
                  .collect(Collectors.joining(", ")));
    }
  }

  /**
   * Determines whether all changes in a collection have the same bad smell.
   *
   * @param changes the collection of changes to be checked
   * @return {@code true} if all changes have the same bad smell, {@code false} otherwise
   */
  private static boolean allChangesHaveSameBadSmell(Collection<? extends Change> changes) {
    return changes.stream().map(Change::getBadSmell).distinct().count() == 1;
  }

  /**
   * Returns the file path of the given CtType.
   *
   * @param type The CtType for which the file path is to be obtained.
   * @return The file path of the CtType.
   */
  private Path getFileForType(SourcePositionHolder type) {
    return type.getPosition().getFile().toPath();
  }

  /**
   * Relativizes the given child path against the root path. Returns the relative path as a string
   * with forward slashes (/) as the directory separator.
   *
   * @param root the root path
   * @param child the child path
   * @return the relative path as a string
   */
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

  /**
   * Creates a pull request in a GitHub repository.
   *
   * @param repo The GitHub repository where the pull request will be created
   * @param branchName The name of the branch for the pull request
   * @param body The body content of the pull request
   * @param commitNameTitle The commit name/title of the pull request
   * @return The URL of the created pull request
   * @throws IOException if an error occurs while creating the pull request
   */
  private String createPullRequest(
      GHRepository repo, String branchName, String body, String commitNameTitle)
      throws IOException {
    GHPullRequest pullRequest =
        repo.createPullRequest(commitNameTitle, branchName, repo.getDefaultBranch(), body);
    pullRequest.addLabels(LABEL_NAME);
    return pullRequest.getHtmlUrl().toString();
  }
}
