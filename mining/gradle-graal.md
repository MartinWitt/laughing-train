# gradle-graal 
 
# Bad smells
I found 31 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| RegExpRedundantEscape | 6 | false |
| BoundedWildcard | 4 | false |
| ReturnNull | 3 | false |
| ConstantValue | 3 | false |
| UnnecessaryBoxing | 2 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| NonProtectedConstructorInAbstractClass | 1 | true |
## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/graal/FileUtil.java`
#### Snippet
```java
    public static String getFirstFromDirectory(File directory, List<String> searchList) {
        if (!directory.exists()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/graal/FileUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
    private String getBiggestWindowsVsEditionInstalled(String version) {
        if (version == null) {
            return null;
        }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
        String searchedVsVarsPath = Integer.parseInt(javaVersion.get()) >= 11
                ? DEFAULT_WINDOWS_VS_VARS_PATH
                        .replaceAll("\\{version}", searchedVsVersion)
                        .replaceAll("\\{edition}", searchedVsEdition)
                : WINDOWS_7_ENV_PATH;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
                ? DEFAULT_WINDOWS_VS_VARS_PATH
                        .replaceAll("\\{version}", searchedVsVersion)
                        .replaceAll("\\{edition}", searchedVsEdition)
                : WINDOWS_7_ENV_PATH;
        if (WINDOWS_7_ENV_PATH.equals(searchedVsVarsPath)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                ? "java" + javaVersion.get()
                : ""; // for GraalVM >= 19.3 the naming contains java8 or java11
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                : ""; // for GraalVM >= 19.3 the naming contains java8 or java11
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
        return pattern.replaceAll("\\[url\\]", downloadBaseUrl.get())
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[version\\]", graalVersion.get())
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[javaVersion\\]", computedJavaVersion)
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
                .replaceAll("--", "-"); // for GraalVM < 19.3 there's only a Java8 package
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[os\\]", getOperatingSystem())
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
                .replaceAll("--", "-"); // for GraalVM < 19.3 there's only a Java8 package
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/graal/DownloadGraalTask.java`
#### Snippet
```java
                .replaceAll("\\[arch\\]", getArchitecture())
                .replaceAll("\\[ext\\]", getArchiveExtension())
                .replaceAll("--", "-"); // for GraalVM < 19.3 there's only a Java8 package
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.provider` is unnecessary and can be removed
in `src/main/java/com/palantir/gradle/graal/GraalExtension.java`
#### Snippet
```java
     * Returns the outputName to use for the generated executable file.
     *
     * <p>Check {@link org.gradle.api.provider.Provider#isPresent()} to determine if an override has been set.</p>
     */
    public final Provider<String> getOutputName() {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RegularFile`
in `src/main/java/com/palantir/gradle/graal/ExtractGraalTask.java`
#### Snippet
```java
    }

    public final void setInputArchive(Provider<RegularFile> value) {
        this.inputArchive.set(value);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
     * @throws IOException If any problem while creating output directory
     */
    protected final void configureArgs(List<String> args) throws IOException {
        args.add("-cp");
        args.add(generateClasspathArgument());
```

### BoundedWildcard
Can generalize to `? extends Configuration`
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
    }

    public final void setClasspath(Provider<Configuration> provider) {
        classpath.set(provider);
    }
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
    }

    public final void setOptions(Provider<List<String>> options) {
        this.options.set(options);
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseGraalCompileTask()` of an abstract class should not be declared 'public'
in `src/main/java/com/palantir/gradle/graal/BaseGraalCompileTask.java`
#### Snippet
```java
            getProject().getObjects().property(String.class);

    public BaseGraalCompileTask() {
        setGroup(GradleGraalPlugin.TASK_GROUP);
        this.outputFile.set(getProject()
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

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/palantir/gradle/graal/GraalVersionUtil.java`
#### Snippet
```java
        try {
            final String[] versionSplit = graalVersion.split("\\.", -1);
            final int majorVersion0 = Integer.valueOf(versionSplit[0]);
            final int minorVersion0 = Integer.valueOf(versionSplit[1]);
            return majorVersion0 > majorVersion || (majorVersion0 == majorVersion && minorVersion0 >= minorVersion);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/palantir/gradle/graal/GraalVersionUtil.java`
#### Snippet
```java
            final String[] versionSplit = graalVersion.split("\\.", -1);
            final int majorVersion0 = Integer.valueOf(versionSplit[0]);
            final int minorVersion0 = Integer.valueOf(versionSplit[1]);
            return majorVersion0 > majorVersion || (majorVersion0 == majorVersion && minorVersion0 >= minorVersion);
        } catch (NumberFormatException ignored) {
```

