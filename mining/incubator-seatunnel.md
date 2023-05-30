# incubator-seatunnel 
 
# Bad smells
I found 1308 bad smells with 78 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 190 | false |
| FieldMayBeFinal | 118 | false |
| Deprecation | 114 | false |
| DuplicatedCode | 93 | false |
| FieldCanBeLocal | 71 | false |
| NullableProblems | 51 | false |
| ConstantValue | 44 | false |
| DataFlowIssue | 43 | false |
| UnnecessaryLocalVariable | 40 | true |
| OptionalUsedAsFieldOrParameterType | 38 | false |
| SuspiciousToArrayCall | 36 | false |
| JavadocDeclaration | 34 | false |
| CollectionContainsUrl | 32 | false |
| BusyWait | 28 | false |
| UnusedAssignment | 27 | false |
| JavadocReference | 20 | false |
| ProtectedMemberInFinalClass | 18 | true |
| RedundantClassCall | 17 | false |
| IgnoreResultOfCall | 15 | false |
| OptionalGetWithoutIsPresent | 15 | false |
| UnnecessarySemicolon | 13 | false |
| MismatchedCollectionQueryUpdate | 12 | false |
| TrivialStringConcatenation | 11 | false |
| StringBufferReplaceableByString | 10 | false |
| RedundantMethodOverride | 10 | false |
| SimplifyStreamApiCallChains | 10 | false |
| AutoCloseableResource | 10 | false |
| UnnecessaryModifier | 9 | true |
| RegExpRedundantEscape | 9 | false |
| PlaceholderCountMatchesArgumentCount | 9 | false |
| DeprecatedIsStillUsed | 8 | false |
| ToArrayCallWithZeroLengthArrayArgument | 7 | true |
| NonFinalFieldInEnum | 7 | false |
| JavadocLinkAsPlainText | 7 | false |
| MalformedFormatString | 7 | false |
| NumberEquality | 6 | false |
| OptionalIsPresent | 6 | false |
| DanglingJavadoc | 6 | false |
| ArraysAsListWithZeroOrOneArgument | 6 | false |
| EmptyStatementBody | 5 | false |
| DuplicateBranchesInSwitch | 5 | false |
| CatchMayIgnoreException | 5 | false |
| RedundantCast | 5 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| IOStreamConstructor | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| TrivialIf | 4 | false |
| UnstableApiUsage | 4 | false |
| MagicConstant | 3 | false |
| ThrowFromFinallyBlock | 3 | false |
| NonAtomicOperationOnVolatileField | 3 | false |
| BoxingBoxedValue | 3 | false |
| RedundantComparatorComparing | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| ImplicitArrayToString | 3 | false |
| UseBulkOperation | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| StringEquality | 2 | false |
| LoopStatementsThatDontLoop | 2 | false |
| DoubleCheckedLocking | 2 | false |
| UnnecessaryReturn | 2 | true |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| Lombok | 2 | false |
| FuseStreamOperations | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| EmptyTryBlock | 1 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| SillyAssignment | 1 | false |
| AccessStaticViaInstance | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| UNUSED_IMPORT | 1 | false |
| PointlessNullCheck | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| InstantiationOfUtilityClass | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[coordinatorCancelList.size()\]'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
            CompletableFuture<Void> voidCompletableFuture =
                    CompletableFuture.allOf(
                            coordinatorCancelList.toArray(
                                    new CompletableFuture[coordinatorCancelList.size()]));
            voidCompletableFuture.get();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SqlServerChangeTable\[tables.size()\]'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
        }

        return tables.toArray(new SqlServerChangeTable[tables.size()]);
    }

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
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[fieldNames.size()]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SeaTunnelDataType\[seaTunnelDataTypes.size()\]'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[fieldNames.size()]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fieldNames.size()\]'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[fieldNames.size()]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SeaTunnelDataType\[seaTunnelDataTypes.size()\]'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[fieldNames.size()]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[seaTunnelDataTypes.size()]));
    }

```

## RuleId[id=WrapperTypeMayBePrimitive]
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

### WrapperTypeMayBePrimitive
Type may be primitive
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/sqlserver/SqlServerURLParser.java`
#### Snippet
```java
    public static JdbcUrlUtil.UrlInfo parse(String url) {
        String serverName = "";
        Integer port = DEFAULT_PORT;
        String dbInstance = null;
        int hostIndex = url.indexOf("://");
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/SeaTunnelRow.java`
#### Snippet
```java
        }
        SeaTunnelRow that = (SeaTunnelRow) o;
        return tableId == that.tableId
                && kind == that.kind
                && Arrays.deepEquals(fields, that.fields);
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    public ConfigParseOptions setOriginDescription(String originDescription) {
        // findbugs complains about == here but is wrong, do not "fix"
        if (this.originDescription == originDescription) {
            return this;
        } else if (this.originDescription != null
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `keyFieldIndexArr` are written to, but never read
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
    private static SeaTunnelRowType createKeyType(
            List<String> keyFieldNames, SeaTunnelRowType rowType) {
        int[] keyFieldIndexArr = new int[keyFieldNames.size()];
        SeaTunnelDataType[] keyFieldDataTypeArr = new SeaTunnelDataType[keyFieldNames.size()];
        for (int i = 0; i < keyFieldNames.size(); i++) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
     * @return storage status, true is success, false is fail
     */
    public boolean store(Object key, Object value);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
     *     return empty set
     */
    public Set<Object> deleteAll(Collection<Object> keys);

    public Map<Object, Object> loadAll() throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
    public Set<Object> deleteAll(Collection<Object> keys);

    public Map<Object, Object> loadAll() throws IOException;

    public Set<Object> loadAllKeys();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
     *     stored, return empty set.
     */
    public Set<Object> storeAll(Map<Object, Object> map);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
     * @return storage status, true is success, false is fail
     */
    public boolean delete(Object key);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
    public Set<Object> loadAllKeys();

    public void destroy(boolean deleteAllFileFlag);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
public interface IMapStorage {

    public void initialize(Map<String, Object> properties);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
    public Map<Object, Object> loadAll() throws IOException;

    public Set<Object> loadAllKeys();

    public void destroy(boolean deleteAllFileFlag);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaGroupOps.java`
#### Snippet
```java

    // Commit a batch of transactions
    public GroupXaOperationResult<XidInfo> commit(
            List<XidInfo> xids, boolean allowOutOfOrderCommits, int maxCommitAttempts);

```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sql/zeta/functions/StringFunction.java`
#### Snippet
```java
        int subexpression = subexpressionArg != null ? subexpressionArg : 0;
        int flags = makeRegexpFlags(regexpMode, false);
        Matcher m = Pattern.compile(regexp, flags).matcher(input);

        boolean found = m.find(position);
```

### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sql/zeta/functions/StringFunction.java`
#### Snippet
```java
        int flags = makeRegexpFlags(regexpMode, false);
        Matcher matcher =
                Pattern.compile(regexp, flags).matcher(input).region(position - 1, input.length());
        if (occurrence == 0) {
            return matcher.replaceAll(replacement);
```

### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sql/zeta/functions/StringFunction.java`
#### Snippet
```java
        }
        int flags = makeRegexpFlags(regexpMode, false);
        return Pattern.compile(regexp, flags).matcher(input).find();
    }

```

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
            throws SQLException {
        try (ResultSet resultSet = metaData.getColumns(database, schema, table, column)) {
            while (resultSet.next()) {
                String defaultValue = resultSet.getString("COLUMN_DEF");
                return Optional.ofNullable(defaultValue);
```

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

## RuleId[id=EmptyTryBlock]
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

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                        .jobId(jobImmutableInformation.getJobId())
                        .inputPartitions(sourceAction.getParallelism())
                        .inputRowType(MultipleRowType.class.cast(sourceProducedType))
                        .queueEmptyQueueTtl((int) (checkpointConfig.getCheckpointInterval() * 3))
                        .build();
```

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

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java

    private void tryInit() {
        if (keyConverter == null) {
            synchronized (this) {
                if (keyConverter == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
            }
        }
        if (valueConverter == null) {
            synchronized (this) {
                if (valueConverter == null) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java

                addPathText(buf, true, s);
            } else if (t == Tokens.END) {
                // ignore this; when parsing a file, it should not happen
                // since we're parsing a token list rather than the main
```

### EmptyStatementBody
`if` statement has empty body
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                            } else if (nodes.get(i) instanceof ConfigNodeSingleToken) {
                                ConfigNodeSingleToken curr = (ConfigNodeSingleToken) nodes.get(i);
                                if (curr.token() == Tokens.COMMA
                                        || Tokens.isIgnoredWhitespace(curr.token())) {
                                    // keep searching, as there could still be a comment
```

### EmptyStatementBody
`if` statement has empty body
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                            } else if (nodes.get(i) instanceof ConfigNodeSingleToken) {
                                ConfigNodeSingleToken curr = (ConfigNodeSingleToken) nodes.get(i);
                                if (curr.token() == Tokens.COMMA
                                        || Tokens.isIgnoredWhitespace(curr.token())) {
                                    // keep searching, as there could still be a comment
```

### EmptyStatementBody
`else` statement has empty body
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/FetchTask.java`
#### Snippet
```java
        if (lastRecords == null) {
            splitReader.wakeUp();
        } else {
            // interrupt enqueuing the records
            // or waitting records offer into queue timeout, see {@link #run()}
```

### EmptyStatementBody
`while` statement has empty body
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcher.java`
#### Snippet
```java
        log.info("Starting split fetcher {}", fetcherId);
        try {
            while (runOnce()) {
                // nothing to do, everything is inside #runOnce.
            }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/common/WALReader.java`
#### Snippet
```java
                return serializer.deserialize(data, clazz);
            } catch (IOException e) {
                // log.error("deserialize data error, data is {}, className is {}", data, className,
                // e);
                throw new IMapStorageException(
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `c` on break statement
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sql/zeta/functions/NumericFunction.java`
#### Snippet
```java
                        }
                        v1 = t.equals("FLOAT") ? (float) d : d;
                        break c;
                    }
                    BigDecimal bd =
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/ResponseUtil.java`
#### Snippet
```java
    public static final Pattern LABEL_EXIST_PATTERN =
            Pattern.compile(
                    "errCode = 2, detailMessage = Label \\[(.*)\\] "
                            + "has already been used, relate to txn \\[(\\d+)\\]");
    public static final Pattern COMMITTED_PATTERN =
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/ResponseUtil.java`
#### Snippet
```java
            Pattern.compile(
                    "errCode = 2, detailMessage = Label \\[(.*)\\] "
                            + "has already been used, relate to txn \\[(\\d+)\\]");
    public static final Pattern COMMITTED_PATTERN =
            Pattern.compile(
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/ResponseUtil.java`
#### Snippet
```java
    public static final Pattern COMMITTED_PATTERN =
            Pattern.compile(
                    "errCode = 2, detailMessage = transaction \\[(\\d+)\\] "
                            + "is already \\b(COMMITTED|committed|VISIBLE|visible)\\b, not pre-committed.");

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
        }

        String regex = "\\$\\{(.*?)\\}";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(topic);
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
    @SuppressWarnings("MagicNumber")
    public static boolean validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        return parts.length == 3;
    }
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
     */
    public static boolean validateJdbcUrlWithoutDatabase(String url) {
        String[] parts = url.trim().split("\\/+");

        return parts.length == 2;
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

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/util/ResponseUtil.java`
#### Snippet
```java
    public static final Pattern LABEL_EXIST_PATTERN =
            Pattern.compile(
                    "errCode = 2, detailMessage = Label \\[(.*)\\] "
                            + "has already been used, relate to txn \\[(\\d+)\\]");
    public static final Pattern COMMITTED_PATTERN =
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/util/ResponseUtil.java`
#### Snippet
```java
            Pattern.compile(
                    "errCode = 2, detailMessage = Label \\[(.*)\\] "
                            + "has already been used, relate to txn \\[(\\d+)\\]");
    public static final Pattern COMMITTED_PATTERN =
            Pattern.compile(
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchDataTypeConvertor.java`
#### Snippet
```java
        switch (sqlType) {
            case STRING:
                return STRING;
            case BOOLEAN:
                return BOOLEAN;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchDataTypeConvertor.java`
#### Snippet
```java
        switch (connectorDataType) {
            case STRING:
                return BasicType.STRING_TYPE;
            case KEYWORD:
                return BasicType.STRING_TYPE;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchDataTypeConvertor.java`
#### Snippet
```java
                return BasicType.STRING_TYPE;
            case KEYWORD:
                return BasicType.STRING_TYPE;
            case TEXT:
                return BasicType.STRING_TYPE;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchDataTypeConvertor.java`
#### Snippet
```java
                return BasicType.STRING_TYPE;
            case TEXT:
                return BasicType.STRING_TYPE;
            case BOOLEAN:
                return BasicType.BOOLEAN_TYPE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchDataTypeConvertor.java`
#### Snippet
```java
                return BasicType.FLOAT_TYPE;
            case HALF_FLOAT:
                return BasicType.FLOAT_TYPE;
            case DOUBLE:
                return BasicType.DOUBLE_TYPE;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'DeserializeFormat'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/DeserializeFormat.java`
#### Snippet
```java
    COMPATIBLE_DEBEZIUM_JSON(CompatibleDebeziumJsonDeserializationSchema.IDENTIFIER);

    private String name;

    DeserializeFormat(String name) {
```

### NonFinalFieldInEnum
Non-final field `provider` in enum 'S3aAwsCredentialsProvider'
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/config/S3Config.java`
#### Snippet
```java
        InstanceProfileCredentialsProvider("com.amazonaws.auth.InstanceProfileCredentialsProvider");

        private String provider;

        S3aAwsCredentialsProvider(String provider) {
```

### NonFinalFieldInEnum
Non-final field `method` in enum 'HttpRequestMethod'
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/config/HttpRequestMethod.java`
#### Snippet
```java
    POST("post");

    private String method;

    HttpRequestMethod(String method) {
```

### NonFinalFieldInEnum
Non-final field `format` in enum 'ResponseFormat'
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/config/HttpConfig.java`
#### Snippet
```java
        JSON("json");

        private String format;

        ResponseFormat(String format) {
```

### NonFinalFieldInEnum
Non-final field `mode` in enum 'StartMode'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/config/StartMode.java`
#### Snippet
```java
    SPECIFIC_OFFSETS("specific_offsets");

    private String mode;

    StartMode(String mode) {
```

### NonFinalFieldInEnum
Non-final field `desc` in enum 'TimePrecision'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/config/TimePrecision.java`
#### Snippet
```java
    M("M", TimeUnit.MINUTES),
    H("H", TimeUnit.HOURS);
    private String desc;
    private TimeUnit precision;

```

### NonFinalFieldInEnum
Non-final field `precision` in enum 'TimePrecision'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/config/TimePrecision.java`
#### Snippet
```java
    H("H", TimeUnit.HOURS);
    private String desc;
    private TimeUnit precision;

    TimePrecision(String desc, TimeUnit precision) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java

    private static String repeat(char quotingChar) {
        return new StringBuilder().append(quotingChar).append(quotingChar).toString();
    }

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java

        if (identifierPart.isEmpty()) {
            return new StringBuilder().append(quotingChar).append(quotingChar).toString();
        }

```

### StringBufferReplaceableByString
`StringBuilder queryBuf` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
#### Snippet
```java

    public static Map<String, Object> getColumnsDefaultValue(TablePath tablePath, Connection conn) {
        StringBuilder queryBuf = new StringBuilder("SHOW FULL COLUMNS FROM ");
        queryBuf.append(StringUtils.quoteIdentifier(tablePath.getTableName(), "`", false));
        queryBuf.append(" FROM ");
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
        }
        String loadUrl =
                new StringBuilder(host)
                        .append("/api/")
                        .append(sinkConfig.getDatabase())
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
            try {
                String queryLoadStateUrl =
                        new StringBuilder(host)
                                .append("/api/")
                                .append(sinkConfig.getDatabase())
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
        return new StringBuilder("Basic ").append(new String(encodedAuth)).toString();
    }

```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
    private QueryPlan getQueryPlan(String querySQL, String httpNode) {
        String url =
                new StringBuilder("http://")
                        .append(httpNode)
                        .append("/api/")
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
             * "${your_document_id}"} }
             */
            return new StringBuilder()
                    .append("{ \"delete\" :")
                    .append(objectMapper.writeValueAsString(deleteMetadata))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
                 * true }
                 */
                return new StringBuilder()
                        .append("{ \"update\" :")
                        .append(objectMapper.writeValueAsString(upsertMetadata))
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
                 * "${your_document_id}"} }\n ${your_document_json}
                 */
                return new StringBuilder()
                        .append("{ \"index\" :")
                        .append(objectMapper.writeValueAsString(indexMetadata))
```

## RuleId[id=Deprecation]
### Deprecation
'getSchema()' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/utils/TableUtil.java`
#### Snippet
```java
            StreamTableEnvironment tableEnvironment, Table table, boolean isAppend) {

        TypeInformation<Row> typeInfo = table.getSchema().toRowType();
        if (isAppend) {
            return tableEnvironment.toAppendStream(table, typeInfo);
```

### Deprecation
'toRowType()' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/utils/TableUtil.java`
#### Snippet
```java
            StreamTableEnvironment tableEnvironment, Table table, boolean isAppend) {

        TypeInformation<Row> typeInfo = table.getSchema().toRowType();
        if (isAppend) {
            return tableEnvironment.toAppendStream(table, typeInfo);
```

### Deprecation
'toAppendStream(org.apache.flink.table.api.Table, org.apache.flink.api.common.typeinfo.TypeInformation)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/utils/TableUtil.java`
#### Snippet
```java
        TypeInformation<Row> typeInfo = table.getSchema().toRowType();
        if (isAppend) {
            return tableEnvironment.toAppendStream(table, typeInfo);
        }
        return tableEnvironment
```

### Deprecation
'toRetractStream(org.apache.flink.table.api.Table, org.apache.flink.api.common.typeinfo.TypeInformation)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/utils/TableUtil.java`
#### Snippet
```java
        }
        return tableEnvironment
                .toRetractStream(table, typeInfo)
                .filter(row -> row.f0)
                .map(row -> row.f1)
```

### Deprecation
'registerDataStream(java.lang.String, org.apache.flink.streaming.api.datastream.DataStream, java.lang.String)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                if (config.hasPath("field_name")) {
                    String fieldName = config.getString("field_name");
                    tableEnvironment.registerDataStream(name, dataStream, fieldName);
                } else {
                    tableEnvironment.registerDataStream(name, dataStream);
```

### Deprecation
'setIdleStateRetentionTime(org.apache.flink.api.common.time.Time, org.apache.flink.api.common.time.Time)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            long max = this.config.getLong(ConfigKeyName.MAX_STATE_RETENTION_TIME);
            long min = this.config.getLong(ConfigKeyName.MIN_STATE_RETENTION_TIME);
            config.setIdleStateRetentionTime(Time.seconds(min), Time.seconds(max));
        }
    }
```

### Deprecation
'registerDataStream(java.lang.String, org.apache.flink.streaming.api.datastream.DataStream, java.lang.String)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                if (config.hasPath("field_name")) {
                    String fieldName = config.getString("field_name");
                    tableEnvironment.registerDataStream(name, dataStream, fieldName);
                } else {
                    tableEnvironment.registerDataStream(name, dataStream);
```

### Deprecation
'registerDataStream(java.lang.String, org.apache.flink.streaming.api.datastream.DataStream)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    tableEnvironment.registerDataStream(name, dataStream, fieldName);
                } else {
                    tableEnvironment.registerDataStream(name, dataStream);
                }
            }
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            switch (timeType.toLowerCase()) {
                case "event-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
                    break;
                case "ingestion-time":
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            switch (timeType.toLowerCase()) {
                case "event-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
                    break;
                case "ingestion-time":
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "ingestion-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);
                    break;
                case "processing-time":
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "ingestion-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);
                    break;
                case "processing-time":
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "processing-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
                    break;
                default:
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "processing-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
                    break;
                default:
```

### Deprecation
'CHECKPOINT_INTERVAL' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        if (config.hasPath(EnvCommonOptions.CHECKPOINT_INTERVAL.key())) {
            interval = config.getLong(EnvCommonOptions.CHECKPOINT_INTERVAL.key());
        } else if (config.hasPath(ConfigKeyName.CHECKPOINT_INTERVAL)) {
            interval = config.getLong(ConfigKeyName.CHECKPOINT_INTERVAL);
        }
```

### Deprecation
'CHECKPOINT_INTERVAL' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            interval = config.getLong(EnvCommonOptions.CHECKPOINT_INTERVAL.key());
        } else if (config.hasPath(ConfigKeyName.CHECKPOINT_INTERVAL)) {
            interval = config.getLong(ConfigKeyName.CHECKPOINT_INTERVAL);
        }

```

### Deprecation
'org.apache.flink.runtime.state.filesystem.FsStateBackend' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            if (config.hasPath(ConfigKeyName.CHECKPOINT_DATA_URI)) {
                String uri = config.getString(ConfigKeyName.CHECKPOINT_DATA_URI);
                StateBackend fsStateBackend = new FsStateBackend(uri);
                if (config.hasPath(ConfigKeyName.STATE_BACKEND)) {
                    String stateBackend = config.getString(ConfigKeyName.STATE_BACKEND);
```

### Deprecation
'registerDataStream(java.lang.String, org.apache.flink.streaming.api.datastream.DataStream)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    tableEnvironment.registerDataStream(name, dataStream, fieldName);
                } else {
                    tableEnvironment.registerDataStream(name, dataStream);
                }
            }
```

### Deprecation
'org.apache.flink.contrib.streaming.state.RocksDBStateBackend' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    if ("rocksdb".equalsIgnoreCase(stateBackend)) {
                        StateBackend rocksDBStateBackend =
                                new RocksDBStateBackend(fsStateBackend, TernaryBoolean.TRUE);
                        environment.setStateBackend(rocksDBStateBackend);
                    }
```

### Deprecation
'enableExternalizedCheckpoints(org.apache.flink.streaming.api.environment.CheckpointConfig.ExternalizedCheckpointCleanup)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                boolean cleanup = config.getBoolean(ConfigKeyName.CHECKPOINT_CLEANUP_MODE);
                if (cleanup) {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.DELETE_ON_CANCELLATION);
                } else {
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            switch (timeType.toLowerCase()) {
                case "event-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
                    break;
                case "ingestion-time":
```

### Deprecation
'enableExternalizedCheckpoints(org.apache.flink.streaming.api.environment.CheckpointConfig.ExternalizedCheckpointCleanup)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                            CheckpointConfig.ExternalizedCheckpointCleanup.DELETE_ON_CANCELLATION);
                } else {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
                }
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            switch (timeType.toLowerCase()) {
                case "event-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
                    break;
                case "ingestion-time":
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "ingestion-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);
                    break;
                case "processing-time":
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "ingestion-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);
                    break;
                case "processing-time":
```

### Deprecation
'setStreamTimeCharacteristic(org.apache.flink.streaming.api.TimeCharacteristic)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "processing-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
                    break;
                default:
```

### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    break;
                case "processing-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
                    break;
                default:
```

### Deprecation
'CHECKPOINT_INTERVAL' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        if (config.hasPath(EnvCommonOptions.CHECKPOINT_INTERVAL.key())) {
            interval = config.getLong(EnvCommonOptions.CHECKPOINT_INTERVAL.key());
        } else if (config.hasPath(ConfigKeyName.CHECKPOINT_INTERVAL)) {
            interval = config.getLong(ConfigKeyName.CHECKPOINT_INTERVAL);
        }
```

### Deprecation
'CHECKPOINT_INTERVAL' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            interval = config.getLong(EnvCommonOptions.CHECKPOINT_INTERVAL.key());
        } else if (config.hasPath(ConfigKeyName.CHECKPOINT_INTERVAL)) {
            interval = config.getLong(ConfigKeyName.CHECKPOINT_INTERVAL);
        }

```

### Deprecation
'org.apache.flink.runtime.state.filesystem.FsStateBackend' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            if (config.hasPath(ConfigKeyName.CHECKPOINT_DATA_URI)) {
                String uri = config.getString(ConfigKeyName.CHECKPOINT_DATA_URI);
                StateBackend fsStateBackend = new FsStateBackend(uri);
                if (config.hasPath(ConfigKeyName.STATE_BACKEND)) {
                    String stateBackend = config.getString(ConfigKeyName.STATE_BACKEND);
```

### Deprecation
'org.apache.flink.contrib.streaming.state.RocksDBStateBackend' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                    if ("rocksdb".equalsIgnoreCase(stateBackend)) {
                        StateBackend rocksDBStateBackend =
                                new RocksDBStateBackend(fsStateBackend, TernaryBoolean.TRUE);
                        environment.setStateBackend(rocksDBStateBackend);
                    }
```

### Deprecation
'enableExternalizedCheckpoints(org.apache.flink.streaming.api.environment.CheckpointConfig.ExternalizedCheckpointCleanup)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                boolean cleanup = config.getBoolean(ConfigKeyName.CHECKPOINT_CLEANUP_MODE);
                if (cleanup) {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.DELETE_ON_CANCELLATION);
                } else {
```

### Deprecation
'enableExternalizedCheckpoints(org.apache.flink.streaming.api.environment.CheckpointConfig.ExternalizedCheckpointCleanup)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
                            CheckpointConfig.ExternalizedCheckpointCleanup.DELETE_ON_CANCELLATION);
                } else {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
                }
```

### Deprecation
'setIdleStateRetentionTime(org.apache.flink.api.common.time.Time, org.apache.flink.api.common.time.Time)' is deprecated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
            long max = this.config.getLong(ConfigKeyName.MAX_STATE_RETENTION_TIME);
            long min = this.config.getLong(ConfigKeyName.MIN_STATE_RETENTION_TIME);
            config.setIdleStateRetentionTime(Time.seconds(min), Time.seconds(max));
        }
    }
```

### Deprecation
'getCatalogTable(java.lang.String, org.apache.seatunnel.api.table.type.SeaTunnelRowType)' is deprecated
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
        action.setParallelism(parallelism);
        CatalogTable catalogTable =
                CatalogTableUtil.getCatalogTable(
                        tableId, (SeaTunnelRowType) transform.getProducedType());
        return new Tuple2<>(catalogTable, action);
```

### Deprecation
'getCatalogTable(java.lang.String, org.apache.seatunnel.api.table.type.SeaTunnelRowType)' is deprecated
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
        action.setParallelism(parallelism);
        SeaTunnelRowType producedType = (SeaTunnelRowType) tuple.getLeft().getProducedType();
        CatalogTable catalogTable = CatalogTableUtil.getCatalogTable(tableId, producedType);
        return new Tuple2<>(catalogTable, action);
    }
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkCommitter.java`
#### Snippet
```java
/**
 * The committer wrapper of {@link SinkCommitter}, which is created by {@link
 * Sink#createCommitter()}, used to unify the different sink committer implementations
 *
 * @param <CommT> The generic type of commit message
```

### Deprecation
'org.apache.flink.api.connector.sink.Committer' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkCommitter.java`
#### Snippet
```java
 */
@Slf4j
public class FlinkCommitter<CommT> implements Committer<CommitWrapper<CommT>> {

    private final SinkCommitter<CommT> sinkCommitter;
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkGlobalCommitter.java`
#### Snippet
```java
/**
 * The committer wrapper of {@link SinkAggregatedCommitter}, which is created by {@link
 * Sink#createGlobalCommitter()}, used to unify the different implementations of {@link
 * SinkAggregatedCommitter}
 *
```

### Deprecation
'org.apache.flink.api.connector.sink.GlobalCommitter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkGlobalCommitter.java`
#### Snippet
```java
@Slf4j
public class FlinkGlobalCommitter<CommT, GlobalCommT>
        implements GlobalCommitter<CommitWrapper<CommT>, GlobalCommT> {

    private final SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter;
```

### Deprecation
Overrides deprecated method in 'org.apache.flink.api.connector.sink.SinkWriter'
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    @Override
    public List<FlinkWriterState<WriterStateT>> snapshotState() throws IOException {
        List<FlinkWriterState<WriterStateT>> states =
                sinkWriter.snapshotState(this.checkpointId).stream()
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    @Override
    public void write(InputT element, SinkWriter.Context context) throws IOException {
        if (element instanceof Row) {
            sinkWriter.write(rowSerialization.reconvert((Row) element));
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter.Context' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    @Override
    public void write(InputT element, SinkWriter.Context context) throws IOException {
        if (element instanceof Row) {
            sinkWriter.write(rowSerialization.reconvert((Row) element));
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

/**
 * The sink writer implementation of {@link SinkWriter}, which is created by {@link
 * Sink#createWriter}
 *
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java
/**
 * The sink writer implementation of {@link SinkWriter}, which is created by {@link
 * Sink#createWriter}
 *
 * @param <InputT> The generic type of input data
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java
 */
public class FlinkSinkWriter<InputT, CommT, WriterStateT>
        implements SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> {

    private final org.apache.seatunnel.api.sink.SinkWriter<SeaTunnelRow, CommT, WriterStateT>
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java

/**
 * The sink implementation of {@link Sink}, the entrypoint of flink sink translation
 *
 * @param <InputT> The generic type of input data
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java
 */
public class FlinkSink<InputT, CommT, WriterStateT, GlobalCommT>
        implements Sink<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>, GlobalCommT> {

    private final SeaTunnelSink<SeaTunnelRow, WriterStateT, CommT, GlobalCommT> sink;
```

### Deprecation
'org.apache.flink.api.connector.sink.GlobalCommitter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java

    @Override
    public Optional<GlobalCommitter<CommitWrapper<CommT>, GlobalCommT>> createGlobalCommitter()
            throws IOException {
        return sink.createAggregatedCommitter().map(FlinkGlobalCommitter::new);
```

### Deprecation
'org.apache.flink.api.connector.sink.SinkWriter' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java

    @Override
    public SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> createWriter(
            Sink.InitContext context, List<FlinkWriterState<WriterStateT>> states)
            throws IOException {
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java
    @Override
    public SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> createWriter(
            Sink.InitContext context, List<FlinkWriterState<WriterStateT>> states)
            throws IOException {
        org.apache.seatunnel.api.sink.SinkWriter.Context stContext =
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink.InitContext' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java
    @Override
    public SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> createWriter(
            Sink.InitContext context, List<FlinkWriterState<WriterStateT>> states)
            throws IOException {
        org.apache.seatunnel.api.sink.SinkWriter.Context stContext =
```

### Deprecation
'org.apache.flink.api.connector.sink.Committer' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java

    @Override
    public Optional<Committer<CommitWrapper<CommT>>> createCommitter() throws IOException {
        return sink.createCommitter().map(FlinkCommitter::new);
    }
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkSimpleVersionedSerializer.java`
#### Snippet
```java
/**
 * The serializer wrapper of aggregate commit message serializer, which is created by {@link
 * Sink#getGlobalCommittableSerializer()}, used to unify the different implementations of {@link
 * Serializer}
 *
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/serialization/CommitWrapperSerializer.java`
#### Snippet
```java
/**
 * The serializer wrapper of the commit message serializer, which is created by {@link
 * Sink#getCommittableSerializer()}, used to unify the different implementations of {@link
 * Serializer}
 *
```

### Deprecation
'org.apache.flink.api.connector.sink.Sink' is deprecated
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkWriterStateSerializer.java`
#### Snippet
```java
/**
 * The serializer wrapper of writer state serializer, which is created by {@link
 * Sink#getWriterStateSerializer()}, used to unify the different implementations of {@link
 * Serializer}
 *
```

### Deprecation
'STORE_ONLY_MONITORED_TABLES_DDL' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/EmbeddedDatabaseHistory.java`
#### Snippet
```java
            boolean useCatalogBeforeSchema) {
        this.listener = listener;
        this.storeOnlyMonitoredTablesDdl = config.getBoolean(STORE_ONLY_MONITORED_TABLES_DDL);
        this.skipUnparseableDDL = config.getBoolean(SKIP_UNPARSEABLE_DDL_STATEMENTS);

```

### Deprecation
'getHours()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    time.getHours(), time.getMinutes(), time.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof java.sql.Timestamp) {
```

### Deprecation
'getMinutes()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    time.getHours(), time.getMinutes(), time.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof java.sql.Timestamp) {
```

### Deprecation
'getSeconds()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    time.getHours(), time.getMinutes(), time.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof java.sql.Timestamp) {
```

### Deprecation
'getHours()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalTime.of(
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
```

### Deprecation
'getMinutes()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalTime.of(
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
                    timestamp.getNanos());
```

### Deprecation
'getSeconds()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
                    timestamp.getNanos());
        }
```

### Deprecation
'getHours()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    date.getHours(), date.getMinutes(), date.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof Duration) {
```

### Deprecation
'getMinutes()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    date.getHours(), date.getMinutes(), date.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof Duration) {
```

### Deprecation
'getSeconds()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalTime.of(
                    date.getHours(), date.getMinutes(), date.getSeconds(), nanosOfSecond);
        }
        if (obj instanceof Duration) {
```

### Deprecation
'getYear()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        if (obj instanceof Long) {
```

### Deprecation
'getMonth()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        if (obj instanceof Long) {
```

### Deprecation
'getDate()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
        if (obj instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) obj;
            return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        if (obj instanceof Long) {
```

### Deprecation
'getYear()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            java.sql.Timestamp timestamp = (java.sql.Timestamp) obj;
            return LocalDateTime.of(
                    timestamp.getYear() + 1900,
                    timestamp.getMonth() + 1,
                    timestamp.getDate(),
```

### Deprecation
'getMonth()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalDateTime.of(
                    timestamp.getYear() + 1900,
                    timestamp.getMonth() + 1,
                    timestamp.getDate(),
                    timestamp.getHours(),
```

### Deprecation
'getDate()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getYear() + 1900,
                    timestamp.getMonth() + 1,
                    timestamp.getDate(),
                    timestamp.getHours(),
                    timestamp.getMinutes(),
```

### Deprecation
'getHours()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getMonth() + 1,
                    timestamp.getDate(),
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
```

### Deprecation
'getMinutes()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getDate(),
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
                    timestamp.getNanos());
```

### Deprecation
'getSeconds()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    timestamp.getHours(),
                    timestamp.getMinutes(),
                    timestamp.getSeconds(),
                    timestamp.getNanos());
        }
```

### Deprecation
'getYear()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            int nanosOfSecond = (int) (millis * NANOSECONDS_PER_MILLISECOND);
            return LocalDateTime.of(
                    date.getYear() + 1900,
                    date.getMonth() + 1,
                    date.getDate(),
```

### Deprecation
'getMonth()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
            return LocalDateTime.of(
                    date.getYear() + 1900,
                    date.getMonth() + 1,
                    date.getDate(),
                    date.getHours(),
```

### Deprecation
'getDate()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    date.getYear() + 1900,
                    date.getMonth() + 1,
                    date.getDate(),
                    date.getHours(),
                    date.getMinutes(),
```

### Deprecation
'getHours()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    date.getMonth() + 1,
                    date.getDate(),
                    date.getHours(),
                    date.getMinutes(),
                    date.getSeconds(),
```

### Deprecation
'getMinutes()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    date.getDate(),
                    date.getHours(),
                    date.getMinutes(),
                    date.getSeconds(),
                    nanosOfSecond);
```

### Deprecation
'getSeconds()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/utils/TemporalConversions.java`
#### Snippet
```java
                    date.getHours(),
                    date.getMinutes(),
                    date.getSeconds(),
                    nanosOfSecond);
        }
```

### Deprecation
'getConfig()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java
        String bigIntUnsignedHandlingModeStr =
                dbzMySqlConfig
                        .getConfig()
                        .getString(MySqlConnectorConfig.BIGINT_UNSIGNED_HANDLING_MODE);
        MySqlConnectorConfig.BigIntUnsignedHandlingMode bigIntUnsignedHandlingMode =
```

### Deprecation
'getConfig()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java

        boolean timeAdjusterEnabled =
                dbzMySqlConfig.getConfig().getBoolean(MySqlConnectorConfig.ENABLE_TIME_ADJUSTER);
        return new MySqlValueConverters(
                decimalMode,
```

### Deprecation
'getConfig()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        String bigIntUnsignedHandlingModeStr =
                dbzMySqlConfig
                        .getConfig()
                        .getString(MySqlConnectorConfig.BIGINT_UNSIGNED_HANDLING_MODE);
        MySqlConnectorConfig.BigIntUnsignedHandlingMode bigIntUnsignedHandlingMode =
```

### Deprecation
'getConfig()' is deprecated
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java

        boolean timeAdjusterEnabled =
                dbzMySqlConfig.getConfig().getBoolean(MySqlConnectorConfig.ENABLE_TIME_ADJUSTER);
        return new MySqlValueConverters(
                decimalMode,
```

### Deprecation
'makeQualified(org.apache.hadoop.fs.FileSystem)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
            Path root = new Path("/");
            return new FileStatus(
                    length, isDir, blockReplication, blockSize, modTime, root.makeQualified(this));
        }
        String pathName = parentPath.toUri().getPath();
```

### Deprecation
'makeQualified(org.apache.hadoop.fs.FileSystem)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
                user,
                group,
                filePath.makeQualified(this));
    }

```

### Deprecation
'isDirectory(org.apache.hadoop.fs.Path)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
            throw new FileNotFoundException("Source path " + src + " does not exist");
        }
        if (isDirectory(absoluteDst)) {
            // destination is a directory: rename goes underneath it with the
            // source name
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                BasicType<?> elementType = ((ArrayType<?, ?>) seaTunnelDataType).getElementType();
                return Types.optionalGroup()
                        .as(OriginalType.LIST)
                        .addField(
                                Types.repeatedGroup()
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                BasicType<?> elementType = ((ArrayType<?, ?>) seaTunnelDataType).getElementType();
                return Types.optionalGroup()
                        .as(OriginalType.LIST)
                        .addField(
                                Types.repeatedGroup()
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.intType(8, true))
                        .as(OriginalType.INT_8)
                        .named(fieldName);
            case SMALLINT:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.intType(8, true))
                        .as(OriginalType.INT_8)
                        .named(fieldName);
            case SMALLINT:
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.intType(16, true))
                        .as(OriginalType.INT_16)
                        .named(fieldName);
            case INT:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.intType(16, true))
                        .as(OriginalType.INT_16)
                        .named(fieldName);
            case INT:
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.dateType())
                        .as(OriginalType.DATE)
                        .named(fieldName);
            case BIGINT:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                                PrimitiveType.PrimitiveTypeName.INT32, Type.Repetition.OPTIONAL)
                        .as(LogicalTypeAnnotation.dateType())
                        .as(OriginalType.DATE)
                        .named(fieldName);
            case BIGINT:
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                return Types.primitive(
                                PrimitiveType.PrimitiveTypeName.INT64, Type.Repetition.OPTIONAL)
                        .as(OriginalType.TIMESTAMP_MILLIS)
                        .named(fieldName);
            case FLOAT:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                return Types.primitive(
                                PrimitiveType.PrimitiveTypeName.INT64, Type.Repetition.OPTIONAL)
                        .as(OriginalType.TIMESTAMP_MILLIS)
                        .named(fieldName);
            case FLOAT:
```

### Deprecation
'as(org.apache.parquet.schema.OriginalType)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                return Types.optional(PrimitiveType.PrimitiveTypeName.FIXED_LEN_BYTE_ARRAY)
                        .length(PRECISION_TO_BYTE_COUNT[precision - 1])
                        .as(OriginalType.DECIMAL)
                        .precision(precision)
                        .scale(scale)
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                return Types.optional(PrimitiveType.PrimitiveTypeName.FIXED_LEN_BYTE_ARRAY)
                        .length(PRECISION_TO_BYTE_COUNT[precision - 1])
                        .as(OriginalType.DECIMAL)
                        .precision(precision)
                        .scale(scale)
```

### Deprecation
'precision(int)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                        .length(PRECISION_TO_BYTE_COUNT[precision - 1])
                        .as(OriginalType.DECIMAL)
                        .precision(precision)
                        .scale(scale)
                        .named(fieldName);
```

### Deprecation
'scale(int)' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                        .as(OriginalType.DECIMAL)
                        .precision(precision)
                        .scale(scale)
                        .named(fieldName);
            case BYTES:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
            switch (type.asPrimitiveType().getPrimitiveTypeName()) {
                case INT32:
                    OriginalType originalType = type.asPrimitiveType().getOriginalType();
                    if (originalType == null) {
                        return BasicType.INT_TYPE;
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                    }
                case INT64:
                    if (type.asPrimitiveType().getOriginalType() == OriginalType.TIMESTAMP_MILLIS) {
                        return LocalTimeType.LOCAL_DATE_TIME_TYPE;
                    }
```

### Deprecation
'toString(java.io.InputStream)' is deprecated
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        conn.setRequestProperty("Authorization", "Basic " + authEncoding);
        InputStream content = ((HttpPost) request).getEntity().getContent();
        String res = IOUtils.toString(content);
        conn.setDoOutput(true);
        conn.setDoInput(true);
```

### Deprecation
'propagateIfPossible(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Throwable)' is deprecated
in `seatunnel-connectors-v2/connector-assert/src/main/java/org/apache/seatunnel/connectors/seatunnel/assertion/sink/AssertSink.java`
#### Snippet
```java
    public void prepare(Config pluginConfig) {
        if (!pluginConfig.hasPath(RULES.key())) {
            Throwables.propagateIfPossible(new ConfigException.Missing(RULES.key()));
        }
        Config ruleConfig = pluginConfig.getConfig(RULES.key());
```

### Deprecation
'propagateIfPossible(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Throwable)' is deprecated
in `seatunnel-connectors-v2/connector-assert/src/main/java/org/apache/seatunnel/connectors/seatunnel/assertion/sink/AssertSink.java`
#### Snippet
```java

        if (CollectionUtils.isEmpty(configList) && CollectionUtils.isEmpty(rowConfigList)) {
            Throwables.propagateIfPossible(
                    new ConfigException.BadValue(
                            RULES.key(), "Assert rule config is empty, please add rule config."));
```

### Deprecation
'all()' is deprecated
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java

        Collection<TopicPartition> partitions =
                adminClient.describeTopics(topics).all().get().values().stream()
                        .flatMap(
                                t ->
```

### Deprecation
'withLock(org.apache.paimon.operation.Lock)' is deprecated
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/commit/PaimonAggregatedCommitter.java`
#### Snippet
```java
        try (BatchTableCommit tableCommit =
                ((InnerTableCommit) table.newBatchWriteBuilder().newCommit())
                        .withLock(localFactory.create())) {
            List<CommitMessage> fileCommittables =
                    aggregatedCommitInfo.stream()
```

### Deprecation
'withLock(org.apache.paimon.operation.Lock)' is deprecated
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/PaimonSinkWriter.java`
#### Snippet
```java
        try (BatchTableCommit tableCommit =
                ((InnerTableCommit) table.newBatchWriteBuilder().newCommit())
                        .withLock(Lock.emptyFactory().create())) {
            List<CommitMessage> commitables =
                    states.stream()
```

### Deprecation
'propagateIfPossible(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Throwable)' is deprecated
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/sink/TDengineSinkWriter.java`
#### Snippet
```java
            final int rowCount = statement.executeUpdate(sql);
            if (rowCount == 0) {
                Throwables.propagateIfPossible(
                        new TDengineConnectorException(
                                CommonErrorCode.SQL_OPERATION_FAILED, "insert error:" + element));
```

### Deprecation
'extractSubConfig(Config, java.lang.String, boolean)' is deprecated
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/config/SourceConfig.java`
#### Snippet
```java
            Config pluginConfig, SourceConfig sourceConfig) {
        Config sourceOptionConfig =
                TypesafeConfigUtils.extractSubConfig(
                        pluginConfig, STARROCKS_SCAN_CONFIG_PREFIX.key(), false);
        sourceOptionConfig
```

### Deprecation
'SRC_FIELD' is deprecated
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransformFactory.java`
#### Snippet
```java
    public OptionRule optionRule() {
        return OptionRule.builder()
                .bundled(CopyTransformConfig.SRC_FIELD, CopyTransformConfig.DEST_FIELD)
                .bundled(CopyTransformConfig.FIELDS)
                .build();
```

### Deprecation
'DEST_FIELD' is deprecated
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransformFactory.java`
#### Snippet
```java
    public OptionRule optionRule() {
        return OptionRule.builder()
                .bundled(CopyTransformConfig.SRC_FIELD, CopyTransformConfig.DEST_FIELD)
                .bundled(CopyTransformConfig.FIELDS)
                .build();
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            // todo: if the index doesn't exist, the response status code is 200?
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return;
            } else {
                throw new ElasticsearchConnectorException(
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
                                                plugin.factoryIdentifier()),
                                        plugin.optionRule());
                        return;
                    }
                });
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`config.get(ReplaceTransformConfig.KEY_IS_REGEX) == null
? false
: config.get(ReplaceTransformConfig.KEY_IS_REGEX)` can be simplified to 'config.get(ReplaceTransformConfig.KEY_IS_REGEX)!=null \&\& config.get(ReplaceTransformConfig.KEY_IS_REGEX)'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/replace/ReplaceTransform.java`
#### Snippet
```java

        boolean isRegex =
                config.get(ReplaceTransformConfig.KEY_IS_REGEX) == null
                        ? false
                        : config.get(ReplaceTransformConfig.KEY_IS_REGEX);
```

## RuleId[id=TrivialStringConcatenation]
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
                        String.format(
                                "Restore time %s, pipeline %s",
                                pipelineRestoreNum + "", pipelineFullName));
                // We must ensure the scheduler complete and then can handle pipeline state change.
                if (jobMaster.getScheduleFuture() != null) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
        if ((jobStatus == JobStatus.FINISHED || jobStatus == JobStatus.CANCELED)
                && !isSavePointEnd()) {
            checkpointStorage.deleteCheckpoint(jobId + "");
        }
        return CompletableFuture.completedFuture(null);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                        i++) {
                    needDeleteCheckpointId.add(
                            completedCheckpoints.removeFirst().getCheckpointId() + "");
                }
                checkpointStorage.deleteCheckpoint(
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
        if (identifierPart.charAt(0) != quotingChar
                && identifierPart.charAt(identifierPart.length() - 1) != quotingChar) {
            identifierPart = identifierPart.replace(quotingChar + "", repeat(quotingChar));
            identifierPart = quotingChar + identifierPart + quotingChar;
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
                            .get(0)
                            .getName();
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
        }
        return new PartitionParameter(
                keyColumn, Long.parseLong(minKey + ""), Long.parseLong(maxKey + ""));
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
        }
        return new PartitionParameter(
                keyColumn, Long.parseLong(minKey + ""), Long.parseLong(maxKey + ""));
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
            KuduPredicate lowerPred =
                    KuduPredicate.newComparisonPredicate(
                            schema.getColumn("" + keyColumn),
                            KuduPredicate.ComparisonOp.GREATER_EQUAL,
                            lowerBound);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
            KuduPredicate upperPred =
                    KuduPredicate.newComparisonPredicate(
                            schema.getColumn("" + keyColumn),
                            KuduPredicate.ComparisonOp.LESS,
                            upperBound);
```

## RuleId[id=SillyAssignment]
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

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                sortedLogicalEdges,
                (o1, o2) -> {
                    if (o1.getInputVertexId() != o2.getInputVertexId()) {
                        return o1.getInputVertexId() > o2.getInputVertexId() ? 1 : -1;
                    }
```

### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                        return o1.getInputVertexId() > o2.getInputVertexId() ? 1 : -1;
                    }
                    if (o1.getTargetVertexId() != o2.getTargetVertexId()) {
                        return o1.getTargetVertexId() > o2.getTargetVertexId() ? 1 : -1;
                    }
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqBaseConfiguration.java`
#### Snippet
```java
        RocketMqBaseConfiguration that = (RocketMqBaseConfiguration) o;
        return aclEnable == that.aclEnable
                && batchSize == that.batchSize
                && pollTimeoutMillis == that.pollTimeoutMillis
                && maxMessageSize == that.maxMessageSize
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqBaseConfiguration.java`
#### Snippet
```java
        return aclEnable == that.aclEnable
                && batchSize == that.batchSize
                && pollTimeoutMillis == that.pollTimeoutMillis
                && maxMessageSize == that.maxMessageSize
                && sendMsgTimeout == that.sendMsgTimeout
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqBaseConfiguration.java`
#### Snippet
```java
                && batchSize == that.batchSize
                && pollTimeoutMillis == that.pollTimeoutMillis
                && maxMessageSize == that.maxMessageSize
                && sendMsgTimeout == that.sendMsgTimeout
                && Objects.equals(namesrvAddr, that.namesrvAddr)
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqBaseConfiguration.java`
#### Snippet
```java
                && pollTimeoutMillis == that.pollTimeoutMillis
                && maxMessageSize == that.maxMessageSize
                && sendMsgTimeout == that.sendMsgTimeout
                && Objects.equals(namesrvAddr, that.namesrvAddr)
                && Objects.equals(groupId, that.groupId)
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/job/JobResult.java`
#### Snippet
```java
public class JobResult implements Serializable {

    @NonNull private JobStatus status;

    private String error;
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/serializable/RecordSerializer.java`
#### Snippet
```java

    @Override
    public void write(ObjectDataOutput out, Record record) throws IOException {
        Object data = record.getData();
        if (data instanceof CheckpointBarrier) {
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/serializable/RecordSerializer.java`
#### Snippet
```java

    @Override
    public Record read(ObjectDataInput in) throws IOException {
        Object data;
        byte dataType = in.readByte();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java

    @Override
    public Boolean get(long timeout, TimeUnit unit) throws InterruptedException {
        if (success) {
            return true;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/common/StorageThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(group, runnable, namePrefix + threadNumber.getAndIncrement(), 0);
        if (thread.isDaemon()) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkWriterCommitMessage.java`
#### Snippet
```java
public class SparkWriterCommitMessage<T> implements WriterCommitMessage {

    private @Nullable T message;

    SparkWriterCommitMessage(T message) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriter.java`
#### Snippet
```java
    private final SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter;

    @Nullable private final SinkCommitter<CommitInfoT> sinkCommitter;
    private final RowConverter<InternalRow> rowConverter;
    private CommitInfoT latestCommitInfoT;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataSourceWriter.java`
#### Snippet
```java
    protected final SeaTunnelSink<SeaTunnelRow, StateT, CommitInfoT, AggregatedCommitInfoT> sink;

    @Nullable protected final SinkAggregatedCommitter<CommitInfoT, AggregatedCommitInfoT>
            sinkAggregatedCommitter;

```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkWriterCommitMessage.java`
#### Snippet
```java
    }

    public T getMessage() {
        return message;
    }
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkWriterCommitMessage.java`
#### Snippet
```java
    private @Nullable T message;

    SeaTunnelSparkWriterCommitMessage(T message) {
        this.message = message;
    }
```

### NullableProblems
Setter parameter for @Nullable field might be annotated @Nullable itself
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkWriterCommitMessage.java`
#### Snippet
```java
    }

    public void setMessage(T message) {
        this.message = message;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java

    @Override
    public int compareTo(TableId that) {
        if (this == that) {
            return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/offset/BinlogOffset.java`
#### Snippet
```java
     */
    @Override
    public int compareTo(Offset offset) {
        BinlogOffset that = (BinlogOffset) offset;
        // the NO_STOPPING_OFFSET is the max offset
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/offset/LsnOffset.java`
#### Snippet
```java
    }

    public int compareTo(Offset o) {
        LsnOffset that = (LsnOffset) o;
        final int comparison = getCommitLsn().compareTo(that.getCommitLsn());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
    }

    public synchronized int read(byte[] buf, int off, int len) throws IOException {
        if (closed) {
            throw new IOException(E_STREAM_CLOSED);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
public class JdbcOutputFormatBuilder {
    @NonNull private final JdbcDialect dialect;
    @NonNull private final JdbcConnectionProvider connectionProvider;
    @NonNull private final JdbcSinkConfig jdbcSinkConfig;
    @NonNull private final SeaTunnelRowType seaTunnelRowType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
@RequiredArgsConstructor
public class JdbcOutputFormatBuilder {
    @NonNull private final JdbcDialect dialect;
    @NonNull private final JdbcConnectionProvider connectionProvider;
    @NonNull private final JdbcSinkConfig jdbcSinkConfig;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
    @NonNull private final JdbcConnectionProvider connectionProvider;
    @NonNull private final JdbcSinkConfig jdbcSinkConfig;
    @NonNull private final SeaTunnelRowType seaTunnelRowType;

    public JdbcOutputFormat build() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
    @NonNull private final JdbcDialect dialect;
    @NonNull private final JdbcConnectionProvider connectionProvider;
    @NonNull private final JdbcSinkConfig jdbcSinkConfig;
    @NonNull private final SeaTunnelRowType seaTunnelRowType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final StatementFactory statementFactory;
    @NonNull private final SeaTunnelRowType rowType;
    @NonNull private final JdbcRowConverter converter;
    private transient PreparedStatement statement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
public class SimpleBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final StatementFactory statementFactory;
    @NonNull private final SeaTunnelRowType rowType;
    @NonNull private final JdbcRowConverter converter;
    private transient PreparedStatement statement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class SimpleBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final StatementFactory statementFactory;
    @NonNull private final SeaTunnelRowType rowType;
    @NonNull private final JdbcRowConverter converter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    private final StatementFactory existStmtFactory;
    @NonNull private final StatementFactory insertStmtFactory;
    @NonNull private final StatementFactory updateStmtFactory;
    private final SeaTunnelRowType keyRowType;
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final SeaTunnelRowType valueRowType;
    @NonNull private final JdbcRowConverter rowConverter;
    private transient PreparedStatement existStatement;
    private transient PreparedStatement insertStatement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    private final SeaTunnelRowType keyRowType;
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final SeaTunnelRowType valueRowType;
    @NonNull private final JdbcRowConverter rowConverter;
    private transient PreparedStatement existStatement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
        implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    private final StatementFactory existStmtFactory;
    @NonNull private final StatementFactory insertStmtFactory;
    @NonNull private final StatementFactory updateStmtFactory;
    private final SeaTunnelRowType keyRowType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;

    @NonNull private final LinkedHashMap<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> buffer =
            new LinkedHashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
public class BufferReducedBatchStatementExecutor
        implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> upsertExecutor;
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> upsertExecutor;
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
        implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> upsertExecutor;
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/BufferReducedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;

    @NonNull private final LinkedHashMap<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> buffer =
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/RecordStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] buff) throws IOException {
        try {
            return recordBuffer.read(buff);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/client/InfluxDBClient.java`
#### Snippet
```java
                new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        HttpUrl httpUrl =
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/client/InfluxDBClient.java`
#### Snippet
```java
                new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        HttpUrl httpUrl =
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
public class SimpleBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final StatementFactory statementFactory;
    @NonNull private final JdbcRowConverter converter;
    private transient PreparedStatement statement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class SimpleBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final StatementFactory statementFactory;
    @NonNull private final JdbcRowConverter converter;
    private transient PreparedStatement statement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final JdbcBatchStatementExecutor statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/BufferedBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final JdbcBatchStatementExecutor statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
public class InsertOrUpdateBatchStatementExecutor implements JdbcBatchStatementExecutor {
    private final StatementFactory existStmtFactory;
    @NonNull private final StatementFactory insertStmtFactory;
    @NonNull private final StatementFactory updateStmtFactory;
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    private final JdbcRowConverter keyRowConverter;
    @NonNull private final JdbcRowConverter valueRowConverter;
    private transient PreparedStatement existStatement;
    private transient PreparedStatement insertStatement;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/InsertOrUpdateBatchStatementExecutor.java`
#### Snippet
```java
    private final StatementFactory existStmtFactory;
    @NonNull private final StatementFactory insertStmtFactory;
    @NonNull private final StatementFactory updateStmtFactory;
    private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    private final JdbcRowConverter keyRowConverter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor insertOrUpdateExecutor;
    @NonNull private final JdbcBatchStatementExecutor deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    private boolean ignoreUpdateBefore;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
public class ReduceBufferedBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final JdbcBatchStatementExecutor insertOrUpdateExecutor;
    @NonNull private final JdbcBatchStatementExecutor deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
    private boolean ignoreUpdateBefore;

    @NonNull private final LinkedHashMap<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> buffer =
            new LinkedHashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
@RequiredArgsConstructor
public class ReduceBufferedBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final JdbcBatchStatementExecutor insertOrUpdateExecutor;
    @NonNull private final JdbcBatchStatementExecutor deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
    @NonNull private final JdbcBatchStatementExecutor deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    private boolean ignoreUpdateBefore;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, namePrefix + threadNumber.getAndIncrement());
            t.setDaemon(false);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/common/S3Configuration.java`
#### Snippet
```java
 *
 * <p>eg: if you want to set the endpoint, you can set it in the config like this:
 * config.put("fs.s3a.endpoint", "http://), the prefix is fs.s3a and must be the same as the hadoop
 * configuration
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/common/S3Configuration.java`
#### Snippet
```java
 *
 * <p>more information about the configuration, please refer to the official website:
 * https://hadoop.apache.org/docs/current/hadoop-aws/tools/hadoop-aws/index.html
 */
public class S3Configuration extends AbstractConfiguration {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/JdbcSourceConfigFactory.java`
#### Snippet
```java
     * The session time zone in database server, e.g. "America/Los_Angeles". It controls how the
     * TIMESTAMP type converted to STRING. See more
     * https://debezium.io/documentation/reference/1.5/connectors/mysql.html#mysql-temporal-types
     */
    public JdbcSourceConfigFactory serverTimeZone(String timeZone) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/config/S3Config.java`
#### Snippet
```java
     * and refer to this:
     *
     * <p>https://hadoop.apache.org/docs/stable/hadoop-aws/tools/hadoop-aws/index.html
     *
     * <p>such as: key = "fs.s3a.session.token" value = "SECRET-SESSION-TOKEN"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
     *
     * @link
     *     https://docs.microsoft.com/en-us/sql/connect/jdbc/using-adaptive-buffering?view=sql-server-2017#guidelines-for-using-adaptive-buffering
     */
    private final SqlServerConnection metadataConnection;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/config/SourceConfig.java`
#### Snippet
```java
 *
 * <p>please see the following link for more details:
 * https://iotdb.apache.org/UserGuide/Master/API/Programming-Java-Native-API.html
 */
public class SourceConfig {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksSinkOP.java`
#### Snippet
```java
/**
 * Reference
 * https://github.com/StarRocks/starrocks/blob/main/docs/loading/Load_to_Primary_Key_tables.md#upsert-and-delete
 */
public enum StarRocksSinkOP {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    private final TaskGroupDefaultImpl taskGroup;

    private final ExecutorService executorService;

    private final FlakeIdGenerator flakeIdGenerator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelHealthMonitor.java`
#### Snippet
```java
    private final ILogger logger;
    private final Node node;
    private final HealthMonitorLevel monitorLevel;
    private final int thresholdMemoryPercentage;
    private final int thresholdCPUPercentage;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelHealthMonitor.java`
#### Snippet
```java
    private static final double THRESHOLD_INVOCATIONS = 1000;

    private final ILogger logger;
    private final Node node;
    private final HealthMonitorLevel monitorLevel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
        private Thread myThread;
        public LinkedBlockingDeque<TaskTracker> taskqueue;
        private Future<?> thisTaskFuture;
        private BlockingQueue<Future<?>> futureBlockingQueue;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
        public AtomicReference<TaskTracker> exclusiveTaskTracker = new AtomicReference<>();
        final TaskCallTimer timer;
        private Thread myThread;
        public LinkedBlockingDeque<TaskTracker> taskqueue;
        private Future<?> thisTaskFuture;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java
    private transient SeaTunnelSourceCollector<T> collector;

    private transient Object checkpointLock;

    public SourceSeaTunnelTask(long jobID, TaskLocation taskID, int indexID, Flow executionFlow) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java
    private static final ILogger LOGGER = Logger.getLogger(SourceSeaTunnelTask.class);

    private transient SeaTunnelSourceCollector<T> collector;

    private transient Object checkpointLock;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java

    // TODO add config to change value
    private boolean isPhysicalDAGIInfo = true;

    private final EngineConfig engineConfig;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java
public class IMapCheckpointIDCounter implements CheckpointIDCounter {

    private final Long jobID;
    private final Integer pipelineId;
    private final String key;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java

    private final Long jobID;
    private final Integer pipelineId;
    private final String key;
    private final IMap<String, Long> checkpointIdMap;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
    private final JobMaster jobMaster;

    private final ExecutorService executorService;

    public CheckpointManager(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/common/StorageThreadFactory.java`
#### Snippet
```java

public class StorageThreadFactory implements ThreadFactory {
    private final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonSerializationSchema.java`
#### Snippet
```java

    /** RowType to generate the runtime converter. */
    private final SeaTunnelRowType rowType;

    /** Reusable object node. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java

    /** Flag indicating whether to fail if a field is missing. */
    private final boolean failOnMissingField;

    /** Flag indicating whether to ignore invalid fields/rows (default: throw an exception). */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/IMapFileStorage.java`
#### Snippet
```java
    public static final long DEFAULT_WRITE_DATA_TIMEOUT_MILLISECONDS = 1000 * 60;

    private Configuration conf;

    private FileConfiguration fileConfiguration;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/SeaTunnelSinkTable.java`
#### Snippet
```java
    private static final String SINK_TABLE_NAME = "SeaTunnelSinkTable";

    private final Map<String, String> properties;

    private final SeaTunnelSink<SeaTunnelRow, ?, ?, ?> sink;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/SeaTunnelMicroBatchPartitionReaderFactory.java`
#### Snippet
```java
    private final String checkpointLocation;

    private final CaseInsensitiveStringMap caseInsensitiveStringMap;

    public SeaTunnelMicroBatchPartitionReaderFactory(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceReader.java`
#### Snippet
```java
    private final int subtaskId;

    private final C sourceConfig;

    public IncrementalSourceReader(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/DeserializeFormat.java`
#### Snippet
```java
    COMPATIBLE_DEBEZIUM_JSON(CompatibleDebeziumJsonDeserializationSchema.IDENTIFIER);

    private String name;

    DeserializeFormat(String name) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotFetchTask.java`
#### Snippet
```java
    private volatile boolean taskRunning = false;

    private MySqlSnapshotSplitReadTask snapshotSplitReadTask;

    public MySqlSnapshotFetchTask(SnapshotSplit split) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
    private SnapshotChangeEventSourceMetrics snapshotChangeEventSourceMetrics;
    private MySqlStreamingChangeEventSourceMetrics streamingChangeEventSourceMetrics;
    private TopicSelector<TableId> topicSelector;
    private JdbcSourceEventDispatcher dispatcher;
    private ChangeEventQueue<DataChangeEvent> queue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerDialect.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private final SourceConfig sourceConfig;

    private transient SqlServerSchema sqlServerSchema;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
#### Snippet
```java
    private SqlServerDatabaseSchema databaseSchema;
    private SqlServerOffsetContext offsetContext;
    private TopicSelector<TableId> topicSelector;
    private JdbcSourceEventDispatcher dispatcher;
    private ChangeEventQueue<DataChangeEvent> queue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/scan/SqlServerSnapshotFetchTask.java`
#### Snippet
```java
    private volatile boolean taskRunning = false;

    private SqlServerSnapshotSplitReadTask snapshotSplitReadTask;

    public SqlServerSnapshotFetchTask(SnapshotSplit split) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
    private String dbName;
    private String tableName;
    private Table tableInformation;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
@AutoService(SeaTunnelSource.class)
public class HiveSource extends BaseHdfsFileSource {
    private Table tableInformation;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkWriter.java`
#### Snippet
```java
    private final JdbcOutputFormat<SeaTunnelRow, JdbcBatchStatementExecutor<SeaTunnelRow>>
            outputFormat;
    private final SinkWriter.Context context;
    private final JdbcConnectionProvider connectionProvider;
    private transient boolean isOpen;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSource.java`
#### Snippet
```java
    private String confFiles;

    private boolean useKerberos = false;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/source/HudiSource.java`
#### Snippet
```java
    private SeaTunnelRowType typeInfo;

    private String filePath;

    private String tablePath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkCommitter.java`
#### Snippet
```java

public class JdbcSinkCommitter implements SinkCommitter<XidInfo> {
    private final XaFacade xaFacade;
    private final XaGroupOps xaGroupOps;
    private final JdbcConnectionConfig jdbcConnectionConfig;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/config/JdbcConnectionConfig.java`
#### Snippet
```java
        private String username;
        private String password;
        private String query;
        private boolean autoCommit = JdbcOptions.AUTO_COMMIT.defaultValue();
        private int batchSize = JdbcOptions.BATCH_SIZE.defaultValue();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplitEnumerator.java`
#### Snippet
```java
    private volatile boolean shouldEnumerate;

    private JdbcSourceConfig jdbcSourceConfig;
    private final PartitionParameter partitionParameter;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/sqlserver/SqlServerType.java`
#### Snippet
```java
    private final String name;
    private final int jdbcType;
    private final Class<?> javaClass;
    private final boolean isDecimal;
    private final boolean hasLength;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
    private KuduSinkConfig kuduSinkConfig;

    public KuduSinkWriter(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java

    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
    private KuduSinkConfig kuduSinkConfig;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java
public class KuduSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {

    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/sink/HbaseSink.java`
#### Snippet
```java
public class HbaseSink extends AbstractSimpleSink<SeaTunnelRow, Void> {

    private Config pluginConfig;

    private SeaTunnelRowType seaTunnelRowType;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
public class EmailSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {

    private final SeaTunnelRowType seaTunnelRowType;
    private EmailSinkConfig config;
    private StringBuffer stringBuffer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/sink/HbaseSinkWriter.java`
#### Snippet
```java
    private static final String ALL_COLUMNS = "all_columns";

    private final Configuration hbaseConfiguration = HBaseConfiguration.create();

    private final Connection hbaseConnection;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkCommitter.java`
#### Snippet
```java
public class KafkaSinkCommitter implements SinkCommitter<KafkaCommitInfo> {

    private final ReadonlyConfig pluginConfig;

    private KafkaInternalProducer<?, ?> kafkaProducer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
    private String transactionPrefix;
    private long lastCheckpointId = 0;
    private SeaTunnelRowType seaTunnelRowType;

    private final KafkaProduceSender<byte[], byte[]> kafkaProducerSender;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
public class KafkaSinkWriter implements SinkWriter<SeaTunnelRow, KafkaCommitInfo, KafkaSinkState> {

    private final SinkWriter.Context context;

    private String transactionPrefix;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-redis/src/main/java/org/apache/seatunnel/connectors/seatunnel/redis/sink/RedisSink.java`
#### Snippet
```java
    private final RedisParameters redisParameters = new RedisParameters();
    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-slack/src/main/java/org/apache/seatunnel/connectors/seatunnel/slack/sink/SlackWriter.java`
#### Snippet
```java
    private final String conversationId;
    private final SlackClient slackClient;
    private final SeaTunnelRowType seaTunnelRowType;
    private static final long POST_MSG_WAITING_TIME = 1500L;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/PaimonSink.java`
#### Snippet
```java
    private SeaTunnelRowType seaTunnelRowType;

    private Config pluginConfig;

    private Table table;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/source/PaimonSource.java`
#### Snippet
```java
    public static final String PLUGIN_NAME = "Paimon";

    private Config pluginConfig;

    private SeaTunnelRowType seaTunnelRowType;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketSinkWriter.java`
#### Snippet
```java
public class SocketSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {
    private final SocketClient socketClient;
    private final SerializationSchema serializationSchema;
    private final SinkConfig sinkConfig;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketSinkWriter.java`
#### Snippet
```java
    private final SocketClient socketClient;
    private final SerializationSchema serializationSchema;
    private final SinkConfig sinkConfig;

    SocketSinkWriter(SinkConfig sinkConfig, SeaTunnelRowType seaTunnelRowType) throws IOException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketSink.java`
#### Snippet
```java
@AutoService(SeaTunnelSink.class)
public class SocketSink extends AbstractSimpleSink<SeaTunnelRow, Void> {
    private Config pluginConfig;
    private SinkConfig sinkConfig;
    private SeaTunnelRowType seaTunnelRowType;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java
    private final SingleSplitReaderContext context;
    private Socket socket;
    private final String delimiter = "\n";

    SocketSourceReader(SocketSourceParameter parameter, SingleSplitReaderContext context) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/sink/MongodbWriter.java`
#### Snippet
```java
    private volatile long lastSendTime = 0L;

    private final SinkWriter.Context context;

    public MongodbWriter(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/sink/InfluxDBSinkWriter.java`
#### Snippet
```java
    private ScheduledFuture<?> scheduledFuture;
    private volatile Exception flushException;
    private final Integer batchIntervalMs;

    public InfluxDBSinkWriter(Config pluginConfig, SeaTunnelRowType seaTunnelRowType)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/serialize/DefaultSerializer.java`
#### Snippet
```java

public class DefaultSerializer implements Serializer {
    private final SeaTunnelRowType seaTunnelRowType;

    private final BiConsumer<SeaTunnelRow, Point.Builder> timestampExtractor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/sink/RabbitmqSink.java`
#### Snippet
```java
public class RabbitmqSink extends AbstractSimpleSink<SeaTunnelRow, Void> {
    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private RabbitmqConfig rabbitMQConfig;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java
    private final DeserializationSchema<SeaTunnelRow> deserializationSchema;
    private RabbitmqClient rabbitMQClient;
    private DefaultConsumer consumer;
    private final RabbitmqConfig config;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/source/RocketMqConsumerThread.java`
#### Snippet
```java
public class RocketMqConsumerThread implements Runnable {
    private final DefaultLitePullConsumer consumer;
    private final ConsumerMetadata metadata;
    private final LinkedBlockingQueue<Consumer<DefaultLitePullConsumer>> tasks;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
public class StartRocksSourceSplitEnumerator
        implements SourceSplitEnumerator<StarRocksSourceSplit, StarRocksSourceState> {
    private SourceConfig sourceConfig;
    private StarRocksQueryPlanReadClient starRocksQueryPlanReadClient;
    private final Map<Integer, List<StarRocksSourceSplit>> pendingSplit;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
    private List<SeaTunnelRow> seaTunnelRowBatch = new ArrayList<>();
    private final ArrowStreamReader arrowStreamReader;
    private VectorSchemaRoot root;
    private List<FieldVector> fieldVectors;
    private RootAllocator rootAllocator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ShardRouter.java`
#### Snippet
```java
    private final TreeMap<Integer, Shard> shards;
    private final String shardKey;
    private final String shardKeyType;
    @Getter private final String sortingKey;
    private final boolean splitMode;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSinkWriter.java`
#### Snippet
```java
        implements SinkWriter<SeaTunnelRow, CKCommitInfo, ClickhouseSinkState> {

    private final Context context;
    private final ReaderOption option;
    private final ShardRouter shardRouter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
        implements SinkWriter<SeaTunnelRow, ElasticsearchCommitInfo, ElasticsearchSinkState> {

    private final SinkWriter.Context context;

    private final int maxBatchSize;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    boolean noMoreSplit;

    private final long pollNextWaitTime = 1000L;

    public ElasticsearchSourceReader(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/impl/VariableIndexSerializer.java`
#### Snippet
```java
    private final Map<String, Integer> fieldIndexMap;

    private final String nullDefault = "null";

    public VariableIndexSerializer(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/source/SheetsSourceReader.java`
#### Snippet
```java
    private SheetsParameters sheetsParameters;

    private SeaTunnelRowType seaTunnelRowType;

    private HttpRequestInitializer requestInitializer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/RecordBuffer.java`
#### Snippet
```java
    private String fileName;
    private StringJoiner buffer;
    private String lineDelimiter;
    private int numOfRecords = 0;
    private long bufferSizeBytes = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBSinkWriter.java`
#### Snippet
```java
    private SelectDBStageLoad selectDBStageLoad;
    volatile boolean loading;
    private final String labelPrefix;
    private final byte[] lineDelimiter;
    private final LabelGenerator labelGenerator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBSinkWriter.java`
#### Snippet
```java
    volatile boolean loading;
    private final String labelPrefix;
    private final byte[] lineDelimiter;
    private final LabelGenerator labelGenerator;
    private final SelectDBSinkState selectdbSinkState;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final String username;
    private final String password;
    private final String db;
    private final String table;
    private final Properties stageLoadProps;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private AtomicInteger fileNum;
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
    private ArrayBlockingQueue<RecordBuffer> queue;
    private final AtomicBoolean started;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final String password;
    private final String db;
    private final String table;
    private final Properties stageLoadProps;
    private List<String> fileList = new CopyOnWriteArrayList();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final String db;
    private final String table;
    private final Properties stageLoadProps;
    private List<String> fileList = new CopyOnWriteArrayList();
    private RecordBuffer buffer;
```

## RuleId[id=IgnoreResultOfCall]
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
Result of `ExecutorService.awaitTermination()` is ignored
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new SeaTunnelEngineException("wait clean executor service error", e);
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java
            return true;
        }
        latch.await(1, TimeUnit.SECONDS);
        if (!success) {
            return false;
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java
            return true;
        }
        latch.await(timeout, unit);
        return success;
    }
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/serialization/CommitWrapperSerializer.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkWriterStateSerializer.java`
#### Snippet
```java
            final int size = in.readInt();
            final byte[] stateBytes = new byte[size];
            in.read(stateBytes);
            T stateT = serializer.deserialize(stateBytes);
            return new FlinkWriterState<>(checkpointId, stateT);
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
            // if file doesn't exist, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getName());
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.seatunnel.connectors.selectdb.util.HttpUtil.getHttpClient()' accessed via instance reference
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/committer/SelectDBCommitter.java`
#### Snippet
```java
                SelectDBConfig.loadConfig(pluginConfig),
                SelectDBConfig.loadConfig(pluginConfig).getMaxRetries(),
                new HttpUtil().getHttpClient());
    }

```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        if (StringUtils.isEmpty(tableIdentifier)) {
            String errMsg =
                    String.format(
                            ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE,
                            "table.identifier",
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        if (identifier.length != 2) {
            String errMsg =
                    String.format(
                            ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE,
                            "table.identifier",
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        if (StringUtils.isEmpty(feNodes)) {
            String errMsg =
                    String.format(ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE, "fenodes", feNodes);
            throw new DorisConnectorException(DorisConnectorErrorCode.REST_SERVICE_FAILED, errMsg);
        }
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
            logger.error(ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE, "beNodes", backends);
            String errMsg =
                    String.format(ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE, "beNodes", backends);
            throw new DorisConnectorException(DorisConnectorErrorCode.REST_SERVICE_FAILED, errMsg);
        }
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        if (StringUtils.isEmpty(feNodes)) {
            String errMsg =
                    String.format(ErrorMessages.ILLEGAL_ARGUMENT_MESSAGE, "fenodes", feNodes);
            throw new DorisConnectorException(DorisConnectorErrorCode.REST_SERVICE_FAILED, errMsg);
        }
```

### MalformedFormatString
Too few arguments for format string (found: 1, expected: 2)
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/typemapper/TDengineTypeMapper.java`
#### Snippet
```java
                throw new TDengineConnectorException(
                        CommonErrorCode.UNSUPPORTED_DATA_TYPE,
                        String.format(
                                "Doesn't support TDENGINE type '%s' on column '%s'  yet.",
                                tdengineType));
```

### MalformedFormatString
Too many arguments for format string (found: 3, expected: 0)
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
                        String result = entity == null ? null : EntityUtils.toString(entity);
                        String errMsg =
                                String.format(
                                        "Failed to get internalStage address, status {}, reason {}, response {}",
                                        statusCode,
```

## RuleId[id=RedundantMethodOverride]
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
Method `getConfiguration()` is identical to its super method
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ExcelReadStrategy.java`
#### Snippet
```java
    }

    Configuration getConfiguration() {
        return getConfiguration(hadoopConf);
    }
```

### RedundantMethodOverride
Method `quoteIdentifier()` is identical to its super method
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/oracle/OracleDialect.java`
#### Snippet
```java

    @Override
    public String quoteIdentifier(String identifier) {
        return identifier;
    }
```

### RedundantMethodOverride
Method `createAggregatedCommitter()` is identical to its super method
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/DorisSink.java`
#### Snippet
```java
    @Override
    public Optional<SinkAggregatedCommitter<DorisCommitInfo, DorisCommitInfo>>
            createAggregatedCommitter() throws IOException {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getAggregatedCommitInfoSerializer()` is identical to its super method
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/DorisSink.java`
#### Snippet
```java

    @Override
    public Optional<Serializer<DorisCommitInfo>> getAggregatedCommitInfoSerializer() {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `notifyCheckpointComplete()` is identical to its super method
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/source/CassandraSourceReader.java`
#### Snippet
```java

    @Override
    public void notifyCheckpointComplete(long checkpointId) throws Exception {}
}

```

### RedundantMethodOverride
Method `createAggregatedCommitter()` is identical to its super method
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/SelectDBSink.java`
#### Snippet
```java
    @Override
    public Optional<SinkAggregatedCommitter<SelectDBCommitInfo, SelectDBCommitInfo>>
            createAggregatedCommitter() throws IOException {
        return Optional.empty();
    }
```

### RedundantMethodOverride
Method `getAggregatedCommitInfoSerializer()` is identical to its super method
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/SelectDBSink.java`
#### Snippet
```java

    @Override
    public Optional<Serializer<SelectDBCommitInfo>> getAggregatedCommitInfoSerializer() {
        return Optional.empty();
    }
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/EscapeHandler.java`
#### Snippet
```java
public class EscapeHandler {
    public static final String ESCAPE_DELIMITERS_FLAGS = "\\x";
    public static final Pattern ESCAPE_PATTERN = Pattern.compile("\\\\x([0-9|a-f|A-F]{2})");
    public static final int RADIX = 16;

```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
sleepMs \* i: integer multiplication implicitly cast to long
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepMs * i);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

### IntegerMultiplicationImplicitCastToLong
(i + 1) \* splitRowNum: integer multiplication implicitly cast to long
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceSplitEnumerator.java`
#### Snippet
```java
        for (int i = 0; i < numReaders; i++) {
            int readerStart = i * splitRowNum;
            int readerEnd = (int) Math.min((i + 1) * splitRowNum, recordCount);
            for (int num = readerStart; num < readerEnd; num += splitRow) {
                allSplit.add(new MaxcomputeSourceSplit(num, Math.min(splitRow, readerEnd - num)));
```

## RuleId[id=ThrowFromFinallyBlock]
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

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaConsumerThread.java`
#### Snippet
```java
                consumer.close();
            } catch (Throwable t) {
                throw new KafkaConnectorException(KafkaConnectorErrorCode.CONSUMER_CLOSE_FAILED, t);
            }
        }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import lombok.Builder;`
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextSerializationSchema.java`
#### Snippet
```java
import org.apache.seatunnel.format.text.exception.SeaTunnelTextFormatException;

import lombok.Builder;
import lombok.NonNull;

```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/config/FileSinkConfig.java`
#### Snippet
```java
import static com.google.common.base.Preconditions.checkArgument;

@Data
public class FileSinkConfig extends BaseFileSinkConfig implements PartitionConfig {

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

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `untaredFiles` are updated, but never queried
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
                "Untaring {} to dir {}.", inputFile.getAbsolutePath(), outputDir.getAbsolutePath());

        final List<File> untaredFiles = new LinkedList<>();
        try (final InputStream is = new FileInputStream(inputFile);
                final TarArchiveInputStream debInputStream =
```

### MismatchedCollectionQueryUpdate
Contents of collection `pluginJars` are queried, but never updated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelTransformPluginDiscovery transformPluginDiscovery =
                new SeaTunnelTransformPluginDiscovery();
        List<URL> pluginJars = new ArrayList<>();
        List<SeaTunnelTransform> transforms =
                pluginConfigs.stream()
```

### MismatchedCollectionQueryUpdate
Contents of collection `tokens` are updated, but never queried
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
        // lastIndexOf takes last index it should look at, end - 1 not end
        int splitAt = s.lastIndexOf(ConfigParseOptions.PATH_TOKEN_SEPARATOR, end - 1);
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(Tokens.newUnquotedText(null, s));
        // this works even if splitAt is -1; then we start the substring at 0
```

### MismatchedCollectionQueryUpdate
Contents of collection `nodes` are queried, but never updated
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            boolean lastWasNewline = false;

            ArrayList<AbstractConfigNode> nodes = new ArrayList<>(n.children());
            List<String> comments = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `nodes` are queried, but never updated
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            boolean lastWasNewline = false;

            ArrayList<AbstractConfigNode> nodes = new ArrayList<>(n.children());
            List<String> comments = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `waitForCompleteBySubPlanList` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
        // TODO Determine which tasks do not need to be restored according to state
        CopyOnWriteArrayList<PassiveCompletableFuture<PipelineStatus>>
                waitForCompleteBySubPlanList = new CopyOnWriteArrayList<>();

        Map<Integer, CheckpointPlan> checkpointPlans = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `subtaskActions` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        private final Map<ActionStateKey, Integer> pipelineActions = new CopyOnWriteHashMap<>();

        private final Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions =
                new CopyOnWriteHashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineActions` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        private final Set<TaskLocation> pipelineSubtasks = new CopyOnWriteArraySet<>();
        private final Set<TaskLocation> startingSubtasks = new CopyOnWriteArraySet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new CopyOnWriteHashMap<>();

        private final Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions =
```

### MismatchedCollectionQueryUpdate
Contents of collection `startingSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new CopyOnWriteArraySet<>();
        private final Set<TaskLocation> startingSubtasks = new CopyOnWriteArraySet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new CopyOnWriteHashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java

    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new CopyOnWriteArraySet<>();
        private final Set<TaskLocation> startingSubtasks = new CopyOnWriteArraySet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new CopyOnWriteHashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `tableIdSet` are updated, but never queried
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerSchema.java`
#### Snippet
```java
    private TableChange readTableSchema(JdbcConnection jdbc, TableId tableId) {
        SqlServerConnection sqlServerConnection = (SqlServerConnection) jdbc;
        Set<TableId> tableIdSet = new HashSet<>();
        tableIdSet.add(tableId);

```

### MismatchedCollectionQueryUpdate
Contents of collection `dataMap` are updated, but never queried
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                }
            case MAP:
                HashMap<Object, Object> dataMap = new HashMap<>();
                TypeInfo keyTypeInfo = ((SimpleMapTypeInfo) typeInfo).getKeyTypeInfo();
                TypeInfo valueTypeInfo = ((SimpleMapTypeInfo) typeInfo).getValueTypeInfo();
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
            return Arrays.asList(currentChangeTables).stream()
                    .filter(x -> !x.getCaptureInstance().equals(captureName))
                    .collect(Collectors.toList())
                    .toArray(new SqlServerChangeTable[0]);
        }
```

### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/split/SplitTransform.java`
#### Snippet
```java
                                            fieldName, BasicType.STRING_TYPE, 200, true, "", "");
                                })
                        .collect(Collectors.toList());
        return collect.toArray(new Column[0]);
    }
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
            return this;
        } else if (this.originDescription != null
                && originDescription != null
                && this.originDescription.equals(originDescription)) {
            return this;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `objectNode` initializer `objectMapper.createObjectNode()` is redundant
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/JobMetrics.java`
#### Snippet
```java
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.metrics);
        } catch (JsonProcessingException e) {
            ObjectNode objectNode = objectMapper.createObjectNode();
            objectNode.put("err", "serialize JobMetrics err");
            return objectNode.toString();
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
                        (TarArchiveInputStream)
                                new ArchiveStreamFactory().createArchiveInputStream("tar", is)) {
            TarArchiveEntry entry = null;
            while ((entry = (TarArchiveEntry) debInputStream.getNextEntry()) != null) {
                final File outputFile = new File(outputDir, entry.getName());
```

### UnusedAssignment
Variable `upstreams` initializer `new ArrayList<>()` is redundant
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
public abstract class AbstractAction implements Action {
    private String name;
    private transient List<Action> upstreams = new ArrayList<>();
    // This is used to assign a unique ID to every Action
    private long id;
```

### UnusedAssignment
Variable `v` initializer `null` is redundant
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java

            for (AbstractConfigNode node : n.children()) {
                AbstractConfigValue v = null;
                if (node instanceof AbstractConfigNodeValue) {
                    v = parseValue((AbstractConfigNodeValue) node, null);
```

### UnusedAssignment
Variable `jobStatus` initializer `JobStatus.FAILING` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

                        if (finishedPipelineNum.incrementAndGet() == this.pipelineList.size()) {
                            JobStatus jobStatus = JobStatus.FAILING;
                            if (failedPipelineNum.get() > 0) {
                                jobStatus = JobStatus.FAILING;
```

### UnusedAssignment
Variable `pipelineStatus` initializer `null` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
                        if (finishedTaskNum.incrementAndGet()
                                == (physicalVertexList.size() + coordinatorVertexList.size())) {
                            PipelineStatus pipelineStatus = null;
                            if (failedTaskNum.get() > 0) {
                                pipelineStatus = PipelineStatus.FAILED;
```

### UnusedAssignment
Variable `objectNode` initializer `objectMapper.createObjectNode()` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
            } catch (JsonProcessingException e) {
                logger.severe("serialize jobStateMapper err", e);
                ObjectNode objectNode = objectMapper.createObjectNode();
                objectNode.put("err", "serialize jobStateMapper err");
                return objectNode.toString();
```

### UnusedAssignment
Variable `checkpointId` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
#### Snippet
```java
public class FlinkWriterState<StateT> implements Serializable {

    private long checkpointId = 0;

    private StateT state;
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        try (FSDataInputStream inputStream = fileSystem.open(hdfsPath);
                ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            int i = 0;
            final int defaultLen = 1024;
            byte[] buffer = new byte[defaultLen];
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
Variable `keyName` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlCreateTableSqlBuilder.java`
#### Snippet
```java
                                })
                        .collect(Collectors.joining(", "));
        String keyName = null;
        switch (constraintType) {
            case KEY:
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
        CheckResult checkResult =
```

### UnusedAssignment
Variable `columnslist` initializer `""` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
        String kudumaster = "";
        String tableName = "";
        String columnslist = "";
        CheckResult checkResult =
                CheckConfigUtil.checkAllExists(
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
Variable `kuduScanner` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
     */
    public KuduScanner getKuduBuildSplit(int lowerBound, int upperBound) {
        KuduScanner kuduScanner = null;
        try {
            KuduScanner.KuduScannerBuilder kuduScannerBuilder =
```

### UnusedAssignment
Variable `topicPartitionOffsets` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/source/RocketMqSourceSplitEnumerator.java`
#### Snippet
```java
    private void setPartitionStartOffset() throws MQClientException {
        Collection<MessageQueue> topicPartitions = pendingSplit.keySet();
        Map<MessageQueue, Long> topicPartitionOffsets = null;
        switch (metadata.getStartMode()) {
            case CONSUME_FROM_FIRST_OFFSET:
```

### UnusedAssignment
Variable `hasNext` initializer `false` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java

    public boolean hasNext() {
        boolean hasNext = false;
        // Arrow data was acquired synchronously during the iterative process
        if (!eos.get() && (rowBatch == null || !rowBatch.hasNext())) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java
        log.info("open Scan params.keep-alive-min {} min", params.getKeep_alive_min());
        log.info("open Scan params.batch_size {}", params.getBatch_size());
        TScanOpenResult result = null;
        try {
            result = client.open_scanner(params);
```

### UnusedAssignment
Variable `flag` initializer `false` is redundant
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/RedshiftJdbcClient.java`
#### Snippet
```java

    public boolean checkTableExists(String tableName) {
        boolean flag = false;
        try {
            DatabaseMetaData meta = connection.getMetaData();
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkAbstractPluginExecuteProcessor.java`
#### Snippet
```java
                if (classLoader.getClass().getName().endsWith("SafetyNetWrapperClassLoader")) {
                    URLClassLoader c =
                            (URLClassLoader) ReflectionUtils.getField(classLoader, "inner").get();
                    ReflectionUtils.invoke(c, "addURL", url);
                } else if (classLoader instanceof URLClassLoader) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/DAGUtils.java`
#### Snippet
```java
                                                                                                .getId()))
                                                        .findFirst()
                                                        .get()
                                                        .getId();
                                            },
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java
        this.completableFuture = new CompletableFuture<>();
        this.aggregatedCommitInfoSerializer =
                sink.getSink().getAggregatedCommitInfoSerializer().get();
        log.debug(
                "starting seatunnel sink aggregated committer task, sink name[{}] ",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
                                            Schema.class,
                                            Object.class)
                                    .get();
                }
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
                                            Schema.class,
                                            Object.class)
                                    .get();
                }
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/ParallelBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/batch/ParallelBatchPartitionReader.java`
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
        Object producerIdAndEpoch =
                ReflectionUtils.getField(transactionManager, PRODUCER_ID_AND_EPOCH_FIELD_NAME)
                        .get();
        return (long) ReflectionUtils.getField(producerIdAndEpoch, "producerId").get();
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
                ReflectionUtils.getField(transactionManager, PRODUCER_ID_AND_EPOCH_FIELD_NAME)
                        .get();
        return (long) ReflectionUtils.getField(producerIdAndEpoch, "producerId").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Optional<Object> producerIdAndEpoch =
                ReflectionUtils.getField(transactionManager, PRODUCER_ID_AND_EPOCH_FIELD_NAME);
        return (short) ReflectionUtils.getField(producerIdAndEpoch.get(), "epoch").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        Optional<Object> producerIdAndEpoch =
                ReflectionUtils.getField(transactionManager, PRODUCER_ID_AND_EPOCH_FIELD_NAME);
        return (short) ReflectionUtils.getField(producerIdAndEpoch.get(), "epoch").get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
                                    transactionManager.getClass(),
                                    "topicPartitionBookkeeper")
                            .get();

            transitionTransactionManagerStateTo(transactionManager, "INITIALIZING");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/shard/Shard.java`
#### Snippet
```java
                + node.getAddress().getPort()
                + "/"
                + node.getDatabase().get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
                                            ClickhouseTable shardTable =
                                                    proxy.getClickhouseTable(
                                                            shard.getNode().getDatabase().get(),
                                                            clickhouseTable.getLocalTableName());
                                            return shardTable.getDataPaths();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
                        credentialsProvider.setCredentials(
                                AuthScope.ANY,
                                new UsernamePasswordCredentials(username.get(), password.get()));
                        httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `count > 1` is always `true`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
                    getOptionKeys(exclusiveRequiredOptions.getExclusiveOptions()));
        }
        if (count > 1) {
            throw new OptionValidationException(
                    "These options(%s) are mutually exclusive, allowing only one set(\"[] for a set\") of options to be configured.",
```

### ConstantValue
Value `n` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            if (n instanceof ConfigNodeSimpleValue) {
                v = ((ConfigNodeSimpleValue) n).value();
            } else if (n instanceof ConfigNodeObject) {

                Path path = pathStack.peekFirst();
```

### ConstantValue
Value `n` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                }

            } else if (n instanceof ConfigNodeArray) {
                v = parseArray((ConfigNodeArray) n);
            } else if (n instanceof ConfigNodeConcatenation) {
```

### ConstantValue
Value `n` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            } else if (n instanceof ConfigNodeArray) {
                v = parseArray((ConfigNodeArray) n);
            } else if (n instanceof ConfigNodeConcatenation) {
                v = parseConcatenation((ConfigNodeConcatenation) n);
            } else {
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    comments.add(((ConfigNodeComment) node).commentText());
                    lastWasNewLine = false;
                } else if (node instanceof ConfigNodeSingleToken) {
                    Token t = ((ConfigNodeSingleToken) node).token();
                    if (Tokens.isNewline(t)) {
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                        lastWasNewLine = true;
                    }
                } else if (node instanceof ConfigNodeComplexValue) {
                    result = parseValue((ConfigNodeComplexValue) node, comments);
                    lastWasNewLine = false;
```

### ConstantValue
Value `result` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                }
            }
            return result;
        }
    }
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    lastWasNewline = false;
                    comments.add(((ConfigNodeComment) node).commentText());
                } else if (node instanceof ConfigNodeSingleToken
                        && Tokens.isNewline(((ConfigNodeSingleToken) node).token())) {
                    lineNumber++;
```

### ConstantValue
Condition `flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude` is always `false`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    }
                    lastWasNewline = true;
                } else if (flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude) {
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    }
                    lastWasNewline = true;
                } else if (flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude) {
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
                } else if (node instanceof ConfigNodeField) {
                    lastWasNewline = false;
                    Path path = ((ConfigNodeField) node).path().value();
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    comments.add(((ConfigNodeComment) node).commentText());
                    lastWasNewLine = false;
                } else if (node instanceof ConfigNodeSingleToken
                        && Tokens.isNewline(((ConfigNodeSingleToken) node).token())) {
                    lineNumber++;
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    }
                    lastWasNewLine = true;
                } else if (node instanceof AbstractConfigNodeValue) {
                    lastWasNewLine = false;
                    if (v != null) {
```

### ConstantValue
Condition `v != null` is always `false`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            }
            // There shouldn't be any comments at this point, but add them just in case
            if (v != null) {
                values.add(v.withOrigin(v.origin().appendComments(new ArrayList<>(comments))));
            }
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    lastWasNewline = false;
                    comments.add(((ConfigNodeComment) node).commentText());
                } else if (node instanceof ConfigNodeSingleToken
                        && Tokens.isNewline(((ConfigNodeSingleToken) node).token())) {
                    lineNumber++;
```

### ConstantValue
Condition `flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude` is always `false`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    }
                    lastWasNewline = true;
                } else if (flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude) {
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    }
                    lastWasNewline = true;
                } else if (flavor != ConfigSyntax.JSON && node instanceof ConfigNodeInclude) {
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
```

### ConstantValue
Value `node` is always 'null'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    parseInclude(values, (ConfigNodeInclude) node);
                    lastWasNewline = false;
                } else if (node instanceof ConfigNodeField) {
                    lastWasNewline = false;
                    Path path = ((ConfigNodeField) node).path().value();
```

### ConstantValue
Method reference result is always 'true'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                    physicalPlan.getPipelineList().stream()
                            .map(this::schedulerPipeline)
                            .filter(Objects::nonNull)
                            .collect(Collectors.toList());
            try {
```

### ConstantValue
Value `success` is always 'true'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java
            return false;
        }
        return success;
    }

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
Condition `created` is always `true`
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
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
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
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
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
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
                }
                for (int i = 0; i < dirEntries.length; ++i) {
                    delete(channel, new Path(absolute, dirEntries[i].getPath()), recursive);
                }
            }
```

### ConstantValue
Value `DORIS_DESERIALIZE_ARROW_ASYNC_DEFAULT` is always 'false'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/config/DorisConfig.java`
#### Snippet
```java
            Options.key("doris.deserialize.arrow.async")
                    .booleanType()
                    .defaultValue(DORIS_DESERIALIZE_ARROW_ASYNC_DEFAULT)
                    .withDescription("");
    public static final Option<Integer> DORIS_DESERIALIZE_QUEUE_SIZE =
```

### ConstantValue
Condition `response != null` is always `true`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/committer/DorisCommitter.java`
#### Snippet
```java

        ObjectMapper mapper = new ObjectMapper();
        if (response != null && response.getEntity() != null) {
            String loadResult = EntityUtils.toString(response.getEntity());
            Map<String, String> res =
```

### ConstantValue
Condition `response == null` is always `false`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
                                    logger);
                }
                if (response == null) {
                    logger.warn(
                            "Failed to get response from Doris FE {}, http code is {}",
```

### ConstantValue
Condition `discoveryIntervalMillis > 0` is always `true`
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/source/RocketMqSourceSplitEnumerator.java`
#### Snippet
```java
                        ? discoveryIntervalMillis
                        : DEFAULT_DISCOVERY_INTERVAL_MILLIS;
        if (discoveryIntervalMillis > 0) {
            this.executor =
                    Executors.newScheduledThreadPool(
```

### ConstantValue
Condition `Objects.isNull(consumer)` is always `true`
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqAdminUtil.java`
#### Snippet
```java
            RocketMqBaseConfiguration config, boolean autoCommit) {
        DefaultLitePullConsumer consumer = null;
        if (Objects.isNull(consumer)) {
            if (StringUtils.isBlank(config.getAccessKey())
                    && StringUtils.isBlank(config.getSecretKey())) {
```

### ConstantValue
Value `consumer` is always 'null'
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqAdminUtil.java`
#### Snippet
```java
            RocketMqBaseConfiguration config, boolean autoCommit) {
        DefaultLitePullConsumer consumer = null;
        if (Objects.isNull(consumer)) {
            if (StringUtils.isBlank(config.getAccessKey())
                    && StringUtils.isBlank(config.getSecretKey())) {
```

### ConstantValue
Condition `client != null` is always `true`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSourceReader.java`
#### Snippet
```java
        }
        // close client to be
        if (client != null) {
            client.close();
        }
```

### ConstantValue
Condition `fieldNames != null` is always `true`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
            String index, SeaTunnelRowType seaTunnelRowType) {
        List<String> fieldNames = RegexUtils.extractDatas(index, "\\$\\{(.*?)\\}");
        if (fieldNames != null && fieldNames.size() > 0) {
            return new VariableIndexSerializer(seaTunnelRowType, index, fieldNames);
        } else {
```

### ConstantValue
Result of `entry.getValue()` is always 'null'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
                    doc.put(fieldName, entry.getValue().textValue());
                } else {
                    doc.put(fieldName, entry.getValue());
                }
            }
```

### ConstantValue
Condition `bytes == null` is always `false`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransform.java`
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
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransform.java`
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
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransform.java`
#### Snippet
```java
                SeaTunnelRowType rowType = (SeaTunnelRowType) dataType;
                SeaTunnelRow row = (SeaTunnelRow) value;
                if (row == null) {
                    return null;
                }
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `rowCountThisPollNext`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelSourceCollector.java`
#### Snippet
```java
        try {
            sendRecordToNext(new Record<>(row));
            rowCountThisPollNext++;
            sourceReceivedCount.inc();
            sourceReceivedQPS.markEvent();
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `checkpointId`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        return new ReaderState(bytes, subtaskId, checkpointId++);
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `checkpointId`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        return new ReaderState(bytes, subtaskId, checkpointId++);
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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
String concatenation as argument to `StringBuilder.append()` call
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
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

## RuleId[id=OptionalIsPresent]
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java
        sql.append(projection).append(" FROM ");
        sql.append(quoteSchemaAndTable(tableId));
        if (condition.isPresent()) {
            sql.append(" WHERE ").append(condition.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java
            sql.append(" WHERE ").append(condition.get());
        }
        if (orderBy.isPresent()) {
            sql.append(" ORDER BY ").append(orderBy.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java
        sql.append(" FROM ");
        sql.append(quoteSchemaAndTable(tableId));
        if (condition.isPresent()) {
            sql.append(" WHERE ").append(condition.get());
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'Option(String, TypeReference, T)' as a member of raw type 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/SingleChoiceOption.java`
#### Snippet
```java
    public SingleChoiceOption(
            String key, TypeReference<T> typeReference, List<T> optionValues, T defaultValue) {
        super(key, typeReference, defaultValue);
        this.optionValues = optionValues;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ReadonlyConfig.java`
#### Snippet
```java
                    return null;
                } else {
                    data = (Map<String, Object>) value;
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/Options.java`
#### Snippet
```java
         */
        public Option<T> defaultValue(T value) {
            return new SingleChoiceOption<T>(key, typeReference, optionValues, value);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/Options.java`
#### Snippet
```java
         */
        public Option<T> noDefaultValue() {
            return new SingleChoiceOption<T>(key, typeReference, optionValues, null);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.table.factory.TableSinkFactory' to 'org.apache.seatunnel.api.table.factory.TableSinkFactory'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/FactoryUtil.java`
#### Snippet
```java
        try {
            TableSinkFactory<IN, StateT, CommitInfoT, AggregatedCommitInfoT> factory =
                    discoverFactory(classLoader, TableSinkFactory.class, factoryIdentifier);
            TableFactoryContext context =
                    new TableFactoryContext(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the optionValues must not be null.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)));
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the defaultValue(%s) must be one of the optionValues.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)), o);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.Option' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
        }

        Object value = config.get(option);
        if (value != null && !optionValues.contains(value)) {
            throw new OptionValidationException(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the value(%s) must be one of the optionValues.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)), value);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.sink.SeaTunnelSink' to 'org.apache.seatunnel.api.sink.SeaTunnelSink'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java
                                                    Serializable>
                                            seaTunnelSink =
                                                    sinkPluginDiscovery.createPluginInstance(
                                                            pluginIdentifier);
                                    seaTunnelSink.prepare(sinkConfig);
```

### UNCHECKED_WARNING
Unchecked call to 'map(T)' as a member of raw type 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                                SeaTunnelRow seaTunnelRow =
                                        transformInputRowConverter.reconvert(value);
                                SeaTunnelRow dataRow = (SeaTunnelRow) transform.map(seaTunnelRow);
                                if (dataRow != null) {
                                    Row copy = transformOutputRowConverter.convert(dataRow);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.transform.SeaTunnelTransform' to 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        for (int i = 0; i < plugins.size(); i++) {
            try {
                SeaTunnelTransform<SeaTunnelRow> transform = plugins.get(i);
                Config pluginConfig = pluginConfigs.get(i);
                DataStream<Row> stream = fromSourceTable(pluginConfig).orElse(input);
```

### UNCHECKED_WARNING
Unchecked call to 'setTypeInfo(SeaTunnelDataType)' as a member of raw type 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
    protected DataStream<Row> flinkTransform(SeaTunnelTransform transform, DataStream<Row> stream) {
        SeaTunnelDataType seaTunnelDataType = TypeConverterUtils.convert(stream.getType());
        transform.setTypeInfo(seaTunnelDataType);
        TypeInformation rowTypeInfo = TypeConverterUtils.convert(transform.getProducedType());
        FlinkRowConverter transformInputRowConverter = new FlinkRowConverter(seaTunnelDataType);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator' to 'org.apache.flink.streaming.api.datastream.DataStream'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                new FlinkRowConverter(transform.getProducedType());
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
                            @Override
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.api.common.typeinfo.TypeInformation' to 'org.apache.flink.api.common.typeinfo.TypeInformation'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                            }
                        },
                        rowTypeInfo);
        return output;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.sink.SeaTunnelSink' to 'org.apache.seatunnel.api.sink.SeaTunnelSink'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java
                                                    Serializable>
                                            seaTunnelSink =
                                                    sinkPluginDiscovery.createPluginInstance(
                                                            pluginIdentifier);
                                    seaTunnelSink.prepare(sinkConfig);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.source.SeaTunnelSource' to 'org.apache.seatunnel.api.source.SeaTunnelSource'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java
            BaseSeaTunnelSourceFunction sourceFunction;
            if (internalSource instanceof SupportCoordinate) {
                sourceFunction = new SeaTunnelCoordinatedSource(internalSource);
            } else {
                sourceFunction = new SeaTunnelParallelSource(internalSource);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.source.SeaTunnelSource' to 'org.apache.seatunnel.api.source.SeaTunnelSource'
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java
                sourceFunction = new SeaTunnelCoordinatedSource(internalSource);
            } else {
                sourceFunction = new SeaTunnelParallelSource(internalSource);
            }
            DataStreamSource<Row> sourceStream =
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.transform.SeaTunnelTransform' to 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        for (int i = 0; i < plugins.size(); i++) {
            try {
                SeaTunnelTransform<SeaTunnelRow> transform = plugins.get(i);
                Config pluginConfig = pluginConfigs.get(i);
                Dataset<Row> stream =
```

### UNCHECKED_WARNING
Unchecked call to 'setTypeInfo(SeaTunnelDataType)' as a member of raw type 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
            throws IOException {
        SeaTunnelDataType<?> seaTunnelDataType = TypeConverterUtils.convert(stream.schema());
        transform.setTypeInfo(seaTunnelDataType);
        StructType structType =
                (StructType) TypeConverterUtils.convert(transform.getProducedType());
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.transform.SeaTunnelTransform' to 'org.apache.seatunnel.api.transform.SeaTunnelTransform'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                                            new TransformIterator(
                                                    rowIterator,
                                                    transform,
                                                    structType,
                                                    inputRowConverter,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java

    protected ConfigNodePath first() {
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
        for (int i = 0; i < tokensCopy.size(); i++) {
            if (Tokens.isUnquotedText(tokensCopy.get(i))
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java

    protected ConfigNodePath first() {
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
        for (int i = 0; i < tokensCopy.size(); i++) {
            if (Tokens.isUnquotedText(tokensCopy.get(i))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    protected ConfigNodePath subPath(int toRemove) {
        int periodCount = 0;
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
        for (int i = 0; i < tokensCopy.size(); i++) {
            if (Tokens.isUnquotedText(tokensCopy.get(i))
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    protected ConfigNodePath subPath(int toRemove) {
        int periodCount = 0;
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
        for (int i = 0; i < tokensCopy.size(); i++) {
            if (Tokens.isUnquotedText(tokensCopy.get(i))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    ConfigNodePath(Path path, Collection<Token> tokens) {
        this.path = path;
        this.tokens = new ArrayList<>(tokens);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    ConfigNodePath(Path path, Collection<Token> tokens) {
        this.path = path;
        this.tokens = new ArrayList<>(tokens);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.collection.IQueue\[\]' to 'com.hazelcast.collection.IQueue\>\[\]'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ShuffleMultipleRowStrategy.java`
#### Snippet
```java
    public IQueue<Record<?>>[] getShuffles(
            HazelcastInstance hazelcast, int pipelineId, int targetIndex) {
        IQueue<Record<?>>[] queues = new IQueue[getInputPartitions()];
        for (int inputIndex = 0; inputIndex < getInputPartitions(); inputIndex++) {
            Objects.requireNonNull(targetTableId);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.collection.IQueue\[\]' to 'com.hazelcast.collection.IQueue\>\[\]'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ShufflePartitionStrategy.java`
#### Snippet
```java
            HazelcastInstance hazelcast, int pipelineId, int targetIndex) {
        checkArgument(targetIndex >= 0 && targetIndex < targetPartitions);
        IQueue<Record<?>>[] shuffles = new IQueue[getInputPartitions()];
        for (int inputIndex = 0; inputIndex < getInputPartitions(); inputIndex++) {
            String queueName = generateQueueName(pipelineId, inputIndex, targetIndex);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            boolean lastWasNewline = false;

            ArrayList<AbstractConfigNode> nodes = new ArrayList<>(n.children());
            List<String> comments = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
            boolean lastWasNewline = false;

            ArrayList<AbstractConfigNode> nodes = new ArrayList<>(n.children());
            List<String> comments = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.sink.SeaTunnelSink' to 'org.apache.seatunnel.api.sink.SeaTunnelSink'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/ConnectorInstanceLoader.java`
#### Snippet
```java
                sinkPluginDiscovery.getPluginJarPaths(Lists.newArrayList(pluginIdentifier));
        SeaTunnelSink<SeaTunnelRow, Serializable, Serializable, Serializable> seaTunnelSink =
                sinkPluginDiscovery.createPluginInstance(pluginIdentifier, pluginJars);
        return new ImmutablePair<>(seaTunnelSink, new HashSet<>(pluginJarPaths));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashMap(Map)' as a member of raw type 'java.util.LinkedHashMap'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
                newMap = Collections.singletonMap(key, (AbstractConfigValue) v);
            } else {
                newMap = new LinkedHashMap<>(this.value);
                newMap.put(key, v);
            }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
            } else {
                newMap = new LinkedHashMap<>(this.value);
                newMap.put(key, v);
            }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
            return new SimpleConfigObject(
                    this.origin(),
                    newMap,
                    ResolveStatus.fromValues(newMap.values()),
                    this.ignoresFallbacks);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    public SimpleConfigObject replaceChild(
            AbstractConfigValue child, AbstractConfigValue replacement) {
        Map<String, AbstractConfigValue> newChildren = new LinkedHashMap<>(this.value);
        Iterator<Entry<String, AbstractConfigValue>> var4 = newChildren.entrySet().iterator();

```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashMap(Map)' as a member of raw type 'java.util.LinkedHashMap'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    public SimpleConfigObject replaceChild(
            AbstractConfigValue child, AbstractConfigValue replacement) {
        Map<String, AbstractConfigValue> newChildren = new LinkedHashMap<>(this.value);
        Iterator<Entry<String, AbstractConfigValue>> var4 = newChildren.entrySet().iterator();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Collection'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

    public Collection<ConfigValue> values() {
        return new HashSet<>(this.value.values());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

    public Collection<ConfigValue> values() {
        return new HashSet<>(this.value.values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.HashMap'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
        if (next != null && v instanceof AbstractConfigObject) {
            v = ((AbstractConfigObject) v).withoutPath(next);
            smaller = new LinkedHashMap<>(this.value);
            smaller.put(key, v);
            return new SimpleConfigObject(
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashMap(Map)' as a member of raw type 'java.util.LinkedHashMap'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
        if (next != null && v instanceof AbstractConfigObject) {
            v = ((AbstractConfigObject) v).withoutPath(next);
            smaller = new LinkedHashMap<>(this.value);
            smaller.put(key, v);
            return new SimpleConfigObject(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.table.type.SeaTunnelDataType' to 'org.apache.seatunnel.api.table.type.SeaTunnelDataType'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
        transform.prepare(config);
        transform.setJobContext(jobConfig.getJobContext());
        transform.setTypeInfo((SeaTunnelDataType) rowType);
        final String actionName =
                createTransformActionName(0, tuple.getLeft().getPluginName(), getTableName(config));
```

### UNCHECKED_WARNING
Unchecked call to 'SourceAction(long, String, SeaTunnelSource, Set)' as a member of raw type 'org.apache.seatunnel.engine.core.dag.actions.SourceAction'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
                        0, config.getString(CollectionConstants.PLUGIN_NAME), getTableName(config));
        SourceAction action =
                new SourceAction(
                        idGenerator.getNextId(), actionName, tuple.getLeft(), tuple.getRight());
        action.setParallelism(parallelism);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
        if (runningJobStateTimestampsIMap.get(jobId) == null) {
            stateTimestamps[JobStatus.INITIALIZING.ordinal()] = initializationTimestamp;
            runningJobStateTimestampsIMap.put(jobId, stateTimestamps);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
            // from TaskExecutionService. But we can not recover stateTimestamps.
            stateTimestamps[JobStatus.CREATED.ordinal()] = System.currentTimeMillis();
            runningJobStateTimestampsIMap.put(jobId, stateTimestamps);

            runningJobStateIMap.put(jobId, JobStatus.CREATED);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
            runningJobStateTimestampsIMap.put(jobId, stateTimestamps);

            runningJobStateIMap.put(jobId, JobStatus.CREATED);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
                        jobImmutableInformation.getJobId());

        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
        if (runningJobStateTimestampsIMap.get(taskGroup.getTaskGroupLocation()) == null) {
            stateTimestamps[ExecutionState.INITIALIZING.ordinal()] = initializationTimestamp;
            runningJobStateTimestampsIMap.put(taskGroup.getTaskGroupLocation(), stateTimestamps);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
            // runningJobStateIMap
            stateTimestamps[ExecutionState.CREATED.ordinal()] = System.currentTimeMillis();
            runningJobStateTimestampsIMap.put(taskGroupLocation, stateTimestamps);

            runningJobStateIMap.put(taskGroupLocation, ExecutionState.CREATED);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
            runningJobStateTimestampsIMap.put(taskGroupLocation, stateTimestamps);

            runningJobStateIMap.put(taskGroupLocation, ExecutionState.CREATED);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
        this.taskFuture = new CompletableFuture<>();

        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
        if (runningJobStateTimestampsIMap.get(pipelineLocation) == null) {
            stateTimestamps[PipelineStatus.INITIALIZING.ordinal()] = initializationTimestamp;
            runningJobStateTimestampsIMap.put(pipelineLocation, stateTimestamps);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
            // runningJobStateIMap
            stateTimestamps[PipelineStatus.CREATED.ordinal()] = System.currentTimeMillis();
            runningJobStateTimestampsIMap.put(pipelineLocation, stateTimestamps);

            runningJobStateIMap.put(pipelineLocation, PipelineStatus.CREATED);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
            runningJobStateTimestampsIMap.put(pipelineLocation, stateTimestamps);

            runningJobStateIMap.put(pipelineLocation, PipelineStatus.CREATED);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
                        pipelineId,
                        totalPipelineNum);
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.executorService = executorService;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
                        totalPipelineNum);
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.executorService = executorService;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.task.flow.FlowLifeCycle' to 'org.apache.seatunnel.engine.server.task.flow.OneOutputFlowLifeCycle\>'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/TransformSeaTunnelTask.java`
#### Snippet
```java
    @Override
    protected void collect() throws Exception {
        ((OneOutputFlowLifeCycle<Record<?>>) startFlowLifeCycle).collect(collector);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.task.flow.FlowLifeCycle' to 'org.apache.seatunnel.engine.server.task.flow.SourceFlowLifeCycle'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java
    public void triggerBarrier(Barrier barrier) throws Exception {
        SourceFlowLifeCycle<T, SplitT> sourceFlow =
                (SourceFlowLifeCycle<T, SplitT>) startFlowLifeCycle;
        sourceFlow.triggerBarrier(barrier);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.task.flow.FlowLifeCycle' to 'org.apache.seatunnel.engine.server.task.flow.SourceFlowLifeCycle'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java

    public void receivedSourceSplit(List<SplitT> splits) {
        ((SourceFlowLifeCycle<T, SplitT>) startFlowLifeCycle).receivedSplits(splits);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.task.flow.FlowLifeCycle' to 'org.apache.seatunnel.engine.server.task.flow.SourceFlowLifeCycle'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java
    @Override
    protected void collect() throws Exception {
        ((SourceFlowLifeCycle<T, SplitT>) startFlowLifeCycle).collect();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.task.flow.FlowLifeCycle' to 'org.apache.seatunnel.engine.server.task.flow.SourceFlowLifeCycle'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSeaTunnelTask.java`
#### Snippet
```java
                    new SeaTunnelSourceCollector<>(
                            checkpointLock, outputs, this.getMetricsContext());
            ((SourceFlowLifeCycle<T, SplitT>) startFlowLifeCycle).setCollector(collector);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/TransformFlowLifeCycle.java`
#### Snippet
```java
                return;
            }
            T inputData = (T) record.getData();
            T outputData = inputData;
            for (SeaTunnelTransform<T> t : transform) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
        Set<ExecutionEdge> executionEdges = new LinkedHashSet<>();

        Map<Long, ExecutionVertex> logicalVertexIdToExecutionVertexMap = new HashMap();

        List<LogicalEdge> sortedLogicalEdges = new ArrayList<>(logicalEdges);
```

### UNCHECKED_WARNING
Unchecked call to 'TransformChainAction(long, String, Set, List\>)' as a member of raw type 'org.apache.seatunnel.engine.core.dag.actions.TransformChainAction'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                    String.format("TransformChain[%s]", String.join("->", names));
            TransformChainAction transformChainAction =
                    new TransformChainAction(
                            newVertexId, transformChainActionName, jars, transforms);
            transformChainAction.setParallelism(currentVertex.getAction().getParallelism());
```

### UNCHECKED_WARNING
Unchecked call to 'TransformChainAction(long, String, Set, List\>)' as a member of raw type 'org.apache.seatunnel.engine.core.dag.actions.TransformChainAction'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
        } else if (action instanceof TransformChainAction) {
            newAction =
                    new TransformChainAction(
                            id,
                            action.getName(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.CompletableFuture' to 'java.util.concurrent.CompletableFuture'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSinkFlowLifeCycle.java`
#### Snippet
```java
            ScheduledExecutorService scheduledExecutorService) {
        // todo Register when the job started, Unload at the end(pause/cancel/crash) of the job
        CompletableFuture<Boolean> completedFuture = new CompletableFuture();
        Runnable scheduleFlushTask =
                new Runnable() {
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
                    return;
                }
                writer.write((T) record.getData());
                sinkWriteCount.inc();
                sinkWriteQPS.markEvent();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'SplitT'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/AssignSplitOperation.java`
#### Snippet
```java
                    Object[] o = SerializationUtils.deserialize(splits, classLoader);
                    task.receivedSourceSplit(
                            Arrays.stream(o).map(i -> (SplitT) i).collect(Collectors.toList()));
                    return null;
                },
```

### UNCHECKED_WARNING
Unchecked call to 'PhysicalExecutionFlow(T, List)' as a member of raw type 'org.apache.seatunnel.engine.server.dag.physical.flow.PhysicalExecutionFlow'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
            int totalPipelineNum) {
        return sources.stream()
                .map(s -> new PhysicalExecutionFlow(s, getNextWrapper(edges, s)))
                .flatMap(
                        flow -> {
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
        this.startingTasks = new HashSet<>();
        this.subtaskActions = new HashMap<>();
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.queueType = queueType;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
        this.subtaskActions = new HashMap<>();
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.queueType = queueType;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'SinkAggregatedCommitterTask(long, TaskLocation, SinkAction, SinkAggregatedCommitter)' as a member of raw type 'org.apache.seatunnel.engine.server.task.SinkAggregatedCommitterTask'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                                        new TaskLocation(taskGroupLocation, taskTypeId, 0);
                                SinkAggregatedCommitterTask<?, ?> t =
                                        new SinkAggregatedCommitterTask(
                                                jobImmutableInformation.getJobId(),
                                                taskLocation,
```

### UNCHECKED_WARNING
Unchecked call to 'PhysicalExecutionFlow(T, List)' as a member of raw type 'org.apache.seatunnel.engine.server.dag.physical.flow.PhysicalExecutionFlow'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                .collect(Collectors.toSet())
                .stream()
                .map(q -> new PhysicalExecutionFlow(q, getNextWrapper(edges, q)))
                .flatMap(
                        flow -> {
```

### UNCHECKED_WARNING
Unchecked call to 'PhysicalExecutionFlow(T, List)' as a member of raw type 'org.apache.seatunnel.engine.server.dag.physical.flow.PhysicalExecutionFlow'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                                    shuffleActionOfSinkFlow.setParallelism(1);
                                    PhysicalExecutionFlow shuffleFlow =
                                            new PhysicalExecutionFlow(
                                                    shuffleActionOfSinkFlow,
                                                    Collections.singletonList(sinkFlow));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'R'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java
    @Override
    protected ClientMessage encodeResponse(Object o) {
        return encoder.apply((R) o);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.execution.Task' to 'T'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskGroupDefaultImpl.java`
#### Snippet
```java
    @Override
    public <T extends Task> T getTask(long taskID) {
        return (T) tasks.get(taskID);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.server.execution.Task' to 'T'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskExecutionContext.java`
#### Snippet
```java

    public <T> T getTask() {
        return (T) task;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap\>'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
                        .getHazelcastInstance()
                        .getFlakeIdGenerator(Constant.SEATUNNEL_ID_GENERATOR_NAME);
        this.ownedSlotProfilesIMap = ownedSlotProfilesIMap;
        this.resourceManager = resourceManager;
        this.jobHistoryService = jobHistoryService;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
        this.resourceManager = resourceManager;
        this.jobHistoryService = jobHistoryService;
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.runningJobInfoIMap = runningJobInfoIMap;
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.hazelcast.map.IMap' to 'com.hazelcast.map.IMap'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
        this.jobHistoryService = jobHistoryService;
        this.runningJobStateIMap = runningJobStateIMap;
        this.runningJobStateTimestampsIMap = runningJobStateTimestampsIMap;
        this.runningJobInfoIMap = runningJobInfoIMap;
        this.engineConfig = engineConfig;
```

### UNCHECKED_WARNING
Unchecked call to 'Record(T)' as a member of raw type 'org.apache.seatunnel.api.table.type.Record'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/serializable/RecordSerializer.java`
#### Snippet
```java
                    "Unsupported deserialize data type: " + dataType);
        }
        return new Record(data);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'write(T)' as a member of raw type 'org.apache.seatunnel.engine.imap.storage.file.wal.writer.IFileWriter'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/common/WALWriter.java`
#### Snippet
```java

    public void write(IMapFileData data) throws IOException {
        this.writer.write(data);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.concurrent.CompletableFuture' to 'java.util.concurrent.CompletableFuture'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java

    private <T> CompletableFuture<T> getAllOfFuture(List<CompletableFuture<T>> allRequestFuture) {
        return (CompletableFuture<T>)
                CompletableFuture.allOf(allRequestFuture.toArray(new CompletableFuture[0]));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'this.fileReader' has raw type, so result of readAllData is erased
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/common/WALReader.java`
#### Snippet
```java

    private List<IMapFileData> readAllData(Path parentPath) throws IOException {
        return this.fileReader.readAllData(parentPath);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.engine.common.utils.PassiveCompletableFuture' to 'org.apache.seatunnel.engine.common.utils.PassiveCompletableFuture'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                    new CheckpointException(
                            CheckpointCloseReason.TASK_NOT_ALL_READY_WHEN_SAVEPOINT));
            return new PassiveCompletableFuture<>(savepointFuture);
        }
        CompletableFuture<PendingCheckpoint> savepoint =
```

### UNCHECKED_WARNING
Unchecked call to 'PassiveCompletableFuture(CompletableFuture)' as a member of raw type 'org.apache.seatunnel.engine.common.utils.PassiveCompletableFuture'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                    new CheckpointException(
                            CheckpointCloseReason.TASK_NOT_ALL_READY_WHEN_SAVEPOINT));
            return new PassiveCompletableFuture<>(savepointFuture);
        }
        CompletableFuture<PendingCheckpoint> savepoint =
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.CompletableFuture' to 'java.util.concurrent.CompletableFuture'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                    serializer.deserialize(pipelineState.getStates(), CompletedCheckpoint.class);
        }
        this.checkpointCoordinatorFuture = new CompletableFuture();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `seatunnel-engine/seatunnel-engine-serializer/serializer-protobuf/src/main/java/org/apache/seatunnel/engine/serializer/protobuf/ProtoStuffSerializer.java`
#### Snippet
```java
    @Override
    public <T> byte[] serialize(T obj) {
        Class<T> clazz = (Class<T>) obj.getClass();
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        Schema schema = WRAPPER_SCHEMA;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.engine.serializer.protobuf.ProtoStuffSerializer.SerializerDeserializerWrapper' to 'T'
in `seatunnel-engine/seatunnel-engine-serializer/serializer-protobuf/src/main/java/org/apache/seatunnel/engine/serializer/protobuf/ProtoStuffSerializer.java`
#### Snippet
```java
        Schema schema = WRAPPER_SCHEMA;
        if (WRAPPERS.contains(clazz)) {
            obj = (T) SerializerDeserializerWrapper.of(obj);
        } else {
            schema = getSchema(clazz);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.protostuff.Schema' to 'io.protostuff.Schema'
in `seatunnel-engine/seatunnel-engine-serializer/serializer-protobuf/src/main/java/org/apache/seatunnel/engine/serializer/protobuf/ProtoStuffSerializer.java`
#### Snippet
```java
        byte[] data;
        try {
            data = ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } finally {
            buffer.clear();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                }

                Map<String, ?> mapData = (Map) value;
                for (Map.Entry<String, ?> entry : mapData.entrySet()) {
                    String fieldName = entry.getKey();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextSerializationSchema.java`
#### Snippet
```java
                SeaTunnelDataType<?> keyType = ((MapType<?, ?>) fieldType).getKeyType();
                SeaTunnelDataType<?> valueType = ((MapType<?, ?>) fieldType).getValueType();
                return ((Map<Object, Object>) field)
                        .entrySet().stream()
                                .map(
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.spark.sql.connector.write.WriterCommitMessage' to 'org.apache.seatunnel.translation.spark.sink.write.SeaTunnelSparkWriterCommitMessage'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/SeaTunnelBatchWrite.java`
#### Snippet
```java
        List<CommitInfoT> commitInfos =
                Arrays.stream(messages)
                        .map(m -> ((SeaTunnelSparkWriterCommitMessage<CommitInfoT>) m).getMessage())
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/ChangeEventRecords.java`
#### Snippet
```java
            String splitId, Iterator recordsForSplit, Set<String> finishedSnapshotSplits) {
        this.splitId = splitId;
        this.recordsForSplit = recordsForSplit;
        this.finishedSnapshotSplits = finishedSnapshotSplits;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSplitAssigner.java`
#### Snippet
```java
        Set<TableId> allTables = new HashSet<>(context.getCapturedTables());
        assignedSplits.values().forEach(split -> split.getTableIds().forEach(allTables::remove));
        List<TableId>[] capturedTables = new List[incrementalParallelism];
        int i = 0;
        for (TableId tableId : allTables) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.SingleChoiceOption'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlSourceOptions.java`
#### Snippet
```java
public class MySqlSourceOptions {
    public static final SingleChoiceOption<StartupMode> STARTUP_MODE =
            (SingleChoiceOption)
                    Options.key(SourceOptions.STARTUP_MODE_KEY)
                            .singleChoice(
                                    StartupMode.class,
                                    Arrays.asList(
                                            StartupMode.INITIAL,
                                            StartupMode.EARLIEST,
                                            StartupMode.LATEST))
                            .defaultValue(StartupMode.INITIAL)
                            .withDescription(
                                    "Optional startup mode for CDC source, valid enumerations are "
                                            + "\"initial\", \"earliest\", \"latest\", \"timestamp\"\n or \"specific\"");

    public static final SingleChoiceOption<StopMode> STOP_MODE =
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.SingleChoiceOption'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlSourceOptions.java`
#### Snippet
```java

    public static final SingleChoiceOption<StopMode> STOP_MODE =
            (SingleChoiceOption)
                    Options.key(SourceOptions.STOP_MODE_KEY)
                            .singleChoice(StopMode.class, Arrays.asList(StopMode.NEVER))
                            .defaultValue(StopMode.NEVER)
                            .withDescription(
                                    "Optional stop mode for CDC source, valid enumerations are "
                                            + "\"never\", \"latest\", \"timestamp\"\n or \"specific\"");
}

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
                .optional(MySqlSourceOptions.STARTUP_MODE, MySqlSourceOptions.STOP_MODE)
                .conditional(
                        MySqlSourceOptions.STARTUP_MODE,
                        StartupMode.SPECIFIC,
                        SourceOptions.STARTUP_SPECIFIC_OFFSET_FILE,
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STARTUP_SPECIFIC_OFFSET_POS)
                .conditional(
                        MySqlSourceOptions.STOP_MODE,
                        StopMode.SPECIFIC,
                        SourceOptions.STOP_SPECIFIC_OFFSET_FILE,
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STOP_SPECIFIC_OFFSET_POS)
                .conditional(
                        MySqlSourceOptions.STARTUP_MODE,
                        StartupMode.TIMESTAMP,
                        SourceOptions.STARTUP_TIMESTAMP)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STARTUP_TIMESTAMP)
                .conditional(
                        MySqlSourceOptions.STOP_MODE,
                        StopMode.TIMESTAMP,
                        SourceOptions.STOP_TIMESTAMP)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.connectors.seatunnel.cdc.mysql.source.MySqlIncrementalSource' to 'org.apache.seatunnel.api.source.SeaTunnelSource'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
                dataType = new MultipleRowType(rowTypeMap);
            }
            return (SeaTunnelSource<T, SplitT, StateT>)
                    new MySqlIncrementalSource<>(context.getOptions(), dataType);
        };
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSource.java`
#### Snippet
```java
    @Override
    public Option<StartupMode> getStartupModeOption() {
        return MySqlSourceOptions.STARTUP_MODE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSource.java`
#### Snippet
```java
    @Override
    public Option<StopMode> getStopModeOption() {
        return MySqlSourceOptions.STOP_MODE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.SingleChoiceOption'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerSourceOptions.java`
#### Snippet
```java
public class SqlServerSourceOptions {
    public static final SingleChoiceOption<StartupMode> STARTUP_MODE =
            (SingleChoiceOption)
                    Options.key("startup.mode")
                            .singleChoice(
                                    StartupMode.class,
                                    Arrays.asList(
                                            StartupMode.INITIAL,
                                            StartupMode.EARLIEST,
                                            StartupMode.LATEST))
                            .defaultValue(StartupMode.INITIAL)
                            .withDescription(
                                    "Optional startup mode for CDC source, valid enumerations are "
                                            + "\"initial\", \"earliest\", \"latest\", \"timestamp\"\n or \"specific\"");

    public static final SingleChoiceOption<StopMode> STOP_MODE =
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.SingleChoiceOption'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerSourceOptions.java`
#### Snippet
```java

    public static final SingleChoiceOption<StopMode> STOP_MODE =
            (SingleChoiceOption)
                    Options.key("stop.mode")
                            .singleChoice(StopMode.class, Arrays.asList(StopMode.NEVER))
                            .defaultValue(StopMode.NEVER)
                            .withDescription(
                                    "Optional stop mode for CDC source, valid enumerations are "
                                            + "\"never\", \"latest\", \"timestamp\"\n or \"specific\"");
}

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.cdc.sqlserver.source.source.SqlServerIncrementalSource' to 'org.apache.seatunnel.api.source.SeaTunnelSource'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                dataType = new MultipleRowType(rowTypeMap);
            }
            return new SqlServerIncrementalSource(context.getOptions(), dataType);
        };
    }
```

### UNCHECKED_WARNING
Unchecked call to 'SqlServerIncrementalSource(ReadonlyConfig, SeaTunnelDataType)' as a member of raw type 'org.apache.seatunnel.connectors.seatunnel.cdc.sqlserver.source.source.SqlServerIncrementalSource'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                dataType = new MultipleRowType(rowTypeMap);
            }
            return new SqlServerIncrementalSource(context.getOptions(), dataType);
        };
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                .optional(SqlServerSourceOptions.STARTUP_MODE, SqlServerSourceOptions.STOP_MODE)
                .conditional(
                        SqlServerSourceOptions.STARTUP_MODE,
                        StartupMode.SPECIFIC,
                        SourceOptions.STARTUP_SPECIFIC_OFFSET_POS)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STARTUP_SPECIFIC_OFFSET_POS)
                .conditional(
                        SqlServerSourceOptions.STOP_MODE,
                        StopMode.SPECIFIC,
                        SourceOptions.STOP_SPECIFIC_OFFSET_POS)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STOP_SPECIFIC_OFFSET_POS)
                .conditional(
                        SqlServerSourceOptions.STARTUP_MODE,
                        StartupMode.TIMESTAMP,
                        SourceOptions.STARTUP_TIMESTAMP)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
                        SourceOptions.STARTUP_TIMESTAMP)
                .conditional(
                        SqlServerSourceOptions.STOP_MODE,
                        StopMode.TIMESTAMP,
                        SourceOptions.STOP_TIMESTAMP)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSource.java`
#### Snippet
```java
    @Override
    public Option<StopMode> getStopModeOption() {
        return SqlServerSourceOptions.STOP_MODE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.configuration.SingleChoiceOption' to 'org.apache.seatunnel.api.configuration.Option'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSource.java`
#### Snippet
```java
    @Override
    public Option<StartupMode> getStartupModeOption() {
        return SqlServerSourceOptions.STARTUP_MODE;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                SeaTunnelDataType<?> keyType = ((MapType<?, ?>) fieldType).getKeyType();
                SeaTunnelDataType<?> valueType = ((MapType<?, ?>) fieldType).getValueType();
                HashMap<Object, Object> origDataMap = (HashMap<Object, Object>) field;
                origDataMap.forEach(
                        (key, value) ->
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.jdbc.internal.JdbcOutputFormat' to 'org.apache.seatunnel.connectors.seatunnel.jdbc.internal.JdbcOutputFormat\>'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkWriter.java`
#### Snippet
```java
                new SimpleJdbcConnectionProvider(jdbcSinkConfig.getJdbcConnectionConfig());
        this.outputFormat =
                new JdbcOutputFormatBuilder(dialect, connectionProvider, jdbcSinkConfig, rowType)
                        .build();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.jdbc.internal.JdbcOutputFormat' to 'org.apache.seatunnel.connectors.seatunnel.jdbc.internal.JdbcOutputFormat\>'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcExactlyOnceSinkWriter.java`
#### Snippet
```java
                XaFacade.fromJdbcConnectionOptions(jdbcSinkConfig.getJdbcConnectionConfig());
        this.outputFormat =
                new JdbcOutputFormatBuilder(dialect, xaFacade, jdbcSinkConfig, rowType).build();
        this.xaGroupOps = new XaGroupOpsImpl(xaFacade);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'JdbcOutputFormat(JdbcConnectionProvider, JdbcConnectionConfig, StatementExecutorFactory)' as a member of raw type 'org.apache.seatunnel.connectors.seatunnel.jdbc.internal.JdbcOutputFormat'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
        }

        return new JdbcOutputFormat(
                connectionProvider,
                jdbcSinkConfig.getJdbcConnectionConfig(),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List\>' to 'java.util.List\>'
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/sink/IoTDBSinkClient.java`
#### Snippet
```java
        private List<List<String>> getStringValuesList() {
            List<?> tmp = valuesList;
            return (List<List<String>>) tmp;
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.DefaultSeaTunnelRowSerializer' to 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.SeaTunnelRowSerializer'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        }
        if (pluginConfig.get(PARTITION_KEY_FIELDS) != null) {
            return DefaultSeaTunnelRowSerializer.create(
                    topic,
                    getPartitionKeyFields(pluginConfig, seaTunnelRowType),
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.DefaultSeaTunnelRowSerializer' to 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.SeaTunnelRowSerializer'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        }
        if (pluginConfig.get(PARTITION) != null) {
            return DefaultSeaTunnelRowSerializer.create(
                    topic, pluginConfig.get(PARTITION), seaTunnelRowType, messageFormat, delimiter);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.DefaultSeaTunnelRowSerializer' to 'org.apache.seatunnel.connectors.seatunnel.kafka.serialize.SeaTunnelRowSerializer'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        }
        // By default, all partitions are sent randomly
        return DefaultSeaTunnelRowSerializer.create(
                topic, Arrays.asList(), seaTunnelRowType, messageFormat, delimiter);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ProducerRecord(String, Integer, Long, K, V, Iterable)' as a member of raw type 'org.apache.kafka.clients.producer.ProducerRecord'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
    @Override
    public ProducerRecord serializeRow(SeaTunnelRow row) {
        return new ProducerRecord(
                topicExtractor.apply(row),
                partitionExtractor.apply(row),
```

### UNCHECKED_WARNING
Unchecked call to 'MapType(SeaTunnelDataType, SeaTunnelDataType)' as a member of raw type 'org.apache.seatunnel.api.table.type.MapType'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java

    private static MapType mappingMapType(Types.MapType mapType) {
        return new MapType(mapping(mapType.keyType()), mapping(mapType.valueType()));
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                ArrayType seatunnelListType = (ArrayType) seaTunnelType;
                for (int i = 0; i < icebergList.size(); i++) {
                    seatunnelList.add(
                            convert(
                                    icebergListType.elementType(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                return seatunnelList.toArray();
            case MAP:
                Map<Object, Object> icebergMap = Map.class.cast(icebergValue);
                Types.MapType icebergMapType = (Types.MapType) icebergType;
                Map seatunnelMap = new HashMap();
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/DefaultDeserializer.java`
#### Snippet
```java
                MapType seatunnelMapType = (MapType) seaTunnelType;
                for (Map.Entry entry : icebergMap.entrySet()) {
                    seatunnelMap.put(
                            convert(
                                    icebergMapType.keyType(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.mongodb.serde.SerializableFunction\[\]' to 'org.apache.seatunnel.connectors.seatunnel.mongodb.serde.SerializableFunction\[\]'
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/serde/BsonToRowDataConverters.java`
#### Snippet
```java
        SeaTunnelDataType<?>[] fieldTypes = type.getFieldTypes();
        final SerializableFunction<BsonValue, Object>[] fieldConverters =
                Arrays.stream(fieldTypes)
                        .map(BsonToRowDataConverters::createNullSafeInternalConverter)
                        .toArray(SerializableFunction[]::new);
        int fieldCount = type.getTotalFields();

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.mongodb.serde.SerializableFunction\[\]' to 'org.apache.seatunnel.connectors.seatunnel.mongodb.serde.SerializableFunction\[\]'
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/serde/RowDataToBsonConverters.java`
#### Snippet
```java
            SeaTunnelRowType rowType) {
        final SerializableFunction<Object, BsonValue>[] fieldConverters =
                rowType.getChildren().stream()
                        .map(RowDataToBsonConverters::createNullSafeInternalConverter)
                        .toArray(SerializableFunction[]::new);

        final int fieldCount = rowType.getTotalFields();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/serde/RowDataToBsonConverters.java`
#### Snippet
```java
            @Override
            public BsonValue apply(Object value) {
                Map<String, ?> mapData = (Map<String, ?>) value;
                final BsonDocument document = new BsonDocument();
                for (Map.Entry<String, ?> entry : mapData.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked method 'into(A)' invocation
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/source/split/SamplingSplitStrategy.java`
#### Snippet
```java

    private List<BsonDocument> sampleCollection(int numSamples) {
        return clientProvider
                .getDefaultCollection()
                .aggregate(
                        Lists.newArrayList(
                                Aggregates.match(matchQuery),
                                Aggregates.sample(numSamples),
                                Aggregates.project(Projections.include(splitKey)),
                                Aggregates.sort(Sorts.ascending(splitKey))))
                .allowDiskUse(true)
                .into(Lists.newArrayList());
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.source.SourceSplitEnumerator', required 'org.apache.seatunnel.api.source.SourceSplitEnumerator'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSource.java`
#### Snippet
```java

    @Override
    public SourceSplitEnumerator createEnumerator(SourceSplitEnumerator.Context enumeratorContext)
            throws Exception {
        return new InfluxDBSourceSplitEnumerator(enumeratorContext, sourceConfig);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.source.SourceSplitEnumerator.Context' to 'org.apache.seatunnel.api.source.SourceSplitEnumerator.Context'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSource.java`
#### Snippet
```java
    public SourceSplitEnumerator createEnumerator(SourceSplitEnumerator.Context enumeratorContext)
            throws Exception {
        return new InfluxDBSourceSplitEnumerator(enumeratorContext, sourceConfig);
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.source.SourceReader', required 'org.apache.seatunnel.api.source.SourceReader'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSource.java`
#### Snippet
```java

    @Override
    public SourceReader createReader(SourceReader.Context readerContext) throws Exception {
        return new InfluxdbSourceReader(sourceConfig, readerContext, typeInfo, columnsIndexList);
    }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.Optional', required 'java.util.Optional'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/sink/RabbitmqSinkWriter.java`
#### Snippet
```java

    @Override
    public Optional prepareCommit() {
        return Optional.empty();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/source/InfluxDBSourceSplitEnumerator.java`
#### Snippet
```java
        log.debug("Add back splits {} to InfluxDBSourceSplitEnumerator.", splits);
        if (!splits.isEmpty()) {
            addPendingSplit(splits);
            assignSplit(Collections.singletonList(subtaskId));
        }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.type.SeaTunnelDataType', required 'org.apache.seatunnel.api.table.type.SeaTunnelDataType'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/sink/RabbitmqSink.java`
#### Snippet
```java

    @Override
    public SeaTunnelDataType getConsumedType() {
        return seaTunnelRowType;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.rabbitmq.source.RabbitmqSourceReader' to 'org.apache.seatunnel.api.source.SourceReader'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSource.java`
#### Snippet
```java
    public SourceReader<SeaTunnelRow, RabbitmqSplit> createReader(
            SourceReader.Context readerContext) throws Exception {
        return new RabbitmqSourceReader(deserializationSchema, readerContext, rabbitMQConfig);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RabbitmqSourceReader(DeserializationSchema, Context, RabbitmqConfig)' as a member of raw type 'org.apache.seatunnel.connectors.seatunnel.rabbitmq.source.RabbitmqSourceReader'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSource.java`
#### Snippet
```java
    public SourceReader<SeaTunnelRow, RabbitmqSplit> createReader(
            SourceReader.Context readerContext) throws Exception {
        return new RabbitmqSourceReader(deserializationSchema, readerContext, rabbitMQConfig);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.rabbitmq.source.RabbitmqSplitEnumerator' to 'org.apache.seatunnel.api.source.SourceSplitEnumerator'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSource.java`
#### Snippet
```java
    public SourceSplitEnumerator<RabbitmqSplit, RabbitmqSplitEnumeratorState> createEnumerator(
            SourceSplitEnumerator.Context<RabbitmqSplit> enumeratorContext) throws Exception {
        return new RabbitmqSplitEnumerator();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.connectors.seatunnel.rabbitmq.source.RabbitmqSplitEnumerator' to 'org.apache.seatunnel.api.source.SourceSplitEnumerator'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSource.java`
#### Snippet
```java
            RabbitmqSplitEnumeratorState checkpointState)
            throws Exception {
        return new RabbitmqSplitEnumerator();
    }

```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.type.SeaTunnelDataType', required 'org.apache.seatunnel.api.table.type.SeaTunnelDataType'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSource.java`
#### Snippet
```java

    @Override
    public SeaTunnelDataType getProducedType() {
        return deserializationSchema.getProducedType();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.source.Collector' to 'org.apache.seatunnel.api.source.Collector'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java
                }
                deliveryTagsProcessedForCurrentSnapshot.add(envelope.getDeliveryTag());
                deserializationSchema.deserialize(body, output);
            }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/HttpHelper.java`
#### Snippet
```java
                    return null;
                }
                return JsonUtils.parseObject(EntityUtils.toString(respEntity), Map.class);
            }
        }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.type.SeaTunnelDataType', required 'org.apache.seatunnel.api.table.type.SeaTunnelDataType'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSource.java`
#### Snippet
```java

    @Override
    public SeaTunnelDataType getProducedType() {
        return typeInfo;
    }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.source.SourceSplitEnumerator', required 'org.apache.seatunnel.api.source.SourceSplitEnumerator'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSource.java`
#### Snippet
```java

    @Override
    public SourceSplitEnumerator createEnumerator(SourceSplitEnumerator.Context enumeratorContext) {
        return new StartRocksSourceSplitEnumerator(enumeratorContext, sourceConfig, typeInfo);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.seatunnel.api.source.SourceSplitEnumerator.Context' to 'org.apache.seatunnel.api.source.SourceSplitEnumerator.Context'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSource.java`
#### Snippet
```java
    @Override
    public SourceSplitEnumerator createEnumerator(SourceSplitEnumerator.Context enumeratorContext) {
        return new StartRocksSourceSplitEnumerator(enumeratorContext, sourceConfig, typeInfo);
    }
}
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.source.SourceReader', required 'org.apache.seatunnel.api.source.SourceReader'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSource.java`
#### Snippet
```java

    @Override
    public SourceReader createReader(SourceReader.Context readerContext) {
        return new StarRocksSourceReader(readerContext, typeInfo, sourceConfig);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java

    private List<String> toLowerCase(List<String> names) {
        List<String> lowerNames = new ArrayList(names.size());
        Iterator var3 = names.iterator();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java
        this.validateParameters(names, typeInfos);
        this.fieldNames = this.toLowerCase(names);
        this.fieldTypeInfos = new ArrayList(typeInfos);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java
        this.validateParameters(names, typeInfos);
        this.fieldNames = this.toLowerCase(names);
        this.fieldTypeInfos = new ArrayList(typeInfos);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'MapType(SeaTunnelDataType, SeaTunnelDataType)' as a member of raw type 'org.apache.seatunnel.api.table.type.MapType'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
            case MAP:
                MapTypeInfo mapTypeInfo = (MapTypeInfo) typeInfo;
                return new MapType(
                        maxcompute2SeaTunnelType(mapTypeInfo.getKeyTypeInfo()),
                        maxcompute2SeaTunnelType(mapTypeInfo.getValueTypeInfo()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                TypeInfo keyTypeInfo = ((SimpleMapTypeInfo) typeInfo).getKeyTypeInfo();
                TypeInfo valueTypeInfo = ((SimpleMapTypeInfo) typeInfo).getValueTypeInfo();
                HashMap<Object, Object> origDataMap = (HashMap<Object, Object>) field;
                origDataMap.forEach(
                        (key, value) ->
```

### UNCHECKED_WARNING
Unchecked call to 'forEachRemaining(Consumer)' as a member of raw type 'java.util.Iterator'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
            case ARRAY:
                ArrayList<Object> origArray = new ArrayList<>();
                ((ArrayList) field).iterator().forEachRemaining(origArray::add);
                SeaTunnelDataType<?> elementType = ((ArrayType<?, ?>) fieldType).getElementType();
                switch (elementType.getSqlType()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                SeaTunnelDataType<?> keyType = ((MapType<?, ?>) fieldType).getKeyType();
                SeaTunnelDataType<?> valueType = ((MapType<?, ?>) fieldType).getValueType();
                HashMap<Object, Object> origDataMap = (HashMap<Object, Object>) field;
                origDataMap.forEach(
                        (key, value) ->
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java

    private static final Map<String, SeaTunnelDataType> MAPPING =
            new HashMap() {
                {
                    put("string", BasicType.STRING_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
            new HashMap() {
                {
                    put("string", BasicType.STRING_TYPE);
                    put("keyword", BasicType.STRING_TYPE);
                    put("text", BasicType.STRING_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                {
                    put("string", BasicType.STRING_TYPE);
                    put("keyword", BasicType.STRING_TYPE);
                    put("text", BasicType.STRING_TYPE);
                    put("binary", BasicType.STRING_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("string", BasicType.STRING_TYPE);
                    put("keyword", BasicType.STRING_TYPE);
                    put("text", BasicType.STRING_TYPE);
                    put("binary", BasicType.STRING_TYPE);
                    put("boolean", BasicType.BOOLEAN_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("keyword", BasicType.STRING_TYPE);
                    put("text", BasicType.STRING_TYPE);
                    put("binary", BasicType.STRING_TYPE);
                    put("boolean", BasicType.BOOLEAN_TYPE);
                    put("byte", BasicType.BYTE_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("text", BasicType.STRING_TYPE);
                    put("binary", BasicType.STRING_TYPE);
                    put("boolean", BasicType.BOOLEAN_TYPE);
                    put("byte", BasicType.BYTE_TYPE);
                    put("short", BasicType.SHORT_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("binary", BasicType.STRING_TYPE);
                    put("boolean", BasicType.BOOLEAN_TYPE);
                    put("byte", BasicType.BYTE_TYPE);
                    put("short", BasicType.SHORT_TYPE);
                    put("integer", BasicType.INT_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("boolean", BasicType.BOOLEAN_TYPE);
                    put("byte", BasicType.BYTE_TYPE);
                    put("short", BasicType.SHORT_TYPE);
                    put("integer", BasicType.INT_TYPE);
                    put("long", BasicType.LONG_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("byte", BasicType.BYTE_TYPE);
                    put("short", BasicType.SHORT_TYPE);
                    put("integer", BasicType.INT_TYPE);
                    put("long", BasicType.LONG_TYPE);
                    put("float", BasicType.FLOAT_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("short", BasicType.SHORT_TYPE);
                    put("integer", BasicType.INT_TYPE);
                    put("long", BasicType.LONG_TYPE);
                    put("float", BasicType.FLOAT_TYPE);
                    put("half_float", BasicType.FLOAT_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("integer", BasicType.INT_TYPE);
                    put("long", BasicType.LONG_TYPE);
                    put("float", BasicType.FLOAT_TYPE);
                    put("half_float", BasicType.FLOAT_TYPE);
                    put("double", BasicType.DOUBLE_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("long", BasicType.LONG_TYPE);
                    put("float", BasicType.FLOAT_TYPE);
                    put("half_float", BasicType.FLOAT_TYPE);
                    put("double", BasicType.DOUBLE_TYPE);
                    put("date", LocalTimeType.LOCAL_DATE_TIME_TYPE);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("float", BasicType.FLOAT_TYPE);
                    put("half_float", BasicType.FLOAT_TYPE);
                    put("double", BasicType.DOUBLE_TYPE);
                    put("date", LocalTimeType.LOCAL_DATE_TIME_TYPE);
                }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
                    put("half_float", BasicType.FLOAT_TYPE);
                    put("double", BasicType.DOUBLE_TYPE);
                    put("date", LocalTimeType.LOCAL_DATE_TIME_TYPE);
                }
            };
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
                                    indexDocsCount.getIndex(),
                                    source,
                                    query,
                                    scrollTime,
                                    scrollSize)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                        .build();
            case SS:
                return AttributeValue.builder().ss((Collection<String>) value).build();
            case NS:
                return AttributeValue.builder()
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                return AttributeValue.builder()
                        .ns(
                                ((Collection<Number>) value)
                                        .stream()
                                                .map(Object::toString)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                return AttributeValue.builder()
                        .bs(
                                ((Collection<Number>) value)
                                        .stream()
                                                .map(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            case M:
                MapType<?, ?> mapType = (MapType<?, ?>) seaTunnelDataType;
                Map<String, Object> map = (Map) value;
                Map<String, AttributeValue> resultMap = new HashMap<>(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List\>'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java

        JsonNode hitsNode = responseJson.get("hits").get("hits");
        List<Map<String, Object>> docs = new ArrayList<>(hitsNode.size());
        scrollResult.setDocs(docs);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.CopyOnWriteArrayList' to 'java.util.List'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final String table;
    private final Properties stageLoadProps;
    private List<String> fileList = new CopyOnWriteArrayList();
    private RecordBuffer buffer;
    private long currentCheckpointID;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                ArrayType arrayType = (ArrayType) seaTunnelDataType;
                Object[] array = (Object[]) fieldValue;
                List<Object> listValues = new ArrayList();
                for (Object item : array) {
                    listValues.add(convert(arrayType.getElementType(), item));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            case MAP:
                MapType mapType = (MapType) seaTunnelDataType;
                Map<String, Object> map = (Map) fieldValue;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String mapKeyName = entry.getKey();
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(@NonNull TableFactoryContext context) {
        CopyTransformConfig copyTransformConfig = CopyTransformConfig.of(context.getOptions());
        CatalogTable catalogTable = context.getCatalogTable();
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/split/SplitTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(@NonNull TableFactoryContext context) {
        SplitTransformConfig splitTransformConfig = SplitTransformConfig.of(context.getOptions());
        CatalogTable catalogTable = context.getCatalogTable();
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/filter/FilterFieldTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(TableFactoryContext context) {
        CatalogTable catalogTable = context.getCatalogTable();
        return () -> new FilterFieldTransform(context.getOptions(), catalogTable);
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/replace/ReplaceTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(TableFactoryContext context) {
        CatalogTable catalogTable = context.getCatalogTable();
        return () -> new ReplaceTransform(context.getOptions(), catalogTable);
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/fieldmapper/FieldMapperTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(TableFactoryContext context) {
        CatalogTable catalogTable = context.getCatalogTable();
        ReadonlyConfig options = context.getOptions();
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyFieldTransform.java`
#### Snippet
```java
                Map newMap = new HashMap();
                for (Object key : map.keySet()) {
                    newMap.put(
                            clone(mapType.getKeyType(), key),
                            clone(mapType.getValueType(), map.get(key)));
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'org.apache.seatunnel.api.table.connector.TableTransform', required 'org.apache.seatunnel.api.table.connector.TableTransform'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/filterrowkind/FilterRowKindTransformFactory.java`
#### Snippet
```java

    @Override
    public TableTransform createTransform(TableFactoryContext context) {
        CatalogTable catalogTable = context.getCatalogTable();
        return () -> new FilterRowKindTransform(context.getOptions(), catalogTable);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.seatunnel.api.common.PluginIdentifierInterface' to 'T'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
                        pluginIdentifierInstance.getPluginName(),
                        pluginIdentifier.getPluginName())) {
                    return (T) pluginIdentifierInstance;
                }
            } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    @Override
    public T createPluginInstance(PluginIdentifier pluginIdentifier) {
        return (T) createPluginInstance(pluginIdentifier, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    @Override
    public T createPluginInstance(PluginIdentifier pluginIdentifier) {
        return (T) createPluginInstance(pluginIdentifier, Collections.EMPTY_LIST);
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Config`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/PrepareFailException.java`
#### Snippet
```java
import org.apache.seatunnel.common.exception.SeaTunnelRuntimeException;

/** This exception will throw when {@link SeaTunnelPluginLifeCycle#prepare(Config)} failed. */
public class PrepareFailException extends SeaTunnelRuntimeException {

```

### JavadocReference
Cannot resolve symbol `org.apache.seatunnel.shade.com.typesafe.config.Config`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ConfigShade.java`
#### Snippet
```java
/**
 * The interface that provides the ability to encrypt and decrypt {@link
 * org.apache.seatunnel.shade.com.typesafe.config.Config}
 */
public interface ConfigShade {
```

### JavadocReference
Cannot resolve symbol `Config`
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/ConfigBuilder.java`
#### Snippet
```java
import java.util.Optional;

/** Used to build the {@link Config} from config file. */
@Slf4j
public class ConfigBuilder {
```

### JavadocReference
Cannot resolve symbol `Config`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigMergeable.java`
#### Snippet
```java

/**
 * Copy from {@link com.typesafe.config.ConfigMergeable}, in order to make the {@link Config} can be
 * serialized
 */
```

### JavadocReference
Cannot resolve symbol `ConfigIncluder`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java

    /**
     * Prepends a {@link ConfigIncluder} which customizes how includes are handled. To prepend your
     * includer, the library calls {@link ConfigIncluder#withFallback} on your includer to append
     * the existing includer to it.
```

### JavadocReference
Cannot resolve symbol `ConfigIncluder`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Prepends a {@link ConfigIncluder} which customizes how includes are handled. To prepend your
     * includer, the library calls {@link ConfigIncluder#withFallback} on your includer to append
     * the existing includer to it.
     *
```

### JavadocReference
Cannot resolve symbol `withFallback`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Prepends a {@link ConfigIncluder} which customizes how includes are handled. To prepend your
     * includer, the library calls {@link ConfigIncluder#withFallback} on your includer to append
     * the existing includer to it.
     *
```

### JavadocReference
Cannot resolve symbol `ConfigIncluder`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java

    /**
     * Set a {@link ConfigIncluder} which customizes how includes are handled. null means to use the
     * default includer.
     *
```

### JavadocReference
Cannot resolve symbol `ConfigSyntax`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Set the file format. If set to null, try to guess from any available filename extension; if
     * guessing fails, assume {@link ConfigSyntax#CONF}.
     *
     * @param syntax a syntax or {@code null} for best guess
```

### JavadocReference
Cannot resolve symbol `CONF`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Set the file format. If set to null, try to guess from any available filename extension; if
     * guessing fails, assume {@link ConfigSyntax#CONF}.
     *
     * @param syntax a syntax or {@code null} for best guess
```

### JavadocReference
Cannot resolve symbol `ConfigOrigin`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
     * something like the filename, but if you provide just an input stream you might want to
     * improve on it. Set to null to allow the library to come up with something automatically. This
     * description is the basis for the {@link ConfigOrigin} of the parsed values.
     *
     * @param originDescription description to put in the {@link ConfigOrigin}
```

### JavadocReference
Cannot resolve symbol `ConfigOrigin`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
     * description is the basis for the {@link ConfigOrigin} of the parsed values.
     *
     * @param originDescription description to put in the {@link ConfigOrigin}
     * @return options with the origin description set
     */
```

### JavadocReference
Cannot resolve symbol `ConfigIncluder`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java

    /**
     * Appends a {@link ConfigIncluder} which customizes how includes are handled. To append, the
     * library calls {@link ConfigIncluder#withFallback} on the existing includer.
     *
```

### JavadocReference
Cannot resolve symbol `ConfigIncluder`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Appends a {@link ConfigIncluder} which customizes how includes are handled. To append, the
     * library calls {@link ConfigIncluder#withFallback} on the existing includer.
     *
     * @param includer the includer to append (may not be null)
```

### JavadocReference
Cannot resolve symbol `withFallback`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/ConfigParseOptions.java`
#### Snippet
```java
    /**
     * Appends a {@link ConfigIncluder} which customizes how includes are handled. To append, the
     * library calls {@link ConfigIncluder#withFallback} on the existing includer.
     *
     * @param includer the includer to append (may not be null)
```

### JavadocReference
Cannot resolve symbol `JsonNode`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java

    /**
     * Runtime converter that converts {@link JsonNode}s into objects of internal data structures.
     */
    private final JsonToRowConverters.JsonToRowConverter runtimeConverter;
```

### JavadocReference
Cannot resolve symbol `JsonNode`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java

/**
 * Tool class used to convert from {@link JsonNode} to {@link
 * org.apache.seatunnel.api.table.type.SeaTunnelRow}. *
 */
```

### JavadocReference
Cannot resolve symbol `JsonNode`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java

    /**
     * Runtime converter that converts {@link JsonNode}s into objects of internal data structures.
     */
    @FunctionalInterface
```

### JavadocReference
Cannot resolve symbol `STOP_MODE`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/option/StopMode.java`
#### Snippet
```java
package org.apache.seatunnel.connectors.cdc.base.option;

/** Stop mode for the CDC Connectors, see {@link SourceOptions#STOP_MODE}. */
public enum StopMode {
    /** Stop from the latest offset. */
```

### JavadocReference
Cannot resolve symbol `STARTUP_MODE`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/option/StartupMode.java`
#### Snippet
```java
package org.apache.seatunnel.connectors.cdc.base.option;

/** Startup modes for the CDC Connectors, see {@link SourceOptions#STARTUP_MODE}. */
public enum StartupMode {
    /** Startup from the earliest offset possible. */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/SqlType.java`
#### Snippet
```java
    TIMESTAMP,
    ROW,
    MULTIPLE_ROW;
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinatorStatus.java`
#### Snippet
```java
    CANCELED,

    FAILED;
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/serializable/RecordSerializer.java`
#### Snippet
```java
    enum RecordDataType {
        CHECKPOINT_BARRIER,
        SEATUNNEL_ROW;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/psql/PostgresDataTypeConvertor.java`
#### Snippet
```java
                int precision =
                        MapUtils.getInteger(dataTypeProperties, PRECISION, DEFAULT_PRECISION);
                ;
                int scale = MapUtils.getInteger(dataTypeProperties, SCALE, DEFAULT_SCALE);
                return new DecimalType(precision, scale);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/config/HbaseConfig.java`
#### Snippet
```java
    public enum EnCoding {
        UTF8,
        GBK;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/config/HbaseConfig.java`
#### Snippet
```java
    public enum NullMode {
        SKIP,
        EMPTY;
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
}

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

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/config/SinkConfig.java`
#### Snippet
```java
    public enum StreamLoadFormat {
        CSV,
        JSON;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/exception/ElasticsearchConnectorErrorCode.java`
#### Snippet
```java
    CREATE_INDEX_FAILED("ELASTICSEARCH-07", "Create elasticsearch index failed"),
    ES_FIELD_TYPE_NOT_SUPPORT("ELASTICSEARCH-08", "Not support the elasticsearch field type");
    ;

    private final String code;
```

## RuleId[id=DataFlowIssue]
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
Method invocation `toString` will produce `NullPointerException`
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/JsonUtils.java`
#### Snippet
```java
                return node.asText();
            } else {
                return node.toString();
            }
        }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                v = parseConcatenation((ConfigNodeConcatenation) n);
            } else {
                throw parseError("Expecting a value but got wrong node type: " + n.getClass());
            }

```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                if (node instanceof ConfigNodeComment) {
                    comments.add(((ConfigNodeComment) node).commentText());
                    lastWasNewLine = false;
                } else if (node instanceof ConfigNodeSingleToken) {
                    Token t = ((ConfigNodeSingleToken) node).token();
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                AbstractConfigNode node = nodes.get(i);
                if (node instanceof ConfigNodeComment) {
                    lastWasNewline = false;
                    comments.add(((ConfigNodeComment) node).commentText());
                } else if (node instanceof ConfigNodeSingleToken
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                if (node instanceof ConfigNodeComment) {
                    comments.add(((ConfigNodeComment) node).commentText());
                    lastWasNewLine = false;
                } else if (node instanceof ConfigNodeSingleToken
                        && Tokens.isNewline(((ConfigNodeSingleToken) node).token())) {
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                AbstractConfigNode node = nodes.get(i);
                if (node instanceof ConfigNodeComment) {
                    lastWasNewline = false;
                    comments.add(((ConfigNodeComment) node).commentText());
                } else if (node instanceof ConfigNodeSingleToken
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
Variable is already assigned to this value
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
                v = ((AbstractConfigObject) v).withOnlyPathOrNull(next);
            } else {
                v = null;
            }
        }
```

### DataFlowIssue
Argument `config` might be null
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
            LinkedHashMap<String, List<Tuple2<CatalogTable, Action>>> tableWithActionMap) {
        Config config = transforms.poll();
        final ReadonlyConfig readonlyConfig = ReadonlyConfig.fromConfig(config);
        final String factoryId = getFactoryId(readonlyConfig);
        // get factory urls
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java

        Set<Action> inputActions =
                inputs.stream()
                        .map(Tuple2::_2)
                        .collect(Collectors.toCollection(LinkedHashSet::new));
```

### DataFlowIssue
Unboxing of `RetryUtils.retryWithException( () -> nodeEngine.getMasterAddress().equals(nodeEn...` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
        // must retry until the cluster have master node
        try {
            return RetryUtils.retryWithException(
                    () -> nodeEngine.getMasterAddress().equals(nodeEngine.getThisAddress()),
                    new RetryUtils.RetryMaterial(
                            Constant.OPERATION_RETRY_TIME,
                            true,
                            exception -> exception instanceof NullPointerException && isRunning,
                            Constant.OPERATION_RETRY_SLEEP));
        } catch (InterruptedException e) {
            LOGGER.info("master node check interrupted");
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
                            JobStatus jobStatus = JobStatus.FAILING;
                            if (failedPipelineNum.get() > 0) {
                                jobStatus = JobStatus.FAILING;
                                updateJobState(jobStatus);
                            } else if (canceledPipelineNum.get() > 0) {
```

### DataFlowIssue
Method invocation `isEndState` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
        else if (ExecutionState.CANCELING.equals(executionState)) {
            noticeTaskExecutionServiceCancel();
        } else if (executionState.isEndState()) {
            this.taskFuture.complete(new TaskExecutionState(taskGroupLocation, executionState));
        }
```

### DataFlowIssue
Method invocation `setJobMaster` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
                        jobCheckpointConfig);
        this.physicalPlan = planTuple.f0();
        this.physicalPlan.setJobMaster(this);
        this.checkpointPlanMap = planTuple.f1();
        if (!canRestoreAgain) {
```

### DataFlowIssue
Condition `out instanceof HdfsDataOutputStream` is redundant and can be replaced with a null check
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/wal/writer/HdfsWriter.java`
#### Snippet
```java
    public void flush() throws IOException {
        // hsync to flag
        if (out instanceof HdfsDataOutputStream) {
            ((HdfsDataOutputStream) out)
                    .hsync(EnumSet.of(HdfsDataOutputStream.SyncFlag.UPDATE_LENGTH));
```

### DataFlowIssue
Condition `out.getWrappedStream() instanceof DFSOutputStream` is redundant and can be replaced with a null check
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/wal/writer/HdfsWriter.java`
#### Snippet
```java
                    .hsync(EnumSet.of(HdfsDataOutputStream.SyncFlag.UPDATE_LENGTH));
        }
        if (out.getWrappedStream() instanceof DFSOutputStream) {
            ((DFSOutputStream) out.getWrappedStream())
                    .hsync(EnumSet.of(HdfsDataOutputStream.SyncFlag.UPDATE_LENGTH));
```

### DataFlowIssue
Unboxing of `tuple.f1()` may produce `NullPointerException`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
                                    return;
                                }
                                for (int i = tuple.f1();
                                        i < actionState.getParallelism();
                                        i += currentParallelism) {
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        final SplitAssigner splitAssigner;
        if (checkpointState instanceof HybridPendingSplitsState) {
            checkpointState = restore(capturedTables, (HybridPendingSplitsState) checkpointState);
            SnapshotPhaseState checkpointSnapshotState =
                    ((HybridPendingSplitsState) checkpointState).getSnapshotPhaseState();
```

### DataFlowIssue
Method invocation `getOrigin` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSource.java`
#### Snippet
```java
        JdbcUrlUtil.UrlInfo urlInfo =
                SqlServerURLParser.parse(config.get(JdbcCatalogOptions.BASE_URL));
        configFactory.originUrl(urlInfo.getOrigin());
        configFactory.hostname(urlInfo.getHost());
        configFactory.port(urlInfo.getPort());
```

### DataFlowIssue
Method invocation `getStartLsn` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
                                                                schemaChangeCheckpoints
                                                                        .peek()
                                                                        .getStartLsn())
                                                >= 0) {
                                            migrateTable(schemaChangeCheckpoints, offsetContext);
```

### DataFlowIssue
Method invocation `getSourceTableId` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
        Table tableSchema = metadataConnection.getTableSchemaFromTable(newTable);
        dispatcher.dispatchSchemaChangeEvent(
                newTable.getSourceTableId(),
                new SqlServerSchemaChangeEventEmitter(
                        offsetContext, newTable, tableSchema, SchemaChangeEventType.ALTER));
```

### DataFlowIssue
Method invocation `toUri` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/system/SeaTunnelFTPFileSystem.java`
#### Snippet
```java
            created = parent == null || mkdirs(client, parent, FsPermission.getDirDefault());
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
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### DataFlowIssue
Method invocation `getDefaultDatabase` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/sqlserver/SqlServerCatalogFactory.java`
#### Snippet
```java
        String url = options.get(JdbcCatalogOptions.BASE_URL);
        JdbcUrlUtil.UrlInfo urlInfo = SqlServerURLParser.parse(url);
        Optional<String> defaultDatabase = urlInfo.getDefaultDatabase();
        if (!defaultDatabase.isPresent()) {
            throw new OptionValidationException(JdbcCatalogOptions.BASE_URL);
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/sqlserver/SqlServerURLParser.java`
#### Snippet
```java
                        .map(e -> e.getKey() + "=" + e.getValue())
                        .collect(Collectors.joining(";", ";", ""));
        suffix = Optional.ofNullable(suffix).orElse("");
        return new JdbcUrlUtil.UrlInfo(
                url,
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
Method invocation `getEntity` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/committer/DorisCommitter.java`
#### Snippet
```java

        ObjectMapper mapper = new ObjectMapper();
        String loadResult = EntityUtils.toString(response.getEntity());
        Map<String, String> res =
                mapper.readValue(loadResult, new TypeReference<HashMap<String, String>>() {});
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
            throw new IOException(e);
        } finally {
            in.close();
        }
        return result.toString();
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
                    builder.time(
                            ((LocalDateTime) time)
                                    .atZone(ZoneOffset.UTC)
                                    .toInstant()
                                    .toEpochMilli(),
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
Variable is already assigned to this value
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqAdminUtil.java`
#### Snippet
```java
            if (e instanceof MQClientException) {
                if (((MQClientException) e).getResponseCode() == ResponseCode.TOPIC_NOT_EXIST) {
                    foundTopicRouteInfo = false;
                } else {
                    throw new RocketMqConnectorException(
```

### DataFlowIssue
Unboxing of `config.getMaxMessageSize()` may produce `NullPointerException`
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/common/RocketMqAdminUtil.java`
#### Snippet
```java
            producer.setMaxMessageSize(config.getMaxMessageSize());
        }
        if (config.getSendMsgTimeout() != null && config.getMaxMessageSize() > 0) {
            producer.setSendMsgTimeout(config.getSendMsgTimeout());
        }
```

### DataFlowIssue
Argument `split` might be null
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSourceReader.java`
#### Snippet
```java
            synchronized (output.getCheckpointLock()) {
                StarRocksSourceSplit split = pendingSplits.poll();
                read(split, output);
            }
        }
```

### DataFlowIssue
Casting `value` to `byte[]` will produce `ClassCastException` for any non-null value
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                                                        number ->
                                                                SdkBytes.fromByteArray(
                                                                        (byte[]) value))
                                                .collect(Collectors.toList()))
                        .build();
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
        TableSchema.Builder builder = TableSchema.builder();
        if (inputCatalogTable.getTableSchema().getPrimaryKey() != null) {
            builder = builder.primaryKey(inputCatalogTable.getTableSchema().getPrimaryKey().copy());
        }
        builder = builder.constraintKey(copiedConstraintKeys);
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
            builder = builder.primaryKey(inputCatalogTable.getTableSchema().getPrimaryKey().copy());
        }
        builder = builder.constraintKey(copiedConstraintKeys);
        List<Column> columns =
                inputCatalogTable.getTableSchema().getColumns().stream()
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        TableSchema.Builder builder = TableSchema.builder();
        if (inputCatalogTable.getTableSchema().getPrimaryKey() != null) {
            builder = builder.primaryKey(inputCatalogTable.getTableSchema().getPrimaryKey().copy());
        }
        builder = builder.constraintKey(copiedConstraintKeys);
```

### DataFlowIssue
Variable is already assigned to this value
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
            builder = builder.primaryKey(inputCatalogTable.getTableSchema().getPrimaryKey().copy());
        }
        builder = builder.constraintKey(copiedConstraintKeys);
        List<Column> columns =
                inputCatalogTable.getTableSchema().getColumns().stream()
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDag.java`
#### Snippet
```java

        logicalVertexMap.values().stream()
                .forEach(
                        v -> {
                            JsonObject vertex = new JsonObject();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDag.java`
#### Snippet
```java
        JsonArray edges = new JsonArray();
        this.edges.stream()
                .forEach(
                        e -> {
                            JsonObject edge = new JsonObject();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java
        Map<String, String> healthMetricsMap = new HashMap<>();
        members.stream()
                .forEach(
                        member -> {
                            String metrics =
```

### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/AbstractCheckpointStorage.java`
#### Snippet
```java
                });
        return latestPipelineMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());
    }
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
            final String captureName = m.group(1);
            LOGGER.info("Table is no longer captured with capture instance {}", captureName);
            return Arrays.asList(currentChangeTables).stream()
                    .filter(x -> !x.getCaptureInstance().equals(captureName))
                    .collect(Collectors.toList())
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
Can be replaced with 'java.util.HashSet' constructor
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/source/RocketMqSourceSplitEnumerator.java`
#### Snippet
```java
    @Override
    public RocketMqSourceState snapshotState(long checkpointId) throws Exception {
        return new RocketMqSourceState(assignedSplit.values().stream().collect(Collectors.toSet()));
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
                            fieldNames.stream()
                                    .map(f -> String.format("`%s`", f))
                                    .collect(Collectors.toList())));
        }
        if (null != sinkConfig.getStreamLoadProps()) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
                                assignmentForReader.stream()
                                        .map(p -> p.getSplitId())
                                        .collect(Collectors.toList())),
                        reader);
                try {
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Stream.of()'
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/JdbcRowConverter.java`
#### Snippet
```java
                                    new IntInjectFunction(),
                                    new StringInjectFunction())
                            .stream()
                            .filter(f -> f.isCurrentFieldType(unwrapCommonPrefix(fieldType)))
                            .findFirst()
```

## RuleId[id=BoxingBoxedValue]
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            log.warn("source request split failed {}", e);
            throw new RuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            log.warn("source register failed {}", e);
            throw new RuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            log.warn("source request split failed {}", e);
            throw new RuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            log.warn("source request split failed [{}]", e);
            throw new RuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
                    .get();
        } catch (Exception e) {
            log.warn("source close failed {}", e);
            throw new RuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (at least 1)
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-local-file/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/localfile/LocalFileStorage.java`
#### Snippet
```java
                });
        if (latestPipelineFiles.isEmpty()) {
            log.info("No checkpoint found for this job,  the job id:{} " + jobId);
        }
        return latestPipelineFiles;
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (at least 1)
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java

        if (latestPipelineStates.isEmpty()) {
            log.info("No checkpoint found for this job,  the job id:{} " + jobId);
        }
        return latestPipelineStates;
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
        kuduClient = kuduClientBuilder.build();

        log.info("The Kudu client is successfully initialized", kuduMaster, kuduClient);
    }

```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `seatunnel-connectors-v2/connector-slack/src/main/java/org/apache/seatunnel/connectors/seatunnel/slack/sink/SlackWriter.java`
#### Snippet
```java
            Thread.sleep(POST_MSG_WAITING_TIME);
        } catch (Exception e) {
            log.error("Write to Slack Fail.", ExceptionUtils.getMessage(e));
            throw new SlackConnectorException(
                    SlackConnectorErrorCode.WRITE_TO_SLACK_CHANNEL_FAILED, e);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CHECKPOINT_INTERVAL' is still used
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/utils/ConfigKeyName.java`
#### Snippet
```java
    public static final String MAX_PARALLELISM = "execution.max-parallelism";

    @Deprecated public static final String CHECKPOINT_INTERVAL = "execution.checkpoint.interval";
    public static final String CHECKPOINT_MODE = "execution.checkpoint.mode";
    public static final String CHECKPOINT_TIMEOUT = "execution.checkpoint.timeout";
```

### DeprecatedIsStillUsed
Deprecated member 'checkEdge' is still used
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/ConfigParserUtil.java`
#### Snippet
```java

    @Deprecated
    private static void checkEdge(ReadonlyConfig leftConfig, ReadonlyConfig rightConfig) {
        String tableId = getTableId(leftConfig);
        String inputTableId = getInputIds(rightConfig).get(0);
```

### DeprecatedIsStillUsed
Deprecated member 'findLast' is still used
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java

    @Deprecated
    private static <T> T findLast(LinkedHashMap<?, T> map) {
        int size = map.size();
        int i = 1;
```

### DeprecatedIsStillUsed
Deprecated member 'extractSubConfig' is still used
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/config/TypesafeConfigUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Config extractSubConfig(Config source, String prefix, boolean keepPrefix) {

        // use LinkedHashMap to keep insertion order
```

### DeprecatedIsStillUsed
Deprecated member 'getJobMetrics' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java

    @Deprecated
    public String getJobMetrics(Long jobId) {
        return jobClient.getJobMetrics(jobId);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'deployLocalTask' is still used
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

    @Deprecated
    public PassiveCompletableFuture<TaskExecutionState> deployLocalTask(
            @NonNull TaskGroup taskGroup) {
        return deployLocalTask(taskGroup, Thread.currentThread().getContextClassLoader());
```

### DeprecatedIsStillUsed
Deprecated member 'DEST_FIELD' is still used
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyTransformConfig.java`
#### Snippet
```java

    @Deprecated
    public static final Option<String> DEST_FIELD =
            Options.key("dest_field")
                    .stringType()
```

### DeprecatedIsStillUsed
Deprecated member 'SRC_FIELD' is still used
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/copy/CopyTransformConfig.java`
#### Snippet
```java
public class CopyTransformConfig implements Serializable {
    @Deprecated
    public static final Option<String> SRC_FIELD =
            Options.key("src_field")
                    .stringType()
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/Measurement.java`
#### Snippet
```java
        String tags =
                this.tags.entrySet().stream()
                        .sorted(Comparator.comparing(Map.Entry::getKey))
                        .map(e -> e.getKey() + "=" + e.getValue())
                        .collect(Collectors.joining(", "));
```

### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/JobMetrics.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        metrics.entrySet().stream()
                .sorted(Comparator.comparing(Entry::getKey))
                .forEach(
                        mainEntry -> {
```

### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/JobMetrics.java`
#### Snippet
```java
                                    .entrySet()
                                    .stream()
                                    .sorted(Comparator.comparing(Entry::getKey))
                                    .forEach(
                                            e -> {
```

## RuleId[id=RedundantCollectionOperation]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/serializeable/ConfigDataSerializerHook.java`
#### Snippet
```java
        @Override
        public IdentifiedDataSerializable create(int typeId) {
            switch (typeId) {
                case JOB_CONFIG:
                    return new JobConfig();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/config/S3Conf.java`
#### Snippet
```java

    private String switchHdfsImpl() {
        switch (SCHEMA) {
            case S3A_SCHEMA:
                return HDFS_S3A_IMPL;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/source/HttpSource.java`
#### Snippet
```java
                                        .toUpperCase(Locale.ROOT));
            }
            switch (format) {
                case JSON:
                    this.deserializationSchema =
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Condition.java`
#### Snippet
```java
            if (bracket) {
                builder = new StringBuilder(String.format("(%s)", builder));
                bracket = false;
            }
            if (cur.hasNext()) {
                if (cur.next.hasNext() && !cur.and.equals(cur.next.and)) {
                    bracket = true;
                }
                builder.append(cur.and ? " && " : " || ");
            }
            cur = cur.next;
```

### DuplicatedCode
Duplicated code
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
lastWasNewline = false;
                    Path path = ((ConfigNodeField) node).path().value();
                    comments.addAll(((ConfigNodeField) node).comments());

                    // path must be on-stack while we parse the value
                    pathStack.push(path);
                    if (((ConfigNodeField) node).separator() == Tokens.PLUS_EQUALS) {
                        // we really should make this work, but for now throwing
                        // an exception is better than producing an incorrect
                        // result. See
                        // https://github.com/lightbend/config/issues/160
                        if (arrayCount > 0) {
                            throw parseError(
                                    "Due to current limitations of the config parser, += does not work nested inside a list. "
                                            + "+= expands to a ${} substitution and the path in ${} cannot currently refer to list elements. "
                                            + "You might be able to move the += outside of the list and then refer to it from inside the list with ${}.");
                        }

                        // because we will put it in an array after the fact so
                        // we want this to be incremented during the parseValue
                        // below in order to throw the above exception.
                        arrayCount += 1;
                    }

                    AbstractConfigNodeValue valueNode;
                    AbstractConfigValue newValue;

                    valueNode = ((ConfigNodeField) node).value();

                    // comments from the key token go to the value token
                    newValue = parseValue(valueNode, comments);

                    if (((ConfigNodeField) node).separator() == Tokens.PLUS_EQUALS) {
                        arrayCount -= 1;

                        List<AbstractConfigValue> concat = new ArrayList<>(2);
                        AbstractConfigValue previousRef =
                                new ConfigReference(
                                        newValue.origin(),
                                        new SubstitutionExpression(
                                                fullCurrentPath(), true /* optional */));
                        AbstractConfigValue list =
                                new SimpleConfigList(
                                        newValue.origin(), Collections.singletonList(newValue));
                        concat.add(previousRef);
                        concat.add(list);
                        newValue = ConfigConcatenation.concatenate(concat);
                    }

                    // Grab any trailing comments on the same line
                    if (i < nodes.size() - 1) {
                        i++;
                        while (i < nodes.size()) {
                            if (nodes.get(i) instanceof ConfigNodeComment) {
                                ConfigNodeComment comment = (ConfigNodeComment) nodes.get(i);
                                newValue =
                                        newValue.withOrigin(
                                                newValue.origin()
                                                        .appendComments(
                                                                Collections.singletonList(
                                                                        comment.commentText())));
                                break;
                            } else if (nodes.get(i) instanceof ConfigNodeSingleToken) {
                                ConfigNodeSingleToken curr = (ConfigNodeSingleToken) nodes.get(i);
                                if (curr.token() == Tokens.COMMA
                                        || Tokens.isIgnoredWhitespace(curr.token())) {
                                    // keep searching, as there could still be a comment
                                } else {
                                    i--;
                                    break;
                                }
                            } else {
                                i--;
                                break;
                            }
                            i++;
                        }
                    }

                    pathStack.pop();

                    String key = path.first();
                    Path remaining = path.remainder();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializationConverters.java`
#### Snippet
```java
            String fieldName = fieldNames[i];
            Object fieldValue = struct.get(fieldName);
            Field field = schema.field(fieldName);
            if (field == null) {
                row.setField(i, null);
            } else {
                Schema fieldSchema = field.schema();
                Object convertedField =
                        SeaTunnelRowDebeziumDeserializationConverters.convertField(
                                physicalConverters[i], fieldValue, fieldSchema);
                row.setField(i, convertedField);
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
            long start = System.currentTimeMillis();

            Table table = dialect.queryTableSchema(jdbc, tableId).getTable();
            Column splitColumn = getSplitColumn(table);
            final List<ChunkRange> chunks;
            try {
                chunks = splitTableIntoChunks(jdbc, tableId, splitColumn);
            } catch (SQLException e) {
                throw new RuntimeException("Failed to split chunks for table " + tableId, e);
            }

            // convert chunks into splits
            List<SnapshotSplit> splits = new ArrayList<>();
            SeaTunnelRowType splitType = getSplitType(splitColumn);
            for (int i = 0; i < chunks.size(); i++) {
                ChunkRange chunk = chunks.get(i);
                SnapshotSplit split =
                        createSnapshotSplit(
                                jdbc,
                                tableId,
                                i,
                                splitType,
                                chunk.getChunkStart(),
                                chunk.getChunkEnd());
                splits.add(split);
            }

            long end = System.currentTimeMillis();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        final String splitColumnName = splitColumn.name();
        final Object[] minMax = queryMinMax(jdbc, tableId, splitColumnName);
        final Object min = minMax[0];
        final Object max = minMax[1];
        if (min == null || max == null || min.equals(max)) {
            // empty table, or only one row, return full table scan as a chunk
            return Collections.singletonList(ChunkRange.all());
        }

        final int chunkSize = sourceConfig.getSplitSize();
        final double distributionFactorUpper = sourceConfig.getDistributionFactorUpper();
        final double distributionFactorLower = sourceConfig.getDistributionFactorLower();

        if (isEvenlySplitColumn(splitColumn)) {
            long approximateRowCnt = queryApproximateRowCnt(jdbc, tableId);
            double distributionFactor =
                    calculateDistributionFactor(tableId, min, max, approximateRowCnt);

            boolean dataIsEvenlyDistributed =
                    doubleCompare(distributionFactor, distributionFactorLower) >= 0
                            && doubleCompare(distributionFactor, distributionFactorUpper) <= 0;

            if (dataIsEvenlyDistributed) {
                // the minimum dynamic chunk size is at least 1
                final int dynamicChunkSize = Math.max((int) (distributionFactor * chunkSize), 1);
                return splitEvenlySizedChunks(
                        tableId, min, max, approximateRowCnt, chunkSize, dynamicChunkSize);
            } else {
                return splitUnevenlySizedChunks(
                        jdbc, tableId, splitColumnName, min, max, chunkSize);
            }
        } else {
            return splitUnevenlySizedChunks(jdbc, tableId, splitColumnName, min, max, chunkSize);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        if (approximateRowCnt <= chunkSize) {
            // there is no more than one chunk, return full table as a chunk
            return Collections.singletonList(ChunkRange.all());
        }

        final List<ChunkRange> splits = new ArrayList<>();
        Object chunkStart = null;
        Object chunkEnd = ObjectUtils.plus(min, dynamicChunkSize);
        while (ObjectUtils.compare(chunkEnd, max) <= 0) {
            splits.add(ChunkRange.of(chunkStart, chunkEnd));
            chunkStart = chunkEnd;
            try {
                chunkEnd = ObjectUtils.plus(chunkEnd, dynamicChunkSize);
            } catch (ArithmeticException e) {
                // Stop chunk split to avoid dead loop when number overflows.
                break;
            }
        }
        // add the ending split
        splits.add(ChunkRange.of(chunkStart, null));
        return splits;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        final List<ChunkRange> splits = new ArrayList<>();
        Object chunkStart = null;
        Object chunkEnd = nextChunkEnd(jdbc, min, tableId, splitColumnName, max, chunkSize);
        int count = 0;
        while (chunkEnd != null && ObjectUtils.compare(chunkEnd, max) <= 0) {
            // we start from [null, min + chunk_size) and avoid [null, min)
            splits.add(ChunkRange.of(chunkStart, chunkEnd));
            // may sleep a while to avoid DDOS on MySQL server
            maySleep(count++, tableId);
            chunkStart = chunkEnd;
            chunkEnd = nextChunkEnd(jdbc, chunkEnd, tableId, splitColumnName, max, chunkSize);
        }
        // add the ending split
        splits.add(ChunkRange.of(chunkStart, null));
        return splits;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        Object chunkEnd =
                queryNextChunkMax(jdbc, tableId, splitColumnName, chunkSize, previousChunkEnd);
        if (Objects.equals(previousChunkEnd, chunkEnd)) {
            // we don't allow equal chunk start and end,
            // should query the next one larger than chunkEnd
            chunkEnd = queryMin(jdbc, tableId, splitColumnName, chunkEnd);
        }
        if (ObjectUtils.compare(chunkEnd, max) >= 0) {
            return null;
        } else {
            return chunkEnd;
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/eumerator/MySqlChunkSplitter.java`
#### Snippet
```java
        if (!min.getClass().equals(max.getClass())) {
            throw new IllegalStateException(
                    String.format(
                            "Unsupported operation type, the MIN value type %s is different with MAX value type %s.",
                            min.getClass().getSimpleName(), max.getClass().getSimpleName()));
        }
        if (approximateRowCnt == 0) {
            return Double.MAX_VALUE;
        }
        BigDecimal difference = ObjectUtils.minus(max, min);
        // factor = (max - min + 1) / rowCount
        final BigDecimal subRowCnt = difference.add(BigDecimal.valueOf(1));
        double distributionFactor =
                subRowCnt.divide(new BigDecimal(approximateRowCnt), 4, ROUND_CEILING).doubleValue();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java
        List<TableChanges.TableChange> engineHistory = new ArrayList<>();
        // TODO: support save table schema
        if (sourceSplitBase instanceof SnapshotSplit) {
            SnapshotSplit snapshotSplit = (SnapshotSplit) sourceSplitBase;
            engineHistory.add(
                    dataSourceDialect.queryTableSchema(connection, snapshotSplit.getTableId()));
        } else {
            IncrementalSplit incrementalSplit = (IncrementalSplit) sourceSplitBase;
            for (TableId tableId : incrementalSplit.getTableIds()) {
                engineHistory.add(dataSourceDialect.queryTableSchema(connection, tableId));
            }
        }

        EmbeddedDatabaseHistory.registerHistory(
                sourceConfig
                        .getDbzConfiguration()
                        .getString(EmbeddedDatabaseHistory.DATABASE_HISTORY_INSTANCE_NAME),
                engineHistory);
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/binlog/MySqlBinlogFetchTask.java`
#### Snippet
```java
            Map<String, String> offsetStrMap = new HashMap<>();
            for (Map.Entry<String, ?> entry : offset.entrySet()) {
                offsetStrMap.put(
                        entry.getKey(),
                        entry.getValue() == null ? null : entry.getValue().toString());
            }
            return new BinlogOffset(offsetStrMap);
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java
        TemporalPrecisionMode timePrecisionMode = dbzMySqlConfig.getTemporalPrecisionMode();
        JdbcValueConverters.DecimalMode decimalMode = dbzMySqlConfig.getDecimalMode();
        String bigIntUnsignedHandlingModeStr =
                dbzMySqlConfig
                        .getConfig()
                        .getString(MySqlConnectorConfig.BIGINT_UNSIGNED_HANDLING_MODE);
        MySqlConnectorConfig.BigIntUnsignedHandlingMode bigIntUnsignedHandlingMode =
                MySqlConnectorConfig.BigIntUnsignedHandlingMode.parse(
                        bigIntUnsignedHandlingModeStr);
        JdbcValueConverters.BigIntUnsignedMode bigIntUnsignedMode =
                bigIntUnsignedHandlingMode.asBigIntUnsignedMode();

        boolean timeAdjusterEnabled =
                dbzMySqlConfig.getConfig().getBoolean(MySqlConnectorConfig.ENABLE_TIME_ADJUSTER);
        return new MySqlValueConverters(
                decimalMode,
                timePrecisionMode,
                bigIntUnsignedMode,
                dbzMySqlConfig.binaryHandlingMode(),
                timeAdjusterEnabled ? MySqlValueConverters::adjustTemporal : x -> x,
                MySqlValueConverters::defaultParsingErrorHandler);
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        final String minQuery =
                String.format(
                        "SELECT MIN(%s) FROM %s WHERE %s > ?",
                        quote(columnName), quote(tableId), quote(columnName));
        return jdbc.prepareQueryAndMap(
                minQuery,
                ps -> ps.setObject(1, excludedLowerBound),
                rs -> {
                    if (!rs.next()) {
                        // this should never happen
                        throw new SQLException(
                                String.format(
                                        "No result returned after running query [%s]", minQuery));
                    }
                    return rs.getObject(1);
                });
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        final String condition;

        if (isFirstSplit && isLastSplit) {
            condition = null;
        } else if (isFirstSplit) {
            final StringBuilder sql = new StringBuilder();
            addPrimaryKeyColumnsToCondition(rowType, sql, " <= ?");
            if (isScanningData) {
                sql.append(" AND NOT (");
                addPrimaryKeyColumnsToCondition(rowType, sql, " = ?");
                sql.append(")");
            }
            condition = sql.toString();
        } else if (isLastSplit) {
            final StringBuilder sql = new StringBuilder();
            addPrimaryKeyColumnsToCondition(rowType, sql, " >= ?");
            condition = sql.toString();
        } else {
            final StringBuilder sql = new StringBuilder();
            addPrimaryKeyColumnsToCondition(rowType, sql, " >= ?");
            if (isScanningData) {
                sql.append(" AND NOT (");
                addPrimaryKeyColumnsToCondition(rowType, sql, " = ?");
                sql.append(")");
            }
            sql.append(" AND ");
            addPrimaryKeyColumnsToCondition(rowType, sql, " <= ?");
            condition = sql.toString();
        }

        if (isScanningData) {
            return buildSelectWithRowLimits(
                    tableId, limitSize, "*", Optional.ofNullable(condition), Optional.empty());
        } else {
            final String orderBy = String.join(", ", rowType.getFieldNames());
            return buildSelectWithBoundaryRowLimits(
                    tableId,
                    limitSize,
                    getPrimaryKeyColumnsProjection(rowType),
                    getMaxPrimaryKeyColumnsProjection(rowType),
                    Optional.ofNullable(condition),
                    orderBy);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        try {
            final PreparedStatement statement = initStatement(jdbc, sql, fetchSize);
            if (isFirstSplit && isLastSplit) {
                return statement;
            }
            if (isFirstSplit) {
                for (int i = 0; i < primaryKeyNum; i++) {
                    statement.setObject(i + 1, splitEnd[i]);
                    statement.setObject(i + 1 + primaryKeyNum, splitEnd[i]);
                }
            } else if (isLastSplit) {
                for (int i = 0; i < primaryKeyNum; i++) {
                    statement.setObject(i + 1, splitStart[i]);
                }
            } else {
                for (int i = 0; i < primaryKeyNum; i++) {
                    statement.setObject(i + 1, splitStart[i]);
                    statement.setObject(i + 1 + primaryKeyNum, splitEnd[i]);
                    statement.setObject(i + 1 + 2 * primaryKeyNum, splitEnd[i]);
                }
            }
            return statement;
        } catch (Exception e) {
            throw new RuntimeException("Failed to build the split data read statement.", e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        StringBuilder sql = new StringBuilder();
        for (Iterator<String> fieldNamesIt = Arrays.stream(rowType.getFieldNames()).iterator();
                fieldNamesIt.hasNext(); ) {
            sql.append(fieldNamesIt.next());
            if (fieldNamesIt.hasNext()) {
                sql.append(" , ");
            }
        }
        return sql.toString();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlUtils.java`
#### Snippet
```java
        StringBuilder sql = new StringBuilder();
        for (Iterator<String> fieldNamesIt = Arrays.stream(rowType.getFieldNames()).iterator();
                fieldNamesIt.hasNext(); ) {
            sql.append("MAX(" + fieldNamesIt.next() + ")");
            if (fieldNamesIt.hasNext()) {
                sql.append(" , ");
            }
        }
        return sql.toString();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/FieldNamedPreparedStatement.java`
#### Snippet
```java
                String parameterName = sql.substring(i + 1, j);
                checkArgument(
                        !parameterName.isEmpty(),
                        "Named parameters in SQL statement must not be empty.");
                paramMap.computeIfAbsent(parameterName, n -> new ArrayList<>()).add(fieldIndex);
                fieldIndex++;
                i = j - 1;
                parsedSql.append('?');
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/JdbcBatchStatementExecutorBuilder.java`
#### Snippet
```java
        return row -> {
            Object[] fields = new Object[pkFields.length];
            for (int i = 0; i < pkFields.length; i++) {
                fields[i] = row.getField(pkFields[i]);
            }
            SeaTunnelRow newRow = new SeaTunnelRow(fields);
            newRow.setTableId(row.getTableId());
            newRow.setRowKind(row.getRowKind());
            return newRow;
        };
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/ReduceBufferedBatchStatementExecutor.java`
#### Snippet
```java
        Boolean preChangeFlag = null;
        Set<Map.Entry<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>>> entrySet = buffer.entrySet();
        for (Map.Entry<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> entry : entrySet) {
            Boolean currentChangeFlag = entry.getValue().getKey();
            if (currentChangeFlag) {
                if (preChangeFlag != null && !preChangeFlag) {
                    deleteExecutor.executeBatch();
                }
                insertOrUpdateExecutor.addToBatch(entry.getValue().getValue());
            } else {
                if (preChangeFlag != null && preChangeFlag) {
                    insertOrUpdateExecutor.executeBatch();
                }
                deleteExecutor.addToBatch(entry.getKey());
            }
            preChangeFlag = currentChangeFlag;
        }

        if (preChangeFlag != null) {
            if (preChangeFlag) {
                insertOrUpdateExecutor.executeBatch();
            } else {
                deleteExecutor.executeBatch();
            }
        }
        buffer.clear();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
        ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", String.join(" ", command));
        Process start = processBuilder.start();
        // we just wait for the process to finish
        try (InputStream inputStream = start.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                log.info(line);
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/RsyncFileTransfer.java`
#### Snippet
```java
            sshClient = SshClient.setUpDefaultClient();
            sshClient.start();
            clientSession = sshClient.connect(user, host, SSH_PORT).verify().getSession();
            if (password != null) {
                clientSession.addPasswordIdentity(password);
            }
            // TODO support add publicKey to identity
            if (!clientSession.auth().verify().isSuccess()) {
                throw new ClickhouseConnectorException(
                        ClickhouseConnectorErrorCode.SSH_OPERATION_FAILED,
                        "ssh host " + host + "authentication failed");
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/RsyncFileTransfer.java`
#### Snippet
```java
        List<String> command = new ArrayList<>();
        command.add("ls");
        command.add("-l");
        command.add(
                targetPath.substring(0, StringUtils.stripEnd(targetPath, "/").lastIndexOf("/"))
                        + "/");
        command.add("| tail -n 1 | awk '{print $3}' | xargs -t -i chown -R {}:{} " + targetPath);
        try {
            String finalCommand = String.join(" ", command);
            log.info("execute remote command: " + finalCommand);
            clientSession.executeRemoteCommand(finalCommand);
        } catch (IOException e) {
            // always return error cause xargs return shell command result
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/RsyncFileTransfer.java`
#### Snippet
```java
        if (clientSession != null && clientSession.isOpen()) {
            try {
                clientSession.close();
            } catch (IOException e) {
                throw new ClickhouseConnectorException(
                        ClickhouseConnectorErrorCode.SSH_OPERATION_FAILED,
                        "Failed to close ssh session",
                        e);
            }
        }
        if (sshClient != null && sshClient.isOpen()) {
            sshClient.stop();
            try {
                sshClient.close();
            } catch (IOException e) {
                throw new ClickhouseConnectorException(
                        ClickhouseConnectorErrorCode.SSH_OPERATION_FAILED,
                        "Failed to close ssh client",
                        e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/config/DorisConfig.java`
#### Snippet
```java
        if (pluginConfig.hasPath(SINK_MAX_RETRIES.key())) {
            dorisConfig.setMaxRetries(pluginConfig.getInt(SINK_MAX_RETRIES.key()));
        } else {
            dorisConfig.setMaxRetries(SINK_MAX_RETRIES.defaultValue());
        }
        if (pluginConfig.hasPath(SINK_BUFFER_SIZE.key())) {
            dorisConfig.setBufferSize(pluginConfig.getInt(SINK_BUFFER_SIZE.key()));
        } else {
            dorisConfig.setBufferSize(SINK_BUFFER_SIZE.defaultValue());
        }
        if (pluginConfig.hasPath(SINK_BUFFER_COUNT.key())) {
            dorisConfig.setBufferCount(pluginConfig.getInt(SINK_BUFFER_COUNT.key()));
        } else {
            dorisConfig.setBufferCount(SINK_BUFFER_COUNT.defaultValue());
        }
        if (pluginConfig.hasPath(SINK_ENABLE_DELETE.key())) {
            dorisConfig.setEnableDelete(pluginConfig.getBoolean(SINK_ENABLE_DELETE.key()));
        } else {
            dorisConfig.setEnableDelete(SINK_ENABLE_DELETE.defaultValue());
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/PartitionDefinition.java`
#### Snippet
```java
        int cmp = database.compareTo(o.database);
        if (cmp != 0) {
            return cmp;
        }
        cmp = table.compareTo(o.table);
        if (cmp != 0) {
            return cmp;
        }
        cmp = beAddress.compareTo(o.beAddress);
        if (cmp != 0) {
            return cmp;
        }
        cmp = queryPlan.compareTo(o.queryPlan);
        if (cmp != 0) {
            return cmp;
        }

        cmp = tabletIds.size() - o.tabletIds.size();
        if (cmp != 0) {
            return cmp;
        }

        Set<Long> similar = new HashSet<>(tabletIds);
        Set<Long> diffSelf = new HashSet<>(tabletIds);
        Set<Long> diffOther = new HashSet<>(o.tabletIds);
        similar.retainAll(o.tabletIds);
        diffSelf.removeAll(similar);
        diffOther.removeAll(similar);
        if (diffSelf.size() == 0) {
            return 0;
        }
        long diff = Collections.min(diffSelf) - Collections.min(diffOther);
        return diff < 0 ? -1 : 1;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        if (schema == null) {
            throw new DorisConnectorException(
                    DorisConnectorErrorCode.REST_SERVICE_FAILED,
                    ErrorMessages.SHOULD_NOT_HAPPEN_MESSAGE);
        }

        if (schema.getStatus() != REST_RESPONSE_STATUS_OK) {
            String errMsg = "Doris FE's response is not OK, status is " + schema.getStatus();
            logger.error(errMsg);
            throw new DorisConnectorException(DorisConnectorErrorCode.REST_SERVICE_FAILED, errMsg);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowSerializer.java`
#### Snippet
```java
        String valString;
        if (JSON.equals(type)) {
            valString = buildJsonString(seaTunnelRow);
        } else if (CSV.equals(type)) {
            valString = buildCSVString(seaTunnelRow);
        } else {
            throw new IllegalArgumentException("The type " + type + " is not supported!");
        }
        return valString.getBytes(StandardCharsets.UTF_8);
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowSerializer.java`
#### Snippet
```java
        Map<String, Object> rowMap = new HashMap<>(row.getFields().length);

        for (int i = 0; i < row.getFields().length; i++) {
            Object value = convert(seaTunnelRowType.getFieldType(i), row.getField(i));
            rowMap.put(seaTunnelRowType.getFieldName(i), value);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowSerializer.java`
#### Snippet
```java
        StringJoiner joiner = new StringJoiner(fieldDelimiter);
        for (int i = 0; i < row.getFields().length; i++) {
            Object field = convert(seaTunnelRowType.getFieldType(i), row.getField(i));
            String value = field != null ? field.toString() : NULL_VALUE;
            joiner.add(value);
        }
        if (enableDelete) {
            joiner.add(parseDeleteSign(row.getRowKind()));
        }
        return joiner.toString();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
            if (assignmentForReader != null && !assignmentForReader.isEmpty()) {
                log.info("Assign splits {} to reader {}", assignmentForReader, reader);
                try {
                    context.assignSplit(reader, assignmentForReader);
                } catch (Exception e) {
                    log.error(
                            "Failed to assign splits {} to reader {}",
                            assignmentForReader,
                            reader,
                            e);
                    pendingSplit.put(reader, assignmentForReader);
                }
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-base-hadoop/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/hdfs/source/BaseHdfsFileSource.java`
#### Snippet
```java
        if (pluginConfig.hasPath(CatalogTableUtil.SCHEMA.key())) {
            switch (fileFormat) {
                case CSV:
                case TEXT:
                case JSON:
                case EXCEL:
                    SeaTunnelRowType userDefinedSchema =
                            CatalogTableUtil.buildWithConfig(pluginConfig).getSeaTunnelRowType();
                    readStrategy.setSeaTunnelRowTypeInfo(userDefinedSchema);
                    rowType = readStrategy.getActualSeaTunnelRowTypeInfo();
                    break;
                case ORC:
                case PARQUET:
                    throw new FileConnectorException(
                            CommonErrorCode.UNSUPPORTED_OPERATION,
                            "SeaTunnel does not support user-defined schema for [parquet, orc] files");
                default:
                    // never got in there
                    throw new FileConnectorException(
                            CommonErrorCode.ILLEGAL_ARGUMENT,
                            "SeaTunnel does not supported this file format");
            }
        } else {
            try {
                rowType = readStrategy.getSeaTunnelRowTypeInfo(hadoopConf, filePaths.get(0));
            } catch (FileConnectorException e) {
                String errorMsg =
                        String.format("Get table schema from file [%s] failed", filePaths.get(0));
                throw new FileConnectorException(
                        CommonErrorCode.TABLE_SCHEMA_GET_FAILED, errorMsg, e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ExcelReadStrategy.java`
#### Snippet
```java
        if (pluginConfig.hasPath(BaseSourceConfig.READ_COLUMNS.key())) {
            // get the read column index from user-defined row type
            indexes = new int[readColumns.size()];
            String[] fields = new String[readColumns.size()];
            SeaTunnelDataType<?>[] types = new SeaTunnelDataType[readColumns.size()];
            for (int i = 0; i < indexes.length; i++) {
                indexes[i] = seaTunnelRowType.indexOf(readColumns.get(i));
                fields[i] = seaTunnelRowType.getFieldName(indexes[i]);
                types[i] = seaTunnelRowType.getFieldType(indexes[i]);
            }
            this.seaTunnelRowType = new SeaTunnelRowType(fields, types);
            this.seaTunnelRowTypeWithPartition =
                    mergePartitionTypes(fileNames.get(0), this.seaTunnelRowType);
        } else {
            this.seaTunnelRowType = seaTunnelRowType;
            this.seaTunnelRowTypeWithPartition = userDefinedRowTypeWithPartition;
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java
                switch (seaTunnelDataType.getSqlType()) {
                    case STRING:
                        return ArrayType.STRING_ARRAY_TYPE;
                    case BOOLEAN:
                        return ArrayType.BOOLEAN_ARRAY_TYPE;
                    case TINYINT:
                        return ArrayType.BYTE_ARRAY_TYPE;
                    case SMALLINT:
                        return ArrayType.SHORT_ARRAY_TYPE;
                    case INT:
                        return ArrayType.INT_ARRAY_TYPE;
                    case BIGINT:
                        return ArrayType.LONG_ARRAY_TYPE;
                    case FLOAT:
                        return ArrayType.FLOAT_ARRAY_TYPE;
                    case DOUBLE:
                        return ArrayType.DOUBLE_ARRAY_TYPE;
                    default:
                        String errorMsg =
                                String.format(
                                        "SeaTunnel array type not supported this genericType [%s] yet",
                                        seaTunnelDataType);
                        throw new FileConnectorException(
                                CommonErrorCode.UNSUPPORTED_DATA_TYPE, errorMsg);
                }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/split/FileSourceSplitEnumerator.java`
#### Snippet
```java
        context.assignSplit(taskId, currentTaskSplits);
        // save the state of assigned splits
        assignedSplit.addAll(currentTaskSplits);
        // remove the assigned splits from pending splits
        currentTaskSplits.forEach(split -> pendingSplit.remove(split));
        log.info(
                "SubTask {} is assigned to [{}]",
                taskId,
                currentTaskSplits.stream()
                        .map(FileSourceSplit::splitId)
                        .collect(Collectors.joining(",")));
        context.signalNoMoreSplits(taskId);
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-ftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/ftp/source/FtpFileSource.java`
#### Snippet
```java
try {
            filePaths = readStrategy.getFileNamesByPath(hadoopConf, path);
        } catch (IOException e) {
            String errorMsg = String.format("Get file list from this path [%s] failed", path);
            throw new FileConnectorException(
                    FileConnectorErrorCode.FILE_LIST_GET_FAILED, errorMsg, e);
        }
        // support user-defined schema
        // only json type support user-defined schema now
        if (pluginConfig.hasPath(CatalogTableUtil.SCHEMA.key())) {
            switch (fileFormat) {
                case CSV:
                case TEXT:
                case JSON:
                case EXCEL:
                    SeaTunnelRowType userDefinedSchema =
                            CatalogTableUtil.buildWithConfig(pluginConfig).getSeaTunnelRowType();
                    readStrategy.setSeaTunnelRowTypeInfo(userDefinedSchema);
                    rowType = readStrategy.getActualSeaTunnelRowTypeInfo();
                    break;
                case ORC:
                case PARQUET:
                    throw new FileConnectorException(
                            CommonErrorCode.UNSUPPORTED_OPERATION,
                            "SeaTunnel does not support user-defined schema for [parquet, orc] files");
                default:
                    // never got in there
                    throw new FileConnectorException(
                            CommonErrorCode.ILLEGAL_ARGUMENT,
                            "SeaTunnel does not supported this file format");
            }
        } else {
            try {
                rowType = readStrategy.getSeaTunnelRowTypeInfo(hadoopConf, filePaths.get(0));
            } catch (FileConnectorException e) {
                String errorMsg =
                        String.format("Get table schema from file [%s] failed", filePaths.get(0));
                throw new FileConnectorException(
                        CommonErrorCode.TABLE_SCHEMA_GET_FAILED, errorMsg, e);
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-oss-jindo/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/oss/sink/OssFileSinkFactory.java`
#### Snippet
```java
return OptionRule.builder()
                .required(OssConfig.FILE_PATH)
                .required(OssConfig.BUCKET)
                .required(OssConfig.ACCESS_KEY)
                .required(OssConfig.ACCESS_SECRET)
                .required(OssConfig.ENDPOINT)
                .optional(BaseSinkConfig.FILE_FORMAT_TYPE)
                .conditional(
                        BaseSinkConfig.FILE_FORMAT_TYPE,
                        FileFormat.TEXT,
                        BaseSinkConfig.ROW_DELIMITER,
                        BaseSinkConfig.FIELD_DELIMITER,
                        BaseSinkConfig.TXT_COMPRESS)
                .conditional(
                        BaseSinkConfig.FILE_FORMAT_TYPE,
                        FileFormat.CSV,
                        BaseSinkConfig.TXT_COMPRESS)
                .conditional(
                        BaseSinkConfig.FILE_FORMAT_TYPE,
                        FileFormat.JSON,
                        BaseSinkConfig.TXT_COMPRESS)
                .conditional(
                        BaseSinkConfig.FILE_FORMAT_TYPE,
                        FileFormat.ORC,
                        BaseSinkConfig.ORC_COMPRESS)
                .conditional(
                        BaseSinkConfig.FILE_FORMAT_TYPE,
                        FileFormat.PARQUET,
                        BaseSinkConfig.PARQUET_COMPRESS)
                .optional(BaseSinkConfig.CUSTOM_FILENAME)
                .conditional(
                        BaseSinkConfig.CUSTOM_FILENAME,
                        true,
                        BaseSinkConfig.FILE_NAME_EXPRESSION,
                        BaseSinkConfig.FILENAME_TIME_FORMAT)
                .optional(BaseSinkConfig.HAVE_PARTITION)
                .conditional(
                        BaseSinkConfig.HAVE_PARTITION,
                        true,
                        BaseSinkConfig.PARTITION_BY,
                        BaseSinkConfig.PARTITION_DIR_EXPRESSION,
                        BaseSinkConfig.IS_PARTITION_FIELD_WRITE_IN_FILE)
                .optional(BaseSinkConfig.SINK_COLUMNS)
                .optional(BaseSinkConfig.IS_ENABLE_TRANSACTION)
                .optional(BaseSinkConfig.DATE_FORMAT)
                .optional(BaseSinkConfig.DATETIME_FORMAT)
                .optional(BaseSinkConfig.TIME_FORMAT)
                .build();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-oss-jindo/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/oss/source/OssFileSource.java`
#### Snippet
```java
        readStrategy =
                ReadStrategyFactory.of(pluginConfig.getString(OssConfig.FILE_FORMAT_TYPE.key()));
        readStrategy.setPluginConfig(pluginConfig);
        String path = pluginConfig.getString(OssConfig.FILE_PATH.key());
        hadoopConf = OssConf.buildWithConfig(pluginConfig);
        try {
            filePaths = readStrategy.getFileNamesByPath(hadoopConf, path);
        } catch (IOException e) {
            String errorMsg = String.format("Get file list from this path [%s] failed", path);
            throw new FileConnectorException(
                    FileConnectorErrorCode.FILE_LIST_GET_FAILED, errorMsg, e);
        }
        // support user-defined schema
        FileFormat fileFormat =
                FileFormat.valueOf(
                        pluginConfig.getString(OssConfig.FILE_FORMAT_TYPE.key()).toUpperCase());
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-file/connector-file-oss-jindo/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/oss/source/OssFileSourceFactory.java`
#### Snippet
```java
        return OptionRule.builder()
                .required(OssConfig.FILE_PATH)
                .required(OssConfig.BUCKET)
                .required(OssConfig.ACCESS_KEY)
                .required(OssConfig.ACCESS_SECRET)
                .required(OssConfig.ENDPOINT)
                .required(BaseSourceConfig.FILE_FORMAT_TYPE)
                .conditional(
                        BaseSourceConfig.FILE_FORMAT_TYPE,
                        FileFormat.TEXT,
                        BaseSourceConfig.DELIMITER)
                .conditional(
                        BaseSourceConfig.FILE_FORMAT_TYPE,
                        Arrays.asList(
                                FileFormat.TEXT, FileFormat.JSON, FileFormat.EXCEL, FileFormat.CSV),
                        CatalogTableUtil.SCHEMA)
                .optional(BaseSourceConfig.PARSE_PARTITION_FROM_PATH)
                .optional(BaseSourceConfig.DATE_FORMAT)
                .optional(BaseSourceConfig.DATETIME_FORMAT)
                .optional(BaseSourceConfig.TIME_FORMAT)
                .build();
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
#### Snippet
```java
            List<String> databases = new ArrayList<>();
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String databaseName = rs.getString(1);
                if (!SYS_DATABASES.contains(databaseName)) {
                    databases.add(rs.getString(1));
                }
            }

            return databases;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
#### Snippet
```java
                    String columnName = tableMetaData.getColumnName(i);
                    SeaTunnelDataType<?> type = fromJdbcType(tableMetaData, i);
                    int columnDisplaySize = tableMetaData.getColumnDisplaySize(i);
                    String comment = tableMetaData.getColumnLabel(i);
                    boolean isNullable =
                            tableMetaData.isNullable(i) == ResultSetMetaData.columnNullable;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlDataTypeConvertor.java`
#### Snippet
```java
                if (left != -1 && right != -1) {
                    String[] precisionAndScale =
                            connectorDataType.substring(left + 1, right).split(",");
                    if (precisionAndScale.length == 2) {
                        precision = Integer.parseInt(precisionAndScale[0]);
                        scale = Integer.parseInt(precisionAndScale[1]);
                    } else if (precisionAndScale.length == 1) {
                        precision = Integer.parseInt(precisionAndScale[0]);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/psql/PostgresDataTypeConvertor.java`
#### Snippet
```java
        checkNotNull(seaTunnelDataType, "seaTunnelDataType cannot be null");
        SqlType sqlType = seaTunnelDataType.getSqlType();
        switch (sqlType) {
            case TINYINT:
            case SMALLINT:
                return PG_SMALLINT;
            case INT:
                return PG_INTEGER;
            case BIGINT:
                return PG_BIGINT;
            case DECIMAL:
                return PG_NUMERIC;
            case FLOAT:
                return PG_REAL;
            case DOUBLE:
                return PG_DOUBLE_PRECISION;
            case BOOLEAN:
                return PG_BOOLEAN;
            case STRING:
                return PG_TEXT;
            case DATE:
                return PG_DATE;
            case BYTES:
                return PG_BYTEA;
            case TIME:
                return PG_TIME;
            case TIMESTAMP:
                return PG_TIMESTAMP;
            default:
                throw new UnsupportedOperationException(
                        String.format(
                                "Doesn't support SeaTunnel type '%s''  yet.", seaTunnelDataType));
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/oracle/OracleDialect.java`
#### Snippet
```java
List<String> nonUniqueKeyFields =
                Arrays.stream(fieldNames)
                        .filter(fieldName -> !Arrays.asList(uniqueKeyFields).contains(fieldName))
                        .collect(Collectors.toList());
        String valuesBinding =
                Arrays.stream(fieldNames)
                        .map(fieldName -> ":" + fieldName + " " + quoteIdentifier(fieldName))
                        .collect(Collectors.joining(", "));

        String usingClause = String.format("SELECT %s FROM DUAL", valuesBinding);
        String onConditions =
                Arrays.stream(uniqueKeyFields)
                        .map(
                                fieldName ->
                                        String.format(
                                                "TARGET.%s=SOURCE.%s",
                                                quoteIdentifier(fieldName),
                                                quoteIdentifier(fieldName)))
                        .collect(Collectors.joining(" AND "));
        String updateSetClause =
                nonUniqueKeyFields.stream()
                        .map(
                                fieldName ->
                                        String.format(
                                                "TARGET.%s=SOURCE.%s",
                                                quoteIdentifier(fieldName),
                                                quoteIdentifier(fieldName)))
                        .collect(Collectors.joining(", "));
        String insertFields =
                Arrays.stream(fieldNames)
                        .map(this::quoteIdentifier)
                        .collect(Collectors.joining(", "));
        String insertValues =
                Arrays.stream(fieldNames)
                        .map(fieldName -> "SOURCE." + quoteIdentifier(fieldName))
                        .collect(Collectors.joining(", "));
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/split/JdbcNumericBetweenParametersProvider.java`
#### Snippet
```java
        long bigBatchNum = maxElemCount - (batchSize - 1) * batchNum;

        Serializable[][] parameters = new Serializable[batchNum][2];
        long start = minVal;
        for (int i = 0; i < batchNum; i++) {
            long end = start + batchSize - 1 - (i >= bigBatchNum ? 1 : 0);
            parameters[i] = new Long[] {start, end};
            start = end + 1;
        }
        return parameters;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
        int[] keyFieldIndexArr = new int[keyFieldNames.size()];
        SeaTunnelDataType[] keyFieldDataTypeArr = new SeaTunnelDataType[keyFieldNames.size()];
        for (int i = 0; i < keyFieldNames.size(); i++) {
            String keyFieldName = keyFieldNames.get(i);
            int rowFieldIndex = rowType.indexOf(keyFieldName);
            keyFieldIndexArr[i] = rowFieldIndex;
            keyFieldDataTypeArr[i] = rowType.getFieldType(rowFieldIndex);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
        for (int taskID = 0; taskID < context.currentParallelism(); taskID++) {
            readySplit.computeIfAbsent(taskID, id -> new ArrayList<>());
        }

        pendingSplit
                .entrySet()
                .forEach(
                        s -> {
                            if (!assignedSplit.containsKey(s.getKey())) {
                                readySplit
                                        .get(
                                                getSplitOwner(
                                                        s.getKey(), context.currentParallelism()))
                                        .add(s.getValue());
                            }
                        });
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java
        ArrayList<SeaTunnelDataType<?>> seaTunnelDataTypes = new ArrayList<>();
        ArrayList<String> fieldNames = new ArrayList<>();
        try {

            for (int i = 0; i < columnSchemaList.size(); i++) {
                fieldNames.add(columnSchemaList.get(i).getName());
                seaTunnelDataTypes.add(KuduTypeMapper.mapping(columnSchemaList, i));
            }
        } catch (Exception e) {
            throw new KuduConnectorException(
                    CommonErrorCode.TABLE_SCHEMA_GET_FAILED,
                    String.format(
                            "PluginName: %s, PluginType: %s, Message: %s",
                            "Kudu", PluginType.SOURCE, ExceptionUtils.getMessage(e)));
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/sink/Neo4jSink.java`
#### Snippet
```java
        } else if (config.hasPath(KEY_BEARER_TOKEN.key())) {
            final String bearerToken = config.getString(KEY_BEARER_TOKEN.key());
            AuthTokens.bearer(bearerToken);
            driverBuilder.setBearerToken(bearerToken);
        } else {
            final String kerberosTicket = config.getString(KEY_KERBEROS_TICKET.key());
            AuthTokens.kerberos(kerberosTicket);
            driverBuilder.setBearerToken(kerberosTicket);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/sink/Neo4jSink.java`
#### Snippet
```java
        driverBuilder.setDatabase(config.getString(KEY_DATABASE.key()));

        if (config.hasPath(KEY_MAX_CONNECTION_TIMEOUT.key())) {
            driverBuilder.setMaxConnectionTimeoutSeconds(
                    config.getLong(KEY_MAX_CONNECTION_TIMEOUT.key()));
        }
        if (config.hasPath(KEY_MAX_TRANSACTION_RETRY_TIME.key())) {
            driverBuilder.setMaxTransactionRetryTimeSeconds(
                    config.getLong(KEY_MAX_TRANSACTION_RETRY_TIME.key()));
        }

        return driverBuilder;
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/PaimonSink.java`
#### Snippet
```java
        final String warehouse = pluginConfig.getString(WAREHOUSE.key());
        final String database = pluginConfig.getString(DATABASE.key());
        final String table = pluginConfig.getString(TABLE.key());
        final Map<String, String> optionsMap = new HashMap<>();
        optionsMap.put(WAREHOUSE.key(), warehouse);
        final Options options = Options.fromMap(optionsMap);
        final Configuration hadoopConf = new Configuration();
        if (pluginConfig.hasPath(HDFS_SITE_PATH.key())) {
            hadoopConf.addResource(new Path(pluginConfig.getString(HDFS_SITE_PATH.key())));
        }
        final CatalogContext catalogContext = CatalogContext.create(options, hadoopConf);
        try (Catalog catalog = CatalogFactory.createCatalog(catalogContext)) {
            Identifier identifier = Identifier.create(database, table);
            this.table = catalog.getTable(identifier);
        } catch (Exception e) {
            String errorMsg =
                    String.format(
                            "Failed to get table [%s] from database [%s] on warehouse [%s]",
                            database, table, warehouse);
            throw new PaimonConnectorException(
                    PaimonConnectorErrorCode.GET_TABLE_FAILED, errorMsg, e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-connectors-v2/connector-rocketmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rocketmq/sink/RocketMqSink.java`
#### Snippet
```java
        boolean aclEnabled = ACL_ENABLED.defaultValue();
        if (config.hasPath(ACL_ENABLED.key())) {
            aclEnabled = config.getBoolean(ACL_ENABLED.key());
            if (aclEnabled
                    && (!config.hasPath(ACCESS_KEY.key()) || !config.hasPath(SECRET_KEY.key()))) {
                throw new RocketMqConnectorException(
                        SeaTunnelAPIErrorCode.OPTION_VALIDATION_FAILED,
                        "When ACL_ENABLED "
                                + "true , ACCESS_KEY and SECRET_KEY must be configured");
            }
            if (config.hasPath(ACCESS_KEY.key())) {
                baseConfigurationBuilder.accessKey(config.getString(ACCESS_KEY.key()));
            }
            if (config.hasPath(SECRET_KEY.key())) {
                baseConfigurationBuilder.secretKey(config.getString(SECRET_KEY.key()));
            }
        }
        baseConfigurationBuilder.aclEnable(aclEnabled);
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/FlinkStarter.java`
#### Snippet
```java
        List<String> command = new ArrayList<>();
        // set start command
        command.add("${FLINK_HOME}/bin/flink");
        // set deploy mode, run or run-application
        command.add(flinkCommandArgs.getDeployMode().getDeployMode());
        // set submitted target master
        if (flinkCommandArgs.getMasterType() != null) {
            command.add("--target");
            command.add(flinkCommandArgs.getMasterType().getMaster());
        }
        // set flink original parameters
        command.addAll(flinkCommandArgs.getOriginalParameters());
        // set main class name
        command.add("-c");
        command.add(APP_NAME);
        // set main jar name
        command.add(appJar);
        // set config file path
        command.add("--config");
        command.add(flinkCommandArgs.getConfigFile());
        // set check config flag
        if (flinkCommandArgs.isCheckConfig()) {
            command.add("--check");
        }
        // set job name
        command.add("--name");
        command.add(flinkCommandArgs.getJobName());
        // set encryption
        if (flinkCommandArgs.isEncrypt()) {
            command.add("--encrypt");
        }
        // set decryption
        if (flinkCommandArgs.isDecrypt()) {
            command.add("--decrypt");
        }
        // set extra system properties
        flinkCommandArgs.getVariables().stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .forEach(variable -> command.add("-D" + variable));
        return command;
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
pluginPaths.forEach(url -> log.info("register plugins : {}", url));
        List<Configuration> configurations = new ArrayList<>();
        try {
            configurations.add(
                    (Configuration)
                            Objects.requireNonNull(
                                            ReflectionUtils.getDeclaredMethod(
                                                    StreamExecutionEnvironment.class,
                                                    "getConfiguration"))
                                    .orElseThrow(
                                            () ->
                                                    new RuntimeException(
                                                            "can't find "
                                                                    + "method: getConfiguration"))
                                    .invoke(this.environment));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        configurations.forEach(
                configuration -> {
                    List<String> jars = configuration.get(PipelineOptions.JARS);
                    if (jars == null) {
                        jars = new ArrayList<>();
                    }
                    jars.addAll(
                            pluginPaths.stream().map(URL::toString).collect(Collectors.toList()));
                    configuration.set(
                            PipelineOptions.JARS,
                            jars.stream().distinct().collect(Collectors.toList()));
                    List<String> classpath = configuration.get(PipelineOptions.CLASSPATHS);
                    if (classpath == null) {
                        classpath = new ArrayList<>();
                    }
                    classpath.addAll(
                            pluginPaths.stream().map(URL::toString).collect(Collectors.toList()));
                    configuration.set(
                            PipelineOptions.CLASSPATHS,
                            classpath.stream().distinct().collect(Collectors.toList()));
                });
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        tableEnvironment =
                StreamTableEnvironment.create(getStreamExecutionEnvironment(), environmentSettings);
        TableConfig config = tableEnvironment.getConfig();
        if (this.config.hasPath(ConfigKeyName.MAX_STATE_RETENTION_TIME)
                && this.config.hasPath(ConfigKeyName.MIN_STATE_RETENTION_TIME)) {
            long max = this.config.getLong(ConfigKeyName.MAX_STATE_RETENTION_TIME);
            long min = this.config.getLong(ConfigKeyName.MIN_STATE_RETENTION_TIME);
            config.setIdleStateRetentionTime(Time.seconds(min), Time.seconds(max));
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        Configuration configuration = new Configuration();
        EnvironmentUtil.initConfiguration(config, configuration);
        environment = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        setTimeCharacteristic();

        setCheckpoint();

        EnvironmentUtil.setRestartStrategy(config, environment.getConfig());

        if (config.hasPath(ConfigKeyName.BUFFER_TIMEOUT_MILLIS)) {
            long timeout = config.getLong(ConfigKeyName.BUFFER_TIMEOUT_MILLIS);
            environment.setBufferTimeout(timeout);
        }

        if (config.hasPath(ConfigKeyName.PARALLELISM)) {
            int parallelism = config.getInt(ConfigKeyName.PARALLELISM);
            environment.setParallelism(parallelism);
        }

        if (config.hasPath(ConfigKeyName.MAX_PARALLELISM)) {
            int max = config.getInt(ConfigKeyName.MAX_PARALLELISM);
            environment.setMaxParallelism(max);
        }

        if (this.jobMode.equals(JobMode.BATCH)) {
            environment.setRuntimeMode(RuntimeExecutionMode.BATCH);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        if (config.hasPath(ConfigKeyName.TIME_CHARACTERISTIC)) {
            String timeType = config.getString(ConfigKeyName.TIME_CHARACTERISTIC);
            switch (timeType.toLowerCase()) {
                case "event-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
                    break;
                case "ingestion-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);
                    break;
                case "processing-time":
                    environment.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
                    break;
                default:
                    log.warn(
                            "set time-characteristic failed, unknown time-characteristic [{}],only support event-time,ingestion-time,processing-time",
                            timeType);
                    break;
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
long interval = 0;
        if (config.hasPath(EnvCommonOptions.CHECKPOINT_INTERVAL.key())) {
            interval = config.getLong(EnvCommonOptions.CHECKPOINT_INTERVAL.key());
        } else if (config.hasPath(ConfigKeyName.CHECKPOINT_INTERVAL)) {
            interval = config.getLong(ConfigKeyName.CHECKPOINT_INTERVAL);
        }

        if (interval > 0) {
            CheckpointConfig checkpointConfig = environment.getCheckpointConfig();
            environment.enableCheckpointing(interval);

            if (config.hasPath(ConfigKeyName.CHECKPOINT_MODE)) {
                String mode = config.getString(ConfigKeyName.CHECKPOINT_MODE);
                switch (mode.toLowerCase()) {
                    case "exactly-once":
                        checkpointConfig.setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
                        break;
                    case "at-least-once":
                        checkpointConfig.setCheckpointingMode(CheckpointingMode.AT_LEAST_ONCE);
                        break;
                    default:
                        log.warn(
                                "set checkpoint.mode failed, unknown checkpoint.mode [{}],only support exactly-once,at-least-once",
                                mode);
                        break;
                }
            }

            if (config.hasPath(ConfigKeyName.CHECKPOINT_TIMEOUT)) {
                long timeout = config.getLong(ConfigKeyName.CHECKPOINT_TIMEOUT);
                checkpointConfig.setCheckpointTimeout(timeout);
            }

            if (config.hasPath(ConfigKeyName.CHECKPOINT_DATA_URI)) {
                String uri = config.getString(ConfigKeyName.CHECKPOINT_DATA_URI);
                StateBackend fsStateBackend = new FsStateBackend(uri);
                if (config.hasPath(ConfigKeyName.STATE_BACKEND)) {
                    String stateBackend = config.getString(ConfigKeyName.STATE_BACKEND);
                    if ("rocksdb".equalsIgnoreCase(stateBackend)) {
                        StateBackend rocksDBStateBackend =
                                new RocksDBStateBackend(fsStateBackend, TernaryBoolean.TRUE);
                        environment.setStateBackend(rocksDBStateBackend);
                    }
                } else {
                    environment.setStateBackend(fsStateBackend);
                }
            }

            if (config.hasPath(ConfigKeyName.MAX_CONCURRENT_CHECKPOINTS)) {
                int max = config.getInt(ConfigKeyName.MAX_CONCURRENT_CHECKPOINTS);
                checkpointConfig.setMaxConcurrentCheckpoints(max);
            }

            if (config.hasPath(ConfigKeyName.CHECKPOINT_CLEANUP_MODE)) {
                boolean cleanup = config.getBoolean(ConfigKeyName.CHECKPOINT_CLEANUP_MODE);
                if (cleanup) {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.DELETE_ON_CANCELLATION);
                } else {
                    checkpointConfig.enableExternalizedCheckpoints(
                            CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
                }
            }

            if (config.hasPath(ConfigKeyName.MIN_PAUSE_BETWEEN_CHECKPOINTS)) {
                long minPause = config.getLong(ConfigKeyName.MIN_PAUSE_BETWEEN_CHECKPOINTS);
                checkpointConfig.setMinPauseBetweenCheckpoints(minPause);
            }

            if (config.hasPath(ConfigKeyName.FAIL_ON_CHECKPOINTING_ERRORS)) {
                int failNum = config.getInt(ConfigKeyName.FAIL_ON_CHECKPOINTING_ERRORS);
                checkpointConfig.setTolerableCheckpointFailureNumber(failNum);
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
        if (config.hasPath(RESULT_TABLE_NAME)) {
            String name = config.getString(RESULT_TABLE_NAME);
            StreamTableEnvironment tableEnvironment = this.getStreamTableEnvironment();
            if (!TableUtil.tableExists(tableEnvironment, name)) {
                if (config.hasPath("field_name")) {
                    String fieldName = config.getString("field_name");
                    tableEnvironment.registerDataStream(name, dataStream, fieldName);
                } else {
                    tableEnvironment.registerDataStream(name, dataStream);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java
SeaTunnelSinkPluginDiscovery sinkPluginDiscovery =
                new SeaTunnelSinkPluginDiscovery(ADD_URL_TO_CLASSLOADER);
        List<URL> pluginJars = new ArrayList<>();
        List<SeaTunnelSink<SeaTunnelRow, Serializable, Serializable, Serializable>> sinks =
                pluginConfigs.stream()
                        .map(
                                sinkConfig -> {
                                    PluginIdentifier pluginIdentifier =
                                            PluginIdentifier.of(
                                                    ENGINE_TYPE,
                                                    PLUGIN_TYPE,
                                                    sinkConfig.getString(PLUGIN_NAME));
                                    pluginJars.addAll(
                                            sinkPluginDiscovery.getPluginJarPaths(
                                                    Lists.newArrayList(pluginIdentifier)));
                                    SeaTunnelSink<
                                                    SeaTunnelRow,
                                                    Serializable,
                                                    Serializable,
                                                    Serializable>
                                            seaTunnelSink =
                                                    sinkPluginDiscovery.createPluginInstance(
                                                            pluginIdentifier);
                                    seaTunnelSink.prepare(sinkConfig);
                                    seaTunnelSink.setJobContext(jobContext);
                                    if (SupportDataSaveMode.class.isAssignableFrom(
                                            seaTunnelSink.getClass())) {
                                        SupportDataSaveMode saveModeSink =
                                                (SupportDataSaveMode) seaTunnelSink;
                                        saveModeSink.checkOptions(sinkConfig);
                                    }
                                    return seaTunnelSink;
                                })
                        .distinct()
                        .collect(Collectors.toList());
        jarPaths.addAll(pluginJars);
        return sinks;
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
#### Snippet
```java
            Config sinkConfig = pluginConfigs.get(i);
            SeaTunnelSink<SeaTunnelRow, Serializable, Serializable, Serializable> seaTunnelSink =
                    plugins.get(i);
            DataStream<Row> stream = fromSourceTable(sinkConfig).orElse(input);
            seaTunnelSink.setTypeInfo(
                    (SeaTunnelRowType) TypeConverterUtils.convert(stream.getType()));
            if (SupportDataSaveMode.class.isAssignableFrom(seaTunnelSink.getClass())) {
                SupportDataSaveMode saveModeSink = (SupportDataSaveMode) seaTunnelSink;
                DataSaveMode dataSaveMode = saveModeSink.getDataSaveMode();
                saveModeSink.handleSaveMode(dataSaveMode);
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/command/FlinkTaskExecuteCommand.java`
#### Snippet
```java
        Path configFile = FileUtils.getConfigPath(flinkCommandArgs);
        checkConfigExist(configFile);
        Config config = ConfigBuilder.of(configFile);
        // if user specified job name using command line arguments, override config option
        if (!flinkCommandArgs.getJobName().equals(Constants.LOGO)) {
            config =
                    config.withValue(
                            ConfigUtil.joinPath("env", "job.name"),
                            ConfigValueFactory.fromAnyRef(flinkCommandArgs.getJobName()));
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        DeployMode deployMode = commandArgs.getDeployMode();
        switch (deployMode) {
            case CLUSTER:
                return new ClusterModeSparkStarter(args, commandArgs);
            case CLIENT:
                return new ClientModeSparkStarter(args, commandArgs);
            default:
                throw new IllegalArgumentException("Deploy mode " + deployMode + " not supported");
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        setSparkConf();
        Common.setDeployMode(commandArgs.getDeployMode());
        Common.setStarter(true);
        this.jars.addAll(Common.getPluginsJarDependencies());
        this.jars.addAll(Common.getLibJars());
        this.jars.addAll(getConnectorJarDependencies());
        this.jars.addAll(
                new ArrayList<>(
                        Common.getThirdPartyJars(
                                sparkConf.getOrDefault(EnvCommonOptions.JARS.key(), ""))));
        // TODO: override job name in command args, because in spark cluster deploy mode
        // command-line arguments are read first
        // if user has not specified job with command line, the job name config in file will not
        // work
        return buildFinal();
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        commandArgs.getVariables().stream()
                .filter(Objects::nonNull)
                .map(variable -> variable.split("=", 2))
                .filter(pair -> pair.length == 2)
                .forEach(pair -> System.setProperty(pair[0], pair[1]));
        this.sparkConf = getSparkConf(commandArgs.getConfigFile());
        String driverJavaOpts = this.sparkConf.getOrDefault("spark.driver.extraJavaOptions", "");
        String executorJavaOpts =
                this.sparkConf.getOrDefault("spark.executor.extraJavaOptions", "");
        if (!commandArgs.getVariables().isEmpty()) {
            String properties =
                    commandArgs.getVariables().stream()
                            .map(v -> "-D" + v)
                            .collect(Collectors.joining(" "));
            driverJavaOpts += " " + properties;
            executorJavaOpts += " " + properties;
            this.sparkConf.put("spark.driver.extraJavaOptions", driverJavaOpts.trim());
            this.sparkConf.put("spark.executor.extraJavaOptions", executorJavaOpts.trim());
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        File file = new File(configFile);
        if (!file.exists()) {
            throw new FileNotFoundException("config file '" + file + "' does not exists!");
        }
        Config appConfig =
                ConfigFactory.parseFile(file)
                        .resolve(ConfigResolveOptions.defaults().setAllowUnresolved(true))
                        .resolveWith(
                                ConfigFactory.systemProperties(),
                                ConfigResolveOptions.defaults().setAllowUnresolved(true));

        return appConfig.getConfig("env").entrySet().stream()
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, e -> e.getValue().unwrapped().toString()));
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        Path pluginRootDir = Common.connectorJarDir("seatunnel");
        if (!Files.exists(pluginRootDir) || !Files.isDirectory(pluginRootDir)) {
            return Collections.emptyList();
        }
        Config config = ConfigBuilder.of(commandArgs.getConfigFile());
        Set<URL> pluginJars = new HashSet<>();
        SeaTunnelSourcePluginDiscovery seaTunnelSourcePluginDiscovery =
                new SeaTunnelSourcePluginDiscovery();
        SeaTunnelSinkPluginDiscovery seaTunnelSinkPluginDiscovery =
                new SeaTunnelSinkPluginDiscovery();
        pluginJars.addAll(
                seaTunnelSourcePluginDiscovery.getPluginJarPaths(
                        getPluginIdentifiers(config, PluginType.SOURCE)));
        pluginJars.addAll(
                seaTunnelSinkPluginDiscovery.getPluginJarPaths(
                        getPluginIdentifiers(config, PluginType.SINK)));
        return pluginJars.stream()
                .map(url -> new File(url.getPath()).toPath())
                .collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        List<String> commands = new ArrayList<>();
        commands.add("${SPARK_HOME}/bin/spark-submit");
        appendOption(commands, "--class", SeaTunnelSpark.class.getName());
        appendOption(commands, "--name", this.commandArgs.getJobName());
        appendOption(commands, "--master", this.commandArgs.getMaster());
        appendOption(commands, "--deploy-mode", this.commandArgs.getDeployMode().getDeployMode());
        appendJars(commands, this.jars);
        appendFiles(commands, this.files);
        appendSparkConf(commands, this.sparkConf);
        appendAppJar(commands);
        appendOption(commands, "--config", this.commandArgs.getConfigFile());
        appendOption(commands, "--master", this.commandArgs.getMaster());
        appendOption(commands, "--deploy-mode", this.commandArgs.getDeployMode().getDeployMode());
        appendOption(commands, "--name", this.commandArgs.getJobName());
        if (commandArgs.isEncrypt()) {
            commands.add("--encrypt");
        }
        if (commandArgs.isDecrypt()) {
            commands.add("--decrypt");
        }
        if (this.commandArgs.isCheckConfig()) {
            commands.add("--check");
        }
        return commands;
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        return Arrays.stream(pluginTypes)
                .flatMap(
                        (Function<PluginType, Stream<PluginIdentifier>>)
                                pluginType -> {
                                    List<? extends Config> configList =
                                            config.getConfigList(pluginType.getType());
                                    return configList.stream()
                                            .map(
                                                    pluginConfig ->
                                                            PluginIdentifier.of(
                                                                    "seatunnel",
                                                                    pluginType.getType(),
                                                                    pluginConfig.getString(
                                                                            "plugin_name")));
                                })
                .collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
            for (ClientModeSparkConfigs config : ClientModeSparkConfigs.values()) {
                String driverJavaOptions = this.sparkConf.get(config.propertyName);
                if (StringUtils.isNotBlank(driverJavaOptions)) {
                    appendOption(commands, config.optionName, driverJavaOptions);
                }
            }
            for (Map.Entry<String, String> entry : sparkConf.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (ClientModeSparkConfigs.PROPERTY_NAME_MAP.containsKey(key)) {
                    continue;
                }
                appendOption(commands, "--conf", key + "=" + value);
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
            Common.setDeployMode(commandArgs.getDeployMode());
            Common.setStarter(true);
            Path pluginTarball = Common.pluginTarball();
            CompressionUtils.tarGzip(Common.pluginRootDir(), pluginTarball);
            this.files.add(pluginTarball);
            this.files.add(Paths.get(commandArgs.getConfigFile()));
            return super.buildCommands();
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java
SeaTunnelSinkPluginDiscovery sinkPluginDiscovery = new SeaTunnelSinkPluginDiscovery();
        List<URL> pluginJars = new ArrayList<>();
        List<SeaTunnelSink<?, ?, ?, ?>> sinks =
                pluginConfigs.stream()
                        .map(
                                sinkConfig -> {
                                    PluginIdentifier pluginIdentifier =
                                            PluginIdentifier.of(
                                                    ENGINE_TYPE,
                                                    PLUGIN_TYPE,
                                                    sinkConfig.getString(PLUGIN_NAME));
                                    pluginJars.addAll(
                                            sinkPluginDiscovery.getPluginJarPaths(
                                                    Lists.newArrayList(pluginIdentifier)));
                                    SeaTunnelSink<?, ?, ?, ?> seaTunnelSink =
                                            sinkPluginDiscovery.createPluginInstance(
                                                    pluginIdentifier);
                                    seaTunnelSink.prepare(sinkConfig);
                                    seaTunnelSink.setJobContext(jobContext);
                                    if (SupportDataSaveMode.class.isAssignableFrom(
                                            seaTunnelSink.getClass())) {
                                        SupportDataSaveMode saveModeSink =
                                                (SupportDataSaveMode) seaTunnelSink;
                                        saveModeSink.checkOptions(sinkConfig);
                                    }
                                    return seaTunnelSink;
                                })
                        .distinct()
                        .collect(Collectors.toList());
        sparkRuntimeEnvironment.registerPlugin(pluginJars);
        return sinks;
```

### DuplicatedCode
Duplicated code
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java
            Config sinkConfig = pluginConfigs.get(i);
            SeaTunnelSink<?, ?, ?, ?> seaTunnelSink = plugins.get(i);
            Dataset<Row> dataset =
                    fromSourceTable(sinkConfig, sparkRuntimeEnvironment).orElse(input);
            int parallelism;
            if (sinkConfig.hasPath(CommonOptions.PARALLELISM.key())) {
                parallelism = sinkConfig.getInt(CommonOptions.PARALLELISM.key());
            } else {
                parallelism =
                        sparkRuntimeEnvironment
                                .getSparkConf()
                                .getInt(
                                        CommonOptions.PARALLELISM.key(),
                                        CommonOptions.PARALLELISM.defaultValue());
            }
            dataset.sparkSession().read().option(CommonOptions.PARALLELISM.key(), parallelism);
            // TODO modify checkpoint location
            seaTunnelSink.setTypeInfo(
                    (SeaTunnelRowType) TypeConverterUtils.convert(dataset.schema()));
            if (SupportDataSaveMode.class.isAssignableFrom(seaTunnelSink.getClass())) {
                SupportDataSaveMode saveModeSink = (SupportDataSaveMode) seaTunnelSink;
                DataSaveMode dataSaveMode = saveModeSink.getDataSaveMode();
                saveModeSink.handleSaveMode(dataSaveMode);
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelCancelJobCodec.java`
#### Snippet
```java
        Frame initialFrame = new Frame(new byte[REQUEST_INITIAL_FRAME_SIZE], UNFRAGMENTED_MESSAGE);
        encodeInt(initialFrame.content, TYPE_FIELD_OFFSET, REQUEST_MESSAGE_TYPE);
        encodeInt(initialFrame.content, PARTITION_ID_FIELD_OFFSET, -1);
        encodeLong(initialFrame.content, REQUEST_JOB_ID_FIELD_OFFSET, jobId);
        clientMessage.add(initialFrame);
        return clientMessage;
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobInfoCodec.java`
#### Snippet
```java
        ClientMessage.Frame initialFrame =
                new ClientMessage.Frame(new byte[REQUEST_INITIAL_FRAME_SIZE], UNFRAGMENTED_MESSAGE);
        encodeInt(initialFrame.content, TYPE_FIELD_OFFSET, REQUEST_MESSAGE_TYPE);
        encodeInt(initialFrame.content, PARTITION_ID_FIELD_OFFSET, -1);
        encodeLong(initialFrame.content, REQUEST_JOB_ID_FIELD_OFFSET, jobId);
        clientMessage.add(initialFrame);
        return clientMessage;
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobInfoCodec.java`
#### Snippet
```java
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
                new ClientMessage.Frame(
                        new byte[RESPONSE_INITIAL_FRAME_SIZE], UNFRAGMENTED_MESSAGE);
        encodeInt(initialFrame.content, TYPE_FIELD_OFFSET, RESPONSE_MESSAGE_TYPE);
        clientMessage.add(initialFrame);

        DataCodec.encode(clientMessage, response);
        return clientMessage;
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobMetricsCodec.java`
#### Snippet
```java
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
                new ClientMessage.Frame(
                        new byte[RESPONSE_INITIAL_FRAME_SIZE], UNFRAGMENTED_MESSAGE);
        encodeInt(initialFrame.content, TYPE_FIELD_OFFSET, RESPONSE_MESSAGE_TYPE);
        clientMessage.add(initialFrame);

        StringCodec.encode(clientMessage, response);
        return clientMessage;
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
        String path = getStorageParentDirectory() + jobId;
        List<String> fileNames = getFileNames(path);
        if (fileNames.isEmpty()) {
            log.info("No checkpoint found for this job, the job id is: " + jobId);
            return new ArrayList<>();
        }
        List<PipelineState> states = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-local-file/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/localfile/LocalFileStorage.java`
#### Snippet
```java
        String parentPath = getStorageParentDirectory() + jobId;
        Collection<File> fileList = new ArrayList<>();
        try {
            fileList = FileUtils.listFiles(new File(parentPath), FILE_EXTENSIONS, false);
        } catch (Exception e) {
            if (!(e.getCause() instanceof NoSuchFileException)) {
                throw new CheckpointStorageException(ExceptionUtils.getMessage(e));
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
            int outputFieldLength = fieldNames.size();

            rowContainerGenerator =
                    new SeaTunnelRowContainerGenerator() {
                        @Override
                        public SeaTunnelRow apply(SeaTunnelRow inputRow) {
                            // todo reuse array container
                            Object[] outputFieldValues = new Object[outputFieldLength];
                            System.arraycopy(
                                    inputRow.getFields(),
                                    0,
                                    outputFieldValues,
                                    0,
                                    inputFieldLength);

                            SeaTunnelRow outputRow = new SeaTunnelRow(outputFieldValues);
                            outputRow.setTableId(inputRow.getTableId());
                            outputRow.setRowKind(inputRow.getRowKind());
                            return outputRow;
                        }
                    };
```

### DuplicatedCode
Duplicated code
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
            rowContainerGenerator =
                    new SeaTunnelRowContainerGenerator() {
                        @Override
                        public SeaTunnelRow apply(SeaTunnelRow inputRow) {
                            // todo reuse array container
                            Object[] outputFieldValues = new Object[outputFieldLength];
                            System.arraycopy(
                                    inputRow.getFields(),
                                    0,
                                    outputFieldValues,
                                    0,
                                    inputFieldLength);

                            SeaTunnelRow outputRow = new SeaTunnelRow(outputFieldValues);
                            outputRow.setTableId(inputRow.getTableId());
                            outputRow.setRowKind(inputRow.getRowKind());
                            return outputRow;
                        }
                    };
```

### DuplicatedCode
Duplicated code
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        List<ConstraintKey> copiedConstraintKeys =
                inputCatalogTable.getTableSchema().getConstraintKeys().stream()
                        .map(ConstraintKey::copy)
                        .collect(Collectors.toList());

        TableSchema.Builder builder = TableSchema.builder();
        if (inputCatalogTable.getTableSchema().getPrimaryKey() != null) {
            builder = builder.primaryKey(inputCatalogTable.getTableSchema().getPrimaryKey().copy());
        }
        builder = builder.constraintKey(copiedConstraintKeys);
        List<Column> columns =
                inputCatalogTable.getTableSchema().getColumns().stream()
                        .map(Column::copy)
                        .collect(Collectors.toList());

        int addFieldCount = 0;
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriter.java`
#### Snippet
```java
        Optional<CommitInfoT> commitInfoTOptional = sinkWriter.prepareCommit();
        commitInfoTOptional.ifPresent(commitInfoT -> latestCommitInfoT = commitInfoT);
        sinkWriter.snapshotState(epochId++);
        if (sinkCommitter != null) {
            if (latestCommitInfoT == null) {
                sinkCommitter.commit(Collections.emptyList());
            } else {
                sinkCommitter.commit(Collections.singletonList(latestCommitInfoT));
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriterFactory.java`
#### Snippet
```java
        SinkWriter<SeaTunnelRow, CommitInfoT, StateT> writer;
        SinkCommitter<CommitInfoT> committer;
        try {
            writer = sink.createWriter(context);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create SinkWriter.", e);
        }
        try {
            committer = sink.createCommitter().orElse(null);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create SinkCommitter.", e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/CoordinatedBatchPartitionReader.java`
#### Snippet
```java
            readerMap
                    .entrySet()
                    .parallelStream()
                    .forEach(
                            entry -> {
                                final AtomicBoolean flag = readerRunningMap.get(entry.getKey());
                                final SourceReader<SeaTunnelRow, SplitT> reader = entry.getValue();
                                final Collector<SeaTunnelRow> rowCollector =
                                        collectorMap.get(entry.getKey());
                                executorService.execute(
                                        () -> {
                                            while (flag.get()) {
                                                try {
                                                    reader.pollNext(rowCollector);
                                                    Thread.sleep(SLEEP_TIME_INTERVAL);
                                                } catch (Exception e) {
                                                    this.running = false;
                                                    flag.set(false);
                                                    throw new RuntimeException(e);
                                                }
                                            }
                                        });
                            });
            splitEnumerator.run();
            while (this.running) {
                Thread.sleep(SLEEP_TIME_INTERVAL);
            }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/ParallelBatchPartitionReader.java`
#### Snippet
```java
        if (!prepare) {
            return;
        }

        this.internalSource = createInternalSource();
        try {
            this.internalSource.open();
        } catch (Exception e) {
            running = false;
            throw new RuntimeException("Failed to open internal source.", e);
        }

        this.internalRowCollector =
                new InternalRowCollector(handover, checkpointLock, source.getProducedType());
        executorService.execute(
                () -> {
                    try {
                        internalSource.run(internalRowCollector);
                    } catch (Exception e) {
                        handover.reportError(e);
                        log.error("BatchPartitionReader execute failed.", e);
                        running = false;
                    }
                });
        prepare = false;
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
        try {
            int checkpointRetries = Math.max(1, CHECKPOINT_RETRIES);
            do {
                checkpointRetries--;
                long collectedReader =
                        collectorMap.values().stream()
                                .mapToLong(e -> e.collectTotalCount() > 0 ? 1 : 0)
                                .sum();
                if (collectedReader == 0) {
                    Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                }

                collectedReader =
                        collectorMap.values().stream()
                                .mapToLong(e -> e.collectTotalCount() > 0 ? 1 : 0)
                                .sum();
                if (collectedReader != 0 || checkpointRetries == 0) {
                    checkpointRetries = 0;
                    internalCheckpoint(collectorMap.values().iterator(), 0);
                }
            } while (checkpointRetries > 0);
        } catch (Exception e) {
            throw new RuntimeException("An error occurred in virtual checkpoint execution.", e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
        if (!iterator.hasNext()) {
            return;
        }
        synchronized (iterator.next().getCheckpointLock()) {
            internalCheckpoint(iterator, ++loop);
            if (loop != this.parallelism) {
                // Avoid backtracking calls
                return;
            }
            while (!handover.isEmpty()) {
                Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
            }
            // Block #next() method
            synchronized (handover) {
                final int currentCheckpoint = checkpointId;
                ReaderState readerState = snapshotState();
                saveState(readerState, currentCheckpoint);
                internalSource.notifyCheckpointComplete(currentCheckpoint);
                running = false;
            }
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        try {
            int checkpointRetries = Math.max(1, CHECKPOINT_RETRIES);
            do {
                checkpointRetries--;
                if (internalRowCollector.collectTotalCount() == 0) {
                    Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                }
                synchronized (checkpointLock) {
                    if (internalRowCollector.collectTotalCount() != 0 || checkpointRetries == 0) {
                        checkpointRetries = 0;

                        while (!handover.isEmpty()) {
                            Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                        }
                        // Block #next() method
                        synchronized (handover) {
                            final int currentCheckpoint = checkpointId;
                            ReaderState readerState = snapshotState();
                            saveState(readerState, currentCheckpoint);
                            internalSource.notifyCheckpointComplete(currentCheckpoint);
                            running = false;
                        }
                    }
                }
            } while (checkpointRetries > 0);
        } catch (Exception e) {
            throw new RuntimeException("An error occurred in virtual checkpoint execution.", e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        Path hdfsPath = getCheckpointPathWithId(checkpointId);
        if (!fileSystem.exists(hdfsPath)) {
            return null;
        }
        try (FSDataInputStream inputStream = fileSystem.open(hdfsPath);
                ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            int i = 0;
            final int defaultLen = 1024;
            byte[] buffer = new byte[defaultLen];
            while ((i = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, i);
            }

            return ((ReaderState) SerializationUtils.deserialize(out.toByteArray())).getBytes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
        byte[] bytes = SerializationUtils.serialize(readerState);
        Path hdfsPath = getCheckpointPathWithId(checkpointId);
        if (!fileSystem.exists(hdfsPath)) {
            fileSystem.createNewFile(hdfsPath);
        }

        try (FSDataOutputStream outputStream = fileSystem.append(hdfsPath)) {
            outputStream.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
        if (hashTrieMap == null || hashTrieMap.size() == 0) {
            return Collections.emptyMap();
        }
        int num = hashTrieMap.size();
        Map<Object, Object> newMap = new LinkedHashMap<>(num);
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
        SeaTunnelDataType<?> valueType = mapType.getValueType();
        scala.collection.immutable.List<?> keyList = hashTrieMap.keySet().toList();
        scala.collection.immutable.List<?> valueList = hashTrieMap.values().toList();
        for (int i = 0; i < num; i++) {
            Object key = keyList.apply(i);
            Object value = valueList.apply(i);
            key = reconvert(key, keyType);
            value = reconvert(value, valueType);
            newMap.put(key, value);
        }
        return newMap;
```

### DuplicatedCode
Duplicated code
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-common/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
        if (arrayData == null || arrayData.size() == 0) {
            return Collections.emptyList().toArray();
        }
        Object[] newArray = new Object[arrayData.size()];
        for (int i = 0; i < arrayData.size(); i++) {
            newArray[i] = reconvert(arrayData.apply(i), arrayType.getElementType());
        }
        return newArray;
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
        try {
            virtualCreator.accept(factory.get());
        } catch (Exception e) {
            if (e instanceof UnsupportedOperationException
                    && "The Factory has not been implemented and the deprecated Plugin will be used."
```

### CatchMayIgnoreException
Empty `catch` block
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            try {
                disconnect(channel);
            } catch (IOException ioe) {
            }
        }
```

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
Empty `catch` block
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/sqlserver/SqlServerURLParser.java`
#### Snippet
```java
                try {
                    port = Integer.parseInt(portNumber);
                } catch (NumberFormatException e) {
                }
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

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `paths` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        if (config.hasPath(path)) {
            Set<URL> paths =
                    Arrays.stream(config.getString(path).split(";"))
                            .map(
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java
                new SeaTunnelSourcePluginDiscovery(ADD_URL_TO_CLASSLOADER);
        List<SeaTunnelSource> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier =
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SourceExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelSourcePluginDiscovery sourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery();
        List<SeaTunnelSource<?, ?, ?>> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier =
```

### CollectionContainsUrl
Set `pluginJars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        }
        Config config = ConfigBuilder.of(commandArgs.getConfigFile());
        Set<URL> pluginJars = new HashSet<>();
        SeaTunnelSourcePluginDiscovery seaTunnelSourcePluginDiscovery =
                new SeaTunnelSourcePluginDiscovery();
```

### CollectionContainsUrl
Set `pluginJars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        }
        Config config = ConfigBuilder.of(commandArgs.getConfigFile());
        Set<URL> pluginJars = new HashSet<>();
        SeaTunnelSourcePluginDiscovery seaTunnelSourcePluginDiscovery =
                new SeaTunnelSourcePluginDiscovery();
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
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/TransformChainAction.java`
#### Snippet
```java
            long id,
            @NonNull String name,
            @NonNull Set<URL> jarUrls,
            @NonNull List<SeaTunnelTransform<T>> transforms) {
        super(id, name, jarUrls);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SinkAction.java`
#### Snippet
```java
            @NonNull List<Action> upstreams,
            @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
            @NonNull Set<URL> jarUrls,
            SinkConfig config) {
        super(id, name, upstreams, jarUrls, config);
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SinkAction.java`
#### Snippet
```java
            @NonNull List<Action> upstreams,
            @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
            @NonNull Set<URL> jarUrls) {
        this(id, name, upstreams, sink, jarUrls, null);
    }
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/SinkAction.java`
#### Snippet
```java
            @NonNull String name,
            @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
            @NonNull Set<URL> jarUrls) {
        this(id, name, new ArrayList<>(), sink, jarUrls);
    }
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
            @NonNull String name,
            @NonNull SeaTunnelTransform<?> transform,
            @NonNull Set<URL> jarUrls) {
        super(id, name, jarUrls);
        this.transform = transform;
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
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
            @NonNull String name,
            @NonNull List<Action> upstreams,
            @NonNull Set<URL> jarUrls) {
        this(id, name, upstreams, jarUrls, null);
    }
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    private final Config config;

    protected AbstractAction(long id, @NonNull String name, @NonNull Set<URL> jarUrls) {
        this(id, name, new ArrayList<>(), jarUrls);
    }
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
            @NonNull String name,
            @NonNull List<Action> upstreams,
            @NonNull Set<URL> jarUrls,
            Config config) {
        this.id = id;
```

### CollectionContainsUrl
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    private int parallelism = 1;

    private final Set<URL> jarUrls;

    private final Config config;
```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/ConfigParserUtil.java`
#### Snippet
```java
            Class<T> factoryClass,
            String factoryId) {
        Set<URL> factoryUrls = new HashSet<>();
        URL factoryUrl =
                FactoryUtil.getFactoryUrl(
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
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
        final String factoryId = getFactoryId(readonlyConfig);
        // get factory urls
        Set<URL> factoryUrls =
                getFactoryUrls(readonlyConfig, classLoader, TableTransformFactory.class, factoryId);
        final List<String> inputIds = getInputIds(readonlyConfig);
```

### CollectionContainsUrl
Set `urls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java

    public Set<URL> getUsedFactoryUrls(List<Action> sinkActions) {
        Set<URL> urls = new HashSet<>();
        fillUsedFactoryUrls(sinkActions, urls);
        return urls;
```

### CollectionContainsUrl
Set `result` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
    }

    private void fillUsedFactoryUrls(List<Action> actions, Set<URL> result) {
        actions.forEach(
                action -> {
```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java

        // get factory urls
        Set<URL> factoryUrls =
                getFactoryUrls(readonlyConfig, classLoader, TableSinkFactory.class, factoryId);
        List<SinkAction<?, ?, ?, ?>> sinkActions = new ArrayList<>();
```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
                                catalogTables, readonlyConfig, classLoader, factoryId);

        Set<URL> factoryUrls =
                getFactoryUrls(readonlyConfig, classLoader, TableSourceFactory.class, factoryId);

```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
            sinkActions.addAll(parseSink(configIndex, sinkConfig, classLoader, tableWithActionMap));
        }
        Set<URL> factoryUrls = getUsedFactoryUrls(sinkActions);
        factoryUrls.addAll(commonPluginJars);
        sinkActions.forEach(this::addCommonPluginJarsToAction);
```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
            ReadonlyConfig readonlyConfig,
            ClassLoader classLoader,
            Set<URL> factoryUrls,
            String factoryId,
            int parallelism,
```

### CollectionContainsUrl
Set `pluginJarsUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    private final FlakeIdGenerator flakeIdGenerator;

    private final Set<URL> pluginJarsUrls;

    private final IMap<Object, Object> runningJobStateIMap;
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/TaskGroupImmutableInformation.java`
#### Snippet
```java
    private Data group;

    private Set<URL> jars;

    public TaskGroupImmutableInformation() {}
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            List<SeaTunnelTransform> transforms = new ArrayList<>(transformChainedVertices.size());
            List<String> names = new ArrayList<>(transformChainedVertices.size());
            Set<URL> jars = new HashSet<>();

            transformChainedVertices.stream()
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
                                                .peek(this::fillCheckpointPlan)
                                                .collect(Collectors.toList());
                                Set<URL> jars =
                                        taskList.stream()
                                                .flatMap(task -> task.getJarsUrl().stream())
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    }

    protected ConfigNodePath first() {
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
        for (int i = 0; i < tokensCopy.size(); i++) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    }

    protected Path value() {
        return path;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java
    }

    protected ConfigNodePath subPath(int toRemove) {
        int periodCount = 0;
        ArrayList<Token> tokensCopy = new ArrayList<>(tokens);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigNodePath.java`
#### Snippet
```java

    @Override
    protected Collection<Token> tokens() {
        return tokens;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
    }

    protected static ConfigNodePath parsePathNodeExpression(
            Iterator<Token> expression, ConfigOrigin origin) {
        return parsePathNodeExpression(expression, origin, null, ConfigSyntax.CONF);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
    }

    protected static Path parsePathExpression(
            Iterator<Token> expression, ConfigOrigin origin, String originalText) {
        return parsePathExpression(expression, origin, originalText, null, ConfigSyntax.CONF);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java

    // originalText may be null if not available
    protected static Path parsePathExpression(
            Iterator<Token> expression,
            ConfigOrigin origin,
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
    }

    protected static ConfigNodePath parsePathNodeExpression(
            Iterator<Token> expression,
            ConfigOrigin origin,
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
    }

    protected static Path parsePathExpression(Iterator<Token> expression, ConfigOrigin origin) {
        return parsePathExpression(expression, origin, null, null, ConfigSyntax.CONF);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected SimpleConfigObject withOnlyPathOrNull(Path path) {
        String key = path.first();
        Path next = path.remainder();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected AbstractConfigValue attemptPeekWithPartialResolve(String key) {
        return this.value.get(key);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected SimpleConfigObject newCopy(ResolveStatus newStatus, ConfigOrigin newOrigin) {
        return this.newCopy(newStatus, newOrigin, this.ignoresFallbacks);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConfigObject;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected SimpleConfigObject withFallbacksIgnored() {
        return this.ignoresFallbacks
                ? this
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected boolean ignoresFallbacks() {
        return this.ignoresFallbacks;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected void render(
            StringBuilder sb, int indent, boolean atRoot, ConfigRenderOptions options) {
        if (this.isEmpty()) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
    }

    protected SimpleConfigObject mergedWithObject(AbstractConfigObject abstractFallback) {
        this.requireNotIgnoringFallbacks();
        if (!(abstractFallback instanceof SimpleConfigObject)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
     * @return the table ID, or null if it could not be parsed
     */
    protected static TableId parse(String[] parts, int numParts, boolean useCatalogBeforeSchema) {
        if (numParts == 0) {
            return null;
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java

        final List<File> untaredFiles = new LinkedList<>();
        try (final InputStream is = new FileInputStream(inputFile);
                final TarArchiveInputStream debInputStream =
                        (TarArchiveInputStream)
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
                } else {
                    log.info("Creating output file {}.", outputFile.getAbsolutePath());
                    final OutputStream outputFileStream = new FileOutputStream(outputFile);
                    IOUtils.copy(debInputStream, outputFileStream);
                    outputFileStream.close();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
        }

        try (InputStream in = new FileInputStream(trustStorePath)) {
            trustStore.load(in, trustStorePassword.map(String::toCharArray).orElse(null));
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java

                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try (InputStream in = new FileInputStream(keyStoreFile)) {
                    keyStore.load(in, keyManagerPassword);
                }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PropertiesParser.java`
#### Snippet
```java
         */
        List<Path> sortedScopePaths = new ArrayList<Path>();
        sortedScopePaths.addAll(scopePaths);
        // sort descending by length
        Collections.sort(
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MySqlTaskContextImpl` may be 'static'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/MySqlSourceFetchTaskContext.java`
#### Snippet
```java

    /** A subclass implementation of {@link MySqlTaskContext} which reuses one BinaryLogClient. */
    public class MySqlTaskContextImpl extends MySqlTaskContext {

        private final BinaryLogClient reusedBinaryLogClient;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionRule.java`
#### Snippet
```java
            verifyConditionalExists(conditionalOption);

            /** Each parameter can only be controlled by one other parameter */
            Expression expression = Expression.of(Condition.of(conditionalOption, expectValue));
            RequiredOption.ConditionalRequiredOptions conditionalRequiredOption =
```

### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionRule.java`
#### Snippet
```java
            }

            /** Each parameter can only be controlled by one other parameter */
            Expression expression =
                    Expression.of(Condition.of(conditionalOption, expectValues.get(0)));
```

### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/IMapFileStorage.java`
#### Snippet
```java
                businessName,
                region);
        /**
         * 1. close current disruptor 2. delete all files notice: we can not delete the files in the
         * middle of the write, so some current file may be not deleted
```

### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
        Map<String, String> deleteMetadata = createMetadata(row, key);
        try {
            /**
             * format example: { "delete" : {"_index" : "${your_index}", "_id" :
             * "${your_document_id}"} }
```

### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
            if (key != null) {
                Map<String, String> upsertMetadata = createMetadata(row, key);
                /**
                 * format example: { "update" : {"_index" : "${your_index}", "_id" :
                 * "${your_document_id}"} }\n { "doc" : ${your_document_json}, "doc_as_upsert" :
```

### DanglingJavadoc
Dangling Javadoc comment
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/ElasticsearchRowSerializer.java`
#### Snippet
```java
            } else {
                Map<String, String> indexMetadata = createMetadata(row);
                /**
                 * format example: { "index" : {"_index" : "${your_index}", "_id" :
                 * "${your_document_id}"} }\n ${your_document_json}
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

    public boolean containsKey(Object key) {
        return this.value.containsKey(key);
    }

```

### SuspiciousMethodCalls
'Map' may not contain values of type 'Object'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

    public boolean containsValue(Object v) {
        return this.value.containsValue(v);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

    public AbstractConfigValue get(Object key) {
        return this.value.get(key);
    }

```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Long'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/DAGUtils.java`
#### Snippet
```java
                                                                        p.getActions()
                                                                                .containsKey(
                                                                                        info.getAction()
                                                                                                .getId()))
                                                        .findFirst()
                                                        .get()
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
        }

        if (lastWasDot) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelHealthMonitor.java`
#### Snippet
```java
                return true;
            }
            if (operationServicePendingInvocationsCount.read() > THRESHOLD_INVOCATIONS) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPConnectionPool.java`
#### Snippet
```java

                boolean ret = true;
                if (this.host == null || !this.host.equalsIgnoreCase(con.host)) {
                    ret = false;
                }
```

### TrivialIf
`if` statement can be simplified
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java

    public boolean hasNext() {
        if (offsetInRowBatch < readRowCount) {
            return true;
        }
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `enumeratorContext`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
        Serializable snapshotState = null;
        byte[] serialize = null;
        synchronized (enumeratorContext) {
            if (barrier.snapshot()) {
                snapshotState = enumerator.snapshotState(barrierId);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

    private MetricsContext metricsContext;
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java
            String projection,
            Optional<String> condition,
            Optional<String> orderBy) {
        final StringBuilder sql = new StringBuilder("SELECT ");
        if (limit > 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'condition'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java
            String projection,
            String maxColumnProjection,
            Optional<String> condition,
            String orderBy) {
        final StringBuilder sql = new StringBuilder("SELECT ");
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
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
    }

    private static RuntimeException wrapException(String action, Optional<Xid> xid, Exception ex) {
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
`Optional` used as type for parameter 'xid'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/xa/XaFacadeImplAutoLoad.java`
#### Snippet
```java
        }

        private Command(String name, Optional<Xid> xid, Callable<T> callable) {
            this(name, xid, callable, e -> empty());
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java

    public static Optional<SSLContext> buildSSLContext(
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
    public static Optional<SSLContext> buildSSLContext(
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trustStorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
            throws GeneralSecurityException, IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trustStorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
            throws GeneralSecurityException, IOException {
        if (!keyStorePath.isPresent() && !trustStorePath.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trustStorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
    }

    private static KeyStore loadTrustStore(File trustStorePath, Optional<String> trustStorePassword)
            throws IOException, GeneralSecurityException {
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java

    private static SSLContext createSSLContext(
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
    private static SSLContext createSSLContext(
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trustStorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
            Optional<String> keyStorePath,
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
            throws GeneralSecurityException, IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trustStorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
            Optional<String> keyStorePassword,
            Optional<String> trustStorePath,
            Optional<String> trustStorePassword)
            throws GeneralSecurityException, IOException {
        // load KeyStore if configured and get KeyManagers
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'username'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
    public static EsRestClient createInstance(
            List<String> hosts,
            Optional<String> username,
            Optional<String> password,
            boolean tlsVerifyCertificate,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'password'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            List<String> hosts,
            Optional<String> username,
            Optional<String> password,
            boolean tlsVerifyCertificate,
            boolean tlsVerifyHostnames,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keystorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            boolean tlsVerifyCertificate,
            boolean tlsVerifyHostnames,
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keystorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            boolean tlsVerifyHostnames,
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'truststorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
        RestClientBuilder restClientBuilder =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'truststorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
        RestClientBuilder restClientBuilder =
                getRestClientBuilder(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'username'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
    private static RestClientBuilder getRestClientBuilder(
            List<String> hosts,
            Optional<String> username,
            Optional<String> password,
            boolean tlsVerifyCertificate,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'password'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            List<String> hosts,
            Optional<String> username,
            Optional<String> password,
            boolean tlsVerifyCertificate,
            boolean tlsVerifyHostnames,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keystorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            boolean tlsVerifyCertificate,
            boolean tlsVerifyHostnames,
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keystorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            boolean tlsVerifyHostnames,
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'truststorePath'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            Optional<String> keystorePath,
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
        HttpHost[] httpHosts = new HttpHost[hosts.size()];
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'truststorePassword'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            Optional<String> keystorePassword,
            Optional<String> truststorePath,
            Optional<String> truststorePassword) {
        HttpHost[] httpHosts = new HttpHost[hosts.size()];
        for (int i = 0; i < hosts.size(); i++) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
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

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldNames`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
        if (outputFieldNames.length != new HashSet<>(Arrays.asList(outputFieldNames)).size()) {
            throw new IllegalStateException(
                    "Duplicate field names are not allowed. field names: " + outputFieldNames);
        }

```

### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldNames`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
            throw new IllegalStateException(
                    "Field name and field type count mismatch, field names: "
                            + outputFieldNames
                            + ", field types: "
                            + outputFieldDataTypes);
```

### ImplicitArrayToString
Implicit call to 'toString()' on array `outputFieldDataTypes`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
                            + outputFieldNames
                            + ", field types: "
                            + outputFieldDataTypes);
        }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java
                                        CommonOptions.PARALLELISM.defaultValue());
            }
            dataset.sparkSession().read().option(CommonOptions.PARALLELISM.key(), parallelism);
            // TODO modify checkpoint location
            seaTunnelSink.setTypeInfo(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
#### Snippet
```java
                                        CommonOptions.PARALLELISM.defaultValue());
            }
            dataset.sparkSession().read().option(CommonOptions.PARALLELISM.key(), parallelism);
            // TODO modify checkpoint location
            seaTunnelSink.setTypeInfo(
```

### AutoCloseableResource
'StringDeserializer' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java
                                                                sourceSplit.getTopicPartition());
                                                StringDeserializer stringDeserializer =
                                                        new StringDeserializer();
                                                stringDeserializer.configure(
                                                        Maps.fromProperties(
```

### AutoCloseableResource
'BatchTableCommit' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/commit/PaimonAggregatedCommitter.java`
#### Snippet
```java
            List<PaimonAggregatedCommitInfo> aggregatedCommitInfo) throws IOException {
        try (BatchTableCommit tableCommit =
                ((InnerTableCommit) table.newBatchWriteBuilder().newCommit())
                        .withLock(localFactory.create())) {
            List<CommitMessage> fileCommittables =
```

### AutoCloseableResource
'BatchTableCommit' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/PaimonSinkWriter.java`
#### Snippet
```java
        this.checkpointId = states.get(0).getCheckpointId();
        try (BatchTableCommit tableCommit =
                ((InnerTableCommit) table.newBatchWriteBuilder().newCommit())
                        .withLock(Lock.emptyFactory().create())) {
            List<CommitMessage> commitables =
```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/reader/IcebergFileScanTaskReader.java`
#### Snippet
```java

    public CloseableIterator<Record> open(@NonNull FileScanTask task) {
        CloseableIterable<Record> iterable = icebergGenericRead(task);
        return iterable.iterator();
    }
```

### AutoCloseableResource
'StarRocksCatalog' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/sink/StarRocksSink.java`
#### Snippet
```java
    private void autoCreateTable(String template) {
        StarRocksCatalog starRocksCatalog =
                new StarRocksCatalog(
                        "StarRocks",
                        sinkConfig.getUsername(),
```

### AutoCloseableResource
'ClickHouseClient' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
    public ClickHouseRequest<?> getClickhouseConnection(Shard shard) {
        ClickHouseClient c =
                shardToDataSource.computeIfAbsent(
                        shard, s -> ClickHouseClient.newInstance(s.getNode().getProtocol()));
        return c.connect(shard.getNode()).format(ClickHouseFormat.RowBinaryWithNamesAndTypes);
```

### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
            try {
                try (CloseableHttpResponse execute =
                        httpClientBuilder.build().execute(putBuilder.build())) {
                    int statusCode = execute.getStatusLine().getStatusCode();
                    String reason = execute.getStatusLine().getReasonPhrase();
```

### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
            HttpPut httpPut = putBuilder.build();
            try {
                try (CloseableHttpResponse response = httpClientBuilder.build().execute(httpPut)) {
                    final int statusCode = response.getStatusLine().getStatusCode();
                    if (statusCode == 200 && response.getEntity() != null) {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/bean/IMapData.java`
#### Snippet
```java
    @Override
    public int compareTo(IMapData o) {
        return o.timestamp - this.timestamp > 0 ? 1 : -1;
    }
}
```

### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/bean/IMapFileData.java`
#### Snippet
```java
    @Override
    public int compareTo(IMapFileData o) {
        return o.timestamp - this.timestamp > 0 ? 1 : -1;
    }
}
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'org.apache.seatunnel.format.json.RowToJsonConverters.RowToJsonConverter\[\]' found
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                                })
                        .toArray(
                                new IntFunction<RowToJsonConverter[]>() {
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
                                })
                        .toArray(
                                new IntFunction<JsonToRowConverter[]>() {
                                    @Override
                                    public JsonToRowConverter[] apply(int value) {
                                        return new JsonToRowConverter[value];
                                    }
                                });
        final String[] fieldNames = rowType.getFieldNames();

```

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
                        throw new SeaTunnelTextFormatException(
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
                        String errorMsg =
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
                statement =
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                switch (elementType.getSqlType()) {
                    case STRING:
                        return origArray.toArray(new String[0]);
                    case BOOLEAN:
                        return origArray.toArray(new Boolean[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Boolean\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new String[0]);
                    case BOOLEAN:
                        return origArray.toArray(new Boolean[0]);
                    case INT:
                        return origArray.toArray(new Integer[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Integer\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Boolean[0]);
                    case INT:
                        return origArray.toArray(new Integer[0]);
                    case BIGINT:
                        return origArray.toArray(new Long[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Long\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Integer[0]);
                    case BIGINT:
                        return origArray.toArray(new Long[0]);
                    case FLOAT:
                        return origArray.toArray(new Float[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Float\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Long[0]);
                    case FLOAT:
                        return origArray.toArray(new Float[0]);
                    case DOUBLE:
                        return origArray.toArray(new Double[0]);
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Double\[\]' found
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Float[0]);
                    case DOUBLE:
                        return origArray.toArray(new Double[0]);
                    default:
                        throw new MaxcomputeConnectorException(
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `transform.map(...)` to `SeaTunnelRow` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                        inputRowConverter.reconvert(
                                new SeaTunnelRow(((GenericRowWithSchema) row).values()));
                seaTunnelRow = (SeaTunnelRow) transform.map(seaTunnelRow);
                if (seaTunnelRow == null) {
                    return null;
```

### RedundantCast
Casting `v` to `AbstractConfigValue` is redundant
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java
            Map newMap;
            if (this.value.isEmpty()) {
                newMap = Collections.singletonMap(key, (AbstractConfigValue) v);
            } else {
                newMap = new LinkedHashMap<>(this.value);
```

### RedundantCast
Casting `loader.load(...)` to `MySqlOffsetContext` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/scan/MySqlSnapshotFetchTask.java`
#### Snippet
```java
                new MySqlOffsetContext.Loader(context.getSourceConfig().getDbzConnectorConfig());
        final MySqlOffsetContext mySqlOffsetContext =
                (MySqlOffsetContext)
                        loader.load(backfillBinlogSplit.getStartupOffset().getOffset());
        // we should only capture events for the current table,
```

### RedundantCast
Casting `this.fieldNames.get(...)` to `String` is redundant
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java
            }

            stringBuilder.append((String) this.fieldNames.get(i));
            stringBuilder.append(":");
            stringBuilder.append(((TypeInfo) this.fieldTypeInfos.get(i)).getTypeName());
```

### RedundantCast
Casting `this.fieldTypeInfos.get(...)` to `TypeInfo` is redundant
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java
            stringBuilder.append((String) this.fieldNames.get(i));
            stringBuilder.append(":");
            stringBuilder.append(((TypeInfo) this.fieldTypeInfos.get(i)).getTypeName());
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/TableSinkFactory.java`
#### Snippet
```java
     *
     * @param context TableFactoryContext
     * @return
     */
    default TableSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> createSink(
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/TableTransformFactory.java`
#### Snippet
```java
     *
     * @param context TableFactoryContext
     * @return
     */
    default <T> TableTransform<T> createTransform(TableFactoryContext context) {
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/transform/SeaTunnelTransform.java`
#### Snippet
```java
     * Get the catalog table output by this transform
     *
     * @return
     */
    CatalogTable getProducedCatalogTable();
```

### JavadocDeclaration
`@param pipelineId` tag description is missing
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
     * checkpoint coordinator complete.
     *
     * @param pipelineId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
     *
     * @param pipelineId
     * @return
     */
    public PassiveCompletableFuture<CheckpointCoordinatorState> waitCheckpointCoordinatorComplete(
```

### JavadocDeclaration
`@param pipelineId` tag description is missing
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
     * method to cancel checkpoint coordinator.
     *
     * @param pipelineId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointManager.java`
#### Snippet
```java
     *
     * @param pipelineId
     * @return
     */
    public PassiveCompletableFuture<CheckpointCoordinatorState> cancelCheckpoint(int pipelineId) {
```

### JavadocDeclaration
`@param hadoopConf` tag description is missing
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/config/AbstractConfiguration.java`
#### Snippet
```java
     * set extra options for configuration
     *
     * @param hadoopConf
     * @param config
     * @param prefix
```

### JavadocDeclaration
`@param config` tag description is missing
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/config/AbstractConfiguration.java`
#### Snippet
```java
     *
     * @param hadoopConf
     * @param config
     * @param prefix
     */
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/config/AbstractConfiguration.java`
#### Snippet
```java
     * @param hadoopConf
     * @param config
     * @param prefix
     */
    void setExtraConfiguration(
```

### JavadocDeclaration
CheckpointStorageException is not declared to be thrown by method deleteCheckpoint
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/CheckpointStorage.java`
#### Snippet
```java
     *
     * @param jobId job id
     * @throws CheckpointStorageException if delete checkpoint failed
     */
    void deleteCheckpoint(String jobId);
```

### JavadocDeclaration
`@param element` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordEmitter.java`
#### Snippet
```java
     * Process and emit the records to the {@link Collector}.
     *
     * @param element
     * @param collector
     * @param splitState
```

### JavadocDeclaration
`@param collector` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordEmitter.java`
#### Snippet
```java
     *
     * @param element
     * @param collector
     * @param splitState
     * @throws Exception
```

### JavadocDeclaration
`@param splitState` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordEmitter.java`
#### Snippet
```java
     * @param element
     * @param collector
     * @param splitState
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordEmitter.java`
#### Snippet
```java
     * @param collector
     * @param splitState
     * @throws Exception
     */
    void emitRecord(E element, Collector<T> collector, SplitStateT splitState) throws Exception;
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/RecordsWithSplitIds.java`
#### Snippet
```java
     * Get the finished splits.
     *
     * @return
     */
    Set<String> finishedSplits();
```

### JavadocDeclaration
`@throws` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/splitreader/SplitReader.java`
#### Snippet
```java
     * Close the split reader.
     *
     * @throws Exception
     */
    void close() throws Exception;
```

### JavadocDeclaration
`@param splitsChanges` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/splitreader/SplitReader.java`
#### Snippet
```java
     * Handle the split changes. This call should be non-blocking.
     *
     * @param splitsChanges
     */
    void handleSplitsChanges(SplitsChange<SplitT> splitsChanges);
```

### JavadocDeclaration
`@param finishedSplitIds` tag description is missing
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
     * Handles the finished splits to clean the state if needed.
     *
     * @param finishedSplitIds
     */
    protected abstract void onSplitFinished(Map<String, SplitStateT> finishedSplitIds);
```

### JavadocDeclaration
Wrong tag `description:`
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/sink/SentrySink.java`
#### Snippet
```java
import java.io.IOException;

/** @description: SentrySink class */
@AutoService(SeaTunnelSink.class)
public class SentrySink extends AbstractSimpleSink<SeaTunnelRow, Void> {
```

### JavadocDeclaration
Wrong tag `description:`
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/sink/SentrySinkWriter.java`
#### Snippet
```java
import java.io.IOException;

/** @description: SentrySinkWriter class */
public class SentrySinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {
    private SeaTunnelRowType seaTunnelRowType;
```

### JavadocDeclaration
`@param esType` tag description is missing
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
     * if not find the mapping SeaTunnelDataType will throw runtime exception
     *
     * @param esType
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
     *
     * @param esType
     * @return
     */
    public static SeaTunnelDataType getSeaTunnelDataType(String esType) {
```

### JavadocDeclaration
`@param record` tag description is missing
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
     * write record into cache.
     *
     * @param record
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
     *
     * @param record
     * @throws IOException
     */
    public void writeRecord(byte[] record) throws InterruptedException {
```

### JavadocDeclaration
IOException is not declared to be thrown by method writeRecord
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
     *
     * @param record
     * @throws IOException
     */
    public void writeRecord(byte[] record) throws InterruptedException {
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/AbstractSeaTunnelTransform.java`
#### Snippet
```java
     *
     * @param inputRow upstream input row data
     * @return
     */
    protected abstract SeaTunnelRow transformRow(SeaTunnelRow inputRow);
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/AbstractSeaTunnelTransform.java`
#### Snippet
```java
     *
     * @param inputRowType upstream input row type
     * @return
     */
    protected abstract SeaTunnelRowType transformRowType(SeaTunnelRowType inputRowType);
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
     * Outputs new field datatype
     *
     * @return
     */
    protected abstract SeaTunnelDataType getOutputFieldDataType();
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
     *
     * @param inputRow The inputRow of upstream input.
     * @return
     */
    protected abstract Object getOutputFieldValue(SeaTunnelRowAccessor inputRow);
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/SingleFieldOutputTransform.java`
#### Snippet
```java
     * Outputs new field
     *
     * @return
     */
    protected abstract String getOutputFieldName();
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
     * Outputs new fields
     *
     * @return
     */
    protected abstract String[] getOutputFieldNames();
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
     * Outputs new fields datatype
     *
     * @return
     */
    protected abstract SeaTunnelDataType[] getOutputFieldDataTypes();
```

### JavadocDeclaration
`@return` tag description is missing
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/MultipleFieldOutputTransform.java`
#### Snippet
```java
     *
     * @param inputRow The inputRow of upstream input.
     * @return
     */
    protected abstract Object[] getOutputFieldValues(SeaTunnelRowAccessor inputRow);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `tableIds` may be 'final'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/MultipleRowType.java`
#### Snippet
```java
        implements SeaTunnelDataType<SeaTunnelRow>, Iterable<Map.Entry<String, SeaTunnelRowType>> {
    private final Map<String, SeaTunnelRowType> rowTypeMap;
    @Getter private String[] tableIds;

    public MultipleRowType(String[] tableIds, SeaTunnelRowType[] rowTypes) {
```

### FieldMayBeFinal
Field `inputRowConverter` may be 'final'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        private SeaTunnelTransform<SeaTunnelRow> transform;
        private StructType structType;
        private SeaTunnelRowConverter inputRowConverter;
        private SeaTunnelRowConverter outputRowConverter;

```

### FieldMayBeFinal
Field `sourceIterator` may be 'final'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java

    private static class TransformIterator implements Iterator<Row>, Serializable {
        private Iterator<Row> sourceIterator;
        private SeaTunnelTransform<SeaTunnelRow> transform;
        private StructType structType;
```

### FieldMayBeFinal
Field `transform` may be 'final'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
    private static class TransformIterator implements Iterator<Row>, Serializable {
        private Iterator<Row> sourceIterator;
        private SeaTunnelTransform<SeaTunnelRow> transform;
        private StructType structType;
        private SeaTunnelRowConverter inputRowConverter;
```

### FieldMayBeFinal
Field `structType` may be 'final'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        private Iterator<Row> sourceIterator;
        private SeaTunnelTransform<SeaTunnelRow> transform;
        private StructType structType;
        private SeaTunnelRowConverter inputRowConverter;
        private SeaTunnelRowConverter outputRowConverter;
```

### FieldMayBeFinal
Field `outputRowConverter` may be 'final'
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        private StructType structType;
        private SeaTunnelRowConverter inputRowConverter;
        private SeaTunnelRowConverter outputRowConverter;

        public TransformIterator(
```

### FieldMayBeFinal
Field `id` may be 'final'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/AbstractAction.java`
#### Snippet
```java
    private transient List<Action> upstreams = new ArrayList<>();
    // This is used to assign a unique ID to every Action
    private long id;

    private int parallelism = 1;
```

### FieldMayBeFinal
Field `actions` may be 'final'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDagGenerator.java`
#### Snippet
```java
public class LogicalDagGenerator {
    private static final ILogger LOGGER = Logger.getLogger(LogicalDagGenerator.class);
    private List<Action> actions;
    private JobConfig jobConfig;
    private IdGenerator idGenerator;
```

### FieldMayBeFinal
Field `jobConfig` may be 'final'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDagGenerator.java`
#### Snippet
```java
    private static final ILogger LOGGER = Logger.getLogger(LogicalDagGenerator.class);
    private List<Action> actions;
    private JobConfig jobConfig;
    private IdGenerator idGenerator;

```

### FieldMayBeFinal
Field `idGenerator` may be 'final'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/logical/LogicalDagGenerator.java`
#### Snippet
```java
    private List<Action> actions;
    private JobConfig jobConfig;
    private IdGenerator idGenerator;

    private final Map<Long, LogicalVertex> logicalVertexMap = new LinkedHashMap<>();
```

### FieldMayBeFinal
Field `failedPipelineNum` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private AtomicInteger canceledPipelineNum = new AtomicInteger(0);

    private AtomicInteger failedPipelineNum = new AtomicInteger(0);

    private final JobImmutableInformation jobImmutableInformation;
```

### FieldMayBeFinal
Field `canceledPipelineNum` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private AtomicInteger finishedPipelineNum = new AtomicInteger(0);

    private AtomicInteger canceledPipelineNum = new AtomicInteger(0);

    private AtomicInteger failedPipelineNum = new AtomicInteger(0);
```

### FieldMayBeFinal
Field `finishedPipelineNum` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
    private final List<SubPlan> pipelineList;

    private AtomicInteger finishedPipelineNum = new AtomicInteger(0);

    private AtomicInteger canceledPipelineNum = new AtomicInteger(0);
```

### FieldMayBeFinal
Field `makeJobEndWhenPipelineEnded` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java

    /** Whether we make the job end when pipeline turn to end state. */
    private boolean makeJobEndWhenPipelineEnded = true;

    public PhysicalPlan(
```

### FieldMayBeFinal
Field `runningJobMasterMap` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * value: job master;
     */
    private Map<Long, JobMaster> runningJobMasterMap = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `currRunningTaskFuture` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
        private final AtomicBoolean isCancel = new AtomicBoolean(false);

        @Getter private Map<Long, Future<?>> currRunningTaskFuture = new ConcurrentHashMap<>();

        TaskGroupExecutionTracker(
```

### FieldMayBeFinal
Field `sinkWriteCount` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private MetricsContext metricsContext;

    private Counter sinkWriteCount;

    private Meter sinkWriteQPS;
```

### FieldMayBeFinal
Field `metricsContext` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private Optional<CommitInfoT> lastCommitInfo;

    private MetricsContext metricsContext;

    private Counter sinkWriteCount;
```

### FieldMayBeFinal
Field `sinkWriteQPS` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SinkFlowLifeCycle.java`
#### Snippet
```java
    private Counter sinkWriteCount;

    private Meter sinkWriteQPS;

    private final boolean containAggCommitter;
```

### FieldMayBeFinal
Field `isPhysicalDAGIInfo` may be 'final'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java

    // TODO add config to change value
    private boolean isPhysicalDAGIInfo = true;

    private final EngineConfig engineConfig;
```

### FieldMayBeFinal
Field `index` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/wal/writer/CloudWriter.java`
#### Snippet
```java
    private long blockSize = 1024 * 1024;

    private AtomicLong index = new AtomicLong(0);

    @Override
```

### FieldMayBeFinal
Field `REQUEST_MAP` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFutureCache.java`
#### Snippet
```java
    private static AtomicLong REQUEST_ID_GEN = new AtomicLong(0);

    private static ConcurrentHashMap<Long, RequestFuture> REQUEST_MAP = new ConcurrentHashMap<>();

    public static void put(long requestId, RequestFuture requestFuture) {
```

### FieldMayBeFinal
Field `REQUEST_ID_GEN` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFutureCache.java`
#### Snippet
```java
    }

    private static AtomicLong REQUEST_ID_GEN = new AtomicLong(0);

    private static ConcurrentHashMap<Long, RequestFuture> REQUEST_MAP = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `latch` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java
public class RequestFuture implements Future<Boolean> {

    private CountDownLatch latch = new CountDownLatch(1);

    private boolean success = false;
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/disruptor/WALWorkHandler.java`
#### Snippet
```java
public class WALWorkHandler implements WorkHandler<FileWALEvent> {

    private WALWriter writer;

    public WALWorkHandler(
```

### FieldMayBeFinal
Field `disruptor` may be 'final'
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/disruptor/WALDisruptor.java`
#### Snippet
```java
public class WALDisruptor implements Closeable {

    private volatile Disruptor<FileWALEvent> disruptor;

    private static final int DEFAULT_RING_BUFFER_SIZE = 1024;
```

### FieldMayBeFinal
Field `reuse` may be 'final'
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonSerializationSchema.java`
#### Snippet
```java
    private static final String OP_DELETE = "DELETE";

    private transient SeaTunnelRow reuse;

    private final JsonSerializationSchema jsonSerializer;
```

### FieldMayBeFinal
Field `table` may be 'final'
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
    private String database;

    private String table;

    /** Names of fields. */
```

### FieldMayBeFinal
Field `ignoreParseErrors` may be 'final'
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
    private final int fieldCount;

    private boolean ignoreParseErrors;

    /** Pattern of the specific database. */
```

### FieldMayBeFinal
Field `database` may be 'final'
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
    private static final String OP_ALTER = "ALTER";

    private String database;

    private String table;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/DeserializeFormat.java`
#### Snippet
```java
    COMPATIBLE_DEBEZIUM_JSON(CompatibleDebeziumJsonDeserializationSchema.IDENTIFIER);

    private String name;

    DeserializeFormat(String name) {
```

### FieldMayBeFinal
Field `provider` may be 'final'
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/config/S3Config.java`
#### Snippet
```java
        InstanceProfileCredentialsProvider("com.amazonaws.auth.InstanceProfileCredentialsProvider");

        private String provider;

        S3aAwsCredentialsProvider(String provider) {
```

### FieldMayBeFinal
Field `stats` may be 'final'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
    private InputStream wrappedStream;
    private ChannelSftp channel;
    private FileSystem.Statistics stats;
    private boolean closed;
    private long pos;
```

### FieldMayBeFinal
Field `wrappedStream` may be 'final'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
    public static final String E_CLIENT_NOT_CONNECTED = "Client not connected";

    private InputStream wrappedStream;
    private ChannelSftp channel;
    private FileSystem.Statistics stats;
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java

    private InputStream wrappedStream;
    private ChannelSftp channel;
    private FileSystem.Statistics stats;
    private boolean closed;
```

### FieldMayBeFinal
Field `method` may be 'final'
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/config/HttpRequestMethod.java`
#### Snippet
```java
    POST("post");

    private String method;

    HttpRequestMethod(String method) {
```

### FieldMayBeFinal
Field `format` may be 'final'
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/config/HttpConfig.java`
#### Snippet
```java
        JSON("json");

        private String format;

        ResponseFormat(String format) {
```

### FieldMayBeFinal
Field `jdbcSourceConfig` may be 'final'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplitEnumerator.java`
#### Snippet
```java
    private volatile boolean shouldEnumerate;

    private JdbcSourceConfig jdbcSourceConfig;
    private final PartitionParameter partitionParameter;

```

### FieldMayBeFinal
Field `mysqlDataTypeConvertor` may be 'final'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlCreateTableSqlBuilder.java`
#### Snippet
```java
    private List<ConstraintKey> constraintKeys;

    private MysqlDataTypeConvertor mysqlDataTypeConvertor;

    private MysqlCreateTableSqlBuilder(String tableName) {
```

### FieldMayBeFinal
Field `kuduSinkConfig` may be 'final'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
    private KuduSinkConfig kuduSinkConfig;

    public KuduSinkWriter(
```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java

    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
    private KuduSinkConfig kuduSinkConfig;
```

### FieldMayBeFinal
Field `fileWriter` may be 'final'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java
    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
    private KuduSinkConfig kuduSinkConfig;

```

### FieldMayBeFinal
Field `seaTunnelRowType` may be 'final'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/sink/KuduSinkWriter.java`
#### Snippet
```java
public class KuduSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {

    private SeaTunnelRowType seaTunnelRowType;
    private Config pluginConfig;
    private KuduOutputFormat fileWriter;
```

### FieldMayBeFinal
Field `partitionParameter` may be 'final'
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSourceSplitEnumerator.java`
#### Snippet
```java

    private final SourceSplitEnumerator.Context<KuduSourceSplit> enumeratorContext;
    private PartitionParameter partitionParameter;
    List<KuduSourceSplit> allSplit = new ArrayList<>();
    private Long maxVal;
```

### FieldMayBeFinal
Field `enable2PC` may be 'final'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/LabelGenerator.java`
#### Snippet
```java
public class LabelGenerator {
    private String labelPrefix;
    private boolean enable2PC;

    public LabelGenerator(String labelPrefix, boolean enable2PC) {
```

### FieldMayBeFinal
Field `labelPrefix` may be 'final'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/LabelGenerator.java`
#### Snippet
```java
/** Generator label for stream load. */
public class LabelGenerator {
    private String labelPrefix;
    private boolean enable2PC;

```

### FieldMayBeFinal
Field `dateTimeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java

    @Builder.Default
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;
```

### FieldMayBeFinal
Field `timeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;

    protected Object convert(SeaTunnelDataType dataType, Object val) {
```

### FieldMayBeFinal
Field `dateFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java

public class SeaTunnelRowConverter {
    @Builder.Default private DateUtils.Formatter dateFormatter = DateUtils.Formatter.YYYY_MM_DD;

    @Builder.Default
```

### FieldMayBeFinal
Field `rowkeyColumnIndexes` may be 'final'
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/sink/HbaseSink.java`
#### Snippet
```java
    private HbaseParameters hbaseParameters;

    private List<Integer> rowkeyColumnIndexes = new ArrayList<>();

    private int versionColumnIndex = -1;
```

### FieldMayBeFinal
Field `stringBuffer` may be 'final'
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
    private final SeaTunnelRowType seaTunnelRowType;
    private EmailSinkConfig config;
    private StringBuffer stringBuffer;

    public EmailSinkWriter(SeaTunnelRowType seaTunnelRowType, Config pluginConfig) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java

    private final SeaTunnelRowType seaTunnelRowType;
    private EmailSinkConfig config;
    private StringBuffer stringBuffer;

```

### FieldMayBeFinal
Field `mode` may be 'final'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/config/StartMode.java`
#### Snippet
```java
    SPECIFIC_OFFSETS("specific_offsets");

    private String mode;

    StartMode(String mode) {
```

### FieldMayBeFinal
Field `seaTunnelRowType` may be 'final'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
    private String transactionPrefix;
    private long lastCheckpointId = 0;
    private SeaTunnelRowType seaTunnelRowType;

    private final KafkaProduceSender<byte[], byte[]> kafkaProducerSender;
```

### FieldMayBeFinal
Field `pendingSplit` may be 'final'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
    private AdminClient adminClient;

    private Map<TopicPartition, KafkaSourceSplit> pendingSplit;
    private final Map<TopicPartition, KafkaSourceSplit> assignedSplit;
    private ScheduledExecutorService executor;
```

### FieldMayBeFinal
Field `committables` may be 'final'
in `seatunnel-connectors-v2/connector-paimon/src/main/java/org/apache/seatunnel/connectors/seatunnel/paimon/sink/PaimonSinkWriter.java`
#### Snippet
```java
    private long checkpointId = 0;

    private List<CommitMessage> committables = new ArrayList<>();

    private final Table table;
```

### FieldMayBeFinal
Field `table` may be 'final'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/config/CommonConfig.java`
#### Snippet
```java
    private String warehouse;
    private String namespace;
    private String table;
    private boolean caseSensitive;

```

### FieldMayBeFinal
Field `warehouse` may be 'final'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/config/CommonConfig.java`
#### Snippet
```java
    private IcebergCatalogType catalogType;
    private String uri;
    private String warehouse;
    private String namespace;
    private String table;
```

### FieldMayBeFinal
Field `catalogType` may be 'final'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/config/CommonConfig.java`
#### Snippet
```java

    private String catalogName;
    private IcebergCatalogType catalogType;
    private String uri;
    private String warehouse;
```

### FieldMayBeFinal
Field `namespace` may be 'final'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/config/CommonConfig.java`
#### Snippet
```java
    private String uri;
    private String warehouse;
    private String namespace;
    private String table;
    private boolean caseSensitive;
```

### FieldMayBeFinal
Field `catalogName` may be 'final'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/config/CommonConfig.java`
#### Snippet
```java
                    .withDescription(" the iceberg table fields");

    private String catalogName;
    private IcebergCatalogType catalogType;
    private String uri;
```

### FieldMayBeFinal
Field `desc` may be 'final'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/config/TimePrecision.java`
#### Snippet
```java
    M("M", TimeUnit.MINUTES),
    H("H", TimeUnit.HOURS);
    private String desc;
    private TimeUnit precision;

```

### FieldMayBeFinal
Field `precision` may be 'final'
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/config/TimePrecision.java`
#### Snippet
```java
    H("H", TimeUnit.HOURS);
    private String desc;
    private TimeUnit precision;

    TimePrecision(String desc, TimeUnit precision) {
```

### FieldMayBeFinal
Field `url` may be 'final'
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/sink/DingTalkWriter.java`
#### Snippet
```java
    private static class RobotClient implements Serializable {

        private String url;

        private String secret;
```

### FieldMayBeFinal
Field `robotClient` may be 'final'
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/sink/DingTalkWriter.java`
#### Snippet
```java
public class DingTalkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {

    private RobotClient robotClient;

    public DingTalkWriter(String url, String secret) {
```

### FieldMayBeFinal
Field `secret` may be 'final'
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/sink/DingTalkWriter.java`
#### Snippet
```java
        private String url;

        private String secret;

        private DefaultDingTalkClient client;
```

### FieldMayBeFinal
Field `rabbitMQClient` may be 'final'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/sink/RabbitmqSinkWriter.java`
#### Snippet
```java

public class RabbitmqSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {
    private RabbitmqClient rabbitMQClient;
    private final JsonSerializationSchema jsonSerializationSchema;

```

### FieldMayBeFinal
Field `rabbitMQClient` may be 'final'
in `seatunnel-connectors-v2/connector-rabbitmq/src/main/java/org/apache/seatunnel/connectors/seatunnel/rabbitmq/source/RabbitmqSourceReader.java`
#### Snippet
```java

    private final DeserializationSchema<SeaTunnelRow> deserializationSchema;
    private RabbitmqClient rabbitMQClient;
    private DefaultConsumer consumer;
    private final RabbitmqConfig config;
```

### FieldMayBeFinal
Field `query` may be 'final'
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplit.java`
#### Snippet
```java

    /** final query statement */
    private String query;

    @Override
```

### FieldMayBeFinal
Field `splitId` may be 'final'
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplit.java`
#### Snippet
```java
    private static final long serialVersionUID = -1L;

    private String splitId;

    /** final query statement */
```

### FieldMayBeFinal
Field `batchStatement` may be 'final'
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/sink/CassandraSinkWriter.java`
#### Snippet
```java
    private final ColumnDefinitions tableSchema;
    private final CqlSession session;
    private BatchStatement batchStatement;
    private List<BoundStatement> boundStatementList;
    private List<CompletionStage<AsyncResultSet>> completionStages;
```

### FieldMayBeFinal
Field `boundStatementList` may be 'final'
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/sink/CassandraSinkWriter.java`
#### Snippet
```java
    private final CqlSession session;
    private BatchStatement batchStatement;
    private List<BoundStatement> boundStatementList;
    private List<CompletionStage<AsyncResultSet>> completionStages;
    private final PreparedStatement preparedStatement;
```

### FieldMayBeFinal
Field `completionStages` may be 'final'
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/sink/CassandraSinkWriter.java`
#### Snippet
```java
    private BatchStatement batchStatement;
    private List<BoundStatement> boundStatementList;
    private List<CompletionStage<AsyncResultSet>> completionStages;
    private final PreparedStatement preparedStatement;
    private final AtomicInteger counter = new AtomicInteger(0);
```

### FieldMayBeFinal
Field `fieldNames` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksStreamLoadVisitor.java`
#### Snippet
```java
    private static final String RESULT_LABEL_UNKNOWN = "UNKNOWN";

    private List<String> fieldNames;

    public StarRocksStreamLoadVisitor(SinkConfig sinkConfig, List<String> fieldNames) {
```

### FieldMayBeFinal
Field `client` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java
    private static final String DEFAULT_CLUSTER_NAME = "default_cluster";

    private TStarrocksExternalService.Client client;
    private final String ip;
    private final int port;
```

### FieldMayBeFinal
Field `seaTunnelRowType` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
    private RetryUtils.RetryMaterial retryMaterial;
    private SourceConfig sourceConfig;
    private SeaTunnelRowType seaTunnelRowType;
    private final HttpHelper httpHelper = new HttpHelper();

```

### FieldMayBeFinal
Field `sourceConfig` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
public class StarRocksQueryPlanReadClient {
    private RetryUtils.RetryMaterial retryMaterial;
    private SourceConfig sourceConfig;
    private SeaTunnelRowType seaTunnelRowType;
    private final HttpHelper httpHelper = new HttpHelper();
```

### FieldMayBeFinal
Field `retryMaterial` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
@Slf4j
public class StarRocksQueryPlanReadClient {
    private RetryUtils.RetryMaterial retryMaterial;
    private SourceConfig sourceConfig;
    private SeaTunnelRowType seaTunnelRowType;
```

### FieldMayBeFinal
Field `dateFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksBaseSerializer.java`
#### Snippet
```java

public class StarRocksBaseSerializer {
    @Builder.Default private DateUtils.Formatter dateFormatter = DateUtils.Formatter.YYYY_MM_DD;

    @Builder.Default
```

### FieldMayBeFinal
Field `dateTimeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksBaseSerializer.java`
#### Snippet
```java

    @Builder.Default
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;
```

### FieldMayBeFinal
Field `timeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksBaseSerializer.java`
#### Snippet
```java
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;

    protected Object convert(SeaTunnelDataType dataType, Object val) {
```

### FieldMayBeFinal
Field `starRocksQueryPlanReadClient` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
        implements SourceSplitEnumerator<StarRocksSourceSplit, StarRocksSourceState> {
    private SourceConfig sourceConfig;
    private StarRocksQueryPlanReadClient starRocksQueryPlanReadClient;
    private final Map<Integer, List<StarRocksSourceSplit>> pendingSplit;

```

### FieldMayBeFinal
Field `sourceConfig` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
public class StartRocksSourceSplitEnumerator
        implements SourceSplitEnumerator<StarRocksSourceSplit, StarRocksSourceState> {
    private SourceConfig sourceConfig;
    private StarRocksQueryPlanReadClient starRocksQueryPlanReadClient;
    private final Map<Integer, List<StarRocksSourceSplit>> pendingSplit;
```

### FieldMayBeFinal
Field `rootAllocator` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
    private VectorSchemaRoot root;
    private List<FieldVector> fieldVectors;
    private RootAllocator rootAllocator;
    private final DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
```

### FieldMayBeFinal
Field `seaTunnelRowBatch` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
    private int rowCountInOneBatch = 0;
    private int readRowCount = 0;
    private List<SeaTunnelRow> seaTunnelRowBatch = new ArrayList<>();
    private final ArrowStreamReader arrowStreamReader;
    private VectorSchemaRoot root;
```

### FieldMayBeFinal
Field `seaTunnelDataTypes` may be 'final'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
public class StarRocksRowBatchReader {

    private SeaTunnelDataType<?>[] seaTunnelDataTypes;
    private int offsetInRowBatch = 0;
    private int rowCountInOneBatch = 0;
```

### FieldMayBeFinal
Field `rowNum` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceSplit.java`
#### Snippet
```java
public class MaxcomputeSourceSplit implements SourceSplit {
    @Getter private int splitId;
    @Getter private long rowNum;

    public MaxcomputeSourceSplit(int splitId, long rowNum) {
```

### FieldMayBeFinal
Field `splitId` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceSplit.java`
#### Snippet
```java

public class MaxcomputeSourceSplit implements SourceSplit {
    @Getter private int splitId;
    @Getter private long rowNum;

```

### FieldMayBeFinal
Field `assignedSplit` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceState.java`
#### Snippet
```java

public class MaxcomputeSourceState implements Serializable {
    private Set<MaxcomputeSourceSplit> assignedSplit;

    public MaxcomputeSourceState(Set<MaxcomputeSourceSplit> assignedSplit) {
```

### FieldMayBeFinal
Field `seaTunnelRowType` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceReader.java`
#### Snippet
```java
    private Config pluginConfig;
    boolean noMoreSplit;
    private SeaTunnelRowType seaTunnelRowType;

    public MaxcomputeSourceReader(
```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceReader.java`
#### Snippet
```java
    private final SourceReader.Context context;
    private final Set<MaxcomputeSourceSplit> sourceSplits;
    private Config pluginConfig;
    boolean noMoreSplit;
    private SeaTunnelRowType seaTunnelRowType;
```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceSplitEnumerator.java`
#### Snippet
```java
    private final Map<Integer, Set<MaxcomputeSourceSplit>> pendingSplits;
    private Set<MaxcomputeSourceSplit> assignedSplits;
    private Config pluginConfig;

    public MaxcomputeSourceSplitEnumerator(
```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/commit/S3RedshiftSinkAggregatedCommitter.java`
#### Snippet
```java
    private final String executeSql;

    private Config pluginConfig;

    public S3RedshiftSinkAggregatedCommitter(FileSystemUtils fileSystemUtils, Config pluginConfig) {
```

### FieldMayBeFinal
Field `esRestClient` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
    private final SeaTunnelRowSerializer seaTunnelRowSerializer;
    private final List<String> requestEsList;
    private EsRestClient esRestClient;
    private RetryMaterial retryMaterial;
    private static final long DEFAULT_SLEEP_TIME_MS = 200L;
```

### FieldMayBeFinal
Field `retryMaterial` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
    private final List<String> requestEsList;
    private EsRestClient esRestClient;
    private RetryMaterial retryMaterial;
    private static final long DEFAULT_SLEEP_TIME_MS = 200L;

```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    SourceReader.Context context;

    private Config pluginConfig;

    private EsRestClient esRestClient;
```

### FieldMayBeFinal
Field `context` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
        implements SourceSplitEnumerator<ElasticsearchSourceSplit, ElasticsearchSourceState> {

    private SourceSplitEnumerator.Context<ElasticsearchSourceSplit> context;

    private Config pluginConfig;
```

### FieldMayBeFinal
Field `pendingSplit` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
    private final Object stateLock = new Object();

    private Map<Integer, List<ElasticsearchSourceSplit>> pendingSplit;

    private List<String> source;
```

### FieldMayBeFinal
Field `source` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
    private Map<Integer, List<ElasticsearchSourceSplit>> pendingSplit;

    private List<String> source;

    private volatile boolean shouldEnumerate;
```

### FieldMayBeFinal
Field `pluginConfig` may be 'final'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceSplitEnumerator.java`
#### Snippet
```java
    private SourceSplitEnumerator.Context<ElasticsearchSourceSplit> context;

    private Config pluginConfig;

    private EsRestClient esRestClient;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/CopySQLBuilder.java`
#### Snippet
```java
    private final SelectDBConfig selectdbConfig;
    private final List<String> fileList;
    private Properties properties;

    public CopySQLBuilder(SelectDBConfig selectdbConfig, List<String> fileList) {
```

### FieldMayBeFinal
Field `labelPrefix` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/LabelGenerator.java`
#### Snippet
```java
/** Generator label for stream load. */
public class LabelGenerator {
    private String labelPrefix;

    public LabelGenerator(String labelPrefix) {
```

### FieldMayBeFinal
Field `sheetsParameters` may be 'final'
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/source/SheetsSourceReader.java`
#### Snippet
```java
public class SheetsSourceReader extends AbstractSingleSplitReader<SeaTunnelRow> {

    private SheetsParameters sheetsParameters;

    private SeaTunnelRowType seaTunnelRowType;
```

### FieldMayBeFinal
Field `seaTunnelRowType` may be 'final'
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/source/SheetsSourceReader.java`
#### Snippet
```java
    private SheetsParameters sheetsParameters;

    private SeaTunnelRowType seaTunnelRowType;

    private HttpRequestInitializer requestInitializer;
```

### FieldMayBeFinal
Field `dateTimeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java

    @Builder.Default
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;
```

### FieldMayBeFinal
Field `timeFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java
    private DateTimeUtils.Formatter dateTimeFormatter = DateTimeUtils.Formatter.YYYY_MM_DD_HH_MM_SS;

    @Builder.Default private TimeUtils.Formatter timeFormatter = TimeUtils.Formatter.HH_MM_SS;

    protected Object convert(SeaTunnelDataType dataType, Object val) {
```

### FieldMayBeFinal
Field `dateFormatter` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java

public class SeaTunnelRowConverter {
    @Builder.Default private DateUtils.Formatter dateFormatter = DateUtils.Formatter.YYYY_MM_DD;

    @Builder.Default
```

### FieldMayBeFinal
Field `loadExecutorService` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private long currentCheckpointID;
    private AtomicInteger fileNum;
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
    private ArrayBlockingQueue<RecordBuffer> queue;
```

### FieldMayBeFinal
Field `fileNum` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private RecordBuffer buffer;
    private long currentCheckpointID;
    private AtomicInteger fileNum;
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
```

### FieldMayBeFinal
Field `loadAsyncExecutor` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private AtomicInteger fileNum;
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
    private ArrayBlockingQueue<RecordBuffer> queue;
    private final AtomicBoolean started;
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private ArrayBlockingQueue<RecordBuffer> queue;
    private final AtomicBoolean started;
    private AtomicReference<Throwable> exception = new AtomicReference<>(null);
    private HttpClientBuilder httpClientBuilder = HttpClients.custom().disableRedirectHandling();

```

### FieldMayBeFinal
Field `fileList` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final String table;
    private final Properties stageLoadProps;
    private List<String> fileList = new CopyOnWriteArrayList();
    private RecordBuffer buffer;
    private long currentCheckpointID;
```

### FieldMayBeFinal
Field `queue` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
    private ArrayBlockingQueue<RecordBuffer> queue;
    private final AtomicBoolean started;
    private AtomicReference<Throwable> exception = new AtomicReference<>(null);
```

### FieldMayBeFinal
Field `hostPort` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final SelectDBConfig selectdbConfig;
    private String uploadUrl;
    private String hostPort;
    private final String username;
    private final String password;
```

### FieldMayBeFinal
Field `uploadUrl` may be 'final'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java

    private final SelectDBConfig selectdbConfig;
    private String uploadUrl;
    private String hostPort;
    private final String username;
```

### FieldMayBeFinal
Field `collectionReference` may be 'final'
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/sink/FirestoreSinkWriter.java`
#### Snippet
```java
    private Firestore firestore;

    private CollectionReference collectionReference;

    private SeaTunnelRowSerializer serializer;
```

### FieldMayBeFinal
Field `firestore` may be 'final'
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/sink/FirestoreSinkWriter.java`
#### Snippet
```java
public class FirestoreSinkWriter extends AbstractSinkWriter<SeaTunnelRow, Void> {

    private Firestore firestore;

    private CollectionReference collectionReference;
```

### FieldMayBeFinal
Field `serializer` may be 'final'
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/sink/FirestoreSinkWriter.java`
#### Snippet
```java
    private CollectionReference collectionReference;

    private SeaTunnelRowSerializer serializer;

    public FirestoreSinkWriter(SeaTunnelRowType seaTunnelRowType, FirestoreParameters parameters)
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `HttpUtil`
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/committer/SelectDBCommitter.java`
#### Snippet
```java
                SelectDBConfig.loadConfig(pluginConfig),
                SelectDBConfig.loadConfig(pluginConfig).getMaxRetries(),
                new HttpUtil().getHttpClient());
    }

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/Path.java`
#### Snippet
```java

            if (Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.') {
                continue;
            } else {
                return true;
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java
        if (!transactionalId.equals(this.transactionalId)) {
            Object transactionManager = getTransactionManager();
            synchronized (transactionManager) {
                ReflectionUtils.setField(transactionManager, "transactionalId", transactionalId);
                ReflectionUtils.setField(
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `transactionManager`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaInternalProducer.java`
#### Snippet
```java

        Object transactionManager = getTransactionManager();
        synchronized (transactionManager) {
            Object topicPartitionBookkeeper =
                    ReflectionUtils.getField(
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `output` is redundant
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-starter-common/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        FlinkRowConverter transformOutputRowConverter =
                new FlinkRowConverter(transform.getProducedType());
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
```

### UnnecessaryLocalVariable
Local variable `iterator` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-starter-common/src/main/java/org/apache/seatunnel/core/starter/spark/execution/TransformExecuteProcessor.java`
#### Snippet
```java
                        (MapPartitionsFunction<Row, Row>)
                                (Iterator<Row> rowIterator) -> {
                                    TransformIterator iterator =
                                            new TransformIterator(
                                                    rowIterator,
```

### UnnecessaryLocalVariable
Local variable `withOneMoreElement` is redundant
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java

        if (splitAt < 0) {
            Path withOneMoreElement = new Path(s.substring(0, end), tail);
            return withOneMoreElement;
        } else {
```

### UnnecessaryLocalVariable
Local variable `row` is redundant
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/CompatibleDebeziumJsonDeserializationSchema.java`
#### Snippet
```java
        String value = debeziumJsonConverter.serializeValue(record);
        Object[] fields = new Object[] {record.topic(), key, value};
        SeaTunnelRow row = new SeaTunnelRow(fields);
        return row;
    }
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
Local variable `sqlServerOffsetContext` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
#### Snippet
```java
                        : split.asIncrementalSplit().getStartupOffset();

        SqlServerOffsetContext sqlServerOffsetContext = loader.load(offset.getOffset());

        return sqlServerOffsetContext;
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
        // Using default block size since there is no way in FTP client to know of
        // block sizes on server. The assumption could be less than ideal.
        long blockSize = DEFAULT_BLOCK_SIZE;
        long modTime = ftpFile.getTimestamp().getTimeInMillis();
        long accessTime = 0;
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
Local variable `accessToken` is redundant
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/util/AuthorizationUtil.java`
#### Snippet
```java
        // get accessToken by base64 password
        String accountMessage = username + ":" + password;
        String accessToken =
                HttpConfig.BASIC + " " + encodeBase64URLSafeString(accountMessage.getBytes());
        return accessToken;
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
Local variable `channel` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        String keyFile = conf.get(FS_SFTP_KEYFILE, null);

        ChannelSftp channel = connectionPool.connect(host, port, user, pwd, keyFile);

        return channel;
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
Local variable `fos` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            throw new IOException(e);
        }
        FSDataOutputStream fos =
                new FSDataOutputStream(os, statistics) {
                    @Override
```

### UnnecessaryLocalVariable
Local variable `fis` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
        }

        FSDataInputStream fis = new FSDataInputStream(new SFTPInputStream(is, channel, statistics));
        return fis;
    }
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
Local variable `seaTunnelRowType` is redundant
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
            KuduClient kuduClient = kuduClientBuilder.build();
            partitionParameter = initPartitionParameter(kuduClient, tableName);
            SeaTunnelRowType seaTunnelRowType =
                    getSeaTunnelRowType(kuduClient.openTable(tableName).getSchema().getColumns());
            rowTypeInfo = seaTunnelRowType;
```

### UnnecessaryLocalVariable
Local variable `backends` is redundant
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        String response = send(dorisConfig, httpGet, logger);
        logger.info("Backend Info:{}", response);
        List<BackendRow> backends = parseBackend(response, logger);
        return backends;
    }
```

### UnnecessaryLocalVariable
Local variable `backends` is redundant
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
                String response = send(dorisConfig, httpGet, logger);
                logger.info("Backend Info:{}", response);
                List<BackendV2.BackendRowV2> backends = parseBackendV2(response, logger);
                return backends;
            } catch (DorisConnectorException e) {
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
Local variable `tunnel` is redundant
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeUtil.java`
#### Snippet
```java
    public static TableTunnel getTableTunnel(Config pluginConfig) {
        Odps odps = getOdps(pluginConfig);
        TableTunnel tunnel = new TableTunnel(odps);
        return tunnel;
    }
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeUtil.java`
#### Snippet
```java
    public static Table getTable(Config pluginConfig) {
        Odps odps = getOdps(pluginConfig);
        Table table = odps.tables().get(pluginConfig.getString(TABLE_NAME.key()));
        return table;
    }
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
                                endpoint, totalShards, successful));

                ScrollResult scrollResult = getDocsFromScrollResponse(responseJson);
                return scrollResult;
            } else {
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
        param.put("size", scrollSize);
        String endpoint = "/" + index + "/_search?scroll=" + scrollTime;
        ScrollResult scrollResult =
                getDocsFromScrollRequest(endpoint, JsonUtils.toJsonString(param));
        return scrollResult;
```

### UnnecessaryLocalVariable
Local variable `indexDocsCounts` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String entity = EntityUtils.toString(response.getEntity());
                List<IndexDocsCount> indexDocsCounts =
                        JsonUtils.toList(entity, IndexDocsCount.class);
                return indexDocsCounts;
```

### UnnecessaryLocalVariable
Local variable `scrollResult` is redundant
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
        param.put("scroll_id", scrollId);
        param.put("scroll", scrollTime);
        ScrollResult scrollResult =
                getDocsFromScrollRequest("/_search/scroll", JsonUtils.toJsonString(param));
        return scrollResult;
```

### UnnecessaryLocalVariable
Local variable `uploadAddress` is redundant
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
                    if (statusCode == 307) {
                        Header location = execute.getFirstHeader("location");
                        String uploadAddress = location.getValue();
                        return uploadAddress;
                    } else {
```

### UnnecessaryLocalVariable
Local variable `bigDecimal` is redundant
in `seatunnel-connectors-v2/connector-google-firestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/firestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
                return Double.parseDouble(String.valueOf(fieldValue));
            case DECIMAL:
                BigDecimal bigDecimal = (BigDecimal) fieldValue;
                return bigDecimal;
            case STRING:
```

### UnnecessaryLocalVariable
Local variable `catalogTable` is redundant
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/common/AbstractCatalogSupportTransform.java`
#### Snippet
```java
        TableIdentifier tableIdentifier = transformTableIdentifier();
        TableSchema tableSchema = transformTableSchema();
        CatalogTable catalogTable =
                CatalogTable.of(
                        tableIdentifier,
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
                    LOGGER.warning(
                            "This is master node, waiting the coordinator service init finished");
                    Thread.sleep(retryPause);
                    retryCount++;
                } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
                                this.getTaskFullName(), ExceptionUtils.getMessage(e), i));
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
                                taskGroupLocation, sleepTime));
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException ex) {
                    logger.severe(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
        while (null == restoreComplete) {
            log.warn("Task init is not complete, try to get it again after 200 ms");
            Thread.sleep(200);
        }
        restoreComplete.get();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
                while (registerWorker.isEmpty() && isRunning) {
                    log.info("waiting current worker register to resource manager...");
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-common/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
#### Snippet
```java
                && ((StreamingRuntimeContext) getRuntimeContext()).isCheckpointingEnabled()) {
            while (running && prevCheckpointId >= latestCompletedCheckpointId.get()) {
                Thread.sleep(100);
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/CoordinatedBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/CoordinatedBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/batch/ParallelBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java

                        while (!handover.isEmpty()) {
                            Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                        }
                        // Block #next() method
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/batch/CoordinatedBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/batch/CoordinatedBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/batch/ParallelBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java

                        while (!handover.isEmpty()) {
                            Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
                        }
                        // Block #next() method
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(sleepMs * i);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/sink/IoTDBSinkClient.java`
#### Snippet
```java
                                    sinkConfig.getRetryBackoffMultiplierMs() * i,
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
                                    sinkConfig.getRetryBackoffMultiplierMs() * i,
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
                                    sinkConfig.getRetryBackoffMultiplierMs() * i,
                                    sinkConfig.getMaxRetryBackoffMs());
                    Thread.sleep(backoff);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the optionValues must not be null.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)));
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the defaultValue(%s) must be one of the optionValues.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)), o);
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
            throw new OptionValidationException(
                    "These options(%s) are SingleChoiceOption, the value(%s) must be one of the optionValues.",
                    getOptionKeys(Arrays.asList(singleChoiceOption)), value);
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlSourceOptions.java`
#### Snippet
```java
            (SingleChoiceOption)
                    Options.key(SourceOptions.STOP_MODE_KEY)
                            .singleChoice(StopMode.class, Arrays.asList(StopMode.NEVER))
                            .defaultValue(StopMode.NEVER)
                            .withDescription(
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerSourceOptions.java`
#### Snippet
```java
            (SingleChoiceOption)
                    Options.key("stop.mode")
                            .singleChoice(StopMode.class, Arrays.asList(StopMode.NEVER))
                            .defaultValue(StopMode.NEVER)
                            .withDescription(
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        // By default, all partitions are sent randomly
        return DefaultSeaTunnelRowSerializer.create(
                topic, Arrays.asList(), seaTunnelRowType, messageFormat, delimiter);
    }

```

## RuleId[id=UseBulkOperation]
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

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/config/SqlServerSourceConfigFactory.java`
#### Snippet
```java

        if (dbzProperties != null) {
            dbzProperties.forEach(props::put);
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        Properties kafkaProperties = new Properties();
        if (pluginConfig.get(KAFKA_CONFIG) != null) {
            pluginConfig.get(KAFKA_CONFIG).forEach((key, value) -> kafkaProperties.put(key, value));
        }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withRetryListener(com.github.rholder.retry.RetryListener)' is unstable because its signature references unstable interface 'com.github.rholder.retry.RetryListener' marked with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
                                httpParameter.getRetryBackoffMaxMillis(),
                                TimeUnit.MILLISECONDS))
                .withRetryListener(
                        new RetryListener() {
                            @Override
```

### UnstableApiUsage
Overridden method 'onRetry(com.github.rholder.retry.Attempt)' is declared in unstable interface 'com.github.rholder.retry.RetryListener' marked with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
                        new RetryListener() {
                            @Override
                            public <V> void onRetry(Attempt<V> attempt) {
                                if (attempt.hasException()) {
                                    log.warn(
```

### UnstableApiUsage
'com.github.rholder.retry.RetryListener' is marked unstable with @Beta
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
                                TimeUnit.MILLISECONDS))
                .withRetryListener(
                        new RetryListener() {
                            @Override
                            public <V> void onRetry(Attempt<V> attempt) {
```

### UnstableApiUsage
'init(io.sentry.@org.jetbrains.annotations.NotNull SentryOptions)' is marked unstable with @ApiStatus.Internal
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/sink/SentrySinkWriter.java`
#### Snippet
```java
                    pluginConfig.getBoolean(SentryConfig.ENABLE_EXTERNAL_CONFIGURATION.key()));
        }
        Sentry.init(options);
    }

```

