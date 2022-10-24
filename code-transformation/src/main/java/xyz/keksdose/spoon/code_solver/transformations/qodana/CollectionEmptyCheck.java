package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class CollectionEmptyCheck extends TransformationProcessor<CtBinaryOperator<?>> {

    private static final BadSmell COLLECTION_EMPTY_CHECK = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            return MarkdownString.fromMarkdown(
                    "Checking if a collection is empty should be done by Collection.isEmpty().",
                    "Checking if a collection is empty should be done by `Collection.isEmpty()`.");
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("CollectionEmptyCheck");
        }
    };

    public CollectionEmptyCheck(ChangeListener listener) {
        super(listener);
    }

    public boolean isApplicable(CtBinaryOperator<?> element) {
        return leftHandIsSizeCheck(element)
                && element.getKind().equals(BinaryOperatorKind.EQ)
                && element.getRightHandOperand().toString().equals("0");
    }

    private boolean leftHandIsSizeCheck(CtBinaryOperator<?> element) {
        CtExpression<?> leftHand = element.getLeftHandOperand();
        List<CtInvocation<?>> innvocation = getRightMostInvocation(leftHand);
        if (innvocation.isEmpty()) {
            return false;
        }
        CtInvocation<?> invocation = innvocation.get(innvocation.size() - 1);
        return isCollectionTarget(invocation) && isSizeMethod(invocation);
    }

    private List<CtInvocation<?>> getRightMostInvocation(CtExpression<?> leftHand) {
        List<CtInvocation<?>> innvocation = leftHand.getElements(new TypeFilter<>(CtInvocation.class));
        innvocation.stream()
                .filter(outer -> innvocation.stream().anyMatch(outer::hasParent))
                .collect(Collectors.toList())
                .forEach(innvocation::remove);
        return innvocation;
    }

    private boolean isSizeMethod(CtInvocation<?> invocation) {
        return invocation.getExecutable().getSimpleName().equals("size")
                && invocation.getArguments().isEmpty();
    }

    private boolean isCollectionTarget(CtInvocation<?> invocation) {
        return invocation.getTarget() != null
                && invocation
                        .getTarget()
                        .getType()
                        .isSubtypeOf(getFactory().Type().createReference(Collection.class));
    }

    public void process(CtBinaryOperator<?> element) {
        if (isApplicable(element)) {
            CtInvocation<Boolean> innvocation = createIsEmptyInvocation(element);
            notifyChangeListener(element, innvocation);
            element.replace(innvocation);
        }
    }

    private void notifyChangeListener(CtBinaryOperator<?> element, CtInvocation<Boolean> innvocation) {
        CtType<?> parent = element.getParent(CtType.class).getTopLevelType();
        String raw = "Replaced " + element + " with " + innvocation.toString();
        String markdown = "Replaced `" + element + "` with `" + innvocation  + "`";
        setChanged(parent, new Change(COLLECTION_EMPTY_CHECK, MarkdownString.fromMarkdown(raw, markdown), parent));
    }

    private CtInvocation<Boolean> createIsEmptyInvocation(CtBinaryOperator<?> element) {
        CtExecutableReference<Boolean> ref = createIsEmptyMethod();
        return getFactory()
                .Code()
                .createInvocation(
                        element.getElements(new TypeFilter<>(CtInvocation.class))
                                .get(0)
                                .getTarget(),
                        ref,
                        new ArrayList<CtExpression<?>>());
    }

    private CtExecutableReference<Boolean> createIsEmptyMethod() {
        CtExecutableReference<Boolean> ref = getFactory().createExecutableReference();
        ref.setSimpleName("isEmpty");
        ref.setType(getFactory().Type().booleanType());
        ref.setDeclaringType(getFactory().createCtTypeReference(Collection.class));
        return ref;
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(COLLECTION_EMPTY_CHECK);
    }
}
