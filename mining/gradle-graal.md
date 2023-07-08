# gradle-graal 
 
# Bad smells
I found 18 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpRedundantEscape | 6 | false |
| ConstantValue | 3 | false |
| NullableProblems | 2 | false |
| DuplicatedCode | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| FieldMayBeFinal | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/palantir/gradle/graal/GradleGraalPlugin.java`
#### Snippet
```java
            task.setOutputName(extension.getOutputName());
            task.setGraalVersion(extension.getGraalVersion());
            task.setJavaVersion(extension.getJavaVersion());
            task.setWindowsVsVarsPath(extension.getWindowsVsVarsPath());
            task.setJarFile(jar.map(j -> j.getOutputs().getFiles().getSingleFile()));
            task.setClasspath(project.getConfigurations().named("runtimeClasspath"));
            task.setCacheDir(cacheDir);
            task.setGraalDirectoryName(extension.getGraalDirectoryName());
            task.setOptions(extension.getOptions());
            task.dependsOn(extractGraal);
            task.dependsOn(jar);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java

    private String getArchitecture() {
        switch (Platform.architecture()) {
            case AMD64:
                return "amd64";
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
        Set<File> classpathArgument = new LinkedHashSet<>();

        classpathArgument.addAll(classpath.get().getFiles());
        classpathArgument.add(jarFile.getAsFile().get());

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `subDirectories` may produce `NullPointerException`
in `src/main/java/com/palantir/gradle/graal/FileUtil.java`
#### Snippet
```java
        AbstractSet<String> subDirectoriesNames = new HashSet<String>();
        File[] subDirectories = directory.listFiles(File::isDirectory);
        for (File subDirectory : subDirectories) {
            subDirectoriesNames.add(subDirectory.getName());
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
            cmdArgs.add("/V:ON");
            cmdArgs.add("/c");
            cmdArgs.add("\"" + startCmd.toString() + "\"");
            spec.setExecutable("cmd.exe");
            spec.setArgs(cmdArgs);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `providerFactory` may be 'final'
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
    private final ListProperty<String> options;

    private ProviderFactory providerFactory;

    public GraalExtension(Project project) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/graal/SharedLibraryTask.java`
#### Snippet
```java
    private final class LogAction implements Action<Task> {
        @Override
        public void execute(Task _task) {
            getLogger()
                    .warn(
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `src/main/java/com/palantir/gradle/graal/NativeImageTask.java`
#### Snippet
```java
    private final class LogAction implements Action<Task> {
        @Override
        public void execute(Task _task) {
            getLogger()
                    .warn(
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java

    /**
     * Add option from https://github.com/oracle/graal/blob/master/substratevm/OPTIONS.md.
     */
    public final void option(String option) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `searchedVsEdition == null` is always `false`
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
        String searchedVsVersion = windowsVsVersion.getOrElse(getNewestWindowsVsVersionInstalled());
        String searchedVsEdition = windowsVsEdition.getOrElse(getBiggestWindowsVsEditionInstalled(searchedVsVersion));
        if (searchedVsEdition == null || searchedVsVersion == null) {
            return "";
        }
```

### ConstantValue
Condition `searchedVsEdition == null || searchedVsVersion == null` is always `false`
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
        String searchedVsVersion = windowsVsVersion.getOrElse(getNewestWindowsVsVersionInstalled());
        String searchedVsEdition = windowsVsEdition.getOrElse(getBiggestWindowsVsEditionInstalled(searchedVsVersion));
        if (searchedVsEdition == null || searchedVsVersion == null) {
            return "";
        }
```

### ConstantValue
Condition `searchedVsVersion == null` is always `false` when reached
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
        String searchedVsVersion = windowsVsVersion.getOrElse(getNewestWindowsVsVersionInstalled());
        String searchedVsEdition = windowsVsEdition.getOrElse(getBiggestWindowsVsEditionInstalled(searchedVsVersion));
        if (searchedVsEdition == null || searchedVsVersion == null) {
            return "";
        }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                ? "java" + javaVersion.get()
                : ""; // for GraalVM >= 19.3 the naming contains java8 or java11
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                : ""; // for GraalVM >= 19.3 the naming contains java8 or java11
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
                .replaceAll("--", "-"); // for GraalVM < 19.3 there's only a Java8 package
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
                .replaceAll("--", "-"); // for GraalVM < 19.3 there's only a Java8 package
    }
```

