package io.github.martinwitt.spoon_analyzer.badsmells.private_final_method;

import io.github.martinwitt.laughing_train.spoonutils.matcher.Matchers;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.Filter;

public class PrivateFinalMethodAnalyzer implements LocalAnalyzer, LocalRefactor<PrivateFinalMethod> {

    private Filter<CtMethod<?>> filter = new PrivateFinalMethodFilter();

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<BadSmell> badSmells = new ArrayList<>();
        for (CtMethod<?> method : clazz.getElements(filter)) {
            badSmells.add(new PrivateFinalMethod(clazz, method));
        }
        return badSmells;
    }

    private static class PrivateFinalMethodFilter implements Filter<CtMethod<?>> {

        @Override
        public boolean matches(CtMethod<?> element) {
            return Matchers.allOf(Matchers.isPrivate(), Matchers.isFinal()).matches(element);
        }
    }

    @Override
    public void refactor(PrivateFinalMethod badSmell) {
        badSmell.getAffectedMethod().removeModifier(ModifierKind.FINAL);
    }
}
