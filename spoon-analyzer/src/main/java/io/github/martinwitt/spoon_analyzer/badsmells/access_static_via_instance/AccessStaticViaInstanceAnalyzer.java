package io.github.martinwitt.spoon_analyzer.badsmells.access_static_via_instance;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Filter;

public class AccessStaticViaInstanceAnalyzer implements LocalAnalyzer, LocalRefactor<AccessStaticViaInstance> {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<CtInvocation<?>> elements = clazz.getElements(new StaticInvocationFilter());
        List<BadSmell> results = new ArrayList<>();
        for (CtInvocation<?> element : elements) {
            results.add(new AccessStaticViaInstance(clazz, element));
        }
        return results;
    }

    private final class StaticInvocationFilter implements Filter<CtInvocation<?>> {

        @Override
        public boolean matches(CtInvocation<?> element) {
            if (!Optional.ofNullable(element.getExecutable())
                    .map(v -> v.getExecutableDeclaration())
                    .filter(v -> v instanceof CtMethod)
                    .map(v -> (CtMethod<?>) v)
                    .map(v -> v.isStatic())
                    .orElse(false)) {
                return false;
            }
            return element.getTarget() != null && !(element.getTarget() instanceof CtTypeAccess);
        }
    }

    @Override
    public void refactor(AccessStaticViaInstance badSmell) {
        CtInvocation<?> affectedCtInvocation = badSmell.getAffectedCtInvocation();
        CtTypeReference<?> target = affectedCtInvocation.getTarget().getType();
        CtTypeAccess<?> typeAccess =
                badSmell.getAffectedType().getFactory().Code().createTypeAccess(target);
        typeAccess.getAccessedType().setSimplyQualified(true);
        affectedCtInvocation.setTarget(typeAccess);
    }
}
