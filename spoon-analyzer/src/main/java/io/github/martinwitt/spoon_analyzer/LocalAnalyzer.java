package io.github.martinwitt.spoon_analyzer;

import java.util.List;
import spoon.reflect.declaration.CtType;

public interface LocalAnalyzer {
    List<BadSmell> analyze(CtType<?> clazz);
}
