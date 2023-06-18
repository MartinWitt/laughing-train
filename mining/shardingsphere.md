# shardingsphere 
 
# Bad smells
I found 77 bad smells with 77 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 77 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/agent/plugins/tracing/type/opentelemetry/src/main/java/org/apache/shardingsphere/agent/plugin/tracing/opentelemetry/advice/OpenTelemetryJDBCExecutorCallbackAdvice.java`
#### Snippet
```java
executionUnit.getExecutionUnit().getSqlUnit().getParameters().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/db-protocol/opengauss/src/main/java/org/apache/shardingsphere/db/protocol/opengauss/packet/command/query/extended/bind/OpenGaussComBatchBindPacket.java`
#### Snippet
```java
payload.getByteBuf().readCharSequence(paramValueLength, payload.getCharset()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/packet/command/query/extended/bind/PostgreSQLComBindPacket.java`
#### Snippet
```java
payload.getByteBuf().readCharSequence(paramValueLength, payload.getCharset()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/db-protocol/postgresql/src/main/java/org/apache/shardingsphere/db/protocol/postgresql/payload/PostgreSQLPacketPayload.java`
#### Snippet
```java
byteBuf.readCharSequence(byteBuf.bytesBefore(((byte) (0))), charset).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/db-protocol/postgresql/src/test/java/org/apache/shardingsphere/db/protocol/postgresql/payload/PostgreSQLPacketPayloadTest.java`
#### Snippet
```java
byteBuf.readCharSequence(expectedString.length(), StandardCharsets.ISO_8859_1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/encrypt/core/src/test/java/org/apache/shardingsphere/encrypt/algorithm/standard/RC4EncryptAlgorithmTest.java`
#### Snippet
```java
encryptAlgorithm.decrypt("4Tn7lQ==", mock(EncryptContext.class)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/encrypt/plugin/sm/src/test/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithmTest.java`
#### Snippet
```java
algorithm.decrypt("028654f2ca4f575dee9e1faae85dadde", mock(EncryptContext.class)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/encrypt/plugin/sm/src/test/java/org/apache/shardingsphere/encrypt/sm/algorithm/SM4EncryptAlgorithmTest.java`
#### Snippet
```java
algorithm.decrypt("dca2127b57ba8cac36a0914e0208dc11", mock(EncryptContext.class)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/hint/HintInlineShardingAlgorithm.java`
#### Snippet
```java
closure.call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/inline/ComplexInlineShardingAlgorithm.java`
#### Snippet
```java
closure.call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/inline/InlineShardingAlgorithm.java`
#### Snippet
```java
closure.call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/mod/ModShardingAlgorithm.java`
#### Snippet
```java
cutShardingValue(shardingValue.getValue()).mod(new BigInteger(String.valueOf(shardingCount))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/mod/ModShardingAlgorithm.java`
#### Snippet
```java
shardingValue.getValueRange().lowerEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/core/src/main/java/org/apache/shardingsphere/sharding/algorithm/sharding/mod/ModShardingAlgorithm.java`
#### Snippet
```java
shardingValue.getValueRange().upperEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowDefaultShardingStrategyExecutor.java`
#### Snippet
```java
algorithmConfig.getProps().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowShardingKeyGeneratorExecutor.java`
#### Snippet
```java
entry.getValue().getProps().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/main/java/org/apache/shardingsphere/sharding/distsql/handler/query/ShowUnusedShardingAuditorsExecutor.java`
#### Snippet
```java
entry.getValue().getProps().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/test/java/org/apache/shardingsphere/sharding/distsql/fixture/sharding/CoreAutoShardingAlgorithmFixture.java`
#### Snippet
```java
cutShardingValue(shardingValue.getValue()).mod(new BigInteger(String.valueOf(shardingCount))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/test/java/org/apache/shardingsphere/sharding/distsql/fixture/sharding/CoreAutoShardingAlgorithmFixture.java`
#### Snippet
```java
shardingValue.getValueRange().lowerEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/test/java/org/apache/shardingsphere/sharding/distsql/fixture/sharding/CoreAutoShardingAlgorithmFixture.java`
#### Snippet
```java
shardingValue.getValueRange().upperEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/features/sharding/distsql/handler/src/test/java/org/apache/shardingsphere/sharding/distsql/fixture/sharding/CoreHintShardingAlgorithmFixture.java`
#### Snippet
```java
closure.call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/infra/expr/espresso/src/test/java/org/apache/shardingsphere/infra/expr/espresso/EspressoInlineExpressionParserTest.java`
#### Snippet
```java
new EspressoInlineExpressionParser().evaluateClosure("${1+2}").call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/infra/expr/hotsopt/src/test/java/org/apache/shardingsphere/infra/expr/hotsopt/HotspotInlineExpressionParserTest.java`
#### Snippet
```java
new HotspotInlineExpressionParser().evaluateClosure("${1+2}").call().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/infra/util/src/test/java/org/apache/shardingsphere/infra/util/yaml/YamlEngineTest.java`
#### Snippet
```java
yamlContent.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/authority/core/src/main/java/org/apache/shardingsphere/authority/yaml/swapper/YamlUserSwapper.java`
#### Snippet
```java
data.getGrantee().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/authority/distsql/handler/src/main/java/org/apache/shardingsphere/authority/distsql/handler/ShowAuthorityRuleExecutor.java`
#### Snippet
```java
each.getGrantee().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/api/src/main/java/org/apache/shardingsphere/data/pipeline/api/datasource/config/impl/ShardingSpherePipelineDataSourceConfiguration.java`
#### Snippet
```java
value.get(jdbcUrlKey).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/cdc/client/src/main/java/org/apache/shardingsphere/data/pipeline/cdc/client/handler/LoginRequestHandler.java`
#### Snippet
```java
Hashing.sha256().hashBytes(password.getBytes()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/progress/yaml/YamlJobItemIncrementalTasksProgressSwapper.java`
#### Snippet
```java
progress.getIncrementalTaskProgress().getPosition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/core/src/main/java/org/apache/shardingsphere/data/pipeline/core/job/progress/yaml/YamlJobItemInventoryTasksProgressSwapper.java`
#### Snippet
```java
entry.getValue().getPosition().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/dialect/mysql/src/main/java/org/apache/shardingsphere/data/pipeline/mysql/ingest/client/MySQLClient.java`
#### Snippet
```java
resultSet.getFieldValues().get(0).getData().iterator().next().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/dialect/opengauss/src/test/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPluginTest.java`
#### Snippet
```java
actual.getPrimaryKeys().get(each).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/dialect/opengauss/src/test/java/org/apache/shardingsphere/data/pipeline/opengauss/ingest/wal/decode/MppdbDecodingPluginTest.java`
#### Snippet
```java
actual.getAfterRow().get(each).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/data-pipeline/distsql/handler/src/main/java/org/apache/shardingsphere/migration/distsql/handler/query/ShowMigrationCheckStatusExecutor.java`
#### Snippet
```java
info.getCheckSuccess().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/global-clock/distsql/handler/src/main/java/org/apache/shardingsphere/globalclock/distsql/handler/query/ShowGlobalClockRuleExecutor.java`
#### Snippet
```java
ruleConfig.getProps().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/util/LoggingUtils.java`
#### Snippet
```java
props.getProps().get(LoggingConstants.SQL_SHOW).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/logging/core/src/main/java/org/apache/shardingsphere/logging/util/LoggingUtils.java`
#### Snippet
```java
props.getProps().get(LoggingConstants.SQL_SIMPLE).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/sql-federation/distsql/handler/src/main/java/org/apache/shardingsphere/sqlfederation/distsql/handler/query/ShowSQLFederationRuleExecutor.java`
#### Snippet
```java
ruleConfig.getExecutionPlanCache().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/sql-parser/distsql/handler/src/main/java/org/apache/shardingsphere/parser/distsql/handler/query/ShowSQLParserRuleExecutor.java`
#### Snippet
```java
ruleConfig.getParseTreeCache().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/kernel/sql-parser/distsql/handler/src/main/java/org/apache/shardingsphere/parser/distsql/handler/query/ShowSQLParserRuleExecutor.java`
#### Snippet
```java
ruleConfig.getSqlStatementCache().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/mode/type/cluster/repository/provider/nacos/src/main/java/org/apache/shardingsphere/mode/repository/cluster/nacos/util/NacosMetaDataUtils.java`
#### Snippet
```java
NacosMetaDataUtils.UTC_ZONE_OFFSET.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
index.getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
index.getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/opengauss/src/main/java/org/apache/shardingsphere/sql/parser/opengauss/visitor/statement/OpenGaussStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/oracle/src/main/java/org/apache/shardingsphere/sql/parser/oracle/visitor/statement/type/OracleDMLStatementVisitor.java`
#### Snippet
```java
literalExpression.getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
index.getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
index.getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/dialect/postgresql/src/main/java/org/apache/shardingsphere/sql/parser/postgresql/visitor/statement/PostgreSQLStatementVisitor.java`
#### Snippet
```java
((LiteralExpressionSegment) (astNode)).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtils.java`
#### Snippet
```java
range.lowerEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtils.java`
#### Snippet
```java
range.upperEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtils.java`
#### Snippet
```java
range.lowerEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/parser/sql/statement/src/main/java/org/apache/shardingsphere/sql/parser/sql/common/util/SafeNumberOperationUtils.java`
#### Snippet
```java
range.upperEndpoint().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/test/e2e/operation/transaction/src/test/java/org/apache/shardingsphere/test/e2e/transaction/framework/container/compose/DockerContainerComposer.java`
#### Snippet
```java
testParam.getTransactionTypes().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/test/e2e/operation/transaction/src/test/java/org/apache/shardingsphere/test/e2e/transaction/framework/container/compose/DockerContainerComposer.java`
#### Snippet
```java
testParam.getTransactionTypes().get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
props.getOrDefault(LoggingConstants.SQL_LOG_ENABLE, metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
props.getOrDefault(LoggingConstants.SQL_LOG_SIMPLE, metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(variableName)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariableExecutor.java`
#### Snippet
```java
metaData.getTemporaryProps().getValue(TemporaryConfigurationPropertyKey.valueOf(variableName)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariablesExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(each)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariablesExecutor.java`
#### Snippet
```java
metaData.getTemporaryProps().getValue(TemporaryConfigurationPropertyKey.valueOf(each)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariablesExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(LoggingConstants.SQL_SHOW_VARIABLE_NAME.toUpperCase())).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/core/src/main/java/org/apache/shardingsphere/proxy/backend/handler/distsql/ral/queryable/ShowDistVariablesExecutor.java`
#### Snippet
```java
metaData.getProps().getValue(ConfigurationPropertyKey.valueOf(LoggingConstants.SQL_SIMPLE_VARIABLE_NAME.toUpperCase())).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/type/hbase/src/main/java/org/apache/shardingsphere/proxy/backend/hbase/converter/type/HBaseSelectOperationConverter.java`
#### Snippet
```java
((LiteralExpressionSegment) (betweenExpr.getBetweenExpr())).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/type/hbase/src/main/java/org/apache/shardingsphere/proxy/backend/hbase/converter/type/HBaseSelectOperationConverter.java`
#### Snippet
```java
((LiteralExpressionSegment) (betweenExpr.getAndExpr())).getLiterals().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/backend/type/hbase/src/main/java/org/apache/shardingsphere/proxy/backend/hbase/result/query/HBaseGetResultSet.java`
#### Snippet
```java
statementContext.getSqlStatement().getFrom().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/command/CommandExecutorTask.java`
#### Snippet
```java
connectionSession.getGrantee().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/frontend/core/src/main/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandler.java`
#### Snippet
```java
Hashing.sha256().hashBytes(user.get().getPassword().getBytes()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/frontend/core/src/test/java/org/apache/shardingsphere/proxy/frontend/netty/CDCChannelInboundHandlerTest.java`
#### Snippet
```java
Hashing.sha256().hashBytes("root".getBytes()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/frontend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/frontend/mysql/authentication/MySQLAuthenticationEngine.java`
#### Snippet
```java
context.channel().parent().localAddress().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-shardingsphere-81418725924442081173952657872134797273/proxy/frontend/type/mysql/src/main/java/org/apache/shardingsphere/proxy/frontend/mysql/command/query/text/fieldlist/MySQLComFieldListPacketExecutor.java`
#### Snippet
```java
databaseConnector.getRowData().getCells().iterator().next().getData().toString()
```

