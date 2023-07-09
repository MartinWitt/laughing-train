package io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_implements;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

public class UnnecessaryImplements implements BadSmell {

    private final String name = "Unnecessary Implements";
    private final String description = "This class has 1 or more interfaces which are already implemented.";

    private final CtTypeReference<?> lowerType;
    private final CtTypeReference<?> notNeededImplements;
    private final CtType<?> affectedType;

    public UnnecessaryImplements(
            CtTypeReference<?> lowerType, CtTypeReference<?> notNeededImplements, CtType<?> affectedType) {
        this.lowerType = lowerType;
        this.notNeededImplements = notNeededImplements;
        this.affectedType = affectedType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public CtType<?> getAffectedType() {
        return affectedType;
    }
    /**
     * @return the lowerType
     */
    public CtTypeReference<?> getLowerType() {
        return lowerType;
    }
    /**
     * @return the notNeededImplements
     */
    public CtTypeReference<?> getNotNeededImplements() {
        return notNeededImplements;
    }

    @Override
    public String toString() {
        return "UnnecessaryImplements [name=" + name + ", description=" + description
                + ", lowerType=" + lowerType + ", notNeededImplements=" + notNeededImplements
                + ", affectedType=" + affectedType.getQualifiedName() + "]";
    }

    @Override
    public void fix() {
        new UnnecessaryImplementsAnalyzer().refactor(this);
    }

    @Override
    public boolean isFixable() {
        return true;
    }
}
