
package xyz.keksdose.spoon.code_solver.transformations;

import xyz.keksdose.spoon.code_solver.history.MarkdownString;

/**
 * This represent a bad smell that is detected by the spoon code solver.
 * It contains the name of the bad smell and the description of the bad smell.
 * A bad smell is a part of the source code, that has some problems.
 */
public abstract class BadSmell {

  private static final class EmptyBadSmell extends BadSmell {
    @Override
    public MarkdownString getDescription() {
      return MarkdownString.fromRaw("");
    }

    @Override
    public MarkdownString getName() {
      return MarkdownString.fromRaw("");
    }
  }

  /**
   * Returns the description of the bad smell. This description is encoded as {@link MarkdownString}.
   * For the formatted or not formatted description see {@link MarkdownString#asMarkdown()} and {@link MarkdownString#asText()}.
   * @return the description of the bad smell
   */
  public abstract MarkdownString getDescription();

  /**
   * Returns the name of the bad smell. This name is encoded as {@link MarkdownString}.
   * For the formatted or not formatted name see {@link MarkdownString#asMarkdown()} and {@link MarkdownString#asText()}.
   * A client can see this name as unique identifier of the bad smell.
   * @return the name of the bad smell
   */
  public abstract MarkdownString getName();

  /**
   * Returns an empty instance of BadSmell. This method exists to avoid null checks.
   * @return the empty bad smell
   */
  public static BadSmell emptyRule() {
    return new EmptyBadSmell();
  }

  /**
   * Checks if the BadSmell is an EmptyBadSmell instance. This method only exists for backwards reasons and should not be used.
   * @return  true if the BadSmell is an EmptyBadSmell instance, false otherwise.
   */
  public boolean isEmptyRule() {
    return this instanceof EmptyBadSmell;
  }
}
