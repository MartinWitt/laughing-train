# maven-shared-utils 
 
# Bad smells
I found 159 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 48 | false |
| ToArrayCallWithZeroLengthArrayArgument | 21 | true |
| Deprecation | 14 | false |
| ConstantValue | 10 | false |
| IOStreamConstructor | 8 | false |
| RedundantCast | 7 | false |
| StringBufferReplaceableByString | 5 | false |
| FieldMayBeFinal | 5 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryStringEscape | 3 | true |
| CommentedOutCode | 3 | false |
| DuplicatedCode | 3 | false |
| IgnoreResultOfCall | 3 | false |
| TrivialIf | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| JavadocReference | 2 | false |
| RegExpSimplifiable | 2 | false |
| UnnecessaryInitCause | 2 | false |
| JavadocDeclaration | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| NullArgumentToVariableArgMethod | 2 | false |
| UnusedAssignment | 2 | false |
| ThreadRun | 1 | false |
| RedundantTypeArguments | 1 | false |
| NullableProblems | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Xpp3Dom\[childList.size()\]'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    public Xpp3Dom[] getChildren() {
        boolean isNothing = childList == null || childList.isEmpty();
        return isNothing ? EMPTY_DOM_ARRAY : childList.toArray(new Xpp3Dom[childList.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Xpp3Dom\[children.size()\]'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    public Xpp3Dom[] getChildren(String nameParameter) {
        List<Xpp3Dom> children = getChildrenList(nameParameter);
        return children.toArray(new Xpp3Dom[children.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[attributes.size()\]'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    public String[] getAttributeNames() {
        boolean isNothing = attributes == null || attributes.isEmpty();
        return isNothing ? EMPTY_STRING_ARRAY : attributes.keySet().toArray(new String[attributes.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[ret.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/MatchPattern.java`
#### Snippet
```java
            ret.add(st.nextToken());
        }
        return ret.toArray(new String[ret.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tokens.size()\]'
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
        }

        return tokens.toArray(new String[tokens.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[result.size()\]'
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
        }

        return result.toArray(new String[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[shellCommandLine.size()\]'
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
    private String[] getShellCommandline(boolean mask) {
        List<String> shellCommandLine = getShell().getShellCommandLine(getArguments(mask));
        return shellCommandLine.toArray(new String[shellCommandLine.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[ret.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
            ret.add(st.nextToken());
        }
        return ret.toArray(new String[ret.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dirsIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    @Deprecated
    public String[] getIncludedDirectories() {
        return dirsIncluded.toArray(new String[dirsIncluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[filesExcluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    public String[] getExcludedFiles() {
        slowScan();
        return filesExcluded.toArray(new String[filesExcluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dirsExcluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    public String[] getExcludedDirectories() {
        slowScan();
        return dirsExcluded.toArray(new String[dirsExcluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[filesNotIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    public String[] getNotIncludedFiles() {
        slowScan();
        return filesNotIncluded.toArray(new String[filesNotIncluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[filesIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
            return new String[0];
        }
        return filesIncluded.toArray(new String[filesIncluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[noLinks.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
            }
        }
        newfiles = noLinks.toArray(new String[noLinks.size()]);
        return newfiles;
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dirsNotIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    public String[] getNotIncludedDirectories() {
        slowScan();
        return dirsNotIncluded.toArray(new String[dirsNotIncluded.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dirsExcluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        }

        final String[] excl = dirsExcluded.toArray(new String[dirsExcluded.size()]);

        final String[] notIncl = dirsNotIncluded.toArray(new String[dirsNotIncluded.size()]);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[dirsNotIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        final String[] excl = dirsExcluded.toArray(new String[dirsExcluded.size()]);

        final String[] notIncl = dirsNotIncluded.toArray(new String[dirsNotIncluded.size()]);

        for (String anExcl : excl) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[added.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        }

        String[] filesAdded = added.toArray(new String[added.size()]);
        String[] filesRemoved = removed.toArray(new String[removed.size()]);

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[removed.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java

        String[] filesAdded = added.toArray(new String[added.size()]);
        String[] filesRemoved = removed.toArray(new String[removed.size()]);

        return new DirectoryScanResult(filesAdded, filesRemoved);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[filesIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        }

        return diffFiles(oldFiles, filesIncluded.toArray(new String[filesIncluded.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[lines.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        List<String> lines = loadFile(file);

        return lines.toArray(new String[lines.size()]);
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `createSymbolicLink(Path, Path, FileAttribute[])`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     * @return the linked file
     * @throws IOException in case of an error
     * @see Files#createSymbolicLink(Path, Path, FileAttribute[]) which creates a new symbolic link but does
     * not replace existing symbolic links
     */
```

### JavadocReference
Cannot resolve symbol `FileAttribute`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     * @return the linked file
     * @throws IOException in case of an error
     * @see Files#createSymbolicLink(Path, Path, FileAttribute[]) which creates a new symbolic link but does
     * not replace existing symbolic links
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `actual` might be null
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java
         */

        if (formal.isAssignableFrom(actual)) {
            return true;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

                String[] fetchFiles = getFilesFromExtension(currentFileName, extensions);
                files = blendFilesToList(files, fetchFiles);
            } else {
                // ok... add the file
```

### DataFlowIssue
`null` is returned by the method declared as @Nonnull
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            }
            if (index == 0) {
                return null; // Trying to go outside our context
            }
            int index2 = normalized.lastIndexOf('/', index - 1);
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
        boolean inEscape = false;
        int state = normal;
        final StringTokenizer tok = new StringTokenizer(toProcess, "\"\' \\", true);
        List<String> tokens = new ArrayList<>();
        StringBuilder current = new StringBuilder();
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
            switch (state) {
                case inQuote:
                    if ("\'".equals(nextTok)) {
                        if (inEscape) {
                            current.append(nextTok);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
                    break;
                default:
                    if ("\'".equals(nextTok)) {
                        if (inEscape) {
                            inEscape = false;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'MatchPatterns' is still used
in `src/main/java/org/apache/maven/shared/utils/io/MatchPatterns.java`
#### Snippet
```java
 */
@Deprecated
public class MatchPatterns {
    private final MatchPattern[] patterns;

```

### DeprecatedIsStillUsed
Deprecated member 'ScanConductor' is still used
in `src/main/java/org/apache/maven/shared/utils/io/ScanConductor.java`
#### Snippet
```java
 */
@Deprecated
public interface ScanConductor {
    /**
     *
```

### DeprecatedIsStillUsed
Deprecated member 'newXmlWriter' is still used
in `src/main/java/org/apache/maven/shared/utils/WriterFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public static XmlStreamWriter newXmlWriter(@Nonnull OutputStream out) throws IOException {
        return new XmlStreamWriter(out);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'MatchPattern' is still used
in `src/main/java/org/apache/maven/shared/utils/io/MatchPattern.java`
#### Snippet
```java
 */
@Deprecated
public class MatchPattern {
    private final String source;

```

### DeprecatedIsStillUsed
Deprecated member 'getSystemEnvVars' is still used
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Properties getSystemEnvVars() {
        return getSystemEnvVars(!Os.isFamily(Os.FAMILY_WINDOWS));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getSystemEnvVars' is still used
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Properties getSystemEnvVars(boolean caseSensitive) {
        Map<String, String> envs = System.getenv();
        return ensureCaseSensitivity(envs, caseSensitive);
```

### DeprecatedIsStillUsed
Deprecated member 'loadProperties' is still used
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Properties loadProperties(@Nullable InputStream is) {
        try {
            Properties result = new Properties();
```

### DeprecatedIsStillUsed
Deprecated member 'loadProperties' is still used
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Properties loadProperties(@Nonnull File file) {
        try (InputStream in = new FileInputStream(file)) {
            return loadProperties(in);
```

### DeprecatedIsStillUsed
Deprecated member 'loadProperties' is still used
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static java.util.Properties loadProperties(@Nonnull URL url) {
        try (InputStream in = url.openStream()) {
            return loadProperties(in);
```

### DeprecatedIsStillUsed
Deprecated member 'XmlStreamReader' is still used
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java
 */
@Deprecated
public class XmlStreamReader extends Reader {
    private final org.apache.commons.io.input.XmlStreamReader reader;

```

### DeprecatedIsStillUsed
Deprecated member 'DirectoryScanResult' is still used
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanResult.java`
#### Snippet
```java
 */
@Deprecated
public class DirectoryScanResult {
    private final String[] filesAdded;

```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final String input, final int bufferSize) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        copy(input, output, bufferSize);
```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final String input) throws IOException {
        return toByteArray(input, DEFAULT_BUFFER_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final Reader input, final int bufferSize) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        copy(input, output, bufferSize);
```

### DeprecatedIsStillUsed
Deprecated member 'contentEquals' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
     */
    @Deprecated
    public static boolean contentEquals(@Nonnull final InputStream input1, @Nonnull final InputStream input2)
            throws IOException {
        final InputStream bufferedInput1 = new BufferedInputStream(input1);
```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final InputStream input, final int bufferSize) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        copy(input, output, bufferSize);
```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final Reader input) throws IOException {
        return toByteArray(input, DEFAULT_BUFFER_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'toByteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static byte[] toByteArray(@Nonnull final InputStream input) throws IOException {
        return toByteArray(input, DEFAULT_BUFFER_SIZE);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'join' is still used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String join(@Nonnull Iterator<?> iterator, String separator) {
        if (separator == null) {
            separator = "";
```

### DeprecatedIsStillUsed
Deprecated member 'defaultString' is still used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String defaultString(Object obj, @Nonnull String defaultString) {
        return (obj == null) ? defaultString : obj.toString();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'unifyLineSeparators' is still used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String unifyLineSeparators(@Nullable String s) {
        return unifyLineSeparators(s, System.getProperty("line.separator"));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'defaultString' is still used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String defaultString(Object obj) {
        return defaultString(obj, "");
    }
```

### DeprecatedIsStillUsed
Deprecated member 'join' is still used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String join(@Nonnull Object[] array, @Nullable String separator) {
        if (separator == null) {
            separator = "";
```

### DeprecatedIsStillUsed
Deprecated member 'SelectorUtils' is still used
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
 */
@Deprecated
public final class SelectorUtils {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getIncludedDirectories' is still used
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
     */
    @Deprecated
    public String[] getIncludedDirectories() {
        return dirsIncluded.toArray(new String[dirsIncluded.size()]);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIncludedFiles' is still used
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
     */
    @Deprecated
    public String[] getIncludedFiles() {
        if (filesIncluded == null) {
            return new String[0];
```

### DeprecatedIsStillUsed
Deprecated member 'DirectoryScanner' is still used
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
 */
@Deprecated
public class DirectoryScanner {
    /**
     * Patterns which should be excluded by default.
```

### DeprecatedIsStillUsed
Deprecated member 'fileRead' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String fileRead(@Nonnull File file) throws IOException {
        return fileRead(file, null);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'copyURLToFile' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     *     StandardCopyOption.REPLACE_EXISTING)}
     */
    public static void copyURLToFile(@Nonnull final URL source, @Nonnull final File destination) throws IOException {
        copyStreamToFile(source.openStream(), destination);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'copyFileToDirectory' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void copyFileToDirectory(@Nonnull final File source, @Nonnull final File destinationDirectory)
            throws IOException {
        if (destinationDirectory.exists() && !destinationDirectory.isDirectory()) {
```

### DeprecatedIsStillUsed
Deprecated member 'loadFile' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static List<String> loadFile(@Nonnull File file) throws IOException {
        List<String> lines = new ArrayList<String>();

```

### DeprecatedIsStillUsed
Deprecated member 'extension' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String extension(@Nonnull String path) {
        // Ensure the last dot is after the last file separator
        int lastSep = path.lastIndexOf(File.separatorChar);
```

### DeprecatedIsStillUsed
Deprecated member 'sizeOfDirectory' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static long sizeOfDirectory(@Nonnull final File directory) {
        if (!directory.exists()) {
            final String message = directory + " does not exist";
```

### DeprecatedIsStillUsed
Deprecated member 'dirname' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String dirname(@Nonnull String path) {
        int i = path.lastIndexOf(File.separator);
        return (i >= 0 ? path.substring(0, i) : "");
```

### DeprecatedIsStillUsed
Deprecated member 'isSymbolicLink' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static boolean isSymbolicLink(@Nonnull final File file) throws IOException {
        return Files.isSymbolicLink(file.toPath());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'filename' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String filename(@Nonnull String path) {
        int i = path.lastIndexOf(File.separator);
        return (i >= 0 ? path.substring(i + 1) : path);
```

### DeprecatedIsStillUsed
Deprecated member 'delete' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void delete(@Nonnull File file) throws IOException {
        Files.delete(file.toPath());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'deleteLegacyStyle' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static boolean deleteLegacyStyle(@Nonnull File file) {
        try {
            Files.delete(file.toPath());
```

### DeprecatedIsStillUsed
Deprecated member 'copyFile' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void copyFile(@Nonnull final File source, @Nonnull final File destination) throws IOException {
        // check source exists
        if (!source.exists()) {
```

### DeprecatedIsStillUsed
Deprecated member 'copyDirectory' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void copyDirectory(@Nonnull File sourceDirectory, @Nonnull File destinationDirectory)
            throws IOException {
        Objects.requireNonNull(sourceDirectory);
```

### DeprecatedIsStillUsed
Deprecated member 'deleteDirectory' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void deleteDirectory(@Nonnull final File directory) throws IOException {
        if (!directory.exists()) {
            return;
```

### DeprecatedIsStillUsed
Deprecated member 'fileWrite' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void fileWrite(@Nonnull File file, @Nullable String encoding, @Nonnull String data)
            throws IOException {
        Charset charset = charset(encoding);
```

### DeprecatedIsStillUsed
Deprecated member 'forceDelete' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void forceDelete(@Nonnull final File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
```

### DeprecatedIsStillUsed
Deprecated member 'fileAppend' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void fileAppend(@Nonnull String fileName, @Nonnull String data) throws IOException {
        fileAppend(fileName, null, data);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'fileWriteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void fileWriteArray(@Nonnull File file, @Nullable String encoding, @Nullable String... data)
            throws IOException {
        Charset charset = charset(encoding);
```

### DeprecatedIsStillUsed
Deprecated member 'fileRead' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    public static String fileRead(@Nonnull File file, @Nullable String encoding) throws IOException {
        Charset charset = charset(encoding);

```

### DeprecatedIsStillUsed
Deprecated member 'fileAppend' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void fileAppend(@Nonnull String fileName, @Nullable String encoding, @Nonnull String data)
            throws IOException {
        Charset charset = charset(encoding);
```

### DeprecatedIsStillUsed
Deprecated member 'fileWriteArray' is still used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void fileWriteArray(@Nonnull File file, @Nullable String... data) throws IOException {
        fileWriteArray(file, null, data);
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
    public Object clone() {
        throw new RuntimeException("Do we ever clone this?");
        /*        Shell shell = new Shell();
        shell.setExecutable( getExecutable() );
        shell.setWorkingDirectory( getWorkingDirectory() );
```

### CommentedOutCode
Commented out code (18 lines)
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
                    // throw an
                    //      InterruptedException so that calls to waitUntilDone may be skipped.
                    //                    try
                    //                    {
                    //                        if ( inputFeeder != null )
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
    public Object clone() {
        throw new RuntimeException("Do we ever clone a commandline?");
        /*        Commandline c = new Commandline( (Shell) shell.clone() );
        c.addArguments( getArguments() );
         return c;*/
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/shared/utils/io/MatchPattern.java`
#### Snippet
```java
        List<String> ret = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(path, separator);
        while (st.hasMoreTokens()) {
            ret.add(st.nextToken());
        }
        return ret.toArray(new String[ret.size()]);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        int patIdxStart = 0;
        int patIdxEnd = patDirs.size() - 1;
        int strIdxStart = 0;
        int strIdxEnd = strDirs.size() - 1;

        // up to first '**'
        while (patIdxStart <= patIdxEnd && strIdxStart <= strIdxEnd) {
            String patDir = patDirs.get(patIdxStart);
            if ("**".equals(patDir)) {
                break;
            }
            if (!match(patDir, strDirs.get(strIdxStart), isCaseSensitive)) {
                return false;
            }
            patIdxStart++;
            strIdxStart++;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        int patIdxStart = 0;
        int patIdxEnd = patDirs.length - 1;
        int strIdxStart = 0;
        int strIdxEnd = tokenizedFileName.length - 1;

        // up to first '**'
        while (patIdxStart <= patIdxEnd && strIdxStart <= strIdxEnd) {
            String patDir = patDirs[patIdxStart];
            if (patDir.equals("**")) {
                break;
            }
            if (!match(patDir, tokenizedFileName[strIdxStart], isCaseSensitive)) {
                return false;
            }
            patIdxStart++;
            strIdxStart++;
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java

    static final Pattern ENCODING_PATTERN =
            Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);
}

```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java

    static final Pattern ENCODING_PATTERN =
            Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);
}

```

## RuleId[id=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
                    } finally {
                        ShutdownHookUtils.removeShutdownHook(processHook);
                        processHook.run();
                    }
                }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/shared/utils/WriterFactory.java`
#### Snippet
```java
    public static Writer newWriter(@Nonnull File file, @Nonnull String encoding)
            throws UnsupportedEncodingException, FileNotFoundException {
        return newWriter(new FileOutputStream(file), encoding);
    }
}
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
        Properties properties = new Properties();
        if (file != null) {
            try (InputStream in = new FileInputStream(file)) {
                properties.load(in);
            } catch (IllegalArgumentException | IOException ex) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
    @Deprecated
    public static Properties loadProperties(@Nonnull File file) {
        try (InputStream in = new FileInputStream(file)) {
            return loadProperties(in);
        } catch (Exception e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java
     */
    public XmlStreamReader(File file) throws IOException {
        this(new FileInputStream(file));
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/ReaderFactory.java`
#### Snippet
```java
    public static Reader newReader(@Nonnull File file, @Nonnull String encoding)
            throws FileNotFoundException, UnsupportedEncodingException {
        return new InputStreamReader(new FileInputStream(file), encoding);
    }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        }

        try (OutputStream out = new FileOutputStream(destination);
                InputStream in = source) {
            IOUtil.copy(in, out);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        }

        try (InputStream input1 = new FileInputStream(file1);
                InputStream input2 = new FileInputStream(file2)) {
            return IOUtils.contentEquals(input1, input2);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

        try (InputStream input1 = new FileInputStream(file1);
                InputStream input2 = new FileInputStream(file2)) {
            return IOUtils.contentEquals(input1, input2);
        }
```

## RuleId[id=Deprecation]
### Deprecation
'join(java.lang.Object\[\], java.lang.String)' is deprecated
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
     */
    public String toString() {
        return StringUtils.join(getShellCommandline(true), " ");
    }

```

### Deprecation
'getSystemEnvVars()' is deprecated
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java

    private void copySystemEnvironment() {
        Properties systemEnvVars = CommandLineUtils.getSystemEnvVars();

        for (Object o : systemEnvVars.keySet()) {
```

### Deprecation
'copy(java.io.Reader, java.io.Writer)' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                if (overwrite || !to.exists()) {
                    try (Writer fileWriter = Files.newBufferedWriter(to.toPath(), charset)) {
                        IOUtil.copy(wrapped, fileWriter);
                    }
                } else {
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            boolean getFiles,
            boolean getDirectories) {
        DirectoryScanner scanner = new DirectoryScanner();

        scanner.setBasedir(directory);
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            boolean getFiles,
            boolean getDirectories) {
        DirectoryScanner scanner = new DirectoryScanner();

        scanner.setBasedir(directory);
```

### Deprecation
'getIncludedFiles()' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

        if (getFiles) {
            String[] files = scanner.getIncludedFiles();

            for (String file : files) {
```

### Deprecation
'getIncludedDirectories()' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

        if (getDirectories) {
            String[] directories = scanner.getIncludedDirectories();

            for (String directory1 : directories) {
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    /**
     * @return the default excludes pattern
     * @see DirectoryScanner#DEFAULTEXCLUDES
     */
    @Nonnull
```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Nonnull
    public static String[] getDefaultExcludes() {
        return DirectoryScanner.DEFAULTEXCLUDES;
    }

```

### Deprecation
'join(java.lang.Object\[\], java.lang.String)' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            throw new IllegalArgumentException(
                    "The file (" + file.getAbsolutePath() + ") cannot contain any of the following characters: \n"
                            + StringUtils.join(INVALID_CHARACTERS_FOR_WINDOWS_FILE_NAME, " "));
        }

```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    /**
     * @return the default excludes pattern as comma separated string.
     * @see DirectoryScanner#DEFAULTEXCLUDES
     * @see StringUtils#join(Object[], String)
     */
```

### Deprecation
'join(java.lang.Object\[\], java.lang.String)' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     * @return the default excludes pattern as comma separated string.
     * @see DirectoryScanner#DEFAULTEXCLUDES
     * @see StringUtils#join(Object[], String)
     */
    @Nonnull
```

### Deprecation
'join(java.lang.Object\[\], java.lang.String)' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Nonnull
    public static String getDefaultExcludesAsString() {
        return StringUtils.join(DirectoryScanner.DEFAULTEXCLUDES, ",");
    }

```

### Deprecation
'org.apache.maven.shared.utils.io.DirectoryScanner' is deprecated
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    @Nonnull
    public static String getDefaultExcludesAsString() {
        return StringUtils.join(DirectoryScanner.DEFAULTEXCLUDES, ",");
    }

```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/maven/shared/utils/cli/shell/CmdShell.java`
#### Snippet
```java
     */
    public List<String> getCommandLine(String executable, String... arguments) {
        StringBuilder sb = new StringBuilder();
        sb.append('"');
        sb.append(super.getCommandLine(executable, arguments).get(0));
```

### StringBufferReplaceableByString
`StringBuffer` can be replaced with 'String'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
                return "";
            } else {
                return new StringBuffer(length)
                        .append(Character.toLowerCase(str.charAt(0)))
                        .append(str, 1, length)
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            return data;
        }
        StringBuilder result = new StringBuilder(data.length());
        result.append(titleCase);
        result.append(data, 1, data.length());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            throw new NullPointerException("overlay is null");
        }
        return new StringBuilder(start + overlay.length() + text.length() - end + 1)
                .append(text, 0, start)
                .append(overlay)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
                return "";
            } else {
                return new StringBuilder(length)
                        .append(Character.toTitleCase(str.charAt(0)))
                        .append(str, 1, length)
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    private List<Xpp3Dom> getChildrenList() {
        boolean isNothing = childList == null || childList.isEmpty();
        return isNothing ? Collections.<Xpp3Dom>emptyList() : childList;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public int read(char[] buf, int offset, int len) throws IOException {
        return reader.read(buf, offset, len);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/shared/utils/cli/shell/CmdShell.java`
#### Snippet
```java
     * </p>
     * <p>
     * Workaround for http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468220
     * </p>
     * <p>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
        Xpp3Dom result = null;

        private boolean spacePreserve = false;

        @Override
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
        } catch (final IOException e) {
            // JDK error in StringWriter.
            throw (AssertionError) new AssertionError("Unexpected IOException from StringWriter.").initCause(e);
        }
    }
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
        } catch (final IOException e) {
            // JDK error in StringWriter.
            throw (AssertionError) new AssertionError("Unexpected IOException from StringWriter.").initCause(e);
        }
    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        } catch (UnsupportedOperationException e) {
            // fallback to setting partial permissions
            destination.setExecutable(source.canExecute());
            destination.setReadable(source.canRead());
            destination.setWritable(source.canWrite());
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            // fallback to setting partial permissions
            destination.setExecutable(source.canExecute());
            destination.setReadable(source.canRead());
            destination.setWritable(source.canWrite());
        }
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            destination.setExecutable(source.canExecute());
            destination.setReadable(source.canRead());
            destination.setWritable(source.canWrite());
        }
    }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java
                return true;
            }
            if (formal == Double.TYPE
                    && (actual == Float.TYPE
                            || actual == Long.TYPE
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java
                return true;
            }
            if (formal == Double.TYPE
                    && (actual == Double.class
                            || actual == Float.class
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        if (!isCaseSensitive) {
            // NOTE: Try both upper case and lower case as done by String.equalsIgnoreCase()
            if (Character.toUpperCase(c1) == Character.toUpperCase(c2)
                    || Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
                return true;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `newChars` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                        int n;
                        while (-1 != (n = wrapped.read(newChars))) {
                            ((Buffer) newChars).flip();

                            coderResult = encoder.encode(newChars, newBytes, n != 0);
```

### RedundantCast
Casting `newBytes` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                            }

                            ((Buffer) newBytes).flip();

                            if (!writing) {
```

### RedundantCast
Casting `existingBytes` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                            if (!writing) {
                                existingRead = existing.read(existingBytes.array(), 0, newBytes.remaining());
                                ((Buffer) existingBytes).position(existingRead);
                                ((Buffer) existingBytes).flip();

```

### RedundantCast
Casting `existingBytes` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                                existingRead = existing.read(existingBytes.array(), 0, newBytes.remaining());
                                ((Buffer) existingBytes).position(existingRead);
                                ((Buffer) existingBytes).flip();

                                if (newBytes.compareTo(existingBytes) != 0) {
```

### RedundantCast
Casting `newChars` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                            }

                            ((Buffer) newChars).clear();
                            ((Buffer) newBytes).clear();
                            ((Buffer) existingBytes).clear();
```

### RedundantCast
Casting `newBytes` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

                            ((Buffer) newChars).clear();
                            ((Buffer) newBytes).clear();
                            ((Buffer) existingBytes).clear();
                        }
```

### RedundantCast
Casting `existingBytes` to `Buffer` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                            ((Buffer) newChars).clear();
                            ((Buffer) newBytes).clear();
                            ((Buffer) existingBytes).clear();
                        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/maven/shared/utils/logging/MessageUtils.java`
#### Snippet
```java
    /**
     * Undo a previous {@link #systemInstall()}.  If {@link #systemInstall()} was called
     * multiple times, {@link #systemUninstall()} must be called call the same number of times before
     * it is actually uninstalled.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     * @param isCaseSensitive true if case sensitive
     * @return a list of files as String
     * @throws IOException
     */
    @Nonnull
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    private static final long serialVersionUID = 2567894443061173996L;

    private String name; // plexus: protected

    private String value; // plexus: protected
```

### FieldMayBeFinal
Field `elementStack` may be 'final'
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private PrintWriter writer;

    private ArrayList<String> elementStack = new ArrayList<String>();

    private boolean processingElement = false;
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private static final char[] DEFAULT_LINE_INDENT = new char[] {' ', ' '};

    private PrintWriter writer;

    private ArrayList<String> elementStack = new ArrayList<String>();
```

### FieldMayBeFinal
Field `methodMap` may be 'final'
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
    private final Map<String, Object> methodCache = new Hashtable<String, Object>();

    private MethodMap methodMap = new MethodMap();

    /**
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `src/main/java/org/apache/maven/shared/utils/logging/PlainMessageBuilder.java`
#### Snippet
```java
 */
class PlainMessageBuilder implements MessageBuilder, LoggerLevelRenderer {
    private StringBuilder buffer;

    PlainMessageBuilder() {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `systemIn` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/javatool/AbstractJavaTool.java`
#### Snippet
```java
     */
    protected InputStream createSystemInputStream() {
        InputStream systemIn = new InputStream() {

            /**
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/javatool/AbstractJavaTool.java`
#### Snippet
```java

        // execute it
        JavaToolResult result = executeCommandLine(cli, request);

        // return result
```

### UnnecessaryLocalVariable
Local variable `totalBufferSize` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                    CharsetEncoder encoder = charset.newEncoder();

                    int totalBufferSize = FILE_COPY_BUFFER_SIZE;

                    int charBufferSize = (int) Math.floor(totalBufferSize / (2 + 2 * encoder.maxBytesPerChar()));
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\".[^\"]*\")`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java

    static final Pattern ENCODING_PATTERN =
            Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);
}

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'.[^']*')`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java

    static final Pattern ENCODING_PATTERN =
            Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", Pattern.MULTILINE);
}

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/maven/shared/utils/cli/shell/CmdShell.java`
#### Snippet
```java
        sb.append('"');

        return Arrays.asList(sb.toString());
    }
}
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `CLASS_ARGS`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
        String methodName = "get" + methodBase;
        try {
            Method method = classMap.findMethod(methodName, CLASS_ARGS);

            if (method == null) {
```

### NullArgumentToVariableArgMethod
Confusing argument `CLASS_ARGS`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
                methodName = "is" + methodBase;

                method = classMap.findMethod(methodName, CLASS_ARGS);
            }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `depth` initializer `0` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private boolean endOnSameLine = false;

    private int depth = 0;

    private char[] lineIndent;
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
                // use get method on List interface
                Object[] localParams = new Object[] {index};
                Method method = null;
                try {
                    method = classMap.findMethod("get", localParams);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomWriter.java`
#### Snippet
```java

        String value = dom.getValue();
        if (value != null) {
            if (escape) {
                xmlWriter.writeText(value);
```

### ConstantValue
Value `childMergeOverride` is always 'true'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomUtils.java`
#### Snippet
```java
                    } else if (it.hasNext()) {
                        Xpp3Dom dominantChild = it.next();
                        merge(dominantChild, recessiveChild, childMergeOverride);
                    }
                }
```

### ConstantValue
Condition `valueParameter == null` is always `false`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
     */
    public void setAttribute(@Nonnull String nameParameter, @Nonnull String valueParameter) {
        if (valueParameter == null) {
            throw new NullPointerException("value can not be null");
        }
```

### ConstantValue
Condition `nameParameter == null` is always `false`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
            throw new NullPointerException("value can not be null");
        }
        if (nameParameter == null) {
            throw new NullPointerException("name can not be null");
        }
```

### ConstantValue
Condition `overlay == null` is always `false`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Nonnull
    public static String overlayString(@Nonnull String text, @Nonnull String overlay, int start, int end) {
        if (overlay == null) {
            throw new NullPointerException("overlay is null");
        }
```

### ConstantValue
Value `fast` is always 'true'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
                            dirsIncluded.add(name);
                            if (fast) {
                                scandir(file, name + File.separator, fast);

                                if (ScanConductor.ScanAction.ABORT.equals(scanAction)) {
```

### ConstantValue
Value `fast` is always 'true'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
                        dirsExcluded.add(name);
                        if (fast && couldHoldIncluded(name)) {
                            scandir(file, name + File.separator, fast);
                            if (ScanConductor.ScanAction.ABORT.equals(scanAction)) {
                                return;
```

### ConstantValue
Value `fast` is always 'true'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
                            dirsNotIncluded.add(name);

                            scandir(file, name + File.separator, fast);
                            if (ScanConductor.ScanAction.ABORT.equals(scanAction)) {
                                return;
```

### ConstantValue
Value `fast` is always 'false'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
                }
                if (!fast) {
                    scandir(file, name + File.separator, fast);
                    if (ScanConductor.ScanAction.ABORT.equals(scanAction)) {
                        return;
```

### ConstantValue
Condition `i < data.length` is always `true`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            for (int i = 0; data != null && i < data.length; i++) {
                writer.write(data[i]);
                if (i < data.length) {
                    writer.write("\n");
                }
```

