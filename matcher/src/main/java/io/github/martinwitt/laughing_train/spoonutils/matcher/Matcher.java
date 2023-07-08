package io.github.martinwitt.laughing_train.spoonutils.matcher;

/**
 * A functional interface for matching elements of a certain type.
 *
 * @param <T> the type of elements to match
 */
@FunctionalInterface
public interface Matcher<T> {

    /**
     * Determines whether the given element matches a certain criteria.
     *
     * @param element the element to match
     * @return true if the element matches the criteria, false otherwise
     */
    boolean matches(T element);
}
