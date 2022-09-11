# junit-pioneer/junit-pioneer# Bad smells
I found 75 bad smells with 38 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MethodMayBeStatic | 36 | true |
| UnnecessaryFullyQualifiedName | 17 | false |
| UnstableApiUsage | 11 | false |
| SystemOutErr | 3 | false |
| AssignmentToMethodParameter | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| RedundantMethodOverride | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| DeprecatedIsStillUsed | 1 | false |
| RedundantSuppression | 1 | false |
## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'type'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
	}

	private static <A extends Annotation> Stream<A> findOnOuterClasses(Optional<Class<?>> type, Class<A> annotationType,
			boolean findRepeated, boolean findAllEnclosing) {
		if (!type.isPresent())
```

## NonStrictComparisonCanBeEquality
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
			Class<?>[] parameterTypes = method.getParameterTypes();

			if (parameterTypes.length <= 0)
				throw new PreconditionViolationException(
					"Test method must declare at least one parameter: " + method.toGenericString());
```

## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `factoryMethodName`
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	private String getFactoryMethodName(String factoryMethodName) {
		if (factoryMethodName.contains("("))
			factoryMethodName = factoryMethodName.substring(0, factoryMethodName.indexOf('('));
		if (factoryMethodName.contains("#"))
			return factoryMethodName.substring(factoryMethodName.indexOf('#') + 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `methodFactoryName`
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
	private static String extractMethodFactoryName(String methodFactoryName) {
		if (methodFactoryName.contains("("))
			methodFactoryName = methodFactoryName.substring(0, methodFactoryName.indexOf('('));
		if (methodFactoryName.contains("#"))
			return methodFactoryName.substring(methodFactoryName.indexOf('#') + 1);
```

## SystemOutErr
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java

	private void storeStdErr(ExtensionContext context) {
		context.getStore(NAMESPACE).put(SYSTEM_ERR_KEY, System.err); //NOSONAR never writing to System.err, only storing it
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java

	private void storeStdOut(ExtensionContext context) {
		context.getStore(NAMESPACE).put(SYSTEM_OUT_KEY, System.out); //NOSONAR never writing to System.out, only storing it
	}

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableExtension.java`
#### Snippet
```java
		// System.out seemed like a good compromise.
		context.publishReportEntry(WARNING_KEY, WARNING_VALUE);
		System.out.println(WARNING_KEY + ": " + WARNING_VALUE); //NOSONAR
	}

```

## RedundantMethodOverride
### RedundantMethodOverride
Method `read()` only delegates to its super method
in `src/main/java/org/junitpioneer/jupiter/StdIn.java`
#### Snippet
```java

	@Override
	public int read(byte[] b, int off, int len) throws IOException { // NOSONAR - this is fine for a simple testing extension
		return super.read(b, off, len);
	}
```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/RetryingTest.java`
#### Snippet
```java
	 * <p>Supported placeholders:<p>
	 *
	 * - {@link org.junitpioneer.jupiter.RetryingTest#DISPLAY_NAME_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.RetryingTest#INDEX_PLACEHOLDER}
	 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/RetryingTest.java`
#### Snippet
```java
	 *
	 * - {@link org.junitpioneer.jupiter.RetryingTest#DISPLAY_NAME_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.RetryingTest#INDEX_PLACEHOLDER}
	 *
	 * <p>You may use {@link java.text.MessageFormat} patterns
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
 * <a href="https://junit-pioneer.org/docs/cartesian-product/" target="_top">the documentation on <code>@CartesianProductTest</code></a>.
 * </p>
 * @see org.junitpioneer.jupiter.CartesianValueSource
 *
 * @deprecated has been superseded by CartesianTest, scheduled to be removed in 2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.stream` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
		 * Creates a single set of distinct objects (according to
		 * {@link Object#equals(Object)}) for a CartesianProductTest
		 * from the elements of the passed {@link java.util.stream.Stream}.
		 *
		 * @param entries the objects we want to include in a single set
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
		 * Creates a single set of distinct objects (according to
		 * {@link Object#equals(Object)}) for a CartesianProductTest
		 * from the elements of the passed {@link java.util.Collection}.
		 *
		 * The passed argument does not have to be an instance of {@link java.util.Set}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfDisplayName.java`
#### Snippet
```java
	/**
	 * Disable test cases whose display name matches the specified regular expression
	 * (according to {@link String#matches(java.lang.String)}).
	 *
	 * @return test case display name regular expressions
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
	 * found or the top level class is reached.
	 *
	 * <p>The algorithm does not search for methods in {@link java.lang.Object}.
	 *
	 * @param clazz the class or interface in which to find the method; never {@code null}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.stream` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/cartesian/ArgumentSets.java`
#### Snippet
```java
	 * {@link Object#equals(Object) equals}) for the first parameter of
	 * a {@code CartesianTest} from the elements of the passed
	 * {@link java.util.stream.Stream Stream}.
	 *
	 * @param arguments the objects that should be passed to the parameter
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/cartesian/ArgumentSets.java`
#### Snippet
```java
	 * {@link Object#equals(Object) equals}) for the first parameter of
	 * a {@code CartesianTest} from the elements of the passed
	 * {@link java.util.Collection Collection}.
	 * <p>
	 * The passed argument does not have to be an instance of {@link java.util.Set Set}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary, and can be replaced with an import
in `src/main/java/org/junitpioneer/jupiter/params/RangeSourceArgumentsProvider.java`
#### Snippet
```java
@SuppressWarnings("deprecation")
class RangeSourceArgumentsProvider<N extends Number & Comparable<N>> implements ArgumentsProvider,
		org.junitpioneer.jupiter.CartesianAnnotationConsumer<Annotation>, CartesianParameterArgumentsProvider<N> { //NOSONAR deprecated interface use will be removed in later release

	// Once the CartesianAnnotationConsumer is removed we can make this provider stateless.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/ReportEntry.java`
#### Snippet
```java
	/**
	 * Specifies when the extension should publish the report entry.
	 * Defaults to {@link org.junitpioneer.jupiter.ReportEntry.PublishCondition#ALWAYS ALWAYS}.
	 * @see PublishCondition
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/IssueTestSuite.java`
#### Snippet
```java

/**
 * Represents the execution result of test method, which is annotated with {@link org.junitpioneer.jupiter.Issue}.
 *
 * Once Pioneer baselines against Java 17, this will be a record.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/IssueTestSuite.java`
#### Snippet
```java
	 * Constructor with all attributes.
	 *
	 * @param issueId Value of the {@link org.junitpioneer.jupiter.Issue} annotation
	 * @param tests List of all tests, annotated with the issueId
	 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/IssueTestSuite.java`
#### Snippet
```java

	/**
	 * Returns the value of the {@link org.junitpioneer.jupiter.Issue} annotation.
	 *
	 * @return IssueId the test belongs to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter.cartesian` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
	 * Supported placeholders:
	 * <p>
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#DISPLAY_NAME_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#INDEX_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#ARGUMENTS_PLACEHOLDER}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter.cartesian` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
	 * <p>
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#DISPLAY_NAME_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#INDEX_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#ARGUMENTS_PLACEHOLDER}
	 * - <code>{0}</code>, <code>{1}</code>, etc.: an individual argument (0-based)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.junitpioneer.jupiter.cartesian` is unnecessary and can be removed
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#DISPLAY_NAME_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#INDEX_PLACEHOLDER}
	 * - {@link org.junitpioneer.jupiter.cartesian.CartesianTest#ARGUMENTS_PLACEHOLDER}
	 * - <code>{0}</code>, <code>{1}</code>, etc.: an individual argument (0-based)
	 *
```

## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `StdOutputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/junitpioneer/jupiter/StdOutputStream.java`
#### Snippet
```java
	private final StringWriter writer = new StringWriter();

	public StdOutputStream() {
		// recreate default constructor to prevent compiler warning
	}
```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'CartesianAnnotationConsumer' is still used
in `src/main/java/org/junitpioneer/jupiter/CartesianAnnotationConsumer.java`
#### Snippet
```java
 */
@Deprecated
public interface CartesianAnnotationConsumer<A extends Annotation> extends Consumer<A> {
}

```

## RedundantSuppression
### RedundantSuppression
Redundant suppression
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianArgumentsSource.java`
#### Snippet
```java
	 */
	@SuppressWarnings("rawtypes")
	Class<? extends CartesianArgumentsProvider> value();

}
```

## UnstableApiUsage
### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
	testing {
		suites {
			val test by getting(JvmTestSuite::class) {
				useJUnitJupiter()
			}
```

### UnstableApiUsage
'useJUnitJupiter()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
		suites {
			val test by getting(JvmTestSuite::class) {
				useJUnitJupiter()
			}
			val demoTests by registering(JvmTestSuite::class) {
```

### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
				useJUnitJupiter()
			}
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project)
```

### UnstableApiUsage
'dependencies(org.gradle.api.Action)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			}
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project)
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project)
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
					implementation("org.assertj:assertj-core:3.22.0")
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
				dependencies {
					implementation(project)
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
					implementation("org.assertj:assertj-core:3.22.0")
				}
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
					implementation(project)
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
					implementation("org.assertj:assertj-core:3.22.0")
				}

```

### UnstableApiUsage
'sources(org.gradle.api.Action)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
				}

				sources {
					java { srcDir("src/demo/java") }
					resources { srcDir("src/demo/resources") }
```

### UnstableApiUsage
'getTestTask()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuiteTarget' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
					resources { srcDir("src/demo/resources") }
				}
				targets { all { testTask.configure {
					shouldRunAfter(test)
					filter {
```

### UnstableApiUsage
'getTesting(org.gradle.api.Project)' is unstable because its signature references unstable interface 'org.gradle.testing.base.TestingExtension' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
	check {
		// to find Javadoc errors early, let "javadoc" task run during "check"
		dependsOn(javadoc, validateYaml, testing.suites.named("demoTests"))
	}

```

### UnstableApiUsage
'getSuites()' is declared in unstable interface 'org.gradle.testing.base.TestingExtension' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
	check {
		// to find Javadoc errors early, let "javadoc" task run during "check"
		dependsOn(javadoc, validateYaml, testing.suites.named("demoTests"))
	}

```

## MethodMayBeStatic
### MethodMayBeStatic
Method `loadLaunchTime()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StopwatchExtension.java`
#### Snippet
```java
	}

	private long loadLaunchTime(ExtensionContext context) {
		return context.getStore(NAMESPACE).get(context.getUniqueId(), long.class);
	}
```

### MethodMayBeStatic
Method `makeReadable()` may be 'static'
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
	}

	private Object[] makeReadable(Object[] arguments) {
		Object[] result = Arrays.copyOf(arguments, arguments.length, Object[].class);
		for (int i = 0; i < result.length; i++) {
```

### MethodMayBeStatic
Method `swapAndStoreIn()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
	}

	private void swapAndStoreIn(ExtensionContext context, StdIn stdIn) {
		context.getStore(NAMESPACE).put(SYSTEM_IN_KEY, System.in); //NOSONAR never reading from System.in, only storing it
		context.getStore(NAMESPACE).put(STD_IN_KEY, stdIn);
```

### MethodMayBeStatic
Method `storeStdErr()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
	}

	private void storeStdErr(ExtensionContext context) {
		context.getStore(NAMESPACE).put(SYSTEM_ERR_KEY, System.err); //NOSONAR never writing to System.err, only storing it
	}
```

### MethodMayBeStatic
Method `storeStdOut()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
	}

	private void storeStdOut(ExtensionContext context) {
		context.getStore(NAMESPACE).put(SYSTEM_OUT_KEY, System.out); //NOSONAR never writing to System.out, only storing it
	}
```

### MethodMayBeStatic
Method `createErr()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
	}

	private StdErr createErr() {
		StdErr err = new StdErr();
		System.setErr(new PrintStream(err));
```

### MethodMayBeStatic
Method `createOut()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
	}

	private StdOut createOut() {
		StdOut out = new StdOut();
		System.setOut(new PrintStream(out));
```

### MethodMayBeStatic
Method `proceedWithTimeout()` may be 'static'
in `src/main/java/org/junitpioneer/vintage/TimeoutExtension.java`
#### Snippet
```java
	}

	private void proceedWithTimeout(Invocation<Void> invocation, ExtensionContext extensionContext, long timeout) {
		if (timeout < 0)
			throw new ExtensionConfigurationException("Timeout for vintage @Test must be positive.");
```

### MethodMayBeStatic
Method `annotatedTimeout()` may be 'static'
in `src/main/java/org/junitpioneer/vintage/TimeoutExtension.java`
#### Snippet
```java
	// vintage @Test is deprecated (not for removal)
	@SuppressWarnings("deprecation")
	private Optional<Long> annotatedTimeout(ExtensionContext context) {
		return findAnnotation(context.getElement(), Test.class).map(Test::timeout).filter(timeout -> timeout != 0L);
	}
```

### MethodMayBeStatic
Method `getExplicitOrImplicitClass()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private Class<?> getExplicitOrImplicitClass(Method testMethod, String factoryMethodName) {
		if (factoryMethodName.contains("#")) {
			String className = factoryMethodName.substring(0, factoryMethodName.indexOf('#'));
```

### MethodMayBeStatic
Method `getFactoryMethodName()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private String getFactoryMethodName(String factoryMethodName) {
		if (factoryMethodName.contains("("))
			factoryMethodName = factoryMethodName.substring(0, factoryMethodName.indexOf('('));
```

### MethodMayBeStatic
Method `provideArguments()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	private List<Object> provideArguments(ExtensionContext context, Annotation source, ArgumentsProvider provider)
			throws Exception {
		if (provider instanceof CartesianAnnotationConsumer) {
```

### MethodMayBeStatic
Method `initializeArgumentsProvider()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private ArgumentsProvider initializeArgumentsProvider(Annotation source) {
		ArgumentsSource providerAnnotation = AnnotationSupport
				.findAnnotation(source.annotationType(), ArgumentsSource.class)
```

### MethodMayBeStatic
Method `getSetsFromValue()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private List<List<?>> getSetsFromValue(Method testMethod, CartesianProductTest annotation) {
		List<List<?>> sets = new ArrayList<>();
		List<String> strings = Arrays.stream(annotation.value()).distinct().collect(toList());
```

### MethodMayBeStatic
Method `invokeSetsFactory()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private CartesianProductTest.Sets invokeSetsFactory(Method testMethod, Method factory) {
		CartesianProductTest.Sets sets = (CartesianProductTest.Sets) invokeMethod(factory, null);
		if (sets.getSets().size() > testMethod.getParameterCount()) {
```

### MethodMayBeStatic
Method `createNameFormatter()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private TestNameFormatter createNameFormatter(ExtensionContext context) {
		CartesianProductTest annotation = findAnnotation(context.getRequiredTestMethod(), CartesianProductTest.class)
				.orElseThrow(() -> new ExtensionConfigurationException("@CartesianProductTest not found."));
```

### MethodMayBeStatic
Method `getStoreKey()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private Object getStoreKey(ExtensionContext context) {
		return context.getUniqueId();
	}
```

### MethodMayBeStatic
Method `findAnnotations()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private <A extends Annotation> Stream<A> findAnnotations(AnnotatedElement element, Class<A> clazz) {
		return AnnotationSupport.findRepeatableAnnotations(element, clazz).stream();
	}
```

### MethodMayBeStatic
Method `verifyValidIndex()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private void verifyValidIndex(List<Object> arguments, int index) {
		if (index > arguments.size())
			throw new ExtensionConfigurationException(
```

### MethodMayBeStatic
Method `findParameterIndexFromName()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private int findParameterIndexFromName(Method testMethod, String name) {
		Parameter[] parameters = testMethod.getParameters();
		for (int i = 0; i < parameters.length; i++)
```

### MethodMayBeStatic
Method `storeDefaultTimeZone()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DefaultTimeZoneExtension.java`
#### Snippet
```java
	}

	private void storeDefaultTimeZone(Store store) {
		store.put(KEY, TimeZone.getDefault());
	}
```

### MethodMayBeStatic
Method `resetDefaultTimeZone()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DefaultTimeZoneExtension.java`
#### Snippet
```java
	}

	private void resetDefaultTimeZone(Store store) {
		TimeZone timeZone = store.get(KEY, TimeZone.class);
		// default time zone is null if the extension was misconfigured and execution failed in "before"
```

### MethodMayBeStatic
Method `invokeMethodFactory()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
	}

	private ArgumentSets invokeMethodFactory(Method testMethod, Method factory, Object testInstance) {
		Object target = factory.getDeclaringClass().isInstance(testInstance) ? testInstance : null;
		ArgumentSets argumentSets = (ArgumentSets) invokeMethod(factory, target);
```

### MethodMayBeStatic
Method `parseDate()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DisabledUntilExtension.java`
#### Snippet
```java
	}

	private LocalDate parseDate(String dateString) {
		try {
			return LocalDate.parse(dateString, ISO_8601);
```

### MethodMayBeStatic
Method `evaluateUntilDate()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DisabledUntilExtension.java`
#### Snippet
```java
	}

	private ConditionEvaluationResult evaluateUntilDate(ExtensionContext context, LocalDate untilDate) {
		LocalDate today = LocalDate.now();
		boolean disabled = today.isBefore(untilDate);
```

### MethodMayBeStatic
Method `resetDefaultLocale()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DefaultLocaleExtension.java`
#### Snippet
```java
	}

	private void resetDefaultLocale(ExtensionContext context) {
		Locale defaultLocale = context.getStore(NAMESPACE).get(KEY, Locale.class);
		// default locale is null if the extension was misconfigured and execution failed in "before"
```

### MethodMayBeStatic
Method `storeDefaultLocale()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/DefaultLocaleExtension.java`
#### Snippet
```java
	}

	private void storeDefaultLocale(ExtensionContext context) {
		context.getStore(NAMESPACE).put(KEY, Locale.getDefault());
	}
```

### MethodMayBeStatic
Method `parseVariables()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
	}

	private String parseVariables(String value, ExtensionContext context) {
		if (!hasTestParameterVariables(value))
			return value;
```

### MethodMayBeStatic
Method `findAnnotations()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
	}

	private Stream<ReportEntry> findAnnotations(ExtensionContext context) {
		return PioneerAnnotationUtils.findAllEnclosingRepeatableAnnotations(context, ReportEntry.class);
	}
```

### MethodMayBeStatic
Method `suspendFor()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/RetryingTestExtension.java`
#### Snippet
```java
		}

		private void suspendFor(int millis) {
			if (millis < 1) {
				return;
```

### MethodMayBeStatic
Method `createNameFormatter()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private TestNameFormatter createNameFormatter(ExtensionContext context) {
		CartesianTest annotation = findAnnotation(context.getRequiredTestMethod(), CartesianTest.class)
				.orElseThrow(() -> new ExtensionConfigurationException("@CartesianTest not found."));
```

### MethodMayBeStatic
Method `initializeParameterArgumentsProvider()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private CartesianParameterArgumentsProvider<?> initializeParameterArgumentsProvider(Annotation source,
			Parameter parameter) {
		Class<?> providerClass;
```

### MethodMayBeStatic
Method `provideArguments()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private List<?> provideArguments(ExtensionContext context, Parameter source,
			CartesianParameterArgumentsProvider<?> provider) throws Exception {
		return provider
```

### MethodMayBeStatic
Method `initializeMethodArgumentsProvider()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private CartesianMethodArgumentsProvider initializeMethodArgumentsProvider(Annotation source, Method method) {
		CartesianArgumentsSource providerAnnotation = AnnotationSupport
				.findAnnotation(method, CartesianArgumentsSource.class)
```

### MethodMayBeStatic
Method `disableIfMatches()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfNameExtension.java`
#### Snippet
```java
	}

	private ConditionEvaluationResult disableIfMatches(String displayName, String[] regExps) {
		//@formatter:off
		String matches = Stream
```

### MethodMayBeStatic
Method `disableIfContains()` may be 'static'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfNameExtension.java`
#### Snippet
```java
	}

	private ConditionEvaluationResult disableIfContains(String displayName, String[] substrings) {
		//@formatter:off
		String matches = Stream
```

