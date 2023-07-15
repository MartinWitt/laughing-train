package io.github.martinwitt.spoon_analyzer.badsmells.innerclass_may_be_static;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.declaration.CtType;

public class InnerClassMayBeStatic implements BadSmell {

    private final CtType<?> affectedType;
    private final CtType<?> innerClass;
    private static final String name = "Inner Class May Be Static";
    private static final String description =
            "This class is an inner class and may be static. Static inner classes dont need the reference to the outer class.";

    public InnerClassMayBeStatic(CtType<?> affectedType, CtType<?> innerClass) {
        this.affectedType = affectedType;
        this.innerClass = innerClass;
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

    public CtType<?> getInnerClass() {
        return innerClass;
    }

    @Override
    public String toString() {
        return "InnerClassMayBeStatic [affectedType=" + affectedType.getQualifiedName() + ", innerClass="
                + innerClass.getQualifiedName() + "]";
    }

    @Override
    public void fix() {
        new InnerClassMayBeStaticAnalyzer().refactor(this);
    }

    @Override
    public boolean isFixable() {
        return true;
    }

    @Override
    public <T> T accept(BadSmellVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
