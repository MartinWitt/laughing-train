# junit5 
 
# Bad smells
I found 767 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 263 | false |
| RuleId[ruleID=BoundedWildcard] | 192 | false |
| RuleId[ruleID=ReturnNull] | 47 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 40 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 19 | false |
| RuleId[ruleID=DataFlowIssue] | 16 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 15 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 14 | false |
| RuleId[ruleID=ThrowableNotThrown] | 12 | false |
| RuleId[ruleID=EmptyMethod] | 11 | false |
| RuleId[ruleID=ArrayEquality] | 11 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 10 | false |
| RuleId[ruleID=SystemOutErr] | 10 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 9 | false |
| RuleId[ruleID=UnstableApiUsage] | 8 | false |
| RuleId[ruleID=TestCaseWithNoTestMethods] | 7 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 6 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 5 | false |
| RuleId[ruleID=HasPlatformType] | 5 | false |
| RuleId[ruleID=NestedLambdaShadowedImplicitParameter] | 4 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 4 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 4 | false |
| RuleId[ruleID=OptionalContainsCollection] | 4 | false |
| RuleId[ruleID=Convert2MethodRef] | 4 | false |
| RuleId[ruleID=RedundantSuppression] | 4 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 4 | true |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 3 | true |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 3 | false |
| RuleId[ruleID=CodeBlock2Expr] | 3 | false |
| RuleId[ruleID=TestCaseWithConstructor] | 3 | false |
| RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup] | 3 | false |
| RuleId[ruleID=KotlinAnnotator] | 2 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 2 | false |
| RuleId[ruleID=MissortedModifiers] | 2 | false |
| RuleId[ruleID=OptionalAssignedToNull] | 2 | false |
| RuleId[ruleID=ConstantValue] | 2 | false |
| RuleId[ruleID=ClassCanBeRecord] | 2 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 1 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 1 | false |
| RuleId[ruleID=NestedAssignment] | 1 | false |
| RuleId[ruleID=RedundantUnmodifiable] | 1 | false |
| RuleId[ruleID=IOResource] | 1 | false |
| RuleId[ruleID=PatternVariableCanBeUsed] | 1 | false |
| RuleId[ruleID=CollectionContainsUrl] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	// ?> => non-capturing atomic group
	// ++ => possessive quantifier
	private static final Pattern SOURCE_CODE_SYNTAX_ARRAY_PATTERN = Pattern.compile("^([^\\[\\]]+)((?>\\[\\])++)$");

	private static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `junit-platform-console/src/main/java/org/junit/platform/console/options/AvailableOptions.java`
#### Snippet
```java
		@Option(names = "--config", paramLabel = "KEY=VALUE", arity = "1", description = "Set a configuration parameter for test discovery and execution. This option can be repeated.")
		public void setConfigurationParameters(Map<String, String> map) {
			for (String key : map.keySet()) {
				String newValue = map.get(key);
				validateUnique(key, newValue);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Branch in 'switch' is a duplicate of the default branch
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java
			case SUMMARY:
				// summary listener is always created and registered
				return Optional.empty();
			case FLAT:
				return Optional.of(new FlatPrintingListener(out, colorPalette));
```

## RuleId[ruleID=KotlinAnnotator]
### RuleId[ruleID=KotlinAnnotator]
Val cannot be reassigned
in `documentation/documentation.gradle.kts`
#### Snippet
```java
		classpath = files(modularProjects.map { it.sourceSets.main.get().compileClasspath })

		maxMemory = "1024m"
		destinationDir = file("$buildDir/docs/javadoc")

```

