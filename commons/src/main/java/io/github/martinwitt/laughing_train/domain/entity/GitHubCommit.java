package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;

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
}
