# junit-pioneer/junit-pioneer
# Bad smells
I found 14 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 11 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
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

## ArraysAsListWithZeroOrOneArgument
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/junitpioneer/jupiter/issue/IssueExtensionExecutionListener.java`
#### Snippet
```java
		List<IssueTestSuite> suites = testCases
				.values().stream()
				.collect(toMap(IssueTestCaseBuilder::getIssueId, builder -> new ArrayList<>(Arrays.asList(builder)),
						(builders1, builders2) -> {
							builders1.addAll(builders2);
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

```

### UnstableApiUsage
'org.gradle.api.plugins.jvm.JvmTestSuite' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
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

