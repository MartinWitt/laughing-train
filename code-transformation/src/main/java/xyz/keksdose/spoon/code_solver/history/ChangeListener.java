package xyz.keksdose.spoon.code_solver.history;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.util.HashSet;
import java.util.Set;
import spoon.reflect.declaration.CtType;

public class ChangeListener {

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private boolean changed;
  private Set<CtType<?>> changedTypes = new HashSet<>();
  private Changelog changelog = new Changelog();

  public boolean isChanged() {
    return changed;
  }

  public void reset() {
    changed = false;
  }

  public void setChanged(CtType<?> changedType, Change change) {
    logger.atInfo().log("Type %s changed", changedType.getQualifiedName());
    changed = true;
    changedTypes.add(changedType);
    changelog.addChange(change);
  }

  public boolean isChanged(CtType<?> type) {
    return changedTypes.contains(type);
  }

  /**
   * Checks if the result is already fixed in the changelog.
   *
   * @param result the analyzer result to check
   * @return true iff the result is already fixed.
   */
  public boolean isFixed(AnalyzerResult result) {
    return changelog.getChanges().stream()
        .filter(v -> v.getAnalyzerResult() != null)
        .anyMatch(v -> v.getAnalyzerResult().equals(result));
  }

  /**
   * @return the changelog
   */
  public Changelog getChangelog() {
    return changelog;
  }
}
