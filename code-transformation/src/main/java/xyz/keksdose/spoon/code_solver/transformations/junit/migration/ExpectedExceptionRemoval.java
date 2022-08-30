package xyz.keksdose.spoon.code_solver.transformations.junit.migration;

import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldRead;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.ImportHelper;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;
import xyz.keksdose.spoon.code_solver.transformations.junit.JunitHelper;

public class ExpectedExceptionRemoval extends TransformationProcessor<CtMethod<?>> {

    private static final String CHANGE_TEXT_RAW = "Removed expected annotation from test method %s";
    private static final String CHANGE_TEXT_MARKDOWN = "Removed expected annotation from test method `%s`";
    private static final BadSmell EXPECTED_EXCEPTION_BADSMELL = new BadSmell() {

        @Override
        public MarkdownString getDescription() {
            String rawText =
                    "The expected annotation value should be removed from test methods, and replaced with JUnit 5 assertThrows.";
            String markdownText =
                    "The expected annotation value should be removed from test methods, and replaced with JUnit 5 `assertThrows`.";
            return MarkdownString.fromMarkdown(rawText, markdownText);
        }

        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("ExpectedException");
        }
    };

    public ExpectedExceptionRemoval(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtMethod<?> method) {
        Optional<CtAnnotation<?>> testAnnotation = JunitHelper.getJunit4TestAnnotation(method);
        if (JunitHelper.isJunit4TestMethod(method) && testAnnotation.isPresent()) {
            CtExpression<?> value = testAnnotation.get().getValue("expected");
            if (value != null && !isNoneType(value)) {
                if (value instanceof CtFieldRead) {
                    ((CtFieldRead<?>) value).setTarget(null);
                }
                var assertThrows = createAssertThrows(value, method.getBody());
                method.setBody(assertThrows);
                CtCompilationUnit compilationUnit = method.getPosition().getCompilationUnit();
                removeExpectedValue(testAnnotation.get());
                ImportHelper.addImport("org.junit.jupiter.api.Assertions.assertThrows", true, compilationUnit);
                setChanged(
                        method.getParent(CtType.class),
                        new Change(
                                EXPECTED_EXCEPTION_BADSMELL,
                                MarkdownString.fromMarkdown(
                                        String.format(CHANGE_TEXT_RAW, method.getSimpleName()),
                                        String.format(CHANGE_TEXT_MARKDOWN, method.getSimpleName())),
                                method.getParent(CtType.class)));
            }
        }
    }

    private boolean isNoneType(CtExpression<?> value) {
        if (value instanceof CtFieldRead) {
            CtFieldRead<?> fieldRead = (CtFieldRead<?>) value;
            return fieldRead.getVariable().getDeclaringType().getSimpleName().equals("None");
        }
        return false;
    }

    private void removeExpectedValue(CtAnnotation<?> testAnnotation) {
        testAnnotation.setValues(testAnnotation.getValues().entrySet().stream()
                .filter(v -> !v.getKey().equals("expected"))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue)));
    }

    private CtInvocation<?> createAssertThrows(CtExpression<?> exceptionClass, CtStatement body) {
        CtTypeReference<?> typeRef = getFactory().Type().createReference("org.junit.jupiter.api.Assertions");
        CtTypeReference<?> clazzRef = getFactory().Type().createReference("java.lang.Class");
        CtTypeReference<?> executableJunit =
                getFactory().Type().createReference("org.junit.jupiter.api.function.Executable");
        CtExecutableReference<?> assertThrows = getFactory()
                .Executable()
                .createReference(
                        typeRef, getFactory().Type().voidType(), "assertThrows", List.of(clazzRef, executableJunit));
        CtLambda<?> lambda = getFactory().createLambda();
        lambda.setType((CtTypeReference) getFactory().Type().voidType());
        lambda.setBody(body);
        return getFactory().createInvocation(null, assertThrows, List.of(exceptionClass, lambda));
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(EXPECTED_EXCEPTION_BADSMELL);
    }
}
