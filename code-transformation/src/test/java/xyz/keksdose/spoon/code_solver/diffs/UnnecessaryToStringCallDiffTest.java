package xyz.keksdose.spoon.code_solver.diffs;

import io.github.martinwitt.laughing_train.domain.value.Position;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.UnaryOperator;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.UnusedLabel;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;

public class UnnecessaryToStringCallDiffTest {

  @Test
  void WhiteSpaceAfterToString() throws IllegalStateException, IOException, GitAPIException {
    UnaryOperator<String> removeToString = s -> s.replace(".toString()", "");
    Path path = Path.of("src/test/resources/projects/diffs/WhiteSpaceAfterToString.java");
    Git git = DiffTestHelper.createTempGitRepo(path, removeToString);
    TestAnalyzerResult result =
        new TestAnalyzerResult(
            "UnnecessaryToStringCall",
            "WhiteSpaceAfterToString.java",
            new Position(8, 0, 0, 0, 0, 0),
            "unnecessary toString call");
    Change change =
        new Change(
            new UnusedLabel(null).getHandledBadSmells().get(0),
            null,
            getFirstType(git.getRepository().getWorkTree().toPath()),
            result,
            List.of(DiffCleanModes.NO_WHITESPACE_ADD));
    new DiffCleaner().clean(git.getRepository().getWorkTree().toPath(), change);
  }

  private CtType<?> getFirstType(Path path) {
    Launcher launcher = new Launcher();
    launcher.addInputResource(path.toString());
    launcher.buildModel();
    CtModel model = launcher.getModel();
    return model.getAllTypes().iterator().next();
  }
}
