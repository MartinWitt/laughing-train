package io.github.martinwitt.laughing_train.mining;

import java.time.LocalDateTime;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    AnalyzerRun that = (AnalyzerRun) o;

    if (numberOfIssues != that.numberOfIssues) {
      return false;
    }
    if (!Objects.equals(projectName, that.projectName)) {
      return false;
    }
    if (!Objects.equals(projectUrl, that.projectUrl)) {
      return false;
    }
    if (!Objects.equals(analyzerName, that.analyzerName)) {
      return false;
    }
    if (status != that.status) {
      return false;
    }
    if (!Objects.equals(commitHash, that.commitHash)) {
      return false;
    }
    return Objects.equals(localDateTime, that.localDateTime);
  }

  @Override
  public int hashCode() {
    int result = projectName != null ? projectName.hashCode() : 0;
    result = 31 * result + (projectUrl != null ? projectUrl.hashCode() : 0);
    result = 31 * result + (analyzerName != null ? analyzerName.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + numberOfIssues;
    result = 31 * result + (commitHash != null ? commitHash.hashCode() : 0);
    result = 31 * result + (localDateTime != null ? localDateTime.hashCode() : 0);
    return result;
  }
}
