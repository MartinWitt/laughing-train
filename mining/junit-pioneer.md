# junit-pioneer/junit-pioneer
# Bad smells
I found 224 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ClassWithoutLogger | 58 | false |
| DuplicateStringLiteralInspection | 57 | false |
| TypeMayBeWeakened | 28 | false |
| Deprecation | 22 | false |
| CollectionsMustHaveInitialCapacity | 12 | false |
| ImplicitNumericConversion | 10 | false |
| MethodCallInLoopCondition | 8 | false |
| CallToSuspiciousStringMethod | 6 | false |
| ClassOnlyUsedInOneModule | 5 | false |
| UnusedReturnValue | 5 | false |
| LengthOneStringsInConcatenation | 5 | false |
| ClassInheritanceDepth | 2 | false |
| OverlyComplexBooleanExpression | 2 | false |
| MarkerInterface | 1 | false |
| MethodCount | 1 | false |
| UncheckedExceptionClass | 1 | false |
| DeclareCollectionAsInterface | 1 | false |
## ClassInheritanceDepth
### ClassInheritanceDepth
`JsonFileSourceArgumentsProvider` is too deep in inheritance tree (inheritance depth = 3)
in `src/main/java/org/junitpioneer/jupiter/json/JsonFileSourceArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from JSON files specified with {@link JsonFileSource}.
 */
class JsonFileSourceArgumentsProvider extends AbstractJsonSourceBasedArgumentsProvider<JsonFileSource> {

	// the reading of the resources / files is heavily inspired by Jupiter's CsvFileArgumentsProvider
```

### ClassInheritanceDepth
`JsonClasspathSourceArgumentsProvider` is too deep in inheritance tree (inheritance depth = 3)
in `src/main/java/org/junitpioneer/jupiter/json/JsonClasspathSourceArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from JSON files specified with {@link JsonClasspathSource}.
 */
class JsonClasspathSourceArgumentsProvider extends AbstractJsonSourceBasedArgumentsProvider<JsonClasspathSource> {

	// the reading of the resources / files is heavily inspired by Jupiter's CsvFileArgumentsProvider
```

