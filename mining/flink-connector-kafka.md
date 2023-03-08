# flink-connector-kafka 
 
# Bad smells
I found 247 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 53 | false |
| NullableProblems | 29 | false |
| UseOfPropertiesAsHashtable | 24 | false |
| ReturnNull | 18 | false |
| UnnecessaryFullyQualifiedName | 16 | false |
| SizeReplaceableByIsEmpty | 15 | true |
| MissortedModifiers | 11 | false |
| RedundantFieldInitialization | 9 | false |
| UtilityClassWithoutPrivateConstructor | 8 | true |
| PublicFieldAccessedInSynchronizedContext | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| DataFlowIssue | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| UnnecessarySemicolon | 2 | false |
| OptionalContainsCollection | 2 | false |
| UnnecessaryBoxing | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| Convert2Lambda | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| ArrayHashCode | 2 | false |
| UnusedAssignment | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| RegExpRedundantEscape | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| NestedSynchronizedStatement | 1 | false |
| RedundantSuppression | 1 | false |
| SystemOutErr | 1 | false |
| NestedAssignment | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (mode) { case TIMESTAMP: ...` statement on enum type 'org.apache.flink.streaming.connectors.kafka.table.KafkaConnectorOptions.ScanStartupMode' misses cases: 'EARLIEST_OFFSET', 'LATEST_OFFSET', ...
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
switch (mode) {
                                case TIMESTAMP:
                                    if (!tableOptions
                                            .getOptional(SCAN_STARTUP_TIMESTAMP_MILLIS)
                                            .isPresent()) {
                                        throw new ValidationException(
                                                String.format(
                                                        "'%s' is required in '%s' startup mode"
                                                                + " but missing.",
                                                        SCAN_STARTUP_TIMESTAMP_MILLIS.key(),
                                                        ScanStartupMode.TIMESTAMP));
                                    }

                                    break;
                                case SPECIFIC_OFFSETS:
                                    if (!tableOptions
                                            .getOptional(SCAN_STARTUP_SPECIFIC_OFFSETS)
                                            .isPresent()) {
                                        throw new ValidationException(
                                                String.format(
                                                        "'%s' is required in '%s' startup mode"
                                                                + " but missing.",
                                                        SCAN_STARTUP_SPECIFIC_OFFSETS.key(),
                                                        ScanStartupMode.SPECIFIC_OFFSETS));
                                    }
                                    if (!isSingleTopic(tableOptions)) {
                                        throw new ValidationException(
                                                "Currently Kafka source only supports specific offset for single topic.");
                                    }
                                    String specificOffsets =
                                            tableOptions.get(SCAN_STARTUP_SPECIFIC_OFFSETS);
                                    parseSpecificOffsets(
                                            specificOffsets, SCAN_STARTUP_SPECIFIC_OFFSETS.key());

                                    break;
                            }
```

### EnumSwitchStatementWhichMissesCases
`switch (mode) { case TIMESTAMP: ...` statement on enum type 'org.apache.flink.streaming.connectors.kafka.table.KafkaConnectorOptions.ScanBoundedMode' misses cases: 'UNBOUNDED', 'LATEST_OFFSET', and 'GROUP_OFFSETS'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
switch (mode) {
                                case TIMESTAMP:
                                    if (!tableOptions
                                            .getOptional(SCAN_BOUNDED_TIMESTAMP_MILLIS)
                                            .isPresent()) {
                                        throw new ValidationException(
                                                String.format(
                                                        "'%s' is required in '%s' bounded mode"
                                                                + " but missing.",
                                                        SCAN_BOUNDED_TIMESTAMP_MILLIS.key(),
                                                        ScanBoundedMode.TIMESTAMP));
                                    }

                                    break;
                                case SPECIFIC_OFFSETS:
                                    if (!tableOptions
                                            .getOptional(SCAN_BOUNDED_SPECIFIC_OFFSETS)
                                            .isPresent()) {
                                        throw new ValidationException(
                                                String.format(
                                                        "'%s' is required in '%s' bounded mode"
                                                                + " but missing.",
                                                        SCAN_BOUNDED_SPECIFIC_OFFSETS.key(),
                                                        ScanBoundedMode.SPECIFIC_OFFSETS));
                                    }
                                    if (!isSingleTopic(tableOptions)) {
                                        throw new ValidationException(
                                                "Currently Kafka source only supports specific offset for single topic.");
                                    }
                                    String specificOffsets =
                                            tableOptions.get(SCAN_BOUNDED_SPECIFIC_OFFSETS);
                                    parseSpecificOffsets(
                                            specificOffsets, SCAN_BOUNDED_SPECIFIC_OFFSETS.key());
                                    break;
                            }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `KafkaSourceOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/KafkaSourceOptions.java`
#### Snippet
```java
/** Configurations for KafkaSource. */
@Internal
public class KafkaSourceOptions {

    public static final ConfigOption<String> CLIENT_ID_PREFIX =
```

### UtilityClassWithoutPrivateConstructor
Class `OffsetCommitModes` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/config/OffsetCommitModes.java`
#### Snippet
```java
/** Utilities for {@link OffsetCommitMode}. */
@Internal
public class OffsetCommitModes {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TransactionalIdFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/TransactionalIdFactory.java`
#### Snippet
```java
package org.apache.flink.connector.kafka.sink;

class TransactionalIdFactory {
    private static final String TRANSACTIONAL_ID_DELIMITER = "-";

```

### UtilityClassWithoutPrivateConstructor
Class `KafkaTopicPartitionStateSentinel` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartitionStateSentinel.java`
#### Snippet
```java
 */
@Internal
public class KafkaTopicPartitionStateSentinel {

    /** Magic number that defines an unset offset. */
```

### UtilityClassWithoutPrivateConstructor
Class `KafkaTopicPartitionAssigner` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartitionAssigner.java`
#### Snippet
```java
/** Utility for assigning Kafka partitions to consumer subtasks. */
@Internal
public class KafkaTopicPartitionAssigner {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FlinkKafkaShuffle` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
 */
@Experimental
public class FlinkKafkaShuffle {
    static final String PRODUCER_PARALLELISM = "producer parallelism";
    static final String PARTITION_NUMBER = "partition number";
```

### UtilityClassWithoutPrivateConstructor
Class `KafkaConsumerMetricConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/metrics/KafkaConsumerMetricConstants.java`
#### Snippet
```java
 */
@Internal
public class KafkaConsumerMetricConstants {

    public static final String KAFKA_CONSUMER_METRICS_GROUP = "KafkaConsumer";
```

### UtilityClassWithoutPrivateConstructor
Class `MetricUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/MetricUtil.java`
#### Snippet
```java
/** Collection of methods to interact with Kafka's client metric system. */
@Internal
public class MetricUtil {

    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getProducer` may produce `NullPointerException`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java

            pendingRecords.incrementAndGet();
            transaction.getProducer().send(record, callback);
        }
    }
```

### DataFlowIssue
Argument `producer.getTransactionalId()` might be null
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    private void recycleTransactionalProducer(FlinkKafkaInternalProducer<byte[], byte[]> producer) {
        availableTransactionalIds.add(producer.getTransactionalId());
        producer.flush();
        producer.close(Duration.ofSeconds(0));
```

### DataFlowIssue
Dereference of `currentTransaction()` may produce `NullPointerException`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            if (currentTransaction() != null) {
                try {
                    currentTransaction().producer.close(Duration.ofSeconds(0));
                } catch (Throwable t) {
                    LOG.warn("Error closing producer.", t);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/config/OffsetCommitMode.java`
#### Snippet
```java
     * Kafka clients.
     */
    KAFKA_PERIODIC;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/config/BoundedMode.java`
#### Snippet
```java
     * not provided it will not consume from that partition.
     */
    SPECIFIC_OFFSETS;
}

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'KeyedDeserializationSchema' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/KeyedDeserializationSchema.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface KeyedDeserializationSchema<T> extends KafkaDeserializationSchema<T> {
    /**
     * Deserializes the byte message.
```

### DeprecatedIsStillUsed
Deprecated member 'subtaskMetricGroup' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaConsumerThread.java`
#### Snippet
```java
     *     to retain compatibility for metrics.
     */
    @Deprecated private final MetricGroup subtaskMetricGroup;

    /** We get this from the outside to publish metrics. */
```

### DeprecatedIsStillUsed
Deprecated member 'assignTimestampsAndWatermarks' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
     */
    @Deprecated
    public FlinkKafkaConsumerBase<T> assignTimestampsAndWatermarks(
            AssignerWithPeriodicWatermarks<T> assigner) {
        checkNotNull(assigner);
```

### DeprecatedIsStillUsed
Deprecated member 'assignTimestampsAndWatermarks' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
     */
    @Deprecated
    public FlinkKafkaConsumerBase<T> assignTimestampsAndWatermarks(
            AssignerWithPunctuatedWatermarks<T> assigner) {
        checkNotNull(assigner);
```

### DeprecatedIsStillUsed
Deprecated member 'FlinkKafkaConsumer' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
@PublicEvolving
@Deprecated
public class FlinkKafkaConsumer<T> extends FlinkKafkaConsumerBase<T> {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
                physicalType.is(LogicalTypeRoot.ROW), "Row data type expected.");
        final Optional<String> optionalKeyFormat = options.getOptional(KEY_FORMAT);
        final Optional<List<String>> optionalKeyFields = options.getOptional(KEY_FIELDS);

        if (!optionalKeyFormat.isPresent() && optionalKeyFields.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java

    public static void validateSourceTopic(ReadableConfig tableOptions) {
        Optional<List<String>> topic = tableOptions.getOptional(TOPIC);
        Optional<String> pattern = tableOptions.getOptional(TOPIC_PATTERN);

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

    protected static Enum<?> getEnum(String enumFullName) {
        String[] x = enumFullName.split("\\.(?=[^\\.]+$)");
        if (x.length == 2) {
            String enumClassName = x[0];
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`metadataKeys.size() > 0` can be replaced with '!metadataKeys.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    private boolean hasMetadata() {
        return metadataKeys.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`keyPrefix.length() > 0` can be replaced with '!keyPrefix.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
        final ValueFieldsStrategy strategy = options.get(VALUE_FIELDS_INCLUDE);
        if (strategy == ValueFieldsStrategy.ALL) {
            if (keyPrefix.length() > 0) {
                throw new ValidationException(
                        String.format(
```

### SizeReplaceableByIsEmpty
`optionalKeyFields.get().size() == 0` can be replaced with 'optionalKeyFields.get().isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
                            KEY_FIELDS.key(), KEY_FORMAT.key()));
        } else if (optionalKeyFormat.isPresent()
                && (!optionalKeyFields.isPresent() || optionalKeyFields.get().size() == 0)) {
            throw new ValidationException(
                    String.format(
```

### SizeReplaceableByIsEmpty
`pair.length() == 0` can be replaced with 'pair.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java

        for (String pair : pairs) {
            if (null == pair || pair.length() == 0 || !pair.contains(",")) {
                throw new ValidationException(validationExceptionMessage);
            }
```

### SizeReplaceableByIsEmpty
`newPartitions.size() == 0` can be replaced with 'newPartitions.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaConsumerThread.java`
#### Snippet
```java
    void reassignPartitions(List<KafkaTopicPartitionState<T, TopicPartition>> newPartitions)
            throws Exception {
        if (newPartitions.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
        try {
            if (open) {
                if (elements.size() > 0) {
                    return elements.removeFirst();
                } else {
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
        try {
            if (open) {
                if (elements.size() > 0) {
                    return elements.getFirst();
                } else {
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
        try {
            if (open) {
                if (elements.size() > 0) {
                    ArrayList<E> result = new ArrayList<>(elements);
                    elements.clear();
```

### SizeReplaceableByIsEmpty
`matchedTopics.size() != 0` can be replaced with '!matchedTopics.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractPartitionDiscoverer.java`
#### Snippet
```java
                    }

                    if (matchedTopics.size() != 0) {
                        // get partitions only for matched topics
                        newDiscoveredPartitions = getAllPartitionsForTopics(matchedTopics);
```

### SizeReplaceableByIsEmpty
`recordsFromPartition.size() > 0` can be replaced with '!recordsFromPartition.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
                    consumerRecords.records(tp);

            if (recordsFromPartition.size() > 0) {
                final ConsumerRecord<byte[], byte[]> lastRecord =
                        recordsFromPartition.get(recordsFromPartition.size() - 1);
```

### SizeReplaceableByIsEmpty
`partitionsDefaultedToGroupOffsets.size() > 0` can be replaced with '!partitionsDefaultedToGroupOffsets.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
                        }

                        if (partitionsDefaultedToGroupOffsets.size() > 0) {
                            LOG.warn(
                                    "Consumer subtask {} cannot find offsets for the following {} partitions in the specified startup offsets: {}"
```

### SizeReplaceableByIsEmpty
`offsets.size() == 0` can be replaced with 'offsets.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
                }

                if (offsets == null || offsets.size() == 0) {
                    LOG.debug(
                            "Consumer subtask {} has empty checkpoint state.",
```

### SizeReplaceableByIsEmpty
`formatMetadata.size() > 0` can be replaced with '!formatMetadata.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java
        // push down format metadata
        final Map<String, DataType> formatMetadata = valueDecodingFormat.listReadableMetadata();
        if (formatMetadata.size() > 0) {
            final List<String> requestedFormatMetadataKeys =
                    formatMetadataKeys.stream()
```

### SizeReplaceableByIsEmpty
`metadataKeys.size() > 0` can be replaced with '!metadataKeys.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

        // check if connector metadata is used at all
        final boolean hasMetadata = metadataKeys.size() > 0;

        // adjust physical arity with value format's metadata
```

### SizeReplaceableByIsEmpty
`transactionalIdHints.size() == 0` can be replaced with 'transactionalIdHints.isEmpty()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
                throw new IllegalStateException(
                        "There should be at most one next transactional id hint written by the first subtask");
            } else if (transactionalIdHints.size() == 0) {
                nextTransactionalIdHint = new FlinkKafkaProducer.NextTransactionalIdHint(0, 0);

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'ListStateDescriptor'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        if (context.getOperatorStateStore()
                .getRegisteredStateNames()
                .contains(NEXT_TRANSACTIONAL_ID_HINT_DESCRIPTOR)) {
            migrateNextTransactionalIdHindState(context);
        }
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

            Object transactionManager = getField(kafkaProducer, "transactionManager");
            synchronized (transactionManager) {
                Object topicPartitionBookkeeper =
                        getField(transactionManager, "topicPartitionBookkeeper");
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/KafkaSourceOptions.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> T getOption(
            Properties props, ConfigOption<?> configOption, Function<String, T> parser) {
        String value = props.getProperty(configOption.key());
        return (T) (value == null ? configOption.defaultValue() : parser.apply(value));
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/ReducingUpsertWriter.java`
#### Snippet
```java
            SinkBufferFlushMode bufferFlushMode,
            ProcessingTimeService timeService,
            Function<RowData, RowData> valueCopyFunction) {
        checkArgument(bufferFlushMode != null && bufferFlushMode.isEnabled());
        this.wrappedWriter = checkNotNull(wrappedWriter);
```

### BoundedWildcard
Can generalize to `? extends RowData`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/ReducingUpsertWriter.java`
#### Snippet
```java
            SinkBufferFlushMode bufferFlushMode,
            ProcessingTimeService timeService,
            Function<RowData, RowData> valueCopyFunction) {
        checkArgument(bufferFlushMode != null && bufferFlushMode.isEnabled());
        this.wrappedWriter = checkNotNull(wrappedWriter);
```

### BoundedWildcard
Can generalize to `? extends DeserializationSchema`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/UpsertKafkaDynamicTableFactory.java`
#### Snippet
```java

        public DecodingFormatWrapper(
                DecodingFormat<DeserializationSchema<RowData>> innerDecodingFormat) {
            this.innerDecodingFormat = innerDecodingFormat;
        }
```

### BoundedWildcard
Can generalize to `? extends SerializationSchema`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/UpsertKafkaDynamicTableFactory.java`
#### Snippet
```java

        public EncodingFormatWrapper(
                EncodingFormat<SerializationSchema<RowData>> innerEncodingFormat) {
            this.innerEncodingFormat = innerEncodingFormat;
        }
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
        private final TopicSelector<IN> topicSelector;

        CachingTopicSelector(TopicSelector<IN> topicSelector) {
            this.topicSelector = topicSelector;
            this.cache = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     */
    public <T extends IN> KafkaRecordSerializationSchemaBuilder<T> setValueSerializationSchema(
            SerializationSchema<T> valueSerializationSchema) {
        checkValueSerializerNotSet();
        KafkaRecordSerializationSchemaBuilder<T> self = self();
```

### BoundedWildcard
Can generalize to `? extends LogicalType`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    private RowData.FieldGetter[] getFieldGetters(
            List<LogicalType> physicalChildren, int[] keyProjection) {
        return Arrays.stream(keyProjection)
                .mapToObj(
```

### BoundedWildcard
Can generalize to `? extends SerializationSchema`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
    private @Nullable SerializationSchema<RowData> createSerialization(
            DynamicTableSink.Context context,
            @Nullable EncodingFormat<SerializationSchema<RowData>> format,
            int[] projection,
            @Nullable String prefix) {
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java
        private transient DataOutputSerializer dos;

        KafkaSerializer(TypeSerializer<IN> serializer) {
            this.serializer = serializer;
        }
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java
            TypeSerializer<IN> typeSerializer,
            Properties props,
            KeySelector<IN, KEY> keySelector,
            Semantic semantic,
            int kafkaProducersPoolSize) {
```

### BoundedWildcard
Can generalize to `? super RecordMetadata`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaWriter.java`
#### Snippet
```java
        public WriterCallback(
                MailboxExecutor mailboxExecutor,
                @Nullable Consumer<RecordMetadata> metadataConsumer) {
            this.mailboxExecutor = mailboxExecutor;
            this.metadataConsumer = metadataConsumer;
```

### BoundedWildcard
Can generalize to `? super KafkaTopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
            ReadableConfig tableOptions,
            String topic,
            Map<KafkaTopicPartition, Long> specificOffsets) {
        String specificOffsetsStrOpt = tableOptions.get(SCAN_STARTUP_SPECIFIC_OFFSETS);
        final Map<Integer, Long> offsetMap =
```

### BoundedWildcard
Can generalize to `? super Long`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
            ReadableConfig tableOptions,
            String topic,
            Map<KafkaTopicPartition, Long> specificOffsets) {
        String specificOffsetsStrOpt = tableOptions.get(SCAN_STARTUP_SPECIFIC_OFFSETS);
        final Map<Integer, Long> offsetMap =
```

### BoundedWildcard
Can generalize to `? super KafkaTopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
            ReadableConfig tableOptions,
            String topic,
            Map<KafkaTopicPartition, Long> specificOffsets) {
        String specificOffsetsEndOpt = tableOptions.get(SCAN_BOUNDED_SPECIFIC_OFFSETS);
        final Map<Integer, Long> offsetMap =
```

### BoundedWildcard
Can generalize to `? super Long`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
            ReadableConfig tableOptions,
            String topic,
            Map<KafkaTopicPartition, Long> specificOffsets) {
        String specificOffsetsEndOpt = tableOptions.get(SCAN_BOUNDED_SPECIFIC_OFFSETS);
        final Map<Integer, Long> offsetMap =
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaRecordEmitter.java`
#### Snippet
```java
        public void close() {}

        private void setSourceOutput(SourceOutput<T> sourceOutput) {
            this.sourceOutput = sourceOutput;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/deserializer/KafkaValueOnlyDeserializerWrapper.java`
#### Snippet
```java

    @Override
    public void deserialize(ConsumerRecord<byte[], byte[]> record, Collector<T> collector)
            throws IOException {
        if (deserializer == null) {
```

### BoundedWildcard
Can generalize to `? extends ConsumerRecord`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java

    protected void partitionConsumerRecordsHandler(
            List<ConsumerRecord<byte[], byte[]>> partitionRecords,
            KafkaTopicPartitionState<T, TopicPartition> partition)
            throws Exception {
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java
            ClassLoader userCodeClassLoader,
            String taskNameWithSubtasks,
            KafkaDeserializationSchema<T> deserializer,
            Properties kafkaProperties,
            long pollTimeout,
```

### BoundedWildcard
Can generalize to `? extends KafkaTopicPartitionLeader`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartition.java`
#### Snippet
```java

    public static List<KafkaTopicPartition> dropLeaderData(
            List<KafkaTopicPartitionLeader> partitionInfos) {
        List<KafkaTopicPartition> ret = new ArrayList<>(partitionInfos.size());
        for (KafkaTopicPartitionLeader ktpl : partitionInfos) {
```

### BoundedWildcard
Can generalize to `? extends KafkaTopicPartitionState`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaConsumerThread.java`
#### Snippet
```java

    private static <T> List<TopicPartition> convertKafkaPartitions(
            List<KafkaTopicPartitionState<T, TopicPartition>> partitions) {
        ArrayList<TopicPartition> result = new ArrayList<>(partitions.size());
        for (KafkaTopicPartitionState<T, TopicPartition> p : partitions) {
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartitionStateWithWatermarkGenerator.java`
#### Snippet
```java
            KafkaTopicPartition partition,
            KPH kafkaPartitionHandle,
            TimestampAssigner<T> timestampAssigner,
            WatermarkGenerator<T> watermarkGenerator,
            WatermarkOutput immediateOutput,
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartitionStateWithWatermarkGenerator.java`
#### Snippet
```java
            KPH kafkaPartitionHandle,
            TimestampAssigner<T> timestampAssigner,
            WatermarkGenerator<T> watermarkGenerator,
            WatermarkOutput immediateOutput,
            WatermarkOutput deferredOutput) {
```

### BoundedWildcard
Can generalize to `? extends ConsumerRecord`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaShuffleFetcher.java`
#### Snippet
```java
    @Override
    protected void partitionConsumerRecordsHandler(
            List<ConsumerRecord<byte[], byte[]>> partitionRecords,
            KafkaTopicPartitionState<T, TopicPartition> partition)
            throws Exception {
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaSerializationSchemaWrapper.java`
#### Snippet
```java
    public KafkaSerializationSchemaWrapper(
            String topic,
            FlinkKafkaPartitioner<T> partitioner,
            boolean writeTimestamp,
            SerializationSchema<T> serializationSchema) {
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaSerializationSchemaWrapper.java`
#### Snippet
```java
            FlinkKafkaPartitioner<T> partitioner,
            boolean writeTimestamp,
            SerializationSchema<T> serializationSchema) {
        this.partitioner = partitioner;
        this.serializationSchema = serializationSchema;
```

### BoundedWildcard
Can generalize to `? super FlinkKafkaInternalProducer`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/TransactionAborter.java`
#### Snippet
```java
            int parallelism,
            Function<String, FlinkKafkaInternalProducer<byte[], byte[]>> producerFactory,
            Consumer<FlinkKafkaInternalProducer<byte[], byte[]>> closeAction) {
        this.subtaskId = subtaskId;
        this.parallelism = parallelism;
```

### BoundedWildcard
Can generalize to `? super Map.Entry`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/MetricUtil.java`
#### Snippet
```java
    public static Metric getKafkaMetric(
            Map<MetricName, ? extends Metric> metrics,
            Predicate<Map.Entry<MetricName, ? extends Metric>> filter) {
        return metrics.entrySet().stream()
                .filter(filter)
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaRecordSerializationSchema.java`
#### Snippet
```java
    DynamicKafkaRecordSerializationSchema(
            String topic,
            @Nullable FlinkKafkaPartitioner<RowData> partitioner,
            @Nullable SerializationSchema<RowData> keySerialization,
            SerializationSchema<RowData> valueSerialization,
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaRecordSerializationSchema.java`
#### Snippet
```java
            String topic,
            @Nullable FlinkKafkaPartitioner<RowData> partitioner,
            @Nullable SerializationSchema<RowData> keySerialization,
            SerializationSchema<RowData> valueSerialization,
            RowData.FieldGetter[] keyFieldGetters,
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/KafkaDeserializationSchema.java`
#### Snippet
```java
     * @param out The collector to put the resulting messages.
     */
    default void deserialize(ConsumerRecord<byte[], byte[]> message, Collector<T> out)
            throws Exception {
        T deserialized = deserialize(message);
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
            long stoppingOffset,
            long currentOffset,
            List<TopicPartition> finishedPartitions,
            KafkaPartitionSplitRecords recordsBySplits) {
        LOG.debug(
```

### BoundedWildcard
Can generalize to `? extends KafkaPartitionSplit`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java

    private void maybeLogSplitChangesHandlingResult(
            SplitsChange<KafkaPartitionSplit> splitsChange) {
        if (LOG.isDebugEnabled()) {
            StringJoiner splitsInfo = new StringJoiner(",");
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
    private void parseStoppingOffsets(
            KafkaPartitionSplit split,
            List<TopicPartition> partitionsStoppingAtLatest,
            Set<TopicPartition> partitionsStoppingAtCommitted) {
        TopicPartition tp = split.getTopicPartition();
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
            KafkaPartitionSplit split,
            List<TopicPartition> partitionsStoppingAtLatest,
            Set<TopicPartition> partitionsStoppingAtCommitted) {
        TopicPartition tp = split.getTopicPartition();
        split.getStoppingOffset()
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
    private void parseStartingOffsets(
            KafkaPartitionSplit split,
            List<TopicPartition> partitionsStartingFromEarliest,
            List<TopicPartition> partitionsStartingFromLatest,
            Map<TopicPartition, Long> partitionsStartingFromSpecifiedOffsets) {
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
            KafkaPartitionSplit split,
            List<TopicPartition> partitionsStartingFromEarliest,
            List<TopicPartition> partitionsStartingFromLatest,
            Map<TopicPartition, Long> partitionsStartingFromSpecifiedOffsets) {
        TopicPartition tp = split.getTopicPartition();
```

### BoundedWildcard
Can generalize to `? super TopicPartition`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
            List<TopicPartition> partitionsStartingFromEarliest,
            List<TopicPartition> partitionsStartingFromLatest,
            Map<TopicPartition, Long> partitionsStartingFromSpecifiedOffsets) {
        TopicPartition tp = split.getTopicPartition();
        // Parse starting offsets.
```

### BoundedWildcard
Can generalize to `? super Long`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
            List<TopicPartition> partitionsStartingFromEarliest,
            List<TopicPartition> partitionsStartingFromLatest,
            Map<TopicPartition, Long> partitionsStartingFromSpecifiedOffsets) {
        TopicPartition tp = split.getTopicPartition();
        // Parse starting offsets.
```

### BoundedWildcard
Can generalize to `? extends WatermarkStrategy`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java`
#### Snippet
```java
            Map<KafkaTopicPartition, Long> partitionsToInitialOffsets,
            int timestampWatermarkMode,
            SerializedValue<WatermarkStrategy<T>> watermarkStrategy,
            ClassLoader userCodeClassLoader)
            throws IOException, ClassNotFoundException {
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java`
#### Snippet
```java
     */
    protected void emitRecordsWithTimestamps(
            Queue<T> records,
            KafkaTopicPartitionState<T, KPH> partitionState,
            long offset,
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java`
#### Snippet
```java
    protected void emitRecordsWithTimestamps(
            Queue<T> records,
            KafkaTopicPartitionState<T, KPH> partitionState,
            long offset,
            long kafkaEventTimestamp) {
```

### BoundedWildcard
Can generalize to `? extends KafkaTopicPartitionState`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java`
#### Snippet
```java
    private void registerOffsetMetrics(
            MetricGroup consumerMetricGroup,
            List<KafkaTopicPartitionState<T, KPH>> partitionOffsetStates) {

        for (KafkaTopicPartitionState<T, KPH> ktp : partitionOffsetStates) {
```

### BoundedWildcard
Can generalize to `? super Exception`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
    }

    private void createAndStartDiscoveryLoop(AtomicReference<Exception> discoveryLoopErrorRef) {
        discoveryLoopThread =
                new Thread(
```

### BoundedWildcard
Can generalize to `? extends DeserializationSchema`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java
    private @Nullable DeserializationSchema<RowData> createDeserialization(
            DynamicTableSource.Context context,
            @Nullable DecodingFormat<DeserializationSchema<RowData>> format,
            int[] projection,
            @Nullable String prefix) {
```

### BoundedWildcard
Can generalize to `? extends KafkaPartitionSplit`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/enumerator/KafkaSourceEnumerator.java`
#### Snippet
```java
    // This method should only be invoked in the coordinator executor thread.
    private void addPartitionSplitChangeToPendingAssignments(
            Collection<KafkaPartitionSplit> newPartitionSplits) {
        int numReaders = context.currentParallelism();
        for (KafkaPartitionSplit split : newPartitionSplits) {
```

### BoundedWildcard
Can generalize to `? extends FlinkKafkaProducer.KafkaTransactionState`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
     */
    private void cleanUpUserContext(
            Collection<FlinkKafkaProducer.KafkaTransactionState> handledTransactions) {
        if (!getUserContext().isPresent()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends FlinkKafkaPartitioner`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            KeyedSerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            Optional<FlinkKafkaPartitioner<IN>> customPartitioner,
            FlinkKafkaProducer.Semantic semantic,
            int kafkaProducersPoolSize) {
```

### BoundedWildcard
Can generalize to `? extends FlinkKafkaPartitioner`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            SerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            Optional<FlinkKafkaPartitioner<IN>> customPartitioner) {
        this(
                topicId,
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    private FlinkKafkaProducer(
            String defaultTopic,
            KeyedSerializationSchema<IN> keyedSchema,
            FlinkKafkaPartitioner<IN> customPartitioner,
            KafkaSerializationSchema<IN> kafkaSchema,
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            String defaultTopic,
            KeyedSerializationSchema<IN> keyedSchema,
            FlinkKafkaPartitioner<IN> customPartitioner,
            KafkaSerializationSchema<IN> kafkaSchema,
            Properties producerConfig,
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            KeyedSerializationSchema<IN> keyedSchema,
            FlinkKafkaPartitioner<IN> customPartitioner,
            KafkaSerializationSchema<IN> kafkaSchema,
            Properties producerConfig,
            FlinkKafkaProducer.Semantic semantic,
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaDeserializationSchema.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final @Nullable DeserializationSchema<RowData> keyDeserialization;

    private final DeserializationSchema<RowData> valueDeserialization;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
public class KafkaRecordSerializationSchemaBuilder<IN> {

    @Nullable private Function<? super IN, String> topicSelector;
    @Nullable private SerializationSchema<? super IN> valueSerializationSchema;
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
    @Nullable private Function<? super IN, String> topicSelector;
    @Nullable private SerializationSchema<? super IN> valueSerializationSchema;
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
    @Nullable private SerializationSchema<? super IN> keySerializationSchema;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java

    @Nullable private Function<? super IN, String> topicSelector;
    @Nullable private SerializationSchema<? super IN> valueSerializationSchema;
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
    @Nullable private SerializationSchema<? super IN> keySerializationSchema;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
    @Nullable private SerializationSchema<? super IN> valueSerializationSchema;
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
    @Nullable private SerializationSchema<? super IN> keySerializationSchema;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private static final String PRODUCER_ID_AND_EPOCH_FIELD_NAME = "producerIdAndEpoch";

    @Nullable private String transactionalId;
    private volatile boolean inTransaction;
    private volatile boolean closed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Optional format for encoding keys to Kafka. */
    protected final @Nullable EncodingFormat<SerializationSchema<RowData>> keyEncodingFormat;

    /** Format for encoding values to Kafka. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Parallelism of the physical Kafka producer. * */
    protected final @Nullable Integer parallelism;

    public KafkaDynamicSink(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Partitioner to select Kafka partition for each item. */
    protected final @Nullable FlinkKafkaPartitioner<RowData> partitioner;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
     * prefix for all ids of opened Kafka transactions.
     */
    @Nullable private final String transactionalIdPrefix;

    /** The Kafka topic to write to. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Prefix that needs to be removed from fields when constructing the physical data type. */
    protected final @Nullable String keyPrefix;

    // --------------------------------------------------------------------------------------------
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaWriter.java`
#### Snippet
```java
    private class WriterCallback implements Callback {
        private final MailboxExecutor mailboxExecutor;
        @Nullable private final Consumer<RecordMetadata> metadataConsumer;

        public WriterCallback(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaCommitter.java`
#### Snippet
```java
    private final Properties kafkaProducerConfig;

    @Nullable private FlinkKafkaInternalProducer<?, ?> recoveryProducer;

    KafkaCommitter(Properties kafkaProducerConfig) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private volatile boolean closed;

    @Nullable protected final String transactionalId;

    public FlinkKafkaInternalProducer(Properties properties) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/metrics/KafkaSourceReaderMetrics.java`
#### Snippet
```java

    // Map for tracking records lag of topic partitions
    @Nullable private ConcurrentMap<TopicPartition, Metric> recordsLagMetrics;

    // Kafka raw metric for bytes consumed total
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/metrics/KafkaSourceReaderMetrics.java`
#### Snippet
```java

    // Kafka raw metric for bytes consumed total
    @Nullable private Metric bytesConsumedTotalMetric;

    /** Number of bytes consumed total at the latest {@link #updateNumBytesInCounter()}. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaCommittable.java`
#### Snippet
```java
    private final short epoch;
    private final String transactionalId;
    @Nullable private Recyclable<? extends FlinkKafkaInternalProducer<?, ?>> producer;

    public KafkaCommittable(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/TransactionAborter.java`
#### Snippet
```java
    private final Function<String, FlinkKafkaInternalProducer<byte[], byte[]>> producerFactory;
    private final Consumer<FlinkKafkaInternalProducer<byte[], byte[]>> closeAction;
    @Nullable FlinkKafkaInternalProducer<byte[], byte[]> producer = null;

    public TransactionAborter(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaRecordSerializationSchema.java`
#### Snippet
```java
    private final String topic;
    private final FlinkKafkaPartitioner<RowData> partitioner;
    @Nullable private final SerializationSchema<RowData> keySerialization;
    private final SerializationSchema<RowData> valueSerialization;
    private final RowData.FieldGetter[] keyFieldGetters;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Watermark strategy that is used to generate per-partition watermark. */
    protected @Nullable WatermarkStrategy<RowData> watermarkStrategy;

    // --------------------------------------------------------------------------------------------
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Optional format for decoding keys from Kafka. */
    protected final @Nullable DecodingFormat<DeserializationSchema<RowData>> keyDecodingFormat;

    /** Format for decoding values from Kafka. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Prefix that needs to be removed from fields when constructing the physical data type. */
    protected final @Nullable String keyPrefix;

    // --------------------------------------------------------------------------------------------
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** The callback than handles error propagation or logging callbacks. */
    @Nullable protected transient Callback callback;

    /** Errors encountered in the async producer are stored here. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        private final transient FlinkKafkaInternalProducer<byte[], byte[]> producer;

        @Nullable final String transactionalId;

        final long producerId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
     * Kafka.
     */
    @Nullable private final KeyedSerializationSchema<IN> keyedSchema;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** The transactional.id prefix to be used by the producers when communicating with Kafka. */
    @Nullable private String transactionalIdPrefix = null;

    /** Flag indicating whether to accept failures (and log them), or to fail on failures. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** User-provided partitioner for assigning an object to a Kafka partition for each topic. */
    @Nullable private final FlinkKafkaPartitioner<IN> flinkKafkaPartitioner;

    /** Partitions of each topic. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
     * ProducerRecords}.
     */
    @Nullable private final KafkaSerializationSchema<IN> kafkaSchema;

    /** User-provided partitioner for assigning an object to a Kafka partition for each topic. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** Errors encountered in the async producer are stored here. */
    @Nullable protected transient volatile Exception asyncException;

    /** Number of unacknowledged records. */
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaDeserializationSchema.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final @Nullable DeserializationSchema<RowData> keyDeserialization;

    private final DeserializationSchema<RowData> valueDeserialization;
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Optional format for encoding keys to Kafka. */
    protected final @Nullable EncodingFormat<SerializationSchema<RowData>> keyEncodingFormat;

    /** Format for encoding values to Kafka. */
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Parallelism of the physical Kafka producer. * */
    protected final @Nullable Integer parallelism;

    public KafkaDynamicSink(
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Partitioner to select Kafka partition for each item. */
    protected final @Nullable FlinkKafkaPartitioner<RowData> partitioner;

    /**
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
    }

    private @Nullable SerializationSchema<RowData> createSerialization(
            DynamicTableSink.Context context,
            @Nullable EncodingFormat<SerializationSchema<RowData>> format,
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Prefix that needs to be removed from fields when constructing the physical data type. */
    protected final @Nullable String keyPrefix;

    // --------------------------------------------------------------------------------------------
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/metrics/KafkaSourceReaderMetrics.java`
#### Snippet
```java
    }

    private @Nullable Metric getRecordsLagMetric(
            Map<MetricName, ? extends Metric> metrics, TopicPartition tp) {
        try {
```

### MissortedModifiers
Missorted modifiers `protected @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Watermark strategy that is used to generate per-partition watermark. */
    protected @Nullable WatermarkStrategy<RowData> watermarkStrategy;

    // --------------------------------------------------------------------------------------------
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java
    }

    private @Nullable DeserializationSchema<RowData> createDeserialization(
            DynamicTableSource.Context context,
            @Nullable DecodingFormat<DeserializationSchema<RowData>> format,
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Optional format for decoding keys from Kafka. */
    protected final @Nullable DecodingFormat<DeserializationSchema<RowData>> keyDecodingFormat;

    /** Format for decoding values from Kafka. */
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Prefix that needs to be removed from fields when constructing the physical data type. */
    protected final @Nullable String keyPrefix;

    // --------------------------------------------------------------------------------------------
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
    protected long numPendingRecords() {
        synchronized (pendingRecordsLock) {
            return pendingRecords;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
            flush();
            synchronized (pendingRecordsLock) {
                if (pendingRecords != 0) {
                    throw new IllegalStateException(
                            "Pending record count must be zero at this point: " + pendingRecords);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
                if (pendingRecords != 0) {
                    throw new IllegalStateException(
                            "Pending record count must be zero at this point: " + pendingRecords);
                }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
        if (flushOnCheckpoint) {
            synchronized (pendingRecordsLock) {
                pendingRecords--;
                if (pendingRecords == 0) {
                    pendingRecordsLock.notifyAll();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
            synchronized (pendingRecordsLock) {
                pendingRecords--;
                if (pendingRecords == 0) {
                    pendingRecordsLock.notifyAll();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `pendingRecords` accessed in synchronized context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
        if (flushOnCheckpoint) {
            synchronized (pendingRecordsLock) {
                pendingRecords++;
            }
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java
            throws Exception {

        @SuppressWarnings("unchecked")
        List<KafkaTopicPartitionState<T, TopicPartition>> partitions = subscribedPartitionStates();

        Map<TopicPartition, OffsetAndMetadata> offsetsToCommit = new HashMap<>(partitions.size());
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/KafkaEvent.java`
#### Snippet
```java
    public static KafkaEvent fromString(String eventStr) {
        String[] split = eventStr.split(",");
        return new KafkaEvent(split[0], Integer.valueOf(split[1]), Long.valueOf(split[2]));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/KafkaEvent.java`
#### Snippet
```java
    public static KafkaEvent fromString(String eventStr) {
        String[] split = eventStr.split(",");
        return new KafkaEvent(split[0], Integer.valueOf(split[1]), Long.valueOf(split[2]));
    }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'customPartitioner'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            KeyedSerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            Optional<FlinkKafkaPartitioner<IN>> customPartitioner) {
        this(
                defaultTopicId,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'customPartitioner'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            KeyedSerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            Optional<FlinkKafkaPartitioner<IN>> customPartitioner,
            FlinkKafkaProducer.Semantic semantic,
            int kafkaProducersPoolSize) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'customPartitioner'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            SerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            Optional<FlinkKafkaPartitioner<IN>> customPartitioner) {
        this(
                topicId,
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/KafkaExampleUtil.java`
#### Snippet
```java

        if (parameterTool.getNumberOfParameters() < 5) {
            System.out.println(
                    "Missing parameters!\n"
                            + "Usage: Kafka --input-topic <topic> --output-topic <topic> "
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Comparator` is the same as one of its superclass' names
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartition.java`
#### Snippet
```java

    /** A {@link java.util.Comparator} for {@link KafkaTopicPartition}s. */
    public static class Comparator implements java.util.Comparator<KafkaTopicPartition> {
        @Override
        public int compare(KafkaTopicPartition p1, KafkaTopicPartition p2) {
```

### ClassNameSameAsAncestorName
Class name `NextTransactionalIdHint` is the same as one of its superclass' names
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
    }

    public static class NextTransactionalIdHint
            extends FlinkKafkaProducer.NextTransactionalIdHint {}
}
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
i \* poolSize \* totalNumberOfSubtasks: integer multiplication implicitly cast to long
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/TransactionalIdsGenerator.java`
#### Snippet
```java
        Set<String> idsToAbort = new HashSet<>();
        for (int i = 0; i < safeScaleDownFactor; i++) {
            idsToAbort.addAll(generateIdsToUse(i * poolSize * totalNumberOfSubtasks));
        }
        return idsToAbort;
```

### IntegerMultiplicationImplicitCastToLong
subtaskIndex \* poolSize: integer multiplication implicitly cast to long
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/TransactionalIdsGenerator.java`
#### Snippet
```java
        Set<String> transactionalIds = new HashSet<>();
        for (int i = 0; i < poolSize; i++) {
            long transactionalId = nextFreeTransactionalId + subtaskIndex * poolSize + i;
            transactionalIds.add(generateTransactionalId(transactionalId));
        }
```

### IntegerMultiplicationImplicitCastToLong
getRuntimeContext().getNumberOfParallelSubtasks() \* kafkaProducersPoolSize: integer multiplication implicitly cast to long
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
                    > nextTransactionalIdHint.lastParallelism) {
                nextFreeTransactionalId +=
                        getRuntimeContext().getNumberOfParallelSubtasks() * kafkaProducersPoolSize;
            }

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'pair.length() == 0' covered by subsequent condition '!pair.contains(...)'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java

        for (String pair : pairs) {
            if (null == pair || pair.length() == 0 || !pair.contains(",")) {
                throw new ValidationException(validationExceptionMessage);
            }
```

### ConditionCoveredByFurtherCondition
Condition 'this == o' covered by subsequent condition 'o instanceof FlinkFixedPartitioner'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/partitioner/FlinkFixedPartitioner.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof FlinkFixedPartitioner;
    }

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        if (semantic == FlinkKafkaProducer.Semantic.EXACTLY_ONCE) {
            final long transactionTimeout = getTransactionTimeout(producerConfig);
            super.setTransactionTimeout(transactionTimeout);
            super.enableTransactionTimeoutWarnings(0.8);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            final long transactionTimeout = getTransactionTimeout(producerConfig);
            super.setTransactionTimeout(transactionTimeout);
            super.enableTransactionTimeoutWarnings(0.8);
        }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

    protected static Enum<?> getEnum(String enumFullName) {
        String[] x = enumFullName.split("\\.(?=[^\\.]+$)");
        if (x.length == 2) {
            String enumClassName = x[0];
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicTableFactory.java`
#### Snippet
```java
                    DELIVERY_GUARANTEE.key());
            return DeliveryGuarantee.valueOf(
                    tableOptions.get(SINK_SEMANTIC).toUpperCase().replace("-", "_"));
        }
        return tableOptions.get(DELIVERY_GUARANTEE);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.kafka.clients.producer` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java

    /**
     * Besides committing {@link org.apache.kafka.clients.producer.KafkaProducer#commitTransaction}
     * is also adding new partitions to the transaction. flushNewPartitions method is moving this
     * logic to pre-commit/flush, to make resumeTransaction simpler. Otherwise resumeTransaction
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.streaming.connectors.kafka` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/deserializer/KafkaDeserializationSchemaWrapper.java`
#### Snippet
```java
/**
 * A wrapper class that wraps a {@link
 * org.apache.flink.streaming.connectors.kafka.KafkaDeserializationSchema} to deserialize {@link
 * ConsumerRecord ConsumerRecords}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.connector.kafka.source.enumerator` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/KafkaSource.java`
#### Snippet
```java
 * }</pre>
 *
 * <p>{@link org.apache.flink.connector.kafka.source.enumerator.KafkaSourceEnumerator} only supports
 * adding new splits and not removing splits in split discovery.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.io` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/enumerator/KafkaSourceEnumStateSerializer.java`
#### Snippet
```java

/**
 * The {@link org.apache.flink.core.io.SimpleVersionedSerializer Serializer} for the enumerator
 * state of Kafka source.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.io` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/split/KafkaPartitionSplitSerializer.java`
#### Snippet
```java

/**
 * The {@link org.apache.flink.core.io.SimpleVersionedSerializer serializer} for {@link
 * KafkaPartitionSplit}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.kafka.clients.producer` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

    /**
     * Besides committing {@link org.apache.kafka.clients.producer.KafkaProducer#commitTransaction}
     * is also adding new partitions to the transaction. flushNewPartitions method is moving this
     * logic to pre-commit/flush, to make resumeTransaction simpler. Otherwise resumeTransaction
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.kafka.common` is unnecessary, and can be replaced with an import
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/metrics/KafkaMetricWrapper.java`
#### Snippet
```java
@Internal
public class KafkaMetricWrapper implements Gauge<Double> {
    private final org.apache.kafka.common.Metric kafkaMetric;

    public KafkaMetricWrapper(org.apache.kafka.common.Metric metric) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.kafka.common` is unnecessary, and can be replaced with an import
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/metrics/KafkaMetricWrapper.java`
#### Snippet
```java
    private final org.apache.kafka.common.Metric kafkaMetric;

    public KafkaMetricWrapper(org.apache.kafka.common.Metric metric) {
        this.kafkaMetric = metric;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.runtime.metrics` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/metrics/KafkaSourceReaderMetrics.java`
#### Snippet
```java

    /**
     * Update {@link org.apache.flink.runtime.metrics.MetricNames#IO_NUM_BYTES_IN}.
     *
     * <p>Instead of simply setting {@link OperatorIOMetricGroup#getNumBytesInCounter()} to the same
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.runtime.metrics` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/metrics/KafkaSourceReaderMetrics.java`
#### Snippet
```java
     *
     * <p>This method also lazily register {@link
     * org.apache.flink.runtime.metrics.MetricNames#PENDING_RECORDS} in {@link
     * SourceReaderMetricGroup}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common.serialization` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaSerializationSchemaWrapper.java`
#### Snippet
```java
/**
 * An adapter from old style interfaces such as {@link
 * org.apache.flink.api.common.serialization.SerializationSchema}, {@link
 * org.apache.flink.streaming.connectors.kafka.partitioner.FlinkKafkaPartitioner} to the {@link
 * KafkaSerializationSchema}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.streaming.connectors.kafka.partitioner` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaSerializationSchemaWrapper.java`
#### Snippet
```java
 * An adapter from old style interfaces such as {@link
 * org.apache.flink.api.common.serialization.SerializationSchema}, {@link
 * org.apache.flink.streaming.connectors.kafka.partitioner.FlinkKafkaPartitioner} to the {@link
 * KafkaSerializationSchema}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.connector.kafka.source.reader` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/fetcher/KafkaSourceFetcherManager.java`
#### Snippet
```java
 * The SplitFetcherManager for Kafka source. This class is needed to help commit the offsets to
 * Kafka using the KafkaConsumer inside the {@link
 * org.apache.flink.connector.kafka.source.reader.KafkaPartitionSplitReader}.
 */
@Internal
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common.eventtime` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/SourceContextWatermarkOutputAdapter.java`
#### Snippet
```java

/**
 * A {@link org.apache.flink.api.common.eventtime.WatermarkOutput} that forwards calls to a {@link
 * org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common.eventtime` is unnecessary and can be removed
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
     *
     * <p>Common watermark generation patterns can be found as static methods in the {@link
     * org.apache.flink.api.common.eventtime.WatermarkStrategy} class.
     *
     * @return The consumer object, to allow function chaining.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java`
#### Snippet
```java
        synchronized (checkpointLock) {
            T record;
            while ((record = records.poll()) != null) {
                long timestamp = partitionState.extractTimestamp(record, kafkaEventTimestamp);
                sourceContext.collectWithTimestamp(record, timestamp);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `FlinkKafkaProducerBase()` of an abstract class should not be declared 'public'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
     *     partitions. Passing null will use Kafka's partitioner.
     */
    public FlinkKafkaProducerBase(
            String defaultTopicId,
            KeyedSerializationSchema<IN> serializationSchema,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPartitionDiscoverer()` of an abstract class should not be declared 'public'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractPartitionDiscoverer.java`
#### Snippet
```java
    private Set<KafkaTopicPartition> discoveredPartitions;

    public AbstractPartitionDiscoverer(
            KafkaTopicsDescriptor topicsDescriptor,
            int indexOfThisSubtask,
```

### NonProtectedConstructorInAbstractClass
Constructor `FlinkKafkaConsumerBase()` of an abstract class should not be declared 'public'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
     *     if discovery is disabled).
     */
    public FlinkKafkaConsumerBase(
            List<String> topics,
            Pattern topicPattern,
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `transactionalId` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private static final String PRODUCER_ID_AND_EPOCH_FIELD_NAME = "producerIdAndEpoch";

    @Nullable private String transactionalId;
    private volatile boolean inTransaction;
    private volatile boolean closed;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
        Collections.sort(
                partitionsList,
                new Comparator<PartitionInfo>() {
                    @Override
                    public int compare(PartitionInfo o1, PartitionInfo o2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        Collections.sort(
                partitionsList,
                new Comparator<PartitionInfo>() {
                    @Override
                    public int compare(PartitionInfo o1, PartitionInfo o2) {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
    KafkaSinkBuilder() {
        kafkaProducerConfig = new Properties();
        kafkaProducerConfig.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProducerConfig.put(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
        kafkaProducerConfig.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProducerConfig.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProducerConfig.put(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
        kafkaProducerConfig.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProducerConfig.put(
                ProducerConfig.TRANSACTION_TIMEOUT_CONFIG,
                (int) DEFAULT_KAFKA_TRANSACTION_TIMEOUT.toMillis());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
                        .setDeliveryGuarantee(deliveryGuarantee)
                        .setBootstrapServers(
                                properties.get(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG).toString())
                        .setKafkaProducerConfig(properties)
                        .setRecordSerializer(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaWriter.java`
#### Snippet
```java
                kafkaProducerConfig.containsKey(KEY_DISABLE_METRICS)
                                && Boolean.parseBoolean(
                                        kafkaProducerConfig.get(KEY_DISABLE_METRICS).toString())
                        || kafkaProducerConfig.containsKey(KEY_REGISTER_METRICS)
                                && !Boolean.parseBoolean(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaWriter.java`
#### Snippet
```java
                        || kafkaProducerConfig.containsKey(KEY_REGISTER_METRICS)
                                && !Boolean.parseBoolean(
                                        kafkaProducerConfig.get(KEY_REGISTER_METRICS).toString());
        checkNotNull(sinkInitContext, "sinkInitContext");
        this.timeService = sinkInitContext.getProcessingTimeService();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
        // set the producer configuration properties for kafka record key value serializers.
        if (!producerConfig.containsKey(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG)) {
            this.producerConfig.put(
                    ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                    ByteArraySerializer.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java

        if (!producerConfig.containsKey(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG)) {
            this.producerConfig.put(
                    ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                    ByteArraySerializer.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java
                                final String value = tableOptions.get(key);
                                final String subKey = key.substring((PROPERTIES_PREFIX).length());
                                kafkaProperties.put(subKey, value);
                            });
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
    public <T> void sendMessages(String topic, Serializer<T> valueSerializer, T... messages) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, container.getBootstrapServers());
        props.put(ProducerConfig.ACKS_CONFIG, "all");

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, container.getBootstrapServers());
        props.put(ProducerConfig.ACKS_CONFIG, "all");

        try (Producer<Bytes, T> producer =
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
            throws Exception {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, container.getBootstrapServers());
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, container.getBootstrapServers());
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, container.getBootstrapServers());
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka-e2e-tests/flink-end-to-end-tests-common-kafka/src/main/java/org/apache/flink/tests/util/kafka/KafkaContainerClient.java`
#### Snippet
```java
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        final List<T> messages = Collections.synchronizedList(new ArrayList<>(expectedNumMessages));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
        final String deSerName = ByteArrayDeserializer.class.getName();

        Object keyDeSer = props.get(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG);
        Object valDeSer = props.get(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java

        Object keyDeSer = props.get(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG);
        Object valDeSer = props.get(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG);

        if (keyDeSer != null && !keyDeSer.equals(deSerName)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
        }

        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, deSerName);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deSerName);
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java

        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, deSerName);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deSerName);
    }
}
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    private static void initTransactionalProducerConfig(
            Properties producerConfig, String transactionalId) {
        producerConfig.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionalId);
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        // set the producer configuration properties for kafka record key value serializers.
        if (!producerConfig.containsKey(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG)) {
            this.producerConfig.put(
                    ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                    ByteArraySerializer.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

        if (!producerConfig.containsKey(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG)) {
            this.producerConfig.put(
                    ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                    ByteArraySerializer.class.getName());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
                    timeout < Integer.MAX_VALUE && timeout > 0,
                    "timeout does not fit into 32 bit integer");
            this.producerConfig.put(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, (int) timeout);
            LOG.warn(
                    "Property [{}] not specified. Setting it to {}",
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    public static long getTransactionTimeout(Properties producerConfig) {
        final Object object = producerConfig.get(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG);
        if (object instanceof String && StringUtils.isNumeric((String) object)) {
            return Long.parseLong((String) object);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/ReducingUpsertWriter.java`
#### Snippet
```java
    private final long batchIntervalMs;

    private boolean closed = false;
    private long lastFlush = System.currentTimeMillis();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaWriter.java`
#### Snippet
```java
    private long lastCheckpointId;

    private boolean closed = false;
    private long lastSync = System.currentTimeMillis();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java
        private final Queue<T> records = new ArrayDeque<>();

        private boolean endOfStreamSignalled = false;

        @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/TransactionAborter.java`
#### Snippet
```java
    private final Function<String, FlinkKafkaInternalProducer<byte[], byte[]>> producerFactory;
    private final Consumer<FlinkKafkaInternalProducer<byte[], byte[]>> closeAction;
    @Nullable FlinkKafkaInternalProducer<byte[], byte[]> producer = null;

    public TransactionAborter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/enumerator/KafkaSourceEnumerator.java`
#### Snippet
```java
    // This flag will be marked as true if periodically partition discovery is disabled AND the
    // initializing partition discovery has finished.
    private boolean noMoreNewPartitionSplits = false;

    public KafkaSourceEnumerator(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** Flag controlling whether we are writing the Flink record's timestamp into Kafka. */
    protected boolean writeTimestampToKafka = false;

    /** The transactional.id prefix to be used by the producers when communicating with Kafka. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    public static class NextTransactionalIdHint {
        public int lastParallelism = 0;
        public long nextFreeTransactionalId = 0;

        public NextTransactionalIdHint() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    /** Keep information required to deduce next safe to use transactional id. */
    public static class NextTransactionalIdHint {
        public int lastParallelism = 0;
        public long nextFreeTransactionalId = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

    /** The transactional.id prefix to be used by the producers when communicating with Kafka. */
    @Nullable private String transactionalIdPrefix = null;

    /** Flag indicating whether to accept failures (and log them), or to fail on failures. */
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `timeoutMillis`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
            while (open && elements.isEmpty() && timeoutMillis > 0) {
                nonEmpty.await(timeoutMillis, TimeUnit.MILLISECONDS);
                timeoutMillis = (deadline - System.nanoTime()) / 1_000_000L;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutMillis`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
            while (open && elements.isEmpty() && timeoutMillis > 0) {
                nonEmpty.await(timeoutMillis, TimeUnit.MILLISECONDS);
                timeoutMillis = (deadline - System.nanoTime()) / 1_000_000L;
            }

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private TransactionalRequestResult enqueueNewPartitions() {
        Object transactionManager = getTransactionManager();
        synchronized (transactionManager) {
            Object newPartitionsInTransaction =
                    getField(transactionManager, "newPartitionsInTransaction");
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java

        Object transactionManager = getTransactionManager();
        synchronized (transactionManager) {
            Object topicPartitionBookkeeper =
                    getField(transactionManager, "topicPartitionBookkeeper");
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
            LOG.debug("Change transaction id from {} to {}", this.transactionalId, transactionalId);
            Object transactionManager = getTransactionManager();
            synchronized (transactionManager) {
                setField(transactionManager, "transactionalId", transactionalId);
                setField(
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private TransactionalRequestResult enqueueNewPartitions() {
        Object transactionManager = getField(kafkaProducer, "transactionManager");
        synchronized (transactionManager) {
            Object newPartitionsInTransaction =
                    getField(transactionManager, "newPartitionsInTransaction");
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

            Object transactionManager = getField(kafkaProducer, "transactionManager");
            synchronized (transactionManager) {
                Object topicPartitionBookkeeper =
                        getField(transactionManager, "topicPartitionBookkeeper");
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-08-09-45-36.201.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
                    public Object read(RowData row, int pos) {
                        if (row.isNullAt(pos)) {
                            return null;
                        }
                        return row.getTimestamp(pos, 3).getMillisecond();
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
                    public Object read(RowData row, int pos) {
                        if (row.isNullAt(pos)) {
                            return null;
                        }
                        final MapData map = row.getMap(pos);
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java
        super(
                defaultTopicId,
                (element, timestamp) -> null,
                props,
                semantic,
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaTopicPartitionLeader.java`
#### Snippet
```java
    public Node getLeader() {
        if (this.leaderId == -1) {
            return null;
        } else {
            return new Node(leaderId, leaderHost, leaderPort);
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
    public byte[] serializeKey(Tuple2<K, V> element) {
        if (element.f0 == null) {
            return null;
        } else {
            // key is not null. serialize it:
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
    @Override
    public String getTargetTopic(Tuple2<K, V> element) {
        return null; // we are never overriding the topic
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
        // if the value is null, its serialized value is null as well.
        if (element.f1 == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
                    return elements.removeFirst();
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
                    return elements.getFirst();
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
                throw new IllegalStateException("queue is closed");
            } else if (elements.isEmpty()) {
                return null;
            } else {
                return elements.removeFirst();
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
                    return result;
                } else {
                    return null;
                }
            } else {
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KeyedSerializationSchemaWrapper.java`
#### Snippet
```java
    @Override
    public String getTargetTopic(T element) {
        return null; // we are never overriding the topic
    }
}
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KeyedSerializationSchemaWrapper.java`
#### Snippet
```java
    @Override
    public byte[] serializeKey(T element) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaRecordSerializationSchema.java`
#### Snippet
```java
                    consumedRow, keySerialized, valueSerialized, topic, partitions);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/DynamicKafkaRecordSerializationSchema.java`
#### Snippet
```java
        final int pos = metadataPositions[metadata.ordinal()];
        if (pos < 0) {
            return null;
        }
        return (T) metadata.converter.read(consumedRow, pos);
```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        @Override
        public FlinkKafkaProducer.KafkaTransactionContext createInstance() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        @Override
        public FlinkKafkaProducer.KafkaTransactionState createInstance() {
            return null;
        }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaConnectorOptionsUtil.java`
#### Snippet
```java

        if (!optionalKeyFormat.isPresent()) {
            return new int[0];
        }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java`
#### Snippet
```java
                                    if (running && discoveryIntervalMillis != 0) {
                                        try {
                                            Thread.sleep(discoveryIntervalMillis);
                                        } catch (InterruptedException iex) {
                                            // may be interrupted if the consumer was canceled
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
                keyEncodingFormat,
                valueEncodingFormat,
                keyProjection,
                valueProjection,
                keyPrefix,
```

### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java
                valueEncodingFormat,
                keyProjection,
                valueProjection,
                keyPrefix,
                topic,
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `nextFreeTransactionalId` initializer `0` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    public static class NextTransactionalIdHint {
        public int lastParallelism = 0;
        public long nextFreeTransactionalId = 0;

        public NextTransactionalIdHint() {
```

### UnusedAssignment
Variable `lastParallelism` initializer `0` is redundant
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
    /** Keep information required to deduce next safe to use transactional id. */
    public static class NextTransactionalIdHint {
        public int lastParallelism = 0;
        public long nextFreeTransactionalId = 0;

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/UpsertKafkaDynamicTableFactory.java`
#### Snippet
```java
        ResolvedSchema schema = catalogTable.getResolvedSchema();
        // primary key should validated earlier
        List<String> keyFields = schema.getPrimaryKey().get().getColumns();
        DataType physicalDataType = schema.toPhysicalRowDataType();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            Collection<FlinkKafkaProducer.KafkaTransactionState> handledTransactions) {
        cleanUpUserContext(handledTransactions);
        resetAvailableTransactionalIdsPool(getUserContext().get().transactionalIds);
        LOG.info("Recovered transactionalIds {}", getUserContext().get().transactionalIds);
    }
```

