# flink-connector-jdbc 
 
# Bad smells
I found 155 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 33 | false |
| BoundedWildcard | 31 | false |
| OptionalUsedAsFieldOrParameterType | 13 | false |
| NullableProblems | 10 | false |
| ZeroLengthArrayInitialization | 10 | false |
| ReturnNull | 7 | false |
| DeprecatedIsStillUsed | 5 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| DuplicateBranchesInSwitch | 4 | false |
| RedundantFieldInitialization | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| DoubleBraceInitialization | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| NonSerializableFieldInSerializableClass | 2 | false |
| MissingDeprecatedAnnotation | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| UnnecessaryModifier | 1 | true |
| EmptyTryBlock | 1 | false |
| OptionalContainsCollection | 1 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| AssignmentToForLoopParameter | 1 | false |
| MissortedModifiers | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| EqualsAndHashcode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| BusyWait | 1 | false |
| ArrayHashCode | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadePoolingImpl.java`
#### Snippet
```java
    public interface FacadeSupplier extends Serializable, Supplier<XaFacade> {}

    private static final transient Logger LOG = LoggerFactory.getLogger(XaFacadePoolingImpl.class);
    private final FacadeSupplier facadeSupplier;
    private transient XaFacade active;
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
                TemporaryClassLoaderContext.of(userClassLoader)) {
            // test connection, fail early if we cannot connect to database
            try (Connection conn = DriverManager.getConnection(defaultUrl, username, pwd)) {
            } catch (SQLException e) {
                throw new ValidationException(
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `JdbcUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java

/** Utils for jdbc connectors. */
public class JdbcUtils {

    private static final Logger LOG = LoggerFactory.getLogger(JdbcUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `JdbcCatalogUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/JdbcCatalogUtils.java`
#### Snippet
```java

/** Utils for {@link JdbcCatalog}. */
public class JdbcCatalogUtils {
    /**
     * URL has to be without database, like "jdbc:postgresql://localhost:5432/" or
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `String[]`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcDmlOptions.java`
#### Snippet
```java
    }

    public Optional<String[]> getKeyFields() {
        return Optional.ofNullable(keyFields);
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'InsertOrUpdateJdbcExecutor' is still used
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/InsertOrUpdateJdbcExecutor.java`
#### Snippet
```java
 */
@Internal
public final class InsertOrUpdateJdbcExecutor<R, K, V> implements JdbcBatchStatementExecutor<R> {

    private static final Logger LOG = LoggerFactory.getLogger(InsertOrUpdateJdbcExecutor.class);
```

### DeprecatedIsStillUsed
Deprecated member 'LOOKUP_CACHE_TTL' is still used
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcConnectorOptions.java`
#### Snippet
```java
    /** @deprecated please use {@link LookupOptions#PARTIAL_CACHE_EXPIRE_AFTER_WRITE} instead. */
    @Deprecated
    public static final ConfigOption<Duration> LOOKUP_CACHE_TTL =
            ConfigOptions.key("lookup.cache.ttl")
                    .durationType()
```

### DeprecatedIsStillUsed
Deprecated member 'LOOKUP_MAX_RETRIES' is still used
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcConnectorOptions.java`
#### Snippet
```java
    /** @deprecated please use {@link LookupOptions#MAX_RETRIES} instead. */
    @Deprecated
    public static final ConfigOption<Integer> LOOKUP_MAX_RETRIES =
            ConfigOptions.key("lookup.max-retries")
                    .intType()
```

### DeprecatedIsStillUsed
Deprecated member 'LOOKUP_CACHE_MAX_ROWS' is still used
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcConnectorOptions.java`
#### Snippet
```java
    /** @deprecated please use {@link LookupOptions#PARTIAL_CACHE_MAX_ROWS} instead. */
    @Deprecated
    public static final ConfigOption<Long> LOOKUP_CACHE_MAX_ROWS =
            ConfigOptions.key("lookup.cache.max-rows")
                    .longType()
```

### DeprecatedIsStillUsed
Deprecated member 'LOOKUP_CACHE_MISSING_KEY' is still used
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcConnectorOptions.java`
#### Snippet
```java
    /** @deprecated please use {@link LookupOptions#PARTIAL_CACHE_CACHE_MISSING_KEY} instead. */
    @Deprecated
    public static final ConfigOption<Boolean> LOOKUP_CACHE_MISSING_KEY =
            ConfigOptions.key("lookup.cache.caching-missing-key")
                    .booleanType()
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/JdbcCatalogUtils.java`
#### Snippet
```java
     */
    public static void validateJdbcUrl(String url) {
        String[] parts = url.trim().split("\\/+");

        checkArgument(parts.length == 2);
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `JdbcOutputFormat` on 'this' is unnecessary in this context
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                    this.scheduler.scheduleWithFixedDelay(
                            () -> {
                                synchronized (JdbcOutputFormat.this) {
                                    if (!closed) {
                                        try {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                return val -> val instanceof Integer ? ((Integer) val).shortValue() : val;
            case INTEGER:
                return val -> val;
            case BIGINT:
                return val -> val;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
                return val -> val;
            case BIGINT:
                return val -> val;
            case DECIMAL:
                final int precision = ((DecimalType) type).getPrecision();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
            case BINARY:
            case VARBINARY:
                return val -> val;
            case ARRAY:
            case ROW:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcFilterPushdownPreparedStatementVisitor.java`
#### Snippet
```java
                return Optional.of(predicate);
            case VARCHAR:
                params[0] = litExp.getValueAs(String.class).orElse(null);
                predicate.setParameters(params);
                return Optional.of(predicate);
            case BOOLEAN:
                params[0] = litExp.getValueAs(Boolean.class).orElse(null);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'parameterValues' in a Serializable class
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcRowDataInputFormat.java`
#### Snippet
```java
    private int fetchSize;
    private Boolean autoCommit;
    private Object[][] parameterValues;
    private String queryTemplate;
    private int resultSetType;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parameterValues' in a Serializable class
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcInputFormat.java`
#### Snippet
```java

    protected boolean hasNext;
    protected Object[][] parameterValues;

    public JdbcInputFormat() {}
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`predicates.size() > 0` can be replaced with '!predicates.isEmpty()'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
        predicates.addAll(this.resolvedPredicates);

        if (predicates.size() > 0) {
            String joinedConditions =
                    predicates.stream()
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/statement/FieldNamedPreparedStatementImpl.java`
#### Snippet
```java
                paramMap.computeIfAbsent(parameterName, n -> new ArrayList<>()).add(fieldIndex);
                fieldIndex++;
                i = j - 1;
                parsedSql.append('?');
            } else {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Xid`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/JdbcXaSinkFunctionState.java`
#### Snippet
```java

    static JdbcXaSinkFunctionState of(
            Collection<CheckpointAndXid> prepared, Collection<Xid> hanging) {
        return new JdbcXaSinkFunctionState(
                unmodifiableCollection(new ArrayList<>(prepared)),
```

### BoundedWildcard
Can generalize to `? super V`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java

    SimpleBatchStatementExecutor(
            String sql, JdbcStatementBuilder<V> statementBuilder, Function<T, V> valueTransformer) {
        this.sql = sql;
        this.parameterSetter = statementBuilder;
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java

    SimpleBatchStatementExecutor(
            String sql, JdbcStatementBuilder<V> statementBuilder, Function<T, V> valueTransformer) {
        this.sql = sql;
        this.parameterSetter = statementBuilder;
```

### BoundedWildcard
Can generalize to `? extends V`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/SimpleBatchStatementExecutor.java`
#### Snippet
```java

    SimpleBatchStatementExecutor(
            String sql, JdbcStatementBuilder<V> statementBuilder, Function<T, V> valueTransformer) {
        this.sql = sql;
        this.parameterSetter = statementBuilder;
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/KeyedBatchStatementExecutor.java`
#### Snippet
```java
     */
    KeyedBatchStatementExecutor(
            String sql, Function<T, K> keyExtractor, JdbcStatementBuilder<K> statementBuilder) {
        this.parameterSetter = statementBuilder;
        this.keyExtractor = keyExtractor;
```

### BoundedWildcard
Can generalize to `? extends K`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/KeyedBatchStatementExecutor.java`
#### Snippet
```java
     */
    KeyedBatchStatementExecutor(
            String sql, Function<T, K> keyExtractor, JdbcStatementBuilder<K> statementBuilder) {
        this.parameterSetter = statementBuilder;
        this.keyExtractor = keyExtractor;
```

### BoundedWildcard
Can generalize to `? super K`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/KeyedBatchStatementExecutor.java`
#### Snippet
```java
     */
    KeyedBatchStatementExecutor(
            String sql, Function<T, K> keyExtractor, JdbcStatementBuilder<K> statementBuilder) {
        this.parameterSetter = statementBuilder;
        this.keyExtractor = keyExtractor;
```

### BoundedWildcard
Can generalize to `? extends Xid`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaGroupOpsImpl.java`
#### Snippet
```java

    @Override
    public GroupXaOperationResult<Xid> failOrRollback(Collection<Xid> xids) {
        GroupXaOperationResult<Xid> result = new GroupXaOperationResult<>();
        if (xids.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableInsertOrUpdateStatementExecutor.java`
#### Snippet
```java
            JdbcRowConverter insertSetter,
            JdbcRowConverter updateSetter,
            Function<RowData, RowData> keyExtractor) {
        this.existStmtFactory = checkNotNull(existStmtFactory);
        this.insertStmtFactory = checkNotNull(insertStmtFactory);
```

### BoundedWildcard
Can generalize to `? extends RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableInsertOrUpdateStatementExecutor.java`
#### Snippet
```java
            JdbcRowConverter insertSetter,
            JdbcRowConverter updateSetter,
            Function<RowData, RowData> keyExtractor) {
        this.existStmtFactory = checkNotNull(existStmtFactory);
        this.insertStmtFactory = checkNotNull(insertStmtFactory);
```

### BoundedWildcard
Can generalize to `? super XaFacade`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadePoolingImpl.java`
#### Snippet
```java

    // WARN: action MUST leave the facade in IDLE state (i.e. not start/end/prepare any tx)
    private void runForXid(Xid xid, ThrowingConsumer<XaFacade, TransientXaException> action) {
        XaFacade mapped = mappedToXids.remove(xid);
        if (mapped == null) {
```

### BoundedWildcard
Can generalize to `? extends TransientXaException`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadePoolingImpl.java`
#### Snippet
```java

    // WARN: action MUST leave the facade in IDLE state (i.e. not start/end/prepare any tx)
    private void runForXid(Xid xid, ThrowingConsumer<XaFacade, TransientXaException> action) {
        XaFacade mapped = mappedToXids.remove(xid);
        if (mapped == null) {
```

### BoundedWildcard
Can generalize to `? extends JdbcXaSinkFunctionState`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaSinkStateHandlerImpl.java`
#### Snippet
```java
    }

    private JdbcXaSinkFunctionState merge(@Nullable Iterable<JdbcXaSinkFunctionState> states) {
        if (states == null) {
            return JdbcXaSinkFunctionState.empty();
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/statement/FieldNamedPreparedStatementImpl.java`
#### Snippet
```java
     * @return the parsed sql
     */
    public static String parseNamedStatement(String sql, Map<String, List<Integer>> paramMap) {
        StringBuilder parsedSql = new StringBuilder();
        int fieldIndex = 1; // SQL statement parameter index starts from 1
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcFilterPushdownPreparedStatementVisitor.java`
#### Snippet
```java

    public JdbcFilterPushdownPreparedStatementVisitor(
            Function<String, String> quoteIdentifierFunction) {
        this.quoteIdentifierFunction = quoteIdentifierFunction;
    }
```

### BoundedWildcard
Can generalize to `? extends ResolvedExpression`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcFilterPushdownPreparedStatementVisitor.java`
#### Snippet
```java

    private Optional<ParameterizedPredicate> renderBinaryOperator(
            String operator, List<ResolvedExpression> allOperands) {
        Optional<ParameterizedPredicate> leftOperandString = allOperands.get(0).accept(this);

```

### BoundedWildcard
Can generalize to `? extends XAException`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
#### Snippet
```java
                Xid xid,
                ThrowingRunnable<XAException> runnable,
                Function<XAException, Optional<String>> err2msg) {
            return fromRunnable(
                    action,
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java

    public TableBufferReducedStatementExecutor(
            JdbcBatchStatementExecutor<RowData> upsertExecutor,
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java
    public TableBufferReducedStatementExecutor(
            JdbcBatchStatementExecutor<RowData> upsertExecutor,
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
            Function<RowData, RowData> valueTransform) {
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java
            JdbcBatchStatementExecutor<RowData> upsertExecutor,
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
            Function<RowData, RowData> valueTransform) {
        this.upsertExecutor = upsertExecutor;
```

### BoundedWildcard
Can generalize to `? extends RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java
            JdbcBatchStatementExecutor<RowData> upsertExecutor,
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
            Function<RowData, RowData> valueTransform) {
        this.upsertExecutor = upsertExecutor;
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
            Function<RowData, RowData> valueTransform) {
        this.upsertExecutor = upsertExecutor;
        this.deleteExecutor = deleteExecutor;
```

### BoundedWildcard
Can generalize to `? extends RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferReducedStatementExecutor.java`
#### Snippet
```java
            JdbcBatchStatementExecutor<RowData> deleteExecutor,
            Function<RowData, RowData> keyExtractor,
            Function<RowData, RowData> valueTransform) {
        this.upsertExecutor = upsertExecutor;
        this.deleteExecutor = deleteExecutor;
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferedStatementExecutor.java`
#### Snippet
```java

    public TableBufferedStatementExecutor(
            JdbcBatchStatementExecutor<RowData> statementExecutor,
            Function<RowData, RowData> valueTransform) {
        this.statementExecutor = statementExecutor;
```

### BoundedWildcard
Can generalize to `? super RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferedStatementExecutor.java`
#### Snippet
```java
    public TableBufferedStatementExecutor(
            JdbcBatchStatementExecutor<RowData> statementExecutor,
            Function<RowData, RowData> valueTransform) {
        this.statementExecutor = statementExecutor;
        this.valueTransform = valueTransform;
```

### BoundedWildcard
Can generalize to `? extends RowData`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/TableBufferedStatementExecutor.java`
#### Snippet
```java
    public TableBufferedStatementExecutor(
            JdbcBatchStatementExecutor<RowData> statementExecutor,
            Function<RowData, RowData> valueTransform) {
        this.statementExecutor = statementExecutor;
        this.valueTransform = valueTransform;
```

### BoundedWildcard
Can generalize to `? extends JdbcBatchStatementExecutor`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/TableJdbcUpsertOutputFormat.java`
#### Snippet
```java
            JdbcExecutionOptions batchOptions,
            StatementExecutorFactory<JdbcBatchStatementExecutor<Row>> statementExecutorFactory,
            StatementExecutorFactory<JdbcBatchStatementExecutor<Row>>
                    deleteStatementExecutorFactory) {
        super(connectionProvider, batchOptions, statementExecutorFactory, tuple2 -> tuple2.f1);
```

### BoundedWildcard
Can generalize to `? extends JdbcExec`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private JdbcExec createAndOpenStatementExecutor(
            StatementExecutorFactory<JdbcExec> statementExecutorFactory) throws IOException {
        JdbcExec exec = statementExecutorFactory.apply(getRuntimeContext());
        try {
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
            String sql,
            int columnIndex,
            Predicate<String> filterFunc,
            Object... params) {

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcConnectorOptions.java`
#### Snippet
```java
    private final String tableName;
    private final JdbcDialect dialect;
    private final @Nullable Integer parallelism;

    private JdbcConnectorOptions(
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XidImpl.java`
#### Snippet
```java

    private final int formatId;
    @Nonnull private final byte[] globalTransactionId;
    @Nonnull private final byte[] branchQualifier;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XidImpl.java`
#### Snippet
```java
    private final int formatId;
    @Nonnull private final byte[] globalTransactionId;
    @Nonnull private final byte[] branchQualifier;

    XidImpl(int formatId, byte[] globalTransactionId, byte[] branchQualifier) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcConnectorOptions.java`
#### Snippet
```java
    private final String tableName;
    private final JdbcDialect dialect;
    private final @Nullable Integer parallelism;

    private JdbcConnectorOptions(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcTypedQueryOptions.java`
#### Snippet
```java
abstract class JdbcTypedQueryOptions implements Serializable {

    @Nullable private final int[] fieldTypes;

    JdbcTypedQueryOptions(int[] fieldTypes) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcDmlOptions.java`
#### Snippet
```java

    private final String[] fieldNames;
    @Nullable private final String[] keyFields;
    private final String tableName;
    private final JdbcDialect dialect;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcConnectionOptions.java`
#### Snippet
```java
    @Nullable protected final String driverName;
    protected final int connectionCheckTimeoutSeconds;
    @Nullable protected final String username;
    @Nullable protected final String password;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcConnectionOptions.java`
#### Snippet
```java
    protected final int connectionCheckTimeoutSeconds;
    @Nullable protected final String username;
    @Nullable protected final String password;

    protected JdbcConnectionOptions(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcConnectionOptions.java`
#### Snippet
```java

    protected final String url;
    @Nullable protected final String driverName;
    protected final int connectionCheckTimeoutSeconds;
    @Nullable protected final String username;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
    private final JdbcReadOptions readOptions;
    private final int lookupMaxRetryTimes;
    @Nullable private final LookupCache cache;
    private DataType physicalRowDataType;
    private final String dialectName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    protected final JdbcConnectionProvider connectionProvider;
    @Nullable private TypeSerializer<In> serializer;

    @Override
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transientFailure'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaGroupOps.java`
#### Snippet
```java
        private final List<T> toRetry = new ArrayList<>();
        private Optional<Exception> failure = Optional.empty();
        private Optional<Exception> transientFailure = Optional.empty();

        void failedTransiently(T x, XaFacade.TransientXaException e) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'failure'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaGroupOps.java`
#### Snippet
```java
        private final List<T> failed = new ArrayList<>();
        private final List<T> toRetry = new ArrayList<>();
        private Optional<Exception> failure = Optional.empty();
        private Optional<Exception> transientFailure = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timeoutSec'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcExactlyOnceOptions.java`
#### Snippet
```java
        private int maxCommitAttempts = DEFAULT_MAX_COMMIT_ATTEMPTS;
        private boolean allowOutOfOrderCommits = DEFAULT_ALLOW_OUT_OF_ORDER_COMMITS;
        private Optional<Integer> timeoutSec = Optional.empty();
        private boolean transactionPerConnection = DEFAULT_TRANSACTION_PER_CONNECTION;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeoutSec'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcExactlyOnceOptions.java`
#### Snippet
```java
            int maxCommitAttempts,
            boolean allowOutOfOrderCommits,
            Optional<Integer> timeoutSec,
            boolean transactionPerConnection) {
        this.discoverAndRollbackOnRecovery = discoverAndRollbackOnRecovery;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeoutSec'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcExactlyOnceOptions.java`
#### Snippet
```java

        /** Set transaction timeout in seconds (vendor-specific). */
        public JDBCExactlyOnceOptionsBuilder withTimeoutSec(Optional<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
#### Snippet
```java
        }

        private Command(String name, Optional<Xid> xid, Callable<T> callable) {
            this(name, xid, callable, e -> empty());
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'xid'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
#### Snippet
```java

    private static FlinkRuntimeException wrapException(
            String action, Optional<Xid> xid, Exception ex) {
        if (ex instanceof XAException) {
            XAException xa = (XAException) ex;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'xid'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
#### Snippet
```java

    private static String formatErrorMessage(
            String action, Optional<Xid> xid, Optional<Integer> errorCode, String... more) {
        return String.format(
                "unable to %s%s%s%s",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'errorCode'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
#### Snippet
```java

    private static String formatErrorMessage(
            String action, Optional<Xid> xid, Optional<Integer> errorCode, String... more) {
        return String.format(
                "unable to %s%s%s%s",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkpointInclusive'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/JdbcXaSinkFunction.java`
#### Snippet
```java
    }

    private void commitUpToCheckpoint(Optional<Long> checkpointInclusive) {
        Tuple2<List<CheckpointAndXid>, List<CheckpointAndXid>> splittedXids =
                split(preparedXids, checkpointInclusive, true);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkpointInclusive'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/JdbcXaSinkFunction.java`
#### Snippet
```java
    private Tuple2<List<CheckpointAndXid>, List<CheckpointAndXid>> split(
            List<CheckpointAndXid> list,
            Optional<Long> checkpointInclusive,
            boolean checkpointIntoLo) {
        return checkpointInclusive
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
1000 \* i: integer multiplication implicitly cast to long
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(1000 * i);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/executor/InsertOrUpdateJdbcExecutor.java`
#### Snippet
```java
 */
@Internal
public final class InsertOrUpdateJdbcExecutor<R, K, V> implements JdbcBatchStatementExecutor<R> {

    private static final Logger LOG = LoggerFactory.getLogger(InsertOrUpdateJdbcExecutor.class);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/JdbcCatalog.java`
#### Snippet
```java
     *     String, String)} instead.
     */
    public JdbcCatalog(
            String catalogName,
            String defaultDatabase,
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/JdbcCatalogUtils.java`
#### Snippet
```java
     */
    public static void validateJdbcUrl(String url) {
        String[] parts = url.trim().split("\\/+");

        checkArgument(parts.length == 2);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.transaction.xa` is unnecessary and can be removed
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacade.java`
#### Snippet
```java
     * Commit previously prepared transaction.
     *
     * @param ignoreUnknown whether to ignore {@link javax.transaction.xa.XAException#XAER_NOTA
     *     XAER_NOTA} error.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.transaction.xa` is unnecessary and can be removed
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacade.java`
#### Snippet
```java
     * javax.transaction.xa.XAResource#XA_RDONLY XA_RDONLY} indicating that the transaction doesn't
     * include any changes. When such a transaction is committed RM may return an error (usually,
     * {@link javax.transaction.xa.XAException#XAER_NOTA XAER_NOTA}).
     */
    class EmptyXaTransactionException extends FlinkRuntimeException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/statement/FieldNamedPreparedStatement.java`
#### Snippet
```java
     * @see PreparedStatement#setTime(int, Time)
     */
    void setTime(int fieldIndex, java.sql.Time x) throws SQLException;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/statement/FieldNamedPreparedStatement.java`
#### Snippet
```java
     * @see PreparedStatement#setTimestamp(int, Timestamp)
     */
    void setTimestamp(int fieldIndex, java.sql.Timestamp x) throws SQLException;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/statement/FieldNamedPreparedStatement.java`
#### Snippet
```java
     * @see PreparedStatement#setDate(int, Date)
     */
    void setDate(int fieldIndex, java.sql.Date x) throws SQLException;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                // http://docs.oracle.com/javase/1.5.0/docs/guide/jdbc/getstart/mapping.html
                switch (type) {
                    case java.sql.Types.NULL:
                        upload.setNull(index + 1, type);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setNull(index + 1, type);
                        break;
                    case java.sql.Types.BOOLEAN:
                    case java.sql.Types.BIT:
                        upload.setBoolean(index + 1, (boolean) field);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.BOOLEAN:
                    case java.sql.Types.BIT:
                        upload.setBoolean(index + 1, (boolean) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setBoolean(index + 1, (boolean) field);
                        break;
                    case java.sql.Types.CHAR:
                    case java.sql.Types.NCHAR:
                    case java.sql.Types.VARCHAR:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.CHAR:
                    case java.sql.Types.NCHAR:
                    case java.sql.Types.VARCHAR:
                    case java.sql.Types.LONGVARCHAR:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                    case java.sql.Types.CHAR:
                    case java.sql.Types.NCHAR:
                    case java.sql.Types.VARCHAR:
                    case java.sql.Types.LONGVARCHAR:
                    case java.sql.Types.LONGNVARCHAR:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                    case java.sql.Types.NCHAR:
                    case java.sql.Types.VARCHAR:
                    case java.sql.Types.LONGVARCHAR:
                    case java.sql.Types.LONGNVARCHAR:
                        upload.setString(index + 1, (String) field);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                    case java.sql.Types.VARCHAR:
                    case java.sql.Types.LONGVARCHAR:
                    case java.sql.Types.LONGNVARCHAR:
                        upload.setString(index + 1, (String) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setString(index + 1, (String) field);
                        break;
                    case java.sql.Types.TINYINT:
                        upload.setByte(index + 1, (byte) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setByte(index + 1, (byte) field);
                        break;
                    case java.sql.Types.SMALLINT:
                        upload.setShort(index + 1, (short) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setShort(index + 1, (short) field);
                        break;
                    case java.sql.Types.INTEGER:
                        upload.setInt(index + 1, (int) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setInt(index + 1, (int) field);
                        break;
                    case java.sql.Types.BIGINT:
                        upload.setLong(index + 1, (long) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setLong(index + 1, (long) field);
                        break;
                    case java.sql.Types.REAL:
                        upload.setFloat(index + 1, (float) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setFloat(index + 1, (float) field);
                        break;
                    case java.sql.Types.FLOAT:
                    case java.sql.Types.DOUBLE:
                        upload.setDouble(index + 1, (double) field);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.FLOAT:
                    case java.sql.Types.DOUBLE:
                        upload.setDouble(index + 1, (double) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setDouble(index + 1, (double) field);
                        break;
                    case java.sql.Types.DECIMAL:
                    case java.sql.Types.NUMERIC:
                        upload.setBigDecimal(index + 1, (java.math.BigDecimal) field);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.DECIMAL:
                    case java.sql.Types.NUMERIC:
                        upload.setBigDecimal(index + 1, (java.math.BigDecimal) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                    case java.sql.Types.DECIMAL:
                    case java.sql.Types.NUMERIC:
                        upload.setBigDecimal(index + 1, (java.math.BigDecimal) field);
                        break;
                    case java.sql.Types.DATE:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setBigDecimal(index + 1, (java.math.BigDecimal) field);
                        break;
                    case java.sql.Types.DATE:
                        upload.setDate(index + 1, (java.sql.Date) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.DATE:
                        upload.setDate(index + 1, (java.sql.Date) field);
                        break;
                    case java.sql.Types.TIME:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setDate(index + 1, (java.sql.Date) field);
                        break;
                    case java.sql.Types.TIME:
                        upload.setTime(index + 1, (java.sql.Time) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.TIME:
                        upload.setTime(index + 1, (java.sql.Time) field);
                        break;
                    case java.sql.Types.TIMESTAMP:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setTime(index + 1, (java.sql.Time) field);
                        break;
                    case java.sql.Types.TIMESTAMP:
                        upload.setTimestamp(index + 1, (java.sql.Timestamp) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.TIMESTAMP:
                        upload.setTimestamp(index + 1, (java.sql.Timestamp) field);
                        break;
                    case java.sql.Types.BINARY:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        upload.setTimestamp(index + 1, (java.sql.Timestamp) field);
                        break;
                    case java.sql.Types.BINARY:
                    case java.sql.Types.VARBINARY:
                    case java.sql.Types.LONGVARBINARY:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                        break;
                    case java.sql.Types.BINARY:
                    case java.sql.Types.VARBINARY:
                    case java.sql.Types.LONGVARBINARY:
                        upload.setBytes(index + 1, (byte[]) field);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/utils/JdbcUtils.java`
#### Snippet
```java
                    case java.sql.Types.BINARY:
                    case java.sql.Types.VARBINARY:
                    case java.sql.Types.LONGVARBINARY:
                        upload.setBytes(index + 1, (byte[]) field);
                        break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcFilterPushdownPreparedStatementVisitor.java`
#### Snippet
```java
                return Optional.of(predicate);
            case TIME_WITHOUT_TIME_ZONE:
                params[0] = litExp.getValueAs(java.sql.Time.class).orElse(null);
                predicate.setParameters(params);
                return Optional.of(predicate);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcRowConverter()` of an abstract class should not be declared 'public'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
    public abstract String converterName();

    public AbstractJdbcRowConverter(RowType rowType) {
        this.rowType = checkNotNull(rowType);
        this.fieldTypes =
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJdbcCatalog()` of an abstract class should not be declared 'public'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/AbstractJdbcCatalog.java`
#### Snippet
```java
    protected final String defaultUrl;

    public AbstractJdbcCatalog(
            ClassLoader userClassLoader,
            String catalogName,
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `deleteExecutor` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/TableJdbcUpsertOutputFormat.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(TableJdbcUpsertOutputFormat.class);

    private JdbcBatchStatementExecutor<Row> deleteExecutor;
    private final StatementExecutorFactory<JdbcBatchStatementExecutor<Row>>
            deleteStatementExecutorFactory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `serializer` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    protected final JdbcConnectionProvider connectionProvider;
    @Nullable private TypeSerializer<In> serializer;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jdbcStatementExecutor` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private final RecordExtractor<In, JdbcIn> jdbcRecordExtractor;

    private transient JdbcExec jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile Exception flushException;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private transient volatile boolean closed = false;

    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile Exception flushException;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcReadOptions.java`
#### Snippet
```java
        protected Integer numPartitions;

        protected int fetchSize = 0;
        protected boolean autoCommit = true;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
    private transient JdbcExec jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;

    private transient ScheduledExecutorService scheduler;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java

    private transient JdbcExec jdbcStatementExecutor;
    private transient int batchCount = 0;
    private transient volatile boolean closed = false;

```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/options/JdbcReadOptions.java`
#### Snippet
```java

/** Options for the JDBC scan. */
public class JdbcReadOptions implements Serializable {

    private final String query;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `number`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/SemanticXidGenerator.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/split/JdbcNumericBetweenParametersProvider.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/split/JdbcNumericBetweenParametersProvider.java`
#### Snippet
```java
        long maxElemCount = (maxVal - minVal) + 1;
        if (batchNum > maxElemCount) {
            batchNum = (int) maxElemCount;
        }
        this.batchNum = batchNum;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-14-22-12-47.697.html`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/MySqlCatalog.java`
#### Snippet
```java
                Pattern regexp = Pattern.compile("\\d+?\\.\\d+?\\.\\d+");
                Matcher matcher = regexp.matcher(driverVersion);
                return matcher.find() ? matcher.group(0) : null;
            } catch (Exception e) {
                throw new CatalogException(
```

### ReturnNull
Return of `null`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/converter/OracleRowConverter.java`
#### Snippet
```java
        switch (type.getTypeRoot()) {
            case NULL:
                return val -> null;
            case BOOLEAN:
                return val -> val instanceof NUMBER ? ((NUMBER) val).booleanValue() : val;
```

### ReturnNull
Return of `null`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
        switch (type.getTypeRoot()) {
            case NULL:
                return val -> null;
            case BOOLEAN:
            case FLOAT:
```

### ReturnNull
Return of `null`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/converter/AbstractJdbcRowConverter.java`
#### Snippet
```java
        return val -> {
            if (val == null) {
                return null;
            } else {
                return jdbcDeserializationConverter.deserialize(val);
```

### ReturnNull
Return of `null`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcRowDataInputFormat.java`
#### Snippet
```java
        try {
            if (!hasNext) {
                return null;
            }
            RowData row = rowConverter.toInternal(resultSet);
```

### ReturnNull
Return of `null`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XaFacadeImpl.java`
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
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/JdbcInputFormat.java`
#### Snippet
```java
        try {
            if (!hasNext) {
                return null;
            }
            for (int pos = 0; pos < reuse.getArity(); pos++) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                    this.scheduler.scheduleWithFixedDelay(
                            () -> {
                                synchronized (JdbcOutputFormat.this) {
                                    if (!closed) {
                                        try {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XidSerializer.java`
#### Snippet
```java
    @Override
    public Xid createInstance() {
        return new XidImpl(0, new byte[0], new byte[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/xa/XidSerializer.java`
#### Snippet
```java
    @Override
    public Xid createInstance() {
        return new XidImpl(0, new byte[0], new byte[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/ParameterizedPredicate.java`
#### Snippet
```java
    public ParameterizedPredicate(String predicate) {
        this.predicate = predicate;
        this.parameters = new Serializable[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
                        options,
                        lookupMaxRetryTimes,
                        DataType.getFieldNames(physicalRowDataType).toArray(new String[0]),
                        DataType.getFieldDataTypes(physicalRowDataType).toArray(new DataType[0]),
                        keyNames,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
                        lookupMaxRetryTimes,
                        DataType.getFieldNames(physicalRowDataType).toArray(new String[0]),
                        DataType.getFieldDataTypes(physicalRowDataType).toArray(new DataType[0]),
                        keyNames,
                        rowType);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
                dialect.getSelectFromStatement(
                        options.getTableName(),
                        DataType.getFieldNames(physicalRowDataType).toArray(new String[0]),
                        new String[0]);
        final List<String> predicates = new ArrayList<String>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
                        options.getTableName(),
                        DataType.getFieldNames(physicalRowDataType).toArray(new String[0]),
                        new String[0]);
        final List<String> predicates = new ArrayList<String>();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
    private long limit = -1;
    private List<String> resolvedPredicates = new ArrayList<>();
    private Serializable[] pushdownParams = new Serializable[0];

    public JdbcDynamicTableSource(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSink.java`
#### Snippet
```java
        builder.setRowDataTypeInfo(rowDataTypeInformation);
        builder.setFieldDataTypes(
                DataType.getFieldDataTypes(physicalRowDataType).toArray(new DataType[0]));
        return SinkFunctionProvider.of(
                new GenericJdbcSinkFunction<>(builder.build()), jdbcOptions.getParallelism());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableFactory.java`
#### Snippet
```java
                .withTableName(jdbcOptions.getTableName())
                .withDialect(jdbcOptions.getDialect())
                .withFieldNames(DataType.getFieldNames(dataType).toArray(new String[0]))
                .withKeyFields(keyFields.length > 0 ? keyFields : null)
                .build();
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/internal/JdbcOutputFormat.java`
#### Snippet
```java
                }
                try {
                    Thread.sleep(1000 * i);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/PostgresCatalog.java`
#### Snippet
```java

    private static final Set<String> builtinSchemas =
            new HashSet<String>() {
                {
                    add("pg_toast");
```

### DoubleBraceInitialization
Double brace initialization
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/PostgresCatalog.java`
#### Snippet
```java

    private static final Set<String> builtinDatabases =
            new HashSet<String>() {
                {
                    add("template0");
```

### DoubleBraceInitialization
Double brace initialization
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/MySqlCatalog.java`
#### Snippet
```java

    private static final Set<String> builtinDatabases =
            new HashSet<String>() {
                {
                    add("information_schema");
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
                limit,
                resolvedPredicates,
                pushdownParams);
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `tables` initializer `null` is redundant
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/PostgresCatalog.java`
#### Snippet
```java
    public boolean tableExists(ObjectPath tablePath) throws CatalogException {

        List<String> tables = null;
        try {
            tables = listTables(tablePath.getDatabaseName());
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `path != null` is always `true`
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/catalog/PostgresTablePath.java`
#### Snippet
```java

            checkArgument(
                    path != null && path.length == 2,
                    String.format(
                            "Table name '%s' is not valid. The parsed length is %d",
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java

        if (readOptions.getPartitionColumnName().isPresent()) {
            long lowerBound = readOptions.getPartitionLowerBound().get();
            long upperBound = readOptions.getPartitionUpperBound().get();
            int numPartitions = readOptions.getNumPartitions().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
        if (readOptions.getPartitionColumnName().isPresent()) {
            long lowerBound = readOptions.getPartitionLowerBound().get();
            long upperBound = readOptions.getPartitionUpperBound().get();
            int numPartitions = readOptions.getNumPartitions().get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-jdbc/src/main/java/org/apache/flink/connector/jdbc/table/JdbcDynamicTableSource.java`
#### Snippet
```java
            long lowerBound = readOptions.getPartitionLowerBound().get();
            long upperBound = readOptions.getPartitionUpperBound().get();
            int numPartitions = readOptions.getNumPartitions().get();

            Serializable[][] allPushdownParams = replicatePushdownParamsForN(numPartitions);
```

