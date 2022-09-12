package xyz.keksdose.spoon.code_solver;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaAnalyzer;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor;
import xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRules;
import xyz.keksdose.spoon.code_solver.api.QodanaBuilder;
import xyz.keksdose.spoon.code_solver.api.Refactoring;
import xyz.keksdose.spoon.code_solver.api.RepoCheckout;
import xyz.keksdose.spoon.code_solver.api.impl.CleanRepo;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;

public class QodanaRefactoringsTest {

    @Test
    void nonStrictComparisonCanBeEquality() throws IOException {
        ChangeListener changeListener = new ChangeListener();
        var qodana = new QodanaBuilder(changeListener)
                .withSourceFileRoot(".")
                .withNonStrictComparisonCanBeEquality()
                .build();
        FileCheckout repoCheckout = new FileCheckout("projects/qodana/NonStrictComparisonCanBeEquality");
        new Refactoring.Builder(qodana, repoCheckout)
                .withAfterRefactorStep(new CleanRepo())
                .withChangeListener(changeListener)
                .withSubProject("/src/main/java")
                .build()
                .apply();
        // TODO: add checker with Qodana rerun
    }

    @Test
    void sizeReplaceableByIsEmpty() throws IOException {
        ChangeListener changeListener = new ChangeListener();
        var qodana = new QodanaBuilder(changeListener)
                .withSourceFileRoot(".")
                .withSizeReplaceableByIsEmpty()
                .build();
        FileCheckout repoCheckout = new FileCheckout("projects/qodana/SizeReplaceableByIsEmpty");
        new Refactoring.Builder(qodana, repoCheckout)
                .withAfterRefactorStep(new CleanRepo())
                .withChangeListener(changeListener)
                .withSubProject("/src/main/java")
                .build()
                .apply();
        // TODO: add checker with Qodana rerun
    }

    @Test
    void pointlessBooleanExpression() throws IOException {
        ChangeListener changeListener = new ChangeListener();
        var analyzer = new QodanaAnalyzer.Builder().build();
        var results = analyzer.runQodana(Path.of("projects/qodana/PointlessBooleanExpression"));
        FileCheckout repoCheckout = new FileCheckout("projects/qodana/PointlessBooleanExpression");
        new Refactoring.Builder(
                        new QodanaRefactor(List.of(QodanaRules.POINTLESS_BOOLEAN_EXPRESSION), changeListener, results),
                        repoCheckout)
                .withAfterRefactorStep(new CleanRepo())
                .withChangeListener(changeListener)
                .withSubProject("/src/main/java")
                .build()
                .apply();
    }

    @Test
    void copyFolderTest() {
        File file = new FileCheckout("projects/qodana/NonStrictComparisonCanBeEquality").prepareRepo();
        assertTrue(Arrays.asList(file.list()).contains("src"));
    }

    private class FileCheckout implements RepoCheckout {

        private String resourcePath;
        private File result;

        public FileCheckout(String resourcePath) {
            this.resourcePath = resourcePath;
        }

        @Override
        public File prepareRepo() {
            if (result != null) {
                return result;
            }
            try {
                Path folder = Files.createTempDirectory("junit-laughing");
                File copy = TestHelper.createCopyDirectory(folder, resourcePath);
                result = copy;
                return copy;
            } catch (IOException e) {
                fail("failed to copy files", e);
            }
            return null;
        }
    }
}
