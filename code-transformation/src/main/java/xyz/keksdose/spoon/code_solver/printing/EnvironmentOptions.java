package xyz.keksdose.spoon.code_solver.printing;

import spoon.Launcher;
import spoon.compiler.Environment;
import xyz.keksdose.spoon.code_solver.spoon.ImportAwareSniperPrinter;

public class EnvironmentOptions {

    private EnvironmentOptions() {
        // no instance needed, only static methods
    }

    public static Environment setEnvironmentOptions(Launcher launcher) {
        Environment environment = launcher.getEnvironment();
        environment.setNoClasspath(true);
        environment.setComplianceLevel(17);
        environment.setPreserveLineNumbers(true);
        environment.setPrettyPrinterCreator(() -> new ImportAwareSniperPrinter(environment));
        return environment;
    }
}
