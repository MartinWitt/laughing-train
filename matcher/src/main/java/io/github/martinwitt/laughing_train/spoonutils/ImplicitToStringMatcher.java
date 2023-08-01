package io.github.martinwitt.laughing_train.spoonutils;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Formatter;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Filter;

/**
 * This matcher checks if a given {@link CtInvocation} has an implicit toString call.
 * This is the case if the invocation is a call to one of the following methods:
 * <ul>
 *    <li>{@link String#valueOf(Object)}</li>
 *   <li>{@link StringBuilder#append(Object)}</li>
 *  <li>{@link StringBuffer#append(Object)}</li>
 * <li>{@link PrintStream#print(Object)}</li>
 * <li>{@link PrintStream#println(Object)}</li>
 * <li>{@link PrintWriter#print(Object)}</li>
 * <li>{@link PrintWriter#println(Object)}</li>
 * <li>{@link Formatter#format(String, Object...)}</li>
 * </ul>
 * In this example for {code obj} of type {@link Object}:<br>
 * {@code System.out.println("Object: " + obj);}
 * <br>
 * A call to {@link Object#toString()} is implicitly added to the code.
 */
public class ImplicitToStringMatcher implements Filter<CtInvocation<?>> {

    @Override
    public boolean matches(CtInvocation<?> method) {
        CtExecutableReference<?> executable = method.getExecutable();
        if (executable == null) {
            return false;
        }
        CtTypeReference<?> declaringType = executable.getDeclaringType();
        if (declaringType == null) {
            return false;
        }
        String qualifiedName = declaringType.getQualifiedName();
        if (qualifiedName == null) {
            return false;
        }
        return switch (executable.getSimpleName()) {
            case "valueOf" -> valueOfMethod(method, qualifiedName);
            case "append" -> appendMethod(method, qualifiedName);
            case "print", "println" -> printMethod(method, qualifiedName);
                // we dont handle printf here
            default -> false;
        };
    }

    /**
     * Checks if the specified {@link CtInvocation} object is a call to one of the following methods:
     * <ul>
     *  <li>{@link StringBuilder#append(Object)}</li>
     * <li>{@link StringBuffer#append(Object)}</li>
     * </ul>
     * @param element  the {@link CtInvocation} object to check
     * @param qualifiedName  the qualified name of the declaring type of the method
     * @return  true if the specified {@link CtInvocation} object is a call to one of the methods above, false otherwise
     */
    private boolean appendMethod(CtInvocation<?> element, String qualifiedName) {
        return (qualifiedName.equals("java.lang.StringBuilder") || qualifiedName.equals("java.lang.StringBuffer"))
                && element.getArguments().size() == 1;
    }

    /**
     * Checks if the specified {@link CtInvocation} object is a call to the method {@link String#valueOf(Object)}.
     * @param element  the {@link CtInvocation} object to check
     * @param qualifiedName  the qualified name of the declaring type of the method
     * @return true if the specified {@link CtInvocation} object is a call to the method above, false otherwise
     */
    private boolean valueOfMethod(CtInvocation<?> element, String qualifiedName) {
        return qualifiedName.equals("java.lang.String")
                && element.getArguments().size() == 1;
    }

    /**
     * Checks if the specified {@link CtInvocation} object is a call to one of the following methods:
     * <ul>
     *    <li>{@link PrintStream#print(Object)}</li>
     *  <li>{@link PrintStream#println(Object)}</li>
     * <li>{@link PrintWriter#print(Object)}</li>
     * <li>{@link PrintWriter#println(Object)}</li>
     * <li>{@link Formatter#format(String, Object...)}</li>
     * </ul>
     * @param element the {@link CtInvocation} object to check
     * @param qualifiedName  the qualified name of the declaring type of the method
     * @return  true if the specified {@link CtInvocation} object is a call to one of the methods above, false otherwise
     */
    private boolean printMethod(CtInvocation<?> element, String qualifiedName) {
        CtTypeReference<?> type = element.getExecutable().getDeclaringType();
        if (type == null) {
            return false;
        }
        CtTypeReference<PrintStream> printStreamRef =
                type.getFactory().createReference(PrintStream.class.getCanonicalName());
        CtTypeReference<PrintWriter> printWriterRef =
                type.getFactory().createReference(PrintWriter.class.getCanonicalName());
        return type.isSubtypeOf(printStreamRef)
                || type.isSubtypeOf(printWriterRef)
                || qualifiedName.equals(Formatter.class.getCanonicalName());
    }
}
