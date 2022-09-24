package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.rules.ComparatorCombinators;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.api.analyzer.Position;
import xyz.keksdose.spoon.code_solver.transformations.TestAnalyzerResult;
import xyz.keksdose.spoon.code_solver.transformations.TransformationTestUtils;

public class ComparatorCombinatorsTest {
    @Test
    void refactorComparatorLaughingTrainCommitBuilder(@TempDir File dir) throws IOException {
        Position position = new Position(85, 0, 25, 0, 3627, 0);
        AnalyzerResult result =
                new TestAnalyzerResult("CommitBuilder.java", position, "Can be replaced with 'Comparator.comparing'");
        String resourcePath = "projects/refactorings/ComparatorCombinators/CommitBuilder.java";
        var copy = TransformationTestUtils.transform(new ComparatorCombinators(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }

    @Test
    void refactorComparatorLaughingTrainPullRequest(@TempDir File dir) throws IOException {
        Position position = new Position(279, 0, 25, 0, 12731, 0);
        AnalyzerResult result =
                new TestAnalyzerResult("PullRequest.java", position, "Can be replaced with 'Comparator.comparing'");
        String resourcePath = "projects/refactorings/ComparatorCombinators/PullRequest.java";
        var copy = TransformationTestUtils.transform(new ComparatorCombinators(result), resourcePath, dir);
        TransformationTestUtils.compareContent(copy, resourcePath);
    }
}
