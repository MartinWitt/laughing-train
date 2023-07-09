package io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.declaration.CtType;

// https://github.com/JetBrains/intellij-community/blob/master/plugins/InspectionGadgets/src/inspectionDescriptions/ArrayCanBeReplacedWithEnumValues.html
public class ArrayCanBeReplacedWithEnumValues implements BadSmell {

    private static final String NAME = "ArrayCanBeReplacedWithEnumValues";
    private static final String DESCRIPTION =
            "Instead of listing all enum values in an array, you can use the `Enum.values() directly. This makes the code more readable and less error prone. There are no updates needed if there is a new enum value.";

    private final CtType<?> affectedType;
    private final CtNewArray<?> affectedElement;

    public ArrayCanBeReplacedWithEnumValues(CtType<?> affectedType, CtNewArray<?> affectedElement) {
        this.affectedType = affectedType;
        this.affectedElement = affectedElement;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public CtType<?> getAffectedType() {
        return affectedType;
    }

    public CtNewArray<?> getAffectedElement() {
        return affectedElement;
    }
}
