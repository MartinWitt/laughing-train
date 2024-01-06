package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class GitHubCommitDao extends PanacheEntity {

  @ManyToOne private ProjectDao projectDao;
  private String commitHash;

  public GitHubCommitDao() {
    // for JPA
  }

  public ProjectDao getProjectDao() {
    return projectDao;
  }

  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
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
