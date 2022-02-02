
package xyz.keksdose.spoon.code_solver.github;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.flogger.FluentLogger;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.AbortedByHookException;
import org.eclipse.jgit.api.errors.ConcurrentRefUpdateException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.ServiceUnavailableException;
import org.eclipse.jgit.api.errors.UnmergedPathsException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.transport.sshd.SshdSessionFactory;
import org.eclipse.jgit.transport.sshd.SshdSessionFactoryBuilder;
import org.eclipse.jgit.util.FS;

import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.config.ConfigStore;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class PullRequest {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	public static void refactorRepoQodana(String repoName, String repoUrl, String gitHubRepoName,
			String sourceDirectory) {
		try {
			ConfigStore config = new ConfigStore();
			File tempRepoFolder = Files.createTempDirectory(repoName).toFile();
			Git.cloneRepository().setURI(repoUrl).setDirectory(tempRepoFolder).call();
			try (Repository repository = Git.open(tempRepoFolder).checkout().getRepository()) {
				Git git = new Git(repository);
				switchToCleanBranch(config, git);
				ChangeListener changeListener = new ChangeListener();
				Function<ChangeListener, TransformationProcessor<?>> qodanaRefactorFunction = setUpQodana(
					sourceDirectory, tempRepoFolder, changeListener);
				Changelog changelog = refactorFolderWithQodana(tempRepoFolder, changeListener, qodanaRefactorFunction);
				Optional<Change> change = getAnyChange(changelog);
				if (change.isPresent()) {
					addFileToGit(tempRepoFolder, git, change.get());
					createCommit(config, git, changelog);
					printChangeLogMarkDown(config, changelog);
					setUpSshSession();
					git.push().setRemote(gitHubRepoName).call();
				}
				git.close();
			}
			catch (IOException | GitAPIException e) {
				logger.atSevere().withCause(e).log("Could not refactor repo");
			}
		}
		catch (IOException | GitAPIException e) {
			logger.atSevere().withCause(e).log("Could not create temp directory");
		}

	}

	private static void setUpSshSession() {
		File sshDir = new File(FS.DETECTED.userHome(), "/.ssh");
		SshdSessionFactory sshSessionFactory = new SshdSessionFactoryBuilder().setPreferredAuthentications("publickey")
				.setHomeDirectory(FS.DETECTED.userHome())
				.setSshDirectory(sshDir)
				.build(null);
		SshSessionFactory.setInstance(sshSessionFactory);
	}

	private static void printChangeLogMarkDown(ConfigStore config, Changelog changelog) {
		if (config.getPrintMarkdown()) {
			createMarkdown(changelog, Path.of(config.getMarkdownChangeLogFile()));
		}
	}

	private static void createCommit(ConfigStore config, Git git, Changelog changelog)
			throws GitAPIException, AbortedByHookException, ConcurrentRefUpdateException, NoHeadException,
			NoMessageException, ServiceUnavailableException, UnmergedPathsException, WrongRepositoryStateException {
		git.commit()
				.setAuthor(config.getGitAuthor(), config.getGitEmail())
				.setMessage("refactor: \n " + getFixedIssues(changelog))
				.call();
	}

	private static void addFileToGit(File tempRepoFolder, Git git, Change change) throws IOException, GitAPIException {
		File changedFile = change.getAffectedType().getPosition().getFile();
		Path changedFilePath = Files.find(tempRepoFolder.toPath(), Integer.MAX_VALUE,
			(path, attributes) -> path.getName(path.getNameCount() - 1).toString().equals(changedFile.getName()),
			FileVisitOption.FOLLOW_LINKS).findFirst().get();
		String changedFileName = tempRepoFolder.toPath().relativize(changedFilePath).toString().replace("\\", "/");
		git.add().addFilepattern(changedFileName).call();
	}

	private static Optional<Change> getAnyChange(Changelog changelog) {
		return changelog.getChanges().stream().findAny();
	}

	private static Changelog refactorFolderWithQodana(File tempRepoFolder, ChangeListener changeListener,
			Function<ChangeListener, TransformationProcessor<?>> qodanaRefactorFunction) {
		TransformationEngine transformationEngine = new TransformationEngine(List.of(qodanaRefactorFunction));
		transformationEngine.setChangeListener(changeListener);
		return transformationEngine.applyToGivenPath(tempRepoFolder.getAbsolutePath());
	}

	private static Function<ChangeListener, TransformationProcessor<?>> setUpQodana(String sourceDirectory,
			File tempRepoFolder, ChangeListener changeListener) {
		QodanaRefactor qodanaRefactor = new QodanaRefactor.Builder(changeListener).withMethodMayBeStatic().build();
		qodanaRefactor.run(tempRepoFolder.getAbsoluteFile().toPath(), sourceDirectory);
		return listener -> qodanaRefactor;
	}

	private static void switchToCleanBranch(ConfigStore config, Git git) throws GitAPIException {
		git.checkout().setName(config.getGitDefaultBranchName()).call();
		git.checkout()
				.setForced(true)
				.setCreateBranch(true)
				.setName(config.getGitBranchPrefix() + LocalDateTime.now().getNano())
				.call();
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

	private static void createMarkdown(Changelog changelog, Path path) {
		Map<String, List<Change>> changesByType = changelog.getChanges()
				.stream()
				.collect(Collectors.groupingBy(Change::getIssue));
		StringBuilder sb = new StringBuilder();
		sb.append("# Change Log\n");
		appendBadSmells(changelog, sb);
		sb.append("## The following has changed in the code:\n");
		appendChanges(changesByType, sb);
		try {
			Files.writeString(path, sb);
		}
		catch (IOException e) {
			logger.atSevere().withCause(e).log("Could not write markdown changelog" + path);
		}
	}

	private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
		for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
			sb.append("### " + entry.getKey() + "\n");
			sb.append(entry.getValue()
					.stream()
					.map(c -> "- " + c.getChangeText().asMarkdown())
					.collect(Collectors.joining("\n")));
			sb.append("\n");
		}
	}

	private static void appendBadSmells(Changelog changelog, StringBuilder sb) {
		sb.append("The following bad smells are refactored:\n");
		List<BadSmell> badSmells = changelog.getChanges()
				.stream()
				.map(Change::getBadSmell)
				.filter(v -> !v.isEmptyRule())
				.distinct()
				.sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
				.collect(Collectors.toList());
		for (BadSmell badSmell : badSmells) {
			sb.append("## " + badSmell.getName().asText() + "\n");
			sb.append(badSmell.getDescription().asMarkdown() + "\n");
			for (Link link : badSmell.getLinks()) {
				sb.append("- " + link + "\n");
			}

		}
		sb.append("\n");
	}

	private static String getRelevantChangeLog(String name, Changelog log) {
		StringBuilder sb = new StringBuilder();
		sb.append("The following has changed in the code:\n");
		for (Change change : log.getChanges()) {
			if (change.getAffectedType().getSimpleName().equals(name)) {
				sb.append(change.getChangeText().asText() + "\n");
			}
		}
		return sb.toString();
	}
}
