
package xyz.keksdose.spoon.code_solver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.google.common.flogger.FluentLogger;

import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.printing.NoOpPrinter;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class Experimentation {
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	@Tag("Mining")
	@Test
	public void mine() {
		mineRepo("sorald", "https://github.com/SpoonLabs/sorald");
		mineRepo("spoon", "https://github.com/INRIA/spoon");
		mineRepo("assertJ", "https://github.com/assertj/assertj-core");
		// mineRepo("rxJava", "https://github.com/ReactiveX/RxJava"); heap space problem

	}

	private void mineRepo(String repoName, String path) {
		logger.atInfo().log("Mining %s", repoName);
		try {
			File file = Files.createTempDirectory(repoName, new FileAttribute[0]).toFile();
			file.mkdir();
			Git.cloneRepository().setURI(path).setDirectory(file).call();
			var transformationEngine = new TransformationEngine();
			var changes = transformationEngine.setPrinting(new NoOpPrinter())
					.applyToGivenPath(Path.of(file.getAbsolutePath(), "/src/main/java").toString());
			File output = new File("../mining/" + repoName + ".md");
			createMarkdown(changes, output.toPath());
			// FileUtils.deleteDirectory(file);
			logger.atInfo().log("Finished mining %s", repoName);
		}
		catch (Throwable e) {
			logger.atSevere().withCause(e).log("Could not mine repo %s" + repoName);
		}
	}

	private static void createMarkdown(Changelog changelog, Path path) {
		Map<String, List<Change>> changesByType = changelog.getChanges()
				.stream()
				.collect(Collectors.groupingBy(Change::getIssue));
		StringBuilder sb = new StringBuilder();
		sb.append("# Change Log\n");
		// appendBadSmells(changelog, sb);
		sb.append("## The following bad smells are found in the code:\n");
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
					.map(c -> "- " + c.getChangeText().asMarkdown() + "in `" + c.getAffectedType().getQualifiedName()
							+ "`")
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
}
