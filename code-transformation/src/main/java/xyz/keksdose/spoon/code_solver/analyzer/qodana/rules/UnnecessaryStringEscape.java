package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.List;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.AbstractRefactoring;
import xyz.keksdose.spoon.code_solver.analyzer.PositionScanner;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class UnnecessaryStringEscape extends AbstractRefactoring {

  private static final BadSmell BAD_SMELL =
      new BadSmell() {

        @Override
        public MarkdownString getDescription() {
          String markdown =
              """
              Not all characters need to be escaped in a string literal. Unexpected escapes can be confusing and should be avoided.
              Example:
              ```java
              public String toString() {
              	return type.name() + ": \'" + token + "\'";
              }
              Here `\'` is an unnecessary escape. It can be replaced with `'`.
              ```
              """;
          return MarkdownString.fromMarkdown(markdown);
        }

        @Override
        public MarkdownString getName() {
          return MarkdownString.fromRaw("UnnecessaryStringEscape");
        }
      };

  public UnnecessaryStringEscape(AnalyzerResult result) {
    super(result);
  }

  @Override
  public void refactor(ChangeListener listener, CtType<?> type) {
    if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
      return;
    }
    char slash = (char) 92;
    String escaped = slash + result.message().split("`")[1];
    List<CtLiteral<String>> literals =
        filterMatches(PositionScanner.findLineOnly(type, result.position()));
    for (CtLiteral<String> literal : literals) {
      String value = literal.getValue();
      if (value.contains(result.message().split("`")[1]) && !listener.isFixed(result)) {
        String newValue = String.valueOf(value.toCharArray());
        literal.replace(literal.getFactory().createLiteral(new StringHolder(newValue)));
        String changeText = "Replaced `%s` with `%s`".formatted(escaped, newValue);
        Change change =
            new Change(BAD_SMELL, MarkdownString.fromMarkdown(changeText), type, result);
        listener.setChanged(type, change);
      }
    }
  }

  private <T> List<CtLiteral<T>> filterMatches(List<CtElement> matches) {
    return matches.stream().filter(CtLiteral.class::isInstance).map(v -> (CtLiteral<T>) v).toList();
  }

  @Override
  public List<BadSmell> getHandledBadSmells() {
    return List.of(BAD_SMELL);
  }

  private static final class StringHolder {
    private final String value;

    public StringHolder(String value) {
      this.value = "\"" + value + "\"";
    }

    @Override
    public String toString() {
      return value;
    }
  }
}
