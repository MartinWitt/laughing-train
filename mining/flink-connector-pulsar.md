# flink-connector-pulsar 
 
# Bad smells
I found 22 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 14 | false |
| DuplicatedCode | 3 | false |
| UnnecessaryModifier | 1 | true |
| AutoCloseableResource | 1 | false |
| JavadocDeclaration | 1 | false |
| UnusedAssignment | 1 | false |
| RefusedBequest | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarClientFactory.java`
#### Snippet
```java
        configuration.useOption(PULSAR_NUM_IO_THREADS, builder::ioThreads);
        configuration.useOption(PULSAR_NUM_LISTENER_THREADS, builder::listenerThreads);
        configuration.useOption(PULSAR_CONNECTIONS_PER_BROKER, builder::connectionsPerBroker);
        configuration.useOption(
                PULSAR_CONNECTION_MAX_IDLE_SECONDS, builder::connectionMaxIdleSeconds);
        configuration.useOption(PULSAR_USE_TCP_NO_DELAY, builder::enableTcpNoDelay);
        configuration.useOption(PULSAR_TLS_KEY_FILE_PATH, builder::tlsKeyFilePath);
        configuration.useOption(PULSAR_TLS_CERTIFICATE_FILE_PATH, builder::tlsCertificateFilePath);
        configuration.useOption(PULSAR_TLS_TRUST_CERTS_FILE_PATH, builder::tlsTrustCertsFilePath);
        configuration.useOption(
                PULSAR_TLS_ALLOW_INSECURE_CONNECTION, builder::allowTlsInsecureConnection);
```

### DuplicatedCode
Duplicated code
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarClientFactory.java`
#### Snippet
```java
        configuration.useOption(PULSAR_TLS_KEY_STORE_PASSWORD, builder::tlsKeyStorePassword);
        configuration.useOption(PULSAR_TLS_TRUST_STORE_TYPE, builder::tlsTrustStoreType);
        configuration.useOption(PULSAR_TLS_TRUST_STORE_PATH, builder::tlsTrustStorePath);
        configuration.useOption(PULSAR_TLS_TRUST_STORE_PASSWORD, builder::tlsTrustStorePassword);
        configuration.useOption(PULSAR_TLS_CIPHERS, TreeSet::new, builder::tlsCiphers);
        configuration.useOption(PULSAR_TLS_PROTOCOLS, TreeSet::new, builder::tlsProtocols);
```

