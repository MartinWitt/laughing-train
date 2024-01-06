package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProjectDao extends PanacheEntity {

  private String projectName;
  private String projectUrl;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<GitHubCommitDao> commits = new ArrayList<>();

  public ProjectDao() {

    // for JPA
  }

  /**
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * @param projectName the projectName to set
   */
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   * @return the projectUrl
   */
  public String getProjectUrl() {
    return projectUrl;
  }

  /**
   * @param projectUrl the projectUrl to set
   */
  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }

  /**
   * @return the commits
   */
  public List<GitHubCommitDao> getCommits() {
    return commits;
  }

  /**
   * @param commits the commits to set
   */
  public void setCommits(List<GitHubCommitDao> commits) {
    commits.forEach(it -> it.setProjectDao(this));
    this.commits = commits;
  }
}