## DuplicateStringLiteralInspection
### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
		return tryToLoadClass
				.getOrThrow(ex -> new ExtensionConfigurationException(
					format("Class %s not found, referenced in method %s", className, testMethod.getName()), ex));
	}

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
			// JUnit will throw a ParameterResolutionException for competing resolvers before we could get to this line
			throw new ParameterResolutionException(format(
				"Method `%s` must register values for each parameter exactly once. Expected [%d] parameter sets, but got [%d].",
				factory, testMethod.getParameterCount(), count));
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
				.findMethodCurrentOrEnclosing(declaringClass, factoryName)
				.orElseThrow(() -> new ExtensionConfigurationException("Method `Stream<? extends Arguments> "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (factoryMustBeStatic(factory, testInstance, lifecycle) && !Modifier.isStatic(factory.getModifiers()))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
				.findMethodCurrentOrEnclosing(declaringClass, factoryName)
				.orElseThrow(() -> new ExtensionConfigurationException("Method `Stream<? extends Arguments> "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (factoryMustBeStatic(factory, testInstance, lifecycle) && !Modifier.isStatic(factory.getModifiers()))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
				.orElseThrow(() -> new ExtensionConfigurationException("Method `Stream<? extends Arguments> "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (factoryMustBeStatic(factory, testInstance, lifecycle) && !Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
		String method = "Method `" + factory + "`";
		if (factoryMustBeStatic(factory, testInstance, lifecycle) && !Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
		if (!ArgumentSets.class.isAssignableFrom(factory.getReturnType()))
			throw new ExtensionConfigurationException(
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.json.JsonSourceArgumentsProviderTests.InvalidJsonSourceTests'
in `src/main/java/org/junitpioneer/jupiter/json/JsonInlineArgumentsProvider.java`
#### Snippet
```java
	protected Stream<Node> provideNodes(ExtensionContext context, JsonConverter jsonConverter) {
		return PioneerPreconditions
				.notEmpty(this.jsonValues, "value must not be empty")
				.stream()
				.map(value -> jsonConverter.toNode(value, true))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianValueArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianValueArgumentsProvider.java`
#### Snippet
```java

		if (arrays.size() != 1)
			throw new PreconditionViolationException("Exactly one type of input must be provided in the @"
					+ CartesianTest.Values.class.getSimpleName() + " annotation, but there were " + arrays.size());

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianValueArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianValueArgumentsProvider.java`
#### Snippet
```java
		if (arrays.size() != 1)
			throw new PreconditionViolationException("Exactly one type of input must be provided in the @"
					+ CartesianTest.Values.class.getSimpleName() + " annotation, but there were " + arrays.size());

		Object originalArray = arrays.get(0);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianEnumSource.Mode'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
				catch (PatternSyntaxException e) {
					throw new PreconditionViolationException(
						"Pattern compilation failed for a regular expression supplied in " + enumSource, e);
				}
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianEnumSource.Mode'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
				if (!allNames.containsAll(names)) {
					throw new PreconditionViolationException(
						"Invalid enum constant name(s) in " + enumSource + ". Valid names include: " + allNames);
				}
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianEnumSource.Mode'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
				if (!allNames.containsAll(names)) {
					throw new PreconditionViolationException(
						"Invalid enum constant name(s) in " + enumSource + ". Valid names include: " + allNames);
				}
			}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTest'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
	 * @see org.junit.jupiter.params.ParameterizedTest#name()
	 */
	String name() default "[{index}] {arguments}";

	/**
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.StopwatchExtensionTests'
in `src/main/java/org/junitpioneer/jupiter/StopwatchExtension.java`
#### Snippet
```java
	private final Clock clock = Clock.systemUTC();
	private static final Namespace NAMESPACE = Namespace.create(StopwatchExtension.class);
	static final String STORE_KEY = "StopwatchExtension";

	@Override
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.json.JsonFileSourceArgumentsProviderTests.InvalidJsonSourceTests'
in `src/main/java/org/junitpioneer/jupiter/json/JsonFileSourceArgumentsProvider.java`
#### Snippet
```java
	private static Source fileResource(String file) {
		return context -> {
			PioneerPreconditions.notBlank(file, "File must not be null or blank");
			Path filePath = Paths.get(file);
			if (!Files.exists(filePath))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.json.JsonFileSourceArgumentsProviderTests.InvalidJsonSourceTests'
in `src/main/java/org/junitpioneer/jupiter/json/JsonFileSourceArgumentsProvider.java`
#### Snippet
```java
			Path filePath = Paths.get(file);
			if (!Files.exists(filePath))
				throw new PreconditionViolationException("File does not exist: " + file);
			try {
				return Files.newInputStream(filePath);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTest'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
	 * @see org.junit.jupiter.params.ParameterizedTest#name()
	 */
	String name() default "[{index}] {arguments}";

	/**
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.WritesStdIo'
in `src/main/java/org/junitpioneer/jupiter/ReadsStdIo.java`
#### Snippet
```java
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE })
@Inherited
@ResourceLock(value = "java.lang.System.in", mode = ResourceAccessMode.READ)
@ResourceLock(value = Resources.SYSTEM_OUT, mode = ResourceAccessMode.READ)
@ResourceLock(value = Resources.SYSTEM_ERR, mode = ResourceAccessMode.READ)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianEnumArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumArgumentsProvider.java`
#### Snippet
```java

			if (uniqueNames.size() != declaredConstantNames.length)
				throw new PreconditionViolationException("Duplicate enum constant name(s) found in " + enumSource);

			mode.validate(enumSource, constants, uniqueNames);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests', 'org.junitpioneer.jupiter.cartesian.CartesianTestExtension', 'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		}
		catch (Exception ex) {
			throw new ExtensionConfigurationException("Could not provide arguments because of exception.", ex);
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		CartesianArgumentsProvider provider = ReflectionSupport.newInstance(providerAnnotation.value());
		if (!(provider instanceof CartesianMethodArgumentsProvider))
			throw new PreconditionViolationException(format("%s does not implement %s interface.", provider.getClass(),
				CartesianMethodArgumentsProvider.class.getSimpleName()));
		return AnnotationConsumerInitializer.initialize(method, (CartesianMethodArgumentsProvider) provider);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	private static void ensureNoInputConflicts(List<?> methodSources, List<?> parameterSources, Method testMethod) {
		if (methodSources.isEmpty() && parameterSources.isEmpty() && testMethod.getParameters().length > 0)
			throw new ExtensionConfigurationException("No arguments sources were found for @CartesianTest");
		if (!methodSources.isEmpty() && !parameterSources.isEmpty())
			throw new ExtensionConfigurationException(
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		if (!methodSources.isEmpty() && !parameterSources.isEmpty())
			throw new ExtensionConfigurationException(
				"Providing both method-level and parameter-level argument sources for @CartesianTest is not supported.");
		if (methodSources.size() > 1)
			throw new ExtensionConfigurationException(
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		if (methodSources.size() > 1)
			throw new ExtensionConfigurationException(
				"Only one method-level arguments source can be used with @CartesianTest");
	}

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		T provider = AnnotationConsumerInitializer.initialize(parameter, ReflectionSupport.newInstance(providerClass));
		if (!(provider instanceof CartesianParameterArgumentsProvider)) {
			throw new PreconditionViolationException(format("%s does not implement %s interface.", provider.getClass(),
				CartesianParameterArgumentsProvider.class.getSimpleName()));
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests', 'org.junitpioneer.jupiter.cartesian.CartesianTestExtension', 'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		}
		catch (Exception ex) {
			throw new ExtensionConfigurationException("Could not provide arguments because of exception.", ex);
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.json.JsonFileSourceArgumentsProviderTests.InvalidJsonSourceTests', 'org.junitpioneer.jupiter.json.JsonClasspathSourceArgumentsProviderTests.InvalidJsonSourceTests'
in `src/main/java/org/junitpioneer/jupiter/json/AbstractJsonSourceBasedArgumentsProvider.java`
#### Snippet
```java
	protected Stream<Node> provideNodes(ExtensionContext context, JsonConverter jsonConverter) {
		return PioneerPreconditions
				.notEmpty(this.sources, "Value must not be empty")
				.stream()
				.map(source -> source.open(context))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.WritesEnvironmentVariable'
in `src/main/java/org/junitpioneer/jupiter/ReadsEnvironmentVariable.java`
#### Snippet
```java
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE })
@Inherited
@ResourceLock(value = "java.lang.System.environment", mode = ResourceAccessMode.READ)
public @interface ReadsEnvironmentVariable {
}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.ReportEntry', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogAlwaysTests', 'org.junitpioneer.internal.PioneerAnnotationUtils', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnSuccessTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnFailureTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnAbortedTests', 'org.junitpioneer.jupiter.params.DisableIfArgumentExtensionTests.BadConfigTestCases'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
		try {
			if (isContainerAnnotation(annotation)) {
				Method value = annotation.annotationType().getDeclaredMethod("value");
				Annotation[] invoke = (Annotation[]) value.invoke(annotation);
				return Stream.of(invoke).flatMap(PioneerAnnotationUtils::flatten);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.ReportEntry', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogAlwaysTests', 'org.junitpioneer.internal.PioneerAnnotationUtils', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnSuccessTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnFailureTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnAbortedTests', 'org.junitpioneer.jupiter.params.DisableIfArgumentExtensionTests.BadConfigTestCases'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
		// See https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.3
		try {
			Method value = annotation.annotationType().getDeclaredMethod("value");
			return value.getReturnType().isArray() && value.getReturnType().getComponentType().isAnnotation()
					&& isContainerAnnotationOf(annotation, value.getReturnType().getComponentType());
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtensionTests.StandardBehaviouralTests', 'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests', 'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.StandardBehaviouralTests'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfNameExtension.java`
#### Snippet
```java
			throw new ExtensionConfigurationException(format("%s %s.",
				"@DisableIfDisplayName requires that either `contains` or `matches` is specified, but both are",
				(checkSubstrings ? "present" : "empty")));

		String displayName = context.getDisplayName();
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.params.RangeSourceArgumentsProviderTests.InvalidRangeTests'
in `src/main/java/org/junitpioneer/jupiter/params/Range.java`
#### Snippet
```java
	void validate() {
		if (step.equals(getZero())) {
			throw new IllegalArgumentException("Illegal range. The step cannot be zero.");
		}

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.params.RangeSourceArgumentsProviderTests.InvalidRangeTests'
in `src/main/java/org/junitpioneer/jupiter/params/Range.java`
#### Snippet
```java

		if (!closed && from.equals(to)) {
			throw new IllegalArgumentException("Illegal range. Equal from and to will produce an empty range.");
		}

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.json.JsonClasspathSourceArgumentsProviderTests.InvalidJsonSourceTests'
in `src/main/java/org/junitpioneer/jupiter/json/JsonClasspathSourceArgumentsProvider.java`
#### Snippet
```java
	private static Source classpathResource(String resource) {
		return context -> {
			PioneerPreconditions.notBlank(resource, "Classpath resource must not be null or blank");
			InputStream stream = context.getRequiredTestClass().getClassLoader().getResourceAsStream(resource);
			PioneerPreconditions.notNull(stream, "Classpath resource [" + resource + "] does not exist");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.internal.TestNameFormatterTests'
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
		}
		catch (Exception ex) {
			String message = "The display name pattern defined for the " + forClass.getName() + " is invalid. "
					+ "See nested exception for further details.";
			throw new ExtensionConfigurationException(message, ex);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.params.DisableIfArgumentExtensionTests.MisconfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
				&& AnnotationSupport.findRepeatableAnnotations(testMethod, DisableIfArgument.class).isEmpty()) {
			throw new ExtensionConfigurationException(
				"Required at least one of the following: @DisableIfArgument, @DisableIfAllArguments, @DisableIfAnyArgument but found none.");
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.params.DisableIfArgumentExtensionTests.MisconfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
		if (!annotation.name().isEmpty() && annotation.index() > -1)
			throw new ExtensionConfigurationException(
				"Using both name and index parameter targeting in a single @DisableIfArgument is not permitted.");

		if (!annotation.name().isEmpty()) {
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.ReadsStdIo'
in `src/main/java/org/junitpioneer/jupiter/WritesStdIo.java`
#### Snippet
```java
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE })
@Inherited
@ResourceLock(value = "java.lang.System.in", mode = ResourceAccessMode.READ_WRITE)
@ResourceLock(value = Resources.SYSTEM_OUT, mode = ResourceAccessMode.READ_WRITE)
@ResourceLock(value = Resources.SYSTEM_ERR, mode = ResourceAccessMode.READ_WRITE)
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.ReadsEnvironmentVariable'
in `src/main/java/org/junitpioneer/jupiter/WritesEnvironmentVariable.java`
#### Snippet
```java
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE })
@Inherited
@ResourceLock(value = "java.lang.System.environment", mode = ResourceAccessMode.READ_WRITE)
public @interface WritesEnvironmentVariable {
}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianEnumArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
			Set<String> uniqueNames = stream(declaredConstantNames).collect(toSet());
			if (uniqueNames.size() != declaredConstantNames.length)
				throw new PreconditionViolationException("Duplicate enum constant name(s) found in " + enumSource);

			mode.validate(enumSource, constants, uniqueNames);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests', 'org.junitpioneer.jupiter.CartesianProductTestExtensionTests.BadConfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
			if (!Enum.class.isAssignableFrom(parameterType))
				throw new PreconditionViolationException(
					String.format("Parameter of type %s must reference an Enum type", parameterType));
			enumClass = parameterType;
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogAlwaysTests', 'org.junitpioneer.internal.PioneerAnnotationUtils', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnSuccessTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnFailureTests', 'org.junitpioneer.jupiter.ReportEntryExtensionTests.PublishConditionTests.LogOnAbortedTests', 'org.junitpioneer.jupiter.params.DisableIfArgumentExtensionTests.BadConfigTestCases'
in `src/main/java/org/junitpioneer/jupiter/ReportEntry.java`
#### Snippet
```java
	 * @see org.junit.jupiter.api.extension.ExtensionContext#publishReportEntry(String, String) ExtensionContext::publishReportEntry
	 */
	String key() default "value";

	/**
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianValueArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianValueArgumentsProvider.java`
#### Snippet
```java

		if (arrays.size() != 1)
			throw new PreconditionViolationException("Exactly one type of input must be provided in the @"
					+ CartesianValueSource.class.getSimpleName() + " annotation, but there were " + arrays.size());

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianValueArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianValueArgumentsProvider.java`
#### Snippet
```java
		if (arrays.size() != 1)
			throw new PreconditionViolationException("Exactly one type of input must be provided in the @"
					+ CartesianValueSource.class.getSimpleName() + " annotation, but there were " + arrays.size());

		Object originalArray = arrays.get(0);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
			// JUnit will throw a ParameterResolutionException for competing resolvers before we could get to this line
			throw new ParameterResolutionException(format(
				"Method `%s` must register values for each parameter exactly once. Expected [%d] parameter sets, but got [%d].",
				factory, testMethod.getParameterCount(), sets.getSets().size()));
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
				.findMethodCurrentOrEnclosing(declaringClass, factoryName)
				.orElseThrow(() -> new ExtensionConfigurationException("Method `CartesianProductTest.Sets "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (!Modifier.isStatic(factory.getModifiers()))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
				.findMethodCurrentOrEnclosing(declaringClass, factoryName)
				.orElseThrow(() -> new ExtensionConfigurationException("Method `CartesianProductTest.Sets "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (!Modifier.isStatic(factory.getModifiers()))
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
				.orElseThrow(() -> new ExtensionConfigurationException("Method `CartesianProductTest.Sets "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (!Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		String method = "Method `" + factory + "`";
		if (!Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
		if (!CartesianProductTest.Sets.class.isAssignableFrom(factory.getReturnType()))
			throw new ExtensionConfigurationException(method + " must return `CartesianProductTest.Sets`.");
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTestExtensionTests.BadConfigurationTests', 'org.junitpioneer.jupiter.cartesian.CartesianTestExtension'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		}
		catch (Exception ex) {
			throw new ExtensionConfigurationException("Could not provide arguments because of exception.", ex);
		}
	}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtensionTests.BadConfigurationTests'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		if (hasValue && hasFactory || hasValue && hasValueSources || hasFactory && hasValueSources)
			throw new ExtensionConfigurationException(
				"CartesianProductTest can only take exactly one type of arguments source.");
	}

```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	private TestNameFormatter createNameFormatter(ExtensionContext context) {
		CartesianProductTest annotation = findAnnotation(context.getRequiredTestMethod(), CartesianProductTest.class)
				.orElseThrow(() -> new ExtensionConfigurationException("@CartesianProductTest not found."));
		String pattern = annotation.name();
		if (pattern.isEmpty())
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianFactoryArgumentsProvider'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
					.tryToLoadClass(className)
					.getOrThrow(ex -> new ExtensionConfigurationException(
						format("Class %s not found, referenced in method %s", className, testMethod.getName()), ex));

		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.CartesianProductTestExtension'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		Method testMethod = context.getRequiredTestMethod();
		CartesianProductTest annotation = findAnnotation(testMethod, CartesianProductTest.class)
				.orElseThrow(() -> new ExtensionConfigurationException("@CartesianProductTest not found."));
		List<? extends Annotation> argumentsSources = PioneerAnnotationUtils
				.findAnnotatedAnnotations(testMethod, ArgumentsSource.class);
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTest.Enum.Mode'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
			catch (PatternSyntaxException e) {
				throw new PreconditionViolationException(
					"Pattern compilation failed for a regular expression supplied in " + enumSource, e);
			}
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTest.Enum.Mode'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
			if (!allNames.containsAll(names)) {
				throw new PreconditionViolationException(
					"Invalid enum constant name(s) in " + enumSource + ". Valid names include: " + allNames);
			}
		}
```

### DuplicateStringLiteralInspection
Duplicate string literal found in  
'org.junitpioneer.jupiter.cartesian.CartesianTest.Enum.Mode'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
			if (!allNames.containsAll(names)) {
				throw new PreconditionViolationException(
					"Invalid enum constant name(s) in " + enumSource + ". Valid names include: " + allNames);
			}
		}
```

## CollectionsMustHaveInitialCapacity
### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/cartesian/ArgumentSets.java`
#### Snippet
```java

	private ArgumentSets() {
		this.arguments = new ArrayList<>();
	}

```

### CollectionsMustHaveInitialCapacity
`new ConcurrentHashMap<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/issue/IssueExtensionExecutionListener.java`
#### Snippet
```java
	public IssueExtensionExecutionListener() {
		this.active = ServiceLoader.load(IssueProcessor.class).iterator().hasNext();
		this.testCases = new ConcurrentHashMap<>();
	}

```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
	class Sets {

		private final List<List<?>> sets = new ArrayList<>(); //NOSONAR

		// recreate default constructor to prevent compiler warning
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	private List<List<?>> getSetsFromArgumentsSources(List<? extends Annotation> argumentsSources,
			ExtensionContext context) {
		List<List<?>> sets = new ArrayList<>();
		List<Parameter> parameters = Arrays.asList(context.getRequiredTestMethod().getParameters());
		for (int i = 0; i < Math.min(parameters.size(), argumentsSources.size()); i++) {
```

### CollectionsMustHaveInitialCapacity
`new HashSet<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	private class EntriesBackup {

		private final Set<K> entriesToClear = new HashSet<>();
		private final Map<K, V> entriesToSet = new HashMap<>();

```

### CollectionsMustHaveInitialCapacity
`new HashMap<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java

		private final Set<K> entriesToClear = new HashSet<>();
		private final Map<K, V> entriesToSet = new HashMap<>();

		public EntriesBackup() {
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java

	private static List<Annotation> collectArgumentSources(Parameter parameter) {
		List<Annotation> annotations = new ArrayList<>();
		AnnotationSupport.findAnnotation(parameter, CartesianArgumentsSource.class).ifPresent(annotations::add);
		// ArgumentSource meta-annotations are allowed on parameters for
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
	 */
	public static List<ExtensionContext> findAllContexts(ExtensionContext context) {
		List<ExtensionContext> allContexts = new ArrayList<>();
		allContexts.add(context);
		List<ExtensionContext> parentContexts = context
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java

	public static List<List<?>> cartesianProduct(List<List<?>> lists) {
		List<List<?>> resultLists = new ArrayList<>();
		if (lists.isEmpty()) {
			resultLists.add(Collections.emptyList());
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
		for (Object item : firstList) {
			for (List<?> remainingList : remainingLists) {
				ArrayList<Object> resultList = new ArrayList<>();
				resultList.add(item);
				resultList.addAll(remainingList);
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java

	private List<List<?>> getSetsFromValue(Method testMethod, CartesianProductTest annotation) {
		List<List<?>> sets = new ArrayList<>();
		List<String> strings = Arrays.stream(annotation.value()).distinct().collect(toList());
		for (int i = 0; i < testMethod.getParameterTypes().length; i++)
```

### CollectionsMustHaveInitialCapacity
`new ArrayList<>()` without initial capacity
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	private List<List<?>> getSetsFromArgumentsSources(List<? extends Annotation> argumentsSources,
			ExtensionContext context) {
		List<List<?>> sets = new ArrayList<>();
		for (Annotation source : argumentsSources)
			sets.add(getSetFromAnnotation(context, source));
```

## MarkerInterface
### MarkerInterface
Marker interface `CartesianArgumentsProvider`
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianArgumentsProvider.java`
#### Snippet
```java
 * {@link CartesianMethodArgumentsProvider} or {@link CartesianParameterArgumentsProvider}.
 */
interface CartesianArgumentsProvider {

}
```

## ImplicitNumericConversion
### ImplicitNumericConversion
Implicit numeric conversion of `'#'` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
			return testMethod.getDeclaringClass();

		String className = methodFactoryName.substring(0, methodFactoryName.indexOf('#'));
		Try<Class<?>> tryToLoadClass = ReflectionSupport.tryToLoadClass(className);
		// step (outwards) through all enclosing classes, trying to load the factory class by appending
```

### ImplicitNumericConversion
Implicit numeric conversion of `'('` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
	private static String extractMethodFactoryName(String methodFactoryName) {
		if (methodFactoryName.contains("("))
			methodFactoryName = methodFactoryName.substring(0, methodFactoryName.indexOf('('));
		if (methodFactoryName.contains("#"))
			return methodFactoryName.substring(methodFactoryName.indexOf('#') + 1);
```

### ImplicitNumericConversion
Implicit numeric conversion of `'#'` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
			methodFactoryName = methodFactoryName.substring(0, methodFactoryName.indexOf('('));
		if (methodFactoryName.contains("#"))
			return methodFactoryName.substring(methodFactoryName.indexOf('#') + 1);
		return methodFactoryName;
	}
```

### ImplicitNumericConversion
Implicit numeric conversion of `argumentSets.getArguments().size()` from 'int' to 'long'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
		Object target = factory.getDeclaringClass().isInstance(testInstance) ? testInstance : null;
		ArgumentSets argumentSets = (ArgumentSets) invokeMethod(factory, target);
		long count = argumentSets.getArguments().size();
		if (count > testMethod.getParameterCount()) {
			// If arguments count == parameters but one of the parameters should be auto-injected by JUnit
```

### ImplicitNumericConversion
Implicit numeric conversion of `testMethod.getParameterCount()` from 'int' to 'long'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
		ArgumentSets argumentSets = (ArgumentSets) invokeMethod(factory, target);
		long count = argumentSets.getArguments().size();
		if (count > testMethod.getParameterCount()) {
			// If arguments count == parameters but one of the parameters should be auto-injected by JUnit
			// JUnit will throw a ParameterResolutionException for competing resolvers before we could get to this line
```

### ImplicitNumericConversion
Implicit numeric conversion of `millis` from 'int' to 'long'
in `src/main/java/org/junitpioneer/jupiter/RetryingTestExtension.java`
#### Snippet
```java

			try {
				TimeUnit.MILLISECONDS.sleep(millis);
			}
			catch (InterruptedException ex) {
```

### ImplicitNumericConversion
Implicit numeric conversion of `0` from 'int' to 'long'
in `src/main/java/org/junitpioneer/vintage/TimeoutExtension.java`
#### Snippet
```java

	private void proceedWithTimeout(Invocation<Void> invocation, ExtensionContext extensionContext, long timeout) {
		if (timeout < 0)
			throw new ExtensionConfigurationException("Timeout for vintage @Test must be positive.");

```

### ImplicitNumericConversion
Implicit numeric conversion of `'('` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	private String getFactoryMethodName(String factoryMethodName) {
		if (factoryMethodName.contains("("))
			factoryMethodName = factoryMethodName.substring(0, factoryMethodName.indexOf('('));
		if (factoryMethodName.contains("#"))
			return factoryMethodName.substring(factoryMethodName.indexOf('#') + 1);
```

### ImplicitNumericConversion
Implicit numeric conversion of `'#'` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
			factoryMethodName = factoryMethodName.substring(0, factoryMethodName.indexOf('('));
		if (factoryMethodName.contains("#"))
			return factoryMethodName.substring(factoryMethodName.indexOf('#') + 1);
		return factoryMethodName;
	}
```

### ImplicitNumericConversion
Implicit numeric conversion of `'#'` from 'char' to 'int'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	private Class<?> getExplicitOrImplicitClass(Method testMethod, String factoryMethodName) {
		if (factoryMethodName.contains("#")) {
			String className = factoryMethodName.substring(0, factoryMethodName.indexOf('#'));
			return ReflectionSupport
					.tryToLoadClass(className)
```

## ClassOnlyUsedInOneModule
### ClassOnlyUsedInOneModule
Class `ReadsDefaultLocale` has only dependencies on and/or dependents in module 'junit-pioneer.test'
in `src/main/java/org/junitpioneer/jupiter/ReadsDefaultLocale.java`
#### Snippet
```java
@Inherited
@ResourceLock(value = Resources.LOCALE, mode = ResourceAccessMode.READ)
public @interface ReadsDefaultLocale {
}

```

### ClassOnlyUsedInOneModule
Class `ReadsDefaultTimeZone` has only dependencies on and/or dependents in module 'junit-pioneer.test'
in `src/main/java/org/junitpioneer/jupiter/ReadsDefaultTimeZone.java`
#### Snippet
```java
@Inherited
@ResourceLock(value = Resources.TIME_ZONE, mode = ResourceAccessMode.READ)
public @interface ReadsDefaultTimeZone {
}

```

### ClassOnlyUsedInOneModule
Class `ReadsEnvironmentVariable` has only dependencies on and/or dependents in module 'junit-pioneer.test'
in `src/main/java/org/junitpioneer/jupiter/ReadsEnvironmentVariable.java`
#### Snippet
```java
@Inherited
@ResourceLock(value = "java.lang.System.environment", mode = ResourceAccessMode.READ)
public @interface ReadsEnvironmentVariable {
}

```

### ClassOnlyUsedInOneModule
Class `ReadsStdIo` has only dependencies on and/or dependents in module 'junit-pioneer.test'
in `src/main/java/org/junitpioneer/jupiter/ReadsStdIo.java`
#### Snippet
```java
@ResourceLock(value = Resources.SYSTEM_OUT, mode = ResourceAccessMode.READ)
@ResourceLock(value = Resources.SYSTEM_ERR, mode = ResourceAccessMode.READ)
public @interface ReadsStdIo {
}

```

### ClassOnlyUsedInOneModule
Class `ReadsSystemProperty` has only dependencies on and/or dependents in module 'junit-pioneer.test'
in `src/main/java/org/junitpioneer/jupiter/ReadsSystemProperty.java`
#### Snippet
```java
@Inherited
@ResourceLock(value = Resources.SYSTEM_PROPERTIES, mode = ResourceAccessMode.READ)
public @interface ReadsSystemProperty {
}

```

## TypeMayBeWeakened
### TypeMayBeWeakened
Type of parameter `names` may be weakened to 'java.lang.Iterable'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java

			private static void validatePatterns(CartesianTest.Enum enumSource,
					Set<? extends java.lang.Enum<?>> constants, Set<String> names) {
				try {
					names.forEach(Pattern::compile);
```

### TypeMayBeWeakened
Type of parameter `constants` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java
			}

			private static void validateNames(CartesianTest.Enum enumSource, Set<? extends java.lang.Enum<?>> constants,
					Set<String> names) {
				Set<String> allNames = constants.stream().map(java.lang.Enum::name).collect(toSet());
```

### TypeMayBeWeakened
Type of parameter `names` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTest.java`
#### Snippet
```java

			private static void validateNames(CartesianTest.Enum enumSource, Set<? extends java.lang.Enum<?>> constants,
					Set<String> names) {
				Set<String> allNames = constants.stream().map(java.lang.Enum::name).collect(toSet());
				if (!allNames.containsAll(names)) {
```

### TypeMayBeWeakened
Type of parameter `matcher` may be weakened to 'java.util.regex.MatchResult'
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
	}

	private static int getVariableNumber(ReportEntry entry, Matcher matcher) {
		return Integer.parseInt(entry.value().substring(matcher.start() + 1, matcher.end() - 1));
	}
```

### TypeMayBeWeakened
Type of parameter `method` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
	}

	private int determineParameterTypeIndex(Method method) {
		List<Annotation> argumentSources = PioneerAnnotationUtils
				.findAnnotatedAnnotations(method, ArgumentsSource.class);
```

### TypeMayBeWeakened
Type of parameter `method` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private CartesianMethodArgumentsProvider initializeMethodArgumentsProvider(Annotation source, Method method) {
		CartesianArgumentsSource providerAnnotation = AnnotationSupport
				.findAnnotation(method, CartesianArgumentsSource.class)
```

### TypeMayBeWeakened
Type of parameter `methodSources` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private static void ensureNoInputConflicts(List<?> methodSources, List<?> parameterSources, Method testMethod) {
		if (methodSources.isEmpty() && parameterSources.isEmpty() && testMethod.getParameters().length > 0)
			throw new ExtensionConfigurationException("No arguments sources were found for @CartesianTest");
```

### TypeMayBeWeakened
Type of parameter `parameterSources` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
	}

	private static void ensureNoInputConflicts(List<?> methodSources, List<?> parameterSources, Method testMethod) {
		if (methodSources.isEmpty() && parameterSources.isEmpty() && testMethod.getParameters().length > 0)
			throw new ExtensionConfigurationException("No arguments sources were found for @CartesianTest");
```

### TypeMayBeWeakened
Type of parameter `parameter` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java

	private static <T> CartesianParameterArgumentsProvider<?> getAndInitializeCartesianParameterArgumentsProvider(
			Class<T> providerClass, Parameter parameter) {
		T provider = AnnotationConsumerInitializer.initialize(parameter, ReflectionSupport.newInstance(providerClass));
		if (!(provider instanceof CartesianParameterArgumentsProvider)) {
```

### TypeMayBeWeakened
Type of field `entriesToClear` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	private class EntriesBackup {

		private final Set<K> entriesToClear = new HashSet<>();
		private final Map<K, V> entriesToSet = new HashMap<>();

```

### TypeMayBeWeakened
Type of parameter `entriesToClear` may be weakened to 'java.lang.Iterable'
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
	}

	private void clearEntries(Collection<K> entriesToClear) {
		entriesToClear.forEach(this::clearEntry);
	}
```

### TypeMayBeWeakened
Type of parameter `parameter` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
	}

	private static List<Annotation> collectArgumentSources(Parameter parameter) {
		List<Annotation> annotations = new ArrayList<>();
		AnnotationSupport.findAnnotation(parameter, CartesianArgumentsSource.class).ifPresent(annotations::add);
```

### TypeMayBeWeakened
Type of parameter `element` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
	}

	private static <A extends Annotation> List<A> findOnMethod(Method element, Class<A> annotationType,
			boolean findRepeated) {
		if (findRepeated)
```

### TypeMayBeWeakened
Type of parameter `testMethod` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
	}

	public static List<Annotation> findMethodArgumentsSources(Method testMethod) {
		return Arrays
				.stream(testMethod.getAnnotations())
```

### TypeMayBeWeakened
Type of parameter `annotations` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/DisableIfTestFailsExtension.java`
#### Snippet
```java

	private static Stream<Configuration> createConfigurationFor(ExtensionContext context,
			List<DisableIfTestFails> annotations) {
		// annotations can be empty if a nested class isn't annotated itself (but an outer class is)
		if (annotations.isEmpty())
```

### TypeMayBeWeakened
Type of parameter `range` may be weakened to 'java.util.Iterator'
in `src/main/java/org/junitpioneer/jupiter/params/RangeSourceArgumentsProvider.java`
#### Snippet
```java
	}

	private Stream<N> asStream(Range<N> range) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(range, Spliterator.ORDERED), false);
	}
```

### TypeMayBeWeakened
Type of parameter `testMethod` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private static void checkRequiredAnnotations(Method testMethod) {
		if (!AnnotationSupport.findAnnotation(testMethod, DisableIfAnyArgument.class).isPresent()
				&& !AnnotationSupport.findAnnotation(testMethod, DisableIfAllArguments.class).isPresent()
```

### TypeMayBeWeakened
Type of parameter `test` may be weakened to 'java.lang.reflect.AnnotatedElement'
in `src/main/java/org/junitpioneer/jupiter/RetryingTestExtension.java`
#### Snippet
```java
		}

		static FailedTestRetrier createFor(Method test, ExtensionContext context) {
			RetryingTest retryingTest = AnnotationSupport
					.findAnnotation(test, RetryingTest.class)
```

### TypeMayBeWeakened
Type of parameter `set` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
	}

	private static <T> void addButThrowIfDuplicate(Set<T> set, T element) {
		boolean newElement = set.add(element);
		if (!newElement) {
```

### TypeMayBeWeakened
Type of variable `resultList` may be weakened to 'java.util.List'
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
		for (Object item : firstList) {
			for (List<?> remainingList : remainingLists) {
				ArrayList<Object> resultList = new ArrayList<>();
				resultList.add(item);
				resultList.addAll(remainingList);
```

### TypeMayBeWeakened
Type of parameter `untilDate` may be weakened to 'java.time.chrono.ChronoLocalDate'
in `src/main/java/org/junitpioneer/jupiter/DisabledUntilExtension.java`
#### Snippet
```java
	}

	private ConditionEvaluationResult evaluateUntilDate(ExtensionContext context, LocalDate untilDate) {
		LocalDate today = LocalDate.now();
		boolean disabled = today.isBefore(untilDate);
```

### TypeMayBeWeakened
Type of parameter `dateString` may be weakened to 'java.lang.CharSequence'
in `src/main/java/org/junitpioneer/jupiter/DisabledUntilExtension.java`
#### Snippet
```java
	}

	private LocalDate parseDate(String dateString) {
		try {
			return LocalDate.parse(dateString, ISO_8601);
```

### TypeMayBeWeakened
Type of parameter `valueSources` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java

	private static void ensureNoInputConflicts(CartesianProductTest annotation,
			List<? extends Annotation> valueSources) {
		boolean hasValue = annotation.value().length != 0;
		boolean hasFactory = !annotation.factory().isEmpty();
```

### TypeMayBeWeakened
Type of parameter `context` may be weakened to 'org.junit.jupiter.api.extension.ExtensionContext'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java

	@SuppressWarnings("unchecked")
	private List<Object> provideArguments(ExtensionContext context, Annotation source, ArgumentsProvider provider)
			throws Exception {
		if (provider instanceof CartesianAnnotationConsumer) {
```

### TypeMayBeWeakened
Type of parameter `argumentsSources` may be weakened to 'java.lang.Iterable'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
	}

	private List<List<?>> getSetsFromArgumentsSources(List<? extends Annotation> argumentsSources,
			ExtensionContext context) {
		List<List<?>> sets = new ArrayList<>();
```

### TypeMayBeWeakened
Type of parameter `names` may be weakened to 'java.lang.Iterable'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java

		private static void validatePatterns(CartesianEnumSource enumSource, Set<? extends Enum<?>> constants,
				Set<String> names) {
			try {
				names.forEach(Pattern::compile);
```

### TypeMayBeWeakened
Type of parameter `constants` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java
		}

		private static void validateNames(CartesianEnumSource enumSource, Set<? extends Enum<?>> constants,
				Set<String> names) {
			Set<String> allNames = constants.stream().map(Enum::name).collect(toSet());
```

### TypeMayBeWeakened
Type of parameter `names` may be weakened to 'java.util.Collection'
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumSource.java`
#### Snippet
```java

		private static void validateNames(CartesianEnumSource enumSource, Set<? extends Enum<?>> constants,
				Set<String> names) {
			Set<String> allNames = constants.stream().map(Enum::name).collect(toSet());
			if (!allNames.containsAll(names)) {
```

## MethodCallInLoopCondition
### MethodCallInLoopCondition
Call to method `find()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
		int highest = 0;
		Matcher matcher = Pattern.compile("\\{[0-9]+}").matcher(entry.value());
		while (matcher.find())
			highest = Math.max(getVariableNumber(entry, matcher), highest);
		return highest;
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
		String parsed = value;
		List<?> list = context.getStore(NAMESPACE).get(KEY, List.class);
		for (int i = 0; i < list.size(); i++) {
			parsed = parsed.replaceAll("\\{" + i + "}", PioneerUtils.nullSafeToString(list.get(i)));
		}
```

### MethodCallInLoopCondition
Call to method `min()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		List<List<?>> sets = new ArrayList<>();
		List<Parameter> parameters = Arrays.asList(context.getRequiredTestMethod().getParameters());
		for (int i = 0; i < Math.min(parameters.size(), argumentsSources.size()); i++) {
			sets.add(getSetFromAnnotation(context, argumentsSources.get(i), parameters.get(i)));
		}
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		List<List<?>> sets = new ArrayList<>();
		List<Parameter> parameters = Arrays.asList(context.getRequiredTestMethod().getParameters());
		for (int i = 0; i < Math.min(parameters.size(), argumentsSources.size()); i++) {
			sets.add(getSetFromAnnotation(context, argumentsSources.get(i), parameters.get(i)));
		}
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
		List<List<?>> sets = new ArrayList<>();
		List<Parameter> parameters = Arrays.asList(context.getRequiredTestMethod().getParameters());
		for (int i = 0; i < Math.min(parameters.size(), argumentsSources.size()); i++) {
			sets.add(getSetFromAnnotation(context, argumentsSources.get(i), parameters.get(i)));
		}
```

### MethodCallInLoopCondition
Call to method `size()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
		List<DisableIfArgument> annotations = AnnotationSupport
				.findRepeatableAnnotations(testMethod, DisableIfArgument.class);
		for (int i = 0; i < annotations.size(); i++) {
			DisableIfArgument parameter = annotations.get(i);
			verifyNonEmptyInputs(parameter);
```

### MethodCallInLoopCondition
Call to method `isPresent()` in loop condition
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
			method = findMethod(current, methodName, parameterTypes);
			current = current.getEnclosingClass();
		} while (!method.isPresent() && current != null);
		return method;
	}
```

### MethodCallInLoopCondition
Call to method `getParameterTypes()` in loop condition
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		List<List<?>> sets = new ArrayList<>();
		List<String> strings = Arrays.stream(annotation.value()).distinct().collect(toList());
		for (int i = 0; i < testMethod.getParameterTypes().length; i++)
			sets.add(strings);
		return sets;
```

## CallToSuspiciousStringMethod
### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/org/junitpioneer/jupiter/IssueTestSuite.java`
#### Snippet
```java
			return false;
		IssueTestSuite that = (IssueTestSuite) o;
		return issueId.equals(that.issueId) && tests.equals(that.tests);
	}

```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/org/junitpioneer/jupiter/IssueTestCase.java`
#### Snippet
```java
			return false;
		IssueTestCase that = (IssueTestCase) o;
		return testId.equals(that.testId) && result == that.result;
	}

```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/org/junitpioneer/jupiter/DefaultTimeZoneExtension.java`
#### Snippet
```java
		TimeZone configuredTimeZone = TimeZone.getTimeZone(timeZoneId);
		// TimeZone::getTimeZone returns with GMT as fallback if the given ID cannot be understood
		if (configuredTimeZone.equals(TimeZone.getTimeZone("GMT")) && !timeZoneId.equals("GMT")) {
			throw new ExtensionConfigurationException(String
					.format("@DefaultTimeZone not configured correctly. "
```

### CallToSuspiciousStringMethod
`String.equals()` called in internationalized context
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
		Parameter[] parameters = testMethod.getParameters();
		for (int i = 0; i < parameters.length; i++)
			if (parameters[i].getName().equals(name))
				return i;
		throw new ParameterResolutionException(
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/org/junitpioneer/internal/PioneerPreconditions.java`
#### Snippet
```java
	 */
	public static String notBlank(String str, Supplier<String> messageSupplier) {
		if (str == null || str.trim().isEmpty()) {
			throw new PreconditionViolationException(messageSupplier.get());
		}
```

### CallToSuspiciousStringMethod
`String.trim()` called in internationalized context
in `src/main/java/org/junitpioneer/internal/PioneerPreconditions.java`
#### Snippet
```java
	 */
	public static String notBlank(String str, String message) {
		if (str == null || str.trim().isEmpty()) {
			throw new PreconditionViolationException(message);
		}
```

## ClassWithoutLogger
### ClassWithoutLogger
Class `CartesianProductResolver` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/CartesianProductResolver.java`
#### Snippet
```java
 */
@Deprecated
class CartesianProductResolver implements ParameterResolver {

	private final List<?> parameters;
```

### ClassWithoutLogger
Class `ArgumentSets` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/ArgumentSets.java`
#### Snippet
```java
 * </p>
 */
public class ArgumentSets {

	private final List<List<?>> arguments;
```

### ClassWithoutLogger
Class `IssueExtensionExecutionListener` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/issue/IssueExtensionExecutionListener.java`
#### Snippet
```java
 * After all tests are finished the results are provided to an {@link IssueProcessor} for further processing.</p>
 */
public class IssueExtensionExecutionListener implements TestExecutionListener {

	public static final String REPORT_ENTRY_KEY = "IssueExtension";
```

### ClassWithoutLogger
Class `DefaultLocaleExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/DefaultLocaleExtension.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerAnnotationUtils;

class DefaultLocaleExtension implements BeforeEachCallback, AfterEachCallback {

	private static final Namespace NAMESPACE = Namespace.create(DefaultLocaleExtension.class);
```

### ClassWithoutLogger
Class `CartesianFactoryArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerUtils;

class CartesianFactoryArgumentsProvider
		implements CartesianMethodArgumentsProvider, AnnotationConsumer<CartesianTest.MethodFactory> {

```

### ClassWithoutLogger
Class `StdErr` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StdErr.java`
#### Snippet
```java
 * @see StdIo
 */
public class StdErr extends StdOutputStream {

	public StdErr() {
```

### ClassWithoutLogger
Class `JsonInlineArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JsonInlineArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from inline JSON specified with {@link JsonSource}.
 */
class JsonInlineArgumentsProvider extends AbstractJsonArgumentsProvider<JsonSource> {

	private List<String> jsonValues;
```

### ClassWithoutLogger
Class `IssueTestCaseBuilder` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/issue/IssueTestCaseBuilder.java`
#### Snippet
```java
import org.junitpioneer.jupiter.IssueTestCase;

class IssueTestCaseBuilder {

	private final String testId;
```

### ClassWithoutLogger
Class `StdIn` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StdIn.java`
#### Snippet
```java
 * @see StdIo
 */
public class StdIn extends InputStream {

	private final StringReader reader;
```

### ClassWithoutLogger
Class `JsonConverterProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JsonConverterProvider.java`
#### Snippet
```java
package org.junitpioneer.jupiter.json;

class JsonConverterProvider {

	private static final boolean JACKSON_PRESENT = isJacksonObjectMapperClassPresent();
```

### ClassWithoutLogger
Class `CartesianValueArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianValueArgumentsProvider.java`
#### Snippet
```java
 * for use with {@code @CartesianTest}.
 */
class CartesianValueArgumentsProvider
		implements CartesianParameterArgumentsProvider<Object>, AnnotationConsumer<CartesianTest.Values> {

```

### ClassWithoutLogger
Class `AbstractJsonArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/AbstractJsonArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from JSON files specified with {@link JsonFileSource}.
 */
abstract class AbstractJsonArgumentsProvider<A extends Annotation>
		implements ArgumentsProvider, AnnotationConsumer<A>, CartesianParameterArgumentsProvider<Object> {

```

### ClassWithoutLogger
Class `ReportEntryExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerUtils;

class ReportEntryExtension implements TestWatcher, BeforeEachCallback, InvocationInterceptor {

	private static final ExtensionContext.Namespace NAMESPACE = ExtensionContext.Namespace
```

### ClassWithoutLogger
Class `IssueTestSuite` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/IssueTestSuite.java`
#### Snippet
```java
 * @see IssueProcessor
 */
public final class IssueTestSuite {

	private final String issueId;
```

### ClassWithoutLogger
Class `EnvironmentVariableExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableExtension.java`
#### Snippet
```java
import org.junit.jupiter.api.extension.ExtensionContext;

class EnvironmentVariableExtension
		extends AbstractEntryBasedExtension<String, String, ClearEnvironmentVariable, SetEnvironmentVariable> {

```

### ClassWithoutLogger
Class `StopwatchExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StopwatchExtension.java`
#### Snippet
```java
 * The StopwatchExtension implements callback methods for the {@code @Stopwatch} annotation.
 */
class StopwatchExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

	private final Clock clock = Clock.systemUTC();
```

### ClassWithoutLogger
Class `CartesianProductTestInvocationContext` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestInvocationContext.java`
#### Snippet
```java
 */
@Deprecated
class CartesianProductTestInvocationContext implements TestTemplateInvocationContext {

	private final List<?> parameters;
```

### ClassWithoutLogger
Class `JsonFileSourceArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JsonFileSourceArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from JSON files specified with {@link JsonFileSource}.
 */
class JsonFileSourceArgumentsProvider extends AbstractJsonSourceBasedArgumentsProvider<JsonFileSource> {

	// the reading of the resources / files is heavily inspired by Jupiter's CsvFileArgumentsProvider
```

### ClassWithoutLogger
Class `CartesianEnumArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
 */
@Deprecated
class CartesianEnumArgumentsProvider implements CartesianAnnotationConsumer<CartesianEnumSource>, ArgumentsProvider { //NOSONAR deprecated interface use will be removed in later release

	private CartesianEnumSource enumSource;
```

### ClassWithoutLogger
Class `JacksonNode` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JacksonNode.java`
#### Snippet
```java
 * A {@link Node} implementation for Jackson 2.
 */
class JacksonNode implements Node {

	private final ObjectMapper objectMapper;
```

### ClassWithoutLogger
Class `EnvironmentVariableUtils` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableUtils.java`
#### Snippet
```java
 * Warning: If your {@link SecurityManager} does not allow modifications, it fails.
 */
class EnvironmentVariableUtils {

	private EnvironmentVariableUtils() {
```

### ClassWithoutLogger
Class `CartesianTestExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestExtension.java`
#### Snippet
```java
import org.junitpioneer.internal.TestNameFormatter;

class CartesianTestExtension implements TestTemplateInvocationContextProvider {

	@Override
```

### ClassWithoutLogger
Class `AbstractJsonSourceBasedArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/AbstractJsonSourceBasedArgumentsProvider.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerPreconditions;

abstract class AbstractJsonSourceBasedArgumentsProvider<A extends Annotation> extends AbstractJsonArgumentsProvider<A> {

	// the reading of the resources / files is heavily inspired by Jupiter's CsvFileArgumentsProvider
```

### ClassWithoutLogger
Class `AbstractEntryBasedExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
 * @param <S> The set annotation type.
 */
abstract class AbstractEntryBasedExtension<K, V, C extends Annotation, S extends Annotation>
		implements BeforeEachCallback, AfterEachCallback, BeforeAllCallback, AfterAllCallback {

```

### ClassWithoutLogger
Class `IssueTestCase` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/IssueTestCase.java`
#### Snippet
```java
 * @see IssueProcessor
 */
public final class IssueTestCase {

	private static final String NO_RESULT_EXCEPTION_MESSAGE = "The test case result should never be null (Nicolai thinks). If you see this exception, he was wrong - please open an issue at https://github.com/junit-pioneer/junit-pioneer/issues/new/choose .";
```

### ClassWithoutLogger
Class `PioneerAnnotationUtils` does not declare a logger
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
 * that is present on the element.
 */
public class PioneerAnnotationUtils {

	private PioneerAnnotationUtils() {
```

### ClassWithoutLogger
Class `DefaultTimeZoneExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/DefaultTimeZoneExtension.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerAnnotationUtils;

class DefaultTimeZoneExtension implements BeforeEachCallback, AfterEachCallback {

	private static final Namespace NAMESPACE = Namespace.create(DefaultTimeZoneExtension.class);
```

### ClassWithoutLogger
Class `DoubleRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/DoubleRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class DoubleRange extends Range<Double> {

	public DoubleRange(DoubleRangeSource source) {
```

### ClassWithoutLogger
Class `FloatRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/FloatRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class FloatRange extends Range<Float> {

	public FloatRange(FloatRangeSource source) {
```

### ClassWithoutLogger
Class `DisableIfNameExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfNameExtension.java`
#### Snippet
```java
import org.junitpioneer.internal.PioneerAnnotationUtils;

class DisableIfNameExtension implements ExecutionCondition {

	@Override
```

### ClassWithoutLogger
Class `Range` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/Range.java`
#### Snippet
```java
 * @param <N> The numerical type used by the range.
 */
abstract class Range<N extends Number & Comparable<N>> implements Iterator<N> {

	private N from;
```

### ClassWithoutLogger
Class `DisableIfTestFailsExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/DisableIfTestFailsExtension.java`
#### Snippet
```java
import org.opentest4j.TestAbortedException;

class DisableIfTestFailsExtension implements TestExecutionExceptionHandler, ExecutionCondition {

	/*
```

### ClassWithoutLogger
Class `ShortRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/ShortRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class ShortRange extends Range<Short> {

	public ShortRange(ShortRangeSource source) {
```

### ClassWithoutLogger
Class `RangeSourceArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/RangeSourceArgumentsProvider.java`
#### Snippet
```java
// CartesianAnnotationConsumer is deprecated for removal
@SuppressWarnings("deprecation")
class RangeSourceArgumentsProvider<N extends Number & Comparable<N>> implements ArgumentsProvider,
		org.junitpioneer.jupiter.CartesianAnnotationConsumer<Annotation>, CartesianParameterArgumentsProvider<N> { //NOSONAR deprecated interface use will be removed in later release

```

### ClassWithoutLogger
Class `JsonClasspathSourceArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JsonClasspathSourceArgumentsProvider.java`
#### Snippet
```java
 * Provides arguments from JSON files specified with {@link JsonClasspathSource}.
 */
class JsonClasspathSourceArgumentsProvider extends AbstractJsonSourceBasedArgumentsProvider<JsonClasspathSource> {

	// the reading of the resources / files is heavily inspired by Jupiter's CsvFileArgumentsProvider
```

### ClassWithoutLogger
Class `TestNameFormatter` does not declare a logger
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
import org.junit.jupiter.api.extension.ExtensionConfigurationException;

public final class TestNameFormatter {

	// This code is a slightly refactored variant of the JUnit Jupiter class
```

### ClassWithoutLogger
Class `RetryingTestInvocationContext` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/RetryingTestInvocationContext.java`
#### Snippet
```java
import org.junitpioneer.internal.TestNameFormatter;

class RetryingTestInvocationContext implements TestTemplateInvocationContext {

	private final TestNameFormatter formatter;
```

### ClassWithoutLogger
Class `DisableIfArgumentExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
import org.opentest4j.TestAbortedException;

class DisableIfArgumentExtension implements InvocationInterceptor {

	@Override
```

### ClassWithoutLogger
Class `JacksonJsonConverter` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/json/JacksonJsonConverter.java`
#### Snippet
```java
 * A {@link JsonConverter} using Jackson 2 {@link ObjectMapper} to perform the conversion
 */
class JacksonJsonConverter implements JsonConverter {

	private static final JacksonJsonConverter INSTANCE = new JacksonJsonConverter(new ObjectMapper());
```

### ClassWithoutLogger
Class `RetryingTestExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/RetryingTestExtension.java`
#### Snippet
```java
import org.opentest4j.TestAbortedException;

class RetryingTestExtension implements TestTemplateInvocationContextProvider, TestExecutionExceptionHandler {

	private static final Namespace NAMESPACE = Namespace.create(RetryingTestExtension.class);
```

### ClassWithoutLogger
Class `StdOut` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StdOut.java`
#### Snippet
```java
 * @see StdIo
 */
public class StdOut extends StdOutputStream {

	public StdOut() {
```

### ClassWithoutLogger
Class `IssueExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/IssueExtension.java`
#### Snippet
```java
 * @see Issue
 */
class IssueExtension implements BeforeEachCallback {

	@Override
```

### ClassWithoutLogger
Class `PioneerPreconditions` does not declare a logger
in `src/main/java/org/junitpioneer/internal/PioneerPreconditions.java`
#### Snippet
```java
 * DO NOT USE THIS CLASS - IT MAY CHANGE SIGNIFICANTLY IN ANY MINOR UPDATE.
 */
public class PioneerPreconditions {

	private PioneerPreconditions() {
```

### ClassWithoutLogger
Class `IntRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/IntRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class IntRange extends Range<Integer> {

	public IntRange(IntRangeSource source) {
```

### ClassWithoutLogger
Class `ExpectedExceptionExtension` does not declare a logger
in `src/main/java/org/junitpioneer/vintage/ExpectedExceptionExtension.java`
#### Snippet
```java
 * an exception of the specified type.
 */
class ExpectedExceptionExtension implements TestExecutionExceptionHandler, AfterTestExecutionCallback {

	/*
```

### ClassWithoutLogger
Class `LongRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/LongRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class LongRange extends Range<Long> {

	public LongRange(LongRangeSource source) {
```

### ClassWithoutLogger
Class `TimeoutExtension` does not declare a logger
in `src/main/java/org/junitpioneer/vintage/TimeoutExtension.java`
#### Snippet
```java
 * to interact with its threading model, this could not be implemented.
 */
class TimeoutExtension implements InvocationInterceptor {

	static final String TEST_RAN_TOO_LONG = "Test '%s' was supposed to run no longer than %d ms.";
```

### ClassWithoutLogger
Class `SystemPropertyExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/SystemPropertyExtension.java`
#### Snippet
```java
import java.util.function.Function;

class SystemPropertyExtension
		extends AbstractEntryBasedExtension<String, String, ClearSystemProperty, SetSystemProperty> {

```

### ClassWithoutLogger
Class `StdOutputStream` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StdOutputStream.java`
#### Snippet
```java
import java.nio.charset.Charset;

abstract class StdOutputStream extends OutputStream {

	private final StringWriter writer = new StringWriter();
```

### ClassWithoutLogger
Class `ByteRange` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/params/ByteRange.java`
#### Snippet
```java
package org.junitpioneer.jupiter.params;

class ByteRange extends Range<Byte> {

	public ByteRange(ByteRangeSource source) {
```

### ClassWithoutLogger
Class `StdIoExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
import org.junit.jupiter.api.extension.ParameterResolver;

class StdIoExtension implements ParameterResolver, BeforeEachCallback, AfterEachCallback {

	static final String SEPARATOR = System.getProperty("line.separator");
```

### ClassWithoutLogger
Class `CartesianProductResolver` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianProductResolver.java`
#### Snippet
```java
import org.junit.jupiter.api.extension.ParameterResolver;

class CartesianProductResolver implements ParameterResolver {

	private final List<?> parameters;
```

### ClassWithoutLogger
Class `CartesianEnumArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianEnumArgumentsProvider.java`
#### Snippet
```java
 * {@link CartesianParameterArgumentsProvider} for use with {@code @CartesianTest}.
 */
class CartesianEnumArgumentsProvider<E extends Enum<E>> implements CartesianParameterArgumentsProvider<E> {

	@Override
```

### ClassWithoutLogger
Class `CartesianValueArgumentsProvider` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/CartesianValueArgumentsProvider.java`
#### Snippet
```java
 */
@Deprecated
class CartesianValueArgumentsProvider implements CartesianAnnotationConsumer<CartesianValueSource>, ArgumentsProvider { //NOSONAR deprecated interface use will be removed in later release

	private Object[] arguments;
```

### ClassWithoutLogger
Class `PioneerUtils` does not declare a logger
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
 * @see PioneerAnnotationUtils
 */
public class PioneerUtils {

	private PioneerUtils() {
```

### ClassWithoutLogger
Class `DisabledUntilExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/DisabledUntilExtension.java`
#### Snippet
```java
 * @see DisabledUntil
 */
class DisabledUntilExtension implements ExecutionCondition {

	private static final DateTimeFormatter ISO_8601 = DateTimeFormatter.ISO_DATE;
```

### ClassWithoutLogger
Class `CartesianTestInvocationContext` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianTestInvocationContext.java`
#### Snippet
```java
import org.junitpioneer.internal.TestNameFormatter;

class CartesianTestInvocationContext implements TestTemplateInvocationContext {

	private final List<?> parameters;
```

### ClassWithoutLogger
Class `CartesianProductTestExtension` does not declare a logger
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
 */
@Deprecated
class CartesianProductTestExtension implements TestTemplateInvocationContextProvider {

	@Override
```

## MethodCount
### MethodCount
`AbstractEntryBasedExtension` has too many methods (method count = 27)
in `src/main/java/org/junitpioneer/jupiter/AbstractEntryBasedExtension.java`
#### Snippet
```java
 * @param <S> The set annotation type.
 */
abstract class AbstractEntryBasedExtension<K, V, C extends Annotation, S extends Annotation>
		implements BeforeEachCallback, AfterEachCallback, BeforeAllCallback, AfterAllCallback {

```

## UnusedReturnValue
### UnusedReturnValue
Return value of the method is never used
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTest.java`
#### Snippet
```java
		 * @return the {@code Sets} object, for fluent set definitions
		 */
		public Sets addAll(Iterable<?> entries) {
			return addAll(StreamSupport.stream(entries.spliterator(), false));
		}
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/org/junitpioneer/jupiter/issue/IssueTestCaseBuilder.java`
#### Snippet
```java
	}

	public IssueTestCaseBuilder setResult(Status result) {
		this.result = result;
		return this;
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private static DisableIfAllArguments verifyNonEmptyInputs(DisableIfAllArguments annotation) {
		if (annotation.contains().length > 0 == annotation.matches().length > 0)
			throw invalidInputs(DisableIfAllArguments.class);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private static DisableIfAnyArgument verifyNonEmptyInputs(DisableIfAnyArgument annotation) {
		if (annotation.contains().length > 0 == annotation.matches().length > 0)
			throw invalidInputs(DisableIfAnyArgument.class);
```

### UnusedReturnValue
Return value of the method is never used
in `src/main/java/org/junitpioneer/jupiter/params/DisableIfArgumentExtension.java`
#### Snippet
```java
	}

	private static DisableIfArgument verifyNonEmptyInputs(DisableIfArgument annotation) {
		if (annotation.contains().length > 0 == annotation.matches().length > 0)
			throw invalidInputs(DisableIfArgument.class);
```

## UncheckedExceptionClass
### UncheckedExceptionClass
Unchecked exception class `NoJsonParserConfiguredException`
in `src/main/java/org/junitpioneer/jupiter/json/NoJsonParserConfiguredException.java`
#### Snippet
```java
 * @since 1.7.0
 */
public class NoJsonParserConfiguredException extends JUnitException {

	private static final long serialVersionUID = 5399969575022498446L;
```

## DeclareCollectionAsInterface
### DeclareCollectionAsInterface
Declaration of `ArrayList` should probably be weakened to 'java.util.List'
in `src/main/java/org/junitpioneer/internal/PioneerUtils.java`
#### Snippet
```java
		for (Object item : firstList) {
			for (List<?> remainingList : remainingLists) {
				ArrayList<Object> resultList = new ArrayList<>();
				resultList.add(item);
				resultList.addAll(remainingList);
```

## Deprecation
### Deprecation
'org.junitpioneer.vintage.Test' is deprecated
in `src/main/java/org/junitpioneer/vintage/package-info.java`
#### Snippet
```java
 * <p>Check out the following types for details:
 * <ul>
 *     <li>{@link org.junitpioneer.vintage.Test}</li>
 * </ul>
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/FloatRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/FloatRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/FloatRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/IntRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/IntRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/IntRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ByteRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ByteRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 * </p>
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ByteRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ShortRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ShortRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/ShortRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

### Deprecation
'org.junitpioneer.vintage.Test' is deprecated
in `src/main/java/org/junitpioneer/vintage/ExpectedExceptionExtension.java`
#### Snippet
```java

/**
 * This extension implements the expected exception behavior of {@link Test @Test}, where a test only passes if it throws
 * an exception of the specified type.
 */
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/LongRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/LongRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/LongRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

### Deprecation
'org.junitpioneer.vintage.Test' is deprecated
in `src/main/java/org/junitpioneer/vintage/TimeoutExtension.java`
#### Snippet
```java

/**
 * This extension implements the timeout behavior of {@link Test @Test}, where a test is failed if it takes longer to finish
 * than the specified time.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/package-info.java`
#### Snippet
```java
 * Also check the following packages:
 * <ul>
 *     <li>{@link org.junitpioneer.jupiter.cartesian cartesian} (successor of {@link org.junitpioneer.jupiter.CartesianProductTest})</li>
 *     <li>{@link org.junitpioneer.jupiter.issue issue}</li>
 *     <li>{@link org.junitpioneer.jupiter.json json}</li>
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/DoubleRangeSource.java`
#### Snippet
```java
 * </p>
 *
 * <p>This annotation is {@link Repeatable}, to make it usable with {@link org.junitpioneer.jupiter.CartesianProductTest}.
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/DoubleRangeSource.java`
#### Snippet
```java
 * If used with {@link org.junit.jupiter.params.ParameterizedTest}, it can only be used once (because {@code ParameterizedTest}
 * can only take a single {@link ArgumentsSource}). Using it more than once will throw an {@link IllegalArgumentException}.
 * If used with {@link org.junitpioneer.jupiter.CartesianProductTest}, it can be repeated to provide arguments to
 * more than one parameter.
 *
```

### Deprecation
'org.junitpioneer.jupiter.CartesianProductTest' is deprecated
in `src/main/java/org/junitpioneer/jupiter/params/DoubleRangeSource.java`
#### Snippet
```java
 * @see ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junitpioneer.jupiter.CartesianProductTest
 * @see org.junitpioneer.jupiter.cartesian.CartesianTest
 */
```

## OverlyComplexBooleanExpression
### OverlyComplexBooleanExpression
Overly complex boolean expression (4 terms)
in `src/main/java/org/junitpioneer/jupiter/params/Range.java`
#### Snippet
```java
		int cmp = nextValue.compareTo(to);
		int overflowCheck = nextValue.compareTo(current);
		return ((cmp < 0 != sign < 0) && (overflowCheck < 0 == sign < 0)) || (closed && cmp == 0);
	}

```

### OverlyComplexBooleanExpression
Overly complex boolean expression (6 terms)
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
		boolean hasFactory = !annotation.factory().isEmpty();
		boolean hasValueSources = !valueSources.isEmpty();
		if (hasValue && hasFactory || hasValue && hasValueSources || hasFactory && hasValueSources)
			throw new ExtensionConfigurationException(
				"CartesianProductTest can only take exactly one type of arguments source.");
```

## LengthOneStringsInConcatenation
### LengthOneStringsInConcatenation
`"$"` can be replaced with '$'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
			String enclosingName = methodClass.getName();
			tryToLoadClass = tryToLoadClass
					.orElse(() -> ReflectionSupport.tryToLoadClass(enclosingName + "$" + className));
			methodClass = methodClass.getEnclosingClass();
		}
```

### LengthOneStringsInConcatenation
``"`"`` can be replaced with '\`'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianFactoryArgumentsProvider.java`
#### Snippet
```java
				.orElseThrow(() -> new ExtensionConfigurationException("Method `Stream<? extends Arguments> "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (factoryMustBeStatic(factory, testInstance, lifecycle) && !Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
```

### LengthOneStringsInConcatenation
`"}"` can be replaced with '}'
in `src/main/java/org/junitpioneer/jupiter/ReportEntryExtension.java`
#### Snippet
```java
		List<?> list = context.getStore(NAMESPACE).get(KEY, List.class);
		for (int i = 0; i < list.size(); i++) {
			parsed = parsed.replaceAll("\\{" + i + "}", PioneerUtils.nullSafeToString(list.get(i)));
		}

```

### LengthOneStringsInConcatenation
`"}"` can be replaced with '}'
in `src/main/java/org/junitpioneer/internal/TestNameFormatter.java`
#### Snippet
```java
			String replacement = IntStream
					.range(0, arguments.length)
					.mapToObj(index -> "{" + index + "}")
					.collect(joining(", "));
			result = result.replace(ARGUMENTS_PLACEHOLDER, replacement);
```

### LengthOneStringsInConcatenation
``"`"`` can be replaced with '\`'
in `src/main/java/org/junitpioneer/jupiter/CartesianProductTestExtension.java`
#### Snippet
```java
				.orElseThrow(() -> new ExtensionConfigurationException("Method `CartesianProductTest.Sets "
						+ factoryName + "()` not found in " + declaringClass + " or any enclosing class."));
		String method = "Method `" + factory + "`";
		if (!Modifier.isStatic(factory.getModifiers()))
			throw new ExtensionConfigurationException(method + " must be static.");
```

