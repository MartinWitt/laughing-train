package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.SpoonAnalyzer;
import java.nio.file.Path;
import java.util.List;

public class SpoonBasedAnalyzer {

  public List<AnalyzerResult> analyze(Path sourceRoot) {
    SpoonAnalyzer analyzer = new SpoonAnalyzer();
    AnalyzerResultVisitor analyzerResultVisitor = new AnalyzerResultVisitor(sourceRoot);
    List<BadSmell> analyze = analyzer.analyze(sourceRoot.toAbsolutePath().toString());
    return analyze.stream()
        .map(analyzerResultVisitor::toAnalyzerResult)
        .filter(v -> v.isPresent())
        .map(v -> v.get())
        .toList();
  }
}
