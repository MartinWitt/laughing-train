package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.request.AnalyzerRequest;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerStatus;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectService;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

@Unremovable
@ApplicationScoped
public class QodanaPeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String ANALYZER_NAME = "Qodana";

    final MiningPrinter miningPrinter;
    final Vertx vertx;
    final SearchProjectService searchProjectService;
    final ProjectRepository projectRepository;
    final QodanaService qodanaService;
    final ProjectService projectService;
    MeterRegistry registry;

    private final Random random = new Random();
    private Queue<Project> queue = new ArrayDeque<>();

    public QodanaPeriodicMiner(
            MeterRegistry registry,
            Vertx vertx,
            SearchProjectService searchProjectService,
            ProjectRepository projectRepository,
            QodanaService qodanaService,
            ProjectService projectService,
            MiningPrinter miningPrinter) {
        this.registry = registry;
        this.vertx = vertx;
        this.searchProjectService = searchProjectService;
        this.projectRepository = projectRepository;
        this.qodanaService = qodanaService;
        this.projectService = projectService;
        this.miningPrinter = miningPrinter;
    }

    private Project getRandomProject() throws IOException {
        if (random.nextBoolean()) {
            return searchProjectService.searchProjectOnGithub();
        } else {
            return getKnownProject();
        }
    }

    private Project getKnownProject() {
        var list = projectRepository.getAll();
        return list.get(random.nextInt(list.size()));
    }

    void mine(@Observes StartupEvent event) {
        try {
            logger.atInfo().log("Starting Qodana periodic miner");
            vertx.setTimer(TimeUnit.MINUTES.toMillis(5), v -> vertx.executeBlocking(it -> mineRandomRepo()));
        } catch (Exception e) {
            logger.atWarning().withCause(e).log("Failed to repo with Qodana");
        }
    }

    private void mineRandomRepo() {
        try {
            logger.atInfo().log("Mining repository with qodana");
            var project = queue.isEmpty() ? getRandomProject() : queue.poll();
            var checkoutResult = checkoutProject(project);
            if (checkoutResult instanceof ProjectResult.Error) {
                logger.atWarning().log("Failed to checkout project %s", project);
                mineRandomRepo();
                return;
            }
            if (checkoutResult instanceof ProjectResult.Success success) {
                String commitHash = success.project().commitHash();
                if (isAlreadyMined(success, commitHash, ANALYZER_NAME)) {
                    logger.atInfo().log(
                            "Project %s already analyzed with commit hash %s", success.project(), commitHash);
                    tryDeleteProject(success);
                    mineRandomRepo();
                }
                logger.atInfo().log("Successfully checked out project %s", success.project());
                var qodanaResult = analyzeProject(success);
                List<AnalyzerResult> results = new ArrayList<>();
                if (qodanaResult instanceof QodanaResult.Failure failure) {
                    logger.atWarning().log("Failed to analyze project %s", failure.message());
                    tryDeleteProject(success);
                }
                if (qodanaResult instanceof QodanaResult.Success successResult) {
                    logger.atInfo().log("Successfully analyzed project %s", success.project());
                    saveResults(results, project);
                    tryDeleteProject(success);
                }
                addOrUpdateCommitHash(success, qodanaResult);
            }
        } catch (Exception e) {
            logger.atWarning().withCause(e).log("Failed to mine random repo");
            registry.counter("mining.error").increment();
        } finally {
            logger.atInfo().log("Queue size: %s", queue.size());
            logger.atInfo().log("Mining next repo in 1 minute");
            vertx.setTimer(TimeUnit.MINUTES.toMillis(1), v -> vertx.executeBlocking(it -> mineRandomRepo()));
        }
    }

    private ProjectResult checkoutProject(Project project) throws IOException {
        return projectService.handleProjectRequest(new ProjectRequest.WithUrl(project.getProjectUrl()));
    }

    private QodanaResult analyzeProject(ProjectResult.Success message) {
        return qodanaService.analyze(new AnalyzerRequest.WithProject(message.project()));
    }

    private void tryDeleteProject(ProjectResult.Success project) {
        try {
            FileUtils.deleteDirectory(project.project().folder());
        } catch (IOException e) {
            logger.atWarning().log(
                    "Failed to delete project " + project.project().folder());
        }
    }

    private void saveResults(List<AnalyzerResult> results, Project project) {
        try {
            String content = printFormattedResults(project, results);
            var laughingRepo = getLaughingRepo();
            updateOrCreateContent(laughingRepo, project.getProjectName(), content);
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while updating content");
        }
    }

    private String printFormattedResults(Project project, List<AnalyzerResult> results) {
        return "# %s %n %s".formatted(project.getProjectName(), miningPrinter.printAllResults(results));
    }

    private GHRepository getLaughingRepo() throws IOException {
        return GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN")).getRepository("MartinWitt/laughing-train");
    }

    private void updateOrCreateContent(GHRepository repo, String repoName, String content) {
        try {
            repo.getFileContent("mining/" + repoName + ".md", "gh-mining")
                    .update(content, "Update mining results for " + repoName, "gh-mining");
        } catch (Exception ignored) {
            // this exception is thrown if the file does not exist yet for new projects
            try {
                repo.createContent()
                        .content(content)
                        .path("mining/" + repoName + ".md")
                        .message("mining " + repoName)
                        .branch("gh-mining")
                        .commit();
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("Error while creating mining file");
            }
        }
    }

    public void addToQueue(Project project) {
        if (project == null) {
            return;
        }
        queue.add(project);
    }

    private void addOrUpdateCommitHash(ProjectResult.Success projectResult, QodanaResult spoonResult) {
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

    private AnalyzerStatus getAnalyzerStatus(QodanaResult spoonResult) {
        AnalyzerStatus analyzerStatus = null;
        if (spoonResult instanceof QodanaResult.Success success) {
            analyzerStatus =
                    AnalyzerStatus.success(ANALYZER_NAME, success.result().size());
        } else if (spoonResult instanceof QodanaResult.Failure failure) {
            analyzerStatus = AnalyzerStatus.failure(ANALYZER_NAME, 0);
        }
        return analyzerStatus;
    }

    private boolean isAlreadyMined(ProjectResult.Success success, String commitHash, String analyzerName) {
        return projectRepository.findByProjectUrl(success.project().url()).stream()
                .flatMap(v -> v.getCommits().stream())
                .filter(v -> v.getCommitHash().equals(commitHash))
                .flatMap(v -> v.getAnalyzerStatuses().stream())
                .anyMatch(v -> v.getAnalyzerName().equals(analyzerName));
    }
}
