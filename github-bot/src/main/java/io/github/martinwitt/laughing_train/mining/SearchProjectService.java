package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
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
    @SuppressWarnings("NullAway")
    @ConfigProperty(name = "mining.github.search.orgs")
    List<String> orgs;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    ProjectConfigRepository projectConfigRepository;

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
        return Uni.createFrom()
                .item(findRandomRepositoryOnGithub())
                .onItem()
                .ifNull()
                .failWith(() -> new RuntimeException("No project found on github"))
                .invoke(project -> registry.counter("mining.github.search", "status", "success")
                        .increment())
                .flatMap(this::getProjectIfExisting)
                .invoke(this::persistProject)
                .invoke(this::persistProjectConfigIfMissing);
    }
    /**
     * This searches for the repository in the database and returns it if it exists.
     * @param ghRepo  the repository to search for
     * @return the repository if it exists, null otherwise
     */
    private Uni<Project> getProjectIfExisting(GHRepository ghRepo) {
        return Uni.createFrom()
                .item(projectRepository.findByProjectName(ghRepo.getName()))
                .<Project>flatMap(v -> v.isEmpty()
                        ? Uni.createFrom().nothing()
                        : Uni.createFrom().item(v.get(0)));
    }

    private Uni<Project> persistProject(Project project) {
        return Uni.createFrom()
                .item(projectRepository.findByProjectUrl(project.getProjectUrl()))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return Uni.createFrom().item(projectRepository.create(project));
                    } else {
                        return Uni.createFrom().item(project);
                    }
                });
    }

    private Uni<Project> persistProjectConfigIfMissing(Project project) {
        String projectUrl = project.getProjectUrl();
        return Uni.createFrom()
                .item(projectConfigRepository.findByProjectUrl(projectUrl))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        projectConfigRepository.create(ProjectConfig.ofProjectUrl(projectUrl));
                    }
                    return Uni.createFrom().item(project);
                });
    }

    private @Nullable GHRepository findRandomRepositoryOnGithub() {

        try {
            GitHub github = GitHub.connectAnonymously();
            var repos = github.searchRepositories()
                    .q("language:java")
                    .org(getRandomOrgName())
                    .sort(Sort.UPDATED)
                    .list()
                    .withPageSize(30)
                    .iterator()
                    .nextPage();
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
