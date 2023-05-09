# netbeans-nbpackage 
 
# Bad smells
I found 92 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 24 | false |
| UnnecessaryModifier | 14 | true |
| RegExpRedundantEscape | 14 | false |
| JavadocReference | 10 | false |
| DataFlowIssue | 8 | false |
| DuplicatedCode | 6 | false |
| UnusedAssignment | 4 | false |
| UNUSED_IMPORT | 3 | false |
| CommentedOutCode | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| RedundantMethodOverride | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `calculateRuntimePath()` is identical to its super method
in `src/main/java/org/apache/netbeans/nbpackage/innosetup/InnoSetupTask.java`
#### Snippet
```java

    @Override
    protected Path calculateRuntimePath(Path image, Path application) throws Exception {
        return application.resolve("jdk");
    }
```

## RuleId[id=UnnecessaryModifier]
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
     * @return packager name
     */
    public String name();

    /**
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
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
         * @throws IOException
         */
        public boolean processFile(Path tmpFile, String jarPath) throws IOException;

    }
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
in `src/main/java/org/apache/netbeans/nbpackage/Option.java`
#### Snippet
```java
         * @throws Exception on parsing error
         */
        public T parse(String text) throws Exception;

    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ArchiveStreamFactory`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java

        /**
         * The archive name to use in {@link ArchiveStreamFactory}.
         *
         * @return the archive name
```

### JavadocReference
Cannot resolve symbol `ZipArchiveEntry`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java

    /**
     * Extracts a {@link ZipArchiveEntry}, creating files and directories that
     * match the date modified, POSIX permissions, and symbolic link properties
     * of the archive entry.
```

### JavadocReference
Cannot resolve symbol `ArchiveStreamFactory`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
        /**
         * Create a new ArchiveType enum with the given name that maps into
         * {@link ArchiveStreamFactory}.
         *
         * @param commonsCompressName the matching name from
```

### JavadocReference
Cannot resolve symbol `ArchiveStreamFactory`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
         *
         * @param commonsCompressName the matching name from
         * {@link ArchiveStreamFactory}
         */
        ArchiveType(final String commonsCompressName) {
```

### JavadocReference
Cannot resolve symbol `CompressorException`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     * @param extractToDirectory the directory to extract into
     * @throws IOException if an IO error occurs
     * @throws CompressorException if a compression exception occurs
     * @throws ArchiveException if an archive exception occurs
     */
```

### JavadocReference
Cannot resolve symbol `ArchiveException`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     * @throws IOException if an IO error occurs
     * @throws CompressorException if a compression exception occurs
     * @throws ArchiveException if an archive exception occurs
     */
    public static void extractArchive(Path archivePath, Path extractToDirectory)
```

### JavadocReference
Cannot resolve symbol `ArchiveException`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     * @param archiveFile the file to write the archive to
     * @throws IOException if an IO error occurs
     * @throws ArchiveException if an archive error occurs
     */
    public static void createArchive(ArchiveType archiveType, Path directoryToArchive, Path archiveFile)
```

### JavadocReference
Cannot resolve symbol `ArchiveStreamFactory`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
    /**
     * Extracts an archive using
     * {@link ArchiveStreamFactory#createArchiveInputStream(InputStream)} with
     * no special handling of symbolic links or file permissions.
     *
```

### JavadocReference
Cannot resolve symbol `createArchiveInputStream(InputStream)`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
    /**
     * Extracts an archive using
     * {@link ArchiveStreamFactory#createArchiveInputStream(InputStream)} with
     * no special handling of symbolic links or file permissions.
     *
```

### JavadocReference
Cannot resolve symbol `ArchiveException`
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
     * @param inputStream the archive input stream
     * @param extractToDirectory the directory to extract the archive into
     * @throws ArchiveException if an archive error occurs
     * @throws IOException if an IO error occurs
     */
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/Template.java`
#### Snippet
```java
     * @param context execution context for path option
     * @return loaded template
     * @throws IOException
     */
    public String load(ExecutionContext context) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
     * @param configuration additional configuration
     * @param destination destination file
     * @throws IOException
     */
    public static void writeFullConfiguration(Configuration configuration,
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/NBPackage.java`
#### Snippet
```java
     * @param configuration additional configuration
     * @param includeComments whether to include option comments
     * @return
     */
    public static String writeFullConfiguration(Configuration configuration,
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     *
     * @param dir directory to delete
     * @throws IOException
     */
    public static void deleteFiles(Path dir) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param src source directory
     * @param dst destination directory
     * @throws IOException
     */
    public static void moveFiles(Path src, Path dst) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param archive archive file
     * @param destination destination directory (must exist)
     * @throws IOException
     */
    public static void extractArchive(Path archive, Path destination) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param patterns glob patterns
     * @return list of matching directories
     * @throws IOException
     */
    public static List<Path> findDirs(Path searchDir, int searchDepth, String... patterns) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
         * @param jarPath full path inside JAR
         * @return true to update the file in the JAR
         * @throws IOException
         */
        public boolean processFile(Path tmpFile, String jarPath) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param pattern pattern to search for
     * @return list of files that match pattern
     * @throws IOException
     */
    public static List<Path> find(Path searchDir, String pattern) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param directory directory to zip
     * @param destination destination file (must not exist)
     * @throws IOException
     */
    public static void createZipArchive(Path directory, Path destination) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param src source directory
     * @param dst destination directory
     * @throws IOException
     */
    public static void copyFiles(Path src, Path dst) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
     * @param processor process files
     * @return true if the JAR contents have been updated
     * @throws IOException
     */
    public static boolean processJarContents(Path jarFile, String pattern, JarProcessor processor)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param processBuilder command to execute
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
    public String execAndGetOutput(ProcessBuilder processBuilder) throws IOException, InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param command command line
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
    public int exec(String... command) throws IOException, InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param command command line
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
    public String execAndGetOutput(List<String> command) throws IOException, InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param processBuilder command to execute
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
    public int exec(ProcessBuilder processBuilder) throws IOException, InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param command command line
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return output of command
     * @throws IOException
     * @throws InterruptedException
     */
    public String execAndGetOutput(String... command) throws IOException, InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @param command command line
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
     * @return exit code of process
     * @throws IOException
     * @throws InterruptedException
     */
    public int exec(List<String> command) throws IOException, InterruptedException {
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
Redundant character escape `\\}` in RegExp
in `src/main/java/org/apache/netbeans/nbpackage/StringUtils.java`
#### Snippet
```java
public class StringUtils {

    private static final Pattern TOKEN_PATTERN = Pattern.compile("\\$\\{(.+?)\\}");

    private StringUtils() {
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/FileUtils.java`
#### Snippet
```java
                Path targetDir = dst.resolve(src.relativize(dir));
                try {
                    Files.copy(dir, targetDir);
                    ensureWritable(targetDir);
                } catch (FileAlreadyExistsException ex) {
                    if (!Files.isDirectory(targetDir)) {
                        throw ex;
                    }
                }
                return CONTINUE;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        String pkgName = packageName();

        // @TODO support other installation bases
        String base = "usr";
        Path baseDir = image.resolve(base);
        Path appDir = baseDir.resolve("lib").resolve(pkgName);
        Files.move(baseDir.resolve("lib").resolve("APPDIR"),
                appDir);

        String execName = findLauncher(appDir.resolve("bin")).getFileName().toString();
        String packageLocation = "/" + base + "/lib/" + pkgName;
        Path binDir = baseDir.resolve("bin");
        Files.createDirectories(binDir);
        setupLauncher(binDir, packageLocation, execName);

        Path share = baseDir.resolve("share");
        Files.createDirectories(share);
        setupIcons(share, pkgName);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        if (packageName == null) {
            var name = sanitize(context().getValue(NBPackage.PACKAGE_NAME).orElseThrow());
            if (name.length() < 2 || !Character.isLetter(name.charAt(0))) {
                throw new IllegalArgumentException();
            }
            packageName = name;
        }
        return packageName;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        Files.createDirectories(iconDir);
        if (icon != null) {
            Files.copy(icon, iconDir.resolve(pkgName + ".png"));
        } else {
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans-48x48.png"),
                    iconDir.resolve(pkgName + ".png"));
        }
        if (svg != null) {
            Files.createDirectories(svgDir);
            Files.copy(svg, svgDir.resolve(pkgName + ".svg"));
        } else if (icon == null) {
            Files.createDirectories(svgDir);
            Files.copy(getClass().getResourceAsStream(
                    "/org/apache/netbeans/nbpackage/apache-netbeans.svg"),
                    svgDir.resolve(pkgName + ".svg"));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/deb/DebTask.java`
#### Snippet
```java
        Map<String, String> tokens = Map.of("EXEC", exec, "ICON", pkgName);
        String desktop = StringUtils.replaceTokens(template,
                key -> {
                    var ret = tokens.get(key);
                    if (ret != null) {
                        return ret;
                    } else {
                        return context().tokenReplacementFor(key);
                    }
                });
        Path desktopDir = share.resolve("applications");
        Files.createDirectories(desktopDir);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/netbeans/nbpackage/macos/AppBundleTask.java`
#### Snippet
```java
        Path jarFiles = image.resolve(JAR_BIN_FILENAME);
        if (!Files.exists(jarFiles)) {
            return;
        }
        List<Path> jars = Files.readString(jarFiles).lines()
                .filter(l -> !l.isBlank())
                .map(Path::of)
                .map(image::resolve)
                .collect(Collectors.toList());
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `compressorType` initializer `null` is redundant
in `src/main/java/org/apache/netbeans/nbpackage/ArchiveUtils.java`
#### Snippet
```java
            throws IOException, CompressorException, ArchiveException {
        try (InputStream jdkInputStream = new BufferedInputStream(Files.newInputStream(archivePath))) {
            String compressorType = null;
            try {
                compressorType = CompressorStreamFactory.detect(jdkInputStream);
```

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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/main/java/org/apache/netbeans/nbpackage/ExecutionContext.java`
#### Snippet
```java
        } finally {
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }
    }
```

