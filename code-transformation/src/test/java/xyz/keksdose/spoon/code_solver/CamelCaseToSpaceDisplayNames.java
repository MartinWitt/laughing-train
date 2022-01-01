
package xyz.keksdose.spoon.code_solver;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.google.common.base.CaseFormat;

import org.junit.jupiter.api.DisplayNameGenerator;

public class CamelCaseToSpaceDisplayNames extends DisplayNameGenerator.Standard {

	@Override
	public String generateDisplayNameForClass(Class<?> testClass) {
		return super.generateDisplayNameForClass(testClass).replaceAll("([a-z])([A-Z])", "$1 $2");
	}

	@Override
	public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
		return super.generateDisplayNameForNestedClass(nestedClass).replaceAll("([a-z])([A-Z])", "$1 $2");
	}

	@Override
	public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
		String lowerHypen = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, testMethod.getName());
		return Arrays.stream(lowerHypen.split("-")).map(String::toLowerCase).collect(Collectors.joining(" "));
	}

}
