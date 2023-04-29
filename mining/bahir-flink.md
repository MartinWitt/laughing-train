# bahir-flink 
 
# Bad smells
I found 143 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 19 | false |
| RedundantFieldInitialization | 16 | false |
| UtilityClassWithoutPrivateConstructor | 11 | true |
| NonProtectedConstructorInAbstractClass | 11 | true |
| DataFlowIssue | 6 | false |
| ReturnNull | 6 | false |
| Convert2MethodRef | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| UnnecessaryLocalVariable | 5 | true |
| NonSerializableFieldInSerializableClass | 4 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| UnnecessaryBoxing | 4 | false |
| IgnoreResultOfCall | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 3 | false |
| EqualsAndHashcode | 3 | false |
| Convert2Lambda | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| RedundantImplements | 2 | false |
| SynchronizeOnThis | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| WhileCanBeForeach | 1 | false |
| CommentedOutCode | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| InstantiatingObjectToGetClassObject | 1 | false |
| MismatchedJavadocCode | 1 | false |
| NullableProblems | 1 | false |
| RedundantSuppression | 1 | false |
| AccessStaticViaInstance | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NestedAssignment | 1 | false |
| Java8MapApi | 1 | false |
| EmptyMethod | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UseCompareMethod | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UnusedAssignment | 1 | false |
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

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (input.getRowKind()) { case INSERT: case UPDATE_AFTER: ...` statement on enum type 'org.apache.flink.types.RowKind' misses case 'UPDATE_BEFORE'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/RowDataUpsertOperationMapper.java`
#### Snippet
```java
    public Optional<Operation> createBaseOperation(RowData input, KuduTable table) {
        Optional<Operation> operation = Optional.empty();
        switch (input.getRowKind()) {
            case INSERT:
            case UPDATE_AFTER:
                operation = Optional.of(table.newUpsert());
                break;
            case DELETE:
                operation = Optional.of(table.newDelete());
                break;
        }
        return operation;
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/Util.java`
#### Snippet
```java
package org.apache.flink.streaming.connectors.redis.common;

public class Util {
    public static void checkArgument(boolean condition, String message) {
        if(!condition) {
```

### UtilityClassWithoutPrivateConstructor
Class `KuduTypeUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTypeUtils.java`
#### Snippet
```java
import static org.apache.flink.util.Preconditions.checkNotNull;

public class KuduTypeUtils {

    public static DataType toFlinkType(Type type, ColumnTypeAttributes typeAttributes) {
```

### UtilityClassWithoutPrivateConstructor
Class `FlumeUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeUtils.java`
#### Snippet
```java
 * Flume RpcClient Util.
 */
public class FlumeUtils {
    private static final String CLIENT_TYPE_KEY = "client.type";
    private static final String CLIENT_TYPE_DEFAULT_FAILOVER = "default_failover";
```

### UtilityClassWithoutPrivateConstructor
Class `FileSystemUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/filesystem/FileSystemUtils.java`
#### Snippet
```java

@Internal
public class FileSystemUtils {

    private static final Logger LOG = LoggerFactory.getLogger(FileSystemUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SiddhiStreamFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiStreamFactory.java`
#### Snippet
```java
 * Convert SiddhiCEPExecutionPlan to SiddhiCEP Operator and build output DataStream
 */
public class SiddhiStreamFactory {
    @SuppressWarnings("unchecked")
    public static <OUT> DataStream<OUT> createDataStream(SiddhiOperatorContext context, DataStream<Tuple2<String, Object>> namedStream, String outStreamId) {
```

### UtilityClassWithoutPrivateConstructor
Class `SiddhiTypeFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTypeFactory.java`
#### Snippet
```java
 * Siddhi Type Utils for conversion between Java Type, Siddhi Field Type, Stream Definition, and Flink Type Information.
 */
public class SiddhiTypeFactory {
    private static final Map<Class<?>, Attribute.Type> JAVA_TO_SIDDHI_TYPE = new HashMap<>();
    private static final Map<Attribute.Type, Class<?>> SIDDHI_TO_JAVA_TYPE = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `RedisCommandsContainerBuilder` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisCommandsContainerBuilder.java`
#### Snippet
```java
 * The builder for {@link RedisCommandsContainer}.
 */
public class RedisCommandsContainerBuilder {
    private static final String DEFAULT_CLIENT_NAME = "default_client";

```

### UtilityClassWithoutPrivateConstructor
Class `RedisValidator` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/descriptor/RedisValidator.java`
#### Snippet
```java
 * redis validator for validate redis descriptor.
 */
public class RedisValidator {
    public static final String REDIS = "redis";
    public static final String REDIS_MODE = "redis-mode";
```

### UtilityClassWithoutPrivateConstructor
Class `RedisHandlerServices` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
 * @param <T> redis handler type.
 */
public class RedisHandlerServices<T> {

    private static final ServiceLoader<RedisHandler> defaultLoader = ServiceLoader.load(RedisHandler.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SiddhiTupleFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTupleFactory.java`
#### Snippet
```java
 * Siddhi Tuple Utility methods
 */
public class SiddhiTupleFactory {
    /**
     * Convert object array to type of Tuple{N} where N is between 0 to 25.
```

### UtilityClassWithoutPrivateConstructor
Class `KuduTableUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java


public class KuduTableUtils {

    private static final Logger LOG = LoggerFactory.getLogger(KuduTableUtils.class);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
    @Override
    public String getKeyFromData(Tuple2<Boolean, Row> data) {
        return data.f1.getField(0).toString();
    }

```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
    @Override
    public String getValueFromData(Tuple2<Boolean, Row> data) {
        return data.f1.getField(1).toString();
    }

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

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/utils/ReceiverActor.java`
#### Snippet
```java
  private void collect(Iterable<Object> data) {
    Iterator<Object> iterator = data.iterator();
    while (iterator.hasNext()) {
      ctx.collect(iterator.next());
    }
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        Optional<Boolean> ignoreDuplicate = properties.getOptionalBoolean(KUDU_IGNORE_DUPLICATE);

        operationTimeout.ifPresent(time -> configBuilder.setOperationTimeout(time));
        flushInterval.ifPresent(interval -> configBuilder.setFlushInterval(interval));
        bufferSize.ifPresent(size -> configBuilder.setMaxBufferSize(size));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java

        operationTimeout.ifPresent(time -> configBuilder.setOperationTimeout(time));
        flushInterval.ifPresent(interval -> configBuilder.setFlushInterval(interval));
        bufferSize.ifPresent(size -> configBuilder.setMaxBufferSize(size));
        ignoreNotFound.ifPresent(i -> configBuilder.setIgnoreNotFound(i));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        operationTimeout.ifPresent(time -> configBuilder.setOperationTimeout(time));
        flushInterval.ifPresent(interval -> configBuilder.setFlushInterval(interval));
        bufferSize.ifPresent(size -> configBuilder.setMaxBufferSize(size));
        ignoreNotFound.ifPresent(i -> configBuilder.setIgnoreNotFound(i));
        ignoreDuplicate.ifPresent(i -> configBuilder.setIgnoreDuplicate(i));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        flushInterval.ifPresent(interval -> configBuilder.setFlushInterval(interval));
        bufferSize.ifPresent(size -> configBuilder.setMaxBufferSize(size));
        ignoreNotFound.ifPresent(i -> configBuilder.setIgnoreNotFound(i));
        ignoreDuplicate.ifPresent(i -> configBuilder.setIgnoreDuplicate(i));

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableFactory.java`
#### Snippet
```java
        bufferSize.ifPresent(size -> configBuilder.setMaxBufferSize(size));
        ignoreNotFound.ifPresent(i -> configBuilder.setIgnoreNotFound(i));
        ignoreDuplicate.ifPresent(i -> configBuilder.setIgnoreDuplicate(i));

        return new KuduTableSink(configBuilder, tableInfo, physicalSchema);
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

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduFilterInfo.java`
#### Snippet
```java
    private String column;
    private FilterType type;
    private Object value;

    private KuduFilterInfo() { }
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'exceptionListener' in a Serializable class
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private HashMap<String, Message> unacknowledgedMessages = new HashMap<>();
    // Listener for AMQ exceptions
    private AMQExceptionListener exceptionListener;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'scanner' in a Serializable class
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReaderIterator.java`
#### Snippet
```java
public class KuduReaderIterator<T> implements Serializable {

    private final KuduScanner scanner;
    private final RowResultConvertor<T> rowResultConvertor;
    private RowResultIterator rowIterator;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'fields' in a Serializable class
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/PojoOperationMapper.java`
#### Snippet
```java
public class PojoOperationMapper<T> extends AbstractSingleOperationMapper<T> {

    private final Field[] fields;

    protected PojoOperationMapper(Class<T> pojoClass, String[] columnNames) { this(pojoClass, columnNames, null); }
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`predicates.size() != 0` can be replaced with '!predicates.isEmpty()'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java
        this.predicates = predicates;
        this.projectedFields = projectedFields;
        if (predicates != null && predicates.size() != 0) {
            this.isFilterPushedDown = true;
        }
```

### SizeReplaceableByIsEmpty
`predicates.size() == 0` can be replaced with 'predicates.isEmpty()'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java

    private String predicateString() {
        if (predicates == null || predicates.size() == 0) {
            return "No predicates push down";
        } else {
```

### SizeReplaceableByIsEmpty
`activeSegments.size() != 0` can be replaced with '!activeSegments.isEmpty()'
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/writer/PinotSinkWriter.java`
#### Snippet
```java
     */
    public void initializeState(PinotSinkWriterState state) {
        if (activeSegments.size() != 0) {
            throw new IllegalStateException("Please call the initialization before creating the first PinotWriterSegment.");
        }
```

### SizeReplaceableByIsEmpty
`children.size() > 0` can be replaced with '!children.isEmpty()'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java
                    !functionDefinition.equals(BuiltInFunctionDefinitions.OR)) {
                return convertBinaryComparison(functionDefinition, children);
            } else if (children.size() > 0 && functionDefinition.equals(BuiltInFunctionDefinitions.OR)) {
                return convertIsInExpression(children);
            }
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ColumnSchema`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/dynamic/catalog/KuduDynamicCatalog.java`
#### Snippet
```java
    }

    protected Map<String, String> createTableProperties(String tableName, List<ColumnSchema> primaryKeyColumns) {
        Map<String, String> props = new HashMap<>();
        props.put(KuduDynamicTableSourceSinkFactory.KUDU_MASTERS.key(), kuduMasters);
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBRecordEmitter.java`
#### Snippet
```java
    private final InfluxDBDataPointDeserializer<T> dataPointDeserializer;

    public InfluxDBRecordEmitter(final InfluxDBDataPointDeserializer<T> dataPointDeserializer) {
        this.dataPointDeserializer = dataPointDeserializer;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriter.java`
#### Snippet
```java
    }

    public KuduWriter(KuduTableInfo tableInfo, KuduWriterConfig writerConfig, KuduOperationMapper<T> operationMapper, KuduFailureHandler failureHandler) throws IOException {
        this.tableInfo = tableInfo;
        this.writerConfig = writerConfig;
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java

    public InfluxDBWriter(
            final InfluxDBSchemaSerializer<IN> schemaSerializer,
            final Configuration configuration) {
        this.schemaSerializer = schemaSerializer;
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisSink.java`
#### Snippet
```java
     * @param redisSinkMapper This is used to generate Redis command and key value from incoming elements.
     */
    public RedisSink(FlinkJedisConfigBase flinkJedisConfigBase, RedisMapper<IN> redisSinkMapper) {
        Objects.requireNonNull(flinkJedisConfigBase, "Redis connection pool config should not be null");
        Objects.requireNonNull(redisSinkMapper, "Redis Mapper can not be null");
```

### BoundedWildcard
Can generalize to `? extends R`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamInMemOutputHandler.java`
#### Snippet
```java
    private final LinkedList<StreamRecord<R>> collectedRecords;

    public StreamInMemOutputHandler(TypeInformation<R> typeInfo, AbstractDefinition definition) {
        this.typeInfo = typeInfo;
        this.definition = definition;
```

### BoundedWildcard
Can generalize to `? extends R`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamOutputHandler.java`
#### Snippet
```java
    private final ObjectMapper objectMapper;

    public StreamOutputHandler(TypeInformation<R> typeInfo, AbstractDefinition definition, Output<StreamRecord<R>> output) {
        this.typeInfo = typeInfo;
        this.definition = definition;
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamOutputHandler.java`
#### Snippet
```java
    private final ObjectMapper objectMapper;

    public StreamOutputHandler(TypeInformation<R> typeInfo, AbstractDefinition definition, Output<StreamRecord<R>> output) {
        this.typeInfo = typeInfo;
        this.definition = definition;
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReaderIterator.java`
#### Snippet
```java
    private RowResultIterator rowIterator;

    public KuduReaderIterator(KuduScanner scanner, RowResultConvertor<T> rowResultConvertor) throws KuduException {
        this.scanner = scanner;
        this.rowResultConvertor = rowResultConvertor;
```

### BoundedWildcard
Can generalize to `? extends ClassLoader`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
     * @return all redis in the classpath
     */
    private static List<RedisHandler> discoverRedisHanlder(Optional<ClassLoader> classLoader) {
        try {
            List<RedisHandler> result = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends RedisHandler`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
    private static <T> List<T> filterByFactoryClass(
            Class<T> redisClass,
            List<RedisHandler> redis) {

        List<RedisHandler> redisList = redis.stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/hanlder/RedisHandlerServices.java`
#### Snippet
```java
    private static <T extends RedisHandler> List<T> filterByContext(
            Map<String, String> meta,
            List<T> redisList) {

        List<T> matchingredis = redisList.stream().filter(factory -> {
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    }

    public FlumeSink(String clientType, String hostname, int port, FlumeEventBuilder<IN> eventBuilder, int batchSize, int maxRetryAttempts, long waitTimeMs) {
        this.clientType = clientType;
        this.hostname = hostname;
```

### BoundedWildcard
Can generalize to `? extends KuduFilterInfo`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/reader/KuduReader.java`
#### Snippet
```java
    }

    public List<KuduScanToken> scanTokens(List<KuduFilterInfo> tableFilters, List<String> tableProjections, Integer rowLimit) {
        KuduScanToken.KuduScanTokenBuilder tokenBuilder = client.newScanTokenBuilder(table);

```

### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/handler/FlinkJedisSentinelConfigHandler.java`
#### Snippet
```java

    @Override
    public FlinkJedisConfigBase createFlinkJedisConfig(Map<String, String> properties) {
        String masterName = properties.computeIfAbsent(REDIS_MASTER_NAME, null);
        String sentinelsInfo = properties.computeIfAbsent(SENTINELS_INFO, null);
```

### BoundedWildcard
Can generalize to `? extends ColumnSchema`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduCatalog.java`
#### Snippet
```java
    }

    protected Map<String, String> createTableProperties(String tableName, List<ColumnSchema> primaryKeyColumns) {
        Map<String, String> props = new HashMap<>();
        props.put(KuduTableFactory.KUDU_MASTERS, kuduMasters);
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java

    private static Optional<KuduFilterInfo> convertUnaryIsNullExpression(
            FunctionDefinition functionDefinition, List<Expression> children) {
        FieldReferenceExpression fieldReferenceExpression;
        if (isFieldReferenceExpression(children.get(0))) {
```

### BoundedWildcard
Can generalize to `? extends Tuple2`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java
    }

    public static List<ColumnSchema> toKuduConnectorColumns(List<Tuple2<String, DataType>> columns,
                                                            Collection<String> keyColumns) {
        return columns.stream()
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java

    private static Optional<KuduFilterInfo> convertBinaryComparison(
            FunctionDefinition functionDefinition, List<Expression> children) {
        FieldReferenceExpression fieldReferenceExpression;
        ValueLiteralExpression valueLiteralExpression;
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTypeFactory.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static final TypeInformation<?> MAP_TYPE_INFORMATION = TypeExtractor.createTypeInfo(new HashMap<String, Object>().getClass());

    public static TypeInformation<Map<String, Object>> getMapTypeInformation() {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/committer/PinotSinkGlobalCommitter.java`
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
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/committer/PinotSinkGlobalCommitter.java`
#### Snippet
```java
                }
                if (segmentFile != null) {
                    segmentFile.delete();
                }
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `flink-connector-pinot/src/main/java/org/apache/flink/streaming/connectors/pinot/committer/PinotSinkGlobalCommitter.java`
#### Snippet
```java
    public void close() throws IOException {
        pinotControllerClient.close();
        tempDirectory.delete();
        pool.shutdown();
    }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisClusterContainer.java`
#### Snippet
```java
    public void zadd(final String key, final String score, final String element) {
        try {
            jedisCluster.zadd(key, Double.valueOf(score), element);
        } catch (Exception e) {
            if (LOG.isErrorEnabled()) {
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisClusterContainer.java`
#### Snippet
```java

        try {
            jedisCluster.zincrby(key, Double.valueOf(score), element);
        } catch (Exception e) {
            if (LOG.isErrorEnabled()) {
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisContainer.java`
#### Snippet
```java
        try {
            jedis = getInstance();
            jedis.zadd(key, Double.valueOf(score), element);
        } catch (Exception e) {
            if (LOG.isErrorEnabled()) {
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/container/RedisContainer.java`
#### Snippet
```java
        try {
            jedis = getInstance();
            jedis.zincrby(key, Double.valueOf(score), element);
        } catch (Exception e) {
            if (LOG.isErrorEnabled()) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional` used as type for parameter 'timestamp'
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/commiter/InfluxDBCommitter.java`
#### Snippet
```java
    }

    private void writeCheckpointDataPoint(final Optional<Long> timestamp) {
        try (final WriteApi writeApi = this.influxDBClient.getWriteApi()) {
            final Point point = new Point("checkpoint");
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeUtils.java`
#### Snippet
```java
        props.setProperty(RpcClientConfigurationConstants.CONFIG_HOSTS, "h1");
        props.setProperty(RpcClientConfigurationConstants.CONFIG_HOSTS_PREFIX + "h1",
            hostname + ":" + port.intValue());
        props.setProperty(RpcClientConfigurationConstants.CONFIG_BATCH_SIZE, batchSize.toString());
        return props;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.io` is unnecessary and can be removed
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/split/InfluxDBSplitSerializer.java`
#### Snippet
```java

/**
 * The {@link org.apache.flink.core.io.SimpleVersionedSerializer serializer} for {@link
 * InfluxDBSplit}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.connector.sink` is unnecessary and can be removed
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java
     * @param in incoming data
     * @param context current Flink context
     * @see org.apache.flink.api.connector.sink.SinkWriter.Context
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `io.siddhi.core` is unnecessary and can be removed
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/AbstractSiddhiOperator.java`
#### Snippet
```java
 * <ul>
 * <li>
 * Create Siddhi {@link io.siddhi.core.SiddhiAppRuntime} according predefined execution plan and integrate with Flink Stream Operator lifecycle.
 * </li>
 * <li>
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
                resultIterator.close();
            } catch (KuduException e) {
                e.printStackTrace();
            }
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/http/WriteAPIHandler.java`
#### Snippet
```java
            final List<DataPoint> points = new ArrayList<>();
            int numberOfLinesParsed = 0;
            while ((line = in.readLine()) != null) {
                final DataPoint dataPoint = InfluxParser.parseToDataPoint(line);
                points.add(dataPoint);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuduInputFormat()` of an abstract class should not be declared 'public'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
    }

    public AbstractKuduInputFormat(KuduReaderConfig readerConfig, RowResultConvertor<T> rowResultConvertor,
                                   KuduTableInfo tableInfo, List<KuduFilterInfo> tableFilters,
                                   List<String> tableProjections) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuduInputFormat()` of an abstract class should not be declared 'public'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
    }

    public AbstractKuduInputFormat(KuduReaderConfig readerConfig, RowResultConvertor<T> rowResultConvertor,
                                   KuduTableInfo tableInfo, List<String> tableProjections) {
        this(readerConfig, rowResultConvertor, tableInfo, new ArrayList<>(), tableProjections);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKuduInputFormat()` of an abstract class should not be declared 'public'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
    private transient KuduReaderIterator<T> resultIterator;

    public AbstractKuduInputFormat(KuduReaderConfig readerConfig, RowResultConvertor<T> rowResultConvertor,
                                   KuduTableInfo tableInfo) {
        this(readerConfig, rowResultConvertor, tableInfo, new ArrayList<>(), null);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSiddhiOperator()` of an abstract class should not be declared 'public'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/AbstractSiddhiOperator.java`
#### Snippet
```java
     * @param siddhiPlan Siddhi CEP  Execution Plan
     */
    public AbstractSiddhiOperator(SiddhiOperatorContext siddhiPlan, String operatorName) {
        validate(siddhiPlan);
        this.executionExpression = siddhiPlan.getFinalExecutionPlan();
```

### NonProtectedConstructorInAbstractClass
Constructor `RowRedisMapper()` of an abstract class should not be declared 'public'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
    }

    public RowRedisMapper(RedisCommand redisCommand) {
        this.redisCommand = redisCommand;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `RowRedisMapper()` of an abstract class should not be declared 'public'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
    }

    public RowRedisMapper(int ttl, RedisCommand redisCommand) {
        this.ttl = ttl;
        this.redisCommand = redisCommand;
```

### NonProtectedConstructorInAbstractClass
Constructor `RowRedisMapper()` of an abstract class should not be declared 'public'
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
    }

    public RowRedisMapper() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractReadOnlyCatalog()` of an abstract class should not be declared 'public'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/AbstractReadOnlyCatalog.java`
#### Snippet
```java
    private static final CatalogException UNSUPPORTED_ERR = new CatalogException("This action is not supported for read-only catalogs");

    public AbstractReadOnlyCatalog(String name, String defaultDatabase) {
        super(name, defaultDatabase);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSingleOperationMapper()` of an abstract class should not be declared 'public'
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/AbstractSingleOperationMapper.java`
#### Snippet
```java
    }

    public AbstractSingleOperationMapper(String[] columnNames, KuduOperation operation) {
        this.columnNames = columnNames;
        this.operation = operation;
```

### NonProtectedConstructorInAbstractClass
Constructor `SiddhiStream()` of an abstract class should not be declared 'public'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java
     * @param cepEnvironment SiddhiCEP cepEnvironment.
     */
    public SiddhiStream(SiddhiCEP cepEnvironment) {
        Preconditions.checkNotNull(cepEnvironment,"SiddhiCEP cepEnvironment is null");
        this.cepEnvironment = cepEnvironment;
```

### NonProtectedConstructorInAbstractClass
Constructor `ExecutableStream()` of an abstract class should not be declared 'public'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java
     */
    public abstract static class ExecutableStream extends SiddhiStream {
        public ExecutableStream(SiddhiCEP environment) {
            super(environment);
        }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/utils/SiddhiTypeFactory.java`
#### Snippet
```java

    public static <F> Attribute.Type getAttributeType(TypeInformation<F> fieldType) {
        if (JAVA_TO_SIDDHI_TYPE.containsKey(fieldType.getTypeClass())) {
            return JAVA_TO_SIDDHI_TYPE.get(fieldType.getTypeClass());
        } else {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `autoAck` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private transient MessageConsumer consumer;
    // If source should immediately acknowledge incoming message
    private boolean autoAck;
    // Map of message ids to currently unacknowledged AMQ messages
    private HashMap<String, Message> unacknowledgedMessages = new HashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `unacknowledgedMessages` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private boolean autoAck;
    // Map of message ids to currently unacknowledged AMQ messages
    private HashMap<String, Message> unacknowledgedMessages = new HashMap<>();
    // Listener for AMQ exceptions
    private AMQExceptionListener exceptionListener;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `incomingList` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    private int maxRetryAttempts;
    private long waitTimeMs;
    private List<IN> incomingList;
    private FlumeEventBuilder<IN> eventBuilder;
    private RpcClient client;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new MapFunction\>() can be replaced with lambda
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java
    protected <T> DataStream<Tuple2<String, Object>> convertDataStream(DataStream<T> dataStream, String streamId) {
        final String streamIdInClosure = streamId;
        DataStream<Tuple2<String, Object>> resultStream = dataStream.map(new MapFunction<T, Tuple2<String, Object>>() {
            @Override
            public Tuple2<String, Object> map(T value) throws Exception {
```

### Convert2Lambda
Anonymous new KeySelector, Object\>() can be replaced with lambda
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/SiddhiStream.java`
#### Snippet
```java
        if (dataStream instanceof KeyedStream) {
            final KeySelector<T, Object> keySelector = ((KeyedStream<T, Object>) dataStream).getKeySelector();
            final KeySelector<Tuple2<String, Object>, Object> keySelectorInClosure = new KeySelector<Tuple2<String, Object>, Object>() {
                @Override
                public Object getKey(Tuple2<String, Object> value) throws Exception {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeUtils.java`
#### Snippet
```java
            case "DEFAULT_FAILOVER":
                props = getDefaultProperties(hostname, port, batchSize);
                props.put(CLIENT_TYPE_KEY, CLIENT_TYPE_DEFAULT_FAILOVER);
                client = RpcClientFactory.getInstance(props);
                break;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeUtils.java`
#### Snippet
```java
            case "DEFAULT_LOADBALANCE":
                props = getDefaultProperties(hostname, port, batchSize);
                props.put(CLIENT_TYPE_KEY, CLIENT_TYPE_DEFAULT_LOADBALANCING);
                client = RpcClientFactory.getInstance(props);
                break;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamOutputHandler.java`
#### Snippet
```java

    @Override
    public synchronized void stopProcessing() {
        super.stopProcessing();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/RedisTableSink.java`
#### Snippet
```java
    private String[] keyFields;
    private boolean isAppendOnly;
    private Map<String, String> properties = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSplitReader.java`
#### Snippet
```java
    private final int defaultPort;

    private HttpServer server = null;

    private final FutureCompletingBlockingQueue<List<DataPoint>> ingestionQueue;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduTableInfo.java`
#### Snippet
```java
    private String name;
    private CreateTableOptionsFactory createTableOptionsFactory = null;
    private ColumnSchemasFactory schemasFactory = null;

    private KuduTableInfo(String name) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/KuduTableInfo.java`
#### Snippet
```java

    private String name;
    private CreateTableOptionsFactory createTableOptionsFactory = null;
    private ColumnSchemasFactory schemasFactory = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/sink/writer/InfluxDBWriter.java`
#### Snippet
```java
    private final int bufferSize;
    private final boolean writeCheckpoint;
    private long lastTimestamp = 0;
    private final List<Point> elements;
    private ProcessingTimeService processingTimerService;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisPoolConfig.java`
#### Snippet
```java
        private boolean testOnReturn = GenericObjectPoolConfig.DEFAULT_TEST_ON_RETURN;
        private boolean testWhileIdle = GenericObjectPoolConfig.DEFAULT_TEST_WHILE_IDLE;
        private boolean useSsl = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/config/FlinkJedisClusterConfig.java`
#### Snippet
```java
        private boolean testWhileIdle = GenericObjectPoolConfig.DEFAULT_TEST_WHILE_IDLE;
        private String password;
        private boolean useSsl = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/internal/RunningChecker.java`
#### Snippet
```java
 */
public class RunningChecker implements Serializable {
    private volatile boolean isRunning = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSink.java`
#### Snippet
```java
    private final DestinationType destinationType;
    // Throw exceptions or just log them
    private boolean logFailuresOnly = false;
    // Used to send messages
    private transient MessageProducer producer;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-activemq/src/main/java/org/apache/flink/streaming/connectors/activemq/AMQSource.java`
#### Snippet
```java
    private final DestinationType destinationType;
    // Throw exceptions or just log them
    private boolean logFailuresOnly = false;
    // Stores if source is running (used for testing)
    private RunningChecker runningChecker;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/descriptor/Redis.java`
#### Snippet
```java
    private final DescriptorProperties properties;

    private String mode = null;
    private String redisCommand = null;
    private Integer ttl;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/descriptor/Redis.java`
#### Snippet
```java

    private String mode = null;
    private String redisCommand = null;
    private Integer ttl;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
        private boolean ignoreNotFound = false;
        // Reference from AsyncKuduSession ignoreAllDuplicateRows false.
        private boolean ignoreDuplicate = false;

        private Builder(String masters) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/KuduWriterConfig.java`
#### Snippet
```java
        private int flushInterval = 1000;
        // Reference from AsyncKuduSession ignoreAllNotFoundRows false.
        private boolean ignoreNotFound = false;
        // Reference from AsyncKuduSession ignoreAllDuplicateRows false.
        private boolean ignoreDuplicate = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
        private TimeUnit flushDurationTimeUnit = TimeUnit.MILLISECONDS;
        private boolean enableGzip = false;
        private boolean createDatabase = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-influxdb/src/main/java/org/apache/flink/streaming/connectors/influxdb/InfluxDBConfig.java`
#### Snippet
```java
        private int flushDuration = DEFAULT_FLUSH_DURATION;
        private TimeUnit flushDurationTimeUnit = TimeUnit.MILLISECONDS;
        private boolean enableGzip = false;
        private boolean createDatabase = false;

```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/AkkaSource.java`
#### Snippet
```java
  private Config getOrCreateMandatoryProperties(Config properties) {
    if (!properties.hasPath("akka.actor.provider")) {
      properties = properties.withValue("akka.actor.provider",
        ConfigValueFactory.fromAnyRef("akka.remote.RemoteActorRefProvider"));
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/AkkaSource.java`
#### Snippet
```java

    if (!properties.hasPath("akka.remote.enabled-transports")) {
      properties = properties.withValue("akka.remote.enabled-transports",
        ConfigValueFactory.fromAnyRef(Collections.singletonList("akka.remote.netty.tcp")));
    }
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/utils/SubscribeReceiver.java`
#### Snippet
```java
 * to the publisher.
 */
public class SubscribeReceiver implements Serializable {
  private static final long serialVersionUID = 1L;
  private ActorRef receiverActor;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `flink-connector-akka/src/main/java/org/apache/flink/streaming/connectors/akka/utils/UnsubscribeReceiver.java`
#### Snippet
```java
 * General interface used by Receiver Actor to un subscribe.
 */
public class UnsubscribeReceiver implements Serializable {
  private static final long serialVersionUID = 1L;
  private ActorRef receiverActor;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/row/RowRedisMapper.java`
#### Snippet
```java
 * base row redis mapper implement.
 */
public abstract class RowRedisMapper implements RedisMapper<Tuple2<Boolean, Row>>, RedisMapperHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RowRedisMapper.class);
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-connector-redis/src/main/java/org/apache/flink/streaming/connectors/redis/common/mapper/RedisMapper.java`
#### Snippet
```java
 * @param <T> The type of the element handled by this {@code RedisMapper}
 */
public interface RedisMapper<T> extends Function, Serializable {

    /**
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeEventBuilder.java`
#### Snippet
```java
 * @param <IN>
 */
public interface FlumeEventBuilder<IN> extends Function, Serializable {

    Event createFlumeEvent(IN value, RuntimeContext ctx);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/reader/InfluxDBSplitReader.java`
#### Snippet
```java
    public RecordsWithSplitIds<DataPoint> fetch() throws IOException {
        if (this.split == null) {
            return null;
        }
        final InfluxDBSplitRecords recordsBySplits = new InfluxDBSplitRecords(this.split.splitId());
```

### ReturnNull
Return of `null`
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/common/InfluxParser.java`
#### Snippet
```java
    private static Long parseTimestamp(@Nullable final TimestampContext timestamp) {
        if (timestamp == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/RowDataUpsertOperationMapper.java`
#### Snippet
```java
    public Object getFieldValue(RowData input, int i) {
        if (input == null || input.isNullAt(i)) {
            return null;
        }
        LogicalType fieldType = logicalTypes[i];
```

### ReturnNull
Return of `null`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/RowDataUpsertOperationMapper.java`
#### Snippet
```java
                    return data.toString();
                }
                return null;
            }
            case BOOLEAN:
```

### ReturnNull
Return of `null`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/connector/writer/RowDataUpsertOperationMapper.java`
#### Snippet
```java
                    return data.toBigDecimal();
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/format/AbstractKuduInputFormat.java`
#### Snippet
```java
        } else {
            endReached = true;
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
    public void invoke(IN value) throws Exception {
        int number;
        synchronized (this) {
            if (null != value) {
                incomingList.add(value);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `flink-connector-flume/src/main/java/org/apache/flink/streaming/connectors/flume/FlumeSink.java`
#### Snippet
```java
        List<Event> events = new ArrayList<>();
        List<IN>  toFlushList;
        synchronized (this) {
            if (incomingList.isEmpty()) {
                return;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-influxdb2/src/main/java/org/apache/flink/streaming/connectors/influxdb/source/enumerator/InfluxDBSourceEnumStateSerializer.java`
#### Snippet
```java
    @Override
    public byte[] serialize(final InfluxDBSourceEnumState influxDBSourceEnumState) {
        return new byte[0];
    }

```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `flink-library-siddhi/src/main/java/org/apache/flink/streaming/siddhi/operator/StreamRecordComparator.java`
#### Snippet
```java
    @Override
    public int compare(StreamRecord<IN> o1, StreamRecord<IN> o2) {
        if (o1.getTimestamp() < o2.getTimestamp()) {
            return -1;
        } else if (o1.getTimestamp() > o2.getTimestamp()) {
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

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/KuduTableSource.java`
#### Snippet
```java
                        flinkSchema
                                .getTableColumn(fieldName)
                                .get()
                                .getType()
                );
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-kudu/src/main/java/org/apache/flink/connectors/kudu/table/utils/KuduTableUtils.java`
#### Snippet
```java
        return tableProperties.containsKey(KUDU_PRIMARY_KEY_COLS.key()) ?
                Arrays.asList(tableProperties.get(KUDU_PRIMARY_KEY_COLS.key()).split(",")) :
                tableSchema.getPrimaryKey().get().getColumns();
    }

```

