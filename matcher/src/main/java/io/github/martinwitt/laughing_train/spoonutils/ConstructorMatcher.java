package io.github.martinwitt.laughing_train.spoonutils;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Filter;

/**
 * A filter for matching constructor calls with a specific target type and argument types.
 */
public class ConstructorMatcher implements Filter<CtConstructorCall<?>> {

    private String fqTargetType;
    private String[] argsFQN;

    /**
     * Creates a new constructor matcher with the given target type and argument types.
     *
     * @param fqTargetType the fully-qualified name of the target type
     * @param argsFQN      the fully-qualified names of the argument types
     */
    public ConstructorMatcher(String fqTargetType, String... argsFQN) {
        this.fqTargetType = fqTargetType;
        this.argsFQN = argsFQN;
    }

    /**
     * Determines whether the given constructor call matches the target type and argument types.
     *
     * @param element the constructor call to match
     * @return true if the constructor call matches the target type and argument types, false otherwise
     */
    @Override
    public boolean matches(CtConstructorCall<?> element) {
        if (element == null) {
            return false;
        }

        if (!element.getType().getQualifiedName().equals(fqTargetType)) {
            return false;
        }
        if (argsFQN == null || argsFQN.length == 0) {
            return true;
        }
        if (element.getArguments().size() != argsFQN.length) {
            return false;
        }

        List<Pair<CtTypeReference<?>, CtExpression<?>>> zipped = new ArrayList<>();
        for (int i = 0; i < argsFQN.length && i < element.getArguments().size(); i++) {
            zipped.add(Pair.of(
                    element.getFactory().createReference(argsFQN[i]),
                    element.getArguments().get(i)));
        }
        return zipped.stream().allMatch(pair -> pair.getRight().getType().isSubtypeOf(pair.getLeft()));
    }
}