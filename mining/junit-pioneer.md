# junit-pioneer 
 
# Bad smells
I found 23 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 9 | false |
| MarkedForRemoval | 4 | false |
| Deprecation | 3 | false |
| NullableProblems | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| Java9ReflectionClassVisibility | 1 | false |
| ClassEscapesItsScope | 1 | false |
| AutoCloseableResource | 1 | false |
| RedundantSemicolon | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'type'
in `src/main/java/org/junitpioneer/internal/PioneerAnnotationUtils.java`
#### Snippet
```java
	}

	private static <A extends Annotation> Stream<A> findOnOuterClasses(Optional<Class<?>> type, Class<A> annotationType,
			boolean findRepeated, boolean findAllEnclosing) {
		if (type.isEmpty())
```

## RuleId[id=Java9ReflectionClassVisibility]
### Java9ReflectionClassVisibility
The module 'java.base' does not open the package 'java.lang' to the module 'org.junitpioneer'
in `src/main/java/org/junitpioneer/jupiter/EnvironmentVariableUtils.java`
#### Snippet
```java
	private static void setInProcessEnvironmentClass(Consumer<Map<String, String>> consumer)
			throws ReflectiveOperationException {
		Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
		// The order of operations is critical here: On some operating systems, theEnvironment is present but
		// theCaseInsensitiveEnvironment is not present. In such cases, this method must throw a
```

## RuleId[id=ClassEscapesItsScope]
### ClassEscapesItsScope
Class `CartesianArgumentsProvider` is not exported from module 'org.junitpioneer'
in `src/main/java/org/junitpioneer/jupiter/cartesian/CartesianArgumentsSource.java`
#### Snippet
```java
	 * The type of {@link CartesianArgumentsProvider} to be used.
	 */
	Class<? extends CartesianArgumentsProvider> value();

}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'StdIn' used without 'try'-with-resources statement
in `src/main/java/org/junitpioneer/jupiter/StdIoExtension.java`
#### Snippet
```java
		boolean stdInStillInPlace = context.getStore(NAMESPACE).get(STD_IN_KEY) == null;
		if (source.length > 0 && stdInStillInPlace)
			createSwapStoreStdIn(context, source);
	}

```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `src/main/java/org/junitpioneer/jupiter/RestoreEnvironmentVariables.java`
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

## RuleId[id=Deprecation]
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
'org.junitpioneer.vintage.Test' is deprecated
in `src/main/java/org/junitpioneer/vintage/ExpectedExceptionExtension.java`
#### Snippet
```java

/**
 * This extension implements the expected exception behavior of {@link Test @Test}, where a test only passes if it throws
 * an exception of the specified type.
 */
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/junitpioneer/jupiter/StdOutputStream.java`
#### Snippet
```java

	@Override
	public final void write(byte[] b, int off, int len) {
		writer.write(new String(b, Charset.defaultCharset()), off, len);
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/junitpioneer/jupiter/StdIn.java`
#### Snippet
```java

	@Override
	public int read(byte[] b, int off, int len) throws IOException { // NOSONAR - this is fine for a simple testing extension
		return super.read(b, off, len);
	}
```

## RuleId[id=RedundantSemicolon]
### RedundantSemicolon
Redundant semicolon
in `build.gradle.kts`
#### Snippet
```java
		if (project.version != "unspecified") {
			// Add version to Java modules
			options.javaModuleVersion.set(project.version.toString());
		}
	}
```

## RuleId[id=UnstableApiUsage]
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
					implementation("com.google.jimfs:jimfs:$jimfsVersion")
```

### UnstableApiUsage
'project(java.lang.String)' is declared in unstable interface 'org.gradle.api.artifacts.dsl.Dependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:$jimfsVersion")
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
```

### UnstableApiUsage
'getProject()' is declared in unstable interface 'org.gradle.api.artifacts.dsl.Dependencies' marked with @Incubating
in `build.gradle.kts`
#### Snippet
```java
			val demoTests by registering(JvmTestSuite::class) {
				dependencies {
					implementation(project(project.path))
					implementation("com.google.jimfs:jimfs:$jimfsVersion")
					implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
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

