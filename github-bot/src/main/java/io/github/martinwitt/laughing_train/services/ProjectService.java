package io.github.martinwitt.laughing_train.services;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.data.Project;
import io.github.martinwitt.laughing_train.data.ProjectRequest;
import io.github.martinwitt.laughing_train.data.ProjectResult;
import io.quarkus.vertx.ConsumeEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

public class ProjectService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @ConsumeEvent(value = ServiceAdresses.PROJECT_REQUEST, blocking = true)
    public ProjectResult handleProjectRequest(ProjectRequest request) {
        if (request instanceof ProjectRequest.WithUrl url) {
            try {
                String repoName = StringUtils.substringAfterLast(url.url(), "/");
                Path dir = Files.createTempDirectory("laughing-train-" + repoName);
                Git.cloneRepository()
                        .setURI(url.url())
                        .setDirectory(dir.toFile())
                        .call();
                return new ProjectResult.Success(new Project(repoName, url.url(), dir.toFile()));

            } catch (GitAPIException | IOException e) {
                logger.atSevere().withCause(e).log("Error cloning repository");
                return new ProjectResult.Error(e.getMessage());
            }
        }
        return new ProjectResult.Error("Unknown request");
    }
}
