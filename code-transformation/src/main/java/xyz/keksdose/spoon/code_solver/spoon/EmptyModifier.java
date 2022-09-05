package xyz.keksdose.spoon.code_solver.spoon;

import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.CtExtendedModifier;

public class EmptyModifier extends CtExtendedModifier {

    private EmptyModifier(ModifierKind kind, boolean value) {
        super(kind, value);
    }

    public static EmptyModifier empty() {
        return new EmptyModifier(ModifierKind.NON_SEALED, false);
    }

    @Override
    public String toString() {
        return "";
    }
}
