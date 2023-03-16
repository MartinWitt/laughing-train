# netbeans-nbpackage 
 
# Bad smells
I found 120 bad smells with 20 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 29 | false |
| UnnecessaryModifier | 14 | true |
| RegExpRedundantEscape | 14 | false |
| DynamicRegexReplaceableByCompiledPattern | 11 | false |
| DataFlowIssue | 8 | false |
| Convert2MethodRef | 8 | false |
| UNUSED_IMPORT | 6 | false |
| BoundedWildcard | 6 | false |
| SystemOutErr | 3 | false |
| NestedAssignment | 3 | false |
| UnusedAssignment | 3 | false |
| CommentedOutCode | 2 | false |
| CodeBlock2Expr | 2 | true |
| UnnecessaryLocalVariable | 2 | true |
| RedundantMethodOverride | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| SimplifyStreamApiCallChains | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| ReturnNull | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java

        private void info(String msg) {
            System.out.println(msg);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
                    "@|bold,red " + msg + "|@"
            );
            System.out.println(ansiMsg);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/netbeans/nbpackage/Configuration.java`
#### Snippet
```java
        private Builder() {
            properties = new Properties();
            warningHandler = s -> System.out.println(s);
            infoHandler = warningHandler;
        }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `runtimeDirectory()` is identical to its super method
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java

    @Override
    protected Path runtimeDirectory(Path image, Path application) throws Exception {
        return application.resolve("jdk");
    }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Option.java`
#### Snippet
```java
         * @throws Exception on parsing error
         */
        public T parse(String text) throws Exception;

    }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/org/apache/netbeans/nbpackage/Option.java`
#### Snippet
```java
     */
    @FunctionalInterface
    public static interface Parser<T> {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
         * @throws Exception on validation failure
         */
        public void validateCreateImage() throws Exception;

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * @return task
     */
    public Task createTask(ExecutionContext context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * @return stream of packager-specific templates
     */
    public default Stream<Template> templates() {
        return Stream.empty();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
         * @throws Exception on execution failure
         */
        public Path createImage(Path input) throws Exception;

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
         * @throws Exception on validation failure
         */
        public void validateCreatePackage() throws Exception;

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * @return stream of packager-specific options
     */
    public default Stream<Option<?>> options() {
        return Stream.empty();
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * not guarantee that execution will succeed.
     */
    public static interface Task {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * not guarantee that execution will succeed.
     */
    public static interface Task {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
         * @throws Exception on execution failure
         */
        public Path createPackage(Path image) throws Exception;

    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
     * @return packager name
     */
    public String name();

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     */
    @FunctionalInterface
    public static interface JarProcessor {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
         * @throws IOException
         */
        public boolean processFile(Path tmpFile, String jarPath) throws IOException;

    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
 * Entry point for command line usage.
 */
public class Main {

    /**
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java

    private String sanitize(String name) {
        return name.replaceAll("[^a-zA-Z0-9-_\\.]", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
    
    String sanitize(String name) {
        return name.replaceAll("[\\\\/:*?\"<>|]", "_");
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
    
    private String sanitizeBundleID(String name) {
        return name.replaceAll("[^a-zA-Z0-9-\\.]", "-");
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java

    private String sanitize(String name) {
        return name.replaceAll("[\\\\/:*?\"<>|]", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java

    private String sanitize(String name) {
        return name.replaceAll("[^a-zA-Z0-9-_\\.]", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     */
    private static String getRelativePathString(Path path, Path rootDirectory) {
        String relativePathString = rootDirectory.relativize(path).toString().replaceAll("\\\\", "/");
//        LOG.log(System.Logger.Level.TRACE, "Creating relative path from path=" + path + ", rootDirectory=" + rootDirectory + ", relativePathString=" + relativePathString);
        return relativePathString;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
                archiveOutputStream.putArchiveEntry(entry);
                if (isSymbolicLink) {
                    String linkData = Files.readSymbolicLink(filePathToArchive).toString().replaceAll("\\\\", "/");
                    archiveOutputStream.write(linkData.getBytes(StandardCharsets.UTF_8));
                } else {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/Template.java`
#### Snippet
```java
     * template source. The input stream for the default source should be
     * readable as UTF-8 text. A packager will usually use
     * {@link Class#getResourceAsStream(java.lang.String)}. The template name
     * may be used as a file name for exporting templates.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java
    /**
     * Default implementation of
     * {@link Packager.Task#createImage(java.nio.file.Path)}. Creates an image
     * directory, and extracts the application and (optional) runtime into it.
     * Name and paths can be customized if required by overriding the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java
     * Name and paths can be customized if required by overriding the
     * implementations of
     * {@link #imageName(java.nio.file.Path)}, {@link #applicationDirectory(java.nio.file.Path)}
     * and {@link #runtimeDirectory(java.nio.file.Path, java.nio.file.Path)}. If
     * the runtime is extracted inside the application path, the *.conf file
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java
     * Name and paths can be customized if required by overriding the
     * implementations of
     * {@link #imageName(java.nio.file.Path)}, {@link #applicationDirectory(java.nio.file.Path)}
     * and {@link #runtimeDirectory(java.nio.file.Path, java.nio.file.Path)}. If
     * the runtime is extracted inside the application path, the *.conf file
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java
     * implementations of
     * {@link #imageName(java.nio.file.Path)}, {@link #applicationDirectory(java.nio.file.Path)}
     * and {@link #runtimeDirectory(java.nio.file.Path, java.nio.file.Path)}. If
     * the runtime is extracted inside the application path, the *.conf file
     * will be updated with the relative path to the runtime (currently only for
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java
     * implementations of
     * {@link #imageName(java.nio.file.Path)}, {@link #applicationDirectory(java.nio.file.Path)}
     * and {@link #runtimeDirectory(java.nio.file.Path, java.nio.file.Path)}. If
     * the runtime is extracted inside the application path, the *.conf file
     * will be updated with the relative path to the runtime (currently only for
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
        /**
         * Create a package from the image and additional files created by
         * {@link #createImage(java.nio.file.Path)}.
         *
         * @param image image created by
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/Packager.java`
#### Snippet
```java
         *
         * @param image image created by
         * {@link #createImage(java.nio.file.Path)}
         * @return path to created package
         * @throws Exception on execution failure
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
    /**
     * Processor for updating files inside a JAR. For use with
     * {@link FileUtils#processJarContents(java.nio.file.Path, java.lang.String, org.apache.netbeans.nbpackage.FileUtils.JarProcessor)}.
     */
    @FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
    /**
     * Processor for updating files inside a JAR. For use with
     * {@link FileUtils#processJarContents(java.nio.file.Path, java.lang.String, org.apache.netbeans.nbpackage.FileUtils.JarProcessor)}.
     */
    @FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.netbeans.nbpackage` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
    /**
     * Processor for updating files inside a JAR. For use with
     * {@link FileUtils#processJarContents(java.nio.file.Path, java.lang.String, org.apache.netbeans.nbpackage.FileUtils.JarProcessor)}.
     */
    @FunctionalInterface
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
     * optionally included in the output. The output is in properties file
     * format, suitable for use with
     * {@link Configuration.Builder#load(java.nio.file.Path)}.
     *
     * @param configuration additional configuration
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
    /**
     * Create a package from the image and any build files previously output by
     * {@link #createImage(java.nio.file.Path, org.apache.netbeans.nbpackage.Configuration, java.nio.file.Path)}.
     * The destination is the directory to create the package in, and must
     * already exist. The returned path is the created package.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.netbeans.nbpackage` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
    /**
     * Create a package from the image and any build files previously output by
     * {@link #createImage(java.nio.file.Path, org.apache.netbeans.nbpackage.Configuration, java.nio.file.Path)}.
     * The destination is the directory to create the package in, and must
     * already exist. The returned path is the created package.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
    /**
     * Create a package from the image and any build files previously output by
     * {@link #createImage(java.nio.file.Path, org.apache.netbeans.nbpackage.Configuration, java.nio.file.Path)}.
     * The destination is the directory to create the package in, and must
     * already exist. The returned path is the created package.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
     * options and the options for that type will be output. The output is in
     * properties file format, suitable for use with
     * {@link Configuration.Builder#load(java.nio.file.Path)}.
     *
     * @param configuration additional configuration
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * a given token, an exception is thrown - to leave the token text in place
     * use
     * {@link #replaceTokens(java.lang.String, java.util.function.Function)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * a given token, an exception is thrown - to leave the token text in place
     * use
     * {@link #replaceTokens(java.lang.String, java.util.function.Function)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * replacement text. If the token value map has no entry for a given token,
     * an exception is thrown - to leave the token text in place use
     * {@link #replaceTokens(java.lang.String, java.util.Map)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * replacement text. If the token value map has no entry for a given token,
     * an exception is thrown - to leave the token text in place use
     * {@link #replaceTokens(java.lang.String, java.util.Map)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * replacement text. If the token value map has no entry for a given token,
     * the original token text will be left in place - to fail in this situation
     * use {@link #replaceTokensOrFail(java.lang.String, java.util.Map)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * replacement text. If the token value map has no entry for a given token,
     * the original token text will be left in place - to fail in this situation
     * use {@link #replaceTokensOrFail(java.lang.String, java.util.Map)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * a given token, the original token text will be left in place - to fail in
     * this situation use
     * {@link #replaceTokensOrFail(java.lang.String, java.util.function.Function)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
     * a given token, the original token text will be left in place - to fail in
     * this situation use
     * {@link #replaceTokensOrFail(java.lang.String, java.util.function.Function)}.
     *
     * @param input text possibly containing tokens
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * Execute the given external process. The process will be executed using
     * the current working directory. If control over the working directory or
     * environment is required, use {@link #exec(java.lang.ProcessBuilder)}.
     * <p>
     * If {@link #isVerbose()} then process output streams will be routed to the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * will be executed using the current working directory. If control over the
     * working directory or environment is required, use
     * {@link #execAndGetOutput(java.lang.ProcessBuilder)}.
     * <p>
     * If {@link #isVerbose()} then the error stream of the process will be
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * will be executed using the current working directory. If control over the
     * working directory or environment is required, use
     * {@link #execAndGetOutput(java.lang.ProcessBuilder)}.
     * <p>
     * If {@link #isVerbose()} then the error stream of the process will be
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * Execute the given external process. The process will be executed using
     * the current working directory. If control over the working directory or
     * environment is required, use {@link #exec(java.lang.ProcessBuilder)}.
     * <p>
     * If {@link #isVerbose()} then process output streams will be routed to the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * Default token lookup. Useful if a task wants to provide its own token
     * value source in eg.
     * {@link StringUtils#replaceTokens(java.lang.String, java.util.function.Function)}
     * but fallback to the default token replacement.
     *
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans-...` might be null
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java
            Files.copy(icon, iconFile);
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans-48x48.png"),
                    iconFile
            );
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans....` might be null
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
            Files.copy(icnsFile, dstFile);
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans.icns"), dstFile);
        }
    }
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans....` might be null
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java
            Files.copy(icoFile, dstFile);
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans.ico"),
                    dstFile
            );
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans-...` might be null
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
            Files.copy(icon, iconDir.resolve(pkgName + ".png"));
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans-48x48.png"),
                    iconDir.resolve(pkgName + ".png"));
        }
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans....` might be null
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        } else if (icon == null) {
            Files.createDirectories(svgDir);
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans.svg"),
                    svgDir.resolve(pkgName + ".svg"));
        }
```

### DataFlowIssue
Argument `tmp` might be null
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
                        }
                    } finally {
                        Files.deleteIfExists(tmp);
                    }
                }
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans-...` might be null
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
            Files.copy(icon, iconDir.resolve(pkgName + ".png"));
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans-48x48.png"),
                    iconDir.resolve(pkgName + ".png"));
        }
```

### DataFlowIssue
Argument `getClass().getResourceAsStream( "/org/apache/netbeans/nbpackage/apache-netbeans....` might be null
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
        } else if (icon == null) {
            Files.createDirectories(svgDir);
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans.svg"),
                    svgDir.resolve(pkgName + ".svg"));
        }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java
package org.apache.netbeans.nbpackage.appimage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStreamReader;`
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.netbeans.nbpackage.AbstractPackagerTask;
import org.apache.netbeans.nbpackage.ExecutionContext;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java
package org.apache.netbeans.nbpackage.innosetup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStreamReader;`
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/org/apache/netbeans/nbpackage/zip/ZipPackageTask.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.apache.netbeans.nbpackage.AbstractPackagerTask;
import org.apache.netbeans.nbpackage.ExecutionContext;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java

        TarArchiveEntry entry;
        while ((entry = archiveInputStream.getNextTarEntry()) != null) {
            if (!archiveInputStream.canReadEntryData(entry)) {
                LOG.log(System.Logger.Level.ERROR, "Failed to read archive entry " + entry);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java

        JarArchiveEntry entry;
        while ((entry = archiveInputStream.getNextJarEntry()) != null) {
            if (!archiveInputStream.canReadEntryData(entry)) {
                LOG.log(System.Logger.Level.ERROR, "Failed to read archive entry " + entry);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java

        ArchiveEntry entry;
        while ((entry = archiveInputStream.getNextEntry()) != null) {
            if (!archiveInputStream.canReadEntryData(entry)) {
                LOG.log(System.Logger.Level.ERROR, "Failed to read archive entry " + entry);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be merged with previous 'map()' call
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
                    return false;
                }
            }).allMatch(v -> v);
        })) {
            return List.copyOf(stream.collect(Collectors.toList()));
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (10 lines)
in `src/main/java/org/apache/netbeans/nbpackage/Configuration.java`
#### Snippet
```java
    }

//    /**
//     * Get a value as String from the underlying configuration properties.
//     *
```

### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/org/apache/netbeans/nbpackage/Configuration.java`
#### Snippet
```java
        }

//        /**
//         * Set a property in the underlying configuration.
//         *
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/org/apache/netbeans/nbpackage/Configuration.java`
#### Snippet
```java
                extraProps.load(reader);
            }
            extraProps.entrySet().forEach(e -> {
                e.setValue(StringUtils.replaceTokens(e.getValue().toString(),
                        configReplace));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
                .max().orElse(1);
        try (var stream = Files.find(searchDir, searchDepth, (intPath, attr) -> {
            return matchers.stream().map(m -> {
                try (var files = Files.walk(intPath, intDepth)) {
                    return files.map(file -> intPath.relativize(file))
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `options` are queried, but never updated
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
        @CommandLine.Option(names = {"-P"},
                descriptionKey = "option.property.description")
        private Map<String, String> options;

        @Override
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/Option.java`
#### Snippet
```java
            String defaultValue,
            String comment) {
        return new Option<>(key, Path.class, defaultValue, s -> Path.of(s), comment);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
        Files.writeString(image.resolve(NATIVE_BIN_FILENAME),
                nativeBinaries.stream()
                        .map(path -> image.relativize(path))
                        .map(Path::toString)
                        .collect(Collectors.joining("\n", "", "\n")),
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
        Files.writeString(image.resolve(JAR_BIN_FILENAME),
                jarBinaries.stream()
                        .map(path -> image.relativize(path))
                        .map(Path::toString)
                        .collect(Collectors.joining("\n", "", "\n")),
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/Configuration.java`
#### Snippet
```java
        private Builder() {
            properties = new Properties();
            warningHandler = s -> System.out.println(s);
            infoHandler = warningHandler;
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        Files.createDirectories(desktopDir);
        String desktopFileName = context().getValue(DebPackager.DESKTOP_FILENAME)
                .map(name -> sanitize(name))
                .orElse(pkgName);
        Path desktopFile = desktopDir.resolve(desktopFileName + ".desktop");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
            return matchers.stream().map(m -> {
                try (var files = Files.walk(intPath, intDepth)) {
                    return files.map(file -> intPath.relativize(file))
                            .anyMatch(m::matches);
                } catch (IOException ex) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
            try (var jarStream = Files.walk(jarFS.getPath("/"))) {
                filesToProcess = jarStream
                        .filter(file -> Files.isRegularFile(file))
                        .filter(matcher::matches)
                        .collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
        Files.createDirectories(desktopDir);
        String desktopFileName = context().getValue(RpmPackager.DESKTOP_FILENAME)
                .map(name -> sanitize(name))
                .orElse(pkgName);
        Path desktopFile = desktopDir.resolve(desktopFileName + ".desktop");
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/appimage/AppImageTask.java`
#### Snippet
```java

    private String sanitize(String name) {
        return name.replaceAll("[^a-zA-Z0-9-_\\.]", "_");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
    
    private String sanitizeBundleID(String name) {
        return name.replaceAll("[^a-zA-Z0-9-\\.]", "-");
    }
    
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/AbstractPackagerTask.java`
#### Snippet
```java

    private String sanitize(String name) {
        return name.replaceAll("[^a-zA-Z0-9-_\\.]", "_");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\~` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitize(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\~` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String sanitizeVersion(String text) {
        return text.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9\\+\\-\\.\\~]", "-");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
public class StringUtils {

    private static final Pattern TOKEN_PATTERN = Pattern.compile("\\$\\{(.+?)\\}");

    private StringUtils() {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-16-06-23-09.409.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `version` is redundant
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
    private String packageVersion() {
        if (packageVersion == null) {
            var version = sanitizeVersion(context().getValue(NBPackage.PACKAGE_VERSION)
                    .orElse("1.0"));
            packageVersion = version;
```

### UnnecessaryLocalVariable
Local variable `relativePathString` is redundant
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     */
    private static String getRelativePathString(Path path, Path rootDirectory) {
        String relativePathString = rootDirectory.relativize(path).toString().replaceAll("\\\\", "/");
//        LOG.log(System.Logger.Level.TRACE, "Creating relative path from path=" + path + ", rootDirectory=" + rootDirectory + ", relativePathString=" + relativePathString);
        return relativePathString;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
                            if (peek == '"' || peek == '\\') {
                                buff.append(peek);
                                i++;
                            } else {
                                buff.append(c);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/netbeans/nbpackage/rpm/RpmTask.java`
#### Snippet
```java
        Path spec = image.resolve("SPECS").resolve(packageName() + ".spec");
        int result = context().exec(RPMBUILD, "--target", packageArch(),
                "--define", "_topdir " + image.toAbsolutePath().toString(),
                "-bb", spec.toAbsolutePath().toString(),
                "--noclean");
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     */
    private static Set<PosixFilePermission> getPosixFilePermissions(final int mode) {
        Set<PosixFilePermission> permissions = new HashSet<>();
        if ((mode & OWNER_READ_BIT_MASK) != 0) {
            permissions.add(PosixFilePermission.OWNER_READ);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends InputStream`
in `src/main/java/org/apache/netbeans/nbpackage/Template.java`
#### Snippet
```java
     */
    public static Template of(Option<Path> option, String name,
            Supplier<InputStream> defaultSourceSupplier) {
        return new Template(option, name, ()
                -> new InputStreamReader(defaultSourceSupplier.get(), StandardCharsets.UTF_8));
```

### BoundedWildcard
Can generalize to `? extends Reader`
in `src/main/java/org/apache/netbeans/nbpackage/Template.java`
#### Snippet
```java
    private final Supplier<Reader> readerProvider;

    private Template(Option<Path> option, String name, Supplier<Reader> readerSupplier) {
        this.name = name;
        this.option = option;
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java
    }

    private String buildInstallDeleteSection(List<Path> files) {
        return files.stream()
                .map(Path::getFileName)
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java
    }

    private String buildFilesSection(String execName, List<Path> files) {
        return files.stream()
                .map(file -> buildFilesSectionLine(execName, file))
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java

    private static String replaceTokensImpl(String input,
            Function<String, String> tokenSource,
            boolean lenient) {
        var matcher = TOKEN_PATTERN.matcher(input);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the option cannot be parsed
     */
    public <T> Optional<T> getValue(Option<T> option) {
        var raw = configuration.getValue(option);
        if (!raw.isBlank()) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `NBPackage.createImage(input, conf, dest)` assigned to `created` is never used
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
                if (input != null) {
                    if (imageOnly) {
                        created = NBPackage.createImage(input, conf, dest);
                    } else {
                        created = NBPackage.createPackage(input, conf, dest);
```

### UnusedAssignment
The value `NBPackage.createPackage(input, conf, dest)` assigned to `created` is never used
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
                        created = NBPackage.createImage(input, conf, dest);
                    } else {
                        created = NBPackage.createPackage(input, conf, dest);
                    }
                } else if (inputImage != null) {
```

### UnusedAssignment
The value `NBPackage.packageImage(inputImage, conf, dest)` assigned to `created` is never used
in `src/main/java/org/apache/netbeans/nbpackage/Main.java`
#### Snippet
```java
                    }
                } else if (inputImage != null) {
                    created = NBPackage.packageImage(inputImage, conf, dest);
                }
                return 0;
```

