package io.github.martinwitt.laughing_train.spoonutils.matcher;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;

/**
 * A utility class for creating matchers for Spoon elements.
 */
public final class Matchers {

    /**
     * Returns a matcher that matches elements that are public.
     *
     * @return a matcher that matches elements that are public
     */
    public static Matcher<CtModifiable> isPublic() {
        return v -> v.getModifiers().contains(ModifierKind.PUBLIC);
    }

    /**
     * Returns a matcher that matches elements that are private.
     *
     * @return a matcher that matches elements that are private
     */
    public static Matcher<CtModifiable> isPrivate() {
        return v -> v.getModifiers().contains(ModifierKind.PRIVATE);
    }

    /**
     * Returns a matcher that matches elements that are enums.
     *
     * @return a matcher that matches elements that are enums
     */
    public static Matcher<CtType<?>> isEnum() {
        return v -> v.isEnum();
    }

    /**
     * Returns a matcher that matches elements that are integer literals with the given value.
     *
     * @param literal the value of the integer literal to match
     * @return a matcher that matches elements that are integer literals with the given value
     */
    public static Matcher<CtExpression<?>> isLiteral(int literal) {
        return v -> v instanceof CtLiteral
                && ((CtLiteral<?>) v).getValue() instanceof Integer value
                && value.equals(literal);
    }

    /**
     * Returns a matcher that matches elements that are final.
     *
     * @return a matcher that matches elements that are final
     */
    public static Matcher<CtModifiable> isFinal() {
        return v -> v.getModifiers().contains(ModifierKind.FINAL);
    }

    /**
     * Returns a matcher that matches elements that are static.
     *
     * @return a matcher that matches elements that are static
     */
    public static Matcher<CtModifiable> isStatic() {
        return v -> v.isStatic();
    }

    /**
     * Returns a matcher that matches elements that match all of the given matchers.
     *
     * @param matchers the matchers to match
     * @param <T>      the type of elements to match
     * @return a matcher that matches elements that match all of the given matchers
     */
    @SafeVarargs
    public static <T> Matcher<T> allOf(Matcher<T>... matchers) {
        return v -> {
            for (Matcher<T> matcher : matchers) {
                if (!matcher.matches(v)) {
                    return false;
                }
            }
            return true;
        };
    }

    private Matchers() {
        throw new AssertionError("Utility class should not be instantiated");
    }
}
