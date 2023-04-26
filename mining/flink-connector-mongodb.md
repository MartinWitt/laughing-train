# flink-connector-mongodb 
 
# Bad smells
I found 51 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 30 | false |
| RedundantFieldInitialization | 4 | false |
| NullableProblems | 4 | false |
| ReturnNull | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| ZeroLengthArrayInitialization | 2 | false |
| OptionalContainsCollection | 2 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/sink/writer/MongoWriter.java`
#### Snippet
```java
    private final MongoClient mongoClient;

    private boolean checkpointInProgress = false;
    private volatile long lastSendTime = 0L;
    private volatile long ackTime = Long.MAX_VALUE;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/sink/writer/MongoWriter.java`
#### Snippet
```java

    private boolean checkpointInProgress = false;
    private volatile long lastSendTime = 0L;
    private volatile long ackTime = Long.MAX_VALUE;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/split/MongoScanSourceSplitReader.java`
#### Snippet
```java
    @Nullable private final List<String> projectedFields;

    private boolean closed = false;
    private boolean finished = false;
    private MongoClient mongoClient;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/split/MongoScanSourceSplitReader.java`
#### Snippet
```java

    private boolean closed = false;
    private boolean finished = false;
    private MongoClient mongoClient;
    private MongoCursor<BsonDocument> currentCursor;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `document.keySet()` may be replaced with 'entrySet()' iteration
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
                BsonDocument document = bsonValue.asDocument();
                Map<StringData, Object> map = new HashMap<>();
                for (String key : document.keySet()) {
                    map.put(StringData.fromString(key), valueConverter.apply(document.get(key)));
                }
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/sink/writer/MongoWriter.java`
#### Snippet
```java
    public void write(IN element, Context context) throws IOException, InterruptedException {
        // do not allow new bulk writes until all actions are flushed
        while (checkpointInProgress) {
            mailboxExecutor.yield();
        }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-26-22-35-06.518.html`
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
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/MongoKeyExtractor.java`
#### Snippet
```java
        @Override
        public BsonValue apply(RowData rowData) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
                if (isBsonValueNull(bsonValue) || isBsonDecimalNaN(bsonValue)) {
                    if (type.isNullable()) {
                        return null;
                    } else {
                        throw new IllegalArgumentException(
```

### ReturnNull
Return of `null`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
                    @Override
                    public Object apply(BsonValue bsonValue) {
                        return null;
                    }
                };
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `BsonToRowDataConverters` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
/** Tool class used to convert from {@link BsonValue} to {@link RowData}. * */
@Internal
public class BsonToRowDataConverters {

    // -------------------------------------------------------------------------------------
```

### UtilityClassWithoutPrivateConstructor
Class `RowDataToBsonConverters` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/RowDataToBsonConverters.java`
#### Snippet
```java
/** Tool class used to convert from {@link RowData} to {@link BsonDocument}. */
@Internal
public class RowDataToBsonConverters {

    // --------------------------------------------------------------------------------
```

### UtilityClassWithoutPrivateConstructor
Class `MongoSampleSplitter` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/splitter/MongoSampleSplitter.java`
#### Snippet
```java
 */
@Internal
public class MongoSampleSplitter {

    private static final Logger LOG = LoggerFactory.getLogger(MongoSampleSplitter.class);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
                        .toArray(SerializableFunction[]::new);
        final int arity = rowType.getFieldCount();
        final String[] fieldNames = rowType.getFieldNames().toArray(new String[0]);

        return new SerializableFunction<BsonValue, Object>() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/MongoRowDataLookupFunction.java`
#### Snippet
```java
        this.lookupKeyRowConverter =
                RowDataToBsonConverters.createConverter(
                        RowType.of(keyTypes, keyNames.toArray(new String[0])));
    }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/emitter/MongoRecordEmitter.java`
#### Snippet
```java
        public void close() {}

