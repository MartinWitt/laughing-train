# gradle-conjure 
 
# Bad smells
I found 77 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 12 | true |
| BoundedWildcard | 12 | false |
| AbstractClassNeverImplemented | 9 | false |
| AbstractMethodCallInConstructor | 8 | false |
| NonProtectedConstructorInAbstractClass | 6 | true |
| UnnecessaryFullyQualifiedName | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| RedundantFieldInitialization | 3 | false |
| SimplifyOptionalCallChains | 2 | false |
| DataFlowIssue | 2 | false |
| ObsoleteCollection | 2 | false |
| EmptyMethod | 2 | false |
| ReturnNull | 2 | false |
| UnstableApiUsage | 2 | false |
| UnnecessarySuperQualifier | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RedundantComparatorComparing | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| UnusedAssignment | 1 | false |
| IgnoreResultOfCall | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ChildFirstUrlClassLoader.java`
#### Snippet
```java

        // Consort with the ancestors
        Enumeration<URL> parentResources = super.findResources(name);
        if (parentResources != null) {
            while (parentResources.hasMoreElements()) {
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/OsUtils.java`
#### Snippet
```java

    static String escapeAndWrapArgIfWindows(String argument) {
        return Os.isFamily(Os.FAMILY_WINDOWS) ? ("\"" + argument.replaceAll("\"", "\"\"") + "\"") : argument;
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalCodegenPlugin.java`
#### Snippet
```java
     */
    private static String sanitizePackageName(String group) {
        return group.replaceAll("-", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
        } else if (project.hasProperty(GENERIC_GENERATOR_LANGUAGE_NAMES_PROPERTY)) {
            String names = (String) project.getProperties().get(GENERIC_GENERATOR_LANGUAGE_NAMES_PROPERTY);
            List<String> genericLanguages = Arrays.asList(names.split(",\\s*"));
            return genericLanguages.stream()
                    .map(language -> projectName + "-" + language)
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins` is unnecessary, and can be replaced with an import
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConfigureEndpointVersionBoundsTask.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    private Manifest createManifest(Project project, List<EndpointVersionBound> versions) {
        org.gradle.api.plugins.JavaPluginConvention javaConvention =
                project.getConvention().getPlugin(org.gradle.api.plugins.JavaPluginConvention.class);
        return javaConvention.manifest(manifest -> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins` is unnecessary, and can be replaced with an import
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConfigureEndpointVersionBoundsTask.java`
#### Snippet
```java
    private Manifest createManifest(Project project, List<EndpointVersionBound> versions) {
        org.gradle.api.plugins.JavaPluginConvention javaConvention =
                project.getConvention().getPlugin(org.gradle.api.plugins.JavaPluginConvention.class);
        return javaConvention.manifest(manifest -> {
            String versionBoundsString;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins` is unnecessary, and can be replaced with an import
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    @SuppressWarnings("deprecation")
    static void addGeneratedToMainSourceSet(Project subproj) {
        org.gradle.api.plugins.JavaPluginConvention javaPlugin =
                subproj.getConvention().findPlugin(org.gradle.api.plugins.JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(subproj.files(JAVA_GENERATED_SOURCE_DIRNAME));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins` is unnecessary, and can be replaced with an import
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    static void addGeneratedToMainSourceSet(Project subproj) {
        org.gradle.api.plugins.JavaPluginConvention javaPlugin =
                subproj.getConvention().findPlugin(org.gradle.api.plugins.JavaPluginConvention.class);
        javaPlugin.getSourceSets().getByName("main").getJava().srcDir(subproj.files(JAVA_GENERATED_SOURCE_DIRNAME));
    }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaServiceDependencies.java`
#### Snippet
```java
                    .withType(Jar.class)
                    .named(JavaPlugin.JAR_TASK_NAME)
                    .configure(jar -> {
                        jar.dependsOn(configureEndpointVersionsTask);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePublishPlugin.java`
#### Snippet
```java

        // Configure publishing
        project.getExtensions().configure(PublishingExtension.class, publishing -> {
            publishing.publications(publications -> {
                publications.create(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePublishPlugin.java`
#### Snippet
```java
        // Configure publishing
        project.getExtensions().configure(PublishingExtension.class, publishing -> {
            publishing.publications(publications -> {
                publications.create(
                        "conjure",
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java

    private static void createServiceDependenciesTask(Project project, ConjureProductDependenciesExtension ext) {
        project.getTasks().register(SERVICE_DEPENDENCIES_TASK, GenerateConjureServiceDependenciesTask.class, task -> {
            task.setConjureServiceDependencies(ext::getProductDependencies);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
                // eclipseClasspath is not always registered
            }
            project.getExtensions().configure(EclipseModel.class, eclipseModel -> {
                eclipseModel.classpath(classpath -> {
                    classpath.file(file -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            }
            project.getExtensions().configure(EclipseModel.class, eclipseModel -> {
                eclipseModel.classpath(classpath -> {
                    classpath.file(file -> {
                        file.whenMerged((Classpath cp) -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            project.getExtensions().configure(EclipseModel.class, eclipseModel -> {
                eclipseModel.classpath(classpath -> {
                    classpath.file(file -> {
                        file.whenMerged((Classpath cp) -> {
                            cp.getEntries().stream()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
                eclipseModel.classpath(classpath -> {
                    classpath.file(file -> {
                        file.whenMerged((Classpath cp) -> {
                            cp.getEntries().stream()
                                    .filter(cpe -> cpe instanceof SourceFolder)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    private static void linkPublish(Project project, TaskProvider<?> depTask) {
        // this is the cleanest and most common way to link to the publish task.
        project.getPluginManager().withPlugin("maven-publish", _packagingPlugin -> {
            project.getTasks().named("publish").configure(t -> t.dependsOn(depTask));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
        if (!useFlatProjectStructure) {
            return Maps.filterKeys(project.getChildProjects(), childProjectName -> {
                return childProjectName.startsWith(projectName)
                        && !FIRST_CLASS_GENERATOR_PROJECT_NAMES.contains(
                                extractSubprojectLanguage(projectName, childProjectName));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
        TaskProvider<Task> cleanTask = project.getTasks().named(LifecycleBasePlugin.CLEAN_TASK_NAME);
        // This replicates what the built in gradle CleanRule does, but using task-avoidance APIs
        TaskProvider<Delete> cleanerTask = project.getTasks().register(cleanTaskName, Delete.class, t -> {
            t.delete(creatorTask.map(Task::getOutputs).map(TaskOutputs::getFiles));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            t.delete(creatorTask.map(Task::getOutputs).map(TaskOutputs::getFiles));
        });
        cleanTask.configure(t -> {
            t.dependsOn(cleanerTask);
        });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CompileConjureTypeScriptTask()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
@CacheableTask
public abstract class CompileConjureTypeScriptTask extends ConjureGeneratorTask {
    public CompileConjureTypeScriptTask() {
        Project project = getProject();
        getPackageName().convention(getProject().provider(project::getName));
```

### NonProtectedConstructorInAbstractClass
Constructor `GenerateConjureServiceDependenciesTask()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateConjureServiceDependenciesTask.java`
#### Snippet
```java
    private Supplier<Set<ServiceDependency>> conjureServiceDependencies;

    public GenerateConjureServiceDependenciesTask() {
        getOutputFile().convention(getProject().getLayout().getBuildDirectory().file("service-dependencies.json"));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ConjureGeneratorTask()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureGeneratorTask.java`
#### Snippet
```java
    private Supplier<GeneratorOptions> options;

    public ConjureGeneratorTask() {
        // @TaskAction uses doFirst I think, because other actions prepended using doFirst end up happening AFTER the
        // main task. Intentionally not using a lambda because this breaks Gradle caching
```

### NonProtectedConstructorInAbstractClass
Constructor `ExtractExecutableTask()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
    private FileCollection archive;

    public ExtractExecutableTask() {
        // Memoize this because we are re-using it in the doLast action.
        Supplier<File> tarFile = Suppliers.memoize(this::resolveTarFile);
```

### NonProtectedConstructorInAbstractClass
Constructor `CompileIrTask()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileIrTask.java`
#### Snippet
```java
    private static final String EXECUTABLE = OsUtils.appendDotBatIfWindows("bin/conjure");

    public CompileIrTask() {
        getConjureExtensions().convention(new HashMap<>());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ConjureRunnerResource()` of an abstract class should not be declared 'public'
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
    private final ConjureRunner delegate;

    public ConjureRunnerResource() throws IOException {
        this.delegate =
                createNewRunner(getParameters().getExecutable().getAsFile().get());
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ChildFirstUrlClassLoader.java`
#### Snippet
```java
    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        Vector<URL> resources = new Vector<>();
        // This "child" loader
        Enumeration<URL> childResources = findResources(name);
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ChildFirstUrlClassLoader.java`
#### Snippet
```java
    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        Vector<URL> resources = new Vector<>();
        // This "child" loader
        Enumeration<URL> childResources = findResources(name);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureGeneratorTask.java`
#### Snippet
```java
    @Override
    @PathSensitive(PathSensitivity.RELATIVE)
    public final FileTree getSource() {
        return super.getSource();
    }
```

### EmptyMethod
The method is empty
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalGeneratorTask.java`
#### Snippet
```java
    @Override
    @PathSensitive(PathSensitivity.RELATIVE)
    public final FileTree getSource() {
        return super.getSource();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gradle-conjure-api/src/main/java/com/palantir/gradle/conjure/api/ServiceDependency.java`
#### Snippet
```java

    @JsonProperty("optional")
    private boolean optional = false;

    public String getProductGroup() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java

    private TaskProvider<CompileIrTask> compileIrProvider = null;
    private ConjureExtension conjureExtension = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java
    static final String TASK_GROUP = "Conjure";

    private TaskProvider<CompileIrTask> compileIrProvider = null;
    private ConjureExtension conjureExtension = null;

```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getPackageName()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
    public CompileConjureTypeScriptTask() {
        Project project = getProject();
        getPackageName().convention(getProject().provider(project::getName));
        getPackageVersion()
                .convention(getProject().provider(() -> project.getVersion().toString()));
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getPackageVersion()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
        Project project = getProject();
        getPackageName().convention(getProject().provider(project::getName));
        getPackageVersion()
                .convention(getProject().provider(() -> project.getVersion().toString()));
        doFirst(new Action<Task>() {
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getOutputFile()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateConjureServiceDependenciesTask.java`
#### Snippet
```java

    public GenerateConjureServiceDependenciesTask() {
        getOutputFile().convention(getProject().getLayout().getBuildDirectory().file("service-dependencies.json"));
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getOutputDirectory()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        from((Callable<FileTree>) () -> getProject().tarTree(tarFile.get())); // will get lazily resolved
        eachFile(fcd -> fcd.setRelativePath(stripFirstName(fcd.getRelativePath())));
        into(getOutputDirectory()); // will get lazily resolved

        getExecutable().convention(getOutputDirectory().file(getExecutableName().map(s -> String.format("bin/%s", s))));
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getExecutable()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        into(getOutputDirectory()); // will get lazily resolved

        getExecutable().convention(getOutputDirectory().file(getExecutableName().map(s -> String.format("bin/%s", s))));

        doFirst(new Action<Task>() {
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getOutputDirectory()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        into(getOutputDirectory()); // will get lazily resolved

        getExecutable().convention(getOutputDirectory().file(getExecutableName().map(s -> String.format("bin/%s", s))));

        doFirst(new Action<Task>() {
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getExecutableName()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
        into(getOutputDirectory()); // will get lazily resolved

        getExecutable().convention(getOutputDirectory().file(getExecutableName().map(s -> String.format("bin/%s", s))));

        doFirst(new Action<Task>() {
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getConjureExtensions()` during object construction
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileIrTask.java`
#### Snippet
```java

    public CompileIrTask() {
        getConjureExtensions().convention(new HashMap<>());
    }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
        String projectName = getDerivedProjectName(parentProject, projectSuffix);
        if (!derivedProjectExists(parentProject, projectName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
                                    .set(project.provider(options::get)
                                            .map(opts ->
                                                    opts.has("packageName") ? (String) opts.get("packageName") : null)
                                            .orElse(compileConjureTypeScript.flatMap(
                                                    CompileConjureTypeScriptTask::getPackageName)));
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java

            try {
                String[] args = combinedArgs.toArray(new String[] {});
                mainMethod.invoke(null, new Object[] {args});
            } catch (Throwable t) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateConjureServiceDependenciesTask.java`
#### Snippet
```java
    public abstract RegularFileProperty getOutputFile();

    final void setConjureServiceDependencies(Supplier<Set<ServiceDependency>> conjureServiceDependencies) {
        this.conjureServiceDependencies = conjureServiceDependencies;
    }
```

### BoundedWildcard
Can generalize to `? extends CompileIrTask`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java
    }

    private static void createOutgoingConfiguration(Project project, TaskProvider<CompileIrTask> compileIr) {
        Configuration conjureIr = project.getConfigurations().create(CONJURE_IR_CONFIGURATION, conf -> {
            conf.setCanBeResolved(false);
```

### BoundedWildcard
Can generalize to `? extends Copy`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureBasePlugin.java`
#### Snippet
```java
            ConjureProductDependenciesExtension pdepsExtension,
            ConjureExtension conjureExtension,
            TaskProvider<Copy> copyConjureSourcesTask) {
        TaskProvider<ExtractExecutableTask> extractCompilerTask = ExtractConjurePlugin.applyConjureCompiler(project);

```

### BoundedWildcard
Can generalize to `? extends ExtractExecutableTask`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalCodegenPlugin.java`
#### Snippet
```java
            Project project,
            ConjureExtension extension,
            TaskProvider<ExtractExecutableTask> extractJavaTask,
            TaskProvider<Copy> extractConjureIr) {
        ConjurePlugin.ignoreFromCheckUnusedDependencies(project);
```

### BoundedWildcard
Can generalize to `? extends Copy`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalCodegenPlugin.java`
#### Snippet
```java
            ConjureExtension extension,
            TaskProvider<ExtractExecutableTask> extractJavaTask,
            TaskProvider<Copy> extractConjureIr) {
        ConjurePlugin.ignoreFromCheckUnusedDependencies(project);
        ConjurePlugin.addGeneratedToMainSourceSet(project);
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/RenderGeneratorOptions.java`
#### Snippet
```java
    }

    public static List<String> toArgs(Map<String, Object> properties, Map<String, Supplier<Object>> requiredOptions) {
        ImmutableMap.Builder<String, Object> resolvedProperties =
                ImmutableMap.<String, Object>builder().putAll(properties);
```

### BoundedWildcard
Can generalize to `? super String`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    private static void setupGenericConjureProjects(
            Project project,
            Function<String, GeneratorOptions> getGenericOptions,
            TaskProvider<?> compileConjure,
            TaskProvider<?> compileIrTask,
```

### BoundedWildcard
Can generalize to `? extends T`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
    }

    private static <T> Set<T> mutableSetWithExtraEntry(Set<T> set, T extraItem) {
        Set<T> newSet = new LinkedHashSet<>(set);
        newSet.add(extraItem);
```

### BoundedWildcard
Can generalize to `? extends ExtractExecutableTask`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            TaskProvider<?> compileIrTask,
            ConjureProductDependenciesExtension productDependencyExt,
            TaskProvider<ExtractExecutableTask> extractJavaTask,
            BiConsumer<Project, Supplier<GeneratorOptions>> extraConfig) {
        String projectName = getDerivedProjectName(parentProject, projectSuffix);
```

### BoundedWildcard
Can generalize to `? super Project`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            ConjureProductDependenciesExtension productDependencyExt,
            TaskProvider<ExtractExecutableTask> extractJavaTask,
            BiConsumer<Project, Supplier<GeneratorOptions>> extraConfig) {
        String projectName = getDerivedProjectName(parentProject, projectSuffix);
        if (!derivedProjectExists(parentProject, projectName)) {
```

### BoundedWildcard
Can generalize to `? super Supplier`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            ConjureProductDependenciesExtension productDependencyExt,
            TaskProvider<ExtractExecutableTask> extractJavaTask,
            BiConsumer<Project, Supplier<GeneratorOptions>> extraConfig) {
        String projectName = getDerivedProjectName(parentProject, projectSuffix);
        if (!derivedProjectExists(parentProject, projectName)) {
```

### BoundedWildcard
Can generalize to `? extends GenerateConjureServiceDependenciesTask`
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjurePlugin.java`
#### Snippet
```java
            TaskProvider<?> compileConjure,
            TaskProvider<?> compileIrTask,
            TaskProvider<GenerateConjureServiceDependenciesTask> productDependencyTask) {
        String typescriptProjectName = project.getName() + "-typescript";
        if (derivedProjectExists(project, typescriptProjectName)) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ConjureLocalGenerateGenericTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureLocalGenerateGenericTask.java`
#### Snippet
```java
import java.util.regex.Pattern;

public abstract class ConjureLocalGenerateGenericTask extends ConjureLocalGenerateTask {

    private static final Pattern PATTERN =
```

### AbstractClassNeverImplemented
Abstract class `CompileConjurePythonTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjurePythonTask.java`
#### Snippet
```java

@CacheableTask
public abstract class CompileConjurePythonTask extends ConjureGeneratorTask {

    @Override
```

### AbstractClassNeverImplemented
Abstract class `CompileConjureTypeScriptTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java

@CacheableTask
public abstract class CompileConjureTypeScriptTask extends ConjureGeneratorTask {
    public CompileConjureTypeScriptTask() {
        Project project = getProject();
```

### AbstractClassNeverImplemented
Abstract class `ConjureLocalGenerateTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureLocalGenerateTask.java`
#### Snippet
```java

@CacheableTask
public abstract class ConjureLocalGenerateTask extends ConjureGeneratorTask {

    @Override
```

### AbstractClassNeverImplemented
Abstract class `GenerateConjureServiceDependenciesTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/GenerateConjureServiceDependenciesTask.java`
#### Snippet
```java
import org.gradle.api.tasks.TaskAction;

public abstract class GenerateConjureServiceDependenciesTask extends DefaultTask {
    private static final Pattern GROUP_PATTERN = Pattern.compile("^[^:@?\\s]+");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[^:@?\\s]+");
```

### AbstractClassNeverImplemented
Abstract class `ConjureGeneratorTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureGeneratorTask.java`
#### Snippet
```java

@CacheableTask
public abstract class ConjureGeneratorTask extends SourceTask {
    private Supplier<GeneratorOptions> options;

```

### AbstractClassNeverImplemented
Abstract class `ExtractExecutableTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ExtractExecutableTask.java`
#### Snippet
```java
import org.gradle.api.tasks.TaskProvider;

public abstract class ExtractExecutableTask extends Sync {
    private FileCollection archive;

```

### AbstractClassNeverImplemented
Abstract class `CompileIrTask` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileIrTask.java`
#### Snippet
```java

@CacheableTask
public abstract class CompileIrTask extends DefaultTask {
    private static final String EXECUTABLE = OsUtils.appendDotBatIfWindows("bin/conjure");

```

### AbstractClassNeverImplemented
Abstract class `ConjureRunnerResource` has no concrete subclass
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureRunnerResource.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public abstract class ConjureRunnerResource implements BuildService<Params>, Closeable {

    private static final Logger log = LoggerFactory.getLogger(ConjureRunnerResource.class);
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

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.base.Utf8' is marked unstable with @Beta
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ReverseEngineerJavaStartScript.java`
#### Snippet
```java
        try {
            byte[] bytes = Files.readAllBytes(script);
            if (Utf8.isWellFormed(bytes)) {
                return Optional.of(new String(bytes, StandardCharsets.UTF_8));
            } else {
```

### UnstableApiUsage
'isWellFormed(byte\[\])' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `gradle-conjure/src/main/java/com/palantir/gradle/conjure/ReverseEngineerJavaStartScript.java`
#### Snippet
```java
        try {
            byte[] bytes = Files.readAllBytes(script);
            if (Utf8.isWellFormed(bytes)) {
                return Optional.of(new String(bytes, StandardCharsets.UTF_8));
            } else {
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

