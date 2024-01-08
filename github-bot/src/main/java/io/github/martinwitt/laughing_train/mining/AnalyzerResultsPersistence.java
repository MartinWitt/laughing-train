package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.commons.GitProject;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult.Failure;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult.Success;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.vertx.core.AbstractVerticle;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class AnalyzerResultsPersistence extends AbstractVerticle {

  public static final String SERVICE_NAME = "analyzerResultsPersistence";
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private final ProjectRepository projectRepository;
  private final AnalyzerRunRepository analyzerRunRepository;

  public AnalyzerResultsPersistence(
      ProjectRepository projectRepository, AnalyzerRunRepository analyzerRunRepository) {
    this.projectRepository = projectRepository;
    this.analyzerRunRepository = analyzerRunRepository;
  }

  @Override
  public void start() {
    vertx.eventBus().<StoreResults>consumer(SERVICE_NAME, v -> persistResults(v.body()));
  }

  /**
   * Persists the results of a code analysis run.
   *
   * @param storeResults the results to persist in the database never null.
   */
  void persistResults(StoreResults storeResults) {
    GitProject gitProject = storeResults.gitProject();
    CodeAnalyzerResult result = storeResults.result();
    addOrUpdateCommitHash(gitProject, result, storeResults.analyzerName());
    String resultString =
        switch (result) {
          case Success __ -> "success";
          case Failure __ -> "failure";
        };
    logger.atInfo().log(
        "Analyzer %s %s for project %s",
        storeResults.analyzerName(), resultString, gitProject.name());
  }

  private void addOrUpdateCommitHash(
      GitProject gitProject, CodeAnalyzerResult spoonResult, String analyzerName) {
    String name = gitProject.name();
    String commitHash = gitProject.commitHash();
    List<RemoteProject> list = projectRepository.findByProjectUrl(gitProject.url());
    if (list.isEmpty()) {
      RemoteProject newProject = new RemoteProject(name, gitProject.url());
      GitHubCommit gitHubCommit = new GitHubCommit(commitHash);
      newProject.addCommitHash(gitHubCommit);
      projectRepository.save(newProject);
    } else {
      RemoteProject remoteProject = list.getFirst();
      remoteProject.addCommitHash(new GitHubCommit(commitHash));
      projectRepository.save(remoteProject);
    }
    if (spoonResult instanceof Success success) {
      AnalyzerRun analyzerRun =
          new AnalyzerRun(
              name,
              gitProject.url(),
              analyzerName,
              AnalyzerRun.RunStatus.SUCCESS.name(),
              success.results().size(),
              commitHash,
              LocalDateTime.now());
      analyzerRunRepository.save(analyzerRun);
    } else {
      AnalyzerRun analyzerRun =
          new AnalyzerRun(
              name,
              gitProject.url(),
              analyzerName,
              AnalyzerRun.RunStatus.FAILURE.name(),
              0,
              commitHash,
              LocalDateTime.now());
      analyzerRunRepository.save(analyzerRun);
    }
  }
}
