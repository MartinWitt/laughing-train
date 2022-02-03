
package xyz.keksdose.spoon.code_solver.api.impl;

import java.io.File;
import java.io.IOException;

import com.google.common.flogger.FluentLogger;

import org.apache.commons.io.FileUtils;

import xyz.keksdose.spoon.code_solver.api.AfterRefactorStep;
import xyz.keksdose.spoon.code_solver.history.Changelog;

public class CleanRepo implements AfterRefactorStep {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	@Override
	public void apply(Changelog changelog, File projectRoot) {
		try {
			FileUtils.deleteDirectory(projectRoot);
		}
		catch (IOException e) {
			logger.atSevere().withCause(e).log("Could not delete directory %s", projectRoot);
		}
	}

}
