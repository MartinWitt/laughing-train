package xyz.keksdose.spoon.code_solver.history;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.diffs.DiffCleanModes;
import xyz.keksdose.spoon.code_solver.transformations.CodeIssue;

public class Change {

  private MarkdownString text;
  private String issue;
  private CtType<?> affectedType;
  private CodeIssue badsmell = CodeIssue.emptyRule();
  private AnalyzerResult analyzerResult;
  private List<DiffCleanModes> modes = List.of();

  public Change(String text, String issue, CtType<?> affectedType) {
    this.text = MarkdownString.fromRaw(text);
    this.issue = issue;
    this.affectedType = getMostOuterType(affectedType);
  }

  public Change(CodeIssue codeIssue, MarkdownString text, CtType<?> affectedType) {
    this.text = text;
    this.issue = codeIssue.getName().asText();
    this.badsmell = codeIssue;
    this.affectedType = getMostOuterType(affectedType);
  }

  public Change(
      CodeIssue codeIssue,
      MarkdownString text,
      CtType<?> affectedType,
      AnalyzerResult analyzerResult) {
    this(codeIssue, text, affectedType);
    this.analyzerResult = analyzerResult;
  }

  public Change(
      CodeIssue codeIssue,
      MarkdownString text,
      CtType<?> affectedType,
      AnalyzerResult analyzerResult,
      List<DiffCleanModes> modes) {
    this(codeIssue, text, affectedType);
    this.analyzerResult = analyzerResult;
    this.modes = modes;
  }

  /**
   * @return the modes
   */
  public List<DiffCleanModes> getModes() {
    return modes;
  }

  public MarkdownString getChangeText() {
    return text;
  }

  /**
   * @return the affectedType
   */
  public CtType<?> getAffectedType() {
    return affectedType;
  }

  public String getIssue() {
    return issue;
  }

  public CodeIssue getBadSmell() {
    return badsmell;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */

  @Override
  public int hashCode() {
    return Objects.hash(affectedType, badsmell, issue, text);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Change)) {
      return false;
    }
    Change other = (Change) obj;
    return Objects.equals(affectedType, other.affectedType)
        && Objects.equals(badsmell, other.badsmell)
        && Objects.equals(issue, other.issue)
        && Objects.equals(text, other.text);
  }

  /**
   * @return the analyzerResult
   */
  public @Nullable AnalyzerResult getAnalyzerResult() {
    return analyzerResult;
  }

  private CtType<?> getMostOuterType(CtType<?> inner) {
    if (inner.getDeclaringType() == null) {
      return inner;
    } else {
      return getMostOuterType(inner.getDeclaringType());
    }
  }
}
