
package xyz.keksdose.spoon.code_solver.transformations.junit;

import java.util.Optional;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;

public class JunitHelper {

	public static boolean isJunit4TestAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.Test");
	}

	public static boolean isJunit5TestAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.jupiter.api.Test");
	}

	public static boolean hasExpectedValue(CtAnnotation<?> annotation) {
		return annotation.getValues().get("expected") != null;
	}

	public static boolean hasTimeoutValue(CtAnnotation<?> annotation) {
		return annotation.getValues().get("timeout") != null;
	}

	public static CtAnnotation<?> createTimeoutAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.Timeout"));
	}

	public static boolean isJunit5TestMethod(CtMethod<?> method) {
		return method.getAnnotations().stream().anyMatch(JunitHelper::isJunit5TestAnnotation);
	}

	public static boolean isJunit4TestMethod(CtMethod<?> method) {
		return method.getAnnotations().stream().anyMatch(JunitHelper::isJunit4TestAnnotation);
	}

	public static Optional<CtAnnotation<?>> getJunit4TestAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4TestAnnotation).findFirst();
	}

	public static Optional<CtAnnotation<?>> getJunit5TestAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit5TestAnnotation).findFirst();
	}

	public static boolean isJunit4BeforeAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.Before");
	}

	public static boolean isJunit4AfterAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.After");
	}

	public static boolean isJunit4BeforeClassAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.BeforeClass");
	}

	public static boolean isJunit4AfterClassAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.AfterClass");
	}

	public static Optional<CtAnnotation<?>> getJunit4BeforeAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4BeforeAnnotation).findFirst();
	}

	public static Optional<CtAnnotation<?>> getJunit4AfterAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4AfterAnnotation).findFirst();
	}

	public static Optional<CtAnnotation<?>> getJunit4BeforeClassAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4BeforeClassAnnotation).findFirst();
	}

	public static Optional<CtAnnotation<?>> getJunit4AfterClassAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4AfterClassAnnotation).findFirst();
	}

	public static CtAnnotation<?> createBeforeEachAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.BeforeEach"));
	}

	public static CtAnnotation<?> createAfterEachAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.AfterEach"));
	}

	public static CtAnnotation<?> createBeforeAllAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.BeforeAll"));
	}

	public static CtAnnotation<?> createAfterAllAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.AfterAll"));
	}

	public static boolean isJunit4IgnoreAnnotation(CtAnnotation<?> annotation) {
		return annotation.getAnnotationType().getQualifiedName().equals("org.junit.Ignore");
	}

	public static Optional<CtAnnotation<?>> getIgnoreAnnotation(CtMethod<?> method) {
		return method.getAnnotations().stream().filter(JunitHelper::isJunit4IgnoreAnnotation).findFirst();
	}

	public static CtAnnotation<?> createDisableAnnotation(Factory factory) {
		return factory.createAnnotation(factory.createReference("org.junit.jupiter.api.Disabled"));
	}

	public static boolean isJunit5AssertTrue(CtExecutableReference<?> executable) {
		if (executable != null && executable.getDeclaringType() != null) {
			return executable.getDeclaringType().getQualifiedName().equals("org.junit.jupiter.api.Assertions")
					&& executable.getSimpleName().equals("assertTrue");
		}
		return false;
	}
}
