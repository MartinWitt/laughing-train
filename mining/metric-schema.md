# metric-schema 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 6 | false |
| UnstableApiUsage | 6 | false |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| BlockingMethodInNonBlockingContext | 4 | false |
| TrivialStringConcatenation | 2 | false |
| AutoCloseableResource | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| DataFlowIssue | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
            MetricDefinition definition,
            MetricNamespace metricNamespace) {
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ZipFile' used without 'try'-with-resources statement
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CreateMetricsManifestTask.java`
#### Snippet
```java

        try {
            ZipFile zipFile = new ZipFile(artifact.getFile());
            ZipEntry manifestEntry = zipFile.getEntry(MetricSchemaPlugin.METRIC_SCHEMA_RESOURCE);
            if (manifestEntry == null) {
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `metric-schema-java/src/main/java/com/palantir/metric/schema/UtilityGenerator.java`
#### Snippet
```java
        MethodSpec buildMethod = buildMethodBuilder.build();
        List<Modifier> modifiers = new ArrayList<>();
        modifiers.addAll(List.of(Modifier.PRIVATE, Modifier.FINAL));
        if (stagedBuilderSpec.isStatic()) {
            modifiers.add(Modifier.STATIC);
```

## RuleId[id=Deprecation]
### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
            Project project, Provider<Directory> metricSchemaDir, SourceDirectorySet sourceSet) {
        Provider<RegularFile> schemaFile = metricSchemaDir.map(dir -> dir.file(METRIC_SCHEMA_RESOURCE));
        JavaPluginConvention javaPlugin = project.getConvention().getPlugin(JavaPluginConvention.class);
        TaskProvider<CompileMetricSchemaTask> compileMetricSchema = project.getTasks()
                .register(COMPILE_METRIC_SCHEMA, CompileMetricSchemaTask.class, task -> {
```

### Deprecation
'getConvention()' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
            Project project, Provider<Directory> metricSchemaDir, SourceDirectorySet sourceSet) {
        Provider<RegularFile> schemaFile = metricSchemaDir.map(dir -> dir.file(METRIC_SCHEMA_RESOURCE));
        JavaPluginConvention javaPlugin = project.getConvention().getPlugin(JavaPluginConvention.class);
        TaskProvider<CompileMetricSchemaTask> compileMetricSchema = project.getTasks()
                .register(COMPILE_METRIC_SCHEMA, CompileMetricSchemaTask.class, task -> {
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java
            Project project, Provider<Directory> metricSchemaDir, SourceDirectorySet sourceSet) {
        Provider<RegularFile> schemaFile = metricSchemaDir.map(dir -> dir.file(METRIC_SCHEMA_RESOURCE));
        JavaPluginConvention javaPlugin = project.getConvention().getPlugin(JavaPluginConvention.class);
        TaskProvider<CompileMetricSchemaTask> compileMetricSchema = project.getTasks()
                .register(COMPILE_METRIC_SCHEMA, CompileMetricSchemaTask.class, task -> {
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java

    private static void configureJavaSource(Project project, Provider<Directory> outputDir) {
        JavaPluginConvention javaPlugin = project.getConvention().findPlugin(JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(outputDir);
    }
```

### Deprecation
'getConvention()' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java

    private static void configureJavaSource(Project project, Provider<Directory> outputDir) {
        JavaPluginConvention javaPlugin = project.getConvention().findPlugin(JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(outputDir);
    }
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/MetricSchemaPlugin.java`
#### Snippet
```java

    private static void configureJavaSource(Project project, Provider<Directory> outputDir) {
        JavaPluginConvention javaPlugin = project.getConvention().findPlugin(JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(outputDir);
    }
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
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CheckMetricMarkdownTask.java`
#### Snippet
```java
            .value(getProject()
                    .provider(() ->
                            "" + getProject().getGroup() + ':' + getProject().getName()));

    @InputFile
```

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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `metric-schema-lang/src/main/java/com/palantir/metric/schema/lang/Validator.java`
#### Snippet
```java
        Set<String> duplicateNamespaceTagNames = tagDefinition.stream()
                .map(TagDefinition::getName)
                .filter(namespaceTagNames::contains)
                .collect(Collectors.toSet());
        checkArgumentWithErrorContext(
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
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java
    private static void clearOutput(Path outputPath) {
        try {
            MoreFiles.deleteRecursively(outputPath, RecursiveDeleteOption.ALLOW_INSECURE);
        } catch (IOException e) {
            throw new SafeRuntimeException("Unable to clean output directory", SafeArg.of("output", outputPath));
```

### UnstableApiUsage
'deleteRecursively(java.nio.file.Path, com.google.common.io.RecursiveDeleteOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java
    private static void clearOutput(Path outputPath) {
        try {
            MoreFiles.deleteRecursively(outputPath, RecursiveDeleteOption.ALLOW_INSECURE);
        } catch (IOException e) {
            throw new SafeRuntimeException("Unable to clean output directory", SafeArg.of("output", outputPath));
```

### UnstableApiUsage
'com.google.common.io.RecursiveDeleteOption' is marked unstable with @Beta
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java
    private static void clearOutput(Path outputPath) {
        try {
            MoreFiles.deleteRecursively(outputPath, RecursiveDeleteOption.ALLOW_INSECURE);
        } catch (IOException e) {
            throw new SafeRuntimeException("Unable to clean output directory", SafeArg.of("output", outputPath));
```

### UnstableApiUsage
'ALLOW_INSECURE' is declared in unstable enum 'com.google.common.io.RecursiveDeleteOption' marked with @Beta
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricSchemaTask.java`
#### Snippet
```java
    private static void clearOutput(Path outputPath) {
        try {
            MoreFiles.deleteRecursively(outputPath, RecursiveDeleteOption.ALLOW_INSECURE);
        } catch (IOException e) {
            throw new SafeRuntimeException("Unable to clean output directory", SafeArg.of("output", outputPath));
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

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CheckMetricMarkdownTask.java`
#### Snippet
```java
                    markdown.getName(), getName()));
        } else {
            String fromDisk = Files.readString(markdown.toPath().toAbsolutePath());
            Preconditions.checkState(
                    fromDisk.equals(upToDateContents),
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/GenerateMetricMarkdownTask.java`
#### Snippet
```java

        String upToDateContents = MarkdownRenderer.render(localCoordinates.get(), schemas);
        Files.writeString(markdown.toPath(), upToDateContents);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `metric-schema-java/src/main/java/com/palantir/metric/schema/SchemaParser.java`
#### Snippet
```java

    List<MetricSchema> parseFile(Path file) {
        try (InputStream stream = Files.newInputStream(file)) {
            return mapper.readValue(stream, new TypeReference<List<MetricSchema>>() {});
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-metric-schema/src/main/java/com/palantir/metric/schema/gradle/CreateMetricsManifestTask.java`
#### Snippet
```java
            }

            try (InputStream is = zipFile.getInputStream(manifestEntry)) {
                return Optional.of(ObjectMappers.mapper.readValue(is, new TypeReference<List<MetricSchema>>() {}));
            }
```

