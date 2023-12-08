package io.github.martinwitt.laughing_train.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class AnalyzerRunDao extends PanacheEntity {

  public String analyzerName;
  public String status;
  public int numberOfIssues;
  public String commitHash;
  public LocalDateTime localDateTime;
  @ManyToOne public ProjectDao projectDao;

  public AnalyzerRunDao() {
    // for JPA
  }
}
