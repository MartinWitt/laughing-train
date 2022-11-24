package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectConfigGraphQLDto;
import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectGraphQLDto;
import io.github.martinwitt.laughing_train.data.FindProjectConfigRequest;
import io.github.martinwitt.laughing_train.domain.entity.Project;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectConfigRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.github.martinwitt.laughing_train.services.ProjectConfigService;
import io.quarkus.security.Authenticated;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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
    public Uni<List<ProjectGraphQLDto>> getAllProjects() {
        return projectRepository.getAll().map(this::mapToDto);
    }

    @Query("getProjectWithName")
    @Description("Gets project with given name from the database")
    public Uni<ProjectGraphQLDto> getProject(String projectName) {
        return projectRepository
                .findByProjectName(projectName)
                .map(projects -> projects.get(0))
                .map(this::mapToDto)
                .onFailure()
                .recoverWithUni(Uni.createFrom().<ProjectGraphQLDto>nothing());
    }

    @Query("getHashesForProject")
    @Description("Gets all commit hashes for a project from the database")
    public Uni<List<String>> getHashesForProject(String projectName) {
        return projectRepository
                .findByProjectName(projectName)
                .map(projects -> projects.get(0))
                .map(Project::getCommitHashes)
                .onFailure()
                .recoverWithUni(Uni.createFrom().nothing());
    }

    @Mutation("addProject")
    @Authenticated
    @Description("Adds a project to the database")
    public Uni<ProjectGraphQLDto> addProject(String projectUrl, String projectName) {
        return projectConfigRepository
                .existsByProjectUrl(projectUrl)
                .invoke(exist -> {
                    if (exist) {
                        projectConfigRepository.create(ProjectConfig.ofProjectUrl(projectUrl));
                    }
                })
                .replaceWith(new Project(projectName, projectUrl))
                .invoke(project -> projectRepository.create(project))
                .map(this::mapToDto);
    }

    @Mutation("deleteProject")
    @Authenticated
    @Description("Deletes a project from the database")
    public Uni<List<ProjectGraphQLDto>> removeProjectByName(String projectName) {
        return projectRepository
                .findByProjectName(projectName)
                .invoke(projects -> {
                    for (Project project : projects) {
                        projectRepository.deleteByProjectName(projectName);
                        projectConfigRepository.deleteByProjectUrl(project.getProjectUrl());
                    }
                })
                .map(this::mapToDto);
    }

    @Query("login")
    @Authenticated
    @Description("Logins the user")
    public String login(@DefaultValue("defaultValue") String notNeeded) {
        return "login successful";
    }

    @Query("getProjectConfig")
    @Description("Gets the project config for a project")
    public Uni<ProjectConfigGraphQLDto> getProjectConfig(String projectUrl) {
        return projectConfigService
                .getConfig(new FindProjectConfigRequest.ByProjectUrl(projectUrl))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return projectConfigRepository
                                .create(ProjectConfig.ofProjectUrl(projectUrl))
                                .map(ProjectConfigGraphQLDto::new);
                    } else {
                        return Uni.createFrom().item(list.get(0)).map(ProjectConfigGraphQLDto::new);
                    }
                });
    }
    // Disable for now
    // @Mutation
    @Authenticated
    @Description("Sets the project config for a project")
    public Uni<ProjectConfigGraphQLDto> setProjectConfig(ProjectConfigGraphQLDto projectConfig) {

        String projectUrl = projectConfig.getProjectUrl();
        return projectConfigService
                .getConfig(new FindProjectConfigRequest.ByProjectUrl(projectUrl))
                .flatMap(list -> {
                    if (list.isEmpty()) {
                        return projectConfigRepository
                                .create(ProjectConfig.ofProjectUrl(projectUrl))
                                .map(ProjectConfigGraphQLDto::new);
                    } else {
                        ProjectConfig config = new ProjectConfig(projectConfig.getSourceFolder(), projectUrl);
                        return projectConfigRepository.save(config).map(ProjectConfigGraphQLDto::new);
                    }
                });
    }

    private ProjectGraphQLDto mapToDto(Project project) {
        return new ProjectGraphQLDto(project);
    }

    private List<ProjectGraphQLDto> mapToDto(List<? extends Project> projects) {
        return projects.stream().map(this::mapToDto).toList();
    }
}
