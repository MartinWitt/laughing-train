# shardingsphere 
 
# Bad smells
I found 516 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 265 | false |
| InjectedReferences | 51 | false |
| UnstableApiUsage | 37 | false |
| Deprecation | 32 | false |
| UNCHECKED_WARNING | 28 | false |
| DataFlowIssue | 18 | false |
| AutoCloseableResource | 15 | false |
| ConstantValue | 12 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| DeprecatedIsStillUsed | 9 | false |
| RegExpSimplifiable | 7 | false |
| NullableProblems | 7 | false |
| BusyWait | 6 | false |
| RegExpRedundantEscape | 4 | false |
| IgnoreResultOfCall | 3 | false |
| MagicConstant | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| EmptyTryBlock | 1 | false |
| RedundantCast | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| BigDecimalMethodWithoutRoundingCalled | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/connection/DriverDatabaseConnectionManager.java`
#### Snippet
```java
     */
    public Optional<Integer> getTransactionIsolation() throws SQLException {
        return cachedConnections.values().isEmpty() ? Optional.empty() : Optional.of(cachedConnections.values().iterator().next().getTransactionIsolation());
    }
    
```

### AutoCloseableResource
'ResultSet' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
                    metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()), metaDataContexts.getMetaData().getGlobalRuleMetaData(), metaDataContexts.getMetaData().getProps());
            if (useFederation) {
                ResultSet resultSet = executeFederationQuery(queryContext);
                return null != resultSet;
            }
```

### AutoCloseableResource
'PreparedStatement' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            if (statementsCacheable && !statements.isEmpty()) {
                resetParameters();
                return statements.iterator().next().executeQuery();
            }
            clearPrevious();
```

### AutoCloseableResource
'PreparedStatement' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            if (statementsCacheable && !statements.isEmpty()) {
                resetParameters();
                return statements.iterator().next().executeUpdate();
            }
            clearPrevious();
```

### AutoCloseableResource
'PreparedStatement' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            if (statementsCacheable && !statements.isEmpty()) {
                resetParameters();
                return statements.iterator().next().execute();
            }
            clearPrevious();
```

### AutoCloseableResource
'ResultSet' used without 'try'-with-resources statement
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
                    metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()), metaDataContexts.getMetaData().getGlobalRuleMetaData(), metaDataContexts.getMetaData().getProps());
            if (useFederation) {
                ResultSet resultSet = executeFederationQuery(queryContext);
                return null != resultSet;
            }
```

### AutoCloseableResource
'Watcher' used without 'try'-with-resources statement
in `mode/type/cluster/repository/provider/etcd/src/main/java/org/apache/shardingsphere/mode/repository/cluster/etcd/EtcdRepository.java`
#### Snippet
```java
        ByteSequence prefix = ByteSequence.from(key, StandardCharsets.UTF_8);
        Preconditions.checkNotNull(prefix, "prefix should not be null");
        client.getWatchClient().watch(prefix,
                WatchOption.newBuilder().withRange(OptionsUtil.prefixEndOf(prefix)).build(), listener);
    }
```

### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `mode/type/cluster/repository/provider/etcd/src/main/java/org/apache/shardingsphere/mode/repository/cluster/etcd/EtcdRepository.java`
#### Snippet
```java
        buildParentPath(key);
        long leaseId = client.getLeaseClient().grant(etcdProps.getValue(EtcdPropertyKey.TIME_TO_LIVE_SECONDS)).get().getID();
        client.getLeaseClient().keepAlive(leaseId, Observers.observer(response -> {
        }));
        client.getKVClient().put(ByteSequence.from(key, StandardCharsets.UTF_8), ByteSequence.from(value, StandardCharsets.UTF_8), PutOption.newBuilder().withLeaseId(leaseId).build()).get();
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/ProxyDatabaseConnectionManager.java`
#### Snippet
```java
            return;
        }
        String databaseType = connections.iterator().next().getMetaData().getDatabaseProductName();
        List<String> setSQLs = connectionSession.getRequiredSessionVariableRecorder().toSetSQLs(databaseType);
        try {
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/ProxyDatabaseConnectionManager.java`
#### Snippet
```java
        String databaseType;
        try {
            databaseType = values.iterator().next().getMetaData().getDatabaseProductName();
        } catch (final SQLException ex) {
            exceptions.add(ex);
```

### AutoCloseableResource
'ResultScanner' used without 'try'-with-resources statement
in `proxy/backend/type/hbase/src/main/java/org/apache/shardingsphere/proxy/backend/hbase/result/query/HBaseGetResultSet.java`
#### Snippet
```java
        Scan scan = (Scan) hbaseOperation.getOperation();
        scan.setLimit((int) maxLimitResultSize);
        ResultScanner resultScanner = HBaseExecutor.executeQuery(hbaseOperation.getTableName(), table -> table.getScanner(scan));
        rows = resultScanner.iterator();
        setColumnNames(rows);
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `proxy/frontend/type/postgresql/src/main/java/org/apache/shardingsphere/proxy/frontend/postgresql/command/query/extended/describe/PostgreSQLComDescribeExecutor.java`
#### Snippet
```java
        ExecutionUnit executionUnitSample = executionContext.getExecutionUnits().iterator().next();
        ProxyDatabaseConnectionManager databaseConnectionManager = connectionSession.getDatabaseConnectionManager();
        Connection connection = databaseConnectionManager.getConnections(executionUnitSample.getDataSourceName(), 1, ConnectionMode.CONNECTION_STRICTLY).iterator().next();
        try (PreparedStatement actualPreparedStatement = connection.prepareStatement(executionUnitSample.getSqlUnit().getSql())) {
            populateParameterTypes(logicPreparedStatement, actualPreparedStatement);
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `kernel/transaction/type/xa/core/src/main/java/org/apache/shardingsphere/transaction/xa/jta/datasource/XATransactionDataSource.java`
#### Snippet
```java
                @Override
                public void beforeCompletion() {
                    enlistedTransactions.get().remove(transaction);
                }
                
```

### AutoCloseableResource
'IncrementalTask' used without 'try'-with-resources statement
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/api/impl/AbstractInventoryIncrementalJobAPIImpl.java`
#### Snippet
```java
    
    private JobItemIncrementalTasksProgress getIncrementalTasksProgress(final Collection<IncrementalTask> incrementalTasks) {
        return new JobItemIncrementalTasksProgress(incrementalTasks.isEmpty() ? null : incrementalTasks.iterator().next().getTaskProgress());
    }
    
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/OpenGaussWALDumper.java`
#### Snippet
```java
    
    private PgConnection getReplicationConnectionUnwrap() throws SQLException {
        return logicalReplication.createConnection((StandardPipelineDataSourceConfiguration) dumperConfig.getDataSourceConfig()).unwrap(PgConnection.class);
    }
    
```

## RuleId[id=InjectedReferences]
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
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
    UCS2_SPANISH2_CI(142, () -> Charset.forName("ucs2")),
    UCS2_ROMAN_CI(143, () -> Charset.forName("ucs2")),
    UCS2_PERSIAN_CI(144, () -> Charset.forName("ucs2")),
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
    UTF8_GENERAL_CI(33, () -> StandardCharsets.UTF_8),
    CP1250_CZECH_CS(34, () -> Charset.forName("cp1250")),
    UCS2_GENERAL_CI(35, () -> Charset.forName("ucs2")),
    CP866_GENERAL_CI(36, () -> Charset.forName("cp866")),
    KEYBCS2_GENERAL_CI(37, () -> Charset.forName("keybcs2")),
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
    UCS2_ESPERANTO_CI(145, () -> Charset.forName("ucs2")),
    UCS2_HUNGARIAN_CI(146, () -> Charset.forName("ucs2")),
    UCS2_SINHALA_CI(147, () -> Charset.forName("ucs2")),
    UCS2_GERMAN2_CI(148, () -> Charset.forName("ucs2")),
    UCS2_CROATIAN_CI(149, () -> Charset.forName("ucs2")),
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
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
    UCS2_SLOVAK_CI(141, () -> Charset.forName("ucs2")),
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
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
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
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
    UCS2_SPANISH_CI(135, () -> Charset.forName("ucs2")),
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
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
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
    UCS2_POLISH_CI(133, () -> Charset.forName("ucs2")),
    UCS2_ESTONIAN_CI(134, () -> Charset.forName("ucs2")),
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
    UCS2_UNICODE_CI(128, () -> Charset.forName("ucs2")),
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
    UCS2_SLOVENIAN_CI(132, () -> Charset.forName("ucs2")),
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
    UTF16_VIETNAMESE_CI(124, () -> StandardCharsets.UTF_16),
    UCS2_UNICODE_CI(128, () -> Charset.forName("ucs2")),
    UCS2_ICELANDIC_CI(129, () -> Charset.forName("ucs2")),
    UCS2_LATVIAN_CI(130, () -> Charset.forName("ucs2")),
    UCS2_ROMANIAN_CI(131, () -> Charset.forName("ucs2")),
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
    UCS2_SWEDISH_CI(136, () -> Charset.forName("ucs2")),
    UCS2_TURKISH_CI(137, () -> Charset.forName("ucs2")),
    UCS2_CZECH_CI(138, () -> Charset.forName("ucs2")),
    UCS2_DANISH_CI(139, () -> Charset.forName("ucs2")),
    UCS2_LITHUANIAN_CI(140, () -> Charset.forName("ucs2")),
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
    UCS2_UNICODE_520_CI(150, () -> Charset.forName("ucs2")),
    UCS2_VIETNAMESE_CI(151, () -> Charset.forName("ucs2")),
    UCS2_GENERAL_MYSQL500_CI(159, () -> Charset.forName("ucs2")),
    UTF32_UNICODE_CI(160, () -> Charset.forName("utf32")),
    UTF32_ICELANDIC_CI(161, () -> Charset.forName("utf32")),
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/ProxyDatabaseConnectionManager.java`
#### Snippet
```java
        }
        if (null != connectionSession.getIsolationLevel()) {
            connection.setTransactionIsolation(TransactionUtils.getTransactionIsolationLevel(connectionSession.getIsolationLevel()));
        }
    }
```

### MagicConstant
Should be one of: Connection.TRANSACTION_NONE, Connection.TRANSACTION_READ_UNCOMMITTED, ...
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ingest/dumper/InventoryDumper.java`
#### Snippet
```java
        DatabaseType databaseType = dumperConfig.getDataSourceConfig().getDatabaseType();
        if (null != dumperConfig.getTransactionIsolation()) {
            connection.setTransactionIsolation(dumperConfig.getTransactionIsolation());
        }
        try (PreparedStatement preparedStatement = JDBCStreamQueryUtils.generateStreamQueryPreparedStatement(databaseType, connection, buildInventoryDumpSQL())) {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'hasAnyOneToBeDropped(T, R)' as a member of raw type 'org.apache.shardingsphere.distsql.handler.update.RuleDefinitionDropUpdater'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/rule/RuleDefinitionBackendHandler.java`
#### Snippet
```java
    
    private boolean getRefreshStatus(final SQLStatement sqlStatement, final RuleConfiguration currentRuleConfig, final RuleDefinitionUpdater<?, ?> updater) {
        return !(updater instanceof RuleDefinitionDropUpdater) || ((RuleDefinitionDropUpdater) updater).hasAnyOneToBeDropped(sqlStatement, currentRuleConfig);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.distsql.parser.statement.rul.RULStatement' to 'T'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rul/RULBackendHandler.java`
#### Snippet
```java
     */
    public final void init(final RULStatement sqlStatement, final ConnectionSession connectionSession) {
        this.sqlStatement = (T) sqlStatement;
        this.connectionSession = connectionSession;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.shardingsphere.distsql.handler.rul.RULExecutor' to 'org.apache.shardingsphere.distsql.handler.rul.RULExecutor'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rul/SQLRULBackendHandler.java`
#### Snippet
```java
    @Override
    public ResponseHeader execute() {
        RULExecutor<T> executor = TypedSPILoader.getService(RULExecutor.class, getSqlStatement().getClass().getName());
        queryHeaders = createQueryHeader(executor);
        mergedResult = createMergedResult(executor);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/AlterReadwriteSplittingStorageUnitStatusStatementUpdater.java`
#### Snippet
```java
                .map(each -> new RuleExportEngine(each).export(Arrays.asList(ExportableConstants.EXPORT_DYNAMIC_READWRITE_SPLITTING_RULE, ExportableConstants.EXPORT_STATIC_READWRITE_SPLITTING_RULE)))
                .ifPresent(optional -> {
                    result.putAll((Map) optional.getOrDefault(ExportableConstants.EXPORT_DYNAMIC_READWRITE_SPLITTING_RULE, Collections.emptyMap()));
                    result.putAll((Map) optional.getOrDefault(ExportableConstants.EXPORT_STATIC_READWRITE_SPLITTING_RULE, Collections.emptyMap()));
                });
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/updatable/AlterReadwriteSplittingStorageUnitStatusStatementUpdater.java`
#### Snippet
```java
                .ifPresent(optional -> {
                    result.putAll((Map) optional.getOrDefault(ExportableConstants.EXPORT_DYNAMIC_READWRITE_SPLITTING_RULE, Collections.emptyMap()));
                    result.putAll((Map) optional.getOrDefault(ExportableConstants.EXPORT_STATIC_READWRITE_SPLITTING_RULE, Collections.emptyMap()));
                });
        return result;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map\>'
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowStatusFromReadwriteSplittingRulesExecutor.java`
#### Snippet
```java
        Map<String, Object> exportMap = database.getRuleMetaData().findRules(ExportableRule.class).stream()
                .filter(each -> new RuleExportEngine(each).containExportableKey(exportKeys)).findFirst().map(each -> new RuleExportEngine(each).export(exportKeys)).orElse(Collections.emptyMap());
        Map<String, Map<String, String>> allReadwriteRuleMap = exportMap.values().stream().map(each -> ((Map<String, Map<String, String>>) each).entrySet())
                .flatMap(Collection::stream).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, currentValue) -> currentValue, LinkedHashMap::new));
        if (!Strings.isNullOrEmpty(groupName)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'T'
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/row/MemoryEnumerator.java`
#### Snippet
```java
    public boolean moveNext() {
        if (rowDataIterator.hasNext()) {
            current = (T) rowDataIterator.next().getRows().toArray();
            return true;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.keyListWithExpression()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
        IndexNameSegment indexName = new IndexNameSegment(ctx.indexName().start.getStartIndex(), ctx.indexName().stop.getStopIndex(), new IdentifierValue(ctx.indexName().getText()));
        result.setIndex(new IndexSegment(ctx.indexName().start.getStartIndex(), ctx.indexName().stop.getStopIndex(), indexName));
        result.getColumns().addAll(((CollectionValue) visit(ctx.keyListWithExpression())).getValue());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.keyListWithExpression()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.KEY() && null != ctx.PRIMARY()) {
            result.getPrimaryKeyColumns().addAll(((CollectionValue) visit(ctx.keyListWithExpression())).getValue());
            return result;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.keyListWithExpression()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.UNIQUE()) {
            result.getIndexColumns().addAll(((CollectionValue) visit(ctx.keyListWithExpression())).getValue());
            if (null != ctx.indexName()) {
                result.setIndexName((IndexSegment) visit(ctx.indexName()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.keyListWithExpression()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
            return result;
        }
        result.getIndexColumns().addAll(((CollectionValue) visit(ctx.keyListWithExpression())).getValue());
        if (null != ctx.indexName()) {
            result.setIndexName((IndexSegment) visit(ctx.indexName()));
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDALStatementVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.partitionList()) {
            result.getPartitions().addAll(((CollectionValue<PartitionSegment>) visit(ctx.partitionList())).getValue());
        }
        return result;
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDALStatementVisitor.java`
#### Snippet
```java
    public ASTNode visitChecksumTable(final ChecksumTableContext ctx) {
        MySQLChecksumTableStatement result = new MySQLChecksumTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDALStatementVisitor.java`
#### Snippet
```java
            SimpleTableSegment table = (SimpleTableSegment) visit(ctx.tableName());
            PartitionDefinitionSegment segment = new PartitionDefinitionSegment(ctx.tableName().getStart().getStartIndex(), ctx.partitionList().getStop().getStopIndex(), table);
            segment.getPartitions().addAll(((CollectionValue<PartitionSegment>) visit(ctx.partitionList())).getValue());
            result.setPartitionDefinition(segment);
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDALStatementVisitor.java`
#### Snippet
```java
    public ASTNode visitCheckTable(final CheckTableContext ctx) {
        MySQLCheckTableStatement result = new MySQLCheckTableStatement();
        result.getTables().addAll(((CollectionValue<SimpleTableSegment>) visit(ctx.tableList())).getValue());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.createIndexDefinitionClause().tableIndexClause().indexExpressions()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDDLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.createIndexDefinitionClause().tableIndexClause()) {
            result.setTable((SimpleTableSegment) visit(ctx.createIndexDefinitionClause().tableIndexClause().tableName()));
            result.getColumns().addAll(((CollectionValue) visit(ctx.createIndexDefinitionClause().tableIndexClause().indexExpressions())).getValue());
        }
        result.setIndex((IndexSegment) visit(ctx.indexName()));
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDMLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.columnNames()) {
            ColumnNamesContext columnNames = ctx.columnNames();
            CollectionValue<ColumnSegment> columnSegments = (CollectionValue<ColumnSegment>) visit(columnNames);
            result.setInsertColumns(new InsertColumnsSegment(columnNames.start.getStartIndex(), columnNames.stop.getStopIndex(), columnSegments.getValue()));
        } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/type/SQLServerDCLStatementVisitor.java`
#### Snippet
```java
            if (null != ctx.grantClassPrivilegesClause().classPrivileges().columnNames()) {
                for (ColumnNamesContext each : ctx.grantClassPrivilegesClause().classPrivileges().columnNames()) {
                    result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(each)).getValue());
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/type/SQLServerDCLStatementVisitor.java`
#### Snippet
```java
            if (null != ctx.denyClassPrivilegesClause().classPrivileges().columnNames()) {
                for (ColumnNamesContext each : ctx.denyClassPrivilegesClause().classPrivileges().columnNames()) {
                    result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(each)).getValue());
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/type/SQLServerDCLStatementVisitor.java`
#### Snippet
```java
            if (null != ctx.revokeClassPrivilegesClause().classPrivileges().columnNames()) {
                for (ColumnNamesContext each : ctx.revokeClassPrivilegesClause().classPrivileges().columnNames()) {
                    result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(each)).getValue());
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/type/PostgreSQLDMLStatementVisitor.java`
#### Snippet
```java
            result.setTableSegment((SimpleTableSegment) visit(ctx.qualifiedName()));
            if (null != ctx.columnNames()) {
                result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(ctx.columnNames())).getValue());
            }
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/type/PostgreSQLDMLStatementVisitor.java`
#### Snippet
```java
            result.setTableSegment((SimpleTableSegment) visit(ctx.qualifiedName()));
            if (null != ctx.columnNames()) {
                result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(ctx.columnNames())).getValue());
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.columnNamesWithSort()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/type/SQLServerDDLStatementVisitor.java`
#### Snippet
```java
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
        result.setIndex((IndexSegment) visit(ctx.indexName()));
        result.getColumns().addAll(((CollectionValue) visit(ctx.columnNamesWithSort())).getValue());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.shardingsphere.sql.parser.api.ASTNode' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/type/SQLServerDDLStatementVisitor.java`
#### Snippet
```java
        SQLServerCreateTableStatement result = new SQLServerCreateTableStatement();
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
        CollectionValue<CreateDefinitionSegment> createDefinitions = (CollectionValue<CreateDefinitionSegment>) generateCreateDefinitionSegment(ctx.createDefinitionClause().createTableDefinitions());
        for (CreateDefinitionSegment each : createDefinitions.getValue()) {
            if (each instanceof ColumnDefinitionSegment) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.qualifiedNameList()) {
            result.combine((CollectionValue) visit(ctx.qualifiedNameList()));
        }
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.qualifiedNameList()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
    public ASTNode visitDropSequence(final DropSequenceContext ctx) {
        OpenGaussDropSequenceStatement result = new OpenGaussDropSequenceStatement();
        result.setSequenceNames(((CollectionValue) visit(ctx.qualifiedNameList())).getValue());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue' to 'org.apache.shardingsphere.sql.parser.sql.common.value.collection.CollectionValue'
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
        }
        if (null != ctx.qualifiedNameList()) {
            result.combine((CollectionValue) visit(ctx.qualifiedNameList()));
        }
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: '((CollectionValue) visit(ctx.qualifiedNameList()))' has raw type, so result of getValue is erased
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/type/PostgreSQLDDLStatementVisitor.java`
#### Snippet
```java
    public ASTNode visitDropSequence(final DropSequenceContext ctx) {
        PostgreSQLDropSequenceStatement result = new PostgreSQLDropSequenceStatement();
        result.setSequenceNames(((CollectionValue) visit(ctx.qualifiedNameList())).getValue());
        return result;
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'child instanceof FieldLengthContext' covered by subsequent condition 'child instanceof PrecisionContext'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
                result.getValue().add((AddColumnDefinitionSegment) visit(each));
            }
            if (each instanceof AlterConstraintContext || each instanceof AlterCheckContext) {
                result.getValue().add((AlterDefinitionSegment) visit(each));
            }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
            return typeFactory.createSqlType(SqlTypeName.BIGINT);
        }
        if (null != ctx.VARCHAR()) {
            return typeFactory.createSqlType(SqlTypeName.VARCHAR);
        }
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/props/DataSourcePropertiesValidator.java`
#### Snippet
```java
    private void checkFailFast(final DataSource dataSource) throws SQLException {
        // CHECKSTYLE:OFF
        try (Connection ignored = dataSource.getConnection()) {
            // CHECKSTYLE:ON
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
The call to 'assertNull' always fails, according to its method contracts
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/segment/generic/GrantLevelSegmentAssert.java`
#### Snippet
```java
    public static void assertIs(final SQLCaseAssertContext assertContext, final GrantLevelSegment actual, final List<ExpectedSimpleTable> expected) {
        if (null == expected || expected.isEmpty()) {
            assertNull(assertContext.getText("Actual table should not exist."), actual.getTableName());
        } else {
            assertThat(expected.size(), is(1));
```

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
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/api/check/consistency/DataConsistencyCheckResult.java`
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
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/api/check/consistency/DataConsistencyCheckResult.java`
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
        return super.computeSelfCost(planner, mq).multiplyBy((number + 2D) / (table.getRowType().getFieldCount() + 2D));
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
Condition `child instanceof FieldLengthContext` is redundant and can be replaced with a null check
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDCLStatementVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDCLStatementVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDCLStatementVisitor.java`
#### Snippet
```java
        String schemaName = null;
        String tableName;
        if (null != ((GrantLevelTableContext) ctx).tableName().owner()) {
            schemaName = new IdentifierValue(((GrantLevelTableContext) ctx).tableName().owner().getText()).getValue();
        }
```

### DataFlowIssue
Condition `astNode0 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
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
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        }
        ParseTree astNode1 = ctx.getChild(1);
        if (astNode1 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
```

### DataFlowIssue
Condition `astNode0 instanceof LimitClauseContext` is redundant and can be replaced with a null check
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
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
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
        }
        ParseTree astNode1 = ctx.getChild(1);
        if (astNode1 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `TypedSPILoader.getService(...)` to `ParseTreeVisitor` is redundant
in `parser/sql/engine/src/main/java/org/apache/shardingsphere/sql/parser/api/SQLFormatEngine.java`
#### Snippet
```java
    public String format(final String sql, final boolean useCache, final Properties props) {
        ParseTree parseTree = new SQLParserEngine(databaseType, cacheOption).parse(sql, useCache).getRootNode();
        return ((ParseTreeVisitor<String>) TypedSPILoader.getService(SQLFormatVisitor.class, databaseType, props)).visit(parseTree);
    }
}
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'schemaName' is still used
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/api/yaml/YamlJDBCConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    private String schemaName;
    
    private Map<String, Map<String, Object>> dataSources = new HashMap<>();
```

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

### DeprecatedIsStillUsed
Deprecated member 'CompatibleEncryptRuleBuilder' is still used
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rule/builder/CompatibleEncryptRuleBuilder.java`
#### Snippet
```java
 */
@Deprecated
public final class CompatibleEncryptRuleBuilder implements DatabaseRuleBuilder<CompatibleEncryptRuleConfiguration> {
    
    @Override
```

### DeprecatedIsStillUsed
Deprecated member 'CompatibleEncryptRuleConfigurationChecker' is still used
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/checker/CompatibleEncryptRuleConfigurationChecker.java`
#### Snippet
```java
 */
@Deprecated
public final class CompatibleEncryptRuleConfigurationChecker implements RuleConfigurationChecker<CompatibleEncryptRuleConfiguration> {
    
    private final EncryptRuleConfigurationChecker delegate = new EncryptRuleConfigurationChecker();
```

### DeprecatedIsStillUsed
Deprecated member 'YamlCompatibleEncryptRuleConfigurationSwapper' is still used
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/yaml/swapper/YamlCompatibleEncryptRuleConfigurationSwapper.java`
#### Snippet
```java
 */
@Deprecated
public final class YamlCompatibleEncryptRuleConfigurationSwapper implements YamlRuleConfigurationSwapper<YamlCompatibleEncryptRuleConfiguration, CompatibleEncryptRuleConfiguration> {
    
    private final YamlCompatibleEncryptTableRuleConfigurationSwapper tableSwapper = new YamlCompatibleEncryptTableRuleConfigurationSwapper();
```

### DeprecatedIsStillUsed
Deprecated member 'YamlCompatibleEncryptRuleConfiguration' is still used
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/yaml/config/YamlCompatibleEncryptRuleConfiguration.java`
#### Snippet
```java
@Setter
@Deprecated
public final class YamlCompatibleEncryptRuleConfiguration implements YamlRuleConfiguration {
    
    private Map<String, YamlCompatibleEncryptTableRuleConfiguration> tables = new LinkedHashMap<>();
```

### DeprecatedIsStillUsed
Deprecated member 'AlterCompatibleEncryptRuleStatementUpdater' is still used
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/update/AlterCompatibleEncryptRuleStatementUpdater.java`
#### Snippet
```java
 */
@Deprecated
public final class AlterCompatibleEncryptRuleStatementUpdater implements RuleDefinitionAlterUpdater<AlterEncryptRuleStatement, CompatibleEncryptRuleConfiguration> {
    
    private final AlterEncryptRuleStatementUpdater delegate = new AlterEncryptRuleStatementUpdater();
```

### DeprecatedIsStillUsed
Deprecated member 'DropCompatibleEncryptRuleStatementUpdater' is still used
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/update/DropCompatibleEncryptRuleStatementUpdater.java`
#### Snippet
```java
 */
@Deprecated
public final class DropCompatibleEncryptRuleStatementUpdater implements RuleDefinitionDropUpdater<DropEncryptRuleStatement, CompatibleEncryptRuleConfiguration> {
    
    private final DropEncryptRuleStatementUpdater delegate = new DropEncryptRuleStatementUpdater();
```

### DeprecatedIsStillUsed
Deprecated member 'CreateCompatibleEncryptRuleStatementUpdater' is still used
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/update/CreateCompatibleEncryptRuleStatementUpdater.java`
#### Snippet
```java
 */
@Deprecated
public final class CreateCompatibleEncryptRuleStatementUpdater implements RuleDefinitionCreateUpdater<CreateEncryptRuleStatement, CompatibleEncryptRuleConfiguration> {
    
    private final CreateEncryptRuleStatementUpdater delegate = new CreateEncryptRuleStatementUpdater();
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/OracleDataSourceMetaData.java`
#### Snippet
```java
    
    private static final Pattern CONNECT_DESCRIPTOR_URL_PATTERN = Pattern.compile(
            "jdbc:oracle:(thin|oci|kprb):@[(\\w\\s=)]+HOST\\s*=\\s*([\\w\\-\\.]+).*PORT\\s*=\\s*(\\d+).*SERVICE_NAME\\s*=\\s*(\\w+)\\)");
    
    private final String hostname;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/OracleDataSourceMetaData.java`
#### Snippet
```java
    private static final int THIN_MATCH_GROUP_COUNT = 5;
    
    private static final Pattern THIN_URL_PATTERN = Pattern.compile("jdbc:oracle:(thin|oci|kprb):@(//)?([\\w\\-\\.]+):?(\\d*)[:/]([\\w\\-]+)", Pattern.CASE_INSENSITIVE);
    
    private static final Pattern CONNECT_DESCRIPTOR_URL_PATTERN = Pattern.compile(
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/SQLServerDataSourceMetaData.java`
#### Snippet
```java
    private static final int DEFAULT_PORT = 1433;
    
    private static final Pattern URL_PATTERN = Pattern.compile("jdbc:(microsoft:)?sqlserver://([\\w\\-\\.]+):?(\\d*);\\S*(DatabaseName|database)=([\\w\\-\\.]+);?", Pattern.CASE_INSENSITIVE);
    
    private final String hostname;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/SQLServerDataSourceMetaData.java`
#### Snippet
```java
    private static final int DEFAULT_PORT = 1433;
    
    private static final Pattern URL_PATTERN = Pattern.compile("jdbc:(microsoft:)?sqlserver://([\\w\\-\\.]+):?(\\d*);\\S*(DatabaseName|database)=([\\w\\-\\.]+);?", Pattern.CASE_INSENSITIVE);
    
    private final String hostname;
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
                return Long.class;
            case Types.CHAR:
                return String.class;
            case Types.INTEGER:
                return Integer.class;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
                return Double.class;
            case Types.VARCHAR:
                return String.class;
            case Types.DATE:
                return Date.class;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/advisor/executor/type/InstanceMethodAdviceExecutor.java`
#### Snippet
```java
        boolean adviceEnabled = PluginContext.getInstance().isPluginEnabled();
        if (adviceEnabled) {
            adviceBefore(target, method, args);
        }
        Object result = null;
        try {
            result = callable.call();
            // CHECKSTYLE:OFF
        } catch (final Throwable ex) {
            // CHECKSTYLE:ON
            if (adviceEnabled) {
                adviceThrow(target, method, args, ex);
            }
            throw ex;
        } finally {
            if (adviceEnabled) {
                adviceAfter(target, method, args, result);
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/util/AgentReflectionUtils.java`
#### Snippet
```java
        boolean accessible = field.isAccessible();
        if (!accessible) {
            field.setAccessible(true);
        }
        T result = (T) field.get(target);
        if (!accessible) {
            field.setAccessible(false);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/util/AgentReflectionUtils.java`
#### Snippet
```java
        Class<?> currentTargetClass = targetClass;
        while (Object.class != currentTargetClass) {
            try {
                return Optional.of(currentTargetClass.getDeclaredField(fieldName));
            } catch (final NoSuchFieldException ignored) {
                currentTargetClass = currentTargetClass.getSuperclass();
            }
        }
        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `agent/core/src/main/java/org/apache/shardingsphere/agent/core/util/AgentReflectionUtils.java`
#### Snippet
```java
        boolean accessible = method.isAccessible();
        if (!accessible) {
            method.setAccessible(true);
        }
        T result = (T) method.invoke(target, args);
        if (!accessible) {
            method.setAccessible(false);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `agent/plugins/metrics/core/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/core/advice/SQLParseCountAdvice.java`
#### Snippet
```java
        if (sqlStatement instanceof InsertStatement) {
            return Optional.of("INSERT");
        }
        if (sqlStatement instanceof UpdateStatement) {
            return Optional.of("UPDATE");
        }
        if (sqlStatement instanceof DeleteStatement) {
            return Optional.of("DELETE");
        }
        if (sqlStatement instanceof SelectStatement) {
            return Optional.of("SELECT");
        }
```

### DuplicatedCode
Duplicated code
in `agent/plugins/metrics/core/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/core/advice/jdbc/AbstractExecuteLatencyHistogramAdvice.java`
#### Snippet
```java
        Map<String, Object> result = new HashMap<>(4, 1F);
        result.put("type", "exp");
        result.put("start", 1);
        result.put("factor", 2);
        result.put("count", 13);
        return result;
```

### DuplicatedCode
Duplicated code
in `agent/plugins/metrics/core/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/core/exporter/impl/jdbc/JDBCMetaDataInfoExporter.java`
#### Snippet
```java
        Optional<ShardingSphereDriver> shardingSphereDriverOptional = getShardingSphereDriver();
        if (!shardingSphereDriverOptional.isPresent()) {
            return Optional.empty();
        }
        GaugeMetricFamilyMetricsCollector result = MetricsCollectorRegistry.get(config, pluginType);
        result.cleanMetrics();
        DriverDataSourceCache dataSourceCache = AgentReflectionUtils.getFieldValue(shardingSphereDriverOptional.get(), "dataSourceCache");
        Map<String, DataSource> dataSourceMap = AgentReflectionUtils.getFieldValue(dataSourceCache, "dataSourceMap");
```

### DuplicatedCode
Duplicated code
in `agent/plugins/metrics/type/prometheus/src/main/java/org/apache/shardingsphere/agent/plugin/metrics/prometheus/collector/type/PrometheusMetricsHistogramCollector.java`
#### Snippet
```java
            double start = null == buckets.get(START_KEY) ? 1 : Double.parseDouble(buckets.get(START_KEY).toString());
            double factor = null == buckets.get(FACTOR_KEY) ? 1 : Double.parseDouble(buckets.get(FACTOR_KEY).toString());
            int count = null == buckets.get(COUNT_KEY) ? 1 : (int) buckets.get(COUNT_KEY);
```

### DuplicatedCode
Duplicated code
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/codec/OpenGaussPacketCodecEngine.java`
#### Snippet
```java
            if (startupPhase) {
                handleStartupPhase(in, out);
                return;
            }
            int payloadLength = in.getInt(in.readerIndex() + 1);
            if (in.readableBytes() < MESSAGE_TYPE_LENGTH + payloadLength) {
                return;
            }
            byte type = in.getByte(in.readerIndex());
```

### DuplicatedCode
Duplicated code
in `db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/codec/OpenGaussPacketCodecEngine.java`
#### Snippet
```java
        int readerIndex = in.readerIndex();
        if (in.readableBytes() == SSL_REQUEST_PAYLOAD_LENGTH && SSL_REQUEST_PAYLOAD_LENGTH == in.getInt(readerIndex) && SSL_REQUEST_CODE == in.getInt(readerIndex + 4)) {
            out.add(in.readRetainedSlice(SSL_REQUEST_PAYLOAD_LENGTH));
            return;
        }
        if (in.readableBytes() == in.getInt(readerIndex)) {
            out.add(in.readRetainedSlice(in.readableBytes()));
            startupPhase = false;
        }
```

### DuplicatedCode
Duplicated code
in `docs/blog/static/css/theme-black.css`
#### Snippet
```java
.tooltipped:after {
    position: absolute;
    z-index: 1000000;
    display: none;
    padding: 5px 8px;
    font: normal normal 11px/1.5 "Work Sans", "Helvetica", "Tahoma", "Geneva", "Arial", sans-serif;
    color: #fff;
    text-align: center;
    text-decoration: none;
    text-shadow: none;
    text-transform: none;
    letter-spacing: normal;
    word-wrap: break-word;
    white-space: pre;
    pointer-events: none;
    content: attr(aria-label);
    background: rgba(0, 0, 0, 0.8);
    border-radius: 3px;
    -webkit-font-smoothing: subpixel-antialiased;
}
```

### DuplicatedCode
Duplicated code
in `docs/blog/static/css/theme-black.css`
#### Snippet
```java
#body #breadcrumbs {
    height: auto;
    margin-bottom: 0;
    padding-left: 0;
    line-height: 1.4;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    width: 70%;
    display: inline-block;
    float: left;
}
```

### DuplicatedCode
Duplicated code
in `docs/blog/static/css/theme-black.css`
#### Snippet
```java
@media only all and (max-width: 47.938em) {
    #sidebar {
        width: 230px;
        left: -230px;
    }

    #body {
        margin-left: 0;
        width: 100%;
    }

    .sidebar-hidden {
        overflow: hidden;
    }

    .sidebar-hidden #sidebar {
        left: 0;
    }

    .sidebar-hidden #body {
        margin-left: 230px;
        overflow: hidden;
    }

    .sidebar-hidden #overlay {
        position: absolute;
        left: 0;
        right: 0;
        top: 0;
        bottom: 0;
        z-index: 10;
        background: rgba(255, 255, 255, 0.5);
        cursor: pointer;
    }
}
```

### DuplicatedCode
Duplicated code
in `docs/blog/static/css/theme-black.css`
#### Snippet
```java
.copy-to-clipboard {
    background-image: none;
    background-position: 50% 50%;
    background-size: 16px 16px;
    background-repeat: no-repeat;
    width: 27px;
    height: 1.45rem;
    top: -1px;
    display: none;
    vertical-align: middle;
    position: relative;
    color: #5e5e5e;
    background-color: #FFF7DD;
    margin-left: -.2rem;
    cursor: pointer;
    border-radius: 0 2px 2px 0;
    margin-bottom: 1px;
}
```

### DuplicatedCode
Duplicated code
in `docs/blog/static/css/theme-mine.css`
#### Snippet
```java
/* background behind the logo*/
#header {
    background: black;
