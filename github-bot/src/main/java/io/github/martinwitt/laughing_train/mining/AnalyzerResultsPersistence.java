package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult.Failure;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult.Success;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.vertx.core.AbstractVerticle;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AnalyzerResultsPersistence extends AbstractVerticle {

  public static final String SERVICE_NAME = "analyzerResultsPersistence";
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  ProjectRepository projectRepository;

  public AnalyzerResultsPersistence(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  @Override
  public void start() throws Exception {
    vertx.eventBus().<StoreResults>consumer(SERVICE_NAME, v -> persistResults(v.body()));
  }

  /**
   * Persists the results of a code analysis run.
   *
   * @param storeResults the results to persist in the database never null.
   */
  void persistResults(StoreResults storeResults) {
    Project project = storeResults.project();
    CodeAnalyzerResult result = storeResults.result();
    addOrUpdateCommitHash(project, result, storeResults.analyzerName());
    String resultString =
        switch (result) {
          case Success __ -> "success";
          case Failure __ -> "failure";
        };
    logger.atInfo().log(
        "Analyzer %s %s for project %s", storeResults.analyzerName(), resultString, project.name());
  }

  private AnalyzerStatus getAnalyzerStatus(
      CodeAnalyzerResult spoonResult, String name, String commitHash) {
    return switch (spoonResult) {
      case Success success -> AnalyzerStatus.success(name, success.results().size(), commitHash);
      case Failure __ -> AnalyzerStatus.failure(name, 0, commitHash);
    };
  }

  private void addOrUpdateCommitHash(
      Project project, CodeAnalyzerResult spoonResult, String analyzerName) {
    String name = project.name();
    String commitHash = project.commitHash();
    List<RemoteProject> list = projectRepository.findByProjectUrl(project.url());
    AnalyzerStatus analyzerStatus = getAnalyzerStatus(spoonResult, analyzerName, commitHash);
    if (list.isEmpty()) {
      createNewProject(name, project, commitHash, analyzerStatus);
    } else {
      addAnalyzerRun(name, list, commitHash, analyzerStatus);
    }
  }

  private void addAnalyzerRun(
      String name, List<RemoteProject> list, String commitHash, AnalyzerStatus analyzerStatus) {
    logger.atInfo().log("Updating commit hash for %s", name);
    RemoteProject oldProject = list.getFirst();
    oldProject.addCommitHash(commitHash);
    List<GitHubCommit> commits = oldProject.getCommits();
    GitHubCommit gitHubCommit = new GitHubCommit(commitHash, new ArrayList<>());
    commits.add(gitHubCommit);
    gitHubCommit.addAnalyzerStatus(analyzerStatus);
    oldProject.addCommitHash(gitHubCommit);
    projectRepository.save(oldProject);
  }

  private void createNewProject(
      String name, Project project, String commitHash, AnalyzerStatus analyzerStatus) {
    RemoteProject newProject = new RemoteProject(name, project.url());
    newProject.addCommitHash(commitHash);
    List<GitHubCommit> commits = newProject.getCommits();
    var selectedCommit =
        commits.stream().filter(v -> v.getCommitHash().equals(commitHash)).findFirst();
    if (selectedCommit.isPresent()) {
      selectedCommit.get().addAnalyzerStatus(analyzerStatus);
      logger.atInfo().log(
          "Adding new commit hash for %s with status %s for analyzer %s",
          name, analyzerStatus.getStatus(), analyzerStatus.getAnalyzerName());
    }
    projectRepository.create(newProject);
  }
}
