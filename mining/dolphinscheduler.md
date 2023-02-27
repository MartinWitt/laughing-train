# dolphinscheduler 
 
# Bad smells
I found 1550 bad smells with 155 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 258 | false |
| BoundedWildcard | 145 | false |
| DynamicRegexReplaceableByCompiledPattern | 108 | false |
| AssignmentToMethodParameter | 94 | false |
| DefaultAnnotationParam | 86 | false |
| DataFlowIssue | 80 | false |
| SizeReplaceableByIsEmpty | 51 | true |
| UnusedAssignment | 49 | false |
| UtilityClassWithoutPrivateConstructor | 48 | true |
| Lombok | 41 | false |
| MismatchedJavadocCode | 41 | false |
| RegExpRedundantEscape | 33 | false |
| RedundantFieldInitialization | 33 | false |
| MissortedModifiers | 25 | false |
| NestedAssignment | 23 | false |
| UnnecessarySemicolon | 18 | false |
| DuplicateBranchesInSwitch | 17 | false |
| RegExpSingleCharAlternation | 17 | false |
| UnnecessaryLocalVariable | 17 | true |
| RedundantMethodOverride | 15 | false |
| ConstantValue | 15 | false |
| NonSerializableFieldInSerializableClass | 15 | false |
| BusyWait | 15 | false |
| NumberEquality | 13 | false |
| EmptyMethod | 13 | false |
| ZeroLengthArrayInitialization | 13 | false |
| UnstableApiUsage | 13 | false |
| UnnecessaryFullyQualifiedName | 12 | false |
| RedundantModifiersValueLombok | 12 | false |
| SimplifyStreamApiCallChains | 11 | false |
| UnnecessaryModifier | 10 | true |
| CodeBlock2Expr | 10 | true |
| MismatchedCollectionQueryUpdate | 9 | false |
| ClassNameSameAsAncestorName | 8 | false |
| InstanceofCatchParameter | 8 | false |
| FieldMayBeStatic | 8 | false |
| NonProtectedConstructorInAbstractClass | 8 | true |
| WrapperTypeMayBePrimitive | 7 | false |
| IgnoreResultOfCall | 7 | false |
| UseOfPropertiesAsHashtable | 7 | false |
| WhileCanBeForeach | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| ObsoleteCollection | 5 | false |
| KeySetIterationMayUseEntrySet | 5 | false |
| StringBufferReplaceableByString | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| Convert2MethodRef | 5 | false |
| StringEqualsEmptyString | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| ExceptionNameDoesntEndWithException | 4 | false |
| CallToStringConcatCanBeReplacedByOperator | 4 | false |
| OptionalContainsCollection | 4 | false |
| AssignmentToLambdaParameter | 4 | false |
| EmptyTryBlock | 3 | false |
| TrivialStringConcatenation | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| StringBufferReplaceableByStringBuilder | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| RedundantSuppression | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| CommentedOutCode | 2 | false |
| DuplicateExpressions | 2 | false |
| FinalStaticMethod | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| EqualsAndHashcode | 2 | false |
| NonFinalFieldOfException | 2 | false |
| DoubleBraceInitialization | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| UtilityClassWithPublicConstructor | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| RedundantClassCall | 1 | false |
| EmptyStatementBody | 1 | false |
| RegExpSimplifiable | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| IOResource | 1 | false |
| OptionalIsPresent | 1 | false |
| RedundantCollectionOperation | 1 | false |
| UnnecessaryBoxing | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| Anonymous2MethodRef | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| PointlessBooleanExpression | 1 | true |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Integer\[resourceIdsSet.size()\]'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java

                if (CollectionUtils.isNotEmpty(resourceIdsSet)) {
                    Integer[] resourceIds = resourceIdsSet.toArray(new Integer[resourceIdsSet.size()]);

                    List<Resource> resources = processService.listResourceByIds(resourceIds);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Integer\[map.size()\]'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            return;
        }
        List<UdfFunc> udfFuncList = processService.queryUdfFunListByIds(map.keySet().toArray(new Integer[map.size()]));

        udfFuncList.forEach(udfFunc -> {
```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (nodeType) { case MASTER: MasterHeartBeat masterHeartBeat...` statement on enum type 'org.apache.dolphinscheduler.common.enums.NodeType' misses case 'DEAD_SERVER'
in `dolphinscheduler-registry/dolphinscheduler-registry-api/src/main/java/org/apache/dolphinscheduler/registry/api/RegistryClient.java`
#### Snippet
```java
            }
            Server server = new Server();
            switch (nodeType) {
                case MASTER:
                    MasterHeartBeat masterHeartBeat = JSONUtils.parseObject(heartBeatJson, MasterHeartBeat.class);
                    server.setCreateTime(new Date(masterHeartBeat.getStartupTime()));
                    server.setLastHeartbeatTime(new Date(masterHeartBeat.getReportTime()));
                    server.setId(masterHeartBeat.getProcessId());
                    break;
                case WORKER:
                    WorkerHeartBeat workerHeartBeat = JSONUtils.parseObject(heartBeatJson, WorkerHeartBeat.class);
                    server.setCreateTime(new Date(workerHeartBeat.getStartupTime()));
                    server.setLastHeartbeatTime(new Date(workerHeartBeat.getReportTime()));
                    server.setId(workerHeartBeat.getProcessId());
                    break;
            }

            server.setResInfo(heartBeatJson);
```

### EnumSwitchStatementWhichMissesCases
`switch (jobStatus) { case FAILED: setExitStatusCode(EXIT_CODE_FA...` statement on enum type 'org.apache.dolphinscheduler.plugin.task.linkis.LinkisJobStatus' misses cases: 'UNSUBMITTED', 'SUBMITTING', 'INITED', ...
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
            String status = findStatus(commandExecuteResult.getResultString());
            LinkisJobStatus jobStatus = LinkisJobStatus.convertFromJobStatusString(status);
            switch (jobStatus) {
                case FAILED:
                    setExitStatusCode(EXIT_CODE_FAILURE);
                    break;
                case SUCCEED:
                    setExitStatusCode(EXIT_CODE_SUCCESS);
                    break;
                case CANCELLED:
                    setExitStatusCode(EXIT_CODE_KILL);
                    break;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UdfFuncServiceImpl.java`
#### Snippet
```java
        }

        Boolean existResource = false;
        try {
            existResource = storageOperate.exists(fullName);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UdfFuncServiceImpl.java`
#### Snippet
```java
        }

        Boolean doesResExist = false;
        try {
            doesResExist = storageOperate.exists(fullName);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/DsErrorController.java`
#### Snippet
```java

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
     */
    private boolean checkResourceExists(String fullName) {
        Boolean existResource = false;
        try {
            existResource = storageOperate.exists(fullName);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java
        ExecutionContext executionContext = new ExecutionContext(dispatchCommand.convert2Command(), ExecutorType.WORKER,
                taskExecutionContext.getWorkerGroup(), taskInstance);
        Boolean dispatchSuccess = false;
        try {
            dispatcher.dispatch(executionContext);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/k8s/impl/K8sTaskExecutor.java`
#### Snippet
```java
        String namespaceName = k8STaskMainParameters.getNamespaceName();
        Map<String, String> otherParams = k8STaskMainParameters.getParamsMap();
        Double podMem = k8STaskMainParameters.getMinMemorySpace();
        Double podCpu = k8STaskMainParameters.getMinCpuCores();
        Double limitPodMem = podMem * 2;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                }

                Integer res = 0;
                switch (result.get(i).charAt(0)) {
                    case P:
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/ProcessInstanceDao.java`
#### Snippet
```java
     * @param processInstance processInstance
     */
    public int upsertProcessInstance(ProcessInstance processInstance);

    void deleteByIds(List<Integer> needToDeleteWorkflowInstanceIds);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/ProcessInstanceDao.java`
#### Snippet
```java
public interface ProcessInstanceDao {

    public int insertProcessInstance(ProcessInstance processInstance);

    public int updateProcessInstance(ProcessInstance processInstance);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/ProcessInstanceDao.java`
#### Snippet
```java
    public int insertProcessInstance(ProcessInstance processInstance);

    public int updateProcessInstance(ProcessInstance processInstance);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessService.java`
#### Snippet
```java
    ProcessInstance loadNextProcess4Serial(long code, int state, int id);

    public String findConfigYamlByName(String clusterName);

    void forceProcessInstanceSuccessByTaskInstanceId(Integer taskInstanceId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/TaskCallBack.java`
#### Snippet
```java
    public void updateRemoteApplicationInfo(int taskInstanceId, ApplicationInfo applicationInfo);

    public void updateTaskInstanceInfo(int taskInstanceId);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/TaskCallBack.java`
#### Snippet
```java
public interface TaskCallBack {

    public void updateRemoteApplicationInfo(int taskInstanceId, ApplicationInfo applicationInfo);

    public void updateTaskInstanceInfo(int taskInstanceId);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/stream/StreamTask.java`
#### Snippet
```java
public interface StreamTask {

    public void savePoint() throws Exception;
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
        }

        private ExecResult(int value) {
            this.value = value;
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/flink/SeatunnelFlinkParameters.java`
#### Snippet
```java
    private String others;

    public static enum RunModeEnum {

        RUN("--run-mode run"),
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/spark/SeatunnelSparkParameters.java`
#### Snippet
```java
    }

    public static enum MasterTypeEnum {

        YARN("yarn"),
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 - calcMinutes(addMinuteExpr)` can be replaced with '- calcMinutes(addMinuteExpr)'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
            if (Character.isDigit(expression.charAt(index + 1))) {
                String addMinuteExpr = expression.substring(index + 1);
                Date targetDate = addMinutes(date, 0 - calcMinutes(addMinuteExpr));
                String dateFormat = expression.substring(0, index);

```

## RuleId[ruleID=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/MysqlRegistry.java`
#### Snippet
```java
        log.info("Closing Mysql Registry...");
        // remove the current Ephemeral node, if can connect to mysql
        try (
                EphemeralDateManager closed1 = ephemeralDateManager;
                SubscribeDataManager close2 = subscribeDataManager;
```

### EmptyTryBlock
Empty `try` block
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManager.java`
#### Snippet
```java

    public void removeCache(String cacheKey) {
        try (KubernetesClient ignored = cacheClientMap.remove(cacheKey)) {
        }
    }
```

### EmptyTryBlock
Empty `try` block
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/client/CommonDataSourceClient.java`
#### Snippet
```java
    public void close() {
        log.info("do close dataSource {}.", baseConnectionParam.getDatabase());
        try (HikariDataSource closedDatasource = dataSource) {
            // only close the resource
        }
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/python/PythonGateway.java`
#### Snippet
```java
            throw new IllegalArgumentException(msg);
        }
        EnvironmentDto environmentDto = EnvironmentDto.class.cast(result.get("data"));
        return environmentDto.getCode();
    }
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
                    FileInputStream fileInputStream = new FileInputStream(pathName);
                    CheckedInputStream checkedInputStream = new CheckedInputStream(fileInputStream, crc32);) {
                while (checkedInputStream.read() != -1) {
                }
            } catch (IOException e) {
```

## RuleId[ruleID=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/AccessLogAspect.java`
#### Snippet
```java
    private static final String TRACE_ID = "traceId";

    public static final String sensitiveDataRegEx = "(password=[\'\"]+)(\\S+)([\'\"]+)";

    private static final Pattern sensitiveDataPattern = Pattern.compile(sensitiveDataRegEx, Pattern.CASE_INSENSITIVE);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/AccessLogAspect.java`
#### Snippet
```java
    private static final String TRACE_ID = "traceId";

    public static final String sensitiveDataRegEx = "(password=[\'\"]+)(\\S+)([\'\"]+)";

    private static final Pattern sensitiveDataPattern = Pattern.compile(sensitiveDataRegEx, Pattern.CASE_INSENSITIVE);
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
            Set<String> postNodeList;
            Iterator<Map.Entry<String, List<TreeViewDto>>> iter = runningNodeMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, List<TreeViewDto>> en = iter.next();
                String nodeCode = en.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/expand/CuringGlobalParams.java`
#### Snippet
```java
        }
        Iterator<Map.Entry<String, Property>> iter = globalParams.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Property> en = iter.next();
            Property property = en.getValue();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        Iterator<Entry<String, Property>> iter = paramsMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Property> en = iter.next();
            map.put(en.getKey(), en.getValue().getValue());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParamUtils.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        Iterator<Map.Entry<String, Property>> iter = paramsMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Property> en = iter.next();
            map.put(en.getKey(), en.getValue().getValue());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParamUtils.java`
#### Snippet
```java
        if (definedParams != null) {
            Iterator<Map.Entry<String, String>> iter = definedParams.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> en = iter.next();
                Property property = new Property(en.getKey(), Direct.IN, DataType.VARCHAR, en.getValue());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        Iterator<Map.Entry<String, Property>> iter = paramsMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Property> en = iter.next();
            map.put(en.getKey(), en.getValue().getValue());
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BeanContext.applicationContext` from instance context
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/BeanContext.java`
#### Snippet
```java
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanContext.applicationContext = applicationContext;
    }
}
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `remoteLogService` from instance context
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/log/remote/RemoteLogUtils.java`
#### Snippet
```java
    @PostConstruct
    private void init() {
        remoteLogService = autowiredRemoteLogService;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `SpringApplicationContext.applicationContext` from instance context
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/bean/SpringApplicationContext.java`
#### Snippet
```java
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContext.applicationContext = applicationContext;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `hdfsProperties` from instance context
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public HdfsStorageOperator(HdfsStorageProperties hdfsStorageProperties) {
        // Overwrite config from passing hdfsStorageProperties
        hdfsProperties = hdfsStorageProperties;
        init();
        initHdfsPath();
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UiPluginServiceImpl.java`
#### Snippet
```java
            return result;
        }
        // String params=pluginDefine.getPluginParams();
        // pluginDefine.setPluginParams(parseParams(params));
        putMsg(result, Status.SUCCESS);
```

### CommentedOutCode
Commented out code (8 lines)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/BaseServiceImpl.java`
#### Snippet
```java
     * @throws IOException if hdfs operation exception
     */
    // @Override
    // public void createTenantDirIfNotExists(String tenantCode) throws IOException {
    // String resourcePath = HadoopUtils.getHdfsResDir(tenantCode);
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/TaskCacheUtils.java`
#### Snippet
```java
     */
    public static List<String> getScriptVarInSet(TaskInstance taskInstance) {
        Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(taskInstance.getTaskParams());

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCode = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String absolutePath = System.getProperty("user.dir");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java
public class ParameterUtils {

    private static final Pattern DATE_PARSE_PATTERN = Pattern.compile("\\$\\[([^\\$\\]]+)]");
    private static final Pattern DATE_START_PATTERN = Pattern.compile("^[0-9]");

```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
public class ParameterUtils {

    private static final Pattern DATE_PARSE_PATTERN = Pattern.compile("\\$\\[([^\\$\\]]+)]");

    private static final Pattern DATE_START_PATTERN = Pattern.compile("^[0-9]");
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");

    private static final Set<String> POSSIBLE_MALICIOUS_KEYS = Sets.newHashSet("allowLoadLocalInfile");
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");

    private static final Set<String> POSSIBLE_MALICIOUS_KEYS = Sets.newHashSet("allowLoadLocalInfile");
```

### RegExpRedundantEscape
Redundant character escape `\\@` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");

    private static final Set<String> POSSIBLE_MALICIOUS_KEYS = Sets.newHashSet("allowLoadLocalInfile");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");

    private static final Set<String> POSSIBLE_MALICIOUS_KEYS = Sets.newHashSet("allowLoadLocalInfile");
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
public abstract class AbstractDataSourceProcessor implements DataSourceProcessor {

    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
public abstract class AbstractDataSourceProcessor implements DataSourceProcessor {

    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\,` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
public abstract class AbstractDataSourceProcessor implements DataSourceProcessor {

    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\,` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV4_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\,]+$");

    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/datasource/AbstractDataSourceProcessor.java`
#### Snippet
```java
    private static final Pattern IPV6_PATTERN = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.\\:\\[\\]\\,]+$");

    private static final Pattern DATABASE_PATTER = Pattern.compile("^[a-zA-Z0-9\\_\\-\\.]+$");

    private static final Pattern PARAMS_PATTER = Pattern.compile("^[a-zA-Z0-9\\-\\_\\/\\@\\.]+$");
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sManager.java`
#### Snippet
```java
     * cache k8s client
     */
    private static Map<Long, KubernetesClient> clientMap = new Hashtable<>();

    @Autowired
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
     */
    private static Integer calculate(List<String> result) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < result.size(); i++) {
            if (Character.isDigit(result.get(i).charAt(0))) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
     */
    private static Integer calculate(List<String> result) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < result.size(); i++) {
            if (Character.isDigit(result.get(i).charAt(0))) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
    private static List<String> convert2SuffixList(List<String> srcList) {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < srcList.size(); i++) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
    private static List<String> convert2SuffixList(List<String> srcList) {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < srcList.size(); i++) {
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `resourceIdSet` may be replaced with 'entrySet()' iteration
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
            resourceIdSet.retainAll(oldAuthorizedResIds);
            if (CollectionUtils.isNotEmpty(resourceIdSet)) {
                for (Integer resId : resourceIdSet) {
                    log.error("Resource id:{} is used by process definition {}", resId,
                            resourceProcessMap.get(resId));
```

### KeySetIterationMayUseEntrySet
Iteration over `requestBodyMap.keySet()` may be replaced with 'entrySet()' iteration
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java
        StringBuffer stringBuffer = new StringBuffer();
        if (requestBodyMap != null) {
            for (String key : requestBodyMap.keySet()) {
                stringBuffer.append(key + "=" + requestBodyMap.get(key) + "&");
            }
```

### KeySetIterationMayUseEntrySet
Iteration over `activeTaskProcessorMaps.keySet()` may be replaced with 'entrySet()' iteration
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
        }

        for (long taskCode : activeTaskProcessorMaps.keySet()) {
            ITaskProcessor taskProcessor = activeTaskProcessorMaps.get(taskCode);
            Integer taskInstanceId = validTaskMap.get(taskCode);
```

### KeySetIterationMayUseEntrySet
Iteration over `info.keySet()` may be replaced with 'entrySet()' iteration
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/SqlParameters.java`
#### Snippet
```java
            }
            for (Map<String, String> info : sqlResult) {
                for (String key : info.keySet()) {
                    sqlResultFormat.get(key).add(String.valueOf(info.get(key)));
                }
```

### KeySetIterationMayUseEntrySet
Iteration over `jupyterParamsMap.keySet()` may be replaced with 'entrySet()' iteration
in `dolphinscheduler-task-plugin/dolphinscheduler-task-jupyter/src/main/java/org/apache/dolphinscheduler/plugin/task/jupyter/JupyterTask.java`
#### Snippet
```java
                // convert JSON string to Map
                Map<String, String> jupyterParamsMap = mapper.readValue(parameters, Map.class);
                for (String key : jupyterParamsMap.keySet()) {
                    args.add(JupyterConstants.PARAMETERS);
                    args.add(key);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/registry/MasterConnectionStateListener.java`
#### Snippet
```java
                break;
            case SUSPENDED:
                break;
            case RECONNECTED:
                masterConnectStrategy.reconnect();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/registry/WorkerConnectionStateListener.java`
#### Snippet
```java
                break;
            case SUSPENDED:
                break;
            case RECONNECTED:
                workerConnectStrategy.reconnect();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
                    break;
                case WEEK:
                    calendar.add(Calendar.DATE, 1);
                    break;
                case MONTH:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
                    break;
                case MONTH:
                    calendar.add(Calendar.DATE, 1);
                    break;
                default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                        break;
                    case ADD_CHAR:
                        res = frontInt + backInt;
                        break;
                    case SUBTRACT_CHAR:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                        break;
                    case SUBTRACT_CHAR:
                        res = frontInt - backInt;
                        break;
                    case MULTIPLY_CHAR:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        switch (commandType) {
            case START_PROCESS:
                break;
            case START_FAILURE_TASK_PROCESS:
                // find failed tasks and init these tasks
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                break;
            case START_CURRENT_TASK_PROCESS:
                break;
            case RECOVER_WAITING_THREAD:
                break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                break;
            case RECOVER_WAITING_THREAD:
                break;
            case RECOVER_SUSPENDED_PROCESS:
                // find pause tasks and init task's state
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                break;
            case SCHEDULER:
                break;
            case EXECUTE_TASK:
                processInstance.setRunTimes(runTime + 1);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return DATAX_WRITER_PLUGIN_RDBMS;
            case PRESTO:
                return DATAX_WRITER_PLUGIN_RDBMS;
            default:
                return null;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return String.format("\"%s\"", column);
            case ORACLE:
                return String.format("\"%s\"", column);
            case SQLSERVER:
                return String.format("\"%s\"", column);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return String.format("\"%s\"", column);
            case SQLSERVER:
                return String.format("\"%s\"", column);
            case CLICKHOUSE:
                return String.format("`%s`", column);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return String.format("\"%s\"", column);
            case CLICKHOUSE:
                return String.format("`%s`", column);
            default:
                return column;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return DATAX_READER_PLUGIN_RDBMS;
            case PRESTO:
                return DATAX_READER_PLUGIN_RDBMS;
            default:
                return null;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkArgsUtils.java`
#### Snippet
```java
                break;
            case STANDALONE:
                args.add(FlinkConstants.FLINK_RUN); // run
                break;
        }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkArgsUtils.java`
#### Snippet
```java
                break;
            case STANDALONE:
                break;
        }

```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[\\r]` can be simplified to '\\r'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-openmldb/src/main/java/org/apache/dolphinscheduler/plugin/task/openmldb/OpenmldbTask.java`
#### Snippet
```java
        log.info("raw sql script : {}", openmldbParameters.getSql());

        String rawSQLScript = openmldbParameters.getSql().replaceAll("[\\r]?\\n", "\n");
        Map<String, Property> paramsMap = mergeParamsWithContext(openmldbParameters);
        rawSQLScript = ParameterUtils.convertParameterPlaceholders(rawSQLScript, ParamUtils.convert(paramsMap));
```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `DIVISION_STRING.equals(cur) || MULTIPLY_STRING.equals(cur) || ADD_STRING.equals(cur)...`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
     */
    private static boolean compare(String peek, String cur) {
        if (MULTIPLY_STRING.equals(peek) && (DIVISION_STRING.equals(cur) || MULTIPLY_STRING.equals(cur)
                || ADD_STRING.equals(cur) || SUBTRACT_STRING.equals(cur))) {
            return true;
        } else if (DIVISION_STRING.equals(peek) && (DIVISION_STRING.equals(cur) || MULTIPLY_STRING.equals(cur)
```

### DuplicateExpressions
Multiple occurrences of `DIVISION_STRING.equals(cur) || MULTIPLY_STRING.equals(cur) || ADD_STRING.equals(cur)...`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                || ADD_STRING.equals(cur) || SUBTRACT_STRING.equals(cur))) {
            return true;
        } else if (DIVISION_STRING.equals(peek) && (DIVISION_STRING.equals(cur) || MULTIPLY_STRING.equals(cur)
                || ADD_STRING.equals(cur) || SUBTRACT_STRING.equals(cur))) {
            return true;
        } else if (ADD_STRING.equals(peek) && (ADD_STRING.equals(cur) || SUBTRACT_STRING.equals(cur))) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`childList.size() == 0` can be replaced with 'childList.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/visitor/ResourceTreeVisitor.java`
#### Snippet
```java
            resourceComponent.setChildren(setChildren(resourceComponent.getFullName(), list));
        }
        if (childList.size() == 0) {
            return new ArrayList<>();
        }
```

### SizeReplaceableByIsEmpty
`taskDefinitionList.size() != 0` can be replaced with '!taskDefinitionList.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                            .eq(TaskDefinition::getWorkerGroup, workerGroup));

            if (Objects.nonNull(taskDefinitionList) && taskDefinitionList.size() != 0) {
                Set<String> collect =
                        taskDefinitionList.stream().map(TaskDefinition::getName).collect(Collectors.toSet());
```

### SizeReplaceableByIsEmpty
`needRecountState.size() == 0` can be replaced with 'needRecountState.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
                taskInstanceMapper.countTaskInstanceStateByProjectIdsV2(startTime, endTime, projectIds));
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
        if (needRecountState.size() == 0) {
            TaskCountDto taskCountResult = new TaskCountDto(startTimeStates.get());
            result.put(Constants.DATA_LIST, taskCountResult);
```

### SizeReplaceableByIsEmpty
`startTimeStates.get().size() != 0` can be replaced with '!startTimeStates.get().isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
    private List<TaskExecutionStatus> setOptional(Optional<List<ExecuteStatusCount>> startTimeStates) {
        List<TaskExecutionStatus> allState = Arrays.stream(TaskExecutionStatus.values()).collect(Collectors.toList());
        if (startTimeStates.isPresent() && startTimeStates.get().size() != 0) {
            List<TaskExecutionStatus> instanceState =
                    startTimeStates.get().stream().map(ExecuteStatusCount::getState).collect(Collectors.toList());
```

### SizeReplaceableByIsEmpty
`needRecountState.size() == 0` can be replaced with 'needRecountState.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
                taskInstanceMapper.countTaskInstanceStateByProjectIdsV2(null, null, projectId));
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
        if (needRecountState.size() == 0) {
            TaskCountDto taskCountResult = new TaskCountDto(startTimeStates.get());
            result.put(Constants.DATA_LIST, taskCountResult);
```

### SizeReplaceableByIsEmpty
`startTimeStates.get().size() != 0` can be replaced with '!startTimeStates.get().isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        List<TaskExecutionStatus> allState = Arrays.stream(TaskExecutionStatus.values()).collect(Collectors.toList());
        List<TaskExecutionStatus> needRecountState;
        if (startTimeStates.isPresent() && startTimeStates.get().size() != 0) {
            List<TaskExecutionStatus> instanceState =
                    startTimeStates.get().stream().map(ExecuteStatusCount::getState).collect(Collectors.toList());
```

### SizeReplaceableByIsEmpty
`needRecountState.size() == 0` can be replaced with 'needRecountState.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
            needRecountState =
                    allState.stream().filter(ele -> !instanceState.contains(ele)).collect(Collectors.toList());
            if (needRecountState.size() == 0) {
                return startTimeStates.get();
            }
```

### SizeReplaceableByIsEmpty
`userDefinedParams.length() > 0` can be replaced with '!userDefinedParams.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
        }

        if (userDefinedParams != null && userDefinedParams.length() > 0) {
            globalParams = JSONUtils.toList(userDefinedParams, Property.class);
        }
```

### SizeReplaceableByIsEmpty
`startParams.size() > 0` can be replaced with '!startParams.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
            command.setWarningType(warningType);
        }
        if (startParams != null && startParams.size() > 0) {
            cmdParam.put(CMD_PARAM_START_PARAMS, JSONUtils.toJsonString(startParams));
        }
```

### SizeReplaceableByIsEmpty
`existResourcesList.size() > 0` can be replaced with '!existResourcesList.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        }

        if (existResourcesList.size() > 0 && !fullName.equals(originFullName)) {
            // check if any related task is online. If it is, it can not be updated.
            for (ResourcesTask existResource : existResourcesList) {
```

### SizeReplaceableByIsEmpty
`processTaskRelation.size() > 0` can be replaced with '!processTaskRelation.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                List<ProcessTaskRelation> processTaskRelation = processTaskRelationMapper.selectByMap(
                        Collections.singletonMap("post_task_code", taskCode));
                if (processTaskRelation.size() > 0) {
                    long processDefinitionCode = processTaskRelation.get(0).getProcessDefinitionCode();
                    int processDefinitionVersion = processTaskRelation.get(0).getProcessDefinitionVersion();
```

### SizeReplaceableByIsEmpty
`taskRelationList.size() > 0` can be replaced with '!taskRelationList.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                    List<TaskDefinition> taskDefinitionLogList = new ArrayList<>();

                    if (taskRelationList.size() > 0) {
                        ProcessDefinitionLog processDefinition =
                                processDefinitionLogMapper.queryByDefinitionCodeAndVersion(
```

### SizeReplaceableByIsEmpty
`resourcesNeedToDeleteSet.size() > 0` can be replaced with '!resourcesNeedToDeleteSet.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java

        // delete data in database
        if (resourcesNeedToDeleteSet.size() > 0) {
            for (ResourcesTask resourcesTask : resourcesNeedToDeleteSet) {
                int taskId = resourcesTask.getTaskId();
```

### SizeReplaceableByIsEmpty
`processTaskRelation.size() > 0` can be replaced with '!processTaskRelation.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                List<ProcessTaskRelation> processTaskRelation = processTaskRelationMapper.selectByMap(
                        Collections.singletonMap("post_task_code", taskCode));
                if (processTaskRelation.size() > 0) {
                    long processDefinitionCode = processTaskRelation.get(0).getProcessDefinitionCode();
                    int processDefinitionVersion = processTaskRelation.get(0).getProcessDefinitionVersion();
```

### SizeReplaceableByIsEmpty
`taskRelationList.size() > 0` can be replaced with '!taskRelationList.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                    List<TaskDefinition> taskDefinitionLogList = new ArrayList<>();

                    if (taskRelationList.size() > 0) {
                        ProcessDefinitionLog processDefinition =
                                processDefinitionLogMapper.queryByDefinitionCodeAndVersion(
```

### SizeReplaceableByIsEmpty
`allPreTaskCodeSet.size() != 0` can be replaced with '!allPreTaskCodeSet.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
        }
        // add
        if (allPreTaskCodeSet.size() != 0) {
            addPreTaskSet.addAll(allPreTaskCodeSet);
        }
```

### SizeReplaceableByIsEmpty
`waitingRunningNodeMap.size() == 0` can be replaced with 'waitingRunningNodeMap.isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
                runningNodeMap.remove(nodeCode);
            }
            if (waitingRunningNodeMap.size() == 0) {
                break;
            } else {
```

### SizeReplaceableByIsEmpty
`alertParams.size() == 0` can be replaced with 'alertParams.isEmpty()'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-slack/src/main/java/org/apache/dolphinscheduler/plugin/alert/slack/SlackAlertChannel.java`
#### Snippet
```java
        AlertData alertData = alertInfo.getAlertData();
        Map<String, String> alertParams = alertInfo.getAlertParams();
        if (alertParams == null || alertParams.size() == 0) {
            return new AlertResult("false", "Slack alert params is empty");
        }
```

### SizeReplaceableByIsEmpty
`alertParams.size() == 0` can be replaced with 'alertParams.isEmpty()'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-pagerduty/src/main/java/org/apache/dolphinscheduler/plugin/alert/pagerduty/PagerDutyAlertChannel.java`
#### Snippet
```java
        AlertData alertData = alertInfo.getAlertData();
        Map<String, String> alertParams = alertInfo.getAlertParams();
        if (alertParams == null || alertParams.size() == 0) {
            return new AlertResult("false", "PagerDuty alert params is empty");
        }
```

### SizeReplaceableByIsEmpty
`schemaList.size() == 0` can be replaced with 'schemaList.isEmpty()'
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/DolphinSchedulerManager.java`
#### Snippet
```java
        // Gets a list of all upgrades
        List<String> schemaList = SchemaUtils.getAllSchemaList();
        if (schemaList == null || schemaList.size() == 0) {
            log.info("There is no schema to upgrade!");
        } else {
```

### SizeReplaceableByIsEmpty
`replaceProcessDefinitionMap.size() > 0` can be replaced with '!replaceProcessDefinitionMap.isEmpty()'
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v130/V130DolphinSchedulerUpgrader.java`
#### Snippet
```java
                replaceProcessDefinitionMap.put(entry.getKey(), jsonObject.toString());
            }
            if (replaceProcessDefinitionMap.size() > 0) {
                processDefinitionDao.updateProcessDefinitionJson(connection, replaceProcessDefinitionMap);
            }
```

### SizeReplaceableByIsEmpty
`replaceProcessDefinitionMap.size() > 0` can be replaced with '!replaceProcessDefinitionMap.isEmpty()'
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v132/V132DolphinSchedulerUpgrader.java`
#### Snippet
```java
                replaceProcessDefinitionMap.put(entry.getKey(), jsonObject.toString());
            }
            if (replaceProcessDefinitionMap.size() > 0) {
                processDefinitionDao.updateProcessDefinitionJson(connection, replaceProcessDefinitionMap);
            }
```

### SizeReplaceableByIsEmpty
`notZeroIndegreeNodeMap.size() == 0` can be replaced with 'notZeroIndegreeNodeMap.isEmpty()'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/graph/DAG.java`
#### Snippet
```java

        // if notZeroIndegreeNodeMap is empty,there is no ring!
        return new AbstractMap.SimpleEntry<>(notZeroIndegreeNodeMap.size() == 0, topoResultList);
    }

```

### SizeReplaceableByIsEmpty
`varParams.size() != 0` can be replaced with '!varParams.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java
        }

        if (varParams.size() != 0) {
            globalParams.putAll(varParams);
        }
```

### SizeReplaceableByIsEmpty
`localParams.size() != 0` can be replaced with '!localParams.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java
            globalParams.putAll(varParams);
        }
        if (localParams.size() != 0) {
            globalParams.putAll(localParams);
        }
```

### SizeReplaceableByIsEmpty
`varParams.size() > 0` can be replaced with '!varParams.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
                .stream()
                .collect(Collectors.toMap(Property::getProp, Property -> Property));
        if (varParams.size() > 0) {
            varParams.putAll(globalParams);
            globalParams = varParams;
```

### SizeReplaceableByIsEmpty
`activeTaskProcessorMaps.size() > 0` can be replaced with '!activeTaskProcessorMaps.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
     */
    private WorkflowExecutionStatus processReadyBlock() {
        if (activeTaskProcessorMaps.size() > 0) {
            for (ITaskProcessor taskProcessor : activeTaskProcessorMaps.values()) {
                if (!TASK_TYPE_BLOCKING.equals(taskProcessor.getType())) {
```

### SizeReplaceableByIsEmpty
`this.errorTaskMap.size() > 0` can be replaced with '!this.errorTaskMap.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            return true;
        }
        if (this.errorTaskMap.size() > 0) {
            return true;
        }
```

### SizeReplaceableByIsEmpty
`this.dependFailedTaskSet.size() > 0` can be replaced with '!this.dependFailedTaskSet.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            return true;
        }
        return this.dependFailedTaskSet.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`allProperty.size() > 0` can be replaced with '!allProperty.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
                }
            }
            if (allProperty.size() > 0) {
                taskInstance.setVarPool(JSONUtils.toJsonString(allProperty.values()));
            }
```

### SizeReplaceableByIsEmpty
`startParamMap.size() > 0` can be replaced with '!startParamMap.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
        Map<String, String> globalMap = processDefinition.getGlobalParamMap();
        List<Property> globalParamList = processDefinition.getGlobalParamList();
        if (startParamMap.size() > 0 && globalMap != null) {
            // start param to overwrite global param
            for (Map.Entry<String, String> param : globalMap.entrySet()) {
```

### SizeReplaceableByIsEmpty
`activeTaskProcessorMaps.size() == 0` can be replaced with 'activeTaskProcessorMaps.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            }
            if (processInstance.getFailureStrategy() == FailureStrategy.CONTINUE) {
                return readyToSubmitTaskQueue.size() == 0 && activeTaskProcessorMaps.size() == 0
                        && waitToRetryTaskInstanceMap.size() == 0;
            }
```

### SizeReplaceableByIsEmpty
`waitToRetryTaskInstanceMap.size() == 0` can be replaced with 'waitToRetryTaskInstanceMap.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            if (processInstance.getFailureStrategy() == FailureStrategy.CONTINUE) {
                return readyToSubmitTaskQueue.size() == 0 && activeTaskProcessorMaps.size() == 0
                        && waitToRetryTaskInstanceMap.size() == 0;
            }
        }
```

### SizeReplaceableByIsEmpty
`activeTaskProcessorMaps.size() > 0` can be replaced with '!activeTaskProcessorMaps.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
        WorkflowExecutionStatus state = instance.getState();

        if (activeTaskProcessorMaps.size() > 0 || hasRetryTaskInStandBy()) {
            // active task and retry task exists
            WorkflowExecutionStatus executionStatus = runningState(state);
```

### SizeReplaceableByIsEmpty
`waitToRetryTaskInstanceMap.size() > 0` can be replaced with '!waitToRetryTaskInstanceMap.isEmpty()'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
        if (state == WorkflowExecutionStatus.RUNNING_EXECUTION) {
            List<TaskInstance> killTasks = getCompleteTaskByState(TaskExecutionStatus.KILL);
            if (readyToSubmitTaskQueue.size() > 0 || waitToRetryTaskInstanceMap.size() > 0) {
                // tasks currently pending submission, no retries, indicating that depend is waiting to complete
                return WorkflowExecutionStatus.RUNNING_EXECUTION;
```

### SizeReplaceableByIsEmpty
`commands.size() == 0` can be replaced with 'commands.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/k8s/impl/K8sTaskExecutor.java`
#### Snippet
```java
                .withName(k8sJobName)
                .withImage(image)
                .withCommand(commands.size() == 0 ? null : commands)
                .withImagePullPolicy(IMAGE_PULL_POLICY)
                .withResources(new ResourceRequirements(limitRes, reqRes))
```

### SizeReplaceableByIsEmpty
`taskResult.size() == 0` can be replaced with 'taskResult.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/AbstractParameters.java`
#### Snippet
```java
        }
        Map<String, String> taskResult = getMapByString(result);
        if (taskResult.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`taskDefinitionList.size() > 0` can be replaced with '!taskDefinitionList.isEmpty()'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                    List<TaskDefinition> taskDefinitionList = taskDefinitionMapper.selectByMap(
                            Collections.singletonMap("code", newTaskDefinitionLog.getCode()));
                    if (taskDefinitionList.size() > 0) {
                        createRelationTaskResourcesIfNotExist(
                                taskDefinitionList.get(0).getId(), resourceFullName);
```

### SizeReplaceableByIsEmpty
`taskDefinitionList.size() > 0` can be replaced with '!taskDefinitionList.isEmpty()'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                    List<TaskDefinition> taskDefinitionList = taskDefinitionMapper.selectByMap(
                            Collections.singletonMap("code", taskDefinitionLog.getCode()));
                    if (taskDefinitionList.size() > 0) {
                        createRelationTaskResourcesIfNotExist(
                                taskDefinitionList.get(0).getId(), resourceFullName);
```

### SizeReplaceableByIsEmpty
`paramScript.size() > 0` can be replaced with '!paramScript.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisParameters.java`
#### Snippet
```java
    public boolean checkParameters() {
        return ((BooleanUtils.isTrue(useCustom) && StringUtils.isNotBlank(rawScript))
                || (BooleanUtils.isFalse(useCustom) && paramScript.size() > 0));
    }
}
```

### SizeReplaceableByIsEmpty
`paramsMap.size() == 0` can be replaced with 'paramsMap.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java

    private StringBuilder addCustomParameters(Map<String, Property> paramsMap) {
        if (paramsMap == null || paramsMap.size() == 0) {
            return new StringBuilder();
        }
```

### SizeReplaceableByIsEmpty
`resourceList.size() > 0` can be replaced with '!resourceList.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-hivecli/src/main/java/org/apache/dolphinscheduler/plugin/task/hivecli/HiveCliParameters.java`
#### Snippet
```java
            return StringUtils.isNotEmpty(hiveSqlScript);
        } else if (HiveCliConstants.TYPE_FILE.equals(hiveCliTaskExecutionType)) {
            return (resourceList != null) && (resourceList.size() > 0);
        } else {
            return false;
```

### SizeReplaceableByIsEmpty
`paragraphId.trim().length() == 0` can be replaced with 'paragraphId.trim().isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-zeppelin/src/main/java/org/apache/dolphinscheduler/plugin/task/zeppelin/ZeppelinTask.java`
#### Snippet
```java
            }

            if (paragraphId == null || paragraphId.trim().length() == 0) {
                final NoteResult noteResult = this.zClient.executeNote(noteId, zeppelinParamsMap);
                final List<ParagraphResult> paragraphResultList = noteResult.getParagraphResultList();
```

### SizeReplaceableByIsEmpty
`tags.size() > 0` can be replaced with '!tags.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
    private static void castParamPropertyPackage(DatasyncParameters parameters, CreateTaskRequest.Builder builder) {
        List<DatasyncParameters.TagListEntry> tags = parameters.getTags();
        if (tags != null && tags.size() > 0) {
            List<TagListEntry> collect =
                    tags.stream().map(e -> TagListEntry.builder().key(e.getKey()).value(e.getValue()).build())
```

### SizeReplaceableByIsEmpty
`excludes.size() > 0` can be replaced with '!excludes.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
        }
        List<DatasyncParameters.FilterRule> excludes = parameters.getExcludes();
        if (excludes != null && excludes.size() > 0) {
            List<FilterRule> collect = excludes.stream()
                    .map(e -> FilterRule.builder().filterType(e.getFilterType()).value(e.getValue()).build())
```

### SizeReplaceableByIsEmpty
`includes.size() > 0` can be replaced with '!includes.isEmpty()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
        }
        List<DatasyncParameters.FilterRule> includes = parameters.getIncludes();
        if (includes != null && includes.size() > 0) {
            List<FilterRule> collect = includes.stream()
                    .map(e -> FilterRule.builder().filterType(e.getFilterType()).value(e.getValue()).build())
```

### SizeReplaceableByIsEmpty
`configuration.size() > 0` can be replaced with '!configuration.isEmpty()'
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/config/Config.java`
#### Snippet
```java

    public boolean isNotEmpty() {
        return configuration.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`summaries.size() > 0` can be replaced with '!summaries.isEmpty()'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
        } else {
            // the path is a file
            if (summaries.size() > 0) {
                S3ObjectSummary summary = summaries.get(0);
                String[] aliasArr = summary.getKey().split("/");
```

### SizeReplaceableByIsEmpty
`summaries.size() > 0` can be replaced with '!summaries.isEmpty()'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
        } else {
            // the path is a file
            if (summaries.size() > 0) {
                OSSObjectSummary summary = summaries.get(0);
                String[] aliasArr = summary.getKey().split(FOLDER_SEPARATOR);
```

### SizeReplaceableByIsEmpty
`foldersToFetch.size() == 0` can be replaced with 'foldersToFetch.isEmpty()'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
        do {
            String pathToExplore = "";
            if (foldersToFetch.size() == 0) {
                pathToExplore = path;
            } else {
```

### SizeReplaceableByIsEmpty
`foldersToFetch.size() != 0` can be replaced with '!foldersToFetch.isEmpty()'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
            }

        } while (foldersToFetch.size() != 0);

        return storageEntityList;
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/LogUtils.java`
#### Snippet
```java
                                        int processInstanceId, int taskInstanceId) {
        // format /logs/YYYYMMDD/defintion-code_defintion_version-processInstanceId-taskInstanceId.log
        final String taskLogFileName = new StringBuilder(String.valueOf(processDefineCode))
                .append(Constants.UNDERLINE)
                .append(processDefineVersion)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/LogUtils.java`
#### Snippet
```java
                                        int taskInstanceId) {
        // format /logs/YYYYMMDD/defintion-code_defintion_version-processInstanceId-taskInstanceId.log
        final String taskLogFileName = new StringBuilder(String.valueOf(processDefineCode))
                .append(Constants.UNDERLINE)
                .append(processDefineVersion)
```

### StringBufferReplaceableByString
`StringBuilder compilerCommand` can be replaced with 'String'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
        createJavaSourceFileIfNotExists(sourceCode, fileName);

        StringBuilder compilerCommand = new StringBuilder()
                .append(getJavaCommandPath())
                .append("javac").append(" ")
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
        String mainJarName = fullName.substring(0, fullName.lastIndexOf('.'));
        mainJarName = mainJarName.substring(mainJarName.lastIndexOf('.') + 1) + ".jar";
        StringBuilder builder = new StringBuilder();
        builder.append(getJavaCommandPath())
                .append("java").append(" ")
```

### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
        String subbedString = myStr.substring(0, lastIndex);
        int secondLastIndex = subbedString.lastIndexOf("/");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myStr, secondLastIndex + 1, lastIndex + 1);

```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
        }

        public static final ProcessContainer getInstance() {
            return container;
        }
```

### FinalStaticMethod
'static' method declared `final`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractShell.java`
#### Snippet
```java
        }

        public static final ProcessContainer getInstance() {
            return container;
        }
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
        String cpuStr = null;
        if (k8sNamespace.getLimitsCpu() != null) {
            cpuStr = k8sNamespace.getLimitsCpu() + "";
        }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                    result.add(num);
                }
                result.add(expression.charAt(i) + "");
                num = "";
            }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
        defaultFS = defaultFS.endsWith("/") ? StringUtils.chop(defaultFS) : defaultFS;
        if (FOLDER_SEPARATOR.equals(RESOURCE_UPLOAD_PATH)) {
            return defaultFS + "";
        } else {
            return defaultFS + RESOURCE_UPLOAD_PATH;
```

## RuleId[ruleID=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/python/PythonGateway.java`
#### Snippet
```java
        if (project == null) {
            projectService.createProject(user, name, desc);
        } else if (project.getUserId() != user.getId()) {
            ProjectUser projectUser = projectUserMapper.queryProjectRelation(project.getId(), user.getId());
            if (projectUser == null) {
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
        result.put(Constants.STATUS, false);
        // no permission
        if (loginUser.getUserType().equals(UserType.GENERAL_USER) && loginUser.getId() != userId) {
            putMsg(result, Status.USER_NO_OPERATION_PERM);
            return result;
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
    public Map<String, Object> queryUnauthorizedNamespace(User loginUser, Integer userId) {
        Map<String, Object> result = new HashMap<>();
        if (loginUser.getId() != userId && isNotAdmin(loginUser, result)) {
            return result;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
        Map<String, Object> result = new HashMap<>();

        if (loginUser.getId() != userId && isNotAdmin(loginUser, result)) {
            return result;
        }
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/Tenant.java`
#### Snippet
```java
        Tenant tenant = (Tenant) o;

        return id == tenant.id;
    }

```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/AccessToken.java`
#### Snippet
```java
        AccessToken that = (AccessToken) o;

        if (id != that.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessInstanceMap.java`
#### Snippet
```java
        ProcessInstanceMap that = (ProcessInstanceMap) o;

        if (id != that.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/Resource.java`
#### Snippet
```java
        Resource resource = (Resource) o;

        if (id != resource.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/DataSource.java`
#### Snippet
```java
        DataSource that = (DataSource) o;

        if (id != that.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/AlertGroup.java`
#### Snippet
```java
        AlertGroup that = (AlertGroup) o;

        if (id != that.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/Queue.java`
#### Snippet
```java
        Queue queue1 = (Queue) o;

        if (id != queue1.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/Project.java`
#### Snippet
```java
        Project project = (Project) o;

        if (id != project.id) {
            return false;
        }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/UdfFunc.java`
#### Snippet
```java
        UdfFunc udfFunc = (UdfFunc) o;

        if (id != udfFunc.id) {
            return false;
        }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BaseHttpTemplateLoopTaskExecutor` has no concrete subclass
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/http/BaseHttpTemplateLoopTaskExecutor.java`
#### Snippet
```java
import lombok.NonNull;

public abstract class BaseHttpTemplateLoopTaskExecutor extends BaseLoopTaskExecutor {

    private final HttpLoopTaskDefinition httpLoopTaskDefinition;
```

### AbstractClassNeverImplemented
Abstract class `BaseLoopTaskExecutor` has no concrete subclass
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/BaseLoopTaskExecutor.java`
#### Snippet
```java
 * The loop task type means, we will submit a task, and loop the task status until the task is finished.
 */
public abstract class BaseLoopTaskExecutor extends AbstractRemoteTask {

    /**
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ExecuteStatusCount`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/TaskCountDto.java`
#### Snippet
```java
    }

    private void countTaskDtos(List<ExecuteStatusCount> taskInstanceStateCounts) {
        Map<TaskExecutionStatus, Integer> statusCountMap = taskInstanceStateCounts.stream()
                .collect(Collectors.toMap(ExecuteStatusCount::getState, ExecuteStatusCount::getCount, Integer::sum));
```

### BoundedWildcard
Can generalize to `? super Resource`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/filter/ResourceFilter.java`
#### Snippet
```java
     * @return parent resource dir set
     */
    private void setAllParent(Resource resource, Set<Resource> parentList) {
        for (Resource resourceTemp : resourceList) {
            if (resourceTemp.getId() == resource.getPid()) {
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/filter/ResourceFilter.java`
#### Snippet
```java
     * @param resourceList  resource list
     */
    public ResourceFilter(String suffix, List<Resource> resourceList) {
        this.suffix = suffix;
        this.resourceList = resourceList;
```

### BoundedWildcard
Can generalize to `? extends StorageEntity`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/visitor/ResourceTreeVisitor.java`
#### Snippet
```java
     * @return resource component list
     */
    public static List<ResourceComponent> setChildren(String fullName, List<StorageEntity> list) {
        // id is the unique value,
        List<ResourceComponent> childList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/BaseServiceImpl.java`
#### Snippet
```java
     */
    @Override
    public void putMsg(Map<String, Object> result, Status status, Object... statusParams) {
        result.put(Constants.STATUS, status);
        if (statusParams != null && statusParams.length > 0) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/BaseServiceImpl.java`
#### Snippet
```java
     */
    @Override
    public boolean check(Map<String, Object> result, boolean bool, Status userNoOperationPerm) {
        // only admin can operate
        if (bool) {
```

### BoundedWildcard
Can generalize to `? extends DqRuleInputEntry`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DqRuleServiceImpl.java`
#### Snippet
```java
    }

    private String getRuleFormCreateJson(List<DqRuleInputEntry> ruleInputEntryList) {
        List<PluginParams> params = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends AlertPluginInstance`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AlertPluginInstanceServiceImpl.java`
#### Snippet
```java
    }

    private List<AlertPluginInstanceVO> buildPluginInstanceVOList(List<AlertPluginInstance> alertPluginInstances) {
        if (CollectionUtils.isEmpty(alertPluginInstances)) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
     * handle datasource connection password for safety
     */
    private void handlePasswd(List<DataSource> dataSourceList) {
        for (DataSource dataSource : dataSourceList) {
            String connectionParams = dataSource.getConnectionParams();
```

### BoundedWildcard
Can generalize to `? super WorkFlowLineage`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java
    private void recursiveWorkFlow(long projectCode,
                                   long sourceWorkFlowCode,
                                   List<WorkFlowLineage> workFlowLineages,
                                   Set<WorkFlowRelation> workFlowRelations) {
        workFlowLineages.add(workFlowLineageMapper.queryWorkFlowLineageByCode(projectCode, sourceWorkFlowCode));
```

### BoundedWildcard
Can generalize to `? super WorkFlowRelation`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java
                                   long sourceWorkFlowCode,
                                   List<WorkFlowLineage> workFlowLineages,
                                   Set<WorkFlowRelation> workFlowRelations) {
        workFlowLineages.add(workFlowLineageMapper.queryWorkFlowLineageByCode(projectCode, sourceWorkFlowCode));

```

### BoundedWildcard
Can generalize to `? super WorkFlowLineage`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java

    private void getUpstreamLineages(long sourceWorkFlowCode,
                                     List<WorkFlowLineage> upstreamWorkFlowLineages) {
        List<DependentProcessDefinition> workFlowDependentDefinitionList =
                workFlowLineageMapper.queryUpstreamDependentParamsByProcessDefinitionCode(sourceWorkFlowCode,
```

### BoundedWildcard
Can generalize to `? extends DependentProcessDefinition`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java
     * get dependent process definition code by dependent process definition list
     */
    private void getProcessDefinitionCodeByDependentDefinitionList(List<DependentProcessDefinition> dependentDefinitionList,
                                                                   List<Long> processDefinitionCodes) {
        for (DependentProcessDefinition dependentProcessDefinition : dependentDefinitionList) {
```

### BoundedWildcard
Can generalize to `? super Long`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java
     */
    private void getProcessDefinitionCodeByDependentDefinitionList(List<DependentProcessDefinition> dependentDefinitionList,
                                                                   List<Long> processDefinitionCodes) {
        for (DependentProcessDefinition dependentProcessDefinition : dependentDefinitionList) {
            for (DependentTaskModel dependentTaskModel : dependentProcessDefinition.getDependentParameters()
```

### BoundedWildcard
Can generalize to `? extends List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
    }

    private List<TaskExecutionStatus> setOptional(Optional<List<ExecuteStatusCount>> startTimeStates) {
        List<TaskExecutionStatus> allState = Arrays.stream(TaskExecutionStatus.values()).collect(Collectors.toList());
        if (startTimeStates.isPresent() && startTimeStates.get().size() != 0) {
```

### BoundedWildcard
Can generalize to `? super Date`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
     */
    private Map<String, Object> countStateByProject(User loginUser, long projectCode, String startDate, String endDate,
                                                    TriFunction<Date, Date, Long[], List<ExecuteStatusCount>> instanceStateCounter) {
        Map<String, Object> result = new HashMap<>();
        if (projectCode != 0) {
```

### BoundedWildcard
Can generalize to `? super Date`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
     */
    private Map<String, Object> countStateByProject(User loginUser, long projectCode, String startDate, String endDate,
                                                    TriFunction<Date, Date, Long[], List<ExecuteStatusCount>> instanceStateCounter) {
        Map<String, Object> result = new HashMap<>();
        if (projectCode != 0) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
     */
    private Map<String, Object> countStateByProject(User loginUser, long projectCode, String startDate, String endDate,
                                                    TriFunction<Date, Date, Long[], List<ExecuteStatusCount>> instanceStateCounter) {
        Map<String, Object> result = new HashMap<>();
        if (projectCode != 0) {
```

### BoundedWildcard
Can generalize to `? extends TaskInstance`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
     * add dependent result for dependent task
     */
    private void addDependResultForTaskList(User loginUser, List<TaskInstance> taskInstanceList) throws IOException {
        for (TaskInstance taskInstance : taskInstanceList) {
            if (TASK_TYPE_DEPENDENT.equalsIgnoreCase(taskInstance.getTaskType())) {
```

### BoundedWildcard
Can generalize to `? extends DependentProcessDefinition`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
     */
    private List<DependentProcessDefinition> checkDependentProcessDefinitionValid(
                                                                                  List<DependentProcessDefinition> dependentProcessDefinitionList,
                                                                                  CycleEnum processDefinitionCycle,
                                                                                  String workerGroup,
```

### BoundedWildcard
Can generalize to `? extends Schedule`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
     * create complement dependent command
     */
    public int createComplementDependentCommand(List<Schedule> schedules, Command command) {
        int dependentProcessDefinitionCreateCount = 0;
        Command dependentCommand;
```

### BoundedWildcard
Can generalize to `? extends K8sNamespace`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
     * @return namespace list that authorization
     */
    private List<K8sNamespace> getUnauthorizedNamespaces(Set<K8sNamespace> namespaceSet,
                                                         List<K8sNamespace> authedNamespaceList) {
        List<K8sNamespace> resultList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends K8sNamespace`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
     */
    private List<K8sNamespace> getUnauthorizedNamespaces(Set<K8sNamespace> namespaceSet,
                                                         List<K8sNamespace> authedNamespaceList) {
        List<K8sNamespace> resultList = new ArrayList<>();
        for (K8sNamespace k8sNamespace : namespaceSet) {
```

### BoundedWildcard
Can generalize to `? extends K8sNamespace`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
     * @param k8sNamespaces source data
     */
    private void setClusterName(List<K8sNamespace> k8sNamespaces) {
        if (CollectionUtils.isNotEmpty(k8sNamespaces)) {
            List<Cluster> clusters = clusterMapper.queryAllClusterList();
```

### BoundedWildcard
Can generalize to `? extends Project`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
     * @return project list that unauthorized
     */
    private List<Project> getUnauthorizedProjects(Set<Project> projectSet, List<Project> authedProjectList) {
        List<Project> resultList;
        Set<Project> authedProjectSet;
```

### BoundedWildcard
Can generalize to `? extends Project`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
     * @return project list that unauthorized
     */
    private List<Project> getUnauthorizedProjects(Set<Project> projectSet, List<Project> authedProjectList) {
        List<Project> resultList;
        Set<Project> authedProjectSet;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
     * @param childList  child list
     */
    void listAllChildren(int resourceId, List<Integer> childList) {
        List<Integer> children = resourcesMapper.listChildren(resourceId);
        for (int childId : children) {
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java

    public void updateDag(User loginUser, long processDefinitionCode,
                          List<ProcessTaskRelation> processTaskRelationList,
                          List<TaskDefinitionLog> taskDefinitionLogs) {
        ProcessDefinition processDefinition = processDefinitionMapper.queryByCode(processDefinitionCode);
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/BaseController.java`
#### Snippet
```java
     * @param statusParams object messages
     */
    protected void putMsg(Map<String, Object> result, Status status, Object... statusParams) {
        result.put(Constants.STATUS, status);
        if (statusParams != null && statusParams.length > 0) {
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
     * @return if graph has cycle flag
     */
    private boolean graphHasCycle(List<TaskNode> taskNodeResponseList) {
        DAG<String, TaskNode, String> graph = new DAG<>();
        // Fill the vertices
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelationLog`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
     */
    private void taskUsedInOtherTaskValid(ProcessDefinition processDefinition,
                                          List<ProcessTaskRelationLog> taskRelationList) {
        List<ProcessTaskRelation> oldProcessTaskRelationList = processTaskRelationMapper
                .queryByProcessCode(processDefinition.getProjectCode(), processDefinition.getCode());
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
    protected void doBatchOperateProcessDefinition(User loginUser,
                                                   long targetProjectCode,
                                                   List<String> failedProcessList,
                                                   String processDefinitionCodes,
                                                   Map<String, Object> result,
```

### BoundedWildcard
Can generalize to `? extends Map`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/ResourceProcessDefinitionUtils.java`
#### Snippet
```java
    }

    public static <T> Map<Integer, Set<T>> getResourceObjectMap(List<Map<String, Object>> resourceList,
                                                                String objectName, Class<T> clazz) {
        // resourceId -> task ids or code depends on the objectName
```

### BoundedWildcard
Can generalize to `? extends Map`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/ResourceProcessDefinitionUtils.java`
#### Snippet
```java
     * @return resource process definition map (resourceId -> processDefinitionCodes)
     */
    public static Map<Integer, Set<Long>> getResourceProcessDefinitionMap(List<Map<String, Object>> resourceList) {

        // resourceId -> processDefinitionCodes
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessTaskRelationServiceImpl.java`
#### Snippet
```java

    private void updateRelation(User loginUser, Map<String, Object> result, ProcessDefinition processDefinition,
                                List<ProcessTaskRelation> processTaskRelationList) {
        List<ProcessTaskRelationLog> relationLogs =
                processTaskRelationList.stream().map(ProcessTaskRelationLog::new).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessTaskRelationServiceImpl.java`
#### Snippet
```java

    private List<ProcessTaskRelationLog> batchPersist2ProcessTaskRelationLog(User user,
                                                                             List<ProcessTaskRelation> processTaskRelations) {
        Date now = new Date();
        List<ProcessTaskRelationLog> processTaskRelationLogs = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskDefinitionLogDaoImpl.java`
#### Snippet
```java

    @Override
    public List<TaskDefinitionLog> getTaskDefineLogListByRelation(List<ProcessTaskRelation> processTaskRelations) {
        List<TaskDefinitionLog> taskDefinitionLogs = new ArrayList<>();
        Map<Long, Integer> taskCodeVersionMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskDefinitionLogDaoImpl.java`
#### Snippet
```java

    @Override
    public List<TaskDefinitionLog> getTaskDefineLogList(List<ProcessTaskRelation> processTaskRelations) {
        Set<TaskDefinition> taskDefinitionSet = new HashSet<>();
        for (ProcessTaskRelation processTaskRelation : processTaskRelations) {
```

### BoundedWildcard
Can generalize to `? extends ProcessInstance`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/ProcessDefinitionDaoImpl.java`
#### Snippet
```java

    @Override
    public List<ProcessDefinition> queryProcessDefinitionsByCodesAndVersions(List<ProcessInstance> processInstances) {
        if (Objects.isNull(processInstances) || processInstances.isEmpty()) {
            return new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ProcessDefinition`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/upgrade/ProcessDefinitionDao.java`
#### Snippet
```java
     * @param projectIdCodeMap projectIdCodeMap
     */
    public void updateProcessDefinitionCode(Connection conn, List<ProcessDefinition> processDefinitions,
                                            Map<Integer, Long> projectIdCodeMap) {
        String sql = "UPDATE t_ds_process_definition SET code=?, project_code=?, version=? where id=?";
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelationLog`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/upgrade/JsonSplitDao.java`
#### Snippet
```java
     */
    public void executeJsonSplitProcessTaskRelation(Connection conn,
                                                    List<ProcessTaskRelationLog> processTaskRelationLogs) {
        String insertSql =
                "insert into t_ds_process_task_relation (project_code,process_definition_code,process_definition_version,pre_task_code,pre_task_version,"
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/upgrade/JsonSplitDao.java`
#### Snippet
```java
     * @param taskDefinitionLogs taskDefinitionLogs
     */
    public void executeJsonSplitTaskDefinition(Connection conn, List<TaskDefinitionLog> taskDefinitionLogs) {
        String insertSql =
                "insert into t_ds_task_definition (code,name,version,description,project_code,user_id,task_type,task_params,flag,task_priority,"
```

### BoundedWildcard
Can generalize to `? extends ProcessDefinitionLog`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/upgrade/JsonSplitDao.java`
#### Snippet
```java
     * @param processDefinitionLogs processDefinitionLogs
     */
    public void executeJsonSplitProcessDefinition(Connection conn, List<ProcessDefinitionLog> processDefinitionLogs) {
        String updateSql =
                "UPDATE t_ds_process_definition SET global_params=?,timeout=?,tenant_id=?,locations=?,update_time=? where id=?";
```

### BoundedWildcard
Can generalize to `? extends T`
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/plugin/PrioritySPIFactory.java`
#### Snippet
```java
    private final Map<String, T> map = new HashMap<>();

    public PrioritySPIFactory(Class<T> spiClass) {
        for (T t : ServiceLoader.load(spiClass)) {
            if (map.containsKey(t.getIdentify().getName())) {
```

### BoundedWildcard
Can generalize to `? extends Alert`
in `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/java/org/apache/dolphinscheduler/alert/AlertSenderService.java`
#### Snippet
```java
    }

    public void send(List<Alert> alerts) {
        for (Alert alert : alerts) {
            // get alert group from alert
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
     * @param items items
     */
    private void setMsgAt(Map<String, Object> items) {
        Map<String, Object> at = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
     * @param text text
     */
    private void generateMarkdownMsg(String title, String content, Map<String, Object> text) {
        StringBuilder builder = new StringBuilder(content);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(keyword)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
     * @param text text
     */
    private void generateTextMsg(String title, String content, Map<String, Object> text) {
        StringBuilder builder = new StringBuilder(title);
        builder.append("\n");
```

### BoundedWildcard
Can generalize to `? extends Map`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/graph/DAG.java`
#### Snippet
```java
     * @return all neighbor nodes of the node
     */
    private Set<Node> getNeighborNodes(Node node, final Map<Node, Map<Node, EdgeInfo>> edges) {
        final Map<Node, EdgeInfo> neighborEdges = edges.get(node);
        if (neighborEdges == null) {
```

### BoundedWildcard
Can generalize to `? super Node`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/graph/DAG.java`
#### Snippet
```java
     * @param edges edge set
     */
    private void addEdge(Node fromNode, Node toNode, EdgeInfo edge, Map<Node, Map<Node, EdgeInfo>> edges) {
        edges.putIfAbsent(fromNode, new HashMap<>());
        Map<Node, EdgeInfo> toNodeEdges = edges.get(fromNode);
```

### BoundedWildcard
Can generalize to `? extends DateInterval`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/utils/DependentExecute.java`
#### Snippet
```java
     */
    private DependResult calculateResultForTasks(DependentItem dependentItem,
                                                 List<DateInterval> dateIntervals,
                                                 int testFlag) {

```

### BoundedWildcard
Can generalize to `? extends DependentItem`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/utils/DependentExecute.java`
#### Snippet
```java
     * @param relation relation
     */
    public DependentExecute(List<DependentItem> itemList, DependentRelation relation) {
        this.dependItemList = itemList;
        this.relation = relation;
```

### BoundedWildcard
Can generalize to `? extends Command`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/MasterSchedulerBootstrap.java`
#### Snippet
```java
    }

    private List<ProcessInstance> command2ProcessInstance(List<Command> commands) throws InterruptedException {
        long commandTransformStartTime = System.currentTimeMillis();
        log.info("Master schedule bootstrap transforming command to ProcessInstance, commandSize: {}",
```

### BoundedWildcard
Can generalize to `? extends HostWorker`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/RandomSelector.java`
#### Snippet
```java

    @Override
    public HostWorker doSelect(final Collection<HostWorker> source) {

        List<HostWorker> hosts = new ArrayList<>(source);
```

### BoundedWildcard
Can generalize to `? extends Date`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/WorkerFailoverService.java`
#### Snippet
```java
     * @return true if task instance need fail over
     */
    private boolean checkTaskInstanceNeedFailover(Optional<Date> needFailoverWorkerStartTime,
                                                  @Nullable ProcessInstance processInstance,
                                                  TaskInstance taskInstance) {
```

### BoundedWildcard
Can generalize to `? extends Server`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/WorkerFailoverService.java`
#### Snippet
```java
    }

    private Optional<Date> getServerStartupTime(List<Server> servers, String host) {
        if (CollectionUtils.isEmpty(servers)) {
            return Optional.empty();
```

### BoundedWildcard
Can generalize to `? extends Server`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/MasterFailoverService.java`
#### Snippet
```java
    }

    private Optional<Date> getServerStartupTime(List<Server> servers, String host) {
        if (CollectionUtils.isEmpty(servers)) {
            return Optional.empty();
```

### BoundedWildcard
Can generalize to `? extends Date`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/MasterFailoverService.java`
#### Snippet
```java
    }

    private boolean checkProcessInstanceNeedFailover(Optional<Date> beFailoveredMasterStartupTimeOptional,
                                                     @NonNull ProcessInstance processInstance) {
        // The process has already been failover, since when we do master failover we will hold a lock, so we can
```

### BoundedWildcard
Can generalize to `? extends HostWorker`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/RoundRobinSelector.java`
#### Snippet
```java

    @Override
    public HostWorker doSelect(Collection<HostWorker> source) {

        List<HostWorker> hosts = new ArrayList<>(source);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    }

    private void setTaskUdfFuncResourceInfo(Map<Integer, AbstractResourceParameters> map) {
        if (MapUtils.isEmpty(map)) {
            return;
```

### BoundedWildcard
Can generalize to `? super AbstractResourceParameters`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    }

    private void setTaskUdfFuncResourceInfo(Map<Integer, AbstractResourceParameters> map) {
        if (MapUtils.isEmpty(map)) {
            return;
```

### BoundedWildcard
Can generalize to `? super DqRuleInputEntry`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    private void setComparisonParams(DataQualityTaskExecutionContext dataQualityTaskExecutionContext,
                                     Map<String, String> config,
                                     List<DqRuleInputEntry> ruleInputEntryList,
                                     List<DqRuleExecuteSql> executeSqlList) {
        if (config.get(COMPARISON_TYPE) != null) {
```

### BoundedWildcard
Can generalize to `? super DqRuleExecuteSql`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
                                     Map<String, String> config,
                                     List<DqRuleInputEntry> ruleInputEntryList,
                                     List<DqRuleExecuteSql> executeSqlList) {
        if (config.get(COMPARISON_TYPE) != null) {
            int comparisonTypeId = Integer.parseInt(config.get(COMPARISON_TYPE));
```

### BoundedWildcard
Can generalize to `? super AbstractResourceParameters`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    }

    private void setTaskDataSourceResourceInfo(Map<Integer, AbstractResourceParameters> map) {
        if (MapUtils.isEmpty(map)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends HostWeight`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/LowerWeightRoundRobin.java`
#### Snippet
```java
    }

    private List<HostWeight> canAssignTaskHost(Collection<HostWeight> sources) {
        if (CollectionUtils.isEmpty(sources)) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends WorkerHeartBeat`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/LowerWeightHostManager.java`
#### Snippet
```java
         */
        private void syncWorkerResources(final Map<String, Set<String>> workerGroupNodes,
                                         final Map<String, WorkerHeartBeat> workerNodeInfoMap) {
            try {
                Map<String, Set<HostWeight>> workerHostWeights = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Set`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/LowerWeightHostManager.java`
#### Snippet
```java
        }

        private void syncWorkerHostWeight(Map<String, Set<HostWeight>> workerHostWeights) {
            workerGroupWriteLock.lock();
            try {
```

### BoundedWildcard
Can generalize to `? extends TaskEventHandler`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/processor/queue/TaskExecuteRunnable.java`
#### Snippet
```java
    private final Map<TaskEventType, TaskEventHandler> taskEventHandlerMap;

    public TaskExecuteRunnable(int processInstanceId, Map<TaskEventType, TaskEventHandler> taskEventHandlerMap) {
        this.processInstanceId = processInstanceId;
        this.taskEventHandlerMap = taskEventHandlerMap;
```

### BoundedWildcard
Can generalize to `? extends TaskInstance`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
     * @return recovery node code list
     */
    private List<String> getRecoveryNodeCodeList(List<TaskInstance> recoverNodeList) {
        List<String> recoveryNodeCodeList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(recoverNodeList)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
    }

    private void setVarPoolValue(Map<String, Property> allProperty, Map<String, TaskInstance> allTaskInstance,
                                 TaskInstance preTaskInstance, Property thisProperty) {
        // for this taskInstance all the param in this part is IN.
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
    }

    private void setVarPoolValue(Map<String, Property> allProperty, Map<String, TaskInstance> allTaskInstance,
                                 TaskInstance preTaskInstance, Property thisProperty) {
        // for this taskInstance all the param in this part is IN.
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
     * @param indirectDepCodeList All indirectly dependent nodes
     */
    private void setIndirectDepList(String taskCode, List<String> indirectDepCodeList) {
        TaskNode taskNode = dag.getNode(taskCode);
        List<String> depCodeList = taskNode.getDepList();
```

### BoundedWildcard
Can generalize to `? extends RpcRequest`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/remote/NettyClient.java`
#### Snippet
```java
    }

    public RpcResponse sendMsg(Host host, RpcProtocol<RpcRequest> protocol, Boolean async) {

        Channel channel = getChannel(host);
```

### BoundedWildcard
Can generalize to `? extends T`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/bean/SpringApplicationContext.java`
#### Snippet
```java
    }

    public static <T> T getBean(Class<T> requiredType, T defaultValue) {
        try {
            return applicationContext.getBean(requiredType);
```

### BoundedWildcard
Can generalize to `? extends Server`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/queue/MasterPriorityQueue.java`
#### Snippet
```java
    }

    public void putList(List<Server> serverList) {
        for (Server server : serverList) {
            this.queue.put(server);
```

### BoundedWildcard
Can generalize to `? extends Schedule`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
    public static List<ZonedDateTime> getSelfFireDateList(@NonNull final ZonedDateTime startTime,
                                                          @NonNull final ZonedDateTime endTime,
                                                          @NonNull final List<Schedule> schedules) throws CronParseException {
        List<ZonedDateTime> result = new ArrayList<>();
        if (startTime.equals(endTime)) {
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
    }

    private void convertConditions(List<TaskDefinitionLog> taskDefinitionLogList,
                                   Map<String, Long> taskNameCodeMap) throws Exception {
        for (TaskDefinitionLog taskDefinitionLog : taskDefinitionLogList) {
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
    }

    private void convertDependence(List<TaskDefinitionLog> taskDefinitionLogs,
                                   Map<Integer, Long> projectIdCodeMap,
                                   Map<Integer, Map<Long, Map<String, Long>>> processTaskMap) {
```

### BoundedWildcard
Can generalize to `? extends Map`>
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
    private void convertDependence(List<TaskDefinitionLog> taskDefinitionLogs,
                                   Map<Integer, Long> projectIdCodeMap,
                                   Map<Integer, Map<Long, Map<String, Long>>> processTaskMap) {
        for (TaskDefinitionLog taskDefinitionLog : taskDefinitionLogs) {
            if (TASK_TYPE_DEPENDENT.equals(taskDefinitionLog.getTaskType())) {
```

### BoundedWildcard
Can generalize to `? super ProcessTaskRelationLog`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
                                           Map<String, Long> taskNameCodeMap,
                                           ProcessDefinition processDefinition,
                                           List<ProcessTaskRelationLog> processTaskRelationLogs) {
        Date now = new Date();
        for (Map.Entry<String, List<String>> entry : taskNamePreMap.entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends ProcessDefinition`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
    }

    private void splitProcessDefinitionJson(List<ProcessDefinition> processDefinitions,
                                            Map<Integer, String> processDefinitionJsonMap,
                                            List<ProcessDefinitionLog> processDefinitionLogs,
```

### BoundedWildcard
Can generalize to `? super ProcessDefinitionLog`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
    private void splitProcessDefinitionJson(List<ProcessDefinition> processDefinitions,
                                            Map<Integer, String> processDefinitionJsonMap,
                                            List<ProcessDefinitionLog> processDefinitionLogs,
                                            List<ProcessTaskRelationLog> processTaskRelationLogs,
                                            List<TaskDefinitionLog> taskDefinitionLogs,
```

### BoundedWildcard
Can generalize to `? super TaskDefinitionLog`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
                                            List<ProcessDefinitionLog> processDefinitionLogs,
                                            List<ProcessTaskRelationLog> processTaskRelationLogs,
                                            List<TaskDefinitionLog> taskDefinitionLogs,
                                            Map<Integer, Map<Long, Map<String, Long>>> processTaskMap) throws Exception {
        Map<Integer, ProcessDefinition> processDefinitionMap = processDefinitions.stream()
```

### BoundedWildcard
Can generalize to `? super Integer`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
                                            List<ProcessTaskRelationLog> processTaskRelationLogs,
                                            List<TaskDefinitionLog> taskDefinitionLogs,
                                            Map<Integer, Map<Long, Map<String, Long>>> processTaskMap) throws Exception {
        Map<Integer, ProcessDefinition> processDefinitionMap = processDefinitions.stream()
                .collect(Collectors.toMap(ProcessDefinition::getId, processDefinition -> processDefinition));
```

### BoundedWildcard
Can generalize to `? super Map`>
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v200/V200DolphinSchedulerUpgrader.java`
#### Snippet
```java
                                            List<ProcessTaskRelationLog> processTaskRelationLogs,
                                            List<TaskDefinitionLog> taskDefinitionLogs,
                                            Map<Integer, Map<Long, Map<String, Long>>> processTaskMap) throws Exception {
        Map<Integer, ProcessDefinition> processDefinitionMap = processDefinitions.stream()
                .collect(Collectors.toMap(ProcessDefinition::getId, processDefinition -> processDefinition));
```

### BoundedWildcard
Can generalize to `? extends TaskInstance`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/alert/ProcessAlertManager.java`
#### Snippet
```java
     */
    public String getContentProcessInstance(ProcessInstance processInstance,
                                            List<TaskInstance> taskInstances,
                                            ProjectUser projectUser) {

```

### BoundedWildcard
Can generalize to `? extends TaskInstance`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/alert/ProcessAlertManager.java`
#### Snippet
```java
     * @return worker tolerance content
     */
    private String getWorkerToleranceContent(ProcessInstance processInstance, List<TaskInstance> toleranceTaskList) {

        List<ProcessAlertContent> toleranceTaskInstanceList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/expand/CuringGlobalParams.java`
#### Snippet
```java
    @Override
    public String curingGlobalParams(Integer processInstanceId, Map<String, String> globalParamMap,
                                     List<Property> globalParamList, CommandType commandType, Date scheduleTime,
                                     String timezone) {
        if (globalParamList == null || globalParamList.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends MysqlRegistryData`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/task/SubscribeDataManager.java`
#### Snippet
```java
        }

        private void triggerListener(List<MysqlRegistryData> dataList,
                                     String subscribeKey,
                                     List<SubscribeListener> subscribeListeners,
```

### BoundedWildcard
Can generalize to `? extends SubscribeListener`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/task/SubscribeDataManager.java`
#### Snippet
```java
        private void triggerListener(List<MysqlRegistryData> dataList,
                                     String subscribeKey,
                                     List<SubscribeListener> subscribeListeners,
                                     Event.Type type) {
            for (MysqlRegistryData data : dataList) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractTask.java`
#### Snippet
```java
     * @param paramsPropsMap params props map
     */
    public void setSqlParamsMap(String content, String rgex, Map<Integer, Property> sqlParamsMap,
                                Map<String, Property> paramsPropsMap, int taskInstanceId) {
        if (paramsPropsMap == null) {
```

### BoundedWildcard
Can generalize to `? super Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractTask.java`
#### Snippet
```java
     * @param paramsPropsMap params props map
     */
    public void setSqlParamsMap(String content, String rgex, Map<Integer, Property> sqlParamsMap,
                                Map<String, Property> paramsPropsMap, int taskInstanceId) {
        if (paramsPropsMap == null) {
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractTask.java`
#### Snippet
```java
     */
    public void setSqlParamsMap(String content, String rgex, Map<Integer, Property> sqlParamsMap,
                                Map<String, Property> paramsPropsMap, int taskInstanceId) {
        if (paramsPropsMap == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends PodList`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManager.java`
#### Snippet
```java
     */
    private TaskExecutionStatus getApplicationStatus(KubernetesApplicationManagerContext kubernetesApplicationManagerContext,
                                                     FilterWatchListDeletable<Pod, PodList> watchList) throws TaskException {
        String phase;
        try {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
     * @param command command
     */
    private void generateCgroupCommand(List<String> command) {
        Integer cpuQuota = taskRequest.getCpuQuota();
        Integer memoryMax = taskRequest.getMemoryMax();
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PropertyPlaceholderHelper.java`
#### Snippet
```java
    protected String parseStringValue(
                                      String value, PlaceholderResolver placeholderResolver,
                                      Set<String> visitedPlaceholders) {

        StringBuilder result = new StringBuilder(value);
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/AbstractParameters.java`
#### Snippet
```java
    }

    public List<Property> getOutProperty(List<Property> params) {
        if (CollectionUtils.isEmpty(params)) {
            return new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
    }

    public static String expandListParameter(Map<Integer, Property> params, String sql) {
        Map<Integer, Property> expandMap = new HashMap<>();
        if (params == null || params.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                                int processDefinitionVersion,
                                List<ProcessTaskRelationLog> taskRelationList,
                                List<TaskDefinitionLog> taskDefinitionLogs,
                                Boolean syncDefine) {
        if (taskRelationList.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java

    @Override
    public int saveTaskDefine(User operator, long projectCode, List<TaskDefinitionLog> taskDefinitionLogs,
                              Boolean syncDefine) {
        Date now = new Date();
```

### BoundedWildcard
Can generalize to `? extends TaskDefinitionLog`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
    @Override
    public List<TaskNode> transformTask(List<ProcessTaskRelation> taskRelationList,
                                        List<TaskDefinitionLog> taskDefinitionLogs) {
        Map<Long, List<Long>> taskCodeMap = new HashMap<>();
        for (ProcessTaskRelation processTaskRelation : taskRelationList) {
```

### BoundedWildcard
Can generalize to `? super Resource`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
     * @param userId       userId
     */
    private void addAuthorizedResources(List<Resource> ownResources, int userId) {
        List<Integer> relationResourceIds = resourceUserMapper.queryResourcesIdListByUserIdAndPerm(userId, 7);
        List<Resource> relationResources = CollectionUtils.isNotEmpty(relationResourceIds)
```

### BoundedWildcard
Can generalize to `? super Long`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
     */
    @Override
    public void recurseFindSubProcess(long parentCode, List<Long> ids) {
        List<TaskDefinition> taskNodeList = taskDefinitionDao.getTaskDefinitionListByDefinition(parentCode);

```

### BoundedWildcard
Can generalize to `? extends HttpProperty`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
     * @param httpPropertyList http property list
     */
    protected void setHeaders(HttpUriRequest request, List<HttpProperty> httpPropertyList) {
        if (CollectionUtils.isNotEmpty(httpPropertyList)) {
            for (HttpProperty property : httpPropertyList) {
```

### BoundedWildcard
Can generalize to `? extends HttpProperty`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
     * @param httpPropertyList http property list
     */
    protected void addRequestParams(RequestBuilder builder, List<HttpProperty> httpPropertyList) {
        if (CollectionUtils.isNotEmpty(httpPropertyList)) {
            ObjectNode jsonParam = JSONUtils.createObjectNode();
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTask.java`
#### Snippet
```java
    }

    private void populateSparkResourceDefinitions(List<String> args) {
        int driverCores = sparkParameters.getDriverCores();
        if (driverCores > 0) {
```

### BoundedWildcard
Can generalize to `? extends UdfFuncParameters`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
     * @return
     */
    private List<String> buildJarSql(List<UdfFuncParameters> udfFuncParameters) {
        return udfFuncParameters.stream().map(value -> {
            String defaultFS = value.getDefaultFS();
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
    }

    private String setNonQuerySqlReturn(String updateResult, List<Property> properties) {
        String result = null;
        for (Property info : properties) {
```

### BoundedWildcard
Can generalize to `? extends UdfFuncParameters`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
     * @return
     */
    private List<String> buildTempFuncSql(List<UdfFuncParameters> udfFuncParameters) {
        return udfFuncParameters.stream().map(value -> MessageFormat
                .format(CREATE_OR_REPLACE_FUNCTION_FORMAT, value.getFuncName(), value.getClassName()))
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
    }

    private String replaceOriginalValue(String content, String rgex, Map<String, Property> sqlParamsMap) {
        Pattern pattern = Pattern.compile(rgex);
        while (true) {
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
     * @param sqlParamsMap sql params map
     */
    private void printReplacedSql(String content, String formatSql, String rgex, Map<Integer, Property> sqlParamsMap) {
        // parameter print style
        log.info("after replace sql , preparing : {}", formatSql);
```

### BoundedWildcard
Can generalize to `? extends SqlBinds`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
    }

    private String executeUpdate(Connection connection, List<SqlBinds> statementsBinds,
                                 String handlerType) throws Exception {
        int result = 0;
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
    }

    private void getParamsMapForAutoML(HashMap<String, String> paramsMap) {
        paramsMap.put("automl_tool", automlTool);
        paramsMap.put("repo", MlflowConstants.PRESET_AUTOML_PROJECT);
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
    }

    private void getParamsMapForAutoML(HashMap<String, String> paramsMap) {
        paramsMap.put("automl_tool", automlTool);
        paramsMap.put("repo", MlflowConstants.PRESET_AUTOML_PROJECT);
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
    }

    private void addParamsMapForBasicAlgorithm(HashMap<String, String> paramsMap) {
        paramsMap.put("algorithm", algorithm);
        paramsMap.put("search_params", searchParams);
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
    }

    private void addParamsMapForBasicAlgorithm(HashMap<String, String> paramsMap) {
        paramsMap.put("algorithm", algorithm);
        paramsMap.put("search_params", searchParams);
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     * @return task node list
     */
    private static List<TaskNode> getFlowNodeListPost(TaskNode startNode, List<TaskNode> taskNodeList,
                                                      List<String> visitedNodeCodeList) {
        List<TaskNode> resultList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    private static List<TaskNode> getFlowNodeListPost(TaskNode startNode, List<TaskNode> taskNodeList,
                                                      List<String> visitedNodeCodeList) {
        List<TaskNode> resultList = new ArrayList<>();
        for (TaskNode taskNode : taskNodeList) {
```

### BoundedWildcard
Can generalize to `? extends ProcessTaskRelation`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    public static ProcessDag getProcessDag(List<TaskNode> taskNodeList,
                                           List<ProcessTaskRelation> processTaskRelations) {
        Map<Long, TaskNode> taskNodeMap = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    private static void setTaskNodeSkip(String skipNodeCode,
                                        DAG<String, TaskNode, TaskNodeRelation> dag,
                                        Map<String, TaskInstance> completeTaskList,
                                        Map<String, TaskNode> skipTaskNodeList) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    public static boolean allDependsForbiddenOrEnd(TaskNode taskNode,
                                                   DAG<String, TaskNode, TaskNodeRelation> dag,
                                                   Map<String, TaskNode> skipTaskNodeList,
                                                   Map<String, TaskInstance> completeTaskList) {
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    public static boolean allDependsForbiddenOrEnd(TaskNode taskNode,
                                                   DAG<String, TaskNode, TaskNodeRelation> dag,
                                                   Map<String, TaskNode> skipTaskNodeList,
                                                   Map<String, TaskInstance> completeTaskList) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    private static List<TaskNode> getFlowNodeListPre(TaskNode startNode, List<String> recoveryNodeCodeList,
                                                     List<TaskNode> taskNodeList, List<String> visitedNodeCodeList) {

        List<TaskNode> resultList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     * @return task node
     */
    public static TaskNode findNodeByName(List<TaskNode> nodeDetails, String nodeName) {
        for (TaskNode taskNode : nodeDetails) {
            if (taskNode.getName().equals(nodeName)) {
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     * @return task node
     */
    public static TaskNode findNodeByCode(List<TaskNode> nodeDetails, String nodeCode) {
        for (TaskNode taskNode : nodeDetails) {
            if (Long.toString(taskNode.getCode()).equals(nodeCode)) {
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     * is there have conditions after the parent node
     */
    public static boolean haveConditionsAfterNode(String parentNodeCode, List<TaskNode> taskNodes) {
        if (CollectionUtils.isEmpty(taskNodes)) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends TaskNode`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
     */
    public static boolean haveSubAfterNode(String parentNodeCode,
                                           DAG<String, TaskNode, TaskNodeRelation> dag, String filterNodeType) {
        Set<String> subsequentNodes = dag.getSubsequentNodes(parentNodeCode);
        if (CollectionUtils.isEmpty(subsequentNodes)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTask.java`
#### Snippet
```java
    }

    private void operateInputParameter(Map<String, String> inputParameter,
                                       DataQualityTaskExecutionContext dataQualityTaskExecutionContext) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS);
```

### BoundedWildcard
Can generalize to `? extends ReaderConfig`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/reader/ReaderFactory.java`
#### Snippet
```java

    public List<BatchReader> getReaders(SparkRuntimeEnvironment sparkRuntimeEnvironment,
                                        List<ReaderConfig> readerConfigs) throws DataQualityException {

        List<BatchReader> readerList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends WriterConfig`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/writer/WriterFactory.java`
#### Snippet
```java

    public List<BatchWriter> getWriters(SparkRuntimeEnvironment sparkRuntimeEnvironment,
                                        List<WriterConfig> writerConfigs) throws DataQualityException {

        List<BatchWriter> writerList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends TransformerConfig`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/transformer/TransformerFactory.java`
#### Snippet
```java

    public List<BatchTransformer> getTransformer(SparkRuntimeEnvironment sparkRuntimeEnvironment,
                                                 List<TransformerConfig> transformerConfigs) throws DataQualityException {

        List<BatchTransformer> transformers = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Property`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-procedure/src/main/java/org/apache/dolphinscheduler/plugin/task/procedure/ProcedureTask.java`
#### Snippet
```java
     */
    private Map<Integer, Property> getOutParameterMap(CallableStatement stmt, Map<Integer, Property> paramsMap,
                                                      Map<String, Property> totalParamsMap) throws Exception {
        Map<Integer, Property> outParameterMap = new HashMap<>();
        if (procedureParameters.getLocalParametersMap() == null) {
```

### BoundedWildcard
Can generalize to `? extends BatchReader`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/execution/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void execute(List<BatchReader> readers, List<BatchTransformer> transformers, List<BatchWriter> writers) {
        readers.forEach(reader -> registerInputTempView(reader, environment));

```

### BoundedWildcard
Can generalize to `? extends BatchTransformer`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/execution/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void execute(List<BatchReader> readers, List<BatchTransformer> transformers, List<BatchWriter> writers) {
        readers.forEach(reader -> registerInputTempView(reader, environment));

```

### BoundedWildcard
Can generalize to `? extends BatchWriter`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/execution/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void execute(List<BatchReader> readers, List<BatchTransformer> transformers, List<BatchWriter> writers) {
        readers.forEach(reader -> registerInputTempView(reader, environment));

```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java

    @Override
    public boolean delete(String fullName, List<String> childrenPathList, boolean recursive) throws IOException {
        // append the resource fullName to the list for deletion.
        childrenPathList.add(fullName);
```

### BoundedWildcard
Can generalize to `? extends DqRuleExecuteSql`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    private static void checkAndReplace(List<DqRuleExecuteSql> list, String checkValue, String replaceSrc) {
        if (StringUtils.isEmpty(checkValue) && CollectionUtils.isNotEmpty(list)) {
            for (DqRuleExecuteSql executeSqlDefinition : list) {
```

### BoundedWildcard
Can generalize to `? extends DqRuleInputEntry`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    public static Map<String, String> getInputParameterMapFromEntryList(List<DqRuleInputEntry> defaultInputEntryList) {

        Map<String, String> defaultInputParameterValue = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java

    public static List<BaseConfig> getReaderConfigList(
                                                       Map<String, String> inputParameterValue,
                                                       DataQualityTaskExecutionContext dataQualityTaskExecutionContext) throws DataQualityException {

```

### BoundedWildcard
Can generalize to `? super String`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java

    public static List<BaseConfig> getReaderConfigList(
                                                       Map<String, String> inputParameterValue,
                                                       DataQualityTaskExecutionContext dataQualityTaskExecutionContext) throws DataQualityException {

```

### BoundedWildcard
Can generalize to `? super BaseConfig`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    public static void addStatisticsValueTableReaderConfig(List<BaseConfig> readerConfigList,
                                                           DataQualityTaskExecutionContext dataQualityTaskExecutionContext) {
        if (dataQualityTaskExecutionContext.isComparisonNeedStatisticsValueTable()) {
```

### BoundedWildcard
Can generalize to `? extends MappingColumn`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    public static List<String> getSrcColumnList(List<MappingColumn> mappingColumns) {
        List<String> list = new ArrayList<>();
        mappingColumns.forEach(item -> list.add(item.getSrcField()));
```

### BoundedWildcard
Can generalize to `? super BaseConfig`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    private static int setTransformerConfig(int index,
                                            Map<String, String> inputParameterValueResult,
                                            List<BaseConfig> transformerConfigList,
                                            DqRuleExecuteSql executeSqlDefinition) {
        Map<String, Object> config = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends MappingColumn`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    public static String getOnClause(List<MappingColumn> mappingColumnList,
                                     Map<String, String> inputParameterValueResult) {
        // get on clause
```

### BoundedWildcard
Can generalize to `? extends MappingColumn`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
    }

    public static List<String> getTargetColumnList(List<MappingColumn> mappingColumns) {
        List<String> list = new ArrayList<>();
        mappingColumns.forEach(item -> list.add(item.getTargetField()));
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/constants/ApiFuncIdentificationConstant.java`
#### Snippet
```java
    public static final String MONITOR_STATISTICS_VIEW = "monitor:statistics:view";

    public final static Map<ExecuteType, String> map = new HashMap<ExecuteType, String>();

    static {
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/java/org/apache/dolphinscheduler/alert/AlertSenderService.java`
#### Snippet
```java
     * @return AlertResult
     */
    private @Nullable AlertResult alertResultHandler(AlertPluginInstance instance, AlertData alertData) {
        String pluginInstanceName = instance.getInstanceName();
        int pluginDefineId = instance.getPluginDefineId();
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
     * @return local date
     */
    public static @Nullable Date timeStampToDate(long timeStamp) {
        return timeStamp <= 0L ? null : new Date(timeStamp);
    }
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
     * @return yyyy-MM-dd HH:mm:ss format
     */
    public static @Nullable Date stringToDate(String date) {
        return parse(date, YYYY_MM_DD_HH_MM_SS, null);
    }
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
     * classOfT
     */
    public static @Nullable <T> T parseObject(String json, Class<T> clazz) {
        if (Strings.isNullOrEmpty(json)) {
            return null;
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerDelayTaskExecuteRunnableFactory.java`
#### Snippet
```java
    protected final @NonNull WorkerRpcClient workerRpcClient;
    protected final @NonNull TaskPluginManager taskPluginManager;
    protected final @Nullable StorageOperate storageOperate;

    protected WorkerDelayTaskExecuteRunnableFactory(
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerManagerThread.java`
#### Snippet
```java
    }

    public @Nullable WorkerTaskExecuteRunnable getTaskExecuteThread(Integer taskInstanceId) {
        return taskExecuteThreadMap.get(taskInstanceId);
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java

    // root path in resource storage
    final static String RESOURCE_TAG = "DATA_TRANSFER";

    private TaskFilesTransferUtils() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java

    // suffix of the package file
    final static String PACK_SUFFIX = "_ds_pack.zip";

    // root path in resource storage
```

### MissortedModifiers
Missorted modifiers `final static`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java
public class TaskFilesTransferUtils {

    protected final static Logger log = LoggerFactory
            .getLogger(String.format(TaskConstants.TASK_LOG_LOGGER_NAME_FORMAT, TaskFilesTransferUtils.class));

```

### MissortedModifiers
Missorted modifiers `final static`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java

    // tmp path in local path for transfer
    final static String DOWNLOAD_TMP = ".DT_TMP";

    // suffix of the package file
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java
    protected final WorkerMessageSender workerMessageSender;
    protected final TaskPluginManager taskPluginManager;
    protected final @Nullable StorageOperate storageOperate;
    protected final WorkerRpcClient workerRpcClient;

```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java
    }

    public @Nullable AbstractTask getTask() {
        return task;
    }
```

### MissortedModifiers
Missorted modifiers `protected @Nullable`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java
    protected final WorkerRpcClient workerRpcClient;

    protected @Nullable AbstractTask task;

    protected WorkerTaskExecuteRunnable(
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/log/LogClient.java`
#### Snippet
```java
    }

    public @Nullable List<String> getAppIds(@NonNull String host, int port, @NonNull String taskLogFilePath,
                                            @NonNull String taskAppInfoPath) throws RemotingException, InterruptedException {
        log.info("Begin to get appIds from worker: {}:{} taskLogPath: {}, taskAppInfoPath: {}", host, port,
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ProcessUtils.java`
#### Snippet
```java
     * @return yarn application ids
     */
    public static @Nullable List<String> killApplication(@NonNull LogClient logClient,
                                                         @NonNull TaskExecutionContext taskExecutionContext) {
        if (taskExecutionContext.getLogPath() == null) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
    @Data
    @SuppressWarnings("checkstyle:ModifierOrder")
    public static abstract class LoopTaskMethodYamlDefinition {

        private String url;
```

### MissortedModifiers
Missorted modifiers `protected @Nullable`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/BaseLoopTaskExecutor.java`
#### Snippet
```java
     * The task instance info will be set when task has submitted successful.
     */
    protected @Nullable LoopTaskInstanceInfo loopTaskInstanceInfo;

    protected BaseLoopTaskExecutor(@NonNull TaskExecutionContext taskExecutionContext) {
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
     * @return ProcessDefinition
     */
    private @Nullable ProcessDefinition getProcessDefinitionByCommand(long processDefinitionCode,
                                                                      Map<String, String> cmdParam) {
        if (cmdParam != null) {
```

### MissortedModifiers
Missorted modifiers `protected @Nullable`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
     * @return process instance
     */
    protected @Nullable ProcessInstance constructProcessInstance(Command command,
                                                                 String host) throws CronParseException, CodeGenerateException {
        ProcessInstance processInstance;
```

### MissortedModifiers
Missorted modifiers `static public`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
    }

    static public String getPresetRepository() {
        String presetRepository = PropertyUtils.getString(MlflowConstants.PRESET_REPOSITORY_KEY);
        if (StringUtils.isEmpty(presetRepository)) {
```

### MissortedModifiers
Missorted modifiers `static public`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
    }

    static public String getVersionString(String version, String repository) {
        String versionString;
        if (StringUtils.isEmpty(version)) {
```

### MissortedModifiers
Missorted modifiers `static public`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
    }

    static public String getPresetRepositoryVersion() {
        String version = PropertyUtils.getString(MlflowConstants.PRESET_REPOSITORY_VERSION_KEY);
        if (StringUtils.isEmpty(version)) {
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/security/UserGroupInformationFactory.java`
#### Snippet
```java
    }

    public synchronized static void logout(String userName) {
        Integer currentLoginTimes = currentLoginTimesMap.get(userName);
        if (currentLoginTimes == null) {
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/security/UserGroupInformationFactory.java`
#### Snippet
```java
    }

    public synchronized static UserGroupInformation login(String userName) {
        UserGroupInformation userGroupInformation = userGroupInformationMap.get(userName);
        if (userGroupInformation == null) {
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
            if (authedNamespaceList != null && !authedNamespaceList.isEmpty()) {
                for (K8sNamespace k8sNamespaceAuth : authedNamespaceList) {
                    if (k8sNamespace.equals(k8sNamespaceAuth)) {
                        existAuth = true;
                    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ZoneId.of()` is ignored
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/CheckUtils.java`
#### Snippet
```java
    public static boolean checkTimeZone(String timeZone) {
        try {
            ZoneId.of(timeZone);
            return true;
        } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/MailSender.java`
#### Snippet
```java
                new File(xlsFilePath + EmailConstants.SINGLE_SLASH + randomFilename + EmailConstants.EXCEL_SUFFIX_XLSX);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        // make excel file
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/log/remote/RemoteLogUtils.java`
#### Snippet
```java
    private static void mkdirOfLog(String logPath) {
        Path directory = Paths.get(logPath).getParent();
        directory.toFile().mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
        File file = new File(fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
        File file = new File(fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FileUtils.java`
#### Snippet
```java
            } else {
                if (!scriptFile.getParentFile().exists()) {
                    scriptFile.getParentFile().mkdirs();
                }
                Files.createFile(path, attr);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTask.java`
#### Snippet
```java
                } else {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    Files.createFile(path, attr);
```

## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/processor/queue/TaskExecuteThreadPool.java`
#### Snippet
```java
        }
        multiThreadFilterMap.put(taskExecuteThread.getKey(), taskExecuteThread);
        ListenableFuture future = this.submitListenable(taskExecuteThread::run);
        future.addCallback(new ListenableFutureCallback() {

```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/model/BaseHeartBeatTask.java`
#### Snippet
```java
    @Override
    public void run() {
        while (runningFlag) {
            try {
                if (!ServerLifeCycleManager.isRunning()) {
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
    public Result updateProcessInstance(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                        @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                        @PathVariable(value = "id") Integer id,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                        @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                        @PathVariable(value = "id") Integer id,
                                        @RequestParam(value = "scheduleTime", required = false) String scheduleTime,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
                                        @PathVariable(value = "id") Integer id,
                                        @RequestParam(value = "scheduleTime", required = false) String scheduleTime,
                                        @RequestParam(value = "syncDefine", required = true) Boolean syncDefine,
                                        @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
                                        @RequestParam(value = "locations", required = false) String locations,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
                                        @RequestParam(value = "locations", required = false) String locations,
                                        @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                        @RequestParam(value = "tenantCode", required = true) String tenantCode) {
        Map<String, Object> result = processInstanceService.updateProcessInstance(loginUser, projectCode, id,
                taskRelationJson, taskDefinitionJson, scheduleTime, syncDefine, globalParams, locations, timeout,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
                                                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                                                          @RequestParam("size") Integer size,
                                                                          @RequestParam(value = "startTime", required = true) String startTime,
                                                                          @RequestParam(value = "endTime", required = true) String endTime) {
        Map<String, Object> result = processInstanceService.queryTopNLongestRunningProcessInstance(loginUser,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
                                                                          @RequestParam("size") Integer size,
                                                                          @RequestParam(value = "startTime", required = true) String startTime,
                                                                          @RequestParam(value = "endTime", required = true) String endTime) {
        Map<String, Object> result = processInstanceService.queryTopNLongestRunningProcessInstance(loginUser,
                projectCode, size, startTime, endTime);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
    @Operation(summary = "queryTaskDefinitionListPaging", description = "QUERY_TASK_DEFINITION_LIST_PAGING_NOTES")
    @Parameters({
            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = false, schema = @Schema(implementation = long.class)),
            @Parameter(name = "searchWorkflowName", description = "SEARCH_WORKFLOW_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchTaskName", description = "SEARCH_TASK_NAME", required = false, schema = @Schema(implementation = String.class)),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = false, schema = @Schema(implementation = long.class)),
            @Parameter(name = "searchWorkflowName", description = "SEARCH_WORKFLOW_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchTaskName", description = "SEARCH_TASK_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskType", description = "TASK_TYPE", required = false, schema = @Schema(implementation = String.class, example = "SHELL")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = false, schema = @Schema(implementation = long.class)),
            @Parameter(name = "searchWorkflowName", description = "SEARCH_WORKFLOW_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchTaskName", description = "SEARCH_TASK_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskType", description = "TASK_TYPE", required = false, schema = @Schema(implementation = String.class, example = "SHELL")),
            @Parameter(name = "taskExecuteType", description = "TASK_EXECUTE_TYPE", required = false, schema = @Schema(implementation = TaskExecuteType.class, example = "STREAM")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "searchWorkflowName", description = "SEARCH_WORKFLOW_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchTaskName", description = "SEARCH_TASK_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskType", description = "TASK_TYPE", required = false, schema = @Schema(implementation = String.class, example = "SHELL")),
            @Parameter(name = "taskExecuteType", description = "TASK_EXECUTE_TYPE", required = false, schema = @Schema(implementation = TaskExecuteType.class, example = "STREAM")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "searchTaskName", description = "SEARCH_TASK_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskType", description = "TASK_TYPE", required = false, schema = @Schema(implementation = String.class, example = "SHELL")),
            @Parameter(name = "taskExecuteType", description = "TASK_EXECUTE_TYPE", required = false, schema = @Schema(implementation = TaskExecuteType.class, example = "STREAM")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "10"))
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
    public Result releaseTaskDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @PathVariable(value = "code", required = true) long code,
                                        @RequestParam(value = "releaseState", required = true, defaultValue = "OFFLINE") ReleaseState releaseState) {
        Map<String, Object> result =
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @PathVariable(value = "code", required = true) long code,
                                        @RequestParam(value = "releaseState", required = true, defaultValue = "OFFLINE") ReleaseState releaseState) {
        Map<String, Object> result =
                taskDefinitionService.releaseTaskDefinition(loginUser, projectCode, code, releaseState);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "code", description = "TASK_DEFINITION_CODE", required = true, schema = @Schema(implementation = long.class, example = "1")),
            @Parameter(name = "taskDefinitionJsonObj", description = "TASK_DEFINITION_JSON", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "upstreamCodes", description = "UPSTREAM_CODES", required = false, schema = @Schema(implementation = String.class))
    })
    @PutMapping(value = "/{code}/with-upstream")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
                                         @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                         @PathVariable(value = "code") long code,
                                         @RequestParam(value = "taskDefinitionJsonObj", required = true) String taskDefinitionJsonObj,
                                         @RequestParam(value = "upstreamCodes", required = false) String upstreamCodes) {
        Map<String, Object> result = taskDefinitionService.updateTaskWithUpstream(loginUser, projectCode, code,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
                                       @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                       @PathVariable(value = "code") long code,
                                       @RequestParam(value = "taskDefinitionJsonObj", required = true) String taskDefinitionJsonObj) {
        Map<String, Object> result =
                taskDefinitionService.updateTaskDefinition(loginUser, projectCode, code, taskDefinitionJsonObj);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
    public Result createTaskDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                       @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                       @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson) {
        Map<String, Object> result =
                taskDefinitionService.createTaskDefinition(loginUser, projectCode, taskDefinitionJson);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "processDefinitionCode", description = "PROCESS_DEFINITION_CODE", required = true, schema = @Schema(implementation = long.class)),
            @Parameter(name = "taskDefinitionJsonObj", description = "TASK_DEFINITION_JSON", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "upstreamCodes", description = "UPSTREAM_CODES", required = false, schema = @Schema(implementation = String.class))
    })
    @PostMapping("/save-single")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
    public Result createTaskBindsWorkFlow(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @RequestParam(value = "processDefinitionCode", required = true) long processDefinitionCode,
                                          @RequestParam(value = "taskDefinitionJsonObj", required = true) String taskDefinitionJsonObj,
                                          @RequestParam(value = "upstreamCodes", required = false) String upstreamCodes) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @RequestParam(value = "processDefinitionCode", required = true) long processDefinitionCode,
                                          @RequestParam(value = "taskDefinitionJsonObj", required = true) String taskDefinitionJsonObj,
                                          @RequestParam(value = "upstreamCodes", required = false) String upstreamCodes) {
        Map<String, Object> result = taskDefinitionService.createTaskBindsWorkFlow(loginUser, projectCode,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskInstanceController.java`
#### Snippet
```java
    @Operation(summary = "queryTaskListPaging", description = "QUERY_TASK_INSTANCE_LIST_PAGING_NOTES")
    @Parameters({
            @Parameter(name = "processInstanceId", description = "PROCESS_INSTANCE_ID", required = false, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchVal", description = "SEARCH_VAL", schema = @Schema(implementation = String.class)),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskInstanceController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "processInstanceId", description = "PROCESS_INSTANCE_ID", required = false, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "searchVal", description = "SEARCH_VAL", schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskName", description = "TASK_NAME", schema = @Schema(implementation = String.class)),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskInstanceController.java`
#### Snippet
```java
            @Parameter(name = "startDate", description = "START_DATE", schema = @Schema(implementation = String.class)),
            @Parameter(name = "endDate", description = "END_DATE", schema = @Schema(implementation = String.class)),
            @Parameter(name = "taskExecuteType", description = "TASK_EXECUTE_TYPE", required = false, schema = @Schema(implementation = TaskExecuteType.class, example = "STREAM")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "20")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
    public Result deleteUpstreamRelation(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                         @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                         @RequestParam(name = "preTaskCodes", required = true) String preTaskCodes,
                                         @PathVariable("taskCode") long taskCode) {
        return returnDataList(
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
    public Result createProcessTaskRelation(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                            @RequestParam(name = "processDefinitionCode", required = true) long processDefinitionCode,
                                            @RequestParam(name = "preTaskCode", required = true) long preTaskCode,
                                            @RequestParam(name = "postTaskCode", required = true) long postTaskCode) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
                                            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                            @RequestParam(name = "processDefinitionCode", required = true) long processDefinitionCode,
                                            @RequestParam(name = "preTaskCode", required = true) long preTaskCode,
                                            @RequestParam(name = "postTaskCode", required = true) long postTaskCode) {
        Map<String, Object> result = new HashMap<>();
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
                                            @RequestParam(name = "processDefinitionCode", required = true) long processDefinitionCode,
                                            @RequestParam(name = "preTaskCode", required = true) long preTaskCode,
                                            @RequestParam(name = "postTaskCode", required = true) long postTaskCode) {
        Map<String, Object> result = new HashMap<>();
        if (postTaskCode == 0L) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
    public Result deleteDownstreamRelation(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                           @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                           @RequestParam(name = "postTaskCodes", required = true) String postTaskCodes,
                                           @PathVariable("taskCode") long taskCode) {
        return returnDataList(
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessTaskRelationController.java`
#### Snippet
```java
    public Result deleteTaskProcessRelation(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                            @RequestParam(name = "processDefinitionCode", required = true) long processDefinitionCode,
                                            @PathVariable("taskCode") long taskCode) {
        return returnDataList(processTaskRelationService.deleteTaskProcessRelation(loginUser, projectCode,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result releaseWorkflowAndSchedule(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                             @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                             @PathVariable(value = "code", required = true) long code,
                                             @RequestParam(value = "releaseState", required = true, defaultValue = "OFFLINE") ReleaseState releaseState) {
        return returnDataList(
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                             @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                             @PathVariable(value = "code", required = true) long code,
                                             @RequestParam(value = "releaseState", required = true, defaultValue = "OFFLINE") ReleaseState releaseState) {
        return returnDataList(
                processDefinitionService.releaseWorkflowAndSchedule(loginUser, projectCode, code, releaseState));
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "code", description = "PROCESS_DEFINITION_CODE", required = true, schema = @Schema(implementation = long.class, example = "123456789")),
            @Parameter(name = "locations", description = "PROCESS_DEFINITION_LOCATIONS", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "locations", description = "PROCESS_DEFINITION_LOCATIONS", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
    @PutMapping(value = "/{code}")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result updateProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @RequestParam(value = "name", required = true) String name,
                                          @PathVariable(value = "code", required = true) long code,
                                          @RequestParam(value = "description", required = false) String description,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @RequestParam(value = "name", required = true) String name,
                                          @PathVariable(value = "code", required = true) long code,
                                          @RequestParam(value = "description", required = false) String description,
                                          @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "locations", required = false) String locations,
                                          @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                          @RequestParam(value = "otherParamsJson", required = false) String otherParamsJson,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                          @RequestParam(value = "otherParamsJson", required = false) String otherParamsJson,
                                          @RequestParam(value = "executionType", defaultValue = "PARALLEL") ProcessExecutionTypeEnum executionType,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result releaseProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                           @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                           @PathVariable(value = "code", required = true) long code,
                                           @RequestParam(value = "releaseState", required = true) ReleaseState releaseState) {
        Map<String, Object> result =
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                           @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                           @PathVariable(value = "code", required = true) long code,
                                           @RequestParam(value = "releaseState", required = true) ReleaseState releaseState) {
        Map<String, Object> result =
                processDefinitionService.releaseProcessDefinition(loginUser, projectCode, code, releaseState);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    @Operation(summary = "queryListPaging", description = "QUERY_PROCESS_DEFINITION_LIST_PAGING_NOTES")
    @Parameters({
            @Parameter(name = "searchVal", description = "SEARCH_VAL", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "userId", description = "USER_ID", required = false, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "searchVal", description = "SEARCH_VAL", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "userId", description = "USER_ID", required = false, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "10")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "10")),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
    @GetMapping()
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "name", description = "PROCESS_DEFINITION_NAME", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true, schema = @Schema(implementation = long.class, example = "123456789")),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class))
    })
    @PostMapping(value = "/empty")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result createEmptyProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                               @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                               @RequestParam(value = "name", required = true) String name,
                                               @RequestParam(value = "description", required = false) String description,
                                               @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                               @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
                                               @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                               @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                               @RequestParam(value = "scheduleJson", required = false) String scheduleJson,
                                               @RequestParam(value = "executionType", defaultValue = "PARALLEL") ProcessExecutionTypeEnum executionType) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result moveProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "codes", required = true) String codes,
                                        @RequestParam(value = "targetProjectCode", required = true) long targetProjectCode) {
        return returnDataList(
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "codes", required = true) String codes,
                                        @RequestParam(value = "targetProjectCode", required = true) long targetProjectCode) {
        return returnDataList(
                processDefinitionService.batchMoveProcessDefinition(loginUser, projectCode, codes, targetProjectCode));
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "name", description = "PROCESS_DEFINITION_NAME", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "locations", description = "PROCESS_DEFINITION_LOCATIONS", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "locations", description = "PROCESS_DEFINITION_LOCATIONS", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
    @PostMapping()
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result createProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @RequestParam(value = "name", required = true) String name,
                                          @RequestParam(value = "description", required = false) String description,
                                          @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "locations", required = false) String locations,
                                          @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                          @RequestParam(value = "otherParamsJson", required = false) String otherParamsJson,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                          @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                          @RequestParam(value = "taskRelationJson", required = true) String taskRelationJson,
                                          @RequestParam(value = "taskDefinitionJson", required = true) String taskDefinitionJson,
                                          @RequestParam(value = "otherParamsJson", required = false) String otherParamsJson,
                                          @RequestParam(value = "executionType", defaultValue = "PARALLEL") ProcessExecutionTypeEnum executionType) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "name", description = "PROCESS_DEFINITION_NAME", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "code", description = "PROCESS_DEFINITION_CODE", required = true, schema = @Schema(implementation = long.class, example = "123456789")),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "code", description = "PROCESS_DEFINITION_CODE", required = true, schema = @Schema(implementation = long.class, example = "123456789")),
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            @Parameter(name = "description", description = "PROCESS_DEFINITION_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "releaseState", description = "RELEASE_PROCESS_DEFINITION_NOTES", required = false, schema = @Schema(implementation = ReleaseState.class)),
            @Parameter(name = "otherParamsJson", description = "OTHER_PARAMS_JSON", required = false, schema = @Schema(implementation = String.class))
    })
    @PutMapping(value = "/{code}/basic-info")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result updateProcessDefinitionBasicInfo(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                                   @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                                   @RequestParam(value = "name", required = true) String name,
                                                   @PathVariable(value = "code", required = true) long code,
                                                   @RequestParam(value = "description", required = false) String description,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                                   @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                                   @RequestParam(value = "name", required = true) String name,
                                                   @PathVariable(value = "code", required = true) long code,
                                                   @RequestParam(value = "description", required = false) String description,
                                                   @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                                   @RequestParam(value = "globalParams", required = false, defaultValue = "[]") String globalParams,
                                                   @RequestParam(value = "timeout", required = false, defaultValue = "0") int timeout,
                                                   @RequestParam(value = "tenantCode", required = true) String tenantCode,
                                                   @RequestParam(value = "scheduleJson", required = false) String scheduleJson,
                                                   @RequestParam(value = "otherParamsJson", required = false) String otherParamsJson,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result queryProcessDefinitionByCode(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                               @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                               @PathVariable(value = "code", required = true) long code) {
        Map<String, Object> result =
                processDefinitionService.queryProcessDefinitionByCode(loginUser, projectCode, code);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "name", description = "PROCESS_DEFINITION_NAME", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "code", description = "PROCESS_DEFINITION_CODE", required = false, schema = @Schema(implementation = Long.class)),
    })
    @GetMapping(value = "/verify-name")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result verifyProcessDefinitionName(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                              @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                              @RequestParam(value = "name", required = true) String name,
                                              @RequestParam(value = "code", required = false, defaultValue = "0") long processDefinitionCode) {
        Map<String, Object> result = processDefinitionService.verifyProcessDefinitionName(loginUser, projectCode, name,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
    public Result copyProcessDefinition(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "codes", required = true) String codes,
                                        @RequestParam(value = "targetProjectCode", required = true) long targetProjectCode) {
        return returnDataList(
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
                                        @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                        @RequestParam(value = "codes", required = true) String codes,
                                        @RequestParam(value = "targetProjectCode", required = true) long targetProjectCode) {
        return returnDataList(
                processDefinitionService.batchCopyProcessDefinition(loginUser, projectCode, codes, targetProjectCode));
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/AccessTokenController.java`
#### Snippet
```java
            @Parameter(name = "userId", description = "USER_ID", schema = @Schema(implementation = int.class), required = true),
            @Parameter(name = "expireTime", description = "EXPIRE_TIME", schema = @Schema(implementation = String.class), required = true, example = "2021-12-31 00:00:00"),
            @Parameter(name = "token", description = "TOKEN", required = false, schema = @Schema(implementation = String.class), example = "xxxx")
    })
    @PostMapping()
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/AccessTokenController.java`
#### Snippet
```java
            @Parameter(name = "userId", description = "USER_ID", required = true, schema = @Schema(implementation = int.class)),
            @Parameter(name = "expireTime", description = "EXPIRE_TIME", required = true, schema = @Schema(implementation = String.class), example = "2021-12-31 00:00:00"),
            @Parameter(name = "token", description = "TOKEN", required = false, schema = @Schema(implementation = String.class), example = "xxxx")
    })
    @PutMapping(value = "/{id}")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkerGroupController.java`
#### Snippet
```java
            @Parameter(name = "name", description = "WORKER_GROUP_NAME", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "addrList", description = "WORKER_ADDR_LIST", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "WORKER_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "otherParamsJson", description = "WORKER_PARMS_JSON", required = false, schema = @Schema(implementation = String.class)),
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkerGroupController.java`
#### Snippet
```java
            @Parameter(name = "addrList", description = "WORKER_ADDR_LIST", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "description", description = "WORKER_DESC", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "otherParamsJson", description = "WORKER_PARMS_JSON", required = false, schema = @Schema(implementation = String.class)),
    })
    @PostMapping()
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ExecutorController.java`
#### Snippet
```java
                                          @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                          @Parameter(name = "code", description = "TASK_CODE", required = true) @PathVariable long code,
                                          @RequestParam(value = "version", required = true) int version,
                                          @RequestParam(value = "warningGroupId", required = false, defaultValue = "0") Integer warningGroupId,
                                          @RequestParam(value = "workerGroup", required = false, defaultValue = "default") String workerGroup,
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "id", description = "K8S_NAMESPACE_ID", required = true, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "userName", description = "OWNER", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "limitsCpu", description = "LIMITS_CPU", required = false, schema = @Schema(implementation = double.class)),
            @Parameter(name = "limitsMemory", description = "LIMITS_MEMORY", required = false, schema = @Schema(implementation = int.class))})
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
            @Parameter(name = "id", description = "K8S_NAMESPACE_ID", required = true, schema = @Schema(implementation = int.class, example = "100")),
            @Parameter(name = "userName", description = "OWNER", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "limitsCpu", description = "LIMITS_CPU", required = false, schema = @Schema(implementation = double.class)),
            @Parameter(name = "limitsMemory", description = "LIMITS_MEMORY", required = false, schema = @Schema(implementation = int.class))})
    @PutMapping(value = "/{id}")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
            @Parameter(name = "userName", description = "OWNER", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "limitsCpu", description = "LIMITS_CPU", required = false, schema = @Schema(implementation = double.class)),
            @Parameter(name = "limitsMemory", description = "LIMITS_MEMORY", required = false, schema = @Schema(implementation = int.class))})
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
            @Parameter(name = "namespace", description = "NAMESPACE", required = true, schema = @Schema(implementation = String.class)),
            @Parameter(name = "clusterCode", description = "CLUSTER_CODE", required = true, schema = @Schema(implementation = long.class)),
            @Parameter(name = "limits_cpu", description = "LIMITS_CPU", required = false, schema = @Schema(implementation = double.class)),
            @Parameter(name = "limits_memory", description = "LIMITS_MEMORY", required = false, schema = @Schema(implementation = int.class))
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
            @Parameter(name = "clusterCode", description = "CLUSTER_CODE", required = true, schema = @Schema(implementation = long.class)),
            @Parameter(name = "limits_cpu", description = "LIMITS_CPU", required = false, schema = @Schema(implementation = double.class)),
            @Parameter(name = "limits_memory", description = "LIMITS_MEMORY", required = false, schema = @Schema(implementation = int.class))
    })
    @PostMapping()
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkFlowLineageController.java`
#### Snippet
```java
    public Result verifyTaskCanDelete(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                      @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                      @RequestParam(value = "processDefinitionCode", required = true) long processDefinitionCode,
                                      @RequestParam(value = "taskCode", required = true) long taskCode) {
        Result result = new Result();
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkFlowLineageController.java`
#### Snippet
```java
                                      @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                      @RequestParam(value = "processDefinitionCode", required = true) long processDefinitionCode,
                                      @RequestParam(value = "taskCode", required = true) long taskCode) {
        Result result = new Result();
        Optional<String> taskDepMsg =
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkFlowLineageController.java`
#### Snippet
```java
    public Result<Map<String, Object>> queryWorkFlowLineageByCode(@Parameter(hidden = true) @RequestAttribute(value = SESSION_USER) User loginUser,
                                                                  @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                                                  @PathVariable(value = "workFlowCode", required = true) long workFlowCode) {
        try {
            Map<String, Object> result = workFlowLineageService.queryWorkFlowLineageByCode(projectCode, workFlowCode);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskGroupController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "name", description = "TASK_GROUP_NAME", required = false, schema = @Schema(implementation = String.class)),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "20"))
    })
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskGroupController.java`
#### Snippet
```java
    @Operation(summary = "queryTasksByGroupId", description = "QUERY_ALL_TASKS_GROUP_NOTES")
    @Parameters({
            @Parameter(name = "groupId", description = "GROUP_ID", required = false, schema = @Schema(implementation = int.class, example = "1", defaultValue = "-1")),
            @Parameter(name = "taskInstanceName", description = "TASK_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "taskName")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "processName")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskGroupController.java`
#### Snippet
```java
    @Parameters({
            @Parameter(name = "groupId", description = "GROUP_ID", required = false, schema = @Schema(implementation = int.class, example = "1", defaultValue = "-1")),
            @Parameter(name = "taskInstanceName", description = "TASK_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "taskName")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "processName")),
            @Parameter(name = "status", description = "TASK_GROUP_STATUS", required = false, schema = @Schema(implementation = int.class, example = "1")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskGroupController.java`
#### Snippet
```java
            @Parameter(name = "groupId", description = "GROUP_ID", required = false, schema = @Schema(implementation = int.class, example = "1", defaultValue = "-1")),
            @Parameter(name = "taskInstanceName", description = "TASK_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "taskName")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "processName")),
            @Parameter(name = "status", description = "TASK_GROUP_STATUS", required = false, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskGroupController.java`
#### Snippet
```java
            @Parameter(name = "taskInstanceName", description = "TASK_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "taskName")),
            @Parameter(name = "processInstanceName", description = "PROCESS_INSTANCE_NAME", required = false, schema = @Schema(implementation = String.class, example = "processName")),
            @Parameter(name = "status", description = "TASK_GROUP_STATUS", required = false, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageNo", description = "PAGE_NO", required = true, schema = @Schema(implementation = int.class, example = "1")),
            @Parameter(name = "pageSize", description = "PAGE_SIZE", required = true, schema = @Schema(implementation = int.class, example = "20"))
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/base/Validate.java`
#### Snippet
```java
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")
    public static class Builder {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/base/PluginParams.java`
#### Snippet
```java
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "set")
    public static class Builder {

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessDefinitionLog.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessTaskRelationLog.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessTaskRelationLog.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
```

### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessTaskRelationLog.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinitionLog.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### RedundantMethodOverride
Method `hashCode()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinitionLog.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinitionLog.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
```

### RedundantMethodOverride
Method `afterThrowing()` only delegates to its super method
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/DefaultWorkerDelayTaskExecuteRunnable.java`
#### Snippet
```java

    @Override
    protected void afterThrowing(Throwable throwable) throws TaskException {
        super.afterThrowing(throwable);
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/K8sTaskParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/ConditionsParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/dataquality/DataQualityParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/SqlParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-chunjun/src/main/java/org/apache/dolphinscheduler/plugin/task/chunjun/ChunJunParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

### RedundantMethodOverride
Method `getResourceFilesList()` is identical to its super method
in `dolphinscheduler-task-plugin/dolphinscheduler-task-procedure/src/main/java/org/apache/dolphinscheduler/plugin/task/procedure/ProcedureParameters.java`
#### Snippet
```java

    @Override
    public List<ResourceInfo> getResourceFilesList() {
        return new ArrayList<>();
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/PasswordParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/input/InputParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/input/number/InputNumberParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/radio/RadioParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/group/GroupParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String field, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/fswitch/SwitchParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/select/SelectParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/checkbox/CheckboxParam.java`
#### Snippet
```java
    }

    public static class Builder extends PluginParams.Builder {

        public Builder(String name, String title) {
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
getRetryInterval() \* SEC_2_MINUTES_TIME_UNIT: integer multiplication implicitly cast to long
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
        long failedTimeInterval = DateUtils.differSec(now, getEndTime());
        // task retry does not over time, return false
        return getRetryInterval() * SEC_2_MINUTES_TIME_UNIT < failedTimeInterval;
    }

```

## RuleId[ruleID=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/RegexUtils.java`
#### Snippet
```java
        // Logging should not be vulnerable to injection attacks: Replace pattern-breaking characters
        if (!StringUtils.isEmpty(str)) {
            return str.replaceAll("[\n|\r|\t]", "_");
        }
        return null;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/java/org/apache/dolphinscheduler/alert/AlertSenderService.java`
#### Snippet
```java
    @Override
    public synchronized void start() {
        super.setName("AlertSenderService");
        super.start();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StateWheelExecuteThread.java`
#### Snippet
```java
    @PostConstruct
    public void startWheelThread() {
        super.start();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/consumer/TaskPriorityQueueConsumer.java`
#### Snippet
```java
                .newDaemonFixedThreadExecutor("TaskUpdateQueueConsumerThread", masterConfig.getDispatchTaskNumber());
        log.info("Task priority queue consume thread staring");
        super.start();
        log.info("Task priority queue consume thread started");
    }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`index = index + this.placeholderSuffix.length()` could be simplified to 'index += this.placeholderSuffix.length()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PropertyPlaceholderHelper.java`
#### Snippet
```java
                if (withinNestedPlaceholder > 0) {
                    withinNestedPlaceholder--;
                    index = index + this.placeholderSuffix.length();
                } else {
                    return index;
```

### ReplaceAssignmentWithOperatorAssignment
`index = index + this.simplePrefix.length()` could be simplified to 'index += this.simplePrefix.length()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PropertyPlaceholderHelper.java`
#### Snippet
```java
            } else if (substringMatch(buf, index, this.simplePrefix)) {
                withinNestedPlaceholder++;
                index = index + this.simplePrefix.length();
            } else {
                index++;
```

### ReplaceAssignmentWithOperatorAssignment
`num = num + expression.charAt(i)` could be simplified to 'num += expression.charAt(i)'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i))) {
                num = num + expression.charAt(i);
            } else {
                if (!StringUtils.isEmpty(num)) {
```

### ReplaceAssignmentWithOperatorAssignment
`x = x + 1` could be simplified to 'x += 1'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
        String[] command =
                {"sh", "-c", String.format(MlflowConstants.DOCKER_HEALTH_CHECK, mlflowParameters.getContainerName())};
        for (int x = 0; x < MlflowConstants.DOCKER_HEALTH_CHECK_TIMEOUT; x = x + 1) {
            String status;
            try {
```

### ReplaceAssignmentWithOperatorAssignment
`x = x + 1` could be simplified to 'x += 1'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowHelper.java`
#### Snippet
```java
        if (status.has("conditions")) {
            JsonNode conditions = status.get("conditions");
            for (int x = messageIndex; x < conditions.size(); x = x + 1) {
                JsonNode condition = conditions.get(x);
                String stepMessage = condition.toString();
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
                StandardCharsets.UTF_8)), StandardCharsets.UTF_8));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(DEPENDENT_SPLIT)) {
                String[] tmpStringArray = line.split(":\\|\\|");
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java

            ZipEntry entry;
            while ((entry = zIn.getNextEntry()) != null) {
                totalEntryArchive++;
                int totalSizeArchive = 0;
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
                    List<String> upstreams = Collections.emptyList();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        int nBytes = line.getBytes(StandardCharsets.UTF_8).length;
                        totalSizeEntry += nBytes;
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-script/src/main/java/org/apache/dolphinscheduler/plugin/alert/script/StreamGobbler.java`
#### Snippet
```java
            String line;
            StringBuilder output = new StringBuilder();
            while ((line = inputBufferReader.readLine()) != null) {
                output.append(line);
                output.append(System.getProperty("line.separator"));
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OSUtils.java`
#### Snippet
```java
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(":")) {
                    String[] userInfo = line.split(":");
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/ScriptRunner.java`
#### Snippet
```java
            LineNumberReader lineReader = new LineNumberReader(reader);
            String line;
            while ((line = lineReader.readLine()) != null) {
                if (command == null) {
                    command = new ArrayList<>();
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/ShellExecutor.java`
#### Snippet
```java
        int nRead;
        String line = "";
        while ((nRead = lines.read(buf, 0, buf.length)) > 0) {
            line = new String(buf, 0, nRead);
            output.append(line);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/processor/LoggerRequestProcessor.java`
#### Snippet
```java
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/LoggerUtils.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while ((line = br.readLine()) != null) {
                sb.append(line + "\r\n");
            }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/task/RegistryLockManager.java`
#### Snippet
```java
            MysqlRegistryLock mysqlRegistryLock;
            try {
                while ((mysqlRegistryLock = mysqlOperator.tryToAcquireLock(lockKey)) == null) {
                    log.debug("Acquire the lock {} failed try again", key);
                    // acquire failed, wait and try again
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
            try (BufferedReader inReader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = inReader.readLine()) != null) {
                    if (line.startsWith("${setValue(") || line.startsWith("#{setValue(")) {
                        varPool.append(findVarPool(line));
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java
        String tempUri;

        if (jdbcUrl == null || !jdbcUrl.startsWith("jdbc:") || (pos1 = jdbcUrl.indexOf(COLON, 5)) == -1) {
            return null;
        }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java
        String database = "";
        String port = "";
        if (((pos2 = jdbcUrl.indexOf(SEMICOLON, pos1)) == -1) && ((pos2 = jdbcUrl.indexOf(QUESTION, pos1)) == -1)) {
            tempUri = jdbcUrl.substring(pos1 + 1);
        } else {
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java
        String database = "";
        String port = "";
        if (((pos2 = jdbcUrl.indexOf(SEMICOLON, pos1)) == -1) && ((pos2 = jdbcUrl.indexOf(QUESTION, pos1)) == -1)) {
            tempUri = jdbcUrl.substring(pos1 + 1);
        } else {
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java

        if (tempUri.startsWith(DOUBLE_SLASH)) {
            if ((pos = tempUri.indexOf(SINGLE_SLASH, 2)) != -1) {
                host = tempUri.substring(2, pos);
                database = tempUri.substring(pos + 1);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java
                database = tempUri.substring(pos + 1);

                if ((pos = host.indexOf(COLON)) != -1) {
                    port = host.substring(pos + 1);
                    host = host.substring(0, pos);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/LogUtils.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while ((line = br.readLine()) != null) {
                sb.append(line + "\r\n");
            }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/ShellExecutor.java`
#### Snippet
```java
        int nRead;
        String line = "";
        while ((nRead = lines.read(buf, 0, buf.length)) > 0) {
            line = new String(buf, 0, nRead);
            output.append(line);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java

        int scriptStart = 0;
        while ((scriptStart = rawScript.indexOf("${setShareVar(${", scriptStart)) != -1) {
            int start = -1;
            int end = rawScript.indexOf('}', scriptStart + len);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTask.java`
#### Snippet
```java
        int len = "${setShareVar(${".length();
        int scriptStart = 0;
        while ((scriptStart = rawScript.indexOf("${setShareVar(${", scriptStart)) != -1) {
            int start = -1;
            int end = rawScript.indexOf('}', scriptStart + len);
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
            byte[] readBuf = new byte[1024];
            int readLen;
            while ((readLen = s3is.read(readBuf)) > 0) {
                fos.write(readBuf, 0, readLen);
            }
```

### NestedAssignment
Result of assignment expression used
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
            byte[] readBuf = new byte[1024];
            int readLen;
            while ((readLen = ossInputStream.read(readBuf)) > 0) {
                fos.write(readBuf, 0, readLen);
            }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/AccessLogAspect.java`
#### Snippet
```java
        if (exists) {
            char[] chars = originalData.toCharArray();
            stream.forEach(idx -> {
                chars[idx] = '*';
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskDefinitionLogDaoImpl.java`
#### Snippet
```java
            }
        }
        taskCodeVersionMap.forEach((code, version) -> {
            taskDefinitionLogs.add((TaskDefinitionLog) taskDefinitionDao.findTaskDefinition(code, version));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/log/remote/OssRemoteLogHandler.java`
#### Snippet
```java
                .findFirst()
                .orElseThrow(() -> {
                    return new IllegalArgumentException(
                            "bucketName: " + bucketName + " does not exist, you need to create them by yourself");
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/PropertyUtils.java`
#### Snippet
```java
                Properties subProperties = new Properties();
                subProperties.load(fis);
                subProperties.forEach((k, v) -> {
                    log.debug("Get property {} -> {}", k, v);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/DependentTaskProcessor.java`
#### Snippet
```java
        Set<Long> processDefinitionCodes = new HashSet<>();
        Set<Long> taskDefinitionCodes = new HashSet<>();
        dependTaskList.forEach(dependentTaskModel -> {
            dependentTaskModel.getDependItemList().forEach(dependentItem -> {
                projectCodes.add(dependentItem.getProjectCode());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/processor/StateEventCallbackService.java`
#### Snippet
```java
    public void sendResult(Host host, Command command) {
        log.info("send result, host:{}, command:{}", host.getAddress(), command.toString());
        newRemoteChannel(host).ifPresent(nettyRemoteChannel -> {
            nettyRemoteChannel.writeAndFlush(command);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/message/MessageRetryRunner.java`
#### Snippet
```java
        Map<CommandType, BaseCommand> needToRetryMessages = this.needToRetryMessages.get(taskInstanceId);
        if (needToRetryMessages != null) {
            needToRetryMessages.values().forEach(baseMessage -> {
                baseMessage.setMessageReceiverAddress(messageReceiverHost);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
        Map<Long, TaskNode> taskNodeMap = new HashMap<>();

        taskNodeList.forEach(taskNode -> {
            taskNodeMap.putIfAbsent(taskNode.getCode(), taskNode);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
                .findFirst()
                .orElseThrow(() -> {
                    return new IllegalArgumentException(
                            "bucketName: " + bucketName + " is not exists, you need to create them by yourself");
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
                .findFirst()
                .orElseThrow(() -> {
                    return new IllegalArgumentException(
                            "bucketName: " + bucketName + " does not exist, you need to create them by yourself");
                });
```

## RuleId[ruleID=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/vo/TaskDefinitionVo.java`
#### Snippet
```java
 * @author fanwanlong
 */
@Data
public class TaskDefinitionVo extends TaskDefinition {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/task/TaskFilterRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TaskFilterRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/user/UserListResponse.java`
#### Snippet
```java
 * user List response
 */
@Data
public class UserListResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueQueryRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class QueueQueryRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueCreateResponse.java`
#### Snippet
```java
 * queue create response
 */
@Data
public class QueueCreateResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueListResponse.java`
#### Snippet
```java
 * queue List response
 */
@Data
public class QueueListResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueVerifyResponse.java`
#### Snippet
```java
 * queue verify response
 */
@Data
public class QueueVerifyResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueUpdateResponse.java`
#### Snippet
```java
 * queue update response
 */
@Data
public class QueueUpdateResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectUpdateResponse.java`
#### Snippet
```java
 * project update response
 */
@Data
public class ProjectUpdateResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/queue/QueueListPagingResponse.java`
#### Snippet
```java
 * queue list paging response
 */
@Data
public class QueueListPagingResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectQueryRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ProjectQueryRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectListPagingResponse.java`
#### Snippet
```java
 * project List paging response
 */
@Data
public class ProjectListPagingResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectQueryResponse.java`
#### Snippet
```java
 * project query response
 */
@Data
public class ProjectQueryResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectDeleteResponse.java`
#### Snippet
```java
 * project delete response
 */
@Data
public class ProjectDeleteResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectListResponse.java`
#### Snippet
```java
 * project List response
 */
@Data
public class ProjectListResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/project/ProjectCreateResponse.java`
#### Snippet
```java
 * project create response
 */
@Data
public class ProjectCreateResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/schedule/ScheduleFilterRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ScheduleFilterRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/DeleteDataTransferResponse.java`
#### Snippet
```java
import lombok.Data;

@Data
public class DeleteDataTransferResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/workflow/WorkflowFilterRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class WorkflowFilterRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskInstance/TaskInstanceListPagingResponse.java`
#### Snippet
```java
 * task instance list paging response
 */
@Data
public class TaskInstanceListPagingResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskInstance/TaskInstanceSuccessResponse.java`
#### Snippet
```java
 * task instance success response
 */
@Data
public class TaskInstanceSuccessResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskInstance/TaskInstanceRemoveCacheResponse.java`
#### Snippet
```java
 * task instance success response
 */
@Data
public class TaskInstanceRemoveCacheResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskInstance/TaskInstanceQueryRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TaskInstanceQueryRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskRelation/TaskRelationUpdateUpstreamRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TaskRelationUpdateUpstreamRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/workflowInstance/WorkflowExecuteResponse.java`
#### Snippet
```java
 * user List response
 */
@Data
public class WorkflowExecuteResponse extends Result {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/workflowInstance/WorkflowInstanceQueryRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class WorkflowInstanceQueryRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/taskRelation/TaskRelationFilterRequest.java`
#### Snippet
```java
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TaskRelationFilterRequest extends PageQueryDto {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/exceptions/ServiceException.java`
#### Snippet
```java
import lombok.Data;

@Data
public class ServiceException extends RuntimeException {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
    }

    @Data
    public static class LoopTaskSubmitMethodYamlDefinition extends LoopTaskMethodYamlDefinition {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
    }

    @Data
    public static class LoopTaskCancelYamlDefinition extends LoopTaskMethodYamlDefinition {
    }
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
    }

    @Data
    public static class LoopTaskQueryStateYamlDefinition extends LoopTaskMethodYamlDefinition {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/K8sTaskParameters.java`
#### Snippet
```java
 * k8s task parameters
 */
@Data
public class K8sTaskParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsParameters.java`
#### Snippet
```java
import com.amazonaws.services.databasemigrationservice.model.Tag;

@Data
public class DmsParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class DvcParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class JavaParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisParameters.java`
#### Snippet
```java
import lombok.Setter;

@Data
public class LinkisParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class MlflowParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-hivecli/src/main/java/org/apache/dolphinscheduler/plugin/task/hivecli/HiveCliParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class HiveCliParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-jupyter/src/main/java/org/apache/dolphinscheduler/plugin/task/jupyter/JupyterParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class JupyterParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pytorch/src/main/java/org/apache/dolphinscheduler/plugin/task/pytorch/PytorchParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class PytorchParameters extends AbstractParameters {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowParameters.java`
#### Snippet
```java
import lombok.Data;

@Data
public class KubeflowParameters extends AbstractParameters {

```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `subscribers` are queried, but never updated
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/audit/AuditPublishService.java`
#### Snippet
```java

    @Autowired
    private List<AuditSubscriber> subscribers;

    @Autowired
```

### MismatchedCollectionQueryUpdate
Contents of collection `removePreTaskSet` are updated, but never queried
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
                .queryUpstreamByCode(projectCode, taskCode);
        // remove pre
        Set<Long> removePreTaskSet = new HashSet<>();
        List<ProcessTaskRelation> removePreTaskList = new ArrayList<>();
        // add pre
```

### MismatchedCollectionQueryUpdate
Contents of collection `beanMap` are queried, but never updated
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/CollectionUtils.java`
#### Snippet
```java
        Map<String, Object> instanceMap;
        for (T instance : originList) {
            BeanMap beanMap = new BeanMap(instance);
            instanceMap = new LinkedHashMap<>(16, 0.75f, true);
            for (Map.Entry<Object, Object> entry : beanMap.entrySet()) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `workflowEventHandlerList` are queried, but never updated
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowEventLooper.java`
#### Snippet
```java

    @Autowired
    private List<WorkflowEventHandler> workflowEventHandlerList;

    private final Map<WorkflowEventType, WorkflowEventHandler> workflowEventHandlerMap = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `completeTaskList` are updated, but never queried
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
        List<TaskInstance> taskInstances = taskInstanceDao.findValidTaskListByProcessId(
                taskInstance.getProcessInstanceId(), processInstance.getTestFlag());
        Map<String, TaskExecutionStatus> completeTaskList = new HashMap<>();
        for (TaskInstance task : taskInstances) {
            completeTaskList.putIfAbsent(task.getName(), task.getState());
```

### MismatchedCollectionQueryUpdate
Contents of collection `masterNodes` are updated, but never queried
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/registry/ServerNodeManager.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, Set<String>> workerGroupNodes = new ConcurrentHashMap<>();

    private final Set<String> masterNodes = new HashSet<>();

    private final Map<String, WorkerHeartBeat> workerNodeInfo = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `taskEventHandlerList` are queried, but never updated
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/processor/queue/TaskExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private List<TaskEventHandler> taskEventHandlerList;

    @Autowired
```

### MismatchedCollectionQueryUpdate
Contents of collection `messageSenders` are queried, but never updated
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/rpc/WorkerMessageSender.java`
#### Snippet
```java

    @Autowired
    private List<MessageSender> messageSenders;

    private Map<CommandType, MessageSender> messageSenderMap = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `messageSenders` are queried, but never updated
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/message/MessageRetryRunner.java`
#### Snippet
```java
    @Lazy
    @Autowired
    private List<MessageSender> messageSenders;

    private Map<CommandType, MessageSender<BaseCommand>> messageSenderMap = new HashMap<>();
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `LOCAL_ADDRESS` is accessed in both synchronized and unsynchronized contexts
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
    private static final String NETWORK_PRIORITY_INNER = "inner";
    private static final String NETWORK_PRIORITY_OUTER = "outer";
    private static InetAddress LOCAL_ADDRESS = null;
    private static volatile String HOST_ADDRESS;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serverStartupTime` is accessed in both synchronized and unsynchronized contexts
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/lifecycle/ServerLifeCycleManager.java`
#### Snippet
```java
    private static volatile ServerStatus serverStatus = ServerStatus.RUNNING;

    private static long serverStartupTime = System.currentTimeMillis();

    public static long getServerStartupTime() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `initialized` is accessed in both synchronized and unsynchronized contexts
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/config/ServiceBean.java`
#### Snippet
```java
    private static Map<String, Class> serviceMap = new HashMap<>();

    private static AtomicBoolean initialized = new AtomicBoolean(false);

    private ServiceBean() {
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
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
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
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
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
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
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
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
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
        env.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
        env.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
        env.put(Context.PROVIDER_URL, ldapUrls);
        return env;
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
                while (attrs.hasMore()) {
                    // Open another connection to the LDAP server with the found DN and the password
                    searchEnv.put(Context.SECURITY_PRINCIPAL, result.getNameInNamespace());
                    searchEnv.put(Context.SECURITY_CREDENTIALS, userPwd);
                    try {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
                    // Open another connection to the LDAP server with the found DN and the password
                    searchEnv.put(Context.SECURITY_PRINCIPAL, result.getNameInNamespace());
                    searchEnv.put(Context.SECURITY_CREDENTIALS, userPwd);
                    try {
                        new InitialDirContext(searchEnv);
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/AccessLogAspect.java`
#### Snippet
```java

    @Pointcut("@annotation(org.apache.dolphinscheduler.api.aspect.AccessLogAnnotation)")
    public void logPointCut() {
        // Do nothing because of it's a pointcut
    }
```

### EmptyMethod
The method is empty
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/CacheEvictAspect.java`
#### Snippet
```java

    @Pointcut("@annotation(org.springframework.cache.annotation.CacheEvict)")
    public void cacheEvictPointCut() {
        // Do nothing because of it's a pointcut
    }
```

### EmptyMethod
All implementations of this method are empty
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ProcessDefinitionService.java`
#### Snippet
```java
     * @param processDefinition
     */
    void deleteOtherRelation(Project project, Map<String, Object> result, ProcessDefinition processDefinition);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ProcessDefinitionService.java`
#### Snippet
```java
     * @param otherParamsJson
     */
    void saveOtherRelation(User loginUser, ProcessDefinition processDefinition, Map<String, Object> result,
                           String otherParamsJson);

```

### EmptyMethod
The method is empty
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
    }

    private void fillWorkflowInfo(long projectCode, IPage<TaskMainInfo> taskMainInfoIPage) {

    }
```

### EmptyMethod
Method only calls its super
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessTaskRelationLog.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### EmptyMethod
Method only calls its super
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessTaskRelationLog.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### EmptyMethod
Method only calls its super
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinitionLog.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return super.hashCode();
    }
```

### EmptyMethod
Method only calls its super
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinitionLog.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### EmptyMethod
All implementations of this method are empty
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/executor/ExecutorManager.java`
#### Snippet
```java
     * @throws ExecuteException if error throws ExecuteException
     */
    void beforeExecute(ExecutionContext executeContext) throws ExecuteException;

    /**
```

### EmptyMethod
All implementations of this method are empty
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/executor/ExecutorManager.java`
#### Snippet
```java
     * @throws ExecuteException if error throws ExecuteException
     */
    void afterExecute(ExecutionContext context) throws ExecuteException;
}

```

### EmptyMethod
The method is empty
in `dolphinscheduler-scheduler-plugin/dolphinscheduler-scheduler-quartz/src/main/java/org/apache/dolphinscheduler/scheduler/quartz/QuartzZeroSizeThreadPool.java`
#### Snippet
```java
     * @param count never use
     */
    public void setThreadCount(int count) {
        // do nothing
    }
```

### EmptyMethod
Method only calls its super
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/DefaultWorkerDelayTaskExecuteRunnable.java`
#### Snippet
```java

    @Override
    protected void afterExecute() {
        super.afterExecute();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-aop/src/main/java/org/apache/dolphinscheduler/aop/YarnClientAspect.java`
#### Snippet
```java
     * The current application report when application submitted successfully
     */
    private ApplicationReport currentApplicationReport = null;

    private final String appInfoFilePath;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/Resource.java`
#### Snippet
```java
     * is directory
     */
    private boolean isDirectory = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/base/Validate.java`
#### Snippet
```java
    public static class Builder {

        private boolean required = false;

        private String message;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/HttpUtils.java`
#### Snippet
```java
    private static PoolingHttpClientConnectionManager cm;

    private static SSLContext ctx = null;

    private static SSLConnectionSocketFactory socketFactory;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
    private static final String NETWORK_PRIORITY_INNER = "inner";
    private static final String NETWORK_PRIORITY_OUTER = "outer";
    private static InetAddress LOCAL_ADDRESS = null;
    private static volatile String HOST_ADDRESS;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/CodeGenerateUtils.java`
#### Snippet
```java
    }

    private static CodeGenerateUtils instance = null;

    public static synchronized CodeGenerateUtils getInstance() throws CodeGenerateException {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/CodeGenerateUtils.java`
#### Snippet
```java
    private static final long HIGH_DIGIT_LEFT = LOW_DIGIT_BIT + MIDDLE_BIT;
    private final long machineHash;
    private long lowDigit = 0L;
    private long recordMillisecond = -1L;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OSUtils.java`
#### Snippet
```java
    private static final HardwareAbstractionLayer hal = SI.getHardware();
    private static long[] prevTicks = new long[CentralProcessor.TickType.values().length];
    private static long prevTickTime = 0L;
    private static double cpuUsage = 0.0D;

```

### RedundantFieldInitialization
Field initialization to `0.0D` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OSUtils.java`
#### Snippet
```java
    private static long[] prevTicks = new long[CentralProcessor.TickType.values().length];
    private static long prevTickTime = 0L;
    private static double cpuUsage = 0.0D;

    private OSUtils() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/ScriptRunner.java`
#### Snippet
```java

    private String delimiter = DEFAULT_DELIMITER;
    private boolean fullLineDelimiter = false;

    public ScriptRunner(Connection connection, boolean autoCommit, boolean stopOnError) {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
     * Time after which the executing script would be timedout
     */
    protected long timeOutInterval = 0L;
    /**
     * If or not script timed out
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SubTaskProcessor.java`
#### Snippet
```java
public class SubTaskProcessor extends BaseTaskProcessor {

    private ProcessInstance subProcessInstance = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    protected boolean paused = false;

    protected boolean timeout = false;

    protected TaskInstance taskInstance = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            LoggerFactory.getLogger(String.format(TaskConstants.TASK_LOG_LOGGER_NAME_FORMAT, getClass()));

    protected boolean killed = false;

    protected boolean paused = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    protected boolean killed = false;

    protected boolean paused = false;

    protected boolean timeout = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
    protected boolean timeout = false;

    protected TaskInstance taskInstance = null;

    protected ProcessInstance processInstance;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/registry/ServerNodeManager.java`
#### Snippet
```java
    private final List<WorkerInfoChangeListener> workerInfoChangeListeners = new ArrayList<>();

    private volatile int currentSlot = 0;

    private volatile int totalSlot = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/registry/ServerNodeManager.java`
#### Snippet
```java
    private volatile int currentSlot = 0;

    private volatile int totalSlot = 0;

    public int getSlot() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
     * submit failure nodes
     */
    private boolean taskFailedSubmit = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/protocol/MessageHeader.java`
#### Snippet
```java
    private byte eventType;

    private int msgLength = 0;

    private long requestId = 0L;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/protocol/MessageHeader.java`
#### Snippet
```java
    private int msgLength = 0;

    private long requestId = 0L;

    private byte serialization = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/protocol/MessageHeader.java`
#### Snippet
```java
    private long requestId = 0L;

    private byte serialization = 0;

    private short magic = RpcProtocolConstants.MAGIC;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/config/WorkerConfig.java`
#### Snippet
```java
    private int hostWeight = 100;
    private boolean tenantAutoCreate = true;
    private boolean tenantDistributedUser = false;
    private int maxCpuLoadAvg = -1;
    private double reservedMemory = 0.3;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/DataQualityTaskExecutionContext.java`
#### Snippet
```java
     * if comparison value calculate from statistics value table
     */
    private boolean comparisonNeedStatisticsValueTable = false;
    /**
     * compare with fixed value
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/DataQualityTaskExecutionContext.java`
#### Snippet
```java
     * compare with fixed value
     */
    private boolean compareWithFixedValue = false;
    /**
     * error output path
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractTask.java`
#### Snippet
```java
    protected volatile int exitStatusCode = -1;

    protected boolean needAlert = false;

    protected TaskAlertInfo taskAlertInfo;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractShell.java`
#### Snippet
```java
     * Time after which the executing script would be timedout
     */
    protected long timeOutInterval = 0L;
    /**
     * If or not script timed out
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
    protected LinkedBlockingQueue<String> logBuffer;

    protected boolean logOutputIsSuccess = false;

    /*
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/BaseLoopTaskExecutor.java`
#### Snippet
```java
     * cancel flag
     */
    protected volatile boolean cancel = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/model/TaskResponse.java`
#### Snippet
```java
     * cancel
     */
    private volatile boolean cancel = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dinky/src/main/java/org/apache/dolphinscheduler/plugin/task/dinky/DinkyParameters.java`
#### Snippet
```java
    private String address;
    private String taskId;
    private boolean online = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowHelper.java`
#### Snippet
```java
    private final String clusterConfigPath;

    private int messageIndex = 0;

    public KubeflowHelper(String clusterConfigPath) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
            });

    private volatile boolean yarnEnabled = false;

    private Configuration configuration;
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/ProcessDefinitionLog.java`
#### Snippet
```java
 */
@TableName("t_ds_process_definition_log")
public class ProcessDefinitionLog extends ProcessDefinition {

    /**
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinition.java`
#### Snippet
```java
@Data
@TableName("t_ds_task_definition")
public class TaskDefinition {

    /**
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
                org.apache.commons.io.FileUtils.forceDelete(execLocalPathFile);
            } catch (Exception ex) {
                if (ex instanceof NoSuchFileException || ex.getCause() instanceof NoSuchFileException) {
                    // this file is already be deleted.
                } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/TaskRunningEventHandler.java`
#### Snippet
```java
        } catch (Exception ex) {
            TaskInstanceUtils.copyTaskInstance(oldTaskInstance, taskInstance);
            if (ex instanceof TaskEventHandleError) {
                throw ex;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/TaskDispatchEventHandler.java`
#### Snippet
```java
            // rollback status
            TaskInstanceUtils.copyTaskInstance(oldTaskInstance, taskInstance);
            if (ex instanceof TaskEventHandleError) {
                throw ex;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/TaskUpdatePidEventHandler.java`
#### Snippet
```java
        } catch (Exception ex) {
            TaskInstanceUtils.copyTaskInstance(oldTaskInstance, taskInstance);
            if (ex instanceof TaskEventHandleError) {
                throw ex;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/TaskDelayEventHandler.java`
#### Snippet
```java
        } catch (Exception ex) {
            TaskInstanceUtils.copyTaskInstance(oldTaskInstance, taskInstance);
            if (ex instanceof TaskEventHandleError) {
                throw ex;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java
                log.info("Success clear the task execute file: {}", execLocalPath);
            } catch (IOException e) {
                if (e instanceof NoSuchFileException) {
                    // this is expected
                } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/MysqlOperator.java`
#### Snippet
```java
            return mysqlRegistryLock;
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                return null;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
            log.error("execute PIGEON dataX faild,PIGEON task name:" + targetJobName, e);
            setExitStatusCode(TaskConstants.EXIT_CODE_FAILURE);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `WorkflowEventHandleError` does not end with 'Exception'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/WorkflowEventHandleError.java`
#### Snippet
```java
package org.apache.dolphinscheduler.server.master.event;

public class WorkflowEventHandleError extends Exception {

    public WorkflowEventHandleError(String message) {
```

### ExceptionNameDoesntEndWithException
Exception class name `StateEventHandleError` does not end with 'Exception'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/StateEventHandleError.java`
#### Snippet
```java
 * And when we get this exception, we will drop the event.
 */
public class StateEventHandleError extends Exception {

    public StateEventHandleError(String message) {
```

### ExceptionNameDoesntEndWithException
Exception class name `TaskEventHandleError` does not end with 'Exception'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/TaskEventHandleError.java`
#### Snippet
```java
package org.apache.dolphinscheduler.server.master.event;

public class TaskEventHandleError extends Exception {

    public TaskEventHandleError(String message) {
```

### ExceptionNameDoesntEndWithException
Exception class name `StateEventHandleFailure` does not end with 'Exception'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/StateEventHandleFailure.java`
#### Snippet
```java
 * we will move the event to the fail of the queue.
 */
public class StateEventHandleFailure extends Exception {

    public StateEventHandleFailure(String message) {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-27-05-48-14.703.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FileUtils.java`
#### Snippet
```java
        String initOptionsString = StringUtils.join(
                FlinkArgsUtils.buildInitOptionsForSql(flinkParameters),
                FlinkConstants.FLINK_SQL_NEWLINE).concat(FlinkConstants.FLINK_SQL_NEWLINE);
        writeScriptFile(initScriptFilePath, initOptionsString + flinkParameters.getInitScript());
        writeScriptFile(scriptFilePath, flinkParameters.getRawScript());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
        List<LinkisParameters.Param> paramList = linkisParameters.getParamScript();
        for (LinkisParameters.Param param : paramList) {
            script = script.concat(param.getProps())
                    .concat(Constants.SPACE)
                    .concat(param.getValue());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
        for (LinkisParameters.Param param : paramList) {
            script = script.concat(param.getProps())
                    .concat(Constants.SPACE)
                    .concat(param.getValue());
        }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
            script = script.concat(param.getProps())
                    .concat(Constants.SPACE)
                    .concat(param.getValue());
        }
        script = parseScript(script);
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java
                                           @Nullable Map<String, Object> requestBodyMap) throws IOException {

        StringBuffer stringBuffer = new StringBuffer();
        if (requestBodyMap != null) {
            for (String key : requestBodyMap.keySet()) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer errs` may be declared as 'StringBuilder'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                if (!triggerResult.isSuccess()) {
                    List<String> errormsg = triggerResult.getErrormsg();
                    StringBuffer errs = new StringBuffer();
                    if (CollectionUtils.isNotEmpty(errormsg)) {
                        errs.append(",errs:").append(errormsg.stream().collect(Collectors.joining(",")));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer errs` may be declared as 'StringBuilder'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
            if (!cancelResult.isSuccess()) {
                List<String> errormsg = triggerResult.getErrormsg();
                StringBuffer errs = new StringBuffer();
                if (CollectionUtils.isNotEmpty(errormsg)) {
                    errs.append(",errs:").append(errormsg.stream().collect(Collectors.joining(",")));
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
        String[] atMobileArray =
                org.apache.commons.lang3.StringUtils.isNotBlank(atMobiles) ? atMobiles.split(",")
                        : new String[0];
        String[] atUserArray =
                org.apache.commons.lang3.StringUtils.isNotBlank(atUserIds) ? atUserIds.split(",")
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
        String[] atUserArray =
                org.apache.commons.lang3.StringUtils.isNotBlank(atUserIds) ? atUserIds.split(",")
                        : new String[0];
        boolean isAtAll = Objects.isNull(atAll) ? false : atAll;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/PropertyUtils.java`
#### Snippet
```java
        String value = getString(key);
        if (Strings.isNullOrEmpty(value)) {
            return new String[0];
        }
        return value.split(splitStr);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/processor/TaskExecuteStartProcessor.java`
#### Snippet
```java
        Command response = new Command(command.getOpaque());
        response.setType(CommandType.TASK_EXECUTE_START);
        response.setBody(new byte[0]);
        channel.writeAndFlush(response);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/codec/NettyEncoder.java`
#### Snippet
```java
        byteBuf.writeByte(msgHeader.getSerialization());
        byteBuf.writeLong(msgHeader.getRequestId());
        byte[] data = new byte[0];
        int msgLength = msgHeader.getMsgLength();
        Serializer rpcSerializer = RpcSerializer.getSerializerByType(msgHeader.getSerialization());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/processor/LoggerRequestProcessor.java`
#### Snippet
```java
            log.error("get file bytes error", e);
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ShellUtils.java`
#### Snippet
```java
    public List<String> ENV_SOURCE_LIST = Arrays.stream(
            Optional.ofNullable(PropertyUtils.getString("shell.env_source_list")).map(s -> s.split(","))
                    .orElse(new String[0]))
            .map(String::trim)
            .filter(StringUtils::isNotBlank)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
            if (parser == null) {
                log.warn("database driver [{}] is not support grammatical analysis sql", dbType);
                return new String[0];
            }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/writer/file/BaseFileWriter.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(config.getStringList(PARTITION_BY))) {
            List<String> partitionKeys = config.getStringList(PARTITION_BY);
            writer.partitionBy(partitionKeys.toArray(new String[]{}));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(0);
            InputStream emptyContent = new ByteArrayInputStream(new byte[0]);
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, emptyContent, metadata);
            s3Client.putObject(putObjectRequest);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(0);
        InputStream emptyContent = new ByteArrayInputStream(new byte[0]);
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, emptyContent, metadata);
        ossClient.putObject(putObjectRequest);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
        if (StringUtils.isBlank(hdfsFilePath)) {
            log.error("hdfs file path:{} is blank", hdfsFilePath);
            return new byte[0];
        }

```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/exceptions/ServiceException.java`
#### Snippet
```java
public class ServiceException extends RuntimeException {

    private int code;

    public ServiceException() {
```

### NonFinalFieldOfException
Non-final field `exitCode` of exception class
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
    public static class ExitCodeException extends IOException {

        int exitCode;

        public ExitCodeException(int exitCode, String message) {
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/python/PythonGateway.java`
#### Snippet
```java
    };

    private final Queue queuePythonGateway = new Queue() {

        {
```

### DoubleBraceInitialization
Double brace initialization
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/python/PythonGateway.java`
#### Snippet
```java

    // TODO replace this user to build in admin user if we make sure build in one could not be change
    private final User dummyAdminUser = new User() {

        {
```

## RuleId[ruleID=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/CollectionUtils.java`
#### Snippet
```java
     * @return removes certain attributes of each object in the list
     */
    public static <T extends Object> List<Map<String, Object>> getListByExclusion(List<T> originList,
                                                                                  Set<String> exclusionSet) {
        List<Map<String, Object>> instanceList = new ArrayList<>();
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `ApiException` ends with 'Exception'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/exceptions/ApiException.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target(METHOD)
public @interface ApiException {

    Status value();
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `client` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sManager.java`
#### Snippet
```java
        String k8sConfig = ClusterConfUtils.getK8sConfig(cluster.getConfig());
        if (k8sConfig != null) {
            DefaultKubernetesClient client = null;
            try {
                client = getClient(k8sConfig);
```

### UnusedAssignment
Variable `session` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/SessionServiceImpl.java`
#### Snippet
```java
    @Transactional
    public String createSession(User user, String ip) {
        Session session = null;

        // logined
```

### UnusedAssignment
Variable `doesResExist` initializer `false` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UdfFuncServiceImpl.java`
#### Snippet
```java
        }

        Boolean doesResExist = false;
        try {
            doesResExist = storageOperate.exists(fullName);
```

### UnusedAssignment
Variable `paramsOptions` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DqRuleServiceImpl.java`
#### Snippet
```java
            case DATASOURCE_TYPE:
                options = new ArrayList<>();
                ParamsOptions paramsOptions = null;
                for (DbType dbtype : DbType.values()) {
                    paramsOptions = new ParamsOptions(dbtype.name(), dbtype.getCode(), false);
```

### UnusedAssignment
Variable `comparisonOptions` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DqRuleServiceImpl.java`
#### Snippet
```java
            case COMPARISON_TYPE:
                options = new ArrayList<>();
                ParamsOptions comparisonOptions = null;
                List<DqComparisonType> list =
                        dqComparisonTypeMapper.selectList(new QueryWrapper<DqComparisonType>().orderByAsc("id"));
```

### UnusedAssignment
Variable `tableList` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
        DataSource dataSource = dataSourceMapper.selectById(datasourceId);

        List<String> tableList = null;
        BaseConnectionParam connectionParam =
                (BaseConnectionParam) DataSourceUtils.buildConnectionParams(
```

### UnusedAssignment
Variable `dataSourceList` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
    public Result queryDataSourceListPaging(User loginUser, String searchVal, Integer pageNo, Integer pageSize) {
        Result result = new Result();
        IPage<DataSource> dataSourceList = null;
        Page<DataSource> dataSourcePage = new Page<>(pageNo, pageSize);
        PageInfo<DataSource> pageInfo = new PageInfo<>(pageNo, pageSize);
```

### UnusedAssignment
Variable `datasourceList` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
        Map<String, Object> result = new HashMap<>();

        List<DataSource> datasourceList = null;
        if (loginUser.getUserType().equals(UserType.ADMIN_USER)) {
            datasourceList = dataSourceMapper.queryDataSourceByType(0, type, testFlag);
```

### UnusedAssignment
Variable `timezoneId` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
        //
        Map<String, String> commandParamMap = JSONUtils.toMap(processInstance.getCommandParam());
        String timezoneId = null;
        if (commandParamMap == null || StringUtils.isBlank(commandParamMap.get(Constants.SCHEDULE_TIMEZONE))) {
            timezoneId = loginUser.getTimeZone();
```

### UnusedAssignment
Variable `user` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
            return result;
        }
        User user = null;
        if (loginUser.getUserType() == UserType.ADMIN_USER) {
            user = loginUser;
```

### UnusedAssignment
Variable `userSet` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
        List<User> userList = userMapper.selectList(null);
        List<User> resultUsers = new ArrayList<>();
        Set<User> userSet = null;
        if (userList != null && !userList.isEmpty()) {
            userSet = new HashSet<>(userList);
```

### UnusedAssignment
Variable `authedUserSet` initializer `null` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
            List<User> authedUserList = userMapper.queryUserListByAlertGroupId(alertgroupId);

            Set<User> authedUserSet = null;
            if (authedUserList != null && !authedUserList.isEmpty()) {
                authedUserSet = new HashSet<>(authedUserList);
```

### UnusedAssignment
Variable `content` initializer `new ArrayList<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        }

        List<String> content = new ArrayList<>();
        try {
            if (storageOperate.exists(fullName)) {
```

### UnusedAssignment
Variable `result` initializer `new Result<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                                         ResourceType type,
                                         MultipartFile file) {
        Result<Object> result = new Result<>();

        result = checkResourceUploadStartupState();
```

### UnusedAssignment
Variable `result` initializer `new Result<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                                         MultipartFile file,
                                         String currentDir) {
        Result<Object> result = new Result<>();

        result = checkResourceUploadStartupState();
```

### UnusedAssignment
Variable `defaultPath` initializer `""` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        }

        String defaultPath = "";
        List<StorageEntity> resourcesList = new ArrayList<>();
        String resourceStorageType =
```

### UnusedAssignment
Variable `result` initializer `new Result<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
    public Result<Object> onlineCreateResource(User loginUser, ResourceType type, String fileName, String fileSuffix,
                                               String desc, String content, String currentDir) {
        Result<Object> result = new Result<>();

        result = checkResourceUploadStartupState();
```

### UnusedAssignment
Variable `fullName` initializer `""` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        String name = fileName.trim() + "." + nameSuffix;

        String fullName = "";
        String userResRootPath = storageOperate.getResDir(tenantCode);
        if (!currentDir.contains(userResRootPath)) {
```

### UnusedAssignment
Variable `result` initializer `new Result<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                                          int pid,
                                          String currentDir) {
        Result<Object> result = new Result<>();

        result = checkResourceUploadStartupState();
```

### UnusedAssignment
Variable `result` initializer `new Result<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
    public Result<Object> delete(User loginUser, String fullName,
                                 String resTenantCode) throws IOException {
        Result<Object> result = new Result<>();

        result = checkResourceUploadStartupState();
```

### UnusedAssignment
Variable `result` initializer `new HashMap<>()` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
    @Override
    public Map<String, Object> viewTree(User loginUser, long projectCode, long code, Integer limit) {
        Map<String, Object> result = new HashMap<>();
        Project project = projectMapper.queryByCode(projectCode);
        // check user access for project
```

### UnusedAssignment
Variable `proxyResult` initializer `new ProxyResult()` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProxyProcessDefinitionController.java`
#### Snippet
```java
                                               String taskDefinitionJson,
                                               ProcessExecutionTypeEnum executionType) {
        ProxyResult proxyResult = new ProxyResult();
        String url =
                "http://" + DomainName + ":" + ServerPort + "/dolphinscheduler/projects/" + projectCode
```

### UnusedAssignment
Variable `schemaVersion` initializer `""` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/DolphinSchedulerManager.java`
#### Snippet
```java
            }
            // The target version of the upgrade
            String schemaVersion = "";
            String currentVersion = version;
            for (String schemaDir : schemaList) {
```

### UnusedAssignment
Variable `crcString` initializer `""` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
        CRC32 crc32 = new CRC32();
        File file = new File(pathName);
        String crcString = "";
        if (file.isDirectory()) {
            // file system interface remains the same order
```

### UnusedAssignment
Variable `businessDate` initializer `runTime` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/placeholder/BusinessTimeUtils.java`
#### Snippet
```java
     */
    public static Map<String, String> getBusinessTime(CommandType commandType, Date runTime, String timezone) {
        Date businessDate = runTime;
        Map<String, String> result = new HashMap<>();
        switch (commandType) {
```

### UnusedAssignment
Variable `timeoutTimerTask` initializer `null` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
        ProcessBuilder builder = new ProcessBuilder(getExecString());
        Timer timeOutTimer = null;
        ShellTimeoutTimerTask timeoutTimerTask = null;
        timedOut = new AtomicBoolean(false);
        completed = new AtomicBoolean(false);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
            String content = setTaskParams(info.getCondition().replaceAll("'", "\""), rgex);
            log.info("format condition sentence::{}", content);
            Boolean result = null;
            try {
                result = SwitchTaskUtils.evaluate(content);
```

### UnusedAssignment
Variable `line` initializer `""` is redundant
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/ShellExecutor.java`
#### Snippet
```java
        char[] buf = new char[1024];
        int nRead;
        String line = "";
        while ((nRead = lines.read(buf, 0, buf.length)) > 0) {
            line = new String(buf, 0, nRead);
```

### UnusedAssignment
Variable `businessDate` initializer `runTime` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/BusinessTimeUtils.java`
#### Snippet
```java
     */
    public static Map<String, String> getBusinessTime(CommandType commandType, Date runTime) {
        Date businessDate = runTime;
        switch (commandType) {
            case COMPLEMENT_DATA:
```

### UnusedAssignment
Variable `cronTime` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        // Get current time, schedule execute time
        String cronTimeStr = parameterMap.get(PARAMETER_SHECDULE_TIME);
        Date cronTime = null;

        if (StringUtils.isNotEmpty(cronTimeStr)) {
```

### UnusedAssignment
Variable `targetDate` initializer `""` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
        String dataFormat = expression.substring(YEAR_WEEK.length() + 1, expression.length() - 1);

        String targetDate = "";
        try {

```

### UnusedAssignment
Variable `weekYearStr` initializer `""` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
        int year = calendar.get(Calendar.YEAR);

        String weekYearStr = "";
        if (weekOfYear < 10 && format.contains(HYPHEN)) {
            weekYearStr = String.format("%d%s0%d", year, HYPHEN, weekOfYear);
```

### UnusedAssignment
Variable `preTaskId` initializer `0` is redundant
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                                                          TaskInstance parentTask) {

        Integer preTaskId = 0;
        List<TaskInstance> preTaskList =
                taskInstanceDao.findPreviousTaskListByWorkProcessId(parentProcessInstance.getId());
```

### UnusedAssignment
Variable `line` initializer `""` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/ShellExecutor.java`
#### Snippet
```java
        char[] buf = new char[1024];
        int nRead;
        String line = "";
        while ((nRead = lines.read(buf, 0, buf.length)) > 0) {
            line = new String(buf, 0, nRead);
```

### UnusedAssignment
Variable `command` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
            // build the command will add resource
            // Step 3: to run the command
            String command = null;
            switch (javaParameters.getRunType()) {
                case JavaConstants.RUN_TYPE_JAVA:
```

### UnusedAssignment
Variable `start` initializer `-1` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
        int scriptStart = 0;
        while ((scriptStart = rawScript.indexOf("${setShareVar(${", scriptStart)) != -1) {
            int start = -1;
            int end = rawScript.indexOf('}', scriptStart + len);
            String prop = rawScript.substring(scriptStart + len, end);
```

### UnusedAssignment
Variable `statusCode` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
        long startTime = System.currentTimeMillis();
        String formatTimeStamp = DateUtils.formatTimeStamp(startTime);
        String statusCode = null;
        String body = null;

```

### UnusedAssignment
Variable `body` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
        String formatTimeStamp = DateUtils.formatTimeStamp(startTime);
        String statusCode = null;
        String body = null;

        try (
```

### UnusedAssignment
Variable `start` initializer `-1` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTask.java`
#### Snippet
```java
        int scriptStart = 0;
        while ((scriptStart = rawScript.indexOf("${setShareVar(${", scriptStart)) != -1) {
            int start = -1;
            int end = rawScript.indexOf('}', scriptStart + len);
            String prop = rawScript.substring(scriptStart + len, end);
```

### UnusedAssignment
Variable `isFinishedSuccessfully` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncTask.java`
#### Snippet
```java
    public void trackApplicationStatus() throws TaskException {
        checkApplicationId();
        Boolean isFinishedSuccessfully = null;
        isFinishedSuccessfully = hook.doubleCheckFinishStatus(TaskExecutionStatus.SUCCESS, DatasyncHook.doneStatus);
        if (!isFinishedSuccessfully) {
```

### UnusedAssignment
Variable `execState` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
            StringEntity entity = new StringEntity(config.getJobTriggerPostBody(), StandardCharsets.UTF_8);
            post.setEntity(entity);
            ExecResult execState = null;
            int taskId;
            WebSocketClient webSocket = null;
```

### UnusedAssignment
Variable `cancelResult` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                new StringEntity(config.getJobCancelPostBody(triggerResult.getTaskId()), StandardCharsets.UTF_8);

        CancelResult cancelResult = null;
        HttpPost post = new HttpPost(triggerUrl);
        addFormUrlencoded(post);
```

### UnusedAssignment
Variable `ruleParser` initializer `null` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/rule/RuleManager.java`
#### Snippet
```java
                SINGLE_QUOTES + RuleParserUtils.generateUniqueCode(inputParameterValueResult) + SINGLE_QUOTES);

        IRuleParser ruleParser = null;
        switch (RuleType.of(dataQualityTaskExecutionContext.getRuleType())) {
            case SINGLE_TABLE:
```

### UnusedAssignment
Variable `initialEntity` initializer `null` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
        LinkedList<StorageEntity> foldersToFetch = new LinkedList<>();

        StorageEntity initialEntity = null;
        try {
            initialEntity = getFileStatus(path, defaultPath, tenantCode, type);
```

### UnusedAssignment
Variable `initialEntity` initializer `null` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
        LinkedList<StorageEntity> foldersToFetch = new LinkedList<>();

        StorageEntity initialEntity = null;
        try {
            initialEntity = getFileStatus(path, defaultPath, tenantCode, type);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
        List<StorageEntity> storageEntityList = new ArrayList<>();

        ListObjectsV2Result result = null;
        String nextContinuationToken = null;
        do {
```

### UnusedAssignment
Variable `alias` initializer `""` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
        try {
            FileStatus fileStatus = fs.getFileStatus(new Path(path));
            String alias = "";
            String fileName = "";
            String fullName = fileStatus.getPath().toString();
```

### UnusedAssignment
Variable `fileName` initializer `""` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
            FileStatus fileStatus = fs.getFileStatus(new Path(path));
            String alias = "";
            String fileName = "";
            String fullName = fileStatus.getPath().toString();
            if (fileStatus.isDirectory()) {
```

### UnusedAssignment
Variable `pathToExplore` initializer `""` is redundant
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java

        do {
            String pathToExplore = "";
            if (foldersToFetch.size() == 0) {
                pathToExplore = path;
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
        if (needRecountState.size() == 0) {
            TaskCountDto taskCountResult = new TaskCountDto(startTimeStates.get());
            result.put(Constants.DATA_LIST, taskCountResult);
            putMsg(result, Status.SUCCESS);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
        if (needRecountState.size() == 0) {
            TaskCountDto taskCountResult = new TaskCountDto(startTimeStates.get());
            result.put(Constants.DATA_LIST, taskCountResult);
            putMsg(result, Status.SUCCESS);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/LowerWeightRoundRobin.java`
#### Snippet
```java
            return zeroWaitingTask;
        }
        HostWeight hostWeight = sources.stream().min(Comparator.comparing(HostWeight::getWaitingTaskCount)).get();
        List<HostWeight> waitingTask = Lists.newArrayList(hostWeight);
        List<HostWeight> equalWaitingTask = sources.stream()
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `auditDtos != null` is always `true`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AuditServiceImpl.java`
#### Snippet
```java

        List<AuditDto> auditDtos = logList.stream().map(this::transformAuditLog).collect(Collectors.toList());
        pageInfo.setTotal((int) (auditDtos != null ? auditDtos.size() : 0L));
        pageInfo.setTotalList(auditDtos);
        result.setData(pageInfo);
```

### ConstantValue
Value `start` is always 'null'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        // count normal command state
        Map<CommandType, Integer> normalCountCommandCounts =
                commandMapper.countCommandState(start, end, projectCodeArray)
                        .stream()
                        .collect(Collectors.toMap(CommandCount::getCommandType, CommandCount::getCount));
```

### ConstantValue
Value `end` is always 'null'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        // count normal command state
        Map<CommandType, Integer> normalCountCommandCounts =
                commandMapper.countCommandState(start, end, projectCodeArray)
                        .stream()
                        .collect(Collectors.toMap(CommandCount::getCommandType, CommandCount::getCount));
```

### ConstantValue
Value `start` is always 'null'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        // count error command state
        Map<CommandType, Integer> errorCommandCounts =
                errorCommandMapper.countCommandState(start, end, projectCodeArray)
                        .stream()
                        .collect(Collectors.toMap(CommandCount::getCommandType, CommandCount::getCount));
```

### ConstantValue
Value `end` is always 'null'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        // count error command state
        Map<CommandType, Integer> errorCommandCounts =
                errorCommandMapper.countCommandState(start, end, projectCodeArray)
                        .stream()
                        .collect(Collectors.toMap(CommandCount::getCommandType, CommandCount::getCount));
```

### ConstantValue
Condition `start == null` is always `false`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
                ZonedDateTime start = DateUtils.stringToZoneDateTime(startDate);
                ZonedDateTime end = DateUtils.stringToZoneDateTime(endDate);
                if (start == null || end == null) {
                    return false;
                }
```

### ConstantValue
Condition `start == null || end == null` is always `false`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
                ZonedDateTime start = DateUtils.stringToZoneDateTime(startDate);
                ZonedDateTime end = DateUtils.stringToZoneDateTime(endDate);
                if (start == null || end == null) {
                    return false;
                }
```

### ConstantValue
Condition `end == null` is always `false` when reached
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
                ZonedDateTime start = DateUtils.stringToZoneDateTime(startDate);
                ZonedDateTime end = DateUtils.stringToZoneDateTime(endDate);
                if (start == null || end == null) {
                    return false;
                }
```

### ConstantValue
Condition `Objects.nonNull(localUserDefParams)` is always `true`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
        }

        if (Objects.nonNull(localUserDefParams)) {
            resultMap.put(LOCAL_PARAMS, localUserDefParams);
        }
```

### ConstantValue
Value `processTaskRelationJson` is always 'null'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
            if (processTaskRelationJson == null) {
                log.error("Process task relation data is null.");
                putMsg(result, Status.DATA_IS_NOT_VALID, processTaskRelationJson);
                return result;
            }
```

### ConstantValue
Condition `e instanceof SQLIntegrityConstraintViolationException` is always `false`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/MysqlOperator.java`
#### Snippet
```java
            return mysqlRegistryLock;
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                return null;
            }
```

### ConstantValue
Value `processInstance` is always 'null'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        ProcessInstanceMap processInstanceMap = processInstanceMapMapper.queryBySubProcessId(subProcessId);
        if (processInstanceMap == null || processInstanceMap.getProcessInstanceId() == 0) {
            return processInstance;
        }
        processInstance = findProcessInstanceById(processInstanceMap.getParentProcessInstanceId());
```

### ConstantValue
Value `processInstance` is always 'null'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        ProcessInstanceMap processInstanceMap = processInstanceMapMapper.queryByParentId(parentProcessId, parentTaskId);
        if (processInstanceMap == null || processInstanceMap.getProcessInstanceId() == 0) {
            return processInstance;
        }
        processInstance = findProcessInstanceById(processInstanceMap.getProcessInstanceId());
```

### ConstantValue
Value `column` is always 'null'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
    public static String doConvertKeywordsColumn(DbType dbType, String column) {
        if (column == null) {
            return column;
        }

```

### ConstantValue
Value `sqoopParamsCheck` is always 'false'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/parameter/SqoopParameters.java`
#### Snippet
```java

        if (StringUtils.isEmpty(jobType)) {
            return sqoopParamsCheck;
        }

```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-feishu/src/main/java/org/apache/dolphinscheduler/plugin/alert/feishu/FeiShuSender.java`
#### Snippet
```java
                    String key = entry.getKey();
                    String value = entry.getValue().toString();
                    contents.append(key + ":" + value);
                    contents.append("\n");
                }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-pagerduty/src/main/java/org/apache/dolphinscheduler/plugin/alert/pagerduty/PagerDutySender.java`
#### Snippet
```java
                String key = entry.getKey();
                String value = entry.getValue().toString();
                contents.append(key + ":" + value);
                contents.append("\n");
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java
        if (requestBodyMap != null) {
            for (String key : requestBodyMap.keySet()) {
                stringBuffer.append(key + "=" + requestBodyMap.get(key) + "&");
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/LoggerUtils.java`
#### Snippet
```java
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while ((line = br.readLine()) != null) {
                sb.append(line + "\r\n");
            }
            return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/ShellCommandExecutor.java`
#### Snippet
```java
                FileUtils.createFileWith755(kubeConfigPath);
                Files.write(kubeConfigPath, configYaml.getBytes(), StandardOpenOption.APPEND);
                sb.append("export KUBECONFIG=" + kubeConfigPath).append(System.lineSeparator());
                logger.info("Create kubernetes configuration file: {}.", kubeConfigPath);
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/LogUtils.java`
#### Snippet
```java
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while ((line = br.readLine()) != null) {
                sb.append(line + "\r\n");
            }
            return sb.toString();
```

## RuleId[ruleID=IOResource]
### IOResource
'LineNumberReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/ScriptRunner.java`
#### Snippet
```java
        List<String> command = null;
        try {
            LineNumberReader lineReader = new LineNumberReader(reader);
            String line;
            while ((line = lineReader.readLine()) != null) {
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
        }
        Optional<InetAddress> addressOp = toValidAddress(localAddress);
        if (addressOp.isPresent()) {
            LOCAL_ADDRESS = addressOp.get();
        }
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `mailProtocol` may be 'static'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/MailSender.java`
#### Snippet
```java
    private final List<String> receivers;
    private final List<String> receiverCcs;
    private final String mailProtocol = "SMTP";
    private final String mailSmtpHost;
    private final String mailSmtpPort;
```

### FieldMayBeStatic
Field `mustNotNull` may be 'static'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/MailSender.java`
#### Snippet
```java
    private final String showType;
    private final AlertTemplate alertTemplate;
    private final String mustNotNull = " must not be null";
    private String xlsFilePath;

```

### FieldMayBeStatic
Field `rgex` may be 'static'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
public class SwitchTaskProcessor extends BaseTaskProcessor {

    protected final String rgex = "['\"]*\\$\\{(.*?)\\}['\"]*";

    /**
```

### FieldMayBeStatic
Field `CPU_FACTOR` may be 'static'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/HostWeight.java`
#### Snippet
```java
public class HostWeight {

    private final int CPU_FACTOR = 10;

    private final int MEMORY_FACTOR = 20;
```

### FieldMayBeStatic
Field `MEMORY_FACTOR` may be 'static'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/HostWeight.java`
#### Snippet
```java
    private final int CPU_FACTOR = 10;

    private final int MEMORY_FACTOR = 20;

    private final int LOAD_AVERAGE_FACTOR = 70;
```

### FieldMayBeStatic
Field `LOAD_AVERAGE_FACTOR` may be 'static'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/host/assign/HostWeight.java`
#### Snippet
```java
    private final int MEMORY_FACTOR = 20;

    private final int LOAD_AVERAGE_FACTOR = 70;

    private final HostWorker hostWorker;
```

### FieldMayBeStatic
Field `taskInstanceIdHolder` may be 'static'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/http/method/HttpLoopTaskCancelTaskMethodDefinition.java`
#### Snippet
```java
            LoopTaskCancelMethodDefinition {

    private final String taskInstanceIdHolder = "${taskInstanceId}";

    public HttpLoopTaskCancelTaskMethodDefinition(String url,
```

### FieldMayBeStatic
Field `taskInstanceIdHolder` may be 'static'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/http/method/HttpLoopTaskQueryStatusMethodDefinition.java`
#### Snippet
```java
    private final String taskInstanceFinishedJPath;
    // inject the taskInstanceId into template
    private final String taskInstanceIdHolder = "${taskInstanceId}";

    public HttpLoopTaskQueryStatusMethodDefinition(String url,
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/FileUtils.java`
#### Snippet
```java
 */
@Slf4j
public class FileUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ApiFuncIdentificationConstant` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/constants/ApiFuncIdentificationConstant.java`
#### Snippet
```java
import java.util.Map;

public class ApiFuncIdentificationConstant {

    public static final String ACCESS_TOKEN_MANAGE = "security:token:view";
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/WorkflowUtils.java`
#### Snippet
```java
 * workflow utils
 */
public class WorkflowUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceProcessDefinitionUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/ResourceProcessDefinitionUtils.java`
#### Snippet
```java
 * resource process definition utils
 */
public class ResourceProcessDefinitionUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TaskInstanceUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/utils/TaskInstanceUtils.java`
#### Snippet
```java
import org.apache.dolphinscheduler.dao.entity.TaskInstance;

public class TaskInstanceUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PluginParamsTransfer` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/PluginParamsTransfer.java`
#### Snippet
```java
 * plugin params pojo and json transfer tool
 */
public class PluginParamsTransfer {

    public static String transferParamsToJson(List<PluginParams> list) {
```

### UtilityClassWithoutPrivateConstructor
Class `DemoConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/DemoConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.tools.demo;

public class DemoConstants {

    public static final String PARAMETER_CONTEXT_PARAMS =
```

### UtilityClassWithoutPrivateConstructor
Class `CreateProcessDemo` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/CreateProcessDemo.java`
#### Snippet
```java
        })
})
public class CreateProcessDemo {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MigrateResource` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/resource/MigrateResource.java`
#### Snippet
```java
@SpringBootApplication
@ComponentScan("org.apache.dolphinscheduler")
public class MigrateResource {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `UpgradeDolphinScheduler` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/UpgradeDolphinScheduler.java`
#### Snippet
```java
@ImportAutoConfiguration(DaoConfiguration.class)
@SpringBootApplication
public class UpgradeDolphinScheduler {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `InitDolphinScheduler` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/InitDolphinScheduler.java`
#### Snippet
```java
@ImportAutoConfiguration(DaoConfiguration.class)
@SpringBootApplication
public class InitDolphinScheduler {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `ThreadLocalContext` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/thread/ThreadLocalContext.java`
#### Snippet
```java
 * thread local context
 */
public class ThreadLocalContext {

    public static final ThreadLocal<String> timezoneThreadLocal = new ThreadLocal<>();
```

### UtilityClassWithoutPrivateConstructor
Class `MILLISECONDS` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
     * Time unit representing one thousandth of a second
     */
    public static class MILLISECONDS {

        public static long toDays(long d) {
```

### UtilityClassWithoutPrivateConstructor
Class `CommandKeyConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/constants/CommandKeyConstants.java`
#### Snippet
```java
 * The key org.apache.dolphinscheduler.dao.entity.Command#commandParam
 */
public class CommandKeyConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DateConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/constants/DateConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.common.constants;

public class DateConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DataSourceConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/constants/DataSourceConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.common.constants;

public class DataSourceConstants {

    public static final String DATASOURCE = "datasource";
```

### UtilityClassWithoutPrivateConstructor
Class `StateEventHandlerManager` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/StateEventHandlerManager.java`
#### Snippet
```java
import java.util.ServiceLoader;

public class StateEventHandlerManager {

    private static final Map<StateEventType, StateEventHandler> stateEventHandlerMap = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `OkHttpUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java
import okhttp3.Response;

public class OkHttpUtils {

    private static final OkHttpClient CLIENT = new OkHttpClient.Builder()
```

### UtilityClassWithoutPrivateConstructor
Class `SwitchTaskUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/utils/SwitchTaskUtils.java`
#### Snippet
```java
import javax.script.ScriptException;

public class SwitchTaskUtils {

    private static ScriptEngineManager manager;
```

### UtilityClassWithoutPrivateConstructor
Class `RpcProtocolConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/protocol/RpcProtocolConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.rpc.protocol;

public class RpcProtocolConstants {

    public RpcProtocolConstants() {
```

### UtilityClassWithoutPrivateConstructor
Class `TaskExecutionCheckerUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskExecutionCheckerUtils.java`
#### Snippet
```java
import org.slf4j.Logger;

public class TaskExecutionCheckerUtils {

    public static void checkTenantExist(WorkerConfig workerConfig, TaskExecutionContext taskExecutionContext) {
```

### UtilityClassWithoutPrivateConstructor
Class `ClusterConfUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ClusterConfUtils.java`
#### Snippet
```java
 * cluster conf will include all env type, but only k8s config now
 */
public class ClusterConfUtils {

    private static final String K8S_CONFIG = "k8s";
```

### UtilityClassWithoutPrivateConstructor
Class `CommonUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/CommonUtils.java`
#### Snippet
```java
 */
@Slf4j
public class CommonUtils {

    private static final Base64 BASE64 = new Base64();
```

### UtilityClassWithoutPrivateConstructor
Class `ParamUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ParamUtils.java`
#### Snippet
```java
 * Param Utility class
 */
public class ParamUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ProcessUtils.java`
#### Snippet
```java
 */
@Slf4j
public class ProcessUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MapUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/MapUtils.java`
#### Snippet
```java
import java.util.Map;

public class MapUtils {

    public static boolean isEmpty(Map<?, ?> map) {
```

### UtilityClassWithoutPrivateConstructor
Class `DependentDateUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/DependentDateUtils.java`
#### Snippet
```java
import java.util.List;

public class DependentDateUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/FileUtils.java`
#### Snippet
```java

@Slf4j
public class FileUtils {

    private static final FileAttribute<Set<PosixFilePermission>> PERMISSION_755 =
```

### UtilityClassWithoutPrivateConstructor
Class `ParamUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParamUtils.java`
#### Snippet
```java
 * param utils
 */
public class ParamUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PlaceholderUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PlaceholderUtils.java`
#### Snippet
```java
 */
@Slf4j
public class PlaceholderUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DVC_TASK_TYPE` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcConstants.java`
#### Snippet
```java
    }

    public static final class DVC_TASK_TYPE {

        public static final String UPLOAD = "Upload";
```

### UtilityClassWithoutPrivateConstructor
Class `TimePlaceholderUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
 */
@Slf4j
public class TimePlaceholderUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `START_TYPE` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsHook.java`
#### Snippet
```java
    }

    public static class START_TYPE {

        public static final String START_REPLICATION = "start-replication";
```

### UtilityClassWithoutPrivateConstructor
Class `CONSTANTS` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsHook.java`
#### Snippet
```java
    }

    public static class CONSTANTS {

        public static final int CHECK_INTERVAL = 1000;
```

### UtilityClassWithoutPrivateConstructor
Class `STATUS` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsHook.java`
#### Snippet
```java
    }

    public static class STATUS {

        public static final String DELETE = "delete";
```

### UtilityClassWithoutPrivateConstructor
Class `AWS_KEY` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsHook.java`
#### Snippet
```java
    }

    public static class AWS_KEY {

        public static final String REPLICATION_TASK_ARN = "replication-task-arn";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpTaskConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTaskConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.plugin.task.http;

public class HttpTaskConstants {

    public static final String APPLICATION_JSON = "application/json";
```

### UtilityClassWithoutPrivateConstructor
Class `DataxUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
import com.alibaba.druid.sql.parser.SQLStatementParser;

public class DataxUtils {

    public static final String DATAX_READER_PLUGIN_MYSQL = "mysqlreader";
```

### UtilityClassWithoutPrivateConstructor
Class `ChunJunConstants` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-chunjun/src/main/java/org/apache/dolphinscheduler/plugin/task/chunjun/ChunJunConstants.java`
#### Snippet
```java
 * ChunJun constants
 */
public class ChunJunConstants {

    public static final String FLINK_CONF_DIR = "${FLINK_HOME}/conf";
```

### UtilityClassWithoutPrivateConstructor
Class `CONSTANTS` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowHelper.java`
#### Snippet
```java
    }

    public static class CONSTANTS {

        public static final int TRACK_INTERVAL = 3000;
```

### UtilityClassWithoutPrivateConstructor
Class `COMMAND` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowHelper.java`
#### Snippet
```java
    }

    public static class COMMAND {

        public static final String SET_CONFIG = "export KUBECONFIG=%s";
```

### UtilityClassWithoutPrivateConstructor
Class `STATUS` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowHelper.java`
#### Snippet
```java
    }

    public static class STATUS {

        public static final HashSet<String> SUCCESS_SET = Sets.newHashSet("Succeeded", "Available", "Bound");
```

### UtilityClassWithoutPrivateConstructor
Class `DagHelper` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
 */
@Slf4j
public class DagHelper {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DataQualityApplication` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/DataQualityApplication.java`
#### Snippet
```java
 */
@Slf4j
public class DataQualityApplication {

    public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `QuartzTaskUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-scheduler-plugin/dolphinscheduler-scheduler-quartz/src/main/java/org/apache/dolphinscheduler/scheduler/quartz/utils/QuartzTaskUtils.java`
#### Snippet
```java
import org.quartz.JobKey;

public final class QuartzTaskUtils {

    public static final String QUARTZ_JOB_PREFIX = "job";
```

### UtilityClassWithoutPrivateConstructor
Class `DataSourceUtils` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/utils/DataSourceUtils.java`
#### Snippet
```java

@Slf4j
public class DataSourceUtils {

    public DataSourceUtils() {
```

### UtilityClassWithoutPrivateConstructor
Class `JDBCDataSourceProvider` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/provider/JDBCDataSourceProvider.java`
#### Snippet
```java
 */
@Slf4j
public class JDBCDataSourceProvider {

    public static HikariDataSource createJdbcDataSource(BaseConnectionParam properties, DbType dbType) {
```

### UtilityClassWithoutPrivateConstructor
Class `UserGroupInformationFactory` has only 'static' members, and lacks a 'private' constructor
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/security/UserGroupInformationFactory.java`
#### Snippet
```java

@Slf4j
public class UserGroupInformationFactory {

    private static final Map<String, Integer> currentLoginTimesMap = new HashMap<>();
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getStartTime` may produce `NullPointerException`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/SchedulerServiceImpl.java`
#### Snippet
```java

        ScheduleParam scheduleParam = JSONUtils.parseObject(schedule, ScheduleParam.class);
        if (DateUtils.differSec(scheduleParam.getStartTime(), scheduleParam.getEndTime()) == 0) {
            log.warn("The start time must not be the same as the end or time can not be null.");
            putMsg(result, Status.SCHEDULE_START_TIME_END_TIME_SAME);
```

### DataFlowIssue
Argument `workerGroupSet` might be null
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                .collect(Collectors.toSet());

        Set<String> deleteWorkerGroupSet = SetUtils.difference(existWorkerGroupSet, workerGroupSet).toSet();
        Set<String> addWorkerGroupSet = SetUtils.difference(workerGroupSet, existWorkerGroupSet).toSet();

```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            if (projectUser == null || projectUser.getPerm() != Constants.DEFAULT_ADMIN_PERMISSION) {
                putMsg(result, Status.USER_NO_WRITE_PROJECT_PERM, loginUser.getUserName(), project.getCode());
                checkResult = false;
            } else {
                checkResult = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            if (projectUser == null || projectUser.getPerm() != Constants.DEFAULT_ADMIN_PERMISSION) {
                putMsg(result, Status.USER_NO_WRITE_PROJECT_PERM, loginUser.getUserName(), project.getCode());
                checkResult = false;
            } else {
                checkResult = true;
```

### DataFlowIssue
Unboxing of `resource.getId()` may produce `NullPointerException`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java

        if (resource.isDirectory()) {
            listAllChildren(resource.getId(), childList);
        }
        return childList;
```

### DataFlowIssue
Method invocation `containsKey` may produce `NullPointerException`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                });

        if (taskParameters.containsKey("resourceList")) {
            String resourceListStr = JSONUtils.toJsonString(taskParameters.get("resourceList"));
            List<ResourceInfo> resourceInfos = JSONUtils.toList(resourceListStr, ResourceInfo.class);
```

### DataFlowIssue
Method invocation `containsKey` may produce `NullPointerException`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                new TypeReference<Map<String, Object>>() {
                });
        if (taskParameters.containsKey("resourceList")) {
            String resourceListStr = JSONUtils.toJsonString(taskParameters.get("resourceList"));
            List<ResourceInfo> resourceInfoList = JSONUtils.toList(resourceListStr, ResourceInfo.class);
```

### DataFlowIssue
Argument `file.getOriginalFilename()` might be null
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
    private boolean upload(User loginUser, String fullName, MultipartFile file, ResourceType type) {
        // save to local
        String fileSuffix = Files.getFileExtension(file.getOriginalFilename());
        String nameSuffix = Files.getFileExtension(fullName);

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
                    });
            this.dependency =
                    JSONUtils.parseObject((String) taskParamsMap.get(Constants.DEPENDENCE), DependentParameters.class);
        }
        return this.dependency;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
                    });
            this.switchDependency =
                    JSONUtils.parseObject((String) taskParamsMap.get(Constants.SWITCH_RESULT), SwitchParameters.class);
        }
        return this.switchDependency;
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
                JSONUtils.parseObject(this.getTaskParams(), new TypeReference<Map<String, Object>>() {
                });
        taskParamsMap.put(Constants.SWITCH_RESULT, JSONUtils.toJsonString(switchDependency));
        this.setTaskParams(JSONUtils.toJsonString(taskParamsMap));
    }
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/PluginParamsTransfer.java`
#### Snippet
```java
                JSONUtils.parseObject(pluginParamsTemplate, new TypeReference<List<Map<String, Object>>>() {
                });
        pluginParamsList.forEach(pluginParams -> pluginParams.put(STRING_PLUGIN_PARAM_VALUE,
                paramsMap.get(pluginParams.get(STRING_PLUGIN_PARAM_FIELD))));
        return pluginParamsList;
```

### DataFlowIssue
Method invocation `getGroupId` may produce `NullPointerException`
in `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/java/org/apache/dolphinscheduler/alert/AlertRequestProcessor.java`
#### Snippet
```java

        AlertSendResponseCommand alertSendResponseCommand = alertSenderService.syncHandler(
                alertSendRequestCommand.getGroupId(),
                alertSendRequestCommand.getTitle(),
                alertSendRequestCommand.getContent(),
```

### DataFlowIssue
@Nullable method 'alertResultHandler' always returns a non-null value
in `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/java/org/apache/dolphinscheduler/alert/AlertSenderService.java`
#### Snippet
```java
     * @return AlertResult
     */
    private @Nullable AlertResult alertResultHandler(AlertPluginInstance instance, AlertData alertData) {
        String pluginInstanceName = instance.getInstanceName();
        int pluginDefineId = instance.getPluginDefineId();
```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-http/src/main/java/org/apache/dolphinscheduler/plugin/alert/http/HttpSender.java`
#### Snippet
```java

        HashMap<String, Object> map = JSONUtils.parseObject(headerParams, HashMap.class);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            httpRequest.setHeader(entry.getKey(), String.valueOf(entry.getValue()));
        }
```

### DataFlowIssue
Method invocation `getCode` may produce `NullPointerException`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        Long projectCode = null;
        try {
            projectCode = project.getCode();
        } catch (NullPointerException e) {
            log.error("project code is null", e);
```

### DataFlowIssue
Unboxing of `projectCode` may produce `NullPointerException`
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        // creat process definition demo
        // shell demo
        ProxyResult shellResult = shellDemo(token, projectCode, tenantCode);
        log.info("create shell demo {}", shellResult.getMsg());

```

### DataFlowIssue
Dereference of `subPaths` may produce `NullPointerException`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
            String[] subPaths = file.list();
            StringBuilder concatenatedCRC = new StringBuilder();
            for (String subPath : subPaths) {
                concatenatedCRC.append(getFileChecksum(pathName + FOLDER_SEPARATOR + subPath));
            }
```

### DataFlowIssue
Argument `sourceName` might be null
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/config/YamlPropertySourceFactory.java`
#### Snippet
```java
        Properties propertiesFromYaml = loadYamlIntoProperties(resource);
        String sourceName = name != null ? name : resource.getResource().getFilename();
        return new PropertiesPropertySource(sourceName, propertiesFromYaml);
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java

        StringBuilder strBuilder = new StringBuilder();
        strBuilder = days > 0 ? strBuilder.append(days).append("d").append(" ") : strBuilder;
        strBuilder = hours > 0 ? strBuilder.append(hours).append("h").append(" ") : strBuilder;
        strBuilder = minutes > 0 ? strBuilder.append(minutes).append("m").append(" ") : strBuilder;
```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
        StringBuilder strBuilder = new StringBuilder();
        strBuilder = days > 0 ? strBuilder.append(days).append("d").append(" ") : strBuilder;
        strBuilder = hours > 0 ? strBuilder.append(hours).append("h").append(" ") : strBuilder;
        strBuilder = minutes > 0 ? strBuilder.append(minutes).append("m").append(" ") : strBuilder;
        strBuilder = seconds > 0 ? strBuilder.append(seconds).append("s") : strBuilder;
```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
        strBuilder = days > 0 ? strBuilder.append(days).append("d").append(" ") : strBuilder;
        strBuilder = hours > 0 ? strBuilder.append(hours).append("h").append(" ") : strBuilder;
        strBuilder = minutes > 0 ? strBuilder.append(minutes).append("m").append(" ") : strBuilder;
        strBuilder = seconds > 0 ? strBuilder.append(seconds).append("s") : strBuilder;

```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
        strBuilder = hours > 0 ? strBuilder.append(hours).append("h").append(" ") : strBuilder;
        strBuilder = minutes > 0 ? strBuilder.append(minutes).append("m").append(" ") : strBuilder;
        strBuilder = seconds > 0 ? strBuilder.append(seconds).append("s") : strBuilder;

        return strBuilder.toString();
```

### DataFlowIssue
Argument `token` might be null
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java
        Request request = new Request.Builder()
                .url(url)
                .header("token", token)
                .addHeader("accpect", "application/json")
                .post(body)
```

### DataFlowIssue
Method invocation `string` may produce `NullPointerException`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OkHttpUtils.java`
#### Snippet
```java

        try (Response response = CLIENT.newCall(request).execute()) {
            return response.body().string();
        }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        MasterConfig masterConfig = (MasterConfig) target;
        if (masterConfig.getListenPort() <= 0) {
            errors.rejectValue("listen-port", null, "is invalidated");
        }
        if (masterConfig.getFetchCommandNum() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getFetchCommandNum() <= 0) {
            errors.rejectValue("fetch-command-num", null, "should be a positive value");
        }
        if (masterConfig.getPreExecThreads() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getPreExecThreads() <= 0) {
            errors.rejectValue("per-exec-threads", null, "should be a positive value");
        }
        if (masterConfig.getExecThreads() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getExecThreads() <= 0) {
            errors.rejectValue("exec-threads", null, "should be a positive value");
        }
        if (masterConfig.getDispatchTaskNumber() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getDispatchTaskNumber() <= 0) {
            errors.rejectValue("dispatch-task-number", null, "should be a positive value");
        }
        if (masterConfig.getHeartbeatInterval().toMillis() < 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getHeartbeatInterval().toMillis() < 0) {
            errors.rejectValue("heartbeat-interval", null, "should be a valid duration");
        }
        if (masterConfig.getTaskCommitRetryTimes() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getTaskCommitRetryTimes() <= 0) {
            errors.rejectValue("task-commit-retry-times", null, "should be a positive value");
        }
        if (masterConfig.getTaskCommitInterval().toMillis() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getTaskCommitInterval().toMillis() <= 0) {
            errors.rejectValue("task-commit-interval", null, "should be a valid duration");
        }
        if (masterConfig.getStateWheelInterval().toMillis() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getStateWheelInterval().toMillis() <= 0) {
            errors.rejectValue("state-wheel-interval", null, "should be a valid duration");
        }
        if (masterConfig.getFailoverInterval().toMillis() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getFailoverInterval().toMillis() <= 0) {
            errors.rejectValue("failover-interval", null, "should be a valid duration");
        }
        if (masterConfig.getMaxCpuLoadAvg() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/config/MasterConfig.java`
#### Snippet
```java
        }
        if (masterConfig.getWorkerGroupRefreshInterval().getSeconds() < 10) {
            errors.rejectValue("worker-group-refresh-interval", null, "should >= 10s");
        }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SubTaskProcessor.java`
#### Snippet
```java
                        JSONUtils.parseObject(taskInstance.getTaskParams(), new TypeReference<Map<String, Object>>() {
                        });
                Object localParams = taskParams.get(LOCAL_PARAMS);
                if (localParams != null) {
                    List<Property> properties = JSONUtils.toList(JSONUtils.toJsonString(localParams), Property.class);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/CommonTaskProcessor.java`
#### Snippet
```java
                    JSONUtils.parseObject(taskInstance.getTaskParams(), new TypeReference<Map<String, Object>>() {
                    });
            Integer onlineDataSourceId = (Integer) taskDefinitionParams.get(DataSourceConstants.DATASOURCE);
            Integer testDataSourceId = processService.queryTestDataSourceId(onlineDataSourceId);
            taskDefinitionParams.put(DataSourceConstants.DATASOURCE, testDataSourceId);
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/CommonTaskProcessor.java`
#### Snippet
```java
            Integer testDataSourceId = processService.queryTestDataSourceId(onlineDataSourceId);
            taskDefinitionParams.put(DataSourceConstants.DATASOURCE, testDataSourceId);
            taskInstanceParams.put(DataSourceConstants.DATASOURCE, testDataSourceId);
            taskInstance.getTaskDefine().setTaskParams(JSONUtils.toJsonString(taskDefinitionParams));
            taskInstance.setTaskParams(JSONUtils.toJsonString(taskInstanceParams));
```

### DataFlowIssue
Argument `processInstance` might be null
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/WorkerFailoverService.java`
#### Snippet
```java
                        "Worker[{}] failover: begin to failover taskInstance, will set the status to NEED_FAULT_TOLERANCE",
                        workerHost);
                failoverTaskInstance(processInstance, taskInstance);
                log.info("Worker[{}] failover: Finish failover taskInstance", workerHost);
            } catch (Exception ex) {
```

### DataFlowIssue
Method invocation `getCode` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            properties.setProperty(OTHER, jdbcInfo.getParams());
            properties.setProperty(JDBC_URL, jdbcInfo.getAddress() + SINGLE_SLASH + jdbcInfo.getDatabase());
            dataSource.setType(DbType.of(JdbcUrlParser.getDbType(jdbcInfo.getDriverName()).getCode()));
            dataSource.setConnectionParams(JSONUtils.toJsonString(properties));
        }
```

### DataFlowIssue
Method invocation `setDefaultFS` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            UdfFuncParameters udfFuncParameters =
                    JSONUtils.parseObject(JSONUtils.toJsonString(udfFunc), UdfFuncParameters.class);
            udfFuncParameters.setDefaultFS(PropertyUtils.getString(Constants.FS_DEFAULT_FS));
            String tenantCode = processService.queryTenantCodeByResName(udfFunc.getResourceName(), ResourceType.UDF);
            udfFuncParameters.setTenantCode(tenantCode);
```

### DataFlowIssue
Method invocation `isHive` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            if (dataSource != null) {
                ConnectorType targetConnectorType = ConnectorType.of(
                        DbType.of(Integer.parseInt(config.get(TARGET_CONNECTOR_TYPE))).isHive() ? 1 : 0);
                dataQualityTaskExecutionContext.setTargetConnectorType(targetConnectorType.getDescription());
                dataQualityTaskExecutionContext.setTargetType(dataSource.getType().getCode());
```

### DataFlowIssue
Method invocation `isHive` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            if (dataSource != null) {
                ConnectorType srcConnectorType = ConnectorType.of(
                        DbType.of(Integer.parseInt(config.get(SRC_CONNECTOR_TYPE))).isHive() ? 1 : 0);
                dataQualityTaskExecutionContext.setSourceConnectorType(srcConnectorType.getDescription());
                dataQualityTaskExecutionContext.setSourceType(dataSource.getType().getCode());
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
                K8sTaskParameters k8sTaskParameters =
                        JSONUtils.parseObject(taskInstance.getTaskParams(), K8sTaskParameters.class);
                namespace = k8sTaskParameters.getNamespace();
                break;
            case "SPARK":
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
                SparkParameters sparkParameters =
                        JSONUtils.parseObject(taskInstance.getTaskParams(), SparkParameters.class);
                if (StringUtils.isNotEmpty(sparkParameters.getNamespace())) {
                    namespace = sparkParameters.getNamespace();
                }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/config/WorkerConfig.java`
#### Snippet
```java
        WorkerConfig workerConfig = (WorkerConfig) target;
        if (workerConfig.getExecThreads() <= 0) {
            errors.rejectValue("exec-threads", null, "should be a positive value");
        }
        if (workerConfig.getHeartbeatInterval().getSeconds() <= 0) {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/config/WorkerConfig.java`
#### Snippet
```java
        }
        if (workerConfig.getHeartbeatInterval().getSeconds() <= 0) {
            errors.rejectValue("heartbeat-interval", null, "shoule be a valid duration");
        }
        if (workerConfig.getMaxCpuLoadAvg() <= 0) {
```

### DataFlowIssue
Method invocation `getDirect` may produce `NullPointerException`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java
            Property property = JSONUtils.parseObject(localParam.toString(), Property.class);

            if (property.getDirect().equals(direct) && property.getType().equals(DataType.FILE)) {
                localParamsProperty.add(property);
            }
```

### DataFlowIssue
Method invocation `getNeedAlert` may produce `NullPointerException`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java

    protected void sendAlertIfNeeded() {
        if (!task.getNeedAlert()) {
            return;
        }
```

### DataFlowIssue
Method invocation `getExitStatus` may produce `NullPointerException`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java

    protected void sendTaskResult() {
        taskExecutionContext.setCurrentExecutionStatus(task.getExitStatus());
        taskExecutionContext.setEndTime(System.currentTimeMillis());
        taskExecutionContext.setProcessId(task.getProcessId());
```

### DataFlowIssue
Argument `startTimeMax` might be null
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
            log.error(e.getMessage(), e);
        }
        return DateUtils.compare(startTimeMax, maxExpirationTime) ? maxExpirationTime : startTimeMax;
    }

```

### DataFlowIssue
Argument `maxExpirationTime` might be null
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
            log.error(e.getMessage(), e);
        }
        return DateUtils.compare(startTimeMax, maxExpirationTime) ? maxExpirationTime : startTimeMax;
    }

```

### DataFlowIssue
@Nullable method 'killApplication' always returns a non-null value
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ProcessUtils.java`
#### Snippet
```java
     * @return yarn application ids
     */
    public static @Nullable List<String> killApplication(@NonNull LogClient logClient,
                                                         @NonNull TaskExecutionContext taskExecutionContext) {
        if (taskExecutionContext.getLogPath() == null) {
```

### DataFlowIssue
Method invocation `getStartupTime` may produce `NullPointerException`
in `dolphinscheduler-registry/dolphinscheduler-registry-api/src/main/java/org/apache/dolphinscheduler/registry/api/RegistryClient.java`
#### Snippet
```java
                case MASTER:
                    MasterHeartBeat masterHeartBeat = JSONUtils.parseObject(heartBeatJson, MasterHeartBeat.class);
                    server.setCreateTime(new Date(masterHeartBeat.getStartupTime()));
                    server.setLastHeartbeatTime(new Date(masterHeartBeat.getReportTime()));
                    server.setId(masterHeartBeat.getProcessId());
```

### DataFlowIssue
Method invocation `getStartupTime` may produce `NullPointerException`
in `dolphinscheduler-registry/dolphinscheduler-registry-api/src/main/java/org/apache/dolphinscheduler/registry/api/RegistryClient.java`
#### Snippet
```java
                case WORKER:
                    WorkerHeartBeat workerHeartBeat = JSONUtils.parseObject(heartBeatJson, WorkerHeartBeat.class);
                    server.setCreateTime(new Date(workerHeartBeat.getStartupTime()));
                    server.setLastHeartbeatTime(new Date(workerHeartBeat.getReportTime()));
                    server.setId(workerHeartBeat.getProcessId());
```

### DataFlowIssue
Method invocation `getNamespaceName` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/k8s/impl/K8sTaskExecutor.java`
#### Snippet
```java
        K8sTaskMainParameters k8STaskMainParameters =
                JSONUtils.parseObject(k8sParameterStr, K8sTaskMainParameters.class);
        String namespaceName = k8STaskMainParameters.getNamespaceName();
        String jobName = job.getMetadata().getName();
        try {
```

### DataFlowIssue
Argument `k8STaskMainParameters` might be null
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/k8s/impl/K8sTaskExecutor.java`
#### Snippet
```java
        try {
            log.info("[K8sJobExecutor-{}-{}] start to submit job", taskName, taskInstanceId);
            job = buildK8sJob(k8STaskMainParameters);
            stopJobOnK8s(k8sParameterStr);
            String namespaceName = k8STaskMainParameters.getNamespaceName();
```

### DataFlowIssue
Variable is already assigned to this value
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/DependentUtils.java`
#### Snippet
```java
            case OR:
                if (dependResultList.contains(DependResult.SUCCESS)) {
                    dependResult = DependResult.SUCCESS;
                } else if (dependResultList.contains(DependResult.WAITING)) {
                    dependResult = DependResult.WAITING;
```

### DataFlowIssue
Method invocation `getTime` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
                Date timestamp = DateUtils.parse(dateStr, PARAMETER_FORMAT_TIME);

                value = String.valueOf(timestamp.getTime() / 1000);
            } else if (expression.startsWith(YEAR_WEEK)) {
                value = calculateYearWeek(expression, date);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                JSONUtils.parseObject(taskInstance.getTaskParams(), new TypeReference<Map<String, Object>>() {
                });
        Object localParams = taskParams.get(LOCAL_PARAMS);
        if (localParams == null) {
            return;
```

### DataFlowIssue
Argument `start` might be null
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            List<Schedule> schedules =
                    queryReleaseSchedulerListByProcessDefinitionCode(command.getProcessDefinitionCode());
            List<Date> complementDateList = CronUtils.getSelfFireDateList(start, end, schedules);

            if (CollectionUtils.isNotEmpty(complementDateList)) {
```

### DataFlowIssue
Argument `end` might be null
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            List<Schedule> schedules =
                    queryReleaseSchedulerListByProcessDefinitionCode(command.getProcessDefinitionCode());
            List<Date> complementDateList = CronUtils.getSelfFireDateList(start, end, schedules);

            if (CollectionUtils.isNotEmpty(complementDateList)) {
```

### DataFlowIssue
Method invocation `getProcessDefinitionCode` may produce `NullPointerException`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                if (parameterJson.get(CMD_PARAM_SUB_PROCESS_DEFINE_CODE) != null) {
                    SubProcessParameters subProcessParam = JSONUtils.parseObject(parameter, SubProcessParameters.class);
                    ids.add(subProcessParam.getProcessDefinitionCode());
                    recurseFindSubProcess(subProcessParam.getProcessDefinitionCode(), ids);
                }
```

### DataFlowIssue
Method invocation `getResources` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return JSONUtils.parseObject(parameters, SqlParameters.class).getResources();
    }

```

### DataFlowIssue
Method invocation `getResources` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return JSONUtils.parseObject(parameters, DataxParameters.class).getResources();
    }
}
```

### DataFlowIssue
Method invocation `getResources` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/SqoopTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return JSONUtils.parseObject(parameters, SqoopParameters.class).getResources();
    }
}
```

### DataFlowIssue
Method invocation `getSrcDatasource` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/parameter/SqoopParameters.java`
#### Snippet
```java

        DataSourceParameters dataSource = (DataSourceParameters) parametersHelper
                .getResourceParameters(ResourceType.DATASOURCE, sourceMysqlParameter.getSrcDatasource());
        DataSourceParameters dataTarget = (DataSourceParameters) parametersHelper
                .getResourceParameters(ResourceType.DATASOURCE, targetMysqlParameter.getTargetDatasource());
```

### DataFlowIssue
Method invocation `getTargetDatasource` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/parameter/SqoopParameters.java`
#### Snippet
```java
                .getResourceParameters(ResourceType.DATASOURCE, sourceMysqlParameter.getSrcDatasource());
        DataSourceParameters dataTarget = (DataSourceParameters) parametersHelper
                .getResourceParameters(ResourceType.DATASOURCE, targetMysqlParameter.getTargetDatasource());

        if (Objects.nonNull(dataSource)) {
```

### DataFlowIssue
Method invocation `getSrcDatasource` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/parameter/SqoopParameters.java`
#### Snippet
```java
        SourceMysqlParameter sourceMysqlParameter =
                JSONUtils.parseObject(this.getSourceParams(), SourceMysqlParameter.class);
        if (sourceMysqlParameter.getSrcDatasource() != 0) {
            resources.put(ResourceType.DATASOURCE, sourceMysqlParameter.getSrcDatasource());
        }
```

### DataFlowIssue
Method invocation `getTargetDatasource` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/parameter/SqoopParameters.java`
#### Snippet
```java
        TargetMysqlParameter targetMysqlParameter =
                JSONUtils.parseObject(this.getTargetParams(), TargetMysqlParameter.class);
        if (targetMysqlParameter.getTargetDatasource() != 0) {
            resources.put(ResourceType.DATASOURCE, targetMysqlParameter.getTargetDatasource());
        }
```

### DataFlowIssue
Method invocation `getResources` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-chunjun/src/main/java/org/apache/dolphinscheduler/plugin/task/chunjun/ChunJunTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return JSONUtils.parseObject(parameters, ChunJunParameters.class).getResources();
    }
}
```

### DataFlowIssue
Method invocation `checkParameters` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-hivecli/src/main/java/org/apache/dolphinscheduler/plugin/task/hivecli/HiveCliTask.java`
#### Snippet
```java
        hiveCliParameters = JSONUtils.parseObject(taskExecutionContext.getTaskParams(), HiveCliParameters.class);

        if (!hiveCliParameters.checkParameters()) {
            throw new TaskException("hiveCli task params is not valid");
        }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                        Thread.sleep(3000);
                    } finally {
                        status.close();
                    }
                }
```

### DataFlowIssue
Method invocation `getMsg` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
            public void onMessage(String message) {
                ExecLog execLog = JSONUtils.parseObject(message, ExecLog.class);
                log.info(execLog.getMsg());
            }

```

### DataFlowIssue
Method invocation `getSuccessNode` may produce `NullPointerException`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
        List<String> skipNodeList = new ArrayList<>();
        if (taskInstance.getState().isSuccess()) {
            conditionTaskList = conditionsParameters.getSuccessNode();
            skipNodeList = conditionsParameters.getFailedNode();
        } else if (taskInstance.getState().isFailure()) {
```

### DataFlowIssue
Method invocation `getFailedNode` may produce `NullPointerException`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
            skipNodeList = conditionsParameters.getFailedNode();
        } else if (taskInstance.getState().isFailure()) {
            conditionTaskList = conditionsParameters.getFailedNode();
            skipNodeList = conditionsParameters.getSuccessNode();
        } else {
```

### DataFlowIssue
Method invocation `getResources` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-procedure/src/main/java/org/apache/dolphinscheduler/plugin/task/procedure/ProcedureTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return JSONUtils.parseObject(parameters, ProcedureParameters.class).getResources();
    }
}
```

### DataFlowIssue
Method invocation `getEngine` may produce `NullPointerException`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/SeatunnelTaskChannel.java`
#### Snippet
```java
        SeatunnelParameters seatunnelParameters =
                JSONUtils.parseObject(taskRequest.getTaskParams(), SeatunnelParameters.class);
        if (EngineEnum.FLINK == seatunnelParameters.getEngine()) {
            return new SeatunnelFlinkTask(taskRequest);
        } else if (EngineEnum.SPARK == seatunnelParameters.getEngine()) {
```

### DataFlowIssue
Argument `azureSQLDataSourceParamDTO` might be null
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-azure-sql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/azuresql/param/AzureSQLDataSourceProcessor.java`
#### Snippet
```java
        AzureSQLDataSourceParamDTO azureSQLDataSourceParamDTO =
                JSONUtils.parseObject(paramJson, AzureSQLDataSourceParamDTO.class);
        checkTrustServerCertificate(azureSQLDataSourceParamDTO);
        return azureSQLDataSourceParamDTO;
    }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/schedule/ScheduleUpdateRequest.java`
#### Snippet
```java

    public Schedule mergeIntoSchedule(Schedule schedule) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Schedule scheduleDeepCopy = (Schedule) BeanUtils.cloneBean(schedule);;
        assert scheduleDeepCopy != null;
        if (this.crontab != null) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/enums/ResourceManagerType.java`
#### Snippet
```java
    YARN,

    KUBERNETES;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/PropertyUtils.java`
#### Snippet
```java
    public static synchronized void loadPropertyFile(String... propertyFiles) {
        for (String fileName : propertyFiles) {
            try (InputStream fis = PropertyUtils.class.getResourceAsStream(fileName);) {
                Properties subProperties = new Properties();
                subProperties.load(fis);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
            try (
                    FileInputStream fileInputStream = new FileInputStream(pathName);
                    CheckedInputStream checkedInputStream = new CheckedInputStream(fileInputStream, crc32);) {
                while (checkedInputStream.read() != -1) {
                }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/event/WorkflowEventType.java`
#### Snippet
```java

    START_WORKFLOW,
    ;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowSubmitStatue.java`
#### Snippet
```java
     */
    DUPLICATED_SUBMITTED,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java
    private enum TaskRunnableStatus {
        CREATED, STARTED,
        ;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/dispatch/enums/ExecutorType.java`
#### Snippet
```java
    WORKER,

    CLIENT;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
    private enum WorkflowRunnableStatus {
        CREATED, INITIALIZE_DAG, INITIALIZE_QUEUE, STARTED,
        ;

    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/codec/NettyDecoder.java`
#### Snippet
```java
        CONTEXT,
        BODY_LENGTH,
        BODY;
    }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/command/CommandType.java`
#### Snippet
```java
     * workflow executing data response, from master to api
     */
    WORKFLOW_EXECUTING_DATA_RESPONSE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/config/TaskExecuteThreadsFullPolicy.java`
#### Snippet
```java
    CONTINUE,
    REJECT,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-registry/dolphinscheduler-registry-api/src/main/java/org/apache/dolphinscheduler/registry/api/StrategyType.java`
#### Snippet
```java
    STOP,
    WAITING,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/LoopTaskMethodType.java`
#### Snippet
```java
public enum LoopTaskMethodType {
    HTTP,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/enums/ResourceType.java`
#### Snippet
```java

    DATASOURCE,
    UDF;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/enums/TaskRunStatus.java`
#### Snippet
```java
    SUCCESS,
    FAIL_AND_NEED_KILL,
    FAIL;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/enums/DependentRelation.java`
#### Snippet
```java
public enum DependentRelation {

    AND, OR;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcConstants.java`
#### Snippet
```java
        public static final String DOWNLOAD = "Download";
        public static final String INIT = "Init DVC";
    };

    public static final String CHECK_AND_SET_DVC_REPO =
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                });
                if (CollectionUtils.isNotEmpty(workerGroupList)) {
                    workerGroupList.stream().forEach(workerGroup -> {
                        if (!StringUtils.isEmpty(workerGroup)) {
                            EnvironmentWorkerGroupRelation relation = new EnvironmentWorkerGroupRelation();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                environmentMapper.update(env, new UpdateWrapper<Environment>().lambda().eq(Environment::getCode, code));
        if (update > 0) {
            deleteWorkerGroupSet.stream().forEach(key -> {
                if (StringUtils.isNotEmpty(key)) {
                    relationMapper.delete(new QueryWrapper<EnvironmentWorkerGroupRelation>()
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                }
            });
            addWorkerGroupSet.stream().forEach(key -> {
                if (StringUtils.isNotEmpty(key)) {
                    EnvironmentWorkerGroupRelation relation = new EnvironmentWorkerGroupRelation();
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java

        Set<ResourcesTask> resourcesNeedToDeleteSet = new HashSet<>();
        String[] allChildrenFullNameArray = allChildren.stream().toArray(String[]::new);

        // check before using allChildrenFullNameArray to query full names.
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java

        taskDefinitionMapper.queryByCodeList(taskCodeSet)
                .stream().forEach(taskDefinition -> {
                    Map<String, Object> localParamsMap = new HashMap<>();
                    String localParams = JSONUtils.getNodeString(taskDefinition.getTaskParams(), LOCAL_PARAMS);
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/datasource/upgrader/v132/V132DolphinSchedulerUpgrader.java`
#### Snippet
```java

                        if (CollectionUtils.isNotEmpty(resourceList)) {
                            List<ResourceInfo> newResourceList = resourceList.stream().map(resInfo -> {
                                String fullName = resInfo.getRes().startsWith("/") ? resInfo.getRes()
                                        : String.format("/%s", resInfo.getRes());
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/SqlParameters.java`
#### Snippet
```java
        if (udfTypeFlag) {
            List<UdfFuncParameters> collect = parametersHelper.getResourceMap(ResourceType.UDF).entrySet().stream()
                    .map(entry -> (UdfFuncParameters) entry.getValue()).collect(Collectors.toList());
            sqlTaskExecutionContext.setUdfFuncParametersList(collect);
        }
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            resourceFullNames = params.getResourceFilesList().stream()
                    .filter(t -> !StringUtils.isBlank(t.getResourceName()))
                    .map(ResourceInfo::getResourceName)
                    .collect(toSet());
        }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                    StringBuffer errs = new StringBuffer();
                    if (CollectionUtils.isNotEmpty(errormsg)) {
                        errs.append(",errs:").append(errormsg.stream().collect(Collectors.joining(",")));
                    }
                    throw new Exception("trigger PIGEON job faild taskName:" + targetJobName + errs.toString());
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                StringBuffer errs = new StringBuffer();
                if (CollectionUtils.isNotEmpty(errormsg)) {
                    errs.append(",errs:").append(errormsg.stream().collect(Collectors.joining(",")));
                }
                throw new TaskException("cancel PIGEON job faild taskId:" + triggerResult.getTaskId() + errs);
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java

        DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(bucketName)
                .withKeys(childrenPathList.stream().toArray(String[]::new));
        try {
            s3Client.deleteObjects(deleteObjectsRequest);
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        Date endTime = statisticsStateRequest.getEndTime() == null ? date : statisticsStateRequest.getEndTime();

        Optional<List<ExecuteStatusCount>> startTimeStates = Optional.ofNullable(
                taskInstanceMapper.countTaskInstanceStateByProjectIdsV2(startTime, endTime, projectIds));
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
    }

    private List<TaskExecutionStatus> setOptional(Optional<List<ExecuteStatusCount>> startTimeStates) {
        List<TaskExecutionStatus> allState = Arrays.stream(TaskExecutionStatus.values()).collect(Collectors.toList());
        if (startTimeStates.isPresent() && startTimeStates.get().size() != 0) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        }
        Set<Integer> projectId = Collections.singleton(project.getId());
        Optional<List<ExecuteStatusCount>> startTimeStates = Optional.ofNullable(
                taskInstanceMapper.countTaskInstanceStateByProjectIdsV2(null, null, projectId));
        List<TaskExecutionStatus> needRecountState = setOptional(startTimeStates);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
    public List<ExecuteStatusCount> countTaskInstanceAllStatesByProjectCodes(Date startTime, Date endTime,
                                                                             Long[] projectCodes) {
        Optional<List<ExecuteStatusCount>> startTimeStates = Optional.ofNullable(
                this.taskInstanceMapper.countTaskInstanceStateByProjectCodes(startTime, endTime, projectCodes));

```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
        } else {
            List<String> workerGroups = relationMapper.queryByEnvironmentCode(env.getCode()).stream()
                    .map(item -> item.getWorkerGroup())
                    .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
        } else {
            List<String> workerGroups = relationMapper.queryByEnvironmentCode(env.getCode()).stream()
                    .map(item -> item.getWorkerGroup())
                    .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
                .queryByEnvironmentCode(code)
                .stream()
                .map(item -> item.getWorkerGroup())
                .collect(Collectors.toSet());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
        if (!projectIds.isEmpty()) {
            List<Project> projects = projectMapper.selectBatchIds(projectIds);
            List<Long> projectCodes = projects.stream().map(project -> project.getCode()).collect(Collectors.toList());
            count = projectMapper.queryAllWorkflowCounts(projectCodes);
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        // recursively delete a folder
        List<String> allChildren = storageOperate.listFilesStatusRecursively(fullName, defaultPath,
                resTenantCode, resource.getType()).stream().map(storageEntity -> storageEntity.getFullName())
                .collect(Collectors.toList());

```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'containsKey()' check
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
        command.setProcessDefinitionCode(processInstance.getProcessDefinitionCode());
        Map<String, String> cmdParam = JSONUtils.toMap(processInstance.getCommandParam());
        if (cmdParam.containsKey(CMD_PARAM_RECOVERY_START_NODE_STRING)) {
            cmdParam.remove(CMD_PARAM_RECOVERY_START_NODE_STRING);
        }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'processDefine' in a Serializable class
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
     */
    @TableField(exist = false)
    private ProcessDefinition processDefine;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'switchDependency' in a Serializable class
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
     */
    @TableField(exist = false)
    private SwitchParameters switchDependency;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'taskDefine' in a Serializable class
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
     */
    @TableField(exist = false)
    private TaskDefinition taskDefine;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dependency' in a Serializable class
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
     */
    @TableField(exist = false)
    private DependentParameters dependency;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'processInstance' in a Serializable class
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskInstance.java`
#### Snippet
```java
     */
    @TableField(exist = false)
    private ProcessInstance processInstance;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'masterConfig' in a Serializable class
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private MasterConfig masterConfig;

    @Autowired
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'stateWheelExecuteThread' in a Serializable class
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private StateWheelExecuteThread stateWheelExecuteThread;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'stateEventCallbackService' in a Serializable class
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private StateEventCallbackService stateEventCallbackService;

    @Autowired
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'masterConfig' in a Serializable class
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private MasterConfig masterConfig;

    @PostConstruct
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'masterConfig' in a Serializable class
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/processor/queue/TaskExecuteThreadPool.java`
#### Snippet
```java

    @Autowired
    private MasterConfig masterConfig;

    @Autowired
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'workflowExecuteDto' in a Serializable class
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/command/WorkflowExecutingDataResponseCommand.java`
#### Snippet
```java
public class WorkflowExecutingDataResponseCommand implements Serializable {

    private WorkflowExecuteDto workflowExecuteDto;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'resourceParametersHelper' in a Serializable class
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/TaskExecutionContext.java`
#### Snippet
```java
    private String taskLogName;

    private ResourceParametersHelper resourceParametersHelper;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queryState' in a Serializable class
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java

        private LoopTaskSubmitMethodYamlDefinition submit;
        private LoopTaskQueryStateYamlDefinition queryState;
        private LoopTaskCancelYamlDefinition cancel;
    }
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'submit' in a Serializable class
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
    public static class LoopTaskAPIYamlDefinition implements Serializable {

        private LoopTaskSubmitMethodYamlDefinition submit;
        private LoopTaskQueryStateYamlDefinition queryState;
        private LoopTaskCancelYamlDefinition cancel;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cancel' in a Serializable class
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/LoopTaskYamlDefinition.java`
#### Snippet
```java
        private LoopTaskSubmitMethodYamlDefinition submit;
        private LoopTaskQueryStateYamlDefinition queryState;
        private LoopTaskCancelYamlDefinition cancel;
    }

```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/CheckUtils.java`
#### Snippet
```java
     *
     * @param desc desc
     * @return true if description regex valid, otherwise return false
     */
    public static Map<String, Object> checkDesc(String desc) {
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/TenantService.java`
#### Snippet
```java
     *
     * @param tenantCode tenant code
     * @return true if tenant code can user, otherwise return false
     */
    Result verifyTenantCode(String tenantCode);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/DataSourceService.java`
#### Snippet
```java
     * @param type      data source type
     * @param parameter data source parameters
     * @return true if connect successfully, otherwise false
     */
    Result<Object> checkConnection(DbType type, ConnectionParam parameter);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/DataSourceService.java`
#### Snippet
```java
     *
     * @param name      datasource name
     * @return true if data datasource not exists, otherwise return false
     */
    Result<Object> verifyDataSourceName(String name);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ProjectService.java`
#### Snippet
```java
     * @param projectCode project code
     * @param perm String
     * @return true if the login user have permission to see the project
     */
    Map<String, Object> checkProjectAndAuth(User loginUser, Project project, long projectCode, String perm);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/QueueService.java`
#### Snippet
```java
     * @param queue     queue
     * @param queueName queue name
     * @return true if the queue name not exists, otherwise return false
     */
    Result<Object> verifyQueue(String queue, String queueName);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ResourcesService.java`
#### Snippet
```java
     * @param fullName  resource full name
     * @param type      resource type
     * @return true if the resource name not exists, otherwise return false
     */
    Result<Object> verifyResourceName(String fullName, ResourceType type, User loginUser);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ResourcesService.java`
#### Snippet
```java
     * @param fileName  resource file name
     * @param type      resource type
     * @return true if the resource file name, otherwise return false
     */
    Result<Object> queryResourceByFileName(User loginUser, String fileName, ResourceType type, String resTenantCode);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ClusterService.java`
#### Snippet
```java
     *
     * @param clusterName cluster name
     * @return true if the cluster name not exists, otherwise return false
     */
    Map<String, Object> verifyCluster(String clusterName);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/K8sNamespaceService.java`
#### Snippet
```java
     * @param namespace   namespace
     * @param clusterCode cluster code
     * @return true if the k8s and namespace not exists, otherwise return false
     */
    Result<Object> verifyNamespaceK8s(String namespace, Long clusterCode);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/EnvironmentService.java`
#### Snippet
```java
     *
     * @param environmentName environment name
     * @return true if the environment name not exists, otherwise return false
     */
    Map<String, Object> verifyEnvironment(String environmentName);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/UdfFuncService.java`
#### Snippet
```java
     *
     * @param name name
     * @return true if the name can user, otherwise return false
     */
    Result<Object> verifyUdfFuncByName(User loginUser, String name);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/UsersService.java`
#### Snippet
```java
     *
     * @param userName user name
     * @return true if user name not exists, otherwise return false
     */
    Result<Object> verifyUserName(String userName);
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ProcessDefinitionService.java`
#### Snippet
```java
     * @param name name
     * @param processDefinitionCode processDefinitionCode
     * @return true if process definition name not exists, otherwise false
     */
    Map<String, Object> verifyProcessDefinitionName(User loginUser,
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UdfFuncServiceImpl.java`
#### Snippet
```java
     *
     * @param name name
     * @return true if the name can user, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TenantServiceImpl.java`
#### Snippet
```java
     *
     * @param tenantCode tenant code
     * @return true if tenant code can use, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
     *
     * @param name datasource name
     * @return true if data datasource not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
     * @param type data source type
     * @param connectionParam connectionParam
     * @return true if connect successfully, otherwise false
     * @return true if connect successfully, otherwise false
     */
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
     * @param connectionParam connectionParam
     * @return true if connect successfully, otherwise false
     * @return true if connect successfully, otherwise false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ClusterServiceImpl.java`
#### Snippet
```java
     *
     * @param clusterName cluster name
     * @return true if the cluster name not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/EnvironmentServiceImpl.java`
#### Snippet
```java
     *
     * @param environmentName environment name
     * @return true if the environment name not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/QueueServiceImpl.java`
#### Snippet
```java
     * @param queue queue
     * @param queueName queue name
     * @return true if the queue name not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
     *
     * @param userName user name
     * @return true if user name not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
     * @param namespace   namespace
     * @param clusterCode cluster code
     * @return true if the k8s and namespace not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
     * @param project     project
     * @param projectCode project code
     * @return true if the login user have permission to see the project
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/DataSourceController.java`
#### Snippet
```java
     * @param loginUser login user
     * @param name data source name
     * @return true if data source name not exists.otherwise return false
     */
    @Operation(summary = "verifyDataSourceName", description = "VERIFY_DATA_SOURCE_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/EnvironmentController.java`
#### Snippet
```java
     * @param loginUser login user
     * @param environmentName environment name
     * @return true if the environment name not exists, otherwise return false
     */
    @Operation(summary = "verifyEnvironment", description = "VERIFY_ENVIRONMENT_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
     * @param fullName  resource full name
     * @param type      resource type
     * @return true if the resource name not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
     * @param resTenantCode tenantCode in the request field "resTenantCode" for tenant code owning the resource,
     *                      can be different from the login user in the case of logging in as admin users.
     * @return true if the resource full name or pid not exists, otherwise return false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
     * @param projectCode project code
     * @param name name
     * @return true if process definition name not exists, otherwise false
     */
    @Operation(summary = "verify-name", description = "VERIFY_PROCESS_DEFINITION_NAME_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/QueueController.java`
#### Snippet
```java
     * @param queue     queue
     * @param queueName queue name
     * @return true if the queue name not exists, otherwise return false
     */
    @Operation(summary = "verifyQueue", description = "VERIFY_QUEUE_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ClusterController.java`
#### Snippet
```java
     * @param loginUser   login user
     * @param clusterName cluster name
     * @return true if the cluster name not exists, otherwise return false
     */
    @Operation(summary = "verifyCluster", description = "VERIFY_CLUSTER_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
     * @param namespace   namespace
     * @param clusterCode cluster code
     * @return true if the k8s and namespace not exists, otherwise return false
     */
    @Operation(summary = "verifyNamespaceK8s", description = "VERIFY_NAMESPACE_K8S_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TenantController.java`
#### Snippet
```java
     * @param loginUser login user
     * @param tenantCode tenant code
     * @return true if tenant code can use, otherwise return false
     */
    @Operation(summary = "verifyTenantCode", description = "VERIFY_TENANT_CODE_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/v2/QueueV2Controller.java`
#### Snippet
```java
     * @param loginUser          login user
     * @param queueVerifyRequest queueVerifyRequest
     * @return true if the queue name not exists, otherwise return false
     */
    @Operation(summary = "verifyQueue", description = "VERIFY_QUEUE_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
     * @param projectCode project code
     * @param name name
     * @return true if process definition name not exists, otherwise false
     */
    @Override
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ResourcesController.java`
#### Snippet
```java
     * @param loginUser login user
     * @param name name
     * @return true if the name can user, otherwise return false
     */
    @Operation(summary = "verifyUdfFuncName", description = "VERIFY_UDF_FUNCTION_NAME_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ResourcesController.java`
#### Snippet
```java
     * @param fullName resource full name
     * @param type resource type
     * @return true if the resource name not exists, otherwise return false
     */
    @Operation(summary = "verifyResourceName", description = "VERIFY_RESOURCE_NAME_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ResourcesController.java`
#### Snippet
```java
     * @param tenantCode tenantcode of the owner of the resource
     * @param type resource type
     * @return true if the resource name not exists, otherwise return false
     */
    @Operation(summary = "queryResourceByFileName", description = "QUERY_BY_RESOURCE_FILE_NAME")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
     * @param loginUser login user
     * @param userName user name
     * @return true if user name not exists, otherwise return false
     */
    @Operation(summary = "verifyUserName", description = "VERIFY_USER_NAME_NOTES")
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/mapper/K8sNamespaceMapper.java`
#### Snippet
```java
     *
     * @param namespaceCode namespaceCode
     * @return true if exist else return null
     */
    K8sNamespace queryByNamespaceCode(@Param("clusterCode") Long namespaceCode);
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            } else {
                log.error("set scheduler time error: complement date list is empty, command: {}",
                        command.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                        errs.append(",errs:").append(errormsg.stream().collect(Collectors.joining(",")));
                    }
                    throw new Exception("trigger PIGEON job faild taskName:" + targetJobName + errs.toString());
                }
                taskId = triggerResult.getBizresult().getTaskid();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/param/HiveDataSourceProcessor.java`
#### Snippet
```java
        }
        address.deleteCharAt(address.length() - 1);
        String jdbcUrl = address.toString() + "/" + hiveParam.getDatabase();

        HiveConnectionParam hiveConnectionParam = new HiveConnectionParam();
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ServerComparator` may be 'static'
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/queue/MasterPriorityQueue.java`
#### Snippet
```java
     * server comparator, used to sort server by createTime in reverse order.
     */
    private class ServerComparator implements Comparator<Server> {

        @Override
```

### InnerClassMayBeStatic
Inner class `Options` may be 'static'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncParameters.java`
#### Snippet
```java
    @NoArgsConstructor
    @ToString
    public class Options {

        private String verifyMode;
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
                                    case "upstream":
                                        upstreams = Arrays.stream(value.split(",")).map(String::trim)
                                                .filter(s -> !"".equals(s)).collect(Collectors.toList());
                                        line = line.substring(0, commentIndex);
                                        break;
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
                            }
                        }
                        if (!"".equals(line)) {
                            sql.append(line).append("\n");
                        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/MailSender.java`
#### Snippet
```java
    public MailSender(Map<String, String> config) {
        String receiversConfig = config.get(MailParamsConstants.NAME_PLUGIN_DEFAULT_EMAIL_RECEIVERS);
        if (receiversConfig == null || "".equals(receiversConfig)) {
            throw new AlertEmailException(MailParamsConstants.NAME_PLUGIN_DEFAULT_EMAIL_RECEIVERS + mustNotNull);
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/MailSender.java`
#### Snippet
```java

        receiverCcs = new ArrayList<>();
        if (receiverCcsConfig != null && !"".equals(receiverCcsConfig)) {
            receiverCcs.addAll(Arrays.asList(receiverCcsConfig.split(",")));
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/FileUtils.java`
#### Snippet
```java
     */
    public static File[] getAllDir(String parentDir) {
        if (parentDir == null || "".equals(parentDir)) {
            throw new RuntimeException("parentDir can not be empty");
        }
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/LoggerServiceImpl.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Result<ResponseTaskLog> queryLog(User loginUser, int taskInstId, int skipLineNum, int limit) {

        TaskInstance taskInstance = taskInstanceDao.findTaskInstanceById(taskInstId);
```

### RedundantSuppression
Redundant suppression
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/LoggerServiceImpl.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> queryLog(User loginUser, long projectCode, int taskInstId, int skipLineNum, int limit) {
        Project project = projectMapper.queryByCode(projectCode);
        // check user access for project
```

### RedundantSuppression
Redundant suppression
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/KerberosHttpClient.java`
#### Snippet
```java
            @SuppressWarnings("serial")
            @Override
            public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
                Map<String, Object> options = new HashMap<>(9);
                options.put("useTicketCache", "false");
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `RpcProtocolConstants` has only 'static' members, and a 'public' constructor
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/protocol/RpcProtocolConstants.java`
#### Snippet
```java
package org.apache.dolphinscheduler.rpc.protocol;

public class RpcProtocolConstants {

    public RpcProtocolConstants() {
```

### UtilityClassWithPublicConstructor
Class `DataSourceUtils` has only 'static' members, and a 'public' constructor
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/utils/DataSourceUtils.java`
#### Snippet
```java

@Slf4j
public class DataSourceUtils {

    public DataSourceUtils() {
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
        }
        // get add task code map
        allPreTaskCodeSet.add(Long.valueOf(taskCode));
        List<TaskDefinition> taskDefinitionList = taskDefinitionMapper.queryByCodeList(allPreTaskCodeSet);
        Map<Long, TaskDefinition> taskCodeMap = taskDefinitionList.stream().collect(Collectors
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/config/Config.java`
#### Snippet
```java

    public boolean isEmpty() {
        return configuration.size() <= 0;
    }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'startTimeStates'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataAnalysisServiceImpl.java`
#### Snippet
```java
    }

    private List<TaskExecutionStatus> setOptional(Optional<List<ExecuteStatusCount>> startTimeStates) {
        List<TaskExecutionStatus> allState = Arrays.stream(TaskExecutionStatus.values()).collect(Collectors.toList());
        if (startTimeStates.isPresent() && startTimeStates.get().size() != 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'needFailoverWorkerStartTime'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/WorkerFailoverService.java`
#### Snippet
```java
     * @return true if task instance need fail over
     */
    private boolean checkTaskInstanceNeedFailover(Optional<Date> needFailoverWorkerStartTime,
                                                  @Nullable ProcessInstance processInstance,
                                                  TaskInstance taskInstance) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'beFailoveredMasterStartupTimeOptional'
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/service/MasterFailoverService.java`
#### Snippet
```java
    }

    private boolean checkProcessInstanceNeedFailover(Optional<Date> beFailoveredMasterStartupTimeOptional,
                                                     @NonNull ProcessInstance processInstance) {
        // The process has already been failover, since when we do master failover we will hold a lock, so we can
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-dingtalk/src/main/java/org/apache/dolphinscheduler/plugin/alert/dingtalk/DingTalkSender.java`
#### Snippet
```java
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");
        } catch (Exception e) {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/RegexUtils.java`
#### Snippet
```java
        // Logging should not be vulnerable to injection attacks: Replace pattern-breaking characters
        if (!StringUtils.isEmpty(str)) {
            return str.replaceAll("[\n|\r|\t]", "_");
        }
        return null;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/LoggerServiceImpl.java`
#### Snippet
```java
        Result<ResponseTaskLog> result = new Result<>(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg());
        String log = queryLog(taskInstance, skipLineNum, limit);
        int lineNum = log.split("\\r\\n").length;
        result.setData(new ResponseTaskLog(lineNum, log));
        return result;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
        while ((line = br.readLine()) != null) {
            if (line.contains(DEPENDENT_SPLIT)) {
                String[] tmpStringArray = line.split(":\\|\\|");
                if (tmpStringArray.length != 2) {
                    continue;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
        }

        String result = resourceYaml.replace("${name}", name)
                .replace("${namespace}", namespace);
        if (cpuStr == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java

        String result = resourceYaml.replace("${name}", name)
                .replace("${namespace}", namespace);
        if (cpuStr == null) {
            result = result.replace("${limitCpu}", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
                .replace("${namespace}", namespace);
        if (cpuStr == null) {
            result = result.replace("${limitCpu}", "");
        } else {
            result = result.replace("${limitCpu}", "limits.cpu: '" + cpuStr + "'");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
            result = result.replace("${limitCpu}", "");
        } else {
            result = result.replace("${limitCpu}", "limits.cpu: '" + cpuStr + "'");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java

        if (memoryStr == null) {
            result = result.replace("${limitMemory}", "");
        } else {
            result = result.replace("${limitMemory}", "limits.memory: " + memoryStr);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/K8SNamespaceServiceImpl.java`
#### Snippet
```java
            result = result.replace("${limitMemory}", "");
        } else {
            result = result.replace("${limitMemory}", "limits.memory: " + memoryStr);
        }
        return result;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        LocalDateTime now = LocalDateTime.now();
        now = now.minus(days, ChronoUnit.DAYS);
        String deleteDate = now.toLocalDate().toString().replace("-", "");
        List<StorageEntity> storageEntities;
        try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/upgrade/SchemaUtils.java`
#### Snippet
```java
        try (InputStream inputStream = softVersionFile.getInputStream()) {
            softVersion = FileUtils.readFile2Str(inputStream);
            softVersion = Strings.nullToEmpty(softVersion).replaceAll("\\s+|\r|\n", "");
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
        String msgJson = "";
        if (sendType.equals(WeChatType.APP.getDescp())) {
            enterpriseWeChatPushUrlReplace = WeChatAlertConstants.WE_CHAT_PUSH_URL.replace(TOKEN_REGEX, weChatToken);
            WechatAppMessage wechatAppMessage = new WechatAppMessage(weChatUsers, showType,
                    Integer.valueOf(weChatAgentIdChatId), contentMap, WE_CHAT_MESSAGE_SAFE_PUBLICITY,
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
        } else if (sendType.equals(WeChatType.APPCHAT.getDescp())) {
            enterpriseWeChatPushUrlReplace =
                    WeChatAlertConstants.WE_CHAT_APP_CHAT_PUSH_URL.replace(TOKEN_REGEX, weChatToken);
            WechatAppChatMessage wechatAppChatMessage =
                    new WechatAppChatMessage(weChatAgentIdChatId, showType, contentMap, WE_CHAT_MESSAGE_SAFE_PUBLICITY);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
        requireNonNull(showType, AlertConstants.NAME_SHOW_TYPE + MUST_NOT_NULL);
        weChatTokenUrlReplace = weChatTokenUrl
                .replace(CORP_ID_REGEX, weChatCorpId)
                .replace(SECRET_REGEX, weChatSecret);
        weChatToken = getToken();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
        weChatTokenUrlReplace = weChatTokenUrl
                .replace(CORP_ID_REGEX, weChatCorpId)
                .replace(SECRET_REGEX, weChatSecret);
        weChatToken = getToken();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-telegram/src/main/java/org/apache/dolphinscheduler/plugin/alert/telegram/TelegramSender.java`
#### Snippet
```java
        parseMode = config.get(TelegramParamsConstants.NAME_TELEGRAM_PARSE_MODE);
        if (url == null || url.isEmpty()) {
            url = TelegramAlertConstants.TELEGRAM_PUSH_URL.replace(BOT_TOKEN_REGEX, botToken);
        } else {
            url = url.replace(BOT_TOKEN_REGEX, botToken);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-telegram/src/main/java/org/apache/dolphinscheduler/plugin/alert/telegram/TelegramSender.java`
#### Snippet
```java
            url = TelegramAlertConstants.TELEGRAM_PUSH_URL.replace(BOT_TOKEN_REGEX, botToken);
        } else {
            url = url.replace(BOT_TOKEN_REGEX, botToken);
        }
        enableProxy = Boolean.valueOf(config.get(TelegramParamsConstants.NAME_TELEGRAM_PROXY_ENABLE));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCode = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String absolutePath = System.getProperty("user.dir");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
                break;
            }
            String content = setTaskParams(info.getCondition().replaceAll("'", "\""), rgex);
            log.info("format condition sentence::{}", content);
            Boolean result = null;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/utils/TaskFilesTransferUtils.java`
#### Snippet
```java
                taskExecutionContext.getProcessInstanceId());
        // get resource fileL: resourceFolder/TaskName_TaskInstanceID_FileName
        return String.format("%s/%s_%s_%s", resourceFolder, taskExecutionContext.getTaskName().replace(" ", "_"),
                taskExecutionContext.getTaskInstanceId(), fileName);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractYarnTask.java`
#### Snippet
```java
                ? mainJar.getRes()
                // when update resource maybe has error
                : mainJar.getResourceName().replaceFirst("/", "");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
    private String getJobHistoryUrl(String applicationId) {
        // eg:application_1587475402360_712719 -> job_1587475402360_712719
        String jobId = applicationId.replace("application", "job");
        return String.format(JOB_HISTORY_ADDRESS, jobId);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
    private String getAppAddress(String appAddress, String rmHa) {

        String[] split1 = appAddress.split(Constants.DOUBLE_SLASH);

        if (split1.length != 2) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/log/TaskLogDiscriminator.java`
#### Snippet
```java
            String prefix = TaskConstants.TASK_LOGGER_INFO_PREFIX + "-";
            if (part1.startsWith(prefix)) {
                key = part1.substring(prefix.length()).replaceFirst("-", "/");
            }
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ArgsUtils.java`
#### Snippet
```java

    public static String escape(String arg) {
        return arg.replace(" ", "\\ ").replace("\"", "\\\"").replace("'", "\\'");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ArgsUtils.java`
#### Snippet
```java

    public static String escape(String arg) {
        return arg.replace(" ", "\\ ").replace("\"", "\\\"").replace("'", "\\'");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ArgsUtils.java`
#### Snippet
```java

    public static String escape(String arg) {
        return arg.replace(" ", "\\ ").replace("\"", "\\\"").replace("'", "\\'");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(inputString)) {
            return inputString.replace("%", "////%").replaceAll("[\n|\r\t]", "_");
        }
        return inputString;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java

        if (!StringUtils.isEmpty(inputString)) {
            return inputString.replace("%", "////%").replaceAll("[\n|\r\t]", "_");
        }
        return inputString;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parameters/AbstractParameters.java`
#### Snippet
```java
     */
    public static Map<String, String> getMapByString(String result) {
        String[] formatResult = result.split("\\$VarPool\\$");
        Map<String, String> format = new HashMap<>();
        for (String info : formatResult) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
                ? mainJar.getRes()
                // when update resource maybe has error
                : mainJar.getResourceName().replaceFirst(SINGLE_SLASH, "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
     **/
    protected String buildJavaSourceContent() {
        String rawJavaScript = javaParameters.getRawScript().replaceAll("\\r\\n", "\n");
        // replace placeholder

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
    @Override
    public String getPreScript() {
        String rawJavaScript = javaParameters.getRawScript().replaceAll("\\r\\n", "\n");
        try {
            rawJavaScript = convertJavaSourceCodePlaceholders(rawJavaScript);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java

        column = column.trim();
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
        column = column.trim();
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");

        switch (dbType) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FileUtils.java`
#### Snippet
```java

            if (StringUtils.isNotEmpty(script)) {
                String replacedScript = script.replaceAll("\\r\\n", "\n");
                FileUtils.writeStringToFile(scriptFile, replacedScript, StandardOpenOption.APPEND);
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-shell/src/main/java/org/apache/dolphinscheduler/plugin/task/shell/ShellTask.java`
#### Snippet
```java
        }

        String script = shellParameters.getRawScript().replaceAll("\\r\\n", System.lineSeparator());
        script = parseScript(script);
        shellParameters.setRawScript(script);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/generator/SqoopJobGenerator.java`
#### Snippet
```java
                    targetGenerator.generate(sqoopParameters, sqoopTaskExecutionContext));
        } else if (SqoopJobType.CUSTOM.getDescp().equals(sqoopParameters.getJobType())) {
            sqoopScripts = sqoopParameters.getCustomShell().replaceAll("\\r\\n", System.lineSeparator());
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTask.java`
#### Snippet
```java

    private String replaceParam(String script) {
        script = script.replaceAll("\\r\\n", System.lineSeparator());
        // replace placeholder, and combining local and global parameters
        Map<String, Property> paramsMap = taskExecutionContext.getPrepareParamsMap();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
        String[] columnNames;
        sql = String.format("SELECT t.* FROM ( %s ) t WHERE 0 = 1", sql);
        sql = sql.replace(";", "");

        try (
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
            columnNames = new String[num];
            for (int i = 1; i <= num; i++) {
                columnNames[i - 1] = md.getColumnName(i).replace("t.", "");
            }
        } catch (SQLException | ExecutionException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java

        if (dataXParameters.getCustomConfig() == Flag.YES.ordinal()) {
            json = dataXParameters.getJson().replaceAll("\\r\\n", System.lineSeparator());
        } else {
            ObjectNode job = JSONUtils.createObjectNode();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
    private String buildCustomConfigContent() {
        log.info("raw custom config content : {}", linkisParameters.getRawScript());
        String script = linkisParameters.getRawScript().replaceAll("\\r\\n", "\n");
        script = parseScript(script);
        return script;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonConfig.java`
#### Snippet
```java
    private PigeonConfig() {
        ResourceBundle bundle =
                ResourceBundle.getBundle(PigeonConfig.class.getPackage().getName().replace(".", "/") + "/config");
        this.jobTriggerUrl = bundle.getString("job.trigger.url");
        this.jobStatusUrl = bundle.getString("job.status.url");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
        String imageName;
        if (deployModelKey.startsWith("runs:")) {
            imageName = deployModelKey.replace("runs:/", "");
        } else if (deployModelKey.startsWith("models:")) {
            imageName = deployModelKey.replace("models:/", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
            imageName = deployModelKey.replace("runs:/", "");
        } else if (deployModelKey.startsWith("models:")) {
            imageName = deployModelKey.replace("models:/", "");
        } else {
            throw new IllegalArgumentException("model key must start with runs:/ or models:/ ");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowParameters.java`
#### Snippet
```java
            throw new IllegalArgumentException("model key must start with runs:/ or models:/ ");
        }
        imageName = imageName.replace("/", tag).toLowerCase();
        return imageName;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
            String status;
            try {
                status = OSUtils.exeShell(command).replace("\n", "").replace("\"", "");
            } catch (Exception e) {
                status = String.format("error --- %s", e.getMessage());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTask.java`
#### Snippet
```java
            String status;
            try {
                status = OSUtils.exeShell(command).replace("\n", "").replace("\"", "");
            } catch (Exception e) {
                status = String.format("error --- %s", e.getMessage());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTask.java`
#### Snippet
```java
    @Override
    public String getPreScript() {
        String rawPythonScript = pythonParameters.getRawScript().replaceAll("\\r\\n", System.lineSeparator());
        try {
            rawPythonScript = convertPythonScriptPlaceholders(rawPythonScript);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTask.java`
#### Snippet
```java
    protected String buildPythonScriptContent() throws Exception {
        log.info("raw python script : {}", pythonParameters.getRawScript());
        String rawPythonScript = pythonParameters.getRawScript().replaceAll("\\r\\n", System.lineSeparator());
        Map<String, Property> paramsMap = mergeParamsWithContext(pythonParameters);
        return ParameterUtils.convertParameterPlaceholders(rawPythonScript, ParamUtils.convert(paramsMap));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-openmldb/src/main/java/org/apache/dolphinscheduler/plugin/task/openmldb/OpenmldbTask.java`
#### Snippet
```java
        for (String sql : rawSqlScript.split(";")) {
            if (SQL_PATTERN.matcher(sql).find()) {
                sql = sql.replaceAll("\\n", "\\\\n");
                builder.append("con.execute(\"").append(sql).append("\")\n");
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-openmldb/src/main/java/org/apache/dolphinscheduler/plugin/task/openmldb/OpenmldbTask.java`
#### Snippet
```java
        log.info("raw sql script : {}", openmldbParameters.getSql());

        String rawSQLScript = openmldbParameters.getSql().replaceAll("[\\r]?\\n", "\n");
        Map<String, Property> paramsMap = mergeParamsWithContext(openmldbParameters);
        rawSQLScript = ParameterUtils.convertParameterPlaceholders(rawSQLScript, ParamUtils.convert(paramsMap));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-chunjun/src/main/java/org/apache/dolphinscheduler/plugin/task/chunjun/ChunJunTask.java`
#### Snippet
```java

        if (chunJunParameters.getCustomConfig() == Flag.YES.ordinal()) {
            json = chunJunParameters.getJson().replaceAll("\\r\\n", "\n");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/SeatunnelTask.java`
#### Snippet
```java
    private String buildCustomConfigContent() {
        log.info("raw custom config content : {}", seatunnelParameters.getRawScript());
        String script = seatunnelParameters.getRawScript().replaceAll("\\r\\n", System.lineSeparator());
        script = parseScript(script);
        return script;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTask.java`
#### Snippet
```java
    private static String replaceDoubleBrackets(String mainParameter) {
        mainParameter = mainParameter
                .replace(Constants.DOUBLE_BRACKETS_LEFT, Constants.DOUBLE_BRACKETS_LEFT_SPACE)
                .replace(Constants.DOUBLE_BRACKETS_RIGHT, Constants.DOUBLE_BRACKETS_RIGHT_SPACE);
        if (mainParameter.contains(Constants.DOUBLE_BRACKETS_LEFT)
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/rule/parser/MultiTableAccuracyRuleParser.java`
#### Snippet
```java
        String writerSql = RuleManager.DEFAULT_COMPARISON_WRITER_SQL;
        if (context.isCompareWithFixedValue()) {
            writerSql = writerSql.replaceAll("full join \\$\\{comparison_table}", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTask.java`
#### Snippet
```java
        mainParameter = mainParameter
                .replace(Constants.DOUBLE_BRACKETS_LEFT, Constants.DOUBLE_BRACKETS_LEFT_SPACE)
                .replace(Constants.DOUBLE_BRACKETS_RIGHT, Constants.DOUBLE_BRACKETS_RIGHT_SPACE);
        if (mainParameter.contains(Constants.DOUBLE_BRACKETS_LEFT)
                || mainParameter.contains(Constants.DOUBLE_BRACKETS_RIGHT)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/rule/parser/SingleTableRuleParser.java`
#### Snippet
```java

        if (context.isCompareWithFixedValue()) {
            writerSql = writerSql.replaceAll("full join \\$\\{comparison_table}", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/rule/parser/SingleTableCustomSqlRuleParser.java`
#### Snippet
```java
        String writerSql = RuleManager.SINGLE_TABLE_CUSTOM_SQL_WRITER_SQL;
        if (context.isCompareWithFixedValue()) {
            writerSql = writerSql.replaceAll("join \\$\\{comparison_table}", "");
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
            return "";
        } else {
            return RESOURCE_UPLOAD_PATH.replaceFirst(FOLDER_SEPARATOR, "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
    public String getFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return getDir(resourceType, tenantCode) + fileName;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
    public String getResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getS3ResDir(tenantCode), fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-db2/src/main/java/org/apache/dolphinscheduler/plugin/datasource/db2/param/Db2DataSourceProcessor.java`
#### Snippet
```java
        db2DatasourceParamDTO.setUserName(db2DatasourceParamDTO.getUserName());

        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        db2DatasourceParamDTO.setHost(hostPortArray[0].split(Constants.COLON)[0]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/param/HiveDataSourceProcessor.java`
#### Snippet
```java
        hiveDataSourceParamDTO.setJavaSecurityKrb5Conf(hiveConnectionParam.getJavaSecurityKrb5Conf());

        String[] tmpArray = hiveConnectionParam.getAddress().split(Constants.DOUBLE_SLASH);
        StringBuilder hosts = new StringBuilder();
        String[] hostPortArray = tmpArray[tmpArray.length - 1].split(Constants.COMMA);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
            return "";
        } else {
            return RESOURCE_UPLOAD_PATH.replaceFirst(FOLDER_SEPARATOR, "");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
    public String getFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return getDir(resourceType, tenantCode) + fileName;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
    public String getResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getOssResDir(tenantCode), fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-trino/src/main/java/org/apache/dolphinscheduler/plugin/datasource/trino/param/TrinoDataSourceProcessor.java`
#### Snippet
```java
        TrinoConnectionParam connectionParams = (TrinoConnectionParam) createConnectionParams(connectionJson);

        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-mysql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/mysql/param/MySQLDataSourceProcessor.java`
#### Snippet
```java
        if (user.contains(AUTO_DESERIALIZE)) {
            log.warn("sensitive param : {} in username field is filtered", AUTO_DESERIALIZE);
            user = user.replace(AUTO_DESERIALIZE, "");
        }
        String password = PasswordUtils.decodePassword(mysqlConnectionParam.getPassword());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-mysql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/mysql/param/MySQLDataSourceProcessor.java`
#### Snippet
```java
        if (password.contains(AUTO_DESERIALIZE)) {
            log.warn("sensitive param : {} in password field is filtered", AUTO_DESERIALIZE);
            password = password.replace(AUTO_DESERIALIZE, "");
        }
        return DriverManager.getConnection(getJdbcUrl(connectionParam), user, password);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-mysql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/mysql/param/MySQLDataSourceProcessor.java`
#### Snippet
```java

        String address = connectionParams.getAddress();
        String[] hostSeperator = address.split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        mysqlDatasourceParamDTO.setPort(Integer.parseInt(hostPortArray[0].split(Constants.COLON)[1]));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-spark/src/main/java/org/apache/dolphinscheduler/plugin/datasource/spark/param/SparkDataSourceProcessor.java`
#### Snippet
```java

        StringBuilder hosts = new StringBuilder();
        String[] tmpArray = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = tmpArray[tmpArray.length - 1].split(Constants.COMMA);
        Arrays.stream(hostPortArray)
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-dameng/src/main/java/org/apache/dolphinscheduler/plugin/datasource/dameng/param/DamengDataSourceProcessor.java`
#### Snippet
```java

        String address = connectionParams.getAddress();
        String[] hostSeperator = address.split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        damengDatasourceParamDTO.setPort(Integer.parseInt(hostPortArray[0].split(Constants.COLON)[1]));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-presto/src/main/java/org/apache/dolphinscheduler/plugin/datasource/presto/param/PrestoDataSourceProcessor.java`
#### Snippet
```java
        PrestoConnectionParam connectionParams = (PrestoConnectionParam) createConnectionParams(connectionJson);

        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-redshift/src/main/java/org/apache/dolphinscheduler/plugin/datasource/redshift/param/RedshiftDataSourceProcessor.java`
#### Snippet
```java
        RedshiftConnectionParam connectionParams = (RedshiftConnectionParam) createConnectionParams(connectionJson);

        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-sqlserver/src/main/java/org/apache/dolphinscheduler/plugin/datasource/sqlserver/param/SQLServerDataSourceProcessor.java`
#### Snippet
```java
    public BaseDataSourceParamDTO createDatasourceParamDTO(String connectionJson) {
        SQLServerConnectionParam connectionParams = (SQLServerConnectionParam) createConnectionParams(connectionJson);
        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-clickhouse/src/main/java/org/apache/dolphinscheduler/plugin/datasource/clickhouse/param/ClickHouseDataSourceProcessor.java`
#### Snippet
```java
        clickHouseDatasourceParamDTO.setOther(connectionParams.getOther());

        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        clickHouseDatasourceParamDTO.setPort(Integer.parseInt(hostPortArray[0].split(Constants.COLON)[1]));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-postgresql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/postgresql/param/PostgreSQLDataSourceProcessor.java`
#### Snippet
```java

        String address = connectionParams.getAddress();
        String[] hostSeperator = address.split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        postgreSqlDatasourceParamDTO.setHost(hostPortArray[0].split(Constants.COLON)[0]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-starrocks/src/main/java/org/apache/dolphinscheduler/plugin/datasource/starrocks/param/StarRocksDataSourceProcessor.java`
#### Snippet
```java

        String address = connectionParams.getAddress();
        String[] hostSeperator = address.split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);
        starRocksDataSourceParamDTO.setPort(Integer.parseInt(hostPortArray[0].split(Constants.COLON)[1]));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-starrocks/src/main/java/org/apache/dolphinscheduler/plugin/datasource/starrocks/param/StarRocksDataSourceProcessor.java`
#### Snippet
```java
        if (user.contains(AUTO_DESERIALIZE)) {
            log.warn("sensitive param : {} in username field is filtered", AUTO_DESERIALIZE);
            user = user.replace(AUTO_DESERIALIZE, "");
        }
        String password = PasswordUtils.decodePassword(starRocksConnectionParam.getPassword());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-starrocks/src/main/java/org/apache/dolphinscheduler/plugin/datasource/starrocks/param/StarRocksDataSourceProcessor.java`
#### Snippet
```java
        if (password.contains(AUTO_DESERIALIZE)) {
            log.warn("sensitive param : {} in password field is filtered", AUTO_DESERIALIZE);
            password = password.replace(AUTO_DESERIALIZE, "");
        }
        return DriverManager.getConnection(getJdbcUrl(connectionParam), user, password);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-azure-sql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/azuresql/param/AzureSQLDataSourceProcessor.java`
#### Snippet
```java
    public BaseDataSourceParamDTO createDatasourceParamDTO(String connectionJson) {
        AzureSQLConnectionParam connectionParams = (AzureSQLConnectionParam) createConnectionParams(connectionJson);
        String[] hostSeperator = connectionParams.getAddress().split(Constants.DOUBLE_SLASH);
        String[] hostPortArray = hostSeperator[hostSeperator.length - 1].split(Constants.COMMA);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsUdfFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsUdfDir(tenantCode), fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsResDir(tenantCode), fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsDir(resourceType, tenantCode), fileName);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public String getJobHistoryUrl(String applicationId) {
        // eg:application_1587475402360_712719 -> job_1587475402360_712719
        String jobId = applicationId.replace("application", "job");
        return String.format(hdfsProperties.getYarnJobHistoryStatusAddress(), jobId);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getAppAddress(String appAddress, String rmHa) {

        String[] split1 = appAddress.split(Constants.DOUBLE_SLASH);

        if (split1.length != 2) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
        mappingColumnList.forEach(item -> {
            MappingColumn column = new MappingColumn(
                    String.valueOf(item.get(SRC_FIELD)).replace("\"", ""),
                    String.valueOf(item.get(OPERATOR)).replace("\"", " "),
                    String.valueOf(item.get(TARGET_FIELD)).replace("\"", ""));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
            MappingColumn column = new MappingColumn(
                    String.valueOf(item.get(SRC_FIELD)).replace("\"", ""),
                    String.valueOf(item.get(OPERATOR)).replace("\"", " "),
                    String.valueOf(item.get(TARGET_FIELD)).replace("\"", ""));
            list.add(column);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
                    String.valueOf(item.get(SRC_FIELD)).replace("\"", ""),
                    String.valueOf(item.get(OPERATOR)).replace("\"", " "),
                    String.valueOf(item.get(TARGET_FIELD)).replace("\"", ""));
            list.add(column);
        });
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.core.io` is unnecessary, and can be replaced with an import
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/ResourcesService.java`
#### Snippet
```java
     * @throws IOException exception
     */
    org.springframework.core.io.Resource downloadResource(User loginUser, String fullName) throws IOException;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.quartz` is unnecessary and can be removed
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/SchedulerServiceImpl.java`
#### Snippet
```java
            schedule.setStartTime(scheduleParam.getStartTime());
            schedule.setEndTime(scheduleParam.getEndTime());
            if (!org.quartz.CronExpression.isValidExpression(scheduleParam.getCrontab())) {
                log.error("Schedule crontab verify failure, crontab:{}.", scheduleParam.getCrontab());
                putMsg(result, Status.SCHEDULE_CRON_CHECK_FAILED, scheduleParam.getCrontab());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.quartz` is unnecessary and can be removed
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/SchedulerServiceImpl.java`
#### Snippet
```java
        scheduleObj.setStartTime(scheduleParam.getStartTime());
        scheduleObj.setEndTime(scheduleParam.getEndTime());
        if (!org.quartz.CronExpression.isValidExpression(scheduleParam.getCrontab())) {
            log.error("Schedule crontab verify failure, crontab:{}.", scheduleParam.getCrontab());
            putMsg(result, Status.REQUEST_PARAMS_NOT_VALID_ERROR, scheduleParam.getCrontab());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.quartz` is unnecessary, and can be replaced with an import
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
            return result;
        }
        if (!org.quartz.CronExpression.isValidExpression(scheduleObj.getCrontab())) {
            log.error("CronExpression verify failure, cron:{}.", scheduleObj.getCrontab());
            putMsg(result, Status.REQUEST_PARAMS_NOT_VALID_ERROR, scheduleObj.getCrontab());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.lang3.math` is unnecessary, and can be replaced with an import
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
            }
            String value = property.getValue();
            if (!org.apache.commons.lang3.math.NumberUtils.isCreatable(value)) {
                value = "\"" + value + "\"";
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerTaskExecuteRunnable.java`
#### Snippet
```java

            try {
                org.apache.commons.io.FileUtils.deleteDirectory(new File(execLocalPath));
                log.info("Success clear the task execute file: {}", execLocalPath);
            } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dolphinscheduler.remote.command` is unnecessary, and can be replaced with an import
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessService.java`
#### Snippet
```java

    void sendStartTask2Master(ProcessInstance processInstance, int taskId,
                              org.apache.dolphinscheduler.remote.command.CommandType taskType);

    ProcessInstance loadNextProcess4Serial(long code, int state, int id);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

            if (!f.exists()) {
                org.apache.commons.io.FileUtils.writeStringToFile(new File(commandFile), sb.toString(),
                        StandardCharsets.UTF_8);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dolphinscheduler.common.utils` is unnecessary, and can be replaced with an import
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

            String runCmd = String.format("%s %s", Constants.SH, commandFile);
            runCmd = org.apache.dolphinscheduler.common.utils.OSUtils.getSudoCmd(tenantCode, runCmd);
            log.info("kill cmd:{}", runCmd);
            org.apache.dolphinscheduler.common.utils.OSUtils.exeCmd(runCmd);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.dolphinscheduler.common.utils` is unnecessary, and can be replaced with an import
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
            runCmd = org.apache.dolphinscheduler.common.utils.OSUtils.getSudoCmd(tenantCode, runCmd);
            log.info("kill cmd:{}", runCmd);
            org.apache.dolphinscheduler.common.utils.OSUtils.exeCmd(runCmd);
        } catch (Exception e) {
            log.error(String.format("Kill yarn application app id [%s] failed: [%s]", appId, e.getMessage()));
```

### UnnecessaryFullyQualifiedName
Qualifier `ch.qos.logback.classic` is unnecessary, and can be replaced with an import
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java

        LinkedBlockingQueue<String> markerLog = new LinkedBlockingQueue<>(1);
        markerLog.add(ch.qos.logback.classic.ClassicConstants.FINALIZE_SESSION_MARKER.toString());
        String logs = appendPodLogIfNeeded();
        if (StringUtils.isNotEmpty(logs)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
            stmt.setString(index, value);
        } else if (dataType.equals(DataType.TIMESTAMP)) {
            stmt.setTimestamp(index, java.sql.Timestamp.valueOf(value));
        } else if (dataType.equals(DataType.BOOLEAN)) {
            stmt.setBoolean(index, Boolean.parseBoolean(value));
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCode = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String absolutePath = System.getProperty("user.dir");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
            log.error("task code get error, ", e);
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        }
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeFirst = String.valueOf(taskCodes.get(0)).replaceAll("\\[|\\]", "");
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskCodeSecond = String.valueOf(taskCodes.get(1)).replaceAll("\\[|\\]", "");
        String taskCodeThird = String.valueOf(taskCodes.get(2)).replaceAll("\\[|\\]", "");
        String taskCodeFourth = String.valueOf(taskCodes.get(3)).replaceAll("\\[|\\]", "");

        ProcessDefinitionLog processDefinitionLog = new ProcessDefinitionLog();
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ResourceComponent()` of an abstract class should not be declared 'public'
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/dto/resources/ResourceComponent.java`
#### Snippet
```java
public abstract class ResourceComponent {

    public ResourceComponent(int id, String pid, String name, String fullName, String description, boolean isDirctory) {
        this.id = id;
        this.pid = pid;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseHeartBeatTask()` of an abstract class should not be declared 'public'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/model/BaseHeartBeatTask.java`
#### Snippet
```java
    protected boolean runningFlag;

    public BaseHeartBeatTask(String threadName, long heartBeatInterval) {
        super(threadName);
        this.threadName = threadName;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractShell()` of an abstract class should not be declared 'public'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
    private AtomicBoolean completed;

    public AbstractShell() {
        this(0L);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractShell()` of an abstract class should not be declared 'public'
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/shell/AbstractShell.java`
#### Snippet
```java
     *        command.
     */
    public AbstractShell(long interval) {
        this.interval = interval;
        this.lastTime = (interval < 0) ? 0 : -interval;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractYarnTask()` of an abstract class should not be declared 'public'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractYarnTask.java`
#### Snippet
```java
     * @param taskRequest taskRequest
     */
    public AbstractYarnTask(TaskExecutionContext taskRequest) {
        super(taskRequest);
        this.shellCommandExecutor = new ShellCommandExecutor(this::logHandle,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCommandExecutor()` of an abstract class should not be declared 'public'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
    protected TaskExecutionContext taskRequest;

    public AbstractCommandExecutor(Consumer<LinkedBlockingQueue<String>> logHandler,
                                   TaskExecutionContext taskRequest,
                                   Logger logger) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCommandExecutor()` of an abstract class should not be declared 'public'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
    }

    public AbstractCommandExecutor(LinkedBlockingQueue<String> logBuffer) {
        this.logBuffer = logBuffer;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseHttpTemplateLoopTaskExecutor()` of an abstract class should not be declared 'public'
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/template/http/BaseHttpTemplateLoopTaskExecutor.java`
#### Snippet
```java
    private final HttpLoopTaskDefinition httpLoopTaskDefinition;

    public BaseHttpTemplateLoopTaskExecutor(@NonNull TaskExecutionContext taskExecutionContext,
                                            @NonNull String taskDefinitionYamlFile) {
        super(taskExecutionContext);
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new PlaceholderResolver() can be replaced with method reference
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PropertyPlaceholderHelper.java`
#### Snippet
```java
    public String replacePlaceholders(String value, final Properties properties) {
        notNull(properties, "'properties' must not be null");
        return replacePlaceholders(value, new PlaceholderResolver() {

            @Override
```

## RuleId[ruleID=RedundantModifiersValueLombok]
### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/K8sTaskExecutionContext.java`
#### Snippet
```java
    private String configYaml;

    private String namespace;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/K8sTaskExecutionContext.java`
#### Snippet
```java
public class K8sTaskExecutionContext implements Serializable {

    private String configYaml;

    private String namespace;
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManagerContext.java`
#### Snippet
```java
     * driver pod label value
     */
    private final String labelValue;

}
```

### RedundantModifiersValueLombok
@Value already marks non-static fields final.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManagerContext.java`
#### Snippet
```java
     * driver pod label value
     */
    private final String labelValue;

}
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManagerContext.java`
#### Snippet
```java
     * kubernetes execution context
     */
    private final K8sTaskExecutionContext k8sTaskExecutionContext;

    /**
```

### RedundantModifiersValueLombok
@Value already marks non-static fields final.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManagerContext.java`
#### Snippet
```java
     * kubernetes execution context
     */
    private final K8sTaskExecutionContext k8sTaskExecutionContext;

    /**
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * tenant code
     */
    private final String tenantCode;

    /**
```

### RedundantModifiersValueLombok
@Value already marks non-static fields final.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * tenant code
     */
    private final String tenantCode;

    /**
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * appId list
     */
    private final List<String> appIds;

}
```

### RedundantModifiersValueLombok
@Value already marks non-static fields final.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * appId list
     */
    private final List<String> appIds;

}
```

### RedundantModifiersValueLombok
@Value already marks non-static, package-local fields private.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * execute path
     */
    private final String executePath;

    /**
```

### RedundantModifiersValueLombok
@Value already marks non-static fields final.
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManagerContext.java`
#### Snippet
```java
     * execute path
     */
    private final String executePath;

    /**
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-zookeeper/src/main/java/org/apache/dolphinscheduler/plugin/registry/zookeeper/ZookeeperRegistry.java`
#### Snippet
```java
                        String.format("Cannot connect to the Zookeeper registry in %s s", timeout.getSeconds()));
            }
        } catch (RegistryException e) {
            throw e;
        } catch (InterruptedException e) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `currentPage`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/PageInfo.java`
#### Snippet
```java
    public PageInfo(Integer currentPage, Integer pageSize) {
        if (currentPage == null) {
            currentPage = 1;
        }
        this.pageNo = (currentPage - 1) * pageSize;
```

### AssignmentToMethodParameter
Assignment to method parameter `ruleType`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DqExecuteResultServiceImpl.java`
#### Snippet
```java

        if (ruleType == null) {
            ruleType = -1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `ruleType`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DqRuleServiceImpl.java`
#### Snippet
```java

        if (ruleType == null) {
            ruleType = -1;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
        // 3. generate access token if absent
        if (StringUtils.isBlank(token)) {
            token = EncryptionUtils.getMd5(userId + expireTime + System.currentTimeMillis());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `userId`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
            return result;
        }
        userId = loginUser.getUserType().equals(UserType.ADMIN_USER) ? 0 : userId;
        // query access token for specified user
        List<AccessToken> accessTokenList = this.accessTokenMapper.queryAccessTokenByUser(userId);
```

### AssignmentToMethodParameter
Assignment to method parameter `token`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
        // 3. generate access token if absent
        if (StringUtils.isBlank(token)) {
            token = EncryptionUtils.getMd5(userId + expireTime + System.currentTimeMillis());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `globalParams`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessInstanceServiceImpl.java`
#### Snippet
```java
        Map<String, String> globalParamMap =
                globalParamList.stream().collect(Collectors.toMap(Property::getProp, Property::getValue));
        globalParams = curingGlobalParamsService.curingGlobalParams(processInstance.getId(), globalParamMap,
                globalParamList, processInstance.getCmdTypeIfComplement(), schedule, timezone);
        processInstance.setTimeout(timeout);
```

### AssignmentToMethodParameter
Assignment to method parameter `runMode`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
        String dateList = null;
        int dependentProcessDefinitionCreateCount = 0;
        runMode = (runMode == null) ? RunMode.RUN_MODE_SERIAL : runMode;
        Map<String, String> cmdParam = JSONUtils.toMap(command.getCommandParam());
        Map<String, String> scheduleParam = JSONUtils.toMap(scheduleTimeParam);
```

### AssignmentToMethodParameter
Assignment to method parameter `queue`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/UsersServiceImpl.java`
#### Snippet
```java
        user.setUpdateTime(now);
        if (StringUtils.isEmpty(queue)) {
            queue = "";
        }
        user.setQueue(queue);
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/DataSourceController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        return dataSourceService.queryDataSourceListPaging(loginUser, searchVal, pageNo, pageSize);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/EnvironmentController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = environmentService.queryEnvironmentListPaging(loginUser, pageNo, pageSize, searchVal);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessInstanceController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = processInstanceService.queryProcessInstanceList(loginUser, projectCode, processDefineCode, startTime,
                endTime,
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProjectController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = projectService.queryProjectWithAuthorizedLevelListPaging(userId, loginUser, pageSize, pageNo,
                searchVal);
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProjectController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = projectService.queryProjectListPaging(loginUser, pageSize, pageNo, searchVal);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `searchTaskName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskDefinitionController.java`
#### Snippet
```java
            return result;
        }
        searchTaskName = ParameterUtils.handleEscapes(searchTaskName);
        return taskDefinitionService.queryTaskDefinitionListPaging(loginUser, projectCode,
                searchTaskName, taskType, taskExecuteType, pageNo, pageSize);
```

### AssignmentToMethodParameter
Assignment to method parameter `resTenantCode`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
                                      String resTenantCode) throws ServiceException {
        if (!isAdmin) {
            resTenantCode = resTenantCode == null ? "" : resTenantCode;
            if (!StringUtils.isBlank(resTenantCode) && !resTenantCode.equals(userTenantCode)) {
                // if an ordinary user directly send a query API with a different tenantCode and fullName "",
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
        // the format of hdfs folders in the implementation has a "/" at the very end, we need to remove it.
        originFullName = originFullName.endsWith("/") ? StringUtils.chop(originFullName) : originFullName;
        name = name.endsWith("/") ? StringUtils.chop(name) : name;
        // updated fullName
        String fullName = String.format(FORMAT_SS,
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TaskInstanceController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = taskInstanceService.queryTaskListPaging(
                loginUser,
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/AlertGroupController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        return alertGroupService.listPaging(loginUser, searchVal, pageNo, pageSize);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ProcessDefinitionController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);

        PageInfo<ProcessDefinition> pageInfo = processDefinitionService.queryProcessDefinitionListPaging(
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/QueueController.java`
#### Snippet
```java
        }

        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = queueService.queryList(loginUser, searchVal, pageNo, pageSize);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `taskType`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
            return result;
        }
        taskType = taskType == null ? StringUtils.EMPTY : taskType;
        Page<TaskMainInfo> page = new Page<>(pageNo, pageSize);
        // first, query task code by page size
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ClusterController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = clusterService.queryClusterListPaging(pageNo, pageSize, searchVal);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/AlertPluginInstanceController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        return alertPluginInstanceService.listPaging(loginUser, searchVal, pageNo, pageSize);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/AccessTokenController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = accessTokenService.queryAccessTokenList(loginUser, searchVal, pageNo, pageSize);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkerGroupController.java`
#### Snippet
```java

        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = workerGroupService.queryAllGroupPaging(loginUser, pageNo, pageSize, searchVal);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `timeout`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ExecutorController.java`
#### Snippet
```java
        if (timeout == null) {
            log.debug("Parameter timeout set to {} due to null.", Constants.MAX_TASK_TIMEOUT);
            timeout = Constants.MAX_TASK_TIMEOUT;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `complementDependentMode`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ExecutorController.java`
#### Snippet
```java
        if (complementDependentMode == null) {
            log.debug("Parameter complementDependentMode set to {} due to null.", ComplementDependentMode.OFF_MODE);
            complementDependentMode = ComplementDependentMode.OFF_MODE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `timeout`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ExecutorController.java`
#### Snippet
```java

        if (timeout == null) {
            timeout = Constants.MAX_TASK_TIMEOUT;
        }
        Map<String, String> startParamMap = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `complementDependentMode`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ExecutorController.java`
#### Snippet
```java

        if (complementDependentMode == null) {
            complementDependentMode = ComplementDependentMode.OFF_MODE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/SchedulerController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = schedulerService.querySchedule(loginUser, projectCode, processDefinitionCode, searchVal, pageNo,
                pageSize);
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/DataQualityController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);

        return dqRuleService.queryRuleListPaging(loginUser, searchVal, ruleType, startTime, endTime, pageNo, pageSize);
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/DataQualityController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);

        return dqExecuteResultService.queryResultListPaging(loginUser, searchVal, state, ruleType, startTime, endTime,
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/K8sNamespaceController.java`
#### Snippet
```java
            return result;
        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = k8sNamespaceService.queryListPaging(loginUser, searchVal, pageNo, pageSize);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/TenantController.java`
#### Snippet
```java

        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = tenantService.queryTenantList(loginUser, searchVal, pageNo, pageSize);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `workFlowName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/WorkFlowLineageController.java`
#### Snippet
```java
                                                                    @RequestParam(value = "workFlowName", required = false) String workFlowName) {
        try {
            workFlowName = ParameterUtils.handleEscapes(workFlowName);
            Map<String, Object> result = workFlowLineageService.queryWorkFlowLineageByName(projectCode, workFlowName);
            return returnDataList(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `limit`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
        }
        if (limit > processInstanceList.size()) {
            limit = processInstanceList.size();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `processDefinitionName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
            if (num > 1) {
                String str = processDefinitionName.substring(0, processDefinitionName.length() - 3);
                processDefinitionName = str + "(" + num + ")";
            } else {
                processDefinitionName = processDefinition.getName() + "(" + num + ")";
```

### AssignmentToMethodParameter
Assignment to method parameter `processDefinitionName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
                processDefinitionName = str + "(" + num + ")";
            } else {
                processDefinitionName = processDefinition.getName() + "(" + num + ")";
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/ResourcesController.java`
#### Snippet
```java
        }

        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = resourceService.queryResourceListPaging(loginUser, fullName, tenantCode, type, searchVal, pageNo,
                pageSize);
```

### AssignmentToMethodParameter
Assignment to method parameter `searchVal`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java

        }
        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = usersService.queryUserList(loginUser, searchVal, pageNo, pageSize);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `userName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
                                       @RequestParam(value = "repeatPassword") String repeatPassword,
                                       @RequestParam(value = "email") String email) throws Exception {
        userName = ParameterUtils.handleEscapes(userName);
        userPassword = ParameterUtils.handleEscapes(userPassword);
        repeatPassword = ParameterUtils.handleEscapes(repeatPassword);
```

### AssignmentToMethodParameter
Assignment to method parameter `userPassword`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
                                       @RequestParam(value = "email") String email) throws Exception {
        userName = ParameterUtils.handleEscapes(userName);
        userPassword = ParameterUtils.handleEscapes(userPassword);
        repeatPassword = ParameterUtils.handleEscapes(repeatPassword);
        email = ParameterUtils.handleEscapes(email);
```

### AssignmentToMethodParameter
Assignment to method parameter `repeatPassword`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
        userName = ParameterUtils.handleEscapes(userName);
        userPassword = ParameterUtils.handleEscapes(userPassword);
        repeatPassword = ParameterUtils.handleEscapes(repeatPassword);
        email = ParameterUtils.handleEscapes(email);
        Map<String, Object> result = usersService.registerUser(userName, userPassword, repeatPassword, email);
```

### AssignmentToMethodParameter
Assignment to method parameter `email`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
        userPassword = ParameterUtils.handleEscapes(userPassword);
        repeatPassword = ParameterUtils.handleEscapes(repeatPassword);
        email = ParameterUtils.handleEscapes(email);
        Map<String, Object> result = usersService.registerUser(userName, userPassword, repeatPassword, email);
        return returnDataList(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `userName`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/UsersController.java`
#### Snippet
```java
    public Result<Object> activateUser(@Parameter(hidden = true) @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                       @RequestParam(value = "userName") String userName) {
        userName = ParameterUtils.handleEscapes(userName);
        Map<String, Object> result = usersService.activateUser(loginUser, userName);
        return returnDataList(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `content`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-email/src/main/java/org/apache/dolphinscheduler/plugin/alert/email/template/DefaultHTMLTemplate.java`
#### Snippet
```java
                if (!(contentObject instanceof JSONArray)) {
                    ObjectNode jsonNodes = JSONUtils.parseObject(content);
                    content = JSONUtils.toJsonString(Collections.singletonList(jsonNodes));
                }
            } catch (JSONException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
        }
        if (end == null) {
            end = new Date();
        }
        if (start.after(end)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/TaskProcessorFactory.java`
#### Snippet
```java
    public static ITaskProcessor getTaskProcessor(String type) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        if (StringUtils.isEmpty(type)) {
            type = DEFAULT_PROCESSOR;
        }
        Constructor<ITaskProcessor> iTaskProcessorConstructor = PROCESS_MAP.get(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `content`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/SwitchTaskProcessor.java`
#### Snippet
```java
            }
            log.info("paramName:{}，paramValue:{}", paramName, value);
            content = content.replace("${" + paramName + "}", value);
        }
        return content;
```

### AssignmentToMethodParameter
Assignment to method parameter `executeSqlList`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java

                    if (executeSqlList == null) {
                        executeSqlList = new ArrayList<>();
                    }

```

### AssignmentToMethodParameter
Assignment to method parameter `workerGroup`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/registry/ServerNodeManager.java`
#### Snippet
```java
        try {
            if (StringUtils.isEmpty(workerGroup)) {
                workerGroup = Constants.DEFAULT_WORKER_GROUP;
            }
            Set<String> nodes = workerGroupNodes.get(workerGroup);
```

### AssignmentToMethodParameter
Assignment to method parameter `startTime`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
                break;
            }
            startTime = nextTime.get();
            if (startTime.isAfter(endTime)) {
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `fireTimes`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
            }
            executeTimes.add(startTime);
            fireTimes--;
        }
        return executeTimes;
```

### AssignmentToMethodParameter
Assignment to method parameter `startTime`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
                break;
            }
            startTime = nextExecutionTimeOptional.get();
            if (startTime.isAfter(endTime)) {
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `num`
in `dolphinscheduler-microbench/src/main/java/org/apache/dolphinscheduler/microbench/common/UserService.java`
#### Snippet
```java
    @Override
    public Integer hi(int num) {
        return ++num;
    }
}
```

### AssignmentToMethodParameter
Assignment to method parameter `watchList`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/KubernetesApplicationManager.java`
#### Snippet
```java
        try {
            if (Objects.isNull(watchList)) {
                watchList = getDriverPod(kubernetesApplicationManagerContext);
            }
            List<Pod> driverPod = watchList.list().getItems();
```

### AssignmentToMethodParameter
Assignment to method parameter `firstDay`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/DependentDateUtils.java`
#### Snippet
```java
            Date endTime = DateUtils.getEndOfDay(firstDay);
            dateIntervals.add(new DateInterval(beginTime, endTime));
            firstDay = DateUtils.getSomeDay(firstDay, 1);
        }
        return dateIntervals;
```

### AssignmentToMethodParameter
Assignment to method parameter `parameterString`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java
        if (parameterMap != null && !parameterMap.isEmpty()) {
            // replace variable ${} form,refers to the replacement of system variables and custom variables
            parameterString = PlaceholderUtils.replacePlaceholders(parameterString, parameterMap, true);
        }
        if (parameterMap != null && null != parameterMap.get(DateConstants.PARAMETER_DATETIME)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parameterString`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        if (parameterMap != null && !parameterMap.isEmpty()) {
            // replace variable ${} form,refers to the replacement of system variables and custom variables
            parameterString = PlaceholderUtils.replacePlaceholders(parameterString, parameterMap, true);
        }
        if (parameterMap != null && null != parameterMap.get(PARAMETER_DATETIME)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parameterString`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        // replace variable ${} form,refers to the replacement of system variables and custom variables
        if (!parameterMap.isEmpty()) {
            parameterString = PlaceholderUtils.replacePlaceholders(parameterString, parameterMap, true);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `scheduleTime`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        // if getScheduleTime null ,is current date
        if (null == scheduleTime) {
            scheduleTime = new Date();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
        p.setProp(PARAMETER_SHECDULE_TIME);
        paramsMap.put(PARAMETER_SHECDULE_TIME, p);
        text = ParameterUtils.convertParameterPlaceholders2(text, convert(paramsMap));

        return text;
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
     */
    public static Integer calculate(String expression) {
        expression = StringUtils.trim(expression);
        expression = convert(expression);

```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
    public static Integer calculate(String expression) {
        expression = StringUtils.trim(expression);
        expression = convert(expression);

        List<String> result = string2List(expression);
```

### AssignmentToMethodParameter
Assignment to method parameter `processMap`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        if (parentInstance.getCommandType() == CommandType.REPEAT_RUNNING) {
            // update current task id to map
            processMap = findPreviousTaskProcessMap(parentInstance, parentTask);
            if (processMap != null) {
                processMap.setParentTaskInstanceId(parentTask.getId());
```

### AssignmentToMethodParameter
Assignment to method parameter `processMap`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        }
        // new task
        processMap = new ProcessInstanceMap();
        processMap.setParentProcessInstanceId(parentInstance.getId());
        processMap.setParentTaskInstanceId(parentTask.getId());
```

### AssignmentToMethodParameter
Assignment to method parameter `taskDefinitionLogs`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        }
        if (CollectionUtils.isEmpty(taskDefinitionLogs)) {
            taskDefinitionLogs = taskDefinitionLogDao.getTaskDefineLogList(taskRelationList);
        }
        Map<Long, TaskDefinitionLog> taskDefinitionLogMap = taskDefinitionLogs.stream()
```

### AssignmentToMethodParameter
Assignment to method parameter `rawScript`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTask.java`
#### Snippet
```java
            String replaceScript = String.format("print(\"${{setValue({},{})}}\".format(\"%s\",%s))", prop, value);

            rawScript = rawScript.substring(0, scriptStart) + replaceScript + rawScript.substring(start, end);

            scriptStart += replaceScript.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
        }

        column = column.trim();
        column = column.replace("`", "");
        column = column.replace("\"", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java

        column = column.trim();
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
        column = column.trim();
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
        column = column.replace("`", "");
        column = column.replace("\"", "");
        column = column.replace("'", "");

        switch (dbType) {
```

### AssignmentToMethodParameter
Assignment to method parameter `script`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTask.java`
#### Snippet
```java

    private String replaceParam(String script) {
        script = script.replaceAll("\\r\\n", System.lineSeparator());
        // replace placeholder, and combining local and global parameters
        Map<String, Property> paramsMap = taskExecutionContext.getPrepareParamsMap();
```

### AssignmentToMethodParameter
Assignment to method parameter `script`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTask.java`
#### Snippet
```java
        // replace placeholder, and combining local and global parameters
        Map<String, Property> paramsMap = taskExecutionContext.getPrepareParamsMap();
        script = ParameterUtils.convertParameterPlaceholders(script, ParamUtils.convert(paramsMap));
        return script;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `sql`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
        // new
        // replace variable TIME with $[YYYYmmddd...] in sql when history run job and batch complement job
        sql = ParameterUtils.replaceScheduleTime(sql,
                DateUtils.timeStampToDate(taskExecutionContext.getScheduleTime()));
        // special characters need to be escaped, ${} needs to be escaped
```

### AssignmentToMethodParameter
Assignment to method parameter `sql`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
        // Replace the original value in sql ！{...} ，Does not participate in precompilation
        String rgexo = "['\"]*\\!\\{(.*?)\\}['\"]*";
        sql = replaceOriginalValue(sql, rgexo, paramsMap);
        // replace the ${} of the SQL statement with the Placeholder
        String formatSql = sql.replaceAll(rgex, "?");
```

### AssignmentToMethodParameter
Assignment to method parameter `content`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
            String paramName = m.group(1);
            String paramValue = sqlParamsMap.get(paramName).getValue();
            content = m.replaceFirst(paramValue);
        }
        return content;
```

### AssignmentToMethodParameter
Assignment to method parameter `sql`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
    public String[] tryExecuteSqlResolveColumnNames(DbType sourceType, BaseConnectionParam baseDataSource, String sql) {
        String[] columnNames;
        sql = String.format("SELECT t.* FROM ( %s ) t WHERE 0 = 1", sql);
        sql = sql.replace(";", "");

```

### AssignmentToMethodParameter
Assignment to method parameter `sql`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
        String[] columnNames;
        sql = String.format("SELECT t.* FROM ( %s ) t WHERE 0 = 1", sql);
        sql = sql.replace(";", "");

        try (
```

### AssignmentToMethodParameter
Assignment to method parameter `rawScript`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTask.java`
#### Snippet
```java
            String replaceScript = String.format("print(\"${{setValue({},{})}}\".format(\"%s\",%s))", prop, value);

            rawScript = rawScript.substring(0, scriptStart) + replaceScript + rawScript.substring(start, end);

            scriptStart += replaceScript.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `mainParameter`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTask.java`
#### Snippet
```java

    private static String replaceDoubleBrackets(String mainParameter) {
        mainParameter = mainParameter
                .replace(Constants.DOUBLE_BRACKETS_LEFT, Constants.DOUBLE_BRACKETS_LEFT_SPACE)
                .replace(Constants.DOUBLE_BRACKETS_RIGHT, Constants.DOUBLE_BRACKETS_RIGHT_SPACE);
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/writer/JdbcWriter.java`
#### Snippet
```java
    public void write(Dataset<Row> data, SparkRuntimeEnvironment env) {
        if (!Strings.isNullOrEmpty(config.getString(SQL))) {
            data = env.sparkSession().sql(config.getString(SQL));
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
    public String getFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return getDir(resourceType, tenantCode) + fileName;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-s3/src/main/java/org/apache/dolphinscheduler/plugin/storage/s3/S3StorageOperator.java`
#### Snippet
```java
    public String getResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getS3ResDir(tenantCode), fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
    public String getFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return getDir(resourceType, tenantCode) + fileName;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
    public String getResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getOssResDir(tenantCode), fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsUdfFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsUdfDir(tenantCode), fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsResourceFileName(String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsResDir(tenantCode), fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
    public static String getHdfsFileName(ResourceType resourceType, String tenantCode, String fileName) {
        if (fileName.startsWith(FOLDER_SEPARATOR)) {
            fileName = fileName.replaceFirst(FOLDER_SEPARATOR, "");
        }
        return String.format(FORMAT_S_S, getHdfsDir(resourceType, tenantCode), fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(midExecuteSqlDefinitionList)) {
            for (DqRuleExecuteSql executeSqlDefinition : midExecuteSqlDefinitionList) {
                index = setTransformerConfig(
                        index,
                        inputParameterValueResult,
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(statisticsExecuteSqlDefinitionList)) {
            for (DqRuleExecuteSql executeSqlDefinition : statisticsExecuteSqlDefinitionList) {
                index = setTransformerConfig(
                        index,
                        inputParameterValueResult,
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java

            for (DqRuleExecuteSql executeSqlDefinition : comparisonExecuteSqlList) {
                index = setTransformerConfig(
                        index,
                        inputParameterValueResult,
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
                                            DqRuleExecuteSql executeSqlDefinition) {
        Map<String, Object> config = new HashMap<>();
        config.put(INDEX, index++);
        config.put(SQL,
                ParameterUtils.convertParameterPlaceholders(executeSqlDefinition.getSql(), inputParameterValueResult));
```

## RuleId[ruleID=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
                    || dependNode.isForbidden()
                    || skipTaskNodeList.containsKey(dependNodeCode)) {
                continue;
            } else {
                return false;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sClientService.java`
#### Snippet
```java
                        .withName(k8sNamespace.getNamespace())
                        .delete();
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/RegexUtils.java`
#### Snippet
```java
            return str.replaceAll("[\n|\r|\t]", "_");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sManager.java`
#### Snippet
```java
    public synchronized KubernetesClient getK8sClient(Long clusterCode) throws RemotingException {
        if (null == clusterCode) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sManager.java`
#### Snippet
```java
                                                               boolean update) throws RemotingException {
        if (null == clusterCode) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/utils/FileUtils.java`
#### Snippet
```java
            log.error("File can not be read, fileName:{}", filename);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/CacheEvictAspect.java`
#### Snippet
```java
        }
        if (cacheName == null) {
            return null;
        }
        for (CacheType cacheType : CacheType.values()) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/aspect/CacheEvictAspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/SessionServiceImpl.java`
#### Snippet
```java

        if (StringUtils.isBlank(sessionId)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkerGroupServiceImpl.java`
#### Snippet
```java
    public String getTaskWorkerGroup(TaskInstance taskInstance) {
        if (taskInstance == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkerGroupServiceImpl.java`
#### Snippet
```java
    private String checkWorkerGroupAddrList(WorkerGroup workerGroup) {
        if (Strings.isNullOrEmpty(workerGroup.getAddrList())) {
            return null;
        }
        Map<String, String> serverMaps = registryClient.getServerMaps(NodeType.WORKER);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkerGroupServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AlertPluginInstanceServiceImpl.java`
#### Snippet
```java
    private List<AlertPluginInstanceVO> buildPluginInstanceVOList(List<AlertPluginInstance> alertPluginInstances) {
        if (CollectionUtils.isEmpty(alertPluginInstances)) {
            return null;
        }
        List<PluginDefine> pluginDefineList = pluginDefineMapper.queryAllPluginDefineList();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/AlertPluginInstanceServiceImpl.java`
#### Snippet
```java
        List<PluginDefine> pluginDefineList = pluginDefineMapper.queryAllPluginDefineList();
        if (CollectionUtils.isEmpty(pluginDefineList)) {
            return null;
        }
        Map<Integer, PluginDefine> pluginDefineMap =
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/DataSourceServiceImpl.java`
#### Snippet
```java
    private String getDbSchemaPattern(DbType dbType, String schema, BaseConnectionParam connectionParam) {
        if (dbType == null) {
            return null;
        }
        String schemaPattern = null;
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
                    .collect(Collectors.joining(COMMA));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
        if (processInstance == null) {
            log.error("Process instance does not exist, processInstanceId:{}.", processInstanceId);
            return null;
        }
        Host host = new Host(processInstance.getHost());
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ExecutorServiceImpl.java`
#### Snippet
```java
            log.error("Query executing process instance from master error, processInstanceId:{}.",
                    processInstanceId);
            return null;
        }
        WorkflowExecutingDataResponseCommand responseCommand =
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/AbstractAuthenticator.java`
#### Snippet
```java
        if (session == null) {
            log.info("session info is null ");
            return null;
        }
        // get user object from session
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
            return checkResult;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
                    } catch (Exception e) {
                        log.warn("invalid ldap credentials or ldap search error", e);
                        return null;
                    }
                    Attribute attr = attrs.next();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
        } catch (NamingException e) {
            log.error("ldap search error", e);
            return null;
        } finally {
            try {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/security/impl/ldap/LdapService.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
            log.error("user {} not exists", loginUser.getId());
            putMsg(result, Status.USER_NOT_EXIST, loginUser.getId());
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java
            log.error("tenant not exists");
            putMsg(result, Status.CURRENT_LOGIN_USER_TENANT_NOT_EXIST);
            return null;
        }
        String tenantCode = tenant.getTenantCode();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
        boolean hasProjectAndWritePerm = projectService.hasProjectAndWritePerm(loginUser, project, result);
        if (!hasProjectAndWritePerm) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
            log.error("Task definition does not exist, taskDefinitionCode:{}.", taskCode);
            putMsg(result, Status.TASK_DEFINE_NOT_EXIST, String.valueOf(taskCode));
            return null;
        }
        if (processService.isTaskOnline(taskCode) && taskDefinition.getFlag() == Flag.YES) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
                        TaskExecuteType.STREAM, taskCode);
                putMsg(result, Status.NOT_SUPPORT_UPDATE_TASK_DEFINITION);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
            log.warn("Task definition does not need update because no change, taskDefinitionCode:{}.", taskCode);
            putMsg(result, Status.TASK_DEFINITION_NOT_MODIFY_ERROR, String.valueOf(taskCode));
            return null;
        }
        if (taskDefinitionToUpdate == null) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
            log.warn("Parameter taskDefinitionJson is invalid.");
            putMsg(result, Status.DATA_IS_NOT_VALID, taskDefinitionJsonObj);
            return null;
        }
        if (!taskPluginManager.checkTaskParameters(ParametersNode.builder()
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
                    taskDefinitionToUpdate.getName());
            putMsg(result, Status.PROCESS_NODE_S_PARAMETER_INVALID, taskDefinitionToUpdate.getName());
            return null;
        }
        Integer version = taskDefinitionLogMapper.queryMaxVersionForDefinition(taskCode);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
                    taskCode);
            putMsg(result, Status.DATA_IS_NOT_VALID, taskCode);
            return null;
        }
        Date now = new Date();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
            return dataSourceMapper.queryDataSourceByNameAndUserId(loginUser.getId(), datasourceName);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessDefinitionServiceImpl.java`
#### Snippet
```java
    @Override
    public String doOtherOperateProcess(User loginUser, ProcessDefinition processDefinition) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/MonitorDBDao.java`
#### Snippet
```java
            log.error("SQLException: {}", e.getMessage(), e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/AlertDao.java`
#### Snippet
```java
            return alertPluginInstanceMapper.queryByIds(ids);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/UdfFunc.java`
#### Snippet
```java
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            if (Strings.isNullOrEmpty(key)) {
                return null;
            }
            return JSONUtils.parseObject(key, UdfFunc.class);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskInstanceDaoImpl.java`
#### Snippet
```java
    public TaskInstance findTaskInstanceByCacheKey(String cacheKey) {
        if (StringUtils.isEmpty(cacheKey)) {
            return null;
        }
        return taskInstanceMapper.queryByCacheKey(cacheKey);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskInstanceDaoImpl.java`
#### Snippet
```java
                    processInstanceState,
                    taskInstance.getTaskCode());
            return null;
        }
        if (processInstanceState == WorkflowExecutionStatus.READY_PAUSE) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/TaskInstanceDaoImpl.java`
#### Snippet
```java
        boolean saveResult = upsertTaskInstance(taskInstance);
        if (!saveResult) {
            return null;
        }
        return taskInstance;
```

### ReturnNull
Return of `null`
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/base/FormType.java`
#### Snippet
```java
            return FORM_TYPE_MAP.get(type);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/enums/DbType.java`
#### Snippet
```java
            return DB_TYPE_MAP.get(type);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/PluginParamsTransfer.java`
#### Snippet
```java
                                                                 String pluginParamsTemplate) {
        if (paramsMap == null || paramsMap.isEmpty()) {
            return null;
        }
        List<Map<String, Object>> pluginParamsList =
```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-feishu/src/main/java/org/apache/dolphinscheduler/plugin/alert/feishu/FeiShuSender.java`
#### Snippet
```java
            return contents.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
            log.info("we chat alert get token error{}", e.getMessage());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
                return map.get("access_token").toString();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
            return contents.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-wechat/src/main/java/org/apache/dolphinscheduler/plugin/alert/wechat/WeChatSender.java`
#### Snippet
```java
    private static String mkString(Iterable<String> list) {
        if (null == list || StringUtils.isEmpty("|")) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-webexteams/src/main/java/org/apache/dolphinscheduler/plugin/alert/webexteams/WebexTeamsDestination.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-alert/dolphinscheduler-alert-plugins/dolphinscheduler-alert-webexteams/src/main/java/org/apache/dolphinscheduler/plugin/alert/webexteams/WebexTeamsSender.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/log/remote/RemoteLogHandlerFactory.java`
#### Snippet
```java
    public RemoteLogHandler getRemoteLogHandler() {
        if (!RemoteLogUtils.isRemoteLoggingEnable()) {
            return null;
        }
        if (!"OSS".equals(PropertyUtils.getUpperCaseString(Constants.REMOTE_LOGGING_TARGET))) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/log/remote/RemoteLogHandlerFactory.java`
#### Snippet
```java
        }
        if (!"OSS".equals(PropertyUtils.getUpperCaseString(Constants.REMOTE_LOGGING_TARGET))) {
            return null;
        }
        OssRemoteLogHandler ossRemoteLogHandler = new OssRemoteLogHandler();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/enums/ReleaseState.java`
#### Snippet
```java
        }
        // For values out of enum scope
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/enums/WarningType.java`
#### Snippet
```java
            return WARNING_TYPE_MAP.get(descp);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/HttpUtils.java`
#### Snippet
```java
        if (Objects.isNull(httpget) || Objects.isNull(httpClient)) {
            log.error("HttpGet or HttpClient parameter is null");
            return null;
        }
        String responseContent = null;
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/HttpUtils.java`
#### Snippet
```java
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
            return inetAddress.getHostAddress();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
    private static NetworkInterface findAddress(List<NetworkInterface> validNetworkInterfaces) {
        if (CollectionUtils.isEmpty(validNetworkInterfaces)) {
            return null;
        }
        String networkPriority = PropertyUtils.getString(Constants.DOLPHIN_SCHEDULER_NETWORK_PRIORITY_STRATEGY,
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/NetUtils.java`
#### Snippet
```java
        } else {
            log.error("There is no matching network card acquisition policy!");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/PropertyUtils.java`
#### Snippet
```java
    public static Map<String, String> getPropertiesByPrefix(String prefix) {
        if (Strings.isNullOrEmpty(prefix)) {
            return null;
        }
        Set<Object> keys = properties.keySet();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/PropertyUtils.java`
#### Snippet
```java
        Set<Object> keys = properties.keySet();
        if (CollectionUtils.isEmpty(keys)) {
            return null;
        }
        Map<String, String> propertiesMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/OSUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
    public static TimeZone getTimezone(String timezoneId) {
        if (StringUtils.isEmpty(timezoneId)) {
            return null;
        }
        return TimeZone.getTimeZone(timezoneId);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
    public static String format2Duration(Date start, Date end) {
        if (start == null) {
            return null;
        }
        if (end == null) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
        if (start.after(end)) {
            log.warn("start Time {} is later than end Time {}", start, end);
            return null;
        }
        return format2Duration(differMs(start, end));
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
            log.error("error while parse date:" + date, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/DateUtils.java`
#### Snippet
```java
            log.error("error while parse date:" + date, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/KerberosHttpClient.java`
#### Snippet
```java
            @Override
            public Principal getUserPrincipal() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/KerberosHttpClient.java`
#### Snippet
```java
            @Override
            public String getPassword() {
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/KerberosHttpClient.java`
#### Snippet
```java
            log.error("Kerberos authentication failed ", le);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
    public static <T> T parseObject(byte[] src, Class<T> clazz) {
        if (src == null) {
            return null;
        }
        String json = new String(src, UTF_8);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java

        if (node == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
    public static <T> T parseObject(String json, TypeReference<T> type) {
        if (Strings.isNullOrEmpty(json)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/utils/JSONUtils.java`
#### Snippet
```java
    public static <T> byte[] toJsonByteArray(T obj) {
        if (obj == null) {
            return null;
        }
        String json = "";
```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java
        if (tenant == null) {
            log.error("tenant not exists,task instance id : {}", taskInstance.getId());
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StreamTaskExecuteRunnable.java`
#### Snippet
```java

        if (globalParams.isEmpty() && localParams.isEmpty() && varParams.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/task/BaseTaskProcessor.java`
#### Snippet
```java
            taskInstance.setState(TaskExecutionStatus.FAILURE);
            taskInstanceDao.upsertTaskInstance(taskInstance);
            return null;
        }
        // set queue for process instance, user-specified queue takes precedence over tenant queue
```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            log.error("Clone tolerant taskInstance error because taskNode is null, taskCode:{}",
                    taskInstance.getTaskCode());
            return null;
        }
        TaskInstance newTaskInstance = newTaskInstance(processInstance, taskNode);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            log.error("Clone retry taskInstance error because taskNode is null, taskCode:{}",
                    taskInstance.getTaskCode());
            return null;
        }
        TaskInstance newTaskInstance = newTaskInstance(processInstance, taskNode);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/WorkflowExecuteRunnable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/serializer/ProtoStuffSerializer.java`
#### Snippet
```java
        T obj = schema.newMessage();
        if (null == obj) {
            return null;
        }
        ProtostuffIOUtil.mergeFrom(data, obj, schema);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/serializer/ProtoStuffUtils.java`
#### Snippet
```java
        T obj = schema.newMessage();
        if (null == obj) {
            return null;
        }
        ProtostuffIOUtil.mergeFrom(bytes, obj, schema);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/rpc/remote/NettyClient.java`
#### Snippet
```java
            log.warn(String.format("connect to %s error", host), ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/codec/NettyDecoder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/utils/JsonSerializer.java`
#### Snippet
```java
        } catch (IOException e) {
            log.error("deserialize exception!", e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/NettyRemotingClient.java`
#### Snippet
```java
            log.warn(String.format("connect to %s error", host), ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-remote/src/main/java/org/apache/dolphinscheduler/remote/processor/StateEventCallbackService.java`
#### Snippet
```java
            this.nettyRemotingClient.closeChannel(host);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleLinks.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleLinks.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/alert/AlertClientService.java`
#### Snippet
```java
            this.client.closeChannel(address);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
                return CycleEnum.HOUR;
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
                return CycleEnum.MINUTE;
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CycleFactory.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cache/impl/CacheNotifyServiceImpl.java`
#### Snippet
```java
        Channel channel = nettyRemotingClient.getChannel(host);
        if (channel == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ClusterConfUtils.java`
#### Snippet
```java
    public static String getK8sConfig(String config) {
        if (StringUtils.isEmpty(config)) {
            return null;
        }
        ObjectNode conf = JSONUtils.parseObject(config);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/ClusterConfUtils.java`
#### Snippet
```java
        ObjectNode conf = JSONUtils.parseObject(config);
        if (conf == null) {
            return null;
        }
        return conf.get(K8S_CONFIG).asText();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/expand/TimePlaceholderResolverExpandServiceImpl.java`
#### Snippet
```java
    @Override
    public String timeFunctionExtension(Integer processInstanceId, String timeZone, String placeholderName) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/cron/CronUtils.java`
#### Snippet
```java
            return result;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/command/CommandServiceImpl.java`
#### Snippet
```java
            } catch (NumberFormatException nfe) {
                log.error("processDefinitionCode is not a number", nfe);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/expand/CuringGlobalParams.java`
#### Snippet
```java
                                     String timezone) {
        if (globalParamList == null || globalParamList.isEmpty()) {
            return null;
        }
        Map<String, String> globalMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/expand/CuringGlobalParams.java`
#### Snippet
```java

        if (MapUtils.isEmpty(globalParams) && MapUtils.isEmpty(localParams) && MapUtils.isEmpty(varParams)) {
            return null;
        }
        // if it is a complement,
```

### ReturnNull
Return of `null`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/MysqlOperator.java`
#### Snippet
```java
        } catch (Exception e) {
            if (e instanceof SQLIntegrityConstraintViolationException) {
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/task/SubscribeDataManager.java`
#### Snippet
```java
        MysqlRegistryData mysqlRegistryData = mysqlRegistryDataMap.get(path);
        if (mysqlRegistryData == null) {
            return null;
        }
        return mysqlRegistryData.getData();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mr/src/main/java/org/apache/dolphinscheduler/plugin/task/mr/MapReduceTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mr/src/main/java/org/apache/dolphinscheduler/plugin/task/mr/MapReduceTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/TaskPluginManager.java`
#### Snippet
```java
        String taskType = parametersNode.getTaskType();
        if (Objects.isNull(taskType)) {
            return null;
        }
        switch (taskType) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/TaskPluginManager.java`
#### Snippet
```java
                TaskChannel taskChannel = this.getTaskChannelMap().get(taskType);
                if (Objects.isNull(taskChannel)) {
                    return null;
                }
                return taskChannel.parseParameters(parametersNode);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractTask.java`
#### Snippet
```java

    public String getPreScript() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
    public TaskExecutionStatus getApplicationStatus(String applicationId) throws TaskException {
        if (StringUtils.isEmpty(applicationId)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
                log.error("yarn ha application url generation failed, message:{}", e.getMessage());
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

            if (StringUtils.isEmpty(retStr)) {
                return null;
            }
            // to json
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java
            // get ResourceManager state
            if (!jsonObject.has("clusterInfo")) {
                return null;
            }
            return jsonObject.get("clusterInfo").path("haState").asText();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

        if (split1.length != 2) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

        if (split2.length != 2) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/am/YarnApplicationManager.java`
#### Snippet
```java

        if (StringUtils.isEmpty(activeRM)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
            return matcher.group(1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/ParameterUtils.java`
#### Snippet
```java
    private static String dateTemplateParse(String templateStr, Date date) {
        if (templateStr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java
                return DbType.POSTGRESQL;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java

        if (jdbcUrl == null || !jdbcUrl.startsWith("jdbc:") || (pos1 = jdbcUrl.indexOf(COLON, 5)) == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/JdbcUrlParser.java`
#### Snippet
```java

        if (StringUtils.isEmpty(database)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParamUtils.java`
#### Snippet
```java
    public static Map<String, String> convert(Map<String, Property> paramsMap) {
        if (paramsMap == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/K8sUtils.java`
#### Snippet
```java
            log.error("response bodies : {}", e.getMessage());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/PlaceholderUtils.java`
#### Snippet
```java
            } catch (Exception ex) {
                log.error("resolve placeholder '{}' in [ {} ]", placeholderName, value, ex);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/ParameterUtils.java`
#### Snippet
```java
    private static String dateTemplateParse(String templateStr, Date date) {
        if (templateStr == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
            } catch (Exception ex) {
                log.error("resolve placeholder '{}' in [ {} ]", placeholderName, value, ex);
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
    public static String getPlaceHolderTime(String expression, Date date) {
        if (StringUtils.isBlank(expression)) {
            return null;
        }
        if (null == date) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/parser/TimePlaceholderUtils.java`
#### Snippet
```java
        }
        if (null == date) {
            return null;
        }
        return calculateTime(expression, date);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-k8s/src/main/java/org/apache/dolphinscheduler/plugin/task/k8s/K8sTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                    taskInstance.getProcessInstance().getId(),
                    processInstance.getState());
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            log.error("scan command, command parameter is error: {}", command);
            commandService.moveToErrorCommand(command, "process instance is null");
            return null;
        }
        processInstance.setCommandType(command.getCommandType());
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                triggerRelationService.saveProcessInstanceTrigger(command.getId(), processInstance.getId());
                deleteCommandWithCheck(command.getId());
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        log.info("sub process instance is not found,parent task:{},parent instance:{}",
                parentTask.getId(), parentProcessInstance.getId());
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        if (testDataSourceId != null)
            return testDataSourceId;
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java

        if (userId == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            return processInstanceMapper.selectById(taskInstance.getProcessInstanceId());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
    public String findConfigYamlByName(String clusterName) {
        if (Strings.isNullOrEmpty(clusterName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        nodeWrapper.eq("name", clusterName);
        Cluster cluster = clusterMapper.selectOne(nodeWrapper);
        return cluster == null ? null : ClusterConfUtils.getK8sConfig(cluster.getConfig());
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                if (taskGroup == null) {
                    log.error("The taskGroup is null, taskGroupId: {}", taskInstance.getTaskGroupId());
                    return null;
                }
                thisTaskGroupQueue = this.taskGroupQueueMapper.queryByTaskId(taskInstance.getId());
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
                if (thisTaskGroupQueue.getStatus() == TaskGroupQueueStatus.RELEASE) {
                    log.info("The taskGroupQueue's status is release, taskInstanceId: {}", taskInstance.getId());
                    return null;
                }
                if (thisTaskGroupQueue.getStatus() == TaskGroupQueueStatus.WAIT_QUEUE) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
        } catch (Exception e) {
            log.error("release the task group error", e);
            return null;
        }
        log.info("Finished to release task group, taskGroupId: {}", taskInstance.getTaskGroupId());
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            if (taskGroupQueue == null) {
                log.info("The taskGroupQueue is null, taskGroup: {}", taskGroup.getId());
                return null;
            }
        } while (this.taskGroupQueueMapper.updateInQueueCAS(Flag.NO.getCode(),
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-emr/src/main/java/org/apache/dolphinscheduler/plugin/task/emr/EmrTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-k8s/src/main/java/org/apache/dolphinscheduler/plugin/task/k8s/K8sTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dms/src/main/java/org/apache/dolphinscheduler/plugin/task/dms/DmsHook.java`
#### Snippet
```java
    public String replaceFileParameters(String parameter) throws IOException {
        if (parameter == null) {
            return null;
        }
        if (parameter.startsWith("file://")) {
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-java/src/main/java/org/apache/dolphinscheduler/plugin/task/java/JavaTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dinky/src/main/java/org/apache/dolphinscheduler/plugin/task/dinky/DinkyTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
    protected String getResponseBody(CloseableHttpResponse httpResponse) throws ParseException, IOException {
        if (httpResponse == null) {
            return null;
        }
        HttpEntity entity = httpResponse.getEntity();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return null;
        }
        return EntityUtils.toString(entity, StandardCharsets.UTF_8.name());
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-http/src/main/java/org/apache/dolphinscheduler/plugin/task/http/HttpTask.java`
#### Snippet
```java
            return RequestBuilder.delete();
        } else {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
    public static String[] convertKeywordsColumns(DbType dbType, String[] columns) {
        if (columns == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return DATAX_WRITER_PLUGIN_RDBMS;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return new PrestoStatementParser(sql);
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxUtils.java`
#### Snippet
```java
                return DATAX_READER_PLUGIN_RDBMS;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkTask.java`
#### Snippet
```java
            return str.substring(6);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-shell/src/main/java/org/apache/dolphinscheduler/plugin/task/shell/ShellTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-spark/src/main/java/org/apache/dolphinscheduler/plugin/task/spark/SparkTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/SqoopTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/generator/SqoopJobGenerator.java`
#### Snippet
```java
                return new HdfsTargetGenerator();
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sqoop/src/main/java/org/apache/dolphinscheduler/plugin/task/sqoop/generator/SqoopJobGenerator.java`
#### Snippet
```java
                return new HdfsSourceGenerator();
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sql/src/main/java/org/apache/dolphinscheduler/plugin/task/sql/SqlTask.java`
#### Snippet
```java
        if (CollectionUtils.isEmpty(udfFuncParameters)) {
            log.info("can't find udf function resource");
            return null;
        }
        // build jar sql
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-mlflow/src/main/java/org/apache/dolphinscheduler/plugin/task/mlflow/MlflowTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datax/src/main/java/org/apache/dolphinscheduler/plugin/task/datax/DataxTask.java`
#### Snippet
```java
        } catch (SQLException | ExecutionException e) {
            log.error(e.getMessage(), e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
            return str.substring(11);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-linkis/src/main/java/org/apache/dolphinscheduler/plugin/task/linkis/LinkisTask.java`
#### Snippet
```java
            return str.substring(11);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-python/src/main/java/org/apache/dolphinscheduler/plugin/task/python/PythonTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-chunjun/src/main/java/org/apache/dolphinscheduler/plugin/task/chunjun/ChunJunTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-hivecli/src/main/java/org/apache/dolphinscheduler/plugin/task/hivecli/HiveCliTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-hivecli/src/main/java/org/apache/dolphinscheduler/plugin/task/hivecli/HiveCliTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-jupyter/src/main/java/org/apache/dolphinscheduler/plugin/task/jupyter/JupyterTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-jupyter/src/main/java/org/apache/dolphinscheduler/plugin/task/jupyter/JupyterTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pytorch/src/main/java/org/apache/dolphinscheduler/plugin/task/pytorch/PytorchTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-kubeflow/src/main/java/org/apache/dolphinscheduler/plugin/kubeflow/KubeflowTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-openmldb/src/main/java/org/apache/dolphinscheduler/plugin/task/openmldb/OpenmldbTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-openmldb/src/main/java/org/apache/dolphinscheduler/plugin/task/openmldb/OpenmldbTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-zeppelin/src/main/java/org/apache/dolphinscheduler/plugin/task/zeppelin/ZeppelinTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-zeppelin/src/main/java/org/apache/dolphinscheduler/plugin/task/zeppelin/ZeppelinTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
                recoveryNodeCodeList, depNodeType);
        if (destTaskNodeList.isEmpty()) {
            return null;
        }
        List<TaskNodeRelation> taskNodeRelations = generateRelationListByFlowNodes(destTaskNodeList);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/utils/DagHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-procedure/src/main/java/org/apache/dolphinscheduler/plugin/task/procedure/ProcedureTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-sagemaker/src/main/java/org/apache/dolphinscheduler/plugin/task/sagemaker/SagemakerTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-procedure/src/main/java/org/apache/dolphinscheduler/plugin/task/procedure/ProcedureParameters.java`
#### Snippet
```java
        }
        if (CollectionUtils.isEmpty(localParams)) {
            return null;
        }
        List<Property> outPropertyList = getOutProperty(localParams);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/SeatunnelTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-seatunnel/src/main/java/org/apache/dolphinscheduler/plugin/task/seatunnel/SeatunnelTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
            return describe.status();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
            return describe.status();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datafactory/src/main/java/org/apache/dolphinscheduler/plugin/task/datafactory/DatafactoryTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/DataQualityTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datafactory/src/main/java/org/apache/dolphinscheduler/plugin/task/datafactory/DatafactoryHook.java`
#### Snippet
```java
            return DatafactoryStatus.valueOf(pipelineRun.status());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink-stream/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkStreamTaskChannel.java`
#### Snippet
```java
    @Override
    public AbstractTask pauseTask(TaskExecutionContext taskExecutionContext) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink-stream/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkStreamTaskChannel.java`
#### Snippet
```java
    @Override
    public AbstractTask recoverTask(TaskExecutionContext taskExecutionContext) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink-stream/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkStreamTaskChannel.java`
#### Snippet
```java
    @Override
    public ResourceParametersHelper getResources(String parameters) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-flink-stream/src/main/java/org/apache/dolphinscheduler/plugin/task/flink/FlinkStreamTaskChannelFactory.java`
#### Snippet
```java
    @Override
    public List<PluginParams> getParams() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/reader/ReaderFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/writer/WriterFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/enums/ReaderType.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/flow/batch/transformer/TransformerFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/enums/WriterType.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/enums/TransformerType.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T fromJson(String json, Class<T> clazz) {
        if (Strings.isNullOrEmpty(json)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/utils/JsonUtils.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-api/src/main/java/org/apache/dolphinscheduler/plugin/storage/api/StorageConfiguration.java`
#### Snippet
```java
                }
            }
            return null;
        });
        return storageOperate.orElse(null);
```

### ReturnNull
Return of `null`
in `dolphinscheduler-data-quality/src/main/java/org/apache/dolphinscheduler/data/quality/config/Config.java`
#### Snippet
```java

    public String getString(String key) {
        return configuration.get(key) == null ? null : String.valueOf(configuration.get(key));
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-api/src/main/java/org/apache/dolphinscheduler/plugin/datasource/api/client/CommonDataSourceClient.java`
#### Snippet
```java
        } catch (SQLException e) {
            log.error("get druidDataSource Connection fail SQLException: {}", e.getMessage(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-db2/src/main/java/org/apache/dolphinscheduler/plugin/datasource/db2/param/Db2DataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-hive/src/main/java/org/apache/dolphinscheduler/plugin/datasource/hive/param/HiveDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-oss/src/main/java/org/apache/dolphinscheduler/plugin/storage/oss/OssStorageOperator.java`
#### Snippet
```java
    @Override
    public String getResourceFileName(String fullName) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-trino/src/main/java/org/apache/dolphinscheduler/plugin/datasource/trino/param/TrinoDataSourceProcessor.java`
#### Snippet
```java
            return String.join("&", list);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-mysql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/mysql/param/MySQLDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> paramMap) {
        if (MapUtils.isEmpty(paramMap)) {
            return null;
        }
        Map<String, String> otherMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-mysql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/mysql/param/MySQLDataSourceProcessor.java`
#### Snippet
```java
        });
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-spark/src/main/java/org/apache/dolphinscheduler/plugin/datasource/spark/param/SparkDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> stringBuilder = otherMap.entrySet().stream()
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-dameng/src/main/java/org/apache/dolphinscheduler/plugin/datasource/dameng/param/DamengDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> paramMap) {
        if (MapUtils.isEmpty(paramMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-athena/src/main/java/org/apache/dolphinscheduler/plugin/datasource/athena/param/AthenaDataSourceProcessor.java`
#### Snippet
```java
            return String.join(Constants.SEMICOLON, list);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-oracle/src/main/java/org/apache/dolphinscheduler/plugin/datasource/oracle/param/OracleDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-presto/src/main/java/org/apache/dolphinscheduler/plugin/datasource/presto/param/PrestoDataSourceProcessor.java`
#### Snippet
```java
            return String.join("&", list);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-azure-sql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/azuresql/param/AzureSQLAuthMode.java`
#### Snippet
```java
            return AUTH_TYPE_MAP.get(type);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-redshift/src/main/java/org/apache/dolphinscheduler/plugin/datasource/redshift/param/RedshiftAuthMode.java`
#### Snippet
```java
            return AUTH_TYPE_MAP.get(type);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-redshift/src/main/java/org/apache/dolphinscheduler/plugin/datasource/redshift/param/RedshiftDataSourceProcessor.java`
#### Snippet
```java
            return String.join(Constants.SEMICOLON, list);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-redshift/src/main/java/org/apache/dolphinscheduler/plugin/datasource/redshift/param/RedshiftDataSourceProcessor.java`
#### Snippet
```java
            return getConnectionByIAM(redshiftConnectionParam);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-redshift/src/main/java/org/apache/dolphinscheduler/plugin/datasource/redshift/param/RedshiftDataSourceProcessor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-sqlserver/src/main/java/org/apache/dolphinscheduler/plugin/datasource/sqlserver/param/SQLServerDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-clickhouse/src/main/java/org/apache/dolphinscheduler/plugin/datasource/clickhouse/param/ClickHouseDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-postgresql/src/main/java/org/apache/dolphinscheduler/plugin/datasource/postgresql/param/PostgreSQLDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> otherMap) {
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-starrocks/src/main/java/org/apache/dolphinscheduler/plugin/datasource/starrocks/param/StarRocksDataSourceProcessor.java`
#### Snippet
```java
    private String transformOther(Map<String, String> paramMap) {
        if (MapUtils.isEmpty(paramMap)) {
            return null;
        }
        Map<String, String> otherMap = new HashMap<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-datasource-plugin/dolphinscheduler-datasource-starrocks/src/main/java/org/apache/dolphinscheduler/plugin/datasource/starrocks/param/StarRocksDataSourceProcessor.java`
#### Snippet
```java
        });
        if (MapUtils.isEmpty(otherMap)) {
            return null;
        }
        List<String> otherList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java

            if (StringUtils.isEmpty(retStr)) {
                return null;
            }
            // to json
```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
            // get ResourceManager state
            if (!jsonObject.has("clusterInfo")) {
                return null;
            }
            return jsonObject.get("clusterInfo").path("haState").asText();
```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java
                log.error("yarn ha application url generation failed, message:{}", e.getMessage());
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java

        if (split1.length != 2) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java

        if (split2.length != 2) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-storage-plugin/dolphinscheduler-storage-hdfs/src/main/java/org/apache/dolphinscheduler/plugin/storage/hdfs/HdfsStorageOperator.java`
#### Snippet
```java

        if (StringUtils.isEmpty(activeRM)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dataquality/src/main/java/org/apache/dolphinscheduler/plugin/task/dq/utils/RuleParserUtils.java`
#### Snippet
```java
        DqRuleExecuteSql errorOutputSql = null;
        if (CollectionUtils.isEmpty(dqRuleExecuteSqlList)) {
            return null;
        }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/WorkFlowLineageServiceImpl.java`
#### Snippet
```java
                workFlowMap.compute(processLineage.getProcessDefinitionCode(), (k, v) -> {
                    if (v == null) {
                        v = new ArrayList<>();
                    }
                    if (processLineage.getPreTaskCode() > 0) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/TaskDefinitionServiceImpl.java`
#### Snippet
```java
                        }
                        info.setUpstreamTaskMap(upstreamTaskMap);
                        v = info;
                    }
                    if (info.getUpstreamTaskCode() != 0) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ProcessTaskRelationServiceImpl.java`
#### Snippet
```java
            taskRelationMap.compute(processTaskRelation.getPostTaskCode(), (k, v) -> {
                if (v == null) {
                    v = new ArrayList<>();
                }
                v.add(processTaskRelation);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `dolphinscheduler-service/src/main/java/org/apache/dolphinscheduler/service/process/ProcessServiceImpl.java`
#### Snippet
```java
            taskCodeMap.compute(processTaskRelation.getPostTaskCode(), (k, v) -> {
                if (v == null) {
                    v = new ArrayList<>();
                }
                if (processTaskRelation.getPreTaskCode() != 0L) {
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `list` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/k8s/K8sClientService.java`
#### Snippet
```java
                k8sManager.getK8sClient(clusterCode).namespaces().list();

        Optional<Namespace> list =
                listNamespace.getItems().stream()
                        .filter((Namespace namespace) -> namespace.getMetadata().getName().equals(name))
```

### UnnecessaryLocalVariable
Local variable `destHdfsFileName` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/service/impl/ResourcesServiceImpl.java`
#### Snippet
```java

        // get the path of dest file in hdfs
        String destHdfsFileName = fullName;
        try {
            log.info("start  copy {} -> {}", originFullName, destHdfsFileName);
```

### UnnecessaryLocalVariable
Local variable `taskInstance` is redundant
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/controller/v2/TaskInstanceV2Controller.java`
#### Snippet
```java
                                                @Parameter(name = "projectCode", description = "PROJECT_CODE", required = true) @PathVariable long projectCode,
                                                @PathVariable(value = "taskInstanceId") Long taskInstanceId) {
        TaskInstance taskInstance = taskInstanceService.queryTaskInstanceById(loginUser, projectCode, taskInstanceId);
        return taskInstance;
    }
```

### UnnecessaryLocalVariable
Local variable `processDefinitionLog` is redundant
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/ProcessDefinitionDaoImpl.java`
#### Snippet
```java
                .parallelStream()
                .map(processInstance -> {
                    ProcessDefinitionLog processDefinitionLog = processDefinitionLogMapper
                            .queryByDefinitionCodeAndVersion(processInstance.getProcessDefinitionCode(),
                                    processInstance.getProcessDefinitionVersion());
```

### UnnecessaryLocalVariable
Local variable `processDefinitions` is redundant
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/repository/impl/ProcessDefinitionDaoImpl.java`
#### Snippet
```java
                .collect(Collectors.toList());

        List<ProcessDefinition> processDefinitions =
                processDefinitionLogs.stream().map(log -> (ProcessDefinition) log).collect(Collectors.toList());

```

### UnnecessaryLocalVariable
Local variable `paramsProps` is redundant
in `dolphinscheduler-spi/src/main/java/org/apache/dolphinscheduler/spi/params/PasswordParam.java`
#### Snippet
```java
        public Builder(String name, String title) {
            super(name, FormType.INPUT, title);
            ParamsProps paramsProps = new ParamsProps();
            this.props = paramsProps;
        }
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `ProxyResult` is redundant
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/demo/ProcessDefinitionDemo.java`
#### Snippet
```java
        String taskDefinitionJson = JSONUtils.toJsonString(taskDefinitionLogs);

        ProxyResult ProxyResult = proxyProcessDefinitionController.createProcessDefinition(token, projectCode,
                processDefinitionLog.getName(),
                processDefinitionLog.getDescription(),
```

### UnnecessaryLocalVariable
Local variable `command` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcTask.java`
#### Snippet
```java
        args.add(DvcConstants.DVC_DOWNLOAD);

        String command = String.join("\n", args);
        return command;

```

### UnnecessaryLocalVariable
Local variable `command` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcTask.java`
#### Snippet
```java
        args.add(DvcConstants.GIT_UPDATE_FOR_INIT_DVC);

        String command = String.join("\n", args);
        return command;

```

### UnnecessaryLocalVariable
Local variable `command` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-dvc/src/main/java/org/apache/dolphinscheduler/plugin/task/dvc/DvcTask.java`
#### Snippet
```java
        args.add(DvcConstants.GIT_UPDATE_FOR_UPDATE_DATA);

        String command = String.join("\n", args);
        return command;

```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
        HttpEntity entity = response.getEntity();
        String resp = EntityUtils.toString(entity, StandardCharsets.UTF_8);
        T result = JSONUtils.parseObject(resp, clazz);
        return result;
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-common/src/main/java/org/apache/dolphinscheduler/common/model/BaseHeartBeatTask.java`
#### Snippet
```java
            } finally {
                try {
                    Thread.sleep(heartBeatInterval);
                } catch (InterruptedException e) {
                    handleInterruptException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/StateWheelExecuteThread.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(checkInterval);
            } catch (InterruptedException e) {
                log.error("state wheel thread sleep error, will close the loop", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/MasterSchedulerBootstrap.java`
#### Snippet
```java
                    log.warn("The current server {} is not at running status, cannot consumes commands.",
                            this.masterAddress);
                    Thread.sleep(Constants.SLEEP_TIME_MILLIS);
                }
                // todo: if the workflow event queue is much, we need to handle the back pressure
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/MasterSchedulerBootstrap.java`
#### Snippet
```java
                    log.warn("The current server {} is overload, cannot consumes commands.", this.masterAddress);
                    MasterServerMetrics.incMasterOverload();
                    Thread.sleep(Constants.SLEEP_TIME_MILLIS);
                    continue;
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/MasterSchedulerBootstrap.java`
#### Snippet
```java
                if (CollectionUtils.isEmpty(commands)) {
                    // indicate that no command ,sleep for 1s
                    Thread.sleep(Constants.SLEEP_TIME_MILLIS);
                    continue;
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-master/src/main/java/org/apache/dolphinscheduler/server/master/runner/MasterSchedulerBootstrap.java`
#### Snippet
```java
                if (CollectionUtils.isEmpty(processInstances)) {
                    // indicate that the command transform to processInstance error, sleep for 1s
                    Thread.sleep(Constants.SLEEP_TIME_MILLIS);
                    continue;
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/runner/WorkerManagerThread.java`
#### Snippet
```java
            try {
                if (!ServerLifeCycleManager.isRunning()) {
                    Thread.sleep(Constants.SLEEP_TIME_MILLIS);
                }
                if (this.getThreadPoolQueueSize() <= workerExecThreads) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/message/MessageRetryRunner.java`
#### Snippet
```java
            try {
                if (MapUtils.isEmpty(needToRetryMessages)) {
                    Thread.sleep(MESSAGE_RETRY_WINDOW);
                }

```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-worker/src/main/java/org/apache/dolphinscheduler/server/worker/message/MessageRetryRunner.java`
#### Snippet
```java
                    }
                }
                Thread.sleep(Constants.SLEEP_TIME_MILLIS);
            } catch (InterruptedException instance) {
                log.warn("The message retry thread is interrupted, will break this loop", instance);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-mysql/src/main/java/org/apache/dolphinscheduler/plugin/registry/mysql/MysqlRegistry.java`
#### Snippet
```java
            }
            try {
                Thread.sleep(mysqlRegistryProperties.getTermRefreshInterval().toMillis());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/AbstractCommandExecutor.java`
#### Snippet
```java
                        logBuffer.clear();
                    } else {
                        Thread.sleep(TaskConstants.DEFAULT_LOG_FLUSH_INTERVAL);
                    }
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/loop/BaseLoopTaskExecutor.java`
#### Snippet
```java
                    break;
                }
                Thread.sleep(loopInterval);
            }
            if (loopTaskInstanceStatus != null && loopTaskInstanceStatus.isSuccess()) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-task-plugin/dolphinscheduler-task-api/src/main/java/org/apache/dolphinscheduler/plugin/task/api/utils/RetryUtils.java`
#### Snippet
```java
                retryCount++;
                try {
                    Thread.sleep(retryInterval);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-task-plugin/dolphinscheduler-task-pigeon/src/main/java/org/apache/dolphinscheduler/plugin/task/pigeon/PigeonTask.java`
#### Snippet
```java
                            break;
                        }
                        Thread.sleep(3000);
                    } finally {
                        status.close();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `dolphinscheduler-task-plugin/dolphinscheduler-task-datasync/src/main/java/org/apache/dolphinscheduler/plugin/task/datasync/DatasyncHook.java`
#### Snippet
```java
            }
            log.debug("wait 10s to recheck finish status....");
            Thread.sleep(10000);
        }
        log.warn("double check error");
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`true != tenantMapper.existTenant(targetTenantCode)` can be simplified to '!tenantMapper.existTenant(targetTenantCode)'
in `dolphinscheduler-tools/src/main/java/org/apache/dolphinscheduler/tools/resource/MigrateResourceService.java`
#### Snippet
```java

    public void migrateResourceOnce(String targetTenantCode) {
        if (true != tenantMapper.existTenant(targetTenantCode)) {
            logger.error("Tenant not exists!");
            return;
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `dolphinscheduler-dao/src/main/java/org/apache/dolphinscheduler/dao/entity/TaskDefinition.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
            String token = request.getHeader("token");
            if (!StringUtils.isEmpty(token)) {
                RateLimiter tenantRateLimiter = tenantRateLimiterCache.get(token);
                if (!tenantRateLimiter.tryAcquire()) {
                    response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
            if (!StringUtils.isEmpty(token)) {
                RateLimiter tenantRateLimiter = tenantRateLimiterCache.get(token);
                if (!tenantRateLimiter.tryAcquire()) {
                    response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                    log.warn("Too many request, reach tenant rate limit, current tenant:{} qps is {}", token,
```

### UnstableApiUsage
'getRate()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
                    response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                    log.warn("Too many request, reach tenant rate limit, current tenant:{} qps is {}", token,
                            tenantRateLimiter.getRate());
                    return false;
                }
```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
        // global rate limit
        if (trafficConfiguration.isGlobalSwitch()) {
            if (!globalRateLimiter.tryAcquire()) {
                response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                log.warn("Too many request, reach global rate limit, current qps is {}",
```

### UnstableApiUsage
'getRate()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
                response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                log.warn("Too many request, reach global rate limit, current qps is {}",
                        globalRateLimiter.getRate());
                return false;
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
        if (trafficConfiguration.isGlobalSwitch()) {
            this.globalRateLimiter =
                    RateLimiter.create(trafficConfiguration.getMaxGlobalQpsRate(), 1, TimeUnit.SECONDS);
        }
    }
```

### UnstableApiUsage
'create(double, long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
        if (trafficConfiguration.isGlobalSwitch()) {
            this.globalRateLimiter =
                    RateLimiter.create(trafficConfiguration.getMaxGlobalQpsRate(), 1, TimeUnit.SECONDS);
        }
    }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
    private TrafficConfiguration trafficConfiguration;

    private RateLimiter globalRateLimiter;

    private LoadingCache<String, RateLimiter> tenantRateLimiterCache = CacheBuilder.newBuilder()
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
            .maximumSize(100)
            .expireAfterAccess(10, TimeUnit.MINUTES)
            .build(new CacheLoader<String, RateLimiter>() {

                @Override
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
    private RateLimiter globalRateLimiter;

    private LoadingCache<String, RateLimiter> tenantRateLimiterCache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .expireAfterAccess(10, TimeUnit.MINUTES)
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java

                @Override
                public RateLimiter load(String token) {
                    // use tenant customize rate limit
                    Map<String, Integer> customizeTenantQpsRate = trafficConfiguration.getCustomizeTenantQpsRate();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
                    }
                    // use tenant default rate limit
                    return RateLimiter.create(tenantQuota, 1, TimeUnit.SECONDS);
                }
            });
```

### UnstableApiUsage
'create(double, long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dolphinscheduler-api/src/main/java/org/apache/dolphinscheduler/api/interceptor/RateLimitInterceptor.java`
#### Snippet
```java
                    }
                    // use tenant default rate limit
                    return RateLimiter.create(tenantQuota, 1, TimeUnit.SECONDS);
                }
            });
```

