package io.github.martinwitt.laughing_train.mining;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.AnalyzerRequest;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.data.QodanaResult;
import io.github.martinwitt.laughing_train.services.ServiceAdresses;
import io.quarkus.scheduler.Scheduled;
import io.vertx.core.AsyncResult;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
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

    @Scheduled(every = "2h")
    void mineRepos() throws IOException {
        Path dir = Files.createTempDirectory("laughing-wiki");
        try (Git git = getWiki(dir)) {
            Path miningFile = dir.resolve("Mining.md");
            List<String> repoUrls = getRepoUrls(miningFile);
            logger.atInfo().log("Mining %s repos", repoUrls.size());
            logger.atInfo().log("Mining %s", repoUrls);
            Collections.shuffle(repoUrls);
            for (String url : repoUrls) {
                String repoName = StringUtils.substringAfterLast(url, "/");
                eventBus.<ProjectResult>request(
                        ServiceAdresses.PROJECT_REQUEST,
                        new ProjectRequest.WithUrl(url),
                        new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)),
                        result -> vertx.executeBlocking(v -> mineProject(repoName, result)));
            }
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error while mining");
        }
    }

    private Promise<Void> mineProject(String repoName, AsyncResult<Message<ProjectResult>> message) {
        if (message.succeeded()) {
            logger.atInfo().log("Mining periodic %s", repoName);
            if (message.result().body() instanceof ProjectResult.Success project) {
                eventBus.<QodanaResult>request(
                        ServiceAdresses.QODANA_ANALYZER_REQUEST,
                        new AnalyzerRequest.WithProject(project.project()),
                        new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)),
                        result -> vertx.executeBlocking(v -> handle(result.result())));
            } else {
                logger.atWarning().log("Mining periodic %s failed", message);
            }
        } else {
            logger.atSevere().log("Mining periodic %s failed with error %s", repoName, message.cause());
        }
        return Promise.promise();
    }

    private List<String> getRepoUrls(Path miningFile) throws IOException {
        String repos =
                StringUtils.substringBetween(Files.readString(miningFile), "<!-- repoStart -->", "<!-- reposEnd -->");
        List<String> repoUrls = repos.lines().map(String::trim).collect(Collectors.toList());
        repoUrls.removeIf(String::isEmpty);
        return repoUrls;
    }

    private Git getWiki(Path dir) throws GitAPIException {
        return Git.cloneRepository()
                .setURI("https://github.com/MartinWitt/laughing-train.wiki.git")
                .setDirectory(dir.toFile())
                .call();
    }

    private Promise<Void> handle(Message<QodanaResult> message) {
        if (message.body() instanceof QodanaResult.Success success) {
            try (Project projectQodana = success.project()) {
                List<AnalyzerResult> results = success.result();
                StringBuilder builder = new StringBuilder();
                builder.append("# ")
                        .append(projectQodana.getOwnerRepoName())
                        .append(miningPrinter.printAllResults(results, projectQodana));

                var laughingRepo = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"))
                        .getRepository("MartinWitt/laughing-train");
                updateOrCreateContent(laughingRepo, projectQodana.name(), builder.toString());
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("Error while updating content");
            }
        }
        return Promise.promise();
    }

    private void updateOrCreateContent(GHRepository repo, String repoName, String content) {
        try {
            repo.getFileContent("mining/" + repoName + ".md", "gh-mining")
                    .update(content, "Update mining results for " + repoName, "gh-mining");
        } catch (Exception logged) {
            logger.atSevere().withCause(logged).log("Error while updating mining results");
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
