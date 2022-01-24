
package xyz.keksdose.spoon.code_solver.rest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import com.google.common.flogger.FluentLogger;

import org.kohsuke.github.GHGist;
import org.kohsuke.github.GitHub;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spoon.Launcher;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.history.Changelog;

@RestController
public class Controller {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	private final class TransformationEngineExtension extends TransformationEngine {

		private String result = "";

		@GetMapping(value = "/refactor/{testClass}", produces = MediaType.TEXT_PLAIN_VALUE)
		@ResponseBody
		String refactorTests(@PathVariable String testClass) {
			Path file = null;
			try {
				logger.atInfo().log("Refactoring %s", testClass);
				GitHub github = GitHub.connectAnonymously();
				GHGist gist = github.getGist(testClass);
				String fileName = "Test" + UUID.randomUUID() + ".java";
				String content = gist.getFiles().entrySet().iterator().next().getValue().getContent();
				file = Files.createTempFile(fileName, ".java");
				Files.write(file, content.getBytes());
				if (content.length() > 10000) {
					return "Error";
				}
				TransformationEngineExtension engine = new TransformationEngineExtension();
				engine.setPrinting((listener, types) -> {
					result = new Launcher().getEnvironment().createPrettyPrinter().printTypes(types.iterator().next());
				});

				Changelog changelog = engine.applyToGivenPath(file.toString());
				return engine.result + "\n\n\n\n" + changelog.toString();
			}
			catch (Exception e) {
				logger.atSevere().withCause(e).log("Error");
			}
			if (file != null) {
				try {
					Files.delete(file);
				}
				catch (Exception e) {
					logger.atSevere().withCause(e).log("Error");
				}
			}
			return "There was an error processing your gist-ID";
		}
	}
}
