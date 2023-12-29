package io.github.martinwitt.laughing_train.mining.impl;

import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunDao;
import io.github.martinwitt.laughing_train.mining.api.AnalyzerRunRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class SqlAnalyzerRunRepository
    implements PanacheRepository<AnalyzerRunDao>, AnalyzerRunRepository {

  @Override
  public List<AnalyzerRunDao> findRecent(int limit) {
    return find("ORDER BY localDateTime DESC").page(0, limit).list();
  }
}
