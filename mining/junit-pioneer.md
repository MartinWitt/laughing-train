# junit-pioneer 
 
# Bad smells
I found 67 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 17 | false |
| BoundedWildcard | 17 | false |
| UnstableApiUsage | 11 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| SystemOutErr | 3 | false |
| MarkedForRemoval | 3 | false |
| AssignmentToMethodParameter | 2 | false |
| RedundantSuppression | 2 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| RedundantMethodOverride | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| RedundantClassCall | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| DeprecatedIsStillUsed | 1 | false |
| RedundantImplements | 1 | false |
## RuleId[ruleID=NonStrictComparisonCanBeEquality]
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

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

## RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=RedundantMethodOverride]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `JsonConverterProvider` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/junitpioneer/jupiter/json/JsonConverterProvider.java`
#### Snippet
```java
package org.junitpioneer.jupiter.json;

class JsonConverterProvider {

	private static final boolean JACKSON_PRESENT = isJacksonObjectMapperClassPresent();
```

## RuleId[ruleID=MarkedForRemoval]
### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/org/junitpioneer/jupiter/ClearEnvironmentVariable.java`
#### Snippet
```java
 *
 * <p>WARNING: Java considers environment variables to be immutable, so this extension
 * uses reflection to change them. This requires that the {@link SecurityManager}
 * allows modifications and can potentially break on different operating systems and
 * Java versions. Be aware that this is a fragile solution and consider finding a
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/org/junitpioneer/jupiter/SetEnvironmentVariable.java`
#### Snippet
```java
 *
 * <p>WARNING: Java considers environment variables to be immutable, so this extension
 * uses reflection to change them. This requires that the {@link SecurityManager}
 * allows modifications and can potentially break on different operating systems and
 * Java versions. Be aware that this is a fragile solution and consider finding a
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableUtils.java`
#### Snippet
```java
/**
 * This class modifies the internals of the environment variables map with reflection.
 * Warning: If your {@link SecurityManager} does not allow modifications, it fails.
 */
class EnvironmentVariableUtils {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
	private String prepareMessageFormatPattern(int invocationIndex, Object[] arguments) {
		String result = pattern
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)
				.replace(INDEX_PLACEHOLDER, String.valueOf(invocationIndex));

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
		String result = pattern
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)
				.replace(INDEX_PLACEHOLDER, String.valueOf(invocationIndex));

		if (result.contains(ARGUMENTS_PLACEHOLDER)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
					.mapToObj(index -> "{" + index + "}")
					.collect(joining(", "));
			result = result.replace(ARGUMENTS_PLACEHOLDER, replacement);
		}

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java

	private static boolean hasTestParameterVariables(String value) {
		return value.matches(".*\\{[0-9]+}.*");
	}

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `src/main/java/org/junitpioneer/jupiter/ExpectedToFailExtension.java`
#### Snippet
```java
		// Note: Ideally would use the same logic JUnit uses to determine if exception is aborting
		// execution, see its class OpenTest4JAndJUnit4AwareThrowableCollector
		return TestAbortedException.class.isInstance(t);
	}

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=AssignmentToMethodParameter]
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

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Extension`
in `src/main/java/org/junitpioneer/jupiter/ExpectedToFailExtension.java`
#### Snippet
```java
import org.opentest4j.TestAbortedException;

class ExpectedToFailExtension implements Extension, InvocationInterceptor {

