package io.github.martinwitt.laughing_train.api.graphql.dto;

import io.github.martinwitt.laughing_train.domain.entity.GitHubCommit;
import io.github.martinwitt.laughing_train.domain.entity.RemoteProject;
import java.util.List;
import org.eclipse.microprofile.graphql.Name;

@Name("Project")
public class ProjectGraphQLDto {

  private String projectName;
  private String projectUrl;
  private List<GitHubCommit> commits;

  @SuppressWarnings("NullAway")
  public ProjectGraphQLDto() {}

  public ProjectGraphQLDto(RemoteProject project) {
    this.projectName = project.getProjectName();
    this.projectUrl = project.getProjectUrl();
    this.commits = project.getCommits();
  }

  public String getProjectName() {
    return this.projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectUrl() {
    return this.projectUrl;
  }

  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }

  /**
   * @return the commits
   */
  public List<GitHubCommit> getCommits() {
    return commits;
  }

  /**
   * @param commits the commits to set
   */
  public void setCommits(List<GitHubCommit> commits) {
    this.commits = commits;
  }
}
