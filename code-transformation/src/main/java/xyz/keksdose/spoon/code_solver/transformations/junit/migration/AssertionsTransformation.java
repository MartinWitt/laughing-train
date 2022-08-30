package xyz.keksdose.spoon.code_solver.transformations.junit.migration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import spoon.experimental.CtUnresolvedImport;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeMemberWildcardImportReference;
import spoon.reflect.visitor.CtAbstractImportVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.util.ModelList;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class AssertionsTransformation extends TransformationProcessor<CtMethod<?>> {

    private static final BadSmell JUNIT4_ASSERTION = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("JUnit4Assertion");
        }

        @Override
        public MarkdownString getDescription() {
            String rawText = "The JUnit4 assertion should be replaced with JUnit5 Assertions.";
            String markdownText = "The JUnit4 assertion should be replaced with JUnit5 Assertions.";
            return MarkdownString.fromMarkdown(rawText, markdownText);
        }
    };

    public AssertionsTransformation(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtMethod<?> method) {
        List<CtInvocation<?>> junit4Asserts = getJunit4Asserts(method);
        if (!junit4Asserts.isEmpty()) {
            adjustImports(method);
            convertToJunit5(junit4Asserts);
            notifyChangeListener(method);
        }
    }

    private void notifyChangeListener(CtMethod<?> method) {
        CtType<?> declaringType = method.getDeclaringType();
        setChanged(declaringType, new Change(JUNIT4_ASSERTION, createChangeHistory(method), declaringType));
    }

    private MarkdownString createChangeHistory(CtMethod<?> method) {
        return MarkdownString.fromMarkdown(
                String.format("Transformed junit4 assert to junit 5 assertion in %s", method.getSimpleName()),
                String.format("Transformed junit4 assert to junit 5 assertion in `%s`", method.getSimpleName()));
    }

    private void convertToJunit5(List<CtInvocation<?>> junit4Asserts) {
        for (CtInvocation<?> junit4Assert : junit4Asserts) {
            junit4Assert.setTarget(null);
            junit4Assert
                    .getExecutable()
                    .setDeclaringType(getFactory().Type().createReference("org.junit.jupiter.api.Assertions"));
            List<CtExpression<?>> parameters = junit4Assert.getArguments();
            if (parameters.size() == 3) {
                if (parameters.get(0).getType().getSimpleName().equals("String")) {
                    List<CtExpression<?>> newParameters = new ArrayList<>();
                    newParameters.add(parameters.get(1).clone());
                    newParameters.add(parameters.get(2).clone());
                    newParameters.add(parameters.get(0).clone());
                    junit4Assert.setArguments(newParameters);
                }
            }
            if (parameters.size() == 2 && is2ParameterAssertion(junit4Assert)) {
                if (parameters.get(0).getType().getSimpleName().equals("String")) {
                    List<CtExpression<?>> newParameters = new ArrayList<>();
                    newParameters.add(parameters.get(1).clone());
                    newParameters.add(parameters.get(0).clone());
                    junit4Assert.setArguments(newParameters);
                }
            }
        }
    }

    private boolean is2ParameterAssertion(CtInvocation<?> junit4Assert) {
        String simpleName = junit4Assert.getExecutable().getSimpleName();
        return simpleName.equals("assertTrue")
                || simpleName.equals("assertFalse")
                || simpleName.equals("assertNull")
                || simpleName.equals("assertNotNull");
    }

    private List<CtInvocation<?>> getJunit4Asserts(CtMethod<?> method) {
        return method.getElements(new TypeFilter<CtInvocation<?>>(CtInvocation.class)).stream()
                .filter(v -> v.getTarget() instanceof CtTypeAccess)
                .filter(v -> v.getTarget().getType() != null)
                .filter(v -> ((CtTypeAccess<?>) v.getTarget()).getAccessedType() != null)
                .filter(v -> ((CtTypeAccess<?>) v.getTarget())
                        .getAccessedType()
                        .getSimpleName()
                        .equals("Assert"))
                .filter(v -> !v.getExecutable().getSimpleName().equals("assertThat"))
                .collect(Collectors.toList());
    }

    private void adjustImports(CtMethod<?> method) {
        List<CtImport> imports = new ArrayList<>(getImports(method));
        Collection<CtImport> newImports = new HashSet<>();
        List<CtReference> references = new ArrayList<>();

        getImports(method)
                .forEach(v -> v.accept(new CtAbstractImportVisitor() {
                    @Override
                    public <T> void visitUnresolvedImport(CtUnresolvedImport ctUnresolvedImport) {
                        if (ctUnresolvedImport.getUnresolvedReference().startsWith("org.junit.Assert.")) {
                            imports.remove(ctUnresolvedImport);
                            if (!ctUnresolvedImport.getUnresolvedReference().endsWith("assertThat")) {
                                newImports.add(getFactory()
                                        .createUnresolvedImport(
                                                ctUnresolvedImport
                                                        .getUnresolvedReference()
                                                        .replace(
                                                                "org.junit.Assert.",
                                                                "org.junit.jupiter.api.Assertions."),
                                                true));
                            }
                        }
                    }

                    @Override
                    public <T> void visitMethodImport(CtExecutableReference<T> executableReference) {
                        if (executableReference
                                .getDeclaringType()
                                .getQualifiedName()
                                .equals("org.junit.Assert")) {
                            references.add(executableReference);
                            if (!executableReference.getSimpleName().equals("assertThat")) {
                                newImports.add(getFactory()
                                        .createUnresolvedImport(
                                                "org.junit.jupiter.api.Assertions."
                                                        + executableReference.getSimpleName(),
                                                true));
                            }
                        }
                    }

                    @Override
                    public <T> void visitAllStaticMembersImport(CtTypeMemberWildcardImportReference typeReference) {
                        if (typeReference.getDeclaration() != null
                                && typeReference
                                        .getDeclaration()
                                        .getQualifiedName()
                                        .equals("org.junit.Assert")) {
                            // someone really imported org.junit.Assert.*
                            references.add(typeReference);
                            method
                                    .getDeclaringType()
                                    .getTopLevelType()
                                    .getElements(new TypeFilter<>(CtInvocation.class))
                                    .stream()
                                    .filter(v -> v.getExecutable() != null)
                                    .filter(v -> v.getExecutable().getDeclaringType() != null)
                                    .filter(v -> v.getExecutable()
                                            .getDeclaringType()
                                            .getQualifiedName()
                                            .equals("org.junit.Assert"))
                                    .filter(v ->
                                            !v.getExecutable().getSimpleName().equals("assertThat"))
                                    .forEach(v -> newImports.add(getFactory()
                                            .createUnresolvedImport(
                                                    "org.junit.jupiter.api.Assertions."
                                                            + v.getExecutable().getSimpleName(),
                                                    true)));
                        }
                    }
                }));
        imports.removeIf(v -> references.contains(v.getReference()));
        imports.addAll(newImports);
        newImports.stream().filter(v -> !imports.contains(v)).forEach(imports::add);
        var filteredImports = new ArrayList<>(imports);
        getImports(method).clear();
        getImports(method).set(filteredImports);
    }

    private ModelList<CtImport> getImports(CtMethod<?> method) {
        return method.getPosition().getCompilationUnit().getImports();
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(JUNIT4_ASSERTION);
    }
}
