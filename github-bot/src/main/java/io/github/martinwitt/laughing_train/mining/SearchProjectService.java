package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.quarkus.logging.Log;
import io.smallrye.mutiny.Uni;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.ApplicationScoped;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepositorySearchBuilder.Sort;
import org.kohsuke.github.GitHub;

/**
 * This service handles searches for random java projects on github. Use this service to get a random project from github.
 * See {@link #searchProjectOnGithub()}.
 */
@ApplicationScoped
public class SearchProjectService {
    @ConfigProperty(name = "mining.github.search.orgs")
    List<String> orgs;

    private final Random random = new Random();

    /**
     * Searches for a random project on github and returns it as a {@link Uni} of {@link Project}.
     * Only projects from the config property {@code mining.github.search.orgs} are considered.
     * @return {@link Uni} of {@link Project}
     */
    public Uni<Project> searchProjectOnGithub() {
        var repo = findRandomRepositoryOnGithub();
        if (repo == null) {
            return Uni.createFrom().nullItem();
        }
        if (Project.findByProjectName(repo.getName()) != null) {
            return searchProjectOnGithub();
        }
        Project project = new Project(repo.getName(), repo.getHttpTransportUrl());
        project.persist();
        ProjectConfig.ofProjectUrl(repo.getHttpTransportUrl()).persistOrUpdate();
        return Uni.createFrom().item(project);
    }

    private @Nullable GHRepository findRandomRepositoryOnGithub() {
        try {
            GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
            var repos = github.searchRepositories()
                    .q("language:java")
                    .org(getRandomOrgName())
                    .sort(Sort.UPDATED)
                    .list()
                    .toList();
            return repos.get(random.nextInt(repos.size()));
        } catch (Exception e) {
            Log.error("Error while searching for project on github", e);
            return null;
        }
    }

    private String getRandomOrgName() {
        return orgs.get(random.nextInt(orgs.size()));
    }
}
