package xyz.keksdose.spoon.code_solver.analyzer.spoon.api;

import java.util.List;
import spoon.reflect.declaration.CtType;
import xyz.keksdose.spoon.code_solver.analyzer.spoon.SpoonAnalyzerResult;

public interface SpoonRuleAnalyzer {

  List<SpoonAnalyzerResult> analyze(String sourceRoot, CtType<?> ctType);
}
