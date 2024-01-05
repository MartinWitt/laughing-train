package io.github.martinwitt.laughing_train.mining.api;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class AnalyzerRunDao extends PanacheEntity {

  public String projectName;
  public String projectUrl;
  public String analyzerName;
  public String status;
  public int numberOfIssues;
  public String commitHash;
  public LocalDateTime localDateTime;

  public AnalyzerRunDao() {
    // for JPA
  }
}
