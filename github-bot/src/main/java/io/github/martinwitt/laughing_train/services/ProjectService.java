package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.quarkus.vertx.ConsumeEvent;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.unchecked.Unchecked;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;

@ApplicationScoped
public class ProjectService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final Random random = new Random();

    @Inject
    ThreadPoolManager threadPoolManager;

    @ConsumeEvent(value = ServiceAdresses.PROJECT_REQUEST, blocking = true)
    public ProjectResult handleProjectRequest(ProjectRequest request) {
        logger.atInfo().log("Received project request %s", request);
        if (request instanceof ProjectRequest.WithUrl url) {
            try {
                String repoName = StringUtils.substringAfterLast(url.url(), "/").replace(".git", "");

                Path dir = Files.createTempDirectory("laughing-train-" + repoName + random.nextLong());
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
        Uni<Git> git = createAsyncRepo(url, dir);
        git.onFailure()
                .recoverWithItem(createAsyncRepo(url, dir).await().indefinitely())
                .subscribe()
                .with(
                        v -> {
                            v.close();
                            System.out.println("Clone successfull");
                            try {
                                Files.list(dir).forEach(System.out::println);
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        },
                        e -> {
                            try {
                                FileUtils.deleteDirectory(dir.toFile());
                            } catch (IOException e1) {
                                logger.atSevere().withCause(e1).log("Error deleting directory %s", dir);
                            }
                            logger.atSevere().withCause(e).log("Error cloning repository");
                        });
    }

    private Uni<Git> createAsyncRepo(ProjectRequest.WithUrl url, Path dir) {
        return Uni.createFrom().item(Unchecked.supplier(() -> {
            FileUtils.deleteDirectory(dir.toFile());
            Files.createDirectories(dir);
            Files.list(dir).forEach(System.out::println);
            return Git.cloneRepository()
                    .setURI(url.url())
                    .setDirectory(dir.toFile())
                    .call();
        }));
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
