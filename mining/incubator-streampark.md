# incubator-streampark 
 
# Bad smells
I found 489 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 77 | false |
| RuleId[ruleID=DataFlowIssue] | 41 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 36 | false |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 34 | false |
| RuleId[ruleID=RedundantImplements] | 24 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 23 | false |
| RuleId[ruleID=IndexOfReplaceableByContains] | 18 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 18 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 17 | false |
| RuleId[ruleID=BoundedWildcard] | 16 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 12 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 12 | false |
| RuleId[ruleID=UnusedAssignment] | 12 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 11 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 10 | true |
| RuleId[ruleID=IgnoreResultOfCall] | 9 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 9 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 7 | false |
| RuleId[ruleID=SystemOutErr] | 7 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 7 | false |
| RuleId[ruleID=ConstantValue] | 6 | false |
| RuleId[ruleID=NestedAssignment] | 5 | false |
| RuleId[ruleID=EmptyMethod] | 5 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 4 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 4 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 3 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 3 | false |
| RuleId[ruleID=DuplicateExpressions] | 3 | false |
| RuleId[ruleID=ManualMinMaxCalculation] | 3 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 3 | false |
| RuleId[ruleID=IOResource] | 3 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 2 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 2 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 2 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 2 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 2 | false |
| RuleId[ruleID=StringBufferReplaceableByStringBuilder] | 2 | false |
| RuleId[ruleID=SynchronizeOnThis] | 2 | false |
| RuleId[ruleID=Convert2MethodRef] | 2 | false |
| RuleId[ruleID=RedundantSuppression] | 2 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 2 | true |
| RuleId[ruleID=CaughtExceptionImmediatelyRethrown] | 2 | false |
| RuleId[ruleID=UnnecessaryContinue] | 2 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 2 | true |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 1 | true |
| RuleId[ruleID=WhileCanBeForeach] | 1 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 1 | false |
| RuleId[ruleID=NumberEquality] | 1 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 1 | false |
| RuleId[ruleID=EqualsBetweenInconvertibleTypes] | 1 | false |
| RuleId[ruleID=MalformedFormatString] | 1 | false |
| RuleId[ruleID=Lombok] | 1 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 1 | false |
| RuleId[ruleID=NonFinalFieldOfException] | 1 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 1 | false |
| RuleId[ruleID=OptionalIsPresent] | 1 | false |
| RuleId[ruleID=FieldMayBeStatic] | 1 | false |
| RuleId[ruleID=TypeParameterHidesVisibleType] | 1 | false |
| RuleId[ruleID=RedundantComparatorComparing] | 1 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 1 | false |
| RuleId[ruleID=PublicFieldAccessedInSynchronizedContext] | 1 | false |
| RuleId[ruleID=ImplicitArrayToString] | 1 | false |
| RuleId[ruleID=BusyWait] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[list.size()\]'
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
        }

        return list.toArray(new String[list.size()]);
    }

```

## RuleId[ruleID=WhileCanBeForeach]
### RuleId[ruleID=WhileCanBeForeach]
`while` loop can be replaced with enhanced 'for'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/FileHeaderCheckInterceptor.java`
#### Snippet
```java
            Map<String, MultipartFile> files = multipartRequest.getFileMap();
            Iterator<String> iterator = files.keySet().iterator();
            while (iterator.hasNext()) {
                String formKey = iterator.next();
                MultipartFile multipartFile = multipartRequest.getFile(formKey);
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `SpringContextUtils.applicationContext` from instance context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/SpringContextUtils.java`
#### Snippet
```java
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `applicationService` from instance context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
    @Autowired
    public void setApplicationService(ApplicationService appService) {
        applicationService = appService;
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `completeFstTree` from instance context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
    @PostConstruct
    public void initialize() {
        completeFstTree = new SqlCompleteFstTree();
    }

```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
public class VariableServiceImpl extends ServiceImpl<VariableMapper, Variable> implements VariableService {

    private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("\\$\\{([A-Za-z])+([A-Za-z0-9._-])+\\}");

    private static final String PLACEHOLDER_START = "${";
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
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

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `yamlMap.keySet()` may be replaced with 'entrySet()' iteration
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/YamlConfigProvider.java`
#### Snippet
```java
                Map overrideMap = null;

