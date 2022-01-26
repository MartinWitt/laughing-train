
package xyz.keksdose.spoon.code_solver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.google.common.io.Files;

import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TestHelper {

	public static void copyFile(File source, File target) throws IOException {
		Files.copy(source, target);
	}

	public static File getResouces(Path path) {
		return Path.of("src/test/resources/").resolve(path).toFile();
	}

	public static File createCopy(File root, String resourcePath, String filename) throws IOException {
		File copy = new File(root, filename);
		File source = TestHelper.getResouces(Path.of(resourcePath));
		TestHelper.copyFile(source, copy);
		return copy;
	}

	@SafeVarargs
	public static List<Function<ChangeListener, TransformationProcessor<?>>> createProcessorSupplier(
			Function<ChangeListener, TransformationProcessor<?>>... processors) {
		List<Function<ChangeListener, TransformationProcessor<?>>> transformations = new ArrayList<>();
		for (Function<ChangeListener, TransformationProcessor<?>> processor : processors) {
			transformations.add(v -> processor.apply(v));
		}
		return transformations;
	}
}
