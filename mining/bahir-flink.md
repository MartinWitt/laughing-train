# bahir-flink 
 
# Bad smells
I found 212 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 50 | false |
| JavadocReference | 44 | false |
| JavadocDeclaration | 31 | false |
| UNCHECKED_WARNING | 15 | false |
| DuplicatedCode | 13 | false |
| FieldCanBeLocal | 8 | false |
| DataFlowIssue | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| UnnecessaryToStringCall | 5 | true |
| ProtectedMemberInFinalClass | 3 | true |
| IgnoreResultOfCall | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| ConstantValue | 3 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| Deprecation | 2 | false |
| RedundantCast | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| SimplifyStreamApiCallChains | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| CommentedOutCode | 1 | false |
| InstantiatingObjectToGetClassObject | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| MismatchedJavadocCode | 1 | false |
| NullableProblems | 1 | false |
| TrivialIf | 1 | false |
| AccessStaticViaInstance | 1 | false |
| UnusedAssignment | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[locations.size()\]'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReader.java`
#### Snippet
```java
                    token.serialize(),
                    i,
                    locations.toArray(new String[locations.size()])
            );
            splits[i] = split;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'KuduWriter(KuduTableInfo, KuduWriterConfig, KuduOperationMapper, KuduFailureHandler)' as a member of raw type 'org.apache.flink.connectors.kudu.connector.writer.KuduWriter'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/streaming/KuduSink.java`
#### Snippet
```java
    @Override
    public void open(Configuration parameters) throws Exception {
        kuduWriter = new KuduWriter(tableInfo, writerConfig, opsMapper, failureHandler);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.streaming.connectors.influxdb.source.InfluxDBSourceBuilder' to 'org.apache.flink.streaming.connectors.influxdb.source.InfluxDBSourceBuilder'
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/InfluxDBSourceBuilder.java`
#### Snippet
```java
            final InfluxDBDataPointDeserializer<T> dataPointDeserializer) {
        checkNotNull(dataPointDeserializer);
        final InfluxDBSourceBuilder<T> sourceBuilder = (InfluxDBSourceBuilder<T>) this;
        sourceBuilder.deserializationSchema = dataPointDeserializer;
        return sourceBuilder;
```

