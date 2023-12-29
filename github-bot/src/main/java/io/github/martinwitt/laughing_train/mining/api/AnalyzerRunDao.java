package io.github.martinwitt.laughing_train.mining.api;

import io.github.martinwitt.laughing_train.persistence.dao.ProjectDao;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class AnalyzerRunDao extends PanacheEntity {

  public String analyzerName;
  public String status;
  public int numberOfIssues;
  public String commitHash;
  public LocalDateTime localDateTime;


  @ManyToOne(fetch = FetchType.EAGER) public ProjectDao projectDao;

  public AnalyzerRunDao() {
    // for JPA
  }
}
