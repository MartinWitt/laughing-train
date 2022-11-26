# incubator-seatunnel 
 
# Bad smells
I found 1488 bad smells with 219 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 198 | false |
| ReturnNull | 141 | false |
| UtilityClassWithoutPrivateConstructor | 87 | true |
| UnnecessaryFullyQualifiedName | 67 | false |
| ZeroLengthArrayInitialization | 64 | false |
| AssignmentToMethodParameter | 63 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 48 | false |
| RedundantFieldInitialization | 46 | false |
| NonProtectedConstructorInAbstractClass | 35 | true |
| SuspiciousToArrayCall | 30 | false |
| UnnecessaryLocalVariable | 30 | true |
| EmptyMethod | 30 | false |
| SizeReplaceableByIsEmpty | 29 | true |
| NullableProblems | 29 | false |
| CollectionContainsUrl | 29 | false |
| CodeBlock2Expr | 28 | true |
| NonSerializableFieldInSerializableClass | 27 | false |
| SynchronizeOnThis | 26 | false |
| RedundantMethodOverride | 25 | false |
| Convert2Lambda | 24 | false |
| DynamicRegexReplaceableByCompiledPattern | 23 | false |
| PublicFieldAccessedInSynchronizedContext | 22 | false |
| BusyWait | 20 | false |
| ConstantValue | 20 | false |
| DataFlowIssue | 20 | false |
| Convert2MethodRef | 18 | false |
| UnusedAssignment | 17 | false |
| RedundantClassCall | 16 | false |
| UseOfPropertiesAsHashtable | 16 | false |
| Anonymous2MethodRef | 15 | false |
| OptionalUsedAsFieldOrParameterType | 14 | false |
| IgnoreResultOfCall | 13 | false |
| RedundantSuppression | 11 | false |
| OptionalGetWithoutIsPresent | 11 | false |
| TrivialStringConcatenation | 8 | false |
| SystemOutErr | 8 | false |
| RedundantImplements | 8 | false |
| NestedAssignment | 7 | false |
| UnnecessarySemicolon | 7 | false |
| SimplifyStreamApiCallChains | 7 | false |
| AbstractClassNeverImplemented | 7 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| StringBufferReplaceableByString | 6 | false |
| EmptyTryBlock | 5 | false |
| FieldMayBeStatic | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| UnstableApiUsage | 4 | false |
| MissortedModifiers | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| NonExceptionNameEndsWithException | 4 | false |
| StringEqualsEmptyString | 4 | false |
| Java8MapApi | 4 | false |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| RegExpRedundantEscape | 3 | false |
| UnnecessaryQualifierForThis | 3 | false |
| DoubleBraceInitialization | 3 | false |
| ThreadRun | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| ImplicitArrayToString | 3 | false |
| AssignmentToLambdaParameter | 3 | false |
| NonShortCircuitBoolean | 3 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| OptionalIsPresent | 3 | false |
| BoxingBoxedValue | 3 | false |
| AbstractMethodCallInConstructor | 3 | false |
| MismatchedArrayReadWrite | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| UNUSED_IMPORT | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| ObsoleteCollection | 2 | false |
| UnnecessaryReturn | 2 | true |
| ThrowFromFinallyBlock | 2 | false |
| Lombok | 2 | false |
| Java8MapForEach | 2 | false |
| CatchMayIgnoreException | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| NestedSynchronizedStatement | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| UnnecessaryModifier | 1 | true |
| WhileCanBeForeach | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| EqualsAndHashcode | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| UseBulkOperation | 1 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| LoopStatementsThatDontLoop | 1 | false |
| StaticCallOnSubclass | 1 | false |
| SillyAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NonFinalFieldOfException | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| IOResource | 1 | false |
| RedundantLengthCheck | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantCollectionOperation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryBoxing | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[coordinatorCancelList.size()\]'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
            coordinatorCancelList.addAll(taskCancelList);
            CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(
                coordinatorCancelList.toArray(new CompletableFuture[coordinatorCancelList.size()]));
            voidCompletableFuture.get();
        } catch (Exception e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FileStatus\[fileStats.size()\]'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            }
        }
        return fileStats.toArray(new FileStatus[fileStats.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fieldNames.size()\]'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
                    "Kudu", PluginType.SOURCE, ExceptionUtils.getMessage(e)));
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[fieldNames.size()]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SeaTunnelDataType\[seaTunnelDataTypes.size()\]'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
                    "Kudu", PluginType.SOURCE, ExceptionUtils.getMessage(e)));
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[fieldNames.size()]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }

```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof Duration) {
            Long value = ((Duration) obj).toNanos();
            if (value >= 0 && value <= NANOSECONDS_PER_DAY) {
                return LocalTime.ofNanoOfDay(value);
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaGroupOps.java`
#### Snippet
```java

    // Commit a batch of transactions
    public GroupXaOperationResult<XidInfo> commit(
            List<XidInfo> xids, boolean allowOutOfOrderCommits, int maxCommitAttempts);

```

## RuleId[ruleID=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `ringbuffers` are read, but never written to
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/PartitionTransformSourceFlowLifeCycle.java`
#### Snippet
```java

    // TODO: init ring buffer
    private Ringbuffer<T>[] ringbuffers;

    private final Map<Integer, Barrier> alignedBarriers = new HashMap<>();
```

### MismatchedArrayReadWrite
Contents of array `ringbuffers` are read, but never written to
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/PartitionTransformSinkFlowLifeCycle.java`
#### Snippet
```java

    // TODO: init ring buffer
    private Ringbuffer<Record<?>>[] ringbuffers;
    private final Random random = new Random();

```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java

        Iterator<JsonNode> iter = hitsNode.iterator();
        while (iter.hasNext()) {
            Map<String, Object> doc = new HashMap<>();
            JsonNode hitNode = iter.next();
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FileSystemUtils.CONF` from instance context
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
    public FileSinkAggregatedCommitter(HadoopConf hadoopConf) {
        this.hadoopConf = hadoopConf;
        FileSystemUtils.CONF = FileSystemUtils.getConfiguration(hadoopConf);
        log.info("Hadoop configuration initial done, [{}]", hadoopConf);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FileSystemUtils.CONF` from instance context
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
        this.jobId = jobId;
        this.subTaskIndex = subTaskIndex;
        FileSystemUtils.CONF = getConfiguration(hadoopConf);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HiveMetaStoreProxy.INSTANCE` from instance context
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/utils/HiveMetaStoreProxy.java`
#### Snippet
```java
        if (Objects.nonNull(hiveMetaStoreClient)) {
            hiveMetaStoreClient.close();
            HiveMetaStoreProxy.INSTANCE = null;
        }
    }
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    @SuppressWarnings("MagicNumber")
    public static void validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        checkArgument(parts.length == 3);
    }
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
     */
    public static void validateJdbcUrlWithoutDatabase(String url) {
        String[] parts = url.trim().split("\\/+");

        checkArgument(parts.length == 2);
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
    public String localizationEngine(String engine, String ddl) {
        if ("ReplicatedMergeTree".equalsIgnoreCase(engine)) {
            return ddl.replaceAll("ReplicatedMergeTree(\\([^\\)]*\\))", "MergeTree()");
        } else {
            return ddl;
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `ownedSlotProfilesIMap.keySet()` may be replaced with 'values()' iteration
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java

    public Address queryTaskGroupAddress(long taskGroupId) {
        for (PipelineLocation pipelineLocation : ownedSlotProfilesIMap.keySet()) {
            Optional<TaskGroupLocation> currentVertex = ownedSlotProfilesIMap.get(pipelineLocation).keySet().stream()
                .filter(taskGroupLocation -> taskGroupLocation.getTaskGroupId() == taskGroupId)
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                Map map = (Map) value;
                Map newMap = new HashMap();
                for (Object key : map.keySet()) {
                    newMap.put(clone(mapType.getKeyType(), key), clone(mapType.getValueType(), map.get(key)));
                }
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `StreamWriter` on 'super' is unnecessary in this context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java
    @Override
    public void onDataWriterCommit(WriterCommitMessage message) {
        StreamWriter.super.onDataWriterCommit(message);
    }
}
```

### UnnecessaryQualifierForThis
Qualifier `StreamWriter` on 'super' is unnecessary in this context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java
    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }

```

### UnnecessaryQualifierForThis
Qualifier `JdbcOutputFormat` on 'this' is unnecessary in this context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                this.scheduler.scheduleWithFixedDelay(
                    () -> {
                        synchronized (JdbcOutputFormat.this) {
                            if (!closed) {
                                try {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`absentOptions.size() == 0` can be replaced with 'absentOptions.isEmpty()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
        }
        List<Option<?>> absentOptions = getAbsentOptions(conditionalRequiredOptions.getRequiredOption());
        if (absentOptions.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`absentOptions.size() == 0` can be replaced with 'absentOptions.isEmpty()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
    void validate(RequiredOption.AbsolutelyRequiredOptions requiredOption) {
        List<Option<?>> absentOptions = getAbsentOptions(requiredOption.getRequiredOption());
        if (absentOptions.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/utils/SparkStructTypeUtil.java`
#### Snippet
```java
                List list = (List) type;

                if (list.size() == 0) {
                    newSchema = newSchema.add(field, DataTypes.createArrayType(null, true));
                } else {
```