        private void setSourceOutput(SourceOutput<T> sourceOutput) {
            this.sourceOutput = sourceOutput;
        }
```

### BoundedWildcard
Can generalize to `? super BsonValue`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java

    private static SerializableFunction<BsonValue, Object> wrapIntoNullSafeInternalConverter(
            SerializableFunction<BsonValue, Object> internalConverter, LogicalType type) {
        return new SerializableFunction<BsonValue, Object>() {
            private static final long serialVersionUID = 1L;
```

### BoundedWildcard
Can generalize to `? super MongoSourceSplit`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/MongoSourceEnumerator.java`
#### Snippet
```java
    public MongoSourceEnumerator(
            Boundedness boundedness,
            SplitEnumeratorContext<MongoSourceSplit> context,
            MongoSplitAssigner splitAssigner) {
        this.boundedness = boundedness;
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/serialization/MongoRowDataSerializationSchema.java`
#### Snippet
```java
    public MongoRowDataSerializationSchema(
            RowDataToBsonConverters.RowDataToBsonConverter rowDataToBsonConverter,
            Function<RowData, BsonValue> createKey) {
        this.rowDataToBsonConverter = rowDataToBsonConverter;
        this.createKey = createKey;
```

### BoundedWildcard
Can generalize to `? extends BsonValue`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/serialization/MongoRowDataSerializationSchema.java`
#### Snippet
```java
    public MongoRowDataSerializationSchema(
            RowDataToBsonConverters.RowDataToBsonConverter rowDataToBsonConverter,
            Function<RowData, BsonValue> createKey) {
        this.rowDataToBsonConverter = rowDataToBsonConverter;
        this.createKey = createKey;
```

### BoundedWildcard
Can generalize to `? extends BsonValue`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/RowDataToBsonConverters.java`
#### Snippet
```java

    private static SerializableFunction<Object, BsonValue> wrapIntoNullSafeInternalConverter(
            SerializableFunction<Object, BsonValue> internalConverter, LogicalType type) {
        return new SerializableFunction<Object, BsonValue>() {
            private static final long serialVersionUID = 1L;
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/deserializer/MongoDeserializationSchema.java`
#### Snippet
```java
     * @param out The collector to put the resulting messages.
     */
    default void deserialize(BsonDocument document, Collector<T> out) throws IOException {
        T deserialize = deserialize(document);
        if (deserialize != null) {
```

### BoundedWildcard
Can generalize to `? super MongoSplitContext`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/splitter/MongoSampleSplitter.java`
#### Snippet
```java
    static Collection<MongoScanSourceSplit> split(
            MongoSplitContext splitContext,
            BiFunction<MongoSplitContext, Integer, List<BsonDocument>> sampler) {
        MongoReadOptions readOptions = splitContext.getReadOptions();
        MongoNamespace namespace = splitContext.getMongoNamespace();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/splitter/MongoSampleSplitter.java`
#### Snippet
```java
    static Collection<MongoScanSourceSplit> split(
            MongoSplitContext splitContext,
            BiFunction<MongoSplitContext, Integer, List<BsonDocument>> sampler) {
        MongoReadOptions readOptions = splitContext.getReadOptions();
        MongoNamespace namespace = splitContext.getMongoNamespace();
```

### BoundedWildcard
Can generalize to `? extends List`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/splitter/MongoSampleSplitter.java`
#### Snippet
```java
    static Collection<MongoScanSourceSplit> split(
            MongoSplitContext splitContext,
            BiFunction<MongoSplitContext, Integer, List<BsonDocument>> sampler) {
        MongoReadOptions readOptions = splitContext.getReadOptions();
        MongoNamespace namespace = splitContext.getMongoNamespace();
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super K`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? super V`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
    public static <T> void serializeList(
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends K`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends V`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends MongoSourceSplit`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/assigner/MongoScanSplitAssigner.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(Collection<MongoSourceSplit> splits) {
        for (MongoSourceSplit split : splits) {
            if (split instanceof MongoScanSourceSplit) {
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `BsonDocument`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/common/utils/MongoUtils.java`
#### Snippet
```java
    }

    public static Optional<BsonDocument> readCollectionMetadata(
            MongoClient mongoClient, MongoNamespace namespace) {
        MongoCollection<BsonDocument> collections =
```

### OptionalContainsCollection
'Optional' contains collection `BsonDocument`
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/enumerator/splitter/MongoShardedSplitter.java`
#### Snippet
```java

        List<BsonDocument> chunks;
        Optional<BsonDocument> collectionMetadata;
        try {
            collectionMetadata = readCollectionMetadata(mongoClient, namespace);
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/MongoDynamicTableSink.java`
#### Snippet
```java
    private final MongoConnectionOptions connectionOptions;
    private final MongoWriteOptions writeOptions;
    @Nullable private final Integer parallelism;
    private final boolean isUpsert;
    private final DataType physicalRowDataType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/MongoDynamicTableSource.java`
#### Snippet
```java
    private final MongoConnectionOptions connectionOptions;
    private final MongoReadOptions readOptions;
    @Nullable private final LookupCache lookupCache;
    private final int lookupMaxRetries;
    private final long lookupRetryIntervalMs;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/MongoSource.java`
#### Snippet
```java

    /** The projections for MongoDB source. */
    @Nullable private final List<String> projectedFields;

    /** The limit for MongoDB source. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/split/MongoScanSourceSplitReader.java`
#### Snippet
```java
    private final MongoReadOptions readOptions;
    private final MongoSourceReaderContext readerContext;
    @Nullable private final List<String> projectedFields;

    private boolean closed = false;
```

