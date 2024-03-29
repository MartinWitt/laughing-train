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

  /**
   * Adds a GitHub commit to the list of commits in the RemoteProject. If the commit is already in
   * the list, it is not added.
   *
   * @param commit the GitHub commit to add.
   */
  public void addCommitHash(GitHubCommit commit) {
    if (commits.contains(commit)) {
      return;
    }
    commits.add(commit);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    RemoteProject that = (RemoteProject) obj;
    return Objects.equals(projectName, that.projectName)
        && Objects.equals(projectUrl, that.projectUrl)
        && Objects.equals(commits, that.commits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, projectUrl, commits);
  }

  public RemoteProject withProjectUrl(String projectUrl) {
    return new RemoteProject(projectName, projectUrl);
  }

  @Override
  public String toString() {
    return "RemoteProject{"
        + "projectName='"
        + projectName
        + '\''
        + ", projectUrl='"
        + projectUrl
        + '\''
        + ", commits="
        + commits
        + '}';
  }
}
