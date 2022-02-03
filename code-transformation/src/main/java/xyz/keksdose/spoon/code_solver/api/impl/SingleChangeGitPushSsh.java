
package xyz.keksdose.spoon.code_solver.api.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.stream.Stream;

import com.google.common.flogger.FluentLogger;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.Changelog;

/**
 * 
 */
public class SingleChangeGitPushSsh extends GitPushSsh {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	private Change selectedChange;
	public SingleChangeGitPushSsh(String repoUrl) {
		super(repoUrl);
	}

	protected void addFileToGit(File projectRoot, Git git, Changelog changelog) throws GitAPIException {
		var changes = changelog.getChanges();
		Collections.shuffle(changes);
		Change change = changes.iterator().next();
		File changedFile = change.getAffectedType().getPosition().getFile();
		try (Stream<Path> changedFiles = Files.find(projectRoot.toPath(), Integer.MAX_VALUE,
			(path, attributes) -> path.getName(path.getNameCount() - 1).toString().equals(changedFile.getName()),
			FileVisitOption.FOLLOW_LINKS)) {
			Path changedFilePath = changedFiles.findFirst().get();
			String changedFileName = projectRoot.toPath().relativize(changedFilePath).toString().replace("\\", "/");
			git.add().addFilepattern(changedFileName).call();
		}
		catch (IOException e) {
			logger.atSevere().withCause(e).log("Could not find file %s", changedFile.getAbsolutePath());
		}
	}

	@Override
	protected String generateCommitMessage(Changelog changeLog) {
		return "refactor:\n" + selectedChange.getChangeText().asMarkdown();
	}

}
