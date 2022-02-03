
package xyz.keksdose.spoon.code_solver.api.impl;

import java.io.File;
import java.nio.file.Path;

import com.google.common.flogger.FluentLogger;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import xyz.keksdose.spoon.code_solver.api.RepoCheckout;

/**
 * This is the implementation of the {@link RepoCheckout} interface.
 * With the given url and branch name, it will clone the repository and return the path to the checked out repo.
 */
public class GitCheckout implements RepoCheckout {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	private final String repoUrl;
	private final String branch;
	private final Path outputDirectory;

	public GitCheckout(String repoUrl, String branch, Path outputDirectory) {
		this.repoUrl = repoUrl;
		this.branch = branch;
		this.outputDirectory = outputDirectory;
	}

	@Override
	public File prepareRepo() {
		try {
			Git.cloneRepository().setBranch(branch).setURI(repoUrl).setDirectory(outputDirectory.toFile()).call();
			return outputDirectory.toFile();
		}
		catch (GitAPIException e) {
			logger.atSevere().withCause(e).log("Could not clone repo %s", repoUrl);
			throw new RuntimeException(e);
		}
	}
}
