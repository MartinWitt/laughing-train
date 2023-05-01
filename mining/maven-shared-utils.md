# maven-shared-utils 
 
# Bad smells
I found 328 bad smells with 55 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 55 | false |
| DeprecatedIsStillUsed | 48 | false |
| AssignmentToMethodParameter | 45 | false |
| ToArrayCallWithZeroLengthArrayArgument | 21 | true |
| UnnecessaryFullyQualifiedName | 16 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| SizeReplaceableByIsEmpty | 14 | true |
| RedundantFieldInitialization | 14 | false |
| NestedAssignment | 11 | false |
| ConstantValue | 9 | false |
| ZeroLengthArrayInitialization | 8 | false |
| StringBufferReplaceableByString | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| EmptyMethod | 4 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryStringEscape | 3 | true |
| CommentedOutCode | 3 | false |
| ObsoleteCollection | 3 | false |
| MissortedModifiers | 3 | false |
| StringEqualsEmptyString | 3 | false |
| UtilityClassWithPublicConstructor | 3 | false |
| IgnoreResultOfCall | 3 | false |
| SystemOutErr | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| SynchronizeOnThis | 3 | false |
| IOResource | 2 | false |
| RegExpSimplifiable | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| RedundantSuppression | 2 | false |
| UnnecessaryInitCause | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| NullArgumentToVariableArgMethod | 2 | false |
| UnusedAssignment | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| ThreadRun | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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
Call to `toArray()` with pre-sized array argument 'new String\[result.size()\]'
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
        }

        return result.toArray(new String[result.size()]);
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
Call to `toArray()` with pre-sized array argument 'new String\[filesIncluded.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        }

        return diffFiles(oldFiles, filesIncluded.toArray(new String[filesIncluded.size()]));
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
Call to `toArray()` with pre-sized array argument 'new String\[lines.size()\]'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        List<String> lines = loadFile(file);

        return lines.toArray(new String[lines.size()]);
    }

```

## RuleId[id=IOResource]
### IOResource
'BufferedInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
    public static boolean contentEquals(@Nonnull final InputStream input1, @Nonnull final InputStream input2)
            throws IOException {
        final InputStream bufferedInput1 = new BufferedInputStream(input1);
        final InputStream bufferedInput2 = new BufferedInputStream(input2);

```

