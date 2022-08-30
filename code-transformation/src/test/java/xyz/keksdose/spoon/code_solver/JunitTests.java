package xyz.keksdose.spoon.code_solver;

import static com.google.common.truth.Truth.assertThat;
import static xyz.keksdose.spoon.code_solver.TestHelper.createProcessorSupplier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.AssertionsTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.migration.TestAnnotation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.AssertNotNullTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.AssertNullTransformation;
import xyz.keksdose.spoon.code_solver.transformations.junit.simplification.AssertTrueEqualsCheck;

@DisplayNameGeneration(CamelCaseToSpaceDisplayNames.class)
class JunitTests {

    @Test
    void replaceJunit4WithJunit5TestAnnotation(@TempDir File tempRoot) throws IOException {
        String fileName = "TestAnnotation.java";
        String resourcePath = "projects/junittests/TestAnnotation.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations =
                createProcessorSupplier(v -> new TestAnnotation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("TestAnnotation")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
    }

    @Test
    void replaceJunit4AssertionsWithJunit5(@TempDir File tempRoot) throws IOException {
        String fileName = "TestAssertions.java";
        String resourcePath = "projects/junittests/TestAssertions.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations =
                createProcessorSupplier(v -> new TestAnnotation(v), v -> new AssertionsTransformation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("TestAssertions")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
    }

    @Test
    public void printerDoesNotCrash(@TempDir File tempRoot) throws IOException {
        String fileName = "AnnotationValuesTest.java";
        String resourcePath = "projects/bugs/AnnotationValuesTest.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations =
                createProcessorSupplier(v -> new TestAnnotation(v), v -> new AssertionsTransformation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("AnnotationValuesTest")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
    }

    @Test
    public void printerDoesNotIncludeWhiteSpaceInInvocations(@TempDir File tempRoot) throws IOException {
        String fileName = "WhiteSpaces.java";
        String resourcePath = "projects/bugs/WhiteSpaces.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations =
                createProcessorSupplier(v -> new TestAnnotation(v), v -> new AssertionsTransformation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("WhiteSpaces")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        // no whitespace should be printed for the first argument.
        assertThat(result).doesNotContain(" 1");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
    }

    @Test
    void replaceAssertTrueNotNullCheck(@TempDir File tempRoot) throws IOException {
        String fileName = "AssertNotNull.java";
        String resourcePath = "projects/junittests/AssertNotNull.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations = createProcessorSupplier(
                v -> new TestAnnotation(v),
                v -> new AssertionsTransformation(v),
                v -> new AssertNotNullTransformation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("AssertNotNull")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
        assertThat(result).doesNotContain("!= null");
    }

    @Test
    void replaceAssertTrueNullCheck(@TempDir File tempRoot) throws IOException {
        String fileName = "AssertNotNull.java";
        String resourcePath = "projects/junittests/AssertNotNull.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations = createProcessorSupplier(
                v -> new TestAnnotation(v),
                v -> new AssertionsTransformation(v),
                v -> new AssertNullTransformation(v),
                v -> new AssertNotNullTransformation(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("AssertNotNull")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
        assertThat(result).doesNotContain("== null");
    }

    @Test
    void replaceAssertTrueEqualsCheck(@TempDir File tempRoot) throws IOException {
        String fileName = "AssertTrueEquals.java";
        String resourcePath = "projects/junittests/AssertTrueEquals.java";
        File copy = TestHelper.createCopy(tempRoot, resourcePath, fileName);
        List<Function<ChangeListener, TransformationProcessor<?>>> transformations = createProcessorSupplier(
                v -> new TestAnnotation(v), v -> new AssertionsTransformation(v), v -> new AssertTrueEqualsCheck(v));
        new TransformationHelper.Builder()
                .path(tempRoot.getAbsolutePath())
                .className("AssertTrueEquals")
                .processors(transformations)
                .apply();
        String result = Files.readString(copy.toPath());
        assertThat(result).contains("@Test");
        assertThat(result).contains("import org.junit.jupiter.api.Test;");
        assertThat(result).doesNotContain("import org.junit.Test;");
        assertThat(result).doesNotContain("import org.junit.Assert.");
        assertThat(result).contains("assertEquals");
    }
}
