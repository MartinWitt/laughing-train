
package xyz.keksdose.spoon.code_solver.api;

import java.io.File;

import xyz.keksdose.spoon.code_solver.history.Changelog;

public interface AfterRefactorStep {

	public void apply(Changelog changelog, File projectRoot);
}
