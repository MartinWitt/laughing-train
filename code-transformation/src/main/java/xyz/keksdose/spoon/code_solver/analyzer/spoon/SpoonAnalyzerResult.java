package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import io.github.martinwitt.laughing_train.domain.value.Position;
import io.github.martinwitt.laughing_train.domain.value.RuleId;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.cu.SourcePositionHolder;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;

public record SpoonAnalyzerResult(
    RuleId ruleID,
    String filePath,
    Position position,
    String message,
    String messageMarkdown,
    String snippet)
    implements AnalyzerResult {

  @Override
  public String getAnalyzer() {
    return "Spoon";
  }

  public static SpoonAnalyzerResult createResult(
      String ruleName,
      CtType<?> topLevelType,
      String message,
      String messageMarkdown,
      CtElement element,
      String sourceRoot) {
    String snippet = tryGetOriginalSourceCode(element).orElse("");
    Position position = toPosition(element.getPosition());
    String filePath = getRelativeFilePath(topLevelType, sourceRoot).orElse("");
    RuleId ruleId = new RuleId(ruleName);
    return new SpoonAnalyzerResult(ruleId, filePath, position, message, messageMarkdown, snippet);
  }

  private static Optional<String> tryGetOriginalSourceCode(SourcePositionHolder element) {
    try {
      File file = element.getPosition().getCompilationUnit().getFile();
      String sourceCode = Files.readString(file.toPath());
      int lineNumber = element.getPosition().getLine();

      // Split the source code into lines
      String[] lines = sourceCode.split("\\r?\\n");

      // Extract the two lines before and after the given line number
      int startIndex = Math.max(0, lineNumber - 3);
      int endIndex = Math.min(lines.length - 1, lineNumber + 2);
      String context = String.join("\n", Arrays.copyOfRange(lines, startIndex, endIndex + 1));

      return Optional.of(context);
    } catch (Throwable e) {
      return Optional.empty();
    }
  }

  private static Optional<String> getRelativeFilePath(
      SourcePositionHolder positionHolder, String rootPath) {
    try {
      File file = positionHolder.getPosition().getFile();
      Path filePath = Paths.get(file.getAbsolutePath());
      Path rootPathObj = Paths.get(rootPath);
      // Get the relative path of the file relative to the root path
      Path relativePath = rootPathObj.relativize(filePath);
      return Optional.of(relativePath.toString());
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  private static Position toPosition(SourcePosition position) {
    int sourceStart = position.getSourceStart();
    int sourceEnd = position.getSourceEnd();
    int line = position.getLine();
    int column = position.getColumn();
    int endColumn = position.getEndColumn();
    int endLine = position.getEndLine();
    return new Position(line, endLine, column, endColumn, sourceStart, sourceEnd - sourceStart);
  }
}