### SizeReplaceableByIsEmpty
`datasetList.size() > 0` can be replaced with '!datasetList.isEmpty()'
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingExecution.java`
#### Snippet
```java
                SparkEnvironment.registerInputTempView(s, sparkEnvironment)
        ).collect(Collectors.toList());
        if (datasetList.size() > 0) {
            Dataset<Row> ds = datasetList.get(0);
            for (BaseSparkTransform tf : transforms) {
```

### SizeReplaceableByIsEmpty
`inputVertices.size() == 0` can be replaced with 'inputVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
        for (LogicalVertex logicalVertex : logicalVertices) {
            List<LogicalVertex> inputVertices = inputVerticesMap.get(logicalVertex.getVertexId());
            if (inputVertices == null || inputVertices.size() == 0) {
                sourceVertices.add(logicalVertex);
            }
```

### SizeReplaceableByIsEmpty
`logicalPlan.getEdges().size() > 0` can be replaced with '!logicalPlan.getEdges().isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                                  @NonNull JobImmutableInformation jobImmutableInformation,
                                  long initializationTimestamp) {
        checkArgument(logicalPlan.getEdges().size() > 0, "ExecutionPlan Builder must have LogicalPlan.");

        this.logicalEdges = new ArrayList<>(logicalPlan.getEdges());
```

### SizeReplaceableByIsEmpty
`chainedVertices.size() == 0` can be replaced with 'chainedVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
        // Currently only support Transform action chaining.
        if (action instanceof TransformAction) {
            if (chainedVertices.size() == 0) {
                chainedVertices.add(logicalVertex);
            } else if (inputVerticesMap.get(logicalVertex.getVertexId()).size() == 1) {
```

### SizeReplaceableByIsEmpty
`inputVertices.size() == 0` can be replaced with 'inputVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
        for (ExecutionVertex vertex : vertices) {
            List<ExecutionVertex> inputVertices = inputVerticesMap.get(vertex.getVertexId());
            if (inputVertices == null || inputVertices.size() == 0) {
                sourceVertices.add(vertex);
            }
```

### SizeReplaceableByIsEmpty
`pipeline.size() == 0` can be replaced with 'pipeline.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    private void splitUnionVertex(List<List<ExecutionEdge>> pipelines, List<ExecutionVertex> pipeline,
                                  ExecutionVertex currentVertex) {
        pipeline.add(recreateVertex(currentVertex, pipeline.size() == 0 ?
                currentVertex.getParallelism() :
                pipeline.get(pipeline.size() - 1).getParallelism()));
```

### SizeReplaceableByIsEmpty
`targetVertices.size() == 0` can be replaced with 'targetVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
                pipeline.get(pipeline.size() - 1).getParallelism()));
        List<ExecutionVertex> targetVertices = targetVerticesMap.get(currentVertex.getVertexId());
        if (targetVertices == null || targetVertices.size() == 0) {
            pipelines.add(createExecutionEdges(pipeline));
            return;
```

### SizeReplaceableByIsEmpty
`taskQueue.size() > 0` can be replaced with '!taskQueue.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

        public boolean runNewBusWork(boolean checkTaskQueue) {
            if (!checkTaskQueue || taskQueue.size() > 0) {
                executorService.submit(new CooperativeTaskWorker(taskQueue, this));
                return true;
```

### SizeReplaceableByIsEmpty
`notYetAcknowledgedTasks.size() == 0` can be replaced with 'notYetAcknowledgedTasks.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/PendingCheckpoint.java`
#### Snippet
```java

    protected boolean isFullyAcknowledged() {
        return notYetAcknowledgedTasks.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/serialization/RowConverter.java`
#### Snippet
```java
            }
        }
        if (errors.size() > 0) {
            throw new UnsupportedOperationException(String.join(",", errors));
        }
```

### SizeReplaceableByIsEmpty
`mapField.size() == 0` can be replaced with 'mapField.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/serialization/RowConverter.java`
#### Snippet
```java
                MapType<?, ?> mapType = (MapType<?, ?>) dataType;
                Map<?, ?> mapField = (Map<?, ?>) field;
                if (mapField.size() == 0) {
                    return true;
                } else {
```

### SizeReplaceableByIsEmpty
`restoredSplitState.size() > 0` can be replaced with '!restoredSplitState.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/ParallelSource.java`
#### Snippet
```java
        executorService = ThreadPoolExecutorFactory.createScheduledThreadPoolExecutor(1, String.format("parallel-split-enumerator-executor-%s", subtaskId));
        splitEnumerator.open();
        if (restoredSplitState.size() > 0) {
            splitEnumerator.addSplitsBack(restoredSplitState, subtaskId);
        }
```

### SizeReplaceableByIsEmpty
`restoredState.size() > 0` can be replaced with '!restoredState.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/ParallelSource.java`
#### Snippet
```java
        // Create or restore split enumerator & reader
        try {
            if (restoredState != null && restoredState.size() > 0) {
                StateT restoredEnumeratorState = null;
                if (restoredState.containsKey(-1)) {
```

### SizeReplaceableByIsEmpty
`restoredState.size() > 0` can be replaced with '!restoredState.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java

    private void createSplitEnumerator() throws Exception {
        if (restoredState != null && restoredState.size() > 0) {
            StateT restoredEnumeratorState = null;
            if (restoredState.containsKey(-1)) {
```

### SizeReplaceableByIsEmpty
`mapData.size() == 0` can be replaced with 'mapData.isEmpty()'
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java

    private static Object convertMap(Map<?, ?> mapData, MapType<?, ?> mapType, BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
        }
```

### SizeReplaceableByIsEmpty
`mapData.size() == 0` can be replaced with 'mapData.isEmpty()'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/serialization/InternalRowConverter.java`
#### Snippet
```java

    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[]{}, new Object[]{});
        }
```

### SizeReplaceableByIsEmpty
`aggregatedCommitInfos.size() == 0` can be replaced with 'aggregatedCommitInfos.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
    public void abort(List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws Exception {
        log.info("rollback aggregate commit");
        if (aggregatedCommitInfos == null || aggregatedCommitInfos.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`commitInfos.size() == 0` can be replaced with 'commitInfos.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
    @Override
    public FileAggregatedCommitInfo combine(List<FileCommitInfo> commitInfos) {
        if (commitInfos == null || commitInfos.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`user.length() == 0` can be replaced with 'user.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        Session session = null;
        try {
            if (user == null || user.length() == 0) {
                user = System.getProperty("user.name");
            }
```

### SizeReplaceableByIsEmpty
`keyFile.length() > 0` can be replaced with '!keyFile.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            }

            if (keyFile != null && keyFile.length() > 0) {
                jsch.addIdentity(keyFile);
            }
```

### SizeReplaceableByIsEmpty
`cons.size() > 0` can be replaced with '!cons.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        this.maxConnection = 0;
        Set<ChannelSftp> cons = con2infoMap.keySet();
        if (cons != null && cons.size() > 0) {
            // make a copy since we need to modify the underlying Map
            Set<ChannelSftp> copy = new HashSet<ChannelSftp>(cons);
```

### SizeReplaceableByIsEmpty
`cons.size() > 0` can be replaced with '!cons.isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        ChannelSftp channel;

        if (cons != null && cons.size() > 0) {
            Iterator<ChannelSftp> it = cons.iterator();
            if (it.hasNext()) {
```

### SizeReplaceableByIsEmpty
`pendingPartitionsQueue.size() != 0` can be replaced with '!pendingPartitionsQueue.isEmpty()'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java
        }

        while (pendingPartitionsQueue.size() != 0) {
            sourceSplits.add(pendingPartitionsQueue.poll());
        }
```

### SizeReplaceableByIsEmpty
`requestEsList.size() > 0` can be replaced with '!requestEsList.isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
        try {
            RetryUtils.retryWithException(() -> {
                if (requestEsList.size() > 0) {
                    String requestBody = String.join("\n", requestEsList) + "\n";
                    BulkResponse bulkResponse = esRestClient.bulk(requestBody);
```

### SizeReplaceableByIsEmpty
`fieldNames.size() > 0` can be replaced with '!fieldNames.isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
    public static IndexSerializer getIndexSerializer(String index, SeaTunnelRowType seaTunnelRowType) {
        List<String> fieldNames = RegexUtils.extractDatas(index, "\\$\\{(.*?)\\}");
        if (fieldNames != null && fieldNames.size() > 0) {
            return new VariableIndexSerializer(seaTunnelRowType, index, fieldNames);
        } else {
```

### SizeReplaceableByIsEmpty
`scrollResult.getDocs().size() > 0` can be replaced with '!scrollResult.getDocs().isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
                ScrollResult scrollResult = esRestClient.searchByScroll(sourceIndexInfo.getIndex(), sourceIndexInfo.getSource(), sourceIndexInfo.getScrollTime(), sourceIndexInfo.getScrollSize());
                outputFromScrollResult(scrollResult, sourceIndexInfo.getSource(), output);
                while (scrollResult.getDocs() != null && scrollResult.getDocs().size() > 0) {
                    scrollResult = esRestClient.searchWithScrollId(scrollResult.getScrollId(), sourceIndexInfo.getScrollTime());
                    outputFromScrollResult(scrollResult, sourceIndexInfo.getSource(), output);
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/JobContext.java`
#### Snippet
```java

    public JobContext(Long jobId) {
        this.jobId = jobId + "";
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
    public CompletableFuture<Void> shutdown(JobStatus jobStatus) {
        if (jobStatus == JobStatus.FINISHED) {
            checkpointStorage.deleteCheckpoint(jobId + "");
        }
        return CompletableFuture.completedFuture(null);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

            KuduPredicate lowerPred = KuduPredicate.newComparisonPredicate(
                    schema.getColumn("" + keyColumn),
                    KuduPredicate.ComparisonOp.GREATER_EQUAL,
                    lowerBound);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

            KuduPredicate upperPred = KuduPredicate.newComparisonPredicate(
                    schema.getColumn("" + keyColumn),
                    KuduPredicate.ComparisonOp.LESS,
                    upperBound);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
            ArrayList<String> columnsList = new ArrayList<String>();
            keyColumn = kuduClient.openTable(tableName).getSchema().getPrimaryKeyColumns().get(0).getName();
            columnsList.add("" + keyColumn);
            kuduScannerBuilder.setProjectedColumnNames(columnsList);
            KuduScanner kuduScanner = kuduScannerBuilder.build();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
                while (rowResults.hasNext()) {
                    RowResult row = rowResults.next();
                    int id = row.getInt("" + keyColumn);
                    if (flag) {
                        maxKey = id;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
            throw new KuduConnectorException(KuduConnectorErrorCode.GENERATE_KUDU_PARAMETERS_FAILED, "Failed to generate upper and lower limits for each partition");
        }
        return new PartitionParameter(keyColumn, Long.parseLong(minKey + ""), Long.parseLong(maxKey + ""));
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
            throw new KuduConnectorException(KuduConnectorErrorCode.GENERATE_KUDU_PARAMETERS_FAILED, "Failed to generate upper and lower limits for each partition");
        }
        return new PartitionParameter(keyColumn, Long.parseLong(minKey + ""), Long.parseLong(maxKey + ""));
    }

```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextSerializationSchema.java`
#### Snippet
```java
@Builder
public class TextSerializationSchema implements SerializationSchema {
    @NonNull
    private SeaTunnelRowType seaTunnelRowType;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextSerializationSchema.java`
#### Snippet
```java
    @NonNull
    private SeaTunnelRowType seaTunnelRowType;
    @NonNull
    private String delimiter;
    @Builder.Default
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
    @NonNull
    private SeaTunnelRowType seaTunnelRowType;
    @NonNull
    private String delimiter;
    @Builder.Default
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
@Builder
public class TextDeserializationSchema implements DeserializationSchema<SeaTunnelRow> {
    @NonNull
    private SeaTunnelRowType seaTunnelRowType;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkWriterCommitMessage.java`
#### Snippet
```java
public class SparkWriterCommitMessage<T> implements WriterCommitMessage {

    private @Nullable T message;

    SparkWriterCommitMessage(T message) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataSourceWriter.java`
#### Snippet
```java

    protected final SeaTunnelSink<SeaTunnelRow, StateT, CommitInfoT, AggregatedCommitInfoT> sink;
    @Nullable
    protected final SinkAggregatedCommitter<CommitInfoT, AggregatedCommitInfoT> sinkAggregatedCommitter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataWriter.java`
#### Snippet
```java
    private final SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter;

    @Nullable
    private final SinkCommitter<CommitInfoT> sinkCommitter;
    private final RowConverter<InternalRow> rowConverter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull
    private final List<SeaTunnelRow> buffer = new ArrayList<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final SeaTunnelRowType rowType;
    @NonNull
    private final JdbcRowConverter converter;
    private transient PreparedStatement statement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final StatementFactory statementFactory;
    @NonNull
    private final SeaTunnelRowType rowType;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class SimpleBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull
    private final StatementFactory statementFactory;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final SeaTunnelRowType valueRowType;
    @NonNull
    private final SeaTunnelRowType keyRowType;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final StatementFactory updateStmtFactory;
    @NonNull
    private final SeaTunnelRowType valueRowType;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull
    private final JdbcRowConverter rowConverter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final StatementFactory insertStmtFactory;
    @NonNull
    private final StatementFactory updateStmtFactory;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final StatementFactory existStmtFactory;
    @NonNull
    private final StatementFactory insertStmtFactory;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class InsertOrUpdateBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull
    private final StatementFactory existStmtFactory;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final SeaTunnelRowType keyRowType;
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull
    private final LinkedHashMap<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> buffer = new LinkedHashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> upsertExecutor;
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class BufferReducedBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull
    private final JdbcBatchStatementExecutor<SeaTunnelRow> upsertExecutor;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
    @NonNull
    private final JdbcSinkOptions jdbcSinkOptions;
    @NonNull
    private final SeaTunnelRowType seaTunnelRowType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
@RequiredArgsConstructor
public class JdbcOutputFormatBuilder {
    @NonNull
    private final JdbcDialect dialect;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
    @NonNull
    private final JdbcConnectionProvider connectionProvider;
    @NonNull
    private final JdbcSinkOptions jdbcSinkOptions;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
    @NonNull
    private final JdbcDialect dialect;
    @NonNull
    private final JdbcConnectionProvider connectionProvider;
    @NonNull
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
                deleteFiles(file);
            }
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
        File parentFile = file.getParentFile();
        if (null != parentFile && !parentFile.exists()) {
            parentFile.mkdirs();
            createParentFile(parentFile);
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
        deleteFile(dirPath);
        File file = new File(dirPath);
        file.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
                    deleteFiles(thisFile);
                }
                thisFile.delete();
            }
            file.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
                thisFile.delete();
            }
            file.delete();

        } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/CommitWrapperSerializer.java`
#### Snippet
```java
            final int size = in.readInt();
            final byte[] stateBytes = new byte[size];
            in.read(stateBytes);
            T commitT = serializer.deserialize(stateBytes);
            return new CommitWrapper<>(commitT);
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkWriterStateSerializer.java`
#### Snippet
```java
            final int size = in.readInt();
            final byte[] stateBytes = new byte[size];
            in.read(stateBytes);
            T stateT = serializer.deserialize(stateBytes);
            return new FlinkWriterState<>(checkpointId, stateT);
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
        try (FSDataInputStream in = fs.open(new Path(fileName))) {
            byte[] datas = new byte[in.available()];
            in.read(datas);
            return deserializeCheckPointData(datas);
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `FsAction.or()` is ignored
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FsAction action = FsAction.NONE;
        if (ftpFile.hasPermission(accessGroup, FTPFile.READ_PERMISSION)) {
            action.or(FsAction.READ);
        }
        if (ftpFile.hasPermission(accessGroup, FTPFile.WRITE_PERMISSION)) {
```

### IgnoreResultOfCall
Result of `FsAction.or()` is ignored
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        }
        if (ftpFile.hasPermission(accessGroup, FTPFile.WRITE_PERMISSION)) {
            action.or(FsAction.WRITE);
        }
        if (ftpFile.hasPermission(accessGroup, FTPFile.EXECUTE_PERMISSION)) {
```

### IgnoreResultOfCall
Result of `FsAction.or()` is ignored
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        }
        if (ftpFile.hasPermission(accessGroup, FTPFile.EXECUTE_PERMISSION)) {
            action.or(FsAction.EXECUTE);
        }
        return action;
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
            //if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(file.getName());
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `NodeExtension` is the same as one of its superclass' names
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtension.java`
#### Snippet
```java
import java.util.Map;

public class NodeExtension extends DefaultNodeExtension {
    private final NodeExtensionCommon extCommon;

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `notifyCheckpointAborted()` is identical to its super method
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/checkpoint/InternalCheckpointListener.java`
#### Snippet
```java
     */
    @Override
    default void notifyCheckpointAborted(long checkpointId) throws Exception {}
}

```

### RedundantMethodOverride
Method `beforeStart()` only delegates to its super method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtension.java`
#### Snippet
```java

    @Override
    public void beforeStart() {
        // TODO Get Config from Node here
        super.beforeStart();
```

### RedundantMethodOverride
Method `triggerBarrier()` is identical to its super method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/TransformSeaTunnelTask.java`
#### Snippet
```java

    @Override
    public void triggerBarrier(Barrier checkpointBarrier) throws Exception {
        // nothing
    }
```

### RedundantMethodOverride
Method `getResponse()` only delegates to its super method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/NotifyTaskStatusOperation.java`
#### Snippet
```java

    @Override
    public Object getResponse() {
        return super.getResponse();
    }
```

### RedundantMethodOverride
Method `getFactoryId()` is identical to its super method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/sink/SinkPrepareCommitOperation.java`
#### Snippet
```java

    @Override
    public int getFactoryId() {
        return TaskDataSerializerHook.FACTORY_ID;
    }
```

### RedundantMethodOverride
Method `getServiceName()` is identical to its super method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/sink/SinkPrepareCommitOperation.java`
#### Snippet
```java

    @Override
    public String getServiceName() {
        return SeaTunnelServer.SERVICE_NAME;
    }
```

### RedundantMethodOverride
Method `onDataWriterCommit()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public void onDataWriterCommit(WriterCommitMessage message) {
        StreamWriter.super.onDataWriterCommit(message);
    }
```

### RedundantMethodOverride
Method `createWriterFactory()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public DataWriterFactory<InternalRow> createWriterFactory() {
        return super.createWriterFactory();
    }
```

### RedundantMethodOverride
Method `useCommitCoordinator()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }
```

### RedundantMethodOverride
Method `splitId()` is identical to its super method
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SnapshotSplit.java`
#### Snippet
```java

    @Override
    public String splitId() {
        return this.splitId;
    }
```

### RedundantMethodOverride
Method `prepare()` only delegates to its super method
in `seatunnel-connectors-v2/connector-file/connector-file-hadoop/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/hdfs/sink/HdfsFileSink.java`
#### Snippet
```java

    @Override
    public void prepare(Config pluginConfig) throws PrepareFailException {
        super.prepare(pluginConfig);
    }
```

### RedundantMethodOverride
Method `prepare()` only delegates to its super method
in `seatunnel-connectors-v2/connector-file/connector-file-hadoop/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/hdfs/source/HdfsFileSource.java`
#### Snippet
```java

    @Override
    public void prepare(Config pluginConfig) throws PrepareFailException {
        super.prepare(pluginConfig);
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-http/connector-http-myhours/src/main/java/org/apache/seatunnel/connectors/seatunnel/myhours/source/exception/MyHoursConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### RedundantMethodOverride
Method `getSplitSerializer()` only delegates to its super method
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java

    @Override
    public Serializer<JdbcSourceSplit> getSplitSerializer() {
        return SeaTunnelSource.super.getSplitSerializer();
    }
```

### RedundantMethodOverride
Method `getSplitSerializer()` only delegates to its super method
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java

    @Override
    public Serializer<KuduSourceSplit> getSplitSerializer() {
        return SeaTunnelSource.super.getSplitSerializer();
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/exception/IotdbConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### RedundantMethodOverride
Method `abortTransaction()` only delegates to its super method
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void abortTransaction() throws ProducerFencedException {
        super.abortTransaction();
    }
```

### RedundantMethodOverride
Method `beginTransaction()` only delegates to its super method
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void beginTransaction() throws ProducerFencedException {
        super.beginTransaction();
    }
```

### RedundantMethodOverride
Method `commitTransaction()` only delegates to its super method
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void commitTransaction() throws ProducerFencedException {
        super.commitTransaction();
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/exception/KafkaConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/exception/SocketConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/exception/InfluxdbConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### RedundantMethodOverride
Method `notifyCheckpointComplete()` is identical to its super method
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/source/CassandraSourceReader.java`
#### Snippet
```java

    @Override
    public void notifyCheckpointComplete(long checkpointId) throws Exception {
    }
}
```

### RedundantMethodOverride
Method `restoreWriter()` only delegates to its super method
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java

    @Override
    public SinkWriter<SeaTunnelRow, CKCommitInfo, ClickhouseSinkState> restoreWriter(SinkWriter.Context context, List<ClickhouseSinkState> states) throws IOException {
        return SeaTunnelSink.super.restoreWriter(context, states);
    }
```

### RedundantMethodOverride
Method `getErrorMessage()` only delegates to its super method
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/exception/TablestoreConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
sleepMs \* i: integer multiplication implicitly cast to long
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepMs * i);
                }
                catch (InterruptedException ex) {
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.hazelcast.client.impl.protocol.codec.custom.*;`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobStateCodec.java`
#### Snippet
```java
import com.hazelcast.client.impl.protocol.Generated;
import com.hazelcast.client.impl.protocol.codec.builtin.*;
import com.hazelcast.client.impl.protocol.codec.custom.*;

import static com.hazelcast.client.impl.protocol.ClientMessage.*;
```

### UNUSED_IMPORT
Unused import `import com.hazelcast.client.impl.protocol.codec.custom.*;`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelListJobStatusCodec.java`
#### Snippet
```java
import com.hazelcast.client.impl.protocol.Generated;
import com.hazelcast.client.impl.protocol.codec.builtin.*;
import com.hazelcast.client.impl.protocol.codec.custom.*;


```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`created = created & succeeded` could be simplified to 'created \&= succeeded'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### ReplaceAssignmentWithOperatorAssignment
`currentStart = currentStart - remainder` could be simplified to 'currentStart -= remainder'
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceSplitEnumerator.java`
#### Snippet
```java
            currentStart += size;
            if (i + 1 <= numPartitions) {
                currentStart = currentStart - remainder;
            }
            query = sqlBase + query;
```

### ReplaceAssignmentWithOperatorAssignment
`retryNums = retryNums - 1` could be simplified to 'retryNums -= 1'
in `seatunnel-connectors-v2/connector-datahub/src/main/java/org/apache/seatunnel/connectors/seatunnel/datahub/sink/DataHubWriter.java`
#### Snippet
```java
        boolean success = false;
        while (retryNums != 0) {
            retryNums = retryNums - 1;
            PutRecordsResult recordsResult = dataHubClient.putRecords(project, topic, records);
            if (recordsResult.getFailedRecordCount() > 0) {
```

### ReplaceAssignmentWithOperatorAssignment
`currentStart = currentStart - remainder` could be simplified to 'currentStart -= remainder'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSourceSplitEnumerator.java`
#### Snippet
```java
            currentStart += size;
            if (i + 1 <= numPartitions) {
                currentStart = currentStart - remainder;
            }
        }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
             final TarArchiveInputStream debInputStream = (TarArchiveInputStream) new ArchiveStreamFactory().createArchiveInputStream("tar", is)) {
            TarArchiveEntry entry = null;
            while ((entry = (TarArchiveEntry) debInputStream.getNextEntry()) != null) {
                final File outputFile = new File(outputDir, entry.getName());
                if (!outputFile.toPath().normalize().startsWith(outputDir.toPath())) {
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
            final int defaultLen = 1024;
            byte[] buffer = new byte[defaultLen];
            while ((i = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, i);
            }
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                .withDataModel(dataModel)
                .build()) {
            while ((record = reader.read()) != null) {
                Object[] fields;
                if (isMergePartition) {
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java
            char[] buf = new char[CHAR_BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = reader.read(buf)) != -1) {
                buffer.append(buf, 0, bytesRead);

```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java

                int delimPos;
                while (buffer.length() >= this.delimiter.length() && (delimPos = buffer.indexOf(this.delimiter)) != -1) {
                    String record = buffer.substring(0, delimPos);
                    if (record.endsWith("\r")) {
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/RsyncFileTransfer.java`
#### Snippet
```java
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    log.info(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                log.info(line);
            }
```

## RuleId[ruleID=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                disconnect(channel);
            } catch (IOException ioe) {
                return null;
            }
        }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `untaredFiles` are updated, but never queried
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
        log.info("Untaring {} to dir {}.", inputFile.getAbsolutePath(), outputDir.getAbsolutePath());

        final List<File> untaredFiles = new LinkedList<>();
        try (final InputStream is = new FileInputStream(inputFile);
             final TarArchiveInputStream debInputStream = (TarArchiveInputStream) new ArchiveStreamFactory().createArchiveInputStream("tar", is)) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `waitForCompleteBySubPlanList` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java

        // TODO Determine which tasks do not need to be restored according to state
        CopyOnWriteArrayList<PassiveCompletableFuture<PipelineStatus>> waitForCompleteBySubPlanList =
            new CopyOnWriteArrayList<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java

    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<Long, Integer> pipelineActions = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineActions` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<Long, Integer> pipelineActions = new HashMap<>();

        private final Map<TaskLocation, Set<Tuple2<Long, Integer>>> subtaskActions = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `startingSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<Long, Integer> pipelineActions = new HashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `subtaskActions` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        private final Map<Long, Integer> pipelineActions = new HashMap<>();

        private final Map<TaskLocation, Set<Tuple2<Long, Integer>>> subtaskActions = new HashMap<>();

        private Builder() {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `error` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/Handover.java`
#### Snippet
```java
    private final LinkedBlockingQueue<T> blockingQueue =
        new LinkedBlockingQueue<>();
    private Throwable error;

    public boolean isEmpty() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `taskExecutionService` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java

    private volatile SlotService slotService;
    private TaskExecutionService taskExecutionService;
    private CoordinatorService coordinatorService;
    private ScheduledExecutorService monitorService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nodeEngine` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
    public static final String SERVICE_NAME = "st:impl:seaTunnelServer";

    private NodeEngineImpl nodeEngine;
    private final LiveOperationRegistry liveOperationRegistry;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jobMaster` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private final Map<Integer, CompletableFuture> pipelineSchedulerFutureMap;

    private JobMaster jobMaster;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jobMaster` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private final ExecutorService executorService;

    private JobMaster jobMaster;

    private PassiveCompletableFuture<Void> reSchedulerPipelineFuture;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pipelineRestoreNum` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private PassiveCompletableFuture<Void> reSchedulerPipelineFuture;

    private Integer pipelineRestoreNum;

    public SubPlan(int pipelineId,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `finishedTaskNum` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private final JobImmutableInformation jobImmutableInformation;

    private AtomicInteger finishedTaskNum = new AtomicInteger(0);

    private AtomicInteger canceledTaskNum = new AtomicInteger(0);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `failedTaskNum` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private AtomicInteger canceledTaskNum = new AtomicInteger(0);

    private AtomicInteger failedTaskNum = new AtomicInteger(0);

    private final String pipelineFullName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `canceledTaskNum` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private AtomicInteger finishedTaskNum = new AtomicInteger(0);

    private AtomicInteger canceledTaskNum = new AtomicInteger(0);

    private AtomicInteger failedTaskNum = new AtomicInteger(0);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `enumerator` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java

    private final SourceAction<?, SplitT, Serializable> source;
    private SourceSplitEnumerator<SplitT, Serializable> enumerator;
    private SeaTunnelSplitEnumeratorContext<SplitT> enumeratorContext;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `enumeratorContext` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    private final SourceAction<?, SplitT, Serializable> source;
    private SourceSplitEnumerator<SplitT, Serializable> enumerator;
    private SeaTunnelSplitEnumeratorContext<SplitT> enumeratorContext;

    private Serializer<Serializable> enumeratorStateSerializer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `taskMemberMapping` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    private int maxReaderSize;
    private Set<Long> unfinishedReaders;
    private Map<TaskLocation, Address> taskMemberMapping;
    private Map<Long, TaskLocation> taskIDToTaskLocationMapping;
    private Map<Integer, TaskLocation> taskIndexToTaskLocationMapping;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `splitSerializer` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
    private SourceReader<T, SplitT> reader;

    private transient Serializer<SplitT> splitSerializer;

    private final int indexID;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `reader` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
    private Address enumeratorTaskAddress;

    private SourceReader<T, SplitT> reader;

    private transient Serializer<SplitT> splitSerializer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `collector` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
    private final TaskLocation currentTaskLocation;

    private SeaTunnelSourceCollector<T> collector;

    public SourceFlowLifeCycle(SourceAction<T, SplitT, ?> sourceAction, int indexID,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `wait0` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
    private final Object lock = new Object();
    boolean started = false;
    AtomicBoolean wait0 = new AtomicBoolean(false);

    public TaskCallTimer(
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `taskTracker` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
    TaskExecutionService.RunBusWorkSupplier runBusWorkSupplier;

    TaskTracker taskTracker;

    private final Object lock = new Object();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `nextExecutionTime` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
public class TaskCallTimer extends Thread {

    long nextExecutionTime;
    long delay;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `contexts` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private final IdGenerator idGenerator;
    private final TaskExecutionService taskExecutionService;
    private ConcurrentMap<Integer, SlotContext> contexts;

    public DefaultSlotService(NodeEngineImpl nodeEngine, TaskExecutionService taskExecutionService,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `assignedSlots` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private AtomicReference<ResourceProfile> assignedResource;

    private ConcurrentMap<Integer, SlotProfile> assignedSlots;

    private ConcurrentMap<Integer, SlotProfile> unassignedSlots;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `assignedResource` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private AtomicReference<ResourceProfile> unassignedResource;

    private AtomicReference<ResourceProfile> assignedResource;

    private ConcurrentMap<Integer, SlotProfile> assignedSlots;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `unassignedSlots` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private ConcurrentMap<Integer, SlotProfile> assignedSlots;

    private ConcurrentMap<Integer, SlotProfile> unassignedSlots;
    private ScheduledExecutorService scheduledExecutorService;
    private final SlotServiceConfig config;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `unassignedResource` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private final NodeEngineImpl nodeEngine;

    private AtomicReference<ResourceProfile> unassignedResource;

    private AtomicReference<ResourceProfile> assignedResource;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java

    private int tolerableFailureCheckpoints;
    private transient ScheduledExecutorService scheduler;

    private final AtomicLong latestTriggerTimestamp = new AtomicLong(0);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
    private FileSystem.Statistics stats;
    private boolean closed;
    private long pos;

    SFTPInputStream(InputStream stream, ChannelSftp channel,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `liveConnectionCount` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
    // closed.
    private int maxConnection;
    private int liveConnectionCount;
    private HashMap<ConnectionInfo, HashSet<ChannelSftp>> idleConnections =
            new HashMap<ConnectionInfo, HashSet<ChannelSftp>>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `con2infoMap` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
    private HashMap<ConnectionInfo, HashSet<ChannelSftp>> idleConnections =
            new HashMap<ConnectionInfo, HashSet<ChannelSftp>>();
    private HashMap<ChannelSftp, ConnectionInfo> con2infoMap =
            new HashMap<ChannelSftp, ConnectionInfo>();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `idleConnections` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
    private int maxConnection;
    private int liveConnectionCount;
    private HashMap<ConnectionInfo, HashSet<ChannelSftp>> idleConnections =
            new HashMap<ConnectionInfo, HashSet<ChannelSftp>>();
    private HashMap<ChannelSftp, ConnectionInfo> con2infoMap =
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inputFormat` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
    SourceReader.Context context;
    Deque<JdbcSourceSplit> splits = new LinkedList<>();
    JdbcInputFormat inputFormat;
    boolean noMoreSplit;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `splits` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java

    SourceReader.Context context;
    Deque<JdbcSourceSplit> splits = new LinkedList<>();
    JdbcInputFormat inputFormat;
    boolean noMoreSplit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noMoreSplit` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
    Deque<JdbcSourceSplit> splits = new LinkedList<>();
    JdbcInputFormat inputFormat;
    boolean noMoreSplit;

    public JdbcSourceReader(JdbcInputFormat inputFormat, SourceReader.Context context) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile Exception flushException;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jdbcStatementExecutor` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private final StatementExecutorFactory<E> statementExecutorFactory;

    private transient E jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private transient volatile boolean closed = false;

    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile Exception flushException;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `transactionalId` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
            "org.apache.kafka.clients.producer.internals.TransactionManager$State";
    private static final String PRODUCER_ID_AND_EPOCH_FIELD_NAME = "producerIdAndEpoch";
    private String transactionalId;

    public KafkaInternalProducer(Properties properties, String transactionId) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `session` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceReader.java`
#### Snippet
```java
    private final SeaTunnelRowDeserializer deserializer;

    private Session session;

    private volatile boolean noMoreSplitsAssignment;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentSplitOutput` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
    private RecordsWithSplitIds<E> currentFetch;
    private SplitContext<T, SplitStateT> currentSplitContext;
    private Collector<T> currentSplitOutput;
    private boolean noMoreSplitsAssignment;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentSplitContext` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java

    private RecordsWithSplitIds<E> currentFetch;
    private SplitContext<T, SplitStateT> currentSplitContext;
    private Collector<T> currentSplitOutput;
    private boolean noMoreSplitsAssignment;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pendingSplit` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
    private AdminClient adminClient;

    private Map<TopicPartition, KafkaSourceSplit> pendingSplit;
    private final Map<TopicPartition, KafkaSourceSplit> assignedSplit;
    private ScheduledExecutorService executor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `outputStream` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
    private final int maxNumRetries;
    private transient Socket client;
    private transient OutputStream outputStream;
    private final SerializationSchema serializationSchema;
    private volatile boolean isRunning = Boolean.TRUE;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `config` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxdbSourceReader.java`
#### Snippet
```java
public class InfluxdbSourceReader implements SourceReader<SeaTunnelRow, InfluxDBSourceSplit> {
    private InfluxDB influxdb;
    InfluxDBConfig config;

    private final SourceReader.Context context;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `influxdb` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxdbSourceReader.java`
#### Snippet
```java
@Slf4j
public class InfluxdbSourceReader implements SourceReader<SeaTunnelRow, InfluxDBSourceSplit> {
    private InfluxDB influxdb;
    InfluxDBConfig config;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `deliveryTagsProcessedForCurrentSnapshot` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java

    protected transient Set<String> correlationIdsProcessedButNotAcknowledged;
    protected transient List<Long> deliveryTagsProcessedForCurrentSnapshot;

    protected final SortedMap<Long, List<Long>> pendingDeliveryTagsToCommit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `syncClient` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/sink/TablestoreSinkClient.java`
#### Snippet
```java
    private volatile boolean initialize;
    private volatile Exception flushException;
    private SyncClient syncClient;
    private final List<RowPutChange> batchList;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `esRestClient` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    private Config pluginConfig;

    private EsRestClient esRestClient;

    private final SeaTunnelRowDeserializer deserializer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noMoreSplit` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java

    Deque<ElasticsearchSourceSplit> splits = new LinkedList<>();
    boolean noMoreSplit;

    private final long pollNextWaitTime = 1000L;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `splits` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    private final SeaTunnelRowDeserializer deserializer;

    Deque<ElasticsearchSourceSplit> splits = new LinkedList<>();
    boolean noMoreSplit;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pendingSplit` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
    private final Object stateLock = new Object();

    private Map<Integer, List<ElasticsearchSourceSplit>> pendingSplit;

    private List<String> source;
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/offset/BinlogOffset.java`
#### Snippet
```java
 * processed rows.
 */
public class BinlogOffset extends Offset {

    private static final long serialVersionUID = 1L;
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
    public SlotService getSlotService() {
        if (slotService == null) {
            synchronized (this) {
                if (slotService == null) {
                    SlotService service = new DefaultSlotService(nodeEngine, taskExecutionService, seaTunnelConfig.getEngineConfig().getSlotServiceConfig());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    public boolean updateTaskState(@NonNull ExecutionState current, @NonNull ExecutionState targetState) {
        synchronized (this) {
            // consistency check
            if (current.isEndState()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    private void resetExecutionState() {
        synchronized (this) {
            ExecutionState executionState = getExecutionState();
            if (!executionState.isEndState()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    private void deployInternal(Consumer<TaskGroupImmutableInformation> taskGroupConsumer) {
        TaskGroupImmutableInformation taskGroupImmutableInformation = getTaskGroupImmutableInformation();
        synchronized (this) {
            ExecutionState currentState = (ExecutionState) runningJobStateIMap.get(taskGroupLocation);
            if (ExecutionState.DEPLOYING.equals(currentState)) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    private boolean turnToEndState(@NonNull ExecutionState endState) {
        synchronized (this) {
            // consistency check
            ExecutionState currentState = (ExecutionState) runningJobStateIMap.get(taskGroupLocation);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

    public boolean updateJobState(@NonNull JobStatus current, @NonNull JobStatus targetState) {
        synchronized (this) {
            // consistency check
            if (current.isEndState()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

    private void turnToEndState(@NonNull JobStatus endState) {
        synchronized (this) {
            // consistency check
            JobStatus current = (JobStatus) runningJobStateIMap.get(jobId);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

    public boolean updateJobState(@NonNull JobStatus targetState) {
        synchronized (this) {
            return updateJobState((JobStatus) runningJobStateIMap.get(jobId), targetState);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    public ResourceManager getResourceManager() {
        if (resourceManager == null) {
            synchronized (this) {
                if (resourceManager == null) {
                    ResourceManager manager = new ResourceManagerFactory(nodeEngine).getResourceManager();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

    private void turnToEndState(@NonNull PipelineStatus endState) {
        synchronized (this) {
            // consistency check
            PipelineStatus current = (PipelineStatus) runningJobStateIMap.get(pipelineLocation);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

    public boolean updatePipelineState(@NonNull PipelineStatus current, @NonNull PipelineStatus targetState) {
        synchronized (this) {
            // consistency check
            if (current.isEndState()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
            logger.info(String.format("deploying task %s", taskGroup.getTaskGroupLocation()));

            synchronized (this) {
                if (executionContexts.containsKey(taskGroup.getTaskGroupLocation())) {
                    throw new RuntimeException(
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
            boolean wait;
            try {
                synchronized (this) {
                    wait = wait0.get();
                    currentTime = System.currentTimeMillis();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    public void reset() {
        if (!initStatus) {
            synchronized (this) {
                if (!initStatus) {
                    this.close();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/AbstractCheckpointStorage.java`
#### Snippet
```java
    private void initExecutor() {
        if (null == this.executorService || this.executorService.isShutdown()) {
            synchronized (this) {
                if (null == this.executorService || this.executorService.isShutdown()) {
                    this.executorService = new ThreadPoolExecutor(DEFAULT_THREAD_POOL_MIN_SIZE, DEFAULT_THREAD_POOL_MAX_SIZE, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(DEFAULT_THREAD_POOL_QUENE_SIZE), new StorageThreadFactory());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            } else {
                channel = null;
                synchronized (this) {
                    --liveConnectionCount;
                    con2infoMap.remove(channel);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            channel.connect();

            synchronized (this) {
                con2infoMap.put(channel, info);
                liveConnectionCount++;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            // close connection if too many active connections
            boolean closeConnection = false;
            synchronized (this) {
                if (liveConnectionCount > maxConnection) {
                    --liveConnectionCount;
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/utils/HiveMetaStoreProxy.java`
#### Snippet
```java
    public static HiveMetaStoreProxy getInstance(Config config) {
        if (INSTANCE == null) {
            synchronized (HiveMetaStoreProxy.class) {
                if (INSTANCE == null) {
                    String metastoreUri = config.getString(HiveConfig.METASTORE_URI.key());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                this.scheduler.scheduleWithFixedDelay(
                    () -> {
                        synchronized (JdbcOutputFormat.this) {
                            if (!closed) {
                                try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
    public void close() throws IOException {
        isRunning = false;
        synchronized (this) {
            this.notifyAll();
            try {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
        isRunning = false;
        synchronized (this) {
            this.notifyAll();
            try {
                if (outputStream != null) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
                row, hostName, port, e);

            synchronized (SocketClient.class) {
                IOException lastException = null;
                retries = 0;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
                    }
                    try {
                        this.wait(CONNECTION_RETRY_DELAY);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
    public void open() throws IOException {
        try {
            synchronized (SocketClient.class) {
                createConnection();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/IcebergStreamSplitEnumerator.java`
#### Snippet
```java
    @Override
    public void handleSplitRequest(int subtaskId) {
        synchronized (this) {
            if (pendingSplits.isEmpty() ||
                pendingSplits.get(subtaskId) == null) {
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtension.java`
#### Snippet
```java
    @Override
    public TextCommandService createTextCommandService() {
        return new TextCommandServiceImpl(node) {
            {
                register(HTTP_GET, new Log4j2HttpGetCommandProcessor(this));
```

### DoubleBraceInitialization
Double brace initialization
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
public class EsTypeMappingSeaTunnelType {

    private static final Map<String, SeaTunnelDataType> MAPPING = new HashMap() {
        {
            put("string", BasicType.STRING_TYPE);
```

### DoubleBraceInitialization
Double brace initialization
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/source/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java
    private final ObjectMapper mapper = new ObjectMapper();

    private final Map<Integer, DateTimeFormatter> dateTimeFormatterMap = new HashMap<Integer, DateTimeFormatter>(){
        {
            put("yyyy-MM-dd HH".length(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH"));
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
        try (final InputStream is = new FileInputStream(inputFile);
             final TarArchiveInputStream debInputStream = (TarArchiveInputStream) new ArchiveStreamFactory().createArchiveInputStream("tar", is)) {
            TarArchiveEntry entry = null;
            while ((entry = (TarArchiveEntry) debInputStream.getNextEntry()) != null) {
                final File outputFile = new File(outputDir, entry.getName());
```

### UnusedAssignment
Variable `table` initializer `null` is redundant
in `seatunnel-transforms/seatunnel-transforms-flink/seatunnel-transform-flink-sql/src/main/java/org/apache/seatunnel/flink/transform/Sql.java`
#### Snippet
```java
    public DataSet<Row> processBatch(FlinkEnvironment env, DataSet<Row> data) throws Exception {
        BatchTableEnvironment tableEnvironment = env.getBatchTableEnvironment();
        Table table = null;
        try {
            table = tableEnvironment.sqlQuery(sql);
```

### UnusedAssignment
Variable `table` initializer `null` is redundant
in `seatunnel-transforms/seatunnel-transforms-flink/seatunnel-transform-flink-sql/src/main/java/org/apache/seatunnel/flink/transform/Sql.java`
#### Snippet
```java
    public DataStream<Row> processStream(FlinkEnvironment env, DataStream<Row> dataStream) throws Exception {
        StreamTableEnvironment tableEnvironment = env.getStreamTableEnvironment();
        Table table = null;
        try {
            table = tableEnvironment.sqlQuery(sql);
```

### UnusedAssignment
Variable `checkpointId` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
#### Snippet
```java
public class FlinkWriterState<StateT> implements Serializable {

    private long checkpointId = 0;

    private StateT state;
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        try (FSDataInputStream inputStream = fileSystem.open(hdfsPath);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            int i = 0;
            final int defaultLen = 1024;
            byte[] buffer = new byte[defaultLen];
```

### UnusedAssignment
Variable `dataIt` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceSplitReader.java`
#### Snippet
```java
        checkSplitOrStartNext();
        checkNeedStopBinlogReader();
        Iterator<SourceRecords> dataIt = null;
        try {
            dataIt = currentFetcher.pollSplitRecords();
```

### UnusedAssignment
Variable `client` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
     */
    private FTPClient connect() throws IOException {
        FTPClient client = null;
        Configuration conf = getConf();
        String host = conf.get(FS_FTP_HOST);
```

### UnusedAssignment
Variable `user` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        private String host = "";
        private int port;
        private String user = "";

        ConnectionInfo(String hst, int prt, String usr) {
```

### UnusedAssignment
Variable `host` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
     */
    static class ConnectionInfo {
        private String host = "";
        private int port;
        private String user = "";
```

### UnusedAssignment
Variable `session` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        // create a new connection and add to pool
        JSch jsch = new JSch();
        Session session = null;
        try {
            if (user == null || user.length() == 0) {
```

### UnusedAssignment
Variable `fileStat` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        Path absolute = makeAbsolute(workDir, file);
        String pathName = absolute.toUri().getPath();
        FileStatus fileStat = null;
        try {
            fileStat = getFileStatus(channel, absolute);
```

### UnusedAssignment
Variable `kuduScanner` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

    public KuduScanner getKuduBuildSplit(int lowerBound, int upperBound) {
        KuduScanner kuduScanner = null;
        try {
            KuduScanner.KuduScannerBuilder kuduScannerBuilder =
```

### UnusedAssignment
Variable `columns` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

    public List<ColumnSchema> getColumnsSchemas() {
        List<ColumnSchema> columns = null;
        try {
            schema = kuduClient.openTable(tableName).getSchema();
```

### UnusedAssignment
Variable `keyColumn` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java

    private PartitionParameter initPartitionParameter(KuduClient kuduClient, String tableName) {
        String keyColumn = null;
        int maxKey = 0;
        int minKey = 0;
```

### UnusedAssignment
Variable `kudumaster` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
    @Override
    public void prepare(Config config) {
        String kudumaster = "";
        String tableName = "";
        String columnslist = "";
```

### UnusedAssignment
Variable `tableName` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
    public void prepare(Config config) {
        String kudumaster = "";
        String tableName = "";
        String columnslist = "";
        CheckResult checkResult = CheckConfigUtil.checkAllExists(config, KuduSourceConfig.KUDU_MASTER.key(), KuduSourceConfig.TABLE_NAME.key(), KuduSourceConfig.COLUMNS_LIST.key());
```

### UnusedAssignment
Variable `columnslist` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
        String kudumaster = "";
        String tableName = "";
        String columnslist = "";
        CheckResult checkResult = CheckConfigUtil.checkAllExists(config, KuduSourceConfig.KUDU_MASTER.key(), KuduSourceConfig.TABLE_NAME.key(), KuduSourceConfig.COLUMNS_LIST.key());
        if (checkResult.isSuccess()) {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/SqlType.java`
#### Snippet
```java
    TIME,
    TIMESTAMP,
    ROW;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/job/StatusUpdate.java`
#### Snippet
```java
public enum StatusUpdate {
    STOP,
    CANCEL;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/SubtaskStatus.java`
#### Snippet
```java
    RUNNING,
    SAVEPOINT_PREPARE_CLOSE,
    AUTO_PREPARE_CLOSE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
        extends Supplier<T>, Serializable {}

    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/config/KafkaSemantics.java`
#### Snippet
```java
     */
    EXACTLY_ONCE,
    ;


```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-redis/src/main/java/org/apache/seatunnel/connectors/seatunnel/redis/config/RedisConfig.java`
#### Snippet
```java
    public enum RedisMode {
        SINGLE,
        CLUSTER;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-redis/src/main/java/org/apache/seatunnel/connectors/seatunnel/redis/config/RedisConfig.java`
#### Snippet
```java
    public enum HashKeyParseMode {
        ALL,
        KV;
    }

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDag.java`
#### Snippet
```java
        JsonArray vertices = new JsonArray();

        logicalVertexMap.values().stream().forEach(v -> {
            JsonObject vertex = new JsonObject();
            vertex.add("id", v.getVertexId());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDag.java`
#### Snippet
```java

        JsonArray edges = new JsonArray();
        this.edges.stream().forEach(e -> {
            JsonObject edge = new JsonObject();
            edge.add("inputVertex", e.getInputVertex().getAction().getName());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

    public PassiveCompletableFuture<PipelineStatus> initStateFuture() {
        physicalVertexList.stream().forEach(physicalVertex -> {
            addPhysicalVertexCallBack(physicalVertex.initStateFuture());
        });
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        });

        coordinatorVertexList.stream().forEach(coordinator -> {
            addPhysicalVertexCallBack(coordinator.initStateFuture());
        });
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/AbstractCheckpointStorage.java`
#### Snippet
```java
            }
        });
        return latestPipelineMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toSet());
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
    @Override
    public KafkaSourceState snapshotState(long checkpointId) throws Exception {
        return new KafkaSourceState(assignedSplit.values().stream().collect(Collectors.toSet()));
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
        Map<String, String> headerMap = new HashMap<>();
        if (null != fieldNames && !fieldNames.isEmpty() && SinkConfig.StreamLoadFormat.CSV.equals(sinkConfig.getLoadFormat())) {
            headerMap.put("columns", String.join(",", fieldNames.stream().map(f -> String.format("`%s`", f)).collect(Collectors.toList())));
        }
        if (null != sinkConfig.getStreamLoadProps()) {
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
        int index = defaultUrl.lastIndexOf("/")  + 1;
        res[0] = defaultUrl.substring(0, index);
        res[1] = defaultUrl.substring(index, defaultUrl.length());
        return res;
    }
```

## RuleId[ruleID=CollectionContainsUrl]
### CollectionContainsUrl
Set `paths` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        if (config.hasPath(path)) {
            Set<URL> paths = Arrays.stream(config.getString(path).split(";")).map(uri -> {
                try {
                    return new URL(uri);
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SourceExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelSourcePluginDiscovery sourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery();
        List<SeaTunnelSource<?, ?, ?>> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier = PluginIdentifier.of(
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelSourcePluginDiscovery sourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery(addUrlToClassloader);
        List<SeaTunnelSource> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier = PluginIdentifier.of(
```

### CollectionContainsUrl
Set `pluginJars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        }
        Config config = new ConfigBuilder(Paths.get(commandArgs.getConfigFile())).getConfig();
        Set<URL> pluginJars = new HashSet<>();
        SeaTunnelSourcePluginDiscovery seaTunnelSourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery();
        SeaTunnelSinkPluginDiscovery seaTunnelSinkPluginDiscovery = new SeaTunnelSinkPluginDiscovery();
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    private final Set<URL> jarUrls;

    protected AbstractAction(long id, @NonNull String name, @NonNull List<Action> upstreams, @NonNull Set<URL> jarUrls) {
        this.id = id;
        this.name = name;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    }

    protected AbstractAction(long id, @NonNull String name, @NonNull Set<URL> jarUrls) {
        this.id = id;
        this.name = name;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    private int parallelism = 1;

    private final Set<URL> jarUrls;

    protected AbstractAction(long id, @NonNull String name, @NonNull List<Action> upstreams, @NonNull Set<URL> jarUrls) {
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SourceAction.java`
#### Snippet
```java
                        @NonNull String name,
                        @NonNull SeaTunnelSource<T, SplitT, StateT> source,
                        @NonNull Set<URL> jarUrls) {
        super(id, name, Lists.newArrayList(), jarUrls);
        this.source = source;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/TransformAction.java`
#### Snippet
```java
                           @NonNull List<Action> upstreams,
                           @NonNull SeaTunnelTransform<?> transform,
                           @NonNull Set<URL> jarUrls) {
        super(id, name, upstreams, jarUrls);
        this.transform = transform;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/TransformAction.java`
#### Snippet
```java
                           @NonNull String name,
                           @NonNull SeaTunnelTransform<?> transform,
                           @NonNull Set<URL> jarUrls) {
        super(id, name, jarUrls);
        this.transform = transform;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/PartitionTransformAction.java`
#### Snippet
```java
                                    @NonNull String name,
                                    @NonNull PartitionSeaTunnelTransform partitionTransformation,
                                    @NonNull Set<URL> jarUrls) {
        super(id, name, jarUrls);
        this.partitionTransformation = partitionTransformation;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/PartitionTransformAction.java`
#### Snippet
```java
                                    @NonNull List<Action> upstreams,
                                    @NonNull PartitionSeaTunnelTransform partitionTransformation,
                                    @NonNull Set<URL> jarUrls) {
        super(id, name, upstreams, jarUrls);
        this.partitionTransformation = partitionTransformation;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/TransformChainAction.java`
#### Snippet
```java
    public TransformChainAction(long id,
                                @NonNull String name,
                                @NonNull Set<URL> jarUrls,
                                @NonNull List<SeaTunnelTransform<T>> transforms) {
        super(id, name, jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/TransformChainAction.java`
#### Snippet
```java
                                @NonNull String name,
                                @NonNull List<Action> upstreams,
                                @NonNull Set<URL> jarUrls,
                                @NonNull List<SeaTunnelTransform<T>> transforms) {
        super(id, name, upstreams, jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SinkAction.java`
#### Snippet
```java
                      @NonNull String name,
                      @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
                      @NonNull Set<URL> jarUrls) {
        super(id, name, jarUrls);
        this.sink = sink;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SinkAction.java`
#### Snippet
```java
                      @NonNull List<Action> upstreams,
                      @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
                      @NonNull Set<URL> jarUrls) {
        super(id, name, upstreams, jarUrls);
        this.sink = sink;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/job/JobExecutionEnvironment.java`
#### Snippet
```java
    private final List<Action> actions = new ArrayList<>();

    private final Set<URL> jarUrls = new HashSet<>();

    private final List<URL> commonPluginJars = new ArrayList<>();
```

### CollectionContainsUrl
Set `pluginJarsUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
                          int pipelineId,
                          int totalPipelineNum,
                          Set<URL> pluginJarsUrls,
                          @NonNull JobImmutableInformation jobImmutableInformation,
                          long initializationTimestamp,
```

### CollectionContainsUrl
Set `pluginJarsUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    private final int totalPipelineNum;

    private final Set<URL> pluginJarsUrls;

    private final IMap<Object, Object> runningJobStateIMap;
```

### CollectionContainsUrl
Set `jarUrlsSet` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java

    private List<Action> actions = new ArrayList<>();
    private Set<URL> jarUrlsSet = new HashSet<>();

    private JobConfig jobConfig;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                                                  @NonNull List<Action> upstreams,
                                                  @NonNull SeaTunnelTransform transformation,
                                                  Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                                            @NonNull String name,
                                            @NonNull SeaTunnelSource source,
                                            Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                                        @NonNull List<Action> upstreams,
                                        @NonNull SeaTunnelSink sink,
                                        Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                                                  @NonNull String name,
                                                  @NonNull SeaTunnelTransform transformation,
                                                  Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                                        @NonNull String name,
                                        @NonNull SeaTunnelSink sink,
                                        Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            List<SeaTunnelTransform> transforms = new ArrayList<>(chainedVertices.size());
            List<String> names = new ArrayList<>(chainedVertices.size());
            Set<URL> jars = new HashSet<>();
            chainedVertices.stream()
                .peek(vertex -> logicalToExecutionMap.put(vertex.getVertexId(), newId))
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/TaskGroupImmutableInformation.java`
#### Snippet
```java
    private Data group;

    private Set<URL> jars;

    public TaskGroupImmutableInformation(){
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
        TaskGroup taskGroup = null;
        try {
            Set<URL> jars = taskImmutableInfo.getJars();
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (!CollectionUtils.isEmpty(jars)) {
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                            }
                        }).peek(this::fillCheckpointPlan).collect(Collectors.toList());
                    Set<URL> jars =
                        taskList.stream().flatMap(task -> task.getJarsUrl().stream()).collect(Collectors.toSet());

```

## RuleId[ruleID=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
                try {
                    jobMaster.cancelJob();
                    jobMaster.run();
                } finally {
                    // storage job state info to HistoryStorage
```

### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
                try {
                    jobMaster.getPhysicalPlan().getPipelineList().forEach(SubPlan::restorePipelineState);
                    jobMaster.run();
                } finally {
                    // storage job state info to HistoryStorage
```

### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

            try {
                jobMaster.run();
            } finally {
                // storage job state info to HistoryStorage
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.prepareClose` accessed in synchronized context
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
        synchronized (collector.getCheckpointLock()) {
            if (barrier.prepareClose()) {
                this.prepareClose = true;
            }
            if (barrier.snapshot()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `wait0` accessed in synchronized context
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
            try {
                synchronized (this) {
                    wait = wait0.get();
                    currentTime = System.currentTimeMillis();
                    executionTime = this.nextExecutionTime;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.nextExecutionTime` accessed in synchronized context
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
                    wait = wait0.get();
                    currentTime = System.currentTimeMillis();
                    executionTime = this.nextExecutionTime;
                    if (!wait && executionTime <= currentTime) {
                        timeoutAct(this.taskTracker.expiredTimes.incrementAndGet());
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.taskTracker` accessed in synchronized context
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
                    executionTime = this.nextExecutionTime;
                    if (!wait && executionTime <= currentTime) {
                        timeoutAct(this.taskTracker.expiredTimes.incrementAndGet());
                        break;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalRowCollector` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                }
                synchronized (checkpointLock) {
                    if (internalRowCollector.collectTotalCount() != 0 || checkpointRetries == 0) {
                        checkpointRetries = 0;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `checkpointId` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                        // Block #next() method
                        synchronized (handover) {
                            final int currentCheckpoint = checkpointId;
                            ReaderState readerState = snapshotState();
                            saveState(readerState, currentCheckpoint);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalSource` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                            ReaderState readerState = snapshotState();
                            saveState(readerState, currentCheckpoint);
                            internalSource.notifyCheckpointComplete(currentCheckpoint);
                            running = false;
                        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                            saveState(readerState, currentCheckpoint);
                            internalSource.notifyCheckpointComplete(currentCheckpoint);
                            running = false;
                        }
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `checkpointId` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
            // Block #next() method
            synchronized (handover) {
                final int currentCheckpoint = checkpointId;
                ReaderState readerState = snapshotState();
                saveState(readerState, currentCheckpoint);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalSource` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
                ReaderState readerState = snapshotState();
                saveState(readerState, currentCheckpoint);
                internalSource.notifyCheckpointComplete(currentCheckpoint);
                running = false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `running` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
                saveState(readerState, currentCheckpoint);
                internalSource.notifyCheckpointComplete(currentCheckpoint);
                running = false;
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `splits` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        synchronized (output.getCheckpointLock()) {
            JdbcSourceSplit split = splits.poll();
            if (null != split) {
                inputFormat.open(split);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inputFormat` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
            JdbcSourceSplit split = splits.poll();
            if (null != split) {
                inputFormat.open(split);
                while (!inputFormat.reachedEnd()) {
                    SeaTunnelRow seaTunnelRow = inputFormat.nextRecord();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inputFormat` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
            if (null != split) {
                inputFormat.open(split);
                while (!inputFormat.reachedEnd()) {
                    SeaTunnelRow seaTunnelRow = inputFormat.nextRecord();
                    output.collect(seaTunnelRow);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inputFormat` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                inputFormat.open(split);
                while (!inputFormat.reachedEnd()) {
                    SeaTunnelRow seaTunnelRow = inputFormat.nextRecord();
                    output.collect(seaTunnelRow);
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inputFormat` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                    output.collect(seaTunnelRow);
                }
                inputFormat.close();
            } else if (noMoreSplit) {
                // signal to the source that we have reached the end of the data.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `noMoreSplit` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                }
                inputFormat.close();
            } else if (noMoreSplit) {
                // signal to the source that we have reached the end of the data.
                LOG.info("Closed the bounded jdbc source");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                // signal to the source that we have reached the end of the data.
                LOG.info("Closed the bounded jdbc source");
                context.signalNoMoreElement();
            } else {
                Thread.sleep(1000L);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `deliveryTagsProcessedForCurrentSnapshot` accessed in synchronized context
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java
                    return;
                }
                deliveryTagsProcessedForCurrentSnapshot.add(envelope.getDeliveryTag());
                deserializationSchema.deserialize(body, output);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `splits` accessed in synchronized context
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        synchronized (output.getCheckpointLock()) {
            ElasticsearchSourceSplit split = splits.poll();
            if (split != null){
                SourceIndexInfo sourceIndexInfo = split.getSourceIndexInfo();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `noMoreSplit` accessed in synchronized context
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
                    outputFromScrollResult(scrollResult, sourceIndexInfo.getSource(), output);
                }
            } else if (noMoreSplit) {
                // signal to the source that we have reached the end of the data.
                log.info("Closed the bounded ELasticsearch source");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
                // signal to the source that we have reached the end of the data.
                log.info("Closed the bounded ELasticsearch source");
                context.signalNoMoreElement();
            } else {
                Thread.sleep(pollNextWaitTime);
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/RowKind.java`
#### Snippet
```java
     */
    @SuppressWarnings("MagicNumber")
    public static RowKind fromByteValue(byte value) {
        switch (value) {
            case 0:
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/option/SourceOptions.java`
#### Snippet
```java

@SuppressWarnings("MagicNumber")
public class SourceOptions {

    public static final Option<Integer> SNAPSHOT_SPLIT_SIZE = Options.key("snapshot.split.size")
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
    /** Returns the distribution factor of the given table. */
    @SuppressWarnings("MagicNumber")
    private double calculateDistributionFactor(
            TableId tableId, Object min, Object max, long approximateRowCnt) {

```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private static void maySleep(int count, TableId tableId) {
        // every 100 queries to sleep 1s
        if (count % 10 == 0) {
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderOptions.java`
#### Snippet
```java
@Getter
@SuppressWarnings("MagicNumber")
public class SourceReaderOptions {
    public static final Option<Long> SOURCE_READER_CLOSE_TIMEOUT =
        Options.key("source.reader.close.timeout")
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/config/HttpParameter.java`
#### Snippet
```java
@Data
@SuppressWarnings("MagicNumber")
public class HttpParameter implements Serializable {
    protected String url;
    protected HttpRequestMethod method;
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
     */
    @SuppressWarnings("MagicNumber")
    public static void validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        checkArgument(parts.length == 3);
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/MySqlCatalog.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private Map<String, String> buildConnectorOptions(TablePath tablePath) {
        Map<String, String> options = new HashMap<>(8);
        options.put("connector", "jdbc");
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void checkLabelState(String host, String label) throws IOException {
        int idx = 0;
        while (true) {
```

### RedundantSuppression
Redundant suppression
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/log/Log4j2HttpPostCommandProcessor.java`
#### Snippet
```java
     */
    @SuppressWarnings("MagicNumber")
    private void setLoggerLevel(HttpPostCommand request) {
        try {
            String[] params = decodeParamsAndAuthenticate(request, 4);
```

### RedundantSuppression
Redundant suppression
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    public static final DateTimeFormatter TIME_FORMAT =
        new DateTimeFormatterBuilder()
            .appendPattern("HH:mm:ss")
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'writerStateSerializer'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private SinkWriter<T, CommitInfoT, StateT> writer;

    private transient Optional<Serializer<StateT>> writerStateSerializer;

    private final int indexID;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'committer'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private final TaskLocation committerTaskLocation;

    private Optional<SinkCommitter<CommitInfoT>> committer;

    private Optional<CommitInfoT> lastCommitInfo;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lastCommitInfo'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private Optional<SinkCommitter<CommitInfoT>> committer;

    private Optional<CommitInfoT> lastCommitInfo;

    private final boolean containAggCommitter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'condition'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        String projection,
        String maxColumnProjection,
        Optional<String> condition,
        String orderBy) {
        final StringBuilder sql = new StringBuilder("SELECT ");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'condition'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        int limit,
        String projection,
        Optional<String> condition,
        Optional<String> orderBy) {
        final StringBuilder sql = new StringBuilder("SELECT ");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'orderBy'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        String projection,
        Optional<String> condition,
        Optional<String> orderBy) {
        final StringBuilder sql = new StringBuilder("SELECT ");
        sql.append(projection).append(" FROM ");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'failure'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/GroupXaOperationResult.java`
#### Snippet
```java
    private final List<T> failed = new ArrayList<>();
    private final List<T> toRetry = new ArrayList<>();
    private Optional<Exception> failure = Optional.empty();
    private Optional<Exception> transientFailure = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transientFailure'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/GroupXaOperationResult.java`
#### Snippet
```java
    private final List<T> toRetry = new ArrayList<>();
    private Optional<Exception> failure = Optional.empty();
    private Optional<Exception> transientFailure = Optional.empty();

    void failedTransiently(T x, XaFacade.TransientXaException e) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java

    private static RuntimeException wrapException(
        String action, Optional<Xid> xid, Exception ex) {
        if (ex instanceof XAException) {
            XAException xa = (XAException) ex;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
        private Command(
            String name,
            Optional<Xid> xid,
            Callable<T> callable,
            Function<XAException, Optional<T>> recover) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java

    private static String formatErrorMessage(
        String action, Optional<Xid> xid, Optional<Integer> errorCode, String... more) {
        return String.format(
            "unable to %s%s%s%s",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'errorCode'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java

    private static String formatErrorMessage(
        String action, Optional<Xid> xid, Optional<Integer> errorCode, String... more) {
        return String.format(
            "unable to %s%s%s%s",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
    private static class Command<T> {
        private final String name;
        private final Optional<Xid> xid;
        private final Callable<T> callable;
        private final Function<XAException, Optional<T>> recover;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
        }

        private Command(String name, Optional<Xid> xid, Callable<T> callable) {
            this(name, xid, callable, e -> empty());
        }
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDagGenerator.java`
#### Snippet
```java
        this.jobConfig = jobConfig;
        this.idGenerator = idGenerator;
        if (actions.size() <= 0) {
            throw new IllegalStateException("No actions define in the job. Cannot execute.");
        }
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        try {
            return MySqlValueConverters.stringToLocalDate(
                new String(b.getBytes(1, (int) (b.length())), "UTF-8"), column, table);
        } catch (UnsupportedEncodingException e) {
            LOG.error("Could not read MySQL TIME value as UTF-8");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        try {
            return MySqlValueConverters.containsZeroValuesInDatePart(
                new String(b.getBytes(1, (int) (b.length())), "UTF-8"),
                column,
                table) ? null
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        try {
            return MySqlValueConverters.stringToDuration(
                new String(b.getBytes(1, (int) (b.length())), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            LOG.error("Could not read MySQL TIME value as UTF-8");
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CommandLineUtils.java`
#### Snippet
```java
            obj.setOriginalParameters(jCommander.getUnknownOptions());
        } catch (ParameterException e) {
            System.err.println(e.getLocalizedMessage());
            exit(jCommander);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/FlinkStarter.java`
#### Snippet
```java
    public static void main(String[] args) {
        FlinkStarter flinkStarter = new FlinkStarter(args);
        System.out.println(String.join(" ", flinkStarter.buildCommands()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/command/ClientExecuteCommand.java`
#### Snippet
```java
            if (clientCommandArgs.isListJob()) {
                String jobstatus = engineClient.listJobStatus();
                System.out.println(jobstatus);
            } else if (null != clientCommandArgs.getJobId()) {
                String jobState = engineClient.getJobState(Long.parseLong(clientCommandArgs.getJobId()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/command/ClientExecuteCommand.java`
#### Snippet
```java
            } else if (null != clientCommandArgs.getJobId()) {
                String jobState = engineClient.getJobState(Long.parseLong(clientCommandArgs.getJobId()));
                System.out.println(jobState);
            } else {
                Path configFile = FileUtils.getConfigPath(clientCommandArgs);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        SparkStarter starter = getInstance(args);
        List<String> command = starter.buildCommands();
        System.out.println(String.join(" ", command));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-connectors-v2/connector-console/src/main/java/org/apache/seatunnel/connectors/seatunnel/console/sink/ConsoleSinkWriter.java`
#### Snippet
```java
            arr[i] = fieldToString(fieldTypes[i], fields[i]);
        }
        System.out.format("subtaskIndex=%s: row=%s : %s%n", context.getIndexOfSubtask(), CNT.incrementAndGet(), StringUtils.join(arr, ", "));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-connectors-v2/connector-console/src/main/java/org/apache/seatunnel/connectors/seatunnel/console/sink/ConsoleSinkWriter.java`
#### Snippet
```java
        this.seaTunnelRowType = seaTunnelRowType;
        this.context = context;
        System.out.printf("fields : %s%n", StringUtils.join(seaTunnelRowType.getFieldNames(), ", "));
        System.out.printf("types : %s%n", StringUtils.join(seaTunnelRowType.getFieldTypes(), ", "));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-connectors-v2/connector-console/src/main/java/org/apache/seatunnel/connectors/seatunnel/console/sink/ConsoleSinkWriter.java`
#### Snippet
```java
        this.context = context;
        System.out.printf("fields : %s%n", StringUtils.join(seaTunnelRowType.getFieldNames(), ", "));
        System.out.printf("types : %s%n", StringUtils.join(seaTunnelRowType.getFieldTypes(), ", "));
    }

```

## RuleId[ruleID=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldNames`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        this.fieldsIndex = new int[outputFieldNames.length];
        if (outputFieldNames.length != new HashSet<>(Arrays.asList(outputFieldNames)).size()) {
            throw new IllegalStateException("Duplicate field names are not allowed. field names: " + outputFieldNames);
        }

```

### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldNames`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        if (outputFieldNames.length != outputFieldDataTypes.length) {
            throw new IllegalStateException("Field name and field type count mismatch, field names: "
                + outputFieldNames + ", field types: " + outputFieldDataTypes);
        }

```

### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldDataTypes`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        if (outputFieldNames.length != outputFieldDataTypes.length) {
            throw new IllegalStateException("Field name and field type count mismatch, field names: "
                + outputFieldNames + ", field types: " + outputFieldDataTypes);
        }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/JobContext.java`
#### Snippet
```java

    public JobContext() {
        this.jobId = UUID.randomUUID().toString().replace("-", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/util/FileSystemUtils.java`
#### Snippet
```java

    public static FileSystem getFileSystem(@NonNull String path) throws IOException {
        FileSystem fileSystem = FileSystem.get(URI.create(path.replaceAll("\\\\", "/")), CONF);
        fileSystem.setWriteChecksum(false);
        return fileSystem;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                    String typeInfo = type.getLogicalTypeAnnotation().toString()
                            .replaceAll(SqlType.DECIMAL.toString(), "")
                            .replaceAll("\\(", "")
                            .replaceAll("\\)", "");
                    String[] splits = typeInfo.split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                            .replaceAll(SqlType.DECIMAL.toString(), "")
                            .replaceAll("\\(", "")
                            .replaceAll("\\)", "");
                    String[] splits = typeInfo.split(",");
                    int precision = Integer.parseInt(splits[0]);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java
            Map<String, List<String>> partitionDirAndValuesMap = aggregatedCommitInfo.getPartitionDirAndValuesMap();
            List<String> partitions = partitionDirAndValuesMap.keySet().stream()
                    .map(partition -> partition.replaceAll("\\\\", "/"))
                    .collect(Collectors.toList());
            try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java
                Map<String, List<String>> partitionDirAndValuesMap = aggregatedCommitInfo.getPartitionDirAndValuesMap();
                List<String> partitions = partitionDirAndValuesMap.keySet().stream()
                        .map(partition -> partition.replaceAll("\\\\", "/"))
                        .collect(Collectors.toList());
                try {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    @SuppressWarnings("MagicNumber")
    public static void validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        checkArgument(parts.length == 3);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
     */
    public static void validateJdbcUrlWithoutDatabase(String url) {
        String[] parts = url.trim().split("\\/+");

        checkArgument(parts.length == 2);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceSplitEnumerator.java`
#### Snippet
```java
        String sqlAlign = null;
        String sqlCondition = null;
        String[] sqls = sqlBase.split("(?i)" + SQL_ALIGN);
        if (sqls.length > 1) {
            sqlBase = sqls[0];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceSplitEnumerator.java`
#### Snippet
```java
            sqlAlign = sqls[1];
        }
        sqls = sqlBase.split("(?i)" + SQL_WHERE);
        if (sqls.length > SQL_WHERE_SPLIT_LENGTH) {
            throw new IotdbConnectorException(CommonErrorCode.ILLEGAL_ARGUMENT,
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
                .substring(start + 1, end)
                // replace the space between key and value
                .replace(" ", "");
        int index;
        if (genericType.startsWith(SqlType.DECIMAL.name())) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
                .substring(start + 1, end)
                // replace the space between key and value
                .replace(" ", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
                .substring(start + 1, end)
                // replace the space between precision and scale
                .replace(" ", "");
        String[] split = decimalInfo.split(",");
        if (split.length < 2) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/inject/StringInjectFunction.java`
#### Snippet
```java

    private static String replace(String str) {
        return str.replaceAll("\\(", "[").replaceAll("\\)", "]");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/inject/StringInjectFunction.java`
#### Snippet
```java

    private static String replace(String str) {
        return str.replaceAll("\\(", "[").replaceAll("\\)", "]");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
    public String localizationEngine(String engine, String ddl) {
        if ("ReplicatedMergeTree".equalsIgnoreCase(engine)) {
            return ddl.replaceAll("ReplicatedMergeTree(\\([^\\)]*\\))", "MergeTree()");
        } else {
            return ddl;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
                String engineFull = record.getValue(0).asString();
                List<String> infos = Arrays.stream(engineFull.substring(12).split(","))
                        .map(s -> s.replace("'", "").trim()).collect(Collectors.toList());
                return new DistributedEngine(infos.get(0), infos.get(1), infos.get(2).replace("\\)", "").trim());
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
                List<String> infos = Arrays.stream(engineFull.substring(12).split(","))
                        .map(s -> s.replace("'", "").trim()).collect(Collectors.toList());
                return new DistributedEngine(infos.get(0), infos.get(1), infos.get(2).replace("\\)", "").trim());
            }
            throw new RuntimeException("Cannot get distributed table from clickhouse, resultSet is empty");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        String uuid = UUID.randomUUID().toString().substring(0, UUID_LENGTH).replaceAll("-", "_");
        String clickhouseLocalFile = String.format("%s/%s", CLICKHOUSE_LOCAL_FILE_PREFIX, uuid);
        FileUtils.forceMkdir(new File(clickhouseLocalFile));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
        command.add(String.format(
                "\"%s; INSERT INTO TABLE %s SELECT %s FROM temp_table%s;\"",
                clickhouseTable.getCreateTableDDL().replace(clickhouseTable.getDatabase() + ".", "").replaceAll("`", ""),
                clickhouseTable.getLocalTableName(),
                readerOption.getTableSchema().keySet().stream().map(s -> {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/source/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java

    private LocalDateTime parseDate(String fieldValue){
        String formatDate = fieldValue.replace("T", " ");
        if (fieldValue.length() == "yyyyMMdd".length() || fieldValue.length() == "yyyy-MM-dd".length()){
            formatDate = fieldValue + " 00:00:00";
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
        HttpHost[] httpHosts = new HttpHost[hosts.size()];
        for (int i = 0; i < hosts.size(); i++) {
            String[] hostInfo = hosts.get(i).replace("http://", "").split(":");
            httpHosts[i] = new HttpHost(hostInfo[0], Integer.parseInt(hostInfo[1]));
        }
```

## RuleId[ruleID=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                switch (elementType.getSqlType()) {
                    case STRING:
                        return objectArrayList.toArray(new String[0]);
                    case BOOLEAN:
                        return objectArrayList.toArray(new Boolean[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Boolean\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new String[0]);
                    case BOOLEAN:
                        return objectArrayList.toArray(new Boolean[0]);
                    case TINYINT:
                        return objectArrayList.toArray(new Byte[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Byte\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Boolean[0]);
                    case TINYINT:
                        return objectArrayList.toArray(new Byte[0]);
                    case SMALLINT:
                        return objectArrayList.toArray(new Short[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Short\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Byte[0]);
                    case SMALLINT:
                        return objectArrayList.toArray(new Short[0]);
                    case INT:
                        return objectArrayList.toArray(new Integer[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Integer\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Short[0]);
                    case INT:
                        return objectArrayList.toArray(new Integer[0]);
                    case BIGINT:
                        return objectArrayList.toArray(new Long[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Long\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Integer[0]);
                    case BIGINT:
                        return objectArrayList.toArray(new Long[0]);
                    case FLOAT:
                        return objectArrayList.toArray(new Float[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Float\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Long[0]);
                    case FLOAT:
                        return objectArrayList.toArray(new Float[0]);
                    case DOUBLE:
                        return objectArrayList.toArray(new Double[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Double\[\]' found
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Float[0]);
                    case DOUBLE:
                        return objectArrayList.toArray(new Double[0]);
                    default:
                        String errorMsg = String.format("SeaTunnel array not support this data type [%s]", elementType.getSqlType());
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'org.apache.seatunnel.format.json.RowToJsonConverters.RowToJsonConverter\[\]' found
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                            }
                        })
                        .toArray(new IntFunction<RowToJsonConverter[]>() {
                            @Override
                            public RowToJsonConverter[] apply(int value) {
                                return new RowToJsonConverter[value];
                            }
                        });
        final String[] fieldNames = rowType.getFieldNames();
        final int arity = fieldNames.length;
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'org.apache.seatunnel.format.json.JsonToRowConverters.JsonToRowConverter\[\]' found
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                    }
                })
                .toArray(new IntFunction<JsonToRowConverter[]>() {
                    @Override
                    public JsonToRowConverter[] apply(int value) {
                        return new JsonToRowConverter[value];
                    }
                });
        final String[] fieldNames = rowType.getFieldNames();

```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                switch (elementType.getSqlType()) {
                    case STRING:
                        return origArray.toArray(TYPE_ARRAY_STRING);
                    case BOOLEAN:
                        return origArray.toArray(TYPE_ARRAY_BOOLEAN);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Boolean\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_STRING);
                    case BOOLEAN:
                        return origArray.toArray(TYPE_ARRAY_BOOLEAN);
                    case TINYINT:
                        return origArray.toArray(TYPE_ARRAY_BYTE);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Byte\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_BOOLEAN);
                    case TINYINT:
                        return origArray.toArray(TYPE_ARRAY_BYTE);
                    case SMALLINT:
                        return origArray.toArray(TYPE_ARRAY_SHORT);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Short\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_BYTE);
                    case SMALLINT:
                        return origArray.toArray(TYPE_ARRAY_SHORT);
                    case INT:
                        return origArray.toArray(TYPE_ARRAY_INTEGER);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Integer\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_SHORT);
                    case INT:
                        return origArray.toArray(TYPE_ARRAY_INTEGER);
                    case BIGINT:
                        return origArray.toArray(TYPE_ARRAY_LONG);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Long\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_INTEGER);
                    case BIGINT:
                        return origArray.toArray(TYPE_ARRAY_LONG);
                    case FLOAT:
                        return origArray.toArray(TYPE_ARRAY_FLOAT);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Float\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_LONG);
                    case FLOAT:
                        return origArray.toArray(TYPE_ARRAY_FLOAT);
                    case DOUBLE:
                        return origArray.toArray(TYPE_ARRAY_DOUBLE);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Double\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                        return origArray.toArray(TYPE_ARRAY_FLOAT);
                    case DOUBLE:
                        return origArray.toArray(TYPE_ARRAY_DOUBLE);
                    default:
                        String errorMsg = String.format("SeaTunnel array type not support this type [%s] now", fieldType.getSqlType());
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Boolean\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
        }
        if (childType.getCategory() == TypeDescription.Category.BOOLEAN) {
            return longList.toArray(TYPE_ARRAY_BOOLEAN);
        } else if (childType.getCategory() == TypeDescription.Category.INT) {
            return longList.toArray(TYPE_ARRAY_INTEGER);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Integer\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return longList.toArray(TYPE_ARRAY_BOOLEAN);
        } else if (childType.getCategory() == TypeDescription.Category.INT) {
            return longList.toArray(TYPE_ARRAY_INTEGER);
        } else if (childType.getCategory() == TypeDescription.Category.BYTE) {
            return longList.toArray(TYPE_ARRAY_BYTE);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Byte\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return longList.toArray(TYPE_ARRAY_INTEGER);
        } else if (childType.getCategory() == TypeDescription.Category.BYTE) {
            return longList.toArray(TYPE_ARRAY_BYTE);
        } else if (childType.getCategory() == TypeDescription.Category.SHORT) {
            return longList.toArray(TYPE_ARRAY_SHORT);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Short\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return longList.toArray(TYPE_ARRAY_BYTE);
        } else if (childType.getCategory() == TypeDescription.Category.SHORT) {
            return longList.toArray(TYPE_ARRAY_SHORT);
        } else {
            return longList.toArray(TYPE_ARRAY_LONG);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Long\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return longList.toArray(TYPE_ARRAY_SHORT);
        } else {
            return longList.toArray(TYPE_ARRAY_LONG);
        }
    }
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Float\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
        }
        if (colType.getCategory() == TypeDescription.Category.FLOAT) {
            return doubleList.toArray(TYPE_ARRAY_FLOAT);
        } else {
            return doubleList.toArray(TYPE_ARRAY_DOUBLE);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Double\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return doubleList.toArray(TYPE_ARRAY_FLOAT);
        } else {
            return doubleList.toArray(TYPE_ARRAY_DOUBLE);
        }
    }
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.math.BigDecimal\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            }
        }
        return decimalList.toArray(TYPE_ARRAY_BIG_DECIMAL);
    }

```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
        }
        if (childType.getCategory() == TypeDescription.Category.STRING) {
            return bytesValList.toArray(TYPE_ARRAY_STRING);
        } else {
            return bytesValList.toArray();
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.time.LocalDate\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
        }
        if (childType.getCategory() == TypeDescription.Category.DATE) {
            return timestampList.toArray(TYPE_ARRAY_LOCAL_DATE);
        } else {
            return timestampList.toArray(TYPE_ARRAY_LOCAL_DATETIME);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.time.LocalDateTime\[\]' found
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
            return timestampList.toArray(TYPE_ARRAY_LOCAL_DATE);
        } else {
            return timestampList.toArray(TYPE_ARRAY_LOCAL_DATETIME);
        }
    }
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Byte\[\]' found
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.BLOB:
                if (fileValue.getClass().equals(Object[].class)) {
                    fileValue = Arrays.stream((Object[]) fileValue).toArray(Byte[]::new);
                }
                statement = statement.setByteBuffer(index, ByteBuffer.wrap(ArrayUtils.toPrimitive((Byte[]) fileValue)));
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `EnvironmentFactory()` of an abstract class should not be declared 'public'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/config/EnvironmentFactory.java`
#### Snippet
```java
    private final Config config;

    public EnvironmentFactory(Config config) {
        this.config = config;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Flow()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/flow/Flow.java`
#### Snippet
```java
    protected final List<Flow> next;

    public Flow(List<Flow> next) {
        this.next = next;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CoordinatorTask()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/CoordinatorTask.java`
#### Snippet
```java
    private static final long serialVersionUID = -3957168748281681077L;

    public CoordinatorTask(long jobID, TaskLocation taskID) {
        super(jobID, taskID);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTask()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/AbstractTask.java`
#### Snippet
```java
    protected Progress progress;

    public AbstractTask(long jobID, TaskLocation taskLocation) {
        this.taskLocation = taskLocation;
        this.jobID = jobID;
```

### NonProtectedConstructorInAbstractClass
Constructor `ActionFlowLifeCycle()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ActionFlowLifeCycle.java`
#### Snippet
```java
    protected Action action;

    public ActionFlowLifeCycle(Action action, SeaTunnelTask runningTask, CompletableFuture<Void> completableFuture) {
        super(runningTask, completableFuture);
        this.action = action;
```

### NonProtectedConstructorInAbstractClass
Constructor `SeaTunnelTask()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    private TaskGroup taskBelongGroup;

    public SeaTunnelTask(long jobID, TaskLocation taskID, int indexID, Flow executionFlow) {
        super(jobID, taskID);
        this.indexID = indexID;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobAsyncOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/AbstractJobAsyncOperation.java`
#### Snippet
```java
    }

    public AbstractJobAsyncOperation(long jobId) {
        this.jobId = jobId;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobAsyncOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/AbstractJobAsyncOperation.java`
#### Snippet
```java
    protected long jobId;

    public AbstractJobAsyncOperation() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractResourceManager()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
    private volatile boolean isRunning = true;

    public AbstractResourceManager(NodeEngine nodeEngine) {
        this.registerWorker = nodeEngine.getHazelcastInstance().getMap(Constant.IMAP_RESOURCE_MANAGER_REGISTER_WORKER);
        this.nodeEngine = nodeEngine;
```

### NonProtectedConstructorInAbstractClass
Constructor `RowConverter()` of an abstract class should not be declared 'public'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/serialization/RowConverter.java`
#### Snippet
```java
    protected final SeaTunnelDataType<?> dataType;

    public RowConverter(SeaTunnelDataType<?> dataType) {
        this.dataType = dataType;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseSeaTunnelSourceFunction()` of an abstract class should not be declared 'public'
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
#### Snippet
```java
    private volatile boolean running = true;

    public BaseSeaTunnelSourceFunction(SeaTunnelSource<SeaTunnelRow, ?, ?> source) {
        this.source = source;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseSourceConfig()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/BaseSourceConfig.java`
#### Snippet
```java
    protected final Properties dbzProperties;

    public BaseSourceConfig(
        StartupConfig startupConfig,
        StopConfig stopConfig,
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcSourceConfig()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/JdbcSourceConfig.java`
#### Snippet
```java
    protected final int connectionPoolSize;

    public JdbcSourceConfig(
            StartupConfig startupConfig,
            StopConfig stopConfig,
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceSplitBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SourceSplitBase.java`
#### Snippet
```java
    protected final String splitId;

    public SourceSplitBase(String splitId) {
        this.splitId = splitId;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OffsetFactory()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/offset/OffsetFactory.java`
#### Snippet
```java

public abstract class OffsetFactory {
    public OffsetFactory() {}

    public abstract Offset earliest();
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceSplitStateBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/state/SourceSplitStateBase.java`
#### Snippet
```java
    protected final SourceSplitBase split;

    public SourceSplitStateBase(SourceSplitBase split) {
        this.split = split;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcSourceFetchTaskContext()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
    protected final SchemaNameAdjuster schemaNameAdjuster;

    public JdbcSourceFetchTaskContext(
        JdbcSourceConfig sourceConfig, JdbcDataSourceDialect dataSourceDialect) {
        this.sourceConfig = sourceConfig;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWriteStrategy()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
    protected Long checkpointId = 0L;

    public AbstractWriteStrategy(TextFileSinkConfig textFileSinkConfig) {
        this.textFileSinkConfig = textFileSinkConfig;
        this.sinkColumnsIndexInRow = textFileSinkConfig.getSinkColumnsIndexInRow();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcCatalog()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    }

    public AbstractJdbcCatalog(
        String catalogName,
        String username,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcCatalog()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    protected final String defaultUrl;

    public AbstractJdbcCatalog(
        String catalogName,
        String defaultDatabase,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcRowConverter()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
    public abstract String converterName();

    public AbstractJdbcRowConverter() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `BasePulsarConfig()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/config/BasePulsarConfig.java`
#### Snippet
```java
    private final String authParams;

    public BasePulsarConfig(String authPluginClassName, String authParams) {
        this.authPluginClassName = authPluginClassName;
        this.authParams = authParams;
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
    private boolean noMoreSplitsAssignment;

    public SourceReaderBase(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                            SplitFetcherManager<E, SplitT> splitFetcherManager,
                            RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### NonProtectedConstructorInAbstractClass
Constructor `SplitFetcherManager()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
    private volatile boolean closed;

    public SplitFetcherManager(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                               Supplier<SplitReader<E, SplitT>> splitReaderFactory) {
        this(elementsQueue, splitReaderFactory, ignore -> {});
```

### NonProtectedConstructorInAbstractClass
Constructor `SplitFetcherManager()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
    }

    public SplitFetcherManager(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                               Supplier<SplitReader<E, SplitT>> splitReaderFactory,
                               Consumer<Collection<String>> splitFinishedHook) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSplitEnumerator()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/AbstractSplitEnumerator.java`
#### Snippet
```java
    protected IcebergTableLoader icebergTableLoader;

    public AbstractSplitEnumerator(@NonNull SourceSplitEnumerator.Context<IcebergFileScanTaskSplit> context,
                                   @NonNull SourceConfig sourceConfig,
                                   @NonNull Map<Integer, List<IcebergFileScanTaskSplit>> pendingSplits) {
```

### NonProtectedConstructorInAbstractClass
Constructor `FlinkAbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/flink/FlinkAbstractPluginDiscovery.java`
#### Snippet
```java
public abstract class FlinkAbstractPluginDiscovery<T> extends AbstractPluginDiscovery<T> {

    public FlinkAbstractPluginDiscovery(String pluginSubDir) {
        super(pluginSubDir, (classLoader, url) -> {
            if (classLoader.getClass().getName().endsWith("SafetyNetWrapperClassLoader")) {
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
    extends SourceReaderBase<E, T, SplitT, SplitStateT> {

    public SingleThreadMultiplexSourceReaderBase(Supplier<SplitReader<E, SplitT>> splitReaderSupplier,
                                                 RecordEmitter<E, T, SplitStateT> recordEmitter,
                                                 SourceReaderOptions options,
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
    }

    public SingleThreadMultiplexSourceReaderBase(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                                                 SingleThreadFetcherManager<E, SplitT> splitFetcherManager,
                                                 RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
    }

    public SingleThreadMultiplexSourceReaderBase(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                                                 Supplier<SplitReader<E, SplitT>> splitReaderSupplier,
                                                 RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    }

    public AbstractPluginDiscovery(Path pluginDir,
                                   Config pluginConfig) {
        this(pluginDir, pluginConfig, DEFAULT_URL_TO_CLASSLOADER);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    }

    public AbstractPluginDiscovery(Path pluginDir,
                                   Config pluginConfig,
                                   BiConsumer<ClassLoader, URL> addURLToClassLoaderConsumer) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    }

    public AbstractPluginDiscovery(String pluginSubDir) {
        this(Common.connectorJarDir(pluginSubDir), loadConnectorPluginConfig());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    }

    public AbstractPluginDiscovery(Path pluginDir) {
        this(pluginDir, loadConnectorPluginConfig());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        new ConcurrentHashMap<>(Common.COLLECTION_SIZE);

    public AbstractPluginDiscovery(String pluginSubDir, BiConsumer<ClassLoader, URL> addURLToClassloader) {
        this(Common.connectorJarDir(pluginSubDir), loadConnectorPluginConfig(), addURLToClassloader);
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `keys`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
            Map<String, Object> rawMap = (Map<String, Object>) rawValue;
            if (!nestedMap) {
                keys = new ArrayList<>();
                newMap = new HashMap<>(rawMap.size());
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `newMap`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
            if (!nestedMap) {
                keys = new ArrayList<>();
                newMap = new HashMap<>(rawMap.size());
            }
            for (Map.Entry<String, Object> entry : rawMap.entrySet()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `rawValue`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> T convertValue(Object rawValue, TypeReference<T> typeReference) {
        rawValue = flatteningMapWithObject(rawValue);
        if (typeReference.getType() instanceof Class) {
            // simple type
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java
            paths.addAll(validJars);

            config = config.withValue(path,
                ConfigValueFactory.fromAnyRef(paths.stream().map(URL::toString).distinct().collect(Collectors.joining(";"))));

```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        } else {
            config = config.withValue(path,
                ConfigValueFactory.fromAnyRef(validJars.stream().map(URL::toString).distinct().collect(Collectors.joining(";"))));
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

    private Config registerPlugin(Config config, List<URL> jars) {
        config = this.injectJarsToConfig(config, ConfigUtil.joinPath("env", "pipeline", "jars"), jars);
        return this.injectJarsToConfig(config, ConfigUtil.joinPath("env", "pipeline", "classpaths"), jars);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/ReflectionUtils.java`
#### Snippet
```java
        Optional<Method> method = Optional.empty();
        Method m;
        for (; clazz != null; clazz = clazz.getSuperclass()) {
            try {
                m = clazz.getDeclaredMethod(methodName, parameterTypes);
```

### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/YamlSeaTunnelConfigBuilder.java`
#### Snippet
```java
    public YamlSeaTunnelConfigBuilder setProperties(Properties properties) {
        if (properties == null) {
            properties = System.getProperties();
        }
        setPropertiesInternal(properties);
```

### AssignmentToMethodParameter
Assignment to method parameter `locator`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/YamlSeaTunnelConfigBuilder.java`
#### Snippet
```java
    public YamlSeaTunnelConfigBuilder(YamlSeaTunnelConfigLocator locator) {
        if (locator == null) {
            locator = new YamlSeaTunnelConfigLocator();
            locator.locateEverywhere();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/ExceptionUtil.java`
#### Snippet
```java
    @NonNull
    private static RuntimeException peeledAndUnchecked(@NonNull Throwable t) {
        t = peel(t);

        if (t instanceof RuntimeException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/ExceptionUtil.java`
#### Snippet
```java
            && t.getCause() != t
        ) {
            t = t.getCause();
        }
        return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `pipeline`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
        for (int i = 0; i < targetVertices.size(); i++) {
            if (i > 0) {
                pipeline = recreatePipeline(pipeline);
            }
            splitUnionVertex(pipelines, pipeline, targetVertices.get(i));
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
     */
    private PipelineState readPipelineState(String fileName, String jobId) throws CheckpointStorageException {
        fileName = getStorageParentDirectory() + jobId + DEFAULT_CHECKPOINT_FILE_PATH_SPLIT + fileName;
        try (FSDataInputStream in = fs.open(new Path(fileName))) {
            byte[] datas = new byte[in.available()];
```

### AssignmentToMethodParameter
Assignment to method parameter `loop`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
        }
        synchronized (iterator.next().getCheckpointLock()) {
            internalCheckpoint(iterator, ++loop);
            if (loop != this.parallelism) {
                // Avoid backtracking calls
```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        try {
            if (user == null || user.length() == 0) {
                user = System.getProperty("user.name");
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `password`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java

            if (password == null) {
                password = "";
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
        if (TEXT_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            Map<String, String> parameters = tableInformation.getSd().getSerdeInfo().getParameters();
            pluginConfig = pluginConfig.withValue(FILE_FORMAT.key(), ConfigValueFactory.fromAnyRef(FileFormat.TEXT.toString()))
                .withValue(FIELD_DELIMITER.key(), ConfigValueFactory.fromAnyRef(parameters.get("field.delim")))
                .withValue(ROW_DELIMITER.key(), ConfigValueFactory.fromAnyRef(parameters.get("line.delim")));
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
                .withValue(ROW_DELIMITER.key(), ConfigValueFactory.fromAnyRef(parameters.get("line.delim")));
        } else if (PARQUET_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            pluginConfig = pluginConfig.withValue(FILE_FORMAT.key(), ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            pluginConfig = pluginConfig.withValue(FILE_FORMAT.key(), ConfigValueFactory.fromAnyRef(FileFormat.ORC.toString()));
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
            pluginConfig = pluginConfig.withValue(FILE_FORMAT.key(), ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            pluginConfig = pluginConfig.withValue(FILE_FORMAT.key(), ConfigValueFactory.fromAnyRef(FileFormat.ORC.toString()));
        } else {
            throw new HiveConnectorException(CommonErrorCode.ILLEGAL_ARGUMENT,
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
                    "Hive connector only support [text parquet orc] table now");
        }
        pluginConfig = pluginConfig
                .withValue(IS_PARTITION_FIELD_WRITE_IN_FILE.key(), ConfigValueFactory.fromAnyRef(false))
                .withValue(FILE_NAME_EXPRESSION.key(), ConfigValueFactory.fromAnyRef("${transactionId}"))
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
            URI uri = new URI(hdfsLocation);
            String path = uri.getPath();
            pluginConfig = pluginConfig.withValue(FILE_PATH.key(), ConfigValueFactory.fromAnyRef(path));
            hadoopConf = new HadoopConf(hdfsLocation.replace(path, ""));
        } catch (URISyntaxException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
        String inputFormat = tableInformation.getSd().getInputFormat();
        if (TEXT_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig = pluginConfig.withValue(BaseSourceConfig.FILE_TYPE.key(),
                    ConfigValueFactory.fromAnyRef(FileFormat.TEXT.toString()));
        } else if (PARQUET_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
                    ConfigValueFactory.fromAnyRef(FileFormat.TEXT.toString()));
        } else if (PARQUET_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig = pluginConfig.withValue(BaseSourceConfig.FILE_TYPE.key(),
                    ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
                    ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig = pluginConfig.withValue(BaseSourceConfig.FILE_TYPE.key(),
                    ConfigValueFactory.fromAnyRef(FileFormat.ORC.toString()));
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
            String path = uri.getPath();
            String defaultFs = hdfsLocation.replace(path, "");
            pluginConfig = pluginConfig.withValue(BaseSourceConfig.FILE_PATH.key(), ConfigValueFactory.fromAnyRef(path))
                .withValue(FS_DEFAULT_NAME_KEY, ConfigValueFactory.fromAnyRef(defaultFs));
        } catch (URISyntaxException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `defaultUrl`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
        checkArgument(StringUtils.isNotBlank(defaultUrl));

        defaultUrl = defaultUrl.trim();
        validateJdbcUrlWithDatabase(defaultUrl);
        this.catalogName = catalogName;
```

### AssignmentToMethodParameter
Assignment to method parameter `baseUrl`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
        checkArgument(StringUtils.isNotBlank(baseUrl));

        baseUrl = baseUrl.trim();
        validateJdbcUrlWithoutDatabase(baseUrl);
        this.catalogName = catalogName;
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/SemanticXidGenerator.java`
#### Snippet
```java
        for (int i = dstOffset; i < dstOffset + numBytes; i++) {
            dst[i] = (byte) number;
            number >>>= Byte.SIZE;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `batchSize`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/split/JdbcNumericBetweenParametersProvider.java`
#### Snippet
```java
        long maxElemCount = (maxVal - minVal) + 1;
        if (batchSize > maxElemCount) {
            batchSize = maxElemCount;
        }
        this.batchSize = batchSize;
```

### AssignmentToMethodParameter
Assignment to method parameter `batchNum`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/split/JdbcNumericBetweenParametersProvider.java`
#### Snippet
```java
        long maxElemCount = (maxVal - minVal) + 1;
        if (batchNum > maxElemCount) {
            batchNum = (int) maxElemCount;
        }
        this.batchNum = batchNum;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
        String valueGenericType = "";
        // convert type to uppercase
        type = type.toUpperCase();
        String originContent = type;
        if (type.contains("{") || type.contains("}")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
        if (type.contains("{") || type.contains("}")) {
            // Row type
            type = SqlType.ROW.name();
        }
        if (type.contains("<") || type.contains(">")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
                keyGenericType = genericTypes[0];
                valueGenericType = genericTypes[1];
                type = SqlType.MAP.name();
            } else if (type.startsWith(SqlType.ARRAY.name())) {
                genericType = parseArrayGeneric(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
            } else if (type.startsWith(SqlType.ARRAY.name())) {
                genericType = parseArrayGeneric(type);
                type = SqlType.ARRAY.name();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/schema/SeaTunnelSchema.java`
#### Snippet
```java
            precision = results[0];
            scale = results[1];
            type = SqlType.DECIMAL.name();
        }
        SqlType sqlType;
```

### AssignmentToMethodParameter
Assignment to method parameter `retryNums`
in `seatunnel-connectors-v2/connector-datahub/src/main/java/org/apache/seatunnel/connectors/seatunnel/datahub/sink/DataHubWriter.java`
#### Snippet
```java
        boolean success = false;
        while (retryNums != 0) {
            retryNums = retryNums - 1;
            PutRecordsResult recordsResult = dataHubClient.putRecords(project, topic, records);
            if (recordsResult.getFailedRecordCount() > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
    public HttpResponse doDelete(String url, Map<String, String> params) throws Exception {
        if (params == null) {
            params = new HashMap<>(INITIAL_CAPACITY);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `method`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
    public HttpResponse execute(String url, String method, Map<String, String> headers, Map<String, String> params, String body) throws Exception {
        // convert method option to uppercase
        method = method.toUpperCase(Locale.ROOT);
        if (HttpPost.METHOD_NAME.equals(method)) {
            return doPost(url, headers, params, body);
```

### AssignmentToMethodParameter
Assignment to method parameter `boundStatement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/sink/CassandraSinkWriter.java`
#### Snippet
```java
                DataType dataType = tableSchema.get(i).getType();
                Object fieldValue = row.getField(seaTunnelRowType.indexOf(fieldName));
                boundStatement = TypeConvertUtil.reconvertAndInject(boundStatement, i, dataType, fieldValue);
            }
            if (cassandraConfig.getAsyncWrite()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.VARCHAR:
            case ProtocolConstants.DataType.ASCII:
                statement = statement.setString(index, (String) fileValue);
                return statement;
            case ProtocolConstants.DataType.VARINT:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.VARINT:
                statement = statement.setBigInteger(index, new BigInteger((String) fileValue));
                return statement;
            case ProtocolConstants.DataType.UUID:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.UUID:
            case ProtocolConstants.DataType.TIMEUUID:
                statement = statement.setUuid(index, UUID.fromString((String) fileValue));
                return statement;
            case ProtocolConstants.DataType.INET:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.INET:
                try {
                    statement = statement.setInetAddress(index, InetAddress.getByName((String) fileValue));
                } catch (UnknownHostException e) {
                    throw new CassandraConnectorException(CassandraConnectorErrorCode.PARSE_IP_ADDRESS_FAILED, e);
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.TINYINT:
                statement = statement.setByte(index, (Byte) fileValue);
                return statement;
            case ProtocolConstants.DataType.SMALLINT:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.SMALLINT:
                statement = statement.setShort(index, (Short) fileValue);
                return statement;
            case ProtocolConstants.DataType.INT:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.INT:
                statement = statement.setInt(index, (Integer) fileValue);
                return statement;
            case ProtocolConstants.DataType.BIGINT:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.BIGINT:
            case ProtocolConstants.DataType.COUNTER:
                statement = statement.setLong(index, (Long) fileValue);
                return statement;
            case ProtocolConstants.DataType.FLOAT:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.FLOAT:
                statement = statement.setFloat(index, (Float) fileValue);
                return statement;
            case ProtocolConstants.DataType.DOUBLE:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.DOUBLE:
                statement = statement.setDouble(index, (Double) fileValue);
                return statement;
            case ProtocolConstants.DataType.DECIMAL:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.DECIMAL:
                statement = statement.setBigDecimal(index, BigDecimal.valueOf((Double) fileValue));
                return statement;
            case ProtocolConstants.DataType.BOOLEAN:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.BOOLEAN:
                statement = statement.setBoolean(index, (Boolean) fileValue);
                return statement;
            case ProtocolConstants.DataType.TIME:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.TIME:
                statement = statement.setLocalTime(index, (LocalTime) fileValue);
                return statement;
            case ProtocolConstants.DataType.DATE:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.DATE:
                statement = statement.setLocalDate(index, (LocalDate) fileValue);
                return statement;
            case ProtocolConstants.DataType.TIMESTAMP:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.TIMESTAMP:
                statement = statement.setInstant(index, ((LocalDateTime) fileValue).atZone(ZoneId.systemDefault()).toInstant());
                return statement;
            case ProtocolConstants.DataType.BLOB:
```

### AssignmentToMethodParameter
Assignment to method parameter `fileValue`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
            case ProtocolConstants.DataType.BLOB:
                if (fileValue.getClass().equals(Object[].class)) {
                    fileValue = Arrays.stream((Object[]) fileValue).toArray(Byte[]::new);
                }
                statement = statement.setByteBuffer(index, ByteBuffer.wrap(ArrayUtils.toPrimitive((Byte[]) fileValue)));
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                    fileValue = Arrays.stream((Object[]) fileValue).toArray(Byte[]::new);
                }
                statement = statement.setByteBuffer(index, ByteBuffer.wrap(ArrayUtils.toPrimitive((Byte[]) fileValue)));
                return statement;
            case ProtocolConstants.DataType.MAP:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.MAP:
                statement = statement.set(index, (Map<?, ?>) fileValue, Map.class);
                return statement;
            case ProtocolConstants.DataType.LIST:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.LIST:
                statement = statement.set(index, Arrays.stream((Object[]) fileValue).collect(Collectors.toList()), List.class);
                return statement;
            case ProtocolConstants.DataType.SET:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.SET:
                statement = statement.set(index, Arrays.stream((Object[]) fileValue).collect(Collectors.toSet()), Set.class);
                return statement;
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            default:
                statement = statement.set(index, fileValue, Object.class);
                return statement;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java
                .build();

        config = config.withFallback(ConfigFactory.parseMap(defaultConfig));

        List<ClickHouseNode> nodes;
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSink.java`
#### Snippet
```java
                .build();

        config = config.withFallback(ConfigFactory.parseMap(defaultConfigs));
        List<ClickHouseNode> nodes = ClickhouseUtil.createNodes(config.getString(HOST.key()),
                config.getString(DATABASE.key()), config.getString(USERNAME.key()), config.getString(PASSWORD.key()));
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/type/IndexTypeSerializerFactory.java`
#### Snippet
```java
        if (elasticsearchVersion == ES2 || elasticsearchVersion == ES5) {
            if (type == null || "".equals(type)) {
                type = DEFAULT_TYPE;
            }
            return new RequiredIndexTypeSerializer(type);
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        if (!transactionalId.equals(this.transactionalId)) {
            Object transactionManager = getTransactionManager();
            synchronized (transactionManager) {
                ReflectionUtils.setField(transactionManager, "transactionalId", transactionalId);
                ReflectionUtils.setField(transactionManager, "currentState",
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

        Object transactionManager = getTransactionManager();
        synchronized (transactionManager) {
            Object topicPartitionBookkeeper =
                    ReflectionUtils.getField(transactionManager, transactionManager.getClass(),
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/serialization/DefaultSerializer.java`
#### Snippet
```java
            return SerializationUtils.serialize((Serializable) obj);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
    static Object flatteningMap(Object rawValue, Map<String, Object> newMap, List<String> keys, boolean nestedMap) {
        if (rawValue == null) {
            return null;
        }
        if (!(rawValue instanceof List) && !(rawValue instanceof Map)) {
```

### ReturnNull
Return of `null`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java
        }
        // the sink is the last stream
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java
        }
        // the sink is the last stream
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/SerializationUtils.java`
#### Snippet
```java
            return Base64.encodeBase64String(serialize(obj));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/SerializationUtils.java`
#### Snippet
```java
            return deserialize(Base64.decodeBase64(str));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/RetryUtils.java`
#### Snippet
```java
            throw new RuntimeException("Execute given execution failed after retry " + retryTimes + " times", lastException);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T parseObject(String json, TypeReference<T> type) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/JsonUtils.java`
#### Snippet
```java

        if (node == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/JsonUtils.java`
#### Snippet
```java
    public static <T> T parseObject(String json, Class<T> clazz) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelHazelcastClient.java`
#### Snippet
```java
        } catch (InterruptedException i) {
            Thread.currentThread().interrupt();
            return null;
        } catch (Throwable t) {
            throw ExceptionUtil.rethrow(t);
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
            return future;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/sink/SinkRegisterOperation.java`
#### Snippet
```java
            SinkAggregatedCommitterTask<?, ?> task = server.getTaskExecutionService().getTask(committerTaskID);
            task.receivedWriterRegister(writerTaskID, readerAddress);
            return null;
        }, new RetryUtils.RetryMaterial(RETRY_NUMBER, true, e -> true, RETRY_INTERVAL));
    }
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/RequestSplitOperation.java`
#### Snippet
```java
            SourceSplitEnumeratorTask<?> task = server.getTaskExecutionService().getTask(enumeratorTaskID);
            task.requestSplit(taskID.getTaskID());
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/checkpoint/BarrierFlowOperation.java`
#### Snippet
```java
                sneakyThrow(e);
            }
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/AssignSplitOperation.java`
#### Snippet
```java
            Object[] o = SerializationUtils.deserialize(splits, classLoader);
            task.receivedSourceSplit(Arrays.stream(o).map(i -> (SplitT) i).collect(Collectors.toList()));
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceRegisterOperation.java`
#### Snippet
```java
                server.getTaskExecutionService().getTask(enumeratorTaskID);
            task.receivedReader(readerTaskID, readerAddress);
            return null;
        }, new RetryUtils.RetryMaterial(RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/RestoredSplitOperation.java`
#### Snippet
```java
            SourceSplitEnumeratorTask<SourceSplit> task = taskExecutionService.getTask(taskLocation);
            task.addSplitsBack(deserialize, subtaskIndex);
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceNoMoreElementOperation.java`
#### Snippet
```java
                server.getTaskExecutionService().getTask(enumeratorTaskID);
            task.readerFinished(currentTaskID.getTaskID());
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/checkpoint/CloseRequestOperation.java`
#### Snippet
```java
            SourceSeaTunnelTask<?, ?> task = server.getTaskExecutionService().getTask(readerLocation);
            task.close();
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java
    @Override
    public String getDistributedObjectName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java
    @Override
    public Permission getRequiredPermission() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private SlotProfile selectBestMatchSlot(ResourceProfile profile) {
        if (unassignedSlots.isEmpty() && !config.isDynamicSlot()) {
            return null;
        }
        if (config.isDynamicSlot()) {
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
            return result.orElse(null);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                        runningJobStateTimestampsIMap);
                } else {
                    return null;
                }
            }).filter(Objects::nonNull).collect(Collectors.toList());
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/NotifyTaskStartOperation.java`
#### Snippet
```java
                .getTaskGroup().getTask(taskLocation.getTaskID());
            task.startCall();
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/CheckpointBarrierTriggerOperation.java`
#### Snippet
```java
                sneakyThrow(e);
            }
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/CheckpointFinishedOperation.java`
#### Snippet
```java
                sneakyThrow(e);
            }
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/persistence/FileMapStore.java`
#### Snippet
```java
    @Override
    public String load(Object key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/persistence/FileMapStore.java`
#### Snippet
```java
    @Override
    public Iterable<Object> loadAllKeys() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/persistence/FileMapStore.java`
#### Snippet
```java
    @Override
    public Map<Object, Object> loadAll(Collection<Object> keys) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/NotifyTaskRestoreOperation.java`
#### Snippet
```java
                sneakyThrow(e);
            }
            return null;
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof NullPointerException &&
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/thirdparty/yarn/YarnResourceManager.java`
#### Snippet
```java
    @Override
    public CompletableFuture<CreateWorkerResult> createNewWorker(ResourceProfile resourceProfile) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/thirdparty/yarn/YarnResourceManager.java`
#### Snippet
```java
    @Override
    public CompletableFuture<Void> releaseWorker(String workerID) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/thirdparty/kubernetes/KubernetesResourceManager.java`
#### Snippet
```java
    @Override
    public CompletableFuture<Void> releaseWorker(String workerID) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/thirdparty/kubernetes/KubernetesResourceManager.java`
#### Snippet
```java
    @Override
    public CompletableFuture<CreateWorkerResult> createNewWorker(ResourceProfile resourceProfile) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            if (!pipeline.updatePipelineState(PipelineStatus.CREATED, PipelineStatus.SCHEDULED)) {
                handlePipelineStateTurnError(pipeline, PipelineStatus.SCHEDULED);
                return null;
            }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        } catch (Exception e) {
            pipeline.cancelPipeline();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                ExecutionState.CANCELED.equals(task.getExecutionState())) {
                log.info("{} be canceled, skip {} this task.", task.getTaskFullName(), ExecutionState.SCHEDULED);
                return null;
            } else {
                makeTaskFailed(task.getTaskGroupLocation(),
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                    new JobException(String.format("%s turn to a unexpected state: %s, stop scheduler job.",
                        task.getTaskFullName(), task.getExecutionState())));
                return null;
            }
        } catch (Throwable e) {
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        } catch (Throwable e) {
            makeTaskFailed(task.getTaskGroupLocation(), e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            ExecutionState.CANCELED.equals(task.getExecutionState())) {
            log.info("{} be canceled, skip {} this task.", task.getTaskFullName(), ExecutionState.DEPLOYING);
            return null;
        } else {
            jobMaster.updateTaskExecutionState(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                    new JobException(String.format("%s turn to a unexpected state: %s, stop scheduler job.",
                        task.getTaskFullName(), task.getExecutionState()))));
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/common/ProtoStuffSerializer.java`
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
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    private SeaTunnelRow convertJsonNode(JsonNode jsonNode) throws IOException {
        if (jsonNode == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
        } catch (Throwable t) {
            if (ignoreParseErrors) {
                return null;
            }
            throw new IOException(
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    public SeaTunnelRow deserialize(byte[] message) throws IOException {
        if (message == null) {
            return null;
        }
        return convertJsonNode(convertBytes(message));
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
        } catch (Throwable t) {
            if (ignoreParseErrors) {
                return null;
            }
            throw new IOException(
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
    private Object convert(String field, SeaTunnelDataType<?> fieldType) {
        if (StringUtils.isBlank(field)) {
            return null;
        }
        switch (fieldType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                return new BigDecimal(field);
            case NULL:
                return null;
            case BYTES:
                return field.getBytes();
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                    @Override
                    public JsonNode convert(ObjectMapper mapper, JsonNode reuse, Object value) {
                        return null;
                    }
                };
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                    @Override
                    public Object convert(JsonNode jsonNode) {
                        return null;
                    }
                };
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
            public Object convert(JsonNode jsonNode) {
                if (jsonNode == null || jsonNode.isNull() || jsonNode.isMissingNode()) {
                    return null;
                }
                try {
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                        throw t;
                    }
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                throw new JsonParseException("Could not find field with name '" + fieldName + "'.");
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
    private static Object reconvert(Object field, SeaTunnelDataType<?> dataType) {
        if (field == null) {
            return null;
        }
        SqlType sqlType = dataType.getSqlType();
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
    private static Object convert(Object field, SeaTunnelDataType<?> dataType) {
        if (field == null) {
            return null;
        }
        SqlType sqlType = dataType.getSqlType();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/StartupConfig.java`
#### Snippet
```java
                return offsetFactory.latest();
            case INITIAL:
                return null;
            case TIMESTAMP:
                return offsetFactory.timestamp(timestamp);
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static Object reconvert(Object field, SeaTunnelDataType<?> dataType) {
        if (field == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static Object convert(Object field, SeaTunnelDataType<?> dataType) {
        if (field == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        Path hdfsPath = getCheckpointPathWithId(checkpointId);
        if (!fileSystem.exists(hdfsPath)) {
            return null;
        }
        try (FSDataInputStream inputStream = fileSystem.open(hdfsPath);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/utils/SourceRecordUtils.java`
#### Snippet
```java
        Struct value = (Struct) record.value();
        if (schema.field(Envelope.FieldName.TIMESTAMP) == null) {
            return null;
        }
        return value.getInt64(Envelope.FieldName.TIMESTAMP);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/utils/SourceRecordUtils.java`
#### Snippet
```java
            return source.getString(SCHEMA_NAME_KEY);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/utils/SourceRecordUtils.java`
#### Snippet
```java
        Struct value = (Struct) record.value();
        if (schema.field(Envelope.FieldName.SOURCE) == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/utils/SourceRecordUtils.java`
#### Snippet
```java
        Struct source = value.getStruct(Envelope.FieldName.SOURCE);
        if (source.schema().field(Envelope.FieldName.TIMESTAMP) == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/ChangeEventRecords.java`
#### Snippet
```java
                return recordsForSplit.next();
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceRecordEmitter.java`
#### Snippet
```java
        @Override
        public Object getCheckpointLock() {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/IncrementalSourceScanFetcher.java`
#### Snippet
```java
        // the data has been polled, no more data
        reachEnd.compareAndSet(false, true);
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
    @Override
    public TableId getTableId(SourceRecord record) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java

    public SchemaNameAdjuster getSchemaNameAdjuster() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
    public static LocalTime toLocalTime(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof LocalTime) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
    public static LocalDate toLocalDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof LocalDate) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
    public static LocalDateTime toLocalDateTime(Object obj, ZoneId serverTimeZone) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof OffsetDateTime) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/config/ServerIdRange.java`
#### Snippet
```java
    public static ServerIdRange from(String range) {
        if (range == null) {
            return null;
        }
        if (range.contains("-")) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializationConverters.java`
#### Snippet
```java
        throws Exception {
        if (fieldValue == null) {
            return null;
        } else {
            return fieldConverter.convert(fieldValue, fieldSchema);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializationConverters.java`
#### Snippet
```java
                    @Override
                    public Object convert(Object dbzObj, Schema schema) throws Exception {
                        return null;
                    }
                };
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializationConverters.java`
#### Snippet
```java
            public Object convert(Object dbzObj, Schema schema) throws Exception {
                if (dbzObj == null) {
                    return null;
                }
                return converter.convert(dbzObj, schema);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            DataCollectionId source, OffsetContext offset, Object key, Struct value) {
            if (value == null) {
                return null;
            }
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
            if (source == null) {
                return null;
            }
            final Long timestamp = sourceInfo.getInt64(AbstractSourceInfo.TIMESTAMP_KEY);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            }
            final Long timestamp = sourceInfo.getInt64(AbstractSourceInfo.TIMESTAMP_KEY);
            return timestamp == null ? null : Instant.ofEpochMilli(timestamp);
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            DataCollectionId source, OffsetContext offset, Object key, Struct value) {
            if (value == null) {
                return null;
            }
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
            if (source == null) {
                return null;
            }
            return Collect.hashMapOf(
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        }
        if (ObjectUtils.compare(chunkEnd, max) >= 0) {
            return null;
        } else {
            return chunkEnd;
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeDataGenerator.java`
#### Snippet
```java
                        RandomStringUtils.randomNumeric(decimalType.getScale()));
            case NULL:
                return null;
            case BYTES:
                return RandomStringUtils.randomAlphabetic(fakeConfig.getBytesLength()).getBytes();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
            // then
            // read it again to get correct scale
            return rs.getObject(fieldNo) == null ? null : rs.getInt(fieldNo);
        }
        // DBZ-2673
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        Blob b = rs.getBlob(fieldNo);
        if (b == null) {
            return null; // Don't continue parsing date field if it is null
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        Blob b = rs.getBlob(fieldNo);
        if (b == null) {
            return null; // Don't continue parsing timestamp field if it is null
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
                new String(b.getBytes(1, (int) (b.length())), "UTF-8"),
                column,
                table) ? null
                : rs.getTimestamp(fieldNo, Calendar.getInstance());
        } catch (UnsupportedEncodingException e) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotSplitReadTask.java`
#### Snippet
```java
        Blob b = rs.getBlob(fieldNo);
        if (b == null) {
            return null; // Don't continue parsing time field if it is null
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
    public FileAggregatedCommitInfo combine(List<FileCommitInfo> commitInfos) {
        if (commitInfos == null || commitInfos.size() == 0) {
            return null;
        }
        Map<String, Map<String, String>> aggregateCommitInfo = new HashMap<>();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/FileFormat.java`
#### Snippet
```java

    public WriteStrategy getWriteStrategy(TextFileSinkConfig textFileSinkConfig) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/FileFormat.java`
#### Snippet
```java

    public ReadStrategy getReadStrategy() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
    private Object resolveObject(Object data, SeaTunnelDataType<?> seaTunnelDataType) {
        if (data == null) {
            return null;
        }
        switch (seaTunnelDataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
    private Object resolveObject(Object field, SeaTunnelDataType<?> fieldType) {
        if (field == null) {
            return null;
        }
        switch (fieldType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                return Short.parseShort(field.toString());
            case NULL:
                return null;
            case BYTES:
                ByteBuffer buffer = (ByteBuffer) field;
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            return homeDir;
        } catch (Exception ioe) {
            return null;
        } finally {
            try {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                disconnect(channel);
            } catch (IOException ioe) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/util/HudiUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplitEnumerator.java`
#### Snippet
```java
    @Override
    public JdbcSourceState snapshotState(long checkpointId) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcInputFormat.java`
#### Snippet
```java
        try {
            if (!hasNext) {
                return null;
            }
            SeaTunnelRow seaTunnelRow = jdbcRowConverter.toInternal(resultSet, typeInfo);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/psql/PostgresJdbcRowConverter.java`
#### Snippet
```java
    @Override
    public String converterName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceReader.java`
#### Snippet
```java
    @Override
    public List<KuduSourceSplit> snapshotState(long checkpointId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceSplitEnumerator.java`
#### Snippet
```java
    @Override
    public KuduSourceState snapshotState(long checkpointId) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                                  Object value) {
        if (value == null) {
            return null;
        }
        switch (tsDataType) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java

    public DefaultSeaTunnelRowSerializer(String topic, SeaTunnelRowType seaTunnelRowType) {
        this(topic, element -> null, createSerializationSchema(seaTunnelRowType));
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/sink/Neo4jSinkWriter.java`
#### Snippet
```java
        session.writeTransaction(tx -> {
            tx.run(query);
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/source/Neo4jSourceReader.java`
#### Snippet
```java
                return value.asDouble();
            case NULL:
                return null;
            case BYTES:
                return value.asByteArray();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/source/Neo4jSourceReader.java`
#### Snippet
```java
                    output.collect(new SeaTunnelRow(fields));
                });
            return null;
        });
        this.context.signalNoMoreElement();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
                () -> {
                    runnable.run();
                    return null;
                },
                e -> {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/AbstractSingleSplitReader.java`
#### Snippet
```java
    protected byte[] snapshotStateToBytes(long checkpointId) throws Exception {
        // default nothing
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordsBySplits.java`
#### Snippet
```java
            return next.getKey();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordsBySplits.java`
#### Snippet
```java
            throw new IllegalStateException();
        }
        return recordsInCurrentSplit.hasNext() ? recordsInCurrentSplit.next() : null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SingleThreadFetcherManager.java`
#### Snippet
```java

    protected SplitFetcher<E, SplitT> getRunningFetcher() {
        return fetchers.isEmpty() ? null : fetchers.values().iterator().next();
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
        if (recordsWithSplitId == null || !moveToNextSplit(recordsWithSplitId, output)) {
            log.info("Current fetch is finished.");
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-console/src/main/java/org/apache/seatunnel/connectors/seatunnel/console/sink/ConsoleSinkWriter.java`
#### Snippet
```java
    private String fieldToString(SeaTunnelDataType<?> type, Object value) {
        if (value == null) {
            return null;
        }
        switch (type.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                           @NonNull SeaTunnelDataType<?> seaTunnelType) {
        if (icebergValue == null) {
            return null;
        }
        switch (icebergType.typeId()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/data/DefaultSerializer.java`
#### Snippet
```java
    private static Object convert(SeaTunnelDataType<?> fieldType, Object fieldValue) {
        if (fieldValue == null) {
            return null;
        }
        switch (fieldType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSplitEnumerator.java`
#### Snippet
```java
    @Override
    public Object snapshotState(long checkpointId) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksBaseSerializer.java`
#### Snippet
```java
    protected String convert(SeaTunnelDataType dataType, Object val) {
        if (val == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
                if (null == respEntity) {
                    log.warn("Request failed with empty response.");
                    return null;
                }
                return JsonUtils.parseObject(EntityUtils.toString(respEntity), Map.class);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
        if (HttpStatus.SC_OK != code) {
            log.warn("Request failed with code:{}", code);
            return null;
        }
        HttpEntity respEntity = resp.getEntity();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
        if (null == respEntity) {
            log.warn("Request failed with empty response.");
            return null;
        }
        return respEntity;
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
                if (null == respEntity) {
                    log.warn("Request failed with empty response.");
                    return null;
                }
                return JsonUtils.parseObject(EntityUtils.toString(respEntity), Map.class);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
                if (null == respEntity) {
                    log.warn("Request failed with empty response.");
                    return null;
                }
                return EntityUtils.toString(respEntity);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceSplit.java`
#### Snippet
```java
    @Override
    public String splitId() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceReader.java`
#### Snippet
```java
    @Override
    public List<ClickhouseSourceSplit> snapshotState(long checkpointId) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
    private PrimaryKeyColumn convertPrimaryKeyColumn(String columnName, Object value, PrimaryKeyType primaryKeyType) {
        if (value == null) {
            return null;
        }
        switch (primaryKeyType) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
    private Column convertColumn(String columnName, Object value, ColumnType columnType) {
        if (value == null) {
            return null;
        }
        switch (columnType) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceSplitEnumerator.java`
#### Snippet
```java
    @Override
    public ClickhouseSourceState snapshotState(long checkpointId) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
                    return bulkResponse;
                }
                return null;
            }, retryMaterial);
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/source/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java
            return Base64.getDecoder().decode(fieldValue);
        } else if (VOID_TYPE.equals(fieldType) || fieldType == null) {
            return null;
        } else {
            throw new UnsupportedOperationException("Unexpected value: " + fieldType);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/ReplaceTransform.java`
#### Snippet
```java
        Object inputFieldValue = inputRow.getField(inputFieldIndex);
        if (inputFieldValue == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
    private Object clone(SeaTunnelDataType dataType, Object value) {
        if (value == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                byte[] bytes = (byte[]) value;
                if (bytes == null) {
                    return null;
                }
                byte[] newBytes = new byte[bytes.length];
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                Object[] array = (Object[]) value;
                if (array == null) {
                    return null;
                }
                Object newArray = Array.newInstance(arrayType.getElementType().getTypeClass(), array.length);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                SeaTunnelRow row = (SeaTunnelRow) value;
                if (row == null) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                return newRow;
            case NULL:
                return null;
            default:
                throw new UnsupportedOperationException("Unsupported type: " + dataType.getSqlType());
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java
    private Object convert(SeaTunnelDataType<?> seaTunnelDataType, AttributeValue attributeValue) {
        if (attributeValue.type().equals(AttributeValue.Type.NUL)) {
            return null;
        }
        switch (seaTunnelDataType.getSqlType()) {
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                isCancel.set(true);
                if (e == null) {
                    e = new IllegalStateException("cancellationFuture should be completed exceptionally");
                }
                exception(e);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `count`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java

    public void ack(Barrier barrier) {
        Integer ackSize = cycleAcks.compute(barrier.getId(), (id, count) -> count == null ? 1 : ++count);
        if (ackSize == allCycles.size()) {
            if (barrier.prepareClose()) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `num`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java
    @Override
    public void triggerBarrier(Barrier barrier) throws Exception {
        Integer count = checkpointBarrierCounter.compute(barrier.getId(), (id, num) -> num == null ? 1 : ++num);
        if (count != maxWriterSize) {
            return;
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `future` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private void cancelJobPipelines() {
        List<CompletableFuture<Void>> collect = pipelineList.stream().map(pipeline -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                pipeline.cancelPipeline();
            });
```

### UnnecessaryLocalVariable
Local variable `future` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        if (!task.getExecutionState().isEndState() &&
            !ExecutionState.CANCELING.equals(task.getExecutionState())) {
            CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
                task.cancel();
                return null;
```

### UnnecessaryLocalVariable
Local variable `sourceRecord` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
                        Instant.ofEpochMilli(
                            value.getInt64(Envelope.FieldName.TIMESTAMP));
                    SourceRecord sourceRecord =
                        new SourceRecord(
                            record.sourcePartition(),
```

### UnnecessaryLocalVariable
Local variable `status` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FTPClient client = connect();
        try {
            FileStatus status = getFileStatus(client, file);
            return status;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FTPClient client = connect();
        try {
            boolean success = delete(client, file, recursive);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `blockSize` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
            boolean isDir = true;
            int blockReplication = 1;
            long blockSize = DEFAULT_BLOCK_SIZE; // Block Size not known.
            long modTime = -1; // Modification time of root dir not known.
            Path root = new Path("/");
```

### UnnecessaryLocalVariable
Local variable `blockSize` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        // Using default block size since there is no way in FTP client to know of
        // block sizes on server. The assumption could be less than ideal.
        long blockSize = DEFAULT_BLOCK_SIZE;
        long modTime = ftpFile.getTimestamp().getTimeInMillis();
        long accessTime = 0;
```

### UnnecessaryLocalVariable
Local variable `stats` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FTPClient client = connect();
        try {
            FileStatus[] stats = listStatus(client, file);
            return stats;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `homeDir` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        try {
            client = connect();
            Path homeDir = new Path(client.printWorkingDirectory());
            return homeDir;
        } catch (IOException ioe) {
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FTPClient client = connect();
        try {
            boolean success = mkdirs(client, file, permission);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        FTPClient client = connect();
        try {
            boolean success = rename(client, src, dst);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `stats` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        ChannelSftp client = connect();
        try {
            FileStatus[] stats = listStatus(client, f);
            return stats;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `channel` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        String keyFile = conf.get(FS_SFTP_KEYFILE, null);

        ChannelSftp channel =
                connectionPool.connect(host, port, user, pwd, keyFile);

```

### UnnecessaryLocalVariable
Local variable `fis` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        }

        FSDataInputStream fis =
                new FSDataInputStream(new SFTPInputStream(is, channel, statistics));
        return fis;
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        ChannelSftp channel = connect();
        try {
            boolean success = rename(channel, src, dst);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `blockSize` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            boolean isDir = true;
            int blockReplication = 1;
            long blockSize = DEFAULT_BLOCK_SIZE; // Block Size not known.
            long modTime = -1; // Modification time of root directory not known.
            Path root = new Path("/");
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        ChannelSftp client = connect();
        try {
            boolean success = mkdirs(client, f, permission);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `homeDir` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        try {
            channel = connect();
            Path homeDir = new Path(channel.pwd());
            return homeDir;
        } catch (Exception ioe) {
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        ChannelSftp channel = connect();
        try {
            boolean success = delete(channel, f, recursive);
            return success;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `fos` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            throw new IOException(e);
        }
        FSDataOutputStream fos = new FSDataOutputStream(os, statistics) {
            @Override
            public void close() throws IOException {
```

### UnnecessaryLocalVariable
Local variable `blockSize` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        // Using default block size since there is no way in SFTP channel to know of
        // block sizes on server. The assumption could be less than ideal.
        long blockSize = DEFAULT_BLOCK_SIZE;
        long modTime = attr.getMTime() * 1000L; // convert to milliseconds
        long accessTime = attr.getATime() * 1000L;
```

### UnnecessaryLocalVariable
Local variable `status` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        ChannelSftp channel = connect();
        try {
            FileStatus status = getFileStatus(channel, f);
            return status;
        } finally {
```

### UnnecessaryLocalVariable
Local variable `accessToken` is redundant
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/util/AuthorizationUtil.java`
#### Snippet
```java
        //get accessToken by base64 password
        String accountMessage = username + ":" + password;
        String accessToken = HttpConfig.BASIC + " " + encodeBase64URLSafeString(accountMessage.getBytes());
        return accessToken;
    }
```

### UnnecessaryLocalVariable
Local variable `seaTunnelRowType` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
            KuduClient kuduClient = kuduClientBuilder.build();
            partitionParameter = initPartitionParameter(kuduClient, tableName);
            SeaTunnelRowType seaTunnelRowType = getSeaTunnelRowType(kuduClient.openTable(tableName).getSchema().getColumns());
            rowTypeInfo = seaTunnelRowType;
        } catch (KuduException e) {
```

### UnnecessaryLocalVariable
Local variable `tmp` is redundant
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/sink/IoTDBSinkClient.java`
#### Snippet
```java

        private List<List<String>> getStringValuesList() {
            List<?> tmp = valuesList;
            return (List<List<String>>) tmp;
        }
```

### UnnecessaryLocalVariable
Local variable `consumer` is redundant
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/client/RabbitmqClient.java`
#### Snippet
```java

    public DefaultConsumer getQueueingConsumer(Handover<Delivery> handover) {
        DefaultConsumer consumer = new QueueingConsumer(channel, handover);
        return consumer;
    }
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
                Asserts.check(totalShards == successful, String.format("POST %s,total shards(%d)!= successful shards(%d)", endpoint, totalShards, successful));

                ScrollResult scrollResult = getDocsFromScrollResponse(responseJson);
                return scrollResult;
            } else {
```

### UnnecessaryLocalVariable
Local variable `indexDocsCounts` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String entity = EntityUtils.toString(response.getEntity());
                List<IndexDocsCount> indexDocsCounts = JsonUtils.toList(entity, IndexDocsCount.class);
                return indexDocsCounts;
            } else {
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
        param.put("scroll_id", scrollId);
        param.put("scroll", scrollTime);
        ScrollResult scrollResult = getDocsFromScrollRequest("_search/scroll", JsonUtils.toJsonString(param));
        return scrollResult;
    }
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
        param.put("size", scrollSize);
        String endpoint = index + "/_search?scroll=" + scrollTime;
        ScrollResult scrollResult = getDocsFromScrollRequest(endpoint, JsonUtils.toJsonString(param));
        return scrollResult;
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
                try {
                    LOGGER.warning("This is master node, waiting the coordinator service init finished");
                    Thread.sleep(1000);
                    retryCount++;
                } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
                    ExceptionUtils.getMessage(e), i));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                        taskGroup.getTaskGroupLocation(), sleepTime));
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException ex) {
                        logger.severe(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
                while (registerWorker.isEmpty() && isRunning) {
                    LOGGER.info("waiting current worker register to resource manager...");
                    Thread.sleep(DEFAULT_WORKER_CHECK_INTERVAL);
                }
            } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/ParallelSource.java`
#### Snippet
```java
            }
            reader.pollNext(collector);
            Thread.sleep(SLEEP_TIME_INTERVAL);
        }
        LOG.debug("Parallel source runs complete.");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
#### Snippet
```java
        if (getRuntimeContext() instanceof StreamingRuntimeContext && ((StreamingRuntimeContext) getRuntimeContext()).isCheckpointingEnabled()) {
            while (running && prevCheckpointId >= latestCompletedCheckpointId.get()) {
                Thread.sleep(100);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java
                    try {
                        reader.pollNext(collector);
                        Thread.sleep(SLEEP_TIME_INTERVAL);
                    } catch (Exception e) {
                        running = false;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java
        splitEnumerator.run();
        while (running) {
            Thread.sleep(SLEEP_TIME_INTERVAL);
        }
    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/batch/ParallelBatchPartitionReader.java`
#### Snippet
```java
        while (running && handover.isEmpty()) {
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java

                        while (!handover.isEmpty()) {
                            Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                        }
                        // Block #next() method
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/batch/CoordinatedBatchPartitionReader.java`
#### Snippet
```java
                        try {
                            reader.pollNext(rowCollector);
                            Thread.sleep(SLEEP_TIME_INTERVAL);
                        } catch (Exception e) {
                            this.running = false;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/batch/CoordinatedBatchPartitionReader.java`
#### Snippet
```java
            splitEnumerator.run();
            while (this.running) {
                Thread.sleep(SLEEP_TIME_INTERVAL);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
            }
            while (!handover.isEmpty()) {
                Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
            }
            // Block #next() method
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
                        try {
                            reader.pollNext(rowCollector);
                            Thread.sleep(SLEEP_TIME_INTERVAL);
                        } catch (Exception e) {
                            this.running = false;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
            splitEnumerator.run();
            while (this.running) {
                Thread.sleep(SLEEP_TIME_INTERVAL);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepMs * i);
                }
                catch (InterruptedException ex) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/sink/IoTDBSinkClient.java`
#### Snippet
```java
                    long backoff = Math.min(sinkConfig.getRetryBackoffMultiplierMs() * i,
                        sinkConfig.getMaxRetryBackoffMs());
                    Thread.sleep(backoff);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/reader/PulsarSplitReaderThread.java`
#### Snippet
```java
                    }
                }
                Thread.sleep(pollInterval);
            }
        } catch (Throwable t) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/sink/InfluxDBSinkWriter.java`
#### Snippet
```java
                    long backoff = Math.min(sinkConfig.getRetryBackoffMultiplierMs() * i,
                        sinkConfig.getMaxRetryBackoffMs());
                    Thread.sleep(backoff);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
                    long backoff = Math.min(sinkConfig.getRetryBackoffMultiplierMs() * i,
                            sinkConfig.getMaxRetryBackoffMs());
                    Thread.sleep(backoff);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/config/MySqlSourceConfigFactory.java`
#### Snippet
```java
        // override the user-defined debezium properties
        if (dbzProperties != null) {
            dbzProperties.forEach(props::put);
        }

```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'init(io.sentry.@org.jetbrains.annotations.NotNull SentryOptions)' is marked unstable with @ApiStatus.Internal
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/sink/SentrySinkWriter.java`
#### Snippet
```java
            options.setEnableExternalConfiguration(pluginConfig.getBoolean(SentryConfig.ENABLE_EXTERNAL_CONFIGURATION.key()));
        }
        Sentry.init(options);
    }

```

### UnstableApiUsage
Overridden method 'onRetry(com.github.rholder.retry.Attempt)' is declared in unstable interface 'com.github.rholder.retry.RetryListener' marked with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
            .withRetryListener(new RetryListener() {
                @Override
                public <V> void onRetry(Attempt<V> attempt) {
                    if (attempt.hasException()) {
                        log.warn(String.format("[%d] request http failed",
```

### UnstableApiUsage
'withRetryListener(com.github.rholder.retry.RetryListener)' is unstable because its signature references unstable interface 'com.github.rholder.retry.RetryListener' marked with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
            .withWaitStrategy(WaitStrategies.fibonacciWait(httpParameter.getRetryBackoffMultiplierMillis(),
                httpParameter.getRetryBackoffMaxMillis(), TimeUnit.MILLISECONDS))
            .withRetryListener(new RetryListener() {
                @Override
                public <V> void onRetry(Attempt<V> attempt) {
```

### UnstableApiUsage
'com.github.rholder.retry.RetryListener' is marked unstable with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
            .withWaitStrategy(WaitStrategies.fibonacciWait(httpParameter.getRetryBackoffMultiplierMillis(),
                httpParameter.getRetryBackoffMaxMillis(), TimeUnit.MILLISECONDS))
            .withRetryListener(new RetryListener() {
                @Override
                public <V> void onRetry(Attempt<V> attempt) {
```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (operation) { case CREATE: case UPDATE: E...` statement on enum type 'io.debezium.data.Envelope.Operation' misses case 'TRUNCATE'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
            Envelope.Operation operation =
                Envelope.Operation.forCode(value.getString(Envelope.FieldName.OPERATION));
            switch (operation) {
                case CREATE:
                case UPDATE:
                    Envelope envelope = Envelope.fromSchema(changeRecord.valueSchema());
                    Struct source = value.getStruct(Envelope.FieldName.SOURCE);
                    Struct after = value.getStruct(Envelope.FieldName.AFTER);
                    Instant fetchTs =
                        Instant.ofEpochMilli((Long) source.get(Envelope.FieldName.TIMESTAMP));
                    SourceRecord record =
                        new SourceRecord(
                            changeRecord.sourcePartition(),
                            changeRecord.sourceOffset(),
                            changeRecord.topic(),
                            changeRecord.kafkaPartition(),
                            changeRecord.keySchema(),
                            changeRecord.key(),
                            changeRecord.valueSchema(),
                            envelope.read(after, source, fetchTs));
                    outputBuffer.put(key, record);
                    break;
                case DELETE:
                    outputBuffer.remove(key);
                    break;
                case READ:
                    throw new IllegalStateException(
                        String.format(
                            "Data change record shouldn't use READ operation, the the record is %s.",
                            changeRecord));
            }
        }
    }
```

## RuleId[ruleID=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `seatunnel-connectors-v2/connector-datahub/src/main/java/org/apache/seatunnel/connectors/seatunnel/datahub/sink/DataHubWriter.java`
#### Snippet
```java
    private boolean retry(List<RecordEntry> records, int retryNums, String project, String topic) {
        boolean success = false;
        while (retryNums != 0) {
            retryNums = retryNums - 1;
            PutRecordsResult recordsResult = dataHubClient.putRecords(project, topic, records);
```

## RuleId[ruleID=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java
        }

        try (SourceSplitEnumerator<SplitT, StateT> closed = splitEnumerator) {
            // just close the resources
        }
```

### EmptyTryBlock
Empty `try` block
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    @Override
    public void open() throws CatalogException {
        try (Connection conn = DriverManager.getConnection(defaultUrl, username, pwd)) {
            // test connection, fail early if we cannot connect to database
        } catch (SQLException e) {
```

### EmptyTryBlock
Empty `try` block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
    @Override
    public void close() {
        try (KafkaProduceSender<?, ?> kafkaProduceSender = kafkaProducerSender) {
            // no-opt
        } catch (Exception e) {
```

### EmptyTryBlock
Empty `try` block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaTransactionSender.java`
#### Snippet
```java
    public void close() {
        kafkaProducer.flush();
        try (KafkaProducer<?, ?> closedProducer = kafkaProducer) {
            // no-op
        }
```

### EmptyTryBlock
Empty `try` block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaNoTransactionSender.java`
#### Snippet
```java
    public void close() {
        kafkaProducer.flush();
        try (KafkaProducer<?, ?> closedKafkaProducer = kafkaProducer) {
            // close the producer
        }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getJobMode()` declared in class 'org.apache.seatunnel.core.starter.config.EnvironmentFactory' but referenced via subclass 'org.apache.seatunnel.core.starter.flink.config.FlinkEnvironmentFactory'
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java
        registerPlugin();
        JobContext jobContext = new JobContext();
        jobContext.setJobMode(FlinkEnvironmentFactory.getJobMode(config));

        this.sourcePluginExecuteProcessor = new SourceExecuteProcessor(jarPaths, config.getConfigList(Constants.SOURCE), jobContext);
```

## RuleId[ruleID=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
        switch (icebergType.typeId()) {
            case BOOLEAN:
                return Boolean.class.cast(icebergValue);
            case INTEGER:
                return Integer.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return Boolean.class.cast(icebergValue);
            case INTEGER:
                return Integer.class.cast(icebergValue);
            case LONG:
                return Long.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return Integer.class.cast(icebergValue);
            case LONG:
                return Long.class.cast(icebergValue);
            case FLOAT:
                return Float.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return Long.class.cast(icebergValue);
            case FLOAT:
                return Float.class.cast(icebergValue);
            case DOUBLE:
                return Double.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return Float.class.cast(icebergValue);
            case DOUBLE:
                return Double.class.cast(icebergValue);
            case DATE:
                return LocalDate.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return Double.class.cast(icebergValue);
            case DATE:
                return LocalDate.class.cast(icebergValue);
            case TIME:
                return LocalTime.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return LocalDate.class.cast(icebergValue);
            case TIME:
                return LocalTime.class.cast(icebergValue);
            case TIMESTAMP:
                Types.TimestampType timestampType = (Types.TimestampType) icebergType;
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                Types.TimestampType timestampType = (Types.TimestampType) icebergType;
                if (timestampType.shouldAdjustToUTC()) {
                    return OffsetDateTime.class.cast(icebergValue).toLocalDateTime();
                }
                return LocalDateTime.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                    return OffsetDateTime.class.cast(icebergValue).toLocalDateTime();
                }
                return LocalDateTime.class.cast(icebergValue);
            case STRING:
                return String.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return LocalDateTime.class.cast(icebergValue);
            case STRING:
                return String.class.cast(icebergValue);
            case FIXED:
                return byte[].class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return String.class.cast(icebergValue);
            case FIXED:
                return byte[].class.cast(icebergValue);
            case BINARY:
                return ByteBuffer.class.cast(icebergValue).array();
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return byte[].class.cast(icebergValue);
            case BINARY:
                return ByteBuffer.class.cast(icebergValue).array();
            case DECIMAL:
                return BigDecimal.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return ByteBuffer.class.cast(icebergValue).array();
            case DECIMAL:
                return BigDecimal.class.cast(icebergValue);
            case STRUCT:
                Record icebergStruct = Record.class.cast(icebergValue);
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return BigDecimal.class.cast(icebergValue);
            case STRUCT:
                Record icebergStruct = Record.class.cast(icebergValue);
                Types.StructType icebergStructType = (Types.StructType) icebergType;
                SeaTunnelRowType seaTunnelRowType = (SeaTunnelRowType) seaTunnelType;
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return seatunnelRow;
            case LIST:
                List icebergList = List.class.cast(icebergValue);
                Types.ListType icebergListType = (Types.ListType) icebergType;
                List seatunnelList = new ArrayList(icebergList.size());
```

### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return seatunnelList.toArray();
            case MAP:
                Map<Object, Object> icebergMap = Map.class.cast(icebergValue);
                Types.MapType icebergMapType = (Types.MapType) icebergType;
                Map seatunnelMap = new HashMap();
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        }
        String pathName = parentPath.toUri().getPath();
        Vector<LsEntry> sftpFiles;
        try {
            sftpFiles = (Vector<LsEntry>) client.ls(pathName);
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            return new FileStatus[]{fileStat};
        }
        Vector<LsEntry> sftpFiles;
        try {
            sftpFiles = (Vector<LsEntry>) client.ls(absolute.toUri().getPath());
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
        long tmp = pos + hostList.size();
        for (; pos < tmp; pos++) {
            String host = new StringBuilder("http://").append(hostList.get((int) (pos % hostList.size()))).toString();
            if (httpHelper.tryHttpConnection(host)) {
                return host;
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
            throw new IOException("None of the host in `load_url` could be connected.");
        }
        String loadUrl = new StringBuilder(host)
                .append("/api/")
                .append(sinkConfig.getDatabase())
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug(new StringBuilder("StreamLoad response:\n").append(JsonUtils.toJsonString(loadResult)).toString());
        }
        if (RESULT_FAILED.equals(loadResult.get(keyStatus))) {
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
            throw new IOException(errorBuilder.toString());
        } else if (RESULT_LABEL_EXISTED.equals(loadResult.get(keyStatus))) {
            LOG.debug(new StringBuilder("StreamLoad response:\n").append(JsonUtils.toJsonString(loadResult)).toString());
            // has to block-checking the state to get the final result
            checkLabelState(host, flushData.getLabel());
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
            }
            try {
                String queryLoadStateUrl = new StringBuilder(host).append("/api/").append(sinkConfig.getDatabase()).append("/get_load_state?label=").append(label).toString();
                Map<String, Object> result = httpHelper.doHttpGet(queryLoadStateUrl, getLoadStateHttpHeader(label));
                if (result == null) {
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
        return new StringBuilder("Basic ").append(new String(encodedAuth)).toString();
    }

```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `stats != null & result > 0`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
            pos += result;
        }
        if (stats != null & result > 0) {
            stats.incrementBytesRead(result);
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `stats != null & byteRead >= 0`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
            pos++;
        }
        if (stats != null & byteRead >= 0) {
            stats.incrementBytesRead(1);
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `created & succeeded`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
                }
            });
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
                    ),
                    plugin.optionRule());
                return;
            }
        });
```

## RuleId[ruleID=SillyAssignment]
### SillyAssignment
Variable 'batchNum' is assigned to itself
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceSplitEnumerator.java`
#### Snippet
```java
            batchNum = (int) maxElemCount;
        }
        this.batchNum = batchNum;
        this.batchSize = new Double(Math.ceil((double) maxElemCount / batchNum)).longValue();
    }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BaseSparkTransform` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/BaseSparkTransform.java`
#### Snippet
```java
 * a base interface indicates a transform plugin running on Spark.
 */
public abstract class BaseSparkTransform implements BaseTransform<SparkEnvironment> {

    protected Config config = ConfigFactory.empty();
```

### AbstractClassNeverImplemented
Abstract class `BaseSparkSink` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/BaseSparkSink.java`
#### Snippet
```java
 * a base interface indicates a sink plugin running on Spark.
 */
public abstract class BaseSparkSink<OUT> implements BaseSink<SparkEnvironment> {

    protected Config config = ConfigFactory.empty();
```

### AbstractClassNeverImplemented
Abstract class `SparkBatchSink` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchSink.java`
#### Snippet
```java
 */
@SuppressWarnings("PMD.AbstractClassShouldStartWithAbstractNamingRule")
public abstract class SparkBatchSink extends BaseSparkSink<Unit> {
}

```

### AbstractClassNeverImplemented
Abstract class `SparkBatchSource` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchSource.java`
#### Snippet
```java
 */
@SuppressWarnings("PMD.AbstractClassShouldStartWithAbstractNamingRule")
public abstract class SparkBatchSource extends BaseSparkSource<Dataset<Row>> {
}

```

### AbstractClassNeverImplemented
Abstract class `BaseSparkSource` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/BaseSparkSource.java`
#### Snippet
```java
 * a base interface indicates a source plugin running on Spark.
 */
public abstract class BaseSparkSource<OUT> implements BaseSource<SparkEnvironment> {

    protected Config config = ConfigFactory.empty();
```

### AbstractClassNeverImplemented
Abstract class `StructuredStreamingSource` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingSource.java`
#### Snippet
```java
 */
@SuppressWarnings("PMD.AbstractClassShouldStartWithAbstractNamingRule")
public abstract class StructuredStreamingSource extends BaseSparkSource<Dataset<Row>> {
}

```

### AbstractClassNeverImplemented
Abstract class `StructuredStreamingSink` has no concrete subclass
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingSink.java`
#### Snippet
```java
 */
@SuppressWarnings("PMD.AbstractClassShouldStartWithAbstractNamingRule")
public abstract class StructuredStreamingSink extends BaseSparkSink<DataStreamWriter<Row>> {
}

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Column`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/TableSchema.java`
#### Snippet
```java
        private PrimaryKey primaryKey;

        public Builder columns(List<Column> columns) {
            this.columns.addAll(columns);
            return this;
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/serialization/DeserializationSchema.java`
#### Snippet
```java
    T deserialize(byte[] message) throws IOException;

    default void deserialize(byte[] message, Collector<T> out) throws IOException {
        T deserialize = deserialize(message);
        if (deserialize != null) {
```

### BoundedWildcard
Can generalize to `? extends Option`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
    }

    private List<Option<?>> getAbsentOptions(List<Option<?>> requiredOption) {
        List<Option<?>> absent = new ArrayList<>();
        for (Option<?> option : requiredOption) {
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ReadonlyConfig.java`
#### Snippet
```java
    }

    public void toMap(Map<String, String> result) {
        if (confData.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ReadonlyConfig.java`
#### Snippet
```java
    }

    public void toMap(Map<String, String> result) {
        if (confData.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ReadonlyConfig.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public <T> Optional<T> getOptional(Option<T> option) {
        if (option == null) {
            throw new NullPointerException("Option not be null.");
```

### BoundedWildcard
Can generalize to `? extends Option`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java
    }

    public static String getOptionKeys(List<Option<?>> options,
                                       List<RequiredOption.BundledRequiredOptions> bundledOptions) {
        List<List<Option<?>>> optionList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends RequiredOption.BundledRequiredOptions`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java

    public static String getOptionKeys(List<Option<?>> options,
                                       List<RequiredOption.BundledRequiredOptions> bundledOptions) {
        List<List<Option<?>>> optionList = new ArrayList<>();
        for (Option<?> option : options) {
```

### BoundedWildcard
Can generalize to `? extends Option`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java
    }

    public static String getOptionKeys(List<Option<?>> options) {
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    static Object flatteningMap(Object rawValue, Map<String, Object> newMap, List<String> keys, boolean nestedMap) {
        if (rawValue == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends FlinkStreamSource`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/stream/FlinkStreamExecution.java`
#### Snippet
```java

    @Override
    public void start(List<FlinkStreamSource> sources, List<FlinkStreamTransform> transforms, List<FlinkStreamSink> sinks) throws Exception {
        List<DataStream<Row>> data = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends FlinkStreamTransform`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/stream/FlinkStreamExecution.java`
#### Snippet
```java

    @Override
    public void start(List<FlinkStreamSource> sources, List<FlinkStreamTransform> transforms, List<FlinkStreamSink> sinks) throws Exception {
        List<DataStream<Row>> data = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends FlinkStreamSink`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/stream/FlinkStreamExecution.java`
#### Snippet
```java

    @Override
    public void start(List<FlinkStreamSource> sources, List<FlinkStreamTransform> transforms, List<FlinkStreamSink> sinks) throws Exception {
        List<DataStream<Row>> data = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends SparkBatchSource`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void start(List<SparkBatchSource> sources, List<BaseSparkTransform> transforms, List<SparkBatchSink> sinks) {

        List<Dataset<Row>> sourceDatasets = sources.stream().map(source -> SparkEnvironment.registerInputTempView(source, environment))
```

### BoundedWildcard
Can generalize to `? extends BaseSparkTransform`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void start(List<SparkBatchSource> sources, List<BaseSparkTransform> transforms, List<SparkBatchSink> sinks) {

        List<Dataset<Row>> sourceDatasets = sources.stream().map(source -> SparkEnvironment.registerInputTempView(source, environment))
```

### BoundedWildcard
Can generalize to `? extends SparkBatchSink`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchExecution.java`
#### Snippet
```java

    @Override
    public void start(List<SparkBatchSource> sources, List<BaseSparkTransform> transforms, List<SparkBatchSink> sinks) {

        List<Dataset<Row>> sourceDatasets = sources.stream().map(source -> SparkEnvironment.registerInputTempView(source, environment))
```

### BoundedWildcard
Can generalize to `? extends FlinkBatchSink`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/batch/FlinkBatchExecution.java`
#### Snippet
```java
    }

    private boolean whetherExecute(List<FlinkBatchSink> sinks) {
        return sinks.stream().noneMatch(s -> "ConsoleSink".equals(s.getPluginName()) || "AssertSink".equals(s.getPluginName()));
    }
```

### BoundedWildcard
Can generalize to `? extends FlinkBatchSource`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/batch/FlinkBatchExecution.java`
#### Snippet
```java

    @Override
    public void start(List<FlinkBatchSource> sources, List<FlinkBatchTransform> transforms, List<FlinkBatchSink> sinks) throws Exception {
        List<DataSet<Row>> data = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends FlinkBatchTransform`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/batch/FlinkBatchExecution.java`
#### Snippet
```java

    @Override
    public void start(List<FlinkBatchSource> sources, List<FlinkBatchTransform> transforms, List<FlinkBatchSink> sinks) throws Exception {
        List<DataSet<Row>> data = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Dataset`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/SparkEnvironment.java`
#### Snippet
```java
    }

    public static Dataset<Row> registerInputTempView(BaseSparkSource<Dataset<Row>> source, SparkEnvironment environment) {
        Config config = source.getConfig();
        if (config.hasPath(RESULT_TABLE_NAME)) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/util/SchemaUtil.java`
#### Snippet
```java
    }

    public static TypeInformation<?>[] getCsvType(List<Map<String, String>> schemaList) {
        TypeInformation<?>[] typeInformation = new TypeInformation[schemaList.size()];
        int i = 0;
```

### BoundedWildcard
Can generalize to `? extends StructuredStreamingSource`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingExecution.java`
#### Snippet
```java

    @Override
    public void start(List<StructuredStreamingSource> sources, List<BaseSparkTransform> transforms,
        List<StructuredStreamingSink> sinks) throws Exception {

```

### BoundedWildcard
Can generalize to `? extends BaseSparkTransform`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingExecution.java`
#### Snippet
```java

    @Override
    public void start(List<StructuredStreamingSource> sources, List<BaseSparkTransform> transforms,
        List<StructuredStreamingSink> sinks) throws Exception {

```

### BoundedWildcard
Can generalize to `? extends StructuredStreamingSink`
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingExecution.java`
#### Snippet
```java
    @Override
    public void start(List<StructuredStreamingSource> sources, List<BaseSparkTransform> transforms,
        List<StructuredStreamingSink> sinks) throws Exception {

        List<Dataset<Row>> datasetList = sources.stream().map(s ->
```

### BoundedWildcard
Can generalize to `? super URL`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java

    @Override
    protected List<SeaTunnelSink<SeaTunnelRow, Serializable, Serializable, Serializable>> initializePlugins(List<URL> jarPaths, List<? extends Config> pluginConfigs) {
        SeaTunnelSinkPluginDiscovery sinkPluginDiscovery = new SeaTunnelSinkPluginDiscovery(addUrlToClassloader);
        List<URL> pluginJars = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java

    @Override
    public List<DataStream<Row>> execute(List<DataStream<Row>> upstreamDataStreams) throws TaskExecuteException {
        DataStream<Row> input = upstreamDataStreams.get(0);
        for (int i = 0; i < plugins.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super URL`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java

    @Override
    protected List<SeaTunnelSource> initializePlugins(List<URL> jarPaths, List<? extends Config> pluginConfigs) {
        SeaTunnelSourcePluginDiscovery sourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery(addUrlToClassloader);
        List<SeaTunnelSource> sources = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super URL`
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java

    @Override
    protected List<FlinkStreamTransform> initializePlugins(List<URL> jarPaths, List<? extends Config> pluginConfigs) {
        SeaTunnelFlinkTransformPluginDiscovery transformPluginDiscovery = new SeaTunnelFlinkTransformPluginDiscovery();
        List<URL> pluginJars = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Dataset`
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java

    @Override
    public List<Dataset<Row>> execute(List<Dataset<Row>> upstreamDataStreams) throws TaskExecuteException {
        Dataset<Row> input = upstreamDataStreams.get(0);
        for (int i = 0; i < plugins.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, Function<String, T> getter, Consumer<T> setter) {
        T value = null;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, Function<String, T> getter, Consumer<T> setter) {
        T value = null;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, Function<String, T> getter, Consumer<T> setter) {
        T value = null;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, T defaultValue, Function<String, T> getter, Consumer<T> setter) {
        T value;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, T defaultValue, Function<String, T> getter, Consumer<T> setter) {
        T value;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
    }

    public static <T> void setOption(Config config, String optionName, T defaultValue, Function<String, T> getter, Consumer<T> setter) {
        T value;
        if (config.hasPath(optionName)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
     * append appJar to StringBuilder
     */
    protected void appendAppJar(List<String> commands) {
        commands.add(Common.appStarterDir().resolve("seatunnel-spark-starter.jar").toString());
    }
```

### BoundedWildcard
Can generalize to `? extends Path`
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
     * append comma-split paths option to StringBuilder
     */
    protected void appendPaths(List<String> commands, String option, List<Path> paths) {
        if (!paths.isEmpty()) {
            String values = paths.stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
     * append option to StringBuilder
     */
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
```

### BoundedWildcard
Can generalize to `? extends LogicalVertex`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalEdge.java`
#### Snippet
```java
    }

    public void recoveryFromVertexMap(@NonNull Map<Long, LogicalVertex> vertexMap) {
        inputVertex = vertexMap.get(inputVertexId);
        targetVertex = vertexMap.get(targetVertexId);
```

### BoundedWildcard
Can generalize to `? extends Action`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDagGenerator.java`
#### Snippet
```java
    private final Map<Long, Set<Long>> inputVerticesMap = new HashMap<>();

    public LogicalDagGenerator(@NonNull List<Action> actions,
                               @NonNull JobConfig jobConfig,
                               @NonNull IdGenerator idGenerator) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/PassiveCompletableFuture.java`
#### Snippet
```java
    }

    public PassiveCompletableFuture(CompletableFuture<T> chainedFuture) {
        chainedFuture.whenComplete((r, t) -> {
            if (t != null) {
```

### BoundedWildcard
Can generalize to `? extends Action`
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/job/JobExecutionEnvironment.java`
#### Snippet
```java
    }

    public void addAction(List<Action> actions) {
        this.actions.addAll(actions);
    }
```

### BoundedWildcard
Can generalize to `? super ClientMessage`
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelHazelcastClient.java`
#### Snippet
```java
    public <S> S requestAndDecodeResponse(@NonNull UUID uuid,
                                          @NonNull ClientMessage request,
                                          @NonNull Function<ClientMessage, Object> decoder) {
        ClientInvocation invocation = new ClientInvocation(hazelcastClient, request, null, uuid);
        try {
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeatunnelBaseClassLoader.java`
#### Snippet
```java
    }

    protected SeatunnelBaseClassLoader(URL[] urls, ClassLoader parent, Consumer<Throwable> classLoadingExceptionHandler) {
        super(urls, parent);
        this.classLoadingExceptionHandler = classLoadingExceptionHandler;
```

### BoundedWildcard
Can generalize to `? super TaskGroupImmutableInformation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    }

    private void deployInternal(Consumer<TaskGroupImmutableInformation> taskGroupConsumer) {
        TaskGroupImmutableInformation taskGroupImmutableInformation = getTaskGroupImmutableInformation();
        synchronized (this) {
```

### BoundedWildcard
Can generalize to `? extends PhysicalVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    }

    private void makeTasksFailed(@NonNull List<PhysicalVertex> physicalVertexList, @NonNull Address lostAddress) {
        physicalVertexList.forEach(physicalVertex -> {
            Address deployAddress = physicalVertex.getCurrentExecutionAddress();
```

### BoundedWildcard
Can generalize to `? extends OneInputFlowLifeCycle`>
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTransformCollector.java`
#### Snippet
```java
    private final List<OneInputFlowLifeCycle<Record<?>>> outputs;

    public SeaTunnelTransformCollector(List<OneInputFlowLifeCycle<Record<?>>> outputs) {
        this.outputs = outputs;
    }
```

### BoundedWildcard
Can generalize to `? extends TaskExecutionState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    }

    private void addPhysicalVertexCallBack(PassiveCompletableFuture<TaskExecutionState> future) {
        future.thenAcceptAsync(executionState -> {
            try {
```

### BoundedWildcard
Can generalize to `? extends OneInputFlowLifeCycle`>
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelSourceCollector.java`
#### Snippet
```java
    private final List<OneInputFlowLifeCycle<Record<?>>> outputs;

    public SeaTunnelSourceCollector(Object checkpointLock, List<OneInputFlowLifeCycle<Record<?>>> outputs) {
        this.checkpointLock = checkpointLock;
        this.outputs = outputs;
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/AbstractTask.java`
#### Snippet
```java
    }

    public static <T> List<byte[]> serializeStates(Serializer<T> serializer, List<T> states) {
        return states.stream()
            .map(state -> sneaky(() -> serializer.serialize(state)))
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/AbstractTask.java`
#### Snippet
```java
    }

    public static <T> List<byte[]> serializeStates(Serializer<T> serializer, List<T> states) {
        return states.stream()
            .map(state -> sneaky(() -> serializer.serialize(state)))
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/PartitionTransformSourceFlowLifeCycle.java`
#### Snippet
```java

    @Override
    public void collect(Collector<T> collector) throws Exception {
        for (int i = 0; i < ringbuffers.length; i++) {
            Ringbuffer<T> ringbuffer = ringbuffers[i];
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        Optional<Serializable> state = actionStateList.stream()
            .map(ActionSubtaskState::getState)
```

### BoundedWildcard
Can generalize to `? super TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    }

    private void sendToAllReader(Function<TaskLocation, Operation> function) {
        List<InvocationFuture<?>> futures = new ArrayList<>();
        taskMemberMapping.forEach((location, address) ->
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    }

    private void sendToAllReader(Function<TaskLocation, Operation> function) {
        List<InvocationFuture<?>> futures = new ArrayList<>();
        taskMemberMapping.forEach((location, address) ->
```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/TransformFlowLifeCycle.java`
#### Snippet
```java
    public TransformFlowLifeCycle(TransformChainAction<T> action,
                                  SeaTunnelTask runningTask,
                                  Collector<Record<?>> collector,
                                  CompletableFuture<Void> completableFuture) {
        super(action, runningTask, completableFuture);
```

### BoundedWildcard
Can generalize to `? super List`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    }

    private void splitUnionVertex(List<List<ExecutionEdge>> pipelines, List<ExecutionVertex> pipeline,
                                  ExecutionVertex currentVertex) {
        pipeline.add(recreateVertex(currentVertex, pipeline.size() == 0 ?
```

### BoundedWildcard
Can generalize to `? extends ExecutionVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    }

    private List<ExecutionEdge> createExecutionEdges(List<ExecutionVertex> pipeline) {
        checkArgument(pipeline != null && pipeline.size() > 1);
        List<ExecutionEdge> edges = new ArrayList<>(pipeline.size() - 1);
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
     * If this execution vertex have partition transform, can't be spilt
     */
    private boolean checkCanSplit(List<ExecutionEdge> edges) {
        return edges.stream().noneMatch(e -> e.getRightVertex().getAction() instanceof PartitionTransformAction)
                && edges.stream().anyMatch(e -> inputVerticesMap.get(e.getRightVertexId()).size() > 1);
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    }

    private void fillVerticesMap(List<ExecutionEdge> edges) {
        inputVerticesMap.clear();
        targetVerticesMap.clear();
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    }

    private static List<ExecutionEdge> findVertexRelatedEdge(List<ExecutionEdge> edges, ExecutionVertex vertex) {

        List<ExecutionEdge> sourceEdges = edges.stream().filter(edge -> edge.getLeftVertex().equals(vertex))
```

### BoundedWildcard
Can generalize to `? extends ExecutionVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    }

    private List<ExecutionVertex> recreatePipeline(List<ExecutionVertex> pipeline) {
        return pipeline.stream()
            .map(vertex -> recreateVertex(vertex, vertex.getParallelism()))
```

### BoundedWildcard
Can generalize to `? extends ExecutionVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    private final List<ExecutionEdge> edges;

    public PipelineGenerator(Collection<ExecutionVertex> vertices,
                             List<ExecutionEdge> edges) {
        this.vertices = vertices;
```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/IntermediateQueueFlowLifeCycle.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:MagicNumber")
    @Override
    public void collect(Collector<Record<?>> collector) throws Exception {
        while (true) {
            Record<?> record = queue.poll(100, TimeUnit.MILLISECONDS);
```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/IntermediateQueueFlowLifeCycle.java`
#### Snippet
```java
    }

    private void handleRecord(Record<?> record, ConsumerWithException<Record<?>> consumer) throws Exception {
        if (record.getData() instanceof Barrier) {
            CheckpointBarrier barrier = (CheckpointBarrier) record.getData();
```

### BoundedWildcard
Can generalize to `? super TaskExecutionState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

        TaskGroupExecutionTracker(@NonNull CompletableFuture<Void> cancellationFuture, @NonNull TaskGroup taskGroup,
                                  @NonNull CompletableFuture<TaskExecutionState> future) {
            this.future = future;
            this.completionLatch = new AtomicInteger(taskGroup.getTasks().size());
```

### BoundedWildcard
Can generalize to `? extends Task`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
    }

    private void submitBlockingTask(TaskGroupExecutionTracker taskGroupExecutionTracker, List<Task> tasks) {

        CountDownLatch startedLatch = new CountDownLatch(tasks.size());
```

### BoundedWildcard
Can generalize to `? extends Task`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
    }

    private void submitThreadShareTask(TaskGroupExecutionTracker taskGroupExecutionTracker, List<Task> tasks) {
        tasks.stream()
            .map(t -> new TaskTracker(t, taskGroupExecutionTracker))
```

### BoundedWildcard
Can generalize to `? super Action`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    }

    private <T> Set<T> getFlowInfo(BiConsumer<Action, Set<T>> function) {
        List<Flow> now = new ArrayList<>();
        now.add(executionFlow);
```

### BoundedWildcard
Can generalize to `? super Set`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    }

    private <T> Set<T> getFlowInfo(BiConsumer<Action, Set<T>> function) {
        List<Flow> now = new ArrayList<>();
        now.add(executionFlow);
```

### BoundedWildcard
Can generalize to `? super InternalCheckpointListener`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    }

    public void notifyAllAction(ConsumerWithException<InternalCheckpointListener> consumer){
        allCycles.stream()
            .filter(cycle -> cycle instanceof InternalCheckpointListener)
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        Map<Long, List<ActionSubtaskState>> stateMap = actionStateList.stream()
            .collect(Collectors.groupingBy(ActionSubtaskState::getActionId, Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        List<AggregatedCommitInfoT> aggregatedCommitInfos = actionStateList.stream()
            .map(ActionSubtaskState::getState)
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        if (actionStateList.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        List<StateT> states = new ArrayList<>();
        if (writerStateSerializer.isPresent()) {
```

### BoundedWildcard
Can generalize to `? super ClientMessage`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java

    protected AbstractSeaTunnelMessageTask(ClientMessage clientMessage, Node node, Connection connection,
                                           Function<ClientMessage, P> decoder, Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);

```

### BoundedWildcard
Can generalize to `? extends P`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java

    protected AbstractSeaTunnelMessageTask(ClientMessage clientMessage, Node node, Connection connection,
                                           Function<ClientMessage, P> decoder, Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);

```

### BoundedWildcard
Can generalize to `? super R`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java

    protected AbstractSeaTunnelMessageTask(ClientMessage clientMessage, Node node, Connection connection,
                                           Function<ClientMessage, P> decoder, Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);

```

### BoundedWildcard
Can generalize to `? extends SourceAction`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    }

    private List<PhysicalVertex> getEnumeratorTask(List<SourceAction<?, ?, ?>> sources,
                                                   int pipelineIndex,
                                                   int totalPipelineNum) {
```

### BoundedWildcard
Can generalize to `? extends SourceAction`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java

    private List<PhysicalVertex> getSourceTask(List<ExecutionEdge> edges,
                                               List<SourceAction<?, ?, ?>> sources,
                                               int pipelineIndex,
                                               int totalPipelineNum) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    }

    private List<PhysicalVertex> getCommitterTask(List<ExecutionEdge> edges,
                                                  int pipelineIndex,
                                                  int totalPipelineNum) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    }

    private List<SourceAction<?, ?, ?>> findSourceAction(List<ExecutionEdge> edges) {
        return edges.stream().filter(s -> s.getLeftVertex().getAction() instanceof SourceAction)
            .map(s -> (SourceAction<?, ?, ?>) s.getLeftVertex().getAction())
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    }

    private List<Flow> getNextWrapper(List<ExecutionEdge> edges, Action start) {
        List<Action> actions = edges.stream().filter(e -> e.getLeftVertex().getAction().equals(start))
            .map(e -> e.getRightVertex().getAction()).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Integer`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java

    public IMapCheckpointIDCounter(Integer pipelineId,
                                   IMap<Integer, Long> checkpointIdMap) {
        this.pipelineId = pipelineId;
        this.checkpointIdMap = checkpointIdMap;
```

### BoundedWildcard
Can generalize to `? extends TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        }

        public Builder pipelineSubtasks(Set<TaskLocation> pipelineTaskIds) {
            this.pipelineSubtasks.addAll(pipelineTaskIds);
            return this;
```

### BoundedWildcard
Can generalize to `? extends TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        }

        public Builder startingSubtasks(Set<TaskLocation> startingVertices) {
            this.startingSubtasks.addAll(startingVertices);
            return this;
```

### BoundedWildcard
Can generalize to `? extends TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        }

        public Builder subtaskActions(Map<TaskLocation, Set<Tuple2<Long, Integer>>> subtaskActions) {
            this.subtaskActions.putAll(subtaskActions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Set`>
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        }

        public Builder subtaskActions(Map<TaskLocation, Set<Tuple2<Long, Integer>>> subtaskActions) {
            this.subtaskActions.putAll(subtaskActions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends JobMaster`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
        IMap<Object, Object> runningJobStateIMap,
        ILogger logger,
        Map<Long, JobMaster> runningJobMasterMap,
        IMap<Long, JobStateData> finishedJobStateImap
    ) {
```

### BoundedWildcard
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
        ILogger logger,
        Map<Long, JobMaster> runningJobMasterMap,
        IMap<Long, JobStateData> finishedJobStateImap
    ) {
        this.runningJobStateIMap = runningJobStateIMap;
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/PendingCheckpoint.java`
#### Snippet
```java
    }

    public void acknowledgeTask(TaskLocation taskLocation, List<ActionSubtaskState> states, SubtaskStatus subtaskStatus) {
        boolean exist = notYetAcknowledgedTasks.remove(taskLocation.getTaskID());
        if (!exist) {
```

### BoundedWildcard
Can generalize to `? extends SlotProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java

    private SlotProfile getOrApplyResourceForTask(@NonNull PhysicalVertex task,
                                                  Map<TaskGroupLocation, SlotProfile> ownedSlotProfiles) {

        SlotProfile oldProfile;
```

### BoundedWildcard
Can generalize to `? extends SlotProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
    }

    private void deployPipeline(@NonNull SubPlan pipeline, Map<TaskGroupLocation, SlotProfile> slotProfiles) {
        if (pipeline.updatePipelineState(PipelineStatus.SCHEDULED, PipelineStatus.DEPLOYING)) {

```

### BoundedWildcard
Can generalize to `? extends SlotProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java

    @Override
    public CompletableFuture<Void> releaseResources(long jobId, List<SlotProfile> profiles) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        List<CompletableFuture<Void>> futures = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ResourceProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java

    public ResourceRequestHandler(long jobId,
                                  List<ResourceProfile> resourceProfile,
                                  ConcurrentMap<Address, WorkerProfile> registerWorker,
                                  AbstractResourceManager resourceManager) {
```

### BoundedWildcard
Can generalize to `? extends TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
    }

    public static Map<Long, Integer> getPipelineTasks(Set<TaskLocation> pipelineSubtasks) {
        return pipelineSubtasks.stream()
            .collect(Collectors.groupingBy(TaskLocation::getTaskVertexId, Collectors.toList()))
```

### BoundedWildcard
Can generalize to `? extends PendingCheckpoint`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
    }

    private void startTriggerPendingCheckpoint(CompletableFuture<PendingCheckpoint> pendingCompletableFuture) {
        pendingCompletableFuture.thenAcceptAsync(pendingCheckpoint -> {
            LOG.info("wait checkpoint completed: " + pendingCheckpoint.getCheckpointId());
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    }

    public void collect(byte[] message, Collector<SeaTunnelRow> out) throws IOException {
        JsonNode jsonNode = convertBytes(message);
        if (jsonNode.isArray()) {
```

### BoundedWildcard
Can generalize to `? super CommT`
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkGlobalCommitter.java`
#### Snippet
```java
    private final SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter;

    FlinkGlobalCommitter(SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter) {
        this.aggregatedCommitter = aggregatedCommitter;
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java
    private long checkpointId;

    FlinkSinkWriter(org.apache.seatunnel.api.sink.SinkWriter<SeaTunnelRow, CommT, WriterStateT> sinkWriter,
                    long checkpointId,
                    SeaTunnelDataType<?> dataType) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelDataType`
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
    }

    private static Object convertMap(Map<?, ?> mapData, MapType<?, ?> mapType, BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataWriter.java`
#### Snippet
```java
    private long epochId;

    SparkDataWriter(SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
                    @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
                    SeaTunnelDataType<?> dataType, long epochId) {
```

### BoundedWildcard
Can generalize to `? super CommitInfoT`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataWriter.java`
#### Snippet
```java

    SparkDataWriter(SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
                    @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
                    SeaTunnelDataType<?> dataType, long epochId) {
        this.sinkWriter = sinkWriter;
```

### BoundedWildcard
Can generalize to `? super InternalRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/InternalRowCollector.java`
#### Snippet
```java
    private final AtomicLong collectTotalCount;

    public InternalRowCollector(Handover<InternalRow> handover, Object checkpointLock, SeaTunnelDataType<?> dataType) {
        this.handover = handover;
        this.checkpointLock = checkpointLock;
```

### BoundedWildcard
Can generalize to `? extends InternalRowCollector`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
    }

    private void internalCheckpoint(Iterator<InternalRowCollector> iterator, int loop) throws Exception {
        if (!iterator.hasNext()) {
            return;
```

### BoundedWildcard
Can generalize to `? super C`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceSplitReader.java`
#### Snippet
```java

    public IncrementalSourceSplitReader(
        int subtaskId, DataSourceDialect<C> dataSourceDialect, C sourceConfig) {
        this.subtaskId = subtaskId;
        this.splits = new ArrayDeque<>();
```

### BoundedWildcard
Can generalize to `? extends SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceSplitReader.java`
#### Snippet
```java

    @Override
    public void handleSplitsChanges(SplitsChange<SourceSplitBase> splitsChanges) {
        if (!(splitsChanges instanceof SplitsAddition)) {
            throw new UnsupportedOperationException(
```

### BoundedWildcard
Can generalize to `? super Struct`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
    @Override
    public void rewriteOutputBuffer(
        Map<Struct, SourceRecord> outputBuffer, SourceRecord changeRecord) {
        Struct key = (Struct) changeRecord.key();
        Struct value = (Struct) changeRecord.value();
```

### BoundedWildcard
Can generalize to `? super SourceRecord`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java
    @Override
    public void rewriteOutputBuffer(
        Map<Struct, SourceRecord> outputBuffer, SourceRecord changeRecord) {
        Struct key = (Struct) changeRecord.key();
        Struct value = (Struct) changeRecord.value();
```

### BoundedWildcard
Can generalize to `? extends SourceRecord`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/external/JdbcSourceFetchTaskContext.java`
#### Snippet
```java

    @Override
    public List<SourceRecord> formatMessageTimestamp(Collection<SourceRecord> snapshotRecords) {
        return snapshotRecords.stream()
            .map(
```

### BoundedWildcard
Can generalize to `? super SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSourceEnumerator.java`
#### Snippet
```java

    public IncrementalSourceEnumerator(
            SourceSplitEnumerator.Context<SourceSplitBase> context,
            SplitAssigner splitAssigner) {
        this.context = context;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializeSchema.java`
#### Snippet
```java

    @Override
    public void deserialize(SourceRecord record, Collector<SeaTunnelRow> collector) throws Exception {
        Envelope.Operation operation = Envelope.operationFor(record);
        Struct messageStruct = (Struct) record.value();
```

### BoundedWildcard
Can generalize to `? extends SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSplitAssigner.java`
#### Snippet
```java

    @Override
    public void addSplits(Collection<SourceSplitBase> splits) {
        // we don't store the split, but will re-create incremental split later
        splits.stream()
```

### BoundedWildcard
Can generalize to `? extends C`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSplitAssigner.java`
#### Snippet
```java

    public IncrementalSplitAssigner(
        SplitAssigner.Context<C> context,
        int incrementalParallelism,
        OffsetFactory offsetFactory) {
```

### BoundedWildcard
Can generalize to `? extends BinlogOffset`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java
    }

    private static BinlogOffset getBinlogOffset(JdbcConnection jdbc, String showMasterStmt, JdbcConnection.ResultSetMapper<BinlogOffset> function) {
        try {
            return jdbc.queryAndMap(showMasterStmt, rs -> {
```

### BoundedWildcard
Can generalize to `? extends SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/HybridSplitAssigner.java`
#### Snippet
```java

    @Override
    public void addSplits(Collection<SourceSplitBase> splits) {
        List<SourceSplitBase> snapshotSplits = new ArrayList<>();
        List<SourceSplitBase> incrementalSplits = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends FakeSourceSplit`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<FakeSourceSplit> splits) {
        this.splits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceReader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("MagicNumber")
    public void pollNext(Collector<SeaTunnelRow> output) throws InterruptedException {
        long currentTimestamp = Instant.now().toEpochMilli();
        if (currentTimestamp <= latestTimestamp + config.getSplitReadInterval()) {
```

### BoundedWildcard
Can generalize to `? extends FakeSourceSplit`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addSplitChangeToPendingAssignments(Collection<FakeSourceSplit> newSplits) {
        for (FakeSourceSplit split : newSplits) {
            int ownerReader = split.getSplitId() % enumeratorContext.currentParallelism();
```

### BoundedWildcard
Can generalize to `? super FakeSourceSplit`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceSplitEnumerator.java`
#### Snippet
```java
    private final Set<FakeSourceSplit> assignedSplits;

    public FakeSourceSplitEnumerator(SourceSplitEnumerator.Context<FakeSourceSplit> enumeratorContext,
                                     FakeConfig config,
                                     Set<FakeSourceSplit> assignedSplits) {
```

### BoundedWildcard
Can generalize to `? extends FileCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkCommitter.java`
#### Snippet
```java
     */
    @Override
    public void abort(List<FileCommitInfo> commitInfos) throws IOException {
        for (FileCommitInfo commitInfo : commitInfos) {
            Map<String, String> needMoveFiles = commitInfo.getNeedMoveFiles();
```

### BoundedWildcard
Can generalize to `? extends FileCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkCommitter.java`
#### Snippet
```java

    @Override
    public List<FileCommitInfo> commit(List<FileCommitInfo> commitInfos) throws IOException {
        ArrayList<FileCommitInfo> failedCommitInfos = new ArrayList<>();
        for (FileCommitInfo commitInfo : commitInfos) {
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
     */
    @Override
    public void abort(List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws Exception {
        log.info("rollback aggregate commit");
        if (aggregatedCommitInfos == null || aggregatedCommitInfos.size() == 0) {
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public List<FileAggregatedCommitInfo> commit(List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        List<FileAggregatedCommitInfo> errorAggregatedCommitInfoList = new ArrayList<>();
        aggregatedCommitInfos.forEach(aggregatedCommitInfo -> {
```

### BoundedWildcard
Can generalize to `? extends FileCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
     */
    @Override
    public FileAggregatedCommitInfo combine(List<FileCommitInfo> commitInfos) {
        if (commitInfos == null || commitInfos.size() == 0) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends FileSourceSplit`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/BaseFileSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<FileSourceSplit> splits) {
        sourceSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super C`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/SnapshotSplitAssigner.java`
#### Snippet
```java
        boolean isTableIdCaseSensitive,
        boolean isRemainingTablesCheckpointed,
        DataSourceDialect<C> dialect) {
        this.context = context;
        this.sourceConfig = context.getSourceConfig();
```

### BoundedWildcard
Can generalize to `? extends SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/SnapshotSplitAssigner.java`
#### Snippet
```java

    @Override
    public void addSplits(Collection<SourceSplitBase> splits) {
        for (SourceSplitBase split : splits) {
            remainingSplits.add(split.asSnapshotSplit());
```

### BoundedWildcard
Can generalize to `? extends SnapshotSplitWatermark`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/SnapshotSplitAssigner.java`
#### Snippet
```java

    @Override
    public void onCompletedSplits(List<SnapshotSplitWatermark> completedSplitWatermarks) {
        completedSplitWatermarks.forEach(m -> this.splitCompletedOffsets.put(m.getSplitId(), m.getHighWatermark()));
        if (allSplitsCompleted()) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/JsonReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output) throws FileConnectorException, IOException {
        Configuration conf = getConfiguration();
        FileSystem fs = FileSystem.get(conf);
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/TextReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output) throws FileConnectorException, IOException {
        Configuration conf = getConfiguration();
        FileSystem fs = FileSystem.get(conf);
```

### BoundedWildcard
Can generalize to `? extends FileSourceSplit`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/split/FileSourceSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(List<FileSourceSplit> splits, int subtaskId) {
        if (!splits.isEmpty()) {
            pendingSplit.addAll(splits);
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output) throws FileConnectorException, IOException {
        if (Boolean.FALSE.equals(checkFileType(path))) {
            String errorMsg = String.format("This file [%s] is not a parquet file, please check the format of this file", path);
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public void abort(List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws Exception {
        super.abort(aggregatedCommitInfos);
        HiveMetaStoreProxy hiveMetaStore = HiveMetaStoreProxy.getInstance(pluginConfig);
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public List<FileAggregatedCommitInfo> commit(List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        HiveMetaStoreProxy hiveMetaStore = HiveMetaStoreProxy.getInstance(pluginConfig);
        List<FileAggregatedCommitInfo> errorCommitInfos = super.commit(aggregatedCommitInfos);
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output) throws FileConnectorException, IOException {
        if (Boolean.FALSE.equals(checkFileType(path))) {
            String errorMsg = String.format("This file [%s] is not a orc file, please check the format of this file", path);
```

### BoundedWildcard
Can generalize to `? extends SourceSplitBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<SourceSplitBase> splits) {
        // restore for finishedUnackedSplits
        List<SourceSplitBase> unfinishedSplits = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends SourceSplitStateBase`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceReader.java`
#### Snippet
```java

    @Override
    protected void onSplitFinished(Map<String, SourceSplitStateBase> finishedSplitIds) {
        for (SourceSplitStateBase splitState : finishedSplitIds.values()) {
            SourceSplitBase sourceSplit = splitState.toSourceSplit();
```

### BoundedWildcard
Can generalize to `? extends JdbcSinkState`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcExactlyOnceSinkWriter.java`
#### Snippet
```java
        JdbcSinkOptions jdbcSinkOptions,
        SeaTunnelRowType rowType,
        List<JdbcSinkState> states) {
        checkArgument(
            jdbcSinkOptions.getJdbcConnectionOptions().getMaxRetries() == 0,
```

### BoundedWildcard
Can generalize to `? extends JdbcAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public void abort(List<JdbcAggregatedCommitInfo> aggregatedCommitInfo) throws IOException {
        tryOpen();
        for (JdbcAggregatedCommitInfo commitInfos : aggregatedCommitInfo) {
```

### BoundedWildcard
Can generalize to `? extends JdbcAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public List<JdbcAggregatedCommitInfo> commit(List<JdbcAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        tryOpen();
        return aggregatedCommitInfos.stream().map(aggregatedCommitInfo -> {
```

### BoundedWildcard
Can generalize to `? extends HudiSourceSplit`
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSourceSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(List<HudiSourceSplit> splits, int subtaskId) {
        if (!splits.isEmpty()) {
            pendingSplit.addAll(splits);
```

### BoundedWildcard
Can generalize to `? extends HudiSourceSplit`
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<HudiSourceSplit> splits) {
        sourceSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        if (sourceSplits.isEmpty()) {
            Thread.sleep(THREAD_WAIT_TIME);
```

### BoundedWildcard
Can generalize to `? extends JdbcSourceSplit`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<JdbcSourceSplit> splits) {
        this.splits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("magicnumber")
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        synchronized (output.getCheckpointLock()) {
            JdbcSourceSplit split = splits.poll();
```

### BoundedWildcard
Can generalize to `? super JdbcSourceSplit`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplitEnumerator.java`
#### Snippet
```java
    private final PartitionParameter partitionParameter;

    public JdbcSourceSplitEnumerator(SourceSplitEnumerator.Context<JdbcSourceSplit> enumeratorContext, JdbcSourceOptions jdbcSourceOptions, PartitionParameter partitionParameter) {
        this.enumeratorContext = enumeratorContext;
        this.jdbcSourceOptions = jdbcSourceOptions;
```

### BoundedWildcard
Can generalize to `? extends E`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private E createAndOpenStatementExecutor(
        StatementExecutorFactory<E> statementExecutorFactory)
        throws IOException {
        E exec = statementExecutorFactory.get();
```

### BoundedWildcard
Can generalize to `? extends XidInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaGroupOpsImpl.java`
#### Snippet
```java

    private static void throwIfAnyReachedMaxAttempts(
        GroupXaOperationResult<XidInfo> result, int maxAttempts) {
        List<XidInfo> reached = null;
        for (XidInfo x : result.getForRetry()) {
```

### BoundedWildcard
Can generalize to `? extends XidInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaGroupOpsImpl.java`
#### Snippet
```java

    @Override
    public GroupXaOperationResult<XidInfo> failAndRollback(Collection<XidInfo> xids) {
        GroupXaOperationResult<XidInfo> result = new GroupXaOperationResult<>();
        if (xids.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends XidInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaGroupOpsImpl.java`
#### Snippet
```java

    @Override
    public void rollback(List<XidInfo> xids) {
        for (XidInfo x : xids) {
            xaFacade.rollback(x.getXid());
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        KuduSourceSplit split = splits.poll();
        Object[] parameterValues = split.parameterValues;
```

### BoundedWildcard
Can generalize to `? extends KuduSourceSplit`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<KuduSourceSplit> splits) {
        this.splits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? extends ColumnSchema`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduTypeMapper.java`
#### Snippet
```java
    private static final String KUDU_BINARY = "BINARY";
    private static final int PRECISION = 20;
    public static SeaTunnelDataType<?> mapping(List<ColumnSchema> columnSchemaList, int colIndex) throws SQLException {
        String kuduType = columnSchemaList.get(colIndex).getType().getName().toUpperCase();
        switch (kuduType) {
```

### BoundedWildcard
Can generalize to `? extends KafkaSinkState`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
    }

    private void restoreState(List<KafkaSinkState> states) {
        if (!states.isEmpty()) {
            this.transactionPrefix = states.get(0).getTransactionIdPrefix();
```

### BoundedWildcard
Can generalize to `? extends KafkaCommitInfo`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkCommitter.java`
#### Snippet
```java

    @Override
    public void abort(List<KafkaCommitInfo> commitInfos) {
        if (commitInfos.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends IoTDBSourceSplit`
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addPendingSplit(Collection<IoTDBSourceSplit> splits) {
        int readerCount = context.currentParallelism();
        for (IoTDBSourceSplit split : splits) {
```

### BoundedWildcard
Can generalize to `? extends IoTDBSourceSplit`
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<IoTDBSourceSplit> splits) {
        pendingSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/source/IoTDBSourceReader.java`
#### Snippet
```java
    }

    private void read(IoTDBSourceSplit split, Collector<SeaTunnelRow> output) throws Exception {
        try (SessionDataSet dataSet = session.executeQueryStatement(split.getQuery())) {
            while (dataSet.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/source/Neo4jSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        final Query query = new Query(neo4jSourceQueryInfo.getQuery());
        session.readTransaction(tx -> {
```

### BoundedWildcard
Can generalize to `? extends KafkaSourceSplit`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<KafkaSourceSplit> splits) {
        running = true;
        splits.forEach(s -> {
```

### BoundedWildcard
Can generalize to `? super XAException`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
            Xid xid,
            ThrowingRunnable<XAException> runnable,
            Function<XAException, Optional<String>> err2msg) {
            return fromRunnable(
                action,
```

### BoundedWildcard
Can generalize to `? extends XAException`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
            String action,
            Xid xid,
            ThrowingRunnable<XAException> runnable,
            Consumer<XAException> recover) {
            return new Command<>(
```

### BoundedWildcard
Can generalize to `? super XAException`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
            Xid xid,
            ThrowingRunnable<XAException> runnable,
            Consumer<XAException> recover) {
            return new Command<>(
                action,
```

### BoundedWildcard
Can generalize to `? extends SingleSplit`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/SingleSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(List<SingleSplit> splits, int subtaskId) {
        pendingSplit = splits.get(0);
        assignSplit();
```

### BoundedWildcard
Can generalize to `? extends SingleSplit`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/AbstractSingleSplitReader.java`
#### Snippet
```java

    @Override
    public final void addSplits(List<SingleSplit> splits) {
        if (splits.size() > 1) {
            throw new UnsupportedOperationException("The single-split reader don't support reading multiple splits");
```

### BoundedWildcard
Can generalize to `? extends AssertFieldRule.AssertRule`
in `seatunnel-connectors-v2/connector-assert/src/main/java/org/apache/seatunnel/connectors/seatunnel/assertion/sink/AssertSinkWriter.java`
#### Snippet
```java
    private static final LongAccumulator LONG_ACCUMULATOR = new LongAccumulator(Long::sum, 0);

    public AssertSinkWriter(SeaTunnelRowType seaTunnelRowType, List<AssertFieldRule> assertFieldRules, List<AssertFieldRule.AssertRule> assertRowRules) {
        this.seaTunnelRowType = seaTunnelRowType;
        this.assertFieldRules = assertFieldRules;
```

### BoundedWildcard
Can generalize to `? extends RecordsWithSplitIds`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
    private boolean noMoreSplitsAssignment;

    public SourceReaderBase(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                            SplitFetcherManager<E, SplitT> splitFetcherManager,
                            RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcher.java`
#### Snippet
```java
                 @NonNull BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                 @NonNull SplitReader<E, SplitT> splitReader,
                 @NonNull Consumer<Throwable> errorHandler,
                 @NonNull Runnable shutdownHook,
                 @NonNull Consumer<Collection<String>> splitFinishedHook) {
```

### BoundedWildcard
Can generalize to `? extends KafkaSourceSplit`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private Map<TopicPartition, ? extends KafkaSourceSplit> convertToNextSplit(List<KafkaSourceSplit> splits) {
        try {
            Map<TopicPartition, Long> listOffsets =
```

### BoundedWildcard
Can generalize to `? extends SplitReader`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java

    public SplitFetcherManager(BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
                               Supplier<SplitReader<E, SplitT>> splitReaderFactory,
                               Consumer<Collection<String>> splitFinishedHook) {
        this.fetchers = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends PulsarPartitionSplit`
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/reader/PulsarSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<PulsarPartitionSplit> splits) {
        splits.forEach(split -> {
            splitStates.put(split.splitId(), split);
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
```

### BoundedWildcard
Can generalize to `? super PulsarPartitionSplit`
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java
    }

    public PulsarSplitEnumerator(SourceSplitEnumerator.Context<PulsarPartitionSplit> context,
                                 PulsarAdminConfig adminConfig,
                                 PulsarDiscoverer partitionDiscoverer,
```

### BoundedWildcard
Can generalize to `? extends PulsarPartitionSplit`
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java

    private void addPartitionSplitChangeToPendingAssignments(
        Collection<PulsarPartitionSplit> newPartitionSplits) {
        int numReaders = context.currentParallelism();
        for (PulsarPartitionSplit split : newPartitionSplits) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/reader/IcebergSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        for (IcebergFileScanTaskSplit pendingSplit = pendingSplits.poll();
             pendingSplit != null; pendingSplit = pendingSplits.poll()) {
```

### BoundedWildcard
Can generalize to `? extends IcebergFileScanTaskSplit`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/reader/IcebergSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<IcebergFileScanTaskSplit> splits) {
        log.info("Add {} splits to reader", splits.size());
        pendingSplits.addAll(splits);
```

### BoundedWildcard
Can generalize to `? extends IcebergFileScanTaskSplit`
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/AbstractSplitEnumerator.java`
#### Snippet
```java
    protected abstract List<IcebergFileScanTaskSplit> loadNewSplits(Table table);

    private void addPendingSplits(Collection<IcebergFileScanTaskSplit> newSplits) {
        int numReaders = context.currentParallelism();
        for (IcebergFileScanTaskSplit newSplit : newSplits) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/source/MongodbSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        try (MongoCursor<Document> mongoCursor = client.getDatabase(params.getDatabase())
            .getCollection(params.getCollection())
```

### BoundedWildcard
Can generalize to `? extends InfluxDBSourceSplit`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addPendingSplit(Collection<InfluxDBSourceSplit> splits) {
        int readerCount = context.currentParallelism();
        for (InfluxDBSourceSplit split : splits) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxdbSourceReader.java`
#### Snippet
```java
    }

    private void read(InfluxDBSourceSplit split, Collector<SeaTunnelRow> output) {
        QueryResult queryResult = influxdb.query(new Query(split.getQuery(), config.getDatabase()));
        for (QueryResult.Result result : queryResult.getResults()) {
```

### BoundedWildcard
Can generalize to `? extends InfluxDBSourceSplit`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxdbSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<InfluxDBSourceSplit> splits) {
        pendingSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super Delivery`
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/client/QueueingConsumer.java`
#### Snippet
```java
    }

    public QueueingConsumer(Channel channel, int capacity, Handover<Delivery> handover) {
        super(channel);
        this.handover = handover;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/source/CassandraSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        try {
            ResultSet resultSet = session.execute(CassandraClient.createSimpleStatement(cassandraConfig.getCql(), cassandraConfig.getConsistencyLevel()));
```

### BoundedWildcard
Can generalize to `? extends ClickHouseNode`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceReader.java`
#### Snippet
```java
    private final List<ClickhouseSourceSplit> splits;

    ClickhouseSourceReader(List<ClickHouseNode> servers, SourceReader.Context readerContext,
                           SeaTunnelRowType rowTypeInfo, String sql) {
        this.servers = servers;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        if (!splits.isEmpty()) {
            try (ClickHouseResponse response = this.request.query(sql).executeAndWait()) {
```

### BoundedWildcard
Can generalize to `? extends ClickhouseSourceSplit`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<ClickhouseSourceSplit> splits) {
        this.splits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/type/impl/RequiredIndexTypeSerializer.java`
#### Snippet
```java

    @Override
    public void fillType(Map<String, String> indexInner) {
        indexInner.put("_type", type);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/type/impl/RequiredIndexTypeSerializer.java`
#### Snippet
```java

    @Override
    public void fillType(Map<String, String> indexInner) {
        indexInner.put("_type", type);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    }

    private void outputFromScrollResult(ScrollResult scrollResult, List<String> source, Collector<SeaTunnelRow> output) {
        for (Map<String, Object> doc : scrollResult.getDocs()) {
            SeaTunnelRow seaTunnelRow = deserializer.deserialize(new ElasticsearchRecord(doc, source));
```

### BoundedWildcard
Can generalize to `? extends ElasticsearchSourceSplit`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<ElasticsearchSourceSplit> splits) {
        this.splits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/source/SheetsSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        final NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        Sheets service = new Sheets.Builder(httpTransport, JSON_FACTORY, requestInitializer)
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/source/AmazonDynamoDBSourceReader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("magicnumber")
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        ScanResponse scan = dynamoDbClient.scan(ScanRequest.builder()
            .tableName(amazondynamodbSourceOptions.getTable())
```

### BoundedWildcard
Can generalize to `? extends ElasticsearchSourceSplit`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addPendingSplit(Collection<ElasticsearchSourceSplit> splits) {
        int readerCount = context.currentParallelism();
        for (ElasticsearchSourceSplit split : splits) {
```

### BoundedWildcard
Can generalize to `? extends PluginIdentifier`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java

    @Override
    public List<T> getAllPlugins(List<PluginIdentifier> pluginIdentifiers) {
        return pluginIdentifiers.stream()
            .map(this::createPluginInstance).distinct()
```

### BoundedWildcard
Can generalize to `? super ClassLoader`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    public AbstractPluginDiscovery(Path pluginDir,
                                   Config pluginConfig,
                                   BiConsumer<ClassLoader, URL> addURLToClassLoaderConsumer) {
        this.pluginDir = pluginDir;
        this.pluginConfig = pluginConfig;
```

### BoundedWildcard
Can generalize to `? super URL`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    public AbstractPluginDiscovery(Path pluginDir,
                                   Config pluginConfig,
                                   BiConsumer<ClassLoader, URL> addURLToClassLoaderConsumer) {
        this.pluginDir = pluginDir;
        this.pluginConfig = pluginConfig;
```

### BoundedWildcard
Can generalize to `? extends PluginIdentifier`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java

    @Override
    public List<URL> getPluginJarPaths(List<PluginIdentifier> pluginIdentifiers) {
        return pluginIdentifiers.stream()
            .map(this::getPluginJarPath)
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private @Nullable`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkWriterCommitMessage.java`
#### Snippet
```java
public class SparkWriterCommitMessage<T> implements WriterCommitMessage {

    private @Nullable T message;

    SparkWriterCommitMessage(T message) {
```

### MissortedModifiers
Missorted modifiers `private @Nonnull`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataSourceWriter.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    private @Nonnull List<AggregatedCommitInfoT> combineCommitMessage(WriterCommitMessage[] messages) {
        if (sinkAggregatedCommitter == null || messages.length == 0) {
            return Collections.emptyList();
```

### MissortedModifiers
Missorted modifiers `public @Nonnull`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public @Nonnull List<PluginIdentifier> getAllPlugin(PluginType pluginType) throws IOException {
        List<URL> files = FileUtils.searchJarFiles(pluginDir);
        List<PluginIdentifier> plugins = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `public static @Nonnull`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
     * @return the all plugin identifier of the engine with artifactId
     */
    public static @Nonnull Map<PluginIdentifier, String> getAllSupportedPlugins(PluginType pluginType) {
        Config config = loadConnectorPluginConfig();
        Map<PluginIdentifier, String> pluginIdentifiers = new HashMap<>();
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/AsyncOperation.java`
#### Snippet
```java
                    sendResponse(new SeaTunnelEngineException(stackTraceToString(ex)));
                } else {
                    throw e;
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
                disconnect(client);
            } catch (IOException ioe) {
                throw new FTPException("Failed to disconnect", ioe);
            }
        }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `seatunnel-connectors-v2/connector-http/connector-http-jira/src/main/java/org/apache/seatunnel/connectors/seatunnel/jira/source/config/JiraSourceParameter.java`
#### Snippet
```java
public class JiraSourceParameter extends HttpParameter {
    public void buildWithConfig(Config pluginConfig, String accessToken) {
        super.buildWithConfig(pluginConfig);
        // put authorization in headers
        this.headers = this.getHeaders() == null ? new HashMap<>() : this.getHeaders();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `seatunnel-connectors-v2/connector-http/connector-http-wechat/src/main/java/org/apache/seatunnel/connectors/seatunnel/wechat/sink/WeChatSink.java`
#### Snippet
```java
    @Override
    public AbstractSinkWriter<SeaTunnelRow, Void> createWriter(SinkWriter.Context context) {
        return new HttpSinkWriter(seaTunnelRowType, super.httpParameter,
            new WeChatBotMessageSerializationSchema(new WeChatSinkConfig(pluginConfig), seaTunnelRowType));
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `seatunnel-connectors-v2/connector-http/connector-http-lemlist/src/main/java/org/apache/seatunnel/connectors/seatunnel/lemlist/source/config/LemlistSourceParameter.java`
#### Snippet
```java
public class LemlistSourceParameter extends HttpParameter {
    public void buildWithConfig(Config pluginConfig, String accessToken) {
        super.buildWithConfig(pluginConfig);
        // put authorization in headers
        this.headers = this.getHeaders() == null ? new HashMap<>() : this.getHeaders();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `seatunnel-connectors-v2/connector-http/connector-http-myhours/src/main/java/org/apache/seatunnel/connectors/seatunnel/myhours/source/config/MyHoursSourceParameter.java`
#### Snippet
```java
public class MyHoursSourceParameter extends HttpParameter {
    public void buildWithConfig(Config pluginConfig, String accessToken) {
        super.buildWithConfig(pluginConfig);
        // put authorization in headers
        this.headers = this.getHeaders() == null ? new HashMap<>() : this.getHeaders();
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
        try {
            return RetryUtils.retryWithException(() -> {
                return nodeEngine.getMasterAddress().equals(nodeEngine.getThisAddress());
            }, new RetryUtils.RetryMaterial(20, true,
                exception -> exception instanceof NullPointerException && isRunning, 1000));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private void cancelJobPipelines() {
        List<CompletableFuture<Void>> collect = pipelineList.stream().map(pipeline -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                pipeline.cancelPipeline();
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    public void failedTaskOnMemberRemoved(MembershipServiceEvent event) {
        Address lostAddress = event.getMember().getAddress();
        runningJobMasterMap.forEach((aLong, jobMaster) -> {
            jobMaster.getPhysicalPlan().getPipelineList().forEach(subPlan -> {
                makeTasksFailed(subPlan.getCoordinatorVertexList(), lostAddress);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

        List<CompletableFuture<Void>> collect = runningJobInfoIMap.entrySet().stream().map(entry -> {
            return CompletableFuture.runAsync(() -> {
                logger.info(String.format("begin restore job (%s) from master active switch", entry.getKey()));
                restoreJobFromMasterActiveSwitch(entry.getKey(), entry.getValue());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

    public PassiveCompletableFuture<PipelineStatus> initStateFuture() {
        physicalVertexList.stream().forEach(physicalVertex -> {
            addPhysicalVertexCallBack(physicalVertex.initStateFuture());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        });

        coordinatorVertexList.stream().forEach(coordinator -> {
            addPhysicalVertexCallBack(coordinator.initStateFuture());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        failedTaskNum.set(0);

        coordinatorVertexList.forEach(coordinate -> {
            coordinate.reset();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        });

        physicalVertexList.forEach(task -> {
            task.reset();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/ListJobStatusOperation.java`
#### Snippet
```java
        SeaTunnelServer service = getService();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return service.getCoordinatorService().getJobHistoryService().listAllJob();
        });

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/GetJobStatusOperation.java`
#### Snippet
```java
        SeaTunnelServer service = getService();
        CompletableFuture<JobStatus> future = CompletableFuture.supplyAsync(() -> {
            return service.getCoordinatorService().getJobStatus(jobId);
        });

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/GetJobStateOperation.java`
#### Snippet
```java
        SeaTunnelServer service = getService();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return service.getCoordinatorService().getJobHistoryService().getJobStatusAsString(jobId);
        });

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java
    public void start() throws Exception {
        RetryUtils.retryWithException(() -> {
            return checkpointIdMap.putIfAbsent(pipelineId, INITIAL_CHECKPOINT_ID);
        }, new RetryUtils.RetryMaterial(Constant.OPERATION_RETRY_TIME, true,
            exception -> exception instanceof HazelcastInstanceNotActiveException, Constant.OPERATION_RETRY_SLEEP));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
        try {
            RetryUtils.retryWithException(() -> {
                return pipelineOwnedSlotProfiles.equals(ownedSlotProfilesIMap.get(pipelineLocation));
            }, new RetryUtils.RetryMaterial(20, true,
                exception -> exception instanceof NullPointerException && isRunning, 1000));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            jobMaster.setOwnedSlotProfiles(pipeline.getPipelineLocation(), slotProfiles);
            // deploy pipeline
            return CompletableFuture.runAsync(() -> {
                deployPipeline(pipeline, slotProfiles);
            }, jobMaster.getExecutorService());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java

    private void makePipelineFailed(@NonNull SubPlan pipeline, Throwable e) {
        pipeline.getCoordinatorVertexList().forEach(coordinator -> {
            makeTaskFailed(coordinator.getTaskGroupLocation(), e);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        });

        pipeline.getPhysicalVertexList().forEach(task -> {
            makeTaskFailed(task.getTaskGroupLocation(), e);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        if (task.updateTaskState(ExecutionState.SCHEDULED, ExecutionState.DEPLOYING)) {
            // deploy is a time-consuming operation, so we do it async
            return CompletableFuture.runAsync(() -> {
                task.deploy(slotProfile);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java
    private void releaseAllResourceInternal() {
        LOGGER.warning("apply resource not success, release all already applied resource");
        resultSlotProfiles.values().stream().filter(Objects::nonNull).forEach(profile -> {
            resourceManager.releaseResource(jobId, profile);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java
        executorService = ThreadPoolExecutorFactory.createScheduledThreadPoolExecutor(parallelism, "parallel-split-enumerator-executor");
        splitEnumerator.open();
        restoredSplitStateMap.forEach((subtaskId, splits) -> {
            splitEnumerator.addSplitsBack(splits, subtaskId);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        Config kafkaConfig = TypesafeConfigUtils.extractSubConfig(pluginConfig, KAFKA_CONFIG_PREFIX.key(), false);
        Properties kafkaProperties = new Properties();
        kafkaConfig.entrySet().forEach(entry -> {
            kafkaProperties.put(entry.getKey(), entry.getValue().unwrapped());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSource.java`
#### Snippet
```java
        }

        TypesafeConfigUtils.extractSubConfig(config, "kafka.", false).entrySet().forEach(e -> {
            this.metadata.getProperties().put(e.getKey(), String.valueOf(e.getValue().unwrapped()));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
                splitReader,
                errorHandler,
                () -> {
                    fetchers.remove(fetcherId);
                },
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java
        Properties clickhouseProperties = new Properties();
        if (TypesafeConfigUtils.hasSubConfig(config, CLICKHOUSE_PREFIX.key() + ".")) {
            TypesafeConfigUtils.extractSubConfig(config, CLICKHOUSE_PREFIX.key() + ".", false).entrySet().forEach(e -> {
                clickhouseProperties.put(e.getKey(), String.valueOf(e.getValue().unwrapped()));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
        List<Shard> shardList = new ArrayList<>();
        try (ClickHouseResponse response = connection.query(sql).executeAndWait()) {
            response.records().forEach(r -> {
                shardList.add(new Shard(
                        r.getValue(0).asInteger(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/source/AmazonDynamoDBSourceReader.java`
#### Snippet
```java
            .build());
        if (scan.hasItems()) {
            scan.items().forEach(item -> {
                output.collect(seaTunnelRowDeserializer.deserialize(item));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java
            case MAP:
                Map<String, Object> seatunnelMap = new HashMap<>();
                attributeValue.m().forEach((s, attributeValueInfo) -> {
                    seatunnelMap.put(s, convert(((MapType) seaTunnelDataType).getValueType(), attributeValueInfo));
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            throw new IllegalArgumentException("Unsupported plugin type: " + pluginType);
        }
        factories.forEach(plugin -> {
            plugins.add(PluginIdentifier.of("seatunnel", pluginType.getType(), ((Factory) plugin).factoryIdentifier()));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        Config engineConfig = config.getConfig(CollectionConstants.SEATUNNEL_PLUGIN);
        if (engineConfig.hasPath(pluginType.getType())) {
            engineConfig.getConfig(pluginType.getType()).entrySet().forEach(entry -> {
                pluginIdentifiers.put(
                    PluginIdentifier.of(CollectionConstants.SEATUNNEL_PLUGIN, pluginType.getType(), entry.getKey()),
```

## RuleId[ruleID=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/config/TextFileSinkConfig.java`
#### Snippet
```java
import java.util.stream.Collectors;

@Data
public class TextFileSinkConfig extends BaseTextFileConfig implements PartitionConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/config/Neo4jSinkQueryInfo.java`
#### Snippet
```java
import java.util.Map;

@Data
public class Neo4jSinkQueryInfo extends Neo4jQueryInfo {
    private Map<String, Object> queryParamPosition;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
            if (key.startsWith(prefix)) {
                if (keepPrefix) {
                    properties.put(key, value);
                } else {
                    properties.put(key.substring(prefix.length()), value);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/PropertiesUtil.java`
#### Snippet
```java
                    properties.put(key, value);
                } else {
                    properties.put(key.substring(prefix.length()), value);
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/config/MySqlSourceConfigFactory.java`
#### Snippet
```java
        // but it'll cause lose of precise when the value is larger than 2^63,
        // so use "precise" mode to avoid it.
        props.put("bigint.unsigned.handling.mode", "precise");

        if (serverIdRange != null) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        Properties kafkaProperties = new Properties();
        kafkaConfig.entrySet().forEach(entry -> {
            kafkaProperties.put(entry.getKey(), entry.getValue().unwrapped());
        });
        if (pluginConfig.hasPath(ASSIGN_PARTITIONS.key())) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        });
        if (pluginConfig.hasPath(ASSIGN_PARTITIONS.key())) {
            kafkaProperties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "org.apache.seatunnel.connectors.seatunnel.kafka.sink.MessageContentPartitioner");
        }
        kafkaProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
            kafkaProperties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "org.apache.seatunnel.connectors.seatunnel.kafka.sink.MessageContentPartitioner");
        }
        kafkaProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
        kafkaProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        }
        kafkaProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
        kafkaProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        return kafkaProperties;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        kafkaProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
        kafkaProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        return kafkaProperties;
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaTransactionSender.java`
#### Snippet
```java
    private KafkaInternalProducer<K, V> getTransactionProducer(Properties properties, String transactionId) {
        Properties transactionProperties = (Properties) properties.clone();
        transactionProperties.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionId);
        KafkaInternalProducer<K, V> transactionProducer = new KafkaInternalProducer<>(transactionProperties, transactionId);
        transactionProducer.initTransactions();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSource.java`
#### Snippet
```java

        TypesafeConfigUtils.extractSubConfig(config, "kafka.", false).entrySet().forEach(e -> {
            this.metadata.getProperties().put(e.getKey(), String.valueOf(e.getValue().unwrapped()));
        });

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java
        if (TypesafeConfigUtils.hasSubConfig(config, CLICKHOUSE_PREFIX.key() + ".")) {
            TypesafeConfigUtils.extractSubConfig(config, CLICKHOUSE_PREFIX.key() + ".", false).entrySet().forEach(e -> {
                clickhouseProperties.put(e.getKey(), String.valueOf(e.getValue().unwrapped()));
            });
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java

        if (isCredential) {
            clickhouseProperties.put("user", config.getString(USERNAME.key()));
            clickhouseProperties.put("password", config.getString(PASSWORD.key()));
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java
        if (isCredential) {
            clickhouseProperties.put("user", config.getString(USERNAME.key()));
            clickhouseProperties.put("password", config.getString(PASSWORD.key()));
        }

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/transform/Collector.java`
#### Snippet
```java
     * Closes the collector. If any data was buffered, that data will be flushed.
     */
    void close();
}

```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/BaseFlinkSource.java`
#### Snippet
```java
public interface BaseFlinkSource<OUT> extends BaseSource<FlinkEnvironment> {

    OUT getData(FlinkEnvironment env);
}

```

### EmptyMethod
The method is empty
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/util/SchemaUtil.java`
#### Snippet
```java
     * @param json   json
     */
    private static void getOrcSchema(Schema schema, ObjectNode json) {

    }
```

### EmptyMethod
The method is empty
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/util/SchemaUtil.java`
#### Snippet
```java
     * @param json   json
     */
    private static void getParquetSchema(Schema schema, ObjectNode json) {

    }
```

### EmptyMethod
The method is empty
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceSplitReader.java`
#### Snippet
```java
    }

    private void checkNeedStopBinlogReader() {
        // TODO Currently not supported
    }
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializeSchema.java`
#### Snippet
```java
     */
    public interface ValueValidator extends Serializable {
        void validate(SeaTunnelRow rowData, RowKind rowKind) throws Exception;
    }

```

### EmptyMethod
The method is empty
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/AbstractSingleSplitReader.java`
#### Snippet
```java
    }

    protected void restoreState(byte[] restoredState) {
        // default nothing
    }
```

### EmptyMethod
The method and all its derivables are empty
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/AbstractSingleSplitReader.java`
#### Snippet
```java

    @Override
    public void notifyCheckpointComplete(long checkpointId) throws Exception {
        // default nothing
    }
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/splitreader/SplitReader.java`
#### Snippet
```java
     * Wake up the split reader in case the fetcher thread is blocking in {@link #fetch()}.
     */
    void wakeUp();

    /**
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-http/connector-http-myhours/src/main/java/org/apache/seatunnel/connectors/seatunnel/myhours/source/exception/MyHoursConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/exception/InfluxdbConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/exception/IotdbConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java

    @Override
    public Serializer<JdbcSourceSplit> getSplitSerializer() {
        return SeaTunnelSource.super.getSplitSerializer();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/exception/KafkaConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void beginTransaction() throws ProducerFencedException {
        super.beginTransaction();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void commitTransaction() throws ProducerFencedException {
        super.commitTransaction();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

    @Override
    public void abortTransaction() throws ProducerFencedException {
        super.abortTransaction();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java

    @Override
    public Serializer<KuduSourceSplit> getSplitSerializer() {
        return SeaTunnelSource.super.getSplitSerializer();
    }
```

### EmptyMethod
The method is empty
in `seatunnel-connectors-v2/connector-slack/src/main/java/org/apache/seatunnel/connectors/seatunnel/slack/client/SlackClient.java`
#### Snippet
```java
     * Close Conversion
     */
    public void closeMethodClient() {
    }
}
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/exception/SocketConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/exception/TablestoreConnectorErrorCode.java`
#### Snippet
```java

    @Override
    public String getErrorMessage() {
        return SeaTunnelErrorCode.super.getErrorMessage();
    }
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/config/ConfigChecker.java`
#### Snippet
```java
     * @param config given config.
     */
    void checkConfig(Config config) throws ConfigCheckException;

}
```

### EmptyMethod
Method only calls its super
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtension.java`
#### Snippet
```java

    @Override
    public void beforeStart() {
        // TODO Get Config from Node here
        super.beforeStart();
```

### EmptyMethod
The method is empty
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtensionCommon.java`
#### Snippet
```java
    }

    void afterStart() {
        //TODO seaTunnelServer after start in here
    }
```

### EmptyMethod
The method is empty
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtensionCommon.java`
#### Snippet
```java
    }

    void onClusterStateChange(ClusterState ignored) {
        //TODO This is where cluster state changes are handled
    }
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskGroup.java`
#### Snippet
```java
    <T extends Task> T getTask(long taskID);

    void setTasksContext(Map<Long, TaskExecutionContext> taskExecutionContextMap);
}

```

### EmptyMethod
The method is empty
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
    }

    public void cleanJob() {
        // TODO Add some job clean operation
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/NotifyTaskStatusOperation.java`
#### Snippet
```java

    @Override
    public Object getResponse() {
        return super.getResponse();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public DataWriterFactory<InternalRow> createWriterFactory() {
        return super.createWriterFactory();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Expression.java`
#### Snippet
```java
    private final Condition<?> condition;
    private Boolean and = null;
    private Expression next = null;

    Expression(Condition<?> condition) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Expression.java`
#### Snippet
```java
public class Expression {
    private final Condition<?> condition;
    private Boolean and = null;
    private Expression next = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Condition.java`
#### Snippet
```java
    private final Option<T> option;
    private final T expectValue;
    private Boolean and = null;
    private Condition<?> next = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Condition.java`
#### Snippet
```java
    private final T expectValue;
    private Boolean and = null;
    private Condition<?> next = null;

    Condition(Option<T> option, T expectValue) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/args/ServerCommandArgs.java`
#### Snippet
```java
        help = true,
        description = "Show the usage message")
    private boolean help = false;

    public boolean isHelp() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/args/ClientCommandArgs.java`
#### Snippet
```java
    @Parameter(names = {"-l", "--list"},
        description = "list job status")
    private boolean listJob = false;

    public String getClusterName() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/SparkEnvironment.java`
#### Snippet
```java
    private Config config = ConfigFactory.empty();

    private boolean enableHive = false;

    private JobMode jobMode;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/AbstractCommandArgs.java`
#### Snippet
```java
            help = true,
            description = "Show the usage message")
    private boolean help = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/AbstractCommandArgs.java`
#### Snippet
```java
    @Parameter(names = {"-t", "--check"},
            description = "check config")
    private boolean checkConfig = false;

    @Parameter(names = {"-n", "--name"},
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/args/SparkCommandArgs.java`
#### Snippet
```java
        description = "Spark master",
        required = true)
    private String master = null;

    public String getMaster() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/config/Common.java`
#### Snippet
```java
    private static DeployMode MODE;

    private static boolean STARTER = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/IdGenerator.java`
#### Snippet
```java

    private static final long serialVersionUID = 7683323453014131725L;
    private long id = 0;

    public long getNextId() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * If this node is a master node
     */
    private volatile boolean isActive = false;

    private final ExecutorService executorService;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/PartitionTransformSourceFlowLifeCycle.java`
#### Snippet
```java
    private long currentCheckpointId = Long.MAX_VALUE;

    private int alignedBarriersCounter = 0;
    public PartitionTransformSourceFlowLifeCycle(SeaTunnelTask runningTask, CompletableFuture<Void> completableFuture) {
        super(runningTask, completableFuture);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/TaskGroupWithIntermediateQueue.java`
#### Snippet
```java
    }

    private Map<Long, BlockingQueue<Record<?>>> blockingQueueCache = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java

    private final Object lock = new Object();
    boolean started = false;
    AtomicBoolean wait0 = new AtomicBoolean(false);

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/TaskStatistics.java`
#### Snippet
```java
    private final boolean[] subtaskCompleted;

    private int numAcknowledgedSubtasks = 0;

    private SubtaskStatistics latestAckedSubtaskStatistics;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
    private CompletableFuture<Void> scheduleFuture;

    private volatile boolean restore = false;

    private final EngineConfig engineConfig;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java

    @Setter
    private volatile boolean isAllTaskReady = false;

    @SneakyThrows
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
    private final ArrayDeque<CompletedCheckpoint> completedCheckpoints;

    private volatile CompletedCheckpoint latestCompletedCheckpoint = null;

    private final CheckpointConfig coordinatorConfig;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
#### Snippet
```java
public class FlinkWriterState<StateT> implements Serializable {

    private long checkpointId = 0;

    private StateT state;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/ParallelEnumeratorContext.java`
#### Snippet
```java
    protected final Integer parallelism;
    protected final Integer subtaskId;
    protected volatile boolean running = false;

    public ParallelEnumeratorContext(ParallelSource<?, SplitT, ?> parallelSource,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/JdbcSourceConfigFactory.java`
#### Snippet
```java
    protected StartupConfig startupConfig;
    protected StopConfig stopConfig;
    protected boolean includeSchemaChanges = false;
    protected double distributionFactorUpper = 1000.0d;
    protected double distributionFactorLower = 0.05d;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSplitAssigner.java`
#### Snippet
```java
    private final Map<TableId, Offset> tableWatermarks = new HashMap<>();

    private boolean splitAssigned = false;

    private final List<IncrementalSplit> remainingSplits = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotFetchTask.java`
#### Snippet
```java
    private final SnapshotSplit split;

    private volatile boolean taskRunning = false;

    private MySqlSnapshotSplitReadTask snapshotSplitReadTask;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/binlog/MySqlBinlogFetchTask.java`
#### Snippet
```java
public class MySqlBinlogFetchTask implements FetchTask<SourceSplitBase> {
    private final IncrementalSplit split;
    private volatile boolean taskRunning = false;

    public MySqlBinlogFetchTask(IncrementalSplit split) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceReader.java`
#### Snippet
```java
    private final FakeDataGenerator fakeDataGenerator;
    private volatile boolean noMoreSplit;
    private volatile long latestTimestamp = 0;

    public FakeSourceReader(SourceReader.Context context, SeaTunnelSchema schema, FakeConfig fakeConfig) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/utils/HiveMetaStoreProxy.java`
#### Snippet
```java
public class HiveMetaStoreProxy {
    private final HiveMetaStoreClient hiveMetaStoreClient;
    private static volatile HiveMetaStoreProxy INSTANCE = null;

    private HiveMetaStoreProxy(@NonNull String uris) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSource.java`
#### Snippet
```java
    private String confFiles;

    private boolean useKerberos = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private transient E jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private transient E jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;

    private transient ScheduledExecutorService scheduler;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java

    private String transactionPrefix;
    private long lastCheckpointId = 0;

    private final KafkaProduceSender<byte[], byte[]> kafkaProducerSender;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/ConsumerMetadata.java`
#### Snippet
```java

    private String topic;
    private boolean isPattern = false;
    private String bootstrapServers;
    private Properties properties;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/ConsumerMetadata.java`
#### Snippet
```java
    private Properties properties;
    private String consumerGroup;
    private boolean commitOnCheckpoint = false;
    private StartMode startMode = StartMode.GROUP_OFFSETS;
    private Map<TopicPartition, Long> specificStartOffsets;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java
    private final LinkedBlockingQueue<KafkaSourceSplit> pendingPartitionsQueue;

    private volatile boolean running = false;

    KafkaSourceReader(ConsumerMetadata metadata,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/SingleSplitEnumerator.java`
#### Snippet
```java
    protected final SourceSplitEnumerator.Context<SingleSplit> context;
    protected SingleSplit pendingSplit;
    protected volatile boolean assigned = false;

    public SingleSplitEnumerator(SourceSplitEnumerator.Context<SingleSplit> context) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcher.java`
#### Snippet
```java

    private volatile boolean closed;
    private volatile SplitFetcherTask runningTask = null;

    private final ReentrantLock lock = new ReentrantLock();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/topic/TopicPartition.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private int hash = 0;
    /**
     * The topic name of the pulsar. It would be a full topic name, if your don't provide the tenant
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/reader/PulsarSourceReader.java`
#### Snippet
```java
     * Indicating whether the SourceReader will be assigned more splits or not.
     */
    private boolean noMoreSplitsAssignment = false;

    public PulsarSourceReader(SourceReader.Context context,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java
    private boolean noMoreNewPartitionSplits = false;

    private ScheduledThreadPoolExecutor executor = null;
    public PulsarSplitEnumerator(
        SourceSplitEnumerator.Context<PulsarPartitionSplit> context,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java
    // This flag will be marked as true if periodically partition discovery is disabled AND the
    // initializing partition discovery has finished.
    private boolean noMoreNewPartitionSplits = false;

    private ScheduledThreadPoolExecutor executor = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/config/SourceConfig.java`
#### Snippet
```java
    public static final String DEFAULT_PARTITIONS = PARTITION_NUM.defaultValue();
    private String sql;
    private int partitionNum = 0;
    private String splitKey;
    private long lowerBound;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/config/RabbitmqConfig.java`
#### Snippet
```java
    private String exchange = "";

    private boolean forE2ETesting = false;

    public static final String RABBITMQ_SINK_CONFIG_PREFIX = "rabbitmq.properties.";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/config/RabbitmqConfig.java`
#### Snippet
```java
    private String queueName;
    private String routingKey;
    private boolean logFailuresOnly = false;
    private String exchange = "";

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
    private volatile boolean initialize;
    private volatile Exception flushException;
    private int batchRowCount = 0;
    private long batchBytesSize = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
    private volatile Exception flushException;
    private int batchRowCount = 0;
    private long batchBytesSize = 0;

    private Integer batchIntervalMs;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/statemachine/SeaTunnelTaskState.java`
#### Snippet
```java
 * ... -> FAILED
 */
public enum SeaTunnelTaskState implements Serializable {
    CREATED,
    INIT,
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/ExecutionState.java`
#### Snippet
```java
 * states.
 */
public enum ExecutionState implements Serializable {
    CREATED,

```

### RedundantImplements
Redundant interface declaration `DataSourceV2`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkSink.java`
#### Snippet
```java

public class SparkSink<StateT, CommitInfoT, AggregatedCommitInfoT> implements WriteSupport,
    StreamWriteSupport, DataSourceV2 {

    private volatile SeaTunnelSink<SeaTunnelRow, StateT, CommitInfoT, AggregatedCommitInfoT> sink;
```

### RedundantImplements
Redundant interface declaration `DataSourceV2`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/SeaTunnelSourceSupport.java`
#### Snippet
```java
import java.util.Optional;

public class SeaTunnelSourceSupport implements DataSourceV2, ReadSupport, MicroBatchReadSupport, DataSourceRegister {
    private static final Logger LOG = LoggerFactory.getLogger(SeaTunnelSourceSupport.class);
    public static final String SEA_TUNNEL_SOURCE_NAME = "SeaTunnelSource";
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/config/SaveMode.java`
#### Snippet
```java
import java.util.Locale;

public enum SaveMode implements Serializable {
    APPEND(),
    OVERWRITE(),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/WriteStrategy.java`
#### Snippet
```java
import java.util.Map;

public interface WriteStrategy extends Transaction, Serializable {
    /**
     * init hadoop conf
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/FileSystemType.java`
#### Snippet
```java
import java.io.Serializable;

public enum FileSystemType implements Serializable {
    HDFS("HdfsFile"),
    LOCAL("LocalFile"),
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/FileFormat.java`
#### Snippet
```java
import java.io.Serializable;

public enum FileFormat implements Serializable {
    CSV("csv") {
        @Override
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
                }

                if (e instanceof StarRocksStreamLoadFailedException && ((StarRocksStreamLoadFailedException) e).needReCreateLabel()) {
                    String newLabel = createBatchLabel();
                    log.warn(String.format("Batch label changed from [%s] to [%s]", tuple.getLabel(), newLabel));
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer stringBuffer` may be declared as 'StringBuilder'
in `seatunnel-connectors-v2/connector-http/connector-http-wechat/src/main/java/org/apache/seatunnel/connectors/seatunnel/wechat/sink/WeChatBotMessageSerializationSchema.java`
#### Snippet
```java
    @Override
    public byte[] serialize(SeaTunnelRow row) {
        StringBuffer stringBuffer = new StringBuffer();
        int totalFields = rowType.getTotalFields();
        for (int i = 0; i < totalFields; i++) {
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadFailedException.java`
#### Snippet
```java

    private final Map<String, Object> response;
    private boolean reCreateLabel;

    public StarRocksStreamLoadFailedException(String message, Map<String, Object> response) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeatunnelBaseClassLoader.java`
#### Snippet
```java

    protected SeatunnelBaseClassLoader(List<URL> urls) {
        this(urls.toArray(new URL[0]), SeatunnelBaseClassLoader.class.getClassLoader());
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeatunnelChildFirstClassLoader.java`
#### Snippet
```java

    public SeatunnelChildFirstClassLoader(List<URL> urls, String[] alwaysParentFirstPatterns) {
        this(urls.toArray(new URL[0]),
            SeatunnelChildFirstClassLoader.class.getClassLoader(),
            alwaysParentFirstPatterns,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
        try {
            CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(
                collect.toArray(new CompletableFuture[0]));
            voidCompletableFuture.join();
        } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
        try {
            CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(
                collect.toArray(new CompletableFuture[0]));
            voidCompletableFuture.get();
        } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
            cycle.init();
        }
        CompletableFuture.allOf(flowFutures.toArray(new CompletableFuture[0])).whenComplete((s, e) -> closeCalled = true);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetJobStatusTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetJobStateTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/CancelJobTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/ListJobStatusTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/PrintMessageTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/SubmitJobTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[]{};
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/WaitForJobCompleteTask.java`
#### Snippet
```java
    @Override
    public Object[] getParameters() {
        return new Object[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
        WorkerProfile workerProfile = new WorkerProfile(nodeEngine.getThisAddress());
        workerProfile.setProfile(getNodeResource());
        workerProfile.setAssignedSlots(assignedSlots.values().toArray(new SlotProfile[0]));
        workerProfile.setUnassignedSlots(unassignedSlots.values().toArray(new SlotProfile[0]));
        workerProfile.setUnassignedResource(unassignedResource.get());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
        workerProfile.setProfile(getNodeResource());
        workerProfile.setAssignedSlots(assignedSlots.values().toArray(new SlotProfile[0]));
        workerProfile.setUnassignedSlots(unassignedSlots.values().toArray(new SlotProfile[0]));
        workerProfile.setUnassignedResource(unassignedResource.get());
        return workerProfile;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                deployCoordinatorFuture.addAll(deployTaskFuture);
                CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(
                    deployCoordinatorFuture.toArray(new CompletableFuture[0]));
                voidCompletableFuture.get();
                if (!pipeline.updatePipelineState(PipelineStatus.DEPLOYING, PipelineStatus.RUNNING)) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            try {
                CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(
                    collect.toArray(new CompletableFuture[0]));
                voidCompletableFuture.get();
                physicalPlan.updateJobState(JobStatus.SCHEDULED, JobStatus.RUNNING);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
            futures.add(releaseResource(jobId, profile));
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).whenComplete((r, e) -> {
            if (e != null) {
                completableFuture.completeExceptionally(e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java

    private <T> CompletableFuture<T> getAllOfFuture(List<CompletableFuture<T>> allRequestFuture) {
        return (CompletableFuture<T>) CompletableFuture.allOf(allRequestFuture.toArray(new CompletableFuture[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                switch (elementType.getSqlType()) {
                    case STRING:
                        return objectArrayList.toArray(new String[0]);
                    case BOOLEAN:
                        return objectArrayList.toArray(new Boolean[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new String[0]);
                    case BOOLEAN:
                        return objectArrayList.toArray(new Boolean[0]);
                    case TINYINT:
                        return objectArrayList.toArray(new Byte[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Boolean[0]);
                    case TINYINT:
                        return objectArrayList.toArray(new Byte[0]);
                    case SMALLINT:
                        return objectArrayList.toArray(new Short[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Byte[0]);
                    case SMALLINT:
                        return objectArrayList.toArray(new Short[0]);
                    case INT:
                        return objectArrayList.toArray(new Integer[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Short[0]);
                    case INT:
                        return objectArrayList.toArray(new Integer[0]);
                    case BIGINT:
                        return objectArrayList.toArray(new Long[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Integer[0]);
                    case BIGINT:
                        return objectArrayList.toArray(new Long[0]);
                    case FLOAT:
                        return objectArrayList.toArray(new Float[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Long[0]);
                    case FLOAT:
                        return objectArrayList.toArray(new Float[0]);
                    case DOUBLE:
                        return objectArrayList.toArray(new Double[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
                        return objectArrayList.toArray(new Float[0]);
                    case DOUBLE:
                        return objectArrayList.toArray(new Double[0]);
                    default:
                        String errorMsg = String.format("SeaTunnel array not support this data type [%s]", elementType.getSqlType());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-transforms/seatunnel-transforms-flink/seatunnel-transform-flink-split/src/main/java/org/apache/seatunnel/flink/transform/Split.java`
#### Snippet
```java
            types[i] = Types.STRING();
        }
        rowTypeInfo = new RowTypeInfo(types, fields.toArray(new String[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[]{}, new Object[]{});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[]{}, new Object[]{});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializeSchema.java`
#### Snippet
```java
        private SeaTunnelRowType physicalRowType;
        private SeaTunnelRowType resultTypeInfo;
        private MetadataConverter[] metadataConverters = new MetadataConverter[0];
        private ValueValidator validator = (rowData, rowKind) -> {
        };
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
            types.add(type);
        });
        MessageType seaTunnelRow = Types.buildMessage().addFields(types.toArray(new Type[0])).named("SeaTunnelRecord");
        return schemaConverter.convert(seaTunnelRow);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java
            LOG.warn("get row type info exception", e);
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java
            LOG.warn("get row type info exception", e);
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
        } else {
            statementExecutorFactory = () -> createUpsertBufferedExecutor(
                dialect, table, seaTunnelRowType, primaryKeys.toArray(new String[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
                    "Kudu", PluginType.SOURCE, ExceptionUtils.getMessage(e)));
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
                    "Kudu", PluginType.SOURCE, ExceptionUtils.getMessage(e)));
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]), seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            keyFieldDataTypeArr[i] = seaTunnelRowType.getFieldType(rowFieldIndex);
        }
        SeaTunnelRowType keyType = new SeaTunnelRowType(keyFieldNames.toArray(new String[0]), keyFieldDataTypeArr);
        SerializationSchema keySerializationSchema = createSerializationSchema(keyType);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java
            fieldTypes.add(mapping(field.type()));
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]),
            fieldTypes.toArray(new SeaTunnelDataType[0]));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(fieldNames.toArray(new String[0]),
            fieldTypes.toArray(new SeaTunnelDataType[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/IcebergSource.java`
#### Snippet
```java
        }
        SeaTunnelRowType originalRowType = new SeaTunnelRowType(
            columnNames.toArray(new String[0]),
            columnDataTypes.toArray(new SeaTunnelDataType[0]));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/IcebergSource.java`
#### Snippet
```java
        SeaTunnelRowType originalRowType = new SeaTunnelRowType(
            columnNames.toArray(new String[0]),
            columnDataTypes.toArray(new SeaTunnelDataType[0]));

        CheckResult checkResult = CheckConfigUtil.checkAllExists(pluginConfig, CommonConfig.KEY_FIELDS.key());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                    typeClass = convert(((DefaultListType) metaData.get(i).getType()).getElementType()).getTypeClass();
                    if (String.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, String.class)).toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Byte.class)).toArray(new Byte[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, String.class)).toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Byte.class)).toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Short.class)).toArray(new Short[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Byte.class)).toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Short.class)).toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Integer.class)).toArray(new Integer[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Short.class)).toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Integer.class)).toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Long.class)).toArray(new Long[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Integer.class)).toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Long.class)).toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Float.class)).toArray(new Float[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Long.class)).toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Float.class)).toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Double.class)).toArray(new Double[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Float.class)).toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Double.class)).toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Boolean.class)).toArray(new Boolean[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getList(i, Double.class)).toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getList(i, Boolean.class)).toArray(new Boolean[0]);
                    } else {
                        throw new CassandraConnectorException(CommonErrorCode.UNSUPPORTED_DATA_TYPE,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                    typeClass = convert(((DefaultSetType) metaData.get(i).getType()).getElementType()).getTypeClass();
                    if (String.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, String.class)).toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Byte.class)).toArray(new Byte[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, String.class)).toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Byte.class)).toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Short.class)).toArray(new Short[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Byte.class)).toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Short.class)).toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Integer.class)).toArray(new Integer[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Short.class)).toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Integer.class)).toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Long.class)).toArray(new Long[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Integer.class)).toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Long.class)).toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Float.class)).toArray(new Float[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Long.class)).toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Float.class)).toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Double.class)).toArray(new Double[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Float.class)).toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Double.class)).toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Boolean.class)).toArray(new Boolean[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] = Objects.requireNonNull(row.getSet(i, Double.class)).toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] = Objects.requireNonNull(row.getSet(i, Boolean.class)).toArray(new Boolean[0]);
                    } else {
                        throw new CassandraConnectorException(CommonErrorCode.UNSUPPORTED_DATA_TYPE,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSource.java`
#### Snippet
```java
                fieldTypes[i] = seaTunnelDataType;
            }
            rowTypeInfo = new SeaTunnelRowType(source.toArray(new String[0]), fieldTypes);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FilterFieldTransform.java`
#### Snippet
```java
            throw new IllegalArgumentException("The configuration missing key: " + KEY_FIELDS);
        }
        this.fields = pluginConfig.getStringList(KEY_FIELDS.key()).toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/SplitTransform.java`
#### Snippet
```java
        separator = pluginConfig.getString(KEY_SEPARATOR.key());
        splitField = pluginConfig.getString(KEY_SPLIT_FIELD.key());
        outputFields = pluginConfig.getStringList(KEY_OUTPUT_FIELDS.key()).toArray(new String[0]);
        emptySplits = new String[outputFields.length];
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        List<URL> files = FileUtils.searchJarFiles(this.pluginDir);
        Map<PluginType, LinkedHashMap<PluginIdentifier, OptionRule>> plugins = new HashMap<>();
        List<Factory> factories = FactoryUtil.discoverFactories(new URLClassLoader((URL[]) files.toArray(new URL[0])));

        factories.forEach(plugin -> {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        List factories;
        if (pluginType.equals(PluginType.SOURCE)) {
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableSourceFactory.class);
        } else if (pluginType.equals(PluginType.SINK)) {
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableSinkFactory.class);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableSourceFactory.class);
        } else if (pluginType.equals(PluginType.SINK)) {
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableSinkFactory.class);
        } else if (pluginType.equals(PluginType.TRANSFORM)) {
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableTransformFactory.class);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableSinkFactory.class);
        } else if (pluginType.equals(PluginType.TRANSFORM)) {
            factories = FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])), TableTransformFactory.class);
        } else {
            throw new IllegalArgumentException("Unsupported plugin type: " + pluginType);
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/RunnableWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface RunnableWithException {

    void run() throws Exception;
```

### NonExceptionNameEndsWithException
Non-exception class name `FunctionWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/FunctionWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface FunctionWithException<T, R, E extends Throwable>  {
    /**
     * Applies this function to the given argument.
```

### NonExceptionNameEndsWithException
Non-exception class name `ConsumerWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/ConsumerWithException.java`
#### Snippet
```java

@FunctionalInterface
public interface ConsumerWithException<T>  {
    /**
     * Performs this operation on the given argument.
```

### NonExceptionNameEndsWithException
Non-exception class name `SupplierWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/SupplierWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface SupplierWithException<R, E extends Throwable> {

    /**
```

## RuleId[ruleID=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/SparkEnvironment.java`
#### Snippet
```java
    }

    public static <T extends Object> T sinkProcess(SparkEnvironment environment, BaseSparkSink<T> sink, Dataset<Row> ds) {
        Dataset<Row> fromDs;
        Config config = sink.getConfig();
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `hazelcastClient != null` is always `true`
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java

    public void shutdown() {
        if (hazelcastClient != null) {
            hazelcastClient.shutdown();
        }
```

### ConstantValue
Condition `x != null` is always `true`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
            });
            return future;
        }).filter(x -> x != null).collect(Collectors.toList());

        try {
```

### ConstantValue
Value `makeJobEndWhenPipelineEnded` is always 'true'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
                        LOGGER.info(
                            String.format("cancel job %s because makeJobEndWhenPipelineEnded is %s", jobFullName,
                                makeJobEndWhenPipelineEnded));
                        cancelJob();
                    }
```

### ConstantValue
Condition `getFileStatus(client, file) != null` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
    private boolean exists(FTPClient client, Path file) throws IOException {
        try {
            return getFileStatus(client, file) != null;
        } catch (FileNotFoundException fnfe) {
            return false;
```

### ConstantValue
Condition `created` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
                String parentDir = parent.toUri().getPath();
                client.changeWorkingDirectory(parentDir);
                created = created && client.makeDirectory(pathName);
            }
        } else if (isFile(client, absolute)) {
```

### ConstantValue
Condition `dirEntries != null` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        }
        FileStatus[] dirEntries = listStatus(client, absolute);
        if (dirEntries != null && dirEntries.length > 0 && !recursive) {
            throw new IOException("Directory: " + file + " is not empty.");
        }
```

### ConstantValue
Condition `dirEntries != null` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
            throw new IOException("Directory: " + file + " is not empty.");
        }
        if (dirEntries != null) {
            for (int i = 0; i < dirEntries.length; i++) {
                delete(client, new Path(absolute, dirEntries[i].getPath()), recursive);
```

### ConstantValue
Value `recursive` is always 'true'
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
        if (dirEntries != null) {
            for (int i = 0; i < dirEntries.length; i++) {
                delete(client, new Path(absolute, dirEntries[i].getPath()), recursive);
            }
        }
```

### ConstantValue
Value `channel` is always 'null'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
                synchronized (this) {
                    --liveConnectionCount;
                    con2infoMap.remove(channel);
                }
            }
```

### ConstantValue
Condition `cons != null` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        this.maxConnection = 0;
        Set<ChannelSftp> cons = con2infoMap.keySet();
        if (cons != null && cons.size() > 0) {
            // make a copy since we need to modify the underlying Map
            Set<ChannelSftp> copy = new HashSet<ChannelSftp>(cons);
```

### ConstantValue
Condition `created` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### ConstantValue
Condition `created & succeeded` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### ConstantValue
Condition `succeeded` is always `true` when reached
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### ConstantValue
Condition `dirEntries != null` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            boolean status = true;
            FileStatus[] dirEntries = listStatus(channel, absolute);
            if (dirEntries != null && dirEntries.length > 0) {
                if (!recursive) {
                    throw new IOException(String.format(E_DIR_NOTEMPTY, file));
```

### ConstantValue
Value `recursive` is always 'true'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                for (int i = 0; i < dirEntries.length; ++i) {
                    delete(channel, new Path(absolute, dirEntries[i].getPath()),
                            recursive);
                }
            }
```

### ConstantValue
Condition `statementExecutor != null` is always `true`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
            executeBatch();
        }
        if (statementExecutor != null) {
            statementExecutor.closeStatements();
        }
```

### ConstantValue
Condition `fieldNames != null` is always `true`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
    public static IndexSerializer getIndexSerializer(String index, SeaTunnelRowType seaTunnelRowType) {
        List<String> fieldNames = RegexUtils.extractDatas(index, "\\$\\{(.*?)\\}");
        if (fieldNames != null && fieldNames.size() > 0) {
            return new VariableIndexSerializer(seaTunnelRowType, index, fieldNames);
        } else {
```

### ConstantValue
Condition `bytes == null` is always `false`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
            case BYTES:
                byte[] bytes = (byte[]) value;
                if (bytes == null) {
                    return null;
                }
```

### ConstantValue
Condition `array == null` is always `false`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                ArrayType arrayType = (ArrayType) dataType;
                Object[] array = (Object[]) value;
                if (array == null) {
                    return null;
                }
```

### ConstantValue
Condition `row == null` is always `false`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                SeaTunnelRowType rowType = (SeaTunnelRowType) dataType;
                SeaTunnelRow row = (SeaTunnelRow) value;
                if (row == null) {
                    return null;
                }
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/config/FlinkCommon.java`
#### Snippet
```java
    public static BiConsumer<ClassLoader, URL> ADD_URL_TO_CLASSLOADER = (classLoader, url) -> {
        if (classLoader.getClass().getName().endsWith("SafetyNetWrapperClassLoader")) {
            URLClassLoader c = (URLClassLoader) ReflectionUtils.getField(classLoader, "inner").get();
            ReflectionUtils.invoke(c, "addURL", url);
        } else if (classLoader instanceof URLClassLoader) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java
        this.checkpointCommitInfoMap = new ConcurrentHashMap<>();
        this.completableFuture = new CompletableFuture<>();
        this.aggregatedCommitInfoSerializer = sink.getSink().getAggregatedCommitInfoSerializer().get();
        LOGGER.info("starting seatunnel sink aggregated committer task, sink name: " + sink.getName());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/batch/ParallelBatchPartitionReader.java`
#### Snippet
```java
    public InternalRow get() {
        try {
            return handover.pollNext().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Optional<Object> producerIdAndEpoch = ReflectionUtils.getField(transactionManager,
                PRODUCER_ID_AND_EPOCH_FIELD_NAME);
        return (short) ReflectionUtils.getField(producerIdAndEpoch.get(), "epoch").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Optional<Object> producerIdAndEpoch = ReflectionUtils.getField(transactionManager,
                PRODUCER_ID_AND_EPOCH_FIELD_NAME);
        return (short) ReflectionUtils.getField(producerIdAndEpoch.get(), "epoch").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Object transactionManager = getTransactionManager();
        Object producerIdAndEpoch = ReflectionUtils.getField(transactionManager,
                PRODUCER_ID_AND_EPOCH_FIELD_NAME).get();
        return (long) ReflectionUtils.getField(producerIdAndEpoch, "producerId").get();
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Object producerIdAndEpoch = ReflectionUtils.getField(transactionManager,
                PRODUCER_ID_AND_EPOCH_FIELD_NAME).get();
        return (long) ReflectionUtils.getField(producerIdAndEpoch, "producerId").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
            Object topicPartitionBookkeeper =
                    ReflectionUtils.getField(transactionManager, transactionManager.getClass(),
                            "topicPartitionBookkeeper").get();

            transitionTransactionManagerStateTo(transactionManager, "INITIALIZING");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/shard/Shard.java`
#### Snippet
```java
    public String getJdbcUrl() {
        return "jdbc:clickhouse://" + node.getAddress().getHostName()
                + ":" + node.getAddress().getPort() + "/" + node.getDatabase().get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
        shardLocalDataPaths = shardRouter.getShards().values().stream()
                .collect(Collectors.toMap(Function.identity(), shard -> {
                    ClickhouseTable shardTable = proxy.getClickhouseTable(shard.getNode().getDatabase().get(),
                            clickhouseTable.getLocalTableName());
                    return shardTable.getDataPaths();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/flink/FlinkAbstractPluginDiscovery.java`
#### Snippet
```java
        super(pluginSubDir, (classLoader, url) -> {
            if (classLoader.getClass().getName().endsWith("SafetyNetWrapperClassLoader")) {
                URLClassLoader c = (URLClassLoader) ReflectionUtils.getField(classLoader, "inner").get();
                ReflectionUtils.invoke(c, "addURL", url);
            } else if (classLoader instanceof URLClassLoader) {
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        for (Iterator<String> fieldNamesIt = Arrays.stream(rowType.getFieldNames()).iterator();
             fieldNamesIt.hasNext(); ) {
            sql.append("MAX(" + fieldNamesIt.next() + ")");
            if (fieldNamesIt.hasNext()) {
                sql.append(" , ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `seatunnel-connectors-v2/connector-http/connector-http-wechat/src/main/java/org/apache/seatunnel/connectors/seatunnel/wechat/sink/WeChatBotMessageSerializationSchema.java`
#### Snippet
```java
        int totalFields = rowType.getTotalFields();
        for (int i = 0; i < totalFields; i++) {
            stringBuffer.append(rowType.getFieldName(i) + ": " + row.getField(i) + "\\n");
        }
        if (totalFields > 0) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java

        for (Object field : fields) {
            stringBuffer.append(field.toString() + ",");
        }
        stringBuffer.deleteCharAt(fields.length - 1);
```

## RuleId[ruleID=IOResource]
### IOResource
'StringDeserializer' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java
                    try {
                        Set<TopicPartition> partitions = Sets.newHashSet(sourceSplit.getTopicPartition());
                        StringDeserializer stringDeserializer = new StringDeserializer();
                        stringDeserializer.configure(Maps.fromProperties(this.metadata.getProperties()), false);
                        consumer.assign(partitions);
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        sql.append(" FROM ");
        sql.append(quotedTableIdString(tableId));
        if (condition.isPresent()) {
            sql.append(" WHERE ").append(condition.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        sql.append(projection).append(" FROM ");
        sql.append(quotedTableIdString(tableId));
        if (condition.isPresent()) {
            sql.append(" WHERE ").append(condition.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
            sql.append(" WHERE ").append(condition.get());
        }
        if (orderBy.isPresent()) {
            sql.append(" ORDER BY ").append(orderBy.get());
        }
```

## RuleId[ruleID=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
                break;
        }
        topicPartitionOffsets.entrySet().forEach(entry -> {
            if (pendingSplit.containsKey(entry.getKey())) {
                pendingSplit.get(entry.getKey()).setStartOffset(entry.getValue());
```

### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
        }

        pendingSplit.entrySet().forEach(s -> {
            if (!assignedSplit.containsKey(s.getKey())) {
                readySplit.get(getSplitOwner(s.getKey(), context.currentParallelism()))
```

## RuleId[ruleID=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/util/FileSystemUtils.java`
#### Snippet
```java
        Path fileName = new Path(filePath);
        FileStatus[] status = fileSystem.listStatus(fileName);
        if (status != null && status.length > 0) {
            for (FileStatus fileStatus : status) {
                if (fileStatus.isDirectory()) {
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `maxParallelism` may be 'static'
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/job/JobExecutionEnvironment.java`
#### Snippet
```java
    private final JobConfig jobConfig;

    private final int maxParallelism = 1;

    private final List<Action> actions = new ArrayList<>();
```

### FieldMayBeStatic
Field `delimiter` may be 'static'
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java
    private final SingleSplitReaderContext context;
    private Socket socket;
    private final String delimiter = "\n";

    SocketSourceReader(SocketSourceParameter parameter, SingleSplitReaderContext context) {
```

### FieldMayBeStatic
Field `usesCorrelationId` may be 'static'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java
    protected final SourceReader.Context context;
    protected transient Channel channel;
    private final boolean usesCorrelationId = true;
    protected transient boolean autoAck;

```

### FieldMayBeStatic
Field `nullDefault` may be 'static'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/impl/VariableIndexSerializer.java`
#### Snippet
```java
    private final Map<String, Integer> fieldIndexMap;

    private final String nullDefault = "null";

    public VariableIndexSerializer(SeaTunnelRowType seaTunnelRowType, String index, List<String> fieldNames) {
```

### FieldMayBeStatic
Field `pollNextWaitTime` may be 'static'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    boolean noMoreSplit;

    private final long pollNextWaitTime = 1000L;

    public ElasticsearchSourceReader(SourceReader.Context context, Config pluginConfig, SeaTunnelRowType rowTypeInfo) {
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SinkCommonOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/sink/SinkCommonOptions.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SinkCommonOptions {

    public static final Option<String> SOURCE_TABLE_NAME =
```

### UtilityClassWithoutPrivateConstructor
Class `EnvOptionRule` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/env/EnvOptionRule.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.util.OptionRule;

public class EnvOptionRule {

    public static OptionRule getEnvOptionRules() {
```

### UtilityClassWithoutPrivateConstructor
Class `EnvCommonOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/env/EnvCommonOptions.java`
#### Snippet
```java
import java.util.Map;

public class EnvCommonOptions {
    public static final Option<Integer> PARALLELISM =
        Options.key("parallelism")
```

### UtilityClassWithoutPrivateConstructor
Class `SourceCommonOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/source/SourceCommonOptions.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SourceCommonOptions {

    public static final Option<String> RESULT_TABLE_NAME =
```

### UtilityClassWithoutPrivateConstructor
Class `TransformCommonOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/transform/TransformCommonOptions.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class TransformCommonOptions {
    public static final Option<String> RESULT_TABLE_NAME =
        Options.key("result_table_name")
```

### UtilityClassWithoutPrivateConstructor
Class `Options` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/Options.java`
#### Snippet
```java
import java.util.Map;

public class Options {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FactoryUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/FactoryUtil.java`
#### Snippet
```java
 * Use SPI to create {@link TableSourceFactory}, {@link TableSinkFactory} and {@link CatalogFactory}.
 */
public final class FactoryUtil {

    private static final Logger LOG = LoggerFactory.getLogger(FactoryUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
import java.util.Map;

public class ConfigUtil {
    private static final JavaPropsMapper PROPERTIES_MAPPER = new JavaPropsMapper();
    private static final ObjectMapper JACKSON_MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelServer` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/SeaTunnelServer.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.seatunnel.command.ServerCommandBuilder;

public class SeaTunnelServer {
    public static void main(String[] args) throws CommandException {
        ServerCommandArgs serverCommandArgs = CommandLineUtils.parseSeaTunnelServerArgs(args);
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelClient` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/SeaTunnelClient.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.seatunnel.command.ClientCommandBuilder;

public class SeaTunnelClient {
    public static void main(String[] args) throws CommandException {
        ClientCommandArgs clientCommandArgs = CommandLineUtils.parseSeaTunnelClientArgs(args);
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelConstant` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/constant/SeaTunnelConstant.java`
#### Snippet
```java
package org.apache.seatunnel.core.starter.seatunnel.constant;

public class SeaTunnelConstant {
    public static final int USAGE_EXIT_CODE = 234;
}
```

### UtilityClassWithoutPrivateConstructor
Class `Seatunnel` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/Seatunnel.java`
#### Snippet
```java

@Slf4j
public class Seatunnel {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/constants/Constants.java`
#### Snippet
```java
package org.apache.seatunnel.core.starter.constants;

public class Constants {
    public static final int USAGE_EXIT_CODE = 234;
}
```

### UtilityClassWithoutPrivateConstructor
Class `SeatunnelFlink` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/SeatunnelFlink.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeatunnelFlink {

    public static void main(String[] args) throws CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `StarterConstant` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/config/StarterConstant.java`
#### Snippet
```java
package org.apache.seatunnel.core.starter.flink.config;

public class StarterConstant {

    public static final String SHELL_NAME = "start-seatunnel-flink-connector-v2.sh";
```

### UtilityClassWithoutPrivateConstructor
Class `FlinkCommon` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/config/FlinkCommon.java`
#### Snippet
```java
import java.util.function.BiConsumer;

public class FlinkCommon {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SeatunnelSpark` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SeatunnelSpark.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeatunnelSpark {

    public static void main(String[] args) throws CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `StarterConstant` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/config/StarterConstant.java`
#### Snippet
```java
package org.apache.seatunnel.core.starter.spark.config;

public class StarterConstant {

    public static final String SHELL_NAME = "start-seatunnel-spark-connector-v2.sh";
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/ReflectionUtils.java`
#### Snippet
```java
import java.util.Optional;

public class ReflectionUtils {

    public static Optional<Method> getDeclaredMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
```

### UtilityClassWithoutPrivateConstructor
Class `TimeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/TimeUtils.java`
#### Snippet
```java
import java.util.Map;

public class TimeUtils {
    private static final Map<Formatter, DateTimeFormatter> FORMATTER_MAP = new HashMap<Formatter, DateTimeFormatter>();

```

### UtilityClassWithoutPrivateConstructor
Class `DateUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/DateUtils.java`
#### Snippet
```java
import java.util.Map;

public class DateUtils {
    private static final Map<Formatter, DateTimeFormatter> FORMATTER_MAP = new HashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `SerializationUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/SerializationUtils.java`
#### Snippet
```java
import java.io.Serializable;

public class SerializationUtils {

    public static String objectToString(Serializable obj) {
```

### UtilityClassWithoutPrivateConstructor
Class `DateTimeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/DateTimeUtils.java`
#### Snippet
```java
import java.util.Map;

public class DateTimeUtils {

    private static final Map<Formatter, DateTimeFormatter> FORMATTER_MAP = new HashMap<Formatter, DateTimeFormatter>();
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/constants/CollectionConstants.java`
#### Snippet
```java
package org.apache.seatunnel.common.constants;

public class CollectionConstants {

    public static final String PLUGIN_NAME = "plugin_name";
```

### UtilityClassWithoutPrivateConstructor
Class `RetryUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/RetryUtils.java`
#### Snippet
```java

@Slf4j
public class RetryUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java

@Slf4j
public class FileUtils {

    public static List<URL> searchJarFiles(@NonNull Path directory) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/Constant.java`
#### Snippet
```java
package org.apache.seatunnel.engine.common;

public class Constant {
    public static final String SEATUNNEL_SERVICE_NAME = "st:impl:seaTunnelServer";

```

### UtilityClassWithoutPrivateConstructor
Class `ServerConfigOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/server/ServerConfigOptions.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class ServerConfigOptions {

    public static final Option<Integer> BACKUP_COUNT = Options.key("backup-count").intType().defaultValue(1).withDescription("The number of backup copies of each partition.");
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelFactoryIdConstant` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/serializeable/SeaTunnelFactoryIdConstant.java`
#### Snippet
```java
 * mechanism.
 */
public final class SeaTunnelFactoryIdConstant {
    /**
     * Name of the system property that specifies SeaTunnelEngine's data serialization factory ID.
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelServerStarter` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServerStarter.java`
#### Snippet
```java
import lombok.NonNull;

public class SeaTunnelServerStarter {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `PlanUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PlanUtils.java`
#### Snippet
```java
import java.util.concurrent.ExecutorService;

public class PlanUtils {

    public static Tuple2<PhysicalPlan, Map<Integer, CheckpointPlan>> fromLogicalDAG(@NonNull LogicalDag logicalDag,
```

### UtilityClassWithoutPrivateConstructor
Class `StorageConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/constants/StorageConstants.java`
#### Snippet
```java
package org.apache.seatunnel.engine.checkpoint.storage.constants;

public class StorageConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `HdfsConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsConstants.java`
#### Snippet
```java
package org.apache.seatunnel.engine.checkpoint.storage.hdfs;

public class HdfsConstants {

    public static final String HDFS_DEF_FS_NAME = "fs.defaultFS";
```

### UtilityClassWithoutPrivateConstructor
Class `TimeFormat` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/TimeFormat.java`
#### Snippet
```java
import java.time.temporal.ChronoField;

public class TimeFormat {
    private static final int MAX_TIME_PRECISION = 9;
    public static final DateTimeFormatter TIME_FORMAT =
```

### UtilityClassWithoutPrivateConstructor
Class `JsonFormatOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonFormatOptions.java`
#### Snippet
```java
import java.util.Map;

public class JsonFormatOptions {

    public static final String FAIL_ON_MISSING_FIELD = "fail_on_missing_field";
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelEngineExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-engine-examples/src/main/java/org/apache/seatunnel/example/engine/SeaTunnelEngineExample.java`
#### Snippet
```java
import java.nio.file.Paths;

public class SeaTunnelEngineExample {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException, CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelEngineServerExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-engine-examples/src/main/java/org/apache/seatunnel/example/engine/SeaTunnelEngineServerExample.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.seatunnel.command.ServerCommandBuilder;

public class SeaTunnelEngineServerExample {
    public static void main(String[] args) throws CommandException {
        ServerCommandArgs serverCommandArgs = new ServerCommandArgs();
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelApiExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-spark-connector-v2-example/src/main/java/org/apache/seatunnel/example/spark/v2/SeaTunnelApiExample.java`
#### Snippet
```java
import java.net.URISyntaxException;

public class SeaTunnelApiExample {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException, CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelApiExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-flink-connector-v2-example/src/main/java/org/apache/seatunnel/example/flink/v2/SeaTunnelApiExample.java`
#### Snippet
```java
import java.nio.file.Paths;

public class SeaTunnelApiExample {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException, CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `ExampleUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-spark-connector-v2-example/src/main/java/org/apache/seatunnel/example/spark/v2/ExampleUtils.java`
#### Snippet
```java
import java.nio.file.Paths;

public class ExampleUtils {

    public static void builder(String configurePath) throws FileNotFoundException, URISyntaxException, CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `SparkSinkInjector` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkSinkInjector.java`
#### Snippet
```java
import org.apache.spark.sql.streaming.OutputMode;

public class SparkSinkInjector {

    private static final String SPARK_SINK_CLASS_NAME = "org.apache.seatunnel.translation.spark.sink.SparkSink";
```

### UtilityClassWithoutPrivateConstructor
Class `InstantConverterUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/utils/InstantConverterUtils.java`
#### Snippet
```java
import java.time.Instant;

public class InstantConverterUtils {

    private static final long MICRO_OF_SECOND = 1000_000;
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/utils/ObjectUtils.java`
#### Snippet
```java

/** Utilities for operation on {@link Object}. */
public class ObjectUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `WatermarkEvent` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/wartermark/WatermarkEvent.java`
#### Snippet
```java

/** Utility class to deal Watermark event. */
public class WatermarkEvent {

    public static final String WATERMARK_SIGNAL = "_split_watermark_signal_";
```

### UtilityClassWithoutPrivateConstructor
Class `MySqlTypeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlTypeUtils.java`
#### Snippet
```java

@Slf4j
public class MySqlTypeUtils {

    // ============================data types=====================
```

### UtilityClassWithoutPrivateConstructor
Class `TableDiscoveryUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/TableDiscoveryUtils.java`
#### Snippet
```java
 * Utilities to discovery matched tables.
 */
public class TableDiscoveryUtils {
    private static final Logger LOG = LoggerFactory.getLogger(TableDiscoveryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `MySqlConnectionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java
 * MySQL connection Utilities.
 */
public class MySqlConnectionUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FakeOption` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/config/FakeOption.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class FakeOption {

    public static final Option<Integer> ROW_NUM = Options.key("row.num").intType().defaultValue(5)
```

### UtilityClassWithoutPrivateConstructor
Class `FileSystemUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/util/FileSystemUtils.java`
#### Snippet
```java

@Slf4j
public class FileSystemUtils {

    public static final int WRITE_BUFFER_SIZE = 2048;
```

### UtilityClassWithoutPrivateConstructor
Class `BaseSinkConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/BaseSinkConfig.java`
#### Snippet
```java
import java.util.List;

public class BaseSinkConfig {
    public static final String SEATUNNEL = "seatunnel";
    public static final String NON_PARTITION = "NON_PARTITION";
```

### UtilityClassWithoutPrivateConstructor
Class `HiveConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/config/HiveConfig.java`
#### Snippet
```java
import org.apache.hadoop.hive.metastore.api.Table;

public class HiveConfig {
    public static final Option<String> TABLE_NAME = Options.key("table_name")
            .stringType()
```

### UtilityClassWithoutPrivateConstructor
Class `AuthorizationUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/util/AuthorizationUtil.java`
#### Snippet
```java
import org.apache.seatunnel.connectors.seatunnel.http.config.HttpConfig;

public class AuthorizationUtil {
    //Basic Auth
    public static String getTokenByBasicAuth(String username, String password) {
```

### UtilityClassWithoutPrivateConstructor
Class `HudiSourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/config/HudiSourceConfig.java`
#### Snippet
```java
package org.apache.seatunnel.connectors.seatunnel.hudi.config;

public class HudiSourceConfig {

    public static final String TABLE_PATH = "table.path";
```

### UtilityClassWithoutPrivateConstructor
Class `HudiUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/util/HudiUtil.java`
#### Snippet
```java
import java.util.Arrays;

public class HudiUtil {

    public static Configuration getConfiguration(String confPaths) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/utils/ExceptionUtils.java`
#### Snippet
```java
import java.io.IOException;

public class ExceptionUtils {
    public static void rethrow(Throwable t) {
        if (t instanceof Error) {
```

### UtilityClassWithoutPrivateConstructor
Class `JdbcCatalogOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/JdbcCatalogOptions.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class JdbcCatalogOptions {
    public static final Option<String> BASE_URL = Options.key("base-url")
        .stringType()
```

### UtilityClassWithoutPrivateConstructor
Class `KuduTypeMapper` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduTypeMapper.java`
#### Snippet
```java
import java.util.List;

public class KuduTypeMapper {

    private static final Logger LOG = LoggerFactory.getLogger(KuduTypeMapper.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EmailConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/config/EmailConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class EmailConfig {

    public static final Option<String> EMAIL_FROM_ADDRESS = Options.key("email_from_address").stringType().noDefaultValue()
```

### UtilityClassWithoutPrivateConstructor
Class `SourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/config/SourceConfig.java`
#### Snippet
```java
 * https://iotdb.apache.org/UserGuide/Master/API/Programming-Java-Native-API.html
 */
public class SourceConfig {

    public static final Option<String> SQL = Options.key("sql").stringType().noDefaultValue().withDescription("sql");
```

### UtilityClassWithoutPrivateConstructor
Class `SourceConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/constant/SourceConstants.java`
#### Snippet
```java
package org.apache.seatunnel.connectors.seatunnel.iotdb.constant;

public class SourceConstants {

    public static final String FIELDS_K_V_SPLIT = ":";
```

### UtilityClassWithoutPrivateConstructor
Class `Config` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/config/Config.java`
#### Snippet
```java
import java.util.List;

public class Config {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `RedisConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-redis/src/main/java/org/apache/seatunnel/connectors/seatunnel/redis/config/RedisConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class RedisConfig {

    public enum RedisMode {
```

### UtilityClassWithoutPrivateConstructor
Class `AssertConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-assert/src/main/java/org/apache/seatunnel/connectors/seatunnel/assertion/sink/AssertConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class AssertConfig {

    public static final String RULE_TYPE = "rule_type";
```

### UtilityClassWithoutPrivateConstructor
Class `SourceProperties` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/config/SourceProperties.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SourceProperties {

    private static final Long DEFAULT_TOPIC_DISCOVERY_INTERVAL = -1L;
```

### UtilityClassWithoutPrivateConstructor
Class `SentryConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/config/SentryConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SentryConfig {

    public static final String SENTRY = "Sentry";
```

### UtilityClassWithoutPrivateConstructor
Class `SocketSinkConfigOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/config/SocketSinkConfigOptions.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SocketSinkConfigOptions {
    private static final int DEFAULT_MAX_RETRIES = 3;

```

### UtilityClassWithoutPrivateConstructor
Class `DataHubConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-datahub/src/main/java/org/apache/seatunnel/connectors/seatunnel/datahub/config/DataHubConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class DataHubConfig {

    public static Option<String> ENDPOINT = Options.key("endpoint")
```

### UtilityClassWithoutPrivateConstructor
Class `IcebergTypeMapper` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java
import java.util.List;

public class IcebergTypeMapper {

    public static SeaTunnelDataType<?> mapping(@NonNull Type icebergType) {
```

### UtilityClassWithoutPrivateConstructor
Class `DataTypeValidator` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/data/DataTypeValidator.java`
#### Snippet
```java
import org.apache.seatunnel.connectors.seatunnel.mongodb.exception.MongodbConnectorException;

public class DataTypeValidator {

    public static void validateDataType(SeaTunnelDataType dataType) throws IllegalArgumentException {
```

### UtilityClassWithoutPrivateConstructor
Class `IcebergScanSplitPlanner` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/scan/IcebergScanSplitPlanner.java`
#### Snippet
```java

@Slf4j
public class IcebergScanSplitPlanner {

    public static IcebergEnumerationResult planStreamSplits(Table table,
```

### UtilityClassWithoutPrivateConstructor
Class `DingTalkConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/config/DingTalkConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class DingTalkConfig {

    public static final Option<String> URL = Options.key("url").stringType().noDefaultValue()
```

### UtilityClassWithoutPrivateConstructor
Class `InfluxDBRowConverter` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/converter/InfluxDBRowConverter.java`
#### Snippet
```java
import java.util.List;

public class InfluxDBRowConverter {

    public static SeaTunnelRow convert(List<Object> values, SeaTunnelRowType typeInfo, List<Integer> indexList) {
```

### UtilityClassWithoutPrivateConstructor
Class `InfluxDBClient` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/client/InfluxDBClient.java`
#### Snippet
```java

@Slf4j
public class InfluxDBClient {
    public static InfluxDB getInfluxDB(InfluxDBConfig config) throws ConnectException {
        OkHttpClient.Builder clientBuilder =
```

### UtilityClassWithoutPrivateConstructor
Class `CassandraClient` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/client/CassandraClient.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class CassandraClient {
    public static CqlSessionBuilder getCqlSessionBuilder(String nodeAddress, String keyspace, String username, String password, String dataCenter) {
        List<CqlSessionBuilder> cqlSessionBuilderList = Arrays.stream(nodeAddress.split(",")).map(address -> {
```

### UtilityClassWithoutPrivateConstructor
Class `StarRocksDelimiterParser` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksDelimiterParser.java`
#### Snippet
```java
import java.io.StringWriter;

public class StarRocksDelimiterParser {
    private static final int SHIFT = 4;

```

### UtilityClassWithoutPrivateConstructor
Class `FileTransferFactory` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/FileTransferFactory.java`
#### Snippet
```java
import org.apache.seatunnel.connectors.seatunnel.clickhouse.config.ClickhouseFileCopyMethod;

public class FileTransferFactory {
    public static FileTransfer createFileTransfer(ClickhouseFileCopyMethod type, String host, String user, String password) {
        switch (type) {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeConvertUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class TypeConvertUtil {
    public static SeaTunnelDataType<?> convert(DataType type) {
        switch (type.getProtocolCode()) {
```

### UtilityClassWithoutPrivateConstructor
Class `ClickhouseUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/util/ClickhouseUtil.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ClickhouseUtil {

    public static List<ClickHouseNode> createNodes(String nodeAddress, String database, String username,
```

### UtilityClassWithoutPrivateConstructor
Class `ClickhouseConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/config/ClickhouseConfig.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class ClickhouseConfig {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TypeConvertUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/util/TypeConvertUtil.java`
#### Snippet
```java
import java.util.UUID;

public class TypeConvertUtil {

    public static SeaTunnelDataType<?> convert(ClickHouseColumn column) {
```

### UtilityClassWithoutPrivateConstructor
Class `RegexUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/RegexUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class RegexUtils {

    public static List<String> extractDatas(String content, String regex) {
```

### UtilityClassWithoutPrivateConstructor
Class `EsClusterConnectionConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/config/EsClusterConnectionConfig.java`
#### Snippet
```java
import java.util.List;

public class EsClusterConnectionConfig {

    public static final Option<List<String>> HOSTS = Options.key("hosts").listType().noDefaultValue()
```

### UtilityClassWithoutPrivateConstructor
Class `SinkConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/config/SinkConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SinkConfig {

    public static final Option<String> INDEX = Options.key("index").stringType().noDefaultValue()
```

### UtilityClassWithoutPrivateConstructor
Class `SourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/config/SourceConfig.java`
#### Snippet
```java
import java.util.List;

public class SourceConfig {

    public static final Option<String> INDEX = Options.key("index").stringType().noDefaultValue()
```

### UtilityClassWithoutPrivateConstructor
Class `EsTypeMappingSeaTunnelType` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
import java.util.Map;

public class EsTypeMappingSeaTunnelType {

    private static final Map<String, SeaTunnelDataType> MAPPING = new HashMap() {
```

### UtilityClassWithoutPrivateConstructor
Class `IndexSerializerFactory` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
import java.util.List;

public class IndexSerializerFactory {

    public static IndexSerializer getIndexSerializer(String index, SeaTunnelRowType seaTunnelRowType) {
```

### UtilityClassWithoutPrivateConstructor
Class `SheetsConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/config/SheetsConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SheetsConfig {

    public static final Option<String> SERVICE_ACCOUNT_KEY = Options.key("service_account_key")
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/utils/SparkStructTypeUtil.java`
#### Snippet
```java

                if (list.size() == 0) {
                    newSchema = newSchema.add(field, DataTypes.createArrayType(null, true));
                } else {
                    Object o = list.get(0);
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/FileUtils.java`
#### Snippet
```java
        try {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                File thisFile = files[i];
                if (thisFile.isDirectory()) {
```

### DataFlowIssue
Method invocation `recoveryFromVertexMap` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDag.java`
#### Snippet
```java
        for (int i = 0; i < edgeCount; i++) {
            LogicalEdge edge = in.readObject();
            edge.recoveryFromVertexMap(logicalVertexMap);
            edges.add(edge);
        }
```

### DataFlowIssue
Unboxing of `RetryUtils.retryWithException(() -> { return nodeEngine.getMasterAddress().equals(no...` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
        // must retry until the cluster have master node
        try {
            return RetryUtils.retryWithException(() -> {
                return nodeEngine.getMasterAddress().equals(nodeEngine.getThisAddress());
            }, new RetryUtils.RetryMaterial(20, true,
                exception -> exception instanceof NullPointerException && isRunning, 1000));
        } catch (InterruptedException e) {
            LOGGER.info("master node check interrupted");
```

### DataFlowIssue
Method invocation `isEndState` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
        if (ExecutionState.CANCELING.equals(executionState)) {
            noticeTaskExecutionServiceCancel();
        } else if (executionState.isEndState()) {
            this.taskFuture.complete(new TaskExecutionState(taskGroupLocation, executionState, null));
        }
```

### DataFlowIssue
Method invocation `setJobMaster` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
            runningJobStateTimestampsIMap);
        this.physicalPlan = planTuple.f0();
        this.physicalPlan.setJobMaster(this);
        this.initStateFuture();
        this.checkpointManager = new CheckpointManager(
```

### DataFlowIssue
Argument `planTuple.f1()` might be null
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
            nodeEngine,
            this,
            planTuple.f1(),
            checkpointConfig);
    }
```

### DataFlowIssue
Method invocation `join` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        }
        if (oldProfile == null || !resourceManager.slotActiveCheck(oldProfile)) {
            SlotProfile newProfile = applyResourceForTask(task).join();
            log.info(String.format("use new profile: %s to replace not active profile: %s for task %s", newProfile, oldProfile, task));
            return newProfile;
```

### DataFlowIssue
Unboxing of `tuple.f1()` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                        return;
                    }
                    for (int i = tuple.f1(); i < actionState.getParallelism(); i += currentParallelism) {
                        states.add(actionState.getSubtaskStates().get(i));
                    }
```

### DataFlowIssue
Method invocation `isArray` may produce `NullPointerException`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    public void collect(byte[] message, Collector<SeaTunnelRow> out) throws IOException {
        JsonNode jsonNode = convertBytes(message);
        if (jsonNode.isArray()) {
            ArrayNode arrayNode = (ArrayNode) jsonNode;
            for (int i = 0; i < arrayNode.size(); i++) {
```

### DataFlowIssue
Method invocation `toUri` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
                    .getDirDefault());
            if (created) {
                String parentDir = parent.toUri().getPath();
                client.changeWorkingDirectory(parentDir);
                created = created && client.makeDirectory(pathName);
```

### DataFlowIssue
Method invocation `toUri` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            created = parent == null || mkdirs(client, parent, FsPermission.getDefault());
            if (created) {
                String parentDir = parent.toUri().getPath();
                boolean succeeded = true;
                try {
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                            parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### DataFlowIssue
Dereference of `split` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceReader.java`
#### Snippet
```java
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        KuduSourceSplit split = splits.poll();
        Object[] parameterValues = split.parameterValues;
        int lowerBound = Integer.parseInt(parameterValues[0].toString());
        int upperBound = Integer.parseInt(parameterValues[1].toString());
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceSplitEnumerator.java`
#### Snippet
```java
            batchNum = (int) maxElemCount;
        }
        this.batchNum = batchNum;
        this.batchSize = new Double(Math.ceil((double) maxElemCount / batchNum)).longValue();
    }
```

### DataFlowIssue
Argument `time` might be null
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java
            switch (timestampFieldType.getSqlType()) {
                case STRING:
                    builder.time(Long.parseLong((String) time), precision);
                    break;
                case TIMESTAMP:
```

### DataFlowIssue
Method invocation `atZone` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java
                case TIMESTAMP:
                    builder.time(((LocalDateTime) time)
                        .atZone(ZoneOffset.UTC)
                        .toInstant()
                        .toEpochMilli(), precision);
```

### DataFlowIssue
Argument `time` might be null
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java
                    break;
                case BIGINT:
                    builder.time((Long) time, precision);
                    break;
                default:
```

### DataFlowIssue
Argument `split` might be null
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxdbSourceReader.java`
#### Snippet
```java
            synchronized (output.getCheckpointLock()) {
                InfluxDBSourceSplit split = pendingSplits.poll();
                read(split, output);
            }
        }
```

### DataFlowIssue
Casting `value` to `byte[]` will produce `ClassCastException` for any non-null value
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                    ((Collection<Number>) value)
                        .stream().map(number ->
                            SdkBytes.fromByteArray((byte[]) value)).collect(Collectors.toList())
                ).build();
            case M:
```

## RuleId[ruleID=BoxingBoxedValue]
### BoxingBoxedValue
Boxing of already boxed `(Boolean) value`
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                return ((Number) value).doubleValue();
            case BOOLEAN:
                return Boolean.valueOf((Boolean) value);
            case TEXT:
                return value.toString();
```

### BoxingBoxedValue
Boxing of already boxed `(Boolean) val`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java
                switch (dataType.getSqlType()) {
                    case BOOLEAN:
                        builder.addField(field, Boolean.valueOf((Boolean) val));
                        break;
                    case SMALLINT:
```

### BoxingBoxedValue
Boxing of already boxed `(Short) val`
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java
                        break;
                    case SMALLINT:
                        builder.addField(field, Short.valueOf((Short) val));
                        break;
                    case INT:
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'deployLocalTask' is still used
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

    @Deprecated
    public PassiveCompletableFuture<TaskExecutionState> deployLocalTask(
        @NonNull TaskGroup taskGroup,
        @NonNull CompletableFuture<TaskExecutionState> resultFuture) {
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
        List<CompletableFuture<Void>> collect = pipelineList.stream().map(pipeline -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                pipeline.cancelPipeline();
            });
            return future;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
            });
            return future;
        }).filter(x -> x != null).collect(Collectors.toList());

        try {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    public PassiveCompletableFuture<JobStatus> initStateFuture() {
        jobEndFuture = new CompletableFuture<>();
        pipelineList.forEach(subPlan -> addPipelineEndCallback(subPlan));
        return new PassiveCompletableFuture<JobStatus>(jobEndFuture);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private void cancelPipelineTasks() {
        List<CompletableFuture<Void>> coordinatorCancelList =
            coordinatorVertexList.stream().map(coordinator -> cancelTask(coordinator)).filter(x -> x != null)
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private void cancelPipelineTasks() {
        List<CompletableFuture<Void>> coordinatorCancelList =
            coordinatorVertexList.stream().map(coordinator -> cancelTask(coordinator)).filter(x -> x != null)
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

        List<CompletableFuture<Void>> taskCancelList =
            physicalVertexList.stream().map(task -> cancelTask(task)).filter(x -> x != null)
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

        List<CompletableFuture<Void>> taskCancelList =
            physicalVertexList.stream().map(task -> cancelTask(task)).filter(x -> x != null)
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

        coordinatorVertexList.forEach(coordinate -> {
            coordinate.reset();
        });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

        physicalVertexList.forEach(task -> {
            task.reset();
        });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                physicalPlan.getPipelineList()
                    .stream()
                    .map(pipeline -> schedulerPipeline(pipeline))
                    .filter(Objects::nonNull).collect(Collectors.toList());
            try {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
            .toArray();
        SeaTunnelDataType[] pkTypes = Arrays.stream(pkFields)
            .mapToObj((IntFunction<SeaTunnelDataType>) index -> rowType.getFieldType(index))
            .toArray(length -> new SeaTunnelDataType[length]);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
        SeaTunnelDataType[] pkTypes = Arrays.stream(pkFields)
            .mapToObj((IntFunction<SeaTunnelDataType>) index -> rowType.getFieldType(index))
            .toArray(length -> new SeaTunnelDataType[length]);

        Function<SeaTunnelRow, SeaTunnelRow> keyExtractor = createKeyExtractor(pkFields);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case DATE:
                    Date sqlDate = rs.getDate(resultSetIndex);
                    fields[fieldIndex] = Optional.ofNullable(sqlDate).map(e -> e.toLocalDate()).orElse(null);
                    break;
                case TIME:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case TIME:
                    Time sqlTime = rs.getTime(resultSetIndex);
                    fields[fieldIndex] = Optional.ofNullable(sqlTime).map(e -> e.toLocalTime()).orElse(null);
                    break;
                case TIMESTAMP:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case TIMESTAMP:
                    Timestamp sqlTimestamp = rs.getTimestamp(resultSetIndex);
                    fields[fieldIndex] = Optional.ofNullable(sqlTimestamp).map(e -> e.toLocalDateTime()).orElse(null);
                    break;
                case BYTES:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
                split.setEndOffset(listOffsets.get(split.getTopicPartition()));
            });
            return splits.stream().collect(Collectors.toMap(split -> split.getTopicPartition(), split -> split));
        } catch (Exception e) {
            throw new KafkaConnectorException(KafkaConnectorErrorCode.ADD_SPLIT_BACK_TO_ENUMERATOR_FAILED, e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/split/IcebergFileScanTaskSplit.java`
#### Snippet
```java
        taskInfo.put("length", task.length());
        taskInfo.put("deletes", task.deletes().stream().map(
            deleteFile -> deleteFile.path()).collect(Collectors.toList()));
        return taskInfo.toString();
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/SplitTransform.java`
#### Snippet
```java
        return IntStream.range(0, outputFields.length)
            .mapToObj((IntFunction<SeaTunnelDataType>) value -> BasicType.STRING_TYPE)
            .toArray(value -> new SeaTunnelDataType[value]);
    }

```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Removal by index can be replaced with removal by object
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SeaTunnelRowTypeEditor.java`
#### Snippet
```java
        for (String fieldName : fieldNames) {
            int index = fields.indexOf(Field.name(fieldName));
            fields.remove(index);
        }
        return this;
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-flink-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/AbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.pluginConfigs = pluginConfigs;
        this.jobContext = jobContext;
        this.plugins = initializePlugins(jarPaths, pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-spark-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/AbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.jobContext = jobContext;
        this.pluginConfigs = pluginConfigs;
        this.plugins = initializePlugins(pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getPluginBaseClass()` during object construction
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        this.pluginConfig = pluginConfig;
        this.addURLToClassLoaderConsumer = addURLToClassLoaderConsumer;
        log.info("Load {} Plugin from {}", getPluginBaseClass().getSimpleName(), pluginDir);
    }

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'fields' in a Serializable class
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/SeaTunnelRow.java`
#### Snippet
```java
    private RowKind kind = RowKind.INSERT;
    /** The array to store the actual internal format values. */
    private final Object[] fields;

    public SeaTunnelRow(int arity) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'flinkEnvironment' in a Serializable class
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/stream/FlinkStreamExecution.java`
#### Snippet
```java
    private Config config;

    private final FlinkEnvironment flinkEnvironment;

    public FlinkStreamExecution(FlinkEnvironment streamEnvironment) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'environment' in a Serializable class
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/batch/SparkBatchExecution.java`
#### Snippet
```java
public class SparkBatchExecution implements Execution<SparkBatchSource, BaseSparkTransform, SparkBatchSink, SparkEnvironment> {

    private final SparkEnvironment environment;

    private Config config = ConfigFactory.empty();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'flinkEnvironment' in a Serializable class
in `seatunnel-apis/seatunnel-api-flink/src/main/java/org/apache/seatunnel/flink/batch/FlinkBatchExecution.java`
#### Snippet
```java
    private Config config;

    private final FlinkEnvironment flinkEnvironment;

    public FlinkBatchExecution(FlinkEnvironment flinkEnvironment) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'sparkEnvironment' in a Serializable class
in `seatunnel-apis/seatunnel-api-spark/src/main/java/org/apache/seatunnel/spark/structuredstream/StructuredStreamingExecution.java`
#### Snippet
```java
public class StructuredStreamingExecution implements Execution<StructuredStreamingSource, BaseSparkTransform, StructuredStreamingSink, SparkEnvironment> {

    private final SparkEnvironment sparkEnvironment;

    private Config config = ConfigFactory.empty();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'storage' in a Serializable class
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/server/CheckpointConfig.java`
#### Snippet
```java
    private int tolerableFailureCheckpoints = ServerConfigOptions.CHECKPOINT_TOLERABLE_FAILURE.defaultValue();

    private CheckpointStorageConfig storage = ServerConfigOptions.CHECKPOINT_STORAGE.defaultValue();

    public void setCheckpointInterval(long checkpointInterval) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'executionContext' in a Serializable class
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/AbstractTask.java`
#### Snippet
```java
    private static final long serialVersionUID = -2524701323779523718L;

    protected TaskExecutionContext executionContext;
    protected final long jobID;
    protected final TaskLocation taskLocation;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'enumeratorContext' in a Serializable class
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    private final SourceAction<?, SplitT, Serializable> source;
    private SourceSplitEnumerator<SplitT, Serializable> enumerator;
    private SeaTunnelSplitEnumeratorContext<SplitT> enumeratorContext;

    private Serializer<Serializable> enumeratorStateSerializer;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'completableFuture' in a Serializable class
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java

    private Map<Long, Integer> checkpointBarrierCounter;
    private CompletableFuture<Void> completableFuture;

    private volatile boolean receivedSinkWriter;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tableId' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SnapshotSplit.java`
#### Snippet
```java
@Getter
public class SnapshotSplit extends SourceSplitBase {
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'splitStart' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SnapshotSplit.java`
#### Snippet
```java
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'splitEnd' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SnapshotSplit.java`
#### Snippet
```java
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;

    private final Offset highWatermark;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'splitStart' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/CompletedSnapshotSplitInfo.java`
#### Snippet
```java
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;
    private final Offset watermark;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tableId' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/CompletedSnapshotSplitInfo.java`
#### Snippet
```java
public class CompletedSnapshotSplitInfo implements Serializable {
    private final String splitId;
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'splitEnd' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/CompletedSnapshotSplitInfo.java`
#### Snippet
```java
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;
    private final Offset watermark;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'readonlyConfig' in a Serializable class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
public abstract class IncrementalSource<T, C extends SourceConfig> implements SeaTunnelSource<T, SourceSplitBase, PendingSplitsState> {

    protected ReadonlyConfig readonlyConfig;
    protected SourceConfig.Factory<C> configFactory;
    protected OffsetFactory offsetFactory;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schemaConverter' in a Serializable class
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
public class ParquetWriteStrategy extends AbstractWriteStrategy {
    private final Map<String, ParquetWriter<GenericRecord>> beingWrittenWriter;
    private AvroSchemaConverter schemaConverter;
    private Schema schema;
    public static final int[] PRECISION_TO_BYTE_COUNT = new int[38];
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'weChatSinkConfig' in a Serializable class
in `seatunnel-connectors-v2/connector-http/connector-http-wechat/src/main/java/org/apache/seatunnel/connectors/seatunnel/wechat/sink/WeChatBotMessageSerializationSchema.java`
#### Snippet
```java

public class WeChatBotMessageSerializationSchema implements SerializationSchema {
    private final WeChatSinkConfig weChatSinkConfig;
    private final SeaTunnelRowType rowType;
    private final JsonSerializationSchema jsonSerializationSchema;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parameterValues' in a Serializable class
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplit.java`
#### Snippet
```java
public class JdbcSourceSplit implements SourceSplit {

    Object[] parameterValues;
    Integer splitId;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parameterValues' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceSplit.java`
#### Snippet
```java
    private static final long serialVersionUID = -1L;

    Object[] parameterValues;
    public final Integer splitId;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kuduSession' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduOutputFormat.java`
#### Snippet
```java
    private final KuduSinkConfig.SaveMode saveMode;
    private KuduClient kuduClient;
    private KuduSession kuduSession;
    private KuduTable kuduTable;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kuduTable' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduOutputFormat.java`
#### Snippet
```java
    private KuduClient kuduClient;
    private KuduSession kuduSession;
    private KuduTable kuduTable;

    public KuduOutputFormat(KuduSinkConfig kuduSinkConfig) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kuduClient' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduOutputFormat.java`
#### Snippet
```java
    private final String kuduTableName;
    private final KuduSinkConfig.SaveMode saveMode;
    private KuduClient kuduClient;
    private KuduSession kuduSession;
    private KuduTable kuduTable;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kuduClient' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
     * Declare the global variable KuduClient and use it to manipulate the Kudu table
     */
    public KuduClient kuduClient;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schema' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
    public String kuduMaster;
    public List<String> columnsList;
    public Schema schema;
    public String keyColumn;
    public static final int TIMEOUTMS = 18000;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kafkaProducer' in a Serializable class
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkCommitter.java`
#### Snippet
```java
    private final Config pluginConfig;

    private KafkaInternalProducer<?, ?> kafkaProducer;

    public KafkaSinkCommitter(Config pluginConfig) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/sink/DingTalkWriter.java`
#### Snippet
```java
        private String secret;

        private DefaultDingTalkClient client;

        public RobotClient(String url, String secret) {
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/utils/ThrowingRunnable.java`
#### Snippet
```java
            try {
                throwingRunnable.run();
            } catch (Throwable t) {
                ExceptionUtils.rethrow(t);
            }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduOutputFormat.java`
#### Snippet
```java
                kuduClient.close();
                kuduSession.close();
            } catch (KuduException ignored) {
                log.warn("Failed to close Kudu Client.", ignored);
            } finally {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
            sb.append(sinkConfig.getLabelPrefix());
        }
        return sb.append(UUID.randomUUID().toString())
                .toString();
    }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XidImpl.java`
#### Snippet
```java

        for (int i = start, j = 0; i < end; i++) {
            out[j++] = HEX_CHARS[(number0xf0 & bytes[i]) >>> number4];
            out[j++] = HEX_CHARS[number0x0f & bytes[i]];
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XidImpl.java`
#### Snippet
```java
        for (int i = start, j = 0; i < end; i++) {
            out[j++] = HEX_CHARS[(number0xf0 & bytes[i]) >>> number4];
            out[j++] = HEX_CHARS[number0x0f & bytes[i]];
        }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MySqlTaskContextImpl` may be 'static'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
     * A subclass implementation of {@link MySqlTaskContext} which reuses one BinaryLogClient.
     */
    public class MySqlTaskContextImpl extends MySqlTaskContext {

        private final BinaryLogClient reusedBinaryLogClient;
```

## RuleId[ruleID=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                        }
                        // Block #next() method
                        synchronized (handover) {
                            final int currentCheckpoint = checkpointId;
                            ReaderState readerState = snapshotState();
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/common/source/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
            }
            // Block #next() method
            synchronized (handover) {
                final int currentCheckpoint = checkpointId;
                ReaderState readerState = snapshotState();
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
            return true; // start at current position
        }
        if (binlogFilename.equals("")) {
            return true; // start at beginning
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java

        String user = conf.get(FS_SFTP_USER_PREFIX + host);
        if (user == null || user.equals("")) {
            throw new IllegalStateException(E_USER_NULL);
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/type/IndexTypeSerializerFactory.java`
#### Snippet
```java
    public static IndexTypeSerializer getIndexTypeSerializer(ElasticsearchVersion elasticsearchVersion, String type) {
        if (elasticsearchVersion == ES2 || elasticsearchVersion == ES5) {
            if (type == null || "".equals(type)) {
                type = DEFAULT_TYPE;
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/type/IndexTypeSerializerFactory.java`
#### Snippet
```java
        }
        if (elasticsearchVersion == ES6) {
            if (type != null && !"".equals(type)) {
                return new RequiredIndexTypeSerializer(type);
            }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSource.java`
#### Snippet
```java
                        String[] topicAndPartition = key.split("-");
                        long offset = jsonNodes.get(key).asLong();
                        TopicPartition topicPartition = new TopicPartition(topicAndPartition[0], Integer.valueOf(topicAndPartition[1]));
                        specificStartOffsets.put(topicPartition, offset);
                    });
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `pipelineRestoreNum`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
     */
    public void restorePipeline() {
        synchronized (pipelineRestoreNum) {
            try {
                pipelineRestoreNum++;
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `enumeratorContext`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
        final long barrierId = barrier.getId();
        Serializable snapshotState = null;
        synchronized (enumeratorContext) {
            if (barrier.snapshot()) {
                snapshotState = enumerator.snapshotState(barrierId);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.table.connector` is unnecessary and can be removed
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/TableTransformFactory.java`
#### Snippet
```java

/**
 * This is an SPI interface, used to create {@link org.apache.seatunnel.api.table.connector.TableTransform}. Each plugin need to have it own implementation.
 */
public interface TableTransformFactory extends Factory {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
    }

    public static ClientMessage encodeRequest(java.lang.String message) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        clientMessage.setRetryable(false);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
    }

    public static java.lang.String decodeRequest(ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
        //empty initial frame
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
    }

    public static ClientMessage encodeResponse(java.lang.String response) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
     *
     */
    public static java.lang.String decodeResponse(ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
        //empty initial frame
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelSubmitJobCodec.java`
#### Snippet
```java

    public static ClientMessage encodeRequest(long jobId,
                                              com.hazelcast.internal.serialization.Data jobImmutableInformation) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        clientMessage.setRetryable(false);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelSubmitJobCodec.java`
#### Snippet
```java
        public long jobId;

        public com.hazelcast.internal.serialization.Data jobImmutableInformation;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.core.job` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/serializable/JobDataSerializerHook.java`
#### Snippet
```java

    /**
     * Serialization ID of the {@link org.apache.seatunnel.engine.core.job.JobImmutableInformation} class.
     */
    public static final int JOB_IMMUTABLE_INFORMATION = 3;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.client` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelHazelcastClient.java`
#### Snippet
```java
        Preconditions.checkNotNull(clientConfig, "config");
        this.hazelcastClient =
            ((HazelcastClientProxy) com.hazelcast.client.HazelcastClient.newHazelcastClient(
                clientConfig)).client;
        this.serializationService = hazelcastClient.getSerializationService();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.source` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/ConnectorInstanceLoader.java`
#### Snippet
```java
        seaTunnelSource.setJobContext(jobContext);
        if (jobContext.getJobMode() == JobMode.BATCH
            && seaTunnelSource.getBoundedness() == org.apache.seatunnel.api.source.Boundedness.UNBOUNDED) {
            throw new UnsupportedOperationException(
                String.format("'%s' source don't support off-line job.", seaTunnelSource.getPluginName()));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.common.config` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/serializeable/ConfigDataSerializerHook.java`
#### Snippet
```java
public class ConfigDataSerializerHook implements DataSerializerHook {
    /**
     * Serialization ID of the {@link org.apache.seatunnel.engine.common.config.JobConfig} class.
     */
    public static final int JOB_CONFIG = 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
/**
 * PhysicalVertex is responsible for the scheduling and execution of a single task parallel
 * Each {@link org.apache.seatunnel.engine.server.dag.execution.ExecutionVertex} generates some PhysicalVertex.
 * And the number of PhysicalVertex equals the {@link ExecutionVertex#getParallelism()}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
     * The value of IMap is one of {@link org.apache.seatunnel.engine.server.dag.physical.PhysicalPlan} stateTimestamps
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * <p>
     * The value of IMap is one of {@link org.apache.seatunnel.engine.server.dag.physical.PhysicalPlan} stateTimestamps
     * {@link org.apache.seatunnel.engine.server.dag.physical.SubPlan} stateTimestamps
     * {@link org.apache.seatunnel.engine.server.dag.physical.PhysicalVertex} stateTimestamps
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * The value of IMap is one of {@link org.apache.seatunnel.engine.server.dag.physical.PhysicalPlan} stateTimestamps
     * {@link org.apache.seatunnel.engine.server.dag.physical.SubPlan} stateTimestamps
     * {@link org.apache.seatunnel.engine.server.dag.physical.PhysicalVertex} stateTimestamps
     * <p>
     * This IMap is used to recovery runningJobStateTimestampsIMap in JobMaster when a new master node active
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
     * The value of IMap is one of {@link JobStatus} {@link PipelineStatus}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * <p>
     * The value of IMap is one of {@link JobStatus} {@link PipelineStatus}
     * {@link org.apache.seatunnel.engine.server.execution.ExecutionState}
     * <p>
     * This IMap is used to recovery runningJobStateIMap in JobMaster when a new master node active
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
public class JobHistoryService {
    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and
     * {@link org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     * <p>
     * The value of IMap is one of {@link JobStatus} {@link PipelineStatus}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
     * <p>
     * The value of IMap is one of {@link JobStatus} {@link PipelineStatus}
     * {@link org.apache.seatunnel.engine.server.execution.ExecutionState}
     * <p>
     * This IMap is used to recovery runningJobStateIMap in JobMaster when a new master node active
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.table.type` is unnecessary and can be removed
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
import java.util.function.IntFunction;

/** Tool class used to convert from {@link JsonNode} to {@link org.apache.seatunnel.api.table.type.SeaTunnelRow}. * */
public class JsonToRowConverters implements Serializable {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.connector.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    @Override
    public void write(InputT element, org.apache.flink.api.connector.sink.SinkWriter.Context context) throws IOException {
        if (element instanceof Row) {
            sinkWriter.write(rowSerialization.reconvert((Row) element));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkDataWriterFactory.java`
#### Snippet
```java
    @Override
    public DataWriter<InternalRow> createDataWriter(int partitionId, long taskId, long epochId) {
        org.apache.seatunnel.api.sink.SinkWriter.Context context = new DefaultSinkWriterContext((int) taskId);
        SinkWriter<SeaTunnelRow, CommitInfoT, StateT> writer;
        SinkCommitter<CommitInfoT> committer;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.connector.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-flink/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java

    @Override
    public SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> createWriter(org.apache.flink.api.connector.sink.Sink.InitContext context, List<FlinkWriterState<WriterStateT>> states) throws IOException {
        org.apache.seatunnel.api.sink.SinkWriter.Context stContext = new DefaultSinkWriterContext(context.getSubtaskId());

```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return ((LocalDateTime) obj).toLocalTime();
        }
        if (obj instanceof java.sql.Date) {
            throw new IllegalArgumentException(
                    "Unable to convert to LocalDate from a java.sql.Date value '" + obj + "'");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    "Unable to convert to LocalDate from a java.sql.Date value '" + obj + "'");
        }
        if (obj instanceof java.sql.Time) {
            java.sql.Time time = (java.sql.Time) obj;
            long millis = (int) (time.getTime() % MILLISECONDS_PER_SECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Time) {
            java.sql.Time time = (java.sql.Time) obj;
            long millis = (int) (time.getTime() % MILLISECONDS_PER_SECOND);
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Time) {
            java.sql.Time time = (java.sql.Time) obj;
            long millis = (int) (time.getTime() % MILLISECONDS_PER_SECOND);
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    time.getHours(), time.getMinutes(), time.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalTime.of(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalTime.of(
                    timestamp.getHours(),
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalTime.of(
                    timestamp.getHours(),
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getNanos());
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return ((LocalDateTime) obj).toLocalDate();
        }
        if (obj instanceof java.sql.Date) {
            return ((java.sql.Date) obj).toLocalDate();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Date) {
            return ((java.sql.Date) obj).toLocalDate();
        }
        if (obj instanceof java.sql.Time) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return ((java.sql.Date) obj).toLocalDate();
        }
        if (obj instanceof java.sql.Time) {
            throw new IllegalArgumentException(
                    "Unable to convert to LocalDate from a java.sql.Time value '" + obj + "'");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    "Unable to convert to LocalDate from a java.sql.Time value '" + obj + "'");
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalDateTime.of(EPOCH, time);
        }
        if (obj instanceof java.sql.Date) {
            java.sql.Date sqlDate = (java.sql.Date) obj;
            LocalDate date = sqlDate.toLocalDate();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Date) {
            java.sql.Date sqlDate = (java.sql.Date) obj;
            LocalDate date = sqlDate.toLocalDate();
            return LocalDateTime.of(date, LocalTime.MIDNIGHT);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Date) {
            java.sql.Date sqlDate = (java.sql.Date) obj;
            LocalDate date = sqlDate.toLocalDate();
            return LocalDateTime.of(date, LocalTime.MIDNIGHT);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalDateTime.of(date, LocalTime.MIDNIGHT);
        }
        if (obj instanceof java.sql.Time) {
            LocalTime localTime = toLocalTime(obj);
            return LocalDateTime.of(EPOCH, localTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalDateTime.of(EPOCH, localTime);
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalDateTime.of(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalDateTime.of(
                    timestamp.getYear() + 1900,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.sql.Timestamp) {
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalDateTime.of(
                    timestamp.getYear() + 1900,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getNanos());
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
            if (millis < 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        }
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            long millis = (int) (date.getTime() % MILLISECONDS_PER_SECOND);
            if (millis < 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            session.setPassword(password);

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
            session.setPassword(password);

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.mysql.cj` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/MySqlCatalog.java`
#### Snippet
```java

    /**
     * @see com.mysql.cj.MysqlType
     * @see ResultSetImpl#getObjectStoredProc(int, int)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
    /**
     * Constructs the dialects delete statement for a single row with the given condition. The
     * returned string will be used as a {@link java.sql.PreparedStatement}. Fields in the statement
     * must be in the same order as the {@code fieldNames} parameter.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
    /**
     * Constructs the dialects insert statement for a single row. The returned string will be
     * used as a {@link java.sql.PreparedStatement}. Fields in the statement must be in the same
     * order as the {@code fieldNames} parameter.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
    /**
     * Constructs the dialects update statement for a single row with the given condition. The
     * returned string will be used as a {@link java.sql.PreparedStatement}. Fields in the statement
     * must be in the same order as the {@code fieldNames} parameter.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
     * UPDATE}, or PostgreSQL's {@code ON CONFLICT... DO UPDATE SET..}.
     *
     * If supported, the returned string will be used as a {@link java.sql.PreparedStatement}.
     * Fields in the statement must be in the same order as the {@code fieldNames} parameter.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
    /**
     * Generates a query to determine if a row exists in the table. The returned string will be used
     * as a {@link java.sql.PreparedStatement}.
     *
     * <pre>{@code
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case DATE:
                    LocalDate localDate = (LocalDate) row.getField(fieldIndex);
                    statement.setDate(statementIndex, java.sql.Date.valueOf(localDate));
                    break;
                case TIME:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case TIME:
                    LocalTime localTime = (LocalTime) row.getField(fieldIndex);
                    statement.setTime(statementIndex, java.sql.Time.valueOf(localTime));
                    break;
                case TIMESTAMP:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                case TIMESTAMP:
                    LocalDateTime localDateTime = (LocalDateTime) row.getField(fieldIndex);
                    statement.setTimestamp(statementIndex, java.sql.Timestamp.valueOf(localDateTime));
                    break;
                case BYTES:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                    break;
                case NULL:
                    statement.setNull(statementIndex, java.sql.Types.NULL);
                    break;
                case MAP:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.connectors.seatunnel.jdbc.internal.xa` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java

/**
 * Default {@link org.apache.seatunnel.connectors.seatunnel.jdbc.internal.xa.XaFacade} implementation.
 */
public class XaFacadeImplAutoLoad
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java
        if (!autoAck) {
            if (usesCorrelationId) {
                com.google.common.base.Preconditions.checkNotNull(
                        correlationId,
                        "RabbitMQ source was instantiated with usesCorrelationId set to "
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/inject/BigDecimalInjectFunction.java`
#### Snippet
```java
    @Override
    public void injectFields(PreparedStatement statement, int index, Object value) throws SQLException {
        statement.setBigDecimal(index, (java.math.BigDecimal) value);
    }

```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Function, Object\>() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
        final RowToJsonConverter[] fieldConverters =
                Arrays.stream(rowType.getFieldTypes())
                        .map(new Function<SeaTunnelDataType<?>, Object>() {
                            @Override
                            public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Anonymous2MethodRef
Anonymous new IntFunction() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                            }
                        })
                        .toArray(new IntFunction<RowToJsonConverter[]>() {
                            @Override
                            public RowToJsonConverter[] apply(int value) {
```

### Anonymous2MethodRef
Anonymous new Function, Object\>() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
        final JsonToRowConverter[] fieldConverters =
            Arrays.stream(rowType.getFieldTypes())
                .map(new Function<SeaTunnelDataType<?>, Object>() {
                    @Override
                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Anonymous2MethodRef
Anonymous new IntFunction() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                    }
                })
                .toArray(new IntFunction<JsonToRowConverter[]>() {
                    @Override
                    public JsonToRowConverter[] apply(int value) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BOOLEAN:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case INT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BIGINT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DATE:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case TIME:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case TIMESTAMP:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case FLOAT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DOUBLE:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case STRING:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BYTES:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Anonymous2MethodRef
Anonymous new JsonToRowConverter() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DECIMAL:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java
        ConnectionInfo info = con2infoMap.get(channel);
        HashSet<ChannelSftp> cons = idleConnections.get(info);
        if (cons == null) {
            cons = new HashSet<ChannelSftp>();
            idleConnections.put(info, cons);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        factories.forEach(plugin -> {
            if (TableSourceFactory.class.isAssignableFrom(plugin.getClass())) {
                if (plugins.get(PluginType.SOURCE) == null) {
                    plugins.put(PluginType.SOURCE, new LinkedHashMap());
                }
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java

            if (TableSinkFactory.class.isAssignableFrom(plugin.getClass())) {
                if (plugins.get(PluginType.SINK) == null) {
                    plugins.put(PluginType.SINK, new LinkedHashMap());
                }
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java

            if (TableTransformFactory.class.isAssignableFrom(plugin.getClass())) {
                if (plugins.get(PluginType.TRANSFORM) == null) {
                    plugins.put(PluginType.TRANSFORM, new LinkedHashMap());
                }
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Function, Object\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
        final RowToJsonConverter[] fieldConverters =
                Arrays.stream(rowType.getFieldTypes())
                        .map(new Function<SeaTunnelDataType<?>, Object>() {
                            @Override
                            public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Convert2Lambda
Anonymous new IntFunction() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                            }
                        })
                        .toArray(new IntFunction<RowToJsonConverter[]>() {
                            @Override
                            public RowToJsonConverter[] apply(int value) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
    private JsonToRowConverter createArrayConverter(ArrayType<?, ?> type) {
        JsonToRowConverter valueConverter = createConverter(type.getElementType());
        return new JsonToRowConverter() {
            @Override
            public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new Function, Object\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
        final JsonToRowConverter[] fieldConverters =
            Arrays.stream(rowType.getFieldTypes())
                .map(new Function<SeaTunnelDataType<?>, Object>() {
                    @Override
                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Convert2Lambda
Anonymous new IntFunction() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                    }
                })
                .toArray(new IntFunction<JsonToRowConverter[]>() {
                    @Override
                    public JsonToRowConverter[] apply(int value) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
        final String[] fieldNames = rowType.getFieldNames();

        return new JsonToRowConverter() {
            @Override
            public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java

    private JsonToRowConverter wrapIntoNullableConverter(JsonToRowConverter converter) {
        return new JsonToRowConverter() {
            @Override
            public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
    private JsonToRowConverter createMapConverter(MapType<?, ?> type) {
        JsonToRowConverter valueConverter = createConverter(type.getValueType());
        return new JsonToRowConverter() {
            @Override
            public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new Consumer\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
            public Object convert(JsonNode jsonNode) {
                Map<Object, Object> value = new HashMap<>();
                jsonNode.fields().forEachRemaining(new Consumer<Map.Entry<String, JsonNode>>() {
                    @Override
                    public void accept(Map.Entry<String, JsonNode> entry) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                return createRowConverter((SeaTunnelRowType) type);
            case NULL:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BOOLEAN:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case TINYINT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case SMALLINT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case INT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BIGINT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DATE:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case TIME:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case TIMESTAMP:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case FLOAT:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DOUBLE:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case STRING:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case BYTES:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new JsonToRowConverter() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                };
            case DECIMAL:
                return new JsonToRowConverter() {
                    @Override
                    public Object convert(JsonNode jsonNode) {
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
        }
        String pluginJarPrefix = optional.get().getValue().unwrapped().toString();
        File[] targetPluginFiles = pluginDir.toFile().listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
```

