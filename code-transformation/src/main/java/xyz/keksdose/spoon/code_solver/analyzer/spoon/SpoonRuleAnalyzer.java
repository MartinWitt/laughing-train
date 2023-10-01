package xyz.keksdose.spoon.code_solver.analyzer.spoon;

import java.util.List;
import spoon.reflect.declaration.CtType;

public interface SpoonRuleAnalyzer {

  List<SpoonAnalyzerResult> analyze(String sourceRoot, CtType<?> ctType);
}
