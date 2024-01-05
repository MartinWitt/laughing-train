package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class GitHubCommitDao extends PanacheEntity {

  private String commitHash;

  public GitHubCommitDao() {
    // for JPA
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
