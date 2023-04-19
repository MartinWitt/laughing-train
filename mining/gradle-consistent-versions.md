# gradle-consistent-versions 
 
# Bad smells
I found 59 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 16 | true |
| BoundedWildcard | 15 | false |
| UnstableApiUsage | 8 | false |
| DataFlowIssue | 7 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| AbstractClassNeverImplemented | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SimplifyStreamApiCallChains | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/versions/VersionsProps.java`
#### Snippet
```java
            occurrences++;
        }
        String sanitized = glob.replaceAll("\\*", "_");
        if (occurrences == 0) {
            return "org:" + sanitized;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.provider` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    static <T> ListProperty<T> fixListProperty(ListProperty<T> property) {
        Class<?> propertyInternalClass = org.gradle.api.internal.provider.CollectionPropertyInternal.class;
        return (ListProperty<T>) Proxy.newProxyInstance(
                GradleWorkarounds.class.getClassLoader(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.provider` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
        return (ListProperty<T>) Proxy.newProxyInstance(
                GradleWorkarounds.class.getClassLoader(),
                new Class<?>[] {org.gradle.api.internal.provider.CollectionProviderInternal.class, ListProperty.class},
                (_proxy, method, args) -> {
                    // Find matching method on CollectionPropertyInternal
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.provider` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
                    // org.gradle.api.internal.provider.CollectionProviderInternal
                    if (method.getDeclaringClass()
                            == org.gradle.api.internal.provider.CollectionProviderInternal.class) {
                        if (method.getName().equals("getElementType")) {
                            // Proxy to `propertyInternalClass` which we know DefaultListProperty implements.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.artifacts.configurations` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java

    static boolean isFailOnVersionConflict(Configuration conf) {
        org.gradle.api.internal.artifacts.configurations.ConflictResolution conflictResolution =
                ((org.gradle.api.internal.artifacts.configurations.ResolutionStrategyInternal)
                                conf.getResolutionStrategy())
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.artifacts.configurations` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
    static boolean isFailOnVersionConflict(Configuration conf) {
        org.gradle.api.internal.artifacts.configurations.ConflictResolution conflictResolution =
                ((org.gradle.api.internal.artifacts.configurations.ResolutionStrategyInternal)
                                conf.getResolutionStrategy())
                        .getConflictResolution();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.artifacts.configurations` is unnecessary, and can be replaced with an import
in `src/main/java/com/palantir/gradle/versions/GradleWorkarounds.java`
#### Snippet
```java
                                conf.getResolutionStrategy())
                        .getConflictResolution();
        return conflictResolution == org.gradle.api.internal.artifacts.configurations.ConflictResolution.strict;
    }

```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `FuzzyPatternResolver` has no concrete subclass
in `src/main/java/com/palantir/gradle/versions/FuzzyPatternResolver.java`
#### Snippet
```java
@Value.Immutable
@SuppressWarnings("checkstyle:DesignForExtension")
public abstract class FuzzyPatternResolver {
    protected FuzzyPatternResolver() {}

```

### AbstractClassNeverImplemented
Abstract class `MyModuleIdentifier` has no concrete subclass
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleIdentifier.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class MyModuleIdentifier implements ModuleIdentifier {
    @Override
    @Parameter
```

### AbstractClassNeverImplemented
Abstract class `MyModuleVersionIdentifier` has no concrete subclass
in `src/main/java/com/palantir/gradle/versions/internal/MyModuleVersionIdentifier.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class MyModuleVersionIdentifier implements ModuleVersionIdentifier {

    public static MyModuleVersionIdentifier copyOf(ModuleVersionIdentifier moduleVersion) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/palantir/gradle/versions/VersionsLockExtension.java`
#### Snippet
```java
        private final SetProperty<String> configurations;

        public ScopeConfigurer(SetProperty<String> configurations) {
            this.configurations = configurations;
        }
```

### BoundedWildcard
Can generalize to `? super ScopeConfigurer`
in `src/main/java/com/palantir/gradle/versions/VersionsLockExtension.java`
#### Snippet
```java
    }

    public final void test(Action<ScopeConfigurer> action) {
        action.execute(testConfigurer);
    }
```

### BoundedWildcard
Can generalize to `? super ScopeConfigurer`
in `src/main/java/com/palantir/gradle/versions/VersionsLockExtension.java`
#### Snippet
```java
    }

    public final void production(Action<ScopeConfigurer> action) {
        action.execute(productionConfigurer);
    }
```

### BoundedWildcard
Can generalize to `? extends ValueDifference`
in `src/main/java/com/palantir/gradle/versions/VerifyLocksTask.java`
#### Snippet
```java
    }

    private static String formatDependencyDifferences(Map<MyModuleIdentifier, ValueDifference<Line>> differing) {
        return differing.entrySet().stream()
                .map(diff -> String.format(
```

### BoundedWildcard
Can generalize to `? super LockState`
in `src/main/java/com/palantir/gradle/versions/VerifyLocksTask.java`
#### Snippet
```java
    }

    private void verifyLocksForScope(Function<LockState, SortedMap<MyModuleIdentifier, Line>> getterForScope) {
        MapDifference<MyModuleIdentifier, Line> difference = Maps.difference(
                getterForScope.apply(persistedLockState.get()), getterForScope.apply(currentLockState.get()));
```

### BoundedWildcard
Can generalize to `? extends SortedMap`
in `src/main/java/com/palantir/gradle/versions/VerifyLocksTask.java`
#### Snippet
```java
    }

    private void verifyLocksForScope(Function<LockState, SortedMap<MyModuleIdentifier, Line>> getterForScope) {
        MapDifference<MyModuleIdentifier, Line> difference = Maps.difference(
                getterForScope.apply(persistedLockState.get()), getterForScope.apply(currentLockState.get()));
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/palantir/gradle/versions/GradleComparators.java`
#### Snippet
```java
            .thenComparing(ComponentIdentifier::getDisplayName);

    static <A, T> Optional<T> tryCast(Class<T> to, A value) {
        return to.isInstance(value) ? Optional.of(to.cast(value)) : Optional.empty();
    }
```

### BoundedWildcard
Can generalize to `? extends MyModuleVersionIdentifier`
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
    }

    public static Stream<Line> computeLines(Map<MyModuleVersionIdentifier, Dependents> deps) {
        return deps.entrySet().stream().map(entry -> componentWithDependentsToLine(entry.getKey(), entry.getValue()));
    }
```

### BoundedWildcard
Can generalize to `? extends Dependents`
in `src/main/java/com/palantir/gradle/versions/lockstate/LockStates.java`
#### Snippet
```java
    }

    public static Stream<Line> computeLines(Map<MyModuleVersionIdentifier, Dependents> deps) {
        return deps.entrySet().stream().map(entry -> componentWithDependentsToLine(entry.getKey(), entry.getValue()));
    }
```

### BoundedWildcard
Can generalize to `? extends FullLockState`
in `src/main/java/com/palantir/gradle/versions/WhyDependencyTask.java`
#### Snippet
```java
    }

    public final void fullLockState(Provider<FullLockState> provider) {
        this.fullLockState.set(provider);
    }
```

### BoundedWildcard
Can generalize to `? extends LockedConfigurations`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
            Project rootProject,
            Path gradleLockfile,
            Map<Project, LockedConfigurations> lockedConfigurations,
            ProjectDependency locksDependency) {

```

### BoundedWildcard
Can generalize to `? extends DependencyConstraint`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
            Project subproject,
            ProjectDependency locksDependency,
            List<DependencyConstraint> publishableConstraints,
            LockedConfigurations lockedConfigurations) {
        Configuration locksConfiguration = subproject
```

### BoundedWildcard
Can generalize to `? extends Configuration`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
     */
    private static void addConfigurationDependencies(
            Project project, Configuration fromConf, Set<Configuration> toConfs) {
        toConfs.forEach(toConf -> fromConf.getDependencies().add(createConfigurationDependency(project, toConf)));
    }
```

### BoundedWildcard
Can generalize to `? super ResolvedComponentResult`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
    private static GcvScope getScope(
            ResolvedComponentResult component,
            Map<ResolvedComponentResult, GcvScope> scopeCache,
            DirectDependencyScopes directDependencyScopes) {
        Optional<GcvScope> cached = Optional.ofNullable(scopeCache.get(component));
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
            Project currentProject,
            DependencySet dependencySet,
            Map<Configuration, String> copiedConfigurationsCache,
            DirectDependencyScopes.Builder dependencyScopes,
            GcvScope scope) {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/ConsistentVersionsPlugin.java`
#### Snippet
```java
        project.getPluginManager().apply(GetVersionPlugin.class);

        project.allprojects(proj -> {
            proj.getPluginManager().withPlugin("java", _plugin -> {
                proj.getPluginManager().apply(FixLegacyJavaConfigurationsPlugin.class);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/ConsistentVersionsPlugin.java`
#### Snippet
```java

        project.allprojects(proj -> {
            proj.getPluginManager().withPlugin("java", _plugin -> {
                proj.getPluginManager().apply(FixLegacyJavaConfigurationsPlugin.class);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/FixLegacyJavaConfigurationsPlugin.java`
#### Snippet
```java
                .map(project.getConfigurations()::findByName)
                .filter(Objects::nonNull)
                .forEach(conf -> {
                    injectVersions(
                            conf,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/WhyDependencyTask.java`
#### Snippet
```java

                getLogger().lifecycle("{}", key);
                LockStates.prettyPrintConstraints(dependents).forEach(pretty -> {
                    getLogger().lifecycle("\t{}", pretty);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsPropsPlugin.java`
#### Snippet
```java

    private static void configureResolvedVersionsWithVersionMapping(Project project) {
        project.getPluginManager().withPlugin("maven-publish", _plugin -> {
            project.getExtensions()
                    .getByType(PublishingExtension.class)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsPropsPlugin.java`
#### Snippet
```java
                    .getPublications()
                    .withType(MavenPublication.class)
                    .configureEach(publication -> publication.versionMapping(mapping -> {
                        mapping.allVariants(VariantVersionMappingStrategy::fromResolutionResult);
                    }));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsPropsPlugin.java`
#### Snippet
```java
                });

        project.getConfigurations().configureEach(conf -> {
            setupConfiguration(project, extension, rootConfiguration.get(), versionsProps, conf);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        // Parallel 'resolveConfigurations' sometimes breaks unless we force the root one to run first.
        if (rootProject != project) {
            project.getPluginManager().withPlugin("com.palantir.configuration-resolver", _plugin -> {
                project.getTasks().named("resolveConfigurations", task -> task.mustRunAfter(":resolveConfigurations"));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
            attributesSchema.attribute(GCV_SCOPE_ATTRIBUTE);
            attributesSchema.attribute(GCV_USAGE_ATTRIBUTE);
            attributesSchema.attribute(Usage.USAGE_ATTRIBUTE, strategy -> {
                strategy.getCompatibilityRules().add(EverythingIsCompatibleWithConsistentVersionsUsage.class);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        locksDependency.capabilities(moduleDependencyCapabilitiesHandler ->
                moduleDependencyCapabilitiesHandler.requireCapabilities(GCV_LOCKS_CAPABILITY));
        locksDependency.attributes(attrs -> {
            attrs.attribute(Usage.USAGE_ATTRIBUTE, internalUsage);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        // we can't just have the task run the write locks code as we need to write the locks in afterEvaluate.
        project.getTasks()
                .register(WRITE_VERSIONS_LOCKS_TASK, WriteVersionsLocksMarkerTask.class, writeVersionsLock -> {
                    writeVersionsLock.getOutputs().upToDateWhen(_ignored -> false);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java

            // Wire up the locks from the lock file into the strict locks platform.
            gcvLocksConfiguration.configure(conf -> {
                conf.getDependencyConstraints()
                        .addAll(constructConstraintsFromLockFile(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        // apiElements etc. (Their constraints get published so we don't want to start publishing strictly locked
        // constraints)
        result.allConfigurations().forEach(conf -> {
            Preconditions.checkArgument(
                    !conf.isCanBeConsumed() && conf.isCanBeResolved(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        Multimap<String, Project> coordinateDuplicates = LinkedHashMultimap.create();
        Set<Project> subprojectsLeft = new HashSet<>(project.getSubprojects());
        project.subprojects(subproject -> {
            subproject.afterEvaluate(sub -> {
                if (haveSameGroupAndName(project, sub)) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java
        });

        project.subprojects(subproject -> {
            subproject.afterEvaluate(sub -> {
                sub.getPluginManager().withPlugin("nebula.dependency-recommender", _plugin -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/versions/VersionsLockPlugin.java`
#### Snippet
```java

        project.subprojects(subproject -> {
            subproject.afterEvaluate(sub -> {
                sub.getPluginManager().withPlugin("nebula.dependency-recommender", _plugin -> {
                    RecommendationProviderContainer container =
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

