package xyz.keksdose.spoon.code_solver.api;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonRefactor;
import xyz.keksdose.spoon.code_solver.diffs.DiffCleaner;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

/**
 * This class is the entry point for the code transformation. It takes a repository and a list of
 * badsmells. It then applies the transformations to the repository and returns a changelog.
 */
public class CodeRefactoring {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private final List<
          BiFunction<ChangeListener, List<? extends AnalyzerResult>, TransformationProcessor<?>>>
      refactor = new ArrayList<>();

  public CodeRefactoring() {
    refactor.add((u, v) -> new QodanaRefactor(EnumSet.allOf(QodanaRules.class), u, v));
    refactor.add((u, v) -> new SpoonRefactor(u, v));
  }

  public Changelog refactorBadSmells(Path repository, List<? extends AnalyzerResult> results) {
    ChangeListener listener = new ChangeListener();
    logger.atInfo().log("Refactoring %s", repository);
    DiffCleaner diffCleaner = new DiffCleaner();
    List<Function<ChangeListener, TransformationProcessor<?>>> function = new ArrayList<>();
    for (BiFunction<ChangeListener, List<? extends AnalyzerResult>, TransformationProcessor<?>>
        refactorSupplier : refactor) {
      function.add(v -> refactorSupplier.apply(v, results));
    }
    TransformationEngine transformationEngine = new TransformationEngine(function);
    transformationEngine.setChangeListener(listener);
    Changelog log = transformationEngine.applyToGivenPath(repository.toString());
    log.getChanges().forEach(change -> diffCleaner.clean(repository, change));
    return log;
  }
}