```

### DuplicatedCode
Duplicated code
in `docs/community/static/css/theme-white.css`
#### Snippet
```java
#sidebar a.padding{
    display: block;
    width: 224px;
    height: 48px;
    border-radius: 8px 8px 8px 8px;
    opacity: 1;
    border: 2px solid #3A49CF;
    text-align: center;
    line-height: 45px;
    color:#3A49CF;
    font-size: 16px;
    margin:24px  auto 0;
    font-weight: bold;
}
```

### DuplicatedCode
Duplicated code
in `docs/community/static/css/theme-white.css`
#### Snippet
```java
@media only all and (max-width: 47.938em) {
    header .wrap{
        padding: 0 20px;
    }
    header .wrap ul{
        padding-left:30px;
    }
    .change-theme span{
        margin:0 7px;
    }
    body #chapter h1 {
        font-size: 2rem;
    }
    #sidebar{
        position: fixed;
        left:-300px;
        width: 300px;
        padding-left: 16px;
        background-color: #fff;
    }

    .sidebar-hidden #body{
        margin-left: 300px;
    }

    #body{
        min-width: 8rem;
    }

    #body-inner{padding-right: 0;}
    #TableOfContents{
        position: static;
        transform: translateX(0);
    }
    .icon-3,.icon-2,.icon-1{display: none;}

    .retro-theme #sidebar{
        background-color: #F2EFDD;
    }
    .eyehelp-theme #sidebar{
        background-color: #C7EBC9;
    }
    .haitian-theme #sidebar{
        background-color: #E5EDFF;
    }
    .deep-theme #sidebar{
        background-color: #15202F;
    }
    .dark-theme #sidebar{
        background-color: #171717;
    }
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/auto-complete.css`
#### Snippet
```java
.autocomplete-suggestions {
    text-align: left;
    cursor: default;
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/hugo-theme.css`
#### Snippet
```java
.btn {
  display: inline-block !important;
  padding: 6px 12px !important;
  margin-bottom: 0 !important;
  font-size: 14px !important;
  font-weight: normal !important;
  line-height: 1.42857143 !important;
  text-align: center !important;
  white-space: nowrap !important;
  vertical-align: middle !important;
  -ms-touch-action: manipulation !important;
      touch-action: manipulation !important;
  cursor: pointer !important;
  -webkit-user-select: none !important;
     -moz-user-select: none !important;
      -ms-user-select: none !important;
          user-select: none !important;
  background-image: none !important;
  border: 1px solid transparent !important;
  border-radius: 4px !important;
  -webkit-transition: all 0.15s !important;
     -moz-transition: all 0.15s !important;
          transition: all 0.15s !important;
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/hugo-theme.css`
#### Snippet
```java
.select-style select {
    padding: 0;
    width: 130%;
    border: none;
    box-shadow: none;
    background: transparent;
    background-image: none;
    -webkit-appearance: none;
    margin: auto;
    margin-left: 0px;
    margin-right: -20px;
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/nucleus.css`
#### Snippet
```java
.grid {
  display: -webkit-box;
  display: -moz-box;
  display: box;
  display: -webkit-flex;
  display: -moz-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-flex-flow: row;
  -moz-flex-flow: row;
  flex-flow: row;
  list-style: none;
  margin: 0;
  padding: 0;
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/nucleus.css`
#### Snippet
```java
@media only all and (min-width: 48em) and (max-width: 59.938em) {
  .size-tablet-1-2 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 50%;
    -moz-flex: 0 50%;
    -ms-flex: 0 50%;
    flex: 0 50%;
  }

  .size-tablet-1-3 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 33.33333%;
    -moz-flex: 0 33.33333%;
    -ms-flex: 0 33.33333%;
    flex: 0 33.33333%;
  }

  .size-tablet-1-4 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 25%;
    -moz-flex: 0 25%;
    -ms-flex: 0 25%;
    flex: 0 25%;
  }

  .size-tablet-1-5 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 20%;
    -moz-flex: 0 20%;
    -ms-flex: 0 20%;
    flex: 0 20%;
  }

  .size-tablet-1-6 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 16.66667%;
    -moz-flex: 0 16.66667%;
    -ms-flex: 0 16.66667%;
    flex: 0 16.66667%;
  }

  .size-tablet-1-7 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 14.28571%;
    -moz-flex: 0 14.28571%;
    -ms-flex: 0 14.28571%;
    flex: 0 14.28571%;
  }

  .size-tablet-1-8 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 12.5%;
    -moz-flex: 0 12.5%;
    -ms-flex: 0 12.5%;
    flex: 0 12.5%;
  }

  .size-tablet-1-9 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 11.11111%;
    -moz-flex: 0 11.11111%;
    -ms-flex: 0 11.11111%;
    flex: 0 11.11111%;
  }

  .size-tablet-1-10 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 10%;
    -moz-flex: 0 10%;
    -ms-flex: 0 10%;
    flex: 0 10%;
  }

  .size-tablet-1-11 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 9.09091%;
    -moz-flex: 0 9.09091%;
    -ms-flex: 0 9.09091%;
    flex: 0 9.09091%;
  }

  .size-tablet-1-12 {
    -webkit-box-flex: 0;
    -moz-box-flex: 0;
    box-flex: 0;
    -webkit-flex: 0 8.33333%;
    -moz-flex: 0 8.33333%;
    -ms-flex: 0 8.33333%;
    flex: 0 8.33333%;
  }
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/nucleus.css`
#### Snippet
```java
@media only all and (max-width: 47.938em) {
  @supports not (flex-wrap: wrap) {
    .grid {
      display: block;
      -webkit-box-lines: inherit;
      -moz-box-lines: inherit;
      box-lines: inherit;
      -webkit-flex-wrap: inherit;
      -moz-flex-wrap: inherit;
      -ms-flex-wrap: inherit;
      flex-wrap: inherit;
    }

    .block {
      display: block;
      -webkit-box-flex: inherit;
      -moz-box-flex: inherit;
      box-flex: inherit;
      -webkit-flex: inherit;
      -moz-flex: inherit;
      -ms-flex: inherit;
      flex: inherit;
    }
  }
}
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/theme-blue.css`
#### Snippet
```java
    --MENU-HEADER-BG-color:#1C90F3; /* Background color of menu header */
    --MENU-HEADER-BORDER-color:#33a1ff; /*Color of menu header border */ 

    --MENU-SEARCH-BG-color:#167ad0; /* Search field background color (by default borders + icons) */
    --MENU-SEARCH-BOX-color: #33a1ff; /* Override search field border color */
    --MENU-SEARCH-BOX-ICONS-color: #a1d2fd; /* Override search field icons color */

    --MENU-SECTIONS-ACTIVE-BG-color:#20272b; /* Background color of the active section and its childs */
    --MENU-SECTIONS-BG-color:#252c31; /* Background color of other sections */
    --MENU-SECTIONS-LINK-color: #ccc; /* Color of links in menu */
    --MENU-SECTIONS-LINK-HOVER-color: #e6e6e6;  /* Color of links in menu, when hovered */
    --MENU-SECTION-ACTIVE-CATEGORY-color: #777; /* Color of active category text */
    --MENU-SECTION-ACTIVE-CATEGORY-BG-color: #fff; /* Color of background for the active category (only) */

    --MENU-VISITED-color: #33a1ff; /* Color of 'page visited' icons in menu */
    --MENU-SECTION-HR-color: #20272b; /* Color of <hr> separator in menu */
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/theme-green.css`
#### Snippet
```java
    --MENU-HEADER-BG-color:#74b559; /* Background color of menu header */
    --MENU-HEADER-BORDER-color:#9cd484; /*Color of menu header border */ 
    
    --MENU-SEARCH-BG-color:#599a3e; /* Search field background color (by default borders + icons) */
    --MENU-SEARCH-BOX-color: #84c767; /* Override search field border color */
    --MENU-SEARCH-BOX-ICONS-color: #c7f7c4; /* Override search field icons color */

    --MENU-SECTIONS-ACTIVE-BG-color:#1b211c; /* Background color of the active section and its childs */
    --MENU-SECTIONS-BG-color:#222723; /* Background color of other sections */
    --MENU-SECTIONS-LINK-color: #ccc; /* Color of links in menu */
    --MENU-SECTIONS-LINK-HOVER-color: #e6e6e6;  /* Color of links in menu, when hovered */
    --MENU-SECTION-ACTIVE-CATEGORY-color: #777; /* Color of active category text */
    --MENU-SECTION-ACTIVE-CATEGORY-BG-color: #fff; /* Color of background for the active category (only) */

    --MENU-VISITED-color: #599a3e; /* Color of 'page visited' icons in menu */
    --MENU-SECTION-HR-color: #18211c; /* Color of <hr> separator in menu */
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/theme-red.css`
#### Snippet
```java
    --MENU-HEADER-BG-color:#dc1010; /* Background color of menu header */
    --MENU-HEADER-BORDER-color:#e23131; /*Color of menu header border */ 

    --MENU-SEARCH-BG-color:#b90000; /* Search field background color (by default borders + icons) */
    --MENU-SEARCH-BOX-color: #ef2020; /* Override search field border color */
    --MENU-SEARCH-BOX-ICONS-color: #fda1a1; /* Override search field icons color */

    --MENU-SECTIONS-ACTIVE-BG-color:#2b2020; /* Background color of the active section and its childs */
    --MENU-SECTIONS-BG-color:#312525; /* Background color of other sections */
    --MENU-SECTIONS-LINK-color: #ccc; /* Color of links in menu */
    --MENU-SECTIONS-LINK-HOVER-color: #e6e6e6;  /* Color of links in menu, when hovered */
    --MENU-SECTION-ACTIVE-CATEGORY-color: #777; /* Color of active category text */
    --MENU-SECTION-ACTIVE-CATEGORY-BG-color: #fff; /* Color of background for the active category (only) */
    
    --MENU-VISITED-color: #ff3333; /* Color of 'page visited' icons in menu */
    --MENU-SECTION-HR-color: #2b2020; /* Color of <hr> separator in menu */
