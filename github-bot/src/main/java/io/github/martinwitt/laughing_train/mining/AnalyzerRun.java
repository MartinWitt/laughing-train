package io.github.martinwitt.laughing_train.mining;

import java.time.LocalDateTime;

public class AnalyzerRun {

  private final String projectName;
  private final String projectUrl;
  private final String analyzerName;
  private final RunStatus status;
  private final int numberOfIssues;
  private final String commitHash;
  private final LocalDateTime localDateTime;

  public AnalyzerRun(
      String projectName,
      String projectUrl,
      String analyzerName,
      String status,
      int numberOfIssues,
      String commitHash,
      LocalDateTime localDateTime) {
    this.projectName = projectName;
    this.projectUrl = projectUrl;
    this.analyzerName = analyzerName;
    this.status = convertStatus(status);
    this.numberOfIssues = numberOfIssues;
    this.commitHash = commitHash;
    this.localDateTime = localDateTime;
  }

  public String getAnalyzerName() {
    return analyzerName;
  }

  public RunStatus getStatus() {
    return status;
  }

  public int getNumberOfIssues() {
    return numberOfIssues;
  }

  public String getCommitHash() {
    return commitHash;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  private RunStatus convertStatus(String status) {
    if ("SUCCESS".equals(status)) {
      return RunStatus.SUCCESS;
    } else if ("FAILURE".equals(status)) {
      return RunStatus.FAILURE;
    } else {
      throw new IllegalArgumentException("Status must be either SUCCESS or FAILURE");
    }
  }

  public String getProjectUrl() {
    return projectUrl;
  }

  public String getProjectName() {
    return projectName;
  }

  public enum RunStatus {
    SUCCESS,
    FAILURE
  }
}
