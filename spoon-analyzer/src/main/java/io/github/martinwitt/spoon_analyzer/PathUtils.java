package io.github.martinwitt.spoon_analyzer;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PathUtils {

    /**
     * Removes paths that are already covered by a deeper one.
     * @param paths the list of paths to filter
     * @return a new list of paths with duplicates removed
     */
    public static List<Path> removeRedundantPaths(List<Path> paths) {
        List<Path> result = new ArrayList<>();
        List<Path> sorted = new ArrayList<>(paths);
        sorted.sort((p1, p2) -> p1.getNameCount() - p2.getNameCount());
        for (Path path : sorted) {
            boolean isRedundant = false;
            for (Path other : result) {
                if (path.startsWith(other)) {
                    isRedundant = true;
                    break;
                }
            }
            if (!isRedundant) {
                result.add(path);
            }
        }
        return result;
    }

    /**
     * Filters input paths that contain resources or test files.
     * @param paths the list of paths to filter
     * @return a new list of paths without resources or test files
     */
    public static List<Path> filterResourcePaths(List<Path> paths) {
        return paths.stream()
                .filter(path -> filterNonSourcePath(path))
                .collect(Collectors.toList());
    }

    private static boolean filterNonSourcePath(Path path) {
        return isSourceDirectory(path)
                || isTestDirectory(path);
    }

    private static boolean isSourceDirectory(Path path) {
        return path.endsWith("src" + File.separator + "main" + File.separator + "java");
    }
        private static boolean isTestDirectory(Path path) {
        return path.endsWith("src" + File.separator + "test" + File.separator + "java");
    }
}
