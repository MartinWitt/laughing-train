# junit5 
 
# Bad smells
I found 402 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 102 | false |
| OptionalUsedAsFieldOrParameterType | 45 | false |
| FieldMayBeFinal | 44 | false |
| NewClassNamingConvention | 24 | false |
| Deprecation | 18 | false |
| UnstableApiUsage | 17 | false |
| DataFlowIssue | 16 | false |
| ThrowableNotThrown | 13 | false |
| HasPlatformType | 12 | false |
| UnusedSymbol | 12 | false |
| DeprecatedIsStillUsed | 10 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| LeakingThis | 8 | false |
| UnnecessarySemicolon | 7 | false |
| DuplicatedCode | 7 | false |
| RedundantCast | 7 | false |
| TrivialIf | 5 | false |
| NestedLambdaShadowedImplicitParameter | 5 | false |
| JavadocDeclaration | 5 | false |
| ReplaceCallWithBinaryOperator | 4 | false |
| AutoCloseableResource | 3 | false |
| RegExpUnnecessaryNonCapturingGroup | 3 | false |
| FinalMethodInFinalClass | 2 | false |
| NullableProblems | 2 | false |
| OptionalAssignedToNull | 2 | false |
| JUnitMalformedDeclaration | 2 | false |
| ConstantValue | 2 | false |
| RegExpRedundantEscape | 1 | false |
| ConvertArgumentToSet | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| CollectionContainsUrl | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| IgnoreResultOfCall | 1 | false |
| PropertyName | 1 | false |
| RedundantMethodOverride | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| KotlinUnusedImport | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| LocalVariableName | 1 | false |
| RedundantUnmodifiable | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Symbol `org.junit.jupiter.params.ParameterizedTest` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestReporter.java`
#### Snippet
```java
 * methods as well as methods annotated with {@link Test @Test},
 * {@link RepeatedTest @RepeatedTest},
 * {@link org.junit.jupiter.params.ParameterizedTest @ParameterizedTest},
 * {@link TestFactory @TestFactory}, etc.
 *
```

### JavadocReference
Symbol `org.junit.platform.engine.ConfigurationParameters` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassOrdererContext.java`
#### Snippet
```java
	 *
	 * @see System#getProperty(String)
	 * @see org.junit.platform.engine.ConfigurationParameters
	 */
	Optional<String> getConfigurationParameter(String key);
```

### JavadocReference
Symbol `org.junit.jupiter.params.ParameterizedTest` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Test.java`
#### Snippet
```java
 * @since 5.0
 * @see RepeatedTest
 * @see org.junit.jupiter.params.ParameterizedTest
 * @see TestTemplate
 * @see TestFactory
```

### JavadocReference
Symbol `org.junit.platform.engine.ConfigurationParameters` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrdererContext.java`
#### Snippet
```java
	 *
	 * @see System#getProperty(String)
	 * @see org.junit.platform.engine.ConfigurationParameters
	 */
	Optional<String> getConfigurationParameter(String key);
```

### JavadocReference
Symbol `org.junit.platform.engine.support.hierarchical.ExclusiveResource` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Resources.java`
#### Snippet
```java
	 * @since 5.8
	 * @see Isolated
	 * @see org.junit.platform.engine.support.hierarchical.ExclusiveResource
	 */
	@API(status = STABLE, since = "5.10")
```

### JavadocReference
Symbol `enabled` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutionCondition.java`
#### Snippet
```java
	 * Evaluate this condition for the supplied {@link ExtensionContext}.
	 *
	 * <p>An {@linkplain ConditionEvaluationResult#enabled enabled} result
	 * indicates that the container or test should be executed; whereas, a
	 * {@linkplain ConditionEvaluationResult#disabled disabled} result
```

### JavadocReference
Symbol `org.junit.platform.engine.ConfigurationParameters` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @since 5.1
	 * @see System#getProperty(String)
	 * @see org.junit.platform.engine.ConfigurationParameters
	 */
	@API(status = STABLE, since = "5.1")
```

### JavadocReference
Symbol `org.junit.platform.engine.EngineExecutionListener` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(Map)
	 * @see #publishReportEntry(String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	default void publishReportEntry(String key, String value) {
```

### JavadocReference
Symbol `reportingEntryPublished` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(Map)
	 * @see #publishReportEntry(String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	default void publishReportEntry(String key, String value) {
```

### JavadocReference
Symbol `org.junit.platform.engine.EngineExecutionListener` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(Map)
	 * @see #publishReportEntry(String, String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	@API(status = STABLE, since = "5.3")
```

### JavadocReference
Symbol `reportingEntryPublished` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(Map)
	 * @see #publishReportEntry(String, String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	@API(status = STABLE, since = "5.3")
```

### JavadocReference
Symbol `org.junit.platform.engine.ConfigurationParameters` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @since 5.7
	 * @see System#getProperty(String)
	 * @see org.junit.platform.engine.ConfigurationParameters
	 */
	@API(status = STABLE, since = "5.10")
```

### JavadocReference
Symbol `org.junit.platform.engine.EngineExecutionListener` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(String, String)
	 * @see #publishReportEntry(String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	void publishReportEntry(Map<String, String> map);
```

### JavadocReference
Symbol `reportingEntryPublished` is inaccessible from here
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
#### Snippet
```java
	 * @see #publishReportEntry(String, String)
	 * @see #publishReportEntry(String)
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished
	 */
	void publishReportEntry(Map<String, String> map);
```

### JavadocReference
Cannot resolve symbol `JUnit4ParameterizedTests`
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4ParameterizedTestCase.java`
#### Snippet
```java

/**
 * Test case used in {@link JUnit4ParameterizedTests}.
 *
 * @since 4.12
```

### JavadocReference
Symbol `org.junit.platform.launcher.TestExecutionListener` is inaccessible from here
in `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
#### Snippet
```java
 *
 * <p>As of JUnit Platform 1.8, configuration parameters are also made available to
 * implementations of the {@link org.junit.platform.launcher.TestExecutionListener}
 * API via the {@link org.junit.platform.launcher.TestPlan}.
 *
```

### JavadocReference
Symbol `org.junit.platform.launcher.TestPlan` is inaccessible from here
in `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
#### Snippet
```java
 * <p>As of JUnit Platform 1.8, configuration parameters are also made available to
 * implementations of the {@link org.junit.platform.launcher.TestExecutionListener}
 * API via the {@link org.junit.platform.launcher.TestPlan}.
 *
 * @since 1.0
```

### JavadocReference
Cannot resolve symbol `ForkJoinPool(int, ForkJoinPool.ForkJoinWorkerThreadFactory, Thread.UncaughtExceptionHandler,
* boolean, int, int, int, Predicate, long, TimeUnit)`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
#### Snippet
```java
	 * @return the saturate predicate to be passed to the {@code ForkJoinPool} constructor; may be {@code null}
	 * @since 1.9
	 * @see ForkJoinPool#ForkJoinPool(int, ForkJoinPool.ForkJoinWorkerThreadFactory, Thread.UncaughtExceptionHandler,
	 * boolean, int, int, int, Predicate, long, TimeUnit)
	 */
```

### JavadocReference
Cannot resolve symbol `TimeUnit`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
#### Snippet
```java
	 * @since 1.9
	 * @see ForkJoinPool#ForkJoinPool(int, ForkJoinPool.ForkJoinWorkerThreadFactory, Thread.UncaughtExceptionHandler,
	 * boolean, int, int, int, Predicate, long, TimeUnit)
	 */
	@API(status = EXPERIMENTAL, since = "1.9")
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ModifierSupport.java`
#### Snippet
```java
 * {@code public}, {@code private}, {@code abstract}, {@code static}, etc.
 *
 * <p>{@link org.junit.platform.engine.TestEngine TestEngine} and extension
 * authors are encouraged to use these supported methods in order to align with
 * the behavior of the JUnit Platform.
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ClassSupport.java`
#### Snippet
```java
 * classes.
 *
 * <p>{@link org.junit.platform.engine.TestEngine TestEngine} and extension
 * authors are encouraged to use these supported methods in order to align with
 * the behavior of the JUnit Platform.
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
#### Snippet
```java
 * or module-path, loading classes, finding methods, invoking methods, etc.
 *
 * <p>{@link org.junit.platform.engine.TestEngine TestEngine} and extension
 * authors are encouraged to use these supported methods in order to align with
 * the behavior of the JUnit Platform.
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
 * a particular annotation, etc.
 *
 * <p>{@link org.junit.platform.engine.TestEngine TestEngine} and extension
 * authors are encouraged to use these supported methods in order to align with
 * the behavior of the JUnit Platform.
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludePackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#excludePackageNames(String...)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.PackageNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludePackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#excludePackageNames(String...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `excludePackageNames(String...)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludePackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#excludePackageNames(String...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Cannot resolve symbol `Suite`
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/package-info.java`
#### Snippet
```java
 * <h2>JUnit 5 Suite Support</h2>
 * <p>Test suites can be run on the JUnit Platform in a JUnit 5 environment via
 * {@link Suite @Suite} with the {@code junit-platform-suite-engine}.
 */

```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.ClassNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
 */
```

