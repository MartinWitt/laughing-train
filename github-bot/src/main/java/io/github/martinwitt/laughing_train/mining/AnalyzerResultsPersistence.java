package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AnalyzerResultsPersistence extends AbstractVerticle {

  public static final String SERVICE_NAME = "analyzerResultsPersistence";
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  ProjectRepository projectRepository;
  EventBus eventBus;

  public AnalyzerResultsPersistence(ProjectRepository projectRepository, EventBus eventBus) {
    this.projectRepository = projectRepository;
    this.eventBus = eventBus;
  }

  @Override
  public void start() throws Exception {
    vertx.eventBus().<StoreResults>consumer(SERVICE_NAME, v -> persistResults(v.body()));
  }

  void persistResults(StoreResults storeResults) {
    Project project = storeResults.project();
    CodeAnalyzerResult result = storeResults.result();
    addOrUpdateCommitHash(project, result, storeResults.analyzerName());
    if (result instanceof CodeAnalyzerResult.Failure failure) {
      logger.atInfo().log(
          "Analyzer %s failed for project %s", storeResults.analyzerName(), project.name());

    } else if (result instanceof CodeAnalyzerResult.Success success) {
      logger.atInfo().log(
          "Analyzer %s succeeded for project %s", storeResults.analyzerName(), project.name());
    }
  }

  private AnalyzerStatus getAnalyzerStatus(
      CodeAnalyzerResult spoonResult, String name, String commitHash) {
    AnalyzerStatus analyzerStatus = null;
    if (spoonResult instanceof CodeAnalyzerResult.Success success) {
      analyzerStatus = AnalyzerStatus.success(name, success.results().size(), commitHash);
    } else if (spoonResult instanceof CodeAnalyzerResult.Failure failure) {
      analyzerStatus = AnalyzerStatus.failure(name, 0, commitHash);
    }
    return analyzerStatus;
  }

  private void addOrUpdateCommitHash(
      Project project, CodeAnalyzerResult spoonResult, String analyzerName) {
    String name = project.name();
    String commitHash = project.commitHash();
    List<RemoteProject> list = projectRepository.findByProjectUrl(project.url());
    AnalyzerStatus analyzerStatus = getAnalyzerStatus(spoonResult, analyzerName, commitHash);
    if (list.isEmpty()) {
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
    } else {
      logger.atInfo().log("Updating commit hash for %s", name);
      var oldProject = list.get(0);
      oldProject.addCommitHash(commitHash);
      var commits = oldProject.getCommits();
      GitHubCommit gitHubCommit = new GitHubCommit(commitHash, new ArrayList<>());
      commits.add(gitHubCommit);
      gitHubCommit.addAnalyzerStatus(analyzerStatus);
      oldProject.addCommitHash(gitHubCommit);
      projectRepository.save(oldProject);
    }
  }
}
