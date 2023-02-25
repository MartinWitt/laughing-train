# shardingsphere 
 
# Bad smells
I found 1308 bad smells with 158 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 306 | false |
| ReturnNull | 263 | false |
| UtilityClassWithoutPrivateConstructor | 88 | true |
| CastConflictsWithInstanceof | 79 | false |
| RedundantSuppression | 75 | false |
| NonProtectedConstructorInAbstractClass | 57 | true |
| InjectedReferences | 51 | false |
| EmptyMethod | 40 | false |
| UnstableApiUsage | 34 | false |
| OptionalContainsCollection | 26 | false |
| DynamicRegexReplaceableByCompiledPattern | 26 | false |
| DataFlowIssue | 22 | false |
| AssignmentToStaticFieldFromInstanceMethod | 21 | false |
| ZeroLengthArrayInitialization | 19 | false |
| UseOfPropertiesAsHashtable | 14 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| CallToStringConcatCanBeReplacedByOperator | 12 | false |
| NestedAssignment | 11 | false |
| ConstantValue | 11 | false |
| RedundantImplements | 10 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| FieldMayBeStatic | 9 | false |
| TrivialStringConcatenation | 8 | false |
| SynchronizeOnThis | 8 | false |
| RegExpSimplifiable | 7 | false |
| ReplaceAssignmentWithOperatorAssignment | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| NullableProblems | 5 | false |
| HtmlWrongAttributeValue | 5 | false |
| RegExpRedundantEscape | 4 | false |
| SetReplaceableByEnumSet | 4 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| IgnoreResultOfCall | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| InstanceofCatchParameter | 3 | false |
| ComparatorMethodParameterNotUsed | 3 | false |
| AssignmentToLambdaParameter | 3 | false |
| DuplicateBranchesInSwitch | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| OptionalAssignedToNull | 2 | false |
| EqualsAndHashcode | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| SystemOutErr | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| TestCaseWithConstructor | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| MagicConstant | 1 | false |
| StaticCallOnSubclass | 1 | false |
| CastToIncompatibleInterface | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| RedundantMethodOverride | 1 | false |
| Lombok | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| DoubleBraceInitialization | 1 | false |
| UnusedAssignment | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| AssignmentUsedAsCondition | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| Convert2MethodRef | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| BusyWait | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
                RexInputRef reference = (RexInputRef) each;
                String referenceName = reference.getName();
                Integer columnId = Integer.valueOf(referenceName.replace("$", ""));
                Integer columnType = translatableTable.getColumnType(columnId);
                columnMap.put(columnId, columnType);
```

## RuleId[ruleID=MagicConstant]
### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
        }
        if (null != connectionSession.getIsolationLevel()) {
            connection.setTransactionIsolation(TransactionUtil.getTransactionIsolationLevel(connectionSession.getIsolationLevel()));
        }
    }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `valueOf()` declared in class 'java.lang.Enum' but referenced via subclass 'null'
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/authentication/AuthenticatorFactory.java`
#### Snippet
```java
    private E getAuthenticatorType(final String authenticationMethod) {
        try {
            return E.valueOf(authenticatorTypeClass, authenticationMethod.toUpperCase());
        } catch (final IllegalArgumentException ignored) {
            return Arrays.stream(authenticatorTypeClass.getEnumConstants()).filter(AuthenticatorType::isDefault).findAny().orElseThrow(IllegalArgumentException::new);
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `byteBuddyAgent` from instance context
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/AgentRunner.java`
#### Snippet
```java
        ByteBuddyAgent.install();
        Collection<String> classes = new HashSet<>(Arrays.asList(ENHANCEMENT_CLASSES));
        byteBuddyAgent = new AgentBuilder.Default()
                .with(new ByteBuddy().with(TypeValidation.ENABLED))
                .type(ElementMatchers.namedOneOf(ENHANCEMENT_CLASSES))
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/PostgreSQLXAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(connection.unwrap(jdbcConnectionClass));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/PostgreSQLXAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OracleXAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(connection.unwrap(jdbcConnectionClass));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OracleXAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MariaDBXAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionConstructor` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OracleXAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionConstructor` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MariaDBXAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MariaDBXAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(connection.unwrap(jdbcConnectionClass));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionConstructor` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/PostgreSQLXAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MySQLXAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionCreatorMethod = getXAConnectionCreatorMethod();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionCreatorMethod` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MySQLXAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionCreatorMethod = getXAConnectionCreatorMethod();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/MySQLXAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(xaDataSource, connection.unwrap(jdbcConnectionClass));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OpenGaussXAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionConstructor` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OpenGaussXAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/OpenGaussXAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(connection.unwrap(jdbcConnectionClass));
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jdbcConnectionClass` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/H2XAConnectionWrapper.java`
#### Snippet
```java
    
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
        nextIdMethod = getNextIdMethod();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `xaConnectionConstructor` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/H2XAConnectionWrapper.java`
#### Snippet
```java
    private void loadReflection() {
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
        nextIdMethod = getNextIdMethod();
        dataSourceFactory = createDataSourceFactory();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `nextIdMethod` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/H2XAConnectionWrapper.java`
#### Snippet
```java
        jdbcConnectionClass = getJDBCConnectionClass();
        xaConnectionConstructor = getXAConnectionConstructor();
        nextIdMethod = getNextIdMethod();
        dataSourceFactory = createDataSourceFactory();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `dataSourceFactory` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/H2XAConnectionWrapper.java`
#### Snippet
```java
        xaConnectionConstructor = getXAConnectionConstructor();
        nextIdMethod = getNextIdMethod();
        dataSourceFactory = createDataSourceFactory();
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `initialized` from instance context
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/connection/dialect/H2XAConnectionWrapper.java`
#### Snippet
```java
        if (!initialized) {
            loadReflection();
            initialized = true;
        }
        return createXAConnection(connection.unwrap(jdbcConnectionClass));
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/OracleDataSourceMetaData.java`
#### Snippet
```java
    private final String schema;
    
    private final Pattern thinUrlPattern = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@(//)?([\\w\\-\\.]+):?([0-9]*)[:/]([\\w\\-]+)", Pattern.CASE_INSENSITIVE);
    
    private final Pattern connectDescriptorUrlPattern = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@[(\\w\\s=)]+HOST\\s*=\\s*([\\w\\-\\.]+).*PORT\\s*=\\s*(\\d+).*SERVICE_NAME\\s*=\\s*(\\w+)\\)");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/OracleDataSourceMetaData.java`
#### Snippet
```java
    private final Pattern thinUrlPattern = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@(//)?([\\w\\-\\.]+):?([0-9]*)[:/]([\\w\\-]+)", Pattern.CASE_INSENSITIVE);
    
    private final Pattern connectDescriptorUrlPattern = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@[(\\w\\s=)]+HOST\\s*=\\s*([\\w\\-\\.]+).*PORT\\s*=\\s*(\\d+).*SERVICE_NAME\\s*=\\s*(\\w+)\\)");
    
    public OracleDataSourceMetaData(final String url, final String username) {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/SQLServerDataSourceMetaData.java`
#### Snippet
```java
    private final String schema;
    
    private final Pattern pattern = Pattern.compile("jdbc:(microsoft:)?sqlserver://([\\w\\-\\.]+):?([0-9]*);\\S*(DatabaseName|database)=([\\w\\-\\.]+);?", Pattern.CASE_INSENSITIVE);
    
    public SQLServerDataSourceMetaData(final String url) {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/SQLServerDataSourceMetaData.java`
#### Snippet
```java
    private final String schema;
    
    private final Pattern pattern = Pattern.compile("jdbc:(microsoft:)?sqlserver://([\\w\\-\\.]+):?([0-9]*);\\S*(DatabaseName|database)=([\\w\\-\\.]+);?", Pattern.CASE_INSENSITIVE);
    
    public SQLServerDataSourceMetaData(final String url) {
```

## RuleId[ruleID=CastToIncompatibleInterface]
### CastToIncompatibleInterface
Cast to incompatible interface `TargetAdviceObject`
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractJDBCExecutorCallbackAdviceTest.java`
#### Snippet
```java
        storageTypes = Collections.singletonMap(dataSourceName, new MySQLDatabaseType());
        Plugins.getMemberAccessor().set(JDBCExecutorCallback.class.getDeclaredField("storageTypes"), mockedJDBCExecutorCallback, storageTypes);
        targetObject = (TargetAdviceObject) mockedJDBCExecutorCallback;
    }
    
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `handlers.keySet()` may be replaced with 'entrySet()' iteration
in `proxy/backend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/backend/mysql/handler/admin/MySQLSetVariableAdminExecutor.java`
#### Snippet
```java
        Map<String, MySQLSessionVariableHandler> handlers = sessionVariables.keySet().stream()
                .collect(Collectors.toMap(Function.identity(), value -> TypedSPILoader.getService(MySQLSessionVariableHandler.class, value)));
        for (String each : handlers.keySet()) {
            handlers.get(each).handle(connectionSession, each, sessionVariables.get(each));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `dataNodeMap.keySet()` may be replaced with 'entrySet()' iteration
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/datanode/SingleTableDataNodeLoader.java`
#### Snippet
```java
        for (Entry<String, DataSource> entry : dataSourceMap.entrySet()) {
            Map<String, Collection<DataNode>> dataNodeMap = load(databaseName, databaseType, entry.getKey(), entry.getValue(), excludedTables);
            for (String each : dataNodeMap.keySet()) {
                Collection<DataNode> addedDataNodes = dataNodeMap.get(each);
                Collection<DataNode> existDataNodes = result.getOrDefault(each.toLowerCase(), new LinkedHashSet<>(addedDataNodes.size(), 1));
```

### KeySetIterationMayUseEntrySet
Iteration over `groupedDataSourceDataNodesMap.keySet()` may be replaced with 'entrySet()' iteration
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/util/JobDataNodeLineConvertUtil.java`
#### Snippet
```java
        List<Pair<String, JobDataNodeLine>> result = new LinkedList<>();
        Map<String, Map<String, List<DataNode>>> groupedDataSourceDataNodesMap = groupDataSourceDataNodesMapByDataSourceName(actualDataNodes);
        for (String each : groupedDataSourceDataNodesMap.keySet()) {
            List<JobDataNodeEntry> dataNodeEntries = new LinkedList<>();
            for (Entry<String, List<DataNode>> entry : groupedDataSourceDataNodesMap.get(each).entrySet()) {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
                return Double.class;
            case 1:
                return String.class;
            case 12:
                return String.class;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
                return String.class;
            case 12:
                return String.class;
            case 91:
                return Date.class;
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `DatabaseConnector` on 'this' is unnecessary in this context
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/DatabaseConnector.java`
#### Snippet
```java
        this.backendConnection = backendConnection;
        if (sqlStatementContext instanceof CursorAvailable) {
            DatabaseConnector.this.prepareCursorStatementContext((CursorAvailable) sqlStatementContext, backendConnection.getConnectionSession());
        }
        proxySQLExecutor = new ProxySQLExecutor(driverType, backendConnection, this);
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/persist/node/ComputeNode.java`
#### Snippet
```java
     */
    public static String getInstanceIdByComputeNode(final String computeNodePath) {
        Pattern pattern = Pattern.compile(getComputeNodePath() + "(/status|/worker_id|/labels)" + "/([\\S]+)$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(computeNodePath);
        return matcher.find() ? matcher.group(2) : "";
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private static Matcher getKillProcessListIdMatcher(final DataChangedEvent event) {
        Pattern pattern = Pattern.compile(ComputeNode.getProcessKillNodePatch() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(event.getKey());
    }
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private static Matcher getKillProcessListIdMatcher(final DataChangedEvent event) {
        Pattern pattern = Pattern.compile(ComputeNode.getProcessKillNodePatch() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(event.getKey());
    }
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher matchInstanceOnlinePath(final String onlineInstancePath) {
        return Pattern.compile(ComputeNode.getOnlineInstanceNodePath() + "/([\\S]+)/([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(onlineInstancePath);
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher matchInstanceOnlinePath(final String onlineInstancePath) {
        return Pattern.compile(ComputeNode.getOnlineInstanceNodePath() + "/([\\S]+)/([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(onlineInstancePath);
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private static Matcher getShowProcessTriggerMatcher(final DataChangedEvent event) {
        return Pattern.compile(ComputeNode.getProcessTriggerNodePatch() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(event.getKey());
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private static Matcher getShowProcessTriggerMatcher(final DataChangedEvent event) {
        return Pattern.compile(ComputeNode.getProcessTriggerNodePatch() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(event.getKey());
    }
    
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`0 != name.length()` can be replaced with '!name.isEmpty()'
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/ShardingSphereSavepoint.java`
#### Snippet
```java
    
    public ShardingSphereSavepoint(final String name) throws SQLException {
        ShardingSpherePreconditions.checkState(null != name && 0 != name.length(), () -> new SQLFeatureNotSupportedException("Savepoint name can not be NULL or empty"));
        savepointName = name;
    }
```

### SizeReplaceableByIsEmpty
`0 != expected.getTables().size()` can be replaced with '!expected.getTables().isEmpty()'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/sqlserver/SQLServerRevokeStatementAssert.java`
#### Snippet
```java
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SQLServerRevokeStatement actual, final RevokeStatementTestCase expected) {
        if (0 != expected.getTables().size()) {
            TableAssert.assertIs(assertContext, actual.getTables(), expected.getTables());
        }
```

### SizeReplaceableByIsEmpty
`0 != expected.getColumns().size()` can be replaced with '!expected.getColumns().isEmpty()'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/sqlserver/SQLServerRevokeStatementAssert.java`
#### Snippet
```java
            TableAssert.assertIs(assertContext, actual.getTables(), expected.getTables());
        }
        if (0 != expected.getColumns().size()) {
            ColumnAssert.assertIs(assertContext, actual.getColumns(), expected.getColumns());
        }
```

### SizeReplaceableByIsEmpty
`0 != expected.getTables().size()` can be replaced with '!expected.getTables().isEmpty()'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/sqlserver/SQLServerGrantStatementAssert.java`
#### Snippet
```java
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SQLServerGrantStatement actual, final GrantStatementTestCase expected) {
        if (0 != expected.getTables().size()) {
            TableAssert.assertIs(assertContext, actual.getTables(), expected.getTables());
        }
```

### SizeReplaceableByIsEmpty
`0 != expected.getColumns().size()` can be replaced with '!expected.getColumns().isEmpty()'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/sqlserver/SQLServerGrantStatementAssert.java`
#### Snippet
```java
            TableAssert.assertIs(assertContext, actual.getTables(), expected.getTables());
        }
        if (0 != expected.getColumns().size()) {
            ColumnAssert.assertIs(assertContext, actual.getColumns(), expected.getColumns());
        }
```

### SizeReplaceableByIsEmpty
`splitAndEvaluate.size() == 0` can be replaced with 'splitAndEvaluate.isEmpty()'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/expr/EspressoInlineExpressionParser.java`
#### Snippet
```java
        });
        // GraalVM Truffle Espresso 22.3.1 has a different behavior for generic List than Hotspot.
        return splitAndEvaluate.size() == 0 ? Collections.emptyList() : splitAndEvaluate;
    }
    
```

### SizeReplaceableByIsEmpty
`stringVal.length() > 0` can be replaced with '!stringVal.isEmpty()'
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/result/query/impl/driver/jdbc/type/util/ResultSetUtil.java`
#### Snippet
```java
        }
        String stringVal = value.toString();
        if (stringVal.length() > 0) {
            int firstChar = Character.toLowerCase(stringVal.charAt(0));
            return 't' == firstChar || 'y' == firstChar || '1' == firstChar || "-1".equals(stringVal);
```

### SizeReplaceableByIsEmpty
`uniqueKeyColumns.size() > 0` can be replaced with '!uniqueKeyColumns.isEmpty()'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/config/ingest/InventoryDumperConfiguration.java`
#### Snippet
```java
     */
    public boolean hasUniqueKey() {
        return null != uniqueKeyColumns && uniqueKeyColumns.size() > 0;
    }
}
```

### SizeReplaceableByIsEmpty
`incrementalTasks.size() > 0` can be replaced with '!incrementalTasks.isEmpty()'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/AbstractInventoryIncrementalJobAPIImpl.java`
#### Snippet
```java
    
    private JobItemIncrementalTasksProgress getIncrementalTasksProgress(final Collection<IncrementalTask> incrementalTasks) {
        IncrementalTask incrementalTask = incrementalTasks.size() > 0 ? incrementalTasks.iterator().next() : null;
        return new JobItemIncrementalTasksProgress(null != incrementalTask ? incrementalTask.getTaskProgress() : null);
    }
```

### SizeReplaceableByIsEmpty
`primaryKeys.size() > 0` can be replaced with '!primaryKeys.isEmpty()'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/metadata/loader/PipelineTableMetaDataUtil.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkNotNull(tableMetaData, () -> new SplitPipelineJobByRangeException(tableName, "Can not get table meta data"));
        List<String> primaryKeys = tableMetaData.getPrimaryKeyColumns();
        if (primaryKeys.size() > 0) {
            return primaryKeys.stream().map(tableMetaData::getColumnMetaData).collect(Collectors.toList());
        }
```

### SizeReplaceableByIsEmpty
`0 == props.getProperty(atLeastOneCharConfigKey).length()` can be replaced with 'props.getProperty(atLeastOneCharConfigKey).isEmpty()'
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/MaskAlgorithmPropsChecker.java`
#### Snippet
```java
            throw new MaskAlgorithmInitializationException(maskType, String.format("%s can not be null", atLeastOneCharConfigKey));
        }
        if (0 == props.getProperty(atLeastOneCharConfigKey).length()) {
            throw new MaskAlgorithmInitializationException(maskType, String.format("%s's length must be at least one", atLeastOneCharConfigKey));
        }
```

### SizeReplaceableByIsEmpty
`0 == line.length()` can be replaced with 'line.isEmpty()'
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/replace/TelephoneRandomReplaceAlgorithm.java`
#### Snippet
```java
            @Override
            public boolean processLine(final String line) {
                if (line.startsWith("#") || 0 == line.length()) {
                    return true;
                } else {
```

### SizeReplaceableByIsEmpty
`0 == line.length()` can be replaced with 'line.isEmpty()'
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/like/CharDigestLikeEncryptAlgorithm.java`
#### Snippet
```java
            @Override
            public boolean processLine(final String line) {
                if (line.startsWith("#") || 0 == line.length()) {
                    return true;
                } else {
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/AbstractPipelineJobAPIImpl.java`
#### Snippet
```java
        jobConfigPOJO.setDisabled(true);
        jobConfigPOJO.getProps().setProperty("stop_time", LocalDateTime.now().format(DATE_TIME_FORMATTER));
        jobConfigPOJO.getProps().setProperty("stop_time_millis", System.currentTimeMillis() + "");
        String barrierPath = PipelineMetaDataNode.getJobBarrierDisablePath(jobId);
        pipelineDistributedBarrier.register(barrierPath, jobConfigPOJO.getShardingTotalCount());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/AbstractPipelineJobAPIImpl.java`
#### Snippet
```java
        String createTimeFormat = LocalDateTime.now().format(DATE_TIME_FORMATTER);
        result.getProps().setProperty("create_time", createTimeFormat);
        result.getProps().setProperty("start_time_millis", System.currentTimeMillis() + "");
        return result;
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/AbstractPipelineJobAPIImpl.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkState(jobConfigPOJO.isDisabled(), () -> new PipelineJobHasAlreadyStartedException(jobId));
        jobConfigPOJO.setDisabled(false);
        jobConfigPOJO.getProps().setProperty("start_time_millis", System.currentTimeMillis() + "");
        jobConfigPOJO.getProps().remove("stop_time");
        jobConfigPOJO.getProps().remove("stop_time_millis");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `features/sharding/plugin/cosid/src/main/java/org/apache/shardingsphere/sharding/cosid/algorithm/keygen/CosIdSnowflakeKeyGenerateAlgorithm.java`
#### Snippet
```java
    
    private long getEpoch(final Properties props) {
        return Long.parseLong(props.getProperty(EPOCH_KEY, DEFAULT_EPOCH + ""));
    }
    
```

### TrivialStringConcatenation
Empty string used in concatenation
in `features/sharding/plugin/cosid/src/main/java/org/apache/shardingsphere/sharding/cosid/algorithm/sharding/interval/CosIdSnowflakeIntervalShardingAlgorithm.java`
#### Snippet
```java
    
    private SnowflakeIdStateParser getSnowflakeIdStateParser(final Properties props) {
        long epoch = Long.parseLong(props.getProperty(EPOCH_KEY, CosIdSnowflakeKeyGenerateAlgorithm.DEFAULT_EPOCH + ""));
        return new MillisecondSnowflakeIdStateParser(
                epoch, MillisecondSnowflakeId.DEFAULT_TIMESTAMP_BIT, MillisecondSnowflakeId.DEFAULT_MACHINE_BIT, MillisecondSnowflakeId.DEFAULT_SEQUENCE_BIT, getZoneId());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/packet/command/generic/OpenGaussErrorResponsePacket.java`
#### Snippet
```java
        }
        if (serverErrorMessage.getPosition() > 0) {
            fields.put(FIELD_TYPE_POSITION, serverErrorMessage.getPosition() + "");
        }
        if (serverErrorMessage.getInternalPosition() > 0) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/packet/command/generic/OpenGaussErrorResponsePacket.java`
#### Snippet
```java
        }
        if (serverErrorMessage.getInternalPosition() > 0) {
            fields.put(FIELD_TYPE_INTERNAL_POSITION, serverErrorMessage.getInternalPosition() + "");
        }
        if (null != serverErrorMessage.getInternalQuery()) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/packet/command/generic/OpenGaussErrorResponsePacket.java`
#### Snippet
```java
        }
        if (serverErrorMessage.getLine() > 0) {
            fields.put(FIELD_TYPE_LINE, serverErrorMessage.getLine() + "");
        }
        if (null != serverErrorMessage.getRoutine()) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DatabaseRequiredBackendHandler` has no concrete subclass
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/DatabaseRequiredBackendHandler.java`
#### Snippet
```java
@RequiredArgsConstructor
@Getter
public abstract class DatabaseRequiredBackendHandler<T extends SQLStatement> implements DistSQLBackendHandler {
    
    private final T sqlStatement;
```

### AbstractClassNeverImplemented
Abstract class `PostgreSQLLexerBase` has no concrete subclass
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/parser/PostgreSQLLexerBase.java`
#### Snippet
```java
 * Postgre SQL Lexer Base.
 */
public abstract class PostgreSQLLexerBase extends Lexer {
    
    private final Deque<String> tags = new ArrayDeque<>();
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/datasource/ShardingSphereDataSource.java`
#### Snippet
```java
    
    private ContextManager createContextManager(final String databaseName, final ModeConfiguration modeConfig, final Map<String, DataSource> dataSourceMap,
                                                final Collection<RuleConfiguration> ruleConfigs, final Properties props) throws SQLException {
        InstanceMetaData instanceMetaData = TypedSPILoader.getService(InstanceMetaDataBuilder.class, "JDBC").build(-1);
        Collection<RuleConfiguration> globalRuleConfigs = ruleConfigs.stream().filter(each -> each instanceof GlobalRuleConfiguration).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends InstanceMetaData`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/connection/ConnectionManager.java`
#### Snippet
```java
    }
    
    private Map<String, DataSourceProperties> createDataSourcePropertiesMap(final Collection<InstanceMetaData> instances, final Collection<ShardingSphereUser> users,
                                                                            final DataSourceProperties dataSourcePropsSample, final String schema) {
        Map<String, DataSourceProperties> result = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends SQLException`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/executor/ForceExecuteTemplate.java`
#### Snippet
```java
    }
    
    private void throwSQLExceptionIfNecessary(final Collection<SQLException> exceptions) throws SQLException {
        if (exceptions.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/executor/ForceExecuteTemplate.java`
#### Snippet
```java
     * @throws SQLException throw SQL exception after all targets are executed
     */
    public void execute(final Collection<T> targets, final ForceExecuteCallback<T> callback) throws SQLException {
        Collection<SQLException> exceptions = new LinkedList<>();
        for (T each : targets) {
```

### BoundedWildcard
Can generalize to `? super T`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/executor/ForceExecuteTemplate.java`
#### Snippet
```java
     * @throws SQLException throw SQL exception after all targets are executed
     */
    public void execute(final Collection<T> targets, final ForceExecuteCallback<T> callback) throws SQLException {
        Collection<SQLException> exceptions = new LinkedList<>();
        for (T each : targets) {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/context/JDBCContext.java`
#### Snippet
```java
    }
    
    private Optional<CachedDatabaseMetaData> createCachedDatabaseMetaData(final Map<String, DataSource> dataSources) throws SQLException {
        if (dataSources.isEmpty()) {
            return Optional.empty();
```

### BoundedWildcard
Can generalize to `? extends ResultSet`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
    }
    
    private List<QueryResult> getQueryResults(final List<ResultSet> resultSets) throws SQLException {
        List<QueryResult> result = new ArrayList<>(resultSets.size());
        for (ResultSet each : resultSets) {
```

### BoundedWildcard
Can generalize to `? extends ExecuteResult`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
    }
    
    private int accumulate(final Collection<ExecuteResult> results) {
        int result = 0;
        for (ExecuteResult each : results) {
```

### BoundedWildcard
Can generalize to `? extends ShardingSphereRule`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/executor/DriverJDBCExecutor.java`
#### Snippet
```java
    }
    
    private boolean isNeedAccumulate(final Collection<ShardingSphereRule> rules, final SQLStatementContext<?> sqlStatementContext) {
        for (ShardingSphereRule each : rules) {
            if (each instanceof DataNodeContainedRule && ((DataNodeContainedRule) each).isNeedAccumulate(sqlStatementContext.getTablesContext().getTableNames())) {
```

### BoundedWildcard
Can generalize to `? extends ResultSet`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
    }
    
    private List<QueryResult> getQueryResults(final List<ResultSet> resultSets) throws SQLException {
        List<QueryResult> result = new ArrayList<>(resultSets.size());
        for (ResultSet each : resultSets) {
```

### BoundedWildcard
Can generalize to `? extends ExecuteResult`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
    }
    
    private int accumulate(final Collection<ExecuteResult> results) {
        int result = 0;
        for (ExecuteResult each : results) {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/persist/MetaDataPersistService.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> mergeEffectiveDataSources(final Map<String, DataSourceProperties> persistedDataSourcePropsMap, final Map<String, DataSource> localConfiguredDataSources) {
        Map<String, DataSource> result = new LinkedHashMap<>(persistedDataSourcePropsMap.size(), 1);
        for (Entry<String, DataSourceProperties> entry : persistedDataSourcePropsMap.entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends DatabaseConfiguration`
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
    }
    
    private static void checkDataSourceStates(final Map<String, DatabaseConfiguration> databaseConfigs, final Map<String, StorageNodeDataSource> storageNodes, final boolean force) {
        Map<String, DataSourceState> storageDataSourceStates = getStorageDataSourceStates(storageNodes);
        databaseConfigs.forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? extends DatabaseConfiguration`
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
    
    private static DatabaseConfiguration createEffectiveDatabaseConfiguration(final String databaseName,
                                                                              final Map<String, DatabaseConfiguration> databaseConfigs, final MetaDataPersistService persistService) {
        Map<String, DataSource> effectiveDataSources = persistService.getEffectiveDataSources(databaseName, databaseConfigs);
        Collection<RuleConfiguration> databaseRuleConfigs = persistService.getDatabaseRulePersistService().load(databaseName);
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `mode/core/src/main/java/org/apache/shardingsphere/mode/manager/switcher/ResourceSwitchManager.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> getStaleDataSources(final Map<String, DataSource> dataSources, final Map<String, DataSourceProperties> toBeDeletedDataSourceProps) {
        return dataSources.entrySet().stream().filter(entry -> toBeDeletedDataSourceProps.containsKey(entry.getKey())).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
    }
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `mode/core/src/main/java/org/apache/shardingsphere/mode/manager/switcher/ResourceSwitchManager.java`
#### Snippet
```java
    }
    
    private boolean isModifiedDataSource(final Map<String, DataSource> originalDataSources, final String dataSourceName, final DataSourceProperties dataSourceProps) {
        return originalDataSources.containsKey(dataSourceName) && !dataSourceProps.equals(DataSourcePropertiesCreator.create(originalDataSources.get(dataSourceName)));
    }
```

### BoundedWildcard
Can generalize to `? extends Instance`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/listener/NamingEventListener.java`
#### Snippet
```java
     * @param instances instances
     */
    public void setPreInstances(final List<Instance> instances) {
        preInstances = instances.stream().filter(instance -> {
            for (String each : prefixListenerMap.keySet()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/NacosRepository.java`
#### Snippet
```java
    }
    
    private void fillEphemeralMetaData(final Map<String, String> metaDataMap) {
        int timeToLiveSeconds = nacosProps.getValue(NacosPropertyKey.TIME_TO_LIVE_SECONDS);
        metaDataMap.put(PreservedMetadataKeys.HEART_BEAT_INTERVAL, String.valueOf(timeToLiveSeconds * 1000 / 3));
```

### BoundedWildcard
Can generalize to `? super String`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/NacosRepository.java`
#### Snippet
```java
    }
    
    private void fillEphemeralMetaData(final Map<String, String> metaDataMap) {
        int timeToLiveSeconds = nacosProps.getValue(NacosPropertyKey.TIME_TO_LIVE_SECONDS);
        metaDataMap.put(PreservedMetadataKeys.HEART_BEAT_INTERVAL, String.valueOf(timeToLiveSeconds * 1000 / 3));
```

### BoundedWildcard
Can generalize to `? super String`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/cases/sql/loader/SQLCaseLoaderCallback.java`
#### Snippet
```java
    }
    
    private void buildCaseMap(final Map<String, SQLCase> sqlCaseMap, final InputStream inputStream) throws JAXBException {
        RootSQLCases root = (RootSQLCases) JAXBContext.newInstance(RootSQLCases.class).createUnmarshaller().unmarshal(inputStream);
        for (SQLCase each : root.getSqlCases()) {
```

### BoundedWildcard
Can generalize to `? super SQLCase`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/cases/sql/loader/SQLCaseLoaderCallback.java`
#### Snippet
```java
    }
    
    private void buildCaseMap(final Map<String, SQLCase> sqlCaseMap, final InputStream inputStream) throws JAXBException {
        RootSQLCases root = (RootSQLCases) JAXBContext.newInstance(RootSQLCases.class).createUnmarshaller().unmarshal(inputStream);
        for (SQLCase each : root.getSqlCases()) {
```

### BoundedWildcard
Can generalize to `? extends MutableDataNodeRule`
in `mode/type/standalone/core/src/main/java/org/apache/shardingsphere/mode/manager/standalone/StandaloneModeContextManager.java`
#### Snippet
```java
    }
    
    private void removeDataNode(final Collection<MutableDataNodeRule> rules, final Collection<String> schemaNames, final Collection<String> tobeRemovedTables) {
        tobeRemovedTables.forEach(each -> rules.forEach(rule -> rule.remove(schemaNames, each)));
    }
```

### BoundedWildcard
Can generalize to `? extends MutableDataNodeRule`
in `mode/type/standalone/core/src/main/java/org/apache/shardingsphere/mode/manager/standalone/StandaloneModeContextManager.java`
#### Snippet
```java
    }
    
    private void removeDataNode(final Collection<MutableDataNodeRule> rules, final String schemaName, final Collection<String> tobeRemovedTables) {
        tobeRemovedTables.forEach(each -> rules.forEach(rule -> rule.remove(schemaName, each)));
    }
```

### BoundedWildcard
Can generalize to `? extends OrderByItemSegment`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/segment/orderby/OrderByItemAssert.java`
#### Snippet
```java
     */
    public static void assertIs(final SQLCaseAssertContext assertContext,
                                final Collection<OrderByItemSegment> actual, final ExpectedOrderByClause expected, final String type) {
        assertThat(assertContext.getText(String.format("%s items size assertion error: ", type)), actual.size(), is(expected.getItemSize()));
        int count = 0;
```

### BoundedWildcard
Can generalize to `? extends ResetOptionSegment`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/mysql/MySQLResetStatementAssert.java`
#### Snippet
```java
    }
    
    private static void assertOptions(final SQLCaseAssertContext assertContext, final List<ResetOptionSegment> actual, final List<ExpectedResetOptionSegment> expected) {
        int i = 0;
        for (ExpectedResetOptionSegment each : expected) {
```

### BoundedWildcard
Can generalize to `? extends DataSourceSegment`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/RegisterMigrationSourceStorageUnitStatementAssert.java`
#### Snippet
```java
    }
    
    private static void assertDataSources(final SQLCaseAssertContext assertContext, final Collection<DataSourceSegment> actual, final List<ExpectedDataSource> expected) {
        if (null == expected) {
            assertNull(assertContext.getText("Actual datasource should not exist."), actual);
```

### BoundedWildcard
Can generalize to `? extends DataSourceSegment`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/AlterStorageUnitStatementAssert.java`
#### Snippet
```java
    }
    
    private static void assertDataSources(final SQLCaseAssertContext assertContext, final Collection<DataSourceSegment> actual, final List<ExpectedDataSource> expected) {
        if (null == expected) {
            assertNull(assertContext.getText("Actual storage unit should not exist."), actual);
```

### BoundedWildcard
Can generalize to `? extends DataSourceSegment`
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/create/RegisterStorageUnitStatementAssert.java`
#### Snippet
```java
    }
    
    private static void assertDataSources(final SQLCaseAssertContext assertContext, final Collection<DataSourceSegment> actual, final List<ExpectedDataSource> expected) {
        if (null == expected) {
            assertNull(assertContext.getText("Actual storage unit should not exist."), actual);
```

### BoundedWildcard
Can generalize to `? extends T`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/spi/AgentServiceLoader.java`
#### Snippet
```java
    }
    
    private Collection<T> load(final Class<T> service) {
        Collection<T> result = new LinkedList<>();
        for (T each : ServiceLoader.load(service)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/advisor/config/AdvisorConfigurationLoader.java`
#### Snippet
```java
    }
    
    private static void mergeConfigurations(final Map<String, AdvisorConfiguration> advisorConfigMap, final Collection<AdvisorConfiguration> toBeMergedAdvisorConfigs) {
        for (AdvisorConfiguration each : toBeMergedAdvisorConfigs) {
            advisorConfigMap.computeIfAbsent(each.getTargetClassName(), key -> new AdvisorConfiguration(each.getTargetClassName())).getAdvisors().addAll(each.getAdvisors());
```

### BoundedWildcard
Can generalize to `? extends JarFile`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/plugin/PluginLifecycleServiceManager.java`
#### Snippet
```java
    }
    
    private static void close(final Collection<JarFile> pluginJars) {
        AgentServiceLoader.getServiceLoader(PluginLifecycleService.class).getServices().forEach(each -> {
            try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `agent/plugins/core/src/main/java/org/apache/shardingsphere/agent/plugin/core/spi/PluginServiceLoader.java`
#### Snippet
```java
    }
    
    private Collection<T> load(final Class<T> service) {
        Collection<T> result = new LinkedList<>();
        for (T each : ServiceLoader.load(service)) {
```

### BoundedWildcard
Can generalize to `? extends JarFile`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/classloader/AgentExtraClassLoader.java`
#### Snippet
```java
    }
    
    public AgentExtraClassLoader(final ClassLoader appClassLoader, final Collection<JarFile> extraJars, final Collection<File> extraResourcePaths) {
        super(appClassLoader);
        this.extraJars = extraJars;
```

### BoundedWildcard
Can generalize to `? extends File`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/classloader/AgentExtraClassLoader.java`
#### Snippet
```java
    }
    
    public AgentExtraClassLoader(final ClassLoader appClassLoader, final Collection<JarFile> extraJars, final Collection<File> extraResourcePaths) {
        super(appClassLoader);
        this.extraJars = extraJars;
```

### BoundedWildcard
Can generalize to `? extends T`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/ShardingSphereServiceLoader.java`
#### Snippet
```java
    private final Collection<T> services;
    
    private ShardingSphereServiceLoader(final Class<T> serviceInterface) {
        this.serviceInterface = serviceInterface;
        validate();
```

### BoundedWildcard
Can generalize to `? extends T`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/typed/TypedSPILoader.java`
#### Snippet
```java
    }
    
    private static <T extends TypedSPI> Optional<T> findService(final Class<T> spiClass) {
        for (T each : ShardingSphereServiceLoader.getServiceInstances(spiClass)) {
            if (!each.isDefault()) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/props/TypedProperties.java`
#### Snippet
```java
    }
    
    private Map<E, TypedPropertyValue> preload(final Class<E> keyClass) {
        E[] enumConstants = keyClass.getEnumConstants();
        Map<E, TypedPropertyValue> result = new HashMap<>(enumConstants.length, 1);
```

### BoundedWildcard
Can generalize to `? extends T`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/OrderedSPILoader.java`
#### Snippet
```java
    }
    
    private static <T extends OrderedSPI<?>> Collection<T> getServices(final Class<T> spiClass, final Comparator<Integer> comparator) {
        Map<Integer, T> result = new TreeMap<>(comparator);
        for (T each : ShardingSphereServiceLoader.getServiceInstances(spiClass)) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/OrderedSPILoader.java`
#### Snippet
```java
    }
    
    private static <T extends OrderedSPI<?>> Collection<T> getServices(final Class<T> spiClass, final Comparator<Integer> comparator) {
        Map<Integer, T> result = new TreeMap<>(comparator);
        for (T each : ShardingSphereServiceLoader.getServiceInstances(spiClass)) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/OrderedSPILoader.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <K, V extends OrderedSPI<?>> Map<K, V> getServices(final Class<V> spiClass, final Collection<K> types, final Comparator<Integer> orderComparator) {
        Optional<Map<K, V>> cachedServices = OrderedServicesCache.findCachedServices(spiClass, types).map(optional -> (Map<K, V>) optional);
        if (cachedServices.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `infra/merge/src/main/java/org/apache/shardingsphere/infra/merge/engine/merger/impl/TransparentResultMerger.java`
#### Snippet
```java
    
    @Override
    public MergedResult merge(final List<QueryResult> queryResults, final SQLStatementContext<?> sqlStatementContext,
                              final ShardingSphereDatabase database, final ConnectionContext connectionContext) {
        return new TransparentMergedResult(queryResults.get(0));
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/insert/values/OnDuplicateUpdateContext.java`
#### Snippet
```java
    }
    
    private List<ExpressionSegment> getValueExpressions(final Collection<ExpressionSegment> assignments) {
        List<ExpressionSegment> result = new ArrayList<>(assignments.size());
        result.addAll(assignments);
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/insert/values/InsertValueContext.java`
#### Snippet
```java
    }
    
    private List<ExpressionSegment> getValueExpressions(final Collection<ExpressionSegment> assignments) {
        List<ExpressionSegment> result = new ArrayList<>(assignments.size());
        result.addAll(assignments);
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/pagination/engine/TopPaginationContextEngine.java`
#### Snippet
```java
     * @return pagination context
     */
    public PaginationContext createPaginationContext(final TopProjectionSegment topProjectionSegment, final Collection<ExpressionSegment> expressions, final List<Object> params) {
        Collection<AndPredicate> andPredicates = expressions.stream().flatMap(each -> ExpressionExtractUtil.getAndPredicates(each).stream()).collect(Collectors.toList());
        Optional<ExpressionSegment> rowNumberPredicate = !expressions.isEmpty() ? getRowNumberPredicate(andPredicates, topProjectionSegment.getAlias()) : Optional.empty();
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/ProjectionsContext.java`
#### Snippet
```java
    private final boolean containsLastInsertIdProjection;
    
    public ProjectionsContext(final int startIndex, final int stopIndex, final boolean distinctRow, final Collection<Projection> projections) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/ProjectionsContext.java`
#### Snippet
```java
    }
    
    private boolean isContainsLastInsertIdProjection(final Collection<Projection> projections) {
        for (Projection each : projections) {
            if (LAST_INSERT_ID_FUNCTION_EXPRESSION.equalsIgnoreCase(SQLUtil.getExactlyExpression(each.getExpression()))) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/pagination/engine/RowNumberPaginationContextEngine.java`
#### Snippet
```java
     * @return pagination context
     */
    public PaginationContext createPaginationContext(final Collection<ExpressionSegment> expressions, final ProjectionsContext projectionsContext, final List<Object> params) {
        Optional<String> rowNumberAlias = isRowNumberAlias(projectionsContext);
        if (!rowNumberAlias.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/insert/keygen/engine/GeneratedKeyContextEngine.java`
#### Snippet
```java
    }
    
    private Collection<ExpressionSegment> findGenerateKeyExpressions(final List<String> insertColumnNames, final List<List<ExpressionSegment>> valueExpressions, final String generateKeyColumnName) {
        Collection<ExpressionSegment> result = new LinkedList<>();
        for (List<ExpressionSegment> each : valueExpressions) {
```

### BoundedWildcard
Can generalize to `? super WhereSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/statement/ddl/CursorStatementContext.java`
#### Snippet
```java
    }
    
    private void extractWhereSegments(final Collection<WhereSegment> whereSegments, final SelectStatement select) {
        select.getWhere().ifPresent(whereSegments::add);
        whereSegments.addAll(WhereExtractUtil.getSubqueryWhereSegments(select));
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionsContextEngine.java`
#### Snippet
```java
    }
    
    private boolean containsProjection(final OrderByItemSegment orderByItem, final Collection<Projection> projections) {
        if (orderByItem instanceof IndexOrderByItemSegment) {
            return true;
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/table/TablesContext.java`
#### Snippet
```java
    }
    
    private Map<String, String> findTableNameFromSQL(final Map<String, Collection<String>> ownerColumnNames) {
        if (ownerColumnNames.isEmpty()) {
            return Collections.emptyMap();
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionEngine.java`
#### Snippet
```java
    }
    
    private Collection<Projection> getActualProjections(final Collection<Projection> projections) {
        Collection<Projection> result = new LinkedList<>();
        for (Projection each : projections) {
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionEngine.java`
#### Snippet
```java
    }
    
    private Collection<Projection> getRemainingColumns(final Collection<Projection> actualProjections, final Collection<String> usingColumnNames) {
        Collection<Projection> result = new LinkedList<>();
        for (Projection each : actualProjections) {
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionEngine.java`
#### Snippet
```java
    }
    
    private Collection<Projection> getJoinUsingColumnsByUsingColumnSequence(final Collection<Projection> actualProjections, final Collection<String> usingColumnNames) {
        Collection<Projection> result = new LinkedList<>();
        for (String each : usingColumnNames) {
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionEngine.java`
#### Snippet
```java
    }
    
    private Collection<String> getUsingColumnNamesByNaturalJoin(final Collection<Projection> actualProjections) {
        Collection<String> result = new LinkedHashSet<>();
        Map<String, Projection> uniqueProjections = new LinkedHashMap<>(actualProjections.size(), 1);
```

### BoundedWildcard
Can generalize to `? extends Projection`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/projection/engine/ProjectionEngine.java`
#### Snippet
```java
    }
    
    private Collection<Projection> getJoinUsingColumnsByOriginalColumnSequence(final Collection<Projection> actualProjections, final Collection<String> usingColumnNames) {
        Collection<Projection> result = new LinkedList<>();
        for (Projection each : actualProjections) {
```

### BoundedWildcard
Can generalize to `? super WhereSegment`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/statement/dml/SelectStatementContext.java`
#### Snippet
```java
    }
    
    private void extractWhereSegments(final Collection<WhereSegment> whereSegments, final SelectStatement selectStatement) {
        selectStatement.getWhere().ifPresent(whereSegments::add);
        whereSegments.addAll(WhereExtractUtil.getSubqueryWhereSegments(selectStatement));
```

### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/rule/builder/database/DatabaseRulesBuilder.java`
#### Snippet
```java
    
    @SuppressWarnings("rawtypes")
    private static Map<RuleConfiguration, DatabaseRuleBuilder> getDistributedRuleBuilderMap(final Collection<RuleConfiguration> ruleConfigs) {
        Collection<RuleConfiguration> distributedRuleConfigs = ruleConfigs.stream().filter(each -> isAssignableFrom(each, DistributedRuleConfiguration.class)).collect(Collectors.toList());
        return OrderedSPILoader.getServices(DatabaseRuleBuilder.class, distributedRuleConfigs, Comparator.reverseOrder());
```

### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/rule/builder/database/DatabaseRulesBuilder.java`
#### Snippet
```java
    
    @SuppressWarnings("rawtypes")
    private static Map<RuleConfiguration, DatabaseRuleBuilder> getEnhancedRuleBuilderMap(final Collection<RuleConfiguration> ruleConfigs) {
        Collection<RuleConfiguration> enhancedRuleConfigs = ruleConfigs.stream().filter(each -> isAssignableFrom(each, EnhancedRuleConfiguration.class)).collect(Collectors.toList());
        return OrderedSPILoader.getServices(DatabaseRuleBuilder.class, enhancedRuleConfigs);
```

### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/rule/builder/global/GlobalRulesBuilder.java`
#### Snippet
```java
    
    @SuppressWarnings("rawtypes")
    private static Map<RuleConfiguration, GlobalRuleBuilder> getRuleBuilderMap(final Collection<RuleConfiguration> globalRuleConfigs) {
        Map<RuleConfiguration, GlobalRuleBuilder> result = new LinkedHashMap<>();
        result.putAll(OrderedSPILoader.getServices(GlobalRuleBuilder.class, globalRuleConfigs));
```

### BoundedWildcard
Can generalize to `? extends List`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/statement/dml/InsertStatementContext.java`
#### Snippet
```java
    }
    
    private List<InsertValueContext> getInsertValueContexts(final List<Object> params, final AtomicInteger paramsOffset, final List<List<ExpressionSegment>> valueExpressions) {
        List<InsertValueContext> result = new LinkedList<>();
        for (Collection<ExpressionSegment> each : valueExpressions) {
```

### BoundedWildcard
Can generalize to `? extends YamlRuleConfiguration`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/config/swapper/rule/YamlRuleConfigurationSwapperEngine.java`
#### Snippet
```java
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    private Collection<RuleConfiguration> swapToRuleConfigurations(final Collection<YamlRuleConfiguration> yamlRuleConfigs,
                                                                   final Class<?> ruleConfigType, final YamlRuleConfigurationSwapper swapper) {
        return yamlRuleConfigs.stream()
```

### BoundedWildcard
Can generalize to `? extends Map`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/config/swapper/resource/YamlDataSourceConfigurationSwapper.java`
#### Snippet
```java
     * @return data sources
     */
    public Map<String, DataSource> swapToDataSources(final Map<String, Map<String, Object>> yamlDataSources, final boolean cacheEnabled) {
        return DataSourcePoolCreator.create(yamlDataSources.entrySet().stream().collect(Collectors.toMap(Entry::getKey, entry -> swapToDataSourceProperties(entry.getValue()))), cacheEnabled);
    }
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datanode/DataNodeUtil.java`
#### Snippet
```java
     * @return data node collection
     */
    public static Collection<DataNode> buildDataNode(final DataNode dataNode, final Map<String, Collection<String>> dataSources) {
        if (!dataSources.containsKey(dataNode.getDataSourceName())) {
            return Collections.singletonList(dataNode);
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/type/DatabaseTypeEngine.java`
#### Snippet
```java
     * @return storage type
     */
    public static DatabaseType getStorageType(final Collection<DataSource> dataSources) {
        return dataSources.isEmpty() ? TypedSPILoader.getService(DatabaseType.class, DEFAULT_DATABASE_TYPE) : getStorageType(dataSources.iterator().next());
    }
```

### BoundedWildcard
Can generalize to `? extends ShardingSphereRule`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datanode/DataNodes.java`
#### Snippet
```java
    private final Map<ShardingSphereRule, DataNodeBuilder> dataNodeBuilders;
    
    public DataNodes(final Collection<ShardingSphereRule> rules) {
        this.rules = rules;
        dataNodeBuilders = OrderedSPILoader.getServices(DataNodeBuilder.class, rules);
```

### BoundedWildcard
Can generalize to `? extends T`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/rule/ShardingSphereRuleMetaData.java`
#### Snippet
```java
     * @return found rules
     */
    public <T extends ShardingSphereRule> Collection<T> findRules(final Class<T> clazz) {
        List<T> result = new LinkedList<>();
        for (ShardingSphereRule each : rules) {
```

### BoundedWildcard
Can generalize to `? extends DatabaseConfiguration`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/ShardingSphereDatabasesFactory.java`
#### Snippet
```java
    }
    
    private static Map<String, ShardingSphereDatabase> createSystemDatabases(final Map<String, DatabaseConfiguration> databaseConfigMap, final DatabaseType protocolType) {
        Map<String, ShardingSphereDatabase> result = new HashMap<>(protocolType.getSystemDatabaseSchemaMap().size(), 1);
        for (String each : protocolType.getSystemDatabaseSchemaMap().keySet()) {
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/util/SchemaMetaDataUtil.java`
#### Snippet
```java
    }
    
    private static Collection<DatabaseType> getNotSupportThreeTierStructureStorageTypes(final Collection<DatabaseType> storageTypes) {
        Collection<DatabaseType> result = new LinkedList<>();
        for (DatabaseType each : storageTypes) {
```

### BoundedWildcard
Can generalize to `? super String`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/util/SchemaMetaDataUtil.java`
#### Snippet
```java
    }
    
    private static void addDataSourceTableGroups(final String dataSourceName, final String tableName, final Map<String, Collection<String>> dataSourceTableGroups) {
        Collection<String> tables = dataSourceTableGroups.getOrDefault(dataSourceName, new LinkedList<>());
        tables.add(tableName);
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/util/SchemaMetaDataUtil.java`
#### Snippet
```java
    }
    
    private static void checkDataSourceTypeIncludeInstanceAndSetDatabaseTableMap(final Collection<DatabaseType> notSupportThreeTierStructureStorageTypes, final DataNodes dataNodes,
                                                                                 final String tableName) {
        for (DataNode dataNode : dataNodes.getDataNodes(tableName)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/SchemaMetaDataLoaderEngine.java`
#### Snippet
```java
    }
    
    private static void mergeSchemaMetaDataMap(final Map<String, SchemaMetaData> schemaMetaDataMap, final Collection<SchemaMetaData> addedSchemaMetaDataList) {
        for (SchemaMetaData each : addedSchemaMetaDataList) {
            SchemaMetaData schemaMetaData = schemaMetaDataMap.computeIfAbsent(each.getName(), key -> new SchemaMetaData(each.getName(), new LinkedList<>()));
```

### BoundedWildcard
Can generalize to `? super String`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/OpenGaussSchemaMetaDataLoader.java`
#### Snippet
```java
    }
    
    private Collection<TableMetaData> createTableMetaDataList(final Multimap<String, IndexMetaData> tableIndexMetaDataMap, final Multimap<String, ColumnMetaData> tableColumnMetaDataMap) {
        Collection<TableMetaData> result = new LinkedList<>();
        for (String each : tableColumnMetaDataMap.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends InputStream`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/builder/SystemSchemaBuilder.java`
#### Snippet
```java
    }
    
    private static ShardingSphereSchema createSchema(final Collection<InputStream> schemaStreams, final YamlTableSwapper swapper) {
        Map<String, ShardingSphereTable> tables = new LinkedHashMap<>(schemaStreams.size(), 1);
        for (InputStream each : schemaStreams) {
```

### BoundedWildcard
Can generalize to `? super String`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/PostgreSQLSchemaMetaDataLoader.java`
#### Snippet
```java
    }
    
    private Collection<TableMetaData> createTableMetaDataList(final Multimap<String, IndexMetaData> tableIndexMetaDataMap, final Multimap<String, ColumnMetaData> tableColumnMetaDataMap,
                                                              final Multimap<String, ConstraintMetaData> tableConstraintMetaDataMap) {
        Collection<TableMetaData> result = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/PostgreSQLSchemaMetaDataLoader.java`
#### Snippet
```java
    
    private Collection<TableMetaData> createTableMetaDataList(final Multimap<String, IndexMetaData> tableIndexMetaDataMap, final Multimap<String, ColumnMetaData> tableColumnMetaDataMap,
                                                              final Multimap<String, ConstraintMetaData> tableConstraintMetaDataMap) {
        Collection<TableMetaData> result = new LinkedList<>();
        for (String each : tableColumnMetaDataMap.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/resource/ShardingSphereResourceMetaData.java`
#### Snippet
```java
    }
    
    private Map<String, DataSourceMetaData> createDataSourceMetaDataMap(final Map<String, DataSource> dataSources, final Map<String, DatabaseType> storageTypes) {
        Map<String, DataSourceMetaData> result = new LinkedHashMap<>(dataSources.size(), 1);
        for (Entry<String, DataSource> entry : dataSources.entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/state/DataSourceStateManager.java`
#### Snippet
```java
    }
    
    private void checkForceConnection(final Map<String, DataSource> dataSources) {
        if (forceStart) {
            dataSources.entrySet().removeIf(entry -> {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/state/DataSourceStateManager.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> filterDisabledDataSources(final String databaseName, final Map<String, DataSource> dataSources) {
        Map<String, DataSource> result = new LinkedHashMap<>(dataSources.size(), 1);
        dataSources.forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/state/DataSourceStateManager.java`
#### Snippet
```java
     * @param forceStart whether to force start
     */
    public void initStates(final String databaseName, final Map<String, DataSource> dataSources, final Map<String, DataSourceState> storageDataSourceStates, final boolean forceStart) {
        this.forceStart = forceStart;
        dataSources.forEach((key, value) -> initState(databaseName, storageDataSourceStates, key, value));
```

### BoundedWildcard
Can generalize to `? super SQLTokenGenerator`
in `infra/rewrite/src/main/java/org/apache/shardingsphere/infra/rewrite/sql/token/generator/builder/DefaultTokenGeneratorBuilder.java`
#### Snippet
```java
    }
    
    private void addSQLTokenGenerator(final Collection<SQLTokenGenerator> sqlTokenGenerators, final SQLTokenGenerator toBeAddedSQLTokenGenerator) {
        if (toBeAddedSQLTokenGenerator.isGenerateSQLToken(sqlStatementContext)) {
            sqlTokenGenerators.add(toBeAddedSQLTokenGenerator);
```

### BoundedWildcard
Can generalize to `? extends SQLSegment`
in `infra/rewrite/src/main/java/org/apache/shardingsphere/infra/rewrite/sql/token/generator/generic/RemoveTokenGenerator.java`
#### Snippet
```java
    }
    
    private Collection<RemoveToken> generateRemoveAvailableSQLTokens(final Collection<SQLSegment> removeSegments) {
        return removeSegments.stream().map(each -> new RemoveToken(each.getStartIndex(), each.getStopIndex())).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super RouteUnit`
in `infra/rewrite/src/main/java/org/apache/shardingsphere/infra/rewrite/engine/RouteSQLRewriteEngine.java`
#### Snippet
```java
    }
    
    private void addSQLRewriteUnits(final Map<RouteUnit, SQLRewriteUnit> sqlRewriteUnits, final SQLRewriteContext sqlRewriteContext,
                                    final RouteContext routeContext, final Collection<RouteUnit> routeUnits) {
        for (RouteUnit each : routeUnits) {
```

### BoundedWildcard
Can generalize to `? super SQLRewriteUnit`
in `infra/rewrite/src/main/java/org/apache/shardingsphere/infra/rewrite/engine/RouteSQLRewriteEngine.java`
#### Snippet
```java
    }
    
    private void addSQLRewriteUnits(final Map<RouteUnit, SQLRewriteUnit> sqlRewriteUnits, final SQLRewriteContext sqlRewriteContext,
                                    final RouteContext routeContext, final Collection<RouteUnit> routeUnits) {
        for (RouteUnit each : routeUnits) {
```

### BoundedWildcard
Can generalize to `? extends SQLTokenGenerator`
in `infra/rewrite/src/main/java/org/apache/shardingsphere/infra/rewrite/sql/token/generator/SQLTokenGenerators.java`
#### Snippet
```java
     * @param sqlTokenGenerators SQL token generators
     */
    public void addAll(final Collection<SQLTokenGenerator> sqlTokenGenerators) {
        for (SQLTokenGenerator each : sqlTokenGenerators) {
            if (!this.sqlTokenGenerators.containsKey(each.getClass())) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/prepare/raw/RawExecutionPrepareEngine.java`
#### Snippet
```java
    
    @Override
    protected List<ExecutionGroup<RawSQLExecutionUnit>> group(final String dataSourceName, final List<List<SQLUnit>> sqlUnitGroups, final ConnectionMode connectionMode) {
        return sqlUnitGroups.stream().map(each -> createExecutionGroup(dataSourceName, each, connectionMode)).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends List`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/prepare/driver/DriverExecutionPrepareEngine.java`
#### Snippet
```java
    
    @Override
    protected List<ExecutionGroup<T>> group(final String dataSourceName, final List<List<SQLUnit>> sqlUnitGroups, final ConnectionMode connectionMode) throws SQLException {
        List<ExecutionGroup<T>> result = new LinkedList<>();
        List<C> connections = connectionManager.getConnections(dataSourceName, sqlUnitGroups.size(), connectionMode);
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/prepare/driver/DriverExecutionPrepareEngine.java`
#### Snippet
```java
    public DriverExecutionPrepareEngine(final String type, final int maxConnectionsSizePerQuery, final ExecutorConnectionManager<C> connectionManager,
                                        final ExecutorStatementManager<C, ?, ?> statementManager, final StorageResourceOption option, final Collection<ShardingSphereRule> rules,
                                        final Map<String, DatabaseType> databaseTypes) {
        super(maxConnectionsSizePerQuery, rules);
        this.connectionManager = connectionManager;
```

### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/UpdatableGlobalRuleRALBackendHandler.java`
#### Snippet
```java
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    private Collection<RuleConfiguration> processUpdate(final Collection<RuleConfiguration> ruleConfigurations, final RALStatement sqlStatement, final GlobalRuleRALUpdater globalRuleUpdater,
                                                        final RuleConfiguration currentRuleConfig) {
        Collection<RuleConfiguration> result = new LinkedList<>(ruleConfigurations);
```

### BoundedWildcard
Can generalize to `? extends RuleConfiguration`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/UpdatableGlobalRuleRALBackendHandler.java`
#### Snippet
```java
    }
    
    private RuleConfiguration findCurrentRuleConfiguration(final Collection<RuleConfiguration> ruleConfigurations, final Class<? extends RuleConfiguration> ruleConfigClass) {
        for (RuleConfiguration each : ruleConfigurations) {
            if (ruleConfigClass.isAssignableFrom(each.getClass())) {
```

### BoundedWildcard
Can generalize to `? super ResultSet`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/admin/executor/AbstractDatabaseMetaDataExecutor.java`
#### Snippet
```java
        
        @Override
        protected void getSourceData(final String databaseName, final FunctionWithException<ResultSet, SQLException> callback) throws SQLException {
            ShardingSphereResourceMetaData resourceMetaData = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabase(databaseName).getResourceMetaData();
            Optional<Entry<String, DataSource>> dataSourceEntry = resourceMetaData.getDataSources().entrySet().stream().findFirst();
```

### BoundedWildcard
Can generalize to `? extends SQLException`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/admin/executor/AbstractDatabaseMetaDataExecutor.java`
#### Snippet
```java
        
        @Override
        protected void getSourceData(final String databaseName, final FunctionWithException<ResultSet, SQLException> callback) throws SQLException {
            ShardingSphereResourceMetaData resourceMetaData = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabase(databaseName).getResourceMetaData();
            Optional<Entry<String, DataSource>> dataSourceEntry = resourceMetaData.getDataSources().entrySet().stream().findFirst();
```

### BoundedWildcard
Can generalize to `? super T`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
    }
    
    private MergedResult getMergedResult(final QueryableRALExecutor<T> executor) {
        if (executor instanceof InstanceContextRequiredQueryableRALExecutor) {
            return getMergedResultByInstanceContextRequiredExecutor((InstanceContextRequiredQueryableRALExecutor<T>) executor);
```

### BoundedWildcard
Can generalize to `? super T`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
    }
    
    private MergedResult getMergedResultByConnectionSessionRequiredExecutor(final ConnectionSessionRequiredQueryableRALExecutor<T> executor) {
        return createMergedResult(executor.getRows(ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData(), getConnectionSession(), getSqlStatement()));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
    }
    
    private MergedResult getMergedResultByInstanceContextRequiredExecutor(final InstanceContextRequiredQueryableRALExecutor<T> executor) {
        return createMergedResult(executor.getRows(ProxyContext.getInstance().getContextManager().getInstanceContext(), getSqlStatement()));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
    }
    
    private MergedResult getMergedResultByMetaDataRequiredExecutor(final MetaDataRequiredQueryableRALExecutor<T> executor) {
        return createMergedResult(executor.getRows(ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData(), getSqlStatement()));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
    }
    
    private MergedResult getMergedResultByDatabaseRequiredExecutor(final DatabaseRequiredQueryableRALExecutor<T> executor) {
        String databaseName = getDatabaseName(getConnectionSession(), getSqlStatement());
        checkDatabaseName(databaseName);
```

### BoundedWildcard
Can generalize to `? super LocalDataQueryResultRow`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariablesExecutor.java`
#### Snippet
```java
    }
    
    private void addLoggingPropsRows(final ShardingSphereMetaData metaData, final Collection<LocalDataQueryResultRow> result) {
        Optional<ShardingSphereLogger> sqlLogger = LoggingUtils.getSQLLogger(metaData.getGlobalRuleMetaData());
        if (sqlLogger.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends YamlRuleConfiguration`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/config/ProxyConfigurationLoader.java`
#### Snippet
```java
    }
    
    private static void checkDuplicateRule(final Collection<YamlRuleConfiguration> ruleConfigs, final File yamlFile) {
        if (ruleConfigs.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends O`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/kernel/ExecutorEngine.java`
#### Snippet
```java
    }
    
    private <O> List<O> getGroupResults(final Collection<O> firstResults, final Collection<Future<Collection<O>>> restFutures) throws SQLException {
        List<O> result = new LinkedList<>(firstResults);
        for (Future<Collection<O>> each : restFutures) {
```

### BoundedWildcard
Can generalize to `? extends Future`>
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/kernel/ExecutorEngine.java`
#### Snippet
```java
    }
    
    private <O> List<O> getGroupResults(final Collection<O> firstResults, final Collection<Future<Collection<O>>> restFutures) throws SQLException {
        List<O> result = new LinkedList<>(firstResults);
        for (Future<Collection<O>> each : restFutures) {
```

### BoundedWildcard
Can generalize to `? extends YamlRuleConfiguration`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/ImportDatabaseConfigurationUpdater.java`
#### Snippet
```java
    }
    
    private void addRules(final String databaseName, final Collection<YamlRuleConfiguration> yamlRuleConfigs) {
        if (yamlRuleConfigs.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/storage/unit/RegisterStorageUnitBackendHandler.java`
#### Snippet
```java
    }
    
    private void checkDuplicatedDataSourceNames(final String databaseName, final Collection<String> dataSourceNames, final RegisterStorageUnitStatement sqlStatement) {
        Collection<String> duplicatedDataSourceNames = new HashSet<>(sqlStatement.getStorageUnits().size(), 1);
        for (DataSourceSegment each : sqlStatement.getStorageUnits()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/storage/unit/UnregisterStorageUnitBackendHandler.java`
#### Snippet
```java
    }
    
    private void checkInUsedIgnoreSingleTables(final Collection<String> inUsedResourceNames, final Multimap<String, String> inUsedStorageUnits) {
        for (String each : inUsedResourceNames) {
            Collection<String> inUsedRules = inUsedStorageUnits.get(each);
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/response/header/update/UpdateResponseHeader.java`
#### Snippet
```java
    }
    
    private long getLastInsertId(final Collection<UpdateResult> updateResults, final Collection<Comparable<?>> autoIncrementGeneratedValues) {
        List<Long> lastInsertIds = new ArrayList<>(updateResults.size() + autoIncrementGeneratedValues.size());
        for (UpdateResult each : updateResults) {
```

### BoundedWildcard
Can generalize to `? extends ShardingSphereRule`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/ProxySQLExecutor.java`
#### Snippet
```java
    }
    
    private boolean hasRawExecutionRule(final Collection<ShardingSphereRule> rules) {
        for (ShardingSphereRule each : rules) {
            if (each instanceof RawExecutionRule) {
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
    }
    
    private void setSessionVariablesIfNecessary(final List<Connection> connections) throws SQLException {
        if (connectionSession.getRequiredSessionVariableRecorder().isEmpty() || connections.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
    }
    
    private void resetSessionVariablesIfNecessary(final Collection<Connection> values, final Collection<SQLException> exceptions) {
        if (connectionSession.getRequiredSessionVariableRecorder().isEmpty() || values.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super SQLException`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
    }
    
    private void resetSessionVariablesIfNecessary(final Collection<Connection> values, final Collection<SQLException> exceptions) {
        if (connectionSession.getRequiredSessionVariableRecorder().isEmpty() || values.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/AlterReadwriteSplittingStorageUnitStatusStatementUpdater.java`
#### Snippet
```java
    }
    
    private void put(final Map<String, String> map, final String key, final String value) {
        map.put(key, map.containsKey(key) ? String.join(",", map.get(key), value) : value);
    }
```

### BoundedWildcard
Can generalize to `? extends Map`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/AlterReadwriteSplittingStorageUnitStatusStatementUpdater.java`
#### Snippet
```java
    }
    
    private void addReplicaResource(final Map<String, String> replicaStorageUnits, final Entry<String, Map<String, String>> readwriteSplittingRule) {
        readwriteSplittingRule.getValue().entrySet().stream().filter(entry -> ExportableItemConstants.REPLICA_DATA_SOURCE_NAMES.equals(entry.getKey()))
                .map(entry -> Arrays.asList(entry.getValue().split(","))).flatMap(Collection::stream).forEach(each -> put(replicaStorageUnits, each, readwriteSplittingRule.getKey()));
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/backend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/backend/mysql/handler/admin/executor/information/SelectInformationSchemataExecutor.java`
#### Snippet
```java
    
    @Override
    protected void rowPostProcessing(final String databaseName, final Map<String, Object> rowMap, final Map<String, String> aliasMap) {
        ShardingSphereResourceMetaData resourceMetaData = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabase(databaseName).getResourceMetaData();
        Set<String> catalogs = resourceMetaData.getDataSources().keySet().stream().map(each -> resourceMetaData.getDataSourceMetaData(each).getCatalog()).collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? extends ChannelFuture`
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/ShardingSphereProxy.java`
#### Snippet
```java
    }
    
    private void accept(final List<ChannelFuture> futures) throws InterruptedException {
        log.info("ShardingSphere-Proxy {} mode started successfully", ProxyContext.getInstance().getContextManager().getInstanceContext().getModeConfiguration().getType());
        for (ChannelFuture future : futures) {
```

### BoundedWildcard
Can generalize to `? super String`
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/executor/SelectDatabaseExecutor.java`
#### Snippet
```java
    
    @Override
    protected void rowPostProcessing(final String databaseName, final Map<String, Object> rowMap, final Map<String, String> aliasMap) {
        buildColumnNames(aliasMap);
        ShardingSphereResourceMetaData resourceMetaData = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabase(databaseName).getResourceMetaData();
```

### BoundedWildcard
Can generalize to `? extends SQLException`
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/command/CommandExecutorTask.java`
#### Snippet
```java
    }
    
    private void processClosedExceptions(final Collection<SQLException> exceptions) {
        if (exceptions.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends List`
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/command/query/extended/PostgreSQLBatchedStatementsExecutor.java`
#### Snippet
```java
    }
    
    private void prepareForRestOfParametersSet(final Iterator<List<Object>> paramSetsIterator, final SQLStatementContext<?> sqlStatementContext) {
        while (paramSetsIterator.hasNext()) {
            List<Object> eachGroupOfParam = paramSetsIterator.next();
```

### BoundedWildcard
Can generalize to `? extends DropTableStatement`
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/route/validator/ddl/SingleDropTableValidator.java`
#### Snippet
```java
    
    @Override
    public void validate(final SingleRule rule, final SQLStatementContext<DropTableStatement> sqlStatementContext, final ShardingSphereDatabase database) {
        if (DropTableStatementHandler.containsCascade(sqlStatementContext.getSqlStatement())) {
            throw new UnsupportedDropCascadeTableException();
```

### BoundedWildcard
Can generalize to `? extends DropSchemaStatement`
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/route/validator/ddl/SingleDropSchemaMetaDataValidator.java`
#### Snippet
```java
    
    @Override
    public void validate(final SingleRule rule, final SQLStatementContext<DropSchemaStatement> sqlStatementContext, final ShardingSphereDatabase database) {
        boolean containsCascade = DropSchemaStatementHandler.containsCascade(sqlStatementContext.getSqlStatement());
        for (IdentifierValue each : sqlStatementContext.getSqlStatement().getSchemaNames()) {
```

### BoundedWildcard
Can generalize to `? extends InstanceMetaData`
in `kernel/traffic/core/src/main/java/org/apache/shardingsphere/traffic/algorithm/loadbalance/RoundRobinTrafficLoadBalanceAlgorithm.java`
#### Snippet
```java
    
    @Override
    public InstanceMetaData getInstanceId(final String name, final List<InstanceMetaData> instances) {
        return instances.get(Math.abs(count.getAndIncrement()) % instances.size());
    }
```

### BoundedWildcard
Can generalize to `? extends InstanceMetaData`
in `kernel/traffic/core/src/main/java/org/apache/shardingsphere/traffic/algorithm/loadbalance/RandomTrafficLoadBalanceAlgorithm.java`
#### Snippet
```java
    
    @Override
    public InstanceMetaData getInstanceId(final String name, final List<InstanceMetaData> instances) {
        return instances.get(ThreadLocalRandom.current().nextInt(instances.size()));
    }
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/rule/SingleRule.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> getAggregateDataSourceMap(final Map<String, DataSource> dataSourceMap, final DataSourceContainedRule builtRule) {
        Map<String, DataSource> result = new LinkedHashMap<>();
        for (Entry<String, Collection<String>> entry : builtRule.getDataSourceMapper().entrySet()) {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/rule/SingleRule.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> getAggregateDataSourceMap(final Map<String, DataSource> dataSourceMap, final Collection<ShardingSphereRule> builtRules) {
        Map<String, DataSource> result = new LinkedHashMap<>(dataSourceMap);
        for (ShardingSphereRule each : builtRules) {
```

### BoundedWildcard
Can generalize to `? extends ShardingSphereRule`
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/rule/SingleRule.java`
#### Snippet
```java
    }
    
    private Map<String, DataSource> getAggregateDataSourceMap(final Map<String, DataSource> dataSourceMap, final Collection<ShardingSphereRule> builtRules) {
        Map<String, DataSource> result = new LinkedHashMap<>(dataSourceMap);
        for (ShardingSphereRule each : builtRules) {
```

### BoundedWildcard
Can generalize to `? extends TrafficAlgorithm`
in `kernel/traffic/core/src/main/java/org/apache/shardingsphere/traffic/rule/TrafficRule.java`
#### Snippet
```java
    }
    
    private TrafficAlgorithm getTrafficAlgorithm(final TrafficStrategyConfiguration strategyConfig, final Map<String, TrafficAlgorithm> trafficAlgorithms) {
        TrafficAlgorithm result = trafficAlgorithms.get(strategyConfig.getName() + "." + strategyConfig.getAlgorithmName());
        Preconditions.checkState(null != result, "Traffic algorithm can not be null.");
```

### BoundedWildcard
Can generalize to `? extends TrafficLoadBalanceAlgorithm`
in `kernel/traffic/core/src/main/java/org/apache/shardingsphere/traffic/rule/TrafficRule.java`
#### Snippet
```java
    }
    
    private TrafficLoadBalanceAlgorithm getLoadBalancer(final TrafficStrategyConfiguration strategyConfig, final Map<String, TrafficLoadBalanceAlgorithm> loadBalancers) {
        TrafficLoadBalanceAlgorithm result = loadBalancers.get(strategyConfig.getName() + "." + strategyConfig.getLoadBalancerName());
        Preconditions.checkState(null != result, "Traffic load balance algorithm can not be null.");
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/XAShardingSphereTransactionManager.java`
#### Snippet
```java
    
    @Override
    public void init(final Map<String, DatabaseType> databaseTypes, final Map<String, DataSource> dataSources, final String providerType) {
        xaTransactionManagerProvider = TypedSPILoader.getService(XATransactionManagerProvider.class, providerType);
        xaTransactionManagerProvider.init();
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `kernel/transaction/type/base/seata-at/src/main/java/org/apache/shardingsphere/transaction/base/seata/at/SeataATShardingSphereTransactionManager.java`
#### Snippet
```java
    
    @Override
    public void init(final Map<String, DatabaseType> databaseTypes, final Map<String, DataSource> dataSources, final String providerType) {
        if (enableSeataAT) {
            initSeataRPCClient();
```

### BoundedWildcard
Can generalize to `? extends Map`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/datasource/config/impl/ShardingSpherePipelineDataSourceConfiguration.java`
#### Snippet
```java
    }
    
    private void adjustDataSourceProperties(final Map<String, Map<String, Object>> dataSources) {
        for (Map<String, Object> queryProps : dataSources.values()) {
            for (String each : Arrays.asList("minPoolSize", "minimumIdle")) {
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/datasource/config/impl/StandardPipelineDataSourceConfiguration.java`
#### Snippet
```java
    }
    
    private void appendJdbcQueryProperties(final String databaseType, final Map<String, Object> yamlConfig) {
        Optional<JdbcQueryPropertiesExtension> extension = PipelineTypedSPILoader.findDatabaseTypedService(JdbcQueryPropertiesExtension.class, databaseType);
        if (!extension.isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends Record`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/core/connector/SocketSinkImporterConnector.java`
#### Snippet
```java
    
    @SneakyThrows(InterruptedException.class)
    private void writeIntoQueue(final List<Record> dataRecords, final SocketSinkImporter socketSinkImporter) {
        BlockingQueue<Record> blockingQueue = incrementalRecordMap.get(socketSinkImporter);
        if (null == blockingQueue) {
```

### BoundedWildcard
Can generalize to `? super DataRecord`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
    
    private static DataRecord findMinimumDataRecordWithComparator(final Map<SocketSinkImporter, BlockingQueue<Record>> incrementalRecordMap,
                                                                  final Map<SocketSinkImporter, CDCAckPosition> cdcAckPositionMap, final Comparator<DataRecord> dataRecordComparator) {
        Map<SocketSinkImporter, DataRecord> waitSortedMap = new HashMap<>();
        for (Entry<SocketSinkImporter, BlockingQueue<Record>> entry : incrementalRecordMap.entrySet()) {
```

### BoundedWildcard
Can generalize to `? super SocketSinkImporter`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
    }
    
    private static void saveAckPosition(final Map<SocketSinkImporter, CDCAckPosition> cdcAckPositionMap, final SocketSinkImporter socketSinkImporter, final Record record) {
        CDCAckPosition cdcAckPosition = cdcAckPositionMap.get(socketSinkImporter);
        if (null == cdcAckPosition) {
```

### BoundedWildcard
Can generalize to `? extends Record`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/record/RecordUtil.java`
#### Snippet
```java
    * @return last normal record.
    */
    public static Record getLastNormalRecord(final List<Record> records) {
        for (int index = records.size() - 1; index >= 0; index--) {
            Record record = records.get(index);
```

### BoundedWildcard
Can generalize to `? extends CompletableFuture`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/execute/ExecuteEngine.java`
#### Snippet
```java
     * @param executeCallback execute callback on all the futures
     */
    public static void trigger(final Collection<CompletableFuture<?>> futures, final ExecuteCallback executeCallback) {
        BlockingQueue<CompletableFuture<?>> futureQueue = new LinkedBlockingQueue<>();
        for (CompletableFuture<?> each : futures) {
```

### BoundedWildcard
Can generalize to `? extends DataConsistencyCalculatedResult`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/SingleTableInventoryDataConsistencyChecker.java`
#### Snippet
```java
    }
    
    private DataConsistencyCheckResult check0(final Iterator<DataConsistencyCalculatedResult> sourceCalculatedResults, final Iterator<DataConsistencyCalculatedResult> targetCalculatedResults,
                                              final ThreadPoolExecutor executor) {
        long sourceRecordsCount = 0;
```

### BoundedWildcard
Can generalize to `? extends DataConsistencyCalculatedResult`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/SingleTableInventoryDataConsistencyChecker.java`
#### Snippet
```java
    }
    
    private DataConsistencyCheckResult check0(final Iterator<DataConsistencyCalculatedResult> sourceCalculatedResults, final Iterator<DataConsistencyCalculatedResult> targetCalculatedResults,
                                              final ThreadPoolExecutor executor) {
        long sourceRecordsCount = 0;
```

### BoundedWildcard
Can generalize to `? super DataRecord.Key`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/importer/DataRecordMerger.java`
#### Snippet
```java
    }
    
    private void mergeDelete(final DataRecord dataRecord, final Map<DataRecord.Key, DataRecord> dataRecords) {
        DataRecord beforeDataRecord = dataRecords.get(dataRecord.getKey());
        ShardingSpherePreconditions.checkState(null == beforeDataRecord
```

### BoundedWildcard
Can generalize to `? super DataRecord.Key`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/importer/DataRecordMerger.java`
#### Snippet
```java
    }
    
    private void mergeUpdate(final DataRecord dataRecord, final Map<DataRecord.Key, DataRecord> dataRecords) {
        DataRecord beforeDataRecord = checkUpdatedPrimaryKey(dataRecord) ? dataRecords.get(dataRecord.getOldKey()) : dataRecords.get(dataRecord.getKey());
        if (null == beforeDataRecord) {
```

### BoundedWildcard
Can generalize to `? super DataRecord.Key`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/importer/DataRecordMerger.java`
#### Snippet
```java
    }
    
    private void mergeInsert(final DataRecord dataRecord, final Map<DataRecord.Key, DataRecord> dataRecords) {
        DataRecord beforeDataRecord = dataRecords.get(dataRecord.getKey());
        ShardingSpherePreconditions.checkState(null == beforeDataRecord
```

### BoundedWildcard
Can generalize to `? super SQLSegment`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/metadata/generator/PipelineDDLGenerator.java`
#### Snippet
```java
    }
    
    private void appendFromIndexAndConstraint(final Map<SQLSegment, String> replaceMap, final String targetTableName, final SQLStatementContext<?> sqlStatementContext) {
        if (!(sqlStatementContext instanceof TableAvailable) || ((TableAvailable) sqlStatementContext).getTablesContext().getTables().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/metadata/generator/PipelineDDLGenerator.java`
#### Snippet
```java
    }
    
    private void appendFromIndexAndConstraint(final Map<SQLSegment, String> replaceMap, final String targetTableName, final SQLStatementContext<?> sqlStatementContext) {
        if (!(sqlStatementContext instanceof TableAvailable) || ((TableAvailable) sqlStatementContext).getTablesContext().getTables().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super SQLSegment`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/metadata/generator/PipelineDDLGenerator.java`
#### Snippet
```java
    }
    
    private void appendFromTable(final Map<SQLSegment, String> replaceMap, final String targetTableName, final TableAvailable sqlStatementContext) {
        for (SimpleTableSegment each : sqlStatementContext.getAllTables()) {
            if (!targetTableName.equals(each.getTableName().getIdentifier().getValue())) {
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/metadata/generator/PipelineDDLGenerator.java`
#### Snippet
```java
    }
    
    private void appendFromTable(final Map<SQLSegment, String> replaceMap, final String targetTableName, final TableAvailable sqlStatementContext) {
        for (SimpleTableSegment each : sqlStatementContext.getAllTables()) {
            if (!targetTableName.equals(each.getTableName().getIdentifier().getValue())) {
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/AbstractPostgresDDLAdapter.java`
#### Snippet
```java
    }
    
    protected void formatSecurityLabels(final Map<String, Object> data) throws SQLException {
        if (null == data.get("seclabels")) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgreSQLCreateTableSQLGenerator.java`
#### Snippet
```java
    }
    
    private void typeFormatter(final Map<String, Object> column, final String columnType) {
        if (columnType.contains("[]")) {
            column.put("cltype", columnType.substring(0, columnType.length() - 2));
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresTablePropertiesLoader.java`
#### Snippet
```java
    }
    
    private void checkRlspolicySupport(final Map<String, Object> context) {
        if (context.containsKey("rlspolicy")) {
            if (context.get("rlspolicy") instanceof String && Boolean.TRUE.toString().equals(context.get("rlspolicy"))) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresTablePropertiesLoader.java`
#### Snippet
```java
    }
    
    private void appendFirstRow(final Collection<Map<String, Object>> rows, final Map<String, Object> context) {
        for (Map<String, Object> each : rows) {
            context.putAll(each);
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresTablePropertiesLoader.java`
#### Snippet
```java
    }
    
    private void appendFirstRow(final Collection<Map<String, Object>> rows, final Map<String, Object> context) {
        for (Map<String, Object> each : rows) {
            context.putAll(each);
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresTablePropertiesLoader.java`
#### Snippet
```java
    }
    
    private void updateAutovacuumProperties(final Map<String, Object> context) {
        if (null == context.get("autovacuum_enabled")) {
            context.put("autovacuum_enabled", "x");
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresColumnPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void handleLengthPrecision(final Long elemoid, final Map<String, Object> column, final String fullType) {
        boolean precision = false;
        boolean length = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresColumnPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void formatColumnVariables(final Map<String, Object> column) throws SQLException {
        if (null == column.get("attoptions")) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresColumnPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void columnFormatter(final Map<String, Object> column, final Collection<String> editTypes) throws SQLException {
        handlePrimaryColumn(column);
        fetchLengthPrecision(column);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresColumnPropertiesAppender.java`
#### Snippet
```java
    }
    
    private Map<String, Collection<String>> getEditTypes(final Collection<Map<String, Object>> allColumns) throws SQLException {
        Map<String, Collection<String>> result = new LinkedHashMap<>();
        Map<String, Object> params = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresColumnPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void handlePrimaryColumn(final Map<String, Object> column) {
        if (null != column.get("attnum") && null != column.get("indkey")) {
            if (Arrays.stream(column.get("indkey").toString().split(" ")).collect(Collectors.toList()).contains(column.get("attnum").toString())) {
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresConstraintsPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void getExclusionConstraintsColumns(final Map<String, Object> exclusionConstraintsProps) {
        Map<String, Object> params = new HashMap<>();
        params.put("cid", exclusionConstraintsProps.get("oid"));
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresConstraintsPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void appendConstraintsInclude(final Map<String, Object> constraintsProp) {
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("cid", constraintsProp.get("oid"));
```

### BoundedWildcard
Can generalize to `? extends Map`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresConstraintsPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void fetchConstraintsColumns(final Collection<Map<String, Object>> constraintsProps) {
        for (Map<String, Object> each : constraintsProps) {
            Collection<Map<String, Object>> columns = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresConstraintsPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void setRemoteName(final Map<String, Object> foreignKey, final Collection<Map<String, Object>> columns) {
        Map<String, Object> params = new HashMap<>();
        params.put("tid", columns.iterator().next().get("references"));
```

### BoundedWildcard
Can generalize to `? extends Map`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresConstraintsPropertiesAppender.java`
#### Snippet
```java
    }
    
    private void setRemoteName(final Map<String, Object> foreignKey, final Collection<Map<String, Object>> columns) {
        Map<String, Object> params = new HashMap<>();
        params.put("tid", columns.iterator().next().get("references"));
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ddlgenerator/PostgresIndexSQLGenerator.java`
#### Snippet
```java
    }
    
    private void appendIncludeDetails(final Map<String, Object> indexData, final Long oid) {
        Map<String, Object> param = new LinkedHashMap<>();
        param.put("idx", oid);
```

### BoundedWildcard
Can generalize to `? extends Statement`
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/row/SQLFederationRowEnumerator.java`
#### Snippet
```java
    private T currentRow;
    
    public SQLFederationRowEnumerator(final Collection<T> rows, final Collection<Statement> statements) {
        this.rows = rows;
        this.statements = statements;
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    }
    
    private void handleColumnLabelAndIndex(final Map<String, Integer> columnLabelAndIndexes, final Map<Integer, String> indexAndColumnLabels, final SelectStatementContext selectStatementContext) {
        List<Projection> projections = selectStatementContext.getProjectionsContext().getExpandProjections();
        for (int columnIndex = 1; columnIndex <= projections.size(); columnIndex++) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    }
    
    private void handleColumnLabelAndIndex(final Map<String, Integer> columnLabelAndIndexes, final Map<Integer, String> indexAndColumnLabels, final SelectStatementContext selectStatementContext) {
        List<Projection> projections = selectStatementContext.getProjectionsContext().getExpandProjections();
        for (int columnIndex = 1; columnIndex <= projections.size(); columnIndex++) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    }
    
    private void handleColumnLabelAndIndex(final Map<String, Integer> columnLabelAndIndexes, final Map<Integer, String> indexAndColumnLabels, final SelectStatementContext selectStatementContext) {
        List<Projection> projections = selectStatementContext.getProjectionsContext().getExpandProjections();
        for (int columnIndex = 1; columnIndex <= projections.size(); columnIndex++) {
```

### BoundedWildcard
Can generalize to `? super String`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    }
    
    private void handleColumnLabelAndIndex(final Map<String, Integer> columnLabelAndIndexes, final Map<Integer, String> indexAndColumnLabels, final SelectStatementContext selectStatementContext) {
        List<Projection> projections = selectStatementContext.getProjectionsContext().getExpandProjections();
        for (int columnIndex = 1; columnIndex <= projections.size(); columnIndex++) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `kernel/data-pipeline/scenario/migration/src/main/java/org/apache/shardingsphere/data/pipeline/scenario/migration/api/impl/MigrationJobAPI.java`
#### Snippet
```java
    }
    
    private Map<String, String> buildTargetTableSchemaMap(final Map<String, List<DataNode>> sourceDataNodes) {
        Map<String, String> result = new LinkedHashMap<>();
        sourceDataNodes.forEach((tableName, dataNodes) -> result.put(tableName, dataNodes.get(0).getSchemaName()));
```

### BoundedWildcard
Can generalize to `? extends RexNode`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectRule.java`
#### Snippet
```java
    }
    
    private int[] getProjectFields(final List<RexNode> rexNodes) {
        List<Integer> rexInputRefs = new ArrayList<>();
        for (RexNode exp : rexNodes) {
```

### BoundedWildcard
Can generalize to `? extends RexNode`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
    }
    
    private int[] getProjectFields(final List<RexNode> rexNodes) {
        int[] result = new int[rexNodes.size()];
        for (int index = 0; index < rexNodes.size(); index++) {
```

### BoundedWildcard
Can generalize to `? extends OrderByItemSegment`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/orderby/item/OrderByItemConverterUtil.java`
#### Snippet
```java
     * @return SQL nodes converted by order by item
     */
    public static Collection<SqlNode> convert(final Collection<OrderByItemSegment> orderByItems) {
        Collection<SqlNode> result = new LinkedList<>();
        for (OrderByItemSegment each : orderByItems) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/expression/impl/FunctionConverter.java`
#### Snippet
```java
    }
    
    private List<SqlNode> getFunctionParameters(final Collection<ExpressionSegment> sqlSegments) {
        List<SqlNode> result = new LinkedList<>();
        for (ExpressionSegment each : sqlSegments) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/expression/impl/CaseWhenExpressionConverter.java`
#### Snippet
```java
    }
    
    private Collection<SqlNode> convertWhenExprs(final ExpressionSegment caseExpr, final Collection<ExpressionSegment> whenExprs) {
        Collection<SqlNode> result = new LinkedList<>();
        for (ExpressionSegment each : whenExprs) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/projection/impl/AggregationProjectionConverter.java`
#### Snippet
```java
    }
    
    private List<SqlNode> convertParameters(final Collection<ExpressionSegment> params, final String innerExpression) {
        if (innerExpression.contains("*")) {
            return Collections.singletonList(SqlIdentifier.star(SqlParserPos.ZERO));
```

### BoundedWildcard
Can generalize to `? extends RexNode`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
    }
    
    private void addFilter(final List<RexNode> filters, final String[] filterValues) {
        int index = 0;
        for (RexNode filter : filters) {
```

### BoundedWildcard
Can generalize to `? extends DataSourceSegment`
in `distsql/statement/src/main/java/org/apache/shardingsphere/distsql/parser/segment/converter/DataSourceSegmentsConverter.java`
#### Snippet
```java
     * @return data source properties map
     */
    public static Map<String, DataSourceProperties> convert(final DatabaseType databaseType, final Collection<DataSourceSegment> dataSourceSegments) {
        Map<String, DataSourceProperties> result = new LinkedHashMap<>(dataSourceSegments.size(), 1);
        for (DataSourceSegment each : dataSourceSegments) {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/mask/distsql/handler/src/main/java/org/apache/shardingsphere/mask/distsql/handler/query/CountMaskRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Map<String, LinkedList<Object>> rowMap, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        rowMap.compute(dataKey, (key, value) -> buildRow(value, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? extends ShadowAlgorithm`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/rule/ShadowTableRule.java`
#### Snippet
```java
    
    private Map<ShadowOperationType, Collection<ShadowAlgorithmNameRule>> getColumnShadowAlgorithmRules(final Collection<String> shadowAlgorithmNames,
                                                                                                        final Map<String, ShadowAlgorithm> shadowAlgorithms) {
        Map<ShadowOperationType, Collection<ShadowAlgorithmNameRule>> result = new EnumMap<>(ShadowOperationType.class);
        for (String each : shadowAlgorithmNames) {
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/determiner/ColumnShadowAlgorithmDeterminer.java`
#### Snippet
```java
    }
    
    private static Collection<PreciseColumnShadowValue<Comparable<?>>> createColumnShadowValues(final String columnName, final Collection<Comparable<?>> columnValues, final String tableName,
                                                                                                final ShadowOperationType operationType) {
        Collection<PreciseColumnShadowValue<Comparable<?>>> result = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends HintShadowAlgorithm`>
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/AbstractShadowDMLStatementRouteEngine.java`
#### Snippet
```java
    }
    
    private boolean isMatchAnyHintShadowAlgorithms(final Collection<HintShadowAlgorithm<Comparable<?>>> shadowAlgorithms, final ShadowDetermineCondition shadowCondition, final ShadowRule shadowRule) {
        for (HintShadowAlgorithm<Comparable<?>> each : shadowAlgorithms) {
            if (HintShadowAlgorithmDeterminer.isShadow(each, shadowCondition, shadowRule)) {
```

### BoundedWildcard
Can generalize to `? super ShadowRuleSegment`
in `features/shadow/distsql/parser/src/main/java/org/apache/shardingsphere/shadow/distsql/parser/core/ShadowDistSQLStatementVisitor.java`
#### Snippet
```java
    }
    
    private static void buildShadowRuleSegment(final Collection<ShadowRuleSegment> collection, final ShadowRuleSegment shadowRuleSegment) {
        Map<String, Collection<ShadowAlgorithmSegment>> shadowTableRules = new LinkedHashMap<>();
        shadowRuleSegment.getShadowTableRules().forEach((key, value) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/query/CountShadowRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Map<String, LinkedList<Object>> rowMap, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        rowMap.compute(dataKey, (key, value) -> buildRow(value, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/update/AlterShadowRuleStatementUpdater.java`
#### Snippet
```java
    }
    
    private void updateTables(final Map<String, ShadowTableConfiguration> currentTables, final Map<String, ShadowTableConfiguration> toBeAlteredTables) {
        toBeAlteredTables.forEach(currentTables::replace);
    }
```

### BoundedWildcard
Can generalize to `? super ShadowTableConfiguration`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/update/AlterShadowRuleStatementUpdater.java`
#### Snippet
```java
    }
    
    private void updateTables(final Map<String, ShadowTableConfiguration> currentTables, final Map<String, ShadowTableConfiguration> toBeAlteredTables) {
        toBeAlteredTables.forEach(currentTables::replace);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/update/CreateShadowRuleStatementUpdater.java`
#### Snippet
```java
    }
    
    private void updateTables(final Map<String, ShadowTableConfiguration> currentTables, final Map<String, ShadowTableConfiguration> toBeCreateTables) {
        toBeCreateTables.forEach((key, value) -> currentTables.merge(key, value, ShadowRuleStatementSupporter::mergeConfiguration));
    }
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/converter/ShadowRuleStatementConverter.java`
#### Snippet
```java
    }
    
    private static ShadowTableConfiguration buildShadowTableConfiguration(final String ruleName, final Entry<String, Collection<ShadowAlgorithmSegment>> entry) {
        return new ShadowTableConfiguration(new ArrayList<>(Collections.singleton(ruleName)), entry.getValue().stream().map(ShadowAlgorithmSegment::getAlgorithmName).collect(Collectors.toList()));
    }
```

### BoundedWildcard
Can generalize to `? super SQLTokenGenerator`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/EncryptTokenGenerateBuilder.java`
#### Snippet
```java
    }
    
    private void addSQLTokenGenerator(final Collection<SQLTokenGenerator> sqlTokenGenerators, final SQLTokenGenerator toBeAddedSQLTokenGenerator) {
        if (toBeAddedSQLTokenGenerator.isGenerateSQLToken(sqlStatementContext)) {
            setUpSQLTokenGenerator(toBeAddedSQLTokenGenerator);
```

### BoundedWildcard
Can generalize to `? super Collection`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkDuplicated(final Collection<String> rules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> duplicated = getDuplicated(rules);
        ShardingSpherePreconditions.checkState(duplicated.isEmpty(), () -> thrower.apply(duplicated));
```

### BoundedWildcard
Can generalize to `? extends DistSQLException`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkDuplicated(final Collection<String> rules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> duplicated = getDuplicated(rules);
        ShardingSpherePreconditions.checkState(duplicated.isEmpty(), () -> thrower.apply(duplicated));
```

### BoundedWildcard
Can generalize to `? super Collection`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkExisted(final Collection<String> requiredRules, final Collection<String> currentRules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> notExisted = getNotExisted(requiredRules, currentRules);
        ShardingSpherePreconditions.checkState(notExisted.isEmpty(), () -> thrower.apply(notExisted));
```

### BoundedWildcard
Can generalize to `? extends DistSQLException`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkExisted(final Collection<String> requiredRules, final Collection<String> currentRules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> notExisted = getNotExisted(requiredRules, currentRules);
        ShardingSpherePreconditions.checkState(notExisted.isEmpty(), () -> thrower.apply(notExisted));
```

### BoundedWildcard
Can generalize to `? super Collection`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkDuplicated(final Collection<String> requiredRules, final Collection<String> currentRules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> duplicated = getDuplicated(requiredRules, currentRules);
        ShardingSpherePreconditions.checkState(duplicated.isEmpty(), () -> thrower.apply(duplicated));
```

### BoundedWildcard
Can generalize to `? extends DistSQLException`
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
     * @param thrower exception thrower
     */
    public static void checkDuplicated(final Collection<String> requiredRules, final Collection<String> currentRules, final Function<Collection<String>, DistSQLException> thrower) {
        Collection<String> duplicated = getDuplicated(requiredRules, currentRules);
        ShardingSpherePreconditions.checkState(duplicated.isEmpty(), () -> thrower.apply(duplicated));
```

### BoundedWildcard
Can generalize to `? super String`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptForUseDefaultInsertColumnsTokenGenerator.java`
#### Snippet
```java
    }
    
    private void addLikeQueryColumn(final List<String> columnNames, final EncryptTable encryptTable, final String columnName, final int columnIndex) {
        encryptTable.findLikeQueryColumn(columnName).ifPresent(optional -> columnNames.add(columnIndex + 1, optional));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptForUseDefaultInsertColumnsTokenGenerator.java`
#### Snippet
```java
    }
    
    private void setCipherColumn(final List<String> columnNames, final EncryptTable encryptTable, final String columnName, final int columnIndex) {
        columnNames.set(columnIndex, encryptTable.getCipherColumn(columnName));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptForUseDefaultInsertColumnsTokenGenerator.java`
#### Snippet
```java
    }
    
    private void addAssistedQueryColumn(final List<String> columnNames, final EncryptTable encryptTable, final String columnName, final int columnIndex) {
        encryptTable.findAssistedQueryColumn(columnName).ifPresent(optional -> columnNames.add(columnIndex + 1, optional));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptForUseDefaultInsertColumnsTokenGenerator.java`
#### Snippet
```java
    }
    
    private void addPlainColumn(final List<String> columnNames, final EncryptTable encryptTable, final String columnName, final int columnIndex) {
        encryptTable.findPlainColumn(columnName).ifPresent(optional -> columnNames.add(columnIndex + 1, optional));
    }
```

### BoundedWildcard
Can generalize to `? extends ParameterRewriter`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/context/EncryptSQLRewriteContextDecorator.java`
#### Snippet
```java
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    private void rewriteParameters(final SQLRewriteContext sqlRewriteContext, final Collection<ParameterRewriter> parameterRewriters) {
        for (ParameterRewriter each : parameterRewriters) {
            each.rewrite(sqlRewriteContext.getParameterBuilder(), sqlRewriteContext.getSqlStatementContext(), sqlRewriteContext.getParameters());
```

### BoundedWildcard
Can generalize to `? super ParameterRewriter`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/parameter/EncryptParameterRewriterBuilder.java`
#### Snippet
```java
    }
    
    private void addParameterRewriter(final Collection<ParameterRewriter> paramRewriters, final ParameterRewriter<?> toBeAddedParamRewriter) {
        if (toBeAddedParamRewriter.isNeedRewrite(sqlStatementContext)) {
            setUpParameterRewriter(toBeAddedParamRewriter);
```

### BoundedWildcard
Can generalize to `? super SubstitutableColumnNameToken`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptProjectionTokenGenerator.java`
#### Snippet
```java
    }
    
    private void addGenerateSQLTokens(final Collection<SubstitutableColumnNameToken> result, final SelectStatementContext selectStatementContext) {
        Map<String, String> columnTableNames = getColumnTableNames(selectStatementContext);
        for (ProjectionSegment projection : selectStatementContext.getSqlStatement().getProjections().getProjections()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/query/CountEncryptRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Map<String, LinkedList<Object>> rowMap, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        rowMap.compute(dataKey, (key, value) -> buildRow(value, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dal/show/LogicTablesMergedResult.java`
#### Snippet
```java
    @Override
    protected final List<MemoryQueryResultRow> init(final ShardingRule shardingRule, final ShardingSphereSchema schema,
                                                    final SQLStatementContext<?> sqlStatementContext, final List<QueryResult> queryResults) throws SQLException {
        List<MemoryQueryResultRow> result = new LinkedList<>();
        Set<String> tableNames = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dal/show/ShowIndexMergedResult.java`
#### Snippet
```java
    @Override
    protected List<MemoryQueryResultRow> init(final ShardingRule shardingRule, final ShardingSphereSchema schema,
                                              final SQLStatementContext<?> sqlStatementContext, final List<QueryResult> queryResults) throws SQLException {
        List<MemoryQueryResultRow> result = new LinkedList<>();
        for (QueryResult each : queryResults) {
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dal/show/ShowTableStatusMergedResult.java`
#### Snippet
```java
    @Override
    protected List<MemoryQueryResultRow> init(final ShardingRule shardingRule, final ShardingSphereSchema schema,
                                              final SQLStatementContext<?> sqlStatementContext, final List<QueryResult> queryResults) throws SQLException {
        Map<String, MemoryQueryResultRow> memoryQueryResultRows = new LinkedHashMap<>();
        for (QueryResult each : queryResults) {
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/aggregation/DistinctSumAggregationUnit.java`
#### Snippet
```java
    
    @Override
    public void merge(final List<Comparable<?>> values) {
        if (null == values || null == values.get(0)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/aggregation/ComparableAggregationUnit.java`
#### Snippet
```java
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void merge(final List<Comparable<?>> values) {
        if (null == values || null == values.get(0)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/aggregation/DistinctAverageAggregationUnit.java`
#### Snippet
```java
    
    @Override
    public void merge(final List<Comparable<?>> values) {
        if (null == values || null == values.get(0) || null == values.get(1)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/aggregation/DistinctCountAggregationUnit.java`
#### Snippet
```java
    
    @Override
    public void merge(final List<Comparable<?>> values) {
        if (null == values || null == values.get(0)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/ddl/fetch/FetchStreamMergedResult.java`
#### Snippet
```java
    }
    
    private List<FetchOrderByValueGroup> getFetchOrderByValueGroups(final List<QueryResult> queryResults, final SelectStatementContext selectStatementContext,
                                                                    final ShardingSphereSchema schema, final String cursorName, final ConnectionContext connectionContext) throws SQLException {
        long actualFetchCount = Math.max(fetchCount - connectionContext.getCursorConnectionContext().getMinGroupRowCounts().getOrDefault(cursorName, 0L), 0);
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/ddl/fetch/FetchStreamMergedResult.java`
#### Snippet
```java
    }
    
    private void addOrderedResultSetsToQueue(final List<FetchOrderByValueGroup> fetchOrderByValueGroups, final List<QueryResult> queryResults) {
        for (FetchOrderByValueGroup each : fetchOrderByValueGroups) {
            for (OrderByValue orderByValue : each.getOrderByValues()) {
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/orderby/OrderByStreamMergedResult.java`
#### Snippet
```java
    }
    
    private void orderResultSetsToQueue(final List<QueryResult> queryResults, final SelectStatementContext selectStatementContext, final ShardingSphereSchema schema) throws SQLException {
        for (QueryResult each : queryResults) {
            OrderByValue orderByValue = new OrderByValue(each, orderByItems, selectStatementContext, schema);
```

### BoundedWildcard
Can generalize to `? extends Set`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/type/complex/ShardingCartesianRoutingEngine.java`
#### Snippet
```java
    }
    
    private List<Set<RouteMapper>> toRoutingTableGroups(final String dataSource, final List<Set<String>> actualTableGroups) {
        List<Set<RouteMapper>> result = new ArrayList<>(actualTableGroups.size());
        for (Set<String> each : actualTableGroups) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/type/complex/ShardingCartesianRoutingEngine.java`
#### Snippet
```java
    }
    
    private Collection<RouteUnit> getRouteUnits(final String dataSource, final Set<List<RouteMapper>> cartesianRoutingTableGroups) {
        Collection<RouteUnit> result = new LinkedHashSet<>();
        for (List<RouteMapper> each : cartesianRoutingTableGroups) {
```

### BoundedWildcard
Can generalize to `? super EncryptCondition`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/condition/EncryptConditionEngine.java`
#### Snippet
```java
    }
    
    private void addEncryptConditions(final Collection<EncryptCondition> encryptConditions, final ExpressionSegment expression, final Map<String, String> expressionTableNames) {
        if (!findNotContainsNullLiteralsExpression(expression).isPresent()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/condition/EncryptConditionEngine.java`
#### Snippet
```java
    }
    
    private void addEncryptConditions(final Collection<EncryptCondition> encryptConditions, final Collection<ExpressionSegment> predicates, final Map<String, String> expressionTableNames) {
        Collection<Integer> stopIndexes = new HashSet<>(predicates.size(), 1);
        for (ExpressionSegment each : predicates) {
```

### BoundedWildcard
Can generalize to `? extends Set`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/type/broadcast/ShardingDataSourceGroupBroadcastRoutingEngine.java`
#### Snippet
```java
    }
    
    private Collection<Set<String>> getBroadcastDataSourceGroup(final Collection<Set<String>> dataSourceGroup) {
        Collection<Set<String>> result = new LinkedList<>();
        for (Set<String> each : dataSourceGroup) {
```

### BoundedWildcard
Can generalize to `? extends Set`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/type/broadcast/ShardingDataSourceGroupBroadcastRoutingEngine.java`
#### Snippet
```java
    }
    
    private Collection<Set<String>> getCandidateDataSourceGroup(final Collection<Set<String>> dataSourceSetGroup, final Set<String> compareSet) {
        Collection<Set<String>> result = new LinkedList<>();
        Set<String> intersections;
```

### BoundedWildcard
Can generalize to `? extends QueryResult`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    @Override
    protected List<MemoryQueryResultRow> init(final ShardingRule shardingRule, final ShardingSphereSchema schema,
                                              final SQLStatementContext<?> sqlStatementContext, final List<QueryResult> queryResults) throws SQLException {
        SelectStatementContext selectStatementContext = (SelectStatementContext) sqlStatementContext;
        Map<GroupByValue, MemoryQueryResultRow> dataMap = new HashMap<>(1024);
```

### BoundedWildcard
Can generalize to `? super GroupByValue`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    
    private void initForFirstGroupByValue(final SelectStatementContext selectStatementContext, final QueryResult queryResult,
                                          final GroupByValue groupByValue, final Map<GroupByValue, MemoryQueryResultRow> dataMap,
                                          final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) throws SQLException {
        if (!dataMap.containsKey(groupByValue)) {
```

### BoundedWildcard
Can generalize to `? super MemoryQueryResultRow`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    
    private void initForFirstGroupByValue(final SelectStatementContext selectStatementContext, final QueryResult queryResult,
                                          final GroupByValue groupByValue, final Map<GroupByValue, MemoryQueryResultRow> dataMap,
                                          final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) throws SQLException {
        if (!dataMap.containsKey(groupByValue)) {
```

### BoundedWildcard
Can generalize to `? super GroupByValue`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    private void initForFirstGroupByValue(final SelectStatementContext selectStatementContext, final QueryResult queryResult,
                                          final GroupByValue groupByValue, final Map<GroupByValue, MemoryQueryResultRow> dataMap,
                                          final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) throws SQLException {
        if (!dataMap.containsKey(groupByValue)) {
            dataMap.put(groupByValue, new MemoryQueryResultRow(queryResult));
```

### BoundedWildcard
Can generalize to `? super Map`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    private void initForFirstGroupByValue(final SelectStatementContext selectStatementContext, final QueryResult queryResult,
                                          final GroupByValue groupByValue, final Map<GroupByValue, MemoryQueryResultRow> dataMap,
                                          final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) throws SQLException {
        if (!dataMap.containsKey(groupByValue)) {
            dataMap.put(groupByValue, new MemoryQueryResultRow(queryResult));
```

### BoundedWildcard
Can generalize to `? extends Map`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    
    private void aggregate(final SelectStatementContext selectStatementContext, final QueryResult queryResult,
                           final GroupByValue groupByValue, final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) throws SQLException {
        for (AggregationProjection each : selectStatementContext.getProjectionsContext().getAggregationProjections()) {
            List<Comparable<?>> values = new ArrayList<>(2);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/GroupByMemoryMergedResult.java`
#### Snippet
```java
    
    private void setAggregationValueToMemoryRow(final SelectStatementContext selectStatementContext,
                                                final Map<GroupByValue, MemoryQueryResultRow> dataMap, final Map<GroupByValue, Map<AggregationProjection, AggregationUnit>> aggregationMap) {
        for (Entry<GroupByValue, MemoryQueryResultRow> entry : dataMap.entrySet()) {
            for (AggregationProjection each : selectStatementContext.getProjectionsContext().getAggregationProjections()) {
```

### BoundedWildcard
Can generalize to `? extends ShardingCondition`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/ShardingConditions.java`
#### Snippet
```java
    }
    
    private boolean isSubqueryContainsShardingCondition(final List<ShardingCondition> conditions, final SQLStatementContext<?> sqlStatementContext) {
        Collection<SelectStatement> selectStatements = getSelectStatements(sqlStatementContext);
        if (selectStatements.size() > 1) {
```

### BoundedWildcard
Can generalize to `? extends ShardingCondition`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/ShardingConditions.java`
#### Snippet
```java
    }
    
    private Optional<ShardingCondition> findUniqueShardingCondition(final Collection<ShardingCondition> conditions, final ShardingCondition condition) {
        for (ShardingCondition each : conditions) {
            if (isSameShardingCondition(rule, condition, each)) {
```

### BoundedWildcard
Can generalize to `? extends ShardingAlgorithm`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/type/standard/ShardingStandardRoutingEngine.java`
#### Snippet
```java
    }
    
    private ShardingStrategy createShardingStrategy(final ShardingStrategyConfiguration shardingStrategyConfig, final Map<String, ShardingAlgorithm> shardingAlgorithms,
                                                    final String defaultShardingColumn) {
        return null == shardingStrategyConfig ? new NoneShardingStrategy()
```

### BoundedWildcard
Can generalize to `? extends AlterViewStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingAlterViewStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<AlterViewStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        Optional<SelectStatement> selectStatement = AlterViewStatementHandler.getSelectStatement(sqlStatementContext.getSqlStatement());
```

### BoundedWildcard
Can generalize to `? extends CreateFunctionStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateFunctionStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateFunctionStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        Optional<RoutineBodySegment> routineBodySegment = CreateFunctionStatementHandler.getRoutineBodySegment(sqlStatementContext.getSqlStatement());
```

### BoundedWildcard
Can generalize to `? extends CreateTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateTableStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        String primaryTable = sqlStatementContext.getSqlStatement().getTable().getTableName().getIdentifier().getValue();
```

### BoundedWildcard
Can generalize to `? extends CreateTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateTableStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        if (!CreateTableStatementHandler.ifNotExists(sqlStatementContext.getSqlStatement())) {
```

### BoundedWildcard
Can generalize to `? extends ShardingCondition`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/engine/InsertClauseShardingConditionEngine.java`
#### Snippet
```java
    }
    
    private void appendGeneratedKeyCondition(final GeneratedKeyContext generatedKey, final String tableName, final List<ShardingCondition> shardingConditions) {
        Iterator<Comparable<?>> generatedValuesIterator = generatedKey.getGeneratedValues().iterator();
        for (ShardingCondition each : shardingConditions) {
```

### BoundedWildcard
Can generalize to `? extends AlterIndexStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingAlterIndexStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<AlterIndexStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        Optional<IndexSegment> index = sqlStatementContext.getSqlStatement().getIndex();
```

### BoundedWildcard
Can generalize to `? extends CreateIndexStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateIndexStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateIndexStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        if (CreateIndexStatementHandler.ifNotExists(sqlStatementContext.getSqlStatement())) {
```

### BoundedWildcard
Can generalize to `? extends CreateProcedureStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateProcedureStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateProcedureStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        Optional<RoutineBodySegment> routineBodySegment = CreateProcedureStatementHandler.getRoutineBodySegment(sqlStatementContext.getSqlStatement());
```

### BoundedWildcard
Can generalize to `? extends DropIndexStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingDropIndexStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<DropIndexStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        Collection<IndexSegment> indexSegments = sqlStatementContext.getSqlStatement().getIndexes();
```

### BoundedWildcard
Can generalize to `? extends DropIndexStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingDropIndexStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<DropIndexStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        if (DropIndexStatementHandler.ifExists(sqlStatementContext.getSqlStatement())) {
```

### BoundedWildcard
Can generalize to `? extends CopyStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/dml/impl/ShardingCopyStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<CopyStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        String tableName = sqlStatementContext.getSqlStatement().getTableSegment().getTableName().getIdentifier().getValue();
```

### BoundedWildcard
Can generalize to `? extends RenameTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingRenameTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<RenameTableStatement> sqlStatementContext, final List<Object> params, final ShardingSphereDatabase database,
                            final ConfigurationProperties props) {
        Collection<String> tableNames = sqlStatementContext instanceof TableAvailable
```

### BoundedWildcard
Can generalize to `? extends RenameTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingRenameTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<RenameTableStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        for (RenameTableDefinitionSegment each : sqlStatementContext.getSqlStatement().getRenameTables()) {
```

### BoundedWildcard
Can generalize to `? extends AlterTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingAlterTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<AlterTableStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        String primaryTable = sqlStatementContext.getSqlStatement().getTable().getTableName().getIdentifier().getValue();
```

### BoundedWildcard
Can generalize to `? extends AlterTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingAlterTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<AlterTableStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        Collection<String> tableNames = sqlStatementContext instanceof TableAvailable
```

### BoundedWildcard
Can generalize to `? extends AssignmentSegment`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/dml/ShardingDMLStatementValidator.java`
#### Snippet
```java
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected Optional<ShardingConditions> createShardingConditions(final SQLStatementContext<?> sqlStatementContext, final ShardingRule shardingRule,
                                                                    final Collection<AssignmentSegment> assignments, final List<Object> params) {
        Collection<ShardingConditionValue> values = new LinkedList<>();
        String tableName = sqlStatementContext.getTablesContext().getTableNames().iterator().next();
```

### BoundedWildcard
Can generalize to `? extends DropTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingDropTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void preValidate(final ShardingRule shardingRule, final SQLStatementContext<DropTableStatement> sqlStatementContext,
                            final List<Object> params, final ShardingSphereDatabase database, final ConfigurationProperties props) {
        if (!DropTableStatementHandler.ifExists(sqlStatementContext.getSqlStatement())) {
```

### BoundedWildcard
Can generalize to `? extends DropTableStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingDropTableStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<DropTableStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        checkTableInUsed(shardingRule, sqlStatementContext.getSqlStatement(), routeContext);
```

### BoundedWildcard
Can generalize to `? extends UpdateStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/dml/impl/ShardingUpdateStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<UpdateStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        String tableName = sqlStatementContext.getTablesContext().getTableNames().iterator().next();
```

### BoundedWildcard
Can generalize to `? extends CreateViewStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateViewStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<CreateViewStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        SelectStatement selectStatement = sqlStatementContext.getSqlStatement().getSelect();
```

### BoundedWildcard
Can generalize to `? extends CreateViewStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateViewStatementValidator.java`
#### Snippet
```java
    }
    
    private boolean isAllBroadcastTablesWithoutConfigView(final ShardingRule shardingRule, final SQLStatementContext<CreateViewStatement> sqlStatementContext,
                                                          final Collection<SimpleTableSegment> tableSegments) {
        Collection<String> tables = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends CreateViewStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/ddl/impl/ShardingCreateViewStatementValidator.java`
#### Snippet
```java
    }
    
    private boolean isShardingTablesWithoutBinding(final ShardingRule shardingRule, final SQLStatementContext<CreateViewStatement> sqlStatementContext,
                                                   final Collection<SimpleTableSegment> tableSegments) {
        for (SimpleTableSegment each : tableSegments) {
```

### BoundedWildcard
Can generalize to `? extends DeleteStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/dml/impl/ShardingDeleteStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<DeleteStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        if (!shardingRule.isBroadcastTable(sqlStatementContext.getTablesContext().getTableNames().iterator().next())
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/engine/WhereClauseShardingConditionEngine.java`
#### Snippet
```java
    }
    
    private Map<Column, Collection<ShardingConditionValue>> createShardingConditionValueMap(final Collection<ExpressionSegment> predicates,
                                                                                            final List<Object> params, final Map<String, String> columnTableNames) {
        Map<Column, Collection<ShardingConditionValue>> result = new HashMap<>(predicates.size(), 1);
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/engine/WhereClauseShardingConditionEngine.java`
#### Snippet
```java
    }
    
    private Collection<Comparable<?>> mergeListAndRangeShardingValues(final Collection<Comparable<?>> listValue, final Range<Comparable<?>> rangeValue) {
        Collection<Comparable<?>> result = new LinkedList<>();
        for (Comparable<?> each : listValue) {
```

### BoundedWildcard
Can generalize to `? extends ShardingConditionValue`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/engine/WhereClauseShardingConditionEngine.java`
#### Snippet
```java
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    private ShardingConditionValue mergeShardingConditionValues(final Column column, final Collection<ShardingConditionValue> shardingConditionValues) {
        Collection<Comparable<?>> listValue = null;
        Range<Comparable<?>> rangeValue = null;
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rewrite/token/pojo/ProjectionsToken.java`
#### Snippet
```java
    private final Map<RouteUnit, Collection<String>> projections;
    
    public ProjectionsToken(final int startIndex, final Map<RouteUnit, Collection<String>> projections) {
        super(startIndex);
        this.projections = projections;
```

### BoundedWildcard
Can generalize to `? extends ShardingConditionValue`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/strategy/type/complex/ComplexShardingStrategy.java`
#### Snippet
```java
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final Collection<ShardingConditionValue> shardingConditionValues,
                                         final DataNodeInfo dataNodeInfo, final ConfigurationProperties props) {
        Map<String, Collection<Comparable<?>>> columnShardingValues = new HashMap<>(shardingConditionValues.size(), 1);
```

### BoundedWildcard
Can generalize to `? extends InsertStatement`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/validator/dml/impl/ShardingInsertStatementValidator.java`
#### Snippet
```java
    
    @Override
    public void postValidate(final ShardingRule shardingRule, final SQLStatementContext<InsertStatement> sqlStatementContext, final HintValueContext hintValueContext, final List<Object> params,
                             final ShardingSphereDatabase database, final ConfigurationProperties props, final RouteContext routeContext) {
        Optional<SubquerySegment> insertSelect = sqlStatementContext.getSqlStatement().getInsertSelect();
```

### BoundedWildcard
Can generalize to `? super SQLTokenGenerator`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rewrite/token/pojo/ShardingTokenGenerateBuilder.java`
#### Snippet
```java
    }
    
    private void addSQLTokenGenerator(final Collection<SQLTokenGenerator> sqlTokenGenerators, final SQLTokenGenerator toBeAddedSQLTokenGenerator) {
        if (toBeAddedSQLTokenGenerator instanceof IgnoreForSingleRoute && routeContext.isSingleRouting()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends List`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rewrite/token/generator/impl/keygen/GeneratedKeyInsertValuesTokenGenerator.java`
#### Snippet
```java
    }
    
    private boolean isToAddDerivedLiteralExpression(final List<List<Object>> params, final int insertValueCount) {
        return params.get(insertValueCount).isEmpty();
    }
```

### BoundedWildcard
Can generalize to `? extends ParameterRewriter`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rewrite/context/ShardingSQLRewriteContextDecorator.java`
#### Snippet
```java
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    private void rewriteParameters(final SQLRewriteContext sqlRewriteContext, final Collection<ParameterRewriter> parameterRewriters) {
        for (ParameterRewriter each : parameterRewriters) {
            each.rewrite(sqlRewriteContext.getParameterBuilder(), sqlRewriteContext.getSqlStatementContext(), sqlRewriteContext.getParameters());
```

### BoundedWildcard
Can generalize to `? super ParameterRewriter`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rewrite/parameter/ShardingParameterRewriterBuilder.java`
#### Snippet
```java
    
    @SuppressWarnings("rawtypes")
    private void addParameterRewriter(final Collection<ParameterRewriter> paramRewriters, final ParameterRewriter toBeAddedParamRewriter) {
        if (toBeAddedParamRewriter instanceof SchemaMetaDataAware) {
            ((SchemaMetaDataAware) toBeAddedParamRewriter).setSchemas(schemas);
```

### BoundedWildcard
Can generalize to `? extends ShardingConditionValue`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/strategy/type/standard/StandardShardingStrategy.java`
#### Snippet
```java
    @SuppressWarnings("rawtypes")
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final Collection<ShardingConditionValue> shardingConditionValues,
                                         final DataNodeInfo dataNodeInfo, final ConfigurationProperties props) {
        ShardingConditionValue shardingConditionValue = shardingConditionValues.iterator().next();
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/inline/InlineShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Comparable<?>> shardingValue) {
        Closure<?> closure = createClosure();
        Comparable<?> value = shardingValue.getValue();
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rule/ShardingRule.java`
#### Snippet
```java
    
    private Collection<String> getJoinConditionTables(final ShardingSphereSchema schema, final SelectStatementContext select,
                                                      final Collection<ExpressionSegment> predicates, final boolean isDatabaseJoinCondition) {
        Collection<String> result = new LinkedList<>();
        for (ExpressionSegment each : predicates) {
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/range/AbstractRangeShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public final String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Comparable<?>> shardingValue) {
        String suffix = String.valueOf(getPartition(shardingValue.getValue()));
        return ShardingAutoTableAlgorithmUtil.findMatchedTargetName(availableTargetNames, suffix, shardingValue.getDataNodeInfo()).orElse(null);
```

### BoundedWildcard
Can generalize to `? extends DatabaseType`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/metadata/data/ShardingStatisticsTableCollector.java`
#### Snippet
```java
    }
    
    private void addTableRowsAndDataLength(final Map<String, DatabaseType> databaseTypes, final Map<String, DataSource> dataSources,
                                           final DataNode dataNode, final List<Object> row) throws SQLException {
        DatabaseType databaseType = databaseTypes.get(dataNode.getDataSourceName());
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/metadata/data/ShardingStatisticsTableCollector.java`
#### Snippet
```java
    }
    
    private void addForPostgreSQL(final Map<String, DataSource> dataSources, final DataNode dataNode, final List<Object> row) throws SQLException {
        DataSource dataSource = dataSources.get(dataNode.getDataSourceName());
        BigDecimal tableRows = BigDecimal.ZERO;
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/metadata/data/ShardingStatisticsTableCollector.java`
#### Snippet
```java
    }
    
    private void addForMySQL(final Map<String, DataSource> dataSources, final DataNode dataNode, final List<Object> row) throws SQLException {
        DataSource dataSource = dataSources.get(dataNode.getDataSourceName());
        BigDecimal tableRows = BigDecimal.ZERO;
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/mod/ModShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Comparable<?>> shardingValue) {
        String shardingResultSuffix = getShardingResultSuffix(cutShardingValue(shardingValue.getValue()).mod(new BigInteger(String.valueOf(shardingCount))).toString());
        return ShardingAutoTableAlgorithmUtil.findMatchedTargetName(availableTargetNames, shardingResultSuffix, shardingValue.getDataNodeInfo()).orElse(null);
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/datetime/AutoIntervalShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Comparable<?>> shardingValue) {
        String tableNameSuffix = String.valueOf(doSharding(parseDate(shardingValue.getValue())));
        return ShardingAutoTableAlgorithmUtil.findMatchedTargetName(availableTargetNames, tableNameSuffix, shardingValue.getDataNodeInfo()).orElse(null);
```

### BoundedWildcard
Can generalize to `? extends T`
in `features/sharding/plugin/cosid/src/main/java/org/apache/shardingsphere/sharding/cosid/algorithm/sharding/mod/CosIdModShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<T> shardingValue) {
        return modCycle.sharding(shardingValue.getValue());
    }
```

### BoundedWildcard
Can generalize to `? super LocalDataQueryResultRow`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowShardingTableRulesUsedAuditorExecutor.java`
#### Snippet
```java
    }
    
    private void requireResult(final ShowShardingTableRulesUsedAuditorStatement statement, final Collection<LocalDataQueryResultRow> result, final ShardingRule rule) {
        if (!statement.getAuditorName().isPresent()) {
            return;
```

### BoundedWildcard
Can generalize to `? super LocalDataQueryResultRow`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowShardingTableRulesUsedKeyGeneratorExecutor.java`
#### Snippet
```java
    }
    
    private void requireResult(final ShowShardingTableRulesUsedKeyGeneratorStatement statement, final Collection<LocalDataQueryResultRow> result, final ShardingRule rule) {
        if (!statement.getKeyGeneratorName().isPresent()) {
            return;
```

### BoundedWildcard
Can generalize to `? super LocalDataQueryResultRow`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/CountShardingRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Collection<LocalDataQueryResultRow> result, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        result.add(new LocalDataQueryResultRow(dataKey, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? super LocalDataQueryResultRow`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowShardingTableRulesUsedAlgorithmExecutor.java`
#### Snippet
```java
    }
    
    private void requireResult(final ShowShardingTableRulesUsedAlgorithmStatement statement, final Collection<LocalDataQueryResultRow> result, final ShardingRule rule) {
        if (!statement.getShardingAlgorithmName().isPresent()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `features/sharding/plugin/cosid/src/main/java/org/apache/shardingsphere/sharding/cosid/algorithm/sharding/interval/AbstractCosIdIntervalShardingAlgorithm.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private Range<LocalDateTime> convertRangeShardingValue(final Range<T> shardingValue) {
        if (Range.all().equals(shardingValue)) {
            return Range.all();
```

### BoundedWildcard
Can generalize to `? extends T`
in `features/sharding/plugin/cosid/src/main/java/org/apache/shardingsphere/sharding/cosid/algorithm/sharding/interval/AbstractCosIdIntervalShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<T> shardingValue) {
        LocalDateTime shardingTime = convertShardingValue(shardingValue.getValue());
        return intervalTimeline.sharding(shardingTime);
```

### BoundedWildcard
Can generalize to `? extends ShardingCondition`
in `features/sharding/plugin/cache/src/main/java/org/apache/shardingsphere/sharding/cache/checker/ShardingRouteCacheableChecker.java`
#### Snippet
```java
    }
    
    private static ShardingRouteCacheableCheckResult checkShardingConditionsCacheable(final List<ShardingCondition> shardingConditions) {
        Set<Integer> result = new TreeSet<>();
        for (ShardingCondition each : shardingConditions) {
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/converter/ShardingTableRuleStatementConverter.java`
#### Snippet
```java
     * @return sharding rule configuration
     */
    public static ShardingRuleConfiguration convert(final Collection<AbstractTableRuleSegment> rules) {
        ShardingRuleConfiguration result = new ShardingRuleConfiguration();
        rules.forEach(each -> {
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `features/db-discovery/core/src/main/java/org/apache/shardingsphere/dbdiscovery/rule/builder/DatabaseDiscoveryRuleBuilder.java`
#### Snippet
```java
    @Override
    public DatabaseDiscoveryRule build(final DatabaseDiscoveryRuleConfiguration config, final String databaseName,
                                       final Map<String, DataSource> dataSources, final Collection<ShardingSphereRule> builtRules, final InstanceContext instanceContext) {
        Map<String, DataSource> realDataSourceMap = new HashMap<>();
        for (DatabaseDiscoveryDataSourceRuleConfiguration each : config.getDataSources()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/db-discovery/distsql/handler/src/main/java/org/apache/shardingsphere/dbdiscovery/distsql/handler/query/CountDatabaseDiscoveryRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Map<String, LinkedList<Object>> rowMap, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        rowMap.compute(dataKey, (key, value) -> buildRow(value, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `features/db-discovery/provider/mysql/src/main/java/org/apache/shardingsphere/dbdiscovery/mysql/type/MGRMySQLDatabaseDiscoveryProvider.java`
#### Snippet
```java
    @SneakyThrows({InterruptedException.class, ExecutionException.class})
    @Override
    public void checkEnvironment(final String databaseName, final Collection<DataSource> dataSources) {
        ExecutorService executorService = ExecutorEngine.createExecutorEngineWithCPUAndResources(dataSources.size()).getExecutorServiceManager().getExecutorService();
        Collection<Future<Boolean>> futures = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `features/db-discovery/provider/mysql/src/main/java/org/apache/shardingsphere/dbdiscovery/mysql/type/MySQLNormalReplicationDatabaseDiscoveryProvider.java`
#### Snippet
```java
    @SneakyThrows({InterruptedException.class, ExecutionException.class})
    @Override
    public void checkEnvironment(final String databaseName, final Collection<DataSource> dataSources) {
        ExecutorService executorService = ExecutorEngine.createExecutorEngineWithCPUAndResources(dataSources.size()).getExecutorServiceManager().getExecutorService();
        Collection<Future<Boolean>> futures = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `features/db-discovery/provider/mysql/src/main/java/org/apache/shardingsphere/dbdiscovery/mysql/type/MySQLNormalReplicationDatabaseDiscoveryProvider.java`
#### Snippet
```java
    }
    
    private void checkPrimaryInstances(final String databaseName, final boolean isPrimaryInstance, final Collection<Boolean> primaryInstances) {
        if (!isPrimaryInstance) {
            return;
```

### BoundedWildcard
Can generalize to `? extends List`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/rule/ReadwriteSplittingRule.java`
#### Snippet
```java
    private ReadwriteSplittingDataSourceRuleConfiguration createStaticDataSourceRuleConfiguration(final ReadwriteSplittingDataSourceRuleConfiguration config, final int index,
                                                                                                  final List<String> readwriteDataSourceNames, final List<String> writeDatasourceNames,
                                                                                                  final List<List<String>> readDatasourceNames) {
        List<String> readDataSourceNames = readDatasourceNames.stream().map(each -> each.get(index)).collect(Collectors.toList());
        return new ReadwriteSplittingDataSourceRuleConfiguration(readwriteDataSourceNames.get(index),
```

### BoundedWildcard
Can generalize to `? super String`
in `features/readwrite-splitting/distsql/handler/src/main/java/org/apache/shardingsphere/readwritesplitting/distsql/handler/query/CountReadwriteSplittingRuleExecutor.java`
#### Snippet
```java
    }
    
    private void addData(final Map<String, LinkedList<Object>> rowMap, final String dataKey, final String databaseName, final Supplier<Integer> apply) {
        rowMap.compute(dataKey, (key, value) -> buildRow(value, databaseName, apply.get()));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/checker/ReadwriteSplittingRuleConfigurationChecker.java`
#### Snippet
```java
    }
    
    private void checkWriteDataSourceNames(final String databaseName, final Map<String, DataSource> dataSourceMap, final Collection<String> addedWriteDataSourceNames,
                                           final StaticReadwriteSplittingStrategyConfiguration strategyConfig, final Collection<ShardingSphereRule> rules) {
        for (String each : new InlineExpressionParser(strategyConfig.getWriteDataSourceName()).splitAndEvaluate()) {
```

### BoundedWildcard
Can generalize to `? extends ReadQueryLoadBalanceAlgorithm`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/checker/ReadwriteSplittingRuleConfigurationChecker.java`
#### Snippet
```java
    
    private void checkLoadBalancerDataSourceName(final String databaseName, final Collection<ReadwriteSplittingDataSourceRuleConfiguration> configs,
                                                 final Map<String, ReadQueryLoadBalanceAlgorithm> loadBalancers, final Collection<ShardingSphereRule> rules) {
        for (ReadwriteSplittingDataSourceRuleConfiguration each : configs) {
            if (Strings.isNullOrEmpty(each.getLoadBalancerName())) {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/checker/ReadwriteSplittingRuleConfigurationChecker.java`
#### Snippet
```java
    
    private void checkReadeDataSourceNames(final String databaseName,
                                           final Map<String, DataSource> dataSourceMap, final Collection<String> addedReadDataSourceNames, final String readDataSourceName) {
        for (String each : new InlineExpressionParser(readDataSourceName).splitAndEvaluate()) {
            ShardingSpherePreconditions.checkState(dataSourceMap.containsKey(each),
```

### BoundedWildcard
Can generalize to `? extends ShardingSphereRule`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/checker/ReadwriteSplittingRuleConfigurationChecker.java`
#### Snippet
```java
    }
    
    private boolean containsInOtherRules(final String datasourceName, final Collection<ShardingSphereRule> rules) {
        for (ShardingSphereRule each : rules) {
            if (each instanceof DataSourceContainedRule && ((DataSourceContainedRule) each).getDataSourceMapper().containsKey(datasourceName)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `features/readwrite-splitting/distsql/handler/src/main/java/org/apache/shardingsphere/readwritesplitting/distsql/handler/checker/ReadwriteSplittingRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static void checkDuplicateReadDataSourceNames(final String databaseName, final ReadwriteSplittingRuleSegment segment, final Collection<String> readDataSourceNames) {
        for (String each : segment.getReadDataSources()) {
            ShardingSpherePreconditions.checkState(readDataSourceNames.add(each),
```

### BoundedWildcard
Can generalize to `? super String`
in `features/readwrite-splitting/distsql/handler/src/main/java/org/apache/shardingsphere/readwritesplitting/distsql/handler/checker/ReadwriteSplittingRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static void checkDuplicateWriteDataSourceNames(final String databaseName, final Collection<ReadwriteSplittingRuleSegment> segments, final Collection<String> writeDataSourceNames) {
        segments.forEach(each -> {
            if (!Strings.isNullOrEmpty(each.getWriteDataSource())) {
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static void checkTables(final String databaseName, final Collection<AbstractTableRuleSegment> rules, final ShardingRuleConfiguration currentRuleConfig, final boolean isCreate,
                                    final boolean ifNotExists) {
        Collection<String> requiredTables = rules.stream().map(AbstractTableRuleSegment::getLogicTable).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends ShardingAlgorithm`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    
    private static TableRule createAutoTableRule(final KeyGenerateStrategyConfiguration defaultKeyGenerateStrategyConfig, final ShardingAutoTableRuleConfiguration autoTableRuleConfig,
                                                 final Map<String, ShardingAlgorithm> shardingAlgorithms, final Collection<String> dataSourceNames) {
        ShardingAlgorithm shardingAlgorithm = shardingAlgorithms.get(autoTableRuleConfig.getShardingStrategy().getShardingAlgorithmName());
        ShardingSpherePreconditions.checkState(shardingAlgorithm instanceof ShardingAutoTableAlgorithm,
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static void checkKeyGenerators(final Collection<AbstractTableRuleSegment> rules, final ShardingRuleConfiguration currentRuleConfig) {
        Set<String> notExistKeyGenerator = new LinkedHashSet<>(rules.size());
        Set<String> requiredKeyGenerators = new LinkedHashSet<>(rules.size());
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static Collection<String> getRequiredDataSources(final Collection<AbstractTableRuleSegment> rules) {
        return rules.stream().map(AbstractTableRuleSegment::getDataSourceNodes).flatMap(Collection::stream)
                .map(ShardingTableRuleStatementChecker::parseDateSource).map(ShardingTableRuleStatementChecker::getDataSourceNames).flatMap(Collection::stream).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static void checkAuditors(final Collection<AbstractTableRuleSegment> rules) {
        Collection<AuditStrategySegment> auditStrategySegments = rules.stream().map(AbstractTableRuleSegment::getAuditStrategySegment).filter(Objects::nonNull).collect(Collectors.toList());
        Set<String> requiredAuditors = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? extends AbstractTableRuleSegment`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
    }
    
    private static Map<String, List<AbstractTableRuleSegment>> groupingByClassType(final Collection<AbstractTableRuleSegment> rules) {
        return rules.stream().collect(Collectors.groupingBy(each -> each.getClass().getSimpleName()));
    }
```

### BoundedWildcard
Can generalize to `? super ColumnSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/ColumnExtractor.java`
#### Snippet
```java
    }
    
    private static void extractColumnSegments(final Collection<ColumnSegment> columnSegments, final AndPredicate andPredicate) {
        for (ExpressionSegment each : andPredicate.getPredicates()) {
            columnSegments.addAll(ColumnExtractor.extract(each));
```

### BoundedWildcard
Can generalize to `? super AndPredicate`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/ExpressionExtractUtil.java`
#### Snippet
```java
    }
    
    private static void extractCombinedAndPredicates(final Collection<AndPredicate> result, final AndPredicate current, final Collection<AndPredicate> predicates) {
        for (AndPredicate each : predicates) {
            AndPredicate predicate = new AndPredicate();
```

### BoundedWildcard
Can generalize to `? super ParameterMarkerExpressionSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/ExpressionExtractUtil.java`
#### Snippet
```java
    }
    
    private static void extractParameterMarkerExpressions(final List<ParameterMarkerExpressionSegment> result, final Collection<ExpressionSegment> expressions) {
        for (ExpressionSegment each : expressions) {
            if (each instanceof ParameterMarkerExpressionSegment) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/ExpressionExtractUtil.java`
#### Snippet
```java
    }
    
    private static void extractParameterMarkerExpressions(final List<ParameterMarkerExpressionSegment> result, final Collection<ExpressionSegment> expressions) {
        for (ExpressionSegment each : expressions) {
            if (each instanceof ParameterMarkerExpressionSegment) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/value/collection/CollectionValue.java`
#### Snippet
```java
     * @param collectionValue collection value
     */
    public void combine(final CollectionValue<T> collectionValue) {
        value.addAll(collectionValue.value);
    }
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtil.java`
#### Snippet
```java
     * @return whether the element in source collection and target collection are all same
     */
    public static boolean safeCollectionEquals(final Collection<Comparable<?>> sources, final Collection<Comparable<?>> targets) {
        List<Comparable<?>> all = new ArrayList<>(sources);
        all.addAll(targets);
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtil.java`
#### Snippet
```java
     * @return whether the element in source collection and target collection are all same
     */
    public static boolean safeCollectionEquals(final Collection<Comparable<?>> sources, final Collection<Comparable<?>> targets) {
        List<Comparable<?>> all = new ArrayList<>(sources);
        all.addAll(targets);
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtil.java`
#### Snippet
```java
    }
    
    private static Optional<Class<?>> getTargetNumericType(final List<Comparable<?>> endpoints) {
        Set<Class<?>> classes = endpoints.stream().filter(Objects::nonNull).map(Comparable::getClass).collect(Collectors.toSet());
        Class<?> clazz = null;
```

### BoundedWildcard
Can generalize to `? extends AssignmentSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/extractor/TableExtractor.java`
#### Snippet
```java
    }
    
    private void extractTablesFromAssignmentItems(final Collection<AssignmentSegment> assignmentItems) {
        assignmentItems.forEach(each -> extractTablesFromColumnSegments(each.getColumns()));
    }
```

### BoundedWildcard
Can generalize to `? extends OrderByItemSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/extractor/TableExtractor.java`
#### Snippet
```java
    }
    
    private void extractTablesFromOrderByItems(final Collection<OrderByItemSegment> orderByItems) {
        for (OrderByItemSegment each : orderByItems) {
            if (each instanceof ColumnOrderByItemSegment) {
```

### BoundedWildcard
Can generalize to `? extends Comparable`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/datetime/IntervalShardingAlgorithm.java`
#### Snippet
```java
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Comparable<?>> shardingValue) {
        return doSharding(availableTargetNames, Range.singleton(shardingValue.getValue())).stream().findFirst().orElse(null);
    }
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/metadata/SchemaTableName.java`
#### Snippet
```java
    private final SchemaName schemaName;
    
    @NonNull
    private final TableName tableName;
    
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/metadata/SchemaTableName.java`
#### Snippet
```java
public class SchemaTableName {
    
    @NonNull
    private final SchemaName schemaName;
    
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/metadata/model/PipelineColumnMetaData.java`
#### Snippet
```java
    private final int ordinalPosition;
    
    @NonNull
    private final String name;
    
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/metadata/model/PipelineTableMetaData.java`
#### Snippet
```java
public final class PipelineTableMetaData {
    
    @NonNull
    private final String name;
    
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/DataMatchDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
    static final class CalculatedResult implements DataConsistencyCalculatedResult {
        
        @NonNull
        private final Object maxUniqueKeyValue;
        
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `FromDatabaseAvailable`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/RDLBackendHandler.java`
#### Snippet
```java
    
    private String getDatabaseName(final ConnectionSession connectionSession, final T sqlStatement) {
        Optional<DatabaseSegment> databaseSegment = sqlStatement instanceof FromDatabaseAvailable ? ((FromDatabaseAvailable) sqlStatement).getDatabase() : Optional.empty();
        return databaseSegment.isPresent() ? databaseSegment.get().getIdentifier().getValue() : connectionSession.getDatabaseName();
    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ProxyContext.getContextManager()` is ignored
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractCommandExecutorTaskAdviceTest.java`
#### Snippet
```java
    public final void prepare() {
        try (MockedStatic<ProxyContext> proxyContext = mockStatic(ProxyContext.class, RETURNS_DEEP_STUBS)) {
            proxyContext.when(() -> ProxyContext.getInstance().getContextManager()).thenReturn(mock(ContextManager.class, RETURNS_DEEP_STUBS));
            ConnectionSession connectionSession = new ConnectionSession(mock(MySQLDatabaseType.class), TransactionType.BASE, new DefaultAttributeMap());
            Object executorTask = new CommandExecutorTask(null, connectionSession, null, null);
```

### IgnoreResultOfCall
Result of `PipelineMetaDataNodeWatcher.getInstance()` is ignored
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/execute/PipelineJobWorker.java`
#### Snippet
```java
            }
            log.info("start worker initialization");
            PipelineMetaDataNodeWatcher.getInstance();
            WORKER_INITIALIZED.set(true);
            log.info("worker initialization done");
```

### IgnoreResultOfCall
Result of `Range.range()` is ignored
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        BigDecimal lowerValue = BigDecimal.valueOf(Long.parseLong(ctx.INTEGER_(0).getText()));
        BigDecimal upperValue = BigDecimal.valueOf(Long.parseLong(ctx.INTEGER_(1).getText()));
        Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN);
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getTypeAliases()` only delegates to its super method
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/ConsulRepository.java`
#### Snippet
```java
    
    @Override
    public Collection<String> getTypeAliases() {
        return ClusterPersistRepository.super.getTypeAliases();
    }
```

## RuleId[ruleID=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/AbstractStreamingDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
        
        private void calculateIfNecessary() {
            if (null != nextResult) {
                return;
            }
```

### OptionalAssignedToNull
Null is used for 'Optional' type in assignment
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/AbstractStreamingDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
            calculateIfNecessary();
            Optional<DataConsistencyCalculatedResult> nextResult = this.nextResult;
            this.nextResult = null;
            return nextResult.orElse(null);
        }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/dumper/BasicColumnValueReader.java`
#### Snippet
```java
    @Override
    protected Object doReadValue(final ResultSet resultSet, final ResultSetMetaData metaData, final int columnIndex) throws SQLException {
        return super.defaultDoReadValue(resultSet, metaData, columnIndex);
    }
    
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/MySQLColumnValueReader.java`
#### Snippet
```java
            return resultSet.getObject(columnIndex);
        }
        return super.defaultDoReadValue(resultSet, metaData, columnIndex);
    }
    
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/PostgreSQLColumnValueReader.java`
#### Snippet
```java
            return result;
        }
        return super.defaultDoReadValue(resultSet, metaData, columnIndex);
    }
    
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/driver/spi/AbsolutePathDriverURLProvider.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            String line;
            while (null != (line = reader.readLine())) {
                if (!line.startsWith("#")) {
                    builder.append(line).append('\n');
```

### NestedAssignment
Result of assignment expression used
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/driver/spi/ClasspathDriverURLProvider.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            String line;
            while (null != (line = reader.readLine())) {
                if (!line.startsWith("#")) {
                    builder.append(line).append('\n');
```

### NestedAssignment
Result of assignment expression used
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            List<ResultSet> resultSets = getResultSets();
            Map<String, Integer> columnLabelAndIndexMap = null != this.columnLabelAndIndexMap ? this.columnLabelAndIndexMap
                    : (this.columnLabelAndIndexMap = ShardingSphereResultSetUtil.createColumnLabelAndIndexMap(sqlStatementContext, resultSets.get(0).getMetaData()));
            result = new ShardingSphereResultSet(resultSets, mergedResult, this, executionContext, columnLabelAndIndexMap);
            // CHECKSTYLE:OFF
```

### NestedAssignment
Result of assignment expression used
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            MergedResult mergedResult = mergeQuery(getQueryResults(resultSets));
            Map<String, Integer> columnLabelAndIndexMap = null != this.columnLabelAndIndexMap ? this.columnLabelAndIndexMap
                    : (this.columnLabelAndIndexMap = ShardingSphereResultSetUtil.createColumnLabelAndIndexMap(sqlStatementContext, resultSets.get(0).getMetaData()));
            currentResultSet = new ShardingSphereResultSet(resultSets, mergedResult, this, executionContext, columnLabelAndIndexMap);
        }
```

### NestedAssignment
Result of assignment expression used
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/prepare/driver/DriverExecutionPrepareEngine.java`
#### Snippet
```java
    private SQLExecutionUnitBuilder getCachedSqlExecutionUnitBuilder(final String type) {
        SQLExecutionUnitBuilder result;
        if (null == (result = TYPE_TO_BUILDER_MAP.get(type))) {
            result = TYPE_TO_BUILDER_MAP.computeIfAbsent(type, key -> TypedSPILoader.getService(SQLExecutionUnitBuilder.class, key));
        }
```

### NestedAssignment
Result of assignment expression used
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/command/query/PostgreSQLCommand.java`
#### Snippet
```java
    private static Optional<PostgreSQLCommand> getPostgreSQLCommand(final Class<? extends SQLStatement> sqlStatementClass) {
        Optional<PostgreSQLCommand> result;
        if (null == (result = COMPUTED_CLASSES.get(sqlStatementClass))) {
            result = COMPUTED_CLASSES.computeIfAbsent(sqlStatementClass, target -> Arrays.stream(PostgreSQLCommand.values()).filter(each -> matches(target, each)).findAny());
        }
```

### NestedAssignment
Result of assignment expression used
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/keygen/SnowflakeKeyGenerateAlgorithm.java`
#### Snippet
```java
        }
        if (lastMilliseconds == currentMilliseconds) {
            if (0L == (sequence = (sequence + 1) & SEQUENCE_MASK)) {
                currentMilliseconds = waitUntilNextTime(currentMilliseconds);
            }
```

### NestedAssignment
Result of assignment expression used
in `features/sharding/plugin/cache/src/main/java/org/apache/shardingsphere/sharding/cache/checker/ShardingRouteCacheableChecker.java`
#### Snippet
```java
        if (1 != tableNames.size() || null != statementContext.getInsertSelectContext() || null != statementContext.getOnDuplicateKeyUpdateValueContext()
                || statementContext.getGeneratedKeyContext().map(GeneratedKeyContext::isGenerated).orElse(false)
                || (isShardingTable = shardingRule.isAllShardingTables(tableNames)) && containsNonCacheableShardingAlgorithm(tableNames)
                || !isShardingTable && !shardingRule.isAllBroadcastTables(tableNames)) {
            return new ShardingRouteCacheableCheckResult(false, Collections.emptyList());
```

### NestedAssignment
Result of assignment expression used
in `features/sharding/plugin/cache/src/main/java/org/apache/shardingsphere/sharding/cache/checker/ShardingRouteCacheableChecker.java`
#### Snippet
```java
        Collection<String> tableNames = statementContext.getTablesContext().getTableNames();
        boolean isShardingTable;
        if (1 != tableNames.size() || (isShardingTable = shardingRule.isAllShardingTables(tableNames)) && containsNonCacheableShardingAlgorithm(tableNames)
                || !isShardingTable && !shardingRule.isAllBroadcastTables(tableNames)) {
            return new ShardingRouteCacheableCheckResult(false, Collections.emptyList());
```

### NestedAssignment
Result of assignment expression used
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/PostgreSQLAggregatedCommandPacket.java`
#### Snippet
```java
        this.firstBindIndex = firstBindIndex;
        this.lastExecuteIndex = lastExecuteIndex;
        if (this.containsBatchedStatements = firstStatementBindTimes == firstStatementExecuteTimes && firstStatementBindTimes >= 3) {
            ensureRandomAccessible(packets);
        }
```

### NestedAssignment
Result of assignment expression used
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLByteConverter.java`
#### Snippet
```java
        idx += 2;
        short s;
        while ((s = shortStacks.pop()) != -1) {
            int2(result, idx, s);
            idx += 2;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`startIndex = startIndex + SQLHintTokenEnum.SQL_HINT_TOKEN.getKey().length()` could be simplified to 'startIndex += SQLHintTokenEnum.SQL_HINT_TOKEN.getKey().length()'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/hint/SQLHintUtils.java`
#### Snippet
```java
            return result;
        }
        startIndex = startIndex + SQLHintTokenEnum.SQL_HINT_TOKEN.getKey().length();
        int endIndex = comment.endsWith(SQL_COMMENT_SUFFIX) ? comment.indexOf(SQL_COMMENT_SUFFIX) : comment.length();
        Collection<String> sqlHints = Splitter.on(SQL_HINT_SPLIT).trimResults().splitToList(comment.substring(startIndex, endIndex).trim());
```

### ReplaceAssignmentWithOperatorAssignment
`calculatingShardingCount = calculatingShardingCount / 10` could be simplified to 'calculatingShardingCount /= 10'
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/mod/ModShardingAlgorithm.java`
#### Snippet
```java
        while (0 != calculatingShardingCount) {
            result++;
            calculatingShardingCount = calculatingShardingCount / 10;
        }
        return Math.max(result, 1);
```

### ReplaceAssignmentWithOperatorAssignment
`exactWeights[i] = exactWeights[i] / sum` could be simplified to 'exactWeights\[i\] /= sum'
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/algorithm/loadbalance/WeightReadQueryLoadBalanceAlgorithm.java`
#### Snippet
```java
                continue;
            }
            exactWeights[i] = exactWeights[i] / sum;
        }
        return calculateWeight(exactWeights);
```

### ReplaceAssignmentWithOperatorAssignment
`d = (short) (d / INT_TEN_POWERS[4 - effectiveScale])` could be simplified to 'd /= INT_TEN_POWERS\[4 - effectiveScale\]'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLByteConverter.java`
#### Snippet
```java
            effectiveScale -= 4;
        } else {
            d = (short) (d / INT_TEN_POWERS[4 - effectiveScale]);
            effectiveScale = 0;
        }
```

### ReplaceAssignmentWithOperatorAssignment
`d = (short) (d / INT_TEN_POWERS[4 - effectiveScale])` could be simplified to 'd /= INT_TEN_POWERS\[4 - effectiveScale\]'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLByteConverter.java`
#### Snippet
```java
                    unscaledBI = unscaledBI.multiply(tenPower(effectiveScale));
                }
                d = (short) (d / INT_TEN_POWERS[4 - effectiveScale]);
                effectiveScale = 0;
            }
```

### ReplaceAssignmentWithOperatorAssignment
`unscaledLong = unscaledLong / 10000L` could be simplified to 'unscaledLong /= 10000L'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLByteConverter.java`
#### Snippet
```java
        do {
            shortStacks.push((short) (unscaledLong % 10000));
            unscaledLong = unscaledLong / 10000L;
            ++result;
        } while (0 != unscaledLong);
```

### ReplaceAssignmentWithOperatorAssignment
`d = (short) (d / INT_TEN_POWERS[4 - effectiveScale])` could be simplified to 'd /= INT_TEN_POWERS\[4 - effectiveScale\]'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLByteConverter.java`
#### Snippet
```java
                    unscaledBI = unscaledBI.multiply(tenPower(effectiveScale));
                }
                d = (short) (d / INT_TEN_POWERS[4 - effectiveScale]);
                effectiveScale = 0;
            }
```

## RuleId[ruleID=Lombok]
### Lombok
Not generating equals and hashCode: A method with one of those names already exists. (Either both or none of these methods will be generated).
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/orderby/OrderByItem.java`
#### Snippet
```java
@Getter
@Setter
@EqualsAndHashCode
public final class OrderByItem {
    
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `afterValue` are queried, but never updated
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/importer/DataSourceImporter.java`
#### Snippet
```java
        String sql = sqlOptional.get();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            List<Any> afterValue = new ArrayList<>(record.getAfterMap().values());
            ProtocolStringList uniqueKeyNamesList = record.getTableMetaData().getUniqueKeyNamesList();
            List<String> conditionColumnNames = record.getBeforeMap().keySet().containsAll(uniqueKeyNamesList) ? uniqueKeyNamesList : new ArrayList<>(record.getBeforeMap().keySet());
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `preInstances` is accessed in both synchronized and unsynchronized contexts
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/listener/NamingEventListener.java`
#### Snippet
```java
public final class NamingEventListener implements EventListener {
    
    private Map<String, Instance> preInstances = new HashMap<>();
    
    private final Map<String, DataChangedEventListener> prefixListenerMap = new HashMap<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `startIndex` is accessed in both synchronized and unsynchronized contexts
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/channel/memory/ManualBitSet.java`
#### Snippet
```java
    private final List<BitSet> bitSets = new LinkedList<>();
    
    private long startIndex;
    
    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `responseCallback` is accessed in both synchronized and unsynchronized contexts
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
    private Channel channel;
    
    private Promise<Object> responseCallback;
    
    private final ArrayBlockingQueue<AbstractBinlogEvent> blockingEventQueue = new ArrayBlockingQueue<>(10000);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `channel` is accessed in both synchronized and unsynchronized contexts
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
    private EventLoopGroup eventLoopGroup;
    
    private Channel channel;
    
    private Promise<Object> responseCallback;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `eventLoopGroup` is accessed in both synchronized and unsynchronized contexts
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
    private final ConnectInfo connectInfo;
    
    private EventLoopGroup eventLoopGroup;
    
    private Channel channel;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxVibrationOffset` is accessed in both synchronized and unsynchronized contexts
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/keygen/SnowflakeKeyGenerateAlgorithm.java`
#### Snippet
```java
    private Properties props;
    
    private int maxVibrationOffset;
    
    private int maxTolerateTimeDifferenceMilliseconds;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `maxTolerateTimeDifferenceMilliseconds` is accessed in both synchronized and unsynchronized contexts
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/keygen/SnowflakeKeyGenerateAlgorithm.java`
#### Snippet
```java
    private int maxVibrationOffset;
    
    private int maxTolerateTimeDifferenceMilliseconds;
    
    private volatile int sequenceOffset = -1;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/data/pipeline/datasource/creator/ShardingSpherePipelineDataSourceCreator.java`
#### Snippet
```java
    private void enableStreamingQuery(final YamlRootConfiguration rootConfig) {
        // Set a large enough value to enable ConnectionMode.MEMORY_STRICTLY, make sure streaming query work.
        rootConfig.getProps().put(ConfigurationPropertyKey.MAX_CONNECTIONS_SIZE_PER_QUERY.getKey(), 100000);
    }
    
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/data/pipeline/datasource/creator/ShardingSpherePipelineDataSourceCreator.java`
#### Snippet
```java
        for (YamlAlgorithmConfiguration each : shardingRuleConfig.getShardingAlgorithms().values()) {
            if ("INLINE".equalsIgnoreCase(each.getType())) {
                each.getProps().put("allow-range-query-with-inline-sharding", Boolean.TRUE.toString());
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `mode/type/standalone/core/src/main/java/org/apache/shardingsphere/mode/manager/standalone/workerid/generator/StandaloneWorkerIdGenerator.java`
#### Snippet
```java
            return DEFAULT_WORKER_ID;
        }
        Object workerId = props.get(WORKER_ID_KEY);
        if (null == workerId) {
            return DEFAULT_WORKER_ID;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/external/env/SQLParserExternalITEnvironment.java`
#### Snippet
```java
    private SQLParserExternalITEnvironment() {
        Properties props = loadProperties();
        sqlParserITEnabled = Boolean.parseBoolean(props.get(SQL_PARSER_EXTERNAL_IT_ENABLED_KEY).toString());
        resultPath = props.getOrDefault(SQL_PARSER_EXTERNAL_IT_REPORT_PATH, "/tmp/").toString();
        resultProcessorType = props.getOrDefault(SQL_PARSER_EXTERNAL_IT_REPORT_TYPE, "LOG").toString();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `infra/common/src/main/java/org/apache/shardingsphere/infra/hint/SQLHintUtils.java`
#### Snippet
```java
            List<String> hintValues = Splitter.on(SQL_HINT_VALUE_SPLIT).trimResults().splitToList(each);
            if (SQL_HINT_VALUE_SIZE == hintValues.size()) {
                result.put(hintValues.get(0), convert(hintValues.get(1)));
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/creator/DataSourceReflection.java`
#### Snippet
```java
        } else if (Properties.class == paramType) {
            Properties props = new Properties();
            props.putAll((Map) fieldValue);
            method.invoke(dataSource, props);
        } else {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/SetDistVariableUpdater.java`
#### Snippet
```java
        props.putAll(metaDataContexts.getMetaData().getProps().getProps());
        props.putAll(metaDataContexts.getMetaData().getInternalProps().getProps());
        props.put(propertyKey.getKey(), getValue(propertyKey, value));
        contextManager.getInstanceContext().getModeContextManager().alterProperties(props);
        refreshRootLogger(props);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = props.get(key);
            if (null == value) {
                continue;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/Bootstrap.java`
#### Snippet
```java
        List<String> addresses = bootstrapArgs.getAddresses();
        new BootstrapInitializer().init(yamlConfig, port, bootstrapArgs.getForce());
        Optional.ofNullable((Integer) yamlConfig.getServerConfiguration().getProps().get(ConfigurationPropertyKey.CDC_SERVER_PORT.getKey()))
                .ifPresent(cdcPort -> new CDCServer(addresses, cdcPort).start());
        new ShardingSphereProxy().start(port, addresses);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/utils/LoggingUtils.java`
#### Snippet
```java
    private static void syncPropsToLoggingRule(final Properties loggerProperties, final ConfigurationProperties props) {
        if (!loggerProperties.containsKey(LoggingConstants.SQL_LOG_ENABLE) && props.getProps().containsKey(LoggingConstants.SQL_SHOW)) {
            loggerProperties.setProperty(LoggingConstants.SQL_LOG_ENABLE, props.getProps().get(LoggingConstants.SQL_SHOW).toString());
        }
        if (!loggerProperties.containsKey(LoggingConstants.SQL_LOG_SIMPLE) && props.getProps().containsKey(LoggingConstants.SQL_SIMPLE)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/utils/LoggingUtils.java`
#### Snippet
```java
        }
        if (!loggerProperties.containsKey(LoggingConstants.SQL_LOG_SIMPLE) && props.getProps().containsKey(LoggingConstants.SQL_SIMPLE)) {
            loggerProperties.setProperty(LoggingConstants.SQL_LOG_SIMPLE, props.getProps().get(LoggingConstants.SQL_SIMPLE).toString());
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/utils/LoggingUtils.java`
#### Snippet
```java
    private static void syncLoggingRuleToProps(final Properties loggerProperties, final ConfigurationProperties props) {
        if (loggerProperties.containsKey(LoggingConstants.SQL_LOG_ENABLE)) {
            props.getProps().setProperty(LoggingConstants.SQL_SHOW, loggerProperties.get(LoggingConstants.SQL_LOG_ENABLE).toString());
        }
        if (loggerProperties.containsKey(LoggingConstants.SQL_LOG_SIMPLE)) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/utils/LoggingUtils.java`
#### Snippet
```java
        }
        if (loggerProperties.containsKey(LoggingConstants.SQL_LOG_SIMPLE)) {
            props.getProps().setProperty(LoggingConstants.SQL_SIMPLE, loggerProperties.get(LoggingConstants.SQL_LOG_SIMPLE).toString());
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/algorithm/loadbalance/WeightReadQueryLoadBalanceAlgorithm.java`
#### Snippet
```java
    
    private double getWeightValue(final String readDataSourceName) {
        Object weightObject = props.get(readDataSourceName);
        ShardingSpherePreconditions.checkNotNull(weightObject, () -> new MissingRequiredReadDatabaseWeightException(getType(),
                String.format("Read database `%s` access weight is not configured", readDataSourceName)));
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/payload/MySQLPacketPayload.java`
#### Snippet
```java
     * @param value 6 byte fixed length integer
     */
    public void writeInt6(final long value) {
        // TODO
    }
```

### EmptyMethod
The method is empty
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/payload/MySQLPacketPayload.java`
#### Snippet
```java
     * @param value variable length string
     */
    public void writeStringVar(final String value) {
        // TODO
    }
```

### EmptyMethod
All implementations of this method are empty
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/context/PipelineJobItemContext.java`
#### Snippet
```java
     * @param status job status
     */
    void setStatus(JobStatus status);
    
    /**
```

### EmptyMethod
All implementations of this method are empty
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/context/PipelineJobItemContext.java`
#### Snippet
```java
     * @param stopping stopping
     */
    void setStopping(boolean stopping);
    
    /**
```

### EmptyMethod
Method only calls its super
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/ConsulRepository.java`
#### Snippet
```java
    
    @Override
    public Collection<String> getTypeAliases() {
        return ClusterPersistRepository.super.getTypeAliases();
    }
```

### EmptyMethod
All implementations of this method are empty
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/generic/AliasAvailable.java`
#### Snippet
```java
     * @param alias alias
     */
    void setAlias(AliasSegment alias);
}

```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/EmptyStatementAssert.java`
#### Snippet
```java
     * @param expected expected empty statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final EmptyStatement actual, final EmptyStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/RestartStatementAssert.java`
#### Snippet
```java
     * @param expected expected restart statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLRestartStatement actual, final RestartStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowCreateTableStatementAssert.java`
#### Snippet
```java
     * @param expected expected show create table statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLShowCreateTableStatement actual, final ShowCreateTableStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowReplicasStatementAssert.java`
#### Snippet
```java
     * @param expected expected show replicas statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLShowReplicasStatement actual, final ShowReplicasStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowSlaveHostsStatementAssert.java`
#### Snippet
```java
     * @param expected expected show slave host statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLShowSlaveHostsStatement actual, final ShowSlaveHostsStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShutdownStatementAssert.java`
#### Snippet
```java
     * @param expected expected shutdown statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLShutdownStatement actual, final ShutdownStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/AlterRoleStatementAssert.java`
#### Snippet
```java
     * @param expected expected alter role statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final AlterRoleStatement actual, final AlterRoleStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/AlterUserStatementAssert.java`
#### Snippet
```java
     * @param expected expected alter user statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final AlterUserStatement actual, final AlterUserStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/CreateRoleStatementAssert.java`
#### Snippet
```java
     * @param expected expected create role statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final CreateRoleStatement actual, final CreateRoleStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/CreateUserStatementAssert.java`
#### Snippet
```java
     * @param expected expected create user statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final CreateUserStatement actual, final CreateUserStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/DropRoleStatementAssert.java`
#### Snippet
```java
     * @param expected expected drop role statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final DropRoleStatement actual, final DropRoleStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/DropUserStatementAssert.java`
#### Snippet
```java
     * @param expected expected drop user statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final DropUserStatement actual, final DropUserStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/ReassignOwnedStatementAssert.java`
#### Snippet
```java
     * @param expected expected reassign owned statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final ReassignOwnedStatement actual, final ReassignOwnedStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/RenameUserStatementAssert.java`
#### Snippet
```java
     * @param expected expected rename user statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLRenameUserStatement actual, final RenameUserStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/SetDefaultRoleStatementAssert.java`
#### Snippet
```java
     * @param expected expected set role statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLSetDefaultRoleStatement actual, final SetDefaultRoleStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/SetPasswordStatementAssert.java`
#### Snippet
```java
     * @param expected expected set password statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final MySQLSetPasswordStatement actual, final SetPasswordStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/SetRoleStatementAssert.java`
#### Snippet
```java
     * @param expected expected set role statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SetRoleStatement actual, final SetRoleStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AlterSessionStatementAssert.java`
#### Snippet
```java
     * @param expected expected alter session statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final OracleAlterSessionStatement actual, final AlterSessionStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AlterSynonymStatementAssert.java`
#### Snippet
```java
     * @param expected expected alter synonym statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final OracleAlterSynonymStatement actual, final AlterSynonymStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AlterSystemStatementAssert.java`
#### Snippet
```java
     * @param expected expected alter system statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final AlterSystemStatement actual, final AlterSystemStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AuditStatementAssert.java`
#### Snippet
```java
     * @param expected expected audit statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final OracleAuditStatement actual, final AuditStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/NoAuditStatementAssert.java`
#### Snippet
```java
     * @param expected expected no audit statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final OracleNoAuditStatement actual, final NoAuditStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/NotifyStmtStatementAssert.java`
#### Snippet
```java
     * @param expected expected notify statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final NotifyStmtStatement actual, final NotifyStmtStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/RefreshMatViewStmtStatementAssert.java`
#### Snippet
```java
     * @param expected expected refresh materialized view statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final RefreshMatViewStmtStatement actual, final RefreshMatViewStmtStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/ReindexStatementAssert.java`
#### Snippet
```java
     * @param expected expected reindex statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final ReindexStatement actual, final ReindexStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/SecurityLabelStmtStatementAssert.java`
#### Snippet
```java
     * @param expected expected security label statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SecurityLabelStmtStatement actual, final SecurityLabelStmtStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/UnlistenStatementAssert.java`
#### Snippet
```java
     * @param expected expected unlisten statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final UnlistenStatement actual, final UnlistenStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/SetDistVariableStatementAssert.java`
#### Snippet
```java
     * @param expected expected set dist variable statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SetDistVariableStatement actual, final SetDistVariableStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/BeginTransactionStatementAssert.java`
#### Snippet
```java
     * @param expected expected begin transaction statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final BeginTransactionStatement actual, final BeginTransactionStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/CommitStatementAssert.java`
#### Snippet
```java
     * @param expected expected commit statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final CommitStatement actual, final CommitStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/PrepareTransactionStatementAssert.java`
#### Snippet
```java
     * @param expected expected prepare transaction statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final PrepareTransactionStatement actual, final PrepareTransactionTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/SetConstraintsStatementAssert.java`
#### Snippet
```java
     * @param expected expected set constraints statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SetConstraintsStatement actual, final SetConstraintsStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/SetTransactionStatementAssert.java`
#### Snippet
```java
     * @param expected expected set transaction statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final SetTransactionStatement actual, final SetTransactionStatementTestCase expected) {
    }
}
```

### EmptyMethod
The method is empty
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/UnlockStatementAssert.java`
#### Snippet
```java
     * @param expected expected unlock statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final UnlockStatement actual, final UnlockStatementTestCase expected) {
    }
}
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/orderby/OrderByItem.java`
#### Snippet
```java
@Setter
@EqualsAndHashCode
public final class OrderByItem {
    
    private final OrderByItemSegment segment;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/dml/column/ColumnSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class ColumnSegment implements ExpressionSegment, OwnerAvailable {
    
    private final int startIndex;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `SQLSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/ddl/type/TypeSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class TypeSegment implements SQLSegment, OwnerAvailable {
    
    private final int startIndex;
```

### RedundantImplements
Redundant interface declaration `SQLSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/ddl/index/IndexTypeSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class IndexTypeSegment implements SQLSegment, OwnerAvailable {
    
    private final int startIndex;
```

### RedundantImplements
Redundant interface declaration `SQLSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/ddl/index/IndexSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class IndexSegment implements SQLSegment, OwnerAvailable {
    
    private final int startIndex;
```

### RedundantImplements
Redundant interface declaration `SQLSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/ddl/routine/FunctionNameSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class FunctionNameSegment implements SQLSegment, OwnerAvailable {
    
    private final int startIndex;
```

### RedundantImplements
Redundant interface declaration `SQLSegment`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/ddl/packages/PackageSegment.java`
#### Snippet
```java
@Getter
@Setter
public final class PackageSegment implements SQLSegment, OwnerAvailable {
    
    private final int startIndex;
```

### RedundantImplements
Redundant interface declaration `DDLStatement`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/statement/oracle/ddl/OracleDropDirectoryStatement.java`
#### Snippet
```java
 * Oracle drop directory statement.
 */
public final class OracleDropDirectoryStatement extends DropDirectoryStatement implements DDLStatement, OracleStatement {
}

```

### RedundantImplements
Redundant interface declaration `DDLStatement`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/statement/oracle/ddl/OracleAlterSynonymStatement.java`
#### Snippet
```java
 * Oracle alter synonym statement.
 */
public final class OracleAlterSynonymStatement extends AlterSynonymStatement implements DDLStatement, OracleStatement {
}

```

### RedundantImplements
Redundant interface declaration `DDLStatement`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/statement/sqlserver/ddl/SQLServerCreateTriggerStatement.java`
#### Snippet
```java
 * SQLServer create trigger statement.
 */
public final class SQLServerCreateTriggerStatement extends CreateTriggerStatement implements DDLStatement, SQLServerStatement {
}

```

### RedundantImplements
Redundant interface declaration `DDLStatement`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/statement/sqlserver/ddl/SQLServerDropTriggerStatement.java`
#### Snippet
```java
 * SQLServer drop trigger statement.
 */
public final class SQLServerDropTriggerStatement extends DropTriggerStatement implements DDLStatement, SQLServerStatement {
}

```

### RedundantImplements
Redundant interface declaration `DDLStatement`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/statement/sqlserver/ddl/SQLServerAlterTriggerStatement.java`
#### Snippet
```java
 * SQLServer alter trigger statement.
 */
public final class SQLServerAlterTriggerStatement extends AlterTriggerStatement implements DDLStatement, SQLServerStatement {
}

```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92StatementSQLVisitor.java`
#### Snippet
```java
            String rightText = "";
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92StatementSQLVisitor.java`
#### Snippet
```java
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
            Token operatorToken = null;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92StatementSQLVisitor.java`
#### Snippet
```java
            }
            int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
            ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLStatementSQLVisitor.java`
#### Snippet
```java
            String rightText = "";
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLStatementSQLVisitor.java`
#### Snippet
```java
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
            Token operatorToken = null;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLStatementSQLVisitor.java`
#### Snippet
```java
            }
            int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
            ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleStatementSQLVisitor.java`
#### Snippet
```java
        String rightText = "";
        if (null != ctx.NOT()) {
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(), ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
        }
        Token operatorToken = null;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleStatementSQLVisitor.java`
#### Snippet
```java
        String rightText = "";
        if (null != ctx.NOT()) {
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(), ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
        }
        Token operatorToken = null;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleStatementSQLVisitor.java`
#### Snippet
```java
        }
        int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
        rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
        ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
            String rightText = "";
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
            Token operatorToken = null;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
            }
            int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
            ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `mode/type/cluster/repository/provider/zookeeper/src/main/java/org/apache/shardingsphere/mode/repository/cluster/zookeeper/ZookeeperRepository.java`
#### Snippet
```java
        } catch (final Exception ex) {
            // CHECKSTYLE:ON
            if (ex instanceof NodeExistsException) {
                throw new ClusterPersistRepositoryException(ex);
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/AbstractPipelineJob.java`
#### Snippet
```java
            jobAPI.persistJobItemErrorMessage(jobItemContext.getJobId(), jobItemContext.getShardingItem(), ex);
            jobAPI.stop(jobId);
            if (ex instanceof RuntimeException) {
                throw (RuntimeException) ex;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/DataMatchDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
            // CHECKSTYLE:ON
            calculationContext.close();
            if (ex instanceof PipelineSQLException) {
                throw (PipelineSQLException) ex;
            }
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `docs/blog/layouts/shortcodes/qq.html`
#### Snippet
```java
            frameborder="no"
            framespacing="0"
            allowFullScreen="true"
            sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts"
            style="position: absolute; width: 100%; height: 100%; left: 0; top: 0;"
```

### HtmlWrongAttributeValue
Wrong attribute value
in `docs/blog/layouts/shortcodes/bilibili.html`
#### Snippet
```java
            frameborder="no" 
            framespacing="0" 
            allowfullscreen="true"
            sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts"
            style="position: absolute; width: 100%; height: 100%; left: 0; top: 0;"
```

### HtmlWrongAttributeValue
Wrong attribute value
in `docs/document/layouts/shortcodes/bilibili.html`
#### Snippet
```java
            frameborder="no" 
            framespacing="0" 
            allowfullscreen="true"
            sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts"
            >
```

### HtmlWrongAttributeValue
Wrong attribute value
in `docs/community/layouts/shortcodes/bilibili.html`
#### Snippet
```java
            frameborder="no" 
            framespacing="0" 
            allowfullscreen="true"
            sandbox="allow-top-navigation allow-same-origin allow-forms allow-scripts"
            >
```

### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-25-19-19-13.718.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/listener/NamingEventListener.java`
#### Snippet
```java
        List<Instance> instances = namingEvent.getInstances().stream().sorted(Comparator.comparing(NacosMetaDataUtil::getKey)).collect(Collectors.toList());
        List<WatchData> watchDataList = new LinkedList<>();
        synchronized (this) {
            instances.forEach(instance -> prefixListenerMap.forEach((prefixPath, listener) -> {
                String key = NacosMetaDataUtil.getKey(instance);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/cache/OrderedServicesCache.java`
#### Snippet
```java
        Map<Key, Map<?, ?>> cache = OrderedServicesCache.cache.get();
        if (null == cache) {
            synchronized (OrderedServicesCache.class) {
                cache = OrderedServicesCache.cache.get();
                if (null == cache) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
     */
    public void closeExecutionResources() throws BackendConnectionException {
        synchronized (this) {
            Collection<Exception> result = new LinkedList<>(closeHandlers(false));
            if (!connectionSession.getTransactionStatus().isInConnectionHeldTransaction()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/BackendConnection.java`
#### Snippet
```java
     */
    public void closeAllResources() {
        synchronized (this) {
            closed.set(true);
            closeHandlers(true);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/PipelineAPIFactory.java`
#### Snippet
```java
        public static CoordinatorRegistryCenter getInstance() {
            if (null == instance) {
                synchronized (PipelineAPIFactory.class) {
                    if (null == instance) {
                        instance = createRegistryCenter();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/PipelineAPIFactory.java`
#### Snippet
```java
        public static ElasticJobAPIHolder getInstance() {
            if (null == instance) {
                synchronized (PipelineAPIFactory.class) {
                    if (null == instance) {
                        instance = new ElasticJobAPIHolder();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/channel/memory/MultiplexMemoryPipelineChannel.java`
#### Snippet
```java
    private void checkAssignment(final String threadId) {
        if (!channelAssignment.containsKey(threadId)) {
            synchronized (this) {
                if (!channelAssignment.containsKey(threadId)) {
                    assignmentChannel(threadId);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/channel/memory/ManualBitSet.java`
#### Snippet
```java
    public void clear(final long bitIndex) {
        if ((bitIndex - startIndex) > BIT_SET_SIZE) {
            synchronized (this) {
                int count = Math.min(bitSets.size(), (int) ((bitIndex - startIndex) / BIT_SET_SIZE));
                if (count > 0) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/ShardingSphereDriver.java`
#### Snippet
```java
    @Override
    public DriverPropertyInfo[] getPropertyInfo(final String url, final Properties info) {
        return new DriverPropertyInfo[0];
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public byte[] getBytes(final String columnLabel) {
        return new byte[0];
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public byte[] getBytes(final int columnIndex) {
        return new byte[0];
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
    public int[] executeBatch() throws SQLException {
        if (null == executionContext) {
            return new int[0];
        }
        try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/executor/batch/BatchPreparedStatementExecutor.java`
#### Snippet
```java
        List<int[]> results = jdbcExecutor.execute(executionGroupContext, callback);
        if (results.isEmpty()) {
            return new int[0];
        }
        return isNeedAccumulate(sqlStatementContext) ? accumulate(results) : results.get(0);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `test/fixture/jdbc/src/main/java/org/apache/shardingsphere/test/fixture/jdbc/MockedDriver.java`
#### Snippet
```java
    @Override
    public DriverPropertyInfo[] getPropertyInfo(final String url, final Properties info) {
        return new DriverPropertyInfo[0];
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/plugins/metrics/type/prometheus/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/prometheus/collector/type/PrometheusMetricsSummaryCollector.java`
#### Snippet
```java
    
    public PrometheusMetricsSummaryCollector(final MetricConfiguration config) {
        summary = Summary.build().name(config.getId()).help(config.getHelp()).labelNames(config.getLabels().toArray(new String[0])).register();
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/plugins/metrics/type/prometheus/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/prometheus/collector/type/PrometheusMetricsGaugeCollector.java`
#### Snippet
```java
    
    public PrometheusMetricsGaugeCollector(final MetricConfiguration config) {
        gauge = Gauge.build().name(config.getId()).help(config.getHelp()).labelNames(config.getLabels().toArray(new String[0])).register();
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/plugins/metrics/type/prometheus/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/prometheus/collector/type/PrometheusMetricsCounterCollector.java`
#### Snippet
```java
    
    public PrometheusMetricsCounterCollector(final MetricConfiguration config) {
        counter = Counter.build().name(config.getId()).help(config.getHelp()).labelNames(config.getLabels().toArray(new String[0])).register();
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/plugins/metrics/type/prometheus/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/prometheus/collector/type/PrometheusMetricsHistogramCollector.java`
#### Snippet
```java
    
    public PrometheusMetricsHistogramCollector(final MetricConfiguration config) {
        Builder builder = Histogram.build().name(config.getId()).help(config.getHelp()).labelNames(config.getLabels().toArray(new String[0]));
        appendProperties(builder, config.getProps());
        histogram = builder.register();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/progress/yaml/YamlJobItemInventoryTasksProgress.java`
#### Snippet
```java
public final class YamlJobItemInventoryTasksProgress {
    
    private String[] finished = new String[0];
    
    private Map<String, String> unfinished = new HashMap<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/netty/MySQLNegotiateHandler.java`
#### Snippet
```java
    @SneakyThrows(NoSuchAlgorithmException.class)
    private byte[] generateAuthResponse(final byte[] authPluginData) {
        return (null == password || password.isEmpty()) ? new byte[0] : PasswordEncryption.encryptWithMySQL41(password.getBytes(), authPluginData);
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
        Preconditions.checkArgument(0 == (dataLength & 1), "Illegal hex data `%s`", hexString);
        if (0 == dataLength) {
            return new byte[0];
        }
        byte[] result = new byte[dataLength >>> 1];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
        Preconditions.checkArgument(0 == (dataLength & 1), "Illegal hex data `%s`", hexString);
        if (0 == dataLength) {
            return new byte[0];
        }
        byte[] result = new byte[dataLength >>> 1];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/row/EmptyRowEnumerator.java`
#### Snippet
```java
            return (T) new Object();
        } else {
            return (T) new Object[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    public boolean next() {
        boolean result = enumerator.moveNext();
        currentRows = result ? (enumerator.current().getClass().isArray() ? (Object[]) enumerator.current() : new Object[]{enumerator.current()}) : new Object[]{};
        return result;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM3EncryptAlgorithm.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkState(salt.isEmpty() || SALT_LENGTH == salt.length(),
                () -> new EncryptAlgorithmInitializationException("SM3", "Salt should be either blank or better " + SALT_LENGTH + " bytes long."));
        return salt.isEmpty() ? new byte[0] : salt.getBytes(StandardCharsets.UTF_8);
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/handshake/MySQLHandshakePacket.java`
#### Snippet
```java
     */
    private byte[] readAuthPluginDataPart2(final MySQLPacketPayload payload) {
        return isClientSecureConnection() ? payload.readStringNulByBytes() : new byte[0];
    }
    
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/packet/authentication/OpenGaussMacCalculator.java`
#### Snippet
```java
    private static byte[] toHexBytes(final String hexString) {
        if (Strings.isNullOrEmpty(hexString)) {
            return new byte[0];
        }
        int length = hexString.length() / 2;
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/yaml/constructor/ShardingSphereYamlConstructor.java`
#### Snippet
```java
    
    public ShardingSphereYamlConstructor(final Class<?> rootClass) {
        super(rootClass, new LoaderOptions() {
            
            {
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'ParameterMarkerExpressionSegment' type conflicts with preceding 'instanceof ParameterMarkerLimitValueSegment' check
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
        if (null != astNode) {
            if (astNode instanceof ParameterMarkerLimitValueSegment) {
                return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
            }
            return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### CastConflictsWithInstanceof
Cast to 'ParameterMarkerExpressionSegment' type conflicts with preceding 'instanceof ParameterMarkerLimitValueSegment' check
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
        if (null != astNode) {
            if (astNode instanceof ParameterMarkerLimitValueSegment) {
                return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
            }
            return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### CastConflictsWithInstanceof
Cast to 'MySQLExplainStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dal/ExplainStatementHandler.java`
#### Snippet
```java
    public static Optional<SimpleTableSegment> getSimpleTableSegment(final ExplainStatement explainStatement) {
        if (explainStatement instanceof MySQLStatement) {
            return ((MySQLExplainStatement) explainStatement).getTable();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLAlterSchemaStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterSchemaStatementHandler.java`
#### Snippet
```java
    public static Optional<IdentifierValue> getRenameSchema(final AlterSchemaStatement alterSchemaStatement) {
        if (alterSchemaStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLAlterSchemaStatement) alterSchemaStatement).getRenameSchema();
        }
        if (alterSchemaStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussAlterSchemaStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterSchemaStatementHandler.java`
#### Snippet
```java
        }
        if (alterSchemaStatement instanceof OpenGaussStatement) {
            return ((OpenGaussAlterSchemaStatement) alterSchemaStatement).getRenameSchema();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLCreateFunctionStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateFunctionStatementHandler.java`
#### Snippet
```java
    public static Optional<RoutineBodySegment> getRoutineBodySegment(final CreateFunctionStatement createFunctionStatement) {
        if (createFunctionStatement instanceof MySQLStatement) {
            return ((MySQLCreateFunctionStatement) createFunctionStatement).getRoutineBody();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLFlushStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dal/FlushStatementHandler.java`
#### Snippet
```java
    public static Collection<SimpleTableSegment> getSimpleTableSegment(final FlushStatement flushStatement) {
        if (flushStatement instanceof MySQLStatement) {
            return ((MySQLFlushStatement) flushStatement).getTables();
        }
        return Collections.emptyList();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLClusterStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/ClusterStatementHandler.java`
#### Snippet
```java
    public static Optional<IndexSegment> getIndexSegment(final ClusterStatement clusterStatement) {
        if (clusterStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLClusterStatement) clusterStatement).getIndex();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLClusterStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/ClusterStatementHandler.java`
#### Snippet
```java
    public static Optional<SimpleTableSegment> getSimpleTableSegment(final ClusterStatement clusterStatement) {
        if (clusterStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLClusterStatement) clusterStatement).getTable();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCreateIndexStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateIndexStatementHandler.java`
#### Snippet
```java
    public static Optional<Integer> getGeneratedIndexStartIndex(final CreateIndexStatement createIndexStatement) {
        if (createIndexStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCreateIndexStatement) createIndexStatement).getGeneratedIndexStartIndex();
        }
        if (createIndexStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussCreateIndexStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateIndexStatementHandler.java`
#### Snippet
```java
        }
        if (createIndexStatement instanceof OpenGaussStatement) {
            return ((OpenGaussCreateIndexStatement) createIndexStatement).getGeneratedIndexStartIndex();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCreateIndexStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateIndexStatementHandler.java`
#### Snippet
```java
    public static boolean ifNotExists(final CreateIndexStatement createIndexStatement) {
        if (createIndexStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCreateIndexStatement) createIndexStatement).isIfNotExists();
        }
        if (createIndexStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussCreateIndexStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateIndexStatementHandler.java`
#### Snippet
```java
        }
        if (createIndexStatement instanceof OpenGaussStatement) {
            return ((OpenGaussCreateIndexStatement) createIndexStatement).isIfNotExists();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCreateSchemaStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateSchemaStatementHandler.java`
#### Snippet
```java
    public static Optional<IdentifierValue> getUsername(final CreateSchemaStatement createSchemaStatement) {
        if (createSchemaStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCreateSchemaStatement) createSchemaStatement).getUsername();
        }
        if (createSchemaStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussCreateSchemaStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateSchemaStatementHandler.java`
#### Snippet
```java
        }
        if (createSchemaStatement instanceof OpenGaussStatement) {
            return ((OpenGaussCreateSchemaStatement) createSchemaStatement).getUsername();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLAlterViewStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
    public static Optional<SelectStatement> getSelectStatement(final AlterViewStatement alterViewStatement) {
        if (alterViewStatement instanceof MySQLStatement) {
            return Optional.of(((MySQLAlterViewStatement) alterViewStatement).getSelect());
        }
        if (alterViewStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerAlterViewStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
        }
        if (alterViewStatement instanceof SQLServerStatement) {
            return Optional.of(((SQLServerAlterViewStatement) alterViewStatement).getSelect());
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLAlterViewStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
    public static Optional<String> getViewDefinition(final AlterViewStatement alterViewStatement) {
        if (alterViewStatement instanceof MySQLStatement) {
            return Optional.of(((MySQLAlterViewStatement) alterViewStatement).getViewDefinition());
        }
        if (alterViewStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerAlterViewStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
        }
        if (alterViewStatement instanceof SQLServerStatement) {
            return Optional.of(((SQLServerAlterViewStatement) alterViewStatement).getViewDefinition());
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLAlterViewStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
    public static Optional<SimpleTableSegment> getRenameView(final AlterViewStatement alterViewStatement) {
        if (alterViewStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLAlterViewStatement) alterViewStatement).getRenameView();
        }
        if (alterViewStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussAlterViewStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterViewStatementHandler.java`
#### Snippet
```java
        }
        if (alterViewStatement instanceof OpenGaussStatement) {
            return ((OpenGaussAlterViewStatement) alterViewStatement).getRenameView();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLDropSchemaStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropSchemaStatementHandler.java`
#### Snippet
```java
    public static boolean containsCascade(final DropSchemaStatement dropSchemaStatement) {
        if (dropSchemaStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLDropSchemaStatement) dropSchemaStatement).isContainsCascade();
        }
        if (dropSchemaStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OracleCommentStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CommentStatementHandler.java`
#### Snippet
```java
    public static Optional<IndexTypeSegment> getIndexType(final CommentStatement commentStatement) {
        if (commentStatement instanceof OracleStatement) {
            return Optional.ofNullable(((OracleCommentStatement) commentStatement).getIndexType());
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussDropSchemaStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropSchemaStatementHandler.java`
#### Snippet
```java
        }
        if (dropSchemaStatement instanceof OpenGaussStatement) {
            return ((OpenGaussDropSchemaStatement) dropSchemaStatement).isContainsCascade();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'MySQLDropIndexStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropIndexStatementHandler.java`
#### Snippet
```java
    public static Optional<SimpleTableSegment> getSimpleTableSegment(final DropIndexStatement dropIndexStatement) {
        if (dropIndexStatement instanceof MySQLStatement) {
            return ((MySQLDropIndexStatement) dropIndexStatement).getTable();
        }
        if (dropIndexStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerDropIndexStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropIndexStatementHandler.java`
#### Snippet
```java
        }
        if (dropIndexStatement instanceof SQLServerStatement) {
            return ((SQLServerDropIndexStatement) dropIndexStatement).getTable();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLDropIndexStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropIndexStatementHandler.java`
#### Snippet
```java
    public static boolean ifExists(final DropIndexStatement dropIndexStatement) {
        if (dropIndexStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLDropIndexStatement) dropIndexStatement).isIfExists();
        }
        if (dropIndexStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerDropIndexStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropIndexStatementHandler.java`
#### Snippet
```java
        }
        if (dropIndexStatement instanceof SQLServerStatement) {
            return ((SQLServerDropIndexStatement) dropIndexStatement).isIfExists();
        }
        if (dropIndexStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussDropIndexStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropIndexStatementHandler.java`
#### Snippet
```java
        }
        if (dropIndexStatement instanceof OpenGaussStatement) {
            return ((OpenGaussDropIndexStatement) dropIndexStatement).isIfExists();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'MySQLDropTableStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
    public static boolean ifExists(final DropTableStatement dropTableStatement) {
        if (dropTableStatement instanceof MySQLStatement) {
            return ((MySQLDropTableStatement) dropTableStatement).isIfExists();
        }
        if (dropTableStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLDropTableStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
        }
        if (dropTableStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLDropTableStatement) dropTableStatement).isIfExists();
        }
        if (dropTableStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerDropTableStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
        }
        if (dropTableStatement instanceof SQLServerStatement) {
            return ((SQLServerDropTableStatement) dropTableStatement).isIfExists();
        }
        if (dropTableStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussDropTableStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
        }
        if (dropTableStatement instanceof OpenGaussStatement) {
            return ((OpenGaussDropTableStatement) dropTableStatement).isIfExists();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLDropTableStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
    public static boolean containsCascade(final DropTableStatement dropTableStatement) {
        if (dropTableStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLDropTableStatement) dropTableStatement).isContainsCascade();
        }
        if (dropTableStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussDropTableStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/DropTableStatementHandler.java`
#### Snippet
```java
        }
        if (dropTableStatement instanceof OpenGaussStatement) {
            return ((OpenGaussDropTableStatement) dropTableStatement).isContainsCascade();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'SQLServerAlterIndexStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterIndexStatementHandler.java`
#### Snippet
```java
    public static Optional<SimpleTableSegment> getSimpleTableSegment(final AlterIndexStatement alterIndexStatement) {
        if (alterIndexStatement instanceof SQLServerStatement) {
            return ((SQLServerAlterIndexStatement) alterIndexStatement).getTable();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLAlterIndexStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterIndexStatementHandler.java`
#### Snippet
```java
    public static Optional<IndexSegment> getRenameIndexSegment(final AlterIndexStatement alterIndexStatement) {
        if (alterIndexStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLAlterIndexStatement) alterIndexStatement).getRenameIndex();
        }
        if (alterIndexStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussAlterIndexStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/AlterIndexStatementHandler.java`
#### Snippet
```java
        }
        if (alterIndexStatement instanceof OpenGaussStatement) {
            return ((OpenGaussAlterIndexStatement) alterIndexStatement).getRenameIndex();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLCreateProcedureStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateProcedureStatementHandler.java`
#### Snippet
```java
    public static Optional<RoutineBodySegment> getRoutineBodySegment(final CreateProcedureStatement createProcedureStatement) {
        if (createProcedureStatement instanceof MySQLStatement) {
            return ((MySQLCreateProcedureStatement) createProcedureStatement).getRoutineBody();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLUpdateStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/UpdateStatementHandler.java`
#### Snippet
```java
    public static Optional<LimitSegment> getLimitSegment(final UpdateStatement updateStatement) {
        if (updateStatement instanceof MySQLStatement) {
            return ((MySQLUpdateStatement) updateStatement).getLimit();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLUpdateStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/UpdateStatementHandler.java`
#### Snippet
```java
    public static Optional<OrderBySegment> getOrderBySegment(final UpdateStatement updateStatement) {
        if (updateStatement instanceof MySQLStatement) {
            return ((MySQLUpdateStatement) updateStatement).getOrderBy();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'SQLServerDeleteStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/DeleteStatementHandler.java`
#### Snippet
```java
    public static Optional<WithSegment> getWithSegment(final DeleteStatement deleteStatement) {
        if (deleteStatement instanceof SQLServerStatement) {
            return ((SQLServerDeleteStatement) deleteStatement).getWithSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLDeleteStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/DeleteStatementHandler.java`
#### Snippet
```java
    public static Optional<OrderBySegment> getOrderBySegment(final DeleteStatement deleteStatement) {
        if (deleteStatement instanceof MySQLStatement) {
            return ((MySQLDeleteStatement) deleteStatement).getOrderBy();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'SQLServerDeleteStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/DeleteStatementHandler.java`
#### Snippet
```java
    public static Optional<OutputSegment> getOutputSegment(final DeleteStatement deleteStatement) {
        if (deleteStatement instanceof SQLServerStatement) {
            return ((SQLServerDeleteStatement) deleteStatement).getOutputSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLDeleteStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/DeleteStatementHandler.java`
#### Snippet
```java
    public static Optional<LimitSegment> getLimitSegment(final DeleteStatement deleteStatement) {
        if (deleteStatement instanceof MySQLStatement) {
            return ((MySQLDeleteStatement) deleteStatement).getLimit();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'SQLServerCreateTableStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateTableStatementHandler.java`
#### Snippet
```java
    public static Optional<SelectStatement> getSelectStatement(final CreateTableStatement createTableStatement) {
        if (createTableStatement instanceof SQLServerStatement) {
            return ((SQLServerCreateTableStatement) createTableStatement).getSelectStatement();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLCreateTableStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateTableStatementHandler.java`
#### Snippet
```java
    public static boolean ifNotExists(final CreateTableStatement createTableStatement) {
        if (createTableStatement instanceof MySQLStatement) {
            return ((MySQLCreateTableStatement) createTableStatement).isIfNotExists();
        }
        if (createTableStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCreateTableStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateTableStatementHandler.java`
#### Snippet
```java
        }
        if (createTableStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCreateTableStatement) createTableStatement).isIfNotExists();
        }
        if (createTableStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussCreateTableStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateTableStatementHandler.java`
#### Snippet
```java
        }
        if (createTableStatement instanceof OpenGaussStatement) {
            return ((OpenGaussCreateTableStatement) createTableStatement).isIfNotExists();
        }
        return false;
```

### CastConflictsWithInstanceof
Cast to 'SQLServerCreateTableStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/ddl/CreateTableStatementHandler.java`
#### Snippet
```java
    public static List<ColumnSegment> getColumns(final CreateTableStatement createTableStatement) {
        if (createTableStatement instanceof SQLServerStatement) {
            return ((SQLServerCreateTableStatement) createTableStatement).getColumns();
        }
        return Collections.emptyList();
```

### CastConflictsWithInstanceof
Cast to 'MySQLInsertStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
     */
    public static Optional<SetAssignmentSegment> getSetAssignmentSegment(final InsertStatement insertStatement) {
        return insertStatement instanceof MySQLStatement ? ((MySQLInsertStatement) insertStatement).getSetAssignment() : Optional.empty();
    }
    
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLInsertStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<WithSegment> getWithSegment(final InsertStatement insertStatement) {
        if (insertStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLInsertStatement) insertStatement).getWithSegment();
        }
        if (insertStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCopyStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/CopyStatementHandler.java`
#### Snippet
```java
    public static Collection<ColumnSegment> getColumns(final CopyStatement copyStatement) {
        if (copyStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCopyStatement) copyStatement).getColumns();
        }
        return Collections.emptyList();
```

### CastConflictsWithInstanceof
Cast to 'SQLServerInsertStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
        }
        if (insertStatement instanceof SQLServerStatement) {
            return ((SQLServerInsertStatement) insertStatement).getWithSegment();
        }
        if (insertStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussInsertStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
        }
        if (insertStatement instanceof OpenGaussStatement) {
            return ((OpenGaussInsertStatement) insertStatement).getWithSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLCopyStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/CopyStatementHandler.java`
#### Snippet
```java
    public static Optional<PrepareStatementQuerySegment> getPrepareStatementQuerySegment(final CopyStatement copyStatement) {
        if (copyStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLCopyStatement) copyStatement).getPrepareStatementQuerySegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLInsertStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<OnDuplicateKeyColumnsSegment> getOnDuplicateKeyColumnsSegment(final InsertStatement insertStatement) {
        if (insertStatement instanceof MySQLStatement) {
            return ((MySQLInsertStatement) insertStatement).getOnDuplicateKeyColumns();
        }
        if (insertStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussInsertStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
        }
        if (insertStatement instanceof OpenGaussStatement) {
            return ((OpenGaussInsertStatement) insertStatement).getOnDuplicateKeyColumns();
        }
        if (insertStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLInsertStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
        }
        if (insertStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLInsertStatement) insertStatement).getOnDuplicateKeyColumns();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLInsertStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<ReturningSegment> getReturningSegment(final InsertStatement insertStatement) {
        if (insertStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLInsertStatement) insertStatement).getReturningSegment();
        }
        if (insertStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussInsertStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
        }
        if (insertStatement instanceof OpenGaussStatement) {
            return ((OpenGaussInsertStatement) insertStatement).getReturningSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'SQLServerInsertStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<OutputSegment> getOutputSegment(final InsertStatement insertStatement) {
        if (insertStatement instanceof SQLServerStatement) {
            return ((SQLServerInsertStatement) insertStatement).getOutputSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'OracleInsertStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<InsertMultiTableElementSegment> getInsertMultiTableElementSegment(final InsertStatement insertStatement) {
        if (insertStatement instanceof OracleStatement) {
            return ((OracleInsertStatement) insertStatement).getInsertMultiTableElementSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLSelectStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
    public static Optional<LimitSegment> getLimitSegment(final SelectStatement selectStatement) {
        if (selectStatement instanceof MySQLStatement) {
            return ((MySQLSelectStatement) selectStatement).getLimit();
        }
        if (selectStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLSelectStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLSelectStatement) selectStatement).getLimit();
        }
        if (selectStatement instanceof SQL92Statement) {
```

### CastConflictsWithInstanceof
Cast to 'OracleInsertStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/InsertStatementHandler.java`
#### Snippet
```java
    public static Optional<SubquerySegment> getSelectSubquery(final InsertStatement insertStatement) {
        if (insertStatement instanceof OracleStatement) {
            return ((OracleInsertStatement) insertStatement).getSelectSubquery();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'SQL92SelectStatement' type conflicts with preceding 'instanceof SQL92Statement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof SQL92Statement) {
            return ((SQL92SelectStatement) selectStatement).getLimit();
        }
        if (selectStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerSelectStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof SQLServerStatement) {
            return ((SQLServerSelectStatement) selectStatement).getLimit();
        }
        if (selectStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussSelectStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof OpenGaussStatement) {
            return ((OpenGaussSelectStatement) selectStatement).getLimit();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'OracleSelectStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
    public static Optional<ModelSegment> getModelSegment(final SelectStatement selectStatement) {
        if (selectStatement instanceof OracleStatement) {
            return ((OracleSelectStatement) selectStatement).getModelSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'OracleSelectStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
    public static Optional<WithSegment> getWithSegment(final SelectStatement selectStatement) {
        if (selectStatement instanceof OracleStatement) {
            return ((OracleSelectStatement) selectStatement).getWithSegment();
        }
        if (selectStatement instanceof SQLServerStatement) {
```

### CastConflictsWithInstanceof
Cast to 'SQLServerSelectStatement' type conflicts with preceding 'instanceof SQLServerStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof SQLServerStatement) {
            return ((SQLServerSelectStatement) selectStatement).getWithSegment();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLSelectStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
    public static Optional<LockSegment> getLockSegment(final SelectStatement selectStatement) {
        if (selectStatement instanceof MySQLStatement) {
            return ((MySQLSelectStatement) selectStatement).getLock();
        }
        if (selectStatement instanceof OracleStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OracleSelectStatement' type conflicts with preceding 'instanceof OracleStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof OracleStatement) {
            return ((OracleSelectStatement) selectStatement).getLock();
        }
        if (selectStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLSelectStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLSelectStatement) selectStatement).getLock();
        }
        if (selectStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussSelectStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof OpenGaussStatement) {
            return ((OpenGaussSelectStatement) selectStatement).getLock();
        }
        return Optional.empty();
```

### CastConflictsWithInstanceof
Cast to 'MySQLSelectStatement' type conflicts with preceding 'instanceof MySQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
    public static Optional<WindowSegment> getWindowSegment(final SelectStatement selectStatement) {
        if (selectStatement instanceof MySQLStatement) {
            return ((MySQLSelectStatement) selectStatement).getWindow();
        }
        if (selectStatement instanceof PostgreSQLStatement) {
```

### CastConflictsWithInstanceof
Cast to 'PostgreSQLSelectStatement' type conflicts with preceding 'instanceof PostgreSQLStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof PostgreSQLStatement) {
            return ((PostgreSQLSelectStatement) selectStatement).getWindow();
        }
        if (selectStatement instanceof OpenGaussStatement) {
```

### CastConflictsWithInstanceof
Cast to 'OpenGaussSelectStatement' type conflicts with preceding 'instanceof OpenGaussStatement' check
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/dialect/handler/dml/SelectStatementHandler.java`
#### Snippet
```java
        }
        if (selectStatement instanceof OpenGaussStatement) {
            return ((OpenGaussSelectStatement) selectStatement).getWindow();
        }
        return Optional.empty();
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value changed at `columnIndex++` is never used
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptForUseDefaultInsertColumnsTokenGenerator.java`
#### Snippet
```java
                if (encryptTable.findPlainColumn(columnName).isPresent()) {
                    addPlainColumn(result, encryptTable, columnName, columnIndex);
                    columnIndex++;
                }
            }
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `FunctionWithException` ends with 'Exception'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/admin/FunctionWithException.java`
#### Snippet
```java
 */
@FunctionalInterface
public interface FunctionWithException<T, E extends Exception> {
    
    /**
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowBinlogEventsStatementAssert.java`
#### Snippet
```java
        } else {
            assertNotNull(assertContext.getText("Actual limit clause should exist."), actual.getLimit());
            LimitClauseAssert.assertOffset(assertContext, actual.getLimit().getOffset().get(), expected.getLimitClause().getOffset());
            LimitClauseAssert.assertRowCount(assertContext, actual.getLimit().getRowCount().get(), expected.getLimitClause().getRowCount());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowBinlogEventsStatementAssert.java`
#### Snippet
```java
            assertNotNull(assertContext.getText("Actual limit clause should exist."), actual.getLimit());
            LimitClauseAssert.assertOffset(assertContext, actual.getLimit().getOffset().get(), expected.getLimitClause().getOffset());
            LimitClauseAssert.assertRowCount(assertContext, actual.getLimit().getRowCount().get(), expected.getLimitClause().getRowCount());
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowTableMetaDataStatementAssert.java`
#### Snippet
```java
        } else {
            assertNotNull(assertContext.getText("Actual statement should exist."), actual);
            DatabaseAssert.assertIs(assertContext, actual.getDatabase().get(), expected.getDatabase());
            assertThat(assertContext.getText("Table assertion error:"), actual.getTableNames(), is(expected.getTableNames()));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/RefreshTableMetaDataStatementAssert.java`
#### Snippet
```java
            assertNotNull(assertContext.getText("Actual statement should exist."), actual);
            if (null != expected.getTableName()) {
                assertThat(assertContext.getText("Table name assertion error"), actual.getTableName().get(), is(expected.getTableName()));
            }
            if (null != expected.getStorageUnitName()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/RefreshTableMetaDataStatementAssert.java`
#### Snippet
```java
            }
            if (null != expected.getStorageUnitName()) {
                assertThat(assertContext.getText("Storage unit name assertion error"), actual.getStorageUnitName().get(), is(expected.getStorageUnitName()));
            }
            if (null != expected.getSchemaName()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/RefreshTableMetaDataStatementAssert.java`
#### Snippet
```java
            }
            if (null != expected.getSchemaName()) {
                assertThat(assertContext.getText("Schema name assertion error"), actual.getSchemaName().get(), is(expected.getSchemaName()));
            }
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/transaction/TransactionBackendHandler.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkState(connectionSession.getTransactionStatus().isInTransaction() || !isPostgreSQLOrOpenGauss(),
                () -> new SQLFeatureNotSupportedException("ROLLBACK TO SAVEPOINT can only be used in transaction blocks"));
        backendTransactionManager.rollbackTo(((RollbackStatement) tclStatement).getSavepointName().get());
    }
    
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptInsertOnUpdateTokenGenerator.java`
#### Snippet
```java
        ColumnSegment columnSegment = assignmentSegment.getColumns().get(0);
        String column = columnSegment.getIdentifier().getValue();
        ColumnSegment valueColumnSegment = (ColumnSegment) functionSegment.getParameters().stream().findFirst().get();
        String valueColumn = valueColumnSegment.getIdentifier().getValue();
        EncryptFunctionAssignmentToken result = new EncryptFunctionAssignmentToken(columnSegment.getStartIndex(), assignmentSegment.getStopIndex());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptInsertOnUpdateTokenGenerator.java`
#### Snippet
```java
            boolean leftEncryptorPresent = encryptRule.findEncryptor(tableName, each.getColumns().get(0).getIdentifier().getValue()).isPresent();
            if (each.getValue() instanceof FunctionSegment && "VALUES".equalsIgnoreCase(((FunctionSegment) each.getValue()).getFunctionName())) {
                ColumnSegment rightColumn = (ColumnSegment) ((FunctionSegment) each.getValue()).getParameters().stream().findFirst().get();
                boolean rightEncryptorPresent = encryptRule.findEncryptor(tableName, rightColumn.getIdentifier().getValue()).isPresent();
                if (!leftEncryptorPresent && !rightEncryptorPresent) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/strategy/ReadwriteSplittingStrategyFactory.java`
#### Snippet
```java
        Optional<ShardingSphereRule> dynamicDataSourceStrategy = builtRules.stream().filter(each -> each instanceof DynamicDataSourceContainedRule).findFirst();
        boolean allowWriteDataSourceQuery = Strings.isNullOrEmpty(dynamicConfig.getWriteDataSourceQueryEnabled()) ? Boolean.TRUE : Boolean.parseBoolean(dynamicConfig.getWriteDataSourceQueryEnabled());
        return new DynamicReadwriteSplittingStrategy(dynamicConfig.getAutoAwareDataSourceName(), allowWriteDataSourceQuery, (DynamicDataSourceContainedRule) dynamicDataSourceStrategy.get());
    }
}
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `!connectionTransaction.isRollbackOnly()` is always `true` when reached
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/connection/ConnectionManager.java`
#### Snippet
```java
        if (connectionTransaction.isLocalTransaction() && connectionTransaction.isRollbackOnly()) {
            forceExecuteTemplate.execute(cachedConnections.values(), Connection::rollback);
        } else if (connectionTransaction.isLocalTransaction() && !connectionTransaction.isRollbackOnly()) {
            forceExecuteTemplate.execute(cachedConnections.values(), Connection::commit);
        } else {
```

### ConstantValue
Result of `connectionTransaction.isRollbackOnly()` is always 'false'
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/connection/ConnectionManager.java`
#### Snippet
```java
        if (connectionTransaction.isLocalTransaction() && connectionTransaction.isRollbackOnly()) {
            forceExecuteTemplate.execute(cachedConnections.values(), Connection::rollback);
        } else if (connectionTransaction.isLocalTransaction() && !connectionTransaction.isRollbackOnly()) {
            forceExecuteTemplate.execute(cachedConnections.values(), Connection::commit);
        } else {
```

### ConstantValue
Condition `child instanceof PrecisionContext` is always `false` when reached
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Value `child` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Condition `child instanceof StringListContext` is always `false` when reached
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Value `child` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Condition `child instanceof TypeDatetimePrecisionContext` is always `false` when reached
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Value `child` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Value `each` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
                result.getValue().add((AddColumnDefinitionSegment) visit(each));
            }
            if (each instanceof AlterConstraintContext || each instanceof AlterCheckContext) {
                result.getValue().add((AlterDefinitionSegment) visit(each));
            }
```

### ConstantValue
Value `ctx` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDCLStatementSQLVisitor.java`
#### Snippet
```java
            
        }
        if (ctx instanceof GrantLevelSchemaGlobalContext) {
            String schemaName = new IdentifierValue(((GrantLevelSchemaGlobalContext) ctx).schemaName().getText()).getValue();
            return new GrantLevelSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), schemaName, "*");
```

### ConstantValue
Value `ctx` is always 'null'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDCLStatementSQLVisitor.java`
#### Snippet
```java
        String schemaName = null;
        String tableName;
        if (null != ((GrantLevelTableContext) ctx).tableName().owner()) {
            schemaName = new IdentifierValue(((GrantLevelTableContext) ctx).tableName().owner().getText()).getValue();
        }
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `stopIndex` may be 'static'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/dml/predicate/AndPredicate.java`
#### Snippet
```java
    private final int startIndex = 0;
    
    private final int stopIndex = 0;
    
    private final Collection<ExpressionSegment> predicates = new LinkedList<>();
```

### FieldMayBeStatic
Field `startIndex` may be 'static'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/dml/predicate/AndPredicate.java`
#### Snippet
```java
public final class AndPredicate implements SQLSegment {
    
    private final int startIndex = 0;
    
    private final int stopIndex = 0;
```

### FieldMayBeStatic
Field `stopIndex` may be 'static'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/dml/predicate/OrPredicateSegment.java`
#### Snippet
```java
    private final int startIndex = 0;
    
    private final int stopIndex = 0;
    
    private final Collection<AndPredicate> andPredicates = new LinkedList<>();
```

### FieldMayBeStatic
Field `startIndex` may be 'static'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/segment/dml/predicate/OrPredicateSegment.java`
#### Snippet
```java
public final class OrPredicateSegment implements SQLSegment {
    
    private final int startIndex = 0;
    
    private final int stopIndex = 0;
```

### FieldMayBeStatic
Field `binlogVersion` may be 'static'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/binlog/management/MySQLBinlogFormatDescriptionEventPacket.java`
#### Snippet
```java
public final class MySQLBinlogFormatDescriptionEventPacket extends AbstractMySQLBinlogEventPacket {
    
    private final int binlogVersion = 4;
    
    private final byte[] mysqlServerVersion;
```

### FieldMayBeStatic
Field `eventHeaderLength` may be 'static'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/binlog/management/MySQLBinlogFormatDescriptionEventPacket.java`
#### Snippet
```java
    private final int createTimestamp;
    
    private final int eventHeaderLength = 19;
    
    public MySQLBinlogFormatDescriptionEventPacket(final MySQLBinlogEventHeader binlogEventHeader, final MySQLPacketPayload payload) {
```

### FieldMayBeStatic
Field `dataFormat` may be 'static'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/PostgreSQLColumnDescription.java`
#### Snippet
```java
    private final int typeModifier = -1;
    
    private final int dataFormat = 0;
    
    public PostgreSQLColumnDescription(final String columnName, final int columnIndex, final int columnType, final int columnLength, final String columnTypeName) {
```

### FieldMayBeStatic
Field `tableOID` may be 'static'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/PostgreSQLColumnDescription.java`
#### Snippet
```java
    private final String columnName;
    
    private final int tableOID = 0;
    
    private final int columnIndex;
```

### FieldMayBeStatic
Field `typeModifier` may be 'static'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/PostgreSQLColumnDescription.java`
#### Snippet
```java
    private final int typeOID;
    
    private final int typeModifier = -1;
    
    private final int dataFormat = 0;
```

## RuleId[ruleID=InjectedReferences]
### InjectedReferences
Unknown encoding: 'WINDOWS-866'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    WIN1256(() -> Charset.forName("WINDOWS-1256")),
    WIN1258(() -> Charset.forName("WINDOWS-1258"), "ABC", "TCVN", "TCVN5712", "VSCII"),
    WIN866(() -> Charset.forName("WINDOWS-866"), "ALT"),
    WIN874(() -> Charset.forName("WINDOWS-874")),
    KOI8R(() -> Charset.forName("KOI8-R")),
```

### InjectedReferences
Unknown encoding: 'ISO-8859-14'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    LATIN6(() -> Charset.forName("ISO-8859-10"), "ISO885910"),
    LATIN7(() -> Charset.forName("ISO-8859-13"), "ISO885913"),
    LATIN8(() -> Charset.forName("ISO-8859-14"), "ISO885914"),
    LATIN9(() -> Charset.forName("LATIN9"), "ISO885915"),
    LATIN10(() -> Charset.forName("LATIN10"), "ISO885916"),
```

### InjectedReferences
Unknown encoding: 'MULE_INTERNAL'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    EUC_JIS_2004(() -> Charset.forName("EUC_JIS_2004")),
    UTF8(() -> StandardCharsets.UTF_8, "Unicode", "UTF_8"),
    MULE_INTERNAL(() -> Charset.forName("MULE_INTERNAL")),
    LATIN1(() -> StandardCharsets.ISO_8859_1, "ISO88591"),
    LATIN2(() -> Charset.forName("LATIN2"), "ISO88592"),
```

### InjectedReferences
Unknown encoding: 'UHC'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    BIG5(() -> Charset.forName("BIG5"), "WIN950", "Windows950"),
    GBK(() -> Charset.forName("GBK"), "WIN936", "Windows936"),
    UHC(() -> Charset.forName("UHC"), "WIN949", "Windows949"),
    GB18030(() -> Charset.forName("GB18030")),
    JOHAB(() -> Charset.forName("JOHAB")),
```

### InjectedReferences
Unknown encoding: 'EUC_JIS_2004'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    EUC_KR(() -> Charset.forName("EUC_KR")),
    EUC_TW(() -> Charset.forName("EUC_TW")),
    EUC_JIS_2004(() -> Charset.forName("EUC_JIS_2004")),
    UTF8(() -> StandardCharsets.UTF_8, "Unicode", "UTF_8"),
    MULE_INTERNAL(() -> Charset.forName("MULE_INTERNAL")),
```

### InjectedReferences
Unknown encoding: 'ISO-8859-10'
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLCharacterSets.java`
#### Snippet
```java
    LATIN4(() -> Charset.forName("LATIN4"), "ISO88594"),
    LATIN5(() -> Charset.forName("LATIN5"), "ISO88599"),
    LATIN6(() -> Charset.forName("ISO-8859-10"), "ISO885910"),
    LATIN7(() -> Charset.forName("ISO-8859-13"), "ISO885913"),
    LATIN8(() -> Charset.forName("ISO-8859-14"), "ISO885914"),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
    UCS2_VIETNAMESE_CI(151, () -> Charset.forName("ucs2")),
    UCS2_GENERAL_MYSQL500_CI(159, () -> Charset.forName("ucs2")),
    UTF32_UNICODE_CI(160, () -> Charset.forName("utf32")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'hp8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    GREEK_BIN(70, () -> Charset.forName("greek")),
    HEBREW_BIN(71, () -> Charset.forName("hebrew")),
    HP8_BIN(72, () -> Charset.forName("hp8")),
    KEYBCS2_BIN(73, () -> Charset.forName("keybcs2")),
    KOI8R_BIN(74, () -> Charset.forName("koi8-r")),
```

### InjectedReferences
Unknown encoding: 'armscii8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    LATIN5_TURKISH_CI(30, () -> Charset.forName("latin5")),
    LATIN1_GERMAN2_CI(31, () -> StandardCharsets.ISO_8859_1),
    ARMSCII8_GENERAL_CI(32, () -> Charset.forName("armscii8")),
    UTF8_GENERAL_CI(33, () -> StandardCharsets.UTF_8),
    CP1250_CZECH_CS(34, () -> Charset.forName("cp1250")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_UNICODE_CI(128, () -> Charset.forName("ucs2")),
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'eucjpms'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP932_JAPANESE_CI(95, () -> Charset.forName("cp932")),
    CP932_BIN(96, () -> Charset.forName("cp932")),
    EUCJPMS_JAPANESE_CI(97, () -> Charset.forName("eucjpms")),
    EUCJPMS_BIN(98, () -> Charset.forName("eucjpms")),
    CP1250_POLISH_CI(99, () -> Charset.forName("cp1250")),
```

### InjectedReferences
Unknown encoding: 'swe7'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP850_BIN(80, () -> Charset.forName("cp850")),
    CP852_BIN(81, () -> Charset.forName("cp852")),
    SWE7_BIN(82, () -> Charset.forName("swe7")),
    UTF8_BIN(83, () -> StandardCharsets.UTF_8),
    BIG5_BIN(84, () -> Charset.forName("big5")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UTF8_GENERAL_CI(33, () -> StandardCharsets.UTF_8),
    CP1250_CZECH_CS(34, () -> Charset.forName("cp1250")),
    UCS2_GENERAL_CI(35, () -> Charset.forName("ucs2")),
    CP866_GENERAL_CI(36, () -> Charset.forName("cp866")),
    KEYBCS2_GENERAL_CI(37, () -> Charset.forName("keybcs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'armscii8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UTF32_BIN(61, () -> Charset.forName("utf32")),
    UTF16LE_BIN(62, () -> StandardCharsets.UTF_16LE),
    ARMSCII8_BIN(64, () -> Charset.forName("armscii8")),
    ASCII_BIN(65, () -> StandardCharsets.US_ASCII),
    CP1250_BIN(66, () -> Charset.forName("cp1250")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'geostd8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_BIN(90, () -> Charset.forName("ucs2")),
    UJIS_BIN(91, () -> Charset.forName("ujis")),
    GEOSTD8_GENERAL_CI(92, () -> Charset.forName("geostd8")),
    GEOSTD8_BIN(93, () -> Charset.forName("geostd8")),
    LATIN1_SPANISH_CI(94, () -> StandardCharsets.ISO_8859_1),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
    UCS2_VIETNAMESE_CI(151, () -> Charset.forName("ucs2")),
    UCS2_GENERAL_MYSQL500_CI(159, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'swe7'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    LATIN1_SWEDISH_CI(8, () -> StandardCharsets.ISO_8859_1),
    LATIN2_GENERAL_CI(9, () -> Charset.forName("latin2")),
    SWE7_SWEDISH_CI(10, () -> Charset.forName("swe7")),
    ASCII_GENERAL_CI(11, () -> StandardCharsets.US_ASCII),
    UJIS_JAPANESE_CI(12, () -> Charset.forName("ujis")),
```

### InjectedReferences
Unknown encoding: 'hp8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP850_GENERAL_CI(4, () -> Charset.forName("cp850")),
    LATIN1_GERMAN1_CI(5, () -> StandardCharsets.ISO_8859_1),
    HP8_ENGLISH_CI(6, () -> Charset.forName("hp8")),
    KOI8R_GENERAL_CI(7, () -> Charset.forName("koi8-r")),
    LATIN1_SWEDISH_CI(8, () -> StandardCharsets.ISO_8859_1),
```

### InjectedReferences
Unknown encoding: 'geostd8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UJIS_BIN(91, () -> Charset.forName("ujis")),
    GEOSTD8_GENERAL_CI(92, () -> Charset.forName("geostd8")),
    GEOSTD8_BIN(93, () -> Charset.forName("geostd8")),
    LATIN1_SPANISH_CI(94, () -> StandardCharsets.ISO_8859_1),
    CP932_JAPANESE_CI(95, () -> Charset.forName("cp932")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'keybcs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_GENERAL_CI(35, () -> Charset.forName("ucs2")),
    CP866_GENERAL_CI(36, () -> Charset.forName("cp866")),
    KEYBCS2_GENERAL_CI(37, () -> Charset.forName("keybcs2")),
    MACCE_GENERAL_CI(38, () -> Charset.forName("macce")),
    MACROMAN_GENERAL_CI(39, () -> Charset.forName("macroman")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UTF16_VIETNAMESE_CI(124, () -> StandardCharsets.UTF_16),
    UCS2_UNICODE_CI(128, () -> Charset.forName("ucs2")),
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'dec8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP1256_BIN(67, () -> Charset.forName("cp1256")),
    CP866_BIN(68, () -> Charset.forName("cp866")),
    DEC8_BIN(69, () -> Charset.forName("dec8")),
    GREEK_BIN(70, () -> Charset.forName("greek")),
    HEBREW_BIN(71, () -> Charset.forName("hebrew")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
    UCS2_VIETNAMESE_CI(151, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    SJIS_BIN(88, () -> Charset.forName("sjis")),
    TIS620_BIN(89, () -> Charset.forName("tis620")),
    UCS2_BIN(90, () -> Charset.forName("ucs2")),
    UJIS_BIN(91, () -> Charset.forName("ujis")),
    GEOSTD8_GENERAL_CI(92, () -> Charset.forName("geostd8")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'macce'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    LATIN7_GENERAL_CI(41, () -> Charset.forName("iso-8859-13")),
    LATIN7_GENERAL_CS(42, () -> Charset.forName("iso-8859-13")),
    MACCE_BIN(43, () -> Charset.forName("macce")),
    CP1250_CROATIAN_CI(44, () -> Charset.forName("cp1250")),
    UTF8MB4_GENERAL_CI(45, () -> StandardCharsets.UTF_8),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
    UCS2_VIETNAMESE_CI(151, () -> Charset.forName("ucs2")),
    UCS2_GENERAL_MYSQL500_CI(159, () -> Charset.forName("ucs2")),
    UTF32_UNICODE_CI(160, () -> Charset.forName("utf32")),
    UTF32_ICELANDIC_CI(161, () -> Charset.forName("utf32")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UTF16_UNICODE_520_CI(123, () -> StandardCharsets.UTF_16),
    UTF16_VIETNAMESE_CI(124, () -> StandardCharsets.UTF_16),
    UCS2_UNICODE_CI(128, () -> Charset.forName("ucs2")),
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'keybcs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    HEBREW_BIN(71, () -> Charset.forName("hebrew")),
    HP8_BIN(72, () -> Charset.forName("hp8")),
    KEYBCS2_BIN(73, () -> Charset.forName("keybcs2")),
    KOI8R_BIN(74, () -> Charset.forName("koi8-r")),
    KOI8U_BIN(75, () -> Charset.forName("koi8-u")),
```

### InjectedReferences
Unknown encoding: 'ujis'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    SWE7_SWEDISH_CI(10, () -> Charset.forName("swe7")),
    ASCII_GENERAL_CI(11, () -> StandardCharsets.US_ASCII),
    UJIS_JAPANESE_CI(12, () -> Charset.forName("ujis")),
    SJIS_JAPANESE_CI(13, () -> Charset.forName("sjis")),
    CP1251_BULGARIAN_CI(14, () -> Charset.forName("cp1251")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'macce'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP866_GENERAL_CI(36, () -> Charset.forName("cp866")),
    KEYBCS2_GENERAL_CI(37, () -> Charset.forName("keybcs2")),
    MACCE_GENERAL_CI(38, () -> Charset.forName("macce")),
    MACROMAN_GENERAL_CI(39, () -> Charset.forName("macroman")),
    CP852_GENERAL_CI(40, () -> Charset.forName("cp852")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'eucjpms'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    CP932_BIN(96, () -> Charset.forName("cp932")),
    EUCJPMS_JAPANESE_CI(97, () -> Charset.forName("eucjpms")),
    EUCJPMS_BIN(98, () -> Charset.forName("eucjpms")),
    CP1250_POLISH_CI(99, () -> Charset.forName("cp1250")),
    UTF16_UNICODE_CI(101, () -> StandardCharsets.UTF_16),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ucs2'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
```

### InjectedReferences
Unknown encoding: 'ujis'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    TIS620_BIN(89, () -> Charset.forName("tis620")),
    UCS2_BIN(90, () -> Charset.forName("ucs2")),
    UJIS_BIN(91, () -> Charset.forName("ujis")),
    GEOSTD8_GENERAL_CI(92, () -> Charset.forName("geostd8")),
    GEOSTD8_BIN(93, () -> Charset.forName("geostd8")),
```

### InjectedReferences
Unknown encoding: 'dec8'
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/constant/MySQLCharacterSet.java`
#### Snippet
```java
    BIG5_CHINESE_CI(1, () -> Charset.forName("big5")),
    LATIN2_CZECH_CS(2, () -> Charset.forName("latin2")),
    DEC8_SWEDISH_CI(3, () -> Charset.forName("dec8")),
    CP850_GENERAL_CI(4, () -> Charset.forName("cp850")),
    LATIN1_GERMAN1_CI(5, () -> StandardCharsets.ISO_8859_1),
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ShardingSphereDriverURLManager` has only 'static' members, and lacks a 'private' constructor
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/driver/ShardingSphereDriverURLManager.java`
#### Snippet
```java
 * ShardingSphere driver URL manager.
 */
public final class ShardingSphereDriverURLManager {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ComputeNode` has only 'static' members, and lacks a 'private' constructor
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/persist/node/ComputeNode.java`
#### Snippet
```java
 * Compute node.
 */
public final class ComputeNode {
    
    private static final String ROOT_NODE = "nodes";
```

### UtilityClassWithoutPrivateConstructor
Class `WorkerIdNode` has only 'static' members, and lacks a 'private' constructor
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/workerid/node/WorkerIdNode.java`
#### Snippet
```java
 * Worker id node.
 */
public final class WorkerIdNode {
    
    private static final String ROOT_NODE = "worker_id";
```

### UtilityClassWithoutPrivateConstructor
Class `JobIdAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/JobIdAssert.java`
#### Snippet
```java
 * Job ID assert.
 */
public final class JobIdAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowMigrationStatusStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/query/ShowMigrationStatusStatementAssert.java`
#### Snippet
```java
 * Show migration status statement assert.
 */
public final class ShowMigrationStatusStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowMigrationListStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/query/ShowMigrationListStatementAssert.java`
#### Snippet
```java
 * Show migration list statement assert.
 */
public final class ShowMigrationListStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowMigrationSourceStorageUnitsStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/query/ShowMigrationSourceStorageUnitsStatementAssert.java`
#### Snippet
```java
 * Show migration source storage units statement assert.
 */
public final class ShowMigrationSourceStorageUnitsStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowMigrationCheckStatusStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/query/ShowMigrationCheckStatusStatementAssert.java`
#### Snippet
```java
 * Show migration check status statement assert.
 */
public final class ShowMigrationCheckStatusStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StopMigrationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/StopMigrationStatementAssert.java`
#### Snippet
```java
 * Stop migration statement assert.
 */
public final class StopMigrationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `RollbackMigrationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/RollbackMigrationStatementAssert.java`
#### Snippet
```java
 * Rollback migration statement assert.
 */
public final class RollbackMigrationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowMigrationCheckAlgorithmsStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/query/ShowMigrationCheckAlgorithmsStatementAssert.java`
#### Snippet
```java
 * Show migration check algorithms statement assert.
 */
public final class ShowMigrationCheckAlgorithmsStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DropMigrationCheckStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/DropMigrationCheckStatementAssert.java`
#### Snippet
```java
 * Drop migration check statement assert.
 */
public final class DropMigrationCheckStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CommitMigrationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/CommitMigrationStatementAssert.java`
#### Snippet
```java
 * Commit migration statement assert.
 */
public final class CommitMigrationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StartMigrationCheckStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/StartMigrationCheckStatementAssert.java`
#### Snippet
```java
 * Start migration check statement assert.
 */
public final class StartMigrationCheckStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StartMigrationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/StartMigrationStatementAssert.java`
#### Snippet
```java
 * Start migration statement assert.
 */
public final class StartMigrationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ConvertYamlConfigurationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ConvertYamlConfigurationStatementAssert.java`
#### Snippet
```java
 * Convert yaml configuration statement assert.
 */
public final class ConvertYamlConfigurationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MigrateTableStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/MigrateTableStatementAssert.java`
#### Snippet
```java
 * Migrate table statement assert.
 */
public final class MigrateTableStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ExportDatabaseConfigurationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ExportDatabaseConfigurationStatementAssert.java`
#### Snippet
```java
 * Export database configuration statement assert.
 */
public final class ExportDatabaseConfigurationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StopMigrationCheckStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/StopMigrationCheckStatementAssert.java`
#### Snippet
```java
 * Stop migration check statement assert.
 */
public final class StopMigrationCheckStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowStatusFromReadwriteSplittingRulesStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowStatusFromReadwriteSplittingRulesStatementAssert.java`
#### Snippet
```java
 * Show status from readwrite-splitting rules statement assert.
 */
public final class ShowStatusFromReadwriteSplittingRulesStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowAuthorityRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowAuthorityRuleStatementAssert.java`
#### Snippet
```java
 * Show authority rule statement assert.
 */
public final class ShowAuthorityRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowSQLTranslatorRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowSQLTranslatorRuleStatementAssert.java`
#### Snippet
```java
 * Show SQL translator rule statement assert.
 */
public final class ShowSQLTranslatorRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowComputeNodeInfoStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowComputeNodeInfoStatementAssert.java`
#### Snippet
```java
 * Show compute node info statement assert.
 */
public final class ShowComputeNodeInfoStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CheckMigrationStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/migration/update/CheckMigrationStatementAssert.java`
#### Snippet
```java
 * Check migration statement assert.
 */
public final class CheckMigrationStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowDistVariableStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowDistVariableStatementAssert.java`
#### Snippet
```java
 * Show dist variable statement assert.
 */
public final class ShowDistVariableStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowDistVariablesStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowDistVariablesStatementAssert.java`
#### Snippet
```java
 * Show dist variables statement assert.
 */
public final class ShowDistVariablesStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowSQLParserRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowSQLParserRuleStatementAssert.java`
#### Snippet
```java
 * Show SQL parser rule statement assert.
 */
public final class ShowSQLParserRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowComputeNodesStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowComputeNodesStatementAssert.java`
#### Snippet
```java
 * Show compute nodes statement assert.
 */
public final class ShowComputeNodesStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowTableMetaDataStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowTableMetaDataStatementAssert.java`
#### Snippet
```java
 * Show table meta data statement assert.
 */
public final class ShowTableMetaDataStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShowComputeNodeModeStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/queryable/ShowComputeNodeModeStatementAssert.java`
#### Snippet
```java
 * Show compute node mode statement assert.
 */
public final class ShowComputeNodeModeStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AlterTransactionRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/AlterTransactionRuleStatementAssert.java`
#### Snippet
```java
 * Alter transaction rule statement assert.
 */
public final class AlterTransactionRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SetDistVariableStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/SetDistVariableStatementAssert.java`
#### Snippet
```java
 * Set dist variable statement assert.
 */
public final class SetDistVariableStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `RefreshTableMetaDataStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/RefreshTableMetaDataStatementAssert.java`
#### Snippet
```java
 * Refresh table meta data statement assert.
 */
public final class RefreshTableMetaDataStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AlterSQLParserRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/AlterSQLParserRuleStatementAssert.java`
#### Snippet
```java
 * Alter SQL parser rule statement assert.
 */
public final class AlterSQLParserRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AlterTrafficRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/AlterTrafficRuleStatementAssert.java`
#### Snippet
```java
 * Alter traffic rule statement assert.
 */
public final class AlterTrafficRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AlterRuleStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/AlterRuleStatementAssert.java`
#### Snippet
```java
 * Alter rule statement assert.
 */
public final class AlterRuleStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ParseStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rul/impl/sql/ParseStatementAssert.java`
#### Snippet
```java
 * Parse statement assert.
 */
public final class ParseStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FormatSQLStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rul/impl/sql/FormatSQLStatementAssert.java`
#### Snippet
```java
 * Format SQL statement assert.
 */
public final class FormatSQLStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PreviewStatementAssert` has only 'static' members, and lacks a 'private' constructor
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rul/impl/sql/PreviewStatementAssert.java`
#### Snippet
```java
 * Preview statement assert.
 */
public final class PreviewStatementAssert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsCollectorRegistry` has only 'static' members, and lacks a 'private' constructor
in `agent/plugins/metrics/core/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/core/collector/MetricsCollectorRegistry.java`
#### Snippet
```java
 * Metrics collector registry.
 */
public final class MetricsCollectorRegistry {
    
    private static final Map<String, MetricsCollector> COLLECTORS = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingSphereTableDataCollectorUtil` has only 'static' members, and lacks a 'private' constructor
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/data/collector/ShardingSphereTableDataCollectorUtil.java`
#### Snippet
```java
 * Table data collector util.
 */
public final class ShardingSphereTableDataCollectorUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingSphereDatabasesFactory` has only 'static' members, and lacks a 'private' constructor
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/ShardingSphereDatabasesFactory.java`
#### Snippet
```java
 * ShardingSphere databases factory.
 */
public final class ShardingSphereDatabasesFactory {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaManager` has only 'static' members, and lacks a 'private' constructor
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/SchemaManager.java`
#### Snippet
```java
 * Schema meta data manager.
 */
public final class SchemaManager {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GenericSchemaBuilder` has only 'static' members, and lacks a 'private' constructor
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/builder/GenericSchemaBuilder.java`
#### Snippet
```java
 * Generic schema builder.
 */
public final class GenericSchemaBuilder {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MySQLInformationSchemaExecutorFactory` has only 'static' members, and lacks a 'private' constructor
in `proxy/backend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/backend/mysql/handler/admin/MySQLInformationSchemaExecutorFactory.java`
#### Snippet
```java
 * Construct the information schema executor's factory.
 */
public final class MySQLInformationSchemaExecutorFactory {
    
    public static final String SCHEMATA_TABLE = "SCHEMATA";
```

### UtilityClassWithoutPrivateConstructor
Class `ServerStatusFlagCalculator` has only 'static' members, and lacks a 'private' constructor
in `proxy/frontend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/frontend/mysql/command/ServerStatusFlagCalculator.java`
#### Snippet
```java
 * MySQL server status flag calculator.
 */
public final class ServerStatusFlagCalculator {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MySQLComStmtPrepareParameterMarkerExtractor` has only 'static' members, and lacks a 'private' constructor
in `proxy/frontend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/frontend/mysql/command/query/binary/prepare/MySQLComStmtPrepareParameterMarkerExtractor.java`
#### Snippet
```java
 * Parameter marker extractor for MySQL COM_STMT_PREPARE.
 */
public final class MySQLComStmtPrepareParameterMarkerExtractor {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SQLParserOrder` has only 'static' members, and lacks a 'private' constructor
in `kernel/parser/core/src/main/java/org/apache/shardingsphere/parser/constant/SQLParserOrder.java`
#### Snippet
```java
 * SQL parser order.
 */
public final class SQLParserOrder {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingSphereProxyVersion` has only 'static' members, and lacks a 'private' constructor
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/version/ShardingSphereProxyVersion.java`
#### Snippet
```java
 */
@Slf4j
public final class ShardingSphereProxyVersion {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TrafficRuleConverter` has only 'static' members, and lacks a 'private' constructor
in `kernel/traffic/distsql/handler/src/main/java/org/apache/shardingsphere/traffic/distsql/handler/convert/TrafficRuleConverter.java`
#### Snippet
```java
 * Traffic rule converter.
 */
public final class TrafficRuleConverter {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AutoCommitUtils` has only 'static' members, and lacks a 'private' constructor
in `kernel/transaction/core/src/main/java/org/apache/shardingsphere/transaction/utils/AutoCommitUtils.java`
#### Snippet
```java
 * Auto commit utils.
 */
public final class AutoCommitUtils {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TimeServiceOrder` has only 'static' members, and lacks a 'private' constructor
in `kernel/time-service/core/src/main/java/org/apache/shardingsphere/timeservice/core/rule/constant/TimeServiceOrder.java`
#### Snippet
```java
 * Time service order.
 */
public final class TimeServiceOrder {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PrimaryKeyPositionFactory` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/ingest/position/PrimaryKeyPositionFactory.java`
#### Snippet
```java
 * Primary key position factory.
 */
public final class PrimaryKeyPositionFactory {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `JobTypeFactory` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/spi/job/JobTypeFactory.java`
#### Snippet
```java
 */
@Slf4j
public final class JobTypeFactory {
    
    private static final Map<String, JobType> CODE_JOB_TYPE_MAP = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineTypedSPILoader` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/util/spi/PipelineTypedSPILoader.java`
#### Snippet
```java
 * Pipeline typed SPI loader.
 */
public final class PipelineTypedSPILoader {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DataRecordResultConvertUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/DataRecordResultConvertUtil.java`
#### Snippet
```java
 * Data record result convert util.
 */
public final class DataRecordResultConvertUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DataRecordComparatorGenerator` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/generator/DataRecordComparatorGenerator.java`
#### Snippet
```java
 * Data record comparator generator.
 */
public final class DataRecordComparatorGenerator {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CDCResponseGenerator` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/generator/CDCResponseGenerator.java`
#### Snippet
```java
 * CDC response message generator.
 */
public final class CDCResponseGenerator {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ColumnValueConvertUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/ColumnValueConvertUtil.java`
#### Snippet
```java
 */
@Slf4j
public final class ColumnValueConvertUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AnyValueConvert` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/util/AnyValueConvert.java`
#### Snippet
```java
 */
@Slf4j
public final class AnyValueConvert {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SQLBuilderFactory` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/sqlbuilder/SQLBuilderFactory.java`
#### Snippet
```java
 * SQL builder factory.
 */
public final class SQLBuilderFactory {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineJobCenter` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/PipelineJobCenter.java`
#### Snippet
```java
 */
@Slf4j
public final class PipelineJobCenter {
    
    private static final Map<String, PipelineJob> JOB_MAP = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineJobProgressPersistService` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/progress/persist/PipelineJobProgressPersistService.java`
#### Snippet
```java
 */
@Slf4j
public final class PipelineJobProgressPersistService {
    
    private static final Map<String, Map<Integer, PipelineJobProgressPersistContext>> JOB_PROGRESS_PERSIST_MAP = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `JDBCStreamQueryUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/util/JDBCStreamQueryUtil.java`
#### Snippet
```java
 */
@Slf4j
public final class JDBCStreamQueryUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineProcessConfigurationUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/config/process/PipelineProcessConfigurationUtil.java`
#### Snippet
```java
 * Pipeline process configuration util.
 */
public final class PipelineProcessConfigurationUtil {
    
    private static final YamlPipelineProcessConfigurationSwapper SWAPPER = new YamlPipelineProcessConfigurationSwapper();
```

### UtilityClassWithoutPrivateConstructor
Class `CDCDataRecordUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
 * CDC data record util.
 */
public final class CDCDataRecordUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `JobDataNodeLineConvertUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/util/JobDataNodeLineConvertUtil.java`
#### Snippet
```java
 * Job data node line convert util.
 */
public final class JobDataNodeLineConvertUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineContext` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/context/PipelineContext.java`
#### Snippet
```java
 * Pipeline context.
 */
public final class PipelineContext {
    
    private static volatile ModeConfiguration modeConfig;
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineJobWorker` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/execute/PipelineJobWorker.java`
#### Snippet
```java
 */
@Slf4j
public final class PipelineJobWorker {
    
    private static final AtomicBoolean WORKER_INITIALIZED = new AtomicBoolean(false);
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingSphereDataJobWorker` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/execute/ShardingSphereDataJobWorker.java`
#### Snippet
```java
 * ShardingSphere data job worker.
 */
public final class ShardingSphereDataJobWorker {
    
    private static final AtomicBoolean WORKER_INITIALIZED = new AtomicBoolean(false);
```

### UtilityClassWithoutPrivateConstructor
Class `PipelineJobPreparerUtils` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/prepare/PipelineJobPreparerUtils.java`
#### Snippet
```java
 */
@Slf4j
public final class PipelineJobPreparerUtils {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GlobalTableMapEventMapping` has only 'static' members, and lacks a 'private' constructor
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/GlobalTableMapEventMapping.java`
#### Snippet
```java
 * Global table map event mapping.
 */
public final class GlobalTableMapEventMapping {
    
    // TODO Still save in memory, if proxy restart, the data will be lost.
```

### UtilityClassWithoutPrivateConstructor
Class `OptimizerParserContextFactory` has only 'static' members, and lacks a 'private' constructor
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/context/parser/OptimizerParserContextFactory.java`
#### Snippet
```java
@RequiredArgsConstructor
@Getter
public final class OptimizerParserContextFactory {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringToRexNodeUtil` has only 'static' members, and lacks a 'private' constructor
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/StringToRexNodeUtil.java`
#### Snippet
```java
 * Utility for parsing string and generate rex node.
 */
public final class StringToRexNodeUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CombineOperatorConverter` has only 'static' members, and lacks a 'private' constructor
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/type/CombineOperatorConverter.java`
#### Snippet
```java
 * Combine operator converter.
 */
public final class CombineOperatorConverter {
    
    private static final Map<CombineType, SqlOperator> REGISTRY = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `SQLTranslatorOrder` has only 'static' members, and lacks a 'private' constructor
in `kernel/sql-translator/core/src/main/java/org/apache/shardingsphere/sqltranslator/constant/SQLTranslatorOrder.java`
#### Snippet
```java
 * SQL translator order.
 */
public final class SQLTranslatorOrder {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MaskRuleStatementConverter` has only 'static' members, and lacks a 'private' constructor
in `features/mask/distsql/handler/src/main/java/org/apache/shardingsphere/mask/distsql/handler/converter/MaskRuleStatementConverter.java`
#### Snippet
```java
 * Mask rule statement converter.
 */
public final class MaskRuleStatementConverter {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShadowRuleStatementSupporter` has only 'static' members, and lacks a 'private' constructor
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/supporter/ShadowRuleStatementSupporter.java`
#### Snippet
```java
 * Shadow rule statement supporter.
 */
public final class ShadowRuleStatementSupporter {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EncryptContextBuilder` has only 'static' members, and lacks a 'private' constructor
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/context/EncryptContextBuilder.java`
#### Snippet
```java
 */
@NoArgsConstructor(access = AccessLevel.NONE)
public final class EncryptContextBuilder {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShadowRuleStatementChecker` has only 'static' members, and lacks a 'private' constructor
in `features/shadow/distsql/handler/src/main/java/org/apache/shardingsphere/shadow/distsql/handler/checker/ShadowRuleStatementChecker.java`
#### Snippet
```java
 * Shadow rule statement checker.
 */
public class ShadowRuleStatementChecker {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EncryptRuleStatementConverter` has only 'static' members, and lacks a 'private' constructor
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/converter/EncryptRuleStatementConverter.java`
#### Snippet
```java
 * Encrypt rule statement converter.
 */
public final class EncryptRuleStatementConverter {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `YamlShardingTableReferenceRuleConfigurationConverter` has only 'static' members, and lacks a 'private' constructor
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/yaml/swapper/rule/YamlShardingTableReferenceRuleConfigurationConverter.java`
#### Snippet
```java
 * YAML sharding table reference rule configuration converter.
 */
public final class YamlShardingTableReferenceRuleConfigurationConverter {
    
    private static final int GENERATE_NAME_LENGTH = 16;
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingRuleConfigurationConverter` has only 'static' members, and lacks a 'private' constructor
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/yaml/swapper/ShardingRuleConfigurationConverter.java`
#### Snippet
```java
 */
// TODO Move to pipeline module
public final class ShardingRuleConfigurationConverter {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TransactionReadQueryStrategyUtil` has only 'static' members, and lacks a 'private' constructor
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/transaction/TransactionReadQueryStrategyUtil.java`
#### Snippet
```java
 * Transaction read query strategy util.
 */
public class TransactionReadQueryStrategyUtil {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ReadwriteSplittingRuleStatementChecker` has only 'static' members, and lacks a 'private' constructor
in `features/readwrite-splitting/distsql/handler/src/main/java/org/apache/shardingsphere/readwritesplitting/distsql/handler/checker/ReadwriteSplittingRuleStatementChecker.java`
#### Snippet
```java
 * Readwrite-splitting rule statement checker.
 */
public final class ReadwriteSplittingRuleStatementChecker {
    
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ShardingTableRuleStatementChecker` has only 'static' members, and lacks a 'private' constructor
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
 * Sharding table rule checker.
 */
public final class ShardingTableRuleStatementChecker {
    
    private static final String DELIMITER = ".";
```

### UtilityClassWithoutPrivateConstructor
Class `PostgreSQLTextTimeUtils` has only 'static' members, and lacks a 'private' constructor
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLTextTimeUtils.java`
#### Snippet
```java
 * Utils for PostgreSQL time.
 */
public final class PostgreSQLTextTimeUtils {
    
    private static final DateTimeFormatter POSTGRESQL_TIME_FORMATTER = DateTimeFormatter.ofPattern(
```

### UtilityClassWithoutPrivateConstructor
Class `PostgreSQLMessageSeverityLevel` has only 'static' members, and lacks a 'private' constructor
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/constant/PostgreSQLMessageSeverityLevel.java`
#### Snippet
```java
 * @see <a href="https://www.postgresql.org/docs/12/runtime-config-logging.html#RUNTIME-CONFIG-SEVERITY-LEVELS">Table 19.2. Message Severity Levels</a>
 */
public final class PostgreSQLMessageSeverityLevel {
    
    public static final String DEBUG1 = "DEBUG1";
```

## RuleId[ruleID=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `this.containsBatchedStatements = firstStatementBindTimes == firstStatementExecuteTimes && firstState...` used as condition
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/PostgreSQLAggregatedCommandPacket.java`
#### Snippet
```java
        this.firstBindIndex = firstBindIndex;
        this.lastExecuteIndex = lastExecuteIndex;
        if (this.containsBatchedStatements = firstStatementBindTimes == firstStatementExecuteTimes && firstStatementBindTimes >= 3) {
            ensureRandomAccessible(packets);
        }
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `table.orElse(null)` might be null
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dml/impl/SelectStatementAssert.java`
#### Snippet
```java
            } else {
                Optional<SimpleTableSegment> table = ((MySQLSelectStatement) actual).getTable();
                TableAssert.assertIs(assertContext, table.orElse(null), expected.getSimpleTable());
            }
        }
```

### DataFlowIssue
Method invocation `isMatched` may produce `NullPointerException`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/check/consistency/DataConsistencyCheckResult.java`
#### Snippet
```java
            return false;
        }
        return countCheckResult.isMatched() && contentCheckResult.isMatched();
    }
}
```

### DataFlowIssue
Method invocation `isMatched` may produce `NullPointerException`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/check/consistency/DataConsistencyCheckResult.java`
#### Snippet
```java
            return false;
        }
        return countCheckResult.isMatched() && contentCheckResult.isMatched();
    }
}
```

### DataFlowIssue
Argument `table.getExpression(FederationTranslatableTable.class)` might be null
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
    private Result generateCodeForNullFilters(final EnumerableRelImplementor implementor, final PhysType physType) {
        if (fields.length == 1) {
            return implementor.result(physType, Blocks.toBlock(Expressions.call(table.getExpression(FederationTranslatableTable.class),
                    "projectScalar", implementor.getRootExpression(), Expressions.constant(fields))));
        }
```

### DataFlowIssue
Argument `table.getExpression(FederationTranslatableTable.class)` might be null
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
                    "projectScalar", implementor.getRootExpression(), Expressions.constant(fields))));
        }
        return implementor.result(physType, Blocks.toBlock(Expressions.call(table.getExpression(FederationTranslatableTable.class),
                "project", implementor.getRootExpression(), Expressions.constant(fields))));
    }
```

### DataFlowIssue
Argument `table.getExpression(FederationTranslatableTable.class)` might be null
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
    private Result generateCodeForFilters(final EnumerableRelImplementor implementor, final PhysType physType, final String[] filterValues) {
        if (fields.length == 1) {
            return implementor.result(physType, Blocks.toBlock(Expressions.call(table.getExpression(FederationTranslatableTable.class),
                    "projectAndFilterScalar", implementor.getRootExpression(), Expressions.constant(filterValues), Expressions.constant(fields))));
        }
```

### DataFlowIssue
Argument `table.getExpression(FederationTranslatableTable.class)` might be null
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
                    "projectAndFilterScalar", implementor.getRootExpression(), Expressions.constant(filterValues), Expressions.constant(fields))));
        }
        return implementor.result(physType, Blocks.toBlock(Expressions.call(table.getExpression(FederationTranslatableTable.class),
                "projectAndFilter", implementor.getRootExpression(), Expressions.constant(filterValues), Expressions.constant(fields))));
    }
```

### DataFlowIssue
Method invocation `multiplyBy` may produce `NullPointerException`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
    @Override
    public RelOptCost computeSelfCost(final RelOptPlanner planner, final RelMetadataQuery mq) {
        return super.computeSelfCost(planner, mq).multiplyBy(((double) number + 2D) / ((double) table.getRowType().getFieldCount() + 2D));
    }
    
```

### DataFlowIssue
Argument `inputStream` might be null
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/replace/TelephoneRandomReplaceAlgorithm.java`
#### Snippet
```java
            }
        };
        return CharStreams.readLines(new InputStreamReader(inputStream, Charsets.UTF_8), lineProcessor);
    }
    
```

### DataFlowIssue
Argument `inputStream` might be null
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/like/CharDigestLikeEncryptAlgorithm.java`
#### Snippet
```java
            }
        };
        return CharStreams.readLines(new InputStreamReader(inputStream, Charsets.UTF_8), lineProcessor);
    }
    
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowShardingTableRuleExecutor.java`
#### Snippet
```java
        return null == shardingTableRuleConfig.getDatabaseShardingStrategy()
                ? Optional.ofNullable(shardingRuleConfig.getDefaultDatabaseShardingStrategy())
                : Optional.ofNullable(shardingTableRuleConfig.getDatabaseShardingStrategy());
    }
    
```

### DataFlowIssue
Condition `child instanceof FieldLengthContext` is redundant and can be replaced with a null check
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### DataFlowIssue
Switch label `"function"` is unreachable
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDCLStatementSQLVisitor.java`
#### Snippet
```java
        if (null != ctx.aclType()) {
            switch (ctx.aclType().getText().toLowerCase()) {
                case "function":
                    result.setAclType(ACLTypeEnum.FUNCTION);
                    break;
```

### DataFlowIssue
Switch label `"procedure"` is unreachable
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDCLStatementSQLVisitor.java`
#### Snippet
```java
                    result.setAclType(ACLTypeEnum.FUNCTION);
                    break;
                case "procedure":
                    result.setAclType(ACLTypeEnum.PROCEDURE);
                    break;
```

### DataFlowIssue
Method invocation `tableName` may produce `NullPointerException`
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDCLStatementSQLVisitor.java`
#### Snippet
```java
        String schemaName = null;
        String tableName;
        if (null != ((GrantLevelTableContext) ctx).tableName().owner()) {
            schemaName = new IdentifierValue(((GrantLevelTableContext) ctx).tableName().owner().getText()).getValue();
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.orderByClause()) {
            result = visitOrderBy(result, ctx.orderByClause());
        }
        return result;
```

### DataFlowIssue
Casting `astNode` to `ParameterMarkerExpressionSegment` will produce `ClassCastException` for any non-null value
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
        if (null != astNode) {
            if (astNode instanceof ParameterMarkerLimitValueSegment) {
                return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
            }
            return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### DataFlowIssue
Condition `astNode0 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
        LimitValueSegment rowCount = null;
        LimitValueSegment offset = null;
        if (astNode0 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
```

### DataFlowIssue
Condition `astNode1 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
        }
        ParseTree astNode1 = ctx.getChild(1);
        if (astNode1 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
```

### DataFlowIssue
Casting `astNode` to `ParameterMarkerExpressionSegment` will produce `ClassCastException` for any non-null value
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
        if (null != astNode) {
            if (astNode instanceof ParameterMarkerLimitValueSegment) {
                return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
            }
            return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### DataFlowIssue
Condition `astNode0 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
        LimitValueSegment rowCount = null;
        LimitValueSegment offset = null;
        if (astNode0 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
```

### DataFlowIssue
Condition `astNode1 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
        }
        ParseTree astNode1 = ctx.getChild(1);
        if (astNode1 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'schemaName' is still used
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/config/pojo/YamlRootConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    private String schemaName;
    
    private Map<String, Map<String, Object>> dataSources = new HashMap<>();
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Map`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/cache/OrderedServicesCache.java`
#### Snippet
```java
     * @return cached services
     */
    public static Optional<Map<?, ?>> findCachedServices(final Class<?> spiClass, final Collection<?> types) {
        return Optional.ofNullable(cache.get()).map(optional -> optional.get(new Key(spiClass, types)));
    }
```

### OptionalContainsCollection
'Optional' contains collection `Map`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/spi/type/ordered/OrderedSPILoader.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <K, V extends OrderedSPI<?>> Map<K, V> getServices(final Class<V> spiClass, final Collection<K> types, final Comparator<Integer> orderComparator) {
        Optional<Map<K, V>> cachedServices = OrderedServicesCache.findCachedServices(spiClass, types).map(optional -> (Map<K, V>) optional);
        if (cachedServices.isPresent()) {
            return cachedServices.get();
```

### OptionalContainsCollection
'Optional' contains collection `Properties`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/metadata/DataSourcePoolMetaDataReflection.java`
#### Snippet
```java
     * @return JDBC connection properties
     */
    public Optional<Properties> getJdbcConnectionProperties() {
        return ReflectionUtil.getFieldValue(targetDataSource, dataSourcePoolFieldMetaData.getJdbcUrlPropertiesFieldName());
    }
```

### OptionalContainsCollection
'Optional' contains collection `Properties`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/creator/DataSourceReflection.java`
#### Snippet
```java
                        .map(DataSourcePoolMetaData::getFieldMetaData).orElseGet(DefaultDataSourcePoolFieldMetaData::new));
        Optional<String> jdbcUrl = dataSourcePoolMetaDataReflection.getJdbcUrl();
        Optional<Properties> jdbcConnectionProps = dataSourcePoolMetaDataReflection.getJdbcConnectionProperties();
        if (!jdbcUrl.isPresent() || !jdbcConnectionProps.isPresent()) {
            return;
```

### OptionalContainsCollection
'Optional' contains collection `SqlNodeList`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/groupby/GroupByConverter.java`
#### Snippet
```java
    
    @Override
    public Optional<SqlNodeList> convert(final GroupBySegment segment) {
        return null == segment || segment.getGroupByItems().isEmpty()
                ? Optional.empty()
```

### OptionalContainsCollection
'Optional' contains collection `SqlNodeList`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/orderby/OrderByConverter.java`
#### Snippet
```java
    
    @Override
    public Optional<SqlNodeList> convert(final OrderBySegment segment) {
        return null == segment ? Optional.empty() : Optional.of(new SqlNodeList(OrderByItemConverterUtil.convert(segment.getOrderByItems()), SqlParserPos.ZERO));
    }
```

### OptionalContainsCollection
'Optional' contains collection `SqlNodeList`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/projection/DistinctConverter.java`
#### Snippet
```java
    
    @Override
    public Optional<SqlNodeList> convert(final ProjectionsSegment segment) {
        return segment.isDistinctRow() ? Optional.of(new SqlNodeList(Collections.singletonList(SqlSelectKeyword.DISTINCT.symbol(SqlParserPos.ZERO)), SqlParserPos.ZERO)) : Optional.empty();
    }
```

### OptionalContainsCollection
'Optional' contains collection `SqlNodeList`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/converter/segment/projection/ProjectionsConverter.java`
#### Snippet
```java
    
    @Override
    public Optional<SqlNodeList> convert(final ProjectionsSegment segment) {
        Collection<SqlNode> projectionSQLNodes = new LinkedList<>();
        for (ProjectionSegment each : segment.getProjections()) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowUpdateStatementRoutingEngine.java`
#### Snippet
```java
    
    @Override
    protected Optional<Collection<String>> parseSQLComments() {
        Collection<String> result = new LinkedList<>();
        updateStatementContext.getSqlStatement().getCommentSegments().forEach(each -> result.add(each.getText()));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowDeleteStatementRoutingEngine.java`
#### Snippet
```java
    
    @Override
    protected Optional<Collection<String>> parseSQLComments() {
        Collection<String> result = new LinkedList<>();
        deleteStatementContext.getSqlStatement().getCommentSegments().forEach(each -> result.add(each.getText()));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/impl/ShadowNonDMLStatementRoutingEngine.java`
#### Snippet
```java
    
    private Map<String, String> findShadowDataSourceMappings(final ShadowRule shadowRule) {
        Optional<Collection<String>> sqlComments = parseSQLComments();
        if (!sqlComments.isPresent()) {
            return new LinkedHashMap<>();
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/impl/ShadowNonDMLStatementRoutingEngine.java`
#### Snippet
```java
    }
    
    private Optional<Collection<String>> parseSQLComments() {
        Collection<String> result = ((AbstractSQLStatement) sqlStatementContext.getSqlStatement()).getCommentSegments().stream().map(CommentSegment::getText).collect(Collectors.toList());
        return result.isEmpty() ? Optional.empty() : Optional.of(result);
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowSelectStatementRoutingEngine.java`
#### Snippet
```java
    
    @Override
    protected Optional<Collection<String>> parseSQLComments() {
        Collection<String> result = new LinkedList<>();
        selectStatementContext.getSqlStatement().getCommentSegments().forEach(each -> result.add(each.getText()));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/AbstractShadowDMLStatementRouteEngine.java`
#### Snippet
```java
     * @return SQL comments
     */
    protected abstract Optional<Collection<String>> parseSQLComments();
    
    /**
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/AbstractShadowDMLStatementRouteEngine.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private boolean isMatchDefaultShadowAlgorithm(final ShadowRule shadowRule) {
        Optional<Collection<String>> sqlComments = parseSQLComments();
        if (!sqlComments.isPresent()) {
            return false;
```

### OptionalContainsCollection
'Optional' contains collection `Collection`>
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/util/ShadowExtractor.java`
#### Snippet
```java
     * @return values
     */
    public static Optional<Collection<Comparable<?>>> extractValues(final ExpressionSegment expression, final List<Object> params) {
        Collection<Comparable<?>> result = new LinkedList<>();
        if (expression instanceof BinaryOperationExpression) {
```

### OptionalContainsCollection
'Optional' contains collection `Collection`>
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowInsertStatementRoutingEngine.java`
#### Snippet
```java
                return Optional.empty();
            }
            Optional<Collection<Comparable<?>>> columnValues = getColumnValues(insertValueContexts, index);
            index++;
            return columnValues.map(each -> new ShadowColumnCondition(getSingleTableName(), columnName, each));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowInsertStatementRoutingEngine.java`
#### Snippet
```java
    
    @Override
    protected Optional<Collection<String>> parseSQLComments() {
        Collection<String> result = new LinkedList<>();
        insertStatementContext.getSqlStatement().getCommentSegments().forEach(each -> result.add(each.getText()));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`>
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/route/engine/dml/ShadowInsertStatementRoutingEngine.java`
#### Snippet
```java
        }
        
        private Optional<Collection<Comparable<?>>> getColumnValues(final List<InsertValueContext> insertValueContexts, final int columnIndex) {
            Collection<Comparable<?>> result = new LinkedList<>();
            for (InsertValueContext each : insertValueContexts) {
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithm.java`
#### Snippet
```java
        Cipher cipher = Cipher.getInstance(sm4ModePadding, BouncyCastleProvider.PROVIDER_NAME);
        SecretKeySpec secretKeySpec = new SecretKeySpec(sm4Key, "SM4");
        Optional<byte[]> sm4Iv = Optional.ofNullable(this.sm4Iv);
        if (sm4Iv.isPresent()) {
            cipher.init(mode, secretKeySpec, new IvParameterSpec(sm4Iv.get()));
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDCLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private Optional<Collection<SimpleTableSegment>> getTableFromPrivilegeClause(final PrivilegeClauseContext ctx) {
        return null == ctx.onObjectClause() || null == ctx.onObjectClause().privilegeLevel() || null == ctx.onObjectClause().privilegeLevel().tableNames()
                ? Optional.empty()
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDCLStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitRevoke(final RevokeContext ctx) {
        OpenGaussRevokeStatement result = new OpenGaussRevokeStatement();
        Optional<Collection<SimpleTableSegment>> tableSegment = null == ctx.privilegeClause() ? Optional.empty() : getTableFromPrivilegeClause(ctx.privilegeClause());
        tableSegment.ifPresent(optional -> result.getTables().addAll(optional));
        return result;
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDCLStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitGrant(final GrantContext ctx) {
        OpenGaussGrantStatement result = new OpenGaussGrantStatement();
        Optional<Collection<SimpleTableSegment>> tableSegment = null == ctx.privilegeClause() ? Optional.empty() : getTableFromPrivilegeClause(ctx.privilegeClause());
        tableSegment.ifPresent(optional -> result.getTables().addAll(optional));
        return result;
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDCLStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitRevoke(final RevokeContext ctx) {
        PostgreSQLRevokeStatement result = new PostgreSQLRevokeStatement();
        Optional<Collection<SimpleTableSegment>> tableSegment = null == ctx.privilegeClause() ? Optional.empty() : getTableFromPrivilegeClause(ctx.privilegeClause());
        tableSegment.ifPresent(optional -> result.getTables().addAll(optional));
        return result;
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDCLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private Optional<Collection<SimpleTableSegment>> getTableFromPrivilegeClause(final PrivilegeClauseContext ctx) {
        if (null == ctx.onObjectClause() || null == ctx.onObjectClause().privilegeLevel()) {
            return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains collection `Collection`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDCLStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitGrant(final GrantContext ctx) {
        PostgreSQLGrantStatement result = new PostgreSQLGrantStatement();
        Optional<Collection<SimpleTableSegment>> tableSegment = null == ctx.privilegeClause() ? Optional.empty() : getTableFromPrivilegeClause(ctx.privilegeClause());
        tableSegment.ifPresent(optional -> result.getTables().addAll(optional));
        return result;
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/update/CreateBroadcastTableRuleStatementUpdater.java`
#### Snippet
```java
        if (sqlStatement.isIfNotExists()) {
            Collection<String> duplicatedRuleNames = getDuplicatedRuleNames(sqlStatement, currentRuleConfig);
            tables.removeIf(each -> duplicatedRuleNames.contains(each));
        }
        result.setBroadcastTables(tables);
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `init()` during object construction
in `infra/merge/src/main/java/org/apache/shardingsphere/infra/merge/result/impl/memory/MemoryMergedResult.java`
#### Snippet
```java
    
    protected MemoryMergedResult(final T rule, final ShardingSphereSchema schema, final SQLStatementContext<?> sqlStatementContext, final List<QueryResult> queryResults) throws SQLException {
        List<MemoryQueryResultRow> memoryQueryResultRows = init(rule, schema, sqlStatementContext, queryResults);
        memoryResultSetRows = memoryQueryResultRows.iterator();
        if (!memoryQueryResultRows.isEmpty()) {
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/channel/memory/ManualBitSet.java`
#### Snippet
```java
                    result.set(k, true);
                }
                k++;
            }
        }
```

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '{'
in `infra/util-groovy/src/main/java/org/apache/shardingsphere/infra/util/groovy/expr/HotspotInlineExpressionParser.java`
#### Snippet
```java
     */
    public static String handlePlaceHolder(final String inlineExpression) {
        return inlineExpression.contains("$->{") ? inlineExpression.replaceAll("\\$->\\{", "\\$\\{") : inlineExpression;
    }
    
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/enums/DirectionType.java`
#### Snippet
```java
            new HashSet<>(Arrays.asList(DirectionType.NEXT, DirectionType.COUNT, DirectionType.FORWARD, DirectionType.FORWARD_COUNT));
    
    private static final Collection<DirectionType> BACKWARD_COUNT_DIRECTION_TYPES = new HashSet<>(Arrays.asList(DirectionType.PRIOR, DirectionType.BACKWARD, DirectionType.BACKWARD_COUNT));
    
    private final String name;
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/enums/DirectionType.java`
#### Snippet
```java
    BACKWARD_ALL("BACKWARD ALL");
    
    private static final Set<DirectionType> ALL_DIRECTION_TYPES = new HashSet<>(Arrays.asList(ALL, FORWARD_ALL, BACKWARD_ALL));
    
    private static final Collection<DirectionType> FORWARD_COUNT_DIRECTION_TYPES =
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/enums/DirectionType.java`
#### Snippet
```java
    
    private static final Collection<DirectionType> FORWARD_COUNT_DIRECTION_TYPES =
            new HashSet<>(Arrays.asList(DirectionType.NEXT, DirectionType.COUNT, DirectionType.FORWARD, DirectionType.FORWARD_COUNT));
    
    private static final Collection<DirectionType> BACKWARD_COUNT_DIRECTION_TYPES = new HashSet<>(Arrays.asList(DirectionType.PRIOR, DirectionType.BACKWARD, DirectionType.BACKWARD_COUNT));
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/PostgreSQLCommandPacketType.java`
#### Snippet
```java
    TERMINATE('X');
    
    private static final Set<PostgreSQLCommandPacketType> EXTENDED_PROTOCOL_PACKET_TYPE = new HashSet<>(Arrays.asList(PostgreSQLCommandPacketType.PARSE_COMMAND,
            PostgreSQLCommandPacketType.BIND_COMMAND, PostgreSQLCommandPacketType.DESCRIBE_COMMAND, PostgreSQLCommandPacketType.EXECUTE_COMMAND, PostgreSQLCommandPacketType.SYNC_COMMAND,
            PostgreSQLCommandPacketType.CLOSE_COMMAND, PostgreSQLCommandPacketType.FLUSH_COMMAND));
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `kernel/authority/core/src/main/java/org/apache/shardingsphere/authority/provider/database/builder/DatabasePrivilegeBuilder.java`
#### Snippet
```java
     */
    private static void checkDatabases(final String mappingProp) {
        Preconditions.checkArgument(!"".equals(mappingProp), "user-database-mappings configuration `%s` can not be null", mappingProp);
        Arrays.stream(mappingProp.split(",")).forEach(each -> Preconditions.checkArgument(0 < each.indexOf("@") && 0 < each.indexOf("="),
                "user-database-mappings configuration `%s` is invalid, the configuration format should be like `username@hostname=database`", each));
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/builder/AgentTransformer.java`
#### Snippet
```java
    @SuppressWarnings("NullableProblems")
    @Override
    public Builder<?> transform(final Builder<?> builder, final TypeDescription typeDescription, final ClassLoader classLoader, final JavaModule module) {
        if (!advisorConfigs.containsKey(typeDescription.getTypeName())) {
            return builder;
```

### RedundantSuppression
Redundant suppression
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractCommandExecutorTaskAdviceTest.java`
#### Snippet
```java
    @SuppressWarnings("ConstantConditions")
    @Override
    public final void prepare() {
        try (MockedStatic<ProxyContext> proxyContext = mockStatic(ProxyContext.class, RETURNS_DEEP_STUBS)) {
            proxyContext.when(() -> ProxyContext.getInstance().getContextManager()).thenReturn(mock(ContextManager.class, RETURNS_DEEP_STUBS));
```

### RedundantSuppression
Redundant suppression
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractSQLParserEngineAdviceTest.java`
#### Snippet
```java
    @SuppressWarnings("ConstantConditions")
    @Override
    public final void prepare() {
        Object parserEngine = mock(ShardingSphereSQLParserEngine.class, invocation -> {
            switch (invocation.getMethod().getName()) {
```

### RedundantSuppression
Redundant suppression
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/command/query/binary/execute/protocol/MySQLInt1BinaryProtocolValue.java`
#### Snippet
```java
    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public Object read(final MySQLPacketPayload payload, final boolean unsigned) {
        if (unsigned) {
            return payload.getByteBuf().readUnsignedByte();
```

### RedundantSuppression
Redundant suppression
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/command/query/binary/execute/protocol/MySQLInt2BinaryProtocolValue.java`
#### Snippet
```java
    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public Object read(final MySQLPacketPayload payload, final boolean unsigned) {
        if (unsigned) {
            return payload.getByteBuf().readUnsignedShortLE();
```

### RedundantSuppression
Redundant suppression
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/command/query/binary/execute/protocol/MySQLInt4BinaryProtocolValue.java`
#### Snippet
```java
    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public Object read(final MySQLPacketPayload payload, final boolean unsigned) {
        if (unsigned) {
            return payload.getByteBuf().readUnsignedIntLE();
```

### RedundantSuppression
Redundant suppression
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/err/PostgreSQLErrPacketFactory.java`
#### Snippet
```java
     */
    @SuppressWarnings("ConstantConditions")
    public static PostgreSQLErrorResponsePacket newInstance(final Exception cause) {
        if (cause instanceof PSQLException && null != ((PSQLException) cause).getServerErrorMessage()) {
            return createErrorResponsePacket(((PSQLException) cause).getServerErrorMessage());
```

### RedundantSuppression
Redundant suppression
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/err/PostgreSQLErrPacketFactory.java`
#### Snippet
```java
    
    @SuppressWarnings("ConstantConditions")
    private static PostgreSQLErrorResponsePacket createErrorResponsePacket(final SQLException cause) {
        if (cause instanceof PSQLException && null != ((PSQLException) cause).getServerErrorMessage()) {
            return createErrorResponsePacket(((PSQLException) cause).getServerErrorMessage());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDALStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitRepairTable(final RepairTableContext ctx) {
        MySQLRepairTableStatement result = new MySQLRepairTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDALStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAnalyzeTable(final AnalyzeTableContext ctx) {
        MySQLAnalyzeTableStatement result = new MySQLAnalyzeTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDALStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitOptimizeTable(final OptimizeTableContext ctx) {
        MySQLOptimizeTableStatement result = new MySQLOptimizeTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropView(final DropViewContext ctx) {
        MySQLDropViewStatement result = new MySQLDropViewStatement();
        result.getViews().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.viewNames())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateTable(final CreateTableContext ctx) {
        MySQLCreateTableStatement result = new MySQLCreateTableStatement(null != ctx.ifNotExists());
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        MySQLAlterTableStatement result = new MySQLAlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropTable(final DropTableContext ctx) {
        MySQLDropTableStatement result = new MySQLDropTableStatement(null != ctx.ifExists());
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitRoutineBody(final RoutineBodyContext ctx) {
        RoutineBodySegment result = new RoutineBodySegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        CollectionValue<ValidStatementSegment> validStatements = null == ctx.simpleStatement()
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitBeginStatement(final BeginStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitValidStatement(final ValidStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        ValidStatementSegment validStatement = createValidStatementSegment(ctx);
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitFlowControlStatement(final FlowControlStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        if (null != ctx.caseStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCaseStatement(final CaseStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitIfStatement(final IfStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitLoopStatement(final LoopStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitRepeatStatement(final RepeatStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitWhileStatement(final WhileStatementContext ctx) {
        CollectionValue<ValidStatementSegment> result = new CollectionValue<>();
        for (ValidStatementContext each : ctx.validStatement()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDALStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAnalyzeTable(final AnalyzeTableContext ctx) {
        OpenGaussAnalyzeTableStatement result = new OpenGaussAnalyzeTableStatement();
        if (null != ctx.vacuumRelationList()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDCLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private Optional<Collection<SimpleTableSegment>> getTableFromPrivilegeClause(final PrivilegeClauseContext ctx) {
        return null == ctx.onObjectClause() || null == ctx.onObjectClause().privilegeLevel() || null == ctx.onObjectClause().privilegeLevel().tableNames()
                ? Optional.empty()
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateTable(final CreateTableContext ctx) {
        OpenGaussCreateTableStatement result = new OpenGaussCreateTableStatement(null != ctx.ifNotExists());
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        OpenGaussAlterTableStatement result = new OpenGaussAlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableNameClause().tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterDefinitionClause(final AlterDefinitionClauseContext ctx) {
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.alterTableActions()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitTableConstraint(final TableConstraintContext ctx) {
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintClause()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropTable(final DropTableContext ctx) {
        boolean containsCascade = null != ctx.dropTableOpt() && null != ctx.dropTableOpt().CASCADE();
        OpenGaussDropTableStatement result = new OpenGaussDropTableStatement(null != ctx.ifExists(), containsCascade);
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitTruncateTable(final TruncateTableContext ctx) {
        OpenGaussTruncateStatement result = new OpenGaussTruncateStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableNamesClause())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateIndex(final CreateIndexContext ctx) {
        OpenGaussCreateIndexStatement result = new OpenGaussCreateIndexStatement(null != ctx.ifNotExists());
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropIndex(final DropIndexContext ctx) {
        OpenGaussDropIndexStatement result = new OpenGaussDropIndexStatement(null != ctx.ifExists());
        result.getIndexes().addAll(createIndexSegments(((CollectionValue<SimpleTableSegment>) visit(ctx.qualifiedNameList())).getValue()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropView(final DropViewContext ctx) {
        OpenGaussDropViewStatement result = new OpenGaussDropViewStatement();
        result.getViews().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.qualifiedNameList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropSchema(final DropSchemaContext ctx) {
        OpenGaussDropSchemaStatement result = new OpenGaussDropSchemaStatement();
        result.getSchemaNames().addAll(((CollectionValue<IdentifierValue>) visit(ctx.nameList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitNameList(final NameListContext ctx) {
        CollectionValue<IdentifierValue> result = new CollectionValue<>();
        if (null != ctx.nameList()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private OpenGaussCommentStatement commentOnColumn(final CommentContext ctx) {
        OpenGaussCommentStatement result = new OpenGaussCommentStatement();
        Iterator<NameSegment> nameSegmentIterator = ((CollectionValue<NameSegment>) visit(ctx.commentClauses().anyName())).getValue().iterator();
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussDDLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private OpenGaussCommentStatement commentOnTable(final CommentContext ctx) {
        OpenGaussCommentStatement result = new OpenGaussCommentStatement();
        Iterator<NameSegment> nameSegmentIterator = ((CollectionValue<NameSegment>) visit(ctx.commentClauses().anyName())).getValue().iterator();
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private ExpressionSegment createInExpressionSegment(final InExprContext ctx) {
        if (null != ctx.selectWithParens()) {
            OpenGaussSelectStatement select = (OpenGaussSelectStatement) visit(ctx.selectWithParens());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public ASTNode visitAnyName(final AnyNameContext ctx) {
        CollectionValue<NameSegment> result = new CollectionValue<>();
        if (null != ctx.attrs()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public ASTNode visitAttrs(final AttrsContext ctx) {
        CollectionValue<NameSegment> result = new CollectionValue<>();
        result.getValue().add(new NameSegment(ctx.attrName().getStart().getStartIndex(), ctx.attrName().getStop().getStopIndex(), new IdentifierValue(ctx.attrName().getText())));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateTable(final CreateTableContext ctx) {
        OracleCreateTableStatement result = new OracleCreateTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitOutOfLineConstraint(final OutOfLineConstraintContext ctx) {
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintName()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        OracleAlterTableStatement result = new OracleAlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterDefinitionClause(final AlterDefinitionClauseContext ctx) {
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.columnClauses()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDALStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAnalyzeTable(final AnalyzeTableContext ctx) {
        PostgreSQLAnalyzeTableStatement result = new PostgreSQLAnalyzeTableStatement();
        if (null != ctx.vacuumRelationList()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDCLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private Optional<Collection<SimpleTableSegment>> getTableFromPrivilegeClause(final PrivilegeClauseContext ctx) {
        if (null == ctx.onObjectClause() || null == ctx.onObjectClause().privilegeLevel()) {
            return Optional.empty();
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateTable(final CreateTableContext ctx) {
        PostgreSQLCreateTableStatement result = new PostgreSQLCreateTableStatement(null != ctx.ifNotExists());
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        PostgreSQLAlterTableStatement result = new PostgreSQLAlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableNameClause().tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterDefinitionClause(final AlterDefinitionClauseContext ctx) {
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.alterTableActions()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitTableConstraint(final TableConstraintContext ctx) {
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintClause()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropTable(final DropTableContext ctx) {
        boolean containsCascade = null != ctx.dropTableOpt() && null != ctx.dropTableOpt().CASCADE();
        PostgreSQLDropTableStatement result = new PostgreSQLDropTableStatement(null != ctx.ifExists(), containsCascade);
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitTruncateTable(final TruncateTableContext ctx) {
        PostgreSQLTruncateStatement result = new PostgreSQLTruncateStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableNamesClause())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateIndex(final CreateIndexContext ctx) {
        PostgreSQLCreateIndexStatement result = new PostgreSQLCreateIndexStatement(null != ctx.ifNotExists());
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropIndex(final DropIndexContext ctx) {
        PostgreSQLDropIndexStatement result = new PostgreSQLDropIndexStatement(null != ctx.ifExists());
        result.getIndexes().addAll(createIndexSegments(((CollectionValue<SimpleTableSegment>) visit(ctx.qualifiedNameList())).getValue()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropView(final DropViewContext ctx) {
        PostgreSQLDropViewStatement result = new PostgreSQLDropViewStatement();
        result.getViews().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.qualifiedNameList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropSchema(final DropSchemaContext ctx) {
        PostgreSQLDropSchemaStatement result = new PostgreSQLDropSchemaStatement();
        result.getSchemaNames().addAll(((CollectionValue<IdentifierValue>) visit(ctx.nameList())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitNameList(final NameListContext ctx) {
        CollectionValue<IdentifierValue> result = new CollectionValue<>();
        if (null != ctx.nameList()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private PostgreSQLCommentStatement commentOnColumn(final CommentContext ctx) {
        PostgreSQLCommentStatement result = new PostgreSQLCommentStatement();
        Iterator<NameSegment> nameSegmentIterator = ((CollectionValue<NameSegment>) visit(ctx.commentClauses().anyName())).getValue().iterator();
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLDDLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private PostgreSQLCommentStatement commentOnTable(final CommentContext ctx) {
        PostgreSQLCommentStatement result = new PostgreSQLCommentStatement();
        Iterator<NameSegment> nameSegmentIterator = ((CollectionValue<NameSegment>) visit(ctx.commentClauses().anyName())).getValue().iterator();
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private ExpressionSegment createInExpressionSegment(final InExprContext ctx) {
        if (null != ctx.selectWithParens()) {
            PostgreSQLSelectStatement select = (PostgreSQLSelectStatement) visit(ctx.selectWithParens());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public ASTNode visitAnyName(final AnyNameContext ctx) {
        CollectionValue<NameSegment> result = new CollectionValue<>();
        if (null != ctx.attrs()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public ASTNode visitAttrs(final AttrsContext ctx) {
        CollectionValue<NameSegment> result = new CollectionValue<>();
        result.getValue().add(new NameSegment(ctx.attrName().getStart().getStartIndex(), ctx.attrName().getStop().getStopIndex(), new IdentifierValue(ctx.attrName().getText())));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitCreateTable(final CreateTableContext ctx) {
        SQL92CreateTableStatement result = new SQL92CreateTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitConstraintDefinition(final ConstraintDefinitionContext ctx) {
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintName()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        SQL92AlterTableStatement result = new SQL92AlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterDefinitionClause(final AlterDefinitionClauseContext ctx) {
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.addColumnSpecification()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropTable(final DropTableContext ctx) {
        SQL92DropTableStatement result = new SQL92DropTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableNames())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92DMLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitInsertValuesClause(final InsertValuesClauseContext ctx) {
        SQL92InsertStatement result = new SQL92InsertStatement();
        if (null != ctx.columnNames()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitTableConstraint(final TableConstraintContext ctx) {
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintName()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterTable(final AlterTableContext ctx) {
        SQLServerAlterTableStatement result = new SQLServerAlterTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitAlterDefinitionClause(final AlterDefinitionClauseContext ctx) {
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.addColumnSpecification()) {
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerDDLStatementSQLVisitor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Override
    public ASTNode visitDropTable(final DropTableContext ctx) {
        SQLServerDropTableStatement result = new SQLServerDropTableStatement(null != ctx.ifExists());
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableNames())).getValue());
```

### RedundantSuppression
Redundant suppression
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
    
    @SuppressWarnings("unchecked")
    private InsertColumnsSegment createInsertColumns(final ColumnNamesContext columnNames, final int startIndex) {
        if (null == columnNames) {
            return new InsertColumnsSegment(startIndex - 1, startIndex - 1, Collections.emptyList());
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `OptimizerParserContextFactory` has only 'static' members, and a 'public' constructor
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/context/parser/OptimizerParserContextFactory.java`
#### Snippet
```java
@RequiredArgsConstructor
@Getter
public final class OptimizerParserContextFactory {
    
    /**
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nextResult'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/AbstractStreamingDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
        private final DataConsistencyCalculateParameter param;
        
        private volatile Optional<DataConsistencyCalculatedResult> nextResult;
        
        @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'keyGenerateAlgorithmName'
in `features/sharding/distsql/statement/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/segment/strategy/KeyGenerateStrategySegment.java`
#### Snippet
```java
    private final String keyGenerateColumn;
    
    private Optional<String> keyGenerateAlgorithmName;
    
    private AlgorithmSegment keyGenerateAlgorithmSegment;
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/AbstractDataSourceAdapter.java`
#### Snippet
```java
public abstract class AbstractDataSourceAdapter extends WrapperAdapter implements DataSource {
    
    private PrintWriter logWriter = new PrintWriter(System.out);
    
    @Override
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/row/EmptyRowEnumerator.java`
#### Snippet
```java
    public T current() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        System.out.println(type.getActualTypeArguments()[0].getTypeName());
        if ("Object".equals(type.getActualTypeArguments()[0].getTypeName())) {
            return (T) new Object();
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'child instanceof FieldLengthContext' covered by subsequent condition 'child instanceof PrecisionContext'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConditionCoveredByFurtherCondition
Condition 'each instanceof AlterConstraintContext' covered by subsequent condition 'each instanceof AlterCheckContext'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLDDLStatementSQLVisitor.java`
#### Snippet
```java
                result.getValue().add((AddColumnDefinitionSegment) visit(each));
            }
            if (each instanceof AlterConstraintContext || each instanceof AlterCheckContext) {
                result.getValue().add((AlterDefinitionSegment) visit(each));
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/process/subscriber/ProcessRegistrySubscriber.java`
#### Snippet
```java
    @Subscribe
    public void loadShowProcessListData(final ShowProcessListRequestEvent event) {
        String processListId = new UUID(ThreadLocalRandom.current().nextLong(), ThreadLocalRandom.current().nextLong()).toString().replace("-", "");
        boolean triggerIsComplete = false;
        Collection<String> triggerPaths = getTriggerPaths(processListId);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/path/AgentPath.java`
#### Snippet
```java
     */
    public static File getRootPath() {
        String classResourcePath = String.join("", AgentPath.class.getName().replaceAll("\\.", "/"), ".class");
        URL resource = Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource(classResourcePath), "Can not locate agent jar file.");
        return getJarFile(resource.toString()).getParentFile();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/classloader/AgentExtraClassLoader.java`
#### Snippet
```java
    
    private String convertClassNameToPath(final String className) {
        return String.join("", className.replace(".", "/"), ".class");
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/plugins/tracing/type/opentelemetry/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/opentelemetry/OpenTelemetryTracingPluginLifecycleService.java`
#### Snippet
```java
    
    private void setSystemProperty(final String key, final String value) {
        String propertyKey = key.replaceAll("-", ".");
        System.setProperty(propertyKey, String.valueOf(value));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/url/StandardJdbcUrlParser.java`
#### Snippet
```java
        if (matcher.matches()) {
            String authority = matcher.group(AUTHORITY_GROUP_KEY);
            ShardingSpherePreconditions.checkNotNull(authority, () -> new UnrecognizedDatabaseURLException(jdbcUrl, CONNECTION_URL_PATTERN.pattern().replaceAll("%", "%%")));
            return new JdbcUrl(parseHostname(authority), parsePort(authority), matcher.group(PATH_GROUP_KEY), parseQueryProperties(matcher.group(QUERY_GROUP_KEY)));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/url/StandardJdbcUrlParser.java`
#### Snippet
```java
            return new JdbcUrl(parseHostname(authority), parsePort(authority), matcher.group(PATH_GROUP_KEY), parseQueryProperties(matcher.group(QUERY_GROUP_KEY)));
        }
        throw new UnrecognizedDatabaseURLException(jdbcUrl, CONNECTION_URL_PATTERN.pattern().replaceAll("%", "%%"));
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/kernel/model/ExecutionGroupReportContext.java`
#### Snippet
```java
    
    public ExecutionGroupReportContext(final String databaseName, final Grantee grantee) {
        this(databaseName, grantee, new UUID(ThreadLocalRandom.current().nextLong(), ThreadLocalRandom.current().nextLong()).toString().replace("-", ""));
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `infra/util-groovy/src/main/java/org/apache/shardingsphere/infra/util/groovy/expr/HotspotInlineExpressionParser.java`
#### Snippet
```java
     */
    public static String handlePlaceHolder(final String inlineExpression) {
        return inlineExpression.contains("$->{") ? inlineExpression.replaceAll("\\$->\\{", "\\$\\{") : inlineExpression;
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `proxy/backend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/backend/postgresql/handler/admin/PostgreSQLShowVariableExecutor.java`
#### Snippet
```java
        VARIABLE_ROW_DATA_GENERATORS.put("timezone", connectionSession -> new String[]{"TimeZone", "Etc/UTC", "Sets the time zone for displaying and interpreting time stamps."});
        VARIABLE_ROW_DATA_GENERATORS.put("transaction_isolation", connectionSession -> {
            String result = null == connectionSession.getIsolationLevel() ? "read committed" : connectionSession.getIsolationLevel().getIsolationLevel().replace("-", " ").toLowerCase(Locale.ROOT);
            return new String[]{"transaction_isolation", result, "Sets the current transaction's isolation level"};
        });
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/command/query/PostgreSQLCommand.java`
#### Snippet
```java
    PostgreSQLCommand(final Class<? extends SQLStatement>... sqlStatementClasses) {
        this.sqlStatementClasses = Arrays.asList(sqlStatementClasses);
        tag = name().replaceAll("_", " ");
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/PasswordEncryption.java`
#### Snippet
```java
    
    private static byte[] formatKey(final String key) {
        return key.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").trim().replace("\n", "").getBytes();
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/PasswordEncryption.java`
#### Snippet
```java
    
    private static byte[] formatKey(final String key) {
        return key.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").trim().replace("\n", "").getBytes();
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/PasswordEncryption.java`
#### Snippet
```java
    
    private static byte[] formatKey(final String key) {
        return key.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").trim().replace("\n", "").getBytes();
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
                    data.get();
                }
                return readStringSegment(data, startPosition, offset).replace("''", "'");
            }
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
                if (!data.hasRemaining()) {
                    offset--;
                    return readStringSegment(data, startPosition, offset).replace("''", "'");
                }
                char c2 = (char) data.get();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
                if (' ' == c2) {
                    offset--;
                    return readStringSegment(data, startPosition, offset).replace("''", "'");
                }
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
    
    private QueryContext createQueryContext(final ShardingSphereMetaData metaData, final SqlString sqlString, final DatabaseType databaseType) {
        String sql = sqlString.getSql().replace("\n", " ");
        SQLStatement sqlStatement = new SQLStatementParserEngine(databaseType.getType(),
                optimizerContext.getSqlParserRule().getSqlStatementCache(), optimizerContext.getSqlParserRule().getParseTreeCache(),
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/TranslatableTableScanExecutor.java`
#### Snippet
```java
    
    private QueryContext createQueryContext(final ShardingSphereMetaData metaData, final SqlString sqlString, final DatabaseType databaseType) {
        String sql = sqlString.getSql().replace("\n", " ");
        SQLStatement sqlStatement = new SQLStatementParserEngine(databaseType.getType(),
                optimizerContext.getSqlParserRule().getSqlStatementCache(), optimizerContext.getSqlParserRule().getParseTreeCache(),
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableTableScan.java`
#### Snippet
```java
                RexInputRef reference = (RexInputRef) each;
                String referenceName = reference.getName();
                Integer columnId = Integer.valueOf(referenceName.replace("$", ""));
                Integer columnType = translatableTable.getColumnType(columnId);
                columnMap.put(columnId, columnType);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithm.java`
#### Snippet
```java
    private String createSm4Padding(final Properties props) {
        ShardingSpherePreconditions.checkState(props.containsKey(SM4_PADDING), () -> new EncryptAlgorithmInitializationException("SM4", String.format("%s can not be null", SM4_PADDING)));
        String result = String.valueOf(props.getProperty(SM4_PADDING)).toUpperCase().replace("PADDING", "Padding");
        ShardingSpherePreconditions.checkState(PADDINGS.contains(result), () -> new EncryptAlgorithmInitializationException("SM4", "Padding must be either PKCS5Padding or PKCS7Padding"));
        return result;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/yaml/swapper/rule/YamlShardingTableReferenceRuleConfigurationConverter.java`
#### Snippet
```java
    private static ShardingTableReferenceRuleConfiguration convertYamlConfigurationWithoutName(final String referenceConfig) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        String name = new UUID(threadLocalRandom.nextLong(), threadLocalRandom.nextLong()).toString().replace("-", "").substring(0, GENERATE_NAME_LENGTH);
        return new ShardingTableReferenceRuleConfiguration(name, referenceConfig);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/keygen/UUIDKeyGenerateAlgorithm.java`
#### Snippet
```java
    public String generateKey() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return new UUID(threadLocalRandom.nextLong(), threadLocalRandom.nextLong()).toString().replace("-", "");
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/inline/InlineShardingAlgorithm.java`
#### Snippet
```java
    @Override
    public Optional<String> getAlgorithmStructure(final String dataNodePrefix, final String shardingColumn) {
        return Optional.of(algorithmExpression.replaceFirst(dataNodePrefix, "").replaceFirst(shardingColumn, "").replaceAll(" ", ""));
    }
    
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `features/db-discovery/distsql/handler/src/main/java/org/apache/shardingsphere/dbdiscovery/distsql/handler/converter/DatabaseDiscoveryRuleStatementConverter.java`
#### Snippet
```java
    
    private static String getName(final String ruleName, final String type) {
        return String.format("%s_%s", ruleName, type.replace(".", "_").toLowerCase());
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
            }
            while (each.contains("\\\"")) {
                each = each.replace("\\\"", "\"");
            }
            while (each.contains("\\\\")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
            }
            while (each.contains("\\\\")) {
                each = each.replace("\\\\", "\\");
            }
            return each;
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative value
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/ingest/position/PlaceholderPosition.java`
#### Snippet
```java
    
    @Override
    public int compareTo(final PlaceholderPosition position) {
        return 1;
    }
```

### ComparatorMethodParameterNotUsed
'compareTo()' parameter `position` is not used
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/ingest/position/PlaceholderPosition.java`
#### Snippet
```java
    
    @Override
    public int compareTo(final PlaceholderPosition position) {
        return 1;
    }
```

### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/ingest/position/PlaceholderPosition.java`
#### Snippet
```java
    @Override
    public int compareTo(final PlaceholderPosition position) {
        return 1;
    }
    
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ClusterSQLException()` of an abstract class should not be declared 'public'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/workerid/exception/ClusterSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 7;
    
    public ClusterSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InternalUnsupportedSQLParserIT()` of an abstract class should not be declared 'public'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/InternalUnsupportedSQLParserIT.java`
#### Snippet
```java
    private final SQLCaseType sqlCaseType;
    
    public InternalUnsupportedSQLParserIT(final InternalSQLParserTestParameter testParam) {
        sqlCaseId = testParam.getSqlCaseId();
        databaseType = testParam.getDatabaseType();
```

### NonProtectedConstructorInAbstractClass
Constructor `InternalSQLParserIT()` of an abstract class should not be declared 'public'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/InternalSQLParserIT.java`
#### Snippet
```java
    private final String visitorType;
    
    public InternalSQLParserIT(final InternalSQLParserTestParameter testParam) {
        sqlCaseId = testParam.getSqlCaseId();
        databaseType = testParam.getDatabaseType();
```

### NonProtectedConstructorInAbstractClass
Constructor `AgentExtraClassLoader()` of an abstract class should not be declared 'public'
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/classloader/AgentExtraClassLoader.java`
#### Snippet
```java
    }
    
    public AgentExtraClassLoader(final ClassLoader appClassLoader, final Collection<JarFile> extraJars, final Collection<File> extraResourcePaths) {
        super(appClassLoader);
        this.extraJars = extraJars;
```

### NonProtectedConstructorInAbstractClass
Constructor `AgentExtraClassLoader()` of an abstract class should not be declared 'public'
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/classloader/AgentExtraClassLoader.java`
#### Snippet
```java
    private final Collection<File> extraResourcePaths;
    
    public AgentExtraClassLoader(final ClassLoader appClassLoader, final Collection<JarFile> extraJars) {
        this(appClassLoader, extraJars, Collections.emptyList());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereExternalException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/ShardingSphereExternalException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1629786588176694067L;
    
    public ShardingSphereExternalException(final String reason) {
        super(reason);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereExternalException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/ShardingSphereExternalException.java`
#### Snippet
```java
    }
    
    public ShardingSphereExternalException(final String reason, final Exception cause) {
        super(reason, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/ShardingSphereSQLException.java`
#### Snippet
```java
    }
    
    public ShardingSphereSQLException(final String sqlState, final int typeOffset, final int errorCode, final String reason, final Object... messageArgs) {
        this(sqlState, typeOffset, errorCode, null == reason ? null : String.format(reason, messageArgs), (Exception) null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/ShardingSphereSQLException.java`
#### Snippet
```java
    }
    
    public ShardingSphereSQLException(final String sqlState, final int typeOffset, final int errorCode, final String reason, final Exception cause) {
        super(reason, cause);
        this.sqlState = sqlState;
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/ShardingSphereSQLException.java`
#### Snippet
```java
    private final Exception cause;
    
    public ShardingSphereSQLException(final SQLState sqlState, final int typeOffset, final int errorCode, final String reason, final Object... messageArgs) {
        this(sqlState.getValue(), typeOffset, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KernelSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/type/kernel/KernelSQLException.java`
#### Snippet
```java
    }
    
    public KernelSQLException(final SQLState sqlState, final int kernelCode, final int errorCode, final String reason, final Exception cause) {
        super(sqlState.getValue(), TYPE_OFFSET, kernelCode * 1000 + errorCode, reason, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KernelSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/type/kernel/KernelSQLException.java`
#### Snippet
```java
    private static final int TYPE_OFFSET = 1;
    
    public KernelSQLException(final SQLState sqlState, final int kernelCode, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, TYPE_OFFSET, kernelCode * 1000 + errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FeatureSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/type/feature/FeatureSQLException.java`
#### Snippet
```java
    private static final int TYPE_OFFSET = 2;
    
    public FeatureSQLException(final SQLState sqlState, final int featureCode, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, TYPE_OFFSET, featureCode * 100 + errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereServerException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/server/ShardingSphereServerException.java`
#### Snippet
```java
    }
    
    public ShardingSphereServerException(final String errorCategory, final int errorCode, final String message, final Exception cause) {
        super(String.format("%s-%05d: %s", errorCategory, errorCode, message), cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereServerException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/server/ShardingSphereServerException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1547233217081261239L;
    
    public ShardingSphereServerException(final String errorCategory, final int errorCode, final String message) {
        super(String.format("%s-%05d: %s", errorCategory, errorCode, message));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/type/generic/GenericSQLException.java`
#### Snippet
```java
    }
    
    public GenericSQLException(final String reason, final Exception cause, final SQLState sqlState, final int errorCode) {
        super(sqlState.getValue(), TYPE_OFFSET, errorCode, reason, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericSQLException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/external/sql/type/generic/GenericSQLException.java`
#### Snippet
```java
    private static final int TYPE_OFFSET = 3;
    
    public GenericSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, TYPE_OFFSET, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereInternalException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/internal/ShardingSphereInternalException.java`
#### Snippet
```java
    }
    
    public ShardingSphereInternalException(final Exception cause) {
        super(cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereInternalException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/internal/ShardingSphereInternalException.java`
#### Snippet
```java
    private static final long serialVersionUID = -8238061892944243621L;
    
    public ShardingSphereInternalException(final String errorMessage, final Object... args) {
        super(String.format(errorMessage, args));
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSphereInternalException()` of an abstract class should not be declared 'public'
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/exception/internal/ShardingSphereInternalException.java`
#### Snippet
```java
    }
    
    public ShardingSphereInternalException(final String message, final Exception cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ConnectionSQLException()` of an abstract class should not be declared 'public'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/exception/ConnectionSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 3;
    
    public ConnectionSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MetaDataSQLException()` of an abstract class should not be declared 'public'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/exception/MetaDataSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 0;
    
    public MetaDataSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SyntaxSQLException()` of an abstract class should not be declared 'public'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/exception/SyntaxSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 2;
    
    public SyntaxSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DataSQLException()` of an abstract class should not be declared 'public'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/exception/DataSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 1;
    
    public DataSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PropertySynonyms()` of an abstract class should not be declared 'public'
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/props/synonym/PropertySynonyms.java`
#### Snippet
```java
    private final Map<String, Object> localProperties;
    
    public PropertySynonyms(final Map<String, Object> props, final Collection<String> standardPropertyKeys, final Map<String, String> propertySynonyms) {
        this.standardPropertyKeys = standardPropertyKeys;
        standardProperties = buildStandardProperties(props, standardPropertyKeys, propertySynonyms);
```

### NonProtectedConstructorInAbstractClass
Constructor `StorageUnitDefinitionBackendHandler()` of an abstract class should not be declared 'public'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/storage/unit/StorageUnitDefinitionBackendHandler.java`
#### Snippet
```java
public abstract class StorageUnitDefinitionBackendHandler<T extends StorageUnitDefinitionStatement> extends RDLBackendHandler<T> {
    
    public StorageUnitDefinitionBackendHandler(final T sqlStatement, final ConnectionSession connectionSession) {
        super(sqlStatement, connectionSession);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProxyJDBCExecutorCallback()` of an abstract class should not be declared 'public'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/jdbc/executor/callback/ProxyJDBCExecutorCallback.java`
#### Snippet
```java
    private boolean hasMetaData;
    
    public ProxyJDBCExecutorCallback(final DatabaseType protocolType, final Map<String, DatabaseType> storageTypes, final SQLStatement sqlStatement,
                                     final DatabaseConnector databaseConnector,
                                     final boolean isReturnGeneratedKeys, final boolean isExceptionThrown, final boolean fetchMetaData) {
```

### NonProtectedConstructorInAbstractClass
Constructor `TrafficException()` of an abstract class should not be declared 'public'
in `kernel/traffic/core/src/main/java/org/apache/shardingsphere/traffic/exception/TrafficException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 5;
    
    public TrafficException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TransactionSQLException()` of an abstract class should not be declared 'public'
in `kernel/transaction/core/src/main/java/org/apache/shardingsphere/transaction/exception/TransactionSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 4;
    
    public TransactionSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobType()` of an abstract class should not be declared 'public'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/job/type/AbstractJobType.java`
#### Snippet
```java
    private final String typeCode;
    
    public AbstractJobType(final String typeName, final String typeCode) {
        this.typeName = typeName;
        Preconditions.checkArgument(2 == typeCode.length(), "code length is not 2");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPipelineJobId()` of an abstract class should not be declared 'public'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/AbstractPipelineJobId.java`
#### Snippet
```java
    private final String formatVersion;
    
    public AbstractPipelineJobId(final JobType jobType, final String formatVersion) {
        this.jobType = jobType;
        Preconditions.checkArgument(2 == formatVersion.length(), "formatVersion length is not 2");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractInventoryIncrementalProcessContext()` of an abstract class should not be declared 'public'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/context/AbstractInventoryIncrementalProcessContext.java`
#### Snippet
```java
    private final LazyInitializer<ExecuteEngine> incrementalExecuteEngineLazyInitializer;
    
    public AbstractInventoryIncrementalProcessContext(final String jobId, final PipelineProcessConfiguration originalProcessConfig) {
        PipelineProcessConfiguration processConfig = PipelineProcessConfigurationUtil.convertWithDefaultValue(originalProcessConfig);
        this.pipelineProcessConfig = processConfig;
```

### NonProtectedConstructorInAbstractClass
Constructor `PipelineSQLException()` of an abstract class should not be declared 'public'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/exception/PipelineSQLException.java`
#### Snippet
```java
    }
    
    public PipelineSQLException(final SQLState sqlState, final int errorCode, final String reason, final Exception cause) {
        super(sqlState, KERNEL_CODE, errorCode, reason, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PipelineSQLException()` of an abstract class should not be declared 'public'
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/exception/PipelineSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 8;
    
    public PipelineSQLException(final SQLState sqlState, final int errorCode, final String reason) {
        super(sqlState, KERNEL_CODE, errorCode, reason);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SQLTranslationException()` of an abstract class should not be declared 'public'
in `kernel/sql-translator/api/src/main/java/org/apache/shardingsphere/sqltranslator/exception/SQLTranslationException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 4;
    
    public SQLTranslationException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DistSQLException()` of an abstract class should not be declared 'public'
in `distsql/handler/src/main/java/org/apache/shardingsphere/distsql/handler/exception/DistSQLException.java`
#### Snippet
```java
    private static final int KERNEL_CODE = 9;
    
    public DistSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, KERNEL_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `RuleDefinitionViolationException()` of an abstract class should not be declared 'public'
in `distsql/handler/src/main/java/org/apache/shardingsphere/distsql/handler/exception/rule/RuleDefinitionViolationException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1090914641996552474L;
    
    public RuleDefinitionViolationException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AlgorithmDefinitionViolationException()` of an abstract class should not be declared 'public'
in `distsql/handler/src/main/java/org/apache/shardingsphere/distsql/handler/exception/algorithm/AlgorithmDefinitionViolationException.java`
#### Snippet
```java
    private static final long serialVersionUID = -727466071244178933L;
    
    public AlgorithmDefinitionViolationException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `StorageUnitDefinitionViolationException()` of an abstract class should not be declared 'public'
in `distsql/handler/src/main/java/org/apache/shardingsphere/distsql/handler/exception/storageunit/StorageUnitDefinitionViolationException.java`
#### Snippet
```java
    private static final long serialVersionUID = -2686784350802985974L;
    
    public StorageUnitDefinitionViolationException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DropRuleStatement()` of an abstract class should not be declared 'public'
in `distsql/statement/src/main/java/org/apache/shardingsphere/distsql/parser/statement/rdl/drop/DropRuleStatement.java`
#### Snippet
```java
    private final boolean ifExists;
    
    public DropRuleStatement() {
        this(false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CreateRuleStatement()` of an abstract class should not be declared 'public'
in `distsql/statement/src/main/java/org/apache/shardingsphere/distsql/parser/statement/rdl/create/CreateRuleStatement.java`
#### Snippet
```java
    private final boolean ifNotExists;
    
    public CreateRuleStatement() {
        this(false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MaskSQLException()` of an abstract class should not be declared 'public'
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/exception/MaskSQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 9;
    
    public MaskSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShadowSQLException()` of an abstract class should not be declared 'public'
in `features/shadow/core/src/main/java/org/apache/shardingsphere/shadow/exception/ShadowSQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 8;
    
    public ShadowSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EncryptSQLException()` of an abstract class should not be declared 'public'
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/exception/EncryptSQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 7;
    
    public EncryptSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardingSQLException()` of an abstract class should not be declared 'public'
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/exception/ShardingSQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 0;
    
    public ShardingSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DBDiscoveryProviderException()` of an abstract class should not be declared 'public'
in `features/db-discovery/api/src/main/java/org/apache/shardingsphere/dbdiscovery/exception/DBDiscoveryProviderException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 3;
    
    public DBDiscoveryProviderException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DBDiscoverySQLException()` of an abstract class should not be declared 'public'
in `features/db-discovery/core/src/main/java/org/apache/shardingsphere/dbdiscovery/exception/DBDiscoverySQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 3;
    
    public DBDiscoverySQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ReadwriteSplittingSQLException()` of an abstract class should not be declared 'public'
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/exception/ReadwriteSplittingSQLException.java`
#### Snippet
```java
    private static final int FEATURE_CODE = 2;
    
    public ReadwriteSplittingSQLException(final SQLState sqlState, final int errorCode, final String reason, final Object... messageArgs) {
        super(sqlState, FEATURE_CODE, errorCode, reason, messageArgs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MySQLFormatSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/impl/MySQLFormatSQLVisitor.java`
#### Snippet
```java
    private int projectionsCountOfLine = 3;
    
    public MySQLFormatSQLVisitor(final Properties props) {
        if (null != props) {
            if (props.containsKey("upperCase")) {
```

### NonProtectedConstructorInAbstractClass
Constructor `SQL92StatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/impl/SQL92StatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public SQL92StatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `MySQLStatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/impl/MySQLStatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public MySQLStatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `OracleStatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleStatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public OracleStatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `SQLServerStatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/impl/SQLServerStatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public SQLServerStatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `OpenGaussStatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public OpenGaussStatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `PostgreSQLStatementSQLVisitor()` of an abstract class should not be declared 'public'
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();
    
    public PostgreSQLStatementSQLVisitor(final Properties props) {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `SQLDialectException()` of an abstract class should not be declared 'public'
in `dialect-exception/core/src/main/java/org/apache/shardingsphere/dialect/exception/SQLDialectException.java`
#### Snippet
```java
    private static final long serialVersionUID = -5090068160364259336L;
    
    public SQLDialectException(final String reason) {
        super(reason);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DatabaseProtocolException()` of an abstract class should not be declared 'public'
in `dialect-exception/core/src/main/java/org/apache/shardingsphere/dialect/exception/protocol/DatabaseProtocolException.java`
#### Snippet
```java
    private static final long serialVersionUID = -6035033415978907492L;
    
    public DatabaseProtocolException(final String reason) {
        super(reason);
    }
```

## RuleId[ruleID=TestCaseWithConstructor]
### TestCaseWithConstructor
Initialization logic in constructor `InternalUnsupportedSQLParserIT()` instead of 'setup()' life cycle method
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/InternalUnsupportedSQLParserIT.java`
#### Snippet
```java
    private final SQLCaseType sqlCaseType;
    
    public InternalUnsupportedSQLParserIT(final InternalSQLParserTestParameter testParam) {
        sqlCaseId = testParam.getSqlCaseId();
        databaseType = testParam.getDatabaseType();
```

### TestCaseWithConstructor
Initialization logic in constructor `InternalSQLParserIT()` instead of 'setup()' life cycle method
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/InternalSQLParserIT.java`
#### Snippet
```java
    private final String visitorType;
    
    public InternalSQLParserIT(final InternalSQLParserTestParameter testParam) {
        sqlCaseId = testParam.getSqlCaseId();
        databaseType = testParam.getDatabaseType();
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/driver/spi/ClasspathDriverURLProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/ShardingSphereDriver.java`
#### Snippet
```java
    @Override
    public Connection connect(final String url, final Properties info) throws SQLException {
        return acceptsURL(url) ? dataSourceCache.get(url).getConnection() : null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/datasource/metadata/ShardingSphereDatabaseMetaData.java`
#### Snippet
```java
    private String getActualTableNamePattern(final String tableNamePattern) {
        return null == tableNamePattern
                ? null
                : findDataNodeContainedRule().filter(optional -> optional.findFirstActualTable(tableNamePattern).isPresent()).map(optional -> "%" + tableNamePattern + "%").orElse(tableNamePattern);
    }
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/datasource/metadata/ShardingSphereDatabaseMetaData.java`
#### Snippet
```java
    
    private String getActualTable(final String catalog, final String table) {
        return null == table ? null : findDataNodeContainedRule().map(each -> findActualTable(each, catalog, table).orElse(table)).orElse(table);
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/AbstractConnectionAdapter.java`
#### Snippet
```java
    @Override
    public final String getCatalog() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/AbstractConnectionAdapter.java`
#### Snippet
```java
    @Override
    public final SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/adapter/AbstractStatementAdapter.java`
#### Snippet
```java
    @Override
    public final SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getCatalogName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getColumnLabel(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getColumnName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getColumnClassName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public <T> T unwrap(final Class<T> iface) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getSchemaName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getColumnTypeName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSetMetaData.java`
#### Snippet
```java
    @Override
    public String getTableName(final int column) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerStatement.java`
#### Snippet
```java
    @Override
    public SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerStatement.java`
#### Snippet
```java
    @Override
    public ResultSet getGeneratedKeys() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerStatement.java`
#### Snippet
```java
    @Override
    public ResultSet executeQuery(final String sql) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerStatement.java`
#### Snippet
```java
    @Override
    public ResultSet getResultSet() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getBinaryStream(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public BigDecimal getBigDecimal(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Statement getStatement() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public URL getURL(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Array getArray(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Time getTime(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public URL getURL(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Blob getBlob(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Date getDate(final String columnLabel, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Timestamp getTimestamp(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Array getArray(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Reader getCharacterStream(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getAsciiStream(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Date getDate(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public SQLXML getSQLXML(final String columnLabel) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Time getTime(final int columnIndex, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Clob getClob(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public SQLXML getSQLXML(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getAsciiStream(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Object getObject(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Object getObject(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Timestamp getTimestamp(final int columnIndex, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getUnicodeStream(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Reader getCharacterStream(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Date getDate(final int columnIndex, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Timestamp getTimestamp(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public BigDecimal getBigDecimal(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getUnicodeStream(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public InputStream getBinaryStream(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Time getTime(final String columnLabel, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Clob getClob(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Time getTime(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public BigDecimal getBigDecimal(final String columnLabel, final int scale) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Timestamp getTimestamp(final String columnLabel, final Calendar cal) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Blob getBlob(final String columnLabel) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/resultset/CircuitBreakerResultSet.java`
#### Snippet
```java
    @Override
    public Date getDate(final int columnIndex) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerPreparedStatement.java`
#### Snippet
```java
    @Override
    protected DriverExecutor getExecutor() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerPreparedStatement.java`
#### Snippet
```java
    @Override
    public ParameterMetaData getParameterMetaData() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/statement/CircuitBreakerPreparedStatement.java`
#### Snippet
```java
    @Override
    protected StatementManager getStatementManager() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getSuperTypes(final String catalog, final String schemaPattern, final String typeNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getProcedureTerm() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getBestRowIdentifier(final String catalog, final String schema, final String table, final int scope, final boolean nullable) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public RowIdLifetime getRowIdLifetime() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getTables(final String catalog, final String schemaPattern, final String tableNamePattern, final String[] types) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getNumericFunctions() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getDatabaseProductVersion() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getIndexInfo(final String catalog, final String schema, final String table, final boolean unique, final boolean approximate) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getAttributes(final String catalog, final String schemaPattern, final String typeNamePattern, final String attributeNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getTypeInfo() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getProcedureColumns(final String catalog, final String schemaPattern, final String procedureNamePattern, final String columnNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getCatalogSeparator() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getColumnPrivileges(final String catalog, final String schema, final String table, final String columnNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getColumns(final String catalog, final String schemaPattern, final String tableNamePattern, final String columnNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getTableTypes() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getSchemas(final String catalog, final String schemaPattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getVersionColumns(final String catalog, final String schema, final String table) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getCatalogs() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getFunctionColumns(final String catalog, final String schemaPattern, final String functionNamePattern, final String columnNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getFunctions(final String catalog, final String schemaPattern, final String functionNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getTablePrivileges(final String catalog, final String schemaPattern, final String tableNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getUDTs(final String catalog, final String schemaPattern, final String typeNamePattern, final int[] types) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getExtraNameCharacters() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public <T> T unwrap(final Class<T> iface) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getPseudoColumns(final String catalog, final String schemaPattern, final String tableNamePattern, final String columnNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getImportedKeys(final String catalog, final String schema, final String table) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getPrimaryKeys(final String catalog, final String schema, final String table) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getProcedures(final String catalog, final String schemaPattern, final String procedureNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getStringFunctions() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getSQLKeywords() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getCatalogTerm() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getSearchStringEscape() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getIdentifierQuoteString() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getURL() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    public ResultSet getCrossReference(final String parentCatalog, final String parentSchema, final String parentTable, final String foreignCatalog,
                                       final String foreignSchema, final String foreignTable) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getTimeDateFunctions() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getSuperTables(final String catalog, final String schemaPattern, final String tableNamePattern) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getExportedKeys(final String catalog, final String schema, final String table) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getUserName() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getSystemFunctions() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public Connection getConnection() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getSchemaTerm() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getDriverName() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getClientInfoProperties() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public ResultSet getSchemas() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/metadata/CircuitBreakerDatabaseMetaData.java`
#### Snippet
```java
    @Override
    public String getDriverVersion() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/connection/CircuitBreakerConnection.java`
#### Snippet
```java
    @Override
    public SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/state/circuit/connection/CircuitBreakerConnection.java`
#### Snippet
```java
    @Override
    public Array createArrayOf(final String typeName, final Object[] elements) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/RegistryCenter.java`
#### Snippet
```java
    
    private String getJDBCDatabaseName() {
        return instanceMetaData instanceof JDBCInstanceMetaData ? databaseConfigs.keySet().stream().findFirst().orElse(null) : null;
    }
    
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/etcd/src/main/java/org/apache/shardingsphere/mode/repository/cluster/etcd/EtcdRepository.java`
#### Snippet
```java
    public String getDirectly(final String key) {
        List<KeyValue> keyValues = client.getKVClient().get(ByteSequence.from(key, StandardCharsets.UTF_8)).get().getKvs();
        return keyValues.isEmpty() ? null : keyValues.iterator().next().getValue().toString(StandardCharsets.UTF_8);
    }
    
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/ConsulRepository.java`
#### Snippet
```java
    public String getDirectly(final String key) {
        Response<GetValue> response = consulClient.getKVValue(key);
        return null == response ? null : response.getValue().getValue();
    }
    
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/zookeeper/src/main/java/org/apache/shardingsphere/mode/repository/cluster/zookeeper/ZookeeperRepository.java`
#### Snippet
```java
            // CHECKSTYLE:ON
            ZookeeperExceptionHandler.handleException(ex);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/NacosRepository.java`
#### Snippet
```java
                }
            }
            return null;
        } catch (final NacosException ex) {
            throw new ClusterPersistRepositoryException(ex);
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/NacosRepository.java`
#### Snippet
```java
    @Override
    public DistributedLockHolder getDistributedLockHolder() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/NacosRepository.java`
#### Snippet
```java
                                return pathWithoutPrefix.contains(PATH_SEPARATOR) ? pathWithoutPrefix.substring(0, pathWithoutPrefix.indexOf(PATH_SEPARATOR)) : pathWithoutPrefix;
                            }
                            return null;
                        }).filter(Objects::nonNull);
                concatKeys = Stream.concat(concatKeys, keys);
```

### ReturnNull
Return of `null`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/builder/AgentJunction.java`
#### Snippet
```java
    @Override
    public <U extends TypeDescription> Junction<U> or(final ElementMatcher<? super U> other) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/builder/AgentJunction.java`
#### Snippet
```java
    @Override
    public <U extends TypeDescription> Junction<U> and(final ElementMatcher<? super U> other) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractSQLParserEngineAdviceTest.java`
#### Snippet
```java
                case "setAttachment":
                    attachment = invocation.getArguments()[0];
                    return null;
                default:
                    return invocation.callRealMethod();
```

### ReturnNull
Return of `null`
in `agent/plugins/tracing/test/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/advice/AbstractJDBCExecutorCallbackAdviceTest.java`
#### Snippet
```java
                case "setAttachment":
                    attachment = invocation.getArguments()[0];
                    return null;
                default:
                    return invocation.callRealMethod();
```

### ReturnNull
Return of `null`
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/yaml/representer/processor/DefaultYamlTupleProcessor.java`
#### Snippet
```java
     */
    public NodeTuple process(final NodeTuple nodeTuple) {
        return isUnsetNodeTuple(nodeTuple.getValueNode()) ? null : nodeTuple;
    }
    
```

### ReturnNull
Return of `null`
in `infra/binder/src/main/java/org/apache/shardingsphere/infra/binder/segment/select/orderby/engine/OrderByContextEngine.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/data/swapper/YamlShardingSphereRowDataSwapper.java`
#### Snippet
```java
    private Object convertDataType(final Object data, final int dataType) {
        if (Types.DECIMAL == dataType || Types.BIGINT == dataType) {
            return null == data ? null : data.toString();
        }
        // TODO use general type convertor
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/data/swapper/YamlShardingSphereRowDataSwapper.java`
#### Snippet
```java
    private Object convertByDataType(final Object data, final int dataType) {
        if (null == data) {
            return null;
        }
        if (Types.DECIMAL == dataType) {
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/config/swapper/algorithm/YamlAlgorithmConfigurationSwapper.java`
#### Snippet
```java
    @Override
    public AlgorithmConfiguration swapToObject(final YamlAlgorithmConfiguration yamlConfig) {
        return null == yamlConfig ? null : new AlgorithmConfiguration(yamlConfig.getType(), yamlConfig.getProps());
    }
}
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/yaml/config/swapper/algorithm/YamlAlgorithmConfigurationSwapper.java`
#### Snippet
```java
    public YamlAlgorithmConfiguration swapToYamlConfiguration(final AlgorithmConfiguration data) {
        if (null == data) {
            return null;
        }
        YamlAlgorithmConfiguration result = new YamlAlgorithmConfiguration();
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/type/dialect/OracleDatabaseType.java`
#### Snippet
```java
            return Optional.ofNullable(connection.getMetaData().getUserName()).map(String::toUpperCase).orElse(null);
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/ShardingSphereMetaData.java`
#### Snippet
```java
     */
    public ShardingSphereDatabase getDatabase(final String databaseName) {
        return null != databaseName ? databases.get(databaseName.toLowerCase()) : null;
    }
    
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/data/collector/ShardingSphereTableDataCollectorUtil.java`
#### Snippet
```java
    private static Object convertIfNecessary(final Object data, final int dataType) {
        if (Types.ARRAY == dataType) {
            return null == data ? null : data.toString();
        }
        if (Types.BIGINT == dataType) {
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/data/collector/ShardingSphereTableDataCollectorUtil.java`
#### Snippet
```java
        }
        if (Types.BIGINT == dataType) {
            return null == data ? null : Long.valueOf(data.toString());
        }
        return data;
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/data/collector/ShardingSphereTableDataCollectorUtil.java`
#### Snippet
```java
                return false;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/user/yaml/swapper/YamlUserSwapper.java`
#### Snippet
```java
    public ShardingSphereUser swapToObject(final YamlUserConfiguration yamlConfig) {
        if (Objects.isNull(yamlConfig)) {
            return null;
        }
        Grantee grantee = convertYamlUserToGrantee(yamlConfig.getUser());
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/user/yaml/swapper/YamlUserSwapper.java`
#### Snippet
```java
    public YamlUserConfiguration swapToYamlConfiguration(final ShardingSphereUser data) {
        if (Objects.isNull(data)) {
            return null;
        }
        YamlUserConfiguration result = new YamlUserConfiguration();
```

### ReturnNull
Return of `null`
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/metadata/type/DefaultDataSourcePoolFieldMetaData.java`
#### Snippet
```java
    @Override
    public String getJdbcUrlPropertiesFieldName() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/engine/driver/jdbc/JDBCExecutorCallback.java`
#### Snippet
```java
                Optional<T> saneResult = getSaneResult(sqlStatement, ex);
                if (saneResult.isPresent()) {
                    return isTrunkThread ? saneResult.get() : null;
                }
            }
```

### ReturnNull
Return of `null`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/engine/driver/jdbc/JDBCExecutorCallback.java`
#### Snippet
```java
            sqlExecutionHook.finishFailure(ex);
            SQLExecutorExceptionHandler.handleException(ex);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/result/query/impl/driver/jdbc/type/memory/loader/dialect/MySQLQueryResultDataRowLoader.java`
#### Snippet
```java
        if (isYearDataType(resultSet.getMetaData().getColumnTypeName(columnIndex))) {
            Object result = resultSet.getObject(columnIndex);
            return resultSet.wasNull() ? null : result;
        }
        return resultSet.getDate(columnIndex);
```

### ReturnNull
Return of `null`
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/result/query/impl/driver/jdbc/type/util/ResultSetUtil.java`
#### Snippet
```java
                return 0.0D;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/cdc/CDCBackendHandler.java`
#### Snippet
```java
    private String getDefaultSchema(final DatabaseType databaseType) {
        if (!(databaseType instanceof SchemaSupportedDatabaseType)) {
            return null;
        }
        return ((SchemaSupportedDatabaseType) databaseType).getDefaultSchema();
```

### ReturnNull
Return of `null`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/converter/InventoryIncrementalProcessConfigurationSegmentConverter.java`
#### Snippet
```java
    
    private static AlgorithmConfiguration convertToAlgorithm(final AlgorithmSegment segment) {
        return null == segment ? null : new AlgorithmConfiguration(segment.getName(), segment.getProps());
    }
}
```

### ReturnNull
Return of `null`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/converter/InventoryIncrementalProcessConfigurationSegmentConverter.java`
#### Snippet
```java
    private static PipelineReadConfiguration convertToReadConfiguration(final ReadOrWriteSegment readSegment) {
        return null == readSegment
                ? null
                : new PipelineReadConfiguration(readSegment.getWorkerThread(), readSegment.getBatchSize(), readSegment.getShardingSize(), convertToAlgorithm(readSegment.getRateLimiter()));
    }
```

### ReturnNull
Return of `null`
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/converter/InventoryIncrementalProcessConfigurationSegmentConverter.java`
#### Snippet
```java
    
    private static PipelineWriteConfiguration convertToWriteConfiguration(final ReadOrWriteSegment writeSegment) {
        return null == writeSegment ? null : new PipelineWriteConfiguration(writeSegment.getWorkerThread(), writeSegment.getBatchSize(), convertToAlgorithm(writeSegment.getRateLimiter()));
    }
    
```

### ReturnNull
Return of `null`
in `kernel/parser/distsql/parser/src/main/java/org/apache/shardingsphere/parser/distsql/parser/core/SQLParserDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
}
```

### ReturnNull
Return of `null`
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/yaml/swapper/YamlAppenderSwapper.java`
#### Snippet
```java
    public ShardingSphereAppender swapToObject(final YamlAppenderConfiguration yamlConfig) {
        if (Objects.isNull(yamlConfig)) {
            return null;
        }
        ShardingSphereAppender result = new ShardingSphereAppender(yamlConfig.getAppenderName(), yamlConfig.getAppenderClass(), yamlConfig.getPattern());
```

### ReturnNull
Return of `null`
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/yaml/swapper/YamlAppenderSwapper.java`
#### Snippet
```java
    public YamlAppenderConfiguration swapToYamlConfiguration(final ShardingSphereAppender data) {
        if (Objects.isNull(data)) {
            return null;
        }
        return new YamlAppenderConfiguration(data.getAppenderName(), data.getAppenderClass(), data.getPattern(), data.getFile());
```

### ReturnNull
Return of `null`
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/yaml/swapper/YamlLoggerSwapper.java`
#### Snippet
```java
    public ShardingSphereLogger swapToObject(final YamlLoggerConfiguration yamlConfig) {
        if (Objects.isNull(yamlConfig)) {
            return null;
        }
        ShardingSphereLogger result = new ShardingSphereLogger(yamlConfig.getLoggerName(), yamlConfig.getLevel(), yamlConfig.getAdditivity(), yamlConfig.getAppenderName());
```

### ReturnNull
Return of `null`
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/yaml/swapper/YamlLoggerSwapper.java`
#### Snippet
```java
    public YamlLoggerConfiguration swapToYamlConfiguration(final ShardingSphereLogger data) {
        if (Objects.isNull(data)) {
            return null;
        }
        return new YamlLoggerConfiguration(data.getLoggerName(), data.getLevel(), data.getAdditivity(), data.getAppenderName(), data.getProps());
```

### ReturnNull
Return of `null`
in `kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/rule/builder/DefaultLoggingRuleConfigurationBuilder.java`
#### Snippet
```java
                return shardingSphereAppender;
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(ShardingSphereAppender::getAppenderName))));
    }
```

### ReturnNull
Return of `null`
in `kernel/traffic/distsql/parser/src/main/java/org/apache/shardingsphere/traffic/distsql/parser/core/TrafficDistSQLStatementVisitor.java`
#### Snippet
```java
    @Override
    public ASTNode visitLoadBalancerDefinition(final LoadBalancerDefinitionContext ctx) {
        return null == ctx ? null : visit(ctx.algorithmDefinition());
    }
    
```

### ReturnNull
Return of `null`
in `kernel/traffic/distsql/parser/src/main/java/org/apache/shardingsphere/traffic/distsql/parser/core/TrafficDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
}
```

### ReturnNull
Return of `null`
in `kernel/traffic/distsql/handler/src/main/java/org/apache/shardingsphere/traffic/distsql/handler/convert/TrafficRuleConverter.java`
#### Snippet
```java
    
    private static String createAlgorithmName(final String ruleName, final AlgorithmConfiguration algorithm) {
        return null == algorithm ? null : String.format("%s_%s", ruleName, algorithm.getType()).toLowerCase();
    }
    
```

### ReturnNull
Return of `null`
in `kernel/traffic/distsql/handler/src/main/java/org/apache/shardingsphere/traffic/distsql/handler/convert/TrafficRuleConverter.java`
#### Snippet
```java
    
    private static AlgorithmConfiguration createAlgorithmConfiguration(final AlgorithmSegment segment) {
        return null == segment ? null : new AlgorithmConfiguration(segment.getName(), segment.getProps());
    }
    
```

### ReturnNull
Return of `null`
in `kernel/authority/core/src/main/java/org/apache/shardingsphere/authority/checker/PrivilegeTypeMapper.java`
#### Snippet
```java
            return PrivilegeType.DELETE;
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/authority/core/src/main/java/org/apache/shardingsphere/authority/checker/PrivilegeTypeMapper.java`
#### Snippet
```java
            return PrivilegeType.TRUNCATE;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `kernel/authority/core/src/main/java/org/apache/shardingsphere/authority/checker/PrivilegeTypeMapper.java`
#### Snippet
```java
        }
        // TODO add more Privilege and SQL statement mapping
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/BitronixRecoveryResource.java`
#### Snippet
```java
    @Override
    public XAStatefulHolder createPooledConnection(final Object xaFactory, final ResourceBean bean) {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/BitronixRecoveryResource.java`
#### Snippet
```java
    public XAResourceHolder findXAResourceHolder(final XAResource xaResource) {
        SingleXAResource singleXAResource = (SingleXAResource) xaResource;
        return resourceName.equals(singleXAResource.getResourceName()) ? new SingleXAResourceHolder(xaResource, this) : null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/BitronixRecoveryResource.java`
#### Snippet
```java
    @Override
    public Reference getReference() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/SingleXAResourceHolder.java`
#### Snippet
```java
    @Override
    public Date getLastReleaseDate() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/SingleXAResourceHolder.java`
#### Snippet
```java
    @Override
    public List<XAResourceHolder> getXAResourceHolders() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/type/xa/provider/bitronix/src/main/java/org/apache/shardingsphere/transaction/xa/bitronix/manager/SingleXAResourceHolder.java`
#### Snippet
```java
    @Override
    public Object getConnectionHandle() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/transaction/distsql/parser/src/main/java/org/apache/shardingsphere/transaction/distsql/parser/core/TransactionDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/config/ImporterConfiguration.java`
#### Snippet
```java
     */
    public String getSchemaName(final LogicTableName logicTableName) {
        return TypedSPILoader.getService(DatabaseType.class, dataSourceConfig.getDatabaseType().getType()).isSchemaAvailable() ? tableNameSchemaNameMapping.getSchemaName(logicTableName) : null;
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/datasource/config/yaml/YamlPipelineDataSourceConfigurationSwapper.java`
#### Snippet
```java
    public YamlPipelineDataSourceConfiguration swapToYamlConfiguration(final PipelineDataSourceConfiguration data) {
        if (null == data) {
            return null;
        }
        YamlPipelineDataSourceConfiguration result = new YamlPipelineDataSourceConfiguration();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/datasource/config/yaml/YamlPipelineDataSourceConfigurationSwapper.java`
#### Snippet
```java
    @Override
    public PipelineDataSourceConfiguration swapToObject(final YamlPipelineDataSourceConfiguration yamlConfig) {
        return null == yamlConfig ? null : PipelineDataSourceConfigurationFactory.newInstance(yamlConfig.getType(), yamlConfig.getParameter());
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/generator/DataRecordComparatorGenerator.java`
#### Snippet
```java
        }
        // TODO MySQL and PostgreSQL not support now
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/yaml/job/YamlCDCJobConfigurationSwapper.java`
#### Snippet
```java
     */
    public CDCJobConfiguration swapToObject(final String jobParam) {
        return null == jobParam ? null : swapToObject(YamlEngine.unmarshal(jobParam, YamlCDCJobConfiguration.class, true));
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/util/AnyValueConvert.java`
#### Snippet
```java
    public static Object convertToObject(final Any any) throws InvalidProtocolBufferException {
        if (null == any || any.is(NullValue.class)) {
            return null;
        }
        if (any.is(StringValue.class)) {
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/PipelineProcessConfigurationPersistService.java`
#### Snippet
```java
        String yamlText = PipelineAPIFactory.getGovernanceRepositoryAPI().getMetaDataProcessConfiguration(jobType);
        if (Strings.isNullOrEmpty(yamlText)) {
            return null;
        }
        YamlPipelineProcessConfiguration yamlConfig = YamlEngine.unmarshal(yamlText, YamlPipelineProcessConfiguration.class, true);
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/PipelineProcessConfigurationPersistService.java`
#### Snippet
```java
        }
        YamlPipelineProcessConfiguration yamlConfig = YamlEngine.unmarshal(yamlText, YamlPipelineProcessConfiguration.class, true);
        return null == yamlConfig || yamlConfig.isAllFieldsNull() ? null : swapper.swapToObject(yamlConfig);
    }
    
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
        }
        if (waitSortedMap.isEmpty()) {
            return null;
        }
        DataRecord minRecord = null;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
        }
        if (null == minRecord) {
            return null;
        }
        incrementalRecordMap.get(belongImporter).poll();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/util/CDCDataRecordUtil.java`
#### Snippet
```java
            return (DataRecord) record;
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/dumper/AbstractColumnValueReader.java`
#### Snippet
```java
    public final Object readValue(final ResultSet resultSet, final ResultSetMetaData metaData, final int columnIndex) throws SQLException {
        Object result = doReadValue(resultSet, metaData, columnIndex);
        return resultSet.wasNull() ? null : result;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/record/RecordUtil.java`
#### Snippet
```java
            return record;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/job/YamlConsistencyCheckJobConfigurationSwapper.java`
#### Snippet
```java
     */
    public ConsistencyCheckJobConfiguration swapToObject(final String jobParam) {
        return null == jobParam ? null : swapToObject(YamlEngine.unmarshal(jobParam, YamlConsistencyCheckJobConfiguration.class, true));
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineWriteConfigurationSwapper.java`
#### Snippet
```java
    public PipelineWriteConfiguration swapToObject(final YamlPipelineWriteConfiguration yamlConfig) {
        return null == yamlConfig
                ? null
                : new PipelineWriteConfiguration(yamlConfig.getWorkerThread(), yamlConfig.getBatchSize(), algorithmSwapper.swapToObject(yamlConfig.getRateLimiter()));
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineWriteConfigurationSwapper.java`
#### Snippet
```java
    public YamlPipelineWriteConfiguration swapToYamlConfiguration(final PipelineWriteConfiguration data) {
        if (null == data) {
            return null;
        }
        YamlPipelineWriteConfiguration result = new YamlPipelineWriteConfiguration();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/importer/DataRecordMerger.java`
#### Snippet
```java
    
    private Object mergePrimaryKeyOldValue(final Column beforeColumn, final Column column) {
        return beforeColumn.isUpdated() ? beforeColumn.getOldValue() : (column.isUpdated() ? column.getOldValue() : null);
    }
}
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineProcessConfigurationSwapper.java`
#### Snippet
```java
    public PipelineProcessConfiguration swapToObject(final YamlPipelineProcessConfiguration yamlConfig) {
        return null == yamlConfig
                ? null
                : new PipelineProcessConfiguration(
                        readConfigSwapper.swapToObject(yamlConfig.getRead()), writeConfigSwapper.swapToObject(yamlConfig.getWrite()), algorithmSwapper.swapToObject(yamlConfig.getStreamChannel()));
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineProcessConfigurationSwapper.java`
#### Snippet
```java
    public YamlPipelineProcessConfiguration swapToYamlConfiguration(final PipelineProcessConfiguration data) {
        if (null == data) {
            return null;
        }
        YamlPipelineProcessConfiguration result = new YamlPipelineProcessConfiguration();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineReadConfigurationSwapper.java`
#### Snippet
```java
    public PipelineReadConfiguration swapToObject(final YamlPipelineReadConfiguration yamlConfig) {
        return null == yamlConfig
                ? null
                : new PipelineReadConfiguration(yamlConfig.getWorkerThread(), yamlConfig.getBatchSize(), yamlConfig.getShardingSize(), algorithmSwapper.swapToObject(yamlConfig.getRateLimiter()));
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/process/YamlPipelineReadConfigurationSwapper.java`
#### Snippet
```java
    public YamlPipelineReadConfiguration swapToYamlConfiguration(final PipelineReadConfiguration data) {
        if (null == data) {
            return null;
        }
        YamlPipelineReadConfiguration result = new YamlPipelineReadConfiguration();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/yaml/consistency/YamlDataConsistencyCheckResultSwapper.java`
#### Snippet
```java
    public DataConsistencyCheckResult swapToObject(final YamlDataConsistencyCheckResult yamlConfig) {
        if (null == yamlConfig) {
            return null;
        }
        if (!Strings.isNullOrEmpty(yamlConfig.getIgnoredType())) {
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/column/value/impl/MySQLUnsignedMediumintHandler.java`
#### Snippet
```java
    public Serializable handle(final Serializable value) {
        if (null == value) {
            return null;
        }
        int intValue = (int) value;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/column/value/impl/MySQLUnsignedTinyintHandler.java`
#### Snippet
```java
    public Serializable handle(final Serializable value) {
        if (null == value) {
            return null;
        }
        byte byteValue = (byte) value;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/column/value/impl/MySQLUnsignedIntHandler.java`
#### Snippet
```java
    public Serializable handle(final Serializable value) {
        if (null == value) {
            return null;
        }
        int intValue = (int) value;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/column/value/impl/MySQLUnsignedBigintHandler.java`
#### Snippet
```java
    public Serializable handle(final Serializable value) {
        if (null == value) {
            return null;
        }
        long longValue = (long) value;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/column/value/impl/MySQLUnsignedSmallintHandler.java`
#### Snippet
```java
    public Serializable handle(final Serializable value) {
        if (null == value) {
            return null;
        }
        short shortValue = (short) value;
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/datasource/MySQLJdbcQueryPropertiesExtension.java`
#### Snippet
```java
        } catch (final ClassNotFoundException ex) {
            log.warn("not find com.mysql.jdbc.Driver class");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
            return blockingEventQueue.poll(100L, TimeUnit.MILLISECONDS);
        } catch (final InterruptedException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
            Object response = responseCallback.get(5, TimeUnit.SECONDS);
            if (null == response) {
                return null;
            }
            if (type.equals(response.getClass())) {
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/netty/MySQLBinlogEventPacketDecoder.java`
#### Snippet
```java
            case ROTATE_EVENT:
                decodeRotateEvent(binlogEventHeader, payload);
                return null;
            case FORMAT_DESCRIPTION_EVENT:
                MySQLBinlogFormatDescriptionEventPacket formatDescriptionEventPacket = new MySQLBinlogFormatDescriptionEventPacket(binlogEventHeader, payload);
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/netty/MySQLBinlogEventPacketDecoder.java`
#### Snippet
```java
                    payload.getByteBuf().skipBytes(readableBytes);
                }
                return null;
            case TABLE_MAP_EVENT:
                decodeTableMapEvent(binlogEventHeader, payload);
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/netty/MySQLBinlogEventPacketDecoder.java`
#### Snippet
```java
            case TABLE_MAP_EVENT:
                decodeTableMapEvent(binlogEventHeader, payload);
                return null;
            case WRITE_ROWS_EVENTv1:
            case WRITE_ROWS_EVENTv2:
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
            return result;
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
    private Object readColumnData(final String data, final String columnType) {
        if ("null".equals(data)) {
            return null;
        }
        if (columnType.startsWith("numeric")) {
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
            return result;
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
            return new PGInterval(decodeString(data));
        } catch (final SQLException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
            }
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/wal/decode/TestDecodingPlugin.java`
#### Snippet
```java
                data.get();
            }
            return null;
        }
        data.reset();
```

### ReturnNull
Return of `null`
in `kernel/data-pipeline/distsql/parser/src/main/java/org/apache/shardingsphere/migration/distsql/parser/core/MigrationDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/SQLFederationDataContext.java`
#### Snippet
```java
    @Override
    public QueryProvider getQueryProvider() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    @Override
    public SQLWarning getWarnings() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/sql-federation/executor/advanced/src/main/java/org/apache/shardingsphere/sqlfederation/advanced/resultset/SQLFederationResultSet.java`
#### Snippet
```java
    @Override
    public Statement getStatement() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/util/SQLFederationPlannerUtil.java`
#### Snippet
```java
                                                            final SQLParserRule sqlParserRule, final DatabaseType databaseType, final boolean needsViewExpand) {
        ViewExpander expander = needsViewExpand ? new ShardingSphereViewExpander(sqlParserRule, databaseType,
                createSqlToRelConverter(catalogReader, validator, cluster, sqlParserRule, databaseType, false)) : (rowType, queryString, schemaPath, viewPath) -> null;
        // TODO remove withRemoveSortInSubQuery when calcite can expand view which contains order by correctly
        Config converterConfig = SqlToRelConverter.config().withTrimUnusedFields(true).withRemoveSortInSubQuery(false);
```

### ReturnNull
Return of `null`
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
                result[index] = ((RexInputRef) exp).getIndex();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private AlgorithmSegment getAlgorithmSegment(final RateLimiterContext ctx) {
        return null == ctx ? null : (AlgorithmSegment) visit(ctx);
    }
    
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getPassword(final PasswordContext ctx) {
        return null == ctx ? null : StringLiteralValue.getStandardEscapesStringLiteralValue(ctx.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private Integer getBatchSize(final BatchSizeContext ctx) {
        return null == ctx ? null : Integer.parseInt(ctx.intValue().getText());
    }
    
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private Integer getShardingSize(final ShardingSizeContext ctx) {
        return null == ctx ? null : Integer.parseInt(ctx.intValue().getText());
    }
    
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private Integer getWorkerThread(final WorkerThreadContext ctx) {
        return null == ctx ? null : Integer.parseInt(ctx.intValue().getText());
    }
    
```

### ReturnNull
Return of `null`
in `distsql/parser/src/main/java/org/apache/shardingsphere/distsql/parser/core/kernel/KernelDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
}
```

### ReturnNull
Return of `null`
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/merge/dql/MaskMergedResult.java`
#### Snippet
```java
        }
        Object originalValue = mergedResult.getValue(columnIndex, Object.class);
        return null == originalValue ? null : maskAlgorithm.get().mask(originalValue);
    }
    
```

### ReturnNull
Return of `null`
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/hash/MD5MaskAlgorithm.java`
#### Snippet
```java
    @Override
    public String mask(final Object plainValue) {
        return null == plainValue ? null : DigestUtils.md5Hex(plainValue + salt);
    }
    
```

### ReturnNull
Return of `null`
in `features/mask/distsql/parser/src/main/java/org/apache/shardingsphere/mask/distsql/parser/core/MaskDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `features/shadow/distsql/parser/src/main/java/org/apache/shardingsphere/shadow/distsql/parser/core/ShadowDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParserRuleContext ctx) {
        return null == ctx || ctx.isEmpty() ? null : new IdentifierValue(ctx.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/merge/dql/EncryptMergedResult.java`
#### Snippet
```java
        }
        Object cipherValue = mergedResult.getValue(columnIndex, Object.class);
        return null == cipherValue ? null : encryptAlgorithm.get().decrypt(cipherValue, encryptContext.get());
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/encrypt/MD5EncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        return null == plainValue ? null : DigestUtils.md5Hex(plainValue + salt);
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/encrypt/RC4EncryptAlgorithm.java`
#### Snippet
```java
    public Object decrypt(final String cipherValue, final EncryptContext encryptContext) {
        if (null == cipherValue) {
            return null;
        }
        byte[] result = handle(Base64.decodeBase64(cipherValue));
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/encrypt/RC4EncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        return null == plainValue ? null : Base64.encodeBase64String(handle(String.valueOf(plainValue).getBytes(StandardCharsets.UTF_8)));
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/encrypt/AESEncryptAlgorithm.java`
#### Snippet
```java
    public Object decrypt(final String cipherValue, final EncryptContext encryptContext) {
        if (null == cipherValue) {
            return null;
        }
        byte[] result = getCipher(Cipher.DECRYPT_MODE).doFinal(Base64.getDecoder().decode(cipherValue.trim()));
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/encrypt/AESEncryptAlgorithm.java`
#### Snippet
```java
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        if (null == plainValue) {
            return null;
        }
        byte[] result = getCipher(Cipher.ENCRYPT_MODE).doFinal(String.valueOf(plainValue).getBytes(StandardCharsets.UTF_8));
```

### ReturnNull
Return of `null`
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/algorithm/like/CharDigestLikeEncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        return null == plainValue ? null : digest(String.valueOf(plainValue));
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM3EncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        return null == plainValue ? null : ByteUtils.toHexString(digest(String.valueOf(plainValue).getBytes(StandardCharsets.UTF_8), sm3Salt));
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/distsql/parser/src/main/java/org/apache/shardingsphere/encrypt/distsql/parser/core/EncryptDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        return null == plainValue ? null : ByteUtils.toHexString(encrypt(String.valueOf(plainValue).getBytes(StandardCharsets.UTF_8)));
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithm.java`
#### Snippet
```java
    @Override
    public Object decrypt(final String cipherValue, final EncryptContext encryptContext) {
        return null == cipherValue ? null : new String(decrypt(ByteUtils.fromHexString(cipherValue)), StandardCharsets.UTF_8);
    }
    
```

### ReturnNull
Return of `null`
in `features/encrypt/plugin/sm/src/main/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithm.java`
#### Snippet
```java
    private byte[] createSm4Iv(final Properties props, final String sm4Mode) {
        if (!"CBC".equalsIgnoreCase(sm4Mode)) {
            return null;
        }
        ShardingSpherePreconditions.checkState(props.containsKey(SM4_IV), () -> new EncryptAlgorithmInitializationException("SM4", String.format("%s can not be null", SM4_IV)));
```

### ReturnNull
Return of `null`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/yaml/engine/representer/processor/NoneYamlTupleProcessor.java`
#### Snippet
```java
    @Override
    public NodeTuple process(final NodeTuple nodeTuple) {
        return isNullNode(nodeTuple.getValueNode()) ? null : processNoneTuple(nodeTuple);
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/generator/ConditionValue.java`
#### Snippet
```java
            return (Comparable<?>) result;
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/engine/condition/generator/ConditionValue.java`
#### Snippet
```java
            return getValue((LiteralExpressionSegment) expressionSegment);
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/route/strategy/type/none/NoneShardingStrategy.java`
#### Snippet
```java
    @Override
    public ShardingAlgorithm getShardingAlgorithm() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/range/BoundaryBasedRangeShardingAlgorithm.java`
#### Snippet
```java
            return Long.parseLong(value);
        } catch (final NumberFormatException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
        String result = Optional.ofNullable(ctx.shardingColumn()).map(optional -> getIdentifierValue(optional.columnName()))
                .orElseGet(() -> ctx.shardingColumns().columnName().stream().map(this::getIdentifierValue).collect(Collectors.joining(",")));
        return result.isEmpty() ? null : result;
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String buildShardingColumn(final AutoShardingColumnDefinitionContext ctx) {
        return null == ctx.shardingColumn() ? null : getIdentifierValue(ctx.shardingColumn().columnName());
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
    private ASTNode visitAuditDefinition(final String tableName, final AuditDefinitionContext ctx) {
        if (null == ctx) {
            return null;
        }
        Collection<ShardingAuditorSegment> shardingAuditorSegments = new LinkedList<>();
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
            return visit(ctx.shardingAutoTableRule());
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
    private String getIdentifierValueForDataNodes(final ParseTree context) {
        if (null == context) {
            return null;
        }
        String value = new IdentifierValue(context.getText(), "[]'").getValue();
```

### ReturnNull
Return of `null`
in `features/sharding/distsql/parser/src/main/java/org/apache/shardingsphere/sharding/distsql/parser/core/ShardingDistSQLStatementVisitor.java`
#### Snippet
```java
    @Override
    public ASTNode visitKeyGenerateDefinition(final KeyGenerateDefinitionContext ctx) {
        return null == ctx ? null : new KeyGenerateStrategySegment(getIdentifierValue(ctx.columnName()), (AlgorithmSegment) visit(ctx.algorithmDefinition()));
    }
    
```

### ReturnNull
Return of `null`
in `features/db-discovery/distsql/parser/src/main/java/org/apache/shardingsphere/dbdiscovery/distsql/parser/core/DatabaseDiscoveryDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `features/readwrite-splitting/core/src/main/java/org/apache/shardingsphere/readwritesplitting/yaml/swapper/strategy/YamlDynamicReadwriteSplittingStrategyConfigurationSwapper.java`
#### Snippet
```java
    @Override
    public DynamicReadwriteSplittingStrategyConfiguration swapToObject(final YamlDynamicReadwriteSplittingStrategyConfiguration config) {
        return null == config ? null : new DynamicReadwriteSplittingStrategyConfiguration(config.getAutoAwareDataSourceName(), config.getWriteDataSourceQueryEnabled());
    }
}
```

### ReturnNull
Return of `null`
in `features/readwrite-splitting/distsql/parser/src/main/java/org/apache/shardingsphere/readwritesplitting/distsql/parser/core/ReadwriteSplittingDistSQLStatementVisitor.java`
#### Snippet
```java
    
    private String getIdentifierValue(final ParseTree context) {
        return null == context ? null : new IdentifierValue(context.getText()).getValue();
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/facade/SQL92StatementSQLVisitorFacade.java`
#### Snippet
```java
    @Override
    public Class<? extends RLSQLVisitor> getRLVisitorClass() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/facade/OracleStatementSQLVisitorFacade.java`
#### Snippet
```java
    @Override
    public Class<? extends RLSQLVisitor> getRLVisitorClass() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/facade/OpenGaussStatementSQLVisitorFacade.java`
#### Snippet
```java
    @Override
    public Class<? extends RLSQLVisitor> getRLVisitorClass() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/impl/OracleStatementSQLVisitor.java`
#### Snippet
```java
    private NullsOrderType generateNullsOrderType(final OrderByItemContext ctx) {
        if (null == ctx.FIRST() && null == ctx.LAST()) {
            return null;
        }
        return null == ctx.FIRST() ? NullsOrderType.LAST : NullsOrderType.FIRST;
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/facade/SQLServerStatementSQLVisitorFacade.java`
#### Snippet
```java
    @Override
    public Class<? extends RLSQLVisitor> getRLVisitorClass() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLTCLStatementSQLVisitor.java`
#### Snippet
```java
    private TransactionIsolationLevel getTransactionIsolationLevel(final TransactionModeItemContext modeItemContext) {
        if (null == modeItemContext.isoLevel()) {
            return null;
        }
        if (null != modeItemContext.isoLevel().UNCOMMITTED()) {
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLTCLStatementSQLVisitor.java`
#### Snippet
```java
            return TransactionIsolationLevel.SERIALIZABLE;
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLTCLStatementSQLVisitor.java`
#### Snippet
```java
            return TransactionAccessType.READ_WRITE;
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/facade/PostgreSQLStatementSQLVisitorFacade.java`
#### Snippet
```java
    @Override
    public Class<? extends RLSQLVisitor> getRLVisitorClass() {
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SQLUtil.java`
#### Snippet
```java
     */
    public static String getExactlyValue(final String value) {
        return null == value ? null : CharMatcher.anyOf(EXCLUDED_CHARACTERS).removeFrom(value);
    }
    
```

### ReturnNull
Return of `null`
in `sql-parser/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SQLUtil.java`
#### Snippet
```java
    public static String getExactlyValue(final String value, final String reservedCharacters) {
        if (null == value) {
            return null;
        }
        String toBeExcludedCharacters = CharMatcher.anyOf(reservedCharacters).removeFrom(EXCLUDED_CHARACTERS);
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    private NullsOrderType generateNullsOrderType(final NullsOrderContext ctx) {
        if (null == ctx) {
            return null;
        }
        return null == ctx.FIRST() ? NullsOrderType.LAST : NullsOrderType.FIRST;
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/impl/OpenGaussStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitSelectLimitValue(final SelectLimitValueContext ctx) {
        if (null != ctx.ALL()) {
            return null;
        }
        ASTNode astNode = visit(ctx.aExpr());
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    public ASTNode visitSelectLimitValue(final SelectLimitValueContext ctx) {
        if (null != ctx.ALL()) {
            return null;
        }
        ASTNode astNode = visit(ctx.aExpr());
```

### ReturnNull
Return of `null`
in `sql-parser/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/impl/PostgreSQLStatementSQLVisitor.java`
#### Snippet
```java
    private NullsOrderType generateNullsOrderType(final NullsOrderContext ctx) {
        if (null == ctx) {
            return null;
        }
        return null == ctx.FIRST() ? NullsOrderType.LAST : NullsOrderType.FIRST;
```

### ReturnNull
Return of `null`
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/binlog/row/MySQLBinlogRowsEventPacket.java`
#### Snippet
```java
    
    private MySQLNullBitmap readUpdateColumnsPresentBitmap(final MySQLPacketPayload payload) {
        return isUpdateRowsEvent(getBinlogEventHeader().getEventType()) ? new MySQLNullBitmap(columnNumber, payload) : null;
    }
    
```

### ReturnNull
Return of `null`
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/handshake/MySQLHandshakeResponse41Packet.java`
#### Snippet
```java
    
    private String readAuthPluginName(final MySQLPacketPayload payload) {
        return 0 != (capabilityFlags & MySQLCapabilityFlag.CLIENT_PLUGIN_AUTH.getValue()) ? payload.readStringNul() : null;
    }
    
```

### ReturnNull
Return of `null`
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/handshake/MySQLHandshakeResponse41Packet.java`
#### Snippet
```java
    
    private String readDatabase(final MySQLPacketPayload payload) {
        return 0 != (capabilityFlags & MySQLCapabilityFlag.CLIENT_CONNECT_WITH_DB.getValue()) ? payload.readStringNul() : null;
    }
    
```

### ReturnNull
Return of `null`
in `db-protocol/mysql/src/main/java/org/apache/shardingsphere/db/protocol/mysql/packet/handshake/MySQLHandshakePacket.java`
#### Snippet
```java
    
    private String readAuthPluginName(final MySQLPacketPayload payload) {
        return isClientPluginAuth() ? payload.readStringNul() : null;
    }
    
```

### ReturnNull
Return of `null`
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
        return Arrays.stream(elements).map(each -> {
            if ("NULL".equals(each)) {
                return null;
            }
            if ('"' == each.charAt(0) && '"' == each.charAt(each.length() - 1)) {
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `each`
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
            }
            if ('"' == each.charAt(0) && '"' == each.charAt(each.length() - 1)) {
                each = each.substring(1, each.length() - 1);
            }
            while (each.contains("\\\"")) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `each`
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
            }
            while (each.contains("\\\"")) {
                each = each.replace("\\\"", "\"");
            }
            while (each.contains("\\\\")) {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `each`
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/protocol/PostgreSQLArrayParameterDecoder.java`
#### Snippet
```java
            }
            while (each.contains("\\\\")) {
                each = each.replace("\\\\", "\\");
            }
            return each;
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/destroyer/DataSourcePoolDestroyer.java`
#### Snippet
```java
        while (dataSourcePoolActiveDetector.containsActiveConnection(dataSource)) {
            try {
                Thread.sleep(10L);
            } catch (final InterruptedException ignore) {
            }
```

## RuleId[ruleID=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/result/query/impl/driver/jdbc/type/util/ResultSetUtil.java`
#### Snippet
```java
        if (needScale) {
            try {
                return value.setScale(scale);
            } catch (final ArithmeticException ex) {
                return value.setScale(scale, RoundingMode.HALF_UP);
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.eventbus.Subscribe' is marked unstable with @Beta
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/context/JDBCContext.java`
#### Snippet
```java
     * @throws SQLException SQL exception
     */
    @Subscribe
    public synchronized void refreshCachedDatabaseMetaData(final DataSourceChangedEvent event) throws SQLException {
        cachedDatabaseMetaData = createCachedDatabaseMetaData(DataSourcePoolCreator.create(event.getDataSourcePropertiesMap())).orElse(null);
```

### UnstableApiUsage
'getType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/lock/ConsulDistributedLock.java`
#### Snippet
```java
                private static final long serialVersionUID = -5065504617907914417L;
                
            }.getType());
            if (value.isEmpty()) {
                return new Response<>(null, rawResponse);
```

### UnstableApiUsage
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/lock/ConsulDistributedLock.java`
#### Snippet
```java
    private Response<GetValue> getResponse(final RawResponse rawResponse) {
        if (200 == rawResponse.getStatusCode()) {
            List<GetValue> value = GsonFactory.getGson().fromJson(rawResponse.getContent(), new TypeToken<List<GetValue>>() {
                
                private static final long serialVersionUID = -5065504617907914417L;
```

### UnstableApiUsage
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `mode/type/cluster/repository/provider/consul/src/main/java/org/apache/shardingsphere/mode/repository/cluster/consul/lock/ConsulDistributedLock.java`
#### Snippet
```java
    private Response<GetValue> getResponse(final RawResponse rawResponse) {
        if (200 == rawResponse.getStatusCode()) {
            List<GetValue> value = GsonFactory.getGson().fromJson(rawResponse.getContent(), new TypeToken<List<GetValue>>() {
                
                private static final long serialVersionUID = -5065504617907914417L;
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            connectionContext.setStatus(CDCConnectionStatus.LOGGED_IN);
            connectionContext.setCurrentUser(user.get());
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            connectionContext.setStatus(CDCConnectionStatus.LOGGED_IN);
            connectionContext.setCurrentUser(user.get());
```

### UnstableApiUsage
'hashBytes(byte\[\])' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            connectionContext.setStatus(CDCConnectionStatus.LOGGED_IN);
            connectionContext.setCurrentUser(user.get());
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            connectionContext.setStatus(CDCConnectionStatus.LOGGED_IN);
            connectionContext.setCurrentUser(user.get());
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/handler/LoginRequestHandler.java`
#### Snippet
```java
        ServerGreetingResult serverGreetingResult = response.getServerGreetingResult();
        log.info("Server greeting result, server version: {}, protocol version: {}", serverGreetingResult.getServerVersion(), serverGreetingResult.getProtocolVersion());
        String encryptPassword = Hashing.sha256().hashBytes(password.getBytes()).toString().toUpperCase();
        LoginRequestBody loginRequestBody = LoginRequestBody.newBuilder().setType(LoginType.BASIC).setBasicBody(BasicBody.newBuilder().setUsername(username).setPassword(encryptPassword).build())
                .build();
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/handler/LoginRequestHandler.java`
#### Snippet
```java
        ServerGreetingResult serverGreetingResult = response.getServerGreetingResult();
        log.info("Server greeting result, server version: {}, protocol version: {}", serverGreetingResult.getServerVersion(), serverGreetingResult.getProtocolVersion());
        String encryptPassword = Hashing.sha256().hashBytes(password.getBytes()).toString().toUpperCase();
        LoginRequestBody loginRequestBody = LoginRequestBody.newBuilder().setType(LoginType.BASIC).setBasicBody(BasicBody.newBuilder().setUsername(username).setPassword(encryptPassword).build())
                .build();
```

### UnstableApiUsage
'hashBytes(byte\[\])' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/handler/LoginRequestHandler.java`
#### Snippet
```java
        ServerGreetingResult serverGreetingResult = response.getServerGreetingResult();
        log.info("Server greeting result, server version: {}, protocol version: {}", serverGreetingResult.getServerVersion(), serverGreetingResult.getProtocolVersion());
        String encryptPassword = Hashing.sha256().hashBytes(password.getBytes()).toString().toUpperCase();
        LoginRequestBody loginRequestBody = LoginRequestBody.newBuilder().setType(LoginType.BASIC).setBasicBody(BasicBody.newBuilder().setUsername(username).setPassword(encryptPassword).build())
                .build();
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/handler/LoginRequestHandler.java`
#### Snippet
```java
        ServerGreetingResult serverGreetingResult = response.getServerGreetingResult();
        log.info("Server greeting result, server version: {}, protocol version: {}", serverGreetingResult.getServerVersion(), serverGreetingResult.getProtocolVersion());
        String encryptPassword = Hashing.sha256().hashBytes(password.getBytes()).toString().toUpperCase();
        LoginRequestBody loginRequestBody = LoginRequestBody.newBuilder().setType(LoginType.BASIC).setBasicBody(BasicBody.newBuilder().setUsername(username).setPassword(encryptPassword).build())
                .build();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
    private int qps = 50;
    
    private RateLimiter rateLimiter;
    
    @Override
```

### UnstableApiUsage
'acquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            return;
        }
        rateLimiter.acquire(null != data ? data.intValue() : 1);
    }
    
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            qps = Integer.parseInt(qpsValue);
        }
        rateLimiter = RateLimiter.create(qps);
    }
    
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            qps = Integer.parseInt(qpsValue);
        }
        rateLimiter = RateLimiter.create(qps);
    }
    
```

### UnstableApiUsage
'acquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            case DELETE:
            case UPDATE:
                rateLimiter.acquire(null != data ? data.intValue() : 1);
                break;
            default:
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
    private int tps = 2000;
    
    private RateLimiter rateLimiter;
    
    @Override
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            tps = Integer.parseInt(tpsValue);
        }
        rateLimiter = RateLimiter.create(tps);
    }
    
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            tps = Integer.parseInt(tpsValue);
        }
        rateLimiter = RateLimiter.create(tps);
    }
    
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
            rangeSet.add(Range.singleton(value));
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, rangeSet);
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
            rangeSet.add(Range.singleton(value));
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, rangeSet);
    }
    
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN);
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN);
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
```

### UnstableApiUsage
'of(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN);
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

### UnstableApiUsage
'of(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/ParseRexNodeVisitorImpl.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