### JavadocReference
Symbol `STANDARD_INCLUDE_PATTERN` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.ClassNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `includeClassNamePatterns` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeClassNamePatterns.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#excludeClassNamePatterns
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.ClassNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeClassNamePatterns.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#excludeClassNamePatterns
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `excludeClassNamePatterns` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeClassNamePatterns.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#excludeClassNamePatterns
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeEngines.java`
#### Snippet
```java
/**
 * {@code @IncludeEngines} specifies the {@linkplain #value IDs} of
 * {@link org.junit.platform.engine.TestEngine TestEngines} to be included
 * when running a test suite on the JUnit Platform.
 *
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeEngines.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#includeEngines
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.EngineFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeEngines.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#includeEngines
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `includeEngines` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeEngines.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#includeEngines
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Cannot resolve symbol `selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)`
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.FilePosition` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectModules(Set)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectModules(Set)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectModules(Set)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectModules(Set)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludePackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#includePackageNames(String...)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.PackageNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludePackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#includePackageNames(String...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `includePackageNames(String...)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludePackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#includePackageNames(String...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectPackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectPackage(String)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectPackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectPackage(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectPackage(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectPackages.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectPackage(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
#### Snippet
```java
 * @see DisableParentConfigurationParameters
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder#configurationParameter(String, String)
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder#configurationParameter(String, String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `configurationParameter(String, String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder#configurationParameter(String, String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.ClassNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * <p>When the {@link IncludeClassNamePatterns @IncludeClassNamePatterns}
 * annotation is not present, the default include pattern
 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
 * will be used in order to avoid loading classes unnecessarily (see {@link
 * org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
```

### JavadocReference
Symbol `STANDARD_INCLUDE_PATTERN` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * <p>When the {@link IncludeClassNamePatterns @IncludeClassNamePatterns}
 * annotation is not present, the default include pattern
 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
 * will be used in order to avoid loading classes unnecessarily (see {@link
 * org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.ClassNameFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
 * will be used in order to avoid loading classes unnecessarily (see {@link
 * org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * ClassNameFilter#STANDARD_INCLUDE_PATTERN}).
 *
```

### JavadocReference
Symbol `STANDARD_INCLUDE_PATTERN` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
 * will be used in order to avoid loading classes unnecessarily (see {@link
 * org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * ClassNameFilter#STANDARD_INCLUDE_PATTERN}).
 *
```

### JavadocReference
Symbol `org.junit.platform.launcher.LauncherDiscoveryRequest` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * @see ConfigurationParameter
 * @see DisableParentConfigurationParameters
 * @see org.junit.platform.launcher.LauncherDiscoveryRequest
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
 * @see org.junit.platform.launcher.Launcher
```

### JavadocReference
Symbol `org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * @see DisableParentConfigurationParameters
 * @see org.junit.platform.launcher.LauncherDiscoveryRequest
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
 * @see org.junit.platform.launcher.Launcher
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.Launcher` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
#### Snippet
```java
 * @see org.junit.platform.launcher.LauncherDiscoveryRequest
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
 * @see org.junit.platform.launcher.Launcher
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SuiteDisplayName.java`
#### Snippet
```java
 * @since 1.1
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 */
@Retention(RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeTags.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#includeTags
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.TagFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeTags.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#includeTags
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `includeTags` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeTags.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#includeTags
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
	 * <p>Cannot be combined with any other attribute.
	 *
	 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
	 */
	String value() default "";
```

### JavadocReference
Symbol `selectMethod(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
	 * <p>Cannot be combined with any other attribute.
	 *
	 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
	 */
	String value() default "";
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectFile(String, org.junit.platform.engine.discovery.FilePosition)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectFile(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Cannot resolve symbol `selectFile(String, org.junit.platform.engine.discovery.FilePosition)`
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectFile(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.FilePosition` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectFile(String, org.junit.platform.engine.discovery.FilePosition)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @since 1.10
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
```

### JavadocReference
Symbol `selectMethod(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
```

### JavadocReference
Symbol `selectMethod(String, String, String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
```

### JavadocReference
Symbol `selectMethod(String, String, Class...)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
 */
```

### JavadocReference
Symbol `selectMethod(Class, String, String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectMethod(Class, String, Class...)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, Class...)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(Class, String, Class...)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
 */
```

### JavadocReference
Symbol `selectClass(Class)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectClass(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeTags.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#excludeTags
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.TagFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeTags.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#excludeTags
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `excludeTags` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeTags.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#excludeTags
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.engine.TestEngine` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeEngines.java`
#### Snippet
```java
/**
 * {@code @ExcludeEngines} specifies the {@linkplain #value IDs} of
 * {@link org.junit.platform.engine.TestEngine TestEngines} to be excluded
 * when running a test suite on the JUnit Platform.
 *
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeEngines.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#excludeEngines
 */
```

### JavadocReference
Symbol `org.junit.platform.launcher.EngineFilter` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeEngines.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#excludeEngines
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `excludeEngines` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeEngines.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#excludeEngines
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectUri(String)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectUri(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectUri(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectUri(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectDirectory(String)
 */
```

### JavadocReference
Symbol `org.junit.platform.engine.discovery.DiscoverySelectors` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectDirectory(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `selectDirectory(String)` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
#### Snippet
```java
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectDirectory(String)
 */
@Retention(RetentionPolicy.RUNTIME)
```

### JavadocReference
Symbol `org.junit.platform.runner.JUnitPlatform` is inaccessible from here
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/UseTechnicalNames.java`
#### Snippet
```java
 *
 * @since 1.0
 * @see org.junit.platform.runner.JUnitPlatform
 * @deprecated since 1.8, in favor of the {@link Suite @Suite} support provided by
 * the {@code junit-platform-suite-engine} module; to be removed in JUnit Platform 2.0
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/CleanupMode.java`
#### Snippet
```java
	 * Never clean up a temporary directory after the test has completed.
	 */
	NEVER;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestExecutionResult.java`
#### Snippet
```java
		 * Indicates that the execution of a test or container <em>failed</em>.
		 */
		FAILED;

	}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/SearchOption.java`
#### Snippet
```java
	 * hierarchy for <em>inner classes</em> (i.e., a non-static member classes).
	 */
	INCLUDE_ENCLOSING_CLASSES;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/HierarchyTraversalMode.java`
#### Snippet
```java
	 * Traverse the hierarchy using bottom-up semantics.
	 */
	BOTTOM_UP;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		 * Traverse the hierarchy using bottom-up semantics.
		 */
		BOTTOM_UP;
	}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EventType.java`
#### Snippet
```java
	 * @see org.junit.platform.engine.EngineExecutionListener#reportingEntryPublished(TestDescriptor, ReportEntry)
	 */
	REPORTING_ENTRY_PUBLISHED;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncher.java`
#### Snippet
```java
	private final LauncherListenerRegistry listenerRegistry = new LauncherListenerRegistry();
	private final EngineExecutionOrchestrator executionOrchestrator = new EngineExecutionOrchestrator(
		listenerRegistry.testExecutionListeners);;
	private final EngineDiscoveryOrchestrator discoveryOrchestrator;

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getActualTypeArguments` may produce `NullPointerException`
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/support/TypeBasedParameterResolver.java`
#### Snippet
```java
						+ "potentially caused by lacking parameterized type in class declaration.",
				getClass().getName()));
		return typeBasedParameterResolverSuperclass.getActualTypeArguments()[0];
	}

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
The call to 'assumeFalse' always fails, according to its method contracts
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithFiveTestMethods.java`
#### Snippet
```java
	@Test
	public void abortedTest() {
		assumeFalse("this test should be aborted", true);
	}

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'Alphanumeric' is still used
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrderer.java`
#### Snippet
```java
	@API(status = DEPRECATED, since = "5.7")
	@Deprecated
	class Alphanumeric extends MethodName {

		public Alphanumeric() {
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'SingleTestExecutor' is still used
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SingleTestExecutor.java`
#### Snippet
```java
@API(status = DEPRECATED, since = "1.2")
@SuppressWarnings("missing-explicit-ctor")
public class SingleTestExecutor {

	/**
```

### DeprecatedIsStillUsed
Deprecated member 'JUnitPlatform' is still used
in `junit-platform-runner/src/main/java/org/junit/platform/runner/JUnitPlatform.java`
#### Snippet
```java
@API(status = DEPRECATED, since = "1.8")
@Deprecated
public class JUnitPlatform extends Runner implements Filterable {

	// @formatter:off
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'LegacyReportingUtils' is still used
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LegacyReportingUtils.java`
#### Snippet
```java
@SuppressWarnings("JavadocReference")
@API(status = DEPRECATED, since = "1.6")
public class LegacyReportingUtils {

	private LegacyReportingUtils() {
```

### DeprecatedIsStillUsed
Deprecated member 'UseTechnicalNames' is still used
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/UseTechnicalNames.java`
#### Snippet
```java
@API(status = DEPRECATED, since = "1.8")
@Deprecated
public @interface UseTechnicalNames {
}

```

## RuleId[id=HasPlatformType]
### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
}

val junit_4_12 by configurations.creatingResolvable {
	extendsFrom(configurations.testRuntimeClasspath.get())
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `gradle/plugins/common/src/main/kotlin/junitbuild.osgi-conventions.gradle.kts`
#### Snippet
```java
}

val osgiVerification by configurations.creatingResolvable {
	extendsFrom(configurations.runtimeClasspath.get())
}
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `gradle/plugins/settings.gradle.kts`
#### Snippet
```java
val expectedJavaVersion = JavaVersion.VERSION_17
val actualJavaVersion = JavaVersion.current()
require(actualJavaVersion == expectedJavaVersion) {
	"The JUnit 5 build must be executed with Java ${expectedJavaVersion.majorVersion}. Currently executing with Java ${actualJavaVersion.majorVersion}."
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
import java.time.format.DateTimeFormatter

val buildTimeAndDate =
	if (System.getenv().containsKey("SOURCE_DATE_EPOCH")) {

```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `gradle/plugins/common/src/main/kotlin/junitbuild.shadow-conventions.gradle.kts`
#### Snippet
```java
}

val shadowed by configurations.creatingResolvable

configurations {
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `documentation/documentation.gradle.kts`
#### Snippet
```java
}

val apiReport by configurations.creatingResolvable
val standaloneConsoleLauncher by configurations.creatingResolvable

```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `documentation/documentation.gradle.kts`
#### Snippet
```java

val apiReport by configurations.creatingResolvable
val standaloneConsoleLauncher by configurations.creatingResolvable

dependencies {
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `documentation/documentation.gradle.kts`
#### Snippet
```java

val snapshot = rootProject.version.toString().contains("SNAPSHOT")
val docsVersion = if (snapshot) "snapshot" else rootProject.version
val releaseBranch = if (snapshot) "HEAD" else "r${rootProject.version}"
val docsDir = file("$buildDir/ghpages-docs")
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `junit-platform-console-standalone/junit-platform-console-standalone.gradle.kts`
#### Snippet
```java
}

val jupiterVersion = rootProject.version
val vintageVersion: String by project

```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
}

val thirdPartyJars by configurations.creatingResolvable
val antJars by configurations.creatingResolvable
val mavenDistribution by configurations.creatingResolvable
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java

val thirdPartyJars by configurations.creatingResolvable
val antJars by configurations.creatingResolvable
val mavenDistribution by configurations.creatingResolvable

```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
val thirdPartyJars by configurations.creatingResolvable
val antJars by configurations.creatingResolvable
val mavenDistribution by configurations.creatingResolvable

dependencies {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	// ?> => non-capturing atomic group
	// ++ => possessive quantifier
	private static final Pattern SOURCE_CODE_SYNTAX_ARRAY_PATTERN = Pattern.compile("^([^\\[\\]]+)((?>\\[\\])++)$");

	private static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
```

## RuleId[id=ConvertArgumentToSet]
### ConvertArgumentToSet
The argument can be converted to 'Set' to improve performance
in `build.gradle.kts`
#### Snippet
```java

val mavenizedProjects by extra(platformProjects + jupiterProjects + vintageProjects)
val modularProjects by extra(mavenizedProjects - listOf(projects.junitPlatformConsoleStandalone.dependencyProject))

dependencies {
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/ReportEntry.java`
#### Snippet
```java
	 * @return when this entry was created; never {@code null}
	 */
	public final LocalDateTime getTimestamp() {
		return this.timestamp;
	}
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/ReportEntry.java`
#### Snippet
```java
	 * @return a copy of the map of key-value pairs; never {@code null}
	 */
	public final Map<String, String> getKeyValuePairs() {
		return Collections.unmodifiableMap(this.keyValuePairs);
	}
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertAll.java`
#### Snippet
```java
		Preconditions.notNull(executables, "executables stream must not be null");

		List<Throwable> failures = executables //
				.map(executable -> {
					Preconditions.notNull(executable, "individual executables must not be null");
					try {
						executable.execute();
						return null;
					}
					catch (Throwable t) {
						UnrecoverableExceptions.rethrowIfUnrecoverable(t);
						return t;
					}
				}) //
				.filter(Objects::nonNull) //
				.collect(Collectors.toList());

		if (!failures.isEmpty()) {
			MultipleFailuresError multipleFailuresError = new MultipleFailuresError(heading, failures);
			failures.forEach(multipleFailuresError::addSuppressed);
			throw multipleFailuresError;
		}
```

### DuplicatedCode
Duplicated code
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
#### Snippet
```java
		if (expected == actual) {
			return;
		}
		assertArraysNotNull(expected, actual, indexes, messageOrSupplier);
		assertArraysHaveSameLength(expected.length, actual.length, indexes, messageOrSupplier);

		for (int i = 0; i < expected.length; i++) {
			if (expected[i] != actual[i]) {
				failArraysNotEqual(expected[i], actual[i], nullSafeIndexes(indexes, i), messageOrSupplier);
			}
		}
```

### DuplicatedCode
Duplicated code
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassOrderer.java`
#### Snippet
```java
			return context.getConfigurationParameter(RANDOM_SEED_PROPERTY_NAME).map(configurationParameter -> {
				Long seed = null;
				try {
					seed = Long.valueOf(configurationParameter);
					logger.config(
						() -> String.format("Using custom seed for configuration parameter [%s] with value [%s].",
							RANDOM_SEED_PROPERTY_NAME, configurationParameter));
				}
				catch (NumberFormatException ex) {
					logger.warn(ex,
						() -> String.format(
							"Failed to convert configuration parameter [%s] with value [%s] to a long. "
									+ "Using default seed [%s] as fallback.",
							RANDOM_SEED_PROPERTY_NAME, configurationParameter, DEFAULT_SEED));
				}
				return seed;
			});
```

### DuplicatedCode
Duplicated code
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsPotentialTestContainer.java`
#### Snippet
```java
		if (isPrivate(candidate)) {
			return false;
		}
		if (isAbstract(candidate)) {
			return false;
		}
		if (candidate.isLocalClass()) {
			return false;
		}
		if (candidate.isAnonymousClass()) {
			return false;
		}
		return !isInnerClass(candidate);
```

### DuplicatedCode
Duplicated code
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		if (traversalMode == TOP_DOWN) {
			fields.addAll(superclassFields);
			fields.addAll(interfaceFields);
		}
		fields.addAll(localFields);
		if (traversalMode == BOTTOM_UP) {
			fields.addAll(interfaceFields);
			fields.addAll(superclassFields);
		}
		return fields;
```

### DuplicatedCode
Duplicated code
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassSelector.java`
#### Snippet
```java
		if (this.javaClass == null) {
			// @formatter:off
			Try<Class<?>> tryToLoadClass = this.classLoader == null
				? ReflectionUtils.tryToLoadClass(this.className)
				: ReflectionUtils.tryToLoadClass(this.className, this.classLoader);
			this.javaClass = tryToLoadClass.getOrThrow(cause ->
				new PreconditionViolationException("Could not load class with name: " + this.className, cause));
			// @formatter:on
		}
```

### DuplicatedCode
Duplicated code
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FilePosition.java`
#### Snippet
```java
		FilePosition result = null;
		Integer line = null;
		Integer column = null;
		if (StringUtils.isNotBlank(query)) {
			try {
				for (String pair : query.split("&")) {
					String[] data = pair.split("=");
					if (data.length == 2) {
						String key = data[0];
						if (line == null && "line".equals(key)) {
							line = Integer.valueOf(data[1]);
						}
						else if (column == null && "column".equals(key)) {
							column = Integer.valueOf(data[1]);
						}
					}

					// Already found what we're looking for?
					if (line != null && column != null) {
						break;
					}
				}
			}
			catch (IllegalArgumentException ex) {
				logger.debug(ex, () -> "Failed to parse 'line' and/or 'column' from query string: " + query);
				// fall-through and continue
			}

			if (line != null) {
				result = column == null ? new FilePosition(line) : new FilePosition(line, column);
			}
		}
		return Optional.ofNullable(result);
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `resources` may contain URL objects
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
#### Snippet
```java
		try {
			ClassLoader classLoader = ClassLoaderUtils.getDefaultClassLoader();
			Set<URL> resources = new LinkedHashSet<>(Collections.list(classLoader.getResources(configFileName)));

			if (!resources.isEmpty()) {
```

## RuleId[id=Deprecation]
### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludePackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#excludePackageNames(String...)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeClassNamePatterns.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN
 * @see org.junit.platform.engine.discovery.ClassNameFilter#includeClassNamePatterns
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeClassNamePatterns.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.ClassNameFilter#excludeClassNamePatterns
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeEngines.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#includeEngines
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClasspathResource(String, org.junit.platform.engine.discovery.FilePosition)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectModules(Set)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludePackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.PackageNameFilter#includePackageNames(String...)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectPackages.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectPackage(String)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
#### Snippet
```java
 * @see DisableParentConfigurationParameters
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder#configurationParameter(String, String)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SuiteDisplayName.java`
#### Snippet
```java
 * @since 1.1
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 */
@Retention(RUNTIME)
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/IncludeTags.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#includeTags
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
#### Snippet
```java
 * @since 1.10
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectMethod(String, String, String)
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectFile(String, org.junit.platform.engine.discovery.FilePosition)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasses.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(Class)
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectClass(String)
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeTags.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.TagFilter#excludeTags
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ExcludeEngines.java`
#### Snippet
```java
 * @since 1.0
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.launcher.EngineFilter#excludeEngines
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectUri(String)
 */
```

### Deprecation
'org.junit.platform.runner.JUnitPlatform' is deprecated
in `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
#### Snippet
```java
 * @since 1.8
 * @see Suite
 * @see org.junit.platform.runner.JUnitPlatform
 * @see org.junit.platform.engine.discovery.DiscoverySelectors#selectDirectory(String)
 */
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `junit-platform-engine/src/main/java/org/junit/platform/engine/TestDescriptor.java`
#### Snippet
```java
	default Set<? extends TestDescriptor> getDescendants() {
		Set<TestDescriptor> descendants = new LinkedHashSet<>();
		descendants.addAll(getChildren());
		for (TestDescriptor child : getChildren()) {
			descendants.addAll(child.getDescendants());
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvArgumentsProvider.java`
#### Snippet
```java
		for (int i = 0; i < csvRecord.length; i++) {
			Object column = csvRecord[i];
			if (nullValues.contains(column)) {
				column = null;
			}
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
#### Snippet
```java
		private static final AtomicInteger threadNumber = new AtomicInteger(1);

		public Thread newThread(Runnable r) {
			return new Thread(r, "junit-timeout-thread-" + threadNumber.getAndIncrement());
		}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptor.java`
#### Snippet
```java

	@Override
	public void write(byte[] buf, int off, int len) {
		RewindableByteArrayOutputStream out = output.get();
		if (out.isMarked()) {
```

## RuleId[id=LeakingThis]
### LeakingThis
Accessing non-final property module in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/java/PatchModuleArgumentProvider.kt`
#### Snippet
```java

    init {
        module.convention(patchModuleProject.javaModuleName)
        patch.from(compiledProject.provider {
            if (patchModuleProject == compiledProject)
```

### LeakingThis
Accessing non-final property patch in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/java/PatchModuleArgumentProvider.kt`
#### Snippet
```java
    init {
        module.convention(patchModuleProject.javaModuleName)
        patch.from(compiledProject.provider {
            if (patchModuleProject == compiledProject)
                compiledProject.files(compiledProject.the<SourceSetContainer>().matching { it.name.startsWith("main") }
```

### LeakingThis
Accessing non-final property runtimeClasspath in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java

    init {
        runtimeClasspath.from(project.the<SourceSetContainer>()["test"].runtimeClasspath)
        javaLauncher.set(project.the<JavaToolchainService>().launcherFor(project.the<JavaPluginExtension>().toolchain))

```

### LeakingThis
Accessing non-final property javaLauncher in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java
    init {
        runtimeClasspath.from(project.the<SourceSetContainer>()["test"].runtimeClasspath)
        javaLauncher.set(project.the<JavaToolchainService>().launcherFor(project.the<JavaPluginExtension>().toolchain))

        debugging.convention(false)
```

### LeakingThis
Accessing non-final property debugging in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java
        javaLauncher.set(project.the<JavaToolchainService>().launcherFor(project.the<JavaPluginExtension>().toolchain))

        debugging.convention(false)
        commandLineArgs.convention(emptyList())
        outputs.cacheIf { !debugging.get() }
```

### LeakingThis
Accessing non-final property commandLineArgs in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java

        debugging.convention(false)
        commandLineArgs.convention(emptyList())
        outputs.cacheIf { !debugging.get() }
        outputs.upToDateWhen { !debugging.get() }
```

### LeakingThis
Accessing non-final property hideOutput in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java
        outputs.upToDateWhen { !debugging.get() }

        hideOutput.convention(debugging.map { !it })

        trackOperationSystemAsInput()
```

### LeakingThis
Accessing non-final property debugging in constructor
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java
        outputs.upToDateWhen { !debugging.get() }

        hideOutput.convention(debugging.map { !it })

        trackOperationSystemAsInput()
```

## RuleId[id=ReplaceCallWithBinaryOperator]
### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `junit-jupiter-params/src/test/kotlin/ParameterizedTestNameFormatterIntegrationTests.kt`
#### Snippet
```java
    @ParameterizedTest(name = "{displayName} - {0}")
    fun `displayName and 1st 'argument'`(param: String, info: TestInfo) {
        if (param.equals("foo")) {
            assertEquals("displayName and 1st 'argument'(String, TestInfo) - foo", info.displayName)
        } else {
```

### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `junit-jupiter-params/src/test/kotlin/ParameterizedTestNameFormatterIntegrationTests.kt`
#### Snippet
```java
    @ParameterizedTest(name = "{0}")
    fun `1st argument`(param: String, info: TestInfo) {
        if (param.equals("foo")) {
            assertEquals("foo", info.displayName)
        } else {
```

### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `junit-jupiter-params/src/test/kotlin/ParameterizedTestNameFormatterIntegrationTests.kt`
#### Snippet
```java
    @ParameterizedTest(name = "{0} - {displayName}")
    fun `1st 'argument' and displayName`(param: String, info: TestInfo) {
        if (param.equals("foo")) {
            assertEquals("foo - 1st 'argument' and displayName(String, TestInfo)", info.displayName)
        } else {
```

### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `junit-jupiter-params/src/test/kotlin/ParameterizedTestNameFormatterIntegrationTests.kt`
#### Snippet
```java
    @ParameterizedTest
    fun defaultDisplayName(param: String, info: TestInfo) {
        if (param.equals("foo")) {
            assertEquals("[1] foo", info.displayName)
        } else {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SameThreadTimeoutInvocation.java`
#### Snippet
```java
			}
			if (interruptTask.executed) {
				Thread.interrupted();
				failure = TimeoutExceptionFactory.create(descriptionSupplier.get(), timeout, failure);
			}
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `documentation/src/main/java/example/domain/Person.java`
#### Snippet
```java
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `documentation/src/main/java/example/domain/Person.java`
#### Snippet
```java
			}
		}
		else if (!lastName.equals(other.lastName)) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsInnerClass.java`
#### Snippet
```java
			return false;
		}
		if (!isInnerClass(candidate)) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/IsPotentialJUnit4TestClass.java`
#### Snippet
```java
			return false;
		}
		if (isInnerClass(candidate)) {
			return false;
		}
```

### TrivialIf
`if` statement can be simplified
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
		}
		// lower is sub-signature of upper: check for generics in upper method
		if (isGeneric(candidate)) {
			return true;
		}
```

## RuleId[id=NestedLambdaShadowedImplicitParameter]
### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `gradle/plugins/common/src/main/kotlin/junitbuild/java/WriteArtifactsFile.kt`
#### Snippet
```java
    fun from(configuration: Provider<Configuration>) {
        moduleVersions.addAll(configuration.map {
            it.resolvedConfiguration.resolvedArtifacts.map { it.moduleVersion.id }
        })
    }
```

### NestedLambdaShadowedImplicitParameter
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

### NestedLambdaShadowedImplicitParameter
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

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
		}

		source(modularProjects.map { files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava }) })
		classpath = files(modularProjects.map { it.sourceSets.main.get().compileClasspath })

```

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `documentation/documentation.gradle.kts`
#### Snippet
```java
		}

		source(modularProjects.map { files(it.sourceSets.matching { it.name.startsWith("main") }.map { it.allJava }) })
		classpath = files(modularProjects.map { it.sourceSets.main.get().compileClasspath })

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reason'
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ConditionEvaluationResult.java`
#### Snippet
```java
	private final boolean enabled;

	private final Optional<String> reason;

	private ConditionEvaluationResult(boolean enabled, String reason) {
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
#### Snippet
```java
	 * interceptors}
	 */
	public <T> T invoke(Constructor<T> constructor, Optional<Object> outerInstance, ExtensionContext extensionContext,
			ExtensionRegistry extensionRegistry, ReflectiveInterceptorCall<Constructor<T>, T> interceptorCall) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 * invocation; never {@code null} though potentially empty
	 */
	public static Object[] resolveParameters(Executable executable, Optional<Object> target,
			Optional<Object> outerInstance, ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 */
	public static Object[] resolveParameters(Executable executable, Optional<Object> target,
			Optional<Object> outerInstance, ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) {

		Preconditions.notNull(target, "target must not be null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
#### Snippet
```java
	 * invocation; never {@code null} though potentially empty
	 */
	public static Object[] resolveParameters(Method method, Optional<Object> target, ExtensionContext extensionContext,
			ExtensionRegistry extensionRegistry) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
#### Snippet
```java
	private final Parameter parameter;
	private final int index;
	private final Optional<Object> target;

	DefaultParameterContext(Parameter parameter, int index, Optional<Object> target) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
#### Snippet
```java
	private final Optional<Object> target;

	DefaultParameterContext(Parameter parameter, int index, Optional<Object> target) {
		Preconditions.condition(index >= 0, "index must be greater than or equal to zero");
		this.parameter = Preconditions.notNull(parameter, "parameter must not be null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
#### Snippet
```java

	private final Method method;
	private final Optional<Object> target;
	private final Object[] arguments;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
#### Snippet
```java
	private final Object[] arguments;

	MethodInvocation(Method method, Optional<Object> target, Object[] arguments) {
		this.method = method;
		this.target = target;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'testDescriptor'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
#### Snippet
```java
	}

	private Resolution toResolution(Optional<? extends ClassBasedTestDescriptor> testDescriptor) {
		return testDescriptor.map(it -> {
			Class<?> testClass = it.getTestClass();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'testMethod'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		private final Set<String> tags;
		private final Optional<Class<?>> testClass;
		private final Optional<Method> testMethod;

		DefaultTestInfo(ExtensionContext extensionContext) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		}

		private static Object nullSafeGet(Optional<?> optional) {
			return optional != null ? optional.orElse(null) : null;
		}
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'testClass'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java
		private final String displayName;
		private final Set<String> tags;
		private final Optional<Class<?>> testClass;
		private final Optional<Method> testMethod;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
#### Snippet
```java
	private final Optional<Object> outerInstance;

	DefaultTestInstanceFactoryContext(Class<?> testClass, Optional<Object> outerInstance) {
		this.testClass = testClass;
		this.outerInstance = outerInstance;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
#### Snippet
```java

	private final Class<?> testClass;
	private final Optional<Object> outerInstance;

	DefaultTestInstanceFactoryContext(Class<?> testClass, Optional<Object> outerInstance) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstances'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
			ThrowableCollector throwableCollector);

	protected TestInstances instantiateTestClass(Optional<TestInstances> outerInstances, ExtensionRegistry registry,
			ExtensionContext extensionContext) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
	}

	private Object invokeTestInstanceFactory(Optional<Object> outerInstance, ExtensionContext extensionContext) {
		Object instance;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'outerInstance'
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
#### Snippet
```java
	}

	private Object invokeTestClassConstructor(Optional<Object> outerInstance, ExtensionRegistry registry,
			ExtensionContext extensionContext) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'identifiedTestDescriptor'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
#### Snippet
```java

	private Deque<Description> determinePath(RunnerTestDescriptor runnerTestDescriptor,
			Optional<? extends TestDescriptor> identifiedTestDescriptor) {
		Deque<Description> path = new ArrayDeque<>();
		Optional<? extends TestDescriptor> current = identifiedTestDescriptor;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'identifiedTestDescriptor'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
#### Snippet
```java
	}

	private Set<Description> determineDescendants(Optional<? extends TestDescriptor> identifiedTestDescriptor) {
		// @formatter:off
		return identifiedTestDescriptor.map(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
#### Snippet
```java
	}

	private void fireExecutionStartedIncludingUnstartedAncestors(Optional<TestDescriptor> parent) {
		if (parent.isPresent() && canStart(parent.get())) {
			fireExecutionStartedIncludingUnstartedAncestors(parent.get().getParent());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reason'
in `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
#### Snippet
```java
	private final boolean included;

	private final Optional<String> reason;

	private FilterResult(boolean included, String reason) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'reason'
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
#### Snippet
```java

		private final boolean skipped;
		private final Optional<String> reason;

		/**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#isAnnotated(Optional, Class)
	 */
	public static boolean isAnnotated(Optional<? extends AnnotatedElement> element,
			Class<? extends Annotation> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#findAnnotation(Optional, Class)
	 */
	public static <A extends Annotation> Optional<A> findAnnotation(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
	 * @see org.junit.platform.commons.support.AnnotationSupport#findRepeatableAnnotations(Optional, Class)
	 */
	public static <A extends Annotation> List<A> findRepeatableAnnotations(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.1")
	public static <A extends Annotation> Optional<A> findAnnotation(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.5")
	public static <A extends Annotation> List<A> findRepeatableAnnotations(Optional<? extends AnnotatedElement> element,
			Class<A> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'element'
in `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
#### Snippet
```java
	 */
	@API(status = MAINTAINED, since = "1.3")
	public static boolean isAnnotated(Optional<? extends AnnotatedElement> element,
			Class<? extends Annotation> annotationType) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customClassLoader'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/CustomContextClassLoaderExecutor.java`
#### Snippet
```java
	private final Optional<ClassLoader> customClassLoader;

	CustomContextClassLoaderExecutor(Optional<ClassLoader> customClassLoader) {
		this.customClassLoader = customClassLoader;
	}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'customClassLoader'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/CustomContextClassLoaderExecutor.java`
#### Snippet
```java
class CustomContextClassLoaderExecutor {

	private final Optional<ClassLoader> customClassLoader;

	CustomContextClassLoaderExecutor(Optional<ClassLoader> customClassLoader) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reportsDir'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java
	}

	private Optional<TestExecutionListener> createXmlWritingListener(PrintWriter out, Optional<Path> reportsDir) {
		return reportsDir.map(it -> new LegacyXmlReportGeneratingListener(it, out));
	}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reportsDir'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java
	}

	private SummaryGeneratingListener registerListeners(PrintWriter out, Optional<Path> reportsDir, Launcher launcher) {
		// always register summary generating listener
		SummaryGeneratingListener summaryListener = new SummaryGeneratingListener();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reportsDir'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java
	}

	private TestExecutionSummary executeTests(PrintWriter out, Optional<Path> reportsDir) {
		Launcher launcher = launcherSupplier.get();
		SummaryGeneratingListener summaryListener = registerListeners(out, reportsDir, launcher);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reportsDir'
in `junit-platform-console/src/main/java/org/junit/platform/console/tasks/ConsoleTestExecutor.java`
#### Snippet
```java
	}

	public TestExecutionSummary execute(PrintWriter out, Optional<Path> reportsDir) {
		return new CustomContextClassLoaderExecutor(createCustomClassLoader()) //
				.invoke(() -> executeTests(out, reportsDir));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'triggeringOption'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/MainCommand.java`
#### Snippet
```java
	}

	private static void printDeprecationWarning(String subcommand, Optional<String> triggeringOption,
			CommandLine commandLine) {
		PrintWriter err = commandLine.getErr();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stderrInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private final Optional<StreamInterceptor> stdoutInterceptor;
	private final Optional<StreamInterceptor> stderrInterceptor;
	private final BiConsumer<TestIdentifier, ReportEntry> reporter;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stdoutInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java
	}

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stderrInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java

	private StreamInterceptingTestExecutionListener(Optional<StreamInterceptor> stdoutInterceptor,
			Optional<StreamInterceptor> stderrInterceptor, BiConsumer<TestIdentifier, ReportEntry> reporter) {
		this.stdoutInterceptor = stdoutInterceptor;
		this.stderrInterceptor = stderrInterceptor;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stdoutInterceptor'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StreamInterceptingTestExecutionListener.java`
#### Snippet
```java
class StreamInterceptingTestExecutionListener implements EagerTestExecutionListener {

	private final Optional<StreamInterceptor> stdoutInterceptor;
	private final Optional<StreamInterceptor> stderrInterceptor;
	private final BiConsumer<TestIdentifier, ReportEntry> reporter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'reason'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
#### Snippet
```java
	}

	private void populateExclusionReasonInMap(Optional<String> reason, TestDescriptor testDescriptor,
			Map<String, List<TestDescriptor>> excludedTestDescriptorsByReason) {
		excludedTestDescriptorsByReason.computeIfAbsent(reason.orElse("Unknown"), list -> new LinkedList<>()).add(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'customDir'
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/OutputDir.java`
#### Snippet
```java
public class OutputDir {

	public static OutputDir create(Optional<String> customDir) {
		try {
			return createSafely(customDir, () -> Paths.get(".").toAbsolutePath());
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'suite'
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
#### Snippet
```java
	}

	private static Resolution toResolution(Optional<SuiteTestDescriptor> suite) {
		return suite.map(Match::exact).map(Resolution::match).orElseGet(Resolution::unresolved);
	}
```

## RuleId[id=PropertyName]
### PropertyName
Property name `junit_4_12` should not contain underscores
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
}

val junit_4_12 by configurations.creatingResolvable {
	extendsFrom(configurations.testRuntimeClasspath.get())
}
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getType()` is identical to its super method
in `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteEngineDescriptor.java`
#### Snippet
```java

	@Override
	public Type getType() {
		return Type.CONTAINER;
	}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
		public InputStream openClasspathResource(Class<?> baseClass, String path) {
			Preconditions.notBlank(path, () -> "Classpath resource [" + path + "] must not be null or blank");
			InputStream inputStream = baseClass.getResourceAsStream(path);
			return Preconditions.notNull(inputStream, () -> "Classpath resource [" + path + "] does not exist");
		}
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/OutputDir.java`
#### Snippet
```java
	 */
	private static boolean containsFilesWithExtensions(Path dir, String... extensions) throws IOException {
		return Files.find(dir, 1, //
			(path, basicFileAttributes) -> {
				if (basicFileAttributes.isRegularFile()) {
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `platform-tooling-support-tests/src/main/java/platform/tooling/support/Helper.java`
#### Snippet
```java
	public static List<String> loadModuleDirectoryNames() {
		var moduleLinePattern = Pattern.compile("include\\(\"(.+)\"\\)");
		try (var stream = Files.lines(SETTINGS_GRADLE) //
				.map(moduleLinePattern::matcher) //
				.filter(Matcher::matches) //
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
#### Snippet
```java

		private static Object nullSafeGet(Optional<?> optional) {
			return optional != null ? optional.orElse(null) : null;
		}

```

### OptionalAssignedToNull
Optional value is compared with null
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
#### Snippet
```java

	Optional<ThreadMode> getDefaultTimeoutThreadMode() {
		if (threadMode.get() != null) {
			return threadMode.get();
		}
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Test class `JUnit3ParallelSuiteWithSubsuites` is not constructable because it does not have a 'public' no-arg or single 'String' parameter constructor
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/JUnit3ParallelSuiteWithSubsuites.java`
#### Snippet
```java
import junit.framework.TestSuite;

public class JUnit3ParallelSuiteWithSubsuites extends TestCase {
	private final String arg;

```

### JUnitMalformedDeclaration
Test class `JUnit3SuiteWithSubsuites` is not constructable because it does not have a 'public' no-arg or single 'String' parameter constructor
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/JUnit3SuiteWithSubsuites.java`
#### Snippet
```java
import junit.framework.TestSuite;

public class JUnit3SuiteWithSubsuites extends TestCase {
	private final String arg;

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	@API(status = STABLE, since = "1.6")
	public static NestedClassSelector selectNestedClass(List<String> enclosingClassNames, String nestedClassName) {
		return selectNestedClass((ClassLoader) null, enclosingClassNames, nestedClassName);
	}

```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	 */
	public static MethodSelector selectMethod(String className, String methodName, String parameterTypeNames) {
		return selectMethod((ClassLoader) null, className, methodName, parameterTypeNames);
	}

```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
		Preconditions.notNull(parameterTypes, "Parameter types array must not be null");
		Preconditions.containsNoNullElements(parameterTypes, "Parameter types array must not contain null elements");
		return new NestedMethodSelector((ClassLoader) null, enclosingClassNames, nestedClassName, methodName,
			parameterTypes);
	}
```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	public static NestedMethodSelector selectNestedMethod(List<String> enclosingClassNames, String nestedClassName,
			String methodName, String parameterTypeNames) {
		return selectNestedMethod((ClassLoader) null, enclosingClassNames, nestedClassName, methodName,
			parameterTypeNames);
	}
```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
		Preconditions.notNull(parameterTypes, "Parameter types array must not be null");
		Preconditions.containsNoNullElements(parameterTypes, "Parameter types array must not contain null elements");
		return new MethodSelector((ClassLoader) null, className, methodName, parameterTypes);
	}

```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	public static NestedMethodSelector selectNestedMethod(List<String> enclosingClassNames, String nestedClassName,
			String methodName) {
		return selectNestedMethod((ClassLoader) null, enclosingClassNames, nestedClassName, methodName);
	}

```

### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
#### Snippet
```java
	 */
	public static ClassSelector selectClass(String className) {
		return selectClass((ClassLoader) null, className);
	}

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineExecutionListener.java`
#### Snippet
```java
	 *
	 * <p>This method must be called for a container {@code TestDescriptor}
	 * <em>before</em> {@linkplain #executionStarted starting} or
	 * {@linkplain #executionSkipped skipping} any of its children.
	 *
```

### JavadocDeclaration
Javadoc pointing to itself
in `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineExecutionListener.java`
#### Snippet
```java
	 * <em>after</em> all of its children have been
	 * {@linkplain #executionSkipped skipped} or have
	 * {@linkplain #executionFinished finished}.
	 *
	 * <p>The {@link TestExecutionResult} describes the result of the execution
```

### JavadocDeclaration
Javadoc pointing to itself
in `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassNameFilter.java`
#### Snippet
```java
	 * Standard include pattern in the form of a regular expression that is
	 * used to match against fully qualified class names:
	 * {@value org.junit.platform.engine.discovery.ClassNameFilter#STANDARD_INCLUDE_PATTERN}
	 *
	 * <p>This pattern matches against class names beginning with {@code Test}
```

### JavadocDeclaration
Javadoc pointing to itself
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestExecutionListener.java`
#### Snippet
```java
	 * <em>after</em> all of its children have been
	 * {@linkplain #executionSkipped skipped} or have
	 * {@linkplain #executionFinished finished}.
	 *
	 * <p>The {@link TestExecutionResult} describes the result of the execution
```

### JavadocDeclaration
Javadoc pointing to itself
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestExecutionListener.java`
#### Snippet
```java
	 *
	 * <p>This method will be called for a container {@code TestIdentifier}
	 * <em>before</em> {@linkplain #executionStarted starting} or
	 * {@linkplain #executionSkipped skipping} any of its children.
	 *
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `firstName` may be 'final'
in `documentation/src/main/java/example/domain/Person.java`
#### Snippet
```java
	}

	private String firstName;
	private String lastName;
	private Gender gender;
```

### FieldMayBeFinal
Field `lastName` may be 'final'
in `documentation/src/main/java/example/domain/Person.java`
#### Snippet
```java

	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate dateOfBirth;
```

### FieldMayBeFinal
Field `theme2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
#### Snippet
```java

		@Option(names = "-details-theme", hidden = true)
		private Theme theme2 = DEFAULT_THEME;

		private void applyTo(TestConsoleOutputOptions result) {
```

### FieldMayBeFinal
Field `details2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
#### Snippet
```java

		@Option(names = "-details", hidden = true, defaultValue = DEFAULT_DETAILS_NAME)
		private Details details2 = DEFAULT_DETAILS;

		@Option(names = "--details-theme", paramLabel = "THEME", description = "Select an output details tree theme for when tests are executed. "
```

### FieldMayBeFinal
Field `theme` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
#### Snippet
```java
		@Option(names = "--details-theme", paramLabel = "THEME", description = "Select an output details tree theme for when tests are executed. "
				+ "Use one of: ${COMPLETION-CANDIDATES}. Default is detected based on default character encoding.")
		private Theme theme = DEFAULT_THEME;

		@Option(names = "-details-theme", hidden = true)
```

### FieldMayBeFinal
Field `details` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
#### Snippet
```java
				+ "Use one of: ${COMPLETION-CANDIDATES}. If 'none' is selected, " //
				+ "then only the summary and test failures are shown. Default: ${DEFAULT-VALUE}.")
		private Details details = DEFAULT_DETAILS;

		@Option(names = "-details", hidden = true, defaultValue = DEFAULT_DETAILS_NAME)
```

### FieldMayBeFinal
Field `allParameters` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/MainCommand.java`
#### Snippet
```java

	@Unmatched
	private List<String> allParameters = new ArrayList<>();

	@Spec
```

### FieldMayBeFinal
Field `includeClassNamePatterns2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--n", "-include-classname" }, arity = "1", hidden = true)
		private List<String> includeClassNamePatterns2 = new ArrayList<>();

		@Option(names = { "-N",
```

### FieldMayBeFinal
Field `selectedMethods2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--m",
				"-select-method" }, arity = "1", hidden = true, converter = SelectorConverter.Method.class)
		private List<MethodSelector> selectedMethods2 = new ArrayList<>();

		@Option(names = { "-r",
```

### FieldMayBeFinal
Field `selectedClasses2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--c",
				"-select-class" }, arity = "1", hidden = true, converter = SelectorConverter.Class.class)
		private List<ClassSelector> selectedClasses2 = new ArrayList<>();

		@Option(names = { "-m",
```

### FieldMayBeFinal
Field `excludedTags2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--T", "-exclude-tag" }, arity = "1", hidden = true)
		private List<String> excludedTags2 = new ArrayList<>();

		@Option(names = { "-e",
```

### FieldMayBeFinal
Field `includePackages` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = {
				"--include-package" }, paramLabel = "PKG", arity = "1", description = "Provide a package to be included in the test run. This option can be repeated.")
		private List<String> includePackages = new ArrayList<>();

		@Option(names = { "-include-package" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `configurationParameters` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		// Implementation note: the @Option annotation is on a setter method to allow validation.
		private Map<String, String> configurationParameters = new LinkedHashMap<>();

		@CommandLine.Spec
```

### FieldMayBeFinal
Field `additionalClasspathEntries` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
				"--class-path" }, converter = ClasspathEntriesConverter.class, paramLabel = "PATH", arity = "1", description = "Provide additional classpath entries "
						+ "-- for example, for adding engines and their dependencies. This option can be repeated.")
		private List<Path> additionalClasspathEntries = new ArrayList<>();

		@Option(names = { "--cp", "-classpath",
```

### FieldMayBeFinal
Field `selectedModules` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-o",
				"--select-module" }, paramLabel = "NAME", arity = "1", converter = SelectorConverter.Module.class, description = "Select single module for test discovery. This option can be repeated.")
		private List<ModuleSelector> selectedModules = new ArrayList<>();

		@Option(names = { "--o",
```

### FieldMayBeFinal
Field `excludedEngines2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--E", "-exclude-engine" }, arity = "1", hidden = true)
		private List<String> excludedEngines2 = new ArrayList<>();

		private void applyTo(TestDiscoveryOptions result) {
```

### FieldMayBeFinal
Field `excludePackages` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = {
				"--exclude-package" }, paramLabel = "PKG", arity = "1", description = "Provide a package to be excluded from the test run. This option can be repeated.")
		private List<String> excludePackages = new ArrayList<>();

		@Option(names = { "-exclude-package" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `selectedPackages2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--p",
				"-select-package" }, arity = "1", hidden = true, converter = SelectorConverter.Package.class)
		private List<PackageSelector> selectedPackages2 = new ArrayList<>();

		@Option(names = { "-c",
```

### FieldMayBeFinal
Field `additionalClasspathEntries2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--cp", "-classpath",
				"-class-path" }, converter = ClasspathEntriesConverter.class, hidden = true)
		private List<Path> additionalClasspathEntries2 = new ArrayList<>();

		// Implementation note: the @Option annotation is on a setter method to allow validation.
```

### FieldMayBeFinal
Field `selectedModules2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--o",
				"-select-module" }, arity = "1", converter = SelectorConverter.Module.class, hidden = true)
		private List<ModuleSelector> selectedModules2 = new ArrayList<>();

		@Option(names = { "-p",
```

### FieldMayBeFinal
Field `includedTags2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--t", "-include-tag" }, arity = "1", hidden = true)
		private List<String> includedTags2 = new ArrayList<>();

		@Option(names = { "-T",
```

### FieldMayBeFinal
Field `excludePackages2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "-exclude-package" }, arity = "1", hidden = true)
		private List<String> excludePackages2 = new ArrayList<>();

		@Option(names = { "-t",
```

### FieldMayBeFinal
Field `excludedEngines` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-E",
				"--exclude-engine" }, paramLabel = "ID", arity = "1", description = "Provide the ID of an engine to be excluded from the test run. This option can be repeated.")
		private List<String> excludedEngines = new ArrayList<>();

		@Option(names = { "--E", "-exclude-engine" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `selectedClasspathResources2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--r",
				"-select-resource" }, arity = "1", hidden = true, converter = SelectorConverter.ClasspathResource.class)
		private List<ClasspathResourceSelector> selectedClasspathResources2 = new ArrayList<>();

		@Option(names = { "-i",
```

### FieldMayBeFinal
Field `selectedDirectories2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--d",
				"-select-directory" }, arity = "1", hidden = true, converter = SelectorConverter.Directory.class)
		private List<DirectorySelector> selectedDirectories2 = new ArrayList<>();

		@Option(names = { "-o",
```

### FieldMayBeFinal
Field `excludeClassNamePatterns2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--N", "-exclude-classname" }, arity = "1", hidden = true)
		private List<String> excludeClassNamePatterns2 = new ArrayList<>();

		@Option(names = {
```

### FieldMayBeFinal
Field `excludedTags` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
						+ //
						"When this option is repeated, all patterns will be combined using OR semantics.")
		private List<String> excludedTags = new ArrayList<>();

		@Option(names = { "--T", "-exclude-tag" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `includePackages2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "-include-package" }, arity = "1", hidden = true)
		private List<String> includePackages2 = new ArrayList<>();

		@Option(names = {
```

### FieldMayBeFinal
Field `selectedClasses` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-c",
				"--select-class" }, paramLabel = "CLASS", arity = "1", converter = SelectorConverter.Class.class, description = "Select a class for test discovery. This option can be repeated.")
		private List<ClassSelector> selectedClasses = new ArrayList<>();

		@Option(names = { "--c",
```

### FieldMayBeFinal
Field `selectedUris2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--u", "-select-uri" }, arity = "1", hidden = true, converter = SelectorConverter.Uri.class)
		private List<UriSelector> selectedUris2 = new ArrayList<>();

		@Option(names = { "-f",
```

### FieldMayBeFinal
Field `selectedFiles2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--f", "-select-file" }, arity = "1", hidden = true, converter = SelectorConverter.File.class)
		private List<FileSelector> selectedFiles2 = new ArrayList<>();

		@Option(names = { "-d",
```

### FieldMayBeFinal
Field `includedEngines` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-e",
				"--include-engine" }, paramLabel = "ID", arity = "1", description = "Provide the ID of an engine to be included in the test run. This option can be repeated.")
		private List<String> includedEngines = new ArrayList<>();

		@Option(names = { "--e", "-include-engine" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `includedTags` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
						+ //
						"When this option is repeated, all patterns will be combined using OR semantics.")
		private List<String> includedTags = new ArrayList<>();

		@Option(names = { "--t", "-include-tag" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `selectedFiles` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-f",
				"--select-file" }, paramLabel = "FILE", arity = "1", converter = SelectorConverter.File.class, description = "Select a file for test discovery. This option can be repeated.")
		private List<FileSelector> selectedFiles = new ArrayList<>();

		@Option(names = { "--f", "-select-file" }, arity = "1", hidden = true, converter = SelectorConverter.File.class)
```

### FieldMayBeFinal
Field `selectedMethods` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-m",
				"--select-method" }, paramLabel = "NAME", arity = "1", converter = SelectorConverter.Method.class, description = "Select a method for test discovery. This option can be repeated.")
		private List<MethodSelector> selectedMethods = new ArrayList<>();

		@Option(names = { "--m",
```

### FieldMayBeFinal
Field `includeClassNamePatterns` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
						+ "When this option is repeated, all patterns will be combined using OR semantics. " //
						+ "Default: ${DEFAULT-VALUE}")
		private List<String> includeClassNamePatterns = new ArrayList<>();

		@Option(names = { "--n", "-include-classname" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `excludeClassNamePatterns` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
				"--exclude-classname" }, paramLabel = "PATTERN", arity = "1", description = "Provide a regular expression to exclude those classes whose fully qualified names match. " //
						+ "When this option is repeated, all patterns will be combined using OR semantics.")
		private List<String> excludeClassNamePatterns = new ArrayList<>();

		@Option(names = { "--N", "-exclude-classname" }, arity = "1", hidden = true)
```

### FieldMayBeFinal
Field `selectedIterations2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "--i",
				"-select-iteration" }, arity = "1", hidden = true, converter = SelectorConverter.Iteration.class)
		private List<IterationSelector> selectedIterations2 = new ArrayList<>();

		SelectorOptions() {
```

### FieldMayBeFinal
Field `selectedIterations` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-i",
				"--select-iteration" }, paramLabel = "TYPE:VALUE[INDEX(..INDEX)?(,INDEX(..INDEX)?)*]", arity = "1", converter = SelectorConverter.Iteration.class, description = "Select iterations for test discovery (e.g. method:com.acme.Foo#m()[1..2]). This option can be repeated.")
		private List<IterationSelector> selectedIterations = new ArrayList<>();

		@Option(names = { "--i",
```

### FieldMayBeFinal
Field `includedEngines2` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java

		@Option(names = { "--e", "-include-engine" }, arity = "1", hidden = true)
		private List<String> includedEngines2 = new ArrayList<>();

		@Option(names = { "-E",
```

### FieldMayBeFinal
Field `selectedClasspathResources` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-r",
				"--select-resource" }, paramLabel = "RESOURCE", arity = "1", converter = SelectorConverter.ClasspathResource.class, description = "Select a classpath resource for test discovery. This option can be repeated.")
		private List<ClasspathResourceSelector> selectedClasspathResources = new ArrayList<>();

		@Option(names = { "--r",
```

### FieldMayBeFinal
Field `selectedDirectories` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-d",
				"--select-directory" }, paramLabel = "DIR", arity = "1", converter = SelectorConverter.Directory.class, description = "Select a directory for test discovery. This option can be repeated.")
		private List<DirectorySelector> selectedDirectories = new ArrayList<>();

		@Option(names = { "--d",
```

### FieldMayBeFinal
Field `selectedPackages` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-p",
				"--select-package" }, paramLabel = "PKG", arity = "1", converter = SelectorConverter.Package.class, description = "Select a package for test discovery. This option can be repeated.")
		private List<PackageSelector> selectedPackages = new ArrayList<>();

		@Option(names = { "--p",
```

### FieldMayBeFinal
Field `selectedUris` may be 'final'
in `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
#### Snippet
```java
		@Option(names = { "-u",
				"--select-uri" }, paramLabel = "URI", arity = "1", converter = SelectorConverter.Uri.class, description = "Select a URI for test discovery. This option can be repeated.")
		private List<UriSelector> selectedUris = new ArrayList<>();

		@Option(names = { "--u", "-select-uri" }, arity = "1", hidden = true, converter = SelectorConverter.Uri.class)
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `allParameters` are queried, but never updated
in `junit-platform-console/src/main/java/org/junit/platform/console/options/MainCommand.java`
#### Snippet
```java

	@Unmatched
	private List<String> allParameters = new ArrayList<>();

	@Spec
```

## RuleId[id=KotlinUnusedImport]
### KotlinUnusedImport
Unused import directive
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java
import trackOperationSystemAsInput
import java.io.ByteArrayOutputStream
import java.util.*
import javax.inject.Inject

```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2026` can be replaced with '...'
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java`
#### Snippet
```java
class ParameterizedTestNameFormatter {

	private static final char ELLIPSIS = '\u2026';
	private static final String TEMPORARY_DISPLAY_NAME_PLACEHOLDER = "~~~JUNIT_DISPLAY_NAME~~~";

```

## RuleId[id=LocalVariableName]
### LocalVariableName
Local variable name `test_4_12` should not contain underscores
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java

tasks {
	val test_4_12 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
```

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `PlainJUnit3TestCaseWithSingleTestWhichFails` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit3/PlainJUnit3TestCaseWithSingleTestWhichFails.java`
#### Snippet
```java
 * @since 4.12
 */
public class PlainJUnit3TestCaseWithSingleTestWhichFails extends TestCase {

	public void test() {
```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithSingleTestWhichFails` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithSingleTestWhichFails.java`
#### Snippet
```java
 * @since 4.12
 */
public class PlainJUnit4TestCaseWithSingleTestWhichFails {

	@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithFailingDescriptionThatIsNotReportedAsFinished` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithFailingDescriptionThatIsNotReportedAsFinished.java`
#### Snippet
```java

@RunWith(RunnerThatOnlyReportsFailures.class)
public class JUnit4TestCaseWithFailingDescriptionThatIsNotReportedAsFinished {
	@Test
	public void testWithMissingEvents() {
```

### NewClassNamingConvention
Test class name `IgnoredJUnit4TestCaseWithNotFilterableRunner` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/IgnoredJUnit4TestCaseWithNotFilterableRunner.java`
#### Snippet
```java
 */
@Ignore
public class IgnoredJUnit4TestCaseWithNotFilterableRunner extends JUnit4TestCaseWithNotFilterableRunner {
}

```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithSingleInheritedTestWhichFails` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithSingleInheritedTestWhichFails.java`
#### Snippet
```java
 * @since 4.12
 */
public class PlainJUnit4TestCaseWithSingleInheritedTestWhichFails extends PlainJUnit4TestCaseWithSingleTestWhichFails {
}

```

### NewClassNamingConvention
Test class name `NestedClass` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/EnclosedJUnit4TestCase.java`
#### Snippet
```java

	@Category(Categories.Plain.class)
	public static class NestedClass {

		@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithErrorInAfterClass` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithErrorInAfterClass.java`
#### Snippet
```java
 */
@FixMethodOrder(NAME_ASCENDING)
public class JUnit4TestCaseWithErrorInAfterClass {

	@AfterClass
```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithFiveTestMethods` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithFiveTestMethods.java`
#### Snippet
```java
@FixMethodOrder(NAME_ASCENDING)
@Category(Plain.class)
public class PlainJUnit4TestCaseWithFiveTestMethods {

	@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithErrorInBeforeClass` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithErrorInBeforeClass.java`
#### Snippet
```java
 * @since 4.12
 */
public class JUnit4TestCaseWithErrorInBeforeClass {

	@BeforeClass
```

### NewClassNamingConvention
Test class name `JUnit4SuiteWithExceptionThrowingRunner` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4SuiteWithExceptionThrowingRunner.java`
#### Snippet
```java
@RunWith(ExceptionThrowingRunner.class)
@ChildCount(1)
public class JUnit4SuiteWithExceptionThrowingRunner {
}

```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithTwoTestMethods` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithTwoTestMethods.java`
#### Snippet
```java
 */
@FixMethodOrder(NAME_ASCENDING)
public class PlainJUnit4TestCaseWithTwoTestMethods {

	@Test
```

### NewClassNamingConvention
Test class name `NestedTestCase2` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/EnclosedWithParameterizedChildrenJUnit4TestCase.java`
#### Snippet
```java

	@RunWith(Parameterized.class)
	public static class NestedTestCase2 {

		@Parameters
```

### NewClassNamingConvention
Test class name `NestedTestCase1` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/EnclosedWithParameterizedChildrenJUnit4TestCase.java`
#### Snippet
```java

	@RunWith(Parameterized.class)
	public static class NestedTestCase1 {

		@Parameters
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithIndistinguishableOverloadedMethod` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithIndistinguishableOverloadedMethod.java`
#### Snippet
```java
 */
@RunWith(Theories.class)
public class JUnit4TestCaseWithIndistinguishableOverloadedMethod {

	@DataPoint
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithErrorCollectorStoringMultipleFailures` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithErrorCollectorStoringMultipleFailures.java`
#### Snippet
```java
import org.junit.rules.ErrorCollector;

public class JUnit4TestCaseWithErrorCollectorStoringMultipleFailures {
	@Rule
	public ErrorCollector collector = new ErrorCollector();
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithDistinguishableOverloadedMethod` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithDistinguishableOverloadedMethod.java`
#### Snippet
```java
 */
@RunWith(Theories.class)
public class JUnit4TestCaseWithDistinguishableOverloadedMethod {

	@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithRunnerWithCustomUniqueIdsAndDisplayNames` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithCustomUniqueIdsAndDisplayNames.java`
#### Snippet
```java
@Label("(TestClass)")
@RunWith(RunnerWithCustomUniqueIdsAndDisplayNames.class)
public class JUnit4TestCaseWithRunnerWithCustomUniqueIdsAndDisplayNames {

	@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithExceptionThrowingRunner` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithExceptionThrowingRunner.java`
#### Snippet
```java
@RunWith(ExceptionThrowingRunner.class)
@ChildCount(0)
public class JUnit4TestCaseWithExceptionThrowingRunner {
}

```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithNotFilterableRunner` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithNotFilterableRunner.java`
#### Snippet
```java
@ChildCount(2)
@Category(Categories.Successful.class)
public class JUnit4TestCaseWithNotFilterableRunner {

	@Test
```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithLifecycleMethods` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithLifecycleMethods.java`
#### Snippet
```java

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlainJUnit4TestCaseWithLifecycleMethods {

	public static final List<String> EVENTS = new ArrayList<>();
```

### NewClassNamingConvention
Test class name `PlainJUnit4TestCaseWithSingleTestWhichIsIgnored` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/PlainJUnit4TestCaseWithSingleTestWhichIsIgnored.java`
#### Snippet
```java
 * @since 4.12
 */
public class PlainJUnit4TestCaseWithSingleTestWhichIsIgnored {

	@Test
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithAssumptionFailureInBeforeClass` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithAssumptionFailureInBeforeClass.java`
#### Snippet
```java
 * @since 4.12
 */
public class JUnit4TestCaseWithAssumptionFailureInBeforeClass {

	@BeforeClass
```

### NewClassNamingConvention
Test class name `Runner` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java
@RunWith(JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.Runner.class)
public class JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions {
	public static class Runner extends org.junit.runner.Runner {

		private final Class<?> testClass;
```

### NewClassNamingConvention
Test class name `JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `junit-vintage-engine/src/testFixtures/java/org/junit/vintage/engine/samples/junit4/JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.java`
#### Snippet
```java

@RunWith(JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions.Runner.class)
public class JUnit4TestCaseWithRunnerWithDuplicateChangingChildDescriptions {
	public static class Runner extends org.junit.runner.Runner {

```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[nμm]?s)`
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutDurationParser.java`
#### Snippet
```java
class TimeoutDurationParser {

	private static final Pattern PATTERN = Pattern.compile("([1-9]\\d*) ?((?:[nμm]?s)|m|h|d)?",
		CASE_INSENSITIVE | UNICODE_CASE);
	private static final Map<String, TimeUnit> UNITS_BY_ABBREVIATION;
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(?:any|none)\\(\\))`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Tokenizer.java`
#### Snippet
```java
class Tokenizer {

	private static final Pattern PATTERN = Pattern.compile("\\s*(?:(?:(?:any|none)\\(\\))|[()!|&]|(?:[^\\s()!|&]+))",
		CASE_INSENSITIVE);

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^\\s()!|&]+)`
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/Tokenizer.java`
#### Snippet
```java
class Tokenizer {

	private static final Pattern PATTERN = Pattern.compile("\\s*(?:(?:(?:any|none)\\(\\))|[()!|&]|(?:[^\\s()!|&]+))",
		CASE_INSENSITIVE);

```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
#### Snippet
```java
	 */
	public static List<Class<?>> findAllClassesInModule(String moduleName, ClassFilter classFilter) {
		return Collections.unmodifiableList(ModuleUtils.findAllClassesInModule(moduleName, classFilter));
	}

```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
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

### ThrowableNotThrown
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
#### Snippet
```java
		}
		catch (Throwable ex) {
			throwAsUncheckedException(ex);
		}

```

### ThrowableNotThrown
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

### ThrowableNotThrown
Result of `throwAsUncheckedException()` not thrown
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
#### Snippet
```java
		// No handlers left?
		if (exceptionHandlers.isEmpty()) {
			ExceptionUtils.throwAsUncheckedException(throwable);
		}

```

### ThrowableNotThrown
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

### ThrowableNotThrown
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
			}
			catch (Throwable throwable) {
				handleCsvException(throwable, this.csvFileSource);
			}
		}
```

### ThrowableNotThrown
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
					}
					catch (Throwable throwable) {
						handleCsvException(throwable, csvFileSource);
					}
				});
```

### ThrowableNotThrown
Result of `handleCsvException()` not thrown
in `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
#### Snippet
```java
		}
		catch (Throwable throwable) {
			handleCsvException(throwable, csvFileSource);
		}
		return this.csvParser;
```

### ThrowableNotThrown
Result of `throwAsUncheckedException()` not thrown
in `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStore.java`
#### Snippet
```java
			}
			if (this.value instanceof Failure) {
				ExceptionUtils.throwAsUncheckedException(((Failure) this.value).throwable);
			}
			return this.value;
```

### ThrowableNotThrown
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

### ThrowableNotThrown
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

### ThrowableNotThrown
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

### ThrowableNotThrown
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

## RuleId[id=ConstantValue]
### ConstantValue
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

### ConstantValue
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

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluator.java`
#### Snippet
```java
	private void logResult(Class<?> conditionType, ConditionEvaluationResult result, ExtensionContext context) {
		logger.trace(() -> format("Evaluation of condition [%s] on [%s] resulted in: %s", conditionType.getName(),
			context.getElement().get(), result));
	}

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestExtension.java`
#### Snippet
```java
		Method testMethod = context.getRequiredTestMethod();
		String displayName = context.getDisplayName();
		RepeatedTest repeatedTest = AnnotationUtils.findAnnotation(testMethod, RepeatedTest.class).get();
		int totalRepetitions = totalRepetitions(repeatedTest, testMethod);
		AtomicInteger failureCount = new AtomicInteger();
```

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
#### Snippet
```java
				// Nested container annotation?
				else if (isRepeatableAnnotationContainer(candidateAnnotationType)) {
					Method method = ReflectionUtils.tryToGetMethod(candidateAnnotationType, "value").toOptional().get();
					Annotation[] containedAnnotations = (Annotation[]) ReflectionUtils.invokeMethod(method, candidate);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryResultValidator.java`
#### Snippet
```java
		Preconditions.condition(!cyclicGraphInfo.isPresent(),
			() -> String.format("The discover() method for TestEngine with ID '%s' returned a cyclic graph; %s",
				testEngine.getId(), cyclicGraphInfo.get()));
	}

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseResult.java`
#### Snippet
```java
			throw exceptionCreator.apply(errorMessage().get());
		}
		return tagExpression().get();
	}

```

## RuleId[id=UnusedSymbol]
### UnusedSymbol
Class "ClasspathSystemPropertyProvider" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/ClasspathSystemPropertyProvider.kt`
#### Snippet
```java
import org.gradle.process.CommandLineArgumentProvider

class ClasspathSystemPropertyProvider(private val propertyName: String, @get:Classpath val files: FileCollection) : CommandLineArgumentProvider {
    override fun asArguments() = listOf("-D$propertyName=${files.asPath}")
}
```

### UnusedSymbol
Property "buildDate" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
	}

val buildDate: String by extra { DateTimeFormatter.ISO_LOCAL_DATE.format(buildTimeAndDate) }
val buildTime: String by extra { DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ").format(buildTimeAndDate) }
val buildRevision: String by extra {
```

### UnusedSymbol
Property "buildTime" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java

val buildDate: String by extra { DateTimeFormatter.ISO_LOCAL_DATE.format(buildTimeAndDate) }
val buildTime: String by extra { DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ").format(buildTimeAndDate) }
val buildRevision: String by extra {
	providers.exec {
```

### UnusedSymbol
Property "buildRevision" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
val buildDate: String by extra { DateTimeFormatter.ISO_LOCAL_DATE.format(buildTimeAndDate) }
val buildTime: String by extra { DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ").format(buildTimeAndDate) }
val buildRevision: String by extra {
	providers.exec {
		commandLine("git", "rev-parse", "--verify", "HEAD")
```

### UnusedSymbol
Property "builtByValue" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
	}.standardOutput.asText.get()
}
val builtByValue by extra { project.findProperty("builtBy") ?: project.property("defaultBuiltBy") }

```

### UnusedSymbol
Class "GenerateStandaloneConsoleLauncherShadowedArtifactsFile" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/GenerateStandaloneConsoleLauncherShadowedArtifactsFile.kt`
#### Snippet
```java

@CacheableTask
abstract class GenerateStandaloneConsoleLauncherShadowedArtifactsFile @Inject constructor(
    private val fileSystem: FileSystemOperations,
    private val archives: ArchiveOperations
```

### UnusedSymbol
Class "CaptureJavaExecOutput" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/CaptureJavaExecOutput.kt`
#### Snippet
```java

@CacheableTask
abstract class CaptureJavaExecOutput @Inject constructor(private val execOperations: ExecOperations) : DefaultTask() {

    @get:Classpath
```

### UnusedSymbol
Class "WriteArtifactsFile" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/java/WriteArtifactsFile.kt`
#### Snippet
```java
import org.gradle.api.tasks.TaskAction

abstract class WriteArtifactsFile : DefaultTask() {

    @get:OutputFile
```

### UnusedSymbol
Class "ExecJarAction" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/java/ExecJarAction.kt`
#### Snippet
```java
import javax.inject.Inject

abstract class ExecJarAction @Inject constructor(private val operations: ExecOperations): Action<Task> {

    abstract val javaLauncher: Property<JavaLauncher>
```

### UnusedSymbol
Class "ModuleSpecificJavadocFileOption" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/javadoc/ModuleSpecificJavadocFileOption.kt`
#### Snippet
```java
import org.gradle.external.javadoc.internal.JavadocOptionFileWriterContext

class ModuleSpecificJavadocFileOption(private val option: String, private var valuePerModule: Map<String, String>) : JavadocOptionFileOption<Map<String, String>> {

    override fun getOption() = option
```

### UnusedSymbol
Class "RunConsoleLauncher" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild/exec/RunConsoleLauncher.kt`
#### Snippet
```java

@CacheableTask
abstract class RunConsoleLauncher @Inject constructor(private val execOperations: ExecOperations) : DefaultTask() {

    @get:Classpath
```

### UnusedSymbol
Property "javaVersion" is never used
in `gradle/plugins/common/src/main/kotlin/junitbuild.java-library-conventions.gradle.kts`
#### Snippet
```java
val combinedModuleSourceDir = layout.buildDirectory.dir("module")
val moduleOutputDir = file("$buildDir/classes/java/module")
val javaVersion = JavaVersion.current()

eclipse {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'getSuites()' is declared in unstable interface 'org.gradle.testing.base.TestingExtension' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
tasks {
	val test_4_12 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }) + junit_4_12
```

### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
tasks {
	val test_4_12 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }) + junit_4_12
```

### UnstableApiUsage
'getSources()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
	val test_4_12 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }) + junit_4_12
	}
```

### UnstableApiUsage
'getSources()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.junit4-compatibility.gradle.kts`
#### Snippet
```java
		val test by testing.suites.existing(JvmTestSuite::class)
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }) + junit_4_12
	}
	check {
```

### UnstableApiUsage
'org.gradle.testing.jacoco.plugins.JacocoCoverageReport' is marked unstable with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.jacoco-aggregation-conventions.gradle.kts`
#### Snippet
```java
reporting {
	reports {
		create<JacocoCoverageReport>("jacocoRootReport") {
			testType.set(TestSuiteType.UNIT_TEST)
		}
```

### UnstableApiUsage
'getTestType()' is declared in unstable interface 'org.gradle.testing.jacoco.plugins.JacocoCoverageReport' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.jacoco-aggregation-conventions.gradle.kts`
#### Snippet
```java
	reports {
		create<JacocoCoverageReport>("jacocoRootReport") {
			testType.set(TestSuiteType.UNIT_TEST)
		}
	}
```

### UnstableApiUsage
'org.gradle.api.attributes.TestSuiteType' is marked unstable with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.jacoco-aggregation-conventions.gradle.kts`
#### Snippet
```java
	reports {
		create<JacocoCoverageReport>("jacocoRootReport") {
			testType.set(TestSuiteType.UNIT_TEST)
		}
	}
```

### UnstableApiUsage
'UNIT_TEST' is declared in unstable interface 'org.gradle.api.attributes.TestSuiteType' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.jacoco-aggregation-conventions.gradle.kts`
#### Snippet
```java
	reports {
		create<JacocoCoverageReport>("jacocoRootReport") {
			testType.set(TestSuiteType.UNIT_TEST)
		}
	}
```

### UnstableApiUsage
'repositories(org.gradle.api.Action)' is marked unstable with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
	repositories {
		mavenCentral()
		maven(url = "https://oss.sonatype.org/content/repositories/snapshots") {
```

### UnstableApiUsage
'exec(org.gradle.api.Action)' is marked unstable with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
val buildTime: String by extra { DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ").format(buildTimeAndDate) }
val buildRevision: String by extra {
	providers.exec {
		commandLine("git", "rev-parse", "--verify", "HEAD")
	}.standardOutput.asText.get()
```

### UnstableApiUsage
'getStandardOutput()' is declared in unstable interface 'org.gradle.process.ExecOutput' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
	providers.exec {
		commandLine("git", "rev-parse", "--verify", "HEAD")
	}.standardOutput.asText.get()
}
val builtByValue by extra { project.findProperty("builtBy") ?: project.property("defaultBuiltBy") }
```

### UnstableApiUsage
'getAsText()' is declared in unstable interface 'org.gradle.process.ExecOutput.StandardStreamContent' marked with @Incubating
in `gradle/plugins/common/src/main/kotlin/junitbuild.build-metadata.gradle.kts`
#### Snippet
```java
	providers.exec {
		commandLine("git", "rev-parse", "--verify", "HEAD")
	}.standardOutput.asText.get()
}
val builtByValue by extra { project.findProperty("builtBy") ?: project.property("defaultBuiltBy") }
```

### UnstableApiUsage
'getSuites()' is declared in unstable interface 'org.gradle.testing.base.TestingExtension' marked with @Incubating
in `junit-vintage-engine/junit-vintage-engine.gradle.kts`
#### Snippet
```java
	}
	val testWithoutJUnit4 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		(options as JUnitPlatformOptions).apply {
			includeTags("missing-junit4")
```

### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `junit-vintage-engine/junit-vintage-engine.gradle.kts`
#### Snippet
```java
	}
	val testWithoutJUnit4 by registering(Test::class) {
		val test by testing.suites.existing(JvmTestSuite::class)
		(options as JUnitPlatformOptions).apply {
			includeTags("missing-junit4")
```

### UnstableApiUsage
'getSources()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `junit-vintage-engine/junit-vintage-engine.gradle.kts`
#### Snippet
```java
		}
		setIncludes(listOf("**/JUnit4VersionCheckTests.class"))
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }).filter {
			!it.name.startsWith("junit-4")
```

### UnstableApiUsage
'getSources()' is declared in unstable interface 'org.gradle.api.plugins.jvm.JvmTestSuite' marked with @Incubating
in `junit-vintage-engine/junit-vintage-engine.gradle.kts`
#### Snippet
```java
		setIncludes(listOf("**/JUnit4VersionCheckTests.class"))
		testClassesDirs = files(test.map { it.sources.output.classesDirs })
		classpath = files(test.map { it.sources.runtimeClasspath }).filter {
			!it.name.startsWith("junit-4")
		}
```

### UnstableApiUsage
'invoke(org.gradle.api.artifacts.Configuration, org.gradle.api.provider.Provider, kotlin.jvm.functions.Function1)' is marked unstable with @Incubating
in `platform-tooling-support-tests/platform-tooling-support-tests.gradle.kts`
#### Snippet
```java
	antJars(projects.junitPlatformReporting)

	mavenDistribution(libs.maven) {
		artifact {
			classifier = "bin"
```

