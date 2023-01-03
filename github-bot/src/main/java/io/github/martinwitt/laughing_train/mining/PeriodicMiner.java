package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.QodanaService;
import io.github.martinwitt.laughing_train.services.ServiceAddresses;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.mutiny.core.eventbus.EventBus;
import io.vertx.mutiny.core.eventbus.Message;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;

@ApplicationScoped
public class PeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    EventBus eventBus;

    @Inject
    MiningPrinter miningPrinter;

    @Inject
    Vertx vertx;

    @Inject
    SearchProjectService searchProjectService;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    QodanaService qodanaService;

    private final MeterRegistry registry;

    private final Random random = new Random();
    private Queue<Project> queue = new ArrayDeque<>();

    public PeriodicMiner(MeterRegistry registry) {
        this.registry = registry;
    }

    private Uni<Project> getRandomProject() {
        if (random.nextBoolean()) {
            return searchProjectService.searchProjectOnGithub();
        } else {
            return getKnownProject();
        }
    }

    private Uni<Project> getKnownProject() {
        var list = projectRepository.getAll();
        return Uni.createFrom().item(list.get(random.nextInt(list.size())));
    }

    void mine(@Observes StartupEvent event) {
        vertx.setTimer(TimeUnit.MINUTES.toMillis(5), v -> mineRandomRepo());
    }

    private void mineRandomRepo() {
        Uni.createFrom()
                .item(queue.poll())
                .onItem()
                .ifNull()
                .switchTo(getRandomProject())
                .onItem()
                .transformToUni(this::checkoutProject)
                .onItem()
                .invoke(this::addOrUpdateCommitHash)
                .onItem()
                .transformToUni(this::analyzeProject)
                .onItem()
                .invoke(this::saveQodanaResults)
                .subscribe()
                .with(
                        v -> {
                            if (v instanceof QodanaResult.Success success) {
                                if (success.result().isEmpty()) {
                                    registry.counter("qodana.failure").increment();
                                } else {
                                    registry.counter("qodana.success").increment();
                                    logger.atInfo().log(
                                            "Finished mining with %s results. Next project starting now.",
                                            success.result().size());
                                }
                            } else {
                                registry.counter("qodana.failure").increment();
                            }
                            mineRandomRepo();
                        },
                        e -> {
                            registry.counter("qodana.failure").increment();
                            logger.atSevere().withCause(e).log("Failed mining");
                            mineRandomRepo();
                        });
    }

    private Uni<Message<ProjectResult>> checkoutProject(Project project) {
        return eventBus.<ProjectResult>request(
                ServiceAddresses.PROJECT_REQUEST,
                new ProjectRequest.WithUrl(project.getProjectUrl()),
                new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)));
    }

    private Uni<QodanaResult> analyzeProject(Message<ProjectResult> message) {
        if (message.body() instanceof ProjectResult.Success project) {
            return qodanaService
                    .analyzeUni(new AnalyzerRequest.WithProject(project.project()))
                    .invoke(ignore -> tryDeleteProject(project));

        } else {
            logger.atWarning().log("Mining periodic %s failed", message);
            return Uni.createFrom().failure(new IllegalStateException("No project found"));
        }
    }

    private void tryDeleteProject(ProjectResult.Success project) {
        try {
            FileUtils.deleteDirectory(project.project().folder());
        } catch (IOException e) {
            logger.atWarning().log(
                    "Failed to delete project " + project.project().folder());
        }
    }

    private void addOrUpdateCommitHash(Message<ProjectResult> projectResult) {
        if (projectResult.body() instanceof ProjectResult.Success project) {
            String name = project.project().name();
            String commitHash = project.project().commitHash();
            var list = projectRepository.findByProjectName(name);
            if (list.isEmpty()) {
                projectRepository.create(new Project(name, project.project().url()));
            } else {
                logger.atInfo().log("Updating commit hash for %s", name);
                var oldProject = list.get(0);
                oldProject.addCommitHash(commitHash);
                projectRepository.save(oldProject);
            }
        }
    }

    private Uni<Void> saveQodanaResults(QodanaResult message) {
        if (message instanceof QodanaResult.Success success) {
            return success.project()
                    .runInContext(() -> {
                        try {
                            List<AnalyzerResult> results = success.result();
                            registry.summary("mining.qodana", "result", Integer.toString(results.size()));
                            if (results.isEmpty()) {
                                logger.atInfo().log("No results for %s", success);
                                return Uni.createFrom().voidItem();
                            }
                            String content = "# %s %n %s"
                                    .formatted(
                                            success.project().name(),
                                            miningPrinter.printAllResults(results, success.project()));

                            var laughingRepo = getLaughingRepo();
                            updateOrCreateContent(
                                    laughingRepo, success.project().name(), content);
                        } catch (Exception e) {
                            logger.atSevere().withCause(e).log("Error while updating content");
                        }
                        return Uni.createFrom().voidItem();
                    })
                    .orElse(Uni.createFrom().voidItem());
        }
        return Uni.createFrom().voidItem();
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

    @ConsumeEvent(ServiceAddresses.REMINE_REQUEST)
    public void addToQueue(Project project) {
        queue.add(project);
    }
}
