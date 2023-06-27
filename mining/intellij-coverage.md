# intellij-coverage 
 
# Bad smells
I found 25 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 9 | false |
| CommentedOutCode | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| DuplicateExpressions | 2 | false |
| Deprecation | 2 | false |
| StringEquality | 1 | false |
| DuplicatedCode | 1 | false |
| DataFlowIssue | 1 | false |
| UNUSED_IMPORT | 1 | false |
| FieldMayBeFinal | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `instrumentation/src/com/intellij/rt/coverage/instrumentation/filters/classFilter/KotlinValueClassFilter.java`
#### Snippet
```java
      return new MethodVisitor(Opcodes.API_VERSION, mv) {
        @Override
        public void visitLineNumber(int line, Label start) {
          super.visitLineNumber(line, start);
          if (myGetterLine == line) return;
          if (myGetterLine == -1) {
            myGetterLine = line;
          } else {
            myGetterLine = -2;
          }
        }
      };
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[id=Deprecation]
### Deprecation
'newInstance()' is deprecated
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java
        throw new RuntimeException("Property \"" + TEST_DISCOVERY_DATA_LISTENER_PROP + "\" should be specified");
      }
      myDataListener = (TestDiscoveryDataListener) Class.forName(testDiscoveryDataListener).newInstance();
      myNameEnumerator = myDataListener.getNameEnumerator();
    } catch (InstantiationException e) {
```

### Deprecation
Overrides deprecated method in 'org.junit.internal.RealSystem'
in `junit4-test-discovery-launcher/src/org/junit/runner/JUnitLauncher.java`
#### Snippet
```java
      result = core.runMain(new RealSystem() {
        @Override
        public void exit(int code) {
          retCode[0] = code;
        }
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `reportFileExists` may be 'final'
in `offline-runtime/src/com/intellij/rt/coverage/offline/RawHitsReport.java`
#### Snippet
```java
  private static final int MAGIC = 284996684;

  private static boolean reportFileExists = "true".equals(System.getProperty("kover.offline.report.exists", "false"));

  public static void dump(File file, RawProjectData data) {
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
Commented out code (2 lines)
in `test-discovery/src/com/intellij/rt/coverage/data/TestDiscoveryProjectData.java`
#### Snippet
```java

  private synchronized boolean[] traceLines(String className, boolean[] methodFlags, String[] methodNames) {
    //System.out.println("Registering " + className);
    //assert methodFlags.length == methodNames.length;
    int classId = myNameEnumerator.enumerate(className);
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `test-discovery/src/com/intellij/rt/coverage/data/SocketTestDiscoveryProtocolDataListener.java`
#### Snippet
```java

  private static class VisitedMethods {
    private final int classId;
    private final TIntArrayList methodIds = new TIntArrayList(1);

```

## RuleId[id=IgnoreResultOfCall]
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

