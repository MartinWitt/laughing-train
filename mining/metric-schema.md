# metric-schema 
 
# Bad smells
I found 29 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 7 | false |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| TrivialStringConcatenation | 2 | false |
| OptionalContainsCollection | 2 | false |
| UnstableApiUsage | 2 | false |
| IOResource | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| DataFlowIssue | 1 | false |
| CodeBlock2Expr | 1 | true |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'libraryName'
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
            String namespace,
            String metricName,
            Optional<String> libraryName,
            MetricDefinition definition,
            MetricNamespace metricNamespace) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'libraryName'
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
            String namespace,
            MetricNamespace metrics,
            Optional<String> libraryName,
            String packageName,
            ImplementationVisibility visibility) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'libraryName'
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
            String namespace,
            String metricName,
            Optional<String> libraryName,
            MetricNamespace metricNamespace,
            MetricDefinition definition,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'libraryName'
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
            String namespaceName,
            String metricName,
            Optional<String> libraryName,
            MetricDefinition definition,
            MetricNamespace metricNamespace,
```

## RuleId[id=IOResource]
### IOResource
'ZipFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CreateMetricsManifestTask.java`
#### Snippet
```java

        try {
            ZipFile zipFile = new ZipFile(artifact.getFile());
            ZipEntry manifestEntry = zipFile.getEntry(MetricSchemaPlugin.METRIC_SCHEMA_RESOURCE);
            if (manifestEntry == null) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java
    private String defaultLibraryName() {
        String rootProjectName = getProject().getRootProject().getName();
        return rootProjectName.replaceAll("-root$", "");
    }
}
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `metric-schema-java/src/main/java/com/palantir/metric/schema/model/ImplementationVisibility.java`
#### Snippet
```java
                    .add(modifiers)
                    .build()
                    .toArray(new Modifier[0]);
        }
        return modifiers;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `metric-schema-lang/src/main/java/com/palantir/metric/schema/lang/Validator.java`
