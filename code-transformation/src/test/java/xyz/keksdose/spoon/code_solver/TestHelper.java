
package xyz.keksdose.spoon.code_solver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import com.google.common.io.Files;

public class TestHelper {

	public static void copyFile(File source, File target) throws IOException {
		Files.copy(source, target);
	}

	public static File getResouces(Path path) {
		return Path.of("src/test/resources/").resolve(path).toFile();
	}
}
