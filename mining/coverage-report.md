# coverage-report 
 
# Bad smells
I found 42 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 8 | false |
| ReturnNull | 6 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| SizeReplaceableByIsEmpty | 3 | true |
| MissortedModifiers | 3 | false |
| SystemOutErr | 2 | false |
| UnnecessaryModifier | 2 | true |
| NestedAssignment | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| DoubleBraceInitialization | 2 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| UNUSED_IMPORT | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| ConstantValue | 1 | false |
| RedundantSuppression | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
      configuration.setSetting(Configuration.TEMPLATE_UPDATE_DELAY_KEY, "0");
    } catch (TemplateException e) {
      System.err.println("Failed to set configuration properties: " + e.getMessage());
      e.printStackTrace();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `report-builder/src/jetbrains/coverage/report/impl/html/fs/ZipFileSystem.java`
#### Snippet
```java
    String rel = IOUtil.makeRelative(myBase, path);
    if (!myFiles.add(rel)) {
      System.err.println(getClass().getCanonicalName() + ": Attepting to write to " + rel + " second time. Fake output stream will be returned to avoid error");
      return new OutputStream() {
        @Override
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `report-builder/src/jetbrains/coverage/report/impl/html/SortOption.java`
#### Snippet
```java
  }

  private static interface Func<T> {
    CoverageStatistics compute(T t);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `report-builder/src/jetbrains/coverage/report/impl/html/SortOption.java`
#### Snippet
```java
  }

  private static interface Selector {
    StatEntry compute(@NotNull CoverageStatistics stat);
  }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `IOUtil` has only 'static' members, and lacks a 'private' constructor
in `report-builder/src/jetbrains/coverage/report/impl/IOUtil.java`
#### Snippet
```java
 * @author Pavel.Sher
 */
public class IOUtil {
  /**
   * Creates directory if it does not exist. Throws runtime exception if directory creation was not successful.
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtil` has only 'static' members, and lacks a 'private' constructor
in `report-builder/src/jetbrains/coverage/report/impl/StringUtil.java`
#### Snippet
```java
 * @author Pavel.Sher
 */
public class StringUtil {
  public static final String EMPTY = "";

```

### UtilityClassWithoutPrivateConstructor
Class `ReportBuilderFactory` has only 'static' members, and lacks a 'private' constructor
in `report-builder/src/jetbrains/coverage/report/ReportBuilderFactory.java`
#### Snippet
```java
 * Factory for report builder classes
 */
public class ReportBuilderFactory {
  /**
   * Creates new HTML report builder
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getStatus` may produce `NullPointerException`
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageClassInfo.java`
#### Snippet
```java
    for (String m: myClassData.getMethodSigs()) {
      total++;
      Integer status = myClassData.getStatus(m);
      if (isCovered(status)) {
        covered++;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.coverage.report.impl` is unnecessary, and can be replaced with an import
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageData.java`
#### Snippet
```java

    int lineNum = 0;
    for (CharSequence line : jetbrains.coverage.report.impl.StringUtil.getLines(source)) {
      lineNum++;

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.coverage.report.impl.html.fs.*;`
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateProcessorBase.java`
#### Snippet
```java
import jetbrains.coverage.report.ReportGenerationFailedException;
import jetbrains.coverage.report.impl.IOUtil;
import jetbrains.coverage.report.impl.html.fs.*;
import org.jetbrains.annotations.NotNull;

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `report-builder/src/jetbrains/coverage/report/impl/html/MapToSet.java`
#### Snippet
```java
    Collection<V> vs = myMap.get(k);
    if (vs == null) {
      myMap.put(k, vs = new HashSet<V>());
    }

```

### NestedAssignment
Result of assignment expression used
in `report-builder/src/jetbrains/coverage/report/impl/IOUtil.java`
#### Snippet
```java
    int count;
    int total = 0;
    while ((count = inputStream.read(buffer)) > 0) {
      outputStream.write(buffer, 0, count);
      total += count;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
    } catch (TemplateException e) {
      System.err.println("Failed to set configuration properties: " + e.getMessage());
      e.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageData.java`
#### Snippet
```java
      return mySourceCodeProvider.getSourceCode(ci.getFQName());
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `JavaClassInfo()` of an abstract class should not be declared 'public'
in `report-builder/src/jetbrains/coverage/report/JavaClassInfo.java`
#### Snippet
```java
   * @param fqClassName FQ class name
   */
  public JavaClassInfo(@NotNull String fqClassName) {
    myFQClassName = fqClassName;
    int lastDot = fqClassName.lastIndexOf(".");
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageClassInfo.java`
#### Snippet
```java
        return true;
      case LineCoverage.FULL:
        return true;
    }
    return false;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java

    public StatEntry getStatementStats() {
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java

    public StatEntry getLineStats() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java

    public StatEntry getMethodStats() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java
  private static final CoverageStatistics NULL_STATS = new CoverageStatistics() {
    public StatEntry getClassStats() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java

    public StatEntry getBlockStats() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `report-builder/src/jetbrains/coverage/report/impl/StringUtil.java`
#### Snippet
```java
      return text.charAt(idx);
    }
    return null;
  }
}
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`myName.length() == 0` can be replaced with 'myName.isEmpty()'
in `report-builder/src/jetbrains/coverage/report/impl/html/ModuleInfo.java`
#### Snippet
```java

  public boolean isEmpty() {
    return myName == null || myName.length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`myLines.size() > 0` can be replaced with '!myLines.isEmpty()'
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java

      public void codeWriteFinished() {
        if (myLines.size() > 0 || myCaption != null) {
          data.add(new FileDataBean(myCaption, myLines));
        }
```

### SizeReplaceableByIsEmpty
`className.length() == 0` can be replaced with 'className.isEmpty()'
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageData.java`
#### Snippet
```java
    for (Map.Entry<String, Collection<String>> classEntry: classAndRelatedClassesMap.entrySet()) {
      String className = classEntry.getKey();
      if (className == null || className.length() == 0) continue;
      if (className.startsWith("com.intellij.rt.coverage")) continue; // ignore coverage implementation classes
      if (isInnerClass(className)) continue;
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `report-builder/src/jetbrains/coverage/report/ReportBuilderFactory.java`
#### Snippet
```java
   */
  public static HTMLReportBuilder createHTMLReportBuilderForDotNet() {
    return new HTMLReportBuilderImpl() {{setResourceBundleName("dotNetCoverage");}};
  }

```

### DoubleBraceInitialization
Double brace initialization
in `report-builder/src/jetbrains/coverage/report/ReportBuilderFactory.java`
#### Snippet
```java
   */
  public static HTMLReportBuilder createHTMLReportBuilderForKover() {
    return new HTMLReportBuilderImpl() {{setResourceBundleName("koverCoverage");}};
  }

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `report-builder/src/jetbrains/coverage/report/impl/StringUtil.java`
#### Snippet
```java
          addLine = true;
          Character next = charAtOrNull(i+1, text);
          if (next != null && next == '\n') i++;
          break;
        case '\n':
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `report-builder/src/jetbrains/coverage/report/DiffEntry.java`
#### Snippet
```java

  private int value(int value) {
    return value < 0 ? 0 : value;
  }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `report-builder/src/jetbrains/coverage/report/impl/html/BaseGenerator.java`
#### Snippet
```java

  @NotNull
  protected <T> List<T> filterCovered(@NotNull Collection<T> collection, @NotNull Converter<T> conv) {
    List<T> list = new ArrayList<T>(collection.size());
    for (T t : collection) {
```

### BoundedWildcard
Can generalize to `? super T`
in `report-builder/src/jetbrains/coverage/report/impl/html/BaseGenerator.java`
#### Snippet
```java

  @NotNull
  protected <T> List<T> filterCovered(@NotNull Collection<T> collection, @NotNull Converter<T> conv) {
    List<T> list = new ArrayList<T>(collection.size());
    for (T t : collection) {
```

### BoundedWildcard
Can generalize to `? super ModuleInfo`
in `report-builder/src/jetbrains/coverage/report/impl/html/HTMLReportBuilderImpl.java`
#### Snippet
```java
                                       @NotNull final TemplateProcessorFactory fac,
                                       @NotNull final LocalGeneratorPaths paths,
                                       @NotNull MapToSet<ModuleInfo, ClassInfo> moduleToClassesMap,
                                       @NotNull ModuleInfo info) throws IOException {
    MapToSet<String, ClassInfo> namespaceToClassMap = groupByNamespace(moduleToClassesMap.getValues(info));
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `report-builder/src/jetbrains/coverage/report/impl/html/HTMLReportBuilderImpl.java`
#### Snippet
```java
  }

  private MapToSet<String, ClassInfo> groupByNamespace(final Collection<ClassInfo> coverageData) {
    MapToSet<String, ClassInfo> set = new MapToSet<String, ClassInfo>();
    for (ClassInfo cd: coverageData) {
```

### BoundedWildcard
Can generalize to `? extends ClassInfo`
in `report-builder/src/jetbrains/coverage/report/impl/html/HTMLReportBuilderImpl.java`
#### Snippet
```java
  }

  private MapToSet<ModuleInfo, ClassInfo> groupByModules(final Collection<ClassInfo> coverageData) {
    MapToSet<ModuleInfo, ClassInfo> set = new MapToSet<ModuleInfo, ClassInfo>();
    for (ClassInfo info : coverageData) {
```

### BoundedWildcard
Can generalize to `? super ClassDataBean`
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
  }

  private void collectInnerClasses(final ClassInfo classInfo, final List<ClassDataBean> result) {
    final Collection<ClassInfo> innerClasses = classInfo.getInnerClasses();
    if (innerClasses != null) {
```

### BoundedWildcard
Can generalize to `? extends ClassData`
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageClassInfo.java`
#### Snippet
```java
                               @NotNull final String className,
                               @Nullable final ClassData classData,
                               @NotNull final Collection<ClassData> innerClasses) {
    super(className);
    myProjectData = projectData;
```

### BoundedWildcard
Can generalize to `? super T`
in `report-builder/src/jetbrains/coverage/report/impl/html/SortOption.java`
#### Snippet
```java
  }

  private <T> Comparator<T> comparator(@NotNull final Func<T> fun) {
    return new Comparator<T>() {
      public int compare(T o1, T o2) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `report-builder/src/jetbrains/coverage/report/JavaClassInfo.java`
#### Snippet
```java
  private String myFQClassName;

  private final static String EMPTY = "";

  /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
  }

  public final static class LineDataBean {
    private int myLineNum;
    private CharSequence mySourceCode;
```

### MissortedModifiers
Missorted modifiers `final static`
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
  }

  public final static class FileDataBean {
    private final String myCaption;
    private final Collection<LineDataBean> myLines;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `n2 != null` is always `true` when reached
in `report-builder/src/jetbrains/coverage/report/impl/html/SortOption.java`
#### Snippet
```java
        if (n1 == null && n2 == null) return 0;
        if (n1 != null && n2 == null) return 1;
        if (n1 == null && n2 != null) return -1;

        int result = n1.compareTo(n2);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageData.java`
#### Snippet
```java
  private static Map<String, Collection<String>> collectClasses(final ProjectData projectData) throws IOException {
    Set<String> allClasses = new HashSet<String>();
    //noinspection unchecked
    allClasses.addAll(projectData.getClasses().keySet());

```

