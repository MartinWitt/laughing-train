package io.github.martinwitt.laughing_train.github_miner.persistence;

import io.github.martinwitt.laughing_train.github_miner.data.GitHubProject;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface GitHubProjectRepository {

    /**
     * Inserts a new project into the database. If the project already exists, it will not be inserted.
     * @param project  the project to insert
     * @return       true if the project was inserted, false if it already exists
     */
    Uni<Boolean> insertProject(GitHubProject project);

    /**
     * Finds a project by its name and owner. If the project does not exist, null is returned.
     * For a github repository, the name is the name of the repository and the owner is the name of the owner of the repository. For example the repository
     * https://github.com/oracle/graal/ has the name "graal" and the owner "oracle".
     * @param repositoryName  the name of the repository
     * @param repositoryOwner  the owner of the repository
     * @return  the project if it exists, null otherwise
     */
    Uni<GitHubProject> findProject(String repositoryName, String repositoryOwner);

    /**
     * Updates a project. If the project does not exist, it will not be updated.
     * @param project  the project to update
     * @return  true if the project was updated, false if it does not exist
     */
    Uni<Boolean> updateProject(GitHubProject project);

    /**
     * Deletes a project. If the project does not exist, it will not be deleted.
     * @param repositoryName  the name of the repository
     * @param repositoryOwner  the owner of the repository
     * @return  true if the project was deleted, false if it does not exist
     */
    Uni<Boolean> deleteProject(String repositoryName, String repositoryOwner);

    /**
     * Returns all projects in the database.
     * @return  a Multi of all projects
     */
    Multi<GitHubProject> findAllProjects();

    /**
     * Returns a single random project from the database.
     * @return  a Uni of a random project
     */
    Uni<GitHubProject> findRandomProject();
}
