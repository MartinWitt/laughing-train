package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class AnalyzerRunDao extends PanacheEntity {

  public String analyzerName;
  public String status;
  public int numberOfIssues;
  public String commitHash;
  public LocalDateTime localDateTime;

  public AnalyzerRunDao() {
    // for JPA
  }

  private AnalyzerRunDao(
      String analyzerName,
      String status,
      int numberOfIssues,
      String commitHash,
      LocalDateTime localDateTime) {
    this.analyzerName = analyzerName;
    this.status = status;
    this.numberOfIssues = numberOfIssues;
    this.commitHash = commitHash;
    this.localDateTime = localDateTime;
  }

  @Override
  public String toString() {
    return "AnalyzerRunDao{analyzerName='%s', status='%s', numberOfIssues=%d, commitHash='%s', localDateTime=%s}"
        .formatted(analyzerName, status, numberOfIssues, commitHash, localDateTime);
  }
}
