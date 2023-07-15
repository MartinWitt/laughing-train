package io.github.martinwitt.spoon_analyzer.badsmells.non_protected_constructor_In_abstract_class;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;

public class NonProtectedConstructorInAbstractClass implements BadSmell {

    private final CtType<?> clazz;
    private final CtConstructor<?> ctConstructor;

    public NonProtectedConstructorInAbstractClass(CtType<?> clazz, CtConstructor<?> ctConstructor) {
        this.clazz = clazz;
        this.ctConstructor = ctConstructor;
    }

    @Override
    public String getName() {
        return "NonProtectedConstructorInAbstractClass";
    }

    @Override
    public String getDescription() {
        return "A non-protected constructor in an abstract class is not accessible from outside the package. Adding the modifier public is not needed, as only subclasses can call the constructor.";
    }

    @Override
    public CtType<?> getAffectedType() {
        return clazz;
    }

    @Override
    public String toString() {
        return "NonProtectedConstructorInAbstractClass [clazz=" + clazz.getQualifiedName() + ", ctConstructor="
                + ctConstructor.getSignature() + "]";
    }

    /**
     * @return the ctConstructor
     */
    public CtConstructor<?> getCtConstructor() {
        return ctConstructor;
    }

    @Override
    public void fix() {
        new NonProtectedConstructorInAbstractClassAnalyzer().refactor(this);
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