```

### DuplicatedCode
Duplicated code
in `docs/community/themes/hugo-theme-learn/static/css/theme.css`
#### Snippet
```java
.copy-to-clipboard {
    background-image: url(../images/clippy.svg);
    background-position: 50% 50%;
    background-size: 16px 16px;
    background-repeat: no-repeat;
    width: 27px;
    height: 1.45rem;
    top: -1px;
    display: inline-block;
    vertical-align: middle;
    position: relative;
    color: #5e5e5e;
    background-color: #FFF7DD;
    margin-left: -.2rem;
    cursor: pointer;
    border-radius: 0 2px 2px 0;
    margin-bottom: 1px;
}
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/merge/dql/EncryptAlgorithmMetaData.java`
#### Snippet
```java
        Optional<ColumnProjection> columnProjection = findColumnProjection(columnIndex);
        if (!columnProjection.isPresent()) {
            return Optional.empty();
        }
        TablesContext tablesContext = selectStatementContext.getTablesContext();
        String schemaName = tablesContext.getSchemaName().orElseGet(() -> DatabaseTypeEngine.getDefaultSchemaName(selectStatementContext.getDatabaseType(), database.getName()));
        Map<String, String> expressionTableNames = tablesContext.findTableNamesByColumnProjection(
                Collections.singletonList(columnProjection.get()), database.getSchema(schemaName));
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/merge/dql/EncryptAlgorithmMetaData.java`
#### Snippet
```java
        List<Projection> expandProjections = selectStatementContext.getProjectionsContext().getExpandProjections();
        if (expandProjections.size() < columnIndex) {
            return Optional.empty();
        }
        Projection projection = expandProjections.get(columnIndex - 1);
        return projection instanceof ColumnProjection ? Optional.of((ColumnProjection) projection) : Optional.empty();
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/condition/impl/EncryptBinaryCondition.java`
#### Snippet
```java
        List<Object> result = new ArrayList<>(positionValueMap.values());
        for (Entry<Integer, Integer> entry : positionIndexMap.entrySet()) {
            Object param = params.get(entry.getValue());
            if (entry.getKey() < result.size()) {
                result.add(entry.getKey(), param);
            } else {
                result.add(param);
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptAssignmentTokenGenerator.java`
#### Snippet
```java
        EncryptParameterAssignmentToken result = new EncryptParameterAssignmentToken(assignmentSegment.getColumns().get(0).getStartIndex(), assignmentSegment.getStopIndex());
        String columnName = assignmentSegment.getColumns().get(0).getIdentifier().getValue();
        addCipherColumn(tableName, columnName, result);
        addAssistedQueryColumn(tableName, columnName, result);
        addLikeQueryColumn(tableName, columnName, result);
        return result;
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/generator/EncryptAssignmentTokenGenerator.java`
#### Snippet
```java
        Object originalValue = ((LiteralExpressionSegment) assignmentSegment.getValue()).getLiterals();
        Object cipherValue = encryptRule.getEncryptValues(databaseName, schemaName, tableName, assignmentSegment.getColumns().get(0).getIdentifier().getValue(),
                Collections.singletonList(originalValue)).iterator().next();
        token.addAssignment(encryptRule.getCipherColumn(tableName, assignmentSegment.getColumns().get(0).getIdentifier().getValue()), cipherValue);
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/rewrite/token/pojo/EncryptPredicateFunctionRightValueToken.java`
#### Snippet
```java
        for (int i = 0; i < indexValues.size() + paramMarkerIndexes.size(); i++) {
            if (paramMarkerIndexes.contains(i)) {
                result.append('?');
            } else {
                if (indexValues.get(i) instanceof String) {
                    result.append('\'').append(indexValues.get(i)).append('\'');
                } else {
                    result.append(indexValues.get(i));
                }
            }
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length()).append(')');
        return result.toString();
```

### DuplicatedCode
Duplicated code
in `features/encrypt/core/src/main/java/org/apache/shardingsphere/encrypt/yaml/swapper/YamlCompatibleEncryptRuleConfigurationSwapper.java`
#### Snippet
```java
        Map<String, AlgorithmConfiguration> result = new LinkedHashMap<>(yamlConfig.getEncryptors().size(), 1F);
        for (Entry<String, YamlAlgorithmConfiguration> entry : yamlConfig.getEncryptors().entrySet()) {
            result.put(entry.getKey(), algorithmSwapper.swapToObject(entry.getValue()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/update/AlterEncryptRuleStatementUpdater.java`
#### Snippet
```java
        Collection<AlgorithmSegment> encryptors = new LinkedHashSet<>();
        sqlStatement.getRules().forEach(each -> each.getColumns().forEach(column -> {
            encryptors.add(column.getEncryptor());
            encryptors.add(column.getAssistedQueryEncryptor());
            encryptors.add(column.getLikeQueryEncryptor());
        }));
        encryptors.stream().filter(Objects::nonNull).forEach(each -> TypedSPILoader.checkService(EncryptAlgorithm.class, each.getName(), each.getProps()));
```

### DuplicatedCode
Duplicated code
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/update/AlterEncryptRuleStatementUpdater.java`
#### Snippet
```java
        Collection<String> inUsedEncryptors = currentRuleConfig.getTables().stream().flatMap(each -> each.getColumns().stream()).map(optional -> optional.getCipher().getEncryptorName())
                .collect(Collectors.toSet());
        inUsedEncryptors.addAll(currentRuleConfig.getTables().stream().flatMap(each -> each.getColumns().stream())
                .map(optional -> optional.getAssistedQuery().map(EncryptColumnItemRuleConfiguration::getEncryptorName).orElse(""))
                .collect(Collectors.toSet()));
        inUsedEncryptors.addAll(currentRuleConfig.getTables().stream().flatMap(each -> each.getColumns().stream())
                .map(optional -> optional.getLikeQuery().map(EncryptColumnItemRuleConfiguration::getEncryptorName).orElse(""))
                .collect(Collectors.toSet()));
        Collection<String> unusedEncryptors = currentRuleConfig.getEncryptors().keySet().stream().filter(each -> !inUsedEncryptors.contains(each)).collect(Collectors.toSet());
        unusedEncryptors.forEach(each -> currentRuleConfig.getEncryptors().remove(each));
```

### DuplicatedCode
Duplicated code
in `features/encrypt/distsql/parser/src/main/java/org/apache/shardingsphere/encrypt/distsql/parser/core/EncryptDistSQLStatementVisitor.java`
#### Snippet
```java
        Properties result = new Properties();
        if (null == ctx || null == ctx.properties()) {
            return result;
        }
        for (PropertyContext each : ctx.properties().property()) {
            result.setProperty(IdentifierValue.getQuotedContent(each.key.getText()), IdentifierValue.getQuotedContent(each.value.getText()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/replace/LandlineNumberRandomAlgorithm.java`
#### Snippet
```java
        String result = null == plainValue ? null : String.valueOf(plainValue);
        if (Strings.isNullOrEmpty(result)) {
            return result;
        }
        return landLineNumbers.stream().filter(result::startsWith).findFirst().map(each -> createRandValue(result, each)).orElse(result);
```

### DuplicatedCode
Duplicated code
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/replace/LandlineNumberRandomAlgorithm.java`
#### Snippet
```java
        StringBuilder result = new StringBuilder();
        result.append(landLineNumbers.get(random.nextInt(landLineNumbers.size())));
        for (int i = landLineNumber.length(); i < plainValue.length(); i++) {
            result.append(Character.forDigit(random.nextInt(10), 10));
        }
        return result.toString();
```

### DuplicatedCode
Duplicated code
in `features/mask/distsql/handler/src/main/java/org/apache/shardingsphere/mask/distsql/handler/update/AlterMaskRuleStatementUpdater.java`
#### Snippet
```java
        Collection<String> inUsedAlgorithms = currentRuleConfig.getTables().stream().flatMap(each -> each.getColumns().stream()).map(MaskColumnRuleConfiguration::getMaskAlgorithm)
                .collect(Collectors.toSet());
        Collection<String> unusedAlgorithms = currentRuleConfig.getMaskAlgorithms().keySet().stream().filter(each -> !inUsedAlgorithms.contains(each)).collect(Collectors.toSet());
        unusedAlgorithms.forEach(each -> currentRuleConfig.getMaskAlgorithms().remove(each));
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/datetime/AutoIntervalShardingAlgorithm.java`
#### Snippet
```java
        Collection<String> result = new LinkedHashSet<>(availableTargetNames.size(), 1F);
        int firstPartition = getFirstPartition(shardingValue.getValueRange());
        int lastPartition = getLastPartition(shardingValue.getValueRange());
        for (int i = firstPartition; i <= lastPartition; i++) {
            String suffix = String.valueOf(i);
            ShardingAutoTableAlgorithmUtils.findMatchedTargetName(availableTargetNames, suffix, shardingValue.getDataNodeInfo()).ifPresent(result::add);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/groupby/aggregation/AverageAggregationUnit.java`
#### Snippet
```java
        if (null == count) {
            count = BigDecimal.ZERO;
        }
        if (null == sum) {
            sum = BigDecimal.ZERO;
        }
        count = count.add(new BigDecimal(values.get(0).toString()));
        sum = sum.add(new BigDecimal(values.get(1).toString()));
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rule/ShardingRule.java`
#### Snippet
```java
        if (tableRuleConfigs.isEmpty() && autoTableRuleConfigs.isEmpty()) {
            return dataSourceNames;
        }
        if (tableRuleConfigs.stream().map(ShardingTableRuleConfiguration::getActualDataNodes).anyMatch(each -> null == each || each.isEmpty())) {
            return dataSourceNames;
        }
        Collection<String> result = new LinkedHashSet<>();
        tableRuleConfigs.forEach(each -> result.addAll(getDataSourceNames(each)));
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rule/ShardingRule.java`
#### Snippet
```java
        for (String each : sampleTableRule.getActualDataSourceNames()) {
            Collection<String> sampleActualTableNames =
                    sampleTableRule.getActualTableNames(each).stream().map(actualTableName -> actualTableName.replace(sampleTableRule.getTableDataNode().getPrefix(), "")).collect(Collectors.toSet());
            Collection<String> actualTableNames =
                    tableRule.getActualTableNames(each).stream().map(optional -> optional.replace(tableRule.getTableDataNode().getPrefix(), "")).collect(Collectors.toSet());
            if (!sampleActualTableNames.equals(actualTableNames)) {
                return false;
            }
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rule/ShardingRule.java`
#### Snippet
```java
        ShardingAlgorithm shardingAlgorithm = checkedConfig.getShardingAlgorithms().get(shardingStrategyConfig.getShardingAlgorithmName());
        String dataNodePrefix = databaseAlgorithm ? tableRule.getDataSourceDataNode().getPrefix() : tableRule.getTableDataNode().getPrefix();
        String shardingColumn = getShardingColumn(shardingStrategyConfig, checkedConfig.getDefaultShardingColumn());
        return null == shardingAlgorithm ? Optional.empty() : shardingAlgorithm.getAlgorithmStructure(dataNodePrefix, shardingColumn);
```

### DuplicatedCode
Duplicated code
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/rule/ShardingRule.java`
#### Snippet
```java
        String shardingColumn = defaultShardingColumn;
        if (shardingStrategyConfig instanceof ComplexShardingStrategyConfiguration) {
            shardingColumn = ((ComplexShardingStrategyConfiguration) shardingStrategyConfig).getShardingColumns();
        }
        if (shardingStrategyConfig instanceof StandardShardingStrategyConfiguration) {
            shardingColumn = ((StandardShardingStrategyConfiguration) shardingStrategyConfig).getShardingColumn();
        }
        return null == shardingColumn ? "" : shardingColumn;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/checker/ShardingTableRuleStatementChecker.java`
#### Snippet
```java
        Collection<String> result = new LinkedList<>();
        result.addAll(currentRuleConfig.getTables().stream().map(ShardingTableRuleConfiguration::getLogicTable).collect(Collectors.toSet()));
        result.addAll(currentRuleConfig.getAutoTables().stream().map(ShardingAutoTableRuleConfiguration::getLogicTable).collect(Collectors.toSet()));
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowUnusedShardingAlgorithmsExecutor.java`
#### Snippet
```java
        Optional<ShardingRule> rule = database.getRuleMetaData().findSingleRule(ShardingRule.class);
        if (!rule.isPresent()) {
            return Collections.emptyList();
        }
        ShardingRuleConfiguration shardingRuleConfig = (ShardingRuleConfiguration) rule.get().getConfiguration();
        Collection<LocalDataQueryResultRow> result = new LinkedList<>();
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowUnusedShardingAlgorithmsExecutor.java`
#### Snippet
```java
        Collection<String> result = new LinkedHashSet<>();
        shardingRuleConfig.getTables().forEach(each -> {
            if (null != each.getDatabaseShardingStrategy()) {
                result.add(each.getDatabaseShardingStrategy().getShardingAlgorithmName());
            }
            if (null != each.getTableShardingStrategy()) {
                result.add(each.getTableShardingStrategy().getShardingAlgorithmName());
            }
        });
        shardingRuleConfig.getAutoTables().stream().filter(each -> null != each.getShardingStrategy()).forEach(each -> result.add(each.getShardingStrategy().getShardingAlgorithmName()));
        ShardingStrategyConfiguration tableShardingStrategy = shardingRuleConfig.getDefaultTableShardingStrategy();
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowUnusedShardingAuditorsExecutor.java`
#### Snippet
```java
        Collection<String> result = new LinkedHashSet<>();
        shardingRuleConfig.getTables().stream().filter(each -> null != each.getAuditStrategy()).forEach(each -> result.addAll(each.getAuditStrategy().getAuditorNames()));
        shardingRuleConfig.getAutoTables().stream().filter(each -> null != each.getAuditStrategy()).forEach(each -> result.addAll(each.getAuditStrategy().getAuditorNames()));
        ShardingAuditStrategyConfiguration auditStrategy = shardingRuleConfig.getDefaultAuditStrategy();
        if (null != auditStrategy && !auditStrategy.getAuditorNames().isEmpty()) {
            result.addAll(auditStrategy.getAuditorNames());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowUnusedShardingKeyGeneratorExecutor.java`
#### Snippet
```java
        Collection<String> result = new LinkedHashSet<>();
        shardingRuleConfig.getTables().stream().filter(each -> null != each.getKeyGenerateStrategy()).forEach(each -> result.add(each.getKeyGenerateStrategy().getKeyGeneratorName()));
        shardingRuleConfig.getAutoTables().stream().filter(each -> null != each.getKeyGenerateStrategy()).forEach(each -> result.add(each.getKeyGenerateStrategy().getKeyGeneratorName()));
        KeyGenerateStrategyConfiguration keyGenerateStrategy = shardingRuleConfig.getDefaultKeyGenerateStrategy();
        if (null != keyGenerateStrategy && !Strings.isNullOrEmpty(keyGenerateStrategy.getKeyGeneratorName())) {
            result.add(keyGenerateStrategy.getKeyGeneratorName());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/update/AlterDefaultShardingStrategyStatementUpdater.java`
#### Snippet
```java
        ShardingRuleConfiguration result = new ShardingRuleConfiguration();
        if ("none".equalsIgnoreCase(sqlStatement.getStrategyType())) {
            setStrategyConfiguration(result, sqlStatement.getDefaultType(), new NoneShardingStrategyConfiguration());
        } else {
            String shardingAlgorithmName = getShardingAlgorithmName(sqlStatement, result);
            ShardingStrategyConfiguration strategyConfig = ShardingTableRuleStatementConverter.createStrategyConfiguration(
                    sqlStatement.getStrategyType(), sqlStatement.getShardingColumn(), shardingAlgorithmName);
            setStrategyConfiguration(result, sqlStatement.getDefaultType(), strategyConfig);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/update/AlterShardingTableReferenceRuleStatementUpdater.java`
#### Snippet
```java
        Collection<String> result = new HashSet<>();
        result.addAll(currentRuleConfig.getTables().stream().map(ShardingTableRuleConfiguration::getLogicTable).collect(Collectors.toSet()));
        result.addAll(currentRuleConfig.getAutoTables().stream().map(ShardingAutoTableRuleConfiguration::getLogicTable).collect(Collectors.toSet()));
        return result;
```

### DuplicatedCode
Duplicated code
in `features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/update/DropShardingAuditorStatementUpdater.java`
#### Snippet
```java
        if (null == currentRuleConfig && sqlStatement.isIfExists()) {
            return;
        }
        String databaseName = database.getName();
        Collection<String> auditorNames = new LinkedList<>(sqlStatement.getNames());
        checkExist(databaseName, auditorNames, currentRuleConfig, sqlStatement);
        checkInUsed(databaseName, auditorNames, currentRuleConfig);
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/database/metadata/dialect/MariaDBDataSourceMetaData.java`
#### Snippet
```java
        defaultQueryProperties.setProperty("prepStmtCacheSqlLimit", "2048");
        defaultQueryProperties.setProperty("useLocalSessionState", Boolean.TRUE.toString());
        defaultQueryProperties.setProperty("rewriteBatchedStatements", Boolean.TRUE.toString());
        defaultQueryProperties.setProperty("cacheResultSetMetadata", Boolean.FALSE.toString());
        defaultQueryProperties.setProperty("cacheServerConfiguration", Boolean.TRUE.toString());
        defaultQueryProperties.setProperty("elideSetAutoCommits", Boolean.TRUE.toString());
        defaultQueryProperties.setProperty("maintainTimeStats", Boolean.FALSE.toString());
        defaultQueryProperties.setProperty("netTimeoutForStreamingResults", "0");
        defaultQueryProperties.setProperty("tinyInt1isBit", Boolean.FALSE.toString());
        defaultQueryProperties.setProperty("useSSL", Boolean.FALSE.toString());
        defaultQueryProperties.setProperty("serverTimezone", "UTC");
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/H2SchemaMetaDataLoader.java`
#### Snippet
```java
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String indexName = resultSet.getString("INDEX_NAME");
                    String tableName = resultSet.getString("TABLE_NAME");
                    if (!result.containsKey(tableName)) {
                        result.put(tableName, new LinkedList<>());
                    }
                    result.get(tableName).add(new IndexMetaData(indexName));
                }
            }
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/OpenGaussSchemaMetaDataLoader.java`
#### Snippet
```java
        Map<String, Multimap<String, IndexMetaData>> result = new LinkedHashMap<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(getIndexMetaDataSQL(schemaNames)); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String schemaName = resultSet.getString("schemaname");
                String tableName = resultSet.getString("tablename");
                String indexName = resultSet.getString("indexname");
                Multimap<String, IndexMetaData> indexMetaDataMap = result.computeIfAbsent(schemaName, key -> LinkedHashMultimap.create());
                indexMetaDataMap.put(tableName, new IndexMetaData(indexName));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/OpenGaussSchemaMetaDataLoader.java`
#### Snippet
```java
        String schemaNameParam = schemaNames.stream().map(each -> String.format("'%s'", each)).collect(Collectors.joining(","));
        return tables.isEmpty() ? String.format(TABLE_META_DATA_SQL_WITHOUT_TABLES, schemaNameParam)
                : String.format(TABLE_META_DATA_SQL_WITH_TABLES, schemaNameParam, tables.stream().map(each -> String.format("'%s'", each)).collect(Collectors.joining(",")));
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/OpenGaussSchemaMetaDataLoader.java`
#### Snippet
```java
        try (PreparedStatement preparedStatement = connection.prepareStatement(getPrimaryKeyMetaDataSQL(schemaNames)); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String schemaName = resultSet.getString("table_schema");
                String tableName = resultSet.getString("table_name");
                String columnName = resultSet.getString("column_name");
                result.add(schemaName + "," + tableName + "," + columnName);
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `infra/common/src/main/java/org/apache/shardingsphere/infra/metadata/database/schema/loader/metadata/dialect/OpenGaussSchemaMetaDataLoader.java`
#### Snippet
```java
        String schemaName = resultSet.getString("table_schema");
        String tableName = resultSet.getString("table_name");
        String columnName = resultSet.getString("column_name");
        String dataType = resultSet.getString("udt_name");
        boolean isPrimaryKey = primaryKeys.contains(schemaName + "," + tableName + "," + columnName);
        String columnDefault = resultSet.getString("column_default");
        boolean generated = null != columnDefault && columnDefault.startsWith("nextval(");
        // TODO user defined collation which deterministic is false
        boolean caseSensitive = true;
        return new ColumnMetaData(columnName, dataTypeMap.get(dataType), isPrimaryKey, generated, caseSensitive, true, false);
```

### DuplicatedCode
Duplicated code
in `infra/context/src/main/java/org/apache/shardingsphere/infra/connection/refresher/type/table/AlterTableStatementSchemaRefresher.java`
#### Snippet
```java
        ShardingSphereRuleMetaData ruleMetaData = new ShardingSphereRuleMetaData(new LinkedList<>(database.getRuleMetaData().getRules()));
        if (!containsInImmutableDataNodeContainedRule(tableName, database)) {
            ruleMetaData.findRules(MutableDataNodeRule.class).forEach(each -> each.put(logicDataSourceNames.iterator().next(), schemaName, tableName));
        }
        GenericSchemaBuilderMaterial material = new GenericSchemaBuilderMaterial(database.getProtocolType(),
                database.getResourceMetaData().getStorageTypes(), database.getResourceMetaData().getDataSources(), ruleMetaData.getRules(), props, schemaName);
        Map<String, ShardingSphereSchema> schemaMap = GenericSchemaBuilder.build(Collections.singletonList(tableName), material);
        return Optional.ofNullable(schemaMap.get(schemaName)).map(optional -> optional.getTable(tableName))
                .orElseGet(() -> new ShardingSphereTable(tableName, Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));
```

### DuplicatedCode
Duplicated code
in `infra/context/src/main/java/org/apache/shardingsphere/infra/connection/refresher/type/table/CreateTableStatementSchemaRefresher.java`
#### Snippet
```java
        ShardingSphereRuleMetaData ruleMetaData = new ShardingSphereRuleMetaData(new LinkedList<>(database.getRuleMetaData().getRules()));
        if (!containsInImmutableDataNodeContainedRule(tableName, database)) {
            ruleMetaData.findRules(MutableDataNodeRule.class).forEach(each -> each.put(logicDataSourceNames.iterator().next(), schemaName, tableName));
        }
        GenericSchemaBuilderMaterial material = new GenericSchemaBuilderMaterial(database.getProtocolType(),
                database.getResourceMetaData().getStorageTypes(), database.getResourceMetaData().getDataSources(), ruleMetaData.getRules(), props, schemaName);
        Map<String, ShardingSphereSchema> schemaMap = GenericSchemaBuilder.build(Collections.singletonList(tableName), material);
        Optional<ShardingSphereTable> actualTableMetaData = Optional.ofNullable(schemaMap.get(schemaName)).map(optional -> optional.getTable(tableName));
```

### DuplicatedCode
Duplicated code
in `infra/merge/src/main/java/org/apache/shardingsphere/infra/merge/MergeEngine.java`
#### Snippet
```java
        MergedResult result = null;
        for (Entry<ShardingSphereRule, ResultProcessEngine> entry : engines.entrySet()) {
            if (entry.getValue() instanceof ResultDecoratorEngine) {
                ResultDecorator resultDecorator = ((ResultDecoratorEngine) entry.getValue()).newInstance(database, entry.getKey(), props, sqlStatementContext);
                result = null == result ? resultDecorator.decorate(mergedResult, sqlStatementContext, entry.getKey()) : resultDecorator.decorate(result, sqlStatementContext, entry.getKey());
            }
        }
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/api/yaml/YamlShardingSphereDataSourceFactory.java`
#### Snippet
```java
        jdbcConfiguration.getRules().removeIf(YamlGlobalRuleConfiguration.class::isInstance);
        if (null != jdbcConfiguration.getAuthority()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getAuthority());
        }
        if (null != jdbcConfiguration.getTransaction()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getTransaction());
        }
        if (null != jdbcConfiguration.getGlobalClock()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getGlobalClock());
        }
        if (null != jdbcConfiguration.getSqlParser()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getSqlParser());
        }
        if (null != jdbcConfiguration.getSqlTranslator()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getSqlTranslator());
        }
        if (null != jdbcConfiguration.getTraffic()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getTraffic());
        }
        if (null != jdbcConfiguration.getLogging()) {
            jdbcConfiguration.getRules().add(jdbcConfiguration.getLogging());
        }
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/driver/spi/AbsolutePathDriverURLProvider.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            String line;
            while (null != (line = reader.readLine())) {
                if (!line.startsWith("#")) {
                    builder.append(line).append('\n');
                }
            }
            return builder.toString().getBytes(StandardCharsets.UTF_8);
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
        Optional<DataNodeContainedRule> dataNodeContainedRule = getDataNodeContainedRuleForShardingRule(ruleMetaData.findRules(DataNodeContainedRule.class));
        Collection<ColumnContainedRule> columnContainedRules = ruleMetaData.findRules(ColumnContainedRule.class);
        for (String each : sqlStatementContext.getTablesContext().getTableNames()) {
            if ((!dataNodeContainedRule.isPresent() || !dataNodeContainedRule.get().getAllTables().contains(each)) && !containsInColumnContainedRule(each, columnContainedRules)) {
                continue;
            }
            return false;
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
            useFederation = decide(queryContext,
                    metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()), metaDataContexts.getMetaData().getGlobalRuleMetaData(), metaDataContexts.getMetaData().getProps());
            if (useFederation) {
                return executeFederationQuery(queryContext);
            }
            executionContext = createExecutionContext(queryContext);
            List<QueryResult> queryResults = executeQuery0();
            MergedResult mergedResult = mergeQuery(queryResults);
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
        Optional<String> result = connection.getDatabaseConnectionManager().getConnectionContext().getTrafficInstanceId();
        if (!result.isPresent()) {
            result = getInstanceId(queryContext);
        }
        if (connection.isHoldTransaction() && result.isPresent()) {
            connection.getDatabaseConnectionManager().getConnectionContext().setTrafficInstanceId(result.get());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSpherePreparedStatement.java`
#### Snippet
```java
        ConnectionTransaction connectionTransaction = connection.getDatabaseConnectionManager().getConnectionTransaction();
        boolean isInTransaction = connection.getDatabaseConnectionManager().getConnectionContext().getTransactionContext().isInTransaction();
        SQLStatement sqlStatement = executionContext.getSqlStatementContext().getSqlStatement();
        return TransactionType.isDistributedTransaction(connectionTransaction.getTransactionType()) && !isInTransaction && sqlStatement instanceof DMLStatement
                && !(sqlStatement instanceof SelectStatement) && executionContext.getExecutionUnits().size() > 1;
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
        try {
            return executeUpdate0(sql, (actualSQL, statement) -> statement.executeUpdate(actualSQL, autoGeneratedKeys),
                    (statement, actualSQL) -> statement.executeUpdate(actualSQL, autoGeneratedKeys));
            // CHECKSTYLE:OFF
        } catch (final RuntimeException ex) {
            // CHECKSTYLE:ON
            handleExceptionInTransaction(connection, metaDataContexts);
            throw SQLExceptionTransformEngine.toSQLException(ex, metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()).getProtocolType().getType());
        } finally {
            currentResultSet = null;
        }
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
        returnGeneratedKeys = true;
        try {
            return executeUpdate0(sql, (actualSQL, statement) -> statement.executeUpdate(actualSQL, columnIndexes), (statement, actualSQL) -> statement.executeUpdate(actualSQL, columnIndexes));
            // CHECKSTYLE:OFF
        } catch (final RuntimeException ex) {
            // CHECKSTYLE:ON
            handleExceptionInTransaction(connection, metaDataContexts);
            throw SQLExceptionTransformEngine.toSQLException(ex, metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()).getProtocolType().getType());
        } finally {
            currentResultSet = null;
        }
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
        QueryContext queryContext = createQueryContext(sql);
        checkSameDatabaseNameInTransaction(queryContext.getSqlStatementContext(), connection.getDatabaseName());
        trafficInstanceId = getInstanceIdAndSet(queryContext).orElse(null);
        if (null != trafficInstanceId) {
            JDBCExecutionUnit executionUnit = createTrafficExecutionUnit(trafficInstanceId, queryContext);
            return executor.getTrafficExecutor().execute(executionUnit, trafficCallback);
        }
```

### DuplicatedCode
Duplicated code
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/jdbc/core/statement/ShardingSphereStatement.java`
#### Snippet
```java
        try {
            returnGeneratedKeys = true;
            return execute0(sql, (actualSQL, statement) -> statement.execute(actualSQL, columnIndexes), (statement, actualSQL) -> statement.execute(actualSQL, columnIndexes));
            // CHECKSTYLE:OFF
        } catch (final SQLException ex) {
            // CHECKSTYLE:ON
            handleExceptionInTransaction(connection, metaDataContexts);
            throw SQLExceptionTransformEngine.toSQLException(ex, metaDataContexts.getMetaData().getDatabase(connection.getDatabaseName()).getProtocolType().getType());
        }
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/core/prepare/CDCJobPreparer.java`
#### Snippet
```java
        PipelineChannelCreator pipelineChannelCreator = jobItemContext.getJobProcessContext().getPipelineChannelCreator();
        PipelineTableMetaDataLoader sourceMetaDataLoader = jobItemContext.getSourceMetaDataLoader();
        ExecuteEngine incrementalExecuteEngine = jobItemContext.getJobProcessContext().getIncrementalExecuteEngine();
        IncrementalTask incrementalTask = new IncrementalTask(taskConfig.getImporterConfig().getConcurrency(), taskConfig.getDumperConfig(), taskConfig.getImporterConfig(),
                pipelineChannelCreator, jobItemContext.getImporterConnector(), sourceMetaDataLoader, incrementalExecuteEngine, jobItemContext);
        jobItemContext.getIncrementalTasks().add(incrementalTask);
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
        switch (rowEventType) {
            case IngestDataChangeType.INSERT:
                result = readWriteRowEvent(mppTableData);
                break;
            case IngestDataChangeType.UPDATE:
                result = readUpdateRowEvent(mppTableData);
                break;
            case IngestDataChangeType.DELETE:
                result = readDeleteRowEvent(mppTableData);
                break;
            default:
                throw new IngestException("Unknown rowEventType: " + rowEventType);
        }
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
        int dataLength = hexString.length();
        Preconditions.checkArgument(0 == (dataLength & 1), "Illegal hex data `%s`", hexString);
        if (0 == dataLength) {
            return new byte[0];
        }
        byte[] result = new byte[dataLength >>> 1];
        for (int i = 0; i < dataLength; i += 2) {
            result[i >>> 1] = decodeHexByte(hexString, i);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPlugin.java`
#### Snippet
```java
        int firstHexChar = Character.digit(hexString.charAt(index), 16);
        int secondHexChar = Character.digit(hexString.charAt(index + 1), 16);
        Preconditions.checkArgument(-1 != firstHexChar && -1 != secondHexChar, "Illegal hex byte `%s` in index `%d`", hexString, index);
        return (byte) ((firstHexChar << 4) + secondHexChar);
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/sqlbuilder/OpenGaussPipelineSQLBuilder.java`
#### Snippet
```java
        for (int i = 0; i < dataRecord.getColumnCount(); i++) {
            Column column = dataRecord.getColumn(i);
            if (column.isUniqueKey()) {
                continue;
            }
            result.append(quote(column.getName())).append("=EXCLUDED.").append(quote(column.getName())).append(',');
        }
        result.setLength(result.length() - 1);
        return result.toString();
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/distsql/parser/src/main/java/org/apache/shardingsphere/migration/distsql/parser/core/MigrationDistSQLStatementVisitor.java`
#### Snippet
```java
        String user = getIdentifierValue(ctx.user());
        String password = null == ctx.password() ? "" : getPassword(ctx.password());
        Properties props = getProperties(ctx.propertiesDefinition());
        return null != ctx.urlSource() ? new URLBasedDataSourceSegment(getIdentifierValue(ctx.storageUnitName()),
                getIdentifierValue(ctx.urlSource().url()), user, password, props)
                : new HostnameAndPortBasedDataSourceSegment(getIdentifierValue(ctx.storageUnitName()),
                        getIdentifierValue(ctx.simpleSource().hostname()), ctx.simpleSource().port().getText(), getIdentifierValue(ctx.simpleSource().dbName()), user, password, props);
```

