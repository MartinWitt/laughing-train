package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.api.SpoonRules;

public class SpoonBasedAnalyzer {

  private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

  public List<? extends AnalyzerResult> analyze(Path sourceRoot) {
    List<SpoonAnalyzerResult> badSmells = new ArrayList<>();
    try (Stream<Path> walk = Files.walk(sourceRoot)) {
      List<Path> files = filterResourcePaths(walk.filter(Files::isDirectory).toList());
      SpoonAPI launcher = new Launcher();
      for (Path p : files) {
        launcher.addInputResource(p.toString());
      }
      launcher.getEnvironment().setAutoImports(true);
      launcher.getEnvironment().setIgnoreDuplicateDeclarations(true);
      launcher.getEnvironment().setNoClasspath(true);
      launcher.getEnvironment().setComplianceLevel(20);
      launcher.getEnvironment().setIgnoreSyntaxErrors(true);
      launcher.getEnvironment().setLevel("ERROR");
      CtModel model = launcher.buildModel();
      LOGGER.atInfo().log("Found %s types.", model.getAllTypes().size());
      for (CtType<?> type : model.getAllTypes()) {
        for (SpoonRules analyzer : SpoonRules.values()) {
          List<SpoonAnalyzerResult> badSmell =
              analyzer.getRefactoring().analyze(sourceRoot.toAbsolutePath().toString(), type);
          if (badSmell != null) {
            badSmells.addAll(badSmell);
          }
        }
      }
    } catch (Exception e) {
      LOGGER.atSevere().withCause(e).log("Error while analyzing.");
    }

    return badSmells;
  }

  /**
   * Filters input paths that contain resources or test files.
   *
   * @param paths the list of paths to filter
   * @return a new list of paths without resources or test files
   */
  private static List<Path> filterResourcePaths(List<? extends Path> paths) {
    return paths.stream()
        .filter(SpoonBasedAnalyzer::filterNonSourcePath)
        .collect(Collectors.toList());
  }

  private static boolean filterNonSourcePath(Path path) {
    return isSourceDirectory(path) || isTestDirectory(path);
  }

  private static boolean isSourceDirectory(Path path) {
    return path.endsWith("src" + File.separator + "main" + File.separator + "java");
  }

  private static boolean isTestDirectory(Path path) {
    return path.endsWith("src" + File.separator + "test" + File.separator + "java");
  }
}