### RuleId[ruleID=KotlinAnnotator]
Val cannot be reassigned
in `documentation/documentation.gradle.kts`
#### Snippet
```java

		maxMemory = "1024m"
		destinationDir = file("$buildDir/docs/javadoc")

		doFirst {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`factoryMethods.size() > 0` can be replaced with '!factoryMethods.isEmpty()'
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
#### Snippet
```java
				&& !isTestMethod(method);
		List<Method> factoryMethods = candidates.stream().filter(isFactoryMethod).collect(toList());
		Preconditions.condition(factoryMethods.size() > 0, () -> {
			// If we didn't find the factory method using the isFactoryMethod Predicate, perhaps
			// the specified factory method has an invalid return type or is a test method.
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`candidates.size() > 0` can be replaced with '!candidates.isEmpty()'
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
#### Snippet
```java
			// the specified factory method has an invalid return type or is a test method.
			// In that case, we report the invalid candidates that were found.
			if (candidates.size() > 0) {
				return format(
					"Could not find valid factory method [%s] in class [%s] but found the following invalid candidates: %s",
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`node.children.size() > 0` can be replaced with '!node.children.isEmpty()'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/TreePrinter.java`
#### Snippet
```java
		// bar for printing stack traces, messages and reports.
		// See https://github.com/junit-team/junit5/issues/1531
		if (node.children.size() > 0) {
			return theme.blank() + theme.vertical();
		}
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/TagExpressions.java`
#### Snippet
```java
			@Override
			public String toString() {
				return "!" + toNegate + "";
			}
		};
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractJUnit3TestCase` has no concrete subclass
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/AbstractJUnit3TestCase.java`
#### Snippet
```java
 * @since 4.12
 */
public abstract class AbstractJUnit3TestCase extends TestCase {

	public void test() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractJunit4TestCaseWithConstructorParameter` has no concrete subclass
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/AbstractJunit4TestCaseWithConstructorParameter.java`
#### Snippet
```java
import org.junit.Test;

public abstract class AbstractJunit4TestCaseWithConstructorParameter {

	public AbstractJunit4TestCaseWithConstructorParameter(int parameter) {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
	}

	private static <T> Future<T> submitTask(ThrowingSupplier<T> supplier, AtomicReference<Thread> threadReference,
			ExecutorService executorService) {
		return executorService.submit(() -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Thread`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
	}

	private static <T> Future<T> submitTask(ThrowingSupplier<T> supplier, AtomicReference<Thread> threadReference,
			ExecutorService executorService) {
		return executorService.submit(() -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Thread`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java

	private static <T, E extends Throwable> T resolveFutureAndHandleException(Future<T> future, Duration timeout,
			Supplier<String> messageSupplier, Supplier<Thread> threadSupplier,
			Assertions.TimeoutFailureFactory<E> failureFactory) throws E {
		try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/BooleanExecutionCondition.java`
#### Snippet
```java
	private final Function<A, String> customDisabledReason;

	BooleanExecutionCondition(Class<A> annotationType, String enabledReason, String disabledReason,
			Function<A, String> customDisabledReason) {
		this.annotationType = annotationType;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/BooleanExecutionCondition.java`
#### Snippet
```java

	BooleanExecutionCondition(Class<A> annotationType, String enabledReason, String disabledReason,
			Function<A, String> customDisabledReason) {
		this.annotationType = annotationType;
		this.enabledReason = enabledReason;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/AbstractOsBasedExecutionCondition.java`
#### Snippet
```java
	private final Class<A> annotationType;

	AbstractOsBasedExecutionCondition(Class<A> annotationType) {
		this.annotationType = annotationType;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Executable`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertAll.java`
#### Snippet
```java
	}

	static void assertAll(String heading, Stream<Executable> executables) {
		Preconditions.notNull(executables, "executables stream must not be null");

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/AbstractRepeatableAnnotationCondition.java`
#### Snippet
```java
	private final Class<A> annotationType;

	AbstractRepeatableAnnotationCondition(Class<A> annotationType) {
		this.annotationType = annotationType;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/MethodBasedCondition.java`
#### Snippet
```java
	private final Function<A, String> customDisabledReason;

	MethodBasedCondition(Class<A> annotationType, Function<A, String> methodName,
			Function<A, String> customDisabledReason) {
		this.annotationType = annotationType;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/MethodBasedCondition.java`
#### Snippet
```java

	MethodBasedCondition(Class<A> annotationType, Function<A, String> methodName,
			Function<A, String> customDisabledReason) {
		this.annotationType = annotationType;
		this.methodName = methodName;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/InvocationInterceptor.java`
#### Snippet
```java
	 * @throws Throwable in case of failure
	 */
	default <T> T interceptTestClassConstructor(Invocation<T> invocation,
			ReflectiveInvocationContext<Constructor<T>> invocationContext, ExtensionContext extensionContext)
			throws Throwable {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
		 */
		@API(status = STABLE, since = "5.5")
		default <V> V getOrDefault(Object key, Class<V> requiredType, V defaultValue) {
			V value = get(key, requiredType);
			return (value != null ? value : defaultValue);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/EnumConfigurationParameterConverter.java`
#### Snippet
```java
	}

	public E get(String key, Function<String, Optional<String>> lookup, E defaultValue) {

		Optional<String> value = lookup.apply(key);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CHILD`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java
	}

	protected void orderChildrenTestDescriptors(TestDescriptor parentTestDescriptor, Class<CHILD> matchingChildrenType,
			Function<CHILD, WRAPPER> descriptorWrapperFactory, DescriptorWrapperOrderer descriptorWrapperOrderer) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CHILD`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java

	protected void orderChildrenTestDescriptors(TestDescriptor parentTestDescriptor, Class<CHILD> matchingChildrenType,
			Function<CHILD, WRAPPER> descriptorWrapperFactory, DescriptorWrapperOrderer descriptorWrapperOrderer) {

		Set<? extends TestDescriptor> children = parentTestDescriptor.getChildren();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WRAPPER`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java

	protected void orderChildrenTestDescriptors(TestDescriptor parentTestDescriptor, Class<CHILD> matchingChildrenType,
			Function<CHILD, WRAPPER> descriptorWrapperFactory, DescriptorWrapperOrderer descriptorWrapperOrderer) {

		Set<? extends TestDescriptor> children = parentTestDescriptor.getChildren();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PARENT`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java
	@SuppressWarnings("unchecked")
	protected void doWithMatchingDescriptor(Class<PARENT> parentTestDescriptorType, TestDescriptor testDescriptor,
			Consumer<PARENT> action, Function<PARENT, String> errorMessageBuilder) {

		if (parentTestDescriptorType.isInstance(testDescriptor)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PARENT`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java
	@SuppressWarnings("unchecked")
	protected void doWithMatchingDescriptor(Class<PARENT> parentTestDescriptorType, TestDescriptor testDescriptor,
			Consumer<PARENT> action, Function<PARENT, String> errorMessageBuilder) {

		if (parentTestDescriptorType.isInstance(testDescriptor)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super List`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
#### Snippet
```java
		private final MessageGenerator descriptorsRemovedMessageGenerator;

		DescriptorWrapperOrderer(Consumer<List<WRAPPER>> orderingAction,
				MessageGenerator descriptorsAddedMessageGenerator,
				MessageGenerator descriptorsRemovedMessageGenerator) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultTestInstances.java`
#### Snippet
```java

	@Override
	public <T> Optional<T> findInstance(Class<T> requiredType) {
		Preconditions.notNull(requiredType, "requiredType must not be null");
		ListIterator<Object> iterator = instances.listIterator(instances.size());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
#### Snippet
```java
	private final JupiterConfiguration configuration;

	ClassSelectorResolver(Predicate<String> classNameFilter, JupiterConfiguration configuration) {
		this.classNameFilter = classNameFilter;
		this.configuration = configuration;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InvocationInterceptorChain.java`
#### Snippet
```java
		private final List<InvocationInterceptor> interceptors;

		ValidatingInvocation(Invocation<T> delegate, List<InvocationInterceptor> interceptors) {
			this.delegate = delegate;
			this.interceptors = interceptors;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
	}

	<K, V> V getOrComputeIfAbsent(Namespace namespace, K key, Function<K, V> defaultCreator, Class<V> requiredType) {
		Object value = getOrComputeIfAbsent(namespace, key, defaultCreator);
		return castToRequiredType(key, value, requiredType);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/MutableExtensionRegistry.java`
#### Snippet
```java
	 * @see #getReversedExtensions(Class)
	 */
	private <E extends Extension> Stream<E> streamLocal(Class<E> extensionType) {
		// @formatter:off
		return this.registeredExtensions.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistry.java`
#### Snippet
```java
	 * @see #stream(Class)
	 */
	default <E extends Extension> List<E> getExtensions(Class<E> extensionType) {
		return stream(extensionType).collect(toCollection(ArrayList::new));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SameThreadTimeoutInvocation.java`
#### Snippet
```java
	private final Supplier<String> descriptionSupplier;

	SameThreadTimeoutInvocation(Invocation<T> delegate, TimeoutDuration timeout, ScheduledExecutorService executor,
			Supplier<String> descriptionSupplier) {
		this.delegate = delegate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Method`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java
		private final Set<String> dynamicDescendantSegmentTypes;

		MethodType(Predicate<Method> methodPredicate, String segmentType, String... dynamicDescendantSegmentTypes) {
			this.methodPredicate = methodPredicate;
			this.segmentType = segmentType;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestDescriptor`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java
	private Resolution resolve(Context context, List<Class<?>> enclosingClasses, Class<?> testClass,
			Supplier<Method> methodSupplier,
			BiFunction<TestDescriptor, Supplier<Set<? extends DiscoverySelector>>, Match> matchFactory) {
		if (!testClassPredicate.test(testClass)) {
			return unresolved();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Supplier`>
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java
	private Resolution resolve(Context context, List<Class<?>> enclosingClasses, Class<?> testClass,
			Supplier<Method> methodSupplier,
			BiFunction<TestDescriptor, Supplier<Set<? extends DiscoverySelector>>, Match> matchFactory) {
		if (!testClassPredicate.test(testClass)) {
			return unresolved();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Match`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java
	private Resolution resolve(Context context, List<Class<?>> enclosingClasses, Class<?> testClass,
			Supplier<Method> methodSupplier,
			BiFunction<TestDescriptor, Supplier<Set<? extends DiscoverySelector>>, Match> matchFactory) {
		if (!testClassPredicate.test(testClass)) {
			return unresolved();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SeparateThreadTimeoutInvocation.java`
#### Snippet
```java
	private final Supplier<String> descriptionSupplier;

	SeparateThreadTimeoutInvocation(Invocation<T> delegate, TimeoutDuration timeout,
			Supplier<String> descriptionSupplier) {
		this.delegate = delegate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`
#### Snippet
```java
		}

		private IOException createIOExceptionWithAttachedFailures(SortedMap<Path, IOException> failures) {
			// @formatter:off
			String joinedPaths = failures.keySet().stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOException`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`
#### Snippet
```java
		}

		private IOException createIOExceptionWithAttachedFailures(SortedMap<Path, IOException> failures) {
			// @formatter:off
			String joinedPaths = failures.keySet().stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super DisplayNameGenerator`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DisplayNameUtils.java`
#### Snippet
```java

	private static Supplier<String> createDisplayNameSupplier(Class<?> testClass, JupiterConfiguration configuration,
			Function<DisplayNameGenerator, String> generatorFunction) {
		return () -> findDisplayNameGenerator(testClass) //
				.map(generatorFunction) //
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExtendWith`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExtensionUtils.java`
#### Snippet
```java
	 * @since 5.8
	 */
	private static Stream<Class<? extends Extension>> streamExtensionTypes(List<ExtendWith> extendWithAnnotations) {
		return extendWithAnnotations.stream().map(ExtendWith::value).flatMap(Arrays::stream);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestWatcher`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodBasedTestDescriptor.java`
#### Snippet
```java
	 */
	protected void invokeTestWatchers(JupiterEngineExecutionContext context, boolean reverseOrder,
			Consumer<TestWatcher> callback) {

		ExtensionRegistry registry = context.getExtensionRegistry();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotatedElement`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExtension.java`
#### Snippet
```java

	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	private Optional<TimeoutDuration> readTimeoutFromAnnotation(Optional<AnnotatedElement> element) {
		return AnnotationSupport.findAnnotation(element, Timeout.class).map(TimeoutDuration::from);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotatedElement`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExtension.java`
#### Snippet
```java

	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	private Optional<ThreadMode> readTimeoutThreadModeFromAnnotation(Optional<AnnotatedElement> element) {
		return AnnotationSupport.findAnnotation(element, Timeout.class).map(Timeout::threadMode);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	}

	private <T extends Extension> void invokeAllAfterMethodsOrCallbacks(Class<T> type,
			JupiterEngineExecutionContext context, CallbackInvoker<T> callbackInvoker) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java

	private <T extends Extension> void invokeAllAfterMethodsOrCallbacks(Class<T> type,
			JupiterEngineExecutionContext context, CallbackInvoker<T> callbackInvoker) {

		ExtensionRegistry registry = context.getExtensionRegistry();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	}

	private <T extends Extension> void invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(Class<T> type,
			JupiterEngineExecutionContext context, CallbackInvoker<T> callbackInvoker) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java

	private <T extends Extension> void invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(Class<T> type,
			JupiterEngineExecutionContext context, CallbackInvoker<T> callbackInvoker) {

		ExtensionRegistry registry = context.getExtensionRegistry();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
#### Snippet
```java
	}

	private <E extends Extension> void invokeExecutionExceptionHandlers(List<E> exceptionHandlers, Throwable throwable,
			ExceptionHandlerInvoker<E> handlerInvoker) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
#### Snippet
```java

	private <E extends Extension> void invokeExecutionExceptionHandlers(List<E> exceptionHandlers, Throwable throwable,
			ExceptionHandlerInvoker<E> handlerInvoker) {

		// No handlers left?
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Method`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java

	private void registerMethodsAsExtensions(List<Method> methods, ExtensionRegistrar registrar,
			Function<Method, Extension> extensionSynthesizer) {

		methods.forEach(method -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Extension`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java

	private void registerMethodsAsExtensions(List<Method> methods, ExtensionRegistrar registrar,
			Function<Method, Extension> extensionSynthesizer) {

		methods.forEach(method -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestInstances`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
			ThrowableCollector throwableCollector);

	protected TestInstances instantiateTestClass(Optional<TestInstances> outerInstances, ExtensionRegistry registry,
			ExtensionContext extensionContext) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
#### Snippet
```java
		private final BiPredicate<String, Set<String>> selector;

		Mode(Validator validator, BiPredicate<String, Set<String>> selector) {
			this.validator = validator;
			this.selector = selector;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Set`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
#### Snippet
```java
		private final BiPredicate<String, Set<String>> selector;

		Mode(Validator validator, BiPredicate<String, Set<String>> selector) {
			this.validator = validator;
			this.selector = selector;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RunnerTestDescriptor`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java

	private Optional<RunnerTestDescriptor> addFilter(TestDescriptor parent,
			Function<RunnerTestDescriptor, Filter> filterCreator) {
		if (parent instanceof RunnerTestDescriptor) {
			RunnerTestDescriptor runnerTestDescriptor = (RunnerTestDescriptor) parent;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Filter`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/MethodSelectorResolver.java`
#### Snippet
```java

	private Optional<RunnerTestDescriptor> addFilter(TestDescriptor parent,
			Function<RunnerTestDescriptor, Filter> filterCreator) {
		if (parent instanceof RunnerTestDescriptor) {
			RunnerTestDescriptor runnerTestDescriptor = (RunnerTestDescriptor) parent;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RunnerTestDescriptor`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java`
#### Snippet
```java
	}

	public void applyFilters(Consumer<RunnerTestDescriptor> childrenCreator) {
		if (filters != null && !filters.isEmpty()) {
			if (runner instanceof Filterable) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestTag`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/VintageTestDescriptor.java`
#### Snippet
```java
	}

	private void addCategoriesAsTags(Set<TestTag> tags) {
		Category annotation = description.getAnnotation(Category.class);
		if (annotation != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestTag`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/VintageTestDescriptor.java`
#### Snippet
```java
	}

	private void addTagsFromParent(Set<TestTag> tags) {
		getParent().map(TestDescriptor::getTags).ifPresent(tags::addAll);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VintageDescriptors`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/TestRun.java`
#### Snippet
```java

	private Optional<VintageTestDescriptor> lookupUnambiguouslyOrApplyFallback(Description description,
			Function<VintageDescriptors, Optional<VintageTestDescriptor>> fallback) {
		VintageDescriptors vintageDescriptors = descriptionToDescriptors.getOrDefault(description,
			VintageDescriptors.NONE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestDescriptor`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java
	}

	private void fireExecutionStartedIncludingUnstartedAncestors(Optional<TestDescriptor> parent) {
		if (parent.isPresent() && canStart(parent.get())) {
			fireExecutionStartedIncludingUnstartedAncestors(parent.get().getParent());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java
	}

	private void handleFailure(Failure failure, Function<Throwable, TestExecutionResult> resultCreator,
			TestDescriptor testDescriptor) {
		TestExecutionResult result = resultCreator.apply(failure.getException());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestExecutionResult`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java
	}

	private void handleFailure(Failure failure, Function<Throwable, TestExecutionResult> resultCreator,
			TestDescriptor testDescriptor) {
		TestExecutionResult result = resultCreator.apply(failure.getException());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Description`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java

	private TestDescriptor findParent(Description description,
			Function<Description, Optional<VintageTestDescriptor>> lookup) {
		// @formatter:off
		return Optional.ofNullable(description.getTestClass())
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
#### Snippet
```java
	 */
	@API(status = STABLE, since = "1.3")
	default <T> Optional<T> get(String key, Function<String, T> transformer) {
		Preconditions.notNull(transformer, "transformer must not be null");
		return get(key).map(input -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
#### Snippet
```java
	 */
	@API(status = STABLE, since = "1.3")
	default <T> Optional<T> get(String key, Function<String, T> transformer) {
		Preconditions.notNull(transformer, "transformer must not be null");
		return get(key).map(input -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
#### Snippet
```java
	 * @param converter the converter function to apply
	 */
	static <T, V> Filter<T> adaptFilter(Filter<V> adaptee, Function<T, V> converter) {
		return input -> adaptee.apply(converter.apply(input));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
#### Snippet
```java
	 * @param converter the converter function to apply
	 */
	static <T, V> Filter<T> adaptFilter(Filter<V> adaptee, Function<T, V> converter) {
		return input -> adaptee.apply(converter.apply(input));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
#### Snippet
```java
	 * @param converter the converter function to apply
	 */
	static <T, V> Filter<T> adaptFilter(Filter<V> adaptee, Function<T, V> converter) {
		return input -> adaptee.apply(converter.apply(input));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Segment`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/UniqueId.java`
#### Snippet
```java
	 * to the list instance that they pass into this constructor.
	 */
	UniqueId(UniqueIdFormat uniqueIdFormat, List<Segment> segments) {
		this.uniqueIdFormat = uniqueIdFormat;
		this.segments = segments;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super C`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
#### Snippet
```java
	 */
	@API(status = EXPERIMENTAL, since = "1.4")
	default void around(C context, Invocation<C> invocation) throws Exception {
		invocation.invoke(context);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Function`, R>
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolver.java`
#### Snippet
```java
	}

	private <R> List<R> instantiate(List<Function<InitializationContext<T>, R>> creators,
			InitializationContext<T> context) {
		return creators.stream().map(creator -> creator.apply(context)).collect(toCollection(ArrayList::new));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExclusiveTask`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
#### Snippet
```java
	}

	private void forkConcurrentTasks(List<? extends TestTask> tasks, Deque<ExclusiveTask> nonConcurrentTasks,
			Deque<ExclusiveTask> concurrentTasksInReverseOrder) {
		for (TestTask testTask : tasks) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExclusiveTask`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
#### Snippet
```java

	private void forkConcurrentTasks(List<? extends TestTask> tasks, Deque<ExclusiveTask> nonConcurrentTasks,
			Deque<ExclusiveTask> concurrentTasksInReverseOrder) {
		for (TestTask testTask : tasks) {
			ExclusiveTask exclusiveTask = new ExclusiveTask(testTask);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExclusiveTask`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
#### Snippet
```java
	}

	private void executeNonConcurrentTasks(Deque<ExclusiveTask> nonConcurrentTasks) {
		for (ExclusiveTask task : nonConcurrentTasks) {
			task.compute();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExclusiveTask`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
#### Snippet
```java

	private void joinConcurrentTasksInReverseOrderToEnableWorkStealing(
			Deque<ExclusiveTask> concurrentTasksInReverseOrder) {
		for (ExclusiveTask forkedTask : concurrentTasksInReverseOrder) {
			forkedTask.join();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExclusiveResource`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTreeWalker.java`
#### Snippet
```java
	}

	private boolean isReadOnly(Set<ExclusiveResource> exclusiveResources) {
		return exclusiveResources.stream().allMatch(
			exclusiveResource -> exclusiveResource.getLockMode() == ExclusiveResource.LockMode.READ);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestDescriptor`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTreeWalker.java`
#### Snippet
```java
	}

	private void doForChildrenRecursively(TestDescriptor parent, Consumer<TestDescriptor> consumer) {
		parent.getChildren().forEach(child -> {
			consumer.accept(child);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Lock`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/CompositeLock.java`
#### Snippet
```java
	}

	private void release(List<Lock> acquiredLocks) {
		for (int i = acquiredLocks.size() - 1; i >= 0; i--) {
			acquiredLocks.get(i).unlock();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExclusiveResource`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/LockManager.java`
#### Snippet
```java
	}

	private List<Lock> getDistinctSortedLocks(Collection<ExclusiveResource> resources) {
		// @formatter:off
		Map<String, List<ExclusiveResource>> resourcesByKey = resources.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestDescriptor`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java
		@SuppressWarnings("unchecked")
		private <T extends TestDescriptor> Optional<T> createAndAdd(TestDescriptor parent,
				Function<TestDescriptor, Optional<T>> creator) {
			Optional<T> child = creator.apply(parent);
			if (child.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DiscoverySelector`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java

		@Override
		public <T extends TestDescriptor> Optional<T> addToParent(Supplier<DiscoverySelector> parentSelectorSupplier,
				Function<TestDescriptor, Optional<T>> creator) {
			if (parent != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SelectorResolver`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java

	private Optional<Resolution> resolve(DiscoverySelector selector,
			Function<SelectorResolver, Resolution> resolutionFunction) {
		// @formatter:off
		return resolvers.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Resolution`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java

	private Optional<Resolution> resolve(DiscoverySelector selector,
			Function<SelectorResolver, Resolution> resolutionFunction) {
		// @formatter:off
		return resolvers.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SelectorResolver`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java

	EngineDiscoveryRequestResolution(EngineDiscoveryRequest request, TestDescriptor engineDescriptor,
			List<SelectorResolver> resolvers, List<TestDescriptor.Visitor> visitors) {
		this.request = request;
		this.engineDescriptor = engineDescriptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestDescriptor.Visitor`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
#### Snippet
```java

	EngineDiscoveryRequestResolution(EngineDiscoveryRequest request, TestDescriptor engineDescriptor,
			List<SelectorResolver> resolvers, List<TestDescriptor.Visitor> visitors) {
		this.request = request;
		this.engineDescriptor = engineDescriptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super DemoEngineExecutionContext`
in `junit-platform-engine/src/testFixtures/java/org/junit/platform/engine/support/hierarchical/DemoHierarchicalTestDescriptor.java`
#### Snippet
```java

	public DemoHierarchicalTestDescriptor(UniqueId uniqueId, String displayName, TestSource source,
			BiConsumer<DemoEngineExecutionContext, TestDescriptor> executeBlock) {
		super(uniqueId, displayName, source);
		this.executeBlock = executeBlock;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestDescriptor`
in `junit-platform-engine/src/testFixtures/java/org/junit/platform/engine/support/hierarchical/DemoHierarchicalTestDescriptor.java`
#### Snippet
```java

	public DemoHierarchicalTestDescriptor(UniqueId uniqueId, String displayName, TestSource source,
			BiConsumer<DemoEngineExecutionContext, TestDescriptor> executeBlock) {
		super(uniqueId, displayName, source);
		this.executeBlock = executeBlock;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super UniqueId`
in `junit-platform-engine/src/testFixtures/java/org/junit/platform/engine/support/hierarchical/DemoHierarchicalTestEngine.java`
#### Snippet
```java

	public <T extends TestDescriptor & Node<DemoEngineExecutionContext>> T addChild(String uniqueName,
			Function<UniqueId, T> creator, String segmentType) {
		var uniqueId = engineDescriptor.getUniqueId().append(segmentType, uniqueName);
		var child = creator.apply(uniqueId);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FileSystem`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CloseablePath.java`
#### Snippet
```java
	}

	private static CloseablePath createForJarFileSystem(URI jarUri, Function<FileSystem, Path> pathProvider) {
		ManagedFileSystem managedFileSystem = MANAGED_FILE_SYSTEMS.compute(jarUri,
			(__, oldValue) -> oldValue == null ? new ManagedFileSystem(jarUri) : oldValue.retain());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CloseablePath.java`
#### Snippet
```java
	}

	private static CloseablePath createForJarFileSystem(URI jarUri, Function<FileSystem, Path> pathProvider) {
		ManagedFileSystem managedFileSystem = MANAGED_FILE_SYSTEMS.compute(jarUri,
			(__, oldValue) -> oldValue == null ? new ManagedFileSystem(jarUri) : oldValue.retain());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassFileVisitor.java`
#### Snippet
```java
	private final Consumer<Path> classFileConsumer;

	ClassFileVisitor(Consumer<Path> classFileConsumer) {
		this.classFileConsumer = classFileConsumer;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/FunctionUtils.java`
#### Snippet
```java
	 * @param predicate the predicate to test against the result of the function
	 */
	public static <T, V> Predicate<T> where(Function<T, V> function, Predicate<? super V> predicate) {
		Preconditions.notNull(function, "function must not be null");
		Preconditions.notNull(predicate, "predicate must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Package`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/PackageUtils.java`
#### Snippet
```java
	 * @see Package#getImplementationVersion()
	 */
	public static Optional<String> getAttribute(Class<?> type, Function<Package, String> function) {
		Preconditions.notNull(type, "type must not be null");
		Preconditions.notNull(function, "function must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java

	private void processClassFileSafely(Path baseDir, String basePackageName, ClassFilter classFilter, Path classFile,
			Consumer<Class<?>> classConsumer) {
		try {
			String fullyQualifiedClassName = determineFullyQualifiedClassName(baseDir, basePackageName, classFile);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassLoader`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java
	private final BiFunction<String, ClassLoader, Try<Class<?>>> loadClass;

	ClasspathScanner(Supplier<ClassLoader> classLoaderSupplier,
			BiFunction<String, ClassLoader, Try<Class<?>>> loadClass) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java

	ClasspathScanner(Supplier<ClassLoader> classLoaderSupplier,
			BiFunction<String, ClassLoader, Try<Class<?>>> loadClass) {

		this.classLoaderSupplier = classLoaderSupplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ClassLoader`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java

	ClasspathScanner(Supplier<ClassLoader> classLoaderSupplier,
			BiFunction<String, ClassLoader, Try<Class<?>>> loadClass) {

		this.classLoaderSupplier = classLoaderSupplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Try`>
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java

	ClasspathScanner(Supplier<ClassLoader> classLoaderSupplier,
			BiFunction<String, ClassLoader, Try<Class<?>>> loadClass) {

		this.classLoaderSupplier = classLoaderSupplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Try`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public Try<V> orElse(Supplier<Try<V>> supplier) {
			checkNotNull(supplier, "supplier");
			return Try.of(supplier::get);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public <U> Try<U> andThenTry(Transformer<V, U> transformer) {
			checkNotNull(transformer, "transformer");
			return Try.call(() -> transformer.apply(this.value));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public <U> Try<U> andThenTry(Transformer<V, U> transformer) {
			checkNotNull(transformer, "transformer");
			return Try.call(() -> transformer.apply(this.value));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Try`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java
	}

	private static <V> Try<V> of(Callable<Try<V>> action) {
		try {
			return action.call();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public <U> Try<U> andThen(Function<V, Try<U>> function) {
			checkNotNull(function, "function");
			return Try.of(() -> function.apply(this.value));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Try`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public <U> Try<U> andThen(Function<V, Try<U>> function) {
			checkNotNull(function, "function");
			return Try.of(() -> function.apply(this.value));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Exception`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public Try<V> ifFailure(Consumer<Exception> causeConsumer) {
			checkNotNull(causeConsumer, "causeConsumer");
			causeConsumer.accept(this.cause);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java
	 * @see #failure(Exception)
	 */
	public static <V> Try<V> call(Callable<V> action) {
		checkNotNull(action, "action");
		return Try.of(() -> success(action.call()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/function/Try.java`
#### Snippet
```java

		@Override
		public Try<V> ifSuccess(Consumer<V> valueConsumer) {
			checkNotNull(valueConsumer, "valueConsumer");
			valueConsumer.accept(this.value);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	 * @see Thread#getContextClassLoader()
	 */
	public static List<ClasspathRootSelector> selectClasspathRoots(Set<Path> classpathRoots) {
		Preconditions.notNull(classpathRoots, "classpathRoots must not be null");

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-commons/src/testFixtures/java/org/junit/platform/commons/test/ConcurrencyTestingUtils.java`
#### Snippet
```java
	}

	public static <T> List<T> executeConcurrently(int threads, Callable<T> action) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(threads);
		try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ModuleReference`
in `junit-platform-commons/src/main/java9/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
	 * filter, and loader.
	 */
	private static List<Class<?>> scan(Set<ModuleReference> references, ClassFilter filter, ClassLoader loader) {
		logger.debug(() -> "Scanning " + references.size() + " module references: " + references);
		ModuleReferenceScanner scanner = new ModuleReferenceScanner(filter, loader);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-commons/src/main/java9/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
	 * Stream resolved modules from the supplied layer.
	 */
	private static Stream<ResolvedModule> streamResolvedModules(Predicate<String> moduleNamePredicate,
			ModuleLayer layer) {
		logger.debug(() -> "Streaming modules for layer @" + System.identityHashCode(layer) + ": " + layer);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreeNode`
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/TreePrintingListener.java`
#### Snippet
```java
	}

	private void addNode(TestIdentifier testIdentifier, Supplier<TreeNode> nodeSupplier) {
		TreeNode node = nodeSupplier.get();
		nodesByUniqueId.put(testIdentifier.getUniqueIdObject(), node);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Launcher`
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java

	// for tests only
	ConsoleTestExecutor(CommandLineOptions options, Supplier<Launcher> launcherSupplier) {
		this.options = options;
		this.launcherSupplier = launcherSupplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassLoader`
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/CustomContextClassLoaderExecutor.java`
#### Snippet
```java
	private final Optional<ClassLoader> customClassLoader;

	CustomContextClassLoaderExecutor(Optional<ClassLoader> customClassLoader) {
		this.customClassLoader = customClassLoader;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/TestExecutionResultConditions.java`
#### Snippet
```java
	}

	private static Condition<Throwable> suppressed(int index, Condition<Throwable> condition) {
		return new Condition<>(
			throwable -> throwable.getSuppressed().length > index
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/TestExecutionResultConditions.java`
#### Snippet
```java
	 * the supplied {@link Predicate}.
	 */
	public static Condition<Throwable> message(Predicate<String> expectedMessagePredicate) {
		return new Condition<>(where(Throwable::getMessage, expectedMessagePredicate), "message matches predicate");
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/TestExecutionResultConditions.java`
#### Snippet
```java
	}

	private static Condition<Throwable> cause(Condition<Throwable> condition) {
		return new Condition<>(throwable -> condition.matches(throwable.getCause()), "throwable cause matches %s",
			condition);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-console/src/main/java/org/junit/platform/console/options/AvailableOptions.java`
#### Snippet
```java
	}

	private static <T> List<T> merge(List<T> list1, List<T> list2) {
		List<T> result = new ArrayList<>(list1);
		result.addAll(list2);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-console/src/main/java/org/junit/platform/console/options/AvailableOptions.java`
#### Snippet
```java
	}

	private static <T> List<T> merge(List<T> list1, List<T> list2) {
		List<T> result = new ArrayList<>(list1);
		result.addAll(list2);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Event.java`
#### Snippet
```java
	 * @see #getRequiredPayload(Class)
	 */
	public <T> Optional<T> getPayload(Class<T> payloadType) {
		Preconditions.notNull(payloadType, "Payload type must not be null");
		return getPayload().filter(payloadType::isInstance).map(payloadType::cast);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Executable`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Assertions.java`
#### Snippet
```java
	}

	static void assertAll(String heading, Stream<Executable> executables) {
		Preconditions.notNull(executables, "executables stream must not be null");

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Executions.java`
#### Snippet
```java
	 * Create executions from the supplied list of events.
	 */
	private static List<Execution> createExecutions(List<Event> events) {
		List<Execution> executions = new ArrayList<>();
		Map<TestDescriptor, Instant> executionStarts = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TerminationInfo`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Executions.java`
#### Snippet
```java
	}

	private Stream<Execution> executionsByTerminationInfo(Predicate<TerminationInfo> predicate) {
		return filter(execution -> predicate.test(execution.getTerminationInfo()));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestDescriptor`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestPlan.java`
#### Snippet
```java
	 */
	@API(status = INTERNAL, since = "1.0")
	public static TestPlan from(Collection<TestDescriptor> engineDescriptors,
			ConfigurationParameters configurationParameters) {
		Preconditions.notNull(engineDescriptors, "Cannot create TestPlan from a null collection of TestDescriptors");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 * {@code Condition}.
	 */
	public static Condition<Event> dynamicTestRegistered(Condition<Event> condition) {
		return allOf(type(DYNAMIC_TEST_REGISTERED), condition);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 * {@linkplain TestDescriptor#isContainer() container}.
	 */
	public static Condition<Event> container(Condition<Event> condition) {
		return allOf(container(), condition);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.8")
	public static Condition<Event> nestedContainer(Class<?> clazz, Condition<Event> condition) {
		return allOf(nestedContainer(clazz), condition);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestExecutionResult`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 * {@link TestExecutionResult} that matches the supplied {@code Condition}.
	 */
	public static Condition<Event> result(Condition<TestExecutionResult> condition) {
		return new Condition<>(byPayload(TestExecutionResult.class, condition::matches), "event with result where %s",
			condition);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 * {@link String} that matches the supplied {@link Predicate}.
	 */
	public static Condition<Event> reason(Predicate<String> predicate) {
		return new Condition<>(byPayload(String.class, predicate), "event with custom reason predicate");
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventConditions.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.8")
	public static Condition<Event> test(Condition<Event> condition) {
		return allOf(test(), condition);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super List`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ListenerRegistry.java`
#### Snippet
```java
	private final ArrayList<T> listeners = new ArrayList<>();

	private ListenerRegistry(Function<List<T>, T> compositeListenerFactory) {
		this.compositeListenerFactory = compositeListenerFactory;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ListenerRegistry.java`
#### Snippet
```java
	private final ArrayList<T> listeners = new ArrayList<>();

	private ListenerRegistry(Function<List<T>, T> compositeListenerFactory) {
		this.compositeListenerFactory = compositeListenerFactory;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParameterProvider`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
#### Snippet
```java
	private final List<ParameterProvider> providers;

	private LauncherConfigurationParameters(List<ParameterProvider> providers) {
		this.providers = providers;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StreamInterceptor`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java
	}

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StreamInterceptor`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
		this.stderrInterceptor = stderrInterceptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestIdentifier`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
		this.stderrInterceptor = stderrInterceptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ReportEntry`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
		this.stderrInterceptor = stderrInterceptor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
#### Snippet
```java

	@Override
	public <T extends DiscoverySelector> List<T> getSelectorsByType(Class<T> selectorType) {
		Preconditions.notNull(selectorType, "selectorType must not be null");
		return this.selectors.stream().filter(selectorType::isInstance).map(selectorType::cast).collect(toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
#### Snippet
```java

	@Override
	public <T extends DiscoveryFilter<?>> List<T> getFiltersByType(Class<T> filterType) {
		Preconditions.notNull(filterType, "filterType must not be null");
		return this.discoveryFilters.stream().filter(filterType::isInstance).map(filterType::cast).collect(toList());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EngineFilter`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
#### Snippet
```java
	private final LauncherDiscoveryListener discoveryListener;

	DefaultDiscoveryRequest(List<DiscoverySelector> selectors, List<EngineFilter> engineFilters,
			List<DiscoveryFilter<?>> discoveryFilters, List<PostDiscoveryFilter> postDiscoveryFilters,
			LauncherConfigurationParameters configurationParameters, LauncherDiscoveryListener discoveryListener) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PostDiscoveryFilter`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
#### Snippet
```java

	DefaultDiscoveryRequest(List<DiscoverySelector> selectors, List<EngineFilter> engineFilters,
			List<DiscoveryFilter<?>> discoveryFilters, List<PostDiscoveryFilter> postDiscoveryFilters,
			LauncherConfigurationParameters configurationParameters, LauncherDiscoveryListener discoveryListener) {
		this.selectors = selectors;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/CompositeTestExecutionListener.java`
#### Snippet
```java
	}

	private static <T extends TestExecutionListener> void notifyEach(List<T> listeners, Consumer<T> consumer,
			Supplier<String> description) {
		listeners.forEach(listener -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/CompositeTestExecutionListener.java`
#### Snippet
```java
	}

	private static <T extends TestExecutionListener> void notifyEach(List<T> listeners, Consumer<T> consumer,
			Supplier<String> description) {
		listeners.forEach(listener -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/CompositeEngineExecutionListener.java`
#### Snippet
```java
	}

	private static <T extends EngineExecutionListener> void notifyEach(List<T> listeners, Consumer<T> consumer,
			Supplier<String> description) {
		listeners.forEach(listener -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/CompositeEngineExecutionListener.java`
#### Snippet
```java
	}

	private static <T extends EngineExecutionListener> void notifyEach(List<T> listeners, Consumer<T> consumer,
			Supplier<String> description) {
		listeners.forEach(listener -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestEngine`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/TestEngineFormatter.java`
#### Snippet
```java
	}

	private static String format(String title, Stream<TestEngine> testEngines) {
		String details = testEngines //
				.map(engine -> String.format("- %s (%s)", engine.getId(), join(", ", computeAttributes(engine)))) //
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EngineFilter`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineFilterer.java`
#### Snippet
```java
	private final Map<TestEngine, Boolean> checkedTestEngines = new HashMap<>();

	EngineFilterer(List<EngineFilter> engineFilters) {
		this.engineFilters = engineFilters;
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java

	@SafeVarargs
	private static void assertEventsMatchExactly(List<Event> events, Condition<? super Event>... conditions) {
		Assertions.assertThat(events).hasSize(conditions.length);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java
	}

	private static void checkCondition(List<Event> events, SoftAssertions softly, Condition<? super Event> condition) {
		if (events.stream().noneMatch(condition::matches)) {
			softly.fail("Condition did not match any event: " + condition);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super EventStatistics`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java
	 * @return this {@code Events} object for method chaining; never {@code null}
	 */
	public Events assertStatistics(Consumer<EventStatistics> statisticsConsumer) {
		Preconditions.notNull(statisticsConsumer, "Consumer must not be null");
		EventStatistics eventStatistics = new EventStatistics(this, this.category);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Event`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java
	private final String category;

	Events(Stream<Event> events, String category) {
		this(Preconditions.notNull(events, "Event stream must not be null").collect(toList()), category);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestExecutionListener`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineExecutionOrchestrator.java`
#### Snippet
```java

	private void withInterceptedStreams(ConfigurationParameters configurationParameters,
			ListenerRegistry<TestExecutionListener> listenerRegistry, Consumer<TestExecutionListener> action) {

		TestExecutionListener testExecutionListener = listenerRegistry.getCompositeListener();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PrintStream`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptor.java`
#### Snippet
```java
	}

	private StreamInterceptor(PrintStream originalStream, Consumer<PrintStream> unregisterAction,
			int maxNumberOfBytesPerThread) {
		super(originalStream);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Field`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 */
	public static List<Field> findAnnotatedFields(Class<?> clazz, Class<? extends Annotation> annotationType,
			Predicate<Field> predicate, HierarchyTraversalMode traversalMode) {

		Preconditions.notNull(clazz, "Class must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/OutputDir.java`
#### Snippet
```java
	 * Package private for testing purposes.
	 */
	static OutputDir createSafely(Optional<String> customDir, Supplier<Path> currentWorkingDir) throws IOException {
		Path cwd = currentWorkingDir.get();
		Path outputDir;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParseStatus`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseStatus.java`
#### Snippet
```java
	}

	public ParseStatus process(Supplier<ParseStatus> step) {
		if (isSuccess()) {
			return step.get();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java
	}

	private void collectTestDescription(TestIdentifier identifier, List<String> descriptionParts) {
		descriptionParts.add(0, identifier.getDisplayName());
		this.testPlan.getParent(identifier).ifPresent(parent -> collectTestDescription(parent, descriptionParts));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java

	private void printStackTrace(PrintWriter writer, StackTraceElement[] parentTrace, Throwable throwable,
			String caption, String indentation, Set<Throwable> seenThrowables, int max) {
		if (seenThrowables.contains(throwable)) {
			writer.printf("%s%s[%s%s]%n", indentation, TAB, CIRCULAR, throwable);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseResult.java`
#### Snippet
```java
	 * this parse result contains a parse error; never {@code null}.
	 */
	default TagExpression tagExpressionOrThrow(Function<String, RuntimeException> exceptionCreator) {
		if (errorMessage().isPresent()) {
			throw exceptionCreator.apply(errorMessage().get());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuntimeException`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseResult.java`
#### Snippet
```java
	 * this parse result contains a parse error; never {@code null}.
	 */
	default TagExpression tagExpressionOrThrow(Function<String, RuntimeException> exceptionCreator) {
		if (errorMessage().isPresent()) {
			throw exceptionCreator.apply(errorMessage().get());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Token`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ShuntingYard.java`
#### Snippet
```java
	private final List<Token> tokens;

	ShuntingYard(List<Token> tokens) {
		this.tokens = tokens;
		pushOperatorAt(SentinelToken, Sentinel);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestIdentifier`
in `junit-platform-reporting/src/main/java/org/junit/platform/reporting/legacy/xml/XmlReportData.java`
#### Snippet
```java
	}

	private Optional<TestIdentifier> findAncestor(TestIdentifier testIdentifier, Predicate<TestIdentifier> predicate) {
		Optional<TestIdentifier> current = Optional.of(testIdentifier);
		while (current.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TokenWith`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java
	}

	private String createMissingOperandMessage(Stack<TokenWith<TagExpression>> expressions, Token operatorToken) {
		if (1 == arity) {
			return missingOneOperand(associativity == Left ? "lhs" : "rhs");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TagExpression`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java

	static Operator unaryOperator(String representation, int precedence, Associativity associativity,
			Function<TagExpression, TagExpression> unaryExpression) {

		return new Operator(representation, precedence, 1, associativity, (expressions, operatorToken) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TagExpression`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java

	static Operator unaryOperator(String representation, int precedence, Associativity associativity,
			Function<TagExpression, TagExpression> unaryExpression) {

		return new Operator(representation, precedence, 1, associativity, (expressions, operatorToken) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TagExpression`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java

	static Operator binaryOperator(String representation, int precedence, Associativity associativity,
			BiFunction<TagExpression, TagExpression, TagExpression> binaryExpression) {

		return new Operator(representation, precedence, 2, associativity, (expressions, operatorToken) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TagExpression`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java

	static Operator binaryOperator(String representation, int precedence, Associativity associativity,
			BiFunction<TagExpression, TagExpression, TagExpression> binaryExpression) {

		return new Operator(representation, precedence, 2, associativity, (expressions, operatorToken) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TagExpression`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Operator.java`
#### Snippet
```java

	static Operator binaryOperator(String representation, int precedence, Associativity associativity,
			BiFunction<TagExpression, TagExpression, TagExpression> binaryExpression) {

		return new Operator(representation, precedence, 2, associativity, (expressions, operatorToken) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java
	}

	private void logTestDescriptorExclusionReasons(Map<String, List<TestDescriptor>> excludedTestDescriptorsByReason) {
		excludedTestDescriptorsByReason.forEach((exclusionReason, testDescriptors) -> {
			String displayNames = testDescriptors.stream().map(TestDescriptor::getDisplayName).collect(joining(", "));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PostDiscoveryFilter`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java

	private void applyPostDiscoveryFilters(Map<TestEngine, TestDescriptor> testEngineDescriptors,
			List<PostDiscoveryFilter> filters) {
		Filter<TestDescriptor> postDiscoveryFilter = composeFilters(filters);
		Map<String, List<TestDescriptor>> excludedTestDescriptorsByReason = new LinkedHashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestDescriptor`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java
	}

	private void acceptInAllTestEngines(Map<TestEngine, TestDescriptor> testEngineDescriptors,
			TestDescriptor.Visitor visitor) {
		testEngineDescriptors.values().forEach(descriptor -> descriptor.accept(visitor));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PostDiscoveryFilter`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java
	}

	EngineDiscoveryOrchestrator(Iterable<TestEngine> testEngines, Collection<PostDiscoveryFilter> postDiscoveryFilters,
			ListenerRegistry<LauncherDiscoveryListener> launcherDiscoveryListenerRegistry) {
		this.testEngines = EngineIdValidator.validate(testEngines);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java

	private TestDescriptor discoverEngineRoot(TestEngine testEngine, LauncherDiscoveryRequest request,
			LauncherDiscoveryListener listener, Function<String, UniqueId> uniqueIdCreator) {
		UniqueId uniqueEngineId = uniqueIdCreator.apply(testEngine.getId());
		try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UniqueId`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java

	private TestDescriptor discoverEngineRoot(TestEngine testEngine, LauncherDiscoveryRequest request,
			LauncherDiscoveryListener listener, Function<String, UniqueId> uniqueIdCreator) {
		UniqueId uniqueEngineId = uniqueIdCreator.apply(testEngine.getId());
		try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java

	private void populateExclusionReasonInMap(Optional<String> reason, TestDescriptor testDescriptor,
			Map<String, List<TestDescriptor>> excludedTestDescriptorsByReason) {
		excludedTestDescriptorsByReason.computeIfAbsent(reason.orElse("Unknown"), list -> new LinkedList<>()).add(
			testDescriptor);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestEngine`
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncher.java`
#### Snippet
```java
	}

	private boolean hasTestEngineOtherThanSuiteEngine(Set<TestEngine> testEngines) {
		return testEngines.stream().anyMatch(testEngine -> !SuiteEngineDescriptor.ENGINE_ID.equals(testEngine.getId()));
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
#### Snippet
```java
	private final ConfigurationParameters configurationParameters;

	ClassSelectorResolver(Predicate<String> classNameFilter, SuiteEngineDescriptor suiteEngineDescriptor,
			ConfigurationParameters configurationParameters) {
		this.classNameFilter = classNameFilter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends A`
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/SuiteLauncherDiscoveryRequestBuilder.java`
#### Snippet
```java

	private static <A extends Annotation, V> Optional<V[]> findAnnotationValues(AnnotatedElement element,
			Class<A> annotationType, Function<A, V[]> valueExtractor) {
		return findAnnotation(element, annotationType).map(valueExtractor).filter(values -> values.length > 0);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/SuiteLauncherDiscoveryRequestBuilder.java`
#### Snippet
```java

	private static <A extends Annotation, V> Optional<V[]> findAnnotationValues(AnnotatedElement element,
			Class<A> annotationType, Function<A, V[]> valueExtractor) {
		return findAnnotation(element, annotationType).map(valueExtractor).filter(values -> values.length > 0);
	}
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Method`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	}

	private static Optional<Method> findMethod(Class<?> clazz, Predicate<Method> predicate) {
		Preconditions.notNull(clazz, "Class must not be null");
		Preconditions.notNull(predicate, "Predicate must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Field`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.ReflectionSupport#findFields(Class, Predicate, org.junit.platform.commons.support.HierarchyTraversalMode)
	 */
	public static List<Field> findFields(Class<?> clazz, Predicate<Field> predicate,
			HierarchyTraversalMode traversalMode) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	}

	private static void getAllAssignmentCompatibleClasses(Class<?> clazz, Set<Class<?>> result) {
		for (Class<?> current = clazz; current != null; current = current.getSuperclass()) {
			result.add(current);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Constructor`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 * @see Class#isSynthetic()
	 */
	public static List<Constructor<?>> findConstructors(Class<?> clazz, Predicate<Constructor<?>> predicate) {
		Preconditions.notNull(clazz, "Class must not be null");
		Preconditions.notNull(predicate, "Predicate must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Method`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.ReflectionSupport#findMethods(Class, Predicate, org.junit.platform.commons.support.HierarchyTraversalMode)
	 */
	public static List<Method> findMethods(Class<?> clazz, Predicate<Method> predicate,
			HierarchyTraversalMode traversalMode) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Field`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 * {@code null} but may be empty or contain {@code null} entries
	 */
	public static List<Object> readFieldValues(List<Field> fields, Object instance, Predicate<Field> predicate) {
		Preconditions.notNull(fields, "fields list must not be null");
		Preconditions.notNull(predicate, "Predicate must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	}

	private static void findNestedClasses(Class<?> clazz, Predicate<Class<?>> predicate, Set<Class<?>> candidates) {
		if (!isSearchable(clazz)) {
			return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	}

	private static void findNestedClasses(Class<?> clazz, Predicate<Class<?>> predicate, Set<Class<?>> candidates) {
		if (!isSearchable(clazz)) {
			return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TestRuleAnnotatedMember`
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
#### Snippet
```java
	private final Function<TestRuleAnnotatedMember, AbstractTestRuleAdapter> adapterGenerator;

	TestRuleSupport(Function<TestRuleAnnotatedMember, AbstractTestRuleAdapter> adapterGenerator,
			Class<? extends TestRule> ruleType) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AbstractTestRuleAdapter`
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
#### Snippet
```java
	private final Function<TestRuleAnnotatedMember, AbstractTestRuleAdapter> adapterGenerator;

	TestRuleSupport(Function<TestRuleAnnotatedMember, AbstractTestRuleAdapter> adapterGenerator,
			Class<? extends TestRule> ruleType) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/MavenRepo.java`
#### Snippet
```java
	}

	private static Path artifact(String artifactId, Predicate<String> fileNamePredicate) {
		var parentDir = dir() //
				.resolve(Helper.groupId(artifactId).replace('.', File.separatorChar)) //
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-reporting/src/main/java/org/junit/platform/reporting/legacy/xml/XmlReportWriter.java`
#### Snippet
```java

	private void removeIfPresentAndAddAsSeparateElement(Map<String, String> keyValuePairs, String key,
			List<String> elements) {
		String value = keyValuePairs.remove(key);
		if (value != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TestExecutionResult`
in `junit-platform-reporting/src/main/java/org/junit/platform/reporting/legacy/xml/XmlReportWriter.java`
#### Snippet
```java
		private final List<TestExecutionResult> executionResults;

		private AggregatedTestResult(Type type, List<TestExecutionResult> executionResults) {
			this.type = type;
			this.executionResults = executionResults;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `junit-platform-reporting/src/main/java/org/junit/platform/reporting/legacy/xml/XmlReportWriter.java`
#### Snippet
```java
	}

	private void collectReportEntries(TestIdentifier testIdentifier, List<String> systemOutElements,
			List<String> systemErrElements) {
		List<ReportEntry> entries = this.reportData.getReportEntries(testIdentifier);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Request.java`
#### Snippet
```java
		}

		private void buildEnvironment(Map<String, String> environment) {
			environment.computeIfAbsent("JUNIT_JUPITER_VERSION", key -> Helper.version("junit-jupiter"));
			environment.computeIfAbsent("JUNIT_VINTAGE_VERSION", key -> Helper.version("junit-vintage"));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Request.java`
#### Snippet
```java
		}

		private void buildEnvironment(Map<String, String> environment) {
			environment.computeIfAbsent("JUNIT_JUPITER_VERSION", key -> Helper.version("junit-jupiter"));
			environment.computeIfAbsent("JUNIT_VINTAGE_VERSION", key -> Helper.version("junit-vintage"));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java

	/** Walk directory tree structure. */
	public static void treeWalk(Path root, Consumer<String> out) {
		try (var stream = Files.walk(root)) {
			stream.map(root::relativize) //
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertIterableEquals.java`
#### Snippet
```java
	}

	private final static class Pair {
		private final Object left;
		private final Object right;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutInvocationFactory.java`
#### Snippet
```java
	}

	private static abstract class ExecutorResource implements CloseableResource {

		protected final ScheduledExecutorService executor;
```

## RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
### RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
			moduleSourcePathOption.value.forEach { inputs.dir(it) }
			addOption(ModuleSpecificJavadocFileOption("-patch-module", modularProjects.associate {
				it.javaModuleName to files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava.srcDirs }).asPath
			}))
			addStringOption("-add-modules", "info.picocli")
```

### RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
			moduleSourcePathOption.value.forEach { inputs.dir(it) }
			addOption(ModuleSpecificJavadocFileOption("-patch-module", modularProjects.associate {
				it.javaModuleName to files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava.srcDirs }).asPath
			}))
			addStringOption("-add-modules", "info.picocli")
```

### RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
		}

		source(modularProjects.map { files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava }) })
		classpath = files(modularProjects.map { it.sourceSets.main.get().compileClasspath })

```

### RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
		}

		source(modularProjects.map { files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava }) })
		classpath = files(modularProjects.map { it.sourceSets.main.get().compileClasspath })

```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `getType()` is identical to its super method
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteEngineDescriptor.java`
#### Snippet
```java

	@Override
	public Type getType() {
		return Type.CONTAINER;
	}
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Extension` is the same as one of its superclass' names
in `junit-jupiter-api/src/testFixtures/java/org/junit/jupiter/api/fixtures/TrackLogRecords.java`
#### Snippet
```java
public @interface TrackLogRecords {

	class Extension implements BeforeEachCallback, AfterEachCallback, ParameterResolver {

		@Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Runner` is the same as one of its superclass' names
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java
@RunWith(JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.Runner.class)
public class JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions {
	public static class Runner extends org.junit.runner.Runner {

		private final Class<?> testClass;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `PreconditionViolationException` is the same as one of its superclass' names
in `junit-platform-commons/src/main/java/org/junit/platform/commons/PreconditionViolationException.java`
#### Snippet
```java
@API(status = STABLE, since = "1.5")
@SuppressWarnings({ "deprecation", "exports" })
public class PreconditionViolationException extends org.junit.platform.commons.util.PreconditionViolationException {

	private static final long serialVersionUID = 1L;
```

## RuleId[ruleID=OptionalAssignedToNull]
### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
#### Snippet
```java

	Optional<ThreadMode> getDefaultTimeoutThreadMode() {
		if (threadMode.get() != null) {
			return threadMode.get();
		}
```

### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java

		private static Object nullSafeGet(Optional<?> optional) {
			return optional != null ? optional.orElse(null) : null;
		}

```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`max = max / 2` could be simplified to 'max /= 2'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java
		if (throwable.getCause() != null
				|| (throwable.getSuppressed() != null && throwable.getSuppressed().length > 0)) {
			max = max / 2;
		}
		printStackTrace(writer, new StackTraceElement[] {}, throwable, "", DOUBLE_TAB + " ", new HashSet<>(), max);
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ExclusiveResource.java`
#### Snippet
```java
		int h = hash;
		if (h == 0) {
			h = hash = Objects.hash(key, lockMode);
		}
		return h;
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExtensionUtils.java`
#### Snippet
```java
							if (isExtendWithPresent) {
								Class<?> valueType = value.getClass();
								extensionTypes.forEach(extensionType -> {
									Preconditions.condition(!extensionType.equals(valueType),
										() -> String.format("Failed to register extension via field [%s]. "
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
		ThrowableCollector throwableCollector = context.getThrowableCollector();

		registry.getReversedExtensions(type).forEach(callback -> {
			throwableCollector.execute(() -> callbackInvoker.invoke(callback, extensionContext));
		});
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTask.java`
#### Snippet
```java
		started = true;

		throwableCollector.execute(() -> {
			node.around(context, ctx -> {
				context = ctx;
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-jupiter-engine/src/test/java/DefaultPackageTestCase.java`
#### Snippet
```java

	@Test
	void test() {
		// do nothing
	}
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `junit-platform-engine/src/main/java/org/junit/platform/engine/UniqueId.java`
#### Snippet
```java

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/PlainOldJavaClassWithoutAnyTestsTestCase.java`
#### Snippet
```java
public class PlainOldJavaClassWithoutAnyTestsTestCase {

	public void doSomething() {
		// no-op
	}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/AbstractJUnit4TestCase.java`
#### Snippet
```java

	@Test
	public void theTest() {
	}

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/AbstractJunit4TestCaseWithConstructorParameter.java`
#### Snippet
```java

	@Test
	public void test() {
	}
}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/IgnoredJUnit4TestCase.java`
#### Snippet
```java

	@Test
	public void succeedingTest() {
	}

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/IgnoredParameterizedTestCase.java`
#### Snippet
```java
	@Test
	@Ignore
	public void test() {
		// never called
	}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4ParameterizedTestCase.java`
#### Snippet
```java

	@Test
	public void test2() {
		/* always succeeds */
	}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithErrorInAfterClass.java`
#### Snippet
```java

	@Test
	public void succeedingTest() {
		// no-op
	}
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithNotFilterableRunner.java`
#### Snippet
```java

	@Test
	public void someTest() {
	}

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `platform-tests/src/test/java/DefaultPackageTestCase.java`
#### Snippet
```java

	@Test
	void test() {
		// do nothing
	}
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
#### Snippet
```java
	// The following is not "cloneable" State.
	private boolean beforeAllCallbacksExecuted = false;
	private boolean beforeAllMethodsExecuted = false;

	public JupiterEngineExecutionContext(EngineExecutionListener executionListener,
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
#### Snippet
```java

	// The following is not "cloneable" State.
	private boolean beforeAllCallbacksExecuted = false;
	private boolean beforeAllMethodsExecuted = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
#### Snippet
```java

		private State originalState;
		private State newState = null;

		private Builder(State originalState) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/SuiteLauncherDiscoveryRequestBuilder.java`
#### Snippet
```java
	private final List<String> selectedClassNames = new ArrayList<>();
	private boolean includeClassNamePatternsUsed;
	private boolean filterStandardClassNamePatterns = false;
	private ConfigurationParameters parentConfigurationParameters;
	private boolean enableParentConfigurationParameters = true;
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `throwable`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/OpenTest4JAndJUnit4AwareThrowableCollector.java`
#### Snippet
```java
		catch (Throwable throwable) {
			UnrecoverableExceptions.rethrowIfUnrecoverable(throwable);
			Supplier<String> messageSupplier = (throwable instanceof NoClassDefFoundError)
					? () -> COMMON_FAILURE_MESSAGE + " Note that " + ASSUMPTION_VIOLATED_EXCEPTION
							+ " requires that Hamcrest is on the classpath."
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `ex`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
#### Snippet
```java
		}
		catch (Exception ex) {
			if (ex instanceof NoSuchMethodException) {
				String message = String.format("Failed to find a no-argument constructor for ArgumentsProvider [%s]. "
						+ "Please ensure that a no-argument constructor exists and "
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `throwable`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
			UnrecoverableExceptions.rethrowIfUnrecoverable(throwable);

			if (throwable instanceof TestInstantiationException) {
				throw (TestInstantiationException) throwable;
			}
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `ex`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
#### Snippet
```java
				}
				catch (Exception ex) {
					if (ex instanceof ArgumentConversionException) {
						// simply rethrow it
						throw (ArgumentConversionException) ex;
```

## RuleId[ruleID=ArrayEquality]
### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java

		AssertionUtils.assertValidDelta(delta);
		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java

		AssertionUtils.assertValidDelta(delta);
		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
			Object messageOrSupplier) {

		if (expected == actual) {
			return;
		}
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/PackageNameFilter.java`
#### Snippet
```java
	 */
	static PackageNameFilter excludePackageNames(List<String> names) {
		return excludePackageNames(names.toArray(new String[0]));
	}

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/PackageNameFilter.java`
#### Snippet
```java
	 */
	static PackageNameFilter includePackageNames(List<String> names) {
		return includePackageNames(names.toArray(new String[0]));
	}

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/DiscoveryRequestCreator.java`
#### Snippet
```java
		if (!options.getExcludedClassNamePatterns().isEmpty()) {
			requestBuilder.filters(
				excludeClassNamePatterns(options.getExcludedClassNamePatterns().toArray(new String[0])));
		}

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java
			max = max / 2;
		}
		printStackTrace(writer, new StackTraceElement[] {}, throwable, "", DOUBLE_TAB + " ", new HashSet<>(), max);
		writer.flush();
	}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java`
#### Snippet
```java

	protected Object executeMethod(String name) {
		return executeMethod(name, new Class<?>[0]);
	}

```

## RuleId[ruleID=RedundantUnmodifiable]
### RuleId[ruleID=RedundantUnmodifiable]
Redundant usage of the 'unmodifiableList' wrapper
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 */
	public static List<Class<?>> findAllClassesInModule(String moduleName, ClassFilter classFilter) {
		return Collections.unmodifiableList(ModuleUtils.findAllClassesInModule(moduleName, classFilter));
	}

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `inherited` is always 'true'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
				Class<?> superclass = clazz.getSuperclass();
				if (superclass != null && superclass != Object.class) {
					findRepeatableAnnotations(superclass, annotationType, containerType, inherited, found, visited);
				}
			}
```

### RuleId[ruleID=ConstantValue]
Value `inherited` is always 'true'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
				Class<?> superclass = clazz.getSuperclass();
				if (superclass != null && superclass != Object.class) {
					Optional<A> annotationOnSuperclass = findAnnotation(superclass, annotationType, inherited, visited);
					if (annotationOnSuperclass.isPresent()) {
						return annotationOnSuperclass;
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluator.java`
#### Snippet
```java
	private void logResult(Class<?> conditionType, ConditionEvaluationResult result, ExtensionContext context) {
		logger.trace(() -> format("Evaluation of condition [%s] on [%s] resulted in: %s", conditionType.getName(),
			context.getElement().get(), result));
	}

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestExtension.java`
#### Snippet
```java
		Method testMethod = context.getRequiredTestMethod();
		String displayName = context.getDisplayName();
		RepeatedTest repeatedTest = AnnotationUtils.findAnnotation(testMethod, RepeatedTest.class).get();
		int totalRepetitions = totalRepetitions(repeatedTest, testMethod);
		RepeatedTestDisplayNameFormatter formatter = displayNameFormatter(repeatedTest, testMethod, displayName);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
#### Snippet
```java
	private ParameterizedTestNameFormatter createNameFormatter(ExtensionContext extensionContext, Method templateMethod,
			ParameterizedTestMethodContext methodContext, String displayName, int argumentMaxLength) {
		ParameterizedTest parameterizedTest = findAnnotation(templateMethod, ParameterizedTest.class).get();
		String pattern = parameterizedTest.name().equals(DEFAULT_DISPLAY_NAME)
				? extensionContext.getConfigurationParameter(DISPLAY_NAME_PATTERN_KEY).orElse(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestParameterResolver.java`
#### Snippet
```java
	public void afterTestExecution(ExtensionContext context) {
		ParameterizedTest parameterizedTest = AnnotationUtils.findAnnotation(context.getRequiredTestMethod(),
			ParameterizedTest.class).get();
		if (!parameterizedTest.autoCloseArguments()) {
			return;
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional::get` without 'isPresent()' check
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/TestRun.java`
#### Snippet
```java
				.stream()
				.map(TestExecutionResult::getThrowable)
				.map(Optional::get)
				.collect(toList());
		// @formatter:on
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-platform-engine/src/main/java/org/junit/platform/engine/CompositeFilter.java`
#### Snippet
```java
				.map(Filter::toPredicate)
				.reduce(Predicate::and)
				.get(); // it's safe to call get() here because the constructor ensures filters is not empty
		// @formatter:on
	}
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-platform-runner/src/main/java/org/junit/platform/runner/JUnitPlatformRunnerListener.java`
#### Snippet
```java
	@Override
	public void dynamicTestRegistered(TestIdentifier testIdentifier) {
		UniqueId parentId = testIdentifier.getParentIdObject().get();
		testTree.addDynamicDescription(testIdentifier, parentId);
	}
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
				// Nested container annotation?
				else if (isRepeatableAnnotationContainer(candidateAnnotationType)) {
					Method method = ReflectionUtils.tryToGetMethod(candidateAnnotationType, "value").toOptional().get();
					Annotation[] containedAnnotations = (Annotation[]) ReflectionUtils.invokeMethod(method, candidate);

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseResult.java`
#### Snippet
```java
			throw exceptionCreator.apply(errorMessage().get());
		}
		return tagExpression().get();
	}

```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
		public InputStream openClasspathResource(Class<?> baseClass, String path) {
			Preconditions.notBlank(path, () -> "Classpath resource [" + path + "] must not be null or blank");
			InputStream inputStream = baseClass.getResourceAsStream(path);
			return Preconditions.notNull(inputStream, () -> "Classpath resource [" + path + "] does not exist");
		}
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `documentation/src/main/java/example/util/StringUtils.java`
#### Snippet
```java
package example.util;

public class StringUtils {

	public static boolean isPalindrome(String candidate) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AssertTimeoutPreemptively` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
 * @since 5.9.1
 */
class AssertTimeoutPreemptively {

	static void assertTimeoutPreemptively(Duration timeout, Executable executable) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JupiterThrowableCollectorFactory` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/JupiterThrowableCollectorFactory.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "5.4")
public class JupiterThrowableCollectorFactory {

	/**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ParameterResolutionUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "5.9")
public class ParameterResolutionUtils {

	private static final Logger logger = LoggerFactory.getLogger(ParameterResolutionUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DisplayNameUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DisplayNameUtils.java`
#### Snippet
```java
 * @see DisplayNameGeneration
 */
final class DisplayNameUtils {

	private static final Logger logger = LoggerFactory.getLogger(DisplayNameUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MethodSourceSupport` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodSourceSupport.java`
#### Snippet
```java
 * @see MethodSelector
 */
class MethodSourceSupport {

	static final String METHOD_SCHEME = "method";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JupiterUniqueIdBuilder` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-engine/src/testFixtures/java/org/junit/jupiter/engine/discovery/JupiterUniqueIdBuilder.java`
#### Snippet
```java
 * @since 5.0
 */
public class JupiterUniqueIdBuilder {

	public static UniqueId uniqueIdForClass(Class<?> clazz) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CsvParserFactory` has only 'static' members, and lacks a 'private' constructor
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvParserFactory.java`
#### Snippet
```java
 * @since 5.6
 */
class CsvParserFactory {

	private static final String DEFAULT_DELIMITER = ",";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JUnit4VersionCheck` has only 'static' members, and lacks a 'private' constructor
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/JUnit4VersionCheck.java`
#### Snippet
```java
 * @since 5.4
 */
class JUnit4VersionCheck {

	private static final Pattern versionPattern = Pattern.compile("^(\\d+\\.\\d+).*");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ModuleUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "1.1")
public class ModuleUtils {

	private static final Logger logger = LoggerFactory.getLogger(ModuleUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConcurrencyTestingUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-commons/src/testFixtures/java/org/junit/platform/commons/test/ConcurrencyTestingUtils.java`
#### Snippet
```java
import java.util.concurrent.Executors;

public class ConcurrencyTestingUtils {

	public static void executeConcurrently(int threads, Runnable action) throws Exception {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ModuleUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-commons/src/main/java9/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "1.1")
public class ModuleUtils {

	private static final Logger logger = LoggerFactory.getLogger(ModuleUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConsoleUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-console/src/main/java/org/junit/platform/console/options/ConsoleUtils.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "1.9")
public class ConsoleUtils {

	/**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConsoleUtils` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-console/src/main/java17/org/junit/platform/console/options/ConsoleUtils.java`
#### Snippet
```java
 */
@API(status = INTERNAL, since = "1.9")
public class ConsoleUtils {

	/**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Assertions` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Assertions.java`
#### Snippet
```java
 * @since 1.4
 */
class Assertions {

	@FunctionalInterface
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LauncherFactoryForTestingPurposesOnly` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-launcher/src/testFixtures/java/org/junit/platform/launcher/core/LauncherFactoryForTestingPurposesOnly.java`
#### Snippet
```java
 * @since 1.0
 */
public class LauncherFactoryForTestingPurposesOnly {

	public static Launcher createLauncher(TestEngine... engines) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TagExpressions` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/TagExpressions.java`
#### Snippet
```java
 * @since 1.1
 */
class TagExpressions {

	static TagExpression tag(String tag) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AdditionalDiscoverySelectors` has only 'static' members, and lacks a 'private' constructor
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/AdditionalDiscoverySelectors.java`
#### Snippet
```java
 * @since 1.8
 */
class AdditionalDiscoverySelectors {

	static List<UriSelector> selectUris(String... uris) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java
 * @since 1.3
 */
public class Helper {

	public static final Duration TOOL_TIMEOUT = Duration.ofMinutes(3);
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/CleanupMode.java`
#### Snippet
```java
	 * Never clean up a temporary directory after the test has completed.
	 */
	NEVER;

}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestExecutionResult.java`
#### Snippet
```java
		 * Indicates that the execution of a test or container <em>failed</em>.
		 */
		FAILED;

	}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/SearchOption.java`
#### Snippet
```java
	 * hierarchy for <em>inner classes</em> (i.e., a non-static member classes).
	 */
	INCLUDE_ENCLOSING_CLASSES;

}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/HierarchyTraversalMode.java`
#### Snippet
```java
	 * Traverse the hierarchy using bottom-up semantics.
	 */
	BOTTOM_UP;

}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventType.java`
#### Snippet
```java
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished(TestDescriptor, ReportEntry)
	 */
	REPORTING_ENTRY_PUBLISHED;

}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		 * Traverse the hierarchy using bottom-up semantics.
		 */
		BOTTOM_UP;
	}

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Dereference of `throwAsUncheckedException(throwable)` may produce `NullPointerException`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
			}
			catch (Throwable throwable) {
				throw throwAsUncheckedException(throwable);
			}
		});
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `throwAsUncheckedException(ex.getCause())` may produce `NullPointerException`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
		}
		catch (ExecutionException ex) {
			throw throwAsUncheckedException(ex.getCause());
		}
		catch (Throwable ex) {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `throwAsUncheckedException(ex)` may produce `NullPointerException`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
		}
		catch (Throwable ex) {
			throw throwAsUncheckedException(ex);
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getActualTypeArguments` may produce `NullPointerException`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/support/TypeBasedParameterResolver.java`
#### Snippet
```java
						+ "potentially caused by lacking parameterized type in class declaration.",
				getClass().getName()));
		return typeBasedParameterResolverSuperclass.getActualTypeArguments()[0];
	}

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(t)` may produce `NullPointerException`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InvocationInterceptorChain.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(t);
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(e)` may produce `NullPointerException`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
#### Snippet
```java
		}
		catch (Exception e) {
			throw ExceptionUtils.throwAsUncheckedException(e);
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
The call to 'assumeFalse' always fails, according to its method contracts
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithFiveTestMethods.java`
#### Snippet
```java
	@Test
	public void abortedTest() {
		assumeFalse("this test should be aborted", true);
	}

```

### RuleId[ruleID=DataFlowIssue]
Argument `parentTrace` might be null
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java
			writer.printf("%s%s%s%n", indentation, caption, throwable);
		}
		int duplicates = numberOfCommonFrames(trace, parentTrace);
		int numDistinctFrames = trace.length - duplicates;
		int numDisplayLines = Math.min(numDistinctFrames, max);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(exception)` may produce `NullPointerException`
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedField.java`
#### Snippet
```java
		}
		catch (IllegalAccessException exception) {
			throw ExceptionUtils.throwAsUncheckedException(exception);
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t))` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t));
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t))` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t));
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t))` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t));
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(t)` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
					}
					catch (Throwable t) {
						throw ExceptionUtils.throwAsUncheckedException(t);
					}
				});
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t))` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t));
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t))` may produce `NullPointerException`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		catch (Throwable t) {
			throw ExceptionUtils.throwAsUncheckedException(getUnderlyingCause(t));
		}
	}
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ExceptionUtils.throwAsUncheckedException(t)` may produce `NullPointerException`
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
#### Snippet
```java
			}
			catch (Throwable t) {
				throw ExceptionUtils.throwAsUncheckedException(t);
			}
		}
```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java`
#### Snippet
```java
	}

	public Optional<List<Filter>> getFilters() {
		return Optional.ofNullable(filters);
	}
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/RuntimeUtils.java`
#### Snippet
```java
	 * Try to get the input arguments the VM was started with.
	 */
	static Optional<List<String>> getInputArguments() {
		Optional<Class<?>> managementFactoryClass = ReflectionUtils.tryToLoadClass(
			"java.lang.management.ManagementFactory").toOptional();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains array `String[]`
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/SuiteLauncherDiscoveryRequestBuilder.java`
#### Snippet
```java
	}

	private static Optional<String[]> trimmed(String[] patterns) {
		if (patterns.length == 0) {
			return Optional.empty();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains array `V[]`
in `junit-platform-suite-commons/src/main/java/org/junit/platform/suite/commons/SuiteLauncherDiscoveryRequestBuilder.java`
#### Snippet
```java
	}

	private static <A extends Annotation, V> Optional<V[]> findAnnotationValues(AnnotatedElement element,
			Class<A> annotationType, Function<A, V[]> valueExtractor) {
		return findAnnotation(element, annotationType).map(valueExtractor).filter(values -> values.length > 0);
```

## RuleId[ruleID=HasPlatformType]
### RuleId[ruleID=HasPlatformType]
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `documentation/documentation.gradle.kts`
#### Snippet
```java
}

val apiReport by configurations.creating
val standaloneConsoleLauncher by configurations.creating

```

### RuleId[ruleID=HasPlatformType]
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `documentation/documentation.gradle.kts`
#### Snippet
```java

val apiReport by configurations.creating
val standaloneConsoleLauncher by configurations.creating

dependencies {
```

### RuleId[ruleID=HasPlatformType]
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
}

val thirdPartyJars by configurations.creating
val antJars by configurations.creating
val mavenDistribution by configurations.creating
```

### RuleId[ruleID=HasPlatformType]
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java

val thirdPartyJars by configurations.creating
val antJars by configurations.creating
val mavenDistribution by configurations.creating

```

### RuleId[ruleID=HasPlatformType]
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
val thirdPartyJars by configurations.creating
val antJars by configurations.creating
val mavenDistribution by configurations.creating

dependencies {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'Alphanumeric' is still used
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrderer.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "5.7")
	@Deprecated
	class Alphanumeric extends MethodName {

		public Alphanumeric() {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'interceptDynamicTest' is still used
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/InvocationInterceptor.java`
#### Snippet
```java
	@Deprecated
	@API(status = DEPRECATED, since = "5.8")
	default void interceptDynamicTest(Invocation<Void> invocation, ExtensionContext extensionContext) throws Throwable {
		invocation.proceed();
	}
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SingleTestExecutor' is still used
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SingleTestExecutor.java`
#### Snippet
```java
@Deprecated
@API(status = DEPRECATED, since = "1.2")
public class SingleTestExecutor {

	/**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'JUnitPlatform' is still used
in `junit-platform-runner/src/main/java/org/junit/platform/runner/JUnitPlatform.java`
#### Snippet
```java
@API(status = DEPRECATED, since = "1.8")
@Deprecated
public class JUnitPlatform extends Runner implements Filterable {

	// @formatter:off
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'LegacyReportingUtils' is still used
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LegacyReportingUtils.java`
#### Snippet
```java
@SuppressWarnings("JavadocReference")
@API(status = DEPRECATED, since = "1.6")
public class LegacyReportingUtils {

	private LegacyReportingUtils() {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'UseTechnicalNames' is still used
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/UseTechnicalNames.java`
#### Snippet
```java
@API(status = DEPRECATED, since = "1.8")
@Deprecated
public @interface UseTechnicalNames {
}

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'readFieldValue' is still used
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "1.4")
	@Deprecated
	public static <T> Optional<Object> readFieldValue(Class<T> clazz, String fieldName, T instance) {
		return tryToReadFieldValue(clazz, fieldName, instance).toOptional();
	}
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getOutermostInstance' is still used
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "1.4")
	@Deprecated
	public static Optional<Object> getOutermostInstance(Object inner, Class<?> requiredType) {
		Preconditions.notNull(inner, "inner object must not be null");
		Preconditions.notNull(requiredType, "requiredType must not be null");
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'readFieldValue' is still used
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "1.4")
	@Deprecated
	public static Optional<Object> readFieldValue(Field field) {
		return tryToReadFieldValue(field).toOptional();
	}
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'readFieldValue' is still used
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "1.4")
	@Deprecated
	public static Optional<Object> readFieldValue(Field field, Object instance) {
		return tryToReadFieldValue(field, instance).toOptional();
	}
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	private void invokeBeforeTestExecutionCallbacks(JupiterEngineExecutionContext context) {
		invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(BeforeTestExecutionCallback.class, context,
			(callback, extensionContext) -> callback.beforeTestExecution(extensionContext));
	}

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	private void invokeBeforeEachCallbacks(JupiterEngineExecutionContext context) {
		invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(BeforeEachCallback.class, context,
			(callback, extensionContext) -> callback.beforeEach(extensionContext));
	}

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	private void invokeAfterTestExecutionCallbacks(JupiterEngineExecutionContext context) {
		invokeAllAfterMethodsOrCallbacks(AfterTestExecutionCallback.class, context,
			(callback, extensionContext) -> callback.afterTestExecution(extensionContext));
	}

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
#### Snippet
```java
	private void invokeAfterEachCallbacks(JupiterEngineExecutionContext context) {
		invokeAllAfterMethodsOrCallbacks(AfterEachCallback.class, context,
			(callback, extensionContext) -> callback.afterEach(extensionContext));
	}

```

## RuleId[ruleID=PatternVariableCanBeUsed]
### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'that' can be replaced with pattern variable
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/RunnerWithCustomUniqueIdsAndDisplayNames.java`
#### Snippet
```java
		public boolean equals(Object obj) {
			if (obj instanceof CustomUniqueId) {
				var that = (CustomUniqueId) obj;
				return Objects.equals(this.testName, that.testName);
			}
```

## RuleId[ruleID=CollectionContainsUrl]
### RuleId[ruleID=CollectionContainsUrl]
Set `resources` may contain URL objects
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
#### Snippet
```java
		try {
			ClassLoader classLoader = ClassLoaderUtils.getDefaultClassLoader();
			Set<URL> resources = new LinkedHashSet<>(Collections.list(classLoader.getResources(configFileName)));

			if (!resources.isEmpty()) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `RewindableByteArrayOutputStream` may be 'static'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptor.java`
#### Snippet
```java
	}

	class RewindableByteArrayOutputStream extends ByteArrayOutputStream {

		private final Deque<Integer> markedPositions = new ArrayDeque<>();
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/Constants.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "5.8")
	@SuppressWarnings("deprecation")
	public static final String TEMP_DIR_SCOPE_PROPERTY_NAME = TempDir.SCOPE_PROPERTY_NAME;

	/**
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
#### Snippet
```java
	@Override
	@SuppressWarnings("unchecked")
	public Optional<Object> getTarget() {
		return this.target;
	}
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
#### Snippet
```java
	@Deprecated
	@SuppressWarnings("deprecation")
	public static Optional<Class<?>> loadClass(String name) {
		return ReflectionUtils.loadClass(name);
	}
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
#### Snippet
```java
	@Override
	@SuppressWarnings("deprecation")
	public int size() {
		return providers.stream() //
				.mapToInt(ParameterProvider::size) //
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'reason'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ConditionEvaluationResult.java`
#### Snippet
```java
	private final boolean enabled;

	private final Optional<String> reason;

	private ConditionEvaluationResult(boolean enabled, String reason) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'reason'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestWatcher.java`
#### Snippet
```java
	 * potentially <em>empty</em>
	 */
	default void testDisabled(ExtensionContext context, Optional<String> reason) {
		/* no-op */
	}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 * invocation; never {@code null} though potentially empty
	 */
	public static Object[] resolveParameters(Method method, Optional<Object> target, ExtensionContext extensionContext,
			ExtensionRegistry extensionRegistry) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 * invocation; never {@code null} though potentially empty
	 */
	public static Object[] resolveParameters(Executable executable, Optional<Object> target,
			Optional<Object> outerInstance, ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 */
	public static Object[] resolveParameters(Executable executable, Optional<Object> target,
			Optional<Object> outerInstance, ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) {

		Preconditions.notNull(target, "target must not be null");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'testDescriptor'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
#### Snippet
```java
	}

	private Resolution toResolution(Optional<? extends ClassBasedTestDescriptor> testDescriptor) {
		return testDescriptor.map(it -> {
			Class<?> testClass = it.getTestClass();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
#### Snippet
```java
	 * interceptors}
	 */
	public <T> T invoke(Constructor<T> constructor, Optional<Object> outerInstance, ExtensionContext extensionContext,
			ExtensionRegistry extensionRegistry, ReflectiveInterceptorCall<Constructor<T>, T> interceptorCall) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
#### Snippet
```java
	private final Optional<Object> target;

	DefaultParameterContext(Parameter parameter, int index, Optional<Object> target) {
		Preconditions.condition(index >= 0, "index must be greater than or equal to zero");
		this.parameter = Preconditions.notNull(parameter, "parameter must not be null");
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
#### Snippet
```java
	private final Parameter parameter;
	private final int index;
	private final Optional<Object> target;

	DefaultParameterContext(Parameter parameter, int index, Optional<Object> target) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
#### Snippet
```java
	private final Object[] arguments;

	MethodInvocation(Method method, Optional<Object> target, Object[] arguments) {
		this.method = method;
		this.target = target;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
#### Snippet
```java

	private final Method method;
	private final Optional<Object> target;
	private final Object[] arguments;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optional'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		}

		private static Object nullSafeGet(Optional<?> optional) {
			return optional != null ? optional.orElse(null) : null;
		}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'testMethod'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		private final Set<String> tags;
		private final Optional<Class<?>> testClass;
		private final Optional<Method> testMethod;

		DefaultTestInfo(ExtensionContext extensionContext) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'testClass'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		private final String displayName;
		private final Set<String> tags;
		private final Optional<Class<?>> testClass;
		private final Optional<Method> testMethod;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
#### Snippet
```java

	private final Class<?> testClass;
	private final Optional<Object> outerInstance;

	DefaultTestInstanceFactoryContext(Class<?> testClass, Optional<Object> outerInstance) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
#### Snippet
```java
	private final Optional<Object> outerInstance;

	DefaultTestInstanceFactoryContext(Class<?> testClass, Optional<Object> outerInstance) {
		this.testClass = testClass;
		this.outerInstance = outerInstance;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
	}

	private Object invokeTestClassConstructor(Optional<Object> outerInstance, ExtensionRegistry registry,
			ExtensionContext extensionContext) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstances'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
			ThrowableCollector throwableCollector);

	protected TestInstances instantiateTestClass(Optional<TestInstances> outerInstances, ExtensionRegistry registry,
			ExtensionContext extensionContext) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
	}

	private Object invokeTestInstanceFactory(Optional<Object> outerInstance, ExtensionContext extensionContext) {
		Object instance;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'identifiedTestDescriptor'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
#### Snippet
```java

	private Deque<Description> determinePath(RunnerTestDescriptor runnerTestDescriptor,
			Optional<? extends TestDescriptor> identifiedTestDescriptor) {
		Deque<Description> path = new ArrayDeque<>();
		Optional<? extends TestDescriptor> current = identifiedTestDescriptor;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'identifiedTestDescriptor'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
#### Snippet
```java
	}

	private Set<Description> determineDescendants(Optional<? extends TestDescriptor> identifiedTestDescriptor) {
		// @formatter:off
		return identifiedTestDescriptor.map(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'reason'
in `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
#### Snippet
```java
	private final boolean included;

	private final Optional<String> reason;

	private FilterResult(boolean included, String reason) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'parent'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java
	}

	private void fireExecutionStartedIncludingUnstartedAncestors(Optional<TestDescriptor> parent) {
		if (parent.isPresent() && canStart(parent.get())) {
			fireExecutionStartedIncludingUnstartedAncestors(parent.get().getParent());
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'reason'
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
#### Snippet
```java

		private final boolean skipped;
		private final Optional<String> reason;

		/**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.3")
	public static boolean isAnnotated(Optional<? extends AnnotatedElement> element,
			Class<? extends Annotation> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.1")
	public static <A extends Annotation> Optional<A> findAnnotation(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.5")
	public static <A extends Annotation> List<A> findRepeatableAnnotations(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'customClassLoader'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/CustomContextClassLoaderExecutor.java`
#### Snippet
```java
class CustomContextClassLoaderExecutor {

	private final Optional<ClassLoader> customClassLoader;

	CustomContextClassLoaderExecutor(Optional<ClassLoader> customClassLoader) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'customClassLoader'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/CustomContextClassLoaderExecutor.java`
#### Snippet
```java
	private final Optional<ClassLoader> customClassLoader;

	CustomContextClassLoaderExecutor(Optional<ClassLoader> customClassLoader) {
		this.customClassLoader = customClassLoader;
	}
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'stdoutInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java
	}

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'stderrInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
		this.stderrInterceptor = stderrInterceptor;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'stderrInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private final Optional<StreamInterceptor> stdoutInterceptor;
	private final Optional<StreamInterceptor> stderrInterceptor;
	private final BiConsumer<TestIdentifier, ReportEntry> reporter;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'stdoutInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java
class StreamInterceptingTestExecutionListener implements EagerTestExecutionListener {

	private final Optional<StreamInterceptor> stdoutInterceptor;
	private final Optional<StreamInterceptor> stderrInterceptor;
	private final BiConsumer<TestIdentifier, ReportEntry> reporter;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#findAnnotation(Optional, Class)
	 */
	public static <A extends Annotation> Optional<A> findAnnotation(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#findRepeatableAnnotations(Optional, Class)
	 */
	public static <A extends Annotation> List<A> findRepeatableAnnotations(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#isAnnotated(Optional, Class)
	 */
	public static boolean isAnnotated(Optional<? extends AnnotatedElement> element,
			Class<? extends Annotation> annotationType) {

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'customDir'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/OutputDir.java`
#### Snippet
```java
	 * Package private for testing purposes.
	 */
	static OutputDir createSafely(Optional<String> customDir, Supplier<Path> currentWorkingDir) throws IOException {
		Path cwd = currentWorkingDir.get();
		Path outputDir;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'customDir'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/OutputDir.java`
#### Snippet
```java
public class OutputDir {

	public static OutputDir create(Optional<String> customDir) {
		try {
			return createSafely(customDir, () -> Paths.get(".").toAbsolutePath());
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'reason'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java
	}

	private void populateExclusionReasonInMap(Optional<String> reason, TestDescriptor testDescriptor,
			Map<String, List<TestDescriptor>> excludedTestDescriptorsByReason) {
		excludedTestDescriptorsByReason.computeIfAbsent(reason.orElse("Unknown"), list -> new LinkedList<>()).add(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'suite'
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
#### Snippet
```java
	}

	private static Resolution toResolution(Optional<SuiteTestDescriptor> suite) {
		return suite.map(Match::exact).map(Resolution::match).orElseGet(Resolution::unresolved);
	}
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/ParameterizedTimingTestCase.java`
#### Snippet
```java
	public static void afterParam(String param) throws Exception {
		Thread.sleep(100);
		System.out.println("ParameterizedTimingTestCase.afterParam");
		EVENTS.put("afterParam(" + param + ")", Instant.now());
	}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-platform-runner/src/main/java/org/junit/platform/runner/JUnitPlatformRunnerListener.java`
#### Snippet
```java
	@Override
	public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
		System.out.println(entry);
	}

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-platform-console/src/main/java/org/junit/platform/console/ConsoleLauncher.java`
#### Snippet
```java

	public static void main(String... args) {
		int exitCode = execute(System.out, System.err, args).getExitCode();
		System.exit(exitCode);
	}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `junit-platform-console/src/main/java/org/junit/platform/console/ConsoleLauncher.java`
#### Snippet
```java

	public static void main(String... args) {
		int exitCode = execute(System.out, System.err, args).getExitCode();
		System.exit(exitCode);
	}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Executions.java`
#### Snippet
```java
	 */
	public Executions debug() {
		debug(System.out);
		return this;
	}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java
	 */
	public Events debug() {
		debug(System.out);
		return this;
	}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptor.java`
#### Snippet
```java

	static Optional<StreamInterceptor> registerStdout(int maxNumberOfBytesPerThread) {
		return register(System.out, System::setOut, maxNumberOfBytesPerThread);
	}

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptor.java`
#### Snippet
```java

	static Optional<StreamInterceptor> registerStderr(int maxNumberOfBytesPerThread) {
		return register(System.err, System::setErr, maxNumberOfBytesPerThread);
	}

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Request.java`
#### Snippet
```java

			var result = tool.run(configuration.build());
			System.out.println(result.getOutput("out"));
			System.err.println(result.getOutput("err"));
			return result;
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Request.java`
#### Snippet
```java
			var result = tool.run(configuration.build());
			System.out.println(result.getOutput("out"));
			System.err.println(result.getOutput("err"));
			return result;
		}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestDisplayNameFormatter.java`
#### Snippet
```java
	String format(int currentRepetition, int totalRepetitions) {
		return this.pattern//
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)//
				.replace(CURRENT_REPETITION_PLACEHOLDER, String.valueOf(currentRepetition))//
				.replace(TOTAL_REPETITIONS_PLACEHOLDER, String.valueOf(totalRepetitions));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestDisplayNameFormatter.java`
#### Snippet
```java
		return this.pattern//
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)//
				.replace(CURRENT_REPETITION_PLACEHOLDER, String.valueOf(currentRepetition))//
				.replace(TOTAL_REPETITIONS_PLACEHOLDER, String.valueOf(totalRepetitions));
	}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestDisplayNameFormatter.java`
#### Snippet
```java
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)//
				.replace(CURRENT_REPETITION_PLACEHOLDER, String.valueOf(currentRepetition))//
				.replace(TOTAL_REPETITIONS_PLACEHOLDER, String.valueOf(totalRepetitions));
	}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java`
#### Snippet
```java
	private String prepareMessageFormatPattern(int invocationIndex, Object[] arguments) {
		String result = pattern//
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)//
				.replace(INDEX_PLACEHOLDER, String.valueOf(invocationIndex));

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java`
#### Snippet
```java
		String result = pattern//
				.replace(DISPLAY_NAME_PLACEHOLDER, this.displayName)//
				.replace(INDEX_PLACEHOLDER, String.valueOf(invocationIndex));

		if (result.contains(ARGUMENTS_WITH_NAMES_PLACEHOLDER)) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java`
#### Snippet
```java

		if (result.contains(ARGUMENTS_WITH_NAMES_PLACEHOLDER)) {
			result = result.replace(ARGUMENTS_WITH_NAMES_PLACEHOLDER, argumentsWithNamesPattern(arguments));
		}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java`
#### Snippet
```java

		if (result.contains(ARGUMENTS_PLACEHOLDER)) {
			result = result.replace(ARGUMENTS_PLACEHOLDER, argumentsPattern(arguments));
		}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
#### Snippet
```java
		@Override
		public Object convert(String source, Class<?> targetType) {
			return CONVERTERS.get(targetType).apply(source.replace("_", ""));
		}
	}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassLoaderUtils.java`
#### Snippet
```java
		if (loader != null) {
			String name = object.getClass().getName();
			name = name.replace(".", "/") + ".class";
			try {
				return Optional.ofNullable(loader.getResource(name));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassNamePatternFilterUtils.java`
#### Snippet
```java
				// Match "." against "." and "$" since users may declare a "." instead of a
				// "$" as the separator between classes and nested classes.
				.replace(".", "[.$]")
				// Convert our "*" wildcard into a proper RegEx pattern.
				.replace("*", ".+");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassNamePatternFilterUtils.java`
#### Snippet
```java
				.replace(".", "[.$]")
				// Convert our "*" wildcard into a proper RegEx pattern.
				.replace("*", ".+");
	}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/VerboseTreePrintingListener.java`
#### Snippet
```java
		}
		// still here? Split format into separate lines and indent them from the second line on
		String[] lines = format.split("\\R");
		printf(style, "%s", lines[0]);
		if (lines.length > 1) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/TreePrinter.java`
#### Snippet
```java

	private void printMessage(Style style, String indent, String message) {
		String[] lines = message.split("\\R");
		out.print(" ");
		out.print(color(style, lines[0]));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `junit-platform-console/src/main/java/org/junit/platform/console/options/SelectorConverter.java`
#### Snippet
```java

		private IntStream parseIndexDefinition(String value) {
			String[] parts = value.split("\\.\\.", 2);
			int firstIndex = Integer.parseInt(parts[0]);
			if (parts.length == 2) {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestInstance.java`
#### Snippet
```java
		 *
		 * <p>Supported values include names of enum constants defined in
		 * {@link org.junit.jupiter.api.TestInstance.Lifecycle}, ignoring case.
		 *
		 * <p>If not specified, the default is "per_method" which corresponds to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestInstance.java`
#### Snippet
```java
		 *
		 * @since 5.0
		 * @see org.junit.jupiter.api.TestInstance
		 */
		@API(status = STABLE, since = "5.9")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Named.java`
#### Snippet
```java
	 * @param <T> the type of the payload
	 * @return an instance of {@code Named}; never {@code null}
	 * @see #named(String, java.lang.Object)
	 */
	static <T> Named<T> of(String name, T payload) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrderer.java`
#### Snippet
```java
	 *
	 * <p>Supported values include fully qualified class names for types that
	 * implement {@link org.junit.jupiter.api.MethodOrderer}.
	 *
	 * <p>If not specified, test methods will be ordered using an algorithm that
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassOrderer.java`
#### Snippet
```java
	 *
	 * <p>Supported values include fully qualified class names for types that
	 * implement {@link org.junit.jupiter.api.ClassOrderer}.
	 *
	 * <p>If not specified, test classes are not ordered unless test classes are
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/ThrowingConsumer.java`
#### Snippet
```java
 *
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where a {@code ThrowingConsumer} needs to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/ThrowingConsumer.java`
#### Snippet
```java
 *
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where a {@code ThrowingConsumer} needs to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/ThrowingConsumer.java`
#### Snippet
```java
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where a {@code ThrowingConsumer} needs to
 * explicitly throw a {@code Throwable}. In order to support such specialized
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/ThrowingConsumer.java`
#### Snippet
```java
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where a {@code ThrowingConsumer} needs to
 * explicitly throw a {@code Throwable}. In order to support such specialized
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
#### Snippet
```java
 * {@link Throwable}.
 *
 * <p>The {@code Executable} interface is similar to {@link java.lang.Runnable},
 * except that an {@code Executable} can throw any kind of exception.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
#### Snippet
```java
 *
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where an {@code Executable} needs to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
#### Snippet
```java
 *
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where an {@code Executable} needs to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
#### Snippet
```java
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where an {@code Executable} needs to
 * explicitly throw a {@code Throwable}. In order to support such specialized
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
#### Snippet
```java
 * <p>Although Java applications typically throw exceptions that are instances
 * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
 * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
 * scenarios), there may be use cases where an {@code Executable} needs to
 * explicitly throw a {@code Throwable}. In order to support such specialized
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 *
 * @since 5.9.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @since 5.9.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 *
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 *
 * @since 5.7
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @since 5.7
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 *
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @since 5.6
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @since 5.6
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 *
 * @since 5.7
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @since 5.7
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @since 5.1
 * @see OS
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see OS
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @since 5.1
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @since 5.1
 * @see OS
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see OS
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 *
 * @since 5.9.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @since 5.9.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @since 5.1
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see JRE
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 *
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 *
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @since 5.1
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIf
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledIf
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnOs
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnOs
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledOnJre
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledOnJre
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledForJreRange
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledForJreRange
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledInNativeImage
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.DisabledInNativeImage
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.condition` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
#### Snippet
```java
 * @see org.junit.jupiter.api.condition.EnabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfSystemProperty
 * @see org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
 * @see org.junit.jupiter.api.Disabled
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterContext.java`
#### Snippet
```java
 * @since 5.0
 * @see ParameterResolver
 * @see java.lang.reflect.Parameter
 * @see java.lang.reflect.Executable
 * @see java.lang.reflect.Method
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterContext.java`
#### Snippet
```java
 * @see ParameterResolver
 * @see java.lang.reflect.Parameter
 * @see java.lang.reflect.Executable
 * @see java.lang.reflect.Method
 * @see java.lang.reflect.Constructor
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.parallel` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 *
	 * @since 5.8.1
	 * @see org.junit.jupiter.api.parallel.ExecutionMode {@code @ExecutionMode}
	 */
	@API(status = STABLE, since = "5.8.1")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.opentest4j` is unnecessary and can be removed
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/OpenTest4JAndJUnit4AwareThrowableCollector.java`
#### Snippet
```java
/**
 * Specialization of {@link ThrowableCollector} that treats instances of the
 * OTA's {@link org.opentest4j.TestAbortedException} and JUnit 4's
 * {@code org.junit.AssumptionViolatedException} as <em>aborting</em>.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.api.io` is unnecessary and can be removed
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDir.java`
#### Snippet
```java
	/**
	 * Property name used to set the scope of temporary directories created via
	 * {@link org.junit.jupiter.api.io.TempDir @TempDir} annotation: {@value}
	 *
	 * <h4>Supported Values</h4>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
#### Snippet
```java
/**
 * {@code InterceptingExecutableInvoker} encapsulates the invocation of a
 * {@link java.lang.reflect.Executable} (i.e., method or constructor),
 * including support for dynamic resolution of method parameters via
 * {@link ParameterResolver ParameterResolvers}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestFactoryTestDescriptor.java`
#### Snippet
```java

/**
 * {@link org.junit.platform.engine.TestDescriptor TestDescriptor} for
 * {@link org.junit.jupiter.api.TestFactory @TestFactory} methods.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTest.java`
#### Snippet
```java
	 *
	 * @since 5.8
	 * @see java.lang.AutoCloseable
	 */
	@API(status = EXPERIMENTAL, since = "5.8")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSource.java`
#### Snippet
```java
 * @since 5.0
 * @see CsvSource
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/Arguments.java`
#### Snippet
```java
 * @since 5.0
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.provider.ArgumentsProvider
 * @see org.junit.jupiter.params.converter.ArgumentConverter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/Arguments.java`
#### Snippet
```java
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.provider.ArgumentsProvider
 * @see org.junit.jupiter.params.converter.ArgumentConverter
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSource.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.provider.ArgumentsProvider
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptySource.java`
#### Snippet
```java
 *
 * <ul>
 * <li>{@link java.lang.String}</li>
 * <li>{@link java.util.List}</li>
 * <li>{@link java.util.Set}</li>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptySource.java`
#### Snippet
```java
 *
 * @since 5.4
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see NullSource
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSource.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsProvider.java`
#### Snippet
```java
 * @since 5.0
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.provider.Arguments
 * @see org.junit.jupiter.params.support.AnnotationConsumer
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsProvider.java`
#### Snippet
```java
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.provider.Arguments
 * @see org.junit.jupiter.params.support.AnnotationConsumer
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullSource.java`
#### Snippet
```java
 *
 * @since 5.4
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see EmptySource
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSource.java`
#### Snippet
```java
 * @since 5.0
 * @see CsvFileSource
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSources.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 */
@Target(ElementType.METHOD)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeConversionPattern.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see java.time.format.DateTimeFormatterBuilder#appendPattern(String)
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.converter` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConverter.java`
#### Snippet
```java
 * of a {@link org.junit.jupiter.params.ParameterizedTest @ParameterizedTest}
 * method with the help of a
 * {@link org.junit.jupiter.params.converter.ConvertWith @ConvertWith} annotation.
 *
 * <p>Implementations must provide a no-args constructor and should not make any
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.converter` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConverter.java`
#### Snippet
```java
 * @see SimpleArgumentConverter
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.converter.ConvertWith
 * @see org.junit.jupiter.params.support.AnnotationConsumer
 * @see SimpleArgumentConverter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.converter` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ConvertWith.java`
#### Snippet
```java
 * @since 5.0
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see org.junit.jupiter.params.converter.ArgumentConverter
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.provider` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.ParameterizedTest
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.jupiter.params.converter` is unnecessary and can be removed
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.jupiter.params.converter.ArgumentConverter
 */
@API(status = INTERNAL, since = "5.0")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `junit.framework` is unnecessary, and can be replaced with an import
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/JUnit3SuiteWithSingleTestCaseWithSingleTestWhichFails.java`
#### Snippet
```java
public class JUnit3SuiteWithSingleTestCaseWithSingleTestWhichFails extends TestCase {

	public static junit.framework.Test suite() {
		var suite = new TestSuite();
		suite.addTestSuite(PlainJUnit3TestCaseWithSingleTestWhichFails.class);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestEngine.java`
#### Snippet
```java
 *
 * @since 1.0
 * @see org.junit.platform.engine.EngineDiscoveryRequest
 * @see org.junit.platform.engine.ExecutionRequest
 * @see org.junit.platform.commons.annotation.Testable
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestEngine.java`
#### Snippet
```java
 * @since 1.0
 * @see org.junit.platform.engine.EngineDiscoveryRequest
 * @see org.junit.platform.engine.ExecutionRequest
 * @see org.junit.platform.commons.annotation.Testable
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine.support.descriptor` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/UriSource.java`
#### Snippet
```java
	 * @return an appropriate {@code UriSource} for the supplied {@code URI}
	 * @since 1.3
	 * @see org.junit.platform.engine.support.descriptor.FileSource
	 * @see org.junit.platform.engine.support.descriptor.DirectorySource
	 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine.support.descriptor` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/UriSource.java`
#### Snippet
```java
	 * @since 1.3
	 * @see org.junit.platform.engine.support.descriptor.FileSource
	 * @see org.junit.platform.engine.support.descriptor.DirectorySource
	 */
	static UriSource from(URI uri) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/ClassSource.java`
#### Snippet
```java

/**
 * Class based {@link org.junit.platform.engine.TestSource TestSource} with
 * an optional {@linkplain FilePosition file position}.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/PackageSource.java`
#### Snippet
```java

/**
 * Package based {@link org.junit.platform.engine.TestSource}.
 *
 * <p>This class stores the package name because {@link Package} does not
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/ClasspathResourceSource.java`
#### Snippet
```java

/**
 * <em>Classpath resource</em> based {@link org.junit.platform.engine.TestSource}
 * with an optional {@linkplain FilePosition position}.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/MethodSource.java`
#### Snippet
```java

/**
 * Method based {@link org.junit.platform.engine.TestSource TestSource}.
 *
 * <p>This class stores the method name along with the names of its parameter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FileSelector.java`
#### Snippet
```java

	/**
	 * Get the selected file as a {@link java.io.File}.
	 *
	 * @see #getPath()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FileSelector.java`
#### Snippet
```java

	/**
	 * Get the selected file as a {@link java.nio.file.Path} using the
	 * {@linkplain FileSystems#getDefault default} {@link FileSystem}.
	 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine.discovery` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassNameFilter.java`
#### Snippet
```java
	 * Standard include pattern in the form of a regular expression that is
	 * used to match against fully qualified class names:
	 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
	 *
	 * <p>This pattern matches against class names beginning with {@code Test}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DirectorySelector.java`
#### Snippet
```java

	/**
	 * Get the selected directory as a {@link java.nio.file.Path} using the
	 * {@linkplain FileSystems#getDefault default} {@link FileSystem}.
	 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DirectorySelector.java`
#### Snippet
```java

	/**
	 * Get the selected directory as a {@link java.io.File}.
	 *
	 * @see #getPath()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.suite.api` is unnecessary, and can be replaced with an import
in `junit-platform-runner/src/main/java/org/junit/platform/runner/JUnitPlatformTestTree.java`
#### Snippet
```java
	@SuppressWarnings("deprecation")
	private static boolean useTechnicalNames(Class<?> testClass) {
		return testClass.isAnnotationPresent(org.junit.platform.suite.api.UseTechnicalNames.class);
	}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 *
	 * <p>This method extends the functionality of
	 * {@link java.lang.reflect.AnnotatedElement#getAnnotationsByType(Class)}
	 * with additional support for meta-annotations.
	 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
#### Snippet
```java
	 * found or the type hierarchy is exhausted.
	 *
	 * <p>The algorithm does not search for methods in {@link java.lang.Object}.
	 *
	 * @param clazz the class or interface in which to find the method; never {@code null}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
#### Snippet
```java
	 * found or the type hierarchy is exhausted.
	 *
	 * <p>The algorithm does not search for methods in {@link java.lang.Object}.
	 *
	 * @param clazz the class or interface in which to find the method; never {@code null}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `picocli` is unnecessary and can be removed
in `junit-platform-console/src/main/java/org/junit/platform/console/options/AvailableOptions.java`
#### Snippet
```java
		 *
		 * @param map the key-value pairs to add
		 * @throws picocli.CommandLine.ParameterException if the map already contains this key
		 * @see <a href="https://github.com/junit-team/junit5/issues/1308">#1308</a>
		 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Executions.java`
#### Snippet
```java
	 * @return an instance of {@link ListAssert} for executions; never {@code null}
	 * @see org.assertj.core.api.Assertions#assertThat(List)
	 * @see org.assertj.core.api.ListAssert
	 */
	public ListAssert<Execution> assertThatExecutions() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher.core` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * the JUnit Platform Launcher API.
	 *
	 * <p>{@link org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder}
	 * provides a convenient way to build an appropriate discovery request to
	 * supply to this method. As an alternative, consider using
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * the JUnit Platform Launcher API.
	 *
	 * <p>Note that {@link org.junit.platform.launcher.LauncherDiscoveryRequest}
	 * from the {@code junit-platform-launcher} module is a subtype of
	 * {@code EngineDiscoveryRequest}. It is therefore quite convenient to make
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher.core` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * {@code EngineDiscoveryRequest}. It is therefore quite convenient to make
	 * use of the DSL provided in
	 * {@link org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder}
	 * to build an appropriate discovery request to supply to this method. As
	 * an alternative, consider using {@link #engine(String)} for a more fluent
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher.core` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * supplied {@link TestEngine}.
	 *
	 * <p>{@link org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder}
	 * provides a convenient way to build an appropriate discovery request to
	 * supply to this method. As an alternative, consider using
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * supplied {@link TestEngine}.
	 *
	 * <p>Note that {@link org.junit.platform.launcher.LauncherDiscoveryRequest}
	 * from the {@code junit-platform-launcher} module is a subtype of
	 * {@code EngineDiscoveryRequest}. It is therefore quite convenient to make
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher.core` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`
#### Snippet
```java
	 * {@code EngineDiscoveryRequest}. It is therefore quite convenient to make
	 * use of the DSL provided in
	 * {@link org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder}
	 * to build an appropriate discovery request to supply to this method. As
	 * an alternative, consider using {@link #engine(TestEngine)} for a more fluent
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherConstants.java`
#### Snippet
```java
	 *
	 * @see #DEACTIVATE_LISTENERS_PATTERN_PROPERTY_NAME
	 * @see org.junit.platform.launcher.TestExecutionListener
	 */
	public static final String DEACTIVATE_ALL_LISTENERS_PATTERN = ClassNamePatternFilterUtils.DEACTIVATE_ALL_PATTERN;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherConstants.java`
#### Snippet
```java
	 *
	 * @see #DEACTIVATE_ALL_LISTENERS_PATTERN
	 * @see org.junit.platform.launcher.TestExecutionListener
	 */
	public static final String DEACTIVATE_LISTENERS_PATTERN_PROPERTY_NAME = "junit.platform.execution.listeners.deactivate";
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestIdentifier.java`
#### Snippet
```java
	 * @return the display name for this identifier; never {@code null} or blank
	 * @see #getSource()
	 * @see org.junit.platform.engine.TestDescriptor#getDisplayName()
	 */
	public String getDisplayName() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestIdentifier.java`
#### Snippet
```java
	 *
	 * @return the legacy reporting name; never {@code null} or blank
	 * @see org.junit.platform.engine.TestDescriptor#getLegacyReportingName()
	 * @see org.junit.platform.reporting.legacy.LegacyReportingUtils
	 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherFactory.java`
#### Snippet
```java
 * text file named {@code META-INF/services/org.junit.platform.engine.TestEngine}
 * has to be added to the engine's JAR file in which the fully qualified name
 * of the implementation class of the {@link org.junit.platform.engine.TestEngine}
 * interface is declared.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryErrorDescriptor.java`
#### Snippet
```java

/**
 * Represents an error thrown by a {@link org.junit.platform.engine.TestEngine}
 * during discovery.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.launcher` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryRequestBuilder.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors
 * @see org.junit.platform.engine.discovery.ClassNameFilter
 * @see org.junit.platform.launcher.EngineFilter
 * @see org.junit.platform.launcher.TagFilter
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.assertj.core.api` is unnecessary and can be removed
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Events.java`
#### Snippet
```java
	 * @return an instance of {@link ListAssert} for events; never {@code null}
	 * @see org.assertj.core.api.Assertions#assertThat(List)
	 * @see org.assertj.core.api.ListAssert
	 */
	public ListAssert<Event> assertThatEvents() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LoggingListener.java`
#### Snippet
```java
	/**
	 * Create a {@code LoggingListener} which delegates to a
	 * {@link java.util.logging.Logger} using a log level of
	 * {@link Level#FINE FINE}.
	 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary and can be removed
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LoggingListener.java`
#### Snippet
```java
	/**
	 * Create a {@code LoggingListener} which delegates to a
	 * {@link java.util.logging.Logger} using the supplied
	 * {@linkplain Level log level}.
	 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.platform.engine` is unnecessary and can be removed
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestEngine.java`
#### Snippet
```java

/**
 * The JUnit Platform Suite {@link org.junit.platform.engine.TestEngine TestEngine}.
 *
 * @since 1.8
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.rules` is unnecessary and can be removed
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/VerifierSupport.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.rules.Verifier
 * @see org.junit.rules.TestRule
 * @see org.junit.Rule
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.rules` is unnecessary and can be removed
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExternalResourceSupport.java`
#### Snippet
```java
 *
 * @since 5.0
 * @see org.junit.rules.ExternalResource
 * @see org.junit.rules.TestRule
 * @see org.junit.Rule
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit.rules` is unnecessary and can be removed
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExpectedExceptionSupport.java`
#### Snippet
```java
 * @since 5.0
 * @see org.junit.jupiter.api.Assertions#assertThrows
 * @see org.junit.rules.ExpectedException
 * @see org.junit.rules.TestRule
 * @see org.junit.Rule
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.junit` is unnecessary and can be removed
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/IgnoreCondition.java`
#### Snippet
```java
 *
 * @since 5.4
 * @see org.junit.Ignore @Ignore
 * @see org.junit.jupiter.api.Disabled @Disabled
 * @see #evaluateExecutionCondition(ExtensionContext)
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TypeBasedParameterResolver()` of an abstract class should not be declared 'public'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/support/TypeBasedParameterResolver.java`
#### Snippet
```java
	private final Type supportedParameterType;

	public TypeBasedParameterResolver() {
		this.supportedParameterType = enclosedTypeOfParameterResolver();
	}
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractJunit4TestCaseWithConstructorParameter()` of an abstract class should not be declared 'public'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/AbstractJunit4TestCaseWithConstructorParameter.java`
#### Snippet
```java
public abstract class AbstractJunit4TestCaseWithConstructorParameter {

	public AbstractJunit4TestCaseWithConstructorParameter(int parameter) {

	}
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `HierarchicalTestEngine()` of an abstract class should not be declared 'public'
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestEngine.java`
#### Snippet
```java
public abstract class HierarchicalTestEngine<C extends EngineExecutionContext> implements TestEngine {

	public HierarchicalTestEngine() {
	}

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractTestRuleAdapter()` of an abstract class should not be declared 'public'
in `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java`
#### Snippet
```java
	private final TestRule target;

	public AbstractTestRuleAdapter(TestRuleAnnotatedMember annotatedMember, Class<? extends TestRule> adapteeClass) {
		this.target = annotatedMember.getTestRule();
		Preconditions.condition(adapteeClass.isAssignableFrom(this.target.getClass()),
```

## RuleId[ruleID=TestCaseWithConstructor]
### RuleId[ruleID=TestCaseWithConstructor]
Initialization logic in constructor `JUnit3ParallelSuiteWithSubsuites()` instead of 'setup()' life cycle method
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/JUnit3ParallelSuiteWithSubsuites.java`
#### Snippet
```java
	private final String arg;

	public JUnit3ParallelSuiteWithSubsuites(String name, String arg) {
		super(name);
		this.arg = arg;
```

### RuleId[ruleID=TestCaseWithConstructor]
Initialization logic in constructor `JUnit3SuiteWithSubsuites()` instead of 'setup()' life cycle method
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/JUnit3SuiteWithSubsuites.java`
#### Snippet
```java
	private final String arg;

	public JUnit3SuiteWithSubsuites(String name, String arg) {
		super(name);
		this.arg = arg;
```

### RuleId[ruleID=TestCaseWithConstructor]
Initialization logic in constructor `Runner()` instead of 'setup()' life cycle method
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java
		private final Class<?> testClass;

		public Runner(Class<?> testClass) {
			this.testClass = testClass;
		}
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `osName`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java`
#### Snippet
```java
		}

		osName = osName.toLowerCase(Locale.ENGLISH);

		if (osName.contains("aix")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/MutableExtensionRegistry.java`
#### Snippet
```java
			Member member = (Member) source;
			Object type = (member instanceof Method ? "method" : "field");
			source = String.format("%s %s.%s", type, member.getDeclaringClass().getName(), member.getName());
		}
		return " from source [" + source + "]";
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertLinesMatch.java`
#### Snippet
```java

	static boolean isFastForwardLine(String line) {
		line = line.trim();
		return line.length() >= 4 && line.startsWith(">>") && line.endsWith(">>");
	}
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fastForwardLine`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertLinesMatch.java`
#### Snippet
```java

	static int parseFastForwardLimit(String fastForwardLine) {
		fastForwardLine = fastForwardLine.trim();
		String text = fastForwardLine.substring(2, fastForwardLine.length() - 2).trim();
		try {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `factoryMethodName`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
#### Snippet
```java
		Method testMethod = context.getRequiredTestMethod();
		if (StringUtils.isBlank(factoryMethodName)) {
			factoryMethodName = testMethod.getName();
		}
		if (factoryMethodName.contains(".") || factoryMethodName.contains("#")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `name`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestTag.java`
#### Snippet
```java
			return false;
		}
		name = name.trim();

		return !name.isEmpty() && //
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `basePackageName`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java`
#### Snippet
```java
			"basePackageName must not be null or blank");
		Preconditions.notNull(classFilter, "classFilter must not be null");
		basePackageName = basePackageName.trim();

		return findClassesForUris(getRootUrisForPackageNameOnClassPathAndModulePath(basePackageName), basePackageName,
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `resourceName`
in `junit-platform-commons/src/main/java9/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
		 */
		private String className(String resourceName) {
			resourceName = resourceName.substring(0, resourceName.length() - 6); // 6 = ".class".length()
			resourceName = resourceName.replace('/', '.');
			return resourceName;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `resourceName`
in `junit-platform-commons/src/main/java9/org/junit/platform/commons/util/ModuleUtils.java`
#### Snippet
```java
		private String className(String resourceName) {
			resourceName = resourceName.substring(0, resourceName.length() - 6); // 6 = ".class".length()
			resourceName = resourceName.replace('/', '.');
			return resourceName;
		}
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `indent`
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/TreePrinter.java`
#### Snippet
```java
		}
		if (node.visible) {
			indent += continuous ? theme.vertical() : theme.blank();
		}
		Iterator<TreeNode> iterator = node.children.iterator();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `max`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
#### Snippet
```java
		if (throwable.getCause() != null
				|| (throwable.getSuppressed() != null && throwable.getSuppressed().length > 0)) {
			max = max / 2;
		}
		printStackTrace(writer, new StackTraceElement[] {}, throwable, "", DOUBLE_TAB + " ", new HashSet<>(), max);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sourceType`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java

		if (isPrimitive) {
			sourceType = primitiveToWrapperMap.get(sourceType);
		}

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java

	public static String replaceVersionPlaceholders(String line) {
		line = line.replace("${jupiterVersion}", version("junit-jupiter"));
		line = line.replace("${vintageVersion}", version("junit-vintage"));
		line = line.replace("${platformVersion}", version("junit-platform"));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java
	public static String replaceVersionPlaceholders(String line) {
		line = line.replace("${jupiterVersion}", version("junit-jupiter"));
		line = line.replace("${vintageVersion}", version("junit-vintage"));
		line = line.replace("${platformVersion}", version("junit-platform"));
		return line;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java
		line = line.replace("${jupiterVersion}", version("junit-jupiter"));
		line = line.replace("${vintageVersion}", version("junit-vintage"));
		line = line.replace("${platformVersion}", version("junit-platform"));
		return line;
	}
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionFailureBuilder.java`
#### Snippet
```java
	private static String nullSafeGet(Object messageOrSupplier) {
		if (messageOrSupplier == null) {
			return null;
		}
		if (messageOrSupplier instanceof Supplier) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
		assertTimeoutPreemptively(timeout, () -> {
			executable.execute();
			return null;
		}, messageSupplier);
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
		assertTimeoutPreemptively(timeout, () -> {
			executable.execute();
			return null;
		}, message);
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
#### Snippet
```java
		assertTimeout(timeout, () -> {
			executable.execute();
			return null;
		}, messageSupplier);
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
#### Snippet
```java
		assertTimeout(timeout, () -> {
			executable.execute();
			return null;
		}, message);
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionUtils.java`
#### Snippet
```java

	static String nullSafeGet(Supplier<String> messageSupplier) {
		return (messageSupplier != null ? messageSupplier.get() : null);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java`
#### Snippet
```java

			// null signals that the current OS is "unknown"
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertAll.java`
#### Snippet
```java
					try {
						executable.execute();
						return null;
					}
					catch (Throwable t) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/JRE.java`
#### Snippet
```java

		// null signals that the current JRE version is "unknown"
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/support/TypeBasedParameterResolver.java`
#### Snippet
```java
		// Abort?
		if (superclass == null || superclass == Object.class) {
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
	Object get(Namespace namespace, Object key) {
		StoredValue storedValue = getStoredValue(new CompositeKey(namespace, key));
		return (storedValue != null ? storedValue.evaluate() : null);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
			return parentStore.getStoredValue(compositeKey);
		}
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
			}
			catch (RuntimeException e) {
				return null;
			}
		}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
	private <T> T castToRequiredType(Object key, Object value, Class<T> requiredType) {
		if (value == null) {
			return null;
		}
		if (isAssignableTo(value, requiredType)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionValuesStore.java`
#### Snippet
```java
	Object remove(Namespace namespace, Object key) {
		StoredValue previous = storedValues.remove(new CompositeKey(namespace, key));
		return (previous != null ? previous.evaluate() : null);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
#### Snippet
```java
						"Invalid timeout thread mode '%s', only %s and %s can be used as configuration parameter for %s.",
						value, SAME_THREAD, SEPARATE_THREAD, DEFAULT_TIMEOUT_THREAD_MODE_PROPERTY_NAME));
					return null;
				}
				return threadMode;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
#### Snippet
```java
					() -> String.format("Invalid timeout thread mode '%s' set via the '%s' configuration parameter.",
						value, DEFAULT_TIMEOUT_THREAD_MODE_PROPERTY_NAME));
				return null;
			}
		});
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
#### Snippet
```java
					() -> String.format("Ignored invalid timeout '%s' set via the '%s' configuration parameter.", value,
						key));
				return null;
			}
		}));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java

		private static Object nullSafeGet(Optional<?> optional) {
			return optional != null ? optional.orElse(null) : null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
		}

		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/FallbackStringToObjectConverter.java`
#### Snippet
```java
			return constructors.get(0);
		}
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/FallbackStringToObjectConverter.java`
#### Snippet
```java
			return factoryMethods.get(0);
		}
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
#### Snippet
```java
		public Runner runnerForClass(Class<?> testClass) {
			// don't ignore entire test classes just yet
			return null;
		}
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
#### Snippet
```java
				return super.runnerForClass(testClass);
			}
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
#### Snippet
```java
			if ("org.junit.platform.runner.JUnitPlatform".equals(runnerClass.getName())) {
				logger.warn(() -> "Ignoring test class using JUnitPlatform runner: " + testClass.getName());
				return null;
			}
			return super.buildRunner(runnerClass, testClass);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
#### Snippet
```java
	public TestSource findTestSource(Description description) {
		TestSource testSource = testSourceCache.computeIfAbsent(description, this::computeTestSource);
		return testSource == NULL_SOURCE ? null : testSource;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
#### Snippet
```java
				.collect(toList());
		if (methods.isEmpty()) {
			return null;
		}
		if (methods.size() == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
#### Snippet
```java
			return methods.get(0);
		}
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
#### Snippet
```java
					"Cannot convert null to primitive value of type " + targetType.getName());
			}
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
#### Snippet
```java
	 */
	public static FilterResult includedIf(boolean included) {
		return includedIf(included, () -> null, () -> null);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
#### Snippet
```java
	 */
	public static FilterResult includedIf(boolean included) {
		return includedIf(included, () -> null, () -> null);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
#### Snippet
```java
	@API(status = EXPERIMENTAL, since = "1.9")
	default Predicate<? super ForkJoinPool> getSaturatePredicate() {
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ExceptionUtils.java`
#### Snippet
```java

		// Appeasing the compiler: the following line will never be executed.
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CloseablePath.java`
#### Snippet
```java
			if (referenceCount.decrementAndGet() == 0) {
				close();
				return null;
			}
			return this;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/StringUtils.java`
#### Snippet
```java
	public static String replaceIsoControlCharacters(String str, String replacement) {
		Preconditions.notNull(replacement, "replacement must not be null");
		return str == null ? null : ISO_CONTROL_PATTERN.matcher(str).replaceAll(replacement);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/StringUtils.java`
#### Snippet
```java
	public static String replaceWhitespaceCharacters(String str, String replacement) {
		Preconditions.notNull(replacement, "replacement must not be null");
		return str == null ? null : WHITESPACE_PATTERN.matcher(str).replaceAll(replacement);
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/logging/LoggerFactory.java`
#### Snippet
```java

		private static String nullSafeGet(Supplier<String> messageSupplier) {
			return (messageSupplier != null ? messageSupplier.get() : null);
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/testFixtures/java/org/junit/platform/commons/test/ConcurrencyTestingUtils.java`
#### Snippet
```java
		executeConcurrently(threads, () -> {
			action.run();
			return null;
		});
	}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/DiscoveryRequestCreator.java`
#### Snippet
```java
							return ((MethodSelector) selector).getClassName();
						}
						return null;
					}) //
					.filter(Objects::nonNull) //
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/Assertions.java`
#### Snippet
```java
					try {
						executable.execute();
						return null;
					}
					catch (Throwable t) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
#### Snippet
```java
					}
					catch (Exception ignore) {
						return null;
					}
				}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java

			if (index == 0) {
				return null;
			}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
#### Snippet
```java
	public static <V> V fail() {
		AssertionUtils.fail();
		return null; // appeasing the compiler: this line will never be executed.
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
#### Snippet
```java
	public static <V> V fail(Supplier<String> messageSupplier) {
		AssertionUtils.fail(messageSupplier);
		return null; // appeasing the compiler: this line will never be executed.
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
#### Snippet
```java
	public static <V> V fail(Throwable cause) {
		AssertionUtils.fail(cause);
		return null; // appeasing the compiler: this line will never be executed.
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
#### Snippet
```java
	public static <V> V fail(String message) {
		AssertionUtils.fail(message);
		return null; // appeasing the compiler: this line will never be executed.
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
#### Snippet
```java
	public static <V> V fail(String message, Throwable cause) {
		AssertionUtils.fail(message, cause);
		return null; // appeasing the compiler: this line will never be executed.
	}

```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[n?m]?s)`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutDurationParser.java`
#### Snippet
```java
class TimeoutDurationParser {

	private static final Pattern PATTERN = Pattern.compile("([1-9]\\d*) ?((?:[n?m]?s)|m|h|d)?",
		CASE_INSENSITIVE | UNICODE_CASE);
	private static final Map<String, TimeUnit> UNITS_BY_ABBREVIATION;
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:(?:any|none)\\(\\))`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Tokenizer.java`
#### Snippet
```java
class Tokenizer {

	private static final Pattern PATTERN = Pattern.compile("\\s*(?:(?:(?:any|none)\\(\\))|[()!|&]|(?:[^\\s()!|&]+))",
		CASE_INSENSITIVE);

```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[^\\s()!|&]+)`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Tokenizer.java`
#### Snippet
```java
class Tokenizer {

	private static final Pattern PATTERN = Pattern.compile("\\s*(?:(?:(?:any|none)\\(\\))|[()!|&]|(?:[^\\s()!|&]+))",
		CASE_INSENSITIVE);

```

## RuleId[ruleID=ThrowableNotThrown]
### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assumptions.java`
#### Snippet
```java
			}
			catch (Throwable t) {
				ExceptionUtils.throwAsUncheckedException(t);
			}
		}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
#### Snippet
```java
		}
		catch (Throwable ex) {
			throwAsUncheckedException(ex);
		}

```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`
#### Snippet
```java
			}
			catch (Throwable t) {
				ExceptionUtils.throwAsUncheckedException(t);
			}
		});
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
#### Snippet
```java
		// No handlers left?
		if (exceptionHandlers.isEmpty()) {
			ExceptionUtils.throwAsUncheckedException(throwable);
		}

```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
		}
		catch (Throwable throwable) {
			ExceptionUtils.throwAsUncheckedException(throwable);
		}
	}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
					}
					catch (Throwable throwable) {
						handleCsvException(throwable, this.annotation);
					}
				});
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
		}
		catch (Throwable throwable) {
			handleCsvException(throwable, this.annotation);
		}
		return this.csvParser;
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
			}
			catch (Throwable throwable) {
				handleCsvException(throwable, this.annotation);
			}
		}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
#### Snippet
```java
			}
			catch (InterruptedException e) {
				ExceptionUtils.throwAsUncheckedException(e);
			}
		}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ThrowableCollector.java`
#### Snippet
```java
	public void assertEmpty() {
		if (!isEmpty()) {
			ExceptionUtils.throwAsUncheckedException(this.throwable);
		}
	}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTask.java`
#### Snippet
```java
				}
				catch (ExecutionException e) {
					ExceptionUtils.throwAsUncheckedException(e.getCause());
				}
			}
```

### RuleId[ruleID=ThrowableNotThrown]
Result of `throwAsUncheckedException()` not thrown
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/UnrecoverableExceptions.java`
#### Snippet
```java
	public static void rethrowIfUnrecoverable(Throwable exception) {
		if (exception instanceof OutOfMemoryError) {
			ExceptionUtils.throwAsUncheckedException(exception);
		}
	}
```

## RuleId[ruleID=ClassCanBeRecord]
### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/RunnerWithCustomUniqueIdsAndDisplayNames.java`
#### Snippet
```java
	}

	private static class CustomUniqueId implements Serializable {

		@Serial
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `junit-platform-engine/src/testFixtures/java/org/junit/platform/engine/support/hierarchical/DemoEngineExecutionContext.java`
#### Snippet
```java
 * @since 1.0
 */
public class DemoEngineExecutionContext implements EngineExecutionContext {

	public final ExecutionRequest request;
```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'repositories(org.gradle.api.Action)' is declared in unstable interface 'org.gradle.api.initialization.resolve.DependencyResolutionManagement' marked with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
	repositories {
		mavenCentral()
		maven(url = "https://oss.sonatype.org/content/repositories/snapshots") {
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	testImplementation(libs.bundles.xmlunit)

	thirdPartyJars(libs.junit4)
	thirdPartyJars(libs.assertj)
	thirdPartyJars(libs.apiguardian)
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java

	thirdPartyJars(libs.junit4)
	thirdPartyJars(libs.assertj)
	thirdPartyJars(libs.apiguardian)
	thirdPartyJars(libs.hamcrest)
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	thirdPartyJars(libs.junit4)
	thirdPartyJars(libs.assertj)
	thirdPartyJars(libs.apiguardian)
	thirdPartyJars(libs.hamcrest)
	thirdPartyJars(libs.opentest4j)
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	thirdPartyJars(libs.assertj)
	thirdPartyJars(libs.apiguardian)
	thirdPartyJars(libs.hamcrest)
	thirdPartyJars(libs.opentest4j)

```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	thirdPartyJars(libs.apiguardian)
	thirdPartyJars(libs.hamcrest)
	thirdPartyJars(libs.opentest4j)

	antJars(platform(projects.junitBom))
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java

	antJars(platform(projects.junitBom))
	antJars(libs.bundles.ant)
	antJars(projects.junitPlatformConsoleStandalone)
	antJars(projects.junitPlatformLauncher)
```

### RuleId[ruleID=UnstableApiUsage]
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider, kotlin.jvm.functions.Function1)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	antJars(projects.junitPlatformReporting)

	mavenDistribution(libs.maven) {
		artifact {
			classifier = "bin"
```

## RuleId[ruleID=TestCaseWithNoTestMethods]
### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `EnclosedJUnit4TestCase` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/EnclosedJUnit4TestCase.java`
#### Snippet
```java
 */
@RunWith(Enclosed.class)
public class EnclosedJUnit4TestCase {

	@Category(Categories.Plain.class)
```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `JUnit4SuiteWithExceptionThrowingRunner` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4SuiteWithExceptionThrowingRunner.java`
#### Snippet
```java
@RunWith(ExceptionThrowingRunner.class)
@ChildCount(1)
public class JUnit4SuiteWithExceptionThrowingRunner {
}

```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `CompletelyDynamicTestCase` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/CompletelyDynamicTestCase.java`
#### Snippet
```java
@RunWith(DynamicRunner.class)
@ChildCount(1)
public class CompletelyDynamicTestCase {
}

```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `TestCaseRunWithJUnitPlatformRunner` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/TestCaseRunWithJUnitPlatformRunner.java`
#### Snippet
```java
@RunWith(JUnitPlatform.class)
@SelectClasses(PlainJUnit4TestCaseWithSingleTestWhichFails.class)
public class TestCaseRunWithJUnitPlatformRunner {
}

```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `JUnit4TestCaseWithExceptionThrowingRunner` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithExceptionThrowingRunner.java`
#### Snippet
```java
@RunWith(ExceptionThrowingRunner.class)
@ChildCount(0)
public class JUnit4TestCaseWithExceptionThrowingRunner {
}

```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `Runner` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java
@RunWith(JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.Runner.class)
public class JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions {
	public static class Runner extends org.junit.runner.Runner {

		private final Class<?> testClass;
```

### RuleId[ruleID=TestCaseWithNoTestMethods]
Test class `JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions` has no tests
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java

@RunWith(JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.Runner.class)
public class JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions {
	public static class Runner extends org.junit.runner.Runner {

```

