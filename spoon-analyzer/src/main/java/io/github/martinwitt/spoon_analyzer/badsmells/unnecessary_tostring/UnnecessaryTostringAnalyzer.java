package io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class UnnecessaryTostringAnalyzer implements LocalAnalyzer, LocalRefactor<UnnecessaryTostring> {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<BadSmell> badSmells = new ArrayList<>();
        List<CtInvocation<?>> elements = clazz.getElements(new TypeFilter<>(CtInvocation.class));
        for (CtInvocation<?> invocation : elements) {
            if (invocation.getTarget() != null
                    && invocation.getTarget().getType() != null
                    && invocation.getTarget().getType().getSimpleName().equals("String")
                    && invocation.getExecutable().getSimpleName().equals("toString")) {
                badSmells.add(new UnnecessaryTostring(clazz, invocation));
            }
        }
        return badSmells;
    }

    @Override
    public void refactor(UnnecessaryTostring badSmell) {
        badSmell.getNotNeededTostring().delete();
    }
}
