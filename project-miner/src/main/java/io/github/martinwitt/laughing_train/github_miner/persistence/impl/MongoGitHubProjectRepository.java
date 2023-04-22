package io.github.martinwitt.laughing_train.github_miner.persistence.impl;

import com.mongodb.client.model.Aggregates;
import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.github.martinwitt.laughing_train.github_miner.persistence.GitHubProjectRepository;
import io.quarkus.logging.Log;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import org.bson.Document;

@ApplicationScoped
public class MongoGitHubProjectRepository
        implements GitHubProjectRepository, ReactivePanacheMongoRepository<GitHubProject> {

    @Override
    public Uni<Boolean> insertProject(GitHubProject project) {
        Log.info("Inserting project: " + project.getRepositoryName() + " " + project.getRepositoryOwner());

        return findProject(project.getRepositoryName(), project.getRepositoryOwner())
                .onItem()
                .ifNotNull()
                .failWith(new Exception("Project already exists"))
                .replaceWith(persist(project))
                .onItem()
                .transform(p -> true)
                .onFailure()
                .recoverWithItem(false);
    }

    @Override
    public Uni<GitHubProject> findProject(String repositoryName, String repositoryOwner) {
        return mongoCollection()
                .aggregate(List.of(
                        Aggregates.match(new Document("repositoryName", repositoryName)),
                        Aggregates.match(new Document("repositoryOwner", repositoryOwner))))
                .collect()
                .first();
    }

    @Override
    public Uni<Boolean> updateProject(GitHubProject project) {
        return findProject(project.getRepositoryName(), project.getRepositoryOwner())
                .onItem()
                .ifNull()
                .failWith(new Exception("Project not found"))
                .onItem()
                .ifNotNull()
                .transform(it -> it.update(project))
                .onItem()
                .transform(p -> persist(p)
                        .subscribeAsCompletionStage()
                        .toCompletableFuture()
                        .join())
                .onItem()
                .transform(p -> true)
                .onFailure()
                .recoverWithItem(false);
    }

    @Override
    public Uni<Boolean> deleteProject(String repositoryName, String repositoryOwner) {
        return findProject(repositoryName, repositoryOwner)
                .onItem()
                .ifNull()
                .failWith(new Exception("Project not found"))
                .onItem()
                .ifNotNull()
                .transformToUni(it -> delete(it))
                .onItem()
                .transform(p -> true)
                .onFailure()
                .recoverWithItem(false);
    }

    @Override
    public Multi<GitHubProject> findAllProjects() {
        return findAll().stream();
    }

    @Override
    public Uni<GitHubProject> findRandomProject() {
        return this.mongoCollection()
                .aggregate(List.of(Aggregates.sample(1)), GitHubProject.class)
                .toUni();
    }
}
