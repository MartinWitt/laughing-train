package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import com.mongodb.client.model.Aggregates;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.services.ServiceAdresses;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Uni;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.mutiny.core.eventbus.EventBus;
import io.vertx.mutiny.core.eventbus.Message;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
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

    private final MeterRegistry registry;

    private final Random random = new Random();

    public PeriodicMiner(MeterRegistry registry) {
        this.registry = registry;
    }

    private Uni<Project> getRandomProject() {
        if (random.nextInt(5) >= 3) {
            return searchProjectService.searchProjectOnGithub();
        } else {
            return getKnownProject();
        }
    }

    private Uni<Project> getKnownProject() {
        return Uni.createFrom()
                .item(Project.<Project>mongoCollection()
                        .aggregate(List.of(Aggregates.sample(1)))
                        .first());
    }

    void mine(@Observes StartupEvent event) {
        vertx.setTimer(TimeUnit.MINUTES.toMillis(5), v -> mineRandomRepo());
    }

    private void mineRandomRepo() {
        getRandomProject()
                .ifNoItem()
                .after(Duration.ofSeconds(30))
                .fail()
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
                            logger.atInfo().log("Finished mining. Next project starting now.");
                            mineRandomRepo();
                        },
                        e -> {
                            logger.atInfo().log("Failed mining" + e.getMessage());
                            mineRandomRepo();
                        });
    }

    private Uni<Message<ProjectResult>> checkoutProject(Project project) {
        return eventBus.<ProjectResult>request(
                ServiceAdresses.PROJECT_REQUEST,
                new ProjectRequest.WithUrl(project.getProjectUrl()),
                new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)));
    }

    private Uni<Message<QodanaResult>> analyzeProject(Message<ProjectResult> message) {
        if (message.body() instanceof ProjectResult.Success project) {
            return eventBus.<QodanaResult>request(
                    ServiceAdresses.QODANA_ANALYZER_REQUEST,
                    new AnalyzerRequest.WithProject(project.project()),
                    new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)));
        } else {
            logger.atWarning().log("Mining periodic %s failed", message);
            return Uni.createFrom().failure(new IllegalStateException("No project found"));
        }
    }

    private void addOrUpdateCommitHash(Message<ProjectResult> projectResult) {
        if (projectResult.body() instanceof ProjectResult.Success project) {
            String name = project.project().name();
            List<Project> query = Project.findByProjectName(name);
            String commitHash = project.project().commitHash();
            if (hasSingleResult(query)) {
                query.get(0).addCommitHash(commitHash);
                query.get(0).persistOrUpdate();
            } else {
                String url = project.project().url();
                var newProject = new Project(name, url);
                newProject.addCommitHash(commitHash);
                newProject.persistOrUpdate();
            }
        }
    }

    private boolean hasSingleResult(List<Project> query) {
        return query.size() == 1;
    }

    private Uni<Void> saveQodanaResults(Message<QodanaResult> message) {
        if (message.body() instanceof QodanaResult.Success success) {
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
}
