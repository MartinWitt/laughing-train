# marmaray 
 
# Bad smells
I found 627 bad smells with 73 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 125 | false |
| NullableProblems | 72 | false |
| OptionalGetWithoutIsPresent | 62 | false |
| BoundedWildcard | 40 | false |
| Convert2MethodRef | 29 | false |
| SimplifyStreamApiCallChains | 26 | false |
| UnnecessaryToStringCall | 19 | true |
| OptionalContainsCollection | 18 | false |
| UnnecessaryLocalVariable | 15 | true |
| RedundantFieldInitialization | 12 | false |
| UtilityClassWithoutPrivateConstructor | 12 | true |
| UnnecessaryFullyQualifiedName | 10 | false |
| NonProtectedConstructorInAbstractClass | 10 | true |
| MalformedFormatString | 9 | false |
| RedundantMethodOverride | 8 | false |
| Lombok | 8 | false |
| InnerClassMayBeStatic | 8 | true |
| ReturnNull | 8 | false |
| AccessStaticViaInstance | 7 | false |
| CodeBlock2Expr | 7 | true |
| UnusedAssignment | 7 | false |
| ObsoleteCollection | 6 | false |
| StringOperationCanBeSimplified | 6 | false |
| WrapperTypeMayBePrimitive | 5 | false |
| UnnecessaryUnboxing | 5 | false |
| DataFlowIssue | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| EmptyMethod | 4 | false |
| RedundantImplements | 4 | false |
| ConstantValue | 4 | false |
| IOResource | 4 | false |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| ManualMinMaxCalculation | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| Java8MapForEach | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UnnecessarySuperQualifier | 2 | false |
| SlowListContainsAll | 2 | false |
| SynchronizeOnThis | 2 | false |
| RedundantStringFormatCall | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| UnnecessaryBoxing | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| NotNullFieldNotInitialized | 1 | false |
| RegExpSimplifiable | 1 | false |
| BooleanConstructor | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| NestedAssignment | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| RedundantCompareToJavaTime | 1 | false |
| OptionalIsPresent | 1 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| FinallyBlockCannotCompleteNormally | 1 | false |
| RedundantCollectionOperation | 1 | false |
| WrongPackageStatement | 1 | false |
| StringEqualsEmptyString | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| BusyWait | 1 | false |
| ThrowableNotThrown | 1 | false |
| UseBulkOperation | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(DISPERSAL_TYPE).isPresent()) {
            final String dispersalType = this.conf.getProperty(DISPERSAL_TYPE).get().trim().toUpperCase();
            final Boolean isValid = EnumUtils.isValidEnum(DispersalType.class, dispersalType);
            if (isValid) {
                this.dispersalType = DispersalType.valueOf(dispersalType);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(FILE_SINK_TYPE).isPresent()) {
            final String sinkName = this.conf.getProperty(FILE_SINK_TYPE).get().trim().toUpperCase();
            final Boolean isValid = EnumUtils.isValidEnum(FileSinkType.class, sinkName);
            if (isValid) {
                this.sinkType = FileSinkType.valueOf(sinkName);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        if (HoodieIndex.IndexType.HBASE.equals(getHoodieIndexType())) {
            final String quorum = getHoodieIndexZookeeperQuorum();
            final Integer port = getHoodieIndexZookeeperPort();
            final String zkZnodeParent  = getZkZnodeParent();
            createHbaseIndexTableIfNotExists(topicName, quorum, port.toString(), zkZnodeParent,
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    private void writeMetadataFile() {
        final Long currentTime = System.currentTimeMillis();

        final String fileLocation = new Path(this.baseMetadataPath, currentTime.toString()).toString();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            }

            final Long currentTime = System.currentTimeMillis();
            final String checkpoint = serializeMetadataMap();
            String cassandraCols = String.format("job, time_stamp, checkpoint");
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `this.timedOut` from instance context
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
        this.sc = sc;
        this.startTime = getCurrentTime();
        this.timedOut = false;
        log.info("Initializing TimeoutManager, job_timeout = {}ms, stage_timeout = {}ms",
                this.jobTimeoutMillis, this.stageTimeoutMillis);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `this.timedOut` from instance context
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                    log.error("The spark job is taking longer than {} ms. Cancelling all jobs...",
                            this.jobTimeoutMillis);
                    this.timedOut = true;
                    this.sc.cancelAllJobs();
                    throw new TimeoutException("The spark job is timing out");
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `this.timedOut` from instance context
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                        log.error("Cancelling stage {}-{} and its related jobs due to inactivity... details: {}",
                                stage.id(), stage.name(), stage.details());
                        this.timedOut = true;
                        this.sc.cancelStage(stage.id());
                    }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
                    currDir = currDir.getParent();
                }
                final Stack<String> tmpFolders = new Stack<>();
                while (currDir != null && basePath.toUri().getRawPath().compareTo(currDir.toUri().getRawPath()) <= 0) {
                    tmpFolders.push(currDir.toUri().getRawPath());
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
                    currDir = currDir.getParent();
                }
                final Stack<String> tmpFolders = new Stack<>();
                while (currDir != null && basePath.toUri().getRawPath().compareTo(currDir.toUri().getRawPath()) <= 0) {
                    tmpFolders.push(currDir.toUri().getRawPath());
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
                        // Uses FileStatus's sorting based on name.
                        Arrays.sort(dirFiles);
                        final Stack<String> levelDirStack = new Stack<>();
                        for (final FileStatus nextFile : dirFiles) {
                            final String nextRawFilePath = nextFile.getPath().toUri().getRawPath();
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
                        // Uses FileStatus's sorting based on name.
                        Arrays.sort(dirFiles);
                        final Stack<String> levelDirStack = new Stack<>();
                        for (final FileStatus nextFile : dirFiles) {
                            final String nextRawFilePath = nextFile.getPath().toUri().getRawPath();
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
        @NonNull final Path toProcessAfter, @NonNull final Path toProcessBefore) throws IOException {
        return new Iterator<FileStatus>() {
            private final Stack<String> pathsToProcess = new Stack<>();
            private final Deque<FileStatus> newFilesQ = new LinkedList();
            private String lastProcessedFile = toProcessAfter.toUri().getRawPath();
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
        @NonNull final Path toProcessAfter, @NonNull final Path toProcessBefore) throws IOException {
        return new Iterator<FileStatus>() {
            private final Stack<String> pathsToProcess = new Stack<>();
            private final Deque<FileStatus> newFilesQ = new LinkedList();
            private String lastProcessedFile = toProcessAfter.toUri().getRawPath();
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `map1.keySet()` may be replaced with 'entrySet()' iteration
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                    return false;
                }
                for (String key : map1.keySet()) {
                    if (!map2.containsKey(key)) {
                        return false;
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
public class JobManagerMetadataTracker {

    @NonNull
    private IMetadataManager metadataManager;
    @Getter
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`//*` can be simplified to '/+'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`stalledStages.size() > 0` can be replaced with '!stalledStages.isEmpty()'
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java

                final List<Stage> stalledStages = this.stalledStages();
                if (stalledStages.size() > 0) {
                    for (Stage stage : stalledStages) {
                        log.error("Cancelling stage {}-{} and its related jobs due to inactivity... details: {}",
```

### SizeReplaceableByIsEmpty
`this.workUnits.size() > 0` can be replaced with '!this.workUnits.isEmpty()'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileWorkUnitCalculator.java/FileWorkUnitCalculator.java`
#### Snippet
```java
        @Override
        public boolean hasWorkUnits() {
            return this.workUnits.size() > 0;
        }

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
            log.info("Write data with megabytes: {}", rddSize);
            final int suggestedNum = (int) Math.round(rddSize / this.conf.getFileSizeMegaBytes());
            parNum = suggestedNum < MIN_PARTITION_NUM ? MIN_PARTITION_NUM : suggestedNum;
        }
        log.info("Write data with repartition number: {} ", parNum);
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
        final int partNum = getRepartitionNum(tmp);
        final int desiredDigit = (int) Math.floor(Math.log10(partNum) + 1);
        this.digitNum = desiredDigit > DEFAULT_DIGIT_NUM ? desiredDigit : DEFAULT_DIGIT_NUM;

        if (this.conf.getFileType().equals("csv")) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
         */
        final int readParallelism;
        if (workUnits.size() < this.conf.getReadParallelism()) {
            readParallelism = this.conf.getReadParallelism();
        } else {
```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
        } else {
            throw new IllegalArgumentException("Not supported :" + defaultValue.getClass());
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends StringValue`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    }

    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
```

### BoundedWildcard
Can generalize to `? extends DataFeedMetrics`
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
    public static StructType generateSchemaFromParquet(@NonNull final FileSystem fs,
                                                       @NotEmpty final String parquetDir,
                                                       @NonNull final Optional<DataFeedMetrics> dataFeedMetrics)
            throws IOException {

```

### BoundedWildcard
Can generalize to `? extends AvroPayload`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
     */
    @Override
    public JavaPairRDD<String, String> convertAll(@NonNull final JavaRDD<AvroPayload> data) {
        try {
            Preconditions.checkNotNull(data.first());
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `marmaray/src/main/java/com/uber/marmaray/common/status/BaseStatus.java`
#### Snippet
```java
    }

    public void addExceptions(@NonNull final Collection<Exception> throwableCollection) {
        throwableCollection.forEach(this::addException);
    }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
    public CassandraSinkCQLDataConverter(@NonNull final Schema inputSchema,
                                         @NonNull final Configuration conf,
                                         @NonNull final Optional<Set<String>> fieldsToConvert,
                                         @NonNull final List<String> requiredFields,
                                         @NonNull final TimestampInfo timestampInfo,
```

### BoundedWildcard
Can generalize to `? extends Dag`
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java

    @Override
    public List<Dag> sort(@NonNull final Queue<Dag> inputJobDags) {
        final Map<String, Integer> initialTopicOrdering = new HashMap<>();
        final AtomicInteger preTopicOrderingCounter = new AtomicInteger(0);
```

### BoundedWildcard
Can generalize to `? extends StringValue`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
    }

    private List<String> listPartitionsAfterCheckpoint(final Optional<StringValue> checkpoint) throws IOException {
        final List<String> partitions = getExistingPartitions();

```

### BoundedWildcard
Can generalize to `? super CassandraSchemaField`
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchema.java`
#### Snippet
```java
    }

    public CassandraSchema(final String keySpace, final String tableName, final List<CassandraSchemaField> fields) {
        this.keySpace = keySpace;
        this.tableName = tableName;
```

### BoundedWildcard
Can generalize to `? extends AvroPayload`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     */
    @Override
    public String getHeader(@NonNull final JavaRDD<AvroPayload> data) {
        final AvroPayload line = data.first();
        final String[] headList
```

### BoundedWildcard
Can generalize to `? extends AvroPayload`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     */
    @Override
    public JavaPairRDD<String, String> convertAll(@NonNull final JavaRDD<AvroPayload> data) {
        try {
            Preconditions.checkArgument(!data.isEmpty());
```

### BoundedWildcard
Can generalize to `? extends Date`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
                                    @NotEmpty final String genericBaseDataPath,
                                    @NotEmpty final String partitionKeyName,
                                    @NonNull final Optional<Date> startDate,
                                    @NonNull final FileSystem fileSystem) throws IOException {
        super(metadataKey, genericBaseDataPath, fileSystem);
```

### BoundedWildcard
Can generalize to `? extends StringValue`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    @Override
    public Optional<String> getNextPartition(
            @NotEmpty final Optional<StringValue> latestCheckPoint) throws IOException {

        if (this.isSinglePartition()) {
```

### BoundedWildcard
Can generalize to `? extends ClusterKey`
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    public CassandraSchemaManager(@NonNull final CassandraSchema schema,
                                  @NonNull final List<String> partitionKeys,
                                  @NonNull final List<ClusterKey> clusteringKeys,
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
```

### BoundedWildcard
Can generalize to `? extends Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    public CassandraSinkDataConverter(@NonNull final Schema inputSchema,
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
```

### BoundedWildcard
Can generalize to `? extends DataFeedMetrics`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     */
    private ByteBuffer getByteBuffer(@NonNull final Schema.Field field, @NonNull final Object rawData,
                                            @NonNull final Optional<DataFeedMetrics> metrics) {
        final ByteBuffer bb;
        final FieldInfo fieldInfo = fieldInfoMap.get().get(field);
```

### BoundedWildcard
Can generalize to `? extends Schema.Field`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java

    @NonNull
    private Map<Schema.Field, FieldInfo>  createFieldInfoMap(@NonNull final List<Schema.Field> fields) {

        final Map<Schema.Field, FieldInfo> fieldInfoMap = Maps.newHashMapWithExpectedSize(fields.size());
```

### BoundedWildcard
Can generalize to `? super Class`
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
    }

    public static void addClassesIfFound(@NonNull final List<Class> serializableClasses,
                                         @NonNull final List<String> classList) {
        for (final String className : classList) {
```

### BoundedWildcard
Can generalize to `? extends JavaRDD`
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * @param writesStatuses
     */
    private void updateSinkStat(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent()) {
            final LongAccumulator avgRecordSizeCounter = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### BoundedWildcard
Can generalize to `? extends JavaRDD`
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    }

    private void logWriteMetrics(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent() && this.dataFeedMetrics.isPresent()) {
            final LongAccumulator totalCount = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### BoundedWildcard
Can generalize to `? super HoodieRecord`
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieUtil.java`
#### Snippet
```java

    public static <T extends HoodieRecordPayload> JavaRDD<HoodieRecord<T>> combineRecords(
            final JavaRDD<HoodieRecord<T>> records, final Function<HoodieRecord<T>, Object> recordKeyFunc,
            final int parallelism) {
        return records
```

### BoundedWildcard
Can generalize to `? extends SubDagExecutionStatus`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

    // Helper method to wait for parallel tasks to finish execution.
    private void waitForTasksToFinish(@NonNull final Queue<SubDagExecutionStatus> statuses) {
        while (!statuses.isEmpty()) {
            final SubDagExecutionStatus status = statuses.poll();
```

### BoundedWildcard
Can generalize to `? extends Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
                                    @NotEmpty final String tableName,
                                    @NonNull final TimestampInfo timestampInfo,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this.keySpace = keySpace;
        this.tableName = tableName;
```

### BoundedWildcard
Can generalize to `? extends ErrorData`
in `marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
                                                     @NonNull final Configuration conf,
                                                     @NonNull final Optional<String> tableName,
                                                     @NonNull final RDDWrapper<ErrorData> errorData,
                                                     @NonNull final ErrorExtractor errorExtractor) {

```

### BoundedWildcard
Can generalize to `? extends VoidFunction`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
        }

        private <T> void processRecordHandler(@NonNull final Optional<VoidFunction<T>> recordHandler,
                                              @NonNull final T data, @NotEmpty final String recordHandlerType) {
            if (recordHandler.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends Function`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
    public KafkaSourceDataConverter(@NonNull final ISchemaServiceReader schemaServiceReader,
                                    @NonNull final Configuration conf,
                                    @NonNull final List<Function<GenericRecord, GenericRecord>> updateFunctions,
                                    @NonNull final List<String> fieldsToCache,
                                    @NonNull final ErrorExtractor errorExtractor) {
```

### BoundedWildcard
Can generalize to `? extends TreeMap`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    public JavaRDD<byte[]> readWithMultiReaderPerPartition(
        @NonNull final List<OffsetRange> workUnits,
        @NonNull final Map<Integer, TreeMap<Long, Integer>> kafkaPartitionOffsetToSparkPartitionMap) {
        final List<OffsetRange> newWorkUnits = new LinkedList<>();
        for (final OffsetRange workUnit : workUnits) {
```

### BoundedWildcard
Can generalize to `? extends TreeMap`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        @NonNull final List<OffsetRange> workUnits,
        final int readParallelism,
        @NonNull final Map<Integer, TreeMap<Long, Integer>> kafkaPartitionOffsetToSparkPartitionMap) {
        return readKafkaData(workUnits)
            .mapToPair(
```

### BoundedWildcard
Can generalize to `? extends DataFeedMetrics`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
     * report read size metrics per partition and total along with individual record stats like average size
     */
    private static void reportReadMetrics(@NonNull final Optional<DataFeedMetrics> topicMetrics,
                                          @NonNull final LongAccumulator totalDataReadInBytes,
                                          final long totalPartitions) {
```

### BoundedWildcard
Can generalize to `? extends JavaSparkContext`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java

    public KafkaSource(@NonNull final KafkaSourceConfiguration conf,
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
```

### BoundedWildcard
Can generalize to `? extends Function`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
```

### BoundedWildcard
Can generalize to `? extends VoidFunction`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
        this.jsc = jsc;
```

### BoundedWildcard
Can generalize to `? extends StringValue`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

    @Override
    public void initPreviousRunState(@NonNull final IMetadataManager<StringValue> metadataManager) {
        final String topicName = this.conf.getTopicName();
        final Map<Integer, Long> metadata = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super StringValue`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

    @Override
    public void saveNextRunState(@NonNull final IMetadataManager<StringValue> metadataManager,
                                 final KafkaRunState nextRunState) {
        final String topicName = this.conf.getTopicName();
```

### BoundedWildcard
Can generalize to `? extends PartitionMessages`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

    private List<OffsetRange> calculatePartitionOffsetRangesToRead(
        @NonNull final List<PartitionMessages> partitionMessages,
        @NonNull final Map<Integer, Long> partitionStartOffsets, final long numMessages) {
        // This will make sure that we can read more messages from partition with more than average messages per
```

### BoundedWildcard
Can generalize to `? super K`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java

    // passing datafeed metric from high level job
    public JobDag(@NonNull final ISource<K, R> source,
                  @NonNull final ISink sink,
                  @NonNull final IMetadataManager<V> metadataManager,
```

### BoundedWildcard
Can generalize to `? super R`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
                  @NonNull final ISink sink,
                  @NonNull final IMetadataManager<V> metadataManager,
                  @NonNull final IWorkUnitCalculator<T, R, K, V> workUnitCalculator,
                  @NotEmpty final String jobName,
                  @NotEmpty final String dataFeedName,
```

### BoundedWildcard
Can generalize to `? extends K`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
                  @NonNull final ISink sink,
                  @NonNull final IMetadataManager<V> metadataManager,
                  @NonNull final IWorkUnitCalculator<T, R, K, V> workUnitCalculator,
                  @NotEmpty final String jobName,
                  @NotEmpty final String dataFeedName,
```

### BoundedWildcard
Can generalize to `? super K`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    }

    public JobDag(@NonNull final ISource<K, R> source,
                  @NonNull final JobSubDag sinkDag,
                  @NonNull final IMetadataManager<V> metadataManager,
```

### BoundedWildcard
Can generalize to `? super R`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
                  @NonNull final JobSubDag sinkDag,
                  @NonNull final IMetadataManager<V> metadataManager,
                  @NonNull final IWorkUnitCalculator<T, R, K, V> workUnitCalculator,
                  @NotEmpty final String jobName,
                  @NotEmpty final String dataFeedName,
```

### BoundedWildcard
Can generalize to `? extends K`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
                  @NonNull final JobSubDag sinkDag,
                  @NonNull final IMetadataManager<V> metadataManager,
                  @NonNull final IWorkUnitCalculator<T, R, K, V> workUnitCalculator,
                  @NotEmpty final String jobName,
                  @NotEmpty final String dataFeedName,
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/data/RDDWrapper.java`
#### Snippet
```java

    @Getter
    @NonNull
    final JavaRDD<T> data;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java

    @Getter
    @NonNull
    private final String tableName;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java

    @Getter
    @NonNull
    private final SinkStat currentStat = new SinkStat();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java
    private final String tableName;

    @NonNull
    private final IMetadataManager<StringValue> metadataManager;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
    public static final class Builder<BT, BR> {
        private Configuration conf = new Configuration();
        @NonNull
        private final IFunctionThrowsException<BT, BR> func;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
@Slf4j
public class RetryableFunction<T, R> {
    @NonNull protected final IRetryStrategy retryStrategy;
    @NonNull protected final IFunctionThrowsException<T, R> func;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
public class RetryableFunction<T, R> {
    @NonNull protected final IRetryStrategy retryStrategy;
    @NonNull protected final IFunctionThrowsException<T, R> func;

    public RetryableFunction(@NonNull final IFunctionThrowsException<T, R> func,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaOffsetResetter.java`
#### Snippet
```java
    private final IKafkaOffsetSelector offsetSelector;

    @NonNull
    @Getter
    @Setter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaOffsetResetter.java`
#### Snippet
```java
 */
public class KafkaOffsetResetter {
    @NonNull
    @Getter
    private final IKafkaOffsetSelector offsetSelector;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/Job.java`
#### Snippet
```java
public class Job {

    @NonNull
    private final JobDag jobDag;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/Job.java`
#### Snippet
```java
    @NonNull
    private final JobDag jobDag;
    @NonNull
    private final Configuration conf;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        @NonNull
        private final LockManager lockManager;
        @NonNull
        private final String jobFrequency;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        private static final String DATA_FEED_TAG = "data_feed_name";

        @NonNull
        private final LockManager lockManager;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        @NonNull
        private final TimerMetric managerTimerMetric;
        @NonNull
        private final HashMap<String, TimerMetric> dagTimerMetricMap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        private final String jobFrequency;

        @NonNull
        private final TimerMetric managerTimerMetric;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
    private static final Object lock = new Object();

    @NonNull
    private final Queue<Dag> jobDags = new ConcurrentLinkedDeque<>();
    private final JobDagActions postJobManagerActions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final Configuration configuration;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final List<Class> userSerializationClasses;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final List<Schema> avroSchemas;
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    private static Optional<ThreadPoolService> service = Optional.absent();

    @NonNull
    private final ExecutorService threadPool;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/TSBasedHoodieSinkDataConverter.java`
#### Snippet
```java
    @NotEmpty
    private final String partitionFieldName;
    @NonNull
    private final TimeUnit timeUnit;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
public class SparkFactory {

    @NonNull
    @Getter
    private final SparkArgs sparkArgs;
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
    void saveChanges() throws IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
 */
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
 */
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
    void saveChanges() throws IOException;
    Set<String> getAllKeys();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java
    private final long currentTime;

    @NonNull
    private final JobManagerMetadataTracker tracker;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
    protected final String rawDataRootPath;

    @NonNull
    protected final FileSystem fileSystem;

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/Reportable.java`
#### Snippet
```java
 */
public interface Reportable {
    void gaugeAll(@NonNull final IReporter reporter);
}

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/IReporter.java`
#### Snippet
```java
 */
public interface IReporter<T extends Metric> {
    void gauge(@NonNull final T m);

    void finish();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
    private final LockManagerConfiguration lockConf;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    @NonNull
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
@Slf4j
public class LockManager implements AutoCloseable {
    @NonNull
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @NonNull
    private final FileSystem fileSystem;

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/IMetricable.java`
#### Snippet
```java
        Take a DataFeedMetrics to report metrics to, if present
     */
    void setDataFeedMetrics(@NonNull final DataFeedMetrics dataFeedMetrics);

    /*
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/IMetricable.java`
#### Snippet
```java
        Take a JobMetrics to report metrics to, if present
     */
    void setJobMetrics(@NonNull final JobMetrics jobMetrics);
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @AllArgsConstructor
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Setter
    @NonNull
    @Getter
    private HoodieSinkOperations hoodieSinkOperations = new HoodieSinkOperations();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Setter
    @NonNull
    @Getter
    // If set then it is used for creating new hoodie commit.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    @Setter
    @NonNull
    /**
     * If set then it is used for sorting records during {@link HoodieWriteClientWrapper#bulkInsert(JavaRDD, String)}
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/schema/ISchemaService.java`
#### Snippet
```java
     */
    interface ISchemaServiceWriter {
        byte[] write(@NonNull final GenericRecord record) throws InvalidDataException;
    }
}
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/schema/ISchemaService.java`
#### Snippet
```java
     */
    interface ISchemaServiceReader {
        GenericRecord read(@NonNull final byte[] buffer) throws InvalidDataException;
    }

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
     * @param payload {@link AvroPayload}.
     */
    protected abstract String getPartitionPath(@NonNull final AvroPayload payload) throws Exception;

    protected HoodieRecordPayload getPayload(@NonNull final AvroPayload payload) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/DagPayload.java`
#### Snippet
```java
public class DagPayload implements IPayload<JavaRDD<AvroPayload>> {

    @NonNull
    @Getter
    private final JavaRDD<AvroPayload> data;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java
public class SingleSinkSubDag extends JobSubDag {

    @NonNull
    @Getter
    private final ISink sink;
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @return payload for child dag
     */
    protected Optional<IPayload> getDataForChild(@NonNull final JobSubDag childSubDag) {
        return Optional.absent();
    }
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @param data input payload
     */
    protected abstract void executeNode(@NonNull final Optional<IPayload> data);

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
public class JobManagerMetadataTracker {

    @NonNull
    private IMetadataManager metadataManager;
    @Getter
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    }

    public void setDataFeedMetrics(@NonNull final DataFeedMetrics topicMetrics) {
        this.topicMetrics = Optional.of(topicMetrics);
    }
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    }

    protected abstract List<ConverterResult<ID, OD>> convert(@NonNull ID data) throws Exception;

    private void reportMetrics(final long rddSize,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected ErrorExtractor errorExtractor;

    @NonNull
    protected Optional<DataFeedMetrics> topicMetrics = Optional.absent();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    private static final String CONVERTER_TAG_NAME = "CONVERTER_NAME";

    @Getter @NonNull
    protected Configuration conf;
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
     * with no exceptions from {@link #convert(Object)}.
     */
    @NonNull
    @Setter
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();

    @NonNull
    protected ErrorExtractor errorExtractor;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
     * {@link #convert(Object)}.
     */
    @NonNull
    @Setter
    protected Optional<VoidFunction<ID>> failureRecordHandler = Optional.absent();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java
public class AvroPayload implements IPayload<GenericRecord>, IData, Serializable {

    @NonNull
    private IAvroPayloadInternal payloadInterval;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java
    private static class AvroPayloadInternal implements IAvroPayloadInternal {

        @NonNull
        private final GenericRecord record;

```

### NullableProblems
Primitive type members cannot be annotated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
     */
    private void uploadFileToS3(@NonNull final FileSystem fileSystem, @NonNull final Path path,
                                @NonNull final int partNum, final Date date) {
        byte[] contentBytes = new byte [0];
        log.info("Start upload file to S3 with partition num: {}", partNum);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    protected Optional<ValidData<OD>> successData;

    @NonNull
    @Getter
    protected Optional<ErrorData<ID>> errorData;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
public class ConverterResult<ID, OD> implements Serializable {

    @NonNull
    @Getter
    protected Optional<ValidData<OD>> successData;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
     *  transferring to the ISource
     */
    @NonNull
    @Getter
    private final List<Function<GenericRecord, GenericRecord>> updateFunctions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
    @Getter
    private final ISchemaServiceReader schemaServiceReader;
    @NonNull
    @Getter
    private final List<String> fieldsToCache;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
 */
public class KafkaSourceDataConverter extends SourceDataConverter<Schema, byte[]> {
    @NonNull
    @Getter
    private final ISchemaServiceReader schemaServiceReader;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private IKafkaOffsetSelector offsetSelector = new KafkaBootstrapOffsetSelector();

    @NonNull
    @Getter
    @Setter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final JobSubDag sinkDag;
    @NonNull
    private final IMetadataManager<V> metadataManager;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    public static final String LAST_RUNTIME_METADATA_KEY = "runtime";
    public static final String LAST_EXECUTION_METADATA_KEY = "last_execution";
    @NonNull
    private final ISource<K, R> source;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final IMetadataManager<V> metadataManager;
    @NonNull
    private final IWorkUnitCalculator<T, R, K, V> workUnitCalculator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    private final JobDagActions postJobDagActions;

    @NonNull
    private final JobMetrics jobMetrics;
    @Getter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final ISource<K, R> source;
    @NonNull
    private final JobSubDag sinkDag;
    @NonNull
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.uber.marmaray.common.configuration.CassandraMetadataManagerConfiguration.getMandatoryProperties()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
    public CassandraMetadataManagerConfiguration(@NonNull final Configuration conf) {
        super(conf);
        ConfigUtil.checkMandatoryProperties(conf, this.getMandatoryProperties());

        this.username = conf.getProperty(USERNAME).get();
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.getTimedOut()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
                }
            );
            if (TimeoutManager.getInstance().getTimedOut()) {
                log.error("Time out error while running job.");
                isSuccess.set(false);
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
        this.sc = sc;
        this.startTime = getCurrentTime();
        this.timedOut = false;
        log.info("Initializing TimeoutManager, job_timeout = {}ms, stage_timeout = {}ms",
                this.jobTimeoutMillis, this.stageTimeoutMillis);
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                    log.error("The spark job is taking longer than {} ms. Cancelling all jobs...",
                            this.jobTimeoutMillis);
                    this.timedOut = true;
                    this.sc.cancelAllJobs();
                    throw new TimeoutException("The spark job is timing out");
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                        log.error("Cancelling stage {}-{} and its related jobs due to inactivity... details: {}",
                                stage.id(), stage.name(), stage.details());
                        this.timedOut = true;
                        this.sc.cancelStage(stage.id());
                    }
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.getTimedOut()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                 * Once that is done we can remove this code block to report the metric.
                 */
                if (TimeoutManager.getInstance().getTimedOut()) {
                    final LongMetric runTimeError = new LongMetric(DataFeedMetricNames.MARMARAY_JOB_ERROR, 1);
                    runTimeError.addTags(metricTags);
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.common.metadata.CassandraBasedMetadataManager.fields' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        this.oldestTimestamp = Optional.absent();

        this.schema = new CassandraSchema(this.config.getKeyspace(), this.config.getTableName(), this.fields);
        this.schemaManager = new CassandraMetadataSchemaManager(
                this.schema,
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        @NonNull final T defaultValue) {
        if (defaultValue instanceof Integer) {
            return (T) new Integer(conf.getIntProperty(key, ((Integer) defaultValue).intValue()));
        } else if (defaultValue instanceof Long) {
            return (T) new Long(conf.getLongProperty(key, ((Long) defaultValue).longValue()));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Integer(conf.getIntProperty(key, ((Integer) defaultValue).intValue()));
        } else if (defaultValue instanceof Long) {
            return (T) new Long(conf.getLongProperty(key, ((Long) defaultValue).longValue()));
        } else if (defaultValue instanceof String) {
            return (T) conf.getProperty(key, (String) defaultValue);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) conf.getProperty(key, (String) defaultValue);
        } else if (defaultValue instanceof Double) {
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
        } else {
            throw new IllegalArgumentException("Not supported :" + defaultValue.getClass());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
            case BOOLEAN:
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
                throw new JobRuntimeException(
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaSourceConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaSourceConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DoubleMetric.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/LongMetric.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
                                        ModuleTagNames.SINK, ErrorCauseTagNames.COMPRESSION));
                    }
                    final String errorMessage = String.format("Compression codec {} not supported",
                            this.conf.getCompressionCodec());
                    throw new UnsupportedOperationException(errorMessage);
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
        } else if (value == null) {
            // Always fail on null for non-nullable schemas
            throw new JobRuntimeException(String.format("value cannot be null :name {} : schema : {}",
                name, schema));
        } else {
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                    return new GenericData.EnumSymbol(nonOptionalSchema, value.toString());
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
            final Object field = data.first().getField(this.row_identifier);
            if (field == null) {
                final String errorMessage = String.format(
                        "specified row identifier field : {} does not exist", row_identifier);
                if (this.topicMetrics.isPresent()) {
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
        if (!this.lockMap.containsKey(lockKey)) {
            log.error("This lock has not been acquired yet: {}", lockKey);
            throw new JobRuntimeException(String.format("Failed to unlock {}: not acquired.", lockKey));
        }
        final CustomizedInterProcessMutex lockValue = lockMap.get(lockKey);
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
            return hasPartitionKey;
        } catch (IOException e) {
            throw new JobRuntimeException(String.format("Unable to read existing partitions in the HDFS Path {}",
                    this.rawDataRootPath));
        }
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/LongAccumulator.java`
#### Snippet
```java
            this.max = Math.max(this.getMax(), ((LongAccumulator) other).getMax());
        } else {
            final String warnMsg = String.format("Cannot merge {} with {}",
                this.getClass().getName(), other.getClass().getName());
            throw new UnsupportedOperationException(warnMsg);
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
            } catch (ClassNotFoundException e) {
                final String errorStr =
                        String.format("error loading hoodie write status class :{}", writeStatusClassName);
                log.error(errorStr);
                throw new JobRuntimeException(errorStr, e);
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        getTopicPartitions(kafkaConsumer, topicName).stream().forEach(p -> partitions.remove(p.partition()));
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
                partitions.toString(), topicName));
        }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
(AWAIT_TERMINATION_ATTEMPTS - terminationChecks) \* AWAIT_TERMINATION_CHECK_INTERVAL_MS: integer multiplication implicitly cast to long
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                log.info("waiting for tasks to stop.");
                if (!this.threadPool.awaitTermination(
                        (AWAIT_TERMINATION_ATTEMPTS - terminationChecks) * AWAIT_TERMINATION_CHECK_INTERVAL_MS,
                        TimeUnit.MILLISECONDS)) {
                    this.threadPool.shutdownNow();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java
        final Duration elapsed = Duration.between(startTime, endTime);
        log.info("{} elapsed {} milliseconds", this.metricName, elapsed.toMillis());
        super.setMetricValue(elapsed.toMillis());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
            public scala.collection.Iterator<ConsumerRecord<byte[], byte[]>> compute(final Partition thePart,
                final TaskContext context) {
                super.kafkaParams().put(KafkaConfiguration.CLIENT_ID, String
                    .format(KafkaConfiguration.DEFAULT_CLIENT_ID,
                        KafkaConfiguration.getClientId()));
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

        try {
            Preconditions.checkState(fieldNames.containsAll(lowerCasePartitionKeys));
        } catch (Exception e) {
            log.error("One or more of your partition keys (%s) were not found in the available schema fields (%s)",
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
        if (!this.clusteringKeys.isEmpty()) {
            try {
                Preconditions.checkState(fieldNames.containsAll(clusterKeyNames));
            } catch (Exception e) {
                log.error("Clustering keys not found in field names to disperse");
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
            String line;
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                while ((line = br.readLine()) != null) {
                    outputBuffer.append(line + "\n");
                }
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
                }
            }
            return isSuccess.get();
        }
    }
```

## RuleId[id=Lombok]
### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ExceptionRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@ExceptionRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExceptionRecord extends UtilRecord {
```

### Lombok
Not generated 'toString'(): A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java
@Slf4j
@Getter
@ToString
public class TimerMetric extends LongMetric {
    private final Instant startTime;
```

### Lombok
Not generating setter for this field: Setters cannot be generated for final fields.
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Getter
    @Setter
    @NonNull
    /**
```

### Lombok
Not generated 'toString'(): A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DoubleMetric.java`
#### Snippet
```java
 */
@Getter
@ToString
public class DoubleMetric extends Metric<Double> {
    public DoubleMetric(final String metricName) {
```

### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ErrorRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@ErrorRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorRecord extends UtilRecord {
```

### Lombok
Not generated 'toString'(): A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/LongMetric.java`
#### Snippet
```java
 */
@Getter
@ToString
public class LongMetric extends Metric<Long> {
    public LongMetric(final String metricName) {
```

### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/MetricRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@MetricRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MetricRecord extends UtilRecord {
```

### Lombok
Not generating setter for this field: Setters cannot be generated for final fields.
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @Getter
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
    public void registerAccumulators(@NonNull final SparkContext sparkContext) {
        this.registeredKeys.entrySet().forEach(
            entry -> {
                entry.setValue(Optional.of(sparkContext.longAccumulator()));
            }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        this.props.entrySet().forEach(
            entry -> {
                sb.append(entry.getKey() + "<=>" + entry.getValue() + "\n");
            }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java

        /** update all children metadata managers with recent checkpoints*/
        getMetadataMap().forEach((key, value) -> {
                this.metadataManagersList.forEach(metadataManager -> metadataManager.set(key, value));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
        final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                childNodesAtSamePriority.getValue().stream().forEach(
                    childNode -> statuses.add(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            final Set<TopicPartition> topicPartitionSet = new HashSet<>();
            partitions.forEach(
                p -> {
                    topicPartitionSet.add(new TopicPartition(p.topic(), p.partition()));
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        final Set<Integer> partitions = new HashSet<>();
        topicPartitions.stream().forEach(
            tp -> {
                partitions.add(tp.partition());
            }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
        final String topicSpecificName = getTopicSpecificMetadataKey(topicName);
        nextRunState.getPartitionOffsets().entrySet().forEach(
            entry -> {
                metadataManager.set(topicSpecificName + entry.getKey(), new StringValue(entry.getValue().toString()));
            });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
    public static final boolean DEFAULT_LOCK_FREQUENCY = true;

    private static JobManager instance;
    private static final Object lock = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `service` is accessed in both synchronized and unsynchronized contexts
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    public static final long NO_TIMEOUT = -1;
    // Singleton service.
    private static Optional<ThreadPoolService> service = Optional.absent();

    @NonNull
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `instance` is accessed in both synchronized and unsynchronized contexts
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
    public static final TimeUnit FREQUENCY_UNIT = TimeUnit.MINUTES;

    private static TimeoutManager instance = null;

    @Getter
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    public Properties getProperties() {
        final Properties properties = new Properties();
        this.props.forEach((k, v) -> properties.put(k, v));
        return properties;
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
                parseConfigJson(newJsonNode, newPrefix);
            } else {
                props.put(newPrefix, newJsonNode.asText().trim());
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
    public Properties getHoodieInitProperties() {
        final Properties props = new Properties();
        props.put(HoodieTableConfig.HOODIE_TABLE_NAME_PROP_NAME, this.getTableName());
        return props;
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DoubleMetric.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### EmptyMethod
Method only calls its super
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/LongMetric.java`
#### Snippet
```java

    @Override
    public String toString() {
        return super.toString();
    }
```

### EmptyMethod
All implementations of this method are empty
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/IReporter.java`
#### Snippet
```java
    void gauge(@NonNull final T m);

    void finish();
}

```

### EmptyMethod
The method is empty
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSinkOperations.java`
#### Snippet
```java
     * guaranteed to finish before this. Only thing left is the final commit file creation.
     */
    public void preCommitOperations(@NonNull final HoodieConfiguration hoodieConfiguration,
        @NotEmpty final String commitTime) {
        // do nothing.
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    private boolean hiveSupportEnabled = false;

    public void enableHiveSupport() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        private final TimeUnit timeUnit;
        private boolean cancelled = false;
        private boolean done = false;

        private ThreadPoolServiceFuture(@NonNull final Callable wrappedCallable, final long timeout,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        private final long timeout;
        private final TimeUnit timeUnit;
        private boolean cancelled = false;
        private boolean done = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        @Getter
        private final Callable wrappedCallable;
        private Future wrappedFuture = null;
        private LinkedBlockingQueue<Future> wrappedFutureWaitQ = new LinkedBlockingQueue<>();
        private final long timeout;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    private final int numThreads;

    private boolean isShutdown = false;

    private final AtomicInteger currentThreads = new AtomicInteger();
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
        @Getter
        private final AtomicInteger runningTasks = new AtomicInteger(0);
        private long lastActiveTime = 0L;

        public void taskStarted() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
    public static final TimeUnit FREQUENCY_UNIT = TimeUnit.MINUTES;

    private static TimeoutManager instance = null;

    @Getter
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/Reporters.java`
#### Snippet
```java
    @Getter
    private final Queue<IReporter> reporters;
    private boolean isFinished = false;

    public Reporters() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaConfiguration.java`
#### Snippet
```java
    public static final String CLIENT_ID = "client.id";
    public static final String DEFAULT_CLIENT_ID = "marmaray-%s";
    private static int lastClientIdCache = 0;
    private static final List<Integer> clientIdQ = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

        @Getter
        private long totalAvailable = 0;

        @Getter
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

        @Getter
        private long totalInput = 0;

        private void add(final long available, final long current, final long input) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

        @Getter
        private long totalCurrent = 0;

        @Getter
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `marmaray/build.gradle`
#### Snippet
```java
}

description = 'translate jacoco to cobertura'

dependencies {
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `marmaray/src/main/java/com/uber/marmaray/common/data/RawData.java`
#### Snippet
```java
@AllArgsConstructor
@ToString
public class RawData<T> implements IData, Serializable {

    @Getter
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveSourceConfiguration.java`
#### Snippet
```java
 * All properties start with {@link #HIVE_SOURCE_PREFIX}.
 */
public class HiveSourceConfiguration extends HiveConfiguration implements Serializable {

    public static final String HIVE_SOURCE_PREFIX = HIVE_PROPERTY_PREFIX + "source.";
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `marmaray/src/main/java/com/uber/marmaray/utilities/LongAccumulator.java`
#### Snippet
```java

@Slf4j
public final class LongAccumulator extends AccumulatorV2<Long, Long> implements Serializable {
    @Getter
    private Long max;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java
@ToString
@Slf4j
public class AvroPayload implements IPayload<GenericRecord>, IData, Serializable {

    @NonNull
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
            isSuccess.set(false);
            this.jobManagerStatus.setStatus(IStatus.Status.FAILURE);
            if (t instanceof Exception) {
                // trap exceptions and add them to the status
                this.jobManagerStatus.addException((Exception) t);
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer outputBuffer` may be declared as 'StringBuilder'
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
                                        final long timeout,
                                        @NonNull final TimeUnit unit) {
        final StringBuffer outputBuffer = new StringBuffer();

        try {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
        final List<Class> serializableClasses = getDefaultSerializableClasses();
        serializableClasses.addAll(this.sparkArgs.getUserSerializationClasses());
        sparkConf.registerKryoClasses(serializableClasses.toArray(new Class[0]));

        sparkConf.registerAvroSchemas(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
    private void uploadFileToS3(@NonNull final FileSystem fileSystem, @NonNull final Path path,
                                @NonNull final int partNum, final Date date) {
        byte[] contentBytes = new byte [0];
        log.info("Start upload file to S3 with partition num: {}", partNum);
        log.info("Start calculating file bytes.");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
            this.jsc.get().sc(),
            kafkaParams,
            workUnits.toArray(new OffsetRange[0]),
            Collections.emptyMap(),
            true) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    public static void shutdown(final boolean forceShutdown) {
        ThreadPoolService currentService = null;
        synchronized (ThreadPoolService.class) {
            if (!service.isPresent()) {
                return;
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            Map<String, List<PartitionInfo>> topicPartitions = KafkaUtil.topicPartitions;
            if (topicPartitions == null) {
                synchronized (KafkaUtil.class) {
                    if (topicPartitions == null) {
                        topicPartitions = kafkaConsumer.listTopics();
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java
                                ModuleTagNames.SOURCE, ErrorCauseTagNames.FILE_PATH));
            }
            log.error(String.format("Error reading from source path"), e);
            throw new JobRuntimeException(e);
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            final Long currentTime = System.currentTimeMillis();
            final String checkpoint = serializeMetadataMap();
            String cassandraCols = String.format("job, time_stamp, checkpoint");
            String cassandraVals = String.format("'%s', '%s', '%s'",
                    this.job, currentTime.toString(), checkpoint);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `currentService` initializer `null` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
     */
    public static void shutdown(final boolean forceShutdown) {
        ThreadPoolService currentService = null;
        synchronized (ThreadPoolService.class) {
            if (!service.isPresent()) {
```

### UnusedAssignment
Variable `jsc` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final HoodieConfiguration hoodieConf;
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

```

### UnusedAssignment
Variable `dataFeedMetrics` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

    @Getter
    protected transient Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### UnusedAssignment
Variable `metadata` initializer `new HashMap`() is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                        }
                    }
                    HashMap<String, StringValue> metadata = new HashMap<String, StringValue>();
                    final Row row = rows.get(0);
                    metadata = deserializeMetadata((String) row.getObject("checkpoint"));
```

### UnusedAssignment
Variable `contentBytes` initializer `new byte [0]` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
    private void uploadFileToS3(@NonNull final FileSystem fileSystem, @NonNull final Path path,
                                @NonNull final int partNum, final Date date) {
        byte[] contentBytes = new byte [0];
        log.info("Start upload file to S3 with partition num: {}", partNum);
        log.info("Start calculating file bytes.");
```

### UnusedAssignment
Variable `objKey` initializer `""` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                , this.awsConf.getBucketName(), this.awsConf.getObjectKey());
        try (final InputStream inputStream = fileSystem.open(path)) {
            String objKey = "";
            if (this.conf.getDispersalLength().equals(DispersalLengthType.MULTIPLE_DAY)) {
                objKey = String.format("%s/%s_%0" + this.digitNum + "d",
```

### UnusedAssignment
Variable `jsc` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceConfiguration conf;
    @Getter
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    @Getter
    private final KafkaSourceDataConverter dataConverter;
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `IFunctionThrowsException` ends with 'Exception'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/IFunctionThrowsException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface IFunctionThrowsException<T, R> {
    R apply(@NonNull final T t) throws Exception;
}
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `value == null` is always `false`
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
            default:
                log.error("name:{}:value:{}:valueClass:{}:schema:{}", name, value,
                    value == null ? "" : value.getClass(), schema);
                throw new JobRuntimeException("unsupported data type :" + nonOptionalSchema.getType());
        }
```

### ConstantValue
Condition `this.fieldsToConvert.isPresent()` is always `true` when reached
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final Schema.Field field = this.inputSchema.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
                    || this.fieldsToConvert.isPresent()
                    && this.fieldsToConvert.get().contains(field.name().toLowerCase())) {
                final Object rawData = avroPayload.getData().get(field.name());
```

### ConstantValue
Condition `this.fieldsToConvert.isPresent()` is always `true` when reached
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final Schema.Field field = this.inputSchemaAvro.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
                    || this.fieldsToConvert.isPresent()
                    && this.fieldsToConvert.get().contains(field.name().toLowerCase())) {
                final Object rawData = genericRecord.get(field.name());
```

### ConstantValue
Condition `topicPartitions == null` is always `true`
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            if (topicPartitions == null) {
                synchronized (KafkaUtil.class) {
                    if (topicPartitions == null) {
                        topicPartitions = kafkaConsumer.listTopics();
                        KafkaUtil.topicPartitions = new ConcurrentHashMap<>(topicPartitions);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ZookeeperConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.getConf(), getMandatoryProperties());

        this.zkQuorum = this.getConf().getProperty(ZK_QUORUM).get();
        this.zkPort = this.getConf().getProperty(ZK_PORT).get();
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ZookeeperConfiguration.java`
#### Snippet
```java

        this.zkQuorum = this.getConf().getProperty(ZK_QUORUM).get();
        this.zkPort = this.getConf().getProperty(ZK_PORT).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
    public AwsConfiguration(@NonNull final FileSinkConfiguration conf) {
        ConfigUtil.checkMandatoryProperties(conf.getConf(), this.getMandatoryProperties());
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(conf.getConf(), this.getMandatoryProperties());
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
        this.sourcePath = conf.getFullPath();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
        this.sourcePath = conf.getFullPath();
        this.fileSystemPrefix = conf.getPathPrefix();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileSource.java`
#### Snippet
```java
                .map(Path::toString)
                .collect(Collectors.joining(","));
            final RDD<String> fileRows = this.jsc.get().sc().textFile(filesToRead, 1);
            return this.converter.map(fileRows.toJavaRDD()).getData();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java
    public KafkaSourceConfiguration(@NonNull final Configuration conf) {
        super(conf);
        this.topicName = getConf().getProperty(KAFKA_TOPIC_NAME).get();
        this.clusterName = getConf().getProperty(KAFKA_CLUSTER_NAME).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java
        super(conf);
        this.topicName = getConf().getProperty(KAFKA_TOPIC_NAME).get();
        this.clusterName = getConf().getProperty(KAFKA_CLUSTER_NAME).get();

        //Try to initialize the start time. "start_date" is legacy, please use start_time moving forward.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
                    throw new ForkOperationException("Using unregistered key :" + key);
                }
                this.registeredKeys.get(key).get().add(1);
            });
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/MetadataManagerConfiguration.java`
#### Snippet
```java
        this.conf = conf;
        ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());
        this.jobName = this.conf.getProperty(MetadataManagerConfiguration.JOB_NAME).get();
        if (this.conf.getProperty(MetadataManagerConfiguration.TYPE).isPresent()) {
            this.metadataType = MetadataManagerType.valueOf(this.conf.getProperty(MetadataManagerConfiguration.TYPE)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        //File System Prefix
        this.pathPrefix = this.conf.getProperty(PATH_PREFIX).get();

        if (this.conf.getProperty(SEPARATOR).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        //File Name and Path Configurations
        this.sourceNamePrefix = this.conf.getProperty(SOURCE_NAME_PREFIX).get();

        if (this.partitionType != PartitionType.NONE) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        }

        this.writeTimestamp = this.conf.getProperty(TIMESTAMP).get();
        this.sourceType = this.conf.getProperty(SOURCE_TYPE).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        this.writeTimestamp = this.conf.getProperty(TIMESTAMP).get();
        this.sourceType = this.conf.getProperty(SOURCE_TYPE).get();

        if (this.conf.getProperty(DISPERSAL_LENGTH).isPresent()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(conf, this.getMandatoryProperties());

        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java

        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();

        if (conf.getProperty(INITIAL_HOSTS).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
            return true;
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
            this.partitionManager = new HDFSDatePartitionManager(hiveConf.getJobName(),
                    hiveConf.getDataPath(),
                    hiveConf.getPartitionKeyName().get(),
                    getHiveConf().getStartDate(),
                    fs);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HDFSMetadataManagerConfiguration.java`
#### Snippet
```java
    public HDFSMetadataManagerConfiguration(@NonNull final Configuration conf) {
        super(conf);
        this.baseMetadataPath = this.getConf().getProperty(BASE_METADATA_PATH).get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSourceConfiguration.java`
#### Snippet
```java

    public String getType() {
        return this.conf.getProperty(TYPE).get().toLowerCase();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSourceConfiguration.java`
#### Snippet
```java

    public Path getDirectory() {
        return new Path(this.conf.getProperty(DIRECTORY).get());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
                    try {
                        final Optional<Pair<String, IStatus>> result = Optional.fromNullable(future.get());
                        IStatus.Status status = result.get().value().getStatus();
                        log.info("job dag, name: {}, status: {}",
                                 result.get().key(), status.name());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
            stageTracker = Optional.fromNullable(lastActiveTime.get(stageId));
        }
        stageTracker.get().taskStarted();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());

        this.dataPath = this.getConf().getProperty(HIVE_DATA_PATH).get();
        this.jobName = this.getConf().getProperty(JOB_NAME).get();
        this.partitionKeyName = this.getConf().getProperty(PARTITION_KEY_NAME);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

        this.dataPath = this.getConf().getProperty(HIVE_DATA_PATH).get();
        this.jobName = this.getConf().getProperty(JOB_NAME).get();
        this.partitionKeyName = this.getConf().getProperty(PARTITION_KEY_NAME);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(PARTITION_TYPE).isPresent()) {
            this.partitionType = PartitionType.valueOf(this.getConf().getProperty(PARTITION_TYPE)
                    .get().trim().toUpperCase());
        } else {
            this.partitionType = PartitionType.NONE;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
        }
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = convert(row).get(0).getSuccessData().get().getData();
                final String rowKey = this.row_identifier.isEmpty() ? key
                        : row.getData().get(this.row_identifier).toString();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
        if (this.timestampInfo.hasTimestamp()) {
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            insertStatement.value(timestampInfo.getTimestampFieldName(), bb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            insertStatement.value(timestampInfo.getTimestampFieldName(), bb);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
                log.info("using hoodie instant for reading checkpoint info :{}", lastInstant.get().getTimestamp());
                final HoodieCommitMetadata commitMetadata =
                    HoodieCommitMetadata.fromBytes(hoodieActiveTimeline.getInstantDetails(lastInstant.get()).get());
                final String serCommitInfo = commitMetadata.getMetadata(HOODIE_METADATA_KEY);
                if (!Strings.isNullOrEmpty(serCommitInfo)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
        }
        final HoodieWriteClient<HoodieAvroPayload> writeClient =
            new HoodieWriteClient<>(jsc.get(), this.hoodieConf.getHoodieWriteConfig(), true);
        final String commitTime = writeClient.startCommit();
        log.info("Saving metadata info using hoodie-commit: {}", commitTime);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
            log.info("Acquiring a new lock for {}", lockKey);
            final CustomizedInterProcessMutex newLockValue = new CustomizedInterProcessMutex(
                    client.get(), lockKey, lockInfo);
            try {
                if (acquireLock(newLockValue)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
                this.schema.getTableName(),
                key,
                oldestTimestamp.get());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
        final String rowKey = data.first().getData().getSchema().getName();
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = this.convert(row).get(0).getSuccessData().get().getData();
                log.debug("Line: {}", line);
                return new Tuple2<>(rowKey, line);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java
        if (this.isEnabled()) {
            ConfigUtil.checkMandatoryProperties(conf, getMandatoryProperties());
            this.zkBasePath = cleanZkBasePath(this.getConf().getProperty(ZK_BASE_PATH).get());
        } else {
            this.zkBasePath = null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                                            @NonNull final Optional<DataFeedMetrics> metrics) {
        final ByteBuffer bb;
        final FieldInfo fieldInfo = fieldInfoMap.get().get(field);
        final Schema.Type type = fieldInfo.getNonNullType();
        if (fieldInfo.isTimestampField()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java

        final GenericRecord genericRecord = avroPayload.getData();
        for (int i = 0; i < this.inputSchemaAvro.get().getFields().size(); i++) {
            final Schema.Field field = this.inputSchemaAvro.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
        if (this.timestampInfo.hasTimestamp()) {
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            row.addField(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            row.addField(
                    new CassandraDataField(ByteBufferUtil.wrap(this.timestampInfo.getTimestampFieldName()), bb));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
                metadataManager.getAllKeys().forEach(key -> {
                        final Optional<StringValue> metadataManagerValue = metadataManager.get(key);
                        log.info("metadata: key: {}, value: {}", key, metadataManagerValue.get());
                        if (metadata.containsKey(key)) {
                            final StringValue currentValue = metadata.get(key);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java

    private void setupMetrics() {
        this.sink.setJobMetrics(getJobMetrics().get());
        this.sink.setDataFeedMetrics(getDataFeedMetrics().get());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java
    private void setupMetrics() {
        this.sink.setJobMetrics(getJobMetrics().get());
        this.sink.setDataFeedMetrics(getDataFeedMetrics().get());
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ErrorTableConfiguration.java`
#### Snippet
```java
        if (this.isEnabled()) {
            ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());
            this.destPath = new Path(conf.getProperty(DESTINATION_PATH).get());
        }
        this.isDatePartitioned = conf.getBooleanProperty(IS_DATE_PARTITIONED, DEFAULT_IS_DATE_PARTITIONED);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HDFSSchemaServiceConfiguration.java`
#### Snippet
```java

    public Path getPath() {
        return new Path(this.conf.getProperty(PATH).get());
    }
    public static List<String> getMandatoryProperties() {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
                    jobSubDag.setDataFeedMetrics(this.dataFeedMetrics.get());
                }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
                    jobSubDag.setDataFeedMetrics(this.dataFeedMetrics.get());
                }
            ));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
     * */
    public String getHoodieMetricsPrefix() {
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_METRICS_PREFIX, this.tableKey)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
     */
    public String getTableName() {
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_TABLE_NAME, this.tableKey)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
    public String getBasePath() {
        // HOODIE_BASE_PATH is a mandatory property. Please check {#getMandatoryProperties()}.
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_BASE_PATH, this.tableKey)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.conf, this.getMandatoryProperties());

        this.partitionKeys = this.splitString(this.conf.getProperty(PARTITION_KEYS).get());

        if (this.conf.getProperty(INITIAL_HOSTS).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getKeyspace() {
        return this.getConf().getProperty(KEYSPACE).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getClusterName() {
        return this.getConf().getProperty(CLUSTER_NAME).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getTableName() {
        return this.getConf().getProperty(TABLE_NAME).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        Collections.shuffle(workUnits);
        final RDD<ConsumerRecord<byte[], byte[]>> kafkaRDD = new KafkaRDD<byte[], byte[]>(
            this.jsc.get().sc(),
            kafkaParams,
            workUnits.toArray(new OffsetRange[0]),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        }
        final LongAccumulator totalDataReadInBytes = new LongAccumulator("totalDataRead");
        getJsc().get().sc().register(totalDataReadInBytes);
        final int numPartitions = workUnits.stream().map(r -> r.partition()).collect(Collectors.toSet()).size();
        final Map<Integer, TreeMap<Long, Integer>> kafkaPartitionOffsetToSparkPartitionMap
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
                    // this is my specific topic
                    metadata.put(Integer.parseInt(key.substring(topicSpecificName.length())),
                        Long.parseLong(metadataManager.get(key).get().getValue()));
                } else if (key.startsWith(KAFKA_METADATA_WITH_SEPARATOR)) {
                    // this is a specific topic, but not mine. ignore.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
                    // this is unspecified topic
                    metadata.put(Integer.parseInt(key.substring(KAFKA_METADATA_PREFIX.length())),
                        Long.parseLong(metadataManager.get(key).get().getValue()));
                    // delete the old, unspecified metadata
                    toDelete.add(key);
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getMandatoryProperties()` tries to override a static method of a superclass
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
    }

    public static List<String> getMandatoryProperties() {
        return Collections.unmodifiableList(
                Arrays.asList(
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        this.props.entrySet().forEach(
            entry -> {
                sb.append(entry.getKey() + "<=>" + entry.getValue() + "\n");
            }
        );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                while ((line = br.readLine()) != null) {
                    outputBuffer.append(line + "\n");
                }
            }
```

## RuleId[id=RedundantCompareToJavaTime]
### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
                .stream()
                .map(dt -> DateUtil.convertToUTCDate(dt.replace(this.partitionKeyName, StringTypes.EMPTY)))
                .filter(dt -> dt.compareTo(startDate) >= 0)
                .collect(Collectors.toList());

```

## RuleId[id=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/utilities/JobUtil.java`
#### Snippet
```java
        try (final FileInputStream fis = new FileInputStream(dcFile);
             final InputStream is = new BufferedInputStream(fis)) {
            final Scanner scanner = new Scanner(is);
            return scanner.next();
        }
```

### IOResource
'CSVWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
                = line.getData().getSchema().getFields().stream().map(f -> f.name()).toArray(String[]::new);
        final StringWriter sw = new StringWriter();
        final CSVWriter writer = new CSVWriter(sw
                , this.separator, '\"', '\\', "");
        writer.writeNext(headList, false);
```

### IOResource
'CSVWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
                    .toArray(String[]::new);
            final StringWriter sw = new StringWriter();
            final CSVWriter writer = new CSVWriter(sw
                    , this.separator, '\"', '\\', "");
            writer.writeNext(tmp, false);
```

### IOResource
'JavaSparkContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkOperator.java`
#### Snippet
```java
            return getRDD(new FilterFunction<>(filterKey));
        } else {
            return (new JavaSparkContext(inputRDD.rdd().sparkContext())).emptyRDD();
        }
    }
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

            // Deserialize the map and load the checkpoint data
            return fs.isPresent() ? Optional.of(fs.get()) : Optional.absent();
        }
        return Optional.absent();
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `NO_OF_SAMPLE_ROWS` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java

public class CassandraPayloadRDDSizeEstimator {
    private final int NO_OF_SAMPLE_ROWS = 1000;

    public long estimateTotalSize(final RDDWrapper<CassandraPayload> rdd) {
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        final Map<String, String> properties = new HashMap<>();
        final int prefixLength = prefix.length();
        this.props.entrySet().forEach(
            entry -> {
                final String key = (String) entry.getKey();
```

### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.props.entrySet().forEach(
            entry -> {
                sb.append(entry.getKey() + "<=>" + entry.getValue() + "\n");
```

### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
        final String topicName = this.conf.getTopicName();
        final String topicSpecificName = getTopicSpecificMetadataKey(topicName);
        nextRunState.getPartitionOffsets().entrySet().forEach(
            entry -> {
                metadataManager.set(topicSpecificName + entry.getKey(), new StringValue(entry.getValue().toString()));
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SparkJobTracker` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java
 */
@Slf4j
public class SparkJobTracker {

    public static final String JOB_NAME_PROP = "marmaray.job_name_prop";
```

### UtilityClassWithoutPrivateConstructor
Class `CassandraMetric` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraMetric.java`
#### Snippet
```java
import java.util.Map;

public class CassandraMetric {

    public static final String TABLE_NAME_TAG = "tableName";
```

### UtilityClassWithoutPrivateConstructor
Class `SparkConfiguration` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/SparkConfiguration.java`
#### Snippet
```java

@Slf4j
public class SparkConfiguration {

    public static final String SPARK_PROPERTIES_KEY_PREFIX = "spark_properties.";
```

### UtilityClassWithoutPrivateConstructor
Class `TimeUnitUtil` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/TimeUnitUtil.java`
#### Snippet
```java
import com.uber.marmaray.common.exceptions.JobRuntimeException;

public class TimeUnitUtil {

    private static final Long MICRO_SEC_LOWER_BOUND = (long) Math.pow(10, 15);
```

### UtilityClassWithoutPrivateConstructor
Class `RawDataHelper` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/common/data/RawDataHelper.java`
#### Snippet
```java
 * Helper class to return appropriate RawData subclass.
 */
public class RawDataHelper {

    public static <T> RawData getRawData(@NonNull final T data) {
```

### UtilityClassWithoutPrivateConstructor
Class `HDFSMetadataPruner` has only 'static' members, and lacks a 'private' constructor
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPruner.java`
#### Snippet
```java

@Slf4j
public class HDFSMetadataPruner {
    private static final String HDFS_PATH_LONG_OPTION = "path";
    private static final String NUM_METADATA_FILES_RETAINED_LONG_OPTION = "numFiles";
```

### UtilityClassWithoutPrivateConstructor
Class `HDFSMetadataPrinter` has only 'static' members, and lacks a 'private' constructor
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPrinter.java`
#### Snippet
```java

@Slf4j
public class HDFSMetadataPrinter {
    private static final String METADATA_FILE_OPTION = "mfile";

```

### UtilityClassWithoutPrivateConstructor
Class `CassandraSinkUtil` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/CassandraSinkUtil.java`
#### Snippet
```java

@Slf4j
public class CassandraSinkUtil {

    public static final TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone("UTC");
```

### UtilityClassWithoutPrivateConstructor
Class `MapUtil` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/MapUtil.java`
#### Snippet
```java
 */
@Slf4j
public class MapUtil {

    public static final String KEY_VALUE_SEPARATOR = StringTypes.COLON;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandLineUtil` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
 * {@link CommandLineUtil} provides utility methods to interact with the command line
 */
public class CommandLineUtil {
    public static String executeCommand(@NotEmpty final String cmd,
                                        final long timeout,
```

### UtilityClassWithoutPrivateConstructor
Class `FileSinkDataConverterFactory` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataConverterFactory.java`
#### Snippet
```java
 *
 */
public class FileSinkDataConverterFactory {
    protected FileSinkDataConverterFactory() {
    }
```

### UtilityClassWithoutPrivateConstructor
Class `FSUtils` has only 'static' members, and lacks a 'private' constructor
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
 */
@Slf4j
public class FSUtils {

    // Metadata file names in HDFS = nanoseconds since epoch so we can sort by name
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `this.jobDagQueue.poll()` might be null
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                } else {
                    // can now move a jobDag thread to an actions thread
                    submitFuture(this.jobDagQueue.poll());
                    this.currentActionsThreads.decrementAndGet();
                    this.currentJobDagThreads.incrementAndGet();
```

### DataFlowIssue
Argument `this.actionsQueue.poll()` might be null
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                } else {
                    // can now move an actions thread to a jobDag thread
                    submitFuture(this.actionsQueue.poll());
                    this.currentJobDagThreads.decrementAndGet();
                    this.currentActionsThreads.incrementAndGet();
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
        switch (type) {
            case LONG:
                return Optional.fromNullable((Long) rawData);
            case STRING:
                return Optional.fromNullable(Long.parseLong(rawData.toString()));
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                return Optional.fromNullable((Long) rawData);
            case STRING:
                return Optional.fromNullable(Long.parseLong(rawData.toString()));
            default:
                if (this.dataFeedMetrics.isPresent()) {
```

### DataFlowIssue
Method invocation `limit` may produce `NullPointerException`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                }
                if (requiredKeysToFind.contains(field.name())
                      && bb.limit() != 0) {
                    requiredKeysToFind.remove(field.name());
                }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java

    public void registerKeys(final List<Integer> keys) {
        keys.stream().forEach(key -> {
                if (this.registeredKeys.containsKey(key)) {
                    throw new ForkOperationException("Duplicate key found :" + key);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
    public final Iterator<ForkData<DI>> call(final DI di) {
        final List<ForkData<DI>> forkData = process(di);
        forkData.stream().forEach(fd -> verifyKeys(fd.getKeys(), di));
        return forkData.iterator();
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java

    private void verifyKeys(final List<Integer> keys, final DI di) {
        keys.stream().forEach(key -> {
                if (!this.registeredKeys.containsKey(key)) {
                    log.error("Invalid key:{}: in keys:{}:for record:{}", key, keys, di);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/ConfigUtil.java`
#### Snippet
```java
            log.warn("mandatory properties are empty");
        }
        mandatoryProps.stream().forEach(
            prop -> {
                if (!conf.getProperty(prop).isPresent()) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java
        final AtomicInteger preTopicOrderingCounter = new AtomicInteger(0);
        final AtomicInteger postTopicOrderingCounter = new AtomicInteger(0);
        inputJobDags.stream().forEach(jobDag -> initialTopicOrdering.put(jobDag.getDataFeedName(),
            preTopicOrderingCounter.incrementAndGet()));
        final List<Dag> result = new ArrayList<>(inputJobDags.size());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaBootstrapOffsetSelector.java`
#### Snippet
```java
                                                  @NonNull final Map<TopicPartition, Long> latestLeaderOffsets) {
        final Map<Integer, Long> ret = new HashMap<>();
        latestLeaderOffsets.entrySet().stream().forEach(e -> ret.put(e.getKey().partition(), e.getValue()));
        return ret;
    }
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        try {
            final FileStatus[] fileStatuses = this.fileSystem.listStatus(new Path(baseDataPath));
            this.isSinglePartition = !Arrays.stream(fileStatuses).anyMatch(fs -> fs.isDirectory());
        } catch (final IOException e) {
            throw new JobRuntimeException("IOException encountered. Path:" + baseDataPath, e);
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        log.info("Searching for partitions in path: {}", partitionFolderRegex);
        final FileStatus[] fileStatuses  = this.fileSystem.globStatus(new Path(partitionFolderRegex));
        final List<String> partitions = Arrays.asList(fileStatuses).stream()
                .map(fileStatus -> fileStatus.getPath().getName())
                // filter out hidden files/directories
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        timeMetric.addTags(action.getMetricTags());
        timeMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(timeMetric));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        resultMetric.addTags(action.getMetricTags());
        resultMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(resultMetric));
    }
}
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPrinter.java`
#### Snippet
```java
                metadataMap.entrySet()
                    .stream()
                    .forEach(entry ->
                            log.info("Key: " + entry.getKey() + " Value: " + entry.getValue().getValue()));
            }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/MapUtil.java`
#### Snippet
```java
    public static String serializeMap(@NonNull final Map<String, String> map) {
        final StringBuilder sb = new StringBuilder();
        map.entrySet().stream().forEach(
            entry -> {
                if (sb.length() > 0) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

        log.info("Field names found: {}", fieldNames.size());
        fieldNames.stream().forEach(f -> log.info("Schema field: {}", f));

        try {
```

### SimplifyStreamApiCallChains
Can be replaced with 'max()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
                    new Path(parentFolder, "*")))
                .filter(f -> !f.getPath().getName().endsWith(MetadataConstants.TEMP_FILE_EXTENSION))
                .sorted(byDateAsc.reversed()).findFirst();

            // Deserialize the map and load the checkpoint data
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        final Cluster.Builder builder = Cluster.builder().withClusterName(this.config.getCluster());
        builder.withCredentials(this.config.getUsername(), this.config.getPassword());
        this.config.getInitialHosts().stream().forEach(host -> builder.addContactPoint(host));
        if (this.config.getNativePort().isPresent()) {
            builder.withPort(Integer.parseInt(this.config.getNativePort().get()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
    private void setupChildMetrics() {

        this.childNodes.entrySet().stream().forEach(
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

        this.childNodes.entrySet().stream().forEach(
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
    public final void commit() {
        log.info("calling {}'s childNodes' commit", this.name);
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
            childNodesAtSamePriority -> {
                final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
                childNodesAtSamePriority.getValue().stream().forEach(
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

        final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                childNodesAtSamePriority.getValue().stream().forEach(
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                childNodesAtSamePriority.getValue().stream().forEach(
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
                        attemptNumber.incrementAndGet()
                );
                topicPartitions.stream().forEach(
                    tp -> {
                        try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
    public static Map<String, Object> getKafkaParams(@NonNull final KafkaConfiguration kafkaConf) {
        final Map<String, Object> newKafkaParams = new HashMap<>();
        kafkaConf.getKafkaParams().entrySet().stream().forEach(
            entry -> {
                final String val = entry.getValue();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            @NotEmpty final String topicName, @NonNull final Set<TopicPartition> topicPartitions) {
        final Set<Integer> partitions = new HashSet<>();
        topicPartitions.stream().forEach(
            tp -> {
                partitions.add(tp.partition());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            }
        );
        getTopicPartitions(kafkaConsumer, topicName).stream().forEach(p -> partitions.remove(p.partition()));
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
            final List<ForkData<IData>> forkData = new ArrayList<>();

            results.stream().forEach(t -> {
                    if (t.getErrorData().isPresent()) {
                        processRecordHandler(AbstractDataConverter.this.failureRecordHandler,
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java

    public TimerMetric(@NotEmpty final String metricName, @NonNull final Map<String, String> tags) {
        this(metricName.toString());
        this.addTags(tags);
    }
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
    public HoodieIndex.IndexType getHoodieIndexType() {
        final String indexName = getProperty(HOODIE_INDEX_TYPE, DEFAULT_HOODIE_INDEX_TYPE);
        if (HOODIE_BLOOM_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.BLOOM;
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        if (HOODIE_BLOOM_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.BLOOM;
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.HBASE;
        } else if (HOODIE_IN_MEMORY_INDEX.equals(indexName.toLowerCase())) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.HBASE;
        } else if (HOODIE_IN_MEMORY_INDEX.equals(indexName.toLowerCase())) {
            return IndexType.INMEMORY;
        } else {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

        final String fileLocation = new Path(this.baseMetadataPath, currentTime.toString()).toString();
        final String tmpFileLocation = fileLocation.toString() + MetadataConstants.TEMP_FILE_EXTENSION;

        try (final OutputStream os = new BufferedOutputStream(
```

### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
            throw new MissingPropertyException("Source information for the JobManager Metadata Tracker is missing.");
        }
        if (sourceType.get().toUpperCase().equals(MetadataConstants.JOBMANAGER_METADATA_SOURCE_HDFS)) {
            final Optional<String> basePath = config.getProperty(MetadataConstants.JOBMANAGER_METADATA_HDFS_BASEPATH);
            if (!basePath.isPresent()) {
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieWriteStatus.java`
#### Snippet
```java
     */
    @Override
    public void markSuccess(final HoodieRecord record, final Optional<Map<String, String>> optionalRecordMetadata) {
        this.totalRecords++;
    }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
    public CassandraSinkCQLDataConverter(@NonNull final Schema inputSchema,
                                         @NonNull final Configuration conf,
                                         @NonNull final Optional<Set<String>> fieldsToConvert,
                                         @NonNull final List<String> requiredFields,
                                         @NonNull final TimestampInfo timestampInfo,
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;

    /*
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java
        inputJobDags.stream().map(dag -> {
                try {
                    final Optional<Map<String, String>> contents = this.tracker.get(dag.getDataFeedName());
                    if (contents.isPresent() && contents.get().containsKey(JobDag.LAST_RUNTIME_METADATA_KEY)) {
                        long lastExecutionTime = contents.get().containsKey(JobDag.LAST_EXECUTION_METADATA_KEY)
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

    /**
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
    // customers running jobs against the same metadata directory.  We eventually want to take locks on
    // a directory (possivly via ZooKeeper) so only one job can operate at a time per job name.
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @NonNull
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    public CassandraSinkDataConverter(@NonNull final Schema inputSchema,
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * This map caches per field information to avoid recalculations on each row.
     */
    private Optional<Map<Schema.Field, FieldInfo>> fieldInfoMap = Optional.absent();
    private Optional<Schema> inputSchemaAvro = Optional.absent();

```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;
    /*
     * The required fields that must be populated in the schema.  These keys form the primary/partition/clustering
```

### OptionalContainsCollection
'Optional' contains collection `HashMap`
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        logWriteMetrics(writesStatuses);

        java.util.Optional<HashMap<String, String>> hoodieExtraMetadata = java.util.Optional.empty();
        if (this.metadataMgr instanceof HoodieBasedMetadataManager) {
            // Retrieve metadata from metadata manager and update metadata manager to avoid it creating extra
```

### OptionalContainsCollection
'Optional' contains collection `HashMap`
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

        public boolean commit(@NotEmpty final String commitTime, @NonNull final JavaRDD<WriteStatus> writeStatuses,
            final java.util.Optional<HashMap<String, String>> extraMetadata) {
            return this.hoodieWriteClient.commit(commitTime, writeStatuses, extraMetadata);
        }
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    protected final CassandraSchema schema;
    protected final CassandraMetadataSchemaManager schemaManager;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();
    private int numTimestamps;
    private Optional<String> oldestTimestamp;
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java

    private final List<IMetadataManager<StringValue>> metadataManagersList;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @Getter
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
                                    @NotEmpty final String tableName,
                                    @NonNull final TimestampInfo timestampInfo,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this.keySpace = keySpace;
        this.tableName = tableName;
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
    public CassandraSchemaConverter(@NotEmpty final String keySpace,
                                    @NotEmpty final String tableName,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this(keySpace, tableName, TimestampInfo.generateEmptyTimestampInfo(), filteredFields);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
     * and not all the available fields from the source data.
     */
    final Optional<Set<String>> filteredFields;

    public CassandraSchemaConverter(@NotEmpty final String keySpace,
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     * @throws IOException
     */
    public Optional<Map<String, String>> get(@NotEmpty final String key) throws IOException {
        final Optional<StringValue> metadataValues =  this.metadataManager.get(key);
        if (metadataValues.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
     */
    @Getter
    private final Optional<Set<String>> filteredColumns;

    @Getter
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    public Properties getProperties() {
        final Properties properties = new Properties();
        this.props.forEach((k, v) -> properties.put(k, v));
        return properties;
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
        log.info("Start write {} to path {}", this.conf.getFileType(), this.conf.getFullPath());
        final JavaPairRDD<String, String> convertedData = this.converter.convertAll(data);
        final JavaRDD<String> tmp = convertedData.map(message -> message._2());
        final int partNum = getRepartitionNum(tmp);
        final int desiredDigit = (int) Math.floor(Math.log10(partNum) + 1);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
    public void startMonitorThread() {
        log.info("Start timeout monitoring...");
        final Thread monitor = new Thread(() -> monitorTimeout());
        monitor.setDaemon(true);
        monitor.start();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        try {
            final FileStatus[] fileStatuses = this.fileSystem.listStatus(new Path(baseDataPath));
            this.isSinglePartition = !Arrays.stream(fileStatuses).anyMatch(fs -> fs.isDirectory());
        } catch (final IOException e) {
            throw new JobRuntimeException("IOException encountered. Path:" + baseDataPath, e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/Reporters.java`
#### Snippet
```java
    public void finish() {
        if (!isFinished) {
            this.reporters.forEach(r -> r.finish());
            isFinished = true;
        } else {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraPayload.java`
#### Snippet
```java
        return convertData()
                .stream()
                .filter((row) -> row != null)
                .map((row) -> row.capacity())
                .reduce((size, accumulator) -> size + accumulator)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraPayload.java`
#### Snippet
```java
                .stream()
                .filter((row) -> row != null)
                .map((row) -> row.capacity())
                .reduce((size, accumulator) -> size + accumulator)
                .orElse(0);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraPayload.java`
#### Snippet
```java
                .filter((row) -> row != null)
                .map((row) -> row.capacity())
                .reduce((size, accumulator) -> size + accumulator)
                .orElse(0);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraPayload.java`
#### Snippet
```java

    public List<ByteBuffer> convertData() {
        return fields.stream().map(field -> field.getValue()).collect(Collectors.toList());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/actions/ReporterAction.java`
#### Snippet
```java
                });
        } else {
            this.reporters.getReporters().forEach(reporter -> this.dataFeedMetrics.gauageFailureMetric(reporter));
            log.warn("Other than failure reports "
                    + "no metrics produced or actions being executed on reporter because errors were encountered");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
        final AvroPayload line = data.first();
        final String[] headList
                = line.getData().getSchema().getFields().stream().map(f -> f.name()).toArray(String[]::new);
        final StringWriter sw = new StringWriter();
        final CSVWriter writer = new CSVWriter(sw
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    private String generateFieldsSyntax() {
        final List<String> fields = this.schema.getFields().stream()
                .map(field -> field.toString()).collect(Collectors.toList());
        return joiner.join(fields);
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
        final List<String> lowerCasePartitionKeys = this.partitionKeys
                .stream()
                .map(p -> p.toLowerCase())
                .collect(Collectors.toList());

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

        final List<String> clusterOrder =
                this.clusteringKeys.stream().map(key -> key.toString()).collect(Collectors.toList());

        return String.format("WITH CLUSTERING ORDER BY (%s)", joiner.join(clusterOrder));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                    .getErrorModuleCauseTags(ModuleTagNames.CONFIGURATION, ErrorCauseTagNames.CONFIG_ERROR));
            reporters.report(configError);
            reporters.getReporters().forEach(reporter -> dataFeedMetrics.gauageFailureMetric(reporter));
            throw e;
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                    .getErrorModuleCauseTags(ModuleTagNames.METADATA_MANAGER, ErrorCauseTagNames.CONFIG_ERROR));
            reporters.report(configError);
            reporters.getReporters().forEach(reporter -> dataFeedMetrics.gauageFailureMetric(reporter));
            throw e;
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                    .getErrorModuleCauseTags(ModuleTagNames.SCHEMA_MANAGER, ErrorCauseTagNames.CONFIG_ERROR));
            reporters.report(configError);
            reporters.getReporters().forEach(reporter -> dataFeedMetrics.gauageFailureMetric(reporter));
            throw e;
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                    cassandraConf.getClusteringKeys()
                        .stream()
                        .map(ck -> ck.getName()).collect(Collectors.toList()),
                    cassandraConf.getPartitionKeys()));
            if (tsInfo.hasTimestamp()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                        cassandraConf.getWrittenTime().isPresent());
            } catch (JobRuntimeException e) {
                reporters.getReporters().forEach(reporter -> dataFeedMetrics.gauageFailureMetric(reporter));
                throw e;
            }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieUtil.java`
#### Snippet
```java
                        return new HoodieRecord<T>(rec1.getKey(), reducedData);
                    }, parallelism)
                .map(recordTuple -> recordTuple._2());
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        final Cluster.Builder builder = Cluster.builder().withClusterName(this.config.getCluster());
        builder.withCredentials(this.config.getUsername(), this.config.getPassword());
        this.config.getInitialHosts().stream().forEach(host -> builder.addContactPoint(host));
        if (this.config.getNativePort().isPresent()) {
            builder.withPort(Integer.parseInt(this.config.getNativePort().get()));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java
        final long byteSize = sampleRows
                .stream()
                .map(element -> element.estimateRowSize())
                .reduce((size, accumulator) -> size + accumulator)
                .orElse(0);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java
                .stream()
                .map(element -> element.estimateRowSize())
                .reduce((size, accumulator) -> size + accumulator)
                .orElse(0);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    public final RDDWrapper<OD> map(@NonNull final JavaRDD<ID> data) {
        final ForkOperator<IData> converter =
            new ForkOperator<>(data.map(r -> RawDataHelper.getRawData(r)),
                new DataConversionFunction(), this.conf);
        converter.execute();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    private List<ClusterKey> initClusterKeys(final List<String> entries) {
        return entries.stream().map(entry -> ClusterKey.parse(entry)).collect(Collectors.toList());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkOperator.java`
#### Snippet
```java
            throw new ForkOperationException("No RDD is found");
        }
        return this.groupRDD.get().filter(filterFunction).map(record -> record.getRecord());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
            }
        }
        return readKafkaData(newWorkUnits).map(e -> e.value());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java

        final List<Integer> outputSparkPartitions = new ArrayList<>(readParallelism);
        IntStream.range(0, readParallelism).forEach(i -> outputSparkPartitions.add(i));
        // We shuffle outputSparkPartitionIds so that reducers won't hit same shuffle service while running
        // "read_parllelism" tasks.
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        final LongAccumulator totalDataReadInBytes = new LongAccumulator("totalDataRead");
        getJsc().get().sc().register(totalDataReadInBytes);
        final int numPartitions = workUnits.stream().map(r -> r.partition()).collect(Collectors.toSet()).size();
        final Map<Integer, TreeMap<Long, Integer>> kafkaPartitionOffsetToSparkPartitionMap
            = getKafkaPartitionOffsetToOutputSparkPartitionMap(this.conf.getTopicName(), workUnits, readParallelism);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
        } catch (IOException | InterruptedException e) {
            throw new JobRuntimeException("Exception occurred while executing command: " + cmd
                    + " , timeout: " + String.valueOf(timeout) + ", unit: " + unit.name()
                    + " Error Message: " + e.getMessage(), e);
        }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'hoodieSinkOperations' in a Serializable class
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @NonNull
    @Getter
    private HoodieSinkOperations hoodieSinkOperations = new HoodieSinkOperations();

    public HoodieSink(@NonNull final HoodieConfiguration hoodieConf,
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'sinkStatMgr' in a Serializable class
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * Used for managing sink stats.
     */
    private final SinkStatManager sinkStatMgr;
    private final boolean shouldSaveChangesInFuture;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'destPath' in a Serializable class
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ErrorTableConfiguration.java`
#### Snippet
```java
    private final boolean isEnabled;
    @Getter
    private Path destPath;
    @Getter
    private final int writeParallelism;
```

## RuleId[id=FinallyBlockCannotCompleteNormally]
### FinallyBlockCannotCompleteNormally
`finally` block can not complete normally
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
            isSuccess.set(false);
            new JobRuntimeException("Failed to lock all keys at once", e);
        } finally {
            if (!isSuccess.get()) {
                log.info("Failed to lock all keys at once, will release them.");
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java
        private static List<String> parse(final String details) {
            final List<String> stack = new ArrayList<>();
            for (String str: Arrays.asList(details.split("\n"))) {
                stack.add(str.replaceFirst("\\([a-zA-Z0-9:.\\s]*\\)", ""));
            }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not boolean :" + name + " : type :" + value.getClass().getCanonicalName()
                        + ": value :" + value.toString());
            case DOUBLE:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not double :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case FLOAT:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not float :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case INT:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not int :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case LONG:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not long :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case STRING:
                return value.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
                final Schema elementSchema = nonOptionalSchema.getElementType();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
                final Schema elementSchema = nonOptionalSchema.getElementType();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            }
        } else {
            throw new JobRuntimeException(String.format("Attempting to finish illegal tier %s", tier.toString()));
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
     */
    public String generateInsertStmt(@NotEmpty final String key, @NonNull final String value) {
        final String ttlStr = this.ttl.isPresent() ? "USING TTL " + this.ttl.get().toString() : StringTypes.EMPTY;

        return String.format("INSERT INTO %s.%s ( %s ) VALUES ( %s ) %s",
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                .collect(Collectors.joining(","));

        final String ttlStr = this.ttl.isPresent() ? "USING TTL " + this.ttl.get().toString() : StringTypes.EMPTY;

        if (this.orderRequired) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
        } else {
            final String timestampStr = this.timestamp.isPresent()
                    ? ((this.ttl.isPresent() ? " AND " : " USING ") + "TIMESTAMP " + this.timestamp.get().toString())
                    : StringTypes.EMPTY;

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                .filter(field -> missingCols.contains(field.getFieldName()))
                .map(field -> String.format("ALTER TABLE %s.%s ADD %s",
                        this.schema.getKeySpace(), this.schema.getTableName(), field.toString()))
                .collect(Collectors.toList());
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
            final FileSystem fs = FSUtils.getFs(conf, Optional.absent());
            final Path dataFeedConfFile = new Path(filePath);
            log.info("Loading configuration from {}", dataFeedConfFile.toString());
            conf.loadYamlStream(fs.open(dataFeedConfFile), Optional.absent());
        } catch (IOException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                    .collect(Collectors.toMap(r -> r.getString("column_name"), r ->  r.getString("type")));

            log.info("Found columns: {}", columns.toString());
            if (columns.isEmpty()) {
                final String createTable = this.schemaManager.generateCreateTableStmt();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            String cassandraCols = String.format("job, time_stamp, checkpoint");
            String cassandraVals = String.format("'%s', '%s', '%s'",
                    this.job, currentTime.toString(), checkpoint);

            final String insertCmd = this.schemaManager.generateInsertStmt(cassandraCols, cassandraVals);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
                partitions.toString(), topicName));
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(contentBytes.length);
        log.info("Uploading from {} to S3 bucket {}/{}", path.toString()
                , this.awsConf.getBucketName(), this.awsConf.getObjectKey());
        try (final InputStream inputStream = fileSystem.open(path)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
            });
        log.info("number of partitions based on dates: {}", dates.size());
        log.info("dates: {}", dates.toString());

        // group messages based on grouped dates
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                        final boolean result = isSameDate(day, msgDay);
                        log.debug("\t filtering day: {}, message day: {}, \t filter result: {}",
                                day.toInstant(), msgDay.toString(), result);
                        return result;
                    });
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CustomizedInterProcessMutex` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    }

    private final class CustomizedInterProcessMutex extends InterProcessMutex {

        private final byte[] lockInfo;
```

### InnerClassMayBeStatic
Inner class `HDFSSchemaServiceWriter` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java
        }
    }
    public final class HDFSSchemaServiceWriter implements ISchemaService.ISchemaServiceWriter, Serializable {
        private final String schemaString;
        private transient Schema schema;
```

### InnerClassMayBeStatic
Inner class `HDFSSchemaServiceReader` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java
    }

    public final class HDFSSchemaServiceReader implements ISchemaService.ISchemaServiceReader, Serializable {

        private final String schemaString;
```

### InnerClassMayBeStatic
Inner class `FieldInfo` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    }

    private class FieldInfo {
        final Schema.Type nonNullType;
        final boolean isTimestampField;
```

### InnerClassMayBeStatic
Inner class `HoodieWriteResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    @AllArgsConstructor
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
```

### InnerClassMayBeStatic
Inner class `SubDagExecutionStatus` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     */
    @Data
    class SubDagExecutionStatus {

        private final JobSubDag subDag;
```

### InnerClassMayBeStatic
Inner class `FileWorkUnitCalculatorResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileWorkUnitCalculator.java/FileWorkUnitCalculator.java`
#### Snippet
```java
    }

    public final class FileWorkUnitCalculatorResult implements IWorkUnitCalculator.IWorkUnitCalculatorResult<
        LocatedFileStatus, FileRunState> {

```

### InnerClassMayBeStatic
Inner class `KafkaWorkUnitCalculatorResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
     * It holds current set of work units and also {@link KafkaRunState} for the next run.
     */
    public final class KafkaWorkUnitCalculatorResult implements
        IWorkUnitCalculator.IWorkUnitCalculatorResult<OffsetRange, KafkaRunState> {

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'List'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final List<String> missingFields = requiredFields.
                    stream()
                    .filter(rf -> allFieldsToConvert.contains(this.requiredFields))
                    .collect(Collectors.toList());
            final Joiner joiner = Joiner.on(",");
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'List'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final List<String> missingFields = requiredFields.
                    stream()
                    .filter(rf -> allFieldsToConvert.contains(this.requiredFields))
                    .collect(Collectors.toList());
            final Joiner joiner = Joiner.on(",");
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.uber.marmaray.common.sources.file' does not correspond to the file path 'com.uber.marmaray.common.sources.file.FileWorkUnitCalculator.java'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileWorkUnitCalculator.java/FileWorkUnitCalculator.java`
#### Snippet
```java
 */

package com.uber.marmaray.common.sources.file;

import com.uber.marmaray.common.configuration.FileSourceConfiguration;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
                                            final String info) {
            super(client, path);
            if (info.equals("")) {
                this.lockInfo = null;
            } else {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java

        if (startTimeinSeconds.isPresent()) {
            this.startTime = Long.valueOf(startTimeinSeconds.get());
        } else if (startDate.isPresent()) {
            this.startTime = DateTime.parse(
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java

    private int getSchemaVersionFromFileName(@NotEmpty final String schemaFile) {
        return Integer.valueOf(getFileParts(schemaFile)[1]);
    }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileSource.java`
#### Snippet
```java

    private final FileSourceConfiguration conf;
    private final Optional<JavaSparkContext> jsc;
    private final FileSourceDataConverter converter;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public HiveSource(@NonNull final HiveSourceConfiguration hiveConf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveSourceConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<Date> startDate;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsSecretAccesskey'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> awsAccessKeyId;
    @Getter
    private final Optional<String> awsSecretAccesskey;
    @Getter
    private final String awsLocal;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsAccessKeyId'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> objectKey;
    @Getter
    private final Optional<String> awsAccessKeyId;
    @Getter
    private final Optional<String> awsSecretAccesskey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'bucketName'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> awsRegion;
    @Getter
    private final Optional<String> bucketName;
    @Getter
    private final Optional<String> objectKey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sourcePartitionPath'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final String writeTimestamp;
    @Getter
    private final Optional<String> sourcePartitionPath;
    @Getter
    private final DispersalType dispersalType;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsRegion'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    //aws s3 properties
    @Getter
    private final Optional<String> awsRegion;
    @Getter
    private final Optional<String> bucketName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'objectKey'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> bucketName;
    @Getter
    private final Optional<String> objectKey;
    @Getter
    private final Optional<String> awsAccessKeyId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkPoint'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    }

    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nextPartition'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<String> nextPartition = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public ParquetWorkUnitCalculator(@NonNull final HiveSourceConfiguration hiveConf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    private JsonNode handleScopeOverriding(
        @NonNull final Optional<String> scope, @NonNull final JsonNode jsonNode) {
        return new ConfigScopeResolver(SCOPE_OVERRIDE_MAPPING_KEY)
            .projectOverrideScopeOverDefault(scope, jsonNode);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public Configuration(@NonNull final File yamlFile,
        @NonNull final Optional<String> scope) {
        loadYamlFile(yamlFile, scope);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    private void loadYamlFile(@NonNull final File yamlFile,
        final Optional<String> scope) {
        try {
            final FileSystem localFs = FileSystem.getLocal(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public void loadYamlStream(@NonNull final InputStream yamlStream,
        @NonNull final Optional<String> scope) {
        try {
            final ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public Configuration(@NonNull final InputStream inputStream,
        @NonNull final Optional<String> scope) {
        loadYamlStream(inputStream, scope);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
    public static StructType generateSchemaFromParquet(@NonNull final FileSystem fs,
                                                       @NotEmpty final String parquetDir,
                                                       @NonNull final Optional<DataFeedMetrics> dataFeedMetrics)
            throws IOException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
    protected final FileSinkConfiguration conf;
    protected final FileSinkDataConverter converter;
    protected Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
    protected int digitNum;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jobExecutionStrategy'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java

    @Setter
    private Optional<IJobExecutionStrategy> jobExecutionStrategy = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'service'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    public static final long NO_TIMEOUT = -1;
    // Singleton service.
    private static Optional<ThreadPoolService> service = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/utilities/TimestampInfo.java`
#### Snippet
```java
public class TimestampInfo implements Serializable {
    @Getter
    final Optional<String> timestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sparkSessionOptional'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
    @Getter
    private final SparkArgs sparkArgs;
    private Optional<SparkSession> sparkSessionOptional = Optional.absent();
    /**
     * Uses {@link SparkSession} returned from {@link SparkFactory#getSparkSession}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partition'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveRunState.java`
#### Snippet
```java
public class HiveRunState implements IRunState<HiveRunState> {
    @Getter
    private Optional<String> partition;
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partitionKeyName'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> partitionKeyName;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partition'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<StringValue> partition;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'inputSchema'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     */
    private final List<String> requiredFields;
    private Optional<Schema> inputSchema = Optional.absent();
    private final TimestampInfo timestampInfo;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
    public CassandraSinkCQLDataConverter(@NonNull final Schema inputSchema,
                                         @NonNull final Configuration conf,
                                         @NonNull final Optional<Set<String>> fieldsToConvert,
                                         @NonNull final List<String> requiredFields,
                                         @NonNull final TimestampInfo timestampInfo,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'latestCheckpoint'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
     */
    public Optional<String> getNextPartition(
            @NotEmpty final Optional<StringValue> latestCheckpoint) throws IOException {
        if (this.isSinglePartition) {
            log.info("Next partition: {}", this.rawDataRootPath);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkpoint'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
    }

    private List<String> listPartitionsAfterCheckpoint(final Optional<StringValue> checkpoint) throws IOException {
        final List<String> partitions = getExistingPartitions();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'startTime'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DataFeedMetrics.java`
#### Snippet
```java
    public TimerMetric createTimerMetric(@NonNull final String metricName,
                                         @NonNull final Map<String, String> additionalTags,
                                         @NonNull final Optional<Instant> startTime) {
        final TimerMetric metric = startTime.isPresent()
                ? new TimerMetric(metricName, additionalTags, startTime.get())
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final HoodieConfiguration hoodieConf;
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'client'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
    private final LockManagerConfiguration lockConf;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl) {
        super(schema, partitionKeys, clusteringKeys, ttl, Optional.absent(), Optional.absent(), false);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldestTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
     */
    public String generateDeleteOldestCheckpoint(@NotEmpty final String key,
                                         @NotEmpty final Optional<String> oldestTimestamp) {
        return String.format("DELETE FROM %s.%s WHERE job='%s' and time_stamp='%s'",
                this.schema.getKeySpace(),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'partition'
in `marmaray/src/main/java/com/uber/marmaray/utilities/CassandraSinkUtil.java`
#### Snippet
```java
    public static final TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone("UTC");

    public static Optional<Long> computeTimestamp(final Optional<String> partition) {
        if (partition.isPresent()) {
            try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
                                    @NotEmpty final String genericBaseDataPath,
                                    @NotEmpty final String partitionKeyName,
                                    @NonNull final Optional<Date> startDate,
                                    @NonNull final FileSystem fileSystem) throws IOException {
        super(metadataKey, genericBaseDataPath, fileSystem);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    private final String partitionKeyName;
    private final boolean hasPartitionKeyInHDFSPartitionPath;
    private final Optional<Date> startDate;

    public HDFSDatePartitionManager(@NotEmpty  final String metadataKey,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

    @Getter
    protected transient Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final List<String> partitionKeys,
                                  @NonNull final List<ClusterKey> clusteringKeys,
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final List<ClusterKey> clusteringKeys,
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
                                  final boolean orderRequired) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
                                  final boolean orderRequired) {
        this.schema = schema;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    final List<ClusterKey> clusteringKeys;
    final Optional<Long> ttl;
    final Optional<Long> timestamp;
    final Boolean orderRequired;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    final List<String> partitionKeys;
    final List<ClusterKey> clusteringKeys;
    final Optional<Long> ttl;
    final Optional<Long> timestamp;
    final Boolean orderRequired;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
    // customers running jobs against the same metadata directory.  We eventually want to take locks on
    // a directory (possivly via ZooKeeper) so only one job can operate at a time per job name.
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    public CassandraSinkDataConverter(@NonNull final Schema inputSchema,
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
                                      @NonNull final TimestampInfo timestampInfo,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldInfoMap'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * This map caches per field information to avoid recalculations on each row.
     */
    private Optional<Map<Schema.Field, FieldInfo>> fieldInfoMap = Optional.absent();
    private Optional<Schema> inputSchemaAvro = Optional.absent();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    private final TimestampInfo timestampInfo;
    private final CassandraSinkConfiguration cassandraConf;
    private final Optional<String> writtenTime;
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;
    /*
     * The required fields that must be populated in the schema.  These keys form the primary/partition/clustering
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    private final Optional<String> writtenTime;
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     */
    private ByteBuffer getByteBuffer(@NonNull final Schema.Field field, @NonNull final Object rawData,
                                            @NonNull final Optional<DataFeedMetrics> metrics) {
        final ByteBuffer bb;
        final FieldInfo fieldInfo = fieldInfoMap.get().get(field);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'inputSchemaAvro'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     */
    private Optional<Map<Schema.Field, FieldInfo>> fieldInfoMap = Optional.absent();
    private Optional<Schema> inputSchemaAvro = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
    private Optional<Schema> outputSchema = Optional.absent();
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public SparkSourceDataConverter(@NonNull final StructType inputSchema,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outputSchema'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
    private final StructField[] fields;
    private final Set<String> requiredKeys;
    private Optional<Schema> outputSchema = Optional.absent();
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * @param writesStatuses
     */
    private void updateSinkStat(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent()) {
            final LongAccumulator avgRecordSizeCounter = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    }

    private void logWriteMetrics(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent() && this.dataFeedMetrics.isPresent()) {
            final LongAccumulator totalCount = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'writeStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'commitTime'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    // If set then it is used for creating new hoodie commit.
    private Optional<String> commitTime = Optional.absent();

    @Setter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    private final transient JavaSparkContext jsc;
    private final HoodieSinkOp op;
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
    private final Map<String, String> dataFeedMetricsTags = new HashMap<>();
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'exception'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
    }
}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     */
    public static UserDefinedBulkInsertPartitioner getDataPartitioner(@NonNull final HoodieConfiguration hoodieConf,
        @NonNull final Optional<String> defaultDataPartitioner) {
        try {
            return (UserDefinedBulkInsertPartitioner) Class.forName(hoodieConf.getHoodieDataPartitioner(
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public void commit(@NonNull final HoodieWriteClientWrapper hoodieWriteClient,
                          @NotEmpty final String commitTime,
                          @NonNull final Optional<JavaRDD<WriteStatus>> writesStatuses,
                          final boolean shouldSaveChangesInFuture) {
        updateSinkStat(writesStatuses);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public void commit(@NonNull final HoodieWriteClientWrapper hoodieWriteClient,
                          @NotEmpty final String commitTime,
                          @NonNull final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        this.commit(hoodieWriteClient, commitTime, writesStatuses, this.shouldSaveChangesInFuture);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
                      @NonNull final HoodieSinkOp op,
                      @NonNull final IMetadataManager metadataMgr,
                      @NonNull final Optional<String> defaultDataPartitioner) {
      this(hoodieConf, hoodieSinkDataConverter, jsc, op, metadataMgr, false, defaultDataPartitioner);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
                      @NonNull final IMetadataManager metadataMgr,
                      final boolean shouldSaveChangesInFuture,
                      @NonNull final Optional<String> defaultDataPartitioner) {
        this.hoodieConf = hoodieConf;
        this.hoodieSinkDataConverter = hoodieSinkDataConverter;
```

### OptionalUsedAsFieldOrParameterType
`java.util.Optional`> used as type for parameter 'extraMetadata'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

        public boolean commit(@NotEmpty final String commitTime, @NonNull final JavaRDD<WriteStatus> writeStatuses,
            final java.util.Optional<HashMap<String, String>> extraMetadata) {
            return this.hoodieWriteClient.commit(commitTime, writeStatuses, extraMetadata);
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'oldestTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();
    private int numTimestamps;
    private Optional<String> oldestTimestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    protected final CassandraSchema schema;
    protected final CassandraMetadataSchemaManager schemaManager;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();
    private int numTimestamps;
    private Optional<String> oldestTimestamp;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java

    private final List<IMetadataManager<StringValue>> metadataManagersList;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tableMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraSink.java`
#### Snippet
```java
    protected final CassandraSinkConfiguration conf;
    protected final CassandraSinkSchemaManager schemaManager;
    protected transient Optional<DataFeedMetrics> tableMetrics = Optional.absent();

    public CassandraSink(@NonNull final CassandraSinkSchemaManager schemaManager,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'data'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @param data input payload
     */
    protected abstract void executeNode(@NonNull final Optional<IPayload> data);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'data'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * #childNodes}'s {@link #execute(Optional)} method.
     */
    public final void execute(@NonNull final Optional<IPayload> data) {
        Preconditions.checkState(this.dataFeedMetrics.isPresent() && this.jobMetrics.isPresent(),
            "Missing dataFeed or job metrics");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jobMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

    @Getter
    private Optional<JobMetrics> jobMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
        private final Configuration conf;
        private final String tableKey;
        private Optional<String> version = Optional.absent();

        private Builder(@NonNull final Configuration conf, @NotEmpty final String tableKey) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java

    public HoodieConfiguration(@NonNull final Configuration conf, @NotEmpty final String tableKey,
            @NonNull final Optional<String> version) {
        this.conf = conf;
        this.tableKey = tableKey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
    private final String tableKey;
    @Getter
    private final Optional<String> version;

    public HoodieConfiguration(@NonNull final Configuration conf, @NotEmpty final String tableKey,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
                                    @NotEmpty final String tableName,
                                    @NonNull final TimestampInfo timestampInfo,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this.keySpace = keySpace;
        this.tableName = tableName;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
    public CassandraSchemaConverter(@NotEmpty final String keySpace,
                                    @NotEmpty final String tableName,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this(keySpace, tableName, TimestampInfo.generateEmptyTimestampInfo(), filteredFields);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
     * and not all the available fields from the source data.
     */
    final Optional<Set<String>> filteredFields;

    public CassandraSchemaConverter(@NotEmpty final String keySpace,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tableName'
in `marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
    public static void writeErrorRecordsToErrorTable(@NonNull final SparkContext sc,
                                                     @NonNull final Configuration conf,
                                                     @NonNull final Optional<String> tableName,
                                                     @NonNull final RDDWrapper<ErrorData> errorData,
                                                     @NonNull final ErrorExtractor errorExtractor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nativeApplicationPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> nativeApplicationPort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rpcPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> rpcPort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sslStoragePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> sslStoragePort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'listOfNodes'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> listOfNodes;

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sslStoragePart'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    private Optional<String> listOfNodes;

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rpcPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
        this.sslStoragePort = sslStoragePart;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'storagePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
        this.sslStoragePort = sslStoragePart;
        this.rpcPort = rpcPort;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'storagePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> storagePort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
                                      final boolean orderRequired) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
                                      final boolean orderRequired) {
        super(schema, partitionKeys, clusteringKeys, ttl, dataFeedMetrics, timestamp, orderRequired);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> timestamp) {
        super(schema, partitionKeys, clusteringKeys, Optional.absent(), Optional.absent(), timestamp, false);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'recordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
        }

        private <T> void processRecordHandler(@NonNull final Optional<VoidFunction<T>> recordHandler,
                                              @NonNull final T data, @NotEmpty final String recordHandlerType) {
            if (recordHandler.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java

    @NonNull
    protected Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    public AbstractDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'successRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    @NonNull
    @Setter
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'failureRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    @NonNull
    @Setter
    protected Optional<VoidFunction<ID>> failureRecordHandler = Optional.absent();
    /**
     * If defined then {@link #successRecordHandler} will be invoked with output record if record conversion succeeds
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java

    public JsonNode projectOverrideScopeOverDefault(
        @NonNull final Optional<String> scope, @NonNull final JsonNode rootJsonNode) {
        if (!scope.isPresent() || !rootJsonNode.isContainerNode()) {
            log.info("No scope overriding in effect. "
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'errorData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    @NonNull
    @Getter
    protected Optional<ErrorData<ID>> errorData;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'successData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    @NonNull
    @Getter
    protected Optional<ValidData<OD>> successData;

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writeTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> writeTimestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> writtenTime;

    public CassandraSinkConfiguration(@NonNull final Configuration conf,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filteredColumns'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
     */
    @Getter
    private final Optional<Set<String>> filteredColumns;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'groupRDD'
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkOperator.java`
#### Snippet
```java
    private final JavaRDD<DI> inputRDD;
    private final ForkFunction<DI> forkFunction;
    private Optional<JavaRDD<ForkData<DI>>> groupRDD = Optional.absent();
    @Getter
    private final StorageLevel persistLevel;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'path'
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
     */
    public static FileSystem getFs(@NonNull final org.apache.hadoop.conf.Configuration hadoopConf,
                                   @NonNull final Optional<String> path) throws IOException {
        final FileSystem fs = path.isPresent() ? new Path(path.get()).getFileSystem(hadoopConf)
                                               : FileSystem.get(hadoopConf);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'path'
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
     */
    public static FileSystem getFs(@NonNull final Configuration conf,
                                   @NonNull final Optional<String> path) throws IOException {
        return getFs(new HadoopConfiguration(conf).getHadoopConf(), path);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filterRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
     * report read size metrics per partition and total along with individual record stats like average size
     */
    private static void reportReadMetrics(@NonNull final Optional<DataFeedMetrics> topicMetrics,
                                          @NonNull final LongAccumulator totalDataReadInBytes,
                                          final long totalPartitions) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java

    public KafkaSource(@NonNull final KafkaSourceConfiguration conf,
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'startDateFilterFunction'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filterRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
        this.jsc = jsc;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceConfiguration conf;
    @Getter
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    @Getter
    private final KafkaSourceDataConverter dataConverter;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'startDateFilterFunction'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceDataConverter dataConverter;
    @Getter
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    public KafkaSource(@NonNull final KafkaSourceConfiguration conf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'previousRunState'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<KafkaRunState> previousRunState = Optional.absent();

    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'chargebackCalculator'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    private Optional<IChargebackCalculator> chargebackCalculator = Optional.absent();

    @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private Optional<KafkaRunState> previousRunState = Optional.absent();

    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    private Optional<IChargebackCalculator> chargebackCalculator = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'kafkaOffsetResetter'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<KafkaOffsetResetter> kafkaOffsetResetter = Optional.absent();

    @Getter
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
                log.debug("Line to calculate: {}", row);
                final byte[] utf8Bytes;
                utf8Bytes = row.getBytes("UTF-8");
                log.debug("Row Size: {}", utf8Bytes.length);
                //Add 1 byte size for end of line '/n' for each sample row
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/utilities/ByteBufferUtil.java`
#### Snippet
```java

    public static String convertToString(final ByteBuffer bb) {
        return new String(bb.array(), Charset.forName(StandardCharsets.UTF_8.toString()));
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/utilities/ByteBufferUtil.java`
#### Snippet
```java
    public static ByteBuffer wrap(final String value) {
        try {
            return ByteBuffer.wrap(value.getBytes(StandardCharsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            // should never see this
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java
            final List<String> stack = new ArrayList<>();
            for (String str: Arrays.asList(details.split("\n"))) {
                stack.add(str.replaceFirst("\\([a-zA-Z0-9:.\\s]*\\)", ""));
            }
            return stack;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
            // This table name is used for sending metrics to graphite by hoodie. It expects table name to be without
            // ".".
            builder.forTable(getTableName().replaceAll("\\.", StringTypes.UNDERSCORE));
            builder.withPath(getBasePath());
            final boolean combineBeforeInsert =
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java

    /**
     * Helper method to fix {@link org.apache.avro.Schema.Type#ENUM} datatypes in {@link GenericRecord}.
     */
    public static GenericRecord fixEnumRecord(@NonNull final GenericRecord record, @NonNull final Schema schema)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java

    @Override
    public java.lang.String toString() {
        return java.lang.String.format("%s:startTime[%s]:endTime[%s]",
                super.toString(), this.startTime, this.endTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java
    @Override
    public java.lang.String toString() {
        return java.lang.String.format("%s:startTime[%s]:endTime[%s]",
                super.toString(), this.startTime, this.endTime);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.hoodie` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        /** {@link HoodieWriteClient#bulkInsert(JavaRDD, String)} {@link HoodieWriteClient#filterExists(JavaRDD)}*/
        DEDUP_BULK_INSERT,
        /** {@link com.uber.hoodie.HoodieWriteClient#upsert(org.apache.spark.api.java.JavaRDD, java.lang.String)}*/
        UPSERT,
        /** No operation */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        /** {@link HoodieWriteClient#bulkInsert(JavaRDD, String)} {@link HoodieWriteClient#filterExists(JavaRDD)}*/
        DEDUP_BULK_INSERT,
        /** {@link com.uber.hoodie.HoodieWriteClient#upsert(org.apache.spark.api.java.JavaRDD, java.lang.String)}*/
        UPSERT,
        /** No operation */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        /** {@link HoodieWriteClient#bulkInsert(JavaRDD, String)} {@link HoodieWriteClient#filterExists(JavaRDD)}*/
        DEDUP_BULK_INSERT,
        /** {@link com.uber.hoodie.HoodieWriteClient#upsert(org.apache.spark.api.java.JavaRDD, java.lang.String)}*/
        UPSERT,
        /** No operation */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java

    protected HoodieRecordPayload getPayload(@NonNull final AvroPayload payload) {
        return new HoodieAvroPayload(java.util.Optional.of(payload.getData()));
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.hoodie.common.model` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
/**
 * {@link HoodieSinkDataConverter} extends {@link SinkDataConverter}
 * This class is used by {@link HoodieSink} to generate {@link com.uber.hoodie.common.model.HoodieRecord} from
 * {@link com.uber.marmaray.common.AvroPayload}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.marmaray.common` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
 * {@link HoodieSinkDataConverter} extends {@link SinkDataConverter}
 * This class is used by {@link HoodieSink} to generate {@link com.uber.hoodie.common.model.HoodieRecord} from
 * {@link com.uber.marmaray.common.AvroPayload}.
 */
public abstract class HoodieSinkDataConverter extends SinkDataConverter<Schema, HoodieRecord<HoodieRecordPayload>> {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.marmaray.common.sinks` is unnecessary and can be removed
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java
/**
 * {@link SingleSinkSubDag} is used when {@link JobDag} is configured to run for single
 * {@link com.uber.marmaray.common.sinks.ISink}.
 */
@Slf4j
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `FileSourceDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileSourceDataConverter.java`
#### Snippet
```java
public abstract class FileSourceDataConverter extends SourceDataConverter<Schema, String> {

    public FileSourceDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Dag()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/job/Dag.java`
#### Snippet
```java
    private Map<String, String> jobManagerMetadata;

    public Dag(@NonNull final String jobName, @NonNull final String dataFeedName) {
        this.dataFeedName = dataFeedName;
        this.jobName = jobName;
```

### NonProtectedConstructorInAbstractClass
Constructor `FileSink()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
    protected int digitNum;

    public FileSink(@NonNull final FileSinkConfiguration conf, @NonNull final FileSinkDataConverter converter) {
        this.conf = conf;
        this.converter = converter;
```

### NonProtectedConstructorInAbstractClass
Constructor `SinkDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SinkDataConverter.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public SinkDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FileSinkDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataConverter.java`
#### Snippet
```java
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS Z";

    public FileSinkDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SourceDataConverter.java`
#### Snippet
```java
 */
public abstract class SourceDataConverter<IS, ID> extends AbstractDataConverter<IS, Schema, ID, AvroPayload> {
    public SourceDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `HoodieSinkDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
    }

    public HoodieSinkDataConverter(@NonNull final Configuration conf, final String schema,
                                   @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
```

### NonProtectedConstructorInAbstractClass
Constructor `HoodieSinkDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
    private final ErrorExtractor errorExtractor;

    public HoodieSinkDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        super(conf, errorExtractor);
        this.errorExtractor = errorExtractor;
```

### NonProtectedConstructorInAbstractClass
Constructor `CassandraSink()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraSink.java`
#### Snippet
```java
    protected transient Optional<DataFeedMetrics> tableMetrics = Optional.absent();

    public CassandraSink(@NonNull final CassandraSinkSchemaManager schemaManager,
                                @NonNull final CassandraSinkConfiguration conf) {
        this.schemaManager = schemaManager;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDataConverter()` of an abstract class should not be declared 'public'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    public AbstractDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
        this.conf = conf;
        this.errorExtractor = errorExtractor;
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
        try {
            cmd = parser.parse(options, args);
        } catch (final ParseException e) {
            throw e;
        }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
            } catch (final IllegalArgumentException e) {
                // the fieldname did not exist in the row which is ok, skip it
                continue;
            }
        }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `service`
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                        TimeUnit.SECONDS);
        threadPoolServiceCallable.setFuture(future);
        synchronized (service) {
            if (tier.equals(ThreadPoolServiceTier.JOB_DAG_TIER)) {
                if (service.canScheduleJobDag()) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
        if (isOptional(schema)) {
            if (value == null) {
                return null;
            } else {
                nonOptionalSchema = getNonNull(schema);
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/utilities/StringUtil.java`
#### Snippet
```java
    public static String internString(final String input) {
        if (input == null) {
            return null;
        } else {
            return input.intern();
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
    @Override
    public String getHeader(@NonNull final JavaRDD<AvroPayload> data) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
                                                           @NonNull final K classTag) {
        if (serializedRecord == null) {
            return null;
        }
        return getSerializerInstance().deserialize(ByteBuffer.wrap(serializedRecord), classTag);
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
    public static <T, K extends ClassTag<T>> byte[] serialize(final T record, @NonNull final K classTag) {
        if (record == null) {
            return null;
        }
        final byte[] serializedData = getSerializerInstance().serialize(record, classTag).array();
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/DummyHoodieSinkDataConverter.java`
#### Snippet
```java
    @Override
    protected String getRecordKey(@NonNull final AvroPayload payload) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/DummyHoodieSinkDataConverter.java`
#### Snippet
```java
    @Override
    protected String getPartitionPath(@NonNull final AvroPayload payload) throws Exception {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
                computeNext();
                if (this.newFilesQ.isEmpty()) {
                    return null;
                } else {
                    return this.newFilesQ.pollFirst();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `jobName` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java

    private static String getJobName(final int stageId) {
        final String jobName = stageIdNameMap.getOrDefault(stageId, UNKNOWN_JOB_NAME);
        return jobName;
    }
```

### UnnecessaryLocalVariable
Local variable `structType` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
        final MessageType messageType = metadata.getFileMetaData().getSchema();
        final ParquetSchemaConverter converter = new ParquetSchemaConverter(new SQLConf());
        final StructType structType = converter.convert(messageType);
        return structType;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
     */
    protected JavaRDD<String> addColumnHeader(@NonNull final String header, @NonNull final JavaRDD<String> data) {
        final JavaRDD<String> result = data.mapPartitions((lines) -> {
                final List<String> partitionList = IteratorUtils.toList(lines);
                partitionList.add(0, header);
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        public Object call() throws Exception {
            try {
                final Object result = this.wrappedCallable.call();
                return result;
            } finally {
```

### UnnecessaryLocalVariable
Local variable `lines` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
            }
        }
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = convert(row).get(0).getSuccessData().get().getData();
                final String rowKey = this.row_identifier.isEmpty() ? key
```

### UnnecessaryLocalVariable
Local variable `partitions` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        log.info("Searching for partitions in path: {}", partitionFolderRegex);
        final FileStatus[] fileStatuses  = this.fileSystem.globStatus(new Path(partitionFolderRegex));
        final List<String> partitions = Arrays.asList(fileStatuses).stream()
                .map(fileStatus -> fileStatus.getPath().getName())
                // filter out hidden files/directories
```

### UnnecessaryLocalVariable
Local variable `lines` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
        }
        final String rowKey = data.first().getData().getSchema().getName();
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = this.convert(row).get(0).getSuccessData().get().getData();
                log.debug("Line: {}", line);
```

### UnnecessaryLocalVariable
Local variable `partitions` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
        final LocalDate startDate = localDate.plusDays(1);

        final List<LocalDate> partitions = getExistingPartitions()
                .stream()
                .map(dt -> DateUtil.convertToUTCDate(dt.replace(this.partitionKeyName, StringTypes.EMPTY)))
```

### UnnecessaryLocalVariable
Local variable `hasPartitionKey` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    private boolean hasPartitionKeyNameInPartition()  {
        try {
            final boolean hasPartitionKey = getExistingPartitions()
                    .stream()
                    .anyMatch(partition -> partition.startsWith(this.partitionKeyName));
```

### UnnecessaryLocalVariable
Local variable `data` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java
        try {
            HoodieRecord<HoodieRecordPayload> payload = (HoodieRecord) errorData.getRawData().getData();
            String data = String.format("%s. %s", payload.getKey().toString(),
                String.format("HoodieRecordPayload %s", payload.getData().toString()));
            return data;
```

### UnnecessaryLocalVariable
Local variable `cleaned` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

### UnnecessaryLocalVariable
Local variable `serializedData` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
            return null;
        }
        final byte[] serializedData = getSerializerInstance().serialize(record, classTag).array();
        return serializedData;
    }
```

### UnnecessaryLocalVariable
Local variable `checkpoints` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            metadata.put(entry.getKey(), entry.getValue().getValue());
        }
        String checkpoints = MapUtil.serializeMap(metadata);
        return checkpoints;
    }
```

### UnnecessaryLocalVariable
Local variable `totalSize` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java
                .orElse(0);

        final long totalSize = (long) (byteSize * (((totalRows) * 1.0) / (NO_OF_SAMPLE_ROWS)));

        return totalSize;
```

### UnnecessaryLocalVariable
Local variable `fs` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
    public static FileSystem getFs(@NonNull final org.apache.hadoop.conf.Configuration hadoopConf,
                                   @NonNull final Optional<String> path) throws IOException {
        final FileSystem fs = path.isPresent() ? new Path(path.get()).getFileSystem(hadoopConf)
                                               : FileSystem.get(hadoopConf);
        return fs;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            log.info("waiting for tasks to clear out of queue.");
            try {
                Thread.sleep(AWAIT_TERMINATION_CHECK_INTERVAL_MS);
                terminationChecks += 1;
            } catch (InterruptedException e) {
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Runtime exception instance `new JobRuntimeException()` is not thrown
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
        } catch (Exception e) {
            isSuccess.set(false);
            new JobRuntimeException("Failed to lock all keys at once", e);
        } finally {
            if (!isSuccess.get()) {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    public Properties getProperties() {
        final Properties properties = new Properties();
        this.props.forEach((k, v) -> properties.put(k, v));
        return properties;
    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/ClusterKey.java`
#### Snippet
```java
     */
    public static ClusterKey parse(@NotEmpty final String value) {
        final List<String> tokens = splitter.splitToList(value);
        Preconditions.checkState(tokens.size() <= 2);

```

