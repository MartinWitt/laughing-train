package xyz.keksdose.spoon.code_solver.printing;

import spoon.Launcher;
import spoon.compiler.Environment;
import xyz.keksdose.spoon.code_solver.spoon.ImportAwareSniperPrinter;

public class EnvironmentOptions {

    public static Environment setEnvironmentOptions(Launcher launcher) {
        Environment environment = launcher.getEnvironment();
        environment.setNoClasspath(true);
        environment.disableConsistencyChecks();
        environment.setShouldCompile(true);
        environment.setComplianceLevel(11);
        environment.setIgnoreDuplicateDeclarations(true);
        environment.setPreserveLineNumbers(true);
        environment.setPrettyPrinterCreator(() -> new ImportAwareSniperPrinter(environment));
        return environment;
    }
}
