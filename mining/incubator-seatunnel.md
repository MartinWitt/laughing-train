# incubator-seatunnel 
 
# Bad smells
I found 2122 bad smells with 311 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 269 | false |
| BoundedWildcard | 241 | false |
| UtilityClassWithoutPrivateConstructor | 126 | true |
| ZeroLengthArrayInitialization | 92 | false |
| UnnecessaryFullyQualifiedName | 80 | false |
| AssignmentToMethodParameter | 79 | false |
| RedundantFieldInitialization | 75 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 57 | false |
| SizeReplaceableByIsEmpty | 45 | true |
| ConstantValue | 42 | false |
| NullableProblems | 39 | false |
| SynchronizeOnThis | 38 | false |
| CollectionContainsUrl | 38 | false |
| OptionalUsedAsFieldOrParameterType | 38 | false |
| NonProtectedConstructorInAbstractClass | 38 | true |
| UnnecessaryLocalVariable | 38 | true |
| SuspiciousToArrayCall | 36 | false |
| NonSerializableFieldInSerializableClass | 34 | false |
| DynamicRegexReplaceableByCompiledPattern | 33 | false |
| RedundantMethodOverride | 31 | false |
| EmptyMethod | 30 | false |
| DataFlowIssue | 30 | false |
| PublicFieldAccessedInSynchronizedContext | 29 | false |
| BusyWait | 29 | false |
| UnusedAssignment | 27 | false |
| Convert2Lambda | 27 | false |
| CodeBlock2Expr | 26 | true |
| UseOfPropertiesAsHashtable | 25 | false |
| RedundantSuppression | 22 | false |
| Convert2MethodRef | 19 | false |
| ProtectedMemberInFinalClass | 18 | true |
| RedundantClassCall | 17 | false |
| OptionalGetWithoutIsPresent | 16 | false |
| AssignmentToForLoopParameter | 16 | false |
| Anonymous2MethodRef | 15 | false |
| IgnoreResultOfCall | 14 | false |
| NestedAssignment | 14 | false |
| MismatchedCollectionQueryUpdate | 13 | false |
| RedundantImplements | 13 | false |
| UnnecessarySemicolon | 12 | false |
| TrivialStringConcatenation | 11 | false |
| SystemOutErr | 10 | false |
| DeprecatedIsStillUsed | 10 | false |
| UnnecessaryModifier | 9 | true |
| RegExpRedundantEscape | 9 | false |
| SimplifyStreamApiCallChains | 9 | false |
| StringBufferReplaceableByString | 9 | false |
| AbstractMethodCallInConstructor | 9 | false |
| ReplaceAssignmentWithOperatorAssignment | 8 | false |
| ToArrayCallWithZeroLengthArrayArgument | 7 | true |
| MalformedFormatString | 7 | false |
| OptionalIsPresent | 6 | false |
| DuplicateBranchesInSwitch | 5 | false |
| StringEqualsEmptyString | 5 | false |
| UnstableApiUsage | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| NonFinalFieldOfException | 4 | false |
| NonExceptionNameEndsWithException | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| FieldMayBeStatic | 4 | false |
| NestedSynchronizedStatement | 4 | false |
| MagicConstant | 3 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| UnnecessaryQualifierForThis | 3 | false |
| DoubleBraceInitialization | 3 | false |
| ImplicitArrayToString | 3 | false |
| AssignmentToLambdaParameter | 3 | false |
| StaticCallOnSubclass | 3 | false |
| NonShortCircuitBoolean | 3 | false |
| MissortedModifiers | 3 | false |
| ThrowFromFinallyBlock | 3 | false |
| BoxingBoxedValue | 3 | false |
| RedundantComparatorComparing | 3 | false |
| UnnecessaryBoxing | 3 | false |
| DoubleCheckedLocking | 2 | false |
| NumberEquality | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| UtilityClassWithPublicConstructor | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| UseBulkOperation | 2 | false |
| StringEquality | 2 | false |
| LoopStatementsThatDontLoop | 2 | false |
| EmptyTryBlock | 2 | false |
| ObsoleteCollection | 2 | false |
| UnnecessaryReturn | 2 | true |
| Lombok | 2 | false |
| IOResource | 2 | false |
| CatchMayIgnoreException | 2 | false |
| SetReplaceableByEnumSet | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| WhileCanBeForeach | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| CommentedOutCode | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| EqualsAndHashcode | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| ConfusingOctalEscape | 1 | false |
| SillyAssignment | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| FuseStreamOperations | 1 | false |
| Java8MapForEach | 1 | false |
| ComparatorCombinators | 1 | false |
| RedundantCollectionOperation | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
| Java8MapApi | 1 | false |
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
    public Set<Object> loadAllKeys();

    public void destroy(boolean deleteAllFileFlag);
}

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
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-api/src/main/java/org/apache/seatunnel/engine/imap/storage/api/IMapStorage.java`
#### Snippet
```java
    public Set<Object> deleteAll(Collection<Object> keys);

    public Map<Object, Object> loadAll() throws IOException;

    public Set<Object> loadAllKeys();
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
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
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
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        int subexpression = subexpressionArg != null ? subexpressionArg : 0;
        int flags = makeRegexpFlags(regexpMode, false);
        Matcher m = Pattern.compile(regexp, flags).matcher(input);

        boolean found = m.find(position);
```

### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        }
        int flags = makeRegexpFlags(regexpMode, false);
        return Pattern.compile(regexp, flags).matcher(input).find();
    }

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

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/com/aliyun/odps/type/SimpleStructTypeInfo.java`
#### Snippet
```java
        Iterator var3 = names.iterator();

        while (var3.hasNext()) {
            String name = (String) var3.next();
            lowerNames.add(name.toLowerCase());
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `ownedSlotProfilesIMap.keySet()` may be replaced with 'values()' iteration
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java

    public Address queryTaskGroupAddress(long taskGroupId) {
        for (PipelineLocation pipelineLocation : ownedSlotProfilesIMap.keySet()) {
            Optional<TaskGroupLocation> currentVertex =
                    ownedSlotProfilesIMap.get(pipelineLocation).keySet().stream()
```

