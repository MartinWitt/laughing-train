package io.github.martinwitt.laughing_train.commons;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.result.Result;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.random.RandomGenerator;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;
import org.jetbrains.annotations.NotNull;

/**
 * The GitRepoHandler class provides methods for cloning Git repositories and performing operations
 * on them.
 */
public class GitRepoHandler {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final RandomGenerator RANDOM_GENERATOR = new Random();

  private static final long CLEANUP_DELAY_MILLIS = Duration.ofMinutes(60).toMillis();

  /**
   * Clones a Git repository from the specified URL.
   *
   * @param repoUrl The URL of the Git repository to clone.
   * @return A Result object containing a GitProject if the cloning is successful, or an error if an
   *     exception occurs.
   */
  public static Result<GitProject> cloneGitProject(String repoUrl) {
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

  /**
   * Extracts the repository name from a given repository URL.
   *
   * @param repoURL The URL of the repository.
   * @return The repository name.
   */
  private static String extractRepoName(String repoURL) {
    return StringUtils.substringAfterLast(repoURL, "/").replace(".git", "");
  }

  /**
   * Creates a GitProject object based on the given parameters.
   *
   * @param repoName The name of the Git repository.
   * @param repoURL The URL of the Git repository.
   * @param projectDirectory The directory where the project will be created.
   * @param gitRepository The Git object representing the repository.
   * @return A GitProject object representing the newly created project.
   */
  private static GitProject createProject(
      String repoName, String repoURL, Path projectDirectory, Git gitRepository) {
    String commitHash = getLatestCommitHash(gitRepository).get();
    return new GitProject(repoName, repoURL, projectDirectory.toFile(), ".", commitHash);
  }

  /**
   * Creates a temporary project directory for the given repository name.
   *
   * @param repoName The name of the repository.
   * @return The path of the created project directory.
   * @throws IOException if an I/O error occurs.
   */
  private static Path createProjectDir(String repoName) throws IOException {
    Path projectDir = Files.createTempDirectory(generateUniqueRepoName(repoName));
    cleanAfter60min(projectDir);
    return projectDir;
  }

  /**
   * Generates a unique repository name by appending a random number to the given repository name.
   *
   * @param repoName The original repository name.
   * @return The unique repository name.
   */
  @NotNull
  private static String generateUniqueRepoName(String repoName) {
    return "laughing-train-" + repoName + Math.abs(RANDOM_GENERATOR.nextLong());
  }

  /**
   * Cleans up the given project directory by deleting its contents and returns a Result object with
   * an error message.
   *
   * @param projectDir The path of the project directory to be cleaned.
   * @return A Result object with an error message indicating that the repository could not be
   *     checked out.
   */
  private static Result<GitProject> cleanupAndReturnError(Path projectDir) {
    FileUtils.deleteQuietly(projectDir.toFile());
    return Result.error(new IllegalArgumentException("Could not checkout repo"));
  }

  /**
   * Cleans a directory after 60 minutes by deleting its contents.
   *
   * @param dir The path of the directory to be cleaned.
   */
  private static void cleanAfter60min(Path dir) {
    TimerTask task =
        new TimerTask() {
          @Override
          public void run() {
            deleteFolder(dir);
          }
        };
    Timer timer = new Timer();
    timer.schedule(task, CLEANUP_DELAY_MILLIS);
  }

  /**
   * Deletes a folder if it exists.
   *
   * @param dir The path of the folder to be deleted.
   */
  private static void deleteFolder(Path dir) {
    if (Files.exists(dir)) {
      FileUtils.deleteQuietly(dir.toFile());
      logger.atInfo().log("Deleted %s", dir);
    }
  }

  /**
   * Retrieves the latest commit hash from a Git repository.
   *
   * @param git the Git object representing the repository
   * @return a Result object containing the commit hash if successful, or an error if an exception
   *     occurs
   */
  private static Result<String> getLatestCommitHash(Git git) {
    try {
      return Result.ok(getLatestCommitId(git));
    } catch (GitAPIException e) {
      return Result.error(e);
    }
  }

  /**
   * Retrieves the latest commit ID from a Git repository.
   *
   * @param git The Git object representing the repository.
   * @return The latest commit ID as a string.
   * @throws GitAPIException If an error occurs while accessing the Git repository.
   */
  private static String getLatestCommitId(Git git) throws GitAPIException {
    return ObjectId.toString(git.log().call().iterator().next().getId());
  }

  /**
   * Clones a Git repository from a specified URL to a directory.
   *
   * @param url The URL of the Git repository.
   * @param dir The directory to clone the repository into.
   * @return A Result object containing an instance of Git if the cloning is successful, or an error
   *     if an exception occurs.
   */
  private static Result<Git> checkoutRepo(String url, Path dir) {
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
