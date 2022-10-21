package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.BranchNameSupplier;
import io.github.martinwitt.laughing_train.ChangelogPrinter;
import io.github.martinwitt.laughing_train.Config;
import io.github.martinwitt.laughing_train.GitHubUtils;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.github.martinwitt.laughing_train.persistence.BadSmell;
import io.vertx.core.AsyncResult;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.kohsuke.github.GHRef;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

@ApplicationScoped
public class RefactorService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String LABEL_NAME = "laughing-train-repair";

    @Inject
    Config config;

    @Inject
    EventBus eventBus;

    @Inject
    Vertx vertx;

    @Inject
    BranchNameSupplier branchNameSupplier;

    @Inject
    ChangelogPrinter changelogPrinter;

    public void refactor(List<BadSmell> badSmells) {
        var badSmellByAnalyzer = badSmells.stream().collect(Collectors.groupingBy(v -> v.getAnalyzer()));
        for (var entry : badSmellByAnalyzer.entrySet()) {
            var analyzer = entry.getKey();
            var badSmellList = entry.getValue();
            switch (analyzer) {
                case "qodana" -> refactorQodana(badSmellList);
                default -> logger.atWarning().log("Unknown analyzer %s", analyzer);
            }
            logger.atInfo().log("Refactoring");
        }
    }

    private void refactorQodana(List<BadSmell> badSmells) {
        String projectUrl = badSmells.get(0).projectUrl;
        eventBus.<ProjectResult>request(
                ServiceAdresses.PROJECT_REQUEST,
                new ProjectRequest.WithUrl(projectUrl),
                new DeliveryOptions().setSendTimeout(TimeUnit.MINUTES.toMillis(300)),
                result -> vertx.executeBlocking(v -> createPullRequest(result, badSmells)));
    }

    private Promise<String> createPullRequest(AsyncResult<Message<ProjectResult>> message, List<BadSmell> badSmells) {
        if (message.failed()) {
            logger.atSevere().withCause(message.cause()).log("Failed to get project");
            return Promise.promise();
        }
        var projectResult = message.result().body();
        if (projectResult instanceof ProjectResult.Error error) {
            logger.atSevere().log("Failed to get project %s", error.message());
            return Promise.promise();
        }
        if (projectResult instanceof ProjectResult.Success success) {
            ChangeListener listener = new ChangeListener();
            QodanaRefactor refactor = new QodanaRefactor(EnumSet.allOf(QodanaRules.class), listener, badSmells);
            Function<ChangeListener, TransformationProcessor<?>> function = (v -> refactor);
            TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
            transformationEngine.setChangeListener(listener);
            Changelog log = transformationEngine.applyToGivenPath(
                    success.project().folder().getAbsolutePath());
            try {
                GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
                GHRepository repository = createForkIfMissing(success, github);
                GitHubUtils.createLabelIfMissing(repository);
                createSinglePullRequest(repository, success.project().folder().toPath(), log.getChanges());
            } catch (Exception e) {
                logger.atSevere().withCause(e).log("Failed to create pull request");
                FileUtils.deleteQuietly(success.project().folder());
            }
            return Promise.promise();
        }
        return Promise.promise();
    }

    private GHRepository createForkIfMissing(ProjectResult.Success success, GitHub github) throws IOException {
        GHRepository repository = github.getRepository(success.project().getOwnerRepoName());
        if (github.getMyself().getRepository(success.project().name()) == null) {
            repository = repository.fork();
        } else {
            repository = github.getMyself().getRepository(success.project().name());
        }
        return repository;
    }

    private void createSinglePullRequest(GHRepository repo, Path dir, List<? extends Change> changes)
            throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log("Found changes for %s types", changes.size());
        String branchName = branchNameSupplier.createBranchName();
        GHRef ref =
                repo.createRef("refs/heads/" + branchName, mainRef.getObject().getSha());
        StringBuilder body = new StringBuilder();
        body.append(changelogPrinter.printRepairedIssues(changes));
        createCommit(repo, dir, changes.stream().map(Change::getAffectedType).collect(Collectors.toList()), ref);
        body.append(changelogPrinter.printChangeLogShort(changes));
        createPullRequest(repo, branchName, body.toString());
    }

    private void createCommit(GHRepository repo, Path dir, List<? extends CtType<?>> types, GHRef ref)
            throws IOException {
        var treeBuilder = repo.createTree().baseTree(ref.getObject().getSha());
        for (CtType<?> ctType : types) {
            treeBuilder.add(
                    relativize(dir, getFileForType(ctType)),
                    Files.readString(getFileForType(ctType)).replace("\r\n", "\n"),
                    false);
        }
        var tree = treeBuilder.create();
        var commit = repo.createCommit()
                .message("fix Bad Smells in multiple files")
                .author("MartinWitt", "wittlinger.martin@gmail.com", Date.from(Instant.now()))
                .tree(tree.getSha())
                .parent(ref.getObject().getSha())
                .create();
        ref.updateTo(commit.getSHA1());
        logger.atInfo().log("Created commit %s", commit.getHtmlUrl());
    }

    private Path getFileForType(CtType<?> type) {
        return type.getPosition().getFile().toPath();
    }

    private String relativize(Path root, Path child) {
        try {
            Path relative =
                    root.toRealPath(LinkOption.NOFOLLOW_LINKS).relativize(child.toRealPath(LinkOption.NOFOLLOW_LINKS));
            return relative.toString().replace('\\', '/');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private void createPullRequest(GHRepository repo, String branchName, String body) throws IOException {
        repo.createPullRequest("fix Bad Smells", branchName, repo.getDefaultBranch(), body)
                .addLabels(LABEL_NAME);
    }
}
