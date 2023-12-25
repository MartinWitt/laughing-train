package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoteProject implements Serializable {

  private final String projectName;
  private final String projectUrl;
  private final List<GitHubCommit> commits;

  public RemoteProject(String projectName, String projectUrl) {
    this.projectName = Objects.requireNonNull(projectName);
    this.projectUrl = Objects.requireNonNull(projectUrl);
    commits = new ArrayList<>();
  }

  /**
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * @return the projectUrl
   */
  public String getProjectUrl() {
    return projectUrl;
  }

  /**
   * @return the commits
   */
  public List<GitHubCommit> getCommits() {
    return commits;
  }

  public void addCommitHash(GitHubCommit commit) {
    commits.add(commit);
  }

  /**
   * (non-Javadoc)
   *
   * @see Object#hashCode()
   */
  @Override
  public int hashCode() {
    return Objects.hash(projectName, projectUrl);
  }

  /**
   * (non-Javadoc)
   *
   * @see Object#equals(Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof RemoteProject project) {
      return Objects.equals(projectName, project.projectName)
          && Objects.equals(projectUrl, project.projectUrl);
    }
    return false;
  }

  public RemoteProject withProjectUrl(String projectUrl) {
    return new RemoteProject(projectName, projectUrl);
  }
}