### DuplicatedCode
Duplicated code
in `kernel/data-pipeline/scenario/consistencycheck/src/main/java/org/apache/shardingsphere/data/pipeline/scenario/consistencycheck/api/impl/ConsistencyCheckJobAPI.java`
#### Snippet
```java
        GovernanceRepositoryAPI governanceRepositoryAPI = PipelineAPIFactory.getGovernanceRepositoryAPI(PipelineJobIdUtils.parseContextKey(parentJobId));
        Optional<String> latestCheckJobId = governanceRepositoryAPI.getLatestCheckJobId(parentJobId);
        ShardingSpherePreconditions.checkState(latestCheckJobId.isPresent(), () -> new ConsistencyCheckJobNotFoundException(parentJobId));
        String checkJobId = latestCheckJobId.get();
        Optional<ConsistencyCheckJobItemProgress> progressOptional = getJobItemProgress(checkJobId, 0);
```

### DuplicatedCode
Duplicated code
in `kernel/metadata/core/src/main/java/org/apache/shardingsphere/metadata/factory/InternalMetaDataFactory.java`
#### Snippet
```java
        Map<String, ShardingSphereDatabase> result = new ConcurrentHashMap<>(databaseConfigMap.size(), 1F);
        for (Entry<String, DatabaseConfiguration> entry : databaseConfigMap.entrySet()) {
            String databaseName = entry.getKey();
            if (entry.getValue().getDataSources().isEmpty()) {
                result.put(databaseName.toLowerCase(), ShardingSphereDatabase.create(databaseName, protocolType));
            } else {
                result.put(databaseName.toLowerCase(), create(databaseName, persistService, entry.getValue(), props, instanceContext));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/metadata/core/src/main/java/org/apache/shardingsphere/metadata/persist/MetaDataPersistService.java`
#### Snippet
```java
        Map<String, DataSourceProperties> dataSourcePropertiesMap = getDataSourcePropertiesMap(databaseConfigs.getDataSources());
        if (dataSourcePropertiesMap.isEmpty() && databaseConfigs.getRuleConfigurations().isEmpty()) {
            databaseMetaDataService.addDatabase(databaseName);
        } else {
            dataSourceService.persist(databaseName, getDataSourcePropertiesMap(databaseConfigs.getDataSources()));
            databaseRulePersistService.persist(databaseName, dataSources, rules, databaseConfigs.getRuleConfigurations());
        }
```

### DuplicatedCode
Duplicated code
in `kernel/metadata/core/src/main/java/org/apache/shardingsphere/metadata/persist/MetaDataPersistService.java`
#### Snippet
```java
        Map<String, DataSourceProperties> result = new LinkedHashMap<>(dataSourceMap.size(), 1F);
        for (Entry<String, DataSource> entry : dataSourceMap.entrySet()) {
            result.put(entry.getKey(), DataSourcePropertiesCreator.create(entry.getValue()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/metadata/core/src/main/java/org/apache/shardingsphere/metadata/persist/MetaDataPersistService.java`
#### Snippet
```java
        Map<String, DataSource> result = new LinkedHashMap<>(persistedDataSourcePropsMap.size(), 1F);
        for (Entry<String, DataSourceProperties> entry : persistedDataSourcePropsMap.entrySet()) {
            String dataSourceName = entry.getKey();
            DataSourceProperties persistedDataSourceProps = entry.getValue();
            DataSource localConfiguredDataSource = localConfiguredDataSources.get(dataSourceName);
            if (null == localConfiguredDataSource) {
                result.put(dataSourceName, DataSourcePoolCreator.create(persistedDataSourceProps));
            } else if (DataSourcePropertiesCreator.create(localConfiguredDataSource).equals(persistedDataSourceProps)) {
                result.put(dataSourceName, localConfiguredDataSource);
            } else {
                result.put(dataSourceName, DataSourcePoolCreator.create(persistedDataSourceProps));
                new DataSourcePoolDestroyer(localConfiguredDataSource).asyncDestroy();
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/single/core/src/main/java/org/apache/shardingsphere/single/decider/SingleSQLFederationDecider.java`
#### Snippet
```java
        Collection<QualifiedTable> result = new LinkedList<>();
        String schemaName = DatabaseTypeEngine.getDefaultSchemaName(databaseType, database.getName());
        for (SimpleTableSegment each : tableSegments) {
            String actualSchemaName = each.getOwner().map(optional -> optional.getIdentifier().getValue()).orElse(schemaName);
            result.add(new QualifiedTable(actualSchemaName, each.getTableName().getIdentifier().getValue()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        SQLFederationExecutorContext federationContext = executorContext.getFederationContext();
        QueryContext queryContext = createQueryContext(federationContext.getMetaData(), sqlString, databaseType, federationContext.getQueryContext().isUseCache());
        ShardingSphereDatabase database = federationContext.getMetaData().getDatabase(databaseName);
        // TODO need to get session context
        ExecutionContext context = new KernelProcessor().generateExecutionContext(queryContext, database, globalRuleMetaData, executorContext.getProps(), new ConnectionContext());
        if (federationContext.isPreview()) {
            federationContext.getExecutionUnits().addAll(context.getExecutionUnits());
            return createEmptyEnumerable();
        }
        return execute(databaseType, queryContext, database, context);
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        try {
            ExecutionGroupContext<JDBCExecutionUnit> executionGroupContext =
                    prepareEngine.prepare(context.getRouteContext(), context.getExecutionUnits(), new ExecutionGroupReportContext(database.getName()));
            setParameters(executionGroupContext.getInputGroups());
            processEngine.executeSQL(executionGroupContext, context.getQueryContext());
            List<QueryResult> queryResults = execute(executionGroupContext, databaseType);
            // TODO need to get session context
            MergeEngine mergeEngine = new MergeEngine(database, executorContext.getProps(), new ConnectionContext());
            MergedResult mergedResult = mergeEngine.merge(queryResults, queryContext.getSqlStatementContext());
            Collection<Statement> statements = getStatements(executionGroupContext.getInputGroups());
            return createEnumerable(mergedResult, queryResults.get(0).getMetaData(), statements);
        } catch (final SQLException ex) {
            throw new SQLWrapperException(ex);
        } finally {
            processEngine.completeSQLExecution();
        }
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/TranslatableTableScanExecutor.java`
#### Snippet
```java
            ExecutionGroupContext<JDBCExecutionUnit> executionGroupContext =
                    prepareEngine.prepare(context.getRouteContext(), context.getExecutionUnits(), new ExecutionGroupReportContext(database.getName()));
            setParameters(executionGroupContext.getInputGroups());
            processEngine.executeSQL(executionGroupContext, context.getQueryContext());
            List<QueryResult> queryResults = execute(executionGroupContext, databaseType);
            MergeEngine mergeEngine = new MergeEngine(database, executorContext.getProps(), new ConnectionContext());
            MergedResult mergedResult = mergeEngine.merge(queryResults, queryContext.getSqlStatementContext());
            Collection<Statement> statements = getStatements(executionGroupContext.getInputGroups());
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        Collection<QueryResult> queryResults = jdbcExecutor.execute(executionGroupContext, callback).stream().map(QueryResult.class::cast).collect(Collectors.toList());
        List<QueryResult> result = new LinkedList<>();
        for (QueryResult each : queryResults) {
            QueryResult queryResult = each instanceof JDBCStreamQueryResult
                    ? new JDBCMemoryQueryResult(((JDBCStreamQueryResult) each).getResultSet(), databaseType)
                    : each;
            result.add(queryResult);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        Optional<ShardingSphereTableData> tableData = Optional.ofNullable(data.getDatabaseData().get(databaseName)).map(optional -> optional.getSchemaData().get(schemaName))
                .map(ShardingSphereSchemaData::getTableData).map(shardingSphereData -> shardingSphereData.get(table.getName()));
        return tableData.map(this::createMemoryEnumerator).orElseGet(this::createEmptyEnumerable);
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        String databaseName = executorContext.getDatabaseName();
        String schemaName = executorContext.getSchemaName();
        CalciteConnectionConfig connectionConfig = new CalciteConnectionConfigImpl(optimizerContext.getParserContext(databaseName).getDialectProps());
        ShardingSphereDatabase database = executorContext.getFederationContext().getMetaData().getDatabase(databaseName);
        CalciteCatalogReader catalogReader = SQLFederationPlannerUtils.createCatalogReader(schemaName,
                new FilterableSchema(schemaName, database.getSchema(schemaName), database.getProtocolType(), JAVA_TYPE_FACTORY, null), JAVA_TYPE_FACTORY, connectionConfig);
        RelOptCluster relOptCluster = RelOptCluster.create(SQLFederationPlannerUtils.createVolcanoPlanner(), new RexBuilder(JAVA_TYPE_FACTORY));
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        Collection<Object[]> result = new LinkedList<>();
        while (mergedResult.next()) {
            Object[] currentRow = new Object[metaData.getColumnCount()];
            for (int i = 0; i < metaData.getColumnCount(); i++) {
                currentRow[i] = mergedResult.getValue(i + 1, Object.class);
            }
            result.add(currentRow);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        String sql = sqlString.getSql().replace("\n", " ");
        SQLStatement sqlStatement = new SQLStatementParserEngine(databaseType.getType(),
                optimizerContext.getSqlParserRule().getSqlStatementCache(), optimizerContext.getSqlParserRule().getParseTreeCache(),
                optimizerContext.getSqlParserRule().isSqlCommentParseEnabled()).parse(sql, useCache);
        List<Object> params = getParameters(sqlString.getDynamicParameters());
        SQLStatementContext sqlStatementContext = SQLStatementContextFactory.newInstance(metaData, params, sqlStatement, executorContext.getDatabaseName());
        return new QueryContext(sqlStatementContext, sql, params, new HintValueContext(), useCache);
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/FilterableTableScanExecutor.java`
#### Snippet
```java
        if (null == paramIndexes) {
            return Collections.emptyList();
        }
        List<Object> result = new ArrayList<>();
        for (Integer each : paramIndexes) {
            result.add(executorContext.getFederationContext().getQueryContext().getParameters().get(each));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/executor/core/src/main/java/org/apache/shardingsphere/sqlfederation/executor/TranslatableTableScanExecutor.java`
#### Snippet
```java
        SqlString sqlString = createSQLString(table, (TranslatableScanNodeExecutorContext) scanContext, SQLDialectFactory.getSQLDialect(databaseType.getType()));
        SQLFederationExecutorContext federationContext = executorContext.getFederationContext();
        QueryContext queryContext = createQueryContext(federationContext.getMetaData(), sqlString, databaseType, federationContext.getQueryContext().isUseCache());
        ShardingSphereDatabase database = federationContext.getMetaData().getDatabase(databaseName);
        ExecutionContext context = new KernelProcessor().generateExecutionContext(queryContext, database, globalRuleMetaData, executorContext.getProps(), new ConnectionContext());
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/context/parser/dialect/impl/MariaDBOptimizerBuilder.java`
#### Snippet
```java
        Properties result = new Properties();
        result.setProperty(CalciteConnectionProperty.LEX.camelName(), Lex.MYSQL.name());
        result.setProperty(CalciteConnectionProperty.CONFORMANCE.camelName(), SqlConformanceEnum.MYSQL_5.name());
        result.setProperty(CalciteConnectionProperty.FUN.camelName(), SqlLibrary.MYSQL.fun);
        result.setProperty(CalciteConnectionProperty.CASE_SENSITIVE.camelName(), String.valueOf(Lex.MYSQL.caseSensitive));
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/context/parser/dialect/impl/OpenGaussOptimizerBuilder.java`
#### Snippet
```java
        Properties result = new Properties();
        result.setProperty(CalciteConnectionProperty.LEX.camelName(), Lex.JAVA.name());
        result.setProperty(CalciteConnectionProperty.CONFORMANCE.camelName(), SqlConformanceEnum.BABEL.name());
        result.setProperty(CalciteConnectionProperty.FUN.camelName(), SqlLibrary.POSTGRESQL.fun);
        result.setProperty(CalciteConnectionProperty.CASE_SENSITIVE.camelName(), String.valueOf(Lex.JAVA.caseSensitive));
        return result;
```

