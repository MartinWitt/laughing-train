package xyz.keksdose.spoon.code_solver.diffs;

import com.github.difflib.DiffUtils;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.ChangeDelta;
import com.github.difflib.patch.InsertDelta;
import com.github.difflib.patch.Patch;
import com.google.common.flogger.FluentLogger;
import com.google.errorprone.annotations.Var;
import java.util.stream.Collectors;
import xyz.keksdose.spoon.code_solver.history.Change;

public class ExtraWhiteSpaceCleaner implements GitDiffCleaner {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  @Override
  public String clean(
      @Var String content, GitLineChange gitLineChange, Change change, String lineEnding) {
    Patch<String> patch =
        DiffUtils.diffInline(gitLineChange.oldContent(), gitLineChange.newContent());
    for (AbstractDelta<String> delta : patch.getDeltas()) {
      logger.atInfo().log("Delta: %s", delta);
      if (delta instanceof ChangeDelta<String> changeDelta) {
        content =
            content
                .lines()
                .map(v -> changeIfMatches(changeDelta, v, gitLineChange))
                .collect(Collectors.joining(lineEnding));
      }
      if (delta instanceof InsertDelta<String> insertDelta) {
        content =
            content
                .lines()
                .map(v -> changeIfMatches(insertDelta, v, gitLineChange))
                .collect(Collectors.joining(lineEnding));
      }
    }
    return content;
  }

  private String changeIfMatches(
      ChangeDelta<String> delta, String content, GitLineChange gitLineChange) {
    if (!gitLineChange.newContent().equals(content)) {
      return content;
    }
    int position = delta.getTarget().getPosition();
    if (delta.getTarget().getLines().iterator().next().isBlank()) {
      return content.substring(0, position)
          + content.substring(position + delta.getTarget().getLines().get(0).length());
    }
    return content;
  }

  private String changeIfMatches(
      InsertDelta<String> delta, String content, GitLineChange gitLineChange) {
    if (!gitLineChange.newContent().equals(content)) {
      return content;
    }
    int position = delta.getTarget().getPosition();
    if (delta.getTarget().getLines().iterator().next().isBlank()) {
      return content.substring(0, position)
          + content.substring(position + delta.getTarget().getLines().get(0).length());
    }
    return content;
  }
}