### UNCHECKED_WARNING
Unchecked call to 'write(T)' as a member of raw type 'org.apache.flink.connectors.kudu.connector.writer.KuduWriter'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/streaming/KuduSink.java`
#### Snippet
```java
    public void invoke(IN value) throws Exception {
        try {
            kuduWriter.write(value);
        } catch (ClassCastException e) {
            failureHandler.onTypeMismatch(e);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.streaming.connectors.influxdb.sink2.InfluxDBSinkBuilder' to 'org.apache.flink.streaming.connectors.influxdb.sink2.InfluxDBSinkBuilder'
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink2/InfluxDBSinkBuilder.java`
#### Snippet
```java
            final InfluxDBSchemaSerializer<T> influxDBSchemaSerializer) {
        checkNotNull(influxDBSchemaSerializer);
        final InfluxDBSinkBuilder<T> sinkBuilder = (InfluxDBSinkBuilder<T>) this;
        sinkBuilder.influxDBSchemaSerializer = influxDBSchemaSerializer;
        return sinkBuilder;
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisMapperHandler.java`
#### Snippet
```java
                return (RedisMapper) redisMapper.newInstance();
            }
            Constructor c = redisMapper.getConstructor(Integer.class);
            return (RedisMapper) c.newInstance(Integer.parseInt(ttl));
        } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked call to 'KuduSink(KuduWriterConfig, KuduTableInfo, KuduOperationMapper)' as a member of raw type 'org.apache.flink.connectors.kudu.streaming.KuduSink'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSink.java`
#### Snippet
```java
    @Override
    public DataStreamSink<?> consumeDataStream(DataStream<Tuple2<Boolean, Row>> dataStreamTuple) {
        KuduSink upsertKuduSink = new KuduSink(writerConfigBuilder.build(), tableInfo, new UpsertOperationMapper(getTableSchema().getFieldNames()));

        return dataStreamTuple
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReader.java`
#### Snippet
```java
            KuduScanToken token = tokens.get(i);

            List<String> locations = new ArrayList<>(token.getTablet().getReplicas().size());

            for (LocatedTablet.Replica replica : token.getTablet().getReplicas()) {
```

### UNCHECKED_WARNING
Unchecked call to 'write(T)' as a member of raw type 'org.apache.flink.connectors.kudu.connector.writer.KuduWriter'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/KuduOutputFormat.java`
#### Snippet
```java
    @Override
    public void writeRecord(IN row) throws IOException {
        kuduWriter.write(row);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'KuduWriter(KuduTableInfo, KuduWriterConfig, KuduOperationMapper, KuduFailureHandler)' as a member of raw type 'org.apache.flink.connectors.kudu.connector.writer.KuduWriter'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/KuduOutputFormat.java`
#### Snippet
```java
    @Override
    public void open(int taskNumber, int numTasks) throws IOException {
        kuduWriter = new KuduWriter(tableInfo, writerConfig, opsMapper, failureHandler);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
        TableSchema tableSchema = table.getSchema();

        Set<String> optionalProperties = new HashSet<>(Arrays.asList(KUDU_REPLICAS.key(),
                KUDU_HASH_PARTITION_NUMS.key(), KUDU_HASH_COLS.key()));
        Set<String> requiredProperties = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
        TableSchema tableSchema = table.getSchema();

        Set<String> optionalProperties = new HashSet<>(Arrays.asList(KUDU_REPLICAS.key(),
                KUDU_HASH_PARTITION_NUMS.key(), KUDU_HASH_COLS.key()));
        Set<String> requiredProperties = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked call to 'RedisSink(FlinkJedisConfigBase, RedisMapper)' as a member of raw type 'org.apache.flink.streaming.connectors.redis.RedisSink'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    @Override
    public DataStreamSink<?> consumeDataStream(DataStream<Tuple2<Boolean, Row>> dataStream) {
        return dataStream.addSink(new RedisSink(flinkJedisConfigBase, redisMapper))
                .setParallelism(dataStream.getParallelism())
                .name(TableConnectorUtils.generateRuntimeName(this.getClass(), getFieldNames()));
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.streaming.connectors.influxdb.sink.InfluxDBSinkBuilder' to 'org.apache.flink.streaming.connectors.influxdb.sink.InfluxDBSinkBuilder'
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/InfluxDBSinkBuilder.java`
#### Snippet
```java
            final InfluxDBSchemaSerializer<T> influxDBSchemaSerializer) {
        checkNotNull(influxDBSchemaSerializer);
        final InfluxDBSinkBuilder<T> sinkBuilder = (InfluxDBSinkBuilder<T>) this;
        sinkBuilder.influxDBSchemaSerializer = influxDBSchemaSerializer;
        return sinkBuilder;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.siddhi.schema.SiddhiStreamSchema' to 'org.apache.flink.streaming.siddhi.schema.SiddhiStreamSchema'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
        }
        dataStreams.put(streamId, dataStream);
        SiddhiStreamSchema<T> schema = new SiddhiStreamSchema<>(dataStream.getType(), fieldNames);
        schema.setTypeSerializer(schema.getTypeInfo().createSerializer(dataStream.getExecutionConfig()));
        dataStreamSchemas.put(streamId, schema);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'R'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamInMemOutputHandler.java`
#### Snippet
```java
        for (Event event : events) {
            if (typeInfo == null || Map.class.isAssignableFrom(typeInfo.getTypeClass())) {
                collectedRecords.add(new StreamRecord<R>((R) toMap(event), event.getTimestamp()));
            } else if (typeInfo.isTupleType()) {
                Tuple tuple = this.toTuple(event);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Committer`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/commiter/InfluxDBCommitter.java`
#### Snippet
```java

/**
 * The InfluxDBCommitter implements the {@link Committer} interface The InfluxDBCommitter is called
 * whenever a checkpoint is set by Flink. When this class is called it writes a checkpoint data
 * point in InfluxDB. The checkpoint data point uses the latest written record timestamp.
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.connector.sink2.SinkWriter.Context`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink2/writer/InfluxDBWriter.java`
#### Snippet
```java
     * @param in incoming data
     * @param context current Flink context
     * @see org.apache.flink.api.connector.sink2.SinkWriter.Context
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.connector.sink.SinkWriter.Context`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java
     * @param in incoming data
     * @param context current Flink context
     * @see org.apache.flink.api.connector.sink.SinkWriter.Context
     */
    public void write(final IN in, final Context context) throws IOException {
```

### JavadocReference
Cannot resolve symbol `SinkWriter`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java

/**
 * This Class implements the {@link SinkWriter} and it is responsible to write incoming inputs to
 * InfluxDB. It uses the {@link InfluxDBSchemaSerializer} to serialize the input into a {@link
 * Point} object. Each serialized object is stored in the {@link #elements} list. Whenever the size
```

### JavadocReference
Cannot resolve symbol `org.apache.pinot.core.segment.name.SimpleSegmentNameGenerator`
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/segment/name/SimpleSegmentNameGenerator.java`
#### Snippet
```java

/**
 * Adapted from {@link org.apache.pinot.core.segment.name.SimpleSegmentNameGenerator}.
 * <p>
 * Simple segment name generator which does not perform time conversion.
```

### JavadocReference
Cannot resolve symbol `SplitReader`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSplitReader.java`
#### Snippet
```java

/**
 * A {@link SplitReader} implementation that reads records from InfluxDB splits.
 *
 * <p>The returned type are in the format of {@link DataPoint}.
```

### JavadocReference
Cannot resolve symbol `JMSException`
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/internal/AMQExceptionListener.java`
#### Snippet
```java
     * so a single exception can be thrown only once.
     *
     * @throws JMSException if exception was received and logFailuresOnly was set to true.
     */
    public void checkErroneous() throws JMSException {
```

### JavadocReference
Cannot resolve symbol `JMSException`
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/internal/AMQUtil.java`
#### Snippet
```java
     * @param destinationName name of the destination
     * @return created destination
     * @throws JMSException
     */
    public static Destination getDestination(Session session, DestinationType destinationType,
```

### JavadocReference
Cannot resolve symbol `Schema`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduTableInfo.java`
#### Snippet
```java

    /**
     * Returns the {@link Schema} of the table. Only works if {@link #createTableIfNotExists} was specified otherwise throws an error.
     *
     * @return Schema of the target table.
```

### JavadocReference
Cannot resolve symbol `RowError`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/failure/KuduFailureHandler.java`
#### Snippet
```java

    /**
     * Handle a failed {@link List<RowError>}.
     *
     * @param failure the cause of failure
```

### JavadocReference
Cannot resolve symbol `ReadableConfig`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/KuduDynamicTableSourceSinkFactory.java`
#### Snippet
```java
     *
     * @param context
     * @return {@link ReadableConfig}
     */
    private ReadableConfig getReadableConfig(Context context) {
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.streaming.connectors.pinot.PinotSink`
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemAdapter.java`
#### Snippet
```java
/**
 * Defines the interaction with a shared filesystem. The shared filesystem must be accessible from all
 * nodes within the cluster than run a partition of the {@link org.apache.flink.streaming.connectors.pinot.PinotSink}.
 */
public interface FileSystemAdapter extends Serializable {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testOnBorrow} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestOnBorrow()
     */
    public boolean getTestOnBorrow() {
```

### JavadocReference
Cannot resolve symbol `getTestOnBorrow()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testOnBorrow} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestOnBorrow()
     */
    public boolean getTestOnBorrow() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testWhileIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestWhileIdle()
     */
    public boolean getTestWhileIdle() {
```

### JavadocReference
Cannot resolve symbol `getTestWhileIdle()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testWhileIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestWhileIdle()
     */
    public boolean getTestWhileIdle() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code minIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMinIdle()
     */
    public int getMinIdle() {
```

### JavadocReference
Cannot resolve symbol `getMinIdle()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code minIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMinIdle()
     */
    public int getMinIdle() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code maxIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMaxIdle()
     */
    public int getMaxIdle() {
```

### JavadocReference
Cannot resolve symbol `getMaxIdle()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code maxIdle} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMaxIdle()
     */
    public int getMaxIdle() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code maxTotal} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMaxTotal()
     */
    public int getMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `getMaxTotal()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code maxTotal} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getMaxTotal()
     */
    public int getMaxTotal() {
```

### JavadocReference
Cannot resolve symbol `GenericObjectPoolConfig`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testOnReturn} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestOnReturn()
     */
    public boolean getTestOnReturn() {
```

### JavadocReference
Cannot resolve symbol `getTestOnReturn()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisConfigBase.java`
#### Snippet
```java
     * @return  The current setting of {@code testOnReturn} for this
     *          configuration instance
     * @see GenericObjectPoolConfig#getTestOnReturn()
     */
    public boolean getTestOnReturn() {
```

### JavadocReference
Cannot resolve symbol `SourceFunction`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/AkkaSource.java`
#### Snippet
```java

/**
 * Implementation of {@link SourceFunction} specialized to read messages
 * from Akka actors.
 */
```

### JavadocReference
Cannot resolve symbol `DynamicTableSource`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/KuduDynamicTableSource.java`
#### Snippet
```java

/**
 * A {@link DynamicTableSource} for Kudu.
 */
public class KuduDynamicTableSource implements ScanTableSource, SupportsProjectionPushDown,
```

### JavadocReference
Cannot resolve symbol `StreamRecord`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/AbstractSiddhiOperator.java`
#### Snippet
```java
 * </li>
 * <li>
 * Convert native {@link StreamRecord} to Siddhi {@link io.siddhi.core.event.Event} according to {@link StreamSchema}, and send to Siddhi Runtime.
 * </li>
 * <li>
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.common.typeinfo.TypeInformation`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/AbstractSiddhiOperator.java`
#### Snippet
```java
 * </li>
 * <li>
 * Listen output callback event and convert as expected output type according to output {@link org.apache.flink.api.common.typeinfo.TypeInformation}, then output as typed DataStream.
 * </li>
 * </li>
```

### JavadocReference
Cannot resolve symbol `CreateTableOptions`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/CreateTableOptionsFactory.java`
#### Snippet
```java

/**
 * Factory for creating {@link CreateTableOptions} to be used when creating a table that
 * does not currently exist in Kudu. Usable through {@link KuduTableInfo#createTableIfNotExists}.
 *
```

### JavadocReference
Cannot resolve symbol `CreateTableOptions`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/CreateTableOptionsFactory.java`
#### Snippet
```java

    /**
     * Creates the {@link CreateTableOptions} that will be used during the createTable operation.
     *
     * @return CreateTableOptions for creating the table.
```

### JavadocReference
Cannot resolve symbol `SourceSplit`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/split/InfluxDBSplit.java`
#### Snippet
```java
import org.apache.flink.api.connector.source.SourceSplit;

/** A {@link SourceSplit} for a InfluxDB split. */
@Internal
public final class InfluxDBSplit implements SourceSplit {
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.core.io.SimpleVersionedSerializer`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/split/InfluxDBSplitSerializer.java`
#### Snippet
```java

/**
 * The {@link org.apache.flink.core.io.SimpleVersionedSerializer serializer} for {@link
 * InfluxDBSplit}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamOutputHandler.java`
#### Snippet
```java
/**
 * Siddhi Stream output callback handler and conver siddhi {@link Event} to required output type,
 * according to output {@link TypeInformation} and siddhi schema {@link AbstractDefinition}
 */
public class StreamOutputHandler<R> extends StreamCallback {
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
     * @param fieldNames Siddhi stream schema field names
     *
     * @see #registerStream(String, DataStream, String...)
     * @see #from(String)
     */
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
     * and select the registered stream as initial stream to connect to Siddhi Runtime.
     *
     * @see #registerStream(String, DataStream, String...)
     * @see #from(String)
     */
```

### JavadocReference
Cannot resolve symbol `StreamExecutionEnvironment`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
 *
 * <ul>
 *     <li>Initialize SiddhiCEP environment based on {@link StreamExecutionEnvironment}</li>
 *     <li>Register {@link SiddhiStream} with field-based StreamSchema and bind with physical source {@link DataStream}</li>
 *     <li>Define rich-featured Siddhi CEP execution plan with SQL-Like query for SiddhiStreamOperator</li>
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
 * <ul>
 *     <li>Initialize SiddhiCEP environment based on {@link StreamExecutionEnvironment}</li>
 *     <li>Register {@link SiddhiStream} with field-based StreamSchema and bind with physical source {@link DataStream}</li>
 *     <li>Define rich-featured Siddhi CEP execution plan with SQL-Like query for SiddhiStreamOperator</li>
 *     <li>Transform and connect source DataStream to SiddhiStreamOperator</li>
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java

    /**
     * @see DataStream
     * @return Siddhi streamId and source DataStream mapping.
     */
```

### JavadocReference
Cannot resolve symbol `Operation`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/AbstractSingleOperationMapper.java`
#### Snippet
```java
 * <br>
 * Supports both fixed operation type per record by specifying the {@link KuduOperation} or a
 * custom implementation for creating the base {@link Operation} throwugh the
 * {@link #createBaseOperation(Object, KuduTable)} method.
 *
```

### JavadocReference
Cannot resolve symbol `KuduTable`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/AbstractSingleOperationMapper.java`
#### Snippet
```java
 * Supports both fixed operation type per record by specifying the {@link KuduOperation} or a
 * custom implementation for creating the base {@link Operation} throwugh the
 * {@link #createBaseOperation(Object, KuduTable)} method.
 *
 * @param <T> Input type
```

### JavadocReference
Cannot resolve symbol `ColumnSchema`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/ColumnSchemasFactory.java`
#### Snippet
```java

/**
 * Factory for creating {@link ColumnSchema}s to be used when creating a table that
 * does not currently exist in Kudu. Usable through {@link KuduTableInfo#createTableIfNotExists}.
 *
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamInMemOutputHandler.java`
#### Snippet
```java
/**
 * Siddhi Stream output callback handler and conver siddhi {@link Event} to required output type,
 * according to output {@link TypeInformation} and siddhi schema {@link AbstractDefinition}
 */
public class StreamInMemOutputHandler<R> extends StreamCallback {
```

### JavadocReference
Cannot resolve symbol `org.apache.pinot.tools.admin.command.CreateSegmentCommand`
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
        /**
         * Creates a segment from the given parameters.
         * This method was adapted from {@link org.apache.pinot.tools.admin.command.CreateSegmentCommand}.
         *
         * @param dataFile                  File containing the JSON data
```

### JavadocReference
Cannot resolve symbol `GlobalCommitter`
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
 * generates segments and pushed them to the Pinot controller.
 * Note: We use a custom multithreading approach to parallelize the segment creation and upload to
 * overcome the performance limitations resulting from using a {@link GlobalCommitter} always
 * running at a parallelism of 1.
 */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getUrl` may produce `NullPointerException`
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
        Preconditions.checkArgument(builder != null, "InfluxDBConfig builder can not be null");

        this.url = Preconditions.checkNotNull(builder.getUrl(), "host can not be null");
        this.username = Preconditions.checkNotNull(builder.getUsername(), "username can not be null");
        this.password = Preconditions.checkNotNull(builder.getPassword(), "password can not be null");
```

### DataFlowIssue
Method invocation `appendBatch` may produce `NullPointerException`
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java

        try {
            client.appendBatch(events);
        } catch (EventDeliveryException e) {
            LOG.info("Encountered exception while sending data to flume : {}", e.getMessage(), e);
```

### DataFlowIssue
Casting `this.value` to `String` will produce `ClassCastException` for any non-null value
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduFilterInfo.java`
#### Snippet
```java
            case STRING:
                predicate = KuduPredicate.newComparisonPredicate(column, comparison,
                        (this.value instanceof BinaryStringData) ? this.value.toString() : (String) this.value);
                break;
            case FLOAT:
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/AbstractSiddhiOperator.java`
#### Snippet
```java
        while (!priorityQueue.isEmpty() && priorityQueue.peek().getTimestamp() <= mark.getTimestamp()) {
            StreamRecord<IN> streamRecord = priorityQueue.poll();
            String streamId = getStreamId(streamRecord.getValue());
            long timestamp = streamRecord.getTimestamp();
            StreamSchema<IN> schema = siddhiPlan.getInputStreamSchema(streamId);
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/handler/FlinkJedisSentinelConfigHandler.java`
#### Snippet
```java
    @Override
    public FlinkJedisConfigBase createFlinkJedisConfig(Map<String, String> properties) {
        String masterName = properties.computeIfAbsent(REDIS_MASTER_NAME, null);
        String sentinelsInfo = properties.computeIfAbsent(SENTINELS_INFO, null);
        Objects.requireNonNull(masterName, "master should not be null in sentinel mode");
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/handler/FlinkJedisSentinelConfigHandler.java`
#### Snippet
```java
    public FlinkJedisConfigBase createFlinkJedisConfig(Map<String, String> properties) {
        String masterName = properties.computeIfAbsent(REDIS_MASTER_NAME, null);
        String sentinelsInfo = properties.computeIfAbsent(SENTINELS_INFO, null);
        Objects.requireNonNull(masterName, "master should not be null in sentinel mode");
        Objects.requireNonNull(sentinelsInfo, "sentinels should not be null in sentinel mode");
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/handler/FlinkJedisSentinelConfigHandler.java`
#### Snippet
```java
        Objects.requireNonNull(sentinelsInfo, "sentinels should not be null in sentinel mode");
        Set<String> sentinels = new HashSet<>(Arrays.asList(sentinelsInfo.split(",")));
        String sentinelsPassword = properties.computeIfAbsent(SENTINELS_PASSWORD, null);
        if (sentinelsPassword != null && sentinelsPassword.trim().isEmpty()) {
            sentinelsPassword = null;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/PojoOperationMapper.java`
#### Snippet
```java
    private Field[] initFields(Class<T> pojoClass, String[] columnNames) {
        Map<String, Field> allFields = new HashMap<>();
        getAllFields(new ArrayList<>(), pojoClass).stream().forEach(f -> {
            if (!allFields.containsKey(f.getName())) {
                allFields.put(f.getName(), f);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'KuduCatalog' is still used
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
@PublicEvolving
@Deprecated
public class KuduCatalog extends AbstractReadOnlyCatalog {

    private static final Logger LOG = LoggerFactory.getLogger(KuduCatalog.class);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/schema/StreamSchema.java`
#### Snippet
```java
            CompositeType cType = (CompositeType) typeInfo;
            if (fieldNames.length != cType.getArity()) {
                // throw new IllegalArgumentException("Arity of type (" + cType.getFieldNames().length+ ") " +
                // "not equal to number of field names " + fieldNames.length + ".");
                LOGGER.warn("Arity of type (" + cType.getFieldNames().length + ") " +
```

## RuleId[id=InstantiatingObjectToGetClassObject]
### InstantiatingObjectToGetClassObject
Instantiating object to get Class object
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTypeFactory.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static final TypeInformation<?> MAP_TYPE_INFORMATION = TypeExtractor.createTypeInfo(new HashMap<String, Object>().getClass());

    public static TypeInformation<Map<String, Object>> getMapTypeInformation() {
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `redisDataType` in enum 'RedisCommand'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisCommand.java`
#### Snippet
```java
     * The {@link RedisDataType} this command belongs to.
     */
    private RedisDataType redisDataType;

    RedisCommand(RedisDataType redisDataType) {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/writer/PinotWriterStateSerializer.java`
#### Snippet
```java
    @Override
    public PinotWriterState deserialize(int version, byte[] serialized) throws IllegalStateException, IOException {
        switch (version) {
            case 1:
                return deserializeV1(serialized);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommittableSerializer.java`
#### Snippet
```java
    @Override
    public PinotSinkCommittable deserialize(int version, byte[] serialized) throws IllegalStateException, IOException {
        switch (version) {
            case 1:
                return deserializeV1(serialized);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSink.java`
#### Snippet
```java
        try {
            connection.close();
        } catch (JMSException e) {
            if (logFailuresOnly) {
                LOG.error("Failed to close ActiveMQ connection", e);
            } else {
                t = t == null    ? new RuntimeException("Failed to close ActiveMQ session", e)
                                : t;
            }
        }

        if (t != null) {
            throw t;
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/InfluxDBSinkBuilder.java`
#### Snippet
```java
        checkNotNull(this.influxDBUrl, "The InfluxDB URL is required but not provided.");
        // check that either username/password or token is provided for authentication
        checkArgument(
                this.influxDBToken != null
                        || (this.influxDBUsername != null && this.influxDBPassword != null),
                "Either the InfluxDB username and password or InfluxDB token are required but neither provided"
        );
        // check that both username/password and token are not both provided for authentication
        checkArgument(
                ! (this.influxDBToken != null
                        && (this.influxDBUsername != null || this.influxDBPassword != null)),
                "Either the InfluxDB username and password or InfluxDB token are required but both provided"
        );
        checkNotNull(this.bucketName, "The Bucket name is required but not provided.");
        checkNotNull(this.organizationName, "The Organization name is required but not provided.");
        checkNotNull(
                this.influxDBSchemaSerializer,
                "Serialization schema is required but not provided.");
```

### DuplicatedCode
Duplicated code
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/InfluxDBSinkOptions.java`
#### Snippet
```java
        final String url = configuration.getString(INFLUXDB_URL);
        final String username = configuration.getString(INFLUXDB_USERNAME);
        final String password = configuration.getString(INFLUXDB_PASSWORD);
        final String token = configuration.getString(INFLUXDB_TOKEN);
        final String bucket = configuration.getString(INFLUXDB_BUCKET);
        final String organization = configuration.getString(INFLUXDB_ORGANIZATION);
        InfluxDBClientOptions.Builder builder = InfluxDBClientOptions.builder();
        builder = builder
                .url(url)
                .bucket(bucket)
                .org(organization);
        if (token != null) {
            builder = builder.authenticateToken(token.toCharArray());
        } else if (username != null && password != null) {
            builder = builder.authenticate(username, password.toCharArray());
        }
        final InfluxDBClientOptions influxDBClientOptions = builder.build();
        return InfluxDBClientFactory.create(influxDBClientOptions);
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReader.java`
#### Snippet
```java
        String tableName = tableInfo.getName();
        if (client.tableExists(tableName)) {
            return client.openTable(tableName);
        }
        if (tableInfo.getCreateTableIfNotExists()) {
            return client.createTable(tableName, tableInfo.getSchema(), tableInfo.getCreateTableOptions());
        }
        throw new RuntimeException("Table " + tableName + " does not exist.");
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        checkArgument(!StringUtils.isNullOrWhitespaceOnly(databaseName), "databaseName cannot be null or empty");

        if (!databaseExists(databaseName)) {
            throw new DatabaseNotExistException(getName(), databaseName);
        }

        try {
            return kuduClient.getTablesList().getTablesList();
        } catch (Throwable t) {
            throw new CatalogException("Could not list tables", t);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        checkNotNull(tablePath);

        if (!tableExists(tablePath)) {
            throw new TableNotExistException(getName(), tablePath);
        }

        String tableName = tablePath.getObjectName();

        try {
            KuduTable kuduTable = kuduClient.openTable(tableName);

            CatalogTableImpl table = new CatalogTableImpl(
                    KuduTableUtils.kuduToFlinkSchema(kuduTable.getSchema()),
                    createTableProperties(tableName, kuduTable.getSchema().getPrimaryKeyColumns()),
                    tableName);

            return table;
        } catch (KuduException e) {
            throw new CatalogException(e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        String tableName = tablePath.getObjectName();
        try {
            if (tableExists(tablePath)) {
                kuduClient.deleteTable(tableName);
            } else if (!ignoreIfNotExists) {
                throw new TableNotExistException(getName(), tablePath);
            }
        } catch (KuduException e) {
            throw new CatalogException("Could not delete table " + tableName, e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        String tableName = tablePath.getObjectName();
        try {
            if (tableExists(tablePath)) {
                kuduClient.alterTable(tableName, new AlterTableOptions().renameTable(newTableName));
            } else if (!ignoreIfNotExists) {
                throw new TableNotExistException(getName(), tablePath);
            }
        } catch (KuduException e) {
            throw new CatalogException("Could not rename table " + tableName, e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        ObjectPath path = getObjectPath(tableInfo.getName());
        if (tableExists(path)) {
            if (ignoreIfExists) {
                return;
            } else {
                throw new TableAlreadyExistException(getName(), path);
            }
        }

        try {
            kuduClient.createTable(tableInfo.getName(), tableInfo.getSchema(), tableInfo.getCreateTableOptions());
        } catch (
                KuduException e) {
            throw new CatalogException("Could not create table " + tableInfo.getName(), e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        if (!tableProperties.keySet().containsAll(requiredProperties)) {
            throw new CatalogException("Missing required property. The following properties must be provided: " +
                    requiredProperties.toString());
        }

        Set<String> permittedProperties = Sets.union(requiredProperties, optionalProperties);
        if (!permittedProperties.containsAll(tableProperties.keySet())) {
            throw new CatalogException("Unpermitted properties were given. The following properties are allowed:" +
                    permittedProperties.toString());
        }

        String tableName = tablePath.getObjectName();

        KuduTableInfo tableInfo = KuduTableUtils.createTableInfo(tableName, tableSchema, tableProperties);

        createTable(tableInfo, ignoreIfExists);
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        List<String> properties = new ArrayList<>();
        properties.add(KUDU_TABLE);
        properties.add(KUDU_MASTERS);
        properties.add(KUDU_HASH_COLS);
        properties.add(KUDU_PRIMARY_KEY_COLS);
        properties.add(KUDU_MAX_BUFFER_SIZE);
        properties.add(KUDU_FLUSH_INTERVAL);
        properties.add(KUDU_OPERATION_TIMEOUT);
```

### DuplicatedCode
Duplicated code
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        properties.add(SCHEMA + ".#." + ROWTIME_TIMESTAMPS_CLASS);
        properties.add(SCHEMA + ".#." + ROWTIME_TIMESTAMPS_SERIALIZED);
        properties.add(SCHEMA + ".#." + ROWTIME_WATERMARKS_TYPE);
        properties.add(SCHEMA + ".#." + ROWTIME_WATERMARKS_CLASS);
        properties.add(SCHEMA + ".#." + ROWTIME_WATERMARKS_SERIALIZED);
        properties.add(SCHEMA + ".#." + ROWTIME_WATERMARKS_DELAY);
```

### DuplicatedCode
Duplicated code
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/schema/SiddhiStreamSchema.java`
#### Snippet
```java
        List<String> columns = new ArrayList<>();
        Preconditions.checkNotNull(streamDefinition, "StreamDefinition is null");
        for (Attribute attribute : streamDefinition.getAttributeList()) {
            columns.add(String.format("%s %s", attribute.getName(), attribute.getType().toString().toLowerCase()));
        }
        return String.format(DEFINE_STREAM_TEMPLATE, streamDefinition.getId(), StringUtils.join(columns, ","));
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisClusterConfig.java`
#### Snippet
```java
     * Returns nodes.
     *
     * @return list of node information
     */
    public Set<HostAndPort> getNodes() {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSourceReader.java`
#### Snippet
```java

    @Override
    protected InfluxDBSplit toSplitType(final String s, final InfluxDBSplit influxDBSplitState) {
        return influxDBSplitState;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSourceReader.java`
#### Snippet
```java

    @Override
    protected InfluxDBSplit initializedState(final InfluxDBSplit influxDBSplit) {
        return influxDBSplit;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSourceReader.java`
#### Snippet
```java

    @Override
    protected void onSplitFinished(final Map<String, InfluxDBSplit> map) {
        this.context.sendSplitRequest();
    }
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.flink.connectors.kudu.table.KuduCatalog' is deprecated
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
 * types by the user later if necessary.
 *
 * <p> For programmatic access to the schema of the input rows users can use the {@link KuduCatalog}
 * or overwrite the column order manually by providing a list of projected column names.
 */
```

### Deprecation
'akka.actor.UntypedActor' is deprecated
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/utils/ReceiverActor.java`
#### Snippet
```java
 * from the feeder or publisher actor.
 */
public class ReceiverActor extends UntypedActor {
  // --- Fields set by the constructor
  private final SourceContext<Object> ctx;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
        if (!tableProperties.keySet().containsAll(requiredProperties)) {
            throw new CatalogException("Missing required property. The following properties must be provided: " +
                    requiredProperties.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
        if (!permittedProperties.containsAll(tableProperties.keySet())) {
            throw new CatalogException("Unpermitted properties were given. The following properties are allowed:" +
                    permittedProperties.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemUtils.java`
#### Snippet
```java
     */
    public static File createFileInDir(File targetDir) {
        String fileName = String.format("%s.json", UUID.randomUUID().toString());
        return new File(targetDir.toString(), fileName);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        if (!tableProperties.keySet().containsAll(requiredProperties)) {
            throw new CatalogException("Missing required property. The following properties must be provided: " +
                    requiredProperties.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        if (!permittedProperties.containsAll(tableProperties.keySet())) {
            throw new CatalogException("Unpermitted properties were given. The following properties are allowed:" +
                    permittedProperties.toString());
        }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java
    private final String[] projectedFields;
    // predicate expression to apply
    @Nullable
    private final List<KuduFilterInfo> predicates;
    private boolean isFilterPushedDown;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/descriptor/Redis.java`
#### Snippet
```java
    private String mode = null;
    private String redisCommand = null;
    private Integer ttl;

    public Redis(String type, int version) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/descriptor/Redis.java`
#### Snippet
```java

    private String mode = null;
    private String redisCommand = null;
    private Integer ttl;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink2/writer/InfluxDBWriter.java`
#### Snippet
```java
    private long lastTimestamp = 0;
    private final List<Point> elements;
    private ProcessingTimeService processingTimerService;
    private final InfluxDBSchemaSerializer<IN> schemaSerializer;
    private final InfluxDBClient influxDBClient;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java

    private final int bufferSize;
    private final boolean writeCheckpoint;
    private long lastTimestamp = 0;
    private final List<Point> elements;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java
    private long lastTimestamp = 0;
    private final List<Point> elements;
    private ProcessingTimeService processingTimerService;
    private final InfluxDBSchemaSerializer<IN> schemaSerializer;
    private final InfluxDBClient influxDBClient;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    private TableSchema tableSchema;
    private String[] keyFields;
    private boolean isAppendOnly;
    private Map<String, String> properties = null;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    private RedisMapper redisMapper;
    private TableSchema tableSchema;
    private String[] keyFields;
    private boolean isAppendOnly;
    private Map<String, String> properties = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java
    private boolean isFilterPushedDown;

    private KuduRowInputFormat kuduRowInputFormat;

    public KuduTableSource(KuduReaderConfig.Builder configBuilder, KuduTableInfo tableInfo,
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
    public void close() throws Exception {
        pinotControllerClient.close();
        tempDirectory.delete();
        pool.shutdown();
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
                // Finally cleanup all files created on the local filesystem
                if (segmentData != null) {
                    segmentData.delete();
                }
                if (segmentFile != null) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
                }
                if (segmentFile != null) {
                    segmentFile.delete();
                }
            }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/AkkaSource.java`
#### Snippet
```java
    receiverActorSystem = createDefaultActorSystem();

    if (configuration.hasPath("akka.remote.auto-ack") &&
      configuration.getString("akka.remote.auto-ack").equals("on")) {
      autoAck = true;
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/commiter/InfluxDBCommitter.java`
#### Snippet
```java
    }

    private void writeCheckpointDataPoint(final Optional<Long> timestamp) {
        try (final WriteApi writeApi = this.influxDBClient.getWriteApi()) {
            final Point point = new Point("checkpoint");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'classLoader'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
            Class<T> RedisHanlderClass,
            Map<String, String> meta,
            Optional<ClassLoader> classLoader) {

        List<RedisHandler> redisHandlers = discoverRedisHanlder(classLoader);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'classLoader'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
     * @return all redis in the classpath
     */
    private static List<RedisHandler> discoverRedisHanlder(Optional<ClassLoader> classLoader) {
        try {
            List<RedisHandler> result = new LinkedList<>();
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.flink.streaming.siddhi.operator.SiddhiStreamOperator.INITIAL_PRIORITY_QUEUE_CAPACITY' accessed via instance reference
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/SiddhiStreamOperator.java`
#### Snippet
```java
    protected PriorityQueue<StreamRecord<Tuple2<String, IN>>> restoreQueuerState(DataInputView dataInputView) throws IOException {
        int snapshotSize = dataInputView.readInt();
        int sizeOfQueue = snapshotSize > 0 ? snapshotSize : this.INITIAL_PRIORITY_QUEUE_CAPACITY;
        PriorityQueue<StreamRecord<Tuple2<String, IN>>> priorityQueue = new PriorityQueue<>(sizeOfQueue);
        for (int i = 0; i < snapshotSize; i++) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `MAP_TYPE_INFORMATION` to `TypeInformation`> is redundant
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTypeFactory.java`
#### Snippet
```java

    public static TypeInformation<Map<String, Object>> getMapTypeInformation() {
        return (TypeInformation<Map<String, Object>>) MAP_TYPE_INFORMATION;
    }

```

### RedundantCast
Casting `this.dataStreams.get(...)` to `DataStream` is redundant
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiCEP.java`
#### Snippet
```java
    public <T> DataStream<T> getDataStream(String streamId) {
        if (this.dataStreams.containsKey(streamId)) {
            return (DataStream<T>) this.dataStreams.get(streamId);
        } else {
            throw new UndefinedStreamException("Undefined stream " + streamId);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerHttpClient.java`
#### Snippet
```java
     * @param body Request's body
     * @return API response
     * @throws IOException
     */
    ApiResponse post(String path, String body) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerHttpClient.java`
#### Snippet
```java
     * @param path Path to issue DELETE request to
     * @return API response
     * @throws IOException
     */
    ApiResponse delete(String path) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerHttpClient.java`
#### Snippet
```java
     * @param request Request to issue
     * @return Api response
     * @throws IOException
     */
    private ApiResponse execute(HttpRequestBase request) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerHttpClient.java`
#### Snippet
```java
     * @param path Path to GET from
     * @return API response
     * @throws IOException
     */
    ApiResponse get(String path) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandler.java`
#### Snippet
```java
     * suppport properties used for this redis handler.
     * @return support properties list
     * @throws Exception
     */
    default List<String> supportProperties() throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/writer/PinotWriterSegment.java`
#### Snippet
```java
     *
     * @return Path pointing to just written data on shared filesystem
     * @throws IOException
     */
    private String writeToSharedFilesystem() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/writer/PinotWriterSegment.java`
#### Snippet
```java
     *
     * @return {@link PinotSinkCommittable} pointing to file on shared filesystem
     * @throws IOException
     */
    public PinotSinkCommittable prepareCommit() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/writer/PinotWriterSegment.java`
#### Snippet
```java
     * @param element   Object from upstream task
     * @param timestamp Timestamp assigned to element
     * @throws IOException
     */
    public void write(IN element, long timestamp) throws IOException {
```

### JavadocDeclaration
`@param flush` tag description is missing
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java
     * up with the latest timestamp.
     *
     * @param flush
     * @return A list containing 0 or 1 element
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainer.java`
#### Snippet
```java
     * @param score Score of the element
     * @param element  element to be added
     * @return void
     */
    void zincrBy(String key, String score, String element);
```

### JavadocDeclaration
`@param setName` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainer.java`
#### Snippet
```java
     * Specified members that are not a member of this set are ignored.
     * If key does not exist, an exception will be raised.
     * @param setName
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainer.java`
#### Snippet
```java
     * If key does not exist, an exception will be raised.
     * @param setName
     * @param value
     */
    void srem(String setName, String value);
```

### JavadocDeclaration
`@param key` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainer.java`
#### Snippet
```java
     * Removes the specified field from the hash stored at key.
     * Specified fields that do not exist within this hash are ignored.
     * @param key
     * @param hashField
     */
```

### JavadocDeclaration
`@param hashField` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainer.java`
#### Snippet
```java
     * Specified fields that do not exist within this hash are ignored.
     * @param key
     * @param hashField
     */
    void hdel(String key, String hashField);
```

### JavadocDeclaration
`@param ` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
     * @param RedisHanlderClass specified redis handler class.
     * @param meta properties to search redis handler
     * @param <T>
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
     * @param meta properties to search redis handler
     * @param <T>
     * @return
     */
    public static <T extends RedisHandler> T findRedisHandler(Class<T> RedisHanlderClass, Map<String, String> meta) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/internal/AMQUtil.java`
#### Snippet
```java
     * @param destinationName name of the destination
     * @return created destination
     * @throws JMSException
     */
    public static Destination getDestination(Session session, DestinationType destinationType,
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerClient.java`
#### Snippet
```java
     * @param tableName Target table's name
     * @return Pinot table configuration
     * @throws IOException
     */
    public TableConfig getTableConfig(String tableName) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerClient.java`
#### Snippet
```java
     * @param tableName Target table's name
     * @return Pinot table schema
     * @throws IOException
     */
    public Schema getSchema(String tableName) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerClient.java`
#### Snippet
```java
     * @param tableName   Target table's name
     * @param segmentName Identifies the segment to delete
     * @throws IOException
     */
    public void deleteSegment(String tableName, String segmentName) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/PinotControllerClient.java`
#### Snippet
```java
     * @param segmentName Segment name to check
     * @return True if segment with the provided name exists
     * @throws IOException
     */
    public boolean tableHasSegment(String tableName, String segmentName) throws IOException {
```

### JavadocDeclaration
`@param context` tag description is missing
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/KuduDynamicTableSourceSinkFactory.java`
#### Snippet
```java
     * get readableConfig
     *
     * @param context
     * @return {@link ReadableConfig}
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemAdapter.java`
#### Snippet
```java
     *
     * @param path Path returned by {@link #writeToSharedFileSystem}
     * @throws IOException
     */
    void deleteFromSharedFileSystem(String path) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemAdapter.java`
#### Snippet
```java
     * @param path Path returned by {@link #writeToSharedFileSystem}
     * @return List of serialized elements read from the shared filesystem
     * @throws IOException
     */
    List<String> readFromSharedFileSystem(String path) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemAdapter.java`
#### Snippet
```java
     * @param elements List of serialized elements
     * @return Path identifying the remote file
     * @throws IOException
     */
    String writeToSharedFileSystem(List<String> elements) throws IOException;
```

### JavadocDeclaration
`@param data` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisMapper.java`
#### Snippet
```java
     * The default implementation returns an empty Optional.
     *
     * @param data
     * @return Optional
     */
```

### JavadocDeclaration
`@param data` tag description is missing
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisMapper.java`
#### Snippet
```java
     * The default implementation returns an empty Optional.
     *
     * @param data
     * @return Optional
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemUtils.java`
#### Snippet
```java
     * @param targetDir Directory to create file in
     * @return File containing the written data
     * @throws IOException
     */
    public static File writeToLocalFile(List<String> elements, File targetDir) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
         *
         * @param segmentFile File containing the segment to upload
         * @throws IOException
         */
        private void uploadSegment(File segmentFile) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
     * @param globalCommittable List of global committables that are checked for required re-commit
     * @return List of global committable that need to be re-committed
     * @throws IOException
     */
    private PinotSinkGlobalCommittable filterRecoveredCommittables(PinotSinkGlobalCommittable globalCommittable) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/committer/PinotSinkCommitter.java`
#### Snippet
```java
     * @param globalCommittable Global committable whose commit status gets evaluated
     * @return Commit status
     * @throws IOException
     */
    private CommitStatus getCommitStatus(PinotSinkGlobalCommittable globalCommittable) throws IOException {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `masters` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
     */
    public static class Builder {
        private String masters;
        private FlushMode flushMode = FlushMode.AUTO_FLUSH_BACKGROUND;
        // Reference from AsyncKuduClientBuilder defaultOperationTimeoutMs.
```

### FieldMayBeFinal
Field `maxBufferSize` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
    private final FlushMode flushMode;
    private final long operationTimeout;
    private int maxBufferSize;
    private int flushInterval;
    private boolean ignoreNotFound;
```

### FieldMayBeFinal
Field `flushInterval` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
    private final long operationTimeout;
    private int maxBufferSize;
    private int flushInterval;
    private boolean ignoreNotFound;
    private boolean ignoreDuplicate;
```

### FieldMayBeFinal
Field `ignoreNotFound` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
    private int maxBufferSize;
    private int flushInterval;
    private boolean ignoreNotFound;
    private boolean ignoreDuplicate;

```

### FieldMayBeFinal
Field `ignoreDuplicate` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
    private int flushInterval;
    private boolean ignoreNotFound;
    private boolean ignoreDuplicate;

    private KuduWriterConfig(
```

### FieldMayBeFinal
Field `jedisPool` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisContainer.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(RedisContainer.class);

    private transient JedisPool jedisPool;
    private transient JedisSentinelPool jedisSentinelPool;

```

### FieldMayBeFinal
Field `jedisSentinelPool` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisContainer.java`
#### Snippet
```java

    private transient JedisPool jedisPool;
    private transient JedisSentinelPool jedisSentinelPool;

    /**
```

### FieldMayBeFinal
Field `client` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriter.java`
#### Snippet
```java
    private final KuduOperationMapper<T> operationMapper;

    private transient KuduClient client;
    private transient KuduSession session;
    private transient KuduTable table;
```

### FieldMayBeFinal
Field `table` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriter.java`
#### Snippet
```java
    private transient KuduClient client;
    private transient KuduSession session;
    private transient KuduTable table;

    public KuduWriter(KuduTableInfo tableInfo, KuduWriterConfig writerConfig, KuduOperationMapper<T> operationMapper) throws IOException {
```

### FieldMayBeFinal
Field `session` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriter.java`
#### Snippet
```java

    private transient KuduClient client;
    private transient KuduSession session;
    private transient KuduTable table;

```

### FieldMayBeFinal
Field `flushDuration` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private String database;
    private int batchActions;
    private int flushDuration;
    private TimeUnit flushDurationTimeUnit;
    private boolean enableGzip;
```

### FieldMayBeFinal
Field `batchActions` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private String password;
    private String database;
    private int batchActions;
    private int flushDuration;
    private TimeUnit flushDurationTimeUnit;
```

### FieldMayBeFinal
Field `database` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private String username;
    private String password;
    private String database;
    private int batchActions;
    private int flushDuration;
```

### FieldMayBeFinal
Field `username` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java

    private String url;
    private String username;
    private String password;
    private String database;
```

### FieldMayBeFinal
Field `flushDurationTimeUnit` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private int batchActions;
    private int flushDuration;
    private TimeUnit flushDurationTimeUnit;
    private boolean enableGzip;
    private boolean createDatabase;
```

### FieldMayBeFinal
Field `createDatabase` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private TimeUnit flushDurationTimeUnit;
    private boolean enableGzip;
    private boolean createDatabase;

    public InfluxDBConfig(InfluxDBConfig.Builder builder) {
```

### FieldMayBeFinal
Field `enableGzip` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private int flushDuration;
    private TimeUnit flushDurationTimeUnit;
    private boolean enableGzip;
    private boolean createDatabase;

```

### FieldMayBeFinal
Field `password` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private String url;
    private String username;
    private String password;
    private String database;
    private int batchActions;
```

### FieldMayBeFinal
Field `url` may be 'final'
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
    private static final int DEFAULT_FLUSH_DURATION = 100;

    private String url;
    private String username;
    private String password;
```

### FieldMayBeFinal
Field `logicalTypes` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/RowDataUpsertOperationMapper.java`
#### Snippet
```java
    private static final int MAX_TIMESTAMP_PRECISION = 6;

    private LogicalType[] logicalTypes;

    public RowDataUpsertOperationMapper(TableSchema schema) {
```

### FieldMayBeFinal
Field `redisDataType` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisCommand.java`
#### Snippet
```java
     * The {@link RedisDataType} this command belongs to.
     */
    private RedisDataType redisDataType;

    RedisCommand(RedisDataType redisDataType) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduTableInfo.java`
#### Snippet
```java
public class KuduTableInfo implements Serializable {

    private String name;
    private CreateTableOptionsFactory createTableOptionsFactory = null;
    private ColumnSchemasFactory schemasFactory = null;
```

### FieldMayBeFinal
Field `unionStreamIds` may be 'final'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java
    public static class UnionSiddhiStream<T> extends ExecutableStream {
        private String firstStreamId;
        private List<String> unionStreamIds;

        public UnionSiddhiStream(String firstStreamId, List<String> unionStreamIds, SiddhiCEP environment) {
```

### FieldMayBeFinal
Field `firstStreamId` may be 'final'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java

    public static class UnionSiddhiStream<T> extends ExecutableStream {
        private String firstStreamId;
        private List<String> unionStreamIds;

```

### FieldMayBeFinal
Field `flinkJedisConfigBase` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java
    private RedisCommand redisCommand;

    private FlinkJedisConfigBase flinkJedisConfigBase;
    private RedisCommandsContainer redisCommandsContainer;

```

### FieldMayBeFinal
Field `jedisCluster` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisClusterContainer.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(RedisClusterContainer.class);

    private transient JedisCluster jedisCluster;

    /**
```

### FieldMayBeFinal
Field `redisSinkMapper` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java
    private Integer additionalTTL;

    private RedisMapper<IN> redisSinkMapper;
    private RedisCommand redisCommand;

```

### FieldMayBeFinal
Field `additionalTTL` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java
     * It sets the TTL for a specific key.
     */
    private Integer additionalTTL;

    private RedisMapper<IN> redisSinkMapper;
```

### FieldMayBeFinal
Field `redisCommand` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java

    private RedisMapper<IN> redisSinkMapper;
    private RedisCommand redisCommand;

    private FlinkJedisConfigBase flinkJedisConfigBase;
```

### FieldMayBeFinal
Field `additionalKey` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java
     * {@code additionalKey} used as set name for {@link RedisDataType#SORTED_SET}
     */
    private String additionalKey;

    /**
```

### FieldMayBeFinal
Field `eventBuilder` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private long waitTimeMs;
    private List<IN> incomingList;
    private FlumeEventBuilder<IN> eventBuilder;
    private RpcClient client;

```

### FieldMayBeFinal
Field `waitTimeMs` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private int batchSize;
    private int maxRetryAttempts;
    private long waitTimeMs;
    private List<IN> incomingList;
    private FlumeEventBuilder<IN> eventBuilder;
```

### FieldMayBeFinal
Field `hostname` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java

    private String clientType;
    private String hostname;
    private int port;
    private int batchSize;
```

### FieldMayBeFinal
Field `clientType` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private static final long DEFAULT_WAITTIMEMS = 1000L;

    private String clientType;
    private String hostname;
    private int port;
```

### FieldMayBeFinal
Field `maxRetryAttempts` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private int port;
    private int batchSize;
    private int maxRetryAttempts;
    private long waitTimeMs;
    private List<IN> incomingList;
```

### FieldMayBeFinal
Field `batchSize` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private String hostname;
    private int port;
    private int batchSize;
    private int maxRetryAttempts;
    private long waitTimeMs;
```

### FieldMayBeFinal
Field `port` may be 'final'
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private String clientType;
    private String hostname;
    private int port;
    private int batchSize;
    private int maxRetryAttempts;
```

### FieldMayBeFinal
Field `additionalKey` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisCommandDescription.java`
#### Snippet
```java
     * {@link #getAdditionalKey()} used as set name for {@link RedisDataType#SORTED_SET}
     */
    private String additionalKey;

    /**
```

### FieldMayBeFinal
Field `additionalTTL` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisCommandDescription.java`
#### Snippet
```java
     * <p>For {@link RedisCommand#SETEX}, we need key, value and time to live (TTL).
     */
    private Integer additionalTTL;

    /**
```

### FieldMayBeFinal
Field `redisCommand` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisCommandDescription.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private RedisCommand redisCommand;

    /**
```

### FieldMayBeFinal
Field `redisMapper` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java

    private FlinkJedisConfigBase flinkJedisConfigBase;
    private RedisMapper redisMapper;
    private TableSchema tableSchema;
    private String[] keyFields;
```

### FieldMayBeFinal
Field `flinkJedisConfigBase` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
public class RedisTableSink implements UpsertStreamTableSink<Row> {

    private FlinkJedisConfigBase flinkJedisConfigBase;
    private RedisMapper redisMapper;
    private TableSchema tableSchema;
```

### FieldMayBeFinal
Field `tableSchema` may be 'final'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    private FlinkJedisConfigBase flinkJedisConfigBase;
    private RedisMapper redisMapper;
    private TableSchema tableSchema;
    private String[] keyFields;
    private boolean isAppendOnly;
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduFilterInfo.java`
#### Snippet
```java

    public static class Builder {
        private KuduFilterInfo filter;

        private Builder(String column) {
```

### FieldMayBeFinal
Field `fieldTypes` may be 'final'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/schema/StreamSchema.java`
#### Snippet
```java
    private final int[] fieldIndexes;
    private final String[] fieldNames;
    private TypeInformation[] fieldTypes;
    private final StreamSerializer<T> streamSerializer;
    private TypeSerializer<T> typeSerializer;
```

### FieldMayBeFinal
Field `scanToken` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduInputSplit.java`
#### Snippet
```java
public class KuduInputSplit extends LocatableInputSplit {

    private byte[] scanToken;

    /**
```

### FieldMayBeFinal
Field `kuduRowInputFormat` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java
    private boolean isFilterPushedDown;

    private KuduRowInputFormat kuduRowInputFormat;

    public KuduTableSource(KuduReaderConfig.Builder configBuilder, KuduTableInfo tableInfo,
```

### FieldMayBeFinal
Field `kuduClient` may be 'final'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
    private final KuduTableFactory tableFactory = new KuduTableFactory();
    private final String kuduMasters;
    private KuduClient kuduClient;

    /**
```

### FieldMayBeFinal
Field `unacknowledgedMessages` may be 'final'
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private boolean autoAck;
    // Map of message ids to currently unacknowledged AMQ messages
    private HashMap<String, Message> unacknowledgedMessages = new HashMap<>();
    // Listener for AMQ exceptions
    private AMQExceptionListener exceptionListener;
```

### FieldMayBeFinal
Field `runningChecker` may be 'final'
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private boolean logFailuresOnly = false;
    // Stores if source is running (used for testing)
    private RunningChecker runningChecker;
    // AMQ connection
    private transient Connection connection;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `committer` is redundant
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/PinotSink.java`
#### Snippet
```java
        String timeColumnName = eventTimeExtractor.getTimeColumn();
        TimeUnit segmentTimeUnit = eventTimeExtractor.getSegmentTimeUnit();
        PinotSinkCommitter committer = new PinotSinkCommitter(
                pinotControllerHost, pinotControllerPort, tableName, segmentNameGenerator,
                tempDirPrefix, fsAdapter, timeColumnName, segmentTimeUnit, numCommitThreads
```

### UnnecessaryLocalVariable
Local variable `writer` is redundant
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/PinotSink.java`
#### Snippet
```java
    @Override
    public PinotWriter<IN> restoreWriter(InitContext context, Collection<PinotWriterState> states) throws IOException {
        PinotWriter<IN> writer = new PinotWriter<>(
                context.getSubtaskId(), maxRowsPerSegment, eventTimeExtractor,
                jsonSerializer, fsAdapter, states, this.createCommitter()
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
        @Override
        public int hashCode() {
            int result =
                    Objects.hash(
                            masters,
```

### UnnecessaryLocalVariable
Local variable `contextFactories` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
                redis);

        List<T> contextFactories = filterByContext(
                meta,
                redisFactories);
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
            KuduTable kuduTable = kuduClient.openTable(tableName);
            // fixme base on TableSchema, TableSchema needs to be upgraded to ResolvedSchema
            CatalogTableImpl table = new CatalogTableImpl(
                    KuduTableUtils.kuduToFlinkSchema(kuduTable.getSchema()),
                    createTableProperties(tableName, kuduTable.getSchema().getPrimaryKeyColumns()),
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
            KuduTable kuduTable = kuduClient.openTable(tableName);

            CatalogTableImpl table = new CatalogTableImpl(
                    KuduTableUtils.kuduToFlinkSchema(kuduTable.getSchema()),
                    createTableProperties(tableName, kuduTable.getSchema().getPrimaryKeyColumns()),
```

### UnnecessaryLocalVariable
Local variable `flinkJedisSentinelConfig` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/handler/FlinkJedisSentinelConfigHandler.java`
#### Snippet
```java
            sentinelsPassword = null;
        }
        FlinkJedisSentinelConfig flinkJedisSentinelConfig = new FlinkJedisSentinelConfig.Builder()
                .setMasterName(masterName).setSentinels(sentinels).setPassword(sentinelsPassword)
                .build();
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
        TableSchema tableSchema = table.getSchema();

        Set<String> optionalProperties = new HashSet<>(Arrays.asList(KUDU_REPLICAS));
        Set<String> requiredProperties = new HashSet<>(Arrays.asList(KUDU_HASH_COLS));

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java

        Set<String> optionalProperties = new HashSet<>(Arrays.asList(KUDU_REPLICAS));
        Set<String> requiredProperties = new HashSet<>(Arrays.asList(KUDU_HASH_COLS));

        if (!tableSchema.getPrimaryKey().isPresent()) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `properties` initializer `null` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    private String[] keyFields;
    private boolean isAppendOnly;
    private Map<String, String> properties = null;


```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        RedisCommand redisCommand = ((RowRedisMapper) obj).redisCommand;
        return this.redisCommand == redisCommand;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `flush` is always 'true'
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/v2/writer/PinotWriter.java`
#### Snippet
```java
    public void flush(boolean flush) throws IOException, InterruptedException {
        if (flush) {
            Collection<PinotSinkCommittable> committables = prepareCommittables(flush);
            committer.commitSink(committables);
        }
```

### ConstantValue
Condition `message instanceof Tuple2` is always `false`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/utils/ReceiverActor.java`
#### Snippet
```java
    if (message instanceof Iterable) {
      collect((Iterable<Object>) message);
    } else if (message instanceof Tuple2) {
      Tuple2<Object, Long> messageTuple = (Tuple2<Object, Long>) message;
      collect(messageTuple.f0, messageTuple.f1);
```

### ConstantValue
Value `message` is always 'null'
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
            Message message = consumer.receive(1000);
            if (! (message instanceof BytesMessage)) {
                LOG.warn("Active MQ source received non bytes message: {}", message);
                continue;
            }
```

