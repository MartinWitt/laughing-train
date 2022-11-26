package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectConfigGraphQLDto;
import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectGraphQLDto;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectConfigService;
import io.quarkus.security.Authenticated;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.apache.commons.lang3.NotImplementedException;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@RequestScoped
public class ProjectGraphQL {

    @Inject
    ProjectConfigService projectConfigService;

    @Inject
    ProjectRepository projectRepository;

    @Inject
    ProjectConfigRepository projectConfigRepository;

    @Query("getProjects")
    @Description("Gets all projects from the database")
    public List<ProjectGraphQLDto> getAllProjects() {
        return projectRepository.getAll().stream().map(this::mapToDto).toList();
    }

    @Query("getProjectWithName")
    @Description("Gets project with given name from the database")
    public ProjectGraphQLDto getProject(String projectName) {
        return projectRepository.findByProjectName(projectName).stream()
                .findFirst()
                .map(this::mapToDto)
                .orElseThrow();
    }

    @Query("getHashesForProject")
    @Description("Gets all commit hashes for a project from the database")
    public List<String> getHashesForProject(String projectName) {
        return projectRepository.findByProjectName(projectName).stream()
                .findFirst()
                .map(Project::getCommitHashes)
                .orElseThrow();
    }

    @Mutation("addProject")
    @Authenticated
    @Description("Adds a project to the database")
    public ProjectGraphQLDto addProject(String projectUrl, String projectName) {
        if (!projectRepository.existsByProjectUrl(projectUrl)) {
            return mapToDto(projectRepository.create(new Project(projectUrl, projectName)));
        } else {
            throw new RuntimeException("Project already exists");
        }
    }

    @Mutation("deleteProject")
    @Authenticated
    @Description("Deletes a project from the database")
    public List<ProjectGraphQLDto> removeProjectByName(String projectName) {
        List<Project> projects = projectRepository.findByProjectName(projectName);
        projectRepository.deleteByProjectName(projectName);
        return projects.stream().map(this::mapToDto).toList();
    }

    @Query("login")
    @Authenticated
    @Description("Logins the user")
    public String login(@DefaultValue("defaultValue") String notNeeded) {
        return "login successful";
    }

    @Query("getProjectConfig")
    @Description("Gets the project config for a project")
    public ProjectConfigGraphQLDto getProjectConfig(String projectUrl) {
        return projectConfigRepository.findByProjectUrl(projectUrl).stream()
                .findFirst()
                .map(ProjectConfigGraphQLDto::new)
                .orElseThrow();
    }
    // Disable for now
    // @Mutation
    @Authenticated
    @Description("Sets the project config for a project")
    public ProjectConfigGraphQLDto setProjectConfig(ProjectConfigGraphQLDto projectConfig) {
        // TODO: implement
        throw new NotImplementedException();
    }

    private ProjectGraphQLDto mapToDto(Project project) {
        return new ProjectGraphQLDto(project);
    }
}
