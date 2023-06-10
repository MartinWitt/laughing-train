# gradle-external-publish-plugin 
 
# Bad smells
I found 13 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 9 | false |
| Deprecation | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
## RuleId[id=Deprecation]
### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java
            CreateStartScripts createStartScripts = (CreateStartScripts) task;

            String windowsScript = GFileUtils.readFile(createStartScripts.getWindowsScript());
            String modified = windowsScript.replaceFirst("(set CLASSPATH=%APP_HOME%\\\\lib\\\\).*", "$1*");
            GFileUtils.writeFile(modified, createStartScripts.getWindowsScript(), StandardCharsets.UTF_8.toString());
```

### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java
            String windowsScript = GFileUtils.readFile(createStartScripts.getWindowsScript());
            String modified = windowsScript.replaceFirst("(set CLASSPATH=%APP_HOME%\\\\lib\\\\).*", "$1*");
            GFileUtils.writeFile(modified, createStartScripts.getWindowsScript(), StandardCharsets.UTF_8.toString());
        }
    }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/palantir/gradle/externalpublish/CheckSigningKeyTask.java`
#### Snippet
```java
    @TaskAction
    public final void checkSigningKey() {
        if (!GpgSigningKey.fromEnv(getProject()).isPresent()) {
            throw new GradleException("The required environment variables to sign the release could not be found. "
                    + "Check the logs above to find out which ones are missing.");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/palantir/gradle/externalpublish/GpgSigningKey.java`
#### Snippet
```java

        boolean onCi = System.getenv("CI") != null;
        if (onCi && !value.isPresent()) {
            log.warn("Could not find environment variable {}, signing will be disabled", envVar);
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishCustomPlugin.java`
#### Snippet
```java
public final class ExternalPublishCustomPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        ExternalPublishBasePlugin basePlugin = ExternalPublishBasePlugin.applyTo(project);

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishDistPlugin.java`
#### Snippet
```java

    @Override
    public final void apply(Project project) {
        ExternalPublishBasePlugin.applyTo(project).addPublication("dist", publication -> {
            // Unfortunately need to use afterEvaluate here, since MavenPublication#artifact immediately tries to get
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishJarPlugin.java`
#### Snippet
```java

    @Override
    public final void apply(Project project) {
        configureJars(project);

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishRootPlugin.java`
#### Snippet
```java

    @Override
    public final void apply(Project rootProjectVal) {
        this.rootProject = rootProjectVal;

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/CircleCiContextDeadlineAvoidance.java`
#### Snippet
```java
        task.doLast(new Action<Task>() {
            @Override
            public void execute(Task _ignored) {
                spammerTask.get().cancel(true);
            }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/CircleCiContextDeadlineAvoidance.java`
#### Snippet
```java
        task.doFirst(new Action<Task>() {
            @Override
            public void execute(Task _ignored) {
                spammerTask.set(CIRCLE_CI_OUTPUT_SPAMMER.scheduleWithFixedDelay(
                        () -> {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java

    @Override
    public void apply(Project projectVal) {
        this.project = projectVal;

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java
    private static final class FixWindowsStartScripts implements Action<Task> {
        @Override
        public void execute(Task task) {
            CreateStartScripts createStartScripts = (CreateStartScripts) task;

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java

    @Override
    public final void apply(Project project) {
        configureApplicationDist(project);

```

