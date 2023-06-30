# jetty.toolchain 
 
# Bad smells
I found 181 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpSimplifiable | 26 | false |
| RegExpRedundantNestedCharacterClass | 25 | false |
| JavadocReference | 19 | false |
| RegExpRedundantEscape | 16 | false |
| DeprecatedIsStillUsed | 15 | false |
| CStyleArrayDeclaration | 14 | false |
| MarkedForRemoval | 10 | false |
| FieldMayBeFinal | 7 | false |
| RegExpSingleCharAlternation | 6 | false |
| UnnecessaryModifier | 5 | true |
| UnusedAssignment | 5 | false |
| DuplicatedCode | 3 | false |
| IOStreamConstructor | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| UNCHECKED_WARNING | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| Deprecation | 2 | false |
| TrivialStringConcatenation | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| IgnoreResultOfCall | 2 | false |
| UNUSED_IMPORT | 2 | false |
| ConstantValue | 2 | false |
| DataFlowIssue | 1 | false |
| CommentedOutCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| ReassignedToPlainText | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=WrapperTypeMayBePrimitive]
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
         * @return the approximate accumulated collection elapsed time in milliseconds.
         */
        public default long getCollectionTime()
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
         * @return the total number of collections that have occurred.
         */
        public default long getCollectionCount()
        {
            return 0;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'visit(CompilationUnit, A)' as a member of raw type 'japa.parser.ast.visitor.VoidVisitorAdapter'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
            MethodVisitor mv = new MethodVisitor(method);

            mv.visit(cu,null);

            return mv.source;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.eclipse.jetty.toolchain.test.policy.Tester.TestAction' to 'java.security.PrivilegedAction'
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
    public boolean testReadSystemProperty( String property ) throws Exception
    {
        AccessController.doPrivileged( new TestAction( property ) );
       
        return true;
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java

    /**
     * Resolve the unique test directory based on {@link TestInfo}
     *
     * @param info the {@link TestInfo} to build <code>target/tests/{name}</code> from
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * Resolve the unique test directory based on {@link TestInfo}
     *
     * @param info the {@link TestInfo} to build <code>target/tests/{name}</code> from
     * @return the unique test path for the context
     */
```

### JavadocReference
Cannot resolve symbol `ExtensionContext`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java

    /**
     * Resolve the unique test directory based on {@link ExtensionContext}
     *
     * @param context the {@link ExtensionContext} to build <code>target/tests/{name}</code> from
```

### JavadocReference
Cannot resolve symbol `ExtensionContext`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * Resolve the unique test directory based on {@link ExtensionContext}
     *
     * @param context the {@link ExtensionContext} to build <code>target/tests/{name}</code> from
     * @return the unique test path for the context
     */
```

### JavadocReference
Cannot resolve symbol `ExtensionContext`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     *
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
```

### JavadocReference
Cannot resolve symbol `getTestMethod()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     *
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     *
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
```

### JavadocReference
Cannot resolve symbol `getTestMethod()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     *
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
```

### JavadocReference
Cannot resolve symbol `ExtensionContext`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
    public static Path targetTestDir(Class<?> testClazz, String methodName, String displayName)
```

### JavadocReference
Cannot resolve symbol `getDisplayName()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
    public static Path targetTestDir(Class<?> testClazz, String methodName, String displayName)
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
    public static Path targetTestDir(Class<?> testClazz, String methodName, String displayName)
```

### JavadocReference
Cannot resolve symbol `getDisplayName()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenPaths.java`
#### Snippet
```java
     * @param testClazz the test class name
     * @param methodName the method name (usually from {@link ExtensionContext#getTestMethod()} or {@link TestInfo#getTestMethod()})
     * @param displayName the display name (usually from {@link ExtensionContext#getDisplayName()} or {@link TestInfo#getDisplayName()})
     */
    public static Path targetTestDir(Class<?> testClazz, String methodName, String displayName)
```

### JavadocReference
Cannot resolve symbol `org.HdrHistogram.Histogram`
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/MeasureRecorder.java`
#### Snippet
```java

/**
 * @deprecated Use {@link org.HdrHistogram.Histogram} to record measures instead,
 *             and {@link org.eclipse.jetty.toolchain.perf.HistogramSnapshot} to
 *             format the histogram values.
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     *
     * @return the unit test id found via execution stack and junit 3.8 naming conventions.
     * @deprecated use Junit5 {@link TestInfo} instead
     */
    @Deprecated(forRemoval = true, since = "6.0")
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    /**
     * Get a {@link File} reference to the <code>${basedir}/target/tests/test-${testname}</code> directory.
     * Uses the JUnit 5.x {@link TestInfo#getDisplayName()} to make a unique directory name per test.
     * <p>
     * Convenience method for <code>MavenTestingUtils.getTargetTestingPath(TestCase.getName()).toFile()</code>
```

### JavadocReference
Cannot resolve symbol `getDisplayName()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    /**
     * Get a {@link File} reference to the <code>${basedir}/target/tests/test-${testname}</code> directory.
     * Uses the JUnit 5.x {@link TestInfo#getDisplayName()} to make a unique directory name per test.
     * <p>
     * Convenience method for <code>MavenTestingUtils.getTargetTestingPath(TestCase.getName()).toFile()</code>
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
     * @param testInfo the junit 5.x testcase to base this new directory on.
     * @return the maven <code>${basedir}/target/tests/test-${testname}</code> directory.
     * @deprecated use {@link #getTargetTestingPath(TestInfo)} instead
     */
    @Deprecated(forRemoval = true, since = "6.0")
```

### JavadocReference
Cannot resolve symbol `TestInfo`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    /**
     * Get a {@link Path} reference to the <code>${basedir}/target/tests/test-${testname}</code> directory.
     * Uses the JUnit 5.x {@link TestInfo#getDisplayName()} to make a unique directory name per test.
     * <p>
     * Convenience method for <code>MavenTestingUtils.getTargetTestingPath(TestCase.getName())</code>
```

### JavadocReference
Cannot resolve symbol `getDisplayName()`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    /**
     * Get a {@link Path} reference to the <code>${basedir}/target/tests/test-${testname}</code> directory.
     * Uses the JUnit 5.x {@link TestInfo#getDisplayName()} to make a unique directory name per test.
     * <p>
     * Convenience method for <code>MavenTestingUtils.getTargetTestingPath(TestCase.getName())</code>
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
Unnecessary arguments
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/ByteBufferUtils.java`
#### Snippet
```java
            byte[] to = new byte[buffer.remaining()];
            buffer.slice().get(to);
            return new String(to, 0, to.length, StandardCharsets.UTF_8);
        }
        return new String(array, buffer.arrayOffset() + buffer.position(), buffer.remaining(), StandardCharsets.UTF_8);
```

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
C-style array declaration of local variable `reserved`
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/RequireDebianCompatibleVersionRule.java`
#### Snippet
```java

        // Architecture IDs 
        String reserved[] =
        { "all", "i386", "i486", "i586", "i686", "pentium", "athlon", "ia64", "x86_64", "amd64", "ia32", "alpha", "sparc", "m68k", "ppc", "hppa", "arm" };

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
C-style array declaration of local variable `stacked`
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/MavenTestingUtils.java`
#### Snippet
```java
    private static TestID getTestID()
    {
        StackTraceElement stacked[] = new Throwable().getStackTrace();

        for (StackTraceElement stack : stacked)
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jetty-web-resources/src/main/resources/html/css/asciidoctor/boot-cerulean.css`
#### Snippet
```java
pre {
  display: block;
  padding: 9.5px;
  margin: 0 0 10px;
  font-size: 13px;
  line-height: 1.42857143;
  word-break: break-all;
  word-wrap: break-word;
  color: #333333;
  background-color: #f5f5f5;
  border: 1px solid #cccccc;
  border-radius: 4px;
}
```

### DuplicatedCode
Duplicated code
in `jetty-web-resources/src/main/resources/html/css/asciidoctor/boot-cosmo.css`
#### Snippet
```java
pre {
  display: block;
  padding: 10px;
  margin: 0 0 10.5px;
  font-size: 14px;
  line-height: 1.42857143;
  word-break: break-all;
  word-wrap: break-word;
  color: #333333;
  background-color: #f5f5f5;
  border: 1px solid #cccccc;
  border-radius: 0;
}
```

### DuplicatedCode
Duplicated code
in `jetty-web-resources/src/main/resources/html/css/asciidoctor/boot-flatly.css`
#### Snippet
```java
pre {
  display: block;
  padding: 10.5px;
  margin: 0 0 10.5px;
  font-size: 15px;
  line-height: 1.42857143;
  word-break: break-all;
  word-wrap: break-word;
  color: #333333;
  background-color: #f5f5f5;
  border: 1px solid #cccccc;
  border-radius: 4px;
}
```

## RuleId[id=RegExpSimplifiable]
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
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/SourceFetchExtension.java`
#### Snippet
```java
        }

        return toString(new FileInputStream(fetchFile));
    }
    
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
        if ( method == null || "".equals(method) )
        {
            CompilationUnit cu = JavaParser.parse(new FileInputStream(fetchFile));
            
            return cu.toString();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/JavaSourceFetchExtension.java`
#### Snippet
```java
        else
        {
            CompilationUnit cu = JavaParser.parse(new FileInputStream(fetchFile));

            // visit and print the methods names
```

## RuleId[id=Deprecation]
### Deprecation
'getTotalPhysicalMemorySize()' is deprecated
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
            {
                com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean)operatingSystem;
                start.totalMemory = os.getTotalPhysicalMemorySize();
                start.freeMemory = os.getFreePhysicalMemorySize();
            }
```

### Deprecation
'getFreePhysicalMemorySize()' is deprecated
in `jetty-perf-helper/src/main/java/org/eclipse/jetty/toolchain/perf/PlatformMonitor.java`
#### Snippet
```java
                com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean)operatingSystem;
                start.totalMemory = os.getTotalPhysicalMemorySize();
                start.freeMemory = os.getFreePhysicalMemorySize();
            }
            start.heap = heapMemory.getHeapMemoryUsage();
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`directory != null ? directory.exists() : false` can be simplified to 'directory != null \&\& directory.exists()'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/shade/IncludeDirectoryTransformer.java`
#### Snippet
```java
    public boolean hasTransformedResource()
    {
        return directory != null ? directory.exists() : false;
    }

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
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-app_2_5.xsd`
#### Snippet
```java

     <xsd:restriction base="xsd:token">
      <xsd:pattern value="[&#33;-&#126;-[\(\)&#60;&#62;@,;:&#34;/\[\]?=\{\}\\\p{Z}]]+"/>
     </xsd:restriction>

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

## RuleId[id=ReassignedToPlainText]
### ReassignedToPlainText
This file was explicitly re-assigned to plain text
in `jetty-setuid/README.TXT`
#### Snippet
```java
Configuration
-------------

Change etc/jetty-setuid.xml to use the userid you want.

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

## RuleId[id=RegExpSingleCharAlternation]
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
in `jetty-schemas/src/main/resources/jakarta/servlet/resources/web-common_4_0.xsd`
#### Snippet
```java
    </xsd:annotation>
    <xsd:restriction base="xsd:string">
      <xsd:pattern value="[a-z]{2}(_|-)?([\p{L}\-\p{Nd}]{2})?"/>
    </xsd:restriction>
  </xsd:simpleType>
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `_fetchCache` may be 'final'
in `jetty-xslt-tools/src/main/java/org/eclipse/jetty/xslt/tools/AbstractFetchException.java`
#### Snippet
```java
{

    private static File _fetchCache;

    static
```

### FieldMayBeFinal
Field `data` may be 'final'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/shade/MergeFilesTransformer.java`
#### Snippet
```java
    private boolean preserveResourceContent = true;

    private ByteArrayOutputStream data = new ByteArrayOutputStream();

    public MergeFilesTransformer()
```

### FieldMayBeFinal
Field `idMap` may be 'final'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
public class UniqueXmlIdDocbookRule implements EnforcerRule
{
    private Map<String,List<XmlId>> idMap = new HashMap<String,List<XmlId>>();
    
    /**
```

### FieldMayBeFinal
Field `lineNumber` may be 'final'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
    {
        private String filename;
        private int lineNumber;
        
        public XmlId(String filename, int lineNumber)
```

### FieldMayBeFinal
Field `filename` may be 'final'
in `jetty-build-support/src/main/java/org/eclipse/jetty/toolchain/enforcer/rules/UniqueXmlIdDocbookRule.java`
#### Snippet
```java
    private class XmlId
    {
        private String filename;
        private int lineNumber;
        
```

### FieldMayBeFinal
Field `_value` may be 'final'
in `jetty-test-policy/src/main/java/org/eclipse/jetty/toolchain/test/policy/Tester.java`
#### Snippet
```java
    class TestAction implements PrivilegedAction
    {
        private String _value;
        
        TestAction ( String value )
```

### FieldMayBeFinal
Field `describeFailure` may be 'final'
in `jetty-test-helper/src/main/java/org/eclipse/jetty/toolchain/test/PathMatchers.java`
#### Snippet
```java
        private final Predicate<Path> pathPredicate;
        private final String expectationText;
        private Function<Path, String> describeFailure;

        private PathPredicate(Predicate<Path> pathPredicate, String expectationText)
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

