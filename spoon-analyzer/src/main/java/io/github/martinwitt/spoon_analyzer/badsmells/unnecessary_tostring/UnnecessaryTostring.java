package io.github.martinwitt.spoon_analyzer.badsmells.unnecessary_tostring;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;

public class UnnecessaryTostring implements BadSmell {

    private static final String name = "UnnecessaryTostring";
    private static final String description = "Calling to String on a String object is unnecessary.";
    private final CtType<?> affectedType;
    private final CtInvocation<?> notNeededTostring;

    public UnnecessaryTostring(CtType<?> affectedType, CtInvocation<?> notNeededTostring) {
        this.affectedType = affectedType;
        this.notNeededTostring = notNeededTostring;
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
     * @return the notNeededTostring
     */
    public CtInvocation<?> getNotNeededTostring() {
        return notNeededTostring;
    }

    @Override
    public void fix() {
        new UnnecessaryTostringAnalyzer().refactor(this);
    }

    @Override
    public boolean isFixable() {
        return true;
    }
}
