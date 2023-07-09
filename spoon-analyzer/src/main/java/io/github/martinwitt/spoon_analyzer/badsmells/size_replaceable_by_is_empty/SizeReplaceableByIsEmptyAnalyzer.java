package io.github.martinwitt.spoon_analyzer.badsmells.size_replaceable_by_is_empty;

import io.github.martinwitt.laughing_train.spoonutils.matcher.Matchers;
import io.github.martinwitt.spoon_analyzer.BadSmell;
import io.github.martinwitt.spoon_analyzer.LocalAnalyzer;
import io.github.martinwitt.spoon_analyzer.LocalRefactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.Filter;

public class SizeReplaceableByIsEmptyAnalyzer implements LocalAnalyzer, LocalRefactor<SizeReplaceableByIsEmpty> {

    @Override
    public List<BadSmell> analyze(CtType<?> clazz) {
        List<BadSmell> badSmells = new ArrayList<>();
        List<CtBinaryOperator<?>> elements = clazz.getElements(new SizeIsEmptyFilter());
        for (CtBinaryOperator<?> ctBinaryOperator : elements) {
            CtInvocation<?> sizeInvocation = getSizeInvocation(ctBinaryOperator);
            CtExpression<?> zeroLiteral = getZeroLiteral(ctBinaryOperator).orElse(null);
            if (sizeInvocation != null && zeroLiteral != null) {
                badSmells.add(new SizeReplaceableByIsEmpty(clazz, ctBinaryOperator, sizeInvocation, zeroLiteral));
            }
        }
        return badSmells;
    }

    private final class SizeIsEmptyFilter implements Filter<CtBinaryOperator<?>> {

        @Override
        public boolean matches(CtBinaryOperator<?> element) {
            CtExpression<?> zeroLiteral = getZeroLiteral(element).orElse(null);
            CtExpression<?> sizeInvocation = getSizeInvocation(element);
            return (sizeInvocation != null && zeroLiteral != null);
        }
    }

    private Optional<CtInvocation<?>> isSizeInvocation(CtExpression<?> expression) {
        if (expression instanceof CtInvocation invocation) {
            if (invocation.getExecutable() != null) {
                if (invocation.getExecutable().getSimpleName().equals("size")) {
                    return Optional.of(invocation);
                }
            }
        }
        return Optional.empty();
    }

    private CtInvocation<?> getSizeInvocation(CtBinaryOperator<?> element) {
        return isSizeInvocation(element.getLeftHandOperand())
                .orElse(isSizeInvocation(element.getRightHandOperand()).orElse(null));
    }

    private Optional<CtExpression<?>> getZeroLiteral(CtBinaryOperator<?> element) {
        if (Matchers.isLiteral(0).matches(element.getRightHandOperand())) {
            return Optional.of(element.getRightHandOperand());
        } else if (Matchers.isLiteral(0).matches(element.getLeftHandOperand())) {
            return Optional.of(element.getLeftHandOperand());
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void refactor(SizeReplaceableByIsEmpty badSmell) {
        Factory factory = badSmell.getAffectedType().getFactory();
        CtExpression<?> target = badSmell.getSizeInvocation().getTarget();
        CtExecutableReference<?> isEmpty =
                factory.Executable().createReference(target.getType(), false, factory.Type().BOOLEAN, "isEmpty");
        CtInvocation<?> newInvocation = factory.Code().createInvocation(target, isEmpty);
        CtBinaryOperator<?> parent = badSmell.getSizeInvocation().getParent(CtBinaryOperator.class);
        if (parent.getKind().equals(BinaryOperatorKind.EQ)) {
            badSmell.getSizeInvocation().getParent(CtBinaryOperator.class).replace(newInvocation);
        } else {
            parent.replace(factory.Core()
                    .createUnaryOperator()
                    .setKind(UnaryOperatorKind.NOT)
                    .setOperand(newInvocation));
        }
    }
}