### DuplicatedCode
Duplicated code
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableFilterRule.java`
#### Snippet
```java
        RexCall condition = (RexCall) filter.getCondition();
        for (RexNode each : condition.getOperands()) {
            if (CONDITION_PATTERN.matcher(each.toString()).find()
                    || CONDITION_FUNCTION_PATTERN.matcher(each.toString()).find()
                    || CONDITION_COMPLEX_PATTERN.matcher(each.toString()).find()) {
                return false;
            }
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `kernel/traffic/distsql/parser/src/main/java/org/apache/shardingsphere/traffic/distsql/parser/core/TrafficDistSQLStatementVisitor.java`
#### Snippet
```java
        Properties result = new Properties();
        if (null == ctx) {
            return result;
        }
        for (PropertyContext each : ctx.properties().property()) {
            result.setProperty(IdentifierValue.getQuotedContent(each.key.getText()), IdentifierValue.getQuotedContent(each.value.getText()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
        boolean databaseMetaDataExisted = databaseMetaDataExisted(persistService);
        Map<String, DatabaseConfiguration> effectiveDatabaseConfigs = getDatabaseConfigurations(databaseMetaDataExisted,
                getDatabaseNames(instanceContext, param.getDatabaseConfigs(), persistService), param.getDatabaseConfigs(), persistService);
        checkDataSourceStates(effectiveDatabaseConfigs, storageNodes, param.isForce());
        Collection<RuleConfiguration> globalRuleConfigs = getGlobalRuleConfigs(databaseMetaDataExisted, persistService, param.getGlobalRuleConfigs());
        ConfigurationProperties props = getConfigurationProperties(databaseMetaDataExisted, persistService, param.getProps());
        Map<String, ShardingSphereDatabase> databases = getDatabases(databaseMetaDataExisted, persistService, effectiveDatabaseConfigs, props, instanceContext);
        ShardingSphereRuleMetaData globalMetaData = new ShardingSphereRuleMetaData(GlobalRulesBuilder.buildRules(globalRuleConfigs, databases, props));
        MetaDataContexts result = new MetaDataContexts(persistService, new ShardingSphereMetaData(databases, globalMetaData, props));
        persistDatabaseConfigurations(databaseMetaDataExisted, param, result);
        persistMetaData(databaseMetaDataExisted, result);
        return result;
```

### DuplicatedCode
Duplicated code
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
        Map<String, DataSourceState> result = new HashMap<>(storageDataSourceStates.size(), 1F);
        storageDataSourceStates.forEach((key, value) -> {
            List<String> values = Splitter.on(".").splitToList(key);
            Preconditions.checkArgument(3 == values.size(), "Illegal data source of storage node.");
            String databaseName = values.get(0);
            String dataSourceName = values.get(2);
            result.put(databaseName + "." + dataSourceName, DataSourceState.valueOf(value.getStatus().name()));
        });
        return result;
```

### DuplicatedCode
Duplicated code
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
        metadataContexts.getPersistService().persistGlobalRuleConfiguration(param.getGlobalRuleConfigs(), param.getProps());
        for (Entry<String, ? extends DatabaseConfiguration> entry : param.getDatabaseConfigs().entrySet()) {
            String databaseName = entry.getKey();
            metadataContexts.getPersistService().persistConfigurations(entry.getKey(), entry.getValue(),
                    metadataContexts.getMetaData().getDatabase(databaseName).getResourceMetaData().getDataSources(),
                    metadataContexts.getMetaData().getDatabase(databaseName).getRuleMetaData().getRules());
        }
```

### DuplicatedCode
Duplicated code
in `mode/core/src/main/java/org/apache/shardingsphere/mode/metadata/MetaDataContextsFactory.java`
#### Snippet
```java
        if (!databaseMetaDataExisted) {
            metaDataContexts.getMetaData().getDatabases().values().forEach(each -> each.getSchemas()
                    .forEach((schemaName, schema) -> metaDataContexts.getPersistService().getDatabaseMetaDataService().persist(each.getName(), schemaName, schema)));
            metaDataContexts.getShardingSphereData().getDatabaseData().forEach((databaseName, databaseData) -> databaseData.getSchemaData().forEach((schemaName, schemaData) -> metaDataContexts
                    .getPersistService().getShardingSphereDataPersistService().persist(databaseName, schemaName, schemaData, metaDataContexts.getMetaData().getDatabases())));
        }
```

### DuplicatedCode
Duplicated code
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/ClusterContextManagerBuilder.java`
#### Snippet
```java
        ClusterPersistRepository repository = getClusterPersistRepository((ClusterPersistRepositoryConfiguration) param.getModeConfiguration().getRepository());
        RegistryCenter registryCenter = new RegistryCenter(repository, new EventBusContext(), param.getInstanceMetaData(), param.getDatabaseConfigs());
        InstanceContext instanceContext = buildInstanceContext(registryCenter, param);
        if (registryCenter.getRepository() instanceof InstanceContextAware) {
            ((InstanceContextAware) registryCenter.getRepository()).setInstanceContext(instanceContext);
        }
```

### DuplicatedCode
Duplicated code
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/ClusterModeContextManager.java`
#### Snippet
```java
        DatabaseMetaDataBasedPersistService databaseMetaDataService = contextManager.getMetaDataContexts().getPersistService().getDatabaseMetaDataService();
        databaseMetaDataService.getTableMetaDataPersistService().persist(databaseName, schemaName, tables);
        databaseMetaDataService.getViewMetaDataPersistService().persist(databaseName, schemaName, views);
        alterSchemaMetaDataPOJO.getDroppedTables().forEach(each -> databaseMetaDataService.getTableMetaDataPersistService().delete(databaseName, schemaName, each));
        alterSchemaMetaDataPOJO.getDroppedViews().forEach(each -> databaseMetaDataService.getViewMetaDataPersistService().delete(databaseName, schemaName, each));
```

### DuplicatedCode
Duplicated code
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/subscriber/ConfigurationChangedSubscriber.java`
#### Snippet
```java
        for (Entry<String, Collection<String>> entry : rule.getDataSourceMapper().entrySet()) {
            if (!database.getGroupName().equals(entry.getKey())) {
                continue;
            }
            entry.getValue().forEach(each -> rule.updateStatus(new StorageNodeDataSourceChangedEvent(database, storageNodeDataSource)));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.hexadecimalLiterals()) {
            return visit(ctx.hexadecimalLiterals());
        }
        if (null != ctx.bitValueLiterals()) {
            return visit(ctx.bitValueLiterals());
        }
        if (null != ctx.booleanLiterals()) {
            return visit(ctx.booleanLiterals());
        }
        if (null != ctx.nullValueLiterals()) {
            return visit(ctx.nullValueLiterals());
        }
        throw new IllegalStateException("Literals must have string, number, dateTime, hex, bit, boolean or null.");
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.andOperator()) {
            return createBinaryOperationExpression(ctx, ctx.andOperator().getText());
        }
        if (null != ctx.orOperator()) {
            return createBinaryOperationExpression(ctx, ctx.orOperator().getText());
        }
        return new NotExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), (ExpressionSegment) visit(ctx.expr(0)));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.expr(0));
        ExpressionSegment right = (ExpressionSegment) visit(ctx.expr(1));
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.IS()) {
            // TODO optimize operatorToken
            String rightText = "";
            if (null != ctx.NOT()) {
                rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(),
                        ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
            }
            Token operatorToken = null;
            if (null != ctx.NULL()) {
                operatorToken = ctx.NULL().getSymbol();
            }
            if (null != ctx.TRUE()) {
                operatorToken = ctx.TRUE().getSymbol();
            }
            if (null != ctx.FALSE()) {
                operatorToken = ctx.FALSE().getSymbol();
            }
            int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
            ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
            ExpressionSegment left = (ExpressionSegment) visit(ctx.booleanPrimary());
            String operator = "IS";
            return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
        }
        if (null != ctx.comparisonOperator() || null != ctx.SAFE_EQ_()) {
            return createCompareSegment(ctx);
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        String rightText = "";
        if (null != ctx.NOT()) {
            rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(ctx.NOT().getSymbol().getStartIndex(), ctx.NOT().getSymbol().getStopIndex()))).concat(" ");
        }
        Token operatorToken = null;
        if (null != ctx.NULL()) {
            operatorToken = ctx.NULL().getSymbol();
        }
        if (null != ctx.TRUE()) {
            operatorToken = ctx.TRUE().getSymbol();
        }
        if (null != ctx.FALSE()) {
            operatorToken = ctx.FALSE().getSymbol();
        }
        int startIndex = null == operatorToken ? ctx.IS().getSymbol().getStopIndex() + 2 : operatorToken.getStartIndex();
        rightText = rightText.concat(ctx.start.getInputStream().getText(new Interval(startIndex, ctx.stop.getStopIndex())));
        ExpressionSegment right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        ExpressionSegment left = (ExpressionSegment) visit(ctx.booleanPrimary());
        String operator = "IS";
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.bitExpr(0));
        ExpressionSegment between = (ExpressionSegment) visit(ctx.bitExpr(1));
        ExpressionSegment and = (ExpressionSegment) visit(ctx.predicate());
        boolean not = null != ctx.NOT();
        return new BetweenExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, between, and, not);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.getChild(0));
        ExpressionSegment right = (ExpressionSegment) visit(ctx.getChild(2));
        String operator = ctx.getChild(1).getText();
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.parameterMarker()) {
            ParameterMarkerValue parameterMarker = (ParameterMarkerValue) visit(ctx.parameterMarker());
            ParameterMarkerExpressionSegment segment = new ParameterMarkerExpressionSegment(startIndex, stopIndex, parameterMarker.getValue(), parameterMarker.getType());
            parameterMarkerSegments.add(segment);
            return segment;
        }
        if (null != ctx.literals()) {
            return SQLUtils.createLiteralExpression(visit(ctx.literals()), startIndex, stopIndex, ctx.literals().start.getInputStream().getText(new Interval(startIndex, stopIndex)));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.whereClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereClause()));
        }
        if (null != ctx.groupByClause()) {
            result.setGroupBy((GroupBySegment) visit(ctx.groupByClause()));
        }
        if (null != ctx.havingClause()) {
            result.setHaving((HavingSegment) visit(ctx.havingClause()));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.aggregationFunction()) {
            return visit(ctx.aggregationFunction());
        }
        if (null != ctx.specialFunction()) {
            return visit(ctx.specialFunction());
        }
        if (null != ctx.regularFunction()) {
            return visit(ctx.regularFunction());
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        AggregationType type = AggregationType.valueOf(aggregationType.toUpperCase());
        String innerExpression = ctx.start.getInputStream().getText(new Interval(ctx.LP_().getSymbol().getStartIndex(), ctx.stop.getStopIndex()));
        if (null != ctx.distinct()) {
            AggregationDistinctProjectionSegment result = new AggregationDistinctProjectionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                    type, innerExpression, getDistinctExpression(ctx));
            result.getParameters().addAll(getExpressions(ctx));
            return result;
        }
        AggregationProjectionSegment result = new AggregationProjectionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), type, innerExpression);
        result.getParameters().addAll(getExpressions(ctx));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null == ctx.expr()) {
            return Collections.emptyList();
        }
        Collection<ExpressionSegment> result = new LinkedList<>();
        for (ExprContext each : ctx.expr()) {
            result.add((ExpressionSegment) visit(each));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        result.setStartIndex(ctx.start.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        if (null != ctx.fieldLength()) {
            DataTypeLengthSegment dataTypeLengthSegment = (DataTypeLengthSegment) visit(ctx.fieldLength());
            result.setDataLength(dataTypeLengthSegment);
        }
        if (null != ctx.precision()) {
            DataTypeLengthSegment dataTypeLengthSegment = (DataTypeLengthSegment) visit(ctx.precision());
            result.setDataLength(dataTypeLengthSegment);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        for (ExprContext each : ctx.expr()) {
            visit(each);
        }
        for (SimpleExprContext each : ctx.simpleExpr()) {
            visit(each);
        }
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new CommonExpressionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        MySQLInsertStatement result = new MySQLInsertStatement();
        if (null != ctx.LP_()) {
            if (null != ctx.fields()) {
                result.setInsertColumns(new InsertColumnsSegment(ctx.LP_().getSymbol().getStartIndex(), ctx.RP_().getSymbol().getStopIndex(), createInsertColumns(ctx.fields())));
            } else {
                result.setInsertColumns(new InsertColumnsSegment(ctx.LP_().getSymbol().getStartIndex(), ctx.RP_().getSymbol().getStopIndex(), Collections.emptyList()));
            }
        } else {
            result.setInsertColumns(new InsertColumnsSegment(ctx.start.getStartIndex() - 1, ctx.start.getStartIndex() - 1, Collections.emptyList()));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.whereClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereClause()));
        }
        if (null != ctx.orderByClause()) {
            result.setOrderBy((OrderBySegment) visit(ctx.orderByClause()));
        }
        if (null != ctx.limitClause()) {
            result.setLimit((LimitSegment) visit(ctx.limitClause()));
        }
        result.getParameterMarkerSegments().addAll(getParameterMarkerSegments());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.orderByClause()) {
            result.setOrderBy((OrderBySegment) visit(ctx.orderByClause()));
        }
        if (null != ctx.limitClause()) {
            result.setLimit((LimitSegment) visit(ctx.limitClause()));
        }
        result.getParameterMarkerSegments().addAll(getParameterMarkerSegments());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        Collection<ProjectionSegment> projections = new LinkedList<>();
        if (null != ctx.unqualifiedShorthand()) {
            projections.add(new ShorthandProjectionSegment(ctx.unqualifiedShorthand().getStart().getStartIndex(), ctx.unqualifiedShorthand().getStop().getStopIndex()));
        }
        for (ProjectionContext each : ctx.projection()) {
            projections.add((ProjectionSegment) visit(each));
        }
        ProjectionsSegment result = new ProjectionsSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        result.getProjections().addAll(projections);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (projection instanceof AggregationProjectionSegment) {
            ((AggregationProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof ExpressionProjectionSegment) {
            ((ExpressionProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof FunctionSegment) {
            FunctionSegment functionSegment = (FunctionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(functionSegment.getStartIndex(), functionSegment.getStopIndex(), functionSegment.getText(), functionSegment);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof CommonExpressionSegment) {
            CommonExpressionSegment segment = (CommonExpressionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(segment.getStartIndex(), segment.getStopIndex(), segment.getText(), segment);
            result.setAlias(alias);
            return result;
        }
        // FIXME :For DISTINCT()
        if (projection instanceof ColumnSegment) {
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(ctx), (ColumnSegment) projection);
            result.setAlias(alias);
            return result;
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        LiteralExpressionSegment column = (LiteralExpressionSegment) projection;
        ExpressionProjectionSegment result = null == alias
                ? new ExpressionProjectionSegment(column.getStartIndex(), column.getStopIndex(), String.valueOf(column.getLiterals()), column)
                : new ExpressionProjectionSegment(column.getStartIndex(), ctx.alias().stop.getStopIndex(), String.valueOf(column.getLiterals()), column);
        result.setAlias(alias);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        JoinTableSegment result = new JoinTableSegment();
        result.setStartIndex(tableSegment.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        result.setLeft(tableSegment);
        result.setJoinType(JoinType.COMMA.name());
        result.setRight((TableSegment) visit(ctx));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
            SubquerySegment subquerySegment = new SubquerySegment(ctx.subquery().start.getStartIndex(), ctx.subquery().stop.getStopIndex(), subquery);
            SubqueryTableSegment result = new SubqueryTableSegment(subquerySegment);
            if (null != ctx.alias()) {
                result.setAlias((AliasSegment) visit(ctx.alias()));
            }
            return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.tableName()) {
            SimpleTableSegment result = (SimpleTableSegment) visit(ctx.tableName());
            if (null != ctx.alias()) {
                result.setAlias((AliasSegment) visit(ctx.alias()));
            }
            return result;
        }
        return visit(ctx.tableReferences());
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.expr()) {
            ExpressionSegment condition = (ExpressionSegment) visit(ctx.expr());
            result.setCondition(condition);
        }
        if (null != ctx.USING()) {
            result.setUsing(ctx.columnNames().columnName().stream().map(each -> (ColumnSegment) visit(each)).collect(Collectors.toList()));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/MySQLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.numberLiterals()) {
            return new NumberLiteralLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((NumberLiteralValue) visit(ctx.numberLiterals())).getValue().longValue());
        }
        ParameterMarkerSegment result = new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                ((ParameterMarkerValue) visit(ctx.parameterMarker())).getValue());
        parameterMarkerSegments.add(result);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDALStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.fromSchema()) {
            result.setFromSchema((FromSchemaSegment) visit(ctx.fromSchema()));
        }
        if (null != ctx.showFilter()) {
            result.setFilter((ShowFilterSegment) visit(ctx.showFilter()));
        }
        result.getParameterMarkerSegments().addAll(getParameterMarkerSegments());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
        result.setTable((SimpleTableSegment) visit(ctx.tableName()));
        if (null != ctx.createDefinitionClause()) {
            CollectionValue<CreateDefinitionSegment> createDefinitions = (CollectionValue<CreateDefinitionSegment>) visit(ctx.createDefinitionClause());
            for (CreateDefinitionSegment each : createDefinitions.getValue()) {
                if (each instanceof ColumnDefinitionSegment) {
                    result.getColumnDefinitions().add((ColumnDefinitionSegment) each);
                } else if (each instanceof ConstraintDefinitionSegment) {
                    result.getConstraintDefinitions().add((ConstraintDefinitionSegment) each);
                }
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        SimpleTableSegment result = new SimpleTableSegment(new TableNameSegment(ctx.name().getStart().getStartIndex(), ctx.name().getStop().getStopIndex(), (IdentifierValue) visit(ctx.name())));
        OwnerContext owner = ctx.owner();
        if (null != owner) {
            result.setOwner(new OwnerSegment(owner.getStart().getStartIndex(), owner.getStop().getStopIndex(), (IdentifierValue) visit(owner.identifier())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ColumnSegment result = new ColumnSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), (IdentifierValue) visit(ctx.name()));
        OwnerContext owner = ctx.owner();
        if (null != owner) {
            result.setOwner(new OwnerSegment(owner.getStart().getStartIndex(), owner.getStop().getStopIndex(), (IdentifierValue) visit(owner.identifier())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.cExpr()) {
            return visit(ctx.cExpr());
        }
        if (null != ctx.TYPE_CAST_()) {
            return new TypeCastExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText(), (ExpressionSegment) visit(ctx.aExpr(0)), ctx.typeName().getText());
        }
        if (null != ctx.BETWEEN()) {
            return createBetweenSegment(ctx);
        }
        if (null != ctx.IN()) {
            return createInSegment(ctx);
        }
        if (null != ctx.patternMatchingOperator()) {
            return createPatternMatchingOperationSegment(ctx);
        }
        Optional<String> binaryOperator = findBinaryOperator(ctx);
        if (binaryOperator.isPresent()) {
            return createBinaryOperationSegment(ctx, binaryOperator.get());
        }
        super.visitAExpr(ctx);
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new CommonExpressionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.IS()) {
            return Optional.of(ctx.IS().getText());
        }
        if (null != ctx.ISNULL()) {
            return Optional.of("IS");
        }
        if (1 == ctx.aExpr().size()) {
            return Optional.empty();
        }
        if (null != ctx.comparisonOperator()) {
            return Optional.of(ctx.comparisonOperator().getText());
        }
        if (null != ctx.andOperator()) {
            return Optional.of(ctx.andOperator().getText());
        }
        if (null != ctx.orOperator()) {
            return Optional.of(ctx.orOperator().getText());
        }
        if (null != ctx.PLUS_()) {
            return Optional.of(ctx.PLUS_().getText());
        }
        if (null != ctx.MINUS_()) {
            return Optional.of(ctx.MINUS_().getText());
        }
        if (null != ctx.ASTERISK_()) {
            return Optional.of(ctx.ASTERISK_().getText());
        }
        if (null != ctx.SLASH_()) {
            return Optional.of(ctx.SLASH_().getText());
        }
        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        String operator = getOriginalText(ctx.patternMatchingOperator()).toUpperCase();
        ExpressionSegment left = (ExpressionSegment) visit(ctx.aExpr(0));
        ListExpression right = new ListExpression(ctx.aExpr(1).start.getStartIndex(), ctx.aExpr().get(ctx.aExpr().size() - 1).stop.getStopIndex());
        for (int i = 1; i < ctx.aExpr().size(); i++) {
            right.getItems().add((ExpressionSegment) visit(ctx.aExpr().get(i)));
        }
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if ("IS".equalsIgnoreCase(operator)) {
            ExpressionSegment left = (ExpressionSegment) visit(ctx.aExpr(0));
            String rightText;
            ExpressionSegment right;
            if (null != ctx.IS()) {
                rightText = ctx.start.getInputStream().getText(new Interval(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex())).trim();
                right = new LiteralExpressionSegment(ctx.IS().getSymbol().getStopIndex() + 2, ctx.stop.getStopIndex(), rightText);
            } else {
                rightText = ctx.start.getInputStream().getText(new Interval(ctx.ISNULL().getSymbol().getStartIndex() + 2, ctx.stop.getStopIndex())).trim();
                right = new LiteralExpressionSegment(ctx.ISNULL().getSymbol().getStartIndex() + 2, ctx.stop.getStopIndex(), rightText);
            }
            return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, "IS",
                    ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        }
        ExpressionSegment left = (ExpressionSegment) visit(ctx.aExpr(0));
        ExpressionSegment right = (ExpressionSegment) visit(ctx.aExpr(1));
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.columnref()) {
            return visit(ctx.columnref());
        }
        if (null != ctx.parameterMarker()) {
            ParameterMarkerValue parameterMarker = (ParameterMarkerValue) visit(ctx.parameterMarker());
            ParameterMarkerExpressionSegment result = new ParameterMarkerExpressionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), parameterMarker.getValue(), parameterMarker.getType());
            parameterMarkerSegments.add(result);
            return result;
        }
        if (null != ctx.aexprConst()) {
            return visit(ctx.aexprConst());
        }
        if (null != ctx.aExpr()) {
            return visit(ctx.aExpr());
        }
        if (null != ctx.funcExpr()) {
            return visit(ctx.funcExpr());
        }
        if (null != ctx.selectWithParens()) {
            return createSubqueryExpressionSegment(ctx);
        }
        if (null != ctx.caseExpr()) {
            return visit(ctx.caseExpr());
        }
        super.visitCExpr(ctx);
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new CommonExpressionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        Collection<ExpressionSegment> whenExprs = new LinkedList<>();
        Collection<ExpressionSegment> thenExprs = new LinkedList<>();
        for (WhenClauseContext each : ctx.whenClauseList().whenClause()) {
            whenExprs.add((ExpressionSegment) visit(each.aExpr(0)));
            thenExprs.add((ExpressionSegment) visit(each.aExpr(1)));
        }
        ExpressionSegment caseExpr = null == ctx.caseArg() ? null : (ExpressionSegment) visit(ctx.caseArg().aExpr());
        ExpressionSegment elseExpr = null == ctx.caseDefault() ? null : (ExpressionSegment) visit(ctx.caseDefault().aExpr());
        return new CaseWhenExpression(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), caseExpr, whenExprs, thenExprs, elseExpr);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.functionExprCommonSubexpr()) {
            return visit(ctx.functionExprCommonSubexpr());
        }
        Collection<ExpressionSegment> expressionSegments = getExpressionSegments(getTargetRuleContextFromParseTree(ctx, AExprContext.class));
        // TODO replace aggregation segment
        String aggregationType = ctx.funcApplication().funcName().getText();
        if (AggregationType.isAggregationType(aggregationType)) {
            return createAggregationSegment(ctx.funcApplication(), aggregationType, expressionSegments);
        }
        FunctionSegment result = new FunctionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ctx.funcApplication().funcName().getText(), getOriginalText(ctx));
        result.getParameters().addAll(expressionSegments);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.CAST()) {
            return new TypeCastExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText(), (ExpressionSegment) visit(ctx.aExpr(0)), ctx.typeName().getText());
        }
        FunctionSegment result = new FunctionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ctx.getChild(0).getText(), getOriginalText(ctx));
        Collection<ExpressionSegment> expressionSegments = getExpressionSegments(getTargetRuleContextFromParseTree(ctx, AExprContext.class));
        result.getParameters().addAll(expressionSegments);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        Collection<T> result = new LinkedList<>();
        for (int index = 0; index < parseTree.getChildCount(); index++) {
            ParseTree child = parseTree.getChild(index);
            if (clazz.isInstance(child)) {
                result.add(clazz.cast(child));
            } else {
                result.addAll(getTargetRuleContextFromParseTree(child, clazz));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        LiteralValue<?> value;
        if (null != ctx.numberConst()) {
            value = new NumberLiteralValue(ctx.numberConst().getText());
        } else if (null != ctx.STRING_()) {
            value = new StringLiteralValue(ctx.STRING_().getText());
        } else if (null != ctx.FALSE()) {
            value = new BooleanLiteralValue(ctx.FALSE().getText());
        } else if (null != ctx.TRUE()) {
            value = new BooleanLiteralValue(ctx.TRUE().getText());
        } else if (null != ctx.NULL()) {
            value = new NullLiteralValue(ctx.getText());
        } else {
            value = new OtherLiteralValue(ctx.getText());
        }
        if (null != ctx.constTypeName() || null != ctx.funcName() && null == ctx.LP_()) {
            LiteralExpressionSegment expression = new LiteralExpressionSegment(ctx.STRING_().getSymbol().getStartIndex(), ctx.STRING_().getSymbol().getStopIndex(), value.getValue().toString());
            String dataType = null != ctx.constTypeName() ? ctx.constTypeName().getText() : ctx.funcName().getText();
            return new TypeCastExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText(), expression, dataType);
        }
        return SQLUtils.createLiteralExpression(value, ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText());
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.indirection()) {
            AttrNameContext attrName = ctx.indirection().indirectionEl().attrName();
            ColumnSegment result = new ColumnSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), new IdentifierValue(attrName.getText()));
            OwnerSegment owner = new OwnerSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText()));
            result.setOwner(owner);
            return result;
        }
        return new ColumnSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText()));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        CollectionValue<ExpressionSegment> result = new CollectionValue<>();
        if (null != ctx.exprList()) {
            result.combine((CollectionValue<ExpressionSegment>) visitExprList(ctx.exprList()));
        }
        result.getValue().add((ExpressionSegment) visit(ctx.aExpr()));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.aExpr(0));
        ExpressionSegment between = (ExpressionSegment) visit(ctx.bExpr());
        ExpressionSegment and = (ExpressionSegment) visit(ctx.aExpr(1));
        boolean not = null != ctx.NOT();
        return new BetweenExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, between, and, not);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.cExpr()) {
            return visit(ctx.cExpr());
        }
        if (null != ctx.TYPE_CAST_()) {
            return new TypeCastExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText(), (ExpressionSegment) visit(ctx.bExpr(0)), ctx.typeName().getText());
        }
        if (null != ctx.qualOp()) {
            ExpressionSegment left = (ExpressionSegment) visit(ctx.bExpr(0));
            ExpressionSegment right = (ExpressionSegment) visit(ctx.bExpr(1));
            String operator = ctx.qualOp().getText();
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
            return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
        }
        for (BExprContext each : ctx.bExpr()) {
            visit(each);
        }
        return new LiteralExpressionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), ctx.getText());
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        AggregationType type = AggregationType.valueOf(aggregationType.toUpperCase());
        String innerExpression = ctx.start.getInputStream().getText(new Interval(ctx.LP_().getSymbol().getStartIndex(), ctx.stop.getStopIndex()));
        if (null == ctx.DISTINCT()) {
            AggregationProjectionSegment result = new AggregationProjectionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), type, innerExpression);
            result.getParameters().addAll(expressionSegments);
            return result;
        }
        AggregationDistinctProjectionSegment result =
                new AggregationDistinctProjectionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), type, innerExpression, getDistinctExpression(ctx));
        result.getParameters().addAll(expressionSegments);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        IdentifierContext identifierContext = ctx.identifier();
        if (null != identifierContext) {
            return new KeywordValue(identifierContext.getText());
        }
        Collection<String> dataTypeNames = new LinkedList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            dataTypeNames.add(ctx.getChild(i).getText());
        }
        return new KeywordValue(String.join(" ", dataTypeNames));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        OrderDirection orderDirection = null != ctx.ascDesc() ? generateOrderDirection(ctx.ascDesc()) : OrderDirection.ASC;
        NullsOrderType nullsOrderType = generateNullsOrderType(ctx.nullsOrder());
        ASTNode expr = visit(ctx.aExpr());
        if (expr instanceof ColumnSegment) {
            ColumnSegment column = (ColumnSegment) expr;
            return new ColumnOrderByItemSegment(column, orderDirection, nullsOrderType);
        }
        if (expr instanceof LiteralExpressionSegment) {
            LiteralExpressionSegment index = (LiteralExpressionSegment) expr;
            return new IndexOrderByItemSegment(index.getStartIndex(), index.getStopIndex(), Integer.parseInt(index.getLiterals().toString()), orderDirection, nullsOrderType);
        }
        if (expr instanceof ExpressionSegment) {
            return new ExpressionOrderByItemSegment(ctx.aExpr().getStart().getStartIndex(),
                    ctx.aExpr().getStop().getStopIndex(), getOriginalText(ctx.aExpr()), orderDirection, nullsOrderType, (ExpressionSegment) expr);
        }
        return new ExpressionOrderByItemSegment(ctx.aExpr().getStart().getStartIndex(), ctx.aExpr().getStop().getStopIndex(), getOriginalText(ctx.aExpr()), orderDirection, nullsOrderType);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        DataTypeSegment result = new DataTypeSegment();
        result.setDataTypeName(((KeywordValue) visit(ctx.dataTypeName())).getValue());
        result.setStartIndex(ctx.start.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        if (null != ctx.dataTypeLength()) {
            DataTypeLengthSegment dataTypeLengthSegment = (DataTypeLengthSegment) visit(ctx.dataTypeLength());
            result.setDataLength(dataTypeLengthSegment);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        DataTypeLengthSegment result = new DataTypeLengthSegment();
        result.setStartIndex(ctx.start.getStartIndex());
        result.setStopIndex(ctx.stop.getStartIndex());
        List<TerminalNode> numbers = ctx.NUMBER_();
        if (1 == numbers.size()) {
            result.setPrecision(Integer.parseInt(numbers.get(0).getText()));
        }
        if (2 == numbers.size()) {
            result.setPrecision(Integer.parseInt(numbers.get(0).getText()));
            result.setScale(Integer.parseInt(numbers.get(1).getText()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (numbers.size() == 1) {
            result.setPrecision(Integer.parseInt(numbers.get(0).getText()));
        }
        if (numbers.size() == 2) {
            result.setPrecision(Integer.parseInt(numbers.get(0).getText()));
            result.setScale(Integer.parseInt(numbers.get(1).getText()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        SimpleTableSegment result = (SimpleTableSegment) visit(ctx.qualifiedName());
        if (null != ctx.AS()) {
            ColIdContext colId = ctx.colId();
            result.setAlias(new AliasSegment(colId.start.getStartIndex(), colId.stop.getStopIndex(), new IdentifierValue(colId.getText())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        CollectionValue<SimpleTableSegment> result = new CollectionValue<>();
        if (null != ctx.qualifiedName()) {
            result.getValue().add((SimpleTableSegment) visit(ctx.qualifiedName()));
        }
        if (null != ctx.qualifiedNameList()) {
            result.combine((CollectionValue) visit(ctx.qualifiedNameList()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        AttrNameContext attrName = ctx.indirection().indirectionEl().attrName();
        TableNameSegment tableName = new TableNameSegment(attrName.start.getStartIndex(), attrName.stop.getStopIndex(), new IdentifierValue(attrName.getText()));
        OwnerSegment owner = new OwnerSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText()));
        SimpleTableSegment result = new SimpleTableSegment(tableName);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null == ctx.insertColumnList()) {
            result.setInsertColumns(new InsertColumnsSegment(ctx.start.getStartIndex() - 1, ctx.start.getStartIndex() - 1, Collections.emptyList()));
        } else {
            InsertColumnListContext insertColumns = ctx.insertColumnList();
            CollectionValue<ColumnSegment> columns = (CollectionValue<ColumnSegment>) visit(insertColumns);
            InsertColumnsSegment insertColumnsSegment = new InsertColumnsSegment(insertColumns.start.getStartIndex() - 1, insertColumns.stop.getStopIndex() + 1, columns.getValue());
            result.setInsertColumns(insertColumnsSegment);
        }
        ValuesClauseContext valuesClause = ctx.select().selectNoParens().selectClauseN().simpleSelect().valuesClause();
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        CollectionValue<ColumnSegment> result = new CollectionValue<>();
        if (null != ctx.insertColumnList()) {
            result.getValue().addAll(((CollectionValue<ColumnSegment>) visit(ctx.insertColumnList())).getValue());
        }
        result.getValue().add((ColumnSegment) visit(ctx.insertColumnItem()));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null == ctx.optIndirection().indirectionEl()) {
            return new ColumnSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText()));
        }
        ColumnSegment result = new ColumnSegment(
                ctx.colId().start.getStartIndex(), ctx.optIndirection().stop.getStopIndex(), new IdentifierValue(ctx.optIndirection().indirectionEl().attrName().getText()));
        result.setOwner(new OwnerSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText())));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        Collection<InsertValuesSegment> result = new LinkedList<>();
        if (null != ctx.valuesClause()) {
            Collection<InsertValuesSegment> expressions = createInsertValuesSegments(ctx.valuesClause());
            result.addAll(expressions);
        }
        Collection<ExpressionSegment> expressions = createInsertValuesSegments(ctx.exprList());
        InsertValuesSegment insertValuesSegment = new InsertValuesSegment(ctx.LP_().getSymbol().getStartIndex(), ctx.RP_().getSymbol().getStopIndex(), (List<ExpressionSegment>) expressions);
        result.add(insertValuesSegment);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        Collection<ExpressionSegment> result = new LinkedList<>();
        if (null != ctx.exprList()) {
            Collection<ExpressionSegment> tmpResult = createInsertValuesSegments(ctx.exprList());
            result.addAll(tmpResult);
        }
        ExpressionSegment expr = (ExpressionSegment) visit(ctx.aExpr());
        result.add(expr);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        Collection<AssignmentSegment> result = new LinkedList<>();
        if (null != ctx.setClauseList()) {
            Collection<AssignmentSegment> tmpResult = generateAssignmentSegments(ctx.setClauseList());
            result.addAll(tmpResult);
        }
        AssignmentSegment assignmentSegment = (AssignmentSegment) visit(ctx.setClause());
        result.add(assignmentSegment);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ColumnSegment columnSegment = (ColumnSegment) visit(ctx.setTarget());
        List<ColumnSegment> columnSegments = new LinkedList<>();
        columnSegments.add(columnSegment);
        ExpressionSegment expressionSegment = (ExpressionSegment) visit(ctx.aExpr());
        return new ColumnAssignmentSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), columnSegments, expressionSegment);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        SimpleTableSegment tableSegment = (SimpleTableSegment) visit(ctx.relationExprOptAlias());
        result.setTable(tableSegment);
        result.setSetAssignment((SetAssignmentSegment) visit(ctx.setClauseList()));
        if (null != ctx.whereOrCurrentClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereOrCurrentClause()));
        }
        result.getParameterMarkerSegments().addAll(getParameterMarkerSegments());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.sortClause()) {
            OrderBySegment orderBySegment = (OrderBySegment) visit(ctx.sortClause());
            result.setOrderBy(orderBySegment);
        }
        if (null != ctx.selectLimit()) {
            LimitSegment limitSegment = (LimitSegment) visit(ctx.selectLimit());
            result.setLimit(limitSegment);
        }
        if (null != ctx.forLockingClause()) {
            LockSegment lockSegment = (LockSegment) visit(ctx.forLockingClause());
            result.setLock(lockSegment);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        boolean isDistinct = null == ctx.allOrDistinct() || null != ctx.allOrDistinct().DISTINCT();
        if (null != ctx.UNION()) {
            return isDistinct ? CombineType.UNION : CombineType.UNION_ALL;
        }
        if (null != ctx.INTERSECT()) {
            return isDistinct ? CombineType.INTERSECT : CombineType.INTERSECT_ALL;
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.fromClause()) {
            TableSegment tableSegment = (TableSegment) visit(ctx.fromClause());
            result.setFrom(tableSegment);
        }
        if (null != ctx.whereClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereClause()));
        }
        if (null != ctx.groupClause()) {
            result.setGroupBy((GroupBySegment) visit(ctx.groupClause()));
        }
        if (null != ctx.havingClause()) {
            result.setHaving((HavingSegment) visit(ctx.havingClause()));
        }
        if (null != ctx.windowClause()) {
            result.setWindow((WindowSegment) visit(ctx.windowClause()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.aExpr()) {
            ASTNode astNode = visit(ctx.aExpr());
            if (astNode instanceof ColumnSegment) {
                return new ColumnOrderByItemSegment((ColumnSegment) astNode, OrderDirection.ASC, null);
            }
            if (astNode instanceof LiteralExpressionSegment) {
                LiteralExpressionSegment index = (LiteralExpressionSegment) astNode;
                return new IndexOrderByItemSegment(index.getStartIndex(), index.getStopIndex(),
                        Integer.parseInt(index.getLiterals().toString()), OrderDirection.ASC, null);
            }
            return new ExpressionOrderByItemSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(ctx), OrderDirection.ASC, null);
        }
        return new ExpressionOrderByItemSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(ctx), OrderDirection.ASC, null);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ProjectionsSegment result = new ProjectionsSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        if (null != ctx.targetList()) {
            ProjectionsSegment projections = (ProjectionsSegment) visit(ctx.targetList());
            result.getProjections().addAll(projections.getProjections());
        }
        ProjectionSegment projection = (ProjectionSegment) visit(ctx.targetEl());
        result.getProjections().add(projection);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.ASTERISK_()) {
            return new ShorthandProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        }
        if (null != ctx.DOT_ASTERISK_()) {
            ShorthandProjectionSegment result = new ShorthandProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
            result.setOwner(new OwnerSegment(ctx.colId().start.getStartIndex(), ctx.colId().stop.getStopIndex(), new IdentifierValue(ctx.colId().getText())));
            return result;
        }
        if (null != ctx.aExpr()) {
            ASTNode projection = visit(ctx.aExpr());
            return createProjectionSegment(ctx, expr, projection);
        }
        return new ExpressionProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(expr), null);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (projection instanceof ColumnSegment) {
            return new ColumnProjectionSegment((ColumnSegment) projection);
        }
        if (projection instanceof AggregationProjectionSegment) {
            return (AggregationProjectionSegment) projection;
        }
        if (projection instanceof SubqueryExpressionSegment) {
            SubqueryExpressionSegment subqueryExpression = (SubqueryExpressionSegment) projection;
            String text = ctx.start.getInputStream().getText(new Interval(subqueryExpression.getStartIndex(), subqueryExpression.getStopIndex()));
            return new SubqueryProjectionSegment(subqueryExpression.getSubquery(), text);
        }
        if (projection instanceof ExistsSubqueryExpression) {
            ExistsSubqueryExpression existsSubqueryExpression = (ExistsSubqueryExpression) projection;
            String text = ctx.start.getInputStream().getText(new Interval(existsSubqueryExpression.getStartIndex(), existsSubqueryExpression.getStopIndex()));
            return new SubqueryProjectionSegment(existsSubqueryExpression.getSubquery(), text);
        }
        if (projection instanceof ExpressionSegment) {
            return new ExpressionProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(expr), (ExpressionSegment) projection);
        }
        return new ExpressionProjectionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), getOriginalText(expr), null);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.fromList()) {
            JoinTableSegment result = new JoinTableSegment();
            result.setStartIndex(ctx.start.getStartIndex());
            result.setStopIndex(ctx.stop.getStopIndex());
            result.setLeft((TableSegment) visit(ctx.fromList()));
            result.setRight((TableSegment) visit(ctx.tableReference()));
            result.setJoinType(JoinType.COMMA.name());
            return result;
        }
        return visit(ctx.tableReference());
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
            SubquerySegment subquery = new SubquerySegment(ctx.selectWithParens().start.getStartIndex(), ctx.selectWithParens().stop.getStopIndex(), select);
            AliasSegment alias = null != ctx.aliasClause() ? (AliasSegment) visit(ctx.aliasClause()) : null;
            SubqueryTableSegment result = new SubqueryTableSegment(subquery);
            result.setAlias(alias);
            return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
            JoinTableSegment result = new JoinTableSegment();
            result.setLeft((TableSegment) visit(ctx.tableReference()));
            int startIndex = null != ctx.LP_() ? ctx.LP_().getSymbol().getStartIndex() : ctx.tableReference().start.getStartIndex();
            int stopIndex = 0;
            AliasSegment alias = null;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        TableSegment right = (TableSegment) visit(ctx.tableReference());
        tableSegment.setRight(right);
        tableSegment.setJoinType(getJoinType(ctx));
        tableSegment.setNatural(null != ctx.naturalJoinType());
        return null == ctx.joinQual() ? tableSegment : visitJoinQual(ctx.joinQual(), tableSegment);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.crossJoinType()) {
            return JoinType.CROSS.name();
        }
        if (null != ctx.innerJoinType()) {
            return JoinType.INNER.name();
        }
        if (null != ctx.outerJoinType()) {
            return getOutJoinType(ctx.outerJoinType());
        }
        if (null != ctx.naturalJoinType()) {
            return getNaturalJoinType(ctx.naturalJoinType());
        }
        return JoinType.COMMA.name();
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.INNER()) {
            return JoinType.INNER.name();
        }
        if (null != ctx.FULL()) {
            return JoinType.FULL.name();
        }
        if (null != ctx.LEFT()) {
            return JoinType.LEFT.name();
        }
        if (null != ctx.RIGHT()) {
            return JoinType.RIGHT.name();
        }
        return JoinType.INNER.name();
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        List<ColumnSegment> result = new ArrayList<>();
        if (null != ctx.nameList()) {
            result.addAll(generateUsingColumn(ctx.nameList()));
        }
        if (null != ctx.name()) {
            result.add(new ColumnSegment(ctx.name().start.getStartIndex(), ctx.name().stop.getStopIndex(), new IdentifierValue(ctx.name().getText())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        StringBuilder aliasName = new StringBuilder(ctx.colId().getText());
        if (null != ctx.nameList()) {
            aliasName.append(ctx.LP_().getText());
            aliasName.append(ctx.nameList().getText());
            aliasName.append(ctx.RP_().getText());
        }
        return new AliasSegment(ctx.colId().start.getStartIndex(), ctx.stop.getStopIndex(), new IdentifierValue(aliasName.toString()));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.ALL()) {
            return null;
        }
        ASTNode astNode = visit(ctx.cExpr());
        if (astNode instanceof ParameterMarkerExpressionSegment) {
            return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
        }
        return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ASTNode astNode = visit(ctx.cExpr());
        if (astNode instanceof ParameterMarkerExpressionSegment) {
            return new ParameterMarkerLimitValueSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ((ParameterMarkerExpressionSegment) astNode).getParameterMarkerIndex());
        }
        return new NumberLiteralLimitValueSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), Long.parseLong(((LiteralExpressionSegment) astNode).getLiterals().toString()));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        ParseTree astNode0 = ctx.getChild(0);
        LimitValueSegment rowCount = null;
        LimitValueSegment offset = null;
        if (astNode0 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
            offset = (LimitValueSegment) visit(ctx.offsetClause().selectOffsetValue());
        }
        ParseTree astNode1 = ctx.getChild(1);
        if (astNode1 instanceof LimitClauseContext) {
            rowCount = null == ctx.limitClause().selectLimitValue() ? null : (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
        } else {
            offset = (LimitValueSegment) visit(ctx.offsetClause().selectOffsetValue());
        }
        return new LimitSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), offset, rowCount);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
            if (null != ctx.limitClause().selectFetchValue()) {
                LimitValueSegment limit = (LimitValueSegment) visit(ctx.limitClause().selectFetchValue());
                return new LimitSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), null, limit);
            }
            LimitValueSegment limit = (LimitValueSegment) visit(ctx.limitClause().selectLimitValue());
            return new LimitSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), null, limit);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        CollectionValue<NameSegment> result = new CollectionValue<>();
        if (null != ctx.attrs()) {
            result.combine((CollectionValue<NameSegment>) visit(ctx.attrs()));
        }
        result.getValue().add(new NameSegment(ctx.colId().getStart().getStartIndex(), ctx.colId().getStop().getStopIndex(), new IdentifierValue(ctx.colId().getText())));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
        CollectionValue<NameSegment> result = new CollectionValue<>();
        result.getValue().add(new NameSegment(ctx.attrName().getStart().getStartIndex(), ctx.attrName().getStop().getStopIndex(), new IdentifierValue(ctx.attrName().getText())));
        if (null != ctx.attrs()) {
            result.combine((CollectionValue<NameSegment>) visit(ctx.attrs()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDALStatementVisitor.java`
#### Snippet
```java
        VariableAssignSegment result = new VariableAssignSegment();
        result.setStartIndex(ctx.start.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        result.setVariable(new VariableSegment(ctx.varName().start.getStartIndex(), ctx.varName().stop.getStopIndex(), ctx.varName().getText()));
        if (null != ctx.varList()) {
            result.setAssignValue(ctx.varList().getText());
        }
        if (null != ctx.DEFAULT()) {
            result.setAssignValue(ctx.DEFAULT().getText());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDALStatementVisitor.java`
#### Snippet
```java
        CollectionValue<SimpleTableSegment> result = new CollectionValue<>();
        for (VacuumRelationContext each : ctx.vacuumRelation()) {
            ColIdContext colId = each.qualifiedName().colId();
            TableNameSegment tableName = new TableNameSegment(colId.start.getStartIndex(), colId.stop.getStopIndex(), new IdentifierValue(colId.getText()));
            result.getValue().add(new SimpleTableSegment(tableName));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDALStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.select()) {
            return visit(ctx.select());
        }
        if (null != ctx.insert()) {
            return visit(ctx.insert());
        }
        if (null != ctx.update()) {
            return visit(ctx.update());
        }
        if (null != ctx.delete()) {
            return visit(ctx.delete());
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        CollectionValue<CreateDefinitionSegment> result = new CollectionValue<>();
        for (CreateDefinitionContext each : ctx.createDefinition()) {
            if (null != each.columnDefinition()) {
                result.getValue().add((ColumnDefinitionSegment) visit(each.columnDefinition()));
            }
            if (null != each.tableConstraint()) {
                result.getValue().add((ConstraintDefinitionSegment) visit(each.tableConstraint()));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        result.setTable((SimpleTableSegment) visit(ctx.tableNameClause().tableName()));
        if (null != ctx.alterDefinitionClause()) {
            for (AlterDefinitionSegment each : ((CollectionValue<AlterDefinitionSegment>) visit(ctx.alterDefinitionClause())).getValue()) {
                if (each instanceof AddColumnDefinitionSegment) {
                    result.getAddColumnDefinitions().add((AddColumnDefinitionSegment) each);
                } else if (each instanceof ModifyColumnDefinitionSegment) {
                    result.getModifyColumnDefinitions().add((ModifyColumnDefinitionSegment) each);
                } else if (each instanceof DropColumnDefinitionSegment) {
                    result.getDropColumnDefinitions().add((DropColumnDefinitionSegment) each);
                } else if (each instanceof AddConstraintDefinitionSegment) {
                    result.getAddConstraintDefinitions().add((AddConstraintDefinitionSegment) each);
                } else if (each instanceof ValidateConstraintDefinitionSegment) {
                    result.getValidateConstraintDefinitions().add((ValidateConstraintDefinitionSegment) each);
                } else if (each instanceof ModifyConstraintDefinitionSegment) {
                    result.getModifyConstraintDefinitions().add((ModifyConstraintDefinitionSegment) each);
                } else if (each instanceof DropConstraintDefinitionSegment) {
                    result.getDropConstraintDefinitions().add((DropConstraintDefinitionSegment) each);
                } else if (each instanceof RenameTableDefinitionSegment) {
                    result.setRenameTable(((RenameTableDefinitionSegment) each).getRenameTable());
                }
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.alterTableActions()) {
            for (AlterTableActionContext each : ctx.alterTableActions().alterTableAction()) {
                AddColumnSpecificationContext addColumnSpecification = each.addColumnSpecification();
                if (null != addColumnSpecification) {
                    result.getValue().addAll(((CollectionValue<AddColumnDefinitionSegment>) visit(addColumnSpecification)).getValue());
                }
                if (null != each.addConstraintSpecification() && null != each.addConstraintSpecification().tableConstraint()) {
                    result.getValue().add((AddConstraintDefinitionSegment) visit(each.addConstraintSpecification()));
                }
                if (null != each.validateConstraintSpecification()) {
                    result.getValue().add((ValidateConstraintDefinitionSegment) visit(each.validateConstraintSpecification()));
                }
                if (null != each.modifyColumnSpecification()) {
                    result.getValue().add((ModifyColumnDefinitionSegment) visit(each.modifyColumnSpecification()));
                }
                if (null != each.modifyConstraintSpecification()) {
                    result.getValue().add((ModifyConstraintDefinitionSegment) visit(each.modifyConstraintSpecification()));
                }
                if (null != each.dropColumnSpecification()) {
                    result.getValue().add((DropColumnDefinitionSegment) visit(each.dropColumnSpecification()));
                }
                if (null != each.dropConstraintSpecification()) {
                    result.getValue().add((DropConstraintDefinitionSegment) visit(each.dropConstraintSpecification()));
                }
            }
        }
        if (null != ctx.renameTableSpecification()) {
            result.getValue().add((RenameTableDefinitionSegment) visit(ctx.renameTableSpecification()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        RenameTableDefinitionSegment result = new RenameTableDefinitionSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
        TableNameSegment tableName = new TableNameSegment(ctx.identifier().start.getStartIndex(), ctx.identifier().stop.getStopIndex(), (IdentifierValue) visit(ctx.identifier()));
        result.setRenameTable(new SimpleTableSegment(tableName));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        CollectionValue<AddColumnDefinitionSegment> result = new CollectionValue<>();
        ColumnDefinitionContext columnDefinition = ctx.columnDefinition();
        if (null != columnDefinition) {
            AddColumnDefinitionSegment addColumnDefinition = new AddColumnDefinitionSegment(
                    ctx.columnDefinition().getStart().getStartIndex(), columnDefinition.getStop().getStopIndex(), Collections.singletonList((ColumnDefinitionSegment) visit(columnDefinition)));
            result.getValue().add(addColumnDefinition);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        ColumnSegment column = (ColumnSegment) visit(ctx.columnName());
        DataTypeSegment dataType = (DataTypeSegment) visit(ctx.dataType());
        boolean isPrimaryKey = ctx.columnConstraint().stream().anyMatch(each -> null != each.columnConstraintOption() && null != each.columnConstraintOption().primaryKey());
        // TODO parse not null
        ColumnDefinitionSegment result = new ColumnDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), column, dataType, isPrimaryKey, false);
        for (ColumnConstraintContext each : ctx.columnConstraint()) {
            if (null != each.columnConstraintOption().tableName()) {
                result.getReferencedTables().add((SimpleTableSegment) visit(each.columnConstraintOption().tableName()));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintName()) {
            result.setConstraintName((ConstraintSegment) visit(ctx.constraintName()));
        }
        if (null != ctx.indexName()) {
            result.setIndexName((IndexSegment) visit(ctx.indexName()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        ConstraintDefinitionSegment result = new ConstraintDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        if (null != ctx.constraintClause()) {
            result.setConstraintName((ConstraintSegment) visit(ctx.constraintClause().constraintName()));
        }
        if (null != ctx.tableConstraintOption().primaryKey()) {
            result.getPrimaryKeyColumns().addAll(((CollectionValue<ColumnSegment>) visit(ctx.tableConstraintOption().columnNames(0))).getValue());
        }
        if (null != ctx.tableConstraintOption().FOREIGN()) {
            result.setReferencedTable((SimpleTableSegment) visit(ctx.tableConstraintOption().tableName()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        ColumnSegment column = (ColumnSegment) visit(ctx.modifyColumn().columnName());
        DataTypeSegment dataType = null == ctx.dataType() ? null : (DataTypeSegment) visit(ctx.dataType());
        ColumnDefinitionSegment columnDefinition = new ColumnDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), column, dataType, false, false);
        return new ModifyColumnDefinitionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), columnDefinition);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        CollectionValue<ColumnSegment> result = new CollectionValue<>();
        for (IndexElemContext each : ctx.indexElem()) {
            if (null != each.colId()) {
                result.getValue().add(new ColumnSegment(each.colId().start.getStartIndex(), each.colId().stop.getStopIndex(), new IdentifierValue(each.colId().getText())));
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        Collection<SimpleTableSegment> tableSegments = new LinkedList<>();
        for (int i = 0; i < ctx.tableNameClause().size(); i++) {
            tableSegments.add((SimpleTableSegment) visit(ctx.tableNameClause(i)));
        }
        CollectionValue<SimpleTableSegment> result = new CollectionValue<>();
        result.getValue().addAll(tableSegments);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        result.setView((SimpleTableSegment) visit(ctx.qualifiedName()));
        if (ctx.alterViewClauses() instanceof AlterRenameViewContext) {
            NameContext nameContext = ((AlterRenameViewContext) ctx.alterViewClauses()).name();
            result.setRenameView(
                    new SimpleTableSegment(new TableNameSegment(nameContext.getStart().getStartIndex(), nameContext.getStop().getStopIndex(), (IdentifierValue) visit(nameContext.identifier()))));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.preparableStmt().select()) {
            result.setSelect((SelectStatement) visit(ctx.preparableStmt().select()));
        }
        if (null != ctx.preparableStmt().insert()) {
            result.setInsert((InsertStatement) visit(ctx.preparableStmt().insert()));
        }
        if (null != ctx.preparableStmt().update()) {
            result.setUpdate((UpdateStatement) visit(ctx.preparableStmt().update()));
        }
        if (null != ctx.preparableStmt().delete()) {
            result.setDelete((DeleteStatement) visit(ctx.preparableStmt().delete()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.createSchemaClauses().colId()) {
            result.setSchemaName(new IdentifierValue(ctx.createSchemaClauses().colId().getText()));
        }
        if (null != ctx.createSchemaClauses().roleSpec() && null != ctx.createSchemaClauses().roleSpec().identifier()) {
            result.setUsername((IdentifierValue) visit(ctx.createSchemaClauses().roleSpec().identifier()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        CollectionValue<IdentifierValue> result = new CollectionValue<>();
        if (null != ctx.nameList()) {
            result.combine((CollectionValue<IdentifierValue>) visit(ctx.nameList()));
        }
        if (null != ctx.name()) {
            result.getValue().add((IdentifierValue) visit(ctx.name()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        Optional<NameSegment> columnName = nameSegmentIterator.hasNext() ? Optional.of(nameSegmentIterator.next()) : Optional.empty();
        columnName.ifPresent(optional -> result.setColumn(new ColumnSegment(optional.getStartIndex(), optional.getStopIndex(), optional.getIdentifier())));
        setTableSegment(result, nameSegmentIterator);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/type/OpenGaussDDLStatementVisitor.java`
#### Snippet
```java
        Optional<NameSegment> tableName = nameSegmentIterator.hasNext() ? Optional.of(nameSegmentIterator.next()) : Optional.empty();
        tableName.ifPresent(optional -> statement.setTable(new SimpleTableSegment(new TableNameSegment(optional.getStartIndex(), optional.getStopIndex(), optional.getIdentifier()))));
        Optional<NameSegment> schemaName = nameSegmentIterator.hasNext() ? Optional.of(nameSegmentIterator.next()) : Optional.empty();
        schemaName.ifPresent(optional -> statement.getTable().setOwner(new OwnerSegment(optional.getStartIndex(), optional.getStopIndex(), optional.getIdentifier())));
        Optional<NameSegment> databaseName = nameSegmentIterator.hasNext() ? Optional.of(nameSegmentIterator.next()) : Optional.empty();
        databaseName.ifPresent(optional -> statement.getTable().getOwner()
                .ifPresent(owner -> owner.setOwner(new OwnerSegment(optional.getStartIndex(), optional.getStopIndex(), optional.getIdentifier()))));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.stringLiterals()) {
            return visit(ctx.stringLiterals());
        }
        if (null != ctx.numberLiterals()) {
            return visit(ctx.numberLiterals());
        }
        if (null != ctx.hexadecimalLiterals()) {
            return visit(ctx.hexadecimalLiterals());
        }
        if (null != ctx.bitValueLiterals()) {
            return visit(ctx.bitValueLiterals());
        }
        if (null != ctx.booleanLiterals()) {
            return visit(ctx.booleanLiterals());
        }
        if (null != ctx.nullValueLiterals()) {
            return visit(ctx.nullValueLiterals());
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        SimpleTableSegment result = new SimpleTableSegment(new TableNameSegment(ctx.name().getStart().getStartIndex(),
                ctx.name().getStop().getStopIndex(), new IdentifierValue(ctx.name().identifier().getText())));
        OwnerContext owner = ctx.owner();
        if (null != owner) {
            result.setOwner(new OwnerSegment(owner.getStart().getStartIndex(), owner.getStop().getStopIndex(), (IdentifierValue) visit(owner.identifier())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.booleanPrimary()) {
            return visit(ctx.booleanPrimary());
        }
        if (null != ctx.LP_()) {
            return visit(ctx.expr(0));
        }
        if (null != ctx.andOperator()) {
            return createBinaryOperationExpression(ctx, ctx.andOperator().getText());
        }
        if (null != ctx.orOperator()) {
            return createBinaryOperationExpression(ctx, ctx.orOperator().getText());
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.IN()) {
            return createInSegment(ctx);
        }
        if (null != ctx.BETWEEN()) {
            return createBetweenSegment(ctx);
        }
        if (null != ctx.LIKE()) {
            return createBinaryOperationExpressionFromLike(ctx);
        }
        return visit(ctx.bitExpr(0));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.bitExpr(0));
        ListExpression right = new ListExpression(ctx.simpleExpr(0).start.getStartIndex(), ctx.simpleExpr().get(ctx.simpleExpr().size() - 1).stop.getStopIndex());
        for (SimpleExprContext each : ctx.simpleExpr()) {
            right.getItems().add((ExpressionSegment) visit(each));
        }
        String operator = null != ctx.NOT() ? "NOT LIKE" : "LIKE";
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.simpleExpr()) {
            return createExpressionSegment(visit(ctx.simpleExpr()), ctx);
        }
        ExpressionSegment left = (ExpressionSegment) visit(ctx.getChild(0));
        ExpressionSegment right = (ExpressionSegment) visit(ctx.getChild(2));
        String operator = ctx.getChild(1).getText();
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (astNode instanceof StringLiteralValue) {
            return new LiteralExpressionSegment(context.start.getStartIndex(), context.stop.getStopIndex(), ((StringLiteralValue) astNode).getValue());
        }
        if (astNode instanceof NumberLiteralValue) {
            return new LiteralExpressionSegment(context.start.getStartIndex(), context.stop.getStopIndex(), ((NumberLiteralValue) astNode).getValue());
        }
        if (astNode instanceof BooleanLiteralValue) {
            return new LiteralExpressionSegment(context.start.getStartIndex(), context.stop.getStopIndex(), ((BooleanLiteralValue) astNode).getValue());
        }
        if (astNode instanceof ParameterMarkerValue) {
            ParameterMarkerValue parameterMarker = (ParameterMarkerValue) astNode;
            ParameterMarkerExpressionSegment segment = new ParameterMarkerExpressionSegment(context.start.getStartIndex(), context.stop.getStopIndex(),
                    parameterMarker.getValue(), parameterMarker.getType());
            parameterMarkerSegments.add(segment);
            return segment;
        }
        if (astNode instanceof SubquerySegment) {
            return new SubqueryExpressionSegment((SubquerySegment) astNode);
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.castFunction()) {
            return visit(ctx.castFunction());
        }
        if (null != ctx.charFunction()) {
            return visit(ctx.charFunction());
        }
        return new FunctionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ctx.getChild(0).getChild(0).getText(), getOriginalText(ctx));
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        ASTNode exprSegment = visit(ctx.expr());
        if (exprSegment instanceof ColumnSegment) {
            result.getParameters().add((ColumnSegment) exprSegment);
        } else if (exprSegment instanceof LiteralExpressionSegment) {
            result.getParameters().add((LiteralExpressionSegment) exprSegment);
        }
        result.getParameters().add((DataTypeSegment) visit(ctx.dataType()));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/OracleStatementVisitor.java`
#### Snippet
```java
        FunctionSegment result = new FunctionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ctx.regularFunctionName().getText(), getOriginalText(ctx));
        Collection<ExpressionSegment> expressionSegments = ctx.expr().stream().map(each -> (ExpressionSegment) visit(each)).collect(Collectors.toList());
        result.getParameters().addAll(expressionSegments);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDDLStatementVisitor.java`
#### Snippet
```java
                if (each instanceof AddColumnDefinitionSegment) {
                    result.getAddColumnDefinitions().add((AddColumnDefinitionSegment) each);
                } else if (each instanceof ModifyColumnDefinitionSegment) {
                    result.getModifyColumnDefinitions().add((ModifyColumnDefinitionSegment) each);
                } else if (each instanceof DropColumnDefinitionSegment) {
                    result.getDropColumnDefinitions().add((DropColumnDefinitionSegment) each);
                } else if (each instanceof AddConstraintDefinitionSegment) {
                    result.getAddConstraintDefinitions().add((AddConstraintDefinitionSegment) each);
                } else if (each instanceof ModifyConstraintDefinitionSegment) {
                    result.getModifyConstraintDefinitions().add((ModifyConstraintDefinitionSegment) each);
                } else if (each instanceof DropConstraintDefinitionSegment) {
                    result.getDropConstraintDefinitions().add((DropConstraintDefinitionSegment) each);
                }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDMLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.dmlTableExprClause().dmlTableClause()) {
            return visit(ctx.dmlTableExprClause().dmlTableClause());
        }
        if (null != ctx.dmlTableExprClause().dmlSubqueryClause()) {
            SubquerySegment subquerySegment = (SubquerySegment) visit(ctx.dmlTableExprClause().dmlSubqueryClause());
            return new SubqueryTableSegment(subquerySegment);
        }
        SubquerySegment subquerySegment = (SubquerySegment) visit(ctx.dmlTableExprClause().tableCollectionExpr());
        return new SubqueryTableSegment(subquerySegment);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDMLStatementVisitor.java`
#### Snippet
```java
            SubquerySegment subquerySegment = new SubquerySegment(ctx.selectSubquery().start.getStartIndex(), ctx.selectSubquery().stop.getStopIndex(),
                    (OracleSelectStatement) visit(ctx.selectSubquery()));
            SubqueryExpressionSegment value = new SubqueryExpressionSegment(subquerySegment);
            AssignmentSegment result = new ColumnAssignmentSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), columnSegments, value);
            result.getColumns().add(column);
            return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        ASTNode projection = visit(ctx.expr());
        if (projection instanceof AggregationProjectionSegment) {
            ((AggregationProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof ExpressionProjectionSegment) {
            ((ExpressionProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof FunctionSegment) {
            FunctionSegment segment = (FunctionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(segment.getStartIndex(), segment.getStopIndex(), segment.getText(), segment);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof CommonExpressionSegment) {
            CommonExpressionSegment segment = (CommonExpressionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(segment.getStartIndex(), segment.getStopIndex(), segment.getText(), segment);
            result.setAlias(alias);
            return result;
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDMLStatementVisitor.java`
#### Snippet
```java
if (projection instanceof AggregationProjectionSegment) {
            ((AggregationProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof ExpressionProjectionSegment) {
            ((ExpressionProjectionSegment) projection).setAlias(alias);
            return projection;
        }
        if (projection instanceof FunctionSegment) {
            FunctionSegment segment = (FunctionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(segment.getStartIndex(), segment.getStopIndex(), segment.getText(), segment);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof CommonExpressionSegment) {
            CommonExpressionSegment segment = (CommonExpressionSegment) projection;
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(segment.getStartIndex(), segment.getStopIndex(), segment.getText(), segment);
            result.setAlias(alias);
            return result;
        }
        // FIXME :For DISTINCT()
        if (projection instanceof ColumnSegment) {
            ColumnProjectionSegment result = new ColumnProjectionSegment((ColumnSegment) projection);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof SubqueryExpressionSegment) {
            SubqueryExpressionSegment subqueryExpressionSegment = (SubqueryExpressionSegment) projection;
            String text = ctx.start.getInputStream().getText(new Interval(subqueryExpressionSegment.getStartIndex(), subqueryExpressionSegment.getStopIndex()));
            SubqueryProjectionSegment result = new SubqueryProjectionSegment(((SubqueryExpressionSegment) projection).getSubquery(), text);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof BinaryOperationExpression) {
            BinaryOperationExpression binaryExpression = (BinaryOperationExpression) projection;
            int startIndex = binaryExpression.getStartIndex();
            int stopIndex = null != alias ? alias.getStopIndex() : binaryExpression.getStopIndex();
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(startIndex, stopIndex, binaryExpression.getText(), binaryExpression);
            result.setAlias(alias);
            return result;
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/type/PostgreSQLDMLStatementVisitor.java`
#### Snippet
```java
        PostgreSQLCopyStatement result = new PostgreSQLCopyStatement();
        if (null != ctx.qualifiedName()) {
            result.setTableSegment((SimpleTableSegment) visit(ctx.qualifiedName()));
            if (null != ctx.columnNames()) {
                result.getColumns().addAll(((CollectionValue<ColumnSegment>) visit(ctx.columnNames())).getValue());
            }
        }
        if (null != ctx.preparableStmt()) {
            result.setPrepareStatementQuerySegment(extractPrepareStatementQuerySegmentFromPreparableStmt(ctx.preparableStmt()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/SQL92StatementVisitor.java`
#### Snippet
```java
        ExpressionSegment left = (ExpressionSegment) visit(ctx.booleanPrimary());
        ExpressionSegment right;
        if (null != ctx.predicate()) {
            right = (ExpressionSegment) visit(ctx.predicate());
        } else {
            right = (ExpressionSegment) visit(ctx.subquery());
        }
        String operator = null != ctx.SAFE_EQ_() ? ctx.SAFE_EQ_().getText() : ctx.comparisonOperator().getText();
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/SQL92StatementVisitor.java`
#### Snippet
```java
        calculateParameterCount(Collections.singleton(ctx.expr()));
        FunctionSegment result = new FunctionSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), ctx.CAST().getText(), getOriginalText(ctx));
        ASTNode exprSegment = visit(ctx.expr());
        if (exprSegment instanceof ColumnSegment) {
            result.getParameters().add((ColumnSegment) exprSegment);
        } else if (exprSegment instanceof LiteralExpressionSegment) {
            result.getParameters().add((LiteralExpressionSegment) exprSegment);
        }
        result.getParameters().add((DataTypeSegment) visit(ctx.dataType()));
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DDLStatementVisitor.java`
#### Snippet
```java
        CollectionValue<AlterDefinitionSegment> result = new CollectionValue<>();
        if (null != ctx.addColumnSpecification()) {
            result.getValue().addAll(((CollectionValue<AddColumnDefinitionSegment>) visit(ctx.addColumnSpecification())).getValue());
        }
        if (null != ctx.modifyColumnSpecification()) {
            result.getValue().add((ModifyColumnDefinitionSegment) visit(ctx.modifyColumnSpecification()));
        }
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        result.setTable((TableSegment) visit(ctx.tableReferences()));
        result.setSetAssignment((SetAssignmentSegment) visit(ctx.setAssignmentsClause()));
        if (null != ctx.whereClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereClause()));
        }
        result.getParameterMarkerSegments().addAll(getParameterMarkerSegments());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        ColumnSegment column = (ColumnSegment) visitColumnName(ctx.columnName());
        List<ColumnSegment> columnSegments = new LinkedList<>();
        columnSegments.add(column);
        ExpressionSegment value = (ExpressionSegment) visit(ctx.assignmentValue());
        AssignmentSegment result = new ColumnAssignmentSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(), columnSegments, value);
        result.getColumns().add(column);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        if (null != ctx.qualifiedShorthand()) {
            QualifiedShorthandContext shorthand = ctx.qualifiedShorthand();
            ShorthandProjectionSegment result = new ShorthandProjectionSegment(shorthand.getStart().getStartIndex(), shorthand.getStop().getStopIndex());
            IdentifierValue identifier = new IdentifierValue(shorthand.identifier().getText());
            result.setOwner(new OwnerSegment(shorthand.identifier().getStart().getStartIndex(), shorthand.identifier().getStop().getStopIndex(), identifier));
            return result;
        }
        AliasSegment alias = null == ctx.alias() ? null : (AliasSegment) visit(ctx.alias());
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
if (projection instanceof SubqueryExpressionSegment) {
            SubqueryExpressionSegment subqueryExpressionSegment = (SubqueryExpressionSegment) projection;
            String text = ctx.start.getInputStream().getText(new Interval(subqueryExpressionSegment.getStartIndex(), subqueryExpressionSegment.getStopIndex()));
            SubqueryProjectionSegment result = new SubqueryProjectionSegment(((SubqueryExpressionSegment) projection).getSubquery(), text);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof BinaryOperationExpression) {
            BinaryOperationExpression binaryExpression = (BinaryOperationExpression) projection;
            int startIndex = binaryExpression.getStartIndex();
            int stopIndex = null != alias ? alias.getStopIndex() : binaryExpression.getStopIndex();
            ExpressionProjectionSegment result = new ExpressionProjectionSegment(startIndex, stopIndex, binaryExpression.getText(), binaryExpression);
            result.setAlias(alias);
            return result;
        }
        if (projection instanceof ParameterMarkerExpressionSegment) {
            ParameterMarkerExpressionSegment result = (ParameterMarkerExpressionSegment) projection;
            result.setAlias(alias);
            return projection;
        }
        LiteralExpressionSegment column = (LiteralExpressionSegment) projection;
        ExpressionProjectionSegment result = null == alias ? new ExpressionProjectionSegment(column.getStartIndex(), column.getStopIndex(), String.valueOf(column.getLiterals()), column)
                : new ExpressionProjectionSegment(column.getStartIndex(), ctx.alias().stop.getStopIndex(), String.valueOf(column.getLiterals()), column);
        result.setAlias(alias);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sqlserver/src/main/java/org/apache/shardingsphere/sql/parser/sqlserver/visitor/statement/SQLServerStatementVisitor.java`
#### Snippet
```java
        if (projection instanceof ParameterMarkerExpressionSegment) {
            ParameterMarkerExpressionSegment result = (ParameterMarkerExpressionSegment) projection;
            result.setAlias(alias);
            return projection;
        }
        LiteralExpressionSegment column = (LiteralExpressionSegment) projection;
        ExpressionProjectionSegment result = null == alias ? new ExpressionProjectionSegment(column.getStartIndex(), column.getStopIndex(), String.valueOf(column.getLiterals()), column)
                : new ExpressionProjectionSegment(column.getStartIndex(), ctx.alias().stop.getStopIndex(), String.valueOf(column.getLiterals()), column);
        result.setAlias(alias);
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        JoinTableSegment result = new JoinTableSegment();
        result.setStartIndex(tableSegment.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        result.setLeft(tableSegment);
        result.setRight((TableSegment) visit(ctx));
        result.setJoinType(JoinType.COMMA.name());
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        TableSegment result;
        TableSegment left;
        left = (TableSegment) visit(ctx.tableFactor());
        if (!ctx.joinedTable().isEmpty()) {
            for (JoinedTableContext each : ctx.joinedTable()) {
                left = visitJoinedTable(each, left);
            }
        }
        result = left;
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/dialect/sql92/src/main/java/org/apache/shardingsphere/sql/parser/sql92/visitor/statement/type/SQL92DMLStatementVisitor.java`
#### Snippet
```java
        JoinTableSegment result = new JoinTableSegment();
        result.setLeft(tableSegment);
        result.setStartIndex(tableSegment.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        TableSegment right = (TableSegment) visit(ctx.tableFactor());
        result.setRight(right);
        result.setJoinType(getJoinType(ctx));
        if (null != ctx.joinSpecification()) {
            visitJoinSpecification(ctx.joinSpecification(), result);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `parser/sql/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SQLUtils.java`
#### Snippet
```java
        if (result.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) >= 0 && result.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) <= 0) {
            return result.intValue();
        }
        if (result.compareTo(new BigInteger(String.valueOf(Long.MIN_VALUE))) >= 0 && result.compareTo(new BigInteger(String.valueOf(Long.MAX_VALUE))) <= 0) {
            return result.longValue();
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/connector/jdbc/transaction/BackendTransactionManager.java`
#### Snippet
```java
        if (exceptions.isEmpty()) {
            return;
        }
        Iterator<SQLException> iterator = exceptions.iterator();
        SQLException firstException = iterator.next();
        while (iterator.hasNext()) {
            firstException.setNextException(iterator.next());
        }
        throw firstException;
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/QueryableRALBackendHandler.java`
#### Snippet
```java
        List<QueryResponseCell> cells = new ArrayList<>(queryHeaders.size());
        for (int i = 0; i < queryHeaders.size(); i++) {
            cells.add(new QueryResponseCell(queryHeaders.get(i).getColumnType(), mergedResult.getValue(i + 1, Object.class)));
        }
        return new QueryResponseRow(cells);
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/common/checker/EncryptRuleConfigurationImportChecker.java`
#### Snippet
```java
        Collection<String> tableNames = currentRuleConfig.getTables().stream().map(EncryptTableRuleConfiguration::getName).collect(Collectors.toList());
        Collection<String> duplicatedTables = tableNames.stream().collect(Collectors.groupingBy(each -> each, Collectors.counting())).entrySet().stream()
                .filter(each -> each.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ExportMetaDataExecutor.java`
#### Snippet
```java
        if (sqlStatement.getFilePath().isPresent()) {
            String filePath = sqlStatement.getFilePath().get();
            ExportUtils.exportToFile(filePath, exportedData);
            return Collections.singleton(new LocalDataQueryResultRow(ProxyContext.getInstance().getContextManager().getInstanceContext().getInstance().getCurrentInstanceId(), LocalDateTime.now(),
                    String.format("Successfully exported to：'%s'", filePath)));
        }
        return Collections.singleton(
                new LocalDataQueryResultRow(ProxyContext.getInstance().getContextManager().getInstanceContext().getInstance().getCurrentInstanceId(), LocalDateTime.now(), exportedData));
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowStatusFromReadwriteSplittingRulesExecutor.java`
#### Snippet
```java
        String result = sqlStatement.getDatabase().isPresent() ? sqlStatement.getDatabase().get().getIdentifier().getValue() : connectionSession.getDatabaseName();
        if (Strings.isNullOrEmpty(result)) {
            throw new NoDatabaseSelectedException();
        }
        if (!ProxyContext.getInstance().databaseExists(result)) {
            throw new UnknownDatabaseException(result);
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rdl/storage/unit/AlterStorageUnitBackendHandler.java`
#### Snippet
```java
        Map<String, DataSource> storageUnits = ProxyContext.getInstance().getDatabase(databaseName).getResourceMetaData().getDataSources();
        Collection<String> notExistedStorageUnitNames = storageUnitNames.stream().filter(each -> !storageUnits.containsKey(each)).collect(Collectors.toList());
        ShardingSpherePreconditions.checkState(notExistedStorageUnitNames.isEmpty(), () -> new MissingRequiredStorageUnitsException(databaseName, notExistedStorageUnitNames));
```

### DuplicatedCode
Duplicated code
in `proxy/backend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/backend/mysql/handler/admin/executor/ShowFunctionStatusExecutor.java`
#### Snippet
```java
        List<RawQueryResultColumnMetaData> columns = new ArrayList<>();
        columns.add(new RawQueryResultColumnMetaData("", "Db", "Db", Types.VARCHAR, "VARCHAR", 255, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Name", "Name", Types.VARCHAR, "VARCHAR", 255, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Type", "Type", Types.VARCHAR, "VARCHAR", 64, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Definer", "Definer", Types.VARCHAR, "VARCHAR", 64, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Modified", "Modified", Types.VARCHAR, "VARCHAR", 64, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Created", "Created", Types.VARCHAR, "VARCHAR", 64, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Security_type", "Security_type", Types.VARCHAR, "VARCHAR", 64, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Comment", "Comment", Types.VARCHAR, "VARCHAR", 120, 0));
        columns.add(new RawQueryResultColumnMetaData("", "character_set_client", "character_set_client", Types.VARCHAR, "VARCHAR", 20, 0));
        columns.add(new RawQueryResultColumnMetaData("", "collation_connection", "collation_connection", Types.VARCHAR, "VARCHAR", 20, 0));
        columns.add(new RawQueryResultColumnMetaData("", "Database_Collation", "Database_Collation", Types.VARCHAR, "VARCHAR", 20, 0));
        return new RawQueryResultMetaData(columns);
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/frontend/mysql/command/MySQLCommandExecuteEngine.java`
#### Snippet
```java
            count++;
            while (!context.channel().isWritable() && context.channel().isActive()) {
                context.flush();
                databaseConnectionManager.getResourceLock().doAwait();
            }
            DatabasePacket dataValue = queryCommandExecutor.getQueryRowPacket();
            context.write(dataValue);
            if (flushThreshold == count) {
                context.flush();
                count = 0;
            }
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/authentication/OpenGaussAuthenticationEngine.java`
#### Snippet
```java
        if (SSL_REQUEST_PAYLOAD_LENGTH == payload.getByteBuf().markReaderIndex().readInt() && SSL_REQUEST_CODE == payload.getByteBuf().readInt()) {
            if (ProxySSLContext.getInstance().isSSLEnabled()) {
                SslHandler sslHandler = new SslHandler(ProxySSLContext.getInstance().newSSLEngine(context.alloc()), true);
                context.pipeline().addFirst(SslHandler.class.getSimpleName(), sslHandler);
                context.writeAndFlush(new PostgreSQLSSLWillingPacket());
            } else {
                context.writeAndFlush(new PostgreSQLSSLUnwillingPacket());
            }
            return AuthenticationResultBuilder.continued();
        }
        payload.getByteBuf().resetReaderIndex();
        AuthorityRule rule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        return startupMessageReceived ? processPasswordMessage(context, (PostgreSQLPacketPayload) payload, rule) : processStartupMessage(context, (PostgreSQLPacketPayload) payload, rule);
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/authentication/OpenGaussAuthenticationEngine.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkState(Strings.isNullOrEmpty(databaseName) || ProxyContext.getInstance().databaseExists(databaseName), () -> new UnknownDatabaseException(databaseName));
        Grantee grantee = new Grantee(username, "%");
        Optional<ShardingSphereUser> user = rule.findUser(grantee);
        ShardingSpherePreconditions.checkState(user.isPresent(), () -> new UnknownUsernameException(username));
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/authentication/OpenGaussAuthenticationEngine.java`
#### Snippet
```java
        startupMessageReceived = true;
        PostgreSQLComStartupPacket startupPacket = new PostgreSQLComStartupPacket(payload);
        clientEncoding = startupPacket.getClientEncoding();
        context.channel().attr(CommonConstants.CHARSET_ATTRIBUTE_KEY).set(PostgreSQLCharacterSets.findCharacterSet(clientEncoding));
        String username = startupPacket.getUsername();
        ShardingSpherePreconditions.checkState(!Strings.isNullOrEmpty(username), EmptyUsernameException::new);
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/command/OpenGaussCommandExecutorFactory.java`
#### Snippet
```java
        if (commandPacket instanceof SQLReceivedPacket) {
            log.debug("Execute packet type: {}, sql: {}", commandPacketType, ((SQLReceivedPacket) commandPacket).getSQL());
        } else {
            log.debug("Execute packet type: {}", commandPacketType);
        }
        if (!(commandPacket instanceof PostgreSQLAggregatedCommandPacket)) {
            return getCommandExecutor(commandPacketType, commandPacket, connectionSession, portalContext);
        }
        PostgreSQLAggregatedCommandPacket aggregatedCommandPacket = (PostgreSQLAggregatedCommandPacket) commandPacket;
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/command/query/simple/OpenGaussComQueryExecutor.java`
#### Snippet
```java
        Collection<PostgreSQLColumnDescription> result = new LinkedList<>();
        int columnIndex = 0;
        for (QueryHeader each : queryResponseHeader.getQueryHeaders()) {
            result.add(new PostgreSQLColumnDescription(each.getColumnLabel(), ++columnIndex, each.getColumnType(), each.getColumnLength(), each.getColumnTypeName()));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/command/query/simple/OpenGaussComQueryExecutor.java`
#### Snippet
```java
        SQLStatement sqlStatement = updateResponseHeader.getSqlStatement();
        if (sqlStatement instanceof CommitStatement || sqlStatement instanceof RollbackStatement) {
            portalContext.closeAll();
        }
        if (sqlStatement instanceof SetStatement) {
            return createParameterStatusResponse((SetStatement) sqlStatement);
        }
        return Collections.singletonList(sqlStatement instanceof EmptyStatement ? new PostgreSQLEmptyQueryResponsePacket()
                : new PostgreSQLCommandCompletePacket(PostgreSQLCommand.valueOf(sqlStatement.getClass()).map(PostgreSQLCommand::getTag).orElse(""), updateResponseHeader.getUpdateCount()));
```

### DuplicatedCode
Duplicated code
in `proxy/frontend/type/opengauss/src/main/java/org/apache/shardingsphere/proxy/frontend/opengauss/command/query/simple/OpenGaussComQueryExecutor.java`
#### Snippet
```java
        Collection<DatabasePacket> result = new ArrayList<>(2);
        result.add(new PostgreSQLCommandCompletePacket("SET", 0));
        for (VariableAssignSegment each : sqlStatement.getVariableAssigns()) {
            result.add(new PostgreSQLParameterStatusPacket(each.getVariable().getVariable(), IdentifierValue.getQuotedContent(each.getAssignValue())));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/segment/column/ColumnAssert.java`
#### Snippet
```java
        if (null == expected.getOwner()) {
            assertFalse(actual.getOwner().isPresent(), assertContext.getText("Actual owner should not exist."));
        } else {
            assertTrue(actual.getOwner().isPresent(), assertContext.getText("Actual owner should exist."));
            OwnerAssert.assertIs(assertContext, actual.getOwner().get(), expected.getOwner());
        }
        SQLSegmentAssert.assertIs(assertContext, actual, expected);
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowEventsStatementAssert.java`
#### Snippet
```java
        if (actual.getFromSchema().isPresent()) {
            DatabaseAssert.assertIs(assertContext, actual.getFromSchema().get().getSchema(), expected.getFromSchema().getSchema());
            SQLSegmentAssert.assertIs(assertContext, actual.getFromSchema().get(), expected.getFromSchema());
        }
        if (actual.getFilter().isPresent()) {
            ShowFilterAssert.assertIs(assertContext, actual.getFilter().get(), expected.getFilter());
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dcl/impl/AlterLoginStatementAssert.java`
#### Snippet
```java
        if (null == expected.getLogin()) {
            assertNull(actual.getLoginSegment(), assertContext.getText("Actual login should not exist."));
        } else {
            assertNotNull(actual.getLoginSegment(), assertContext.getText("Actual login should exist."));
            assertThat(assertContext.getText("Login name assertion error: "), actual.getLoginSegment().getLoginName().getValueWithQuoteCharacters(), is(expected.getLogin().getName()));
            SQLSegmentAssert.assertIs(assertContext, actual.getLoginSegment(), expected.getLogin());
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AlterTableStatementAssert.java`
#### Snippet
```java
            ColumnDefinitionAssert.assertIs(assertContext, each.getColumnDefinition(), expectedModifyColumnDefinition.getColumnDefinition());
            if (each.getColumnPosition().isPresent()) {
                assertNotNull(expectedModifyColumnDefinition.getColumnPosition(), assertContext.getText("Column position should exist."));
                ColumnPositionAssert.assertIs(assertContext, each.getColumnPosition().get(), expectedModifyColumnDefinition.getColumnPosition());
            } else {
                assertNull(expectedModifyColumnDefinition.getColumnPosition(), assertContext.getText("Column position should not exist."));
            }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ddl/impl/AssociateStatisticsStatementAssert.java`
#### Snippet
```java
        assertTables(assertContext, actual, expected);
        assertColumns(assertContext, actual, expected);
        assertIndexes(assertContext, actual, expected);
        assertFunctions(assertContext, actual, expected);
        assertPackages(assertContext, actual, expected);
        assertTypes(assertContext, actual, expected);
        assertIndexTypes(assertContext, actual, expected);
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dml/impl/CallStatementAssert.java`
#### Snippet
```java
        if (actual instanceof ParameterMarkerExpressionSegment) {
            ExpressionAssert.assertParameterMarkerExpression(assertContext, (ParameterMarkerExpressionSegment) actual, expected.getParameterMarkerExpression());
        } else if (actual instanceof LiteralExpressionSegment) {
            ExpressionAssert.assertLiteralExpression(assertContext, (LiteralExpressionSegment) actual, expected.getLiteralExpression());
        } else if (actual instanceof CommonExpressionSegment) {
            ExpressionAssert.assertCommonExpression(assertContext, (CommonExpressionSegment) actual, expected.getCommonExpression());
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dml/impl/DeleteStatementAssert.java`
#### Snippet
```java
        if (null == expected.getLimitClause()) {
            assertFalse(limitSegment.isPresent(), assertContext.getText("Actual limit segment should not exist."));
        } else {
            assertTrue(limitSegment.isPresent(), assertContext.getText("Actual limit segment should exist."));
            LimitClauseAssert.assertRowCount(assertContext, limitSegment.get().getRowCount().orElse(null), expected.getLimitClause().getRowCount());
            SQLSegmentAssert.assertIs(assertContext, limitSegment.get(), expected.getLimitClause());
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/AlterStorageUnitStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual storage unit should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual storage unit should exist."));
            assertThat(assertContext.getText(String.format("Actual storage unit size should be %s , but it was %s", expected.size(), actual.size())), actual.size(), is(expected.size()));
            int count = 0;
            for (DataSourceSegment actualDataSource : actual) {
                DataSourceAssert.assertIs(assertContext, actualDataSource, expected.get(count));
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterDefaultShardingStrategyStatementAssert.java`
#### Snippet
```java
            assertThat(assertContext.getText(String.format("`%s`'s default sharding strategy segment assertion error: ", actual.getClass().getSimpleName())),
                    actual.getDefaultType(), is(expected.getStrategy().getDefaultType()));
            assertThat(assertContext.getText(String.format("`%s`'s default sharding strategy segment assertion error: ", actual.getClass().getSimpleName())),
                    actual.getShardingColumn(), is(expected.getStrategy().getShardingColumn()));
            assertThat(assertContext.getText(String.format("`%s`'s default sharding strategy segment assertion error: ", actual.getClass().getSimpleName())),
                    actual.getStrategyType(), is(expected.getStrategy().getStrategyType()));
            if (!"none".equalsIgnoreCase(actual.getStrategyType())) {
                assertThat(assertContext.getText(String.format("`%s`'s default sharding strategy segment assertion error: ", actual.getClass().getSimpleName())),
                        actual.getAlgorithmSegment().getName(), is(expected.getStrategy().getAlgorithmSegment().getName()));
            }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterReadwriteSplittingRuleStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual readwrite-splitting rule should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual readwrite-splitting rule should exist."));
            assertThat(assertContext.getText(String.format("Actual readwrite-splitting rule size should be %s , but it was %s", expected.size(), actual.size())), actual.size(), is(expected.size()));
            int count = 0;
            for (ReadwriteSplittingRuleSegment readwriteSplittingRuleSegment : actual) {
                ExceptedReadwriteSplittingRule exceptedReadwriteSplittingRule = expected.get(count);
                ReadwriteSplittingRuleAssert.assertIs(assertContext, readwriteSplittingRuleSegment, exceptedReadwriteSplittingRule);
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterShadowRuleStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual shadow rule should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual shadow rule should exist."));
            int count = 0;
            for (ShadowRuleSegment tableRuleSegment : actual) {
                ExpectedShadowRule expectedTableRule = expected.get(count);
                ShadowRuleAssert.assertIs(assertContext, tableRuleSegment, expectedTableRule);
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterShardingTableReferenceRulesStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual sharding table reference rule should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual sharding table reference rule should exist."));
            assertThat(assertContext.getText(String.format("Actual sharding table reference rule size should be %s , but it was %s", expected.size(), actual.size())),
                    actual.size(), is(expected.size()));
            int count = 0;
            for (TableReferenceRuleSegment shardingTableReferenceRuleSegment : actual) {
                ExpectedShardingTableReferenceRule expectedShardingTableReferenceRule = expected.get(count);
                ShardingTableReferenceRuleAssert.assertIs(assertContext, shardingTableReferenceRuleSegment, expectedShardingTableReferenceRule);
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterShardingTableRuleStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual sharding auto table rule should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual sharding auto table rule should exist."));
            int count = 0;
            for (AutoTableRuleSegment tableRuleSegment : actual) {
                ExpectedAutoTableRule expectedTableRule = expected.get(count);
                AutoTableRuleAssert.assertIs(assertContext, tableRuleSegment, expectedTableRule);
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/rdl/alter/impl/AlterShardingTableRuleStatementAssert.java`
#### Snippet
```java
        if (null == expected) {
            assertNull(actual, assertContext.getText("Actual sharding table rule should not exist."));
        } else {
            assertNotNull(actual, assertContext.getText("Actual sharding table rule should exist."));
            int count = 0;
            for (TableRuleSegment tableRuleSegment : actual) {
                ExpectedTableRule expectedTableRule = expected.get(count);
                TableRuleAssert.assertIs(assertContext, tableRuleSegment, expectedTableRule);
                count++;
            }
        }
```

### DuplicatedCode
Duplicated code
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/tcl/impl/LockStatementAssert.java`
#### Snippet
```java
            if (null == expected.getTables() || expected.getTables().isEmpty()) {
                assertTrue(lockStatement.getTables().isEmpty(), assertContext.getText("Actual lock statement should not exist."));
            } else {
                assertFalse(lockStatement.getTables().isEmpty(), assertContext.getText("Actual lock statement should exist."));
                int count = 0;
                for (SimpleTableSegment each : lockStatement.getTables()) {
                    TableAssert.assertIs(assertContext, each, expected.getTables().get(count));
                    count++;
                }
            }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getInstanceOnlinePathMatcher(final String onlineInstancePath) {
        return Pattern.compile(ComputeNode.getOnlineInstanceNodePath() + "/([\\S]+)/([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(onlineInstancePath);
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getInstanceOnlinePathMatcher(final String onlineInstancePath) {
        return Pattern.compile(ComputeNode.getOnlineInstanceNodePath() + "/([\\S]+)/([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(onlineInstancePath);
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getShowProcessListTriggerMatcher(final DataChangedEvent event) {
        return Pattern.compile(ComputeNode.getShowProcessListTriggerNodePath() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(event.getKey());
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getShowProcessListTriggerMatcher(final DataChangedEvent event) {
        return Pattern.compile(ComputeNode.getShowProcessListTriggerNodePath() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE).matcher(event.getKey());
    }
    
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getKillProcessTriggerMatcher(final DataChangedEvent event) {
        Pattern pattern = Pattern.compile(ComputeNode.getKillProcessTriggerNodePath() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(event.getKey());
    }
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `mode/type/cluster/core/src/main/java/org/apache/shardingsphere/mode/manager/cluster/coordinator/registry/status/compute/watcher/ComputeNodeStateChangedWatcher.java`
#### Snippet
```java
    
    private Matcher getKillProcessTriggerMatcher(final DataChangedEvent event) {
        Pattern pattern = Pattern.compile(ComputeNode.getKillProcessTriggerNodePath() + "/([\\S]+):([\\S]+)$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(event.getKey());
    }
```

### RegExpSimplifiable
`[\\S]` can be simplified to '\\S'
in `kernel/metadata/core/src/main/java/org/apache/shardingsphere/metadata/persist/node/ComputeNode.java`
#### Snippet
```java
     */
    public static String getInstanceIdByComputeNode(final String computeNodePath) {
        Pattern pattern = Pattern.compile(getComputeNodePath() + "(/status|/worker_id|/labels)" + "/([\\S]+)$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(computeNodePath);
        return matcher.find() ? matcher.group(2) : "";
```

## RuleId[id=Deprecation]
### Deprecation
'setSchemaName(java.lang.String)' is deprecated
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/data/pipeline/datasource/creator/ShardingSpherePipelineDataSourceCreator.java`
#### Snippet
```java
        ShardingRuleConfigurationConverter.findYamlShardingRuleConfiguration(rootConfig.getRules()).ifPresent(this::enableRangeQueryForInline);
        rootConfig.setDatabaseName(rootConfig.getDatabaseName());
        rootConfig.setSchemaName(rootConfig.getSchemaName());
        return YamlShardingSphereDataSourceFactory.createDataSourceWithoutCache(rootConfig);
    }
```

### Deprecation
'getSchemaName()' is deprecated
in `jdbc/core/src/main/java/org/apache/shardingsphere/driver/data/pipeline/datasource/creator/ShardingSpherePipelineDataSourceCreator.java`
#### Snippet
```java
        ShardingRuleConfigurationConverter.findYamlShardingRuleConfiguration(rootConfig.getRules()).ifPresent(this::enableRangeQueryForInline);
        rootConfig.setDatabaseName(rootConfig.getDatabaseName());
        rootConfig.setSchemaName(rootConfig.getSchemaName());
        return YamlShardingSphereDataSourceFactory.createDataSourceWithoutCache(rootConfig);
    }
```

### Deprecation
'Representer()' is deprecated
in `infra/util/src/main/java/org/apache/shardingsphere/infra/util/yaml/representer/ShardingSphereYamlRepresenter.java`
#### Snippet
```java
public final class ShardingSphereYamlRepresenter extends Representer {
    
    public ShardingSphereYamlRepresenter() {
        Map<String, Class<?>> yamlShortcuts = new HashMap<>();
        ShardingSphereServiceLoader.getServiceInstances(ShardingSphereYamlShortcuts.class).stream().map(ShardingSphereYamlShortcuts::getYamlShortcuts).forEach(yamlShortcuts::putAll);
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/ExportUtils.java`
#### Snippet
```java
        } else if (ruleConfig instanceof EncryptRuleConfiguration) {
            return ((EncryptRuleConfiguration) ruleConfig).getTables().isEmpty();
        } else if (ruleConfig instanceof CompatibleEncryptRuleConfiguration) {
            return ((CompatibleEncryptRuleConfiguration) ruleConfig).getTables().isEmpty();
        } else if (ruleConfig instanceof ShadowRuleConfiguration) {
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/ExportUtils.java`
#### Snippet
```java
            return ((EncryptRuleConfiguration) ruleConfig).getTables().isEmpty();
        } else if (ruleConfig instanceof CompatibleEncryptRuleConfiguration) {
            return ((CompatibleEncryptRuleConfiguration) ruleConfig).getTables().isEmpty();
        } else if (ruleConfig instanceof ShadowRuleConfiguration) {
            return ((ShadowRuleConfiguration) ruleConfig).getTables().isEmpty();
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.config.YamlCompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
                ruleConfigsMap.computeIfAbsent(swapper.getOrder(), key -> new LinkedList<>());
                ruleConfigsMap.get(swapper.getOrder()).add(readwriteSplittingRuleConfig);
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                CompatibleEncryptRuleConfiguration encryptRuleConfig = swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each);
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.swapper.YamlCompatibleEncryptRuleConfigurationSwapper' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
                ruleConfigsMap.get(swapper.getOrder()).add(readwriteSplittingRuleConfig);
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                CompatibleEncryptRuleConfiguration encryptRuleConfig = swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each);
                ruleConfigsMap.computeIfAbsent(swapper.getOrder(), key -> new LinkedList<>());
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.swapper.YamlCompatibleEncryptRuleConfigurationSwapper' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
                ruleConfigsMap.get(swapper.getOrder()).add(readwriteSplittingRuleConfig);
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                CompatibleEncryptRuleConfiguration encryptRuleConfig = swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each);
                ruleConfigsMap.computeIfAbsent(swapper.getOrder(), key -> new LinkedList<>());
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                CompatibleEncryptRuleConfiguration encryptRuleConfig = swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each);
                ruleConfigsMap.computeIfAbsent(swapper.getOrder(), key -> new LinkedList<>());
                ruleConfigsMap.get(swapper.getOrder()).add(encryptRuleConfig);
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.config.YamlCompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                CompatibleEncryptRuleConfiguration encryptRuleConfig = swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each);
                ruleConfigsMap.computeIfAbsent(swapper.getOrder(), key -> new LinkedList<>());
                ruleConfigsMap.get(swapper.getOrder()).add(encryptRuleConfig);
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
        } else if (ruleConfig instanceof EncryptRuleConfiguration) {
            ruleConfigs.forEach(each -> addEncryptRuleConfiguration((EncryptRuleConfiguration) each, allRuleConfigs, database));
        } else if (ruleConfig instanceof CompatibleEncryptRuleConfiguration) {
            ruleConfigs.forEach(each -> addEncryptRuleConfiguration(((CompatibleEncryptRuleConfiguration) each).convertToEncryptRuleConfiguration(), allRuleConfigs, database));
        } else if (ruleConfig instanceof ShadowRuleConfiguration) {
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/util/YamlDatabaseConfigurationImportExecutor.java`
#### Snippet
```java
            ruleConfigs.forEach(each -> addEncryptRuleConfiguration((EncryptRuleConfiguration) each, allRuleConfigs, database));
        } else if (ruleConfig instanceof CompatibleEncryptRuleConfiguration) {
            ruleConfigs.forEach(each -> addEncryptRuleConfiguration(((CompatibleEncryptRuleConfiguration) each).convertToEncryptRuleConfiguration(), allRuleConfigs, database));
        } else if (ruleConfig instanceof ShadowRuleConfiguration) {
            ruleConfigs.forEach(each -> addShadowRuleConfiguration((ShadowRuleConfiguration) each, allRuleConfigs, database));
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rql/rule/ShowRulesUsedStorageUnitExecutor.java`
#### Snippet
```java
        }
        EncryptRuleConfiguration ruleConfig =
                rule.get().getConfiguration() instanceof CompatibleEncryptRuleConfiguration ? ((CompatibleEncryptRuleConfiguration) rule.get().getConfiguration()).convertToEncryptRuleConfiguration()
                        : (EncryptRuleConfiguration) rule.get().getConfiguration();
        return ruleConfig.getTables().stream().map(each -> buildRow(ENCRYPT, each.getName())).collect(Collectors.toList());
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/rql/rule/ShowRulesUsedStorageUnitExecutor.java`
#### Snippet
```java
        }
        EncryptRuleConfiguration ruleConfig =
                rule.get().getConfiguration() instanceof CompatibleEncryptRuleConfiguration ? ((CompatibleEncryptRuleConfiguration) rule.get().getConfiguration()).convertToEncryptRuleConfiguration()
                        : (EncryptRuleConfiguration) rule.get().getConfiguration();
        return ruleConfig.getTables().stream().map(each -> buildRow(ENCRYPT, each.getName())).collect(Collectors.toList());
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
            } else if (each instanceof EncryptRuleConfiguration) {
                appendEncryptDistSQL((EncryptRuleConfiguration) each, result);
            } else if (each instanceof CompatibleEncryptRuleConfiguration) {
                appendEncryptDistSQL(((CompatibleEncryptRuleConfiguration) each).convertToEncryptRuleConfiguration(), result);
            } else if (each instanceof ShadowRuleConfiguration) {
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
                appendEncryptDistSQL((EncryptRuleConfiguration) each, result);
            } else if (each instanceof CompatibleEncryptRuleConfiguration) {
                appendEncryptDistSQL(((CompatibleEncryptRuleConfiguration) each).convertToEncryptRuleConfiguration(), result);
            } else if (each instanceof ShadowRuleConfiguration) {
                appendShadowDistSQL((ShadowRuleConfiguration) each, result);
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.config.YamlCompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
                YamlEncryptRuleConfigurationSwapper swapper = new YamlEncryptRuleConfigurationSwapper();
                result.put(swapper.getOrder(), swapper.swapToObject((YamlEncryptRuleConfiguration) each));
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                result.put(swapper.getOrder(), swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each));
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.swapper.YamlCompatibleEncryptRuleConfigurationSwapper' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
                result.put(swapper.getOrder(), swapper.swapToObject((YamlEncryptRuleConfiguration) each));
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                result.put(swapper.getOrder(), swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each));
            } else if (each instanceof YamlShadowRuleConfiguration) {
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.swapper.YamlCompatibleEncryptRuleConfigurationSwapper' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
                result.put(swapper.getOrder(), swapper.swapToObject((YamlEncryptRuleConfiguration) each));
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                result.put(swapper.getOrder(), swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each));
            } else if (each instanceof YamlShadowRuleConfiguration) {
```

### Deprecation
'org.apache.shardingsphere.encrypt.yaml.config.YamlCompatibleEncryptRuleConfiguration' is deprecated
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ConvertYamlConfigurationExecutor.java`
#### Snippet
```java
            } else if (each instanceof YamlCompatibleEncryptRuleConfiguration) {
                YamlCompatibleEncryptRuleConfigurationSwapper swapper = new YamlCompatibleEncryptRuleConfigurationSwapper();
                result.put(swapper.getOrder(), swapper.swapToObject((YamlCompatibleEncryptRuleConfiguration) each));
            } else if (each instanceof YamlShadowRuleConfiguration) {
                YamlShadowRuleConfigurationSwapper swapper = new YamlShadowRuleConfigurationSwapper();
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperand, org.apache.calcite.plan.RelOptRuleOperand...)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableFilterRule.java`
#### Snippet
```java
    
    public TranslatableFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalFilter.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableFilterRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperandChildren)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableFilterRule.java`
#### Snippet
```java
    
    public TranslatableFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalFilter.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableFilterRule");
    }
    
```

### Deprecation
'none()' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableFilterRule.java`
#### Snippet
```java
    
    public TranslatableFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalFilter.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableFilterRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperand, org.apache.calcite.plan.RelOptRuleOperand...)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectRule.java`
#### Snippet
```java
    
    public TranslatableProjectRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableProjectRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperandChildren)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectRule.java`
#### Snippet
```java
    
    public TranslatableProjectRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableProjectRule");
    }
    
```

### Deprecation
'none()' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectRule.java`
#### Snippet
```java
    
    public TranslatableProjectRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(TranslatableTableScan.class, none())), relBuilderFactory, "TranslatableProjectRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperand, org.apache.calcite.plan.RelOptRuleOperand...)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
    
    public TranslatableProjectFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(LogicalFilter.class, operand(TranslatableTableScan.class, none()))), relBuilderFactory, "TranslatableProjectFilterRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperand, org.apache.calcite.plan.RelOptRuleOperand...)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
    
    public TranslatableProjectFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(LogicalFilter.class, operand(TranslatableTableScan.class, none()))), relBuilderFactory, "TranslatableProjectFilterRule");
    }
    
```

### Deprecation
'operand(java.lang.Class, org.apache.calcite.plan.RelOptRuleOperandChildren)' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
    
    public TranslatableProjectFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(LogicalFilter.class, operand(TranslatableTableScan.class, none()))), relBuilderFactory, "TranslatableProjectFilterRule");
    }
    
```

### Deprecation
'none()' is deprecated
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/metadata/translatable/TranslatableProjectFilterRule.java`
#### Snippet
```java
    
    public TranslatableProjectFilterRule(final RelBuilderFactory relBuilderFactory) {
        super(operand(LogicalProject.class, operand(LogicalFilter.class, operand(TranslatableTableScan.class, none()))), relBuilderFactory, "TranslatableProjectFilterRule");
    }
    
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/query/ShowEncryptRuleExecutor.java`
#### Snippet
```java
        Collection<LocalDataQueryResultRow> result = new LinkedList<>();
        if (rule.isPresent()) {
            EncryptRuleConfiguration ruleConfig = rule.get().getConfiguration() instanceof CompatibleEncryptRuleConfiguration
                    ? ((CompatibleEncryptRuleConfiguration) rule.get().getConfiguration()).convertToEncryptRuleConfiguration()
                    : (EncryptRuleConfiguration) rule.get().getConfiguration();
```

### Deprecation
'org.apache.shardingsphere.encrypt.api.config.CompatibleEncryptRuleConfiguration' is deprecated
in `features/encrypt/distsql/handler/src/main/java/org/apache/shardingsphere/encrypt/distsql/handler/query/ShowEncryptRuleExecutor.java`
#### Snippet
```java
        if (rule.isPresent()) {
            EncryptRuleConfiguration ruleConfig = rule.get().getConfiguration() instanceof CompatibleEncryptRuleConfiguration
                    ? ((CompatibleEncryptRuleConfiguration) rule.get().getConfiguration()).convertToEncryptRuleConfiguration()
                    : (EncryptRuleConfiguration) rule.get().getConfiguration();
            result = buildData(ruleConfig, sqlStatement);
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `infra/common/src/main/java/org/apache/shardingsphere/infra/datasource/pool/destroyer/DataSourcePoolDestroyer.java`
#### Snippet
```java
        while (dataSourcePoolActiveDetector.containsActiveConnection(dataSource)) {
            try {
                Thread.sleep(10L);
            } catch (final InterruptedException ignore) {
                Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `proxy/backend/type/hbase/src/main/java/org/apache/shardingsphere/proxy/backend/hbase/context/HBaseRegionWarmUpContext.java`
#### Snippet
```java
        while (executeCount.get() < tableCount.get()) {
            try {
                Thread.sleep(100L);
            } catch (final InterruptedException ignore) {
                Thread.currentThread().interrupt();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/core/connector/SocketSinkImporterConnector.java`
#### Snippet
```java
                }
                if (dataRecords.isEmpty()) {
                    Thread.sleep(200L);
                } else {
                    writeImmediately(dataRecords, cdcAckPositionMap);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/importer/DataSourceImporter.java`
#### Snippet
```java
                    throw new PipelineImporterJobWriteException(ex);
                }
                Thread.sleep(Math.min(5 * 60 * 1000L, 1000L << i));
            }
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `kernel/data-pipeline/dialect/opengauss/src/main/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/OpenGaussWALDumper.java`
#### Snippet
```java
                ByteBuffer message = stream.readPending();
                if (null == message) {
                    Thread.sleep(10L);
                    continue;
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `kernel/data-pipeline/dialect/postgresql/src/main/java/org/apache/shardingsphere/data/pipeline/postgresql/ingest/PostgreSQLWALDumper.java`
#### Snippet
```java
                ByteBuffer message = stream.readPending();
                if (null == message) {
                    Thread.sleep(10L);
                    continue;
                }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '{'
in `infra/expr/hotsopt/src/main/java/org/apache/shardingsphere/infra/expr/hotsopt/HotspotInlineExpressionParser.java`
#### Snippet
```java
    @Override
    public String handlePlaceHolder(final String inlineExpression) {
        return inlineExpression.contains("$->{") ? inlineExpression.replaceAll("\\$->\\{", "\\$\\{") : inlineExpression;
    }
    
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/PostgreSQLCommandPacketType.java`
#### Snippet
```java
     */
    public static boolean isExtendedProtocolPacketType(final CommandPacketType commandPacketType) {
        return EXTENDED_PROTOCOL_PACKET_TYPES.contains(commandPacketType);
    }
}
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/metadata/SchemaTableName.java`
#### Snippet
```java
    private final SchemaName schemaName;
    
    @NonNull
    private final TableName tableName;
}
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
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/DataMatchCalculatedResult.java`
#### Snippet
```java
public final class DataMatchCalculatedResult implements DataConsistencyCalculatedResult {
    
    @NonNull
    private final Object maxUniqueKeyValue;
    
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/check/consistency/algorithm/AbstractStreamingDataConsistencyCalculateAlgorithm.java`
#### Snippet
```java
        
        @Override
        public Iterator<DataConsistencyCalculatedResult> iterator() {
            return new ResultIterator(param);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/merge/dql/orderby/OrderByValue.java`
#### Snippet
```java
    
    @Override
    public int compareTo(final OrderByValue orderByValue) {
        int i = 0;
        for (OrderByItem each : orderByItems) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `actual.getColumnWild().isPresent()` is always 'false'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ExplainStatementAssert.java`
#### Snippet
```java
                ColumnAssert.assertIs(assertContext, actual.getColumnWild().get(), expected.getColumn());
            } else {
                assertFalse(actual.getColumnWild().isPresent(), assertContext.getText("Actual column wild should not exist."));
            }
        } else {
```

### ConstantValue
Result of `actual.getTable().isPresent()` is always 'false'
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ExplainStatementAssert.java`
#### Snippet
```java
            }
        } else {
            assertFalse(actual.getTable().isPresent(), assertContext.getText("Actual table should not exist."));
        }
    }
```

### ConstantValue
Condition `child instanceof PrecisionContext` is always `false` when reached
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
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
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/format/MySQLFormatVisitor.java`
#### Snippet
```java
        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            if (i != 0 && !(child instanceof FieldLengthContext || child instanceof PrecisionContext || child instanceof StringListContext || child instanceof TypeDatetimePrecisionContext)) {
                formatPrint(" ");
            }
```

### ConstantValue
Value `ctx` is always 'null'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDCLStatementVisitor.java`
#### Snippet
```java
            
        }
        if (ctx instanceof GrantLevelSchemaGlobalContext) {
            String schemaName = new IdentifierValue(((GrantLevelSchemaGlobalContext) ctx).schemaName().getText()).getValue();
            return new GrantLevelSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), schemaName, "*");
```

### ConstantValue
Value `ctx` is always 'null'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDCLStatementVisitor.java`
#### Snippet
```java
        String schemaName = null;
        String tableName;
        if (null != ((GrantLevelTableContext) ctx).tableName().owner()) {
            schemaName = new IdentifierValue(((GrantLevelTableContext) ctx).tableName().owner().getText()).getValue();
        }
```

### ConstantValue
Value `each` is always 'null'
in `parser/sql/dialect/mysql/src/main/java/org/apache/shardingsphere/sql/parser/mysql/visitor/statement/type/MySQLDDLStatementVisitor.java`
#### Snippet
```java
                result.getValue().add((AddColumnDefinitionSegment) visit(each));
            }
            if (each instanceof AlterConstraintContext || each instanceof AlterCheckContext) {
                result.getValue().add((AlterDefinitionSegment) visit(each));
            }
```

### ConstantValue
Condition `!SPECIAL_CODES.isEmpty()` is always `true`
in `features/mask/core/src/main/java/org/apache/shardingsphere/mask/algorithm/replace/GenericTableRandomReplaceAlgorithm.java`
#### Snippet
```java
                () -> new MaskAlgorithmInitializationException(getType(), String.format("'%s' must be not empty", DIGITAL_CODES)));
        specialCodes = splitPropsToList(props.getProperty(SPECIAL_CODES, DEFAULT_SPECIAL_CODES));
        ShardingSpherePreconditions.checkState(!SPECIAL_CODES.isEmpty(),
                () -> new MaskAlgorithmInitializationException(getType(), String.format("'%s' must be not empty", SPECIAL_CODES)));
    }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowBinlogEventsStatementAssert.java`
#### Snippet
```java
        } else {
            assertNotNull(actual.getLimit(), assertContext.getText("Actual limit clause should exist."));
            LimitClauseAssert.assertOffset(assertContext, actual.getLimit().getOffset().get(), expected.getLimitClause().getOffset());
            LimitClauseAssert.assertRowCount(assertContext, actual.getLimit().getRowCount().get(), expected.getLimitClause().getRowCount());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/dal/impl/ShowBinlogEventsStatementAssert.java`
#### Snippet
```java
            assertNotNull(actual.getLimit(), assertContext.getText("Actual limit clause should exist."));
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
    public static void assertIs(final SQLCaseAssertContext assertContext, final ShowTableMetaDataStatement actual, final ShowTableMetaDataStatementTestCase expected) {
        if (ExistingAssert.assertIs(assertContext, actual, expected)) {
            DatabaseAssert.assertIs(assertContext, actual.getDatabase().get(), expected.getDatabase());
            assertThat(assertContext.getText("Table assertion error:"), actual.getTableNames(), is(expected.getTableNames()));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/RefreshTableMetaDataStatementAssert.java`
#### Snippet
```java
        if (ExistingAssert.assertIs(assertContext, actual, expected)) {
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
in `test/it/parser/src/main/java/org/apache/shardingsphere/test/it/sql/parser/internal/asserts/statement/ral/impl/updatable/ImportMetaDataStatementAssert.java`
#### Snippet
```java
    public static void assertIs(final SQLCaseAssertContext assertContext, final ImportMetaDataStatement actual, final ImportMetaDataStatementTestCase expected) {
        if (ExistingAssert.assertIs(assertContext, actual, expected)) {
            assertThat(actual.getFilePath().get(), is(expected.getFilePath()));
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/transaction/TransactionBackendHandler.java`
#### Snippet
```java
        ShardingSpherePreconditions.checkState(connectionSession.getTransactionStatus().isInTransaction() || !isSchemaSupportedDatabaseType(),
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
            boolean leftEncryptorPresent = encryptRule.findStandardEncryptor(tableName, each.getColumns().get(0).getIdentifier().getValue()).isPresent();
            if (each.getValue() instanceof FunctionSegment && "VALUES".equalsIgnoreCase(((FunctionSegment) each.getValue()).getFunctionName())) {
                ColumnSegment rightColumn = (ColumnSegment) ((FunctionSegment) each.getValue()).getParameters().stream().findFirst().get();
                boolean rightEncryptorPresent = encryptRule.findStandardEncryptor(tableName, rightColumn.getIdentifier().getValue()).isPresent();
                if (!leftEncryptorPresent && !rightEncryptorPresent) {
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `infra/executor/src/main/java/org/apache/shardingsphere/infra/executor/sql/execute/result/query/impl/driver/jdbc/type/util/ResultSetUtils.java`
#### Snippet
```java
        if (needScale) {
            try {
                return value.setScale(scale);
            } catch (final ArithmeticException ex) {
                return value.setScale(scale, RoundingMode.HALF_UP);
```

## RuleId[id=UnstableApiUsage]
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
            ctx.channel().attr(CONNECTION_CONTEXT_KEY).set(new CDCConnectionContext(user.get()));
            ctx.writeAndFlush(CDCResponseGenerator.succeedBuilder(request.getRequestId()).build());
```

### UnstableApiUsage
'sha256()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            ctx.channel().attr(CONNECTION_CONTEXT_KEY).set(new CDCConnectionContext(user.get()));
            ctx.writeAndFlush(CDCResponseGenerator.succeedBuilder(request.getRequestId()).build());
```

### UnstableApiUsage
'hashBytes(byte\[\])' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            ctx.channel().attr(CONNECTION_CONTEXT_KEY).set(new CDCConnectionContext(user.get()));
            ctx.writeAndFlush(CDCResponseGenerator.succeedBuilder(request.getRequestId()).build());
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
        AuthorityRule authorityRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(AuthorityRule.class);
        Optional<ShardingSphereUser> user = authorityRule.findUser(new Grantee(body.getUsername(), getHostAddress(ctx)));
        if (user.isPresent() && Objects.equals(Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString().toUpperCase(), body.getPassword())) {
            ctx.channel().attr(CONNECTION_CONTEXT_KEY).set(new CDCConnectionContext(user.get()));
            ctx.writeAndFlush(CDCResponseGenerator.succeedBuilder(request.getRequestId()).build());
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/arguments/BootstrapArguments.java`
#### Snippet
```java
        }
        List<String> addresses = Arrays.asList(args[2].split(","));
        return addresses.stream().filter(address -> !InetAddresses.isInetAddress(address)).filter(this::isValidPath).findFirst();
    }
    
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/arguments/BootstrapArguments.java`
#### Snippet
```java
        }
        List<String> addresses = Arrays.asList(args[2].split(","));
        return addresses.stream().filter(address -> !InetAddresses.isInetAddress(address)).filter(this::isValidPath).findFirst();
    }
    
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/arguments/BootstrapArguments.java`
#### Snippet
```java
        }
        List<String> addresses = Arrays.asList(args[2].split(","));
        return addresses.stream().filter(InetAddresses::isInetAddress).collect(Collectors.toList());
    }
    
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `proxy/bootstrap/src/main/java/org/apache/shardingsphere/proxy/arguments/BootstrapArguments.java`
#### Snippet
```java
        }
        List<String> addresses = Arrays.asList(args[2].split(","));
        return addresses.stream().filter(InetAddresses::isInetAddress).collect(Collectors.toList());
    }
    
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
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            ShardingSpherePreconditions.checkState(tps > 0, () -> new JobRateLimitAlgorithmInitializationException(getType(), "TPS must be a positive number"));
        }
        rateLimiter = RateLimiter.create(tps);
    }
    
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/TPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            ShardingSpherePreconditions.checkState(tps > 0, () -> new JobRateLimitAlgorithmInitializationException(getType(), "TPS must be a positive number"));
        }
        rateLimiter = RateLimiter.create(tps);
    }
    
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
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
    private int qps = 50;
    
    private RateLimiter rateLimiter;
    
    @Override
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            ShardingSpherePreconditions.checkState(qps > 0, () -> new JobRateLimitAlgorithmInitializationException(getType(), "QPS must be a positive number"));
        }
        rateLimiter = RateLimiter.create(qps);
    }
    
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/ratelimit/QPSJobRateLimitAlgorithm.java`
#### Snippet
```java
            ShardingSpherePreconditions.checkState(qps > 0, () -> new JobRateLimitAlgorithmInitializationException(getType(), "QPS must be a positive number"));
        }
        rateLimiter = RateLimiter.create(qps);
    }
    
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
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
    
    private Sarg<BigDecimal> getArgList(final ArgListContext ctx) {
        RangeSet<BigDecimal> rangeSet = TreeRangeSet.create();
        for (TerminalNode each : ctx.INTEGER_()) {
            BigDecimal value = BigDecimal.valueOf(Long.parseLong(each.getText()));
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
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
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
            rangeSet.add(Range.singleton(value));
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, rangeSet);
    }
    
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
            }
        }
        return Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.copyOf(rangeList));
    }
    
```

### UnstableApiUsage
'of(org.apache.calcite.rex.RexUnknownAs, com.google.common.collect.RangeSet)' is unstable because its signature references unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
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
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
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
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
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
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

### UnstableApiUsage
'of(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
                : Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN)));
    }
    
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/executor/ConnectionThreadExecutorGroup.java`
#### Snippet
```java
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (final InterruptedException ignored) {
            Thread.currentThread().interrupt();
```

### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `kernel/data-pipeline/cdc/core/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/core/connector/SocketSinkImporterConnector.java`
#### Snippet
```java
        lock.lock();
        try {
            condition.await(DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS);
        } catch (final InterruptedException ignored) {
            Thread.currentThread().interrupt();
```

### IgnoreResultOfCall
Result of `Range.range()` is ignored
in `kernel/sql-federation/optimizer/src/main/java/org/apache/shardingsphere/sqlfederation/optimizer/rexnode/SQLOptimizerRexNodeVisitor.java`
#### Snippet
```java
        BigDecimal lowerValue = BigDecimal.valueOf(Long.parseLong(ctx.INTEGER_(0).getText()));
        BigDecimal upperValue = BigDecimal.valueOf(Long.parseLong(ctx.INTEGER_(1).getText()));
        Range.range(lowerValue, BoundType.OPEN, upperValue, BoundType.OPEN);
        return null == ctx.LP_()
                ? Sarg.of(RexUnknownAs.UNKNOWN, ImmutableRangeSet.of(Range.range(lowerValue, BoundType.CLOSED, upperValue, BoundType.CLOSED)))
```

