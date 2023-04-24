# rocketmq-connect 
 
# Bad smells
I found 726 bad smells with 94 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 127 | false |
| BoundedWildcard | 46 | false |
| SynchronizeOnThis | 32 | false |
| MissortedModifiers | 31 | false |
| UtilityClassWithoutPrivateConstructor | 30 | true |
| UnnecessaryBoxing | 30 | false |
| RedundantFieldInitialization | 27 | false |
| ConstantValue | 25 | false |
| SystemOutErr | 24 | false |
| KeySetIterationMayUseEntrySet | 20 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 17 | false |
| AssignmentToMethodParameter | 17 | false |
| DataFlowIssue | 16 | false |
| CodeBlock2Expr | 15 | true |
| UnnecessaryLocalVariable | 15 | true |
| SizeReplaceableByIsEmpty | 14 | true |
| NonProtectedConstructorInAbstractClass | 14 | true |
| PublicFieldAccessedInSynchronizedContext | 13 | false |
| UnnecessaryFullyQualifiedName | 13 | false |
| ThrowablePrintStackTrace | 13 | false |
| CharsetObjectCanBeUsed | 12 | false |
| WrapperTypeMayBePrimitive | 11 | false |
| Convert2MethodRef | 10 | false |
| ZeroLengthArrayInitialization | 9 | false |
| StringBufferReplaceableByString | 8 | false |
| RedundantMethodOverride | 8 | false |
| UnusedAssignment | 8 | false |
| EmptyMethod | 7 | false |
| CatchMayIgnoreException | 7 | false |
| TrivialStringConcatenation | 6 | false |
| StringConcatenationInsideStringBufferAppend | 6 | false |
| FieldMayBeStatic | 6 | false |
| WhileCanBeForeach | 5 | false |
| UnnecessaryQualifierForThis | 5 | false |
| IgnoreResultOfCall | 5 | false |
| InstanceofCatchParameter | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| ObjectNotify | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| DoubleBraceInitialization | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| Java8MapApi | 3 | false |
| Convert2Lambda | 3 | false |
| UnstableApiUsage | 3 | false |
| AbstractClassNeverImplemented | 2 | false |
| DuplicateCondition | 2 | false |
| UnnecessaryUnboxing | 2 | false |
| NestedAssignment | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| WaitNotInLoop | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| MagicConstant | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| StaticCallOnSubclass | 1 | false |
| ManualArrayCopy | 1 | false |
| NumberEquality | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UtilityClassWithPublicConstructor | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ExcessiveRangeCheck | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| BusyWait | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (schemaType) { case INT8: case INT16: case IN...` statement on enum type 'io.openmessaging.connector.api.data.FieldType' misses case 'DATETIME'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
switch (schemaType) {
                case INT8:
                case INT16:
                case INT32:
                case INT64:
                case FLOAT32:
                case FLOAT64:
                case BOOLEAN:
                case STRING:
                    return value;
                case BYTES:
                    if (value instanceof byte[]) {
                        return (byte[]) value;
                    } else if (value instanceof ByteBuffer) {
                        return ((ByteBuffer) value).array();
                    } else {
                        throw new ConnectException("Invalid type for bytes type: " + value.getClass());
                    }
                case ARRAY: {
                    Collection collection = (Collection) value;
                    List list = new ArrayList();
                    for (Object elem : collection) {
                        Schema valueSchema = schema == null ? null : schema.getValueSchema();
                        Object fieldValue = convertToJson(valueSchema, elem);
                        list.add(fieldValue);
                    }
                    return list;
                }
                case MAP: {
                    Map<?, ?> map = (Map<?, ?>) value;
                    boolean objectMode;
                    if (schema == null) {
                        objectMode = true;
                        for (Map.Entry<?, ?> entry : map.entrySet()) {
                            if (!(entry.getKey() instanceof String)) {
                                objectMode = false;
                                break;
                            }
                        }
                    } else {
                        objectMode = schema.getKeySchema().getFieldType() == FieldType.STRING;
                    }

                    JSONArray resultArray = new JSONArray();
                    Map<String, Object> resultMap = new HashMap<>();
                    for (Map.Entry<?, ?> entry : map.entrySet()) {
                        Schema keySchema = schema == null ? null : schema.getKeySchema();
                        Schema valueSchema = schema == null ? null : schema.getValueSchema();
                        Object mapKey = convertToJson(keySchema, entry.getKey());
                        Object mapValue = convertToJson(valueSchema, entry.getValue());
                        if (objectMode) {
                            resultMap.put((String) mapKey, mapValue);
                        } else {
                            JSONArray entryArray = new JSONArray();
                            entryArray.add(0, mapKey);
                            entryArray.add(1, mapValue);
                            resultArray.add(entryArray);
                        }
                    }
                    return objectMode ? resultMap : resultArray;
                }
                case STRUCT: {
                    Struct struct = (Struct) value;
                    if (!struct.schema().equals(schema)) {
                        throw new ConnectException("Mismatching schema.");
                    }
                    JSONObject obj = new JSONObject(new LinkedHashMap());
                    for (Field field : struct.schema().getFields()) {
                        obj.put(field.getName(), convertToJson(field.getSchema(), struct.get(field)));
                    }
                    return obj;
                }
            }
```

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

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `parseArray()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONArray'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
        try {
            String json = new String(data, "UTF-8");
            List list = JSONArray.parseArray(json, clazz);
            return list;
        } catch (UnsupportedEncodingException e) {
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
        Iterator<ClusterManagementService> clusterManagementServiceIterator = clusterManagementServiceServiceLoader.iterator();

        while (clusterManagementServiceIterator.hasNext()) {
            ClusterManagementService currentClusterManagementService = clusterManagementServiceIterator.next();
            if (currentClusterManagementService.getClass().getName().equals(clusterManagementServiceClazz)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
        ServiceLoader<ConfigManagementService> configManagementServiceServiceLoader = ServiceLoader.load(ConfigManagementService.class);
        Iterator<ConfigManagementService> configManagementServiceIterator = configManagementServiceServiceLoader.iterator();
        while (configManagementServiceIterator.hasNext()) {
            ConfigManagementService currentConfigManagementService = configManagementServiceIterator.next();
            if (currentConfigManagementService.getClass().getName().equals(configManagementServiceClazz)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
        ServiceLoader<StateManagementService> stateManagementServices = ServiceLoader.load(StateManagementService.class);
        Iterator<StateManagementService> stateManagementServiceIterator = stateManagementServices.iterator();
        while (stateManagementServiceIterator.hasNext()) {
            StateManagementService currentStateManagementService = stateManagementServiceIterator.next();
            if (currentStateManagementService.getClass().getName().equals(stateManagementServiceClazz)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
        ServiceLoader<PositionManagementService> positionManagementServiceServiceLoader = ServiceLoader.load(PositionManagementService.class);
        Iterator<PositionManagementService> positionManagementServiceIterator = positionManagementServiceServiceLoader.iterator();
        while (positionManagementServiceIterator.hasNext()) {
            PositionManagementService currentPositionManagementService = positionManagementServiceIterator.next();
            if (currentPositionManagementService.getClass().getName().equals(positionManagementServiceClazz)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            Iterator<Map.Entry<String, Object>> paramIt =
                    ((Map<String, Object>) parameters).entrySet().iterator();
            while (paramIt.hasNext()) {
                Map.Entry<String, Object> field = paramIt.next();
                Object jsonValue = field.getValue();
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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
        Map<String, String> map = JSON.parseObject(json, Map.class);
        ConnectKeyValue keyValue = new ConnectKeyValue();
        for (String key : map.keySet()) {
            keyValue.put(key, map.get(key));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
        Map<K, V> resultMap = new HashMap<>();
        Map<String, String> map = JSON.parseObject(jsonString, Map.class);
        for (String key : map.keySet()) {
            K decodeKey = (K) serdeKey.deserializer().deserialize("", Base64Util.base64Decode(key));
            V decodeValue = (V) serdeValue.deserializer().deserialize("", Base64Util.base64Decode(map.get(key)));
```

### KeySetIterationMayUseEntrySet
Iteration over `data.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
    public String encode() {
        Map<String, String> map = new HashMap<>();
        for (K key : data.keySet()) {
            byte[] keyByte = serdeKey.serializer().serialize("", key);
            byte[] valueByte = serdeValue.serializer().serialize("", data.get(key));
```

### KeySetIterationMayUseEntrySet
Iteration over `keyValue.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java

        ConnectKeyValue configs = new ConnectKeyValue();
        for (Object key : keyValue.keySet()) {
            configs.put((String) key, keyValue.get(key).toString());
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
        for (Map<String, String> map : list) {
            ConnectKeyValue keyValue = new ConnectKeyValue();
            for (String key : map.keySet()) {
                keyValue.put(key, map.get(key));
            }
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
        Map<String, String> map = JSON.parseObject(json, Map.class);
        ConnectKeyValue keyValue = new ConnectKeyValue();
        for (String key : map.keySet()) {
            keyValue.put(key, map.get(key));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `connectorConfigs.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java

        Map<String, ConnectKeyValue> transferedConnectorConfigs = new HashMap<>();
        for (String key : connectorConfigs.keySet()) {
            transferedConnectorConfigs.put(key, stringToKeyValue(connectorConfigs.get(key)));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `taskConfigs.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
        }
        Map<String, List<ConnectKeyValue>> transferedTasksConfigs = new HashMap<>();
        for (String key : taskConfigs.keySet()) {
            transferedTasksConfigs.put(key, stringToKeyValueList(taskConfigs.get(key)));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedConnectorConfigs.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java
        log.debug("SortedTaskConfigs: {}", sortedTaskConfigs);
        int index = 0;
        for (String connectorName : sortedConnectorConfigs.keySet()) {
            String allocatedWorker = sortedWorkers.get(index % sortedWorkers.size());
            index++;
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedTaskConfigs.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java
            allocateResult.getConnectorConfigs().put(connectorName, sortedConnectorConfigs.get(connectorName));
        }
        for (String connectorName : sortedTaskConfigs.keySet()) {
            for (ConnectKeyValue keyValue : sortedTaskConfigs.get(connectorName)) {
                String allocatedWorker = sortedWorkers.get(index % sortedWorkers.size());
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java

        Map<String, T> sortedMap = new TreeMap<>();
        for (String key : map.keySet()) {
            sortedMap.put(key, map.get(key));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapDeserializer.java`
#### Snippet
```java
            String rawString = new String(data, "UTF-8");
            Map<String, String> map = JSON.parseObject(rawString, Map.class);
            for (String key : map.keySet()) {
                ExtendRecordPartition recordPartition = JSON.parseObject(key, ExtendRecordPartition.class);
                RecordOffset recordOffset = JSON.parseObject(map.get(key), RecordOffset.class);
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
     */
    R filter(R record, Map map) {
        for (Object field : map.keySet()) {
            if (!this.fields.contains(field)) {
                continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `input.keySet()` may be replaced with 'entrySet()' iteration
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternRename.java`
#### Snippet
```java
    protected SchemaAndValue processMap(R record, Map<String, Object> input) {
        final Map<String, Object> outputMap = new LinkedHashMap<>(input.size());
        for (final String inputFieldName : input.keySet()) {
            log.trace("process() - Processing field '{}'", inputFieldName);
            final Matcher fieldMatcher = this.config.pattern.matcher(inputFieldName);
```

### KeySetIterationMayUseEntrySet
Iteration over `newConnectors.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java

        //Step 4: start connectors
        for (String connectorName : newConnectors.keySet()) {
            ClassLoader savedLoader = plugin.currentThreadLoader();
            try {
```

### KeySetIterationMayUseEntrySet
Iteration over `taskConfigs.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private Map<String, List<ConnectKeyValue>> newTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
        Map<String, List<ConnectKeyValue>> newTasks = new HashMap<>();
        for (String connectorName : taskConfigs.keySet()) {
            for (ConnectKeyValue keyValue : taskConfigs.get(connectorName)) {
                boolean isNewTask = !isConfigInSet(keyValue, runningTasks) && !isConfigInSet(keyValue, pendingTasks.keySet()) && !isConfigInSet(keyValue, errorTasks);
```

### KeySetIterationMayUseEntrySet
Iteration over `newTasks.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     */
    private void startTask(Map<String, List<ConnectKeyValue>> newTasks) throws Exception {
        for (String connectorName : newTasks.keySet()) {
            for (ConnectKeyValue keyValue : newTasks.get(connectorName)) {
                int taskId = keyValue.getInt(ConnectorConfig.TASK_ID);
```

### KeySetIterationMayUseEntrySet
Iteration over `assigns.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            return;
        }
        for (String connectName : assigns.keySet()) {
            if (!connectors.containsKey(connectName)) {
                // new
```

### KeySetIterationMayUseEntrySet
Iteration over `assigns.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            return;
        }
        for (String connectName : assigns.keySet()) {
            if (!connectors.containsKey(connectName)) {
                // new
```

### KeySetIterationMayUseEntrySet
Iteration over `assigns.keySet()` may be replaced with 'entrySet()' iteration
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java

        Map<String, ConnectKeyValue> newConnectors = new HashMap<>();
        for (String connectName : assigns.keySet()) {
            if (!connectors.containsKey(connectName)) {
                newConnectors.put(connectName, assigns.get(connectName));
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `WorkerSourceTask` on 'this' is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        Future<Void> flushFuture = positionStorageWriter.doFlush((error, key, result) -> {
            if (error != null) {
                log.error("{} Failed to flush offsets to storage: ", WorkerSourceTask.this, error);
            } else {
                log.trace("{} Finished flushing offsets to storage", WorkerSourceTask.this);
```

### UnnecessaryQualifierForThis
Qualifier `WorkerSourceTask` on 'this' is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
                log.error("{} Failed to flush offsets to storage: ", WorkerSourceTask.this, error);
            } else {
                log.trace("{} Finished flushing offsets to storage", WorkerSourceTask.this);
            }
        });
```

### UnnecessaryQualifierForThis
Qualifier `WorkerSourceTask` on 'this' is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
            log.trace(
                    "Ignoring failed record send: {} failed to send record to {}: ",
                    WorkerSourceTask.this,
                    topic,
                    e
```

### UnnecessaryQualifierForThis
Qualifier `WorkerSourceTask` on 'this' is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
            commitTaskRecord(preTransformRecord, null);
        } else {
            log.error("{} failed to send record to {}: ", WorkerSourceTask.this, topic, e);
            log.trace("{} Failed record: {}", WorkerSourceTask.this, preTransformRecord);
            producerSendException.compareAndSet(null, e);
```

### UnnecessaryQualifierForThis
Qualifier `WorkerSourceTask` on 'this' is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        } else {
            log.error("{} failed to send record to {}: ", WorkerSourceTask.this, topic, e);
            log.trace("{} Failed record: {}", WorkerSourceTask.this, preTransformRecord);
            producerSendException.compareAndSet(null, e);
        }
```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                log.error("Failed to close FileStreamSourceTask stream: ", e);
            }
            this.notify();
        }
    }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
            preEmptedStateChangeCallback = this.targetStateChangeCallback.getAndSet(stateChangeCallback);
            preEmptedState = targetStateChange.getAndSet(targetState);
            notify();
        }
        if (preEmptedStateChangeCallback != null) {
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
        log.info("Scheduled shutdown for {}", this);
        stopping = true;
        notify();
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`jsonString.length() > 0` can be replaced with '!jsonString.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
            fileName = this.configFilePath;
            String jsonString = FileAndPropertyUtil.file2String(fileName + ".bak");
            if (jsonString != null && jsonString.length() > 0) {
                this.decode(jsonString);
                log.info("load " + fileName + " OK");
```

### SizeReplaceableByIsEmpty
`jsonString.length() == 0` can be replaced with 'jsonString.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/FileBaseKeyValueStore.java`
#### Snippet
```java
            String jsonString = FileAndPropertyUtil.file2String(fileName);

            if (null == jsonString || jsonString.length() == 0) {
                return this.loadBak();
            } else {
```

### SizeReplaceableByIsEmpty
`0 == keyValueList.size()` can be replaced with 'keyValueList.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java

        List<Map<String, String>> resList = new ArrayList<>();
        if (null == keyValueList || 0 == keyValueList.size()) {
            return JSON.toJSONString(resList);
        }
```

### SizeReplaceableByIsEmpty
`exist.size() > 0` can be replaced with '!exist.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
    protected void putTaskConfigs(String connectorName, List<ConnectKeyValue> configs) {
        List<ConnectKeyValue> exist = taskKeyValueStore.get(connectorName);
        if (null != exist && exist.size() > 0) {
            taskKeyValueStore.remove(connectorName);
        }
```

### SizeReplaceableByIsEmpty
`exist.size() > 0` can be replaced with '!exist.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
    protected void putTaskConfigs(String connectorName, List<ConnectKeyValue> configs) {
        List<ConnectKeyValue> exist = taskKeyValueStore.get(connectorName);
        if (null != exist && exist.size() > 0) {
            taskKeyValueStore.remove(connectorName);
        }
```

### SizeReplaceableByIsEmpty
`0 == allWorker.size()` can be replaced with 'allWorker.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java
                                       Map<String, List<ConnectKeyValue>> taskConfigs) {
        ConnAndTaskConfigs allocateResult = new ConnAndTaskConfigs();
        if (null == allWorker || 0 == allWorker.size()) {
            return allocateResult;
        }
```

### SizeReplaceableByIsEmpty
`0 == allWorker.size()` can be replaced with 'allWorker.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/AllocateConnAndTaskStrategyByConsistentHash.java`
#### Snippet
```java
                                       Map<String, ConnectKeyValue> connectorConfigs, Map<String, List<ConnectKeyValue>> taskConfigs) {
        ConnAndTaskConfigs allocateResult = new ConnAndTaskConfigs();
        if (null == allWorker || 0 == allWorker.size()) {
            return allocateResult;
        }
```

### SizeReplaceableByIsEmpty
`transformList.size() == 0` can be replaced with 'transformList.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java

    public R doTransforms(R connectRecord) {
        if (transformList.size() == 0) {
            return connectRecord;
        }
```

### SizeReplaceableByIsEmpty
`recordPartitions.size() == 0` can be replaced with 'recordPartitions.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
    @Override
    public void pause(List<RecordPartition> recordPartitions) {
        if (recordPartitions == null || recordPartitions.size() == 0) {
            log.warn("recordPartitions is null or recordPartitions.size() is zero. recordPartitions {}", JSON.toJSONString(recordPartitions));
            return;
```

### SizeReplaceableByIsEmpty
`recordPartitions.size() == 0` can be replaced with 'recordPartitions.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTaskContext.java`
#### Snippet
```java
    @Override
    public void resume(List<RecordPartition> recordPartitions) {
        if (recordPartitions == null || recordPartitions.size() == 0) {
            log.warn("recordPartitions is null or recordPartitions.size() is zero. recordPartitions {}", JSON.toJSONString(recordPartitions));
            return;
```

### SizeReplaceableByIsEmpty
`toSendRecord.size() > 0` can be replaced with '!toSendRecord.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
                    long start = System.currentTimeMillis();
                    toSendRecord = poll();
                    if (null != toSendRecord && toSendRecord.size() > 0) {
                        recordPollReturned(toSendRecord.size(), System.currentTimeMillis() - start);
                    }
```

### SizeReplaceableByIsEmpty
`parameters.size() > 0` can be replaced with '!parameters.isEmpty()'
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
                        .filter(e -> !e.getKey().startsWith(NAMESPACE))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                if (parameters.size() > 0) {
                    unprocessedProps.put(CONNECT_PARAMETERS_PROP, parameters);
                }
```

### SizeReplaceableByIsEmpty
`decimalFields.size() == 0` can be replaced with 'decimalFields.isEmpty()'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/SetMaximumPrecision.java`
#### Snippet
```java
                State result;

                if (decimalFields.size() == 0) {
                    result = NOOP;
                } else {
```

### SizeReplaceableByIsEmpty
`messageQueues.size() == 0` can be replaced with 'messageQueues.isEmpty()'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
                long startTimeStamp = System.currentTimeMillis();
                log.info("START pullMessageFromQueues, time started : {}", startTimeStamp);
                if (messageQueues.size() == 0) {
                    log.info("messageQueuesOffsetMap is null, : {}", startTimeStamp);
                    stopPullMsgLatch.await(PULL_MSG_ERROR_BACKOFF_MS, TimeUnit.MILLISECONDS);
```

## RuleId[id=StringBufferReplaceableByString]
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

    private String getTotalTps() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getTotalTps(10));
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
`StringBuilder` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createGroupName(String prefix, String postfix) {
        return new StringBuilder().append(prefix).append("-").append(postfix).toString();
    }

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
`StringBuffer` can be replaced with 'String'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static String createUniqInstance(String prefix) {
        return new StringBuffer(prefix).append("-").append(UUID.randomUUID().toString()).toString();
    }

```

### StringBufferReplaceableByString
`StringBuffer` can be replaced with 'String'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java

    public static String createUniqInstance(String prefix) {
        return new StringBuffer(prefix).append("-").append(UUID.randomUUID()).toString();
    }

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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MetricsReporter` has no concrete subclass
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricsReporter.java`
#### Snippet
```java
 * rocketmq exporter
 */
public abstract class MetricsReporter implements Reporter, MetricRegistryListener, AutoConfiguration, IReporter {
    private final MetricRegistry registry;

```

### AbstractClassNeverImplemented
Abstract class `RegexRouter` has no concrete subclass
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/RegexRouter.java`
#### Snippet
```java
 * @param <R>
 */
public abstract class RegexRouter<R extends ConnectRecord> extends BaseTransformation<R> {
    private static final Logger LOG = LoggerFactory.getLogger(RegexRouter.class);
    public static final String TOPIC = "topic";
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PluginWrapper`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
    }

    private <T> void addConnectorPlugins(Collection<PluginWrapper<T>> plugins, Collection<Class<? extends T>> excludes) {
        plugins.stream()
                .filter(p -> !excludes.contains(p.pluginClass()))
```

### BoundedWildcard
Can generalize to `? extends K`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/MemoryBasedKeyValueStore.java`
#### Snippet
```java

    @Override
    public void putAll(Map<K, V> map) {
        data.putAll(map);
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/MemoryBasedKeyValueStore.java`
#### Snippet
```java

    @Override
    public void putAll(Map<K, V> map) {
        data.putAll(map);
    }
```

### BoundedWildcard
Can generalize to `? extends Runnable`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java


    private Set<Object> convertWorkerTaskToString(Set<Runnable> tasks) {
        Set<Object> result = new HashSet<>();
        for (Runnable task : tasks) {
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
    }

    public static String keyValueListToString(List<ConnectKeyValue> keyValueList) {

        List<Map<String, String>> resList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
     * Look up a class by name.
     */
    public static <T> Class<? extends T> loadClass(String klass, Class<T> base) throws ClassNotFoundException {
        return Class.forName(klass, true, Utils.getContextCurrentClassLoader()).asSubclass(base);
    }
```

### BoundedWildcard
Can generalize to `? extends Map`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/ClusterConfigState.java`
#### Snippet
```java

    public ClusterConfigState(Map<String, Integer> connectorTaskCounts,
                              Map<String, Map<String, String>> connectorConfigs,
                              Map<String, TargetState> connectorTargetStates,
                              Map<ConnectorTaskId, Map<String, String>> taskConfigs) {
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    public static Map<MessageQueue, Long> searchOffsetsByTimestamp(
        WorkerConfig config,
        Collection<MessageQueue> messageQueues,
        Long timestamp) {
        Map<MessageQueue, Long> offsets = Maps.newConcurrentMap();
```

### BoundedWildcard
Can generalize to `? extends ExtendRecordPartition`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java

    @Override
    public void removePosition(List<ExtendRecordPartition> partitions) {
        if (null == partitions) {
            return;
```

### BoundedWildcard
Can generalize to `? super T`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/NumberConverter.java`
#### Snippet
```java
     * @param deserializer the deserializer; may not be null
     */
    protected NumberConverter(String typeName, Schema schema, Serializer<T> serializer, Deserializer<T> deserializer) {
        this.typeName = typeName;
        this.schema = schema;
```

### BoundedWildcard
Can generalize to `? extends ExtendRecordPartition`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/FilePositionManagementServiceImpl.java`
#### Snippet
```java

    @Override
    public void removePosition(List<ExtendRecordPartition> partitions) {
        if (null == partitions) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java
    }

    private <T> Map<String, T> getSortedMap(Map<String, T> map) {

        Map<String, T> sortedMap = new TreeMap<>();
```

### BoundedWildcard
Can generalize to `? extends MessageExt`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    }

    private void deliverRecords(List<MessageExt> records) {
        for (MessageExt message : records) {
            log.info("Received one message: {}, topic is {}", message.getMsgId() + "\n", topicName);
```

### BoundedWildcard
Can generalize to `? super K`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                          String topicName,
                          String groupName,
                          DataSynchronizerCallback<K, V> dataSynchronizerCallback,
                          Serde keySerde,
                          Serde valueSerde,
```

### BoundedWildcard
Can generalize to `? super V`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                          String topicName,
                          String groupName,
                          DataSynchronizerCallback<K, V> dataSynchronizerCallback,
                          Serde keySerde,
                          Serde valueSerde,
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/AllocateConnAndTaskStrategyByConsistentHash.java`
#### Snippet
```java
    @Override
    public ConnAndTaskConfigs allocate(List<String> allWorker, String curWorker,
                                       Map<String, ConnectKeyValue> connectorConfigs, Map<String, List<ConnectKeyValue>> taskConfigs) {
        ConnAndTaskConfigs allocateResult = new ConnAndTaskConfigs();
        if (null == allWorker || 0 == allWorker.size()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/Plugin.java`
#### Snippet
```java
    }

    public <T> List<T> newPlugins(List<String> klassNames, ConnectKeyValue config, Class<T> pluginKlass) {
        List<T> plugins = new ArrayList<>();
        if (klassNames != null) {
```

### BoundedWildcard
Can generalize to `? extends PluginWrapper`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginUtils.java`
#### Snippet
```java
    public static <U> boolean isAliasUnique(
            PluginWrapper<U> alias,
            Collection<PluginWrapper<U>> plugins
    ) {
        boolean matched = false;
```

### BoundedWildcard
Can generalize to `? extends PluginWrapper`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
    }

    private <T> void addPlugins(Collection<PluginWrapper<T>> plugins, ClassLoader loader) {
        for (PluginWrapper<T> plugin : plugins) {
            String pluginClassName = plugin.className();
```

### BoundedWildcard
Can generalize to `? extends ConnectRecord`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java


    private void sendRecord(Collection<ConnectRecord> sourceDataEntries) {
        List<ConnectRecord> records = new ArrayList<>(sourceDataEntries.size());
        List<RecordOffsetManagement.SubmittedPosition> positions = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends SubmittedPosition`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
    }

    private boolean canCommitHead(Deque<SubmittedPosition> submittedPositions) {
        return submittedPositions.peek() != null && submittedPositions.peek().getAcked();
    }
```

### BoundedWildcard
Can generalize to `? super ConnectorTaskId`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/SourceTaskOffsetCommitter.java`
#### Snippet
```java
    SourceTaskOffsetCommitter(WorkerConfig config,
                              ScheduledExecutorService commitExecutorService,
                              ConcurrentMap<ConnectorTaskId, ScheduledFuture<?>> committers) {
        this.config = config;
        this.commitExecutorService = commitExecutorService;
```

### BoundedWildcard
Can generalize to `? extends SchemaRecordDto`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaRegistryClient.java`
#### Snippet
```java

    @Override
    protected SchemaRecordDto compareAndGet(List<SchemaRecordDto> schemaRecordAllVersion, String schemaName, ParsedSchema schema) {
        JsonSchema currentJsonSchema = (JsonSchema) schema;
        SchemaRecordDto matchSchemaRecord = null;
```

### BoundedWildcard
Can generalize to `? super TargetState`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
    }

    void doTransitionTo(TargetState targetState, Callback<TargetState> stateChangeCallback) {
        if (state == State.FAILED) {
            stateChangeCallback.onCompletion(
```

### BoundedWildcard
Can generalize to `? extends SchemaRecordDto`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroSchemaRegistryClient.java`
#### Snippet
```java

    @Override
    protected SchemaRecordDto compareAndGet(List<SchemaRecordDto> schemaRecordAllVersion, String schemaName, ParsedSchema schema) {
        AvroSchema currentAvroSchema = (AvroSchema) schema;
        SchemaRecordDto matchSchemaRecord = null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
     * @return
     */
    public <T> List<T> getList(String s, Class<T> clazz) {
        List configs = getList(s);
        List<T> castConfigs = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends MetricName`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param timers
     */
    private void reportTimers(SortedMap<MetricName, Timer> timers) {
        timers.forEach((name, timer) -> {
            send(name, timer.getMeanRate());
```

### BoundedWildcard
Can generalize to `? extends Timer`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param timers
     */
    private void reportTimers(SortedMap<MetricName, Timer> timers) {
        timers.forEach((name, timer) -> {
            send(name, timer.getMeanRate());
```

### BoundedWildcard
Can generalize to `? extends MetricName`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param counters
     */
    private void reportCounters(SortedMap<MetricName, Long> counters) {
        counters.forEach((name, value) -> {
            send(name, Double.parseDouble(value.toString()));
```

### BoundedWildcard
Can generalize to `? extends MetricName`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param meters
     */
    private void reportMeters(SortedMap<MetricName, Double> meters) {
        meters.forEach((name, value) -> {
            send(name, value);
```

### BoundedWildcard
Can generalize to `? extends MetricName`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param histograms
     */
    private void reportHistograms(SortedMap<MetricName, Double> histograms) {
        histograms.forEach((name, value) -> {
            send(name, value);
```

### BoundedWildcard
Can generalize to `? extends MetricName`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     * @param gauges
     */
    private void reportGauges(SortedMap<MetricName, Object> gauges) {
        gauges.forEach((name, value) -> {
            send(name, Double.parseDouble(value.toString()));
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * @param committedOffsets
     */
    private void onCommitCompleted(Throwable error, long seqno, Map<MessageQueue, Long> committedOffsets) {
        if (commitSeqno != seqno) {
            // skip this commit
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * @param taskProvidedOffsets
     */
    private void compareAndCommit(Map<MessageQueue, Long> offsetsToCommit, Map<MessageQueue, Long> lastCommittedQueuesOffsets, Map<MessageQueue, Long> taskProvidedOffsets) {

        //Get all assign topic message queue
```

### BoundedWildcard
Can generalize to `? extends MessageExt`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
     * @param messages
     */
    private void receiveMessages(List<MessageExt> messages) {
        if (messageBatch.isEmpty()) {
            originalOffsets.clear();
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    }

    public void assignMessageQueue(Set<MessageQueue> queues) {
        if (queues == null) {
            return;
```

### BoundedWildcard
Can generalize to `? extends List`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    }

    private Map<String, List<ConnectKeyValue>> newTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
        Map<String, List<ConnectKeyValue>> newTasks = new HashMap<>();
        for (String connectorName : taskConfigs.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @throws Exception
     */
    private void startTask(Map<String, List<ConnectKeyValue>> newTasks) throws Exception {
        for (String connectorName : newTasks.keySet()) {
            for (ConnectKeyValue keyValue : newTasks.get(connectorName)) {
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param assigns
     */
    private void checkAndTransitionToConnectors(Map<String, ConnectKeyValue> assigns) {
        if (assigns == null || assigns.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param assigns
     */
    private void checkAndReconfigureConnectors(Map<String, ConnectKeyValue> assigns) {
        if (assigns == null || assigns.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends List`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param connectorConfig
     */
    private void checkRunningTasks(Map<String, List<ConnectKeyValue>> connectorConfig) {
        //  STEP 1: check running tasks and put to error status
        for (Runnable runnable : runningTasks) {
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @param assigns
     */
    private Map<String, ConnectKeyValue> checkAndNewConnectors(Map<String, ConnectKeyValue> assigns) {
        if (assigns == null || assigns.isEmpty()) {
            return new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Runnable`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    }

    private boolean isConfigInSet(ConnectKeyValue keyValue, Set<Runnable> set) {
        for (Runnable runnable : set) {
            ConnectKeyValue taskConfig = null;
```

### BoundedWildcard
Can generalize to `? extends ConnectKeyValue`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     * @return
     */
    private boolean isNeedStop(ConnectKeyValue taskConfig, List<ConnectKeyValue> keyValues) {
        if (CollectionUtils.isEmpty(keyValues)) {
            return true;
```

### BoundedWildcard
Can generalize to `? extends CyclicSchemaWrapper`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

    private CyclicSchemaWrapper cyclicSchemaWrapper(
            Map<org.apache.avro.Schema, CyclicSchemaWrapper> toConnectCycles,
            org.apache.avro.Schema memberSchema,
            boolean optional) {
```

### BoundedWildcard
Can generalize to `? super org.apache.avro.Schema.Field`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

    private void addAvroRecordField(
            List<org.apache.avro.Schema.Field> fields,
            String fieldName,
            Schema fieldSchema,
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java

    public static final String SYS_TASK_CG_PREFIX = "connect-";
    private final static AtomicLong GROUP_POSTFIX_ID = new AtomicLong(0);

    public static String createGroupName(String prefix) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/WrapperSerde.java`
#### Snippet
```java

public class WrapperSerde<T> implements Serde<T> {
    final private Serializer<T> serializer;
    final private Deserializer<T> deserializer;

```

### MissortedModifiers
Missorted modifiers `final private`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/WrapperSerde.java`
#### Snippet
```java
public class WrapperSerde<T> implements Serde<T> {
    final private Serializer<T> serializer;
    final private Deserializer<T> deserializer;

    public WrapperSerde(Serializer<T> serializer, Deserializer<T> deserializer) {
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class ByteBufferSerde extends WrapperSerde<ByteBuffer> {
        public ByteBufferSerde() {
            super(new ByteBufferSerializer(), new ByteBufferDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code byte[]} type.
     */
    static public Serde<byte[]> ByteArray() {
        return new ByteArraySerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code String} type.
     */
    static public Serde<String> String() {
        return new StringSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class FloatSerde extends WrapperSerde<Float> {
        public FloatSerde() {
            super(new FloatSerializer(), new FloatDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class ShortSerde extends WrapperSerde<Short> {
        public ShortSerde() {
            super(new ShortSerializer(), new ShortDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code ByteBuffer} type.
     */
    static public Serde<ByteBuffer> ByteBuffer() {
        return new ByteBufferSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
public class Serdes {

    static public final class LongSerde extends WrapperSerde<Long> {
        public LongSerde() {
            super(new LongSerializer(), new LongDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class IntegerSerde extends WrapperSerde<Integer> {
        public IntegerSerde() {
            super(new IntegerSerializer(), new IntegerDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java


    static public final class ByteArraySerde extends WrapperSerde<byte[]> {
        public ByteArraySerde() {
            super(new ByteArraySerializer(), new ByteArrayDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class StringSerde extends WrapperSerde<String> {
        public StringSerde() {
            super(new StringSerializer(), new StringDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code Short} type.
     */
    static public Serde<Short> Short() {
        return new ShortSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code Integer} type.
     */
    static public Serde<Integer> Integer() {
        return new IntegerSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * @param deserializer must not be null.
     */
    static public <T> Serde<T> serdeFrom(final Serializer<T> serializer, final Deserializer<T> deserializer) {
        if (serializer == null) {
            throw new IllegalArgumentException("serializer must not be null");
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
    }

    static public final class DoubleSerde extends WrapperSerde<Double> {
        public DoubleSerde() {
            super(new DoubleSerializer(), new DoubleDeserializer());
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code Double} type.
     */
    static public Serde<Double> Double() {
        return new DoubleSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code Float} type.
     */
    static public Serde<Float> Float() {
        return new FloatSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * A serde for nullable {@code Long} type.
     */
    static public Serde<Long> Long() {
        return new LongSerde();
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
     * @return
     */
    static public <T> Serde<T> serdeFrom(Class<T> type) {
        if (String.class.isAssignableFrom(type)) {
            return (Serde<T>) String();
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java

    private final static String ROCKETMQ_CONNECT = "rocketmq.connect:";
    private final static String SPLIT_COMMA = ",";
    private final static String SPLIT_KV = "=";

```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
    private final static String ROCKETMQ_CONNECT = "rocketmq.connect:";
    private final static String SPLIT_COMMA = ",";
    private final static String SPLIT_KV = "=";


```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
public class MetricUtils {

    private final static String ROCKETMQ_CONNECT = "rocketmq.connect:";
    private final static String SPLIT_COMMA = ",";
    private final static String SPLIT_KV = "=";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java

    private final static String METRICS_TOPIC = "metrics.topic";
    private final static String NAMESRV_ADDR = "name.srv.addr";
    private final static String GROUP_ID = "group.id";
    private final static String ACL_ENABLED = "acl.enable";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private final static String SECRET_KEY = "secret.key";

    private final static String NAME = "rocketmq-exporter";

    private DefaultMQProducer producer;
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private final static String NAMESRV_ADDR = "name.srv.addr";
    private final static String GROUP_ID = "group.id";
    private final static String ACL_ENABLED = "acl.enable";
    private final static String ACCESS_KEY = "access.key";
    private final static String SECRET_KEY = "secret.key";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private final static String METRICS_TOPIC = "metrics.topic";
    private final static String NAMESRV_ADDR = "name.srv.addr";
    private final static String GROUP_ID = "group.id";
    private final static String ACL_ENABLED = "acl.enable";
    private final static String ACCESS_KEY = "access.key";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(RocketMQScheduledReporter.class);

    private final static String METRICS_TOPIC = "metrics.topic";
    private final static String NAMESRV_ADDR = "name.srv.addr";
    private final static String GROUP_ID = "group.id";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private final static String ACL_ENABLED = "acl.enable";
    private final static String ACCESS_KEY = "access.key";
    private final static String SECRET_KEY = "secret.key";

    private final static String NAME = "rocketmq-exporter";
```

### MissortedModifiers
Missorted modifiers `final static`
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private final static String GROUP_ID = "group.id";
    private final static String ACL_ENABLED = "acl.enable";
    private final static String ACCESS_KEY = "access.key";
    private final static String SECRET_KEY = "secret.key";

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

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                    throw new ConnectException("Invalid type for Time, underlying representation should be integer but was " + value);
                }
                return Time.toLogical(schema, ((Integer) value).intValue());
            }
        });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            versionInt = ((Number) versionNode).intValue();
        } else if (version != null) {
            versionInt = version.intValue();
        }
        if (versionInt >= 0) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `persist()` is identical to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/rocketmq/RocketMqStateManagementServiceImpl.java`
#### Snippet
```java

    @Override
    public void persist() {
        // No-op
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
Method `getConnectorConfigs()` is identical to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
     */
    @Override
    public Map<String, ConnectKeyValue> getConnectorConfigs() {
        return connectorKeyValueStore.getKVMap();
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
Method `close()` only delegates to its super method
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/ScheduledMetricsReporter.java`
#### Snippet
```java

    @Override
    public void close() {
        super.close();
    }
```

### RedundantMethodOverride
Method `transitionTo()` only delegates to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java

    @Override
    public void transitionTo(TargetState state) {
        super.transitionTo(state);
    }
```

### RedundantMethodOverride
Method `recordCommitFailure()` only delegates to its super method
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java

    @Override
    protected void recordCommitFailure(long duration) {
        super.recordCommitFailure(duration);
    }
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java

    public DeadLetterQueueConfig parseDeadLetterQueueConfig() {
        return new DeadLetterQueueConfig(super.config);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalPositionManagementServiceImpl.java`
#### Snippet
```java
        return new BrokerBasedLog(
            workerConfig,
            super.topic,
            ConnectUtil.createGroupName(super.positionManagePrefix, workerConfig.getWorkerId()),
            new PositionChangeCallback(),
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalPositionManagementServiceImpl.java`
#### Snippet
```java
            workerConfig,
            super.topic,
            ConnectUtil.createGroupName(super.positionManagePrefix, workerConfig.getWorkerId()),
            new PositionChangeCallback(),
            Serdes.serdeFrom(ByteBuffer.class),
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`s = s + ":filter"` could be simplified to 's += ":filter"'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FilterTransform.java`
#### Snippet
```java
        Object data = record.getData();
        String s = String.valueOf(data);
        s = s + ":filter";
        record.setData(s);
        return record;
```

### ReplaceAssignmentWithOperatorAssignment
`offset = offset - newStart` could be simplified to 'offset -= newStart'
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            String result = new String(buffer, 0, until);
            System.arraycopy(buffer, newStart, buffer, 0, buffer.length - newStart);
            offset = offset - newStart;
            if (streamOffset != null)
                streamOffset += newStart;
```

### ReplaceAssignmentWithOperatorAssignment
`patternFlags = patternFlags | flag` could be simplified to 'patternFlags \|= flag'
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternRenameConfig.java`
#### Snippet
```java
        for (final String f : flagList) {
            final int flag = FLAG_VALUES.get(f);
            patternFlags = patternFlags | flag;
        }
        this.pattern = Pattern.compile(pattern, patternFlags);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/CreateConnectorSubCommand.java`
#### Snippet
```java
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
            int index = 0;
            while ((index = reader.read()) != -1) {
                sb.append((char) index);
            }
```

### NestedAssignment
Result of assignment expression used
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
            headers.put(ERROR_HEADER_EXCEPTION_MESSAGE, error.getMessage());
            byte[] trace;
            if ((trace = stacktrace(context.error())) != null) {
                headers.put(ERROR_HEADER_EXCEPTION_STACK_TRACE, new String(trace));
            }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        }
        try {
            conns.forEach(conn -> {
                connectController.resumeConnector(conn);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        }
        try {
            conns.forEach(conn -> {
                connectController.pauseConnector(conn);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/WorkerErrorRecordReporter.java`
#### Snippet
```java
        }
        // add extensions
        record.getExtensions().keySet().forEach(key -> {
            consumerRecord.putUserProperty(key, record.getExtensions().getString(key));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        offsetTopics(config, topics).values()
            .forEach(
                offsetTopic -> {
                    messageQueueTopicOffsets.putAll(offsetTopic);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                if (schema == null || keySchema.getFieldType() == FieldType.STRING) {
                    Map<String, Object> fieldIt = (Map<String, Object>) value;
                    fieldIt.forEach((k, v) -> {
                        result.put(k, convertToConnect(valueSchema, v));
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        if (schemaParams != null) {
            Map<String, Object> paramsIt = schemaParams.getInnerMap();
            paramsIt.forEach((k, v) -> {
                builder.parameter(k, String.valueOf(v));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
            sinkTask.put(records);
            // ack
            positions.forEach(submittedPosition -> {
                submittedPosition.ack();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
        } catch (Exception e) {
            // drop commit
            positions.forEach(submittedPosition -> {
                submittedPosition.remove();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/SourceTaskOffsetCommitter.java`
#### Snippet
```java
    public void schedule(final ConnectorTaskId id, final WorkerSourceTask workerTask) {
        long commitIntervalMs = config.getOffsetCommitIntervalMsConfig();
        ScheduledFuture<?> commitFuture = commitExecutorService.scheduleWithFixedDelay(() -> {
            commit(workerTask);
        }, commitIntervalMs, commitIntervalMs, TimeUnit.MILLISECONDS);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/ExtendKeyValue.java`
#### Snippet
```java
        List configs = getList(s);
        List<T> castConfigs = new ArrayList<>();
        configs.forEach(config -> {
            castConfigs.add(clazz.cast(config));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     */
    private void reportTimers(SortedMap<MetricName, Timer> timers) {
        timers.forEach((name, timer) -> {
            send(name, timer.getMeanRate());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     */
    private void reportCounters(SortedMap<MetricName, Long> counters) {
        counters.forEach((name, value) -> {
            send(name, Double.parseDouble(value.toString()));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     */
    private void reportMeters(SortedMap<MetricName, Double> meters) {
        meters.forEach((name, value) -> {
            send(name, value);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     */
    private void reportHistograms(SortedMap<MetricName, Double> histograms) {
        histograms.forEach((name, value) -> {
            send(name, value);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
     */
    private void reportGauges(SortedMap<MetricName, Object> gauges) {
        gauges.forEach((name, value) -> {
            send(name, Double.parseDouble(value.toString()));
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `stream` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    private FileConfig fileConfig;

    private InputStream stream;
    private BufferedReader reader = null;
    private char[] buffer = new char[1024];
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `reader` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java

    private InputStream stream;
    private BufferedReader reader = null;
    private char[] buffer = new char[1024];
    private int offset = 0;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `log` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
public class FileSourceTask extends SourceTask {

    private Logger log = LoggerFactory.getLogger(LoggerName.FILE_CONNECTOR);

    private FileConfig fileConfig;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentFlushId` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java

    // Unique ID for each flush request to handle callbacks after timeouts
    private long currentFlushId = 0;

    public PositionStorageWriter(String namespace, PositionManagementService positionManagementService) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `data` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
     * Offset data in Connect format
     */
    private Map<ExtendRecordPartition, RecordOffset> data = new HashMap<>();
    private Map<ExtendRecordPartition, RecordOffset> toFlush = null;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `toFlush` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
     */
    private Map<ExtendRecordPartition, RecordOffset> data = new HashMap<>();
    private Map<ExtendRecordPartition, RecordOffset> toFlush = null;

    // Unique ID for each flush request to handle callbacks after timeouts
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectors` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnAndTaskStatus.java`
#### Snippet
```java
     * connector status
     */
    private Map<String, CacheEntry<ConnectorStatus>> connectors;

    public ConnAndTaskStatus() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tasks` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnAndTaskStatus.java`
#### Snippet
```java
     * connector task status
     */
    private Table<String, Integer, CacheEntry<TaskStatus>> tasks;
    /**
     * connector status
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `errorMetricsGroup` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
    protected ProcessingContext context = new ProcessingContext();
    private long totalFailures = 0;
    private ErrorMetricsGroup errorMetricsGroup;

    public RetryWithToleranceOperator(long errorRetryTimeout,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `context` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
    private final long maxDelayInMillis;
    private final ToleranceType toleranceType;
    protected ProcessingContext context = new ProcessingContext();
    private long totalFailures = 0;
    private ErrorMetricsGroup errorMetricsGroup;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectors` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryStateManagementServiceImpl.java`
#### Snippet
```java

    private Table<String, Integer, TaskStatus> tasks;
    private Map<String, ConnectorStatus> connectors;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tasks` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryStateManagementServiceImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    private Table<String, Integer, TaskStatus> tasks;
    private Map<String, ConnectorStatus> connectors;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connAndTaskStatus` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
    protected KeyValueStore<String, List<TaskStatus>> taskStatusStore;

    protected ConnAndTaskStatus connAndTaskStatus = new ConnAndTaskStatus();

    protected RecordConverter converter = new org.apache.rocketmq.connect.runtime.converter.record.json.JsonConverter();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `valueConverter` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
    private Set<ExtendRecordPartition> needSyncPartition;
    private RecordConverter keyConverter;
    private RecordConverter valueConverter;
    protected String topic;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `keyConverter` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
     */
    private Set<ExtendRecordPartition> needSyncPartition;
    private RecordConverter keyConverter;
    private RecordConverter valueConverter;
    protected String topic;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `state` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * Atomic state variable
     */
    protected AtomicReference<WorkerTaskState> state;
    private volatile TargetState targetState;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `latestTaskConfigs` is accessed in both synchronized and unsynchronized contexts
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    private final ConfigManagementService configManagementService;
    private final ConnectMetrics connectMetrics;
    Map<String, List<ConnectKeyValue>> latestTaskConfigs = new HashMap<>();

    /**
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/ScheduledMetricsReporter.java`
#### Snippet
```java

    @Override
    public void close() {
        super.close();
    }
```

### EmptyMethod
The method is empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    }

    public void maintainConnectorState() {

    }
```

### EmptyMethod
The method is empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     * @param taskConfig initial configuration
     */
    protected void initialize(ConnectKeyValue taskConfig) {
        // NO-op
    }
```

### EmptyMethod
The method is empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
     * @param schemaAndValue
     */
    private void processTaskConfigRecord(ConnectorTaskId taskId, SchemaAndValue schemaAndValue) {
        // No-op [Wait for implementation]
    }
```

### EmptyMethod
All implementations of this method are empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/PositionManagementService.java`
#### Snippet
```java
     * @param listener
     */
    default void registerListener(PositionUpdateListener listener){
        // No-op
    }
```

### EmptyMethod
The method is empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsManager.java`
#### Snippet
```java
    }

    public void start() {
    }

```

### EmptyMethod
The method is empty
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceThread.java`
#### Snippet
```java
    }

    protected void onWaitEnd() {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
    protected static List<SubCommand> subCommandList = new ArrayList<SubCommand>();

    public static CommandLine commandLine = null;

    public static String configFile = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
    public static String configFile = null;

    public static Properties properties = null;

    public static void main(String[] args) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
    public static CommandLine commandLine = null;

    public static String configFile = null;

    public static Properties properties = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            // Invoked when shutdown.
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    public static CommandLine commandLine = null;

    public static String configFile = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
    public static String configFile = null;

    public static Properties properties = null;

    public static void main(String[] args) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
    public static CommandLine commandLine = null;

    public static String configFile = null;

    public static Properties properties = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            // Invoked when shutdown.
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                private volatile boolean hasShutdown = false;
                private AtomicInteger shutdownTimes = new AtomicInteger(0);

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);

    public static CommandLine commandLine = null;

    public static String configFile = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
    public static CommandLine commandLine = null;

    public static String configFile = null;

    public static Properties properties = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
    public static String configFile = null;

    public static Properties properties = null;

    public static void main(String[] args) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java

    private InputStream stream;
    private BufferedReader reader = null;
    private char[] buffer = new char[1024];
    private int offset = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    private BufferedReader reader = null;
    private char[] buffer = new char[1024];
    private int offset = 0;
    private int batchSize = FileSourceConnector.DEFAULT_TASK_BATCH_SIZE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java

    // Unique ID for each flush request to handle callbacks after timeouts
    private long currentFlushId = 0;

    public PositionStorageWriter(String namespace, PositionManagementService positionManagementService) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/store/PositionStorageWriter.java`
#### Snippet
```java
     */
    private Map<ExtendRecordPartition, RecordOffset> data = new HashMap<>();
    private Map<ExtendRecordPartition, RecordOffset> toFlush = null;

    // Unique ID for each flush request to handle callbacks after timeouts
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    private ReentrantLock lockGet = new ReentrantLock();

    private volatile long dispatchMaxBuffer = 0;

    private ReentrantLock lockSampling = new ReentrantLock();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceThread.java`
#### Snippet
```java
    protected final CountDownLatch2 waitPoint = new CountDownLatch2(1);
    protected volatile AtomicBoolean hasNotified = new AtomicBoolean(false);
    protected volatile boolean stopped = false;

    public ServiceThread() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnAndTaskStatus.java`
#### Snippet
```java
    public static class CacheEntry<T extends AbstractStatus<?>> {
        private T value = null;
        private boolean deleted = false;

        public void put(T value) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnAndTaskStatus.java`
#### Snippet
```java

    public static class CacheEntry<T extends AbstractStatus<?>> {
        private T value = null;
        private boolean deleted = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/WorkerConfig.java`
#### Snippet
```java
     * secretKey = 11111
     */
    private boolean aclEnable = false;
    private String accessKey;
    private String secretKey;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/WorkerConfig.java`
#### Snippet
```java
     * metrics config
     */
    private boolean openLogMetricReporter = false;
    private String metricsConfigPath;
    private Map<String, Map<String, String>> metricsConfig = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
    private final ToleranceType toleranceType;
    protected ProcessingContext context = new ProcessingContext();
    private long totalFailures = 0;
    private ErrorMetricsGroup errorMetricsGroup;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
    protected RecordConverter converter = new org.apache.rocketmq.connect.runtime.converter.record.json.JsonConverter();
    protected String statusTopic;
    protected boolean enabledCompactTopic = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Thread thread;

    private boolean enabledCompactTopic = false;

    private String groupName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaConverter.java`
#### Snippet
```java
     * is key
     */
    private boolean isKey = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        private final SourceTaskMetricsGroup metricsGroup;
        private final int batchSize;
        private boolean completed = false;
        private int counter;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    private RecordConverter valueConverter;
    private Set<RecordPartition> recordPartitions = new CopyOnWriteArraySet<>();
    private MessageQueueListener messageQueueListener = null;
    private WorkerSinkTaskContext sinkTaskContext;
    private WorkerErrorRecordReporter errorRecordReporter;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-24-15-46-16.311.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            if (e instanceof MQClientException) {
                if (((MQClientException) e).getResponseCode() == ResponseCode.TOPIC_NOT_EXIST) {
                    foundTopicRouteInfo = false;
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
                 | RemotingException
                 | InterruptedException e) {
            if (e instanceof MQClientException) {
                if (((MQClientException) e).getResponseCode() == ResponseCode.TOPIC_NOT_EXIST) {
                    return Collections.emptyMap();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
            return schemaRegistryClient.getSchemaBySubject(cluster, namespace, subject);
        } catch (RestClientException | IOException e) {
            if (e instanceof RestClientException) {
                return null;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
            return schemaRegistryClient.getSchemaByRecordId(cluster, namespace, subject, recordId);
        } catch (RestClientException | IOException e) {
            if (e instanceof RestClientException) {
                return null;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
            return Boolean.TRUE;
        } catch (RestClientException | IOException e) {
            if (e instanceof RestClientException) {
                return Boolean.FALSE;
            } else {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordOffsetSerializer.java`
#### Snippet
```java
            log.error("RecordOffsetSerializer serialize failed", e);
        }
        return new byte[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapSerializer.java`
#### Snippet
```java
            log.error("RecordPositionMapSerializer serialize failed", e);
        }
        return new byte[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueSerializer.java`
#### Snippet
```java
            log.error("ConnectKeyValueConverter#objectToByte failed", e);
        }
        return new byte[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPartitionSerializer.java`
#### Snippet
```java
            log.error("JsonConverter#objectToByte failed", e);
        }
        return new byte[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginUtils.java`
#### Snippet
```java
                    + " archives");
        }
        return Arrays.asList(archives.toArray(new Path[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
            pluginUrls.add(path.toUri().toURL());
        }
        URL[] urls = pluginUrls.toArray(new URL[0]);
        if (log.isDebugEnabled()) {
            log.debug("Loading plugin urls: {}", Arrays.toString(urls));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
                scanUrlsAndAddPlugins(
                        getParent(),
                        ClasspathHelper.forJavaClassPath().toArray(new URL[0])
                );
            } else {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java

    public DelegatingClassLoader(List<String> pluginPaths, ClassLoader parent) {
        super(new URL[0], parent);
        this.pluginPaths = pluginPaths;
        this.pluginLoaders = new HashMap<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                            .doc(enumDoc)
                            .defaultSymbol(enumDefault)
                            .symbols(symbols.toArray(new String[0]));
                } else {
                    // common string
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
                @Override
                public void run() {
                    synchronized (this) {
                        log.info("Shutdown hook was invoked, {}", this.shutdownTimes.incrementAndGet());
                        if (!this.hasShutdown) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
                @Override
                public void run() {
                    synchronized (this) {
                        log.info("Shutdown hook was invoked, {}", this.shutdownTimes.incrementAndGet());
                        if (!this.hasShutdown) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     */
    public void listPlugins(Context context) {
        synchronized (this) {
            context.json(new HttpResponse<>(context.status(), Collections.unmodifiableList(connectorPlugins)));
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/ConnectorPluginsResource.java`
#### Snippet
```java
     */
    public void listConnectorPlugins(Context context) {
        synchronized (this) {
            List<PluginInfo> pluginInfos = Collections.unmodifiableList(connectorPlugins.stream()
                    .filter(p -> PluginType.SINK.equals(p.getType()) || PluginType.SOURCE.equals(p.getType()))
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
    @Override public void stop() {
        log.trace("Stopping");
        synchronized (this) {
            try {
                if (stream != null && stream != System.in) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                log.error("Failed to close FileStreamSourceTask stream: ", e);
            }
            this.notify();
        }
    }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            } catch (NoSuchFileException e) {
                log.warn("Couldn't find file {} for FileStreamSourceTask, sleeping to wait for it to be created", logFilename());
                synchronized (this) {
                    try {
                        this.wait(1000);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                synchronized (this) {
                    try {
                        this.wait(1000);
                    } catch (InterruptedException e1) {
                        log.error("Interrupt error .", e1);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
        try {
            final BufferedReader readerCopy;
            synchronized (this) {
                readerCopy = reader;
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java

            if (nread <= 0) {
                synchronized (this) {
                    this.wait(1000);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            if (nread <= 0) {
                synchronized (this) {
                    this.wait(1000);
                }
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
                                                    final ConnAndTaskStatus.CacheEntry<V> entry,
                                                    final boolean safeWrite) {
        synchronized (this) {
            if (safeWrite && !entry.canWrite(status)) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            log.trace("Received connector {} status update {}", connector, status);
            ConnAndTaskStatus.CacheEntry<ConnectorStatus> entry = connAndTaskStatus.getOrAdd(connector);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        }

        synchronized (this) {
            log.trace("Received task {} status update {}", id, status);
            ConnAndTaskStatus.CacheEntry<TaskStatus> entry = connAndTaskStatus.getOrAdd(id);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    @Override
    public void stop() {
        synchronized (this) {
            stopRequested = true;
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
                log.trace("{} started execution", this);
                while (true) {
                    synchronized (BrokerBasedLog.this) {
                        if (stopRequested)
                            break;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     */
    protected boolean awaitUnpause() throws InterruptedException {
        synchronized (this) {
            while (targetState == TargetState.PAUSED) {
                if (isStopping()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
                    return false;
                }
                this.wait();
            }
            return true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
    private void doRun() throws InterruptedException {
        try {
            synchronized (this) {
                if (isStopping()) {
                    return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
     */
    public void transitionTo(TargetState state) {
        synchronized (this) {
            // ignore the state change if we are stopping
            if (isStopping()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
                this.targetState = state;
                // notify thread continue run
                this.notifyAll();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java

    public void onFailure(Throwable t) {
        synchronized (this) {
            state.set(WorkerTaskState.ERROR);
            // on failure
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
        // on an instance variable when invoking CountDownLatch::await outside a synchronized block
        CountDownLatch messageDrainLatch;
        synchronized (this) {
            messageDrainLatch = new CountDownLatch(numUnackedMessages.get());
            this.messageDrainLatch = messageDrainLatch;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/RecordOffsetManagement.java`
#### Snippet
```java
        records.computeIfAbsent(position.getPartition(), e -> new LinkedList<>()).add(submittedPosition);
        // ensure thread safety in operation
        synchronized (this) {
            numUnackedMessages.incrementAndGet();
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
            TargetState newTargetState;
            Callback<TargetState> stateChangeCallback;
            synchronized (this) {
                newTargetState = targetStateChange.getAndSet(null);
                stateChangeCallback = this.targetStateChangeCallback.getAndSet(null);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
                doTransitionTo(newTargetState, stateChangeCallback);
            }
            synchronized (this) {
                if (targetStateChange.get() != null || stopping) {
                    continue;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
        Callback<TargetState> preEmptedStateChangeCallback;
        TargetState preEmptedState;
        synchronized (this) {
            preEmptedStateChangeCallback = this.targetStateChangeCallback.getAndSet(stateChangeCallback);
            preEmptedState = targetStateChange.getAndSet(targetState);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
            preEmptedStateChangeCallback = this.targetStateChangeCallback.getAndSet(stateChangeCallback);
            preEmptedState = targetStateChange.getAndSet(targetState);
            notify();
        }
        if (preEmptedStateChangeCallback != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerConnector.java`
#### Snippet
```java
        log.info("Scheduled shutdown for {}", this);
        stopping = true;
        notify();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
    protected void updateCommittableOffsets() {
        RecordOffsetManagement.CommittableOffsets newOffsets = offsetManagement.committableOffsets();
        synchronized (this) {
            this.committableOffsets = this.committableOffsets.updatedWith(newOffsets);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java

        RecordOffsetManagement.CommittableOffsets offsetsToCommit;
        synchronized (this) {
            offsetsToCommit = this.committableOffsets;
            this.committableOffsets = RecordOffsetManagement.CommittableOffsets.EMPTY;
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileConfig.java`
#### Snippet
```java
    public Long nextPosition;

    public static final Set<String> REQUEST_CONFIG = new HashSet<String>() {
        {
            add(FILE_CONFIG);
```

### DoubleBraceInitialization
Double brace initialization
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/ConnectorConfig.java`
#### Snippet
```java
     * The required key for all configurations.
     */
    public static final Set<String> REQUEST_CONFIG = new HashSet<String>() {
        {
            add(CONNECTOR_CLASS);
```

### DoubleBraceInitialization
Double brace initialization
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    private static final Integer MAX_MESSAGE_NUM = 32;
    private static final long PULL_MSG_ERROR_BACKOFF_MS = 1000 * 5;
    private static final Set<String> MQ_SYS_KEYS = new HashSet<String>() {
        {
            add("MIN_OFFSET");
```

## RuleId[id=UnusedAssignment]
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
Variable `enabledCompactTopic` initializer `false` is redundant
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
    private Thread thread;

    private boolean enabledCompactTopic = false;

    private String groupName;
```

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

## RuleId[id=ConstantValue]
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
Condition `value instanceof JSONArray` is always `true`
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

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `statusManagePrefix` may be 'static'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        .field(GENERATION_KEY_NAME, SchemaBuilder.int64().build())
        .build();
    protected final String statusManagePrefix = "StatusManage";
    /**
     * Synchronize config with other workers.
```

### FieldMayBeStatic
Field `positionManagePrefix` may be 'static'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
public abstract class AbstractPositionManagementService implements PositionManagementService, IChangeNotifier<ByteBuffer, ByteBuffer>, ICommonConfiguration {
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
    protected final String positionManagePrefix = "PositionManage";
    /**
     * Current position info in store.
```

### FieldMayBeStatic
Field `configManagePrefix` may be 'static'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
            .build();
    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
    protected final String configManagePrefix = "ConfigManage";
    /**
     * All listeners to trigger while config change.
```

### FieldMayBeStatic
Field `idSize` may be 'static'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
public class AvroSerializer implements Serializer<AvroSchema> {

    private final int idSize = 8;
    private AvroSchemaRegistryClient schemaRegistryClient;
    private AvroDatumWriterFactory avroDatumWriterFactory;
```

### FieldMayBeStatic
Field `cluster` may be 'static'
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
public abstract class AbstractLocalSchemaRegistryClient {

    protected final String cluster = "Connect";
    protected final SchemaRegistryClient schemaRegistryClient;
    protected final boolean autoRegisterSchemas;
```

### FieldMayBeStatic
Field `idSize` may be 'static'
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java

public class AvroDatumReaderFactory extends AvroSerdeFactory {
    private final int idSize = 8;
    private final DecoderFactory decoderFactory = DecoderFactory.get();
    private final Map<String, Schema> readerSchemaCache = new ConcurrentHashMap<>();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CLIConfigDefine` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/commom/CLIConfigDefine.java`
#### Snippet
```java
 * Define all the logger name of the runtime.
 */
public class CLIConfigDefine {
    public static final String PROTOCOL = "http";
}
```

### UtilityClassWithoutPrivateConstructor
Class `ServerUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/ServerUtil.java`
#### Snippet
```java
import java.util.Properties;

public class ServerUtil {

    public static Options buildCommandlineOptions(final Options options) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConnectAdminStartup` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
import java.util.Properties;

public class ConnectAdminStartup {

    protected static List<SubCommand> subCommandList = new ArrayList<SubCommand>();
```

### UtilityClassWithoutPrivateConstructor
Class `LoggerName` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/LoggerName.java`
#### Snippet
```java
 * Define all the logger name of the file connector.
 */
public class LoggerName {
    public static final String FILE_CONNECTOR = "FileConnector";
}
```

### UtilityClassWithoutPrivateConstructor
Class `FileConstants` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileConstants.java`
#### Snippet
```java
package org.apache.rocketmq.connect.file;

public class FileConstants {

    public static final String FILENAME_FIELD = "filename";
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileUtils.java`
#### Snippet
```java
import java.lang.reflect.Method;

public class FileUtils {
    public static void properties2Object(final KeyValue p, final Object object) {
        Method[] methods = object.getClass().getMethods();
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneConnectStartup` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
 * Startup class of the runtime worker.
 */
public class StandaloneConnectStartup {

    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
```

### UtilityClassWithoutPrivateConstructor
Class `FileAndPropertyUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
 * Utils for file and property.
 */
public class FileAndPropertyUtil {

    public static String file2String(final String fileName) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `DistributedConnectStartup` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
 * Startup class of the runtime worker.
 */
public class DistributedConnectStartup {

    private static final Logger log = LoggerFactory.getLogger(LoggerName.ROCKETMQ_RUNTIME);
```

### UtilityClassWithoutPrivateConstructor
Class `ServerUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServerUtil.java`
#### Snippet
```java
import java.util.Properties;

public class ServerUtil {

    public static Options buildCommandlineOptions(final Options options) {
```

### UtilityClassWithoutPrivateConstructor
Class `FilePathConfigUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FilePathConfigUtil.java`
#### Snippet
```java
import java.io.File;

public class FilePathConfigUtil {

    public static String getConnectorStatusConfigPath(final String rootDir) {
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceProviderUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
import java.util.ServiceLoader;

public class ServiceProviderUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Base64Util` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
 * base64 utils
 */
public class Base64Util {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TransferUtils` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/TransferUtils.java`
#### Snippet
```java
import java.util.Map;

public class TransferUtils {

    public static String keyValueToString(ConnectKeyValue keyValue) {
```

### UtilityClassWithoutPrivateConstructor
Class `LoggerName` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/LoggerName.java`
#### Snippet
```java
 * Define all the logger name of the runtime.
 */
public class LoggerName {
    public static final String CONNECT_BUG = "ConnectBug";

```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Utils.java`
#### Snippet
```java
 * common utils
 */
public class Utils {

    private static final Logger log = LoggerFactory.getLogger(Utils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FileAndPropertyUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
 * Utils for file and property.
 */
public class FileAndPropertyUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ReporterManagerUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
 * reporter manage util
 */
public class ReporterManagerUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `RetryUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/RetryUtil.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public final class RetryUtil {

    private static final Logger LOG = LoggerFactory.getLogger(RetryUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ConnectUtil` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
import static org.apache.rocketmq.connect.runtime.connectorwrapper.WorkerSinkTask.QUEUE_OFFSET;

public class ConnectUtil {

    public static final String SYS_TASK_CG_PREFIX = "connect-";
```

### UtilityClassWithoutPrivateConstructor
Class `JsonSchema` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonSchema.java`
#### Snippet
```java
 * json schema
 */
public class JsonSchema {

    public static final String ENVELOPE_SCHEMA_FIELD_NAME = "schema";
```

### UtilityClassWithoutPrivateConstructor
Class `PluginUtils` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class PluginUtils {

    private static final Logger log = LoggerFactory.getLogger(PluginUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Serdes` has only 'static' members, and lacks a 'private' constructor
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/Serdes.java`
#### Snippet
```java
 * Factory for creating serializers / deserializers.
 */
public class Serdes {

    static public final class LongSerde extends WrapperSerde<Long> {
```

### UtilityClassWithoutPrivateConstructor
Class `JsonSchemaUtils` has only 'static' members, and lacks a 'private' constructor
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/util/JsonSchemaUtils.java`
#### Snippet
```java
 * json schema utils
 */
public class JsonSchemaUtils {
    private static final ObjectMapper OBJECT_MAPPER = JacksonMapper.INSTANCE;
    private static final Object NONE_MARKER = new Object();
```

### UtilityClassWithoutPrivateConstructor
Class `TopicNameStrategy` has only 'static' members, and lacks a 'private' constructor
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/TopicNameStrategy.java`
#### Snippet
```java
 * subject
 */
public class TopicNameStrategy {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AvroSchemaUtils` has only 'static' members, and lacks a 'private' constructor
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/util/AvroSchemaUtils.java`
#### Snippet
```java
import java.util.Map;

public class AvroSchemaUtils {

    private static final EncoderFactory ENCODER_FACTORY = EncoderFactory.get();
```

### UtilityClassWithoutPrivateConstructor
Class `MetricUtils` has only 'static' members, and lacks a 'private' constructor
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
 * metric utils
 */
public class MetricUtils {

    private final static String ROCKETMQ_CONNECT = "rocketmq.connect:";
```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQClientUtil` has only 'static' members, and lacks a 'private' constructor
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java
 * rocket connect util
 */
public class RocketMQClientUtil {

    public static String createUniqInstance(String prefix) {
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaHelper` has only 'static' members, and lacks a 'private' constructor
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/SchemaHelper.java`
#### Snippet
```java
import java.util.Map;

public class SchemaHelper {
    static final Map<Class<?>, FieldType> PRIMITIVES;

```

### UtilityClassWithoutPrivateConstructor
Class `SchemaUtil` has only 'static' members, and lacks a 'private' constructor
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/SchemaUtil.java`
#### Snippet
```java
 * schema util
 */
public class SchemaUtil {
    public static final Schema INT8_SCHEMA = SchemaBuilder.int8().build();
    public static final Schema INT16_SCHEMA = SchemaBuilder.int16().build();
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        try {
            conns.forEach(conn -> {
                connectController.resumeConnector(conn);
            });
            context.json(new HttpResponse<>(context.status(), conns.size() + " connectors are resumed"));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/RestHandler.java`
#### Snippet
```java
        try {
            conns.forEach(conn -> {
                connectController.pauseConnector(conn);
            });
            context.json(new HttpResponse<>(context.status(), conns.size() + " connectors are suspended"));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            }
            return consumerOffsets.keySet().stream()
                .filter(messageQueue -> messageQueues.contains(messageQueue))
                .collect(
                    Collectors.toMap(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
            .forEach(
                offsetTopic -> {
                    messageQueueTopicOffsets.putAll(offsetTopic);
                });
        return messageQueueTopicOffsets;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/local/LocalStateManagementServiceImpl.java`
#### Snippet
```java
            taskStatusList.forEach(taskStatus -> {
                // send status
                put(taskStatus);
            });
        });
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java

            // Set current offsets
            Map<MessageQueue, Long> seekOffsets = queuesOffsets.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().getMinOffset()));
            if (!enabledCompactTopic) {
                Map<MessageQueue, Long> currentOffsets = ConnectUtil.currentOffsets(workerConfig, groupName, Lists.newArrayList(topicName), queuesOffsets.keySet());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
            // ack
            positions.forEach(submittedPosition -> {
                submittedPosition.ack();
            });
        } catch (Exception e) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
            // drop commit
            positions.forEach(submittedPosition -> {
                submittedPosition.remove();
            });
            log.error("Send message error, error info: {}.", e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private void reportMeters(SortedMap<MetricName, Double> meters) {
        meters.forEach((name, value) -> {
            send(name, value);
        });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
    private void reportHistograms(SortedMap<MetricName, Double> histograms) {
        histograms.forEach((name, value) -> {
            send(name, value);
        });
    }
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

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getServiceName()` during object construction
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceThread.java`
#### Snippet
```java

    public ServiceThread() {
        this.thread = new Thread(this, this.getServiceName());
    }

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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
                                           Throwable error) {
        markAsFailed();
        context.sourceRecord(sourceRecord);
        context.currentContext(stage, executingClass);
        context.error(error);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
        markAsFailed();
        context.sourceRecord(sourceRecord);
        context.currentContext(stage, executingClass);
        context.error(error);
        errorMetricsGroup.recordFailure();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
        context.sourceRecord(sourceRecord);
        context.currentContext(stage, executingClass);
        context.error(error);
        errorMetricsGroup.recordFailure();
        context.report();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
        context.error(error);
        errorMetricsGroup.recordFailure();
        context.report();
        if (!withinToleranceLimits()) {
            errorMetricsGroup.recordError();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connAndTaskStatus` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        synchronized (this) {
            log.trace("Received connector {} status update {}", connector, status);
            ConnAndTaskStatus.CacheEntry<ConnectorStatus> entry = connAndTaskStatus.getOrAdd(connector);
            if (entry.get() != null) {
                if (status.getGeneration() > entry.get().getGeneration()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connAndTaskStatus` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        synchronized (this) {
            log.trace("Received task {} status update {}", id, status);
            ConnAndTaskStatus.CacheEntry<TaskStatus> entry = connAndTaskStatus.getOrAdd(id);
            if (entry.get() != null) {
                if (status.getGeneration() > entry.get().getGeneration()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connAndTaskStatus` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
     */
    private synchronized void remove(String connector) {
        ConnAndTaskStatus.CacheEntry<ConnectorStatus> removed = connAndTaskStatus.getConnectors().remove(connector);
        if (removed != null) {
            removed.delete();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `connAndTaskStatus` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        }

        Map<Integer, ConnAndTaskStatus.CacheEntry<TaskStatus>> tasks = connAndTaskStatus.getTasks().remove(connector);
        if (tasks != null) {
            for (ConnAndTaskStatus.CacheEntry<TaskStatus> taskEntry : tasks.values()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `state` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
    public void onFailure(Throwable t) {
        synchronized (this) {
            state.set(WorkerTaskState.ERROR);
            // on failure
            statusListener.onFailure(id, t);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `latestTaskConfigs` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    public void maintainTaskState() throws Exception {
        Map<String, List<ConnectKeyValue>> connectorConfig = new HashMap<>();
        synchronized (latestTaskConfigs) {
            connectorConfig.putAll(latestTaskConfigs);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `latestTaskConfigs` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
        Map<String, List<ConnectKeyValue>> connectorConfig = new HashMap<>();
        synchronized (latestTaskConfigs) {
            connectorConfig.putAll(latestTaskConfigs);
        }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `latestTaskConfigs` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
     */
    public void startTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
        synchronized (latestTaskConfigs) {
            this.latestTaskConfigs = taskConfigs;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.latestTaskConfigs` accessed in synchronized context
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
    public void startTasks(Map<String, List<ConnectKeyValue>> taskConfigs) {
        synchronized (latestTaskConfigs) {
            this.latestTaskConfigs = taskConfigs;
        }
    }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `SchemaHelper` has only 'static' members, and a 'public' constructor
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/util/SchemaHelper.java`
#### Snippet
```java
import java.util.Map;

public class SchemaHelper {
    static final Map<Class<?>, FieldType> PRIMITIVES;

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/commom/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Integer.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/commom/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Double.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/commom/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Long.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                    if (lastRecordedOffset != null) {
                        log.debug("Found previous offset, trying to skip to file offset {}", lastRecordedOffset);
                        long skipLeft = Long.valueOf(String.valueOf(lastRecordedOffset));
                        while (skipLeft > 0) {
                            try {
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                        log.debug("Skipped to offset {}", lastRecordedOffset);
                    }
                    streamOffset = (lastRecordedOffset != null) ? Long.valueOf(String.valueOf(lastRecordedOffset)) : 0L;
                } else {
                    log.info("positionInfo is null!");
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java
            return null;
        }
        return new MessageQueue(messageQueueStrList.get(0), messageQueueStrList.get(1), Integer.valueOf(messageQueueStrList.get(2)));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Double.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Integer.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/common/ConnectKeyValue.java`
#### Snippet
```java
        if (!properties.containsKey(key))
            return 0;
        return Long.valueOf(properties.get(key));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
    public boolean includeRecordDetailsInErrorLog() {
        return config.getProperties().containsKey(ERRORS_LOG_INCLUDE_MESSAGES_CONFIG) ?
                Boolean.valueOf(config.getProperties().get(ERRORS_LOG_INCLUDE_MESSAGES_CONFIG)) : ERRORS_LOG_INCLUDE_MESSAGES_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
    private boolean enableErrorLog() {
        return config.getProperties().containsKey(ERRORS_LOG_ENABLE_CONFIG) ?
                Boolean.valueOf(config.getProperties().get(ERRORS_LOG_ENABLE_CONFIG)) : ERRORS_LOG_ENABLE_DEFAULT;

    }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueConfig.java`
#### Snippet
```java
    public Boolean isDlqContextHeadersEnabled() {
        return config.getProperties().containsKey(DLQ_CONTEXT_PROPERTIES_ENABLE_CONFIG) ?
                Boolean.valueOf(config.getProperties().get(DLQ_CONTEXT_PROPERTIES_ENABLE_CONFIG)) : DLQ_CONTEXT_PROPERTIES_ENABLE_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            public Object toConnect(final Schema schema, final Object value) {
                if (value instanceof Number) {
                    return Timestamp.toLogical(schema, Long.valueOf(value.toString()));
                }
                throw new ConnectException("Invalid type for Timestamp, underlying representation should be integral but was " + value);
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaConverterConfig.java`
#### Snippet
```java
    public boolean useOptionalForNonRequiredProperties() {
        return props.containsKey(USE_OPTIONAL_FOR_NON_REQUIRED_CONFIG) ?
                Boolean.valueOf(props.get(USE_OPTIONAL_FOR_NON_REQUIRED_CONFIG).toString()) : USE_OPTIONAL_FOR_NON_REQUIRED_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaConverterConfig.java`
#### Snippet
```java
    public boolean validate() {
        return props.containsKey(VALIDATE_ENABLED) ?
                Boolean.valueOf(props.get(VALIDATE_ENABLED).toString()) : VALIDATE_ENABLED_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractConverterConfig.java`
#### Snippet
```java
            throw new IllegalArgumentException("Config [" + IS_KEY + "] can not empty, Please specify the type of serialization");
        }
        this.isKey = Boolean.valueOf(props.get(IS_KEY).toString());
        serdeSchemaRegistryId = props.containsKey(SERDE_SCHEMA_REGISTRY_ID) ?
                Long.valueOf(props.get(SERDE_SCHEMA_REGISTRY_ID).toString()) : null;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractConverterConfig.java`
#### Snippet
```java
                Integer.parseInt(props.get(SCHEMAS_CACHE_SIZE_CONFIG).toString()) : SCHEMAS_CACHE_SIZE_DEFAULT;
        autoRegisterSchemas = props.containsKey(AUTO_REGISTER_SCHEMAS) ?
                Boolean.valueOf(props.get(AUTO_REGISTER_SCHEMAS).toString()) : AUTO_REGISTER_SCHEMAS_DEFAULT;
        useLatestVersion = props.containsKey(USE_LATEST_VERSION) ?
                Boolean.valueOf(props.get(USE_LATEST_VERSION).toString()) : USE_LATEST_VERSION_DEFAULT;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractConverterConfig.java`
#### Snippet
```java
                Boolean.valueOf(props.get(AUTO_REGISTER_SCHEMAS).toString()) : AUTO_REGISTER_SCHEMAS_DEFAULT;
        useLatestVersion = props.containsKey(USE_LATEST_VERSION) ?
                Boolean.valueOf(props.get(USE_LATEST_VERSION).toString()) : USE_LATEST_VERSION_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroDataConfig.java`
#### Snippet
```java
    public boolean isConnectMetaData() {
        return props.containsKey(CONNECT_META_DATA_CONFIG) ?
                Boolean.valueOf(props.get(CONNECT_META_DATA_CONFIG).toString()) : CONNECT_META_DATA_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroDataConfig.java`
#### Snippet
```java
    public boolean isEnhancedAvroSchemaSupport() {
        return props.containsKey(ENHANCED_AVRO_SCHEMA_SUPPORT_CONFIG) ?
                Boolean.valueOf(props.get(ENHANCED_AVRO_SCHEMA_SUPPORT_CONFIG).toString()) : ENHANCED_AVRO_SCHEMA_SUPPORT_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverterConfig.java`
#### Snippet
```java
    public boolean specificAvroReaderConfig() {
        return props.containsKey(SPECIFIC_AVRO_READER_CONFIG) ?
                Boolean.valueOf(props.get(SPECIFIC_AVRO_READER_CONFIG).toString()) : SPECIFIC_AVRO_READER_DEFAULT;

    }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverterConfig.java`
#### Snippet
```java
    public boolean avroReflectionAllowNullConfig() {
        return props.containsKey(AVRO_REFLECTION_ALLOW_NULL_CONFIG) ?
                Boolean.valueOf(props.get(AVRO_REFLECTION_ALLOW_NULL_CONFIG).toString()) : AVRO_REFLECTION_ALLOW_NULL_DEFAULT;

    }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverterConfig.java`
#### Snippet
```java
    public boolean useSchemaReflection() {
        return props.containsKey(SCHEMA_REFLECTION_CONFIG) ?
                Boolean.valueOf(props.get(SCHEMA_REFLECTION_CONFIG).toString()) : SCHEMA_REFLECTION_DEFAULT;
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverterConfig.java`
#### Snippet
```java
    public boolean avroUseLogicalTypeConverters() {
        return props.containsKey(AVRO_USE_LOGICAL_TYPE_CONVERTERS_CONFIG) ?
                Boolean.valueOf(props.get(AVRO_USE_LOGICAL_TYPE_CONVERTERS_CONFIG).toString()) : AVRO_USE_LOGICAL_TYPE_CONVERTERS_DEFAULT;
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
        switch (histogramType) {
            case Min:
                return Double.valueOf(histogram.getSnapshot().getMin());
            case Avg:
                return Double.valueOf(histogram.getSnapshot().getMean());
```

### UnnecessaryBoxing
Unnecessary boxing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
                return Double.valueOf(histogram.getSnapshot().getMin());
            case Avg:
                return Double.valueOf(histogram.getSnapshot().getMean());
            case Max:
                return Double.valueOf(histogram.getSnapshot().getMax());
```

### UnnecessaryBoxing
Unnecessary boxing
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
                return Double.valueOf(histogram.getSnapshot().getMean());
            case Max:
                return Double.valueOf(histogram.getSnapshot().getMax());
            case Percentile_75th:
                return histogram.getSnapshot().get75thPercentile();
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
        DefaultMQAdminExt defaultMQAdminExt = null;
        try {
            defaultMQAdminExt = RocketMQClientUtil.startMQAdminTool(Boolean.valueOf(configs.get(ACL_ENABLED)), configs.get(ACCESS_KEY), configs.get(SECRET_KEY), groupId, configs.get(NAMESRV_ADDR));
            if (!RocketMQClientUtil.topicExist(defaultMQAdminExt, topic)) {
                RocketMQClientUtil.createTopic(defaultMQAdminExt, new TopicConfig(topic));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQScheduledReporter.java`
#### Snippet
```java
                RocketMQClientUtil.createSubGroup(defaultMQAdminExt, groupId);
            }
            this.producer = RocketMQClientUtil.initDefaultMQProducer(Boolean.valueOf(configs.get(ACL_ENABLED)), configs.get(ACCESS_KEY), configs.get(SECRET_KEY), groupId, configs.get(NAMESRV_ADDR));
            this.producer.start();
        } catch (Exception e) {
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
        // timestamp
        String connectTimestamp = message.getProperties().get(ConnectorConfig.CONNECT_TIMESTAMP);
        Long timestamp = StringUtils.isNotEmpty(connectTimestamp) ? Long.valueOf(connectTimestamp) : message.getBornTimestamp();

        // partition and offset
```

## RuleId[id=SynchronizeOnNonFinalField]
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
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPositionMapDeserializer.java`
#### Snippet
```java
        Map<ExtendRecordPartition, RecordOffset> resultMap = new HashMap<>();
        try {
            String rawString = new String(data, "UTF-8");
            Map<String, String> map = JSON.parseObject(rawString, Map.class);
            for (String key : map.keySet()) {
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
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueDeserializer.java`
#### Snippet
```java
    public ConnectKeyValue deserialize(String topic, byte[] data) {
        try {
            String jsonString = new String(data, "UTF-8");

            return JSON.parseObject(jsonString, ConnectKeyValue.class);
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
                            }
                        } else {
                            System.out.printf("The sub command %s not exist.%n", args[1]);
                        }
                        break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
                        cmd.execute(commandLine, options);
                    } else {
                        System.out.printf("The sub command %s not exist.%n", args[0]);
                    }
                    break;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java

    private static void printHelp() {
        System.out.printf("The most commonly used connectAdmin commands are:%n");
        for (SubCommand cmd : subCommandList) {
            System.out.printf("   %-25s %s%n", cmd.commandName(), cmd.commandDesc());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
        System.out.printf("The most commonly used connectAdmin commands are:%n");
        for (SubCommand cmd : subCommandList) {
            System.out.printf("   %-25s %s%n", cmd.commandName(), cmd.commandDesc());
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
        }

        System.out.printf("%nSee 'connectAdmin help <command>' for more information on a specific command.%n");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetConfigInfoSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedInfoCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/ReloadPluginsSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/StopAllSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/QueryConnectorStatusSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/StopConnectorSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetClusterInfoSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/QueryConnectorConfigSubCommand.java`
#### Snippet
```java
            URL url = new URL(CLIConfigDefine.PROTOCOL, config.getHttpAddr(), config.getHttpPort(), request);
            String result = new RestSender().sendHttpRequest(url.toString(), "");
            System.out.printf("%s%n", result);
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/CreateConnectorSubCommand.java`
#### Snippet
```java
            String config = readFile(filePath);
            String result = new RestSender().sendHttpRequest(baseUrl.toString(), config);
            System.out.printf(result + "%n");
        } catch (Exception e) {
            throw new SubCommandException(this.getClass().getSimpleName() + " command failed", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSinkTask.java`
#### Snippet
```java

    @Override public void stop() {
        if (outputStream != null && outputStream != System.out) {
            outputStream.close();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSinkTask.java`
#### Snippet
```java
        fileConfig.load(config);
        if (fileConfig.getFilename() == null || fileConfig.getFilename().isEmpty()) {
            outputStream = System.out;
        } else {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedConnectors.java`
#### Snippet
```java
    private void showConnectorInfo(String result) {
        Map<String, JSONObject> connectMap = JSON.parseObject(result, Map.class);
        System.out.printf("%-25s %-15s %-17s %-25s%n", "connectorName", "status", "topic", "update-timestamp");
        for (Map.Entry<String, JSONObject> entry : connectMap.entrySet()) {
            String json = entry.getValue().getString("properties");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedConnectors.java`
#### Snippet
```java
            }
            String updateTimestamp = keyValue.getString("update-timestamp");
            System.out.printf("%-25s %-15s %-17s %-25s%n", connectorName, "RUNNING", topic, updateTimestamp);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedTasks.java`
#### Snippet
```java
    private void showTaskInfo(String result) {
        Map<String, List<JSONObject>> taskMap = JSON.parseObject(result, Map.class);
        System.out.printf("%-22s %-22s %-12s %-15s %-20s %-30s%n", "taskName", "connectorName", "status", "topic", "update-timestamp", "taskId");
        for (Map.Entry<String, List<JSONObject>> entry : taskMap.entrySet()) {
            for (JSONObject jsonObject: entry.getValue()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/GetAllocatedTasks.java`
#### Snippet
```java
                }
                String updateTimestamp = keyValue.getString("update-timestamp");
                System.out.printf("%-22s %-22s %-12s %-15s %-20s %-30s%n", taskName, connectorName, status, topic, updateTimestamp, taskId);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            String tip = "The standalone worker boot success.";
            log.info(tip);
            System.out.printf("%s%n", tip);
        } catch (Throwable e) {
            e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java

            if (null == config.getConnectHome()) {
                System.out.printf("Please set the %s variable in your environment to match the location of the Connect installation", WorkerConfig.CONNECT_HOME_ENV);
                System.exit(-2);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java

            if (null == config.getConnectHome()) {
                System.out.printf("Please set the %s variable in your environment to match the location of the Connect installation", WorkerConfig.CONNECT_HOME_ENV);
                System.exit(-2);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            String tip = "The worker [" + controller.getClusterManagementService().getCurrentWorker() + "] boot success.";
            log.info(tip);
            System.out.printf("%s%n", tip);
        } catch (Throwable e) {
            e.printStackTrace();
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        sb.append(UtilAll.getPid()).append("-");
        sb.append(System.nanoTime());
        return sb.toString().replace(".", "-");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
            throw new IllegalArgumentException("Metric name str is empty");
        }
        String[] splits = name.replace(ROCKETMQ_CONNECT, "").replace(SPLIT_KV, SPLIT_COMMA).split(SPLIT_COMMA);
        return new MetricName(splits[0], splits[1], splits[2], getTags(Arrays.copyOfRange(splits, 3, splits.length))
        );
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricUtils.java`
#### Snippet
```java
            throw new IllegalArgumentException("Metric name str is empty");
        }
        String[] splits = name.replace(ROCKETMQ_CONNECT, "").replace(SPLIT_KV, SPLIT_COMMA).split(SPLIT_COMMA);
        return new MetricName(splits[0], splits[1], splits[2], getTags(Arrays.copyOfRange(splits, 3, splits.length))
        );
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
                    keyValue.put("MQ-SYS-" + entry.getKey(), entry.getValue());
                } else if (entry.getKey().startsWith("connect-ext-")) {
                    keyValue.put(entry.getKey().replaceAll("connect-ext-", ""), entry.getValue());
                } else {
                    keyValue.put(entry.getKey(), entry.getValue());
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.connect.runtime.converter.record.json` is unnecessary, and can be replaced with an import
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
    protected ConnAndTaskStatus connAndTaskStatus = new ConnAndTaskStatus();

    protected RecordConverter converter = new org.apache.rocketmq.connect.runtime.converter.record.json.JsonConverter();
    protected String statusTopic;
    protected boolean enabledCompactTopic = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `io.openmessaging.connector.api.errors` is unnecessary and can be removed
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/NumberConverter.java`
#### Snippet
```java
            return serializer.serialize(topic, value == null ? null : cast(value));
        } catch (Exception e) {
            throw new io.openmessaging.connector.api.errors.ConnectException("Failed to serialize to " + typeName + " (was " + value.getClass() + "): ", e);
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.client.producer` is unnecessary, and can be replaced with an import
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
            producer.send(message, new SelectMessageQueueByHash(), encodeKey, new SendCallback() {
                @Override
                public void onSuccess(org.apache.rocketmq.client.producer.SendResult result) {
                    log.info("Send async message OK, msgId: {},topic:{}", result.getMsgId(), topicName);
                    callback.onCompletion(null, value);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.rocketmq.client.producer` is unnecessary, and can be replaced with an import
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/datasync/BrokerBasedLog.java`
#### Snippet
```java
            producer.send(message, new SelectMessageQueueByHash(), encodeKey, new SendCallback() {
                @Override
                public void onSuccess(org.apache.rocketmq.client.producer.SendResult result) {
                    log.info("Send async message OK, msgId: {},topic:{}", result.getMsgId(), topicName);
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.everit.json.schema` is unnecessary and can be removed
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java
    }

    public JsonSchema(org.everit.json.schema.Schema schemaObj) {
        this(schemaObj, null);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.everit.json.schema` is unnecessary and can be removed
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java
    }

    public JsonSchema(org.everit.json.schema.Schema schemaObj, Integer version) {
        try {
            this.jsonNode = schemaObj != null ? OBJECT_MAPPER.readTree(schemaObj.toString()) : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.everit.json.schema` is unnecessary and can be removed
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java
    private final JsonNode jsonNode;
    private final Integer version;
    private transient org.everit.json.schema.Schema schemaObj;
    private transient String canonicalString;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
        }
        String subjectName = TopicNameStrategy.subjectName(topic, isKey);
        org.apache.avro.Schema avroSchema = schema.rawSchema();
        try {
            RegisterSchemaRequest registerSchemaRequest = RegisterSchemaRequest.builder()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.collections4` is unnecessary, and can be replaced with an import
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
    protected void initializeAndStart() {
        Set<String> topics = new SinkConnectorConfig(taskConfig).parseTopicList();
        if (org.apache.commons.collections4.CollectionUtils.isEmpty(topics)) {
            throw new ConnectException("Sink connector topics config can be null, please check sink connector config info");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        forceLegacyDecimal = true;
                    } else {
                        org.apache.avro.LogicalTypes.decimal(precision, scale).addToSchema(baseSchema);
                    }
                } else if (Time.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    }
                } else if (Time.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
                    org.apache.avro.LogicalTypes.timeMillis().addToSchema(baseSchema);
                } else if (Timestamp.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
                    org.apache.avro.LogicalTypes.timestampMillis().addToSchema(baseSchema);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    org.apache.avro.LogicalTypes.timeMillis().addToSchema(baseSchema);
                } else if (Timestamp.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
                    org.apache.avro.LogicalTypes.timestampMillis().addToSchema(baseSchema);
                } else if (Date.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
                    org.apache.avro.LogicalTypes.date().addToSchema(baseSchema);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                    org.apache.avro.LogicalTypes.timestampMillis().addToSchema(baseSchema);
                } else if (Date.LOGICAL_NAME.equalsIgnoreCase(schema.getName())) {
                    org.apache.avro.LogicalTypes.date().addToSchema(baseSchema);
                }
            }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/RestSender.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/command/CreateConnectorSubCommand.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            System.out.printf("%s%n", tip);
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(-1);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java

        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(-1);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java

        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(-1);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            System.out.printf("%s%n", tip);
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(-1);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/reporter/RocketMQClientUtil.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("fetch all topic  failed", e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
                Throwable t = e.getCause();
                log.info("[BUG] Stopped Tasks should not throw any exception");
                t.printStackTrace();
            } catch (CancellationException e) {
                log.info("[BUG] Stopped Tasks throws PrintStackTrace");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            } catch (CancellationException e) {
                log.info("[BUG] Stopped Tasks throws PrintStackTrace");
                e.printStackTrace();
            } catch (TimeoutException e) {
                log.info("[BUG] Stopped Tasks should not throw any exception");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            } catch (TimeoutException e) {
                log.info("[BUG] Stopped Tasks should not throw any exception");
                e.printStackTrace();
            } catch (InterruptedException e) {
                log.info("[BUG] Stopped Tasks should not throw any exception");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/Worker.java`
#### Snippet
```java
            } catch (InterruptedException e) {
                log.info("[BUG] Stopped Tasks should not throw any exception");
                e.printStackTrace();
            } finally {
                // remove committer offset
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractState()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConnectorStateInfo.java`
#### Snippet
```java
        private String workerId;

        public AbstractState() {
        }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractState()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/rest/entities/ConnectorStateInfo.java`
#### Snippet
```java
        }

        public AbstractState(String state, String workerId, String trace) {
            this.state = state;
            this.workerId = workerId;
```

### NonProtectedConstructorInAbstractClass
Constructor `ServiceThread()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceThread.java`
#### Snippet
```java
    protected volatile boolean stopped = false;

    public ServiceThread() {
        this.thread = new Thread(this, this.getServiceName());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPositionManagementService()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractPositionManagementService.java`
#### Snippet
```java
    protected String topic;

    public AbstractPositionManagementService() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConnectController()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/AbstractConnectController.java`
#### Snippet
```java
     * @param connectConfig
     */
    public AbstractConnectController(
        Plugin plugin,
        WorkerConfig connectConfig,
```

### NonProtectedConstructorInAbstractClass
Constructor `WorkerTask()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerTask.java`
#### Snippet
```java
    private volatile TargetState targetState;

    public WorkerTask(WorkerConfig workerConfig, ConnectorTaskId id, ClassLoader loader, ConnectKeyValue taskConfig, RetryWithToleranceOperator retryWithToleranceOperator, TransformChain<ConnectRecord> transformChain, AtomicReference<WorkerState> workerState, TaskStatus.Listener taskListener, ConnectMetrics connectMetrics) {
        this.workerConfig = workerConfig;
        this.id = id;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStatus()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/AbstractStatus.java`
#### Snippet
```java
    private Long generation;
    private String trace;
    public AbstractStatus() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractStatus()` of an abstract class should not be declared 'public'
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/AbstractStatus.java`
#### Snippet
```java
    }

    public AbstractStatus(T id,
                          State state,
                          String workerId,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConverterConfig()` of an abstract class should not be declared 'public'
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractConverterConfig.java`
#### Snippet
```java
     * @param props
     */
    public AbstractConverterConfig(Map<String, ?> props) {
        if (!props.containsKey(SCHEMA_REGISTRY_URL)) {
            throw new IllegalArgumentException("Config [" + SCHEMA_REGISTRY_URL + "] can not empty");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLocalSchemaRegistryClient()` of an abstract class should not be declared 'public'
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
            .build();

    public AbstractLocalSchemaRegistryClient(AbstractConverterConfig config) {
        this.schemaRegistryClient = SchemaRegistryClientFactory.newClient(config.getSchemaRegistryUrl(), null);
        this.serdeSchemaRegistryId = config.getSerdeSchemaRegistryId();
```

### NonProtectedConstructorInAbstractClass
Constructor `ScheduledMetricsReporter()` of an abstract class should not be declared 'public'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/ScheduledMetricsReporter.java`
#### Snippet
```java
public abstract class ScheduledMetricsReporter extends ScheduledReporter implements AutoConfiguration, IReporter {

    public ScheduledMetricsReporter(MetricRegistry registry) {
        super(registry, "scheduled-reporter", MetricFilter.ALL, TimeUnit.SECONDS, TimeUnit.MILLISECONDS);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MetricsReporter()` of an abstract class should not be declared 'public'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/MetricsReporter.java`
#### Snippet
```java
    private final MetricRegistry registry;

    public MetricsReporter(MetricRegistry registry) {
        this.registry = registry;
        registry.addListener(this);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHistogram()` of an abstract class should not be declared 'public'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/AbstractHistogram.java`
#### Snippet
```java
 */
public abstract class AbstractHistogram implements Stat {
    public AbstractHistogram(MetricName name) {
        name.setType(type());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHistogram()` of an abstract class should not be declared 'public'
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/AbstractHistogram.java`
#### Snippet
```java
    }

    public AbstractHistogram(MetricName name, HistogramType type) {
        name.setType(type.name());
    }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/strategy/DefaultAllocateConnAndTaskStrategy.java`
#### Snippet
```java
                    continue;
                }
                if (null == allocateResult.getTaskConfigs().get(connectorName)) {
                    allocateResult.getTaskConfigs().put(connectorName, new ArrayList<>());
                }
```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        String fullName = aliases.containsKey(name) ? aliases.get(name) : name;
        PluginClassLoader pluginLoader = pluginClassLoader(fullName);
        if (pluginLoader != null) {
```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java

    public ClassLoader connectorLoader(String connectorClassOrAlias) {
        String fullName = aliases.containsKey(connectorClassOrAlias)
                ? aliases.get(connectorClassOrAlias)
                : connectorClassOrAlias;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new DirectoryStream .Filter() can be replaced with lambda
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/PluginUtils.java`
#### Snippet
```java


    private static final DirectoryStream.Filter<Path> PLUGIN_PATH_FILTER = new DirectoryStream
            .Filter<Path>() {
        @Override
        public boolean accept(Path path) {
```

### Convert2Lambda
Anonymous new Gauge() can be replaced with lambda
in `metric-exporter/src/main/java/org/apache/rocketmq/connect/metrics/stats/Value.java`
#### Snippet
```java
        this.registry = registry;
        this.name = name;
        registry.register(name.toString(), new Gauge() {
            @Override
            public Object getValue() {
```

### Convert2Lambda
Anonymous new Function() can be replaced with lambda
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/SetMaximumPrecision.java`
#### Snippet
```java

    State state(Schema inputSchema) {
        return this.schemaLookup.computeIfAbsent(inputSchema, new Function<Schema, State>() {
            @Override
            public State apply(Schema schema) {
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

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `args`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java

        String[] configArgs = Arrays.copyOfRange(args, 0, 2);
        args = Arrays.copyOfRange(args, 2, args.length);

        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `clusterManagementServiceClazz`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
    public static ClusterManagementService getClusterManagementService(String clusterManagementServiceClazz) {
        if (StringUtils.isEmpty(clusterManagementServiceClazz)) {
            clusterManagementServiceClazz = ClusterManagementServiceImpl.class.getName();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `configManagementServiceClazz`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
    public static ConfigManagementService getConfigManagementService(String configManagementServiceClazz) {
        if (StringUtils.isEmpty(configManagementServiceClazz)) {
            configManagementServiceClazz = LocalConfigManagementServiceImpl.class.getName();
        }
        ConfigManagementService configManagementService = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `stateManagementServiceClazz`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
    public static StateManagementService getStateManagementService(String stateManagementServiceClazz) {
        if (StringUtils.isEmpty(stateManagementServiceClazz)) {
            stateManagementServiceClazz = LocalStateManagementServiceImpl.class.getName();
        }
        StateManagementService stateManagementService = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `positionManagementServiceClazz`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServiceProviderUtil.java`
#### Snippet
```java
    public static PositionManagementService getPositionManagementService(String positionManagementServiceClazz) {
        if (StringUtils.isEmpty(positionManagementServiceClazz)) {
            positionManagementServiceClazz = LocalPositionManagementServiceImpl.class.getName();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
            } else {
                Path pluginPath = Paths.get(path).toAbsolutePath();
                path = pluginPath.toString();
                if (Files.isDirectory(pluginPath)) {
                    for (Path pluginLocation : PluginUtils.pluginLocations(pluginPath)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `connectRecord`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            final R currentRecord = connectRecord;
            if (this.retryWithToleranceOperator == null) {
                connectRecord = transform.doTransform(currentRecord);
            } else {
                connectRecord = this.retryWithToleranceOperator.execute(() -> transform.doTransform(currentRecord), ErrorReporter.Stage.TRANSFORMATION, transform.getClass());
```

### AssignmentToMethodParameter
Assignment to method parameter `connectRecord`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
                connectRecord = transform.doTransform(currentRecord);
            } else {
                connectRecord = this.retryWithToleranceOperator.execute(() -> transform.doTransform(currentRecord), ErrorReporter.Stage.TRANSFORMATION, transform.getClass());
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
            // parse idl
            if (StringUtils.isNotEmpty(schemaResponse.getIdl())) {
                schema = new JsonSchema(schemaResponse.getIdl());
            }
            // validate json value
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
            // parse idl
            if (StringUtils.isNotEmpty(schemaResponse.getIdl())) {
                schema = new AvroSchema(schemaResponse.getIdl());
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
```

### AssignmentToMethodParameter
Assignment to method parameter `readerSchema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
            return readerSchema;
        }
        readerSchema = readerSchemaCache.get(writerSchema.getFullName());
        if (readerSchema != null) {
            return readerSchema;
```

### AssignmentToMethodParameter
Assignment to method parameter `readerSchema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
                AvroSchemaUtils.getPrimitiveSchemas().containsValue(writerSchema);
        if (writerSchemaIsPrimitive) {
            readerSchema = writerSchema;
        } else if (useSchemaReflection) {
            readerSchema = getReflectionReaderSchema(writerSchema);
```

### AssignmentToMethodParameter
Assignment to method parameter `readerSchema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
            readerSchema = writerSchema;
        } else if (useSchemaReflection) {
            readerSchema = getReflectionReaderSchema(writerSchema);
            readerSchemaCache.put(writerSchema.getFullName(), readerSchema);
        } else if (useSpecificAvroReader) {
```

### AssignmentToMethodParameter
Assignment to method parameter `readerSchema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
            readerSchemaCache.put(writerSchema.getFullName(), readerSchema);
        } else if (useSpecificAvroReader) {
            readerSchema = getSpecificReaderSchema(writerSchema);
            readerSchemaCache.put(writerSchema.getFullName(), readerSchema);
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `readerSchema`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDatumReaderFactory.java`
#### Snippet
```java
            readerSchemaCache.put(writerSchema.getFullName(), readerSchema);
        } else {
            readerSchema = writerSchema;
        }
        return readerSchema;
```

### AssignmentToMethodParameter
Assignment to method parameter `inputSchema`
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/BaseTransformation.java`
#### Snippet
```java
        if (null == inputSchema) {
            log.trace("process() - Determining schema");
            inputSchema = SchemaHelper.schema(input);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fieldDefaultVal`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
        Object connectDefault = schema.getObjectProp(CONNECT_DEFAULT_VALUE);
        if (fieldDefaultVal == null) {
            fieldDefaultVal = JacksonUtils.toJsonNode(connectDefault);
        } else if (connectDefault == null) {
            builder.parameter(AVRO_FIELD_DEFAULT_FLAG, "true");
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

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/ServerUtil.java`
#### Snippet
```java
            if (commandLine.hasOption('h')) {
                hf.printHelp(appName, options, true);
                return null;
            }
        } catch (ParseException e) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/ConnectAdminStartup.java`
#### Snippet
```java
            return result;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/StandaloneConnectStartup.java`
#### Snippet
```java
            System.exit(-1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-cli/src/main/java/org/apache/rocketmq/connect/cli/utils/FileAndPropertyUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/DistributedConnectStartup.java`
#### Snippet
```java
            System.exit(-1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                // We need to check for \r\n, so we must skip this if we can't check the next char
                if (i + 1 >= offset)
                    return null;

                until = i;
```

### ReturnNull
Return of `null`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            return result;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                    }
                }
                return null;
            } catch (IOException e) {
                log.error("Error while trying to open file {}: ", fileConfig.getFilename(), e);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            }
            if (readerCopy == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            log.error("Interrupt error .", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ServerUtil.java`
#### Snippet
```java
            if (commandLine.hasOption('h')) {
                hf.printHelp(appName, options, true);
                return null;
            }
        } catch (ParseException e) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Table.java`
#### Snippet
```java
        Map<C, V> columns = table.get(row);
        if (columns == null)
            return null;

        V value = columns.remove(column);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Table.java`
#### Snippet
```java
        Map<C, V> columns = table.get(row);
        if (columns == null)
            return null;
        return columns.get(column);
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    public AtomicLong singleSinkTaskTimesTotal(String taskId) {
        if (StringUtils.isBlank(taskId)) {
            return null;
        }
        AtomicLong rs = sinkTaskTimesTotal.get(taskId);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsService.java`
#### Snippet
```java
    public AtomicLong singleSourceTaskTimesTotal(String taskId) {
        if (StringUtils.isBlank(taskId)) {
            return null;
        }
        AtomicLong rs = sourceTaskTimesTotal.get(taskId);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/stats/ConnectStatsManager.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
    public static byte[] base64Decode(String in) {
        if (StringUtils.isEmpty(in)) {
            return null;
        }
        return Base64.getDecoder().decode(in);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/Base64Util.java`
#### Snippet
```java
    public static String base64Encode(byte[] in) {
        if (in == null) {
            return null;
        }
        return Base64.getEncoder().encodeToString(in);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/FileAndPropertyUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java
        String messageQueueStr = this.config.getString(SinkConnectorConfig.CONNECT_TOPICNAMES);
        if (StringUtils.isBlank(messageQueueStr)) {
            return null;
        }
        List<String> topicList = Splitter.on(SEMICOLON).omitEmptyStrings().trimResults().splitToList(messageQueueStr);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/config/SinkConnectorConfig.java`
#### Snippet
```java
        List<String> messageQueueStrList = Splitter.on(SEMICOLON).omitEmptyStrings().trimResults().splitToList(messageQueueStr);
        if (CollectionUtils.isEmpty(messageQueueStrList) || messageQueueStrList.size() != 3) {
            return null;
        }
        return new MessageQueue(messageQueueStrList.get(0), messageQueueStrList.get(1), Integer.valueOf(messageQueueStrList.get(2)));
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/ReporterManagerUtil.java`
#### Snippet
```java
            return new WorkerErrorRecordReporter(retryWithToleranceOperator, converter);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
    private byte[] stacktrace(Throwable error) {
        if (error == null) {
            return null;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
            log.error("Could not serialize stacktrace.", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/DeadLetterQueueReporter.java`
#### Snippet
```java
        String dlqTopic = deadLetterQueueConfig.dlqTopicName();
        if (dlqTopic.isEmpty()) {
            return null;
        }
        if (!ConnectUtil.isTopicExist(workerConfig, dlqTopic)) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
    public static Long convertToOffset(RecordOffset recordOffset) {
        if (null == recordOffset || null == recordOffset.getOffset()) {
            return null;
        }
        Map<String, ?> offsetMap = (Map<String, String>) recordOffset.getOffset();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/utils/ConnectUtil.java`
#### Snippet
```java
        Object offsetObject = offsetMap.get(QUEUE_OFFSET);
        if (null == offsetObject) {
            return null;
        }
        return Long.valueOf(String.valueOf(offsetObject));
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
            }
            errorMetricsGroup.recordSkipped();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
                        log.trace("Thread was interrupted. Marking operation as failed.");
                        context.error(e);
                        return null;
                    }
                    errorMetricsGroup.recordRetry();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
                    log.trace("Can't retry. start={}, attempt={}, deadline={}", startTime, attempt, deadline);
                    context.error(e);
                    return null;
                }
            } finally {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/errors/RetryWithToleranceOperator.java`
#### Snippet
```java
        if (context.failed()) {
            log.debug("ProcessingContext is already in failed state. Ignoring requested operation.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
                log.error("NotifyConsumerIdsChanged for connect exception", RemotingHelper.exceptionSimpleDesc(e));
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/ClusterManagementServiceImpl.java`
#### Snippet
```java
                    break;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
            if (!(schemaAndValue.value() instanceof Struct)) {
                log.error("Invalid connector status type {}", schemaAndValue.value().getClass());
                return null;
            }
            Struct struct = (Struct) schemaAndValue.value();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        } catch (Exception e) {
            log.error("Failed to deserialize connector status", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        ConnAndTaskStatus.CacheEntry<ConnectorStatus> cacheEntry = connAndTaskStatus.getConnectors().get(connector);
        if (cacheEntry == null) {
            return null;
        }
        return cacheEntry.get();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
            if (!(schemaAndValue.value() instanceof Struct)) {
                log.error("Invalid task status type {}", schemaAndValue.value().getClass());
                return null;
            }
            Struct struct = (Struct) schemaAndValue.value();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        } catch (Exception e) {
            log.error("Failed to deserialize task status", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        String[] parts = key.split("-");
        if (parts.length < 4) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        } catch (NumberFormatException e) {
            log.warn("Invalid task status key {}", key);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractStateManagementService.java`
#### Snippet
```java
        ConnAndTaskStatus.CacheEntry<TaskStatus> cacheEntry = connAndTaskStatus.getTasks().get(id.connector(), id.task());
        if (cacheEntry == null) {
            return null;
        }
        return cacheEntry.get();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/memory/MemoryConfigManagementServiceImpl.java`
#### Snippet
```java
    @Override
    public DataSynchronizer initializationDataSynchronizer(WorkerConfig workerConfig) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/ConverterType.java`
#### Snippet
```java
    public static ConverterType withName(String name) {
        if (name == null) {
            return null;
        }
        return NAME_TO_TYPE.get(name.toLowerCase(Locale.getDefault()));
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
        String[] parts = key.split("-");
        if (parts.length < 3) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/service/AbstractConfigManagementService.java`
#### Snippet
```java
            return new ConnectorTaskId(connectorName, taskNum);
        } catch (NumberFormatException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ByteBufferDeserializer.java`
#### Snippet
```java
    public ByteBuffer deserialize(String topic, byte[] data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/JsonSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, T data) {
        if (Objects.isNull(data)) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/StringSerializer.java`
#### Snippet
```java
        try {
            if (data == null) {
                return null;
            } else {
                return data.getBytes(encoding);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListDeserializer.java`
#### Snippet
```java
            log.error("ListConverter#byteToObject failed", e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/IntegerDeserializer.java`
#### Snippet
```java
    public Integer deserialize(String topic, byte[] data) {
        if (data == null) {
            return null;
        }
        if (data.length != 4) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/IntegerSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, Integer data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/StringDeserializer.java`
#### Snippet
```java
        try {
            if (data == null) {
                return null;
            } else {
                return new String(data, encoding);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ShortDeserializer.java`
#### Snippet
```java
    public Short deserialize(String topic, byte[] data) {
        if (data == null) {
            return null;
        }
        if (data.length != 2) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ByteBufferSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, ByteBuffer data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ListSerializer.java`
#### Snippet
```java
            log.error("ListSerializer serialize failed", e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/ShortSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, Short data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/LongDeserializer.java`
#### Snippet
```java
    public Long deserialize(String topic, byte[] data) {
        if (data == null) {
            return null;
        }
        if (data.length != 8) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/FloatSerializer.java`
#### Snippet
```java
    public byte[] serialize(final String topic, final Float data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/DoubleDeserializer.java`
#### Snippet
```java
    public Double deserialize(String topic, byte[] data) {
        if (data == null)
            return null;
        if (data.length != 8) {
            throw new SerializationException("Size of data received by Deserializer is not 8");
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/LongSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, Long data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/DoubleSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, Double data) {
        if (data == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/FloatDeserializer.java`
#### Snippet
```java
    public Float deserialize(final String topic, final byte[] data) {
        if (data == null) {
            return null;
        }
        if (data.length != 4) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/JsonDeserializer.java`
#### Snippet
```java
    public Object deserialize(String topic, byte[] bytes) {
        if (Objects.isNull(bytes)) {
            return null;
        }
        Object data;
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordOffsetDeserializer.java`
#### Snippet
```java
            log.error("RecordOffsetDeserializer deserialize failed", e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/RecordPartitionDeserializer.java`
#### Snippet
```java
            log.error("JsonConverter#byteToObject failed", e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/serialization/store/ConnectKeyValueDeserializer.java`
#### Snippet
```java
            log.error("ConnectKeyValueDeserializer#deserialize failed", e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
    public PluginClassLoader pluginClassLoader(String name) {
        if (StringUtils.isEmpty(name) || StringUtils.isBlank(name)) {
            return null;
        }
        if (!PluginUtils.shouldLoadInIsolation(name)) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        }
        if (!PluginUtils.shouldLoadInIsolation(name)) {
            return null;
        }
        SortedMap<PluginWrapper<?>, ClassLoader> inner = pluginLoaders.get(name);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        SortedMap<PluginWrapper<?>, ClassLoader> inner = pluginLoaders.get(name);
        if (inner == null) {
            return null;
        }
        ClassLoader pluginLoader = inner.get(inner.lastKey());
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/controller/isolation/DelegatingClassLoader.java`
#### Snippet
```java
        return pluginLoader instanceof PluginClassLoader
                ? (PluginClassLoader) pluginLoader
                : null;
    }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        // schema null
        if (jsonSchema == null) {
            return null;
        }
        Schema cached = toConnectSchemaCache.get(jsonSchema);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
    public byte[] fromConnectData(String topic, Schema schema, Object value) {
        if (schema == null && value == null) {
            return null;
        }
        Object jsonValue = converterConfig.schemasEnabled() ? convertToJsonWithEnvelope(schema, value) : convertToJsonWithoutEnvelope(schema, value);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        if (value == null) {
            if (schema == null) {
                return null;
            }
            if (schema.getDefaultValue() != null) {
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            }
            if (schema.isOptional()) {
                return null;
            }
            throw new ConnectException("Conversion error: null value for field that is required and has no default value");
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
            if (logicalConverter != null) {
                if (value == null) {
                    return null;
                } else {
                    return logicalConverter.toJson(schema, value, converterConfig);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
                }
                if (schema.isOptional()) {
                    return null;
                }
                throw new ConnectException("Invalid null value for required " + schemaType + " field");
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
        } else {
            if (value == null) {
                return null;
            } else if (value instanceof String) {
                schemaType = FieldType.STRING;
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/converter/record/json/JsonConverter.java`
#### Snippet
```java
    public JSONObject asJsonSchema(Schema schema) {
        if (schema == null) {
            return null;
        }
        // from cached
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerDirectTask.java`
#### Snippet
```java
        @Override
        public Set<RecordPartition> assignment() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/status/WrapperStatusListener.java`
#### Snippet
```java
            return output.toString(StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaConverter.java`
#### Snippet
```java
    public byte[] fromConnectData(String topic, Schema schema, Object value) {
        if (schema == null && value == null) {
            return null;
        }
        org.everit.json.schema.Schema jsonSchema = jsonSchemaData.fromJsonSchema(schema);
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaDeserializer.java`
#### Snippet
```java
    public JsonSchemaAndValue deserialize(String topic, boolean isKey, byte[] payload) {
        if (payload == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java
    public Schema rawSchema() {
        if (jsonNode == null) {
            return null;
        }
        if (schemaObj == null) {
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java
    public String idl() {
        if (jsonNode == null) {
            return null;
        }
        if (canonicalString == null) {
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchema.java`
#### Snippet
```java

    public String getString(String key) {
        return jsonNode.has(key) ? jsonNode.get(key).asText() : null;
    }

```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/serde/JsonSchemaSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, boolean isKey, JsonSchema schema, Object value) {
        if (value == null) {
            return null;
        }
        String subjectName = TopicNameStrategy.subjectName(topic, isKey);
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
            List<ConnectRecord> connectRecords = sourceTask.poll();
            if (CollectionUtils.isEmpty(connectRecords)) {
                return null;
            }
            return connectRecords;
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        } catch (RetriableException e) {
            log.error("Source task RetriableException exception, taskconfig {}", JSON.toJSONString(taskConfig), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
    protected Message convertTransformedRecord(final String topic, ConnectRecord record) {
        if (record == null) {
            return null;
        }
        Message sourceMessage = new Message();
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSourceTask.java`
#### Snippet
```java
        sourceMessage.setBody(value);
        if (retryWithToleranceOperator.failed()) {
            return null;
        }
        // put extend msg property
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroSchema.java`
#### Snippet
```java
            return schemaObj.getFullName();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroConverter.java`
#### Snippet
```java
    public byte[] fromConnectData(String topic, Schema schema, Object value) {
        if (value == null) {
            return null;
        }
        org.apache.avro.Schema avroSchema = avroData.fromConnectSchema(schema);
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroSchema.java`
#### Snippet
```java
    public String idl() {
        if (schemaObj == null) {
            return null;
        }
        if (canonicalString == null) {
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroDeserializer.java`
#### Snippet
```java
    public GenericContainerWithVersion deserialize(String topic, boolean isKey, byte[] payload) {
        if (payload == null) {
            return null;
        }
        // get subject name
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/serde/AvroSerializer.java`
#### Snippet
```java
    public byte[] serialize(String topic, boolean isKey, AvroSchema schema, Object data) {
        if (data == null) {
            return null;
        }
        String subjectName = TopicNameStrategy.subjectName(topic, isKey);
```

### ReturnNull
Return of `null`
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
        } catch (RestClientException | IOException e) {
            if (e instanceof RestClientException) {
                return null;
            } else {
                throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `schema-converter/schema-converter-common/src/main/java/org/apache/rocketmq/schema/common/AbstractLocalSchemaRegistryClient.java`
#### Snippet
```java
        } catch (RestClientException | IOException e) {
            if (e instanceof RestClientException) {
                return null;
            } else {
                throw new RuntimeException(e);
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/util/AvroSchemaUtils.java`
#### Snippet
```java
    public static byte[] toJson(Object value) throws IOException {
        if (value == null) {
            return null;
        }
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
```

### ReturnNull
Return of `null`
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
            if (null != input) {
                if (this.pattern.matcher(input).matches()) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `transforms/src/main/java/org/apache/rocketmq/connect/transforms/PatternFilter.java`
#### Snippet
```java
                String input = (String) value;
                if (this.pattern.matcher(input).matches()) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
                }
                if (jsonValue == null || schema.isOptional()) {
                    return null;
                }
                throw new ConnectException("Invalid null value for required " + schemaType + " field");
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
        } else {
            if (jsonValue == null) {
                return null;
            }
            switch (jsonValue.getNodeType()) {
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
            switch (jsonValue.getNodeType()) {
                case NULL:
                    return null;
                case BOOLEAN:
                    schemaType = FieldType.BOOLEAN;
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
            if (schema == null) {
                // Any schema is valid and we don't have a default, so treat this as an optional schema
                return null;
            }
            if (schema.getDefaultValue() != null) {
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
                return JSON_NODE_FACTORY.nullNode();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
    public Schema toConnectSchema(org.everit.json.schema.Schema schema, Integer version) {
        if (schema == null) {
            return null;
        }
        Schema cachedSchema = toConnectSchemaCache.get(schema);
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
    private org.everit.json.schema.Schema rawSchemaFromConnectSchema(Schema schema) {
        if (schema == null) {
            return null;
        }
        org.everit.json.schema.Schema cachedSchema = fromConnectSchemaCache.get(schema);
```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
    private Schema toConnectSchema(org.everit.json.schema.Schema jsonSchema, Integer version, boolean forceOptional) {
        if (jsonSchema == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `schema-converter/json-schema-converter/src/main/java/org/apache/rocketmq/schema/json/JsonSchemaData.java`
#### Snippet
```java
    private org.everit.json.schema.Schema rawSchemaFromConnectSchema(Schema schema, Integer index, boolean ignoreOptional) {
        if (schema == null) {
            return null;
        }
        org.everit.json.schema.Schema.Builder builder;
```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
        );
        if (retryWithToleranceOperator.failed()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/WorkerSinkTask.java`
#### Snippet
```java
        ConnectRecord transformedRecord = transformChain.doTransforms(record);
        if (transformedRecord == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

                // If nothing was set, it's null
                return null;
            }

```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                                        Integer version) {
        if (value == null) {
            return null;
        }
        ToConnectContext toConnectContext = new ToConnectContext();
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            return schema.getFields();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                return new GenericRecordBuilder(ANYTHING_SCHEMA).build();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                return new GenericRecordBuilder(ANYTHING_SCHEMA).build();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            return schema.getValueSchema();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                                                      ToConnectContext toConnectContext) {
        if (value == null || value == JsonProperties.NULL_VALUE) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java

            case NULL:
                return null;

            case STRING:
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                        bytes = jsonValue.binaryValue();
                    }
                    return bytes == null ? null : ByteBuffer.wrap(bytes);
                } catch (IOException e) {
                    throw new ConnectException("Invalid binary data in default value", e);
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
                org.apache.avro.Schema memberAvroSchema = avroSchema.getTypes().get(0);
                if (memberAvroSchema.getType() == org.apache.avro.Schema.Type.NULL) {
                    return null;
                } else {
                    return defaultValueFromAvro(
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            }
            default: {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
            return schema.getKeySchema();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `schema-converter/avro-schema-converter/src/main/java/org/apache/rocketmq/schema/avro/AvroData.java`
#### Snippet
```java
    private static FieldType schemaTypeForSchemalessJavaType(Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Byte) {
            return FieldType.INT8;
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

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
                synchronized (this) {
                    try {
                        this.wait(1000);
                    } catch (InterruptedException e1) {
                        log.error("Interrupt error .", e1);
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `rocketmq-connect-sample/src/main/java/org/apache/rocketmq/connect/file/FileSourceTask.java`
#### Snippet
```java
            if (nread <= 0) {
                synchronized (this) {
                    this.wait(1000);
                }
            }
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
            return null;
        }
        List<String> topicList = Splitter.on(SEMICOLON).omitEmptyStrings().trimResults().splitToList(messageQueueStr);
        return new HashSet<>(topicList);
    }
```

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
in `rocketmq-connect-runtime/src/main/java/org/apache/rocketmq/connect/runtime/connectorwrapper/TransformChain.java`
#### Snippet
```java
            return;
        }
        List<String> transformList = Splitter.on(COMMA).omitEmptyStrings().trimResults().splitToList(transformsStr);
        if (CollectionUtils.isEmpty(transformList)) {
            log.warn("transforms config is null, {}", JSON.toJSONString(config));
```

