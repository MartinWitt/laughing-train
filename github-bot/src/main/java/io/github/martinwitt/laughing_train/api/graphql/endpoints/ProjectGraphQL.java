package io.github.martinwitt.laughing_train.api.graphql.endpoints;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectConfigGraphQLDtoInput;
import io.github.martinwitt.laughing_train.api.graphql.dto.ProjectGraphQLDto;
import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.ProjectConfig;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import io.github.martinwitt.laughing_train.mining.AnalyzerRunGraphQlDto;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.github.martinwitt.laughing_train.persistence.repository.ProjectRepository;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.*;

import java.util.List;

@GraphQLApi
public class ProjectGraphQL {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Inject ProjectRepository projectRepository;

  @Inject AnalyzerRunRepository sqlAnalyzerRunRepository;

  @Query("getProjects")
  @Description("Gets all projects from the database")
  public List<ProjectGraphQLDto> getAllProjects() {
    return projectRepository.getAll().stream().map(this::mapToDto).toList();
  }

  @Query("recentAnalyzerRuns")
  @Description("Returns a sorted by date list of recent analyzer runs")
  public List<AnalyzerRunGraphQlDto> recentAnalyzerRuns(int size) {
    return sqlAnalyzerRunRepository.findRecent(size).stream()
        .map(AnalyzerRunGraphQlDto::new)
        .toList();
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
        .map(RemoteProject::getCommitHashes)
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
      return mapToDto(projectRepository.create(project));
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

  private ProjectConfig createConfigFromInput(ProjectConfigGraphQLDtoInput projectConfig) {
    var config = ProjectConfig.ofProjectUrl(projectConfig.getProjectUrl());
    config.setSourceFolder(config.getSourceFolder());
    return config;
  }

  private ProjectGraphQLDto mapToDto(RemoteProject project) {
    return new ProjectGraphQLDto(project);
  }
}