                for (Object key : yamlMap.keySet()) {
                    String configKey = key.toString();
                    Object valueObj = yamlMap.get(key);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `overrideMap.keySet()` may be replaced with 'entrySet()' iteration
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/YamlConfigProvider.java`
#### Snippet
```java

                if (overrideMap != null) {
                    for (Object key : overrideMap.keySet()) {
                        String overrideKey = key.toString();
                        Object valueObj = overrideMap.get(key);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `DorisSinkWriter` on 'this' is unnecessary in this context
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule = Executors.newScheduledThreadPool(1, ThreadUtils.threadFactory("doris-interval-sink"));
        this.scheduledFuture = this.schedule.schedule(() -> {
            synchronized (DorisSinkWriter.this) {
                if (!closed) {
                    try {
```

## RuleId[ruleID=DuplicateExpressions]
### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `str.substring(0, str.length() - 1).trim()`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            }
            if (str.endsWith("k")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = KB_SIZE;
            } else if (str.endsWith("mb")) {
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `str.substring(0, str.length() - 1).trim()`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = MB_SIZE;
            } else if (str.endsWith("m")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = MB_SIZE;
            } else if (str.endsWith("gb")) {
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `str.substring(0, str.length() - 1).trim()`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = GB_SIZE;
            } else if (str.endsWith("g")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = GB_SIZE;
            } else if (str.endsWith("bytes")) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
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

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pathPart.length() == 0` can be replaced with 'pathPart.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
            restResponse.data(false).message(error);
        }
        if (pathPart.length() == 0 || pathPart.equals("/")) {
            error = "Cannot use the root directory for checkpoints.";
            restResponse.data(false).message(error);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`sp.length() == 0` can be replaced with 'sp.isEmpty()'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java

    public static String parse(String sp) throws RuntimeException {
        if (sp == null || sp.length() == 0) {
            throw new RuntimeException("Delimiter can't be empty");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pathPart.length() == 0` can be replaced with 'pathPart.isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                error = "This state.savepoints.dir value " + savepointPath +
                    " path part to store the checkpoint data in is null. Please specify a directory path for the checkpoint data.";
            } else if (pathPart.length() == 0 || "/".equals(pathPart)) {
                error = "This state.savepoints.dir value " + savepointPath + " Cannot use the root directory for checkpoints.";
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`cpuAttributes.size() > 0` can be replaced with '!cpuAttributes.isEmpty()'
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java

        AttributeList cpuAttributes = getCpuAttributes();
        if (cpuAttributes != null && cpuAttributes.size() > 0) {
            Attribute att = (Attribute) cpuAttributes.get(ATTRIBUTE_INDEX_PROCESS_CPU_LOAD);
            processCpuLoad = (Double) att.getValue();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`unit.length() > 0` can be replaced with '!unit.isEmpty()'
in `streampark-common/src/main/scala/org/apache/streampark/common/domain/FlinkMemorySize.java`
#### Snippet
```java
            final String unit = trimmed.substring(pos).trim().toLowerCase(Locale.US);

            return unit.length() > 0;
        }

```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `tp1.f0 & tp2.f0`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertServiceImpl.java`
#### Snippet
```java
            }
        }).reduce(new Tuple2<>(true, null), (tp1, tp2) -> {
            boolean alertResult = tp1.f0 & tp2.f0;
            if (tp1.f1 == null && tp2.f1 == null) {
                return new Tuple2<>(tp1.f0 & tp2.f0, null);
```

### RuleId[ruleID=NonShortCircuitBoolean]
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

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
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

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.min()' call
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Histogram.java`
#### Snippet
```java
        sum.addAndGet(value);

        min.updateAndGet(x -> value < x ? value : x);
        max.updateAndGet(x -> value > x ? value : x);
    }
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.max()' call
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Histogram.java`
#### Snippet
```java

        min.updateAndGet(x -> value < x ? value : x);
        max.updateAndGet(x -> value > x ? value : x);
    }

```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
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

### RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=NumberEquality]
### RuleId[ruleID=NumberEquality]
Number objects are compared using `==`, not 'equals()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ResourceFrom.java`
#### Snippet
```java

    public static ResourceFrom of(Integer value) {
        return Arrays.stream(values()).filter((x) -> x.value == value).findFirst().orElse(null);
    }

```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompatibleKubernetesWatcher` has no concrete subclass
in `streampark-flink/streampark-flink-kubernetes/src/main/java/org/apache/flink/kubernetes/kubeclient/resources/CompatibleKubernetesWatcher.java`
#### Snippet
```java
 * Compatible AbstractKubernetesWatcher for fabric8.
 */
public abstract class CompatibleKubernetesWatcher<T extends HasMetadata, K extends KubernetesResource<T>>
    extends AbstractKubernetesWatcher<T, K> {

```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/MoreFutures.java`
#### Snippet
```java
    }

    public static <T> CompletableFuture<T> completeImmediately(Supplier<T> supplier) {
        try {
            return CompletableFuture.completedFuture(supplier.get());
```

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
    }

    private void findTarOrJar(List<File> list, File path) {
        for (File file : Objects.requireNonNull(path.listFiles())) {
            // navigate to the target directory:
```

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Map`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
    }

    private void eachFile(File file, List<Map<String, Object>> list, Boolean isRoot) {
        if (file != null && file.exists() && file.listFiles() != null) {
            if (isRoot) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ArgumentUtils.java`
#### Snippet
```java

    public static List<String> getArgumentMultiValues(
        Map<String, List<String>> parsedArgs, String argName) {
        List<String> list = parsedArgs.get(argName);
        if (list == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ArgumentUtils.java`
#### Snippet
```java

    public static String getArgumentSingleValue(
        Map<String, List<String>> parsedArgs, String argName) {
        List<String> list = parsedArgs.get(argName);
        if (list == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DorisSinkBufferEntry`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    }

    public void setBufferedBatchMap(Map<String, DorisSinkBufferEntry> newBufferMap) {
        if (Semantic.EXACTLY_ONCE.equals(semantic)) {
            bufferMap.clear();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassAndMethod`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ClassAndMethodFilter.java`
#### Snippet
```java
    private ClassAndMethod[] classAndMethods = new ClassAndMethod[0];

    public ClassAndMethodFilter(List<ClassAndMethod> classMethodNames) {
        if (classMethodNames != null) {
            this.classAndMethods = new ClassAndMethod[classMethodNames.size()];
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassMethodArgument`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ClassMethodArgumentFilter.java`
#### Snippet
```java
    private ClassMethodArgument[] classMethodArguments = new ClassMethodArgument[0];

    public ClassMethodArgumentFilter(List<ClassMethodArgument> classMethodArgumentToFilter) {
        if (classMethodArgumentToFilter != null) {
            this.classMethodArguments = new ClassMethodArgument[classMethodArgumentToFilter.size()];
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/YamlConfigProvider.java`
#### Snippet
```java

    private static void addConfig(
        Map<String, Map<String, List<String>>> config, String override, String key, Object value) {
        Map<String, List<String>> configMap = config.computeIfAbsent(override, k -> new HashMap<>());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ExponentialBackoffRetryPolicy.java`
#### Snippet
```java
    }

    public T attempt(Callable<T> operation) {
        int remainingAttempts = maxAttemptCount - 1;
        long minSleepTime = minSleepMillis;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Profiler`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/AgentImpl.java`
#### Snippet
```java
    }

    public ProfilerGroup startProfilers(Collection<Profiler> profilers) {
        if (started) {
            LOGGER.warn("Profilers already started, do not start it again");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Profiler`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/AgentImpl.java`
#### Snippet
```java
    }

    private void scheduleProfilers(Collection<Profiler> profilers) {
        int threadPoolSize = Math.min(profilers.size(), MAX_THREAD_POOL_SIZE);
        ScheduledExecutorService scheduledExecutorService =
```

## RuleId[ruleID=EqualsBetweenInconvertibleTypes]
### RuleId[ruleID=EqualsBetweenInconvertibleTypes]
`equals` between objects of inconvertible types 'Long' and 'int'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        Map<String, String> data = new HashMap<>();
        data.put("id", Long.toString(id));
        return id.equals(0) ? RestResponse.success(false).data(data) : RestResponse.success(true).data(data);
    }

```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/MetricsTask.java`
#### Snippet
```java
        Arrays.stream(Objects.requireNonNull(temp.listFiles()))
            .filter(x -> x.getName().matches(FLAME_GRAPH_FILE_REGEXP))
            .forEach(File::delete);

        // 2 clean date
```

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            return false;
        }
        long cancelUserId = FlinkTrackingTask.getCanceledJobUserId(appId).longValue();
        long appUserId = application.getUserId().longValue();
        return cancelUserId != -1 && cancelUserId != appUserId;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        }
        long cancelUserId = FlinkTrackingTask.getCanceledJobUserId(appId).longValue();
        long appUserId = application.getUserId().longValue();
        return cancelUserId != -1 && cancelUserId != appUserId;
    }
```

## RuleId[ruleID=MalformedFormatString]
### RuleId[ruleID=MalformedFormatString]
Too many arguments for format string (found: 4, expected: 3)
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
                } else {
                    sb.append(
                        String.format(
                            "try{org.apache.streampark.plugin.profiling.transformer.MethodProfilerStaticProxy.collectMethodArgument(\"%s\", \"%s\", %s, \"\");}catch(Throwable ex){ex.printStackTrace();}",
                            normalizedClassName, method.getName(), argument, argument));
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        @ApiImplicitParam(name = "id", value = "app Id", required = true, paramType = "query", dataTypeClass = Long.class),
        @ApiImplicitParam(name = "savePointed", value = "restored app from the savepoint or latest checkpoint", required = true, paramType = "query", dataTypeClass = Boolean.class, defaultValue = "false"),
        @ApiImplicitParam(name = "savePoint", value = "savepoint or checkpoint path", required = true, paramType = "query", dataTypeClass = String.class, defaultValue = ""),
        @ApiImplicitParam(name = "flameGraph", value = "flame Graph support", required = true, paramType = "query", dataTypeClass = Boolean.class, defaultValue = "false"),
        @ApiImplicitParam(name = "allowNonRestored", value = "ignore savepoint then cannot be restored", required = true, paramType = "query", dataTypeClass = Boolean.class, defaultValue = "false")})
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "copy target app id", required = true, paramType = "query", dataTypeClass = Long.class),
        @ApiImplicitParam(name = "jobName", value = "name of the copied application", required = true, paramType = "query", dataTypeClass = String.class, defaultValue = ""),
        @ApiImplicitParam(name = "args", value = "commit parameters after copying", required = false, paramType = "query", dataTypeClass = String.class, defaultValue = "")})
    @PostMapping(value = "copy", consumes = "application/x-www-form-urlencoded")
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        @ApiImplicitParam(name = "id", value = "copy target app id", required = true, paramType = "query", dataTypeClass = Long.class),
        @ApiImplicitParam(name = "jobName", value = "name of the copied application", required = true, paramType = "query", dataTypeClass = String.class, defaultValue = ""),
        @ApiImplicitParam(name = "args", value = "commit parameters after copying", required = false, paramType = "query", dataTypeClass = String.class, defaultValue = "")})
    @PostMapping(value = "copy", consumes = "application/x-www-form-urlencoded")
    @RequiresPermissions("app:copy")
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        @ApiImplicitParam(name = "id", value = "copy target app id", required = true, paramType = "query", dataTypeClass = Long.class),
        @ApiImplicitParam(name = "jobName", value = "name of the copied application", required = true, paramType = "query", dataTypeClass = String.class, defaultValue = ""),
        @ApiImplicitParam(name = "args", value = "commit parameters after copying", required = false, paramType = "query", dataTypeClass = String.class, defaultValue = "")})
    @PostMapping(value = "copy", consumes = "application/x-www-form-urlencoded")
    @RequiresPermissions("app:copy")
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkEnvServiceImpl.java`
#### Snippet
```java
    @Override
    public void update(FlinkEnv version) throws IOException {
        FlinkEnv flinkEnv = super.getById(version.getId());
        if (flinkEnv == null) {
            throw new RuntimeException("flink home message lost, please check database status!");
```

### RuleId[ruleID=UnnecessarySuperQualifier]
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

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    public String reGenerateLabel() {
        return label = createLabel();
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Utils.java`
#### Snippet
```java
            int readByteCount;
            byte[] data = new byte[16 * 1024];
            while ((readByteCount = input.read(data, 0, data.length)) != -1) {
                byteArrayOutputStream.write(data, 0, readByteCount);
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `streampark-common/src/main/scala/org/apache/streampark/common/domain/FlinkMemorySize.java`
#### Snippet
```java

            char current;
            while (pos < len && (current = trimmed.charAt(pos)) >= '0' && current <= '9') {
                pos++;
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `streampark-common/src/main/scala/org/apache/streampark/common/domain/FlinkMemorySize.java`
#### Snippet
```java

        char current;
        while (pos < len && (current = trimmed.charAt(pos)) >= '0' && current <= '9') {
            pos++;
        }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`intTmp = intTmp + 256` could be simplified to 'intTmp += 256'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java
            int intTmp = anArrB;
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            if (intTmp < 16) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`i = i + 2` could be simplified to 'i += 2'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java

        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`cpThreshold = cpThreshold - 1` could be simplified to 'cpThreshold -= 1'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java

        if (CheckPointType.CHECKPOINT.equals(CheckPointType.of(entity.getType()))) {
            cpThreshold = cpThreshold - 1;
        }

```

## RuleId[ruleID=Lombok]
### RuleId[ruleID=Lombok]
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `streampark-storage/src/main/java/org/apache/streampark/storage/oss/OssConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OssConfig extends StorageServiceConfig {
    private String accessKeyId;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `tailBeginning` are updated, but never queried
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    private final Map<Long, Long> tailOutMap = new ConcurrentHashMap<>();

    private final Map<Long, Boolean> tailBeginning = new ConcurrentHashMap<>();

    private final ExecutorService executorService = new ThreadPoolExecutor(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `tailOutMap` are updated, but never queried
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    implements ApplicationService {

    private final Map<Long, Long> tailOutMap = new ConcurrentHashMap<>();

    private final Map<Long, Boolean> tailBeginning = new ConcurrentHashMap<>();
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `effectiveService` is accessed in both synchronized and unsynchronized contexts
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java

    @Autowired
    private EffectiveService effectiveService;

    @Override
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
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

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `batchCount` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
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

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `buffer` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java
    }

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `schedule` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    private final DorisStreamLoader streamLoader;

    private ScheduledExecutorService schedule;
    private ScheduledFuture<?> scheduledFuture;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

    private ScheduledExecutorService schedule;
    private ScheduledFuture<?> scheduledFuture;

    private transient Counter totalFlushBytes;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `reporter` is accessed in both synchronized and unsynchronized contexts
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/IOProfiler.java`
#### Snippet
```java
    private long interval = Constants.DEFAULT_METRIC_INTERVAL;

    private Reporter reporter;

    public IOProfiler(Reporter reporter) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `reporter` is accessed in both synchronized and unsynchronized contexts
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
    private MemoryMXBean memoryMXBean;

    private Reporter reporter;

    public CpuAndMemoryProfiler(Reporter reporter) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `operatingSystemObjectName` is accessed in both synchronized and unsynchronized contexts
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java

    private MBeanServer platformMBeanServer;
    private ObjectName operatingSystemObjectName;

    private MemoryMXBean memoryMXBean;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `platformMBeanServer` is accessed in both synchronized and unsynchronized contexts
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
    private long interval = Constants.DEFAULT_METRIC_INTERVAL;

    private MBeanServer platformMBeanServer;
    private ObjectName operatingSystemObjectName;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `memoryMXBean` is accessed in both synchronized and unsynchronized contexts
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
    private ObjectName operatingSystemObjectName;

    private MemoryMXBean memoryMXBean;

    private Reporter reporter;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

### RuleId[ruleID=UseOfPropertiesAsHashtable]
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

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkConsoleAspect.java`
#### Snippet
```java

    @Pointcut("@annotation(org.apache.streampark.console.core.annotation.RefreshCache)")
    public void refreshCache() {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/NoteBookController.java`
#### Snippet
```java

    @PostMapping("submit")
    public void submit(Note note) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/NoteBookController.java`
#### Snippet
```java

    @PostMapping("submit2")
    public void submit2(Note note) {
    }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
    protected abstract void processException(Throwable t);

    protected abstract void doFinally();

}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/Reporter.java`
#### Snippet
```java
    void report(String profilerName, Map<String, Object> metrics);

    void close();
}

```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/VueRouter.java`
#### Snippet
```java

    @JsonIgnore
    private boolean hasParent = false;

    @JsonIgnore
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/VueRouter.java`
#### Snippet
```java

    @JsonIgnore
    private boolean hasChildren = false;

    public void initChildren() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/RouterTree.java`
#### Snippet
```java
    private String parentId;

    private boolean hasParent = false;

    private boolean hasChildren = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/router/RouterTree.java`
#### Snippet
```java
    private boolean hasParent = false;

    private boolean hasChildren = false;

    private Date createTime;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java
    private static final String DEFAULT_KEY = "defaultKey";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

    private static String byteArr2HexStr(byte[] arrB) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java

    private static final String DEFAULT_KEY = "defaultKey";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/Note.java`
#### Snippet
```java
    private String text;

    private Content content = null;

    public Content getContent() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AlertTemplate.java`
#### Snippet
```java
    private Integer restartIndex;
    private Integer totalRestart;
    private boolean atAll = false;

    private static AlertTemplate of(Application application) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Setting.java`
#### Snippet
```java
    private String description;
    private transient boolean editable = false;
    private transient boolean submitting = false;

    private transient String flinkHome;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Setting.java`
#### Snippet
```java

    private String description;
    private transient boolean editable = false;
    private transient boolean submitting = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java
     * sql diff
     */
    private transient boolean sqlDifference = false;
    /**
     * dependency diff
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java
     * dependency diff
     */
    private transient boolean dependencyDifference = false;

    public FlinkSql() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkSql.java`
#### Snippet
```java

    private Date createTime;
    private transient boolean effective = false;
    /**
     * sql diff
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/ApplicationConfig.java`
#### Snippet
```java
    private Boolean latest;

    private transient boolean effective = false;

    public void setToApplication(Application application) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/CommonServiceImpl.java`
#### Snippet
```java
public class CommonServiceImpl implements CommonService {

    private String sqlClientJar = null;

    @Autowired
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
    implements ApplicationConfigService {

    private String flinkConfTemplate = null;

    @Autowired
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
        private final Character step;
        private boolean stop = false;
        private int count = 0;
        private final Map<Character, TreeNode> next;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java

        private final Character step;
        private boolean stop = false;
        private int count = 0;
        private final Map<Character, TreeNode> next;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    private ArrayList<byte[]> buffer = new ArrayList<>();
    private int batchCount = 0;
    private long batchSize = 0;
    private String label;
```

### RuleId[ruleID=RedundantFieldInitialization]
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

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
    private final Long timeout = 3000L;
    private volatile boolean closed = false;
    private volatile boolean flushThreadAlive = false;
    private volatile Throwable flushException;

```

### RuleId[ruleID=RedundantFieldInitialization]
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

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
public class AgentLogger {

    private static boolean debug = false;
    private static ErrorLogReporter errorLogReporter;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/AgentImpl.java`
#### Snippet
```java
    private static final int MAX_THREAD_POOL_SIZE = 2;

    private boolean started = false;

    public void run(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java
public class ProfilerBase {
    private String tag = null;
    private String cluster = null;
    private String hostName = null;
    private String processName = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java

    private String jobId = null;
    private String appId = null;

    private String role = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java
    private String tag = null;
    private String cluster = null;
    private String hostName = null;
    private String processName = null;
    private String processUuid = UUID.randomUUID().toString();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java
    private String appId = null;

    private String role = null;

    public ProfilerBase() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java
    private String processUuid = UUID.randomUUID().toString();

    private String jobId = null;
    private String appId = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java

public class ProfilerBase {
    private String tag = null;
    private String cluster = null;
    private String hostName = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProfilerBase.java`
#### Snippet
```java
    private String cluster = null;
    private String hostName = null;
    private String processName = null;
    private String processUuid = UUID.randomUUID().toString();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0L` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/Arguments.java`
#### Snippet
```java
    private String appIdRegex = DEFAULT_APP_ID_REGEX;
    private long metricInterval = DEFAULT_METRIC_INTERVAL;
    private long sampleInterval = 0L;
    private String tag;
    private String cluster;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/Arguments.java`
#### Snippet
```java
    private final Map<String, List<String>> rawArgValues = new HashMap<>();

    private boolean noop = false;

    private Constructor<Reporter> reporterConstructor;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0L` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ThreadInfoProfiler.java`
#### Snippet
```java
     * to keep track of Total Thread.
     */
    private long previousTotalStartedThreadCount = 0L;

    private Reporter reporter;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/ProcessInfoProfiler.java`
#### Snippet
```java
    private String jvmInputArguments = "";
    private String jvmClassPath = "";
    private Long jvmXmxBytes = null;
    private String cmdline = "";

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-jdbc/src/main/scala/org/apache/streampark/flink/connector/jdbc/source/JdbcJavaSource.java`
#### Snippet
```java
    private final StreamingContext context;
    private Properties jdbc;
    private String alias = null;

    public JdbcJavaSource(StreamingContext context) {
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/OptionState.java`
#### Snippet
```java

@Getter
public enum OptionState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/StopFrom.java`
#### Snippet
```java
import java.io.Serializable;

public enum StopFrom implements Serializable {
    /**
     * None
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/NoticeType.java`
#### Snippet
```java
import java.util.Arrays;

public enum NoticeType implements Serializable {
    /**
     * exception
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/EffectiveType.java`
#### Snippet
```java
import java.io.Serializable;

public enum EffectiveType implements Serializable {
    /**
     * config
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AccessTokenState.java`
#### Snippet
```java
import java.io.Serializable;

public enum AccessTokenState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CheckPointStatus.java`
#### Snippet
```java
import java.util.Arrays;

public enum CheckPointStatus implements Serializable {
    /**
     * IN_PROGRESS
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/BuildState.java`
#### Snippet
```java
import java.util.Arrays;

public enum BuildState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/LaunchState.java`
#### Snippet
```java
import java.util.Arrays;

public enum LaunchState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/AppExistsState.java`
#### Snippet
```java
import java.io.Serializable;

public enum AppExistsState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/GitAuthorizedError.java`
#### Snippet
```java
import java.io.Serializable;

public enum GitAuthorizedError implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ResourceFrom.java`
#### Snippet
```java
import java.util.Arrays;

public enum ResourceFrom implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/FlinkAppState.java`
#### Snippet
```java

@Getter
public enum FlinkAppState implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CheckPointType.java`
#### Snippet
```java
import java.util.Arrays;

public enum CheckPointType implements Serializable {
    /**
     * CHECKPOINT
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/ChangedType.java`
#### Snippet
```java
import java.util.Arrays;

public enum ChangedType implements Serializable {
    /**
     * none changed
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/CandidateType.java`
#### Snippet
```java
import java.util.Arrays;

public enum CandidateType implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
import java.io.Serializable;

public enum Semantic implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
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

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
import java.io.Serializable;

public enum DevelopmentMode implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
import java.io.Serializable;

public enum FlinkSqlValidationFailedType implements Serializable {
    /**
     * Basic test failed (such as null, etc.)
```

### RuleId[ruleID=RedundantImplements]
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

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
 * kubernetes.rest-service.exposed.type
 */
public enum FlinkK8sRestExposedType implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/StorageType.java`
#### Snippet
```java
import java.io.Serializable;

public enum StorageType implements Serializable {

    /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ApplicationType.java`
#### Snippet
```java
import java.io.Serializable;

public enum ApplicationType implements Serializable {
    /**
     * StreamPark Flink
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
import java.util.List;

public enum ExecutionMode implements Serializable {

    /**
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
                    throw e;
                }
                if (e instanceof LoadStatusFailedException && ((LoadStatusFailedException) e).needReCreateLabel()) {
                    String oldLabel = flushData.getLabel();
                    flushData.reGenerateLabel();
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
            } else if (file.isDirectory()) {
                fileLogger.info("{} / {}", space, file.getName());
                gitWorkTree(id, file, space.concat("/").concat(file.getName()));
            }
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
            } else if (file.isDirectory()) {
                fileLogger.info("{} / {}", space, file.getName());
                gitWorkTree(id, file, space.concat("/").concat(file.getName()));
            }
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/ApplicationBackUp.java`
#### Snippet
```java
                break;
            default:
                throw new UnsupportedOperationException("unsupported executionMode ".concat(application.getExecutionModeEnum().getName()));
        }
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java

    private AppInfo httpYarnAppInfo(Application application) throws Exception {
        String reqURL = "ws/v1/cluster/apps/".concat(application.getAppId());
        return yarnRestRequest(reqURL, AppInfo.class);
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
        String buildHome = this.getAppSource().getAbsolutePath();
        if (CommonUtils.notEmpty(this.getPom())) {
            buildHome = new File(buildHome.concat("/")
                .concat(this.getPom()))
                .getParentFile()
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
        if (CommonUtils.notEmpty(this.getPom())) {
            buildHome = new File(buildHome.concat("/")
                .concat(this.getPom()))
                .getParentFile()
                .getAbsolutePath();
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
            AssertUtils.checkArgument(
                client.exists() && client.listFiles().length > 0,
                client.getAbsolutePath().concat(" is not exists or empty directory ")
            );

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlameGraphServiceImpl.java`
#### Snippet
```java
            IOUtils.write(jsonBuffer.toString().getBytes(), fileOutputStream);

            String title = application.getJobName().concat(" ___ FlameGraph");
            // generate...
            List<String> commands = Arrays.asList(
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkClusterServiceImpl.java`
#### Snippet
```java
        flameGraph.put("type", ApplicationType.STREAMPARK_FLINK.getType());
        flameGraph.put("id", flinkCluster.getId());
        flameGraph.put("url", settingService.getStreamParkAddress().concat("/metrics/report"));
        flameGraph.put("token", Utils.uuid());
        flameGraph.put("sampleInterval", 1000 * 60 * 2);
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
    @JsonIgnore
    public String getAppLib() {
        return getAppHome().concat("/lib");
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
                return getRemoteAppHome();
            default:
                throw new UnsupportedOperationException("unsupported executionMode ".concat(getExecutionModeEnum().getName()));
        }
    }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                        commonService.getUserId(),
                        app.getId(),
                        app.getJobName().concat(" launch failed"),
                        ExceptionUtils.stringifyException(snapshot.error().exception()),
                        NoticeType.EXCEPTION
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
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

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                            AssertUtils.state(localJar.exists());
                            String localUploads = Workspace.local().APP_UPLOADS();
                            String uploadJar = localUploads.concat("/").concat(jar);
                            checkOrElseUploadJar(FsOperator.lfs(), localJar, uploadJar, localUploads);
                        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
                            AssertUtils.state(localJar.exists());
                            String localUploads = Workspace.local().APP_UPLOADS();
                            String uploadJar = localUploads.concat("/").concat(jar);
                            checkOrElseUploadJar(FsOperator.lfs(), localJar, uploadJar, localUploads);
                        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        flameGraph.put("type", ApplicationType.STREAMPARK_FLINK.getType());
        flameGraph.put("id", application.getId());
        flameGraph.put("url", settingService.getStreamParkAddress().concat("/metrics/report"));
        flameGraph.put("token", Utils.uuid());
        flameGraph.put("sampleInterval", 1000 * 60 * 2);
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        appParam.doSetHotParams();
        if (appParam.isUploadJob()) {
            String jarPath = WebUtils.getAppTempDir().getAbsolutePath().concat("/").concat(appParam.getJar());
            appParam.setJarCheckSum(FileUtils.checksumCRC32(new File(jarPath)));
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        appParam.doSetHotParams();
        if (appParam.isUploadJob()) {
            String jarPath = WebUtils.getAppTempDir().getAbsolutePath().concat("/").concat(appParam.getJar());
            appParam.setJarCheckSum(FileUtils.checksumCRC32(new File(jarPath)));
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            Project project = new Project();
            project.setId(application.getProjectId());
            String modulePath = project.getDistHome().getAbsolutePath().concat("/").concat(application.getModule());
            jarFile = new File(modulePath, application.getJar());
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            Project project = new Project();
            project.setId(application.getProjectId());
            String modulePath = project.getDistHome().getAbsolutePath().concat("/").concat(application.getModule());
            jarFile = new File(modulePath, application.getJar());
        }
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                switch (application.getApplicationType()) {
                    case STREAMPARK_FLINK:
                        flinkUserJar = String.format("%s/%s", application.getAppLib(), application.getModule().concat(".jar"));
                        break;
                    case APACHE_FLINK:
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### RuleId[ruleID=StringBufferReplaceableByStringBuilder]
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

### RuleId[ruleID=StringBufferReplaceableByStringBuilder]
`StringBuffer cmdBuffer` may be declared as 'StringBuilder'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
        }

        StringBuffer cmdBuffer = new StringBuffer(mvn).append(" clean package -DskipTests ");

        if (StringUtils.isNotEmpty(this.buildArgs)) {
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
        this.schedule = Executors.newScheduledThreadPool(1, ThreadUtils.threadFactory("doris-interval-sink"));
        this.scheduledFuture = this.schedule.schedule(() -> {
            synchronized (DorisSinkWriter.this) {
                if (!closed) {
                    try {
```

### RuleId[ruleID=SynchronizeOnThis]
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

## RuleId[ruleID=NonFinalFieldOfException]
### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `reCreateLabel` of exception class
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/LoadStatusFailedException.java`
#### Snippet
```java
    static final long serialVersionUID = 1L;
    private final Map<String, Object> response;
    private boolean reCreateLabel;

    public LoadStatusFailedException(String message, Map<String, Object> response) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/config/SwaggerConfig.java`
#### Snippet
```java
                    .securityReferences(Collections.singletonList(
                        SecurityReference.builder()
                            .scopes(new AuthorizationScope[0])
                            .reference("BearerToken")
                            .build()))
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
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

### RuleId[ruleID=ZeroLengthArrayInitialization]
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

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/LarkAlertNotifyServiceImpl.java`
#### Snippet
```java
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(stringToSign.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            byte[] signData = mac.doFinal(new byte[]{});
            String sign = new String(Base64.encodeBase64(signData));
            if (log.isDebugEnabled()) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkRowDataWithMeta.java`
#### Snippet
```java

    public String[] getDataRows() {
        return dataRows.toArray(new String[]{});
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkAppCmdInfo.java`
#### Snippet
```java
    public void setArgs(String[] args) {
        if (args == null) {
            this.args = new String[0];
        } else {
            this.args = Arrays.copyOf(args, args.length);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkAppCmdInfo.java`
#### Snippet
```java
    private String appClass;
    private String appJar;
    private String[] args = new String[0];

    public String getAppClass() {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ClassAndMethodFilter.java`
#### Snippet
```java
    private static final String METHOD_NAME_WILDCARD = "*";

    private ClassAndMethod[] classAndMethods = new ClassAndMethod[0];

    public ClassAndMethodFilter(List<ClassAndMethod> classMethodNames) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Stacktrace.java`
#### Snippet
```java
    private String threadName;
    private String threadState;
    private ClassAndMethod[] stack = new ClassAndMethod[0];

    public String getThreadName() {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Stacktrace.java`
#### Snippet
```java
    public void setStack(ClassAndMethod[] stack) {
        if (stack == null) {
            this.stack = new ClassAndMethod[0];
        } else {
            this.stack = stack;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ClassMethodArgumentFilter.java`
#### Snippet
```java
    private static final String METHOD_NAME_WILDCARD = "*";

    private ClassMethodArgument[] classMethodArguments = new ClassMethodArgument[0];

    public ClassMethodArgumentFilter(List<ClassMethodArgument> classMethodArgumentToFilter) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
    private static String[] getArgumentValues(String str, String argument, int maxCount) {
        if (str == null || str.isEmpty() || argument == null || argument.isEmpty()) {
            return new String[0];
        }

```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkConsoleAspect.java`
#### Snippet
```java
            Method method = param.getClass().getDeclaredMethod("getAppId");
            method.setAccessible(true);
            appId = (Long) method.invoke(param, null);
        }
        return FlinkTrackingTask.refreshTracking(appId, () -> {
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
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

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `files`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
                List<String> list = new ArrayList<>();
                File[] files = appHome.listFiles();
                if (CommonUtils.notEmpty(files)) {
                    for (File file: files) {
                        list.add(file.getName());
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `appParam.getStateArray()`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        }
        Page<Application> page = new MybatisPager<Application>().getDefaultPage(request);
        if (CommonUtils.notEmpty(appParam.getStateArray())) {
            if (Arrays.stream(appParam.getStateArray()).anyMatch(x -> x == FlinkAppState.FINISHED.getValue())) {
                Integer[] newArray = CommonUtils.arrayInsertIndex(
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
Variable `decryptCipher` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java
    private static final String DEFAULT_KEY = "defaultKey";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

    private static String byteArr2HexStr(byte[] arrB) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `encryptCipher` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java

    private static final String DEFAULT_KEY = "defaultKey";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

```

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
Variable `clazz` initializer `null` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
    public static <T> Constructor<T> getConstructor(
        String implementaionClass, Class<T> interfaceClass) {
        Class<?> clazz = null;

        try {
```

### RuleId[ruleID=UnusedAssignment]
Variable `reporter` initializer `new ConsoleOutputReporter()` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/MethodArgumentProfiler.java`
#### Snippet
```java
    private final ClassMethodArgumentMetricBuffer buffer;

    private Reporter reporter = new ConsoleOutputReporter();

    private long interval = Constants.DEFAULT_METRIC_INTERVAL;
```

### RuleId[ruleID=UnusedAssignment]
Variable `ignoreThreadNamePrefix` initializer `""` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/StacktraceCollectorProfiler.java`
#### Snippet
```java
    private long interval;
    private final StacktraceMetricBuffer buffer;
    private String ignoreThreadNamePrefix = "";
    private int maxStringLength = Constants.MAX_STRING_LENGTH;
    private final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
```

### RuleId[ruleID=UnusedAssignment]
Variable `maxStringLength` initializer `Constants.MAX_STRING_LENGTH` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/StacktraceCollectorProfiler.java`
#### Snippet
```java
    private final StacktraceMetricBuffer buffer;
    private String ignoreThreadNamePrefix = "";
    private int maxStringLength = Constants.MAX_STRING_LENGTH;
    private final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

```

### RuleId[ruleID=UnusedAssignment]
Variable `reporter` initializer `new ConsoleOutputReporter()` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/MethodDurationProfiler.java`
#### Snippet
```java
    private final ClassAndMethodLongMetricBuffer buffer;

    private Reporter reporter = new ConsoleOutputReporter();

    private long interval = Constants.DEFAULT_METRIC_INTERVAL;
```

### RuleId[ruleID=UnusedAssignment]
Variable `reporter` initializer `new ConsoleOutputReporter()` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/StacktraceReporterProfiler.java`
#### Snippet
```java
    private final StacktraceMetricBuffer buffer;

    private Reporter reporter = new ConsoleOutputReporter();

    private long interval = Constants.DEFAULT_METRIC_INTERVAL;
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("hp-ux") >= 0` can be replaced with 'OS.contains("hp-ux")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isHPUX() {
        return OS.indexOf("hp-ux") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("sunos") >= 0` can be replaced with 'OS.contains("sunos")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isSunOS() {
        return OS.indexOf("sunos") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("os/2") >= 0` can be replaced with 'OS.contains("os/2")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isOS2() {
        return OS.indexOf("os/2") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("mac") >= 0` can be replaced with 'OS.contains("mac")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isMacOSX() {
        return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") > 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("osf1") >= 0` can be replaced with 'OS.contains("osf1")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isOSF1() {
        return OS.indexOf("osf1") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("windows") >= 0` can be replaced with 'OS.contains("windows")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isWindows() {
        return OS.indexOf("windows") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("linux") >= 0` can be replaced with 'OS.contains("linux")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isLinux() {
        return OS.indexOf("linux") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("openvms") >= 0` can be replaced with 'OS.contains("openvms")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isOpenVMS() {
        return OS.indexOf("openvms") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("aix") >= 0` can be replaced with 'OS.contains("aix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isAix() {
        return OS.indexOf("aix") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("solaris") >= 0` can be replaced with 'OS.contains("solaris")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isSolaris() {
        return OS.indexOf("solaris") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("mpe/ix") >= 0` can be replaced with 'OS.contains("mpe/ix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isMPEiX() {
        return OS.indexOf("mpe/ix") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("irix") >= 0` can be replaced with 'OS.contains("irix")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isIrix() {
        return OS.indexOf("irix") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("freebsd") >= 0` can be replaced with 'OS.contains("freebsd")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isFreeBSD() {
        return OS.indexOf("freebsd") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("os/390") >= 0` can be replaced with 'OS.contains("os/390")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isOS390() {
        return OS.indexOf("os/390") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("mac") >= 0` can be replaced with 'OS.contains("mac")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isMacOS() {
        return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") < 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("x") < 0` can be replaced with '!OS.contains("x")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isMacOS() {
        return OS.indexOf("mac") >= 0 && OS.indexOf("os") > 0 && OS.indexOf("x") < 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("netware") >= 0` can be replaced with 'OS.contains("netware")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isNetWare() {
        return OS.indexOf("netware") >= 0;
    }

```

### RuleId[ruleID=IndexOfReplaceableByContains]
`OS.indexOf("digital") >= 0` can be replaced with 'OS.contains("digital")'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static boolean isDigitalUnix() {
        return OS.indexOf("digital") >= 0 && OS.indexOf("unix") > 0;
    }

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `request != null` is always `true`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/FileHeaderCheckInterceptor.java`
#### Snippet
```java
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request != null && request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> files = multipartRequest.getFileMap();
```

### RuleId[ruleID=ConstantValue]
Condition `((Iterable``) obj).iterator() == null` is always `false`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

            if (obj instanceof Iterable) {
                if (((Iterable<?>) obj).iterator() == null || !((Iterable<?>) obj).iterator().hasNext()) {
                    return true;
                }
```

### RuleId[ruleID=ConstantValue]
Condition `applications != null` is always `true`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java

        // Get applications that depend on this variable in application args
        if (applications != null) {
            for (Application app : applications) {
                if (isDepend(variable.getVariableCode(), app.getArgs())) {
```

### RuleId[ruleID=ConstantValue]
Condition `id.equals(0)` is always `false`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        Map<String, String> data = new HashMap<>();
        data.put("id", Long.toString(id));
        return id.equals(0) ? RestResponse.success(false).data(data) : RestResponse.success(true).data(data);
    }

```

### RuleId[ruleID=ConstantValue]
Condition `method == null` is always `false`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
        for (String entry : methodArray) {
            Method method = clazz.getMethod(entry);
            if (method == null) {
                return null;
            }
```

### RuleId[ruleID=ConstantValue]
Condition `bufferPools != null` is always `true`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
        List<BufferPoolMXBean> bufferPools =
            ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class);
        if (bufferPools != null) {
            for (BufferPoolMXBean pool : bufferPools) {
                Map<String, Object> bufferPoolMap = new HashMap<>();
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### RuleId[ruleID=MethodOverridesStaticMethod]
Method `getInstance()` tries to override a static method of a superclass
in `streampark-flink/streampark-flink-packer/src/main/java/com/github/dockerjava/core/HackDockerClient.java`
#### Snippet
```java
    }

    public static HackDockerClient getInstance(DockerClientConfig dockerClientConfig, DockerHttpClient dockerHttpClient) {
        HackDockerClient client = new HackDockerClient(dockerClientConfig);
        client.dockerCmdExecFactory = new DefaultDockerCmdExecFactory(dockerHttpClient, dockerClientConfig.getObjectMapper());
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java
                String.format("The startOffset %s is great than the file length %s", startOffset, file.length()));
        }
        RandomAccessFile raFile = new RandomAccessFile(file, "r");
        long readSize = Math.min(maxSize, file.length() - startOffset);
        raFile.seek(startOffset);
```

### RuleId[ruleID=IOResource]
'RandomAccessFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java
    public static byte[] readEndOfFile(File file, long maxSize) throws IOException {
        long readSize = maxSize;
        RandomAccessFile raFile = new RandomAccessFile(file, "r");
        if (raFile.length() > maxSize) {
            raFile.seek(raFile.length() - maxSize);
```

### RuleId[ruleID=IOResource]
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/Note.java`
#### Snippet
```java
    public Content getContent() {
        if (this.content == null) {
            Scanner scanner = new Scanner(this.text);
            Properties properties = new Properties();
            StringBuilder codeBuilder = new StringBuilder();
```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SettingServiceImpl.java`
#### Snippet
```java

            Optional<Setting> optional = Optional.ofNullable(SETTINGS.get(setting.getSettingKey()));
            if (optional.isPresent()) {
                optional.get().setSettingValue(value);
            }
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `timeout` may be 'static'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

    private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
    private final Long timeout = 3000L;
    private volatile boolean closed = false;
    private volatile boolean flushThreadAlive = false;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ApiDocConstant` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/ApiDocConstant.java`
#### Snippet
```java
package org.apache.streampark.console.base.domain;

public class ApiDocConstant {

    public static final String FLINK_APP_OP_TAG = "[Flink application] operations";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/Constant.java`
#### Snippet
```java
package org.apache.streampark.console.base.domain;

public class Constant {

    // token cache prefix
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StreamParkConsoleBootstrap` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/StreamParkConsoleBootstrap.java`
#### Snippet
```java
@SpringBootApplication
@EnableScheduling
public class StreamParkConsoleBootstrap {

    public static void main(String[] args) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java
 * The file utils.
 */
public class FileUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FreemarkerUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FreemarkerUtils.java`
#### Snippet
```java

@Slf4j
public class FreemarkerUtils  {
    private static final Configuration CONFIGURATION;

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Bridge` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/K8sFlinkTrackMonitorWrapper.java`
#### Snippet
```java
     * Type converter bridge
     */
    public static class Bridge {

        // covert Application to TrackId
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Bridge` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/FlinkAppState.java`
#### Snippet
```java
     * type conversion bridging
     */
    public static class Bridge {
        /**
         * covert from org.apache.streampark.flink.k8s.enums.FlinkJobState
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DorisDelimiterParser` has only 'static' members, and lacks a 'private' constructor
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/util/DorisDelimiterParser.java`
#### Snippet
```java
import java.io.StringWriter;

public class DorisDelimiterParser {

    private static final String HEX_STRING = "0123456789ABCDEF";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JWTUtil` has only 'static' members, and lacks a 'private' constructor
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java

@Slf4j
public class JWTUtil {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArgumentUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ArgumentUtils.java`
#### Snippet
```java
import java.util.Map;

public class ArgumentUtils {

    public static boolean needToUpdateArg(String argValue) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SparkUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkUtils.java`
#### Snippet
```java
import java.util.List;

public class SparkUtils {
    // Try to get application ID by match regex in class path or system property
    public static String probeAppId(String appIdRegex) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/Utils.java`
#### Snippet
```java
import java.util.zip.Deflater;

public class Utils {

    protected static ObjectMapper mapper = new ObjectMapper();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProcessUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcessUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ProcessUtils {
    private static final String SPARK_PROCESS_KEYWORD = "spark.yarn.app.container.log.dir";
    private static final String SPARK_CMDLINE_KEYWORD = "spark.";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
import java.lang.reflect.Method;

public class ReflectionUtils {
    private static final AgentLogger LOGGER = AgentLogger.getLogger(ReflectionUtils.class.getName());

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HelloWorldApplication` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/example/HelloWorldApplication.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicLong;

public class HelloWorldApplication {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/Constants.java`
#### Snippet
```java
package org.apache.streampark.plugin.profiling.profiler;

public class Constants {
    public static final long DEFAULT_METRIC_INTERVAL = 60000;

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProcFileUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java

// See http://man7.org/linux/man-pages/man5/proc.5.html for /proc file details
public class ProcFileUtils {
    private static final AgentLogger LOGGER = AgentLogger.getLogger(ProcFileUtils.class.getName());

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class StringUtils {
    private static final int KB_SIZE = 1024;
    private static final int MB_SIZE = 1024 * 1024;
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `getBytes` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/FileHeaderCheckInterceptor.java`
#### Snippet
```java
                String formKey = iterator.next();
                MultipartFile multipartFile = multipartRequest.getFile(formKey);
                byte[] file = multipartFile.getBytes();
                if (file.length > headerLength) {
                    StringBuilder sb = new StringBuilder();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
        ExecutionMode execMode = application.getExecutionModeEnum();
        if (ExecutionMode.YARN_APPLICATION.equals(execMode) || ExecutionMode.YARN_PER_JOB.equals(execMode)) {
            optional = jobsOverview.getJobs().size() > 1 ? jobsOverview.getJobs().stream().filter(a -> StringUtils.equals(application.getJobId(), a.getId())).findFirst() : jobsOverview.getJobs().stream().findFirst();
        } else {
            optional = jobsOverview.getJobs().stream().filter(x -> x.getId().equals(application.getJobId())).findFirst();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
            optional = jobsOverview.getJobs().size() > 1 ? jobsOverview.getJobs().stream().filter(a -> StringUtils.equals(application.getJobId(), a.getId())).findFirst() : jobsOverview.getJobs().stream().findFirst();
        } else {
            optional = jobsOverview.getJobs().stream().filter(x -> x.getId().equals(application.getJobId())).findFirst();
        }
        if (optional.isPresent()) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `classType` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
                InternalOption config = InternalConfigHolder.getConfig(key);
                AssertUtils.state(config != null);
                InternalConfigHolder.set(config, springEnv.getProperty(key, config.classType()));
            });

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `client.listFiles()` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
            File client = WebUtils.getAppClientDir();
            AssertUtils.checkArgument(
                client.exists() && client.listFiles().length > 0,
                client.getAbsolutePath().concat(" is not exists or empty directory ")
            );
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `client.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
            fsOperator.mkCleanDirs(appClient);

            for (File file : client.listFiles(fileFilter)) {
                log.info("load client:{} to {}", file.getName(), appClient);
                fsOperator.upload(file.getAbsolutePath(), appClient);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `plugins.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java

            File plugins = WebUtils.getAppPluginsDir();
            for (File file : plugins.listFiles(fileFilter)) {
                log.info("load plugin:{} to {}", file.getName(), appPlugins);
                fsOperator.upload(file.getAbsolutePath(), appPlugins);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `shims` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
            fsOperator.delete(appShims);

            for (File file : shims) {
                Matcher matcher = PATTERN_FLINK_SHIMS_JAR.matcher(file.getName());
                if (matcher.matches()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setStop` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
            }
            AssertUtils.state(preNode != null);
            preNode.setStop();
            preNode.setCount(count);
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `convertFlinkYamlAsMap` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
        AssertUtils.state(flinkEnv != null);
        int cpThreshold = Integer.parseInt(
            flinkEnv.convertFlinkYamlAsMap()
                .getOrDefault("state.checkpoints.num-retained", "5")
        );
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAppId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
        AssertUtils.state(backUp != null);
        try {
            FlinkTrackingTask.refreshTracking(backUp.getAppId(), () -> {
                // rollback config and sql
                effectiveService.saveOrUpdate(backUp.getAppId(), EffectiveType.CONFIG, backUp.getId());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getBuildState` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        Project project = getById(id);
        AssertUtils.state(project != null);
        BuildState buildState = BuildState.of(project.getBuildState());
        if (BuildState.SUCCESSFUL.equals(buildState)) {
            File appHome = project.getDistHome();
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
                File[] files = appHome.listFiles();
                if (CommonUtils.notEmpty(files)) {
                    for (File file: files) {
                        list.add(file.getName());
                    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTeamId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            Project project = getById(projectParam.getId());
            AssertUtils.state(project != null);
            AssertUtils.checkArgument(project.getTeamId().equals(projectParam.getTeamId()),
                "TeamId cannot be changed.");
            project.setName(projectParam.getName());
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            File[] files = unzipFile.listFiles(x -> "conf".equals(x.getName()));
            AssertUtils.state(files != null);
            for (File item : files) {
                eachFile(item, list, true);
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `delete` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        }
        try {
            project.delete();
            removeById(id);
            return true;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
                .data(new String(fileContent, StandardCharsets.UTF_8))
                .put("offset", endOffset)
                .put("readFinished", readFinished);
        } catch (IOException e) {
            String error = String.format("Read build log file(fileName=%s) caused an exception: ", logFile);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getDependency` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
            FlinkSql flinkSql = newFlinkSql == null ? effectiveFlinkSql : newFlinkSql;
            AssertUtils.state(flinkSql != null);
            app.setDependency(flinkSql.getDependency());
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
                .message(exception)
                .put("type", flinkSqlValidationResult.failedType().getValue())
                .put("start", flinkSqlValidationResult.lineStart())
                .put("end", flinkSqlValidationResult.lineEnd());

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
                .put("type", flinkSqlValidationResult.failedType().getValue())
                .put("start", flinkSqlValidationResult.lineStart())
                .put("end", flinkSqlValidationResult.lineEnd());

            if (flinkSqlValidationResult.errorLine() > 0) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
            restResponse.data(false).message(error);
        }
        if (pathPart.length() == 0 || pathPart.equals("/")) {
            error = "Cannot use the root directory for checkpoints.";
            restResponse.data(false).message(error);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `message` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
        User user = userService.getById(userId);
        if (Objects.isNull(user)) {
            return RestResponse.success().put("code", 0).message("user not available");
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getLastTeamId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
        User user = getById(userId);
        AssertUtils.checkArgument(user != null);
        if (!teamId.equals(user.getLastTeamId())) {
            return;
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setLastTeamId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
        User user = getById(userId);
        AssertUtils.checkArgument(user != null);
        user.setLastTeamId(teamId);
        this.baseMapper.updateById(user);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTotal` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java

        AssertUtils.state(resPage != null);
        if (resPage.getTotal() == 0) {
            resPage.setRecords(Collections.emptyList());
        }
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `getActiveAddress` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                String.format("The clusterId=%s cannot be find, maybe the clusterId is wrong or " +
                    "the cluster has been deleted. Please contact the Admin.", application.getFlinkClusterId()));
            URI activeAddress = cluster.getActiveAddress();
            properties.put(RestOptions.ADDRESS.key(), activeAddress.getHost());
            properties.put(RestOptions.PORT.key(), activeAddress.getPort());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getClusterId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                    String.format("The yarn session clusterId=%s cannot be find, maybe the clusterId is wrong or " +
                        "the cluster has been deleted. Please contact the Admin.", application.getFlinkClusterId()));
                properties.put(ConfigConst.KEY_YARN_APP_ID(), cluster.getClusterId());
            }
        } else if (ExecutionMode.isKubernetesMode(application.getExecutionModeEnum())) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFsOperator` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java

        //1) delete files that have been published to workspace
        application.getFsOperator().delete(application.getAppHome());

        //2) rollback the files to the workspace
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFlinkConfig` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                    String.format("The clusterId=%s cannot be find, maybe the clusterId is wrong or " +
                        "the cluster has been deleted. Please contact the Admin.", application.getFlinkClusterId()));
                Map<String, String> config = cluster.getFlinkConfig();
                if (!config.isEmpty()) {
                    savepointPath = config.get(CheckpointingOptions.SAVEPOINT_DIRECTORY.key());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getVersionId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        AssertUtils.state(application != null);

        FlinkEnv flinkEnv = flinkEnvService.getByIdOrDefault(application.getVersionId());
        if (flinkEnv == null) {
            throw new ApiAlertException("[StreamPark] can no found flink version");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getBuildResult` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        AssertUtils.state(buildPipeline != null);

        BuildResult buildResult = buildPipeline.getBuildResult();
        if (ExecutionMode.YARN_APPLICATION.equals(executionMode)) {
            buildResult = new ShadedBuildResponse(null, flinkUserJar, true);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `as` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            if (ExecutionMode.isKubernetesApplicationMode(application.getExecutionMode())) {
                AssertUtils.state(buildResult != null);
                DockerImageBuildResponse result = buildResult.as(DockerImageBuildResponse.class);
                String ingressTemplates = application.getIngressTemplate();
                String domainName = application.getDefaultModeIngress();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getActiveAddress` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                        "the cluster has been deleted. Please contact the Admin.",
                    application.getFlinkClusterId()));
            URI activeAddress = cluster.getActiveAddress();
            properties.put(RestOptions.ADDRESS.key(), activeAddress.getHost());
            properties.put(RestOptions.PORT.key(), activeAddress.getPort());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getClusterId` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
                    String.format("The yarn session clusterId=%s cannot be find, maybe the clusterId is wrong or " +
                        "the cluster has been deleted. Please contact the Admin.", application.getFlinkClusterId()));
                properties.put(ConfigConst.KEY_YARN_APP_ID(), cluster.getClusterId());
            }
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `decode` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            FlinkSql copySourceFlinkSql = flinkSqlService.getById(appParam.getSqlId());
            AssertUtils.state(copySourceFlinkSql != null);
            copySourceFlinkSql.decode();

            // get submit flink sql
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setState` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        Application application = getById(appParam.getId());
        AssertUtils.state(application != null);
        application.setState(FlinkAppState.STARTING.getValue());
        application.setOptionTime(new Date());
        updateById(application);
```

## RuleId[ruleID=TypeParameterHidesVisibleType]
### RuleId[ruleID=TypeParameterHidesVisibleType]
Type parameter `E` hides type parameter 'E'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
        @SuppressWarnings("hiding")
        class EnumerationIterator<E> implements Iterator<E> {
            private final Enumeration<E> enumeration;

```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
            return Maps.newHashMap();
        }
        return appBuildPipelines.stream().collect(Collectors.toMap(e -> e.getAppId(), e -> e.getPipelineStatus()));
    }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
            return Maps.newHashMap();
        }
        return appBuildPipelines.stream().collect(Collectors.toMap(e -> e.getAppId(), e -> e.getPipelineStatus()));
    }

```

## RuleId[ruleID=RedundantComparatorComparing]
### RuleId[ruleID=RedundantComparatorComparing]
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

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

            // char sequence
            if ((obj instanceof CharSequence) && "".equals(obj.toString().trim())) {
                return true;
            }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/mybatis/pager/MybatisPager.java`
#### Snippet
```java

@SuppressWarnings("unchecked")
public final class MybatisPager<T> {

    public Page<T> getDefaultPage(RestRequest request) {
```

### RuleId[ruleID=RedundantSuppression]
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

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
        if (memoryMXBean != null) {
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            heapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            heapMemoryCommitted = new Double(memoryUsage.getCommitted());
            heapMemoryMax = new Double(memoryUsage.getMax());
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            heapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            heapMemoryCommitted = new Double(memoryUsage.getCommitted());
            heapMemoryMax = new Double(memoryUsage.getMax());

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
            heapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            heapMemoryCommitted = new Double(memoryUsage.getCommitted());
            heapMemoryMax = new Double(memoryUsage.getMax());

            memoryUsage = memoryMXBean.getNonHeapMemoryUsage();
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java

            memoryUsage = memoryMXBean.getNonHeapMemoryUsage();
            nonHeapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            nonHeapMemoryCommitted = new Double(memoryUsage.getCommitted());
            nonHeapMemoryMax = new Double(memoryUsage.getMax());
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
            memoryUsage = memoryMXBean.getNonHeapMemoryUsage();
            nonHeapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            nonHeapMemoryCommitted = new Double(memoryUsage.getCommitted());
            nonHeapMemoryMax = new Double(memoryUsage.getMax());
        }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
            nonHeapMemoryTotalUsed = new Double(memoryUsage.getUsed());
            nonHeapMemoryCommitted = new Double(memoryUsage.getCommitted());
            nonHeapMemoryMax = new Double(memoryUsage.getMax());
        }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
                Map<String, Object> gcMap = new HashMap<>();
                gcMap.put("name", gcMXBean.getName());
                gcMap.put("collectionCount", new Long(gcMXBean.getCollectionCount()));
                gcMap.put("collectionTime", new Long(gcMXBean.getCollectionTime()));

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
                gcMap.put("name", gcMXBean.getName());
                gcMap.put("collectionCount", new Long(gcMXBean.getCollectionCount()));
                gcMap.put("collectionTime", new Long(gcMXBean.getCollectionTime()));

                gcMetrics.add(gcMap);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java

                bufferPoolMap.put("name", pool.getName());
                bufferPoolMap.put("count", new Long(pool.getCount()));
                bufferPoolMap.put("memoryUsed", new Long(pool.getMemoryUsed()));
                bufferPoolMap.put("totalCapacity", new Long(pool.getTotalCapacity()));
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
                bufferPoolMap.put("name", pool.getName());
                bufferPoolMap.put("count", new Long(pool.getCount()));
                bufferPoolMap.put("memoryUsed", new Long(pool.getMemoryUsed()));
                bufferPoolMap.put("totalCapacity", new Long(pool.getTotalCapacity()));

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
                bufferPoolMap.put("count", new Long(pool.getCount()));
                bufferPoolMap.put("memoryUsed", new Long(pool.getMemoryUsed()));
                bufferPoolMap.put("totalCapacity", new Long(pool.getTotalCapacity()));

                bufferPoolsMetrics.add(bufferPoolMap);
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ShutdownHookRunner.java`
#### Snippet
```java
        // seems not executed.
        String log = System.currentTimeMillis() + " " + msg;
        System.out.println(log);
        System.err.println(log);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ShutdownHookRunner.java`
#### Snippet
```java
        String log = System.currentTimeMillis() + " " + msg;
        System.out.println(log);
        System.err.println(log);
    }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
    public void warn(String msg) {
        try {
            System.out.println("[WARNING] " + System.currentTimeMillis() + " " + prefix + msg);

            if (AgentLogger.errorLogReporter != null) {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
        // seems not executed.
        String log = System.currentTimeMillis() + " " + prefix + msg;
        System.out.println(log);
        System.err.println(log);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
        String log = System.currentTimeMillis() + " " + prefix + msg;
        System.out.println(log);
        System.err.println(log);
    }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java

    public void info(String msg) {
        System.out.println(System.currentTimeMillis() + " " + prefix + msg);
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
    public void warn(String msg, Throwable ex) {
        try {
            System.out.println(
                "[WARNING] "
                    + System.currentTimeMillis()
```

## RuleId[ruleID=ImplicitArrayToString]
### RuleId[ruleID=ImplicitArrayToString]
Implicit call to 'toString()' on array returned by call to `data.getDataRows()`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkFunction.java`
#### Snippet
```java
            DorisSinkRowDataWithMeta data = (DorisSinkRowDataWithMeta) value;
            if (Strings.isNullOrEmpty(data.getDatabase()) || Strings.isNullOrEmpty(data.getTable()) || null == data.getDataRows()) {
                LOGGER.warn(String.format(" row data not fullfilled. {database: %s, table: %s, dataRows: %s}", data.getDatabase(), data.getTable(), data.getDataRows()));
                return;
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/config/P6spySqlFormatConfig.java`
#### Snippet
```java
                DateUtils.formatFullTime(LocalDateTime.now()),
                elapsed,
                sql.replaceAll("\\s+", StringUtils.SPACE)
            );
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/MetricsTask.java`
#### Snippet
```java
        File temp = new File(tempPath);
        Arrays.stream(Objects.requireNonNull(temp.listFiles()))
            .filter(x -> x.getName().matches(FLAME_GRAPH_FILE_REGEXP))
            .forEach(File::delete);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
                String refName = ref.getName();
                if (refName.startsWith("refs/heads/")) {
                    String branchName = refName.replace("refs/heads/", "");
                    branchList.add(branchName);
                }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/metrics/flink/CheckPoints.java`
#### Snippet
```java

        public String getPath() {
            return this.getExternalPath().replaceFirst("^hdfs:/[^/]", "hdfs:///");
        }
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlameGraphServiceImpl.java`
#### Snippet
```java
            );
            String jsonPath = new File(WebUtils.getAppTempDir(), jsonName).getAbsolutePath();
            String foldedPath = jsonPath.replace(".json", ".folded");
            String svgPath = jsonPath.replace(".json", ".svg");
            File flameGraphPath = WebUtils.getAppDir("bin/flame-graph");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlameGraphServiceImpl.java`
#### Snippet
```java
            String jsonPath = new File(WebUtils.getAppTempDir(), jsonName).getAbsolutePath();
            String foldedPath = jsonPath.replace(".json", ".folded");
            String svgPath = jsonPath.replace(".json", ".svg");
            File flameGraphPath = WebUtils.getAppDir("bin/flame-graph");

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/bean/DorisSinkBufferEntry.java`
#### Snippet
```java

    public String createLabel() {
        return String.format("%s_%s_%s", labelPrefix, System.currentTimeMillis(), UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines) {
                result.add(line.split("\\s+"));
            }
            return result;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            }

            str = str.replace(",", "");

            if (!NumberUtils.isNumber(str)) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
        }

        String normalizedClassName = className.replaceAll("/", ".");
        LOGGER.debug("Checking class for transform: " + normalizedClassName);

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.crypto.spec` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/EncryptUtils.java`
#### Snippet
```java
            arrB[i] = arrBTmp[i];
        }
        return new javax.crypto.spec.SecretKeySpec(arrB, "DES");
    }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary and can be removed
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
        fileAppender.start();

        ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Thread.currentThread().getName());
        logger.addAppender(fileAppender);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ch.qos.logback.classic` is unnecessary and can be removed
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java

        ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Thread.currentThread().getName());
        logger.addAppender(fileAppender);
        logger.setLevel(Level.INFO);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.util` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkEnv.java`
#### Snippet
```java
    private transient FlinkVersion flinkVersion;

    private transient String streamParkScalaVersion = scala.util.Properties.versionNumberString();

    public void doSetFlinkConf() throws ApiDetailException {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
        }

        java.text.DecimalFormat df = new java.text.DecimalFormat("#." + prefix);
        try {
            return Double.parseDouble(df.format(number));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary, and can be replaced with an import
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
        }

        java.text.DecimalFormat df = new java.text.DecimalFormat("#." + prefix);
        try {
            return Double.parseDouble(df.format(number));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `streampark-common/src/main/scala/org/apache/streampark/common/domain/FlinkMemorySize.java`
#### Snippet
```java
 * will be interpreted as bytes.
 */
public class FlinkMemorySize implements java.io.Serializable, Comparable<FlinkMemorySize> {

    private static final long serialVersionUID = 1L;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkConsoleAspect.java`
#### Snippet
```java
                return joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return null;
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ProfilerRunner.java`
#### Snippet
```java
                LOGGER.warn("Failed to run profile: " + profiler, e);
            } else {
                e.printStackTrace();
            }
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ShutdownHookRunner.java`
#### Snippet
```java
            } catch (Throwable ex) {
                logShutdownMessage("Failed to close object " + closeable);
                ex.printStackTrace();
            }
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
            }
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/AgentLogger.java`
#### Snippet
```java
            }
        } catch (Throwable executionException) {
            executionException.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/MethodProfilerStaticProxy.java`
#### Snippet
```java
            collectorSingleton.collectLongMetric(className, methodName, "duration", metricValue);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/MethodProfilerStaticProxy.java`
#### Snippet
```java
            argumentCollectorSingleton.collectMetric(className, methodName, argument);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
                    + argumentsForProfile);
        } catch (Throwable ex) {
            ex.printStackTrace();
            LOGGER.warn("Failed to transform class method: " + method.getLongName(), ex);
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java

        } catch (Throwable ex) {
            ex.printStackTrace();
            LOGGER.warn("Failed to transform class: " + normalizedClassName, ex);
            byteCode = null;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractLogFileTask()` of an abstract class should not be declared 'public'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/AbstractLogFileTask.java`
#### Snippet
```java
    private PatternLayoutEncoder ple;

    public AbstractLogFileTask(String logPath, boolean isOverwrite) {
        this.logPath = Paths.get(logPath);
        this.isOverwrite = isOverwrite;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CompatibleKubernetesWatcher()` of an abstract class should not be declared 'public'
in `streampark-flink/streampark-flink-kubernetes/src/main/java/org/apache/flink/kubernetes/kubeclient/resources/CompatibleKubernetesWatcher.java`
#### Snippet
```java
    extends AbstractKubernetesWatcher<T, K> {

    public CompatibleKubernetesWatcher() {
        super(new SilentWatchCallbackHandler<>());
    }
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
Caught exception `e` is immediately rethrown
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
                        // copy backup files to a valid dir
                        fsOperator.copyDir(backParam.getPath(), application.getAppHome());
                    } catch (Exception e) {
                        throw e;
                    }
```

### RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
Caught exception `e` is immediately rethrown
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
                            .set(Application::getLaunch, LaunchState.NEED_RESTART.get())
                        );
                    } catch (Exception e) {
                        throw e;
                    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

    public static String toPercent(Number number, int offset) {
        offset += 2;
        Double num = fixedNum(number, offset);
        return (num * 100) + "%";
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
        while (offset > 0) {
            prefix += "0";
            offset -= 1;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `word`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
        public List<String> getComplicate(String word) {

            word = word.toLowerCase();
            SqlCompleteFstTree.Single searchFromHeadPassLength = new Single();
            SqlCompleteFstTree.Single searchFromReversePassLength = new Single();
```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expireTime`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java

        if (StringUtils.isEmpty(expireTime)) {
            expireTime = AccessToken.DEFAULT_EXPIRE_TIME;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `password`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/PassportController.java`
#### Snippet
```java
        }

        password = ShaHashUtils.encrypt(user.getSalt(), password);

        this.userService.updateLoginTime(username);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `password`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
        User user = new User();
        String salt = ShaHashUtils.getRandomSalt();
        password = ShaHashUtils.encrypt(salt, password);
        user.setSalt(salt);
        user.setPassword(password);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `argument`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/MethodArgumentCollector.java`
#### Snippet
```java
    public void collectMetric(String className, String methodName, String argument) {
        if (argument == null) {
            argument = "";
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `argument`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/MethodArgumentCollector.java`
#### Snippet
```java

        if (argument.length() > Constants.MAX_STRING_LENGTH) {
            argument = argument.substring(0, Constants.MAX_STRING_LENGTH);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
        }

        str = str.toLowerCase();
        int scale = 1;

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
        try {
            if (str.endsWith("kb")) {
                str = str.substring(0, str.length() - 2).trim();
                scale = KB_SIZE;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/Arguments.java`
#### Snippet
```java
        }

        args = args.trim();
        if (args.isEmpty()) {
            return new Arguments(new HashMap<>());
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            }
            if (str.endsWith("k")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = KB_SIZE;
            } else if (str.endsWith("mb")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = KB_SIZE;
            } else if (str.endsWith("mb")) {
                str = str.substring(0, str.length() - 2).trim();
                scale = MB_SIZE;
            } else if (str.endsWith("m")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = MB_SIZE;
            } else if (str.endsWith("m")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = MB_SIZE;
            } else if (str.endsWith("gb")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = MB_SIZE;
            } else if (str.endsWith("gb")) {
                str = str.substring(0, str.length() - 2).trim();
                scale = GB_SIZE;
            } else if (str.endsWith("g")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = GB_SIZE;
            } else if (str.endsWith("g")) {
                str = str.substring(0, str.length() - 1).trim();
                scale = GB_SIZE;
            } else if (str.endsWith("bytes")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
                scale = GB_SIZE;
            } else if (str.endsWith("bytes")) {
                str = str.substring(0, str.length() - "bytes".length()).trim();
                scale = 1;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            }

            str = str.replace(",", "");

            if (!NumberUtils.isNumber(str)) {
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
                    result.add(map);
                } catch (Throwable ex) {
                    continue;
                }
            }
```

### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            if (!valueStarted) {
                if (Character.isWhitespace(ch)) {
                    continue;
                } else if (ch == '\'' || ch == '"') {
                    valueStarted = true;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/enums/GitAuthorizedError.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkConsoleAspect.java`
#### Snippet
```java
                throwable.printStackTrace();
            }
            return null;
        });
    }
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlameGraph.java`
#### Snippet
```java
            return DeflaterUtils.unzipString(this.content);
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkCluster.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/ApplicationConfig.java`
#### Snippet
```java
                break;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
        String result = YarnUtils.restRequest(url);
        if (null == result) {
            return null;
        }
        return JacksonUtils.read(result, clazz);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
        String result = HttpClientUtils.httpGetRequest(url, RequestConfig.custom().setConnectTimeout(5000).build());
        if (null == result) {
            return null;
        }
        return JacksonUtils.read(result, clazz);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
            return flinkCluster;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlameGraphServiceImpl.java`
#### Snippet
```java
            return svgPath;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/CommonServiceImpl.java`
#### Snippet
```java
            return user.getUserId();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkSqlServiceImpl.java`
#### Snippet
```java
            return flinkSql;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/LoggerServiceImpl.java`
#### Snippet
```java
            } catch (Exception ex) {
                log.error("Generate log path exception:{}", ex.getMessage());
                return null;
            }
        }).thenApply(path -> logClient.rollViewLog(String.valueOf(path), skipLineNum, limit));
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SettingServiceImpl.java`
#### Snippet
```java
            log.warn("Fault Alert Email is not set.");
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
                effectiveService.saveOrUpdate(backUp.getAppId(), EffectiveType.CONFIG, backUp.getId());
                effectiveService.saveOrUpdate(backUp.getAppId(), EffectiveType.FLINKSQL, backUp.getSqlId());
                return null;
            });
        } catch (Exception e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
                        throw e;
                    }
                    return null;
                });
            } catch (Exception e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            log.info(e.getMessage());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/MetricsController.java`
#### Snippet
```java
                .body(new FileSystemResource(file));
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
        String ldapEmail = ldapService.ldapLogin(username, password);
        if (ldapEmail == null) {
            return null;
        }
        //check if user exist
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/ldap/LdapService.java`
#### Snippet
```java
            return null;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
        } catch (JWTDecodeException e) {
            log.info("error?{}", e.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
        } catch (Exception e) {
            log.info("error?{}", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
        } catch (JWTDecodeException e) {
            log.info("error?{}", e.getMessage());
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            FlinkTrackingTask.refreshTracking(application.getId(), () -> {
                baseMapper.update(null, updateWrapper);
                return null;
            });
        } catch (Exception e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/ArgumentUtils.java`
#### Snippet
```java
        List<String> list = parsedArgs.get(argName);
        if (list == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkUtils.java`
#### Snippet
```java
            Object result = ReflectionUtils.executeStaticMethods(className, "get.conf.getAppId");
            if (result == null) {
                return null;
            }
            return result.toString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkUtils.java`
#### Snippet
```java
            return result.toString();
        } catch (Throwable e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkUtils.java`
#### Snippet
```java
        String cmd = System.getProperty("sun.java.command");
        if (cmd == null || cmd.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/SparkUtils.java`
#### Snippet
```java
            return Constants.DRIVER_ROLE;
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcessUtils.java`
#### Snippet
```java
        List<String> jvmArgs = runtimeMXBean.getInputArguments();
        if (jvmArgs == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
            Method method = clazz.getMethod(entry);
            if (method == null) {
                return null;
            }
            result = method.invoke(clazzObject);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
            result = method.invoke(clazzObject);
            if (result == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
            File file = new File(PROC_SELF_CMDLINE_FILE);
            if (!file.exists() || file.isDirectory() || !file.canRead()) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
        } catch (Throwable ex) {
            LOGGER.warn("Failed to read file " + PROC_SELF_CMDLINE_FILE, ex);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
    public static Long getBytesValue(Map<String, String> data, String key) {
        if (data == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java

        if (key == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ProcFileUtils.java`
#### Snippet
```java
        String value = data.get(key);
        if (value == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
    public static String getArgumentValue(String str, String argument) {
        if (str == null || str.isEmpty() || argument == null || argument.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java

        if (values.length == 0) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
    public static Long getBytesValueOrNull(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java

            if (!NumberUtils.isNumber(str)) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/StringUtils.java`
#### Snippet
```java
            return (long) (doubleValue * scale);
        } catch (Throwable ex) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
            if (className == null || className.isEmpty()) {
                LOGGER.debug("Hit null or empty class name");
                return null;
            }
            return transformImpl(loader, className, classfileBuffer);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
    private byte[] transformImpl(ClassLoader loader, String className, byte[] classfileBuffer) {
        if (durationProfilingFilter.isEmpty() && argumentFilterProfilingFilter.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/transformer/JavaAgentFileTransformer.java`
#### Snippet
```java
        if (!durationProfilingFilter.matchClass(normalizedClassName)
            && !argumentFilterProfilingFilter.matchClass(normalizedClassName)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/profiler/CpuAndMemoryProfiler.java`
#### Snippet
```java
        } catch (Throwable ex) {
            LOGGER.warn("Failed to get CPU MBean attributes", ex);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/Semantic.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkSqlValidationFailedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/FlinkK8sRestExposedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ResolveOrder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `streampark-common/src/main/scala/org/apache/streampark/common/enums/ExecutionMode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `jobsOverview` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkTrackingTask.java`
#### Snippet
```java
                reqURL = String.format(format, application.getJobManagerUrl());
            }
            JobsOverview jobsOverview = yarnRestRequest(reqURL, JobsOverview.class);
            return jobsOverview;
        } else if (ExecutionMode.REMOTE.equals(execMode) || ExecutionMode.YARN_SESSION.equals(execMode)) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `constructor` is redundant
in `streampark-plugin/streampark-jvm-profiler/src/main/java/org/apache/streampark/plugin/profiling/util/ReflectionUtils.java`
#### Snippet
```java
        try {
            Class<T> concretelass = (Class<T>) clazz;
            Constructor<T> constructor = concretelass.getConstructor();
            return constructor;
        } catch (Throwable e) {
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
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

