package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.persistence.Project;
import io.github.martinwitt.laughing_train.persistence.ProjectConfig;
import io.micrometer.core.instrument.MeterRegistry;
import io.quarkus.logging.Log;
import io.smallrye.health.api.AsyncHealthCheck;
import io.smallrye.mutiny.Uni;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
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
    private final MeterRegistry registry;

    public SearchProjectService(MeterRegistry registry) {
        this.registry = registry;
    }

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
        registry.summary("mining.github.search.projects", "name", repo.getName());
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

    @Readiness
    static class MiningHealthCheck implements AsyncHealthCheck {

        @Inject
        SearchProjectService searchProjectService;

        @Override
        public Uni<HealthCheckResponse> call() {
            return Uni.createFrom()
                    .item(HealthCheckResponse.named("Search Project Service")
                            .up()
                            .build());
        }
    }
}
