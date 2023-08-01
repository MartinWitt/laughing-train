package io.github.martinwitt.spoon_analyzer.badsmells.implicit_array_to_string;

import io.github.martinwitt.laughing_train.spoonutils.ImplicitToStringMatcher;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class ImplicitArrayToStringAnalyzer implements LocalAnalyzer {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<BadSmell> badSmells = new ArrayList<BadSmell>();
        ImplicitToStringMatcher matcher = new ImplicitToStringMatcher();
        List<CtInvocation<?>> invocations = clazz.getElements(new TypeFilter<>(CtInvocation.class));
        for (CtInvocation<?> invocation : invocations) {
            if (matcher.matches(invocation)) {
                if (invocation.getArguments().stream()
                        .anyMatch(v -> v.getType() != null && v.getType().isArray())) {
                    badSmells.add(new ImplicitArrayToString(clazz, invocation));
                }
            }
        }
        return badSmells;
    }
}
