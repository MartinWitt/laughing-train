# gradle-revapi 
 
# Bad smells
I found 26 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| AbstractClassNeverImplemented | 5 | false |
| BoundedWildcard | 4 | false |
| CodeBlock2Expr | 2 | true |
| RedundantFieldInitialization | 1 | false |
| ReturnNull | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| SynchronizeOnThis | 1 | false |
| DataFlowIssue | 1 | false |
| InfiniteRecursion | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/palantir/gradle/revapi/CheckWhitelist.java`
#### Snippet
```java
    private static final Pattern[] EVERYTHING = {Pattern.compile(".*")};

    private boolean enabled = false;
    private Set<String> whitelistedChecks;

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/revapi/GitVersionUtils.java`
#### Snippet
```java
        @Override
        public Spliterator<String> trySplit() {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `parentDoesNotExist` is redundant
in `src/main/java/com/palantir/gradle/revapi/GitVersionUtils.java`
#### Snippet
```java

        GitResult foo = execute(project, "git", "rev-parse", "--verify", "--quiet", "0.0.0^");
        boolean parentDoesNotExist = foo.exitCode() != 0;
        return parentDoesNotExist;
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/ExceptionMessages.java`
#### Snippet
```java

        return errorTemplate
                .replace("{{versionOverrideTaskName}}", RevapiPlugin.VERSION_OVERRIDE_TASK_NAME)
                .replace("{{replacementVersionOption}}", RevapiVersionOverrideTask.REPLACEMENT_VERSION_OPTION)
                .replace(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/ExceptionMessages.java`
#### Snippet
```java
        return errorTemplate
                .replace("{{versionOverrideTaskName}}", RevapiPlugin.VERSION_OVERRIDE_TASK_NAME)
                .replace("{{replacementVersionOption}}", RevapiVersionOverrideTask.REPLACEMENT_VERSION_OPTION)
                .replace(
                        "{{taskPath}}",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/ExceptionMessages.java`
#### Snippet
```java
                .replace("{{versionOverrideTaskName}}", RevapiPlugin.VERSION_OVERRIDE_TASK_NAME)
                .replace("{{replacementVersionOption}}", RevapiVersionOverrideTask.REPLACEMENT_VERSION_OPTION)
                .replace(
                        "{{taskPath}}",
                        project.getTasks()
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/ExceptionMessages.java`
#### Snippet
```java
                                .getByName(RevapiPlugin.VERSION_OVERRIDE_TASK_NAME)
                                .getPath())
                .replace("{{projectDisplayName}}", project.getDisplayName())
                .replace("{{errors}}", errors);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/ExceptionMessages.java`
#### Snippet
```java
                                .getPath())
                .replace("{{projectDisplayName}}", project.getDisplayName())
                .replace("{{errors}}", errors);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/revapi/RevapiConfig.java`
#### Snippet
```java
        String template = Utils.resourceToString(RevapiConfig.class, "revapi-configuration.json");

        return fromString(template.replace(
                "{{ARCHIVE_INCLUDE_REGEXES}}",
                jarsToReportBreaks.getFiles().stream().map(File::getName).collect(Collectors.joining("\", \""))));
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/palantir/gradle/revapi/GradleUtils.java`
#### Snippet
```java
            // A 2-field variant of Double Checked Locking.
            if (!initialized) {
                synchronized (this) {
                    if (!initialized) {
                        T value = delegate.get();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `dependsOn` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/revapi/RevapiPlugin.java`
#### Snippet
```java
                });

        project.getTasks().findByName(LifecycleBasePlugin.CHECK_TASK_NAME).dependsOn(reportTask);

        project.getTasks().register(ACCEPT_ALL_BREAKS_TASK_NAME, RevapiAcceptAllBreaksTask.class, task -> {
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `justification()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/com/palantir/gradle/revapi/config/AcceptedBreak.java`
#### Snippet
```java

    class Builder extends ImmutableAcceptedBreak.Builder {
        public Builder justification(String justification) {
            justification(Justification.fromString(justification));
            return this;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends FileCollection`
in `src/main/java/com/palantir/gradle/revapi/RevapiAnalyzeTask.java`
#### Snippet
```java
    }

    private static List<FileArchive> toFileArchives(Provider<FileCollection> property) {
        return property.get().filter(File::isFile).getFiles().stream()
                .map(FileArchive::new)
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/palantir/gradle/revapi/GradleUtils.java`
#### Snippet
```java
        private transient T savedValue;

        MemoizingSupplier(Supplier<T> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `src/main/java/com/palantir/gradle/revapi/OldApiConfigurations.java`
#### Snippet
```java
        private final List<Throwable> resolutionFailures;

        CouldNotResolveOldApiException(Version version, List<Throwable> resolutionFailures) {
            this.version = version;
            this.resolutionFailures = resolutionFailures;
```

### BoundedWildcard
Can generalize to `? extends GroupAndName`
in `src/main/java/com/palantir/gradle/revapi/RevapiPlugin.java`
#### Snippet
```java

    private Provider<Set<AcceptedBreak>> acceptedBreaks(
            Project project, ConfigManager configManager, Provider<GroupAndName> oldGroupAndNameProvider) {

        return GradleUtils.memoisedProvider(
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AnalysisResult` has no concrete subclass
in `src/main/java/com/palantir/gradle/revapi/AnalysisResult.java`
#### Snippet
```java
@ImmutableStyle
@JsonDeserialize(as = ImmutableAnalysisResult.class)
public abstract class AnalysisResult {
    public abstract String code();
    // Using @Nullable instead of Optionals as freemarker templating does not not support Optionals
```

### AbstractClassNeverImplemented
Abstract class `AnalysisResults` has no concrete subclass
in `src/main/java/com/palantir/gradle/revapi/AnalysisResults.java`
#### Snippet
```java
@ImmutableStyle
@JsonDeserialize(as = ImmutableAnalysisResults.class)
public abstract class AnalysisResults {
    private static final ObjectMapper OBJECT_MAPPER =
            new ObjectMapper().enable(JsonReadFeature.ALLOW_TRAILING_COMMA.mappedFeature());
```

### AbstractClassNeverImplemented
Abstract class `RevapiConfig` has no concrete subclass
in `src/main/java/com/palantir/gradle/revapi/RevapiConfig.java`
#### Snippet
```java
@Value.Immutable
@ImmutableStyle
abstract class RevapiConfig {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().registerModule(new Jdk8Module());

```

### AbstractClassNeverImplemented
Abstract class `PerProjectAcceptedBreaks` has no concrete subclass
in `src/main/java/com/palantir/gradle/revapi/config/PerProjectAcceptedBreaks.java`
#### Snippet
```java
@ImmutableStyle
@JsonDeserialize(as = ImmutablePerProjectAcceptedBreaks.class)
abstract class PerProjectAcceptedBreaks {
    @JsonValue
    @Value.NaturalOrder
```

### AbstractClassNeverImplemented
Abstract class `GradleRevapiConfig` has no concrete subclass
in `src/main/java/com/palantir/gradle/revapi/config/GradleRevapiConfig.java`
#### Snippet
```java
@ImmutableStyle
@JsonDeserialize(as = ImmutableGradleRevapiConfig.class)
public abstract class GradleRevapiConfig {
    @Value.NaturalOrder
    protected abstract SortedMap<GroupNameVersion, String> versionOverrides();
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/com/palantir/gradle/revapi/PreviousVersionResolutionHelpers.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return group.get().equals(obj);
        }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/revapi/RevapiPlugin.java`
#### Snippet
```java
        });

        project.getTasks().register(VERSION_OVERRIDE_TASK_NAME, RevapiVersionOverrideTask.class, task -> {
            task.getConfigManager().set(configManager);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/revapi/RevapiPlugin.java`
#### Snippet
```java
        });

        project.getTasks().register(ACCEPT_BREAK_TASK_NAME, RevapiAcceptBreakTask.class, task -> {
            task.getConfigManager().set(configManager);
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `savedValue` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/palantir/gradle/revapi/GradleUtils.java`
#### Snippet
```java
        // "value" does not need to be volatile; visibility piggy-backs
        // on volatile read of "initialized".
        private transient T savedValue;

        MemoizingSupplier(Supplier<T> delegate) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/com/palantir/gradle/revapi/ConfigManager.java`
#### Snippet
```java
            GradleRevapiConfig newGradleRevapiConfig = transformer.apply(oldGradleRevapiConfig);

            configFile.getParentFile().mkdirs();

            try {
```

