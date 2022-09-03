package xyz.keksdose.spoon.code_solver.analyzer.qodana.rules;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.api.analyzer.AnalyzerResult;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class SizeReplaceableByIsEmpty extends AbstractRefactoring {

    private static final BadSmell badSmell = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("SizeReplaceableByIsEmpty");
        }

        @Override
        public MarkdownString getDescription() {
            String rawText =
                    "Checking if something is empty should be done by Object#isEmpty instead of Object.size==0";
            String markdown =
                    "Checking if a something is empty should be done by `Object#isEmpty` instead of `Object.size==0`";
            return MarkdownString.fromMarkdown(rawText, markdown);
        }
    };

    public SizeReplaceableByIsEmpty(AnalyzerResult result) {
        super(result);
    }

    @Override
    public void refactor(ChangeListener listener, CtType<?> type) {
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        int column = result.position().startColumn();
        int line = result.position().startLine();
        var operators = type.getElements(new TypeFilter<>(CtBinaryOperator.class));
        for (CtBinaryOperator<?> ctBinaryOperator : operators) {
            if (isEquals(ctBinaryOperator)
                    && matchesPosition(ctBinaryOperator, line, column)
                    && isSizeReplaceableByIsEmpty(ctBinaryOperator)) {
                handleStringIsEmpty(listener, type, ctBinaryOperator);
                handleCollectionIsEmpty(listener, type, ctBinaryOperator);
            }
        }
    }

    private void handleCollectionIsEmpty(
            ChangeListener listener, CtType<?> type, CtBinaryOperator<?> ctBinaryOperator) {
        if (isConstant(ctBinaryOperator.getLeftHandOperand())) {
            var invocation = findSizeInvocation(ctBinaryOperator.getRightHandOperand());
            if (invocation == null) {
                return;
            }
            var isEmpty = createIsEmptyMethod(invocation.getFactory());
            ctBinaryOperator.replace(createNewInvocation(invocation.getTarget(), isEmpty));
            listener.setChanged(
                    type,
                    new Change(
                            badSmell,
                            MarkdownString.fromRaw("Replaced collection.size empty check with collection.isEmpty"),
                            type,
                            result));
        } else {
            var invocation = findSizeInvocation(ctBinaryOperator.getLeftHandOperand());
            if (invocation == null) {
                return;
            }
            var isEmpty = createIsEmptyMethod(invocation.getFactory());
            ctBinaryOperator.replace(createNewInvocation(invocation.getTarget(), isEmpty));
            listener.setChanged(
                    type,
                    new Change(
                            badSmell,
                            MarkdownString.fromRaw("Replaced collection.size empty check with collection.isEmpty"),
                            type,
                            result));
        }
    }

    private void handleStringIsEmpty(ChangeListener listener, CtType<?> type, CtBinaryOperator<?> ctBinaryOperator) {
        if (isConstant(ctBinaryOperator.getLeftHandOperand())) {
            var invocation = findLengthInvocation(ctBinaryOperator.getRightHandOperand());
            if (invocation == null) {
                return;
            }
            String invocationString = invocation.toString();
            String markdown = "Replaced `%s` in `%s` with `%s`";
            String raw = "Replaced %s in %s with %s";
            var isEmpty = createIsEmptyMethod(invocation.getFactory());
            ctBinaryOperator.replace(createNewInvocation(invocation.getTarget(), isEmpty));

            listener.setChanged(
                    type,
                    new Change(
                            badSmell,
                            MarkdownString.fromMarkdown(
                                    String.format(raw, invocationString, ctBinaryOperator, isEmpty),
                                    String.format(markdown, invocationString, ctBinaryOperator, isEmpty)),
                            type,
                            result));
        } else {
            var invocation = findLengthInvocation(ctBinaryOperator.getLeftHandOperand());
            if (invocation == null) {
                return;
            }
            String invocationString = invocation.toString();
            String markdown = "Replaced `%s` in `%s` with `%s`";
            String raw = "Replaced %s in %s with %s";
            var isEmpty = createIsEmptyMethod(invocation.getFactory());
            ctBinaryOperator.replace(createNewInvocation(invocation.getTarget(), isEmpty));
            listener.setChanged(
                    type,
                    new Change(
                            badSmell,
                            MarkdownString.fromMarkdown(
                                    String.format(raw, invocationString, ctBinaryOperator, isEmpty),
                                    String.format(markdown, invocationString, ctBinaryOperator, isEmpty)),
                            type,
                            result));
        }
    }

    private <T> CtInvocation<T> findLengthInvocation(CtExpression<?> expression) {
        return expression.getElements(new TypeFilter<CtInvocation<T>>(CtInvocation.class)).stream()
                .filter(invocation -> invocation.getExecutable().getSimpleName().equals("length"))
                .findFirst()
                .orElse(null);
    }

    private <T> CtInvocation<T> findSizeInvocation(CtExpression<?> expression) {
        return expression.getElements(new TypeFilter<CtInvocation<T>>(CtInvocation.class)).stream()
                .filter(invocation -> invocation.getExecutable().getSimpleName().equals("size"))
                .findFirst()
                .orElse(null);
    }

    private boolean isEquals(CtBinaryOperator<?> ctBinaryOperator) {
        return ctBinaryOperator.getKind() == BinaryOperatorKind.EQ;
    }

    private boolean matchesPosition(CtBinaryOperator<?> op, int line, int column) {
        return op.getPosition().getLine() == line
                && op.getPosition().getColumn() <= column
                && op.getPosition().getEndColumn() >= column;
    }

    public boolean isSizeReplaceableByIsEmpty(CtBinaryOperator<?> op) {
        if (op.getLeftHandOperand() instanceof CtLiteral && op.getRightHandOperand() instanceof CtLiteral) {
            return false;
        }
        if (op.getLeftHandOperand() instanceof CtLiteral) {
            return ((CtLiteral<?>) op.getLeftHandOperand()).getValue().equals(0);
        }
        if (op.getRightHandOperand() instanceof CtLiteral) {
            return ((CtLiteral<?>) op.getRightHandOperand()).getValue().equals(0);
        }
        return false;
    }

    private boolean isConstant(CtExpression<?> expression) {
        return expression instanceof CtLiteral;
    }

    private CtInvocation<Boolean> createNewInvocation(CtExpression<?> target, CtExecutableReference<Boolean> ref) {
        return target.getFactory().Code().createInvocation(target, ref, new ArrayList<CtExpression<?>>());
    }

    private CtExecutableReference<Boolean> createIsEmptyMethod(Factory factory) {
        CtExecutableReference<Boolean> ref = factory.createExecutableReference();
        ref.setSimpleName("isEmpty");
        ref.setType(factory.Type().booleanType());
        ref.setDeclaringType(factory.createCtTypeReference(String.class));
        return ref;
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(badSmell);
    }
}
