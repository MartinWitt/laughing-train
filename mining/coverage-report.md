# coverage-report 
 
# Bad smells
I found 30 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 17 | false |
| UnnecessaryModifier | 2 | true |
| Deprecation | 2 | false |
| NullableProblems | 2 | false |
| DuplicateBranchesInSwitch | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| DataFlowIssue | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| JavadocDeclaration | 1 | false |
| ConstantValue | 1 | false |
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

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=Deprecation]
### Deprecation
'Configuration()' is deprecated
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java

  public TemplateFactory() throws IOException {
    Configuration configuration = new Configuration();
    configuration.setTemplateLoader(new ClassTemplateLoader(getClass(), "/htmlTemplates"));

```

### Deprecation
'BeansWrapper()' is deprecated
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateProcessorBase.java`
#### Snippet
```java
  public void renderTemplate(Map<String, Object> params, @NotNull GeneratorPaths paths) throws IOException {
    final HashMap map = new HashMap();
    map.put("resources", new ResourceBundleModel(getResourceBundle(), new BeansWrapper()));
    map.put("generateDate", new Date());
    map.putAll(params);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `report-builder/src/jetbrains/coverage/report/idea/IDEACoverageData.java`
#### Snippet
```java
    Set<String> allClasses = new HashSet<String>();
    //noinspection unchecked
    allClasses.addAll(projectData.getClasses().keySet());

    Map<String, Collection<String>> classMap = new HashMap<String, Collection<String>>();
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `report-builder/src/jetbrains/coverage/report/impl/IOUtil.java`
#### Snippet
```java
   * @param outputStream destination stream
   * @return bytes copied
   * @throws IOException
   */
  public static int copyStreamContent(InputStream inputStream, OutputStream outputStream) throws IOException {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `report-builder/src/jetbrains/coverage/report/impl/html/fs/ZipFileSystem.java`
#### Snippet
```java

      @Override
      public void write(byte[] b) throws IOException {
        myZos.write(b);
      }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `report-builder/src/jetbrains/coverage/report/impl/html/fs/ZipFileSystem.java`
#### Snippet
```java

      @Override
      public void write(byte[] b, int off, int len) throws IOException {
        myZos.write(b, off, len);
      }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myStats` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/StatisticsCalculatorImpl.java`
#### Snippet
```java
 */
public class StatisticsCalculatorImpl implements StatisticsCalculator {
  private Map<String, CoverageStatisticsBean> myStats = new HashMap<String, CoverageStatisticsBean>();
  private StatisticsCalculatorImpl myPrevStatsHolder;

```

### FieldMayBeFinal
Field `mySourceCode` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
  public final static class LineDataBean {
    private int myLineNum;
    private CharSequence mySourceCode;
    private CoverageStatus myCoverageStatus;

```

### FieldMayBeFinal
Field `myCoverageStatus` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
    private int myLineNum;
    private CharSequence mySourceCode;
    private CoverageStatus myCoverageStatus;

    public LineDataBean(final int lineNum, final CharSequence sourceCode, @Nullable final CoverageStatus coverageStatus) {
```

### FieldMayBeFinal
Field `myLineNum` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java

  public final static class LineDataBean {
    private int myLineNum;
    private CharSequence mySourceCode;
    private CoverageStatus myCoverageStatus;
```

### FieldMayBeFinal
Field `myClassInfo` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/ClassDataBean.java`
#### Snippet
```java
 */
public class ClassDataBean {
  private ClassInfo myClassInfo;
  @Nullable
  private final CoverageSourceData mySourceData;
```

### FieldMayBeFinal
Field `myCoverage` may be 'final'
in `report-builder/src/jetbrains/coverage/report/ClassBlock.java`
#### Snippet
```java
 */
public class ClassBlock {
  private CoverageStatus myCoverage;

  public ClassBlock(@Nullable CoverageStatus coverage) {
```

### FieldMayBeFinal
Field `myPrevValue` may be 'final'
in `report-builder/src/jetbrains/coverage/report/StatEntry.java`
#### Snippet
```java
 */
public class StatEntry extends Entry {
  private Entry myPrevValue;

  public StatEntry(int total, int covered) {
```

### FieldMayBeFinal
Field `myEmpty` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
  private Template myNamespaceIndexTemplate;
  private Template myClassTemplate;
  private Template myEmpty;

  public TemplateFactory() throws IOException {
```

### FieldMayBeFinal
Field `myNamespaceIndexTemplate` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
  private Template myNamespacesTeamplate;
  private Template myModulesTemplate;
  private Template myNamespaceIndexTemplate;
  private Template myClassTemplate;
  private Template myEmpty;
```

### FieldMayBeFinal
Field `myClassTemplate` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
  private Template myModulesTemplate;
  private Template myNamespaceIndexTemplate;
  private Template myClassTemplate;
  private Template myEmpty;

```

### FieldMayBeFinal
Field `myNamespacesTeamplate` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java
public class TemplateFactory {

  private Template myNamespacesTeamplate;
  private Template myModulesTemplate;
  private Template myNamespaceIndexTemplate;
```

### FieldMayBeFinal
Field `myModulesTemplate` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/html/TemplateFactory.java`
#### Snippet
```java

  private Template myNamespacesTeamplate;
  private Template myModulesTemplate;
  private Template myNamespaceIndexTemplate;
  private Template myClassTemplate;
```

### FieldMayBeFinal
Field `myNamespace` may be 'final'
in `report-builder/src/jetbrains/coverage/report/JavaClassInfo.java`
#### Snippet
```java
public abstract class JavaClassInfo implements ClassInfo {
  private CharSequence myName;
  private CharSequence myNamespace;
  private String myFQClassName;

```

### FieldMayBeFinal
Field `myFQClassName` may be 'final'
in `report-builder/src/jetbrains/coverage/report/JavaClassInfo.java`
#### Snippet
```java
  private CharSequence myName;
  private CharSequence myNamespace;
  private String myFQClassName;

  private final static String EMPTY = "";
```

### FieldMayBeFinal
Field `myName` may be 'final'
in `report-builder/src/jetbrains/coverage/report/JavaClassInfo.java`
#### Snippet
```java
 */
public abstract class JavaClassInfo implements ClassInfo {
  private CharSequence myName;
  private CharSequence myNamespace;
  private String myFQClassName;
```

### FieldMayBeFinal
Field `myValues` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java
 */
public class CoverageStatisticsBean implements CoverageStatistics {
  private Map<String, Counter> myValues = new TreeMap<String, Counter>();
  private CoverageStatistics myPrevStats;

```

### FieldMayBeFinal
Field `myPrevStats` may be 'final'
in `report-builder/src/jetbrains/coverage/report/impl/CoverageStatisticsBean.java`
#### Snippet
```java
public class CoverageStatisticsBean implements CoverageStatistics {
  private Map<String, Counter> myValues = new TreeMap<String, Counter>();
  private CoverageStatistics myPrevStats;

  private static final String TOTAL_CLASSES = "classes-total";
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

