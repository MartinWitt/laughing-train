# gradle-consistent-versions 
 
# Bad smells
I found 43 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 9 | false |
| UnstableApiUsage | 8 | false |
| Deprecation | 7 | false |
| DataFlowIssue | 7 | false |
| JavadocReference | 5 | false |
| JavadocLinkAsPlainText | 2 | false |
| UnnecessaryToStringCall | 1 | true |
| SimplifyStreamApiCallChains | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Symbol `configurationNameOf` is inaccessible from here
in `src/main/java/com/palantir/gradle/versions/GradleConfigurations.java`
#### Snippet
```java
     * Deprecated sourcesets of the compile and runtime configuration, to be removed with Gradle 7.
     * The full configuration name follows the naming scheme of "$taskBaseName + capitalize($configurationName)"
     * see {@link org.gradle.api.internal.tasks.DefaultSourceSet#configurationNameOf}.
     */
    private static final ImmutableList<String> DEPRECATED_SOURCESET_SUFFIXES = ImmutableList.of("Compile", "Runtime");
```

### JavadocReference
Cannot resolve symbol `DomainObjectCollection`
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java

    /**
     * Allow a {@link ListProperty} to be used with {@link DomainObjectCollection#addAllLater}.
     *
     * <p>Pending fix: https://github.com/gradle/gradle/pull/10288
```

### JavadocReference
Cannot resolve symbol `addAllLater`
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java

    /**
     * Allow a {@link ListProperty} to be used with {@link DomainObjectCollection#addAllLater}.
     *
     * <p>Pending fix: https://github.com/gradle/gradle/pull/10288
```

### JavadocReference
Cannot resolve symbol `platform`
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
    /**
     * Returns whether a dependency / component is a non-enforced platform, i.e. what you create with
     * {@link DependencyHandler#platform} or {@link DependencyConstraintHandler#platform}.
     */
    static boolean isPlatform(AttributeContainer attributes) {
```

### JavadocReference
Symbol `collectErrorMessages` is inaccessible from here
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
    /**
     * Essentially replicates what
     * {@link org.gradle.api.tasks.diagnostics.internal.insight.DependencyInsightReporter#collectErrorMessages} does,
     * since that whole class is not public API.
     */
```

## RuleId[id=Deprecation]
### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `src/main/java/com/palantir/gradle/versions/GradleConfigurations.java`
#### Snippet
```java
     */
    private static Set<String> getLegacyJavaConfigurations(Project project) {
        JavaPluginConvention javaConvention = project.getConvention().findPlugin(JavaPluginConvention.class);
        if (javaConvention == null) {
            return ImmutableSet.of();
```

### Deprecation
'getConvention()' is deprecated
in `src/main/java/com/palantir/gradle/versions/GradleConfigurations.java`
#### Snippet
```java
     */
    private static Set<String> getLegacyJavaConfigurations(Project project) {
        JavaPluginConvention javaConvention = project.getConvention().findPlugin(JavaPluginConvention.class);
        if (javaConvention == null) {
            return ImmutableSet.of();
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `src/main/java/com/palantir/gradle/versions/GradleConfigurations.java`
#### Snippet
```java
     */
    private static Set<String> getLegacyJavaConfigurations(Project project) {
        JavaPluginConvention javaConvention = project.getConvention().findPlugin(JavaPluginConvention.class);
        if (javaConvention == null) {
            return ImmutableSet.of();
```

### Deprecation
'getConvention()' is deprecated
in `src/main/java/com/palantir/gradle/versions/VersionsLockExtension.java`
#### Snippet
```java
                "The java plugin must be applied to consider this a test project: %s",
                project);
        project.getConvention()
                .getPlugin(JavaPluginConvention.class)
                .getSourceSets()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `src/main/java/com/palantir/gradle/versions/VersionsLockExtension.java`
#### Snippet
```java
                project);
        project.getConvention()
                .getPlugin(JavaPluginConvention.class)
                .getSourceSets()
                .all(testConfigurer::from);
```

### Deprecation
'getConvention()' is deprecated
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java

        if (ext.isUseJavaPluginDefaults() && project.getPluginManager().hasPlugin("java")) {
            SourceSetContainer sourceSets = project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets();
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        if (ext.isUseJavaPluginDefaults() && project.getPluginManager().hasPlugin("java")) {
            SourceSetContainer sourceSets = project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets();

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getGroup` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/versions/GetVersionPlugin.java`
#### Snippet
```java
        String actual = configuration.getIncoming().getResolutionResult().getAllComponents().stream()
                .map(ResolvedComponentResult::getModuleVersion)
                .map(mvi -> String.format("\t- %s:%s:%s", mvi.getGroup(), mvi.getName(), mvi.getVersion()))
                .collect(Collectors.joining("\n"));
        return new GradleException(String.format(
```

### DataFlowIssue
Method invocation `getGroup` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/versions/GetVersionPlugin.java`
#### Snippet
```java
                        .map(ResolvedComponentResult::getModuleVersion)
                        .filter(item ->
                                item.getGroup().equals(group) && item.getName().equals(name))
                        .collect(toList());

```

### DataFlowIssue
Argument `component.getModuleVersion()` might be null
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
                        case PRODUCTION:
                            builder.putProductionDeps(
                                    MyModuleVersionIdentifier.copyOf(component.getModuleVersion()),
                                    extractDependents(component));
                            return;
```

### DataFlowIssue
Argument `component.getModuleVersion()` might be null
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
                        case TEST:
                            builder.putTestDeps(
                                    MyModuleVersionIdentifier.copyOf(component.getModuleVersion()),
                                    extractDependents(component));
                            return;
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        public void execute(CompatibilityCheckDetails<Usage> details) {
            if (ConsistentVersionsPlugin.CONSISTENT_VERSIONS_USAGE.equals(
                            details.getProducerValue().getName())
                    // This shouldn't be necessary, because we never resolve configurations with this usage.
                    // However, 5.3 tests fail without it
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
                    // However, 5.3 tests fail without it
                    || ConsistentVersionsPlugin.CONSISTENT_VERSIONS_USAGE.equals(
                            details.getConsumerValue().getName())) {
                details.compatible();
            }
```

### DataFlowIssue
Method invocation `getStrategy` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
                    RecommendationProviderContainer container =
                            sub.getExtensions().findByType(RecommendationProviderContainer.class);
                    if (container.getStrategy() == RecommendationStrategies.OverrideTransitives) {
                        throw new GradleException("Must not use strategy OverrideTransitives for "
                                + sub
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        if (!dep.getAttributes().isEmpty()) {
            builder.append(", attributes: ");
            builder.append(dep.getAttributes().toString());
        }
        return builder.toString();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `src/main/java/com/palantir/gradle/versions/VerifyLocksTask.java`
#### Snippet
```java
    private static String formatDependencyDifferences(Map<MyModuleIdentifier, ValueDifference<Line>> differing) {
        return differing.entrySet().stream()
                .map(diff -> String.format(
                        "" // to align strings
                                + "-%s\n"
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/com/palantir/gradle/versions/VerifyLocksTask.java`
#### Snippet
```java
        return differing.entrySet().stream()
                .map(diff -> String.format(
                        "" // to align strings
                                + "-%s\n"
                                + "+%s",
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Collection' may not contain objects of type 'Capability'
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        Set<Configuration> confs = projectDependency.getDependencyProject().getConfigurations().stream()
                .filter(conf ->
                        conf.getOutgoing().getCapabilities().containsAll(projectDependency.getRequestedCapabilities()))
                .collect(Collectors.toSet());

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleIdentifier.java`
#### Snippet
```java
    @Override
    @Parameter
    public abstract String getName();

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleIdentifier.java`
#### Snippet
```java
    @Override
    @Parameter
    public abstract String getGroup();

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleVersionIdentifier.java`
#### Snippet
```java
    @Override
    @Parameter
    public abstract String getName();

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleVersionIdentifier.java`
#### Snippet
```java
    @Override
    @Parameter
    public abstract String getGroup();

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleVersionIdentifier.java`
#### Snippet
```java
    @Override
    @Parameter
    public abstract String getVersion();

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleVersionIdentifier.java`
#### Snippet
```java

    @Override
    public final ModuleIdentifier getModule() {
        return MyModuleIdentifier.of(getGroup(), getName());
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        /** Must match the enum name exactly, so you can pass this into {@link #valueOf(String)}. */
        @Override
        public String getName() {
            return this.name();
        }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java

    @Override
    public final void apply(Project project) {
        checkPreconditions(project);
        project.getPluginManager().apply(LifecycleBasePlugin.class);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        /** Must match the enum name exactly, so you can pass this into {@link #valueOf(String)}. */
        @Override
        public String getName() {
            return this.name();
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/palantir/gradle/versions/GradleConfigurations.java`
#### Snippet
```java
     *
     * Note that we need to do a defensive copy here to guard against concurrent modification.
     * See https://github.com/palantir/gradle-consistent-versions/pull/812
     */
    public static Set<Configuration> getResolvableConfigurations(Project project) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
     * Allow a {@link ListProperty} to be used with {@link DomainObjectCollection#addAllLater}.
     *
     * <p>Pending fix: https://github.com/gradle/gradle/pull/10288
     */
    @SuppressWarnings("unchecked")
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LockStates.class);

    private static final Pattern SINGLE_VERSION_RANGE = Pattern.compile("\\[[^,]+\\]");

    private LockStates() {}
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `src/main/java/com/palantir/gradle/versions/TaskNameMatcher.java`
#### Snippet
```java
        }

        return Streams.zip(fullTaskNameParts.stream(), taskNameParts.stream(), String::startsWith)
                .allMatch(bool -> bool);
    }
```

### UnstableApiUsage
'isConfigureOnDemand()' is marked unstable with @Incubating
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
    private static Map<Project, LockedConfigurations> wireUpLockedConfigurationsByProject(Project rootProject) {
        return rootProject.getAllprojects().stream().collect(Collectors.toMap(Functions.identity(), subproject -> {
            if (rootProject.getGradle().getStartParameter().isConfigureOnDemand()
                    && !subproject.getState().getExecuted()) {
                return ImmutableLockedConfigurations.builder().build();
```

### UnstableApiUsage
'isConfigureOnDemand()' is marked unstable with @Incubating
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
                        unifiedClasspath.getIncoming().getResolutionResult();
                // Throw if there are dependencies that are not present in the lock state.
                if (startParameter.isConfigureOnDemand()
                        && project.getAllprojects().stream()
                                .anyMatch(subproject -> !subproject.getState().getExecuted())) {
```

### UnstableApiUsage
'com.google.common.hash.Hasher' is marked unstable with @Beta
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
        List<String> all = prettyPrintConstraints(dependents);

        Hasher hasher = Hashing.adler32().newHasher();
        all.forEach(item -> hasher.putString(item, StandardCharsets.UTF_8));
        HashCode hash = hasher.hash();
```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
        List<String> all = prettyPrintConstraints(dependents);

        Hasher hasher = Hashing.adler32().newHasher();
        all.forEach(item -> hasher.putString(item, StandardCharsets.UTF_8));
        HashCode hash = hasher.hash();
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java

        Hasher hasher = Hashing.adler32().newHasher();
        all.forEach(item -> hasher.putString(item, StandardCharsets.UTF_8));
        HashCode hash = hasher.hash();

```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
        Hasher hasher = Hashing.adler32().newHasher();
        all.forEach(item -> hasher.putString(item, StandardCharsets.UTF_8));
        HashCode hash = hasher.hash();

        Line line = ImmutableLine.of(
```

### UnstableApiUsage
'isConfigureOnDemand()' is marked unstable with @Incubating
in `src/main/java/com/palantir/gradle/versions/VersionsPropsPlugin.java`
#### Snippet
```java
            TaskProvider<CheckUnusedConstraintsTask> checkNoUnusedConstraints = project.getTasks()
                    .register("checkUnusedConstraints", CheckUnusedConstraintsTask.class, task -> {
                        if (project.getGradle().getStartParameter().isConfigureOnDemand()
                                && project.getAllprojects().stream()
                                        .anyMatch(p -> !p.getState().getExecuted())) {
```

