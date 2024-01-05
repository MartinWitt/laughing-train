package io.github.martinwitt.laughing_train.mining.impl;

import io.github.martinwitt.laughing_train.mining.AnalyzerRun;
import io.github.martinwitt.laughing_train.mining.AnalyzerRunConverter;
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

  private static final AnalyzerRunConverter ANALYZER_RUN_CONVERTER = new AnalyzerRunConverter();

  @Override
  public List<AnalyzerRun> findRecent(int limit) {
    return find("ORDER BY localDateTime DESC").page(0, limit).stream()
        .map(ANALYZER_RUN_CONVERTER::convertToEntity)
        .toList();
  }

  @Override
  public void save(AnalyzerRun analyzerRun) {
    persist(ANALYZER_RUN_CONVERTER.convertToDao(analyzerRun));
  }
}
