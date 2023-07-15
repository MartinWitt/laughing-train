package io.github.martinwitt.spoon_analyzer;

import spoon.reflect.declaration.CtType;

public interface BadSmell {

    String getName();

    String getDescription();

    CtType<?> getAffectedType();

    <T> T accept(BadSmellVisitor<T> visitor);

    /**
     * Fixes the bad smell. Fixing means changing the source code in a way that the bad smell is not present anymore.
     * This method is not supported by default. Call {@link #isFixable()} to check if the bad smell is fixable.
     */
    default void fix() {
        throw new UnsupportedOperationException("Fixing this bad smell is not supported.");
    }

    /**
     * @return true if the bad smell is fixable, false otherwise.
     */
    default boolean isFixable() {
        return false;
    }
}
