# intellij-coverage 
 
# Bad smells
I found 366 bad smells with 50 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 51 | false |
| SystemOutErr | 47 | false |
| RedundantFieldInitialization | 42 | false |
| UtilityClassWithoutPrivateConstructor | 32 | true |
| BoundedWildcard | 29 | false |
| AssignmentToMethodParameter | 24 | false |
| ThrowablePrintStackTrace | 14 | false |
| MissortedModifiers | 12 | false |
| NonShortCircuitBoolean | 10 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| IgnoreResultOfCall | 9 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| AssignmentToStaticFieldFromInstanceMethod | 8 | false |
| UnnecessarySuperQualifier | 7 | false |
| EmptyMethod | 7 | false |
| NestedAssignment | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| PublicFieldAccessedInSynchronizedContext | 5 | false |
| AssignmentToForLoopParameter | 4 | false |
| SynchronizeOnThis | 4 | false |
| CommentedOutCode | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| DuplicateExpressions | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| IOResource | 1 | false |
| StringEquality | 1 | false |
| DataFlowIssue | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ChainedEquality | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ConstantValue | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
## RuleId[id=IOResource]
### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java
                  @Override
                  public InputStream getClassInputStream() throws IOException {
                    is[0] = new FileInputStream(f);
                    return is[0];
                  }
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java

    public ClassData getClassData(String name) {
      if (name == myClassName) {
        return myClassData;
      }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `InstrumentationUtils` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/InstrumentationUtils.java`
#### Snippet
```java
import org.jetbrains.coverage.org.objectweb.asm.Opcodes;

public class InstrumentationUtils {
  public static final String OBJECT_TYPE = "Ljava/lang/Object;";
  public static final String CLASS_INIT = "<clinit>";
```

### UtilityClassWithoutPrivateConstructor
Class `OptionsUtil` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/util/OptionsUtil.java`
#### Snippet
```java
package com.intellij.rt.coverage.util;

public class OptionsUtil {
  public static final boolean NEW_LINE_COVERAGE_ENABLED = System.getProperty("idea.new.sampling.coverage") != null;
  public static boolean NEW_BRANCH_COVERAGE_ENABLED = System.getProperty("idea.new.tracing.coverage") != null;
```

### UtilityClassWithoutPrivateConstructor
Class `StringsPool` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java
 * @author Pavel.Sher
 */
public class StringsPool {
  private final static TLongObjectHashMap<String> myReusableStrings;
  private final static Map<Long, String> myConcurrentReusableStrings;
```

### UtilityClassWithoutPrivateConstructor
Class `KotlinUtils` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinUtils.java`
#### Snippet
```java
import java.util.List;

public class KotlinUtils {
  public static final String KOTLIN_DEFAULT_CONSTRUCTOR_MARKER = "Lkotlin/jvm/internal/DefaultConstructorMarker;";
  private static final String KOTLIN_CLASS_LABEL = "IS_KOTLIN";
```

### UtilityClassWithoutPrivateConstructor
Class `ClassNameUtil` has only 'static' members, and lacks a 'private' constructor
in `util/src/com/intellij/rt/coverage/util/ClassNameUtil.java`
#### Snippet
```java
 * @author Pavel.Sher
 */
public class ClassNameUtil {
  public static final String CLASS_FILE_SUFFIX = ".class";

```

### UtilityClassWithoutPrivateConstructor
Class `UnloadedUtil` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/UnloadedUtil.java`
#### Snippet
```java
 * coverage engine can analyse bytecode of these classes on disk.
 */
public class UnloadedUtil {
  public static final MethodVisitor EMPTY_METHOD_VISITOR = new MethodVisitor(Opcodes.API_VERSION) {
  };
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayUtil` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/util/ArrayUtil.java`
#### Snippet
```java
package com.intellij.rt.coverage.util;

public class ArrayUtil {

  public static <T> T safeLoad(T[] array, int index) {
```

### UtilityClassWithoutPrivateConstructor
Class `CoveragePremain` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/main/CoveragePremain.java`
#### Snippet
```java
 * @since 25-Feb-2010
 */
public class CoveragePremain {
  public static void premain(String argsString, Instrumentation instrumentation) throws Exception {
    premain(argsString, instrumentation,
```

### UtilityClassWithoutPrivateConstructor
Class `FilterUtils` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/FilterUtils.java`
#### Snippet
```java
import java.util.List;

public class FilterUtils {

  public static List<MethodFilter> createMethodFilters() {
```

### UtilityClassWithoutPrivateConstructor
Class `JSR45Util` has only 'static' members, and lacks a 'private' constructor
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
 * @since 2/8/11
 */
public class JSR45Util {
  private static final String FILE_SECTION = "*F\n";
  private static final String LINE_SECTION = "*L\n";
```

### UtilityClassWithoutPrivateConstructor
Class `LinesUtil` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/util/LinesUtil.java`
#### Snippet
```java
 * @since 26-Feb-2010
 */
public class LinesUtil {
  private final static LineData[] EMPTY_LINES = new LineData[0];

```

### UtilityClassWithoutPrivateConstructor
Class `InstructionsUtil` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/data/instructions/InstructionsUtil.java`
#### Snippet
```java
import java.util.Map;

public class InstructionsUtil {
  public static void merge(ProjectData source, ProjectData target, ClassFilter classFilter) {
    if (!target.isInstructionsCoverageEnabled()) return;
```

### UtilityClassWithoutPrivateConstructor
Class `RawReportLoader` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/offline/RawReportLoader.java`
#### Snippet
```java
import java.io.IOException;

public class RawReportLoader {
  public static void load(File file, ProjectData projectData) throws IOException {
    final RawProjectData rawProjectData = RawHitsReport.load(file);
```

### UtilityClassWithoutPrivateConstructor
Class `ErrorReporter` has only 'static' members, and lacks a 'private' constructor
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
 * Use this reporter for the cases when exception occurs within coverage engine
 */
public class ErrorReporter {
  private final static String ERROR_FILE = "coverage-error.log";
  private final static SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
```

### UtilityClassWithoutPrivateConstructor
Class `CondyUtils` has only 'static' members, and lacks a 'private' constructor
in `java7-utils/src/com/intellij/rt/coverage/util/CondyUtils.java`
#### Snippet
```java

@SuppressWarnings("unused")
public class CondyUtils {
  public static int[] getHitsMask(MethodHandles.Lookup lookup, String name, Class<?> clazz, String className) {
    return ProjectData.getHitsMask(className);
```

### UtilityClassWithoutPrivateConstructor
Class `TestTrackingIOUtil` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/util/TestTrackingIOUtil.java`
#### Snippet
```java
import java.util.Map;

public class TestTrackingIOUtil {
  public static void saveTestResults(File tracesDirectory, String name, Map<Object, boolean[]> trace) throws IOException {
    final File traceFile = new File(tracesDirectory, name + ".tr");
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneTestDiscoveryFileReader` has only 'static' members, and lacks a 'private' constructor
in `test-discovery/src/com/intellij/rt/coverage/data/api/StandaloneTestDiscoveryFileReader.java`
#### Snippet
```java
import java.io.IOException;

public class StandaloneTestDiscoveryFileReader {
  public static void main(String[] args) throws IOException {
    TestDiscoveryProtocolUtil.readFile(new File(args[0]), new SimpleDecodingTestDiscoveryProtocolReader() {
```

### UtilityClassWithoutPrivateConstructor
Class `ProjectDataLoader` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/util/ProjectDataLoader.java`
#### Snippet
```java
 * @since 05-May-2009
 */
public class ProjectDataLoader {
  public static final int REPORT_VERSION = 1;

```

### UtilityClassWithoutPrivateConstructor
Class `JodaTimeTests` has only 'static' members, and lacks a 'private' constructor
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/JodaTimeTests.java`
#### Snippet
```java
import java.util.TimeZone;

public class JodaTimeTests {
  private static void runTests(TestRunner runner) throws Exception {
    // setup a time zone other than one tester is in
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/report/util/FileUtils.java`
#### Snippet
```java
import java.io.*;

public class FileUtils {
  public static String readAll(File file) throws IOException {
    BufferedReader reader = null;
```

### UtilityClassWithoutPrivateConstructor
Class `RawProjectInit` has only 'static' members, and lacks a 'private' constructor
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
 * Also, the project data is initialized on the first call.
 */
public class RawProjectInit {
  private static final MethodCaller GET_OR_CREATE_HITS_MASK_INTERNAL_METHOD = new MethodCaller("getOrCreateHitsInternal", new Class[]{String.class, int.class});

```

### UtilityClassWithoutPrivateConstructor
Class `RawHitsReport` has only 'static' members, and lacks a 'private' constructor
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawHitsReport.java`
#### Snippet
```java
 * On load, this information could be applied to a ProjectData with already analysed classes.
 */
public class RawHitsReport {
  private static final int MAGIC = 284996684;

```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/aggregate/Main.java`
#### Snippet
```java
import com.intellij.rt.coverage.report.ArgParseException;

public class Main {
  public static void main(String[] argsList) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java
import java.io.IOException;

public class Main {
  public static void main(String[] argsList) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/instrument/Main.java`
#### Snippet
```java
import com.intellij.rt.coverage.report.ArgParseException;

public class Main {
  public static void main(String[] argsList) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
import java.io.IOException;

public class Main {
  public static void main(String[] argsList) {
    try {
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtil` has only 'static' members, and lacks a 'private' constructor
in `reporter/src/com/intellij/rt/coverage/instrument/IOUtil.java`
#### Snippet
```java
import java.io.*;

public class IOUtil {
  public static byte[] readBytes(File file) throws IOException {
    InputStream is = null;
```

### UtilityClassWithoutPrivateConstructor
Class `TestDiscoveryProtocolUtil` has only 'static' members, and lacks a 'private' constructor
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolUtil.java`
#### Snippet
```java

@SuppressWarnings({"unused", "WeakerAccess"})
public class TestDiscoveryProtocolUtil {
  public static void readFile(File file,
                              TestDiscoveryProtocolReader reader) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `DataAccessUtil` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/dataAccess/DataAccessUtil.java`
#### Snippet
```java
import org.jetbrains.coverage.org.objectweb.asm.ClassReader;

public class DataAccessUtil {
  public static final String HITS_ARRAY_TYPE = "[I";
  public static final String TEST_MASK_ARRAY_TYPE = "[Z";
```

### UtilityClassWithoutPrivateConstructor
Class `StringHash` has only 'static' members, and lacks a 'private' constructor
in `src/com/intellij/rt/coverage/util/StringHash.java`
#### Snippet
```java
* @author Pavel.Sher
*/
public class StringHash {
  private static final long initialHash = 0xe12398c6d9ae3b8aL;  // initial values
  private static final long[] mixMaster = {
```

### UtilityClassWithoutPrivateConstructor
Class `ApacheCollectionsTests` has only 'static' members, and lacks a 'private' constructor
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/ApacheCollectionsTests.java`
#### Snippet
```java
import java.util.zip.ZipInputStream;

public final class ApacheCollectionsTests {

  private static final List<String> testNames;
```

### UtilityClassWithoutPrivateConstructor
Class `ReportSectionsUtil` has only 'static' members, and lacks a 'private' constructor
in `instrumentation/src/com/intellij/rt/coverage/util/ReportSectionsUtil.java`
#### Snippet
```java
import java.util.Map;

public class ReportSectionsUtil {
  public static final int UNCOVERED_BRANCHES_SECTION_ID = 1;
  public static final int INSTRUCTIONS_SECTION_ID = 2;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `testJarName()` might be null
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/ApacheCollectionsTests.java`
#### Snippet
```java
    List<String> classNames = new ArrayList<String>();

    ZipInputStream zip = new ZipInputStream(new FileInputStream(testJarName()));
    for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
      if (entry.getName().endsWith(".class")) {
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourIsInitialized` from instance context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
        return;
      }
      ourIsInitialized = true;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourSendTime` from instance context
in `test-discovery/src/com/intellij/rt/coverage/data/SingleTrFileDiscoveryProtocolDataListener.java`
#### Snippet
```java
      writeTestFinished(myStream, className, methodName, classToVisitedMethods, classToMethodNames, openedFiles);
    } finally {
      Long diff = ourSendTime += System.nanoTime() - s;
    }
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourSendTime` from instance context
in `test-discovery/src/com/intellij/rt/coverage/data/SingleTrFileDiscoveryProtocolDataListener.java`
#### Snippet
```java
      finish(myStream);
    } finally {
      ourSendTime += System.nanoTime() - s;
      myStream.close();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED` from instance context
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java
      final boolean calculateHitsCount = OptionsUtil.CALCULATE_HITS_COUNT;
      try {
        OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED = true;
        OptionsUtil.CALCULATE_HITS_COUNT = countHits;
        new InstrumentationVisitor(root, outputRoot).visitFiles();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `OptionsUtil.CALCULATE_HITS_COUNT` from instance context
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java
      try {
        OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED = true;
        OptionsUtil.CALCULATE_HITS_COUNT = countHits;
        new InstrumentationVisitor(root, outputRoot).visitFiles();
      } finally {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED` from instance context
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java
        new InstrumentationVisitor(root, outputRoot).visitFiles();
      } finally {
        OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED = newBranchCoverage;
        OptionsUtil.CALCULATE_HITS_COUNT = calculateHitsCount;
      }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `OptionsUtil.CALCULATE_HITS_COUNT` from instance context
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java
      } finally {
        OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED = newBranchCoverage;
        OptionsUtil.CALCULATE_HITS_COUNT = calculateHitsCount;
      }
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourCleanupTime` from instance context
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
      cleanup();
    } finally {
      ourCleanupTime += System.nanoTime() - s;
    }
  }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
      if (mySeenClinit) {
        //field init is already added in <clinit>, e.g. if interface has constant
        //interface I {
        //  I DEFAULT = new I ();
        //}
```

### CommentedOutCode
Commented out code (6 lines)
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java

  public static void writeINT(DataOutput record, int val) throws IOException {
    /*
    if (0 <= val && val < 255)
      record.writeByte(val);
```

### CommentedOutCode
Commented out code (2 lines)
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java

  private synchronized boolean[] traceLines(String className, boolean[] methodFlags, String[] methodNames) {
    //System.out.println("Registering " + className);
    //assert methodFlags.length == methodNames.length;
    int classId = myNameEnumerator.enumerate(className);
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `sigs` may be replaced with 'entrySet()' iteration
in `src/com/intellij/rt/coverage/data/ClassData.java`
#### Snippet
```java
    final Set<String> sigs = sigLines.keySet();
    CoverageIOUtil.writeINT(os, sigs.size());
    for (String sig1 : sigs) {
      CoverageIOUtil.writeUTF(os, sig1);
      final List<LineData> lines = sigLines.get(sig1);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'myClasses' in a Serializable class
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
  private List<Pattern> myExcludePatterns;

  private final ClassesMap myClasses = new ClassesMap();
  private volatile Map<String, FileMapData[]> myLinesMap;
  private Map<String, ClassInstructions> myInstructions;
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Integer.parseInt(srcLine.substring(srcCommaIdx + 1))`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
        startSrcLine = Integer.parseInt(srcLine.substring(0, sharpIdx));
        if (srcCommaIdx > -1) {
          repeat = Integer.parseInt(srcLine.substring(srcCommaIdx + 1));
          fileId = Integer.parseInt(srcLine.substring(sharpIdx + 1, srcCommaIdx));
        } else {
```

### DuplicateExpressions
Multiple occurrences of `Integer.parseInt(srcLine.substring(srcCommaIdx + 1))`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
        }
      } else if (srcCommaIdx > -1) {
        repeat = Integer.parseInt(srcLine.substring(srcCommaIdx + 1));
        startSrcLine = Integer.parseInt(srcLine.substring(0, srcCommaIdx));
      } else {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java
  public static String getFromPool(String value) {
    if (value == null) return null;
    if (value.length() == 0) return EMPTY;

    final long hash = StringHash.calc(value);
```

### SizeReplaceableByIsEmpty
`curPath.length() == 0` can be replaced with 'curPath.isEmpty()'
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java
      File[] files = parent.listFiles();
      if (files != null) {
        String prefix = curPath.length() == 0 ? "" : curPath + ".";
        // force anonymous classes to come after its outer class
        Arrays.sort(files, new Comparator<File>() {
```

### SizeReplaceableByIsEmpty
`arg.length() > 0` can be replaced with '!arg.isEmpty()'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
        case ' ':
          String arg = currentArg.toString();
          if (arg.length() > 0) {
            tokenizedArgs.add(arg);
          }
```

### SizeReplaceableByIsEmpty
`arg.length() > 0` can be replaced with '!arg.isEmpty()'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java

    String arg = currentArg.toString();
    if (arg.length() > 0) {
      tokenizedArgs.add(arg);
    }
```

### SizeReplaceableByIsEmpty
`classInfo.getSource().length() == 0` can be replaced with 'classInfo.getSource().isEmpty()'
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
              && (myIncludePatterns == null || myIncludePatterns.isEmpty() || ClassNameUtil.matchesPatterns(mappedClassName, myIncludePatterns))) {
            classInfo = getOrCreateClassData(mappedClassName);
            if (classInfo.getSource() == null || classInfo.getSource().length() == 0) {
              classInfo.setSource(aFileData.getFileName());
            }
```

### SizeReplaceableByIsEmpty
`myUniqueTestName.length() > 0` can be replaced with '!myUniqueTestName.isEmpty()'
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java
  @SuppressWarnings("unused") // Used in IntelliJ
  public boolean isCoveredByOneTest() {
    return myUniqueTestName != null && myUniqueTestName.length() > 0;
  }

```

### SizeReplaceableByIsEmpty
`type.length() > 0` can be replaced with '!type.isEmpty()'
in `instrumentation/src/com/intellij/rt/coverage/util/ProjectDataLoader.java`
#### Snippet
```java
    return CoverageIOUtil.processWithDictionary(CoverageIOUtil.readUTFFast(in), new CoverageIOUtil.Consumer() {
      protected String consume(String type) {
        if (type.length() > 0 && Character.isDigit(type.charAt(0))) {
          try {
            final int typeIdx = Integer.parseInt(type);
```

### SizeReplaceableByIsEmpty
`testName.length() > 0` can be replaced with '!testName.isEmpty()'
in `instrumentation/src/com/intellij/rt/coverage/util/ProjectDataLoader.java`
#### Snippet
```java
            classInfo.registerMethodSignature(lineInfo);
            String testName = CoverageIOUtil.readUTFFast(in);
            if (testName != null && testName.length() > 0) {
              lineInfo.setTestName(testName);
            }
```

### SizeReplaceableByIsEmpty
`result.length() == 0` can be replaced with 'result.isEmpty()'
in `src/com/intellij/rt/coverage/util/classFinder/ClassFinder.java`
#### Snippet
```java
    }

    if (result.length() == 0) return result;
    if (result.charAt(0) == '/' && result.length() > 3 && result.charAt(2) == ':') {
      // windows path prefix: /C:/
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `generatedPrefix &= !pathWithDots.startsWith(defaultPrefix)`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
          ? path
          : path.substring(0, lastDot) + "_" + path.substring(lastDot + 1));
      generatedPrefix &= !pathWithDots.startsWith(defaultPrefix);
      result.add(new FileInfo(fileName, pathWithDots, key));
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myIsKotlinClass |= KotlinUtils.KOTLIN_METADATA.equals(descriptor)`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  @Override
  public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
    myIsKotlinClass |= KotlinUtils.KOTLIN_METADATA.equals(descriptor);
    return super.visitAnnotation(descriptor, visible);
  }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myIsKotlinObject |= name != null && name.endsWith("$Companion")`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
    super.visit(version, access, name, signature, superName, interfaces);
    myName = name;
    myIsKotlinObject |= name != null && name.endsWith("$Companion");
    myIsAbstractClass = (access & Opcodes.ACC_ABSTRACT) != 0;
  }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myIsKotlinObject |= (access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL)) != 0 ...`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  @Override
  public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
    myIsKotlinObject |= (access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL)) != 0
        && "INSTANCE".equals(name)
        && myName.equals(Type.getType(descriptor).getInternalName());
    return super.visitField(access, name, descriptor, signature, value);
  }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myAllMethodsStatic &= (access & Opcodes.ACC_STATIC) != 0`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
      return new EmptyConstructorVisitor(mv);
    }
    myAllMethodsStatic &= (access & Opcodes.ACC_STATIC) != 0;
    return mv;
  }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasRawHitsReport |= report.isRawHitsReport()`
in `reporter/src/com/intellij/rt/coverage/aggregate/Aggregator.java`
#### Snippet
```java
    boolean hasRawHitsReport = false;
    for (BinaryReport report : myReports) {
      hasRawHitsReport |= report.isRawHitsReport();
    }
    // Note that instructions collection is done only inside this method
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myAndVisited |= myIgnoreNextIf && opcode == Opcodes.IAND`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinDefaultArgsBranchFilter.java`
#### Snippet
```java
  public void visitInsn(int opcode) {
    super.visitInsn(opcode);
    myAndVisited |= myIgnoreNextIf && opcode == Opcodes.IAND;
  }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myHasInstructions |= !mySeenReturn && myCurrentLine != -1`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/ClosingBracesFilter.java`
#### Snippet
```java

  private void setHasInstructions() {
    myHasInstructions |= !mySeenReturn && myCurrentLine != -1;
  }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `myGetCoroutinesSuspendedVisited |= getCoroutinesSuspendedVisited`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
        && descriptor.endsWith(")" + InstrumentationUtils.OBJECT_TYPE);
    if (getCoroutinesSuspendedVisited || suspendCallVisited) {
      myGetCoroutinesSuspendedVisited |= getCoroutinesSuspendedVisited;
      mySuspendCallVisited |= suspendCallVisited;
    } else {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `mySuspendCallVisited |= suspendCallVisited`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
    if (getCoroutinesSuspendedVisited || suspendCallVisited) {
      myGetCoroutinesSuspendedVisited |= getCoroutinesSuspendedVisited;
      mySuspendCallVisited |= suspendCallVisited;
    } else {
      myGetCoroutinesSuspendedVisited = false;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
          break;
        case '\"':
          for (i++; i < argumentString.length(); i++) {
            char d = argumentString.charAt(i);
            if (d == '\"') {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
          break;
        case '\"':
          for (i++; i < argumentString.length(); i++) {
            char d = argumentString.charAt(i);
            if (d == '\"') {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
      if (fileName.startsWith("+ ")) {
        idAndName = fileName.substring(2);
        path = fileNameIdx[++i];
      }
      int idx = idAndName.indexOf(" ");
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
      if (fileInfoLine.startsWith("+ ")) {
        idAndName = fileInfoLine.substring(2);
        path = fileLines[++i];
      }
      int idx = idAndName.indexOf(" ");
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ClassData`
in `instrumentation/src/com/intellij/rt/coverage/util/ClassListSection.java`
#### Snippet
```java

  @Override
  public void load(ProjectData projectData, DataInputStream in, TIntObjectHashMap<ClassData> dict, int version) throws IOException {
    int classId = CoverageIOUtil.readINT(in);
    while (classId != -1) {
```

### BoundedWildcard
Can generalize to `? super ClassLoader`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
  private final Map<ClassLoader, Map<String, ClassReader>> myClassReaders;

  ClassWriterImpl(int flags, ClassLoader classLoader, Map<ClassLoader, Map<String, ClassReader>> classReaders) {
    super(flags);
    myClassLoader = classLoader;
```

### BoundedWildcard
Can generalize to `? extends Switch`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/data/BranchDataContainer.java`
#### Snippet
```java
  }

  private void setSwitchIds(SwitchData data, List<Switch> switches) {
    for (Switch aSwitch : switches) {
      data.setId(aSwitch.getId(), aSwitch.getKey());
```

### BoundedWildcard
Can generalize to `? super Pattern`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
  }

  private int readPatterns(final List<Pattern> patterns, int i, final String[] args, final String name) {
    ErrorReporter.logInfo(name + " patterns:");
    for (; i < args.length; i++) {
```

### BoundedWildcard
Can generalize to `? extends LineData`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/util/LinesUtil.java`
#### Snippet
```java
  private final static LineData[] EMPTY_LINES = new LineData[0];

  public static LineData[] calcLineArray(final int maxLineNumber, final TIntObjectHashMap<LineData> lines) {
    if (maxLineNumber == -1) return EMPTY_LINES;
    final LineData[] linesArray = new LineData[maxLineNumber + 1];
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
  }

  public static void doSaveSourceMap(Map<String, String> classNameToFile, File sourceMapFile, Map<String, ClassData> classes) throws IOException {
    final HashMap<String, String> sources = new HashMap<String, String>(classNameToFile);
    for (ClassData classData : classes.values()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
  }

  private static void saveData(DataOutputStream os, final TObjectIntHashMap<String> dict, Map<String, ClassData> classes) throws IOException {
    for (ClassData o : classes.values()) {
      o.save(os, new DictionaryLookup() {
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
  }

  private static void saveData(DataOutputStream os, final TObjectIntHashMap<String> dict, Map<String, ClassData> classes) throws IOException {
    for (ClassData o : classes.values()) {
      o.save(os, new DictionaryLookup() {
```

### BoundedWildcard
Can generalize to `? super String`
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
  }

  private static void saveDictionary(DataOutputStream os, TObjectIntHashMap<String> dict, Map<String, ClassData> classes) throws IOException {
    int i = 0;
    for (String className : classes.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
  }

  public static Map<String, String> loadSourceMapFromFile(Map<String, ClassData> classes, File sourceMapFile) throws IOException {
    DataInputStream in = null;
    try {
```

### BoundedWildcard
Can generalize to `? extends PatternFilter`
in `reporter/src/com/intellij/rt/coverage/aggregate/GroupPatternFilter.java`
#### Snippet
```java
  private final List<PatternFilter> myInternalFilters;

  public GroupPatternFilter(List<PatternFilter> filters) {
    myInternalFilters = filters;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `instrumentation/src/com/intellij/rt/coverage/util/ProjectDataLoader.java`
#### Snippet
```java
  }

  private static String expand(DataInputStream in, final TIntObjectHashMap<ClassData> dict) throws IOException {
    return CoverageIOUtil.processWithDictionary(CoverageIOUtil.readUTFFast(in), new CoverageIOUtil.Consumer() {
      protected String consume(String type) {
```

### BoundedWildcard
Can generalize to `? extends RuleViolation`
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
  }

  private static void saveViolations(List<RuleViolation> violations, File outputFile) throws IOException {
    final JSONObject jsonViolations = new JSONObject();
    for (RuleViolation ruleViolation : violations) {
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
  private final List<Rule> myRules;

  public Verifier(List<Rule> rules) {
    myRules = rules;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassMetadata`
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProtocolDataListener.java`
#### Snippet
```java
   * @since Version 2
   */
  protected void writeClassMetadata(DataOutput os, List<ClassMetadata> metadata) throws IOException {
    if (metadata == null || metadata.isEmpty()) return;
    if (myVersion < 2) return;
```

### BoundedWildcard
Can generalize to `? extends File`
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java


  public Instrumentator(List<File> roots, List<File> outputRoots, Filters filters) {
    myRoots = roots;
    myOutputRoots = outputRoots;
```

### BoundedWildcard
Can generalize to `? extends File`
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java


  public Instrumentator(List<File> roots, List<File> outputRoots, Filters filters) {
    myRoots = roots;
    myOutputRoots = outputRoots;
```

### BoundedWildcard
Can generalize to `? extends BinaryReport`
in `reporter/src/com/intellij/rt/coverage/aggregate/Aggregator.java`
#### Snippet
```java
  private ProjectData myProjectData;

  public Aggregator(List<BinaryReport> reports, List<Module> modules, List<Request> requests) {
    myReports = reports;
    myModules = modules;
```

### BoundedWildcard
Can generalize to `? extends Module`
in `reporter/src/com/intellij/rt/coverage/aggregate/Aggregator.java`
#### Snippet
```java
  private ProjectData myProjectData;

  public Aggregator(List<BinaryReport> reports, List<Module> modules, List<Request> requests) {
    myReports = reports;
    myModules = modules;
```

### BoundedWildcard
Can generalize to `? extends Request`
in `reporter/src/com/intellij/rt/coverage/aggregate/Aggregator.java`
#### Snippet
```java
  private ProjectData myProjectData;

  public Aggregator(List<BinaryReport> reports, List<Module> modules, List<Request> requests) {
    myReports = reports;
    myModules = modules;
```

### BoundedWildcard
Can generalize to `? extends ClassMetadata`
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
  }

  public void addClassMetadata(List<ClassMetadata> classMetadata) {
    for (ClassMetadata cm : classMetadata) {
      classesToMetadata.put(myNameEnumerator.enumerate(cm.getFqn()), cm);
```

### BoundedWildcard
Can generalize to `? extends List`
in `reporter/src/com/intellij/rt/coverage/report/util/SourceFileLocator.java`
#### Snippet
```java
  }

  private void checkSourceForClass(Map<String, List<String>> lostSources, File file) {
    final List<String> classes = lostSources.get(file.getName());
    if (classes == null) return;
```

### BoundedWildcard
Can generalize to `? super ClassPathEntry`
in `src/com/intellij/rt/coverage/util/classFinder/ClassFinder.java`
#### Snippet
```java
  }

  private void collectClassloaderEntries(final Set<ClassPathEntry> result) {
    for (Object myClassloader : myClassloaders) {
      URLClassLoader cl = (URLClassLoader) myClassloader;
```

### BoundedWildcard
Can generalize to `? extends LineData`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private void writeFile(String fileName, List<LineData> lines, Map<LineData, Counter> lineCounters) throws XMLStreamException {
    myOut.writeStartElement(SOURCEFILE_TAG);
    myOut.writeAttribute(NAME_TAG, fileName);
```

### BoundedWildcard
Can generalize to `? extends Counter`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private void writeFile(String fileName, List<LineData> lines, Map<LineData, Counter> lineCounters) throws XMLStreamException {
    myOut.writeStartElement(SOURCEFILE_TAG);
    myOut.writeAttribute(NAME_TAG, fileName);
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private Counter writePackage(ProjectData project, String packageName, List<ClassData> classes) throws XMLStreamException {
    myOut.writeStartElement(PACKAGE_TAG);
    myOut.writeAttribute("name", ClassNameUtil.convertToInternalName(packageName));
```

### BoundedWildcard
Can generalize to `? extends LineData`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private Counter writeMethod(ClassInstructions classInstructions, String signature, List<LineData> lines, Map<LineData, Counter> lineCounters) throws XMLStreamException {
    myOut.writeStartElement(METHOD_TAG);
    int nameIndex = signature.indexOf('(');
```

### BoundedWildcard
Can generalize to `? super LineData`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private Counter writeMethod(ClassInstructions classInstructions, String signature, List<LineData> lines, Map<LineData, Counter> lineCounters) throws XMLStreamException {
    myOut.writeStartElement(METHOD_TAG);
    int nameIndex = signature.indexOf('(');
```

### BoundedWildcard
Can generalize to `? super Counter`
in `java6-utils/src/com/intellij/rt/coverage/report/XMLCoverageReport.java`
#### Snippet
```java
  }

  private Counter writeMethod(ClassInstructions classInstructions, String signature, List<LineData> lines, Map<LineData, Counter> lineCounters) throws XMLStreamException {
    myOut.writeStartElement(METHOD_TAG);
    int nameIndex = signature.indexOf('(');
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java
 */
public class StringsPool {
  private final static TLongObjectHashMap<String> myReusableStrings;
  private final static Map<Long, String> myConcurrentReusableStrings;
  private final static String EMPTY = "";
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java
public class StringsPool {
  private final static TLongObjectHashMap<String> myReusableStrings;
  private final static Map<Long, String> myConcurrentReusableStrings;
  private final static String EMPTY = "";

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java
  private final static TLongObjectHashMap<String> myReusableStrings;
  private final static Map<Long, String> myConcurrentReusableStrings;
  private final static String EMPTY = "";

  static {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java
  private final static ZipEntryProcessor myZipProcessor = new ZipEntryProcessor();

  private static abstract class AbstractClassPathEntryProcessor implements ClassPathEntryProcessor {
    private ClassFilter myFilter;

```

### MissortedModifiers
Missorted modifiers `final static`
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java

  private final static DirectoryEntryProcessor myDirectoryProcessor = new DirectoryEntryProcessor();
  private final static ZipEntryProcessor myZipProcessor = new ZipEntryProcessor();

  private static abstract class AbstractClassPathEntryProcessor implements ClassPathEntryProcessor {
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java
  }

  private final static DirectoryEntryProcessor myDirectoryProcessor = new DirectoryEntryProcessor();
  private final static ZipEntryProcessor myZipProcessor = new ZipEntryProcessor();

```

### MissortedModifiers
Missorted modifiers `final static`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/util/LinesUtil.java`
#### Snippet
```java
 */
public class LinesUtil {
  private final static LineData[] EMPTY_LINES = new LineData[0];

  public static LineData[] calcLineArray(final int maxLineNumber, final TIntObjectHashMap<LineData> lines) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
 */
public class ErrorReporter {
  private final static String ERROR_FILE = "coverage-error.log";
  private final static SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
  private static String basePath;
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
public class ErrorReporter {
  private final static String ERROR_FILE = "coverage-error.log";
  private final static SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
  private static String basePath;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
  private static final Pattern TYPE_PATTERN = Pattern.compile("L[^;]*;");

  public static abstract class Consumer {
    protected abstract String consume(String str);
  }
```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
  }

  public final static class FileLock {
    final File myLock;

```

### MissortedModifiers
Missorted modifiers `final static`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
  }

  private final static ThreadLocalCachedValue<byte[]> ioBuffer = new ThreadLocalCachedValue<byte[]>() {
    @Override
    protected byte[] create() {
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'length()==0'
in `instrumentation/src/com/intellij/rt/coverage/util/CoverageReport.java`
#### Snippet
```java
        final String className = CoverageIOUtil.readUTFFast(in);
        final String classSource = CoverageIOUtil.readUTFFast(in);
        if ("".equals(classSource)) {
          continue;
        }
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `ourIsInitialized` accessed in synchronized context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java

    synchronized (Instrumentator.class) {
      if (ourIsInitialized) {
        ErrorReporter.reportError("Coverage agent has been applied twice, ignore the second one.");
        return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ourIsInitialized` accessed in synchronized context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
        return;
      }
      ourIsInitialized = true;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ourProjectData` accessed in synchronized context
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
    if (ourProjectData == null) {
      synchronized (RawProjectData.class) {
        if (ourProjectData == null) {
          ourProjectData = new RawProjectData();
          final String filePath = System.getProperty("kover.offline.report.path");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ourProjectData` accessed in synchronized context
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
      synchronized (RawProjectData.class) {
        if (ourProjectData == null) {
          ourProjectData = new RawProjectData();
          final String filePath = System.getProperty("kover.offline.report.path");
          if (filePath != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `ourProjectData` accessed in synchronized context
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
          if (filePath != null) {
            final File file = new File(filePath);
            RawHitsReport.dumpOnExit(file, ourProjectData);
            ErrorReporter.setBasePath(file.getParent());
          } else {
```

## RuleId[id=ChainedEquality]
### ChainedEquality
Chained equality comparison `packageIndex != -1 == matchFound`
in `reporter/src/com/intellij/rt/coverage/report/DirectorySourceCodeProvider.java`
#### Snippet
```java
      lastCandidateText = text;
      final boolean matchFound = pattern.matcher(lastCandidateText).find();
      if (packageIndex != -1 == matchFound) return lastCandidateText;
    }
    return lastCandidateText;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/com/intellij/rt/coverage/util/TestTrackingIOUtil.java`
#### Snippet
```java
    final File traceFile = new File(tracesDirectory, name + ".tr");
    if (!traceFile.exists()) {
      traceFile.createNewFile();
    }
    DataOutputStream os = null;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
      myLock = new File(target.getParentFile(), target.getName() + ".lck");
      if (myLock.getParentFile() != null) {
        myLock.getParentFile().mkdirs();
      }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    final File result = new File(dataFile.getParent(), dirName);
    if (!result.exists()) {
      result.mkdirs();
    }
    return result;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    if (dataFile != null && !dataFile.exists()) {
      final File parentDir = dataFile.getParentFile();
      if (parentDir != null && !parentDir.exists()) parentDir.mkdirs();
      dataFile.createNewFile();
    }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
      final File parentDir = dataFile.getParentFile();
      if (parentDir != null && !parentDir.exists()) parentDir.mkdirs();
      dataFile.createNewFile();
    }
    ourProjectData.myStopped = false;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawHitsReport.java`
#### Snippet
```java
    try {
      if (!reportFileExists && !file.exists()) {
        file.getParentFile().mkdirs();
        file.createNewFile();
      }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawHitsReport.java`
#### Snippet
```java
      if (!reportFileExists && !file.exists()) {
        file.getParentFile().mkdirs();
        file.createNewFile();
      }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `reporter/src/com/intellij/rt/coverage/report/Reporter.java`
#### Snippet
```java

  public void createHTMLReport(File htmlDir, String title, String charset) throws IOException {
    htmlDir.mkdirs();
    final HTMLReportBuilder builder = ReportBuilderFactory.createHTMLReportBuilderForKover();
    builder.setReportDir(htmlDir);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `reporter/src/com/intellij/rt/coverage/report/Reporter.java`
#### Snippet
```java
    FileOutputStream out = null;
    try {
      xmlFile.getParentFile().mkdirs();
      out = new FileOutputStream(xmlFile);
      report.write(out, myLoad.getProjectData());
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/DiscoveryAgentBenchmark.java`
#### Snippet
```java
  @Benchmark
  public void jodaTimeTestDiscovery() throws Exception {
    PrintStream original = System.out;
    try {
      System.setOut(new PrintStream(new NullOutputStream()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
  public static void logInfo(String message) {
    if (myLogLevel > INFO) return;
    System.out.println(message);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
      StringBuffer buf = prepareMessage(message);

      System.err.println(buf + ": " + t.toString());
      os.println(buf);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
      t.printStackTrace(os);
    } catch (IOException e) {
      System.err.println("Failed to write to error log file: " + e);
      System.err.println("Initial stack trace: " + t.toString());
    } finally {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
    } catch (IOException e) {
      System.err.println("Failed to write to error log file: " + e);
      System.err.println("Initial stack trace: " + t.toString());
    } finally {
      CoverageIOUtil.close(os);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java

  public static synchronized void logError(final String message) {
    System.err.println(message);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
      StringBuffer buf = prepareMessage(message);

      System.err.println(buf);
      os.println(buf);
    } catch (IOException e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/com/intellij/rt/coverage/util/ErrorReporter.java`
#### Snippet
```java
      os.println(buf);
    } catch (IOException e) {
      System.err.println("Failed to write to error log file: " + e);
    } finally {
      CoverageIOUtil.close(os);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/api/StandaloneTestDiscoveryFileReader.java`
#### Snippet
```java

      public void processMetadataEntry(String key, String value) {
        System.out.println("Metadata entry: " + key + " = " + value);
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/api/StandaloneTestDiscoveryFileReader.java`
#### Snippet
```java
      @Override
      protected void processData(String testClassName, String testMethodName, String className, String methodName) {
        System.out.println(testClassName + "." + testMethodName + " uses " + className + "." + methodName);
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/api/StandaloneTestDiscoveryFileReader.java`
#### Snippet
```java

      protected void processClassMetadataData(ClassMetadata metadata) {
        System.out.println("Class Metadata entry: " + metadata.getFqn());
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/api/StandaloneTestDiscoveryFileReader.java`
#### Snippet
```java
      @Override
      protected void processAffectedFile(String testClassName, String testMethodName, String filePath) {
        System.out.println(testClassName + "." + testMethodName + " uses file " + filePath);
      }
    });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/OpenCloseFileTransformer.java`
#### Snippet
```java
    }, SKIP_FRAMES);

    System.out.println("Injected open/close file listeners into " + className);

    return cw.toByteArray();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/aggregate/Main.java`
#### Snippet
```java

    } catch (ArgParseException e) {
      e.printStackTrace(System.err);

      for (String arg : argsList) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/aggregate/Main.java`
#### Snippet
```java

      for (String arg : argsList) {
        System.err.println(arg);
      }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/aggregate/Main.java`
#### Snippet
```java
      }

      System.err.println();
      System.err.println(AggregatorArgs.getHelpString());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/aggregate/Main.java`
#### Snippet
```java

      System.err.println();
      System.err.println(AggregatorArgs.getHelpString());
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java

    } catch (ArgParseException e) {
      e.printStackTrace(System.err);

      for (String arg : argsList) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java

      for (String arg : argsList) {
        System.err.println(arg);
      }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java
      }

      System.err.println();
      System.err.println(VerifierArgs.getHelpString());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java

      System.err.println();
      System.err.println(VerifierArgs.getHelpString());
      System.exit(1);
    } catch (IOException e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/verify/Main.java`
#### Snippet
```java
      System.exit(1);
    } catch (IOException e) {
      e.printStackTrace(System.err);
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/instrument/Main.java`
#### Snippet
```java

    } catch (ArgParseException e) {
      e.printStackTrace(System.err);

      for (String arg : argsList) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/instrument/Main.java`
#### Snippet
```java

      for (String arg : argsList) {
        System.err.println(arg);
      }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/instrument/Main.java`
#### Snippet
```java
      }

      System.err.println();
      System.err.println(InstrumentatorArgs.getHelpString());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/instrument/Main.java`
#### Snippet
```java

      System.err.println();
      System.err.println(InstrumentatorArgs.getHelpString());
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
        } catch (IOException e) {
          fail = true;
          System.err.println("XML generation failed.");
          e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
        } catch (IOException e) {
          fail = true;
          System.err.println("HTML generation failed.");
          e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java

      if (args.xmlFile == null && args.htmlDir == null) {
        System.err.println("At least one format must be used: XML, HTML.");
        fail = true;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
      }
    } catch (ArgParseException e) {
      e.printStackTrace(System.err);

      for (String arg : argsList) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java

      for (String arg : argsList) {
        System.err.println(arg);
      }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
      }

      System.err.println();
      System.err.println(ReporterArgs.getHelpString());
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java

      System.err.println();
      System.err.println(ReporterArgs.getHelpString());
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/SingleTrFileDiscoveryProtocolDataListener.java`
#### Snippet
```java
    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
      public void run() {
        System.out.println("Send time: " + 1. * ourSendTime / CoverageIOUtil.GIGA);
      }
    }));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
  private static void addOpenCloseTransformer(Instrumentation instrumentation) throws UnmodifiableClassException {
    if (!Boolean.parseBoolean(System.getProperty(TestDiscoveryProjectData.TRACK_FILES, "true"))) {
      System.out.println("Tracking for opened/closed files disabled by '" + TestDiscoveryProjectData.TRACK_FILES + "' system property");
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java

    if (System.getProperty(TestDiscoveryProjectData.AFFECTED_ROOTS) == null) {
      System.out.println("Tracking for opened/closed files disabled due to undefined '" + TestDiscoveryProjectData.AFFECTED_ROOTS + "' system property");
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
    String property = System.getProperty(key);
    if (property == null) return Collections.emptyList();
    System.out.println("Patterns from " + key);
    List<Pattern> patterns = new ArrayList<Pattern>(1);
    for (String s : property.split(";")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
      try {
        patterns.add(Pattern.compile(s));
        System.out.println(s);
      } catch (PatternSyntaxException ex) {
        System.err.println("Problem occurred with pattern " + s);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
        System.out.println(s);
      } catch (PatternSyntaxException ex) {
        System.err.println("Problem occurred with pattern " + s);
        System.err.println(ex.getDescription());
        System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
      } catch (PatternSyntaxException ex) {
        System.err.println("Problem occurred with pattern " + s);
        System.err.println(ex.getDescription());
        System.exit(1);
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java

  private void performPremain(Instrumentation instrumentation) throws Exception {
    System.out.println("---- IntelliJ IDEA Test Discovery ---- ");

    // separated by ;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java

  private static synchronized void logTestInfo() {
    System.out.println("Trace time: " + 1. * ourTraceTime / GIGA);
    System.out.println("Cleanup time: " + 1. * ourCleanupTime / GIGA);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
  private static synchronized void logTestInfo() {
    System.out.println("Trace time: " + 1. * ourTraceTime / GIGA);
    System.out.println("Cleanup time: " + 1. * ourCleanupTime / GIGA);

    System.out.println("Leaked files: " + myOpenFilesMap.size());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
    System.out.println("Cleanup time: " + 1. * ourCleanupTime / GIGA);

    System.out.println("Leaked files: " + myOpenFilesMap.size());
    for (File value : new ArrayList<File>(myOpenFilesMap.values())) {
      System.out.println(value.getPath());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
    System.out.println("Leaked files: " + myOpenFilesMap.size());
    for (File value : new ArrayList<File>(myOpenFilesMap.values())) {
      System.out.println(value.getPath());
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/CoverageAgentBenchmark.java`
#### Snippet
```java
  @Benchmark
  public void jodaTimeTestCoverage() throws Exception {
    PrintStream original = System.out;
    try {
      System.setOut(new PrintStream(new NullOutputStream()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/CoverageAgentBenchmark.java`
#### Snippet
```java
  @Benchmark
  public void apacheCollectionsTestCoverage() throws Exception {
    PrintStream original = System.out;
    try {
      System.setOut(new PrintStream(new NullOutputStream()));
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinInlineFilter.java`
#### Snippet
```java
      public boolean execute(int line) {
        final LineData lineData = classData.getLineData(line);
        lineData.setMethodSignature(lineData.getMethodSignature().replace(UNKNOWN_DESC, DEFAULT_DESC));
        return true;
      }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
    final int lineInfoEnd = debug.indexOf(SECTION_SEPARATOR, lineInfoStart);
    final String lineInfo = debug.substring(lineInfoStart, lineInfoEnd);
    final String[] lines = lineInfo.split("\n");
    int fileId = 1;
    for (String line : lines) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
      fileSection = fileSection.substring(0, fileSection.length() - 1);
    }
    return fileSection.split("\n");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reporter/src/com/intellij/rt/coverage/report/DirectorySourceCodeProvider.java`
#### Snippet
```java

    final int packageIndex = className.lastIndexOf('.');
    final String packageName = packageIndex == -1 ? ".*" : className.substring(0, packageIndex).replace(".", "\\.");
    final Pattern pattern = Pattern.compile("package +" + packageName);
    String lastCandidateText = null;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/main/TestDiscoveryPremain.java`
#### Snippet
```java
    System.out.println("Patterns from " + key);
    List<Pattern> patterns = new ArrayList<Pattern>(1);
    for (String s : property.split(";")) {
      try {
        patterns.add(Pattern.compile(s));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `reporter/src/com/intellij/rt/coverage/instrument/Instrumentator.java`
#### Snippet
```java
        }

        final File directory = new File(myOutput, packageName.replace(".", File.separator));
        if (!directory.exists() && !directory.mkdirs()) {
          throw new RuntimeException("Failed to create directory at " + directory.getAbsolutePath());
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
  private static String[] split(String key) {
    String affected = System.getProperty(key);
    return affected == null ? new String[]{} : affected.split(";");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java

  private int[] fileToInts(String file) {
    String[] split = file.split("/");
    int[] result = new int[split.length];
    for (int i = 0; i < split.length; i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/SourceFilesCollector.java`
#### Snippet
```java
    else {
      // SourceFile attribute
      String sourceFile = JSR45Util.getClassPackageName(className).replace(".", "/") + source;
      if (!sources.contains(sourceFile)) {
        sources.add(sourceFile);
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
      @Override
      public void visitCode() {
        super.visitFieldInsn(Opcodes.GETSTATIC, myInternalClassName, myFieldName, myFieldType);

        final Label alreadyInitialized = new Label();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java

        final Label alreadyInitialized = new Label();
        super.visitJumpInsn(Opcodes.IFNONNULL, alreadyInitialized);

        initField(mv);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
        initField(mv);

        super.visitLabel(alreadyInitialized);
        super.visitCode();
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/testTracking/TestTrackingArrayMode.java`
#### Snippet
```java
  protected MethodVisitor createMethodTransformer(final MethodVisitor mv, BranchesEnumerator enumerator, final int access, String name, final String desc) {
    if (enumerator.hasNoLines()) {
      return myArrayDataAccess.createMethodVisitor(super.myDataAccess.createMethodVisitor(mv, name, false), name, false);
    }
    final MethodVisitor visitor = new LocalVariableInserter(mv, access, desc, TRACE_MASK_LOCAL_VARIABLE_NAME, DataAccessUtil.TEST_MASK_ARRAY_TYPE) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/testTracking/TestTrackingArrayMode.java`
#### Snippet
```java
      }
    };
    return myArrayDataAccess.createMethodVisitor(super.myDataAccess.createMethodVisitor(visitor, name, true), name, true);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/KotlinValueClassFilter.java`
#### Snippet
```java
          if (myConstructorLine >= 0) {
            Label label = new Label();
            super.visitLabel(label);
            super.visitLineNumber(myConstructorLine, label);
          }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/KotlinValueClassFilter.java`
#### Snippet
```java
            Label label = new Label();
            super.visitLabel(label);
            super.visitLineNumber(myConstructorLine, label);
          }
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/TestDiscoveryInstrumenter.java`
#### Snippet
```java

  /**
   * Pushes class name, array of boolean and method names from stack to the {@link TestDiscoveryProjectData#trace(java.lang.String, boolean[], java.lang.String[])}
   * and store result in the field {@link TestDiscoveryInstrumenter#METHODS_VISITED}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/TestDiscoveryInstrumenter.java`
#### Snippet
```java

  /**
   * Pushes class name, array of boolean and method names from stack to the {@link TestDiscoveryProjectData#trace(java.lang.String, boolean[], java.lang.String[])}
   * and store result in the field {@link TestDiscoveryInstrumenter#METHODS_VISITED}
   */
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.intellij.rt.coverage.instrumentation.filters.KotlinUtils;`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/BooleanInvertFilter.java`
#### Snippet
```java

import com.intellij.rt.coverage.instrumentation.Instrumenter;
import com.intellij.rt.coverage.instrumentation.filters.KotlinUtils;
import org.jetbrains.coverage.org.objectweb.asm.Label;
import org.jetbrains.coverage.org.objectweb.asm.Opcodes;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/TestDiscoveryListener.java`
#### Snippet
```java
        testEnded.invoke(data, className, methodName);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/TestDiscoveryListener.java`
#### Snippet
```java
        testStarted.invoke(data, getClassName(test), getMethodName(test));
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `junit4-test-discovery-launcher/src/org/junit/runner/JUnitLauncher.java`
#### Snippet
```java
        testEnded.invoke(data, className, methodName);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `junit4-test-discovery-launcher/src/org/junit/runner/JUnitLauncher.java`
#### Snippet
```java
        testEnded.invoke(data);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `junit4-test-discovery-launcher/src/org/junit/runner/JUnitLauncher.java`
#### Snippet
```java
        testStarted.invoke(data, className, methodName);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
          fail = true;
          System.err.println("XML generation failed.");
          e.printStackTrace();
        }
      }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `reporter/src/com/intellij/rt/coverage/report/Main.java`
#### Snippet
```java
          fail = true;
          System.err.println("HTML generation failed.");
          e.printStackTrace();
        }
      }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/SocketTestDiscoveryProtocolDataListener.java`
#### Snippet
```java
      writeTestFinished(dos, className, methodName, classToVisitedMethods, classToMethodNames, openedFiles);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/SocketTestDiscoveryProtocolDataListener.java`
#### Snippet
```java
      finish(dos);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/SocketTestDiscoveryProtocolDataListener.java`
#### Snippet
```java
        mySocket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/TestDiscoveryInnerClassInstrumenter.java`
#### Snippet
```java
      defineClassMethodRef.invoke(myClassLoader, bytes, 0, bytes.length);
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
      myDataListener.testsFinished();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
    Map<String, ClassReader> loaderClassReaders = myClassReaders.get(myClassLoader);
    if (loaderClassReaders == null) {
      myClassReaders.put(myClassLoader, loaderClassReaders = new HashMap<String, ClassReader>());
    }
    ClassReader classReader = loaderClassReaders.get(className);
```

### NestedAssignment
Result of assignment expression used
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
          throw new IOException("Class " + className + " not found");
        }
        loaderClassReaders.put(className, classReader = new ClassReader(is));
      } finally {
        if (is != null) {
```

### NestedAssignment
Result of assignment expression used
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
  public static String processRelative(String fileName) {
    int idx;
    while ((idx = fileName.indexOf("..")) > -1) {
      final String rest = fileName.substring(idx + "..".length());
      String start = fileName.substring(0, idx);
```

### NestedAssignment
Result of assignment expression used
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawHitsReport.java`
#### Snippet
```java

      String className;
      while (!"".equals(className = CoverageIOUtil.readUTFFast(is))) {
        final int length = CoverageIOUtil.readINT(is);
        final int[] hits = projectData.getOrCreateClass(className, length).hits;
```

### NestedAssignment
Result of assignment expression used
in `reporter/src/com/intellij/rt/coverage/instrument/IOUtil.java`
#### Snippet
```java
      os = new ByteArrayOutputStream();
      int read;
      while ((read = is.read(buffer)) != -1) {
        os.write(buffer, 0, read);
      }
```

### NestedAssignment
Result of assignment expression used
in `test-discovery/src/com/intellij/rt/coverage/data/SingleTrFileDiscoveryProtocolDataListener.java`
#### Snippet
```java
      writeTestFinished(myStream, className, methodName, classToVisitedMethods, classToMethodNames, openedFiles);
    } finally {
      Long diff = ourSendTime += System.nanoTime() - s;
    }
  }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ExtraFieldInstrumenter()` of an abstract class should not be declared 'public'
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
  private boolean mySeenClinit = false;

  public ExtraFieldInstrumenter(ClassReader cr, ClassVisitor classVisitor, String className,
                                String fieldName, String fieldType,
                                boolean shouldCoverClinit) {
```

### NonProtectedConstructorInAbstractClass
Constructor `ClassEntry()` of an abstract class should not be declared 'public'
in `src/com/intellij/rt/coverage/util/classFinder/ClassEntry.java`
#### Snippet
```java
  private final String myClassName;

  public ClassEntry(final String className) {
    myClassName = className;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `LinesFilter()` of an abstract class should not be declared 'public'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/LinesFilter.java`
#### Snippet
```java
  protected Instrumenter myContext;

  public LinesFilter() {
    super(Opcodes.API_VERSION);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BranchesFilter()` of an abstract class should not be declared 'public'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/BranchesFilter.java`
#### Snippet
```java
  protected BranchDataContainer myBranchData;

  public BranchesFilter() {
    super(Opcodes.API_VERSION);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `FileLocator()` of an abstract class should not be declared 'public'
in `reporter/src/com/intellij/rt/coverage/report/util/FileLocator.java`
#### Snippet
```java
  protected final List<File> myRoots;

  public FileLocator(List<File> roots) {
    myRoots = roots;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `TestDiscoveryProtocolDataListener()` of an abstract class should not be declared 'public'
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProtocolDataListener.java`
#### Snippet
```java
  protected final byte myVersion;

  public TestDiscoveryProtocolDataListener(byte version) {
    this.myVersion = version;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ClassFilter()` of an abstract class should not be declared 'public'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/ClassFilter.java`
#### Snippet
```java
  protected Instrumenter myContext;

  public ClassFilter() {
    super(Opcodes.API_VERSION);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Instrumenter()` of an abstract class should not be declared 'public'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
  private int myIgnoreSection = 0;

  public Instrumenter(final ProjectData projectData, ClassVisitor classVisitor, String className, boolean shouldSaveSource) {
    super(classVisitor, className);
    myProjectData = projectData;
```

### NonProtectedConstructorInAbstractClass
Constructor `KotlinCoroutinesFilter()` of an abstract class should not be declared 'public'
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private boolean myHasInstructions;

  public KotlinCoroutinesFilter(MethodVisitor methodVisitor, Instrumenter instrumenter) {
    super(Opcodes.API_VERSION, methodVisitor);
    myContext = instrumenter;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myInstructions` is accessed in both synchronized and unsynchronized contexts
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
  private final ClassesMap myClasses = new ClassesMap();
  private volatile Map<String, FileMapData[]> myLinesMap;
  private Map<String, ClassInstructions> myInstructions;

  /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ourSendTime` is accessed in both synchronized and unsynchronized contexts
in `test-discovery/src/com/intellij/rt/coverage/data/SingleTrFileDiscoveryProtocolDataListener.java`
#### Snippet
```java
  }

  private static Long ourSendTime = 0L;

  public synchronized void testFinished(String className, String methodName, Map<Integer, boolean[]> classToVisitedMethods, Map<Integer, int[]> classToMethodNames, List<int[]> openedFiles) throws IOException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ourTraceTime` is accessed in both synchronized and unsynchronized contexts
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
  }

  private static Long ourTraceTime = 0L;
  private static Long ourCleanupTime = 0L;

```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
public interface TestDiscoveryProtocolReader {

  void testDiscoveryDataProcessingStarted(int version);

  void testDiscoveryDataProcessingFinished();
```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
  TestDataReader createTestDataReader(int classId, int methodId);

  void debug(String message);

  void error(String message);
```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
  void debug(String message);

  void error(String message);

  void error(Exception error);
```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
  void error(String message);

  void error(Exception error);

  interface MetadataReader {
```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
    void classFinished(int classId);

    void finished();
  }

```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
    void processUsedMethod(int methodId);

    void classProcessingFinished(int classId);

    void testDataProcessed();
```

### EmptyMethod
All implementations of this method are empty
in `test-discovery/src/com/intellij/rt/coverage/data/api/TestDiscoveryProtocolReader.java`
#### Snippet
```java
    void classProcessingFinished(int classId);

    void testDataProcessed();

    void processAffectedFile(int[] chunks);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/MethodFilteringVisitor.java`
#### Snippet
```java
  private boolean myEnum = false;
  private boolean myHasInterfaces = false;
  private boolean myIsAbstract = false;
  private final List<String> myAnnotations = new ArrayList<String>();
  private HashMap<String, Object> myProperties;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/MethodFilteringVisitor.java`
#### Snippet
```java

  private final String myClassName;
  private boolean myEnum = false;
  private boolean myHasInterfaces = false;
  private boolean myIsAbstract = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/MethodFilteringVisitor.java`
#### Snippet
```java
  private final String myClassName;
  private boolean myEnum = false;
  private boolean myHasInterfaces = false;
  private boolean myIsAbstract = false;
  private final List<String> myAnnotations = new ArrayList<String>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
  private final boolean myInterface;
  private final boolean myShouldCoverClinit;
  private boolean mySeenClinit = false;

  public ExtraFieldInstrumenter(ClassReader cr, ClassVisitor classVisitor, String className,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/LineInstrumenter.java`
#### Snippet
```java

  private final CoverageDataAccess myDataAccess;
  private int myLastId = 0;

  public LineInstrumenter(final ProjectData projectData,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/InstructionsEnumerator.java`
#### Snippet
```java
  private Label myLastLabel;
  private int myInstructionCounter;
  private boolean myHasInstructions = false;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/data/BranchDataContainer.java`
#### Snippet
```java
  private final Instrumenter myContext;

  private int myNextId = 0;

  private Label myLastFalseJump;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
 */
public class Instrumentator {
  public static boolean ourIsInitialized = false;

  public static void premain(String argsString, Instrumentation instrumentation) throws Exception {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/BranchesEnumerator.java`
#### Snippet
```java

  protected int myCurrentLine;
  private boolean myHasExecutableLines = false;

  public BranchesEnumerator(BranchesInstrumenter instrumenter, BranchDataContainer branchData, MethodVisitor mv,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinWhenMappingExceptionFilter.java`
#### Snippet
```java
  private Label myCurrentLabel = null;
  private int myCurrentLine;
  private int myState = 0;
  private Label myJumpLabel;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinWhenMappingExceptionFilter.java`
#### Snippet
```java
  private Map<Label, PositionData> myJumpLabels;
  private Map<Label, PositionData> mySwitchLabels;
  private Label myCurrentLabel = null;
  private int myCurrentLine;
  private int myState = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinOpenMemberWithDefaultArgsFilter.java`
#### Snippet
```java
 */
public class KotlinOpenMemberWithDefaultArgsFilter extends BranchesFilter {
  private int myState = 0;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/KotlinAnonymousClassInIgnoredMethodFilter.java`
#### Snippet
```java
 */
public class KotlinAnonymousClassInIgnoredMethodFilter extends ClassFilter {
  private boolean myShouldIgnoreClass = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinDefaultArgsLineFilter.java`
#### Snippet
```java
  private int myFirstLine = -1;
  private int myCurrentLine = -1;
  private int myState = 0;
  private boolean myHasInstructions = false;
  private String myName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinDefaultArgsLineFilter.java`
#### Snippet
```java
  private int myCurrentLine = -1;
  private int myState = 0;
  private boolean myHasInstructions = false;
  private String myName;
  private String myNameDesc;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/com/intellij/rt/coverage/data/ClassData.java`
#### Snippet
```java
   * this case may have incomplete lines and should be treated as unloaded.
   */
  private boolean myFullyAnalysed = false;

  public ClassData(final String name) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java

  private byte myStatus = -1;
  private String myUniqueTestName = null;
  private boolean myMayBeUnique = true;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java

  private int myId = -1;
  private int myHits = 0;

  private byte myStatus = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  private boolean myIsAbstractClass;
  private boolean myAllMethodsStatic = true;
  private boolean myIsKotlinObject = false;
  private boolean myIsKotlinClass = false;
  private boolean myConstructorIsEmpty = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  private boolean myAllMethodsStatic = true;
  private boolean myIsKotlinObject = false;
  private boolean myIsKotlinClass = false;
  private boolean myConstructorIsEmpty = true;
  private List<Integer> myConstructorLines;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  private class EmptyConstructorVisitor extends MethodVisitor {
    private boolean myALoadVisited = false;
    private boolean myInvokeSpecialVisited = false;

    public EmptyConstructorVisitor(MethodVisitor methodVisitor) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/PrivateConstructorOfUtilClassFilter.java`
#### Snippet
```java
  //    ATHROW
  private class EmptyConstructorVisitor extends MethodVisitor {
    private boolean myALoadVisited = false;
    private boolean myInvokeSpecialVisited = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
    public static class Counter {
      public long missed = 0;
      public long covered = 0;

      public void add(Counter other) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java

    public static class Counter {
      public long missed = 0;
      public long covered = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/offline/ClassLengthAnalyser.java`
#### Snippet
```java
class ClassLengthAnalyser extends ClassVisitor {
  private int myMaxLine = -1;
  private int myHits = 0;

  public ClassLengthAnalyser() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinDefaultArgsBranchFilter.java`
#### Snippet
```java
  private int myMinMaskIndex = -1;

  private boolean myIgnoreNextIf = false;
  private boolean myAndVisited = false;
  private String myName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinDefaultArgsBranchFilter.java`
#### Snippet
```java

  private boolean myIgnoreNextIf = false;
  private boolean myAndVisited = false;
  private String myName;
  private String myDesc;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinWhenStringFilter.java`
#### Snippet
```java
 */
public class KotlinWhenStringFilter extends BranchesFilter {
  private int myState = 0;
  private Label myJumpLabel;
  private Label myDefaultLabel;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/KotlinValueClassFilter.java`
#### Snippet
```java
  private int myGetterLine = -1;
  private int myConstructorLine = -1;
  private int myFieldsCount = 0;
  private String myFieldType;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/ClosingBracesFilter.java`
#### Snippet
```java
  private int myCurrentLine = -1;
  private boolean mySeenReturn;
  private int myLinesCount = 0;

  private void tryRemoveLine() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/BooleanInvertFilter.java`
#### Snippet
```java
  private Label myTrueLabel;
  private Label myFalseLabel;
  private int myState = 0;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinImplementerDefaultInterfaceMemberFilter.java`
#### Snippet
```java
  }

  private byte matchedInstructions = 0;
  private int myLine = -1;
  private LineData myPreviousLineData;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
  protected ClassData myClassData;
  protected boolean myProcess;
  private int myIgnoreSection = 0;

  public Instrumenter(final ProjectData projectData, ClassVisitor classVisitor, String className, boolean shouldSaveSource) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/com/intellij/rt/coverage/data/instructions/SwitchInstructions.java`
#### Snippet
```java

public class SwitchInstructions {
  private int myDefaultInstructions = 0;
  private int[] myInstructions;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
 */
public abstract class KotlinCoroutinesFilter extends MethodVisitor {
  private boolean myGetCoroutinesSuspendedVisited = false;
  private boolean myStoreCoroutinesSuspendedVisited = false;
  private boolean myLoadCoroutinesSuspendedVisited = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private final Instrumenter myContext;

  private int myState = 0;
  private boolean myHasInstructions;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private boolean myStoreCoroutinesSuspendedVisited = false;
  private boolean myLoadCoroutinesSuspendedVisited = false;
  private boolean myLoadStateLabelVisited = false;
  private boolean mySuspendCallVisited = false;
  private int myCoroutinesSuspendedIndex = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private boolean myGetCoroutinesSuspendedVisited = false;
  private boolean myStoreCoroutinesSuspendedVisited = false;
  private boolean myLoadCoroutinesSuspendedVisited = false;
  private boolean myLoadStateLabelVisited = false;
  private boolean mySuspendCallVisited = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private boolean myLoadCoroutinesSuspendedVisited = false;
  private boolean myLoadStateLabelVisited = false;
  private boolean mySuspendCallVisited = false;
  private int myCoroutinesSuspendedIndex = -1;
  private int myLine = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
public abstract class KotlinCoroutinesFilter extends MethodVisitor {
  private boolean myGetCoroutinesSuspendedVisited = false;
  private boolean myStoreCoroutinesSuspendedVisited = false;
  private boolean myLoadCoroutinesSuspendedVisited = false;
  private boolean myLoadStateLabelVisited = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/KotlinCoroutinesFilter.java`
#### Snippet
```java
  private int myCoroutinesSuspendedIndex = -1;
  private int myLine = -1;
  private boolean myHadLineDataBefore = false;
  private final Instrumenter myContext;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/branches/KotlinUnsafeCastFilter.java`
#### Snippet
```java
 */
public class KotlinUnsafeCastFilter extends BranchesFilter {
  private int myState = 0;

  @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `mv`
in `util/src/com/intellij/rt/coverage/instrumentation/ExtraFieldInstrumenter.java`
#### Snippet
```java
    if ("<clinit>".equals(name)) {
      if (myInterface && (myJava8AndAbove || myShouldCoverClinit)) {
        mv = new MethodVisitor(Opcodes.API_VERSION, mv) {
          @Override
          public void visitCode() {
```

### AssignmentToMethodParameter
Assignment to method parameter `mv`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/LineInstrumenter.java`
#### Snippet
```java
  public MethodVisitor createMethodLineEnumerator(MethodVisitor mv, final String name, final String desc,
                                                  int access, String signature, String[] exceptions) {
    mv = new LocalVariableInserter(mv, access, desc, "__$localHits$__", DataAccessUtil.HITS_ARRAY_TYPE) {

      public void visitLineNumber(final int line, final Label start) {
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
        return null;
      }
      className = ClassNameUtil.removeClassSuffix(className);
      className = ClassNameUtil.convertToFQName(className);

```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
      }
      className = ClassNameUtil.removeClassSuffix(className);
      className = ClassNameUtil.convertToFQName(className);

      //do not instrument itself
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `util/src/com/intellij/rt/coverage/util/ClassNameUtil.java`
#### Snippet
```java
  public static String convertVMNameToFQN(String className) {
    if (className.startsWith("L") && className.endsWith(";")) {
      className = className.substring(1, className.length() - 1);
    }
    return convertToFQName(className);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
        }
      }
      type = classReader.getSuperName();
      classReader = getOrLoadClassReader(type);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `classReader`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
      }
      type = classReader.getSuperName();
      classReader = getOrLoadClassReader(type);
    }
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
    while (!JAVA_LANG_OBJECT.equals(type)) {
      b.append(';').append(type);
      type = info.getSuperName();
      info = getOrLoadClassReader(type);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `info`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
      b.append(';').append(type);
      type = info.getSuperName();
      info = getOrLoadClassReader(type);
    }
    return b;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
      final int endIndex = start.lastIndexOf('/');
      if (endIndex > -1) {
        fileName = start.substring(0, endIndex) + rest;
      } else {
        fileName = rest.startsWith("/") ? rest.substring(1) : rest;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java
        fileName = start.substring(0, endIndex) + rest;
      } else {
        fileName = rest.startsWith("/") ? rest.substring(1) : rest;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
  private int readPatterns(final List<Pattern> patterns, int i, final String[] args, final String name) {
    ErrorReporter.logInfo(name + " patterns:");
    for (; i < args.length; i++) {
      if (args[i].startsWith("-")) break;
      try {
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
    else {
      record.writeByte(192 + (val & 0x3F));
      val >>>= 6;
      while (val >= 128) {
        record.writeByte((val & 0x7F) | 0x80);
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
      while (val >= 128) {
        record.writeByte((val & 0x7F) | 0x80);
        val >>>= 7;
      }
      record.writeByte(val);
```

### AssignmentToMethodParameter
Assignment to method parameter `methodSignature`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
        //noinspection StringEquality
        if (replacement != type) {
          methodSignature = methodSignature.replace(type, replacement);
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/OpenCloseFileTransformer.java`
#### Snippet
```java
      private void pushConst(Object o) {
        if (o.getClass() == Class.class) {
          o = Type.getType((Class<?>) o);
        }
        visitLdcInsn(o);
```

### AssignmentToMethodParameter
Assignment to method parameter `packageName`
in `reporter/src/com/intellij/rt/coverage/report/util/FileLocator.java`
#### Snippet
```java
  private static String getPath(String packageName, final String name) {
    if (packageName.isEmpty()) return name;
    packageName = packageName.replace('.', File.separatorChar);
    return packageName + File.separatorChar + name;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `mv`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/testTracking/TestTrackingClassDataMode.java`
#### Snippet
```java
                                                  final String name,
                                                  final String desc) {
    mv = super.createInstrumentingVisitor(mv, enumerator, access, name, desc);
    return createMethodTransformer(mv, enumerator, access, name, desc);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/ApacheCollectionsTests.java`
#### Snippet
```java
    do {
      if (clazz == TestCase.class) return true;
      clazz = clazz.getSuperclass();
    } while (clazz != null);
    return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
  private MethodVisitor chainFilters(MethodVisitor root, int access, String name,
                                     String desc, String signature, String[] exceptions) {
    root = createMethodLineEnumerator(root, name, desc, access, signature, exceptions);
    for (LinesFilter filter : FilterUtils.createLineFilters()) {
      if (filter.isApplicable(this, access, name, desc, signature, exceptions)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
      if (filter.isApplicable(this, access, name, desc, signature, exceptions)) {
        filter.initFilter(root, this, name, desc);
        root = filter;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/BranchesInstrumenter.java`
#### Snippet
```java
      if (filter.isApplicable(this, access, name, desc, signature, exceptions)) {
        filter.initFilter(root, this, myBranchData);
        root = filter;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `mv`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/BranchesInstrumenter.java`
#### Snippet
```java
    myBranchData.resetMethod();
    if (myProjectData.isInstructionsCoverageEnabled()) {
      mv = new InstructionsEnumerator(this, myBranchData, mv, access, name, desc, signature, exceptions);
    } else {
      mv = new BranchesEnumerator(this, myBranchData, mv, access, name, desc, signature, exceptions);
```

### AssignmentToMethodParameter
Assignment to method parameter `mv`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/BranchesInstrumenter.java`
#### Snippet
```java
      mv = new InstructionsEnumerator(this, myBranchData, mv, access, name, desc, signature, exceptions);
    } else {
      mv = new BranchesEnumerator(this, myBranchData, mv, access, name, desc, signature, exceptions);
    }
    return chainFilters(name, desc, access, signature, exceptions, mv);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `classData`
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
      final Map<Object, boolean[]> traces = ourProjectData.myTrace.get();
      if (traces != null) {
        synchronized (classData) {
          final boolean[] trace = ((ClassData) classData).getTraceMask();
          if (traces.put(classData, trace) == null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `classData`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/testTracking/TestTrackingClassDataMode.java`
#### Snippet
```java
        boolean[] result = null;
        if (linesTrace == null) {
          synchronized (classData) {
            linesTrace = classData.getTraceMask();
            if (linesTrace == null) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/MethodFilteringVisitor.java`
#### Snippet
```java

  public Object getProperty(String key) {
    if (myProperties == null) return null;
    return myProperties.get(key);
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/util/StringsPool.java`
#### Snippet
```java

  public static String getFromPool(String value) {
    if (value == null) return null;
    if (value.length() == 0) return EMPTY;

```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/util/classFinder/ClassPathEntry.java`
#### Snippet
```java
      return myZipProcessor;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
  private byte[] transformInner(ClassLoader loader, String className, byte[] classFileBuffer) {
    if (isStopped()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
    try {
      if (className == null) {
        return null;
      }
      className = ClassNameUtil.removeClassSuffix(className);
```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
          || className.startsWith("org.jetbrains.coverage.gnu.trove.")
          || className.startsWith("org.jetbrains.coverage.org.objectweb.")) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
      }

      if (shouldExclude(className)) return null;

      visitClassLoader(loader);
```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java
      ErrorReporter.reportError("Error during class instrumentation: " + className, e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java

    final ClassVisitor cv = createClassVisitor(className, loader, cr, cw);
    if (cv == null) return null;
    cr.accept(cv, ClassReader.EXPAND_FRAMES);
    return cw.toByteArray();
```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/AbstractIntellijClassfileTransformer.java`
#### Snippet
```java

  protected InclusionPattern getInclusionPattern() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/ClassWriterImpl.java`
#### Snippet
```java
      return JAVA_LANG_OBJECT;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/data/BranchDataContainer.java`
#### Snippet
```java

  public Switch getSwitch(Label label) {
    if (mySwitches == null) return null;
    return mySwitches.get(label);
  }
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/data/BranchDataContainer.java`
#### Snippet
```java

  public Jump getJump(Label jump) {
    if (myJumps == null) return null;
    return myJumps.get(jump);
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/util/ArrayUtil.java`
#### Snippet
```java

  public static <T> T safeLoad(T[] array, int index) {
    return array != null && 0 <= index && index < array.length ? array[index] : null;
  }

```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinInlineFilter.java`
#### Snippet
```java
  private FileMapData[] getMappings() {
    final ProjectData project = ProjectData.getProjectData();
    if (project == null) return null;
    final Map<String, FileMapData[]> mappings = project.getLinesMap();
    if (mappings == null) return null;
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/lines/KotlinInlineFilter.java`
#### Snippet
```java
    if (project == null) return null;
    final Map<String, FileMapData[]> mappings = project.getLinesMap();
    if (mappings == null) return null;
    return mappings.get(myContext.getClassName());
  }
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java

  private TestTrackingMode createTestTrackingMode(boolean traceLines) {
    if (!traceLines) return null;
    if (OptionsUtil.NEW_BRANCH_COVERAGE_ENABLED && OptionsUtil.NEW_TEST_TRACKING_ENABLED) {
      return new TestTrackingArrayMode();
```

### ReturnNull
Return of `null`
in `util/src/com/intellij/rt/coverage/instrumentation/JSR45Util.java`
#### Snippet
```java

  public static FileMapData[] extractLineMapping(String debug, String className) {
    if (!isSmap(debug)) return null;
    final TIntObjectHashMap<List<LineMapData>> linesMap = new TIntObjectHashMap<List<LineMapData>>();
    final int fileSectionIdx = debug.indexOf(FILE_SECTION);
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/instructions/InstructionsUtil.java`
#### Snippet
```java
    protected LineInstructions[] getLines(ClassData classData) {
      final ClassInstructions classInstructions = projectData.getInstructions().get(classData.getName());
      if (classInstructions == null) return null;
      return classInstructions.getlines();
    }
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/CoverageTransformer.java`
#### Snippet
```java
                                         CoverageDataAccess dataAccess) {
    for (ClassSignatureFilter filter : ourFilters) {
      if (filter.shouldFilter(cr)) return null;
    }
    final Instrumenter instrumenter;
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/CoverageTransformer.java`
#### Snippet
```java
  @Override
  protected InclusionPattern getInclusionPattern() {
    return includePatterns.isEmpty() ? null : new InclusionPattern() {
      public boolean accept(String className) {
        return ClassNameUtil.matchesPatterns(className, includePatterns);
```

### ReturnNull
Return of `null`
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/TestDiscoveryListener.java`
#### Snippet
```java
    final String toString = test.toString();
    final int braceIdx = toString.indexOf("(");
    return braceIdx > 0 && toString.endsWith(")") ? toString.substring(braceIdx + 1, toString.length() - 1) : null;
  }

```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ClassData.java`
#### Snippet
```java
  @SuppressWarnings("unused")
  public Integer getStatus(String methodSignature) {
    if (myStatus == null) return null;
    Integer methodStatus = myStatus.get(methodSignature);
    if (methodStatus == null) {
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ClassData.java`
#### Snippet
```java

  public LineData getLineData(int line) {
    if (line < 0 || line >= myLinesArray.length) return null;
    return myLinesArray[line];
  }
```

### ReturnNull
Return of `null`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
      }
      ErrorReporter.reportError("Failed to lock with file lock: " + lock.myLock.getAbsolutePath());
      return null;
    }

```

### ReturnNull
Return of `null`
in `common/src/com/intellij/rt/coverage/util/CoverageIOUtil.java`
#### Snippet
```java
  private static String readString(DataInput stream) throws IOException {
    int length = stream.readInt();
    if (length == -1) return null;

    char[] chars = new char[length];
```

### ReturnNull
Return of `null`
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/OpenCloseFileTransformer.java`
#### Snippet
```java
      });
    } catch (ClassNotFoundException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
        return myClassData;
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    } catch (Exception e) {
      ErrorReporter.reportError("Error in class data loading: " + className, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    } catch (Exception e) {
      ErrorReporter.reportError("Error in class data access: " + className, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    } catch (Exception e) {
      ErrorReporter.reportError("Error in class data access: " + className, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java

  public JumpData[] getJumps() {
    if (myJumpsAndSwitches == null) return null;
    return getOrCreateJumpsAndSwitches().getJumps();
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java

  public SwitchData[] getSwitches() {
    if (myJumpsAndSwitches == null) return null;
    return getOrCreateJumpsAndSwitches().getSwitches();
  }
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/LineData.java`
#### Snippet
```java

  public BranchData getBranchData() {
    if (myJumpsAndSwitches == null) return null;
    int total = 0;
    int covered = 0;
```

### ReturnNull
Return of `null`
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
    } catch (Exception e) {
      ErrorReporter.reportError("Error in class data access: " + className, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
          final BigDecimal missed = new BigDecimal(counter.missed);
          final BigDecimal total = new BigDecimal(counter.covered + counter.missed);
          if (total.equals(BigDecimal.ZERO)) return null;
          return missed.divide(total, 6, RoundingMode.HALF_UP);
        }
```

### ReturnNull
Return of `null`
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
          final BigDecimal covered = new BigDecimal(counter.covered);
          final BigDecimal total = new BigDecimal(counter.covered + counter.missed);
          if (total.equals(BigDecimal.ZERO)) return null;
          return covered.divide(total, 6, RoundingMode.HALF_UP);
        }
```

### ReturnNull
Return of `null`
in `reporter/src/com/intellij/rt/coverage/verify/Verifier.java`
#### Snippet
```java
    });

    if (violations.isEmpty()) return null;
    return new RuleViolation(rule.id, new ArrayList<BoundViolation>(violations.values()));
  }
```

### ReturnNull
Return of `null`
in `reporter/src/com/intellij/rt/coverage/report/DirectorySourceCodeProvider.java`
#### Snippet
```java
      return FileUtils.readAll(file);
    } catch (IOException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/InstrumentedMethodsCollector.java`
#### Snippet
```java
    else if (decision == InstrumentedMethodsFilter.Decision.NO) {
      // no further visiting
      return null;
    }
    else {
```

### ReturnNull
Return of `null`
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/TestDiscoveryInstrumenter.java`
#### Snippet
```java
                                   final String[] exceptions) {
    final MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
    if (mv == null) return null;
    if (myMethodNames.length == 0) {
      return mv;
```

### ReturnNull
Return of `null`
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
        sharedSecrets = Class.forName("jdk.internal.misc.SharedSecrets");
      } catch (ClassNotFoundException e1) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/TraceFileProfiler.java`
#### Snippet
```java
public class TraceFileProfiler implements InternalProfiler {
  public String getDescription() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/JumpsAndSwitches.java`
#### Snippet
```java

  public JumpData getJumpData(int jump) {
    return myJumpsArray == null ? (myJumps == null ? null : myJumps.get(jump)) : myJumpsArray[jump];
  }

```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/data/JumpsAndSwitches.java`
#### Snippet
```java

  public SwitchData getSwitchData(int switchNumber) {
    return mySwitchesArray == null ? (mySwitches == null ? null : mySwitches.get(switchNumber)) : mySwitchesArray[switchNumber];
  }

```

### ReturnNull
Return of `null`
in `common/src/com/intellij/rt/coverage/util/ThreadLocalCachedValue.java`
#### Snippet
```java

  private static <T> T dereference(SoftReference<T> ref) {
    return ref == null ? null : ref.get();
  }
}
```

### ReturnNull
Return of `null`
in `benchmarks/jmh/com/intellij/rt/coverage/jmh/ApacheCollectionsTests.java`
#### Snippet
```java
      if (jar.contains("commons-collections4-4.4-tests")) return jar;
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
  protected LineData getOrCreateLineData(int line, String name, String desc) {
    if (line > myMaxLineNumber) myMaxLineNumber = line;
    if (isIgnoreSection() && !KotlinUtils.isKotlinClass(this)) return null;
    //create lines again if class was loaded again by another class loader; may be myLinesArray should be cleared
    if (myLines == null) myLines = new TIntObjectHashMap<LineData>();
```

### ReturnNull
Return of `null`
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumenter.java`
#### Snippet
```java
                                   final String[] exceptions) {
    final MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
    if (mv == null) return null;
    if (!shouldInstrumentMethod(access, name, desc, signature, exceptions)) return mv;
    myProcess = true;
```

### ReturnNull
Return of `null`
in `src/com/intellij/rt/coverage/util/LineMapper.java`
#### Snippet
```java
    final T[] oldLines = getLines(sourceClassData);
    if (linesMap == null) return oldLines;
    if (sourceClassData == targetClassData && oldLines == null) return null;
    try {
      final T[] sourceLines = getSourceLinesArray(linesMap, sourceClassData, targetClassData);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
      reader.close();
    }
    return result.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
      tokenizedArgs.add(arg);
    }
    return tokenizedArgs.toArray(new String[0]);
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/OpenCloseFileTransformer.java`
#### Snippet
```java
    List<Class<?>> classes = new LinkedList<Class<?>>();
    for (ClassTransformation t : myClassTransformations.values()) classes.add(t.myClass);
    return classes.toArray(new Class<?>[]{});
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/InstrumentedMethodsCollector.java`
#### Snippet
```java

  String[] instrumentedMethods() {
    return instrumentedMethods.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
  private static String[] split(String key) {
    String affected = System.getProperty(key);
    return affected == null ? new String[]{} : affected.split(";");
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/com/intellij/rt/coverage/data/JumpsAndSwitches.java`
#### Snippet
```java
    if (mySwitches.size() <= switchNumber) {
      for(int i = mySwitches.size(); i < switchNumber; i++) {
        mySwitches.add(new SwitchData(new int[0]));
      }
      if (mySwitches.size() == switchNumber) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/Instrumentator.java`
#### Snippet
```java
    checkLogLevel();

    synchronized (Instrumentator.class) {
      if (ourIsInitialized) {
        ErrorReporter.reportError("Coverage agent has been applied twice, ignore the second one.");
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
  public void addLineMaps(String className, FileMapData[] fileDatas) {
    if (myLinesMap == null) {
      synchronized (FileMapData.class) {
        if (myLinesMap == null) {
          myLinesMap = new ConcurrentHashMap<String, FileMapData[]>();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/com/intellij/rt/coverage/data/ProjectData.java`
#### Snippet
```java
    Map<String, ClassInstructions> instructions = myInstructions;
    if (instructions == null) {
      synchronized (this) {
        instructions = myInstructions;
        if (instructions == null) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawProjectInit.java`
#### Snippet
```java
  public static int[] getOrCreateHitsInternal(String className, int length) {
    if (ourProjectData == null) {
      synchronized (RawProjectData.class) {
        if (ourProjectData == null) {
          ourProjectData = new RawProjectData();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `defineClassMethodRef != null` is always `true`
in `test-discovery/src/com/intellij/rt/coverage/testDiscovery/instrumentation/TestDiscoveryInnerClassInstrumenter.java`
#### Snippet
```java
      if (defineClassMethodRef == null) {
        defineClassMethodRef = ClassLoader.class.getDeclaredMethod("defineClass", byte[].class, Integer.TYPE, Integer.TYPE);
        if (defineClassMethodRef != null) {
          defineClassMethodRef.setAccessible(true);
          myDefineClassMethodRef = defineClassMethodRef;
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `main()` tries to override a static method of a superclass
in `junit4-test-discovery-launcher/src/org/junit/runner/JUnitLauncher.java`
#### Snippet
```java
public class JUnitLauncher extends JUnitCore {

  public static void main(String... args) {
    final JUnitLauncher core = new JUnitLauncher();
    final TestDiscoveryJUnitRunListener listener = new TestDiscoveryJUnitRunListener();
```

