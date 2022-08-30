package xyz.keksdose.spoon.code_solver.transformations.junit.simplification;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.VariableAccessFilter;
import xyz.keksdose.spoon.code_solver.history.Change;
import xyz.keksdose.spoon.code_solver.history.ChangeListener;
import xyz.keksdose.spoon.code_solver.history.MarkdownString;
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;
import xyz.keksdose.spoon.code_solver.transformations.TransformationProcessor;

public class TempoaryFolderAsParameter extends TransformationProcessor<CtType<?>> {

    private static final BadSmell BAD_SMELL = new BadSmell() {
        @Override
        public MarkdownString getName() {
            return MarkdownString.fromRaw("TempoaryFolderAsParameter");
        }

        @Override
        public MarkdownString getDescription() {
            String raw = "@TempDir can be used as a method parameter removing fields from test classes";
            String markdown = "`@TempDir` can be used as a method parameter removing fields from test classes";
            return MarkdownString.fromMarkdown(raw, markdown);
        }
    };

    public TempoaryFolderAsParameter(ChangeListener listener) {
        super(listener);
    }

    @Override
    public void process(CtType<?> type) {
        List<CtField<?>> tempoaryFolder = getFieldsWithTempoaryFolderAnnotation(type);
        for (CtField<?> ctField : tempoaryFolder) {
            if (ctField.isStatic() || ctField.getDefaultExpression() != null) {
                // static fields cant be transformed to method parameters
                // fields with default values cant be transformed to method parameters
                continue;
            }
            for (CtMethod<?> method : type.getMethods()) {
                if (methodUsesField(ctField, method)) {
                    // method uses the field
                    CtParameter<?> parameter = createParameter(ctField);
                    method.addParameter(parameter);
                }
            }
            type.removeField(ctField);
            notifyChangeListener(type);
        }
    }

    private void notifyChangeListener(CtType<?> type) {
        String raw = "Refactored @TempDir to method parameter in type %s";
        String markdown = "Refactored `@TempDir` to method parameter in type `%s`";
        setChanged(
                type,
                new Change(
                        BAD_SMELL,
                        MarkdownString.fromMarkdown(
                                String.format(raw, type.getSimpleName()),
                                String.format(markdown, type.getSimpleName())),
                        type));
    }

    private CtParameter<?> createParameter(CtField<?> ctField) {
        CtParameter<?> parameter =
                ctField.getFactory().createParameter(null, ctField.getType(), ctField.getSimpleName());
        // we clone here to remove the source fragement from the annotation.
        // This removes the newline after the annotation.
        parameter.addAnnotation(
                getFactory().createAnnotation(getFactory().createReference("org.junit.jupiter.api.io.TempDir")));
        return parameter;
    }

    private boolean methodUsesField(CtField<?> ctField, CtMethod<?> method) {
        return !method.getElements(new VariableAccessFilter<>(ctField.getReference()))
                .isEmpty();
    }

    private List<CtField<?>> getFieldsWithTempoaryFolderAnnotation(CtType<?> element) {
        return element.getFields().stream()
                .filter(this::hasTempoaryFolderAnnotation)
                .collect(Collectors.toList());
    }

    private boolean hasTempoaryFolderAnnotation(CtField<?> v) {
        return v.getAnnotations().stream().anyMatch(this::isTempoaryFolderAnnotation);
    }

    private boolean isTempoaryFolderAnnotation(CtAnnotation<? extends Annotation> v1) {
        return v1.getType().getSimpleName().equals("TempDir");
    }

    @Override
    public List<BadSmell> getHandledBadSmells() {
        return List.of(BAD_SMELL);
    }
}
