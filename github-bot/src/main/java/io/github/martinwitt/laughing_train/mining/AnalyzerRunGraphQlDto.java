package io.github.martinwitt.laughing_train.mining;

import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunDao;
import org.eclipse.microprofile.graphql.Name;

@Name("AnalyzerRun")
public class AnalyzerRunGraphQlDto {

  private final String projectName;
  private final String projectUrl;
  private final String analyzerName;
  private final String status;
  private final int numberOfIssues;
  private final String commitHash;

  @Name("timestamp")
  private final String localDateTime;

  public AnalyzerRunGraphQlDto(AnalyzerRunDao dao) {
    projectName = dao.projectDao.getProjectName();
    projectUrl = dao.projectDao.getProjectUrl();
    analyzerName = dao.analyzerName;
    status = dao.status;
    numberOfIssues = dao.numberOfIssues;
    commitHash = dao.commitHash;
    localDateTime = dao.localDateTime.toString();
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

  public String getLocalDateTime() {
    return localDateTime;
  }
}