### DuplicatedCode
Duplicated code
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/topic/ProducerRegister.java`
#### Snippet
```java
            group.gauge(NUM_MSGS_SENT, stats::getNumMsgsSent);
            group.gauge(NUM_BYTES_SENT, stats::getNumBytesSent);
            group.gauge(NUM_SEND_FAILED, stats::getNumSendFailed);
            group.gauge(NUM_ACKS_RECEIVED, stats::getNumAcksReceived);
            group.gauge(SEND_MSGS_RATE, stats::getSendMsgsRate);
            group.gauge(SEND_BYTES_RATE, stats::getSendBytesRate);
            group.gauge(SEND_LATENCY_MILLIS_50_PCT, stats::getSendLatencyMillis50pct);
            group.gauge(SEND_LATENCY_MILLIS_75_PCT, stats::getSendLatencyMillis75pct);
            group.gauge(SEND_LATENCY_MILLIS_95_PCT, stats::getSendLatencyMillis95pct);
            group.gauge(SEND_LATENCY_MILLIS_99_PCT, stats::getSendLatencyMillis99pct);
            group.gauge(SEND_LATENCY_MILLIS_999_PCT, stats::getSendLatencyMillis999pct);
            group.gauge(SEND_LATENCY_MILLIS_MAX, stats::getSendLatencyMillisMax);
            group.gauge(TOTAL_MSGS_SENT, stats::getTotalMsgsSent);
            group.gauge(TOTAL_BYTES_SENT, stats::getTotalBytesSent);
            group.gauge(TOTAL_SEND_FAILED, stats::getTotalSendFailed);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/deserializer/PulsarDeserializationSchema.java`
#### Snippet
```java
    /** An interface for providing extra schema initial context for users. */
    @PublicEvolving
    public interface PulsarInitializationContext extends InitializationContext {

        /** Return the internal client for extra dynamic features. */
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'TransactionCoordinatorClient' used without 'try'-with-resources statement
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/committer/PulsarCommitter.java`
#### Snippet
```java
    public void commit(Collection<CommitRequest<PulsarCommittable>> requests)
            throws PulsarClientException {
        TransactionCoordinatorClient client = transactionCoordinatorClient();

        for (CommitRequest<PulsarCommittable> request : requests) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/PulsarSourceBuilder.java`
#### Snippet
```java
     * By default, the PulsarSource runs in an {@link Boundedness#CONTINUOUS_UNBOUNDED} mode and
     * never stop until the Flink job is canceled or fails. To let the PulsarSource run in {@link
     * Boundedness#CONTINUOUS_UNBOUNDED} but stops at some given offsets, one can call {@link
     * #setUnboundedStopCursor(StopCursor)} and disable auto partition discovery as described below.
     *
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `partitions` initializer `null` is redundant
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/PulsarSourceEnumStateSerializer.java`
#### Snippet
```java
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serialized);
                DataInputStream in = new DataInputStream(bais)) {
            Set<TopicPartition> partitions = null;
            if (version == 3) {
                partitions = deserializeSet(in, deserializePartition(2));
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
    private final long eventTime;
    @Nullable private final Schema<T> schema;
    @Nullable private final T value;
    @Nullable private final Map<String, String> properties;
    @Nullable private final Long sequenceId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
public class PulsarMessage<T> {

    @Nullable private final byte[] orderingKey;
    @Nullable private final String key;
    private final long eventTime;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
    @Nullable private final Map<String, String> properties;
    @Nullable private final Long sequenceId;
    @Nullable private final List<String> replicationClusters;
    private final boolean disableReplication;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
    @Nullable private final Schema<T> schema;
    @Nullable private final T value;
    @Nullable private final Map<String, String> properties;
    @Nullable private final Long sequenceId;
    @Nullable private final List<String> replicationClusters;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java

    @Nullable private final byte[] orderingKey;
    @Nullable private final String key;
    private final long eventTime;
    @Nullable private final Schema<T> schema;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
    @Nullable private final String key;
    private final long eventTime;
    @Nullable private final Schema<T> schema;
    @Nullable private final T value;
    @Nullable private final Map<String, String> properties;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessage.java`
#### Snippet
```java
    @Nullable private final T value;
    @Nullable private final Map<String, String> properties;
    @Nullable private final Long sequenceId;
    @Nullable private final List<String> replicationClusters;
    private final boolean disableReplication;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessageBuilder.java`
#### Snippet
```java
    private String key;
    private long eventTime;
    @Nullable private final Schema<T> schema;
    @Nullable private final T value;
    private final Map<String, String> properties = new HashMap<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessageBuilder.java`
#### Snippet
```java
    private long eventTime;
    @Nullable private final Schema<T> schema;
    @Nullable private final T value;
    private final Map<String, String> properties = new HashMap<>();
    private Long sequenceId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/topic/ProducerRegister.java`
#### Snippet
```java

    private final PulsarClient pulsarClient;
    @Nullable private final TransactionCoordinatorClient coordinatorClient;
    private final SinkConfiguration sinkConfiguration;
    private final PulsarCrypto pulsarCrypto;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/split/PulsarPartitionSplitState.java`
#### Snippet
```java
    @Nullable private TxnID uncommittedTransactionId;

    @Nullable private MessageId latestConsumedId;

    public PulsarPartitionSplitState(PulsarPartitionSplit split) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/split/PulsarPartitionSplitState.java`
#### Snippet
```java
    private final PulsarPartitionSplit split;

    @Nullable private TxnID uncommittedTransactionId;

    @Nullable private MessageId latestConsumedId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/split/PulsarPartitionSplit.java`
#### Snippet
```java
     * to serialize this field into flink checkpoint state.
     */
    @Nullable private final MessageId latestConsumedId;

    @Nullable private final TxnID uncommittedTransactionId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/split/PulsarPartitionSplit.java`
#### Snippet
```java
    @Nullable private final MessageId latestConsumedId;

    @Nullable private final TxnID uncommittedTransactionId;

    public PulsarPartitionSplit(TopicPartition partition, StopCursor stopCursor) {
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/schema/BytesSchema.java`
#### Snippet
```java

    @Override
    public Schema<byte[]> clone() {
        return this;
    }
```

