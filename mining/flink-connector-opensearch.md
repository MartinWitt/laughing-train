# flink-connector-opensearch 
 
# Bad smells
I found 122 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 76 | false |
| Deprecation | 16 | false |
| NullableProblems | 7 | false |
| ConstantValue | 5 | false |
| RegExpRedundantEscape | 5 | false |
| FieldMayBeFinal | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
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
Cannot resolve symbol `UpdateRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link UpdateRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `org.opensearch.client.RestHighLevelClient`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RestClientFactory.java`
#### Snippet
```java

/**
 * A factory that is used to configure the {@link org.opensearch.client.RestHighLevelClient}
 * internally used in the {@link OpensearchSink}.
 */
```

### JavadocReference
Cannot resolve symbol `UpdateRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param updateRequests The multiple {@link UpdateRequest} to add.
     */
    void add(UpdateRequest... updateRequests);
```

### JavadocReference
Cannot resolve symbol `IndexRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link IndexRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `IndexRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param indexRequests The multiple {@link IndexRequest} to add.
     */
    void add(IndexRequest... indexRequests);
```

### JavadocReference
Cannot resolve symbol `DeleteRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java
public interface RequestIndexer {
    /**
     * Add multiple {@link DeleteRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `DeleteRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param deleteRequests The multiple {@link DeleteRequest} to add.
     */
    void add(DeleteRequest... deleteRequests);
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer} that buffers {@link ActionRequest ActionRequests}
 * before re-sending them to the Opensearch cluster upon request.
 */
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchEmitter.java`
#### Snippet
```java

    /**
     * Process the incoming element to produce multiple {@link ActionRequest ActionRequests}. The
     * produced requests should be added to the provided {@link RequestIndexer}.
     *
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchEmitter.java`
#### Snippet
```java

/**
 * Creates none or multiple {@link ActionRequest ActionRequests} from the incoming elements.
 *
 * <p>This is used by sinks to prepare elements for sending them to Opensearch.
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/RowOpensearchEmitter.java`
#### Snippet
```java
import static org.apache.flink.util.Preconditions.checkNotNull;

/** Sink function for converting upserts into Opensearch {@link ActionRequest}s. */
class RowOpensearchEmitter implements OpensearchEmitter<RowData> {

```

### JavadocReference
Cannot resolve symbol `DeliveryGuarantee`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSink.java`
#### Snippet
```java
 *
 * <ul>
 *   <li>{@link DeliveryGuarantee#NONE} does not provide any guarantees: actions are flushed to
 *       Opensearch only depending on the configurations of the bulk processor. In case of a
 *       failure, it might happen that actions are lost if the bulk processor still has buffered
```

### JavadocReference
Cannot resolve symbol `NONE`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSink.java`
#### Snippet
```java
 *
 * <ul>
 *   <li>{@link DeliveryGuarantee#NONE} does not provide any guarantees: actions are flushed to
 *       Opensearch only depending on the configurations of the bulk processor. In case of a
 *       failure, it might happen that actions are lost if the bulk processor still has buffered
```

### JavadocReference
Cannot resolve symbol `DeliveryGuarantee`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSink.java`
#### Snippet
```java
 *       failure, it might happen that actions are lost if the bulk processor still has buffered
 *       actions.
 *   <li>{@link DeliveryGuarantee#AT_LEAST_ONCE} on a checkpoint the sink will wait until all
 *       buffered actions are flushed to and acknowledged by Opensearch. No actions will be lost but
 *       actions might be sent to Opensearch multiple times when Flink restarts. These additional
```

### JavadocReference
Cannot resolve symbol `AT_LEAST_ONCE`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSink.java`
#### Snippet
```java
 *       failure, it might happen that actions are lost if the bulk processor still has buffered
 *       actions.
 *   <li>{@link DeliveryGuarantee#AT_LEAST_ONCE} on a checkpoint the sink will wait until all
 *       buffered actions are flushed to and acknowledged by Opensearch. No actions will be lost but
 *       actions might be sent to Opensearch multiple times when Flink restarts. These additional
```

### JavadocReference
Cannot resolve symbol `DynamicTableSink`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSink.java`
#### Snippet
```java

/**
 * A {@link DynamicTableSink} that describes how to create a {@link OpensearchSink} from a logical
 * description.
 */
```

### JavadocReference
Cannot resolve symbol `DeliveryGuarantee`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSinkBuilder.java`
#### Snippet
```java

    /**
     * Sets the wanted {@link DeliveryGuarantee}. The default delivery guarantee is {@link
     * DeliveryGuarantee#NONE}
     *
```

### JavadocReference
Cannot resolve symbol `DeliveryGuarantee`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSinkBuilder.java`
#### Snippet
```java
    /**
     * Sets the wanted {@link DeliveryGuarantee}. The default delivery guarantee is {@link
     * DeliveryGuarantee#NONE}
     *
     * @param deliveryGuarantee which describes the record emission behaviour
```

### JavadocReference
Cannot resolve symbol `NONE`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSinkBuilder.java`
#### Snippet
```java
    /**
     * Sets the wanted {@link DeliveryGuarantee}. The default delivery guarantee is {@link
     * DeliveryGuarantee#NONE}
     *
     * @param deliveryGuarantee which describes the record emission behaviour
```

### JavadocReference
Cannot resolve symbol `RowData`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/KeyExtractor.java`
#### Snippet
```java
import java.util.List;

/** An extractor for a Opensearch key from a {@link RowData}. */
@Internal
class KeyExtractor implements SerializableFunction<RowData, String> {
```

### JavadocReference
Cannot resolve symbol `DynamicTableSinkFactory`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchDynamicSinkFactory.java`
#### Snippet
```java
import static org.opensearch.common.Strings.capitalize;

/** A {@link DynamicTableSinkFactory} for discovering OpensearchDynamicSink. */
@Internal
public class OpensearchDynamicSinkFactory implements DynamicTableSinkFactory {
```

### JavadocReference
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchBulkProcessorIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer}, using a {@link BulkProcessor}. {@link ActionRequest
 * ActionRequests} will be buffered before sending a bulk request to the Opensearch cluster.
 *
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchBulkProcessorIndexer.java`
#### Snippet
```java

/**
 * Implementation of a {@link RequestIndexer}, using a {@link BulkProcessor}. {@link ActionRequest
 * ActionRequests} will be buffered before sending a bulk request to the Opensearch cluster.
 *
```

### JavadocReference
Cannot resolve symbol `BulkProcessor.Listener`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java

    /**
     * This is set from inside the {@link BulkProcessor.Listener} if a {@link Throwable} was thrown
     * in callbacks and the user considered it should fail the sink via the {@link
     * ActionRequestFailureHandler#onFailure(ActionRequest, Throwable, int, RequestIndexer)} method.
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * This is set from inside the {@link BulkProcessor.Listener} if a {@link Throwable} was thrown
     * in callbacks and the user considered it should fail the sink via the {@link
     * ActionRequestFailureHandler#onFailure(ActionRequest, Throwable, int, RequestIndexer)} method.
     *
     * <p>Errors will be checked and rethrown before processing each input element, and when the
```

### JavadocReference
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
 *
 * <p>This class implements the common behaviour across Opensearch versions, such as the use of an
 * internal {@link BulkProcessor} to buffer multiple {@link ActionRequest}s before sending the
 * requests to the cluster, as well as passing input records to the user provided {@link
 * OpensearchSinkFunction} for processing.
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
 *
 * <p>This class implements the common behaviour across Opensearch versions, such as the use of an
 * internal {@link BulkProcessor} to buffer multiple {@link ActionRequest}s before sending the
 * requests to the cluster, as well as passing input records to the user provided {@link
 * OpensearchSinkFunction} for processing.
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java

    /**
     * The function that is used to construct multiple {@link ActionRequest ActionRequests} from
     * each incoming element.
     */
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
         * Sets a failure handler for action requests.
         *
         * @param failureHandler This is used to handle failed {@link ActionRequest}.
         */
        public void setFailureHandler(ActionRequestFailureHandler failureHandler) {
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.configuration.Configuration`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * Verify the client connection by making a test request/ping to the Opensearch cluster.
     *
     * <p>Called by {@link OpensearchSink#open(org.apache.flink.configuration.Configuration)} after
     * creating the client. This makes sure the underlying client is closed if the connection is not
     * successful and preventing thread leak.
```

### JavadocReference
Cannot resolve symbol `BulkProcessor.Builder`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java

    /**
     * Set backoff-related configurations on the provided {@link BulkProcessor.Builder}. The builder
     * will be later on used to instantiate the actual {@link BulkProcessor}.
     *
```

### JavadocReference
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
    /**
     * Set backoff-related configurations on the provided {@link BulkProcessor.Builder}. The builder
     * will be later on used to instantiate the actual {@link BulkProcessor}.
     *
     * @param builder the {@link BulkProcessor.Builder} to configure.
```

### JavadocReference
Cannot resolve symbol `BulkProcessor.Builder`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * will be later on used to instantiate the actual {@link BulkProcessor}.
     *
     * @param builder the {@link BulkProcessor.Builder} to configure.
     * @param flushBackoffPolicy user-provided backoff retry settings ({@code null} if the user
     *     disabled backoff retries).
```

### JavadocReference
Cannot resolve symbol `RestHighLevelClient`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
        /**
         * Creates a new {@code OpensearchSink} that connects to the cluster using a {@link
         * RestHighLevelClient}.
         *
         * @param httpHosts The list of {@link HttpHost} to which the {@link RestHighLevelClient}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
         * RestHighLevelClient}.
         *
         * @param httpHosts The list of {@link HttpHost} to which the {@link RestHighLevelClient}
         *     connects to.
         * @param opensearchSinkFunction This is used to generate multiple {@link ActionRequest}
```

### JavadocReference
Cannot resolve symbol `RestHighLevelClient`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
         * RestHighLevelClient}.
         *
         * @param httpHosts The list of {@link HttpHost} to which the {@link RestHighLevelClient}
         *     connects to.
         * @param opensearchSinkFunction This is used to generate multiple {@link ActionRequest}
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
         * @param httpHosts The list of {@link HttpHost} to which the {@link RestHighLevelClient}
         *     connects to.
         * @param opensearchSinkFunction This is used to generate multiple {@link ActionRequest}
         *     from the incoming element.
         */
```

### JavadocReference
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
    }

    /** Build the {@link BulkProcessor}. */
    private BulkProcessor buildBulkProcessor(BulkProcessor.Listener listener) {
        checkNotNull(listener);
```

### JavadocReference
Cannot resolve symbol `org.opensearch.client.transport.TransportClient`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * The config map that contains configuration for the bulk flushing behaviours.
     *
     * <p>For {@link org.opensearch.client.transport.TransportClient} based implementations, this
     * config map would also contain Opensearch-shipped configuration, and therefore this config map
     * would also be forwarded when creating the Opensearch client.
```

### JavadocReference
Cannot resolve symbol `Tuple2`
in `flink-connector-opensearch-e2e-tests/src/main/java/org/apache/flink/streaming/tests/ComparableTuple2.java`
#### Snippet
```java
import org.apache.flink.api.java.tuple.Tuple2;

/** Variation of the {@link Tuple2} which implements {@link Comparable}. */
public class ComparableTuple2<T0 extends Comparable<? super T0>, T1 extends Comparable<? super T1>>
        extends Tuple2<T0, T1> implements Comparable<ComparableTuple2<T0, T1>> {
```

### JavadocReference
Cannot resolve symbol `BulkProcessor.Listener`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * <p>This is incremented whenever the user adds (or re-adds through the {@link
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
```

### JavadocReference
Cannot resolve symbol `afterBulk(long,
* BulkRequest, BulkResponse)`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * <p>This is incremented whenever the user adds (or re-adds through the {@link
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
```

### JavadocReference
Cannot resolve symbol `BulkRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
     */
```

### JavadocReference
Cannot resolve symbol `BulkResponse`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
     */
```

### JavadocReference
Cannot resolve symbol `BulkProcessor.Listener`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
     */
```

### JavadocReference
Cannot resolve symbol `afterBulk(long, BulkRequest,
* Throwable)`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
     */
```

### JavadocReference
Cannot resolve symbol `BulkRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
     * ActionRequestFailureHandler}) requests to the {@link RequestIndexer}. It is decremented for
     * each completed request of a bulk request, in {@link BulkProcessor.Listener#afterBulk(long,
     * BulkRequest, BulkResponse)} and {@link BulkProcessor.Listener#afterBulk(long, BulkRequest,
     * Throwable)}.
     */
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java

    /**
     * Provided to the user via the {@link OpensearchSinkFunction} to add {@link ActionRequest
     * ActionRequests}.
     */
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

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSink.java`
#### Snippet
```java
    private final OpensearchSinkFunction<T> opensearchSinkFunction;

    /** User-provided handler for failed {@link ActionRequest ActionRequests}. */
    private final ActionRequestFailureHandler failureHandler;

```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSinkFunction.java`
#### Snippet
```java

    /**
     * Process the incoming element to produce multiple {@link ActionRequest ActionsRequests}. The
     * produced requests should be added to the provided {@link RequestIndexer}.
     *
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/OpensearchSinkFunction.java`
#### Snippet
```java

/**
 * Creates multiple {@link ActionRequest ActionRequests} from an element in a stream.
 *
 * <p>This is used by sinks to prepare elements for sending them to Opensearch.
```

### JavadocReference
Cannot resolve symbol `LogicalTypeFamily`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchValidationUtils.java`
#### Snippet
```java
     * bytes. It cannot have whitespaces. As of now it is calculated by concatenating the fields.
     * Certain types do not have a good string representation to be used in this scenario. The
     * illegal types are mostly {@link LogicalTypeFamily#COLLECTION} types and {@link
     * LogicalTypeRoot#RAW} type.
     */
```

### JavadocReference
Cannot resolve symbol `COLLECTION`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchValidationUtils.java`
#### Snippet
```java
     * bytes. It cannot have whitespaces. As of now it is calculated by concatenating the fields.
     * Certain types do not have a good string representation to be used in this scenario. The
     * illegal types are mostly {@link LogicalTypeFamily#COLLECTION} types and {@link
     * LogicalTypeRoot#RAW} type.
     */
```

### JavadocReference
Cannot resolve symbol `LogicalTypeRoot`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchValidationUtils.java`
#### Snippet
```java
     * Certain types do not have a good string representation to be used in this scenario. The
     * illegal types are mostly {@link LogicalTypeFamily#COLLECTION} types and {@link
     * LogicalTypeRoot#RAW} type.
     */
    public static void validatePrimaryKey(DataType primaryKeyDataType) {
```

### JavadocReference
Cannot resolve symbol `RAW`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchValidationUtils.java`
#### Snippet
```java
     * Certain types do not have a good string representation to be used in this scenario. The
     * illegal types are mostly {@link LogicalTypeFamily#COLLECTION} types and {@link
     * LogicalTypeRoot#RAW} type.
     */
    public static void validatePrimaryKey(DataType primaryKeyDataType) {
```

### JavadocReference
Cannot resolve symbol `IndexRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link IndexRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `IndexRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param indexRequests The multiple {@link IndexRequest} to add.
     */
    void add(IndexRequest... indexRequests);
```

### JavadocReference
Cannot resolve symbol `DeleteRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link DeleteRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `DeleteRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param deleteRequests The multiple {@link DeleteRequest} to add.
     */
    void add(DeleteRequest... deleteRequests);
```

### JavadocReference
Cannot resolve symbol `UpdateRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link UpdateRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `UpdateRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param updateRequests The multiple {@link UpdateRequest} to add.
     */
    void add(UpdateRequest... updateRequests);
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java

    /**
     * Add multiple {@link ActionRequest} to the indexer to prepare for sending requests to
     * Opensearch.
     *
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     * Opensearch.
     *
     * @param actionRequests The multiple {@link ActionRequest} to add.
     * @deprecated use the {@link DeleteRequest}, {@link IndexRequest} or {@link UpdateRequest}
     */
```

### JavadocReference
Cannot resolve symbol `DeleteRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     *
     * @param actionRequests The multiple {@link ActionRequest} to add.
     * @deprecated use the {@link DeleteRequest}, {@link IndexRequest} or {@link UpdateRequest}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `IndexRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     *
     * @param actionRequests The multiple {@link ActionRequest} to add.
     * @deprecated use the {@link DeleteRequest}, {@link IndexRequest} or {@link UpdateRequest}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `UpdateRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
     *
     * @param actionRequests The multiple {@link ActionRequest} to add.
     * @deprecated use the {@link DeleteRequest}, {@link IndexRequest} or {@link UpdateRequest}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Row`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGenerator.java`
#### Snippet
```java
import java.io.Serializable;

/** This interface is responsible to generate index name from given {@link Row} record. */
@Internal
interface IndexGenerator extends Serializable {
```

### JavadocReference
Cannot resolve symbol `RowData`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/IndexGenerator.java`
#### Snippet
```java
    /**
     * Initialize the index generator, this will be called only once before {@link
     * #generate(RowData)} is called.
     */
    default void open() {}
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/ActionRequestFailureHandler.java`
#### Snippet
```java

    /**
     * Handle a failed {@link ActionRequest}.
     *
     * @param action the {@link ActionRequest} that failed due to the failure
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/ActionRequestFailureHandler.java`
#### Snippet
```java
     * Handle a failed {@link ActionRequest}.
     *
     * @param action the {@link ActionRequest} that failed due to the failure
     * @param failure the cause of failure
     * @param restStatusCode the REST status code of the failure (-1 if none can be retrieved)
```

### JavadocReference
Cannot resolve symbol `ActionRequest`
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/ActionRequestFailureHandler.java`
#### Snippet
```java
/**
 * An implementation of {@link ActionRequestFailureHandler} is provided by the user to define how
 * failed {@link ActionRequest ActionRequests} should be handled, e.g. dropping them, reprocessing
 * malformed documents, or simply requesting them to be sent to Opensearch again if the failure is
 * only temporary.
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.table.api.TableDescriptor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchConnectorOptions.java`
#### Snippet
```java
/**
 * Base options for the Opensearch connector. Needs to be public so that the {@link
 * org.apache.flink.table.api.TableDescriptor} can access it.
 */
@PublicEvolving
```

### JavadocReference
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
     *     checkpoint
     * @param bulkProcessorConfig describing the flushing and failure handling of the used {@link
     *     BulkProcessor}
     * @param bulkProcessorBuilderFactory configuring the {@link BulkProcessor}'s builder
     * @param networkClientConfig describing properties of the network connection used to connect to
```

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
Cannot resolve symbol `BulkProcessor`
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchWriter.java`
#### Snippet
```java
     * @param bulkProcessorConfig describing the flushing and failure handling of the used {@link
     *     BulkProcessor}
     * @param bulkProcessorBuilderFactory configuring the {@link BulkProcessor}'s builder
     * @param networkClientConfig describing properties of the network connection used to connect to
     *     the Opensearch cluster
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'Object'
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/table/OpensearchValidationUtils.java`
#### Snippet
```java
                                    }
                                })
                        .filter(t -> !ALLOWED_PRIMARY_KEY_TYPES.contains(t))
                        .collect(Collectors.toList());
        if (!illegalTypes.isEmpty()) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-connector-opensearch/src/main/java/org/apache/flink/connector/opensearch/sink/OpensearchSinkBuilder.java`
#### Snippet
```java
        checkNotNull(hosts);
        checkState(hosts.length > 0, "Hosts cannot be empty.");
        this.hosts = Arrays.asList(hosts);
        return self();
    }
```

## RuleId[id=NullableProblems]
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
class NetworkClientConfig implements Serializable {

    @Nullable private final String username;
    @Nullable private final String password;
    @Nullable private final String connectionPathPrefix;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `bufferedRequests` may be 'final'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
class BufferingNoOpRequestIndexer implements RequestIndexer {

    private ConcurrentLinkedQueue<ActionRequest> bufferedRequests;

    BufferingNoOpRequestIndexer() {
```

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
Value `request` is always 'null'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
            if (request instanceof IndexRequest) {
                actualIndexer.add((IndexRequest) request);
            } else if (request instanceof DeleteRequest) {
                actualIndexer.add((DeleteRequest) request);
            } else if (request instanceof UpdateRequest) {
```

### ConstantValue
Value `request` is always 'null'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/BufferingNoOpRequestIndexer.java`
#### Snippet
```java
            } else if (request instanceof DeleteRequest) {
                actualIndexer.add((DeleteRequest) request);
            } else if (request instanceof UpdateRequest) {
                actualIndexer.add((UpdateRequest) request);
            }
```

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

### ConstantValue
Value `actionRequest` is always 'null'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
            if (actionRequest instanceof IndexRequest) {
                add((IndexRequest) actionRequest);
            } else if (actionRequest instanceof DeleteRequest) {
                add((DeleteRequest) actionRequest);
            } else if (actionRequest instanceof UpdateRequest) {
```

### ConstantValue
Value `actionRequest` is always 'null'
in `flink-connector-opensearch/src/main/java/org/apache/flink/streaming/connectors/opensearch/RequestIndexer.java`
#### Snippet
```java
            } else if (actionRequest instanceof DeleteRequest) {
                add((DeleteRequest) actionRequest);
            } else if (actionRequest instanceof UpdateRequest) {
                add((UpdateRequest) actionRequest);
            } else {
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

