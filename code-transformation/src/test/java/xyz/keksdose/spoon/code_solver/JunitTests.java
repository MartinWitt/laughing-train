
package xyz.keksdose.spoon.code_solver;

import static com.google.common.truth.Truth.assertThat;
import static xyz.keksdose.spoon.code_solver.TestHelper.createProcessorSupplier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.transformations.junit.TestAnnotation;

class JunitTests {

	@Test
	void replaceJunit4WithJunit5TestAnnotation(@TempDir File tempRoot) throws IOException {
		String fileName = "TestAnnotation.java";
		String resourcePath = "projects/junittests/TestAnnotation.java";
		File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
		List<TransformationCreator> transformations = createProcessorSupplier(v -> new TestAnnotation(v));
		new TransformationHelper.Builder().path(tempRoot.getAbsolutePath())
				.className("TestAnnotation")
				.processors(transformations)
				.apply();
		String result = Files.readString(copy.toPath());
		assertThat(result).contains("@Test");
		assertThat(result).contains("import org.junit.jupiter.api.Test;");
		assertThat(result).doesNotContain("import org.junit.Test;");
	}
}
