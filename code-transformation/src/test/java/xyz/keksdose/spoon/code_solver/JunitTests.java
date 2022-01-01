
package xyz.keksdose.spoon.code_solver;

import static com.google.common.truth.Truth.assertThat;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.TestAnnotation;

public class JunitTests {

	@Test
	void replaceJunit4WithJunit5TestAnnotation(@TempDir File tempDir) throws IOException {
		File copy = new File(tempDir, "TestAnnotation.java");
		File source = TestHelper.getResouces(Path.of("projects/junittests/TestAnnotation.java"));
		List<Function<ChangeListener, TransformationProcessor<?>>> transformations = new ArrayList<>();
		transformations.add(v -> new TestAnnotation(v));
		TestHelper.copyFile(source, copy);
		new TransformationHelper.Builder().path(tempDir.getAbsolutePath()).className("TestAnnotation").processors(
			transformations).apply();
		String result = Files.readString(copy.toPath());
		assertThat(result).contains("@Test");
		assertThat(result).contains("import org.junit.jupiter.api.Test;");
		assertThat(result).doesNotContain("import org.junit.Test;");
	}
}
