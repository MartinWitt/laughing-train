package io.github.martinwitt.laughing_train.mining.api;

import io.github.martinwitt.laughing_train.mining.AnalyzerRun;
import java.util.List;

public interface AnalyzerRunRepository {
  List<AnalyzerRun> findRecent(int limit);

  void save(AnalyzerRun analyzerRun);
}
