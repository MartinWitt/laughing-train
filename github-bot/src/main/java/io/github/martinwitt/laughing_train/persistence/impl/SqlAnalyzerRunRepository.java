package io.github.martinwitt.laughing_train.persistence.impl;

import io.github.martinwitt.laughing_train.persistence.dao.AnalyzerRunDao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class SqlAnalyzerRunRepository implements PanacheRepository<AnalyzerRunDao> {

  public List<AnalyzerRunDao> findRecent(int limit) {
    return findAll(Sort.ascending("localDateTime")).page(0, limit).list();
  }
}
