# gradle-conjure 
 
# Bad smells
I found 36 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 10 | false |
| BlockingMethodInNonBlockingContext | 10 | false |
| SimplifyOptionalCallChains | 2 | false |
| DataFlowIssue | 2 | false |
| DanglingJavadoc | 2 | false |
| AutoCloseableResource | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| FieldMayBeFinal | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RedundantComparatorComparing | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnusedAssignment | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| IgnoreResultOfCall | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Unloaded' used without 'try'-with-resources statement
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
                                            .method(ElementMatchers.is(System.class.getMethod("exit", int.class)))
                                            .replaceWith(GradleExecStubs.getStubMethod())))
                    .make(typePool)
                    .load(classLoader, ClassLoadingStrategy.Default.INJECTION)
                    .getLoaded();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileIrTask.java`
#### Snippet
```java
            Map<Object, Object> extData = new HashMap<>();
            if (getExtensionsFile().isPresent()) {
                extData = GenerateConjureServiceDependenciesTask.jsonMapper.readValue(
                        getExtensionsFile().getAsFile().get(), Map.class);
            }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ReverseEngineerJavaStartScript.java`
#### Snippet
```java
    static Optional<StartScriptInfo> maybeParseStartScript(Path script) {
        Optional<String> maybeString = readFileToString(script);
        if (!maybeString.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateConjureServiceDependenciesTask.java`
#### Snippet
```java
        Preconditions.checkNotNull(serviceDependency.getMaximumVersion(), "maximum version must be specified");
        if (!SlsVersionMatcher.safeValueOf(serviceDependency.getMaximumVersion())
                .isPresent()) {
            throw new IllegalArgumentException("maximumVersion must be valid SLS version or version matcher: "
                    + serviceDependency.getMaximumVersion());
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
`null` is returned by the method declared as @NonNullApi
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
                                    .set(project.provider(options::get)
                                            .map(opts ->
                                                    opts.has("packageName") ? (String) opts.get("packageName") : null)
                                            .orElse(compileConjureTypeScript.flatMap(
                                                    CompileConjureTypeScriptTask::getPackageName)));
```

### DataFlowIssue
Method invocation `getSourceSets` may produce `NullPointerException`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
        org.gradle.api.plugins.JavaPluginConvention javaPlugin =
                subproj.getConvention().findPlugin(org.gradle.api.plugins.JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(subproj.files(JAVA_GENERATED_SOURCE_DIRNAME));
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `camelCase` may be 'final'
in `gradle-conjure-api/src/main/java/com/palantir/gradle/conjure/api/GeneratorOptions.java`
#### Snippet
```java

    /** Keys must be defined in camelCase. */
    private static Predicate<String> camelCase =
            Pattern.compile("[a-z][a-zA-Z0-9]*").asPredicate();

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ReverseEngineerJavaStartScript.java`
#### Snippet
```java
     * com.palantir.conjure.cli.ConjureCli "$APP_ARGS"}.
     */
    private static final Pattern MAIN_CLASS_REGEX = Pattern.compile("-classpath [^ ]+ (?:\\\\\n)? *([a-zA-Z\\.]+)");

    static Optional<StartScriptInfo> maybeParseStartScript(Path script) {
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/RenderGeneratorOptions.java`
#### Snippet
```java

        return resolvedProperties.buildOrThrow().entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(entry -> {
                    Object value = entry.getValue();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `writeGitignoreTask` is redundant
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    static TaskProvider<WriteGitignoreTask> createWriteGitignoreTask(
            Project project, String taskName, File outputDir, String contents) {
        TaskProvider<WriteGitignoreTask> writeGitignoreTask = project.getTasks()
                .register(taskName, WriteGitignoreTask.class, task -> {
                    task.setOutputDirectory(outputDir);
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `gradle-conjure-api/src/main/java/com/palantir/gradle/conjure/api/EndpointMinimumVersion.java`
#### Snippet
```java

@Deprecated
/**
 * @deprecated  As of release 5.13.0, replaced by {@link #EndpointVersionBound}
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/EndpointMinimumVersions.java`
#### Snippet
```java
@JsonDeserialize(as = ImmutableEndpointMinimumVersions.class)
@Deprecated
/**
 * @deprecated  As of release 5.13.0, replaced by {@link #EndpointVersionBounds}
 */
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `compileIr` initializer `null` is redundant
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePublishPlugin.java`
#### Snippet
```java

    private TaskProvider<CompileIrTask> getCompileIrTask(Project project) {
        TaskProvider<CompileIrTask> compileIr = null;
        try {
            compileIr = project.getTasks().named(ConjurePlugin.CONJURE_IR, CompileIrTask.class);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GradleExecUtils.java`
#### Snippet
```java
                            new Action<BuildServiceSpec<Params>>() {
                                @Override
                                public void execute(BuildServiceSpec<Params> spec) {
                                    spec.getParameters().getExecutable().set(executable);
                                }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java
                    task.doFirst(new Action<Task>() {
                        @Override
                        public void execute(Task _task) {
                            try {
                                FileUtils.deleteDirectory(buildDir);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureGeneratorTask.java`
#### Snippet
```java
        doLast(new Action<Task>() {
            @Override
            public void execute(Task _task) {
                compileFiles();
            }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureGeneratorTask.java`
#### Snippet
```java
    @Override
    @PathSensitive(PathSensitivity.RELATIVE)
    public final FileTree getSource() {
        return super.getSource();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalGeneratorTask.java`
#### Snippet
```java
    @Override
    @PathSensitive(PathSensitivity.RELATIVE)
    public final FileTree getSource() {
        return super.getSource();
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
        doFirst(new Action<Task>() {
            @Override
            public void execute(Task task) {
                ConfigurableFileTree fileTree =
                        task.getProject().fileTree(CompileConjureTypeScriptTask.this.getOutputDirectory());
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        doLast(new Action<Task>() {
            @Override
            public void execute(Task _task) {
                getLogger().info("Extracted into {}", getOutputDirectory());
                // Ensure the executable exists
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
                getProject().tarTree(tarFile.get()).visit(new FileVisitor() {
                    @Override
                    public void visitDir(FileVisitDetails dirDetails) {
                        // Note: If root dir contains only another dir (e.g. a/b), we won't get called with just that
                        // root dir 'a', but with 'a/b' directly. Hence, we look at all dirs and extract their first
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java

                    @Override
                    public void visitFile(FileVisitDetails _fileDetails) {}
                });
                if (rootDirectories.size() != 1) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        doFirst(new Action<Task>() {
            @Override
            public void execute(Task _task) {
                Set<String> rootDirectories = new HashSet<>();
                getProject().tarTree(tarFile.get()).visit(new FileVisitor() {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalCodegenPlugin.java`
#### Snippet
```java
    /**
     * Maven groups can have dashes, java packages can't.
     * https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html.
     */
    private static String sanitizePackageName(String group) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
                        task.getProject().fileTree(CompileConjureTypeScriptTask.this.getOutputDirectory());
                fileTree.exclude("node_modules/**/*");
                fileTree.forEach(File::delete);
            }
        });
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjurePythonTask.java`
#### Snippet
```java
                    .orElseThrow(() -> new InvalidUserDataException("Cannot specify commit distance without hash"));
            // We prefix 'g' to the hash because conda strips leading zeros!!
            version.append("+").append(distance).append(".").append("g" + hash);
        });
        getGroup(matcher, "dirty").ifPresent(dirty -> version.append('.').append(dirty));
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ChildFirstUrlClassLoader.java`
#### Snippet
```java
        Vector<URL> resources = new Vector<>();
        // This "child" loader
        Enumeration<URL> childResources = findResources(name);
        if (childResources != null) {
            while (childResources.hasMoreElements()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ChildFirstUrlClassLoader.java`
#### Snippet
```java

        // Consort with the ancestors
        Enumeration<URL> parentResources = super.findResources(name);
        if (parentResources != null) {
            while (parentResources.hasMoreElements()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateNpmrcTask.java`
#### Snippet
```java

        try {
            Files.writeString(outputFile.getAsFile().get().toPath(), npmRcContents, StandardCharsets.UTF_8);
        } catch (@DoNotLog IOException e) {
            throw new SafeRuntimeException("Error writing npmrc file");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateNpmrcTask.java`
#### Snippet
```java
        try {
            HttpResponse<NpmTokenResponse> response = HttpClient.newHttpClient()
                    .send(
                            HttpRequest.newBuilder()
                                    .header(HttpHeaders.ACCEPT, "application/json")
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/WriteGitignoreTask.java`
#### Snippet
```java
    @TaskAction
    public final void compileFiles() throws IOException {
        Files.createDirectories(outputFile.getParent());

        Files.write(outputFile, contents.getBytes(StandardCharsets.UTF_8));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/WriteGitignoreTask.java`
#### Snippet
```java
        Files.createDirectories(outputFile.getParent());

        Files.write(outputFile, contents.getBytes(StandardCharsets.UTF_8));
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ReverseEngineerJavaStartScript.java`
#### Snippet
```java
    private static Optional<String> readFileToString(Path script) {
        try {
            byte[] bytes = Files.readAllBytes(script);
            if (Utf8.isWellFormed(bytes)) {
                return Optional.of(new String(bytes, StandardCharsets.UTF_8));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
    @Override
    public final void close() throws IOException {
        delegate.close();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            classLoader.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
            } finally {
                if (classLoaderMustBeClosed) {
                    classLoader.close();
                }
            }
```

