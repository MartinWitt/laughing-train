package io.github.martinwitt.laughing_train.api.graphql.dto;

import io.github.martinwitt.laughing_train.persistence.dao.AnalyzerRunDao;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Name;

@Name("AnalyzerRun")
public class AnalyzerRunGraphQlDto {

  private String projectName;
  private String projectUrl;
  private String analyzerName;
  private String status;
  private int numberOfIssues;
  private String commitHash;
  private LocalDateTime localDateTime;

  public AnalyzerRunGraphQlDto(AnalyzerRunDao dao) {
    this.projectName = dao.projectDao.getProjectName();
    this.projectUrl = dao.projectDao.getProjectUrl();
    this.analyzerName = dao.analyzerName;
    this.status = dao.status;
    this.numberOfIssues = dao.numberOfIssues;
    this.commitHash = dao.commitHash;
    this.localDateTime = dao.localDateTime;
  }

  /**
   * @return the analyzerName
   */
  public String getAnalyzerName() {
    return analyzerName;
  }

  /**
   * @return the commitHash
   */
  public String getCommitHash() {
    return commitHash;
  }

  /**
   * @return the localDateTime
   */
  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  /**
   * @return the numberOfIssues
   */
  public int getNumberOfIssues() {
    return numberOfIssues;
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
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}