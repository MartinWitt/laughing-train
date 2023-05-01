# flink-connector-opensearch 
 
# Bad smells
I found 44 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 17 | false |
| NullableProblems | 7 | false |
| RegExpRedundantEscape | 5 | false |
| FieldMayBeFinal | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| JavadocReference | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| DataFlowIssue | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `bulkProcessorBuilderFactory`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
     * @param bulkProcessorConfig describing the flushing and failure handling of the used {@link
     *     BulkProcessor}
     * @param bulkProcessorBuilderFactory configuring the {@link BulkProcessor}'s builder
     * @param networkClientConfig describing properties of the network connection used to connect to
     *     the Opensearch cluster
```

### JavadocReference
Cannot resolve symbol `clientConfig`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * Creates an Opensearch client implementing {@link AutoCloseable}.
     *
     * @param clientConfig The configuration to use when constructing the client.
     * @return The created client.
     * @throws IOException IOException
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

## RuleId[id=Deprecation]
### Deprecation
'org.apache.flink.streaming.connectors.opensearch.OpensearchSink' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RestClientFactory.java`
#### Snippet
```java
/**
 * A factory that is used to configure the {@link org.opensearch.client.RestHighLevelClient}
 * internally used in the {@link OpensearchSink}.
 */
@PublicEvolving
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
    }

    private static class CustomFailureHandler implements ActionRequestFailureHandler {

        private static final long serialVersionUID = 942269087742453482L;
```

### Deprecation
'generateSequence(long, long)' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java

        DataStream<Tuple2<String, String>> source =
                env.generateSequence(0, parameterTool.getInt("numRecords") - 1)
                        .flatMap(
                                new FlatMapFunction<Long, Tuple2<String, String>>() {
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.OpensearchSink' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
        httpHosts.add(new HttpHost("127.0.0.1", 9200, "http"));

        OpensearchSink.Builder<Tuple2<String, String>> osSinkBuilder =
                new OpensearchSink.Builder<>(
                        httpHosts,
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.OpensearchSink.Builder' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
        httpHosts.add(new HttpHost("127.0.0.1", 9200, "http"));

        OpensearchSink.Builder<Tuple2<String, String>> osSinkBuilder =
                new OpensearchSink.Builder<>(
                        httpHosts,
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.OpensearchSink' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java

        OpensearchSink.Builder<Tuple2<String, String>> osSinkBuilder =
                new OpensearchSink.Builder<>(
                        httpHosts,
                        (Tuple2<String, String> element,
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.OpensearchSink.Builder' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java

        OpensearchSink.Builder<Tuple2<String, String>> osSinkBuilder =
                new OpensearchSink.Builder<>(
                        httpHosts,
                        (Tuple2<String, String> element,
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
                        (Tuple2<String, String> element,
                                RuntimeContext ctx,
                                RequestIndexer indexer) -> {
                            indexer.add(createIndexRequest(element.f1, parameterTool));
                            indexer.add(createUpdateRequest(element, parameterTool));
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/OpensearchSinkExample.java`
#### Snippet
```java
        @Override
        public void onFailure(
                ActionRequest action, Throwable failure, int restStatusCode, RequestIndexer indexer)
                throws Throwable {
            if (action instanceof IndexRequest) {
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchBulkProcessorIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer}, using a {@link BulkProcessor}. {@link ActionRequest
 * ActionRequests} will be buffered before sending a bulk request to the Opensearch cluster.
 *
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchBulkProcessorIndexer.java`
#### Snippet
```java
 */
@Internal
class OpensearchBulkProcessorIndexer implements RequestIndexer {

    private final BulkProcessor bulkProcessor;
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/util/NoOpFailureHandler.java`
#### Snippet
```java
    @Override
    public void onFailure(
            ActionRequest action, Throwable failure, int restStatusCode, RequestIndexer indexer)
            throws Throwable {
        LOG.error("Failed Opensearch item request: {}", failure.getMessage(), failure);
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/util/NoOpFailureHandler.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

/** An {@link ActionRequestFailureHandler} that simply fails the sink on any failures. */
@Internal
public class NoOpFailureHandler implements ActionRequestFailureHandler {
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.ActionRequestFailureHandler' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/util/NoOpFailureHandler.java`
#### Snippet
```java
/** An {@link ActionRequestFailureHandler} that simply fails the sink on any failures. */
@Internal
public class NoOpFailureHandler implements ActionRequestFailureHandler {

    private static final long serialVersionUID = 737941343410827885L;
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer} that buffers {@link ActionRequest ActionRequests}
 * before re-sending them to the Opensearch cluster upon request.
 */
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
@Internal
@NotThreadSafe
class BufferingNoOpRequestIndexer implements RequestIndexer {

    private ConcurrentLinkedQueue<ActionRequest> bufferedRequests;
```

### Deprecation
'org.apache.flink.streaming.connectors.opensearch.RequestIndexer' is deprecated
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
    }

    void processBufferedRequests(RequestIndexer actualIndexer) {
        for (ActionRequest request : bufferedRequests) {
            if (request instanceof IndexRequest) {
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

## RuleId[id=NullableProblems]
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
    @Nullable private final Integer connectionRequestTimeout;
    @Nullable private final Integer connectionTimeout;
    @Nullable private final Integer socketTimeout;
    @Nullable private final Boolean allowInsecure;

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `numPendingRequests` may be 'final'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * Throwable)}.
     */
    private AtomicLong numPendingRequests = new AtomicLong(0);

    /** User-provided HTTP Host. */
```

### FieldMayBeFinal
Field `bulkRequestsConfig` may be 'final'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
        private final OpensearchSinkFunction<T> opensearchSinkFunction;

        private Map<String, String> bulkRequestsConfig = new HashMap<>();
        private ActionRequestFailureHandler failureHandler = new NoOpFailureHandler();
        private RestClientFactory restClientFactory = restClientBuilder -> {};
```

### FieldMayBeFinal
Field `bufferedRequests` may be 'final'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
class BufferingNoOpRequestIndexer implements RequestIndexer {

    private ConcurrentLinkedQueue<ActionRequest> bufferedRequests;

    BufferingNoOpRequestIndexer() {
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * would also be forwarded when creating the Opensearch client.
     */
    private final Map<String, String> userConfig;

    /**
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

