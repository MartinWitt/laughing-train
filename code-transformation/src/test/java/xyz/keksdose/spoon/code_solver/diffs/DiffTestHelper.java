package xyz.keksdose.spoon.code_solver.diffs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.AbortedByHookException;
import org.eclipse.jgit.api.errors.ConcurrentRefUpdateException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.ServiceUnavailableException;
import org.eclipse.jgit.api.errors.UnmergedPathsException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;

public class DiffTestHelper {

  static Git createTempGitRepo(Path file)
      throws IOException, IllegalStateException, GitAPIException {
    return createTempGitRepo(file, s -> s);
  }

  private static void addInitialFilesToRepo(Git git)
      throws GitAPIException,
          NoFilepatternException,
          AbortedByHookException,
          ConcurrentRefUpdateException,
          NoHeadException,
          NoMessageException,
          ServiceUnavailableException,
          UnmergedPathsException,
          WrongRepositoryStateException {
    git.add().addFilepattern(".").call();
    git.commit().setMessage("initial commit").setSign(false).call();
  }

  private static void replaceMetaWhitespace(Path result) throws IOException {
    Files.writeString(
        result,
        Files.readAllLines(result).stream()
            .map(line -> line.replace("/*WHITESPACE*/", ""))
            .collect(Collectors.joining(System.lineSeparator())));
  }

  public static Git createTempGitRepo(Path file, UnaryOperator<String> removeToString)
      throws IOException, IllegalStateException, GitAPIException {
    Path gitFolder = Files.createTempDirectory(file.getFileName().toString());
    Path newLocation = Path.of(gitFolder.toString(), file.getFileName().toString());
    Path result = Files.copy(file, newLocation);
    Git git = Git.init().setDirectory(gitFolder.toFile()).call();
    String oldContent = Files.readString(result);
    replaceMetaWhitespace(result);
    addInitialFilesToRepo(git);
    Files.writeString(result, removeToString.apply(oldContent.replace("/*WHITESPACE*/", " ")));
    return git;
  }
}
