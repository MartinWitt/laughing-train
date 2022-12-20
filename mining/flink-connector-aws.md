# flink-connector-aws 
 
# Bad smells
I found 202 bad smells with 32 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 32 | false |
| UseOfPropertiesAsHashtable | 25 | false |
| BoundedWildcard | 19 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| StaticCallOnSubclass | 12 | false |
| UnnecessaryToStringCall | 7 | true |
| ReturnNull | 7 | false |
| SizeReplaceableByIsEmpty | 6 | true |
| RegExpSimplifiable | 5 | false |
| IgnoreResultOfCall | 5 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| AssignmentToMethodParameter | 5 | false |
| DataFlowIssue | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| CommentedOutCode | 2 | false |
| ObjectNotify | 2 | false |
| UnnecessaryBoxing | 2 | false |
| SystemOutErr | 2 | false |
| NestedAssignment | 2 | false |
| BusyWait | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| NullableProblems | 1 | false |
| RedundantSuppression | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| EmptyMethod | 1 | false |
| RedundantImplements | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DoubleBraceInitialization | 1 | false |
| WaitNotInLoop | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (startingPosition.getShardIteratorType()) { case AT_TIMESTAMP: { ...` statement on enum type 'com.amazonaws.services.kinesis.model.ShardIteratorType' misses cases: 'TRIM_HORIZON', and 'LATEST'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisher.java`
#### Snippet
```java
        Object marker = startingPosition.getStartingMarker();

        switch (startingPosition.getShardIteratorType()) {
            case AT_TIMESTAMP:
                {
                    Preconditions.checkNotNull(
                            marker, "StartingPosition AT_TIMESTAMP date marker is null.");
                    builder.timestamp(((Date) marker).toInstant());
                    break;
                }
            case AT_SEQUENCE_NUMBER:
            case AFTER_SEQUENCE_NUMBER:
                {
                    Preconditions.checkNotNull(
                            marker, "StartingPosition *_SEQUENCE_NUMBER position is null.");
                    builder.sequenceNumber(marker.toString());
                    break;
                }
        }

        return builder.build();
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkBuilder.java`
#### Snippet
```java
    private static final long DEFAULT_MAX_BATCH_SIZE_IN_B = 5 * 1024 * 1024;
    private static final long DEFAULT_MAX_TIME_IN_BUFFER_MS = 5000;
    private static final long DEFAULT_MAX_RECORD_SIZE_IN_B = 1 * 1024 * 1024;
    private static final boolean DEFAULT_FAIL_ON_ERROR = false;

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DynamoDbConfigConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbConfigConstants.java`
#### Snippet
```java
/** Defaults for {@link DynamoDbSinkWriter}. */
@PublicEvolving
public class DynamoDbConfigConstants {

    public static final String BASE_DYNAMODB_USER_AGENT_PREFIX_FORMAT =
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisPartitionKeyGeneratorFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisPartitionKeyGeneratorFactory.java`
#### Snippet
```java
/** Factory Class for {@link PartitionKeyGenerator}. */
@Internal
public class KinesisPartitionKeyGeneratorFactory {

    // -----------------------------------------------------------------------------------------
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisFirehoseConfigConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseConfigConstants.java`
#### Snippet
```java
/** Defaults for {@link KinesisFirehoseSinkWriter}. */
@PublicEvolving
public class KinesisFirehoseConfigConstants {

    public static final String BASE_FIREHOSE_USER_AGENT_PREFIX_FORMAT =
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisExampleTest` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java

/** Test driver for {@link KinesisExample#main}. */
public class KinesisExampleTest {
    private static final Logger LOG = LoggerFactory.getLogger(KinesisExampleTest.class);

```

### UtilityClassWithoutPrivateConstructor
Class `KinesisStreamsConfigConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsConfigConstants.java`
#### Snippet
```java
/** Defaults for {@link KinesisStreamsSinkWriter}. */
@PublicEvolving
public class KinesisStreamsConfigConstants {

    public static final String BASE_KINESIS_USER_AGENT_PREFIX_FORMAT =
```

### UtilityClassWithoutPrivateConstructor
Class `DynamoDbSerializationUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/util/DynamoDbSerializationUtil.java`
#### Snippet
```java
 */
@Internal
public class DynamoDbSerializationUtil {

    public static void serializeWriteRequest(
```

### UtilityClassWithoutPrivateConstructor
Class `AwsV2Util` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AwsV2Util.java`
#### Snippet
```java
/** Utility methods specific to Amazon Web Service SDK v2.x. */
@Internal
public class AwsV2Util {
    public static AttributeMap convertProperties(Properties properties) {
        AttributeMap.Builder mapBuilder = AttributeMap.builder();
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisExample` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
 * https://localhost:4567 --flink.stream.initpos TRIM_HORIZON
 */
public class KinesisExample {
    public static void main(String[] args) throws Exception {
        // parse input arguments
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisConfigUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/KinesisConfigUtil.java`
#### Snippet
```java
/** Utilities for Flink Kinesis connector configuration. */
@Internal
public class KinesisConfigUtil {

    /** Maximum number of items to pack into an PutRecords request. */
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisProxyV2Factory` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/KinesisProxyV2Factory.java`
#### Snippet
```java
/** Creates instances of {@link KinesisProxyV2}. */
@Internal
public class KinesisProxyV2Factory {

    private static final FullJitterBackoff BACKOFF = new FullJitterBackoff();
```

### UtilityClassWithoutPrivateConstructor
Class `KinesisConsumerMetricConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/KinesisConsumerMetricConstants.java`
#### Snippet
```java
 */
@Internal
public class KinesisConsumerMetricConstants {

    public static final String KINESIS_CONSUMER_METRICS_GROUP = "KinesisConsumer";
```

### UtilityClassWithoutPrivateConstructor
Class `AWSUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
/** Some utilities specific to Amazon Web Service. */
@Internal
public class AWSUtil {
    /**
     * Creates an AmazonKinesis client.
```

### UtilityClassWithoutPrivateConstructor
Class `AWSCredentialFatalExceptionClassifiers` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSCredentialFatalExceptionClassifiers.java`
#### Snippet
```java
/** Class containing set of {@link FatalExceptionClassifier} for AWS credential failures. */
@Internal
public class AWSCredentialFatalExceptionClassifiers {
    public static FatalExceptionClassifier getInvalidCredentialsExceptionClassifier() {
        return FatalExceptionClassifier.withRootCauseOfType(
```

### UtilityClassWithoutPrivateConstructor
Class `StreamConsumerRegistrarUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/StreamConsumerRegistrarUtil.java`
#### Snippet
```java
 */
@Internal
public class StreamConsumerRegistrarUtil {

    /**
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `roleCredentialsProvider()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                                getCredentialsProvider(
                                        configProps,
                                        AWSConfigConstants.roleCredentialsProvider(configPrefix)));

        if (configProps.containsKey(AWSConfigConstants.AWS_ROLE_STS_ENDPOINT)) {
```

### StaticCallOnSubclass
Static method `accessKeyId()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        return new BasicAWSCredentials(
                                configProps.getProperty(
                                        AWSConfigConstants.accessKeyId(configPrefix)),
                                configProps.getProperty(
                                        AWSConfigConstants.secretKey(configPrefix)));
```

### StaticCallOnSubclass
Static method `secretKey()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                                        AWSConfigConstants.accessKeyId(configPrefix)),
                                configProps.getProperty(
                                        AWSConfigConstants.secretKey(configPrefix)));
                    }

```

### StaticCallOnSubclass
Static method `getCredentialProviderType()` declared in class 'org.apache.flink.connector.aws.util.AWSGeneralUtil' but referenced via subclass 'org.apache.flink.connector.aws.util.AWSAsyncSinkUtil'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
            final Properties configProps, final String configPrefix) {
        CredentialProvider credentialProviderType =
                AWSAsyncSinkUtil.getCredentialProviderType(configProps, configPrefix);

        switch (credentialProviderType) {
```

### StaticCallOnSubclass
Static method `profileName()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
            case PROFILE:
                String profileName =
                        configProps.getProperty(AWSConfigConstants.profileName(configPrefix), null);
                String profileConfigPath =
                        configProps.getProperty(AWSConfigConstants.profilePath(configPrefix), null);
```

### StaticCallOnSubclass
Static method `profilePath()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        configProps.getProperty(AWSConfigConstants.profileName(configPrefix), null);
                String profileConfigPath =
                        configProps.getProperty(AWSConfigConstants.profilePath(configPrefix), null);
                return (profileConfigPath == null)
                        ? new ProfileCredentialsProvider(profileName)
```

### StaticCallOnSubclass
Static method `roleArn()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
            case ASSUME_ROLE:
                return new STSAssumeRoleSessionCredentialsProvider.Builder(
                                configProps.getProperty(AWSConfigConstants.roleArn(configPrefix)),
                                configProps.getProperty(
                                        AWSConfigConstants.roleSessionName(configPrefix)))
```

### StaticCallOnSubclass
Static method `roleSessionName()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                                configProps.getProperty(AWSConfigConstants.roleArn(configPrefix)),
                                configProps.getProperty(
                                        AWSConfigConstants.roleSessionName(configPrefix)))
                        .withExternalId(
                                configProps.getProperty(
```

### StaticCallOnSubclass
Static method `externalId()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        .withExternalId(
                                configProps.getProperty(
                                        AWSConfigConstants.externalId(configPrefix)))
                        .withStsClient(createStsClient(configProps, configPrefix))
                        .build();
```

### StaticCallOnSubclass
Static method `roleArn()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        .roleArn(
                                configProps.getProperty(
                                        AWSConfigConstants.roleArn(configPrefix), null))
                        .roleSessionName(
                                configProps.getProperty(
```

### StaticCallOnSubclass
Static method `roleSessionName()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        .roleSessionName(
                                configProps.getProperty(
                                        AWSConfigConstants.roleSessionName(configPrefix), null))
                        .webIdentityTokenFile(
                                configProps.getProperty(
```

### StaticCallOnSubclass
Static method `webIdentityTokenFile()` declared in class 'org.apache.flink.connector.aws.config.AWSConfigConstants' but referenced via subclass 'org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
                        .webIdentityTokenFile(
                                configProps.getProperty(
                                        AWSConfigConstants.webIdentityTokenFile(configPrefix),
                                        null))
                        .build();
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/BeanDeserializerModifierForIgnorables.java`
#### Snippet
```java
    public BeanDeserializerModifierForIgnorables(Class clazz, String... properties) {
        ignorables = new ArrayList<>();
        for (String property : properties) {
            ignorables.add(property);
        }
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getTimestamp` may produce `NullPointerException`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
                        if (!queueHead.queue.isEmpty()) {
                            emptyQueues.remove(queueHead);
                            queueHead.headTimestamp = queueHead.queue.peek().getTimestamp();
                            heads.offer(queueHead);
                        }
```

### DataFlowIssue
Variable is already assigned to this value
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/RowDataToAttributeValueConverter.java`
#### Snippet
```java
                    createFieldGetter(field.getDataType().getLogicalType(), i);

            builder = addAttribute(builder, field, fieldGetter);
        }
        return builder.build();
```

### DataFlowIssue
Method invocation `toInstant` may produce `NullPointerException`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisher.java`
#### Snippet
```java
                    Preconditions.checkNotNull(
                            marker, "StartingPosition AT_TIMESTAMP date marker is null.");
                    builder.timestamp(((Date) marker).toInstant());
                    break;
                }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisher.java`
#### Snippet
```java
                    Preconditions.checkNotNull(
                            marker, "StartingPosition *_SEQUENCE_NUMBER position is null.");
                    builder.sequenceNumber(marker.toString());
                    break;
                }
```

## RuleId[ruleID=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
    }

    private class AsyncRecordQueue<T> implements RecordQueue<T> {
        private final ArrayBlockingQueue<T> queue;
        private final int queueId;
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'KinesisStreamShard' is still used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/KinesisStreamShard.java`
#### Snippet
```java
@Deprecated
@Internal
public class KinesisStreamShard implements Serializable {

    private static final long serialVersionUID = -6004217801761077536L;
```

### DeprecatedIsStillUsed
Deprecated member 'ProducerConfigConstants' is still used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ProducerConfigConstants.java`
#### Snippet
```java
 */
@Deprecated
public class ProducerConfigConstants extends AWSConfigConstants {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AGGREGATION_MAX_COUNT' is still used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ProducerConfigConstants.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String AGGREGATION_MAX_COUNT = "aws.producer.aggregationMaxCount";
}

```

### DeprecatedIsStillUsed
Deprecated member 'COLLECTION_MAX_COUNT' is still used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ProducerConfigConstants.java`
#### Snippet
```java
     *     keys. Please use {@code CollectionMaxCount} instead.
     */
    @Deprecated public static final String COLLECTION_MAX_COUNT = "aws.producer.collectionMaxCount";

    /**
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java
        LOG.info("results: {}", results);

        //        Validate.isTrue(
        //                results.size() == messages.length,
        //                "Expecting results to equal " + results.size() + " , but was " +
```

### CommentedOutCode
Commented out code (3 lines)
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java

        for (String expectedResult : expectedResults) {
            //            Validate.isTrue(
            //                    results.contains(expectedResult), "Expecting to receive " +
            // expectedResult);
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `lastLogged` from instance context
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
            if (logAccumulatorIntervalMillis > 0) {
                if (currentTime - lastLogged > logAccumulatorIntervalMillis) {
                    lastLogged = System.currentTimeMillis();
                    LOG.info(
                            "WatermarkAggregateFunction added: {}, timeout: {}, map: {}",
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `addCount` from instance context
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
        public Map<String, WatermarkState> add(
                byte[] valueBytes, Map<String, WatermarkState> accumulator) {
            addCount++;
            final WatermarkUpdate value;
            try {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `addCount` from instance context
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
            // no op to get global watermark without updating it
            if (value.watermark == Long.MIN_VALUE) {
                addCount--;
                return accumulator;
            }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `resolvedOptions.keySet()` may be replaced with 'entrySet()' iteration
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/table/util/AWSOptionUtils.java`
#### Snippet
```java
    public Map<String, String> getProcessedResolvedOptions() {
        Map<String, String> mappedResolvedOptions = new HashMap<>();
        for (String key : resolvedOptions.keySet()) {
            if (key.startsWith(AWS_PROPERTIES_PREFIX)) {
                mappedResolvedOptions.put(translateAwsKey(key), resolvedOptions.get(key));
```

### KeySetIterationMayUseEntrySet
Iteration over `resolvedOptions.keySet()` may be replaced with 'entrySet()' iteration
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/table/util/AsyncClientOptionsUtils.java`
#### Snippet
```java
    public Map<String, String> getProcessedResolvedOptions() {
        Map<String, String> mappedResolvedOptions = super.getProcessedResolvedOptions();
        for (String key : resolvedOptions.keySet()) {
            if (key.startsWith(SINK_CLIENT_PREFIX)) {
                mappedResolvedOptions.put(translateClientKeys(key), resolvedOptions.get(key));
```

### KeySetIterationMayUseEntrySet
Iteration over `resolvedOptions.keySet()` may be replaced with 'entrySet()' iteration
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisConsumerOptionsUtil.java`
#### Snippet
```java
    public Map<String, String> getProcessedResolvedOptions() {
        Map<String, String> mappedResolvedOptions = super.getProcessedResolvedOptions();
        for (String key : resolvedOptions.keySet()) {
            if (key.startsWith(CONSUMER_PREFIX)) {
                mappedResolvedOptions.put(translateConsumerKey(key), resolvedOptions.get(key));
```

## RuleId[ruleID=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
        maxEmitTimestamp = watermark + maxLookaheadMillis;
        synchronized (condition) {
            condition.notify();
        }
        LOG.info(
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
            queue.put(record);
            synchronized (condition) {
                condition.notify();
            }
        }
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/DynamoDBStreamsShardHandle.java`
#### Snippet
```java
     */
    public static boolean isValidShardId(String shardId) {
        return shardId == null ? false : shardId.matches("^shardId-\\d{20}-{0,1}\\w{0,36}");
    }
}
```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
     */
    public static boolean isValidRegion(String region) {
        return Pattern.matches("^[a-z]+-([a-z]+[-]{0,1}[a-z]+-([0-9]|global)|global)$", region);
    }

```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
     */
    public static boolean isValidRegion(String region) {
        return Pattern.matches("^[a-z]+-([a-z]+[-]{0,1}[a-z]+-([0-9]|global)|global)$", region);
    }

```

### RegExpSimplifiable
`[-]` can be simplified to '-'
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
    public static boolean isValidRegion(Region region) {
        return Pattern.matches(
                "^[a-z]+-([a-z]+[-]{0,1}[a-z]+-([0-9]|global)|global)$", region.id());
    }

```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
    public static boolean isValidRegion(Region region) {
        return Pattern.matches(
                "^[a-z]+-([a-z]+[-]{0,1}[a-z]+-([0-9]|global)|global)$", region.id());
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`badKeyNames.size() == 0` can be replaced with 'badKeyNames.isEmpty()'
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/RowDataFieldsKinesisPartitionKeyGenerator.java`
#### Snippet
```java

        Preconditions.checkArgument(
                badKeyNames.size() == 0,
                "The following partition keys are not present in the table: %s",
                String.join(", ", badKeyNames));
```

### SizeReplaceableByIsEmpty
`badKeyTypes.size() == 0` can be replaced with 'badKeyTypes.isEmpty()'
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/RowDataFieldsKinesisPartitionKeyGenerator.java`
#### Snippet
```java
                String.join(", ", badKeyNames));
        Preconditions.checkArgument(
                badKeyTypes.size() == 0,
                "The following partition keys have types that are not supported by Kinesis: %s",
                String.join(", ", badKeyTypes));
```

### SizeReplaceableByIsEmpty
`retrievedShards.size() != 0` can be replaced with '!retrievedShards.isEmpty()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/GetShardListResult.java`
#### Snippet
```java

    public void addRetrievedShardsToStream(String stream, List<StreamShardHandle> retrievedShards) {
        if (retrievedShards.size() != 0) {
            if (!streamsToRetrievedShardList.containsKey(stream)) {
                streamsToRetrievedShardList.put(stream, new LinkedList<StreamShardHandle>());
```

### SizeReplaceableByIsEmpty
`requestedMetadataFields.size() > 0` can be replaced with '!requestedMetadataFields.isEmpty()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisDynamicSource.java`
#### Snippet
```java
        KinesisDeserializationSchema<RowData> deserializationSchema;

        if (requestedMetadataFields.size() > 0) {
            deserializationSchema =
                    new RowDataKinesisDeserializationSchema(
```

### SizeReplaceableByIsEmpty
`streams.size() != 0` can be replaced with '!streams.isEmpty()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
            Properties configProps) {
        checkNotNull(streams, "streams can not be null");
        checkArgument(streams.size() != 0, "must be consuming at least 1 stream");
        checkArgument(!streams.contains(""), "stream names cannot be empty Strings");
        this.streams = streams;
```

### SizeReplaceableByIsEmpty
`shards.size() != 0` can be replaced with '!shards.isEmpty()'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/DynamoDBStreamsProxy.java`
#### Snippet
```java
            }

            if (shards.size() != 0) {
                lastSeenShardId = shards.get(shards.size() - 1).getShardId();
            }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
            LOG.info(
                    "Flink Kinesis Consumer is going to read the following streams: {}",
                    sb.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
                                        + " starting state set to the restored sequence number {}",
                                getRuntimeContext().getIndexOfThisSubtask(),
                                shard.toString(),
                                sequenceNumsToRestore.get(kinesisStreamShard));
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
                                        + " starting state set to the SENTINEL_EARLIEST_SEQUENCE_NUM",
                                getRuntimeContext().getIndexOfThisSubtask(),
                                shard.toString());
                    }
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
                            "Subtask {} will be seeded with initial shard {}, starting state set as sequence number {}",
                            getRuntimeContext().getIndexOfThisSubtask(),
                            shard.toString(),
                            startingSeqNum.get());
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
            throw new IllegalArgumentException(
                    "Invalid AWS Credential Provider Type set in config. Valid values are: "
                            + sb.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
                }
                throw new IllegalArgumentException(
                        "Invalid AWS region set in config. Valid values are: " + sb.toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
                    "Subtask {} has failed to find any shards for the following subscribed streams: {}",
                    indexOfThisConsumerSubtask,
                    streamsWithNoShardsFound.toString());
        }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java

    private void handlePartiallyUnprocessedRequest(
            BatchWriteItemResponse response, Consumer<List<DynamoDbWriteRequest>> requestResult) {
        List<DynamoDbWriteRequest> unprocessed = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends DynamoDbAsyncClient`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java
            String tableName,
            List<String> overwriteByPartitionKeys,
            SdkClientProvider<DynamoDbAsyncClient> clientProvider,
            Collection<BufferedRequestState<DynamoDbWriteRequest>> states) {
        super(
```

### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java
            Throwable err,
            List<DynamoDbWriteRequest> requestEntries,
            Consumer<List<DynamoDbWriteRequest>> requestResult) {
        LOG.warn(
                "DynamoDB Sink failed to persist and will retry {} entries.",
```

### BoundedWildcard
Can generalize to `? extends ConfigOption`
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java
        }

        public static Set<ConfigOption<?>> addDeprecatedKeys(Set<ConfigOption<?>> tableOptions) {
            HashSet<ConfigOption<?>> tableOptionsWithDeprecatedKeys = new HashSet<>(tableOptions);

```

### BoundedWildcard
Can generalize to `? super OUT`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
     *     credentials and AWS region
     */
    public FlinkKinesisProducer(KinesisSerializationSchema<OUT> schema, Properties configProps) {
        checkNotNull(configProps, "configProps can not be null");
        this.configProps = KinesisConfigUtil.replaceDeprecatedProducerKeys(configProps);
```

### BoundedWildcard
Can generalize to `? super OUT`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
    }

    public void setCustomPartitioner(KinesisPartitioner<OUT> partitioner) {
        checkNotNull(partitioner, "partitioner cannot be null");
        checkArgument(
```

### BoundedWildcard
Can generalize to `? super OUT`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
     *     credentials and AWS region
     */
    public FlinkKinesisProducer(final SerializationSchema<OUT> schema, Properties configProps) {

        // create a simple wrapper for the serialization schema
```

### BoundedWildcard
Can generalize to `? super InputT`
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkElementConverter.java`
#### Snippet
```java
    private final SerializationSchema<InputT> serializationSchema;

    private KinesisFirehoseSinkElementConverter(SerializationSchema<InputT> serializationSchema) {
        this.serializationSchema = serializationSchema;
    }
```

### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkWriter.java`
#### Snippet
```java

    private void handleFullyFailedRequest(
            Throwable err, List<Record> requestEntries, Consumer<List<Record>> requestResult) {
        LOG.debug(
                "KDF Sink failed to write and will retry {} entries to KDF first request was {}",
```

### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkWriter.java`
#### Snippet
```java
            PutRecordBatchResponse response,
            List<Record> requestEntries,
            Consumer<List<Record>> requestResult) {
        LOG.debug(
                "KDF Sink failed to write and will retry {} entries to KDF first request was {}",
```

### BoundedWildcard
Can generalize to `? extends StreamShardHandle`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/GetShardListResult.java`
#### Snippet
```java
    }

    public void addRetrievedShardsToStream(String stream, List<StreamShardHandle> retrievedShards) {
        if (retrievedShards.size() != 0) {
            if (!streamsToRetrievedShardList.containsKey(stream)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverter.java`
#### Snippet
```java

    public ArrayAttributeConverter(
            AttributeConverter<T> tAttributeConverter, EnhancedType<T[]> enhancedType) {
        this.tAttributeConverter = tAttributeConverter;
        this.enhancedType = enhancedType;
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/ShardConsumer.java`
#### Snippet
```java
            SequenceNumber lastSequenceNum,
            ShardConsumerMetricsReporter shardConsumerMetricsReporter,
            KinesisDeserializationSchema<T> shardDeserializer) {
        this.fetcherRef = checkNotNull(fetcherRef);
        this.recordPublisher = checkNotNull(recordPublisher);
```

### BoundedWildcard
Can generalize to `? super SubscribeToShardEvent`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
     */
    private boolean consumeAllRecordsFromKinesisShard(
            final Consumer<SubscribeToShardEvent> eventConsumer,
            final FanOutShardSubscription subscription)
            throws InterruptedException, FanOutSubscriberException {
```

### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkWriter.java`
#### Snippet
```java
            Throwable err,
            List<PutRecordsRequestEntry> requestEntries,
            Consumer<List<PutRecordsRequestEntry>> requestResult) {
        LOG.debug(
                "KDS Sink failed to write and will retry {} entries to KDS",
```

### BoundedWildcard
Can generalize to `? super List`
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkWriter.java`
#### Snippet
```java
            PutRecordsResponse response,
            List<PutRecordsRequestEntry> requestEntries,
            Consumer<List<PutRecordsRequestEntry>> requestResult) {
        LOG.debug(
                "KDS Sink failed to write and will retry {} entries to KDS",
```

### BoundedWildcard
Can generalize to `? super InputT`
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkElementConverter.java`
#### Snippet
```java

    private KinesisStreamsSinkElementConverter(
            SerializationSchema<InputT> serializationSchema,
            PartitionKeyGenerator<InputT> partitionKeyGenerator) {
        this.serializationSchema = serializationSchema;
```

### BoundedWildcard
Can generalize to `? super InputT`
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkElementConverter.java`
#### Snippet
```java
    private KinesisStreamsSinkElementConverter(
            SerializationSchema<InputT> serializationSchema,
            PartitionKeyGenerator<InputT> partitionKeyGenerator) {
        this.serializationSchema = serializationSchema;
        this.partitionKeyGenerator = partitionKeyGenerator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
     * record, when a watermark assigner was configured.
     */
    private void emitRecordAndUpdateState(RecordWrapper<T> rw) {
        synchronized (checkpointLock) {
            if (rw.getValue() != null) {
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisherConfiguration.java`
#### Snippet
```java
     * EAGER.
     */
    @Nullable private String consumerName;

    /** A map of stream to stream consumer ARN for EFO subscriptions. */
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
     */
    @SuppressWarnings("StatementWithEmptyBody")
    public void awaitTermination() throws InterruptedException {
        while (!shardConsumersExecutor.awaitTermination(1, TimeUnit.MINUTES)) {
            // Keep waiting.
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/Event.java`
#### Snippet
```java
    public static Event fromString(String eventStr) {
        String[] split = eventStr.split(",");
        return new Event(split[0], Integer.valueOf(split[1]), Long.valueOf(split[2]));
    }

```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/Event.java`
#### Snippet
```java
    public static Event fromString(String eventStr) {
        String[] split = eventStr.split(",");
        return new Event(split[0], Integer.valueOf(split[1]), Long.valueOf(split[2]));
    }

```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/util/DynamoDbSerializationUtil.java`
#### Snippet
```java
                int length = in.readInt();
                byte[] bytes = new byte[length];
                in.read(bytes);
                return AttributeValue.builder().b(SdkBytes.fromByteArray(bytes)).build();
            case STRING_SET:
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/util/DynamoDbSerializationUtil.java`
#### Snippet
```java
                    int byteLength = in.readInt();
                    byte[] bs = new byte[byteLength];
                    in.read(bs);
                    byteSet.add(SdkBytes.fromByteArray(bs));
                }
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseStateSerializer.java`
#### Snippet
```java
            throws IOException {
        byte[] requestData = new byte[(int) requestSize];
        in.read(requestData);
        return Record.builder().data(SdkBytes.fromByteArray(requestData)).build();
    }
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsStateSerializer.java`
#### Snippet
```java
            long requestSize, DataInputStream in) throws IOException {
        byte[] requestData = new byte[(int) requestSize];
        in.read(requestData);

        return PutRecordsRequestEntry.builder()
```

### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsStateSerializer.java`
#### Snippet
```java
        int partitionKeyLength = in.readInt();
        byte[] requestPartitionKeyData = new byte[(int) partitionKeyLength];
        in.read(requestPartitionKeyData);
        return new String(requestPartitionKeyData, StandardCharsets.UTF_8);
    }
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java
        // "The program didn't contain a Flink job. Perhaps you forgot to call execute() on the
        // execution environment."
        System.out.println("test finished");
        System.exit(0);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java

        if (parameterTool.getNumberOfParameters() < 5) {
            System.out.println(
                    "Missing parameters!\n"
                            + "Usage: Kafka --input-topic <topic> --output-topic <topic> "
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `AWSConfigConstants` is the same as one of its superclass' names
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/AWSConfigConstants.java`
#### Snippet
```java
 */
@PublicEvolving
public class AWSConfigConstants extends org.apache.flink.connector.aws.config.AWSConfigConstants {}

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/DynamoDBStreamsShardHandle.java`
#### Snippet
```java
     */
    public static boolean isValidShardId(String shardId) {
        return shardId == null ? false : shardId.matches("^shardId-\\d{20}-{0,1}\\w{0,36}");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/table/util/AWSOptionUtils.java`
#### Snippet
```java
    private static String translateAwsKey(String key) {
        if (!key.endsWith("credentials.provider")) {
            return key.replace("credentials.", "credentials.provider.");
        } else {
            return key;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisConsumerOptionsUtil.java`
#### Snippet
```java

        if (result.endsWith("initpos-timestamp-format")) {
            return result.replace("initpos-timestamp-format", "initpos.timestamp.format");
        } else if (result.endsWith("initpos-timestamp")) {
            return result.replace("initpos-timestamp", "initpos.timestamp");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisConsumerOptionsUtil.java`
#### Snippet
```java
            return result.replace("initpos-timestamp-format", "initpos.timestamp.format");
        } else if (result.endsWith("initpos-timestamp")) {
            return result.replace("initpos-timestamp", "initpos.timestamp");
        } else {
            return result;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java

        Optional.ofNullable(failOnError).ifPresent(builder::setFailOnError);
        super.addAsyncOptionsToSinkBuilder(builder);

        return SinkV2Provider.of(builder.build());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
    public void open(RuntimeContext context) {
        super.open(context);
        this.aggregateFunction.updateTimeoutMillis = super.getUpdateTimeoutMillis();
        this.aggregateFunction.logAccumulatorIntervalMillis = logAccumulatorIntervalMillis;
        Preconditions.checkArgument(context instanceof StreamingRuntimeContext);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/AdaptivePollingRecordPublisher.java`
#### Snippet
```java
            throws InterruptedException {
        final RecordPublisherRunResult result =
                super.run(
                        batch -> {
                            SequenceNumber latestSequenceNumber = consumer.accept(batch);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicTableFactory.java`
#### Snippet
```java
        Optional.ofNullable((Boolean) properties.get(SINK_FAIL_ON_ERROR.key()))
                .ifPresent(builder::setFailOnError);
        return super.addAsyncOptionsToBuilder(properties, builder).build();
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.amazonaws.services.kinesis.model` is unnecessary and can be removed
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/StreamShardHandle.java`
#### Snippet
```java
/**
 * A wrapper class around the information provided along with streamName and {@link
 * com.amazonaws.services.kinesis.model.Shard}, with some extra utility methods to determine whether
 * or not a shard is closed and whether or not the shard is a result of parent shard splits or
 * merges.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.amazonaws.services.kinesis.model` is unnecessary and can be removed
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/KinesisStreamShard.java`
#### Snippet
```java
 * A legacy serializable representation of a AWS Kinesis Stream shard. It is basically a wrapper
 * class around the information provided along with {@link
 * com.amazonaws.services.kinesis.model.Shard}.
 *
 * @deprecated Will be remove in a future version in favor of {@link StreamShardHandle}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.streaming.connectors.kinesis.config` is unnecessary and can be removed
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ProducerConfigConstants.java`
#### Snippet
```java
 *     here</a> for the full list of available configs. For configuring the region and credentials,
 *     please use the keys in {@link
 *     org.apache.flink.streaming.connectors.kinesis.config.AWSConfigConstants}.
 */
@Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common` is unnecessary and can be removed
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
 * #setPeriodicWatermarkAssigner(AssignerWithPeriodicWatermarks)} and the auto watermark emit
 * interval configured via {@link
 * org.apache.flink.api.common.ExecutionConfig#setAutoWatermarkInterval(long)}.
 *
 * <p>Watermarks can only advance when all shards of a subtask continuously deliver records. To
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
            WatermarkState ws = accumulator.get(value.id);
            if (ws == null) {
                accumulator.put(value.id, ws = new WatermarkState());
            }
            ws.watermark = value.watermark;
```

### NestedAssignment
Result of assignment expression used
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
            T record;
            int emitCount = 0;
            while ((record = min.queue.poll()) != null) {
                emit(record, min);
                // track last record emitted, even when queue becomes empty
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `RecordEmitter()` of an abstract class should not be declared 'public'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
    private final Object condition = new Object();

    public RecordEmitter(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FlinkKinesisException()` of an abstract class should not be declared 'public'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisException.java`
#### Snippet
```java
    }

    public FlinkKinesisException(final String message, final Throwable cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FlinkKinesisException()` of an abstract class should not be declared 'public'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisException.java`
#### Snippet
```java
public abstract class FlinkKinesisException extends RuntimeException {

    public FlinkKinesisException(final String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardConsumerException()` of an abstract class should not be declared 'public'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/ShardConsumer.java`
#### Snippet
```java
        private static final long serialVersionUID = 7732343624482321663L;

        public ShardConsumerException(final String message) {
            super(message);
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `FanOutSubscriberException()` of an abstract class should not be declared 'public'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
        private static final long serialVersionUID = -3899472233945299730L;

        public FanOutSubscriberException(Throwable cause) {
            super(cause);
        }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `shardWatermarks` is accessed in both synchronized and unsynchronized contexts
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
     * different shard index keys, since those are transient and not part of checkpointed state.
     */
    private ConcurrentHashMap<Integer, ShardWatermarkState> shardWatermarks =
            new ConcurrentHashMap<>();

```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/GetShardListResult.java`
#### Snippet
```java

    public List<StreamShardHandle> getRetrievedShardListOfStream(String stream) {
        if (!streamsToRetrievedShardList.containsKey(stream)) {
            return null;
        } else {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
                    // it runs in a separate thread since main thread is used for discovery
                    Runnable recordEmitterRunnable =
                            new Runnable() {
                                @Override
                                public void run() {
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/util/KinesisFirehoseConnectorOptionUtils.java`
#### Snippet
```java
    public Properties getSinkProperties() {
        Properties properties = asyncSinkConfigurationValidator.getValidatedConfigurations();
        properties.put(DELIVERY_STREAM.key(), tableOptions.get(DELIVERY_STREAM));
        Properties kinesisClientProps = asyncClientOptionsUtils.getValidatedConfigurations();
        properties.put(FIREHOSE_CLIENT_PROPERTIES_KEY, kinesisClientProps);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/util/KinesisFirehoseConnectorOptionUtils.java`
#### Snippet
```java
        properties.put(DELIVERY_STREAM.key(), tableOptions.get(DELIVERY_STREAM));
        Properties kinesisClientProps = asyncClientOptionsUtils.getValidatedConfigurations();
        properties.put(FIREHOSE_CLIENT_PROPERTIES_KEY, kinesisClientProps);
        if (tableOptions.getOptional(SINK_FAIL_ON_ERROR).isPresent()) {
            properties.put(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/util/KinesisFirehoseConnectorOptionUtils.java`
#### Snippet
```java
        properties.put(FIREHOSE_CLIENT_PROPERTIES_KEY, kinesisClientProps);
        if (tableOptions.getOptional(SINK_FAIL_ON_ERROR).isPresent()) {
            properties.put(
                    SINK_FAIL_ON_ERROR.key(), tableOptions.getOptional(SINK_FAIL_ON_ERROR).get());
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkBuilder.java`
#### Snippet
```java
        Properties clientProperties =
                Optional.ofNullable(firehoseClientProperties).orElse(new Properties());
        clientProperties.putIfAbsent(HTTP_PROTOCOL_VERSION, DEFAULT_HTTP_PROTOCOL.toString());
        return clientProperties;
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
                new KinesisDynamicSink.KinesisDynamicTableSinkBuilder();

        builder.setStream((String) properties.get(STREAM.key()))
                .setKinesisClientProperties(
                        (Properties) properties.get(KINESIS_CLIENT_PROPERTIES_KEY))
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
        builder.setStream((String) properties.get(STREAM.key()))
                .setKinesisClientProperties(
                        (Properties) properties.get(KINESIS_CLIENT_PROPERTIES_KEY))
                .setEncodingFormat(factoryContext.getEncodingFormat())
                .setConsumedDataType(factoryContext.getPhysicalDataType())
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
                .setConsumedDataType(factoryContext.getPhysicalDataType())
                .setPartitioner(
                        (PartitionKeyGenerator<RowData>) properties.get(SINK_PARTITIONER.key()));
        addAsyncOptionsToBuilder(properties, builder);
        Optional.ofNullable((Boolean) properties.get(SINK_FAIL_ON_ERROR.key()))
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
                        (PartitionKeyGenerator<RowData>) properties.get(SINK_PARTITIONER.key()));
        addAsyncOptionsToBuilder(properties, builder);
        Optional.ofNullable((Boolean) properties.get(SINK_FAIL_ON_ERROR.key()))
                .ifPresent(builder::setFailOnError);
        return builder.build();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java
    public Properties getValidatedSinkConfigurations() {
        Properties properties = asyncSinkconfigurationValidator.getValidatedConfigurations();
        properties.put(STREAM.key(), tableOptions.get(STREAM));
        Properties kinesisClientProps = asyncClientOptionsUtils.getValidatedConfigurations();

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java
        Properties kinesisClientProps = asyncClientOptionsUtils.getValidatedConfigurations();

        properties.put(KINESIS_CLIENT_PROPERTIES_KEY, kinesisClientProps);
        properties.put(SINK_PARTITIONER.key(), this.partitioner);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java

        properties.put(KINESIS_CLIENT_PROPERTIES_KEY, kinesisClientProps);
        properties.put(SINK_PARTITIONER.key(), this.partitioner);

        if (tableOptions.getOptional(SINK_FAIL_ON_ERROR).isPresent()) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java

        if (tableOptions.getOptional(SINK_FAIL_ON_ERROR).isPresent()) {
            properties.put(
                    SINK_FAIL_ON_ERROR.key(), tableOptions.getOptional(SINK_FAIL_ON_ERROR).get());
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AwsV2Util.java`
#### Snippet
```java

    public static boolean isUsingEfoRecordPublisher(final Properties properties) {
        return EFO.name().equals(properties.get(RECORD_PUBLISHER_TYPE));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AwsV2Util.java`
#### Snippet
```java

    public static boolean isEagerEfoRegistrationType(final Properties properties) {
        return EAGER.name().equals(properties.get(EFO_REGISTRATION_TYPE));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AwsV2Util.java`
#### Snippet
```java

    public static boolean isNoneEfoRegistrationType(final Properties properties) {
        return NONE.name().equals(properties.get(EFO_REGISTRATION_TYPE));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
        Properties producerProperties = new Properties(parameterTool.getProperties());
        // producer needs region even when URL is specified
        producerProperties.putIfAbsent(ConsumerConfigConstants.AWS_REGION, "us-east-1");
        // test driver does not deaggregate
        producerProperties.putIfAbsent("AggregationEnabled", String.valueOf(false));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
        producerProperties.putIfAbsent(ConsumerConfigConstants.AWS_REGION, "us-east-1");
        // test driver does not deaggregate
        producerProperties.putIfAbsent("AggregationEnabled", String.valueOf(false));

        // KPL does not recognize endpoint URL..
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
        if (kinesisUrl != null) {
            URL url = new URL(kinesisUrl);
            producerProperties.put("KinesisEndpoint", url.getHost());
            producerProperties.put("KinesisPort", Integer.toString(url.getPort()));
            producerProperties.put("VerifyCertificate", "false");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
            URL url = new URL(kinesisUrl);
            producerProperties.put("KinesisEndpoint", url.getHost());
            producerProperties.put("KinesisPort", Integer.toString(url.getPort()));
            producerProperties.put("VerifyCertificate", "false");
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
            producerProperties.put("KinesisEndpoint", url.getHost());
            producerProperties.put("KinesisPort", Integer.toString(url.getPort()));
            producerProperties.put("VerifyCertificate", "false");
        }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/client/DynamoDbAsyncClientProvider.java`
#### Snippet
```java

        // Specify HTTP1_1 protocol since DynamoDB endpoint doesn't support HTTP2
        overridenProperties.putIfAbsent(AWSConfigConstants.HTTP_PROTOCOL_VERSION, "HTTP1_1");
        return overridenProperties;
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicTableFactory.java`
#### Snippet
```java
        Properties properties = optionsUtils.getSinkProperties();

        builder.setDeliveryStream((String) properties.get(DELIVERY_STREAM.key()))
                .setFirehoseClientProperties(
                        (Properties) properties.get(FIREHOSE_CLIENT_PROPERTIES_KEY))
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicTableFactory.java`
#### Snippet
```java
        builder.setDeliveryStream((String) properties.get(DELIVERY_STREAM.key()))
                .setFirehoseClientProperties(
                        (Properties) properties.get(FIREHOSE_CLIENT_PROPERTIES_KEY))
                .setEncodingFormat(factoryContext.getEncodingFormat())
                .setConsumedDataType(factoryContext.getPhysicalDataType());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicTableFactory.java`
#### Snippet
```java
                .setEncodingFormat(factoryContext.getEncodingFormat())
                .setConsumedDataType(factoryContext.getPhysicalDataType());
        Optional.ofNullable((Boolean) properties.get(SINK_FAIL_ON_ERROR.key()))
                .ifPresent(builder::setFailOnError);
        return super.addAsyncOptionsToBuilder(properties, builder).build();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
    public static AwsCredentialsProvider getCredentialsProvider(final Map<String, ?> configProps) {
        Properties properties = new Properties();
        properties.putAll(configProps);

        return getCredentialsProvider(properties);
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/KinesisPartitioner.java`
#### Snippet
```java
     * @param numberOfParallelSubtasks Total number of parallel instances
     */
    public void initialize(int indexOfThisSubtask, int numberOfParallelSubtasks) {}

    @Override
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java
        private Properties firehoseClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private Boolean failOnError = null;

        public KinesisFirehoseDynamicSinkBuilder setConsumedDataType(DataType consumedDataType) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java
        private DataType consumedDataType = null;
        private String deliveryStream = null;
        private Properties firehoseClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private Boolean failOnError = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java
            extends AsyncDynamicTableSinkBuilder<Record, KinesisFirehoseDynamicSinkBuilder> {

        private DataType consumedDataType = null;
        private String deliveryStream = null;
        private Properties firehoseClientProperties = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java
        private String deliveryStream = null;
        private Properties firehoseClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private Boolean failOnError = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicSink.java`
#### Snippet
```java

        private DataType consumedDataType = null;
        private String deliveryStream = null;
        private Properties firehoseClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/RowDataFieldsKinesisPartitionKeyGenerator.java`
#### Snippet
```java
     * RowDataFieldsKinesisPartitionKeyGenerator#staticFields}).
     */
    private int keyBufferStaticPrefixLength = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/RowDataFieldsKinesisPartitionKeyGenerator.java`
#### Snippet
```java
     * RowDataFieldsKinesisPartitionKeyGenerator#staticFields}.
     */
    private int fieldNamesStaticPrefixLength = 0;

    public RowDataFieldsKinesisPartitionKeyGenerator(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/JobManagerWatermarkTracker.java`
#### Snippet
```java
    protected static class WatermarkResult implements Serializable {
        protected long watermark = Long.MIN_VALUE;
        protected long updateTimeoutCount = 0;
    }

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/FixedKinesisPartitionKeyGenerator.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private int indexOfThisSubtask = 0;

    public void initialize(int indexOfThisSubtask, int numberOfParallelSubtasks) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisher.java`
#### Snippet
```java

    /** The current attempt in the case of subsequent recoverable errors. */
    private int attempt = 0;

    private StartingPosition nextStartingPosition;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java

    /* Optional custom partitioner */
    private KinesisPartitioner<OUT> customPartitioner = null;

    // --------------------------- Runtime fields ---------------------------
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java

    /* Flag controlling the error behavior of the producer */
    private boolean failOnError = false;

    /* Maximum length of the internal record queue before backpressuring */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkElementConverter.java`
#### Snippet
```java
public class KinesisFirehoseSinkElementConverter<InputT>
        implements ElementConverter<InputT, Record> {
    private boolean schemaOpened = false;

    /** A serialization schema to specify how the input element should be serialized. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/AdaptivePollingRecordPublisher.java`
#### Snippet
```java
    private static final long KINESIS_SHARD_BYTES_PER_SECOND_LIMIT = 2 * 1024L * 1024L;

    private int lastRecordBatchSize = 0;

    private long lastRecordBatchSizeInBytes = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/AdaptivePollingRecordPublisher.java`
#### Snippet
```java
    private int lastRecordBatchSize = 0;

    private long lastRecordBatchSizeInBytes = 0;

    private long processingStartTimeNanos = System.nanoTime();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/ShardConsumerMetricsReporter.java`
#### Snippet
```java
    private volatile long averageRecordSizeBytes = 0L;
    private volatile int numberOfAggregatedRecords = 0;
    private volatile int numberOfDeaggregatedRecords = 0;

    public ShardConsumerMetricsReporter(final MetricGroup metricGroup) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/ShardConsumerMetricsReporter.java`
#### Snippet
```java
    private volatile long millisBehindLatest = -1;
    private volatile long averageRecordSizeBytes = 0L;
    private volatile int numberOfAggregatedRecords = 0;
    private volatile int numberOfDeaggregatedRecords = 0;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/ShardConsumerMetricsReporter.java`
#### Snippet
```java

    private volatile long millisBehindLatest = -1;
    private volatile long averageRecordSizeBytes = 0L;
    private volatile int numberOfAggregatedRecords = 0;
    private volatile int numberOfDeaggregatedRecords = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
        private String stream = null;
        private Properties kinesisClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private PartitionKeyGenerator<RowData> partitioner = null;
        private Boolean failOnError = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
        private Properties kinesisClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private PartitionKeyGenerator<RowData> partitioner = null;
        private Boolean failOnError = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java

        private DataType consumedDataType = null;
        private String stream = null;
        private Properties kinesisClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private PartitionKeyGenerator<RowData> partitioner = null;
        private Boolean failOnError = null;

        public KinesisDynamicTableSinkBuilder setConsumedDataType(DataType consumedDataType) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
        private DataType consumedDataType = null;
        private String stream = null;
        private Properties kinesisClientProperties = null;
        private EncodingFormat<SerializationSchema<RowData>> encodingFormat = null;
        private PartitionKeyGenerator<RowData> partitioner = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
                    PutRecordsRequestEntry, KinesisDynamicTableSinkBuilder> {

        private DataType consumedDataType = null;
        private String stream = null;
        private Properties kinesisClientProperties = null;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/PollingRecordPublisherMetricsReporter.java`
#### Snippet
```java

    private volatile double loopFrequencyHz = 0.0;
    private volatile double bytesPerRead = 0.0;
    private volatile long runLoopTimeNanos = 0L;
    private volatile long sleepTimeMillis = 0L;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/PollingRecordPublisherMetricsReporter.java`
#### Snippet
```java
    private volatile long runLoopTimeNanos = 0L;
    private volatile long sleepTimeMillis = 0L;
    private volatile int maxNumberOfRecordsPerFetch = 0;

    public PollingRecordPublisherMetricsReporter(final MetricGroup metricGroup) {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/PollingRecordPublisherMetricsReporter.java`
#### Snippet
```java
    private volatile double loopFrequencyHz = 0.0;
    private volatile double bytesPerRead = 0.0;
    private volatile long runLoopTimeNanos = 0L;
    private volatile long sleepTimeMillis = 0L;
    private volatile int maxNumberOfRecordsPerFetch = 0;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/PollingRecordPublisherMetricsReporter.java`
#### Snippet
```java
public class PollingRecordPublisherMetricsReporter {

    private volatile double loopFrequencyHz = 0.0;
    private volatile double bytesPerRead = 0.0;
    private volatile long runLoopTimeNanos = 0L;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/metrics/PollingRecordPublisherMetricsReporter.java`
#### Snippet
```java
    private volatile double bytesPerRead = 0.0;
    private volatile long runLoopTimeNanos = 0L;
    private volatile long sleepTimeMillis = 0L;
    private volatile int maxNumberOfRecordsPerFetch = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
        private Subscription subscription;

        private volatile boolean cancelled = false;

        private final CountDownLatch waitForSubscriptionLatch;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkElementConverter.java`
#### Snippet
```java
    private final PartitionKeyGenerator<InputT> partitionKeyGenerator;

    private boolean schemaOpened = false;

    private KinesisStreamsSinkElementConverter(
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
        private long lastGlobalWatermark = Long.MIN_VALUE;
        private long propagatedLocalWatermark = Long.MIN_VALUE;
        private int stalledWatermarkIntervalCount = 0;
        private long lastLogged;

```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `shardItr`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/PollingRecordPublisher.java`
#### Snippet
```java
                        subscribedShard);

                shardItr = getShardIterator();

                // sleep for the fetch interval before the next getRecords attempt with the
```

### AssignmentToMethodParameter
Assignment to method parameter `maxNumberOfRecordsPerFetch`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/AdaptivePollingRecordPublisher.java`
#### Snippet
```java
            double loopFrequencyHz = 1000000000.0d / runLoopTimeNanos;
            double bytesPerRead = KINESIS_SHARD_BYTES_PER_SECOND_LIMIT / loopFrequencyHz;
            maxNumberOfRecordsPerFetch = (int) (bytesPerRead / averageRecordSizeBytes);
            // Ensure the value is greater than 0 and not more than 10000L
            maxNumberOfRecordsPerFetch =
```

### AssignmentToMethodParameter
Assignment to method parameter `maxNumberOfRecordsPerFetch`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/AdaptivePollingRecordPublisher.java`
#### Snippet
```java
            maxNumberOfRecordsPerFetch = (int) (bytesPerRead / averageRecordSizeBytes);
            // Ensure the value is greater than 0 and not more than 10000L
            maxNumberOfRecordsPerFetch =
                    Math.max(
                            1,
```

### AssignmentToMethodParameter
Assignment to method parameter `lastSeenShardId`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/DynamoDBStreamsProxy.java`
#### Snippet
```java

            if (shards.size() != 0) {
                lastSeenShardId = shards.get(shards.size() - 1).getShardId();
            }
        } while (describeStreamResult.getStreamDescription().isHasMoreShards());
```

### AssignmentToMethodParameter
Assignment to method parameter `recordTimestamp`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
        Watermark watermark = null;
        if (sws.periodicWatermarkAssigner != null) {
            recordTimestamp =
                    sws.periodicWatermarkAssigner.extractTimestamp(record, sws.lastRecordTimestamp);
            // track watermark per record since extractTimestamp has side effect
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/KinesisPartitioner.java`
#### Snippet
```java
 */
@PublicEvolving
public abstract class KinesisPartitioner<T> implements Serializable, PartitionKeyGenerator<T> {

    private static final long serialVersionUID = -7467294664702189780L;
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/KinesisPartitioner.java`
#### Snippet
```java
     */
    public String getExplicitHashKey(T element) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
                    @Override
                    public String getTargetStream(OUT element) {
                        return null;
                    }
                },
```

### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/GetShardListResult.java`
#### Snippet
```java
    public StreamShardHandle getLastSeenShardOfStream(String stream) {
        if (!streamsToRetrievedShardList.containsKey(stream)) {
            return null;
        } else {
            return streamsToRetrievedShardList.get(stream).getLast();
```

### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/GetShardListResult.java`
#### Snippet
```java
    public List<StreamShardHandle> getRetrievedShardListOfStream(String stream) {
        if (!streamsToRetrievedShardList.containsKey(stream)) {
            return null;
        } else {
            return streamsToRetrievedShardList.get(stream);
```

### ReturnNull
Return of `null`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Instant.class, enhancedType);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/DynamoDBStreamsProxy.java`
#### Snippet
```java
                    shard.getShard().getShardId(),
                    shard.getStreamName());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
                                @Override
                                public RecordWrapper<T> peek() {
                                    return null;
                                }
                            });
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
    /** Summary of emit queues that can be used for logging. */
    public String printInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("queues: %d, empty: %d", queues.size(), emptyQueues.size()));
        for (Map.Entry<Integer, AsyncRecordQueue<T>> e : queues.entrySet()) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
        factoryContext
                .getFactoryHelper()
                .validateExcept(optionsUtils.getNonValidatedPrefixes().toArray(new String[0]));

        // Validate option values
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisDynamicTableFactory.java`
#### Snippet
```java

        // validate the data types of the table options
        helper.validateExcept(optionsUtils.getNonValidatedPrefixes().toArray(new String[0]));
        Properties properties = optionsUtils.getValidatedSourceConfigurations();

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/KinesisFirehoseDynamicTableFactory.java`
#### Snippet
```java
        factoryContext
                .getFactoryHelper()
                .validateExcept(optionsUtils.getNonValidatedPrefixes().toArray(new String[0]));
        Properties properties = optionsUtils.getSinkProperties();

```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisDynamicSource.java`
#### Snippet
```java
    /** List of read-only metadata fields that the source can provide upstream upon request. */
    private static final Map<String, DataType> READABLE_METADATA =
            new HashMap<String, DataType>() {
                {
                    for (Metadata metadata : Metadata.values()) {
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java
                && results.size() < messages.length) {
            LOG.info("waiting for results..");
            Thread.sleep(1000);
            results = pubsub.readAllMessages(outputStream);
        }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
            producer.flush();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                LOG.warn("Flushing was interrupted.");
```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/TimeoutLatch.java`
#### Snippet
```java
        synchronized (lock) {
            waiting = true;
            lock.wait(timeout);
        }
    }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `globalWatermark` initializer `lastGlobalWatermark` is redundant
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
        public void onProcessingTime(long timestamp) {
            if (nextWatermark != Long.MIN_VALUE) {
                long globalWatermark = lastGlobalWatermark;
                if (!(isIdle && nextWatermark == propagatedLocalWatermark)) {
                    globalWatermark = watermarkTracker.updateWatermark(nextWatermark);
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/BeanDeserializerModifierForIgnorables.java`
#### Snippet
```java
        ignorables = new ArrayList<>();
        for (String property : properties) {
            ignorables.add(property);
        }
        this.type = clazz;
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `compareShardIds()` tries to override a static method of a superclass
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/DynamoDBStreamsShardHandle.java`
#### Snippet
```java
    }

    public static int compareShardIds(String firstShardId, String secondShardId) {
        if (!isValidShardId(firstShardId)) {
            throw new IllegalArgumentException(
```

### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/DynamoDBStreamsProxy.java`
#### Snippet
```java
     * @return the created DynamoDB streams proxy
     */
    public static KinesisProxyInterface create(Properties configProps) {
        return new DynamoDBStreamsProxy(configProps);
    }
```

