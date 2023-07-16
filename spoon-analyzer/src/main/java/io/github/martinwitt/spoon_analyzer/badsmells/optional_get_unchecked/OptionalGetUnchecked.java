package io.github.martinwitt.spoon_analyzer.badsmells.optional_get_unchecked;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.BadSmellVisitor;
import spoon.reflect.declaration.CtType;

/**
 * OptionalGetUnchecked
 * Doc:
 * https://github.com/JetBrains/intellij-community/blob/3954b01be351a4e35ce02348f26f2cff9516f0ab/java/openapi/resources/messages/JavaBundle.properties#L1506
 * https://github.com/JetBrains/intellij-community/blob/3954b01be351a4e35ce02348f26f2cff9516f0ab/java/java-impl-inspections/src/com/intellij/codeInspection/SimplifyOptionalCallChainsInspection.java#L42
 */
public class OptionalGetUnchecked implements BadSmell {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }

    @Override
    public CtType<?> getAffectedType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAffectedType'");
    }

    @Override
    public <T> T accept(BadSmellVisitor<T> visitor) {
        // TODO:
        return null;
    }
}
