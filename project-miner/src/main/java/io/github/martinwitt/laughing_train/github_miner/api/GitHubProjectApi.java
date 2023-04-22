package io.github.martinwitt.laughing_train.github_miner.api;

import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.github.martinwitt.laughing_train.github_miner.persistence.GitHubProjectRepository;
import io.quarkus.security.Authenticated;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestPath;

@Path("projects")
public class GitHubProjectApi {

    private final GitHubProjectRepository projectRepository;

    GitHubProjectApi(GitHubProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GET
    @Path("{repositoryName}/{repositoryOwner}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<GitHubProject> getProject(@RestPath String repositoryName, @RestPath String repositoryOwner) {
        return projectRepository.findProject(repositoryName, repositoryOwner);
    }

    @GET
    @Path("/all")
    public Multi<GitHubProject> getAllProjects() {
        return projectRepository.findAllProjects();
    }

    @GET
    @Path("/random")
    public Uni<GitHubProject> getRandomProject() {
        return projectRepository.findRandomProject();
    }

    @DELETE
    @Path("{repositoryName}/{repositoryOwner}")
    @Authenticated
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Boolean> deleteProject(@RestPath String repositoryName, @RestPath String repositoryOwner) {
        return projectRepository.deleteProject(repositoryName, repositoryOwner);
    }

    @PUT
    @Path("{repositoryName}/{repositoryOwner}")
    @Authenticated
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Boolean> updateProject(
            @RestPath String repositoryName, @RestPath String repositoryOwner, GitHubProject project) {
        return projectRepository.updateProject(project);
    }
}
