package io.github.martinwitt.laughing_train.gitprojects;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.result.Result;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;
import org.jetbrains.annotations.NotNull;

@ApplicationScoped
public class ProjectService {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final Random random = new Random();

  private final Vertx vertx;

  public ProjectService(Vertx vertx) {
    this.vertx = vertx;
  }

  public Result<GitProject> processProjectRequest(String repoUrl) {
    try {
      String repoName = extractRepoName(repoUrl);
      Path projectDirectory = createProjectDir(repoName);

      Result<Git> checkedOutRepoResult = checkoutRepo(repoUrl, projectDirectory);
      if (checkedOutRepoResult.isError()) {
        return cleanupAndReturnError(projectDirectory);
      }
      Git gitRepository = checkedOutRepoResult.get();
      logger.atInfo().log("Cloned %s to %s", repoUrl, projectDirectory);

      Result<String> commitHash = getLatestCommitHash(gitRepository);
      if (commitHash.isError()) {
        return cleanupAndReturnError(projectDirectory);
      }
      return Result.ok(createProject(repoName, repoUrl, projectDirectory, gitRepository));
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while handling project request %s", repoUrl);
      return Result.error(e);
    }
  }

  private String extractRepoName(String repoURL) {
    return StringUtils.substringAfterLast(repoURL, "/").replace(".git", "");
  }

  private GitProject createProject(
      String repoName, String repoURL, Path projectDirectory, Git gitRepository) {
    String commitHash = getLatestCommitHash(gitRepository).get();
    return new GitProject(repoName, repoURL, projectDirectory.toFile(), ".", commitHash);
  }

  private Path createProjectDir(String repoName) throws IOException {
    Path projectDir = Files.createTempDirectory("laughing-train-" + repoName + random.nextLong());
    cleanAfter60min(projectDir);
    return projectDir;
  }

  private Result<GitProject> cleanupAndReturnError(Path projectDir) {
    FileUtils.deleteQuietly(projectDir.toFile());
    return Result.error(new IllegalArgumentException("Could not checkout repo"));
  }

  private void cleanAfter60min(Path dir) {
    vertx.setTimer(
        Duration.ofMinutes(60).toMillis(),
        unused -> {
          if (Files.exists(dir)) {
            FileUtils.deleteQuietly(dir.toFile());
            logger.atInfo().log("Deleted %s", dir);
          }
        });
  }

  /**
   * Retrieves the latest commit hash from a Git repository.
   *
   * @param git the Git object representing the repository
   * @return a Result object containing the commit hash if successful, or an error if an exception
   *     occurs
   */
  private Result<String> getLatestCommitHash(Git git) {
    try {
      return Result.ok(getLatestCommitId(git));
    } catch (GitAPIException e) {
      return Result.error(e);
    }
  }

  private static String getLatestCommitId(Git git) throws GitAPIException {
    return ObjectId.toString(git.log().call().iterator().next().getId());
  }

  private Result<Git> checkoutRepo(String url, Path dir) {
    try {
      cleanAndCreateFolder(dir);
      return cloneRepositoryFromUrl(url, dir);
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while cloning %s to %s", url, dir);
      return Result.error(e);
    }
  }

  /**
   * Clones a Git repository from a specified URL to a directory.
   *
   * @param url The URL of the Git repository.
   * @param dir The directory to clone the repository into.
   * @return A Result object containing an instance of Git if the cloning is successful, or an error
   *     if an exception occurs.
   * @throws GitAPIException if an error occurs during the Git cloning process.
   */
  @NotNull
  private static Result<Git> cloneRepositoryFromUrl(String url, Path dir) throws GitAPIException {
    return Result.ok(Git.cloneRepository().setURI(url).setDirectory(dir.toFile()).call());
  }

  /**
   * Cleans the given directory by deleting all its contents and then creates the directory.
   *
   * @param dir the directory to clean and create
   * @throws IOException if an I/O error occurs
   */
  private static void cleanAndCreateFolder(Path dir) throws IOException {
    FileUtils.deleteDirectory(dir.toFile());
    Files.createDirectories(dir);
  }
}
