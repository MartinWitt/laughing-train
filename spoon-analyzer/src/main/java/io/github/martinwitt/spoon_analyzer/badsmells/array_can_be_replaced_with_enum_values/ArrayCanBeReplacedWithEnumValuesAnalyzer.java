package io.github.martinwitt.spoon_analyzer.badsmells.array_can_be_replaced_with_enum_values;

import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.Filter;

public class ArrayCanBeReplacedWithEnumValuesAnalyzer implements LocalAnalyzer {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<BadSmell> badSmells = new ArrayList<>();
        EnumArrayInitializer filter = new EnumArrayInitializer();
        for (CtNewArray<?> element : clazz.getElements(filter)) {
            badSmells.add(new ArrayCanBeReplacedWithEnumValues(clazz, element));
        }
        return badSmells;
    }

    private static final class EnumArrayInitializer implements Filter<CtNewArray<?>> {

        @Override
        public boolean matches(CtNewArray<?> element) {
            List<CtExpression<?>> elements = element.getElements();
            if (elements.isEmpty()) {
                return false;
            }
            // check if all elements are enum values
            for (CtExpression<?> ctExpression : elements) {
                if (!Optional.ofNullable(ctExpression.getType())
                        .map(v -> v.isEnum())
                        .orElse(false)) {
                    return false;
                }
            }
            long count = elements.stream().map(CtExpression::getType).distinct().count();
            CtEnum<?> declaration = (CtEnum<?>) elements.get(0).getType().getTypeDeclaration();
            if (declaration == null) {
                return false;
            }
            if (declaration.getEnumValues().size() != count) {
                return false;
            }
            return true;
        }
    }
}
