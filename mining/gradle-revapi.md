# gradle-revapi 
 
# Bad smells
I found 9 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| Deprecation | 1 | false |
| DataFlowIssue | 1 | false |
| InfiniteRecursion | 1 | false |
| NullableProblems | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Usage.JAVA_API`
in `src/main/java/com/palantir/gradle/revapi/RevapiPlugin.java`
#### Snippet
```java
    }

    /** In order to ensure we resolve the right variants with usage {@link Usage.JAVA_API}. */
    private static void configureApiUsage(Project project, Configuration conf) {
        conf.attributes(attrs ->
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

## RuleId[id=Deprecation]
### Deprecation
'ALLOW_TRAILING_COMMA' is deprecated
in `src/main/java/com/palantir/gradle/revapi/config/GradleRevapiConfig.java`
#### Snippet
```java

    public static ObjectMapper newJsonObjectMapper() {
        return configureObjectMapper(new ObjectMapper()).enable(JsonParser.Feature.ALLOW_TRAILING_COMMA);
    }

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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/palantir/gradle/revapi/config/AcceptedBreak.java`
#### Snippet
```java

    @Override
    default int compareTo(AcceptedBreak other) {
        return comparator().compare(this, other);
    }
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/palantir/gradle/revapi/PreviousVersionResolutionHelpers.java`
#### Snippet
```java
     * When the version of the local java project is higher than the old published dependency and has the same
     * group and name, gradle silently replaces the published external dependency with the project dependency
     * (see https://discuss.gradle.org/t/fetching-the-previous-version-of-a-projects-jar/8571). This happens on
     * tag builds, and would cause the publish to fail. Instead, we change the group for just this thread
     * while resolving these dependencies so the switching out doesnt happen.
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

