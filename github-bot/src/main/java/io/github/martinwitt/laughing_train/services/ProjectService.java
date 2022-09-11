package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.quarkus.vertx.ConsumeEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;

@ApplicationScoped
public class ProjectService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Inject
    ThreadPoolManager threadPoolManager;

    @ConsumeEvent(value = ServiceAdresses.PROJECT_REQUEST, blocking = true)
    public ProjectResult handleProjectRequest(ProjectRequest request) {
        logger.atInfo().log("Received project request %s", request);
        if (request instanceof ProjectRequest.WithUrl url) {
            try {
                String repoName = StringUtils.substringAfterLast(url.url(), "/");
                Path dir = Files.createTempDirectory("laughing-train-" + repoName);
                threadPoolManager.getService().execute(() -> checkoutRepo(url, dir));
                logger.atInfo().log("Cloning %s to %s", url.url(), dir);
                return new ProjectResult.Success(new Project(repoName, url.url(), dir.toFile(), "."));
            } catch (IOException e) {
                logger.atSevere().withCause(e).log("Error cloning repository");
                return new ProjectResult.Error(e.getMessage());
            }
        }
        return new ProjectResult.Error("Unknown request");
    }

    private void checkoutRepo(ProjectRequest.WithUrl url, Path dir) {
        try (Git git = Git.cloneRepository()
                .setURI(url.url())
                .setDirectory(dir.toFile())
                .call()) {
            // nothing to do
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Error cloning repository");
        }
    }

    @ApplicationScoped
    static class ThreadPoolManager {
        ExecutorService service;

        @PostConstruct
        void setup() {
            service = Executors.newFixedThreadPool(1);
        }

        @PreDestroy
        void close() {
            service.shutdown();
        }

        public ExecutorService getService() {
            return service;
        }
    }
}
