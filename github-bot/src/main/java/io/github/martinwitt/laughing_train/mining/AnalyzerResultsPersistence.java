package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.mining.requests.MineNextProject;
import io.github.martinwitt.laughing_train.mining.requests.StoreResults;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.vertx.ConsumeEvent;
import io.vertx.core.eventbus.EventBus;
import java.util.ArrayList;
import java.util.List;

public class AnalyzerResultsPersistence {

    public static final String SERVICE_NAME = "analyzerResultsPersistence";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    ProjectRepository projectRepository;
    EventBus eventBus;

    public AnalyzerResultsPersistence(ProjectRepository projectRepository, EventBus eventBus) {
        this.projectRepository = projectRepository;
        this.eventBus = eventBus;
    }

    @ConsumeEvent(value = SERVICE_NAME, blocking = true)
    void persistResults(StoreResults storeResults) {
        Project project = storeResults.project();
        CodeAnalyzerResult result = storeResults.result();
        addOrUpdateCommitHash(project, result, SERVICE_NAME);
        if (result instanceof CodeAnalyzerResult.Failure failure) {
            logger.atInfo().log("Analyzer %s failed for project %s", SERVICE_NAME, project.name());

        } else if (result instanceof CodeAnalyzerResult.Success success) {
            logger.atInfo().log("Analyzer %s succeeded for project %s", SERVICE_NAME, project.name());
        }
        eventBus.publish("miner", new MineNextProject(storeResults.analyzerName()));
    }

    private AnalyzerStatus getAnalyzerStatus(CodeAnalyzerResult spoonResult, String name) {
        AnalyzerStatus analyzerStatus = null;
        if (spoonResult instanceof CodeAnalyzerResult.Success success) {
            analyzerStatus = AnalyzerStatus.success(name, success.results().size());
        } else if (spoonResult instanceof CodeAnalyzerResult.Failure failure) {
            analyzerStatus = AnalyzerStatus.failure(name, 0);
        }
        return analyzerStatus;
    }

    private void addOrUpdateCommitHash(Project project, CodeAnalyzerResult spoonResult, String analyzerName) {
        String name = project.name();
        String commitHash = project.commitHash();
        List<io.github.martinwitt.laughing_train.domain.entity.Project> list =
                projectRepository.findByProjectUrl(project.url());
        AnalyzerStatus analyzerStatus = getAnalyzerStatus(spoonResult, analyzerName);
        if (list.isEmpty()) {
            io.github.martinwitt.laughing_train.domain.entity.Project newProject =
                    new io.github.martinwitt.laughing_train.domain.entity.Project(name, project.url());
            newProject.addCommitHash(commitHash);
            var commits = newProject.getCommits();
            commits.stream()
                    .filter(v -> v.getCommitHash().equals(commitHash))
                    .findFirst()
                    .ifPresent(v -> {
                        v.addAnalyzerStatus(analyzerStatus);
                    });
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
