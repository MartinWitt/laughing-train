# rocketmq-connect 
 
# Bad smells
I found 902 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 451 | false |
| UNCHECKED_WARNING | 88 | false |
| FieldMayBeFinal | 77 | false |
| PlaceholderCountMatchesArgumentCount | 25 | false |
| ConstantValue | 24 | false |
| FieldCanBeLocal | 22 | false |
| Deprecation | 21 | false |
| DuplicatedCode | 18 | false |
| DataFlowIssue | 16 | false |
| DanglingJavadoc | 15 | false |
| UnnecessaryLocalVariable | 15 | true |
| CharsetObjectCanBeUsed | 12 | false |
| WrapperTypeMayBePrimitive | 11 | false |
| IgnoreResultOfCall | 9 | false |
| StringBufferReplaceableByString | 8 | false |
| UnusedAssignment | 8 | false |
| CatchMayIgnoreException | 7 | false |
| TrivialStringConcatenation | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| IOStreamConstructor | 6 | false |
| AutoCloseableResource | 6 | false |
| RedundantCast | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| RedundantMethodOverride | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| UnstableApiUsage | 3 | false |
| NonFinalFieldInEnum | 2 | false |
| DuplicateCondition | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| MagicConstant | 1 | false |
| ManualArrayCopy | 1 | false |
| NumberEquality | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ExcessiveRangeCheck | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| BusyWait | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        try {
            String connector = context.pathParam(CONNECTOR_NAME);
            Integer task = Integer.valueOf(context.pathParam(TASK_NAME));
            context.json(new HttpResponse<>(context.status(), connectController.taskStatus(new ConnectorTaskId(connector, task))));
        } catch (Exception ex) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    public String toString() {
        final StringBuilder sb = new StringBuilder(1024);
        Long totalTimes = sourceTaskTimesTotal();
        if (0 == totalTimes) {
            totalTimes = 1L;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
            totalTimes = 1L;
        }
        Long sinktotalTimes = sinkTaskTimesTotal();
        if (0 == sinktotalTimes) {
            sinktotalTimes = 1L;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        public static double getTPS(final CallSnapshot begin, final CallSnapshot end) {
            long total = end.callTimesTotal - begin.callTimesTotal;
            Long time = end.timestamp - begin.timestamp;

            double tps = total / time.doubleValue();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        }
                        // Capture the precision as a parameter only if it is not the default
                        Integer precision = ((Number) precisionNode).intValue();
                        if (precision != CONNECT_AVRO_DECIMAL_PRECISION_DEFAULT) {
                            builder.parameter(CONNECT_AVRO_DECIMAL_PRECISION_PROP, precision.toString());
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
        String topic = (String) recordPartition.getPartition().get(TOPIC);
        Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
        if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
            log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        }
        MessageQueue messageQueue = new MessageQueue(topic, brokerName, queueId);
        Long offset = Long.valueOf((String) recordOffset.getOffset().get(QUEUE_OFFSET));
        if (null == offset) {
            log.warn("resetOffset, offset is null");
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            MessageQueue messageQueue = new MessageQueue(topic, brokerName, queueId);
            RecordOffset recordOffset = entry.getValue();
            Long offset = Long.valueOf((String) recordOffset.getOffset().get(QUEUE_OFFSET));
            if (null == offset) {
                log.warn("resetOffset, offset is null");
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`60 * 1` can be replaced with '60'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private static final int MAX_RECORDS_OF_SAMPLING = 60 * 10;

    private static int printTPSInterval = 60 * 1;

    private final ConcurrentMap<String, AtomicLong> sourceTaskTimesTotal =
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternRenameConfig.java`
#### Snippet
```java
            patternFlags = patternFlags | flag;
        }
        this.pattern = Pattern.compile(pattern, patternFlags);
        this.replacement = config.getString(FIELD_REPLACEMENT_CONF);
    }
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
        if (args.length > 1) {
            String[] result = new String[args.length - 1];
            for (int i = 0; i < args.length - 1; i++) {
                result[i] = args[i + 1];
            }
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'ConverterType'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/ConverterType.java`
#### Snippet
```java
    }

    private String name;

    ConverterType() {
```

### NonFinalFieldInEnum
Non-final field `klass` in enum 'PluginType'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginType.java`
#### Snippet
```java
    UNKNOWN(Object.class);

    private Class<?> klass;

    PluginType(Class<?> klass) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuffer` can be replaced with 'String'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java

    public static String createUniqInstance(String prefix) {
        return new StringBuffer(prefix).append("-").append(UUID.randomUUID()).toString();
    }

```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[")
                .append(name)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java

    private String getSourceTaskTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getSourceTaskTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java

    private String getSinkTaskTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getSinkTaskTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java

    private String getTotalTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getTotalTps(10));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createGroupName(String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("-");
        sb.append(RemotingUtil.getLocalAddress()).append("-");
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createGroupName(String prefix, String postfix) {
        return new StringBuilder().append(prefix).append("-").append(postfix).toString();
    }

```

### StringBufferReplaceableByString
`StringBuffer` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createUniqInstance(String prefix) {
        return new StringBuffer(prefix).append("-").append(UUID.randomUUID().toString()).toString();
    }

```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    }

    public static DefaultMQPullConsumer initDefaultMQPullConsumer(WorkerConfig connectConfig, ConnectorTaskId id, ConnectKeyValue keyValue) {
        RPCHook rpcHook = null;
        if (connectConfig.getAclEnable()) {
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            rpcHook = new AclClientRPCHook(new SessionCredentials(connectConfig.getAccessKey(), connectConfig.getSecretKey()));
        }
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(rpcHook);
        consumer.setInstanceName(id.toString());
        String taskGroupId = keyValue.getString("task-group-id");
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            rpcHook = new AclClientRPCHook(new SessionCredentials(connectConfig.getAccessKey(), connectConfig.getSecretKey()));
        }
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(rpcHook);
        consumer.setInstanceName(id.toString());
        String taskGroupId = keyValue.getString("task-group-id");
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    }

    public static DefaultMQPullConsumer initDefaultMQPullConsumer(WorkerConfig connectConfig) {
        RPCHook rpcHook = null;
        if (connectConfig.getAclEnable()) {
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            rpcHook = new AclClientRPCHook(new SessionCredentials(connectConfig.getAccessKey(), connectConfig.getSecretKey()));
        }
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(rpcHook);
        consumer.setNamesrvAddr(connectConfig.getNamesrvAddr());
        consumer.setInstanceName(createUniqInstance(connectConfig.getNamesrvAddr()));
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            rpcHook = new AclClientRPCHook(new SessionCredentials(connectConfig.getAccessKey(), connectConfig.getSecretKey()));
        }
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer(rpcHook);
        consumer.setNamesrvAddr(connectConfig.getNamesrvAddr());
        consumer.setInstanceName(createUniqInstance(connectConfig.getNamesrvAddr()));
```

### Deprecation
'setBrokerSuspendMaxTimeMillis(long)' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        consumer.setConsumerGroup(connectConfig.getRmqConsumerGroup());
        consumer.setMaxReconsumeTimes(connectConfig.getRmqMaxRedeliveryTimes());
        consumer.setBrokerSuspendMaxTimeMillis(connectConfig.getBrokerSuspendMaxTimeMillis());
        consumer.setConsumerPullTimeoutMillis(connectConfig.getRmqMessageConsumeTimeout());
        consumer.setLanguage(LanguageCode.JAVA);
```

### Deprecation
'org.apache.rocketmq.client.consumer.DefaultMQPullConsumer' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
     * Used for worker discovery
     */
    private DefaultMQPullConsumer defaultMQPullConsumer;

    public ClusterManagementServiceImpl() {
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public String getCurrentWorker() {
        return this.defaultMQPullConsumer.getDefaultMQPullConsumerImpl().getRebalanceImpl().getmQClientFactory().getClientId();
    }

```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public List<String> getAllAliveWorkers() {
        return this.defaultMQPullConsumer.getDefaultMQPullConsumerImpl()
                .getRebalanceImpl()
                .getmQClientFactory()
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public boolean hasClusterStoreTopic() {
        return this.defaultMQPullConsumer.getDefaultMQPullConsumerImpl()
                .getRebalanceImpl()
                .getmQClientFactory()
```

### Deprecation
'getDefaultMQPullConsumerImpl()' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
        WorkerChangeListener workerChangeListener = new WorkerChangeListener();

        this.defaultMQPullConsumer.getDefaultMQPullConsumerImpl()
                .getRebalanceImpl()
                .getmQClientFactory()
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        this.keyConverter.configure(new HashMap<>());
        this.valueConverter.configure(new HashMap<>());
        this.needSyncPartition = new ConcurrentSet<>();
        this.commitStarted = -1;
        this.config = workerConfig;
```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        for (Map.Entry<String, Object> entry : ((Map<String, Object>) defaultVal).entrySet()) {
                            JsonNode entryDef = defaultValueFromConnect(schema.getValueSchema(), entry.getValue());
                            node.put(entry.getKey(), entryDef);
                        }
                        return node;
```

### Deprecation
'SubTypesScanner()' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        builder.setClassLoaders(new ClassLoader[]{loader});
        builder.addUrls(urls);
        builder.setScanners(new SubTypesScanner());
        builder.setParallel(true);
        Reflections reflections = new InternalReflections(builder);
```

### Deprecation
'org.reflections.scanners.SubTypesScanner' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        builder.setClassLoaders(new ClassLoader[]{loader});
        builder.addUrls(urls);
        builder.setScanners(new SubTypesScanner());
        builder.setParallel(true);
        Reflections reflections = new InternalReflections(builder);
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private Set<Runnable> runningTasks = new ConcurrentSet<>();
    private final Map<Runnable, Long/*timestamp*/> stoppingTasks = new ConcurrentHashMap<>();
    private final Set<Runnable> stoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedStoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> errorTasks = new ConcurrentSet<>();
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     */
    private final Map<Runnable, Long/*timestamp*/> pendingTasks = new ConcurrentHashMap<>();
    private Set<Runnable> runningTasks = new ConcurrentSet<>();
    private final Map<Runnable, Long/*timestamp*/> stoppingTasks = new ConcurrentHashMap<>();
    private final Set<Runnable> stoppedTasks = new ConcurrentSet<>();
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private final Set<Runnable> stoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedStoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> errorTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedErrorTasks = new ConcurrentSet<>();
    /**
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private final Map<Runnable, Long/*timestamp*/> stoppingTasks = new ConcurrentHashMap<>();
    private final Set<Runnable> stoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedStoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> errorTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedErrorTasks = new ConcurrentSet<>();
```

### Deprecation
'io.netty.util.internal.ConcurrentSet' is deprecated
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private final Set<Runnable> cleanedStoppedTasks = new ConcurrentSet<>();
    private final Set<Runnable> errorTasks = new ConcurrentSet<>();
    private final Set<Runnable> cleanedErrorTasks = new ConcurrentSet<>();
    /**
     * Current running tasks to its Future map.
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
        producerRecord.putUserProperty(ERROR_HEADER_EXECUTING_CLASS, context.executingClass().getName());
        producerRecord.putUserProperty(ERROR_HEADER_CONNECTOR_NAME, connectorTaskId.connector());
        producerRecord.putUserProperty(ERROR_HEADER_TASK_ID, connectorTaskId.task() + "");
        if (context.error() != null) {
            Throwable error = context.error();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        map.put("topic", messageQueue.getTopic());
        map.put("brokerName", messageQueue.getBrokerName());
        map.put("queueId", messageQueue.getQueueId() + "");
        RecordPartition recordPartition = new RecordPartition(map);
        return recordPartition;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        map.put("topic", topic);
        map.put("brokerName", brokerName);
        map.put("queueId", queueId + "");
        RecordPartition recordPartition = new RecordPartition(map);
        return recordPartition;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    public static RecordOffset convertToRecordOffset(Long offset) {
        Map<String, String> offsetMap = new HashMap<>();
        offsetMap.put(QUEUE_OFFSET, offset + "");
        RecordOffset recordOffset = new RecordOffset(offsetMap);
        return recordOffset;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
        @Override
        public String getTaskName() {
            return id().task() + "";
        }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
        @Override
        public String getTaskName() {
            return id().task() + "";
        }

```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        // Capture the precision as a parameter only if it is not the default
                        Integer precision = ((Number) precisionNode).intValue();
                        if (precision != CONNECT_AVRO_DECIMAL_PRECISION_DEFAULT) {
                            builder.parameter(CONNECT_AVRO_DECIMAL_PRECISION_PROP, precision.toString());
                        }
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `committableOffsets.containsKey(queue)`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
            }

            if (!committableOffsets.containsKey(queue)) {
                log.debug("{} The MessageQueue provided by the task is not subscribed {}/{} , requested={}",
                        this, queue, taskProvidedOffset, committableOffsets.keySet());
```

### DuplicateCondition
Duplicate condition `committableOffsets.containsKey(queue)`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
            }

            if (committableOffsets.containsKey(queue)) {
                // current offset
                long currentOffset = offsetsToCommit.get(queue);
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricsReporter.java`
#### Snippet
```java
 */
public abstract class MetricsReporter implements Reporter, MetricRegistryListener, AutoConfiguration, IReporter {
    private final MetricRegistry registry;

    public MetricsReporter(MetricRegistry registry) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FilterTransform.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.FILE_CONNECTOR);

    private KeyValue keyValue;

    @Override public ConnectRecord doTransform(ConnectRecord record) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSinkTask.java`
#### Snippet
```java
    private PrintStream outputStream;
    
    private KeyValue config;

    @Override public void put(List<ConnectRecord> sinkDataEntries) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
    public Set<String> fields;

    private PatternFilterConfig config;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    private Long streamOffset;

    private KeyValue config;

    @Override public List<ConnectRecord> poll() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    private char[] buffer = new char[1024];
    private int offset = 0;
    private int batchSize = FileSourceConnector.DEFAULT_TASK_BATCH_SIZE;

    private Long streamOffset;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
public class AvroSerializer implements Serializer<AvroSchema> {

    private final int idSize = 8;
    private AvroSchemaRegistryClient schemaRegistryClient;
    private AvroDatumWriterFactory avroDatumWriterFactory;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java

public class AvroDatumReaderFactory extends AvroSerdeFactory {
    private final int idSize = 8;
    private final DecoderFactory decoderFactory = DecoderFactory.get();
    private final Map<String, Schema> readerSchemaCache = new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStats.java`
#### Snippet
```java
    private static final InternalLogger log = InternalLoggerFactory.getLogger(LoggerName.ROCKETMQ_CONNECT_STATS);

    private final ConnectStatsService connectStatsService;

    private volatile long msgPutTotalYesterdayMorning;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private static final int MAX_RECORDS_OF_SAMPLING = 60 * 10;

    private static int printTPSInterval = 60 * 1;

    private final ConcurrentMap<String, AtomicLong> sourceTaskTimesTotal =
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsManager.java`
#### Snippet
```java
    private final HashMap<String, StatsItemSet> statsTable = new HashMap<String, StatsItemSet>();
    private final String worker;
    private WorkerConfig connectConfig;

    public ConnectStatsManager(WorkerConfig connectConfig) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * The configs of current source task.
     */
    private ConnectKeyValue config;
    /**
     * A RocketMQ producer to send message to dest MQ.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/RebalanceService.java`
#### Snippet
```java
     * ClusterManagementService to access current cluster info.
     */
    private final ClusterManagementService clusterManagementService;

    public RebalanceService(RebalanceImpl rebalanceImpl, ConfigManagementService configManagementService,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/RebalanceService.java`
#### Snippet
```java
     * ConfigManagementService to access current config info.
     */
    private final ConfigManagementService configManagementService;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/StandaloneRebalanceService.java`
#### Snippet
```java
     * ClusterManagementService to access current cluster info.
     */
    private final ClusterManagementService clusterManagementService;

    public StandaloneRebalanceService(RebalanceImpl rebalanceImpl, ConfigManagementService configManagementService,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/StandaloneRebalanceService.java`
#### Snippet
```java
     * ConfigManagementService to access current config info.
     */
    private final ConfigManagementService configManagementService;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/standalone/StandaloneConnectController.java`
#### Snippet
```java
public class StandaloneConnectController extends AbstractConnectController {

    private final RebalanceImpl rebalanceImpl;
    private final StandaloneRebalanceService rebalanceService;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/distributed/DistributedConnectController.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private final RebalanceImpl rebalanceImpl;
    /**
     * A scheduled task to rebalance all connectors and tasks in the cluster.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListSerializer.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private Class clazz;

    public ListSerializer(Class clazz) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * Used to read the position of source data source.
     */
    private final OffsetStorageReader offsetStorageReader;
    /**
     * Used to write the position of source data source.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     */
    private final ConnectStatsManager connectStatsManager;
    private final ConnectStatsService connectStatsService;

    private final CountDownLatch stopPullMsgLatch;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * stat
     */
    private final ConnectStatsManager connectStatsManager;
    private final ConnectStatsService connectStatsService;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
        File fileParent = file.getParentFile();
        if (fileParent != null) {
            fileParent.mkdirs();
        }
        FileWriter fileWriter = null;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java

            File file = new File(fileName);
            file.delete();

            file = new File(tmpFile);
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java

            file = new File(tmpFile);
            file.renameTo(new File(fileName));
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java
            // Best effort wait for any get() and set() tasks (and caller's callbacks) to complete.
            try {
                executor.awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/distributed/DistributedConnectController.java`
#### Snippet
```java
        scheduledExecutorService.shutdown();
        try {
            scheduledExecutorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            log.error("shutdown scheduledExecutorService error.", e);
```

### IgnoreResultOfCall
Result of `String.getBytes()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
            for (Map.Entry<ExtendRecordPartition, RecordOffset> entry : data.entrySet()) {
                String jsonKey = JSON.toJSONString(entry.getKey());
                jsonKey.getBytes("UTF-8");
                String jsonValue = JSON.toJSONString(entry.getValue());
                jsonValue.getBytes("UTF-8");
```

### IgnoreResultOfCall
Result of `String.getBytes()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
                jsonKey.getBytes("UTF-8");
                String jsonValue = JSON.toJSONString(entry.getValue());
                jsonValue.getBytes("UTF-8");
                resultMap.put(jsonKey, jsonValue);
            }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
                    log.trace("{} About to send {} records to RocketMQ", this, toSendRecord.size());
                    if (!sendRecord()) {
                        stopRequestedLatch.await(SEND_FAILED_BACKOFF_MS, TimeUnit.MILLISECONDS);
                    }
                } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
                if (messageQueues.size() == 0) {
                    log.info("messageQueuesOffsetMap is null, : {}", startTimeStamp);
                    stopPullMsgLatch.await(PULL_MSG_ERROR_BACKOFF_MS, TimeUnit.MILLISECONDS);
                    continue;
                }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getTaskConfigs()` is identical to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java

    @Override
    public Map<String, List<ConnectKeyValue>> getTaskConfigs() {
        return taskKeyValueStore.getKVMap();
    }
```

### RedundantMethodOverride
Method `getPlugin()` is identical to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java

    @Override
    public Plugin getPlugin() {
        return this.plugin;
    }
```

### RedundantMethodOverride
Method `putTaskConfigs()` is identical to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java

    @Override
    protected void putTaskConfigs(String connectorName, List<ConnectKeyValue> configs) {
        List<ConnectKeyValue> exist = taskKeyValueStore.get(connectorName);
        if (null != exist && exist.size() > 0) {
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
printTPSInterval \* 1000: integer multiplication implicitly cast to long
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java

    private void printTps() {
        if (System.currentTimeMillis() > (this.lastPrintTimestamp + printTPSInterval * 1000)) {
            this.lastPrintTimestamp = System.currentTimeMillis();

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java

                        long timeToSleep;
                        if (exponential) {
                            timeToSleep = sleepTimeInMilliSecond * (long) Math.pow(2, i);
                            if (timeToSleep >= MAX_SLEEP_MILLISECOND) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `value` initializer `null` is redundant
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java

        // Return JsonNode if type is null
        JsonNode value = null;
        try {
            value = OBJECT_MAPPER.readTree(new ByteArrayInputStream(buffer.array(), start, length));
```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/CreateConnectorSubCommand.java`
#### Snippet
```java
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
            int index = 0;
            while ((index = reader.read()) != -1) {
                sb.append((char) index);
```

### UnusedAssignment
Variable `arg` initializer `null` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg = null;
                            if (cn.equals("int") || cn.equals("Integer")) {
                                arg = Integer.parseInt(property);
```

### UnusedAssignment
The value `combinedBuilder` assigned to `builder` is never used
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
                        ));
                    }
                    builder = combinedBuilder;
                } else if (schema.isOptional()) {
                    CombinedSchema.Builder combinedBuilder = CombinedSchema.builder();
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
            CombinedSchema combinedSchema = (CombinedSchema) jsonSchema;
            CombinedSchema.ValidationCriterion criterion = combinedSchema.getCriterion();
            String name = null;
            if (criterion == CombinedSchema.ONE_CRITERION || criterion == CombinedSchema.ANY_CRITERION) {
                name = JSON_TYPE_ONE_OF;
```

### UnusedAssignment
Variable `enabledCompactTopic` initializer `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Thread thread;

    private boolean enabledCompactTopic = false;

    private String groupName;
```

### UnusedAssignment
Variable `taskProvidedRecordOffsets` initializer `new ConcurrentHashMap<>()` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java

        Map<MessageQueue, Long> taskProvidedOffsets = new ConcurrentHashMap<>();
        Map<RecordPartition, RecordOffset> taskProvidedRecordOffsets = new ConcurrentHashMap<>();
        try {
            log.info(" Call task.preCommit reset offset : {}", offsetsToCommit);
```

### UnusedAssignment
Variable `task` initializer `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private Task getTask(String taskClass) {
        ClassLoader savedLoader = plugin.currentThreadLoader();
        Task task = null;
        try {
            // Get plugin loader
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `pt != null` is always `true`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
                    if (property != null) {
                        Class<?>[] pt = method.getParameterTypes();
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg = null;
```

### ConstantValue
Condition `pt != null` is always `true`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileUtils.java`
#### Snippet
```java
                    if (property != null) {
                        Class<?>[] pt = method.getParameterTypes();
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg;
```

### ConstantValue
Condition `file != null` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            if (commandLine.hasOption('c')) {
                String file = commandLine.getOptionValue('c').trim();
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
```

### ConstantValue
Condition `file != null` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            if (commandLine.hasOption('c')) {
                String file = commandLine.getOptionValue('c').trim();
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
```

### ConstantValue
Condition `executorService != null` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
    @Override
    public void close() throws IOException {
        if (executorService != null) {
            executorService.shutdown();
        }
```

### ConstantValue
Condition `pt != null` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
                    if (property != null) {
                        Class<?>[] pt = method.getParameterTypes();
                        if (pt != null && pt.length > 0) {
                            String cn = pt[0].getSimpleName();
                            Object arg;
```

### ConstantValue
Condition `converter instanceof RecordConverter` is always `true` when reached
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java

        MessageExt consumerRecord = new MessageExt();
        if (converter != null && converter instanceof RecordConverter) {
            byte[] value = converter.fromConnectData(topic, record.getSchema(), record.getData());
            consumerRecord.setBody(value);
```

### ConstantValue
Condition `Objects.isNull(consumer)` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    public static DefaultLitePullConsumer initDefaultLitePullConsumer(WorkerConfig connectConfig, boolean autoCommit) {
        DefaultLitePullConsumer consumer = null;
        if (Objects.isNull(consumer)) {
            if (StringUtils.isBlank(connectConfig.getAccessKey()) && StringUtils.isBlank(connectConfig.getSecretKey())) {
                consumer = new DefaultLitePullConsumer();
```

### ConstantValue
Value `consumer` is always 'null'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    public static DefaultLitePullConsumer initDefaultLitePullConsumer(WorkerConfig connectConfig, boolean autoCommit) {
        DefaultLitePullConsumer consumer = null;
        if (Objects.isNull(consumer)) {
            if (StringUtils.isBlank(connectConfig.getAccessKey()) && StringUtils.isBlank(connectConfig.getSecretKey())) {
                consumer = new DefaultLitePullConsumer();
```

### ConstantValue
Condition `partition != null` is always `true`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        String namespace = partition.getNamespace();
        // When serializing the key, we add in the namespace information so the key is [namespace, real key]
        byte[] key = keyConverter.fromConnectData(namespace, null, Arrays.asList(change.name(), namespace, partition != null ? partition.getPartition() : new HashMap<>()));
        ByteBuffer keyBuffer = (key != null) ? ByteBuffer.wrap(key) : null;
        byte[] value = valueConverter.fromConnectData(namespace, null, position != null ? position.getOffset() : new HashMap<>());
```

### ConstantValue
Condition `requireSchemalessContainerNull` is always `true`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

        if (schemaType == null && requireSchemalessContainerNull) {
            if (requireSchemalessContainerNull) {
                return new GenericRecordBuilder(ANYTHING_SCHEMA).build();
            } else {
```

### ConstantValue
Condition `schema == null && requireSchemalessContainerNull` is always `false`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

        if (data == null) {
            if (schema == null && requireSchemalessContainerNull) {
                return new GenericRecordBuilder(ANYTHING_SCHEMA).build();
            } else {
```

### ConstantValue
Condition `requireSchemalessContainerNull` is always `false` when reached
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

        if (data == null) {
            if (schema == null && requireSchemalessContainerNull) {
                return new GenericRecordBuilder(ANYTHING_SCHEMA).build();
            } else {
```

### ConstantValue
Condition `null == queueId` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
                continue;
```

### ConstantValue
Condition `null == queueId` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        String topic = (String) recordPartition.getPartition().get(TOPIC);
        Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
        if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
            log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
            return;
```

### ConstantValue
Condition `null == offset` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        MessageQueue messageQueue = new MessageQueue(topic, brokerName, queueId);
        Long offset = Long.valueOf((String) recordOffset.getOffset().get(QUEUE_OFFSET));
        if (null == offset) {
            log.warn("resetOffset, offset is null");
            return;
```

### ConstantValue
Condition `null == queueId` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
                continue;
```

### ConstantValue
Condition `null == queueId` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
                continue;
```

### ConstantValue
Condition `null == offset` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            RecordOffset recordOffset = entry.getValue();
            Long offset = Long.valueOf((String) recordOffset.getOffset().get(QUEUE_OFFSET));
            if (null == offset) {
                log.warn("resetOffset, offset is null");
                continue;
```

### ConstantValue
Condition `value == null` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            LogicalTypeConverter logicalConverter = LOGICAL_CONVERTERS.get(schema.getName());
            if (logicalConverter != null) {
                if (value == null) {
                    return null;
                } else {
```

### ConstantValue
Condition `!(value instanceof JSONArray)` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                    JSONArray array = (JSONArray) value;
                    for (Object entry : array.stream().toArray()) {
                        if (!(value instanceof JSONArray)) {
                            throw new ConnectException("Found invalid map entry instead of array tuple: " + JSON.toJSONString(entry));
                        }
```

### ConstantValue
Condition `pausedForRetry` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
        } else {
            // Paused for retry. If the data has been written through the plug-in, all queues can be resumed
            if (pausedForRetry) {
                resumeAll();
            }
```

### ConstantValue
Condition `removeMessageQueues == null` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
            removeMessageQueues = messageQueues.stream().filter(messageQueue -> topic.equals(messageQueue.getTopic()) && !queues.contains(messageQueue)).collect(Collectors.toSet());
        }
        if (removeMessageQueues == null || removeMessageQueues.isEmpty()) {
            return;
        }
```

### ConstantValue
Condition `runnable instanceof WorkerDirectTask` is always `false`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            } else if (runnable instanceof WorkerSinkTask) {
                taskConfig = ((WorkerSinkTask) runnable).currentTaskConfig();
            } else if (runnable instanceof WorkerDirectTask) {
                taskConfig = ((WorkerDirectTask) runnable).currentTaskConfig();
            }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
            records.add(record);
            /**prepare to send record*/
            positions.add(prepareToSendRecord(preTransformRecord).get());

        }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
            sinktotalTimes = 1L;
        }
        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tsourceTaskTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tsinTaskTimesTotal: " + sinktotalTimes + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        }
        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tsourceTaskTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tsinTaskTimesTotal: " + sinktotalTimes + "\r\n");
        sb.append("\tsourceTps: " + this.getSourceTaskTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        sb.append("\truntime: " + this.getFormatRuntime() + "\r\n");
        sb.append("\tsourceTaskTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tsinTaskTimesTotal: " + sinktotalTimes + "\r\n");
        sb.append("\tsourceTps: " + this.getSourceTaskTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getTotalTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        sb.append("\tsourceTaskTimesTotal: " + totalTimes + "\r\n");
        sb.append("\tsinTaskTimesTotal: " + sinktotalTimes + "\r\n");
        sb.append("\tsourceTps: " + this.getSourceTaskTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getTotalTps() + "\r\n");
        sb.append("\tsinkTps: " + this.getSinkTaskTps() + "\r\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        sb.append("\tsinTaskTimesTotal: " + sinktotalTimes + "\r\n");
        sb.append("\tsourceTps: " + this.getSourceTaskTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getTotalTps() + "\r\n");
        sb.append("\tsinkTps: " + this.getSinkTaskTps() + "\r\n");
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        sb.append("\tsourceTps: " + this.getSourceTaskTps() + "\r\n");
        sb.append("\tgetTotalTps: " + this.getTotalTps() + "\r\n");
        sb.append("\tsinkTps: " + this.getSinkTaskTps() + "\r\n");
        return sb.toString();
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedConnectors.java`
#### Snippet
```java

    private void showConnectorInfo(String result) {
        Map<String, JSONObject> connectMap = JSON.parseObject(result, Map.class);
        System.out.printf("%-25s %-15s %-17s %-25s%n", "connectorName", "status", "topic", "update-timestamp");
        for (Map.Entry<String, JSONObject> entry : connectMap.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
            return new ConnectKeyValue();
        }
        Map<String, String> map = JSON.parseObject(json, Map.class);
        ConnectKeyValue keyValue = new ConnectKeyValue();
        for (String key : map.keySet()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedTasks.java`
#### Snippet
```java

    private void showTaskInfo(String result) {
        Map<String, List<JSONObject>> taskMap = JSON.parseObject(result, Map.class);
        System.out.printf("%-22s %-22s %-12s %-15s %-20s %-30s%n", "taskName", "connectorName", "status", "topic", "update-timestamp", "taskId");
        for (Map.Entry<String, List<JSONObject>> entry : taskMap.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/BaseTransformation.java`
#### Snippet
```java
        if (input instanceof Map) {
            log.trace("process() - Processing as map");
            result = processMap(record, (Map<String, Object>) input);
            return result;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/BaseTransformation.java`
#### Snippet
```java
            result = processFloat64(record, inputSchema, (double) input);
        } else if (FieldType.ARRAY == schemaType) {
            result = processArray(record, inputSchema, (List<Object>) input);
        } else if (FieldType.MAP == schemaType) {
            result = processMap(record, inputSchema, (Map<Object, Object>) input);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/BaseTransformation.java`
#### Snippet
```java
            result = processArray(record, inputSchema, (List<Object>) input);
        } else if (FieldType.MAP == schemaType) {
            result = processMap(record, inputSchema, (Map<Object, Object>) input);
        } else {
            throw new UnsupportedOperationException(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>' to 'java.util.Map'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                if (positionInfo != null && null != positionInfo.getOffset()) {
                    log.info("positionInfo is not null!");
                    Map<String, ?> offset = (Map<String, String>) positionInfo.getOffset();
                    Object lastRecordedOffset = offset.get(NEXT_POSITION);
                    if (lastRecordedOffset != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternRenameConfig.java`
#### Snippet
```java
        ExtendKeyValue extendConfig = new ExtendKeyValue(config);
        final String pattern = extendConfig.getString(FIELD_PATTERN_CONF);
        final List<String> flagList = extendConfig.getList(FIELD_PATTERN_FLAGS_CONF);
        int patternFlags = 0;
        for (final String f : flagList) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilterConfig.java`
#### Snippet
```java
            throw new ConnectException(String.format("Could not compile regex '%s'.", pattern));
        }
        List<String> fields = extendKeyValue.getList(FIELD_CONFIG);
        this.fields = new HashSet<>(fields);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>' to 'java.util.Map'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/RegexRouter.java`
#### Snippet
```java
    @Override
    public R doTransform(R record) {
        Map<String, Object> partitionMap = (Map<String, Object>) record.getPosition().getPartition().getPartition();
        if (null == partitionMap || !partitionMap.containsKey(TOPIC)) {
            LOG.warn("PartitionMap get topic is null , lack of topic config");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map,io.openmessaging.connector.api.data.FieldType\>'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/SchemaHelper.java`
#### Snippet
```java

    static {
        Map<Class<?>, FieldType> primitives = new HashMap();
        primitives.put(String.class, FieldType.STRING);
        primitives.put(Boolean.class, FieldType.BOOLEAN);
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.lang.Iterable'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
        List configs = getList(s);
        List<T> castConfigs = new ArrayList<>();
        configs.forEach(config -> {
            castConfigs.add(clazz.cast(config));
        });
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.avro.io.DatumWriter\>' to 'org.apache.avro.io.DatumWriter'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumWriterFactory.java`
#### Snippet
```java

        DatumWriter<Object> writer;
        writer = datumWriterCache.computeIfAbsent(rawSchema, v -> (DatumWriter<Object>) getDatumWriter(value, rawSchema));
        writer.write(value, encoder);
        encoder.flush();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
            return writerSchema;
        }
        Class<SpecificRecord> readerClass = SpecificData.get().getClass(writerSchema);
        if (readerClass == null) {
            throw new SerializationException("Could not find class "
```

### UNCHECKED_WARNING
Unchecked call to 'unprocessedProperties(Map)' as a member of raw type 'org.everit.json.schema.Schema.Builder'
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
                    combinedBuilder.criterion(CombinedSchema.ONE_CRITERION);
                    combinedBuilder.subschema(NullSchema.INSTANCE);
                    combinedBuilder.subschema(builder.unprocessedProperties(unprocessedProps).build());
                    if (index != null) {
                        combinedBuilder.unprocessedProperties(Collections.singletonMap(CONNECT_INDEX_PROP,
```

### UNCHECKED_WARNING
Unchecked call to 'unprocessedProperties(Map)' as a member of raw type 'org.everit.json.schema.Schema.Builder'
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
            unprocessedProps.put(CONNECT_INDEX_PROP, index);
        }
        return builder.unprocessedProperties(unprocessedProps).build();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
            builder.doc(description);
        }
        Map<String, String> parameters = (Map<String, String>) jsonSchema.getUnprocessedProperties()
                .get(CONNECT_PARAMETERS_PROP);
        if (parameters != null) {
            builder.parameters(parameters);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
    public void decode(String jsonString) {
        Map<K, V> resultMap = new HashMap<>();
        Map<String, String> map = JSON.parseObject(jsonString, Map.class);
        for (String key : map.keySet()) {
            K decodeKey = (K) serdeKey.deserializer().deserialize("", Base64Util.base64Decode(key));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'. Reason: 'serdeKey.deserializer()' has raw type, so result of deserialize is erased
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
        Map<String, String> map = JSON.parseObject(jsonString, Map.class);
        for (String key : map.keySet()) {
            K decodeKey = (K) serdeKey.deserializer().deserialize("", Base64Util.base64Decode(key));
            V decodeValue = (V) serdeValue.deserializer().deserialize("", Base64Util.base64Decode(map.get(key)));
            resultMap.put(decodeKey, decodeValue);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'. Reason: 'serdeValue.deserializer()' has raw type, so result of deserialize is erased
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
        for (String key : map.keySet()) {
            K decodeKey = (K) serdeKey.deserializer().deserialize("", Base64Util.base64Decode(key));
            V decodeValue = (V) serdeValue.deserializer().deserialize("", Base64Util.base64Decode(map.get(key)));
            resultMap.put(decodeKey, decodeValue);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'serialize(String, T)' as a member of raw type 'org.apache.rocketmq.connect.runtime.serialization.Serializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        for (K key : data.keySet()) {
            byte[] keyByte = serdeKey.serializer().serialize("", key);
            byte[] valueByte = serdeValue.serializer().serialize("", data.get(key));
            map.put(Base64Util.base64Encode(keyByte), Base64Util.base64Encode(valueByte));
```

### UNCHECKED_WARNING
Unchecked call to 'serialize(String, T)' as a member of raw type 'org.apache.rocketmq.connect.runtime.serialization.Serializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
        for (K key : data.keySet()) {
            byte[] keyByte = serdeKey.serializer().serialize("", key);
            byte[] valueByte = serdeValue.serializer().serialize("", data.get(key));
            map.put(Base64Util.base64Encode(keyByte), Base64Util.base64Encode(valueByte));
        }
```

### UNCHECKED_WARNING
Unchecked call to 'onCompletion(Throwable, K, V)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizerCallback'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
                // rollback
                cancelFlush();
                this.callback.onCompletion(throwable, null, null);
            }
            return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
            return new ConnectKeyValue();
        }
        Map<String, String> map = JSON.parseObject(json, Map.class);
        ConnectKeyValue keyValue = new ConnectKeyValue();
        for (String key : map.keySet()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
        JSONObject jsonObject = JSON.parseObject(json, JSONObject.class);

        Map<String, String> connectorConfigs = (Map<String, String>) jsonObject.getObject("connector", Map.class);
        Map<String, String> taskConfigs = (Map<String, String>) jsonObject.getObject("task", Map.class);

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java

        Map<String, String> connectorConfigs = (Map<String, String>) jsonObject.getObject("connector", Map.class);
        Map<String, String> taskConfigs = (Map<String, String>) jsonObject.getObject("task", Map.class);

        Map<String, ConnectKeyValue> transferedConnectorConfigs = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
            return resultList;
        }
        List<Map<String, String>> list = JSON.parseObject(json, List.class);
        for (Map<String, String> map : list) {
            ConnectKeyValue keyValue = new ConnectKeyValue();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            return null;
        }
        Map<String, ?> offsetMap = (Map<String, String>) recordOffset.getOffset();
        Object offsetObject = offsetMap.get(QUEUE_OFFSET);
        if (null == offsetObject) {
```

### UNCHECKED_WARNING
Unchecked call to 'onCompletion(Throwable, V)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.Callback'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                public void onSuccess(org.apache.rocketmq.client.producer.SendResult result) {
                    log.info("Send async message OK, msgId: {},topic:{}", result.getMsgId(), topicName);
                    callback.onCompletion(null, value);
                }

```

### UNCHECKED_WARNING
Unchecked call to 'serialize(String, T)' as a member of raw type 'org.apache.rocketmq.connect.runtime.serialization.Serializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java

    private Map.Entry<byte[], byte[]> encode(K key, V value) {
        byte[] keySer = keySerde.serializer().serialize(topicName, key);
        byte[] valueSer = valueSerde.serializer().serialize(topicName, value);
        return new Map.Entry<byte[], byte[]>() {
```

### UNCHECKED_WARNING
Unchecked call to 'serialize(String, T)' as a member of raw type 'org.apache.rocketmq.connect.runtime.serialization.Serializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Map.Entry<byte[], byte[]> encode(K key, V value) {
        byte[] keySer = keySerde.serializer().serialize(topicName, key);
        byte[] valueSer = valueSerde.serializer().serialize(topicName, value);
        return new Map.Entry<byte[], byte[]>() {
            @Override
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'. Reason: 'keySerde.deserializer()' has raw type, so result of deserialize is erased
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java

    private Map.Entry<K, V> decode(byte[] key, byte[] value) {
        K deKey = (K) keySerde.deserializer().deserialize(topicName, key);
        V deValue = (V) valueSerde.deserializer().deserialize(topicName, value);
        return new Map.Entry<K, V>() {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'. Reason: 'valueSerde.deserializer()' has raw type, so result of deserialize is erased
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Map.Entry<K, V> decode(byte[] key, byte[] value) {
        K deKey = (K) keySerde.deserializer().deserialize(topicName, key);
        V deValue = (V) valueSerde.deserializer().deserialize(topicName, value);
        return new Map.Entry<K, V>() {
            @Override
```

### UNCHECKED_WARNING
Unchecked call to 'BrokerBasedLog(WorkerConfig, String, String, DataSynchronizerCallback, Serde, Serde, boolean)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.BrokerBasedLog'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalPositionManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public DataSynchronizer initializationDataSynchronizer(WorkerConfig workerConfig) {
        return new BrokerBasedLog(
            workerConfig,
            super.topic,
```

### UNCHECKED_WARNING
Unchecked call to 'BrokerBasedLog(WorkerConfig, String, String, DataSynchronizerCallback, Serde, Serde, boolean)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.BrokerBasedLog'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public DataSynchronizer initializationDataSynchronizer(WorkerConfig config) {
        return new BrokerBasedLog(config,
            statusTopic,
            ConnectUtil.createGroupName(statusManagePrefix, config.getWorkerId()),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
                return;
            }
            List<Object> deKey = (List<Object>) schemaAndValueKey.value();
            if (deKey.isEmpty() || deKey.size() != 3) {
                log.error("The format of the monitored offset change data is wrong and will be discarded , message {}", deKey);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        // partition
        String namespace = (String) deKey.get(1);
        Map<String, Object> partitions = (Map<String, Object>) deKey.get(2);
        ExtendRecordPartition partition = new ExtendRecordPartition(namespace, partitions);
        // offset
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        // offset
        SchemaAndValue schemaAndValueValue = valueConverter.toConnectData(topic, result.array());
        Map<String, Object> offset = (Map<String, Object>) schemaAndValueValue.value();
        mergeOffset(partition, new RecordOffset(offset));
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer' to 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        this.commitStarted = -1;
        this.config = workerConfig;
        this.dataSynchronizer = initializationDataSynchronizer(workerConfig);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'BrokerBasedLog(WorkerConfig, String, String, DataSynchronizerCallback, Serde, Serde, boolean)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.BrokerBasedLog'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqPositionManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public DataSynchronizer initializationDataSynchronizer(WorkerConfig workerConfig) {
        return new BrokerBasedLog(
            workerConfig,
            this.topic,
```

### UNCHECKED_WARNING
Unchecked call to 'BrokerBasedLog(WorkerConfig, String, String, DataSynchronizerCallback, Serde, Serde, boolean)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.BrokerBasedLog'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqStateManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public DataSynchronizer initializationDataSynchronizer(WorkerConfig config) {
        return new BrokerBasedLog(config,
            statusTopic,
            ConnectUtil.createGroupName(statusManagePrefix, config.getWorkerId()),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/NumberConverter.java`
#### Snippet
```java

    protected T cast(Object value) {
        return (T) value;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer' to 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        this.converter.configure(new HashMap<>());
        this.statusTopic = config.getConnectStatusTopic();
        this.dataSynchronizer = initializationDataSynchronizer(config);

        new BrokerBasedLog(config,
```

### UNCHECKED_WARNING
Unchecked call to 'BrokerBasedLog(WorkerConfig, String, String, DataSynchronizerCallback, Serde, Serde, boolean)' as a member of raw type 'org.apache.rocketmq.connect.runtime.utils.datasync.BrokerBasedLog'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        this.dataSynchronizer = initializationDataSynchronizer(config);

        new BrokerBasedLog(config,
            this.statusTopic,
            ConnectUtil.createGroupName(statusManagePrefix, config.getWorkerId()),
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'connector' has raw type, so result of taskConfigs is erased
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        // load connector
        Connector connector = loadConnector(configs);
        List<KeyValue> taskConfigs = connector.taskConfigs(maxTask);
        if (CollectionUtils.isEmpty(taskConfigs)) {
            throw new ConfigException("The connector  " + connectorName + " taskConfigs is empty, Please check configuration");
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer' to 'org.apache.rocketmq.connect.runtime.utils.datasync.DataSynchronizer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        this.plugin = plugin;
        this.connectorConfigUpdateListener = new HashSet<>();
        this.dataSynchronizer = initializationDataSynchronizer(workerConfig);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        newConfig.setEpoch((Long) epoch);
        newConfig.setTargetState(TargetState.valueOf((String) targetState));
        newConfig.setProperties((Map<String, String>) props);

        // not exist
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
        try {
            String json = new String(data, "UTF-8");
            List list = JSONArray.parseArray(json, clazz);
            return list;
        } catch (UnsupportedEncodingException e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/Plugin.java`
#### Snippet
```java
        Class<?> klass = Utils.getClass(config, propertyName);
        if (pluginClass.isAssignableFrom(klass)) {
            return (Class<? extends U>) klass;
        }
        throw new ConnectException(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/Plugin.java`
#### Snippet
```java
        Class<?> klass = loader.loadClass(classOrAlias, false);
        if (pluginClass.isAssignableFrom(klass)) {
            return (Class<? extends U>) klass;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.connect.runtime.serialization.JsonSerializer' to 'org.apache.rocketmq.connect.runtime.serialization.Serializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/JsonSerde.java`
#### Snippet
```java
public class JsonSerde extends WrapperSerde<Object> {
    public JsonSerde() {
        super(new JsonSerializer(), new JsonDeserializer());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    static public <T> Serde<T> serdeFrom(Class<T> type) {
        if (String.class.isAssignableFrom(type)) {
            return (Serde<T>) String();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (Short.class.isAssignableFrom(type)) {
            return (Serde<T>) Short();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (Integer.class.isAssignableFrom(type)) {
            return (Serde<T>) Integer();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (Long.class.isAssignableFrom(type)) {
            return (Serde<T>) Long();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (Float.class.isAssignableFrom(type)) {
            return (Serde<T>) Float();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (Double.class.isAssignableFrom(type)) {
            return (Serde<T>) Double();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (byte[].class.isAssignableFrom(type)) {
            return (Serde<T>) ByteArray();
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.rocketmq.connect.runtime.serialization.Serde' to 'org.apache.rocketmq.connect.runtime.serialization.Serde'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java

        if (ByteBuffer.class.isAssignableFrom(type)) {
            return (Serde<T>) ByteBuffer();
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/JsonDeserializer.java`
#### Snippet
```java
                data = JSON.parse(json);
            } else {
                data = JSON.parseObject(json, aClass);
            }
            return data;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapDeserializer.java`
#### Snippet
```java
        try {
            String rawString = new String(data, "UTF-8");
            Map<String, String> map = JSON.parseObject(rawString, Map.class);
            for (String key : map.keySet()) {
                ExtendRecordPartition recordPartition = JSON.parseObject(key, ExtendRecordPartition.class);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            }
            Iterator<Map.Entry<String, Object>> paramIt =
                    ((Map<String, Object>) parameters).entrySet().iterator();
            while (paramIt.hasNext()) {
                Map.Entry<String, Object> field = paramIt.next();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        );
                    }
                    Collection<Object> original = (Collection<Object>) arrayVal;
                    List<Object> result = new ArrayList<>(original.size());
                    for (Object elem : original) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        );
                    }
                    Collection<IndexedRecord> original = (Collection<IndexedRecord>) mapVal;
                    Map<Object, Object> result = new HashMap<>(original.size());
                    for (IndexedRecord entry : original) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                case ARRAY: {
                    Schema valueSchema = schema.getValueSchema();
                    Collection<Object> original = (Collection<Object>) value;
                    List<Object> result = new ArrayList<>(original.size());
                    for (Object elem : original) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    if (keySchema != null && keySchema.getFieldType() == FieldType.STRING && !keySchema.isOptional()) {
                        // Non-optional string keys
                        Map<CharSequence, Object> original = (Map<CharSequence, Object>) value;
                        Map<CharSequence, Object> result = new HashMap<>(original.size());
                        for (Map.Entry<CharSequence, Object> entry : original.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    } else {
                        // Arbitrary keys
                        Collection<IndexedRecord> original = (Collection<IndexedRecord>) value;
                        Map<Object, Object> result = new HashMap<>(original.size());
                        for (IndexedRecord entry : original) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    } else if (value instanceof Map) {
                        // Default values from Avro are returned as Map
                        Map<CharSequence, Object> original = (Map<CharSequence, Object>) value;
                        Struct result = new Struct(schema);
                        for (Field field : schema.getFields()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                case ARRAY: {
                    ArrayNode array = JsonNodeFactory.instance.arrayNode();
                    for (Object elem : (Collection<Object>) defaultVal) {
                        array.add(defaultValueFromConnect(schema.getValueSchema(), elem));
                    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    if (schema.getKeySchema().getFieldType() == FieldType.STRING && !schema.getKeySchema().isOptional()) {
                        ObjectNode node = JsonNodeFactory.instance.objectNode();
                        for (Map.Entry<String, Object> entry : ((Map<String, Object>) defaultVal).entrySet()) {
                            JsonNode entryDef = defaultValueFromConnect(schema.getValueSchema(), entry.getValue());
                            node.put(entry.getKey(), entryDef);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    } else {
                        ArrayNode array = JsonNodeFactory.instance.arrayNode();
                        for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) defaultVal).entrySet()) {
                            JsonNode keyDefault = defaultValueFromConnect(schema.getKeySchema(), entry.getKey());
                            JsonNode valDefault = defaultValueFromConnect(schema.getValueSchema(), entry.getValue());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

                case ARRAY: {
                    Collection<Object> list = (Collection<Object>) value;
                    List<Object> converted = new ArrayList<>(list.size());
                    Schema elementSchema = schema != null ? schema.getValueSchema() : null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

                case MAP: {
                    Map<Object, Object> map = (Map<Object, Object>) value;
                    org.apache.avro.Schema underlyingAvroSchema;
                    if (schema != null
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.openmessaging.connector.api.component.Transform' to 'io.openmessaging.connector.api.component.Transform'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            return connectRecord;
        }
        for (final Transform<R> transform : transformList) {
            final R currentRecord = connectRecord;
            if (this.retryWithToleranceOperator == null) {
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            savedLoader = Plugin.compareAndSwapLoaders(loader);
            Class transformClazz = Utils.getContextCurrentClassLoader().loadClass(transformClass);
            final Transform transform = (Transform) transformClazz.getDeclaredConstructor().newInstance();
            return transform;
        } catch (Exception ex) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeSet' to 'java.util.Set\>'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java

    public Set<PluginWrapper<Connector>> connectors() {
        Set<PluginWrapper<Connector>> connectors = new TreeSet<>((Set) sinkConnectors);
        connectors.addAll((Set) sourceConnectors);
        return connectors;
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Collection)' as a member of raw type 'java.util.TreeSet'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java

    public Set<PluginWrapper<Connector>> connectors() {
        Set<PluginWrapper<Connector>> connectors = new TreeSet<>((Set) sinkConnectors);
        connectors.addAll((Set) sourceConnectors);
        return connectors;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection\>'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
    public Set<PluginWrapper<Connector>> connectors() {
        Set<PluginWrapper<Connector>> connectors = new TreeSet<>((Set) sinkConnectors);
        connectors.addAll((Set) sourceConnectors);
        return connectors;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection\>\>'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java

    private Collection<PluginWrapper<Transform<?>>> getTransformationPluginWrapper(ClassLoader loader, Reflections reflections) throws ReflectiveOperationException {
        return (Collection<PluginWrapper<Transform<?>>>) (Collection<?>) getPluginWrapper(reflections, Transform.class, loader);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            case JsonSchema.STRUCT_TYPE_NAME:
                builder = SchemaBuilder.struct();
                List<JSONObject> fields = (List<JSONObject>) jsonSchema.get(JsonSchema.STRUCT_FIELDS_FIELD_NAME);
                if (Objects.isNull(fields)) {
                    throw new ConnectException("Struct schema's \"fields\" argument is not an array.");
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                        Schema valueSchema = schema == null ? null : schema.getValueSchema();
                        Object fieldValue = convertToJson(valueSchema, elem);
                        list.add(fieldValue);
                    }
                    return list;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                        throw new ConnectException("Mismatching schema.");
                    }
                    JSONObject obj = new JSONObject(new LinkedHashMap());
                    for (Field field : struct.schema().getFields()) {
                        obj.put(field.getName(), convertToJson(field.getSchema(), struct.get(field)));
```

### UNCHECKED_WARNING
Unchecked call to 'serialize(String, T)' as a member of raw type 'org.apache.rocketmq.connect.runtime.serialization.JsonSerializer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        Object jsonValue = converterConfig.schemasEnabled() ? convertToJsonWithEnvelope(schema, value) : convertToJsonWithoutEnvelope(schema, value);
        try {
            return serializer.serialize(topic, jsonValue);
        } catch (Exception e) {
            throw new ConnectException("Converting Kafka Connect data to byte[] failed due to serialization error: ", e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                Map<Object, Object> result = new HashMap<>();
                if (schema == null || keySchema.getFieldType() == FieldType.STRING) {
                    Map<String, Object> fieldIt = (Map<String, Object>) value;
                    fieldIt.forEach((k, v) -> {
                        result.put(k, convertToConnect(valueSchema, v));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            public List<Object> convert(Schema schema, Object value) {
                Schema elemSchema = schema == null ? null : schema.getValueSchema();
                List<Object> values = (List<Object>) value;
                List<Object> result = new ArrayList<>();
                for (Object elem : values) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Future' to 'java.util.concurrent.Future'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        }

        Future<Void> flushFuture = positionStorageWriter.doFlush((error, key, result) -> {
            if (error != null) {
                log.error("{} Failed to flush offsets to storage: ", WorkerSourceTask.this, error);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        this.committableOffsets = RecordOffsetManagement.CommittableOffsets.EMPTY;
        this.sourceTaskMetricsGroup = new SourceTaskMetricsGroup(id, connectMetrics);
        this.topicCache = new HashSet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            Class taskClazz = Utils.getContextCurrentClassLoader().loadClass(taskClass).asSubclass(Task.class);
            // new task
            task = plugin.newTask(taskClazz);
        } catch (Exception ex) {
            throw new ConnectException("Create direct task failure", ex);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            foundTopicRouteInfo = false;
        }
        return foundTopicRouteInfo;
```

### DataFlowIssue
Casting `input` to `Map` will produce `ClassCastException` for any non-null value
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/BaseTransformation.java`
#### Snippet
```java
            result = processArray(record, inputSchema, (List<Object>) input);
        } else if (FieldType.MAP == schemaType) {
            result = processMap(record, inputSchema, (Map<Object, Object>) input);
        } else {
            throw new UnsupportedOperationException(
```

### DataFlowIssue
Unboxing of `queueId` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
            consumerRecord.setBody(value);
            consumerRecord.setBrokerName(brokerName);
            consumerRecord.setQueueId(queueId);
            consumerRecord.setQueueOffset(queueOffset);
        } else {
```

### DataFlowIssue
Unboxing of `queueOffset` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
            consumerRecord.setBrokerName(brokerName);
            consumerRecord.setQueueId(queueId);
            consumerRecord.setQueueOffset(queueOffset);
        } else {
            byte[] messageBody = JSON.toJSONString(record).getBytes();
```

### DataFlowIssue
Variable is already assigned to this value
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            if (e instanceof MQClientException) {
                if (((MQClientException) e).getResponseCode() == ResponseCode.TOPIC_NOT_EXIST) {
                    foundTopicRouteInfo = false;
                } else {
                    throw new RuntimeException("Get topic route info  failed", e);
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/NumberConverter.java`
#### Snippet
```java
            return serializer.serialize(topic, value == null ? null : cast(value));
        } catch (Exception e) {
            throw new io.openmessaging.connector.api.errors.ConnectException("Failed to serialize to " + typeName + " (was " + value.getClass() + "): ", e);
        }
    }
```

### DataFlowIssue
Method invocation `getKVMap` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        Map<String, Integer> connectorTaskCounts = new HashMap<>();
        Map<ConnectorTaskId, Map<String, String>> connectorTaskConfigs = new ConcurrentHashMap<>();
        taskKeyValueStore.getKVMap().forEach((connectorName, taskConfigs) -> {
            connectorTaskCounts.put(connectorName, taskConfigs.size());
            taskConfigs.forEach(taskConfig -> {
```

### DataFlowIssue
Dereference of `schemaType` may produce `NullPointerException`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

        try {
            switch (schemaType) {
                case INT8: {
                    Byte byteValue = (Byte) value;
```

### DataFlowIssue
Method invocation `getFieldType` may produce `NullPointerException`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                }
                default:
                    throw new ConnectException("Unknown schema type: " + schema.getFieldType());
            }
        } catch (ClassCastException e) {
```

### DataFlowIssue
Method invocation `getFieldType` may produce `NullPointerException`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            }
        } catch (ClassCastException e) {
            throw new ConnectException("Invalid type for " + schema.getFieldType() + ": " + value.getClass());
        }
    }
```

### DataFlowIssue
Method invocation `getPosition` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
        // Stop pulling if there is an uncommitted breakpoint
        while (canCommitHead(submittedPositions)) {
            offset = submittedPositions.poll().getPosition().getOffset();
        }
        return offset;
```

### DataFlowIssue
Method invocation `onFailure` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
            log.error("{} Error while shutting down connector", this, t);
            state = State.FAILED;
            statusListener.onFailure(connectorName, t);
        }
    }
```

### DataFlowIssue
The call to 'recordSendFailed' always fails, according to its method contracts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
            } catch (Exception e) {
                log.error("Send message MQClientException. message: {}, error info: {}.", sourceMessage, e);
                recordSendFailed(true, sourceMessage, preTransformRecord, e);
            }

```

### DataFlowIssue
Method invocation `id` will produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private void awaitStopTask(WorkerTask task, long timeout) {
        if (task == null) {
            log.warn("Ignoring await stop request for non-present task {}", task.id());
            return;
        }
```

### DataFlowIssue
Method invocation `cancel` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                sourceTaskOffsetCommitter.ifPresent(commiter -> commiter.remove(workerTask.id()));
                workerTask.cleanup();
                future.cancel(true);
                taskToFutureMap.remove(runnable);
                errorTasks.remove(runnable);
```

### DataFlowIssue
Method invocation `cancel` may produce `NullPointerException`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                sourceTaskOffsetCommitter.ifPresent(commiter -> commiter.remove(workerTask.id()));
                workerTask.cleanup();
                future.cancel(true);
                taskToFutureMap.remove(runnable);
                stoppedTasks.remove(runnable);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java
            reporters.iterator().next().report(this);
        }
        reporters.stream().forEach(r -> r.report(this));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            return;
        }
        transformList.stream().forEach(transformStr -> {
            String transformClassKey = PREFIX + transformStr + ".class";
            String transformClass = config.getString(transformClassKey);
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                    }
                    JSONArray array = (JSONArray) value;
                    for (Object entry : array.stream().toArray()) {
                        if (!(value instanceof JSONArray)) {
                            throw new ConnectException("Found invalid map entry instead of array tuple: " + JSON.toJSONString(entry));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
    private static SubCommand findSubCommand(final String name) {
        for (SubCommand cmd : subCommandList) {
            if (cmd.commandName().toUpperCase().equals(name.toUpperCase())) {
                return cmd;
            }
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
            context.json(new HttpResponse<>(context.status(), "Connector [" + connectorName + "] resumed successfully"));
        } catch (Exception ex) {
            log.error("Resume connector failed {} , {}.", connectorName, ex);
            context.json(new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage()));
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
            context.json(new HttpResponse<>(context.status(), "Connector [" + connectorName + "] paused successfully"));
        } catch (Exception ex) {
            log.error("Pause connector failed {} , {}.", connectorName, ex);
            context.json(new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage()));
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
            context.json(new HttpResponse<>(context.status(), connectors + " connectors are deleted"));
        } catch (Exception ex) {
            log.error("Delete all connector failed {} , {}.", connectors, ex);
            context.json(new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage()));
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
            context.json(new HttpResponse<>(context.status(), conns.size() + " connectors are suspended"));
        } catch (Exception ex) {
            log.error("Pause all connector failed {} , {}.", conns, ex);
            context.json(new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage()));
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
            context.json(new HttpResponse<>(context.status(), conns.size() + " connectors are resumed"));
        } catch (Exception ex) {
            log.error("Pause all connector failed {} , {}.", conns, ex);
            context.json(new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR_500, ex.getMessage()));
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
            });
        } catch (MQClientException e) {
            log.error("Send message MQClientException. message: {}, error info: {}.", producerRecord, e);
        } catch (RemotingException e) {
            log.error("Send message RemotingException. message: {}, error info: {}.", producerRecord, e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
            log.error("Send message MQClientException. message: {}, error info: {}.", producerRecord, e);
        } catch (RemotingException e) {
            log.error("Send message RemotingException. message: {}, error info: {}.", producerRecord, e);
        } catch (InterruptedException e) {
            log.error("Send message InterruptedException. message: {}, error info: {}.", producerRecord, e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
            log.error("Send message RemotingException. message: {}, error info: {}.", producerRecord, e);
        } catch (InterruptedException e) {
            log.error("Send message InterruptedException. message: {}, error info: {}.", producerRecord, e);
            throw new ConnectException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                public void onException(Throwable throwable) {
                    if (null != throwable) {
                        log.error("Send async message Failed, error: {}", throwable);
                        // Keep sending until success
                        send(key, value, callback);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                public void onException(Throwable throwable) {
                    if (null != throwable) {
                        log.error("Send async message Failed, error: {}", throwable);
                        // Keep sending until success
                        send(key, value);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                dataSynchronizerCallback.onCompletion(null, entry.getKey(), entry.getValue());
            } catch (Exception e) {
                log.error("Decode message data error. message: {}, error info: {}", message, e);
            }
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                log.error("NotifyConsumerIdsChanged for connect exception", RemotingHelper.exceptionSimpleDesc(e));
            }
            return null;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java
            public void onCompletion(Throwable error, Void key, Void result) {
                if (error != null) {
                    log.error("Failed to persist positions to storage: {}", error);
                } else {
                    log.trace("Successed to persist positions to storage: {}", partitions);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java
            public void onCompletion(Throwable error, Void key, Void result) {
                if (error != null) {
                    log.error("Failed to persist positions to storage: {}", error);
                } else {
                    log.trace("Successed to persist positions to storage: {} ", positions);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java
            public void onCompletion(Throwable error, Void key, Void result) {
                if (error != null) {
                    log.error("Failed to persist positions to storage: {}", error);
                } else {
                    log.trace("Successes to persist positions to storage: {} , {} ", partition, position);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
                submittedPosition.remove();
            });
            log.error("Send message error, error info: {}.", e);
        }
    }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (3)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        for (Map.Entry<RecordPartition, RecordOffset> entry : offsets.entrySet()) {
            if (null == entry || null == entry.getKey() || null == entry.getKey().getPartition() || null == entry.getValue() || null == entry.getValue().getOffset()) {
                log.warn("recordPartition {} info is null or recordOffset {} info is null, entry {}", entry);
                continue;
            }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
                return false;
            } catch (InterruptedException e) {
                log.error("Send message InterruptedException. message: {}, error info: {}.", sourceMessage, e);
                // throw e and stop task
                throw e;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
                throw e;
            } catch (Exception e) {
                log.error("Send message MQClientException. message: {}, error info: {}.", sourceMessage, e);
                recordSendFailed(true, sourceMessage, preTransformRecord, e);
            }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
        } catch (Throwable t) {
            if (closing) {
                log.warn(" {} Offset commit failed {}", this);
            } else {
                log.error("{} Offset commit failed, reset to last committed offsets", this, t);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
            }
        } catch (RetriableException e) {
            log.error("task {} put sink recode RetriableException", this, e.getMessage(), e);
            // pause all consumer wait for put data
            pausedForRetry = true;
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
            throw e;
        } catch (Throwable t) {
            log.error("task {} put sink recode Throwable", this, t.getMessage(), t);
            throw t;
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (at least 1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                    Plugin.compareAndSwapLoaders(savedLoader);
                } catch (Exception e) {
                    log.error("start worker task exception. config {}" + JSON.toJSONString(keyValue), e);
                    Plugin.compareAndSwapLoaders(savedLoader);
                }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                }
            } catch (ExecutionException e) {
                log.error("Execution exception , {}", e);
            } catch (CancellationException | TimeoutException | InterruptedException e) {
                log.error("error, {}", e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                log.error("Execution exception , {}", e);
            } catch (CancellationException | TimeoutException | InterruptedException e) {
                log.error("error, {}", e);
            } finally {
                // remove committer offset
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        result.put("sourceTaskTimesTotal", String.valueOf(totalTimes));
        result.put("sinkTaskTimesTotal", String.valueOf(sinktotalTimes));
        result.put("sourceTaskTps", String.valueOf(this.getSourceTaskTps()));
        result.put("sinkTaskTps", String.valueOf(this.getSinkTaskTps()));
        return result;
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        result.put("sinkTaskTimesTotal", String.valueOf(sinktotalTimes));
        result.put("sourceTaskTps", String.valueOf(this.getSourceTaskTps()));
        result.put("sinkTaskTps", String.valueOf(this.getSinkTaskTps()));
        return result;
    }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
        @Override
        public RemotingCommand processRequest(ChannelHandlerContext ctx, RemotingCommand request) throws Exception {
            switch (request.getCode()) {
                case RequestCode.NOTIFY_CONSUMER_IDS_CHANGED:
                    return this.workerChanged(ctx, request);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java

    protected void process(ByteBuffer result, List<Object> deKey, PositionChange key) {
        switch (key) {
            case POSITION_CHANG:
                processPositionChange(result, deKey);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java
            ClusterInfo clusterInfo = defaultMQAdminExt.examineBrokerClusterInfo();
            HashMap<String, Set<String>> clusterAddrTable = clusterInfo.getClusterAddrTable();
            Set<String> clusterNameSet = clusterAddrTable.keySet();
            for (String clusterName : clusterNameSet) {
                Set<String> masterSet = CommandUtil.fetchMasterAddrByClusterName(defaultMQAdminExt, clusterName);
                for (String addr : masterSet) {
                    defaultMQAdminExt.createAndUpdateTopicConfig(addr, topicConfig);
                }
            }
```

### DuplicatedCode
Duplicated code
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java
            SubscriptionGroupConfig initConfig = new SubscriptionGroupConfig();
            initConfig.setGroupName(subGroup);
            ClusterInfo clusterInfo = defaultMQAdminExt.examineBrokerClusterInfo();
            HashMap<String, Set<String>> clusterAddrTable = clusterInfo.getClusterAddrTable();
            Set<String> clusterNameSet = clusterAddrTable.keySet();
            for (String clusterName : clusterNameSet) {
                Set<String> masterSet = CommandUtil.fetchMasterAddrByClusterName(defaultMQAdminExt, clusterName);
                for (String addr : masterSet) {
                    defaultMQAdminExt.createAndUpdateSubscriptionGroupConfig(addr, initConfig);
                }
            }
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
        if (file.exists()) {
            byte[] data = new byte[(int) file.length()];
            boolean result;

            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
                int len = inputStream.read(data);
                result = len == data.length;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }

            if (result) {
                return new String(data);
            }
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
        if (null == json) {
            return new ConnectKeyValue();
        }
        Map<String, String> map = JSON.parseObject(json, Map.class);
        ConnectKeyValue keyValue = new ConnectKeyValue();
        for (String key : map.keySet()) {
            keyValue.put(key, map.get(key));
        }
        return keyValue;
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileUtils.java`
#### Snippet
```java
                            if (cn.equals("int") || cn.equals("Integer")) {
                                arg = Integer.parseInt(property);
                            } else if (cn.equals("long") || cn.equals("Long")) {
                                arg = Long.parseLong(property);
                            } else if (cn.equals("double") || cn.equals("Double")) {
                                arg = Double.parseDouble(property);
                            } else if (cn.equals("boolean") || cn.equals("Boolean")) {
                                arg = Boolean.parseBoolean(property);
                            } else if (cn.equals("float") || cn.equals("Float")) {
                                arg = Float.parseFloat(property);
                            } else if (cn.equals("String")) {
                                arg = property;
                            } else {
                                continue;
                            }
                            method.invoke(object, arg);
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServerUtil.java`
#### Snippet
```java
        HelpFormatter hf = new HelpFormatter();
        hf.setWidth(110);
        CommandLine commandLine = null;
        try {
            commandLine = parser.parse(options, args);
            if (commandLine.hasOption('h')) {
                hf.printHelp(appName, options, true);
                return null;
            }
        } catch (ParseException e) {
            hf.printHelp(appName, options, true);
        }

        return commandLine;
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServerUtil.java`
#### Snippet
```java
        Properties properties = new Properties();
        Option[] opts = commandLine.getOptions();

        if (opts != null) {
            for (Option opt : opts) {
                String name = opt.getLongOpt();
                String value = commandLine.getOptionValue(name);
                if (value != null) {
                    properties.setProperty(name, value);
                }
            }
        }

        return properties;
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
if (commandLine.hasOption('c')) {
                String file = commandLine.getOptionValue('c').trim();
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
                    properties = new Properties();
                    properties.load(in);
                    FileAndPropertyUtil.properties2Object(properties, config);
                    in.close();
                }
            }

            if (StringUtils.isNotEmpty(config.getMetricsConfigPath())) {
                String file = config.getMetricsConfigPath();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                properties = new Properties();
                properties.load(in);
                Map<String, String> metricsConfig = new ConcurrentHashMap<>();
                if (properties.contains(WorkerConfig.METRIC_CLASS)) {
                    throw new IllegalArgumentException("[metrics.reporter] is empty");
                }
                for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                    if (entry.getKey().equals(WorkerConfig.METRIC_CLASS)) {
                        continue;
                    }
                    metricsConfig.put(entry.getKey().toString(), entry.getValue().toString());
                }
                config.getMetricsConfig().put(properties.getProperty(WorkerConfig.METRIC_CLASS), metricsConfig);
                in.close();
            }

            if (null == config.getConnectHome()) {
                System.out.printf("Please set the %s variable in your environment to match the location of the Connect installation", WorkerConfig.CONNECT_HOME_ENV);
                System.exit(-2);
            }

            LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(lc);
            lc.reset();
            configurator.doConfigure(config.getConnectHome() + "/conf/logback.xml");

            List<String> pluginPaths = new ArrayList<>(16);
            if (StringUtils.isNotEmpty(config.getPluginPaths())) {
                String[] strArr = config.getPluginPaths().split(",");
                for (String path : strArr) {
                    if (StringUtils.isNotEmpty(path)) {
                        pluginPaths.add(path);
                    }
                }
            }
            Plugin plugin = new Plugin(pluginPaths);
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

                @Override
                public void run() {
                    synchronized (this) {
                        log.info("Shutdown hook was invoked, {}", this.shutdownTimes.incrementAndGet());
                        if (!this.hasShutdown) {
                            this.hasShutdown = true;
                            long beginTime = System.currentTimeMillis();
                            controller.shutdown();
                            long consumingTimeTotal = System.currentTimeMillis() - beginTime;
                            log.info("Shutdown hook over, consuming total time(ms): {}", consumingTimeTotal);
                        }
                    }
                }
            }, "ShutdownHook"));
            return controller;
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
            String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
                continue;
            }
            MessageQueue messageQueue = new MessageQueue(topic, brokerName, queueId);
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
        if (recordPartitions == null || recordPartitions.size() == 0) {
            log.warn("recordPartitions is null or recordPartitions.size() is zero. recordPartitions {}", JSON.toJSONString(recordPartitions));
            return;
        }
        Set<MessageQueue> queues = new HashSet<>();
        for (RecordPartition recordPartition : recordPartitions) {
            if (null == recordPartition || null == recordPartition.getPartition()) {
                log.warn("recordPartition {} info is null", recordPartition);
                continue;
            }
            String brokerName = (String) recordPartition.getPartition().get(BROKER_NAME);
            String topic = (String) recordPartition.getPartition().get(TOPIC);
            Integer queueId = Integer.valueOf((String) recordPartition.getPartition().get(QUEUE_ID));
            if (StringUtils.isEmpty(brokerName) || StringUtils.isEmpty(topic) || null == queueId) {
                log.warn("brokerName is null or queueId is null or queueName is null, brokerName {}, queueId {} queueId {}", brokerName, queueId, topic);
                continue;
            }
            MessageQueue messageQueue = new MessageQueue(topic, brokerName, queueId);
            queues.add(messageQueue);
        }
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            final FieldType schemaType;
            if (schema == null) {
                schemaType = Schema.schemaType(value.getClass());
                if (schemaType == null) {
                    throw new ConnectException("Java class " + value.getClass() + " does not have corresponding schema type.");
                }
            } else {
                schemaType = schema.getFieldType();
            }
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        for (String requireConfig : ConnectorConfig.REQUEST_CONFIG) {
            if (!configs.containsKey(requireConfig)) {
                throw new ConnectException("Request config key: " + requireConfig);
            }
        }
        // check exist
        ConnectKeyValue oldConfig = connectorKeyValueStore.get(connectorName);
        if (configs.equals(oldConfig)) {
            throw new ConnectException("Connector with same config already exist.");
        }

        // validate config
        Connector connector = plugin.newConnector(configs.getString(CONNECTOR_CLASS));
        if (connector instanceof SourceConnector) {
            new SourceConnectorConfig(configs).validate();
        } else if (connector instanceof SinkConnector) {
            new SinkConnectorConfig(configs).validate();
        }
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
            Struct struct = (Struct) schemaAndValue.value();
            TaskStatus.State state = TaskStatus.State.valueOf((String) struct.get(STATE_KEY_NAME));
            String trace = (String) struct.get(TRACE_KEY_NAME);
            String workerUrl = (String) struct.get(WORKER_ID_KEY_NAME);
            Long generation = (Long) struct.get(GENERATION_KEY_NAME);
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsManager.java`
#### Snippet
```java
this.statsTable.put(SOURCE_RECORD_WRITE_NUMS, new StatsItemSet(SOURCE_RECORD_WRITE_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_WRITE_TOTAL_NUMS, new StatsItemSet(SOURCE_RECORD_WRITE_TOTAL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_WRITE_FAIL_NUMS, new StatsItemSet(SOURCE_RECORD_WRITE_FAIL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_WRITE_TOTAL_FAIL_NUMS, new StatsItemSet(SOURCE_RECORD_WRITE_TOTAL_FAIL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_POLL_NUMS, new StatsItemSet(SOURCE_RECORD_POLL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_POLL_TOTAL_NUMS, new StatsItemSet(SOURCE_RECORD_POLL_TOTAL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_POLL_FAIL_NUMS, new StatsItemSet(SOURCE_RECORD_POLL_FAIL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SOURCE_RECORD_POLL_FAIL_TOTAL_NUMS, new StatsItemSet(SOURCE_RECORD_POLL_FAIL_TOTAL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SINK_RECORD_READ_NUMS, new StatsItemSet(SINK_RECORD_READ_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SINK_RECORD_READ_TOTAL_NUMS, new StatsItemSet(SINK_RECORD_READ_TOTAL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SINK_RECORD_READ_FAIL_NUMS, new StatsItemSet(SINK_RECORD_READ_FAIL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SINK_RECORD_READ_TOTAL_FAIL_NUMS, new StatsItemSet(SINK_RECORD_READ_TOTAL_FAIL_NUMS, this.scheduledExecutorService, log));
        this.statsTable.put(SINK_RECORD_PUT_NUMS, new StatsItemSet(SINK_RECORD_PUT_NUMS, this.scheduledExecutorService, log));
```

### DuplicatedCode
Duplicated code
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
        if (StringUtils.isBlank(taskId)) {
            return null;
        }
        AtomicLong rs = sourceTaskTimesTotal.get(taskId);
        if (null == rs) {
            rs = new AtomicLong(0);
            AtomicLong previous = sourceTaskTimesTotal.putIfAbsent(taskId, rs);
            if (previous != null) {
                rs = previous;
            }
        }
        return rs;
```

### DuplicatedCode
Duplicated code
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/ChangeCase.java`
#### Snippet
```java
            final SchemaAndValue transformed = process(r, r.getKeySchema(), r.getKey());
            ConnectRecord record = new ConnectRecord(
                r.getPosition().getPartition(),
                r.getPosition().getOffset(),
                r.getTimestamp(),
                transformed.schema(),
                transformed.value(),
                r.getSchema(),
                r.getData()
            );
            record.setExtensions(r.getExtensions());
            return record;
```

### DuplicatedCode
Duplicated code
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/ChangeCase.java`
#### Snippet
```java
            final SchemaAndValue transformed = process(r, r.getSchema(), r.getData());
            ConnectRecord record = new ConnectRecord(
                r.getPosition().getPartition(),
                r.getPosition().getOffset(),
                r.getTimestamp(),
                r.getKeySchema(),
                r.getKey(),
                transformed.schema(),
                transformed.value()
            );
            record.setExtensions(r.getExtensions());
            return record;
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java

            return records;
        } catch (IOException e) {
        } catch (InterruptedException e) {
            log.error("Interrupt error .", e);
```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsManager.java`
#### Snippet
```java
        try {
            return this.statsTable.get(statsName).getStatsItem(statsKey);
        } catch (Exception e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceThread.java`
#### Snippet
```java
        try {
            waitPoint.await(interval, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
        } finally {
            hasNotified.set(false);
```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalPositionManagementServiceImpl.java`
#### Snippet
```java
                    sleep(1000);
                    continue;
                } catch (InterruptedException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
                    try {
                        consumer.seek(entry.getKey(), entry.getValue());
                    } catch (MQClientException e) {
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            // close metrics
            connectMetrics.close();
        } catch (Exception e) {

        }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/CountDownLatch2.java`
#### Snippet
```java
        }

        protected void reset() {
            setState(startCount);
        }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
                    properties = new Properties();
                    properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/CreateConnectorSubCommand.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
            int index = 0;
            while ((index = reader.read()) != -1) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
                    properties = new Properties();
                    properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            if (StringUtils.isNotEmpty(config.getMetricsConfigPath())) {
                String file = config.getMetricsConfigPath();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                properties = new Properties();
                properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
                if (file != null) {
                    configFile = file;
                    InputStream in = new BufferedInputStream(new FileInputStream(file));
                    properties = new Properties();
                    properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            if (StringUtils.isNotEmpty(config.getMetricsConfigPath())) {
                String file = config.getMetricsConfigPath();
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                properties = new Properties();
                properties.load(in);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
        if (!increment) {
            Set<ExtendRecordPartition> allPartitions = new HashSet<>();
            allPartitions.addAll(positionStore.getKVMap().keySet());
            allPartitions.forEach(partition -> set(PositionChange.POSITION_CHANG, partition, positionStore.get(partition)));
        }
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
        Map<String, List<ConnectKeyValue>> connectorConfig = new HashMap<>();
        synchronized (latestTaskConfigs) {
            connectorConfig.putAll(latestTaskConfigs);
        }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/LogReporter.java`
#### Snippet
```java
     */
    String message(ProcessingContext context) {
        return String.format("Error encountered in task %s. %s", id.toString(),
                context.toString(deadLetterQueueConfig.includeRecordDetailsInErrorLog()));
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createUniqInstance(String prefix) {
        return new StringBuffer(prefix).append("-").append(UUID.randomUUID().toString()).toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
            SchemaAndValue schemaAndValueKey = keyConverter.toConnectData(topic, key.array());
            if (schemaAndValueKey.value() == null || schemaAndValueKey.value() == null) {
                log.error("The format of the monitored offset change data is wrong and will be discarded , schema and value {}", schemaAndValueKey.toString());
                return;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
                    }
                    // remove and close message queue
                    log.info("Task {},MessageQueueChanged, old messageQueuesOffsetMap {}", id.toString(), JSON.toJSONString(messageQueues));
                    removeAndCloseMessageQueue(subTopic, mqDivided);

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `State` may be 'static'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/ChangeCase.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ChangeCase.class);

    class State {
        public final Map<String, String> columnMapping;
        public final Schema schema;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
    R filter(R record, Map map) {
        for (Object field : map.keySet()) {
            if (!this.fields.contains(field)) {
                continue;
            }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetricsTemplates.java`
#### Snippet
```java
    public ConnectMetricsTemplates(Set<String> tags) {

        /***** Worker task level *****/
        Set<String> workerTaskTags = new LinkedHashSet<>(tags);
        workerTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetricsTemplates.java`
#### Snippet
```java
        taskCommitSuccessCount = createTemplate("offset-commit-success-count", TASK_GROUP_NAME, workerTaskTags);

        /***** Source worker task level *****/
        Set<String> sourceTaskTags = new LinkedHashSet<>(tags);
        sourceTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetricsTemplates.java`
#### Snippet
```java
        sourceRecordActiveCountAvg = createTemplate("source-record-active-count-avg", SOURCE_TASK_GROUP_NAME, sourceTaskTags);

        /***** Sink worker task level *****/
        Set<String> sinkTaskTags = new LinkedHashSet<>(tags);
        sinkTaskTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetricsTemplates.java`
#### Snippet
```java


        /***** task error metrics *****/
        Set<String> taskErrorHandlingTags = new LinkedHashSet<>(tags);
        taskErrorHandlingTags.add(CONNECTOR_TAG_NAME);
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public void replicaTargetState() {
        /** connector status store*/
        Map<String, ConnectorStatus> connectorStatusMap = connectorStatusStore.getKVMap();
        connectorStatusMap.forEach((connectorName, connectorStatus) -> {
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
        });

        /** task status store */
        Map<String, List<TaskStatus>> taskStatusMap = taskStatusStore.getKVMap();
        if (taskStatusMap.isEmpty()) {
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
    public void initialize(WorkerConfig config, RecordConverter converter) {
        super.initialize(config, converter);
        /**connector status store*/
        this.connectorStatusStore = new FileBaseKeyValueStore<>(
                FilePathConfigUtil.getConnectorStatusConfigPath(config.getStorePathRootDir()),
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
            new JsonSerde(ConnectorStatus.class));

        /**task status store*/
        this.taskStatusStore = new FileBaseKeyValueStore<>(
            FilePathConfigUtil.getTaskStatusConfigPath(config.getStorePathRootDir()),
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public String putConnectorConfig(String connectorName, ConnectKeyValue configs) {
        /**
         * check request config
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqStateManagementServiceImpl.java`
#### Snippet
```java
    public void initialize(WorkerConfig config, RecordConverter converter) {
        super.initialize(config, converter);
        /**connector status store*/
        this.connectorStatusStore = new MemoryBasedKeyValueStore<>();

```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqStateManagementServiceImpl.java`
#### Snippet
```java
        this.connectorStatusStore = new MemoryBasedKeyValueStore<>();

        /**task status store*/
        this.taskStatusStore = new MemoryBasedKeyValueStore<>();
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
        }

        /**
         * parse namespace and name
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java

            records.add(record);
            /**prepare to send record*/
            positions.add(prepareToSendRecord(preTransformRecord).get());

```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
            }
            log.trace("{} Appending record to the topic {} , value {}", this, topic, record.getData());
            /**prepare to send record*/
            Optional<RecordOffsetManagement.SubmittedPosition> submittedRecordPosition = prepareToSendRecord(preTransformRecord);
            try {
```

### DanglingJavadoc
Dangling Javadoc comment
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                    final Task task = plugin.newTask(taskClass);

                    /**
                     * create key/value converter
                     */
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `latestTaskConfigs`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     */
    public void startTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
        synchronized (latestTaskConfigs) {
            this.latestTaskConfigs = taskConfigs;
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `latestTaskConfigs`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    public void maintainTaskState() throws Exception {
        Map<String, List<ConnectKeyValue>> connectorConfig = new HashMap<>();
        synchronized (latestTaskConfigs) {
            connectorConfig.putAll(latestTaskConfigs);
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sourceTaskOffsetCommitter'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     */
    private final Map<Runnable, Future> taskToFutureMap = new ConcurrentHashMap<>();
    private final Optional<SourceTaskOffsetCommitter> sourceTaskOffsetCommitter;
    /**
     * Atomic state variable
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
    public List deserialize(String topic, byte[] data) {
        try {
            String json = new String(data, "UTF-8");
            List list = JSONArray.parseArray(json, clazz);
            return list;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, List data) {
        try {
            return JSON.toJSONString(data).getBytes("UTF-8");
        } catch (Exception e) {
            log.error("ListSerializer serialize failed", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordOffsetDeserializer.java`
#### Snippet
```java
    public RecordOffset deserialize(String topic, byte[] data) {
        try {
            String text = new String(data, "UTF-8");
            RecordOffset res = JSON.parseObject(text, RecordOffset.class);
            return res;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordOffsetSerializer.java`
#### Snippet
```java
        try {
            String json = JSON.toJSONString(data);
            return json.getBytes("UTF-8");
        } catch (Exception e) {
            log.error("RecordOffsetSerializer serialize failed", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
            for (Map.Entry<ExtendRecordPartition, RecordOffset> entry : data.entrySet()) {
                String jsonKey = JSON.toJSONString(entry.getKey());
                jsonKey.getBytes("UTF-8");
                String jsonValue = JSON.toJSONString(entry.getValue());
                jsonValue.getBytes("UTF-8");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPartitionSerializer.java`
#### Snippet
```java
        try {
            String json = JSON.toJSONString(data);
            return json.getBytes("UTF-8");
        } catch (Exception e) {
            log.error("JsonConverter#objectToByte failed", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
                jsonKey.getBytes("UTF-8");
                String jsonValue = JSON.toJSONString(entry.getValue());
                jsonValue.getBytes("UTF-8");
                resultMap.put(jsonKey, jsonValue);
            }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
                resultMap.put(jsonKey, jsonValue);
            }
            return JSON.toJSONString(resultMap).getBytes("UTF-8");
        } catch (Exception e) {
            log.error("RecordPositionMapSerializer serialize failed", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueDeserializer.java`
#### Snippet
```java
    public ConnectKeyValue deserialize(String topic, byte[] data) {
        try {
            String jsonString = new String(data, "UTF-8");

            return JSON.parseObject(jsonString, ConnectKeyValue.class);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, ConnectKeyValue data) {
        try {
            return JSON.toJSONString(data).getBytes("UTF-8");
        } catch (Exception e) {
            log.error("ConnectKeyValueConverter#objectToByte failed", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPartitionDeserializer.java`
#### Snippet
```java
    public ExtendRecordPartition deserialize(String topic, byte[] data) {
        try {
            String text = new String(data, "UTF-8");
            ExtendRecordPartition res = JSON.parseObject(text, ExtendRecordPartition.class);
            return res;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapDeserializer.java`
#### Snippet
```java
        Map<ExtendRecordPartition, RecordOffset> resultMap = new HashMap<>();
        try {
            String rawString = new String(data, "UTF-8");
            Map<String, String> map = JSON.parseObject(rawString, Map.class);
            for (String key : map.keySet()) {
```

## RuleId[id=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'deKey.size() != 3'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
            }
            List<Object> deKey = (List<Object>) schemaAndValueKey.value();
            if (deKey.isEmpty() || deKey.size() != 3) {
                log.error("The format of the monitored offset change data is wrong and will be discarded , message {}", deKey);
                return;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Javalin' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        pluginsResource = new ConnectorPluginsResource(connectController);

        Javalin app = Javalin.create();
        app = app.start(connectController.getConnectConfig().getHttpPort());

```

### AutoCloseableResource
'ErrorReporter' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java
    public void report() {
        if (reporters.size() == 1) {
            reporters.iterator().next().report(this);
        }
        reporters.stream().forEach(r -> r.report(this));
```

### AutoCloseableResource
'DelegatingClassLoader' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
        ClassLoader savedLoader = plugin.currentThreadLoader();
        try {
            ClassLoader loader = plugin.delegatingLoader().pluginClassLoader(transformClass);
            savedLoader = Plugin.compareAndSwapLoaders(loader);
            Class transformClazz = Utils.getContextCurrentClassLoader().loadClass(transformClass);
```

### AutoCloseableResource
'DelegatingClassLoader' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                try {
                    String connType = keyValue.getString(ConnectorConfig.CONNECTOR_CLASS);
                    ClassLoader connectorLoader = plugin.delegatingLoader().connectorLoader(connType);
                    savedLoader = Plugin.compareAndSwapLoaders(connectorLoader);
                    // new task
```

### AutoCloseableResource
'DelegatingClassLoader' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
        try {
            // Get plugin loader
            ClassLoader taskLoader = plugin.delegatingLoader().pluginClassLoader(taskClass);
            // Compare and set current loader
            savedLoader = Plugin.compareAndSwapLoaders(taskLoader);
```

### AutoCloseableResource
'DelegatingClassLoader' used without 'try'-with-resources statement
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                ConnectKeyValue keyValue = newConnectors.get(connectorName);
                String connectorClass = keyValue.getString(ConnectorConfig.CONNECTOR_CLASS);
                ClassLoader connectorLoader = plugin.delegatingLoader().pluginClassLoader(connectorClass);
                savedLoader = Plugin.compareAndSwapLoaders(connectorLoader);

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'null == scaleNode' covered by subsequent condition '!(scaleNode instanceof Number)'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                if (AVRO_LOGICAL_DECIMAL.equalsIgnoreCase(logicalType)) {
                    Object scaleNode = schema.getObjectProp(AVRO_LOGICAL_DECIMAL_SCALE_PROP);
                    if (null == scaleNode || !(scaleNode instanceof Number)) {
                        throw new ConnectException("scale must be specified and must be a number.");
                    }
```

### ConditionCoveredByFurtherCondition
Condition 'version != null' covered by subsequent condition 'version instanceof Integer'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        // schema version
        Object version = jsonSchema.get(JsonSchema.SCHEMA_VERSION_FIELD_NAME);
        if (version != null && version instanceof Integer) {
            builder.version(Integer.parseInt(version.toString()));
        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Serializer.java`
#### Snippet
```java
     * serialize data
     *
     * @param topic
     * @param isKey
     * @param schema
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Serializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param schema
     * @param value
```

### JavadocDeclaration
`@param props` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Deserializer.java`
#### Snippet
```java
     * configure
     *
     * @param props
     */
    default void configure(Map<String, ?> props) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Serializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param schema
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Serializer.java`
#### Snippet
```java
     * @param isKey
     * @param schema
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Serializer.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @return
     */
    byte[] serialize(String topic, boolean isKey, T schema, Object value);
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Deserializer.java`
#### Snippet
```java
     * deserialize
     *
     * @param topic
     * @param isKey
     * @param payload
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Deserializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param payload
     * @return
```

### JavadocDeclaration
`@param payload` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Deserializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param payload
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/Deserializer.java`
#### Snippet
```java
     * @param isKey
     * @param payload
     * @return
     */
    T deserialize(String topic, boolean isKey, byte[] payload);
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/TopicNameStrategy.java`
#### Snippet
```java
     * generate subject name
     *
     * @param topic
     * @param isKey
     * @return
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/TopicNameStrategy.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/TopicNameStrategy.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @return
     */
    public static String subjectName(String topic, boolean isKey) {
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * get schema string
     *
     * @return
     */
    String idl();
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * get schema name
     *
     * @return
     */
    String name();
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * get schema type
     *
     * @return
     */
    SchemaType schemaType();
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * get schema version
     *
     * @return
     */
    Integer version();
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * deep equals
     *
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     *
     * @param schema
     * @return
     */
    default boolean deepEquals(ParsedSchema schema) {
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/ParsedSchema.java`
#### Snippet
```java
     * raw schema
     *
     * @return
     */
    T rawSchema();
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/util/JsonSchemaUtils.java`
#### Snippet
```java
     * validate object
     *
     * @param schema
     * @param value
     * @throws JsonProcessingException
```

### JavadocDeclaration
`@param value` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/util/JsonSchemaUtils.java`
#### Snippet
```java
     *
     * @param schema
     * @param value
     * @throws JsonProcessingException
     * @throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/util/JsonSchemaUtils.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @throws JsonProcessingException
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/util/JsonSchemaUtils.java`
#### Snippet
```java
     * @param value
     * @throws JsonProcessingException
     * @throws ValidationException
     */
    public static void validate(Schema schema, Object value) throws JsonProcessingException, ValidationException {
```

### JavadocDeclaration
`@param props` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractConverterConfig.java`
#### Snippet
```java
     * abstract converter config
     *
     * @param props
     */
    public AbstractConverterConfig(Map<String, ?> props) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
     * serialize
     *
     * @param topic
     * @param isKey
     * @param value
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param value
     * @param schema
```

### JavadocDeclaration
`@param value` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param value
     * @param schema
     * @return
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
     * @param isKey
     * @param value
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
     * @param value
     * @param schema
     * @return
     */
    public byte[] serialize(String topic, boolean isKey, JsonSchema schema, Object value) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java
     * deserialize
     *
     * @param topic
     * @param isKey
     * @param payload
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param payload
     * @return
```

### JavadocDeclaration
`@param payload` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param payload
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java
     * @param isKey
     * @param payload
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaConverterConfig.java`
#### Snippet
```java
     * decimal format
     *
     * @return
     */
    public DecimalFormat decimalFormat() {
```

### JavadocDeclaration
`@param subject` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * Get registry schema by specify policy
     *
     * @param subject
     * @param schemaName
     * @param request
```

### JavadocDeclaration
`@param schemaName` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     *
     * @param subject
     * @param schemaName
     * @param request
     * @return
```

### JavadocDeclaration
`@param request` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param subject
     * @param schemaName
     * @param request
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param schemaName
     * @param request
     * @return
     */
    public SchemaResponse autoRegisterOrGetSchema(String namespace, String subject, String schemaName, RegisterSchemaRequest request, ParsedSchema schema) {
```

### JavadocDeclaration
`@param subject` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * compare and get
     *
     * @param subject
     * @param schemaName
     * @param request
```

### JavadocDeclaration
`@param schemaName` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     *
     * @param subject
     * @param schemaName
     * @param request
     * @param schemaRecordAllVersion
```

### JavadocDeclaration
`@param request` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param subject
     * @param schemaName
     * @param request
     * @param schemaRecordAllVersion
     * @param schema
```

### JavadocDeclaration
`@param schemaRecordAllVersion` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param schemaName
     * @param request
     * @param schemaRecordAllVersion
     * @param schema
     * @return
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param request
     * @param schemaRecordAllVersion
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param schemaRecordAllVersion
     * @param schema
     * @return
     */
    protected SchemaResponse compareAndGet(String namespace, String subject, String schemaName, RegisterSchemaRequest request, List<SchemaRecordDto> schemaRecordAllVersion, ParsedSchema schema) {
```

### JavadocDeclaration
`@param subject` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * Get schema latest version
     *
     * @param subject
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     *
     * @param subject
     * @return
     */
    public GetSchemaResponse getSchemaLatestVersion(String namespace, String subject) {
```

### JavadocDeclaration
`@param subject` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * check subject exists
     *
     * @param subject
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     *
     * @param subject
     * @return
     */
    public Boolean checkSubjectExists(String namespace, String subject) {
```

### JavadocDeclaration
`@param subject` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * auto register schema
     *
     * @param subject
     * @param schemaName
     * @param request
```

### JavadocDeclaration
`@param schemaName` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     *
     * @param subject
     * @param schemaName
     * @param request
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
     * @param subject
     * @param schemaName
     * @param request
     */
    protected SchemaResponse autoRegisterSchema(String namespace, String subject, String schemaName, RegisterSchemaRequest request, ParsedSchema schema) {
```

### JavadocDeclaration
`@param configs` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/AutoConfiguration.java`
#### Snippet
```java
     * configs
     *
     * @param configs
     */
    void config(Map<String, String> configs);
```

### JavadocDeclaration
`@param name` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * get histogram value
     *
     * @param name
     * @param histogram
     * @return
```

### JavadocDeclaration
`@param histogram` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     *
     * @param name
     * @param histogram
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * @param name
     * @param histogram
     * @return
     */
    public static Double getHistogramValue(MetricName name, Histogram histogram) {
```

### JavadocDeclaration
`@param name` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * get meter value
     *
     * @param name
     * @param meter
     * @return
```

### JavadocDeclaration
`@param meter` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     *
     * @param name
     * @param meter
     * @return
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Stat.java`
#### Snippet
```java
     * record
     *
     * @param value
     */
    void record(long value);
```

### JavadocDeclaration
`@return` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Stat.java`
#### Snippet
```java
     * type
     *
     * @return
     */
    default String type() {
```

### JavadocDeclaration
`@return` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * @param name
     * @param meter
     * @return
     */
    public static Double getMeterValue(MetricName name, Meter meter) {
```

### JavadocDeclaration
`@param name` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * MetricName to string
     *
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     *
     * @param name
     * @return
     */
    public static String metricNameToString(MetricName name) {
```

### JavadocDeclaration
`@param name` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     * string to MetricName
     *
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
     *
     * @param name
     * @return
     */
    public static MetricName stringToMetricName(String name) {
```

### JavadocDeclaration
`@param histograms` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * report histograms
     *
     * @param histograms
     */
    private void reportHistograms(SortedMap<MetricName, Double> histograms) {
```

### JavadocDeclaration
`@param counters` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * report counters
     *
     * @param counters
     */
    private void reportCounters(SortedMap<MetricName, Long> counters) {
```

### JavadocDeclaration
`@param timers` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * report timers
     *
     * @param timers
     */
    private void reportTimers(SortedMap<MetricName, Timer> timers) {
```

### JavadocDeclaration
`@param meters` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * report meters
     *
     * @param meters
     */
    private void reportMeters(SortedMap<MetricName, Double> meters) {
```

### JavadocDeclaration
`@param gauges` tag description is missing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * report gauges
     *
     * @param gauges
     */
    private void reportGauges(SortedMap<MetricName, Object> gauges) {
```

### JavadocDeclaration
`@param record` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
     * filter map
     *
     * @param record
     * @param map
     * @return
```

### JavadocDeclaration
`@param map` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
     *
     * @param record
     * @param map
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
     * @param record
     * @param map
     * @return
     */
    R filter(R record, Map map) {
```

### JavadocDeclaration
`@return` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/ChangeCaseConfig.java`
#### Snippet
```java
     * to
     *
     * @return
     */
    public CaseFormat to() {
```

### JavadocDeclaration
`@return` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/ChangeCaseConfig.java`
#### Snippet
```java
     * from
     *
     * @return
     */
    public CaseFormat from() {
```

### JavadocDeclaration
`@param s` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     * get list
     *
     * @param s
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     *
     * @param s
     * @return
     */
    public List getList(String s) {
```

### JavadocDeclaration
`@param s` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     * get list by class
     *
     * @param s
     * @param clazz
     * @param <T>
```

### JavadocDeclaration
`@param clazz` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     *
     * @param s
     * @param clazz
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     * @param s
     * @param clazz
     * @param <T>
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> getList(String s, Class<T> clazz) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDeserializer.java`
#### Snippet
```java
     * deserialize
     *
     * @param topic
     * @param isKey
     * @param payload
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDeserializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param payload
     * @return
```

### JavadocDeclaration
`@param payload` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDeserializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param payload
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDeserializer.java`
#### Snippet
```java
     * @param isKey
     * @param payload
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param topic` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
     * avro serialize
     *
     * @param topic
     * @param isKey
     * @param schema
```

### JavadocDeclaration
`@param isKey` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
     *
     * @param topic
     * @param isKey
     * @param schema
     * @param data
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
     * @param topic
     * @param isKey
     * @param schema
     * @param data
     * @return
```

### JavadocDeclaration
`@param data` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
     * @param isKey
     * @param schema
     * @param data
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
     * @param schema
     * @param data
     * @return
     */
    public byte[] serialize(String topic, boolean isKey, AvroSchema schema, Object data) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumWriterFactory.java`
#### Snippet
```java
     * get datum writer
     *
     * @param value
     * @param schema
     * @return
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumWriterFactory.java`
#### Snippet
```java
     *
     * @param value
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumWriterFactory.java`
#### Snippet
```java
     * @param value
     * @param schema
     * @return
     */
    private DatumWriter<?> getDatumWriter(Object value, Schema schema) {
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumWriterFactory.java`
#### Snippet
```java
     * Get avro datum factory
     *
     * @return
     */
    public static AvroDatumWriterFactory get(boolean useSchemaReflection, boolean avroUseLogicalTypeConverters) {
```

### JavadocDeclaration
`@param avroData` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerdeFactory.java`
#### Snippet
```java
     * add logical type conversion
     *
     * @param avroData
     */
    public void addLogicalTypeConversion(GenericData avroData) {
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverter.java`
#### Snippet
```java
     * @param schema record schema
     * @param value  record value
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
     * Get avro datum factory
     *
     * @return
     */
    public static AvroDatumReaderFactory get(boolean useSchemaReflection, boolean avroUseLogicalTypeConverters, boolean useSpecificAvroReader, boolean avroReflectionAllowNull) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * no optional schema
     *
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param schema
     * @return
     */
    private static Schema nonOptionalSchema(Schema schema) {
```

### JavadocDeclaration
`@param jsonSchema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * convert json schema to connect schema
     *
     * @param jsonSchema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param jsonSchema
     * @return
     */
    public Schema toConnectSchema(org.everit.json.schema.Schema jsonSchema) {
```

### JavadocDeclaration
`@param combinedSchema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * all of to connect schema
     *
     * @param combinedSchema
     * @param version
     * @param forceOptional
```

### JavadocDeclaration
`@param version` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param combinedSchema
     * @param version
     * @param forceOptional
     * @return
```

### JavadocDeclaration
`@param forceOptional` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param combinedSchema
     * @param version
     * @param forceOptional
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param version
     * @param forceOptional
     * @return
     */
    private Schema allOfToConnectSchema(CombinedSchema combinedSchema, Integer version, boolean forceOptional) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * from json schema
     *
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param schema
     * @return
     */
    public org.everit.json.schema.Schema fromJsonSchema(Schema schema) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * to connect data
     *
     * @param schema
     * @param jsonValue
     * @return
```

### JavadocDeclaration
`@param jsonValue` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param schema
     * @param jsonValue
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param schema
     * @param jsonValue
     * @return
     */
    public static Object toConnectData(Schema schema, JsonNode jsonValue) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * Convert connect data to json schema
     *
     * @param schema
     * @param logicalValue
     * @return
```

### JavadocDeclaration
`@param logicalValue` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param schema
     * @param logicalValue
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param schema
     * @param logicalValue
     * @return
     */
    public JsonNode fromConnectData(Schema schema, Object logicalValue) {
```

### JavadocDeclaration
`@param jsonSchema` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * to connect schema
     *
     * @param jsonSchema
     * @param version
     * @param forceOptional
```

### JavadocDeclaration
`@param version` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     *
     * @param jsonSchema
     * @param version
     * @param forceOptional
     * @return
```

### JavadocDeclaration
`@param forceOptional` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param jsonSchema
     * @param version
     * @param forceOptional
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
     * @param version
     * @param forceOptional
     * @return
     */
    private Schema toConnectSchema(org.everit.json.schema.Schema jsonSchema, Integer version, boolean forceOptional) {
```

### JavadocDeclaration
`@param args` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
     * Read configs from command line and create connect controller.
     *
     * @param args
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
     *
     * @param args
     * @return
     */
    private static DistributedConnectController createConnectController(String[] args) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     * validate plugin configs
     *
     * @param context
     * @throws Throwable
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     *
     * @param context
     * @throws Throwable
     */
    public void validateConfigs(Context context) {
```

### JavadocDeclaration
Throwable is not declared to be thrown by method validateConfigs
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     *
     * @param context
     * @throws Throwable
     */
    public void validateConfigs(Context context) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     * list connector plugins
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    public void listConnectorPlugins(Context context) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     * reload plugins
     *
     * @param context
     */
    public void reloadPlugins(Context context) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     * list connector plugins
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@param args` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
     * Read configs from command line and create connect controller.
     *
     * @param args
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    public void listPlugins(Context context) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
     *
     * @param args
     * @return
     */
    private static StandaloneConnectController createConnectController(String[] args) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     * Get connector config def
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    public void getConnectorConfigDef(Context context) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Put a key/value into the store.
     *
     * @param key
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * @param key
     * @param value
     * @return
     */
    V put(K key, V value);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Get all data from the current store. Not recommend to use this method when the data set is large.
     *
     * @return
     */
    Map<K, V> getKVMap();
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Load the data from back store.
     *
     * @return
     */
    boolean load();
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Get the value of a key.
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    V get(K key);
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Whether a key is contained in current store.
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    boolean containsKey(K key);
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Remove a specified key.
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    V remove(K key);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Get the size of current key/value store.
     *
     * @return
     */
    int size();
```

### JavadocDeclaration
`@param map` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/KeyValueStore.java`
#### Snippet
```java
     * Put a set of key/value into the store.
     *
     * @param map
     */
    void putAll(Map<K, V> map);
```

### JavadocDeclaration
Exception is not declared to be thrown by method call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
```

### JavadocDeclaration
`@param callback` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
     * do flush offset
     *
     * @param callback
     */
    public Future doFlush(final DataSynchronizerCallback callback) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
     * begin flush offset
     *
     * @return
     */
    public synchronized boolean beginFlush() {
```

### JavadocDeclaration
`@param task` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     * task config
     *
     * @param task
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     *
     * @param task
     * @return
     */
    public Map<String, String> taskConfig(ConnectorTaskId task) {
```

### JavadocDeclaration
`@param connector` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     * get all task configs
     *
     * @param connector
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     *
     * @param connector
     * @return
     */
    public List<Map<String, String>> allTaskConfigs(String connector) {
```

### JavadocDeclaration
`@param connector` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     * Get the target state of the connector
     *
     * @param connector
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java
     *
     * @param connector
     * @return
     */
    public TargetState targetState(String connector) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
     * get cluster info
     *
     * @param context
     */
    private void getClusterInfo(Context context) {
```

### JavadocDeclaration
`@param stateManagementServiceClazz` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     * Get state management service by class name
     *
     * @param stateManagementServiceClazz
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     *
     * @param stateManagementServiceClazz
     * @return
     */
    @NotNull
```

### JavadocDeclaration
`@param clusterManagementServiceClazz` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     * Get custer management service by class name
     *
     * @param clusterManagementServiceClazz
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     *
     * @param clusterManagementServiceClazz
     * @return
     */
    @NotNull
```

### JavadocDeclaration
`@param positionManagementServiceClazz` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     * Get position management service by class name
     *
     * @param positionManagementServiceClazz
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     *
     * @param positionManagementServiceClazz
     * @return
     */
    @NotNull
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
     * list all connectors
     *
     * @param context
     */
    private void listConnectors(Context context) {
```

### JavadocDeclaration
`@param configManagementServiceClazz` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     * Get config management service by class name
     *
     * @param configManagementServiceClazz
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
     *
     * @param configManagementServiceClazz
     * @return
     */
    @NotNull
```

### JavadocDeclaration
`@param klass` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
    /**
     * new instance
     * @param klass
     * @param base
     * @return
```

### JavadocDeclaration
`@param base` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * new instance
     * @param klass
     * @param base
     * @return
     * @param <T>
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * @param klass
     * @param base
     * @return
     * @param <T>
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@param ` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * @param base
     * @return
     * @param <T>
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * @return
     * @param <T>
     * @throws ClassNotFoundException
     */
    public static <T> T newInstance(String klass, Class<T> base) throws ClassNotFoundException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * get class
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    public static Class<?> getClass(ConnectKeyValue config, final String key) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * get context current class loader
     *
     * @return
     */
    public static ClassLoader getContextCurrentClassLoader() {
```

### JavadocDeclaration
`@param in` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
     * encode
     *
     * @param in
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
     *
     * @param in
     * @return
     */
    public static String base64Encode(byte[] in) {
```

### JavadocDeclaration
`@param in` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
     * decode
     *
     * @param in
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
     *
     * @param in
     * @return
     */
    public static byte[] base64Decode(String in) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizer.java`
#### Snippet
```java
     * Send data to all workers.
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizer.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    void send(K key, V value);
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizer.java`
#### Snippet
```java
     * send data to all workers
     *
     * @param key
     * @param value
     * @param callback
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizer.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     * @param callback
     */
```

### JavadocDeclaration
`@param callback` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizer.java`
#### Snippet
```java
     * @param key
     * @param value
     * @param callback
     */
    void send(K key, V value, Callback callback);
```

### JavadocDeclaration
`@param error` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizerCallback.java`
#### Snippet
```java
     * Receive a message.
     *
     * @param error
     * @param key
     * @param result
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizerCallback.java`
#### Snippet
```java
     *
     * @param error
     * @param key
     * @param result
     */
```

### JavadocDeclaration
`@param result` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/DataSynchronizerCallback.java`
#### Snippet
```java
     * @param error
     * @param key
     * @param result
     */
    void onCompletion(Throwable error, K key, V result);
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java
     * put a data to cache
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    void put(K key, V value);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java

    /**
     * @return
     */
    long size();
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java

    /**
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java
    /**
     * @param key
     * @return
     */
    V get(K key);
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java
     * remove a data to cache
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/Cache.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    boolean remove(K key);
```

### JavadocDeclaration
`@param callable` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * execute retry with exception
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
```

### JavadocDeclaration
`@param retryTimes` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
```

### JavadocDeclaration
`@param sleepTimeInMilliSecond` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param retryExceptionClasss
```

### JavadocDeclaration
`@param exponential` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param retryExceptionClasss
     * @param <T>
```

### JavadocDeclaration
`@param retryExceptionClasss` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param retryExceptionClasss
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param exponential
     * @param retryExceptionClasss
     * @param <T>
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param retryExceptionClasss
     * @param <T>
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T executeWithRetry(Callable<T> callable,
```

### JavadocDeclaration
`@param callable` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * execute with retry
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
```

### JavadocDeclaration
`@param retryTimes` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
```

### JavadocDeclaration
`@param sleepTimeInMilliSecond` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param <T>
```

### JavadocDeclaration
`@param exponential` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param <T>
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param exponential
     * @param <T>
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T executeWithRetry(Callable<T> callable,
```

### JavadocDeclaration
`@param callable` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * Async execute with retry
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
```

### JavadocDeclaration
`@param retryTimes` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     *
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
```

### JavadocDeclaration
`@param sleepTimeInMilliSecond` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param callable
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param timeoutMs
```

### JavadocDeclaration
`@param exponential` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param retryTimes
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param timeoutMs
     * @param executor
```

### JavadocDeclaration
`@param timeoutMs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param sleepTimeInMilliSecond
     * @param exponential
     * @param timeoutMs
     * @param executor
     * @param <T>
```

### JavadocDeclaration
`@param executor` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param exponential
     * @param timeoutMs
     * @param executor
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param timeoutMs
     * @param executor
     * @param <T>
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param executor
     * @param <T>
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T asyncExecuteWithRetry(Callable<T> callable,
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
     * Create thread pool
     *
     * @return
     */
    public static ThreadPoolExecutor createThreadPoolExecutor() {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
     * put a data to cache
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
     * remove a data to cache
     *
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
     *
     * @param key
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
     * cache size
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java

    /**
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/cache/LRUCache.java`
#### Snippet
```java
    /**
     * @param key
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param str` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
     * Store the string to a file.
     *
     * @param str
     * @param fileName
     * @throws IOException
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
     *
     * @param str
     * @param fileName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
     * @param str
     * @param fileName
     * @throws IOException
     */
    public static void string2File(final String str, final String fileName) throws IOException {
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/LogReporter.java`
#### Snippet
```java
     * format error message
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/LogReporter.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    String message(ProcessingContext context) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/ConnectorConfig.java`
#### Snippet
```java
     * original config
     *
     * @return
     */
    public Map<String, String> originalConfig() {
```

### JavadocDeclaration
`@param connectorTaskId` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * build sink task reporter
     *
     * @param connectorTaskId
     * @param connConfig
     * @param workerConfig
```

### JavadocDeclaration
`@param record` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
     * report record
     *
     * @param record
     * @param error
     * @return
```

### JavadocDeclaration
`@param error` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
     *
     * @param record
     * @param error
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
     * @param record
     * @param error
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param connConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     *
     * @param connectorTaskId
     * @param connConfig
     * @param workerConfig
     * @return
```

### JavadocDeclaration
`@param workerConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * @param connectorTaskId
     * @param connConfig
     * @param workerConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * @param connConfig
     * @param workerConfig
     * @return
     */
    public static List<ErrorReporter> sinkTaskReporters(ConnectorTaskId connectorTaskId,
```

### JavadocDeclaration
`@param connConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * create worker error record reporter
     *
     * @param connConfig
     * @param retryWithToleranceOperator
     * @param converter
```

### JavadocDeclaration
`@param retryWithToleranceOperator` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     *
     * @param connConfig
     * @param retryWithToleranceOperator
     * @param converter
     * @return
```

### JavadocDeclaration
`@param converter` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * @param connConfig
     * @param retryWithToleranceOperator
     * @param converter
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * @param retryWithToleranceOperator
     * @param converter
     * @return
     */
    public static WorkerErrorRecordReporter createWorkerErrorRecordReporter(
```

### JavadocDeclaration
`@param connectorTaskId` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * build source task reporter
     *
     * @param connectorTaskId
     * @param connConfig
     * @return
```

### JavadocDeclaration
`@param connConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     *
     * @param connectorTaskId
     * @param connConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * @param connectorTaskId
     * @param connConfig
     * @return
     */
    public static List<ErrorReporter> sourceTaskReporters(ConnectorTaskId connectorTaskId,
```

### JavadocDeclaration
`@param connConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     * create retry operator
     *
     * @param connConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
     *
     * @param connConfig
     * @return
     */
    public static RetryWithToleranceOperator createRetryWithToleranceOperator(
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ErrorReporter.java`
#### Snippet
```java
     * report message
     *
     * @param context
     */
    void report(ProcessingContext context);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java

    /**
     * @return
     */
    public boolean failed() {
```

### JavadocDeclaration
`@param reporters` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java
     * set reporters
     *
     * @param reporters
     */
    public void reporters(Collection<ErrorReporter> reporters) {
```

### JavadocDeclaration
`@param error` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ProcessingContext.java`
#### Snippet
```java
     * set error
     *
     * @param error
     */
    public void error(Throwable error) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * include error log
     *
     * @return
     */
    public boolean includeRecordDetailsInErrorLog() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * get dlq topic write queue nums
     *
     * @return
     */
    public Integer dlqTopicWriteQueueNums() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * get dlq topic read queue nums
     *
     * @return
     */
    public Integer dlqTopicReadQueueNums() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * get dlq context headers enabled
     *
     * @return
     */
    public Boolean isDlqContextHeadersEnabled() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * get dlq topic name
     *
     * @return
     */
    public String dlqTopicName() {
```

### JavadocDeclaration
`@param config` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
     * config
     *
     * @param config
     */
    public DeadLetterQueueConfig(ConnectKeyValue config) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/Sensor.java`
#### Snippet
```java
     * record value
     *
     * @param value
     */
    public void record(long value) {
```

### JavadocDeclaration
`@param producer` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * Initialize the dead letter queue reporter with a producer
     *
     * @param producer
     * @param connConfig
     * @param connectorTaskId
```

### JavadocDeclaration
`@param connConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     *
     * @param producer
     * @param connConfig
     * @param connectorTaskId
     */
```

### JavadocDeclaration
`@param connectorTaskId` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * @param producer
     * @param connConfig
     * @param connectorTaskId
     */
    DeadLetterQueueReporter(DefaultMQProducer producer,
```

### JavadocDeclaration
`@param producerRecord` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * pop context property
     *
     * @param producerRecord
     * @param context
     */
```

### JavadocDeclaration
`@param context` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     *
     * @param producerRecord
     * @param context
     */
    void populateContextHeaders(Message producerRecord, ProcessingContext context) {
```

### JavadocDeclaration
`@param connectorTaskId` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * build reporter
     *
     * @param connectorTaskId
     * @param sinkConfig
     * @param workerConfig
```

### JavadocDeclaration
`@param sinkConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     *
     * @param connectorTaskId
     * @param sinkConfig
     * @param workerConfig
     * @return
```

### JavadocDeclaration
`@param workerConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * @param connectorTaskId
     * @param sinkConfig
     * @param workerConfig
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * @param sinkConfig
     * @param workerConfig
     * @return
     */
    public static DeadLetterQueueReporter build(ConnectorTaskId connectorTaskId,
```

### JavadocDeclaration
`@param partitions` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/PositionManagementService.java`
#### Snippet
```java
     * Remove a position info.
     *
     * @param partitions
     */
    void removePosition(List<ExtendRecordPartition> partitions);
```

### JavadocDeclaration
`@param listener` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/PositionManagementService.java`
#### Snippet
```java
     * Register a listener.
     *
     * @param listener
     */
    default void registerListener(PositionUpdateListener listener){
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/PositionManagementService.java`
#### Snippet
```java
     * Get the current position table.
     *
     * @return
     */
    Map<ExtendRecordPartition, RecordOffset> getPositionTable();
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementService.java`
#### Snippet
```java
     * Get all alive workers in the cluster.
     *
     * @return
     */
    List<String> getAllAliveWorkers();
```

### JavadocDeclaration
`@param listener` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementService.java`
#### Snippet
```java
     * Register a worker status listener to listen the change of alive workers.
     *
     * @param listener
     */
    void registerListener(WorkerStatusListener listener);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementService.java`
#### Snippet
```java
     * get current run worker
     *
     * @return
     */
    String getCurrentWorker();
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
     * error
     *
     * @return
     */
    public Throwable error() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
     * failed
     *
     * @return
     */
    public boolean failed() {
```

### JavadocDeclaration
`@param messageExt` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
     * Set the record consumed rocketmq in a sink
     *
     * @param messageExt
     */
    public void consumerRecord(MessageExt messageExt) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetrics.java`
#### Snippet
```java
     * get metric registry
     *
     * @return
     */
    public MetricRegistry registry() {
```

### JavadocDeclaration
`@param tagKeyValues` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetrics.java`
#### Snippet
```java
     * get metrics group
     *
     * @param tagKeyValues
     * @return
     */
```

### JavadocDeclaration
`@param recordPartition` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     * convert to message queue
     *
     * @param recordPartition
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetrics.java`
#### Snippet
```java
     *
     * @param tagKeyValues
     * @return
     */
    public MetricGroup group(String... tagKeyValues) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     *
     * @param recordPartition
     * @return
     */
    public static MessageQueue convertToMessageQueue(RecordPartition recordPartition) {
```

### JavadocDeclaration
`@param connectConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     * init default lite pull consumer
     *
     * @param connectConfig
     * @return
     * @throws MQClientException
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     *
     * @param connectConfig
     * @return
     * @throws MQClientException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     * @param connectConfig
     * @return
     * @throws MQClientException
     */
    public static DefaultLitePullConsumer initDefaultLitePullConsumer(WorkerConfig connectConfig, boolean autoCommit) {
```

### JavadocDeclaration
MQClientException is not declared to be thrown by method initDefaultLitePullConsumer
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
     * @param connectConfig
     * @return
     * @throws MQClientException
     */
    public static DefaultLitePullConsumer initDefaultLitePullConsumer(WorkerConfig connectConfig, boolean autoCommit) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/ConnectMetrics.java`
#### Snippet
```java
     * get connect metrics template
     *
     * @return
     */
    public ConnectMetricsTemplates templates() {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     * send data to all workers
     *
     * @param key
     * @param value
     * @param callback
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     * @param callback
     */
```

### JavadocDeclaration
`@param callback` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     * @param key
     * @param value
     * @param callback
     */
    @Override
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Remove the connector with the specified connector name in the cluster.
     *
     * @param connectorName
     */
    void deleteConnectorConfig(String connectorName);
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
    /**
     * Recompute task configs
     * @param connectorName
     * @param configs
     */
```

### JavadocDeclaration
`@param configs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Recompute task configs
     * @param connectorName
     * @param configs
     */
    void recomputeTaskConfigs(String connectorName, ConnectKeyValue configs);
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Put the configs of the specified connector in the cluster.
     *
     * @param connectorName
     * @param configs
     * @return
```

### JavadocDeclaration
`@param configs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param configs
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * @param connectorName
     * @param configs
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * @param configs
     * @return
     * @throws Exception
     */
    String putConnectorConfig(String connectorName, ConnectKeyValue configs);
```

### JavadocDeclaration
Exception is not declared to be thrown by method putConnectorConfig
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * @param configs
     * @return
     * @throws Exception
     */
    String putConnectorConfig(String connectorName, ConnectKeyValue configs);
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * resume connector
     *
     * @param connectorName
     */
    void resumeConnector(String connectorName);
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * pause connector
     *
     * @param connectorName
     */
    void pauseConnector(String connectorName);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Get all connector configs from the cluster filter out DELETE set to 1
     *
     * @return
     */
    Map<String, ConnectKeyValue> getConnectorConfigs();
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Get all Task configs.
     *
     * @return
     */
    Map<String, List<ConnectKeyValue>> getTaskConfigs();
```

### JavadocDeclaration
`@param listener` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ConfigManagementService.java`
#### Snippet
```java
     * Register a listener to listen all config update operations.
     *
     * @param listener
     */
    void registerListener(ConnectorConfigUpdateListener listener);
```

### JavadocDeclaration
`@param workerConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/StateManagementService.java`
#### Snippet
```java
    /**
     * init state management service
     * @param workerConfig
     * @param converter
     */
```

### JavadocDeclaration
`@param converter` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/StateManagementService.java`
#### Snippet
```java
     * init state management service
     * @param workerConfig
     * @param converter
     */
    void initialize(WorkerConfig workerConfig, RecordConverter converter);
```

### JavadocDeclaration
`@param allocateResult` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/RebalanceImpl.java`
#### Snippet
```java
     * Start all the connectors and tasks allocated to current process.
     *
     * @param allocateResult
     */
    private void updateProcessConfigsInRebalance(ConnAndTaskConfigs allocateResult) {
```

### JavadocDeclaration
`@param connectConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
     * Preparation before startup
     *
     * @param connectConfig
     */
    private void prepare(WorkerConfig connectConfig) {
```

### JavadocDeclaration
`@param config` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
     * initialize cb config
     *
     * @param config
     */
    @Override
```

### JavadocDeclaration
`@param partition` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     * send position
     *
     * @param partition
     * @param position
     */
```

### JavadocDeclaration
`@param position` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     *
     * @param partition
     * @param position
     */
    protected synchronized void set(PositionChange change, ExtendRecordPartition partition, RecordOffset position) {
```

### JavadocDeclaration
`@param partition` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     * Merge new received position info with local store.
     *
     * @param partition
     * @param offset
     * @return
```

### JavadocDeclaration
`@param offset` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     *
     * @param partition
     * @param offset
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     * @param partition
     * @param offset
     * @return
     */
    private boolean mergeOffset(ExtendRecordPartition partition, RecordOffset offset) {
```

### JavadocDeclaration
`@param listener` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryClusterManagementServiceImpl.java`
#### Snippet
```java
     * Register a worker status listener to listen the change of alive workers.
     *
     * @param listener
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryClusterManagementServiceImpl.java`
#### Snippet
```java
     * Get all alive workers in the cluster.
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param config` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryStateManagementServiceImpl.java`
#### Snippet
```java
     * initialize cb config
     *
     * @param config
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
     * get all connector configs enabled
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
     * resume connector
     *
     * @param connectorName
     */
    @Override
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
     * pause connector
     *
     * @param connectorName
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/AllocateConnAndTaskStrategy.java`
#### Snippet
```java
     * @param connectorConfigs All connector configs.
     * @param taskConfigs      All task configs.
     * @return
     */
    ConnAndTaskConfigs allocate(List<String> allWorker, String curWorker, Map<String, ConnectKeyValue> connectorConfigs,
```

### JavadocDeclaration
`@param config` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqStateManagementServiceImpl.java`
#### Snippet
```java
     * initialize cb config
     *
     * @param config
     */
    @Override
```

### JavadocDeclaration
Exception is not declared to be thrown by method call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java
             *
             * @return computed result
             * @throws Exception if unable to compute a result
             */
            @Override
```

### JavadocDeclaration
`@param connector` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     * remove connector
     *
     * @param connector
     */
    private synchronized void remove(String connector) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     * read task status
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    protected void readTaskStatus(String key, byte[] value) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     * notify other connect node
     *
     * @param key
     * @param bytes
     */
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     *
     * @param key
     * @param bytes
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     * read connector status
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    protected void readConnectorStatus(String key, byte[] value) {
```

### JavadocDeclaration
`@param config` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     * initialize cb config
     *
     * @param config
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverterConfig.java`
#### Snippet
```java
     * return cache size
     *
     * @return
     */
    public int cacheSize() {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * pause connector
     *
     * @param connectorName
     */
    @Override
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * remove and add
     *
     * @param connectorName
     * @param configs
     */
```

### JavadocDeclaration
`@param configs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param configs
     */
    protected void putTaskConfigs(String connectorName, List<ConnectKeyValue> configs) {
```

### JavadocDeclaration
`@param taskId` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * process task config record
     *
     * @param taskId
     * @param schemaAndValue
     */
```

### JavadocDeclaration
`@param schemaAndValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param taskId
     * @param schemaAndValue
     */
    private void processTaskConfigRecord(ConnectorTaskId taskId, SchemaAndValue schemaAndValue) {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * process connector config record
     *
     * @param connectorName
     * @param schemaAndValue
     */
```

### JavadocDeclaration
`@param schemaAndValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param schemaAndValue
     */
    private void processConnectorConfigRecord(String connectorName, SchemaAndValue schemaAndValue) {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * delete config
     *
     * @param connectorName
     */
    @Override
```

### JavadocDeclaration
`@param connectName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * Merge new received configs with the configs in memory.
     *
     * @param connectName
     * @param schemaAndValue
     * @return
```

### JavadocDeclaration
`@param schemaAndValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectName
     * @param schemaAndValue
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * @param connectName
     * @param schemaAndValue
     * @return
     */
    private boolean mergeConnectConfig(String connectName, SchemaAndValue schemaAndValue) {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * process target state record
     *
     * @param connectorName
     * @param schemaAndValue
     */
```

### JavadocDeclaration
`@param schemaAndValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param schemaAndValue
     */
    private void processTargetStateRecord(String connectorName, SchemaAndValue schemaAndValue) {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * resume connector
     *
     * @param connectorName
     */
    @Override
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * process deleted
     *
     * @param connectorName
     * @param schemaAndValue
     */
```

### JavadocDeclaration
`@param schemaAndValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param schemaAndValue
     */
    private void processDeleteConnectorRecord(String connectorName, SchemaAndValue schemaAndValue) {
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * add connector
     *
     * @param connectorName
     * @param configs
     * @return
```

### JavadocDeclaration
`@param configs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     *
     * @param connectorName
     * @param configs
     * @return
     * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * @param connectorName
     * @param configs
     * @return
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * @param configs
     * @return
     * @throws Exception
     */
    public String putConnectorConfig(String connectorName, ConnectKeyValue configs) throws Exception {
```

### JavadocDeclaration
`@param connName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * task configs
     *
     * @param connName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     *
     * @param connName
     * @return
     */
    public List<TaskInfo> taskConfigs(final String connName) {
```

### JavadocDeclaration
`@param connectConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * init connect controller
     *
     * @param connectConfig
     */
    public AbstractConnectController(
```

### JavadocDeclaration
`@param connectorName` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * Remove the connector with the specified connector name in the cluster.
     *
     * @param connectorName
     */
    public void deleteConnectorConfig(String connectorName) {
```

### JavadocDeclaration
`@param configs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serde.java`
#### Snippet
```java
    /**
     * configs in key/value pairs
     * @param configs
     */
    default void configure(Map<String, ?> configs) {
```

### JavadocDeclaration
`@param type` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * serde from by type
     *
     * @param type
     * @param <T>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     *
     * @param type
     * @param <T>
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * @param type
     * @param <T>
     * @return
     */
    static public <T> Serde<T> serdeFrom(Class<T> type) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerde.java`
#### Snippet
```java
     * serializer and deserializer
     *
     * @return
     */
    public static RecordPositionMapSerde serde() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueSerde.java`
#### Snippet
```java
     * serializer and deserializer
     *
     * @return
     */
    public static ConnectKeyValueSerde serde() {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * Convert to connect schema
     *
     * @param schema
     * @param forceOptional
     * @param fieldDefaultVal
```

### JavadocDeclaration
`@param forceOptional` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     *
     * @param schema
     * @param forceOptional
     * @param fieldDefaultVal
     * @param docDefaultVal
```

### JavadocDeclaration
`@param fieldDefaultVal` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * @param schema
     * @param forceOptional
     * @param fieldDefaultVal
     * @param docDefaultVal
     * @param toConnectContext
```

### JavadocDeclaration
`@param docDefaultVal` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * @param forceOptional
     * @param fieldDefaultVal
     * @param docDefaultVal
     * @param toConnectContext
     * @return
```

### JavadocDeclaration
`@param toConnectContext` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * @param fieldDefaultVal
     * @param docDefaultVal
     * @param toConnectContext
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * @param docDefaultVal
     * @param toConnectContext
     * @return
     */
    private Schema toConnectSchema(org.apache.avro.Schema schema,
```

### JavadocDeclaration
`@param schema` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * to avro logical
     *
     * @param schema
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     *
     * @param schema
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @return
     */
    private static Object toAvroLogical(Schema schema, Object value) {
```

### JavadocDeclaration
`@param name` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
     * Retrieve the PluginClassLoader associated with a plugin class
     *
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
     *
     * @param name
     * @return
     */
    public PluginClassLoader pluginClassLoader(String name) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     *
     * @return true if the task's target state is not paused, false if the task is shutdown before resumption
     * @throws InterruptedException
     */
    protected boolean awaitUnpause() throws InterruptedException {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * get state
     *
     * @return
     */
    public WorkerTaskState getState() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * current task state
     *
     * @return
     */
    public CurrentTaskState currentTaskState() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * should pause
     *
     * @return
     */
    public boolean shouldPause() {
```

### JavadocDeclaration
`@param duration` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * record commit success
     *
     * @param duration
     */
    protected void recordCommitSuccess(long duration) {
```

### JavadocDeclaration
`@param duration` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * record commit failure
     *
     * @param duration
     */
    protected void recordCommitFailure(long duration) {
```

### JavadocDeclaration
`@param state` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * change task target state
     *
     * @param state
     */
    public void transitionTo(TargetState state) {
```

### JavadocDeclaration
`@param size` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * batch record
     *
     * @param size
     */
    protected void recordMultiple(int size) {
```

### JavadocDeclaration
`@param position` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
     * submit record
     *
     * @param position
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
     *
     * @param position
     * @return
     */
    public SubmittedPosition submitRecord(RecordPosition position) {
```

### JavadocDeclaration
`@param timeout` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
     * await all messages
     *
     * @param timeout
     * @param timeUnit
     * @return
```

### JavadocDeclaration
`@param timeUnit` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
     *
     * @param timeout
     * @param timeUnit
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
     * @param timeout
     * @param timeUnit
     * @return
     */
    public boolean awaitAllMessages(long timeout, TimeUnit timeUnit) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
         * remove record
         *
         * @return
         */
        public boolean remove() {
```

### JavadocDeclaration
`@param submittedPositions` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java

    /**
     * @param submittedPositions
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
    /**
     * @param submittedPositions
     * @return
     */
    private RecordOffset pollOffsetWhile(Deque<SubmittedPosition> submittedPositions) {
```

### JavadocDeclaration
`@param connector` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/ConnectorStatus.java`
#### Snippet
```java
         * error
         *
         * @param connector
         * @param cause
         */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/ConnectorStatus.java`
#### Snippet
```java
         *
         * @param connector
         * @param cause
         */
        void onFailure(String connector, Throwable cause);
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
     * connector config
     *
     * @return
     */
    public ConnectKeyValue getKeyValue() {
```

### JavadocDeclaration
`@param keyValue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
     * reconfigure
     *
     * @param keyValue
     */
    public void reconfigure(ConnectKeyValue keyValue) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
     * connector object
     *
     * @return
     */
    public Connector getConnector() {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
     * connector name
     *
     * @return
     */
    public String getConnectorName() {
```

### JavadocDeclaration
`@param connector` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/WrapperStatusListener.java`
#### Snippet
```java
     * error
     *
     * @param connector
     * @param cause
     */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/WrapperStatusListener.java`
#### Snippet
```java
     *
     * @param connector
     * @param cause
     */
    @Override
```

### JavadocDeclaration
`@param jsonSchema` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * convert json to schema if not empty
     *
     * @param jsonSchema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     *
     * @param jsonSchema
     * @return
     */
    public Schema asConnectSchema(JSONObject jsonSchema) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * convert ConnectRecord schema to json schema
     *
     * @param schema
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     *
     * @param schema
     * @return
     */
    public JSONObject asJsonSchema(Schema schema) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * convert to json without envelop
     *
     * @param schema
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     *
     * @param schema
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @return
     */
    private Object convertToJsonWithoutEnvelope(Schema schema, Object value) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * convert to json with envelope
     *
     * @param schema
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     *
     * @param schema
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @return
     */
    private JSONObject convertToJsonWithEnvelope(Schema schema, Object value) {
```

### JavadocDeclaration
`@param schema` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * convert to connect
     *
     * @param schema
     * @param value
     * @return
```

### JavadocDeclaration
`@param value` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     *
     * @param schema
     * @param value
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
     * @param schema
     * @param value
     * @return
     */
    private Object convertToConnect(Schema schema, Object value) {
```

### JavadocDeclaration
`@param record` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * failed send
     *
     * @param record
     */
    private void recordFailed(ConnectRecord record) {
```

### JavadocDeclaration
`@param record` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * maybe create and get topic
     *
     * @param record
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     *
     * @param record
     * @return
     */
    private String maybeCreateAndGetTopic(ConnectRecord record) {
```

### JavadocDeclaration
`@param preTransformRecord` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * send success record
     *
     * @param preTransformRecord
     * @param sourceMessage
     * @param result
```

### JavadocDeclaration
`@param sourceMessage` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     *
     * @param preTransformRecord
     * @param sourceMessage
     * @param result
     */
```

### JavadocDeclaration
`@param result` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * @param preTransformRecord
     * @param sourceMessage
     * @param result
     */
    private void recordSent(
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * error record reporter
     *
     * @return
     */
    public WorkerErrorRecordReporter errorRecordReporter() {
```

### JavadocDeclaration
`@param offsetsToCommit` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * compare and commit
     *
     * @param offsetsToCommit
     * @param lastCommittedQueuesOffsets
     * @param taskProvidedOffsets
```

### JavadocDeclaration
`@param lastCommittedQueuesOffsets` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param offsetsToCommit
     * @param lastCommittedQueuesOffsets
     * @param taskProvidedOffsets
     */
```

### JavadocDeclaration
`@param taskProvidedOffsets` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * @param offsetsToCommit
     * @param lastCommittedQueuesOffsets
     * @param taskProvidedOffsets
     */
    private void compareAndCommit(Map<MessageQueue, Long> offsetsToCommit, Map<MessageQueue, Long> lastCommittedQueuesOffsets, Map<MessageQueue, Long> taskProvidedOffsets) {
```

### JavadocDeclaration
`@param queues` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * remove message from messageBatch
     *
     * @param queues
     * @param lost
     */
```

### JavadocDeclaration
`@param lost` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param queues
     * @param lost
     */
    private void closeMessageQueues(Set<MessageQueue> queues, boolean lost) {
```

### JavadocDeclaration
`@param queues` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * remove and close message queue
     *
     * @param queues
     */
    public void removeAndCloseMessageQueue(String topic, Set<MessageQueue> queues) {
```

### JavadocDeclaration
`@param error` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * commit
     *
     * @param error
     * @param seqno
     * @param committedOffsets
```

### JavadocDeclaration
`@param seqno` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param error
     * @param seqno
     * @param committedOffsets
     */
```

### JavadocDeclaration
`@param committedOffsets` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * @param error
     * @param seqno
     * @param committedOffsets
     */
    private void onCommitCompleted(Throwable error, long seqno, Map<MessageQueue, Long> committedOffsets) {
```

### JavadocDeclaration
`@param offsets` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * do commit
     *
     * @param offsets
     * @param seqno
     */
```

### JavadocDeclaration
`@param seqno` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param offsets
     * @param seqno
     */
    private void doCommitSync(Map<MessageQueue, Long> offsets, int seqno) {
```

### JavadocDeclaration
`@param now` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * commit offset
     *
     * @param now
     * @param closing
     */
```

### JavadocDeclaration
`@param closing` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param now
     * @param closing
     */
    private void commitOffsets(long now, boolean closing) {
```

### JavadocDeclaration
`@param messageQueue` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * consume fro offset
     *
     * @param messageQueue
     * @param taskConfig
     */
```

### JavadocDeclaration
`@param taskConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param messageQueue
     * @param taskConfig
     */
    public long consumeFromOffset(MessageQueue messageQueue, ConnectKeyValue taskConfig) {
```

### JavadocDeclaration
`@param timeoutMs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * poll consumer
     *
     * @param timeoutMs
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     *
     * @param timeoutMs
     * @return
     */
    private List<MessageExt> pollConsumer(long timeoutMs) {
```

### JavadocDeclaration
`@param messages` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * receive message from MQ.
     *
     * @param messages
     */
    private void receiveMessages(List<MessageExt> messages) {
```

### JavadocDeclaration
`@param assigns` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check and stop connectors
     *
     * @param assigns
     */
    private void checkAndStopConnectors(Collection<String> assigns) {
```

### JavadocDeclaration
`@param assigns` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check and new connectors
     *
     * @param assigns
     */
    private Map<String, ConnectKeyValue> checkAndNewConnectors(Map<String, ConnectKeyValue> assigns) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * These variables should be immutable
     *
     * @return
     */
    public Set<Runnable> getWorkingTasks() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * maintain task state
     *
     * @throws Exception
     */
    public void maintainTaskState() throws Exception {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * get connectors
     *
     * @return
     */
    public Map<String, List<ConnectKeyValue>> allocatedTasks() {
```

### JavadocDeclaration
`@param assigns` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check and transition  to connectors
     *
     * @param assigns
     */
    private void checkAndTransitionToConnectors(Map<String, ConnectKeyValue> assigns) {
```

### JavadocDeclaration
`@param ids` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * stop connectors
     *
     * @param ids
     */
    private void stopConnectors(Collection<String> ids) {
```

### JavadocDeclaration
`@param taskConfigs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * not start again. If a task is already started but not contained in the new configs, it will stop.
     *
     * @param taskConfigs
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     *
     * @param taskConfigs
     * @throws Exception
     */
    public void startTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
```

### JavadocDeclaration
Exception is not declared to be thrown by method startTasks
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     *
     * @param taskConfigs
     * @throws Exception
     */
    public void startTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
```

### JavadocDeclaration
`@param assigns` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check and reconfigure connectors
     *
     * @param assigns
     */
    private void checkAndReconfigureConnectors(Map<String, ConnectKeyValue> assigns) {
```

### JavadocDeclaration
`@param newTasks` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * start task
     *
     * @param newTasks
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     *
     * @param newTasks
     * @throws Exception
     */
    private void startTask(Map<String, List<ConnectKeyValue>> newTasks) throws Exception {
```

### JavadocDeclaration
`@param connectorConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check running task
     *
     * @param connectorConfig
     */
    private void checkRunningTasks(Map<String, List<ConnectKeyValue>> connectorConfig) {
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * get connectors
     *
     * @return
     */
    public Set<String> allocatedConnectors() {
```

### JavadocDeclaration
`@param taskConfig` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * check is need stop
     *
     * @param taskConfig
     * @param keyValues
     * @return
```

### JavadocDeclaration
`@param keyValues` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     *
     * @param taskConfig
     * @param keyValues
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param taskConfig
     * @param keyValues
     * @return
     */
    private boolean isNeedStop(ConnectKeyValue taskConfig, List<ConnectKeyValue> keyValues) {
```

### JavadocDeclaration
`@param connectorConfigs` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * it will not start again. If a connector is already started but not contained in the new configs, it will stop.
     *
     * @param connectorConfigs
     * @param connectController
     * @throws Exception
```

### JavadocDeclaration
`@param connectController` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     *
     * @param connectorConfigs
     * @param connectController
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param connectorConfigs
     * @param connectController
     * @throws Exception
     */
    public synchronized void startConnectors(Map<String, ConnectKeyValue> connectorConfigs,
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `positionInfo.getOffset()` to `Map` is redundant
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                if (positionInfo != null && null != positionInfo.getOffset()) {
                    log.info("positionInfo is not null!");
                    Map<String, ?> offset = (Map<String, String>) positionInfo.getOffset();
                    Object lastRecordedOffset = offset.get(NEXT_POSITION);
                    if (lastRecordedOffset != null) {
```

### RedundantCast
Casting `recordOffset.getOffset()` to `Map` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            return null;
        }
        Map<String, ?> offsetMap = (Map<String, String>) recordOffset.getOffset();
        Object offsetObject = offsetMap.get(QUEUE_OFFSET);
        if (null == offsetObject) {
```

### RedundantCast
Casting `value` to `byte[]` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                case BYTES:
                    if (value instanceof byte[]) {
                        return (byte[]) value;
                    } else if (value instanceof ByteBuffer) {
                        return ((ByteBuffer) value).array();
```

### RedundantCast
Casting `value` to `BigDecimal` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            public Object toConnect(final Schema schema, final Object value) {
                if (value instanceof BigDecimal) {
                    return (BigDecimal) value;
                }
                if (value instanceof byte[]) {
```

### RedundantCast
Casting `value` to `String` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                if (value instanceof String) {
                    try {
                        return Decimal.toLogical(schema, TypeUtils.castToBytes((String) value));
                    } catch (Exception e) {
                        throw new ConnectException("Invalid bytes for Decimal field", e);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `registry` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Min.java`
#### Snippet
```java

    private final Histogram histogram;
    private MetricRegistry registry;
    private MetricName name;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Min.java`
#### Snippet
```java
    private final Histogram histogram;
    private MetricRegistry registry;
    private MetricName name;

    public Min(MetricRegistry registry, MetricName name) {
```

### FieldMayBeFinal
Field `str` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricName.java`
#### Snippet
```java

public class MetricName implements Comparable<MetricName> {
    private String str;
    private String name;
    private String group;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/RateByMinutes.java`
#### Snippet
```java
    private final Meter meter;
    private MetricRegistry registry;
    private MetricName name;

    public RateByMinutes(MetricRegistry registry, MetricName name, Stat.RateType rateType) {
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/RateByMinutes.java`
#### Snippet
```java
public class RateByMinutes implements Stat {
    private final Meter meter;
    private MetricRegistry registry;
    private MetricName name;

```

### FieldMayBeFinal
Field `registry` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Rate.java`
#### Snippet
```java
public class Rate implements Stat {
    private final Meter meter;
    private MetricRegistry registry;
    private MetricName name;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Rate.java`
#### Snippet
```java
    private final Meter meter;
    private MetricRegistry registry;
    private MetricName name;

    public Rate(MetricRegistry registry, MetricName name) {
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/RatioValue.java`
#### Snippet
```java
 */
public class RatioValue implements Stat, Measure {
    private MetricRegistry registry;
    private MetricName name;
    private RatioGauge ratioGauge;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/RatioValue.java`
#### Snippet
```java
public class RatioValue implements Stat, Measure {
    private MetricRegistry registry;
    private MetricName name;
    private RatioGauge ratioGauge;

```

### FieldMayBeFinal
Field `ratioGauge` may be 'final'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/RatioValue.java`
#### Snippet
```java
    private MetricRegistry registry;
    private MetricName name;
    private RatioGauge ratioGauge;

    public RatioValue(MetricRegistry registry, MetricName name, Value numerator, Value denominator) {
```

### FieldMayBeFinal
Field `log` may be 'final'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSinkTask.java`
#### Snippet
```java
public class FileSinkTask extends SinkTask {

    private Logger log = LoggerFactory.getLogger(LoggerName.FILE_CONNECTOR);

    private FileConfig fileConfig;
```

### FieldMayBeFinal
Field `batchSize` may be 'final'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    private char[] buffer = new char[1024];
    private int offset = 0;
    private int batchSize = FileSourceConnector.DEFAULT_TASK_BATCH_SIZE;

    private Long streamOffset;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
public class FileSourceTask extends SourceTask {

    private Logger log = LoggerFactory.getLogger(LoggerName.FILE_CONNECTOR);

    private FileConfig fileConfig;
```

### FieldMayBeFinal
Field `config` may be 'final'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
    private static final Pattern COMMA_WITH_WHITESPACE = Pattern.compile("\\s*,\\s*");

    private KeyValue config;

    public ExtendKeyValue(KeyValue config) {
```

### FieldMayBeFinal
Field `shutdownTimes` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

                @Override
```

### FieldMayBeFinal
Field `shutdownTimes` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

                @Override
```

### FieldMayBeFinal
Field `dependents` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String width;
    private String displayName;
    private List<String> dependents;

    public ConfigKeyInfo(String name,
```

### FieldMayBeFinal
Field `displayName` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private int orderInGroup;
    private String width;
    private String displayName;
    private List<String> dependents;

```

### FieldMayBeFinal
Field `width` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String group;
    private int orderInGroup;
    private String width;
    private String displayName;
    private List<String> dependents;
```

### FieldMayBeFinal
Field `group` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String importance;
    private String documentation;
    private String group;
    private int orderInGroup;
    private String width;
```

### FieldMayBeFinal
Field `defaultValue` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String type;
    private boolean required;
    private String defaultValue;
    private String importance;
    private String documentation;
```

### FieldMayBeFinal
Field `orderInGroup` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String documentation;
    private String group;
    private int orderInGroup;
    private String width;
    private String displayName;
```

### FieldMayBeFinal
Field `importance` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private boolean required;
    private String defaultValue;
    private String importance;
    private String documentation;
    private String group;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
public class ConfigKeyInfo {

    private String name;
    private String type;
    private boolean required;
```

### FieldMayBeFinal
Field `documentation` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String defaultValue;
    private String importance;
    private String documentation;
    private String group;
    private int orderInGroup;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java

    private String name;
    private String type;
    private boolean required;
    private String defaultValue;
```

### FieldMayBeFinal
Field `required` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConfigKeyInfo.java`
#### Snippet
```java
    private String name;
    private String type;
    private boolean required;
    private String defaultValue;
    private String importance;
```

### FieldMayBeFinal
Field `positionManagementService` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageReaderImpl.java`
#### Snippet
```java

    private final String namespace;
    private PositionManagementService positionManagementService;

    public PositionStorageReaderImpl(String namespace, PositionManagementService positionManagementService) {
```

### FieldMayBeFinal
Field `namespace` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ExtendRecordPartition.java`
#### Snippet
```java
     * connect name
     */
    private String namespace;

    public ExtendRecordPartition(String namespace, Map<String, ?> partition) {
```

### FieldMayBeFinal
Field `serdeKey` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java

    private String configFilePath;
    private Serde serdeKey;
    private Serde serdeValue;

```

### FieldMayBeFinal
Field `configFilePath` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private String configFilePath;
    private Serde serdeKey;
    private Serde serdeValue;
```

### FieldMayBeFinal
Field `serdeValue` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
    private String configFilePath;
    private Serde serdeKey;
    private Serde serdeValue;

    public FileBaseKeyValueStore(String configFilePath,
```

### FieldMayBeFinal
Field `positionManagementService` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
    private final String namespace;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private PositionManagementService positionManagementService;
    /**
     * Offset data in Connect format
```

### FieldMayBeFinal
Field `pluginsResource` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
     * connector plugin resource
     */
    private ConnectorPluginsResource pluginsResource;

    public RestHandler(AbstractConnectController connectController) {
```

### FieldMayBeFinal
Field `printTPSInterval` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private static final int MAX_RECORDS_OF_SAMPLING = 60 * 10;

    private static int printTPSInterval = 60 * 1;

    private final ConcurrentMap<String, AtomicLong> sourceTaskTimesTotal =
```

### FieldMayBeFinal
Field `lockPut` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java

    private long connectBootTimestamp = System.currentTimeMillis();
    private ReentrantLock lockPut = new ReentrantLock();
    private ReentrantLock lockGet = new ReentrantLock();

```

### FieldMayBeFinal
Field `lockSampling` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private volatile long dispatchMaxBuffer = 0;

    private ReentrantLock lockSampling = new ReentrantLock();
    private long lastPrintTimestamp = System.currentTimeMillis();

```

### FieldMayBeFinal
Field `lockGet` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private long connectBootTimestamp = System.currentTimeMillis();
    private ReentrantLock lockPut = new ReentrantLock();
    private ReentrantLock lockGet = new ReentrantLock();

    private volatile long dispatchMaxBuffer = 0;
```

### FieldMayBeFinal
Field `connectBootTimestamp` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private final LinkedList<CallSnapshot> sinkTaskTimesList = new LinkedList<CallSnapshot>();

    private long connectBootTimestamp = System.currentTimeMillis();
    private ReentrantLock lockPut = new ReentrantLock();
    private ReentrantLock lockGet = new ReentrantLock();
```

### FieldMayBeFinal
Field `dispatchMaxBuffer` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private ReentrantLock lockGet = new ReentrantLock();

    private volatile long dispatchMaxBuffer = 0;

    private ReentrantLock lockSampling = new ReentrantLock();
```

### FieldMayBeFinal
Field `converter` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java

    private RetryWithToleranceOperator retryWithToleranceOperator;
    private RecordConverter converter;

    public WorkerErrorRecordReporter(RetryWithToleranceOperator retryWithToleranceOperator,
```

### FieldMayBeFinal
Field `retryWithToleranceOperator` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
public class WorkerErrorRecordReporter implements ErrorRecordReporter {

    private RetryWithToleranceOperator retryWithToleranceOperator;
    private RecordConverter converter;

```

### FieldMayBeFinal
Field `config` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
public class DeadLetterQueueConfig {

    private ConnectKeyValue config;

    /**
```

### FieldMayBeFinal
Field `producer` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * A RocketMQ producer to send message to dest MQ.
     */
    private DefaultMQProducer producer;
    /**
     * worker id
```

### FieldMayBeFinal
Field `config` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     * The configs of current source task.
     */
    private ConnectKeyValue config;
    /**
     * A RocketMQ producer to send message to dest MQ.
```

### FieldMayBeFinal
Field `connectorTaskId` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
     */
    private String workerId;
    private ConnectorTaskId connectorTaskId;

    /**
```

### FieldMayBeFinal
Field `metrics` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/metrics/MetricGroup.java`
#### Snippet
```java
public class MetricGroup implements AutoCloseable {
    private final LinkedHashMap<String, String> tags;
    private Set<Sensor> metrics = new HashSet<>();

    public MetricGroup(LinkedHashMap<String, String> tags) {
```

### FieldMayBeFinal
Field `errorMetricsGroup` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
    protected ProcessingContext context = new ProcessingContext();
    private long totalFailures = 0;
    private ErrorMetricsGroup errorMetricsGroup;

    public RetryWithToleranceOperator(long errorRetryTimeout,
```

### FieldMayBeFinal
Field `waitInterval` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/RebalanceService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private static long waitInterval = Long.parseLong(System.getProperty("rocketmq.runtime.cluster.rebalance.waitInterval", "20000"));

    /**
```

### FieldMayBeFinal
Field `topicName` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     * A queue to send or consume message.
     */
    private String topicName;
    /**
     * serializer and deserializer
```

### FieldMayBeFinal
Field `workerConfig` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Serde valueSerde;

    private WorkerConfig workerConfig;

    private boolean stopRequested;
```

### FieldMayBeFinal
Field `keySerde` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     * serializer and deserializer
     */
    private Serde keySerde;
    private Serde valueSerde;

```

### FieldMayBeFinal
Field `groupName` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private boolean enabledCompactTopic = false;

    private String groupName;

    public BrokerBasedLog(WorkerConfig workerConfig,
```

### FieldMayBeFinal
Field `dataSynchronizerCallback` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     * A callback to receive data from other workers.
     */
    private DataSynchronizerCallback<K, V> dataSynchronizerCallback;

    /**
```

### FieldMayBeFinal
Field `valueSerde` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
     */
    private Serde keySerde;
    private Serde valueSerde;

    private WorkerConfig workerConfig;
```

### FieldMayBeFinal
Field `waitInterval` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/StandaloneRebalanceService.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private static long waitInterval = Long.parseLong(System.getProperty("rocketmq.runtime.cluster.rebalance.waitInterval", "20000"));

    /**
```

### FieldMayBeFinal
Field `allocateConnAndTaskStrategy` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/RebalanceImpl.java`
#### Snippet
```java
     * Strategy to allocate connectors and tasks.
     */
    private AllocateConnAndTaskStrategy allocateConnAndTaskStrategy;

    public RebalanceImpl(Worker worker,
```

### FieldMayBeFinal
Field `name` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/ConverterType.java`
#### Snippet
```java
    }

    private String name;

    ConverterType() {
```

### FieldMayBeFinal
Field `klass` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginType.java`
#### Snippet
```java
    UNKNOWN(Object.class);

    private Class<?> klass;

    PluginType(Class<?> klass) {
```

### FieldMayBeFinal
Field `virtualNodes` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/AllocateConnAndTaskStrategyByConsistentHash.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private int virtualNodes;
    private HashFunction hashFunc;

```

### FieldMayBeFinal
Field `clazz` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private Class clazz;

    public ListDeserializer(Class clazz) {
```

### FieldMayBeFinal
Field `clazz` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListSerializer.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private Class clazz;

    public ListSerializer(Class clazz) {
```

### FieldMayBeFinal
Field `sinkTask` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
     * The implements of the sink task.
     */
    private SinkTask sinkTask;

    public WorkerDirectTask(WorkerConfig workerConfig,
```

### FieldMayBeFinal
Field `sourceTask` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
     * The implements of the source task.
     */
    private SourceTask sourceTask;
    /**
     * The implements of the sink task.
```

### FieldMayBeFinal
Field `numUnackedMessages` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java

    final Map<RecordPartition, Deque<SubmittedPosition>> records = new HashMap<>();
    private AtomicInteger numUnackedMessages = new AtomicInteger(0);
    private CountDownLatch messageDrainLatch;

```

### FieldMayBeFinal
Field `workerId` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/WrapperStatusListener.java`
#### Snippet
```java

    private StateManagementService managementService;
    private String workerId;

    public WrapperStatusListener(StateManagementService managementService, String workerId) {
```

### FieldMayBeFinal
Field `managementService` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/WrapperStatusListener.java`
#### Snippet
```java
public class WrapperStatusListener implements TaskStatus.Listener, ConnectorStatus.Listener {

    private StateManagementService managementService;
    private String workerId;

```

### FieldMayBeFinal
Field `serializer` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java

    private JsonDeserializer deserializer = new JsonDeserializer();
    private JsonSerializer serializer = new JsonSerializer();
    public JsonConverterConfig converterConfig;
    private Cache<Schema, JSONObject> fromConnectSchemaCache;
```

### FieldMayBeFinal
Field `deserializer` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
    }

    private JsonDeserializer deserializer = new JsonDeserializer();
    private JsonSerializer serializer = new JsonSerializer();
    public JsonConverterConfig converterConfig;
```

### FieldMayBeFinal
Field `producer` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
     * A RocketMQ producer to send message to dest MQ.
     */
    private DefaultMQProducer producer;
    private List<ConnectRecord> toSendRecord;
    private volatile RecordOffsetManagement.CommittableOffsets committableOffsets;
```

### FieldMayBeFinal
Field `metricGroup` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        private int activeRecordCount;

        private MetricGroup metricGroup;

        public SourceTaskMetricsGroup(ConnectorTaskId id, ConnectMetrics connectMetrics) {
```

### FieldMayBeFinal
Field `sinkTaskContext` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    private Set<RecordPartition> recordPartitions = new CopyOnWriteArraySet<>();
    private MessageQueueListener messageQueueListener = null;
    private WorkerSinkTaskContext sinkTaskContext;
    private WorkerErrorRecordReporter errorRecordReporter;
    /**
```

### FieldMayBeFinal
Field `keyConverter` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * A converter to parse sink data entry to object.
     */
    private RecordConverter keyConverter;
    private RecordConverter valueConverter;
    private Set<RecordPartition> recordPartitions = new CopyOnWriteArraySet<>();
```

### FieldMayBeFinal
Field `recordPartitions` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    private RecordConverter keyConverter;
    private RecordConverter valueConverter;
    private Set<RecordPartition> recordPartitions = new CopyOnWriteArraySet<>();
    private MessageQueueListener messageQueueListener = null;
    private WorkerSinkTaskContext sinkTaskContext;
```

### FieldMayBeFinal
Field `valueConverter` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     */
    private RecordConverter keyConverter;
    private RecordConverter valueConverter;
    private Set<RecordPartition> recordPartitions = new CopyOnWriteArraySet<>();
    private MessageQueueListener messageQueueListener = null;
```

### FieldMayBeFinal
Field `errorRecordReporter` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    private MessageQueueListener messageQueueListener = null;
    private WorkerSinkTaskContext sinkTaskContext;
    private WorkerErrorRecordReporter errorRecordReporter;
    /**
     * for commit
```

### FieldMayBeFinal
Field `sinkTask` may be 'final'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * The implements of the sink task.
     */
    private SinkTask sinkTask;
    /**
     * A converter to parse sink data entry to object.
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
            fileWriter = new FileWriter(file);
            fileWriter.write(str);
        } catch (IOException e) {
            throw e;
        } finally {
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `fileName`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
     */
    public static void string2File(final String str, final String fileName) throws IOException {
        synchronized (fileName) {
            String tmpFile = fileName + ".tmp";
            string2FileNotSafe(str, tmpFile);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/RestSender.java`
#### Snippet
```java
                response = client.execute(httpGet);
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity);
                return result;
            } finally {
```

### UnnecessaryLocalVariable
Local variable `recordOffset` is redundant
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        map.put(FileConstants.NEXT_POSITION, String.valueOf(pos));
        RecordOffset recordOffset = new RecordOffset(map);
        return recordOffset;
    }
```

### UnnecessaryLocalVariable
Local variable `recordPartition` is redundant
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
        Map<String, String> map = new HashMap<>();
        map.put(FILE_CONFIG, filename);
        RecordPartition recordPartition = new RecordPartition(map);
        return recordPartition;
    }
```

### UnnecessaryLocalVariable
Local variable `object` is redundant
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/util/AvroSchemaUtils.java`
#### Snippet
```java
        Schema rawSchema = schema.rawSchema();
        DatumReader<Object> reader = new GenericDatumReader<Object>(rawSchema);
        Object object = reader.read(null,
                DECODER_FACTORY.jsonDecoder(rawSchema, value));
        return object;
```

### UnnecessaryLocalVariable
Local variable `object` is redundant
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/util/AvroSchemaUtils.java`
#### Snippet
```java
            JSON_MAPPER.writeValue(out, value);
            DatumReader<Object> reader = new GenericDatumReader<Object>(rawSchema);
            Object object = reader.read(null,
                    DECODER_FACTORY.jsonDecoder(rawSchema, new ByteArrayInputStream(out.toByteArray()))
            );
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
        }

        Object value = logicalValue;
        if (schema != null && schema.getName() != null) {
            ConnectToJsonLogicalTypeConverter logicalConverter =
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
        }

        Schema result = builder.build();
        return result;
    }
```

### UnnecessaryLocalVariable
Local variable `recordPartition` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        map.put("brokerName", messageQueue.getBrokerName());
        map.put("queueId", messageQueue.getQueueId() + "");
        RecordPartition recordPartition = new RecordPartition(map);
        return recordPartition;
    }
```

### UnnecessaryLocalVariable
Local variable `recordPartition` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        map.put("brokerName", brokerName);
        map.put("queueId", queueId + "");
        RecordPartition recordPartition = new RecordPartition(map);
        return recordPartition;
    }
```

### UnnecessaryLocalVariable
Local variable `recordOffset` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        Map<String, String> offsetMap = new HashMap<>();
        offsetMap.put(QUEUE_OFFSET, offset + "");
        RecordOffset recordOffset = new RecordOffset(offsetMap);
        return recordOffset;
    }
```

### UnnecessaryLocalVariable
Local variable `list` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
        try {
            String json = new String(data, "UTF-8");
            List list = JSONArray.parseArray(json, clazz);
            return list;
        } catch (UnsupportedEncodingException e) {
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordOffsetDeserializer.java`
#### Snippet
```java
        try {
            String text = new String(data, "UTF-8");
            RecordOffset res = JSON.parseObject(text, RecordOffset.class);
            return res;
        } catch (UnsupportedEncodingException e) {
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPartitionDeserializer.java`
#### Snippet
```java
        try {
            String text = new String(data, "UTF-8");
            ExtendRecordPartition res = JSON.parseObject(text, ExtendRecordPartition.class);
            return res;
        } catch (UnsupportedEncodingException e) {
```

### UnnecessaryLocalVariable
Local variable `transform` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            savedLoader = Plugin.compareAndSwapLoaders(loader);
            Class transformClazz = Utils.getContextCurrentClassLoader().loadClass(transformClass);
            final Transform transform = (Transform) transformClazz.getDeclaredConstructor().newInstance();
            return transform;
        } catch (Exception ex) {
```

### UnnecessaryLocalVariable
Local variable `sb` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
    @Override
    public String toString() {
        String sb = "connectorName:" + connectorName +
            "\nConfigs:" + JSON.toJSONString(keyValue);
        return sb;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalPositionManagementServiceImpl.java`
#### Snippet
```java
            if (committing.get()) {
                try {
                    sleep(1000);
                    continue;
                } catch (InterruptedException e) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
public class ConnectorPluginsResource {

    static final List<Class<? extends SinkConnector>> SINK_CONNECTOR_EXCLUDES = Arrays.asList();
    static final List<Class<? extends SourceConnector>> SOURCE_CONNECTOR_EXCLUDES = Arrays.asList();
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java

    static final List<Class<? extends SinkConnector>> SINK_CONNECTOR_EXCLUDES = Arrays.asList();
    static final List<Class<? extends SourceConnector>> SOURCE_CONNECTOR_EXCLUDES = Arrays.asList();
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
    private final AbstractConnectController connectController;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            JSONObject jsonSchemaParams = new JSONObject();
            for (Map.Entry<String, String> prop : schema.getParameters().entrySet()) {
                jsonSchemaParams.put(prop.getKey(), prop.getValue());
            }
            jsonSchema.put(JsonSchema.SCHEMA_PARAMETERS_FIELD_NAME, jsonSchemaParams);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java

    public static MessageQueue parseMessageQueueList(String messageQueueStr) {
        List<String> messageQueueStrList = Splitter.on(SEMICOLON).omitEmptyStrings().trimResults().splitToList(messageQueueStr);
        if (CollectionUtils.isEmpty(messageQueueStrList) || messageQueueStrList.size() != 3) {
            return null;
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java
            return null;
        }
        List<String> topicList = Splitter.on(SEMICOLON).omitEmptyStrings().trimResults().splitToList(messageQueueStr);
        return new HashSet<>(topicList);
    }
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            return;
        }
        List<String> transformList = Splitter.on(COMMA).omitEmptyStrings().trimResults().splitToList(transformsStr);
        if (CollectionUtils.isEmpty(transformList)) {
            log.warn("transforms config is null, {}", JSON.toJSONString(config));
```

