# flink-connector-kafka 
 
# Bad smells
I found 159 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 37 | false |
| NullableProblems | 31 | false |
| JavadocDeclaration | 24 | false |
| UNCHECKED_WARNING | 11 | false |
| DuplicatedCode | 7 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| JavadocLinkAsPlainText | 4 | false |
| JavadocReference | 3 | false |
| DataFlowIssue | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 3 | false |
| FieldMayBeFinal | 3 | false |
| UnnecessarySemicolon | 2 | false |
| IgnoreResultOfCall | 2 | false |
| AutoCloseableResource | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| ArrayHashCode | 2 | false |
| UnusedAssignment | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| EmptyStatementBody | 1 | false |
| RegExpRedundantEscape | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| FieldCanBeLocal | 1 | false |
| BusyWait | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'deserialize(ConsumerRecord)' as a member of raw type 'org.apache.flink.streaming.connectors.kafka.internals.KafkaShuffleFetcher.KafkaShuffleElementDeserializer'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaShuffleFetcher.java`
#### Snippet
```java

        for (ConsumerRecord<byte[], byte[]> record : partitionRecords) {
            final KafkaShuffleElement element = kafkaShuffleDeserializer.deserialize(record);

            // TODO: Do we need to check the end of stream if reaching the end watermark
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.streaming.connectors.kafka.internals.KafkaShuffleFetcher.KafkaShuffleElement' to 'org.apache.flink.streaming.connectors.kafka.internals.KafkaShuffleFetcher.KafkaShuffleRecord'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaShuffleFetcher.java`
#### Snippet
```java

        public <T> KafkaShuffleRecord<T> asRecord() {
            return (KafkaShuffleRecord<T>) this;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'KafkaConsumerThread(Logger, Handover, Properties, ClosableBlockingQueue\>, String, long, boolean, ...)' as a member of raw type 'org.apache.flink.streaming.connectors.kafka.internals.KafkaConsumerThread'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java

        this.consumerThread =
                new KafkaConsumerThread(
                        LOG,
                        handover,
```

### UNCHECKED_WARNING
Unchecked call to 'setOffsetsToCommit(Map, KafkaCommitCallback)' as a member of raw type 'org.apache.flink.streaming.connectors.kafka.internals.KafkaConsumerThread'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaFetcher.java`
#### Snippet
```java
        // record the work to be committed by the main consumer thread and make sure the consumer
        // notices that
        consumerThread.setOffsetsToCommit(offsetsToCommit, commitCallback);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
            String enumName = x[1];
            try {
                Class<Enum> cl = (Class<Enum>) Class.forName(enumClassName);
                return Enum.valueOf(cl, enumName);
            } catch (ClassNotFoundException e) {
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
            try {
                Class<Enum> cl = (Class<Enum>) Class.forName(enumClassName);
                return Enum.valueOf(cl, enumName);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Incompatible KafkaProducer version", e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.api.datastream.DataStreamSource' to 'org.apache.flink.streaming.api.datastream.DataStreamSource'
in `flink-confluent-schema-registry-e2e-tests/src/main/java/org/apache/flink/schema/registry/test/TestAvroConsumerConfluent.java`
#### Snippet
```java

        DataStreamSource<User> input =
                env.addSource(
                        new FlinkKafkaConsumer<>(
                                        parameterTool.getRequired("input-topic"),
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumerBase' to 'org.apache.flink.streaming.api.functions.source.SourceFunction'. Reason: 'new FlinkKafkaConsumer\<\>( parameterTool.getRequired("input-topic"), ConfluentRegistryAvroDeserializationSchema.forSpecific( User.class, schemaRegistryUrl), config)' has raw type, so result of setStartFromEarliest is erased
in `flink-confluent-schema-registry-e2e-tests/src/main/java/org/apache/flink/schema/registry/test/TestAvroConsumerConfluent.java`
#### Snippet
```java
        DataStreamSource<User> input =
                env.addSource(
                        new FlinkKafkaConsumer<>(
                                        parameterTool.getRequired("input-topic"),
                                        ConfluentRegistryAvroDeserializationSchema.forSpecific(
                                                User.class, schemaRegistryUrl),
                                        config)
                                .setStartFromEarliest());

        SingleOutputStreamOperator<String> mapToString =
```

### UNCHECKED_WARNING
Unchecked call to 'FlinkKafkaConsumer(String, DeserializationSchema, Properties)' as a member of raw type 'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer'
in `flink-confluent-schema-registry-e2e-tests/src/main/java/org/apache/flink/schema/registry/test/TestAvroConsumerConfluent.java`
#### Snippet
```java
        DataStreamSource<User> input =
                env.addSource(
                        new FlinkKafkaConsumer<>(
                                        parameterTool.getRequired("input-topic"),
                                        ConfluentRegistryAvroDeserializationSchema.forSpecific(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.connectors.kafka.shuffle.FlinkKafkaShuffleProducer' to 'org.apache.flink.streaming.api.functions.sink.SinkFunction'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/StreamKafkaShuffleSink.java`
#### Snippet
```java

    public StreamKafkaShuffleSink(FlinkKafkaShuffleProducer flinkKafkaShuffleProducer) {
        super(flinkKafkaShuffleProducer);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.streaming.connectors.kafka.KafkaSerializationSchema' to 'org.apache.flink.streaming.connectors.kafka.KafkaContextAware'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java

        if (kafkaSchema instanceof KafkaContextAware) {
            KafkaContextAware<IN> contextAwareSchema = (KafkaContextAware<IN>) kafkaSchema;
            contextAwareSchema.setParallelInstanceId(ctx.getIndexOfThisSubtask());
            contextAwareSchema.setNumParallelInstances(ctx.getNumberOfParallelSubtasks());
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `KafkaExample`
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/KafkaEvent.java`
#### Snippet
```java

/**
 * The event type used in the {@link KafkaExample}.
 *
 * <p>This is a Java POJO, which Flink recognizes and will allow "by-name" field referencing when
```

### JavadocReference
Cannot resolve symbol `KafkaExample`
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/KafkaEvent.java`
#### Snippet
```java
 * <p>This is a Java POJO, which Flink recognizes and will allow "by-name" field referencing when
 * keying a {@link org.apache.flink.streaming.api.datastream.DataStream} of such a type. For a
 * demonstration of this, see the code in {@link KafkaExample}.
 */
public class KafkaEvent {
```

### JavadocReference
Cannot resolve symbol `config`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/deserializer/KafkaRecordDeserializationSchema.java`
#### Snippet
```java
     * @param config the configuration of the value deserializer. If the deserializer is an
     *     implementation of {@code Configurable}, the configuring logic will be handled by {@link
     *     org.apache.kafka.common.Configurable#configure(Map)} with the given {@link config},
     *     otherwise {@link Deserializer#configure(Map, boolean)} will be invoked.
     * @param <V> the value type.
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/reader/KafkaPartitionSplitReader.java`
#### Snippet
```java
        } else if (split.getStartingOffset() == KafkaPartitionSplit.LATEST_OFFSET) {
            partitionsStartingFromLatest.add(tp);
        } else if (split.getStartingOffset() == KafkaPartitionSplit.COMMITTED_OFFSET) {
            // Do nothing here, the consumer will first try to get the committed offsets of
            // these partitions by default.
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
Deprecated member 'subtaskMetricGroup' is still used
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KafkaConsumerThread.java`
#### Snippet
```java
     *     to retain compatibility for metrics.
     */
    @Deprecated private final MetricGroup subtaskMetricGroup;

    /** We get this from the outside to publish metrics. */
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `stateSentinel` in enum 'StartupMode'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/config/StartupMode.java`
#### Snippet
```java

    /** The sentinel offset value corresponding to this startup mode. */
    private long stateSentinel;

    StartupMode(long stateSentinel) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
        synchronized (transactionManager) {
            Object newPartitionsInTransaction =
                    getField(transactionManager, "newPartitionsInTransaction");
            Object newPartitionsInTransactionIsEmpty =
                    invoke(newPartitionsInTransaction, "isEmpty");
            TransactionalRequestResult result;
            if (newPartitionsInTransactionIsEmpty instanceof Boolean
                    && !((Boolean) newPartitionsInTransactionIsEmpty)) {
                Object txnRequestHandler =
                        invoke(transactionManager, "addPartitionsToTransactionHandler");
                invoke(
                        transactionManager,
                        "enqueueRequest",
                        new Class[] {txnRequestHandler.getClass().getSuperclass()},
                        new Object[] {txnRequestHandler});
                result =
                        (TransactionalRequestResult)
                                getField(
                                        txnRequestHandler,
                                        txnRequestHandler.getClass().getSuperclass(),
                                        "result");
            } else {
                // we don't have an operation but this operation string is also used in
                // addPartitionsToTransactionHandler.
                result = new TransactionalRequestResult("AddPartitionsToTxn");
                result.done();
            }
            return result;
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        if (logFailuresOnly) {
            callback =
                    new Callback() {
                        @Override
                        public void onCompletion(RecordMetadata metadata, Exception e) {
                            if (e != null) {
                                LOG.error(
                                        "Error while sending record to Kafka: " + e.getMessage(),
                                        e);
                            }
                            acknowledgeMessage();
                        }
                    };
        } else {
            callback =
                    new Callback() {
                        @Override
                        public void onCompletion(RecordMetadata metadata, Exception exception) {
                            if (exception != null && asyncException == null) {
                                asyncException = exception;
                            }
                            acknowledgeMessage();
                        }
                    };
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
        List<PartitionInfo> partitionsList = new ArrayList<>(producer.partitionsFor(topic));

        // sort the partitions by partition id to make sure the fetched partition list is the same
        // across subtasks
        Collections.sort(
                partitionsList,
                new Comparator<PartitionInfo>() {
                    @Override
                    public int compare(PartitionInfo o1, PartitionInfo o2) {
                        return Integer.compare(o1.partition(), o2.partition());
                    }
                });

        int[] partitions = new int[partitionsList.size()];
        for (int i = 0; i < partitions.length; i++) {
            partitions[i] = partitionsList.get(i).partition();
        }

        return partitions;
```

### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicTableFactory.java`
#### Snippet
```java
        options.add(KEY_FORMAT);
        options.add(KEY_FIELDS);
        options.add(KEY_FIELDS_PREFIX);
        options.add(VALUE_FORMAT);
        options.add(VALUE_FIELDS_INCLUDE);
        options.add(TOPIC);
        options.add(TOPIC_PATTERN);
        options.add(PROPS_GROUP_ID);
        options.add(SCAN_STARTUP_MODE);
        options.add(SCAN_STARTUP_SPECIFIC_OFFSETS);
        options.add(SCAN_TOPIC_PARTITION_DISCOVERY);
```

### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicTableFactory.java`
#### Snippet
```java
        options.add(SCAN_STARTUP_TIMESTAMP_MILLIS);
        options.add(SINK_PARTITIONER);
        options.add(SINK_PARALLELISM);
        options.add(DELIVERY_GUARANTEE);
        options.add(TRANSACTIONAL_ID_PREFIX);
        options.add(SINK_SEMANTIC);
        options.add(SCAN_BOUNDED_MODE);
        options.add(SCAN_BOUNDED_SPECIFIC_OFFSETS);
        options.add(SCAN_BOUNDED_TIMESTAMP_MILLIS);
        return options;
```

### DuplicatedCode
Duplicated code
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
            byte[] res = keyOutputSerializer.getByteArray();
            if (res.length != keyOutputSerializer.length()) {
                byte[] n = new byte[keyOutputSerializer.length()];
                System.arraycopy(res, 0, n, 0, keyOutputSerializer.length());
                res = n;
            }
            keyOutputSerializer.clear();
            return res;
```

### DuplicatedCode
Duplicated code
in `flink-formats-kafka/flink-avro-confluent-registry/src/main/java/org/apache/flink/formats/avro/registry/confluent/RegistryAvroFormatFactory.java`
#### Snippet
```java
        Set<ConfigOption<?>> options = new HashSet<>();
        options.add(SUBJECT);
        options.add(SCHEMA);
        options.add(PROPERTIES);
        options.add(SSL_KEYSTORE_LOCATION);
        options.add(SSL_KEYSTORE_PASSWORD);
        options.add(SSL_TRUSTSTORE_LOCATION);
        options.add(SSL_TRUSTSTORE_PASSWORD);
        options.add(BASIC_AUTH_CREDENTIALS_SOURCE);
        options.add(BASIC_AUTH_USER_INFO);
        options.add(BEARER_AUTH_CREDENTIALS_SOURCE);
        options.add(BEARER_AUTH_TOKEN);
        return options;
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.flink.streaming.util.serialization.KeyedSerializationSchema' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/KeyedSerializationSchemaWrapper.java`
#### Snippet
```java
 */
@Internal
public class KeyedSerializationSchemaWrapper<T> implements KeyedSerializationSchema<T> {

    private static final long serialVersionUID = 1351665280744549933L;
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/ReducingUpsertSink.java`
#### Snippet
```java

/**
 * A wrapper of a {@link Sink}. It will buffer the data emitted by the wrapper {@link SinkWriter}
 * and only emit it when the buffer is full or a timer is triggered or a checkpoint happens.
 *
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/ReducingUpsertSink.java`
#### Snippet
```java

/**
 * A wrapper of a {@link Sink}. It will buffer the data emitted by the wrapper {@link SinkWriter}
 * and only emit it when the buffer is full or a timer is triggered or a checkpoint happens.
 *
```

### Deprecation
'getByteArray()' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
            }
            // check if key byte array size changed
            byte[] res = keyOutputSerializer.getByteArray();
            if (res.length != keyOutputSerializer.length()) {
                byte[] n = new byte[keyOutputSerializer.length()];
```

### Deprecation
'org.apache.flink.streaming.util.serialization.KeyedSerializationSchema' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
public class TypeInformationKeyValueSerializationSchema<K, V>
        implements KafkaDeserializationSchema<Tuple2<K, V>>,
                KeyedSerializationSchema<Tuple2<K, V>> {

    private static final long serialVersionUID = -5359448468131559102L;
```

### Deprecation
'getByteArray()' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/util/serialization/TypeInformationKeyValueSerializationSchema.java`
#### Snippet
```java
        }

        byte[] res = valueOutputSerializer.getByteArray();
        if (res.length != valueOutputSerializer.length()) {
            byte[] n = new byte[valueOutputSerializer.length()];
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * Hence, each producer task can potentially write to each Kafka partition based on where the
     * key goes. Here, `numberOfPartitions` equals to the key group size. In the case of using
     * {@link TimeCharacteristic#EventTime}, each producer task broadcasts its watermark to ALL of
     * the Kafka partitions to make sure watermark information is propagated correctly.
     *
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * indices it is assigned. `numberOfPartitions` is the maximum parallelism of the consumer. This
     * version only supports numberOfPartitions = consumerParallelism. In the case of using {@link
     * TimeCharacteristic#EventTime}, a consumer task is responsible to emit watermarks. Watermarks
     * are read from the corresponding Kafka partitions. Notice that a consumer task only starts to
     * emit a watermark after reading at least one watermark from each producer task to make sure
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * assigned. The number of kafka partitions is the maximum parallelism of the consumer. This
     * version only supports numberOfPartitions = consumerParallelism. In the case of using {@link
     * TimeCharacteristic#EventTime}, a consumer task is responsible to emit watermarks. Watermarks
     * are read from the corresponding Kafka partitions. Notice that a consumer task only starts to
     * emit a watermark after receiving at least one watermark from each producer task to make sure
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * Hence, each producer task can potentially write to each Kafka partition based on the key.
     * Here, the number of partitions equals to the key group size. In the case of using {@link
     * TimeCharacteristic#EventTime}, each producer task broadcasts each watermark to all of the
     * Kafka partitions to make sure watermark information is propagated properly.
     *
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
                        kafkaProperties,
                        env.clean(keySelector),
                        FlinkKafkaProducer.Semantic.EXACTLY_ONCE,
                        FlinkKafkaProducer.DEFAULT_KAFKA_PRODUCERS_POOL_SIZE);

```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
                        env.clean(keySelector),
                        FlinkKafkaProducer.Semantic.EXACTLY_ONCE,
                        FlinkKafkaProducer.DEFAULT_KAFKA_PRODUCERS_POOL_SIZE);

        // make sure the sink parallelism is set to producerParallelism
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * <p>Hence, each producer task can potentially write to each Kafka partition based on the key.
     * Here, the number of partitions equals to the key group size. In the case of using {@link
     * TimeCharacteristic#EventTime}, each producer task broadcasts each watermark to all of the
     * Kafka partitions to make sure watermark information is propagated properly.
     *
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * Hence, each producer task can potentially write to each Kafka partition based on where the
     * key goes. Here, `numberOfPartitions` equals to the key group size. In the case of using
     * {@link TimeCharacteristic#EventTime}, each producer task broadcasts its watermark to ALL of
     * the Kafka partitions to make sure watermark information is propagated correctly.
     *
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffle.java`
#### Snippet
```java
     * indices it is assigned. `numberOfPartitions` is the maximum parallelism of the consumer. This
     * version only supports numberOfPartitions = consumerParallelism. In the case of using {@link
     * TimeCharacteristic#EventTime}, a consumer task is responsible to emit watermarks. Watermarks
     * are read from the corresponding Kafka partitions. Notice that a consumer task only starts to
     * emit a watermark after reading at least one watermark from each producer task to make sure
```

### Deprecation
'sendOffsetsToTransaction(java.util.Map, java.lang.String)' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
        synchronized (producerClosingLock) {
            ensureNotClosed();
            kafkaProducer.sendOffsetsToTransaction(offsets, consumerGroupId);
        }
    }
```

### Deprecation
'topicPartitions(java.util.List)' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/enumerator/KafkaSourceEnumerator.java`
#### Snippet
```java
            ListConsumerGroupOffsetsOptions options =
                    new ListConsumerGroupOffsetsOptions()
                            .topicPartitions(new ArrayList<>(partitions));
            try {
                return adminClient
```

### Deprecation
'org.apache.flink.streaming.util.serialization.KeyedSerializationSchema' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
    public FlinkKafkaProducerBase(
            String defaultTopicId,
            KeyedSerializationSchema<IN> serializationSchema,
            Properties producerConfig,
            FlinkKafkaPartitioner<IN> customPartitioner) {
```

### Deprecation
'org.apache.flink.streaming.util.serialization.KeyedSerializationSchema' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducerBase.java`
#### Snippet
```java
     * Kafka.
     */
    protected final KeyedSerializationSchema<IN> schema;

    /** User-provided partitioner for assigning an object to a Kafka partition for each topic. */
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaException.java`
#### Snippet
```java
import org.apache.flink.util.FlinkException;

/** Exception used by {@link FlinkKafkaProducer} and {@link FlinkKafkaConsumer}. */
@PublicEvolving
public class FlinkKafkaException extends FlinkException {
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaException.java`
#### Snippet
```java
import org.apache.flink.util.FlinkException;

/** Exception used by {@link FlinkKafkaProducer} and {@link FlinkKafkaConsumer}. */
@PublicEvolving
public class FlinkKafkaException extends FlinkException {
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer' is deprecated
in `flink-confluent-schema-registry-e2e-tests/src/main/java/org/apache/flink/schema/registry/test/TestAvroConsumerConfluent.java`
#### Snippet
```java
        DataStreamSource<User> input =
                env.addSource(
                        new FlinkKafkaConsumer<>(
                                        parameterTool.getRequired("input-topic"),
                                        ConfluentRegistryAvroDeserializationSchema.forSpecific(
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleConsumer.java`
#### Snippet
```java
/** Flink Kafka Shuffle Consumer Function. */
@Internal
public class FlinkKafkaShuffleConsumer<T> extends FlinkKafkaConsumer<T> {
    private final TypeSerializer<T> typeSerializer;
    private final int producerParallelism;
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java

/**
 * Flink Kafka Shuffle Producer Function. It is different from {@link FlinkKafkaProducer} in the way
 * handling elements and watermarks
 */
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/shuffle/FlinkKafkaShuffleProducer.java`
#### Snippet
```java
 */
@Internal
public class FlinkKafkaShuffleProducer<IN, KEY> extends FlinkKafkaProducer<IN> {
    private final KafkaSerializer<IN> kafkaSerializer;
    private final KeySelector<IN, KEY> keySelector;
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/CustomWatermarkExtractor.java`
#### Snippet
```java

/**
 * A custom {@link AssignerWithPeriodicWatermarks}, that simply assumes that the input stream
 * records are strictly ascending.
 *
```

### Deprecation
'org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor' is deprecated
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/CustomWatermarkExtractor.java`
#### Snippet
```java
 *
 * <p>Flink also ships some built-in convenience assigners, such as the {@link
 * BoundedOutOfOrdernessTimestampExtractor} and {@link AscendingTimestampExtractor}
 */
public class CustomWatermarkExtractor implements AssignerWithPeriodicWatermarks<KafkaEvent> {
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test-base/src/main/java/org/apache/flink/streaming/kafka/test/base/CustomWatermarkExtractor.java`
#### Snippet
```java
 * BoundedOutOfOrdernessTimestampExtractor} and {@link AscendingTimestampExtractor}
 */
public class CustomWatermarkExtractor implements AssignerWithPeriodicWatermarks<KafkaEvent> {

    private static final long serialVersionUID = -742759155861320823L;
```

### Deprecation
'getById(int)' is deprecated
in `flink-formats-kafka/flink-avro-confluent-registry/src/main/java/org/apache/flink/formats/avro/registry/confluent/ConfluentSchemaRegistryCoder.java`
#### Snippet
```java

            try {
                return schemaRegistryClient.getById(schemaId);
            } catch (RestClientException e) {
                throw new IOException(
```

### Deprecation
'register(java.lang.String, org.apache.avro.Schema)' is deprecated
in `flink-formats-kafka/flink-avro-confluent-registry/src/main/java/org/apache/flink/formats/avro/registry/confluent/ConfluentSchemaRegistryCoder.java`
#### Snippet
```java
    public void writeSchema(Schema schema, OutputStream out) throws IOException {
        try {
            int registeredId = schemaRegistryClient.register(subject, schema);
            out.write(CONFLUENT_MAGIC_BYTE);
            byte[] schemaIdBytes = ByteBuffer.allocate(4).putInt(registeredId).array();
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.NextTransactionalIdHint> {
            public NextTransactionalIdHintSerializerSnapshot() {
                super(FlinkKafkaProducer.NextTransactionalIdHintSerializer::new);
            }
        }
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java

    public static class NextTransactionalIdHint
            extends FlinkKafkaProducer.NextTransactionalIdHint {}
}
// CHECKSTYLE:ON: JavadocType
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.KafkaTransactionState> {
            public TransactionStateSerializerSnapshot() {
                super(FlinkKafkaProducer.TransactionStateSerializer::new);
            }
        }
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
    public static class ContextStateSerializer {
        public static final class ContextStateSerializerSnapshot
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.KafkaTransactionContext> {
            public ContextStateSerializerSnapshot() {
                super(FlinkKafkaProducer.ContextStateSerializer::new);
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
    public static class NextTransactionalIdHintSerializer {
        public static final class NextTransactionalIdHintSerializerSnapshot
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.NextTransactionalIdHint> {
            public NextTransactionalIdHintSerializerSnapshot() {
                super(FlinkKafkaProducer.NextTransactionalIdHintSerializer::new);
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
    public static class TransactionStateSerializer {
        public static final class TransactionStateSerializerSnapshot
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.KafkaTransactionState> {
            public TransactionStateSerializerSnapshot() {
                super(FlinkKafkaProducer.TransactionStateSerializer::new);
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer' is deprecated
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer011.java`
#### Snippet
```java
                extends SimpleTypeSerializerSnapshot<FlinkKafkaProducer.KafkaTransactionContext> {
            public ContextStateSerializerSnapshot() {
                super(FlinkKafkaProducer.ContextStateSerializer::new);
            }
        }
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

## RuleId[id=NullableProblems]
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
in `flink-formats-kafka/flink-avro-confluent-registry/src/main/java/org/apache/flink/formats/avro/registry/confluent/CachedSchemaCoderProvider.java`
#### Snippet
```java
    private final String url;
    private final int identityMapCapacity;
    private final @Nullable Map<String, ?> registryConfigs;

    CachedSchemaCoderProvider(String url, int identityMapCapacity) {
```

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
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private volatile boolean closed;

    @Nullable protected final String transactionalId;

    public FlinkKafkaInternalProducer(Properties properties) {
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
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
    private static final String PRODUCER_ID_AND_EPOCH_FIELD_NAME = "producerIdAndEpoch";

    @Nullable private String transactionalId;
    private volatile boolean inTransaction;
    private volatile boolean hasRecordsInTransaction;
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
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSource.java`
#### Snippet
```java

    /** Watermark strategy that is used to generate per-partition watermark. */
    protected @Nullable WatermarkStrategy<RowData> watermarkStrategy;

    // --------------------------------------------------------------------------------------------
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
    @Nullable private SerializationSchema<? super IN> valueSerializationSchema;
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
    @Nullable private SerializationSchema<? super IN> keySerializationSchema;
    @Nullable private HeaderProvider<? super IN> headerProvider;

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
    @Nullable private HeaderProvider<? super IN> headerProvider;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
    @Nullable private FlinkKafkaPartitioner<? super IN> partitioner;
    @Nullable private SerializationSchema<? super IN> keySerializationSchema;
    @Nullable private HeaderProvider<? super IN> headerProvider;

    /**
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
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/table/KafkaDynamicSink.java`
#### Snippet
```java

    /** Prefix that needs to be removed from fields when constructing the physical data type. */
    protected final @Nullable String keyPrefix;

    // --------------------------------------------------------------------------------------------
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

    /** Partitioner to select Kafka partition for each item. */
    protected final @Nullable FlinkKafkaPartitioner<RowData> partitioner;

    /**
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

    /** The callback than handles error propagation or logging callbacks. */
    @Nullable protected transient Callback callback;

    /** Errors encountered in the async producer are stored here. */
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
        private final transient FlinkKafkaInternalProducer<byte[], byte[]> producer;

        @Nullable final String transactionalId;

        final long producerId;
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

    /** Errors encountered in the async producer are stored here. */
    @Nullable protected transient volatile Exception asyncException;

    /** Number of unacknowledged records. */
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java
     * obtained ones, so that we can resume transaction after a restart. Implementation of this
     * method is based on {@link KafkaProducer#initTransactions}.
     * https://github.com/apache/kafka/commit/5d2422258cb975a137a42a4e08f03573c49a387e#diff-f4ef1afd8792cd2a2e9069cd7ddea630
     */
    public void resumeTransaction(long producerId, short epoch) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java
     * obtained ones, so that we can resume transaction after a restart. Implementation of this
     * method is based on {@link KafkaProducer#initTransactions}.
     * https://github.com/apache/kafka/commit/5d2422258cb975a137a42a4e08f03573c49a387e#diff-f4ef1afd8792cd2a2e9069cd7ddea630
     */
    public void resumeTransaction(long producerId, short epoch) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
 *
 * <p>Please refer to Kafka's documentation for the available configuration properties:
 * http://kafka.apache.org/documentation.html#newconsumerconfigs
 */
@PublicEvolving
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-confluent-schema-registry-e2e-tests/src/main/java/org/apache/flink/schema/registry/test/TestAvroConsumerConfluent.java`
#### Snippet
```java
 * the POJO to AVRO and verifying the schema. --input-topic test-input --output-string-topic
 * test-output --output-avro-topic test-avro-output --output-subject --bootstrap.servers
 * localhost:9092 --schema-registry-url http://localhost:8081 --group.id myconsumer
 */
public class TestAvroConsumerConfluent {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/source/enumerator/KafkaSourceEnumerator.java`
#### Snippet
```java
    private static class PartitionSplitChange {
        private final Set<KafkaPartitionSplit> newPartitionSplits;
        private final Set<TopicPartition> removedPartitions;

        private PartitionSplitChange(
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
        try {
            while (open && elements.isEmpty() && timeoutMillis > 0) {
                nonEmpty.await(timeoutMillis, TimeUnit.MILLISECONDS);
                timeoutMillis = (deadline - System.nanoTime()) / 1_000_000L;
            }
```

### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/ClosableBlockingQueue.java`
#### Snippet
```java
        try {
            while (open && elements.isEmpty() && timeoutMillis > 0) {
                nonEmpty.await(timeoutMillis, TimeUnit.MILLISECONDS);
                timeoutMillis = (deadline - System.nanoTime()) / 1_000_000L;
            }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FlinkKafkaInternalProducer' used without 'try'-with-resources statement
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaCommitter.java`
#### Snippet
```java
                        recyclable
                                .<FlinkKafkaInternalProducer<?, ?>>map(Recyclable::getObject)
                                .orElseGet(() -> getRecoveryProducer(committable));
                producer.commitTransaction();
                producer.flush();
```

### AutoCloseableResource
'StreamExecutionEnvironment' used without 'try'-with-resources statement
in `flink-connector-kafka-e2e-tests/flink-streaming-kafka-test/src/main/java/org/apache/flink/streaming/kafka/test/KafkaExample.java`
#### Snippet
```java
        // parse input arguments
        final ParameterTool parameterTool = ParameterTool.fromArgs(args);
        StreamExecutionEnvironment env = KafkaExampleUtil.prepareExecutionEnv(parameterTool);

        DataStream<Integer> input =
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
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
Condition 'this == o' covered by subsequent condition 'o instanceof FlinkFixedPartitioner'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/partitioner/FlinkFixedPartitioner.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof FlinkFixedPartitioner;
    }

```

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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param deliveryGuarantee` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
     * #deliveryGuarantee}.
     *
     * @param deliveryGuarantee
     * @return {@link KafkaSinkBuilder}
     */
```

### JavadocDeclaration
`@param recordSerializer` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
     * org.apache.kafka.clients.producer.ProducerRecord}s.
     *
     * @param recordSerializer
     * @return {@link KafkaSinkBuilder}
     */
```

### JavadocDeclaration
`@param transactionalIdPrefix` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
     * written messages are not immediately consumable until the transactions timeout.
     *
     * @param transactionalIdPrefix
     * @return {@link KafkaSinkBuilder}
     */
```

### JavadocDeclaration
`@param deliveryGuarantee` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
     * #deliveryGuarantee}.
     *
     * @param deliveryGuarantee
     * @return {@link KafkaSinkBuilder}
     * @deprecated Will be removed in future versions. Use {@link #setDeliveryGuarantee} instead.
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaSinkBuilder.java`
#### Snippet
```java
     * org.apache.kafka.clients.producer.KafkaProducer}.
     *
     * @param props
     * @return {@link KafkaSinkBuilder}
     */
```

### JavadocDeclaration
`@param keySerializer` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * elements to the key of the {@link ProducerRecord}.
     *
     * @param keySerializer
     * @param configuration
     * @param <S> type of the used serializer class
```

### JavadocDeclaration
`@param configuration` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     *
     * @param keySerializer
     * @param configuration
     * @param <S> type of the used serializer class
     * @return {@code this}
```

### JavadocDeclaration
`@param keySerializationSchema` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * of the {@link ProducerRecord}.
     *
     * @param keySerializationSchema
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param partitioner` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * Sets a custom partitioner determining the target partition of the target topic.
     *
     * @param partitioner
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param keySerializer` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * ProducerRecord}.
     *
     * @param keySerializer
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param headerProvider` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * the current element.
     *
     * @param headerProvider
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param topicSelector` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * Sets a topic selector which computes the target topic for every incoming record.
     *
     * @param topicSelector
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param valueSerializer` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * ProducerRecord}.
     *
     * @param valueSerializer
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param valueSerializer` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * elements to the value of the {@link ProducerRecord}.
     *
     * @param valueSerializer
     * @param configuration
     * @param <S> type of the used serializer class
```

### JavadocDeclaration
`@param configuration` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     *
     * @param valueSerializer
     * @param configuration
     * @param <S> type of the used serializer class
     * @return {@code this}
```

### JavadocDeclaration
`@param valueSerializationSchema` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * value of the {@link ProducerRecord}.
     *
     * @param valueSerializationSchema
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param topic` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaRecordSerializationSchemaBuilder.java`
#### Snippet
```java
     * Sets a fixed topic which used as destination for all records.
     *
     * @param topic
     * @return {@code this}
     */
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param deserializer The keyed de-/serializer used to convert between Kafka's byte messages
     *     and Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param valueDeserializer The de-/serializer used to convert between Kafka's byte messages and
     *     Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param deserializer The keyed de-/serializer used to convert between Kafka's byte messages
     *     and Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param valueDeserializer The de-/serializer used to convert between Kafka's byte messages and
     *     Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param deserializer The keyed de-/serializer used to convert between Kafka's byte messages
     *     and Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param props` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumer.java`
#### Snippet
```java
     * @param deserializer The de-/serializer used to convert between Kafka's byte messages and
     *     Flink's objects.
     * @param props
     */
    public FlinkKafkaConsumer(
```

### JavadocDeclaration
`@param transaction` tag description is missing
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
     * Flush pending records.
     *
     * @param transaction
     */
    private void flush(FlinkKafkaProducer.KafkaTransactionState transaction)
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `stateSentinel` may be 'final'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/config/StartupMode.java`
#### Snippet
```java

    /** The sentinel offset value corresponding to this startup mode. */
    private long stateSentinel;

    StartupMode(long stateSentinel) {
```

### FieldMayBeFinal
Field `producer` may be 'final'
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/KafkaCommittable.java`
#### Snippet
```java
    private final short epoch;
    private final String transactionalId;
    @Nullable private Recyclable<? extends FlinkKafkaInternalProducer<?, ?>> producer;

    public KafkaCommittable(
```

### FieldMayBeFinal
Field `discoveredPartitions` may be 'final'
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractPartitionDiscoverer.java`
#### Snippet
```java
     * allowed to be increased and has incremental ids.
     */
    private Set<KafkaTopicPartition> discoveredPartitions;

    public AbstractPartitionDiscoverer(
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/FlinkKafkaInternalProducer.java`
#### Snippet
```java

            Object transactionManager = getField(kafkaProducer, "transactionManager");
            synchronized (transactionManager) {
                Object txnPartitionMap = getField(transactionManager, "txnPartitionMap");

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
            LOG.debug("Change transaction id from {} to {}", this.transactionalId, transactionalId);
            Object transactionManager = getTransactionManager();
            synchronized (transactionManager) {
                setField(transactionManager, "transactionalId", transactionalId);
                setField(
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `flink-connector-kafka/src/main/java/org/apache/flink/connector/kafka/sink/FlinkKafkaInternalProducer.java`
#### Snippet
```java

        Object transactionManager = getTransactionManager();
        synchronized (transactionManager) {
            Object txnPartitionMap = getField(transactionManager, "txnPartitionMap");

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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `asyncException`
in `flink-connector-kafka/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaProducer.java`
#### Snippet
```java
            super.close();
        } catch (Exception e) {
            asyncException = ExceptionUtils.firstOrSuppressed(e, asyncException);
        } finally {
            // We may have to close producer of the current transaction in case some exception was
```

