# jetty.toolchain 
 
# Bad smells
I found 210 bad smells with 23 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpSimplifiable | 26 | false |
| RegExpRedundantNestedCharacterClass | 25 | false |
| RegExpRedundantEscape | 16 | false |
| DeprecatedIsStillUsed | 15 | false |
| CStyleArrayDeclaration | 14 | false |
| UtilityClassWithoutPrivateConstructor | 11 | true |
| MarkedForRemoval | 10 | false |
| SystemOutErr | 9 | false |
| UnnecessaryFullyQualifiedName | 9 | false |
| ReturnNull | 7 | false |
| RegExpSingleCharAlternation | 6 | false |
| UnnecessaryModifier | 5 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| UnusedAssignment | 5 | false |
| AssignmentToMethodParameter | 4 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| StringBufferReplaceableByString | 3 | false |
| RedundantSuppression | 3 | false |
| RedundantFieldInitialization | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| TrivialStringConcatenation | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| IgnoreResultOfCall | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| UNUSED_IMPORT | 2 | false |
| SynchronizeOnThis | 2 | false |
| ConstantValue | 2 | false |
| DataFlowIssue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| BoundedWildcard | 1 | false |
| StringEqualsEmptyString | 1 | false |
| NestedAssignment | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| NonExceptionNameEndsWithException | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureRecorder.java`
#### Snippet
```java
                    Map.Entry<Long, Long> entry = entries.next();
                    long latency = entry.getKey();
                    Long bucketIndex = measureRange == 0 ? 0 : (latency - minMeasure) * measureBucketFrequencies.length / measureRange;
                    int index = bucketIndex.intValue() == measureBucketFrequencies.length ? measureBucketFrequencies.length - 1 : bucketIndex.intValue();
                    long value = entry.getValue();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/TestTrackerExtension.java`
#### Snippet
```java
    public void beforeEach(ExtensionContext extensionContext)
    {
        Boolean logDisplay = Boolean.getBoolean("jetty.testtracker.log");
        if (logDisplay)
        {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureConverter.java`
#### Snippet
```java
public interface MeasureConverter
{
    public long convert(long measure);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
         * @return the total number of collections that have occurred.
         */
        public default long getCollectionCount()
        {
            return 0;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private interface GarbageCollector
    {
        static final GarbageCollector NO_GARBAGE_COLLECTOR = new GarbageCollector()
        {
        };
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private interface GarbageCollector
    {
        static final GarbageCollector NO_GARBAGE_COLLECTOR = new GarbageCollector()
        {
        };
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
         * @return the approximate accumulated collection elapsed time in milliseconds.
         */
        public default long getCollectionTime()
        {
            return 0;
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
    public boolean testReadSystemProperty( String property ) throws Exception
    {
        AccessController.doPrivileged( new TestAction( property ) );
       
        return true;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
    public boolean testReadSystemProperty( String property ) throws Exception
    {
        AccessController.doPrivileged( new TestAction( property ) );
       
        return true;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
package org.eclipse.jetty.toolchain.test.policy;

import java.security.AccessController;
import java.security.PrivilegedAction;

```

### MarkedForRemoval
'org.eclipse.jetty.toolchain.test.IO.SafeFileFilter' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
        URI baseURI = baseDir.toURI();

        for (File file : srcDir.listFiles(IO.SafeFileFilter.INSTANCE))
        {
            if (file.isDirectory())
```

### MarkedForRemoval
'org.eclipse.jetty.toolchain.test.IO.SafeFileFilter' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
        URI baseURI = baseDir.toURI();

        for (File file : srcDir.listFiles(IO.SafeFileFilter.INSTANCE))
        {
            if (file.isDirectory())
```

### MarkedForRemoval
'org.eclipse.jetty.toolchain.test.PathAssert' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
    public static void unpack(File jarFile, File destDir) throws IOException
    {
        PathAssert.assertFileExists("Jar File", jarFile);
        PathAssert.assertDirExists("Destination Path", destDir);

```

### MarkedForRemoval
'assertFileExists(java.lang.String, java.io.File)' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
    public static void unpack(File jarFile, File destDir) throws IOException
    {
        PathAssert.assertFileExists("Jar File", jarFile);
        PathAssert.assertDirExists("Destination Path", destDir);

```

### MarkedForRemoval
'org.eclipse.jetty.toolchain.test.PathAssert' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
    {
        PathAssert.assertFileExists("Jar File", jarFile);
        PathAssert.assertDirExists("Destination Path", destDir);

        JarFile jar = null;
```

### MarkedForRemoval
'assertDirExists(java.lang.String, java.io.File)' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
    {
        PathAssert.assertFileExists("Jar File", jarFile);
        PathAssert.assertDirExists("Destination Path", destDir);

        JarFile jar = null;
```

### MarkedForRemoval
'ensureDirExists(java.io.File)' is deprecated and marked for removal
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
                if (entry.isDirectory())
                {
                    FS.ensureDirExists(destFile);
                }
                else
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ByteBufferUtils` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferUtils.java`
#### Snippet
```java
import java.util.Arrays;

class ByteBufferUtils
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Hex` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java
import java.nio.ByteBuffer;

public final class Hex
{
    private static final char[] hexcodes = "0123456789ABCDEF".toCharArray();
```

### UtilityClassWithoutPrivateConstructor
Class `StackUtils` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/StackUtils.java`
#### Snippet
```java
import java.util.function.Supplier;

public final class StackUtils
{
    public static String toString(Throwable t)
```

### UtilityClassWithoutPrivateConstructor
Class `ByteBufferAssert` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferAssert.java`
#### Snippet
```java
import static org.hamcrest.MatcherAssert.assertThat;

public class ByteBufferAssert
{
    public static void assertEquals(String message, byte[] expected, byte[] actual)
```

### UtilityClassWithoutPrivateConstructor
Class `Net` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Net.java`
#### Snippet
```java
import java.util.Enumeration;

public final class Net
{
    protected static boolean isInterfaceAvailableFor(Class<? extends InetAddress> addrClass)
```

### UtilityClassWithoutPrivateConstructor
Class `ExtraMatchers` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ExtraMatchers.java`
#### Snippet
```java
 * Extra Matchers for the Junit Hamcrest users out there.
 */
public class ExtraMatchers
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MavenPaths` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
 * Simpler replacement for {@link MavenTestingUtils} used to find paths within the Maven <code>${project.basedir}</code>
 */
public final class MavenPaths
{
    private static Path basePath;
```

### UtilityClassWithoutPrivateConstructor
Class `StringMangler` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/StringMangler.java`
#### Snippet
```java
 * Collection of utility methods for manipulating Strings for zen purposes.
 */
public final class StringMangler
{
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PathMatchers` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
import org.hamcrest.TypeSafeMatcher;

public class PathMatchers
{
    private static class PathPredicate extends TypeSafeMatcher<Path>
```

### UtilityClassWithoutPrivateConstructor
Class `CatalogXHTML` has only 'static' members, and lacks a 'private' constructor
in `jetty-xhtml-schemas/src/main/java/org/eclipse/jetty/toolchain/xhtml/CatalogXHTML.java`
#### Snippet
```java
import javax.xml.catalog.CatalogManager;

public final class CatalogXHTML
{
    private static final String CATALOG_XHTML_XML = "catalog-xhtml.xml";
```

### UtilityClassWithoutPrivateConstructor
Class `Sha1Sum` has only 'static' members, and lacks a 'private' constructor
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Sha1Sum.java`
#### Snippet
```java
 * Calculate the sha1sum for various content
 */
public class Sha1Sum
{
    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `srcDir.listFiles(IO.SafeFileFilter.INSTANCE)` may produce `NullPointerException`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
        URI baseURI = baseDir.toURI();

        for (File file : srcDir.listFiles(IO.SafeFileFilter.INSTANCE))
        {
            if (file.isDirectory())
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/StringMangler.java`
#### Snippet
```java
        StringBuilder ret = new StringBuilder();
        int startLen = (int)Math.round((double)max / (double)3);
        ret.append(raw.substring(0, startLen));
        ret.append("...");
        ret.append(raw.substring(length - (max - startLen - 3)));
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'PathAssert' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathAssert.java`
#### Snippet
```java
 */
@Deprecated(forRemoval = true, since = "6.0")
public final class PathAssert
{
    private PathAssert()
```

### DeprecatedIsStillUsed
Deprecated member 'assertNotPathExists' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathAssert.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static void assertNotPathExists(String msg, File path)
    {
        assertThat(msg, path.toPath(), not(PathMatchers.exists()));
```

### DeprecatedIsStillUsed
Deprecated member 'assertDirExists' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathAssert.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static void assertDirExists(String msg, File path)
    {
        assertThat(msg, path.toPath(), PathMatchers.isDirectory());
```

### DeprecatedIsStillUsed
Deprecated member 'getTargetTestingDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTargetTestingDir(String testname)
    {
        return getTargetTestingPath(testname).toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getBaseDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getBaseDir()
    {
        return getBasePath().toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getTestResourceFile' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTestResourceFile(String name)
    {
        File file = new File(getTestResourcesDir(), FS.separators(name));
```

### DeprecatedIsStillUsed
Deprecated member 'getTestResourceDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTestResourceDir(String name)
    {
        return getTestResourcePathDir(name).toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getTestResourcesDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTestResourcesDir()
    {
        return getTestResourcesPath().toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getTargetFile' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTargetFile(String path)
    {
        return getTargetPath(path).toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getTargetTestingDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTargetTestingDir()
    {
        return getTargetTestingPath().toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'getTargetDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static File getTargetDir()
    {
        return getTargetPath().toFile();
```

### DeprecatedIsStillUsed
Deprecated member 'touch' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/FS.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static void touch(File file) throws IOException
    {
        touch(file.toPath());
```

### DeprecatedIsStillUsed
Deprecated member 'isTestingDir' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/FS.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    static boolean isTestingDir(File dir)
    {
        return isTestingDir(dir.toPath());
```

### DeprecatedIsStillUsed
Deprecated member 'deleteDirectory' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/FS.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static void deleteDirectory(File dir)
    {
        deleteDirectory(dir.toPath());
```

### DeprecatedIsStillUsed
Deprecated member 'ensureDirExists' is still used
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/FS.java`
#### Snippet
```java
     */
    @Deprecated(forRemoval = true, since = "6.0")
    public static void ensureDirExists(File dir)
    {
        ensureDirExists(dir.toPath());
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
            {
                source = n.toString();
               // System.out.println(n.getName());
               // System.out.println( n.getBody() );
            }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `buffer`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java
    }

    public static String asHex(byte buffer[])
    {
        int len = buffer.length;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `out`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java
    {
        int len = buffer.length;
        char out[] = new char[len * 2];
        for (int i = 0; i < len; i++)
        {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `buf`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java

        int size = hexString.length() / 2;
        byte buf[] = new byte[size];
        byte hex;
        int len = hexString.length();
```

### CStyleArrayDeclaration
C-style array declaration of local variable `parts`
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/RequireOsgiCompatibleVersionRule.java`
#### Snippet
```java
        }
        
        String parts[] = version.split("\\.");
        if (parts.length > 4)
        {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `reserved`
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/RequireRedhatCompatibleVersionRule.java`
#### Snippet
```java
        }

        String reserved[] =
        {
                // Special IDs 
```

### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
         throws IOException
    {  
        char buffer[] = new char[bufferSize];
        int len=bufferSize;
        
```

### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
         throws IOException
    {     
        byte buffer[] = new byte[bufferSize];
        int len=bufferSize;
        
```

### CStyleArrayDeclaration
C-style array declaration of local variable `expectedBytes`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferAssert.java`
#### Snippet
```java
        else
        {
            byte expectedBytes[] = ByteBufferUtils.toArray(expectedBuffer);
            byte actualBytes[] = ByteBufferUtils.toArray(actualBuffer);
            assertEquals(message, expectedBytes, actualBytes);
```

### CStyleArrayDeclaration
C-style array declaration of local variable `actualBytes`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferAssert.java`
#### Snippet
```java
        {
            byte expectedBytes[] = ByteBufferUtils.toArray(expectedBuffer);
            byte actualBytes[] = ByteBufferUtils.toArray(actualBuffer);
            assertEquals(message, expectedBytes, actualBytes);
        }
```

### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
    public static void copy(Reader in, Writer out) throws IOException
    {
        char buffer[] = new char[BUFFER_SIZE];
        int len = BUFFER_SIZE;

```

### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
    public static void copy(InputStream in, OutputStream out) throws IOException
    {
        byte buffer[] = new byte[BUFFER_SIZE];
        int len = BUFFER_SIZE;

```

### CStyleArrayDeclaration
C-style array declaration of local variable `parts`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/StringMangler.java`
#### Snippet
```java
    public static String condensePackageString(String classname)
    {
        String parts[] = classname.split("\\.");
        StringBuilder dense = new StringBuilder();
        for (int i = 0; i < (parts.length - 1); i++)
```

### CStyleArrayDeclaration
C-style array declaration of local variable `stacked`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    private static TestID getTestID()
    {
        StackTraceElement stacked[] = new Throwable().getStackTrace();

        for (StackTraceElement stack : stacked)
```

### CStyleArrayDeclaration
C-style array declaration of local variable `reserved`
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/RequireDebianCompatibleVersionRule.java`
#### Snippet
```java

        // Architecture IDs 
        String reserved[] =
        { "all", "i386", "i486", "i586", "i686", "pentium", "athlon", "ia64", "x86_64", "amd64", "ia32", "alpha", "sparc", "m68k", "ppc", "hppa", "arm" };

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `ve` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/jsp/resources/jspxml_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
	<xsd:restriction base = "xsd:anyURI">
      <xsd:pattern value = "&RelativeURL;"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantEscape
Redundant character escape `\{` in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `idMap.keySet()` may be replaced with 'entrySet()' iteration
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
            if (this.shouldIfail)
            {
                for ( String id : idMap.keySet() )
                {
                    List<XmlId> idList = idMap.get(id);
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[^\s]` can be simplified to '\\S'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[^\s]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSimplifiable
`[:]` can be simplified to ':'
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`badEntries.size() > 0` can be replaced with '!badEntries.isEmpty()'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/matchers/IsOrderedCollectionContaining.java`
#### Snippet
```java
        }

        if (sizeMismatch || badEntries.size() > 0)
        {
            // build up detailed error message
```

### SizeReplaceableByIsEmpty
`badEntries.size() > 0` can be replaced with '!badEntries.isEmpty()'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/matchers/IsOrderedCollectionContaining.java`
#### Snippet
```java
                this.failureReason = String.format("size mismatch: expected <%d> entries, but got <%d> entries instead", expectedList.size(), actualList.size());
            }
            else if (badEntries.size() > 0)
            {
                this.failureReason = String.format("<%d> entr%s not matched", badEntries.size(), badEntries.size() > 1 ? "ies" : "y");
```

### SizeReplaceableByIsEmpty
`files.size() > 0` can be replaced with '!files.isEmpty()'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/shade/MergeFilesTransformer.java`
#### Snippet
```java
    {
        // we need to force shade plugin to modify the JarOutputStream
        return files.size() > 0;
    }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Net.java`
#### Snippet
```java
public final class Net
{
    protected static boolean isInterfaceAvailableFor(Class<? extends InetAddress> addrClass)
    {
        try
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
        public String toString()
        {
            StringBuilder builder = new StringBuilder();
            builder.append("- - - - - - - - - - - - - - - - - - - - ").append(EOL);
            builder.append("Monitoring Ended at ").append(new Date(date)).append(EOL);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
        public String toString()
        {
            StringBuilder builder = new StringBuilder();
            builder.append("========================================").append(EOL);
            builder.append("Monitoring Started at ").append(new Date(date)).append(EOL);
```

### StringBufferReplaceableByString
`StringBuilder err` can be replaced with 'String'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
        // If we have reached this point, we have failed to find the test id
        String LN = System.getProperty("line.separator");
        StringBuilder err = new StringBuilder();
        err.append("Unable to find a TestID from a testcase that ");
        err.append("doesn't follow the standard naming rules.");
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
    public String getCacheId()
    {
        return "" + shouldIfail;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/VersionTxtRule.java`
#### Snippet
```java
    public String getCacheId()
    {
        return "" + shouldIfail;
    }

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java
                hex = (byte)(Character.digit(hexString.charAt(i), 16) << 4);
            }
            i++;
            hex += (byte)(Character.digit(hexString.charAt(i), 16));

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `XmlId` may be 'static'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
    }
    
    private class XmlId
    {
        private String filename;
```

### InnerClassMayBeStatic
Inner class `TestAction` may be 'static'
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
    }
    
    class TestAction implements PrivilegedAction
    {
        private String _value;
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_3.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_2.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
        <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/javaee_web_services_client_1_4.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="[!-~-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/jakartaee_web_services_client_2_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:token">
      <xsd:pattern value="\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Path`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
        }

        private PathPredicate(Predicate<Path> pathPredicate, String expectationText, Function<Path, String> describeFailure)
        {
            this.pathPredicate = Objects.requireNonNull(pathPredicate);
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
        

        if ( method == null || "".equals(method) )
        {
            CompilationUnit cu = JavaParser.parse(new FileInputStream(fetchFile));
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
            Pattern pattern = Pattern.compile(".*?(xml:id=)\"(.*?)\"", Pattern.DOTALL);
                       
            @SuppressWarnings("unchecked")
            List<File> files = FileUtils.getFiles(new File("src/docbkx"),"**/*.xml","");
                        
            for ( File file : files )
```

### RedundantSuppression
Redundant suppression
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
{
    @SuppressWarnings("javadoc")
    public static final int BUFFER_SIZE = 64 * 1024;

    private IO()
```

### RedundantSuppression
Redundant suppression
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
    {
        @SuppressWarnings("javadoc")
        public static final SafeFileFilter INSTANCE = new SafeFileFilter();

        public boolean accept(File path)
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    {
        _fetchCache = MavenTestingUtils.getTargetTestingDir("fetch-cache");
        _fetchCache.mkdirs();
    }
    
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/JAR.java`
#### Snippet
```java
            if (!destFile.getParentFile().exists())
            {
                destFile.getParentFile().mkdirs();
            }
            out = new FileOutputStream(destFile, false);
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
        if ( test.exists() )
        {
            System.out.println("In Cache: " + original );
            return test;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
        else
        {
            System.out.println("Not Cached: " + original );
            return null;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/shade/IncludeDirectoryTransformer.java`
#### Snippet
```java
            if (DEBUG)
            {
                System.err.printf("## " + this.getClass().getSimpleName() + " " + format + "%n",args);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
                    if (idList.size() > 1)
                    {
                        System.out.println("Duplicate Global Id: " + id);
                        for ( XmlId xid : idList )
                        {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
                        for ( XmlId xid : idList )
                        {
                            System.out.println(" - " + xid.getLineNumber() + ": " + xid.getFilename() );
                        }
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
        public Object run()
        {  
            System.out.println( "checking out system property -=> " + _value );
            
            return System.getProperty( _value ); 
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/TestTrackerExtension.java`
#### Snippet
```java
                {
                    // this display name contains the method.
                    System.err.printf("Running %s.%s%n",
                        clazz.getName(),
                        StringMangler.escapeJava(displayName));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/TestTrackerExtension.java`
#### Snippet
```java
                {
                    // this display name does not contain method name, so include it.
                    System.err.printf("Running %s.%s(%s)%n",
                        clazz.getName(),
                        method.getName(),
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/TestTrackerExtension.java`
#### Snippet
```java
            {
                // this one has no parameters
                System.err.printf("Running %s.%s()%n",
                    clazz.getName(),
                    method.getName());
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
    {
        Objects.requireNonNull(context);
        if (!context.getTestInstance().isPresent())
            throw new AssertionError("ExtensionContext is invalid");

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/WorkDirExtension.java`
#### Snippet
```java
                              Predicate<Field> fieldPredicate)
    {
        if (!context.getTestInstance().isPresent())
            return;

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    protected static String mangle(String toMangle)
    {
        toMangle = toMangle.replace(":","_");
        toMangle = toMangle.replace("/","_");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    {
        toMangle = toMangle.replace(":","_");
        toMangle = toMangle.replace("/","_");

        return toMangle;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jetty.toolchain.perf` is unnecessary and can be removed
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureRecorder.java`
#### Snippet
```java
/**
 * @deprecated Use {@link org.HdrHistogram.Histogram} to record measures instead,
 *             and {@link org.eclipse.jetty.toolchain.perf.HistogramSnapshot} to
 *             format the histogram values.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.jetty.toolchain.perf` is unnecessary and can be removed
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureRecorder.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link org.eclipse.jetty.toolchain.perf.HistogramSnapshot} instead
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ExtraMatchers.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> ordered(List<T> itemMatchers)
    {
        return new IsOrderedCollectionContaining(itemMatchers);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ExtraMatchers.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> ordered(List<T> itemMatchers)
    {
        return new IsOrderedCollectionContaining(itemMatchers);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
     * @return the Exists matcher
     */
    public static org.hamcrest.Matcher<Path> exists()
    {
        return new PathPredicate(Files::exists, "path should exist");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
     * @return the isDirectory matcher
     */
    public static org.hamcrest.Matcher<Path> isSame(final Path expected)
    {
        return new PathPredicate(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
     * @return the isDirectory matcher
     */
    public static org.hamcrest.Matcher<Path> isDirectory()
    {
        return new PathPredicate(Files::isDirectory, "path is directory", (p) ->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
     * @return the isRegularFile matcher
     */
    public static org.hamcrest.Matcher<Path> isRegularFile()
    {
        return new PathPredicate(Files::isRegularFile, "path is regular file", (p) ->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.hamcrest` is unnecessary, and can be replaced with an import
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
     * @return the isEmptyDirectory matcher
     */
    public static org.hamcrest.Matcher<Path> isEmptyDirectory()
    {
        return new PathPredicate(
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.StringReader;`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringReader;

import org.eclipse.jetty.toolchain.test.FS;
```

### UNUSED_IMPORT
Unused import `import java.io.FileOutputStream;`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
            start.date = System.currentTimeMillis();
            start.os = String.format("%s %s %s", operatingSystem.getName(), operatingSystem.getVersion(), operatingSystem.getArch());
            start.cores = stop.cores = operatingSystem.getAvailableProcessors();
            start.jvm = String.format("%s %s %s %s", System.getProperty("java.vm.vendor"), System.getProperty("java.vm.name"), System.getProperty("java.vm.version"), System.getProperty("java.runtime.version"));
            if (operatingSystem instanceof com.sun.management.OperatingSystemMXBean)
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`value = value - 1` could be simplified to 'value -= 1'
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureRecorder.java`
#### Snippet
```java
                    int value = maxLatencyBucketFrequency == 0 ? 0 : Math.round(latencyBucketFrequency * (float)measureBucketFrequencies.length / maxLatencyBucketFrequency);
                    if (value == measureBucketFrequencies.length)
                        value = value - 1;
                    for (int j = 0; j < value; ++j)
                        builder.append(" ");
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_4.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_1.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_5_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_3_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `lastTenured` is accessed in both synchronized and unsynchronized contexts
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private long lastEden;
    private long lastSurvivor;
    private long lastTenured;
    private long time;
    private long cpuTime;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `memoryPollInterval` is accessed in both synchronized and unsynchronized contexts
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private ScheduledFuture<?> memoryPoller;
    private ScheduledExecutorService scheduler;
    private long memoryPollInterval = 250;
    private long youngCount;
    private long youngTime;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastEden` is accessed in both synchronized and unsynchronized contexts
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private long oldCount;
    private long oldTime;
    private long lastEden;
    private long lastSurvivor;
    private long lastTenured;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastSurvivor` is accessed in both synchronized and unsynchronized contexts
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private long oldTime;
    private long lastEden;
    private long lastSurvivor;
    private long lastTenured;
    private long time;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stop` is accessed in both synchronized and unsynchronized contexts
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    private long cpuTime;
    private long jitTime;
    private Stop stop;

    public PlatformMonitor()
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/shade/IncludeDirectoryTransformer.java`
#### Snippet
```java
public class IncludeDirectoryTransformer implements ResourceTransformer
{
    public static boolean DEBUG = false;

    private static class DirectoryCopier extends SimpleFileVisitor<Path>
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
     * Simple param. This rule will fail if the value is true.
     */
    private boolean shouldIfail = false;

    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/VersionTxtRule.java`
#### Snippet
```java
     * Simple param. This rule will fail if the value is true.
     */
    private boolean shouldIfail = false;

    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `toMangle`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    protected static String mangle(String toMangle)
    {
        toMangle = toMangle.replace(":","_");
        toMangle = toMangle.replace("/","_");

```

### AssignmentToMethodParameter
Assignment to method parameter `toMangle`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    {
        toMangle = toMangle.replace(":","_");
        toMangle = toMangle.replace("/","_");

        return toMangle;
```

### AssignmentToMethodParameter
Assignment to method parameter `byteCount`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
                    break;
                
                byteCount -= len;
                out.write(buffer,0,len);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `byteCount`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
                    break;
                
                byteCount -= len;
                out.write(buffer,0,len);
            }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferUtils.java`
#### Snippet
```java
    {
        if (buffer == null)
            return null;
        byte[] array = buffer.hasArray() ? buffer.array() : null;
        if (array == null)
```

### ReturnNull
Return of `null`
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
        {
            System.out.println("Not Cached: " + original );
            return null;
        }
    }  
```

### ReturnNull
Return of `null`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
        {
            if (starts.decrementAndGet() > 0)
                return null;

            stop.date = System.currentTimeMillis();
```

### ReturnNull
Return of `null`
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
        {
            if (starts.incrementAndGet() > 1)
                return null;

            Start start = new Start();
```

### ReturnNull
Return of `null`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
        err.append("@AfterClass, or Constructors of test case.");
        fail(err.toString());
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `original` is redundant
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
    protected static File checkCache(String resource)
    {
        String original = resource;
        
        File test = new File(_fetchCache, mangle(resource));
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    public Stop stop()
    {
        synchronized (this)
        {
            if (starts.decrementAndGet() > 0)
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
    public Start start()
    {
        synchronized (this)
        {
            if (starts.incrementAndGet() > 1)
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `len` initializer `bufferSize` is redundant
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
    {  
        char buffer[] = new char[bufferSize];
        int len=bufferSize;
        
        if (byteCount>=0)
```

### UnusedAssignment
Variable `len` initializer `bufferSize` is redundant
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
    {     
        byte buffer[] = new byte[bufferSize];
        int len=bufferSize;
        
        if (byteCount>=0)
```

### UnusedAssignment
Variable `matcher` initializer `null` is redundant
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
                int lineNumber = 0;
                            
                Matcher matcher = null;
                while ( scanner.hasNextLine())
                {
```

### UnusedAssignment
Variable `len` initializer `BUFFER_SIZE` is redundant
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
    {
        char buffer[] = new char[BUFFER_SIZE];
        int len = BUFFER_SIZE;

        while (true)
```

### UnusedAssignment
Variable `len` initializer `BUFFER_SIZE` is redundant
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/IO.java`
#### Snippet
```java
    {
        byte buffer[] = new byte[BUFFER_SIZE];
        int len = BUFFER_SIZE;

        while (true)
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `AbstractFetchException` ends with 'Exception'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
import org.eclipse.jetty.util.IO;

public class AbstractFetchException
{

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/jupiter/WorkDirExtension.java`
#### Snippet
```java
        String methodName = null;
        if (extensionContext.getTestInstance().isPresent())
            methodName = extensionContext.getTestMethod().get().getName();
        String displayName = extensionContext.getDisplayName();
        Path dir = MavenPaths.targetTestDir(clazz, methodName, displayName);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `hexString.length() < 0` is always `false`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/Hex.java`
#### Snippet
```java
    public static byte[] asByteArray(String hexString)
    {
        if ((hexString.length() < 0) || ((hexString.length() % 2) != 0))
        {
            throw new IllegalArgumentException(String.format("Invalid string length of <%d>", hexString.length()));
```

### ConstantValue
Condition `badEntries.size() > 0` is always `true`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/matchers/IsOrderedCollectionContaining.java`
#### Snippet
```java
                this.failureReason = String.format("size mismatch: expected <%d> entries, but got <%d> entries instead", expectedList.size(), actualList.size());
            }
            else if (badEntries.size() > 0)
            {
                this.failureReason = String.format("<%d> entr%s not matched", badEntries.size(), badEntries.size() > 1 ? "ies" : "y");
```

