package io.github.martinwitt.spoon_analyzer.badsmells.implicit_array_to_string;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;

public class ImplicitArrayToString implements BadSmell {

    private final CtType<?> clazz;
    private final CtInvocation<?> implicitToStringCaller;

    public ImplicitArrayToString(CtType<?> clazz, CtInvocation<?> implicitToStringCaller) {
        this.clazz = clazz;
        this.implicitToStringCaller = implicitToStringCaller;
    }

    @Override
    public String getName() {
        return "ImplicitArrayToString";
    }

    @Override
    public String getDescription() {
        return "Calling toString() on an array returns not the content but the toString from the array object itself.";
    }

    @Override
    public CtType<?> getAffectedType() {
        return clazz;
    }

    public CtInvocation<?> getImplicitToStringCaller() {
        return implicitToStringCaller;
    }

    @Override
    public <T> T accept(BadSmellVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
