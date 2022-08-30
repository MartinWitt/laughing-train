package xyz.keksdose.spoon.code_solver;

import static java.nio.file.StandardCopyOption.*;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
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

    public static File createCopyDirectory(Path target, String resourcePath) throws IOException {
        File source = TestHelper.getResouces(Path.of(resourcePath));
        copyFolder(source.toPath(), target);
        return target.toFile();
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

    private static void copyFolder(Path src, Path dest) throws IOException {
        try (Stream<Path> stream = java.nio.file.Files.walk(src)) {
            stream.forEach(source -> copy(source, dest.resolve(src.relativize(source))));
        }
    }

    private static void copy(Path source, Path dest) {
        try {
            java.nio.file.Files.copy(source, dest, REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
