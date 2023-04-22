package io.github.martinwitt.laughing_train.github_miner.usecase;

import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.quarkus.logging.Log;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Random;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepositorySearchBuilder.Sort;
import org.kohsuke.github.GitHub;

@ApplicationScoped
public class SearchProjectOnGithub {

    @SuppressWarnings("NullAway")
    @ConfigProperty(name = "mining.github.search.orgs")
    List<String> orgs;

    private final Random random = new Random();

    /**
     * Searches for a random project on github and returns it as a {@link Uni} of {@link Project}.
     * Only projects from the config property {@code mining.github.search.orgs} are considered.
     * @return {@link Uni} of {@link Project}
     */
    public Uni<GitHubProject> searchProjectOnGithub() {
        return findRandomRepositoryOnGithub().onItem().transform(this::toProject);
    }

    private Uni<GHRepository> findRandomRepositoryOnGithub() {

        try {
            GitHub github = GitHub.connectUsingOAuth(System.getenv("GITHUB_TOKEN"));
            List<GHRepository> repos = github.searchRepositories()
                    .q("language:java")
                    .org(getRandomOrgName())
                    .sort(Sort.UPDATED)
                    .list()
                    .withPageSize(50)
                    .iterator()
                    .nextPage();
            return Uni.createFrom().item(repos.get(random.nextInt(repos.size())));
        } catch (Exception e) {
            Log.error("Error while searching for project on github", e);
            return Uni.createFrom().failure(e);
        }
    }

    /**
     * {@return the name of any organization} from the config property {@code mining.github.search.orgs}
     */
    private String getRandomOrgName() {
        String org = orgs.get(random.nextInt(orgs.size()));
        Log.info("Searching for project in org %s".formatted(org));
        return org;
    }

    private GitHubProject toProject(GHRepository ghRepo) {
        String repositoryName = ghRepo.getName();
        String repositoryOwner = ghRepo.getOwnerName();
        String repositoryUrl = ghRepo.getHtmlUrl().toString();
        String repositoryDescription = ghRepo.getDescription();
        String repositoryLanguage = ghRepo.getLanguage();
        String apiURL = ghRepo.getUrl().toString();
        return new GitHubProject(
                repositoryName, repositoryOwner, repositoryUrl, repositoryDescription, repositoryLanguage, apiURL);
    }
}
