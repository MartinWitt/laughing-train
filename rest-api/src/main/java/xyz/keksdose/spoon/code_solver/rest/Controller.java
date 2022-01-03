
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
import xyz.keksdose.spoon.code_solver.transformations.junit.AssertThatTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.ExpectedExceptionRemoval;
import xyz.keksdose.spoon.code_solver.transformations.junit.Junit4AnnotationsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.TestAnnotation;

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
		try {
			logger.atInfo().log("Refactoring %s", testClass);
			GitHub github = GitHub.connectAnonymously();
			GHGist gist = github.getGist(testClass);
			String fileName = "Test" + UUID.randomUUID() + ".java";
			String content = gist.getFiles().entrySet().iterator().next().getValue().getContent();
			Path file = Files.createTempFile(fileName, ".java");
			Files.write(file, content.getBytes());
			if (content.length() > 10000) {
				return "Error";
			}
			TransformationEngineExtension engine = new TransformationEngineExtension();
			engine.applyToGivenPath(file.toString(), RunMode.FULL);
			return engine.result;
		}
		catch (Exception e) {
			logger.atSevere().withCause(e).log("Error");
		}
		return "There was an error processing your gist-ID";
	}
}
