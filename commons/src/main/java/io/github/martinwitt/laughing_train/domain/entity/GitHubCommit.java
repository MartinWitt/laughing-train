package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.util.Objects;

public class GitHubCommit implements Serializable {

  private String commitHash;

  public GitHubCommit() {
    // for JPA
  }

  public GitHubCommit(String commitHash) {
    this.commitHash = commitHash;
  }

  /**
   * @return the commitHash
   */
  public String getCommitHash() {
    return commitHash;
  }

  /**
   * @param commitHash the commitHash to set
   */
  public void setCommitHash(String commitHash) {
    this.commitHash = commitHash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GitHubCommit that = (GitHubCommit) o;
    return Objects.equals(commitHash, that.commitHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitHash);
  }

  @Override
  public String toString() {
    return "GitHubCommit{" + "commitHash='" + commitHash + '\'' + '}';
  }
}
