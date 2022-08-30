package xyz.keksdose.spoon.code_solver.transformations.qodana;

import java.util.List;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.Link;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.util.Nullsafe;

public class ArraysToString extends TransformationProcessor<CtInvocation<?>> {

    private static final BadSmell BAD_SMELL = new BadSmell() {
        @Override
        public MarkdownString getDescription() {
            String rawText =
                    "array.toString() is not the best way to print an array. Use Arrays.toString(array) instead.";
            String markdownText =
                    "`array.toString()` is not the best way to print an array. Use `Arrays.toString(array)` instead.";
            return MarkdownString.fromMarkdown(rawText, markdownText);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("ArraysToString");
        }

        @Override
        public List<Link> getLinks() {
            return List.of(new Link("https://rules.sonarsource.com/java/RSPEC-2116"));
        }
    };

    public ArraysToString(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtInvocation<?> invocation) {
        if (isToString(invocation) && isArrayTarget(invocation)) {
            replaceToStringCall(invocation);
            adjustImports(invocation);
            notifyChangeListener(invocation);
        }
    }

    private void replaceToStringCall(CtInvocation<?> invocation) {
        CtTypeReference<?> arraysType = getFactory().createSimplyQualifiedReference("java.util.Arrays");
        CtTypeReference<String> stringType = getFactory().Type().stringType();
        CtArrayTypeReference<?> objectArray =
                getFactory().createArrayReference(getFactory().Type().objectType(), 1);
        var arraysToString =
                getFactory().Executable().createReference(arraysType, true, stringType, "toString", objectArray);
        CtInvocation<?> replacement = getFactory()
                .Code()
                .createInvocation(getFactory().createTypeAccess(arraysType), arraysToString, invocation.getTarget());
        invocation.replace(replacement);
    }

    private void adjustImports(CtInvocation<?> invocation) {
        ImportHelper.addImport(
                "java.util.Arrays", false, invocation.getPosition().getCompilationUnit());
    }

    private void notifyChangeListener(CtInvocation<?> invocation) {
        String rawText = "Replaced %s.toString() with Arrays.toString(%s).";
        String markdownText = "Replaced `%s.toString()` with `Arrays.toString(%s)`.";
        MarkdownString message = MarkdownString.fromMarkdown(
                String.format(rawText, invocation.getTarget(), invocation.getTarget()),
                String.format(markdownText, invocation.getTarget(), invocation.getTarget()));
        setChanged(
                invocation.getParent(CtType.class), new Change(BAD_SMELL, message, invocation.getParent(CtType.class)));
    }

    private boolean isToString(CtInvocation<?> invocation) {
        return invocation.getExecutable().getSimpleName().equals("toString");
    }

    private boolean isArrayTarget(CtInvocation<?> invocation) {
        return Nullsafe.get(
                () -> invocation.getTarget() != null
                        && invocation.getTarget().getType().isArray(),
                false);
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(BAD_SMELL);
    }
}