### IOResource
'BufferedInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
            throws IOException {
        final InputStream bufferedInput1 = new BufferedInputStream(input1);
        final InputStream bufferedInput2 = new BufferedInputStream(input2);

        int ch = bufferedInput1.read();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomWriter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomWriter.java`
#### Snippet
```java
 * @author Brett Porter
 */
public class Xpp3DomWriter {
    /**
     * @param writer {@link Writer}
```

### UtilityClassWithoutPrivateConstructor
Class `MessageUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/logging/MessageUtils.java`
#### Snippet
```java
 * @since 3.1.0
 */
public class MessageUtils {
    private static final boolean JANSI;

```

### UtilityClassWithoutPrivateConstructor
Class `XmlWriterUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java
 *
 */
public class XmlWriterUtil {
    /** The vm line separator */
    public static final String LS = System.getProperty("line.separator");
```

### UtilityClassWithoutPrivateConstructor
Class `Java7Support` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/io/Java7Support.java`
#### Snippet
```java
 */
@Deprecated
public class Java7Support {
    /**
     * @param file The file to check for being a symbolic link.
```

### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomBuilder` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 */
public class Xpp3DomBuilder {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
 * Static utility methods for loading properties.
 */
public class PropertyUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `XMLEncode` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/xml/XMLEncode.java`
#### Snippet
```java
 * &quot; and &apos;. These must be encoded/decoded from/to XML.
 */
final class XMLEncode {

    private static final int CDATA_BLOCK_THRESHOLD_LENGTH = 12;
```

### UtilityClassWithoutPrivateConstructor
Class `Xpp3DomUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomUtils.java`
#### Snippet
```java
 *
 */
public class Xpp3DomUtils {
    /**
     * @param dominant {@link Xpp3Dom}
```

### UtilityClassWithoutPrivateConstructor
Class `WriterFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/WriterFactory.java`
#### Snippet
```java
 * @see <a href="https://docs.oracle.com/javase/7/docs/technotes/guides/intl/encoding.doc.html">Supported encodings</a>
 */
public class WriterFactory {
    /**
     * ISO Latin Alphabet #1, also known as ISO-LATIN-1.
```

### UtilityClassWithoutPrivateConstructor
Class `ReaderFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/ReaderFactory.java`
#### Snippet
```java
 * @see <a href="https://docs.oracle.com/javase/7/docs/technotes/guides/intl/encoding.doc.html">Supported encodings</a>
 */
public class ReaderFactory {
    /**
     * ISO Latin Alphabet #1, also known as ISO-LATIN-1.
```

### UtilityClassWithoutPrivateConstructor
Class `PathTool` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
 * </p>
 */
public class PathTool {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShutdownHookUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/cli/ShutdownHookUtils.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 */
public class ShutdownHookUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
 *
 */
public class StringUtils {
    /**
     * <p><code>StringUtils</code> instances should NOT be constructed in
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
 * @author <a href="mailto:jefft@apache.org">Jeff Turner</a>
 */
public class FileUtils {
    /**
     * protected constructor.
```

## RuleId[id=DataFlowIssue]
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
Argument `actual` might be null
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java
         */

        if (formal.isAssignableFrom(actual)) {
            return true;
        }
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=DeprecatedIsStillUsed]
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
    public static java.util.Properties loadProperties(@Nonnull URL url) {
        try (InputStream in = url.openStream()) {
            return loadProperties(in);
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
    public static byte[] toByteArray(@Nonnull final Reader input, final int bufferSize) throws IOException {
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
    public static byte[] toByteArray(@Nonnull final InputStream input) throws IOException {
        return toByteArray(input, DEFAULT_BUFFER_SIZE);
    }
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
    public static String fileRead(@Nonnull File file) throws IOException {
        return fileRead(file, null);
    }
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
 */
public class Commandline implements Cloneable {
    private final List<Arg> arguments = new Vector<>();

    private final Map<String, String> envVars = Collections.synchronizedMap(new LinkedHashMap<String, String>());
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
     * name and actual arguments used to find it.
     */
    private final Map<String, Object> methodCache = new Hashtable<String, Object>();

    private MethodMap methodMap = new MethodMap();
```

### ObsoleteCollection
Obsolete collection type `Hashtable`> used
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java
     * Keep track of all methods with the same name.
     */
    private final Map<String, List<Method>> methodByNameMap = new Hashtable<String, List<Method>>();

    /**
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `envVars.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java

        List<String> environmentVars = new ArrayList<>();
        for (String name : envVars.keySet()) {
            String value = envVars.get(name);
            if (value != null) {
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`toProcess.length() == 0` can be replaced with 'toProcess.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
     */
    public static String[] translateCommandline(String toProcess) throws CommandLineException {
        if ((toProcess == null) || (toProcess.length() == 0)) {
            return new String[0];
        }
```

### SizeReplaceableByIsEmpty
`dominantChildren.size() > 0` can be replaced with '!dominantChildren.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomUtils.java`
#### Snippet
```java
        for (String childName : recessive.childMap.keySet()) {
            List<Xpp3Dom> dominantChildren = dominant.getChildrenList(childName);
            if (dominantChildren.size() > 0) {
                commonChildren.put(childName, dominantChildren.iterator());
            }
```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomUtils.java`
#### Snippet
```java
    @Deprecated
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
```

### SizeReplaceableByIsEmpty
`basedir.length() == 0` can be replaced with 'basedir.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
         */
        if (basedir == null
                || basedir.length() == 0
                || filename == null
                || filename.length() == 0
```

### SizeReplaceableByIsEmpty
`filename.length() == 0` can be replaced with 'filename.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
                || basedir.length() == 0
                || filename == null
                || filename.length() == 0
                || !filename.startsWith(basedir)) {
            return "";
```

### SizeReplaceableByIsEmpty
`filename.length() == 0` can be replaced with 'filename.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
    @Nonnull
    private static String determineRelativePath(@Nonnull String filename, @Nonnull String separator) {
        if (filename.length() == 0) {
            return "";
        }
```

### SizeReplaceableByIsEmpty
`executable.length() == 0` can be replaced with 'executable.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
     */
    public void setExecutable(String executable) {
        if ((executable == null) || (executable.length() == 0)) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    @Deprecated
    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0;
    }

```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
    @Deprecated
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isNotEmpty(@Nullable String str) {
        return ((str != null) && (str.length() > 0));
    }

```

### SizeReplaceableByIsEmpty
`repl.length() == 0` can be replaced with 'repl.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static String replace(@Nullable String text, @Nullable String repl, @Nullable String with, int max) {
        if ((text == null) || (repl == null) || (with == null) || (repl.length() == 0)) {
            return text;
        }
```

### SizeReplaceableByIsEmpty
`str.trim().length() == 0` can be replaced with 'str.trim().isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isEmpty(@Nullable String str) {
        return ((str == null) || (str.trim().length() == 0));
    }

```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Nonnull
    public static String chompLast(@Nonnull String str, @Nonnull String sep) {
        if (str.length() == 0) {
            return str;
        }
```

### SizeReplaceableByIsEmpty
`line.length() != 0` can be replaced with '!line.isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    line = line.trim();
                    if (!line.startsWith("#") && line.length() != 0) {
                        lines.add(line);
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            if (s.charAt(i) == '\r') {
                if ((i + 1) < length && s.charAt(i + 1) == '\n') {
                    i++;
                }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            try (BufferedReader reader = Files.newBufferedReader(file.toPath(), Charset.defaultCharset())) {
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    line = line.trim();
                    if (!line.startsWith("#") && line.length() != 0) {
                        lines.add(line);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CommandLineUtils` has no concrete subclass
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l </a>
 */
public abstract class CommandLineUtils {

    /**
```

### AbstractClassNeverImplemented
Abstract class `AbstractJavaTool` has no concrete subclass
in `src/main/java/org/apache/maven/shared/utils/cli/javatool/AbstractJavaTool.java`
#### Snippet
```java
 * @param <Request> Tool-specific request type
 */
public abstract class AbstractJavaTool<Request extends JavaToolRequest> implements JavaTool<Request> {
    private final Logger logger = LoggerFactory.getLogger(getClass());

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Nonnull
    public static Properties loadOptionalProperties(final @Nullable InputStream inputStream) {

        Properties properties = new Properties();
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Nonnull
    public static Properties loadOptionalProperties(final @Nullable File file) {
        Properties properties = new Properties();
        if (file != null) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Nonnull
    public static Properties loadOptionalProperties(final @Nullable URL url) {

        Properties properties = new Properties();
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Nonnull
    public static String chop(@Nonnull String str) {
        if ("".equals(str)) {
            return "";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static int countMatches(@Nullable String str, @Nonnull String sub) {
        if (sub.equals("")) {
            return 0;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        String ext = extension(filename);

        if ("".equals(ext)) {
            return filename;
        }
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/main/java/org/apache/maven/shared/utils/logging/MessageUtils.java`
#### Snippet
```java
        if (JANSI && shutdownHook == null) {
            // No shutdown hook registered yet.
            shutdownHook = new Thread() {
                @Override
                public void run() {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
    public static void fileDelete(@Nonnull String fileName) {
        File file = new File(fileName);
        //noinspection ResultOfMethodCallIgnored
        deleteLegacyStyle(file);
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java

        private void appendToTopValue(String toAppend) {
            // noinspection MismatchedQueryAndUpdateOfStringBuilder
            StringBuilder stringBuilder = values.get(values.size() - 1);
            stringBuilder.append(toAppend);
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

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `PropertyUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
 * Static utility methods for loading properties.
 */
public class PropertyUtils {

    /**
```

### UtilityClassWithPublicConstructor
Class `PathTool` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
 * </p>
 */
public class PathTool {

    /**
```

### UtilityClassWithPublicConstructor
Class `StringUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
 *
 */
public class StringUtils {
    /**
     * <p><code>StringUtils</code> instances should NOT be constructed in
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/shared/utils/cli/DefaultConsumer.java`
#### Snippet
```java
    @Override
    public void consumeLine(String line) throws IOException {
        System.out.println(line);
        if (System.out.checkError()) {
            throw new IOException(String.format("Failure writing line '%s' to stdout.", line));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/shared/utils/cli/DefaultConsumer.java`
#### Snippet
```java
    public void consumeLine(String line) throws IOException {
        System.out.println(line);
        if (System.out.checkError()) {
            throw new IOException(String.format("Failure writing line '%s' to stdout.", line));
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
                final String msg = "IOException caught while checking " + "for links, couldn't get canonical path!";
                // will be caught and redirected to Ant's logging system
                System.err.println(msg);
                noLinks.add(newfile);
            }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `XmlStreamWriter` is the same as one of its superclass' names
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamWriter.java`
#### Snippet
```java
 */
@Deprecated
public class XmlStreamWriter extends org.apache.commons.io.output.XmlStreamWriter {
    /**
     * @param out {@link OutputStream}
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
     *     StandardCopyOption.REPLACE_EXISTING)}
     */
    public static void copyURLToFile(@Nonnull final URL source, @Nonnull final File destination) throws IOException {
        copyStreamToFile(source.openStream(), destination);
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/shared/utils/logging/MessageUtils.java`
#### Snippet
```java
     */
    public static String stripAnsiCodes(String msg) {
        return msg.replaceAll("\u001B\\[[;\\d]*[ -/]*[@-~]", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/shared/utils/cli/shell/BourneShell.java`
#### Snippet
```java
        }

        return "'" + path.replace("'", "'\"'\"'") + "'";
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java

        // strip any leading slashes if its a windows path
        if (toPath.matches("^\\[a-zA-Z]:")) {
            toPath = toPath.substring(1);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
            toPath = toPath.substring(1);
        }
        if (fromPath.matches("^\\[a-zA-Z]:")) {
            fromPath = fromPath.substring(1);
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/io/Java7Support.java`
#### Snippet
```java
 * @author Kristian Rosenvold
 *
 * @deprecated no longer needed, prefer to use {@link java.nio.file.Files} methods directly.
 */
@Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax.helpers` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java

        try {
            return org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
        } finally {
            if (oldParser != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     * @param file the file from which the properties will be loaded
     * @return the loaded properties
     * @deprecated use {@link #loadOptionalProperties(java.io.File)} instead. This method should not
     *             be used as it suppresses exceptions silently when loading properties fails and returns {@code null}
     *             instead of an empty {@code Properties} instance when the given {@code File} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     * @param is {@link InputStream}
     * @return the loaded properties
     * @deprecated use {@link #loadOptionalProperties(java.io.InputStream)} instead. This method
     *             should not be used as it suppresses exceptions silently when loading properties fails.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     * @param url the URL which should be used to load the properties
     * @return the loaded properties
     * @deprecated use {@link #loadOptionalProperties(java.net.URL)} instead. This method should not
     *             be used as it suppresses exceptions silently when loading properties fails and returns {@code null}
     *             instead of an empty {@code Properties} instance when the given {@code URL} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static java.util.Properties loadProperties(@Nonnull URL url) {
        try (InputStream in = url.openStream()) {
            return loadProperties(in);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.shared.utils.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/io/ScanConductor.java`
#### Snippet
```java
 * <p>Visitor pattern for the DirectoryScanner. A ScanConductor controls the scanning process.</p>
 * <p>Create an instance and pass it to
 * {@link org.apache.maven.shared.utils.io.DirectoryScanner#setScanConductor(ScanConductor)}.
 * You will get notified about every visited directory and file. You can use the {@link ScanAction}
 * to control what should happen next.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/io/ScanConductor.java`
#### Snippet
```java

        /**
         * This response is only valid for {@link ScanConductor#visitDirectory(String, java.io.File)}.
         * Do not recurse into the current directory. The current directory will not be added
         * and the processing will be continued with the next item in the list.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
/**
 * A cache of introspection information for a specific class instance.
 * Keys {@link java.lang.reflect.Method} objects by a concatenation of the
 * method name and the names of classes that make up the parameters.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
 * <p>Imagine that an InputStream's read() is a very expensive operation, which would usually suggest
 * wrapping in a BufferedInputStream. The BufferedInputStream works by issuing infrequent
 * {@link java.io.InputStream#read(byte[] b, int off, int len)} requests on the underlying InputStream, to
 * fill an internal buffer, from which further <code>read</code> requests can inexpensively get
 * their data (until the buffer runs out).</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     *
     * <p>If whitespace is wanted to be removed, used the
     * {@link #strip(java.lang.String)} method.</p>
     *
     * @param str   the String to remove a string from
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     * @return <code>true</code> if the Strings are equal, case sensitive, or
     *         both <code>null</code>
     * @see java.lang.String#equals(Object)
     * @deprecated use {@code java.lang.Objects.equals()}
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     * @return <code>true</code> if the Strings are equal, case insensitive, or
     *         both <code>null</code>
     * @see java.lang.String#equalsIgnoreCase(String)
     */
    public static boolean equalsIgnoreCase(String str1, String str2) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     * @param str the String to check
     * @return the trimmed text (or <code>null</code>)
     * @see java.lang.String#trim()
     */
    public static String trim(String str) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     * @param str the String to check
     * @return the trimmed text (never <code>null</code>)
     * @see java.lang.String#trim()
     */
    @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
 * clean} a directory.
 * </p>
 * <p>Common {@link java.io.File} manipulation routines.</p>
 * <p>
 * Taken from the commons-utils repo.
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/cli/StreamFeeder.java`
#### Snippet
```java
    public void run() {
        try {
            for (int data; !isInterrupted() && (data = input.read()) != -1; ) {
                output.write(data);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
        final char[] buffer = new char[bufferSize];
        int n;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/IOUtil.java`
#### Snippet
```java
        final byte[] buffer = new byte[bufferSize];
        int n;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        // Process characters before first star
        // CHECKSTYLE_OFF: InnerAssignment
        while ((ch = patArr[patIdxStart]) != '*' && strIdxStart <= strIdxEnd)
        // CHECKSTYLE_ON: InnerAssignment
        {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        // Process characters after last star
        // CHECKSTYLE_OFF: InnerAssignment
        while ((ch = patArr[patIdxEnd]) != '*' && strIdxStart <= strIdxEnd)
        // CHECKSTYLE_ON: InnerAssignment
        {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        int strLen;
        // CHECKSTYLE_OFF: InnerAssignment
        if (str == null || (strLen = str.length()) == 0)
        // CHECKSTYLE_ON: InnerAssignment
        {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder(text.length());
        int start = 0, end;
        while ((end = text.indexOf(repl, start)) != -1) {
            buf.append(text, start, end).append(with);
            start = end + repl.length();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        String filename = url.getFile().replace('/', File.separatorChar);
        int pos = -1;
        while ((pos = filename.indexOf('%', pos + 1)) >= 0) {
            if (pos + 2 < filename.length()) {
                String hexStr = filename.substring(pos + 1, pos + 3);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            int count;
            char[] b = new char[512];
            while ((count = reader.read(b)) >= 0) // blocking read
            {
                buf.append(b, 0, count);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                    try (RandomAccessFile existing = new RandomAccessFile(to, "rw")) {
                        int n;
                        while (-1 != (n = wrapped.read(newChars))) {
                            ((Buffer) newChars).flip();

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `shutdownHook` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/shared/utils/logging/MessageUtils.java`
#### Snippet
```java

    /** Reference to the JVM shutdown hook, if registered */
    private static Thread shutdownHook;

    /** Synchronization monitor for the "uninstall" */
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
        Properties envVars = new Properties();
        for (Map.Entry<String, String> entry : envs.entrySet()) {
            envVars.put(
                    !preserveKeyCase ? entry.getKey().toUpperCase(Locale.ENGLISH) : entry.getKey(), entry.getValue());
        }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
     */
    @Deprecated
    public void addSystemEnvironment() {}

    private void copySystemEnvironment() {
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/maven/shared/utils/cli/StreamPumper.java`
#### Snippet
```java
     */
    @Deprecated
    public void flush() {
        // Nothing to flush.
    }
```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/maven/shared/utils/cli/StreamPumper.java`
#### Snippet
```java
     */
    @Deprecated
    public void close() {
        // Nothing to close.
    }
```

### EmptyMethod
All implementations of this method are empty
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryWalkListener.java`
#### Snippet
```java
     * @param message the message for the debugging output
     */
    void debug(String message);
}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/StreamPumper.java`
#### Snippet
```java
    private final StreamConsumer consumer;

    private volatile Exception exception = null;

    private static final int SIZE = 1024;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
        private final List<StringBuilder> values = new ArrayList<StringBuilder>();

        Xpp3Dom result = null;

        private boolean spacePreserve = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
        Xpp3Dom result = null;

        private boolean spacePreserve = false;

        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
    private boolean singleQuotedArgumentEscaped = false;

    private boolean singleQuotedExecutableEscaped = false;

    private char argQuoteDelimiter = '\"';
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
    private boolean quotedArgumentsEnabled = true;

    private boolean unconditionalQuoting = false;

    private String executable;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
    private boolean quotedExecutableEnabled = true;

    private boolean singleQuotedArgumentEscaped = false;

    private boolean singleQuotedExecutableEscaped = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private boolean processingElement = false;

    private boolean documentStarted = false;

    private boolean endOnSameLine = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private ArrayList<String> elementStack = new ArrayList<String>();

    private boolean processingElement = false;

    private boolean documentStarted = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private boolean documentStarted = false;

    private boolean endOnSameLine = false;

    private int depth = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private boolean endOnSameLine = false;

    private int depth = 0;

    private char[] lineIndent;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/XmlStreamReader.java`
#### Snippet
```java
    private final org.apache.commons.io.input.XmlStreamReader reader;

    private static String staticDefaultEncoding = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
     * A {@link ScanConductor} an control the scanning process.
     */
    private ScanConductor scanConductor = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
     * The last ScanAction. We need to store this in the instance as the scan() method doesn't return
     */
    private ScanConductor.ScanAction scanAction = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
     * Whether or not our results were built by a slow scan.
     */
    private boolean haveSlowResults = false;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (indent < 0) {
            indent = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `indentSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (indentSize < 0) {
            indentSize = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `comment`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java
            throws IOException {
        if (comment == null) {
            comment = "null";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (indent < 0) {
            indent = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `indentSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (indentSize < 0) {
            indentSize = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `columnSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (columnSize < 0) {
            columnSize = DEFAULT_COLUMN_LINE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java
            throws IOException {
        if (indent < 0) {
            indent = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `indentSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (indentSize < 0) {
            indentSize = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `columnSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java

        if (columnSize < 0) {
            columnSize = DEFAULT_COLUMN_LINE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `columnSize`
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java
    public static void writeCommentLineBreak(XMLWriter writer, int columnSize) throws IOException {
        if (columnSize < 10) {
            columnSize = DEFAULT_COLUMN_LINE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
        }
        if (path.length() >= 2 && path.charAt(1) == ':') {
            path = Character.toUpperCase(path.charAt(0)) + path.substring(1);
        }
        return path;
```

### AssignmentToMethodParameter
Assignment to method parameter `basedir`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
     */
    public static String getRelativePath(@Nullable String basedir, @Nullable String filename) {
        basedir = uppercaseDrive(basedir);
        filename = uppercaseDrive(filename);

```

### AssignmentToMethodParameter
Assignment to method parameter `filename`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
    public static String getRelativePath(@Nullable String basedir, @Nullable String filename) {
        basedir = uppercaseDrive(basedir);
        filename = uppercaseDrive(filename);

        /*
```

### AssignmentToMethodParameter
Assignment to method parameter `basedir`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
         */
        String separator = determineSeparator(filename);
        basedir = StringUtils.chompLast(basedir, separator);
        filename = StringUtils.chompLast(filename, separator);

```

### AssignmentToMethodParameter
Assignment to method parameter `filename`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
        String separator = determineSeparator(filename);
        basedir = StringUtils.chompLast(basedir, separator);
        filename = StringUtils.chompLast(filename, separator);

        /*
```

### AssignmentToMethodParameter
Assignment to method parameter `upcastCount`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
                    if (!methodInfo.upcast) {
                        methodInfo.tryUpcasting(clazz);
                        upcastCount++;
                    }
                } catch (NoSuchMethodException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `upcastCount`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java

        if (superclazz != null) {
            upcastCount = getAccessibleMethods(superclazz, methodInfos, upcastCount);

            /*
```

### AssignmentToMethodParameter
Assignment to method parameter `upcastCount`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java

        for (int i = interfaces.length; i-- > 0; ) {
            upcastCount = getAccessibleMethods(interfaces[i], methodInfos, upcastCount);

            /*
```

### AssignmentToMethodParameter
Assignment to method parameter `newfiles`
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
            }
        }
        newfiles = noLinks.toArray(new String[noLinks.size()]);
        return newfiles;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
                && pattern.startsWith(REGEX_HANDLER_PREFIX)
                && pattern.endsWith(PATTERN_HANDLER_SUFFIX)) {
            pattern = pattern.substring(
                    REGEX_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());

```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
                    && pattern.startsWith(ANT_HANDLER_PREFIX)
                    && pattern.endsWith(PATTERN_HANDLER_SUFFIX)) {
                pattern = pattern.substring(
                        ANT_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `src/main/java/org/apache/maven/shared/utils/io/SelectorUtils.java`
#### Snippet
```java
        } else {
            if (isAntPrefixedPattern(pattern)) {
                pattern = pattern.substring(
                        ANT_HANDLER_PREFIX.length(), pattern.length() - PATTERN_HANDLER_SUFFIX.length());
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static String strip(String str, @Nullable String delim) {
        str = stripStart(str, delim);
        return stripEnd(str, delim);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `separator`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String join(@Nonnull Object[] array, @Nullable String separator) {
        if (separator == null) {
            separator = "";
        }
        int arraySize = array.length;
```

### AssignmentToMethodParameter
Assignment to method parameter `separator`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String join(@Nonnull Iterator<?> iterator, String separator) {
        if (separator == null) {
            separator = "";
        }
        StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        if (offset > s.length()) {
            offset = s.length();
        }
        if ((s.length() - offset) < (maxWidth - 3)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        if ((s.length() - offset) < (maxWidth - 3)) {
            offset = s.length() - (maxWidth - 3);
        }
        if (offset <= 4) {
```

### AssignmentToMethodParameter
Assignment to method parameter `ls`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java

        if (ls == null) {
            ls = System.getProperty("line.separator");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            return str;
        }
        str = leftPad(str, sz + p / 2, delim);
        str = rightPad(str, size, delim);
        return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        str = leftPad(str, sz + p / 2, delim);
        str = rightPad(str, size, delim);
        return str;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `max`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            start = end + repl.length();

            if (--max == 0) {
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            String value = obj.toString();

            text = replace(text, "${" + key + "}", value);

            if (!key.contains(" ")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java

            if (!key.contains(" ")) {
                text = replace(text, "$" + key, value);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Nonnull
    public static String leftPad(@Nonnull String str, int size, @Nonnull String delim) {
        size = (size - str.length()) / delim.length();
        if (size > 0) {
            str = repeat(delim, size) + str;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        size = (size - str.length()) / delim.length();
        if (size > 0) {
            str = repeat(delim, size) + str;
        }
        return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        // handle negatives, which means last n characters
        if (start < 0) {
            start = str.length() + start; // remember start is negative
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java

        if (start < 0) {
            start = 0;
        }
        if (start > str.length()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    @Nonnull
    public static String rightPad(@Nonnull String str, int size, @Nonnull String delim) {
        size = (size - str.length()) / delim.length();
        if (size > 0) {
            str += repeat(delim, size);
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        size = (size - str.length()) / delim.length();
        if (size > 0) {
            str += repeat(delim, size);
        }
        return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        // handle negatives
        if (end < 0) {
            end = str.length() + end; // remember end is negative
        }
        if (start < 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        if (start < 0) {
            start = str.length() + start; // remember start is negative
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        if (end > str.length()) {
            // check this works.
            end = str.length();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java

        if (start < 0) {
            start = 0;
        }
        if (end < 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        if (end < 0) {
            end = 0;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
        if (!deleteLegacyStyle(file)) {
            if (Os.isFamily(Os.FAMILY_WINDOWS)) {
                file = file.getCanonicalFile();
            }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-05-01-07-16-53.779.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/logging/Style.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
            return (XMLReader) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            return null;
        } catch (InstantiationException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
            return null;
        } catch (InstantiationException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3DomBuilder.java`
#### Snippet
```java
            return null;
        } catch (IllegalAccessException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PropertyUtils.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/XMLEncode.java`
#### Snippet
```java
    private static String xmlEncodeTextAsCDATABlock(String text) {
        if (text == null) {
            return null;
        }
        if (!text.contains("]]>")) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/XMLEncode.java`
#### Snippet
```java
            return "<![CDATA[" + text + "]]>";
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/shell/BourneShell.java`
#### Snippet
```java
    protected String getExecutionPreamble() {
        if (getWorkingDirectoryAsString() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/shell/BourneShell.java`
#### Snippet
```java
    protected String quoteOneItem(String path, boolean isExecutable) {
        if (path == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
    static String uppercaseDrive(@Nullable String path) {
        if (path == null) {
            return null;
        }
        if (path.length() >= 2 && path.charAt(1) == ':') {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
            // they both have drive path element but they dont match, no
            // relative path
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/PathTool.java`
#### Snippet
```java
            // one has a drive path element and the other doesnt, no relative
            // path.
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            // delimiter MUST be present
            if (idx <= start || idx >= expression.length()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            }
        } catch (NumberFormatException e) {
            return null;
        } catch (InvocationTargetException e) {
            // catch array index issues gracefully, otherwise release
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            // catch array index issues gracefully, otherwise release
            if (e.getCause() instanceof IndexOutOfBoundsException) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            // property name does not require delimiter
            if (idx <= start || idx > expression.length()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            throws IntrospectionException {
        if (value == null || key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java

        if (StringUtils.isEmpty(expression) || !Character.isJavaIdentifierStart(expression.charAt(0))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
            tokenizer.nextPropertyName();
            if (tokenizer.getPosition() == EOF) {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
                default:
                    // could not parse expression
                    return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java
    private static Object getPropertyValue(Object value, String property) throws IntrospectionException {
        if (value == null || property == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ReflectionValueExtractor.java`
#### Snippet
```java

            if (method == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/javatool/AbstractJavaTool.java`
#### Snippet
```java
            getLogger().warn("unexpected InvocationTargetException", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/Os.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java

    String getExecutionPreamble() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
    String[] getShellArgs() {
        if (shellArgs.isEmpty()) {
            return null;
        } else {
            return shellArgs.toArray(new String[0]);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
     */
    public File getWorkingDirectory() {
        return workingDir == null ? null : new File(workingDir);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
                 *  null.
                 */
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/ClassMap.java`
#### Snippet
```java

        if (cacheEntry == CACHE_MISS) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/xml/Xpp3Dom.java`
#### Snippet
```java
     */
    public String getAttribute(String nameParameter) {
        return this.attributes != null ? this.attributes.get(nameParameter) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String uncapitaliseAllWords(String str) {
        if (str == null) {
            return null;
        }
        int sz = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String capitaliseAllWords(String str) {
        if (str == null) {
            return null;
        }
        int sz = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String unifyLineSeparators(@Nullable String s, @Nullable String ls) {
        if (s == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            boolean force) {
        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String swapCase(String str) {
        if (str == null) {
            return null;
        }
        int sz = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String stripEnd(String str, @Nullable String strip) {
        if (str == null) {
            return null;
        }
        int end = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuffer(str).reverse().toString();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String stripStart(String str, @Nullable String strip) {
        if (str == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String getNestedString(String str, @Nonnull String open, @Nonnull String close) {
        if (str == null) {
            return null;
        }
        int start = str.indexOf(open);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String capitalise(String str) {
        if (str == null) {
            return null;
        } else {
            int length = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
     */
    public static String trim(String str) {
        return (str == null ? null : str.trim());
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String escape(@Nullable String source, @Nonnull final char[] escapedChars, char escapeChar) {
        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
        }
        if (str == null) {
            return null;
        }
        if (str.length() <= (pos + len)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String substring(String str, int start) {
        if (str == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String uncapitalise(String str) {
        if (str == null) {
            return null;
        } else {
            int length = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String substring(String str, int start, int end) {
        if (str == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/StringUtils.java`
#### Snippet
```java
    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
            }
            if (index == 0) {
                return null; // Trying to go outside our context
            }
            int index2 = normalized.lastIndexOf('/', index - 1);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java

        if (applicables.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/shared/utils/introspection/MethodMap.java`
#### Snippet
```java

        if (methodList == null) {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `totalBufferSize` is redundant
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java
                    CharsetEncoder encoder = charset.newEncoder();

                    int totalBufferSize = FILE_COPY_BUFFER_SIZE;

                    int charBufferSize = (int) Math.floor(totalBufferSize / (2 + 2 * encoder.maxBytesPerChar()));
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer line` may be declared as 'StringBuilder'
in `src/main/java/org/apache/maven/shared/utils/xml/XmlWriterUtil.java`
#### Snippet
```java
        String[] sentences = StringUtils.split(comment, CRLF);

        StringBuffer line = new StringBuffer(indentation + "<!-- ");
        for (String sentence : sentences) {
            String[] words = StringUtils.split(sentence, " ");
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/cli/CommandLineUtils.java`
#### Snippet
```java
    public static String[] translateCommandline(String toProcess) throws CommandLineException {
        if ((toProcess == null) || (toProcess.length() == 0)) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/cli/shell/BourneShell.java`
#### Snippet
```java
        String[] shellArgs = super.getShellArgs();
        if (shellArgs == null) {
            shellArgs = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/cli/shell/Shell.java`
#### Snippet
```java
            return null;
        } else {
            return shellArgs.toArray(new String[0]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/cli/Commandline.java`
#### Snippet
```java
            }
        }
        return environmentVars.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
             * the problematic code, as it appears to come from a native method in UnixFileSystem...
             */
            newfiles = new String[0];

            // throw new IOException( "IO error scanning directory " + dir.getAbsolutePath() );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
    public String[] getIncludedFiles() {
        if (filesIncluded == null) {
            return new String[0];
        }
        return filesIncluded.toArray(new String[filesIncluded.size()]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/io/DirectoryScanner.java`
#### Snippet
```java
        }
        if (excludes == null) {
            excludes = new String[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/shared/utils/io/FileUtils.java`
#### Snippet
```java

        if (unknownFiles == null) {
            return new String[0];
        }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/shared/utils/cli/StreamPumper.java`
#### Snippet
```java
            }

            synchronized (this) {
                setDone();

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/shared/utils/cli/StreamPumper.java`
#### Snippet
```java
                setDone();

                this.notifyAll();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/shared/utils/cli/AbstractStreamHandler.java`
#### Snippet
```java
    public synchronized void waitUntilDone() throws InterruptedException {
        while (!isDone()) {
            wait();
        }
    }
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

### UnusedAssignment
Variable `depth` initializer `0` is redundant
in `src/main/java/org/apache/maven/shared/utils/xml/PrettyPrintXMLWriter.java`
#### Snippet
```java
    private boolean endOnSameLine = false;

    private int depth = 0;

    private char[] lineIndent;
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

