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
import javax.enterprise.context.ApplicationScoped;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;

@ApplicationScoped
public class ProjectService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final Random random = new Random();

    @ConsumeEvent(value = ServiceAdresses.PROJECT_REQUEST, blocking = true)
    public ProjectResult handleProjectRequest(ProjectRequest request) throws IOException {
        logger.atInfo().log("Received project request %s", request);
        if (request instanceof ProjectRequest.WithUrl url) {
            String repoName = StringUtils.substringAfterLast(url.url(), "/").replace(".git", "");
            Path dir = Files.createTempDirectory("laughing-train-" + repoName + random.nextLong());
            return checkoutRepo(url, dir)
                    .onItem()
                    .invoke(() -> logger.atInfo().log("Cloned %s to %s", url.url(), dir))
                    .onFailure()
                    .invoke(e -> logger.atSevere().withCause(e).log("Error while cloning %s to %s", url.url(), dir))
                    .onFailure()
                    .invoke(e -> FileUtils.deleteQuietly(dir.toFile()))
                    .onItemOrFailure()
                    .<ProjectResult>transform((v, error) -> {
                        if (error == null) {
                            v.close();
                            return new ProjectResult.Success(new Project(repoName, url.url(), dir.toFile(), "."));
                        } else {
                            v.close();
                            return new ProjectResult.Error(error.getMessage());
                        }
                    })
                    .await()
                    .indefinitely();
        }
        return new ProjectResult.Error("Unknown request");
    }

    private Uni<Git> checkoutRepo(ProjectRequest.WithUrl url, Path dir) {
        return createAsyncRepo(url, dir);
    }

    private Uni<Git> createAsyncRepo(ProjectRequest.WithUrl url, Path dir) {
        return Uni.createFrom().item(Unchecked.supplier(() -> {
            FileUtils.deleteDirectory(dir.toFile());
            Files.createDirectories(dir);
            return Git.cloneRepository()
                    .setURI(url.url())
                    .setDirectory(dir.toFile())
                    .call();
        }));
    }
}