#### Snippet
```java
        List<SafeArg<?>> allArgs = new ArrayList<>(Arrays.asList(args));
        allArgs.addAll(errorContext);
        Preconditions.checkArgument(expression, message, allArgs.toArray(new Arg[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
        MethodSpec metricNameMethod = MethodSpec.methodBuilder(Custodian.sanitizeName(metricName + "MetricName"))
                .addModifiers(visibility.apply())
                .addModifiers(extraModifiers.toArray(new Modifier[0]))
                .returns(MetricName.class)
                .addCode("return $L;", metricNameBlock)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
        }
        outerBuilder.addType(TypeSpec.classBuilder(Custodian.anyToUpperCamel(stagedBuilderSpec.name()) + "Builder")
                .addModifiers(modifiers.toArray(new Modifier[0]))
                .addSuperinterfaces(stagedBuilderSpec.stages().stream()
                        .map(stage -> ClassName.bestGuess(stageName(stagedBuilderSpec.name(), stage.name())))
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getSourceSets` may produce `NullPointerException`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
    private static void configureJavaSource(Project project, Provider<Directory> outputDir) {
        JavaPluginConvention javaPlugin = project.getConvention().findPlugin(JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(outputDir);
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricMarkdownTask.java`
#### Snippet
```java
            .value(getProject()
                    .provider(() ->
                            "" + getProject().getGroup() + ':' + getProject().getName()));

    @InputFile
```

### TrivialStringConcatenation
Empty string used in concatenation
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CheckMetricMarkdownTask.java`
#### Snippet
```java
            .value(getProject()
                    .provider(() ->
                            "" + getProject().getGroup() + ':' + getProject().getName()));

    @InputFile
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RegularFile`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/ProviderUtils.java`
#### Snippet
```java
public final class ProviderUtils {

    public static Provider<RegularFile> filterNonExistentFile(Project project, Provider<RegularFile> provider) {
        return provider.flatMap(file -> file.getAsFile().exists()
                ? project.provider(() -> file)
```

### BoundedWildcard
Can generalize to `? extends List`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricMarkdownTask.java`
#### Snippet
```java
    }

    private static boolean isEmpty(Map<String, List<MetricSchema>> schemas) {
        return schemas.isEmpty() || schemas.values().stream().allMatch(List::isEmpty);
    }
```

### BoundedWildcard
Can generalize to `? extends List`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CheckMetricMarkdownTask.java`
#### Snippet
```java
    }

    private static boolean isEmpty(Map<String, List<MetricSchema>> schemas) {
        return schemas.isEmpty() || schemas.values().stream().allMatch(List::isEmpty);
    }
```

### BoundedWildcard
Can generalize to `? extends Directory`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
    private static void createManifestTask(
            Project project,
            Provider<Directory> metricSchemaDir,
            TaskProvider<CompileMetricSchemaTask> compileSchemaTask) {
        Provider<RegularFile> manifestFile = metricSchemaDir.map(dir -> dir.file("manifest.json"));
```

### BoundedWildcard
Can generalize to `? extends CompileMetricSchemaTask`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
            Project project,
            Provider<Directory> metricSchemaDir,
            TaskProvider<CompileMetricSchemaTask> compileSchemaTask) {
        Provider<RegularFile> manifestFile = metricSchemaDir.map(dir -> dir.file("manifest.json"));
        Configuration runtimeClasspath = project.getConfigurations().getByName("runtimeClasspath");
```

### BoundedWildcard
Can generalize to `? extends Directory`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java

    private static void configureIdea(
            Project project, TaskProvider<? extends Task> generateMetrics, Provider<Directory> outputDir) {
        project.getPluginManager().withPlugin("idea", _plugin -> {
            project.getTasks().named("ideaModule").configure(task -> task.dependsOn(generateMetrics));
```

### BoundedWildcard
Can generalize to `? extends Directory`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java

    private static TaskProvider<CompileMetricSchemaTask> createCompileSchemaTask(
            Project project, Provider<Directory> metricSchemaDir, SourceDirectorySet sourceSet) {
        Provider<RegularFile> schemaFile = metricSchemaDir.map(dir -> dir.file(METRIC_SCHEMA_RESOURCE));
        JavaPluginConvention javaPlugin = project.getConvention().getPlugin(JavaPluginConvention.class);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `GenerateMetricSchemaTask` has no concrete subclass
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java

@CacheableTask
public abstract class GenerateMetricSchemaTask extends DefaultTask {
    private final Property<String> libraryName =
            getProject().getObjects().property(String.class).value(defaultLibraryName());
```

### AbstractClassNeverImplemented
Abstract class `CompileMetricSchemaTask` has no concrete subclass
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CompileMetricSchemaTask.java`
#### Snippet
```java

@CacheableTask
public abstract class CompileMetricSchemaTask extends DefaultTask {
    @InputFiles
    @PathSensitive(PathSensitivity.RELATIVE)
```

### AbstractClassNeverImplemented
Abstract class `JavaGeneratorArgs` has no concrete subclass
in `metric-schema-java/src/main/java/com/palantir/metric/schema/JavaGeneratorArgs.java`
#### Snippet
```java
        jdkOnly = true,
        get = {"get*", "is*"})
public abstract class JavaGeneratorArgs {

    private static final Predicate<String> LIBRARY_NAME =
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-schema-markdown/src/main/java/com/palantir/metric/schema/markdown/MarkdownRenderer.java`
#### Snippet
```java
                                    .collect(Collectors.joining("`,`", "(`", "`)")));
                }
                tagDefinition.getDocs().ifPresent(docs -> {
                    output.append(": ").append(docs);
                });
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CreateMetricsManifestTask.java`
#### Snippet
```java
    }

    private static Optional<List<MetricSchema>> getExternalMetrics(ComponentIdentifier id, ResolvedArtifact artifact) {
        if (!artifact.getFile().exists()) {
            log.debug("Artifact did not exist: {}", artifact.getFile());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CreateMetricsManifestTask.java`
#### Snippet
```java
    }

    private static Optional<List<MetricSchema>> inferProjectDependencyMetrics(Project dependencyProject) {
        if (!dependencyProject.getPlugins().hasPlugin(MetricSchemaPlugin.class)) {
            return Optional.empty();
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `metric-schema-java/src/main/java/com/palantir/metric/schema/model/ImplementationVisibility.java`
#### Snippet
```java
    public Modifier[] apply(Modifier... modifiers) {
        if (this == PUBLIC) {
            return ImmutableList.<Modifier>builderWithExpectedSize(modifiers.length + 1)
                    .add(Modifier.PUBLIC)
                    .add(modifiers)
```

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `metric-schema-java/src/main/java/com/palantir/metric/schema/Custodian.java`
#### Snippet
```java
    static String anyToUpperUnderscore(String input) {
        Preconditions.checkNotNull(input, "Input string is required");
        return escapeIfNecessary(splitter.splitToStream(input)
                .map(segment -> CaseFormats.estimate(segment)
                        .orElse(CaseFormat.LOWER_CAMEL)
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricMarkdownTask.java`
#### Snippet
```java
        if (isEmpty(schemas)) {
            if (markdown.exists()) {
                markdown.delete();
            }
            return;
```

