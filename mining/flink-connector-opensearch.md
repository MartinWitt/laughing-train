# flink-connector-opensearch 
 
# Bad smells
I found 50 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 7 | false |
| CallToStringConcatCanBeReplacedByOperator | 6 | false |
| RegExpRedundantEscape | 5 | false |
| RedundantFieldInitialization | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| WhileLoopSpinsOnField | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| ReturnNull | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| SystemOutErr | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| DataFlowIssue | 1 | false |
| Convert2Lambda | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| RedundantImplements | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BoundedWildcard | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new HttpHost\[httpHosts.size()\]'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
    private RestHighLevelClient createClient() throws IOException {
        RestClientBuilder builder =
                RestClient.builder(httpHosts.toArray(new HttpHost[httpHosts.size()]));
        restClientFactory.configureRestClientBuilder(builder);

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java

        if (parameterTool.getNumberOfParameters() < 2) {
            System.out.println(
                    "Missing parameters!\n" + "Usage: --numRecords <numRecords> --index <index>");
            return;
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
    @VisibleForTesting
    void blockingFlushAllActions() throws InterruptedException {
        while (pendingActions != 0) {
            bulkProcessor.flush();
            LOG.info("Waiting for the response of {} pending actions.", pendingActions);
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
    public void write(IN element, Context context) throws IOException, InterruptedException {
        // do not allow new bulk writes until all actions are flushed
        while (checkpointInProgress) {
            mailboxExecutor.yield();
        }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `OpensearchConnectorOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchConnectorOptions.java`
#### Snippet
```java
 */
@PublicEvolving
public class OpensearchConnectorOptions {

    OpensearchConnectorOptions() {}
```

### UtilityClassWithoutPrivateConstructor
Class `OpensearchSinkExample` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java

/** End to end test for OpensearchSink. */
public class OpensearchSinkExample {

    public static void main(String[] args) throws Exception {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.configuration` is unnecessary and can be removed
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * Verify the client connection by making a test request/ping to the Opensearch cluster.
     *
     * <p>Called by {@link OpensearchSink#open(org.apache.flink.configuration.Configuration)} after
     * creating the client. This makes sure the underlying client is closed if the connection is not
     * successful and preventing thread leak.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/KeyExtractor.java`
#### Snippet
```java
            default:
                RowData.FieldGetter fieldGetter = RowData.createFieldGetter(type, index);
                return (row) -> fieldGetter.getFieldOrNull(row).toString();
        }
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'OpensearchSinkFunction' is still used
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSinkFunction.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface OpensearchSinkFunction<T> extends Serializable, Function {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ActionRequestFailureHandler' is still used
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/ActionRequestFailureHandler.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface ActionRequestFailureHandler extends Serializable {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
    @Deprecated
    @PublicEvolving
    public static class Builder<T> {

        private final List<HttpHost> httpHosts;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `IndexGeneratorBase()` of an abstract class should not be declared 'public'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorBase.java`
#### Snippet
```java
    protected final String index;

    public IndexGeneratorBase(String index) {
        this.index = index;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTimeIndexGenerator()` of an abstract class should not be declared 'public'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/AbstractTimeIndexGenerator.java`
#### Snippet
```java
    protected transient DateTimeFormatter dateTimeFormatter;

    public AbstractTimeIndexGenerator(String index, String dateTimeFormat) {
        super(index);
        this.dateTimeFormat = dateTimeFormat;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
     */
    static class IndexHelper {
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
                        ".*\\{\\s*(now\\(\\s*\\)|NOW\\(\\s*\\)|current_timestamp|CURRENT_TIMESTAMP)\\s*\\|.*\\}.*");
        private static final List<LogicalTypeRoot> supportedTypes = new ArrayList<>();
        private static final Map<LogicalTypeRoot, String> defaultFormats = new HashMap<>();
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private static final Pattern dynamicIndexPattern = Pattern.compile("\\{[^\\{\\}]+\\}?");
        private static final Pattern dynamicIndexTimeExtractPattern =
                Pattern.compile(".*\\{.+\\|.*\\}.*");
        private static final Pattern dynamicIndexSystemTimeExtractPattern =
                Pattern.compile(
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FlatMapFunction\>() can be replaced with lambda
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
                env.generateSequence(0, parameterTool.getInt("numRecords") - 1)
                        .flatMap(
                                new FlatMapFunction<Long, Tuple2<String, String>>() {
                                    @Override
                                    public void flatMap(
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
    private volatile long lastSendTime = 0;
    private volatile long ackTime = Long.MAX_VALUE;
    private volatile boolean closed = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
    private final Counter numBytesOutCounter;

    private long pendingActions = 0;
    private boolean checkpointInProgress = false;
    private volatile long lastSendTime = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
    private long pendingActions = 0;
    private boolean checkpointInProgress = false;
    private volatile long lastSendTime = 0;
    private volatile long ackTime = Long.MAX_VALUE;
    private volatile boolean closed = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java

    private long pendingActions = 0;
    private boolean checkpointInProgress = false;
    private volatile long lastSendTime = 0;
    private volatile long ackTime = Long.MAX_VALUE;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `userConfig`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java

        // copy config so we can remove entries without side-effects
        userConfig = new HashMap<>(userConfig);

        ParameterTool params = ParameterTool.fromMap(userConfig);
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSinkFunction.java`
#### Snippet
```java
@Deprecated
@PublicEvolving
public interface OpensearchSinkFunction<T> extends Serializable, Function {

    /**
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                public String generate(RowData row) {
                    return indexPrefix
                            .concat(LocalDateTime.now(localTimeZoneId).format(dateTimeFormatter))
                            .concat(indexSuffix);
                }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                    return indexPrefix
                            .concat(LocalDateTime.now(localTimeZoneId).format(dateTimeFormatter))
                            .concat(indexSuffix);
                }
            };
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                Object indexField = fieldGetter.getFieldOrNull(row);
                return indexPrefix
                        .concat(indexField == null ? "null" : indexField.toString())
                        .concat(indexSuffix);
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                return indexPrefix
                        .concat(indexField == null ? "null" : indexField.toString())
                        .concat(indexSuffix);
            }
        };
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                        formattedField = "null";
                    }
                    return indexPrefix.concat(formattedField).concat(indexSuffix);
                }
            };
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                        formattedField = "null";
                    }
                    return indexPrefix.concat(formattedField).concat(indexSuffix);
                }
            };
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/KeyExtractor.java`
#### Snippet
```java
            return new KeyExtractor(formatters, keyDelimiter);
        } else {
            return (row) -> null;
        }
    }
```

### ReturnNull
Return of `null`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
            BulkItemResponse bulkItemResponse) {
        if (!bulkItemResponse.isFailed()) {
            return null;
        } else {
            return bulkItemResponse.getFailure().getCause();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `zoneId` is redundant
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSinkFactory.java`
#### Snippet
```java
    private static ZoneId getLocalTimeZoneId(ReadableConfig readableConfig) {
        final String zone = readableConfig.get(TableConfigOptions.LOCAL_TIME_ZONE);
        final ZoneId zoneId =
                TableConfigOptions.LOCAL_TIME_ZONE.defaultValue().equals(zone)
                        ? ZoneId.systemDefault()
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSink.java`
#### Snippet
```java
        final OpensearchSinkBuilder<RowData> builder = new OpensearchSinkBuilder<>();
        builder.setEmitter(rowOpensearchEmitter);
        builder.setHosts(config.getHosts().toArray(new HttpHost[0]));
        builder.setDeliveryGuarantee(config.getDeliveryGuarantee());
        builder.setBulkFlushMaxActions(config.getBulkFlushMaxActions());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
                new RestHighLevelClient(
                        configureRestClientBuilder(
                                RestClient.builder(hosts.toArray(new HttpHost[0])),
                                networkClientConfig));
        this.bulkProcessor = createBulkProcessor(bulkProcessorConfig);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
            return createRuntimeIndexGenerator(
                    index,
                    fieldNames.toArray(new String[0]),
                    dataTypes.toArray(new DataType[0]),
                    indexHelper,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
                    index,
                    fieldNames.toArray(new String[0]),
                    dataTypes.toArray(new DataType[0]),
                    indexHelper,
                    localTimeZoneId);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends LogicalTypeWithIndex`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/KeyExtractor.java`
#### Snippet
```java

    public static SerializableFunction<RowData, String> createKeyExtractor(
            List<LogicalTypeWithIndex> primaryKeyTypesWithIndex, String keyDelimiter) {
        if (!primaryKeyTypesWithIndex.isEmpty()) {
            FieldFormatter[] formatters =
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
    @Nullable private final Boolean allowInsecure;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
    @Nullable private final Boolean allowInsecure;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
    @Nullable private final Boolean allowInsecure;

    NetworkClientConfig(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
class NetworkClientConfig implements Serializable {

    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/NetworkClientConfig.java`
#### Snippet
```java

    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
    @Nullable private final Integer connectionRequestTimeout;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGeneratorFactory.java`
#### Snippet
```java
        private String extractDateFormat(String index, LogicalTypeRoot logicalType) {
            String format = index.substring(index.indexOf("|") + 1, index.indexOf("}"));
            if ("".equals(format)) {
                format = getDefaultFormat(logicalType);
            }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `key` is always 'null'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/RowOpensearchEmitter.java`
#### Snippet
```java
            final IndexRequest indexRequest =
                    new IndexRequest(indexGenerator.generate(row))
                            .id(key)
                            .source(document, contentType);
            indexer.add(indexRequest);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSink.java`
#### Snippet
```java
        if (config.getBulkFlushBackoffType().isPresent()) {
            FlushBackoffType backoffType = config.getBulkFlushBackoffType().get();
            int backoffMaxRetries = config.getBulkFlushBackoffRetries().get();
            long backoffDelayMs = config.getBulkFlushBackoffDelay().get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSink.java`
#### Snippet
```java
            FlushBackoffType backoffType = config.getBulkFlushBackoffType().get();
            int backoffMaxRetries = config.getBulkFlushBackoffRetries().get();
            long backoffDelayMs = config.getBulkFlushBackoffDelay().get();

            builder.setBulkFlushBackoffStrategy(backoffType, backoffMaxRetries, backoffDelayMs);
```

