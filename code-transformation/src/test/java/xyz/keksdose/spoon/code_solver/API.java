package xyz.keksdose.spoon.code_solver;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import xyz.keksdose.spoon.code_solver.github.CommitBuilder;

/**
 * Because we currently have no real API this is the current solution.
 */
@Disabled
public class API {

    @Test
    void applyWithGitSettings() {
        String projectPath = "";
        String typeToRefactorName = "";
        String pathToLocalGitRepo = "";
        CommitBuilder.refactorRepo(pathToLocalGitRepo, projectPath, typeToRefactorName, (v, u) -> {
            return new TransformationEngine().applyToGivenPath(projectPath, typeToRefactorName);
        });
    }

    @Test
    void applyWithoutGit() {
        String projectPath = "";
        String typeToRefactorName = "";
        new TransformationEngine().applyToGivenPath(projectPath, typeToRefactorName);
    }
}
