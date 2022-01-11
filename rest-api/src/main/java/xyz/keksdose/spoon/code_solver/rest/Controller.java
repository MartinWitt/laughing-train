
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

import spoon.processing.ProcessingManager;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.PrettyPrinter;
import xyz.keksdose.spoon.code_solver.RunMode;
import xyz.keksdose.spoon.code_solver.TransformationEngine;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Changelog;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertThatTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.TestAnnotation;

@RestController
public class Controller {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	private final class TransformationEngineExtension extends TransformationEngine {

		private String result = "";

		@Override
		protected void addProcessors(ProcessingManager pm, ChangeListener listener) {
			pm.addProcessor(new AssertThatTransformation(listener));
			pm.addProcessor(new Junit4AnnotationsTransformation(listener));
			pm.addProcessor(new TestAnnotation(listener));
			pm.addProcessor(new ExpectedExceptionRemoval(listener));
			pm.addProcessor(new AssertionsTransformation(listener));
		}

		@Override
		protected void printChangedTypes(PrettyPrinter prettyPrinter, ChangeListener listener,
				Iterable<CtType<?>> newTypes) {
			result = prettyPrinter.printTypes(newTypes.iterator().next());
		}
	}

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
			Changelog changelog = engine.applyToGivenPath(file.toString(), RunMode.FULL);
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
