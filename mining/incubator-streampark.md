# incubator-streampark 
 
# Bad smells
I found 304 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 50 | false |
| CallToStringConcatCanBeReplacedByOperator | 31 | false |
| RedundantImplements | 26 | false |
| RedundantFieldInitialization | 20 | false |
| DataFlowIssue | 20 | false |
| IndexOfReplaceableByContains | 18 | false |
| DynamicRegexReplaceableByCompiledPattern | 11 | false |
| BoundedWildcard | 10 | false |
| UtilityClassWithoutPrivateConstructor | 10 | true |
| AssignmentToMethodParameter | 10 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| IgnoreResultOfCall | 8 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| UseOfPropertiesAsHashtable | 7 | false |
| ZeroLengthArrayInitialization | 5 | false |
| UnusedAssignment | 5 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| DefaultAnnotationParam | 4 | false |
| EmptyMethod | 3 | false |
| NullArgumentToVariableArgMethod | 3 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| TrivialStringConcatenation | 2 | false |
| MissortedModifiers | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| NestedAssignment | 2 | false |
| SynchronizeOnThis | 2 | false |
| ConstantValue | 2 | false |
| RedundantSuppression | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| RegExpRedundantEscape | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| CodeBlock2Expr | 1 | true |
| Lombok | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NonFinalFieldOfException | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| FieldMayBeStatic | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| RedundantComparatorComparing | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ImplicitArrayToString | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpringContextUtils.applicationContext` from instance context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/SpringContextUtils.java`
#### Snippet
```java
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringContextUtils.applicationContext = applicationContext;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `completeFstTree` from instance context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
  @PostConstruct
  public void initialize() {
    completeFstTree = new SqlCompleteFstTree();
  }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java

  private static final Pattern PLACEHOLDER_PATTERN =
      Pattern.compile("\\$\\{([A-Za-z])+([A-Za-z0-9._-])+\\}");

  private static final String PLACEHOLDER_START = "${";
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `beanMap.keySet()` may be replaced with 'entrySet()' iteration
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    if (bean != null) {
      BeanMap beanMap = BeanMap.create(bean);
      for (Object key : beanMap.keySet()) {
        map.put(key + "", beanMap.get(key));
      }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
              return;
            case LAEBL_STATE_COMMITTED:
              return;
            case RESULT_LABEL_PREPARE:
              continue;
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `DorisSinkWriter` on 'this' is unnecessary in this context
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule.schedule(
            () -> {
              synchronized (DorisSinkWriter.this) {
                if (!closed) {
                  try {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sp.length() == 0` can be replaced with 'sp.isEmpty()'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java

  public static String parse(String sp) throws RuntimeException {
    if (sp == null || sp.length() == 0) {
      throw new RuntimeException("Delimiter can't be empty");
    }
```

### SizeReplaceableByIsEmpty
`maps.size() > 0` can be replaced with '!maps.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
      throws InstantiationException, IllegalAccessException {
    List<T> list = new ArrayList<>();
    if (maps != null && maps.size() > 0) {
      Map<String, Object> map;
      T bean;
```

### SizeReplaceableByIsEmpty
`objList.size() > 0` can be replaced with '!objList.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
  public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
    List<Map<String, Object>> list = new ArrayList<>();
    if (objList != null && objList.size() > 0) {
      Map<String, Object> map = null;
      T bean = null;
```

### SizeReplaceableByIsEmpty
`sql.length() > 0` can be replaced with '!sql.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
  @Override
  public List<String> getComplete(String sql) {
    if (sql.length() > 0 && BLACK_SET.contains(sql.charAt(sql.length() - 1))) {
      return new ArrayList<>();
    }
```

### SizeReplaceableByIsEmpty
`now.getNext().size() == 0` can be replaced with 'now.getNext().isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
     */
    private void getDFSWord(List<WordWithFrequency> returnSource, String buffer, TreeNode now) {
      if (now.getNext().size() == 0 || now.isStop()) {
        returnSource.add(new WordWithFrequency(buffer + now.getStep(), now.getCount()));
      } else {
```

### SizeReplaceableByIsEmpty
`externalLink.size() > 0` can be replaced with '!externalLink.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ExternalLinkServiceImpl.java`
#### Snippet
```java
    Utils.notNull(app, "Application doesn't exist");
    List<ExternalLink> externalLink = this.list();
    if (externalLink != null && externalLink.size() > 0) {
      // Render the placeholder
      externalLink.forEach(link -> this.renderLinkUrl(link, app));
```

### SizeReplaceableByIsEmpty
`contactList.size() > 0` can be replaced with '!contactList.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/DingTalkAlertNotifyServiceImpl.java`
#### Snippet
```java
      }
      String title = alertTemplate.getTitle();
      if (contactList.size() > 0) {
        StringJoiner joiner = new StringJoiner(",@", title + " @", "");
        contactList.forEach(joiner::add);
```

### SizeReplaceableByIsEmpty
`pathPart.length() == 0` can be replaced with 'pathPart.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
      error =
          "The path to store the checkpoint data in is null. Please specify a directory path for the checkpoint data.";
    } else if (pathPart.length() == 0 || pathPart.equals("/")) {
      error = "Cannot use the root directory for checkpoints.";
    }
```

### SizeReplaceableByIsEmpty
`pathPart.length() == 0` can be replaced with 'pathPart.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                + savepointPath
                + " path part to store the checkpoint data in is null. Please specify a directory path for the checkpoint data.";
      } else if (pathPart.length() == 0 || "/".equals(pathPart)) {
        error =
            "This state.savepoints.dir value "
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `tp1.f0 & tp2.f0`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertServiceImpl.java`
#### Snippet
```java
                new Tuple2<>(true, null),
                (tp1, tp2) -> {
                  boolean alertResult = tp1.f0 & tp2.f0;
                  if (tp1.f1 == null && tp2.f1 == null) {
                    return new Tuple2<>(tp1.f0 & tp2.f0, null);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `tp1.f0 & tp2.f0`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertServiceImpl.java`
#### Snippet
```java
                  boolean alertResult = tp1.f0 & tp2.f0;
                  if (tp1.f1 == null && tp2.f1 == null) {
                    return new Tuple2<>(tp1.f0 & tp2.f0, null);
                  }
                  if (tp1.f1 != null && tp2.f1 != null) {
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
    int fromIndex = (request.getPageNum() - 1) * request.getPageSize();
    int toIndex = request.getPageNum() * request.getPageSize();
    toIndex = toIndex > applications.size() ? applications.size() : toIndex;
    page.setRecords(applications.subList(fromIndex, toIndex));
    return page;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
      properties.forEach((k, v) -> put.setHeader(k.toString(), v.toString()));
      if (properties.containsKey("columns")) {
        put.setHeader("timeout", dorisConfig.timeout() + "");
      }
      put.setHeader(HttpHeaders.EXPECT, "100-continue");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
      BeanMap beanMap = BeanMap.create(bean);
      for (Object key : beanMap.keySet()) {
        map.put(key + "", beanMap.get(key));
      }
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends DorisSinkBufferEntry`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
  }

  public void setBufferedBatchMap(Map<String, DorisSinkBufferEntry> newBufferMap) {
    if (Semantic.EXACTLY_ONCE.equals(semantic)) {
      bufferMap.clear();
```

### BoundedWildcard
Can generalize to `? extends VueRouter`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/VueRouterUtils.java`
#### Snippet
```java
   * @return ArrayList<VueRouter < T>>
   */
  public static <T> ArrayList<VueRouter<T>> buildVueRouter(List<VueRouter<T>> routes) {
    if (routes == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends RouterTree`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/VueRouterUtils.java`
#### Snippet
```java
   * @return <T> Tree<T>
   */
  public static <T> RouterTree<T> buildRouterTree(List<RouterTree<T>> nodes) {
    if (nodes == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @throws IllegalAccessException
   */
  public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps, Class<T> clazz)
      throws InstantiationException, IllegalAccessException {
    List<T> list = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @throws IllegalAccessException
   */
  public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps, Class<T> clazz)
      throws InstantiationException, IllegalAccessException {
    List<T> list = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super BuildState`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
      String logPath,
      Project project,
      Consumer<BuildState> stateUpdateConsumer,
      Consumer<Logger> notifyReleaseConsumer) {
    super(logPath, true);
```

### BoundedWildcard
Can generalize to `? super Logger`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
      Project project,
      Consumer<BuildState> stateUpdateConsumer,
      Consumer<Logger> notifyReleaseConsumer) {
    super(logPath, true);
    this.project = project;
```

### BoundedWildcard
Can generalize to `? super File`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
  }

  private void findTarOrJar(List<File> list, File path) {
    for (File file : Objects.requireNonNull(path.listFiles())) {
      // navigate to the target directory:
```

### BoundedWildcard
Can generalize to `? extends ApplicationConfig`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
  }

  private void fillEffectiveField(Long id, List<ApplicationConfig> configList) {
    ApplicationConfig effective = getEffective(id);

```

### BoundedWildcard
Can generalize to `? super Map`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
  }

  private void eachFile(File file, List<Map<String, Object>> list, Boolean isRoot) {
    if (file != null && file.exists() && file.listFiles() != null) {
      if (isRoot) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CompatibleKubernetesWatcher` has no concrete subclass
in `streampark-flink/streampark-flink-kubernetes/src/main/java/org/apache/flink/kubernetes/kubeclient/resources/CompatibleKubernetesWatcher.java`
#### Snippet
```java

/** Compatible AbstractKubernetesWatcher for fabric8. */
public abstract class CompatibleKubernetesWatcher<
        T extends HasMetadata, K extends KubernetesResource<T>>
    extends AbstractKubernetesWatcher<T, K> {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private @Nullable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/utils/YarnQueueLabelExpression.java`
#### Snippet
```java

  private final String queue;
  private @Nullable final String labelExpression;

  private YarnQueueLabelExpression(String queue, String labelExpression) {
```

### MissortedModifiers
Missorted modifiers `public @Nonnull`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/utils/YarnQueueLabelExpression.java`
#### Snippet
```java
  }

  public @Nonnull String getQueue() {
    return queue;
  }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/StreamParkConsoleBootstrap.java`
#### Snippet
```java
                    log.info("application shutdown now, pid: " + CommonUtils.getPid());
                    File pidFile = new File(pid);
                    pidFile.delete();
                  }));
    }
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
          File tmpFile = new File(fullFilePath);
          if (!tmpFile.exists()) {
            tmpFile.mkdir();
          }
        }
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
        File tmpFile = new File(fullFilePath);
        if (!tmpFile.exists()) {
          tmpFile.mkdir();
        }
      }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        File deployPath = project.getDistHome();
        if (!deployPath.exists()) {
          deployPath.mkdirs();
        }
        // xzvf jar
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        File targetDir = new File(distHome, moduleName);
        if (!targetDir.exists()) {
          targetDir.mkdirs();
        }
        File targetJar = new File(targetDir, app.getName());
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        }
        File targetJar = new File(targetDir, app.getName());
        app.renameTo(targetJar);
      }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    File sourcePath = new File(appSource);
    if (!sourcePath.exists()) {
      sourcePath.mkdirs();
    }
    if (sourcePath.isFile()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    // delete when exists
    if (saveFile.exists()) {
      saveFile.delete();
    }
    // save file to temp dir
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        paramType = "query",
        dataTypeClass = String.class,
        defaultValue = ""),
    @ApiImplicitParam(
        name = "allowNonRestored",
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        paramType = "query",
        dataTypeClass = String.class,
        defaultValue = ""),
    @ApiImplicitParam(
        name = "args",
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        name = "args",
        value = "commit parameters after copying",
        required = false,
        paramType = "query",
        dataTypeClass = String.class,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        paramType = "query",
        dataTypeClass = String.class,
        defaultValue = "")
  })
  @PostMapping(value = "copy", consumes = "application/x-www-form-urlencoded")
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkEnvServiceImpl.java`
#### Snippet
```java
  @Override
  public void update(FlinkEnv version) throws IOException {
    FlinkEnv flinkEnv = super.getById(version.getId());
    ApiAlertException.throwIfNull(
        flinkEnv,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SettingServiceImpl.java`
#### Snippet
```java
  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    List<Setting> settingList = super.list();
    settingList.forEach(x -> SETTINGS.put(x.getSettingKey(), x));
  }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`cpThreshold = cpThreshold - 1` could be simplified to 'cpThreshold -= 1'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java

    if (CheckPointType.CHECKPOINT.equals(CheckPointType.of(entity.getType()))) {
      cpThreshold = cpThreshold - 1;
    }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

  public String reGenerateLabel() {
    return label = createLabel();
  }

```

### NestedAssignment
Result of assignment expression used
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
              BufferedOutputStream bufOutput = new BufferedOutputStream(outputStream)) {
            int b = -1;
            while ((b = archiveInput.read()) != -1) {
              bufOutput.write(b);
            }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            })
        .whenComplete(
            (t, e) -> {
              startFutureMap.remove(application.getId());
            });
```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `streampark-storage/src/main/java/org/apache/streampark/storage/oss/OssConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OssConfig extends StorageServiceConfig {
  private String accessKeyId;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `batchSize` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
  private ArrayList<byte[]> buffer = new ArrayList<>();
  private int batchCount = 0;
  private long batchSize = 0;
  private String label;
  private String database;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
  }

  private ArrayList<byte[]> buffer = new ArrayList<>();
  private int batchCount = 0;
  private long batchSize = 0;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `label` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
  private int batchCount = 0;
  private long batchSize = 0;
  private String label;
  private String database;
  private String table;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `batchCount` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

  private ArrayList<byte[]> buffer = new ArrayList<>();
  private int batchCount = 0;
  private long batchSize = 0;
  private String label;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

  private ScheduledExecutorService schedule;
  private ScheduledFuture<?> scheduledFuture;

  private transient Counter totalFlushBytes;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `schedule` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
  private final DorisStreamLoader streamLoader;

  private ScheduledExecutorService schedule;
  private ScheduledFuture<?> scheduledFuture;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `effectiveService` is accessed in both synchronized and unsynchronized contexts
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
  @Autowired private ResourceLoader resourceLoader;

  @Autowired private EffectiveService effectiveService;

  @Override
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
        NamingEnumeration attrs = result.getAttributes().getAll();
        while (attrs.hasMore()) {
          searchEnv.put(Context.SECURITY_PRINCIPAL, result.getNameInNamespace());
          searchEnv.put(Context.SECURITY_CREDENTIALS, userPwd);
          try {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
        while (attrs.hasMore()) {
          searchEnv.put(Context.SECURITY_PRINCIPAL, result.getNameInNamespace());
          searchEnv.put(Context.SECURITY_CREDENTIALS, userPwd);
          try {
            new InitialDirContext(searchEnv);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
  Properties getManagerLdapEnv() {
    Properties env = new Properties();
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
    Properties env = new Properties();
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
    env.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
    env.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
    env.put(Context.PROVIDER_URL, ldapUrls);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
    env.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
    env.put(Context.PROVIDER_URL, ldapUrls);
    return env;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
    env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
    env.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
    env.put(Context.PROVIDER_URL, ldapUrls);
    return env;
  }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
          + " org.apache.streampark.console.base.domain.RestResponse"
          + " org.apache.streampark.console.*.controller.*.*(..))")
  public void apiAccess() {}

  @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
```

### EmptyMethod
The method is empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java

  @Pointcut("@annotation(org.apache.streampark.console.core.annotation.AppUpdated)")
  public void appUpdated() {}

  @Around("appUpdated()")
```

### EmptyMethod
All implementations of this method are empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
  protected abstract void processException(Throwable t);

  protected abstract void doFinally();
}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-jdbc/src/main/scala/org/apache/streampark/flink/connector/jdbc/source/JdbcJavaSource.java`
#### Snippet
```java
    private final StreamingContext context;
    private Properties jdbc;
    private String alias = null;

    public JdbcJavaSource(StreamingContext context) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
  private ArrayList<byte[]> buffer = new ArrayList<>();
  private int batchCount = 0;
  private long batchSize = 0;
  private String label;
  private String database;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

  private ArrayList<byte[]> buffer = new ArrayList<>();
  private int batchCount = 0;
  private long batchSize = 0;
  private String label;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
  private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
  private final Long timeout = 3000L;
  private volatile boolean closed = false;
  private volatile boolean flushThreadAlive = false;
  private volatile Throwable flushException;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
  private final Long timeout = 3000L;
  private volatile boolean closed = false;
  private volatile boolean flushThreadAlive = false;
  private volatile Throwable flushException;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/VueRouter.java`
#### Snippet
```java
  @JsonIgnore private boolean hasParent = false;

  @JsonIgnore private boolean hasChildren = false;

  public void initChildren() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/VueRouter.java`
#### Snippet
```java
  private List<VueRouter<T>> children;

  @JsonIgnore private boolean hasParent = false;

  @JsonIgnore private boolean hasChildren = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/RouterTree.java`
#### Snippet
```java
  private boolean hasParent = false;

  private boolean hasChildren = false;

  private Date createTime;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/RouterTree.java`
#### Snippet
```java
  private String parentId;

  private boolean hasParent = false;

  private boolean hasChildren = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AlertTemplate.java`
#### Snippet
```java
  private Integer restartIndex;
  private Integer totalRestart;
  private boolean atAll = false;

  private static AlertTemplate of(Application application) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Setting.java`
#### Snippet
```java
  private String description;
  private transient boolean editable = false;
  private transient boolean submitting = false;

  private transient String flinkHome;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Setting.java`
#### Snippet
```java

  private String description;
  private transient boolean editable = false;
  private transient boolean submitting = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java
  private transient boolean sqlDifference = false;
  /** dependency diff */
  private transient boolean dependencyDifference = false;

  public FlinkSql() {}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java

  private Date createTime;
  private transient boolean effective = false;
  /** sql diff */
  private transient boolean sqlDifference = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java
  private transient boolean effective = false;
  /** sql diff */
  private transient boolean sqlDifference = false;
  /** dependency diff */
  private transient boolean dependencyDifference = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/ApplicationConfig.java`
#### Snippet
```java
  private Boolean latest;

  private transient boolean effective = false;

  public void setToApplication(Application application) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/CommonServiceImpl.java`
#### Snippet
```java
public class CommonServiceImpl implements CommonService {

  private String sqlClientJar = null;

  @Autowired private UserService userService;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
    implements ApplicationConfigService {

  private String flinkConfTemplate = null;

  @Autowired private ResourceLoader resourceLoader;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java

    private final Character step;
    private boolean stop = false;
    private int count = 0;
    private final Map<Character, TreeNode> next;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
    private final Character step;
    private boolean stop = false;
    private int count = 0;
    private final Map<Character, TreeNode> next;

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
 * @since: 1.2.3
 */
public enum ClusterState implements Serializable {
    /**
     * The cluster was just created but not started
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
import java.io.Serializable;

public enum Semantic implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
 * kubernetes.rest-service.exposed.type
 */
public enum FlinkK8sRestExposedType implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ResolveOrder.java`
#### Snippet
```java
 * classloader.resolve-order
 */
public enum ResolveOrder implements Serializable {
    /**
     * parent-first
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
import java.io.Serializable;

public enum DevelopmentMode implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ApplicationType.java`
#### Snippet
```java
import java.io.Serializable;

public enum ApplicationType implements Serializable {
    /**
     * StreamPark Flink
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/StorageType.java`
#### Snippet
```java
import java.io.Serializable;

public enum StorageType implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
import java.io.Serializable;

public enum FlinkSqlValidationFailedType implements Serializable {
    /**
     * Basic test failed (such as null, etc.)
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
import java.util.List;

public enum ExecutionMode implements Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/OptionState.java`
#### Snippet
```java

@Getter
public enum OptionState implements Serializable {

  /** Application which is currently action: none. */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/StopFrom.java`
#### Snippet
```java
import java.io.Serializable;

public enum StopFrom implements Serializable {
  /** None */
  NONE,
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/NoticeType.java`
#### Snippet
```java
import java.util.Arrays;

public enum NoticeType implements Serializable {
  /** exception */
  EXCEPTION(1),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/EffectiveType.java`
#### Snippet
```java
import java.io.Serializable;

public enum EffectiveType implements Serializable {
  /** config */
  CONFIG(1),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/BuildState.java`
#### Snippet
```java
import java.util.Arrays;

public enum BuildState implements Serializable {

  /** has changed, need rebuild */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CheckPointStatus.java`
#### Snippet
```java
import java.util.Arrays;

public enum CheckPointStatus implements Serializable {
  /** IN_PROGRESS */
  IN_PROGRESS(1),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AccessTokenState.java`
#### Snippet
```java
import java.io.Serializable;

public enum AccessTokenState implements Serializable {

  /** not added token */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AppExistsState.java`
#### Snippet
```java
import java.io.Serializable;

public enum AppExistsState implements Serializable {

  /** no exists */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/PlaceholderType.java`
#### Snippet
```java

/** configFile Type enum */
public enum PlaceholderType implements Serializable {
  JOB_ID("job_id"),

```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/FlinkAppState.java`
#### Snippet
```java

@Getter
public enum FlinkAppState implements Serializable {

  /** added new job to database */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ReleaseState.java`
#### Snippet
```java
import java.util.Arrays;

public enum ReleaseState implements Serializable {

  /** release failed */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ResourceFrom.java`
#### Snippet
```java
import java.util.Arrays;

public enum ResourceFrom implements Serializable {

  /** cicd(build from cvs) */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/GitAuthorizedError.java`
#### Snippet
```java
import java.io.Serializable;

public enum GitAuthorizedError implements Serializable {

  /** success */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CheckPointType.java`
#### Snippet
```java
import java.util.Arrays;

public enum CheckPointType implements Serializable {
  /** CHECKPOINT */
  CHECKPOINT(1),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ChangedType.java`
#### Snippet
```java
import java.util.Arrays;

public enum ChangedType implements Serializable {
  /** none changed */
  NONE(0),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ConfigFileType.java`
#### Snippet
```java

/** configFile Type enum */
public enum ConfigFileType implements Serializable {
  YAML(1, "yaml"),

```

### RedundantImplements
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CandidateType.java`
#### Snippet
```java
import java.util.Arrays;

public enum CandidateType implements Serializable {

  /** non candidate */
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
      } else if (file.isDirectory()) {
        fileLogger.info("{} / {}", space, file.getName());
        printWorkTree(file, space.concat("/").concat(file.getName()));
      }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
      } else if (file.isDirectory()) {
        fileLogger.info("{} / {}", space, file.getName());
        printWorkTree(file, space.concat("/").concat(file.getName()));
      }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/ApplicationBackUp.java`
#### Snippet
```java
      default:
        throw new UnsupportedOperationException(
            "unsupported executionMode ".concat(application.getExecutionModeEnum().getName()));
    }
  }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkEnv.java`
#### Snippet
```java
  public void doSetFlinkConf() throws ApiDetailException {
    try {
      File yaml = new File(this.flinkHome.concat("/conf/flink-conf.yaml"));
      String flinkConf = FileUtils.readFileToString(yaml);
      this.flinkConf = DeflaterUtils.zipString(flinkConf);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java

  private YarnAppInfo httpYarnAppInfo(Application application) throws Exception {
    String reqURL = "ws/v1/cluster/apps/".concat(application.getAppId());
    return yarnRestRequest(reqURL, YarnAppInfo.class);
  }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    String branches = this.getBranches() == null ? "main" : this.getBranches();
    String rootName = url.replaceAll(".*/|\\.git|\\.svn", "");
    String fullName = rootName.concat("-").concat(branches);
    String path = String.format("%s/%s/%s", sourcePath.getAbsolutePath(), getName(), fullName);
    return new File(path);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    String branches = this.getBranches() == null ? "main" : this.getBranches();
    String rootName = url.replaceAll(".*/|\\.git|\\.svn", "");
    String fullName = rootName.concat("-").concat(branches);
    String path = String.format("%s/%s/%s", sourcePath.getAbsolutePath(), getName(), fullName);
    return new File(path);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    if (CommonUtils.notEmpty(this.getPom())) {
      buildHome =
          new File(buildHome.concat("/").concat(this.getPom())).getParentFile().getAbsolutePath();
    }
    return buildHome;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    if (CommonUtils.notEmpty(this.getPom())) {
      buildHome =
          new File(buildHome.concat("/").concat(this.getPom())).getParentFile().getAbsolutePath();
    }
    return buildHome;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    } catch (Exception e) {
      if (CommonUtils.isWindows()) {
        mvn = WebUtils.getAppHome().concat("/bin/mvnw.cmd");
      } else {
        mvn = WebUtils.getAppHome().concat("/bin/mvnw");
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
        mvn = WebUtils.getAppHome().concat("/bin/mvnw.cmd");
      } else {
        mvn = WebUtils.getAppHome().concat("/bin/mvnw");
      }
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    Utils.required(
        client.exists() && client.listFiles().length > 0,
        client.getAbsolutePath().concat(" is not exists or empty directory "));

    String appClient = workspace.APP_CLIENT();
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
      if (matcher.matches()) {
        String version = matcher.group(1);
        String shimsPath = appShims.concat("/flink-").concat(version);
        fsOperator.mkdirs(shimsPath);
        log.info("load shims:{} to {}", file.getName(), shimsPath);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
      if (matcher.matches()) {
        String version = matcher.group(1);
        String shimsPath = appShims.concat("/flink-").concat(version);
        fsOperator.mkdirs(shimsPath);
        log.info("load shims:{} to {}", file.getName(), shimsPath);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    }
    String flinkName = flinkLocalDir.getName();
    String flinkHome = appFlink.concat("/").concat(flinkName);
    if (!fsOperator.exists(flinkHome)) {
      log.info("{} is not exists,upload beginning....", flinkHome);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    }
    String flinkName = flinkLocalDir.getName();
    String flinkHome = appFlink.concat("/").concat(flinkName);
    if (!fsOperator.exists(flinkHome)) {
      log.info("{} is not exists,upload beginning....", flinkHome);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                File localJar = new File(WebUtils.getAppTempDir(), app.getJar());
                // upload jar copy to appHome
                String uploadJar = appUploads.concat("/").concat(app.getJar());
                checkOrElseUploadJar(app.getFsOperator(), localJar, uploadJar, appUploads);
                switch (app.getApplicationType()) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                File localJar = new File(WebUtils.getAppTempDir(), app.getJar());
                // upload jar copy to appHome
                String uploadJar = appUploads.concat("/").concat(app.getJar());
                checkOrElseUploadJar(app.getFsOperator(), localJar, uploadJar, appUploads);
                switch (app.getApplicationType()) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                  Utils.required(localJar.exists());
                  String localUploads = Workspace.local().APP_UPLOADS();
                  String uploadJar = localUploads.concat("/").concat(jar);
                  checkOrElseUploadJar(FsOperator.lfs(), localJar, uploadJar, localUploads);
                }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                  Utils.required(localJar.exists());
                  String localUploads = Workspace.local().APP_UPLOADS();
                  String uploadJar = localUploads.concat("/").concat(jar);
                  checkOrElseUploadJar(FsOperator.lfs(), localJar, uploadJar, localUploads);
                }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
        switch (app.getApplicationType()) {
          case STREAMPARK_FLINK:
            return String.format("%s/%s", app.getAppLib(), app.getModule().concat(".jar"));
          case APACHE_FLINK:
            return String.format("%s/%s", app.getAppHome(), app.getJar());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
      case YARN_APPLICATION:
        String yarnProvidedPath = app.getAppLib();
        String localWorkspace = app.getLocalAppHome().concat("/lib");
        if (app.getDevelopmentMode().equals(DevelopmentMode.CUSTOMCODE)
            && app.getApplicationType().equals(ApplicationType.APACHE_FLINK)) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                      commonService.getUserId(),
                      app.getId(),
                      app.getJobName().concat(" release failed"),
                      Utils.stringifyException(snapshot.error().exception()),
                      NoticeType.EXCEPTION);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
        return StorageType.LFS;
      default:
        throw new UnsupportedOperationException("Unsupported ".concat(executionMode.getName()));
    }
  }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
      default:
        throw new UnsupportedOperationException(
            "unsupported executionMode ".concat(getExecutionModeEnum().getName()));
    }
  }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
  @JsonIgnore
  public String getAppLib() {
    return getAppHome().concat("/lib");
  }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
      project.setId(application.getProjectId());
      String modulePath =
          project.getDistHome().getAbsolutePath().concat("/").concat(application.getModule());
      jarFile = new File(modulePath, application.getJar());
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
      project.setId(application.getProjectId());
      String modulePath =
          project.getDistHome().getAbsolutePath().concat("/").concat(application.getModule());
      jarFile = new File(modulePath, application.getJar());
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            flinkUserJar =
                String.format(
                    "%s/%s", application.getAppLib(), application.getModule().concat(".jar"));
            break;
          case APACHE_FLINK:
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    if (appParam.isUploadJob()) {
      String jarPath =
          WebUtils.getAppTempDir().getAbsolutePath().concat("/").concat(appParam.getJar());
      appParam.setJarCheckSum(FileUtils.checksumCRC32(new File(jarPath)));
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    if (appParam.isUploadJob()) {
      String jarPath =
          WebUtils.getAppTempDir().getAbsolutePath().concat("/").concat(appParam.getJar());
      appParam.setJarCheckSum(FileUtils.checksumCRC32(new File(jarPath)));
    }
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
          throw e;
        }
        if (e instanceof LoadStatusFailedException
            && ((LoadStatusFailedException) e).needReCreateLabel()) {
          String oldLabel = flushData.getLabel();
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   */
  public static String uuid(int len) {
    StringBuffer sb = new StringBuffer();
    while (sb.length() < len) {
      sb.append(uuid());
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-hbase/src/main/scala/org/apache/streampark/flink/connector/hbase/bean/HBaseQuery.java`
#### Snippet
```java
    public Table getTable(Properties prop) {
        if (htable == null) {
            synchronized (HBaseQuery.class) {
                if (htable == null) {
                    htable = HBaseClient.apply(prop).table(this.getTable());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule.schedule(
            () -> {
              synchronized (DorisSinkWriter.this) {
                if (!closed) {
                  try {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/LoadStatusFailedException.java`
#### Snippet
```java
  static final long serialVersionUID = 1L;
  private final Map<String, Object> response;
  private boolean reCreateLabel;

  public LoadStatusFailedException(String message, Map<String, Object> response) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkRowDataWithMeta.java`
#### Snippet
```java

  public String[] getDataRows() {
    return dataRows.toArray(new String[] {});
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ObjectUtils.java`
#### Snippet
```java
    }
    if (source == null) {
      return new Object[0];
    }
    if (!source.getClass().isArray()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ObjectUtils.java`
#### Snippet
```java
    int length = Array.getLength(source);
    if (length == 0) {
      return new Object[0];
    }
    @SuppressWarnings("rawtypes")
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/config/SwaggerConfig.java`
#### Snippet
```java
                        Collections.singletonList(
                            SecurityReference.builder()
                                .scopes(new AuthorizationScope[0])
                                .reference("Authorization")
                                .build()))
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/LarkAlertNotifyServiceImpl.java`
#### Snippet
```java
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(new SecretKeySpec(stringToSign.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
      byte[] signData = mac.doFinal(new byte[] {});
      String sign = new String(Base64.encodeBase64(signData));
      if (log.isDebugEnabled()) {
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `elem`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    List<T> arrayList = new ArrayList<>(0);
    Collections.addAll(arrayList, array);
    if (isEmpty(elem)) {
      return array;
    }
```

### NullArgumentToVariableArgMethod
Confusing argument `files`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        List<String> list = new ArrayList<>();
        File[] files = appHome.listFiles();
        if (CommonUtils.notEmpty(files)) {
          for (File file : files) {
            list.add(file.getName());
```

### NullArgumentToVariableArgMethod
Confusing argument `appParam.getStateArray()`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    }
    Page<Application> page = new MybatisPager<Application>().getDefaultPage(request);
    if (CommonUtils.notEmpty(appParam.getStateArray())) {
      if (Arrays.stream(appParam.getStateArray())
          .anyMatch(x -> x == FlinkAppState.FINISHED.getValue())) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `b` initializer `-1` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
          try (FileOutputStream outputStream = new FileOutputStream(fullFileName);
              BufferedOutputStream bufOutput = new BufferedOutputStream(outputStream)) {
            int b = -1;
            while ((b = archiveInput.read()) != -1) {
              bufOutput.write(b);
```

### UnusedAssignment
Variable `map` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    List<Map<String, Object>> list = new ArrayList<>();
    if (objList != null && objList.size() > 0) {
      Map<String, Object> map = null;
      T bean = null;
      for (T t : objList) {
```

### UnusedAssignment
Variable `bean` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    if (objList != null && objList.size() > 0) {
      Map<String, Object> map = null;
      T bean = null;
      for (T t : objList) {
        bean = t;
```

### UnusedAssignment
The value `loc` assigned to `breakLoc.loc` is never used
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
        if (!nowStep.containsKey(nowChar)) {
          // maybe wrong typing
          breakLoc.loc = loc;
          break;
        }
```

### UnusedAssignment
Variable `checkSum` initializer `0` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        File jarFile = new File(WebUtils.getAppTempDir(), appParam.getJar());
        if (jarFile.exists()) {
          long checkSum = 0;
          try {
            checkSum = FileUtils.checksumCRC32(jarFile);
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`OS.indexOf("digital") >= 0` can be replaced with 'OS.contains("digital")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isDigitalUnix() {
    return OS.indexOf("digital") >= 0 && OS.indexOf("unix") > 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("osf1") >= 0` can be replaced with 'OS.contains("osf1")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isOSF1() {
    return OS.indexOf("osf1") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("irix") >= 0` can be replaced with 'OS.contains("irix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isIrix() {
    return OS.indexOf("irix") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("solaris") >= 0` can be replaced with 'OS.contains("solaris")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isSolaris() {
    return OS.indexOf("solaris") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("netware") >= 0` can be replaced with 'OS.contains("netware")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isNetWare() {
    return OS.indexOf("netware") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("mpe/ix") >= 0` can be replaced with 'OS.contains("mpe/ix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isMPEiX() {
    return OS.indexOf("mpe/ix") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("aix") >= 0` can be replaced with 'OS.contains("aix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isAix() {
    return OS.indexOf("aix") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("sunos") >= 0` can be replaced with 'OS.contains("sunos")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isSunOS() {
    return OS.indexOf("sunos") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("os/2") >= 0` can be replaced with 'OS.contains("os/2")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isOS2() {
    return OS.indexOf("os/2") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("linux") >= 0` can be replaced with 'OS.contains("linux")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isLinux() {
    return OS.indexOf("linux") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("freebsd") >= 0` can be replaced with 'OS.contains("freebsd")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isFreeBSD() {
    return OS.indexOf("freebsd") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("hp-ux") >= 0` can be replaced with 'OS.contains("hp-ux")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isHPUX() {
    return OS.indexOf("hp-ux") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("windows") >= 0` can be replaced with 'OS.contains("windows")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isWindows() {
    return OS.indexOf("windows") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("os/390") >= 0` can be replaced with 'OS.contains("os/390")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isOS390() {
    return OS.indexOf("os/390") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("openvms") >= 0` can be replaced with 'OS.contains("openvms")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isOpenVMS() {
    return OS.indexOf("openvms") >= 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("mac") >= 0` can be replaced with 'OS.contains("mac")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isMacOSX() {
    return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") > 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("mac") >= 0` can be replaced with 'OS.contains("mac")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isMacOS() {
    return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") < 0;
  }

```

### IndexOfReplaceableByContains
`OS.indexOf("x") < 0` can be replaced with '!OS.contains("x")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static boolean isMacOS() {
    return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") < 0;
  }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `((Iterable``) obj).iterator() == null` is always `false`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

      if (obj instanceof Iterable) {
        if (((Iterable<?>) obj).iterator() == null || !((Iterable<?>) obj).iterator().hasNext()) {
          return true;
        }
```

### ConstantValue
Condition `applications != null` is always `true`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java

    // Get applications that depend on this variable in application args
    if (applications != null) {
      for (Application app : applications) {
        if (isDepend(variable.getVariableCode(), app.getArgs())) {
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getInstance()` tries to override a static method of a superclass
in `streampark-flink/streampark-flink-packer/src/main/java/com/github/dockerjava/core/HackDockerClient.java`
#### Snippet
```java
  }

  public static HackDockerClient getInstance(
      DockerClientConfig dockerClientConfig, DockerHttpClient dockerHttpClient) {
    HackDockerClient client = new HackDockerClient(dockerClientConfig);
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `timeout` may be 'static'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

  private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
  private final Long timeout = 3000L;
  private volatile boolean closed = false;
  private volatile boolean flushThreadAlive = false;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DorisDelimiterParser` has only 'static' members, and lacks a 'private' constructor
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java
import java.io.StringWriter;

public class DorisDelimiterParser {

  private static final String HEX_STRING = "0123456789ABCDEF";
```

### UtilityClassWithoutPrivateConstructor
Class `StreamParkConsoleBootstrap` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/StreamParkConsoleBootstrap.java`
#### Snippet
```java
@SpringBootApplication
@EnableScheduling
public class StreamParkConsoleBootstrap {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java

/** The file utils. */
public class FileUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `FreemarkerUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FreemarkerUtils.java`
#### Snippet
```java

@Slf4j
public class FreemarkerUtils {
  private static final Configuration CONFIGURATION;

```

### UtilityClassWithoutPrivateConstructor
Class `GitUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GitUtils.java`
#### Snippet
```java

/** */
public class GitUtils {

  public static Git clone(Project project) throws GitAPIException {
```

### UtilityClassWithoutPrivateConstructor
Class `ApiDocConstant` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/ApiDocConstant.java`
#### Snippet
```java
package org.apache.streampark.console.base.domain;

public class ApiDocConstant {

  public static final String FLINK_APP_OP_TAG = "FLINK_APPLICATION_OPERATION_TAG";
```

### UtilityClassWithoutPrivateConstructor
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/Constant.java`
#### Snippet
```java
package org.apache.streampark.console.base.domain;

public class Constant {

  // order rules: descend
```

### UtilityClassWithoutPrivateConstructor
Class `Bridge` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sWatcherWrapper.java`
#### Snippet
```java

  /** Type converter bridge */
  public static class Bridge {

    // covert Application to TrackId
```

### UtilityClassWithoutPrivateConstructor
Class `Bridge` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/FlinkAppState.java`
#### Snippet
```java

  /** type conversion bridging */
  public static class Bridge {
    /** covert from org.apache.streampark.flink.k8s.enums.FlinkJobState */
    public static FlinkAppState fromK8sFlinkJobState(Enumeration.Value flinkJobState) {
```

### UtilityClassWithoutPrivateConstructor
Class `JWTUtil` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java

@Slf4j
public class JWTUtil {

  private static final long JWT_TIME_OUT =
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `streampark-flink/streampark-flink-packer/src/main/java/com/github/dockerjava/api/command/HackBuildImageResultCallback.java`
#### Snippet
```java
    String stream = item.getStream();
    if (item.isErrorIndicated()) {
      listener.watchBuildStep(item.getErrorDetail().getMessage());
    } else if (stream != null && stream.startsWith(STEP_PREFIX)) {
      listener.watchBuildStep(stream);
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
        ApiAlertException.throwIfNull(
            multipartFile, "File to upload can't be null. Upload file failed.");
        boolean fileType = FileUtils.isJarFileType(multipartFile.getInputStream());
        ApiAlertException.throwIfFalse(
            fileType, "Illegal file type, Only support standard jar files. Upload file failed.");
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    }
    if (dir.isDirectory()) {
      for (File file : dir.listFiles()) {
        if (!deleteFile(file)) {
          return false;
```

### DataFlowIssue
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
        || ExecutionMode.YARN_PER_JOB.equals(execMode)) {
      optional =
          jobsOverview.getJobs().size() > 1
              ? jobsOverview.getJobs().stream()
                  .filter(a -> StringUtils.equals(application.getJobId(), a.getId()))
```

### DataFlowIssue
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
    } else {
      optional =
          jobsOverview.getJobs().stream()
              .filter(x -> x.getId().equals(application.getJobId()))
              .findFirst();
```

### DataFlowIssue
Dereference of `client.listFiles()` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    File client = WebUtils.getAppClientDir();
    Utils.required(
        client.exists() && client.listFiles().length > 0,
        client.getAbsolutePath().concat(" is not exists or empty directory "));

```

### DataFlowIssue
Dereference of `client.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    fsOperator.mkCleanDirs(appClient);

    for (File file : client.listFiles(fileFilter)) {
      log.info("load client:{} to {}", file.getName(), appClient);
      fsOperator.upload(file.getAbsolutePath(), appClient);
```

### DataFlowIssue
Dereference of `plugins.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java

    File plugins = WebUtils.getAppPluginsDir();
    for (File file : plugins.listFiles(fileFilter)) {
      log.info("load plugin:{} to {}", file.getName(), appPlugins);
      fsOperator.upload(file.getAbsolutePath(), appPlugins);
```

### DataFlowIssue
Dereference of `shims` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    fsOperator.delete(appShims);

    for (File file : shims) {
      Matcher matcher = PATTERN_FLINK_SHIMS_JAR.matcher(file.getName());
      if (matcher.matches()) {
```

### DataFlowIssue
Method invocation `setStop` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
      }
      Utils.notNull(preNode);
      preNode.setStop();
      preNode.setCount(count);
    }
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        File[] files = appHome.listFiles();
        if (CommonUtils.notEmpty(files)) {
          for (File file : files) {
            list.add(file.getName());
          }
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
      File[] files = unzipFile.listFiles(x -> "conf".equals(x.getName()));
      Utils.notNull(files);
      for (File item : files) {
        eachFile(item, list, true);
      }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
          .data(new String(fileContent, StandardCharsets.UTF_8))
          .put("offset", endOffset)
          .put("readFinished", readFinished);
    } catch (IOException e) {
      String error =
```

### DataFlowIssue
Dereference of `ExecutionMode.of(executionMode)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationHistoryController.java`
#### Snippet
```java
  public RestResponse listSessionClusterId(int executionMode) {
    List<String> clusterIds;
    switch (ExecutionMode.of(executionMode)) {
      case KUBERNETES_NATIVE_SESSION:
      case YARN_SESSION:
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
              .message(exception)
              .put("type", flinkSqlValidationResult.failedType().getValue())
              .put("start", flinkSqlValidationResult.lineStart())
              .put("end", flinkSqlValidationResult.lineEnd());

```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
              .put("type", flinkSqlValidationResult.failedType().getValue())
              .put("start", flinkSqlValidationResult.lineStart())
              .put("end", flinkSqlValidationResult.lineEnd());

      if (flinkSqlValidationResult.errorLine() > 0) {
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
      if (flinkSqlValidationResult.errorLine() > 0) {
        response
            .put("start", flinkSqlValidationResult.errorLine())
            .put("end", flinkSqlValidationResult.errorLine() + 1);
      }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
        response
            .put("start", flinkSqlValidationResult.errorLine())
            .put("end", flinkSqlValidationResult.errorLine() + 1);
      }
      return response;
```

### DataFlowIssue
Method invocation `message` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
    User user = userService.getById(userId);
    if (Objects.isNull(user)) {
      return RestResponse.success().put("code", 0).message("user not available");
    }

```

### DataFlowIssue
Method invocation `as` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
      if (ExecutionMode.isKubernetesApplicationMode(application.getExecutionMode())) {
        Utils.notNull(buildResult);
        DockerImageBuildResponse result = buildResult.as(DockerImageBuildResponse.class);
        String ingressTemplates = application.getIngressTemplate();
        String domainName = application.getDefaultModeIngress();
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `E` hides type parameter 'E'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
  public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
    @SuppressWarnings("hiding")
    class EnumerationIterator<E> implements Iterator<E> {
      private final Enumeration<E> enumeration;

```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByValue()' can be used instead
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
  public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
    List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
    Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
    Map<K, V> result = new LinkedHashMap<>();
    for (Map.Entry<K, V> entry : list) {
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
  @Autowired private SettingService settingService;

  private final Set<StorageType> initialized = new HashSet<>(2);

  private final FileFilter fileFilter = p -> !".gitkeep".equals(p.getName());
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.baseMapper` accessed in synchronized context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
    applicationConfig.setContent(config);
    applicationConfig.setCreateTime(new Date());
    Integer version = this.baseMapper.getLastVersion(application.getId());
    applicationConfig.setVersion(version == null ? 1 : version + 1);
    save(applicationConfig);
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

      // char sequence
      if ((obj instanceof CharSequence) && "".equals(obj.toString().trim())) {
        return true;
      }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/mybatis/pager/MybatisPager.java`
#### Snippet
```java

@SuppressWarnings("unchecked")
public final class MybatisPager<T> {

  public Page<T> getDefaultPage(RestRequest request) {
```

### RedundantSuppression
Redundant suppression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/AppBuildPipeline.java`
#### Snippet
```java
  @Nullable
  @JsonIgnore
  public <R extends BuildResult> R getBuildResult() {
    PipelineType pipeType = getPipeType();
    if (pipeType.isUnknown() || buildResultJson == null) {
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `data.getDataRows()`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkFunction.java`
#### Snippet
```java
            String.format(
                " row data not fullfilled. {database: %s, table: %s, dataRows: %s}",
                data.getDatabase(), data.getTable(), data.getDataRows()));
        return;
      }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    return String.format(
        "%s_%s_%s",
        labelPrefix, System.currentTimeMillis(), UUID.randomUUID().toString().replaceAll("-", ""));
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
          createDir(targetDir, entryName, 1);
          if (unFile == null) {
            unFile = new File(targetDir + entryName.replaceAll("/.*$", ""));
          }
        } else if (entry.isFile()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GitUtils.java`
#### Snippet
```java
      String refName = ref.getName();
      if (refName.startsWith(Constants.R_HEADS)) {
        String branchName = refName.replace(Constants.R_HEADS, "");
        branchList.add(branchName);
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/config/P6spySqlFormatConfig.java`
#### Snippet
```java
            DateUtils.formatFullTime(LocalDateTime.now()),
            elapsed,
            sql.replaceAll("\\s+", StringUtils.SPACE));
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/mybatis/interceptor/PostgreSQLPrepareInterceptor.java`
#### Snippet
```java
    Field field = boundSql.getClass().getDeclaredField("sql");
    field.setAccessible(true);
    field.set(boundSql, boundSql.getSql().replace("`", "\"").toLowerCase());
    return invocation.proceed();
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        // 2) .jar file(normal or official standard flink project)
        Utils.checkJarFile(app.toURI().toURL());
        String moduleName = app.getName().replace(".jar", "");
        File distHome = project.getDistHome();
        File targetDir = new File(distHome, moduleName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static String uuid() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/metrics/flink/CheckPoints.java`
#### Snippet
```java

    public String getPath() {
      return this.getExternalPath().replaceFirst("^hdfs:/[^/]", "hdfs:///");
    }
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    }
    String branches = this.getBranches() == null ? "main" : this.getBranches();
    String rootName = url.replaceAll(".*/|\\.git|\\.svn", "");
    String fullName = rootName.concat("-").concat(branches);
    String path = String.format("%s/%s/%s", sourcePath.getAbsolutePath(), getName(), fullName);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
      return new ArrayList<>();
    }
    String[] temp = sql.split("\\s");
    return completeFstTree.getComplicate(temp[temp.length - 1]);
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
    try {
      File file = new File(project.getDistHome(), project.getModule());
      File unzipFile = new File(file.getAbsolutePath().replaceAll(".tar.gz", ""));
      if (!unzipFile.exists()) {
        GZipUtils.decompress(file.getAbsolutePath(), file.getParentFile().getAbsolutePath());
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary and can be removed
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
    fileAppender.start();

    ch.qos.logback.classic.Logger logger =
        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Thread.currentThread().getName());
    logger.addAppender(fileAppender);
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary and can be removed
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java

    ch.qos.logback.classic.Logger logger =
        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Thread.currentThread().getName());
    logger.addAppender(fileAppender);
    logger.setLevel(Level.INFO);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    }

    java.text.DecimalFormat df = new java.text.DecimalFormat("#." + prefix);
    try {
      return Double.parseDouble(df.format(number));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    }

    java.text.DecimalFormat df = new java.text.DecimalFormat("#." + prefix);
    try {
      return Double.parseDouble(df.format(number));
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.util` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkEnv.java`
#### Snippet
```java
  private transient FlinkVersion flinkVersion;

  private transient String streamParkScalaVersion = scala.util.Properties.versionNumberString();

  public void doSetFlinkConf() throws ApiDetailException {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CompatibleKubernetesWatcher()` of an abstract class should not be declared 'public'
in `streampark-flink/streampark-flink-kubernetes/src/main/java/org/apache/flink/kubernetes/kubeclient/resources/CompatibleKubernetesWatcher.java`
#### Snippet
```java
    extends AbstractKubernetesWatcher<T, K> {

  public CompatibleKubernetesWatcher() {
    super(new SilentWatchCallbackHandler<>());
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLogFileTask()` of an abstract class should not be declared 'public'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
  private PatternLayoutEncoder ple;

  public AbstractLogFileTask(String logPath, boolean isOverwrite) {
    this.logPath = Paths.get(logPath);
    this.isOverwrite = isOverwrite;
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
              .eq(Application::getId, application.getId())
              .set(Application::getRelease, ReleaseState.NEED_RESTART.get()));
    } catch (Exception e) {
      throw e;
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `level`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AlertType.java`
#### Snippet
```java
  public static List<AlertType> decode(Integer level) {
    if (level == null) {
      level = 0;
    }
    List<AlertType> result = Lists.newArrayList();
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AlertType.java`
#### Snippet
```java
      int code = level & -level;
      result.add(getByCode(code));
      level ^= code;
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    while (offset > 0) {
      prefix += "0";
      offset -= 1;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

  public static String toPercent(Number number, int offset) {
    offset += 2;
    Double num = fixedNum(number, offset);
    return (num * 100) + "%";
```

### AssignmentToMethodParameter
Assignment to method parameter `word`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
    public List<String> getComplicate(String word) {

      word = word.toLowerCase();
      SqlCompleteFstTree.Single searchFromHeadPassLength = new Single();
      SqlCompleteFstTree.Single searchFromReversePassLength = new Single();
```

### AssignmentToMethodParameter
Assignment to method parameter `startOffset`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
    // Read log from earliest when project is building
    if (startOffset == null && isBuilding) {
      startOffset = 0L;
    }
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `sql`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
  @PostMapping("verify")
  public RestResponse verify(String sql, Long versionId, Long teamId) {
    sql = variableService.replaceVariable(teamId, sql);
    FlinkSqlValidationResult flinkSqlValidationResult = flinkSqlService.verifySql(sql, versionId);
    if (!flinkSqlValidationResult.success()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expireTime`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java

    if (StringUtils.isEmpty(expireTime)) {
      expireTime = AccessToken.DEFAULT_EXPIRE_TIME;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `password`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
    }
    String salt = user.getSalt();
    password = ShaHashUtils.encrypt(salt, password);
    if (!StringUtils.equals(user.getPassword(), password)) {
      return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `password`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/PassportController.java`
#### Snippet
```java
    }

    password = ShaHashUtils.encrypt(user.getSalt(), password);

    this.userService.updateLoginTime(username);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ResolveOrder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ApplicationType.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/WebUtils.java`
#### Snippet
```java
    } catch (Exception e) {
      log.info("token encrypt failed: ", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/WebUtils.java`
#### Snippet
```java
    } catch (Exception e) {
      log.info("token decrypt failed: ", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/VueRouterUtils.java`
#### Snippet
```java
  public static <T> ArrayList<VueRouter<T>> buildVueRouter(List<VueRouter<T>> routes) {
    if (routes == null) {
      return null;
    }
    List<VueRouter<T>> topRoutes = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/VueRouterUtils.java`
#### Snippet
```java
  public static <T> RouterTree<T> buildRouterTree(List<RouterTree<T>> nodes) {
    if (nodes == null) {
      return null;
    }
    List<RouterTree<T>> topNodes = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AlertConfigWithParams.java`
#### Snippet
```java
  public static AlertConfigWithParams of(AlertConfig config) {
    if (config == null) {
      return null;
    }
    AlertConfigWithParams params = new AlertConfigWithParams();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java
    public static ImagePull of(DockerPullSnapshot snapshot) {
      if (snapshot == null) {
        return null;
      }
      return new ImagePull()
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java
    public static ImageBuild of(DockerBuildSnapshot snapshot) {
      if (snapshot == null) {
        return null;
      }
      return new ImageBuild()
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java
    public static ImagePush of(DockerPushSnapshot snapshot) {
      if (snapshot == null) {
        return null;
      }
      return new ImagePush()
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/GitAuthorizedError.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ChangedType.java`
#### Snippet
```java
        return "[ALL], Dependency and Flink Sql all changed";
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/AlertConfig.java`
#### Snippet
```java
  public static AlertConfig of(AlertConfigWithParams params) {
    if (params == null) {
      return null;
    }
    AlertConfig alertConfig = new AlertConfig();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
    String result = YarnUtils.restRequest(url);
    if (null == result) {
      return null;
    }
    return JacksonUtils.read(result, clazz);
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
      return flinkCluster;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
        HttpClientUtils.httpGetRequest(url, RequestConfig.custom().setConnectTimeout(5000).build());
    if (null == result) {
      return null;
    }
    return JacksonUtils.read(result, clazz);
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkCluster.java`
#### Snippet
```java
      //
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/LogClientService.java`
#### Snippet
```java
        }
      }
      return null;
    } catch (Exception e) {
      throw new ApiDetailException("roll view log error: " + e);
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/CommonServiceImpl.java`
#### Snippet
```java
      return user.getUserId();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkSqlServiceImpl.java`
#### Snippet
```java
      return flinkSql;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
  public IPage<Variable> page(Variable variable, RestRequest request) {
    if (variable.getTeamId() == null) {
      return null;
    }
    Page<Variable> page = new MybatisPager<Variable>().getDefaultPage(request);
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SettingServiceImpl.java`
#### Snippet
```java
      log.warn("Fault Alert Email is not set.");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
      log.info(e.getMessage());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertServiceImpl.java`
#### Snippet
```java
        return HttpCallbackAlertNotifyServiceImpl.class;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
    User user = usersService.findByName(username);
    if (user == null) {
      return null;
    }
    String salt = user.getSalt();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
    password = ShaHashUtils.encrypt(salt, password);
    if (!StringUtils.equals(user.getPassword(), password)) {
      return null;
    }
    return user;
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
    String ldapEmail = ldapService.ldapLogin(username, password);
    if (ldapEmail == null) {
      return null;
    }
    // check if user exist
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MemberServiceImpl.java`
#### Snippet
```java
    User user = userService.findByName(userName);
    if (user == null) {
      return null;
    }
    return findByUserId(teamId, user.getUserId());
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
          } catch (Exception e) {
            log.warn("invalid ldap credentials or ldap search error", e);
            return null;
          }
          Attribute attr = (Attribute) attrs.next();
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
    } catch (NamingException e) {
      log.error("ldap search error", e);
      return null;
    }
    return null;
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
      return null;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
    } catch (Exception e) {
      log.error("error：{}", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
    } catch (JWTDecodeException e) {
      log.error("error：{}", e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
    } catch (JWTDecodeException e) {
      log.error("error：{}", e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                  return file.getAbsolutePath();
                }
                return null;
              })
          .thenApply(
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                  return logClient.rollViewLog(path, offset, limit);
                }
                return null;
              })
          .toCompletableFuture()
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  public IPage<Application> page(Application appParam, RestRequest request) {
    if (appParam.getTeamId() == null) {
      return null;
    }
    Page<Application> page = new MybatisPager<Application>().getDefaultPage(request);
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
      }
      try {
        Thread.sleep(1000L * (i + 1));
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
```

