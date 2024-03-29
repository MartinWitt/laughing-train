package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectGraphQLDto;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import java.util.List;
import org.eclipse.microprofile.graphql.*;

@GraphQLApi
public class ProjectGraphQL {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject ProjectRepository projectRepository;

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

  @Query("getGitHubCommitsForProject")
  @Description("Returns all github commits for a project from the database")
  public List<GitHubCommit> getGitHubCommitsForProject(String projectName) {
    return projectRepository.findByProjectName(projectName).stream()
        .findFirst()
        .map(RemoteProject::getCommits)
        .orElseThrow();
  }

  @Mutation("addProject")
  @Authenticated
  @Description("Adds a project to the database")
  public ProjectGraphQLDto addProject(String projectUrl, String projectName) {
    logger.atInfo().log("Adding project %s with url %s", projectName, projectUrl);
    if (!projectRepository.existsByProjectUrl(projectUrl)) {
      logger.atInfo().log("Project does not exist yet, creating it");
      RemoteProject project = new RemoteProject(projectUrl, projectName);
      return mapToDto(projectRepository.save(project));
    } else {
      logger.atInfo().log("Project %s already exists", projectName);
      throw new RuntimeException("Project already exists");
    }
  }

  @Mutation("deleteProject")
  @Authenticated
  @Description("Deletes a project from the database")
  public List<ProjectGraphQLDto> removeProjectByName(String projectName) {
    List<RemoteProject> projects = projectRepository.findByProjectName(projectName);
    projectRepository.deleteByProjectName(projectName);
    return projects.stream().map(this::mapToDto).toList();
  }

  @Query("login")
  @Authenticated
  @Description("Logins the user")
  public String login(@DefaultValue("defaultValue") String notNeeded) {
    return "login successful";
  }

  private ProjectGraphQLDto mapToDto(RemoteProject project) {
    return new ProjectGraphQLDto(project);
  }
}