### KeySetIterationMayUseEntrySet
Iteration over `columnInTemplate.keySet()` may be replaced with 'entrySet()' iteration
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/sink/StarRocksSaveModeUtil.java`
#### Snippet
```java
                tableSchema.getColumns().stream()
                        .collect(Collectors.toMap(Column::getName, Function.identity()));
        for (String col : columnInTemplate.keySet()) {
            CreateTableParser.ColumnInfo columnInfo = columnInTemplate.get(col);
            if (StringUtils.isEmpty(columnInfo.getInfo())) {
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/CopyFieldTransform.java`
#### Snippet
```java
                Map map = (Map) value;
                Map newMap = new HashMap();
                for (Object key : map.keySet()) {
                    newMap.put(
                            clone(mapType.getKeyType(), key),
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `StreamWriter` on 'super' is unnecessary in this context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java
    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }

```

### UnnecessaryQualifierForThis
Qualifier `StreamWriter` on 'super' is unnecessary in this context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java
    @Override
    public void onDataWriterCommit(WriterCommitMessage message) {
        StreamWriter.super.onDataWriterCommit(message);
    }
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`schemaMap.size() > 0` can be replaced with '!schemaMap.isEmpty()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/CatalogTableUtil.java`
#### Snippet
```java
        // Highest priority: specified schema
        Map<String, String> schemaMap = readonlyConfig.get(CatalogTableUtil.SCHEMA);
        if (schemaMap != null && schemaMap.size() > 0) {
            CatalogTable catalogTable = CatalogTableUtil.buildWithConfig(config).getCatalogTable();
            return Collections.singletonList(catalogTable);
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
`absentOptions.size() == 0` can be replaced with 'absentOptions.isEmpty()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigValidator.java`
#### Snippet
```java
        List<Option<?>> absentOptions =
                getAbsentOptions(conditionalRequiredOptions.getRequiredOption());
        if (absentOptions.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`expectValues.size() == 0` can be replaced with 'expectValues.isEmpty()'
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionRule.java`
#### Snippet
```java
            verifyConditionalExists(conditionalOption);

            if (expectValues.size() == 0) {
                throw new OptionValidationException(
                        String.format(
```

### SizeReplaceableByIsEmpty
`sortedParameters.size() > 0` can be replaced with '!sortedParameters.isEmpty()'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/UsageFormatter.java`
#### Snippet
```java
            String indent,
            List<ParameterDescription> sortedParameters) {
        if (sortedParameters.size() > 0) {
            out.append(indent).append("  Options:\n");
        }
```

### SizeReplaceableByIsEmpty
`description.length() == 0` can be replaced with 'description.isEmpty()'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/UsageFormatter.java`
#### Snippet
```java
                                + parameter.getAssignment()
                                + "value)";
                description += (description.length() == 0 ? "" : " ") + syntax;
            }
            Class<?> type = pd.getParameterized().getType();
```

### SizeReplaceableByIsEmpty
`description.length() == 0` can be replaced with 'description.isEmpty()'
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/UsageFormatter.java`
#### Snippet
```java
                String defaultText =
                        "(default: " + (parameter.password() ? "********" : displayedDef) + ")";
                description += (description.length() == 0 ? "" : " ") + defaultText;
            }
            wrapDescription(
```

### SizeReplaceableByIsEmpty
`pipeline.size() == 0` can be replaced with 'pipeline.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
                recreateVertex(
                        currentVertex,
                        pipeline.size() == 0
                                ? currentVertex.getParallelism()
                                : pipeline.get(pipeline.size() - 1).getParallelism()));
```

### SizeReplaceableByIsEmpty
`targetVertices.size() == 0` can be replaced with 'targetVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
                                : pipeline.get(pipeline.size() - 1).getParallelism()));
        List<ExecutionVertex> targetVertices = targetVerticesMap.get(currentVertex.getVertexId());
        if (targetVertices == null || targetVertices.size() == 0) {
            pipelines.add(createExecutionEdges(pipeline));
            return;
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
`taskQueue.size() > 0` can be replaced with '!taskQueue.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

        public boolean runNewBusWork(boolean checkTaskQueue) {
            if (!checkTaskQueue || taskQueue.size() > 0) {
                BlockingQueue<Future<?>> futureBlockingQueue = new LinkedBlockingQueue<>();
                CooperativeTaskWorker cooperativeTaskWorker =
```

### SizeReplaceableByIsEmpty
`shuffleQueue.size() == 0` can be replaced with 'shuffleQueue.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSourceFlowLifeCycle.java`
#### Snippet
```java
        for (int i = 0; i < shuffles.length; i++) {
            IQueue<Record<?>> shuffleQueue = shuffles[i];
            if (shuffleQueue.size() == 0) {
                emptyShuffleQueueCount++;
                continue;
```

### SizeReplaceableByIsEmpty
`logicalPlan.getEdges().size() > 0` can be replaced with '!logicalPlan.getEdges().isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            @NonNull CheckpointConfig checkpointConfig) {
        checkArgument(
                logicalPlan.getEdges().size() > 0, "ExecutionPlan Builder must have LogicalPlan.");
        this.logicalPlan = logicalPlan;
        this.jobImmutableInformation = jobImmutableInformation;
```

### SizeReplaceableByIsEmpty
`transformChainedVertices.size() > 0` can be replaced with '!transformChainedVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
                inputVerticesMap,
                targetVerticesMap);
        if (transformChainedVertices.size() > 0) {
            long newVertexId = idGenerator.getNextId();
            List<SeaTunnelTransform> transforms = new ArrayList<>(transformChainedVertices.size());
```

### SizeReplaceableByIsEmpty
`chainedVertices.size() == 0` can be replaced with 'chainedVertices.isEmpty()'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
        // Currently only support Transform action chaining.
        if (action instanceof TransformAction) {
            if (chainedVertices.size() == 0) {
                chainedVertices.add(currentVertex);
            } else if (inputVerticesMap.get(currentVertex.getVertexId()).size() == 1) {
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
`restoredSplitState.size() > 0` can be replaced with '!restoredSplitState.isEmpty()'
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/ParallelSource.java`
#### Snippet
```java
                        1, String.format("parallel-split-enumerator-executor-%s", subtaskId));
        splitEnumerator.open();
        if (restoredSplitState.size() > 0) {
            splitEnumerator.addSplitsBack(restoredSplitState, subtaskId);
        }
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
            MapType<?, ?> mapType,
            BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
        }
```

### SizeReplaceableByIsEmpty
`mapData.size() == 0` can be replaced with 'mapData.isEmpty()'
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
            MapType<?, ?> mapType,
            BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
        }
```

### SizeReplaceableByIsEmpty
`mapData.size() == 0` can be replaced with 'mapData.isEmpty()'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java

    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
```

### SizeReplaceableByIsEmpty
`mapData.size() == 0` can be replaced with 'mapData.isEmpty()'
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java

    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
```

### SizeReplaceableByIsEmpty
`catalog.length() == 0` can be replaced with 'catalog.isEmpty()'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java

    private static String tableId(String catalog, String schema, String table) {
        if (catalog == null || catalog.length() == 0) {
            if (schema == null || schema.length() == 0) {
                return table;
```

### SizeReplaceableByIsEmpty
`schema.length() == 0` can be replaced with 'schema.isEmpty()'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
    private static String tableId(String catalog, String schema, String table) {
        if (catalog == null || catalog.length() == 0) {
            if (schema == null || schema.length() == 0) {
                return table;
            }
```

### SizeReplaceableByIsEmpty
`schema.length() == 0` can be replaced with 'schema.isEmpty()'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
            return schema + "." + table;
        }
        if (schema == null || schema.length() == 0) {
            return catalog + "." + table;
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
        ChannelSftp channel;

        if (cons != null && cons.size() > 0) {
            Iterator<ChannelSftp> it = cons.iterator();
            if (it.hasNext()) {
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
`diffSelf.size() == 0` can be replaced with 'diffSelf.isEmpty()'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/PartitionDefinition.java`
#### Snippet
```java
        diffSelf.removeAll(similar);
        diffOther.removeAll(similar);
        if (diffSelf.size() == 0) {
            return 0;
        }
```

### SizeReplaceableByIsEmpty
`readQueue.size() == 0` can be replaced with 'readQueue.isEmpty()'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/RecordBuffer.java`
#### Snippet
```java
                readQueue.size(),
                writeQueue.size());
        checkState(readQueue.size() == 0);
        checkState(writeQueue.size() == queueSize);
        for (ByteBuffer byteBuffer : writeQueue) {
```

### SizeReplaceableByIsEmpty
`readQueue.size() == 0` can be replaced with 'readQueue.isEmpty()'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/RecordBuffer.java`
#### Snippet
```java
            recycleBuffer(currentReadBuffer);
            currentReadBuffer = null;
            checkState(readQueue.size() == 0);
            return -1;
        }
```

### SizeReplaceableByIsEmpty
`state.size() != 0` can be replaced with '!state.isEmpty()'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisSinkWriter.java`
#### Snippet
```java
            Config pluginConfig) {
        this.dorisConfig = DorisConfig.loadConfig(pluginConfig);
        this.lastCheckpointId = state.size() != 0 ? state.get(0).getCheckpointId() : 0;
        log.info("restore checkpointId {}", lastCheckpointId);
        log.info("labelPrefix " + dorisConfig.getLabelPrefix());
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
`diffSelf.size() == 0` can be replaced with 'diffSelf.isEmpty()'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/model/QueryPartition.java`
#### Snippet
```java
        diffSelf.removeAll(similar);
        diffOther.removeAll(similar);
        if (diffSelf.size() == 0) {
            return 0;
        }
```

### SizeReplaceableByIsEmpty
`fieldVectors.size() == 0` can be replaced with 'fieldVectors.isEmpty()'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
                            "schema size of fetch data is wrong.");
                }
                if (fieldVectors.size() == 0 || root.getRowCount() == 0) {
                    log.debug("one batch in arrow has no data.");
                    continue;
```

### SizeReplaceableByIsEmpty
`requestEsList.size() > 0` can be replaced with '!requestEsList.isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
            RetryUtils.retryWithException(
                    () -> {
                        if (requestEsList.size() > 0) {
                            String requestBody = String.join("\n", requestEsList) + "\n";
                            BulkResponse bulkResponse = esRestClient.bulk(requestBody);
```

### SizeReplaceableByIsEmpty
`fieldNames.size() > 0` can be replaced with '!fieldNames.isEmpty()'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
            String index, SeaTunnelRowType seaTunnelRowType) {
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
                                sourceIndexInfo.getScrollSize());
                outputFromScrollResult(scrollResult, sourceIndexInfo.getSource(), output);
                while (scrollResult.getDocs() != null && scrollResult.getDocs().size() > 0) {
                    scrollResult =
                            esRestClient.searchWithScrollId(
```

### SizeReplaceableByIsEmpty
`state.size() != 0` can be replaced with '!state.isEmpty()'
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBSinkWriter.java`
#### Snippet
```java
            Config pluginConfig) {
        this.selectdbConfig = SelectDBConfig.loadConfig(pluginConfig);
        this.lastCheckpointId = state.size() != 0 ? state.get(0).getCheckpointId() : 0;
        log.info("restore checkpointId {}", lastCheckpointId);
        // filename prefix is uuid
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataSourceWriter.java`
#### Snippet
```java
    protected final SeaTunnelSink<SeaTunnelRow, StateT, CommitInfoT, AggregatedCommitInfoT> sink;

    @Nullable protected final SinkAggregatedCommitter<CommitInfoT, AggregatedCommitInfoT>
            sinkAggregatedCommitter;

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
@RequiredArgsConstructor
public class BufferedBatchStatementExecutor implements JdbcBatchStatementExecutor<SeaTunnelRow> {
    @NonNull private final JdbcBatchStatementExecutor<SeaTunnelRow> statementExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;
    @NonNull private final List<SeaTunnelRow> buffer = new ArrayList<>();
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
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> valueTransform;

    @NonNull private final LinkedHashMap<SeaTunnelRow, Pair<Boolean, SeaTunnelRow>> buffer =
            new LinkedHashMap<>();

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
public class JdbcOutputFormatBuilder {
    @NonNull private final JdbcDialect dialect;
    @NonNull private final JdbcConnectionProvider connectionProvider;
    @NonNull private final JdbcSinkConfig jdbcSinkConfig;
    @NonNull private final SeaTunnelRowType seaTunnelRowType;
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
@RequiredArgsConstructor
public class ReduceBufferedBatchStatementExecutor implements JdbcBatchStatementExecutor {
    @NonNull private final JdbcBatchStatementExecutor insertOrUpdateExecutor;
    @NonNull private final JdbcBatchStatementExecutor deleteExecutor;
    @NonNull private final Function<SeaTunnelRow, SeaTunnelRow> keyExtractor;
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
Result of `DataInputStream.read()` is ignored
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkWriterStateSerializer.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/CommitWrapperSerializer.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkWriterStateSerializer.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/CommitWrapperSerializer.java`
#### Snippet
```java
            final int size = in.readInt();
            final byte[] stateBytes = new byte[size];
            in.read(stateBytes);
            T commitT = serializer.deserialize(stateBytes);
            return new CommitWrapper<>(commitT);
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `NodeExtension` is the same as one of its superclass' names
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtension.java`
#### Snippet
```java
import static com.hazelcast.internal.ascii.TextCommandConstants.TextCommandType.HTTP_POST;

public class NodeExtension extends DefaultNodeExtension {
    private final NodeExtensionCommon extCommon;

```

## RuleId[id=RedundantMethodOverride]
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
Method `useCommitCoordinator()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }
```

### RedundantMethodOverride
Method `onDataWriterCommit()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public void onDataWriterCommit(WriterCommitMessage message) {
        StreamWriter.super.onDataWriterCommit(message);
    }
```

### RedundantMethodOverride
Method `createWriterFactory()` only delegates to its super method
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public DataWriterFactory<InternalRow> createWriterFactory() {
        return super.createWriterFactory();
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
    public void notifyCheckpointComplete(long checkpointId) throws Exception {}
}

```

### RedundantMethodOverride
Method `notifyCheckpointAborted()` only delegates to its super method
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void notifyCheckpointAborted(long checkpointId) throws Exception {
        SourceSplitEnumerator.super.notifyCheckpointAborted(checkpointId);
    }
```

### RedundantMethodOverride
Method `handleSourceEvent()` only delegates to its super method
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void handleSourceEvent(int subtaskId, SourceEvent sourceEvent) {
        SourceSplitEnumerator.super.handleSourceEvent(subtaskId, sourceEvent);
    }
```

### RedundantMethodOverride
Method `restoreWriter()` only delegates to its super method
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java

    @Override
    public SinkWriter<SeaTunnelRow, CKCommitInfo, ClickhouseSinkState> restoreWriter(
            SinkWriter.Context context, List<ClickhouseSinkState> states) throws IOException {
        return SeaTunnelSink.super.restoreWriter(context, states);
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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`storageNameSpace = storageNameSpace + DEFAULT_CHECKPOINT_FILE_PATH_SPLIT` could be simplified to 'storageNameSpace += DEFAULT_CHECKPOINT_FILE_PATH_SPLIT'
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/AbstractCheckpointStorage.java`
#### Snippet
```java
        if (storageNameSpace != null) {
            if (!storageNameSpace.endsWith(DEFAULT_CHECKPOINT_FILE_PATH_SPLIT)) {
                storageNameSpace = storageNameSpace + DEFAULT_CHECKPOINT_FILE_PATH_SPLIT;
            }
            this.storageNameSpace = storageNameSpace;
```

### ReplaceAssignmentWithOperatorAssignment
`created = created & succeeded` could be simplified to 'created \&= succeeded'
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
```

### ReplaceAssignmentWithOperatorAssignment
`first = first + tabletsSize` could be simplified to 'first += tabletsSize'
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
                                                        beInfo.getValue().size(),
                                                        first + tabletsSize)));
                first = first + tabletsSize;
                PartitionDefinition partitionDefinition =
                        new PartitionDefinition(
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
`index = index + 1` could be simplified to 'index += 1'
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/source/OpenMldbSourceReader.java`
#### Snippet
```java
    private Object getObject(ResultSet resultSet, int index, SeaTunnelDataType<?> dataType)
            throws SQLException {
        index = index + 1;
        switch (dataType.getSqlType()) {
            case BOOLEAN:
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

### ReplaceAssignmentWithOperatorAssignment
`first = first + tabletsSize` could be simplified to 'first += tabletsSize'
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksQueryPlanReadClient.java`
#### Snippet
```java
                                                        beInfo.getValue().size(),
                                                        first + tabletsSize)));
                first = first + tabletsSize;
                QueryPartition partitionDefinition =
                        new QueryPartition(
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/RawJobMetrics.java`
#### Snippet
```java

        RawJobMetrics that;
        return Arrays.equals(blob, (that = (RawJobMetrics) obj).blob)
                && this.timestamp == that.timestamp;
    }
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/Measurement.java`
#### Snippet
```java
        return this == obj
                || obj instanceof Measurement
                        && this.timestamp == (that = (Measurement) obj).timestamp
                        && this.value == that.value
                        && Objects.equals(this.tags, that.tags);
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/CompressionUtils.java`
#### Snippet
```java
                                new ArchiveStreamFactory().createArchiveInputStream("tar", is)) {
            TarArchiveEntry entry = null;
            while ((entry = (TarArchiveEntry) debInputStream.getNextEntry()) != null) {
                final File outputFile = new File(outputDir, entry.getName());
                if (!outputFile.toPath().normalize().startsWith(outputDir.toPath())) {
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
                                    connection.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
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
                while (buffer.length() >= this.delimiter.length()
                        && (delimPos = buffer.indexOf(this.delimiter)) != -1) {
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

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                log.error(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceReader.java`
#### Snippet
```java
                        log.info("open record reader success");
                        Record record;
                        while ((record = recordReader.read()) != null) {
                            SeaTunnelRow seaTunnelRow =
                                    MaxcomputeTypeMapper.getSeaTunnelRowData(
```

### NestedAssignment
Result of assignment expression used
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
                    } else if (newDigit <= '6') {
                        if (newDigit != lastDigit) {
                            chars[j++] = lastDigit = newDigit;
                        }
                    } else if (newDigit == '7') {
```

## RuleId[id=ReturnFromFinallyBlock]
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
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelTransformPluginDiscovery transformPluginDiscovery =
                new SeaTunnelTransformPluginDiscovery();
        List<URL> pluginJars = new ArrayList<>();
        List<SeaTunnelTransform> transforms =
                pluginConfigs.stream()
```

### MismatchedCollectionQueryUpdate
Contents of collection `pluginJars` are queried, but never updated
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelTransformPluginDiscovery transformPluginDiscovery =
                new SeaTunnelTransformPluginDiscovery();
        List<URL> pluginJars = new ArrayList<>();
        List<SeaTunnelTransform> transforms =
                pluginConfigs.stream()
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
        private final Map<ActionStateKey, Integer> pipelineActions = new HashMap<>();

        private final Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions =
                new HashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java

    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new HashMap<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `startingSubtasks` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
    public static final class Builder {
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new HashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `pipelineActions` are updated, but never queried
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        private final Set<TaskLocation> pipelineSubtasks = new HashSet<>();
        private final Set<TaskLocation> startingSubtasks = new HashSet<>();
        private final Map<ActionStateKey, Integer> pipelineActions = new HashMap<>();

        private final Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions =
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `error` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/Handover.java`
#### Snippet
```java
    private final LinkedBlockingQueue<T> blockingQueue =
            new LinkedBlockingQueue<>(DEFAULT_QUEUE_SIZE);
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
    private final long jobId;

    private JobMaster jobMaster;

    /** Whether we make the job end when pipeline turn to end state. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pipelineFuture` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
     * waitForCompleteBySubPlan in {@link PhysicalPlan } whenComplete method will be called.
     */
    private CompletableFuture<PipelineExecutionState> pipelineFuture;

    private final PipelineLocation pipelineLocation;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pipelineRestoreNum` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    private PassiveCompletableFuture<Void> reSchedulerPipelineFuture;

    private Integer pipelineRestoreNum;

    private final Object restoreLock = new Object();
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
Field `shuffleBufferSize` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSinkFlowLifeCycle.java`
#### Snippet
```java
    private final Map<String, Queue<Record<?>>> shuffleBuffer;
    private final ShuffleStrategy shuffleStrategy;
    private int shuffleBufferSize;
    private long lastModify;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastModify` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSinkFlowLifeCycle.java`
#### Snippet
```java
    private final ShuffleStrategy shuffleStrategy;
    private int shuffleBufferSize;
    private long lastModify;

    public ShuffleSinkFlowLifeCycle(
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
Field `enumerator` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java

    private final SourceAction<?, SplitT, Serializable> source;
    private SourceSplitEnumerator<SplitT, Serializable> enumerator;
    private SeaTunnelSplitEnumeratorContext<SplitT> enumeratorContext;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `enumeratorStateSerializer` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    private SeaTunnelSplitEnumeratorContext<SplitT> enumeratorContext;

    private Serializer<Serializable> enumeratorStateSerializer;

    private int maxReaderSize;
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
Field `splitSerializer` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
    private SourceReader<T, SplitT> reader;

    private transient Serializer<SplitT> splitSerializer;

    private final int indexID;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `collector` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/SourceFlowLifeCycle.java`
#### Snippet
```java
    private final TaskLocation currentTaskLocation;

    private SeaTunnelSourceCollector<T> collector;

    private final MetricsContext metricsContext;
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
Field `contexts` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private final IdGenerator idGenerator;
    private final TaskExecutionService taskExecutionService;
    private ConcurrentMap<Integer, SlotContext> contexts;
    private String slotServiceSequence;

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
Field `assignedSlots` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private AtomicReference<ResourceProfile> assignedResource;

    private ConcurrentMap<Integer, SlotProfile> assignedSlots;

    private ConcurrentMap<Integer, SlotProfile> unassignedSlots;
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
Field `assignedResource` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private AtomicReference<ResourceProfile> unassignedResource;

    private AtomicReference<ResourceProfile> assignedResource;

    private ConcurrentMap<Integer, SlotProfile> assignedSlots;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `slotServiceSequence` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/service/slot/DefaultSlotService.java`
#### Snippet
```java
    private final TaskExecutionService taskExecutionService;
    private ConcurrentMap<Integer, SlotContext> contexts;
    private String slotServiceSequence;

    public DefaultSlotService(
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
Field `taskTracker` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/TaskCallTimer.java`
#### Snippet
```java
    TaskExecutionService.RunBusWorkSupplier runBusWorkSupplier;

    TaskTracker taskTracker;

    private final Object lock = new Object();
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
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java

    private int tolerableFailureCheckpoints;
    private transient ScheduledExecutorService scheduler;

    private final AtomicLong latestTriggerTimestamp = new AtomicLong(0);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `HDFS_STORAGE` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/common/HdfsFileStorageInstance.java`
#### Snippet
```java
    }

    private static HdfsStorage HDFS_STORAGE;
    private static final Object LOCK = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `keyConverterMethod` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
    private transient JsonConverter keyConverter;
    private transient JsonConverter valueConverter;
    private transient Method keyConverterMethod;
    private transient Method valueConverterMethod;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `keyConverter` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
    private final boolean keySchemaEnable;
    private final boolean valueSchemaEnable;
    private transient JsonConverter keyConverter;
    private transient JsonConverter valueConverter;
    private transient Method keyConverterMethod;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `valueConverterMethod` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
    private transient JsonConverter valueConverter;
    private transient Method keyConverterMethod;
    private transient Method valueConverterMethod;

    public String serializeKey(SourceRecord record)
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `valueConverter` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
    private final boolean valueSchemaEnable;
    private transient JsonConverter keyConverter;
    private transient JsonConverter valueConverter;
    private transient Method keyConverterMethod;
    private transient Method valueConverterMethod;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPInputStream.java`
#### Snippet
```java
    private FileSystem.Statistics stats;
    private boolean closed;
    private long pos;

    SFTPInputStream(InputStream stream, ChannelSftp channel, FileSystem.Statistics stats) {
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
Field `splits` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
public class JdbcSourceReader implements SourceReader<SeaTunnelRow, JdbcSourceSplit> {
    SourceReader.Context context;
    Deque<JdbcSourceSplit> splits = new ConcurrentLinkedDeque<>();
    JdbcInputFormat inputFormat;
    private volatile boolean noMoreSplit;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `inputFormat` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
    SourceReader.Context context;
    Deque<JdbcSourceSplit> splits = new ConcurrentLinkedDeque<>();
    JdbcInputFormat inputFormat;
    private volatile boolean noMoreSplit;

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
Field `conn` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceReader.java`
#### Snippet
```java
    private final Context context;

    private Connection conn;

    public TDengineSourceReader(TDengineSourceConfig config, SourceReader.Context readerContext) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `proxy` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkAggCommitter.java`
#### Snippet
```java
        implements SinkAggregatedCommitter<CKFileCommitInfo, CKFileAggCommitInfo> {

    private transient ClickhouseProxy proxy;
    private final ClickhouseTable clickhouseTable;

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
Field `esRestClient` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    private Config pluginConfig;

    private EsRestClient esRestClient;

    private final SeaTunnelRowDeserializer deserializer;
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

### FieldAccessedSynchronizedAndUnsynchronized
Field `selectDBStageLoad` is accessed in both synchronized and unsynchronized contexts
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBSinkWriter.java`
#### Snippet
```java
    private final SelectDBConfig selectdbConfig;
    private final long lastCheckpointId;
    private SelectDBStageLoad selectDBStageLoad;
    volatile boolean loading;
    private final String labelPrefix;
```

## RuleId[id=EqualsAndHashcode]
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/AbstractMetricsContext.java`
#### Snippet
```java
            log.warn("Ignoring attempted add of a metric due to being null for name {}.", name);
        } else {
            synchronized (this) {
                Metric prior = this.metrics.put(name, metric);
                if (prior != null) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
    public static FlinkRuntimeEnvironment getInstance(Config config) {
        if (INSTANCE == null) {
            synchronized (FlinkRuntimeEnvironment.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlinkRuntimeEnvironment(config);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
    public static FlinkRuntimeEnvironment getInstance(Config config) {
        if (INSTANCE == null) {
            synchronized (FlinkRuntimeEnvironment.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlinkRuntimeEnvironment(config);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    public static SparkRuntimeEnvironment getInstance(Config config) {
        if (INSTANCE == null) {
            synchronized (SparkRuntimeEnvironment.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SparkRuntimeEnvironment(config);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    public static SparkRuntimeEnvironment getInstance(Config config) {
        if (INSTANCE == null) {
            synchronized (SparkRuntimeEnvironment.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SparkRuntimeEnvironment(config);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelServer.java`
#### Snippet
```java
    public SlotService getSlotService() {
        if (slotService == null) {
            synchronized (this) {
                if (slotService == null) {
                    SlotService service =
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
                    ResourceManager manager =
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    public boolean updateTaskState(
            @NonNull ExecutionState current, @NonNull ExecutionState targetState) {
        synchronized (this) {
            // consistency check
            if (current.isEndState()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    private boolean turnToEndState(@NonNull ExecutionState endState) {
        synchronized (this) {
            if (!endState.isEndState()) {
                String message =
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
        TaskGroupImmutableInformation taskGroupImmutableInformation =
                getTaskGroupImmutableInformation();
        synchronized (this) {
            ExecutionState currentState =
                    (ExecutionState) runningJobStateIMap.get(taskGroupLocation);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    public boolean updatePipelineState(
            @NonNull PipelineStatus current, @NonNull PipelineStatus targetState) {
        synchronized (this) {
            // consistency check
            if (current.isEndState()) {
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                            taskGroup.getTaskGroupLocation(), taskImmutableInfo.getExecutionId()));

            synchronized (this) {
                if (executionContexts.containsKey(taskGroup.getTaskGroupLocation())) {
                    throw new RuntimeException(
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
        JobMetrics jobMetrics = JobMetricsUtil.toJobMetrics(currJobMetrics);
        long jobId = this.getJobImmutableInformation().getJobId();
        synchronized (this) {
            jobHistoryService.storeFinishedPipelineMetrics(jobId, jobMetrics);
        }
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
                    this.executorService =
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
    private void tryInit() {
        if (keyConverter == null) {
            synchronized (this) {
                if (keyConverter == null) {
                    keyConverter = new JsonConverter();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-formats/seatunnel-format-compatible-debezium-json/src/main/java/org/apache/seatunnel/format/compatible/debezium/json/DebeziumJsonConverter.java`
#### Snippet
```java
        }
        if (valueConverter == null) {
            synchronized (this) {
                if (valueConverter == null) {
                    valueConverter = new JsonConverter();
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
                    INSTANCE = new HiveMetaStoreProxy(config);
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
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/sink/SocketClient.java`
#### Snippet
```java
                    e);

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
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/IcebergStreamSplitEnumerator.java`
#### Snippet
```java
    @Override
    public void handleSplitRequest(int subtaskId) {
        synchronized (this) {
            if (pendingSplits.isEmpty() || pendingSplits.get(subtaskId) == null) {
                refreshPendingSplits();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/config/OpenMldbSqlExecutor.java`
#### Snippet
```java
    public static void close() {
        if (SQL_EXECUTOR != null) {
            synchronized (OpenMldbParameters.class) {
                if (SQL_EXECUTOR != null) {
                    SQL_EXECUTOR.close();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/config/OpenMldbSqlExecutor.java`
#### Snippet
```java
    public static SqlClusterExecutor getSqlExecutor() throws SqlException {
        if (SQL_EXECUTOR == null) {
            synchronized (OpenMldbSqlExecutor.class) {
                if (SQL_EXECUTOR == null) {
                    SQL_EXECUTOR = new SqlClusterExecutor(SDK_OPTION);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkAggCommitter.java`
#### Snippet
```java
            return proxy;
        }
        synchronized (this) {
            if (proxy != null) {
                return proxy;
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/RedshiftJdbcClient.java`
#### Snippet
```java
            throws S3RedshiftJdbcConnectorException {
        if (INSTANCE == null) {
            synchronized (RedshiftJdbcClient.class) {
                if (INSTANCE == null) {

```

## RuleId[id=DoubleBraceInitialization]
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

    private static final Map<String, SeaTunnelDataType> MAPPING =
            new HashMap() {
                {
                    put("string", BasicType.STRING_TYPE);
```

### DoubleBraceInitialization
Double brace initialization
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/source/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java

    private final Map<Integer, DateTimeFormatter> dateTimeFormatterMap =
            new HashMap<Integer, DateTimeFormatter>() {
                {
                    put("yyyy-MM-dd HH".length(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH"));
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
#### Snippet
```java
public class FlinkWriterState<StateT> implements Serializable {

    private long checkpointId = 0;

    private StateT state;
```

### UnusedAssignment
Variable `checkpointId` initializer `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
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

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
#### Snippet
```java
                new SeaTunnelSourcePluginDiscovery(ADD_URL_TO_CLASSLOADER);
        List<SeaTunnelSource> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier =
```

### CollectionContainsUrl
Set `paths` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        if (config.hasPath(path)) {
            Set<URL> paths =
                    Arrays.stream(config.getString(path).split(";"))
                            .map(
```

### CollectionContainsUrl
Set `paths` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        if (config.hasPath(path)) {
            Set<URL> paths =
                    Arrays.stream(config.getString(path).split(";"))
                            .map(
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SourceExecuteProcessor.java`
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
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SourceExecuteProcessor.java`
#### Snippet
```java
        SeaTunnelSourcePluginDiscovery sourcePluginDiscovery = new SeaTunnelSourcePluginDiscovery();
        List<SeaTunnelSource<?, ?, ?>> sources = new ArrayList<>();
        Set<URL> jars = new HashSet<>();
        for (Config sourceConfig : pluginConfigs) {
            PluginIdentifier pluginIdentifier =
```

### CollectionContainsUrl
Set `jars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SourceExecuteProcessor.java`
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
Set `pluginJars` may contain URL objects
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
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
            @NonNull Set<URL> jarUrls) {
        this(id, name, upstreams, jarUrls, null);
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
Set `jarUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/job/JobExecutionEnvironment.java`
#### Snippet
```java
    private final List<Action> actions = new ArrayList<>();

    private final Set<URL> jarUrls = new HashSet<>();

    private final List<URL> commonPluginJars = new ArrayList<>();
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
                    parserSink(configIndex, sinkConfig, classLoader, tableWithActionMap));
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

        // get factory urls
        Set<URL> factoryUrls = new HashSet<>();
        URL factoryUrl =
                FactoryUtil.getFactoryUrl(
```

### CollectionContainsUrl
Set `factoryUrls` may contain URL objects
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java

        // get factory urls
        Set<URL> factoryUrls = new HashSet<>();
        URL factoryUrl =
                FactoryUtil.getFactoryUrl(
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
            @NonNull String name,
            @NonNull SeaTunnelSink<IN, StateT, CommitInfoT, AggregatedCommitInfoT> sink,
            @NonNull Set<URL> jarUrls) {
        this(id, name, new ArrayList<>(), sink, jarUrls);
    }
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

    private SourceAction createSourceAction(
            long id, @NonNull String name, @NonNull SeaTunnelSource source, Set<URL> jarUrls) {
        if (!CollectionUtils.isEmpty(jarUrls)) {
            jarUrlsSet.addAll(jarUrls);
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

    private SinkAction createSinkAction(
            long id, @NonNull String name, @NonNull SeaTunnelSink sink, Set<URL> jarUrls) {
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/TaskGroupImmutableInformation.java`
#### Snippet
```java
    private Data group;

    private Set<URL> jars;

    public TaskGroupImmutableInformation() {}
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
                                                .peek(this::fillCheckpointPlan)
                                                .collect(Collectors.toList());
                                Set<URL> jars =
                                        taskList.stream()
                                                .flatMap(task -> task.getJarsUrl().stream())
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
    }

    protected static Path parsePathExpression(Iterator<Token> expression, ConfigOrigin origin) {
        return parsePathExpression(expression, origin, null, null, ConfigSyntax.CONF);
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

    protected SimpleConfigObject mergedWithObject(AbstractConfigObject abstractFallback) {
        this.requireNotIgnoringFallbacks();
        if (!(abstractFallback instanceof SimpleConfigObject)) {
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
     * @return the table ID, or null if it could not be parsed
     */
    protected static TableId parse(String[] parts, int numParts, boolean useCatalogBeforeSchema) {
        if (numParts == 0) {
            return null;
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                }
                synchronized (checkpointLock) {
                    if (internalRowCollector.collectTotalCount() != 0 || checkpointRetries == 0) {
                        checkpointRetries = 0;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `checkpointId` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
                saveState(readerState, currentCheckpoint);
                internalSource.notifyCheckpointComplete(currentCheckpoint);
                running = false;
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `internalRowCollector` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
#### Snippet
```java
                }
                synchronized (checkpointLock) {
                    if (internalRowCollector.collectTotalCount() != 0 || checkpointRetries == 0) {
                        checkpointRetries = 0;

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `checkpointId` accessed in synchronized context
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
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
            } else if (noMoreSplit && splits.isEmpty()) {
                // signal to the source that we have reached the end of the data.
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `splits` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                }
                inputFormat.close();
            } else if (noMoreSplit && splits.isEmpty()) {
                // signal to the source that we have reached the end of the data.
                log.info("Closed the bounded jdbc source");
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceReader.java`
#### Snippet
```java
                // signal to the source that we have reached the end of the data.
                log.info("Closed the bounded jdbc source");
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
            if (split != null) {
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

## RuleId[id=RedundantSuppression]
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

    public static final String STARTUP_MODE_KEY = "startup.mode";
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
    @SuppressWarnings("MagicNumber")
    @Override
    public SourceReader<T, SourceSplitBase> createReader(SourceReader.Context readerContext)
            throws Exception {
        // create source config for the given subtask (e.g. unique server id)
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/eumerator/SqlServerChunkSplitter.java`
#### Snippet
```java
    /** Returns the distribution factor of the given table. */
    @SuppressWarnings("MagicNumber")
    private double calculateDistributionFactor(
            TableId tableId, Object min, Object max, long approximateRowCnt) {

```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/eumerator/SqlServerChunkSplitter.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private static void maySleep(int count, TableId tableId) {
        // every 100 queries to sleep 1s
        if (count % 10 == 0) {
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/TableDiscoveryUtils.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    public static List<TableId> listTables(JdbcConnection jdbc, RelationalTableFilters tableFilters)
            throws SQLException {
        final List<TableId> capturedTableIds = new ArrayList<>();
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
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java

@SuppressWarnings("MagicNumber")
public final class SSLUtils {

    public static Optional<SSLContext> buildSSLContext(
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
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    private SeaTunnelDataType<?> fromJdbcType(ResultSetMetaData metadata, int colIndex)
            throws SQLException {
        MysqlType mysqlType = MysqlType.getByName(metadata.getColumnTypeName(colIndex));
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private Map<String, String> buildConnectorOptions(TablePath tablePath) {
        Map<String, String> options = new HashMap<>(8);
        options.put("connector", "jdbc");
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private Map<String, String> buildConnectorOptions(TablePath tablePath) {
        Map<String, String> options = new HashMap<>(8);
        options.put("connector", "starrocks");
```

### RedundantSuppression
Redundant suppression
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
     */
    @SuppressWarnings("MagicNumber")
    public static boolean validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        return parts.length == 3;
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
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/config/StarRocksSinkOptions.java`
#### Snippet
```java

@SuppressWarnings("MagicNumber")
public interface StarRocksSinkOptions {
    Option<List<String>> NODE_URLS =
            Options.key("nodeUrls")
```

### RedundantSuppression
Redundant suppression
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java

    @SuppressWarnings("MagicNumber")
    private Set<ExecutionEdge> generateShuffleEdges(Set<ExecutionEdge> executionEdges) {
        Map<Long, List<ExecutionVertex>> targetVerticesMap = new LinkedHashMap<>();
        Set<ExecutionVertex> sourceExecutionVertices = new HashSet<>();
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSinkFlowLifeCycle.java`
#### Snippet
```java
@SuppressWarnings("MagicNumber")
@Slf4j
public class ShuffleSinkFlowLifeCycle extends AbstractFlowLifeCycle
        implements OneInputFlowLifeCycle<Record<?>> {
    private final int pipelineId;
```

### RedundantSuppression
Redundant suppression
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSourceFlowLifeCycle.java`
#### Snippet
```java
@Slf4j
@SuppressWarnings("MagicNumber")
public class ShuffleSourceFlowLifeCycle<T> extends AbstractFlowLifeCycle
        implements OneOutputFlowLifeCycle<Record<?>> {
    private final ShuffleAction shuffleAction;
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

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `SqlServerUtils` has only 'static' members, and a 'public' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java

/** The utils for SqlServer data source. */
public class SqlServerUtils {

    public SqlServerUtils() {}
```

### UtilityClassWithPublicConstructor
Class `HttpUtil` has only 'static' members, and a 'public' constructor
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/util/HttpUtil.java`
#### Snippet
```java

/** util to build http client. */
public class HttpUtil {
    public HttpUtil() {}

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

        private Command(String name, Optional<Xid> xid, Callable<T> callable) {
            this(name, xid, callable, e -> empty());
        }
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

    private static RuntimeException wrapException(String action, Optional<Xid> xid, Exception ex) {
        if (ex instanceof XAException) {
            XAException xa = (XAException) ex;
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/TempDirectory.java`
#### Snippet
```java
            path = Files.createTempDirectory("seatunnel-");
        }
        System.out.println(path);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/JvmOptionsParser.java`
#### Snippet
```java
        final JvmOptionsParser parser = new JvmOptionsParser();
        final List<String> jvmOptions = parser.readJvmOptionsFiles(Paths.get(args[0]));
        System.out.println(String.join(" ", jvmOptions));
    }

```

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
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/FlinkStarter.java`
#### Snippet
```java
    public static void main(String[] args) {
        FlinkStarter flinkStarter = new FlinkStarter(args);
        System.out.println(String.join(" ", flinkStarter.buildCommands()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/FlinkStarter.java`
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
                String jobStatus = engineClient.getJobClient().listJobStatus(true);
                System.out.println(jobStatus);
            } else if (null != clientCommandArgs.getJobId()) {
                String jobState =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/command/ClientExecuteCommand.java`
#### Snippet
```java
                                .getJobClient()
                                .getJobDetailStatus(Long.parseLong(clientCommandArgs.getJobId()));
                System.out.println(jobState);
            } else if (null != clientCommandArgs.getCancelJobId()) {
                engineClient
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/command/ClientExecuteCommand.java`
#### Snippet
```java
                                .getJobClient()
                                .getJobMetrics(Long.parseLong(clientCommandArgs.getMetricsJobId()));
                System.out.println(jobMetrics);
            } else if (null != clientCommandArgs.getSavePointJobId()) {
                engineClient
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        SparkStarter starter = getInstance(args);
        List<String> command = starter.buildCommands();
        System.out.println(String.join(" ", command));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
        SparkStarter starter = getInstance(args);
        List<String> command = starter.buildCommands();
        System.out.println(String.join(" ", command));
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
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
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/CatalogTableUtil.java`
#### Snippet
```java

    public static SeaTunnelDataType<?> parseDataType(String columnStr) {
        columnStr = columnStr.toUpperCase().replace(" ", "");
        SqlType sqlType = null;
        try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/CatalogTableUtil.java`
#### Snippet
```java
                    "Decimal type should assign precision and scale information");
        }
        int precision = Integer.parseInt(decimalInfos[0].replaceAll("\\D", ""));
        int scale = Integer.parseInt(decimalInfos[1].replaceAll("\\D", ""));
        return new DecimalType(precision, scale);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/CatalogTableUtil.java`
#### Snippet
```java
        }
        int precision = Integer.parseInt(decimalInfos[0].replaceAll("\\D", ""));
        int scale = Integer.parseInt(decimalInfos[1].replaceAll("\\D", ""));
        return new DecimalType(precision, scale);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/JavaVersion.java`
#### Snippet
```java

    static List<Integer> parse(final String value) {
        if (!value.matches("^0*[0-9]+(\\.[0-9]+)*$")) {
            throw new JvmOptionsParserException(
                    CommonErrorCode.ILLEGAL_ARGUMENT,
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/JvmOptionsParser.java`
#### Snippet
```java
                continue;
            }
            if (line.matches("\\s*")) {
                // skip blank lines
                continue;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/args/FlinkCommandArgs.java`
#### Snippet
```java
        @Override
        public DeployMode convert(String value) {
            DeployMode deployMode = DeployMode.valueOf(value.toUpperCase().replaceAll("-", "_"));
            if (DEPLOY_MODE_TYPE_LIST.contains(deployMode)) {
                return deployMode;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/args/FlinkCommandArgs.java`
#### Snippet
```java
        @Override
        public MasterType convert(String value) {
            MasterType masterType = MasterType.valueOf(value.toUpperCase().replaceAll("-", "_"));
            if (MASTER_TYPE_LIST.contains(masterType)) {
                return masterType;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/args/FlinkCommandArgs.java`
#### Snippet
```java
        @Override
        public MasterType convert(String value) {
            MasterType masterType = MasterType.valueOf(value.toUpperCase().replaceAll("-", "_"));
            if (MASTER_TYPE_LIST.contains(masterType)) {
                return masterType;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/args/FlinkCommandArgs.java`
#### Snippet
```java
        @Override
        public DeployMode convert(String value) {
            DeployMode deployMode = DeployMode.valueOf(value.toUpperCase().replaceAll("-", "_"));
            if (DEPLOY_MODE_TYPE_LIST.contains(deployMode)) {
                return deployMode;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
            return Collections.singletonList(t);
        }
        String[] splitToken = tokenText.split(ConfigParseOptions.PATH_TOKEN_SEPARATOR);
        ArrayList<Token> splitTokens = new ArrayList<>();
        for (String s : splitToken) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/BaseFileSinkWriter.java`
#### Snippet
```java
            uuidPrefix = fileSinkStates.get(0).getUuidPrefix();
        } else {
            uuidPrefix = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/util/FileSystemUtils.java`
#### Snippet
```java
        }
        FileSystem fileSystem =
                FileSystem.get(URI.create(path.replaceAll("\\\\", "/")), configuration);
        fileSystem.setWriteChecksum(false);
        return fileSystem;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/ParquetReadStrategy.java`
#### Snippet
```java
                                    .toString()
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
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
                        "Partitions list is empty, please check");
            }
            int depth = partitionsList.get(0).replaceAll("\\\\", "/").split("/").length;
            long count =
                    partitionsList.stream()
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
            long count =
                    partitionsList.stream()
                            .map(partition -> partition.replaceAll("\\\\", "/").split("/").length)
                            .filter(length -> length != depth)
                            .count();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java
                List<String> partitions =
                        partitionDirAndValuesMap.keySet().stream()
                                .map(partition -> partition.replaceAll("\\\\", "/"))
                                .collect(Collectors.toList());
                try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java
            List<String> partitions =
                    partitionDirAndValuesMap.keySet().stream()
                            .map(partition -> partition.replaceAll("\\\\", "/"))
                            .collect(Collectors.toList());
            try {
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
            throw new IotdbConnectorException(
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
    @SuppressWarnings("MagicNumber")
    public static boolean validateJdbcUrlWithDatabase(String url) {
        String[] parts = url.trim().split("\\/+");
        return parts.length == 3;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
     */
    public static boolean validateJdbcUrlWithoutDatabase(String url) {
        String[] parts = url.trim().split("\\/+");

        return parts.length == 2;
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
                List<String> infos =
                        Arrays.stream(engineFull.substring(12).split(","))
                                .map(s -> s.replace("'", "").trim())
                                .collect(Collectors.toList());

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
                String clusterName = infos.get(0);
                String localDatabase = infos.get(1);
                String localTable = infos.get(2).replace("\\)", "").trim();

                String localTableSQL =
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
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
                        .getCreateTableDDL()
                        .replace(clickhouseTable.getDatabase() + ".", "")
                        .replaceAll("`", "");
        if (createTableDDL.contains(CLICKHOUSE_SETTINGS_KEY)) {
            List<String> filters =
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkWriter.java`
#### Snippet
```java
                                                .toString()
                                                .substring(0, UUID_LENGTH)
                                                .replaceAll("-", "_");
                                String clickhouseLocalFile =
                                        String.format(
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/source/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java

    private LocalDateTime parseDate(String fieldValue) {
        String formatDate = fieldValue.replace("T", " ");
        if (fieldValue.length() == "yyyyMMdd".length()
                || fieldValue.length() == "yyyy-MM-dd".length()) {
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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ShuffleStrategy()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ShuffleStrategy.java`
#### Snippet
```java

    @Tolerate
    public ShuffleStrategy() {}

    public abstract Map<String, IQueue<Record<?>>> createShuffles(
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
Constructor `CoordinatorTask()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/CoordinatorTask.java`
#### Snippet
```java
    private SeaTunnelMetricsContext metricsContext;

    public CoordinatorTask(long jobID, TaskLocation taskID) {
        super(jobID, taskID);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ActionFlowLifeCycle()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ActionFlowLifeCycle.java`
#### Snippet
```java
    protected Action action;

    public ActionFlowLifeCycle(
            Action action, SeaTunnelTask runningTask, CompletableFuture<Void> completableFuture) {
        super(runningTask, completableFuture);
```

### NonProtectedConstructorInAbstractClass
Constructor `SeaTunnelTask()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    private SeaTunnelMetricsContext metricsContext;

    public SeaTunnelTask(long jobID, TaskLocation taskID, int indexID, Flow executionFlow) {
        super(jobID, taskID);
        this.indexID = indexID;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTaskGroupWithIntermediateQueue()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/AbstractTaskGroupWithIntermediateQueue.java`
#### Snippet
```java

public abstract class AbstractTaskGroupWithIntermediateQueue extends TaskGroupDefaultImpl {
    public AbstractTaskGroupWithIntermediateQueue(
            TaskGroupLocation taskGroupLocation, String taskGroupName, Collection<Task> tasks) {
        super(taskGroupLocation, taskGroupName, tasks);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractIntermediateQueue()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/AbstractIntermediateQueue.java`
#### Snippet
```java
    private final T queue;

    public AbstractIntermediateQueue(T queue) {
        this.queue = queue;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceEventOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceEventOperation.java`
#### Snippet
```java
    protected byte[] sourceEvent;

    public SourceEventOperation() {}

    public SourceEventOperation(
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceEventOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceEventOperation.java`
#### Snippet
```java
    public SourceEventOperation() {}

    public SourceEventOperation(
            TaskLocation targetTaskLocation, TaskLocation currentTaskLocation, SourceEvent event) {
        super(targetTaskLocation);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobAsyncOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/AbstractJobAsyncOperation.java`
#### Snippet
```java
    protected long jobId;

    public AbstractJobAsyncOperation() {}

    public AbstractJobAsyncOperation(long jobId) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobAsyncOperation()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/AbstractJobAsyncOperation.java`
#### Snippet
```java
    public AbstractJobAsyncOperation() {}

    public AbstractJobAsyncOperation(long jobId) {
        this.jobId = jobId;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractResourceManager()` of an abstract class should not be declared 'public'
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
    private volatile boolean isRunning = true;

    public AbstractResourceManager(NodeEngine nodeEngine) {
        this.registerWorker = new ConcurrentHashMap<>();
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
#### Snippet
```java
    private volatile boolean running = true;

    public BaseSeaTunnelSourceFunction(SeaTunnelSource<SeaTunnelRow, ?, ?> source) {
        this.source = source;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseSeaTunnelSourceFunction()` of an abstract class should not be declared 'public'
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
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
Constructor `OffsetFactory()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/offset/OffsetFactory.java`
#### Snippet
```java

public abstract class OffsetFactory implements Serializable {
    public OffsetFactory() {}

    public abstract Offset earliest();
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
    protected boolean isKerberosAuthorization = false;

    public AbstractWriteStrategy(FileSinkConfig fileSinkConfig) {
        this.fileSinkConfig = fileSinkConfig;
        this.sinkColumnsIndexInRow = fileSinkConfig.getSinkColumnsIndexInRow();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcCatalog()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    protected final String defaultUrl;

    public AbstractJdbcCatalog(
            String catalogName, String username, String pwd, JdbcUrlUtil.UrlInfo urlInfo) {

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcRowConverter()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
    public abstract String converterName();

    public AbstractJdbcRowConverter() {}

    @Override
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

    public SourceReaderBase(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            SplitFetcherManager<E, SplitT> splitFetcherManager,
```

### NonProtectedConstructorInAbstractClass
Constructor `SplitFetcherManager()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
    }

    public SplitFetcherManager(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            Supplier<SplitReader<E, SplitT>> splitReaderFactory,
```

### NonProtectedConstructorInAbstractClass
Constructor `SplitFetcherManager()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
    private volatile boolean closed;

    public SplitFetcherManager(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            Supplier<SplitReader<E, SplitT>> splitReaderFactory) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSplitEnumerator()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/AbstractSplitEnumerator.java`
#### Snippet
```java
    protected IcebergTableLoader icebergTableLoader;

    public AbstractSplitEnumerator(
            @NonNull SourceSplitEnumerator.Context<IcebergFileScanTaskSplit> context,
            @NonNull SourceConfig sourceConfig,
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
    }

    public SingleThreadMultiplexSourceReaderBase(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            SingleThreadFetcherManager<E, SplitT> splitFetcherManager,
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
        extends SourceReaderBase<E, T, SplitT, SplitStateT> {

    public SingleThreadMultiplexSourceReaderBase(
            Supplier<SplitReader<E, SplitT>> splitReaderSupplier,
            RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleThreadMultiplexSourceReaderBase()` of an abstract class should not be declared 'public'
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SingleThreadMultiplexSourceReaderBase.java`
#### Snippet
```java
    }

    public SingleThreadMultiplexSourceReaderBase(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            Supplier<SplitReader<E, SplitT>> splitReaderSupplier,
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
    }

    public AbstractPluginDiscovery(
            Path pluginDir,
            Config pluginConfig,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
    }

    public AbstractPluginDiscovery(Path pluginDir, Config pluginConfig) {
        this(pluginDir, pluginConfig, DEFAULT_URL_TO_CLASSLOADER);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPluginDiscovery()` of an abstract class should not be declared 'public'
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            new ConcurrentHashMap<>(Common.COLLECTION_SIZE);

    public AbstractPluginDiscovery(
            String pluginSubDir, BiConsumer<ClassLoader, URL> addURLToClassloader) {
        this(
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

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `columnStr`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/CatalogTableUtil.java`
#### Snippet
```java

    public static SeaTunnelDataType<?> parseDataType(String columnStr) {
        columnStr = columnStr.toUpperCase().replace(" ", "");
        SqlType sqlType = null;
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `keys`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
            Map<String, Object> rawMap = (Map<String, Object>) rawValue;
            if (!nestedMap) {
                keys = new ArrayList<>();
                newMap = new LinkedHashMap<>(rawMap.size());
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `newMap`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
            if (!nestedMap) {
                keys = new ArrayList<>();
                newMap = new LinkedHashMap<>(rawMap.size());
            }
            for (Map.Entry<String, Object> entry : rawMap.entrySet()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `rawValue`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
    public static <T> T convertValue(Object rawValue, Option<T> option) {
        TypeReference<T> typeReference = option.typeReference();
        rawValue = flatteningMapWithObject(rawValue);
        if (typeReference.getType() instanceof Class) {
            // simple type
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java
            paths.addAll(validJars);

            config =
                    config.withValue(
                            path,
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        } else {
            config =
                    config.withValue(
                            path,
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

    private Config registerPlugin(Config config, List<URL> jars) {
        config =
                this.injectJarsToConfig(
                        config, ConfigUtil.joinPath("env", "pipeline", "jars"), jars);
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

    private Config registerPlugin(Config config, List<URL> jars) {
        config =
                this.injectJarsToConfig(
                        config, ConfigUtil.joinPath("env", "pipeline", "jars"), jars);
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java
            paths.addAll(validJars);

            config =
                    config.withValue(
                            path,
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkExecution.java`
#### Snippet
```java

        } else {
            config =
                    config.withValue(
                            path,
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
Assignment to method parameter `t`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/ExceptionUtil.java`
#### Snippet
```java

    @NonNull private static RuntimeException peeledAndUnchecked(@NonNull Throwable t) {
        t = peel(t);

        if (t instanceof RuntimeException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/ExceptionUtil.java`
#### Snippet
```java
                && t.getCause() != null
                && t.getCause() != t) {
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
Assignment to method parameter `storageNameSpace`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/api/AbstractCheckpointStorage.java`
#### Snippet
```java
        if (storageNameSpace != null) {
            if (!storageNameSpace.endsWith(DEFAULT_CHECKPOINT_FILE_PATH_SPLIT)) {
                storageNameSpace = storageNameSpace + DEFAULT_CHECKPOINT_FILE_PATH_SPLIT;
            }
            this.storageNameSpace = storageNameSpace;
```

### AssignmentToMethodParameter
Assignment to method parameter `obj`
in `seatunnel-engine/seatunnel-engine-serializer/serializer-protobuf/src/main/java/org/apache/seatunnel/engine/serializer/protobuf/ProtoStuffSerializer.java`
#### Snippet
```java
        Schema schema = WRAPPER_SCHEMA;
        if (WRAPPERS.contains(clazz)) {
            obj = (T) SerializerDeserializerWrapper.of(obj);
        } else {
            schema = getSchema(clazz);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
    private PipelineState readPipelineState(String fileName, String jobId)
            throws CheckpointStorageException {
        fileName =
                getStorageParentDirectory() + jobId + DEFAULT_CHECKPOINT_FILE_PATH_SPLIT + fileName;
        try (FSDataInputStream in = fs.open(new Path(fileName));
```

### AssignmentToMethodParameter
Assignment to method parameter `loop`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
        }
        synchronized (iterator.next().getCheckpointLock()) {
            internalCheckpoint(iterator, ++loop);
            if (loop != this.parallelism) {
                // Avoid backtracking calls
```

### AssignmentToMethodParameter
Assignment to method parameter `identifierPart`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
        if (identifierPart.charAt(0) != quotingChar
                && identifierPart.charAt(identifierPart.length() - 1) != quotingChar) {
            identifierPart = identifierPart.replace(quotingChar + "", repeat(quotingChar));
            identifierPart = quotingChar + identifierPart + quotingChar;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `identifierPart`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
                && identifierPart.charAt(identifierPart.length() - 1) != quotingChar) {
            identifierPart = identifierPart.replace(quotingChar + "", repeat(quotingChar));
            identifierPart = quotingChar + identifierPart + quotingChar;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `loop`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
        }
        synchronized (iterator.next().getCheckpointLock()) {
            internalCheckpoint(iterator, ++loop);
            if (loop != this.parallelism) {
                // Avoid backtracking calls
```

### AssignmentToMethodParameter
Assignment to method parameter `checkpointState`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        final SplitAssigner splitAssigner;
        if (checkpointState instanceof HybridPendingSplitsState) {
            checkpointState = restore(capturedTables, (HybridPendingSplitsState) checkpointState);
            SnapshotPhaseState checkpointSnapshotState =
                    ((HybridPendingSplitsState) checkpointState).getSnapshotPhaseState();
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
            Map<String, String> parameters =
                    tableInformation.getSd().getSerdeInfo().getParameters();
            pluginConfig =
                    pluginConfig
                            .withValue(
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
                                    ConfigValueFactory.fromAnyRef(parameters.get("line.delim")));
        } else if (PARQUET_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            pluginConfig =
                    pluginConfig.withValue(
                            FILE_FORMAT_TYPE.key(),
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
                            ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_OUTPUT_FORMAT_CLASSNAME.equals(outputFormat)) {
            pluginConfig =
                    pluginConfig.withValue(
                            FILE_FORMAT_TYPE.key(),
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
                    "Hive connector only support [text parquet orc] table now");
        }
        pluginConfig =
                pluginConfig
                        .withValue(
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/sink/HiveSink.java`
#### Snippet
```java
            String path = uri.getPath();
            hadoopConf = new HadoopConf(hdfsLocation.replace(path, ""));
            pluginConfig =
                    pluginConfig
                            .withValue(FILE_PATH.key(), ConfigValueFactory.fromAnyRef(path))
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
        String inputFormat = tableInformation.getSd().getInputFormat();
        if (TEXT_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig =
                    pluginConfig.withValue(
                            FILE_FORMAT_TYPE.key(),
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
            ObjectNode jsonNodes = JsonUtils.parseObject(render);
            jsonNodes.putPOJO(SCHEMA.key(), schema);
            pluginConfig = ConfigFactory.parseString(jsonNodes.toString());
        } else if (PARQUET_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig =
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
            pluginConfig = ConfigFactory.parseString(jsonNodes.toString());
        } else if (PARQUET_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig =
                    pluginConfig.withValue(
                            FILE_FORMAT_TYPE.key(),
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
                            ConfigValueFactory.fromAnyRef(FileFormat.PARQUET.toString()));
        } else if (ORC_INPUT_FORMAT_CLASSNAME.equals(inputFormat)) {
            pluginConfig =
                    pluginConfig.withValue(
                            FILE_FORMAT_TYPE.key(),
```

### AssignmentToMethodParameter
Assignment to method parameter `pluginConfig`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/source/HiveSource.java`
#### Snippet
```java
            String path = uri.getPath();
            String defaultFs = hdfsLocation.replace(path, "");
            pluginConfig =
                    pluginConfig
                            .withValue(
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
Assignment to method parameter `backend`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisSinkWriter.java`
#### Snippet
```java
    public boolean tryHttpConnection(String backend) {
        try {
            backend = "http://" + backend;
            URL url = new URL(backend);
            HttpURLConnection co = (HttpURLConnection) url.openConnection();
```

### AssignmentToMethodParameter
Assignment to method parameter `body`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java

        if (StringUtils.isBlank(body)) {
            body = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `method`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/client/HttpClientProvider.java`
#### Snippet
```java
            throws Exception {
        // convert method option to uppercase
        method = method.toUpperCase(Locale.ROOT);
        if (HttpPost.METHOD_NAME.equals(method)) {
            return doPost(url, headers, params, body);
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
Assignment to method parameter `index`
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/source/OpenMldbSourceReader.java`
#### Snippet
```java
    private Object getObject(ResultSet resultSet, int index, SeaTunnelDataType<?> dataType)
            throws SQLException {
        index = index + 1;
        switch (dataType.getSqlType()) {
            case BOOLEAN:
```

### AssignmentToMethodParameter
Assignment to method parameter `boundStatement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/sink/CassandraSinkWriter.java`
#### Snippet
```java
                DataType dataType = tableSchema.get(i).getType();
                Object fieldValue = row.getField(seaTunnelRowType.indexOf(fieldName));
                boundStatement =
                        TypeConvertUtil.reconvertAndInject(boundStatement, i, dataType, fieldValue);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `createTableSql`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/util/CreateTableParser.java`
#### Snippet
```java
        StringBuilder columnBuilder = new StringBuilder();
        int startIndex = createTableSql.indexOf("(");
        createTableSql = createTableSql.substring(startIndex + 1);

        boolean insideParentheses = false;
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
                    statement =
                            statement.setInetAddress(
                                    index, InetAddress.getByName((String) fileValue));
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
                statement =
                        statement.setInstant(
                                index,
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
                statement =
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                    fileValue = Arrays.stream((Object[]) fileValue).toArray(Byte[]::new);
                }
                statement =
                        statement.setByteBuffer(
                                index, ByteBuffer.wrap(ArrayUtils.toPrimitive((Byte[]) fileValue)));
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
                statement =
                        statement.set(
                                index,
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                return statement;
            case ProtocolConstants.DataType.SET:
                statement =
                        statement.set(
                                index,
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
Assignment to method parameter `template`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/sink/StarRocksSaveModeUtil.java`
#### Snippet
```java
                    Column column = columnMap.get(col);
                    String newCol = columnToStarrocksType(column);
                    template =
                            template.substring(
                                            0,
```

### AssignmentToMethodParameter
Assignment to method parameter `template`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/sink/StarRocksSaveModeUtil.java`
#### Snippet
```java
        Map<String, CreateTableParser.ColumnInfo> columnInTemplate =
                CreateTableParser.getColumnList(template);
        template = mergeColumnInTemplate(columnInTemplate, tableSchema, template);

        String rowTypeFields =
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSink.java`
#### Snippet
```java
                        .build();

        config = config.withFallback(ConfigFactory.parseMap(defaultConfigs));
        List<ClickHouseNode> nodes =
                ClickhouseUtil.createNodes(
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

### AssignmentToMethodParameter
Assignment to method parameter `v1`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
                                        .longValue();
                        if (original != scaled) {
                            v1 = convertTo(t, scaled);
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `v1`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
                {
                    BigDecimal bd = BigDecimal.valueOf(v1.doubleValue());
                    v1 = bd.setScale(scale, roundingMode);
                    break;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `v1`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
                                break l;
                        }
                        v1 = t.equals("FLOAT") ? (float) d : d;
                        break c;
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `v1`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
                    BigDecimal bd =
                            BigDecimal.valueOf(v1.doubleValue()).setScale(scale, roundingMode);
                    v1 = t.equals("FLOAT") ? bd.floatValue() : bd.doubleValue();
                    break;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
    public static String pad(String string, int n, String padding, boolean right) {
        if (n < 0) {
            n = 0;
        }
        if (n < string.length()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        }
        StringBuilder buff = new StringBuilder(n);
        n -= string.length();
        if (right) {
            buff.append(string);
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

## RuleId[id=ReturnNull]
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
            Object rawValue, Map<String, Object> newMap, List<String> keys, boolean nestedMap) {
        if (rawValue == null) {
            return null;
        }
        if (!(rawValue instanceof List) && !(rawValue instanceof Map)) {
```

### ReturnNull
Return of `null`
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
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
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/SinkExecuteProcessor.java`
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
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
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
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SinkExecuteProcessor.java`
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
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/RetryUtils.java`
#### Snippet
```java
                    lastException);
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
    public static <T> T parseObject(String json, Class<T> clazz) {
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
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PropertiesParser.java`
#### Snippet
```java
    static String exceptLastElement(String path) {
        int i = path.lastIndexOf('.');
        if (i < 0) return null;
        else return path.substring(0, i);
    }
```

### ReturnNull
Return of `null`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/Path.java`
#### Snippet
```java
    Path parent() {
        if (remainder == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
        String s = ConfigImplUtil.unicodeTrim(path);
        if (looksUnsafeForFastParser(s)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

        return v == null
                ? null
                : new SimpleConfigObject(
                        this.origin(),
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
        if (runningJobMaster == null) {
            JobHistoryService.JobState jobDetailState = jobHistoryService.getJobDetailState(jobId);
            return null == jobDetailState ? null : jobDetailState.getJobStatus();
        }
        return runningJobMaster.getJobStatus();
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
            return ownedSlotProfilesIMap.get(pipelineLocation).get(taskGroupLocation);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
                    executorService);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                                        }
                                    }
                                    return null;
                                });
        if (!taskGroupExecutionTracker.executionCompletedExceptionally()) {
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
                        })
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/sink/SinkRegisterOperation.java`
#### Snippet
```java
                            server.getTaskExecutionService().getTask(committerTaskID);
                    task.receivedWriterRegister(writerTaskID, readerAddress);
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/RequestSplitOperation.java`
#### Snippet
```java
                            server.getTaskExecutionService().getTask(enumeratorTaskID);
                    task.requestSplit(taskID.getTaskIndex());
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/RestoredSplitOperation.java`
#### Snippet
```java
                            taskExecutionService.getTask(taskLocation);
                    task.addSplitsBack(deserialize, subtaskIndex);
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceRegisterOperation.java`
#### Snippet
```java
                            server.getTaskExecutionService().getTask(enumeratorTaskID);
                    task.receivedReader(readerTaskID, readerAddress);
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceNoMoreElementOperation.java`
#### Snippet
```java
                            server.getTaskExecutionService().getTask(enumeratorTaskID);
                    task.readerFinished(currentTaskID.getTaskID());
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/SourceReaderEventOperation.java`
#### Snippet
```java
                            currentTaskLocation.getTaskIndex(),
                            SerializationUtils.deserialize(sourceEvent, classLoader));
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/checkpoint/CloseRequestOperation.java`
#### Snippet
```java
                            server.getTaskExecutionService().getTask(readerLocation);
                    task.close();
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/source/AssignSplitOperation.java`
#### Snippet
```java
                    task.receivedSourceSplit(
                            Arrays.stream(o).map(i -> (SplitT) i).collect(Collectors.toList()));
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/operation/checkpoint/BarrierFlowOperation.java`
#### Snippet
```java
                        sneakyThrow(e);
                    }
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/metrics/JobMetricsUtil.java`
#### Snippet
```java
            }
        }
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/execution/Task.java`
#### Snippet
```java

    default MetricsContext getMetricsContext() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/NotifyTaskStartOperation.java`
#### Snippet
```java
                    AbstractTask task = server.getTaskExecutionService().getTask(taskLocation);
                    task.startCall();
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/CheckpointBarrierTriggerOperation.java`
#### Snippet
```java
                        sneakyThrow(e);
                    }
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/TaskReportStatusOperation.java`
#### Snippet
```java
                            .getCheckpointManager()
                            .reportedTask(this);
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/NotifyTaskRestoreOperation.java`
#### Snippet
```java
                        throw new SeaTunnelException(e);
                    }
                    return null;
                },
                new RetryUtils.RetryMaterial(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/persistence/FileMapStore.java`
#### Snippet
```java
    @Override
    public Object load(Object key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/operation/CheckpointFinishedOperation.java`
#### Snippet
```java
                        throw new SeaTunnelEngineException(ExceptionUtils.getMessage(e));
                    }
                    return null;
                },
                new RetryUtils.RetryMaterial(
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
                    task.getTaskFullName(),
                    ExecutionState.DEPLOYING);
            return null;
        } else {
            jobMaster.updateTaskExecutionState(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                                            "%s turn to a unexpected state: %s, stop scheduler job.",
                                            task.getTaskFullName(), task.getExecutionState()))));
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                        task.getTaskFullName(),
                        ExecutionState.SCHEDULED);
                return null;
            } else {
                makeTaskFailed(
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                                        "%s turn to a unexpected state: %s, stop scheduler job.",
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
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    public SeaTunnelRow deserialize(String message) throws IOException {
        if (message == null) {
            return null;
        }
        return convertJsonNode(convert(message));
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonDeserializationSchema.java`
#### Snippet
```java
    private SeaTunnelRow convertJsonNode(JsonNode jsonNode) {
        if (jsonNode.isNull()) {
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
            throw new SeaTunnelJsonFormatException(
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
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
        } catch (Exception t) {
            if (ignoreParseErrors) {
                return null;
            }
            throw new SeaTunnelJsonFormatException(
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
                        String.format("Could not find field with name %s .", fieldName));
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `seatunnel-formats/seatunnel-format-text/src/main/java/org/apache/seatunnel/format/text/TextDeserializationSchema.java`
#### Snippet
```java
    private Object convert(String field, SeaTunnelDataType<?> fieldType, int level) {
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
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-local-file/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/localfile/LocalFileStorage.java`
#### Snippet
```java
        if (fileList.isEmpty()) {
            log.info("No checkpoint found for job, job id is: " + jobId);
            return null;
        }
        List<String> fileNames = fileList.stream().map(File::getName).collect(Collectors.toList());
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-local-file/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/localfile/LocalFileStorage.java`
#### Snippet
```java
                            + ", pipeline id is: "
                            + pipelineId);
            return null;
        }
        return latestFile.get();
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-local-file/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/localfile/LocalFileStorage.java`
#### Snippet
```java
        if (fileList.isEmpty()) {
            log.info("No checkpoint found for this job,  the job id is: " + jobId);
            return null;
        }
        for (File file : fileList) {
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
        if (fileNames.isEmpty()) {
            log.info("No checkpoint found for this job,  the job id is: " + jobId);
            return null;
        }
        for (String fileName : fileNames) {
```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
        if (fileNames.isEmpty()) {
            log.info("No checkpoint found for job, job id is: " + jobId);
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-plugins/checkpoint-storage-hdfs/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/hdfs/HdfsStorage.java`
#### Snippet
```java
                            + ", pipeline id is: "
                            + pipelineId);
            return null;
        }
        return readPipelineState(latestFileName, jobId);
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/SeaTunnelSparkSink.java`
#### Snippet
```java
    @Override
    public StructType inferSchema(CaseInsensitiveStringMap options) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/SeaTunnelSparkSource.java`
#### Snippet
```java
    @Override
    public StructType inferSchema(CaseInsensitiveStringMap caseInsensitiveStringMap) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/config/StartupConfig.java`
#### Snippet
```java
                return offsetFactory.latest();
            case INITIAL:
                return null;
            case SPECIFIC:
                return offsetFactory.specific(specificOffsetFile, specificOffsetPos);
```

### ReturnNull
Return of `null`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
    protected static TableId parse(String[] parts, int numParts, boolean useCatalogBeforeSchema) {
        if (numParts == 0) {
            return null;
        }
        if (numParts == 1) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
    private static String quote(String identifierPart, char quotingChar) {
        if (identifierPart == null) {
            return null;
        }

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
    public static LocalDateTime toLocalDateTime(Object obj, ZoneId serverTimeZone) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof OffsetDateTime) {
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
#### Snippet
```java
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
            if (source == null) {
                return null;
            }
            final Long timestamp = sourceInfo.getInt64(SourceInfo.TIMESTAMP_KEY);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
#### Snippet
```java
            }
            final Long timestamp = sourceInfo.getInt64(SourceInfo.TIMESTAMP_KEY);
            return timestamp == null ? null : Instant.ofEpochMilli(timestamp);
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/SqlServerSourceFetchTaskContext.java`
#### Snippet
```java
            final Struct sourceInfo = value.getStruct(Envelope.FieldName.SOURCE);
            if (source == null) {
                return null;
            }
            return sourceInfo.getString(SourceInfo.COMMIT_LSN_KEY);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/eumerator/SqlServerChunkSplitter.java`
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
                        decimalType.getPrecision(), decimalType.getScale());
            case NULL:
                return null;
            case BYTES:
                return fakeDataRandomUtils.randomBytes();
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/catalog/S3CatalogFactory.java`
#### Snippet
```java
    @Override
    public OptionRule optionRule() {
        return null;
    }
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

    public ReadStrategy getReadStrategy() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/FileFormat.java`
#### Snippet
```java

    public WriteStrategy getWriteStrategy(FileSinkConfig fileSinkConfig) {
        return null;
    }
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
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java
    protected Object convert(SeaTunnelDataType dataType, Object val) {
        if (val == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-hbase/src/main/java/org/apache/seatunnel/connectors/seatunnel/hbase/sink/HbaseSinkWriter.java`
#### Snippet
```java
        Object field = row.getField(index);
        if (field == null) {
            return null;
        }
        SeaTunnelDataType<?> fieldType = seaTunnelRowType.getFieldType(index);
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
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            SeaTunnelDataType seaTunnelType, TSDataType tsDataType, Object value) {
        if (value == null) {
            return null;
        }
        switch (tsDataType) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/catalog/KafkaCatalogFactory.java`
#### Snippet
```java
    public OptionRule optionRule() {
        // todo:
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/catalog/KafkaCatalogFactory.java`
#### Snippet
```java
    public Catalog createCatalog(String catalogName, ReadonlyConfig options) {
        // todo: Do we need to use singleton here?
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/sink/Neo4jSinkWriter.java`
#### Snippet
```java
                tx -> {
                    tx.run(query);
                    return null;
                });
    }
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java

        if (keyFields == null || keyFields.isEmpty()) {
            return row -> null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java

    private static Function<SeaTunnelRow, Iterable<Header>> headersExtractor() {
        return row -> null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java

    private static Function<SeaTunnelRow, Long> timestampExtractor() {
        return row -> null;
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
            throw new IllegalStateException();
        }
        return recordsInCurrentSplit.hasNext() ? recordsInCurrentSplit.next() : null;
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
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java
                throw new SeaTunnelException(e);
            }
            return null;
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
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplitEnumerator.java`
#### Snippet
```java
                                        return split;
                                    } else {
                                        return null;
                                    }
                                })
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
            try (CloseableHttpResponse resp = httpClient.execute(httpPost)) {
                HttpEntity respEntity = getHttpEntity(resp);
                return respEntity != null ? EntityUtils.toString(respEntity, "UTF-8") : null;
            }
        }
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
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/serialize/StarRocksBaseSerializer.java`
#### Snippet
```java
    protected Object convert(SeaTunnelDataType dataType, Object val) {
        if (val == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
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
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
    private static Object resolveObject2Maxcompute(Object field, TypeInfo typeInfo) {
        if (field == null) {
            return null;
        }
        switch (typeInfo.getOdpsType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                return new Binary((byte[]) field);
            case DECIMAL:
                return null;
            case VARCHAR:
                return new Varchar((String) field);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
    private static Object resolveObject2SeaTunnel(Object field, SeaTunnelDataType<?> fieldType) {
        if (field == null) {
            return null;
        }
        switch (fieldType.getSqlType()) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                return ((Binary) field).data();
            case DECIMAL:
                return null;
            case STRING:
                if (field instanceof byte[]) {
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
in `seatunnel-connectors-v2/connector-tablestore/src/main/java/org/apache/seatunnel/connectors/seatunnel/tablestore/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            String columnName, Object value, PrimaryKeyType primaryKeyType) {
        if (value == null) {
            return null;
        }
        switch (primaryKeyType) {
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/sink/ElasticsearchSinkWriter.java`
#### Snippet
```java
                            return bulkResponse;
                        }
                        return null;
                    },
                    retryMaterial);
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchCatalogFactory.java`
#### Snippet
```java
    public Catalog createCatalog(String catalogName, ReadonlyConfig options) {
        // todo:
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/catalog/ElasticSearchCatalogFactory.java`
#### Snippet
```java
    public OptionRule optionRule() {
        // todo:
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/KeyExtractor.java`
#### Snippet
```java
            SeaTunnelRowType rowType, String[] primaryKeys, String keyDelimiter) {
        if (primaryKeys == null) {
            return row -> null;
        }

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
            throw new ElasticsearchConnectorException(
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

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
                        if (loadResult == null || loadResult.isEmpty()) {
                            // upload finished
                            return null;
                        }
                        throw new SelectDBConnectorException(
```

### ReturnNull
Return of `null`
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SeaTunnelRowConverter.java`
#### Snippet
```java
    protected Object convert(SeaTunnelDataType dataType, Object val) {
        if (val == null) {
            return null;
        }
        switch (dataType.getSqlType()) {
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
                Object newArray =
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
                throw new UnsupportedOperationException(
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FilterRowKindTransform.java`
#### Snippet
```java
    protected SeaTunnelRow transformRow(SeaTunnelRow inputRow) {
        if (!excludeKinds.isEmpty()) {
            return excludeKinds.contains(inputRow.getRowKind()) ? null : inputRow;
        }
        if (!includeKinds.isEmpty()) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FilterRowKindTransform.java`
#### Snippet
```java
        }
        if (!includeKinds.isEmpty()) {
            return includeKinds.contains(inputRow.getRowKind()) ? inputRow : null;
        }
        throw new SeaTunnelRuntimeException(
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/SystemFunction.java`
#### Snippet
```java
        String v2 = (String) args.get(1);
        if (v1 == null) {
            return null;
        }
        if (v1.equals(v2)) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/SystemFunction.java`
#### Snippet
```java
        }
        if (v1.equals(v2)) {
            return null;
        }
        switch (v2) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/SystemFunction.java`
#### Snippet
```java
        Object v2 = args.get(1);
        if (v1 == null) {
            return null;
        }
        if (v1.equals(v2)) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/SystemFunction.java`
#### Snippet
```java
        }
        if (v1.equals(v2)) {
            return null;
        }
        return v1;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/ZetaSQLEngine.java`
#### Snippet
```java
        boolean retain = zetaSQLFilter.executeFilter(selectBody.getWhere(), inputFields);
        if (!retain) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/ZetaSQLFunction.java`
#### Snippet
```java
    public Object computeForValue(Expression expression, Object[] inputFields) {
        if (expression instanceof NullValue) {
            return null;
        }
        if (expression instanceof DoubleValue) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/ZetaSQLFunction.java`
#### Snippet
```java
                (Number) computeForValue(binaryExpression.getRightExpression(), inputFields);
        if (leftValue == null || rightValue == null) {
            return null;
        }
        SeaTunnelDataType<?> resultType = zetaSQLType.getExpressionType(binaryExpression);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number leftValue = (Number) args.get(0);
        if (leftValue == null) {
            return null;
        }
        Number rightValue = (Number) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number rightValue = (Number) args.get(1);
        if (rightValue == null) {
            return null;
        }
        if (rightValue.doubleValue() == 0) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        if (v1.doubleValue() <= 0) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        Number v2 = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        return Math.sqrt(v1.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        return Math.toRadians(v1.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.tan(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        if (v1.doubleValue() <= 0) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v2 = (Number) args.get(1);
        if (v2 == null) {
            return null;
        }
        if (v2.doubleValue() <= 0) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.sin(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        double d = Math.tan(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        Number v2 = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        Number v2 = (Number) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v2 = (Number) args.get(1);
        if (v2 == null) {
            return null;
        }
        return Math.pow(v1.doubleValue(), v2.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        Number arg2 = (Number) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg2 = (Number) args.get(1);
        if (arg2 == null) {
            return null;
        }
        return Math.atan2(arg.doubleValue(), arg2.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.asin(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.acos(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.sinh(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        if (arg instanceof Integer) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        Number v2 = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.atan(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        Number v2 = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        return Math.exp(v1.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number v1 = (Number) args.get(0);
        if (v1 == null) {
            return null;
        }
        if (v1.doubleValue() <= 0) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.cos(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.cosh(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
        Number arg = (Number) args.get(0);
        if (arg == null) {
            return null;
        }
        return Math.tanh(arg.doubleValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalTime localTime = convertToLocalTime(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        TemporalAccessor datetime = (TemporalAccessor) args.get(0);
        if (datetime == null) {
            return null;
        }
        String format = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        String str = (String) args.get(0);
        if (str == null) {
            return null;
        }
        String format = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        long count = ((Number) args.get(1)).longValue();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        String datetimeField = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
                                datetimeField, ZetaSQLFunction.EXTRACT));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalTime localTime = convertToLocalTime(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalTime localTime = convertToLocalTime(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime = (Temporal) args.get(0);
        if (datetime == null) {
            return null;
        }
        LocalDate localDate = convertToLocalDate(datetime);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime1 = (Temporal) args.get(0);
        if (datetime1 == null) {
            return null;
        }
        Temporal datetime2 = (Temporal) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        Temporal datetime2 = (Temporal) args.get(1);
        if (datetime2 == null) {
            return null;
        }
        String datetimeField = "DAY";
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
                                datetimeField, ZetaSQLFunction.DATEDIFF));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
        LocalDateTime datetime = (LocalDateTime) args.get(0);
        if (datetime == null) {
            return null;
        }
        String datetimeField = "DAY";
```

### ReturnNull
Return of `null`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        int len = arg.length();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java

        if (!found) {
            return null;
        } else {
            return m.group(subexpression);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String v1 = (String) args.get(0);
        if (v1 == null) {
            return null;
        }
        String v2 = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        int count = ((Number) args.get(1)).intValue();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        String sp = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        return (long) arg.length();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        } else {
            return (int) arg.charAt(0);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        String sp = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        String sp = null;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        return arg.getBytes(StandardCharsets.UTF_8).length * 8L;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        return arg.toUpperCase();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String input = (String) args.get(0);
        if (input == null) {
            return null;
        }
        String regexp = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String s = (String) args.get(0);
        if (s == null) {
            return null;
        }
        int count = ((Number) args.get(1)).intValue();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        int count = ((Number) args.get(1)).intValue();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String v1 = (String) args.get(0);
        if (v1 == null) {
            return null;
        }
        return new String(getSoundex(v1), StandardCharsets.ISO_8859_1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String original = (String) args.get(0);
        if (original == null) {
            return null;
        }
        String findChars = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        Object arg = args.get(0);
        if (arg == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String s = (String) args.get(0);
        if (s == null) {
            return null;
        }
        int sl = s.length();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        end = Math.min(end, sl + 1);
        if (start > sl || end <= start) {
            return null;
        }
        return s.substring(start - 1, end - 1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String input = (String) args.get(0);
        if (input == null) {
            return null;
        }
        String regexp = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        return arg.toLowerCase();
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        Object arg = args.get(0);
        if (arg == null) {
            return null;
        }
        if (arg instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        Object arg = args.get(0);
        if (arg == null) {
            return null;
        }
        if (arg instanceof Number) {
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String input = (String) args.get(0);
        if (input == null) {
            return null;
        }
        String regexp = (String) args.get(1);
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        Object arg = args.get(0);
        if (arg == null) {
            return null;
        }
        return String.valueOf((char) ((Number) arg).intValue());
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String arg = (String) args.get(0);
        if (arg == null) {
            return null;
        }
        return (long) arg.getBytes(StandardCharsets.UTF_8).length;
```

### ReturnNull
Return of `null`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
        String v1 = (String) args.get(0);
        if (v1 == null) {
            return null;
        }
        int v2 = ((Number) args.get(1)).intValue();
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                                isCancel.set(true);
                                if (e == null) {
                                    e =
                                            new IllegalStateException(
                                                    "cancellationFuture should be completed exceptionally");
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `num`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java
        Integer count =
                checkpointBarrierCounter.compute(
                        barrier.getId(), (id, num) -> num == null ? 1 : ++num);
        if (count != maxWriterSize) {
            return;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `count`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
        log.debug("seatunnel task ack barrier[{}]", this.taskLocation);
        Integer ackSize =
                cycleAcks.compute(barrier.getId(), (id, count) -> count == null ? 1 : ++count);
        if (ackSize == allCycles.size()) {
            if (barrier.prepareClose()) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `output` is redundant
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        FlinkRowConverter transformOutputRowConverter =
                new FlinkRowConverter(transform.getProducedType());
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
```

### UnnecessaryLocalVariable
Local variable `output` is redundant
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        FlinkRowConverter transformOutputRowConverter =
                new FlinkRowConverter(transform.getProducedType());
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
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
            boolean success = delete(client, file, recursive);
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
            boolean success = mkdirs(client, file, permission);
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
                List<BackendV2.BackendRowV2> backends = parseBackendV2(response, logger);
                return backends;
            } catch (DorisConnectorException e) {
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
                                endpoint, totalShards, successful));

                ScrollResult scrollResult = getDocsFromScrollResponse(responseJson);
                return scrollResult;
            } else {
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
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
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/source/BaseSeaTunnelSourceFunction.java`
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
            }
            while (!handover.isEmpty()) {
                Thread.sleep(CHECKPOINT_SLEEP_INTERVAL);
            }
            // Block #next() method
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

## RuleId[id=UnstableApiUsage]
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
'init(io.sentry.@org.jetbrains.annotations.NotNull SentryOptions)' is marked unstable with @ApiStatus.Internal
in `seatunnel-connectors-v2/connector-sentry/src/main/java/org/apache/seatunnel/connectors/seatunnel/sentry/sink/SentrySinkWriter.java`
#### Snippet
```java
                    pluginConfig.getBoolean(SentryConfig.ENABLE_EXTERNAL_CONFIGURATION.key()));
        }
        Sentry.init(options);
    }

```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
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

## RuleId[id=LoopStatementsThatDontLoop]
### LoopStatementsThatDontLoop
`while` statement does not loop
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
            DatabaseMetaData metaData, String table, String column) throws SQLException {
        try (ResultSet resultSet = metaData.getColumns(null, null, table, column)) {
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

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getBaseRule()` declared in class 'org.apache.seatunnel.connectors.cdc.base.option.SourceOptions' but referenced via subclass 'org.apache.seatunnel.connectors.cdc.base.option.JdbcSourceOptions'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlIncrementalSourceFactory.java`
#### Snippet
```java
    @Override
    public OptionRule optionRule() {
        return JdbcSourceOptions.getBaseRule()
                .required(
                        JdbcSourceOptions.USERNAME,
```

### StaticCallOnSubclass
Static method `getBaseRule()` declared in class 'org.apache.seatunnel.connectors.cdc.base.option.SourceOptions' but referenced via subclass 'org.apache.seatunnel.connectors.cdc.base.option.JdbcSourceOptions'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerIncrementalSourceFactory.java`
#### Snippet
```java
    @Override
    public OptionRule optionRule() {
        return JdbcSourceOptions.getBaseRule()
                .required(
                        JdbcSourceOptions.HOSTNAME,
```

### StaticCallOnSubclass
Static method `from()` declared in class 'java.util.Date' but referenced via subclass 'java.sql.Date'
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                return Timestamp.valueOf((LocalDateTime) field);
            case DATETIME:
                return Date.from(
                        ((LocalDateTime) field).atZone(ZoneId.systemDefault()).toInstant());
            case DATE:
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

## RuleId[id=ConfusingOctalEscape]
### ConfusingOctalEscape
Octal escape sequence `\000` immediately followed by a digit
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
public class StringFunction {
    private static final byte[] SOUNDEX_INDEX =
            "71237128722455712623718272\000\000\000\000\000\00071237128722455712623718272"
                    .getBytes(StandardCharsets.ISO_8859_1);

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `seatunnel-connectors-v2/connector-file/connector-file-sftp/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sftp/system/SFTPFileSystem.java`
#### Snippet
```java
            return new FileStatus[] {fileStat};
        }
        Vector<LsEntry> sftpFiles;
        try {
            sftpFiles = (Vector<LsEntry>) client.ls(absolute.toUri().getPath());
```

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

## RuleId[id=StringBufferReplaceableByString]
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
    private QueryPlan getQueryPlan(String querySQL, String httpNode) {
        String url =
                new StringBuilder("http://")
                        .append(httpNode)
                        .append("/api/")
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

## RuleId[id=UnnecessaryReturn]
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

## RuleId[id=NonShortCircuitBoolean]
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
                    throw new IOException(String.format(E_MAKE_DIR_FORPATH, pathName, parentDir));
                }
                created = created & succeeded;
            }
        } else if (isFile(client, absolute)) {
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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ErrorMessages` has no concrete subclass
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/ErrorMessages.java`
#### Snippet
```java
package org.apache.seatunnel.connectors.doris.util;

public abstract class ErrorMessages {
    public static final String PARSE_NUMBER_FAILED_MESSAGE =
            "Parse '{}' to number failed. Original string is '{}'.";
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Column`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/TableSchema.java`
#### Snippet
```java
        private final List<ConstraintKey> constraintKeys = new ArrayList<>();

        public Builder columns(List<Column> columns) {
            this.columns.addAll(columns);
            return this;
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
Can generalize to `? super Measurement`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/JobMetrics.java`
#### Snippet
```java
    }

    public JobMetrics filter(Predicate<Measurement> predicate) {
        Objects.requireNonNull(predicate, "predicate");

```

### BoundedWildcard
Can generalize to `? extends List`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/JobMetrics.java`
#### Snippet
```java
    }

    private JobMetrics(Map<String, List<Measurement>> metrics) {
        this.metrics = new HashMap<>(metrics);
    }
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
Can generalize to `? extends Option`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java

    public static String getOptionKeys(
            List<Option<?>> options, List<RequiredOption.BundledRequiredOptions> bundledOptions) {
        List<List<Option<?>>> optionList = new ArrayList<>();
        for (Option<?> option : options) {
```

### BoundedWildcard
Can generalize to `? extends RequiredOption.BundledRequiredOptions`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java

    public static String getOptionKeys(
            List<Option<?>> options, List<RequiredOption.BundledRequiredOptions> bundledOptions) {
        List<List<Option<?>>> optionList = new ArrayList<>();
        for (Option<?> option : options) {
```

### BoundedWildcard
Can generalize to `? extends Option`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionUtil.java`
#### Snippet
```java
    private OptionUtil() {}

    public static String getOptionKeys(List<Option<?>> options) {
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
```

### BoundedWildcard
Can generalize to `? super T`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionRule.java`
#### Snippet
```java

        public <T> Builder conditional(
                @NonNull Option<T> conditionalOption,
                @NonNull List<T> expectValues,
                @NonNull Option<?>... requiredOptions) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/OptionRule.java`
#### Snippet
```java
        public <T> Builder conditional(
                @NonNull Option<T> conditionalOption,
                @NonNull List<T> expectValues,
                @NonNull Option<?>... requiredOptions) {
            verifyConditionalExists(conditionalOption);
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    static Object flatteningMap(
            Object rawValue, Map<String, Object> newMap, List<String> keys, boolean nestedMap) {
        if (rawValue == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java
    }

    static <T> List<T> convertToList(Object rawValue, Class<T> clazz) {
        return Arrays.stream(rawValue.toString().split(","))
                .map(String::trim)
```

### BoundedWildcard
Can generalize to `? extends Path`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append comma-split paths option to StringBuilder */
    protected void appendPaths(List<String> commands, String option, List<Path> paths) {
        if (!paths.isEmpty()) {
            String values = paths.stream().map(Path::toString).collect(Collectors.joining(","));
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append appJar to StringBuilder */
    protected void appendAppJar(List<String> commands) {
        commands.add(
                Common.appStarterDir().resolve(EngineType.SPARK2.getStarterJarName()).toString());
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append option to StringBuilder */
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
```

### BoundedWildcard
Can generalize to `? extends Path`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append comma-split paths option to StringBuilder */
    protected void appendPaths(List<String> commands, String option, List<Path> paths) {
        if (!paths.isEmpty()) {
            String values = paths.stream().map(Path::toString).collect(Collectors.joining(","));
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append appJar to StringBuilder */
    protected void appendAppJar(List<String> commands) {
        commands.add(
                Common.appStarterDir().resolve(EngineType.SPARK3.getStarterJarName()).toString());
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SparkStarter.java`
#### Snippet
```java

    /** append option to StringBuilder */
    protected void appendOption(List<String> commands, String option, String value) {
        commands.add(option);
        commands.add("\"" + value.replace("\"", "\\\"") + "\"");
```

### BoundedWildcard
Can generalize to `? extends Map.Entry`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PropertiesParser.java`
#### Snippet
```java
    }

    private static <K, V> Map<Path, Object> getPathMap(Set<Map.Entry<K, V>> entries) {
        Map<Path, Object> pathMap = new LinkedHashMap<Path, Object>();
        for (Map.Entry<K, V> entry : entries) {
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

    public LogicalDagGenerator(
            @NonNull List<Action> actions,
            @NonNull JobConfig jobConfig,
            @NonNull IdGenerator idGenerator) {
```

### BoundedWildcard
Can generalize to `? super ClientMessage`
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelHazelcastClient.java`
#### Snippet
```java
            @NonNull UUID uuid,
            @NonNull ClientMessage request,
            @NonNull Function<ClientMessage, Object> decoder) {
        ClientInvocation invocation = new ClientInvocation(hazelcastClient, request, null, uuid);
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/PassiveCompletableFuture.java`
#### Snippet
```java
    public PassiveCompletableFuture() {}

    public PassiveCompletableFuture(CompletableFuture<T> chainedFuture) {
        if (chainedFuture != null) {
            chainedFuture.whenComplete(
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeaTunnelBaseClassLoader.java`
#### Snippet
```java

    protected SeaTunnelBaseClassLoader(
            URL[] urls, ClassLoader parent, Consumer<Throwable> classLoadingExceptionHandler) {
        super(urls, parent);
        this.classLoadingExceptionHandler = classLoadingExceptionHandler;
```

### BoundedWildcard
Can generalize to `? extends Action`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
    }

    private void fillUsedFactoryUrls(List<Action> actions, Set<URL> result) {
        actions.forEach(
                action -> {
```

### BoundedWildcard
Can generalize to `? super URL`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
    }

    private void fillUsedFactoryUrls(List<Action> actions, Set<URL> result) {
        actions.forEach(
                action -> {
```

### BoundedWildcard
Can generalize to `? extends List`>
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/MultipleTableJobConfigParser.java`
#### Snippet
```java
            Config sinkConfig,
            ClassLoader classLoader,
            Map<String, List<Tuple2<CatalogTable, Action>>> tableWithActionMap) {
        Map<TablePath, CatalogTable> tableMap =
                CatalogTableUtil.getCatalogTables(sinkConfig, classLoader).stream()
```

### BoundedWildcard
Can generalize to `? extends PhysicalVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java

    private void makeTasksFailed(
            @NonNull List<PhysicalVertex> physicalVertexList, @NonNull Address lostAddress) {
        physicalVertexList.forEach(
                physicalVertex -> {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
    private SlotProfile getOwnedSlotProfilesByTaskGroup(
            TaskGroupLocation taskGroupLocation,
            IMap<PipelineLocation, Map<TaskGroupLocation, SlotProfile>> ownedSlotProfilesIMap) {
        PipelineLocation pipelineLocation = taskGroupLocation.getPipelineLocation();
        if (ownedSlotProfilesIMap.containsKey(pipelineLocation)
```

### BoundedWildcard
Can generalize to `? super TaskGroupImmutableInformation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    private TaskDeployState deployInternal(
            Function<TaskGroupImmutableInformation, TaskDeployState> taskGroupConsumer) {
        TaskGroupImmutableInformation taskGroupImmutableInformation =
                getTaskGroupImmutableInformation();
```

### BoundedWildcard
Can generalize to `? extends TaskDeployState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java

    private TaskDeployState deployInternal(
            Function<TaskGroupImmutableInformation, TaskDeployState> taskGroupConsumer) {
        TaskGroupImmutableInformation taskGroupImmutableInformation =
                getTaskGroupImmutableInformation();
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
Can generalize to `? extends OneInputFlowLifeCycle`>
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelSourceCollector.java`
#### Snippet
```java
    public SeaTunnelSourceCollector(
            Object checkpointLock,
            List<OneInputFlowLifeCycle<Record<?>>> outputs,
            MetricsContext metricsContext) {
        this.checkpointLock = checkpointLock;
```

### BoundedWildcard
Can generalize to `? extends TaskExecutionState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    }

    private void addPhysicalVertexCallBack(PassiveCompletableFuture<TaskExecutionState> future) {
        future.thenAcceptAsync(
                executionState -> {
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java

    private static List<ExecutionEdge> findVertexRelatedEdge(
            List<ExecutionEdge> edges, ExecutionVertex vertex) {

        List<ExecutionEdge> sourceEdges =
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java

    /** If this execution vertex have partition transform, can't be spilt */
    private boolean checkCanSplit(List<ExecutionEdge> edges) {
        return edges.stream()
                        .noneMatch(e -> e.getRightVertex().getAction() instanceof ShuffleAction)
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
Can generalize to `? super List`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java

    private void splitUnionVertex(
            List<List<ExecutionEdge>> pipelines,
            List<ExecutionVertex> pipeline,
            ExecutionVertex currentVertex) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/PipelineGenerator.java`
#### Snippet
```java
    private final List<ExecutionEdge> edges;

    public PipelineGenerator(Collection<ExecutionVertex> vertices, List<ExecutionEdge> edges) {
        this.vertices = vertices;
        this.edges = edges;
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
Can generalize to `? super TaskExecutionState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                @NonNull CompletableFuture<Void> cancellationFuture,
                @NonNull TaskGroup taskGroup,
                @NonNull CompletableFuture<TaskExecutionState> future) {
            this.future = future;
            this.completionLatch = new AtomicInteger(taskGroup.getTasks().size());
```

### BoundedWildcard
Can generalize to `? extends Task`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

    private void submitBlockingTask(
            TaskGroupExecutionTracker taskGroupExecutionTracker, List<Task> tasks) {

        CountDownLatch startedLatch = new CountDownLatch(tasks.size());
```

### BoundedWildcard
Can generalize to `? extends Future`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                LinkedBlockingDeque<TaskTracker> taskqueue,
                RunBusWorkSupplier runBusWorkSupplier,
                BlockingQueue<Future<?>> futureBlockingQueue) {
            logger.info(String.format("Created new BusWork : %s", this.hashCode()));
            this.taskqueue = taskqueue;
```

### BoundedWildcard
Can generalize to `? extends Task`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java

    private void submitThreadShareTask(
            TaskGroupExecutionTracker taskGroupExecutionTracker, List<Task> tasks) {
        Stream<TaskTracker> taskTrackerStream =
                tasks.stream()
```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/TransformFlowLifeCycle.java`
#### Snippet
```java
            TransformChainAction<T> action,
            SeaTunnelTask runningTask,
            Collector<Record<?>> collector,
            CompletableFuture<Void> completableFuture) {
        super(action, runningTask, completableFuture);
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        log.debug("restoreState for sink agg committer [{}]", actionStateList);
        List<AggregatedCommitInfoT> aggregatedCommitInfos =
```

### BoundedWildcard
Can generalize to `? super TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    }

    private void sendToAllReader(Function<TaskLocation, Operation> function) {
        List<InvocationFuture<?>> futures = new ArrayList<>();
        taskMemberMapping.forEach(
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java
    }

    private void sendToAllReader(Function<TaskLocation, Operation> function) {
        List<InvocationFuture<?>> futures = new ArrayList<>();
        taskMemberMapping.forEach(
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SourceSplitEnumeratorTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        log.debug("restoreState for split enumerator [{}]", actionStateList);
        Optional<Serializable> state =
```

### BoundedWildcard
Can generalize to `? super InternalCheckpointListener`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
    }

    public void notifyAllAction(ConsumerWithException<InternalCheckpointListener> consumer) {
        allCycles.stream()
                .filter(cycle -> cycle instanceof InternalCheckpointListener)
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
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java

    @Override
    public void restoreState(List<ActionSubtaskState> actionStateList) throws Exception {
        log.debug("restoreState for SeaTunnelTask[{}]", actionStateList);
        Map<ActionStateKey, List<ActionSubtaskState>> stateMap =
```

### BoundedWildcard
Can generalize to `? extends RecordEvent`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/disruptor/RecordEventProducer.java`
#### Snippet
```java
    public static void onData(
            Record<?> record,
            RingBuffer<RecordEvent> ringBuffer,
            IntermediateQueueFlowLifeCycle intermediateQueueFlowLifeCycle) {

```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSourceFlowLifeCycle.java`
#### Snippet
```java

    @Override
    public void collect(Collector<Record<?>> collector) throws Exception {
        int emptyShuffleQueueCount = 0;

```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/IntermediateBlockingQueue.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:MagicNumber")
    @Override
    public void collect(Collector<Record<?>> collector) throws Exception {
        while (true) {
            Record<?> record = getIntermediateQueue().poll(100, TimeUnit.MILLISECONDS);
```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/IntermediateBlockingQueue.java`
#### Snippet
```java
    }

    private void handleRecord(Record<?> record, ConsumerWithException<Record<?>> consumer)
            throws Exception {
        if (record.getData() instanceof Barrier) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java

    private List<PhysicalVertex> getCommitterTask(
            List<ExecutionEdge> edges, int pipelineIndex, int totalPipelineNum) {
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        List<ExecutionEdge> collect =
```

### BoundedWildcard
Can generalize to `? extends SourceAction`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    private List<PhysicalVertex> getSourceTask(
            List<ExecutionEdge> edges,
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

    private List<SourceAction<?, ?, ?>> findSourceAction(List<ExecutionEdge> edges) {
        return edges.stream()
                .filter(s -> s.getLeftVertex().getAction() instanceof SourceAction)
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java
    }

    private List<Flow> getNextWrapper(List<ExecutionEdge> edges, Action start) {
        List<Action> actions =
                edges.stream()
```

### BoundedWildcard
Can generalize to `? extends SourceAction`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlanGenerator.java`
#### Snippet
```java

    private List<PhysicalVertex> getEnumeratorTask(
            List<SourceAction<?, ?, ?>> sources, int pipelineIndex, int totalPipelineNum) {
        AtomicInteger atomicInteger = new AtomicInteger(-1);

```

### BoundedWildcard
Can generalize to `? super Record`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/disruptor/RecordEventHandler.java`
#### Snippet
```java
    }

    private void handleRecord(Record<?> record, Collector<Record<?>> collector) throws Exception {
        if (record != null) {
            if (record.getData() instanceof Barrier) {
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
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
    private void fillChainedTransformExecutionVertex(
            ExecutionVertex currentVertex,
            Map<Long, Long> chainedTransformVerticesMapping,
            Map<Long, ExecutionVertex> transformChainVertexMap,
            Set<ExecutionEdge> executionEdges,
```

### BoundedWildcard
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
    private void fillChainedTransformExecutionVertex(
            ExecutionVertex currentVertex,
            Map<Long, Long> chainedTransformVerticesMapping,
            Map<Long, ExecutionVertex> transformChainVertexMap,
            Set<ExecutionEdge> executionEdges,
```

### BoundedWildcard
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            ExecutionVertex currentVertex,
            Map<Long, Long> chainedTransformVerticesMapping,
            Map<Long, ExecutionVertex> transformChainVertexMap,
            Set<ExecutionEdge> executionEdges,
            Map<Long, List<ExecutionVertex>> inputVerticesMap,
```

### BoundedWildcard
Can generalize to `? super ExecutionVertex`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            ExecutionVertex currentVertex,
            Map<Long, Long> chainedTransformVerticesMapping,
            Map<Long, ExecutionVertex> transformChainVertexMap,
            Set<ExecutionEdge> executionEdges,
            Map<Long, List<ExecutionVertex>> inputVerticesMap,
```

### BoundedWildcard
Can generalize to `? extends ExecutionEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
    }

    private List<Pipeline> generatePipelines(Set<ExecutionEdge> executionEdges) {
        Set<ExecutionVertex> executionVertices = new LinkedHashSet<>();
        for (ExecutionEdge edge : executionEdges) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            List<ExecutionVertex> chainedVertices,
            Set<ExecutionEdge> executionEdges,
            Map<Long, List<ExecutionVertex>> inputVerticesMap,
            Map<Long, List<ExecutionVertex>> targetVerticesMap) {
        Action action = currentVertex.getAction();
```

### BoundedWildcard
Can generalize to `? extends List`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
            Set<ExecutionEdge> executionEdges,
            Map<Long, List<ExecutionVertex>> inputVerticesMap,
            Map<Long, List<ExecutionVertex>> targetVerticesMap) {
        Action action = currentVertex.getAction();
        // Currently only support Transform action chaining.
```

### BoundedWildcard
Can generalize to `? extends LogicalEdge`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/ExecutionPlanGenerator.java`
#### Snippet
```java
    }

    private Set<ExecutionEdge> generateExecutionEdges(Set<LogicalEdge> logicalEdges) {
        Set<ExecutionEdge> executionEdges = new LinkedHashSet<>();

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
            Node node,
            Connection connection,
            Function<ClientMessage, P> decoder,
            Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);
```

### BoundedWildcard
Can generalize to `? extends P`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java
            Node node,
            Connection connection,
            Function<ClientMessage, P> decoder,
            Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);
```

### BoundedWildcard
Can generalize to `? super R`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/AbstractSeaTunnelMessageTask.java`
#### Snippet
```java
            Connection connection,
            Function<ClientMessage, P> decoder,
            Function<R, ClientMessage> encoder) {
        super(clientMessage, node, connection);

```

### BoundedWildcard
Can generalize to `? extends Map`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java

    public List<RawJobMetrics> getCurrJobMetrics(
            Collection<Map<TaskGroupLocation, SlotProfile>> groupLocations) {
        List<RawJobMetrics> metrics = new ArrayList<>();
        for (Map<TaskGroupLocation, SlotProfile> groupLocation : groupLocations) {
```

### BoundedWildcard
Can generalize to `? extends ActionStateKey`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java
        }

        public Builder pipelineActions(Map<ActionStateKey, Integer> pipelineActions) {
            this.pipelineActions.putAll(pipelineActions);
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
        private Builder() {}

        public Builder pipelineSubtasks(Set<TaskLocation> pipelineTaskIds) {
            this.pipelineSubtasks.addAll(pipelineTaskIds);
            return this;
```

### BoundedWildcard
Can generalize to `? extends TaskLocation`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java

        public Builder subtaskActions(
                Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions) {
            this.subtaskActions.putAll(subtaskActions);
            return this;
```

### BoundedWildcard
Can generalize to `? extends Set`>
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointPlan.java`
#### Snippet
```java

        public Builder subtaskActions(
                Map<TaskLocation, Set<Tuple2<ActionStateKey, Integer>>> subtaskActions) {
            this.subtaskActions.putAll(subtaskActions);
            return this;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java
    private final IMap<Integer, Long> checkpointIdMap;

    public IMapCheckpointIDCounter(Integer pipelineId, IMap<Integer, Long> checkpointIdMap) {
        this.pipelineId = pipelineId;
        this.checkpointIdMap = checkpointIdMap;
```

### BoundedWildcard
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
            Map<Long, JobMaster> runningJobMasterMap,
            IMap<Long, JobState> finishedJobStateImap,
            IMap<Long, JobMetrics> finishedJobMetricsImap,
            IMap<Long, JobDAGInfo> finishedJobVertexInfoImap) {
        this.runningJobStateIMap = runningJobStateIMap;
```

### BoundedWildcard
Can generalize to `? super Long`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
            IMap<Long, JobState> finishedJobStateImap,
            IMap<Long, JobMetrics> finishedJobMetricsImap,
            IMap<Long, JobDAGInfo> finishedJobVertexInfoImap) {
        this.runningJobStateIMap = runningJobStateIMap;
        this.logger = logger;
```

### BoundedWildcard
Can generalize to `? extends ActionSubtaskState`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/PendingCheckpoint.java`
#### Snippet
```java
    public void acknowledgeTask(
            TaskLocation taskLocation,
            List<ActionSubtaskState> states,
            SubtaskStatus subtaskStatus) {
        LOG.debug("acknowledgeTask states [{}]", states);
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
Can generalize to `? extends SlotProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java

    private void deployPipeline(
            @NonNull SubPlan pipeline, Map<TaskGroupLocation, SlotProfile> slotProfiles) {
        if (pipeline.updatePipelineState(PipelineStatus.SCHEDULED, PipelineStatus.DEPLOYING)) {

```

### BoundedWildcard
Can generalize to `? extends SlotProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java

    private SlotProfile getOrApplyResourceForTask(
            @NonNull PhysicalVertex task, Map<TaskGroupLocation, SlotProfile> ownedSlotProfiles) {

        SlotProfile oldProfile;
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

    private void startTriggerPendingCheckpoint(
            CompletableFuture<PendingCheckpoint> pendingCompletableFuture) {
        pendingCompletableFuture.thenAccept(
                pendingCheckpoint -> {
```

### BoundedWildcard
Can generalize to `? extends ResourceProfile`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java
    public ResourceRequestHandler(
            long jobId,
            List<ResourceProfile> resourceProfile,
            ConcurrentMap<Address, WorkerProfile> registerWorker,
            AbstractResourceManager resourceManager) {
```

### BoundedWildcard
Can generalize to `? super CommT`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkGlobalCommitter.java`
#### Snippet
```java
    private final SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter;

    FlinkGlobalCommitter(SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter) {
        this.aggregatedCommitter = aggregatedCommitter;
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    FlinkSinkWriter(
            org.apache.seatunnel.api.sink.SinkWriter<SeaTunnelRow, CommT, WriterStateT> sinkWriter,
            long checkpointId,
            SeaTunnelDataType<?> dataType) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelDataType`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
            Map<?, ?> mapData,
            MapType<?, ?> mapType,
            BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
```

### BoundedWildcard
Can generalize to `? super CommT`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkGlobalCommitter.java`
#### Snippet
```java
    private final SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter;

    FlinkGlobalCommitter(SinkAggregatedCommitter<CommT, GlobalCommT> aggregatedCommitter) {
        this.aggregatedCommitter = aggregatedCommitter;
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java

    FlinkSinkWriter(
            org.apache.seatunnel.api.sink.SinkWriter<SeaTunnelRow, CommT, WriterStateT> sinkWriter,
            long checkpointId,
            SeaTunnelDataType<?> dataType) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelDataType`
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/serialization/FlinkRowConverter.java`
#### Snippet
```java
            Map<?, ?> mapData,
            MapType<?, ?> mapType,
            BiFunction<Object, SeaTunnelDataType<?>, Object> convertFunction) {
        if (mapData == null || mapData.size() == 0) {
            return mapData;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriter.java`
#### Snippet
```java

    SparkDataWriter(
            SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
            @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
            SeaTunnelDataType<?> dataType,
```

### BoundedWildcard
Can generalize to `? super CommitInfoT`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriter.java`
#### Snippet
```java
    SparkDataWriter(
            SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
            @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
            SeaTunnelDataType<?> dataType,
            long epochId) {
```

### BoundedWildcard
Can generalize to `? super InternalRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowCollector.java`
#### Snippet
```java

    public InternalRowCollector(
            Handover<InternalRow> handover, Object checkpointLock, SeaTunnelDataType<?> dataType) {
        this.handover = handover;
        this.checkpointLock = checkpointLock;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkDataWriter.java`
#### Snippet
```java

    public SeaTunnelSparkDataWriter(
            SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
            @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
            SeaTunnelDataType<?> dataType,
```

### BoundedWildcard
Can generalize to `? super CommitInfoT`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkDataWriter.java`
#### Snippet
```java
    public SeaTunnelSparkDataWriter(
            SinkWriter<SeaTunnelRow, CommitInfoT, StateT> sinkWriter,
            @Nullable SinkCommitter<CommitInfoT> sinkCommitter,
            SeaTunnelDataType<?> dataType,
            long epochId) {
```

### BoundedWildcard
Can generalize to `? extends InternalRowCollector`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
    }

    private void internalCheckpoint(Iterator<InternalRowCollector> iterator, int loop)
            throws Exception {
        if (!iterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super InternalRow`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowCollector.java`
#### Snippet
```java

    public InternalRowCollector(
            Handover<InternalRow> handover, Object checkpointLock, SeaTunnelDataType<?> dataType) {
        this.handover = handover;
        this.checkpointLock = checkpointLock;
```

### BoundedWildcard
Can generalize to `? extends InternalRowCollector`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
    }

    private void internalCheckpoint(Iterator<InternalRowCollector> iterator, int loop)
            throws Exception {
        if (!iterator.hasNext()) {
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
            SourceSplitEnumerator.Context<SourceSplitBase> context, SplitAssigner splitAssigner) {
        this.context = context;
        this.splitAssigner = splitAssigner;
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/DebeziumJsonDeserializeSchema.java`
#### Snippet
```java

    @Override
    public void deserialize(SourceRecord record, Collector<SeaTunnelRow> out) throws Exception {
        SeaTunnelRow row = deserializationSchema.deserialize(record);
        out.collect(row);
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
Can generalize to `? extends SnapshotSplitWatermark`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/IncrementalSplitAssigner.java`
#### Snippet
```java

    @Override
    public void onCompletedSplits(List<SnapshotSplitWatermark> completedSplitWatermarks) {
        // do nothing
        completedSplitWatermarks.forEach(
```

### BoundedWildcard
Can generalize to `? extends BinlogOffset`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java
            JdbcConnection jdbc,
            String showMasterStmt,
            JdbcConnection.ResultSetMapper<BinlogOffset> function) {
        try {
            return jdbc.queryAndMap(
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializeSchema.java`
#### Snippet
```java

    @Override
    public void deserialize(SourceRecord record, Collector<SeaTunnelRow> collector)
            throws Exception {
        if (!isDataChangeRecord(record)) {
```

### BoundedWildcard
Can generalize to `? extends FakeSourceSplit`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<FakeSourceSplit> splits) {
        log.debug("reader {} add splits {}", context.getIndexOfSubtask(), splits);
        this.splits.addAll(splits);
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeDataGenerator.java`
#### Snippet
```java
     * @param output Data collection and distribution
     */
    public void collectFakedRows(int rowNum, Collector<SeaTunnelRow> output) {
        // Use manual configuration data preferentially
        if (fakeConfig.getFakeRows() != null) {
```

### BoundedWildcard
Can generalize to `? extends SnapshotSplitWatermark`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/enumerator/SnapshotSplitAssigner.java`
#### Snippet
```java

    @Override
    public void onCompletedSplits(List<SnapshotSplitWatermark> completedSplitWatermarks) {
        completedSplitWatermarks.forEach(
                m -> this.splitCompletedOffsets.put(m.getSplitId(), m.getHighWatermark()));
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
Can generalize to `? super TableId`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
            SqlServerConnection dataConnection,
            SqlServerConnection metadataConnection,
            EventDispatcher<TableId> dispatcher,
            ErrorHandler errorHandler,
            Clock clock,
```

### BoundedWildcard
Can generalize to `? extends SqlServerChangeTable`
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java

    private void migrateTable(
            final Queue<SqlServerChangeTable> schemaChangeCheckpoints,
            SqlServerOffsetContext offsetContext)
            throws InterruptedException, SQLException {
```

### BoundedWildcard
Can generalize to `? super FakeSourceSplit`
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceSplitEnumerator.java`
#### Snippet
```java

    public FakeSourceSplitEnumerator(
            SourceSplitEnumerator.Context<FakeSourceSplit> enumeratorContext,
            FakeConfig config,
            Set<FakeSourceSplit> assignedSplits) {
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
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/commit/FileSinkAggregatedCommitter.java`
#### Snippet
```java
    @Override
    public List<FileAggregatedCommitInfo> commit(
            List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        List<FileAggregatedCommitInfo> errorAggregatedCommitInfoList = new ArrayList<>();
        aggregatedCommitInfos.forEach(
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/JsonReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output)
            throws FileConnectorException, IOException {
        Configuration conf = getConfiguration();
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/TextReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output)
            throws FileConnectorException, IOException {
        Configuration conf = getConfiguration();
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
    public void read(String path, Collector<SeaTunnelRow> output)
            throws FileConnectorException, IOException {
        if (Boolean.FALSE.equals(checkFileType(path))) {
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
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/commit/HiveSinkAggregatedCommitter.java`
#### Snippet
```java
    @Override
    public List<FileAggregatedCommitInfo> commit(
            List<FileAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        HiveMetaStoreProxy hiveMetaStore = HiveMetaStoreProxy.getInstance(pluginConfig);
        List<FileAggregatedCommitInfo> errorCommitInfos = super.commit(aggregatedCommitInfos);
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/OrcReadStrategy.java`
#### Snippet
```java

    @Override
    public void read(String path, Collector<SeaTunnelRow> output)
            throws FileConnectorException, IOException {
        if (Boolean.FALSE.equals(checkFileType(path))) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/source/HttpSourceReader.java`
#### Snippet
```java
    }

    private List<Map<String, String>> parseToMap(List<List<String>> datas, JsonField jsonField) {
        List<Map<String, String>> decodeDatas = new ArrayList<>(datas.size());
        String[] keys = jsonField.getFields().keySet().toArray(new String[] {});
```

### BoundedWildcard
Can generalize to `? extends List`
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/source/HttpSourceReader.java`
#### Snippet
```java
    }

    private List<List<String>> dataFlip(List<List<String>> results) {

        List<List<String>> datas = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends JdbcSinkState`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcExactlyOnceSinkWriter.java`
#### Snippet
```java
            JdbcSinkConfig jdbcSinkConfig,
            SeaTunnelRowType rowType,
            List<JdbcSinkState> states) {
        checkArgument(
                jdbcSinkConfig.getJdbcConnectionConfig().getMaxRetries() == 0,
```

### BoundedWildcard
Can generalize to `? extends JdbcAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkAggregatedCommitter.java`
#### Snippet
```java
    @Override
    public List<JdbcAggregatedCommitInfo> commit(
            List<JdbcAggregatedCommitInfo> aggregatedCommitInfos) throws IOException {
        tryOpen();
        return aggregatedCommitInfos.stream()
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
Can generalize to `? extends XidInfo`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/sink/JdbcSinkCommitter.java`
#### Snippet
```java

    @Override
    public List<XidInfo> commit(List<XidInfo> committables) {
        return xaGroupOps
                .commit(
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
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlDataTypeConvertor.java`
#### Snippet
```java
    @Override
    public SeaTunnelDataType<?> toSeaTunnelType(
            MysqlType mysqlType, Map<String, Object> dataTypeProperties)
            throws DataTypeConvertException {
        checkNotNull(mysqlType, "mysqlType can not be null");
```

### BoundedWildcard
Can generalize to `? extends JdbcSourceSplit`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addPendingSplit(Collection<JdbcSourceSplit> splits) {
        int readerCount = enumeratorContext.currentParallelism();
        for (JdbcSourceSplit split : splits) {
```

### BoundedWildcard
Can generalize to `? extends ConstraintKey`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlCreateTableSqlBuilder.java`
#### Snippet
```java
    }

    public MysqlCreateTableSqlBuilder constraintKeys(List<ConstraintKey> constraintKeys) {
        this.constraintKeys = constraintKeys;
        return this;
```

### BoundedWildcard
Can generalize to `? extends Column`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MysqlCreateTableSqlBuilder.java`
#### Snippet
```java
    }

    public MysqlCreateTableSqlBuilder addColumn(List<Column> columns) {
        checkArgument(CollectionUtils.isNotEmpty(columns), "columns must not be empty");
        this.columns = columns;
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/redshift/RedshiftDataTypeConvertor.java`
#### Snippet
```java
    @Override
    public SeaTunnelDataType<?> toSeaTunnelType(
            String connectorDataType, Map<String, Object> dataTypeProperties)
            throws DataTypeConvertException {
        checkNotNull(connectorDataType, "redshiftType cannot be null");
```

### BoundedWildcard
Can generalize to `? extends E`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    }

    private E createAndOpenStatementExecutor(StatementExecutorFactory<E> statementExecutorFactory) {
        E exec = statementExecutorFactory.get();
        try {
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
    public void rollback(List<XidInfo> xids) {
        for (XidInfo x : xids) {
            xaFacade.rollback(x.getXid());
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
Can generalize to `? extends ColumnSchema`
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduTypeMapper.java`
#### Snippet
```java
    private static final int PRECISION = 20;

    public static SeaTunnelDataType<?> mapping(List<ColumnSchema> columnSchemaList, int colIndex)
            throws SQLException {
        String kuduType = columnSchemaList.get(colIndex).getType().getName().toUpperCase();
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/FieldNamedPreparedStatement.java`
#### Snippet
```java
    }

    public static String parseNamedStatement(String sql, Map<String, List<Integer>> paramMap) {
        StringBuilder parsedSql = new StringBuilder();
        int fieldIndex = 1; // SQL statement parameter index starts from 1
```

### BoundedWildcard
Can generalize to `? extends DorisCommitInfo`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/committer/DorisCommitter.java`
#### Snippet
```java

    @Override
    public List<DorisCommitInfo> commit(List<DorisCommitInfo> commitInfos) throws IOException {
        for (DorisCommitInfo commitInfo : commitInfos) {
            commitTransaction(commitInfo);
```

### BoundedWildcard
Can generalize to `? extends DorisCommitInfo`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/committer/DorisCommitter.java`
#### Snippet
```java

    @Override
    public void abort(List<DorisCommitInfo> commitInfos) throws IOException {
        for (DorisCommitInfo commitInfo : commitInfos) {
            abortTransaction(commitInfo);
```

### BoundedWildcard
Can generalize to `? extends BackendV2.BackendRowV2`
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisSinkWriter.java`
#### Snippet
```java

    @VisibleForTesting
    public void setBackends(List<BackendV2.BackendRowV2> backends) {
        this.backends = backends;
    }
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
Can generalize to `? extends KafkaSourceSplit`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<KafkaSourceSplit> splits) {
        running = true;
        splits.forEach(
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-neo4j/src/main/java/org/apache/seatunnel/connectors/seatunnel/neo4j/source/Neo4jSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        final Query query = new Query(neo4jSourceQueryInfo.getQuery());
        session.readTransaction(
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
            throw new UnsupportedOperationException(
```

### BoundedWildcard
Can generalize to `? extends AssertFieldRule.AssertRule`
in `seatunnel-connectors-v2/connector-assert/src/main/java/org/apache/seatunnel/connectors/seatunnel/assertion/sink/AssertSinkWriter.java`
#### Snippet
```java
            SeaTunnelRowType seaTunnelRowType,
            List<AssertFieldRule> assertFieldRules,
            List<AssertFieldRule.AssertRule> assertRowRules) {
        this.seaTunnelRowType = seaTunnelRowType;
        this.assertFieldRules = assertFieldRules;
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
Can generalize to `? extends RecordsWithSplitIds`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/SourceReaderBase.java`
#### Snippet
```java

    public SourceReaderBase(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            SplitFetcherManager<E, SplitT> splitFetcherManager,
            RecordEmitter<E, T, SplitStateT> recordEmitter,
```

### BoundedWildcard
Can generalize to `? extends SplitReader`
in `seatunnel-connectors-v2/connector-common/src/main/java/org/apache/seatunnel/connectors/seatunnel/common/source/reader/fetcher/SplitFetcherManager.java`
#### Snippet
```java
    public SplitFetcherManager(
            BlockingQueue<RecordsWithSplitIds<E>> elementsQueue,
            Supplier<SplitReader<E, SplitT>> splitReaderFactory,
            Consumer<Collection<String>> splitFinishedHook) {
        this.fetchers = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends KafkaSourceSplit`
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java

    private Map<TopicPartition, ? extends KafkaSourceSplit> convertToNextSplit(
            List<KafkaSourceSplit> splits) {
        try {
            Map<TopicPartition, Long> listOffsets =
```

### BoundedWildcard
Can generalize to `? extends PulsarPartitionSplit`
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/reader/PulsarSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<PulsarPartitionSplit> splits) {
        splits.forEach(
                split -> {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-socket/src/main/java/org/apache/seatunnel/connectors/seatunnel/socket/source/SocketSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader reader =
```

### BoundedWildcard
Can generalize to `? super PulsarPartitionSplit`
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java

    public PulsarSplitEnumerator(
            SourceSplitEnumerator.Context<PulsarPartitionSplit> context,
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
                pendingSplit != null;
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
        try (MongoCursor<Document> mongoCursor =
                client.getDatabase(params.getDatabase())
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/source/OpenMldbSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        int totalFields = seaTunnelRowType.getTotalFields();
        Object[] objects = new Object[totalFields];
```

### BoundedWildcard
Can generalize to `? extends Column`
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/source/OpenMldbSource.java`
#### Snippet
```java
    }

    private SeaTunnelRowType convert(List<Column> columnList) {
        String[] fieldsName = new String[columnList.size()];
        SeaTunnelDataType<?>[] fieldsType = new SeaTunnelDataType<?>[columnList.size()];
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
    public void notifyCheckpointComplete(long checkpointId) {}

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
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceReader.java`
#### Snippet
```java
    }

    private void read(TDengineSourceSplit split, Collector<SeaTunnelRow> output) throws Exception {
        try (Statement statement = conn.createStatement()) {
            final ResultSet resultSet = statement.executeQuery(split.getQuery());
```

### BoundedWildcard
Can generalize to `? extends TDengineSourceSplit`
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<TDengineSourceSplit> splits) {
        sourceSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/source/CassandraSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        try {
            ResultSet resultSet =
```

### BoundedWildcard
Can generalize to `? extends TDengineSourceSplit`
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplitEnumerator.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(List<TDengineSourceSplit> splits, int subtaskId) {
        if (!splits.isEmpty()) {
            pendingSplit.addAll(splits);
```

### BoundedWildcard
Can generalize to `? super TDengineSourceSplit`
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSourceSplitEnumerator.java`
#### Snippet
```java
            TDengineSourceConfig config,
            TDengineSourceState sourceState,
            SourceSplitEnumerator.Context<TDengineSourceSplit> context) {
        this.config = config;
        this.context = context;
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/util/CreateTableParser.java`
#### Snippet
```java

    private static void parseColumn(
            String columnString, Map<String, ColumnInfo> columnList, int index) {
        Matcher matcher = COLUMN_PATTERN.matcher(columnString.trim());
        if (matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? super ColumnInfo`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/util/CreateTableParser.java`
#### Snippet
```java

    private static void parseColumn(
            String columnString, Map<String, ColumnInfo> columnList, int index) {
        Matcher matcher = COLUMN_PATTERN.matcher(columnString.trim());
        if (matcher.matches()) {
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSourceReader.java`
#### Snippet
```java
    }

    private void read(StarRocksSourceSplit split, Collector<SeaTunnelRow> output) {
        StarRocksBeReadClient client =
                new StarRocksBeReadClient(split.getPartition(), sourceConfig, seaTunnelRowType);
```

### BoundedWildcard
Can generalize to `? extends StarRocksSourceSplit`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StarRocksSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<StarRocksSourceSplit> splits) {
        pendingSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksDataTypeConvertor.java`
#### Snippet
```java
    @Override
    public SeaTunnelDataType<?> toSeaTunnelType(
            MysqlType mysqlType, Map<String, Object> dataTypeProperties)
            throws DataTypeConvertException {
        checkNotNull(mysqlType, "mysqlType can not be null");
```

### BoundedWildcard
Can generalize to `? extends CKFileCommitInfo`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkAggCommitter.java`
#### Snippet
```java

    @Override
    public CKFileAggCommitInfo combine(List<CKFileCommitInfo> commitInfos) {
        Map<Shard, List<String>> files = new HashMap<>();
        commitInfos.forEach(
```

### BoundedWildcard
Can generalize to `? extends CKFileAggCommitInfo`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/file/ClickhouseFileSinkAggCommitter.java`
#### Snippet
```java

    @Override
    public List<CKFileAggCommitInfo> commit(List<CKFileAggCommitInfo> aggregatedCommitInfo)
            throws IOException {
        aggregatedCommitInfo.forEach(
```

### BoundedWildcard
Can generalize to `? extends StarRocksSourceSplit`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addPendingSplit(Collection<StarRocksSourceSplit> splits) {
        int readerCount = context.currentParallelism();
        for (StarRocksSourceSplit split : splits) {
```

### BoundedWildcard
Can generalize to `? super String`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/FieldNamedPreparedStatement.java`
#### Snippet
```java
    }

    public static String parseNamedStatement(String sql, Map<String, List<Integer>> paramMap) {
        StringBuilder parsedSql = new StringBuilder();
        int fieldIndex = 1; // SQL statement parameter index starts from 1
```

### BoundedWildcard
Can generalize to `? extends ClickHouseNode`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/source/ClickhouseSourceReader.java`
#### Snippet
```java

    ClickhouseSourceReader(
            List<ClickHouseNode> servers,
            SourceReader.Context readerContext,
            SeaTunnelRowType rowTypeInfo,
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        sourceSplits.forEach(
                source -> {
```

### BoundedWildcard
Can generalize to `? extends MaxcomputeSourceSplit`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceReader.java`
#### Snippet
```java

    @Override
    public void addSplits(List<MaxcomputeSourceSplit> splits) {
        sourceSplits.addAll(splits);
    }
```

### BoundedWildcard
Can generalize to `? extends MaxcomputeSourceSplit`
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/source/MaxcomputeSourceSplitEnumerator.java`
#### Snippet
```java
    }

    private void addSplitChangeToPendingAssignments(Collection<MaxcomputeSourceSplit> newSplits) {
        for (MaxcomputeSourceSplit split : newSplits) {
            int ownerReader = split.getSplitId() % enumeratorContext.currentParallelism();
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/commit/S3RedshiftSinkAggregatedCommitter.java`
#### Snippet
```java
    @Override
    public List<FileAggregatedCommitInfo> commit(
            List<FileAggregatedCommitInfo> aggregatedCommitInfos) {
        List<FileAggregatedCommitInfo> errorAggregatedCommitInfoList = new ArrayList<>();
        aggregatedCommitInfos.forEach(
```

### BoundedWildcard
Can generalize to `? extends FileAggregatedCommitInfo`
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/commit/S3RedshiftSinkAggregatedCommitter.java`
#### Snippet
```java

    @Override
    public void abort(List<FileAggregatedCommitInfo> aggregatedCommitInfos) {
        if (aggregatedCommitInfos == null || aggregatedCommitInfos.isEmpty()) {
            return;
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
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java

    private void outputFromScrollResult(
            ScrollResult scrollResult, List<String> source, Collector<SeaTunnelRow> output) {
        for (Map<String, Object> doc : scrollResult.getDocs()) {
            SeaTunnelRow seaTunnelRow =
```

### BoundedWildcard
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/source/SheetsSourceReader.java`
#### Snippet
```java

    @Override
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        final NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        Sheets service =
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
Can generalize to `? super SeaTunnelRow`
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/source/AmazonDynamoDBSourceReader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("magicnumber")
    public void pollNext(Collector<SeaTunnelRow> output) throws Exception {
        ScanResponse scan =
                dynamoDbClient.scan(
```

### BoundedWildcard
Can generalize to `? extends SelectDBCommitInfo`
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/committer/SelectDBCommitter.java`
#### Snippet
```java

    @Override
    public List<SelectDBCommitInfo> commit(List<SelectDBCommitInfo> commitInfos)
            throws IOException {
        for (SelectDBCommitInfo committable : commitInfos) {
```

### BoundedWildcard
Can generalize to `? super ClassLoader`
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            Path pluginDir,
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
            Path pluginDir,
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
    public List<T> getAllPlugins(List<PluginIdentifier> pluginIdentifiers) {
        return pluginIdentifiers.stream()
                .map(this::createPluginInstance)
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private @Nullable`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkWriterCommitMessage.java`
#### Snippet
```java
public class SparkWriterCommitMessage<T> implements WriterCommitMessage {

    private @Nullable T message;

    SparkWriterCommitMessage(T message) {
```

### MissortedModifiers
Missorted modifiers `private @Nonnull`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataSourceWriter.java`
#### Snippet
```java
    /** {@link SparkDataWriter#commit()} */
    @SuppressWarnings("unchecked")
    private @Nonnull List<AggregatedCommitInfoT> combineCommitMessage(
            WriterCommitMessage[] messages) {
        if (sinkAggregatedCommitter == null || messages.length == 0) {
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/write/SeaTunnelSparkWriterCommitMessage.java`
#### Snippet
```java
public class SeaTunnelSparkWriterCommitMessage<T> implements WriterCommitMessage {

    private @Nullable T message;

    SeaTunnelSparkWriterCommitMessage(T message) {
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

## RuleId[id=UnnecessarySuperQualifier]
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
        return new HttpSinkWriter(
                seaTunnelRowType,
                super.httpParameter,
                new WeChatBotMessageSerializationSchema(
                        new WeChatSinkConfig(pluginConfig), seaTunnelRowType));
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

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/DataTypeConvertorFactory.java`
#### Snippet
```java
        ServiceLoader.load(DataTypeConvertor.class, classLoader)
                .forEach(
                        dataTypeConvertor -> {
                            dataTypeConvertorMap.put(
                                    dataTypeConvertor.getIdentity().toUpperCase(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/ConfigShadeUtils.java`
#### Snippet
```java
        Iterator<ConfigShade> it = serviceLoader.iterator();
        it.forEachRemaining(
                configShade -> {
                    CONFIG_SHADES.put(configShade.getIdentifier(), configShade);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/config/TypesafeConfigUtils.java`
#### Snippet
```java
        config.entrySet()
                .forEach(
                        entry -> {
                            configMap.put(entry.getKey(), entry.getValue().unwrapped().toString());
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
        Address lostAddress = event.getMember().getAddress();
        runningJobMasterMap.forEach(
                (aLong, jobMaster) -> {
                    jobMaster
                            .getPhysicalPlan()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/DAGUtils.java`
#### Snippet
```java
                        pipeline.getVertexes()
                                .forEach(
                                        (id, vertex) -> {
                                            vertexInfoMap.put(
                                                    id,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java
    public synchronized PassiveCompletableFuture<PipelineExecutionState> initStateFuture() {
        physicalVertexList.forEach(
                physicalVertex -> {
                    addPhysicalVertexCallBack(physicalVertex.initStateFuture());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/SubPlan.java`
#### Snippet
```java

        coordinatorVertexList.forEach(
                coordinator -> {
                    addPhysicalVertexCallBack(coordinator.initStateFuture());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/TaskExecutionService.java`
#### Snippet
```java
                    nodeEngine.getHazelcastInstance().getMap(Constant.IMAP_RUNNING_JOB_METRICS);
            contextMap.forEach(
                    (taskGroupLocation, taskGroupContext) -> {
                        taskGroupContext
                                .getTaskGroup()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/GetJobMetricsOperation.java`
#### Snippet
```java
                CompletableFuture.supplyAsync(
                        () -> {
                            return service.getCoordinatorService()
                                    .getJobMetrics(jobId)
                                    .toJsonString();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/GetJobDetailStatusOperation.java`
#### Snippet
```java
                CompletableFuture.supplyAsync(
                        () -> {
                            return service.getCoordinatorService()
                                    .getJobHistoryService()
                                    .getJobDetailStateAsString(jobId);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/ListJobStatusOperation.java`
#### Snippet
```java
                CompletableFuture.supplyAsync(
                        () -> {
                            return service.getCoordinatorService()
                                    .getJobHistoryService()
                                    .listAllJob();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/operation/GetJobStatusOperation.java`
#### Snippet
```java
                CompletableFuture.supplyAsync(
                        () -> {
                            return service.getCoordinatorService().getJobStatus(jobId);
                        },
                        getNodeEngine()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobMaster.java`
#### Snippet
```java
                    .filter(
                            taskLocation -> {
                                return taskLocation
                                        .getTaskGroupLocation()
                                        .getPipelineLocation()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/IMapCheckpointIDCounter.java`
#### Snippet
```java
        RetryUtils.retryWithException(
                () -> {
                    return checkpointIdMap.putIfAbsent(pipelineId, INITIAL_CHECKPOINT_ID);
                },
                new RetryUtils.RetryMaterial(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
                                        sendToMember(new SyncWorkerProfileOperation(), worker)
                                                .thenAccept(
                                                        p -> {
                                                            registerWorker.put(
                                                                    worker, (WorkerProfile) p);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            // deploy pipeline
            return CompletableFuture.runAsync(
                    () -> {
                        deployPipeline(pipeline, slotProfiles);
                    },
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        pipeline.getCoordinatorVertexList()
                .forEach(
                        coordinator -> {
                            makeTaskFailed(coordinator.getTaskGroupLocation(), e);
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
        pipeline.getPhysicalVertexList()
                .forEach(
                        task -> {
                            makeTaskFailed(task.getTaskGroupLocation(), e);
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java
                .filter(Objects::nonNull)
                .forEach(
                        profile -> {
                            resourceManager.releaseResource(jobId, profile);
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-translation/seatunnel-translation-base/src/main/java/org/apache/seatunnel/translation/source/CoordinatedSource.java`
#### Snippet
```java
        splitEnumerator.open();
        restoredSplitStateMap.forEach(
                (subtaskId, splits) -> {
                    splitEnumerator.addSplitsBack(splits, subtaskId);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/config/SqlServerSourceConfigFactory.java`
#### Snippet
```java
                            .map(
                                    tableStr -> {
                                        return tableStr.substring(tableStr.indexOf(".") + 1);
                                    })
                            .collect(Collectors.joining(",")));
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
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseProxy.java`
#### Snippet
```java
            response.records()
                    .forEach(
                            r -> {
                                shardList.add(
                                        new Shard(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/source/AmazonDynamoDBSourceReader.java`
#### Snippet
```java
            scan.items()
                    .forEach(
                            item -> {
                                output.collect(seaTunnelRowDeserializer.deserialize(item));
                            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-connectors-v2/connector-amazondynamodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/amazondynamodb/serialize/DefaultSeaTunnelRowDeserializer.java`
#### Snippet
```java
                        .m()
                        .forEach(
                                (s, attributeValueInfo) -> {
                                    seatunnelMap.put(
                                            s,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
                    .entrySet()
                    .forEach(
                            entry -> {
                                pluginIdentifiers.put(
                                        PluginIdentifier.of(
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

## RuleId[id=UseOfPropertiesAsHashtable]
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
            Session session =
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/sink/EmailSinkWriter.java`
#### Snippet
```java
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
            Session session =
                    Session.getDefaultInstance(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/config/DorisConfig.java`
#### Snippet
```java
                            (key, value) -> {
                                final String configKey = key.toLowerCase();
                                streamLoadProps.put(configKey, value.unwrapped().toString());
                            });
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
            pluginConfig
                    .getObject(KAFKA_CONFIG.key())
                    .forEach((key, value) -> kafkaProperties.put(key, value.unwrapped()));
        }
        if (pluginConfig.hasPath(ASSIGN_PARTITIONS.key())) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        }
        if (pluginConfig.hasPath(ASSIGN_PARTITIONS.key())) {
            kafkaProperties.put(
                    ProducerConfig.PARTITIONER_CLASS_CONFIG,
                    "org.apache.seatunnel.connectors.seatunnel.kafka.sink.MessageContentPartitioner");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
                    "org.apache.seatunnel.connectors.seatunnel.kafka.sink.MessageContentPartitioner");
        }
        kafkaProperties.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                pluginConfig.getString(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG));
        kafkaProperties.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProperties.put(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java
        kafkaProperties.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        kafkaProperties.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class.getName());
        return kafkaProperties;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaTransactionSender.java`
#### Snippet
```java
            Properties properties, String transactionId) {
        Properties transactionProperties = (Properties) properties.clone();
        transactionProperties.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionId);
        KafkaInternalProducer<K, V> transactionProducer =
                new KafkaInternalProducer<>(transactionProperties, transactionId);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaConsumerThread.java`
#### Snippet
```java
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, consumerGroup);
        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        if (this.metadata.getProperties().get("client.id") == null) {
            props.setProperty(
                    ConsumerConfig.CLIENT_ID_CONFIG,
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaConsumerThread.java`
#### Snippet
```java
            props.setProperty(
                    ConsumerConfig.CLIENT_ID_CONFIG,
                    this.metadata.getProperties().get("client.id").toString());
        }
        props.setProperty(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSource.java`
#### Snippet
```java
                    .forEach(
                            (key, value) ->
                                    this.metadata.getProperties().put(key, value.unwrapped()));
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/catalog/KafkaCatalog.java`
#### Snippet
```java
    public void open() throws CatalogException {
        Properties properties = new Properties();
        properties.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);

        adminClient = AdminClient.create(properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
        props.setProperty(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, this.metadata.getBootstrapServers());
        if (this.metadata.getProperties().get("client.id") == null) {
            props.setProperty(
                    ConsumerConfig.CLIENT_ID_CONFIG,
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
            props.setProperty(
                    ConsumerConfig.CLIENT_ID_CONFIG,
                    this.metadata.getProperties().get("client.id").toString());
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSink.java`
#### Snippet
```java
                    .forEach(
                            (key, value) ->
                                    clickhouseProperties.put(
                                            key, String.valueOf(value.unwrapped())));
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

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/CopySQLBuilder.java`
#### Snippet
```java

        // copy into must be sync
        properties.put(COPY_SYNC, false);
        if (selectdbConfig.getEnableDelete()) {
            properties.put(COPY_DELETE, true);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/CopySQLBuilder.java`
#### Snippet
```java
        properties.put(COPY_SYNC, false);
        if (selectdbConfig.getEnableDelete()) {
            properties.put(COPY_DELETE, true);
        }
        StringJoiner props = new StringJoiner(",");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/config/SelectDBConfig.java`
#### Snippet
```java
                            (key, value) -> {
                                final String configKey = key.toLowerCase();
                                stageLoadProps.put(configKey, value.unwrapped().toString());
                            });
        }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/FactoryUtil.java`
#### Snippet
```java
    }

    private static void validateAndApplyMetadata(
            List<CatalogTable> catalogTables, TableSource<?, ?, ?> tableSource) {
        // TODO: handle reading metadata
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/transform/Collector.java`
#### Snippet
```java

    /** Closes the collector. If any data was buffered, that data will be flushed. */
    void close();
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
    /** Custom validator to validate the row value. */
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

    /** Wake up the split reader in case the fetcher thread is blocking in {@link #fetch()}. */
    void wakeUp();

    /**
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/DorisSerializer.java`
#### Snippet
```java
public interface DorisSerializer extends Serializable {

    void open() throws IOException;

    byte[] serialize(SeaTunnelRow seaTunnelRow) throws IOException;
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/serialize/DorisSerializer.java`
#### Snippet
```java
    byte[] serialize(SeaTunnelRow seaTunnelRow) throws IOException;

    void close() throws IOException;
}

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
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SelectDBSerializer.java`
#### Snippet
```java
public interface SelectDBSerializer extends Serializable {

    void open() throws IOException;

    byte[] serialize(SeaTunnelRow seaTunnelRow) throws IOException;
```

### EmptyMethod
All implementations of this method are empty
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/serialize/SelectDBSerializer.java`
#### Snippet
```java
    byte[] serialize(SeaTunnelRow seaTunnelRow) throws IOException;

    void close() throws IOException;
}

```

### EmptyMethod
The method is empty
in `seatunnel-connectors-v2/connector-slack/src/main/java/org/apache/seatunnel/connectors/seatunnel/slack/client/SlackClient.java`
#### Snippet
```java

    /** Close Conversion */
    public void closeMethodClient() {}
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
        // TODO seaTunnelServer after start in here
    }
```

### EmptyMethod
The method is empty
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/NodeExtensionCommon.java`
#### Snippet
```java
    }

    void onClusterStateChange(ClusterState ignored) {
        // TODO This is where cluster state changes are handled
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public DataWriterFactory<InternalRow> createWriterFactory() {
        return super.createWriterFactory();
    }
```

### EmptyMethod
Method only calls its super
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkStreamWriter.java`
#### Snippet
```java

    @Override
    public boolean useCommitCoordinator() {
        return StreamWriter.super.useCommitCoordinator();
    }
```

## RuleId[id=RedundantFieldInitialization]
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
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/Condition.java`
#### Snippet
```java
    private final T expectValue;
    private Boolean and = null;
    private Condition<?> next = null;

    Condition(Option<T> option, T expectValue) {
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
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/args/ClientCommandArgs.java`
#### Snippet
```java
            names = {"-l", "--list"},
            description = "list job status")
    private boolean listJob = false;

    @Parameter(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/CommandArgs.java`
#### Snippet
```java
            help = true,
            description = "Show the usage message")
    protected boolean help = false;

    /** Undefined parameters parsed will be stored here as engine original command parameters. */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/AbstractCommandArgs.java`
#### Snippet
```java
            description =
                    "Decrypt config file, When both --decrypt and --encrypt are specified, only --encrypt will take effect")
    protected boolean decrypt = false;

    public abstract DeployMode getDeployMode();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/AbstractCommandArgs.java`
#### Snippet
```java
            names = {"--check"},
            description = "Whether check config")
    protected boolean checkConfig = false;

    /** SeaTunnel job name */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/command/AbstractCommandArgs.java`
#### Snippet
```java
            description =
                    "Encrypt config file, when both --decrypt and --encrypt are specified, only --encrypt will take effect")
    protected boolean encrypt = false;

    @Parameter(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
public class FlinkRuntimeEnvironment implements RuntimeEnvironment {
    private static final String RESULT_TABLE_NAME = "result_table_name";
    private static volatile FlinkRuntimeEnvironment INSTANCE = null;
    private Config config;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkRuntimeEnvironment.java`
#### Snippet
```java
public class FlinkRuntimeEnvironment implements RuntimeEnvironment {
    private static final String RESULT_TABLE_NAME = "result_table_name";
    private static volatile FlinkRuntimeEnvironment INSTANCE = null;
    private Config config;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    private static final long DEFAULT_SPARK_STREAMING_DURATION = 5;
    private static final String PLUGIN_NAME_KEY = "plugin_name";
    private static volatile SparkRuntimeEnvironment INSTANCE = null;

    private SparkConf sparkConf;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    private Config config;

    private boolean enableHive = false;

    private JobMode jobMode;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    private Config config;

    private boolean enableHive = false;

    private JobMode jobMode;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkRuntimeEnvironment.java`
#### Snippet
```java
    private static final long DEFAULT_SPARK_STREAMING_DURATION = 5;
    private static final String PLUGIN_NAME_KEY = "plugin_name";
    private static volatile SparkRuntimeEnvironment INSTANCE = null;

    private SparkConf sparkConf;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/config/Common.java`
#### Snippet
```java
    private static String SEATUNNEL_HOME;

    private static boolean STARTER = false;

    /** Set mode. return false in case of failure */
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

    /** If this node is a master node */
    private volatile boolean isActive = false;

    private final ExecutorService executorService;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/TaskGroupWithIntermediateBlockingQueue.java`
#### Snippet
```java
    }

    private Map<Long, BlockingQueue<Record<?>>> blockingQueueCache = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/TaskGroupWithIntermediateDisruptor.java`
#### Snippet
```java
    }

    private Map<Long, Disruptor<RecordEvent>> disruptor = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/flow/ShuffleSourceFlowLifeCycle.java`
#### Snippet
```java
    private final Map<Integer, Barrier> alignedBarriers = new HashMap<>();
    private long currentCheckpointId = Long.MAX_VALUE;
    private int alignedBarriersCounter = 0;

    public ShuffleSourceFlowLifeCycle(
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

    // TODO add config to change value
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/future/RequestFuture.java`
#### Snippet
```java
    private CountDownLatch latch = new CountDownLatch(1);

    private boolean success = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/checkpoint/CheckpointCoordinator.java`
#### Snippet
```java
    private volatile boolean shutdown;

    private volatile boolean isAllTaskReady = false;

    private final ExecutorService executorService;
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
Field initialization to `false` is redundant
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/disruptor/WALDisruptor.java`
#### Snippet
```java
    private static final int DEFAULT_CLOSE_WAIT_TIME_SECONDS = 5;

    private boolean isClosed = false;

    private static final EventTranslatorThreeArg<FileWALEvent, IMapFileData, WALEventType, Long>
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/IMapFileStorage.java`
#### Snippet
```java
    Serializer serializer;

    private String businessRootPath = null;

    public static final int DEFAULT_ARCHIVE_WAIT_TIME_MILLISECONDS = 1000 * 60;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
        private String database = null;

        private String table = null;

        private final SeaTunnelRowType physicalDataType;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
        private boolean ignoreParseErrors = false;

        private String database = null;

        private String table = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonDeserializationSchema.java`
#### Snippet
```java
    public static class Builder {

        private boolean ignoreParseErrors = false;

        private String database = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
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

    public ParallelEnumeratorContext(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-15/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkWriterState.java`
#### Snippet
```java
public class FlinkWriterState<StateT> implements Serializable {

    private long checkpointId = 0;

    private StateT state;
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/reader/fetch/binlog/MySqlBinlogFetchTask.java`
#### Snippet
```java
public class MySqlBinlogFetchTask implements FetchTask<SourceSplitBase> {
    private final IncrementalSplit split;
    private volatile boolean taskRunning = false;

    public MySqlBinlogFetchTask(IncrementalSplit split) {
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/transactionlog/SqlServerTransactionLogFetchTask.java`
#### Snippet
```java
public class SqlServerTransactionLogFetchTask implements FetchTask<SourceSplitBase> {
    private final IncrementalSplit split;
    private volatile boolean taskRunning = false;

    public SqlServerTransactionLogFetchTask(IncrementalSplit split) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/reader/fetch/scan/SqlServerSnapshotFetchTask.java`
#### Snippet
```java
    private final SnapshotSplit split;

    private volatile boolean taskRunning = false;

    private SqlServerSnapshotSplitReadTask snapshotSplitReadTask;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/source/FakeSourceReader.java`
#### Snippet
```java
    private final FakeDataGenerator fakeDataGenerator;
    private volatile boolean noMoreSplit;
    private volatile long latestTimestamp = 0;

    public FakeSourceReader(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
    protected int partId = 0;
    protected int batchSize;
    protected int currentBatchSize = 0;
    protected boolean isKerberosAuthorization = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
    // Checkpoint id from engine is start with 1
    protected Long checkpointId = 0L;
    protected int partId = 0;
    protected int batchSize;
    protected int currentBatchSize = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
    protected int batchSize;
    protected int currentBatchSize = 0;
    protected boolean isKerberosAuthorization = false;

    public AbstractWriteStrategy(FileSinkConfig fileSinkConfig) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/source/reader/AbstractReadStrategy.java`
#### Snippet
```java
    protected boolean isMergePartition = true;
    protected long skipHeaderNumber = BaseSourceConfig.SKIP_HEADER_ROW_NUMBER.defaultValue();
    protected boolean isKerberosAuthorization = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/reader/IncrementalSourceReader.java`
#### Snippet
```java
    private final Map<String, SnapshotSplit> finishedUnackedSplits;

    private volatile boolean running = false;
    private final int subtaskId;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-hive/src/main/java/org/apache/seatunnel/connectors/seatunnel/hive/utils/HiveMetaStoreProxy.java`
#### Snippet
```java
public class HiveMetaStoreProxy {
    private final HiveMetaStoreClient hiveMetaStoreClient;
    private static volatile HiveMetaStoreProxy INSTANCE = null;

    private HiveMetaStoreProxy(Config config) {
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
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/models/Schema.java`
#### Snippet
```java

public class Schema {
    private int status = 0;
    private String keysType;
    private List<Field> properties;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisSinkWriter.java`
#### Snippet
```java
    private final transient ScheduledExecutorService scheduledExecutorService;
    private transient Thread executorThread;
    private transient volatile Exception loadException = null;
    private List<BackendV2.BackendRowV2> backends;
    private long pos;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/sink/KafkaSinkWriter.java`
#### Snippet
```java

    private String transactionPrefix;
    private long lastCheckpointId = 0;
    private SeaTunnelRowType seaTunnelRowType;

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

    KafkaSourceReader(
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
    protected PulsarClient pulsarClient;
    /** Indicating whether the SourceReader will be assigned more splits or not. */
    private boolean noMoreSplitsAssignment = false;

    public PulsarSourceReader(
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
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-pulsar/src/main/java/org/apache/seatunnel/connectors/seatunnel/pulsar/source/enumerator/PulsarSplitEnumerator.java`
#### Snippet
```java
    private boolean noMoreNewPartitionSplits = false;

    private ScheduledThreadPoolExecutor executor = null;

    public PulsarSplitEnumerator(
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

    private final Map<String, Object> sinkOptionProps = new HashMap<>();
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
    private volatile Exception flushException;
    private int batchRowCount = 0;
    private long batchBytesSize = 0;
    private final Integer batchIntervalMs;

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
    private final Integer batchIntervalMs;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java
    private final int port;
    private String contextId;
    private int readerOffset = 0;
    private final SourceConfig sourceConfig;
    private final SeaTunnelRowType seaTunnelRowType;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
    private SeaTunnelDataType<?>[] seaTunnelDataTypes;
    private int offsetInRowBatch = 0;
    private int rowCountInOneBatch = 0;
    private int readRowCount = 0;
    private List<SeaTunnelRow> seaTunnelRowBatch = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java
    private int offsetInRowBatch = 0;
    private int rowCountInOneBatch = 0;
    private int readRowCount = 0;
    private List<SeaTunnelRow> seaTunnelRowBatch = new ArrayList<>();
    private final ArrowStreamReader arrowStreamReader;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksRowBatchReader.java`
#### Snippet
```java

    private SeaTunnelDataType<?>[] seaTunnelDataTypes;
    private int offsetInRowBatch = 0;
    private int rowCountInOneBatch = 0;
    private int readRowCount = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `seatunnel-connectors-v2/connector-s3-redshift/src/main/java/org/apache/seatunnel/connectors/seatunnel/redshift/RedshiftJdbcClient.java`
#### Snippet
```java
public class RedshiftJdbcClient {

    private static volatile RedshiftJdbcClient INSTANCE = null;

    private final Connection connection;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/RecordBuffer.java`
#### Snippet
```java
    private String lineDelimiter;
    private int numOfRecords = 0;
    private long bufferSizeBytes = 0;

    public RecordBuffer() {}
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/RecordBuffer.java`
#### Snippet
```java
    private StringJoiner buffer;
    private String lineDelimiter;
    private int numOfRecords = 0;
    private long bufferSizeBytes = 0;

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/ThreadSafeCounter.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class ThreadSafeCounter implements Counter, Serializable {

    private static final long serialVersionUID = 1L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/ThreadSafeQPSMeter.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class ThreadSafeQPSMeter implements Meter, Serializable {

    private static final long serialVersionUID = 1L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/statemachine/SeaTunnelTaskState.java`
#### Snippet
```java
 * CANCELLING ----> CANCELED ... -> FAILED
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

public class SparkSink<StateT, CommitInfoT, AggregatedCommitInfoT>
        implements WriteSupport, StreamWriteSupport, DataSourceV2 {

    private volatile SeaTunnelSink<SeaTunnelRow, StateT, CommitInfoT, AggregatedCommitInfoT> sink;
```

### RedundantImplements
Redundant interface declaration `DataSourceV2`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/SeaTunnelSourceSupport.java`
#### Snippet
```java

public class SeaTunnelSourceSupport
        implements DataSourceV2, ReadSupport, MicroBatchReadSupport, DataSourceRegister {
    private static final Logger LOG = LoggerFactory.getLogger(SeaTunnelSourceSupport.class);
    public static final String SEA_TUNNEL_SOURCE_NAME = "SeaTunnelSource";
```

### RedundantImplements
Redundant interface declaration `Table`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/SeaTunnelSinkTable.java`
#### Snippet
```java
import java.util.Set;

public class SeaTunnelSinkTable implements Table, SupportsWrite {

    private static final String SINK_TABLE_NAME = "SeaTunnelSinkTable";
```

### RedundantImplements
Redundant interface declaration `Table`
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/SeaTunnelSourceTable.java`
#### Snippet
```java

/** The basic unit of SeaTunnel DataSource generated, supporting read and write */
public class SeaTunnelSourceTable implements Table, SupportsRead {
    private static final String SOURCE_TABLE_NAME = "SeaTunnelSourceTable";

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
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/config/CompressFormat.java`
#### Snippet
```java
import java.io.Serializable;

public enum CompressFormat implements Serializable {
    // text json orc parquet support
    LZO(".lzo", CompressionKind.LZO, CompressionCodecName.LZO),
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

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/StarRocksSinkManager.java`
#### Snippet
```java
                }

                if (e instanceof StarRocksConnectorException
                        && ((StarRocksConnectorException) e).needReCreateLabel()) {
                    String newLabel = createBatchLabel();
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
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

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/exception/HttpConnectorException.java`
#### Snippet
```java
public class HttpConnectorException extends SeaTunnelRuntimeException {

    private boolean reCreateLabel;

    public HttpConnectorException(SeaTunnelErrorCode seaTunnelErrorCode, String errorMessage) {
```

### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/exception/DorisConnectorException.java`
#### Snippet
```java

public class DorisConnectorException extends SeaTunnelRuntimeException {
    private boolean reCreateLabel;

    public DorisConnectorException(SeaTunnelErrorCode seaTunnelErrorCode, String errorMessage) {
```

### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/exception/StarRocksConnectorException.java`
#### Snippet
```java
public class StarRocksConnectorException extends SeaTunnelRuntimeException {

    private boolean reCreateLabel;

    public StarRocksConnectorException(SeaTunnelErrorCode seaTunnelErrorCode, String errorMessage) {
```

### NonFinalFieldOfException
Non-final field `reCreateLabel` of exception class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/exception/SelectDBConnectorException.java`
#### Snippet
```java

public class SelectDBConnectorException extends SeaTunnelRuntimeException {
    private boolean reCreateLabel;

    public SelectDBConnectorException(SeaTunnelErrorCode seaTunnelErrorCode, String errorMessage) {
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/type/MultipleRowType.java`
#### Snippet
```java

    public MultipleRowType(Map<String, SeaTunnelRowType> rowTypeMap) {
        this.tableIds = rowTypeMap.keySet().toArray(new String[0]);
        this.rowTypeMap = rowTypeMap;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/ConfigShade.java`
#### Snippet
```java
    /** To expand the options that user want to encrypt */
    default String[] sensitiveOptions() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/SimpleConfigObject.java`
#### Snippet
```java

            int separatorCount = 0;
            String[] keys = this.keySet().toArray(new String[0]);

            for (String k : keys) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeaTunnelBaseClassLoader.java`
#### Snippet
```java

    protected SeaTunnelBaseClassLoader(List<URL> urls) {
        this(urls.toArray(new URL[0]), SeaTunnelBaseClassLoader.class.getClassLoader());
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/loader/SeaTunnelChildFirstClassLoader.java`
#### Snippet
```java
    public SeaTunnelChildFirstClassLoader(List<URL> urls, String[] alwaysParentFirstPatterns) {
        this(
                urls.toArray(new URL[0]),
                SeaTunnelChildFirstClassLoader.class.getClassLoader(),
                alwaysParentFirstPatterns,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
        try {
            CompletableFuture<Void> voidCompletableFuture =
                    CompletableFuture.allOf(collect.toArray(new CompletableFuture[0]));
            voidCompletableFuture.get();
        } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalPlan.java`
#### Snippet
```java
        try {
            CompletableFuture<Void> voidCompletableFuture =
                    CompletableFuture.allOf(collect.toArray(new CompletableFuture[0]));
            voidCompletableFuture.join();
        } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SeaTunnelTask.java`
#### Snippet
```java
            cycle.init();
        }
        CompletableFuture.allOf(flowFutures.toArray(new CompletableFuture[0]))
                .whenComplete((s, e) -> closeCalled = true);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/SavePointJobTask.java`
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetClusterHealthMetricsTask.java`
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetJobMetricsTask.java`
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
        return new Object[] {};
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetJobDetailStatusTask.java`
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/protocol/task/GetJobInfoTask.java`
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
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/AbstractResourceManager.java`
#### Snippet
```java
            futures.add(releaseResource(jobId, profile));
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .whenComplete(
                        (r, e) -> {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
            try {
                CompletableFuture<Void> voidCompletableFuture =
                        CompletableFuture.allOf(collect.toArray(new CompletableFuture[0]));
                voidCompletableFuture.get();
                physicalPlan.updateJobState(JobStatus.SCHEDULED, JobStatus.RUNNING);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/scheduler/PipelineBaseScheduler.java`
#### Snippet
```java
                CompletableFuture<Void> voidCompletableFuture =
                        CompletableFuture.allOf(
                                deployCoordinatorFuture.toArray(new CompletableFuture[0]));
                voidCompletableFuture.get();
                if (!pipeline.updatePipelineState(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java
        // Shuffle the order to ensure random selection of workers
        List<WorkerProfile> workerProfiles =
                Arrays.asList(registerWorker.values().toArray(new WorkerProfile[0]));
        Collections.shuffle(workerProfiles);
        // Check if there are still unassigned slots
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/resourcemanager/ResourceRequestHandler.java`
#### Snippet
```java
    private <T> CompletableFuture<T> getAllOfFuture(List<CompletableFuture<T>> allRequestFuture) {
        return (CompletableFuture<T>)
                CompletableFuture.allOf(allRequestFuture.toArray(new CompletableFuture[0]));
    }
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
                        throw new SeaTunnelTextFormatException(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/SeaTunnelMicroBatch.java`
#### Snippet
```java
            }
        }
        return virtualPartitions.toArray(new InputPartition[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/serialization/InternalRowConverter.java`
#### Snippet
```java
    private static ArrayBasedMapData convertMap(Map<?, ?> mapData, MapType<?, ?> mapType) {
        if (mapData == null || mapData.size() == 0) {
            return ArrayBasedMapData.apply(new Object[] {}, new Object[] {});
        }
        SeaTunnelDataType<?> keyType = mapType.getKeyType();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/io/debezium/relational/TableId.java`
#### Snippet
```java
     */
    public static TableId parse(String str, boolean useCatalogBeforeSchema) {
        String[] parts = TableIdParser.parse(str).toArray(new String[0]);

        return TableId.parse(parts, parts.length, useCatalogBeforeSchema);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/SeaTunnelRowDebeziumDeserializeSchema.java`
#### Snippet
```java
        private SeaTunnelDataType<SeaTunnelRow> physicalRowType;
        private SeaTunnelDataType<SeaTunnelRow> resultTypeInfo;
        private MetadataConverter[] metadataConverters = new MetadataConverter[0];
        private ValueValidator validator = (rowData, rowKind) -> {};
        private ZoneId serverTimeZone = ZoneId.of("UTC");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
                    .filter(x -> !x.getCaptureInstance().equals(captureName))
                    .collect(Collectors.toList())
                    .toArray(new SqlServerChangeTable[0]);
        }
        throw exception;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/ParquetWriteStrategy.java`
#### Snippet
```java
                });
        MessageType seaTunnelRow =
                Types.buildMessage().addFields(types.toArray(new Type[0])).named("SeaTunnelRecord");
        return schemaConverter.convert(seaTunnelRow);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
                });
        return new SeaTunnelRowType(
                newFieldNames.toArray(new String[0]),
                newFieldTypes.toArray(new SeaTunnelDataType[0]));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-file/connector-file-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/sink/writer/AbstractWriteStrategy.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                newFieldNames.toArray(new String[0]),
                newFieldTypes.toArray(new SeaTunnelDataType[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/source/HttpSourceReader.java`
#### Snippet
```java
            jsonPaths[index] =
                    JsonPath.compile(
                            jsonField.getFields().values().toArray(new String[] {})[index]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/source/HttpSourceReader.java`
#### Snippet
```java
    private List<Map<String, String>> parseToMap(List<List<String>> datas, JsonField jsonField) {
        List<Map<String, String>> decodeDatas = new ArrayList<>(datas.size());
        String[] keys = jsonField.getFields().keySet().toArray(new String[] {});

        for (List<String> data : datas) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/source/JdbcSource.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
                                    table,
                                    seaTunnelRowType,
                                    primaryKeys.toArray(new String[0]),
                                    jdbcSinkConfig.isSupportUpsertByQueryPrimaryKeyExist());
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/source/KuduSource.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]),
                seaTunnelDataTypes.toArray(new SeaTunnelDataType<?>[0]));
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            keyFieldDataTypeArr[i] = rowType.getFieldType(rowFieldIndex);
        }
        return new SeaTunnelRowType(keyFieldNames.toArray(new String[0]), keyFieldDataTypeArr);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]), fieldTypes.toArray(new SeaTunnelDataType[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/data/IcebergTypeMapper.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]), fieldTypes.toArray(new SeaTunnelDataType[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/IcebergSource.java`
#### Snippet
```java
        SeaTunnelRowType originalRowType =
                new SeaTunnelRowType(
                        columnNames.toArray(new String[0]),
                        columnDataTypes.toArray(new SeaTunnelDataType[0]));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/IcebergSource.java`
#### Snippet
```java
                new SeaTunnelRowType(
                        columnNames.toArray(new String[0]),
                        columnDataTypes.toArray(new SeaTunnelDataType[0]));

        CheckResult checkResult =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSource.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]), fieldTypes.toArray(new SeaTunnelDataType<?>[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/source/TDengineSource.java`
#### Snippet
```java
        }
        return new SeaTunnelRowType(
                fieldNames.toArray(new String[0]), fieldTypes.toArray(new SeaTunnelDataType<?>[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, String.class))
                                        .toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Byte.class))
                                        .toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Short.class))
                                        .toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Integer.class))
                                        .toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Long.class))
                                        .toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Float.class))
                                        .toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Double.class))
                                        .toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getList(i, Boolean.class))
                                        .toArray(new Boolean[0]);
                    } else {
                        throw new CassandraConnectorException(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, String.class))
                                        .toArray(new String[0]);
                    } else if (Byte.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Byte.class))
                                        .toArray(new Byte[0]);
                    } else if (Short.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Short.class))
                                        .toArray(new Short[0]);
                    } else if (Integer.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Integer.class))
                                        .toArray(new Integer[0]);
                    } else if (Long.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Long.class))
                                        .toArray(new Long[0]);
                    } else if (Float.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Float.class))
                                        .toArray(new Float[0]);
                    } else if (Double.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Double.class))
                                        .toArray(new Double[0]);
                    } else if (Boolean.class.equals(typeClass)) {
                        fields[i] =
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/util/TypeConvertUtil.java`
#### Snippet
```java
                        fields[i] =
                                Objects.requireNonNull(row.getSet(i, Boolean.class))
                                        .toArray(new Boolean[0]);
                    } else {
                        throw new CassandraConnectorException(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                switch (elementType.getSqlType()) {
                    case STRING:
                        return origArray.toArray(new String[0]);
                    case BOOLEAN:
                        return origArray.toArray(new Boolean[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new String[0]);
                    case BOOLEAN:
                        return origArray.toArray(new Boolean[0]);
                    case INT:
                        return origArray.toArray(new Integer[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Boolean[0]);
                    case INT:
                        return origArray.toArray(new Integer[0]);
                    case BIGINT:
                        return origArray.toArray(new Long[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Integer[0]);
                    case BIGINT:
                        return origArray.toArray(new Long[0]);
                    case FLOAT:
                        return origArray.toArray(new Float[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Long[0]);
                    case FLOAT:
                        return origArray.toArray(new Float[0]);
                    case DOUBLE:
                        return origArray.toArray(new Double[0]);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                        return origArray.toArray(new Float[0]);
                    case DOUBLE:
                        return origArray.toArray(new Double[0]);
                    default:
                        throw new MaxcomputeConnectorException(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                }
                return new SeaTunnelRowType(
                        fieldNames.toArray(new String[0]),
                        fieldTypes.toArray(new SeaTunnelDataType[0]));
            case TINYINT:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeTypeMapper.java`
#### Snippet
```java
                return new SeaTunnelRowType(
                        fieldNames.toArray(new String[0]),
                        fieldTypes.toArray(new SeaTunnelDataType[0]));
            case TINYINT:
                return BasicType.BYTE_TYPE;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/dto/IndexInfo.java`
#### Snippet
```java
                    pluginConfig
                            .getStringList(SinkConfig.PRIMARY_KEYS.key())
                            .toArray(new String[0]);
        }
        keyDelimiter = SinkConfig.KEY_DELIMITER.defaultValue();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/KeyExtractor.java`
#### Snippet
```java
            fieldFormatters.add(fieldFormatter);
        }
        return new KeyExtractor(fieldFormatters.toArray(new FieldFormatter[0]), keyDelimiter);
    }

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
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java
                // for PEM encoded keys, the password is used to decrypt the specific key (and does
                // not protect the keystore itself)
                keyManagerPassword = new char[0];
            } catch (IOException | GeneralSecurityException ignored) {
                keyManagerPassword = keyStorePassword.map(String::toCharArray).orElse(null);
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
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FieldMapperTransform.java`
#### Snippet
```java

        return new SeaTunnelRowType(
                outputFiledNameList.toArray(new String[0]),
                outputDataTypeList.toArray(new SeaTunnelDataType[0]));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FieldMapperTransform.java`
#### Snippet
```java
        return new SeaTunnelRowType(
                outputFiledNameList.toArray(new String[0]),
                outputDataTypeList.toArray(new SeaTunnelDataType[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
            List<URL> files = FileUtils.searchJarFiles(this.pluginDir);
            factories =
                    FactoryUtil.discoverFactories(new URLClassLoader(files.toArray(new URL[0])));
        } else {
            log.info("plugin dir: {} not exists, load plugin from classpath", this.pluginDir);
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `FunctionWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/FunctionWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface FunctionWithException<T, R, E extends Throwable> {
    /**
     * Applies this function to the given argument.
```

### NonExceptionNameEndsWithException
Non-exception class name `ConsumerWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/ConsumerWithException.java`
#### Snippet
```java

@FunctionalInterface
public interface ConsumerWithException<T> {
    /**
     * Performs this operation on the given argument.
```

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
Non-exception class name `SupplierWithException` ends with 'Exception'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/function/SupplierWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface SupplierWithException<R, E extends Throwable> {

    /**
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkAbstractPluginExecuteProcessor.java`
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
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkAbstractPluginExecuteProcessor.java`
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
Condition `resultTableName == null` is always `true`
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/JobConfigParser.java`
#### Snippet
```java
            return resultTableName;
        }
        if (resultTableName == null) {
            return sourceTableName;
        }
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

## RuleId[id=IOResource]
### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        conn.setDoOutput(true);
        conn.setDoInput(true);
        PrintWriter out = new PrintWriter(conn.getOutputStream());
        // send request params
        out.print(res);
```

### IOResource
'StringDeserializer' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceReader.java`
#### Snippet
```java
                                                                sourceSplit.getTopicPartition());
                                                StringDeserializer stringDeserializer =
                                                        new StringDeserializer();
                                                stringDeserializer.configure(
                                                        Maps.fromProperties(
```

## RuleId[id=OptionalIsPresent]
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

## RuleId[id=FieldMayBeStatic]
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
Field `pollNextWaitTime` may be 'static'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/source/ElasticsearchSourceReader.java`
#### Snippet
```java
    boolean noMoreSplit;

    private final long pollNextWaitTime = 1000L;

    public ElasticsearchSourceReader(
```

### FieldMayBeStatic
Field `nullDefault` may be 'static'
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/impl/VariableIndexSerializer.java`
#### Snippet
```java
    private final Map<String, Integer> fieldIndexMap;

    private final String nullDefault = "null";

    public VariableIndexSerializer(
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
        pendingSplit
                .entrySet()
                .forEach(
                        s -> {
                            if (!assignedSplit.containsKey(s.getKey())) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
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
Class `SaveModeConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/sink/SaveModeConstants.java`
#### Snippet
```java
package org.apache.seatunnel.api.sink;

public class SaveModeConstants {

    public static final String ROWTYPE_PRIMARY_KEY = "rowtype_primary_key";
```

### UtilityClassWithoutPrivateConstructor
Class `SinkCommonOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/sink/SinkCommonOptions.java`
#### Snippet
```java
package org.apache.seatunnel.api.sink;

public class SinkCommonOptions {

    public static final String DATA_SAVE_MODE = "save_mode";
```

### UtilityClassWithoutPrivateConstructor
Class `Options` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/Options.java`
#### Snippet
```java
import static com.google.common.base.Preconditions.checkArgument;

public class Options {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FactoryUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/FactoryUtil.java`
#### Snippet
```java
 * CatalogFactory}.
 */
public final class FactoryUtil {

    private static final Logger LOG = LoggerFactory.getLogger(FactoryUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `JavaVersion` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/JavaVersion.java`
#### Snippet
```java
import java.util.Objects;

public class JavaVersion {

    public static final List<Integer> CURRENT =
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelServer` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/SeaTunnelServer.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelServer {
    public static void main(String[] args) throws CommandException {
        ServerCommandArgs serverCommandArgs =
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelClient` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/SeaTunnelClient.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelClient {
    public static void main(String[] args) throws CommandException {
        ClientCommandArgs clientCommandArgs =
```

### UtilityClassWithoutPrivateConstructor
Class `TempDirectory` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-starter/src/main/java/org/apache/seatunnel/core/starter/seatunnel/jvm/TempDirectory.java`
#### Snippet
```java
 * directory to be a private temporary directory.
 */
final class TempDirectory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/configuration/util/ConfigUtil.java`
#### Snippet
```java

@Slf4j
public class ConfigUtil {
    private static final JavaPropsMapper PROPERTIES_MAPPER = new JavaPropsMapper();
    private static final ObjectMapper JACKSON_MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigAdapterUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/ConfigAdapterUtils.java`
#### Snippet
```java

@Slf4j
public final class ConfigAdapterUtils {
    private static final List<ConfigAdapter> CONFIG_ADAPTERS = new ArrayList<>(0);

```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnel` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/SeaTunnel.java`
#### Snippet
```java

@Slf4j
public class SeaTunnel {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelStarterConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/constants/SeaTunnelStarterConstants.java`
#### Snippet
```java
package org.apache.seatunnel.core.starter.constants;

public class SeaTunnelStarterConstants {
    public static final int USAGE_EXIT_CODE = 234;
}
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigShadeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-core-starter/src/main/java/org/apache/seatunnel/core/starter/utils/ConfigShadeUtils.java`
#### Snippet
```java
/** Config shade utilities */
@Slf4j
public final class ConfigShadeUtils {

    private static final String SHADE_IDENTIFIER_OPTION = "shade.identifier";
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelFlink` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/SeaTunnelFlink.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelFlink {
    public static void main(String[] args) throws CommandException {
        FlinkCommandArgs flinkCommandArgs =
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelFlink` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/SeaTunnelFlink.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelFlink {
    public static void main(String[] args) throws CommandException {
        FlinkCommandArgs flinkCommandArgs =
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelSpark` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SeaTunnelSpark.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelSpark {

    public static void main(String[] args) throws CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelSpark` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/SeaTunnelSpark.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.utils.CommandLineUtils;

public class SeaTunnelSpark {

    public static void main(String[] args) throws CommandException {
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/ReflectionUtils.java`
#### Snippet
```java
import java.util.Optional;

public class ReflectionUtils {

    public static Optional<Method> getDeclaredMethod(
```

### UtilityClassWithoutPrivateConstructor
Class `TimeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/TimeUtils.java`
#### Snippet
```java
import java.util.Map;

public class TimeUtils {
    private static final Map<Formatter, DateTimeFormatter> FORMATTER_MAP =
            new HashMap<Formatter, DateTimeFormatter>();
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
Class `DateTimeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/utils/DateTimeUtils.java`
#### Snippet
```java
import java.util.Map;

public class DateTimeUtils {

    private static final Map<Formatter, DateTimeFormatter> FORMATTER_MAP =
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
Class `PropertiesParser` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PropertiesParser.java`
#### Snippet
```java
import java.util.Set;

final class PropertiesParser {
    static AbstractConfigObject parse(Reader reader, ConfigOrigin origin) throws IOException {
        Properties props = new Properties();
```

### UtilityClassWithoutPrivateConstructor
Class `ActionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ActionUtils.java`
#### Snippet
```java
import org.apache.seatunnel.common.constants.PluginType;

public class ActionUtils {

    public static PluginType getActionType(Action action) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigParser` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
import java.util.Map;

final class ConfigParser {
    static AbstractConfigValue parse(
            ConfigNodeRoot document,
```

### UtilityClassWithoutPrivateConstructor
Class `PathParser` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PathParser.java`
#### Snippet
```java
import java.util.List;

final class PathParser {

    static ConfigOrigin API_ORIGIN = SimpleConfigOrigin.newSimple("path parameter");
```

### UtilityClassWithoutPrivateConstructor
Class `ContentFormatUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/util/ContentFormatUtil.java`
#### Snippet
```java
import java.util.List;

public class ContentFormatUtil {

    public static String format(List<JobStatusData> jobStatusDataList) {
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
Class `FactoryUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/utils/FactoryUtil.java`
#### Snippet
```java

@Slf4j
public class FactoryUtil<T> {

    public static <T> T discoverFactory(
```

### UtilityClassWithoutPrivateConstructor
Class `ServerConfigOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/server/ServerConfigOptions.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class ServerConfigOptions {

    public static final Option<Integer> BACKUP_COUNT =
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

    public static Tuple2<PhysicalPlan, Map<Integer, CheckpointPlan>> fromLogicalDAG(
```

### UtilityClassWithoutPrivateConstructor
Class `DAGUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/DAGUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class DAGUtils {

    public static JobDAGInfo getJobDAGInfo(
```

### UtilityClassWithoutPrivateConstructor
Class `RecordEventProducer` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/group/queue/disruptor/RecordEventProducer.java`
#### Snippet
```java
import com.lmax.disruptor.RingBuffer;

public class RecordEventProducer {

    @SuppressWarnings("checkstyle:MagicNumber")
```

### UtilityClassWithoutPrivateConstructor
Class `TypeId` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/serializable/TypeId.java`
#### Snippet
```java
package org.apache.seatunnel.engine.server.serializable;

public class TypeId {
    static final int RECORD = 1;
}
```

### UtilityClassWithoutPrivateConstructor
Class `FileConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/common/FileConstants.java`
#### Snippet
```java
import org.apache.hadoop.conf.Configuration;

public class FileConstants {

    public static final String DEFAULT_IMAP_NAMESPACE = "/seatunnel-imap";
```

### UtilityClassWithoutPrivateConstructor
Class `WALDataUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-storage/imap-storage-plugins/imap-storage-file/src/main/java/org/apache/seatunnel/engine/imap/storage/file/common/WALDataUtils.java`
#### Snippet
```java

// CHECKSTYLE:OFF
public class WALDataUtils {

    public static final int WAL_DATA_METADATA_LENGTH = 12;
```

### UtilityClassWithoutPrivateConstructor
Class `StorageConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-engine/seatunnel-engine-storage/checkpoint-storage-api/src/main/java/org/apache/seatunnel/engine/checkpoint/storage/constants/StorageConstants.java`
#### Snippet
```java
package org.apache.seatunnel.engine.checkpoint.storage.constants;

public class StorageConstants {

    /** The name of the configuration property that specifies the name of the file system. */
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

    public static final Option<Boolean> IGNORE_PARSE_ERRORS =
```

### UtilityClassWithoutPrivateConstructor
Class `CanalJsonFormatOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/canal/CanalJsonFormatOptions.java`
#### Snippet
```java

/** Option utils for canal_json format. */
public class CanalJsonFormatOptions {

    public static final Option<Boolean> IGNORE_PARSE_ERRORS = JsonFormatOptions.IGNORE_PARSE_ERRORS;
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelEngineServerExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-engine-examples/src/main/java/org/apache/seatunnel/example/engine/SeaTunnelEngineServerExample.java`
#### Snippet
```java
import org.apache.seatunnel.core.starter.seatunnel.args.ServerCommandArgs;

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

    public static void main(String[] args)
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelEngineExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-engine-examples/src/main/java/org/apache/seatunnel/example/engine/SeaTunnelEngineExample.java`
#### Snippet
```java
import java.nio.file.Paths;

public class SeaTunnelEngineExample {

    public static void main(String[] args)
```

### UtilityClassWithoutPrivateConstructor
Class `SeaTunnelApiExample` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-flink-connector-v2-example/src/main/java/org/apache/seatunnel/example/flink/v2/SeaTunnelApiExample.java`
#### Snippet
```java
import java.nio.file.Paths;

public class SeaTunnelApiExample {

    public static void main(String[] args)
```

### UtilityClassWithoutPrivateConstructor
Class `ExampleUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-examples/seatunnel-spark-connector-v2-example/src/main/java/org/apache/seatunnel/example/spark/v2/ExampleUtils.java`
#### Snippet
```java
import java.nio.file.Paths;

public class ExampleUtils {

    public static void builder(String configurePath)
```

### UtilityClassWithoutPrivateConstructor
Class `SparkSinkInjector` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkSinkInjector.java`
#### Snippet
```java
import org.apache.spark.sql.streaming.OutputMode;

public class SparkSinkInjector {

    private static final String SPARK_SINK_CLASS_NAME =
```

### UtilityClassWithoutPrivateConstructor
Class `InstantConverterUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/utils/InstantConverterUtils.java`
#### Snippet
```java
import java.time.Instant;

public class InstantConverterUtils {

    private static final long MICRO_OF_SECOND = 1000_000;
```

### UtilityClassWithoutPrivateConstructor
Class `SparkSinkInjector` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/sink/SparkSinkInjector.java`
#### Snippet
```java
import org.apache.spark.sql.streaming.OutputMode;

public class SparkSinkInjector {

    private static final String SINK_NAME = SeaTunnelSink.class.getSimpleName();
```

### UtilityClassWithoutPrivateConstructor
Class `InstantConverterUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/utils/InstantConverterUtils.java`
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
/** Utilities for converting from MySQL types to SeaTunnel types. */
@Slf4j
public class MySqlTypeUtils {

    // ============================data types=====================
```

### UtilityClassWithoutPrivateConstructor
Class `TableDiscoveryUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/TableDiscoveryUtils.java`
#### Snippet
```java

/** Utilities to discovery matched tables. */
public class TableDiscoveryUtils {
    private static final Logger LOG = LoggerFactory.getLogger(TableDiscoveryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `MySqlConnectionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/utils/MySqlConnectionUtils.java`
#### Snippet
```java

/** MySQL connection Utilities. */
public class MySqlConnectionUtils {

    /** Creates a new {@link MySqlConnection}, but not open the connection. */
```

### UtilityClassWithoutPrivateConstructor
Class `MySqlSourceOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-mysql/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/mysql/source/MySqlSourceOptions.java`
#### Snippet
```java
import java.util.Arrays;

public class MySqlSourceOptions {
    public static final SingleChoiceOption<StartupMode> STARTUP_MODE =
            (SingleChoiceOption)
```

### UtilityClassWithoutPrivateConstructor
Class `SqlServerTypeUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerTypeUtils.java`
#### Snippet
```java

/** Utilities for converting from SqlServer types to SeaTunnel types. */
public class SqlServerTypeUtils {
    public static SeaTunnelDataType<?> convertFromColumn(Column column) {
        switch (column.jdbcType()) {
```

### UtilityClassWithoutPrivateConstructor
Class `TableDiscoveryUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/TableDiscoveryUtils.java`
#### Snippet
```java

/** Utilities to discovery matched tables. */
public class TableDiscoveryUtils {
    private static final Logger LOG = LoggerFactory.getLogger(TableDiscoveryUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `SqlServerConnectionUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerConnectionUtils.java`
#### Snippet
```java

/** Utils for SqlServer connection. */
public class SqlServerConnectionUtils {

    public static SqlServerConnection createSqlServerConnection(Configuration dbzConfiguration) {
```

### UtilityClassWithoutPrivateConstructor
Class `SqlServerSourceOptions` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/source/SqlServerSourceOptions.java`
#### Snippet
```java
import java.util.Arrays;

public class SqlServerSourceOptions {
    public static final SingleChoiceOption<StartupMode> STARTUP_MODE =
            (SingleChoiceOption)
```

### UtilityClassWithoutPrivateConstructor
Class `SqlServerUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/org/apache/seatunnel/connectors/seatunnel/cdc/sqlserver/source/utils/SqlServerUtils.java`
#### Snippet
```java

/** The utils for SqlServer data source. */
public class SqlServerUtils {

    public SqlServerUtils() {}
```

### UtilityClassWithoutPrivateConstructor
Class `FakeOption` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-fake/src/main/java/org/apache/seatunnel/connectors/seatunnel/fake/config/FakeOption.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class FakeOption {

    public static final Option<List<SeaTunnelRow>> ROWS =
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
    public static final Option<String> TABLE_NAME =
            Options.key("table_name")
```

### UtilityClassWithoutPrivateConstructor
Class `AuthorizationUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-http/connector-http-base/src/main/java/org/apache/seatunnel/connectors/seatunnel/http/util/AuthorizationUtil.java`
#### Snippet
```java
import static org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString;

public class AuthorizationUtil {
    // Basic Auth
    public static String getTokenByBasicAuth(String username, String password) {
```

### UtilityClassWithoutPrivateConstructor
Class `HudiSourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/config/HudiSourceConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class HudiSourceConfig {
    public static final Option<String> TABLE_PATH =
            Options.key("table.path")
```

### UtilityClassWithoutPrivateConstructor
Class `HudiUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-hudi/src/main/java/org/apache/seatunnel/connectors/seatunnel/hudi/util/HudiUtil.java`
#### Snippet
```java
import static org.apache.parquet.format.converter.ParquetMetadataConverter.NO_FILTER;

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
Class `KuduTypeMapper` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduTypeMapper.java`
#### Snippet
```java
import java.util.List;

public class KuduTypeMapper {

    private static final Logger LOG = LoggerFactory.getLogger(KuduTypeMapper.class);
```

### UtilityClassWithoutPrivateConstructor
Class `LoadStatus` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/LoadStatus.java`
#### Snippet
```java

/** enum of LoadStatus. */
public class LoadStatus {
    public static final String SUCCESS = "Success";
    public static final String PUBLISH_TIMEOUT = "Publish Timeout";
```

### UtilityClassWithoutPrivateConstructor
Class `LoadConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/LoadConstants.java`
#### Snippet
```java

/** Constants for load. */
public class LoadConstants {
    public static final String COLUMNS_KEY = "columns";
    public static final String FIELD_DELIMITER_KEY = "column_separator";
```

### UtilityClassWithoutPrivateConstructor
Class `ResponseUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/ResponseUtil.java`
#### Snippet
```java

/** util for handle response. */
public class ResponseUtil {
    public static final Pattern LABEL_EXIST_PATTERN =
            Pattern.compile(
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/util/IOUtils.java`
#### Snippet
```java
import java.util.Properties;

public class IOUtils {
    public static String propsToString(Properties props) throws IllegalArgumentException {
        StringWriter sw = new StringWriter();
```

### UtilityClassWithoutPrivateConstructor
Class `EmailConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-email/src/main/java/org/apache/seatunnel/connectors/seatunnel/email/config/EmailConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class EmailConfig {

    public static final Option<String> EMAIL_FROM_ADDRESS =
```

### UtilityClassWithoutPrivateConstructor
Class `SourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iotdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/iotdb/config/SourceConfig.java`
#### Snippet
```java
 * https://iotdb.apache.org/UserGuide/Master/API/Programming-Java-Native-API.html
 */
public class SourceConfig {

    public static final Option<String> SQL =
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
import java.util.Map;

public class Config {

    public static final String CONNECTOR_IDENTITY = "Kafka";
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

    public static Option<String> ENDPOINT =
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

    public static void validateDataType(SeaTunnelDataType dataType)
```

### UtilityClassWithoutPrivateConstructor
Class `MongodbOption` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-mongodb/src/main/java/org/apache/seatunnel/connectors/seatunnel/mongodb/config/MongodbOption.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class MongodbOption {
    public static final Option<String> URI =
            Options.key("uri").stringType().noDefaultValue().withDescription("MongoDB uri");
```

### UtilityClassWithoutPrivateConstructor
Class `IcebergScanSplitPlanner` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/enumerator/scan/IcebergScanSplitPlanner.java`
#### Snippet
```java

@Slf4j
public class IcebergScanSplitPlanner {

    public static IcebergEnumerationResult planStreamSplits(
```

### UtilityClassWithoutPrivateConstructor
Class `DingTalkConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-dingtalk/src/main/java/org/apache/seatunnel/connectors/seatunnel/config/DingTalkConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class DingTalkConfig {

    public static final Option<String> URL =
```

### UtilityClassWithoutPrivateConstructor
Class `OpenMldbConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-openmldb/src/main/java/org/apache/seatunnel/connectors/seatunnel/openmldb/config/OpenMldbConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class OpenMldbConfig {
    private static final int DEFAULT_SESSION_TIMEOUT = 10000;
    private static final int DEFAULT_REQUEST_TIMEOUT = 60000;
```

### UtilityClassWithoutPrivateConstructor
Class `InfluxDBRowConverter` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-influxdb/src/main/java/org/apache/seatunnel/connectors/seatunnel/influxdb/converter/InfluxDBRowConverter.java`
#### Snippet
```java
import java.util.List;

public class InfluxDBRowConverter {

    public static SeaTunnelRow convert(
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
Class `ConfigNames` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/config/TDengineSourceConfig.java`
#### Snippet
```java
    }

    public static class ConfigNames {

        public static String URL = "url";
```

### UtilityClassWithoutPrivateConstructor
Class `TDengineTypeMapper` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-tdengine/src/main/java/org/apache/seatunnel/connectors/seatunnel/tdengine/typemapper/TDengineTypeMapper.java`
#### Snippet
```java

@Slf4j
public class TDengineTypeMapper {

    // ============================data types=====================
```

### UtilityClassWithoutPrivateConstructor
Class `CassandraClient` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-cassandra/src/main/java/org/apache/seatunnel/connectors/seatunnel/cassandra/client/CassandraClient.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class CassandraClient {
    public static CqlSessionBuilder getCqlSessionBuilder(
            String nodeAddress,
```

### UtilityClassWithoutPrivateConstructor
Class `CreateTableParser` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/util/CreateTableParser.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class CreateTableParser {

    private static final Pattern COLUMN_PATTERN = Pattern.compile("`?(\\w+)`?\\s*([\\w|\\W]*)");
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
Class `StarRocksSaveModeUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/sink/StarRocksSaveModeUtil.java`
#### Snippet
```java
import static com.google.common.base.Preconditions.checkNotNull;

public class StarRocksSaveModeUtil {

    public static String fillingCreateSql(
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
import org.apache.seatunnel.connectors.seatunnel.clickhouse.exception.ClickhouseConnectorException;

public class FileTransferFactory {
    public static FileTransfer createFileTransfer(
            ClickhouseFileCopyMethod type, String host, String user, String password) {
```

### UtilityClassWithoutPrivateConstructor
Class `SqlUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/SqlUtils.java`
#### Snippet
```java
import static java.lang.String.format;

public class SqlUtils {
    public static String quoteIdentifier(String identifier) {
        return "\"" + identifier + "\"";
```

### UtilityClassWithoutPrivateConstructor
Class `ClickhouseUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/util/ClickhouseUtil.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class ClickhouseUtil {

    public static List<ClickHouseNode> createNodes(
```

### UtilityClassWithoutPrivateConstructor
Class `ClickhouseConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/config/ClickhouseConfig.java`
#### Snippet
```java

@SuppressWarnings("checkstyle:MagicNumber")
public class ClickhouseConfig {

    /** Bulk size of clickhouse jdbc */
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
Class `MaxcomputeUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-maxcompute/src/main/java/org/apache/seatunnel/connectors/seatunnel/maxcompute/util/MaxcomputeUtil.java`
#### Snippet
```java

@Slf4j
public class MaxcomputeUtil {
    public static Table getTable(Config pluginConfig) {
        Odps odps = getOdps(pluginConfig);
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

    public static final Option<List<String>> HOSTS =
```

### UtilityClassWithoutPrivateConstructor
Class `SourceConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/config/SourceConfig.java`
#### Snippet
```java
import java.util.Map;

public class SourceConfig {

    public static final Option<String> INDEX =
```

### UtilityClassWithoutPrivateConstructor
Class `SinkConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/config/SinkConfig.java`
#### Snippet
```java
import java.util.List;

public class SinkConfig {

    public static final Option<String> INDEX =
```

### UtilityClassWithoutPrivateConstructor
Class `EsTypeMappingSeaTunnelType` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/constant/EsTypeMappingSeaTunnelType.java`
#### Snippet
```java
import java.util.Map;

public class EsTypeMappingSeaTunnelType {

    private static final Map<String, SeaTunnelDataType> MAPPING =
```

### UtilityClassWithoutPrivateConstructor
Class `IndexSerializerFactory` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/serialize/index/IndexSerializerFactory.java`
#### Snippet
```java
import java.util.List;

public class IndexSerializerFactory {

    public static IndexSerializer getIndexSerializer(
```

### UtilityClassWithoutPrivateConstructor
Class `SheetsConfig` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-google-sheets/src/main/java/org/apache/seatunnel/connectors/seatunnel/google/sheets/config/SheetsConfig.java`
#### Snippet
```java
import org.apache.seatunnel.api.configuration.Options;

public class SheetsConfig {

    public static final Option<String> SERVICE_ACCOUNT_KEY =
```

### UtilityClassWithoutPrivateConstructor
Class `LoadStatus` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/LoadStatus.java`
#### Snippet
```java

/** enum of LoadStatus. */
public class LoadStatus {
    public static final int SUCCESS = 0;
    public static final String FAIL = "1";
```

### UtilityClassWithoutPrivateConstructor
Class `LoadConstants` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/LoadConstants.java`
#### Snippet
```java

/** Constants for load. */
public class LoadConstants {
    public static final String COLUMNS_KEY = "columns";
    public static final String FIELD_DELIMITER_KEY = "file.column_separator";
```

### UtilityClassWithoutPrivateConstructor
Class `ResponseUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/util/ResponseUtil.java`
#### Snippet
```java

/** util for handle response. */
public class ResponseUtil {
    public static final Pattern LABEL_EXIST_PATTERN =
            Pattern.compile(
```

### UtilityClassWithoutPrivateConstructor
Class `HttpUtil` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/util/HttpUtil.java`
#### Snippet
```java

/** util to build http client. */
public class HttpUtil {
    public HttpUtil() {}

```

### UtilityClassWithoutPrivateConstructor
Class `SSLUtils` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/util/SSLUtils.java`
#### Snippet
```java

@SuppressWarnings("MagicNumber")
public final class SSLUtils {

    public static Optional<SSLContext> buildSSLContext(
```

### UtilityClassWithoutPrivateConstructor
Class `SQLEngineFactory` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/SQLEngineFactory.java`
#### Snippet
```java
import org.apache.seatunnel.transform.sqlengine.zeta.ZetaSQLEngine;

public class SQLEngineFactory {
    public static SQLEngine getSQLEngine(EngineType engineType) {
        switch (engineType) {
```

### UtilityClassWithoutPrivateConstructor
Class `SystemFunction` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/SystemFunction.java`
#### Snippet
```java
import java.util.List;

public class SystemFunction {
    public static Object coalesce(List<Object> args) {
        Object v = null;
```

### UtilityClassWithoutPrivateConstructor
Class `NumericFunction` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/NumericFunction.java`
#### Snippet
```java
import java.util.Random;

public class NumericFunction {
    public static Number abs(List<Object> args) {
        Number arg = (Number) args.get(0);
```

### UtilityClassWithoutPrivateConstructor
Class `DateTimeFunction` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/DateTimeFunction.java`
#### Snippet
```java
import java.util.Locale;

public class DateTimeFunction {
    /** English names of months and week days. */
    private static volatile String[][] MONTHS_AND_WEEKS;
```

### UtilityClassWithoutPrivateConstructor
Class `StringFunction` has only 'static' members, and lacks a 'private' constructor
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class StringFunction {
    private static final byte[] SOUNDEX_INDEX =
            "71237128722455712623718272\000\000\000\000\000\00071237128722455712623718272"
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CHECKPOINT_INTERVAL' is still used
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/utils/ConfigKeyName.java`
#### Snippet
```java
    public static final String MAX_PARALLELISM = "execution.max-parallelism";

    @Deprecated public static final String CHECKPOINT_INTERVAL = "execution.checkpoint.interval";
    public static final String CHECKPOINT_MODE = "execution.checkpoint.mode";
    public static final String CHECKPOINT_TIMEOUT = "execution.checkpoint.timeout";
```

### DeprecatedIsStillUsed
Deprecated member 'CHECKPOINT_INTERVAL' is still used
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/utils/ConfigKeyName.java`
#### Snippet
```java
    public static final String PARALLELISM = "execution.parallelism";
    public static final String MAX_PARALLELISM = "execution.max-parallelism";
    @Deprecated public static final String CHECKPOINT_INTERVAL = "execution.checkpoint.interval";
    public static final String CHECKPOINT_MODE = "execution.checkpoint.mode";
    public static final String CHECKPOINT_TIMEOUT = "execution.checkpoint.timeout";
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
Deprecated member 'getJobDetailStatus' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java
     */
    @Deprecated
    public String getJobDetailStatus(Long jobId) {
        return jobClient.getJobDetailStatus(jobId);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'cancelJob' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java

    @Deprecated
    public void cancelJob(Long jobId) {
        jobClient.cancelJob(jobId);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'savePointJob' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java

    @Deprecated
    public void savePointJob(Long jobId) {
        jobClient.savePointJob(jobId);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'listJobStatus' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java
    /** list all jobId and job status */
    @Deprecated
    public String listJobStatus() {
        return jobClient.listJobStatus(false);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getJobStatus' is still used
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelClient.java`
#### Snippet
```java
     */
    @Deprecated
    public String getJobStatus(Long jobId) {
        return jobClient.getJobStatus(jobId);
    }
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ShufflePartitionStrategy.java`
#### Snippet
```java
                pipelineId,
                targetIndex,
                Stream.of(shuffles).map(e -> e.getName()).collect(Collectors.toList()));

        return shuffles;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/dag/actions/ShuffleMultipleRowStrategy.java`
#### Snippet
```java
                pipelineId,
                targetIndex,
                Stream.of(queues).map(e -> e.getName()).collect(Collectors.toList()));

        return queues;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/execution/Pipeline.java`
#### Snippet
```java
                .collect(
                        Collectors.toMap(
                                action -> ActionStateKey.of(action), Action::getParallelism));
    }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
                                    }
                                })
                        .collect(Collectors.groupingBy(x -> x.getSourceTableId()));

        if (includeListCdcEnabledTables.isEmpty()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                    Date sqlDate = rs.getDate(resultSetIndex);
                    fields[fieldIndex] =
                            Optional.ofNullable(sqlDate).map(e -> e.toLocalDate()).orElse(null);
                    break;
                case TIME:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                    Time sqlTime = rs.getTime(resultSetIndex);
                    fields[fieldIndex] =
                            Optional.ofNullable(sqlTime).map(e -> e.toLocalTime()).orElse(null);
                    break;
                case TIMESTAMP:
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                    fields[fieldIndex] =
                            Optional.ofNullable(sqlTimestamp)
                                    .map(e -> e.toLocalDateTime())
                                    .orElse(null);
                    break;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
                        .mapToObj(
                                (IntFunction<SeaTunnelDataType>)
                                        index -> rowType.getFieldType(index))
                        .toArray(length -> new SeaTunnelDataType[length]);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/JdbcOutputFormatBuilder.java`
#### Snippet
```java
                                (IntFunction<SeaTunnelDataType>)
                                        index -> rowType.getFieldType(index))
                        .toArray(length -> new SeaTunnelDataType[length]);

        Function<SeaTunnelRow, SeaTunnelRow> keyExtractor = createKeyExtractor(pkFields);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/rest/RestService.java`
#### Snippet
```java
        }
        List<BackendRow> backendRows =
                backend.getRows().stream().filter(v -> v.getAlive()).collect(Collectors.toList());
        logger.debug("Parsing schema result is '{}'.", backendRows);
        return backendRows;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
            CompatibleDebeziumJsonSerializationSchema serializationSchema =
                    new CompatibleDebeziumJsonSerializationSchema(rowType, true);
            return row -> serializationSchema.serialize(row);
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/serialize/DefaultSeaTunnelRowSerializer.java`
#### Snippet
```java
        SerializationSchema serializationSchema =
                createSerializationSchema(rowType, format, delimiter, false);
        return row -> serializationSchema.serialize(row);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSourceSplitEnumerator.java`
#### Snippet
```java
                    });
            return splits.stream()
                    .collect(Collectors.toMap(split -> split.getTopicPartition(), split -> split));
        } catch (Exception e) {
            throw new KafkaConnectorException(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-iceberg/src/main/java/org/apache/seatunnel/connectors/seatunnel/iceberg/source/split/IcebergFileScanTaskSplit.java`
#### Snippet
```java
                "deletes",
                task.deletes().stream()
                        .map(deleteFile -> deleteFile.path())
                        .collect(Collectors.toList()));
        return taskInfo.toString();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/source/StartRocksSourceSplitEnumerator.java`
#### Snippet
```java
                                ",",
                                assignmentForReader.stream()
                                        .map(p -> p.getSplitId())
                                        .collect(Collectors.toList())),
                        reader);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSinkWriter.java`
#### Snippet
```java
                                    orderByKeys =
                                            Stream.of(shardRouter.getSortingKey().split(","))
                                                    .map(key -> StringUtils.trim(key))
                                                    .toArray(value -> new String[value]);
                                }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/ClickhouseSinkWriter.java`
#### Snippet
```java
                                            Stream.of(shardRouter.getSortingKey().split(","))
                                                    .map(key -> StringUtils.trim(key))
                                                    .toArray(value -> new String[value]);
                                }
                                JdbcBatchStatementExecutor jdbcBatchStatementExecutor =
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

### Convert2MethodRef
Lambda can be replaced with method reference
in `seatunnel-connectors-v2/connector-elasticsearch/src/main/java/org/apache/seatunnel/connectors/seatunnel/elasticsearch/client/EsRestClient.java`
#### Snippet
```java
                                            truststorePath,
                                            truststorePassword);
                            sslContext.ifPresent(e -> httpClientBuilder.setSSLContext(e));
                        } else {
                            SSLContext sslContext =
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-sqlserver/src/main/java/io/debezium/connector/sqlserver/SqlServerStreamingChangeEventSource.java`
#### Snippet
```java
        final Metronome metronome = Metronome.sleeper(pollInterval, clock);
        final Queue<SqlServerChangeTable> schemaChangeCheckpoints =
                new PriorityQueue<>((x, y) -> x.getStopLsn().compareTo(y.getStopLsn()));
        try {
            final AtomicReference<SqlServerChangeTable[]> tablesSlot =
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

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkAbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.pluginConfigs = pluginConfigs;
        this.jobContext = jobContext;
        this.plugins = initializePlugins(jarPaths, pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/FlinkAbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.pluginConfigs = pluginConfigs;
        this.jobContext = jobContext;
        this.plugins = initializePlugins(jarPaths, pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-2-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkAbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.jobContext = jobContext;
        this.pluginConfigs = pluginConfigs;
        this.plugins = initializePlugins(pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `initializePlugins()` during object construction
in `seatunnel-core/seatunnel-spark-starter/seatunnel-spark-3-starter/src/main/java/org/apache/seatunnel/core/starter/spark/execution/SparkAbstractPluginExecuteProcessor.java`
#### Snippet
```java
        this.jobContext = jobContext;
        this.pluginConfigs = pluginConfigs;
        this.plugins = initializePlugins(pluginConfigs);
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createSourceConfigFactory()` during object construction
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        this.stopMode = stopConfig.getStopMode();
        this.incrementalParallelism = readonlyConfig.get(SourceOptions.INCREMENTAL_PARALLELISM);
        this.configFactory = createSourceConfigFactory(readonlyConfig);
        this.dataSourceDialect = createDataSourceDialect(readonlyConfig);
        this.deserializationSchema = createDebeziumDeserializationSchema(readonlyConfig);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createDataSourceDialect()` during object construction
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        this.incrementalParallelism = readonlyConfig.get(SourceOptions.INCREMENTAL_PARALLELISM);
        this.configFactory = createSourceConfigFactory(readonlyConfig);
        this.dataSourceDialect = createDataSourceDialect(readonlyConfig);
        this.deserializationSchema = createDebeziumDeserializationSchema(readonlyConfig);
        this.offsetFactory = createOffsetFactory(readonlyConfig);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createDebeziumDeserializationSchema()` during object construction
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        this.configFactory = createSourceConfigFactory(readonlyConfig);
        this.dataSourceDialect = createDataSourceDialect(readonlyConfig);
        this.deserializationSchema = createDebeziumDeserializationSchema(readonlyConfig);
        this.offsetFactory = createOffsetFactory(readonlyConfig);
    }
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `createOffsetFactory()` during object construction
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/IncrementalSource.java`
#### Snippet
```java
        this.dataSourceDialect = createDataSourceDialect(readonlyConfig);
        this.deserializationSchema = createDebeziumDeserializationSchema(readonlyConfig);
        this.offsetFactory = createOffsetFactory(readonlyConfig);
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

## RuleId[id=NonSerializableFieldInSerializableClass]
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
Non-serializable field 'defaultValue' in a Serializable class
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/catalog/Column.java`
#### Snippet
```java
    // todo: use generic type
    /** The default value of the column. */
    protected final Object defaultValue;

    protected final String comment;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/common/metrics/Measurement.java`
#### Snippet
```java
    private Map<String, String> tags; // tag name -> tag value
    private String metric;
    private Object value;
    private long timestamp;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'storage' in a Serializable class
in `seatunnel-engine/seatunnel-engine-common/src/main/java/org/apache/seatunnel/engine/common/config/server/CheckpointConfig.java`
#### Snippet
```java
            ServerConfigOptions.CHECKPOINT_TOLERABLE_FAILURE.defaultValue();

    private CheckpointStorageConfig storage = ServerConfigOptions.CHECKPOINT_STORAGE.defaultValue();

    public void setCheckpointInterval(long checkpointInterval) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'restoreComplete' in a Serializable class
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/AbstractTask.java`
#### Snippet
```java
    protected final long jobID;
    protected final TaskLocation taskLocation;
    protected volatile CompletableFuture<Void> restoreComplete;
    protected volatile boolean startCalled;
    protected volatile boolean closeCalled;
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
Non-serializable field 'completableFuture' in a Serializable class
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/task/SinkAggregatedCommitterTask.java`
#### Snippet
```java

    private Map<Long, Integer> checkpointBarrierCounter;
    private CompletableFuture<Void> completableFuture;

    private volatile boolean receivedSinkWriter;
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
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/base/source/split/SnapshotSplit.java`
#### Snippet
```java
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;

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
Non-serializable field 'schema' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

    public List<String> columnsList;
    public Schema schema;
    public String keyColumn;
    public static final int TIMEOUTMS = 18000;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kuduClient' in a Serializable class
in `seatunnel-connectors-v2/connector-kudu/src/main/java/org/apache/seatunnel/connectors/seatunnel/kudu/kuduclient/KuduInputFormat.java`
#### Snippet
```java

    /** Declare the global variable KuduClient and use it to manipulate the Kudu table */
    public KuduClient kuduClient;

    /** Specify kuduMaster address */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'labelGenerator' in a Serializable class
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisStreamLoad.java`
#### Snippet
```java
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final int HTTP_TEMPORARY_REDIRECT = 200;
    private final LabelGenerator labelGenerator;
    private final byte[] lineDelimiter;
    private static final String LOAD_URL_PATTERN = "http://%s/api/%s/%s/_stream_load";
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'recordStream' in a Serializable class
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/writer/DorisStreamLoad.java`
#### Snippet
```java
    private final boolean enableDelete;
    private final Properties streamLoadProp;
    private final RecordStream recordStream;
    private Future<CloseableHttpResponse> pendingLoadFuture;
    private final CloseableHttpClient httpClient;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dorisConfig' in a Serializable class
in `seatunnel-connectors-v2/connector-doris/src/main/java/org/apache/seatunnel/connectors/doris/sink/committer/DorisCommitter.java`
#### Snippet
```java
    private static final int HTTP_TEMPORARY_REDIRECT = 200;
    private final CloseableHttpClient httpClient;
    private final DorisConfig dorisConfig;
    int maxRetry;

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

### NonSerializableFieldInSerializableClass
Non-serializable field 'rowBatch' in a Serializable class
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java
    private final SourceConfig sourceConfig;
    private final SeaTunnelRowType seaTunnelRowType;
    private StarRocksRowBatchReader rowBatch;

    private final List<Long> tabletIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/client/source/StarRocksBeReadClient.java`
#### Snippet
```java
    private static final String DEFAULT_CLUSTER_NAME = "default_cluster";

    private TStarrocksExternalService.Client client;
    private final String ip;
    private final int port;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'selectdbConfig' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/committer/SelectDBCommitter.java`
#### Snippet
```java
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final CloseableHttpClient httpClient;
    private final SelectDBConfig selectdbConfig;
    int maxRetry;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'httpClientBuilder' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final AtomicBoolean started;
    private AtomicReference<Throwable> exception = new AtomicReference<>(null);
    private HttpClientBuilder httpClientBuilder = HttpClients.custom().disableRedirectHandling();

    public SelectDBStageLoad(SelectDBConfig selectdbConfig, LabelGenerator labelGenerator) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'labelGenerator' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
public class SelectDBStageLoad implements Serializable {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final LabelGenerator labelGenerator;
    private final String lineDelimiter;
    private static final String UPLOAD_URL_PATTERN = "http://%s/copy/upload";
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'buffer' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private final Properties stageLoadProps;
    private List<String> fileList = new CopyOnWriteArrayList();
    private RecordBuffer buffer;
    private long currentCheckpointID;
    private AtomicInteger fileNum;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'selectdbConfig' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private static final String UPLOAD_URL_PATTERN = "http://%s/copy/upload";

    private final SelectDBConfig selectdbConfig;
    private String uploadUrl;
    private String hostPort;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'loadAsyncExecutor' in a Serializable class
in `seatunnel-connectors-v2/connector-selectdb-cloud/src/main/java/org/apache/seatunnel/connectors/selectdb/sink/writer/SelectDBStageLoad.java`
#### Snippet
```java
    private AtomicInteger fileNum;
    private ExecutorService loadExecutorService;
    private StageLoadAsyncExecutor loadAsyncExecutor;
    private ArrayBlockingQueue<RecordBuffer> queue;
    private final AtomicBoolean started;
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    // Grab any trailing comments on the same line
                    if (i < nodes.size() - 1) {
                        i++;
                        while (i < nodes.size()) {
                            if (nodes.get(i) instanceof ConfigNodeComment) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                    // keep searching, as there could still be a comment
                                } else {
                                    i--;
                                    break;
                                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                }
                            } else {
                                i--;
                                break;
                            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                break;
                            }
                            i++;
                        }
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                    // Grab any trailing comments on the same line
                    if (i < nodes.size() - 1) {
                        i++;
                        while (i < nodes.size()) {
                            if (nodes.get(i) instanceof ConfigNodeComment) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                    // keep searching, as there could still be a comment
                                } else {
                                    i--;
                                    break;
                                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                }
                            } else {
                                i--;
                                break;
                            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/ConfigParser.java`
#### Snippet
```java
                                break;
                            }
                            i++;
                        }
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
Assignment to for-loop parameter `i`
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/executor/FieldNamedPreparedStatement.java`
#### Snippet
```java
                paramMap.computeIfAbsent(parameterName, n -> new ArrayList<>()).add(fieldIndex);
                fieldIndex++;
                i = j - 1;
                parsedSql.append('?');
            } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/client/executor/FieldNamedPreparedStatement.java`
#### Snippet
```java
                paramMap.computeIfAbsent(parameterName, n -> new ArrayList<>()).add(fieldIndex);
                fieldIndex++;
                i = j - 1;
                parsedSql.append('?');
            } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
            for (int i = 0, j = 0; i < len; i++) {
                int c = ((byte[]) arg)[i] & 0xff;
                bytes[j++] = (byte) hex[c >> 4];
                bytes[j++] = (byte) hex[c & 0xf];
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
                int c = ((byte[]) arg)[i] & 0xff;
                bytes[j++] = (byte) hex[c >> 4];
                bytes[j++] = (byte) hex[c & 0xf];
            }
            return new String(bytes, StandardCharsets.ISO_8859_1);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
                if (newDigit != 0) {
                    if (j == 0) {
                        chars[j++] = (byte) (c & 0xdf); // Converts a-z to A-Z
                        lastDigit = newDigit;
                    } else if (newDigit <= '6') {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/sqlengine/zeta/functions/StringFunction.java`
#### Snippet
```java
                    } else if (newDigit <= '6') {
                        if (newDigit != lastDigit) {
                            chars[j++] = lastDigit = newDigit;
                        }
                    } else if (newDigit == '7') {
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FilterRowKindTransform.java`
#### Snippet
```java
        if (pluginConfig.hasPath(INCLUDE_KINDS.key())) {
            includeKinds =
                    new HashSet<>(pluginConfig.getEnumList(RowKind.class, INCLUDE_KINDS.key()));
        }
        if (pluginConfig.hasPath(EXCLUDE_KINDS.key())) {
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `seatunnel-transforms-v2/src/main/java/org/apache/seatunnel/transform/FilterRowKindTransform.java`
#### Snippet
```java
        if (pluginConfig.hasPath(EXCLUDE_KINDS.key())) {
            excludeKinds =
                    new HashSet<>(pluginConfig.getEnumList(RowKind.class, EXCLUDE_KINDS.key()));
        }
        if ((includeKinds.isEmpty() && excludeKinds.isEmpty())
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

## RuleId[id=SuspiciousMethodCalls]
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

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/source/reader/micro/CoordinatedMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/ParallelMicroBatchPartitionReader.java`
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
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-3.3/src/main/java/org/apache/seatunnel/translation/spark/source/partition/micro/CoordinatedMicroBatchPartitionReader.java`
#### Snippet
```java
            }
            // Block #next() method
            synchronized (handover) {
                final int currentCheckpoint = checkpointId;
                ReaderState readerState = snapshotState();
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `seatunnel-common/src/main/java/org/apache/seatunnel/common/config/Common.java`
#### Snippet
```java

        return Arrays.stream(paths.split(";"))
                .filter(s -> !"".equals(s))
                .filter(it -> it.endsWith(".jar"))
                .map(path -> Paths.get(URI.create(path)))
```

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
                elasticsearchClusterInfo.getElasticsearchVersion();
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

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/DebeziumJsonDeserializeSchema.java`
#### Snippet
```java
    public DebeziumJsonDeserializeSchema(Map<String, String> debeziumConfig) {
        boolean keySchemaEnable =
                Boolean.valueOf(debeziumConfig.getOrDefault(KEY_SCHEMA_ENABLE, "true"));
        boolean valueSchemaEnable =
                Boolean.valueOf(debeziumConfig.getOrDefault(VALUE_SCHEMA_ENABLE, "true"));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `seatunnel-connectors-v2/connector-cdc/connector-cdc-base/src/main/java/org/apache/seatunnel/connectors/cdc/debezium/row/DebeziumJsonDeserializeSchema.java`
#### Snippet
```java
                Boolean.valueOf(debeziumConfig.getOrDefault(KEY_SCHEMA_ENABLE, "true"));
        boolean valueSchemaEnable =
                Boolean.valueOf(debeziumConfig.getOrDefault(VALUE_SCHEMA_ENABLE, "true"));
        this.deserializationSchema =
                new CompatibleDebeziumJsonDeserializationSchema(keySchemaEnable, valueSchemaEnable);
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/source/KafkaSource.java`
#### Snippet
```java
                                        TopicPartition topicPartition =
                                                new TopicPartition(
                                                        topic, Integer.valueOf(partition));
                                        specificStartOffsets.put(topicPartition, offset);
                                    });
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.table.connector` is unnecessary and can be removed
in `seatunnel-api/src/main/java/org/apache/seatunnel/api/table/factory/TableTransformFactory.java`
#### Snippet
```java
/**
 * This is an SPI interface, used to create {@link
 * org.apache.seatunnel.api.table.connector.TableTransform}. Each plugin need to have it own
 * implementation.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobInfoCodec.java`
#### Snippet
```java
    }

    public static ClientMessage encodeResponse(com.hazelcast.internal.serialization.Data response) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobInfoCodec.java`
#### Snippet
```java

    /** */
    public static com.hazelcast.internal.serialization.Data decodeResponse(
            ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.source` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/parse/ConnectorInstanceLoader.java`
#### Snippet
```java
        if (jobContext.getJobMode() == JobMode.BATCH
                && seaTunnelSource.getBoundedness()
                        == org.apache.seatunnel.api.source.Boundedness.UNBOUNDED) {
            throw new UnsupportedOperationException(
                    String.format(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelWaitForJobCompleteCodec.java`
#### Snippet
```java

    public static ClientMessage encodeResponse(
            com.hazelcast.internal.serialization.Data jobResult) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelWaitForJobCompleteCodec.java`
#### Snippet
```java

    /** */
    public static com.hazelcast.internal.serialization.Data decodeResponse(
            ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
    private SeaTunnelPrintMessageCodec() {}

    public static ClientMessage encodeRequest(java.lang.String message) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        clientMessage.setRetryable(false);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java

    /** */
    public static java.lang.String decodeResponse(ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
        // empty initial frame
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelPrintMessageCodec.java`
#### Snippet
```java
    }

    public static java.lang.String decodeRequest(ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
        // empty initial frame
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
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobMetricsCodec.java`
#### Snippet
```java

    /** */
    public static java.lang.String decodeResponse(ClientMessage clientMessage) {
        ClientMessage.ForwardFrameIterator iterator = clientMessage.frameIterator();
        // empty initial frame
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelGetJobMetricsCodec.java`
#### Snippet
```java
    }

    public static ClientMessage encodeResponse(java.lang.String response) {
        ClientMessage clientMessage = ClientMessage.createForEncode();
        ClientMessage.Frame initialFrame =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.serialization` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-core/src/main/java/org/apache/seatunnel/engine/core/protocol/codec/SeaTunnelSubmitJobCodec.java`
#### Snippet
```java

    public static ClientMessage encodeRequest(
            long jobId, com.hazelcast.internal.serialization.Data jobImmutableInformation) {
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
     * Serialization ID of the {@link org.apache.seatunnel.engine.core.job.JobImmutableInformation}
     * class.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.client` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-client/src/main/java/org/apache/seatunnel/engine/client/SeaTunnelHazelcastClient.java`
#### Snippet
```java
        this.hazelcastClient =
                ((HazelcastClientProxy)
                                com.hazelcast.client.HazelcastClient.newHazelcastClient(
                                        clientConfig))
                        .client;
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
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
     * <p>The value of IMap is one of {@link JobStatus} {@link PipelineStatus} {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     *
     * <p>The value of IMap is one of {@link JobStatus} {@link PipelineStatus} {@link
     * org.apache.seatunnel.engine.server.execution.ExecutionState}
     *
     * <p>This IMap is used to recovery runningJobStateIMap in JobMaster when a new master node
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
     * <p>The value of IMap is one of {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * <p>The value of IMap is one of {@link
     * org.apache.seatunnel.engine.server.dag.physical.PhysicalPlan} stateTimestamps {@link
     * org.apache.seatunnel.engine.server.dag.physical.SubPlan} stateTimestamps {@link
     * org.apache.seatunnel.engine.server.dag.physical.PhysicalVertex} stateTimestamps
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/CoordinatorService.java`
#### Snippet
```java
     * org.apache.seatunnel.engine.server.dag.physical.PhysicalPlan} stateTimestamps {@link
     * org.apache.seatunnel.engine.server.dag.physical.SubPlan} stateTimestamps {@link
     * org.apache.seatunnel.engine.server.dag.physical.PhysicalVertex} stateTimestamps
     *
     * <p>This IMap is used to recovery runningJobStateTimestampsIMap in JobMaster when a new master
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.internal.diagnostics` is unnecessary, and can be replaced with an import
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/SeaTunnelHealthMonitor.java`
#### Snippet
```java
    public SeaTunnelHealthMonitor(Node node) {
        this.node = node;
        this.logger = node.getLogger(com.hazelcast.internal.diagnostics.HealthMonitor.class);
        this.metricRegistry = node.nodeEngine.getMetricsRegistry();
        this.monitorLevel = getHealthMonitorLevel();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/dag/physical/PhysicalVertex.java`
#### Snippet
```java
/**
 * PhysicalVertex is responsible for the scheduling and execution of a single task parallel Each
 * {@link org.apache.seatunnel.engine.server.dag.execution.ExecutionVertex} generates some
 * PhysicalVertex. And the number of PhysicalVertex equals the {@link
 * ExecutionVertex#getParallelism()}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.dag.physical` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
    /**
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
     * IMap key is one of jobId {@link
     * org.apache.seatunnel.engine.server.dag.physical.PipelineLocation} and {@link
     * org.apache.seatunnel.engine.server.execution.TaskGroupLocation}
     *
     * <p>The value of IMap is one of {@link JobStatus} {@link PipelineStatus} {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.engine.server.execution` is unnecessary and can be removed
in `seatunnel-engine/seatunnel-engine-server/src/main/java/org/apache/seatunnel/engine/server/master/JobHistoryService.java`
#### Snippet
```java
     *
     * <p>The value of IMap is one of {@link JobStatus} {@link PipelineStatus} {@link
     * org.apache.seatunnel.engine.server.execution.ExecutionState}
     *
     * <p>This IMap is used to recovery runningJobStateIMap in JobMaster when a new master node
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.table.type` is unnecessary and can be removed
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
/**
 * Tool class used to convert from {@link JsonNode} to {@link
 * org.apache.seatunnel.api.table.type.SeaTunnelRow}. *
 */
public class JsonToRowConverters implements Serializable {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.connector.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSinkWriter.java`
#### Snippet
```java
    @Override
    public void write(
            InputT element, org.apache.flink.api.connector.sink.SinkWriter.Context context)
            throws IOException {
        if (element instanceof Row) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.connector.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-flink/seatunnel-translation-flink-13/src/main/java/org/apache/seatunnel/translation/flink/sink/FlinkSink.java`
#### Snippet
```java
    @Override
    public SinkWriter<InputT, CommitWrapper<CommT>, FlinkWriterState<WriterStateT>> createWriter(
            org.apache.flink.api.connector.sink.Sink.InitContext context,
            List<FlinkWriterState<WriterStateT>> states)
            throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.api.sink` is unnecessary and can be removed
in `seatunnel-translation/seatunnel-translation-spark/seatunnel-translation-spark-2.4/src/main/java/org/apache/seatunnel/translation/spark/sink/writer/SparkDataWriterFactory.java`
#### Snippet
```java
    @Override
    public DataWriter<InternalRow> createDataWriter(int partitionId, long taskId, long epochId) {
        org.apache.seatunnel.api.sink.SinkWriter.Context context =
                new DefaultSinkWriterContext((int) taskId);
        SinkWriter<SeaTunnelRow, CommitInfoT, StateT> writer;
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
Qualifier `org.apache.hadoop.fs` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/catalog/S3Catalog.java`
#### Snippet
```java
        checkNotNull(tablePath, "tablePath cannot be null");
        try {
            fileSystem.create(new org.apache.hadoop.fs.Path(tablePath.getTableName()));
        } catch (FileAlreadyExistsException e) {
            if (!ignoreIfExists) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.fs` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/catalog/S3Catalog.java`
#### Snippet
```java
        try {
            return fileSystem
                    .getFileStatus(new org.apache.hadoop.fs.Path(databaseName))
                    .isDirectory();
        } catch (FileNotFoundException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.fs` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/catalog/S3Catalog.java`
#### Snippet
```java
        checkNotNull(tablePath, "tablePath cannot be null");
        try {
            fileSystem.delete(new org.apache.hadoop.fs.Path(tablePath.getDatabaseName()), true);
        } catch (IOException e) {
            throw new CatalogException(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.fs` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-file/connector-file-s3/src/main/java/org/apache/seatunnel/connectors/seatunnel/file/s3/catalog/S3Catalog.java`
#### Snippet
```java
        checkNotNull(tablePath, "tablePath cannot be null");
        try {
            fileSystem.delete(new org.apache.hadoop.fs.Path(tablePath.getTableName()), true);
        } catch (IOException e) {
            throw new CatalogException("Drop table failed", e);
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
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/catalog/mysql/MySqlCatalog.java`
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
     * Generates a query to determine if a row exists in the table. The returned string will be used
     * as a {@link java.sql.PreparedStatement}.
     *
     * <pre>{@code
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
     * <p>If supported, the returned string will be used as a {@link java.sql.PreparedStatement}.
     * Fields in the statement must be in the same order as the {@code fieldNames} parameter.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-jdbc/src/main/java/org/apache/seatunnel/connectors/seatunnel/jdbc/internal/dialect/JdbcDialect.java`
#### Snippet
```java
    /**
     * Constructs the dialects insert statement for a single row. The returned string will be used
     * as a {@link java.sql.PreparedStatement}. Fields in the statement must be in the same order as
     * the {@code fieldNames} parameter.
     *
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
                    LocalDateTime localDateTime = (LocalDateTime) row.getField(fieldIndex);
                    statement.setTimestamp(
                            statementIndex, java.sql.Timestamp.valueOf(localDateTime));
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
 * Default {@link org.apache.seatunnel.connectors.seatunnel.jdbc.internal.xa.XaFacade}
 * implementation.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.seatunnel.connectors.seatunnel.kafka.config` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-kafka/src/main/java/org/apache/seatunnel/connectors/seatunnel/kafka/catalog/KafkaCatalogFactory.java`
#### Snippet
```java
    @Override
    public String factoryIdentifier() {
        return org.apache.seatunnel.connectors.seatunnel.kafka.config.Config.CONNECTOR_IDENTITY;
    }

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
Qualifier `com.mysql.cj` is unnecessary and can be removed
in `seatunnel-connectors-v2/connector-starrocks/src/main/java/org/apache/seatunnel/connectors/seatunnel/starrocks/catalog/StarRocksCatalog.java`
#### Snippet
```java
    }

    /** @see com.mysql.cj.MysqlType */
    private SeaTunnelDataType<?> fromJdbcType(ResultSetMetaData metadata, int colIndex)
            throws SQLException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `seatunnel-connectors-v2/connector-clickhouse/src/main/java/org/apache/seatunnel/connectors/seatunnel/clickhouse/sink/inject/BigDecimalInjectFunction.java`
#### Snippet
```java
    public void injectFields(PreparedStatement statement, int index, Object value)
            throws SQLException {
        statement.setBigDecimal(index, (java.math.BigDecimal) value);
    }

```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Function, Object\>() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                Arrays.stream(rowType.getFieldTypes())
                        .map(
                                new Function<SeaTunnelDataType<?>, Object>() {
                                    @Override
                                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Anonymous2MethodRef
Anonymous new IntFunction() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                                })
                        .toArray(
                                new IntFunction<RowToJsonConverter[]>() {
                                    @Override
                                    public RowToJsonConverter[] apply(int value) {
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

### Anonymous2MethodRef
Anonymous new Function, Object\>() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                Arrays.stream(rowType.getFieldTypes())
                        .map(
                                new Function<SeaTunnelDataType<?>, Object>() {
                                    @Override
                                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Anonymous2MethodRef
Anonymous new IntFunction() can be replaced with method reference
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                                })
                        .toArray(
                                new IntFunction<JsonToRowConverter[]>() {
                                    @Override
                                    public JsonToRowConverter[] apply(int value) {
```

## RuleId[id=Java8MapApi]
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

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FlatMapFunction() can be replaced with lambda
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-13-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
                            @Override
                            public void flatMap(Row value, Collector<Row> out) throws Exception {
```

### Convert2Lambda
Anonymous new FlatMapFunction() can be replaced with lambda
in `seatunnel-core/seatunnel-flink-starter/seatunnel-flink-15-starter/src/main/java/org/apache/seatunnel/core/starter/flink/execution/TransformExecuteProcessor.java`
#### Snippet
```java
        DataStream<Row> output =
                stream.flatMap(
                        new FlatMapFunction<Row, Row>() {
                            @Override
                            public void flatMap(Row value, Collector<Row> out) throws Exception {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `seatunnel-config/seatunnel-config-shade/src/main/java/org/apache/seatunnel/shade/com/typesafe/config/impl/PropertiesParser.java`
#### Snippet
```java
        Collections.sort(
                sortedScopePaths,
                new Comparator<Path>() {
                    @Override
                    public int compare(Path a, Path b) {
```

### Convert2Lambda
Anonymous new Function, Object\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                Arrays.stream(rowType.getFieldTypes())
                        .map(
                                new Function<SeaTunnelDataType<?>, Object>() {
                                    @Override
                                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Convert2Lambda
Anonymous new IntFunction() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/RowToJsonConverters.java`
#### Snippet
```java
                                })
                        .toArray(
                                new IntFunction<RowToJsonConverter[]>() {
                                    @Override
                                    public RowToJsonConverter[] apply(int value) {
```

### Convert2Lambda
Anonymous new Consumer\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                jsonNode.fields()
                        .forEachRemaining(
                                new Consumer<Map.Entry<String, JsonNode>>() {
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
Anonymous new Function, Object\>() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                Arrays.stream(rowType.getFieldTypes())
                        .map(
                                new Function<SeaTunnelDataType<?>, Object>() {
                                    @Override
                                    public Object apply(SeaTunnelDataType<?> seaTunnelDataType) {
```

### Convert2Lambda
Anonymous new IntFunction() can be replaced with lambda
in `seatunnel-formats/seatunnel-format-json/src/main/java/org/apache/seatunnel/format/json/JsonToRowConverters.java`
#### Snippet
```java
                                })
                        .toArray(
                                new IntFunction<JsonToRowConverter[]>() {
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
    private JsonToRowConverter createMapConverter(MapType<?, ?> type) {
        JsonToRowConverter valueConverter = createConverter(type.getValueType());
        return new JsonToRowConverter() {
            @Override
            public Object convert(JsonNode jsonNode) {
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
Anonymous new FileFilter() can be replaced with lambda
in `seatunnel-plugin-discovery/src/main/java/org/apache/seatunnel/plugin/discovery/AbstractPluginDiscovery.java`
#### Snippet
```java
                        .toFile()
                        .listFiles(
                                new FileFilter() {
                                    @Override
                                    public boolean accept(File pathname) {
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
