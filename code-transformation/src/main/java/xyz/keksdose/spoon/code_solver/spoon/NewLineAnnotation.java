package xyz.keksdose.spoon.code_solver.spoon;

import java.lang.annotation.Annotation;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.declaration.CtAnnotationImpl;

/**
 * This defines a newline annotation. Insert this annotation if you want to insert a newline after all annotations.
 */
public class NewLineAnnotation<A extends Annotation> extends CtAnnotationImpl<A> {
    public NewLineAnnotation() {
        super();
    }

    @Override
    public CtTypeReference<A> getType() {
        return generateType();
    }

    private CtTypeReference<A> generateType() {
        return (CtTypeReference)
                getFactory().Type().createReference(this.getClass().getCanonicalName());
    }

    @Override
    public CtTypeReference<A> getAnnotationType() {
        return generateType();
    }

    @Override
    public boolean isImplicit() {
        return true;
    }
}
