package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.ProjectResult.Success;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.result.CodeAnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectService;
import io.github.martinwitt.laughing_train.services.SpoonAnalyzerService;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.arc.Unremovable;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import org.apache.commons.io.FileUtils;

@Unremovable
@ApplicationScoped
public class SpoonPeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String ANALYZER_NAME = "spoon-analyzer";
    final MiningPrinter miningPrinter;
    final Vertx vertx;
    final SearchProjectService searchProjectService;
    final ProjectRepository projectRepository;
    final ProjectService projectService;
    MeterRegistry registry;
    final SpoonAnalyzerService spoonAnalyzerService;
    private Queue<Project> queue = new ArrayDeque<>();

    public SpoonPeriodicMiner(
            MeterRegistry registry,
            Vertx vertx,
            SearchProjectService searchProjectService,
            ProjectRepository projectRepository,
            ProjectService projectService,
            MiningPrinter miningPrinter,
            SpoonAnalyzerService spoonAnalyzerService) {
        this.registry = registry;
        this.vertx = vertx;
        this.searchProjectService = searchProjectService;
        this.projectRepository = projectRepository;
        this.projectService = projectService;
        this.miningPrinter = miningPrinter;
        this.spoonAnalyzerService = spoonAnalyzerService;
    }

    void mineRandomRepo(ProjectResult.Success success) {
        try {
            logger.atInfo().log("Start mining with spoon");
            String commitHash = success.project().commitHash();
            if (isAlreadyMined(success, commitHash, ANALYZER_NAME)) {
                logger.atInfo().log("Project %s already analyzed with commit hash %s", success.project(), commitHash);
            }
            logger.atInfo().log("Successfully checked out project %s", success.project());
            var spoonResult = analyzeProjectWithSpoon(success);
            if (spoonResult instanceof CodeAnalyzerResult.Failure error) {
                logger.atWarning().log("Failed to analyze project with spoon %s", error.message());
                tryDeleteProject(success);
            }
            if (spoonResult instanceof CodeAnalyzerResult.Success successResult) {
                addOrUpdateCommitHash(success, spoonResult);
            }
        } catch (Exception e) {
            logger.atWarning().withCause(e).log("Failed to mine random repo");
            registry.counter("mining.error").increment();
        } finally {
            logger.atInfo().log("Finished mining with spoon");
        }
    }

    private CodeAnalyzerResult analyzeProjectWithSpoon(Success success) {
        logger.atInfo().log("Analyzing project %s with spoon", success.project());
        CodeAnalyzerResult analyze = spoonAnalyzerService.analyze(new AnalyzerRequest.WithProject(success.project()));
        logger.atInfo().log("Successfully analyzed project %s with spoon", success.project());
        return analyze;
    }

    private boolean isAlreadyMined(ProjectResult.Success success, String commitHash, String analyzerName) {
        return projectRepository.findByProjectUrl(success.project().url()).stream()
                .flatMap(v -> v.getCommits().stream())
                .filter(v -> v.getCommitHash().equals(commitHash))
                .flatMap(v -> v.getAnalyzerStatuses().stream())
                .anyMatch(v -> v.getAnalyzerName().equals(analyzerName));
    }

    private void tryDeleteProject(ProjectResult.Success project) {
        try {
            FileUtils.deleteDirectory(project.project().folder());
        } catch (IOException e) {
            logger.atWarning().log(
                    "Failed to delete project " + project.project().folder());
        }
    }

    private void addOrUpdateCommitHash(ProjectResult.Success projectResult, CodeAnalyzerResult spoonResult) {
        String name = projectResult.project().name();
        String commitHash = projectResult.project().commitHash();
        var list = projectRepository.findByProjectUrl(projectResult.project().url());
        AnalyzerStatus analyzerStatus = getAnalyzerStatus(spoonResult);
        if (list.isEmpty()) {
            Project newProject = new Project(name, projectResult.project().url());
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

    private AnalyzerStatus getAnalyzerStatus(CodeAnalyzerResult spoonResult) {
        AnalyzerStatus analyzerStatus = null;
        if (spoonResult instanceof CodeAnalyzerResult.Success success) {
            analyzerStatus =
                    AnalyzerStatus.success(ANALYZER_NAME, success.results().size());
        } else if (spoonResult instanceof CodeAnalyzerResult.Failure failure) {
            analyzerStatus = AnalyzerStatus.failure(ANALYZER_NAME, 0);
        }
        return analyzerStatus;
    }
}
