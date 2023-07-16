package io.github.martinwitt.spoon_analyzer.badsmells.optional_get_unchecked;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.List;
import java.util.Set;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;

public class OptionalGetUncheckedAnalyzer implements LocalAnalyzer {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {

        Set<CtMethod<?>> methods = clazz.getMethods();
        for (CtMethod<?> method : methods) {
            List<CtVariable<?>> elements = method.getElements(new TypeFilter<>(CtVariable.class));
            for (CtVariable<?> variable : elements) {
                if (isOptional(variable)) {
                    System.out.println("Optional found");
                }
            }
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analyze'");
    }

    private boolean isOptional(CtVariable<?> variable) {
        return true;
        // return Matchers.isType("java.lang.Optional", variable.getFactory()).matches(variable);
    }
}
