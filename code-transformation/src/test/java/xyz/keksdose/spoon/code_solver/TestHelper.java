
package xyz.keksdose.spoon.code_solver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.Files;

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
	public static List<TransformationCreator> createProcessorSupplier(TransformationCreator... processors) {
		List<TransformationCreator> transformations = new ArrayList<>();
		for (TransformationCreator processor : processors) {
			transformations.add(v -> processor.apply(v));
		}
		return transformations;
	}
}
