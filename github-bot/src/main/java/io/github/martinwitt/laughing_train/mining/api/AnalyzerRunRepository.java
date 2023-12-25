package io.github.martinwitt.laughing_train.mining.api;

import java.util.List;

public interface AnalyzerRunRepository {
  List<AnalyzerRunDao> findRecent(int limit);
}
