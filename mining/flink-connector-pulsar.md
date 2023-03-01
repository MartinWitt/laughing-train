# flink-connector-pulsar 
 
# Bad smells
I found 76 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 45 | false |
| NullableProblems | 14 | false |
| UnnecessarySuperQualifier | 4 | false |
| ReturnNull | 3 | false |
| AssignmentToMethodParameter | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| RedundantFieldInitialization | 1 | false |
| UnnecessaryModifier | 1 | true |
| SynchronizeOnThis | 1 | false |
| UnusedAssignment | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| RefusedBequest | 1 | false |
## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/message/PulsarMessageBuilder.java`
#### Snippet
```java
    private Long sequenceId;
    private List<String> replicationClusters;
    private boolean disableReplication = false;

    /**
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/topic/ProducerRegister.java`
#### Snippet
```java
            throws PulsarClientException {
        if (schema == null || schema.getSchemaInfo().getType() == SchemaType.BYTES) {
            schema = getBytesSchema(topic);
        }
        ProducerBase<?> producer = (ProducerBase<?>) getOrCreateProducer(topic, schema);
```

### AssignmentToMethodParameter
Assignment to method parameter `remainingTimes`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/handler/PulsarAdminInvocationHandler.java`
#### Snippet
```java
                        throw throwable;
                    } else if (throwable instanceof PulsarAdminException) {
                        remainingTimes--;
                        LOG.warn("Request error in Admin API, remain times: {}", remainingTimes, e);
                        if (remainingTimes == 0) {
```

## RuleId[ruleID=UnnecessaryModifier]
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

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/crypto/DefaultPulsarCrypto.java`
#### Snippet
```java
        private final Set<String> encryptKeys = new HashSet<>();
        private SerializableSupplier<MessageCrypto<MessageMetadata, MessageMetadata>>
                messageCryptoSupplier = () -> null;

        DefaultPulsarCryptoBuilder() {}
```

### ReturnNull
Return of `null`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/subscriber/impl/BasePulsarSubscriber.java`
#### Snippet
```java
            if (e.getStatusCode() == 404) {
                // Return null for skipping the topic metadata query.
                return null;
            } else {
                // This method would cause failure for subscribers.
```

### ReturnNull
Return of `null`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfiguration.java`
#### Snippet
```java
            return convertor.apply(value);
        } else {
            return null;
        }
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/subscriber/impl/TopicPatternSubscriber.java`
#### Snippet
```java
     */
    private boolean matchesTopicPattern(String topic) {
        String shortenedTopic = topic.split("://")[1];
        return shortenedPattern.matcher(shortenedTopic).matches();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/subscriber/impl/TopicPatternSubscriber.java`
#### Snippet
```java
        String pattern = destination.toString();

        this.shortenedPattern = Pattern.compile(pattern.split("://")[1]);
        this.namespace = destination.getNamespaceObject().toString();
        this.subscriptionMode = convertRegexSubscriptionMode(subscriptionMode);
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/config/PulsarConsumerBuilder.java`
#### Snippet
```java
    @Override
    public CompletableFuture<Consumer<T>> subscribeAsync() {
        PulsarClientImpl client = super.getClient();
        ConsumerConfigurationData<T> conf = super.getConf();
        Schema<T> schema = super.getSchema();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/config/PulsarConsumerBuilder.java`
#### Snippet
```java
    public CompletableFuture<Consumer<T>> subscribeAsync() {
        PulsarClientImpl client = super.getClient();
        ConsumerConfigurationData<T> conf = super.getConf();
        Schema<T> schema = super.getSchema();
        List<ConsumerInterceptor<T>> interceptorList = super.getInterceptorList();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/config/PulsarConsumerBuilder.java`
#### Snippet
```java
        PulsarClientImpl client = super.getClient();
        ConsumerConfigurationData<T> conf = super.getConf();
        Schema<T> schema = super.getSchema();
        List<ConsumerInterceptor<T>> interceptorList = super.getInterceptorList();

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/config/PulsarConsumerBuilder.java`
#### Snippet
```java
        ConsumerConfigurationData<T> conf = super.getConf();
        Schema<T> schema = super.getSchema();
        List<ConsumerInterceptor<T>> interceptorList = super.getInterceptorList();

        // Override the default subscribeAsync for skipping the subscription validation.
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/handler/PulsarAdminInvocationHandler.java`
#### Snippet
```java
    private static void requestRateLimit(int requestRates) {
        if (rateLimiter == null) {
            synchronized (PulsarAdminInvocationHandler.class) {
                if (rateLimiter == null) {
                    rateLimiter = RateLimiter.create(requestRates);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends TopicPartition`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/router/RoundRobinTopicRouter.java`
#### Snippet
```java
    @Override
    public TopicPartition route(
            IN in, String key, List<TopicPartition> partitions, PulsarSinkContext context) {
        checkArgument(
                !partitions.isEmpty(),
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/PulsarRecordEmitter.java`
#### Snippet
```java
        }

        private void setSourceOutput(SourceOutput<T> sourceOutput) {
            this.sourceOutput = sourceOutput;
        }
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfigBuilder.java`
#### Snippet
```java
    /** Validate the current config instance and return a unmodifiable configuration. */
    public <T extends PulsarConfiguration> T build(
            PulsarConfigValidator validator, Function<Configuration, T> constructor) {
        validator.validate(configuration);
        return constructor.apply(configuration);
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/deserializer/PulsarDeserializationSchemaWrapper.java`
#### Snippet
```java

    @Override
    public void deserialize(Message<byte[]> message, Collector<T> out) throws Exception {
        byte[] bytes = message.getData();
        T instance = deserializationSchema.deserialize(bytes);
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarClientFactory.java`
#### Snippet
```java
            ConfigOption<String> option,
            boolean allowRandomPort,
            ObjIntConsumer<String> setter) {
        if (!configuration.contains(option)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends TopicPartition`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/router/KeyHashTopicRouter.java`
#### Snippet
```java
    @Override
    public TopicPartition route(
            IN in, String key, List<TopicPartition> partitions, PulsarSinkContext context) {
        checkArgument(
                !partitions.isEmpty(),
```

### BoundedWildcard
Can generalize to `? super IN`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/sink/writer/serializer/PulsarSerializationSchemaWrapper.java`
#### Snippet
```java
    private final SerializationSchema<IN> serializationSchema;

    public PulsarSerializationSchemaWrapper(SerializationSchema<IN> serializationSchema) {
        this.serializationSchema = serializationSchema;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/deserializer/GenericRecordDeserializationSchema.java`
#### Snippet
```java

    @Override
    public void deserialize(Message<byte[]> message, Collector<T> out) throws Exception {
        AutoConsumeSchema schema = getSchema(message);
        GenericRecord element = schema.decode(message.getData(), message.getSchemaVersion());
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
    public static <T> void serializeList(
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            List<T> list,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(list.size());
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
    public static <T> void serializeSet(
            DataOutputStream out,
            Set<T> set,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Set<T> set,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(set.size());
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Set<T> set,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(set.size());
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Set<T> set,
            BiConsumerWithException<DataOutputStream, T, IOException> serializer)
            throws IOException {
        out.writeInt(set.size());
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends K`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
    public static <K, V> Map<K, V> deserializeMap(
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends V`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataInputStream in,
            FunctionWithException<DataInputStream, K, IOException> keyDeserializer,
            FunctionWithException<DataInputStream, V, IOException> valueDeserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> Set<T> deserializeSet(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> Set<T> deserializeSet(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> Set<T> deserializeSet(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? super DataInputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java

    public static <T> List<T> deserializeList(
            DataInputStream in, FunctionWithException<DataInputStream, T, IOException> deserializer)
            throws IOException {
        int size = in.readInt();
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super K`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            DataOutputStream out,
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
```

### BoundedWildcard
Can generalize to `? super DataOutputStream`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? super V`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/utils/PulsarSerdeUtils.java`
#### Snippet
```java
            Map<K, V> map,
            BiConsumerWithException<DataOutputStream, K, IOException> keySerializer,
            BiConsumerWithException<DataOutputStream, V, IOException> valueSerializer)
            throws IOException {
        out.writeInt(map.size());
```

### BoundedWildcard
Can generalize to `? extends Set`>
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfigValidator.java`
#### Snippet
```java

    private PulsarConfigValidator(
            List<Set<ConfigOption<?>>> conflictOptions, Set<ConfigOption<?>> requiredOptions) {
        this.conflictOptions = conflictOptions;
        this.requiredOptions = requiredOptions;
```

### BoundedWildcard
Can generalize to `? extends ConfigOption`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfigValidator.java`
#### Snippet
```java

    private PulsarConfigValidator(
            List<Set<ConfigOption<?>>> conflictOptions, Set<ConfigOption<?>> requiredOptions) {
        this.conflictOptions = conflictOptions;
        this.requiredOptions = requiredOptions;
```

### BoundedWildcard
Can generalize to `? extends MessageCrypto`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/crypto/DefaultPulsarCrypto.java`
#### Snippet
```java
            CryptoKeyReader cryptoKeyReader,
            Set<String> encryptKeys,
            SerializableSupplier<MessageCrypto<MessageMetadata, MessageMetadata>>
                    messageCryptoSupplier) {
        this.cryptoKeyReader = cryptoKeyReader;
```

### BoundedWildcard
Can generalize to `? extends TopicRange`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/topic/range/TopicRangeUtils.java`
#### Snippet
```java

    /** Check if the given topic ranges are full Pulsar range. */
    public static boolean isFullTopicRanges(List<TopicRange> ranges) {
        List<TopicRange> sorted =
                ranges.stream().sorted(comparingLong(TopicRange::getStart)).collect(toList());
```

### BoundedWildcard
Can generalize to `? extends TopicPartition`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/assigner/SplitAssignerImpl.java`
#### Snippet
```java

    @Override
    public List<TopicPartition> registerTopicPartitions(Set<TopicPartition> fetchedPartitions) {
        List<TopicPartition> newPartitions = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends PulsarPartitionSplit`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/enumerator/assigner/SplitAssignerImpl.java`
#### Snippet
```java

    @Override
    public void addSplitsBack(List<PulsarPartitionSplit> splits, int subtaskId) {
        for (PulsarPartitionSplit split : splits) {
            int readerId = partitionOwner(split.getPartition());
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/deserializer/PulsarSchemaWrapper.java`
#### Snippet
```java

    @Override
    public void deserialize(Message<byte[]> message, Collector<T> out) throws Exception {
        Schema<T> schema = this.pulsarSchema.getPulsarSchema();
        byte[] bytes = message.getData();
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/source/reader/deserializer/PulsarTypeInformationWrapper.java`
#### Snippet
```java

    @Override
    public void deserialize(Message<byte[]> message, Collector<T> out) throws Exception {
        DataInputDeserializer dis = DESERIALIZER.get();
        dis.setBuffer(message.getData());
```

### BoundedWildcard
Can generalize to `? extends V`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfiguration.java`
#### Snippet
```java
     */
    public <T, V> void useOption(
            ConfigOption<T> option, Function<T, V> convertor, Consumer<V> setter) {
        if (contains(option) || option.hasDefaultValue()) {
            V value = get(option, convertor);
```

### BoundedWildcard
Can generalize to `? super V`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfiguration.java`
#### Snippet
```java
     */
    public <T, V> void useOption(
            ConfigOption<T> option, Function<T, V> convertor, Consumer<V> setter) {
        if (contains(option) || option.hasDefaultValue()) {
            V value = get(option, convertor);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfiguration.java`
#### Snippet
```java
     * Get the option value by a prefix. We would return an empty map if the option doesn't exist.
     */
    public Map<String, String> getProperties(ConfigOption<Map<String, String>> option) {
        Map<String, String> properties = new HashMap<>();
        if (contains(option)) {
```

## RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=NullableProblems]
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
public class PulsarMessage<T> {

    @Nullable private final byte[] orderingKey;
    @Nullable private final String key;
    private final long eventTime;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-pulsar/src/main/java/org/apache/flink/connector/pulsar/common/config/PulsarConfigBuilder.java`
#### Snippet
```java
                            ConfigOption<String> option =
                                    ConfigOptions.key(key).stringType().noDefaultValue();
                            Object value = properties.get(key);

                            if (value != null) {
```

## RuleId[ruleID=RefusedBequest]
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

