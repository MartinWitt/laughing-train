package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import com.google.common.flogger.FluentLogger;
import io.github.martinwitt.laughing_train.domain.entity.AnalyzerResult;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;

public class SpoonAnalyzer {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public List<AnalyzerResult> analyze(Path path) {

        logger.atInfo().log("Received request for SpoonAnalyzer with path %s", path.toString());
        CtModel model = buildModel(path);
        List<AnalyzerResult> list = model.getAllTypes().stream()
                .flatMap(v -> analyzeType(v).stream())
                .collect(Collectors.toList());
        logger.atInfo().log("SpoonAnalyzer finished with %d results", list.size());
        return list;
    }

    private CtModel buildModel(Path path) {
        Launcher launcher = new Launcher();
        launcher.addInputResource(path.toString());
        launcher.getEnvironment().setAutoImports(true);
        launcher.getEnvironment().setNoClasspath(true);
        launcher.getEnvironment().setIgnoreDuplicateDeclarations(true);
        launcher.getEnvironment().setShouldCompile(false);
        return launcher.buildModel();
    }

    private List<SpoonAnalyzerResult> analyzeType(CtType<?> type) {
        List<AbstractSpoonRuleAnalyzer> results = Arrays.asList(SpoonAnalyzerRules.values());
        return results.stream().flatMap(v -> v.analyze(type).stream()).collect(Collectors.toList());
    }
}