	@Override
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
	}

	public static List<List<?>> cartesianProduct(List<List<?>> lists) {
		List<List<?>> resultLists = new ArrayList<>();
		if (lists.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends DisableIfTestFails`
in `src/main/java/org/junitpioneer/jupiter/DisableIfTestFailsExtension.java`
#### Snippet
```java

	private static Stream<Configuration> createConfigurationFor(ExtensionContext context,
			List<DisableIfTestFails> annotations) {
		// annotations can be empty if a nested class isn't annotated itself (but an outer class is)
		if (annotations.isEmpty())
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private void clearEntries(Collection<K> entriesToClear) {
		entriesToClear.forEach(this::clearEntry);
	}
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private void setEntries(Map<K, V> entriesToSet) {
		entriesToSet.forEach(this::setEntry);
	}
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private void setEntries(Map<K, V> entriesToSet) {
		entriesToSet.forEach(this::setEntry);
	}
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
		}

		public EntriesBackup(Collection<K> entriesToClear, Collection<K> entriesToSet) {
			Stream.concat(entriesToClear.stream(), entriesToSet.stream()).forEach(entry -> {
				V backup = AbstractEntryBasedExtension.this.getEntry(entry);
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
		}

		public EntriesBackup(Collection<K> entriesToClear, Collection<K> entriesToSet) {
			Stream.concat(entriesToClear.stream(), entriesToSet.stream()).forEach(entry -> {
				V backup = AbstractEntryBasedExtension.this.getEntry(entry);
```

### BoundedWildcard
Can generalize to `? super Map`
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableUtils.java`
#### Snippet
```java
	 * Works on Linux and OSX
	 */
	private static void setInSystemEnvClass(Consumer<Map<String, String>> consumer)
			throws ReflectiveOperationException {
		Map<String, String> env = System.getenv(); //NOSONAR access required to implement the extension
```

### BoundedWildcard
Can generalize to `? super Map`
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableUtils.java`
#### Snippet
```java
	 * Works on Windows
	 */
	private static void setInProcessEnvironmentClass(Consumer<Map<String, String>> consumer)
			throws ReflectiveOperationException {
		Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
```

### BoundedWildcard
Can generalize to `? extends Source`
in `src/main/java/org/junitpioneer/jupiter/json/AbstractJsonSourceBasedArgumentsProvider.java`
#### Snippet
```java
	private List<Source> sources;

	protected void accept(List<Source> sources, String dataLocation) {
		this.sources = sources;
		this.dataLocation = dataLocation;
```

### BoundedWildcard
Can generalize to `? extends N`
in `src/main/java/org/junitpioneer/jupiter/params/RangeSourceArgumentsProvider.java`
#### Snippet
```java
	}

	private Stream<N> asStream(Range<N> range) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(range, Spliterator.ORDERED), false);
	}
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
			private final BiPredicate<String, Set<String>> selector;

			Mode(CartesianTest.Enum.Mode.Validator validator, BiPredicate<String, Set<String>> selector) {
				this.validator = validator;
				this.selector = selector;
```

### BoundedWildcard
Can generalize to `? super Set`
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
			private final BiPredicate<String, Set<String>> selector;

			Mode(CartesianTest.Enum.Mode.Validator validator, BiPredicate<String, Set<String>> selector) {
				this.validator = validator;
				this.selector = selector;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
		private final BiPredicate<String, Set<String>> selector;

		Mode(Validator validator, BiPredicate<String, Set<String>> selector) {
			this.validator = validator;
			this.selector = selector;
```

### BoundedWildcard
Can generalize to `? super Set`
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
		private final BiPredicate<String, Set<String>> selector;

		Mode(Validator validator, BiPredicate<String, Set<String>> selector) {
			this.validator = validator;
			this.selector = selector;
```

### BoundedWildcard
Can generalize to `? extends Shared`
in `src/main/java/org/junitpioneer/jupiter/resource/ResourceExtension.java`
#### Snippet
```java
	}

	private List<ReentrantLock> sortedLocksForSharedResources(Collection<Shared> sharedAnnotations,
			ExtensionContext extensionContext) {
		List<Shared> sortedAnnotations = sharedAnnotations.stream().sorted(comparing(Shared::name)).collect(toList());
```

### BoundedWildcard
Can generalize to `? extends ReentrantLock`
in `src/main/java/org/junitpioneer/jupiter/resource/ResourceExtension.java`
#### Snippet
```java
	}

	private <T> T invokeWithLocks(Invocation<T> invocation, List<ReentrantLock> locks) throws Throwable {
		locks.forEach(ReentrantLock::lock);
		try {
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/junitpioneer/jupiter/DefaultLocaleExtension.java`
#### Snippet
```java
	// We ignore them until they're removed in #658
	@SuppressWarnings("deprecation")
	private static Locale createFromParts(DefaultLocale annotation) {
		String language = annotation.language();
		String country = annotation.country();
```

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

## RuleId[ruleID=UnstableApiUsage]
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

```

### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			}

			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project(project.path))
```

### UnstableApiUsage
'dependencies(org.gradle.api.Action)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java

			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:1.2")
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:1.2")
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
				dependencies {
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:1.2")
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
					implementation("org.assertj:assertj-core:3.22.0")
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:1.2")
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
					implementation("org.assertj:assertj-core:3.22.0")
				}
```

### UnstableApiUsage
'implementation(java.lang.Object)' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmComponentDependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
					implementation("com.google.jimfs:jimfs:1.2")
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
					java {
						srcDir("src/demo/java")
```

### UnstableApiUsage
'getTestTask()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuiteTarget' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
				targets {
					all {
						testTask.configure {
							shouldRunAfter(test)
							filter {
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

