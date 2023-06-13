# flink-connector-mongodb 
 
# Bad smells
I found 9 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| DuplicatedCode | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| Deprecation | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/MongoDynamicTableFactory.java`
#### Snippet
```java
        final Set<ConfigOption<?>> optionalOptions = new HashSet<>();
        optionalOptions.add(SCAN_FETCH_SIZE);
        optionalOptions.add(SCAN_CURSOR_NO_TIMEOUT);
        optionalOptions.add(SCAN_PARTITION_STRATEGY);
        optionalOptions.add(SCAN_PARTITION_SIZE);
        optionalOptions.add(SCAN_PARTITION_SAMPLES);
        optionalOptions.add(BUFFER_FLUSH_MAX_ROWS);
        optionalOptions.add(BUFFER_FLUSH_INTERVAL);
        optionalOptions.add(DELIVERY_GUARANTEE);
        optionalOptions.add(SINK_MAX_RETRIES);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/split/MongoSourceSplitSerializer.java`
#### Snippet
```java
    public MongoScanSourceSplit deserializeMongoScanSourceSplit(int version, DataInputStream in)
            throws IOException {
        switch (version) {
            case 0:
                String splitId = in.readUTF();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.util.function.SerializableFunction\[\]' to 'org.apache.flink.util.function.SerializableFunction\[\]'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/RowDataToBsonConverters.java`
#### Snippet
```java
    private static SerializableFunction<Object, BsonValue> createRowConverter(RowType rowType) {
        final SerializableFunction<Object, BsonValue>[] fieldConverters =
                rowType.getChildren().stream()
                        .map(RowDataToBsonConverters::createNullSafeInternalConverter)
                        .toArray(SerializableFunction[]::new);
        final LogicalType[] fieldTypes =
                rowType.getFields().stream()
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.util.function.SerializableFunction\[\]' to 'org.apache.flink.util.function.SerializableFunction\[\]'
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/table/converter/BsonToRowDataConverters.java`
#### Snippet
```java
    private static SerializableFunction<BsonValue, Object> createRowConverter(RowType rowType) {
        final SerializableFunction<BsonValue, Object>[] fieldConverters =
                rowType.getFields().stream()
                        .map(RowType.RowField::getType)
                        .map(BsonToRowDataConverters::createNullSafeInternalConverter)
                        .toArray(SerializableFunction[]::new);
        final int arity = rowType.getFieldCount();
        final String[] fieldNames = rowType.getFieldNames().toArray(new String[0]);
```

## RuleId[id=Deprecation]
### Deprecation
'SingleThreadFetcherManager(org.apache.flink.connector.base.source.reader.synchronization.FutureCompletingBlockingQueue\>, java.util.function.Supplier\>)' is deprecated
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/MongoSourceReader.java`
#### Snippet
```java
        super(
                elementQueue,
                new SingleThreadFetcherManager<>(elementQueue, splitReaderSupplier),
                recordEmitter,
                readerContext.getConfiguration(),
```

## RuleId[id=NullableProblems]
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
in `flink-connector-mongodb/src/main/java/org/apache/flink/connector/mongodb/source/reader/split/MongoScanSourceSplitReader.java`
#### Snippet
```java
    private final MongoReadOptions readOptions;
    private final MongoSourceReaderContext readerContext;
    @Nullable private final List<String> projectedFields;

    private boolean closed = false;
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

