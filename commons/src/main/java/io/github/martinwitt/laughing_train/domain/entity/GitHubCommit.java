package io.github.martinwitt.laughing_train.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GitHubCommit implements Serializable {

  private String commitHash;
  private List<AnalyzerStatus> analyzerStatuses;

  public GitHubCommit() {
    analyzerStatuses = new ArrayList<>();
    // for JPA
  }

  /**
   * @param commitHash
   * @param analyzerStatuses
   */
  public GitHubCommit(String commitHash, List<AnalyzerStatus> analyzerStatuses) {
    this.commitHash = commitHash;
    this.analyzerStatuses = analyzerStatuses;
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

  /**
   * @return the analyzerStatuses
   */
  public List<AnalyzerStatus> getAnalyzerStatuses() {
    return analyzerStatuses;
  }

  /**
   * @param analyzerStatuses the analyzerStatuses to set
   */
  public void setAnalyzerStatuses(List<AnalyzerStatus> analyzerStatuses) {
    this.analyzerStatuses = analyzerStatuses;
  }

  public void addAnalyzerStatus(AnalyzerStatus analyzerStatus) {
    analyzerStatuses.stream()
        .filter(v -> v.getCommitHash().equals(analyzerStatus.getCommitHash()))
        .filter(v -> v.getAnalyzerName().equals(analyzerStatus.getAnalyzerName()))
        .findFirst()
        .ifPresentOrElse(
            v -> {
              analyzerStatuses.remove(v);
              analyzerStatuses.add(analyzerStatus);
            },
            () -> analyzerStatuses.add(analyzerStatus));
    if (analyzerStatuses.size() > 10) {
      analyzerStatuses.sort(Comparator.comparing(v -> LocalDateTime.parse(v.timestamp())));
      analyzerStatuses.removeFirst();
    }
  }
}
