package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.data.SpoonPatternAnalyzerResult;
import io.github.martinwitt.laughing_train.data.SpoonPatternAnalyzerResult.Success;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectService;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.github.martinwitt.laughing_train.services.SpoonPatternAnalyzer;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class PeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();

    final MiningPrinter miningPrinter;
    final Vertx vertx;
    final SearchProjectService searchProjectService;
    final ProjectRepository projectRepository;
    final QodanaService qodanaService;
    final ProjectService projectService;
    final SpoonPatternAnalyzer spoonPatternAnalyzer;

    MeterRegistry registry;

    private final Random random = new Random();
    private Queue<Project> queue = new ArrayDeque<>();

    public PeriodicMiner(
            MeterRegistry registry,
            Vertx vertx,
            SearchProjectService searchProjectService,
            ProjectRepository projectRepository,
            QodanaService qodanaService,
            ProjectService projectService,
            MiningPrinter miningPrinter,
            SpoonPatternAnalyzer spoonPatternAnalyzer) {
        this.registry = registry;
        this.vertx = vertx;
        this.searchProjectService = searchProjectService;
        this.projectRepository = projectRepository;
        this.qodanaService = qodanaService;
        this.projectService = projectService;
        this.miningPrinter = miningPrinter;
        this.spoonPatternAnalyzer = spoonPatternAnalyzer;
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
        vertx.setTimer(TimeUnit.MINUTES.toMillis(5), v -> vertx.executeBlocking(it -> mineRandomRepo()));
    }

    private void mineRandomRepo() {
        try {
            var project = queue.isEmpty() ? getRandomProject() : queue.poll();
            var checkoutResult = checkoutProject(project);
            if (checkoutResult instanceof ProjectResult.Error) {
                logger.atWarning().log("Failed to checkout project %s", project);
                mineRandomRepo();
                return;
            }
            if (checkoutResult instanceof ProjectResult.Success success) {
                logger.atInfo().log("Successfully checked out project %s", success.project());
                var qodanaResult = analyzeProject(success);
                var spoonPatternAnalyzerResult =
                        spoonPatternAnalyzer.analyze(new AnalyzerRequest.WithProject(success.project()));

                if (spoonPatternAnalyzerResult instanceof SpoonPatternAnalyzerResult.Success spoonSuccess) {
                    logger.atInfo().log("Successfully analyzed project with spoon %s", success.project());
                    saveSpoonResults(spoonSuccess);
                    addOrUpdateCommitHash(success);
                }
                if (spoonPatternAnalyzerResult instanceof SpoonPatternAnalyzerResult.Failure failure) {
                    logger.atWarning().log("Failed to analyze project with spoon %s", failure.message());
                    registry.counter("mining.spoon.error").increment();
                    tryDeleteProject(success);
                }
                if (qodanaResult instanceof QodanaResult.Failure failure) {
                    logger.atWarning().log("Failed to analyze project %s", failure.message());
                    registry.counter("mining.qodana.error").increment();
                    tryDeleteProject(success);
                    return;
                }
                if (qodanaResult instanceof QodanaResult.Success successResult) {
                    logger.atInfo().log("Successfully analyzed project %s", success.project());
                    saveQodanaResults(successResult);
                    addOrUpdateCommitHash(success);
                }
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

    private void saveSpoonResults(Success spoonSuccess) {
        spoonSuccess.project().runInContext(() -> {
            try {
                List<AnalyzerResult> results = spoonSuccess.result();
                if (results.isEmpty()) {
                    logger.atInfo().log("No results for %s", spoonSuccess);
                    return Optional.empty();
                }
                String content = printFormattedResults(spoonSuccess, results);
                var laughingRepo = getLaughingRepo();
                updateOrCreateContent(laughingRepo, spoonSuccess.project().name(), content);
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("Error while updating content");
            }
            return Optional.empty();
        });
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

    private void addOrUpdateCommitHash(ProjectResult.Success projectResult) {
        String name = projectResult.project().name();
        String commitHash = projectResult.project().commitHash();
        var list = projectRepository.findByProjectName(name);
        if (list.isEmpty()) {
            Project newProject = new Project(name, projectResult.project().url());
            newProject.addCommitHash(commitHash);
            projectRepository.create(newProject);
        } else {
            logger.atInfo().log("Updating commit hash for %s", name);
            var oldProject = list.get(0);
            oldProject.addCommitHash(commitHash);
            projectRepository.save(oldProject);
        }
    }

    private void saveQodanaResults(QodanaResult.Success success) {
        success.project().runInContext(() -> {
            try {
                List<AnalyzerResult> results = success.result();
                registry.summary("mining.qodana", "result", Integer.toString(results.size()));
                if (results.isEmpty()) {
                    logger.atInfo().log("No results for %s", success);
                    return Optional.empty();
                }
                String content = printFormattedResults(success, results);
                var laughingRepo = getLaughingRepo();
                updateOrCreateContent(laughingRepo, success.project().name(), content);
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("Error while updating content");
            }
            return Optional.empty();
        });
    }

    private String printFormattedResults(QodanaResult.Success success, List<AnalyzerResult> results) {
        return "# %s %n %s"
                .formatted(success.project().name(), miningPrinter.printAllResults(results, success.project()));
    }

    private String printFormattedResults(SpoonPatternAnalyzerResult.Success success, List<AnalyzerResult> results) {
        return "# %s %n %s"
                .formatted(success.project().name(), miningPrinter.printAllResults(results, success.project()));
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
}
