package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;

@ApplicationScoped
public class ProjectService {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final Random random = new Random();

  @Inject Vertx vertx;

  public ProjectResult handleProjectRequest(ProjectRequest request) {
    try {
      logger.atInfo().log("Received project request %s", request);
      if (request instanceof ProjectRequest.WithUrl url) {

        String repoName = StringUtils.substringAfterLast(url.url(), "/").replace(".git", "");
        Path dir = Files.createTempDirectory("laughing-train-" + repoName + random.nextLong());
        cleanAfter60min(dir);
        Optional<Git> checkoutRepo = checkoutRepo(url, dir);
        if (checkoutRepo.isEmpty()) {
          FileUtils.deleteQuietly(dir.toFile());
          return new ProjectResult.Error("Could not checkout repo");
        }
        Git git = checkoutRepo.get();
        logger.atInfo().log("Cloned %s to %s", url.url(), dir);
        return new ProjectResult.Success(
            new Project(repoName, url.url(), dir.toFile(), ".", getHash(git)));
      }
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while handling project request %s", request);
      return new ProjectResult.Error(e.getMessage());
    }
    return new ProjectResult.Error("Unknown request");
  }

  private void cleanAfter60min(Path dir) {
    vertx.setTimer(
        Duration.ofMinutes(30).toMillis(),
        v -> {
          if (Files.exists(dir)) {
            FileUtils.deleteQuietly(dir.toFile());
            logger.atInfo().log("Deleted %s", dir);
          }
        });
  }

  private String getHash(Git git) {
    try {
      return ObjectId.toString(git.log().call().iterator().next().getId());
    } catch (GitAPIException e) {
      return "Error while getting hash";
    }
  }

  private Optional<Git> checkoutRepo(ProjectRequest.WithUrl url, Path dir) {
    return createAsyncRepo(url, dir);
  }

  private Optional<Git> createAsyncRepo(ProjectRequest.WithUrl url, Path dir) {
    try {
      FileUtils.deleteDirectory(dir.toFile());
      Files.createDirectories(dir);
      return Optional.ofNullable(
          Git.cloneRepository().setURI(url.url()).setDirectory(dir.toFile()).call());
    } catch (Exception e) {
      logger.atSevere().withCause(e).log("Error while cloning %s to %s", url.url(), dir);
      return Optional.empty();
    }
  }
}
