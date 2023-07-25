package io.github.martinwitt.spoon_analyzer.badsmells.equals_hashcode;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

public class EqualsHashcodeAnalyzer implements LocalAnalyzer {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {

        boolean hasEquals = false;
        boolean hasHashcode = false;
        for (CtMethod<?> methods : clazz.getMethods()) {
            if (isEqualsMethod(methods)) {
                hasEquals = true;
            }
            if (isHashcodeMethod(methods)) {
                hasHashcode = true;
            }
        }
        // if only one of them is present, it is a badsmell, otherwise not
        if ((!hasEquals && hasHashcode) || (hasEquals && !hasHashcode)) {
            return List.of(new EqualsHashcode(clazz));
        }
        return List.of();
    }

    private boolean isEqualsMethod(CtMethod<?> method) {
        return method.getSimpleName().equals("equals");
    }

    private boolean isHashcodeMethod(CtMethod<?> method) {
        return method.getSimpleName().equals("hashCode");
    }
}
