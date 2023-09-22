package xyz.keksdose.spoon.code_solver.diffs;

import xyz.keksdose.spoon.code_solver.history.Change;

/**
 * Interface for cleaning a change. This is used to remove unnecessary changes from the diff. For
 * example if a change is only a whitespace change, it can be removed.
 */
public interface GitDiffCleaner {
  /**
   * Cleans the content of a change according to the given change.
   *
   * @param content the complete file content
   * @param gitLineChange the line change
   * @param change the change
   * @return the cleaned content
   */
  String clean(String content, GitLineChange gitLineChange, Change change, String lineEnding);
}
