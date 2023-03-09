package xyz.keksdose.spoon.code_solver.diffs;

import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import com.google.common.flogger.FluentLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.lib.AnyObjectId;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import xyz.keksdose.spoon.code_solver.history.Change;

/**
 * This class cleans the diff of a change. This means that the diff is cleaned from changes like whitespace changes.
 * Under the hood it uses the git diff command.
 */
public class DiffCleaner {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    /**
     * Cleans the diff of a change. This means that the diff is cleaned from changes like whitespace changes.
     * It requires the path to the repository and the change.
     * <b>Warning:</b> This method changes the git repository.
     * <p>
     * For each change the diff is cleaned according to the set modes.
     * @param path the path to the git repository
     * @param change the change
     */
    public void clean(Path path, Change change) {
        OutputStream out = new ByteArrayOutputStream();

        try (Git git = Git.open(path.toFile());
                ObjectReader reader = git.getRepository().newObjectReader();
                DiffFormatter df = new DiffFormatter(out); ) {
            CanonicalTreeParser oldTreeIter = new CanonicalTreeParser();
            oldTreeIter.reset(reader, getLastCommit(git));
            String shortPath = getRelativeRepoPath(change, git);
            Path filePath = path.resolve(shortPath);
            CanonicalTreeParser newTreeIter = new CanonicalTreeParser();
            var fakeCommit = createFakeCommit(git, shortPath);
            newTreeIter.reset(reader, fakeCommit);
            // finally get the list of changed files
            List<DiffEntry> diffs =
                    git.diff().setNewTree(newTreeIter).setOldTree(oldTreeIter).call();
            setDiffFormaterSettings(git, df);
            createDiffs(df, diffs);
            var list = out.toString().lines().toList();
            System.out.println(out.toString());
            PeekingIterator<String> it = Iterators.peekingIterator(list.iterator());
            while (it.hasNext()) {
                var line = it.next();
                if (line.startsWith("- ") && !line.startsWith("---")) {
                    var next = it.peek();
                    if (next.startsWith("+ ")) {
                        GitLineChange lineChange = new GitLineChange(
                                list.indexOf(next.substring(2)), line.substring(1), next.substring(1));
                        if (change.getModes().contains(DiffCleanModes.NO_WHITESPACE_ADD)) {
                            Files.writeString(
                                    filePath,
                                    new ExtraWhiteSpaceCleaner().clean(Files.readString(filePath), lineChange, change));
                        }
                        // call diffcleaner
                    }
                }
            }
            git.reset().setRef("HEAD~1").call();
            System.out.println(Files.readString(filePath));
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("could not clean because not a git repo");
        }
    }

    private void createDiffs(DiffFormatter df, List<DiffEntry> diffs) {
        diffs.forEach(v -> {
            try {
                df.format(v);
            } catch (IOException e) {
                logger.atSevere().withCause(e).log("could not format diff");
            }
        });
    }

    private void setDiffFormaterSettings(Git git, DiffFormatter df) {
        df.setContext(0);
        df.setRepository(git.getRepository());
    }

    private String getRelativeRepoPath(Change change, Git git) {
        return git.getRepository()
                .getWorkTree()
                .toPath()
                .relativize(change.getAffectedType()
                        .getPosition()
                        .getCompilationUnit()
                        .getFile()
                        .toPath())
                .toString();
    }

    private AnyObjectId getLastCommit(Git git) throws NoHeadException, GitAPIException {
        return git.log().setMaxCount(1).call().iterator().next().getTree().getId();
    }

    private RevTree createFakeCommit(Git git, String shortPath) throws NoFilepatternException, GitAPIException {
        git.add().addFilepattern(shortPath).call();
        return git.commit().setSign(false).setMessage("fake commit").call().getTree();
    }
}
