package io.github.martinwitt.laughing_train.mining;

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

  public AnalyzerRunGraphQlDto(AnalyzerRun dao) {

    projectName = dao.getProjectName();
    projectUrl = dao.getProjectUrl();
    analyzerName = dao.getAnalyzerName();
    status = dao.getStatus().name();
    numberOfIssues = dao.getNumberOfIssues();
    commitHash = dao.getCommitHash();
    localDateTime = dao.getLocalDateTime().toString();
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
