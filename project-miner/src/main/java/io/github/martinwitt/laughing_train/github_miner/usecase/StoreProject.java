package io.github.martinwitt.laughing_train.github_miner.usecase;

import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.github.martinwitt.laughing_train.github_miner.persistence.GitHubProjectRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StoreProject {

    private final GitHubProjectRepository projectRepository;

    StoreProject(GitHubProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Uni<Boolean> storeProject(GitHubProject project) {
        return projectRepository
                .findProject(project.getRepositoryName(), project.getRepositoryOwner())
                .onItem()
                .ifNull()
                .continueWith(project)
                .onItem()
                .transform(projectRepository::insertProject)
                .onItem()
                .transform(p -> true)
                .onFailure()
                .recoverWithItem(false);
    }
}
