package io.github.martinwitt.spoon_analyzer.badsmells.equals_hashcode;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.declaration.CtType;

/**
 * This badsmell means the class does not override equals() and hashcode() methods together.
 * Overriding only one of them is not enough and can lead to unexpected behavior.
 */
public class EqualsHashcode implements BadSmell {

    private CtType<?> affectedType;

    public EqualsHashcode(CtType<?> affectedType) {
        this.affectedType = affectedType;
    }

    @Override
    public String getName() {
        return "EqualsHashcode";
    }

    @Override
    public String getDescription() {
        return "This class does not override equals() and hashcode() methods together.";
    }

    @Override
    public CtType<?> getAffectedType() {
        return affectedType;
    }

    @Override
    public <T> T accept(BadSmellVisitor<T> visitor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }
}
