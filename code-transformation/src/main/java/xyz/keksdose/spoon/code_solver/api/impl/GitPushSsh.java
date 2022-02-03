
package xyz.keksdose.spoon.code_solver.api.impl;
import java.util.stream.Collectors;
import java.io.IOException;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.config.ConfigStore;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.util.FS;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import org.eclipse.jgit.transport.sshd.SshdSessionFactory;
import java.util.Objects;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import java.io.File;
import org.eclipse.jgit.transport.sshd.SshdSessionFactoryBuilder;
import xyz.keksdose.spoon.code_solver.api.AfterRefactorStep;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import com.google.common.flogger.FluentLogger;
import org.eclipse.jgit.api.errors.GitAPIException;

/**
 * This class adds a new commit to the git repository adding all changes in the repo.
 * Afterwards the commit is pushed to the remote repository using ssh.
 */
public class GitPushSsh implements AfterRefactorStep {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	private final String repoUrl;
	public GitPushSsh(String repoUrl) {
		this.repoUrl = repoUrl;
	}

	private static void setUpSshSession() {
		File sshDir = new File(FS.DETECTED.userHome(), "/.ssh");
		SshdSessionFactory sshSessionFactory = new SshdSessionFactoryBuilder().setPreferredAuthentications("publickey")
				.setHomeDirectory(FS.DETECTED.userHome())
				.setSshDirectory(sshDir)
				.build(null);
		SshSessionFactory.setInstance(sshSessionFactory);
	}

	private static String getFixedIssues(Changelog changelog) {
		return changelog.getChanges()
				.stream()
				.map(Change::getBadSmell)
				.filter(Objects::nonNull)
				.map(BadSmell::getName)
				.map(MarkdownString::asText)
				.distinct()
				.collect(Collectors.joining("\n"));
	}

	protected void addFileToGit(File projectRoot, Git git, Changelog changes) throws GitAPIException {
		git.add().setUpdate(true).call();
	}

	protected String generateCommitMessage(Changelog changeLog) {
		return "refactor: \n " + getFixedIssues(changeLog);
	}

	@Override
	public void apply(Changelog changelog, File projectRoot) {
		ConfigStore config = new ConfigStore();
		try (Repository repository = Git.open(projectRoot).getRepository()) {
			Git git = new Git(repository);
			addFileToGit(projectRoot, git, changelog);
			git.commit()
					.setAuthor(config.getGitAuthor(), config.getGitEmail())
					.setMessage(generateCommitMessage(changelog))
					.call();
			setUpSshSession();
			git.push().setRemote(repoUrl).call();
			git.close();
		}
		catch (IOException | GitAPIException e) {
			logger.atSevere().withCause(e).log("Could not refactor repo");
		}
	}
}
